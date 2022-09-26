package net.jorgev96.jroleitems.item.custom;

import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.Random;

public class RollDiceItem extends Item {
    public RollDiceItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (!level.isClientSide() && hand == InteractionHand.MAIN_HAND){
            OutPutInt(player);
            player.level.playSound(null, player.getX(), player.getY(), player.getZ(),
                    getDrinkingSound(), SoundSource.PLAYERS, 1.0f, 1.0f);
            player.getCooldowns().addCooldown(this, 60);
        }
        return super.use(level, player, hand);
    }

    private void OutPutInt(Player player){
        player.sendMessage(new TranslatableComponent("item.jroleitems.dice.output"  + RandomInt()) ,
                player.getUUID());
    }

    private int RandomInt(){
        Random random = new Random();
        int number = random.nextInt(5);
        return (number + 1);
    }
}
