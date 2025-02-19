package cordova.kathya.digimind_246801

import java.io.Serializable

class Carrito : Serializable {
    var recordatorios = ArrayList<Recordatorio>()

    fun agregar(p: Recordatorio): Boolean {
        return recordatorios.add(p)
    }
}