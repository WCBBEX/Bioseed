package com.bioseed;

import com.bioseed.block.BlockRegister;
import com.bioseed.callback.ConsumeFlesh;
import com.bioseed.item.ItemRegister;
import com.bioseed.itemgroup.ModGroup;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;

public class Bioseed implements ModInitializer {
	public static final String MOD_ID = "bioseed";


	@Override
	public void onInitialize() {
		BlockRegister.registry();
		ItemRegister.registry();
		new ModGroup();

		//注册回调函数
		PlayerBlockBreakEvents.AFTER.register(new ConsumeFlesh());
	}
}