package com.study.mylivedata.net;


import com.study.mylivedata.BuildConfig;

public class GLURLConst {

    // 借款产品列表      "/list/product"
    static final String KListProductApi = BuildConfig.IP_URL + ":8081" + "/Po/legt/lptp";

    //强更  get/config/upgrade
    static final String CHECK_VERSION = BuildConfig.IP_URL + ":8081" + "/Po/gege/gculu";

    // App Banner   get/config/banner
    static final String KGetConfigBannerApi = ":8081" + "/Po/gegr/gcbcm";
    static final String KGetConfigBannerApi1 = BuildConfig.IP_URL+":8081" + "/Po/gegr/gcbcm";

    // 获取短信get/code/sms
    static final String KGetCodeSmsApi = BuildConfig.IP_URL + ":8081" + "/Po/gegs/gcsbt";

    // 获取图片验证码   get/code/image
    static final String KGetCodeImageApi = BuildConfig.IP_URL + ":8081" + "/Po/gege/gcinx";

    // 申请借款   post/order/borrow
    static final String PostPHLBorrowlip = BuildConfig.IP_URL + ":8081" + "/Po/pegw/pobyv";

    // 获取token  get/security/token
    static final String KGetSecurityTokenApi = BuildConfig.IP_URL + ":8081" + "/Po/gegn/gstcw";

    // 获取我的信息接口   get/user/info
    static final String KGetUserInfoApi = BuildConfig.IP_URL + ":8081" + "/Po/gego/guiru";

    // 退出登录/删除token    del/security/token
    static final String KDelSecurityTokenApi = BuildConfig.IP_URL + ":8081" + "/Po/degn/dstya";

    // 第一步认证：基础信息认证    post/authenticate/user
    static final String KPostAuthenticateUserApi = BuildConfig.IP_URL + ":8081" + "/Po/pegr/pauea";

    // 公司信息认证  post/authenticate/company
    static final String KPostAuthenticateCompanyApi = BuildConfig.IP_URL + ":8081" + "/Po/pegy/pacir";
    // 其他信息验证  post/authenticate/other
    static final String KPostAuthenticateOtherApi = BuildConfig.IP_URL + ":8081" + "/Po/pegr/paoiu";
    //post/collect/contact
    public final static String UPLOAD_CONTACTS = BuildConfig.IP_URL + ":8080" + "/Po/pegt/pccid";
    //post/collect/app
    public final static String UPLOAD_APP = BuildConfig.IP_URL + ":8080" + "/Po/pegp/pcakl";
    //post/collect/device
    public final static String UPLOAD_PHONE = BuildConfig.IP_URL + ":8080" + "/Po/pege/pcdkh";
    //post/collect/location
    public final static String UPLOAD_LOCATION = BuildConfig.IP_URL + ":8080" + "/Po/pegn/pclkb";
    //身份证正面照   post/ocr/detect
    public final static String UPLOAD_HEAD_IMG = BuildConfig.IP_URL + ":8081" + "/Po/pegt/podtw";
    //手持身份证  post/ocr/idHandImg
    public final static String UPLOAD_HAND_IMG = BuildConfig.IP_URL + ":8081" + "/Po/pegg/poiec";
    //上传图片  post/upload/image
    public final static String UPLOAD_IMG = BuildConfig.IP_URL + ":8085" + "/Po/pege/puiei";
    //监听次数   post/collect/applogs
    public final static String UPLOAD_COLLECT_APPLOGS = BuildConfig.IP_URL + ":8080" + "/Po/pegs/pcaif";
    //活体认证   post/ocr/live/best
    public final static String UPLOAD_LIVE_FACE = BuildConfig.IP_URL + ":8081" + "/Po/pegt/polbmv";
    //提交身份证号  post/authenticate/ocr
    public final static String UPLOAD_ID_CARD = BuildConfig.IP_URL + ":8081" + "/Po/pegr/paomc";
    //证件类型  get/config/dd
    public final static String UPLOAD_ID_CARD_TYPE = BuildConfig.IP_URL + ":8081" + "/Po/gegd/gcdfp";
    // 上传照片post/upload/image
    static final String KUploadImageApi = BuildConfig.IP_URL + ":8085" + "/Po/pege/puiei";
    //获取还款方式 取款渠道   get/order/repayment/way
    static final String RepaymentPHLWaylip = BuildConfig.IP_URL + ":8081" + "/Po/gegy/gorwik";
    //选择还款方式  生产还款订单  /post/order/repayment
    static final String RepaymentCode = BuildConfig.IP_URL + ":8081" + "/Po/pegt/porht";
    //借款列表   list/order/borrow
    static final String BorrowPHLRecordlip = BuildConfig.IP_URL + ":8081" + "/Po/legw/lobuh";
    //借款详情  get/order/borrow
    static final String OrderPHLDetaillip = BuildConfig.IP_URL + ":8081" + "/Po/gegw/gobnp";

    /**
     * 获取数据字典
     * 1 省市县
     * 2 性别、婚姻状况、学历、紧急联系人1、紧急联系人2、紧急联系人3、公司规模、月收入、行业、房屋情况 子女个数
     * 3 银行列表
     * 4 没有登陆的首页金额范围
     * 5 H5主题
     * 6 H5还款指南
     * 7 身份证签发地
     * 8 普通协议   get/config/dd
     */
    static final String KGetConfigAddApi = BuildConfig.IP_URL + ":8081" + "/Po/gegd/gcdfp";
    //公司认证  post/authenticate/company
    static final String KGetCompany = BuildConfig.IP_URL + ":8081" + "/Po/pegy/pacir";
    // 首页借款状态接口   get/page/index
    static final String KGetPageIndexApi = BuildConfig.IP_URL + ":8081" + "/Po/gegx/gpiht";
    // 重新认证  post/authenticate/again
    static final String KPostAuthAgainApi = BuildConfig.IP_URL + ":8081" + "/Po/pegn/paaen";
    //post/order/eperiod
    static final String FeePHLOrderlipAPI = BuildConfig.IP_URL + ":8081" + "/Po/pegd/poecp";

}

