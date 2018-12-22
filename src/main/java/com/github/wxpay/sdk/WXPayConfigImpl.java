package com.github.wxpay.sdk;

import java.io.InputStream;

public class WXPayConfigImpl extends WXPayConfig {

	private String appid;

	private String mchid;

	private String key;

	private InputStream certStream;

	public WXPayConfigImpl() {
		// TODO Auto-generated constructor stub
	}

	public WXPayConfigImpl(String appid, String mchid, String key, InputStream certStream) {
		this.appid = appid;
		this.mchid = mchid;
		this.key = key;
		this.certStream = certStream;
	}

	@Override
	String getAppID() {
		// TODO Auto-generated method stub
		return appid;
	}

	@Override
	String getMchID() {
		// TODO Auto-generated method stub
		return mchid;
	}

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	InputStream getCertStream() {
		// TODO Auto-generated method stub
		return certStream;
	}

	@Override
	IWXPayDomain getWXPayDomain() {
		// TODO Auto-generated method stub
		IWXPayDomain wxPayDomain = new IWXPayDomain() {
			public void report(String domain, long elapsedTimeMillis, Exception ex) {

			}

			public DomainInfo getDomain(WXPayConfig config) {
				return new IWXPayDomain.DomainInfo(WXPayConstants.DOMAIN_API, true);
			}
		};
		return wxPayDomain;
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getMchid() {
		return mchid;
	}

	public void setMchid(String mchid) {
		this.mchid = mchid;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void setCertStream(InputStream certStream) {
		this.certStream = certStream;
	}

}