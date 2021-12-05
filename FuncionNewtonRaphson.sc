def PrimDeriv(x : Double , c : Double): Double = math.pow(x,2)-c // funcion

def SegDeriv(x : Double): Double = x*2  // derivada

def formula(cam : Double , Nitar : Int , cont : Int): Double = cam-(PrimDeriv(cam,cont)/SegDeriv(cam))

def iter(cam : Double , Nitar : Int , const : Int): Double ={
  val iteracion = formula(cam,Nitar, const) // resultado de la formula
  if(Nitar == 1){
    iteracion
  } else {
    iter(iteracion,(Nitar -1),const)
  }
}

def NRaphson(num : Int): Double = {

  iter(num/2,5, num)  // num/2 es laprimera iteracion
}

NRaphson(10)
