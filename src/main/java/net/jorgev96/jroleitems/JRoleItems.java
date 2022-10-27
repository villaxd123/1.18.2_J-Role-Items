package net.jorgev96.jroleitems;

import com.mojang.logging.LogUtils;
import net.jorgev96.jroleitems.block.ModBlocks;
import net.jorgev96.jroleitems.item.ModItems;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(JRoleItems.MOD_ID)
public class JRoleItems
{
    public static final String MOD_ID = "jroleitems";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Add a comment
    public JRoleItems() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ANCESTRAL_DOOR_BLUE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ANCESTRAL_DOOR_ORANGE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ANCESTRAL_DOOR_PURPLE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ANCESTRAL_TRAPDOOR_BLUE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ANCESTRAL_TRAPDOOR_ORANGE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ANCESTRAL_TRAPDOOR_PURPLE.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ANCESTRAL_LEAVES_BLUE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ANCESTRAL_LEAVES_ORANGE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ANCESTRAL_LEAVES_PURPLE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ANCESTRAL_SAPLING_BLUE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ANCESTRAL_SAPLING_ORANGE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ANCESTRAL_SAPLING_PURPLE.get(), RenderType.cutout());

        // ModItemProperties.addCustomItemProperties();
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
