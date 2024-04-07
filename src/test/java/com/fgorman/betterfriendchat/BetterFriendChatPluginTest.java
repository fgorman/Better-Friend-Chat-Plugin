package com.fgorman.betterfriendchat;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class BetterFriendChatPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(BetterFriendChatPlugin.class);
		RuneLite.main(args);
	}
}