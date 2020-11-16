import 'package:flutter/material.dart';
import 'package:pratica21/models/hero.dart';

class MinhaListaHome extends StatelessWidget{
  final _myHerosList = [MyHero("All might", "One for all"),
                        MyHero("Midora", "One for all"),
                          MyHero("Bakugo", "Explosão")];

  @override
  Widget build (BuildContext context){
    return Scaffold(
      body: ListView(
          children: [
            ListTile(title: Text(_myHerosList[0].nome), leading: Text(_myHerosList[0].sigularidade),),
          ],
      ),

    );
  }
}