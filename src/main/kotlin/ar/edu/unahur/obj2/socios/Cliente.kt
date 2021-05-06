package ar.edu.unahur.obj2.socios



class Cliente(val plataEnElBolsillo:Int) : EstadoDeAnimo, Barrio {
    //val interfazAnimo = EstadoDeAnimo

    fun cuantaPropinaDejaria(costoPedido : Int) {
        //EstadoDeAnimo.accionQueRealiza()
    }

}


interface EstadoDeAnimo {
    fun accionQueRealiza()
}

object Enojado : EstadoDeAnimo {
    override fun accionQueRealiza() = println ("no deja nada")
}

object EstaFeliz : EstadoDeAnimo{
    override fun accionQueRealiza() {

    }
}
object Indiferente : EstadoDeAnimo{
    override fun accionQueRealiza() {

    }
}
object Resfriado : EstadoDeAnimo{
    override fun accionQueRealiza() {

    }
}


interface Barrio {
    abstract fun efectoSobreLaPropina()
}

object LasRosas : Barrio{
    override fun efectoSobreLaPropina() {
        TODO("Not yet implemented")
    }
}

object LasLauchas : Barrio{
    override fun efectoSobreLaPropina() {
        TODO("Not yet implemented")
    }
}

object BarrioVerde : Barrio{
    override fun efectoSobreLaPropina() {
        TODO("Not yet implemented")
    }
}

object LasTorres : Barrio{
    override fun efectoSobreLaPropina() {
        TODO("Not yet implemented")
    }
}



