package com.feed_the_beast.ftbquests.gui;

import com.feed_the_beast.mods.ftbguilibrary.icon.Icon;
import com.feed_the_beast.mods.ftbguilibrary.misc.SimpleToast;
import net.minecraft.client.resources.I18n;

/**
 * @author LatvianModder
 */
public class RewardToast extends SimpleToast
{
	private String text;
	private Icon icon;

	public RewardToast(String t, Icon i)
	{
		text = t;
		icon = i;
	}

	@Override
	public String getTitle()
	{
		return I18n.format("ftbquests.reward.collected");
	}

	@Override
	public String getSubtitle()
	{
		return text;
	}

	@Override
	public Icon getIcon()
	{
		return icon;
	}
}