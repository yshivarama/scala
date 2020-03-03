#Below is regular function
def fun(a:Int,b:Int) = {
  var total = 0
  for(element <- a to b ) {
   total+=element
  }
total
}


#Below is Higher Order Function
def dadFun( fun:(Int,Int) => Int , a: Int, b: Int) = {
    var total =0
      total=fun(a,b)
total
}

