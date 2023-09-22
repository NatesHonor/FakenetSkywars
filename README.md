# Fakenetwork Skywars

## Introduction

Welcome to the Fakenetwork Skywars project! This repository contains a Spigot plugin that allows you to spawn an NPC in the popular Skywars game mode. In this README, we'll walk you through the key components of this project.

## How to Use

### 1. The `Skywars` Class

The `Skywars` class is the main plugin class responsible for spawning an NPC when the server starts. Here's how it works:

- When the server starts, the `onEnable` method in the `NPCSpawner` class is called. This method registers our plugin and then calls the `spawn` method of the `MyNPC` class to spawn the NPC.

### 2. The `bSkywarsSolo` Class

The `MyNPC` class, located in the `com.nate.fakenetwork.npcs` package, handles all the NPC-related logic. It is designed to be modular and separate from the main plugin class for better code organization.

- The `spawn` method in the `MyNPC` class is responsible for creating and customizing the NPC entity. It sets the location where the NPC should spawn (in this case, at coordinates x: 203, y: 58, z: 344) and customizes its appearance (in this example, it's a VILLAGER with the name "MyNPC").

## Usage

To use this plugin:

1. Clone or download this repository to your local machine.
2. Import it into your preferred Java development environment.
3. Make sure you have the Spigot API and the required dependencies set up in your project.
4. Customize the NPC's appearance and behavior in the `MyNPC` class's `spawn` method.
5. Build your plugin JAR file.

## Configuring Your Server

To use this plugin on your server:

1. Place the generated plugin JAR file into the `plugins` folder of your Spigot server.
2. Start or restart your Spigot server.
3. The NPC will spawn automatically at the specified location when the server starts.

## Credits

This project is part of the Fakenetwork project created by Nate. Feel free to modify and extend it to suit your needs.

Happy Skywars gaming with your new NPC!
