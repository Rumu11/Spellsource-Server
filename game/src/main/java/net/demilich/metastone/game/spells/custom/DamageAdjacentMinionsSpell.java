package net.demilich.metastone.game.spells.custom;

import com.github.fromage.quasi.fibers.Suspendable;
import net.demilich.metastone.game.GameContext;
import net.demilich.metastone.game.Player;
import net.demilich.metastone.game.entities.Actor;
import net.demilich.metastone.game.entities.Entity;
import net.demilich.metastone.game.spells.Spell;
import net.demilich.metastone.game.spells.desc.SpellArg;
import net.demilich.metastone.game.spells.desc.SpellDesc;

import java.util.Map;

public class DamageAdjacentMinionsSpell extends Spell {

	public static SpellDesc create() {
		Map<SpellArg, Object> arguments = new SpellDesc(DamageAdjacentMinionsSpell.class);
		return new SpellDesc(arguments);
	}

	@Override
	@Suspendable
	protected void onCast(GameContext context, Player player, SpellDesc desc, Entity source, Entity target) {
		Actor attacker = (Actor) target;
		for (Actor adjacentMinion : context.getAdjacentMinions(target.getReference())) {
			context.getLogic().damage(player, adjacentMinion, attacker.getAttack(), attacker);
		}
	}

}
