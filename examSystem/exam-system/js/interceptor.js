/**
 * 自制拦截器
 */

hookAjax({
    //拦截回调
    onreadystatechange:function(xhr){
        console.log("onreadystatechange called: %O",xhr)
    },
    onload:function(xhr){
        console.log("onload called: %O",xhr)
    },
    //拦截函数
    open:function(arg){
     console.log("open called: method:%s,url:%s,async:%s",arg[0],arg[1],arg[2])
    }
})