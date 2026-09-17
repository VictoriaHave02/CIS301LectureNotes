// #Sireum #Logika

import org.sireum._
import org.sireum.justification._
import org.sireum.justification.natded.prop._



@pure def imply1(p: B, q: B, r: B): Unit = {
  Deduce(
    ( p & q __>: r, p __>: q, p ) |- ( r )
      Proof(
        //PROOF GOES HERE
        1 ( p ) by Premise,
        2 ( p __>: q ) by Premise,
        3 ( p & q __>: r ) by Premise,
        4 ( q ) by ImplyE(2, 1),
        5 ( p & q ) by AndI(1, 4),
        6 ( r ) by ImplyE(3, 5)
    )
  )
}