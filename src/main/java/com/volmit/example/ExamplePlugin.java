package com.volmit.example;

import com.volmit.volume.bukkit.VolumePlugin;
import com.volmit.volume.bukkit.pawn.Instance;
import com.volmit.volume.bukkit.pawn.Start;
import com.volmit.volume.bukkit.pawn.Stop;

public class ExamplePlugin extends VolumePlugin
{
	@Instance
	public ExamplePlugin instance;

	@Start
	public void enable()
	{

	}

	@Stop
	public void disable()
	{

	}
}
