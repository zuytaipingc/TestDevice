<template>
    <div class="container">
        <h1>分类管理</h1>
        <button @click="show= !show">新增</button>
            
        <!-- 展示数据 -->
        <table border="1px" width="500px">
            <tr>
                <td>主键</td>
                <td>名称</td>
                <td>说明</td>
                <td>状态</td>
                <td>操作</td>
            </tr>
            <!-- 循环渲染为行 -->
            <tr v-for="deviceType in deviceTypeList" :key="deviceType.typeId">
                <td>{{ deviceType.typeId }}</td>
                <td>{{ deviceType.typeName }}</td>
                <td>{{ deviceType.typeRemark }}</td>
                <td>
                    <span v-if="deviceType.typeStatus==0" style="color:green">正常</span>
                    <span v-if="deviceType.typeStatus==1" style="color: orange;">禁用</span>
                    <span v-if="deviceType.typeStatus==-1" style="color: red;">删除</span>
                </td>
                <td>
                    <button>修改</button>
                    <button>删除</button>
                </td>
            </tr>
        </table>
            <!-- 显示弹框 -->
                 <div v-if="show">
                    <h2>新增分类</h2>
                    <form>
                        名称：<input type="text" v-model="deviceType.typeName"><br>
                        说明：<input type="text" v-model="deviceType.typeRemark"><br>
                        状态：<input type="radio" value="0" name="typeStatus" v-model="deviceType.typeStatus">正常
                         <input type="radio" value="1" name="typeStatus" v-model="deviceType.typeStatus">禁用
                         <input type="radio" value="-1" name="typeStatus" v-model="deviceType.typeStatus">删除
                         <input type="reset" value="重置"><input type="button" value="新增" @click="add">

                    </form>
                 </div>

    </div>
</template>

<script>
import { addControls } from 'quill/modules/toolbar';

    export default{
        data(){
            return{//定义数据
                deviceType:{},//定义数据，获取表单中数据，v-model
                show:false, //控制弹框的显示和隐藏
                deviceTypeList:[
                    {"typeId":1,"typeName":"ceshi01","typeRemarrk":"说明1","typeStatus":0},
                    {"typeId":2,"typeName":"ceshi02","typeRemarrk":"说明2","typeStatus":1},
                    {"typeId":3,"typeName":"ceshi03","typeRemarrk":"说明3","typeStatus":-1}

                ],    
            }

        },
        methods:{
            //编写方法
            //新增分类的方法
            add(){
                //typeId随机生成整数
                //parseInt：将字符串转成为整数
                this.deviceType.typeId = parseInt(Math.random()*100)
                //将表单中的数据，添加到deviceTypeList数组中
                this.deviceTypeList.push(this.deviceType)
                //隐藏表单
                this.show = false
                //清空表单
                this.deviceType = {}
            }
        }
    }
</script>

<style scoped>

</style>