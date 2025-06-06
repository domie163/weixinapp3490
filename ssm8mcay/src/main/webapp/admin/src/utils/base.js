const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm8mcay/",
            name: "ssm8mcay",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm8mcay/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "微信智能招聘小程序"
        } 
    }
}
export default base
