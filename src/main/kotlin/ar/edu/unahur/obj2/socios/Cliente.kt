package ar.edu.unahur.obj2.socios
import kotlin.properties.Delegates

class Cliente(var estadoDeAnimo : EstadoDeAnimo , var barrio: Barrio, var plataEnElBolsillo: Int )  {
    fun cuantaPropinaDejaria(costoPedido : Int): Int {
        var propina = estadoDeAnimo.influyeEnLaPropina(this, costoPedido)
        propina = barrio.efectoSobreLaPropina(propina)
        return propina
    }
}

abstract class EstadoDeAnimo() {
    abstract fun influyeEnLaPropina(cliente: Cliente, costoDePedido : Int) : Int
}

object Enojado : EstadoDeAnimo() {
    override fun influyeEnLaPropina(cliente:Cliente, costoDePedido: Int) = 0
}
object EstaFeliz : EstadoDeAnimo() {
    override fun influyeEnLaPropina(cliente :Cliente, costoDePedido: Int) = (costoDePedido * 25/100)
}
object Indiferente : EstadoDeAnimo(){
    override fun influyeEnLaPropina(cliente : Cliente , costoDePedido : Int) = cliente.plataEnElBolsillo
}

object Resfriado : EstadoDeAnimo(){
    override fun influyeEnLaPropina(cliente : Cliente, costoDePedido : Int) = costoDePedido
}


abstract class Barrio() {
    abstract fun efectoSobreLaPropina(propinaSegunEstado : Int) : Int
}

object LasRosas : Barrio(){
    override fun efectoSobreLaPropina(propinaSegunEstado : Int) =  propinaSegunEstado + 50
}

object LasLauchas : Barrio(){
    override fun efectoSobreLaPropina(propinaSegunEstado : Int) = propinaSegunEstado / 2
}

object BarrioVerde : Barrio(){
    override fun efectoSobreLaPropina(propinaSegunEstado : Int) =
        if (propinaSegunEstado <= 200) 200 else propinaSegunEstado
}

object LasTorres : Barrio(){
    override fun efectoSobreLaPropina(propinaSegunEstado : Int) = propinaSegunEstado
}




