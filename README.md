# CurrencyConverter
### Features

-This project is devoloped with only Java.
- The proyect shows a currency converter and the temperature converter only for this time.
- The proyect is devoloped with basic knowledge for this reason, this has many errores.
- Support identification or converter with spot "." in decimals.

# Currency Converter
![Badge en Desarollo](https://img.shields.io/badge/STATUS-En%20Desarollo-green) ![](https://img.shields.io/bower/v/editor.md.svg)


**Table of Contents**

[TOCM]

[TOC]

## How does it works
First you have a install JAVA and some text editor with the you can copilate the code. Also you can do a program JAVA that you can compilate in terminal.

Only chose the type of converted what do you want and click in **"Aceptar"**  when you put the values only accept values that be numbers with spot, any other will give you an error and exit the program.

For exit the program or cancel the converted only click in "X" or cancel the program and this will stop running.

[![Window 1](imgur "Window 1")](https://imgur.com/y9l9Crb "Window 1")

## How to add a conversion

###Add variable in the class Arquitectura.java
-First add a Object[] in Class** "Arquitectura.java" **with your variables, the orders affect for  is affected for JOptionPane for shows the options.
```
private static Object[] yourVariable = {"your variables"};

public static Object[] get yourVariable() {
		return  yourVariable;
	}
	public static Object[] get yourVariable(int posicion) {
		return (Object[]) ( yourVariable[posicion]);
	}
```

### Add logic eleccion 
After you has add in Class **"ConversionLogic.java"** the logic with the that you work in my case, this proyect working with **switch/case** and **getters** for each Conversion. "double converted" is a variable in the main class that the user enters in JOptionPane and "String procedimiento" is a variable in the main class shows in JOptionPane that save the Order.
```
public double getConverted(double converted, String procedimieto){
		switch(procedimietos) { 
		case "YOURVARIABLE": return ConversionValor.getPesosDolar(1, conversion);}
		return 99999;
}
```
### Add Mathematical models or API
The next step is add your mathematical models for the conversion or add API in Class **"ConversionValor.java**" and add sus getteres.

### Add the JOptionPane that show options
For ultimate only add a funtion in class **"MainMenuInterface.java" ** this funtion contains JOptionPane that shows the options that had in **"Arquitectura.java"**  besides of had una correccion the exeptions that shows a window tell "Introduccion de valores no valido" that show when your introduce values incorrects for examples decima with comma or values that dont be numbers.

## Thank you for reading
This program could be improved with time and the knowledge that it acquires. I know that the program has many problems, both in architecture and in operation. If you want to give an opinion on how I could improve it, you can send me a message to my twitter [[1]][1]

###End
[1]: https://twitter.com/luizxz94 "@luizxz94"
