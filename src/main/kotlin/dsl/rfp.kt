package dsl

import models.Evidences
import models.Role

class rfp(name: String) : Evidences<rfp>(name) {

    override fun invoke(function: rfp.() -> Unit): rfp {
        return apply { function() }
    }

    override fun key_timestamps(vararg timestamps: String) {

    }
}