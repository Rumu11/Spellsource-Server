package net.demilich.metastone.game.spells.custom;

import com.github.fromage.quasi.fibers.Suspendable;
import net.demilich.metastone.game.GameContext;
import net.demilich.metastone.game.Player;
import net.demilich.metastone.game.cards.Card;
import net.demilich.metastone.game.entities.Entity;
import net.demilich.metastone.game.entities.minions.Minion;
import net.demilich.metastone.game.spells.Spell;
import net.demilich.metastone.game.spells.desc.SpellArg;
import net.demilich.metastone.game.spells.desc.SpellDesc;
import net.demilich.metastone.game.targeting.EntityReference;

import java.util.List;
import java.util.Map;

@Deprecated
public class SummonOneOneCopiesSpell extends Spell {

	public static SpellDesc create() {
		Map<SpellArg, Object> arguments = new SpellDesc(SummonOneOneCopiesSpell.class);
		return new SpellDesc(arguments);
	}

	@Override
	@Suspendable
	protected void onCast(GameContext context, Player player, SpellDesc desc, Entity source, Entity target) {
		List<Entity> otherMinions = context.resolveTarget(player, source, EntityReference.OTHER_FRIENDLY_MINIONS);
		for (Entity entity : otherMinions) {
			Minion minion = (Minion) entity;
			Card card = minion.getSourceCard();
			minion = card.summon();
			if (context.getLogic().summon(player.getId(), minion, null, -1, false)) {
				minion.setAttack(1);
				minion.setHp(1);
				minion.setMaxHp(1);
			}
		}
	}

}