package ar.edu.unahur.obj2.socios

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class ClienteTest : DescribeSpec({
  val lasRosas = LasRosas
  val lasLauchas = LasLauchas
  val barrioVerde = BarrioVerde
  val lasTorres = LasTorres
  val enojado = Enojado
  val resfriado = Resfriado
  val indiferente = Indiferente
  val estaFeliz = EstaFeliz
  val clienteEnojado = Cliente(enojado,lasRosas,200)
  val clienteResfriado = Cliente(resfriado,lasLauchas,1000)
  val clienteIndiferente = Cliente(indiferente,lasTorres,500)
  val clienteIndiferente2 = Cliente(indiferente,lasLauchas,300)
  val clienteFeliz = Cliente(estaFeliz,barrioVerde,2300)
  val clienteFeliz2 = Cliente(estaFeliz,barrioVerde,650)
  val clienteFeliz3 = Cliente(estaFeliz,lasRosas, 700)
  val clienteCambiarGuita = Cliente(estaFeliz,lasRosas, 700)


  describe("Un cliente") {

    it("Un cliente enojado del barrio Las Rosas"){
      clienteEnojado.cuantaPropinaDejaria(500).shouldBe(50)
    }

    it("cuanta plata deja un cliente resfriado, del barrio las lauchas") {
      clienteResfriado.cuantaPropinaDejaria(1000).shouldBe(500)
    }

    it("Un cliente Indiferente del barrio Las Torres"){
      clienteIndiferente.cuantaPropinaDejaria(1500).shouldBe(500)
    }

    it("un cliente indiferente del barrio las lauchas" ){
      clienteIndiferente2.cuantaPropinaDejaria(1500).shouldBe(150)
    }

    it("Un cliente feliz del barrio verde"){
      clienteFeliz.cuantaPropinaDejaria(3000).shouldBe(750)
    }

    it ( "Un cliente feliz del barrio verde con propina menor a 200"){
      clienteFeliz2.cuantaPropinaDejaria(150).shouldBe(200)
    }

    it ("un cliente feliz del barrio las rosas"){
      clienteFeliz3.cuantaPropinaDejaria(750).shouldBe(237)
    }

    it ("cambiar guita en el bolsillo del cliente") {
      clienteCambiarGuita.plataEnElBolsillo.shouldBe(700)
      clienteCambiarGuita.plataEnElBolsillo = 5000
      clienteCambiarGuita.plataEnElBolsillo.shouldBe(5000)
    }





  }

})
