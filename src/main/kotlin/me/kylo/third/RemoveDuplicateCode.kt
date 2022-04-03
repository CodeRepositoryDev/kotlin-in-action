package me.kylo.third

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    if (user.name.isEmpty()) {
        throw IllegalArgumentException("Can't save user ${user.id} : empty Name.")
    }

    if (user.address.isEmpty()) {
        throw IllegalArgumentException("Can't save user ${user.id} : empty Address.")
    }

    //user를 데이터베이스에 저장한다.
}

fun saveUserV2(user: User) {
    fun validate(user: User, value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id}: empty ${fieldName}.")
        }
    }
    validate(user, user.name, "Name")
    validate(user, user.address, "Address")

    //user를 데이터베이스에 저장한다.
}

fun saveUserV3(user: User) {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id}: empty ${fieldName}.")
        }
    }

    validate(user.name, "Name")
    validate(user.address, "Address")
    //user를 데이터베이스에 저장한다.
}

//----------------------------------------------------------------------------------------

fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${id}: empty ${fieldName}.")
        }
    }

    validate(name, "Name")
    validate(address, "Address")
}

fun saveUserV4(user: User){
    user.validateBeforeSave()

    //user를 데이터베이스에 저장한다.
}