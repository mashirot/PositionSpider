# 说明
由于反爬限制，单cookie只能爬取4页120条

## 配置文件详解
```yaml
version: 1.0
zhiPinConfig:
  # 是否启用，默认false
  switch: false
  # 从第几页开始爬取
  initPage: 1
  # cookie值
  cookie: ""
  scene: "1"
  # 搜索内容
  query: "实习"
  # 城市信息
  city: "101020100"
  # 工作经验
  experience: ""
  # 学历
  degree: "203"
  # 公司行业
  industry: ""
  # 公司规模
  scale: ""
  # 公司融资阶段
  stage: ""
  # 职位
  position: "100101"
  # 工资
  salary: ""
  multiBusinessDistrict: ""
```

### cookie的获取
浏览器开发者工具，找到请求地址为 `joblist.json?` 的请求，复制请求头中的cookie值到Config文件

### 职位
```text
Java - 100101
C++ - 100102
C - 100105
PHP - 100103
Golang - 100116
全栈 - 100123
后端 - 100199
```

### 城市
```json
[{"name":"全国","code":100010000,"url":"/?city=100010000"},
{"name":"北京","code":101010100,"url":"/beijing/"},{"name":"上海","code":101020100,"url":"/shanghai/"},
{"name":"广州","code":101280100,"url":"/guangzhou/"},{"name":"深圳","code":101280600,"url":"/shenzhen/"},
{"name":"杭州","code":101210100,"url":"/hangzhou/"},{"name":"天津","code":101030100,"url":"/tianjin/"},
{"name":"西安","code":101110100,"url":"/xian/"},{"name":"苏州","code":101190400,"url":"/suzhou/"},
{"name":"武汉","code":101200100,"url":"/wuhan/"},{"name":"厦门","code":101230200,"url":"/xiamen/"},
{"name":"长沙","code":101250100,"url":"/changsha/"},{"name":"成都","code":101270100,"url":"/chengdu/"},
{"name":"郑州","code":101180100,"url":"/zhengzhou/"},{"name":"重庆","code":101040100,"url":"/chongqing/"},
{"name":"佛山","code":101280800,"url":"/foshan/"},{"name":"合肥","code":101220100,"url":"/hefei/"},
{"name":"济南","code":101120100,"url":"/jinan/"},{"name":"青岛","code":101120200,"url":"/qingdao/"},
{"name":"南京","code":101190100,"url":"/nanjing/"},{"name":"东莞","code":101281600,"url":"/dongguan/"},
{"name":"昆明","code":101290100,"url":"/kunming/"},{"name":"南昌","code":101240100,"url":"/nanchang/"},
{"name":"石家庄","code":101090100,"url":"/shijiazhuang/"},{"name":"宁波","code":101210400,"url":"/ningbo/"},
{"name":"福州","code":101230100,"url":"/fuzhou/"}]
```

### 学历
```text
不限 - 0
初中及以下 - 207
中专/中技 - 208
高中 - 206
大专 - 202
本科 - 203
硕士 - 204
博士 - 205
```

### 薪水
```text
不限 - 0
-3k - 402
3k-5k - 403
5k-10k - 404
10k-20k - 405
20k-50k - 406
50k+ - 407
```

### 工作经验
```text
不限 - 0
在校生 - 108
应届生 - 102
经验不限 - 101
1年以内 - 103
1-3年 - 104
3-5年 - 105
5-10年 - 106
10年以上 - 107
```

### 公司规模
```text
不限 - 0
0-20 - 301
20-99 - 302
100-499 - 303
500-999 - 304
1000-9999 - 305
10000+ - 306
```

### 融资阶段
```text
不限 - 801
未融资 - 802
天使轮 - 803
A轮 - 804
B轮 - 805
C轮 - 806
D轮及以上 - 807
已上市 - 808
```

## 其他
[解决Excel打开CSV文件中文乱码问题](https://blog.csdn.net/weixin_43848614/article/details/107742922)