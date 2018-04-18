    /**
     * 操作数据
     * @param data 传入数据
     * @param url   传入路径
     * @param type  传入method类型
     * @constructor
     */
    function OperaDate(data, url, type) {
//        layer.close(index);
//        obj.update(); //更新对应行（tr）的DOM结构
        //向服务器发送编辑命令
        //转换性别
       // if (obj.data.gender == "男") {
       //     obj.data.gender = true;
       // } else {
       //     obj.data.gender = false;
       // }
        var info = $.extend(data, {_method: type});
        $.ajax({
            url: url,
            type: type,
            data: info,
            timeout: 20000,
            success: function (result) {
                alert(result.code + result.message);
            },
            error: function (result) {
                alert(result.code + result.message);
            }
        });
    }