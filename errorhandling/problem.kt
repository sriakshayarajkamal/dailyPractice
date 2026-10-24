class BankAccount(var name:String? = null ,var bal:Int,var isActive:Boolean,var dep:Int,var with:Int){

    fun checkName(){
        require(name != null) {"name can't be nul"}
        println("Hi ${name}, welcome to AXIS bank")
    }
    fun checkBalance(){
        require(bal >= 0) {"Balance can't be negative"}
        println("Your balance is ${bal}")
    }
    fun ISActive(){
        check(isActive) {"Account must be Active"}
        println("Your account is active")
    }


}
fun main(){
    try{
        var s = BankAccount("Akshaya",bal=0,false,dep=5000,with=200)
        s.checkName()
        s.checkBalance()
        s.ISActive()
    }
    catch(e:IllegalArgumentException){
        println(e)
    }
    catch(e:IllegalStateException){
        println(e)
    }
}