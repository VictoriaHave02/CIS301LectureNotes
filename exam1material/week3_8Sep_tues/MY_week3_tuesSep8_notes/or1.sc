// #Sireum #Logika

import org.sireum._
import org.sireum.justification._
import org.sireum.justification.natded.prop._



@pure def or1(a: B, b: B, c: B): Unit = {
    Deduce(
        (a) |- (b | a | c)
        Proof(
            //PROOF GOES HERE
            1 ( a )     by Premise,
            2 ( a | c ) by OrI1(1),
            3 ( b | a | c ) by OrI2(2)
        )
    )
}