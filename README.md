# YouTubeModding14 fork
This is a fork of McJty's youtube tutorial code.  The purposes of this fork is to elaborate the dimension-creation code and subsequent worldgen.  I will put up notes and sample code here as I can, partly for my own edification.

See the original code and tutorials at:


https://github.com/McJty/YouTubeModding14


## **Important Note**

I have almost zero experience modding minecraft.  If you have questions, there are two discords that have experienced users: Modded Minecraft, and Minecraft Modded Development.  A search for these discords will help you.

<br>

# Resources

I'm working with ~1.16.5, keeping up to date as much as I can.  With the release of 1.16.2, mojang started JSON-driven worldgen.

Resources to help with this JSON-driven worldgen are below.

<hr>

From the MMD Discords:

Wiki on creating dimension json files:<br>
https://minecraft.gamepedia.com/Custom_dimension

Wiki on creating biome json files:<br>
https://minecraft.fandom.com/wiki/Biome/JSON_format

Wiki on all other worldgen json files:<br>
https://minecraft.fandom.com/wiki/Custom_world_generation


Awesome tool to make creating worldgen json files much easier! Check it out!<br>
https://misode.github.io/

Here's a datapack of the entire vanilla worldgen as a json datapack. This was created by mojang for 1.16.2+ as a great working example of the json worldgen system

https://cdn.discordapp.com/attachments/750505199415590942/779200847212576798/vanilla_wordgen.zip

<hr>

<br>

# Introduction

As said, this is to elaborate on McJty's dimension code to build out a proper world generation mod.

To start off, this will focus on the minimal and simplest code necessary in Tutorial Dimension 1, which will use the JSON worldgen definitions.


There is too much in worldgen for me to directly break it down at once.  I start with doing initial setup using the basics of JSON driven worldgen and elaborate over the steps.

<br>

# Tutorial Dimension 1 - WorldGen via JSON

## Dimensions

### **Dimension Setup**

The first thing I did was check on how Registering the dimension works.  The code uses the ModDimensions class to do this.

[com.mcjty.mytutorial.dimension ModDimensions.java](https://github.com/gregorybloom/YouTubeModding14/blob/1.16/src/main/java/com/mcjty/mytutorial/dimension/ModDimensions.java)

Here we have our dimension type plus a few dimensions.  This class registers our dimensions/types just so long as it is included somewhere.

(This is done within McJty's code - if awkwardly. More deliberate inclusion would be better?)

Then the JSONs were re-named.  They are located in:
* [resources.data.mytutorial.dimension](https://github.com/gregorybloom/YouTubeModding14/tree/1.16/src/main/resources/data/mytutorial/dimension)
* [resources.data.mytutorial.dimension_type](https://github.com/gregorybloom/YouTubeModding14/tree/1.16/src/main/resources/data/mytutorial/dimension_type)

Use the JSON-related resources above if you want to understand the contents of them better.

In this case we use a JSON value of `generator.biome_source.type = "minecraft:checkerboard"` to make it easy to fly around in creative and glance at everything.

And technically we are done!  The "`tutdim1.json`" file may have custom biomes, but that's not necessary.  For a first test, change them to minecraft standard biome types under `generator.biome_source.biomes`

> Ex: "minecraft:dark_forest", "minecraft:badlands", etc

### **Dimension Wrapup**

With just a couple of minecraft biomes, two simple JSON files, code from ModDimensions (and code elsewhere in setup to include ModDomensions), you are finished specifying the basics of a new dimension.

Visit it with:
> `/execute in yourmodid:dimension_id run tp @a ~ ~ ~`

<br>

## Biomes

### **Biome Setup**

Biome JSON can be set up without any loading code. The most basic sample biome is the `evillake.json`, found here:

* [resources.data.mytutorial.worldgen.biome](https://github.com/gregorybloom/YouTubeModding14/tree/1.16/src/main/resources/data/mytutorial/worldgen/biome)

You can add it to the biomes in `tutdim1.json`.  It does not define any unique features, but creates a grim red biome that you should be able to fly to.  

> Try visiting your new dimension and flying around to find it.

With this you've added a new unique biome to your dimension!

### **Biome Generated Content**

Biomes
