package com.veigar.lib.study.kotlin

/**
 * @description:密闭类 类似于枚举类 比枚举类更强大
 *
 * @author: houwj
 * @date: 2020/12/10
 */
sealed class SuperCommand {
    object A :SuperCommand()
    object B :SuperCommand()
    object C :SuperCommand()
    object D :SuperCommand()
}


fun exec(superCommand: SuperCommand) = when(superCommand){
    SuperCommand.A->{

    } SuperCommand.B->{

    } SuperCommand.C->{

    } SuperCommand.D->{

    }
}