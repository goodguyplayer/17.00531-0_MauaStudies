class MyHero{
  var _nome;
  var _sigularidade;

  MyHero(this._nome, this._sigularidade);

  @override
  String toString() {
    return 'MyHero{_nome: $_nome, _sigularidade: $_sigularidade}';
  }

  get sigularidade => _sigularidade;

  get nome => _nome;
}