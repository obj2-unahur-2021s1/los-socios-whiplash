package ar.edu.unahur.obj2.socios

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class ClienteTest : DescribeSpec({
  val lasRosas = LasRosas
  val lasLauchas = LasLauchas
  val enojado = Enojado
  val resfriado = Resfriado

  val clienteEnojado = Cliente(enojado,200,lasRosas)
  val clienteResfriado = Cliente(resfriado,1000,lasLauchas)
  //clienteEnojado.cuantaPropinaDejaria(1500)

  describe("Un/a cliente") {

    it("cuanta plata deja un cliente resfriado"){
    clienteResfriado.cuantaPropinaDejaria(1000).shouldBe(500)


    }

  }
})
