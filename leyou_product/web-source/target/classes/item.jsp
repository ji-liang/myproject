<%@ page language="java" contentType="text/html;charset=UTF-8"  pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=9; IE=8; IE=7; IE=EDGE">
    <meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7" />
    <title>乐优商城--商品详情页</title>
    <link rel="icon" href="/assets/img/favicon.ico">

    <link rel="stylesheet" type="text/css" href="css/webbase.css" />
    <link rel="stylesheet" type="text/css" href="css/pages-item.css" />
    <link rel="stylesheet" type="text/css" href="css/pages-zoom.css" />
    <link rel="stylesheet" type="text/css" href="css/widget-cartPanelView.css" />

    <style type="text/css">
        .goods-intro-list li {
            display: inline-block;
            width: 300px;
        }
        .Ptable {
            margin: 10px 0;
        }
        .Ptable-item {
            padding: 12px 0;
            line-height: 220%;
            color: #999;
            font-size: 12px;
            border-bottom: 1px solid #eee;
        }
        .Ptable-item h3 {
            width: 110px;
            text-align: right;
        }
        .Ptable-item h3, .package-list h3 {
            font-weight: 400;
            font-size: 12px;
            float: left;
        }
        h3 {
            display: block;
            font-size: 1.17em;
            -webkit-margin-before: 1em;
            -webkit-margin-after: 1em;
            -webkit-margin-start: 0px;
            -webkit-margin-end: 0px;
            font-weight: bold;
        }
        .Ptable-item dl {
            margin-left: 110px;
        }
        dl {
            display: block;
            -webkit-margin-before: 1em;
            -webkit-margin-after: 1em;
            -webkit-margin-start: 0px;
            -webkit-margin-end: 0px;
        }
        .Ptable-item dt {
            width: 160px;
            float: left;
            text-align: right;
            padding-right: 5px;
        }
        .Ptable-item dd {
            margin-left: 210px;
        }
        dd {
            display: block;
            -webkit-margin-start: 40px;
        }
        .package-list {
            padding: 12px 0;
            line-height: 220%;
            color: #999;
            font-size: 12px;
            margin-top: -1px;
        }
        .package-list h3 {
            width: 130px;
            text-align: right;
        }
        .package-list p {
            margin-left: 155px;
            padding-right: 50px;
        }
    </style>

</head>

<body>

<!-- 头部栏位 -->
<!--页面顶部，由js动态加载-->
<div id="itemApp">
    <div id="nav-bottom">
        <ly-top />
    </div>
    <div class="py-container">
        <div id="item">
            <div class="crumb-wrap">
                <ul class="sui-breadcrumb">
                    <li>
                        <a href="#">手机</a>
                    </li>
                    <li>
                        <a href="#">手机通讯</a>
                    </li>
                    <li>
                        <a href="#">手机</a>
                    </li>
                    <li>
                        <a href="#">Apple</a>
                    </li>
                    <li class="active">Apple iPhone 6s</li>
                </ul>
            </div>
            <!--product-info-->
            <div class="product-info">
                <div class="fl preview-wrap">
                    <!--放大镜效果-->
                    <div class="zoom">
                        <!--默认第一个预览-->
                        <div id="preview" class="spec-preview">
							<span class="jqzoom">
								<img jqimg="img/_/b1.png" src="img/_/s1.png" width="400px" height="400px"/>
							</span>
                        </div>
                        <!--下方的缩略图-->
                        <div class="spec-scroll">
                            <a class="prev">&lt;</a>
                            <!--左右按钮-->
                            <div class="items">
                                <ul>
                                    <li><img src="img/_/s1.png" bimg="img/_/b1.png" onmousemove="preview(this)" /></li>
                                    <li><img src="img/_/s2.png" bimg="img/_/b2.png" onmousemove="preview(this)" /></li>
                                    <li><img src="img/_/s3.png" bimg="img/_/b3.png" onmousemove="preview(this)" /></li>
                                    <li><img src="img/_/s1.png" bimg="img/_/b1.png" onmousemove="preview(this)" /></li>
                                    <li><img src="img/_/s2.png" bimg="img/_/b2.png" onmousemove="preview(this)" /></li>
                                    <li><img src="img/_/s3.png" bimg="img/_/b3.png" onmousemove="preview(this)" /></li>
                                    <li><img src="img/_/s1.png" bimg="img/_/b1.png" onmousemove="preview(this)" /></li>
                                    <li><img src="img/_/s2.png" bimg="img/_/b2.png" onmousemove="preview(this)" /></li>
                                    <li><img src="img/_/s3.png" bimg="img/_/b3.png" onmousemove="preview(this)" /></li>
                                </ul>
                            </div>
                            <a class="next">&gt;</a>
                        </div>
                    </div>
                </div>
                <div class="fr itemInfo-wrap">
                    <div class="sku-name">
                        <h4>${title}</h4>
                    </div>
                    <div class="news"><span>推荐选择下方[移动优惠购],手机套餐齐搞定,不用换号,每月还有花费返</span></div>
                    <div class="summary">
                        <div class="summary-wrap">
                            <div class="fl title"><i>价　　格</i></div>
                            <div class="fl price">
                                <i>¥</i><em>${price}</em><span>降价通知</span>
                            </div>
                            <div class="fr remark"><i>累计评价</i><em>612188</em></div>
                        </div>
                        <div class="summary-wrap">
                            <div class="fl title">
                                <i>促　　销</i>
                            </div>
                            <div class="fl fix-width">
                                <i class="red-bg">加价购</i>
                                <em class="t-gray">满999.00另加20.00元，或满1999.00另加30.00元，或满2999.00另加40.00元，即可在购物车换
                                    购热销商品</em>
                            </div>
                        </div>
                    </div>
                    <div class="support">
                        <div class="summary-wrap">
                            <div class="fl title">
                                <i>支　　持</i>
                            </div>
                            <div class="fl fix-width">
                                <em class="t-gray">以旧换新，闲置手机回收  4G套餐超值抢  礼品购</em>
                            </div>
                        </div>
                        <div class="summary-wrap">
                            <div class="fl title">
                                <i>配 送 至</i>
                            </div>
                            <div class="fl fix-width">
                                <em class="t-gray">上海 <span>有货</span></em>
                            </div>
                        </div>
                    </div>
                    <div class="clearfix choose">
                        <div id="specification" class="summary-wrap clearfix">
                            <dl>
                                <dt>
                                    <div class="fl title">
                                        <i>选择颜色</i>
                                    </div>
                                </dt>
                                <dd>
                                    <a href="javascript:;" class="selected">
                                        金色<span title="点击取消选择">&nbsp;</span>
                                    </a>
                                </dd>
                                <dd><a href="javascript:;">银色</a></dd>
                                <dd><a href="javascript:;">黑色</a></dd>
                            </dl>
                            <dl>
                                <dt>
                                    <div class="fl title">
                                        <i>内存容量</i>
                                    </div>
                                </dt>
                                <dd><a href="javascript:;" class="selected">16G<span title="点击取消选择">&nbsp;</span>
                                </a></dd>
                                <dd><a href="javascript:;">64G</a></dd>
                                <dd><a href="javascript:;" class="locked">128G</a></dd>
                            </dl>
                            <dl>
                                <dt>
                                    <div class="fl title">
                                        <i>选择版本</i>
                                    </div>
                                </dt>
                                <dd><a href="javascript:;" class="selected">公开版<span title="点击取消选择">&nbsp;</span>
                                </a></dd>
                                <dd><a href="javascript:;">移动版</a></dd>
                            </dl>
                            <dl>
                                <dt>
                                    <div class="fl title">
                                        <i>购买方式</i>
                                    </div>
                                </dt>
                                <dd><a href="javascript:;" class="selected">官方标配<span title="点击取消选择">&nbsp;</span>
                                </a></dd>
                                <dd><a href="javascript:;">移动优惠版</a></dd>
                                <dd><a href="javascript:;"  class="locked">电信优惠版</a></dd>
                            </dl>
                        </div>

                        <div class="summary-wrap">
                            <div class="fl title">
                                <div class="control-group">
                                    <div class="controls">
                                        <input autocomplete="off" type="text" disabled value="1" minnum="1" class="itxt" />
                                        <a href="javascript:void(0)" class="increment plus">+</a>
                                        <a href="javascript:void(0)" class="increment mins">-</a>
                                    </div>
                                </div>
                            </div>
                            <div class="fl">
                                <ul class="btn-choose unstyled">
                                    <li>
                                        <a href="/success?skuId=${id}&title=${title}&images=${images}&price=${price}&num=1" target="_blank" class="sui-btn  btn-danger addshopcar">加入购物车</a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!--product-detail-->
            <div class="clearfix product-detail">
                <div class="fl aside">
                    <ul class="sui-nav nav-tabs tab-wraped">
                        <li class="active">
                            <a href="#index" data-toggle="tab">
                                <span>相关分类</span>
                            </a>
                        </li>
                        <li>
                            <a href="#profile" data-toggle="tab">
                                <span>推荐品牌</span>
                            </a>
                        </li>
                    </ul>
                    <div class="tab-content tab-wraped">
                        <div id="index" class="tab-pane active">
                            <ul class="part-list unstyled">
                                <li>手机</li>
                                <li>手机壳</li>
                                <li>内存卡</li>
                                <li>Iphone配件</li>
                                <li>贴膜</li>
                                <li>手机耳机</li>
                                <li>移动电源</li>
                                <li>平板电脑</li>
                            </ul>
                            <ul class="goods-list unstyled">
                                <li>
                                    <div class="list-wrap">
                                        <div class="p-img">
                                            <img src="img/_/part01.png" />
                                        </div>
                                        <div class="attr">
                                            <em>Apple苹果iPhone 6s (A1699)</em>
                                        </div>
                                        <div class="price">
                                            <strong>
                                                <em>¥</em>
                                                <i>6088.00</i>
                                            </strong>
                                        </div>
                                        <div class="operate">
                                            <a href="javascript:void(0);" class="sui-btn btn-bordered">加入购物车</a>
                                        </div>
                                    </div>
                                </li>
                                <li>
                                    <div class="list-wrap">
                                        <div class="p-img">
                                            <img src="img/_/part02.png" />
                                        </div>
                                        <div class="attr">
                                            <em>Apple苹果iPhone 6s (A1699)</em>
                                        </div>
                                        <div class="price">
                                            <strong>
                                                <em>¥</em>
                                                <i>6088.00</i>
                                            </strong>
                                        </div>
                                        <div class="operate">
                                            <a href="javascript:void(0);" class="sui-btn btn-bordered">加入购物车</a>
                                        </div>
                                    </div>
                                </li>
                                <li>
                                    <div class="list-wrap">
                                        <div class="p-img">
                                            <img src="img/_/part03.png" />
                                        </div>
                                        <div class="attr">
                                            <em>Apple苹果iPhone 6s (A1699)</em>
                                        </div>
                                        <div class="price">
                                            <strong>
                                                <em>¥</em>
                                                <i>6088.00</i>
                                            </strong>
                                        </div>
                                        <div class="operate">
                                            <a href="javascript:void(0);" class="sui-btn btn-bordered">加入购物车</a>
                                        </div>
                                    </div>
                                    <div class="list-wrap">
                                        <div class="p-img">
                                            <img src="img/_/part02.png" />
                                        </div>
                                        <div class="attr">
                                            <em>Apple苹果iPhone 6s (A1699)</em>
                                        </div>
                                        <div class="price">
                                            <strong>
                                                <em>¥</em>
                                                <i>6088.00</i>
                                            </strong>
                                        </div>
                                        <div class="operate">
                                            <a href="javascript:void(0);" class="sui-btn btn-bordered">加入购物车</a>
                                        </div>
                                    </div>
                                    <div class="list-wrap">
                                        <div class="p-img">
                                            <img src="img/_/part03.png" />
                                        </div>
                                        <div class="attr">
                                            <em>Apple苹果iPhone 6s (A1699)</em>
                                        </div>
                                        <div class="price">
                                            <strong>
                                                <em>¥</em>
                                                <i>6088.00</i>
                                            </strong>
                                        </div>
                                        <div class="operate">
                                            <a href="javascript:void(0);" class="sui-btn btn-bordered">加入购物车</a>
                                        </div>
                                    </div>
                                </li>
                            </ul>
                        </div>
                        <div id="profile" class="tab-pane">
                            <p>推荐品牌</p>
                        </div>
                    </div>
                </div>
                <div class="fr detail">
                    <div class="clearfix fitting">
                        <h4 class="kt">选择搭配</h4>
                        <div class="good-suits">
                            <div class="fl master">
                                <div class="list-wrap">
                                    <div class="p-img">
                                        <img src="img/_/l-m01.png" />
                                    </div>
                                    <em>￥5299</em>
                                    <i>+</i>
                                </div>
                            </div>
                            <div class="fl suits">
                                <ul class="suit-list">
                                    <li class="">
                                        <div id="">
                                            <img src="img/_/dp01.png" />
                                        </div>
                                        <i>Feless费勒斯VR</i>
                                        <label data-toggle="checkbox" class="checkbox-pretty">
                                            <input type="checkbox"><span>39</span>
                                        </label>
                                    </li>
                                    <li class="">
                                        <div id=""><img src="img/_/dp02.png" /> </div>
                                        <i>Feless费勒斯VR</i>
                                        <label data-toggle="checkbox" class="checkbox-pretty">
                                            <input type="checkbox"><span>50</span>
                                        </label>
                                    </li>
                                    <li class="">
                                        <div id=""><img src="img/_/dp03.png" /></div>
                                        <i>Feless费勒斯VR</i>
                                        <label data-toggle="checkbox" class="checkbox-pretty">
                                            <input type="checkbox"><span>59</span>
                                        </label>
                                    </li>
                                    <li class="">
                                        <div id=""><img src="img/_/dp04.png" /></div>
                                        <i>Feless费勒斯VR</i>
                                        <label data-toggle="checkbox" class="checkbox-pretty">
                                            <input type="checkbox"><span>99</span>
                                        </label>
                                    </li>
                                </ul>
                            </div>
                            <div class="fr result">
                                <div class="num">已选购0件商品</div>
                                <div class="price-tit"><strong>套餐价</strong></div>
                                <div class="price">￥5299</div>
                                <button class="sui-btn  btn-danger addshopcar">加入购物车</button>
                            </div>
                        </div>
                    </div>
                    <div class="tab-main intro">
                        <ul class="sui-nav nav-tabs tab-wraped">
                            <li class="active">
                                <a href="#one" data-toggle="tab">
                                    <span>商品介绍</span>
                                </a>
                            </li>
                            <li>
                                <a href="#two" data-toggle="tab">
                                    <span>规格与包装</span>
                                </a>
                            </li>
                            <li>
                                <a href="#three" data-toggle="tab">
                                    <span>售后保障</span>
                                </a>
                            </li>
                            <li>
                                <a href="#four" data-toggle="tab">
                                    <span>商品评价</span>
                                </a>
                            </li>
                            <li>
                                <a href="#five" data-toggle="tab">
                                    <span>手机社区</span>
                                </a>
                            </li>
                        </ul>
                        <div class="clearfix"></div>
                        <div class="tab-content tab-wraped">
                            <div id="one" class="tab-pane active">
                                <ul class="goods-intro-list unstyled" style="list-style: none;">
                                    ${spudetail.description}
                                    <li>分辨率：1920*1080(FHD)</li>
                                    <li>后置摄像头：1200万像素</li>
                                    <li>前置摄像头：500万像素</li>
                                    <li>核 数：其他</li>
                                    <li>频 率：以官网信息为准</li>
                                    <li>品牌： Apple</li>
                                    <li>商品名称：APPLEiPhone 6s Plus</li>
                                    <li>商品编号：1861098</li>
                                    <li>商品毛重：0.51kg</li>
                                    <li>商品产地：中国大陆</li>
                                    <li>热点：指纹识别，Apple Pay，金属机身，拍照神器</li>
                                    <li>系统：苹果（IOS）</li>
                                    <li>像素：1000-1600万</li>
                                    <li>机身内存：64GB</li>
                                </ul>
                                <!--商品详情-->
                                <div class="intro-detail">
                                    <img src="img/_/intro01.png" />
                                    <img src="img/_/intro02.png" />
                                    <img src="img/_/intro03.png" />
                                </div>
                            </div>
                            <div id="two" class="tab-pane">
                                <div class="Ptable">
                                    <div class="Ptable-item">
                                        <h3>主体</h3>
                                        <dl>
                                            <dt>品牌</dt><dd>华为（HUAWEI）</dd>
                                            <dt>型号</dt><dd>CLT-AL00</dd>
                                            <dt>入网型号</dt><dd>CLT-AL00</dd>
                                            <dt>上市年份</dt><dd>2018年</dd>
                                            <dt>上市月份</dt><dd>4月</dd>
                                        </dl>
                                    </div>
                                    <div class="Ptable-item">
                                        <h3>基本信息</h3>
                                        <dl>
                                            <dt>机身颜色</dt><dd>宝石蓝</dd>
                                            <dt>机身长度（mm）</dt><dd>155.0 </dd>
                                            <dt>机身宽度（mm）</dt><dd>73.9 </dd>
                                            <dt>机身厚度（mm）</dt><dd>7.8</dd>
                                            <dt>机身重量（g）</dt><dd>约180g（含电池）</dd>
                                            <dt>输入方式</dt><dd>触控</dd>
                                            <dt>运营商标志或内容</dt><dd>无</dd>
                                            <dt>机身材质分类</dt><dd>玻璃后盖</dd>
                                        </dl>
                                    </div>
                                </div>
                                <div class="package-list">
                                    <h3>包装清单</h3>
                                    <p>手机X1、快速指南X1、华为SuperCharge 充电器X1、三包凭证X1、Type-C 数字耳机X1、Type-C 数据线X1、取卡针X1、TPU保护壳X1、USB Type-C转3.5mm耳机转接线X1（备注：最终以实物为准）</p>
                                </div>

                            </div>
                            <div id="three" class="tab-pane">
                                <p>售后保障</p>
                            </div>
                            <div id="four" class="tab-pane">
                                <p>商品评价</p>
                            </div>
                            <div id="five" class="tab-pane">
                                <p>手机社区</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!--like-->
            <div class="clearfix"></div>
            <div class="like">
                <h4 class="kt">猜你喜欢</h4>
                <div class="like-list">
                    <ul class="yui3-g">
                        <li class="yui3-u-1-6">
                            <div class="list-wrap">
                                <div class="p-img">
                                    <img src="img/_/itemlike01.png" />
                                </div>
                                <div class="attr">
                                    <em>DELL戴尔Ins 15MR-7528SS 15英寸 银色 笔记本</em>
                                </div>
                                <div class="price">
                                    <strong>
                                        <em>¥</em>
                                        <i>3699.00</i>
                                    </strong>
                                </div>
                                <div class="commit">
                                    <i class="command">已有6人评价</i>
                                </div>
                            </div>
                        </li>
                        <li class="yui3-u-1-6">
                            <div class="list-wrap">
                                <div class="p-img">
                                    <img src="img/_/itemlike02.png" />
                                </div>
                                <div class="attr">
                                    <em>Apple苹果iPhone 6s/6s Plus 16G 64G 128G</em>
                                </div>
                                <div class="price">
                                    <strong>
                                        <em>¥</em>
                                        <i>4388.00</i>
                                    </strong>
                                </div>
                                <div class="commit">
                                    <i class="command">已有700人评价</i>
                                </div>
                            </div>
                        </li>
                        <li class="yui3-u-1-6">
                            <div class="list-wrap">
                                <div class="p-img">
                                    <img src="img/_/itemlike03.png" />
                                </div>
                                <div class="attr">
                                    <em>DELL戴尔Ins 15MR-7528SS 15英寸 银色 笔记本</em>
                                </div>
                                <div class="price">
                                    <strong>
                                        <em>¥</em>
                                        <i>4088.00</i>
                                    </strong>
                                </div>
                                <div class="commit">
                                    <i class="command">已有700人评价</i>
                                </div>
                            </div>
                        </li>
                        <li class="yui3-u-1-6">
                            <div class="list-wrap">
                                <div class="p-img">
                                    <img src="img/_/itemlike04.png" />
                                </div>
                                <div class="attr">
                                    <em>DELL戴尔Ins 15MR-7528SS 15英寸 银色 笔记本</em>
                                </div>
                                <div class="price">
                                    <strong>
                                        <em>¥</em>
                                        <i>4088.00</i>
                                    </strong>
                                </div>
                                <div class="commit">
                                    <i class="command">已有700人评价</i>
                                </div>
                            </div>
                        </li>
                        <li class="yui3-u-1-6">
                            <div class="list-wrap">
                                <div class="p-img">
                                    <img src="img/_/itemlike05.png" />
                                </div>
                                <div class="attr">
                                    <em>DELL戴尔Ins 15MR-7528SS 15英寸 银色 笔记本</em>
                                </div>
                                <div class="price">
                                    <strong>
                                        <em>¥</em>
                                        <i>4088.00</i>
                                    </strong>
                                </div>
                                <div class="commit">
                                    <i class="command">已有700人评价</i>
                                </div>
                            </div>
                        </li>
                        <li class="yui3-u-1-6">
                            <div class="list-wrap">
                                <div class="p-img">
                                    <img src="img/_/itemlike06.png" />
                                </div>
                                <div class="attr">
                                    <em>DELL戴尔Ins 15MR-7528SS 15英寸 银色 笔记本</em>
                                </div>
                                <div class="price">
                                    <strong>
                                        <em>¥</em>
                                        <i>4088.00</i>
                                    </strong>
                                </div>
                                <div class="commit">
                                    <i class="command">已有700人评价</i>
                                </div>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>

</div>
<script src="js/vue/vue.js"></script>
<script src="js/axios.min.js"></script>
<script src="js/common.js"></script>

<script>
    var itemVm = new Vue({
        el:"#itemApp",
        data:{
        },
        components:{
            lyTop: () => import('js/pages/top.js')
    }
    });
</script>

<script type="text/javascript" src="js/plugins/jquery/jquery.min.js"></script>
<script type="text/javascript">
    $(function(){
        $("#service").hover(function(){
            $(".service").show();
        },function(){
            $(".service").hide();
        });
        $("#shopcar").hover(function(){
            $("#shopcarlist").show();
        },function(){
            $("#shopcarlist").hide();
        });

    })
</script>
<script type="text/javascript" src="js/model/cartModel.js"></script>
<script type="text/javascript" src="js/plugins/jquery.easing/jquery.easing.min.js"></script>
<script type="text/javascript" src="js/plugins/sui/sui.min.js"></script>
<script type="text/javascript" src="js/plugins/jquery.jqzoom/jquery.jqzoom.js"></script>
<script type="text/javascript" src="js/plugins/jquery.jqzoom/zoom.js"></script>
<script type="text/javascript" src="index/index.js"></script>
</body>

</html>