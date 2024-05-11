const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmh39cl/",
            name: "ssmh39cl",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmh39cl/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于微信小程序的小区疫情防控"
        } 
    }
}
export default base
