import{aZ as e,z as t,a8 as i,ac as s,ad as a,ar as r,aa as o,a9 as n,a as l,an as c,aJ as d,L as h,F as p,ag as u,ak as m,h as g,g as b,ab as v,aX as y,b3 as f,b4 as _,bX as S,y as $,bZ as x,a_ as C,b1 as T,cJ as k,aD as I,aV as E,ah as w,ai as R,b0 as M,aM as L,b6 as P,aN as A,i as D,aO as O,o as N,f as q,aL as V,ba as B,eZ as H,bF as j,bG as F,az as z,gh as G,gi as U,gj as K,gk as X,gl as W,gm as J,gn as Q,go as Y,gp as Z,gq as ee,fL as te,gr as ie,fV as se,fW as ae,gs as re,ap as oe,b$ as ne,bx as le,c0 as ce,H as de,v as he,u as pe,cI as ue,aI as me,bU as ge,cS as be,cH as ve,dA as ye,dB as fe,eu as _e,b2 as Se,T as $e,fH as xe,A as Ce,cD as Te,D as ke,aU as Ie,cT as Ee,di as we,cK as Re,cM as Me,es as Le,_ as Pe,V as Ae,gt as De,aT as Oe,ev as Ne,av as qe,dJ as Ve,cO as Be,J as He,a7 as je,cF as Fe,cU as ze}from"./952f98a9.js";import{ab as Ge,fj as Ue,ac as Ke,M as Xe,ah as We,aw as Je,e as Qe,t as Ye,d as Ze,L as et,G as tt,D as it,f as st,Q as at,V as rt,v as ot,w as nt,W as lt,u as ct,H as dt,z as ht,h as pt,a4 as ut,K as mt,an as gt,a3 as bt,N as vt,ao as yt,R as ft,S as _t,fk as St,fl as $t,fm as xt,ax as Ct}from"./216055dc.js";import{B as Tt,c as kt}from"./703ea9fa.js";import"./d6d9f126.js";import{aM as It,t as Et,aN as wt,g as Rt,bl as Mt,a2 as Lt,a3 as Pt,by as At,bP as Dt,bQ as Ot,bf as Nt,bg as qt}from"./7f3d7ca9.js";import{H as Vt}from"./e7d77b44.js";import{B as Bt,b as Ht}from"./8f7ccd2d.js";import{B as jt}from"./af0d21d4.js";import{b as Ft,B as zt}from"./aaa76bb8.js";import{b as Gt,B as Ut}from"./1709aeaa.js";import{d as Kt,e as Xt}from"./30ef6f1f.js";import{B as Wt,b as Jt}from"./f9d0fbbe.js";import{B as Qt,b as Yt}from"./d335c75d.js";import{B as Zt,b as ei}from"./972f570a.js";import{B as ti,b as ii}from"./eee1b8f7.js";import"./ff2cdeea.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./dd13577a.js";import"./854beed0.js";import"./84dff06e.js";class si extends Ge{constructor(e=null){super(Object.assign(e||{},{method:"PATCH"}))}toString(e=""){return super.toString(e||"BGADPRequestPATCH")}}class ai extends Ue{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`vehicle-insurances/v${this.version}/auto-parts-retailers`)}toString(){return super.toString("BGADPVehicleInsurancesAutoPartsRetailersGetV1")}}class ri extends Ue{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`vehicle-insurances/v${this.version}/vehicle-insurances/{vehicle-insurance-id}`)}toString(){return super.toString("BGADPVehicleInsurancesVehicleInsuranceGetV1")}}class oi extends si{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`vehicle-insurances/v${this.version}/vehicle-insurances/{vehicle-insurance-id}`)}toString(){return super.toString("BGADPVehicleInsurancesVehicleInsurancePatchV1")}}class ni extends Ke{static get is(){return"bbva-global-vehicle-insurance-api-dm"}static get properties(){return{vehicleInsurance:{type:Object,attribute:!1}}}constructor(){super(),this.vehicleInsurance={}}resetVehicleInsurance(){this.vehicleInsurance={}}getVehicleInsurance(e,t={}){if(Object.keys(this.vehicleInsurance).length)return;t=Object.assign({"vehicle-insurance-id":e},t),this._generateGetService(this._getService("get",{},t),{customEvent:"vehicle-insurance-api-dm-fetch",errorFireEventHandler:"vehicle-insurance-api-dm-fetch-error"},this._responseMapping,t.fields)}patchVehicleInsurance(e,t){const i={"vehicle-insurance-id":e};this._generateGetService(this._getService("patch",t,i),{customEvent:"vehicle-insurance-api-dm-update",errorFireEventHandler:"vehicle-insurance-api-dm-update-error"},this._responseMapping),this.resetVehicleInsurance()}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}VehicleInsurance`,this._getBgadp(s))}_getBgadp(e){return{getVehicleInsuranceV1:()=>new ri(e),patchVehicleInsuranceV1:()=>new oi(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}let li=class{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let i=Object(this),s=i.length>>>0;if(0===s)return!1;let a=0|t,r=Math.max(a>=0?a:s-Math.abs(a),0);for(;r<s;){if((o=i[r])===(n=e)||"number"==typeof o&&"number"==typeof n&&isNaN(o)&&isNaN(n))return!0;r++}var o,n;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var i=[],s=0,a="",r=0,o=arguments.length;r!==o;++r){var n=+arguments[r];if(!(n<1114111&&n>>>0===n))throw RangeError("Invalid code point: "+n);n<=65535?s=i.push(n):(n-=65536,s=i.push(55296+(n>>10),n%1024+56320)),s>=16383&&(a+=e.apply(null,i),i.length=0)}return a+e.apply(null,i)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",i=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${i&&i.message}`)}},ci=class extends li{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}};const di=0,hi=1,pi="jwt",ui="tsec",mi="none";let gi=class extends li{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=di,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new ci,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=ui:this.requiredToken=mi,this.requiresJWT=!1):this.requiredToken===ui?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===pi?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===mi?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(ui)}_setJwtHandler(){this._setTokenHandler(pi)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((i,s)=>{t=Object.assign(t,{resolve:i,reject:s}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let i=this._getRequestHeaders();Object.keys(i).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,i[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let t=null;return!!window.CellsNativePlugins&&(t=e),t}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let i=e.replace(/[\{\}]+/g,""),s=t[i];return s?delete t[i]:this._error(9,`Missing ${i} param value`),s})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let i=Object.keys(t);i.length&&(e=[e,i.map((e=>{let i=t[e];return Array.isArray(i)&&this.paramArrayMode===hi?this._arrayToQueryParam(e,i):`${e}=${i}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(ui,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(pi,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(i){var s=t.getItem(i);s&&"null"!==s&&(e[i]=s)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const i=window.sessionStorage;t=Object.keys(i).filter((t=>t.startsWith(e))).reduce(((t,s)=>(t[s.replace(e,"")]=i.getItem(s),t)),{})}return t}_getTokenForRequestHeaders(e,t){const i=`${e}Handler`,s=e===pi?"JWT ":"",a=e===pi?"Authorization":ui;if(void 0===this[i]||null===this[i])this._error(11,`${e} handler is undefined`);else{const r=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let o=this[i].getItem(r);o?t[a]=t[a]||s+o:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((i=>{t.push(`${i}=${e[i]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let i;const s=new Promise(((e,t)=>{i=(i,s)=>{i?t(i):e(s)}}));return t.addEventListener("loadend",(function e(s){t.removeEventListener("loadend",e),s.error?i(s.error):i(null,t.result)})),t.readAsText(e),s}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let i=0;for(;i<e.length;){let s=e[i],a=0,r=0;if(s<=127?(a=0,r=255&s):s<=223?(a=1,r=31&s):s<=239?(a=2,r=15&s):s<=244&&(a=3,r=7&s),e.length-i-a>0){let t=0;for(;t<a;)s=e[i+t+1],r=r<<6|63&s,t+=1}else r=65533,a=e.length-i;t+=String.fromCodePoint(r),i+=a+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},i=e.trim().split(/[\r\n]+/);for(const e in i)if(i.hasOwnProperty(e)&&""!==i[e]){let s=": ",a=i[e].split(s);t[a.shift().toLowerCase()]=a.join(s)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,i,s){let a=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(s)>=0&&(a=t.getResponseHeader(s));break;case this._NATIVE_XHR:t&&t.headers&&(a=JSON.parse(t.headers)[s])}if(a){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):i;e.getItem(t)!==a&&(e.setItem(t,a),this._emitTokenUpdate(i,a))}}_emitTokenUpdate(e,t){if(this.htmlContext){const i=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(i)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,i,s,a,r;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),i=e.getResponseHeader("AuthenticationData"),s=e.getResponseHeader("AuthenticationState"),a=e.getResponseHeader("AuthenticationChallenge"),r=e.getResponseHeader("AuthenticationResponse");else{let o=JSON.parse(e.headers);t=o.authenticationtype,i=o.authenticationdata||null,s=o.authenticationstate,a=o.authenticationchallenge,r=o.authenticationresponse}return{type:t,data:i,state:s,challenge:a,response:r}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",i=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const s=this._getSignatureData(e,t,i);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:s}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",i="",s=""){let a;if("object"==typeof e&&e){const r=this._getSignatureData(e.signatureType,t,i);a=this._makeKeyValuePairFromObject(r,e.signatureValue),e.challenge&&(a+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(a,e.signatureType,s)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(a=`password=${e}`,this._buildSignatureHeaders(a,"2",s)):(a=`${i}=${e}`,this._buildSignatureHeaders(a,t,s)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let i,s=e.split(",");if(s.length>1){i=s.map((e=>`${e}=${t[e]}`)).join(",")}else i=`${e}=${t}`;return i}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",i=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),i&&(this.headers=Object.assign(this.headers,{AuthenticationState:i})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),a=this._ERROR_CODES.SIGNATURE_INVALID.includes(s),{type:r,data:o,state:n,challenge:l,response:c}=this._extractSignatureResponseHeaders(e),d=this._getRequestMetadata(e);if(a)this._notifySignatureInvalid(d),i=!0;else if(r)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(s)?(this._notifySignatureTypeUsingErrorCode(s,d,r,o,n,l,c),i=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(d,r,o,n,l,c),i=!0}return i}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),a=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(s),r=this._getRequestMetadata(e);a&&(this._notifyWaitingForProcessResponse(r),i=!0)}return i}_notifySignatureRequiredFirstStep(e,t,i,s){this._defineSignatureType(t,i),this._defineSignatureValue(t,i,s),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:i,metadata:e}}))}_notifySignatureRequired(e,t,i,s,a,r){this._defineSignatureValue(t,i,s);const o={type:t,data:i,challenge:a,metadata:e};r&&(o.response=r),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:o}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:i}=e;return{path:this._path,method:this.method,url:t,status:i}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",i=""){const s=t.split(";").findIndex((t=>t===e));return i?i.split(";")[s]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,i,s,a,r){s?this._notifySignatureRequired(e,t,i,s,a,r):this._notifySignatureRequiredFirstStep(e,t,i,s)}_notifySignatureTypeUsingErrorCode(e,t,i,s,a,r,o){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,i,s,a):this._notifySignatureRequired(t,i,s,a,r,o)}},bi=class extends gi{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}};class vi extends bi{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`vehicle-insurances/v${this.version}/auto-parts-retailers`)}toString(){return super.toString("BGADPVehicleInsurancesAutoPartsRetailersGetV0")}}class yi extends Ke{static get is(){return"bbva-global-auto-parts-retailers-api-dm"}static get properties(){return{autoPartsRetailers:{type:Array,attribute:!1},_contactType:{type:Object,attribute:!1},_phoneType:{type:Object,attribute:!1}}}constructor(){super(),this.autoPartsRetailers=[],this._contactType={EMAIL:"EMAIL",PHONE_NUMBER:"LANDLINE",MOBILE_NUMBER:"MOBILE",OFFICE_NUMBER:"LANDLINE"},this._phoneType={PHONE_NUMBER:"HOME",OFFICE_NUMBER:"WORK"}}resetAutoPartsRetailers(){this.autoPartsRetailers=[]}getAutoPartsRetailers(e={}){if(Object.keys(this.autoPartsRetailers).length)return;this._paramsMapping(e);this._generateGetService(this._getService("get",{},e),{customEvent:"auto-parts-retailers-api-dm-fetch",errorFireEventHandler:"auto-parts-retailers-api-dm-fetch-error"},this._responseMapping,e.fields)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}AutoPartsRetailers`,this._getBgadp(s))}_getBgadp(e){return{getAutoPartsRetailersV0:()=>new vi(e),getAutoPartsRetailersV1:()=>new ai(e),default:()=>"BGADP called not exist"}}_paramsMapping(e){return"0"==this.version&&(this._removeFields(["searchyourcrystal"],e),this._removeFields(["model.name"],e),e["spareParts.id"]&&(e["spareParts.id"]=parseInt(e["spareParts.id"])),e["sparePartsQuality.id"]&&(e["sparePartsQuality.id"]=parseInt(e["sparePartsQuality.id"])),e["location.state.id"]&&(e["location.state.id"]=parseInt(e["location.state.id"])),e["location.geographicGroupType.id"]&&(e["location.geographicGroupType.id"]=parseInt(e["location.geographicGroupType.id"]))),e}_responseMapping(e){if(Object.keys(e).length&&"0"==this.version){let t;for(let i=0;i<e.length;i++){e[i].id=e[i].id.toString();for(let s=0;s<e[i].stores.length;s++){e[i].stores[s].id=e[i].stores[s].id.toString();let a=[];if(this._renameProperty(e[i].stores[s].location,"addressName","formattedAddress"),a.push({componentTypes:["COUNTRY"],code:e[i].stores[s].location.country.id,name:e[i].stores[s].location.country.name}),a.push({componentTypes:["CITY"],name:e[i].stores[s].location.city}),a.push({componentTypes:["POSTAL_CODE"],name:e[i].stores[s].location.zipCode}),a.push({componentTypes:["ADMINISTRATIVE_AREA_LEVEL_1"],code:e[i].stores[s].location.state.id,name:e[i].stores[s].location.state.name}),e[i].stores[s].location.geographicGroups){a=[...e[i].stores[s].location.geographicGroups,...a],delete e[i].stores[s].location.geographicGroups;for(let e=0;e<a.length;e++)a[e].geographicGroupType&&(a[e].componentTypes=[a[e].geographicGroupType.id],this._removeFields(["geographicGroupType"],a[e]))}e[i].stores[s].location.addressComponents=a;let r=e[i].stores[s].contactDetails;for(let a=0;a<r.length;a++){switch(t=r[a].contact,r[a].contact={contactDetailType:this._contactType[r[a].contactType.id]},r[a].contact.contactDetailType){case"EMAIL":r[a].contact.address=t;break;case"LANDLINE":r[a].contact.number=t,r[a].contact.phoneType=this._phoneType[e[i].stores[s].contactDetails[a].contactType.id];break;case"MOBILE":r[a].contact.number=t;break;default:r.splice(a,1)}this._removeFields(["contactType"],r[a]),this._removeFields(["city","state","country","zipCode"],e[i].stores[s].location)}}}}return e}}const fi=new r;var _i=t`:host {
  box-sizing: border-box;
  display: flex;
  min-height: 1rem;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
  --_notification-help-icon-color: var(--bbva-notification-help-dark-mode-icon-color, var(--bbva-notification-help-icon-color, var(--colorsPrimaryCoreDark, ${i(n.primaryCoreDark)})));
  --_notification-help-text-color: var(--bbva-notification-help-dark-mode-text-color, var(--bbva-notification-help-text-color, var(--colorsSecondary500, ${i(n.secondary500)})));
  --_notification-help-icon-color-alert: var(--bbva-notification-help-dark-mode-icon-color-alert, var(--bbva-notification-help-icon-color-alert, var(--colorsTertiaryType1Dark, ${i(n.tertiaryType1Dark)})));
  --_notification-help-text-color-alert: var(--bbva-notification-help-dark-mode-text-color-alert, var(--bbva-notification-help-text-color-alert, var(--colorsSecondary600, ${i(n.secondary600)})));
  --_notification-help-icon-color-success: var(--bbva-notification-help-dark-mode-icon-color-success, var(--bbva-notification-help-icon-color-success, var(--colorsTertiaryType6Dark, ${i(n.tertiaryType6Dark)})));
  --_notification-help-text-color-success: var(--bbva-notification-help-dark-mode-text-color-success, var(--bbva-notification-help-text-color-success, var(--colorsSecondary500, ${i(n.secondary500)})));
  --skeleton-quote-color: var(--bbva-notification-help-dark-mode-skeleton-quote-color, var(--bbva-notification-help-skeleton-color, var(--colorsSecondary200, ${i(n.secondary200)})));
  --skeleton-quote-bg: var(--bbva-notification-help-dark-mode-skeleton-bg, var(--bbva-notification-help-skeleton-bg, transparent));
}

:host([hidden]),
[hidden] {
  display: none !important;
}

:host([hide-top-padding]) {
  padding-top: 0;
}

:host([hide-bottom-padding]) {
  padding-bottom: 0;
}

:host([hide-left-padding]) {
  padding-left: 0;
}

:host([hide-right-padding]) {
  padding-right: 0;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.accessible-hide {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
}

[data-tag-name=bbva-icon] {
  color: var(--_notification-help-icon-color);
  flex-shrink: 0;
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color);
  font-size: var(--bbva-notification-help-text-font-size, var(--typographyType3XSmall, ${i(s.type3XSmall)}));
  line-height: var(--bbva-notification-help-text-line-height, var(--lineHeightType3XSmall, ${i(a.type3XSmall)}));
  margin: 0;
}

:host(.alert) [data-tag-name=bbva-icon] {
  color: var(--_notification-help-icon-color-alert);
}
:host(.alert) [data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color-alert);
}

:host(.success) [data-tag-name=bbva-icon] {
  color: var(--_notification-help-icon-color-success);
}
:host(.success) [data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color-success);
}

:host([loading]) {
  position: relative;
  top: 0;
  left: 0;
  display: inline-flex;
  width: 100%;
  pointer-events: none;
  background-repeat: no-repeat;
  will-change: transform;
  transform: opacity;
  animation: pulse 2s ease-in-out infinite;
  background-image: linear-gradient(var(--skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: 16px 16px, calc((80px * 2) + (16px/ 2)) 16px;
  background-position: 0 0, 20px 0;
}
:host([loading]) > :nth-child(n) {
  opacity: 0;
}

@keyframes pulse {
  0% {
    filter: opacity(100%);
  }
  50% {
    filter: opacity(60%);
  }
  100% {
    filter: opacity(100%);
  }
}
${fi.mediaRules()}`;var Si=t`[ambient^=light] {
  --bbva-notification-help-icon-color: initial;
  --bbva-notification-help-text-color: initial;
  --bbva-notification-help-icon-color-alert: initial;
  --bbva-notification-help-text-color-alert: initial;
  --bbva-notification-help-icon-color-success: initial;
  --bbva-notification-help-text-color-success: initial;
  --bbva-notification-help-skeleton-color: initial;
}
${(new r).mediaRules()}`;const $i=new r;const xi={dark:t`
    ${t`[ambient^=dark] {
  --bbva-notification-help-icon-color: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
  --bbva-notification-help-text-color: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
  --bbva-notification-help-icon-color-alert: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
  --bbva-notification-help-text-color-alert: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
  --bbva-notification-help-icon-color-success: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
  --bbva-notification-help-text-color-success: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
  --bbva-notification-help-skeleton-color: var(--colorsPrimaryCoreLight, ${i(n.primaryCoreLight)});
}
${$i.mediaRules()}`}
  `,light:t`
    ${Si}
  `};let Ci=class extends(l(c(d(h)))){static get is(){return"bbva-notification-help"}static get scopedElements(){return{"bbva-icon":p,"bbva-text":u}}static get properties(){return{accessibilityLabelIcon:{type:String,attribute:"accessibility-label-icon"},icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},text:{type:String},loading:{type:Boolean,reflect:!0},hideTopPadding:{type:Boolean,attribute:"hide-top-padding"},hideBottomPadding:{type:Boolean,attribute:"hide-bottom-padding"},hideLeftPadding:{type:Boolean,attribute:"hide-left-padding"},hideRightPadding:{type:Boolean,attribute:"hide-right-padding"}}}constructor(){super(),this.accessibilityLabelIcon="",this.icon="",this.iconSize=16,this.text="",this.loading=!1,this.hideTopPadding=!1,this.hideBottomPadding=!1,this.hideRightPadding=!1,this.hideLeftPadding=!1}static get styles(){return[super.styles,_i,xi.dark,xi.light,m("bbva-notification-help-shared-styles")]}render(){return g`
      <span class="accessible-hide" ?hidden="${!this.accessibilityLabelIcon}"
        >${this.accessibilityLabelIcon}</span
      >

      <bbva-icon aria-hidden="true" .icon="${this.icon}" .size="${this.iconSize}"> </bbva-icon>

      <bbva-text text=${this.text} unset></bbva-text>
    `}};b("colors.primarySubduedLight"),b("colors.cool20"),b("colors.tertiaryType1Light"),b("colors.primaryCoreLightened"),b("colors.tertiaryType6Light"),b("colors.cool20"),b("colors.cool50");var Ti=t`:host {
  display: block;
  box-sizing: border-box;
  --bbva-transition-container-padding: 0;
}

:host([hidden]), [hidden] {
  display: none !important;
}

[data-tag-name=bbva-transition-container] .heading-menu {
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
  font-style: var(--fontFacePrimaryMediumFontStyle, ${i(v.medium.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${i(v.medium.fontWeight)});
}
[data-tag-name=bbva-transition-container] [data-tag-name=bbva-notification-help] {
  padding-top: calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1em);
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class ki extends(y(f(Xe(c(h))))){static get scopedElements(){const e=[u,_,S,Tt,Ci,$,We,...ki.configurationScopedElements()];return ki.scopedElementsFromClasses(e)}static get is(){return"emergency-reports-menu"}static get properties(){return{menuEmergency:{type:Boolean,attribute:"menu-emergency"},dataPage:{type:Object},smartAssistant:{type:Boolean,attribute:"smart-assistant"},withoutEmergencies:{type:Boolean,attribute:"without-emergencies"},_helpIcon:{type:String},timeNotificationToast:{type:Number,attribute:"time-notification-toast"},hideIconText:{type:Boolean,attribute:"hide-icon-text"}}}constructor(){super(),this.timeNotificationToast=3e3,this.dataPage={},this.menuEmergency=!1,this.smartAssistant=!1,this.withoutEmergencies=!1,this.hideIconText=!1}static get styles(){return[Ti,xi.light,kt.light,x.light,C.light,T.light,m("emergency-reports-menu-shared-styles")]}_callPhoneNumber(e,t){const i=String(t).split("#"),s={phoneNumber:i[0]||void 0,showConfirmation:!0,extension:i[1]||void 0};this._dispatchCustomEvent(e,s)}_actionButton(e,t){e.stopPropagation(),"rejectedCard"===t.id?this._callPhoneNumber(t.event,this.dataPage.phoneRejected):this._dispatchCustomEvent(t.event,{data:t.detail,id:t.identifier})}_iconTextHeader(e){return this.hideIconText?"":this.t(e)}get _helpIcon(){return"es"===this.language&&this.smartAssistant?k():I()}_getSlot(e){return[...this.children].some((t=>t.getAttribute("slot")===e))}get _transitionHeaderButtons(){return[{id:"btn-help",name:"Help",icon:this._helpIcon,accessibilityText:this.t("emergency-reports-header-help-accessibility-text"),label:this._iconTextHeader("emergency-reports-header-help")}]}get _emergencyReportsMenuContent(){return this._getSlot("slot-content")?g`
          <span class="slot-content"><slot name="slot-content"></slot></span>
        `:""}get _descriptionPolicy(){var e,t,i,s;return`${null===(e=this.dataPage)||void 0===e||null===(t=e.vehicleSelected)||void 0===t?void 0:t.lightingText} <br> ${this.t("emergency-reports-insurance-policy")} ${null===(i=this.dataPage)||void 0===i||null===(s=i.vehicleSelected)||void 0===s?void 0:s.policy}`}get _menuOptions(){return g`
      ${Object.keys(this.dataPage).length?this._showOptionMenu:E}
    `}get _subtitle(){var e;return g`
      <bbva-text
        class="heading-menu"
        text=${this.t(null===(e=this.dataPage)||void 0===e?void 0:e.subtitle)}
        tag="h2"
        alignment="left"
        size="L"
        unset
      ></bbva-text>
    `}get _notificationHelp(){return g`
      <bbva-notification-help
        accessibility-label-icon="Info"
        icon=${w()}
        text="${this.t("emergency-reports-menu-notice")}"
      >
      </bbva-notification-help>
    `}get _toastMessage(){return g`
      <bbva-notification-toast
        fixed-bottom
        type="success"
        ?show="${this.withoutEmergencies}"
        auto-hide
        icon-explainer="${R()}"
        duration="${this.timeNotificationToast}"
        accessibility-tex="${this.t("emergency-reports-menu-toast-message")}"
        @notification-toast-close="${e=>{e.stopPropagation(),this._dispatchCustomEvent("emergency-reports-menu-toast-close",!1)}}"
      >
        <p>${this.t("emergency-reports-menu-toast-message")}</p>
      </bbva-notification-toast>
    `}get _showOptionMenu(){const e=this.dataPage.options.filter((e=>e.show));return g`
      ${Je(e,((t,i)=>g`
          <bbva-button-list
            .icon="${t.icon}"
            title-text="${this.t(t.title,{title:t.value})}"
            @click="${e=>this._actionButton(e,t)}"
          ></bbva-button-list>
          ${i<e.length-1?g`
                <bbva-divider></bbva-divider>
              `:E}
        `))}
    `}get _changeVehicle(){var e,t,i,s;return g`
      <bbva-list-link
        multiline
        link-text="${this.dataPage.insuranceContracts>1?this.t("emergency-reports-insurance-text-change"):""}"
        no-header-link
        link-icon-left="${null===(e=this.dataPage)||void 0===e||null===(t=e.vehicleSelected)||void 0===t?void 0:t.icon}"
        header-text="${this._descriptionPolicy}"
        lighting-text="${this.t(null===(i=this.dataPage)||void 0===i||null===(s=i.vehicleSelected)||void 0===s?void 0:s.lightingText)}"
        accessibility-icon-link-text="${this.t("emergency-reports-insurance-text-change")}"
        @list-link-click="${e=>{e.stopPropagation(),this._dispatchCustomEvent("emergency-reports-vehicle-changed")}}"
      >
      </bbva-list-link>
    `}get _menuEmergency(){var e,t,i,s;return g`
      <bbva-transition-container
        ambient="light"
        header-type="first-level-sequential"
        header-show-left-icon
        ?visible=${this.menuEmergency}
        header-text="${null===(e=this.dataPage)||void 0===e?void 0:e.title}"
        @visible-changed="${e=>this._dispatchCustomEvent("emergency-reports-menu-state",e.detail)}"
        .headerButtons="${this._transitionHeaderButtons}"
        header-left-icon-label="${this._iconTextHeader("emergency-reports-header-return")}"
        header-left-icon-aria-label="${this.t("emergency-reports-header-return-accessibility-text")}"
        ><div slot="slot-content">
          ${this._subtitle} ${null!==(t=this.dataPage)&&void 0!==t&&t.showLink?this._changeVehicle:E}
          ${null!==(i=this.dataPage)&&void 0!==i&&i.isMenuOptions?this._menuOptions:this._emergencyReportsMenuContent}
          ${this._toastMessage}
          ${null!==(s=this.dataPage)&&void 0!==s&&s.viewNoticeVisible?this._notificationHelp:E}
        </div>
      </bbva-transition-container>
    `}render(){return g`
      ${this._menuEmergency}
    `}}const Ii=new r;var Ei=t`:host {
  --_form-radio-group-help-icon-color: var(--bbva-form-radio-group-dark-mode-help-icon-color, var(--bbva-form-radio-group-help-icon-color, var(--colorsPrimaryMedium, ${i(n.primaryMedium)})));
  --_form-radio-group-help-icon-active-color: var(--bbva-form-radio-group-dark-mode-help-icon-active-color, var(--bbva-form-radio-group-help-icon-active-color, var(--colorsPrimaryCore, ${i(n.primaryCore)})));
  --_form-radio-group-label-out-color: var(--bbva-form-radio-group-dark-mode-label-out-color, var(--bbva-form-radio-group-label-out-color, var(--colorsSecondary600, ${i(n.secondary600)})));
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

[data-tag-name=bbva-notification-help] {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}

.label-out {
  display: flex;
  align-items: center;
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}

.label-out-text {
  font-weight: var(--typographyTypeMedium, ${i(s.typeMedium)});
  color: var(--_form-radio-group-label-out-color);
}

[data-tag-name=bbva-link] {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
  --bbva-link-with-icon-icon-color: var(--_form-radio-group-help-icon-color);
  --bbva-link-active-with-icon-icon-color: var(--_form-radio-group-help-icon-active-color);
}

:host([two-option]) {
  font-size: 0;
  position: relative;
  word-spacing: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}
:host([two-option]) .label-out {
  font-size: initial;
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
  word-spacing: initial;
}
:host([two-option]) ::slotted(*) {
  display: inline-block;
  font-size: initial;
  word-spacing: initial;
}
${Ii.mediaRules()}`;const wi=new r;var Ri=t`[ambient^=dark] {
  --bbva-form-radio-group-help-icon-color: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
  --bbva-form-radio-group-help-icon-active-color: var(--colorsPrimarySubduedLight, ${i(n.primarySubduedLight)});
  --bbva-form-radio-group-label-out-color: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
}

[ambient=dark400] {
  --bbva-form-radio-group-help-icon-color: var(--colorsPrimarySubdued, ${i(n.primarySubdued)});
  --bbva-form-radio-group-help-icon-active-color: var(--colorsPrimaryMediumLight, ${i(n.primaryMediumLight)});
}
${wi.mediaRules()}`;var Mi=t`[ambient^=light] {
  --bbva-form-radio-help-icon-color: initial;
  --bbva-form-radio-help-icon-active-color: initial;
  --bbva-form-radio-group-label-out-color: initial;
}
${(new r).mediaRules()}`;const Li={dark:t`
    ${Ri}
    ${It.dark}
    ${M.dark}
    ${xi.dark}
    ${T.dark}
  `,light:t`
    ${Mi}
    ${It.light}
    ${M.light}
    ${xi.light}
    ${T.light}
  `};let Pi=class extends(l(c(L(h)))){static get is(){return"bbva-form-radio-group"}static get scopedElements(){return{"bbva-form-radio-button":Et,"bbva-notification-help":Ci,"bbva-text":u,"bbva-link":P}}static get properties(){return{name:{type:String,reflect:!0},items:{type:Array},selected:{type:Number,reflect:!0},readonly:{type:Boolean},required:{type:Boolean},disabled:{type:Boolean},invalid:{type:Boolean,reflect:!0},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},twoOption:{type:String,reflect:!0,attribute:"two-option"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},labelOut:{type:String,attribute:"label-out"},helpIcon:{type:Boolean,attribute:"help-icon"},optionalLabel:{type:String,attribute:"optional-label"},linkHref:{type:String,attribute:"link-href"},linkAccessibilityText:{type:String,attribute:"link-accessibility-text"}}}constructor(){super(),this.items=[],this.selected=-1,this.errorIcon=A(),this.errorIconSize=16,this.infoIcon=w(),this.infoIconSize=16,this.name=`form-radio-group-${((e=10)=>`${Math.random().toString(36).substr(2,e)}`)()}`,this.optionalLabel="bbva-form-radio-group-optional-label",this.linkAccessibilityText="bbva-form-radio-group-link-accessibility-text"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.getAttribute("role")||this.setAttribute("role","radiogroup"),this.addEventListener("slotschanges",(e=>this._setRadioName(e)))}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("slotschanges",this._setRadioName())}_setRadioName(e){(((e||{}).detail||{}).contentSlots||[]).forEach((e=>{const t=(e||{}).assignedNodes;"bbva-form-radio-button"===(t.getAttribute("data-tag-name")||(t||{}).nodeName).toLowerCase()&&(t.name=this.name)}))}get radioItems(){return Array.from(this.querySelectorAll('[data-tag-name="bbva-form-radio-button"]'))}firstUpdated(e){super.firstUpdated&&super.firstUpdated(e),this._itemsContainer=this.shadowRoot.querySelector(".form-radio-group-container"),this._itemsContainer&&this.appendChild(this._itemsContainer.content),this.addEventListener("change",(e=>this._updateItems(e)))}updated(e){if(super.updated&&super.updated(e),e.has("selected")&&this.radioItems.length)if(Number.isFinite(this.selected)&&this.selected>-1&&this.selected<this.radioItems.length)this.radioItems[this.selected].checked=!0;else{const e=this.radioItems.find((e=>e.checked));e&&(e.checked=!1)}e.has("disabled")&&this.radioItems.length&&(this.setAttribute("aria-disabled",this.disabled.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].disabled=this.disabled}))),e.has("invalid")&&this.radioItems.length&&(this.setAttribute("aria-invalid",this.invalid.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].invalid=this.invalid}))),e.has("readonly")&&this.radioItems.length&&(this.setAttribute("aria-readonly",this.readonly.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].readonly=this.readonly}))),e.has("required")&&this.radioItems.length&&(this.setAttribute("aria-required",this.required.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].required=!1})),this.radioItems[0].required=!0)}_updateItems(e){const t=this.radioItems.indexOf(e.target);this.selected=t,this.invalid=!1,this.dispatchEvent(new CustomEvent("form-radio-group-item-change",{detail:{value:e.target.value,selected:t},bubbles:!0,composed:!0}))}_helpClicked(e){e.stopPropagation(),this.dispatchEvent(new CustomEvent("bbva-form-radio-group-help-click",{detail:!0,bubbles:!0,composed:!0}))}get _helpIcon(){return this.helpIcon?g`
        <bbva-link
          aria-label="${this.t(this.linkAccessibilityText)}"
          icon-size="24"
          @click="${this._helpClicked}"
          href="${D(this.linkHref)}"
          icon="${I()}"
        >
        </bbva-link>
      `:""}get _labelOut(){if(this.labelOut){const e=this.t(this.labelOut);return g`
        <div class="label-out">
          <bbva-text
            id="labelOutText"
            unset
            class="label-out-text"
            text="${this.required?e:`${e} ${this.t(this.optionalLabel)}`}"
            size="S"
          >
          </bbva-text>
          ${this._helpIcon}
        </div>
      `}return""}static get styles(){return[Ei,m("bbva-form-radio-group-shared-styles"),Li.dark,Li.light]}render(){return g`
      ${this._labelOut}
      <slot></slot>
      <template class="form-radio-group-container">
        ${this.items.map((e=>g`
            <bbva-form-radio-button
              .name="${this.name}"
              .value="${e.value}"
              label="${e.label}"
              divider="${D(e.divider)}"
              ?disabled="${e.disabled}"
              ?checked="${e.checked}"
              ?required="${e.required}"
              ?label-medium="${e.labelMedium}"
              .errorIcon="${this.errorIcon}"
              .errorIconSize="${this.errorIconSize}"
              .errorMessage="${e.invalid?e.errorMessage:""}"
              .infoIcon="${this.infoIcon}"
              .infoIconSize="${this.infoIconSize}"
              .infoMessage="${e.infoMessage}"
              accessibility-icon-info-notification="${D(e.accessibilityIconInfo)}"
              accessibility-icon-alert-notification="${D(e.accessibilityIconAlert)}"
              variant="${D(e.variant)}"
            >
              ${e.text?O(e.text):e.label}
            </bbva-form-radio-button>
          `))}
      </template>
      ${this.invalid&&this.errorMessage?g`
            <bbva-notification-help
              class="alert"
              .icon="${this.errorIcon}"
              .iconSize="${this.errorIconSize}"
              .text="${this.errorMessage}"
              hide-top-padding
              hide-bottom-padding
              hide-left-padding
              hide-right-padding
            ></bbva-notification-help>
          `:""}
    `}};b("colors.primarySubdued"),b("colors.primaryMediumLight"),b("colors.primaryCoreLightened");var Ai=t`:host {
  display: flex;
  flex-direction: column;
  box-sizing: border-box;
  text-align: center;
  position: relative;
  --_emergency-reports-panel-info-title-color: var(--emergency-reports-panel-info-title-dark-mode-color, var(--colorsSecondary600, ${i(n.secondary600)}));
  --_emergency-reports-panel-info-text-color: var(--emergency-reports-panel-info-text-dark-mode-color, var(--colorsSecondary600, ${i(n.secondary600)}));
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.content {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1em) calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1em);
  margin: 0;
}
.content .title {
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
  color: var(--_emergency-reports-panel-info-title-color);
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${i(v.medium.fontWeight)});
  line-height: var(--lineHeightTypeLarge, ${i(a.typeLarge)});
}
.content .description {
  margin: 0 auto;
  color: var(--_emergency-reports-panel-info-text-color);
}

[data-tag-name=bbva-clip-microillustration] {
  margin: calc(((2.25 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}
`;class Di extends(y(f(Xe(c(h))))){static get is(){return"emergency-reports-panel-info"}static get scopedElements(){const e=[P,u,V,...Di.configurationScopedElements()];return Di.scopedElementsFromClasses(e)}static get styles(){return[Ai,T.light,M.light,m("emergency-reports-panel-info-shared-styles")]}static get properties(){return{microillustration:{type:String},titleMessage:{type:String,attribute:"title-message"},description:{type:String},linkText:{type:String,attribute:"link-text"},sizeIcon:{type:String,attribute:"size-icon"}}}constructor(){super(),this.microillustration="",this.titleMessage="",this.description="",this.linkText="",this.sizeIcon=""}_buttonClickHandler(){this.dispatchEvent(new CustomEvent("emergency-reports-panel-info-link-click",{detail:!0,bubbles:!0,composed:!0}))}get _microillustration(){return g`
      <span>
        ${this.microillustration}
      </span>
    `}get _contentTitle(){return g`
      <bbva-text
        text=${this.titleMessage}
        class="title"
        size="L"
        alignment="center"
        inherit
        tag="h2"
      ></bbva-text>
    `}get _contentDescription(){return g`
      <bbva-text
        class="description"
        text=${this.description}
        size="S"
        alignment="center"
        inherit
      ></bbva-text>
    `}render(){return g`
      <bbva-clip-microillustration
        microillustration="${this.microillustration}"
        size="${this.sizeIcon}"
      ></bbva-clip-microillustration>
      <div class="content">
        ${this._contentTitle} ${this._contentDescription}
        ${this.linkText&&g`
            <bbva-link @click="${this._buttonClickHandler}" .text="${this.linkText}"></bbva-link>
          `}
      </div>
    `}}b("colors.primaryCoreLightened"),b("colors.primaryCoreLightened");class Oi{constructor(e){this.controller=e}t(...e){return this.controller.t(...e)}get data(){var e;return null===(e=this.controller)||void 0===e?void 0:e.data}_callPhoneNumber(e,t){const i=String(t).split("#"),s={phoneNumber:i[0]||void 0,showConfirmation:!0,extension:i[1]||void 0};this.controller.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:s}))}dispatchCustomEvent(e,t=!0){this.controller.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}}class Ni extends Oi{configs(){return{fullHeight:!0,hideContentPaddingTop:!0,fixedFooter:!0,headerType:"modal-initial",headerText:"emergency-reports-connection-error-header-text",buttonText:"emergency-reports-connection-error-button-text",linkText:"emergency-reports-connection-error-link-text"}}footerLinkClick(){this.dispatchCustomEvent("emergency-reports-connection-error-link-click")}closeButtonClick(){this.dispatchCustomEvent("emergency-reports-connection-error-close-click")}footerButtonClick(){this.dispatchCustomEvent("emergency-reports-connection-error-button-click",{setting:"settings"})}render(){return g`
      <div slot="slot-content" ambient="light">
        <emergency-reports-panel-info
          size-icon="L"
          microillustration="errorconnection"
          title-message="${this.t("emergency-reports-connection-error-title")}"
          description="${this.t("emergency-reports-connection-error-content")}"
        ></emergency-reports-panel-info>
      </div>
    `}}class qi extends Oi{configs(){return{fullHeight:!0,hideContentPaddingTop:!0,fixedFooter:!0,headerType:"modal-initial",headerText:"emergency-reports-error-header-text",buttonText:this.data.viewCallBbvaLine?"emergency-reports-error-button-text":"emergency-reports-error-link-text",linkText:this.data.viewCallBbvaLine?"emergency-reports-error-link-text":""}}closeButtonClick(){this.dispatchCustomEvent("emergency-reports-error-services-close-click")}footerLinkClick(){this.dispatchCustomEvent("emergency-reports-error-services-link-click")}footerButtonClick(){var e;this._callPhoneNumber("emergency-reports-error-services-button-click",null===(e=this.data)||void 0===e?void 0:e.phoneNumberBbvaLine)}render(){return g`
      <div slot="slot-content" ambient="light">
        <emergency-reports-panel-info
          microillustration="error"
          size-icon="L"
          title-message="${this.t("emergency-reports-error-title")}"
          description="${this.t("emergency-reports-error-content")}"
        ></emergency-reports-panel-info>
      </div>
    `}}class Vi extends Oi{configs(){return{fullHeight:!0,hideContentPaddingTop:!0,fixedFooter:!0,iconSecondary:!1,headerType:"modal-initial",headerText:"emergency-reports-insurance-help-header-text",buttonText:"emergency-reports-insurance-button-text"}}footerButtonClick(){this.dispatchCustomEvent("emergency-reports-vehicle-acepted-changed-click")}get _configVehicles(){var e;return null===(e=this.data)||void 0===e?void 0:e.optionsVehicles.map((e=>({text:`\n      ${e.name} ${e.subName}\n      <span slot="description">\n        ${this.t("emergency-reports-insurance-policy")}\n        ${e.policy}\n      </span>\n    `,value:e.name,divider:e.divider})))}render(){var e;return g`
      <div class="spaced-sides">
        <bbva-text
          text="${this.t("emergency-reports-insurance-vehicle-report")}"
          font-weight="500"
          size="L"
          alignment="left"
        ></bbva-text>
        <bbva-text
          text="${this.t("emergency-reports-insurance-vehicle-select")}"
          size="S"
          alignment="left"
        ></bbva-text>
      </div>
      <bbva-form-radio-group
        name="choice"
        selected="${(null===(e=this.data)||void 0===e?void 0:e.optionVehicleSelected)||0}"
        .items="${this._configVehicles}"
        required=""
        @form-radio-group-item-change="${e=>{this.dispatchCustomEvent("emergency-reports-modal-item-change",e.detail.selected)}}"
      >
      </bbva-form-radio-group>
    `}}class Bi extends Oi{configs(){return{fullHeight:!0,hideContentPaddingTop:!0,fixedFooter:!0,headerType:"modal-initial",headerText:"emergency-reports-error-vehicle-header-text",buttonText:"emergency-reports-error-vehicle-link-text"}}closeButtonClick(){this.dispatchCustomEvent("emergency-reports-error-services-vehicle-close-click")}footerButtonClick(){this.dispatchCustomEvent("emergency-reports-error-services-vehicle-button-click")}render(){return g`
      <div slot="slot-content" ambient="light">
        <emergency-reports-panel-info
          size-icon="L"
          microillustration="error"
          title-message="${this.t("emergency-reports-error-vehicle-title")}"
          description="${this.t("emergency-reports-error-vehicle-content")}"
        ></emergency-reports-panel-info>
      </div>
    `}}class Hi extends Oi{configs(){return{fullHeight:!0,hideContentPaddingTop:!0,fixedFooter:!0,headerType:"modal-initial",headerText:"emergency-reports-cards-help-header-text",buttonText:"emergency-reports-cards-help-button-text",iconSecondary:!0}}closeButtonClick(){this.dispatchCustomEvent("emergency-reports-atm-close-click")}footerButtonClick(){var e;this._callPhoneNumber("emergency-reports-atm-call-button-click",null===(e=this.data)||void 0===e?void 0:e.phoneNumberAtmReport)}secondaryButtonClick(){this.dispatchCustomEvent("emergency-reports-atm-icon-rigth-click")}get _atmBulletContainer(){return g`
      ${["emergency-reports-cards-help-ticket-info","emergency-reports-cards-help-number-info","emergency-reports-cards-help-branch-info","emergency-reports-cards-help-hour-info"].map((e=>g`
          <bbva-list-bullet>${this.t(e)}</bbva-list-bullet>
        `))}
    `}render(){return g`
      <div class="spaced-sides">
        <bbva-text
          text=${this.t("emergency-reports-cards-help-title")}
          font-weight="500"
          size="L"
          alignment="left"
        ></bbva-text>
        <bbva-text text="${this.t("emergency-reports-cards-help-content")}" size="M"></bbva-text>
        ${this._atmBulletContainer}
      </div>
    `}}class ji extends Oi{configs(){return{fullHeight:!0,hideContentPaddingTop:!0,fixedFooter:!0,headerType:"modal-initial",headerText:"emergency-reports-error-operation-header-text",buttonText:"emergency-reports-error-operation-button-text"}}closeButtonClick(){this.dispatchCustomEvent("emergency-reports-error-operation-close-click")}footerButtonClick(){this.dispatchCustomEvent("emergency-reports-error-operation-button-click")}render(){return g`
      <div slot="slot-content" ambient="light">
        <emergency-reports-panel-info
          size-icon="L"
          microillustration="error"
          title-message="${this.t("emergency-reports-error-operation-title")}"
          description="${this.t("emergency-reports-error-operation-content")}"
        ></emergency-reports-panel-info>
      </div>
    `}}var Fi=t`:host {
  --bbva-help-modal-padding: 0;
}

.spaced-sides {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1em);
}

[data-tag-name=bbva-text] {
  margin: gridSpacer(16px) 0 gridSpacer(16px);
}

[data-tag-name=bbva-help-modal][visible] {
  transform: translateZ(0.1px);
}

[data-tag-name=bbva-list-bullet] {
  text-align: left;
}

[data-tag-name=bbva-form-radio-button] {
  text-align: left;
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1em);
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class zi extends(y(c(f(h)))){static get MODES(){return{activateErrorConnection:"activateErrorConnection",activateErrorOperation:"activateErrorOperation",activateVehicleChange:"activateVehicleChange",activateErrorVehicle:"activateErrorVehicle",activateErrorService:"activateErrorService",activeHelpAtm:"activeHelpAtm"}}static get is(){return"emergency-reports-modal"}static get scopedElements(){const e=[u,_,Qe,F,Pi,Di,Hi,qi,Vi,ji,Ni];return zi.scopedElementsFromClasses(e)}static get properties(){return{visible:{type:Boolean},mode:{type:String,reflect:!0},data:{type:Object},smartAssistant:{type:Boolean,attribute:"smart-assistant"},routes:{type:Array},modalHeaderButtons:{type:Array,attribute:"modal-header-buttons"},hideIconText:{type:Boolean,attribute:"hide-icon-text"}}}static get styles(){return[Fi,Li.light,H.light,C.light,T.light,m("emergency-reports-modal-shared-styles")]}constructor(){super(),this.visible=!1,this.smartAssistant=!1,this.mode="",this.data={},this.routes=[],this.helpAtmPart=new Hi(this),this.errorVehicle=new Bi(this),this.errorServicesPart=new qi(this),this.errorConnectionPart=new Ni(this),this.changedVehicle=new Vi(this),this.errorOperation=new ji(this),this._resetConfig(),this.modalHeaderButtons=[],this._headerMainClickHandlers={0:()=>this._secondaryButtonClick(),1:()=>this._closeButtonClick()},this.hideIconText=!1}update(e){e.has("mode")&&(this._resetConfig(),this._configs(),this.modalHeaderButtons=this.iconSecondary?[{id:"btn-help",name:"Help",icon:this._helpIcon,accessibilityText:this.t("emergency-reports-header-help-accessibility-text"),label:this._iconTextHeader("emergency-reports-header-help")}]:[],this.modalHeaderButtons.push({id:"btn-close",name:"Close",icon:j(),accessibilityText:this.t("emergency-reports-header-close-accessibility-text"),label:this._iconTextHeader("emergency-reports-header-close")})),super.update(e)}_iconTextHeader(e){return this.hideIconText?"":this.t(e)}get _helpIcon(){return this.smartAssistant?k():I()}get _part(){const e={activeHelpAtm:this.helpAtmPart,activateErrorVehicle:this.errorVehicle,activateErrorService:this.errorServicesPart,activateErrorConnection:this.errorConnectionPart,activateErrorOperation:this.errorOperation,activateVehicleChange:this.changedVehicle};return this.mode in e?e[this.mode]:null}_configs(){this._part&&Object.assign(this,this._part.configs())}_resetConfig(){Object.assign(this,{linkText:"",buttonText:"",headerText:"",headerType:"modal-initial",fullHeight:!1,fixedFooter:!1,hideContentPaddingTop:!1,iconSecondary:!1})}get _content(){var e;return null===(e=this._part)||void 0===e?void 0:e.render()}_iconSecondary(){let e="";return this.iconSecondary&&(e=this.smartAssistant?k():I()),e}_footerButtonClick(){var e,t;this.visible=!1,null===(e=this._part)||void 0===e||null===(t=e.footerButtonClick)||void 0===t||t.call(e)}_footerLinkClick(){var e,t;this.visible=!1,null===(e=this._part)||void 0===e||null===(t=e.footerLinkClick)||void 0===t||t.call(e)}_closeButtonClick(){var e,t;this.visible=!1,null===(e=this._part)||void 0===e||null===(t=e.closeButtonClick)||void 0===t||t.call(e)}_secondaryButtonClick(){var e,t;this.visible=!1,null===(e=this._part)||void 0===e||null===(t=e.secondaryButtonClick)||void 0===t||t.call(e)}_changeVisible(e){const{detail:t,target:i}=e,s=null==t?void 0:t.visible,a="activateErrorService"===this.mode,r="activateErrorConnection"===this.mode;this.dispatchEvent(new CustomEvent("emergency-reports-change-status-modal",{bubbles:!0,composed:!0,detail:{visible:null==t?void 0:t.visible,property:this.mode}})),!a&&!r||this.routes.length||s||this.dispatchEvent(new CustomEvent("emergency-reports-close",{bubbles:!0,composed:!0,detail:{visible:t.visible,target:i,property:this.mode}}))}_handleHeaderMainClick(e){var t,i;const s=null==e||null===(t=e.detail)||void 0===t?void 0:t.index;null===(i=this._headerMainClickHandlers)||void 0===i||i[s]()}render(){return g`
      <bbva-help-modal
        ambient="light"
        header-text="${this.t(this.headerText)}"
        button-text="${this.t(this.buttonText)}"
        link-text="${this.t(this.linkText)}"
        header-type="${this.headerType}"
        ?full-height=${this.fullHeight}
        ?fixed-footer="${this.fixedFooter}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ?hide-content-padding-top=${this.hideContentPaddingTop}
        ?visible=${this.visible}
        @modal-state-change="${this._changeVisible}"
        @help-modal-footer-button-click=${()=>this._footerButtonClick()}
        @help-modal-footer-link-click=${()=>this._footerLinkClick()}
        @help-modal-header-click=${this._handleHeaderMainClick}
        .headerButtons="${this.modalHeaderButtons}"
        ><div slot="slot-content">
          ${this._content}
        </div>
      </bbva-help-modal>
    `}}var Gi=t`:host {
  display: block;
  box-sizing: border-box;
  text-align: left;
  --bbva-transition-container-padding: 0;
  --bbva-transition-container-text-align: left;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=help-faqs-aem] {
  height: auto;
}

[data-tag-name=bbva-button-list] {
  margin-top: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}
`;class Ui extends(y(f(Xe(c(h))))){static get scopedElements(){const e=[Vt,Tt,We,...Ui.configurationScopedElements()];return Ui.scopedElementsFromClasses(e)}static get is(){return"emergency-reports-menu-faqs"}static get properties(){return{showMenuFaqs:{type:Boolean,attribute:"show-menu-faqs"},phoneNumberBbvaLine:{type:String,attribute:"phone-number-bbva-line"},phoneNumberBbvaLineVehicle:{type:String,attribute:"phone-number-bbva-line-vehicle"},aemHost:{type:String,attribute:"aem-host"},contentFragmentPath:{type:String,attribute:"content-fragment-path"},visibleDetail:{type:Boolean,attribute:"visible-detail"},_headingLevel:{type:Number},productType:{type:String,attribute:"product-type"},hideIconText:{type:Boolean,attribute:"hide-icon-text"}}}constructor(){super(),this.phoneNumberBbvaLineVehicle="",this.phoneNumberBbvaLine="",this.contentFragmentPath="",this.productType="",this.aemHost="",this.showMenuFaqs=!1,this.visibleDetail=!1,this._headingLevel=2,this.hideIconText=!1}static get styles(){return[Gi,kt.light,m("emergency-reports-menu-faqs-shared-styles")]}_callPhoneNumber(e,t,i){const{detail:s}=i,a=void 0===s||1===s?"":String(s),r=String(a||t).split("#"),o={phoneNumber:r[0]||void 0,showConfirmation:!0,extension:r[1]||void 0};this._dispatchCustomEvent(e,o)}_iconTextHeader(e){return this.hideIconText?"":this.t(e)}get _menuEmergencyFaqs(){return g`
      <bbva-transition-container
        ambient="light"
        header-type="first-level-sequential"
        header-show-left-icon
        ?visible=${this.showMenuFaqs}
        header-text="${this.t("emergency-reports-header-help-faqs")}"
        @visible-changed="${e=>this._dispatchCustomEvent("emergency-reports-menu-faqs-state",e.detail)}"
        header-left-icon-label="${this._iconTextHeader("emergency-reports-header-return")}"
        header-left-icon-aria-label="${this.t("emergency-reports-header-return-accessibility-text")}"
        ><div slot="slot-content">
          <help-faqs-aem
            ?i-o-s-fixed-header="${this.iOSFixedHeader}"
            ?show-modal="${this.visibleDetail}"
            ?hide-icon-text="${this.hideIconText}"
            language="${this.language}"
            host="${this.aemHost}"
            ?native="${this.native}"
            content-fragment-path="${this.contentFragmentPath}"
            hide-footer
            headingLevel="${this._headingLevel}"
            @help-faqs-aem-detail-link-click="${e=>{e.stopPropagation(),this._callPhoneNumber("emergency-reports-detail-faqs-click","",e)}}"
            @help-modal-header-click="${e=>{e.stopPropagation(),this._dispatchCustomEvent("emergency-reports-detail-faqs")}}"
          ></help-faqs-aem>
          <bbva-button-list
            icon="${z()}"
            title-text=${"CARD"===this.productType?this.t("emergency-reports-cards-faqs-call-title"):this.t("emergency-reports-insurance-faqs-call-title")}
            text=${"CARD"===this.productType?this.phoneNumberBbvaLine:this.phoneNumberBbvaLineVehicle}
            @click="${e=>{e.stopPropagation(),this._callPhoneNumber(`emergency-reports-${this.productType.toLocaleLowerCase()}-faqs-telephone`,"CARD"===this.productType?this.phoneNumberBbvaLine:this.phoneNumberBbvaLineVehicle,"")}}"
          ></bbva-button-list>
        </div>
      </bbva-transition-container>
    `}render(){return g`
      ${this._menuEmergencyFaqs}
    `}}const Ki={CARD:"accountscards",INSURANCE:"car"},Xi={STOLE_LOST_CARD:G(),REJECTED_CARD:U(),ATM_NO_MONEY:K(),SHOCK:X(),CRANE:W(),STOLE:G(),REPLACEMENT_DRIVER:J(),VEHICLE_ASSISTANCE:Q(),TIRE:Y(),CURRENT_FLOW:Z(),GLASS:ee()};class Wi extends(y(c(f(Xe(h))))){static get is(){return"emergency-reports-dm"}static get scopedElements(){const e=[Ye,ni,Ze];return Wi.scopedElementsFromClasses(e)}static get properties(){return{financialOverviewApiVersion:{type:String,attribute:"financial-overview-api-version"},appSettingsApiVersion:{type:String,attribute:"app-settings-api-version"},vehicleInsurancesApiVersion:{type:String,attribute:"vehicle-insurance-api-version"},publicSettingsId:{type:String,attribute:"public-settings-id"},publicSettingsKey:{type:String,attribute:"public-settings-key"},productTypeEmergencies:{type:Array,attribute:"product-type-emergencies"},fieldsProperty:{type:String,attribute:"fields-property"},motorcycleId:{type:String,attribute:"motorcycle-id"},publicSettings:{type:Array,attribute:"public-settings"},financialOverview:{type:Object,attribute:"financial-overview"},stopInitServices:{type:Boolean,attribute:"stop-init-services"},vehicleInsuranceContracts:{type:Array,attribute:"vehicle-insurances"},vehicleInsuranceProductTypes:{type:Array,attribute:"vehicle-insurance-product-types"},allowedInsurers:{type:Array,attribute:"allowed-insurers"},otherInsurers:{type:Array,attribute:"other-insurers"},descriptionVehicles:{type:Array,attribute:"description-vehicles"},optionsVehicle:{type:Array,attribute:"options-vehicle"},_vehicleContractsData:{type:Array},_getEmergenciesReports:{type:Array},_getContractsFinancial:{type:Array},_showEmergencies:{type:Array},emergencyReportsConfig:{type:Object,attribute:"emergency-reports-config"},_existContracts:{type:Boolean}}}constructor(){super(),this.emergencyReportsConfig={},this.stopInitServices=!1,this._existContracts=!1,this.phoneNumberBbvaLine="",this.publicSettingsKey="",this.publicSettingsId="",this.financialOverviewApiVersion="0",this.vehicleInsurancesApiVersion="1",this.appSettingsApiVersion="0",this.vehicleInsuranceProductTypes=[],this.vehicleInsuranceContracts=[],this.productTypeEmergencies=[],this._getEmergenciesReports=[],this._getContractsFinancial=[],this.optionsVehicle=[],this.allowedInsurers=[],this.otherInsurers=[],this._vehicleContractsData=[],this._showEmergencies=[],this._contracts=[],this._emergencies=[],this.descriptionVehicles=[],this.fieldsProperty="",this.financialOverview={},this.publicSettings=[]}firstUpdated(){this.stopInitServices||(super.firstUpdated(),this.executeServices())}async executeServices(){await this._getDms(),await this.getPublicSettingsDm(),await this.getFinancialOverviewDm()}_getDms(){this._financialOverviewDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-financial-overview-api-dm"]'),this._publicSettingsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-public-settings-api-dm"]'),this._vehicleInsuranceDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-vehicle-insurance-api-dm"]')}update(e){super.update(e),(e.has("_getEmergenciesReports")&&Boolean(this._getEmergenciesReports.length)||e.has("_existContracts")&&this._existContracts)&&this._emergencies.length&&this._contracts.length&&(this.vehicleInsuranceProductTypes.length&&this._validExistVehicle(),this._validExistContract()),e.has("_showEmergencies")&&Boolean(this._showEmergencies.length)&&this._showEmergenciesReports()}_setPublicSettingsResponse(e){var t;const i=((null==e?void 0:e.detail)||e).find((e=>e.key===this.publicSettingsKey)),s=JSON.parse(null==i?void 0:i.value);this._emergencies=null==s||null===(t=s.data)||void 0===t?void 0:t.emergencies,this._getConfigProducts()}_setFinancialOverviewResponse(e){const{contracts:t}=(null==e?void 0:e.detail)||e;this._contracts=t;const i=this._contracts.map((e=>Wi._getContract(e.productType)));this._getContractsFinancial=i.filter(((e,t)=>i.indexOf(e)===t)),this._existContracts=Boolean(this._getContractsFinancial.length),this._existContracts||this._dispatchCustomEvent("emergency-reports-setup",this._showEmergencies)}_setVehicleInsuranceResponse({detail:e}){var t,i,s;const a=null==e||null===(t=e.vehicle)||void 0===t||null===(i=t.vehicleType)||void 0===i||null===(s=i.subType)||void 0===s?void 0:s.id,r=this._getIconVehicle(a);this._createVehicleOptions(e),this._saveVehicleContracts(e),this._createDescriptionVehicle(r,a,e),1===this.optionsVehicle.length?this._detailInsuranceVehicle("emergency-reports-get-vehicle-insurances"):this.optionsVehicle.length===this.vehicleInsuranceContracts.length?this._detailInsuranceVehicle("emergency-reports-get-more-vehicle-insurances"):this.optionsVehicle.length>1&&this._getVehicleInsurance(this.optionsVehicle.length)}_operationError(){this._dispatchCustomEvent("emergency-reports-active-modal-operation-error")}_communicationError(){this._dispatchCustomEvent("emergency-reports-active-modal-communication-error")}_vehicleError(){this.descriptionVehicles.length?(this.descriptionVehicles.length=1,this._vehicleContractsData.length=1,this.optionsVehicle.length=1,this._detailInsuranceVehicle("emergency-reports-error-get-more-vehicle-insurance")):this.descriptionVehicles.length||this._detailInsuranceVehicle("emergency-reports-error-get-vehicle-insurance")}_createVehicleOptions(e){this.optionsVehicle=[...this.optionsVehicle,{name:`${Wi._capitalize(e.vehicle.model.brand.name.toLowerCase())}`,subName:`${Wi._capitalize(e.vehicle.model.subBrand.name.toLowerCase())}`,policy:e.policyNumber,value:`${Wi._capitalize(e.vehicle.model.brand.name.toLowerCase())} ${Wi._capitalize(e.vehicle.model.subBrand.name.toLowerCase())}`,divider:""+(this.optionsVehicle.length<this.vehicleInsuranceContracts.length-1?"full":"")}]}_saveVehicleContracts(e){this._vehicleContractsData=[...this._vehicleContractsData,e]}_createDescriptionVehicle(e,t,i){this.descriptionVehicles=[...this.descriptionVehicles,{icon:e,type:t,policy:i.policyNumber,lightingText:`${Wi._capitalize(i.vehicle.model.brand.name.toLowerCase())} ${Wi._capitalize(i.vehicle.model.subBrand.name.toLowerCase())}`}]}_getIconVehicle(e){return e!==this.motorcycleId||""===e||""===this.motorcycleId?te():ie()}_getConfigProducts(){this._getEmergenciesReports=this._emergencies.map((e=>{const t=this._createEmergency(e),i=Wi._createOptionEmergency(null==e?void 0:e.productType,null==e?void 0:e.emergency);return Object.assign(e,{emergency:i,optionCard:t}),e}))}_createEmergency(e){return{heading:`emergency-reports-heading-${Wi._getContract(e.productType).toLowerCase()}`,microillustration:Ki[Wi._getContract(e.productType)],evt:this.t(`emergency-reports-${Wi._getContract(e.productType).toLowerCase()}-click`)}}static _createOptionEmergency(e,t){return t.map((t=>({id:Wi._camelCase(t.id),identifier:t.id,show:!0,title:`emergency-reports-${Wi._getContract(e).toLowerCase()}-${t.id.split("_")[0].toLowerCase()}-title`,value:t.helpDescription,icon:Xi[t.id],event:`emergency-reports-${Wi._getContract(e).toLowerCase()}-${t.id.split("_")[0].toLowerCase()}-click`,detail:{}})))}static _getContract(e){return e.split("_").find((e=>"INSURANCE"===e))||e.split("_")[0]}_detailInsuranceVehicle(e){this._dispatchCustomEvent(e,{optionsVehicle:this.optionsVehicle,vehicleContractsData:this._vehicleContractsData,descriptionVehicles:this.descriptionVehicles})}static _camelCase(e){return e.toLowerCase().split("_").map(((e,t)=>t>0?e.charAt(0).toUpperCase()+e.slice(1):e)).join("")}static _capitalize(e){return e.charAt(0).toUpperCase()+e.slice(1)}_validExistVehicle(){this.vehicleInsuranceProductTypes.forEach((e=>{const t=this._emergencies.find((t=>t.productType===e))||[];let i={};this._contracts.forEach((s=>{var a;const r=(null==s?void 0:s.productType)===e,o=(null==s?void 0:s.productType)===(null==t?void 0:t.productType),n=(null==s||null===(a=s.subProductType)||void 0===a?void 0:a.id)===(null==t?void 0:t.flowSubProductType);if(r){var l,c;o&&n&&(i=s);const e=Boolean(this.allowedInsurers.length||this.otherInsurers.length);"INSURANCE"===(null==s?void 0:s.productType)&&(this._productDescription=null==s||null===(l=s.detail)||void 0===l?void 0:l.productDescription),"SINGLE_INSURANCE"===(null==s?void 0:s.productType)&&(this._productDescription=null==s||null===(c=s.detail)||void 0===c?void 0:c.relatedInsurances),this._existProductRelated(this._productDescription)&&e&&(i=s),Object.keys(i).length&&(this.vehicleInsuranceContracts=[...this.vehicleInsuranceContracts,i])}i={}})),this.vehicleInsuranceContracts.length||(this._getContractsFinancial=this._getContractsFinancial.filter((e=>"INSURANCE"!==e)))})),this._dispatchCustomEvent("emergency-reports-contracts-insurances",{insuranceContracts:this.vehicleInsuranceContracts})}_existProductRelated(e){var t;return"string"!=typeof e&&e?null===(t=e.find((e=>this.allowedInsurers.find((t=>t===e.productDescription))||this.otherInsurers.find((t=>t===e.productDescription)))))||void 0===t?void 0:t.productDescription:this.allowedInsurers.find((t=>t===e))||this.otherInsurers.find((t=>t===e))}_validExistContract(){let e={};this._getContractsFinancial.length?Boolean(this._getEmergenciesReports.length)&&Boolean(this._getContractsFinancial.length)&&(this._getEmergenciesReports.forEach((t=>{e=null==t?void 0:t.productType,this._getContractsFinancial.forEach((i=>{i===Wi._getContract(e)&&(this._showEmergencies=[...this._showEmergencies,t])}))})),this._validTypeMessage()):this._dispatchCustomEvent("emergency-reports-show-message-no-contracts",{show:!0})}_validTypeMessage(){this._emergencies.find((e=>"CARD"===e.productType))||this._showEmergencies.length?Boolean(this._emergencies.find((e=>"CARD"===e.productType)))&&!this._showEmergencies.length&&this._dispatchCustomEvent("emergency-reports-show-message-no-contracts",{show:!0}):this._dispatchCustomEvent("emergency-reports-show-message-no-emergencies",{show:!0})}_showEmergenciesReports(){var e,t;const i=null===(e=this.emergencyReportsConfig)||void 0===e?void 0:e.vehicleInsurance,s=null===(t=this.emergencyReportsConfig)||void 0===t?void 0:t.card,a=Object.keys(s||{}).length,r=Object.keys(i||{}).length;if(Object.keys(this.emergencyReportsConfig).length&&(a||r)){let e=[];e=this._validationEmergency(s,null==s?void 0:s.card,"CARD"),e=this._validationEmergency(i,null==i?void 0:i.vehicleInsurance,"INSURANCE"),e=this._validationEmergency(i,null==i?void 0:i.vehicleInsurance,"SINGLE_INSURANCE"),this._dispatchCustomEvent("emergency-reports-setup",e)}else this._dispatchCustomEvent("emergency-reports-setup",this._showEmergencies)}_validationEmergency(e,t,i){let s=[];return t?s=[...this._hideEmergencies(i,e,s)]:(s=[...this._hideEmergency(i,s)],this._deletedEmergency(i)),s}_deletedEmergency(e){this._showEmergencies.forEach(((t,i)=>{t.productType===e&&this._showEmergencies.splice(i,1)}))}_hideEmergency(e,t){return t.length?t.filter((t=>t.productType!==e)):this._showEmergencies.filter((t=>t.productType!==e))}_hideEmergencies(e,t,i){let s=[];return i.length?(i.forEach((i=>{s=[...s,Wi._buildObject(i,e,t)]})),s):(this._showEmergencies.forEach((i=>{s=[...s,Wi._buildObject(i,e,t)]})),s)}static _buildObject(e,t,i){const s=e;return e.productType===t&&e.emergency.forEach(((e,t)=>{s.emergency[t].show=i[e.id]??!0})),s}_getVehicleInsurance(e){this._vehicleInsuranceDm.getVehicleInsurance(this.vehicleInsuranceContracts[e].id,{fields:this.fieldsProperty})}get _tplDms(){return g`
      <bbva-global-financial-overview-api-dm
        version="${this.financialOverviewApiVersion}"
        ?native="${this.native}"
        host="${this.host}"
        .requiredToken="${this.requiredToken}"
        @financial-overview-api-dm-fetch="${this._setFinancialOverviewResponse}"
        @financial-overview-api-dm-fetch-error="${this._operationError}"
        @api-dm-error="${this._communicationError}"
      ></bbva-global-financial-overview-api-dm>
      <bbva-global-public-settings-api-dm
        version="${this.appSettingsApiVersion}"
        ?native="${this.native}"
        host="${this.publicSettingsHost}"
        requiredtoken="${this.publicSettingsRequiredToken}"
        @public-settings-api-dm-fetch="${this._setPublicSettingsResponse}"
        @public-settings-api-dm-fetch-error="${this._operationError}"
        @api-dm-error="${this._communicationError}"
      ></bbva-global-public-settings-api-dm>
      <bbva-global-vehicle-insurance-api-dm
        version="${this.vehicleInsurancesApiVersion}"
        ?native="${this.native}"
        host="${this.host}"
        .requiredToken="${this.requiredToken}"
        @vehicle-insurance-api-dm-fetch="${this._setVehicleInsuranceResponse}"
        @vehicle-insurance-api-dm-fetch-error="${this._vehicleError}"
        @api-dm-error="${this._vehicleError}"
      ></bbva-global-vehicle-insurance-api-dm>
    `}resetApiServices(){this._getDms(),this.publicSettings=[],this.financialOverview={},this._publicSettingsDm.resetPublicSettings(),this._financialOverviewDm.resetFinancialOverview(),this._vehicleInsuranceDm.resetVehicleInsurance()}async getPublicSettingsDm(){this.publicSettings.length?(this._publicSettingsDm.publicSettings=this.publicSettings,this._setPublicSettingsResponse(this.publicSettings)):this._publicSettingsDm.getPublicSettings(this.publicSettingsId,{key:this.publicSettingsKey})}async getFinancialOverviewDm(){Object.keys(this.financialOverview).length?(this._financialOverviewDm.financialOverview=this.financialOverview,this._setFinancialOverviewResponse(this.financialOverview)):this._financialOverviewDm.getFinancialOverview({"contracts.productType":this.productTypeEmergencies})}getPolicyInsurance(){return new Promise((e=>{this.addEventListener("emergency-reports-get-vehicle-insurances",(t=>e(t))),this._getVehicleInsurance(0)}))}getMorePolicyInsurance(){return new Promise((e=>{this.addEventListener("emergency-reports-get-more-vehicle-insurances",(t=>e(t))),this._getVehicleInsurance(1)}))}render(){return g`
      ${this._tplDms}
    `}}var Ji=t`:host {
  position: fixed;
  width: 100%;
  max-width: 45rem;
}

[data-tag-name=bbva-text]:first-child {
  overflow: hidden;
  margin: calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem) 0 calc(((4.375 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-text]:nth-child(2) {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem) calc(((1.875 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class Qi extends(y(c(f(Xe(h))))){static get is(){return"emergency-reports-section"}static get scopedElements(){const e=[u,_,se,Di,...Qi.configurationScopedElements()];return Qi.scopedElementsFromClasses(e)}static get properties(){return{emergencyReports:{type:Array},showInfo:{type:Boolean,attribute:"show-info"},withoutProducts:{type:Boolean,attribute:"without-products"},phoneNumberBbvaLine:{type:String,attribute:"phone-number-bbva-line"},viewActiveReport:{type:Boolean,attribute:"view-active-report"},adjusterTracking:{type:Boolean,attribute:"adjuster-tracking"}}}constructor(){super(),this.phoneNumberBbvaLine="",this.emergencyReports=[],this.showInfo=!1,this.withoutProducts=!1,this.viewActiveReport=!1,this.adjusterTracking=!1}_showActiveReport(e){return e.includes("insurance")&&this.viewActiveReport&&this.adjusterTracking}static get styles(){return[Ji,T.light,C.light,ae.light,m("emergency-reports-section-shared-styles")]}_callPhoneNumber(e){e.stopPropagation();const t=String(this.phoneNumberBbvaLine).split("#"),i={phoneNumber:t[0]||void 0,showConfirmation:!0,extension:t[1]||void 0};this._dispatchCustomEvent("emergency-reports-panel-info-link-click",i)}get _sectionEmergencyReports(){return g`
      <bbva-text
        tag="h2"
        unset
        class="header-section"
        text="${this.t("emergency-reports-title")}"
        alignment="center"
        font-weight="500"
        size="XL"
      ></bbva-text>
      <bbva-text
        tag="h3"
        unset
        class="subheader-section"
        text="${this.t("emergency-reports-subtitle")}"
        size="S"
        alignment="center"
      ></bbva-text>
      ${this._renderEmergencies}
    `}get _sectionLackProducts(){return g`
      ${this.showInfo?g`
            <emergency-reports-panel-info
              microillustration="caution"
              size-icon="L"
              description="${this.t("emergency-reports-section-message-no-emergencies")}"
              link-text="${this.t("emergency-reports-section-message-no-emergencies-link")}"
              @emergency-reports-panel-info-link-click="${this._callPhoneNumber}"
            ></emergency-reports-panel-info>
          `:E}
      ${this.withoutProducts?g`
            <emergency-reports-panel-info
              microillustration="emptystateday"
              size-icon="XL"
              description="${this.t("emergency-reports-section-message-no-contracts")}"
            ></emergency-reports-panel-info>
          `:E}
    `}get _renderEmergencies(){const e=this.emergencyReports.length-1;return g`
      ${Je(this.emergencyReports,((t,i)=>g`
          ${this._showActiveReport(t.optionCard.heading)?this._renderSectionWithBadge(t):this._renderSection(t)}
          ${i>=0&&i<e?g`
                <bbva-divider></bbva-divider>
              `:E}
        `))}
    `}_renderSectionWithBadge(e){return g`
      <bbva-list-clip
        heading="${this.t(e.optionCard.heading)}"
        accessibility-text="${this.t(e.optionCard.heading)}"
        microillustration="${e.optionCard.microillustration}"
        badge-text="${this.t("emergency-reports-insurance-badge-text")}"
        badge-type="pending"
        @list-clip-link-click="${e=>{e.stopPropagation(),this._dispatchCustomEvent("emergency-reports-insurance-report-active-click",{emergenciesEntryPoint:!0})}}"
      ></bbva-list-clip>
    `}_renderSection(e){return g`
      <bbva-list-clip
        heading="${this.t(e.optionCard.heading)}"
        accessibility-text="${this.t(e.optionCard.heading)}"
        microillustration="${e.optionCard.microillustration}"
        @list-clip-link-click="${t=>{t.stopPropagation(),this._dispatchCustomEvent(e.optionCard.evt,e)}}"
      ></bbva-list-clip>
    `}render(){return g`
      ${super.render()}
      <div ambient="light">
        ${Object.keys(this.emergencyReports).length?this._sectionEmergencyReports:E}
        ${this._sectionLackProducts}
      </div>
    `}}var Yi=t`:host {
  --bbva-progress-content-z-index: 11;
  --bbva-header-main-max-width: 45rem;
  display: block;
  box-sizing: border-box;
  height: 100%;
  margin: var(--emergency-reports-position, 0) auto 0;
  background-color: var(--bbva-emergency-reports-dark-mode-bg-color, var(--bbva-emergency-reports-bg-color, var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)})));
  max-width: var(--bbva-header-main-max-width);
  overflow: hidden;
}

:host([hidden]), [hidden] {
  display: none !important;
}

.emergency-report-menu-slot {
  padding: var(--emergency-reports-menu-area, 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1em) 0);
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class Zi extends(y(c(f(Xe(h))))){static get is(){return"emergency-reports"}static get scopedElements(){const e=[Wi,ki,zi,Qi,Ui,...Zi.configurationScopedElements()];return Zi.scopedElementsFromClasses(e)}static get properties(){return{financialOverviewApiVersion:{type:String,attribute:"financial-overview-api-version"},appSettingsApiVersion:{type:String,attribute:"app-settings-api-version"},vehicleInsurancesApiVersion:{type:String,attribute:"vehicle-insurance-api-version"},publicSettingsId:{type:String,attribute:"public-settings-id"},publicSettingsKey:{type:String,attribute:"public-settings-key"},productTypeEmergencies:{type:Array,attribute:"product-type-emergencies"},fieldsProperty:{type:String,attribute:"fields-property"},phoneNumberAtmReport:{type:String,attribute:"phone-number-atm-report"},phoneNumberRejectedCard:{type:String,attribute:"phone-number-rejected-card"},phoneNumberBbvaLine:{type:String,attribute:"phone-number-bbva-line"},phoneNumberBbvaLineVehicle:{type:String,attribute:"phone-number-bbva-line-vehicle"},aemHost:{type:String,attribute:"aem-host"},_contentFragmentPath:{type:String,state:!0},stopInitServices:{type:Boolean,attribute:"stop-init-services"},resetData:{type:Boolean,attribute:"reset-data"},emergencyReportsConfig:{type:Object,attribute:"emergency-reports-config"},smartAssistant:{type:Boolean,attribute:"smart-assistant"},motorcycleId:{type:String,attribute:"motorcycle-id"},financialOverview:{type:Object,attribute:"financial-overview"},publicSettings:{type:Array,attribute:"public-settings"},vehicleInsuranceProductTypes:{type:Array,attribute:"vehicle-insurance-product-types"},allowedInsurers:{type:Array,attribute:"allowed-insurers"},otherInsurers:{type:Array,attribute:"other-insurers"},viewNoticeVisible:{type:Boolean,attribute:"view-notice-visible"},timeNotificationToast:{type:Number,attribute:"time-notification-toast"},viewCallVisible:{type:Boolean,attribute:"view-call-visible"},bodyMenuContent:{type:String,attribute:"body-text"},_dataPage:{type:Object},_modalVisible:{type:Boolean},_typeModal:{type:String},_emergencyReports:{type:Array},_menuEmergency:{type:Boolean},_showMenuFaqs:{type:Boolean},_detailFaqs:{type:Boolean},_insuranceContracts:{type:Array},_descriptionVehicle:{type:Array},_contractVehicle:{type:Array},_optionsVehicles:{type:Array},_vehicleSelected:{type:Object},_detailVehicle:{type:Object},_showInfo:{type:Boolean},_withoutProducts:{type:Boolean},_routes:{type:Array},_savedContract:{type:Object},_withoutEmergencies:{type:Boolean},_isMenuOptions:{type:Boolean},viewActiveReport:{type:Boolean,attribute:"view-active-report"},adjusterTracking:{type:Boolean,attribute:"adjuster-tracking"},hideIconText:{type:Boolean,attribute:"hide-icon-text"}}}constructor(){super(),this.config={loader:!0,header:{id:"main-header",variant:"first-level-sequential",showLeftIcon:!0,text:this.t("emergency-reports-header-text"),leftIconLabel:this.t("emergency-reports-header-return"),leftIconAriaLabel:this.t("emergency-reports-header-return-accessibility-text"),"@header-main-icon-click":this.navigateBack.bind(this)},fixedHeader:!0},this.timeNotificationToast=3e3,this.financialOverviewApiVersion="0",this.vehicleInsurancesApiVersion="1",this.appSettingsApiVersion="0",this.phoneNumberBbvaLineVehicle="",this.phoneNumberRejectedCard="",this.phoneNumberAtmReport="",this._contentFragmentPath="",this.phoneNumberBbvaLine="",this.publicSettingsKey="",this.bodyMenuContent="",this.publicSettingsId="",this.motorcycleId="",this._productType="",this._typeModal="",this.aemHost="",this.fieldsProperty="",this.emergencyReportsConfig={},this.financialOverview={},this._vehicleSelected={},this._detailVehicle={},this._savedContract={},this._dataPage={},this.history={},this._withoutEmergencies=!1,this._withoutProducts=!1,this.stopInitServices=!1,this.viewCallVisible=!1,this._isMenuOptions=!1,this._menuEmergency=!1,this.smartAssistant=!1,this._showMenuFaqs=!1,this._modalVisible=!1,this._detailFaqs=!1,this.resetData=!1,this._showInfo=!1,this.vehicleInsuranceProductTypes=[],this.productTypeEmergencies=[],this._descriptionVehicle=[],this._insuranceContracts=[],this.publicSettings=[],this._emergencyReports=[],this._optionsVehicles=[],this._contractVehicle=[],this.allowedInsurers=[],this.otherInsurers=[],this._routes=[],this.viewNoticeVisible=!1,this._optionVehicleSelected=0,this.viewActiveReport=!1,this.adjusterTracking=!1,this.hideIconText=!1}static get styles(){return[Yi,m("emergency-reports-shared-styles")]}firstUpdated(){this._getDm(),this._listeners(),this.stopInitServices||super.firstUpdated()}async update(e){super.update(e),await this._getDm();const t=e.has("publicSettings")||e.has("financialOverview"),i=this.publicSettings.length||Object.keys(this.financialOverview).length;e.has("hideIconText")&&this.hideIconText&&(this.config.header.leftIconLabel=""),e.has("resetData")&&this.resetData&&this._emergencyReportsDm.resetApiServices(),t&&i&&this.stopInitServices&&this.executeServices(),Boolean(this._emergencyReports.length)&&Boolean(Object.keys(this.history).length)&&e.has("_emergencyReports")&&this._restoreHistory()}executeServices(){this._emergencyReports.length||this._emergencyReportsDm.executeServices()}_listeners(){this._dispatchCustomEvent("emergency-reports-initialized-services"),this._backPage(),this._nextPage()}_backPage(){this.addEventListener("emergency-reports-detail-faqs",(()=>this.navigateBack()))}_nextPage(){["emergency-reports-card-stole-click","emergency-reports-insurance-shock-click","emergency-reports-insurance-current-click","emergency-reports-insurance-tire-click","emergency-reports-insurance-crane-click","emergency-reports-insurance-stole-click","emergency-reports-insurance-glass-click","emergency-reports-insurance-replacement-click","emergency-reports-insurance-vehicle-click"].forEach((e=>this.addEventListener(e,(e=>this._handleNavigationEmergencyReport(!1,!0,e.detail)))))}_restoreHistory(){var e,t,i,s,a,r,o,n;const{_emergencyReports:l}=this;var c;(this._dataPage=(null===(e=this.history)||void 0===e?void 0:e.data)||{},this._optionVehicleSelected=(null===(t=this._dataPage)||void 0===t?void 0:t.optionVehicleSelected)||0,this._optionsVehicles=(null===(i=this._dataPage)||void 0===i?void 0:i.optionsVehicles)||[],this._insuranceContracts=(null===(s=this._dataPage)||void 0===s?void 0:s.insuranceContractsDetail)||[],this._emergencyReportsDm.vehicleInsuranceContracts=(null===(a=this._dataPage)||void 0===a?void 0:a.insuranceContractsDetail)||[],this._emergencyReportsDm.optionsVehicle=(null===(r=this._dataPage)||void 0===r?void 0:r.optionsVehicles)||[],null!==(o=this._dataPage)&&void 0!==o&&o.configVehicle)&&this._setDataVehicleHistory(null===(c=this._dataPage)||void 0===c?void 0:c.configVehicle);this._routes=(null===(n=this.history)||void 0===n?void 0:n.routes)||[],this[`_${this._routes[this._routes.length-1]}`]=!0,this._emergencyReports=l}_getDm(){this._emergencyReportsDm=this.shadowRoot.querySelector('[data-tag-name="emergency-reports-dm"]')}_openEmergencyCard({detail:e}){Object.assign(this._dataPage,{title:"emergency-reports-menu-header-text",subtitle:"emergency-reports-menu-subtitle",options:e.emergency,phoneRejected:this.phoneNumberRejectedCard,showLink:!1,isMenuOptions:!0,viewNoticeVisible:!1}),this._addCommonData(e),this._handleNavigationEmergencyReport()}async _openEmergencyVehicle({detail:e}){if(!this._descriptionVehicle.length){this.showLoader();const e=await this._emergencyReportsDm.getPolicyInsurance();this._setDataVehicle(e),this.clearLoader()}Object.assign(this._dataPage,{title:"emergency-reports-menu-header-text",subtitle:"emergency-reports-menu-insurance-subtitle",options:e.emergency,insuranceContracts:this._insuranceContracts.length,insuranceContractsDetail:this._insuranceContracts,showLink:!0,viewNoticeVisible:this.viewNoticeVisible}),this._validContractVehicle(),this._addCommonData(e),this._setContractDetail(),this._handleNavigationEmergencyReport()}_validContractVehicle(){this.allowedInsurers.length||this.otherInsurers.length?this._isMenuOptions=this._toggleMenu():(this._validIconVehicle(),this._isMenuOptions=!0),Object.assign(this._dataPage,{...this._dataPage,optionVehicleSelected:this._optionVehicleSelected,isMenuOptions:this._isMenuOptions})}_validIconVehicle(){const e=this._dataPage.options.find((e=>"vehicleAssistance"===e.id));null!=e&&e.icon&&(e.icon=this._setIcon(this._vehicleSelected.type)),this._updateVehicleSelected()}_addCommonData({contentFragmentPath:e,productType:t}){this._routes.push("menuEmergency"),this._contentFragmentPath=e,this._productType=t}_openModalError(){this.clearLoader(),this._typeModal=zi.MODES.activateErrorService,Object.assign(this._dataPage,{...this._dataPage,phoneNumberBbvaLine:this.phoneNumberBbvaLine,viewCallBbvaLine:this.viewCallVisible}),this._modalVisible=!0}_openModalAtm(){this._typeModal=zi.MODES.activeHelpAtm,Object.assign(this._dataPage,{...this._dataPage,smartAssistant:this.smartAssistant,phoneNumberAtmReport:this.phoneNumberAtmReport}),this._modalVisible=!0,this._dispatchCustomEvent("emergency-reports-modal-visible-atm")}async _openModalVehicle(){if(this._typeModal=zi.MODES.activateVehicleChange,this._optionsVehicles.length!==this._insuranceContracts.length){this.showLoader();const e=await this._emergencyReportsDm.getMorePolicyInsurance();this._setDataVehicle(e),this.clearLoader()}this._modalVisible=!0,this._dispatchCustomEvent("emergency-reports-modal-visible-vehicle")}_openModalVehicleError(){this.clearLoader(),this._typeModal=zi.MODES.activateErrorVehicle,this._modalVisible=!0,Object.assign(this._dataPage,{...this._dataPage,phoneNumberBbvaLineVehicle:this.phoneNumberBbvaLineVehicle}),this._dispatchCustomEvent("emergency-reports-modal-visible-vehicle-error")}_setDataVehicle({detail:e}){this._descriptionVehicle=e.descriptionVehicles,this._contractVehicle=e.vehicleContractsData,this._getVehicleReport(),this._updatedDataModalVehicle(e),Object.assign(this._dataPage,{...this._dataPage,configVehicle:e})}_setDataVehicleHistory(e){this._descriptionVehicle=e.descriptionVehicles,this._contractVehicle=e.vehicleContractsData,this._detailVehicle=this._insuranceContracts[this._optionVehicleSelected],this._vehicleSelected=this._descriptionVehicle[this._optionVehicleSelected],this._savedContract=this._contractVehicle[this._optionVehicleSelected],this._emergencyReportsDm.descriptionVehicles=this._descriptionVehicle,this._validIconVehicle()}_getVehicleReport(){if(Object.keys(this._vehicleSelected).length){const{_vehicleSelected:e}=this;this._vehicleSelected=e,this._detailVehicle=this._insuranceContracts[this._optionVehicleSelected],this._savedContract=this._contractVehicle[this._optionVehicleSelected],this._updateVehicleSelected()}else[this._vehicleSelected]=this._descriptionVehicle,[this._detailVehicle]=this._insuranceContracts,[this._savedContract]=this._contractVehicle,this._updateVehicleSelected()}_toggleMenu(){var e,t,i,s;const a=(null===(e=this._detailVehicle)||void 0===e||null===(t=e.detail)||void 0===t?void 0:t.productDescription)||(null===(i=this._detailVehicle)||void 0===i||null===(s=i.detail)||void 0===s?void 0:s.relatedInsurances);let r=!1;return this._validTypeContract(a,"allowedInsurers")&&(this._validIconVehicle(),r=!0),this._validTypeContract(a,"otherInsurers")&&(r=!1),r}_validTypeContract(e,t){var i;return"string"!=typeof e&&e?null===(i=e.find((e=>this[`${t}`].find((t=>t===e.productDescription)))))||void 0===i?void 0:i.productDescription:this[`${t}`].find((t=>t===e))}_changedVehicle(){this._detailVehicle=this._insuranceContracts[this._optionVehicleSelected],this._vehicleSelected=this._descriptionVehicle[this._optionVehicleSelected],this._savedContract=this._contractVehicle[this._optionVehicleSelected],this._validContractVehicle(),this._setContractDetail(),this._updateVehicleSelected(),this._withoutEmergencies=!0}_setContractDetail(){this._dataPage.options.forEach((e=>Object.assign(e.detail,{contractData:this._detailVehicle,vehicleData:this._savedContract})))}_setIcon(e){return e!==this.motorcycleId?Q():re()}_openDetailFaqs(){this._routes.push("detailFaqs"),this._handleNavigationEmergencyReport()}_updatedDataModalVehicle({optionsVehicle:e}){this._optionsVehicles=e,Object.assign(this._dataPage,{...this._dataPage,optionsVehicles:this._optionsVehicles,descriptonVehicles:this._descriptionVehicle})}_updateVehicleSelected(){Object.assign(this._dataPage,{...this.dataPage,vehicleSelected:this._vehicleSelected})}_toggleFaqsAem(e){e.stopPropagation(),this.smartAssistant?(this._handleNavigationEmergencyReport(!1,!0),this._dispatchCustomEvent("emergency-reports-menu-smart-assistant-click")):(this._routes.push("showMenuFaqs"),this._handleNavigationEmergencyReport(),this._dispatchCustomEvent(`emergency-reports-menu-${this._productType.toLowerCase()}-click`))}_handleNavigationEmergencyReport(e=!1,t=!1,i={}){this[`_${this._routes[this._routes.length-1]}`]=!0,t?this.navigateForward(e,t,i):this.navigateForward(e,t,{})}_getSlot(e){return[...this.children].some((t=>t.getAttribute("slot")===e))}get _slotMenu(){return this._getSlot("emergency-report-menu-slot")||this.bodyMenuContent?g`
          <span class="emergency-report-menu-slot"
            ><slot name="emergency-report-menu-slot">${this.bodyMenuContent}</slot></span
          >
        `:""}get _tplModals(){return g`
      <emergency-reports-modal
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ?visible="${this._modalVisible}"
        ?smart-assistant="${this.smartAssistant}"
        ?hide-icon-text="${this.hideIconText}"
        .routes="${this._routes}"
        .data="${this._dataPage}"
        .mode="${this._typeModal}"
        @emergency-reports-vehicle-acepted-changed-click="${this._changedVehicle}"
        @emergency-reports-atm-icon-rigth-click="${this._toggleFaqsAem}"
        @emergency-reports-change-status-modal="${({detail:e})=>{this._modalVisible=null==e?void 0:e.visible}}"
        @emergency-reports-modal-item-change="${e=>{this._optionVehicleSelected=e.detail,Object.assign(this._dataPage,{...this._dataPage,optionVehicleSelected:this._optionVehicleSelected})}}"
      ></emergency-reports-modal>
    `}get _menuSection(){return g`
      <emergency-reports-section
        aria-hidden="${this._menuEmergency}"
        ?show-info="${this._showInfo}"
        ?without-products="${this._withoutProducts}"
        ?view-active-report="${this.viewActiveReport}"
        ?adjuster-tracking="${this.adjusterTracking}"
        phone-number-bbva-line="${this.phoneNumberBbvaLine}"
        .emergencyReports="${this._emergencyReports}"
        @emergency-reports-card-click="${this._openEmergencyCard}"
        @emergency-reports-insurance-click="${this._openEmergencyVehicle}"
      ></emergency-reports-section>
    `}get _menuEmergencyReports(){return g`
      <emergency-reports-menu
        aria-hidden="${this._showMenuFaqs}"
        ?without-emergencies="${this._withoutEmergencies}"
        ?menu-emergency="${this._menuEmergency}"
        ?smart-assistant="${this.smartAssistant}"
        ?hide-icon-text="${this.hideIconText}"
        time-notification-toast="${this.timeNotificationToast}"
        language="${this.language}"
        .dataPage="${this._dataPage}"
        @emergency-reports-card-atm-click="${this._openModalAtm}"
        @emergency-reports-vehicle-changed="${this._openModalVehicle}"
        @header-main-icon-click="${this._handleHeaderMainClick}"
        @emergency-reports-menu-toast-close="${({detail:e})=>{this._withoutEmergencies=e}}"
        ><div slot="slot-content">${this._slotMenu}</div>
      </emergency-reports-menu>
    `}get _menuFaqs(){return g`
      ${this.smartAssistant?E:g`
            <emergency-reports-menu-faqs
              aria-hidden="${!this._showMenuFaqs}"
              language="${this.language}"
              ?i-o-s-fixed-header="${this.iOSFixedHeader}"
              ?native="${this.native}"
              ?show-menu-faqs="${this._showMenuFaqs}"
              ?hide-icon-text="${this.hideIconText}"
              aem-host="${this.aemHost}"
              product-type="${this._productType}"
              phone-number-bbva-line="${this.phoneNumberBbvaLine}"
              phone-number-bbva-line-vehicle="${this.phoneNumberBbvaLineVehicle}"
              content-fragment-path="${this._contentFragmentPath}"
              ?visible-detail="${this._detailFaqs}"
              @help-faqs-aem-detail-show="${this._openDetailFaqs}"
              @transition-container-close="${this.navigateBack}"
            ></emergency-reports-menu-faqs>
          `}
    `}get _tplDM(){return g`
      <emergency-reports-dm
        ?native="${this.native}"
        ?stop-init-services="${this.stopInitServices}"
        motorcycle-id="${this.motorcycleId}"
        financial-overview-api-version="${this.financialOverviewApiVersion}"
        app-settings-api-version="${this.appSettingsApiVersion}"
        insurance-vehicle-api-version="${this.vehicleInsurancesApiVersion}"
        public-settings-id="${this.publicSettingsId}"
        public-settings-key="${this.publicSettingsKey}"
        host="${this.host}"
        required-token="${this.requiredToken}"
        fields-property="${this.fieldsProperty}"
        phone-number-bbva-line="${this.phoneNumberBbvaLine}"
        public-settings-host="${this.publicSettingsHost}"
        public-settings-required-token="${this.publicSettingsRequiredToken}"
        .vehicleInsuranceProductTypes="${this.vehicleInsuranceProductTypes}"
        .emergencyReportsConfig="${this.emergencyReportsConfig}"
        .allowedInsurers="${this.allowedInsurers}"
        .otherInsurers="${this.otherInsurers}"
        .productTypeEmergencies="${this.productTypeEmergencies}"
        .financialOverview="${this.financialOverview}"
        .publicSettings="${this.publicSettings}"
        @emergency-reports-active-modal-communication-error="${this._openModalError}"
        @emergency-reports-error-get-vehicle-insurance="${this._openModalVehicleError}"
        @emergency-reports-active-modal-operation-error="${()=>{this._typeModal=zi.MODES.activateErrorOperation,this._modalVisible=!0}}"
        @emergency-reports-setup="${e=>{this._emergencyReports=null==e?void 0:e.detail,this._showInfo=Boolean(!this._emergencyReports.length),Object.keys(this.history).length||this._routes.push("emergencyReports")}}"
        @emergency-reports-contracts-insurances="${e=>{this._insuranceContracts=e.detail.insuranceContracts,Object.assign(this._dataPage,{insuranceContractsDetail:this._insuranceContracts})}}"
        @emergency-reports-show-message-no-contracts="${e=>{this._withoutProducts=e.detail.show}}"
        @emergency-reports-show-message-no-emergencies="${e=>{this._showInfo=e.detail.show}}"
        @emergency-reports-error-get-more-vehicle-insurance="${e=>{this._setDataVehicle(e),this._openModalVehicleError()}}"
      ></emergency-reports-dm>
    `}_handleHeaderMainClick(e){var t;const i=null==e||null===(t=e.detail)||void 0===t?void 0:t.index,s={0:()=>this.navigateBack(),1:()=>this._toggleFaqsAem(e)};null!=s&&s[i]&&(null==s||s[i]())}openModalConnectionError(){this._showInfo=!1,this._typeModal=zi.MODES.activateErrorConnection,this._modalVisible=!0,this._dispatchCustomEvent("emergency-reports-modal-visible-error-connection")}navigateForward(e,t,i){this._dispatchCustomEvent("navigation-go-forward",{id:this._routes[this._routes.length-1],params:{target:{id:i.id,params:{contractData:this._detailVehicle,vehicleData:this._savedContract},history:{routes:this._routes,data:this._dataPage}}},replace:e,external:t})}navigateBack(e=!0){const t=this._routes[this._routes.length-1];1===this._routes.length?(this.resetData=!0,this._dispatchCustomEvent("emergency-reports-close")):(this[`_${t}`]=!1,this._routes.pop()),e&&this._dispatchCustomEvent("navigation-go-back")}render(){return g`
      ${super.render()} ${this._tplDM}
      <div ambient="light">
        ${this._menuEmergencyReports} ${this._contentFragmentPath?this._menuFaqs:E}
        ${this._menuSection} ${this._tplModals}
      </div>
    `}}customElements.define(Zi.is,Zi);var es=t`:host {
  display: block;
  box-sizing: border-box;
  position: fixed;
  top: 0;
  left: 0;
  width: 100vw;
  height: auto;
  z-index: var(--bbva-notification-container-z-index, 8);
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}
${(new r).mediaRules()}`;let ts=class extends(l(h)){static get is(){return"bbva-notification-container"}static get scopedElements(){return{"bbva-notification-toast":$}}static get properties(){return{duration:{type:Number},defaultType:{type:String,attribute:"default-type"},notificationIcons:{type:Object},fixedBottom:{type:Boolean,attribute:"fixed-bottom"},roleText:{type:String,attribute:"role-text"},ariaLiveText:{type:String,attribute:"aria-live-text"}}}constructor(){super(),this.ariaLiveText="polite",this.roleText="alert",this.defaultType="error",this.duration=4e3,this.notificationIcons={info:w(),warning:w(),error:A(),success:R()},this._stack=[],this._currentNotification={},this._toastOpened=!1,this._uniqueId=String(Math.floor(Math.random()*Date.now()))}get _defaultNotification(){return{description:"",simpleLinkText:"",type:this.defaultType,duration:this.duration}}getParentElement(){const e=this.getRootNode();return 11===e.nodeType?e.host:document}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._parentElement=this.getParentElement(),this._boundShowNotification=this._showNotification.bind(this),this._boundHideNotification=this._hideOnEvent.bind(this),this._parentElement.addEventListener("show-notification",this._boundShowNotification),this._parentElement.addEventListener("hide-notification",this._boundHideNotification)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.clear(),this._parentElement.removeEventListener("show-notification",this._boundShowNotification),this._parentElement.removeEventListener("hide-notification",this._boundHideNotification)}clear(e=!1){e&&(this._stack=[]),this._hideNotification()}_hideNotification(){this._currentTime&&this._clearTime(),this._toastOpened=!1,this.requestUpdate()}_clearTime(){clearTimeout(this._currentTime),this._currentTime=null}_computeIcon(e){return this.notificationIcons[e]||this.notificationIcons[this.defaultType]}_onNotificationClosed(e){e.stopPropagation(),this._showNextInStack()}_setCurrentNotification(){this._currentNotification={...this._defaultNotification,...this._stack.shift()}}_setNotificationDuration(){const{duration:e}=this._currentNotification;e>0&&(this._currentTime=setTimeout(this.clear.bind(this),e))}_hideOnEvent(e){this.clear(e.detail),e.stopPropagation(),e.stopImmediatePropagation(),e.preventDefault()}_showNotification(e){this.add(e.detail),e.stopPropagation(),e.stopImmediatePropagation(),e.preventDefault()}_showNextInStack(){this._stack.length>0&&!this._toastOpened&&(this._setCurrentNotification(),this._toastOpened=!0,this._setNotificationDuration(),this.requestUpdate())}add({description:e="",simpleLinkText:t,type:i=this.defaultType,duration:s=this.duration}={}){const a=i;this._stack.push({type:a,description:e,simpleLinkText:t,duration:s}),this._showNextInStack()}static get styles(){return[es,m("bbva-notification-container-shared-styles")]}render(){return g`
      <bbva-notification-toast
        .id="toast_${this._uniqueId}"
        ?show="${this._toastOpened}"
        @click="${this._hideNotification}"
        type="${D(this._currentNotification.type)}"
        .iconExplainer="${this._computeIcon(this._currentNotification.type)}"
        @closed="${this._onNotificationClosed}"
        .simpleLinkText="${this._currentNotification.simpleLinkText}"
        .alertText="${D(this._currentNotification.description)}"
        ?fixed-bottom="${this.fixedBottom}"
        .ariaLiveText="${this.ariaLiveText}"
        .roleText="${this.roleText}"
      ></bbva-notification-toast>
    `}};var is=t`
:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-dark-mode-bg-color, var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${i(n.primaryCoreDarkened)})));
  color: var(--_text-color);
  position: var(--bbva-header-main-position, -webkit-sticky);
  position: var(--bbva-header-main-position, sticky);
  top: 0;
  z-index: var(--bbva-header-main-z-index, 1);
  padding: 0 0.25rem;
  --_bg-color-modal: var(--colorsPrimaryCore, ${i(n.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
  --_color-modal-three-level: var(--bbva-header-main-dark-mode-color-modal-three-level ,var(--colorsSecondary600, ${i(n.secondary600)}));
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${i(n.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${i(n.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
  --_text-color: var(--bbva-header-main-dark-mode-text-color ,var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)})));
  --_bg-color-modal: var(--colorsPrimaryCore, ${i(n.primaryCore)});
  --_header-main-active-icon-color: var(--bbva-header-main-dark-active-icon-color, var(--colorsPrimarySubduedLight, ${i(n.primarySubduedLight)}));
}
@supports (padding-top: env(safe-area-inset-top)) {
  :host {
    --safe-area-inset-top: env(safe-area-inset-top);
    padding-top: var(--safe-area-inset-top, 0);
  }
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

:host([position=fixed]) {
  --bbva-header-main-position: fixed;
  width: 100%;
  left: 0;
  right: 0;
}

.header-main {
  display: flex;
  justify-content: space-between;
  align-items: center;
  position: relative;
  padding-top: var(--bbva-header-main-padding-top, 0);
  margin: 0 auto;
  min-height: var(--bbva-header-main-min-height, 3rem);
  max-width: var(--bbva-header-main-max-width, 100%);
}
.header-main .icon {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  border: none;
  background: none;
  width: var(--bbva-header-main-width, 3rem);
  min-height: var(--bbva-header-main-min-height, 3rem);
  padding: 0;
  color: inherit;
  margin: 0;
  cursor: pointer;
}
.header-main .header-icons {
  display: flex;
  flex: none;
}
.header-main .header-icons.half-space {
  min-width: 2.875rem;
}
.header-main .header-icons.full-space {
  min-width: 5.75rem;
}
.header-main .header-icons.right-group .icon.primary, .header-main .header-icons.right-group .icon.secondary {
  margin-left: auto;
}
.header-main .header-icons.right-group .icon.primary:active [data-tag-name=bbva-icon], .header-main .header-icons.right-group .icon.secondary:active [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_header-main-active-icon-color);
}
.header-main .header-icons.left-group .icon.primary:active [data-tag-name=bbva-icon], .header-main .header-icons.left-group .icon.secondary:active [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_header-main-active-icon-color);
}
.header-main .header-icons .text-icon {
  width: 100%;
  padding-top: 0.125rem;
}
.header-main .heading-wrapper {
  display: flex;
  justify-content: center;
  align-items: center;
  top: var(--bbva-header-main-text-top, var(--bbva-header-main-padding-top, 0));
  left: 0;
  width: 100%;
  height: var(--bbva-header-main-min-height, 3rem);
  margin: 0;
  overflow: hidden;
  text-align: center;
  font-size: var(--bbva-header-main-text-font-size, var(--typographyTypeMedium, ${i(s.typeMedium)}));
  line-height: var(--bbva-header-main-text-line-height, 3rem);
  font-weight: 400;
  min-width: 0;
}
.header-main .heading-wrapper.image {
  display: flex;
  justify-content: center;
  align-items: center;
}
.header-main .heading-wrapper.image #image {
  max-height: -webkit-fill-available;
}
.header-main .heading-wrapper .microillustration {
  width: 3rem;
  height: 3rem;
}
.header-main .heading-wrapper .text-wrapper {
  padding: 0 0.3125rem;
  min-width: 0;
}
.header-main .heading-wrapper svg {
  max-height: 100%;
  padding: 0.3125rem;
}

:host([variant*=modal]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-modal, var(--_bg-color-modal));
}

:host([variant*=modal-three-level]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-modal-three-level, var(--_bg-color-modal-three-level));
  color: var(--_color-modal-three-level);
}
:host([variant*=modal-three-level]) .header-main .heading-wrapper .text-wrapper {
  color: var(--_color-modal-three-level);
}
:host([variant*=modal-three-level]) .header-main .header-icons .text-icon {
  color: var(--_color-modal-three-level);
}

:host([variant*=process]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-process, var(--_bg-color-process));
}

:host([variant*=sign]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-sign, var(--_bg-color-sign));
}

:host([variant*=transparent]) {
  background-color: var(--_bg-color-transparent);
}

:host([show-text-icon]) .header-main {
  min-height: var(--bbva-header-main-min-height, 3.5rem);
}
:host([show-text-icon]) .header-main .icon {
  min-height: var(--bbva-header-main-min-height, 3.5rem);
}
:host([show-text-icon]) .header-main .heading-wrapper {
  height: var(--bbva-header-main-min-height, 3.5rem);
}

@supports (padding-top: env(safe-area-inset-top)) {
  :host([variant*=notch-top]) {
    --safe-area-inset-top: env(safe-area-inset-top);
    padding-top: var(--safe-area-inset-top, 0);
  }
}
`;let ss=class e extends(l(oe(c(h)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":u,"bbva-icon":p,"bbva-badge-notification":ne}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const e={1:"half-space",2:"full-space"},t=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,i=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,s=Math.max(t,i);return s in e?e[s]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[is,m("bbva-header-main-shared-styles"),le("button:focus"),T.dark]}static toCamelCase(e){return(e.charAt(0).toUpperCase()+e.slice(1)).replace(/([-_][a-z])/gi,(e=>e.toUpperCase().replace("-","").replace("_","")))}_icon(e){return g`<bbva-icon icon="${D(this[e])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(e){return g`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right-header"
      variant="alert"
    >
      ${this._icon(e)}
    </bbva-badge-notification>`}_tplButton(t,i,s,a){const r=e.toCamelCase(t),o=`icon${r}`,n=`accessibilityTextIcon${r}`;return g`<button
      class="${i}"
      id="btn-${t}"
      aria-label="${D(this.t(this[n]))}"
      aria-expanded=${D(a)}
      ?hidden="${!this[o]}"
      @click="${()=>this._headerIconClick(t)}"
    >
      ${"left-primary"===t&&this.notificationText?this._badgeNotification(o):this._icon(o)}
      ${this.showTextIcon?this._textIcon(s):""}
    </button>`}_textIcon(e){return g` <bbva-text
      unset
      ambient="dark"
      ellipsis
      class="text-icon"
      size="3XS"
      tag="span"
      alignment="center"
      .text="${D(this.t(e))}"
    >
    </bbva-text>`}_tplHeading(e){return g`
      <bbva-text
        unset
        ambient="dark"
        ellipsis
        class="text-wrapper"
        id="text"
        tag="span"
        alignment="center"
        .text="${this.t(e)}"
      >
      </bbva-text>
    `}render(){const{_availableHeadingSpace:e,_hasImage:t,text:i,image:s,_hasMicroillustration:a}=this;return g`
      <header class="header-main">
        <div class="header-icons ${e} left-group" data-id="iconsLeft">
          ${this._tplButton("left-primary","icon primary",this.textIconLeftPrimary?this.textIconLeftPrimary:this.accessibilityTextIconLeftPrimary)}
          ${this._tplButton("left-secondary","icon secondary",this.textIconLeftSecondary?this.textIconLeftSecondary:this.accessibilityTextIconLeftSecondary)}
        </div>

        <h1
          class="heading-wrapper ${t}"
          id="heading"
          aria-label=${(a||s)&&this.accessibilityTextImage?this.t(this.accessibilityTextImage):this.t(i)}
          tabindex="-1"
        >
          ${i&&" "!==i&&this._tplHeading(i)||""}
          <img src="${D(s)}" alt="" ?hidden="${!s}" id="image" aria-hidden="true" />

          <span
            class="${a}"
            ?hidden="${!a}"
            aria-hidden="true"
          >
            ${this.microillustration}
          </span>
        </h1>

        <div class="header-icons ${e} right-group" data-id="iconsRight">
          ${this._tplButton("right-secondary","icon secondary",this.textIconRightSecondary?this.textIconRightSecondary:this.accessibilityTextIconRightSecondary)}
          ${this._tplButton("right-primary","icon primary",this.textIconRightPrimary?this.textIconRightPrimary:this.accessibilityTextIconRightPrimary,this.iconRightPrimaryExpanded)}
        </div>
      </header>
    `}_headerIconClick(e){this.dispatchEvent(new CustomEvent(`header-main-icon-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}};b("colors.primaryCoreLightened"),b("colors.cool80"),b("colors.cool70"),b("colors.primaryCoreLightened"),b("colors.cool100"),b("colors.tertiaryType6Darkened"),b("colors.tertiaryType4Darkened"),b("colors.secondary300");const as=de((e=>class extends(y(e)){static configurationScopedElements(){return[ts,he,ss,pe]}static get properties(){return{config:{type:Object},_showNotifyTop:{type:Boolean}}}constructor(){super(),this.config={header:!1,back:!0,fixedHeader:!1,loader:!1,notify:!1,notifyTop:!1,notifyFeature:!1,smartAssistant:!1,faqs:!1},this._showNotifyTop=!1,this._boundBackHandler=this._back.bind(this),this._fixedHeaderStyles="position: sticky; top: 0; left: 0; width: 100%; z-index: var(--bbva-header-main-z-index, 1);"}firstUpdated(){this.config={...this.config,back:!Object.prototype.hasOwnProperty.call(this.config,"back")||this.config.back}}get _headerStyles(){return this.config.header&&this.config.fixedHeader?this._fixedHeaderStyles:""}_tpl(e,t){const i=`_${e}`;return this[i]||(this[i]=document.createElement(e)),"object"==typeof t&&Object.keys(t).forEach((e=>{"@"===e[0]?this[i].addEventListener(e.substring(1),t[e]):this[i][e]=t[e]})),this._setPrimaryLeftIcon(e,i),this._setSecondaryRightIcon(e,i),g`${this[i]}`}_back(){this._dispatchCustomEvent("navigation-go-back")}_setPrimaryLeftIcon(e,t){if(this.config.header&&e===this.getScopedTagName("bbva-header-main")&&this.config.back){this[t].iconLeftPrimary=this.config.header.iconLeftPrimary||ue();const e="@header-main-icon-left-primary-click",i=this.config.header[e]?this.config.header[e]:this._boundBackHandler;this[t].removeEventListener("header-main-icon-left-primary-click",i),this[t].addEventListener("header-main-icon-left-primary-click",i)}}_setSecondaryRightIcon(e,t){this.config.header&&e===this.getScopedTagName("bbva-header-main")&&(this[t].iconRightSecondary=this[t].iconRightSecondary||this.config.smartAssistant&&k()||this.config.faqs&&I())}_dispatchCustomEvent(e,t=!0,i=!0,s=!0){this.dispatchEvent(new CustomEvent(e,{bubbles:i,composed:s,detail:t,cancelable:!0}))}showLoader(e="full",t=!1,i=!1){const s={variant:e,showSpinnerMessageLabel:t,loginAnimation:i};this._dispatchCustomEvent("show-loader",s)}clearLoader(){this._dispatchCustomEvent("hide-loader")}showNotify(e,t,i,s){const a={description:e,simpleLinkText:t,type:i,duration:s};this._dispatchCustomEvent("show-notification",a)}clearNotify(){this._dispatchCustomEvent("hide-notification")}showNotifyTop({text:e="",status:t=""}={}){this.config.notifyTop={...this.config.notifyTop,text:e,status:t},this._showNotifyTop=!0}clearNotifyTop(){this._showNotifyTop=!1}renderNotify(){var e,t,i;return g`
          ${null!==(e=this.config)&&void 0!==e&&e.notify||null!==(t=this.config)&&void 0!==t&&t.notifyFeature?this._tpl(this.getScopedTagName("bbva-notification-container"),{fixedBottom:null===(i=this.config)||void 0===i?void 0:i.notifyFeature,...this.config.notify}):null}
        `}_getElements(){var e,t,i,s;return{[this.getScopedTagName("bbva-notification-status")]:{config:{...this.config.notifyTop,hide:!this._showNotifyTop},condition:(null===(e=this.config)||void 0===e?void 0:e.notifyTop)||(null===(t=this.config)||void 0===t?void 0:t.notifyFeature)},[this.getScopedTagName("bbva-progress-content")]:{config:this.config.loader,condition:null===(i=this.config)||void 0===i?void 0:i.loader},[this.getScopedTagName("bbva-header-main")]:{config:this.config.header,condition:null===(s=this.config)||void 0===s?void 0:s.header}}}render(){const e=this._getElements();return g`
          <section style="${this._headerStyles}">
            ${Object.keys(e).map((t=>e[t].condition?this._tpl(t,e[t].config):null))}
            <slot name="customHeaderContainer"></slot>
          </section>
          ${this.renderNotify()}
        `}})),rs=new r;var os=t`:host {
  display: block;
  --_map-static-text-color: var(--bbva-map-static-dark-mode-text-color, var(--bbva-map-static-text-color, var(--colorsSecondary500, ${i(n.secondary500)})));
  /* SKELETON */
  --_skeleton-quote-color: var(--bbva-map-static-dark-mode-skeleton-quote-color, var(--bbva-map-static-skeleton-quote-color, var(--colorsSecondary200, ${i(n.secondary200)})));
  --_skeleton-quote-bg: var(--bbva-map-static-dark-mode-skeleton-quote-bg, var(--bbva-map-static-skeleton-quote-bg, transparent));
  --_skeleton-animated-layer-bg: var(--bbva-map-static-dark-mode-skeleton-animated-layer-bg, var(--bbva-map-static-skeleton-animated-layer-bg, var(--ambientsLight, ${i(me.light)})));
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.bbva-map-static-section {
  height: 8.25rem;
}

.bbva-map-static-text {
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 15) * 1em);
  text-align: center;
  color: var(--_map-static-text-color);
}

:host([loading]) {
  position: relative;
  overflow: hidden;
  pointer-events: none;
  background-repeat: no-repeat;
  opacity: 1;
  height: 100%;
  width: 100%;
  background-image: linear-gradient(var(--_skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%);
  background-color: var(--_skeleton-quote-bg);
  background-size: 100% 132px, calc((60% * 2) + (16px/ 2)) 16px, calc((45% * 2) + (16px/ 2)) 16px;
  background-position: 0 0, -85% 142px, 315% 168px;
}
:host([loading]) .skeleton {
  contain: strict;
  position: absolute;
  left: 0;
  top: 0;
  right: 0;
  bottom: 0;
  background: var(--_skeleton-animated-layer-bg);
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
}

@keyframes skeletonAnimation {
  from {
    opacity: 0.5;
  }
  50% {
    opacity: 0.6;
  }
  60% {
    opacity: 0.6;
  }
  70% {
    opacity: 0.3;
  }
  90% {
    opacity: 0.1;
  }
  100% {
    transform: translateX(0%) scaleX(2);
    opacity: 0;
  }
}
${rs.mediaRules()}`;const ns=[{featureType:"all",elementType:"all",stylers:[{visibility:"on"}]},{featureType:"all",elementType:"geometry",stylers:[{visibility:"simplified"}]},{featureType:"all",elementType:"labels",stylers:[{visibility:"simplified"}]},{featureType:"administrative",elementType:"labels.text.fill",stylers:[{color:"#444444"}]},{featureType:"landscape",elementType:"all",stylers:[{color:"#f2f2f2"}]},{featureType:"landscape",elementType:"geometry",stylers:[{visibility:"on"}]},{featureType:"landscape.man_made",elementType:"all",stylers:[{visibility:"simplified"},{hue:"#ff0000"}]},{featureType:"landscape.natural",elementType:"all",stylers:[{visibility:"on"},{color:"#d9efec"}]},{featureType:"landscape.natural.terrain",elementType:"all",stylers:[{visibility:"on"},{lightness:"31"},{hue:"#00fdff"}]},{featureType:"poi",elementType:"all",stylers:[{visibility:"off"}]},{featureType:"poi.park",elementType:"all",stylers:[{visibility:"simplified"},{color:"#2dcccd"},{lightness:"85"}]},{featureType:"road",elementType:"all",stylers:[{saturation:-100},{lightness:45}]},{featureType:"road.highway",elementType:"all",stylers:[{visibility:"simplified"}]},{featureType:"road.arterial",elementType:"labels.icon",stylers:[{visibility:"off"}]},{featureType:"transit",elementType:"all",stylers:[{visibility:"off"}]},{featureType:"transit.station.rail",elementType:"all",stylers:[{visibility:"on"}]},{featureType:"water",elementType:"all",stylers:[{color:"#2dcccd"},{visibility:"on"},{saturation:"26"}]}],ls=[{featureType:"all",elementType:"all",stylers:[{visibility:"on"}]},{featureType:"all",elementType:"geometry",stylers:[{visibility:"simplified"}]},{featureType:"all",elementType:"labels",stylers:[{visibility:"simplified"}]},{featureType:"administrative",elementType:"geometry.stroke",stylers:[{color:"#1973b8"}]},{featureType:"administrative",elementType:"labels.text.fill",stylers:[{color:"#444444"}]},{featureType:"administrative.locality",elementType:"labels.text.fill",stylers:[{color:"#ffffff"}]},{featureType:"administrative.neighborhood",elementType:"labels.text.fill",stylers:[{color:"#f4f4f4"}]},{featureType:"landscape",elementType:"all",stylers:[{color:"#f2f2f2"}]},{featureType:"landscape",elementType:"geometry",stylers:[{visibility:"on"},{color:"#072146"}]},{featureType:"landscape",elementType:"labels",stylers:[{color:"#ffffff"},{visibility:"on"}]},{featureType:"landscape",elementType:"labels.text.fill",stylers:[{visibility:"on"},{color:"#ffffff"}]},{featureType:"landscape",elementType:"labels.text.stroke",stylers:[{color:"#ffffff"}]},{featureType:"landscape.man_made",elementType:"all",stylers:[{visibility:"simplified"},{hue:"#ff0000"}]},{featureType:"landscape.man_made",elementType:"geometry.fill",stylers:[{color:"#072146"}]},{featureType:"landscape.man_made",elementType:"geometry.stroke",stylers:[{color:"#043263"}]},{featureType:"landscape.natural",elementType:"all",stylers:[{visibility:"on"},{color:"#d9efec"}]},{featureType:"landscape.natural.landcover",elementType:"geometry.fill",stylers:[{color:"#043263"}]},{featureType:"landscape.natural.terrain",elementType:"all",stylers:[{visibility:"on"},{lightness:"31"},{hue:"#00fdff"}]},{featureType:"poi",elementType:"all",stylers:[{visibility:"off"}]},{featureType:"poi.attraction",elementType:"geometry.fill",stylers:[{color:"#004481"}]},{featureType:"poi.park",elementType:"all",stylers:[{visibility:"simplified"},{color:"#2dcccd"},{lightness:"85"}]},{featureType:"poi.park",elementType:"geometry.fill",stylers:[{color:"#072146"}]},{featureType:"road",elementType:"all",stylers:[{saturation:-100},{lightness:45}]},{featureType:"road",elementType:"geometry.fill",stylers:[{color:"#043263"}]},{featureType:"road",elementType:"labels.text.fill",stylers:[{color:"#ffffff"}]},{featureType:"road",elementType:"labels.icon",stylers:[{color:"#ff0000"}]},{featureType:"road.highway",elementType:"all",stylers:[{visibility:"simplified"}]},{featureType:"road.highway.controlled_access",elementType:"geometry.fill",stylers:[{color:"#004481"}]},{featureType:"road.highway.controlled_access",elementType:"labels",stylers:[{visibility:"off"}]},{featureType:"road.arterial",elementType:"labels.icon",stylers:[{visibility:"off"}]},{featureType:"transit",elementType:"all",stylers:[{visibility:"off"}]},{featureType:"transit",elementType:"labels.text.fill",stylers:[{color:"#ffffff"},{visibility:"off"}]},{featureType:"transit",elementType:"labels.text.stroke",stylers:[{color:"#004481"},{visibility:"off"}]},{featureType:"transit.station.rail",elementType:"all",stylers:[{visibility:"on"}]},{featureType:"water",elementType:"all",stylers:[{color:"#2dcccd"},{visibility:"on"},{saturation:"26"}]},{featureType:"water",elementType:"geometry.fill",stylers:[{color:"#1973b8"}]}];var cs=t`[ambient^=light] {
  --bbva-map-static-text-color: initial;
  --bbva-map-static-skeleton-quote-color: initial;
  --bbva-map-static-skeleton-quote-bg: initial;
  --bbva-map-static-skeleton-animated-layer-bg: initial;
}
`;const ds={dark:t`
    ${t`[ambient^=dark] {
  --bbva-map-static-text-color: var(--colorsSecondary100, ${i(n.secondary100)});
  --bbva-map-static-skeleton-quote-color: var(--colorsPrimaryCoreDark, ${i(n.primaryCoreDark)});
  --bbva-map-static-skeleton-quote-bg: var(--colorsPrimaryCoreDarkened, ${i(n.primaryCoreDarkened)});
  --bbva-map-static-skeleton-animated-layer-bg: var(--colorsPrimaryCoreDarkened, ${i(n.primaryCoreDarkened)});
}
`}
    ${T.dark}
  `,light:t`
    ${cs}
    ${T.light}
  `};let hs=class e extends(l(d(h))){static get is(){return"bbva-map-static"}static get scopedElements(){const t=[u];return e.scopedElementsFromClasses(t)}static get properties(){return{api:{type:String},apiKey:{type:String,attribute:"api-key"},message:{type:String},mapType:{type:String,attribute:"map-type"},icon:{type:String},location:{type:Object},size:{type:Object},zoom:{type:Number},scale:{type:Number},mapStyles:{type:String,attribute:"map-styles"},ellipsis:{type:Boolean,reflect:!0},iconDark:{type:String,attribute:"icon-dark"},loading:{type:Boolean,reflect:!0}}}constructor(){super(),this.api="https://maps.googleapis.com/maps/api/staticmap?",this.apiKey="",this.mapType="roadmap",this.icon="https://assets.bbvaexperience.com/visual/images/user-location/user-location-lightbg.png",this.location={latitude:"40.4219977",longitude:"-3.7058366"},this.size={width:"1024",height:"200"},this.zoom=16,this.scale=2,this.mapStyles="",this.mapAmbient=ns,this.ellipsis=!1,this.loading=!1,this._iconURL=this.icon,this.iconDark="https://assets.bbvaexperience.com/visual/images/user-location/user-location-darkbg.png"}updated(e){super.updated(e),e.has("disabled")&&this.setAttribute("aria-disabled",this.disabled),(e.has("ambient")||e.has("icon"))&&this._checkAmbient(),this.loading||this._createStaticMap(this._encodeIcon())}_checkAmbient(){var e;const t=null===(e=this.ambient)||void 0===e?void 0:e.includes("dark");this.mapAmbient=t?ls:ns,this._iconURL=t?this.iconDark:this.icon}_encodeIcon(){return encodeURIComponent(`icon:${this._iconURL}|`)}static get styles(){return[super.styles,os,ds.light,ds.dark,m("bbva-map-static-shared-styles")]}render(){return this.loading?g`<div class="skeleton"></div>`:g`<section id="map" class="bbva-map-static-section"></section>
          ${this.message?g`<bbva-text
                class="bbva-map-static-text"
                text="${this.message}"
                tag="section"
                size="S"
                ?ellipsis="${this.ellipsis}"
              ></bbva-text>`:""}`}_createStaticMap(t){const i=this.shadowRoot.getElementById("map");i.style.backgroundImage=`url(${this.api}${e._getStaticStyle(this.mapAmbient)}&style=${encodeURIComponent(this.mapStyles)}&zoom=${this.zoom}&scale=${this.scale}&size=${this.size.width}x${this.size.height}&maptype=${this.mapType}&markers=${t}${this.location.latitude},${this.location.longitude}&key=${this.apiKey})`,i.style.backgroundPosition="center",i.style.backgroundSize="cover"}static _getStaticStyle(e){const t=[];return e.forEach((e=>{let i="";e.stylers.length>0&&(i+=(Object.prototype.hasOwnProperty.call(e,"featureType")?`feature:${e.featureType}`:"feature:all")+"|",i+=(Object.prototype.hasOwnProperty.call(e,"elementType")?`element:${e.elementType}`:"element:all")+"|",e.stylers.forEach((e=>{const t=Object.keys(e)[0],s=e[t].toString().replace("#","0x");i+=`${t}:${s}|`}))),t.push(`style=${encodeURIComponent(i)}`)})),t.join("&")}};b("colors.secondary100"),b("colors.cool50"),b("colors.cool60"),b("colors.cool60");var ps=t`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.order-column-components {
  display: flex;
  flex-direction: column;
  align-items: center;
  flex: 1 1 auto;
}

.order-template {
  height: 80vh;
  display: flex;
  flex-direction: column;
}
`;class us extends(y(f(as(h)))){static get is(){return"vehicle-theft-location-detail"}static get scopedElements(){const e=[u,hs,ge,...us.configurationScopedElements()];return us.scopedElementsFromClasses(e)}static get properties(){return{apiKey:{type:String,attribute:"api-key"},geoLocation:{type:Object,attribute:"geo-location"},addressMessage:{type:String,attribute:"address-message"},btnTextLocation:{type:String,attribute:"btn-text-location"},loading:{type:Boolean}}}constructor(){super(),this.apiKey="",this.geoLocation={},this.address="",this.textLocation="",this.loading=!1}static get styles(){return[ps,T.light,ds.light,be.light,m("vehicle-theft-location-detail-shared-styles")]}_changeAddress(e){e.stopImmediatePropagation(),this._dispatchCustomEvent("emergency-vehicle-theft-reports-location-detail-change-address")}render(){return g`
      <div class="order-template">
        <div class="order-column-components">
          ${this.apiKey.length?g`
              <bbva-map-static
                ambient="light"
                api-key="${this.apiKey}"
                message="${this.addressMessage}"
                ?loading="${!this.loading}"
                .location="${{latitude:this.geoLocation.lat,longitude:this.geoLocation.lng}}"
                >
              </bbva-map-static>
            `:E}

          ${this.loading?g`
                <bbva-button-default
                  id="change-location"
                  alignment="center"
                  size="S"
                  variant="link"
                  text="${this.btnTextLocation}"
                  @click="${this._changeAddress}"
                >
                </bbva-button-default>
              `:E}
        </div>
      </div>
    `}}var ms=t`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0;
}

.multistep-section {
  --gridSpacerVariant: 0;
  position: absolute;
  width: 100%;
  z-index: 1;
}

[data-tag-name=bbva-expandable-multistep] {
  max-height: 0;
  overflow: visible;
}

[data-tag-name=bbva-expandable-step] {
  position: inherit;
}
[data-tag-name=bbva-expandable-step][completed] {
  height: 100%;
  position: absolute;
}
[data-tag-name=bbva-expandable-step][completed] .content {
  pointer-events: none;
}

.step-footer {
  position: absolute;
  bottom: 1.5rem;
  width: 100%;
}

.summary {
  --bbva-text-color: token("foundations.colors.primaryCoreLightened");
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1em);
}

.slot-footer {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1em) 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1em);
  transform: translateZ(0.01px);
}
.slot-footer [data-tag-name=bbva-text] {
  padding-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1em);
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1em);
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1em);
}
`;class gs extends(y(c(f(as(h))))){static get is(){return"location-detail-vehicle-theft-modal"}static get scopedElements(){const e=[ge,ve,ye,fe,_e,u,P,us,...gs.configurationScopedElements()];return gs.scopedElementsFromClasses(e)}static get properties(){return{apiKey:{type:String,attribute:"api-key"},visibleModal:{type:Boolean,attribute:"visible-modal"},data:{type:Object},geoLocation:{type:Object,attribute:"geo-location"},addressMessage:{type:String,attribute:"address-message"},privacyTermsPdf:{type:Boolean,attribute:"privacy-terms-pdf"},pdfDocument:{type:String,attribute:"pdf-document"},showHelpFaqs:{type:Boolean,attribute:"show-help-faqs"},_maxSteps:{type:Number,state:!0},_stepsToReset:{type:Array,state:!0},_nameSlotHeader:{type:String,state:!0},_loading:{type:Boolean,state:!0}}}constructor(){super(),this.config={back:!1,faqs:!0},this.apiKey="",this.visibleModal=!1,this.data={},this.geoLocation={},this.addressMessage="",this.hide=!1,this.privacyTermsPdf=!1,this.pdfDocument="",this.showHelpFaqs=!1,this._maxSteps=0,this._stepsToReset=[],this._nameSlotHeader="",this._loading=!1}get _multistep(){return this.shadowRoot.querySelector('[data-tag-name="bbva-expandable-multistep"]')}get _helpModal(){return this.shadowRoot.querySelector('[data-tag-name="bbva-help-modal"]')}get _steps(){return this.shadowRoot.querySelectorAll('[data-tag-name="bbva-expandable-step"]')}get _progressBar(){return this._helpModal.querySelector(".multistep-section")}get _footerModal(){return this._helpModal.querySelector('[slot="slot-footer"]')}static get styles(){return[ms,T.light,be.light,M.light,m("location-detail-vehicle-theft-modal-shared-styles")]}async firstUpdated(){super.firstUpdated(),await this.updateComplete,this._loading=!this.addressMessage;const e=this._multistep.querySelectorAll('[data-tag-name="bbva-expandable-step"]');this._maxSteps=e.length,this._footerModal.setAttribute("hidden","true")}async update(e){var t;super.update(e),e.has("data")&&null!==(t=this.data)&&void 0!==t&&t.headerText&&(await this.updateComplete,this._nameSlotHeader="slot-header",this._setHeader()),(e.has("addressMessage")||e.has("visibleModal")&&this.visibleModal)&&(this._loading=!this.addressMessage||!Object.keys(this.geoLocation).length),e.has("geoLocation")&&Object.keys(this.geoLocation).length&&(this._loading=!this.addressMessage)}_setHeader(){var e,t,i,s,a;this.config.header={text:null===(e=this.data)||void 0===e?void 0:e.headerText,iconRightPrimary:j(),accessibilityTextIconRightSecondary:null===(t=this.data)||void 0===t||null===(i=t.accessibility)||void 0===i?void 0:i.textIconRightSecondary,accessibilityTextIconRightPrimary:null===(s=this.data)||void 0===s||null===(a=s.accessibility)||void 0===a?void 0:a.textIconRightPrimary,variant:"modal"}}_reset(e){"boolean"!=typeof e||e||(this._stepsToReset=[0],this._loading=!0,this.data={},this._resetSteps(),this._dispatchCustomEvent("emergency-vehicle-theft-reports-location-detail-request-geolocation",!0))}_resetSteps(){this._steps[0].active=!0,this._steps[0].completed=!1,this._steps[0].disabled=!1}_handleModalState(e){e.stopImmediatePropagation();const{detail:{visible:t},target:i}=e;this.dispatchEvent(new CustomEvent("emergency-vehicle-theft-reports-modal-state-change",{bubbles:!0,composed:!0,detail:{visible:t,target:i,mode:"LocationDetail"}})),this._reset(t)}_handleCloseModal(e){e.stopImmediatePropagation();const{type:t}=e;"header-main-icon-right-primary-click"===t&&this._dispatchCustomEvent("emergency-vehicle-theft-reports-location-detail-modal-close-click")}_handleCloseClick(e){e.stopImmediatePropagation(),this._dispatchCustomEvent("emergency-vehicle-theft-reports-location-detail-modal-footer-button-click"),this.data={}}_handleSecondaryClick(e){e.stopImmediatePropagation(),this._dispatchCustomEvent("emergency-vehicle-theft-reports-location-detail-modal-"+(this.showHelpFaqs?"show-faqs":"help-click"))}_handleLinkClick(e){e.stopImmediatePropagation();let t="footer-link",i=!0;this.pdfDocument.length&&(t="pdf",i=this.pdfDocument),this._dispatchCustomEvent(`emergency-vehicle-theft-reports-location-detail-modal-${t}-click`,i)}_handleEventStep(e,t){e.dispatchEvent(new CustomEvent("complete",{bubbles:!0,composed:!0,detail:!0})),this._dispatchCustomEvent("emergency-vehicle-theft-reports-location-detail-expandable-next",t)}_updateMultiStep({detail:e}){e?(this._progressBar.setAttribute("hidden","true"),this._footerModal.removeAttribute("hidden")):(this._progressBar.removeAttribute("hidden"),this._footerModal.setAttribute("hidden","true"))}get _content(){var e,t,i,s;return g`
      <div class="multistep-section">
        <bbva-progress-multistep-bar
          accessibility-text="${null===(e=this.data)||void 0===e||null===(t=e.accessibility)||void 0===t?void 0:t.progressAriaLabel}"
          class="bar"
          value="${null===(i=this.data)||void 0===i||null===(s=i.multistep)||void 0===s?void 0:s.progress}"
        ></bbva-progress-multistep-bar>
      </div>
      <bbva-expandable-multistep
        ambient="light"
        has-animation
        hide-disabled-steps
        step-selector="[data-tag-name='bbva-expandable-step']"
        .stepsToReset="${this._stepsToReset}"
        @expandable-multistep-all-complete=${this._updateMultiStep}
      >
        ${this._tplSteps}
      </bbva-expandable-multistep>
    `}get _tplSteps(){var e,t,i,s,a,r;return g`
      <bbva-expandable-step
        id="step-1"
        header="${this.t(null===(e=this.data)||void 0===e||null===(t=e.multistep)||void 0===t?void 0:t.header)}"
        current-step-label="${this.t("emergency-vehicle-theft-reports-step-label",{currentStep:1,maxSteps:this._maxSteps})}"
        edit-label="${this.t("emergency-vehicle-theft-reports-step-edit")}"
        disabled-target=".action"
        total-steps="${this._maxSteps}"
        hide-padding-left
        hide-padding-right
      >
        <div class="content">
          <vehicle-theft-location-detail
            api-key="${this.apiKey}"
            .geoLocation="${this.geoLocation}"
            ?loading="${!this._loading}"
            address-message="${this.addressMessage}"
            btn-text-location="${null===(i=this.data)||void 0===i||null===(s=i.multistep)||void 0===s?void 0:s.btnTextLocation}"
          >
          </vehicle-theft-location-detail>

          <div class="step-footer">
            <bbva-button-default
              id="continue-step"
              ?disabled="${this._loading}"
              class="action"
              alignment="center"
              size="S"
              text="${null===(a=this.data)||void 0===a||null===(r=a.multistep)||void 0===r?void 0:r.btnText}"
              @click="${({target:e})=>this._handleEventStep(e,0)}">
            </bbva-button-default>
          </div>
        </div>
        <div slot="summary" class="summary">
          <bbva-text tag="span" text="${this.addressMessage}" size="S" alignment="left"></bbva-text>
        </div>
      </bbva-expandable-step>
    `}render(){var e,t,i,s,a,r,o,n,l;return g`
      <bbva-help-modal
        ambient="light"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        header-type="modal"
        full-height
        fixed-footer
        hide-content-padding-top
        ?visible=${this.visibleModal}
        header-text="${this.t(null===(e=this.data)||void 0===e?void 0:e.headerText)}"
        accessibility-text-icon-right-primary="${this.t(`${null===(t=this.data)||void 0===t||null===(i=t.accessibility)||void 0===i?void 0:i.textIconRightPrimary}`)}"
        @modal-state-change="${this._handleModalState}"
        @header-main-icon-right-primary-click=${this._handleCloseModal}
        @header-main-icon-right-secondary-click=${this._handleSecondaryClick}
      >
        <div slot="${this._nameSlotHeader}">
          ${super.render()}
        </div>
        <div slot="slot-content">
          ${this._content}
        </div>
        <div slot="slot-footer">
          <div class="slot-footer">
            <bbva-button-default
              id="footer-button"
              ambient="light"
              variant="positive"
              class="footer-button"
              alignment="center"
              text="${this.t(`${null===(s=this.data)||void 0===s||null===(a=s.buttons)||void 0===a?void 0:a.buttonText}`)}"
              @click="${e=>this._handleCloseClick(e)}"
            >
            </bbva-button-default>
            <bbva-text
              tag="span"
              text="${null===(r=this.data)||void 0===r||null===(o=r.stickyFooter)||void 0===o?void 0:o.description}"
              size="S"
              alignment="center"
            >
            </bbva-text>
            ${this.privacyTermsPdf?g`
                  <bbva-button-default
                    variant="link"
                    class="footer-link"
                    alignment="center"
                    text="${this.t(null===(n=this.data)||void 0===n||null===(l=n.stickyFooter)||void 0===l?void 0:l.noticePrivacyText)}"
                    @click="${this._handleLinkClick}"
                  >
                  </bbva-button-default>
                `:E}
          </div>
        </div>
      </bbva-help-modal>
    `}}var bs=t`.slotted-map {
  height: 100%;
}
.slotted-map [data-tag-name=bbva-map-dynamic] {
  height: 100%;
  text-align: left;
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0;
  --bbva-help-modal-footer-last-button-margin-top: 0;
}
`;class vs extends(y(c(f(as(h))))){static get is(){return"change-location-vehicle-theft-modal"}static get scopedElements(){const e=[ve,Bt,...vs.configurationScopedElements()];return vs.scopedElementsFromClasses(e)}static get properties(){return{apiKey:{type:String,attribute:"api-key"},visibleModal:{type:Boolean,attribute:"visible-modal"},data:{type:Object},geoLocation:{type:Object,attribute:"geo-location"},tempGeoLocation:{type:Object,attribute:"temp-geo-location"},_refreshGeoLocation:{type:Object,state:!0},_saveAddress:{type:String,state:!0}}}constructor(){super(),this.apiKey="",this.visibleModal=!1,this.data={},this.geoLocation={},this.tempGeoLocation={},this._refreshGeoLocation={},this._saveAddress=""}static get styles(){return[bs,Ht.light,m("change-location-vehicle-theft-modal-shared-styles")]}get _refresh(){var e;return null!==(e=this.tempGeoLocation)&&void 0!==e&&e.lat?this.tempGeoLocation:this._temporaryRequestGeoLocation}get _temporaryRequestGeoLocation(){var e;return null!==(e=this._refreshGeoLocation)&&void 0!==e&&e.lat?this._refreshGeoLocation:this.geoLocation}_parseDynamicAddress({detail:e}){var t,i,s,a;null!==(t=e.address)&&void 0!==t&&t.formatted_address&&null!==(i=e.address)&&void 0!==i&&i.address_components&&(this._saveAddress=null===(s=e.address)||void 0===s?void 0:s.formatted_address,this._dispatchCustomEvent("emergency-vehicle-theft-reports-location-formatted-address-change",{formattedAddress:this._saveAddress,addressComponents:this._parsedAddressComponents(null===(a=e.address)||void 0===a?void 0:a.address_components)}))}_parsedAddressComponents(e){const t={route:{label:"route",uses:"long_name"},street_number:{label:"strNumber",uses:"long_name"},locality:{label:"city",uses:"long_name"},postal_code:{label:"postalCode",uses:"long_name"},country:{label:"country",uses:"short_name"}};return e.reduce(((e,i)=>{const s=i.types.find((e=>t[e]));return s&&(e[t[s].label]=i[t[s].uses]),e}),{})}_parseGeoLocation({detail:e}){this._refreshGeoLocation={...e.geoLocation},this._dispatchCustomEvent("emergency-vehicle-theft-reports-location-geolocation-refresh")}_reset(e){"boolean"!=typeof e||e||(this._refreshGeoLocation={})}_handleModalState(e){e.stopImmediatePropagation();const{detail:{visible:t},target:i}=e;this.dispatchEvent(new CustomEvent("emergency-vehicle-theft-reports-modal-state-change",{bubbles:!0,composed:!0,detail:{visible:t,target:i,mode:"ChangeLocation"}})),this._reset(t)}_handleCloseModal(e){e.stopImmediatePropagation();const{type:t}=e,i=t.split("-").splice(2,3).join("-");"help-modal-header-right-primary-click"===t&&(this._dispatchCustomEvent("emergency-vehicle-theft-reports-change-location-modal-close-click"),this.data={}),"footer-button-click"===i&&(this._dispatchCustomEvent(`emergency-vehicle-theft-reports-change-location-modal-${i}`),this.data={})}_mapReady(){this._dispatchCustomEvent("emergency-vehicle-theft-reports-change-location-map-ready",!0)}_requestGeoLocation(){this._dispatchCustomEvent("emergency-vehicle-theft-reports-location-detail-geolocation-request",!1)}_changeGeoLocation(e){e.stopImmediatePropagation(),this._dispatchCustomEvent("emergency-vehicle-theft-reports-change-location-geolocation-changed",{newGeoLocation:this._refresh,formattedAddress:this._saveAddress}),this._handleCloseModal(e)}render(){var e,t,i,s,a,r,o,n,l,c,d,h,p,u;return g`
      <bbva-help-modal
        ambient="light"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        full-height
        fixed-footer
        hide-content-padding-top
        ?visible=${this.visibleModal}
        header-text="${this.t(`${null===(e=this.data)||void 0===e||null===(t=e.changeLocation)||void 0===t?void 0:t.headerText}`)}"
        button-text="${this.t(`${null===(i=this.data)||void 0===i||null===(s=i.changeLocation)||void 0===s||null===(a=s.buttons)||void 0===a?void 0:a.buttonText}`)}"
        aria-label="${this.t(`${null===(r=this.data)||void 0===r||null===(o=r.changeLocation)||void 0===o||null===(n=o.accessibility)||void 0===n?void 0:n.ariaLabel}`)}"
        accessibility-text-icon-right-primary="${this.t(`${null===(l=this.data)||void 0===l||null===(c=l.changeLocation)||void 0===c||null===(d=c.accessibility)||void 0===d?void 0:d.textIconRightPrimary}`)}"
        @modal-state-change="${this._handleModalState}"
        @help-modal-footer-button-click="${this._changeGeoLocation}"
        @help-modal-header-right-primary-click="${this._handleCloseModal}"
      >
        <div slot="slot-content" class="slotted-map">
          <bbva-map-dynamic
            ambient="light"
            hidden-large-button
            variant="large"
            api-key="${this.apiKey}"
            is-draggable-pin
            optional-input-label=""
            hide-map-info-footer
            .geoLocation="${this._refresh}"
            .label="${null===(h=this.data.changeLocation)||void 0===h?void 0:h.label}"
            predictive-info-message="${null===(p=this.data)||void 0===p||null===(u=p.changeLocation)||void 0===u?void 0:u.predictiveInfoMessage}"
            show-predictive
            @map-dynamic-map-ready="${this._mapReady}"
            @map-dynamic-geolocation-request="${this._requestGeoLocation}"
            @map-dynamic-geolocation-changed="${this._parseGeoLocation}"
            @map-dynamic-address-changed="${this._parseDynamicAddress}"
          >
          </bbva-map-dynamic>
        </div>
      </bbva-help-modal>
    `}}var ys=t`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.additional-content {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1em) calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1em);
  margin: 0;
}
.additional-content .title {
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${i(v.medium.fontWeight)});
  line-height: var(--lineHeightTypeLarge, ${i(a.typeLarge)});
}
.additional-content .description {
  margin: 0 auto;
}

[data-tag-name=bbva-clip-microillustration] {
  margin: calc(((2.25 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}
:host([hide-margin-top]) [data-tag-name=bbva-clip-microillustration] {
  margin-top: 0;
}
`;class fs extends(y(f(as(h)))){static get is(){return"vehicle-theft-message-modal"}static get scopedElements(){const e=[u,V,...fs.configurationScopedElements()];return fs.scopedElementsFromClasses(e)}static get properties(){return{microillustration:{type:String},titleMessage:{type:String,attribute:"title-message"},description:{type:String},hideMarginTop:{type:Boolean,attribute:"hide-margin-top",reflect:!0}}}constructor(){super(),this.microillustration="",this.description="",this.titleMessage="",this.hideMarginTop=!1}static get styles(){return[ys,Se.light,T.light,m("vehicle-theft-message-modal-shared-styles")]}get _contentTitle(){return g`
      <bbva-text
        text=${this.titleMessage}
        class="title"
        size="L"
        alignment="center"
        inherit
        tag="h2"
      ></bbva-text>
    `}get _contentDescription(){return g`
      <bbva-text
        class="description"
        text=${this.description}
        size="S"
        alignment="center"
        inherit
      ></bbva-text>
    `}render(){return g`
      <bbva-clip-microillustration
        microillustration="${this.microillustration}"
        size="L"
        role="presentation"
      ></bbva-clip-microillustration>

      <div class="additional-content">
        ${this._contentTitle} ${this._contentDescription}
      </div>
    `}}var _s=t`:host {
  display: flex;
  flex-direction: row;
  align-items: center;
  justify-content: space-between;
  box-sizing: border-box;
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}

.list-label {
  display: flex;
  align-items: center;
  min-width: 0;
  margin-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}

.list-description {
  flex-direction: row;
  align-items: center;
}
.list-description [data-tag-name=bbva-date] {
  color: var(--colorsSecondary600, ${i(n.secondary600)});
}

.text-hour {
  display: inline-block;
}
`;class Ss extends(y(f(as(h)))){static get is(){return"vehicle-theft-list-item"}static get scopedElements(){const e=[u,$e,...Ss.configurationScopedElements()];return Ss.scopedElementsFromClasses(e)}static get properties(){return{label:{type:String},description:{type:String},date:{type:String},formatDate:{type:Object,attribute:"format-date"}}}constructor(){super(),this.label="",this.description="",this.date="",this.formatDate={}}static get styles(){return[_s,T.light,xe.light,m("vehicle-theft-list-item-shared-styles")]}_renderIf(e,t){return e?t:E}render(){return g`
      <div class="list-label">
        <bbva-text tag="span" text="${this.label}" size="S"></bbva-text>
      </div>
      <div class="list-description">
        ${this._renderIf(this.description.length,g`
            <bbva-text tag="span" text="${this.description}" font-weight="500" size="S"></bbva-text>
          `)}
        ${this._renderIf(this.date.length,g`
            <bbva-date
              date="${this.date}"
              .options="${this.formatDate}"
            ></bbva-date>
            <bbva-text
              class="text-hour"
              alignment="right"
              text="h"
              size="S"
              font-style="italic"
              font-weight="500"
              inherit
            ></bbva-text>
          `)}
      </div>
    `}}var $s=t`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.slot-content-success {
  width: auto;
}
.slot-content-success [data-tag-name=bbva-progress-timer] {
  margin-top: calc(((5.75 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
  padding: 0 0 0;
}
.slot-content-success [data-tag-name=bbva-progress-timer] span {
  padding: 0 calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1em);
}
.slot-content-success [data-tag-name=bbva-button-default] {
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}
.slot-content-success [data-tag-name=bbva-button-row] {
  padding-bottom: calc(((2.25 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1em);
}
.slot-content-success [data-tag-name=bbva-date] {
  --bbva-date-color: var(--colorsSecondary600, ${i(n.secondary600)});
}

.report-success {
  padding: 0 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1em);
}

.slot-footer-success {
  text-align: center;
}
.slot-footer-success .accept-success {
  margin-bottom: calc(((2.25 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}

.spacing-medium-top {
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-notification-message] {
  margin-bottom: calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}
`;class xs extends(y(c(f(as(h))))){static get is(){return"success-vehicle-theft-report-modal"}static get scopedElements(){const e=[$e,u,_,ve,Ce,ge,Rt,fs,Ss,Te,...xs.configurationScopedElements()];return xs.scopedElementsFromClasses(e)}static get properties(){return{visibleModal:{type:Boolean,attribute:"visible-modal"},data:{type:Object},formatDate:{type:Object,attribute:"format-date"},_enableCall:{type:Boolean,state:!0}}}constructor(){super(),this.visibleModal=!1,this.data={},this._enableCall=!1,this.formatDate={}}static get styles(){return[$s,be.light,ke.light,xe.light,C.light,T.light,Mt.light,m("success-vehicle-theft-report-modal-shared-styles")]}get getPdfButton(){return this.data.viewPolicyVisible?[{icon:Ie(),label:this.t("emergency-vehicle-theft-reports-success-modal-button-action-pdf"),id:"pdf"}]:[]}get actionButtons(){return[...this.getPdfButton,{icon:Ee(),label:this.t("emergency-vehicle-theft-reports-success-modal-button-action-share"),id:"share"}]}_handleModalState(e){const{detail:{visible:t},target:i}=e;this.dispatchEvent(new CustomEvent("emergency-vehicle-theft-reports-modal-state-change",{bubbles:!0,composed:!0,detail:{visible:t,target:i,mode:"SuccessVehicle"}}))}_handleCloseModal(e){e.stopImmediatePropagation();const{type:t}=e;"help-modal-header-right-primary-click"===t&&(this._dispatchCustomEvent("emergency-vehicle-theft-reports-success-modal-close-click"),this.data={})}_handleCloseClick(e){e.stopImmediatePropagation(),this._dispatchCustomEvent("emergency-vehicle-theft-reports-success-modal-exit-button-click"),this.data={}}_triggerActionButtons({detail:e}){const{id:t}=this.actionButtons[e];"pdf"===t&&this._dispatchCustomEvent("emergency-vehicle-theft-reports-success-modal-see-policy-click",this.data.viewPolicy),"share"===t&&this._dispatchCustomEvent("emergency-vehicle-theft-reports-success-modal-share-receipt-click",this.data.ticketSharing)}_triggerCallAction(){var e;this._dispatchCustomEvent("emergency-vehicle-theft-reports-link-action-enable",{eventName:"emergency-vehicle-theft-reports-action-generate-call",number:null===(e=this.data)||void 0===e?void 0:e.phoneNumberBbvaLineVehicle})}_generateLinkAction(){this._enableCall=!0}get _assistanceLine(){var e,t;return g`
      <bbva-button-default
        class="spacing-medium-top"
        ?disabled="${!this._enableCall}"
        variant="link"
        text="${this.t(`${null===(e=this.data)||void 0===e||null===(t=e.footerElements)||void 0===t?void 0:t.buttonLinkText}`)}"
        @click="${this._triggerCallAction}"
      ></bbva-button-default>
    `}get _content(){var e,t,i,s,a,r,o,n,l,c,d,h;return g`
      <vehicle-theft-message-modal
        hide-margin-top
        microillustration="success"
        title-message="${this.t("emergency-vehicle-theft-reports-success-modal-title-text")}"
        description="${this.t("emergency-vehicle-theft-reports-success-modal-body-text")}"
      ></vehicle-theft-message-modal>
      ${this._listItem(null===(e=this.data)||void 0===e||null===(t=e.reportText)||void 0===t?void 0:t.date,"",null===(i=this.data)||void 0===i?void 0:i.operationDate,this.formatDate)}
      ${this._listItem(null===(s=this.data)||void 0===s||null===(a=s.reportText)||void 0===a?void 0:a.policy,this.data.policyNumber)}
      ${this._listItem(null===(r=this.data)||void 0===r||null===(o=r.reportText)||void 0===o?void 0:o.report,null===(n=this.data)||void 0===n||null===(l=n.reportText)||void 0===l?void 0:l.idReport)}
      ${this._listItem(null===(c=this.data)||void 0===c||null===(d=c.reportText)||void 0===d?void 0:d.typeReport,null===(h=this.data)||void 0===h?void 0:h.headerText)} ${this._timeCall}
      ${this._assistanceLine} ${this._notificationMessage} ${this._operativesButtons}
    `}_listItem(e,t,i="",s={}){return g`
      <vehicle-theft-list-item label="${this.t(e)}" description="${this.t(t)}" date="${i}" .formatDate="${s}">
      </vehicle-theft-list-item>
    `}get _notificationMessage(){var e;return g`
      <bbva-notification-message message="${null===(e=this.data)||void 0===e?void 0:e.notificationMessage}">
      </bbva-notification-message>
    `}get _timeCall(){var e,t,i,s,a,r;return g`
      <bbva-progress-timer
        show-vertical
        timeout="${null===(e=this.data)||void 0===e||null===(t=e.timeCall)||void 0===t?void 0:t.timeout}"
        time-alert="${null===(i=this.data)||void 0===i||null===(s=i.timeCall)||void 0===s?void 0:s.timeAlert}"
        @progress-timer-counter-finish="${this._generateLinkAction}"
      >
      </bbva-progress-timer>
      <bbva-text
        tag="span"
        text=${this.t(`${null===(a=this.data)||void 0===a||null===(r=a.timeCall)||void 0===r?void 0:r.text}`)}
        alignment="center"
        size="M"
      ></bbva-text>
    `}get _operativesButtons(){var e,t,i,s;return g`
      <bbva-button-row
        aria-label="${this.t(`${null===(e=this.data)||void 0===e||null===(t=e.accessibilityButtonRow)||void 0===t?void 0:t.ariaLabel}`)}"
        .options="${this.actionButtons}"
        accessibility-text="${this.t(`${null===(i=this.data)||void 0===i||null===(s=i.accessibilityButtonRow)||void 0===s?void 0:s.accessibilityText}`)}"
        @button-row-item-click="${this._triggerActionButtons}"
      >
      </bbva-button-row>
    `}get _footerElements(){var e,t;return g`
      <bbva-button-default
        class="accept-success"
        text=${this.t(`${null===(e=this.data)||void 0===e||null===(t=e.footerElements)||void 0===t?void 0:t.buttonText}`)}
        alignment="center"
        @click="${this._handleCloseClick}"
      ></bbva-button-default>
    `}render(){var e,t,i,s,a,r,o,n;return g`
      <bbva-help-modal
        ambient="light"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        header-type="${null===(e=this.data)||void 0===e?void 0:e.headerType}"
        ?full-height="${null===(t=this.data)||void 0===t?void 0:t.fullHeight}"
        ?hide-content-padding-top="${null===(i=this.data)||void 0===i?void 0:i.hideContentPaddingTop}"
        ?visible=${this.visibleModal}
        header-text="${null===(s=this.data)||void 0===s?void 0:s.headerText}"
        aria-label="${this.t(`${null===(a=this.data)||void 0===a||null===(r=a.accessibility)||void 0===r?void 0:r.ariaLabel}`)}"
        accessibility-text-icon-right-primary="${this.t(`${null===(o=this.data)||void 0===o||null===(n=o.accessibility)||void 0===n?void 0:n.textIconRightPrimary}`)}"
        @modal-state-change="${this._handleModalState}"
        @help-modal-header-right-primary-click="${this._handleCloseModal}"
        ><div slot="slot-content" class="slot-content-success">
          ${this._content}
        </div>
        <div slot="slot-footer" class="slot-footer-success">
          ${this._footerElements}
        </div>
      </bbva-help-modal>
    `}}var Cs=t`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class Ts extends(y(c(f(as(h))))){static get is(){return"detected-errors-vehicle-theft-repor-modal"}static get scopedElements(){const e=[ve,fs,...Ts.configurationScopedElements()];return Ts.scopedElementsFromClasses(e)}static get properties(){return{visibleModal:{type:Boolean,attribute:"visible-modal"},data:{type:Object}}}constructor(){super(),this.visibleModal=!1,this.data={}}static get styles(){return[Cs,m("detected-errors-vehicle-theft-repor-modal-shared-styles")]}_handleModalState(e){const{detail:{visible:t},target:i}=e;this.dispatchEvent(new CustomEvent("emergency-vehicle-theft-reports-modal-state-change",{bubbles:!0,composed:!0,detail:{visible:t,target:i,mode:"DetectedErrors"}}))}_handleCloseModal(e){e.stopImmediatePropagation();const{type:t}=e;"help-modal-header-right-primary-click"===t&&(this._dispatchCustomEvent("emergency-vehicle-theft-reports-detected-modal-close-click"),this.data={}),"help-modal-footer-link-click"===t&&(this._dispatchCustomEvent("emergency-vehicle-theft-reports-detected-modal-footer-link-click"),this.data={})}_triggerCallAction(){var e,t;null!==(e=this.data)&&void 0!==e&&e.hiddenLink?(this._dispatchCustomEvent("emergency-vehicle-theft-reports-detected-modal-footer-continue-error-button-click"),this.data={}):this._dispatchCustomEvent("emergency-vehicle-theft-reports-detected-modal-call-action",{eventName:"emergency-vehicle-theft-reports-action-generate-call",number:null===(t=this.data)||void 0===t?void 0:t.phoneNumberBbvaLineVehicle})}get _content(){var e,t,i,s,a,r;return g`
      <vehicle-theft-message-modal
        microillustration="${null===(e=this.data)||void 0===e||null===(t=e.messageModal)||void 0===t?void 0:t.microillustration}"
        title-message="${this.t(`${null===(i=this.data)||void 0===i||null===(s=i.messageModal)||void 0===s?void 0:s.titleMessage}`)}"
        description="${this.t(`${null===(a=this.data)||void 0===a||null===(r=a.messageModal)||void 0===r?void 0:r.message}`)}"
      ></vehicle-theft-message-modal>
    `}render(){var e,t,i,s,a,r,o,n,l,c,d,h,p,u;return g`
      <bbva-help-modal
        ambient="light"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ?full-height="${null===(e=this.data)||void 0===e?void 0:e.fullHeight}"
        ?fixed-footer="${null===(t=this.data)||void 0===t?void 0:t.fixedFooter}"
        ?hide-content-padding-top="${null===(i=this.data)||void 0===i?void 0:i.hideContentPaddingTop}"
        ?visible=${this.visibleModal}
        header-type="${null===(s=this.data)||void 0===s?void 0:s.headerType}"
        header-text="${this.t(`${null===(a=this.data)||void 0===a?void 0:a.headerText}`)}"
        button-text="${this.t(`${null===(r=this.data)||void 0===r||null===(o=r.buttons)||void 0===o?void 0:o.buttonText}`)}"
        link-text="${this.t(`${null===(n=this.data)||void 0===n||null===(l=n.buttons)||void 0===l?void 0:l.buttonLinkText}`)}"
        .closeModalElements="${null===(c=this.data)||void 0===c?void 0:c.closeModalElements}"
        aria-label="${this.t(`${null===(d=this.data)||void 0===d||null===(h=d.accessibility)||void 0===h?void 0:h.ariaLabel}`)}"
        accessibility-text-icon-right-primary="${this.t(`${null===(p=this.data)||void 0===p||null===(u=p.accessibility)||void 0===u?void 0:u.textIconRightPrimary}`)}"
        @modal-state-change="${this._handleModalState}"
        @help-modal-header-right-primary-click="${this._handleCloseModal}"
        @help-modal-footer-button-click="${this._triggerCallAction}"
        @help-modal-footer-link-click="${this._handleCloseModal}"
        ><div slot="slot-content">
          ${this._content}
        </div>
      </bbva-help-modal>
    `}}var ks=t`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class Is extends(y(c(f(as(h))))){static get is(){return"comunication-error-vehicle-theft-report-modal"}static get scopedElements(){const e=[ve,fs,...Is.configurationScopedElements()];return Is.scopedElementsFromClasses(e)}static get properties(){return{visibleModal:{type:Boolean,attribute:"visible-modal"},data:{type:Object}}}constructor(){super(),this.visibleModal=!1,this.data={}}static get styles(){return[ks,m("comunication-error-vehicle-theft-report-modal-shared-styles")]}_handleModalState(e){const{detail:{visible:t},target:i}=e;this.dispatchEvent(new CustomEvent("emergency-vehicle-theft-reports-modal-state-change",{bubbles:!0,composed:!0,detail:{visible:t,target:i,mode:"ComunicationError"}}))}_handleCloseModal(e){e.stopImmediatePropagation();const{type:t}=e;"help-modal-header-right-primary-click"===t&&(this._dispatchCustomEvent("emergency-vehicle-theft-reports-comunication-error-modal-close-click"),this.data={}),"help-modal-footer-link-click"===t&&(this._dispatchCustomEvent("emergency-vehicle-theft-reports-comunication-error-modal-footer-link-click"),this.data={})}_triggerCallAction(){var e;this._dispatchCustomEvent("emergency-vehicle-theft-reports-comunication-error-call-action",{eventName:"emergency-vehicle-theft-reports-action-generate-call",number:null===(e=this.data)||void 0===e?void 0:e.phoneNumberBbvaLine})}get _content(){var e,t,i,s,a,r;return g`
      <vehicle-theft-message-modal
        microillustration="${null===(e=this.data)||void 0===e||null===(t=e.messageModal)||void 0===t?void 0:t.microillustration}"
        title-message="${this.t(`${null===(i=this.data)||void 0===i||null===(s=i.messageModal)||void 0===s?void 0:s.titleMessage}`)}"
        description="${this.t(`${null===(a=this.data)||void 0===a||null===(r=a.messageModal)||void 0===r?void 0:r.description}`)}"
      ></vehicle-theft-message-modal>
    `}render(){var e,t,i,s,a,r,o,n,l,c,d,h,p,u;return g`
      <bbva-help-modal
        ambient="light"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ?full-height="${null===(e=this.data)||void 0===e?void 0:e.fullHeight}"
        ?fixed-footer="${null===(t=this.data)||void 0===t?void 0:t.fixedFooter}"
        ?hide-content-padding-top="${null===(i=this.data)||void 0===i?void 0:i.hideContentPaddingTop}"
        ?visible=${this.visibleModal}
        header-type="${null===(s=this.data)||void 0===s?void 0:s.headerType}"
        header-text="${this.t(`${null===(a=this.data)||void 0===a?void 0:a.headerText}`)}"
        button-text="${this.t(`${null===(r=this.data)||void 0===r||null===(o=r.buttons)||void 0===o?void 0:o.buttonText}`)}"
        link-text="${this.t(`${null===(n=this.data)||void 0===n||null===(l=n.buttons)||void 0===l?void 0:l.buttonLinkText}`)}"
        .closeModalElements="${null===(c=this.data)||void 0===c?void 0:c.closeModalElements}"
        aria-label="${this.t(`${null===(d=this.data)||void 0===d||null===(h=d.accessibility)||void 0===h?void 0:h.ariaLabel}`)}"
        accessibility-text-icon-right-primary="${this.t(`${null===(p=this.data)||void 0===p||null===(u=p.accessibility)||void 0===u?void 0:u.textIconRightPrimary}`)}"
        @modal-state-change="${this._handleModalState}"
        @help-modal-header-right-primary-click="${this._handleCloseModal}"
        @help-modal-footer-button-click="${this._triggerCallAction}"
        @help-modal-footer-link-click="${this._handleCloseModal}"
        ><div slot="slot-content">
          ${this._content}
        </div>
      </bbva-help-modal>
    `}}var Es=t`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class ws extends(y(c(f(as(h))))){static get is(){return"error-vehicle-theft-report-modal"}static get scopedElements(){const e=[ve,...ws.configurationScopedElements()];return ws.scopedElementsFromClasses(e)}static get properties(){return{visibleModal:{type:Boolean,attribute:"visible-modal"},data:{type:Object}}}constructor(){super(),this.visibleModal=!1,this.data={}}static get styles(){return[Es,m("error-vehicle-theft-report-modal-shared-styles")]}_handleModalState(e){const{detail:{visible:t},target:i}=e;this.dispatchEvent(new CustomEvent("emergency-vehicle-theft-reports-modal-state-change",{bubbles:!0,composed:!0,detail:{visible:t,target:i,mode:"ErrorVehicle"}}))}_handleCloseModal(e){e.stopImmediatePropagation();const{type:t}=e;"help-modal-footer-button-click"===t&&(this._dispatchCustomEvent("emergency-vehicle-theft-reports-error-modal-footer-button-click"),this.data={}),"help-modal-footer-link-click"!==t&&"help-modal-close"!==t||this._dispatchCustomEvent("emergency-vehicle-theft-reports-error-modal-footer-link-click")}render(){var e,t,i,s,a,r,o,n,l,c;return g`
      <bbva-help-modal
        ambient="light"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ?visible=${this.visibleModal}
        modal-type="${null===(e=this.data)||void 0===e?void 0:e.modalType}"
        title-icon="${null===(t=this.data)||void 0===t?void 0:t.titleIcon}"
        body-text="${this.t(`${null===(i=this.data)||void 0===i?void 0:i.bodyText}`)}"
        button-text="${this.t(`${null===(s=this.data)||void 0===s||null===(a=s.buttons)||void 0===a?void 0:a.buttonText}`)}"
        link-text="${this.t(`${null===(r=this.data)||void 0===r||null===(o=r.buttons)||void 0===o?void 0:o.buttonLinkText}`)}"
        aria-label="${this.t(`${null===(n=this.data)||void 0===n||null===(l=n.accessibility)||void 0===l?void 0:l.ariaLabel}`)}"
        .closeModalElements="${null===(c=this.data)||void 0===c?void 0:c.closeModalElements}"
        @modal-state-change="${this._handleModalState}"
        @help-modal-close="${this._handleCloseModal}"
        @help-modal-footer-button-click="${this._handleCloseModal}"
        @help-modal-footer-link-click="${this._handleCloseModal}">
      </bbva-help-modal>
    `}}var Rs=t`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class Ms extends(y(c(f(as(h))))){static get is(){return"notice-privacy-vehicle-theft-modal"}static get scopedElements(){const e=[ve,u,...Ms.configurationScopedElements()];return Ms.scopedElementsFromClasses(e)}static get properties(){return{visibleModal:{type:Boolean,attribute:"visible-modal"},data:{type:Object}}}constructor(){super(),this.visibleModal=!1,this.data={}}static get styles(){return[Rs,T.light,m("notice-privacy-vehicle-theft-modal-shared-styles")]}_handleModalState(e){const{detail:{visible:t},target:i}=e;this.dispatchEvent(new CustomEvent("emergency-vehicle-theft-reports-modal-state-change",{bubbles:!0,composed:!0,detail:{visible:t,target:i,mode:"NoticePrivacy"}}))}_handleCloseModal(e){e.stopImmediatePropagation();const{type:t}=e,i=t.split("-").splice(2,3).join("-");"help-modal-header-right-primary-click"===t&&(this._dispatchCustomEvent("emergency-vehicle-theft-reports-notice-privacy-modal-close-click"),this.data={}),"footer-button-click"===i&&(this._dispatchCustomEvent(`emergency-vehicle-theft-reports-notice-privacy-modal-${i}`),this.data={})}render(){var e,t,i,s,a,r,o,n,l,c,d,h,p,u,m,b;return g`
      <bbva-help-modal
        ambient="light"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        full-height
        fixed-footer
        hide-content-padding-top
        ?visible=${this.visibleModal}
        header-text="${this.t(null===(e=this.data)||void 0===e||null===(t=e.noticePrivacy)||void 0===t?void 0:t.headerText)}"
        button-text="${this.t(`${null===(i=this.data)||void 0===i||null===(s=i.noticePrivacy)||void 0===s||null===(a=s.buttons)||void 0===a?void 0:a.buttonText}`)}"
        title-icon="${w()}"
        aria-label="${this.t(`${null===(r=this.data)||void 0===r||null===(o=r.accessibility)||void 0===o?void 0:o.ariaLabel}`)}"
        accessibility-text-icon-right-primary="${this.t(`${null===(n=this.data)||void 0===n||null===(l=n.noticePrivacy)||void 0===l||null===(c=l.accessibility)||void 0===c?void 0:c.textIconRightPrimary}`)}"
        @modal-state-change="${this._handleModalState}"
        @help-modal-header-right-primary-click="${this._handleCloseModal}"
        @help-modal-footer-button-click="${this._handleCloseModal}"
      >
        <div slot="slot-content">
          <bbva-text
            size="S"
            text="${null===(d=this.data)||void 0===d||null===(h=d.noticePrivacy)||void 0===h||null===(p=h.body)||void 0===p?void 0:p.paragraph}"
            alignment="center"
          >
          </bbva-text>
          <bbva-text
            size="S"
            text="${null===(u=this.data)||void 0===u||null===(m=u.noticePrivacy)||void 0===m||null===(b=m.body)||void 0===b?void 0:b.paragraphTwo}"
            alignment="center"
          >
          </bbva-text>
        </div>
      </bbva-help-modal>
    `}}var Ls=t`:host {
  display: block;
  box-sizing: border-box;
  --bbva-transition-container-text-align: left;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=help-faqs-aem] {
  height: auto;
}

[data-tag-name=bbva-transition-container] {
  --bbva-transition-container-padding: 0;
}
`;class Ps extends(y(c(f(as(h))))){static get is(){return"help-faqs-vehicle-theft-modal"}static get scopedElements(){const e=[we,Vt,Tt,...Ps.configurationScopedElements()];return Ps.scopedElementsFromClasses(e)}static get properties(){return{visibleTransition:{type:Boolean,attribute:"visible-transition"},faqsConfigurations:{type:Object,attribute:"faqs-configurations"},phoneNumberBbvaLineVehicle:{type:String,attribute:"phone-number-bbva-line-vehicle"},hideIconText:{type:Boolean,attribute:"hide-icon-text"},_headingLevel:{type:Number,state:!0}}}constructor(){super(),this.visibleTransition=!1,this.faqsConfigurations={},this.phoneNumberBbvaLineVehicle="",this.language="",this.hideIconText=!1,this._headingLevel=2}static get styles(){return[kt.light,Ls,m("help-faqs-vehicle-theft-shared-styles")]}get _formatNumberLineVehicule(){return this.phoneNumberBbvaLineVehicle.replace(/(\d{3})(\d{3})(\d{4})/,"$1 $2 $3")}_handleCloseModal(e){e.stopImmediatePropagation();const{type:t}=e;"header-main-icon-left-primary-click"===t&&this._dispatchCustomEvent("emergency-vehicle-theft-reports-help-faqs-modal-close-click")}_handleLinkClick(e){e.stopImmediatePropagation(),this._dispatchCustomEvent("emergency-vehicle-theft-reports-faqs-menu-help-faqs-aem-detail-link-click")}_triggerCallAction(){this._dispatchCustomEvent("emergency-vehicle-theft-reports-help-faqs-call-action",{eventName:"emergency-vehicle-theft-reports-action-generate-call",number:this.phoneNumberBbvaLineVehicle})}render(){var e,t;return g`
      <bbva-transition-container
        ?visible=${this.visibleTransition}
        accessibility-text-icon-left-primary="${this.t("emergency-report-header-return")}"
        icon-left-primary="${ue()}"
        header-text="${this.t("emergency-vehicle-theft-reports-faqs-header-text")}"
        @header-main-icon-left-primary-click="${this._handleCloseModal}"
      >
        <div slot="slot-content" ambient="light">
          <help-faqs-aem
            ?i-o-s-fixed-header="${this.iOSFixedHeader}"
            ?hide-icon-text="${this.hideIconText}"
            language="${this.language}"
            ?native="${this.native}"
            host="${null===(e=this.faqsConfigurations)||void 0===e?void 0:e.hostAEM}"
            content-fragment-path="${null===(t=this.faqsConfigurations)||void 0===t?void 0:t.contentFragmentPath}"
            hide-footer
            headingLevel="${this._headingLevel}"
            @help-faqs-aem-detail-link-click="${this._handleLinkClick}"
          >
          </help-faqs-aem>
          <bbva-button-list
            ambient="light"
            icon="${z()}"
            title-text="${this.t("emergency-vehicle-theft-reports-faqs-call-text")}"
            text="${this._formatNumberLineVehicule}"
            @click="${this._triggerCallAction}"
          ></bbva-button-list>
        </div>
      </bbva-transition-container>
    `}}class As extends(y(c(f(as(h))))){static get is(){return"emergency-vehicle-theft-reports-dm"}static get scopedElements(){const e=[Ye,ni,jt];return As.scopedElementsFromClasses(e)}static get properties(){return{appSettingsApiVersion:{type:String,attribute:"app-settings-api-version"},publicSettings:{type:Array,attribute:"public-settings"},publicSettingsId:{type:String,attribute:"public-settings-id"},publicSettingsKey:{type:String,attribute:"public-settings-key"},vehicleInsuranceId:{type:String,attribute:"vehicle-insurance-id"},vehicleInsurancesApiVersion:{type:String,attribute:"vehicle-insurances-api-version"},vehicleInsurance:{type:Object,attribute:"vehicle-insurance"},fieldsProperty:{type:String,attribute:"fields-property"},productTypeVehicleInsurance:{type:String,attribute:"product-type-vehicle-insurance"},subProductType:{type:String,attribute:"sub-product-type"},lossesReportRequestVersion:{type:String,attribute:"losses-report-request-api-version"},evadeServiceLaunch:{type:Boolean,attribute:"evade-service-launch"},geoLocation:{type:Object,attribute:"geo-location"},componentTypes:{type:String,attribute:"component-types"},addressComponents:{type:Object,attribute:"address-components"},_modalVisible:{type:Boolean,state:!0},_dataModal:{type:Object,state:!0},_typeModal:{type:String,state:!0},_stolenVehicleDetails:{type:Object,state:!0},_policyNumber:{type:String,state:!0}}}constructor(){super(),this.appSettingsApiVersion="0",this.publicSettings=[],this.publicSettingsId="",this.publicSettingsKey="",this.vehicleInsuranceId="",this.vehicleInsurancesApiVersion="1",this.vehicleInsurance={},this.fieldsProperty="",this.productTypeVehicleInsurance="",this.subProductType="",this.lossesReportRequestVersion="1",this.evadeServiceLaunch=!1,this.geoLocation={},this.componentTypes="",this.addressComponents={},this._policyNumber="",this._modalVisible=!1,this._dataModal={},this._typeModal="",this._stolenVehicleDetails={}}firstUpdated(){this.evadeServiceLaunch||(super.firstUpdated(),this.getServices())}async getServices(){await this._getPublicSettingsDm(),await this._getVehicleInsurance()}async _getPublicSettingsDm(){this._publicSettingsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-public-settings-api-dm"]'),Object.keys(this.publicSettings).length?(this._publicSettingsDm.publicSettings=this.publicSettings,this._succesPublicSettingsHandler()):this._publicSettingsDm.getPublicSettings(this.publicSettingsId,{key:this.publicSettingsKey})}async _getVehicleInsurance(){this._vehicleInsuranceDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-vehicle-insurance-api-dm"]'),Object.keys(this.vehicleInsurance).length?(this._vehicleInsuranceDm.vehicleInsurance=this.vehicleInsurance,this._successVehicleInsuranceHandler()):this._vehicleInsuranceDm.getVehicleInsurance(this.vehicleInsuranceId,{fields:this.fieldsProperty})}_succesPublicSettingsHandler(e){const[t]=(null==e?void 0:e.detail)||this.publicSettings,i=JSON.parse(null==t?void 0:t.value),{data:{emergencies:s,hostAEM:a}}=i;this._validateProductType(s,a)}_validateProductType(e,t){const[i]=e.filter((e=>e.productType===this.productTypeVehicleInsurance)),{emergency:s,flowSubProductType:a,productType:r,contentFragmentPath:o}=i;this._getDataFromStoleId(s,a,r,t,o)}_getDataFromStoleId(e,t,i,s,a){if(t===this.subProductType&&i===this.productTypeVehicleInsurance&&e&&s&&a){const[t]=e.filter((e=>"STOLE"===e.id)),{geolocation:i}=t,r=null==t?void 0:t.callTimeout,o=null==t?void 0:t.helpDescription;this.componentTypes=i,this._handlerStoleData(r,o,s,a)}}_handlerStoleData(e,t,i,s){const{isActive:a,time:r}=e,o={helpDescription:t,hostAEM:i,contentFragmentPath:s};a&&Object.assign(o,this._getCallTime(r)),this._dispatchCustomEvent("emergency-vehicle-theft-reports-dm-stole-data",o)}_getCallTime(e){const[t,i]=e.split(":"),s=6e4*t+1e3*i;return{totalMinutes:s,halfMinutes:s/2}}_successVehicleInsuranceHandler(e){const t=(null==e?void 0:e.detail)||this.vehicleInsurance,{vehicle:i,id:s,policyNumber:a,certificateNumber:r}=t,o=(null==i?void 0:i.licencePlate)||"",{model:{brand:n,subBrand:l},vehicleType:c}=i;this._stolenVehicleDetails={id:s,licencePlate:o,brand:n,subBrand:l,vehicleType:c,certificateNumber:r},this._policyNumber=a,this._dispatchCustomEvent("emergency-vehicle-theft-reports-dm-uploaded-data")}createVehicleTheftReport(){this.showLoader(),this._postLossesReportRequests()}_postLossesReportRequests(){this._lossesReportRequestDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-losses-report-requests-api-dm"]');const e=this._requestBodyConfiguration();this._lossesReportRequestDm.postLossesReportRequests(e)}_bodyAdressComponents(){const{addressComponents:e,formattedAddress:t}=this.addressComponents;let i=[{name:t,componentTypes:["FULL_ADDRESS"],code:null==e?void 0:e.country}];return"NO_FULL_ADDRESS"===this.componentTypes&&(i=[{name:null==e?void 0:e.country,componentTypes:["COUNTRY"]},{name:null==e?void 0:e.postalCode,componentTypes:["POSTAL_CODE"]},{name:null==e?void 0:e.city,componentTypes:["CITY"]},{name:`${null==e?void 0:e.route} ${null==e?void 0:e.strNumber}`,componentTypes:["ADDRESS"]}]),i}_requestBodyConfiguration(){var e,t,i,s,a,r,o,n,l,c,d;const h=this._bodyAdressComponents();return{policy:{id:null===(e=this._stolenVehicleDetails)||void 0===e?void 0:e.id,certificateNumber:(null===(t=this._stolenVehicleDetails)||void 0===t?void 0:t.certificateNumber)||""},requestType:{id:"NEW",lossDetail:{addresses:[{location:{addressComponents:h}}],vehicle:{licensePlate:null===(i=this._stolenVehicleDetails)||void 0===i?void 0:i.licencePlate,brand:{id:null===(s=this._stolenVehicleDetails)||void 0===s?void 0:s.brand.id,name:null===(a=this._stolenVehicleDetails)||void 0===a?void 0:a.brand.name},subBrand:{id:null===(r=this._stolenVehicleDetails)||void 0===r?void 0:r.subBrand.id,name:null===(o=this._stolenVehicleDetails)||void 0===o?void 0:o.subBrand.name},vehicleType:{id:null===(n=this._stolenVehicleDetails)||void 0===n?void 0:n.vehicleType.id,name:null===(l=this._stolenVehicleDetails)||void 0===l?void 0:l.vehicleType.name}},geolocation:{latitude:null===(c=this.geoLocation)||void 0===c?void 0:c.lat,longitude:null===(d=this.geoLocation)||void 0===d?void 0:d.lng},serviceSpecificLosses:[{id:"STOLE",eventType:"CLAIMS"}]}}}}_succesReportHandler({detail:e}){const t={...e,policyNumber:this._policyNumber};this._dispatchCustomEvent("emergency-vehicle-theft-reports-dm-created",t)}_errorReportHandler({detail:e}){const{messages:t}=e,[i]=t,{code:s}=i;"alreadyRequested"===s&&this._dispatchCustomEvent("emergency-vehicle-theft-reports-dm-detected",{message:"emergency-vehicle-theft-reports-report-detected-modal-description-text",buttonText:"emergency-vehicle-theft-reports-report-detected-modal-button-text",buttonLinkText:"emergency-vehicle-theft-reports-comunication-error-modal-link-text",hiddenLink:!1}),"alreadyRequested"!==s&&this._dispatchCustomEvent("emergency-vehicle-theft-reports-dm-failed-continue-error",{message:"emergency-vehicle-theft-reports-report-detected-modal-failed-continue-text-description",buttonText:"emergency-vehicle-theft-reports-report-detected-modal-failed-continue-text-button",buttonLinkText:"",hiddenLink:!0})}_comunicationError(){this._dispatchCustomEvent("emergency-vehicle-theft-reports-dm-comunication-error",{buttonText:"emergency-vehicle-theft-reports-comunication-error-modal-button-text"})}get _tplDms(){return g`
      <bbva-global-public-settings-api-dm
        host="${this.host}"
        version="${this.appSettingsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @public-settings-api-dm-fetch="${this._succesPublicSettingsHandler}"
        @public-settings-api-dm-fetch-error="${this._comunicationError}"
        @api-dm-error="${this._comunicationError}"
      ></bbva-global-public-settings-api-dm>
      <bbva-global-vehicle-insurance-api-dm
        .host="${this.host}"
        .version="${this.vehicleInsurancesApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @vehicle-insurance-api-dm-fetch="${this._successVehicleInsuranceHandler}"
        @vehicle-insurance-api-dm-fetch-error="${this._comunicationError}"
        @api-dm-error="${this._comunicationError}"
      ></bbva-global-vehicle-insurance-api-dm>
      <bbva-global-losses-report-requests-api-dm
        version="${this.lossesReportRequestVersion}"
        ?native="${this.native}"
        host="${this.host}"
        .requiredToken="${this.requiredToken}"
        @losses-report-requests-api-dm-create="${this._succesReportHandler}"
        @losses-report-requests-api-dm-create-error="${this._errorReportHandler}"
        @api-dm-error="${this._comunicationError}"
      ></bbva-global-losses-report-requests-api-dm>
    `}render(){return g`
      ${this._tplDms}
    `}}const Ds=new r;var Os=t`:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--emergency-vehicle-theft-reports-dark-mode-bg-color, var(--emergency-vehicle-theft-reports-bg-color, var(--ambientsLight, ${i(me.light)})));
  height: 100%;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
${Ds.mediaRules()}`;class Ns extends(y(c(f(as(h))))){static get is(){return"emergency-vehicle-theft-reports"}static get scopedElements(){const e=[gs,vs,xs,Ts,Is,ws,Ms,As,Ps,...Ns.configurationScopedElements()];return Ns.scopedElementsFromClasses(e)}static get properties(){return{apiKey:{type:String,attribute:"api-key"},appSettingsApiVersion:{type:String,attribute:"app-settings-api-version"},publicSettings:{type:Array,attribute:"public-settings"},publicSettingsId:{type:String,attribute:"public-settings-id"},publicSettingsKey:{type:String,attribute:"public-settings-key"},vehicleInsuranceId:{type:String,attribute:"vehicle-insurance-id"},vehicleInsurancesApiVersion:{type:String,attribute:"insurance-vehicle-api-version"},vehicleInsurance:{type:Object,attribute:"vehicle-insurance"},fieldsProperty:{type:String,attribute:"fields-property"},productTypeVehicleInsurance:{type:String,attribute:"product-type-vehicle-insurance"},subProductType:{type:String,attribute:"sub-product-type"},lossesReportRequestApiVersion:{type:String,attribute:"losses-report-request-api-version"},evadeServiceLaunch:{type:Boolean,attribute:"evade-service-launch"},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"},viewPolicyVisible:{type:Boolean,attribute:"view-policy-visible"},viewPolicy:{type:String,attribute:"view-policy"},ticketSharing:{type:Object,attribute:"ticket-sharing"},phoneNumberBbvaLineVehicle:{type:String,attribute:"phone-number-bbva-line-vehicle"},phoneNumberBbvaLine:{type:String,attribute:"phone-number-bbva-line"},viewCallVisible:{type:Boolean,attribute:"view-call-visible"},geoLocation:{type:Object,attribute:"geo-location"},tempGeoLocation:{type:Object,attribute:"temp-geo-location"},privacyTermsPdf:{type:Boolean,attribute:"privacy-terms-pdf"},pdfDocument:{type:String,attribute:"pdf-document"},showHelpFaqs:{type:Boolean,attribute:"show-help-faqs"},formatDate:{type:Object,attribute:"format-date"},hideIconText:{type:Boolean,attribute:"hide-icon-text"},_openHelpFaqs:{type:Boolean,state:!0},_openCreateReportModal:{type:Boolean,state:!0},_openChangeAddressModal:{type:Boolean,state:!0},_openNoticePrivacyModal:{type:Boolean,state:!0},_openSuccessReportModal:{type:Boolean,state:!0},_openDetectedErrorsModal:{type:Boolean,state:!0},_openComunicationErrorModal:{type:Boolean,state:!0},_dataModal:{type:Object,state:!0},_savedDataPublicSettings:{type:Object,state:!0},_savedFaqsConfiguration:{type:Object,state:!0},_address:{type:String,state:!0},_showExitConfirm:{type:Boolean,state:!0},_openExitReportModal:{type:Boolean,state:!0}}}constructor(){super(),this.apiKey="",this.config={back:!1,loader:!0},this.appSettingsApiVersion="0",this.publicSettings=[],this.publicSettingsId="",this.publicSettingsKey="",this.vehicleInsuranceId="",this.vehicleInsurancesApiVersion="1",this.vehicleInsurance={},this.fieldsProperty="",this.productTypeVehicleInsurance="",this.subProductType="",this.lossesReportRequestApiVersion="1",this.evadeServiceLaunch=!1,this.iOSFixedHeader=!1,this.viewPolicyVisible=!1,this.viewPolicy="",this.ticketSharing={},this.phoneNumberBbvaLineVehicle="",this.phoneNumberBbvaLine="",this.viewCallVisible=!1,this.geoLocation={},this.tempGeoLocation={},this.privacyTermsPdf=!1,this.pdfDocument="",this.showHelpFaqs=!1,this.language="",this.formatDate={day:"2-digit",month:"long",year:"numeric",hour:"2-digit",minute:"2-digit"},this.hideIconText=!1,this._openCreateReportModal=!1,this._openChangeAddressModal=!1,this._openNoticePrivacyModal=!1,this._openSuccessReportModal=!1,this._openDetectedErrorsModal=!1,this._openComunicationErrorModal=!1,this._openExitReportModal=!1,this._dataModal={},this._savedDataPublicSettings={},this._savedFaqsConfiguration={},this._address="",this._openHelpFaqs=!1,this._showExitConfirm=!1}static get styles(){return[Os,m("emergency-vehicle-theft-reports-shared-styles")]}firstUpdated(){this.evadeServiceLaunch||super.firstUpdated()}async update(e){super.update(e);const t=e.has("publicSettings")||e.has("vehicleInsurance"),i=!!this.publicSettings.length||!!Object.keys(this.vehicleInsurance).length||!!Object.keys(this.geoLocation).length;t&&i&&this.evadeServiceLaunch&&(await this._emergencyVehicleTheftDm.updateComplete,this._emergencyVehicleTheftDm.getServices(),this._startVehicleReport())}get _emergencyVehicleTheftDm(){return this._emergencyVehicleTheftReportsDm||(this._emergencyVehicleTheftReportsDm=this.shadowRoot.querySelector('[data-tag-name="emergency-vehicle-theft-reports-dm"]')),this._emergencyVehicleTheftReportsDm}_nativePluginGeoLocation({detail:e}){this.native?this._dispatchCustomEvent("emergency-vehicle-theft-reports-native-geolocation",e):this._getWebCurrentPosition(e)}_getWebCurrentPosition(e){navigator.geolocation.getCurrentPosition((t=>{e?this.geoLocation={lat:t.coords.latitude,lng:t.coords.longitude}:this.tempGeoLocation={lat:t.coords.latitude,lng:t.coords.longitude}}),(e=>{this._dispatchCustomEvent("emergency-vehicle-theft-reports-geolocation-error",{code:e.code,message:e.message})}),{enableHighAccuracy:!0,timeout:5e3,maximumAge:0})}_listeners({type:e}){this.addEventListener(`${e}`,(()=>{this._resetData()}))}_resetData(){this._savedDataPublicSettings={},this._openCreateReportModal=!1,this._openChangeAddressModal=!1,this._openSuccessReportModal=!1,this._openDetectedErrorsModal=!1,this._openComunicationErrorModal=!1,this._openExitReportModal=!1,this._showExitConfirm=!1}_callPhoneNumber({detail:{eventName:e,number:t}}){const i=String(t).split("#"),s={phoneNumber:i[0]||void 0,showConfirmation:!0,extension:i[1]||void 0};this._dispatchCustomEvent(e,s)}_stoleDataMapping({detail:e}){this._savedDataPublicSettings={...e},this._savedFaqsConfiguration={contentFragmentPath:null==e?void 0:e.contentFragmentPath,hostAEM:null==e?void 0:e.hostAEM}}_startVehicleReport(){var e;this._dataModal={};const t={accessibility:{progressAriaLabel:"emergency-vehicle-theft-reports-main-modal-progress-aria-label",ariaLabel:"emergency-vehicle-theft-reports-main-modal-aria-label",textIconRightPrimary:"emergency-vehicle-theft-reports-header-return",textIconRightSecondary:"emergency-report-faqs-icon"},buttons:{buttonText:"emergency-vehicle-theft-reports-main-modal-button-text"},fullHeight:!0,fixedFooter:!0,hideContentPaddingTop:!0,headerType:"modal",headerText:null===(e=this._savedDataPublicSettings)||void 0===e?void 0:e.helpDescription,multistep:{progress:100,header:"emergency-vehicle-theft-reports-main-modal-header",btnTextLocation:"emergency-vehicle-theft-reports-main-modal-change-location-text",btnText:"emergency-vehicle-theft-reports-main-modal-continue-text"},stickyFooter:{description:"emergency-vehicle-theft-reports-main-modal-description",noticePrivacyText:"emergency-vehicle-theft-reports-main-modal-notice-privacy-text"}};this._dataModal={...t},this._openCreateReportModal=!0}_vehicleChangeAddress(){this._dataModal={...this._dataModal,changeLocation:{accessibility:{ariaLabel:"emergency-vehicle-theft-reports-change-address-modal-aria-label",textIconRightPrimary:"emergency-vehicle-theft-reports-header-return"},label:"emergency-vehicle-theft-reports-change-address-label",predictiveInfoMessage:"emergency-vehicle-theft-reports-change-address-predictive-info-message",buttons:{buttonText:"emergency-vehicle-theft-reports-change-address-button-text"},headerText:"emergency-vehicle-theft-reports-change-address-modal-header-text"}},this._openChangeAddressModal=!0}_vehicleNoticePrivacy(){this._dataModal={...this._dataModal,noticePrivacy:{accessibility:{ariaLabel:"emergency-vehicle-theft-reports-notice-privacy-modal-aria-label",textIconRightPrimary:"emergency-vehicle-theft-reports-header-return"},label:"emergency-vehicle-theft-reports-notice-privacy-label",predictiveInfoMessage:"emergency-vehicle-theft-reports-notice-privacy-predictive-info-message",buttons:{buttonText:"emergency-vehicle-theft-reports-notice-privacy-button-text"},body:{paragraph:"emergency-vehicle-theft-reports-notice-privacy-paragraph-text",paragraphTwo:"emergency-vehicle-theft-reports-notice-privacy-paragraph-two-text"},headerText:"emergency-vehicle-theft-reports-notice-privacy-modal-header-text"}},this._openNoticePrivacyModal=!0}_closeVehicleChangeAddress(){this._openChangeAddressModal=!1,this._resetTempGeoLocation()}_closeVehicleNoticePrivacyModal(){this._openNoticePrivacyModal=!1}_closeExitReport(){this._openExitReportModal=!1}_formattedAddress({detail:e}){this._address=e}_newGeoLocation({detail:e}){const{newGeoLocation:t,formattedAddress:i}=e;this.geoLocation={...t},this._address.formattedAddress=i}_resetTempGeoLocation(){this.tempGeoLocation={}}_createTheftReport(){this._openCreateReportModal=!1,this._emergencyVehicleTheftDm.createVehicleTheftReport()}_helpFaqsTheftReport(){this._openHelpFaqs=!0}_closeHelpFaqs(){this._openHelpFaqs=!1}_exitConfirm(){this._showExitConfirm=!0}_manageBackButton(){this._showExitConfirm?this._exitReport():this._resetData()}_vehicleTheftReportCreated({detail:e}){var t,i,s;const{id:a,operationDate:r,policyNumber:o}=e;this._dataModal={};const n={accessibility:{ariaLabel:"emergency-vehicle-theft-reports-success-modal-aria-label",textIconRightPrimary:"emergency-vehicle-theft-reports-header-return"},accessibilityButtonRow:{ariaLabel:"emergency-vehicle-theft-reports-available-sections",accessibilityText:"emergency-vehicle-theft-reports-success-actions"},contentElements:{microillustration:"success",titleMessage:"emergency-vehicle-theft-reports-success-modal-title-text",message:"emergency-vehicle-theft-reports-success-modal-body-text"},footerElements:{buttonText:"emergency-vehicle-theft-reports-success-modal-button-text",text:"emergency-vehicle-theft-reports-success-modal-link-title",buttonLinkText:"emergency-vehicle-theft-reports-success-modal-link-text"},fullHeight:!0,hideContentPaddingTop:!0,headerText:null===(t=this._savedDataPublicSettings)||void 0===t?void 0:t.helpDescription,headerType:"modal",operationDate:r,policyNumber:o,phoneNumberBbvaLineVehicle:this.phoneNumberBbvaLineVehicle,reportText:{date:"emergency-vehicle-theft-reports-success-modal-date-title",policy:"emergency-vehicle-theft-reports-success-modal-policy-title",report:"emergency-vehicle-theft-reports-success-modal-report-title",typeReport:"emergency-vehicle-theft-reports-success-modal-type-report-title",idReport:a},timeCall:{timeout:null===(i=this._savedDataPublicSettings)||void 0===i?void 0:i.totalMinutes,timeAlert:null===(s=this._savedDataPublicSettings)||void 0===s?void 0:s.halfMinutes,text:"emergency-vehicle-theft-reports-success-modal-number-content"},notificationMessage:"emergency-vehicle-theft-reports-success-modal-notification-message",ticketSharing:this.ticketSharing,viewPolicyVisible:this.viewPolicyVisible,viewPolicy:this.viewPolicy};this._dataModal={...n},this.clearLoader(),this._openSuccessReportModal=!0}_errorCreatingReport({detail:e}){const{message:t,buttonText:i,buttonLinkText:s,hiddenLink:a}=e;this._dataModal={};const r={accessibility:{ariaLabel:"emergency-vehicle-theft-reports-report-detected-modal-aria-label",textIconRightPrimary:"emergency-vehicle-theft-reports-header-return"},buttons:{buttonText:i,buttonLinkText:s},fullHeight:!0,fixedFooter:!0,hideContentPaddingTop:!0,headerType:"modal",headerText:"emergency-vehicle-theft-reports-report-detected-modal-header-text",hiddenLink:a,messageModal:{microillustration:"error",titleMessage:"emergency-vehicle-theft-reports-report-detected-modal-title-text",message:t},phoneNumberBbvaLineVehicle:this.phoneNumberBbvaLineVehicle,closeModalElements:a?this._closeElements("footer-button"):this._closeElements("footer-link")};this._dataModal={...r},this.clearLoader(),this._openDetectedErrorsModal=!0}_closeElements(e,t="header-right-primary"){return[e,t]}_comunicationError({detail:e}){this._dataModal={};const t={accessibility:{ariaLabel:"emergency-vehicle-theft-reports-comunication-error-modal-aria-label",textIconRightPrimary:"emergency-vehicle-theft-reports-header-return"},buttons:{buttonText:this.viewCallVisible?null==e?void 0:e.buttonText:"",buttonLinkText:"emergency-vehicle-theft-reports-comunication-error-modal-link-text"},fullHeight:!0,fixedFooter:!0,hideContentPaddingTop:!0,headerType:"modal",headerText:"emergency-vehicle-theft-reports-comunication-error-modal-header-text",messageModal:{microillustration:"error",titleMessage:"emergency-vehicle-theft-reports-comunication-error-modal-title-text",description:"emergency-vehicle-theft-reports-comunication-error-modal-body-text"},phoneNumberBbvaLine:this.phoneNumberBbvaLine,closeModalElements:["header-right-primary","footer-link"]};this._dataModal={...t},this.clearLoader(),this._openComunicationErrorModal=!0}_exitReport(){const e={exitReport:{accessibility:{ariaLabel:"emergency-vehicle-theft-reports-exit-modal-aria-label",textIconRightPrimary:""},buttons:{buttonText:"emergency-vehicle-theft-reports-exit-modal-button-text",buttonLinkText:"emergency-vehicle-theft-reports-exit-modal-link-text"},modalType:"warning",titleIcon:A(),bodyText:"emergency-vehicle-theft-reports-exit-modal-body-text",closeModalElements:["footer-link"]}};this._dataModal={...this._dataModal,...e},this._openExitReportModal=!0}get _tplCreateLocationReportModal(){return g`
      <location-detail-vehicle-theft-modal
        api-key="${this.apiKey}"
        ?visible-modal="${this._openCreateReportModal}"
        ?show-help-faqs="${this.showHelpFaqs}"
        .data="${this._dataModal}"
        .geoLocation="${this.geoLocation}"
        ?privacy-terms-pdf="${this.privacyTermsPdf}"
        pdf-document="${this.pdfDocument}"
        address-message="${this._address.formattedAddress||""}"
        @emergency-vehicle-theft-reports-location-detail-request-geolocation="${this._nativePluginGeoLocation}"
        @emergency-vehicle-theft-reports-location-detail-change-address="${this._vehicleChangeAddress}"
        @emergency-vehicle-theft-reports-location-detail-modal-close-click="${this._manageBackButton}"
        @emergency-vehicle-theft-reports-location-detail-modal-footer-button-click="${this._createTheftReport}"
        @emergency-vehicle-theft-reports-location-detail-modal-footer-link-click="${this._vehicleNoticePrivacy}"
        @emergency-vehicle-theft-reports-location-detail-modal-show-faqs="${this._helpFaqsTheftReport}"
        @emergency-vehicle-theft-reports-location-detail-expandable-next="${this._exitConfirm}"
      >
      </location-detail-vehicle-theft-modal>
    `}get _tplHelpFaqs(){return g`
      <help-faqs-vehicle-theft-modal
        language="${this.language}"
        ?hide-icon-text="${this.hideIconText}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ?visible-transition="${this._openHelpFaqs}"
        .faqsConfigurations="${this._savedFaqsConfiguration}"
        phone-number-bbva-line-vehicle="${this.phoneNumberBbvaLineVehicle}"
        @emergency-vehicle-theft-reports-help-faqs-call-action="${this._callPhoneNumber}"
        @emergency-vehicle-theft-reports-help-faqs-modal-close-click="${this._closeHelpFaqs}"
      >
      </help-faqs-vehicle-theft-modal>
    `}get _tplChangeAddressModal(){return g`
      <change-location-vehicle-theft-modal
        api-key="${this.apiKey}"
        ?visible-modal="${this._openChangeAddressModal}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        .data="${this._dataModal}"
        .geoLocation="${this.geoLocation}"
        .tempGeoLocation="${this.tempGeoLocation}"
        @emergency-vehicle-theft-reports-change-location-map-ready="${this._nativePluginGeoLocation}"
        @emergency-vehicle-theft-reports-location-detail-geolocation-request="${this._nativePluginGeoLocation}"
        @emergency-vehicle-theft-reports-location-formatted-address-change="${this._formattedAddress}"
        @emergency-vehicle-theft-reports-change-location-geolocation-changed="${this._newGeoLocation}"
        @emergency-vehicle-theft-reports-location-geolocation-refresh="${this._resetTempGeoLocation}"
        @emergency-vehicle-theft-reports-change-location-modal-close-click="${this._closeVehicleChangeAddress}"
        @emergency-vehicle-theft-reports-change-location-modal-footer-button-click="${this._closeVehicleChangeAddress}"
      >
      </change-location-vehicle-theft-modal>
    `}get _tplSuccessReportModal(){return g`
      <success-vehicle-theft-report-modal
        ?visible-modal="${this._openSuccessReportModal}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        .data="${this._dataModal}"
        .formatDate="${this.formatDate}"
        @emergency-vehicle-theft-reports-success-modal-close-click="${this._listeners}"
        @emergency-vehicle-theft-reports-success-modal-exit-button-click="${this._resetData}"
        @emergency-vehicle-theft-reports-link-action-enable="${this._callPhoneNumber}"
      ></success-vehicle-theft-report-modal>
    `}get _tplDetectedErrosModal(){return g`
      <detected-errors-vehicle-theft-repor-modal
        ?visible-modal="${this._openDetectedErrorsModal}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        .data="${this._dataModal}"
        @emergency-vehicle-theft-reports-detected-modal-close-click="${this._listeners}"
        @emergency-vehicle-theft-reports-detected-modal-call-action="${this._callPhoneNumber}"
        @emergency-vehicle-theft-reports-detected-modal-footer-continue-error-button-click="${this._listeners}"
        @emergency-vehicle-theft-reports-detected-modal-footer-link-click="${this._listeners}"
      ></detected-errors-vehicle-theft-repor-modal>
    `}get _tplComunicationErrorModal(){return g`
      <comunication-error-vehicle-theft-report-modal
        ?visible-modal="${this._openComunicationErrorModal}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        .data="${this._dataModal}"
        @emergency-vehicle-theft-reports-comunication-error-modal-close-click="${this._listeners}"
        @emergency-vehicle-theft-reports-comunication-error-call-action="${this._callPhoneNumber}"
        @emergency-vehicle-theft-reports-comunication-error-modal-footer-link-click="${this._listeners}"
      ></comunication-error-vehicle-theft-report-modal>
    `}get _tplExitReportModal(){return g`
      <error-vehicle-theft-report-modal
        ?visible-modal="${this._openExitReportModal}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        .data="${this._dataModal.exitReport}"
        @emergency-vehicle-theft-reports-error-modal-footer-button-click="${this._listeners}"
        @emergency-vehicle-theft-reports-error-modal-footer-link-click="${this._closeExitReport}"
      ></error-vehicle-theft-report-modal>
    `}get _tplNoticePrivacyModal(){return g`
      <notice-privacy-vehicle-theft-modal
        ?visible-modal="${this._openNoticePrivacyModal}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        .data="${this._dataModal}"
        @emergency-vehicle-theft-reports-notice-privacy-modal-close-click="${this._closeVehicleNoticePrivacyModal}"
        @emergency-vehicle-theft-reports-notice-privacy-modal-footer-button-click="${this._closeVehicleNoticePrivacyModal}"
      >
      </notice-privacy-vehicle-theft-modal>
    `}get _tplDM(){return g`
      <emergency-vehicle-theft-reports-dm
        host="${this.host}"
        ?native="${this.native}"
        required-token="${this.requiredToken}"
        vehicle-insurance-id="${this.vehicleInsuranceId}"
        app-settings-api-version="${this.appSettingsApiVersion}"
        public-settings-id="${this.publicSettingsId}"
        public-settings-key="${this.publicSettingsKey}"
        .publicSettings="${this.publicSettings}"
        .vehicleInsurance="${this.vehicleInsurance}"
        vehicle-insurance-api-version="${this.vehicleInsurancesApiVersion}"
        fields-property="${this.fieldsProperty}"
        product-type-vehicle-insurance="${this.productTypeVehicleInsurance}"
        sub-product-type="${this.subProductType}"
        losses-report-request-api-version="${this.lossesReportRequestApiVersion}"
        ?evade-service-launch="${this.evadeServiceLaunch}"
        .geoLocation="${this.geoLocation}"
        .addressComponents="${this._address}"
        @emergency-vehicle-theft-reports-dm-stole-data="${this._stoleDataMapping}"
        @emergency-vehicle-theft-reports-dm-uploaded-data="${this._startVehicleReport}"
        @emergency-vehicle-theft-reports-dm-created="${this._vehicleTheftReportCreated}"
        @emergency-vehicle-theft-reports-dm-detected="${this._errorCreatingReport}"
        @emergency-vehicle-theft-reports-dm-failed-continue-error="${this._errorCreatingReport}"
        @emergency-vehicle-theft-reports-dm-comunication-error="${this._comunicationError}"
      ></emergency-vehicle-theft-reports-dm>
    `}render(){return g`
      ${super.render()} ${this._tplDM}
      <div ambient="light">
        ${this._tplCreateLocationReportModal} ${this._tplChangeAddressModal}
        ${this._tplSuccessReportModal} ${this._tplDetectedErrosModal} ${this._tplNoticePrivacyModal}
        ${this._tplComunicationErrorModal} ${this._tplExitReportModal}
        ${this.showHelpFaqs?this._tplHelpFaqs:E}
      </div>
    `}}customElements.define(Ns.is,Ns);var qs=t`:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

:host {
  display: block;
  box-sizing: border-box;
  --bbva-help-modal-padding: 0;
}

.order-online-components {
  display: flex;
  justify-content: space-between;
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}

.privacy-info-description {
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}

.summary-description {
  margin-top: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}

.container {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
  margin-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}

.content [data-tag-name=bbva-text] {
  margin-left: calc(((2.125 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
  margin-bottom: calc(((2.875 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-progress-multistep-bar] {
  z-index: 2;
  position: sticky;
  top: 0;
  right: 0;
  left: 0;
  display: block;
  height: 0.5rem;
}

.remove-overflow {
  overflow: hidden;
}

.center-content {
  display: flex;
  flex-direction: column;
  align-items: center;
}
`,Vs=t`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-map-static] {
  width: 100%;
}

.order-column-components {
  display: flex;
  flex-direction: column;
  align-items: center;
  flex: 1 1 auto;
}

.footer-button-complete {
  margin-top: auto;
  width: 100%;
  display: flex;
  justify-content: end;
  flex-direction: column;
  align-items: center;
  flex: 1.5 0 0;
}

.order-template {
  height: 80vh;
  display: flex;
  flex-direction: column;
}
`;let Bs=class e extends(y(Xe(f(c(h))))){static get is(){return"report-location-step"}static get properties(){return{apiKey:{type:String,attribute:"api-key"},staticLocationMessage:{type:String,attribute:"static-location-message",reflect:!0},staticLocation:{type:Object,attribute:"static-location"},isLoading:{type:Boolean,attribute:"is-loading"}}}static get styles(){return[Vs,ds.light,M.light,be.light,m("report-location-step-shared-styles")]}static get scopedElements(){const t=[hs,P,ge,...e.configurationScopedElements()];return e.scopedElementsFromClasses(t)}constructor(){super(),this.apiKey="",this.staticLocationMessage="",this.staticLocation={}}_showDynamicMapModal(){this._dispatchCustomEvent("emergency-assistances-vehicle-reports-report-location-step-link-dynamic-map-modal-open")}get _staticMapUI(){return g`
      <div class="order-column-components">
        <bbva-map-static
          disabled-tabindex
          api-key="${this.apiKey}"
          message="${this.staticLocationMessage}"
          .location="${this.staticLocation}"
          .loading="${this.isLoading}"
        >
        </bbva-map-static>
        <bbva-link
          ambient="light"
          aria-label="${this.t("emergency-assistances-vehicle-report-change-location")}"
          @click="${this._showDynamicMapModal}"
        >
          ${this.t("emergency-assistances-vehicle-report-change-location")}
        </bbva-link>
      </div>
    `}get _buildFooterButton(){return g`
      <div class="footer-button-complete">
        <bbva-button-default
          ?disabled="${this.isLoading}"
          aria-label="${this.t("emergency-assistances-vehicle-report-accessibility-location")}"
          @click="${()=>this._dispatchCustomEvent("complete")}"
        >
          ${this.t("emergency-assistances-vehicle-report-continue-button")}
        </bbva-button-default>
      </div>
    `}get _buildAssistanceLocationTemplate(){return g`
      <div class="order-template">
        ${this._staticMapUI} ${this._buildFooterButton}
      </div>
    `}render(){return g`
      ${this._buildAssistanceLocationTemplate}
    `}};const Hs=new r;var js=t`:host {
  box-sizing: border-box;
  display: flex;
  min-height: 1rem;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
  --_notification-help-icon-color: var(--bbva-notification-help-dark-mode-icon-color, var(--bbva-notification-help-icon-color, var(--colorsPrimaryCoreDark, ${i(n.primaryCoreDark)})));
  --_notification-help-text-color: var(--bbva-notification-help-dark-mode-text-color, var(--bbva-notification-help-text-color, var(--colorsSecondary500, ${i(n.secondary500)})));
  --_notification-help-icon-color-alert: var(--bbva-notification-help-dark-mode-icon-color-alert, var(--bbva-notification-help-icon-color-alert, var(--colorsTertiaryType1Dark, ${i(n.tertiaryType1Dark)})));
  --_notification-help-text-color-alert: var(--bbva-notification-help-dark-mode-text-color-alert, var(--bbva-notification-help-text-color-alert, var(--colorsSecondary600, ${i(n.secondary600)})));
  --_notification-help-icon-color-success: var(--bbva-notification-help-dark-mode-icon-color-success, var(--bbva-notification-help-icon-color-success, var(--colorsTertiaryType6Dark, ${i(n.tertiaryType6Dark)})));
  --_notification-help-text-color-success: var(--bbva-notification-help-dark-mode-text-color-success, var(--bbva-notification-help-text-color-success, var(--colorsSecondary500, ${i(n.secondary500)})));
  --skeleton-quote-color: var(--bbva-notification-help-dark-mode-skeleton-quote-color, var(--bbva-notification-help-skeleton-color, var(--colorsSecondary200, ${i(n.secondary200)})));
  --skeleton-quote-bg: var(--bbva-notification-help-dark-mode-skeleton-bg, var(--bbva-notification-help-skeleton-bg, transparent));
}

:host([hidden]),
[hidden] {
  display: none !important;
}

:host([hide-top-padding]) {
  padding-top: 0;
}

:host([hide-bottom-padding]) {
  padding-bottom: 0;
}

:host([hide-left-padding]) {
  padding-left: 0;
}

:host([hide-right-padding]) {
  padding-right: 0;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.accessible-hide {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
}

[data-tag-name=bbva-icon] {
  color: var(--_notification-help-icon-color);
  flex-shrink: 0;
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color);
  font-size: var(--bbva-notification-help-text-font-size, var(--typographyType3XSmall, ${i(s.type3XSmall)}));
  line-height: var(--bbva-notification-help-text-line-height, var(--lineHeightType3XSmall, ${i(a.type3XSmall)}));
  margin: 0;
}

:host(.alert) [data-tag-name=bbva-icon] {
  color: var(--_notification-help-icon-color-alert);
}
:host(.alert) [data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color-alert);
}

:host(.success) [data-tag-name=bbva-icon] {
  color: var(--_notification-help-icon-color-success);
}
:host(.success) [data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color-success);
}

:host([loading]) {
  position: relative;
  top: 0;
  left: 0;
  display: inline-flex;
  width: 100%;
  pointer-events: none;
  background-repeat: no-repeat;
  will-change: transform;
  transform: opacity;
  animation: pulse 2s ease-in-out infinite;
  background-image: linear-gradient(var(--skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: 16px 16px, calc((80px * 2) + (16px/ 2)) 16px;
  background-position: 0 0, 20px 0;
}
:host([loading]) > :nth-child(n) {
  opacity: 0;
}

@keyframes pulse {
  0% {
    filter: opacity(100%);
  }
  50% {
    filter: opacity(60%);
  }
  100% {
    filter: opacity(100%);
  }
}
${Hs.mediaRules()}`;var Fs=t`[ambient^=light] {
  --bbva-notification-help-icon-color: initial;
  --bbva-notification-help-text-color: initial;
  --bbva-notification-help-icon-color-alert: initial;
  --bbva-notification-help-text-color-alert: initial;
  --bbva-notification-help-icon-color-success: initial;
  --bbva-notification-help-text-color-success: initial;
  --bbva-notification-help-skeleton-color: initial;
}
${(new r).mediaRules()}`;const zs=new r;const Gs={dark:t`
    ${t`[ambient^=dark] {
  --bbva-notification-help-icon-color: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
  --bbva-notification-help-text-color: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
  --bbva-notification-help-icon-color-alert: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
  --bbva-notification-help-text-color-alert: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
  --bbva-notification-help-icon-color-success: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
  --bbva-notification-help-text-color-success: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
  --bbva-notification-help-skeleton-color: var(--colorsPrimaryCoreLight, ${i(n.primaryCoreLight)});
}
${zs.mediaRules()}`}
  `,light:t`
    ${Fs}
  `};let Us=class extends(l(c(d(h)))){static get is(){return"bbva-notification-help"}static get scopedElements(){return{"bbva-icon":p,"bbva-text":u}}static get properties(){return{accessibilityLabelIcon:{type:String,attribute:"accessibility-label-icon"},icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},text:{type:String},loading:{type:Boolean,reflect:!0},hideTopPadding:{type:Boolean,attribute:"hide-top-padding"},hideBottomPadding:{type:Boolean,attribute:"hide-bottom-padding"},hideLeftPadding:{type:Boolean,attribute:"hide-left-padding"},hideRightPadding:{type:Boolean,attribute:"hide-right-padding"}}}constructor(){super(),this.accessibilityLabelIcon="",this.icon="",this.iconSize=16,this.text="",this.loading=!1,this.hideTopPadding=!1,this.hideBottomPadding=!1,this.hideRightPadding=!1,this.hideLeftPadding=!1}static get styles(){return[super.styles,js,Gs.dark,Gs.light,m("bbva-notification-help-shared-styles")]}render(){return g`
      <span class="accessible-hide" ?hidden="${!this.accessibilityLabelIcon}"
        >${this.accessibilityLabelIcon}</span
      >

      <bbva-icon aria-hidden="true" .icon="${this.icon}" .size="${this.iconSize}"> </bbva-icon>

      <bbva-text text=${this.text} unset></bbva-text>
    `}};b("colors.primarySubduedLight"),b("colors.cool20"),b("colors.tertiaryType1Light"),b("colors.primaryCoreLightened"),b("colors.tertiaryType6Light"),b("colors.cool20"),b("colors.cool50");const Ks=new r;var Xs=t`:host {
  --_form-radio-group-help-icon-color: var(--bbva-form-radio-group-dark-mode-help-icon-color, var(--bbva-form-radio-group-help-icon-color, var(--colorsPrimaryMedium, ${i(n.primaryMedium)})));
  --_form-radio-group-help-icon-active-color: var(--bbva-form-radio-group-dark-mode-help-icon-active-color, var(--bbva-form-radio-group-help-icon-active-color, var(--colorsPrimaryCore, ${i(n.primaryCore)})));
  --_form-radio-group-label-out-color: var(--bbva-form-radio-group-dark-mode-label-out-color, var(--bbva-form-radio-group-label-out-color, var(--colorsSecondary600, ${i(n.secondary600)})));
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

[data-tag-name=bbva-notification-help] {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}

.label-out {
  display: flex;
  align-items: center;
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}

.label-out-text {
  font-weight: var(--typographyTypeMedium, ${i(s.typeMedium)});
  color: var(--_form-radio-group-label-out-color);
}

[data-tag-name=bbva-link] {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
  --bbva-link-with-icon-icon-color: var(--_form-radio-group-help-icon-color);
  --bbva-link-active-with-icon-icon-color: var(--_form-radio-group-help-icon-active-color);
}

:host([two-option]) {
  font-size: 0;
  position: relative;
  word-spacing: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}
:host([two-option]) .label-out {
  font-size: initial;
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
  word-spacing: initial;
}
:host([two-option]) ::slotted(*) {
  display: inline-block;
  font-size: initial;
  word-spacing: initial;
}
${Ks.mediaRules()}`;const Ws=new r;var Js=t`[ambient^=dark] {
  --bbva-form-radio-group-help-icon-color: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
  --bbva-form-radio-group-help-icon-active-color: var(--colorsPrimarySubduedLight, ${i(n.primarySubduedLight)});
  --bbva-form-radio-group-label-out-color: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
}

[ambient=dark400] {
  --bbva-form-radio-group-help-icon-color: var(--colorsPrimarySubdued, ${i(n.primarySubdued)});
  --bbva-form-radio-group-help-icon-active-color: var(--colorsPrimaryMediumLight, ${i(n.primaryMediumLight)});
}
${Ws.mediaRules()}`;var Qs=t`[ambient^=light] {
  --bbva-form-radio-help-icon-color: initial;
  --bbva-form-radio-help-icon-active-color: initial;
  --bbva-form-radio-group-label-out-color: initial;
}
${(new r).mediaRules()}`;const Ys={dark:t`
    ${Js}
    ${It.dark}
    ${M.dark}
    ${Gs.dark}
    ${T.dark}
  `,light:t`
    ${Qs}
    ${It.light}
    ${M.light}
    ${Gs.light}
    ${T.light}
  `};let Zs=class extends(l(c(L(h)))){static get is(){return"bbva-form-radio-group"}static get scopedElements(){return{"bbva-form-radio-button":Et,"bbva-notification-help":Us,"bbva-text":u,"bbva-link":P}}static get properties(){return{name:{type:String,reflect:!0},items:{type:Array},selected:{type:Number,reflect:!0},readonly:{type:Boolean},required:{type:Boolean},disabled:{type:Boolean},invalid:{type:Boolean,reflect:!0},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},twoOption:{type:String,reflect:!0,attribute:"two-option"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},labelOut:{type:String,attribute:"label-out"},helpIcon:{type:Boolean,attribute:"help-icon"},optionalLabel:{type:String,attribute:"optional-label"},linkHref:{type:String,attribute:"link-href"},linkAccessibilityText:{type:String,attribute:"link-accessibility-text"}}}constructor(){super(),this.items=[],this.selected=-1,this.errorIcon=A(),this.errorIconSize=16,this.infoIcon=w(),this.infoIconSize=16,this.name=`form-radio-group-${((e=10)=>`${Math.random().toString(36).substr(2,e)}`)()}`,this.optionalLabel="bbva-form-radio-group-optional-label",this.linkAccessibilityText="bbva-form-radio-group-link-accessibility-text"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.getAttribute("role")||this.setAttribute("role","radiogroup"),this.addEventListener("slotschanges",(e=>this._setRadioName(e)))}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("slotschanges",this._setRadioName())}_setRadioName(e){(((e||{}).detail||{}).contentSlots||[]).forEach((e=>{const t=(e||{}).assignedNodes;"bbva-form-radio-button"===(t.getAttribute("data-tag-name")||(t||{}).nodeName).toLowerCase()&&(t.name=this.name)}))}get radioItems(){return Array.from(this.querySelectorAll('[data-tag-name="bbva-form-radio-button"]'))}firstUpdated(e){super.firstUpdated&&super.firstUpdated(e),this._itemsContainer=this.shadowRoot.querySelector(".form-radio-group-container"),this._itemsContainer&&this.appendChild(this._itemsContainer.content),this.addEventListener("change",(e=>this._updateItems(e)))}updated(e){if(super.updated&&super.updated(e),e.has("selected")&&this.radioItems.length)if(Number.isFinite(this.selected)&&this.selected>-1&&this.selected<this.radioItems.length)this.radioItems[this.selected].checked=!0;else{const e=this.radioItems.find((e=>e.checked));e&&(e.checked=!1)}e.has("disabled")&&this.radioItems.length&&(this.setAttribute("aria-disabled",this.disabled.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].disabled=this.disabled}))),e.has("invalid")&&this.radioItems.length&&(this.setAttribute("aria-invalid",this.invalid.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].invalid=this.invalid}))),e.has("readonly")&&this.radioItems.length&&(this.setAttribute("aria-readonly",this.readonly.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].readonly=this.readonly}))),e.has("required")&&this.radioItems.length&&(this.setAttribute("aria-required",this.required.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].required=!1})),this.radioItems[0].required=!0)}_updateItems(e){const t=this.radioItems.indexOf(e.target);this.selected=t,this.invalid=!1,this.dispatchEvent(new CustomEvent("form-radio-group-item-change",{detail:{value:e.target.value,selected:t},bubbles:!0,composed:!0}))}_helpClicked(e){e.stopPropagation(),this.dispatchEvent(new CustomEvent("bbva-form-radio-group-help-click",{detail:!0,bubbles:!0,composed:!0}))}get _helpIcon(){return this.helpIcon?g`
        <bbva-link
          aria-label="${this.t(this.linkAccessibilityText)}"
          icon-size="24"
          @click="${this._helpClicked}"
          href="${D(this.linkHref)}"
          icon="${I()}"
        >
        </bbva-link>
      `:""}get _labelOut(){if(this.labelOut){const e=this.t(this.labelOut);return g`
        <div class="label-out">
          <bbva-text
            id="labelOutText"
            unset
            class="label-out-text"
            text="${this.required?e:`${e} ${this.t(this.optionalLabel)}`}"
            size="S"
          >
          </bbva-text>
          ${this._helpIcon}
        </div>
      `}return""}static get styles(){return[Xs,m("bbva-form-radio-group-shared-styles"),Ys.dark,Ys.light]}render(){return g`
      ${this._labelOut}
      <slot></slot>
      <template class="form-radio-group-container">
        ${this.items.map((e=>g`
            <bbva-form-radio-button
              .name="${this.name}"
              .value="${e.value}"
              label="${e.label}"
              divider="${D(e.divider)}"
              ?disabled="${e.disabled}"
              ?checked="${e.checked}"
              ?required="${e.required}"
              ?label-medium="${e.labelMedium}"
              .errorIcon="${this.errorIcon}"
              .errorIconSize="${this.errorIconSize}"
              .errorMessage="${e.invalid?e.errorMessage:""}"
              .infoIcon="${this.infoIcon}"
              .infoIconSize="${this.infoIconSize}"
              .infoMessage="${e.infoMessage}"
              accessibility-icon-info-notification="${D(e.accessibilityIconInfo)}"
              accessibility-icon-alert-notification="${D(e.accessibilityIconAlert)}"
              variant="${D(e.variant)}"
            >
              ${e.text?O(e.text):e.label}
            </bbva-form-radio-button>
          `))}
      </template>
      ${this.invalid&&this.errorMessage?g`
            <bbva-notification-help
              class="alert"
              .icon="${this.errorIcon}"
              .iconSize="${this.errorIconSize}"
              .text="${this.errorMessage}"
              hide-top-padding
              hide-bottom-padding
              hide-left-padding
              hide-right-padding
            ></bbva-notification-help>
          `:""}
    `}};b("colors.primarySubdued"),b("colors.primaryMediumLight"),b("colors.primaryCoreLightened");var ea=t`:host {
  display: block;
  box-sizing: border-box;
  text-align: left;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.align-left {
  text-align: left;
}

.footer-position {
  margin-top: auto;
  width: 100%;
  display: flex;
  justify-content: center;
  flex-direction: column;
  align-items: center;
}

.order-template {
  height: 75vh;
  display: flex;
  flex-direction: column;
}
`;class ta extends(y(Xe(f(c(h))))){static get is(){return"other-assists-step"}static get properties(){return{activeButton:{type:Boolean,attribute:"active-button"},infoModal:{type:Object,attribute:"info-modal"},_saveAssistances:{type:Array,state:!0},radioAssistSelected:{type:Number,attribute:"radio-assist-selected"},resetData:{type:Boolean,attribute:"reset-data"},_resetMultiSelection:{type:Array}}}static get styles(){return[ea,be.light,T.light,Re.light,Ys.light]}static get scopedElements(){const e=[ge,u,Zs,Me,...ta.configurationScopedElements()];return ta.scopedElementsFromClasses(e)}constructor(){super(),this.activeButton=!1,this._saveAssistances=[],this.infoModal={},this.radioAssistSelected=-1,this.resetData=!1,this._resetMultiSelection=[]}updated(e){super.updated(e),e.has("radioAssistSelected")&&this.radioAssistSelected>=0&&(this.activeButton=!0),e.has("resetData")&&this.resetData&&(this.radioAssistSelected=-1,this._selectedAssists={},this._saveAssistances=[],this.activeButton=!1,this._resetMultiSelection.forEach(((e,t)=>{this._resetMultiSelection[t].checked=!1})))}get _getDetailGroup(){var e,t;return null===(e=this.infoModal)||void 0===e||null===(t=e.assistances)||void 0===t?void 0:t.map((e=>({text:this.t(e.title,{labelAssistance:e.value}),value:e.value,name:e.id,infoMessage:this.t(e.titleInfoHelp,{labelInfo:e.infoHelp})})))}_selectCurrent(e,t,i){this._saveAssistances=[...this._saveAssistances],e&&t?this._saveAssistances.push({description:e,name:i}):e&&!t&&this._saveAssistances.splice(this._saveAssistances.findIndex((t=>t.description===e)),1),this.activeButton=Boolean(this._saveAssistances.length),this._dispatchCustomEvent("emergency-assistances-vehicle-report-assistance-select",{assistsSelected:this._saveAssistances})}get _buildQuestionSection(){var e,t;return{MULTI_SELECTION:g`
        ${null===(e=this.infoModal)||void 0===e||null===(t=e.assistances)||void 0===t?void 0:t.map((e=>g`
            <bbva-form-checkbox
              required
              ?checked="${null==e?void 0:e.check}"
              name=${this.t(e.id)}
              label="${this.t(e.title,{labelAssistance:e.value})}"
              info-message="${this.t(e.titleInfoHelp,{labelInfo:e.infoHelp})}"
              @change="${({target:e})=>{const{label:t,checked:i,name:s}=e;this._resetMultiSelection=[...this._resetMultiSelection,e],this._selectCurrent(t,i,s)}}"
            ></bbva-form-checkbox>
          `))}
      `,UNIQUE_SELECTION:g`
        <div>
          <bbva-form-radio-group
            .items="${this._getDetailGroup||[]}"
            selected="${this.radioAssistSelected}"
            required
            @form-radio-group-item-change="${({detail:e})=>{this._selectedAssists=this._getDetailGroup[e.selected],this.radioAssistSelected=e.selected,this.activeButton=Boolean(Object.keys(this._selectedAssists).length),this._dispatchCustomEvent("emergency-assistances-vehicle-report-select-option-assist",this.radioAssistSelected)}}"
          >
          </bbva-form-radio-group>
        </div>
      `}}get _buildFooterButton(){return g`
      <div class="footer-position">
        <bbva-button-default
          ?disabled="${!this.activeButton}"
          aria-label="${this.t("emergency-assistances-vehicle-report-accessibility-accept-other-assist")}"
          @click="${()=>{var e;"UNIQUE_SELECTION"===(null===(e=this.infoModal)||void 0===e?void 0:e.selectionType)&&this._dispatchCustomEvent("emergency-assistances-vehicle-report-assistance-select",{assistsSelected:[{description:this._selectedAssists.text,name:this._selectedAssists.name,radioSelected:this.radioAssistSelected}]}),this._dispatchCustomEvent("complete")}}"
        >
          ${this.t("emergency-assistances-vehicle-report-continue-button")}
        </bbva-button-default>
      </div>
    `}get _buildOtherAssistTemplate(){var e;return g`
      <div class="order-template" ambient="light">
        ${this._buildQuestionSection[null===(e=this.infoModal)||void 0===e?void 0:e.selectionType]} ${this._buildFooterButton}
      </div>
    `}render(){return g`
      ${this._buildOtherAssistTemplate}
    `}}var ia=t`:host {
  display: block;
  box-sizing: border-box;
  --bbva-expandable-accordion-padding: grid8Spacer(16px, em) 0;
}

:host([hidden]), [hidden] {
  display: none !important;
}

.text-and-form-content {
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem) 0;
  --bbva-text-color: var(--colorsSecondary500, ${i(n.secondary500)});
}

.contact-person {
  --bbva-text-color: var(--colorsSecondary500, ${i(n.secondary500)});
}

.masked-number {
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-form-text] {
  text-align: left;
}

[data-tag-name=bbva-form-number] {
  text-align: left;
}

.step-description {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}

.footer-button-complete {
  margin-top: auto;
  width: 100%;
  display: flex;
  justify-content: center;
  flex-direction: column;
  align-items: center;
}

.order-template {
  height: 80vh;
  display: flex;
  flex-direction: column;
}
`;let sa=class e extends(y(Xe(f(c(h))))){static get is(){return"user-contact-step"}static get properties(){return{contactDefault:{type:Object,attribute:"contact-default"},alternativeContactInfo:{type:Object,attribute:"alternative-contact-info"},firstOptionOpened:{type:Boolean,attribute:"first-option-opened"},secondOptionOpened:{type:Boolean,attribute:"second-option-opened"},disableButton:{type:Boolean,attribute:"disable-button"},phoneDetails:{type:Object,attribute:"phone-details"},alternateContactNameInvalid:{type:Boolean,attribute:"alternate-contact-name-invalid"},maskChars:{type:String,attribute:"mask-chars"}}}static get styles(){return[ia,be.light,T.light,Le.light,Ft.light,Gt.light]}static get scopedElements(){const t=[ge,u,Pe,zt,Ut,...e.configurationScopedElements()];return e.scopedElementsFromClasses(t)}constructor(){super(),this.contactDefault={},this.alternativeContactInfo={},this.firstOptionOpened=!0,this.secondOptionOpened=!1,this.disableButton=!1,this.phoneDetails={},this.alternateContactNameInvalid=!1,this.alternateContactPhoneInvalid=!1,this.maskChars="••••"}_setAccordionState(e,t){"default-user-contact"===t?this.firstOptionOpened=e:"alternative-user-contact"===t&&(this.secondOptionOpened=e)}_focusOnExpandableAccordion(e="default-user-contact"){this.shadowRoot.querySelectorAll("[data-tag-name=bbva-expandable-accordion]").forEach((t=>{t.id!==e&&(t.opened=!1)}))}_handleUserContactSummary(e){e.stopPropagation();const{target:t,detail:i}=e;this._setAccordionState(i,t.id),i&&(this._focusOnExpandableAccordion(t.id),"default-user-contact"!==t.id||this._isUsingAlternativeContactInfo()||(this.disableButton=!1))}_maskedPhone(e=""){var t;return Ae(e,this.maskChars,!0,null===(t=this.phoneDetails)||void 0===t?void 0:t.visibleChars)}_finishContactStep(){let e={};var t,i;this._isUsingAlternativeContactInfo()?e={...this.alternativeContactInfo,id:"OTHER",encryptedPhone:this._maskedPhone(null===(t=this.alternativeContactInfo)||void 0===t?void 0:t.phoneNumber)}:e={...this.contactDefault,id:"HOLDER",encryptedPhone:this._maskedPhone(null===(i=this.contactDefault)||void 0===i?void 0:i.phoneNumber)};this._dispatchCustomEvent("complete"),this._dispatchCustomEvent("emergency-assistances-vehicle-reports-report-location-step-link-dynamic-map-modal-ope",e)}_insertBbvaText(e,t,i,s){return g`
      <bbva-text
        ?inherit="${s}"
        class="${i}"
        text="${this.t(`${e}`)}"
        size="${t}"
      >
      </bbva-text>
    `}_isUsingAlternativeContactInfo(){const{name:e,phoneNumber:t}=this.alternativeContactInfo;return!(!e&&!t)||(this.alternateContactNameInvalid=!1,this.alternateContactPhoneInvalid=!1,!1)}_isAlternativeContactInfoValid(){var e;const{name:t="",phoneNumber:i=""}=this.alternativeContactInfo;return this.alternateContactNameInvalid=0===t.length,this.alternateContactPhoneInvalid=i.length<(null===(e=this.phoneDetails)||void 0===e?void 0:e.minLength),!this.alternateContactNameInvalid&&!this.alternateContactPhoneInvalid}_inputUpdated(e,t){this.alternativeContactInfo[e]=t,this.disableButton=this._isUsingAlternativeContactInfo()&&!this._isAlternativeContactInfoValid()}get _buildAlternativeContact(){var e,t,i;return g`
      <bbva-expandable-accordion
        ambient="light"
        id="alternative-user-contact"
        clip-box
        row-title="${this.t("emergency-assistances-vehicle-report-user-contact-other-person")}"
        icon="${De()}"
        align-title
        ?opened="${this.secondOptionOpened}"
        @expandable-accordion-open-change="${this._handleUserContactSummary}"
      >
        <div>
          <bbva-form-text
            class="text-and-form-content"
            id="alternative-contact-name"
            label="${this.t("emergency-assistances-vehicle-report-user-name-input")}"
            optional-label=" "
            .value="${(null===(e=this.alternativeContactInfo)||void 0===e?void 0:e.name)||""}"
            @input="${e=>this._inputUpdated("name",e.target.value)}"
            ?invalid="${this.alternateContactNameInvalid}"
            error-message="${this.t("emergency-assistances-vehicle-report-error-input-name")}"
            .maxlength="${40}"
            allowed-pattern="^[a-zA-Z ]"
          >
          </bbva-form-text>
          <bbva-form-number
            class="text-and-form-content"
            id="alternative-phone-number"
            label="${this.t("emergency-assistances-vehicle-report-user-contact-phone-input")}"
            allowed-pattern="[0-9]"
            optional-label=" "
            .maxlength="${null===(t=this.phoneDetails)||void 0===t?void 0:t.maxLength}"
            info-message="${this.t("emergency-assistances-vehicle-report-phone-input-message")}"
            .value="${null===(i=this.alternativeContactInfo)||void 0===i?void 0:i.phoneNumber}"
            ?invalid="${this.alternateContactPhoneInvalid}"
            @input="${e=>this._inputUpdated("phoneNumber",e.target.value)}"
            error-message="${this.t("emergency-assistances-vehicle-report-error-input-phone-number")}"
          >
          </bbva-form-number>
        </div>
      </bbva-expandable-accordion>
    `}get _buildUserContactDefault(){var e,t;return g`
      <bbva-expandable-accordion
        ambient="light"
        id="default-user-contact"
        clip-box
        row-title="${this.t("emergency-assistances-vehicle-report-third-step-own-info")}"
        icon="${Oe()}"
        align-title
        divider="full"
        ?opened="${this.firstOptionOpened}"
        @expandable-accordion-open-change="${this._handleUserContactSummary}"
      >
        <div>
          ${this._insertBbvaText("emergency-assistances-vehicle-report-user-contact-first-section","M","contact-person",!0)}
          ${this._insertBbvaText(null===(e=this.contactDefault)||void 0===e?void 0:e.name,"M","",!0)}
          ${this._insertBbvaText("emergency-assistances-vehicle-report-user-contact-second-section","M","text-and-form-content",!0)}
          ${this._insertBbvaText(this._maskedPhone(null===(t=this.contactDefault)||void 0===t?void 0:t.phoneNumber),"M","masked-number",!0)}
        </div>
      </bbva-expandable-accordion>
    `}get _buildUserDetails(){return g`
      ${this._insertBbvaText("emergency-assistances-vehicle-report-user-contact-description","S","step-description",!0)}
      ${this._buildUserContactDefault} ${this._buildAlternativeContact}
    `}get _buildFooterButton(){return g`
      <div class="footer-button-complete">
        <bbva-button-default
          ambient="light"
          id="user-contact-button"
          aria-label="${this.t("emergency-assistances-vehicle-report-accessibility-contact-details")}"
          ?disabled="${this.disableButton}"
          @click="${this._finishContactStep}"
        >
          ${this.t("emergency-assistances-vehicle-report-continue-button")}
        </bbva-button-default>
      </div>
    `}get _buildUserContactTemplate(){return g`
      <div ambient="light" class="order-template">
        ${this._buildUserDetails} ${this._buildFooterButton}
      </div>
    `}render(){return g`
      ${this._buildUserContactTemplate}
    `}};var aa=t`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.slot-change-location {
  height: 100%;
  text-align: initial;
}
.slot-change-location > [data-tag-name=bbva-map-dynamic] {
  height: 100%;
}
`;let ra=class e extends(y(c(f(Xe(h))))){static get is(){return"change-report-location-modal"}static get properties(){return{visible:{type:Boolean},apiKey:{type:String,attribute:"api-key"},geoLocation:{type:Object,attribute:"geo-location"},hideIconText:{type:Boolean,attribute:"hide-icon-text"}}}static get styles(){return[aa,T.light,Ht.light]}static get scopedElements(){const t=[Qe,u,Bt,...e.configurationScopedElements()];return e.scopedElementsFromClasses(t)}constructor(){super(),this.visible=!1,this.apiKey="",this.geoLocation={},this.hideIconText=!1}_iconTextHeader(e){return this.hideIconText?"":this.t(e)}render(){return g`
      <bbva-help-modal
        id="change-report-location-modal"
        fixed-footer
        full-height
        body-text=""
        hide-content-padding-top
        ?visible="${this.visible}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        header-type="modal-initial"
        header-text="${this.t("emergency-assistances-vehicle-report-change-location")}"
        button-text="${this.t("emergency-assistances-vehicle-report-accept-button")}"
        aria-label="${this.t("emergency-vehicle-assistance-accessibility-modal",{modalTitle:"change-report-location"})}"
        header-close-icon-label="${this._iconTextHeader("emergency-vehicle-assistance-close-change-location-modal")}"
        header-close-icon-aria-label="${this.t("emergency-vehicle-assistance-close-change-location-modal-accessibility-text")}"
      >
        <div slot="slot-content" class="slot-change-location" ambient="light">
          <bbva-map-dynamic
            hidden-large-button
            is-draggable-pin
            hide-map-info-footer
            show-predictive
            variant="large"
            optional-input-label=""
            .geoLocation="${this.geoLocation}"
            .label="${this.t("emergency-assistances-vehicle-report-change-location-search-input")}"
            api-key="${this.apiKey}"
            predictive-info-message="${this.t("emergency-assistances-vehicle-report-predictive-info-message")}"
            @map-dynamic-map-ready="${()=>{this._dispatchCustomEvent("emergency-vehicle-assistances-vehicle-report-change-report-location-modal-map-ready")}}"
          >
          </bbva-map-dynamic>
        </div>
      </bbva-help-modal>
    `}};class oa extends(y(Xe(f(c(h))))){static get is(){return"assistance-generate-report-multistep-modal"}static get properties(){return{headerTitle:{type:String,attribute:"header-title"},visible:{type:Boolean},progressMultistepValue:{type:Number,attribute:"progress-multistep-bar"},apiKey:{type:String,attribute:"api-key"},geoLocation:{type:Object,attribute:"geo-location"},staticAddress:{type:String,attribute:"static-address"},addressComponents:{type:Object,attribute:"address-components"},hideProgressMulti:{type:Boolean,attribute:"hide-progress-multi"},contactDetails:{type:Object,attribute:"contact-details"},showNoticeOfPrivacy:{type:Boolean,attribute:"show-notice-of-privacy"},mapDynamicVisible:{type:Boolean,attribute:"map-dynamic-visible"},multiStepConfiguration:{type:Object,attribute:"multistep-configuration"},privacyDescription:{type:String,attribute:"privacy-description"},privacyLinkText:{type:String,attribute:"privacy-link-text"},hasLocationPermissions:{type:Boolean,attribute:"has-location-permissions"},pdfDocument:{type:String,attribute:"pdf-document"},phoneDetails:{type:Object,attribute:"phone-details"},personDataIsUsed:{type:Boolean,attribute:"person-data-is-used"},multistepState:{type:Object,attribute:"multistep-state"},viewInfoModal:{type:Boolean,attribute:"view-info-modal"},dataModal:{type:Object,attribute:"data-modal"},infoModal:{type:Object,attribute:"info-modal"},_contactSelected:{type:Object,state:!0},_newGeoLocation:{type:Object,state:!0},_newStaticAddress:{type:String,state:!0},_mapReady:{type:Boolean,state:!0},_initialGeolocation:{type:Object,state:!0},_stepsToReset:{type:Array,state:!0},_assistsSelected:{type:Array,state:!0},_staticGeolocation:{type:Object,state:!0},_resetData:{type:Boolean},_closeModalElements:{type:Array},_saveSelection:{type:Number},hideIconText:{type:Boolean,attribute:"hide-icon-text"}}}static get styles(){return[qs,be.light,T.light,T.dark,M.light,Ne.light,m("assistance-generate-report-multistep-modal-shared-styles")]}static get scopedElements(){const e=[Qe,fe,ge,u,P,_e,ye,Bs,ta,sa,ra,...oa.configurationScopedElements()];return oa.scopedElementsFromClasses(e)}constructor(){super(),this.apiKey="",this.visible=!1,this.progressMultistepValue=0,this.geoLocation={},this.hideProgressMulti=!1,this.showNoticeOfPrivacy=!1,this.multistepState={},this.staticAddress="",this.headerTitle="",this.addressComponents={},this.mapDynamicVisible=!1,this.multiStepConfiguration={},this.privacyLinkText="",this.privacyDescription="",this.contactDetails={},this.hasLocationPermissions=!1,this.phoneDetails={},this.pdfDocument="",this.personDataIsUsed=!1,this.viewInfoModal=!1,this.dataModal={},this.infoModal={},this._staticGeolocation={},this._contactSelected={},this._newStaticAddress="",this._mapReady=!1,this._optionSelected=-1,this._initialGeolocation={},this._stepsToReset=[],this._assistsSelected=[],this._radioAssistSelected=-1,this._resetData=!1,this._closeModalElements=[],this._saveSelection=-1,this.hideIconText=!1}updated(e){var t;super.updated(e),e.has("geoLocation")&&this._mapReady&&this._setNewLocation(),e.has("visible")&&this.visible&&(this._manageDynamicMapRequest(),this._resetData=!1),e.has("personDataIsUsed")&&(this.progressMultistepValue=100/this._steps.length),e.has("_mapReady")&&null!==(t=this.restoreMultistepState)&&void 0!==t&&t.multistep&&this._setMultistepLastState()}shouldUpdate(e){if(super.shouldUpdate(e),e.has("geoLocation")){if(this.viewInfoModal)return!1;const t=e.get("geoLocation");if(!t)return!0;const{lat:i,lng:s}=t;if(i===this.geoLocation.lat&&s===this.geoLocation.lng)return!1}return!0}_setMultistepLastState(){var e;this.multistepState={...null===(e=this.restoreMultistepState)||void 0===e?void 0:e.multistep},this._setStepsState(),this._restoreStepsInfo()}_iconTextHeader(e){return this.hideIconText?"":this.t(e)}get _modalHeaderButtons(){var e,t;return[{id:"btn-help",name:"Help",icon:"es"===(null===(e=this.multiStepConfiguration)||void 0===e?void 0:e.language)&&null!==(t=this.multiStepConfiguration)&&void 0!==t&&t.smartAssistant?k():I(),accessibilityText:this.t("emergency-assistances-vehicle-report-secondary-header-main-accessibility-text"),label:this._iconTextHeader("emergency-assistances-vehicle-report-secondary-header-main")},{id:"btn-close",name:"Close",icon:j(),accessibilityText:this.t("emergency-assistances-vehicle-report-close-header-main-accessibility-text"),label:this._iconTextHeader("emergency-assistances-vehicle-report-close-header-main")}]}static _typeSelection(){return{MULTI_SELECTION:"500",UNIQUE_SELECTION:""}}_resetAssistancesReportMultistep(){var e;const t=[];null===(e=this._steps)||void 0===e||e.forEach(((e,i)=>{this._steps[i].completed=!1,this._steps[i].disabled=!0,t.push(i)})),this._steps[0].disabled=!1,this.multistepState={...this.multistepState,otherAssistsAnswer:[],otherAssistsStep:!1,reportLocationStep:!1,emergencyServicesStep:!1,userContactDetail:!1},Object.keys(this._initialGeolocation).length&&this._mapReady&&this._dispatchCustomEvent("emergency-assistances-vehicle-report-multistep-modal-geolocation-change",this._initialGeolocation),this._assistsSelected=[],this._saveSelection=-1,this.progressMultistepValue=100/this._steps.length,this.showNoticeOfPrivacy=!1,this.hideProgressMulti=!1,this.resetEmergencyServicesStep=!this.resetEmergencyServicesStep,this.resetUserContactStep=!this.resetUserContactStep,this._stepsToReset=t,this._resetData=!0}_restoreStepsInfo(){const{showPrivacyPanel:e,hideProgress:t,geolocation:i,barProgress:s,otherAssistsAnswer:a=[],contactSelected:r}=this.multistepState;this._assistsSelected=[...a],this._radioAssistSelected=a[0].radioSelected,this.showNoticeOfPrivacy=e,this.hideProgressMulti=t,this._staticGeolocation=null==i?void 0:i.coords,this.staticAddress=null==i?void 0:i.message,this.progressMultistepValue=s,this._contactSelected=r}get _steps(){return this.shadowRoot.querySelectorAll('[data-tag-name="bbva-expandable-step"]')}_setStepsState(){const e={"step-1":"otherAssistsStep","step-2":"reportLocationStep","step-3":"userContactDetail"};for(let t=0;t<this._steps.length;t+=1)this._steps[t].completed=this.multistepState[e[this._steps[t].id]]}_manageStateOfModals(e){const{target:t,detail:i}=e,s=null==i?void 0:i.visible,a=t.getAttribute("data-tag-name"),r={"change-report-location-modal":e=>{this.mapDynamicVisible=e},"bbva-help-modal":()=>{this.visible=s}};a in r&&r[`${a}`](i)}_handleRaiseReport(){this._dispatchCustomEvent("emergency-assistances-vehicle-report-multistep-modal-new-report-create",{geolocation:this.geoLocation,fullAddress:this.staticAddress,composedAddress:this.addressComponents,assistsSelected:this._assistsSelected,...this.personDataIsUsed&&{contact:this._contactSelected}}),this.visible=!1}_setOtherAssists({detail:e}){this._assistsSelected=e.assistsSelected,this._closeModalElements=this._assistsSelected.length?[]:["header"],this.multistepState={...this.multistepState,barProgress:this.progressMultistepValue,otherAssistsAnswer:this._assistsSelected},this._dispatchCustomEvent("emergency-assistances-vehicle-report-multistep-modal-multistep-update-state",{key:"multistep",data:this.multistepState})}_setUserContactInfo({detail:e}){"alternative-info"===e.id&&(this.contactDetails.alternative={...e}),this._contactSelected=e}async _setNewLocation(){await this.updateComplete,this._staticGeolocation={latitude:this.geoLocation.lat,longitude:this.geoLocation.lng},this._newGeoLocation={...this.geoLocation},this._dispatchCustomEvent("emergency-assistances-vehicle-report-multistep-modal-geolocation-change",this.geoLocation)}_getNewAddress({detail:{address:e}}){this.mapDynamicVisible?this._newStaticAddress=e.formatted_address:this.staticAddress=e.formatted_address;const t={route:{label:"route",uses:"long_name"},street_number:{label:"strNumber",uses:"long_name"},locality:{label:"city",uses:"long_name"},postal_code:{label:"postalCode",uses:"long_name"},country:{label:"country",uses:"short_name"}};let i={};for(const s of e.address_components||[]){const e=s.types.find((e=>t[e]));e&&(i={...i,[t[e].label]:s[t[e].uses]})}this.addressComponents={...i}}_setGeoLocation({detail:{geoLocation:e}}){this._newGeoLocation={...e}}_changeToNewLocation(){this.geoLocation={...this._newGeoLocation},this.staticAddress=this._newStaticAddress||this.staticAddress}_avoidChangeLocation(){this._newStaticAddress=this.staticAddress,this._newGeoLocation={...this.geoLocation}}_manageDynamicMapRequest(){this.hasLocationPermissions?this.native?this._dispatchCustomEvent("emergency-assistances-vehicle-report-multistep-modal-native-geolocation-request"):this._getWebCurrentPosition():!this.hasLocationPermissions&&this.visible&&this.mapDynamicVisible&&this._dispatchCustomEvent("emergency-assistances-vehicle-report-multistep-modal-location-permissions-open",!0)}_getWebCurrentPosition(){navigator.geolocation.getCurrentPosition((e=>{this.mapDynamicVisible?this._newGeoLocation={lat:e.coords.latitude,lng:e.coords.longitude}:this.geoLocation={lat:e.coords.latitude,lng:e.coords.longitude}}),(e=>{this._dispatchCustomEvent("emergency-assistances-vehicle-report-multistep-modal-geolocation-error",{code:e.code,message:e.message})}),{enableHighAccuracy:!0,timeout:5e3,maximumAge:0})}async _checkStepsState(){await this.updateComplete;let e=0;return this._steps.forEach((t=>{t.completed&&(e+=1)})),e===this._steps.length}async _manageStepsState({target:e}){const t="otherAssistsStep"===e.id&&this._steps[1].completed?2:{otherAssistsStep:1,reportLocationStep:2,userContactDetail:3}[e.id];this.progressMultistepValue=100/this._steps.length*(t+1),this.showNoticeOfPrivacy=await this._checkStepsState(),this.hideProgressMulti=await this._checkStepsState(),this.multistepState={...this.multistepState,[e.id]:!0,showPrivacyPanel:this.showNoticeOfPrivacy,hideProgress:this.hideProgressMulti,geolocation:{coords:this._staticGeolocation,message:this.staticAddress},contactSelected:this._contactSelected,barProgress:this.progressMultistepValue},this._dispatchCustomEvent("emergency-assistances-vehicle-report-multistep-modal-multistep-update-state",{key:"multistep",data:this.multistepState})}async _manageEditSteps(e){let t={};const i={"step-1":"otherAssistsStep","step-2":"reportLocationStep","step-3":"userContactDetail"};this.progressMultistepValue=100/this._steps.length*e,this.showNoticeOfPrivacy=await this._checkStepsState(),this.hideProgressMulti=await this._checkStepsState();for(let e=0;e<this._steps.length;e+=1){const s=this._steps[e].id;t={...t,[i[s]]:this._steps[e].completed}}this.multistepState={...this.multistepState,...t,showPrivacyPanel:this.showNoticeOfPrivacy,hideProgress:this.hideProgressMulti,barProgress:this.progressMultistepValue},this._dispatchCustomEvent("emergency-assistances-vehicle-report-multistep-modal-multistep-update-state",{key:"multistep",data:this.multistepState})}get _multistepProgress(){return g`
      <bbva-progress-multistep-bar
        accessibility-text="${this.t("emergency-assistances-vehicle-report-accessibility-progress-bar")}"
        ambient="light"
        ?hidden=${this.hideProgressMulti}
        no-margin
        value="${this.progressMultistepValue}"
      >
      </bbva-progress-multistep-bar>
    `}_handleLeaveReport(e){e.stopPropagation();const t={true:"emergency-assistances-vehicle-report-multistep-modal-close",false:"emergency-assistances-vehicle-report-multistep-modal-leave-prevent"}[{MULTI_SELECTION:!this._assistsSelected.length,UNIQUE_SELECTION:!(this._saveSelection>=0)}[this.infoModal.selectionType]];this._dispatchCustomEvent(t)}_smartAssistant(){const{smartAssistant:e}=this.multiStepConfiguration;e?this._dispatchCustomEvent("emergency-assistances-vehicle-report-multistep-modal-smart-assistant-header-open"):this._dispatchCustomEvent("emergency-assistances-vehicle-report-multistep-modal-faqs-header-open")}get _buildLocationReportStep(){return g`
      <bbva-expandable-step
        class="animation remove-overflow"
        id="step-2"
        step="1"
        total-steps="${this._steps.length}"
        disabled-target=".action"
        data-selector="step"
        current-step-label="${this.t("emergency-assistances-vehicle-report-location-step-header-index",{step:2,total:this._steps.length})}"
        header="${this.t("emergency-assistances-vehicle-report-location-step-header-main")}"
        edit-label="${this.t("emergency-assistances-vehicle-report-edit-step-link")}"
        hide-padding-left
        hide-padding-right
        hide-padding-top
        @complete="${this._manageStepsState}"
        @expandable-step-edit-step="${()=>{this._manageEditSteps(2)}}"
        @emergency-assistances-vehicle-reports-report-location-step-link-dynamic-map-modal-open="${()=>{this.mapDynamicVisible=!0}}"
      >
        <div class="content">
          <report-location-step
            ambient="light"
            .staticLocation="${this._staticGeolocation}"
            id="reportLocationStep"
            api-key="${this.apiKey}"
            ?is-loading="${!this.staticAddress}"
            static-location-message="${this.staticAddress}"
          >
          </report-location-step>
        </div>
        <div
          class="summary container"
          tabindex="-1"
          aria-hidden="true"
          slot="summary"
          ambient="dark"
        >
          <bbva-text inherit text="${this.staticAddress}" size="S"></bbva-text>
        </div>
      </bbva-expandable-step>
    `}get _buildOtherAssistStep(){return g`
      <bbva-expandable-step
        class="animation remove-overflow"
        id="step-1"
        step="0"
        total-steps="${this._steps.length}"
        disabled-target=".action"
        data-selector="step"
        current-step-label="${this.t("emergency-assistances-vehicle-report-location-step-header-index",{step:1,total:this._steps.length})}"
        header="${this.t("emergency-assistances-vehicle-report-other-assists-title-main")}"
        edit-label="${this.t("emergency-assistances-vehicle-report-edit-step-link")}"
        @complete="${this._manageStepsState}"
        @expandable-step-edit-step="${()=>{this._manageEditSteps(1)}}"
        hide-padding-left
        hide-padding-right
        hide-padding-top
        @emergency-assistances-vehicle-report-assistance-select="${this._setOtherAssists}"
      >
        <div class="content">
          <bbva-text
            tag="h3"
            unset
            class="header-section"
            text="${this.t("emergency-assistances-vehicle-report-other-assists-subtitle-main")}"
            font-weight="${oa._typeSelection()[this.infoModal.selectionType]}"
            size="M"
          ></bbva-text>
          <other-assists-step
            ambient="light"
            id="otherAssistsStep"
            class="container"
            radio-assist-selected="${this._radioAssistSelected}"
            ?reset-data="${this._resetData}"
            .infoModal="${this.infoModal}"
            @emergency-assistances-vehicle-report-select-option-assist="${({detail:e})=>{this._saveSelection=e}}"
          >
          </other-assists-step>
        </div>
        <div
          class="summary container"
          tabindex="-1"
          aria-hidden="true"
          slot="summary"
          ambient="dark"
        >
          ${this._assistsSelected.map((e=>g`
              <bbva-text
                text="${null==e?void 0:e.description}"
                text-color="ffffff"
                size="S"
                inherit
              ></bbva-text>
            `))}
        </div>
      </bbva-expandable-step>
    `}get _buildUserContactStep(){return g`
      <bbva-expandable-step
        class="animation remove-overflow"
        id="step-3"
        step="2"
        total-steps="${this._steps.length}"
        disabled-target=".action"
        data-selector="step"
        hide-padding-top
        current-step-label="${this.t("emergency-assistances-vehicle-report-location-step-header-index",{step:this._steps.length,total:this._steps.length})}"
        header="${this.t("emergency-assistances-vehicle-report-user-contact-header")}"
        edit-label="${this.t("emergency-assistances-vehicle-report-edit-step-link")}"
        @complete="${this._manageStepsState}"
        @expandable-step-edit-step="${()=>{this._manageEditSteps(3)}}"
        @emergency-assistances-vehicle-reports-report-location-step-link-dynamic-map-modal-ope="${this._setUserContactInfo}"
      >
        <div class="content">
          <user-contact-step
            .phoneDetails="${this.phoneDetails}"
            .contactDefault="${this.contactDetails}"
            first-option-opened
            id="userContactDetail"
          >
          </user-contact-step>
        </div>
        <div class="summary" tabindex="-1" aria-hidden="true" slot="summary" ambient="dark">
          ${this._buildContactSummary}
        </div>
      </bbva-expandable-step>
    `}get _buildContactSummary(){var e,t;const i=[{id:"nameInput",literal:this.t("emergency-assistances-vehicle-report-user-name-input"),value:null===(e=this._contactSelected)||void 0===e?void 0:e.name},{id:"phoneInput",literal:this.t("emergency-assistances-vehicle-report-user-contact-phone-input"),value:null===(t=this._contactSelected)||void 0===t?void 0:t.encryptedPhone}];return g`
      ${Je(i,(e=>e.id),(e=>g`
          <div class="order-online-components">
            <bbva-text text="${e.literal}" size="S" inherit></bbva-text>
            <bbva-text text="${e.value}" size="S" inherit></bbva-text>
          </div>
        `))}
    `}get _buildMultistepReport(){return g`
      <bbva-expandable-multistep
        hide-guillotine-animation
        hide-disabled-steps
        step-selector="[data-selector=step]"
        class="scrollable"
        scrolling-delay="600"
        scroll-animation-completed="600"
        .stepsToReset="${this._stepsToReset}"
        .finishAnimationStep=${500}
        ambient="light"
      >
        ${this._buildOtherAssistStep} ${this._buildLocationReportStep} ${this._buildUserContactStep}
        ${this.showNoticeOfPrivacy?this._buildPrivacyInfo:E}
      </bbva-expandable-multistep>
    `}get _buildMultistepReportNoContactStep(){return g`
      <bbva-expandable-multistep
        hide-guillotine-animation
        hide-disabled-steps
        step-selector="[data-selector=step]"
        class="scrollable"
        scrolling-delay="600"
        scroll-animation-completed="600"
        .stepsToReset="${this._stepsToReset}"
        .finishAnimationStep=${500}
        ambient="light"
      >
        ${this._buildOtherAssistStep} ${this._buildLocationReportStep}
        ${this.showNoticeOfPrivacy?this._buildPrivacyInfo:E}
      </bbva-expandable-multistep>
    `}get _buildChangeReportLocationModal(){return g`
      <change-report-location-modal
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        api-key="${this.apiKey}"
        ?visible="${this.mapDynamicVisible}"
        ?hide-icon-text="${this.hideIconText}"
        .geoLocation="${this._newGeoLocation}"
        @emergency-vehicle-assistances-vehicle-report-change-report-location-modal-map-ready="${()=>{this._mapReady=!0,this._setNewLocation(),Object.keys(this._initialGeolocation).length||(this._initialGeolocation={...this.geoLocation}),this._setNewLocation()}}"
        @map-dynamic-geolocation-request="${this._manageDynamicMapRequest}"
        @map-dynamic-address-changed="${this._getNewAddress}"
        @map-dynamic-geolocation-changed="${this._setGeoLocation}"
        @help-modal-footer-button-click="${this._changeToNewLocation}"
        @help-modal-header-click="${this._avoidChangeLocation}"
        @visible-changed="${this._manageStateOfModals}"
      >
      </change-report-location-modal>
    `}_showNoticeOfPrivacy(){var e;let t,i;null!==(e=this.multiStepConfiguration)&&void 0!==e&&e.privacyTermsPdf?(t="emergency-assistances-vehicle-report-multistep-modal-notice-of-privacy-pdf-open",i=this.pdfDocument):(t="emergency-assistances-vehicle-report-multistep-modal-notice-of-privacy-modal-open",i=!0),this._dispatchCustomEvent(t,i)}get _buildPrivacyInfo(){return g`
      <div
        ambient="light"
        class="${qe({"summary-description":this.showNoticeOfPrivacy,"center-content":!0})}"
      >
        <bbva-button-default
          @click="${this._handleRaiseReport}"
          aria-label="${this.t("emergency-assistances-vehicle-report-accesibility-contract-insurance")}"
          ?hidden="${!this.showNoticeOfPrivacy}"
          variant="positive"
          active
        >
          ${this.t("emergency-assistances-vehicle-report-to-report-insurance")}
        </bbva-button-default>
        <bbva-text
          class="privacy-info-description container"
          alignment="center"
          tag="span"
          text="${this.t(this.privacyDescription?this.privacyDescription:"emergency-assistances-vehicle-report-modal-privacy-description")}"
          size="M"
        >
        </bbva-text>
        <bbva-link @click="${this._showNoticeOfPrivacy}">
          ${this.t(this.privacyLinkText||"emergency-assistances-vehicle-report-notice-of-privacy-header")}
        </bbva-link>
      </div>
    `}get _buildMultistepModal(){return g`
      <bbva-help-modal
        id="emergency-assistances-multistep-modal"
        header-text="${this.t("emergency-assistances-vehicle-report-other-assists-header-main")}"
        header-type="modal-initial"
        avoid-icon-close-modal
        aria-label="${this.t("emergency-assistances-vehicle-report-accessibility-modal",{modalTitle:this.headerTitle})}"
        ?visible="${this.visible}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        full-height
        hide-content-padding-top
        @modal-state-change="${this._manageStateOfModals}"
        @help-modal-close="${this._resetAssistancesReportMultistep}"
        @header-main-icon-click="${this._handleHeaderMainClick}"
        .closeModalElements="${this._closeModalElements}"
        .headerButtons="${this._modalHeaderButtons}"
      >
        <div slot="slot-content" ambient="light">
          ${this._multistepProgress}
          ${this.personDataIsUsed?this._buildMultistepReport:this._buildMultistepReportNoContactStep}
        </div>
      </bbva-help-modal>
    `}render(){return g`
      ${this._buildMultistepModal} ${this._buildChangeReportLocationModal}
    `}_handleHeaderMainClick(e){var t;const i=null==e||null===(t=e.detail)||void 0===t?void 0:t.index,s={0:()=>this._smartAssistant(),1:()=>this._handleLeaveReport(e)};null==s||s[i]()}}class na extends(y(c(f(Xe(h))))){static get is(){return"emergency-assistances-reports-dm"}static get scopedElements(){const e=[jt,ni,Ye];return na.scopedElementsFromClasses(e)}static get properties(){return{publicSettings:{type:Array},vehicleInsurance:{type:Object},publicSettingsId:{type:String,attribute:"public-settings-id"},publicSettingsKey:{type:String,attribute:"public-settings-key"},vehicleInsuranceId:{type:String,attribute:"vehicle-insurance-id"},fieldsProperty:{type:String,attribute:"fields-property"},appSettingsApiVersion:{type:String,attribute:"app-settings-api-version"},lossesReportRequestApiVersion:{type:String,attribute:"losses-report-requests-api-version"},vehicleInsuranceApiVersion:{type:String,attribute:"vehicle-insurance-api-version"},productTypeVehicleInsurance:{type:String,attribute:"product-type-vehicle-insurance"},subProductType:{type:String,attribute:"sub-product-type"},phoneNumberBbvaLine:{type:String,attribute:"phone-number-bbva-line"},requestServices:{type:Boolean,attribute:"request-services"},cacheType:{type:String,attribute:"cache-type"}}}constructor(){super(),this.requestServices=!1,this.productTypeVehicleInsurance="",this.fieldsProperty="",this.subProductType="",this.publicSettingsId="",this.publicSettingsKey="",this.vehicleInsuranceId="",this.phoneNumberBbvaLine="",this.appSettingsApiVersion="0",this.vehicleInsuranceApiVersion="0",this.lossesReportRequestApiVersion="0",this.publicSettings=[],this._configModal={},this.vehicleInsurance={}}firstUpdated(){this._getDm(),this.requestServices||(super.firstUpdated(),this.getVehicleInsuranceDm(),this.getPublicSettingsDm())}_getDm(){this._publicSettingsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-public-settings-api-dm"]'),this._vehicleInsuranceDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-vehicle-insurance-api-dm"]'),this._lossesReportRequestsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-losses-report-requests-api-dm"]')}updated(e){super.updated(e);const t=e.has("publicSettings")||e.has("vehicleInsurance"),i=this.publicSettings.length||Object.keys(this.vehicleInsurance).length;t&&i&&(this.getPublicSettingsDm(),this.getVehicleInsuranceDm())}createReport(e){var t,i,s,a,r,o,n,l,c;const d=e.assistsSelected.map(na._getAssistancesPostLosses),{geolocation:h,composedAddress:p,fullAddress:u,contact:m}=e,g=`${p.route} ${p.strNumber}`;let b=[];b="NO_FULL_ADDRESS"===this._addressComponents?[{name:p.country,componentTypes:["COUNTRY"]},{name:p.postalCode,componentTypes:["POSTAL_CODE"]},{name:p.city,componentTypes:["CITY"]},{name:g,componentTypes:["ADDRESS"]}]:[{name:u,componentTypes:["FULL_ADDRESS"]}];const v={policy:{id:null===(t=this._vehicleDetails)||void 0===t?void 0:t.id,certificateNumber:(null===(i=this._vehicleDetails)||void 0===i?void 0:i.certificateNumber)||""},requestType:{id:"NEW",lossDetail:{vehicle:{licensePlate:null===(s=this._vehicleDetails)||void 0===s?void 0:s.licensePlate,brand:{id:null===(a=this._vehicleDetails)||void 0===a?void 0:a.brandId,name:null===(r=this._vehicleDetails)||void 0===r?void 0:r.brandName},subBrand:{id:null===(o=this._vehicleDetails)||void 0===o?void 0:o.subBrandId,name:null===(n=this._vehicleDetails)||void 0===n?void 0:n.subBrandName},vehicleType:{id:null===(l=this._vehicleDetails)||void 0===l?void 0:l.vehicleTypeId,name:null===(c=this._vehicleDetails)||void 0===c?void 0:c.vehicleTypeName}},addresses:[{location:{addressComponents:b}}],geolocation:{latitude:h.lat.toString(),longitude:h.lng.toString()},serviceSpecificLosses:d}},...m&&{contactDetails:[{name:{nameType:"FULL_NAME",fullName:m.name},role:m.id,contact:{contactDetailType:"MOBILE",number:m.phoneNumber}}]}};this._lossesReportRequestsDm.postLossesReportRequests(v)}static _getAssistancesPostLosses(e){return{id:e.name,eventType:"ASSISTANCE"}}_setPublicSettingsResponse(e){var t;const i=((null==e?void 0:e.detail)||(null===(t=this.publicSettings)||void 0===t?void 0:t.detail)||this.publicSettings).find((e=>e.key===this.publicSettingsKey)),s=JSON.parse(null==i?void 0:i.value);this._settingsEmergencyReports(s)}_settingsEmergencyReports({data:e}){const t=null==e?void 0:e.hostAEM,i=null==e?void 0:e.emergencies.filter((e=>(null==e?void 0:e.productType)===this.productTypeVehicleInsurance)).find((e=>(null==e?void 0:e.flowSubProductType)===this.subProductType)),s=i.emergency.find((e=>"VEHICLE_ASSISTANCE"===e.id));this._getConfigProducts(s,i,t)}_getConfigProducts(e,t,i){const{contentFragmentPath:s}=t,{geolocation:a,personData:r,selectionType:o,helpDescription:n}=e,{addressComponents:l}=a;this._addressComponents=l,this._callTimeout=na._getTime(e);const c=na.createOptionEmergency(e.typeHelp);this._dispatchCustomEvent("emergency-assistances-vehicle-reports-dm-modal-create-report",{aemHost:i,selectionType:o,personData:r.isUsed,geolocation:a,helpDescription:n,contentFragmentPath:s,time:this._callTimeout,assistances:c})}static _getTime(e){var t,i;const s=null==e||null===(t=e.callTimeout)||void 0===t?void 0:t.isActive,a=null==e||null===(i=e.callTimeout)||void 0===i?void 0:i.time,[r,o]=a.split(":"),n=6e4*r+o/60*6e4;return{callTimeoutActivate:s,callTimeout:n,halfTimeout:n/2}}static createOptionEmergency(e){return e.map((e=>({id:e.idType,title:`emergency-assistances-vehicle-${e.idType.split("_")[0].toLowerCase()}-title`,value:e.helpDescription||"",infoHelp:(null==e?void 0:e.infoHelp)||"",titleInfoHelp:null!=e&&e.infoHelp?`emergency-assistances-vehicle-${e.idType.split("_")[0].toLowerCase()}-info-title`:""})))}_setVehicleInsuranceResponse(e){var t,i,s,a,r,o,n,l,c,d,h;const p=(null==e?void 0:e.detail)||(null===(t=this.vehicleInsurance)||void 0===t?void 0:t.detail)||this.vehicleInsurance,{vehicle:u,id:m,holder:g,certificateNumber:b}=p;return this._vehicleDetails={id:m,certificateNumber:b,licensePlate:(null==u?void 0:u.licencePlate)||"",brandId:null==u||null===(i=u.model)||void 0===i||null===(s=i.brand)||void 0===s?void 0:s.id,brandName:null==u||null===(a=u.model)||void 0===a||null===(r=a.brand)||void 0===r?void 0:r.name,subBrandId:null==u||null===(o=u.model)||void 0===o||null===(n=o.subBrand)||void 0===n?void 0:n.id,subBrandName:null==u||null===(l=u.model)||void 0===l||null===(c=l.subBrand)||void 0===c?void 0:c.name,vehicleTypeId:null==u||null===(d=u.vehicleType)||void 0===d?void 0:d.id,vehicleTypeName:null==u||null===(h=u.vehicleType)||void 0===h?void 0:h.name},this._dispatchCustomEvent("emergency-assistances-vehicle-report-dm-holder-data-send",{firstName:null==g?void 0:g.firstName,lastName:null==g?void 0:g.lastName,policyNumber:p.policyNumber,...(null==g?void 0:g.contactDetails)&&na._existContactDetail(null==g?void 0:g.contactDetails)})}static _existContactDetail([e]){var t,i;let s="";var a;"MOBILE"===(null==e||null===(t=e.contact)||void 0===t?void 0:t.contactDetailType)&&(s=null==e||null===(a=e.contact)||void 0===a?void 0:a.number);return{contactDetailType:null==e||null===(i=e.contact)||void 0===i?void 0:i.contactDetailType,number:s}}_setLossesReportRequests({detail:e}){this._dispatchCustomEvent("emergency-assistances-vehicle-reports-dm-generate-losses-report-success",e)}_handleErrorResponsePostLossesReport({detail:e}){const{messages:t}=e,[i]=t,{code:s}=i;this._dispatchCustomEvent("emergency-assistances-vehicle-report-dm-modal-communication-fail"),"alreadyRequested"===s&&this._dispatchCustomEvent("emergency-assistances-vehicle-report-dm-modal-already-exists")}_handleErrorResponse(){this._dispatchCustomEvent("emergency-assistances-vehicle-report-dm-api-dm-error")}get _tplDms(){return g`
      <bbva-global-public-settings-api-dm
        version="${this.appSettingsApiVersion}"
        ?native="${this.native}"
        host="${this.host}"
        .requiredToken="${this.requiredToken}"
        .cacheType="${this.cacheType}"
        .cacheKey="${`${na.is}-${Ye.is}`}"
        .publicSettingsHost="${this.publicSettingsHost}"
        .publicSettingsRequiredToken="${this.publicSettingsRequiredToken}"
        @public-settings-api-dm-fetch="${this._setPublicSettingsResponse}"
        @public-settings-api-dm-fetch-error="${this._handleErrorResponse}"
        @api-dm-error="${this._handleErrorResponse}"
      ></bbva-global-public-settings-api-dm>
      <bbva-global-vehicle-insurance-api-dm
        version="${this.vehicleInsuranceApiVersion}"
        ?native="${this.native}"
        host="${this.host}"
        .requiredToken="${this.requiredToken}"
        .cacheType="${this.cacheType}"
        .cacheKey="${`${na.is}-${ni.is}`}"
        @vehicle-insurance-api-dm-fetch="${this._setVehicleInsuranceResponse}"
        @vehicle-insurance-api-dm-fetch-error="${this._handleErrorResponse}"
        @api-dm-error="${this._handleErrorResponse}"
      ></bbva-global-vehicle-insurance-api-dm>
      <bbva-global-losses-report-requests-api-dm
        version="${this.lossesReportRequestApiVersion}"
        ?native="${this.native}"
        host="${this.host}"
        .requiredToken="${this.requiredToken}"
        @losses-report-requests-api-dm-create="${this._setLossesReportRequests}"
        @losses-report-requests-api-dm-create-error="${this._handleErrorResponsePostLossesReport}"
        @api-dm-error="${this._handleErrorResponse}"
      ></bbva-global-losses-report-requests-api-dm>
    `}getPublicSettingsDm(){Object.keys(this.publicSettings).length?(this._publicSettingsDm.publicSettings=this.publicSettings,this._setPublicSettingsResponse()):this._publicSettingsDm.getPublicSettings(this.publicSettingsId,{key:this.publicSettingsKey})}getVehicleInsuranceDm(){Object.keys(this.vehicleInsurance).length?(this._vehicleInsuranceDm.vehicleInsurance=this.vehicleInsurance,this._setVehicleInsuranceResponse()):this._vehicleInsuranceDm.getVehicleInsurance(this.vehicleInsuranceId,{fields:this.fieldsProperty})}render(){return g`
      ${this._tplDms}
    `}}var la=t`:host {
  display: block;
  box-sizing: border-box;
  --bbva-help-modal-content-color: var(--colorsSecondary600, ${i(n.secondary600)});
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-clip-microillustration] {
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
  text-align: center;
}

.order-online-components {
  display: flex;
  justify-content: space-between;
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}

.text-hour {
  display: inline-block;
}

[data-tag-name=bbva-link] {
  display: grid;
  place-items: center;
}
`;class ca extends(y(c(f(Xe(h))))){static get is(){return"assistances-info-modal"}static get properties(){return{configInfoModal:{type:Object,attribute:"config-info-modal"},visible:{type:Boolean},hideIconText:{type:Boolean,attribute:"hide-icon-text"}}}static get styles(){return[la,Mt.light,M.light,T.light,xe.light,ke.light,Se.light,m("assistances-info-modal-shared-styles")]}static get scopedElements(){const e=[Qe,Rt,P,u,$e,V,Ce,...ca.configurationScopedElements()];return ca.scopedElementsFromClasses(e)}get _dynamicTemplates(){return{content:this._buildPanelText,panel:this._microillustrationImage,listDetails:this._buildListDetails,timeOutActive:this._timerSection,options:this._buildRowButtons}}constructor(){super(),this.visible=!1,this.configInfoModal={},this.hideIconText=!1}_identifyCurrentModalId(e){var t;const i=null===(t=this.configInfoModal)||void 0===t?void 0:t.id;this._dispatchCustomEvent(`emergency-assistances-vehicle-report-${i}-${e}`)}_manageInfoModalState(e){const{detail:t}=e;this._dispatchCustomEvent("emergency-assistances-vehicle-report-info-modal-state-change",null==t?void 0:t.visible);const i=null!=t&&t.visible?"open":"close";this._identifyCurrentModalId(i)}get _buildMicroillustrationPanel(){var e,t,i,s,a,r;return g`
      <bbva-clip-microillustration
        disabled-tabindex
        microillustration="${null===(e=this.configInfoModal)||void 0===e||null===(t=e.panel)||void 0===t?void 0:t.microillustration}"
        size="L"
        role="presentation"
      >
      </bbva-clip-microillustration>
      <bbva-text
        font-weight="500"
        inherit
        size="L"
        alignment="center"
        text="${this.t(`${null===(i=this.configInfoModal)||void 0===i||null===(s=i.panel)||void 0===s?void 0:s.heading}`)}"
      >
      </bbva-text>
      <bbva-text
        size="S"
        alignment="center"
        text="${this.t(`${null===(a=this.configInfoModal)||void 0===a||null===(r=a.panel)||void 0===r?void 0:r.description}`)}"
      >
      </bbva-text>
    `}get _buildListDetails(){return g`
      <div slot="slot-content" ambient="light">
        ${Je(this.configInfoModal.listDetails,(e=>e.id),(e=>g`
            <div class="order-online-components">
              <bbva-text text="${this.t(`${e.detail}`)}" size="S" inherit> </bbva-text>
              ${"date"===e.id?g`
                    <div>
                      <bbva-date
                        date="${this.t(`${e.description}`)}"
                        options='{"day":"2-digit","month":"long","year":"numeric","hour":"2-digit","minute":"2-digit","hour12":false}'
                        .locale="${this.locale}"
                        clockSuffix
                      >
                      </bbva-date>
                      <bbva-text
                        class="text-hour"
                        alignment="right"
                        text="h"
                        size="S"
                        font-style="italic"
                        font-weight="500"
                        inherit
                      >
                      </bbva-text>
                    </div>
                  `:g`
                    <bbva-text
                      alignment="right"
                      text="${this.t(`${e.description}`)}"
                      size="S"
                      font-weight="500"
                      inherit
                    >
                    </bbva-text>
                  `}
            </div>
          `))}
      </div>
    `}get _progressTimer(){var e,t;return g`
      <bbva-progress-timer
        show-vertical
        disabled-tabindex
        timeout="${Number(null===(e=this.configInfoModal)||void 0===e?void 0:e.totalMinutes)}"
        time-alert="${Number(null===(t=this.configInfoModal)||void 0===t?void 0:t.halfMinutes)}"
        @progress-timer-counter-finish="${()=>{this.configInfoModal={...this.configInfoModal,callLinkDisabled:!1}}}"
      >
        <span>
          ${this.t("emergency-assistances-vehicle-report-timer-description-receipt")}
        </span>
      </bbva-progress-timer>
    `}get _callLink(){var e;return g`
      <bbva-link
        @click="${this._handleClickOnAssistanceLine}"
        ?disabled="${null===(e=this.configInfoModal)||void 0===e?void 0:e.callLinkDisabled}"
      >
        ${this.t("emergency-assistances-vehicle-report-success-help-link-text-call")}
      </bbva-link>
    `}_handleClickOnAssistanceLine(){var e,t;this._dispatchCustomEvent(`${null===(e=this.configInfoModal)||void 0===e?void 0:e.eventName}-assistance-line-call`,null===(t=this.configInfoModal)||void 0===t?void 0:t.number)}_handleReceiptAction({detail:e}){var t;const i=null===(t=this.configInfoModal)||void 0===t?void 0:t.options[e];this._dispatchCustomEvent(`emergency-assistances-vehicle-report-ticket-${i.id}-click`,i.detail)}get _buttonRow(){var e;return g`
      <bbva-button-row
        .options="${null===(e=this.configInfoModal)||void 0===e?void 0:e.options}"
        @button-row-item-click="${this._handleReceiptAction}"
        accessibility-text="${this.t("emergency-assistances-vehicle-report-accessibility-button-row")}"
      ></bbva-button-row>
    `}_handleButtonClick(e){var t,i,s;e.stopPropagation(),"error-location-half-modal"===(null===(t=this.configInfoModal)||void 0===t?void 0:t.id)&&this._dispatchCustomEvent("emergency-assistances-vehicle-report-info-modal-state-change",!1),this._dispatchCustomEvent(`${null===(i=this.configInfoModal)||void 0===i?void 0:i.eventName}-button-click`,(null===(s=this.configInfoModal)||void 0===s?void 0:s.number)||!0)}_handleLinkClick(e){var t,i;e.stopPropagation(),"error-location-half-modal"===(null===(t=this.configInfoModal)||void 0===t?void 0:t.id)&&(this._dispatchCustomEvent("emergency-assistances-vehicle-report-info-modal-state-change",!1),this._dispatchCustomEvent("emergency-assistances-vehicle-report-info-modal-veil-close",!1)),this._dispatchCustomEvent(`${null===(i=this.configInfoModal)||void 0===i?void 0:i.eventName}-link-click`)}_handleVeilClick(e){var t;e.stopPropagation(),"error-location-half-modal"===(null===(t=this.configInfoModal)||void 0===t?void 0:t.id)&&(this._dispatchCustomEvent("emergency-assistances-vehicle-report-info-modal-state-change",!1),this._dispatchCustomEvent("emergency-assistances-vehicle-report-info-modal-veil-close",!1))}get _buildPanelText(){var e,t,i,s;return g`
      <div slot="slot-content" ambient="light">
        <bbva-text
          alignment="center"
          text="${this.t(`${null===(e=this.configInfoModal)||void 0===e||null===(t=e.content)||void 0===t?void 0:t.firstParagraph}`)}"
          size="S"
        >
        </bbva-text>
        <bbva-text
          alignment="center"
          text="${this.t(`${null===(i=this.configInfoModal)||void 0===i||null===(s=i.content)||void 0===s?void 0:s.secondParagraph}`)}"
          size="S"
        >
        </bbva-text>
      </div>
    `}get _microillustrationImage(){return g`
      <div slot="slot-content" ambient="light">
        ${this._buildMicroillustrationPanel}
      </div>
    `}get _timerSection(){return g`
      <div slot="slot-content" ambient="light">
        ${this._progressTimer} ${this._callLink}
      </div>
    `}get _buildRowButtons(){return g`
      <div slot="slot-content" ambient="light">
        ${this._buttonRow}
      </div>
    `}get _buildDynamicSuccessReceipt(){const e=Object.keys(this.configInfoModal);return Je(e,(e=>e.id),(e=>e in this._dynamicTemplates?this._dynamicTemplates[e]:E))}_buildAccessibilityText(){var e,t;return null===(e=this.configInfoModal)||void 0===e||null===(t=e.id)||void 0===t?void 0:t.split("-").join(" ")}_iconTextHeader(e){return this.hideIconText?"":this.t(e)}render(){var e,t,i,s,a,r,o,n,l,c,d,h,p,u;return g`
      <bbva-help-modal
        id="${null===(e=this.configInfoModal)||void 0===e?void 0:e.id}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ?hide-content-padding-top="${null===(t=this.configInfoModal)||void 0===t?void 0:t.hidePaddingTop}"
        ?fixed-footer="${null===(i=this.configInfoModal)||void 0===i?void 0:i.fixedFooter}"
        ?full-height="${null===(s=this.configInfoModal)||void 0===s?void 0:s.fullHeight}"
        ?visible="${this.visible}"
        header-text="${this.t(`${null===(a=this.configInfoModal)||void 0===a?void 0:a.modalHeader}`)}"
        header-type="${null===(r=this.configInfoModal)||void 0===r?void 0:r.headerType}"
        modal-type="${null===(o=this.configInfoModal)||void 0===o?void 0:o.modalType}"
        title-icon="${null===(n=this.configInfoModal)||void 0===n?void 0:n.icon}"
        body-text="${this.t(null===(l=this.configInfoModal)||void 0===l?void 0:l.bodyText)}"
        button-text="${this.t(`${null===(c=this.configInfoModal)||void 0===c?void 0:c.buttonText}`)}"
        link-text="${this.t(null===(d=this.configInfoModal)||void 0===d?void 0:d.linkText)}"
        title-text="${this.t((null===(h=this.configInfoModal)||void 0===h?void 0:h.titleText)||"")}"
        ambient="light"
        aria-label="${this.t("emergency-assistances-vehicle-report-accessibility-modal",{modalTitle:(null===(p=this.configInfoModal)||void 0===p?void 0:p.modalHeader)||this._buildAccessibilityText()})}"
        .closeModalElements="${null===(u=this.configInfoModal)||void 0===u?void 0:u.closeModalElements}"
        @modal-state-change="${this._manageInfoModalState}"
        @help-modal-veil-click="${this._handleVeilClick}"
        @help-modal-footer-button-click="${this._handleButtonClick}"
        @help-modal-footer-link-click="${this._handleLinkClick}"
        header-close-icon-label="${this._iconTextHeader("emergency-assistances-vehicle-report-close-help-modal")}"
        header-close-icon-aria-label="${this.t("emergency-assistances-vehicle-report-close-help-modal-accessibility-text")}"
      >
        ${this._buildDynamicSuccessReceipt}
      </bbva-help-modal>
    `}}var da=t`:host {
  display: block;
  box-sizing: border-box;
  --bbva-transition-container-padding: 0;
  --bbva-transition-container-text-align: left;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=help-faqs-aem] {
  height: auto;
}
`;class ha extends(y(f(Xe(c(h))))){static get scopedElements(){const e=[Vt,Tt,We,...ha.configurationScopedElements()];return ha.scopedElementsFromClasses(e)}static get is(){return"emergency-assistances-vehicle-report-faqs-menu"}static get properties(){return{showMenuFaqs:{type:Boolean,attribute:"show-menu-faqs"},faqsConfigurations:{type:Object,attribute:"faqs-configurations"},visibleDetail:{type:Boolean,attribute:"visible-detail"},_headingLevel:{type:Number,state:!0},hideIconText:{type:Boolean,attribute:"hide-icon-text"}}}constructor(){super(),this.showMenuFaqs=!1,this.visibleDetail=!1,this._headingLevel=2,this.faqsConfigurations={},this.hideIconText=!1}static get styles(){return[da,kt.light,m("emergency-assistances-vehicle-report-faqs-menu-shared-styles")]}_iconTextHeader(e){return this.hideIconText?"":this.t(e)}render(){var e,t,i;return g`
      <bbva-transition-container
        ?visible=${this.showMenuFaqs}
        header-type="first-level-sequential"
        header-show-left-icon
        header-text="${this.t("emergency-assistances-vehicle-report-faqs-header-text")}"
        @transition-container-close=${e=>{e.stopPropagation(),this._dispatchCustomEvent("emergency-assistances-vehicle-report-faqs-menu-header-return")}}
        header-left-icon-label="${this._iconTextHeader("emergency-assistances-vehicle-report-header-return")}"
        header-left-icon-aria-label="${this.t("emergency-assistances-vehicle-report-header-return-accessibility-text")}"
        ><div slot="slot-content" ambient="light">
          <help-faqs-aem
            ?i-o-s-fixed-header="${this.iOSFixedHeader}"
            ?show-modal="${this.visibleDetail}"
            language="${this.language}"
            ?native="${this.native}"
            host="${null===(e=this.faqsConfigurations)||void 0===e?void 0:e.hostAEM}"
            content-fragment-path="${null===(t=this.faqsConfigurations)||void 0===t?void 0:t.contentFragmentPath}"
            hide-footer
            headingLevel="${this._headingLevel}"
            ?hide-icon-text="${this.hideIconText}"
            @help-faqs-aem-detail-link-click="${e=>{e.stopPropagation(),this._dispatchCustomEvent("emergency-assistances-vehicle-report-faqs-menu-help-faqs-aem-detail-link-click",e)}}"
            @help-modal-header-right-primary-click="${e=>{e.stopPropagation(),this._dispatchCustomEvent("emergency-assistances-vehicle-report-faqs-menu-help-modal-header-right-primary-click")}}"
          ></help-faqs-aem>
          <bbva-button-list
            icon="${z()}"
            title-text="${this.t("emergency-assistances-vehicle-report-detail-faqs-call")}"
            text="${null===(i=this.faqsConfigurations)||void 0===i?void 0:i.phoneNumberBbvaLine}"
            @click="${()=>{var e;this._dispatchCustomEvent("emergency-assistances-vehicle-report-faqs-menu-button-list-call-bbva-line",null===(e=this.faqsConfigurations)||void 0===e?void 0:e.phoneNumberBbvaLine)}}"
          ></bbva-button-list>
        </div>
      </bbva-transition-container>
    `}}const pa=new r;var ua=t`:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--emergency-assistances-vehicle-report-dark-mode-bg-color, var(--emergency-assistances-vehicle-report-bg-color, var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)})));
  height: 100%;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
${pa.mediaRules()}`;class ma extends(y(c(f(Xe(h))))){static get is(){return"emergency-assistances-vehicle-report"}static get scopedElements(){const e=[na,oa,ha,ca,...ma.configurationScopedElements()];return ma.scopedElementsFromClasses(e)}static get properties(){return{apiKey:{type:String,attribute:"api-key"},geoLocation:{type:Object},multistepModalVisible:{type:Boolean,attribute:"multistep-modal-visible"},publicSettingsId:{type:String,attribute:"public-settings-id"},publicSettingsKey:{type:String,attribute:"public-settings-key"},vehicleInsuranceId:{type:String,attribute:"vehicle-insurance-id"},subProductType:{type:String,attribute:"sub-product-type"},requestServices:{type:Boolean,attribute:"request-services"},viewPolicy:{type:String,attribute:"view-policy"},ticketSharing:{type:String,attribute:"ticket-sharing"},viewPolicyVisible:{type:Boolean,attribute:"view-policy-visible"},appSettingsApiVersion:{type:String,attribute:"app-settings-api-version"},publicSettings:{type:Array},vehicleInsurance:{type:Object},phoneNumberBbvaLineVehicle:{type:String,attribute:"phone-number-bbva-line-vehicle"},phoneNumberBbvaLine:{type:String,attribute:"phone-number-bbva-line"},productTypeVehicleInsurance:{type:String,attribute:"product-type-vehicle-insurance"},fieldsProperty:{type:String,attribute:"fields-property"},smartAssistant:{type:Boolean,attribute:"smart-assistant"},privacyTermsPdf:{type:Boolean,attribute:"privacy-terms-pdf"},viewCallVisible:{type:Boolean,attribute:"view-call-visible"},multiStepConfiguration:{type:Object,attribute:"multi-step-configuration"},faqsConfigurations:{type:Object,attribute:"faqs-configurations"},viewInfoModal:{type:Boolean,attribute:"view-info-modal"},numberOfAttemptOnGeolocation:{type:Number,attribute:"number-of-attempt-on-geolocation"},hasLocationPermissions:{type:Boolean,attribute:"has-location-permissions"},phoneDetails:{type:Object,attribute:"phone-details"},pdfDocument:{type:String,attribute:"pdf-document"},personDataIsUsed:{type:Boolean,attribute:"person-data-is-used"},cacheType:{type:String,attribute:"cache-type"},lossesReportRequestApiVersion:{type:String,attribute:"losses-report-requests-api-version"},vehicleInsuranceApiVersion:{type:String,attribute:"vehicle-insurance-api-version"},_dataModal:{type:Object,state:!0},_modalErrorGeneric:{type:Boolean,state:!0},_infoModal:{type:Object,state:!0},_assistsSelected:{type:Array,state:!0},_viewMenuFaqs:{type:Boolean,state:!0},_timeOutData:{type:Object,state:!0},_contactDetails:{type:Object,state:!0},_configInfoModal:{type:Object,state:!0},hideIconText:{type:Boolean,attribute:"hide-icon-text"}}}constructor(){super(),this.config={loader:!0},this.apiKey="",this.host="",this.multistepModalVisible=!1,this.requiredToken="",this.lossesReportRequestApiVersion="",this.vehicleInsuranceApiVersion="",this.appSettingsApiVersion="0",this.publicSettingsId="",this.publicSettingsKey="",this.publicSettings=[],this.vehicleInsuranceId="",this.vehicleInsurance={},this.subProductType="",this.requestServices=!1,this.viewPolicy="",this.ticketSharing="",this.viewPolicyVisible=!1,this.phoneNumberBbvaLineVehicle="",this.phoneNumberBbvaLine="",this.productTypeVehicleInsurance="",this.viewCallVisible=!1,this.geoLocation={},this.viewInfoModal=!1,this.fieldsProperty="",this.smartAssistant=!1,this.privacyTermsPdf=!1,this.multiStepConfiguration={},this.faqsConfigurations={},this.numberOfAttemptOnGeolocation=0,this.hasLocationPermissions=!1,this.phoneDetails={},this.pdfDocument="",this.personDataIsUsed=!1,this.cacheType="none",this.history={data:{}},this._configInfoModal={},this._viewMenuFaqs=!1,this._timeOutData={},this._contactDetails={},this._dataModal={},this._infoModal={},this._assistsSelected=[],this._modalErrorGeneric=!1,this._multistepState={},this.hideIconText=!1}static get styles(){return[ua,m("emergency-assistances-vehicle-report-shared-styles")]}firstUpdated(){var e;super.firstUpdated(),Object.keys(this.geoLocation).length||this.openErrorLocation(),"multistep"in(null===(e=this.history)||void 0===e?void 0:e.data)&&(this._multistepState={...this.history.data})}navigateBack(e=!0){e&&this._dispatchCustomEvent("navigation-go-back",e)}navigateForward(e=!1,t=!0,i={}){this._dispatchCustomEvent("navigation-go-forward",{id:"EmergencyAssistancesVehicleReport",params:{target:{id:"EmergencyAssistancesVehicleReport",params:i,history:{routes:[],data:{...this._dataModal,vehicleInsuranceData:this.vehicleInsurance,publicSettingsData:this.publicSettings,vehicleTypeData:this.vehicleType}}}},replace:e,external:t})}_saveFeatureState({detail:e}){const{key:t,data:i}=e;this._dataModal={...this._dataModal,[t]:i}}get _dataManager(){return this.shadowRoot.querySelector('[data-tag-name="emergency-assistances-reports-dm"]')}_generateReportModal({detail:e}){var t,i;const{helpDescription:s}=e;this._helpDescription=s?this.t("emergency-assistances-vehicle-report-other-assists-header-main"):"";const a=null==e||null===(t=e.time)||void 0===t?void 0:t.halfTimeout,r=null==e||null===(i=e.time)||void 0===i?void 0:i.callTimeout,o=(null==e?void 0:e.time.callTimeoutActivate)||!1;o&&(this._timeOutData={halfMinutes:a,totalMinutes:r,timeOutActive:o}),this.multiStepConfiguration={language:this.language,smartAssistant:this.smartAssistant,privacyTermsPdf:this.privacyTermsPdf},this.faqsConfigurations={phoneNumberBbvaLine:this.phoneNumberBbvaLine,hostAEM:null==e?void 0:e.aemHost,contentFragmentPath:null==e?void 0:e.contentFragmentPath},this._infoModal={...this._infoModal,assistances:e.assistances,selectionType:e.selectionType},this.personDataIsUsed=null==e?void 0:e.personData,this.multistepModalVisible=!0}_openSuccessAssistancesReport({detail:e}){const{operationDate:t,id:i}=e;let s=[];const a={icon:Ee(),label:this.t("emergency-assistances-vehicle-report-success-share"),id:"share-receipt",detail:this.ticketSharing};s=[...s,a],this.viewPolicyVisible&&(s=[{icon:Ie(),label:this.t("emergency-assistances-vehicle-report-success-policy"),id:"policy-file",detail:this.viewPolicy},...s]);const r={id:"success-report-modal",modalHeader:"emergency-assistances-vehicle-report-other-assists-header-main",headerType:"modal-initial",fullHeight:!0,hidePaddingTop:!0,icon:"",panel:{microillustration:"success",heading:"emergency-assistances-vehicle-report-request-received",description:"emergency-assistances-vehicle-report-help-on-the-way"},listDetails:[{id:"date",detail:"emergency-assistances-vehicle-report-assistance-date",description:t},{id:"policy",detail:"emergency-assistances-vehicle-report-policy",description:this._policyNumber},{id:"reportId",detail:"emergency-assistances-vehicle-receipt-report",description:i},{id:"reportType",detail:"emergency-assistances-vehicle-report-reporting-type",description:this._formatAssistances()}],buttonText:"emergency-assistances-vehicle-report-leave-button",linkText:"",number:this.phoneNumberBbvaLineVehicle,callLinkDisabled:!0,eventName:"emergency-assistances-vehicle-report-receipt",closeModalElements:["header-right-primary","footer-button"],...this._timeOutData,options:s};this._configInfoModal={...r},this.viewInfoModal=!0,this.clearLoader()}_errorLossesReport({detail:e}){this.clearLoader(),this._dataModal={...e,headerTitle:this.t("emergency-assistances-vehicle-report-success-header")},this._modalErrorGeneric=!0}openCommunicationErrorModal(){this.clearLoader();const e={id:"error-communication-modal",modalHeader:"emergency-assistances-vehicle-report-error-heading-text",headerType:"modal-initial",fullHeight:!0,fixedFooter:!0,hidePaddingTop:!0,icon:"",panel:{microillustration:"error",heading:"emergency-assistances-vehicle-report-error-heading-text",description:"emergency-assistances-vehicle-report-error-description-text"},number:this.phoneNumberBbvaLine,buttonText:this.viewCallVisible?"emergency-assistances-vehicle-report-call-button":"",linkText:"emergency-assistances-vehicle-report-leave-button",eventName:"emergency-assistances-vehicle-report-communication-failed-modal",closeModalElements:["header-right-primary","footer-link"]};this._configInfoModal={...e},this.viewInfoModal=!0}_initialRequestError(){this.multistepModalVisible=!1,this.openCommunicationErrorModal()}_createNewReport({detail:e}){this.showLoader(),this._assistsSelected=e.assistsSelected,this.multistepModalVisible=!1,this._dataManager.createReport(e)}_formatAssistances(){var e;const t=null===(e=this._assistsSelected)||void 0===e?void 0:e.map((e=>e.description));return this._assistsSelected.length>1?t.slice(0,-1).join(", ").concat(` ${this.t("emergency-assistances-vehicle-report-selected-connector")} `,t.slice(-1)):t.slice(0)}_manageGeolocationAttempt(){this.numberOfAttemptOnGeolocation+=1,3===this.numberOfAttemptOnGeolocation&&(this.viewInfoModal=!1,this._openCallToAssistanceHalfModal())}_getInsuranceData({detail:e}){const{firstName:t,lastName:i,number:s,policyNumber:a}=e;this._contactDetails={id:"HOLDER",name:`${t} ${i}`,phoneNumber:s,encryptedPhone:""},this._policyNumber=a}_openCallToAssistanceHalfModal(){this._configInfoModal={id:"call-to-assistance-assistance-modal",modalType:"warning",modalHeader:"",icon:A(),fullHeight:!1,fixedFooter:!1,closeModalElements:["footer-button","footer-link"],buttonText:"emergency-assistances-vehicle-report-error-call-to-assistance",linkText:"emergency-assistances-vehicle-report-leave-button",bodyText:"emergency-assistances-vehicle-report-error-location-description",titleText:"emergency-assistances-vehicle-report-communication-interrupted",eventName:"emergency-assistances-vehicle-report-calling-to-assistance"},this.viewInfoModal=!0}_openPreventLeaveReport(){this._configInfoModal={id:"prevent-leave-modal",modalType:"warning",modalHeader:"",icon:A(),fullHeight:!1,fixedFooter:!1,closeModalElements:["footer-button","footer-link"],buttonText:"emergency-assistances-vehicle-report-leave-button",linkText:"emergency-assistances-vehicle-report-continue-on-operation-button",bodyText:"emergency-assistances-vehicle-report-prevent-leave",eventName:"emergency-assistances-vehicle-report-modal-leaving-operative"},this.viewInfoModal=!0}_openVerifyLocationPermission(){this._configInfoModal={id:"verify-location-permission",modalType:"info",modalHeader:"",icon:w(),fixedFooter:!1,closeModalElements:["footer-button","footer-link"],fullHeight:!1,titleText:"emergency-assistances-vehicle-report-has-location-permission",bodyText:"emergency-assistances-vehicle-report-has-location-permission-description",buttonText:"emergency-assistances-vehicle-report-has-location-permission-go-to-settings",linkText:"emergency-assistances-vehicle-report-has-location-permission-no-thanks",eventName:"emergency-vehicle-assistance-report-modal-checking-out-location"},this.viewInfoModal=!0}_openNoticeOfPrivacy(){this._configInfoModal={id:"notice-of-privacy-modal",modalHeader:"emergency-assistances-vehicle-report-notice-of-privacy-header",icon:w(),headerType:"modal-initial",fullHeight:!0,buttonText:"emergency-assistances-vehicle-report-understood-button",linkText:"",content:{firstParagraph:"emergency-assistances-vehicle-report-notice-privacy-insurance",secondParagraph:"emergency-assistances-vehicle-report-notice-privacy-insurance-two"},fixedFooter:!0,closeModalElements:["header-right-primary","footer-button"],eventName:"emergency-assistances-vehicle-report-notice-of-privacy-modal"},this.viewInfoModal=!0}openErrorLocation(){this._configInfoModal={id:"error-location-half-modal",modalType:"warning",modalHeader:"",icon:A(),fullHeight:!1,fixedFooter:!1,closeModalElements:["footer-link"],buttonText:"emergency-assistances-vehicle-report-retry-button",linkText:"emergency-assistances-vehicle-report-leave-button",bodyText:"emergency-assistances-vehicle-report-error-location-description",titleText:"emergency-assistances-vehicle-report-communication-interrupted",eventName:"emergency-assistances-vehicle-report-geolocation-failed"},this.viewInfoModal=!0}_openAlreadyReportedModal(){this.clearLoader(),this._configInfoModal={id:"already-reported-modal",modalHeader:"emergency-assistances-vehicle-report-success-header",headerType:"modal-initial",fullHeight:!0,fixedFooter:!0,hidePaddingTop:!0,icon:"",panel:{microillustration:"error",heading:"emergency-assistances-vehicle-report-existing-title-text",description:"emergency-assistances-vehicle-report-existing-description-text"},number:this.phoneNumberBbvaLineVehicle,buttonText:"emergency-assistances-vehicle-report-existing-button-text",linkText:"emergency-assistances-vehicle-report-existing-link-text",eventName:"emergency-assistances-vehicle-reports-already-report-error-modal",closeModalElements:["header-right-primary","footer-link"]},this.viewInfoModal=!0}_openOperationNotPerformedModal(){this.clearLoader(),this._configInfoModal={id:"operation-not-performed-modal",modalHeader:"emergency-assistances-vehicle-report-emergency-modal",headerType:"modal-initial",fullHeight:!0,fixedFooter:!0,hidePaddingTop:!0,icon:"",panel:{microillustration:"error",heading:"emergency-assistances-vehicle-report-action-not-performed",description:"emergency-assistances-vehicle-report-not-available-services-error"},buttonText:"emergency-assistances-vehicle-report-understood-button",linkText:"",eventName:"emergency-assistances-vehicle-report-operation-not-performed-error-modal",closeModalElements:["header-right-primary","footer-button"]},this.viewInfoModal=!0}get _buildAssistanceMultistepModal(){return g`
      <assistance-generate-report-multistep-modal
        .restoreMultistepState="${this._multistepState}"
        ?visible="${this.multistepModalVisible}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        .phoneDetails="${this.phoneDetails}"
        ?person-data-is-used="${this.personDataIsUsed}"
        .contactDetails="${this._contactDetails}"
        ?is-native="${this.isNative}"
        api-key="${this.apiKey}"
        .geoLocation="${this.geoLocation}"
        .dataModal="${this._dataModal}"
        .infoModal="${this._infoModal}"
        pdf-document="${this.pdfDocument}"
        .multiStepConfiguration="${this.multiStepConfiguration}"
        ?has-location-permissions=${this.hasLocationPermissions}
        ?hide-icon-text="${this.hideIconText}"
        header-title="${this.t("")}"
        phone-number-bbva-line-vehicle="${this.phoneNumberBbvaLineVehicle}"
        @emergency-assistances-vehicle-report-multistep-modal-smart-assistant-header-open="${()=>{this.navigateForward()}}"
        @emergency-assistances-vehicle-report-multistep-modal-faqs-header-open="${({detail:e})=>{this._viewMenuFaqs=e}}"
        @emergency-assistances-vehicle-report-multistep-modal-leave-prevent="${this._openPreventLeaveReport}"
        @emergency-assistances-vehicle-report-multistep-modal-multistep-update-state="${this._saveFeatureState}"
        @emergency-assistances-vehicle-report-multistep-modal-new-report-create="${this._createNewReport}"
        @emergency-assistances-vehicle-report-multistep-modal-location-permissions-open="${this._openVerifyLocationPermission}"
        @emergency-assistances-vehicle-report-multistep-modal-geolocation-change="${({detail:e})=>{this.geoLocation=e}}"
        @emergency-assistances-vehicle-report-multistep-modal-notice-of-privacy-modal-open="${this._openNoticeOfPrivacy}"
        @emergency-assistances-vehicle-report-multistep-modal-close="${()=>{this.multistepModalVisible=!1}}"
      >
      </assistance-generate-report-multistep-modal>
    `}get _buildAssistancesInfoModal(){return g`
      <assistances-info-modal
        .locale="${this.locale}"
        ?visible="${this.viewInfoModal}"
        ?hide-icon-text="${this.hideIconText}"
        .configInfoModal="${this._configInfoModal}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        @emergency-assistances-vehicle-report-info-modal-state-change="${({detail:e})=>{this.viewInfoModal=e}}"
        @emergency-assistances-vehicle-report-info-modal-veil-close="${({detail:e})=>{this.multistepModalVisible=e}}"
        @emergency-assistances-vehicle-report-modal-leaving-operative-button-click="${()=>{this.multistepModalVisible=!1}}"
        @emergency-assistances-vehicle-report-geolocation-failed-button-click="${this._manageGeolocationAttempt}"
      >
      </assistances-info-modal>
    `}get _openMenuFAQs(){return g`
      <emergency-assistances-vehicle-report-faqs-menu
        ?show-menu-faqs="${this._viewMenuFaqs}"
        ?hide-icon-text="${this.hideIconText}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        .faqsConfigurations="${this.faqsConfigurations}"
        @emergency-assistances-vehicle-report-faqs-menu-header-return="${()=>{this._viewMenuFaqs=!1}}"
      ></emergency-assistances-vehicle-report-faqs-menu>
    `}get _tplDM(){return g`
      <emergency-assistances-reports-dm
        host="${this.host}"
        language="${this.language}"
        required-token="${this.requiredToken}"
        ?native="${this.native}"
        ?request-services="${this.requestServices}"
        app-settings-api-version="${this.appSettingsApiVersion}"
        vehicle-insurance-api-version="${this.vehicleInsuranceApiVersion}"
        losses-report-requests-api-version="${this.lossesReportRequestApiVersion}"
        cache-type="${this.cacheType}"
        public-settings-id="${this.publicSettingsId}"
        public-settings-key="${this.publicSettingsKey}"
        vehicle-insurance-id="${this.vehicleInsuranceId}"
        fields-property="${this.fieldsProperty}"
        sub-product-type="${this.subProductType}"
        product-type-vehicle-insurance="${this.productTypeVehicleInsurance}"
        .publicSettings="${this.publicSettings}"
        .vehicleInsurance="${this.vehicleInsurance}"
        phone-number-bbva-line-vehicle="${this.phoneNumberBbvaLineVehicle}"
        phone-number-bbva-line="${this.phoneNumberBbvaLine}"
        public-settings-host="${this.publicSettingsHost}"
        public-settings-required-token="${this.publicSettingsRequiredToken}"
        @emergency-assistances-vehicle-report-generic-modal-error="${this._errorLossesReport}"
        @emergency-assistances-vehicle-report-dm-holder-data-send="${e=>{this._configInfoModal={},this._getInsuranceData(e)}}"
        @emergency-assistances-vehicle-reports-dm-generate-losses-report-success="${this._openSuccessAssistancesReport}"
        @emergency-assistances-vehicle-reports-dm-modal-create-report="${this._generateReportModal}}"
        @emergency-assistances-vehicle-report-dm-modal-already-exists="${this._openAlreadyReportedModal}"
        @emergency-assistances-vehicle-report-dm-api-dm-error="${this._initialRequestError}"
        @emergency-assistances-vehicle-report-dm-modal-communication-fail="${this._openOperationNotPerformedModal}"
      ></emergency-assistances-reports-dm>
    `}get _buildEmergencyAssistancesVehicleTemplate(){return g`
      ${this._buildAssistanceMultistepModal} ${this._buildAssistancesInfoModal}
    `}render(){return g`
      ${super.render()} ${this._tplDM} ${this._buildEmergencyAssistancesVehicleTemplate}
      ${"contentFragmentPath"in this.faqsConfigurations?this._openMenuFAQs:E}
    `}}customElements.define(ma.is,ma);var ga=t`:host {
  display: block;
  box-sizing: border-box;
  position: fixed;
  top: 0;
  left: 0;
  width: 100vw;
  height: auto;
  z-index: var(--bbva-notification-container-z-index, 8);
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}
${(new r).mediaRules()}`;class ba extends(l(h)){static get is(){return"bbva-notification-container"}static get scopedElements(){return{"bbva-notification-toast":$}}static get properties(){return{duration:{type:Number},defaultType:{type:String,attribute:"default-type"},notificationIcons:{type:Object},fixedBottom:{type:Boolean,attribute:"fixed-bottom"},roleText:{type:String,attribute:"role-text"},ariaLiveText:{type:String,attribute:"aria-live-text"}}}constructor(){super(),this.ariaLiveText="polite",this.roleText="alert",this.defaultType="error",this.duration=4e3,this.notificationIcons={info:w(),warning:w(),error:A(),success:R()},this._stack=[],this._currentNotification={},this._toastOpened=!1,this._uniqueId=String(Math.floor(Math.random()*Date.now()))}get _defaultNotification(){return{description:"",simpleLinkText:"",type:this.defaultType,duration:this.duration}}getParentElement(){const e=this.getRootNode();return 11===e.nodeType?e.host:document}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._parentElement=this.getParentElement(),this._boundShowNotification=this._showNotification.bind(this),this._boundHideNotification=this._hideOnEvent.bind(this),this._parentElement.addEventListener("show-notification",this._boundShowNotification),this._parentElement.addEventListener("hide-notification",this._boundHideNotification)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.clear(),this._parentElement.removeEventListener("show-notification",this._boundShowNotification),this._parentElement.removeEventListener("hide-notification",this._boundHideNotification)}clear(e=!1){e&&(this._stack=[]),this._hideNotification()}_hideNotification(){this._currentTime&&this._clearTime(),this._toastOpened=!1,this.requestUpdate()}_clearTime(){clearTimeout(this._currentTime),this._currentTime=null}_computeIcon(e){return this.notificationIcons[e]||this.notificationIcons[this.defaultType]}_onNotificationClosed(e){e.stopPropagation(),this._showNextInStack()}_setCurrentNotification(){this._currentNotification={...this._defaultNotification,...this._stack.shift()}}_setNotificationDuration(){const{duration:e}=this._currentNotification;e>0&&(this._currentTime=setTimeout(this.clear.bind(this),e))}_hideOnEvent(e){this.clear(e.detail),e.stopPropagation(),e.stopImmediatePropagation(),e.preventDefault()}_showNotification(e){this.add(e.detail),e.stopPropagation(),e.stopImmediatePropagation(),e.preventDefault()}_showNextInStack(){this._stack.length>0&&!this._toastOpened&&(this._setCurrentNotification(),this._toastOpened=!0,this._setNotificationDuration(),this.requestUpdate())}add({description:e="",simpleLinkText:t,type:i=this.defaultType,duration:s=this.duration}={}){const a=i;this._stack.push({type:a,description:e,simpleLinkText:t,duration:s}),this._showNextInStack()}static get styles(){return[ga,m("bbva-notification-container-shared-styles")]}render(){return g`
      <bbva-notification-toast
        .id="toast_${this._uniqueId}"
        ?show="${this._toastOpened}"
        @click="${this._hideNotification}"
        type="${D(this._currentNotification.type)}"
        .iconExplainer="${this._computeIcon(this._currentNotification.type)}"
        @closed="${this._onNotificationClosed}"
        .simpleLinkText="${this._currentNotification.simpleLinkText}"
        .alertText="${D(this._currentNotification.description)}"
        ?fixed-bottom="${this.fixedBottom}"
        .ariaLiveText="${this.ariaLiveText}"
        .roleText="${this.roleText}"
      ></bbva-notification-toast>
    `}}var va=t`
:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-dark-mode-bg-color, var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${i(n.primaryCoreDarkened)})));
  color: var(--_text-color);
  position: var(--bbva-header-main-position, -webkit-sticky);
  position: var(--bbva-header-main-position, sticky);
  top: 0;
  z-index: var(--bbva-header-main-z-index, 1);
  padding: 0 0.25rem;
  --_bg-color-modal: var(--colorsPrimaryCore, ${i(n.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
  --_color-modal-three-level: var(--bbva-header-main-dark-mode-color-modal-three-level ,var(--colorsSecondary600, ${i(n.secondary600)}));
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${i(n.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${i(n.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
  --_text-color: var(--bbva-header-main-dark-mode-text-color ,var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)})));
  --_bg-color-modal: var(--colorsPrimaryCore, ${i(n.primaryCore)});
  --_header-main-active-icon-color: var(--bbva-header-main-dark-active-icon-color, var(--colorsPrimarySubduedLight, ${i(n.primarySubduedLight)}));
}
@supports (padding-top: env(safe-area-inset-top)) {
  :host {
    --safe-area-inset-top: env(safe-area-inset-top);
    padding-top: var(--safe-area-inset-top, 0);
  }
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

:host([position=fixed]) {
  --bbva-header-main-position: fixed;
  width: 100%;
  left: 0;
  right: 0;
}

.header-main {
  display: flex;
  justify-content: space-between;
  align-items: center;
  position: relative;
  padding-top: var(--bbva-header-main-padding-top, 0);
  margin: 0 auto;
  min-height: var(--bbva-header-main-min-height, 3rem);
  max-width: var(--bbva-header-main-max-width, 100%);
}
.header-main .icon {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  border: none;
  background: none;
  width: var(--bbva-header-main-width, 3rem);
  min-height: var(--bbva-header-main-min-height, 3rem);
  padding: 0;
  color: inherit;
  margin: 0;
  cursor: pointer;
}
.header-main .header-icons {
  display: flex;
  flex: none;
}
.header-main .header-icons.half-space {
  min-width: 2.875rem;
}
.header-main .header-icons.full-space {
  min-width: 5.75rem;
}
.header-main .header-icons.right-group .icon.primary, .header-main .header-icons.right-group .icon.secondary {
  margin-left: auto;
}
.header-main .header-icons.right-group .icon.primary:active [data-tag-name=bbva-icon], .header-main .header-icons.right-group .icon.secondary:active [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_header-main-active-icon-color);
}
.header-main .header-icons.left-group .icon.primary:active [data-tag-name=bbva-icon], .header-main .header-icons.left-group .icon.secondary:active [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_header-main-active-icon-color);
}
.header-main .header-icons .text-icon {
  width: 100%;
  padding-top: 0.125rem;
}
.header-main .heading-wrapper {
  display: flex;
  justify-content: center;
  align-items: center;
  top: var(--bbva-header-main-text-top, var(--bbva-header-main-padding-top, 0));
  left: 0;
  width: 100%;
  height: var(--bbva-header-main-min-height, 3rem);
  margin: 0;
  overflow: hidden;
  text-align: center;
  font-size: var(--bbva-header-main-text-font-size, var(--typographyTypeMedium, ${i(s.typeMedium)}));
  line-height: var(--bbva-header-main-text-line-height, 3rem);
  font-weight: 400;
  min-width: 0;
}
.header-main .heading-wrapper.image {
  display: flex;
  justify-content: center;
  align-items: center;
}
.header-main .heading-wrapper.image #image {
  max-height: -webkit-fill-available;
}
.header-main .heading-wrapper .microillustration {
  width: 3rem;
  height: 3rem;
}
.header-main .heading-wrapper .text-wrapper {
  padding: 0 0.3125rem;
  min-width: 0;
}
.header-main .heading-wrapper svg {
  max-height: 100%;
  padding: 0.3125rem;
}

:host([variant*=modal]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-modal, var(--_bg-color-modal));
}

:host([variant*=modal-three-level]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-modal-three-level, var(--_bg-color-modal-three-level));
  color: var(--_color-modal-three-level);
}
:host([variant*=modal-three-level]) .header-main .heading-wrapper .text-wrapper {
  color: var(--_color-modal-three-level);
}
:host([variant*=modal-three-level]) .header-main .header-icons .text-icon {
  color: var(--_color-modal-three-level);
}

:host([variant*=process]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-process, var(--_bg-color-process));
}

:host([variant*=sign]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-sign, var(--_bg-color-sign));
}

:host([variant*=transparent]) {
  background-color: var(--_bg-color-transparent);
}

:host([show-text-icon]) .header-main {
  min-height: var(--bbva-header-main-min-height, 3.5rem);
}
:host([show-text-icon]) .header-main .icon {
  min-height: var(--bbva-header-main-min-height, 3.5rem);
}
:host([show-text-icon]) .header-main .heading-wrapper {
  height: var(--bbva-header-main-min-height, 3.5rem);
}

@supports (padding-top: env(safe-area-inset-top)) {
  :host([variant*=notch-top]) {
    --safe-area-inset-top: env(safe-area-inset-top);
    padding-top: var(--safe-area-inset-top, 0);
  }
}
`;class ya extends(l(oe(c(h)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":u,"bbva-icon":p,"bbva-badge-notification":ne}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const e={1:"half-space",2:"full-space"},t=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,i=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,s=Math.max(t,i);return s in e?e[s]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[va,m("bbva-header-main-shared-styles"),le("button:focus"),T.dark]}static toCamelCase(e){return(e.charAt(0).toUpperCase()+e.slice(1)).replace(/([-_][a-z])/gi,(e=>e.toUpperCase().replace("-","").replace("_","")))}_icon(e){return g`<bbva-icon icon="${D(this[e])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(e){return g`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right-header"
      variant="alert"
    >
      ${this._icon(e)}
    </bbva-badge-notification>`}_tplButton(e,t,i,s){const a=ya.toCamelCase(e),r=`icon${a}`,o=`accessibilityTextIcon${a}`;return g`<button
      class="${t}"
      id="btn-${e}"
      aria-label="${D(this.t(this[o]))}"
      aria-expanded=${D(s)}
      ?hidden="${!this[r]}"
      @click="${()=>this._headerIconClick(e)}"
    >
      ${"left-primary"===e&&this.notificationText?this._badgeNotification(r):this._icon(r)}
      ${this.showTextIcon?this._textIcon(i):""}
    </button>`}_textIcon(e){return g` <bbva-text
      unset
      ambient="dark"
      ellipsis
      class="text-icon"
      size="3XS"
      tag="span"
      alignment="center"
      .text="${D(this.t(e))}"
    >
    </bbva-text>`}_tplHeading(e){return g`
      <bbva-text
        unset
        ambient="dark"
        ellipsis
        class="text-wrapper"
        id="text"
        tag="span"
        alignment="center"
        .text="${this.t(e)}"
      >
      </bbva-text>
    `}render(){const{_availableHeadingSpace:e,_hasImage:t,text:i,image:s,_hasMicroillustration:a}=this;return g`
      <header class="header-main">
        <div class="header-icons ${e} left-group" data-id="iconsLeft">
          ${this._tplButton("left-primary","icon primary",this.textIconLeftPrimary?this.textIconLeftPrimary:this.accessibilityTextIconLeftPrimary)}
          ${this._tplButton("left-secondary","icon secondary",this.textIconLeftSecondary?this.textIconLeftSecondary:this.accessibilityTextIconLeftSecondary)}
        </div>

        <h1
          class="heading-wrapper ${t}"
          id="heading"
          aria-label=${(a||s)&&this.accessibilityTextImage?this.t(this.accessibilityTextImage):this.t(i)}
          tabindex="-1"
        >
          ${i&&" "!==i&&this._tplHeading(i)||""}
          <img src="${D(s)}" alt="" ?hidden="${!s}" id="image" aria-hidden="true" />

          <span
            class="${a}"
            ?hidden="${!a}"
            aria-hidden="true"
          >
            ${this.microillustration}
          </span>
        </h1>

        <div class="header-icons ${e} right-group" data-id="iconsRight">
          ${this._tplButton("right-secondary","icon secondary",this.textIconRightSecondary?this.textIconRightSecondary:this.accessibilityTextIconRightSecondary)}
          ${this._tplButton("right-primary","icon primary",this.textIconRightPrimary?this.textIconRightPrimary:this.accessibilityTextIconRightPrimary,this.iconRightPrimaryExpanded)}
        </div>
      </header>
    `}_headerIconClick(e){this.dispatchEvent(new CustomEvent(`header-main-icon-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}}b("colors.primaryCoreLightened"),b("colors.cool80"),b("colors.cool70"),b("colors.primaryCoreLightened"),b("colors.cool100"),b("colors.tertiaryType6Darkened"),b("colors.tertiaryType4Darkened"),b("colors.secondary300");const fa=de((e=>class extends(y(e)){static configurationScopedElements(){return[ba,he,ya,pe]}static get properties(){return{config:{type:Object},_showNotifyTop:{type:Boolean}}}constructor(){super(),this.config={header:!1,back:!0,fixedHeader:!1,loader:!1,notify:!1,notifyTop:!1,notifyFeature:!1,smartAssistant:!1,faqs:!1},this._showNotifyTop=!1,this._boundBackHandler=this._back.bind(this),this._fixedHeaderStyles="position: sticky; top: 0; left: 0; width: 100%; z-index: var(--bbva-header-main-z-index, 1);"}firstUpdated(){this.config={...this.config,back:!Object.prototype.hasOwnProperty.call(this.config,"back")||this.config.back}}get _headerStyles(){return this.config.header&&this.config.fixedHeader?this._fixedHeaderStyles:""}_tpl(e,t){const i=`_${e}`;return this[i]||(this[i]=document.createElement(e)),"object"==typeof t&&Object.keys(t).forEach((e=>{"@"===e[0]?this[i].addEventListener(e.substring(1),t[e]):this[i][e]=t[e]})),this._setPrimaryLeftIcon(e,i),this._setSecondaryRightIcon(e,i),g`${this[i]}`}_back(){this._dispatchCustomEvent("navigation-go-back")}_setPrimaryLeftIcon(e,t){if(this.config.header&&e===this.getScopedTagName("bbva-header-main")&&this.config.back){this[t].iconLeftPrimary=this.config.header.iconLeftPrimary||ue();const e="@header-main-icon-left-primary-click",i=this.config.header[e]?this.config.header[e]:this._boundBackHandler;this[t].removeEventListener("header-main-icon-left-primary-click",i),this[t].addEventListener("header-main-icon-left-primary-click",i)}}_setSecondaryRightIcon(e,t){this.config.header&&e===this.getScopedTagName("bbva-header-main")&&(this[t].iconRightSecondary=this[t].iconRightSecondary||this.config.smartAssistant&&k()||this.config.faqs&&I())}_dispatchCustomEvent(e,t=!0,i=!0,s=!0){this.dispatchEvent(new CustomEvent(e,{bubbles:i,composed:s,detail:t,cancelable:!0}))}showLoader(e="full",t=!1,i=!1){const s={variant:e,showSpinnerMessageLabel:t,loginAnimation:i};this._dispatchCustomEvent("show-loader",s)}clearLoader(){this._dispatchCustomEvent("hide-loader")}showNotify(e,t,i,s){const a={description:e,simpleLinkText:t,type:i,duration:s};this._dispatchCustomEvent("show-notification",a)}clearNotify(){this._dispatchCustomEvent("hide-notification")}showNotifyTop({text:e="",status:t=""}={}){this.config.notifyTop={...this.config.notifyTop,text:e,status:t},this._showNotifyTop=!0}clearNotifyTop(){this._showNotifyTop=!1}renderNotify(){var e,t,i;return g`
          ${null!==(e=this.config)&&void 0!==e&&e.notify||null!==(t=this.config)&&void 0!==t&&t.notifyFeature?this._tpl(this.getScopedTagName("bbva-notification-container"),{fixedBottom:null===(i=this.config)||void 0===i?void 0:i.notifyFeature,...this.config.notify}):null}
        `}_getElements(){var e,t,i,s;return{[this.getScopedTagName("bbva-notification-status")]:{config:{...this.config.notifyTop,hide:!this._showNotifyTop},condition:(null===(e=this.config)||void 0===e?void 0:e.notifyTop)||(null===(t=this.config)||void 0===t?void 0:t.notifyFeature)},[this.getScopedTagName("bbva-progress-content")]:{config:this.config.loader,condition:null===(i=this.config)||void 0===i?void 0:i.loader},[this.getScopedTagName("bbva-header-main")]:{config:this.config.header,condition:null===(s=this.config)||void 0===s?void 0:s.header}}}render(){const e=this._getElements();return g`
          <section style="${this._headerStyles}">
            ${Object.keys(e).map((t=>e[t].condition?this._tpl(t,e[t].config):null))}
            <slot name="customHeaderContainer"></slot>
          </section>
          ${this.renderNotify()}
        `}}));var _a=t`:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

:host {
  display: block;
  box-sizing: border-box;
  --bbva-help-modal-padding: 0;
}

.order-online-components {
  display: flex;
  justify-content: space-between;
}

.summary-list {
  width: 90%;
}

.privacy-info-description {
  margin-top: 1rem;
}

.summary-description {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: 1.5rem 0 0.5rem;
  transform: translateZ(0.000625rem);
  position: fixed;
  left: 0;
  bottom: 0;
  background-color: var(--crane-generate-reports-multistep-modal-dark-mode-summary-bg-color, var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)}));
  padding-bottom: 1rem;
}
.summary-description [data-tag-name=bbva-text] {
  right: 1.5rem;
  padding-left: 1rem;
  padding-right: 1rem;
}

[data-tag-name=bbva-button-modal] {
  margin-bottom: 1rem;
}

.container {
  margin-left: 1rem;
  margin-right: 1rem;
}

.remove-overflow {
  overflow: hidden;
}

[data-tag-name=bbva-progress-multistep-bar] {
  z-index: 2;
  position: sticky;
  top: 0;
  right: 0;
  left: 0;
  display: block;
  height: 0.5rem;
}

.location-step {
  height: auto;
}
.location-step #step-1[completed] {
  position: absolute;
  height: 100%;
}
.location-step #step-1[completed] .content {
  pointer-events: none;
}

:has(#step-2) #step-1[completed] {
  position: inherit;
  height: initial;
}

.services-step {
  height: auto;
  position: absolute;
}

[data-tag-name=bbva-expandable-multistep] {
  position: fixed;
  height: auto;
  width: 100%;
}
`,Sa=t`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-map-static] {
  width: 100vw;
}

[data-tag-name=bbva-button-default] {
  position: fixed;
  margin-bottom: 0.3125rem;
}

.order-column-components {
  display: flex;
  flex-direction: column;
  align-items: center;
  flex: 1 1 auto;
}

.order-column-components-hidde {
  display: none;
  flex-direction: column;
  align-items: center;
  flex: 1 1 auto;
}

.footer-button-complete {
  margin-top: auto;
  width: 100%;
  display: flex;
  justify-content: end;
  flex-direction: column;
  align-items: center;
}

.order-template {
  height: 80vh;
  display: flex;
  flex-direction: column;
}
`;let $a=class e extends(y(fa(f(c(h))))){static get is(){return"report-location-step"}static get scopedElements(){const t=[hs,P,ge,...e.configurationScopedElements()];return e.scopedElementsFromClasses(t)}static get properties(){return{apiKey:{type:String,attribute:"api-key"},isLoading:{type:Boolean,attribute:"is-loading"},staticLocationMessage:{type:String,attribute:"static-location-message",reflect:!0},staticLocation:{type:Object,attribute:"static-location"}}}constructor(){super(),this.apiKey="",this.isLoading=!1,this.staticLocationMessage="",this.staticLocation={}}static get styles(){return[Sa,ds.light,M.light,be.light,m("report-location-step-shared-styles")]}_showDynamicMapModal(){this._dispatchCustomEvent("emergency-crane-vehicle-reports-report-location-step-link-dynamic-map-modal-open")}get _buildFooterButton(){return g`
      <div class="footer-button-complete">
        <bbva-button-default
          ?disabled="${this.isLoading}"
          aria-label="${this.t("emergency-crane-vehicle-reports-accessibility-location-footer-button")}"
          @click="${()=>this._dispatchCustomEvent("complete")}"
        >
          ${this.t("emergency-crane-vehicle-reports-continue-footer-button")}
        </bbva-button-default>
      </div>
    `}get _buildCraneLocationTemplate(){return g`
      <div class="order-template">
        ${this._staticMapUI} ${this._buildFooterButton}
      </div>
    `}get _staticMapUI(){return g`
      <div class="order-column-components">
        <bbva-map-static
          disabled-tabindex
          api-key="${this.apiKey}"
          message="${this.staticLocationMessage}"
          .location="${this.staticLocation}"
          .loading="${this.isLoading}"
        >
        </bbva-map-static>
        <bbva-link
          ambient="light"
          aria-label="${this.t("emergency-crane-vehicle-reports-change-location")}"
          @click="${this._showDynamicMapModal}"
        >
          ${this.t("emergency-crane-vehicle-reports-change-location")}
        </bbva-link>
      </div>
    `}render(){return g`
      ${this._buildCraneLocationTemplate}
    `}};const xa=new r;var Ca=t`:host {
  box-sizing: border-box;
  display: flex;
  min-height: 1rem;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
  --_notification-help-icon-color: var(--bbva-notification-help-dark-mode-icon-color, var(--bbva-notification-help-icon-color, var(--colorsPrimaryCoreDark, ${i(n.primaryCoreDark)})));
  --_notification-help-text-color: var(--bbva-notification-help-dark-mode-text-color, var(--bbva-notification-help-text-color, var(--colorsSecondary500, ${i(n.secondary500)})));
  --_notification-help-icon-color-alert: var(--bbva-notification-help-dark-mode-icon-color-alert, var(--bbva-notification-help-icon-color-alert, var(--colorsTertiaryType1Dark, ${i(n.tertiaryType1Dark)})));
  --_notification-help-text-color-alert: var(--bbva-notification-help-dark-mode-text-color-alert, var(--bbva-notification-help-text-color-alert, var(--colorsSecondary600, ${i(n.secondary600)})));
  --_notification-help-icon-color-success: var(--bbva-notification-help-dark-mode-icon-color-success, var(--bbva-notification-help-icon-color-success, var(--colorsTertiaryType6Dark, ${i(n.tertiaryType6Dark)})));
  --_notification-help-text-color-success: var(--bbva-notification-help-dark-mode-text-color-success, var(--bbva-notification-help-text-color-success, var(--colorsSecondary500, ${i(n.secondary500)})));
  --skeleton-quote-color: var(--bbva-notification-help-dark-mode-skeleton-quote-color, var(--bbva-notification-help-skeleton-color, var(--colorsSecondary200, ${i(n.secondary200)})));
  --skeleton-quote-bg: var(--bbva-notification-help-dark-mode-skeleton-bg, var(--bbva-notification-help-skeleton-bg, transparent));
}

:host([hidden]),
[hidden] {
  display: none !important;
}

:host([hide-top-padding]) {
  padding-top: 0;
}

:host([hide-bottom-padding]) {
  padding-bottom: 0;
}

:host([hide-left-padding]) {
  padding-left: 0;
}

:host([hide-right-padding]) {
  padding-right: 0;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.accessible-hide {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
}

[data-tag-name=bbva-icon] {
  color: var(--_notification-help-icon-color);
  flex-shrink: 0;
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color);
  font-size: var(--bbva-notification-help-text-font-size, var(--typographyType3XSmall, ${i(s.type3XSmall)}));
  line-height: var(--bbva-notification-help-text-line-height, var(--lineHeightType3XSmall, ${i(a.type3XSmall)}));
  margin: 0;
}

:host(.alert) [data-tag-name=bbva-icon] {
  color: var(--_notification-help-icon-color-alert);
}
:host(.alert) [data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color-alert);
}

:host(.success) [data-tag-name=bbva-icon] {
  color: var(--_notification-help-icon-color-success);
}
:host(.success) [data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color-success);
}

:host([loading]) {
  position: relative;
  top: 0;
  left: 0;
  display: inline-flex;
  width: 100%;
  pointer-events: none;
  background-repeat: no-repeat;
  will-change: transform;
  transform: opacity;
  animation: pulse 2s ease-in-out infinite;
  background-image: linear-gradient(var(--skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: 16px 16px, calc((80px * 2) + (16px/ 2)) 16px;
  background-position: 0 0, 20px 0;
}
:host([loading]) > :nth-child(n) {
  opacity: 0;
}

@keyframes pulse {
  0% {
    filter: opacity(100%);
  }
  50% {
    filter: opacity(60%);
  }
  100% {
    filter: opacity(100%);
  }
}
${xa.mediaRules()}`;var Ta=t`[ambient^=light] {
  --bbva-notification-help-icon-color: initial;
  --bbva-notification-help-text-color: initial;
  --bbva-notification-help-icon-color-alert: initial;
  --bbva-notification-help-text-color-alert: initial;
  --bbva-notification-help-icon-color-success: initial;
  --bbva-notification-help-text-color-success: initial;
  --bbva-notification-help-skeleton-color: initial;
}
${(new r).mediaRules()}`;const ka=new r;const Ia={dark:t`
    ${t`[ambient^=dark] {
  --bbva-notification-help-icon-color: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
  --bbva-notification-help-text-color: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
  --bbva-notification-help-icon-color-alert: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
  --bbva-notification-help-text-color-alert: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
  --bbva-notification-help-icon-color-success: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
  --bbva-notification-help-text-color-success: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
  --bbva-notification-help-skeleton-color: var(--colorsPrimaryCoreLight, ${i(n.primaryCoreLight)});
}
${ka.mediaRules()}`}
  `,light:t`
    ${Ta}
  `};let Ea=class extends(l(c(d(h)))){static get is(){return"bbva-notification-help"}static get scopedElements(){return{"bbva-icon":p,"bbva-text":u}}static get properties(){return{accessibilityLabelIcon:{type:String,attribute:"accessibility-label-icon"},icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},text:{type:String},loading:{type:Boolean,reflect:!0},hideTopPadding:{type:Boolean,attribute:"hide-top-padding"},hideBottomPadding:{type:Boolean,attribute:"hide-bottom-padding"},hideLeftPadding:{type:Boolean,attribute:"hide-left-padding"},hideRightPadding:{type:Boolean,attribute:"hide-right-padding"}}}constructor(){super(),this.accessibilityLabelIcon="",this.icon="",this.iconSize=16,this.text="",this.loading=!1,this.hideTopPadding=!1,this.hideBottomPadding=!1,this.hideRightPadding=!1,this.hideLeftPadding=!1}static get styles(){return[super.styles,Ca,Ia.dark,Ia.light,m("bbva-notification-help-shared-styles")]}render(){return g`
      <span class="accessible-hide" ?hidden="${!this.accessibilityLabelIcon}"
        >${this.accessibilityLabelIcon}</span
      >

      <bbva-icon aria-hidden="true" .icon="${this.icon}" .size="${this.iconSize}"> </bbva-icon>

      <bbva-text text=${this.text} unset></bbva-text>
    `}};b("colors.primarySubduedLight"),b("colors.cool20"),b("colors.tertiaryType1Light"),b("colors.primaryCoreLightened"),b("colors.tertiaryType6Light"),b("colors.cool20"),b("colors.cool50");const wa=new r;var Ra=t`:host {
  --_form-radio-group-help-icon-color: var(--bbva-form-radio-group-dark-mode-help-icon-color, var(--bbva-form-radio-group-help-icon-color, var(--colorsPrimaryMedium, ${i(n.primaryMedium)})));
  --_form-radio-group-help-icon-active-color: var(--bbva-form-radio-group-dark-mode-help-icon-active-color, var(--bbva-form-radio-group-help-icon-active-color, var(--colorsPrimaryCore, ${i(n.primaryCore)})));
  --_form-radio-group-label-out-color: var(--bbva-form-radio-group-dark-mode-label-out-color, var(--bbva-form-radio-group-label-out-color, var(--colorsSecondary600, ${i(n.secondary600)})));
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

[data-tag-name=bbva-notification-help] {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}

.label-out {
  display: flex;
  align-items: center;
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}

.label-out-text {
  font-weight: var(--typographyTypeMedium, ${i(s.typeMedium)});
  color: var(--_form-radio-group-label-out-color);
}

[data-tag-name=bbva-link] {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
  --bbva-link-with-icon-icon-color: var(--_form-radio-group-help-icon-color);
  --bbva-link-active-with-icon-icon-color: var(--_form-radio-group-help-icon-active-color);
}

:host([two-option]) {
  font-size: 0;
  position: relative;
  word-spacing: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}
:host([two-option]) .label-out {
  font-size: initial;
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
  word-spacing: initial;
}
:host([two-option]) ::slotted(*) {
  display: inline-block;
  font-size: initial;
  word-spacing: initial;
}
${wa.mediaRules()}`;const Ma=new r;var La=t`[ambient^=dark] {
  --bbva-form-radio-group-help-icon-color: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
  --bbva-form-radio-group-help-icon-active-color: var(--colorsPrimarySubduedLight, ${i(n.primarySubduedLight)});
  --bbva-form-radio-group-label-out-color: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
}

[ambient=dark400] {
  --bbva-form-radio-group-help-icon-color: var(--colorsPrimarySubdued, ${i(n.primarySubdued)});
  --bbva-form-radio-group-help-icon-active-color: var(--colorsPrimaryMediumLight, ${i(n.primaryMediumLight)});
}
${Ma.mediaRules()}`;var Pa=t`[ambient^=light] {
  --bbva-form-radio-help-icon-color: initial;
  --bbva-form-radio-help-icon-active-color: initial;
  --bbva-form-radio-group-label-out-color: initial;
}
${(new r).mediaRules()}`;const Aa={dark:t`
    ${La}
    ${It.dark}
    ${M.dark}
    ${Ia.dark}
    ${T.dark}
  `,light:t`
    ${Pa}
    ${It.light}
    ${M.light}
    ${Ia.light}
    ${T.light}
  `};let Da=class extends(l(c(L(h)))){static get is(){return"bbva-form-radio-group"}static get scopedElements(){return{"bbva-form-radio-button":Et,"bbva-notification-help":Ea,"bbva-text":u,"bbva-link":P}}static get properties(){return{name:{type:String,reflect:!0},items:{type:Array},selected:{type:Number,reflect:!0},readonly:{type:Boolean},required:{type:Boolean},disabled:{type:Boolean},invalid:{type:Boolean,reflect:!0},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},twoOption:{type:String,reflect:!0,attribute:"two-option"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},labelOut:{type:String,attribute:"label-out"},helpIcon:{type:Boolean,attribute:"help-icon"},optionalLabel:{type:String,attribute:"optional-label"},linkHref:{type:String,attribute:"link-href"},linkAccessibilityText:{type:String,attribute:"link-accessibility-text"}}}constructor(){super(),this.items=[],this.selected=-1,this.errorIcon=A(),this.errorIconSize=16,this.infoIcon=w(),this.infoIconSize=16,this.name=`form-radio-group-${((e=10)=>`${Math.random().toString(36).substr(2,e)}`)()}`,this.optionalLabel="bbva-form-radio-group-optional-label",this.linkAccessibilityText="bbva-form-radio-group-link-accessibility-text"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.getAttribute("role")||this.setAttribute("role","radiogroup"),this.addEventListener("slotschanges",(e=>this._setRadioName(e)))}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("slotschanges",this._setRadioName())}_setRadioName(e){(((e||{}).detail||{}).contentSlots||[]).forEach((e=>{const t=(e||{}).assignedNodes;"bbva-form-radio-button"===(t.getAttribute("data-tag-name")||(t||{}).nodeName).toLowerCase()&&(t.name=this.name)}))}get radioItems(){return Array.from(this.querySelectorAll('[data-tag-name="bbva-form-radio-button"]'))}firstUpdated(e){super.firstUpdated&&super.firstUpdated(e),this._itemsContainer=this.shadowRoot.querySelector(".form-radio-group-container"),this._itemsContainer&&this.appendChild(this._itemsContainer.content),this.addEventListener("change",(e=>this._updateItems(e)))}updated(e){if(super.updated&&super.updated(e),e.has("selected")&&this.radioItems.length)if(Number.isFinite(this.selected)&&this.selected>-1&&this.selected<this.radioItems.length)this.radioItems[this.selected].checked=!0;else{const e=this.radioItems.find((e=>e.checked));e&&(e.checked=!1)}e.has("disabled")&&this.radioItems.length&&(this.setAttribute("aria-disabled",this.disabled.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].disabled=this.disabled}))),e.has("invalid")&&this.radioItems.length&&(this.setAttribute("aria-invalid",this.invalid.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].invalid=this.invalid}))),e.has("readonly")&&this.radioItems.length&&(this.setAttribute("aria-readonly",this.readonly.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].readonly=this.readonly}))),e.has("required")&&this.radioItems.length&&(this.setAttribute("aria-required",this.required.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].required=!1})),this.radioItems[0].required=!0)}_updateItems(e){const t=this.radioItems.indexOf(e.target);this.selected=t,this.invalid=!1,this.dispatchEvent(new CustomEvent("form-radio-group-item-change",{detail:{value:e.target.value,selected:t},bubbles:!0,composed:!0}))}_helpClicked(e){e.stopPropagation(),this.dispatchEvent(new CustomEvent("bbva-form-radio-group-help-click",{detail:!0,bubbles:!0,composed:!0}))}get _helpIcon(){return this.helpIcon?g`
        <bbva-link
          aria-label="${this.t(this.linkAccessibilityText)}"
          icon-size="24"
          @click="${this._helpClicked}"
          href="${D(this.linkHref)}"
          icon="${I()}"
        >
        </bbva-link>
      `:""}get _labelOut(){if(this.labelOut){const e=this.t(this.labelOut);return g`
        <div class="label-out">
          <bbva-text
            id="labelOutText"
            unset
            class="label-out-text"
            text="${this.required?e:`${e} ${this.t(this.optionalLabel)}`}"
            size="S"
          >
          </bbva-text>
          ${this._helpIcon}
        </div>
      `}return""}static get styles(){return[Ra,m("bbva-form-radio-group-shared-styles"),Aa.dark,Aa.light]}render(){return g`
      ${this._labelOut}
      <slot></slot>
      <template class="form-radio-group-container">
        ${this.items.map((e=>g`
            <bbva-form-radio-button
              .name="${this.name}"
              .value="${e.value}"
              label="${e.label}"
              divider="${D(e.divider)}"
              ?disabled="${e.disabled}"
              ?checked="${e.checked}"
              ?required="${e.required}"
              ?label-medium="${e.labelMedium}"
              .errorIcon="${this.errorIcon}"
              .errorIconSize="${this.errorIconSize}"
              .errorMessage="${e.invalid?e.errorMessage:""}"
              .infoIcon="${this.infoIcon}"
              .infoIconSize="${this.infoIconSize}"
              .infoMessage="${e.infoMessage}"
              accessibility-icon-info-notification="${D(e.accessibilityIconInfo)}"
              accessibility-icon-alert-notification="${D(e.accessibilityIconAlert)}"
              variant="${D(e.variant)}"
            >
              ${e.text?O(e.text):e.label}
            </bbva-form-radio-button>
          `))}
      </template>
      ${this.invalid&&this.errorMessage?g`
            <bbva-notification-help
              class="alert"
              .icon="${this.errorIcon}"
              .iconSize="${this.errorIconSize}"
              .text="${this.errorMessage}"
              hide-top-padding
              hide-bottom-padding
              hide-left-padding
              hide-right-padding
            ></bbva-notification-help>
          `:""}
    `}};b("colors.primarySubdued"),b("colors.primaryMediumLight"),b("colors.primaryCoreLightened");var Oa=t`.order-left-text {
  text-align: left;
}

.order-online-elements {
  display: flex;
}
.order-online-elements [data-tag-name=bbva-form-radio-button] {
  margin-left: 2.8125rem;
}
.order-online-elements [data-tag-name=bbva-form-radio-button]:nth-child(1) {
  margin-left: 0;
}

.footer-button {
  margin-top: auto;
  width: 100%;
  display: flex;
  justify-content: center;
}

.main-container {
  height: 80vh;
  display: flex;
  flex-direction: column;
}
.main-container [data-tag-name=bbva-text] {
  font-weight: unset;
}

[data-tag-name=bbva-notification-message] {
  margin-top: 1.5rem;
}

[data-tag-name=bbva-button-default] {
  margin-bottom: 0.3125rem;
}
`;let Na=class e extends(y(fa(f(c(h))))){static get is(){return"emergency-services-step"}static get scopedElements(){const t=[ge,u,Da,Te,...e.configurationScopedElements()];return e.scopedElementsFromClasses(t)}static get properties(){return{disableButton:{type:Boolean,attribute:"disable-button"},craneReportAnswer:{type:Object,attribute:"crane-report-answer"},resetEmergencyServices:{type:Boolean,attribute:"reset-emergency-services"}}}constructor(){super(),this.disableButton=!1,this.craneReportAnswer={},this.resetEmergencyServices=!1}updated(e){super.updated(e),e.has("resetEmergencyServices")&&this._resetEmergencyServicesStep()}static get styles(){return[Oa,be.light,T.light,Aa.light,m("emergency-services-step-shared-styles")]}get _optionsArea(){return[{text:`${this.t("emergency-crane-vehicle-reports-positive-option-service-answers")}`,infoMessage:`${this.t("emergency-crane-vehicle-reports-open-area-message")}`,value:"true"},{text:`${this.t("emergency-crane-vehicle-reports-negative-option-service-answers")}`,infoMessage:`${this.t("emergency-crane-vehicle-reports-close-area-message")}`,value:"false"}]}_handleSelectedRadioButton(e){const{detail:t}=e,{value:i}=t;this.disableButton=t,this.craneReportAnswer=i}_resetEmergencyServicesStep(){this.craneReportAnswer={},this.disableButton=!1}get _buildFooterButton(){return g`
      <div class="footer-button">
        <bbva-button-default
          aria-label="${this.t("emergency-crane-vehicle-reports-accessibility-button-emergency-services")}"
          ?disabled="${!this.disableButton}"
          @click="${()=>{this._dispatchCustomEvent("complete"),this.disableButton&&this._dispatchCustomEvent("emergency-crane-vehicle-reports-emergency-services-select",this.craneReportAnswer)}}"
        >
          ${this.t("emergency-crane-vehicle-reports-button-text-services-answers")}
        </bbva-button-default>
      </div>
    `}get _buildEmergencyServicesFormTemplate(){return g`
      <div class="main-container" ambient="light">
        ${this._buildQuestionSection({text:"emergency-crane-vehicle-reports-emergency-services-zone-question",id:"zone"})}
        ${this._buildFooterButton}
      </div>
    `}_buildQuestionSection(e,t){return g`
      <bbva-text text="${this.t(e.text)}" size="M" font-weight="500"> </bbva-text>
      <div
        class="order-left-text"
        @form-radio-group-item-change="${this._handleSelectedRadioButton}"
      >
        <bbva-form-radio-group
          selected="${t}"
          selectedname="${e.id}"
          name="choice"
          .items="${this._optionsArea}"
          required=""
        >
        </bbva-form-radio-group>
        <div ambient="light" slot="slot-content" class="notification-message">
          <bbva-notification-message
            message="${this.t("emergency-crane-vehicle-reports-notification-message")}"
          ></bbva-notification-message>
        </div>
      </div>
    `}render(){return g`
      ${this._buildEmergencyServicesFormTemplate}
    `}};var qa=t`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.slot-change-location {
  height: 100%;
  text-align: initial;
}
.slot-change-location > [data-tag-name=bbva-map-dynamic] {
  height: 100%;
  text-align: left;
}
`;let Va=class e extends(y(c(f(fa(h))))){static get is(){return"change-report-location-modal"}static get scopedElements(){const t=[ve,u,Bt,...e.configurationScopedElements()];return e.scopedElementsFromClasses(t)}static get properties(){return{apiKey:{type:String,attribute:"api-key"},geoLocation:{type:Object,attribute:"geo-location"},visible:{type:Boolean}}}constructor(){super(),this.apiKey="",this.geoLocation={},this.visible=!1}static get styles(){return[qa,T.light,Ht.light]}_handleCloseModal(e){e.stopImmediatePropagation();const{type:t}=e,i=t.split("-").splice(2,3).join("-");"help-modal-header-right-primary-click"===t&&this._dispatchCustomEvent("emergency-crane-vehicle-reports-change-location-modal-close-click"),"footer-button-click"===i&&this._dispatchCustomEvent(`emergency-crane-vehicle-reports-change-location-modal-${i}`)}_handleModalState(e){const{detail:{visible:t},target:i}=e;this.dispatchEvent(new CustomEvent("emergency-crane-vehicle-reports-modal-state-change",{bubbles:!0,composed:!0,detail:{visible:t,target:i,mode:"reportChangeLocation"}}))}render(){return g`
      <bbva-help-modal
        id="change-report-location-modal"
        fixed-footer
        full-height
        body-text=""
        hide-content-padding-top
        ?visible="${this.visible}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        header-text="${this.t("emergency-crane-vehicle-reports-change-location")}"
        button-text="${this.t("emergency-crane-vehicle-reports-accept-footer-button")}"
        accessibility-text-icon-right-primary="${this.t("emergency-vehicle-crane-accessibility-close-change-location-modal")}"
        aria-label="${this.t("emergency-vehicle-crane-accessibility-modal",{modalTitle:"change-report-location"})}"
        @help-modal-header-right-primary-click="${this._handleCloseModal}"
        @help-modal-footer-button-click="${this._handleCloseModal}"
        @modal-state-change="${this._handleModalState}"
      >
        <div slot="slot-content" class="slot-change-location" ambient="light">
          <bbva-map-dynamic
            hidden-large-button
            is-draggable-pin
            hide-map-info-footer
            show-predictive
            variant="large"
            optional-input-label=""
            .geoLocation="${this.geoLocation}"
            .label="${this.t("emergency-crane-vehicle-reports-change-location-search-input")}"
            api-key="${this.apiKey}"
            predictive-info-message="${this.t("emergency-crane-vehicle-reports-predictive-info-message")}"
            @map-dynamic-map-ready="${()=>{this._dispatchCustomEvent("emergency-crane-vehicle-reports-change-report-location-modal-map-ready")}}"
          >
          </bbva-map-dynamic>
        </div>
      </bbva-help-modal>
    `}};class Ba extends(y(fa(f(c(h))))){static get is(){return"crane-generate-reports-multistep-modal"}static get scopedElements(){const e=[ve,fe,ge,u,P,_e,ye,$a,Na,Va,...Ba.configurationScopedElements()];return Ba.scopedElementsFromClasses(e)}static get properties(){return{addressComponents:{type:Object,attribute:"address-components"},apiKey:{type:String,attribute:"api-key"},dataModal:{type:Object,attribute:"data-modal"},geoLocation:{type:Object,attribute:"geo-location"},headerTitle:{type:String,attribute:"header-title"},hideProgressMulti:{type:Boolean,attribute:"hide-progress-multi"},infoModal:{type:Object,attribute:"info-modal"},mapDynamicVisible:{type:Boolean,attribute:"map-dynamic-visible"},multiStepConfiguration:{type:Object,attribute:"multistep-configuration"},multistepState:{type:Object,attribute:"multistep-state"},pdfDocument:{type:String,attribute:"pdf-document"},privacyDescription:{type:String,attribute:"privacy-description"},privacyLinkText:{type:String,attribute:"privacy-link-text"},progressMultistepValue:{type:Number,attribute:"progress-multistep-bar"},showHelpFaqs:{type:Boolean,attribute:"show-help-faqs"},showNoticeOfPrivacy:{type:Boolean,attribute:"show-notice-of-privacy"},staticAddress:{type:String,attribute:"static-address"},viewInfoModal:{type:Boolean,attribute:"view-info-modal"},visible:{type:Boolean},resetEmergencyServicesStep:{type:Boolean,attribute:"reset-emergency-services-step"},emergencyServicesAnswer:{type:Boolean,attribute:"emergency-services-answer"},_mapReady:{type:Boolean,state:!0},_newGeoLocation:{type:Object,state:!0},_newStaticAddress:{type:String,state:!0},_staticGeolocation:{type:Object,state:!0},_stepsToReset:{type:Array,state:!0}}}constructor(){super(),this.addressComponents={},this.apiKey="",this.dataModal={},this.geoLocation={},this.headerTitle="",this.hideProgressMulti=!1,this.infoModal={},this.mapDynamicVisible=!1,this.multiStepConfiguration={},this.multistepState={},this.pdfDocument="",this.privacyDescription="",this.privacyLinkText="",this.progressMultistepValue=0,this.showHelpFaqs=!1,this.showNoticeOfPrivacy=!1,this.staticAddress="",this.viewInfoModal=!1,this.visible=!1,this.resetEmergencyServicesStep=!1,this.emergencyServicesAnswer=!1,this._mapReady=!1,this._newStaticAddress="",this._staticGeolocation={},this._stepsToReset=[]}updated(e){super.updated(e),e.has("geoLocation")&&this._mapReady&&this._setNewLocation(),e.has("visible")&&this.visible&&(this._steps[0].active&&this._manageStateOfModals("reportLocationStep"),this._manageDynamicMapRequest()),e.has("infoModal")&&(this.progressMultistepValue=100/this._steps.length),e.has("visible")&&this.restoreMultistepState&&this._resetSteps()}shouldUpdate(e){if(super.shouldUpdate(e),e.has("geoLocation")){if(this.viewInfoModal)return!1;const t=e.get("geoLocation");if(!t)return!0;const{lat:i,lng:s}=t;if(i===this.geoLocation.lat&&s===this.geoLocation.lng)return!1}return!0}static get styles(){return[_a,be.light,T.light,T.dark,M.light,Ne.light,m("crane-generate-reports-multistep-modal-shared-styles")]}async _checkStepsState(){await this.updateComplete;let e=0;return this._steps.forEach((t=>{t.completed&&(e+=1)})),e===this._steps.length}async _manageStepsState({target:e}){"HELP_SHOW_QUESTIONS"===this.infoModal.flowType&&(this._steps[1].removeAttribute("hidden"),this._steps[0].removeAttribute("hidden"));const t={reportLocationStep:1,emergencyServicesStep:2}[e.id];this.progressMultistepValue=100/this._steps.length*(t+1),this.showNoticeOfPrivacy=await this._checkStepsState(),this.hideProgressMulti=await this._checkStepsState(),this.multistepState={...this.multistepState,[e.id]:!0,showPrivacyPanel:this.showNoticeOfPrivacy,hideProgress:this.hideProgressMulti,geolocation:{coords:this._staticGeolocation,message:this.staticAddress},barProgress:this.progressMultistepValue},this._steps.length>1?this._dispatchCustomEvent("emergency-crane-vehicle-reports-multistep-modal-multistep-update-state",{key:"multistep",data:this.multistepState,step1:this._steps[0].active,step2:this._steps[1].active}):this._dispatchCustomEvent("emergency-crane-vehicle-reports-multistep-modal-multistep-update-state",{key:"multistep",data:this.multistepState,step1:this._steps[0].active})}async _manageEditSteps(e){var t,i;"HELP_SHOW_QUESTIONS"===(null===(t=this.infoModal)||void 0===t?void 0:t.flowType)&&1===e?(this._steps[0].removeAttribute("hidden"),this._steps[1].setAttribute("hidden","true")):"HELP_SHOW_QUESTIONS"===(null===(i=this.infoModal)||void 0===i?void 0:i.flowType)&&2===e&&(this._steps[1].removeAttribute("hidden"),this._steps[0].setAttribute("hidden","true"));let s={};const a={"step-1":"reportLocationStep","step-2":"emergencyServicesStep"};this.progressMultistepValue=100/this._steps.length*e,this.showNoticeOfPrivacy=await this._checkStepsState(),this.hideProgressMulti=await this._checkStepsState();for(let e=0;e<this._steps.length;e+=1){const t=this._steps[e].id;s={...s,[a[t]]:this._steps[e].completed}}this.multistepState={...this.multistepState,...s,showPrivacyPanel:this.showNoticeOfPrivacy,hideProgress:this.hideProgressMulti,barProgress:this.progressMultistepValue},this._steps.length>1?this._dispatchCustomEvent("emergency-crane-vehicle-reports-multistep-modal-multistep-update-state",{key:"multistep",data:this.multistepState,step1:this._steps[0].active,step2:this._steps[1].active}):this._dispatchCustomEvent("emergency-crane-vehicle-reports-multistep-modal-multistep-update-state",{key:"multistep",data:this.multistepState,step1:this._steps[0].active})}async _setNewLocation(){await this.updateComplete,this._staticGeolocation={latitude:this.geoLocation.lat,longitude:this.geoLocation.lng},this._newGeoLocation={...this.geoLocation},this._dispatchCustomEvent("emergency-crane-vehicle-reports-multistep-modal-geolocation-change",this.geoLocation)}get _steps(){return this.shadowRoot.querySelectorAll('[data-tag-name="bbva-expandable-step"]')}_avoidChangeLocation(){this._newStaticAddress=this.staticAddress,this._newGeoLocation={...this.geoLocation}}_changeToNewLocation(){this.geoLocation={...this._newGeoLocation},this.staticAddress=this._newStaticAddress||this.staticAddress}_getNewAddress({detail:{address:e}}){this.mapDynamicVisible?this._newStaticAddress=null==e?void 0:e.formatted_address:this.staticAddress=null==e?void 0:e.formatted_address;const t={route:{label:"route",uses:"long_name"},street_number:{label:"strNumber",uses:"long_name"},locality:{label:"city",uses:"long_name"},postal_code:{label:"postalCode",uses:"long_name"},country:{label:"country",uses:"short_name"}};let i={};for(const s of e.address_components||[]){const e=s.types.find((e=>t[e]));e&&(i={...i,[t[e].label]:s[t[e].uses]})}this.addressComponents={...i}}_getWebCurrentPosition(){navigator.geolocation.getCurrentPosition((e=>{this.mapDynamicVisible?this._newGeoLocation={lat:e.coords.latitude,lng:e.coords.longitude}:this.geoLocation={lat:e.coords.latitude,lng:e.coords.longitude}}),(e=>{this._dispatchCustomEvent("emergency-crane-vehicle-reports-multistep-modal-geolocation-error",{code:e.code,message:e.message})}),{enableHighAccuracy:!0,timeout:5e3,maximumAge:0})}_handleLeaveReport(e){var t;null!==(t=this.multistepState)&&void 0!==t&&t.reportLocationStep?(e.stopPropagation(),this._dispatchCustomEvent("emergency-crane-vehicle-reports-multistep-modal-leave-prevent")):(e.stopPropagation(),this._dispatchCustomEvent("emergency-crane-vehicle-reports-multistep-modal-close-click"))}_handleRaiseReport(){var e;this._dispatchCustomEvent("emergency-crane-vehicle-reports-multistep-modal-new-report-create",{flowType:null===(e=this.infoModal)||void 0===e?void 0:e.flowType,geolocation:this.geoLocation,fullAddress:this.staticAddress,composedAddress:this.addressComponents,assistsSelected:this.headerTitle}),this.visible=!1}_helpFaqs(e){e.stopImmediatePropagation(),this._dispatchCustomEvent("emergency-crane-vehicle-reports-"+(this.showHelpFaqs?"show-faqs":"help-click"))}_manageDynamicMapRequest(){this.native?this._dispatchCustomEvent("emergency-crane-vehicle-reports-multistep-modal-native-geolocation-request"):this._getWebCurrentPosition()}_manageState(e){const{target:t,detail:i}=e,s=null==i?void 0:i.visible,a=t.getAttribute("data-tag-name"),r={"change-report-location-modal":e=>{this.mapDynamicVisible=e},"bbva-help-modal":()=>{this.visible=s}};a in r&&r[`${a}`](i)}_manageStateOfModals(e){this.dispatchEvent(new CustomEvent("emergency-crane-vehicle-reports-modal-state-change",{bubbles:!0,composed:!0,detail:{visible:!0,mode:e}}))}_renderSteps(){var e;return"HELP_SHOW_QUESTIONS"===(null===(e=this.infoModal)||void 0===e?void 0:e.flowType)?this._buildLocationServicesAndEmergencyDetailsSteps:this._buildMultistepReport}_resetFeature(e){"close"===e.detail.status&&(this.showNoticeOfPrivacy=!1,this._resetSteps(),this._dispatchCustomEvent("emergency-crane-vehicle-reports-change-report-location-modal-map-ready",!0))}_resetSteps(){var e;this._stepsToReset=[0],this.multistepState={},this._restoreStepsInfo(),this._steps[0].active=!0,this._steps[0].completed=!1,this._steps[0].disabled=!1,"HELP_SHOW_QUESTIONS"===(null===(e=this.infoModal)||void 0===e?void 0:e.flowType)&&(this._steps[1].active=!0,this._steps[1].completed=!1,this._steps[1].disabled=!1,this._steps[0].removeAttribute("hidden"),this._steps[1].setAttribute("hidden","true"),this.progressMultistepValue=100/this._steps.length)}_restoreStepsInfo(){const{showPrivacyPanel:e,hideProgress:t,geolocation:i,barProgress:s}=this.multistepState;this.showNoticeOfPrivacy=e,this.hideProgressMulti=t,this._staticGeolocation=null==i?void 0:i.coords,this.staticAddress=null==i?void 0:i.message,this.progressMultistepValue=s}_setGeoLocation({detail:{geoLocation:e}}){this._newGeoLocation={...e}}_showNoticeOfPrivacy(){var e;let t,i;null!==(e=this.multiStepConfiguration)&&void 0!==e&&e.privacyTermsPdf?(t="emergency-crane-vehicle-reports-multistep-modal-notice-of-privacy-pdf-open",i=this.pdfDocument):(t="emergency-crane-vehicle-reports-multistep-modal-notice-of-privacy-modal-open",i=!0),this._dispatchCustomEvent(t,i)}get _buildChangeReportLocationModal(){return g`
      <change-report-location-modal
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        api-key="${this.apiKey}"
        ?visible="${this.mapDynamicVisible}"
        .geoLocation="${this._newGeoLocation}"
        @emergency-crane-vehicle-reports-change-report-location-modal-map-ready="${()=>{this._mapReady=!0,this._setNewLocation()}}"
        @emergency-crane-vehicle-reports-change-location-modal-close-click="${this._avoidChangeLocation}"
        @map-dynamic-geolocation-request="${this._manageDynamicMapRequest}"
        @map-dynamic-address-changed="${this._getNewAddress}"
        @map-dynamic-geolocation-changed="${this._setGeoLocation}"
        @emergency-crane-vehicle-reports-change-location-modal-footer-button-click="${this._changeToNewLocation}"
        @visible-changed="${this._manageState}"
      >
      </change-report-location-modal>
    `}get _buildEmergencyServicesStep(){return g`
      <div class="services-step">
        <bbva-expandable-step
          ambient="light"
          class="animation remove-overflow"
          id="step-2"
          step="1"
          total-steps="${this._steps.length}"
          disabled-target=".action"
          data-selector="step"
          current-step-label="${this.t("emergency-crane-vehicle-reports-location-step-header-index",{currentStep:2,totalSteps:this._steps.length})}"
          header="${this.t("emergency-crane-vehicle-reports-step-header")}"
          edit-label="${this.t("emergency-crane-vehicle-reports-edit-step-link")}"
          hide-padding-left
          hide-padding-right
          hide-padding-top
          @complete="${this._manageStepsState}"
          @expandable-step-edit-step="${()=>{this._manageEditSteps(2)}}"
          @emergency-crane-vehicle-reports-emergency-services-select="${({detail:e})=>{this.emergencyServicesAnswer=e}}"
        >
          <div class="content container">
            <emergency-services-step
              id="emergencyServicesStep"
              ?reset-emergency-services="${this.resetEmergencyServicesStep}"
            >
            </emergency-services-step>
          </div>
          <div class="summary" slot="summary" ambient="dark">
            ${this._buildEmergencyServicesSummarySec}
          </div>
        </bbva-expandable-step>
      </div>
    `}get _buildEmergencyServicesSummarySec(){return g`
      <div class="order-online-components container">
        <bbva-text
          class="summary-list"
          text="${this.t("emergency-crane-vehicle-reports-emergency-services-zone-question")}"
          size="S"
          inherit
        >
        </bbva-text>
        <bbva-text text="${"true"===this.emergencyServicesAnswer?"emergency-crane-vehicle-reports-positive-option-service-answers":"emergency-crane-vehicle-reports-negative-option-service-answers"}" size="S" inherit>
        </bbva-text>
      </div>
      </div>
    `}get _multistepProgress(){return g`
      <bbva-progress-multistep-bar
        accessibility-text="${this.t("emergency-crane-vehicle-reports-accessibility-progress-bar")}"
        ambient="light"
        ?hidden=${this.hideProgressMulti}
        no-margin
        value="${this.progressMultistepValue}"
      >
      </bbva-progress-multistep-bar>
    `}get _buildLocationServicesAndEmergencyDetailsSteps(){return g`
      <bbva-expandable-multistep
        ambient="light"
        hide-guillotine-animation
        hide-disabled-steps
        step-selector="[data-selector=step]"
        class="scrollable"
        scrolling-delay="600"
        scroll-animation-completed="600"
        .stepsToReset="${this._stepsToReset}"
        .finishAnimationStep="${500}"
      >
        ${this._buildLocationReportStep} ${this._buildEmergencyServicesStep}
        ${this.showNoticeOfPrivacy?this._buildPrivacyInfo:E}
      </bbva-expandable-multistep>
    `}get _buildLocationReportStep(){return g`
      <div class="location-step">
        <bbva-expandable-step
          class="animation remove-overflow"
          id="step-1"
          step="0"
          total-steps="${this._steps.length}"
          disabled-target=".action"
          data-selector="step"
          current-step-label="${this.t("emergency-crane-vehicle-reports-location-step-header-index",{currentStep:1,totalSteps:this._steps.length})}"
          header="${this.t("emergency-crane-vehicle-reports-location-step-header-main")}"
          edit-label="${this.t("emergency-crane-vehicle-reports-edit-step-link")}"
          hide-padding-left
          hide-padding-right
          hide-padding-top
          @complete="${this._manageStepsState}"
          @expandable-step-edit-step="${()=>{this._manageEditSteps(1)}}"
          @emergency-crane-vehicle-reports-report-location-step-link-dynamic-map-modal-open="${()=>{this.mapDynamicVisible=!0}}"
        >
          <div class="content">
            <report-location-step
              ambient="light"
              .staticLocation="${this._staticGeolocation}"
              id="reportLocationStep"
              api-key="${this.apiKey}"
              ?is-loading="${!this.staticAddress}"
              static-location-message="${this.staticAddress}"
            >
            </report-location-step>
          </div>
          <div
            class="summary container"
            tabindex="-1"
            aria-hidden="true"
            slot="summary"
            ambient="dark"
          >
            <bbva-text inherit text="${this.staticAddress}" size="S"></bbva-text>
          </div>
        </bbva-expandable-step>
      </div>
    `}get _buildMultistepModal(){return g`
      <bbva-help-modal
        id="emergency-crane-multistep-modal"
        header-text="${this.t(this.headerTitle)}"
        header-type="modal"
        accessibility-text-icon-right-primary="${this.t("emergency-crane-vehicle-reports-accessibility-close-header-main")}"
        accessibility-text-icon-right-secondary="${this.t("emergency-crane-vehicle-reports-accessibility-secondary-header-main")}"
        aria-label="${this.t("emergency-crane-vehicle-reports-accessibility-modal-text-aria-label",{modalTitle:this.headerTitle})}"
        icon-right-secondary="${I()}"
        ?visible="${this.visible}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        full-height
        hide-content-padding-top
        @modal-state-change="${this._manageState}"
        @header-main-icon-right-primary-click="${this._handleLeaveReport}"
        @header-main-icon-right-secondary-click="${this._helpFaqs}"
        @help-modal-close="${this._resetFeature}"
        .closeModalElements="${[]}"
      >
        <div slot="slot-content" ambient="light">
          ${this._multistepProgress} ${this._renderSteps()}
        </div>
      </bbva-help-modal>
    `}get _buildMultistepReport(){return g`
      <bbva-expandable-multistep
        hide-guillotine-animation
        hide-disabled-steps
        has-animation
        step-selector="[data-selector=step]"
        class="scrollable"
        scrolling-delay="600"
        scroll-animation-completed="600"
        .stepsToReset="${this._stepsToReset}"
        .finishAnimationStep=${500}
        .minStepHeight=${"296px"}
        ambient="light"
      >
        ${this._buildLocationReportStep}
        ${this.showNoticeOfPrivacy?this._buildPrivacyInfo:E}
      </bbva-expandable-multistep>
    `}get _buildPrivacyInfo(){return g`
      <div
        ambient="light"
        class="${qe({"summary-description":this.showNoticeOfPrivacy})}"
      >
        <bbva-button-default
          @click="${this._handleRaiseReport}"
          aria-label="${this.t("emergency-crane-vehicle-reports-accessibility-contract-insurance")}"
          ?hidden="${!this.showNoticeOfPrivacy}"
          variant="positive"
          active
        >
          ${this.t("emergency-crane-vehicle-reports-to-report-insurance")}
        </bbva-button-default>
        <bbva-text
          class="privacy-info-description container"
          alignment="center"
          tag="span"
          text="${this.t(this.privacyDescription?this.privacyDescription:"emergency-crane-vehicle-reports-modal-privacy-description")}"
          size="M"
        >
        </bbva-text>
        <bbva-link @click="${this._showNoticeOfPrivacy}">
          ${this.t(this.privacyLinkText||"emergency-crane-vehicle-reports-notice-of-privacy-header")}
        </bbva-link>
      </div>
    `}render(){return g`
      ${this._buildMultistepModal} ${this._buildChangeReportLocationModal}
    `}}class Ha extends(y(c(f(fa(h))))){static get is(){return"emergency-crane-vehicle-reports-dm"}static get scopedElements(){const e=[jt,ni,Ye];return Ha.scopedElementsFromClasses(e)}static get properties(){return{appSettingsApiVersion:{type:String,attribute:"app-settings-api-version"},fieldsProperty:{type:String,attribute:"fields-property"},lossesReportRequestApiVersion:{type:String,attribute:"losses-report-requests-api-version"},productTypeVehicleInsurance:{type:String,attribute:"product-type-vehicle-insurance"},publicSettings:{type:Array,attribute:"public-settings"},publicSettingsId:{type:String,attribute:"public-settings-id"},publicSettingsKey:{type:String,attribute:"public-settings-key"},requestServices:{type:Boolean,attribute:"request-services"},subProductType:{type:String,attribute:"sub-product-type"},vehicleInsuranceId:{type:String,attribute:"vehicle-insurance-id"},vehicleInsuranceApiVersion:{type:String,attribute:"vehicle-insurance-api-version"},vehicleInsurance:{type:Object,attribute:"vehicle-insurance"},_addressComponents:{type:Object,state:!0}}}constructor(){super(),this.appSettingsApiVersion="0",this.fieldsProperty="",this.lossesReportRequestApiVersion="0",this.productTypeVehicleInsurance="",this.publicSettings=[],this.publicSettingsId="",this.publicSettingsKey="",this.requestServices=!1,this.subProductType="",this.vehicleInsuranceId="",this.vehicleInsuranceApiVersion="0",this.vehicleInsurance={},this._addressComponents={}}firstUpdated(){this._getDms(),this.requestServices||(super.firstUpdated(),this.getVehicleInsuranceDm(),this.getPublicSettingsDm())}updated(e){super.updated(e);const t=e.has("publicSettings")||e.has("vehicleInsurance"),i=this.publicSettings.length||Object.keys(this.vehicleInsurance).length;t&&i&&(this.getPublicSettingsDm(),this.getVehicleInsuranceDm())}static _getTime(e){var t,i;const s=null==e||null===(t=e.callTimeout)||void 0===t?void 0:t.isActive,a=null==e||null===(i=e.callTimeout)||void 0===i?void 0:i.time,[r,o]=a.split(":"),n=6e4*r+o/60*6e4;return{callTimeoutActivate:s,callTimeout:n,halfTimeout:n/2}}createReport(e){var t,i,s,a,r,o,n,l,c;const{flowType:d}=e,h="HELP_SHOW_QUESTIONS"===d,{geolocation:p,composedAddress:u,fullAddress:m}=e,g=`${null==u?void 0:u.route} ${u}?.strNumber}`;let b=[];b="NO_FULL_ADDRESS"===this._addressComponents?[{name:null==u?void 0:u.country,componentTypes:["COUNTRY"]},{name:null==u?void 0:u.postalCode,componentTypes:["POSTAL_CODE"]},{name:null==u?void 0:u.city,componentTypes:["CITY"]},{name:g,componentTypes:["ADDRESS"]}]:[{name:m,componentTypes:["FULL_ADDRESS"],code:null==u?void 0:u.country}];const v={policy:{id:null===(t=this._vehicleDetails)||void 0===t?void 0:t.id,certificateNumber:(null===(i=this._vehicleDetails)||void 0===i?void 0:i.certificateNumber)||""},requestType:{id:"NEW",lossDetail:{vehicle:{licensePlate:null===(s=this._vehicleDetails)||void 0===s?void 0:s.licencePlate,brand:{id:null===(a=this._vehicleDetails)||void 0===a?void 0:a.brandId,name:null===(r=this._vehicleDetails)||void 0===r?void 0:r.brandName},subBrand:{id:null===(o=this._vehicleDetails)||void 0===o?void 0:o.subBrandId,name:null===(n=this._vehicleDetails)||void 0===n?void 0:n.subBrandName},vehicleType:{id:null===(l=this._vehicleDetails)||void 0===l?void 0:l.vehicleTypeId,name:null===(c=this._vehicleDetails)||void 0===c?void 0:c.vehicleTypeName}},addresses:[{location:{addressComponents:b}}],...h&&{quiz:{isPublicZone:!0}},geolocation:{latitude:null==p?void 0:p.lat.toString(),longitude:null==p?void 0:p.lng.toString()},serviceSpecificLosses:[{id:"CRANE",eventType:"CLAIMS"}]}}};this._lossesReportRequestsDm.postLossesReportRequests(v)}getPublicSettingsDm(){Object.keys(this.publicSettings).length?(this._publicSettingsDm.publicSettings=this.publicSettings,this._setPublicSettingsResponse()):this._publicSettingsDm.getPublicSettings(this.publicSettingsId,{key:this.publicSettingsKey})}getVehicleInsuranceDm(){Object.keys(this.vehicleInsurance).length?(this._vehicleInsuranceDm.vehicleInsurance=this.vehicleInsurance,this._setVehicleInsuranceResponse()):this._vehicleInsuranceDm.getVehicleInsurance(this.vehicleInsuranceId,{fields:this.fieldsProperty})}_getConfigProducts(e,t,i){const{contentFragmentPath:s}=t,{geolocation:a,selectionType:r,helpDescription:o,flowType:n}=e,{geolocation:l}=e;this._addressComponents=l,this._callTimeout=Ha._getTime(e),this._dispatchCustomEvent("emergency-crane-vehicle-reports-dm-modal-create-report",{aemHost:i,selectionType:r,geolocation:a,helpDescription:o,flowType:n,contentFragmentPath:s,time:this._callTimeout})}_getDms(){this._publicSettingsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-public-settings-api-dm"]'),this._vehicleInsuranceDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-vehicle-insurance-api-dm"]'),this._lossesReportRequestsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-losses-report-requests-api-dm"]')}_handleErrorResponsePostLossesReport({detail:e}){const{messages:t}=e,[i]=t,{code:s}=i;"alreadyRequested"===s&&this._dispatchCustomEvent("emergency-crane-vehicle-reports-dm-modal-already-exists"),"alreadyRequested"!==s&&""!==s&&this._dispatchCustomEvent("emergency-crane-vehicle-reports-dm-modal-communication-fail")}_handleErrorResponse(){this._dispatchCustomEvent("emergency-crane-vehicle-reports-dm-api-dm-error")}_setPublicSettingsResponse(e){var t;const i=((null==e?void 0:e.detail)||(null===(t=this.publicSettings)||void 0===t?void 0:t.detail)||this.publicSettings).find((e=>e.key===this.publicSettingsKey)),s=JSON.parse(null==i?void 0:i.value);this._settingsEmergencyReports(s)}_settingsEmergencyReports({data:e}){const t=null==e?void 0:e.hostAEM,i=null==e?void 0:e.emergencies.filter((e=>(null==e?void 0:e.productType)===this.productTypeVehicleInsurance)).find((e=>(null==e?void 0:e.flowSubProductType)===this.subProductType)),s=null==i?void 0:i.emergency.find((e=>"CRANE"===e.id));this._getConfigProducts(s,i,t)}_setVehicleInsuranceResponse(e){var t,i,s,a,r,o,n,l,c,d,h;const p=(null==e?void 0:e.detail)||(null===(t=this.vehicleInsurance)||void 0===t?void 0:t.detail)||this.vehicleInsurance,{vehicle:u,id:m,certificateNumber:g}=p;this._vehicleDetails={id:m,certificateNumber:g,licencePlate:(null==u?void 0:u.licencePlate)||"",brandId:null==u||null===(i=u.model)||void 0===i||null===(s=i.brand)||void 0===s?void 0:s.id,brandName:null==u||null===(a=u.model)||void 0===a||null===(r=a.brand)||void 0===r?void 0:r.name,subBrandId:null==u||null===(o=u.model)||void 0===o||null===(n=o.subBrand)||void 0===n?void 0:n.id,subBrandName:null==u||null===(l=u.model)||void 0===l||null===(c=l.subBrand)||void 0===c?void 0:c.name,vehicleTypeId:null==u||null===(d=u.vehicleType)||void 0===d?void 0:d.id,vehicleTypeName:null==u||null===(h=u.vehicleType)||void 0===h?void 0:h.name},this._dispatchCustomEvent("emergency-crane-vehicle-reports-dm-holder-data-send",{policyNumber:null==p?void 0:p.policyNumber})}_setLossesReportRequests({detail:e}){this._dispatchCustomEvent("emergency-crane-vehicle-reports-dm-generate-losses-report-success",e)}get _tplDms(){return g`
      <bbva-global-public-settings-api-dm
        version="${this.appSettingsApiVersion}"
        ?native="${this.native}"
        host="${this.host}"
        .requiredToken="${this.requiredToken}"
        .publicSettingsHost="${this.publicSettingsHost}"
        .publicSettingsRequiredToken="${this.publicSettingsRequiredToken}"
        @public-settings-api-dm-fetch="${this._setPublicSettingsResponse}"
        @public-settings-api-dm-fetch-error="${this._handleErrorResponse}"
        @api-dm-error="${this._handleErrorResponse}"
      ></bbva-global-public-settings-api-dm>
      <bbva-global-vehicle-insurance-api-dm
        version="${this.vehicleInsuranceApiVersion}"
        ?native="${this.native}"
        host="${this.host}"
        .requiredToken="${this.requiredToken}"
        @vehicle-insurance-api-dm-fetch="${this._setVehicleInsuranceResponse}"
        @vehicle-insurance-api-dm-fetch-error="${this._handleErrorResponse}"
        @api-dm-error="${this._handleErrorResponse}"
      ></bbva-global-vehicle-insurance-api-dm>
      <bbva-global-losses-report-requests-api-dm
        version="${this.lossesReportRequestApiVersion}"
        ?native="${this.native}"
        host="${this.host}"
        .requiredToken="${this.requiredToken}"
        @losses-report-requests-api-dm-create="${this._setLossesReportRequests}"
        @losses-report-requests-api-dm-create-error="${this._handleErrorResponsePostLossesReport}"
        @api-dm-error="${this._handleErrorResponse}"
      ></bbva-global-losses-report-requests-api-dm>
    `}render(){return g`
      ${this._tplDms}
    `}}var ja=t`:host {
  display: block;
  box-sizing: border-box;
  --bbva-help-modal-content-color: var(--colorsSecondary600, ${i(n.secondary600)});
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-clip-microillustration] {
  margin: 1rem;
}

.order-online-components {
  display: flex;
  justify-content: space-between;
  margin-bottom: 1rem;
}

.hour-text {
  display: inline-block;
  font-size: var(--typographyTypeSmall, ${i(s.typeSmall)});
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${i(v.medium.italicFontStyle)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${i(v.medium.fontWeight)});
}
`;class Fa extends(y(c(f(fa(h))))){static get is(){return"crane-info-modal"}static get scopedElements(){const e=[ve,Rt,P,u,$e,V,Ce,...Fa.configurationScopedElements()];return Fa.scopedElementsFromClasses(e)}static get properties(){return{configInfoModal:{type:Object,attribute:"config-info-modal"},visible:{type:Boolean}}}constructor(){super(),this.configInfoModal={},this.visible=!1}static get styles(){return[ja,Mt.light,M.light,T.light,xe.light,ke.light,Se.light,m("crane-info-modal-shared-styles")]}get _buildDynamicSuccessReceipt(){const e=Object.keys(this.configInfoModal);return Je(e,(e=>e.id),(e=>e in this._dynamicTemplates?this._dynamicTemplates[e]:E))}get _buildMicroillustrationPanel(){var e,t,i,s,a,r;return g`
      <bbva-clip-microillustration
        disabled-tabindex
        microillustration="${null===(e=this.configInfoModal)||void 0===e||null===(t=e.panel)||void 0===t?void 0:t.microillustration}"
        size="L"
        role="presentation"
      >
      </bbva-clip-microillustration>
      <bbva-text
        font-weight="500"
        inherit
        size="L"
        alignment="center"
        text="${this.t(`${null===(i=this.configInfoModal)||void 0===i||null===(s=i.panel)||void 0===s?void 0:s.heading}`)}"
      >
      </bbva-text>
      <bbva-text
        size="S"
        alignment="center"
        text="${this.t(`${null===(a=this.configInfoModal)||void 0===a||null===(r=a.panel)||void 0===r?void 0:r.description}`)}"
      >
      </bbva-text>
    `}get _buildListDetails(){var e;return g`
      <div slot="slot-content" ambient="light">
        ${Je(null===(e=this.configInfoModal)||void 0===e?void 0:e.listDetails,(e=>e.id),(e=>g`
            <div class="order-online-components">
              <bbva-text text="${this.t(`${e.detail}`)}" size="S" inherit> </bbva-text>
              ${"date"===e.id?g`
                    <div>
                      <bbva-date
                        date="${this.t(`${null==e?void 0:e.description}`)}"
                        options='{"day":"2-digit","month":"long","year":"numeric","hour":"2-digit","minute":"2-digit","hour12":false}'
                        clockSuffix
                      >
                      </bbva-date>
                      <bbva-text
                        class="hour-text"
                        text="${this.t("emergency-crane-vehicle-reports-hour-text-receipt")}"
                        inherit
                      >
                      </bbva-text>
                    </div>
                  `:g`
                    <bbva-text
                      alignment="right"
                      text="${this.t(`${null==e?void 0:e.description}`)}"
                      size="S"
                      font-weight="500"
                      inherit
                    >
                    </bbva-text>
                  `}
            </div>
          `))}
      </div>
    `}get _buildPanelText(){var e,t,i,s;return g`
      <div slot="slot-content" ambient="light">
        <bbva-text
          alignment="center"
          text="${this.t(`${null===(e=this.configInfoModal)||void 0===e||null===(t=e.content)||void 0===t?void 0:t.firstParagraph}`)}"
          size="S"
        >
        </bbva-text>
        <bbva-text
          alignment="center"
          text="${this.t(`${null===(i=this.configInfoModal)||void 0===i||null===(s=i.content)||void 0===s?void 0:s.secondParagraph}`)}"
          size="S"
        >
        </bbva-text>
      </div>
    `}get _buildRowButtons(){return g`
      <div slot="slot-content" ambient="light">
        ${this._buttonRow}
      </div>
    `}get _buttonRow(){var e;return g`
      <bbva-button-row
        .options="${null===(e=this.configInfoModal)||void 0===e?void 0:e.options}"
        @button-row-item-click="${this._handleReceiptAction}"
        accessibility-text="${this.t("emergency-crane-vehicle-reports-accessibility-button-row")}"
      ></bbva-button-row>
    `}get _callLink(){var e;return g`
      <bbva-link
        @click="${this._handleClickOnCraneLine}"
        ?disabled="${null===(e=this.configInfoModal)||void 0===e?void 0:e.callLinkDisabled}"
      >
        ${this.t("emergency-crane-vehicle-reports-success-help-link-text-call")}
      </bbva-link>
    `}get _dynamicTemplates(){return{content:this._buildPanelText,panel:this._microillustrationImage,listDetails:this._buildListDetails,timeOutActive:this._timerSection,options:this._buildRowButtons}}get _progressTimer(){var e,t;return g`
      <bbva-progress-timer
        show-vertical
        disabled-tabindex
        timeout="${Number(null===(e=this.configInfoModal)||void 0===e?void 0:e.totalMinutes)}"
        time-alert="${Number(null===(t=this.configInfoModal)||void 0===t?void 0:t.halfMinutes)}"
        @progress-timer-counter-finish="${()=>{this.configInfoModal={...this.configInfoModal,callLinkDisabled:!1}}}"
      >
        <span>
          ${this.t("emergency-crane-vehicle-reports-timer-description-receipt")}
        </span>
      </bbva-progress-timer>
    `}get _microillustrationImage(){return g`
      <div slot="slot-content" ambient="light">
        ${this._buildMicroillustrationPanel}
      </div>
    `}get _timerSection(){return g`
      <div slot="slot-content" ambient="light">
        ${this._progressTimer} ${this._callLink}
      </div>
    `}_buildAccessibilityText(){var e,t;return null===(e=this.configInfoModal)||void 0===e||null===(t=e.id)||void 0===t?void 0:t.split("-").join(" ")}_headerLinkClick(){var e;this._dispatchCustomEvent(`${null===(e=this.configInfoModal)||void 0===e?void 0:e.eventName}-right-click`)}_handleButtonClick(e){var t,i,s;e.stopPropagation(),"error-location-half-modal"===(null===(t=this.configInfoModal)||void 0===t?void 0:t.id)&&this._dispatchCustomEvent("emergency-crane-vehicle-reports-info-modal-state-change",!1),this._dispatchCustomEvent(`${null===(i=this.configInfoModal)||void 0===i?void 0:i.eventName}-button-click`,(null===(s=this.configInfoModal)||void 0===s?void 0:s.number)||!0)}_handleClickOnCraneLine(){var e,t;this._dispatchCustomEvent(`${null===(e=this.configInfoModal)||void 0===e?void 0:e.eventName}-crane-line-call`,null===(t=this.configInfoModal)||void 0===t?void 0:t.number)}_handleLinkClick(e){var t,i;e.stopPropagation(),"error-location-half-modal"===(null===(t=this.configInfoModal)||void 0===t?void 0:t.id)&&(this._dispatchCustomEvent("emergency-crane-vehicle-reports-info-modal-state-change",!1),this._dispatchCustomEvent("emergency-crane-vehicle-reports-info-modal-veil-close",!1)),this._dispatchCustomEvent(`${null===(i=this.configInfoModal)||void 0===i?void 0:i.eventName}-link-click`)}_handleReceiptAction({detail:e}){var t;const i=null===(t=this.configInfoModal)||void 0===t?void 0:t.options[e];this._dispatchCustomEvent(`emergency-crane-vehicle-reports-ticket-${null==i?void 0:i.id}-click`,i.detail)}_handleVeilClick(e){var t;e.stopPropagation(),"error-location-half-modal"===(null===(t=this.configInfoModal)||void 0===t?void 0:t.id)&&(this._dispatchCustomEvent("emergency-crane-vehicle-reports-info-modal-state-change",!1),this._dispatchCustomEvent("emergency-crane-vehicle-reports-info-modal-veil-close",!1))}_identifyCurrentModalId(e){var t;const i=null===(t=this.configInfoModal)||void 0===t?void 0:t.id;this.dispatchEvent(new CustomEvent("emergency-crane-vehicle-reports-modal-state-change",{bubbles:!0,composed:!0,detail:{visible:e,mode:i}}))}_manageInfoModalState(e){const{detail:t}=e;this._dispatchCustomEvent("emergency-crane-vehicle-reports-info-modal-state-change",null==t?void 0:t.visible),this._identifyCurrentModalId(null==t?void 0:t.visible)}render(){var e,t,i,s,a,r,o,n,l,c,d,h,p,u;return g`
      <bbva-help-modal
        id="${null===(e=this.configInfoModal)||void 0===e?void 0:e.id}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ?hide-content-padding-top="${null===(t=this.configInfoModal)||void 0===t?void 0:t.hidePaddingTop}"
        ?fixed-footer="${null===(i=this.configInfoModal)||void 0===i?void 0:i.fixedFooter}"
        ?full-height="${null===(s=this.configInfoModal)||void 0===s?void 0:s.fullHeight}"
        ?visible="${this.visible}"
        header-text="${this.t(`${null===(a=this.configInfoModal)||void 0===a?void 0:a.modalHeader}`)}"
        header-type="${null===(r=this.configInfoModal)||void 0===r?void 0:r.headerType}"
        modal-type="${null===(o=this.configInfoModal)||void 0===o?void 0:o.modalType}"
        title-icon="${null===(n=this.configInfoModal)||void 0===n?void 0:n.icon}"
        body-text="${this.t(null===(l=this.configInfoModal)||void 0===l?void 0:l.bodyText)}"
        button-text="${this.t(`${null===(c=this.configInfoModal)||void 0===c?void 0:c.buttonText}`)}"
        link-text="${this.t(null===(d=this.configInfoModal)||void 0===d?void 0:d.linkText)}"
        title-text="${this.t((null===(h=this.configInfoModal)||void 0===h?void 0:h.titleText)||"")}"
        ambient="light"
        accessibility-text-icon-right-primary="${this.t("emergency-crane-vehicle-repors-accessibility-close-help-modal")}"
        aria-label="${this.t("emergency-crane-vehicle-reports-accessibility-modal-text-aria-label",{modalTitle:(null===(p=this.configInfoModal)||void 0===p?void 0:p.modalHeader)||this._buildAccessibilityText()})}"
        .closeModalElements="${null===(u=this.configInfoModal)||void 0===u?void 0:u.closeModalElements}"
        @modal-state-change="${this._manageInfoModalState}"
        @help-modal-veil-click="${this._handleVeilClick}"
        @help-modal-footer-button-click="${this._handleButtonClick}"
        @help-modal-footer-link-click="${this._handleLinkClick}"
        @header-main-icon-right-primary-click="${this._headerLinkClick}"
      >
        ${this._buildDynamicSuccessReceipt}
      </bbva-help-modal>
    `}}var za=t`:host {
  display: block;
  box-sizing: border-box;
  --bbva-transition-container-padding: 0;
  --bbva-transition-container-text-align: left;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=help-faqs-aem] {
  height: auto;
}

[data-tag-name=bbva-text] {
  position: absolute;
  margin-left: 4.25rem;
  bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1em);
  color: var(--colorsSecondary500, ${i(n.secondary500)});
  font-size: var(--fontSizeOptionsFontSize30, ${i(Ve.fontSize30)});
  font-style: normal;
  line-height: 1.5rem;
}

.container-telephone-icon {
  display: flex;
  align-items: center;
  justify-content: center;
  margin-left: 1rem;
  margin-top: 0.25rem;
  position: absolute;
  width: 2.5rem;
  height: 2.5rem;
  border-radius: 50%;
  color: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
  background: linear-gradient(to bottom right, var(--colorsPrimaryMedium, ${i(n.primaryMedium)}) 50%, var(--colorsPrimaryCoreLight, ${i(n.primaryCoreLight)}) 50%);
  transform: scale(1) translateZ(0);
}

[data-tag-name=bbva-link] {
  position: absolute;
  margin-left: 4.25rem;
  font-size: var(--fontSizeOptionsFontSize40, ${i(Ve.fontSize40)});
  font-style: normal;
  line-height: 1.5rem;
}

.container-telephone-icon::before {
  content: "";
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  border-radius: 50%;
  background-color: var(--colorsPrimaryCoreDark, ${i(n.primaryCoreDark)});
  opacity: 0;
  transition: opacity 0.1s ease-in-out;
}
.container-telephone-icon::before [data-tag-name=bbva-text] {
  background-color: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
}

.container-call-button {
  display: flex;
  margin-top: 1rem;
  margin-bottom: 1rem;
  width: 20rem;
  height: 3.5rem;
  flex-shrink: 0;
}
.container-call-button:active [data-tag-name=bbva-link] {
  color: var(--colorsPrimaryCore, ${i(n.primaryCore)});
}
.container-call-button:active [data-tag-name=bbva-icon] {
  z-index: 1;
}
.container-call-button:active .container-telephone-icon::before {
  opacity: 1;
}
`;class Ga extends(y(f(fa(c(h))))){static get is(){return"emergency-crane-vehicle-reports-faqs-menu"}static get scopedElements(){const e=[Vt,u,P,p,we,...Ga.configurationScopedElements()];return Ga.scopedElementsFromClasses(e)}static get properties(){return{faqsConfigurations:{type:Object,attribute:"faqs-configurations"},hideIconText:{type:Boolean,attribute:"hide-icon-text"},showHelpFaqs:{type:Boolean,attribute:"show-menu-faqs"},visibleDetail:{type:Boolean,attribute:"visible-detail"},_headingLevel:{type:Number,state:!0}}}constructor(){super(),this.faqsConfigurations={},this.hideIconText=!1,this.showHelpFaqs=!1,this.visibleDetail=!1,this._headingLevel=2}static get styles(){return[za,T.light,M.light,Be.light,m("emergency-crane-vehicle-reports-faqs-menu-shared-styles")]}_handleCloseModal(e){e.stopImmediatePropagation();const{type:t}=e;"header-main-icon-left-primary-click"===t&&this._dispatchCustomEvent("emergency-crane-vehicle-reports-faqs-menu-header-return")}_handleLinkClick(e){e.stopImmediatePropagation(),this._dispatchCustomEvent("emergency-crane-vehicle-reports-faqs-menu-help-faqs-aem-detail-link-click",e)}render(){var e,t,i;return g`
      <bbva-transition-container
        ?visible=${this.showHelpFaqs}
        accessibility-text-icon-left-primary="${this.t("emergency-crane-vehicle-reports-header-return")}"
        icon-left-primary="${ue()}"
        header-text="${this.t("emergency-crane-vehicle-reports-faqs-header-text")}"
        .closeModalElements="${["header-icon-left-primary"]}"
        @header-main-icon-left-primary-click="${this._handleCloseModal}"
      >
        <div slot="slot-content" ambient="light">
          <help-faqs-aem
            ?i-o-s-fixed-header="${this.iOSFixedHeader}"
            ?hide-icon-text="${this.hideIconText}"
            ?show-modal="${this.visibleDetail}"
            language="${this.language}"
            ?native="${this.native}"
            host="${null===(e=this.faqsConfigurations)||void 0===e?void 0:e.hostAEM}"
            content-fragment-path="${null===(t=this.faqsConfigurations)||void 0===t?void 0:t.contentFragmentPath}"
            hide-footer
            headingLevel="${this._headingLevel}"
            @help-faqs-aem-detail-link-click="${this._handleLinkClick}"
          ></help-faqs-aem>
          <div
            class="container-call-button"
            @click="${()=>{var e;this._dispatchCustomEvent("emergency-crane-vehicle-reports-faqs-menu-button-list-call-bbva-line",null===(e=this.faqsConfigurations)||void 0===e?void 0:e.phoneNumberBbvaLine)}}"
            @keydown="${e=>{var t;13===e.keyCode&&this._dispatchCustomEvent("emergency-crane-vehicle-reports-faqs-menu-button-list-call-bbva-line",null===(t=this.faqsConfigurations)||void 0===t?void 0:t.phoneNumberBbvaLine)}}"
          >
            <div class="container-telephone-icon">
              <bbva-icon icon="${z()}" size="24"> </bbva-icon>
            </div>
            <bbva-link unset>
              ${this.t("emergency-crane-vehicle-reports-detail-faqs-container-call-button")}
            </bbva-link>
            <bbva-text unset text="${this.t(null===(i=this.faqsConfigurations)||void 0===i?void 0:i.phoneNumberBbvaLine)}">
            </bbva-text>
          </div>
        </div>
      </bbva-transition-container>
    `}}const Ua=new r;var Ka=t`:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--emergency-crane-vehicle-reports-dark-mode-bg-color, var(--emergency-crane-vehicle-reports-bg-color, var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)})));
  height: 100%;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
${Ua.mediaRules()}`;class Xa extends(y(c(f(fa(h))))){static get is(){return"emergency-crane-vehicle-reports"}static get scopedElements(){const e=[Ha,Ba,Ga,Fa,...Xa.configurationScopedElements()];return Xa.scopedElementsFromClasses(e)}static get properties(){return{apiKey:{type:String,attribute:"api-key"},appSettingsApiVersion:{type:String,attribute:"app-settings-api-version"},faqsConfigurations:{type:Object,attribute:"faqs-configurations"},fieldsProperty:{type:String,attribute:"fields-property"},flowType:{type:String,attribute:"flow-type"},geoLocation:{type:Object,attribute:"geo-location"},hideIconText:{type:Boolean,attribute:"hide-icon-text"},lossesReportRequestApiVersion:{type:String,attribute:"losses-report-requests-api-version"},multiStepConfiguration:{type:Object,attribute:"multi-step-configuration"},multistepModalVisible:{type:Boolean,attribute:"multistep-modal-visible"},phoneNumberBbvaLineVehicle:{type:String,attribute:"phone-number-bbva-line-vehicle"},phoneNumberBbvaLine:{type:String,attribute:"phone-number-bbva-line"},privacyTermsPdf:{type:Boolean,attribute:"privacy-terms-pdf"},productTypeVehicleInsurance:{type:String,attribute:"product-type-vehicle-insurance"},publicSettings:{type:Array,attribute:"public-settings"},publicSettingsId:{type:String,attribute:"public-settings-id"},publicSettingsKey:{type:String,attribute:"public-settings-key"},requestServices:{type:Boolean,attribute:"request-services"},subProductType:{type:String,attribute:"sub-product-type"},ticketSharing:{type:String,attribute:"ticket-sharing"},vehicleInsuranceId:{type:String,attribute:"vehicle-insurance-id"},viewPolicy:{type:String,attribute:"view-policy"},viewPolicyVisible:{type:Boolean,attribute:"view-policy-visible"},vehicleInsurance:{type:Object,attribute:"vehicle-insurance"},viewCallVisible:{type:Boolean,attribute:"view-call-visible"},viewInfoModal:{type:Boolean,attribute:"view-info-modal"},pdfDocument:{type:String,attribute:"pdf-document"},showHelpFaqs:{type:Boolean,attribute:"show-help-faqs"},vehicleInsuranceApiVersion:{type:String,attribute:"vehicle-insurance-api-version"},_assistsSelected:{type:Array,state:!0},_configInfoModal:{type:Object,state:!0},_dataModal:{type:Object,state:!0},_infoModal:{type:Object,state:!0},_modalErrorGeneric:{type:Boolean,state:!0},_multistepState:{type:Boolean,state:!0},_timeOutData:{type:Object,state:!0},_viewMenuFaqs:{type:Boolean,state:!0}}}constructor(){super(),this.config={loader:!0},this.host="",this.requiredToken="",this.apiKey="",this.appSettingsApiVersion="0",this.faqsConfigurations={},this.fieldsProperty="",this.flowType="",this.geoLocation={},this.hideIconText=!1,this.lossesReportRequestApiVersion="",this.multiStepConfiguration={},this.multistepModalVisible=!1,this.phoneNumberBbvaLineVehicle="",this.phoneNumberBbvaLine="",this.privacyTermsPdf=!1,this.productTypeVehicleInsurance="",this.publicSettings=[],this.publicSettingsId="",this.publicSettingsKey="",this.requestServices=!1,this.subProductType="",this.ticketSharing="",this.vehicleInsuranceId="",this.viewPolicy="",this.viewPolicyVisible=!1,this.vehicleInsurance={},this.viewCallVisible=!1,this.viewInfoModal=!1,this.pdfDocument="",this.showHelpFaqs=!1,this.vehicleInsuranceApiVersion="",this._assistsSelected=[],this._configInfoModal={},this._dataModal={},this._infoModal={},this._modalErrorGeneric=!1,this._multistepState=!1,this._timeOutData={},this._viewMenuFaqs=!1}static get styles(){return[Ka,m("emergency-crane-vehicle-reports-shared-styles")]}openCommunicationErrorModal(){this.clearLoader();const e={id:"error-communication-modal",modalHeader:"emergency-crane-vehicle-reports-error-heading-text",headerType:"modal",fullHeight:!0,fixedFooter:!0,hidePaddingTop:!0,icon:"",panel:{microillustration:"error",heading:"emergency-crane-vehicle-reports-error-heading-text",description:"emergency-crane-vehicle-reports-error-description-text"},number:this.phoneNumberBbvaLine,buttonText:this.viewCallVisible?"emergency-crane-vehicle-reports-call-footer-button":"",linkText:"emergency-crane-vehicle-reports-leave-button-error-location-modal",eventName:"emergency-crane-vehicle-reports-communication-failed-modal",closeModalElements:["header-right-primary","footer-link"]};this._configInfoModal={...e},this.viewInfoModal=!0}openErrorLocation(){const e={id:"error-location-half-modal",modalType:"warning",modalHeader:"",icon:A(),fullHeight:!1,fixedFooter:!1,closeModalElements:["footer-link"],buttonText:"emergency-crane-vehicle-reports-multistep-modal-geolocation-error",linkText:"emergency-crane-vehicle-reports-leave-button-error-location-modal",bodyText:"emergency-crane-vehicle-reports-error-location-description",titleText:"emergency-crane-vehicle-reports-communication-interrupted",eventName:"emergency-crane-vehicle-reports-geolocation-failed"};this._configInfoModal={...e},this.viewInfoModal=!0}_openAlreadyReportedModal(){this.clearLoader();const e={id:"already-reported-modal",modalHeader:"emergency-crane-vehicle-reports-success-header",headerType:"modal",fullHeight:!0,fixedFooter:!0,hidePaddingTop:!0,icon:"",panel:{microillustration:"error",heading:"emergency-crane-vehicle-reports-existing-title-text",description:"emergency-crane-vehicle-reports-existing-description-text"},number:this.phoneNumberBbvaLineVehicle,buttonText:"emergency-crane-vehicle-reports-existing-button-text",linkText:"emergency-crane-vehicle-reports-existing-link-text",eventName:"emergency-crane-vehicle-reports-already-report-error-modal",closeModalElements:["header-right-primary","footer-link"]};this._configInfoModal={...e},this.viewInfoModal=!0}_openNoticeOfPrivacy(){const e={id:"notice-of-privacy-modal",modalHeader:"emergency-crane-vehicle-reports-notice-of-privacy-header",icon:w(),headerType:"modal-three-level",fullHeight:!0,buttonText:"emergency-crane-vehicle-reports-understood-button-text",linkText:"",content:{firstParagraph:"emergency-crane-vehicle-reports-notice-privacy-insurance",secondParagraph:"emergency-crane-vehicle-reports-notice-privacy-insurance-two"},fixedFooter:!0,closeModalElements:["header-right-primary","footer-button"],eventName:"emergency-crane-vehicle-reports-notice-of-privacy-modal"};this._configInfoModal={...e},this.viewInfoModal=!0}_openOperationNotPerformedModal(){this.clearLoader();this._configInfoModal={id:"operation-not-performed-modal",modalHeader:"emergency-crane-vehicle-reports-emergency-operation-not-performed-modal",headerType:"modal",fullHeight:!0,fixedFooter:!0,hidePaddingTop:!0,icon:"",panel:{microillustration:"error",heading:"emergency-crane-vehicle-reports-action-not-performed",description:"emergency-crane-vehicle-reports-not-available-services-error"},buttonText:"emergency-crane-vehicle-reports-understood-button-text",linkText:"",eventName:"emergency-crane-vehicle-reports-operation-not-performed-error-modal",closeModalElements:["header-right-primary","footer-button"]},this.viewInfoModal=!0}_openPreventLeaveReport(){const e={id:"prevent-leave-modal",modalType:"warning",modalHeader:"",icon:A(),fullHeight:!1,fixedFooter:!1,closeModalElements:["footer-button","footer-link"],buttonText:"emergency-crane-vehicle-reports-leave-button-error-location-modal",linkText:"emergency-crane-vehicle-reports-continue-on-operation-button",bodyText:"emergency-crane-vehicle-reports-prevent-leave-body-text",eventName:"emergency-crane-vehicle-reports-modal-leaving-operative"};this._configInfoModal={...e},this.viewInfoModal=!0}_openSuccessCraneReport({detail:e}){const{operationDate:t,id:i}=e;let s=[];const a={icon:Ee(),label:this.t("emergency-crane-vehicle-reports-success-share"),id:"share-receipt",detail:this.ticketSharing};s=[...s,a],this.viewPolicyVisible&&(s=[{icon:Ie(),label:this.t("emergency-crane-vehicle-reports-success-policy"),id:"policy-file",detail:this.viewPolicy},...s]);const r={id:"success-report-modal",modalHeader:this._assistsSelected,headerType:"modal",fullHeight:!0,hidePaddingTop:!0,icon:"",panel:{microillustration:"success",heading:"emergency-crane-vehicle-reports-request-received-success-modal",description:"emergency-crane-vehicle-reports-help-on-the-way"},listDetails:[{id:"date",detail:"emergency-crane-vehicle-reports-date-success-modal",description:t},{id:"policy",detail:"emergency-crane-vehicle-reports-policy-success-modal",description:this._policyNumber},{id:"reportId",detail:"emergency-crane-vehicle-reports-receipt-success-report-modal",description:i},{id:"reportType",detail:"emergency-crane-vehicle-reports-reporting-type-success-modal",description:this._formatCrane()}],buttonText:"emergency-crane-vehicle-reports-leave-button-error-location-modal",linkText:"",number:this.phoneNumberBbvaLineVehicle,callLinkDisabled:!0,eventName:"emergency-crane-vehicle-reports-receipt",closeModalElements:["header-right-primary","footer-button"],...this._timeOutData,options:s};this._configInfoModal={...r},this.viewInfoModal=!0,this.clearLoader()}get _dataManager(){return this.shadowRoot.querySelector('[data-tag-name="emergency-crane-vehicle-reports-dm"]')}_createNewReport({detail:e}){this.showLoader(),this._assistsSelected=null==e?void 0:e.assistsSelected,this.multistepModalVisible=!1,this._dataManager.createReport(e)}_errorLossesReport({detail:e}){this.clearLoader(),this._dataModal={...e,headerTitle:this.t("emergency-crane-vehicle-reports-success-header")},this._modalErrorGeneric=!0}_formatCrane(){const e=this._assistsSelected;return this._assistsSelected.length,e}_getInsuranceData({detail:e}){const{policyNumber:t}=e;this._policyNumber=t}_generateReportModal({detail:e}){var t,i,s;const{helpDescription:a}=e;this.flowType=null==e?void 0:e.flowType,this._helpDescription=a||"";const r=null==e||null===(t=e.time)||void 0===t?void 0:t.halfTimeout,o=null==e||null===(i=e.time)||void 0===i?void 0:i.callTimeout,n=(null==e||null===(s=e.time)||void 0===s?void 0:s.callTimeoutActivate)||!1;n&&(this._timeOutData={halfMinutes:r,totalMinutes:o,timeOutActive:n}),this.multiStepConfiguration={privacyTermsPdf:this.privacyTermsPdf},this.faqsConfigurations={phoneNumberBbvaLine:this.phoneNumberBbvaLine,hostAEM:null==e?void 0:e.aemHost,contentFragmentPath:null==e?void 0:e.contentFragmentPath},this._infoModal={...this._infoModal,selectionType:null==e?void 0:e.selectionType,flowType:null==e?void 0:e.flowType},this.multistepModalVisible=!0}_handleModalState(e){const{step1:t,step2:i}=e;i&&this.dispatchEvent(new CustomEvent("emergency-crane-vehicle-reports-modal-state-change",{bubbles:!0,composed:!0,detail:{visible:!0,mode:"reportZoneStep"}})),t&&this.dispatchEvent(new CustomEvent("emergency-crane-vehicle-reports-modal-state-change",{bubbles:!0,composed:!0,detail:{visible:!0,mode:"reportLocationStep"}})),!1===t&&!1===i&&this.dispatchEvent(new CustomEvent("emergency-crane-vehicle-reports-modal-state-change",{bubbles:!0,composed:!0,detail:{visible:!0,mode:"reportCompleteStep"}}))}_initialRequestError(){this.multistepModalVisible=!1,this.openCommunicationErrorModal()}_listenToResetData({type:e}){this.addEventListener(`${e}`,(()=>{this._resetData()}))}_resetData(){this.multistepModalVisible=!1,this.multiStepConfiguration={},this.faqsConfigurations={},this.geoLocation={},this.viewInfoModal=!1,this._dataModal={},this._configInfoModal={},this._modalErrorGeneric=!1,this._multistepState=!0}_saveFeatureState({detail:e}){const{key:t,data:i}=e;this._dataModal={...this._dataModal,[t]:i},this._handleModalState(e)}get _buildCraneInfoModal(){return g`
      <crane-info-modal
        ?visible="${this.viewInfoModal}"
        .configInfoModal="${this._configInfoModal}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        @emergency-crane-vehicle-reports-info-modal-state-change="${({detail:e})=>{this.viewInfoModal=e}}"
        @emergency-crane-vehicle-reports-info-modal-veil-close="${({detail:e})=>{this.multistepModalVisible=e}}"
        @emergency-crane-vehicle-reports-modal-leaving-operative-button-click="${this._listenToResetData}"
        @emergency-crane-vehicle-reports-already-report-error-modal-link-click="${this._listenToResetData}"
        @emergency-crane-vehicle-reports-already-report-error-modal-right-click="${this._listenToResetData}"
        @emergency-crane-vehicle-reports-receipt-right-click="${this._listenToResetData}"
        @emergency-crane-vehicle-reports-operation-not-performed-error-modal-button-click="${this._listenToResetData}"
        @emergency-crane-vehicle-reports-operation-not-performed-error-modal-right-click="${this._listenToResetData}"
        @emergency-crane-vehicle-reports-communication-failed-modal-link-click="${this._listenToResetData}"
        @emergency-crane-vehicle-reports-communication-failed-modal-right-click="${this._listenToResetData}"
      >
      </crane-info-modal>
    `}get _buildCraneMultistepModal(){return g`
      <crane-generate-reports-multistep-modal
        .restoreMultistepState="${this._multistepState}"
        ?visible="${this.multistepModalVisible}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ?flow-type="${this.flowType}"
        ?native="${this.native}"
        api-key="${this.apiKey}"
        .geoLocation="${this.geoLocation}"
        .dataModal="${this._dataModal}"
        .infoModal="${this._infoModal}"
        pdf-document="${this.pdfDocument}"
        ?show-help-faqs="${this.showHelpFaqs}"
        .multiStepConfiguration="${this.multiStepConfiguration}"
        header-title="${this._helpDescription}"
        phone-number-bbva-line-vehicle="${this.phoneNumberBbvaLineVehicle}"
        @emergency-crane-vehicle-reports-show-faqs="${({detail:e})=>{this._viewMenuFaqs=e}}"
        @emergency-crane-vehicle-reports-multistep-modal-leave-prevent="${this._openPreventLeaveReport}"
        @emergency-crane-vehicle-reports-multistep-modal-close-click="${this._listenToResetData}"
        @emergency-crane-vehicle-reports-multistep-modal-multistep-update-state="${this._saveFeatureState}"
        @emergency-crane-vehicle-reports-multistep-modal-new-report-create="${this._createNewReport}"
        @emergency-crane-vehicle-reports-multistep-modal-geolocation-change="${({detail:e})=>{this.geoLocation=e}}"
        @emergency-crane-vehicle-reports-multistep-modal-notice-of-privacy-modal-open="${this._openNoticeOfPrivacy}"
        @emergency-crane-vehicle-reports-multistep-modal-geolocation-error="${()=>{this.openErrorLocation()}}"
      >
      </crane-generate-reports-multistep-modal>
    `}get _buildEmergencyCraneVehicleTemplate(){return g`
      ${this._buildCraneMultistepModal} ${this._buildCraneInfoModal}
    `}get _openMenuFAQs(){return g`
      <emergency-crane-vehicle-reports-faqs-menu
        ?hide-icon-text="${this.hideIconText}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ?show-menu-faqs="${this._viewMenuFaqs}"
        .faqsConfigurations="${this.faqsConfigurations}"
        @emergency-crane-vehicle-reports-faqs-menu-header-return="${()=>{this._viewMenuFaqs=!1}}"
      ></emergency-crane-vehicle-reports-faqs-menu>
    `}get _tplDM(){return g`
      <emergency-crane-vehicle-reports-dm
        host="${this.host}"
        language="${this.language}"
        required-token="${this.requiredToken}"
        ?native="${this.native}"
        ?request-services="${this.requestServices}"
        app-settings-api-version="${this.appSettingsApiVersion}"
        vehicle-insurance-api-version="${this.vehicleInsuranceApiVersion}"
        losses-report-requests-api-version="${this.lossesReportRequestApiVersion}"
        public-settings-id="${this.publicSettingsId}"
        public-settings-key="${this.publicSettingsKey}"
        vehicle-insurance-id="${this.vehicleInsuranceId}"
        fields-property="${this.fieldsProperty}"
        sub-product-type="${this.subProductType}"
        product-type-vehicle-insurance="${this.productTypeVehicleInsurance}"
        .publicSettings="${this.publicSettings}"
        .vehicleInsurance="${this.vehicleInsurance}"
        public-settings-host="${this.publicSettingsHost}"
        public-settings-required-token="${this.publicSettingsRequiredToken}"
        @emergency-crane-vehicle-reports-generic-modal-error="${this._errorLossesReport}"
        @emergency-crane-vehicle-reports-dm-holder-data-send="${this._getInsuranceData}"
        @emergency-crane-vehicle-reports-dm-generate-losses-report-success="${this._openSuccessCraneReport}"
        @emergency-crane-vehicle-reports-dm-modal-create-report="${this._generateReportModal}}"
        @emergency-crane-vehicle-reports-dm-modal-already-exists="${this._openAlreadyReportedModal}"
        @emergency-crane-vehicle-reports-dm-api-dm-error="${this._initialRequestError}"
        @emergency-crane-vehicle-reports-dm-modal-communication-fail="${this._openOperationNotPerformedModal}"
      ></emergency-crane-vehicle-reports-dm>
    `}render(){return g`
      ${super.render()} ${this._tplDM} ${this._buildEmergencyCraneVehicleTemplate}
      ${this.showHelpFaqs?this._openMenuFAQs:E}
    `}}customElements.define(Xa.is,Xa);const Wa=new r;var Ja=t`:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--emergency-vehicle-crash-reports-dark-mode-bg-color, var(--emergency-vehicle-crash-bg-color, var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)})));
  --bbva-date-color: var(--colorsSecondary600, ${i(n.secondary600)});
  height: 100%;
}

:host([hidden]), [hidden] {
  display: none !important;
}

[data-tag-name=bbva-help-modal][visible] {
  transform: translateZ(0.1px);
}

*, *:before, *:after {
  box-sizing: inherit;
}
${Wa.mediaRules()}`;class Qa extends(y(c(f(Xe(h))))){static get is(){return"emergency-vehicle-crash-reports-dm"}static get scopedElements(){const e=[Ye,ni,jt];return Qa.scopedElementsFromClasses(e)}static get properties(){return{appSettingsApiVersion:{type:String,attribute:"app-settings-api-version"},publicSettingsId:{type:String,attribute:"public-settings-id"},publicSettingsKey:{type:String,attribute:"public-settings-key"},publicSettings:{type:Array},vehicleInsuranceApiVersion:{type:String,attribute:"vehicle-insurance-api-version"},lossesReportsApiVersion:{type:String,attribute:"losses-reports-api-version"},vehicleInsuranceId:{type:String,attribute:"vehicle-insurance-id"},fieldsProperty:{type:String,attribute:"fields-property"},vehicleInsurance:{type:Object},subProductType:{type:String,attribute:"sub-product-type"},requestServices:{type:Boolean,attribute:"request-services"},productTypeVehicleInsurance:{type:String,attribute:"product-type-vehicle-insurance"},contactDataIsUsed:{type:Boolean,attribute:"contact-data-is-used"},vehicleType:{type:String,attribute:"vehicle-type"},cacheType:{type:String,attribute:"cache-type"}}}constructor(){super(),this.publicSettingsId="",this.publicSettingsKey="",this.publicSettings=[],this.vehicleInsuranceId="",this.fieldsProperty="",this.vehicleInsurance={},this.subProductType="",this.requestServices=!1,this.appSettingsApiVersion="0",this.vehicleInsuranceApiVersion="1",this.lossesReportsApiVersion="1",this.productTypeVehicleInsurance="",this.contactDataIsUsed=!1,this.vehicleType="",this.cacheType="none"}async firstUpdated(){super.firstUpdated(),await this.updateComplete,this._publicSettingsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-public-settings-api-dm"]'),this._vehicleInsuranceDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-vehicle-insurance-api-dm"]'),this._lossesReportRequestsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-losses-report-requests-api-dm"]')}updated(e){super.updated(e),e.has("publicSettings")&&this.publicSettings.length&&this._successPublicSettings(),e.has("vehicleInsurance")&&Object.keys(this.vehicleInsurance).length&&this._successVehicleInsurance(),e.has("vehicleInsuranceId")&&this.requestServices&&""!==this.vehicleInsuranceId&&""!==this.fieldsProperty&&(this._requestPublicSettingsDm(),this._requestVehicleInsuranceDm()),e.has("restoreServicesData")&&Object.keys(this.restoreServicesData).length&&this._restoreServicesDataState()}_restoreServicesDataState(){var e,t,i;this.vehicleInsurance={...null===(e=this.restoreServicesData)||void 0===e?void 0:e.vehicleInsuranceData},this.publicSettings=[...null===(t=this.restoreServicesData)||void 0===t?void 0:t.publicSettingsData],this.vehicleType=null===(i=this.restoreServicesData)||void 0===i?void 0:i.vehicleTypeData}_requestPublicSettingsDm(){Object.keys(this.publicSettings).length?this._publicSettingsDm.publicSettings=this.publicSettings:this._publicSettingsDm.getPublicSettings(this.publicSettingsId,{key:this.publicSettingsKey})}_successPublicSettings(e){var t;const i=e&&(null==e?void 0:e.detail)&&(null==e||null===(t=e.detail)||void 0===t?void 0:t.data)||(null==e?void 0:e.detail)||(null==e?void 0:e.data)||this.publicSettings,[s]=i,a=JSON.parse(s.value),{data:{emergencies:r,hostAEM:o}}=a,n=r.find((e=>e.productType===this.productTypeVehicleInsurance));if(!n)return this._serviceCommunicationError();const{flowSubProductType:l,emergency:c,contentFragmentPath:d}=n;if(l!==this.subProductType||!c)return this._serviceCommunicationError();const h=c.find((e=>"SHOCK"===e.id)),{callTimeout:{isActive:p,time:u},helpDescription:m,flowType:g}=h;let b={};if(p){const[e,t]=u.split(":"),i=6e4*e+1e3*t,s=i/2;b={...b,totalMinutes:i,halfMinutes:s}}const v=null==h?void 0:h.geolocation,y=null==h?void 0:h.personData;this._addressComponents=null==v?void 0:v.addressComponents;const f={geolocation:v,hostAEM:o,contentFragmentPath:d,personData:null==y?void 0:y.isUsed,timeOutActive:p,flowType:"HELP_SHOW_QUESTIONS"===g,time:b,helpDescription:m};return this._dispatchCustomEvent("emergency-vehicle-crash-reports-dm-app-settings-data-set",f)}_requestVehicleInsuranceDm(){Object.keys(this.vehicleInsurance).length?this._vehicleInsuranceDm.vehicleInsurance=this.vehicleInsurance:this._vehicleInsuranceDm.getVehicleInsurance(this.vehicleInsuranceId,{fields:this.fieldsProperty})}_successVehicleInsurance(e){var t,i,s,a,r,o,n,l,c,d,h,p,u,m,g,b,v,y,f;const _=(null==e?void 0:e.detail)||(null==e?void 0:e.data)||this.vehicleInsurance;if(this._vehicleDetails={id:_.id,licensePlate:null===(t=_.vehicle)||void 0===t?void 0:t.licencePlate,brandId:null===(i=_.vehicle)||void 0===i||null===(s=i.model)||void 0===s||null===(a=s.brand)||void 0===a?void 0:a.id,brandName:null===(r=_.vehicle)||void 0===r||null===(o=r.model)||void 0===o||null===(n=o.brand)||void 0===n?void 0:n.name,subBrandId:null===(l=_.vehicle)||void 0===l||null===(c=l.model)||void 0===c||null===(d=c.subBrand)||void 0===d?void 0:d.id,subBrandName:null===(h=_.vehicle)||void 0===h||null===(p=h.model)||void 0===p||null===(u=p.subBrand)||void 0===u?void 0:u.name,vehicleTypeId:null===(m=_.vehicle)||void 0===m||null===(g=m.vehicleType)||void 0===g?void 0:g.id,vehicleTypeName:null===(b=_.vehicle)||void 0===b||null===(v=b.vehicleType)||void 0===v?void 0:v.name,certificateNumber:_.certificateNumber},this._dispatchCustomEvent("emergency-vehicle-crash-reports-dm-set-policy-number",_.policyNumber),(null===(y=_.vehicle)||void 0===y||null===(f=y.vehicleType)||void 0===f?void 0:f.id)===this.vehicleType&&_.holder){const[e]=_.holder.contactDetails;let t="";"MOBILE"===e.contact.contactDetailType&&(t=e.contact.number);const i={firstName:_.holder.firstName,lastName:_.holder.lastName,contactDetailType:e.contact.contactDetailType,number:t};this._dispatchCustomEvent("emergency-vehicle-crash-reports-dm-holder-data",i)}}createCrashReport(e){this.showLoader();const t=this._generateBody(e);this._lossesReportRequestsDm.postLossesReportRequests(t)}_generateBody(e){var t,i;const{geolocation:s,fullAddress:a,composedAddress:r,serviceQuiz:o,contactDetails:n}=e;let l={};var c,d,h,p,u,m,g,b,v,y;this.contactDataIsUsed?l={licensePlate:null===(c=this._vehicleDetails)||void 0===c?void 0:c.licensePlate,brand:{id:null===(d=this._vehicleDetails)||void 0===d?void 0:d.brandId,name:null===(h=this._vehicleDetails)||void 0===h?void 0:h.brandName},subBrand:{id:null===(p=this._vehicleDetails)||void 0===p?void 0:p.subBrandId,name:null===(u=this._vehicleDetails)||void 0===u?void 0:u.subBrandName},vehicleType:{id:null===(m=this._vehicleDetails)||void 0===m?void 0:m.vehicleTypeId,name:null===(g=this._vehicleDetails)||void 0===g?void 0:g.vehicleTypeName}}:l={licensePlate:null===(b=this._vehicleDetails)||void 0===b?void 0:b.licensePlate,brand:{id:null===(v=this._vehicleDetails)||void 0===v?void 0:v.brandName},subBrand:{id:null===(y=this._vehicleDetails)||void 0===y?void 0:y.subBrandName}};let f=[];const _=`${r.route} ${r.strNumber}`;f="NO_FULL_ADDRESS"===this._addressComponents?[{name:r.country,componentTypes:["COUNTRY"]},{name:r.postalCode,componentTypes:["POSTAL_CODE"]},{name:r.city,componentTypes:["CITY"]},{name:_,componentTypes:["ADDRESS"]}]:[{name:a,componentTypes:["FULL_ADDRESS"],code:r.country}];return{policy:{id:null===(t=this._vehicleDetails)||void 0===t?void 0:t.id,certificateNumber:(null===(i=this._vehicleDetails)||void 0===i?void 0:i.certificateNumber)||""},requestType:{id:"NEW",lossDetail:{vehicle:l,addresses:[{location:{addressComponents:f}}],geolocation:{latitude:s.lat.toString(),longitude:s.lng.toString()},...o&&{quiz:{isInjured:o.injured,isCanTransit:o.transit}},serviceSpecificLosses:[{id:"SHOCK",eventType:"CLAIMS"}]}},...n&&{contactDetails:[{name:{nameType:"FULL_NAME",fullName:n.name},role:n.id,contact:{contactDetailType:"MOBILE",number:n.phoneNumber}}]}}}_handleCreateReport({detail:e}){const t={id:e.id,operationDate:e.operationDate,disableCallLink:!0,eventNameOnLink:"call-assistance-line-from-crash-report"};this._dispatchCustomEvent("emergency-vehicle-crash-reports-dm-report-create",t),this._dispatchCustomEvent("emergency-vehicle-crash-reports-dm-losses-report-success",e)}_handleCreateReportError({detail:e}){const{messages:t}=e,[i]=t,{code:s}=i;return"alreadyRequested"===s?this._dispatchCustomEvent("emergency-vehicle-crash-reports-dm-modal-already-exists"):this._dispatchCustomEvent("emergency-vehicle-crash-reports-dm-modal-communication-fail")}_serviceCommunicationError(){this._dispatchCustomEvent("emergency-vehicle-crash-reports-dm-api-dm-error")}get _dmAppSettings(){return g`
      <bbva-global-public-settings-api-dm
        version="${this.appSettingsApiVersion}"
        .host="${this.host}"
        .requiredToken="${this.requiredToken}"
        ?native="${this.native}"
        .cacheType="${this.cacheType}"
        .publicSettings="${this.publicSettings}"
        @public-settings-api-dm-fetch="${this._successPublicSettings}"
        @public-settings-api-dm-fetch-error="${this._serviceCommunicationError}"
        @api-dm-error="${this._serviceCommunicationError}"
      ></bbva-global-public-settings-api-dm>
    `}get _dmVehicleInsurance(){return g`
      <bbva-global-vehicle-insurance-api-dm
        version="${this.vehicleInsuranceApiVersion}"
        .host="${this.host}"
        .requiredToken="${this.requiredToken}"
        .vehicleInsurance="${this.vehicleInsurance}"
        ?native="${this.native}"
        .cacheType="${this.cacheType}"
        @vehicle-insurance-api-dm-fetch="${this._successVehicleInsurance}"
        @vehicle-insurance-api-dm-fetch-error="${this._serviceCommunicationError}"
        @api-dm-error="${this._serviceCommunicationError}"
      ></bbva-global-vehicle-insurance-api-dm>
    `}get _dmLossesReport(){return g`
      <bbva-global-losses-report-requests-api-dm
        version="${this.lossesReportsApiVersion}"
        .host="${this.host}"
        .requiredToken="${this.requiredToken}"
        ?native="${this.native}"
        @losses-report-requests-api-dm-create="${this._handleCreateReport}"
        @losses-report-requests-api-dm-create-error="${this._handleCreateReportError}"
        @api-dm-error="${this._serviceCommunicationError}"
      >
      </bbva-global-losses-report-requests-api-dm>
    `}render(){return g`
      ${this._dmAppSettings} ${this._dmVehicleInsurance} ${this._dmLossesReport}
    `}}var Ya=t`:host {
  display: block;
  box-sizing: border-box;
  --bbva-help-modal-padding: 0;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.container {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
  margin-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-progress-multistep-bar] {
  z-index: 2;
  position: sticky;
  top: 0;
  right: 0;
  left: 0;
  display: block;
  height: 0.5rem;
}

.order-online-components {
  display: flex;
  justify-content: space-between;
}

.privacy-text {
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
  text-align: center;
}

[data-tag-name=bbva-expandable-multistep] {
  height: unset;
  background: var(--_emergency-vehicle-crash-reports-bg-expandable-step-color);
}

[data-tag-name=bbva-expandable-step][completed] {
  min-height: auto !important;
}

[data-tag-name=bbva-button-default][show] {
  display: none;
}

.summary-list {
  margin-bottom: calc(((0.625 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}

.remove-overflow {
  overflow: hidden;
}

.privacy-button {
  width: 100%;
  display: flex;
  box-shadow: 0 0 calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem) 0 rgba(18, 18, 18, 0.3);
  justify-content: center;
  padding: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1em) 0;
}

[data-tag-name=bbva-help-modal][visible] {
  transform: translateZ(0.1px);
}
`,Za=t`.order-column-components {
  display: flex;
  flex-direction: column;
  align-items: center;
  flex: 1 1 auto;
}

.footer-button-map {
  margin-top: auto;
  width: 100%;
  display: flex;
  justify-content: end;
  flex-direction: column;
  align-items: center;
}

[data-tag-name=bbva-map-static] {
  width: 100%;
}

.footer-link {
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}

.order-template {
  height: 80vh;
  display: flex;
  flex-direction: column;
}
`;class er extends(y(Xe(f(c(h))))){static get is(){return"report-location-step"}static get properties(){return{apiKey:{type:String,attribute:"api-key"},staticLocationMessage:{type:String,attribute:"static-location-message",reflect:!0},staticLocation:{type:Object,attribute:"static-location"},isLoading:{type:Boolean,attribute:"is-loading"},contactDataIsUsed:{type:Boolean,attribute:"contact-data-is-used"}}}static get styles(){return[Za,ds.light,M.light,be.light,m("report-location-step-shared-styles")]}static get scopedElements(){const e=[hs,P,ge,...er.configurationScopedElements()];return er.scopedElementsFromClasses(e)}constructor(){super(),this.apiKey="",this.staticLocationMessage="",this.staticLocation={},this.isLoading=!1,this.contactDataIsUsed=!1}_showDynamicMapModal(){this._dispatchCustomEvent("emergency-vehicle-crash-reports-report-location-dynamic-map-show")}get _staticMapUI(){return g`
      <bbva-map-static
        ambient="light"
        api-key="${this.apiKey}"
        message="${this.staticLocationMessage}"
        .location="${this.staticLocation}"
        .loading="${this.isLoading}"
      >
      </bbva-map-static>
    `}get _buttonMapUI(){return g`
      <bbva-button-default
        ?disabled="${this.isLoading}"
        aria-label="${this.t("emergency-vehicle-crash-reports-accessibility-location")}"
        @click="${()=>{this._dispatchCustomEvent("complete"),this._dispatchCustomEvent("emergency-vehicle-crash-reports-report-location-step-complete",!0)}}"
      >
        ${this.t("emergency-vehicle-crash-reports-continue-button")}
      </bbva-button-default>
    `}get _linkMapUI(){return this.isLoading?E:g`
      <bbva-link
        ambient="light"
        aria-label="${this.t("emergency-vehicle-crash-reports-accessibility-change-location")}"
        @click="${this._showDynamicMapModal}"
      >
        ${this.t("emergency-vehicle-crash-reports-change-location-link")}
      </bbva-link>
    `}get _buildFooterButton(){return g`
      <div class="footer-button-map" ambient="light">
        ${this._buttonMapUI}
        <div class="order-column-components footer-link">
          ${this._linkMapUI}
        </div>
      </div>
    `}get _buildReportLocationTemplate(){return g`
      <div class="order-template" ambient="light">
        ${this._staticMapUI} ${this._buildFooterButton}
      </div>
    `}get _buildReportLocationStepWithLinkTop(){return g`
      <div class="order-template" ambient="light">
        <div class="order-column-components">
          ${this._staticMapUI} ${this._linkMapUI}
        </div>
        <div class="footer-button-map">
          ${this._buttonMapUI}
        </div>
      </div>
    `}render(){return g`
      ${this.contactDataIsUsed?this._buildReportLocationStepWithLinkTop:this._buildReportLocationTemplate}
    `}}const tr=new r;var ir=t`:host {
  box-sizing: border-box;
  display: flex;
  min-height: 1rem;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
  --_notification-help-icon-color: var(--bbva-notification-help-dark-mode-icon-color, var(--bbva-notification-help-icon-color, var(--colorsPrimaryCoreDark, ${i(n.primaryCoreDark)})));
  --_notification-help-text-color: var(--bbva-notification-help-dark-mode-text-color, var(--bbva-notification-help-text-color, var(--colorsSecondary500, ${i(n.secondary500)})));
  --_notification-help-icon-color-alert: var(--bbva-notification-help-dark-mode-icon-color-alert, var(--bbva-notification-help-icon-color-alert, var(--colorsTertiaryType1Dark, ${i(n.tertiaryType1Dark)})));
  --_notification-help-text-color-alert: var(--bbva-notification-help-dark-mode-text-color-alert, var(--bbva-notification-help-text-color-alert, var(--colorsSecondary600, ${i(n.secondary600)})));
  --_notification-help-icon-color-success: var(--bbva-notification-help-dark-mode-icon-color-success, var(--bbva-notification-help-icon-color-success, var(--colorsTertiaryType6Dark, ${i(n.tertiaryType6Dark)})));
  --_notification-help-text-color-success: var(--bbva-notification-help-dark-mode-text-color-success, var(--bbva-notification-help-text-color-success, var(--colorsSecondary500, ${i(n.secondary500)})));
  --skeleton-quote-color: var(--bbva-notification-help-dark-mode-skeleton-quote-color, var(--bbva-notification-help-skeleton-color, var(--colorsSecondary200, ${i(n.secondary200)})));
  --skeleton-quote-bg: var(--bbva-notification-help-dark-mode-skeleton-bg, var(--bbva-notification-help-skeleton-bg, transparent));
}

:host([hidden]),
[hidden] {
  display: none !important;
}

:host([hide-top-padding]) {
  padding-top: 0;
}

:host([hide-bottom-padding]) {
  padding-bottom: 0;
}

:host([hide-left-padding]) {
  padding-left: 0;
}

:host([hide-right-padding]) {
  padding-right: 0;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.accessible-hide {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
}

[data-tag-name=bbva-icon] {
  color: var(--_notification-help-icon-color);
  flex-shrink: 0;
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color);
  font-size: var(--bbva-notification-help-text-font-size, var(--typographyType3XSmall, ${i(s.type3XSmall)}));
  line-height: var(--bbva-notification-help-text-line-height, var(--lineHeightType3XSmall, ${i(a.type3XSmall)}));
  margin: 0;
}

:host(.alert) [data-tag-name=bbva-icon] {
  color: var(--_notification-help-icon-color-alert);
}
:host(.alert) [data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color-alert);
}

:host(.success) [data-tag-name=bbva-icon] {
  color: var(--_notification-help-icon-color-success);
}
:host(.success) [data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color-success);
}

:host([loading]) {
  position: relative;
  top: 0;
  left: 0;
  display: inline-flex;
  width: 100%;
  pointer-events: none;
  background-repeat: no-repeat;
  will-change: transform;
  transform: opacity;
  animation: pulse 2s ease-in-out infinite;
  background-image: linear-gradient(var(--skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: 16px 16px, calc((80px * 2) + (16px/ 2)) 16px;
  background-position: 0 0, 20px 0;
}
:host([loading]) > :nth-child(n) {
  opacity: 0;
}

@keyframes pulse {
  0% {
    filter: opacity(100%);
  }
  50% {
    filter: opacity(60%);
  }
  100% {
    filter: opacity(100%);
  }
}
${tr.mediaRules()}`;var sr=t`[ambient^=light] {
  --bbva-notification-help-icon-color: initial;
  --bbva-notification-help-text-color: initial;
  --bbva-notification-help-icon-color-alert: initial;
  --bbva-notification-help-text-color-alert: initial;
  --bbva-notification-help-icon-color-success: initial;
  --bbva-notification-help-text-color-success: initial;
  --bbva-notification-help-skeleton-color: initial;
}
${(new r).mediaRules()}`;const ar=new r;const rr={dark:t`
    ${t`[ambient^=dark] {
  --bbva-notification-help-icon-color: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
  --bbva-notification-help-text-color: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
  --bbva-notification-help-icon-color-alert: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
  --bbva-notification-help-text-color-alert: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
  --bbva-notification-help-icon-color-success: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
  --bbva-notification-help-text-color-success: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
  --bbva-notification-help-skeleton-color: var(--colorsPrimaryCoreLight, ${i(n.primaryCoreLight)});
}
${ar.mediaRules()}`}
  `,light:t`
    ${sr}
  `};class or extends(l(c(d(h)))){static get is(){return"bbva-notification-help"}static get scopedElements(){return{"bbva-icon":p,"bbva-text":u}}static get properties(){return{accessibilityLabelIcon:{type:String,attribute:"accessibility-label-icon"},icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},text:{type:String},loading:{type:Boolean,reflect:!0},hideTopPadding:{type:Boolean,attribute:"hide-top-padding"},hideBottomPadding:{type:Boolean,attribute:"hide-bottom-padding"},hideLeftPadding:{type:Boolean,attribute:"hide-left-padding"},hideRightPadding:{type:Boolean,attribute:"hide-right-padding"}}}constructor(){super(),this.accessibilityLabelIcon="",this.icon="",this.iconSize=16,this.text="",this.loading=!1,this.hideTopPadding=!1,this.hideBottomPadding=!1,this.hideRightPadding=!1,this.hideLeftPadding=!1}static get styles(){return[super.styles,ir,rr.dark,rr.light,m("bbva-notification-help-shared-styles")]}render(){return g`
      <span class="accessible-hide" ?hidden="${!this.accessibilityLabelIcon}"
        >${this.accessibilityLabelIcon}</span
      >

      <bbva-icon aria-hidden="true" .icon="${this.icon}" .size="${this.iconSize}"> </bbva-icon>

      <bbva-text text=${this.text} unset></bbva-text>
    `}}b("colors.primarySubduedLight"),b("colors.cool20"),b("colors.tertiaryType1Light"),b("colors.primaryCoreLightened"),b("colors.tertiaryType6Light"),b("colors.cool20"),b("colors.cool50");const nr=new r;var lr=t`:host {
  --_form-radio-group-help-icon-color: var(--bbva-form-radio-group-dark-mode-help-icon-color, var(--bbva-form-radio-group-help-icon-color, var(--colorsPrimaryMedium, ${i(n.primaryMedium)})));
  --_form-radio-group-help-icon-active-color: var(--bbva-form-radio-group-dark-mode-help-icon-active-color, var(--bbva-form-radio-group-help-icon-active-color, var(--colorsPrimaryCore, ${i(n.primaryCore)})));
  --_form-radio-group-label-out-color: var(--bbva-form-radio-group-dark-mode-label-out-color, var(--bbva-form-radio-group-label-out-color, var(--colorsSecondary600, ${i(n.secondary600)})));
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

[data-tag-name=bbva-notification-help] {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}

.label-out {
  display: flex;
  align-items: center;
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}

.label-out-text {
  font-weight: var(--typographyTypeMedium, ${i(s.typeMedium)});
  color: var(--_form-radio-group-label-out-color);
}

[data-tag-name=bbva-link] {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
  --bbva-link-with-icon-icon-color: var(--_form-radio-group-help-icon-color);
  --bbva-link-active-with-icon-icon-color: var(--_form-radio-group-help-icon-active-color);
}

:host([two-option]) {
  font-size: 0;
  position: relative;
  word-spacing: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}
:host([two-option]) .label-out {
  font-size: initial;
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
  word-spacing: initial;
}
:host([two-option]) ::slotted(*) {
  display: inline-block;
  font-size: initial;
  word-spacing: initial;
}
${nr.mediaRules()}`;const cr=new r;var dr=t`[ambient^=dark] {
  --bbva-form-radio-group-help-icon-color: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
  --bbva-form-radio-group-help-icon-active-color: var(--colorsPrimarySubduedLight, ${i(n.primarySubduedLight)});
  --bbva-form-radio-group-label-out-color: var(--colorsPrimaryCoreLightened, ${i(n.primaryCoreLightened)});
}

[ambient=dark400] {
  --bbva-form-radio-group-help-icon-color: var(--colorsPrimarySubdued, ${i(n.primarySubdued)});
  --bbva-form-radio-group-help-icon-active-color: var(--colorsPrimaryMediumLight, ${i(n.primaryMediumLight)});
}
${cr.mediaRules()}`;var hr=t`[ambient^=light] {
  --bbva-form-radio-help-icon-color: initial;
  --bbva-form-radio-help-icon-active-color: initial;
  --bbva-form-radio-group-label-out-color: initial;
}
${(new r).mediaRules()}`;const pr={dark:t`
    ${dr}
    ${It.dark}
    ${M.dark}
    ${rr.dark}
    ${T.dark}
  `,light:t`
    ${hr}
    ${It.light}
    ${M.light}
    ${rr.light}
    ${T.light}
  `};class ur extends(l(c(L(h)))){static get is(){return"bbva-form-radio-group"}static get scopedElements(){return{"bbva-form-radio-button":Et,"bbva-notification-help":or,"bbva-text":u,"bbva-link":P}}static get properties(){return{name:{type:String,reflect:!0},items:{type:Array},selected:{type:Number,reflect:!0},readonly:{type:Boolean},required:{type:Boolean},disabled:{type:Boolean},invalid:{type:Boolean,reflect:!0},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},twoOption:{type:String,reflect:!0,attribute:"two-option"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},labelOut:{type:String,attribute:"label-out"},helpIcon:{type:Boolean,attribute:"help-icon"},optionalLabel:{type:String,attribute:"optional-label"},linkHref:{type:String,attribute:"link-href"},linkAccessibilityText:{type:String,attribute:"link-accessibility-text"}}}constructor(){super(),this.items=[],this.selected=-1,this.errorIcon=A(),this.errorIconSize=16,this.infoIcon=w(),this.infoIconSize=16,this.name=`form-radio-group-${((e=10)=>`${Math.random().toString(36).substr(2,e)}`)()}`,this.optionalLabel="bbva-form-radio-group-optional-label",this.linkAccessibilityText="bbva-form-radio-group-link-accessibility-text"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.getAttribute("role")||this.setAttribute("role","radiogroup"),this.addEventListener("slotschanges",(e=>this._setRadioName(e)))}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("slotschanges",this._setRadioName())}_setRadioName(e){(((e||{}).detail||{}).contentSlots||[]).forEach((e=>{const t=(e||{}).assignedNodes;"bbva-form-radio-button"===(t.getAttribute("data-tag-name")||(t||{}).nodeName).toLowerCase()&&(t.name=this.name)}))}get radioItems(){return Array.from(this.querySelectorAll('[data-tag-name="bbva-form-radio-button"]'))}firstUpdated(e){super.firstUpdated&&super.firstUpdated(e),this._itemsContainer=this.shadowRoot.querySelector(".form-radio-group-container"),this._itemsContainer&&this.appendChild(this._itemsContainer.content),this.addEventListener("change",(e=>this._updateItems(e)))}updated(e){if(super.updated&&super.updated(e),e.has("selected")&&this.radioItems.length)if(Number.isFinite(this.selected)&&this.selected>-1&&this.selected<this.radioItems.length)this.radioItems[this.selected].checked=!0;else{const e=this.radioItems.find((e=>e.checked));e&&(e.checked=!1)}e.has("disabled")&&this.radioItems.length&&(this.setAttribute("aria-disabled",this.disabled.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].disabled=this.disabled}))),e.has("invalid")&&this.radioItems.length&&(this.setAttribute("aria-invalid",this.invalid.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].invalid=this.invalid}))),e.has("readonly")&&this.radioItems.length&&(this.setAttribute("aria-readonly",this.readonly.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].readonly=this.readonly}))),e.has("required")&&this.radioItems.length&&(this.setAttribute("aria-required",this.required.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].required=!1})),this.radioItems[0].required=!0)}_updateItems(e){const t=this.radioItems.indexOf(e.target);this.selected=t,this.invalid=!1,this.dispatchEvent(new CustomEvent("form-radio-group-item-change",{detail:{value:e.target.value,selected:t},bubbles:!0,composed:!0}))}_helpClicked(e){e.stopPropagation(),this.dispatchEvent(new CustomEvent("bbva-form-radio-group-help-click",{detail:!0,bubbles:!0,composed:!0}))}get _helpIcon(){return this.helpIcon?g`
        <bbva-link
          aria-label="${this.t(this.linkAccessibilityText)}"
          icon-size="24"
          @click="${this._helpClicked}"
          href="${D(this.linkHref)}"
          icon="${I()}"
        >
        </bbva-link>
      `:""}get _labelOut(){if(this.labelOut){const e=this.t(this.labelOut);return g`
        <div class="label-out">
          <bbva-text
            id="labelOutText"
            unset
            class="label-out-text"
            text="${this.required?e:`${e} ${this.t(this.optionalLabel)}`}"
            size="S"
          >
          </bbva-text>
          ${this._helpIcon}
        </div>
      `}return""}static get styles(){return[lr,m("bbva-form-radio-group-shared-styles"),pr.dark,pr.light]}render(){return g`
      ${this._labelOut}
      <slot></slot>
      <template class="form-radio-group-container">
        ${this.items.map((e=>g`
            <bbva-form-radio-button
              .name="${this.name}"
              .value="${e.value}"
              label="${e.label}"
              divider="${D(e.divider)}"
              ?disabled="${e.disabled}"
              ?checked="${e.checked}"
              ?required="${e.required}"
              ?label-medium="${e.labelMedium}"
              .errorIcon="${this.errorIcon}"
              .errorIconSize="${this.errorIconSize}"
              .errorMessage="${e.invalid?e.errorMessage:""}"
              .infoIcon="${this.infoIcon}"
              .infoIconSize="${this.infoIconSize}"
              .infoMessage="${e.infoMessage}"
              accessibility-icon-info-notification="${D(e.accessibilityIconInfo)}"
              accessibility-icon-alert-notification="${D(e.accessibilityIconAlert)}"
              variant="${D(e.variant)}"
            >
              ${e.text?O(e.text):e.label}
            </bbva-form-radio-button>
          `))}
      </template>
      ${this.invalid&&this.errorMessage?g`
            <bbva-notification-help
              class="alert"
              .icon="${this.errorIcon}"
              .iconSize="${this.errorIconSize}"
              .text="${this.errorMessage}"
              hide-top-padding
              hide-bottom-padding
              hide-left-padding
              hide-right-padding
            ></bbva-notification-help>
          `:""}
    `}}b("colors.primarySubdued"),b("colors.primaryMediumLight"),b("colors.primaryCoreLightened");var mr=t`.order-left-text {
  text-align: left;
}

.order-online-elements {
  display: flex;
}
.order-online-elements [data-tag-name=bbva-form-radio-button] {
  margin-left: calc(((5.625 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}
.order-online-elements [data-tag-name=bbva-form-radio-button]:nth-child(1) {
  margin-left: 0;
}

.space-button-bottom {
  margin-bottom: calc(((3.75 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}

.footer-button {
  margin-top: auto;
  width: 100%;
  display: flex;
  justify-content: center;
}

.main-container {
  height: 80vh;
  display: flex;
  flex-direction: column;
}
`;class gr extends(y(Xe(f(c(h))))){static get is(){return"emergency-services-step"}static get properties(){return{disableButton:{type:Boolean,attribute:"disable-button"},crashReportAnswer:{type:Object,attribute:"crash-report-answer"},resetEmergencyServices:{type:Boolean,attribute:"reset-emergency-services"}}}static get styles(){return[mr,be.light,T.light,It.light,pr.light,m("emergency-services-step-shared-styles")]}static get scopedElements(){const e=[ge,u,Et,ur,...gr.configurationScopedElements()];return gr.scopedElementsFromClasses(e)}constructor(){super(),this.disableButton=!1,this.crashReportAnswer={},this.resetEmergencyServices=!1}updated(e){super.updated(e),e.has("resetEmergencyServices")&&this._resetEmergencyServicesStep()}_resetEmergencyServicesStep(){this.crashReportAnswer={},this.disableButton=!1}_checkRadioButtonState(){const{valueambulance:e="-1",valuestatus:t="-1"}=this.crashReportAnswer,i=Number(e)>=0,s=Number(t)>=0;return i&&s}_handleSelectedRadioButton(e){const{detail:t}=e,i={id:t.value.split("-")[0],answer:t.value.split("-")[1]},s={0:"emergency-vehicle-crash-reports-first-answer",1:"emergency-vehicle-crash-reports-second-answer",ambulance:"emergency-vehicle-crash-reports-emergency-services-ambulance-question",status:"emergency-vehicle-crash-reports-emergency-services-vehicle-works-question"};this.crashReportAnswer={...this.crashReportAnswer,[`question${i.id}`]:s[i.id],[`answer${i.id}`]:s[i.answer],[`value${i.id}`]:i.answer},this.disableButton=this._checkRadioButtonState()}_buildQuestionSection(e,t){return g`
      <bbva-text text="${this.t(e.text)}" size="M" font-weight="500"> </bbva-text>
      <div
        class="order-left-text"
        @form-radio-group-item-change="${this._handleSelectedRadioButton}"
      >
        <bbva-form-radio-group
          selected="${t}"
          selectedname="${e.id}"
          class="order-online-elements"
        >
          <bbva-form-radio-button aria-label="${null==e?void 0:e.firstAria}" value="${e.id}-0">
            ${this.t("emergency-vehicle-crash-reports-first-answer")}
          </bbva-form-radio-button>
          <bbva-form-radio-button aria-label="${null==e?void 0:e.secondAria}" value="${e.id}-1">
            ${this.t("emergency-vehicle-crash-reports-second-answer")}
          </bbva-form-radio-button>
        </bbva-form-radio-group>
      </div>
    `}get _buildFooterButton(){return g`
      <div class="footer-button">
        <bbva-button-default
          class="space-button-bottom"
          aria-label="${this.t("emergency-vehicle-crash-reports-accessibility-button-emergency-services")}"
          ?disabled="${!this.disableButton}"
          @click="${()=>{this._dispatchCustomEvent("complete"),this.disableButton&&this._dispatchCustomEvent("emergency-vehicle-crash-reports-emergency-services-select",this.crashReportAnswer)}}"
        >
          ${this.t("emergency-vehicle-crash-reports-continue-button")}
        </bbva-button-default>
      </div>
    `}get _buildEmergencyServicesFormTemplate(){var e,t;return g`
      <div class="main-container" ambient="light">
        ${this._buildQuestionSection({text:"emergency-vehicle-crash-reports-emergency-services-ambulance-question",id:"ambulance",firstAria:this.t("emergency-vehicle-crash-reports-accessibility-ambulance-first-question"),secondAria:this.t("emergency-vehicle-crash-reports-accessibility-ambulance-second-question")},null===(e=this.crashReportAnswer)||void 0===e?void 0:e.valueambulance)}
        ${this._buildQuestionSection({text:"emergency-vehicle-crash-reports-emergency-services-vehicle-works-question",id:"status",firstAria:this.t("emergency-vehicle-crash-reports-accessibility-vehicle-first-question"),secondAria:this.t("emergency-vehicle-crash-reports-accessibility-vehicle-second-question")},null===(t=this.crashReportAnswer)||void 0===t?void 0:t.valuestatus)}
        ${this._buildFooterButton}
      </div>
    `}render(){return g`
      ${this._buildEmergencyServicesFormTemplate}
    `}}var br=t`.slotted-map {
  height: 100%;
  text-align: initial;
}
.slotted-map > [data-tag-name=bbva-map-dynamic] {
  height: 100%;
}

[data-tag-name=bbva-help-modal][visible] {
  transform: translateZ(0.1px);
}
`;class vr extends(y(c(f(Xe(h))))){static get is(){return"change-report-location-modal"}static get properties(){return{visible:{type:Boolean},apiKey:{type:String,attribute:"api-key"},geoLocation:{type:Object},contactDataIsUsed:{type:Boolean,attribute:"contact-data-is-used"},hideIconText:{type:Boolean,attribute:"hide-icon-text"}}}static get styles(){return[br,T.light,Ht.light,m("change-report-location-modal-shared-styles")]}static get scopedElements(){const e=[Qe,u,Bt,...vr.configurationScopedElements()];return vr.scopedElementsFromClasses(e)}constructor(){super(),this.iOSFixedHeader=!1,this.visible=!1,this.geolocation={},this.apiKey="",this.contactDataIsUsed=!1,this.hideIconText=!1}render(){return g`
      <bbva-help-modal
        id="change-report-location-modal"
        .closeModalElements="${["header-right-primary","footer-link","footer-button"]}"
        ambient="light"
        header-text="${this.t("emergency-vehicle-crash-reports-change-location-header")}"
        ?visible="${this.visible}"
        fixed-footer
        full-height
        hide-content-padding-top
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        link-text="${this.contactDataIsUsed?"":this.t("emergency-vehicle-crash-reports-close-change-location-link")}"
        button-text="${this.t("emergency-vehicle-crash-reports-change-location-button")}"
        aria-label="${this.t("emergency-vehicle-crash-reports-accessibility-modal",{modalTitle:"change-report-location"})}"
        header-close-icon-label="${this.hideIconText?"":this.t("emergency-vehicle-crash-reports-close-change-location-modal")}"
        header-close-icon-aria-label="${this.t("emergency-vehicle-crash-reports-close-change-location-modal-accessibility-text")}"
      >
        <div slot="slot-content" class="slotted-map">
          <bbva-map-dynamic
            accessibility-button-action="${this.t("emergency-vehicle-crash-reports-accessibility-change-location")}"
            hidden-large-button
            variant="large"
            api-key="${this.apiKey}"
            is-draggable-pin
            .label="${this.t("emergency-vehicle-crash-reports-change-location-search-input")}"
            predictive-info-message="${this.t("emergency-vehicle-crash-reports-predictive-info-message")}"
            show-predictive
            optional-input-label=""
            hide-map-info-footer
            .geoLocation="${this.geoLocation}"
            @map-dynamic-map-ready="${()=>{this._dispatchCustomEvent("emergency-vehicle-crash-reports-change-report-location-modal-map-ready")}}"
          >
          </bbva-map-dynamic>
        </div>
      </bbva-help-modal>
    `}}var yr=t`:host {
  display: block;
  box-sizing: border-box;
  --bbva-expandable-accordion-padding: grid8Spacer(16px) 0;
}

:host([hidden]), [hidden] {
  display: none !important;
}

.text-and-form-content {
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
  --bbva-text-color: var(--colorsSecondary500, ${i(n.secondary500)});
}

.contact-person {
  --bbva-text-color: var(--colorsSecondary500, ${i(n.secondary500)});
}

.masked-number {
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-form-text] {
  text-align: left;
}

[data-tag-name=bbva-form-number] {
  text-align: left;
}

.step-description {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
  --bbva-text-color: var(--colorsSecondary600, ${i(n.secondary600)});
}

.footer-button {
  margin-top: auto;
  width: 100%;
  display: flex;
  justify-content: center;
  flex-direction: column;
  align-items: center;
}

.order-template {
  height: 80vh;
  display: flex;
  flex-direction: column;
}

.space-button-bottom {
  margin-bottom: calc(((3.75 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}
`;class fr extends(y(Xe(f(c(h))))){static get is(){return"user-contact-step"}static get properties(){return{contactDefault:{type:Object,attribute:"contact-default"},alternativeContactInfo:{type:Object,attribute:"alternative-contact-info"},firstOptionOpened:{type:Boolean,attribute:"first-option-opened"},secondOptionOpened:{type:Boolean,attribute:"second-option-opened"},disableButton:{type:Boolean,attribute:"disable-button"},phoneDetails:{type:Object,attribute:"phone-details"},alternateContactNameInvalid:{type:Boolean,attribute:"alternate-contact-name-invalid"},resetUserContactStep:{type:Boolean,attribute:"reset-user-contact-step"},maskChars:{type:String,attribute:"mask-chars"}}}static get styles(){return[yr,be.light,T.light,Le.light,Ft.light,Gt.light]}static get scopedElements(){const e=[ge,u,Pe,zt,Ut,...fr.configurationScopedElements()];return fr.scopedElementsFromClasses(e)}constructor(){super(),this.contactDefault={},this.alternativeContactInfo={},this.firstOptionOpened=!1,this.secondOptionOpened=!1,this.disableButton=!1,this.phoneDetails={},this.alternateContactNameInvalid=!1,this.alternateContactPhoneInvalid=!1,this.resetUserContactStep=!1,this.maskChars="••••"}updated(e){super.updated(e),e.has("resetUserContactStep")&&this._resetStepsView()}_resetStepsView(){this.firstOptionOpened=!0,this.alternativeContactInfo.name="",this.alternativeContactInfo.phoneNumber="",this.alternateContactNameInvalid=!1,this.alternateContactPhoneInvalid=!1}_setAccordionState(e,t){"default-user-contact"===t?this.firstOptionOpened=e:"alternative-user-contact"===t&&(this.secondOptionOpened=e)}_focusOnExpandableAccordion(e="default-user-contact"){this.shadowRoot.querySelectorAll("[data-tag-name=bbva-expandable-accordion]").forEach((t=>{t.id!==e&&(t.opened=!1)}))}_handleUserContactSummary(e){e.stopPropagation();const{target:t,detail:i}=e;this._setAccordionState(i,t.id),i&&(this._focusOnExpandableAccordion(t.id),"default-user-contact"!==t.id||this._isUsingAlternativeContactInfo()||(this.disableButton=!1))}_maskedPhone(e=""){var t;return Ae(e,this.maskChars,!0,null===(t=this.phoneDetails)||void 0===t?void 0:t.visibleChars)}_finishContactStep(){let e={};var t,i;this._isUsingAlternativeContactInfo()?e={...this.alternativeContactInfo,id:"OTHER",encryptedPhone:this._maskedPhone(null===(t=this.alternativeContactInfo)||void 0===t?void 0:t.phoneNumber)}:e={...this.contactDefault,id:"HOLDER",encryptedPhone:this._maskedPhone(null===(i=this.contactDefault)||void 0===i?void 0:i.phoneNumber)};this._dispatchCustomEvent("complete"),this._dispatchCustomEvent("emergency-vehicle-crash-reports-user-contact-step-button-default-user-contact-summary-select",e)}_insertBbvaText(e,t,i,s){return g`
      <bbva-text
        ?inherit="${s}"
        class="${i}"
        text="${this.t(`${e}`)}"
        size="${t}"
      >
      </bbva-text>
    `}_isUsingAlternativeContactInfo(){const{name:e,phoneNumber:t}=this.alternativeContactInfo;return!(!e&&!t)||(this.alternateContactNameInvalid=!1,this.alternateContactPhoneInvalid=!1,!1)}_isAlternativeContactInfoValid(){var e;const{name:t="",phoneNumber:i=""}=this.alternativeContactInfo;return this.alternateContactNameInvalid=!t.length,!this.alternateContactNameInvalid&&(this.alternateContactPhoneInvalid=i.length<(null===(e=this.phoneDetails)||void 0===e?void 0:e.minLength),!this.alternateContactPhoneInvalid)}_inputUpdated(e,t){this.alternativeContactInfo[e]=t,this.disableButton=!!this._isUsingAlternativeContactInfo()&&!this._isAlternativeContactInfoValid()}get _buildAlternativeContact(){var e,t,i;return g`
      <bbva-expandable-accordion
        ambient="light"
        id="alternative-user-contact"
        clip-box
        row-title="${this.t("emergency-vehicle-crash-reports-third-step-other-person")}"
        icon="${De()}"
        align-title
        ?opened="${this.secondOptionOpened}"
        @expandable-accordion-open-change="${this._handleUserContactSummary}"
      >
        <div>
          <bbva-form-text
            class="text-and-form-content"
            id="alternative-contact-name"
            label="${this.t("emergency-vehicle-crash-reports-name-input")}"
            optional-label=" "
            .value="${(null===(e=this.alternativeContactInfo)||void 0===e?void 0:e.name)||""}"
            @input="${e=>this._inputUpdated("name",e.target.value)}"
            ?invalid="${this.alternateContactNameInvalid}"
            error-message="${this.t("emergency-vehicle-crash-reports-error-input-name")}"
            .maxlength="${40}"
            allowed-pattern="^[a-zA-Z ]"
          >
          </bbva-form-text>
          <bbva-form-number
            class="text-and-form-content masked-number"
            id="alternative-phone-number"
            label="${this.t("emergency-vehicle-crash-reports-phone-input")}"
            allowed-pattern="[0-9]"
            optional-label=" "
            .maxlength="${null===(t=this.phoneDetails)||void 0===t?void 0:t.maxLength}"
            info-message="${this.t("emergency-vehicle-crash-reports-phone-input-message")}"
            .value="${null===(i=this.alternativeContactInfo)||void 0===i?void 0:i.phoneNumber}"
            ?invalid="${this.alternateContactPhoneInvalid}"
            @input="${e=>this._inputUpdated("phoneNumber",e.target.value)}"
            error-message="${this.t("emergency-vehicle-crash-reports-error-input-phone-number")}"
          >
          </bbva-form-number>
        </div>
      </bbva-expandable-accordion>
    `}get _buildUserContactDefault(){var e,t;return g`
      <bbva-expandable-accordion
        ambient="light"
        id="default-user-contact"
        clip-box
        row-title="${this.t("emergency-vehicle-crash-reports-third-step-own-info")}"
        icon="${Oe()}"
        align-title
        divider="full"
        ?opened="${this.firstOptionOpened}"
        @expandable-accordion-open-change="${this._handleUserContactSummary}"
      >
        <div>
          ${this._insertBbvaText("emergency-vehicle-crash-reports-third-step-first-section","M","contact-person",!0)}
          ${this._insertBbvaText(null===(e=this.contactDefault)||void 0===e?void 0:e.name,"M","",!0)}
          ${this._insertBbvaText("emergency-vehicle-crash-reports-third-step-second-section","M","text-and-form-content",!0)}
          ${this._insertBbvaText(this._maskedPhone(null===(t=this.contactDefault)||void 0===t?void 0:t.phoneNumber),"M","masked-number",!0)}
        </div>
      </bbva-expandable-accordion>
    `}get _buildUserDetails(){return g`
      ${this._insertBbvaText("emergency-vehicle-crash-reports-third-step-description","S","step-description",!0)}
      ${this._buildUserContactDefault} ${this._buildAlternativeContact}
    `}get _buildFooterButton(){return g`
      <div class="footer-button">
        <bbva-button-default
          class="space-button-bottom"
          ambient="light"
          id="user-contact-button"
          aria-label="${this.t("emergency-vehicle-crash-reports-accessibility-contact-details")}"
          ?disabled="${this.disableButton}"
          @click="${this._finishContactStep}"
        >
          ${this.t("emergency-vehicle-crash-reports-continue-button")}
        </bbva-button-default>
      </div>
    `}get _buildUserContactTemplate(){return g`
      <div ambient="light" class="order-template">
        ${this._buildUserDetails} ${this._buildFooterButton}
      </div>
    `}render(){return g`
      ${this._buildUserContactTemplate}
    `}}class _r extends(y(Xe(f(c(h))))){static get is(){return"crash-report-multistep-modal"}static get properties(){return{headerTitle:{type:String,attribute:"header-title"},visible:{type:Boolean},progressMultistepValue:{type:Number,attribute:"progress-multistep-bar"},apiKey:{type:String,attribute:"api-key"},isNative:{type:Boolean,attribute:"is-native"},geoLocation:{type:Object,attribute:"geo-location"},staticAddress:{type:String,attribute:"static-address"},addressComponents:{type:Object,attribute:"address-components"},hideProgressMulti:{type:Boolean,attribute:"hide-progress-multi"},emergencyServicesAnswer:{type:Object,attribute:"emergency-services-answer"},showNoticeOfPrivacy:{type:Boolean,attribute:"show-notice-of-privacy"},mapDynamicVisible:{type:Boolean,attribute:"map-dynamic-visible"},phoneNumberBbvaLineVehicle:{type:String,attribute:"phone-number-bbva-line-vehicle"},resetEmergencyServicesStep:{type:Boolean,attribute:"reset-emergency-services-step"},viewInfoModal:{type:Boolean,attribute:"view-info-modal"},personDataIsUsed:{type:Boolean,attribute:"person-data-is-used"},flowType:{type:Boolean,attribute:"flow-type"},contactDetails:{type:Object,attribute:"contact-details"},phoneDetails:{type:Object,attribute:"phone-details"},hasLocationPermissions:{type:Boolean,attribute:"has-location-permissions"},hideIconText:{type:Boolean,attribute:"hide-icon-text"},multiStepConfiguration:{type:Object,attribute:"multi-step-configuration"},multistepState:{type:Object,attribute:"multistep-state"},restoreMultistepState:{type:Object,attribute:"restore-multistep-state"},_staticGeolocation:{type:Object,state:!0},modalHeaderButtons:{type:Array,attribute:"modal-header-buttons"},_newGeoLocation:{type:Object,state:!0},_newStaticAddress:{type:String,state:!0},_mapReady:{type:Boolean,state:!0},_initialGeolocation:{type:Object,state:!0},_stepsToReset:{type:Array,state:!0}}}static get styles(){return[Ya,T.light,T.dark,M.light,be.light,Ne.light,m("crash-report-multistep-modal-shared-styles")]}static get scopedElements(){const e=[Qe,fe,ge,u,P,_e,ye,er,gr,We,fr,vr,..._r.configurationScopedElements()];return _r.scopedElementsFromClasses(e)}constructor(){super(),this.iOSFixedHeader=!1,this.apiKey="",this.isNative=!1,this.visible=!1,this.progressMultistepValue=0,this.geoLocation={},this.hideProgressMulti=!1,this.emergencyServicesAnswer={},this.showNoticeOfPrivacy=!1,this.multistepState={},this.mapDynamicVisible=!1,this.staticAddress="",this.headerTitle="",this.addressComponents={},this.phoneNumberBbvaLineVehicle="",this.resetEmergencyServicesStep=!1,this.viewInfoModal=!1,this.personDataIsUsed=!1,this.contactDetails={},this.phoneDetails={},this.hasLocationPermissions=!1,this.hideIconText=!1,this.multiStepConfiguration={},this.restoreMultistepState={},this.flowType=!1,this._newStaticAddress="",this._staticGeolocation={},this._initialGeolocation={},this._stepsToReset=[],this._mapReady=!1,this._contactSelected={},this._optionAutoSelected=-1,this._optionAmbulanceSelected=-1,this.modalHeaderButtons=[]}updated(e){var t;super.updated(e),e.has("geoLocation")&&this._mapReady&&this._setNewLocation(),e.has("visible")&&(this.visible?this._manageDynamicMapRequest():this._resetCrashReportMultistep()),(e.has("personDataIsUsed")||e.has("flowType"))&&(this.progressMultistepValue=100/this._steps.length),e.has("_mapReady")&&null!==(t=this.restoreMultistepState)&&void 0!==t&&t.multistep&&this._setLastMultistepState()}_setLastMultistepState(){var e;this.multistepState={...null===(e=this.restoreMultistepState)||void 0===e?void 0:e.multistep},this._setStepsState(),this._restoreStepsInfo()}get _steps(){return this.shadowRoot.querySelectorAll('[data-tag-name="bbva-expandable-step"]')}_setStepsState(){const e={"step-1":"reportLocationStep","step-3":"userContactDetail"};for(let t=0;t<this._steps.length;t+=1)this._steps[t].completed=this.multistepState[e[this._steps[t].id]]}_restoreStepsInfo(){var e,t;const{showPrivacyPanel:i,hideProgress:s,geolocation:a,barProgress:r,emergencyServicesAnswer:o={},contactSelected:n}=this.multistepState;this.showNoticeOfPrivacy=i,this.hideProgressMulti=s,this._staticGeolocation=null==a?void 0:a.coords,this.staticAddress=null==a?void 0:a.message,this.emergencyServicesAnswer=o,this._optionAutoSelected=null===(e=this.emergencyServicesAnswer)||void 0===e?void 0:e.valuestatus,this._optionAmbulanceSelected=null===(t=this.emergencyServicesAnswer)||void 0===t?void 0:t.valueambulance,this.progressMultistepValue=r,this._contactSelected=n}shouldUpdate(e){if(super.shouldUpdate(e),e.has("geoLocation")){if(this.viewInfoModal)return!1;const t=e.get("geoLocation");if(!t)return!0;const{lat:i,lng:s}=t;if(i===this.geoLocation.lat&&s===this.geoLocation.lng)return!1}return!0}_manageStateOfModals(e){const{target:t,detail:i}=e,s=t.getAttribute("data-tag-name"),a={"change-report-location-modal":e=>{this.mapDynamicVisible=e},"bbva-help-modal":()=>{this.visible=null==i?void 0:i.visible}};s in a&&a[`${s}`](i)}_handleRaiseReport(){const e={0:!0,1:!1},t=e[this.emergencyServicesAnswer.valueambulance],i=e[this.emergencyServicesAnswer.valuestatus];this._dispatchCustomEvent("emergency-vehicle-crash-reports-multistep-modal-report-send",{geolocation:this.geoLocation,fullAddress:this.staticAddress,composedAddress:this.addressComponents,...this.flowType&&{serviceQuiz:{injured:t,transit:i}},...this.personDataIsUsed&&{contactDetails:this._contactSelected}}),this.visible=!1}setEmergencyServicesAnswer({detail:e}){this.emergencyServicesAnswer={...e},this.multistepState={...this.multistepState,emergencyServicesAnswer:this.emergencyServicesAnswer},this._dispatchCustomEvent("emergency-vehicle-crash-reports-multistep-modal-multistep-update-state",{key:"multistep",data:this.multistepState})}async _setNewLocation(){await this.updateComplete,this._staticGeolocation={latitude:this.geoLocation.lat,longitude:this.geoLocation.lng},this._newGeoLocation={...this.geoLocation},this._dispatchCustomEvent("emergency-vehicle-crash-reports-multistep-modal-geolocation-change",this.geoLocation)}_getNewAddress({detail:{address:e}}){this.mapDynamicVisible?this._newStaticAddress=e.formatted_address:this.staticAddress=e.formatted_address;const t={route:{label:"route",uses:"long_name"},street_number:{label:"strNumber",uses:"long_name"},locality:{label:"city",uses:"long_name"},postal_code:{label:"postalCode",uses:"long_name"},country:{label:"country",uses:"short_name"}};let i={};for(const s of e.address_components||[]){const e=s.types.find((e=>t[e]));e&&(i={...i,[t[e].label]:s[t[e].uses]})}this.addressComponents={...i}}_setGeoLocation({detail:{geoLocation:e}}){this._newGeoLocation={...e}}_changeToNewLocation(){this.geoLocation={...this._newGeoLocation},this.staticAddress=this._newStaticAddress||this.staticAddress}_avoidChangeLocation(){this._newStaticAddress=this.staticAddress,this._newGeoLocation={...this.geoLocation}}_manageDynamicMapRequest(){this.hasLocationPermissions?this.isNative?this._dispatchCustomEvent("emergency-vehicle-crash-reports-multistep-modal-native-geolocation-request"):this._getWebCurrentPosition():!this.hasLocationPermissions&&this.visible&&this.mapDynamicVisible&&this._dispatchCustomEvent("emergency-vehicle-crash-reports-multistep-modal-location-permissions-open",!0)}_getWebCurrentPosition(){navigator.geolocation.getCurrentPosition((e=>{this.mapDynamicVisible?this._newGeoLocation={lat:e.coords.latitude,lng:e.coords.longitude}:this.geoLocation={lat:e.coords.latitude,lng:e.coords.longitude}}),(e=>{this._dispatchCustomEvent("emergency-vehicle-crash-reports-location-error",{code:e.code,message:e.message})}),{enableHighAccuracy:!0,timeout:5e3,maximumAge:0})}async _checkStepsState(){await this.updateComplete;let e=0;return this._steps.forEach((t=>{t.completed&&(e+=1)})),e===this._steps.length}async _manageStepsState({target:e}){const t="reportLocationStep"===e.id&&this._steps[1].completed?2:{reportLocationStep:1,emergencyServicesStep:2,userContactDetail:3}[e.id];this.progressMultistepValue=100/this._steps.length*(t+1),this.showNoticeOfPrivacy=await this._checkStepsState(),this.hideProgressMulti=await this._checkStepsState(),this.multistepState={...this.multistepState,[e.id]:!0,showPrivacyPanel:this.showNoticeOfPrivacy,hideProgress:this.hideProgressMulti,geolocation:{coords:this._staticGeolocation,message:this.staticAddress},contactSelected:this._contactSelected,barProgress:this.progressMultistepValue},this._dispatchCustomEvent("emergency-vehicle-crash-reports-multistep-modal-multistep-update-state",{key:"multistep",data:this.multistepState})}async _manageEditSteps(e){let t={};const i={"step-1":"reportLocationStep","step-2":"emergencyServicesStep","step-3":"userContactDetail"};this.progressMultistepValue=100/this._steps.length*e,this.showNoticeOfPrivacy=await this._checkStepsState(),this.hideProgressMulti=await this._checkStepsState();for(let e=0;e<this._steps.length;e+=1){const s=this._steps[e].id;t={...t,[i[s]]:this._steps[e].completed}}this.multistepState={...this.multistepState,...t,showPrivacyPanel:this.showNoticeOfPrivacy,hideProgress:this.hideProgressMulti,barProgress:this.progressMultistepValue},this._dispatchCustomEvent("emergency-vehicle-crash-reports-multistep-modal-multistep-update-state",{key:"multistep",data:this.multistepState})}get _multistepProgress(){return g`
      <bbva-progress-multistep-bar
        accessibility-text="${this.t("emergency-vehicle-crash-reports-accessibility-progress-bar")}"
        ?hidden=${this.hideProgressMulti}
        no-margin
        ambient="light"
        value="${this.progressMultistepValue}"
      >
      </bbva-progress-multistep-bar>
    `}_handleLeaveReport(e){var t;e.stopPropagation(),this._dispatchCustomEvent(null!==(t=this.multistepState)&&void 0!==t&&t.reportLocationStep?"emergency-vehicle-crash-reports-prevent-crash-report-leave":"emergency-vehicle-crash-reports-multistep-modal-close")}_setUserContactInfo({detail:e}){"alternative-info"===e.id&&(this.contactDetails.alternative={...e}),this._contactSelected=e}_smartAssistant(){const{smartAssistant:e}=this.multiStepConfiguration;return e?this._dispatchCustomEvent("emergency-vehicle-crash-reports-multistep-modal-smart-assistant-header-open"):this._dispatchCustomEvent("emergency-vehicle-crash-reports-multistep-modal-faqs-header-open")}_resetCrashReportMultistep(){const e=[];if(this._steps.length){for(let t=0;t<this._steps.length;t+=1)this._steps[t].completed=!1,this._steps[t].disabled=!0,e.push(t);this._steps[0].disabled=!1}this.multistepState={...this.multistepState,reportLocationStep:!1,emergencyServicesStep:!1,userContactDetail:!1},Object.keys(this._initialGeolocation).length&&this._mapReady&&this._dispatchCustomEvent("emergency-vehicle-crash-reports-multistep-modal-geolocation-change",this._initialGeolocation),this.staticAddress="",this.progressMultistepValue=100/this._steps.length,this.geoLocation={...this._initialGeolocation},this.showNoticeOfPrivacy=!1,this.hideProgressMulti=!1,this.resetEmergencyServicesStep=!this.resetEmergencyServicesStep,this.resetUserContactStep=!this.resetUserContactStep,this._stepsToReset=e}get _buildLocationReportStep(){return g`
      <bbva-expandable-step
        ambient="light"
        class="remove-overflow"
        id="step-1"
        step="0"
        total-steps="${this._steps.length}"
        disabled-target=".action"
        data-selector="step"
        current-step-label="${this.t("emergency-vehicle-crash-reports-step-label",{step:1,total:this._steps.length})}"
        header="${this.t("emergency-vehicle-crash-reports-first-step-header")}"
        edit-label="${this.t("emergency-vehicle-crash-reports-edit-step-link")}"
        hide-padding-left
        hide-padding-right
        hide-padding-top
        @complete="${this._manageStepsState}"
        @expandable-step-edit-step="${()=>{this._manageEditSteps(1)}}"
        @emergency-vehicle-crash-reports-report-location-dynamic-map-show="${()=>{this.mapDynamicVisible=!0}}"
      >
        <div class="content">
          <report-location-step
            .staticLocation="${this._staticGeolocation}"
            id="reportLocationStep"
            api-key="${this.apiKey}"
            ?is-loading="${!this.staticAddress}"
            static-location-message="${this.staticAddress}"
            ?contact-data-is-used="${this.multiStepConfiguration.contactDataIsUsed}"
          >
          </report-location-step>
        </div>
        <div class="summary container" slot="summary" ambient="dark">
          <bbva-text text="${this.staticAddress}" size="S" inherit></bbva-text>
        </div>
      </bbva-expandable-step>
    `}get _buildEmergencyServicesStep(){return g`
      <bbva-expandable-step
        ambient="light"
        class="remove-overflow"
        id="step-2"
        step="1"
        total-steps="${this._steps.length}"
        disabled-target=".action"
        data-selector="step"
        current-step-label="${this.t("emergency-vehicle-crash-reports-step-label",{step:2,total:this._steps.length})}"
        header="${this.t("emergency-vehicle-crash-reports-step-header")}"
        edit-label="${this.t("emergency-vehicle-crash-reports-edit-step-link")}"
        hide-padding-left
        hide-padding-right
        hide-padding-top
        @complete="${this._manageStepsState}"
        @expandable-step-edit-step="${()=>{this._manageEditSteps(2)}}"
        @emergency-vehicle-crash-reports-emergency-services-select="${this.setEmergencyServicesAnswer}"
      >
        <div class="content container">
          <emergency-services-step
            id="emergencyServicesStep"
            ?reset-emergency-services="${this.resetEmergencyServicesStep}"
          >
          </emergency-services-step>
        </div>
        <div class="summary" slot="summary" ambient="dark">
          ${this._buildEmergencyServicesSummarySec}
        </div>
      </bbva-expandable-step>
    `}get _buildUserContactStep(){return g`
      <bbva-expandable-step
        class="remove-overflow"
        id="step-3"
        step="2"
        total-steps="${this._steps.length}"
        disabled-target=".action"
        data-selector="step"
        hide-padding-top
        current-step-label="${this.t("emergency-vehicle-crash-reports-step-label",{step:this._steps.length,total:this._steps.length})}"
        header="${this.t("emergency-vehicle-crash-reports-third-step-header")}"
        edit-label="${this.t("emergency-vehicle-crash-reports-edit-step-link")}"
        @complete="${this._manageStepsState}"
        @expandable-step-edit-step="${()=>{this._manageEditSteps(this._steps.length)}}"
        @emergency-vehicle-crash-reports-user-contact-step-button-default-user-contact-summary-select="${this._setUserContactInfo}"
      >
        <div class="content">
          <user-contact-step
            ?reset-user-contact-step="${this.resetUserContactStep}"
            .phoneDetails="${this.phoneDetails}"
            .contactDefault="${this.contactDetails}"
            first-option-opened
            id="userContactDetail"
          >
          </user-contact-step>
        </div>
        <div class="summary" slot="summary" ambient="dark">
          ${this._buildContactSummary}
        </div>
      </bbva-expandable-step>
    `}get _buildContactSummary(){var e,t;return g`
      <div class="order-online-components">
        <bbva-text
          class="summary-list"
          text="${this.t("emergency-vehicle-crash-reports-name-input")}"
          size="S"
          inherit
        >
        </bbva-text>
        <bbva-text text="${null===(e=this._contactSelected)||void 0===e?void 0:e.name}" size="S" inherit> </bbva-text>
      </div>
      <div class="order-online-components">
        <bbva-text
          class="summary-list"
          text="${this.t("emergency-vehicle-crash-reports-phone-input")}"
          size="S"
          inherit
        >
        </bbva-text>
        <bbva-text text="${null===(t=this._contactSelected)||void 0===t?void 0:t.encryptedPhone}" size="S" inherit> </bbva-text>
      </div>
    `}get _buildEmergencyServicesSummarySec(){var e,t,i,s;return g`
      <div class="order-online-components container">
        <bbva-text
          class="summary-list"
          text="${null===(e=this.emergencyServicesAnswer)||void 0===e?void 0:e.questionambulance}"
          size="S"
          inherit
        >
        </bbva-text>
        <bbva-text text="${null===(t=this.emergencyServicesAnswer)||void 0===t?void 0:t.answerambulance}" size="S" inherit>
        </bbva-text>
      </div>
      <div class="order-online-components container">
        <bbva-text text="${null===(i=this.emergencyServicesAnswer)||void 0===i?void 0:i.questionstatus}" size="S" inherit>
        </bbva-text>
        <bbva-text text="${null===(s=this.emergencyServicesAnswer)||void 0===s?void 0:s.answerstatus}" size="S" inherit>
        </bbva-text>
      </div>
    `}get _buildLocationServicesAndContactDataSteps(){return g`
      <bbva-expandable-multistep
        ambient="light"
        hide-guillotine-animation
        hide-disabled-steps
        step-selector="[data-selector=step]"
        class="scrollable"
        scrolling-delay="600"
        scroll-animation-completed="600"
        .stepsToReset="${this._stepsToReset}"
        .finishAnimationStep="${500}"
      >
        ${this._buildLocationReportStep} ${this._buildEmergencyServicesStep}
        ${this._buildUserContactStep} ${this._buildPrivacyText}
      </bbva-expandable-multistep>
    `}get _buildLocationAndServicesSteps(){return g`
      <bbva-expandable-multistep
        ambient="light"
        hide-guillotine-animation
        hide-disabled-steps
        step-selector="[data-selector=step]"
        class="scrollable"
        scrolling-delay="600"
        scroll-animation-completed="600"
        .stepsToReset="${this._stepsToReset}"
        .finishAnimationStep="${500}"
      >
        ${this._buildLocationReportStep} ${this._buildEmergencyServicesStep}
        ${this._buildPrivacyText}
      </bbva-expandable-multistep>
    `}get _buildLocationAndContactDataStep(){return g`
      <bbva-expandable-multistep
        ambient="light"
        hide-guillotine-animation
        hide-disabled-steps
        step-selector="[data-selector=step]"
        class="scrollable"
        scrolling-delay="600"
        scroll-animation-completed="600"
        .stepsToReset="${this._stepsToReset}"
        .finishAnimationStep="${500}"
      >
        ${this._buildLocationReportStep} ${this._buildUserContactStep} ${this._buildPrivacyText}
      </bbva-expandable-multistep>
    `}get _buildLocationStep(){return g`
      <bbva-expandable-multistep
        ambient="light"
        hide-guillotine-animation
        hide-disabled-steps
        step-selector="[data-selector=step]"
        class="scrollable"
        scrolling-delay="600"
        scroll-animation-completed="600"
        .stepsToReset="${this._stepsToReset}"
        .finishAnimationStep="${500}"
      >
        ${this._buildLocationReportStep} ${this._buildPrivacyText}
      </bbva-expandable-multistep>
    `}_renderSteps(){let e="";return e=this.flowType&&this.personDataIsUsed?this._buildLocationServicesAndContactDataSteps:this.flowType&&!this.personDataIsUsed?this._buildLocationAndServicesSteps:!this.flowType&&this.personDataIsUsed?this._buildLocationAndContactDataStep:this._buildLocationStep,e}get _buildChangeReportLocationModal(){return g`
      <change-report-location-modal
        api-key="${this.apiKey}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ?visible="${this.mapDynamicVisible}"
        .geoLocation="${this._newGeoLocation}"
        ?contact-data-is-used="${this.multiStepConfiguration.contactDataIsUsed}"
        ?hide-icon-text="${this.hideIconText}"
        @emergency-vehicle-crash-reports-change-report-location-modal-map-ready="${()=>{this._mapReady=!0,Object.keys(this._initialGeolocation).length||(this._initialGeolocation={...this.geoLocation}),this._setNewLocation()}}"
        @map-dynamic-geolocation-request="${this._manageDynamicMapRequest}"
        @map-dynamic-address-changed="${this._getNewAddress}"
        @map-dynamic-geolocation-changed="${this._setGeoLocation}"
        @help-modal-footer-button-click="${this._changeToNewLocation}"
        @help-modal-header-right-primary-click="${this._avoidChangeLocation}"
        @help-modal-footer-link-click="${this._avoidChangeLocation}"
        @visible-changed="${this._manageStateOfModals}"
      >
      </change-report-location-modal>
    `}_showNoticeOfPrivacy(){var e;let t,i;null!==(e=this.multiStepConfiguration)&&void 0!==e&&e.privacyTermsPdf?(t="emergency-vehicle-crash-reports-multistep-modal-notice-of-privacy-pdf-open",i=this.multiStepConfiguration.pdfDocument):(t="emergency-vehicle-crash-reports-multistep-modal-notice-of-privacy-modal-open",i=!0),this._dispatchCustomEvent(t,i)}get _buildPrivacyText(){return g`
      <div ambient="light" ?hidden="${!this.showNoticeOfPrivacy}" class="privacy-text">
        <bbva-button-default
          @click="${this._handleRaiseReport}"
          aria-label="${this.t("emergency-vehicle-crash-reports-accessibility-summary")}"
          ?hidden="${!this.showNoticeOfPrivacy}"
          variant="positive"
          active
        >
          ${this.t("emergency-vehicle-crash-reports-report-button")}
        </bbva-button-default>
        <bbva-text
          class="privacy-text container"
          tag="span"
          text="${this.t(this.privacyDescription?this.privacyDescription:"emergency-vehicle-crash-reports-privacy-description-non-notification")}"
          size="M"
        >
        </bbva-text>
        <bbva-link @click="${this._showNoticeOfPrivacy}">
          ${this.t(this.privacyLinkText||"emergency-vehicle-crash-reports-notice-of-privacy-header")}
        </bbva-link>
      </div>
    `}get _buildMultistepModal(){return g`
      <bbva-help-modal
        id="crash-report-multistep-modal"
        header-text="${this.t(this.headerTitle)}"
        header-type="modal-initial"
        ?visible="${this.visible}"
        full-height
        avoid-icon-close-modal
        hide-content-padding-top
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        aria-label="${this.t("emergency-vehicle-crash-reports-accessibility-modal",{modalTitle:this.headerTitle})}"
        @modal-state-change="${this._manageStateOfModals}"
        @help-modal-header-click=${this._handleHeaderMainClick}
        header-close-icon-label="${this.hideIconText?"":this.t("emergency-vehicle-crash-reports-close-header-main")}"
        header-close-icon-aria-label="${this.t("emergency-vehicle-crash-reports-close-header-main-accessibility-text")}"
        .headerButtons="${this.modalHeaderButtons}"
      >
        <div slot="slot-content" ambient="light">
          ${this._multistepProgress} ${this._renderSteps()}
        </div>
      </bbva-help-modal>
    `}_handleHeaderMainClick(e){var t;const i=null==e||null===(t=e.detail)||void 0===t?void 0:t.index,s={0:()=>this._smartAssistant(),1:()=>this._handleLeaveReport(e)};null==s||s[i]()}render(){return g`
      ${this._buildMultistepModal} ${this._buildChangeReportLocationModal}
    `}}var Sr=t`:host {
  display: block;
  box-sizing: border-box;
  --bbva-help-modal-content-color: var(--colorsSecondary600, ${i(n.secondary600)});
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-text] {
  text-align: center;
}

[data-tag-name=bbva-clip-microillustration] {
  text-align: center;
}

.center-content {
  display: flex;
  flex-direction: column;
  align-items: center;
}

.order-online-components {
  display: flex;
  justify-content: space-between;
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}

.mid-space {
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(o.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-help-modal][visible] {
  transform: translateZ(0.1px);
}

.text-hour {
  display: inline-block;
}

[data-tag-name=bbva-link] {
  display: grid;
  place-items: center;
}
`;class $r extends(y(c(f(Xe(h))))){static get is(){return"crash-report-info-modal"}static get properties(){return{configInfoModal:{type:Object,attribute:"config-info-modal"},visible:{type:Boolean},hideIconText:{type:Boolean,attribute:"hide-icon-text"}}}static get styles(){return[Sr,M.light,T.light,xe.light,C.light,ke.light,be.light,Mt.light,Se.light,m("crash-report-info-modal-shared-styles")]}static get scopedElements(){const e=[Qe,Rt,P,u,$e,_,V,Ce,ge,...$r.configurationScopedElements()];return $r.scopedElementsFromClasses(e)}constructor(){super(),this.iOSFixedHeader=!1,this.visible=!1,this.configInfoModal={},this.hideIconText=!1}get _dynamicTemplates(){return{content:this._buildPanelText,panel:this._microillustrationImage,listDetails:this._buildListDetails,reportDetails:this._buildReportDetails,timeOutActive:this._buildTimerSection,options:this._buildRowButtons,footerConfig:this._buildFooterConfig}}_identifyCurrentModalId(e){var t;const i=null===(t=this.configInfoModal)||void 0===t?void 0:t.id;this._dispatchCustomEvent(`emergency-vehicle-crash-reports-info-modal-${i}-${e}`)}_manageInfoModalState(e){const{detail:t}=e;this._dispatchCustomEvent("emergency-vehicle-crash-reports-info-modal-state-change",null==t?void 0:t.visible);const i=null!=t&&t.visible?"open":"close";this._identifyCurrentModalId(i)}get _buildMicroillustrationPanel(){var e,t,i,s,a,r;return g`
      <bbva-clip-microillustration
        microillustration="${null===(e=this.configInfoModal)||void 0===e||null===(t=e.panel)||void 0===t?void 0:t.microillustration}"
        size="L"
        role="presentation"
      >
      </bbva-clip-microillustration>
      <bbva-text
        font-weight="500"
        inherit
        size="L"
        text="${this.t(`${null===(i=this.configInfoModal)||void 0===i||null===(s=i.panel)||void 0===s?void 0:s.heading}`)}"
      >
      </bbva-text>
      <bbva-text size="S" text="${this.t(`${null===(a=this.configInfoModal)||void 0===a||null===(r=a.panel)||void 0===r?void 0:r.description}`)}">
      </bbva-text>
    `}get _buildListDetails(){var e;return g`
      <div slot="slot-content">
        ${Je(null===(e=this.configInfoModal)||void 0===e?void 0:e.listDetails,(e=>e.id),(e=>g`
            <div class="order-online-components">
              <bbva-text text="${this.t(`${null==e?void 0:e.detail}`)}" size="S" inherit> </bbva-text>
              ${"date"===(null==e?void 0:e.id)?g`
                    <div>
                      <bbva-date
                        date="${this.t(`${null==e?void 0:e.description}`)}"
                        options='{"day":"2-digit","month":"long","year":"numeric","hour":"2-digit","minute":"2-digit","hour12":false}'
                        clockSuffix
                        .locale="${this.locale}"
                      >
                      </bbva-date>
                      <bbva-text
                        class="text-hour"
                        alignment="right"
                        text="h"
                        size="S"
                        font-weight="500"
                        font-style="italic"
                        inherit
                      >
                      </bbva-text>
                    </div>
                  `:g`
                    <bbva-text
                      text="${this.t(`${null==e?void 0:e.description}`)}"
                      size="S"
                      font-weight="500"
                      inherit
                    >
                    </bbva-text>
                  `}
            </div>
          `))}
      </div>
    `}get _progressTimer(){var e,t;return g`
      <bbva-progress-timer
        show-vertical
        tabindex="-1"
        timeout="${null===(e=this.configInfoModal)||void 0===e?void 0:e.totalMinutes}"
        time-alert="${null===(t=this.configInfoModal)||void 0===t?void 0:t.halfMinutes}"
        @progress-timer-counter-finish="${()=>{this.configInfoModal={...this.configInfoModal,callLinkDisabled:!1}}}"
      >
        <span>
          ${this.t("emergency-vehicle-crash-reports-timer-description-receipt")}
        </span>
      </bbva-progress-timer>
    `}get _callLink(){var e;return g`
      <bbva-link
        @click="${this._handleClickOnAssistanceLine}"
        ?disabled="${null===(e=this.configInfoModal)||void 0===e?void 0:e.callLinkDisabled}"
      >
        ${this.t("emergency-vehicle-crash-reports-timer-link-receipt")}
      </bbva-link>
    `}_handleClickOnAssistanceLine(){var e,t;this._dispatchCustomEvent(`${null===(e=this.configInfoModal)||void 0===e?void 0:e.eventName}-assistance-line-call`,null===(t=this.configInfoModal)||void 0===t?void 0:t.number)}_handleReceiptAction({detail:e}){var t;const i=null===(t=this.configInfoModal)||void 0===t?void 0:t.options[e];this._dispatchCustomEvent(`emergency-vehicle-crash-reports-ticket-${i.id}-click`,i.detail)}get _buttonRow(){var e;return g`
      <bbva-button-row
        .options="${null===(e=this.configInfoModal)||void 0===e?void 0:e.options}"
        @button-row-item-click="${this._handleReceiptAction}"
        accessibility-text="${this.t("emergency-vehicle-crash-reports-accessibility-button-row")}"
      ></bbva-button-row>
    `}_handleButtonClick(e){var t,i,s;e.stopPropagation(),"error-location-half-modal"===(null===(t=this.configInfoModal)||void 0===t?void 0:t.id)&&this._dispatchCustomEvent("emergency-vehicle-crash-reports-info-modal-state-change",!1),this._dispatchCustomEvent(`${null===(i=this.configInfoModal)||void 0===i?void 0:i.eventName}-button-click`,(null===(s=this.configInfoModal)||void 0===s?void 0:s.number)||!0)}_handleLinkClick(e){var t,i;e.stopPropagation(),"error-location-half-modal"===(null===(t=this.configInfoModal)||void 0===t?void 0:t.id)&&(this._dispatchCustomEvent("emergency-vehicle-crash-reports-info-modal-state-change",!1),this._dispatchCustomEvent("emergency-vehicle-crash-reports-info-modal-veil-close",!1)),this._dispatchCustomEvent(`${null===(i=this.configInfoModal)||void 0===i?void 0:i.eventName}-link-click`)}_handleVeilClick(e){var t;e.stopPropagation(),"error-location-half-modal"===(null===(t=this.configInfoModal)||void 0===t?void 0:t.id)&&(this._dispatchCustomEvent("emergency-vehicle-crash-reports-info-modal-state-change",!1),this._dispatchCustomEvent("emergency-vehicle-crash-reports-info-modal-veil-close",!1))}get _buildPanelText(){var e,t,i,s;return g`
      <div slot="slot-content">
        <bbva-text text="${this.t(`${null===(e=this.configInfoModal)||void 0===e||null===(t=e.content)||void 0===t?void 0:t.firstParagraph}`)}">
        </bbva-text>
        <bbva-text text="${this.t(`${null===(i=this.configInfoModal)||void 0===i||null===(s=i.content)||void 0===s?void 0:s.secondParagraph}`)}">
        </bbva-text>
      </div>
    `}get _microillustrationImage(){return g`
      <div slot="slot-content">
        ${this._buildMicroillustrationPanel}
      </div>
    `}get _buildTimerSection(){var e;return g`
      <div slot="slot-content">
        ${this._progressTimer}
        ${null!==(e=this.configInfoModal)&&void 0!==e&&e.showLinkUnderTimer?this._callLink:E}
      </div>
    `}get _buildRowButtons(){return g`
      <div slot="slot-content">
        ${this._buttonRow}
      </div>
    `}get _buildReportDetails(){var e,t,i,s;return g`
      <div slot="slot-content">
        <div class="center-content">
          <bbva-date
            date="${null===(e=this.configInfoModal)||void 0===e||null===(t=e.reportDetails)||void 0===t?void 0:t.operationDate}"
            options='{"day":"2-digit","month":"long","year":"numeric","hour":"2-digit","minute":"2-digit"}'
            clockSuffix
            .locale="${this.locale}"
          >
          </bbva-date>
        </div>
        <bbva-divider size="small center"> </bbva-divider>
        <bbva-text
          text="${this.t("emergency-vehicle-crash-reports-id-report")}"
          size="S"
          inherit
          class="mid-space"
        ></bbva-text>
        <bbva-text text="${null===(i=this.configInfoModal)||void 0===i||null===(s=i.reportDetails)||void 0===s?void 0:s.id}" size="3XL" inherit></bbva-text>
      </div>
    `}get _buildFooterConfig(){var e,t,i,s;return g`
      <div slot="slot-content">
        <div class="center-content">
          <bbva-button-default
            variant="primary"
            active
            @click="${()=>{this._dispatchCustomEvent("emergency-vehicle-crash-reports-leave-crash-reports-button-click")}}"
          >
            ${this.t(null===(e=this.configInfoModal)||void 0===e||null===(t=e.footerConfig)||void 0===t?void 0:t.exitButton)}
          </bbva-button-default>

          <bbva-text
            class="mid-space"
            text="${this.t(null===(i=this.configInfoModal)||void 0===i||null===(s=i.footerConfig)||void 0===s?void 0:s.assistanceText)}"
            size="S"
            inherit
          ></bbva-text>

          ${this._callLink}
        </div>
      </div>
    `}get _buildDynamicSuccessReceipt(){const e=Object.keys(this.configInfoModal);return Je(e,(e=>e.id),(e=>e in this._dynamicTemplates?this._dynamicTemplates[e]:E))}_buildAccessibilityText(){var e,t;return null===(e=this.configInfoModal)||void 0===e||null===(t=e.id)||void 0===t?void 0:t.split("-").join(" ")}render(){var e,t,i,s,a,r,o,n,l,c,d,h,p,u;return g`
      <bbva-help-modal
        id="${null===(e=this.configInfoModal)||void 0===e?void 0:e.id}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ?hide-content-padding-top="${null===(t=this.configInfoModal)||void 0===t?void 0:t.hidePaddingTop}"
        ?fixed-footer="${null===(i=this.configInfoModal)||void 0===i?void 0:i.fixedFooter}"
        ?full-height="${null===(s=this.configInfoModal)||void 0===s?void 0:s.fullHeight}"
        ?visible="${this.visible}"
        header-text="${this.t(`${null===(a=this.configInfoModal)||void 0===a?void 0:a.modalHeader}`)}"
        header-type="${null===(r=this.configInfoModal)||void 0===r?void 0:r.headerType}"
        modal-type="${null===(o=this.configInfoModal)||void 0===o?void 0:o.modalType}"
        title-icon="${null===(n=this.configInfoModal)||void 0===n?void 0:n.icon}"
        body-text="${this.t(null===(l=this.configInfoModal)||void 0===l?void 0:l.bodyText)}"
        button-text="${this.t(`${null===(c=this.configInfoModal)||void 0===c?void 0:c.buttonText}`)}"
        link-text="${this.t(null===(d=this.configInfoModal)||void 0===d?void 0:d.linkText)}"
        title-text="${this.t((null===(h=this.configInfoModal)||void 0===h?void 0:h.titleText)||"")}"
        ambient="light"
        aria-label="${this.t("emergency-vehicle-crash-reports-accessibility-modal",{modalTitle:(null===(p=this.configInfoModal)||void 0===p?void 0:p.modalHeader)||this._buildAccessibilityText()})}"
        .closeModalElements="${null===(u=this.configInfoModal)||void 0===u?void 0:u.closeModalElements}"
        @modal-state-change="${this._manageInfoModalState}"
        @help-modal-veil-click="${this._handleVeilClick}"
        @help-modal-footer-button-click="${this._handleButtonClick}"
        @help-modal-footer-link-click="${this._handleLinkClick}"
        header-close-icon-label="${this.hideIconText?"":this.t("emergency-vehicle-crash-reports-close-help-modal")}"
        header-close-icon-aria-label="${this.t("emergency-vehicle-crash-reports-close-help-modal-accessibility-text")}"
      >
        ${this._buildDynamicSuccessReceipt}
      </bbva-help-modal>
    `}}var xr=t`:host {
  display: block;
  box-sizing: border-box;
  --bbva-transition-container-padding: 0;
  --bbva-transition-container-text-align: left;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=help-faqs-aem] {
  height: auto;
}
`;class Cr extends(y(f(Xe(c(h))))){static get scopedElements(){const e=[Vt,Tt,We,...Cr.configurationScopedElements()];return Cr.scopedElementsFromClasses(e)}static get is(){return"emergency-vehicle-crash-reports-faqs-menu"}static get properties(){return{showMenuFaqs:{type:Boolean,attribute:"show-menu-faqs"},faqsConfigurations:{type:Object,attribute:"faqs-configurations"},visibleDetail:{type:Boolean,attribute:"visible-detail"},_headingLevel:{type:Number,state:!0},hideIconText:{type:Boolean,attribute:"hide-icon-text"}}}constructor(){super(),this.showMenuFaqs=!1,this.visibleDetail=!1,this._headingLevel=2,this.faqsConfigurations={},this.hideIconText=!1}static get styles(){return[xr,kt.light,m("emergency-vehicle-crash-reports-faqs-menu")]}render(){return g`
      <bbva-transition-container
        header-type="first-level-sequential"
        header-show-left-icon
        ?visible=${this.showMenuFaqs}
        header-text="${this.t("emergency-vehicle-crash-reports-faqs-header-text")}"
        .closeModalElements="${["header-icon-left-primary"]}"
        @transition-container-close="${()=>{this._dispatchCustomEvent("emergency-vehicle-crash-reports-faqs-menu-header-return")}}"
        header-left-icon-label="${this.hideIconText?"":this.t("emergency-vehicle-crash-reports-return-header-main")}"
        header-left-icon-aria-label="${this.t("emergency-vehicle-crash-reports-return-header-main-accessibility-text")}"
        ><div slot="slot-content" ambient="light">
          <help-faqs-aem
            ?i-o-s-fixed-header="${this.iOSFixedHeader}"
            ?show-modal="${this.visibleDetail}"
            language="${this.language}"
            ?native="${this.native}"
            ?hide-icon-text="${this.hideIconText}"
            host="${this.faqsConfigurations.hostAEM}"
            content-fragment-path="${this.faqsConfigurations.contentFragmentPath}"
            hide-footer
            headingLevel="${this._headingLevel}"
            @help-faqs-aem-detail-link-click="${e=>{e.stopPropagation(),this._dispatchCustomEvent("emergency-vehicle-crash-reports-faqs-menu-help-faqs-aem-detail-link-click",e)}}"
            @help-modal-header-right-primary-click="${e=>{e.stopPropagation(),this._dispatchCustomEvent("emergency-vehicle-crash-reports-faqs-menu-help-modal-header-right-primary-click")}}"
          ></help-faqs-aem>
          <bbva-button-list
            icon="${z()}"
            title-text="${this.t("emergency-vehicle-crash-reports-detail-faqs-call")}"
            text="${this.faqsConfigurations.phoneNumberBbvaLineVehicle}"
            @click="${()=>{this._dispatchCustomEvent("emergency-vehicle-crash-reports-faqs-menu-button-list-call-bbva-line",this.faqsConfigurations.phoneNumberBbvaLineVehicle)}}"
          ></bbva-button-list>
        </div>
      </bbva-transition-container>
    `}}class Tr extends(y(c(f(Xe(h))))){static get is(){return"emergency-vehicle-crash-reports"}static get properties(){return{apiKey:{type:String,attribute:"api-key"},geoLocation:{type:Object,attribute:"geo-location"},multistepModalVisible:{type:Boolean,attribute:"multistep-modal-visible"},publicSettingsId:{type:String,attribute:"public-settings-id"},publicSettingsKey:{type:String,attribute:"public-settings-key"},vehicleInsuranceId:{type:String,attribute:"vehicle-insurance-id"},fieldsProperty:{type:String,attribute:"fields-property"},subProductType:{type:String,attribute:"sub-product-type"},requestServices:{type:Boolean,attribute:"request-services"},viewPolicy:{type:String,attribute:"view-policy"},ticketSharing:{type:String,attribute:"ticket-sharing"},viewPolicyVisible:{type:Boolean,attribute:"view-policy-visible"},appSettingsApiVersion:{type:String,attribute:"app-settings-api-version"},vehicleInsuranceApiVersion:{type:String,attribute:"vehicle-insurance-api-version"},lossesReportRequestApiVersion:{type:String,attribute:"losses-report-requests-api-version"},publicSettings:{type:Array},vehicleInsurance:{type:Object},phoneNumberBbvaLineVehicle:{type:String,attribute:"phone-number-bbva-line-vehicle"},phoneNumberBbvaLine:{type:String,attribute:"phone-number-bbva-line"},productTypeVehicleInsurance:{type:String,attribute:"product-type-vehicle-insurance"},viewCallVisible:{type:Boolean,attribute:"view-call-visible"},viewInfoModal:{type:Boolean,attribute:"view-info-modal"},contactDataIsUsed:{type:Boolean,attribute:"contact-data-is-used"},smartAssistant:{type:Boolean,attribute:"smart-assistant"},privacyTermsPdf:{type:Boolean,attribute:"privacy-terms-pdf"},pdfDocument:{type:String,attribute:"pdf-document"},vehicleType:{type:String,attribute:"vehicle-type"},phoneDetails:{type:Object,attribute:"phone-details"},multiStepConfiguration:{type:Object,attribute:"multi-step-configuration"},faqsConfigurations:{type:Object,attribute:"faqs-configurations"},personDataIsUsed:{type:Boolean,attribute:"person-data-is-used"},flowType:{type:Boolean,attribute:"flow-type"},viewMenuFaqs:{type:Boolean,attribute:"view-menu-faqs"},numberOfAttemptOnGeolocation:{type:Number,attribute:"number-of-attempt-on-geolocation"},hasLocationPermissions:{type:Boolean,attribute:"has-location-permissions"},hideIconText:{type:Boolean,attribute:"hide-icon-text"},_configInfoModal:{type:Object,state:!0},_ticketConfig:{type:Object,state:!0},_contactDetails:{type:Object,state:!0},_dataModal:{type:Object,state:!0}}}static get styles(){return[Ja,m("emergency-vehicle-crash-reports-shared-styles")]}static get scopedElements(){const e=[$r,_r,Qa,Cr,...Tr.configurationScopedElements()];return Tr.scopedElementsFromClasses(e)}constructor(){super(),this.config={loader:!0},this.apiKey="",this.iOSFixedHeader=!1,this.native=!1,this.multistepModalVisible=!1,this.requiredToken="",this.appSettingsApiVersion="0",this.publicSettingsId="",this.publicSettingsKey="",this.publicSettings=[],this.vehicleInsuranceApiVersion="1",this.lossesReportRequestApiVersion="1",this.vehicleInsuranceId="",this.publicSettingsHost="",this.fieldsProperty="",this.vehicleInsurance={},this.subProductType="",this.requestServices=!1,this.viewPolicy="",this.ticketSharing="",this.viewPolicyVisible=!1,this.phoneNumberBbvaLineVehicle="",this.phoneNumberBbvaLine="",this.productTypeVehicleInsurance="",this.viewCallVisible=!1,this.geoLocation={},this.viewInfoModal=!1,this.contactDataIsUsed=!1,this.smartAssistant=!1,this.language="es",this.privacyTermsPdf=!1,this.pdfDocument="",this.vehicleType="",this.phoneDetails={},this.multiStepConfiguration={},this.faqsConfigurations={},this.personDataIsUsed=!1,this.viewMenuFaqs=!1,this.numberOfAttemptOnGeolocation=0,this.hasLocationPermissions=!1,this.hideIconText=!1,this.history={data:{}},this.flowType=!1,this._configInfoModal={},this._ticketConfig={},this._contactDetails={},this._policyNumber="",this._dataModal={},this._helpDescription="",this._multistepState={},this._modalHeaderButtons=[]}get dataManager(){return this.shadowRoot.querySelector("[data-tag-name='emergency-vehicle-crash-reports-dm']")}firstUpdated(){var e,t;(super.firstUpdated(),Object.keys(this.geoLocation).length||this.hasLocationPermissions||this._openErrorLocation(),"multistep"in(null===(e=this.history)||void 0===e?void 0:e.data))&&(this._multistepState={...null===(t=this.history)||void 0===t?void 0:t.data});this._modalHeaderButtons=[{id:"btn-help",name:"Help",icon:"es"===this.language&&this.smartAssistant?k():I(),accessibilityText:this.t("emergency-vehicle-crash-reports-secondary-header-main-accessibility-text"),label:this.hideIconText?"":this.t("emergency-vehicle-crash-reports-secondary-header-main")},{id:"btn-close",name:"Close",icon:j(),accessibilityText:this.t("emergency-vehicle-crash-reports-close-header-main-accessibility-text"),label:this.hideIconText?"":this.t("emergency-vehicle-crash-reports-close-header-main")}]}navigateBack(e=!0){e&&this._dispatchCustomEvent("navigation-go-back",e)}navigateForward(e=!1,t=!0,i={}){this._dispatchCustomEvent("navigation-go-forward",{id:"EmergencyVehicleCrashReports",params:{target:{id:"EmergencyVehicleCrashReports",params:i,history:{routes:[],data:{...this._dataModal,vehicleInsuranceData:this.vehicleInsurance,publicSettingsData:this.publicSettings,vehicleTypeData:this.vehicleType}}}},replace:e,external:t})}_saveFeatureState({detail:e}){const{key:t,data:i}=e;this._dataModal={...this._dataModal,[t]:i}}_resetMultistepVisibleModal(){this.multistepModalVisible=!1,this.viewInfoModal=!1}_appSettingsData({detail:e}){var t,i;const{helpDescription:s,flowType:a}=e;this._helpDescription=s?this.t("emergency-vehicle-crash-reports-header-modal"):"";const r=(null==e||null===(t=e.time)||void 0===t?void 0:t.halfMinutes)||"",o=(null==e||null===(i=e.time)||void 0===i?void 0:i.totalMinutes)||"",n=(null==e?void 0:e.timeOutActive)||!1;n&&(this._timeOutData={...this._timeOutData,halfMinutes:r,totalMinutes:o,timeOutActive:n}),this.multiStepConfiguration={language:this.language,smartAssistant:this.smartAssistant,privacyTermsPdf:this.privacyTermsPdf,pdfDocument:this.pdfDocument,contactDataIsUsed:this.contactDataIsUsed||!1},this.faqsConfigurations={phoneNumberBbvaLineVehicle:this.phoneNumberBbvaLineVehicle,hostAEM:null==e?void 0:e.hostAEM,contentFragmentPath:null==e?void 0:e.contentFragmentPath},this.personDataIsUsed=(null==e?void 0:e.personData)||!1,this.flowType=a}_getInsuranceData({detail:e}){const{firstName:t,lastName:i,number:s}=e;this._contactDetails={id:"HOLDER",name:`${t} ${i}`,phoneNumber:s,encryptedPhone:""}}_raiseReport({detail:e}){this.dataManager.createCrashReport(e)}_manageGeolocationAttempt(){this.numberOfAttemptOnGeolocation+=1,3===this.numberOfAttemptOnGeolocation&&(this.viewInfoModal=!1,this._openCallToAssistanceHalfModal())}_listedTicket(e,t,i){return{listDetails:[{id:"date",detail:"emergency-vehicle-crash-reports-date",description:e},{id:"policy",detail:"emergency-vehicle-crash-reports-policy",description:this._policyNumber},{id:"reportId",detail:"emergency-vehicle-crash-reports-id-report",description:t},{id:"reportType",detail:"emergency-vehicle-crash-reports-reporting-time",description:"emergency-vehicle-crash-reports-header-modal"}],...this._timeOutData,callLinkDisabled:!0,showLinkUnderTimer:!0,options:i,buttonText:"emergency-vehicle-crash-reports-leave-button"}}_nonListedTicket(e,t,i){return{reportDetails:{id:t,operationDate:e},...this._timeOutData,options:i,footerConfig:{exitButton:"emergency-vehicle-crash-reports-leave-button",assistanceText:"emergency-vehicle-crash-reports-timer-no-assistant-line"},callLinkDisabled:!0,showLinkUnderTimer:!1,buttonText:""}}_showSuccessView({detail:e}){const{operationDate:t,id:i}=e;let s=[];const a={icon:Ee(),label:this.t("emergency-vehicle-crash-reports-button-action-share-policy"),id:"share-receipt",detail:this.ticketSharing};s=[...s,a],this.viewPolicyVisible&&(s=[{icon:Ie(),label:this.t("emergency-vehicle-crash-reports-button-action-show-policy"),id:"policy-file",detail:this.viewPolicy},...s]);let r={};r=""!==this._policyNumber&&this.contactDataIsUsed?this._listedTicket(t,i,s):this._nonListedTicket(t,i,s);const o={id:"success-crash-report-modal",modalHeader:"emergency-vehicle-crash-reports-header-modal",headerType:"modal-initial",fullHeight:!0,hidePaddingTop:!0,icon:"",panel:{microillustration:"success",heading:"emergency-vehicle-crash-reports-success-header-view",description:"emergency-vehicle-crash-reports-success-description-view"},...r,number:this.phoneNumberBbvaLineVehicle,linkText:"",eventName:"emergency-vehicle-crash-reports-receipt",closeModalElements:["header-right-primary","footer-button"]};this._configInfoModal={...o},this.viewInfoModal=!0,this.clearLoader()}_initialRequestError(){this.multistepModalVisible=!1,this.openCommunicationErrorModal()}_openErrorLocation(){const e={id:"error-location-half-modal",modalType:"warning",modalHeader:"",icon:A(),fullHeight:!1,buttonText:"emergency-vehicle-crash-reports-retry-button",linkText:"emergency-vehicle-crash-reports-leave-button",bodyText:"emergency-vehicle-crash-reports-error-location-description",fixedFooter:!1,eventName:"emergency-vehicle-crash-reports-report-geolocation-failed",titleText:"emergency-vehicle-crash-reports-communication-interrupted",closeModalElements:["footer-link"]};this._configInfoModal={...e},this.viewInfoModal=!0}_openCallToAssistanceHalfModal(){const e={id:"call-to-assistance-assistance-modal",modalType:"warning",modalHeader:"",icon:A(),fullHeight:!1,buttonText:"emergency-vehicle-crash-reports-error-call-to-assistance",linkText:"emergency-vehicle-crash-reports-leave-button",bodyText:"emergency-vehicle-crash-reports-error-location-description",fixedFooter:!1,eventName:"emergency-vehicle-crash-reports-report-calling-to-assistance",titleText:"emergency-vehicle-crash-reports-communication-interrupted",closeModalElements:["footer-button","footer-link"]};this._configInfoModal={...e},this.viewInfoModal=!0}_openVerifyLocationPermission(){const e={id:"verify-location-permission",modalType:"info",modalHeader:"",icon:w(),fullHeight:!1,titleText:"emergency-vehicle-crash-reports-report-has-location-permission",bodyText:"emergency-vehicle-crash-reports-report-has-location-permission-description",buttonText:"emergency-vehicle-crash-reports-report-has-location-permission-go-to-settings",linkText:"emergency-vehicle-crash-reports-report-has-location-permission-no-thanks",fixedFooter:!1,eventName:"emergency-vehicle-crash-reports-report-modal-checking-out-location",closeModalElements:["footer-button","footer-link"]};this._configInfoModal={...e},this.viewInfoModal=!0}_openPreventLeaveReport(){const e={id:"prevent-leave-modal",modalType:"warning",modalHeader:"",icon:A(),fullHeight:!1,buttonText:"emergency-vehicle-crash-reports-leave-button",linkText:"emergency-vehicle-crash-reports-continue-in-the-operation-button",bodyText:"emergency-vehicle-crash-reports-prevent-leave",fixedFooter:!1,eventName:"emergency-vehicle-crash-reports-leave-crash-reports",closeModalElements:["footer-button","footer-link"]};this._configInfoModal={...e},this.viewInfoModal=!0}_openNoticeOfPrivacy(){const e={id:"notice-of-privacy",modalHeader:"emergency-vehicle-crash-reports-notice-of-privacy-header",icon:w(),headerType:"modal-three-level",fullHeight:!0,buttonText:"emergency-vehicle-crash-reports-understood-button",linkText:"",content:{firstParagraph:"emergency-vehicle-crash-reports-notice-privacy-one",secondParagraph:"emergency-vehicle-crash-reports-notice-privacy-two"},fixedFooter:!0,closeModalElements:["header-right-primary","footer-button"],eventName:"emergency-vehicle-crash-reports-notice-of-privacy-modal"};this._configInfoModal={...e},this.viewInfoModal=!0}openAlreadyReportedModal(){this.clearLoader();const e={id:"already-reported-modal",modalHeader:"emergency-vehicle-crash-reports-emergency-modal",headerType:"modal-initial",fullHeight:!0,fixedFooter:!0,hidePaddingTop:!0,icon:"",panel:{microillustration:"error",heading:"emergency-vehicle-crash-reports-action-not-performed",description:"emergency-vehicle-crash-reports-already-reported-error"},number:this.phoneNumberBbvaLineVehicle,buttonText:"emergency-vehicle-crash-reports-call-button",linkText:"emergency-vehicle-crash-reports-cancel-button",eventName:"emergency-vehicle-crash-reports-already-report-error-modal",closeModalElements:["header-right-primary","footer-link"]};this._configInfoModal={...e},this.viewInfoModal=!0}openOperationNotPerformedModal(){this.clearLoader();this._configInfoModal={id:"operation-not-performed-modal",modalHeader:"emergency-vehicle-crash-reports-emergency-modal",headerType:"modal-initial",fullHeight:!0,fixedFooter:!0,hidePaddingTop:!0,icon:"",panel:{microillustration:"error",heading:"emergency-vehicle-crash-reports-action-not-performed",description:"emergency-vehicle-crash-reports-not-available-services-error"},buttonText:"emergency-vehicle-crash-reports-understood-button",linkText:"",eventName:"emergency-vehicle-crash-reports-operation-not-performed-error-modal",closeModalElements:["header-right-primary","footer-button"]},this.viewInfoModal=!0}openCommunicationErrorModal(){this.clearLoader();const e={id:"open-communication-error-modal",modalHeader:"emergency-vehicle-crash-reports-communication-error",headerType:"modal-initial",fullHeight:!0,fixedFooter:!0,hidePaddingTop:!0,icon:"",panel:{microillustration:"error",heading:"emergency-vehicle-crash-reports-communication-error",description:"emergency-vehicle-crash-reports-communication-error-description"},number:this.phoneNumberBbvaLine,buttonText:this.viewCallVisible?"emergency-vehicle-crash-reports-call-button":"",linkText:"emergency-vehicle-crash-reports-leave-button",eventName:"emergency-vehicle-crash-reports-communication-failed-modal",closeModalElements:["header-right-primary","footer-link"]};this._configInfoModal={...e},this.viewInfoModal=!0}get _buildCrashReportInfoModal(){return g`
      <crash-report-info-modal
        ?visible="${this.viewInfoModal}"
        .configInfoModal="${this._configInfoModal}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ?hide-icon-text="${this.hideIconText}"
        @emergency-vehicle-crash-reports-info-modal-success-crash-report-modal-close="${this._resetMultistepVisibleModal}"
        @emergency-vehicle-crash-reports-info-modal-already-reported-modal-close="${this._resetMultistepVisibleModal}"
        @emergency-vehicle-crash-reports-info-modal-operation-not-performed-modal-close="${this._resetMultistepVisibleModal}"
        @emergency-vehicle-crash-reports-info-modal-open-communication-error-modal-close="${this._resetMultistepVisibleModal}"
        @emergency-vehicle-crash-reports-info-modal-state-change="${({detail:e})=>{this.viewInfoModal=e}}"
        @emergency-vehicle-crash-reports-info-modal-veil-close="${({detail:e})=>{this.multistepModalVisible=e}}"
        @emergency-vehicle-crash-reports-leave-crash-reports-button-click="${this._resetMultistepVisibleModal}"
        @emergency-vehicle-crash-reports-report-geolocation-failed-button-click="${this._manageGeolocationAttempt}"
      >
      </crash-report-info-modal>
    `}get _openMenuFAQs(){return g`
      <emergency-vehicle-crash-reports-faqs-menu
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ?show-menu-faqs="${this.viewMenuFaqs}"
        ?hide-icon-text="${this.hideIconText}"
        .faqsConfigurations="${this.faqsConfigurations}"
        @emergency-vehicle-crash-reports-faqs-menu-header-return="${()=>{this.viewMenuFaqs=!1}}"
      ></emergency-vehicle-crash-reports-faqs-menu>
    `}get _buildCrashMultistepModal(){return g`
      <crash-report-multistep-modal
        .modalHeaderButtons="${this._modalHeaderButtons}"
        .restoreMultistepState="${this._multistepState}"
        ?visible="${this.multistepModalVisible}"
        ?is-native="${this.native}"
        api-key="${this.apiKey}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        .geoLocation="${this.geoLocation}"
        header-title="${this._helpDescription}"
        ?view-info-modal="${this.viewInfoModal}"
        phone-number-bbva-line-vehicle="${this.phoneNumberBbvaLineVehicle}"
        .multiStepConfiguration="${this.multiStepConfiguration}"
        .contactDetails="${this._contactDetails}"
        .phoneDetails="${this.phoneDetails}"
        ?person-data-is-used="${this.personDataIsUsed}"
        ?flow-type="${this.flowType}"
        ?has-location-permissions="${this.hasLocationPermissions}"
        ?hide-icon-text="${this.hideIconText}"
        @emergency-vehicle-crash-reports-multistep-modal-report-send="${this._raiseReport}"
        @emergency-vehicle-crash-reports-prevent-crash-report-leave="${this._openPreventLeaveReport}"
        @emergency-vehicle-crash-reports-multistep-modal-notice-of-privacy-modal-open="${this._openNoticeOfPrivacy}"
        @emergency-vehicle-crash-reports-multistep-modal-location-permissions-open="${this._openVerifyLocationPermission}"
        @emergency-vehicle-crash-reports-multistep-modal-multistep-update-state="${this._saveFeatureState}"
        @emergency-vehicle-crash-reports-multistep-modal-faqs-header-open="${()=>{this.viewMenuFaqs=!0}}"
        @emergency-vehicle-crash-reports-multistep-modal-geolocation-change="${({detail:e})=>{this.geoLocation={...e}}}"
        @emergency-vehicle-crash-reports-multistep-modal-smart-assistant-header-open="${()=>{this.navigateForward()}}"
        @emergency-vehicle-crash-reports-multistep-modal-close="${()=>{this.multistepModalVisible=!1}}"
      >
      </crash-report-multistep-modal>
    `}get _emergencyVehicleCrashReportDm(){return g`
      <emergency-vehicle-crash-reports-dm
        host="${this.host}"
        public-settings-host="${this.publicSettingsHost}"
        required-token="${this.requiredToken}"
        ?native="${this.native}"
        ?request-services="${this.requestServices}"
        ?contact-data-is-used="${this.contactDataIsUsed}"
        app-settings-api-version="${this.appSettingsApiVersion}"
        vehicle-insurance-api-version="${this.vehicleInsuranceApiVersion}"
        losses-report-requests-api-version="${this.lossesReportRequestApiVersion}"
        cache-type="${this.cacheType}"
        public-settings-id="${this.publicSettingsId}"
        public-settings-key="${this.publicSettingsKey}"
        vehicle-insurance-id="${this.vehicleInsuranceId}"
        fields-property="${this.fieldsProperty}"
        sub-product-type="${this.subProductType}"
        vehicle-type="${this.vehicleType}"
        product-type-vehicle-insurance="${this.productTypeVehicleInsurance}"
        .publicSettings="${this.publicSettings}"
        .vehicleInsurance="${this.vehicleInsurance}"
        @emergency-vehicle-crash-reports-dm-holder-data="${this._getInsuranceData}"
        @emergency-vehicle-crash-reports-dm-set-policy-number="${e=>{this._configInfoModal={},this._policyNumber=e.detail}}"
        @emergency-vehicle-crash-reports-dm-app-settings-data-set="${this._appSettingsData}"
        @emergency-vehicle-crash-reports-dm-report-create="${this._showSuccessView}"
        @emergency-vehicle-crash-reports-dm-modal-already-exists="${this.openAlreadyReportedModal}"
        @emergency-vehicle-crash-reports-dm-modal-communication-fail="${this.openOperationNotPerformedModal}"
        @emergency-vehicle-crash-reports-dm-api-dm-error="${this._initialRequestError}"
      ></emergency-vehicle-crash-reports-dm>
    `}get _buildVehicleCrashReport(){return g`
      ${this._buildCrashMultistepModal} ${this._buildCrashReportInfoModal}
    `}render(){return g`
      ${super.render()} ${this._emergencyVehicleCrashReportDm} ${this._buildVehicleCrashReport}
      ${"contentFragmentPath"in this.faqsConfigurations?this._openMenuFAQs:""}
    `}}customElements.define(Tr.is,Tr);let kr=class{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let i=Object(this),s=i.length>>>0;if(0===s)return!1;let a=0|t,r=Math.max(a>=0?a:s-Math.abs(a),0);for(;r<s;){if((o=i[r])===(n=e)||"number"==typeof o&&"number"==typeof n&&isNaN(o)&&isNaN(n))return!0;r++}var o,n;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var i=[],s=0,a="",r=0,o=arguments.length;r!==o;++r){var n=+arguments[r];if(!(n<1114111&&n>>>0===n))throw RangeError("Invalid code point: "+n);n<=65535?s=i.push(n):(n-=65536,s=i.push(55296+(n>>10),n%1024+56320)),s>=16383&&(a+=e.apply(null,i),i.length=0)}return a+e.apply(null,i)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",i=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${i&&i.message}`)}},Ir=class extends kr{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}};const Er=0,wr=1,Rr="jwt",Mr="tsec",Lr="none";let Pr=class extends kr{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=Er,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new Ir,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=Mr:this.requiredToken=Lr,this.requiresJWT=!1):this.requiredToken===Mr?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===Rr?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===Lr?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(Mr)}_setJwtHandler(){this._setTokenHandler(Rr)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((i,s)=>{t=Object.assign(t,{resolve:i,reject:s}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let i=this._getRequestHeaders();Object.keys(i).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,i[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let t=null;return!!window.CellsNativePlugins&&(t=e),t}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let i=e.replace(/[\{\}]+/g,""),s=t[i];return s?delete t[i]:this._error(9,`Missing ${i} param value`),s})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let i=Object.keys(t);i.length&&(e=[e,i.map((e=>{let i=t[e];return Array.isArray(i)&&this.paramArrayMode===wr?this._arrayToQueryParam(e,i):`${e}=${i}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(Mr,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(Rr,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(i){var s=t.getItem(i);s&&"null"!==s&&(e[i]=s)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const i=window.sessionStorage;t=Object.keys(i).filter((t=>t.startsWith(e))).reduce(((t,s)=>(t[s.replace(e,"")]=i.getItem(s),t)),{})}return t}_getTokenForRequestHeaders(e,t){const i=`${e}Handler`,s=e===Rr?"JWT ":"",a=e===Rr?"Authorization":Mr;if(void 0===this[i]||null===this[i])this._error(11,`${e} handler is undefined`);else{const r=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let o=this[i].getItem(r);o?t[a]=t[a]||s+o:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((i=>{t.push(`${i}=${e[i]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let i;const s=new Promise(((e,t)=>{i=(i,s)=>{i?t(i):e(s)}}));return t.addEventListener("loadend",(function e(s){t.removeEventListener("loadend",e),s.error?i(s.error):i(null,t.result)})),t.readAsText(e),s}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let i=0;for(;i<e.length;){let s=e[i],a=0,r=0;if(s<=127?(a=0,r=255&s):s<=223?(a=1,r=31&s):s<=239?(a=2,r=15&s):s<=244&&(a=3,r=7&s),e.length-i-a>0){let t=0;for(;t<a;)s=e[i+t+1],r=r<<6|63&s,t+=1}else r=65533,a=e.length-i;t+=String.fromCodePoint(r),i+=a+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},i=e.trim().split(/[\r\n]+/);for(const e in i)if(i.hasOwnProperty(e)&&""!==i[e]){let s=": ",a=i[e].split(s);t[a.shift().toLowerCase()]=a.join(s)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,i,s){let a=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(s)>=0&&(a=t.getResponseHeader(s));break;case this._NATIVE_XHR:t&&t.headers&&(a=JSON.parse(t.headers)[s])}if(a){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):i;e.getItem(t)!==a&&(e.setItem(t,a),this._emitTokenUpdate(i,a))}}_emitTokenUpdate(e,t){if(this.htmlContext){const i=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(i)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,i,s,a,r;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),i=e.getResponseHeader("AuthenticationData"),s=e.getResponseHeader("AuthenticationState"),a=e.getResponseHeader("AuthenticationChallenge"),r=e.getResponseHeader("AuthenticationResponse");else{let o=JSON.parse(e.headers);t=o.authenticationtype,i=o.authenticationdata||null,s=o.authenticationstate,a=o.authenticationchallenge,r=o.authenticationresponse}return{type:t,data:i,state:s,challenge:a,response:r}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",i=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const s=this._getSignatureData(e,t,i);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:s}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",i="",s=""){let a;if("object"==typeof e&&e){const r=this._getSignatureData(e.signatureType,t,i);a=this._makeKeyValuePairFromObject(r,e.signatureValue),e.challenge&&(a+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(a,e.signatureType,s)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(a=`password=${e}`,this._buildSignatureHeaders(a,"2",s)):(a=`${i}=${e}`,this._buildSignatureHeaders(a,t,s)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let i,s=e.split(",");if(s.length>1){i=s.map((e=>`${e}=${t[e]}`)).join(",")}else i=`${e}=${t}`;return i}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",i=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),i&&(this.headers=Object.assign(this.headers,{AuthenticationState:i})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),a=this._ERROR_CODES.SIGNATURE_INVALID.includes(s),{type:r,data:o,state:n,challenge:l,response:c}=this._extractSignatureResponseHeaders(e),d=this._getRequestMetadata(e);if(a)this._notifySignatureInvalid(d),i=!0;else if(r)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(s)?(this._notifySignatureTypeUsingErrorCode(s,d,r,o,n,l,c),i=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(d,r,o,n,l,c),i=!0}return i}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),a=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(s),r=this._getRequestMetadata(e);a&&(this._notifyWaitingForProcessResponse(r),i=!0)}return i}_notifySignatureRequiredFirstStep(e,t,i,s){this._defineSignatureType(t,i),this._defineSignatureValue(t,i,s),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:i,metadata:e}}))}_notifySignatureRequired(e,t,i,s,a,r){this._defineSignatureValue(t,i,s);const o={type:t,data:i,challenge:a,metadata:e};r&&(o.response=r),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:o}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:i}=e;return{path:this._path,method:this.method,url:t,status:i}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",i=""){const s=t.split(";").findIndex((t=>t===e));return i?i.split(";")[s]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,i,s,a,r){s?this._notifySignatureRequired(e,t,i,s,a,r):this._notifySignatureRequiredFirstStep(e,t,i,s)}_notifySignatureTypeUsingErrorCode(e,t,i,s,a,r,o){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,i,s,a):this._notifySignatureRequired(t,i,s,a,r,o)}},Ar=class extends Pr{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}};class Dr extends Ar{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/contact-details`)}toString(){return super.toString("BGADPCustomersCustomerContactDetailsGetV0")}}class Or extends Ar{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/contact-details`)}toString(){return super.toString("BGADPCustomersCustomerContactDetailsGetV1")}}class Nr extends(He(h)){_mappingBank(e){this._renameProperty(e,"bank.bankId","id"),this._renameProperty(e,"bank.branch.branchId","id"),e.bank&&e.bank.branch&&e.bank.branch.costCenter&&(e.bank.branch.costCenter={id:e.bank.branch.costCenter})}_mappingGender(e){this._renameProperty(e,"gender.name","description")}_mappingIdentityDocuments(e){for(let t=0;t<e.identityDocuments.length;t++)this._renameProperty(e.identityDocuments[t],"documentType.name","description"),this._renameProperty(e.identityDocuments[t],"status.name","description")}_mappingMaritalStatus(e){this._renameProperty(e,"maritalStatus.name","description")}_mappingNationalities(e){for(let t=0;t<e.nationalities.length;t++)this._renameProperty(e.nationalities[t],"name","description")}_mappingPersonalTitle(e){this._renameProperty(e,"personalTitle.name","description")}_mappingResidence(e){this._renameProperty(e,"residence","taxResidence"),this._renameProperty(e,"taxResidence.residenceType.name","description")}_mappingVerification(e){this._renameProperty(e,"enrollmentModality","verification"),this._renameProperty(e,"verification.enrollmentMethod","identificationMethod")}_mappingSegments(e){for(let t=0;t<e.segments.length;t++)this._renameProperty(e.segments[t],"name","description")}_changeNameToDescription(e){e.map((e=>{this._renameProperty(e,"name","description")}))}}class qr extends Nr{static get is(){return"bbva-global-customer-contact-details-api-dm"}static get properties(){return{customerContactDetails:{type:Array,attribute:!1},_contactType:{type:Object,attribute:!1},_socialNetwork:{type:Object,attribute:!1},_emailType:{type:Object,attribute:!1},_phoneType:{type:Object,attribute:!1}}}constructor(){super(),this.customerContactDetails=[],this._contactType={WORK_EMAIL:"EMAIL",FACEBOOK_EMAIL:"EMAIL",EMAIL:"EMAIL",PHONE_NUMBER:"LANDLINE",MOBILE_NUMBER:"MOBILE",OFFICE_NUMBER:"LANDLINE",FACEBOOK_ACCOUNT:"SOCIALMEDIA",TWITTER_ACCOUNT:"SOCIALMEDIA"},this._socialNetwork={FACEBOOK_ACCOUNT:"FACEBOOK",TWITTER_ACCOUNT:"TWITTER"},this._emailType={EMAIL:"PERSONAL",WORK_EMAIL:"WORK",FACEBOOK_EMAIL:"SOCIALMEDIA"},this._phoneType={PHONE_NUMBER:"HOME",OFFICE_NUMBER:"WORK"}}resetCustomerContactDetails(){this.customerContactDetails=[]}getCustomerContactDetails(e,t={}){if(Object.keys(this.customerContactDetails).length)return;this._paramsMapping(t);t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),{customEvent:"customer-contact-details-api-dm-fetch",paginationEvent:"customer-contact-details-api-dm-pagination",errorFireEventHandler:"customer-contact-details-api-dm-fetch-error"},this._responseMapping,t.fields)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}CustomerContactDetails`,this._getBgadp(s))}_getBgadp(e){return{getCustomerContactDetailsV0:()=>new Dr(e),getCustomerContactDetailsV1:()=>new Or(e),getCustomerContactDetailsV2:()=>new Lt(e),getCustomerContactDetailsV3:()=>new Pt(e),default:()=>"BGADP called not exist"}}_paramsMapping(e){"0"==this.version&&(this._removeFields(["contact.isMultichannel"],e),this._removeFields(["contact.contactDetailType"],e)),"2"==this.version&&this._removeFields(["contact.contactDetailType"],e)}_responseMapping(e){if("0"==this.version&&Object.keys(e).length){let t;for(let i=0;i<e.length;i++)if(this._renameProperty(e[i],"contactDetailId","id"),e[i].contactType){switch(t=e[i].contact,e[i].contact={contactDetailType:this._contactType[e[i].contactType.id]},e[i].contact.contactDetailType){case"EMAIL":e[i].contact.address=t,e[i].hasOwnProperty("isVerified")&&(e[i].contact.isVerified=e[i].isVerified),e[i].contact.receivesNotifications=e[i].isChecked,e[i].contact.emailType=this._emailType[e[i].contactType.id];break;case"LANDLINE":e[i].contact.number=t,e[i].contact.phoneType=this._phoneType[e[i].contactType.id],e[i].country&&(e[i].contact.country=e[i].country),e[i].regionalCode&&(e[i].contact.regionalCode=e[i].regionalCode),e[i].extension&&(e[i].contact.extension=e[i].extension),e[i].hasOwnProperty("isVerified")&&(e[i].contact.isVerified=e[i].isVerified);break;case"MOBILE":e[i].contact.number=t,e[i].phoneCompany&&(e[i].contact.phoneCompany=e[i].phoneCompany),e[i].hasOwnProperty("isVerified")&&(e[i].contact.isVerified=e[i].isVerified),e[i].contact.receivesNotifications=e[i].isChecked,e[i].contact.phoneType="HOME";break;case"SOCIALMEDIA":e[i].contact.userName=t,e[i].contact.socialNetwork=this._socialNetwork[e[i].contactType.id]}this._removeFields(["country","regionalCode","extension","isChecked","isVerified","contactType","phoneCompany"],e[i])}}if("1"==this.version&&Object.keys(e).length){const t=["isSafe","isVerifiedByCustomer"];for(let i=0;i<e.length;i++)e[i].contact&&"MOBILE"===e[i].contact.contactDetailType&&this._removeFields(["isMobileToken"],e[i].contact),this._removeFields(t,e[i])}return e}}class Vr extends Nr{static get is(){return"bbva-global-customer-lopd-documents-base-api-dm"}resetCustomerLopdDocuments(){this.customerLopdDocuments={}}getCustomerLopdDocuments(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}CustomerLopdDocuments`,this._getBgadp(s))}_getBgadp(e){return{getCustomerLopdDocumentsV3:()=>new At(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}je(Vr,"GET_EVENTS",{customEvent:"customer-lopd-documents-api-dm-fetch",errorFireEventHandler:"customer-lopd-documents-api-dm-fetch-error"}),customElements.define(Vr.is,Vr);const Br=de((e=>class extends e{static get properties(){return{prefix:{type:String}}}constructor(){super(),this.prefix=""}dispatch(e,t=!0,i=!0,s=!0){this.dispatchEvent(new CustomEvent(`${this.prefix}-${e}`,{bubbles:i,composed:s,detail:t,cancelable:!0}))}_locale(e,t){return this.t(`${this.prefix}-${e}`,t)}_capitalize(e=""){return e.toLowerCase().replace(/\b\w/g,(e=>e.toUpperCase()))}}));class Hr extends(y(Xe(et(c(Br(h)))))){static get is(){return"emergency-car-emergency-vehicle-glass-reports-dm"}static get scopedElements(){const e=[Ye,yi,ni,jt,qr,...Hr.configurationScopedElements()];return Hr.scopedElementsFromClasses(e)}static get properties(){return{appSettingsApiVersion:{type:String,attribute:"app-settings-api-version"},autoPartsApiVersion:{type:String,attribute:"auto-parts-api-version"},address:{type:Object},countDmError:{type:Number,attribute:"count-dm-error"},countRetryError:{type:Number,attribute:"count-retry-error"},customerId:{type:String,attribute:"customer-id"},customersApiVersion:{type:String,attribute:"customers-api-version"},customerContactDetails:{type:Array,attribute:"customer-contact-details"},errorName:{type:String,attribute:"error-name"},errorType:{type:String,attribute:"error-type"},geoLocation:{type:Object,attribute:"geo-location"},fieldsProperty:{type:String,attribute:"fields-property"},insuranceCompany:{type:Object,attribute:"insurance-company"},initGlass:{type:Boolean,attribute:"init-glass"},locality:{type:String},lossesReportApiVersion:{type:String,attribute:"losses-report-api-version"},personalSupplier:{type:String,attribute:"personal-supplier"},publicSettings:{type:Array,attribute:"public-settings"},publicSettingsId:{type:String,attribute:"public-settings-id"},publicSettingsKey:{type:String,attribute:"public-settings-key"},productTypeVehicleInsurance:{type:String,attribute:"product-type-vehicle-insurance"},searchYourCrystal:{type:Number,attribute:"search-your-crystal"},selectedCrystals:{type:Array,attribute:"selected-crystals"},selectedDate:{type:String,attribute:"selected-date"},selectedGlassware:{type:Object,attribute:"selected-glassware"},selectedSupplier:{type:String,attribute:"selected-supplier"},state:{type:String},subProductType:{type:String,attribute:"sub-product-type"},vehicleInsurance:{type:Object,attribute:"vehicle-insurance"},vehicleInsurancesApiVersion:{type:String,attribute:"vehicle-insurances-api-version"},vehicleInsuranceId:{type:String,attribute:"vehicle-insurance-id"},_addressComponents:{type:String,state:!0},_defaultGlassware:{type:Object,state:!0},_vehicleInsuranceDetails:{type:Object,state:!0}}}constructor(){super(),this.prefix="emergency-car-emergency-vehicle-glass-reports-dm",this.address={},this.appSettingsApiVersion="0",this.autoPartsApiVersion="0",this.countDmError=0,this.countRetryError=0,this.customerContactDetails=[],this.customerId="",this.customersApiVersion="3",this.errorName="",this.errorType="",this.geoLocation={},this.fieldsProperty="",this.insuranceCompany={},this.initGlass=!1,this.locality="",this.lossesReportApiVersion="1",this.personalSupplier="",this.publicSettings=[],this.publicSettingsId="",this.publicSettingsKey="",this.productTypeVehicleInsurance="",this.searchYourCrystal=0,this.selectedCrystals=[],this.selectedDate="",this.selectedGlassware={},this.selectedSupplier="",this.state="",this.subProductType="",this.vehicleInsurance={},this.vehicleInsurancesApiVersion="1",this.vehicleInsuranceId="",this._addressComponents="",this._defaultGlassware={},this._vehicleInsuranceDetails={}}update(e){super.update(e),e.has("initGlass")&&this.initGlass&&this._getServices(),e.has("selectedSupplier")&&this.selectedSupplier.length&&this.getAutoPartsDm()}get _publicSettingsDm(){return this.shadowRoot.querySelector('[data-tag-name="bbva-global-public-settings-api-dm"]')}get _vehicleInsuranceDm(){return this.shadowRoot.querySelector('[data-tag-name="bbva-global-vehicle-insurance-api-dm"]')}get _lossesReport(){return this.shadowRoot.querySelector('[data-tag-name="bbva-global-losses-report-requests-api-dm"]')}get _autoPartsDm(){return this.shadowRoot.querySelector('[data-tag-name="bbva-global-auto-parts-retailers-api-dm"]')}get _customerContactDetailsDm(){return this.shadowRoot.querySelector('[data-tag-name="bbva-global-customer-contact-details-api-dm"]')}_getServices(){this._getPublicSettingsDm(),this._getVehicleInsuranceDm(),this._getCustomerContactDetails()}getAutoPartsDm(){var e,t,i,s,a;this.dispatch("show-loader"),this._autoPartsDm.getAutoPartsRetailers({"insuranceCarrier.id":null===(e=this._vehicleInsuranceDetails)||void 0===e||null===(t=e.insuranceCompany)||void 0===t?void 0:t.id,"model.name":null===(i=this._vehicleInsuranceDetails)||void 0===i?void 0:i.year,"location.geolocation.latitude":null===(s=this.geoLocation)||void 0===s?void 0:s.lat,"location.geolocation.longitude":null===(a=this.geoLocation)||void 0===a?void 0:a.lng,"location.state.id":this.state,"location.geographicGroupType.id":this.locality,searchYourCrystal:this.searchYourCrystal})}createReport(){var e,t,i,s,a,r,o,n,l,c,d,h,p,u,m,g,b,v,y,f,_;this.dispatch("show-loader");let S={id:null===(e=this._defaultGlassware)||void 0===e?void 0:e.id,branch:{id:null===(t=this._defaultGlassware)||void 0===t||null===(i=t.stores)||void 0===i||null===(s=i[0])||void 0===s?void 0:s.id}};const $=`${null===(a=this.address)||void 0===a||null===(r=a.addressComponents)||void 0===r?void 0:r.route} ${null===(o=this.address)||void 0===o||null===(n=o.addressComponents)||void 0===n?void 0:n.strNumber}`;if(this.selectedSupplier===this.personalSupplier){var x,C;const{id:e,name:t,stores:i}=this.selectedGlassware;S={id:e,description:t,branch:{id:null==i||null===(x=i[0])||void 0===x?void 0:x.id,description:null==i||null===(C=i[0])||void 0===C?void 0:C.name}}}let T=[{name:null===(l=this.address)||void 0===l?void 0:l.formattedAddress,componentTypes:["FULL_ADDRESS"]}];var k,I,E,w,R,M;"NO_FULL_ADDRESS"===this._addressComponents&&(T=[{name:null===(k=this.address)||void 0===k||null===(I=k.addressComponents)||void 0===I?void 0:I.country,componentTypes:["COUNTRY"]},{name:null===(E=this.address)||void 0===E||null===(w=E.addressComponents)||void 0===w?void 0:w.postalCode,componentTypes:["POSTAL_CODE"]},{name:null===(R=this.address)||void 0===R||null===(M=R.addressComponents)||void 0===M?void 0:M.city,componentTypes:["CITY"]},{name:$,componentTypes:["ADDRESS"]}]);const L={policy:{id:null===(c=this._vehicleInsuranceDetails)||void 0===c?void 0:c.id,certificateNumber:(null===(d=this._vehicleInsuranceDetails)||void 0===d?void 0:d.certificateNumber)||""},requestType:{id:"NEW",lossDetail:{geolocation:{latitude:null===(h=this.geoLocation)||void 0===h?void 0:h.lat,longitude:null===(p=this.geoLocation)||void 0===p?void 0:p.lng},vehicle:{licensePlate:null===(u=this._vehicleInsuranceDetails)||void 0===u?void 0:u.licencePlate,brand:null===(m=this._vehicleInsuranceDetails)||void 0===m?void 0:m.brand,subBrand:null===(g=this._vehicleInsuranceDetails)||void 0===g?void 0:g.subBrand,vehicleType:{id:null===(b=this._vehicleInsuranceDetails)||void 0===b||null===(v=b.vehicleType)||void 0===v?void 0:v.id,name:null===(y=this._vehicleInsuranceDetails)||void 0===y||null===(f=y.vehicleType)||void 0===f?void 0:f.name}},addresses:[{location:{addressComponents:T}}],serviceSpecificLosses:[{id:"CRYSTALS",eventType:"CLAIMS",serviceDetails:{specificLossType:"CRYSTAL",reportDate:this.selectedDate,reportType:"GLAZING_ASSIGNMENT",glassware:{glasswareType:null===(_=this.selectedCrystals)||void 0===_?void 0:_.map((({id:e})=>({id:e}))),...S}}}]}}};this._lossesReport.postLossesReportRequests(L)}_getPublicSettingsDm(){Object.keys(this.publicSettings).length?(this._publicSettingsDm.publicSettings=this.publicSettings,this._successPublicSettingsHandler()):this._publicSettingsDm.getPublicSettings(this.publicSettingsId,{key:this.publicSettingsKey})}_getVehicleInsuranceDm(){Object.keys(this.vehicleInsurance).length?(this._vehicleInsuranceDm.vehicleInsurance=this.vehicleInsurance,this._successVehicleInsuranceHandler()):this._vehicleInsuranceDm.getVehicleInsurance(this.vehicleInsuranceId,{fields:this.fieldsProperty})}_getCustomerContactDetails(){this.customerContactDetails.length?(this._customerContactDetailsDm.customerContactDetails=this.customerContactDetails,this._successCustomerContactDetailsHandler()):this._customerContactDetailsDm.getCustomerContactDetails(this.customerId)}_successPublicSettingsHandler(e){const[t]=(null==e?void 0:e.detail)||this.publicSettings,i=JSON.parse(null==t?void 0:t.value),{data:{emergencies:s}}=i;this._validateProductType(s),this._resetRetryCount()}_validateProductType(e){const[t]=e.filter((e=>e.productType===this.productTypeVehicleInsurance)),{emergency:i,flowSubProductType:s}=t;this._getDataFromGlassId(i,s)}_getDataFromGlassId(e,t){if(t===this.subProductType&&e){const[t]=e.filter((e=>"GLASS"===e.id)),{geolocation:i}=t;this._addressComponents=null==i?void 0:i.addressComponents;const s=null==t?void 0:t.helpDescription,a=null==t?void 0:t.glassSupplierType;this._handleGlassData(s,a)}}_handleGlassData(e,t){const i={helpDescription:e,glassSupplierType:t};this.dispatch("public-settings",i)}_successVehicleInsuranceHandler(e){const t=(null==e?void 0:e.detail)||this.vehicleInsurance,{id:i,policyNumber:s,vehicle:a,certificateNumber:r}=t,o=(null==a?void 0:a.licencePlate)||"",n=(null==t?void 0:t.insuranceCompany)||this.insuranceCompany,{model:{brand:l,subBrand:c,year:d},vehicleType:h}=a;this._vehicleInsuranceDetails={id:i,certificateNumber:r,brand:l,year:d,licencePlate:o,policyNumber:s,subBrand:c,vehicleType:h,insuranceCompany:n},this.dispatch("vehicle-insurance",this._vehicleInsuranceDetails),this._resetRetryCount()}_successCustomerContactDetailsHandler(e){const t=(null==e?void 0:e.detail)||this.customerContactDetails,i=Hr._handleCustomerDetail(t,"MOBILE"),s=Hr._handleCustomerDetail(t,"EMAIL");this.dispatch("customer-contact-details",{userPhone:i,userEmail:s}),this._resetRetryCount()}static _handleCustomerDetail(e,t){const{MASK:i,CONTACT:s}={MOBILE:{MASK:4,CONTACT:"number"},EMAIL:{MASK:12,CONTACT:"address"}}[t],a=e.find((e=>{var i;return(null==e||null===(i=e.contact)||void 0===i?void 0:i.contactDetailType)===t})),r=new RegExp(`^.+(.{${i}})$`,"g");return null==a?void 0:a.contact[s].toLowerCase().replace(r,"•$1")}_successAutoPartsHandler(e){this.selectedSupplier!==this.personalSupplier&&(this._defaultGlassware=null==e?void 0:e.detail[0]),this.dispatch("auto-parts",null==e?void 0:e.detail),this.dispatch("hide-loader"),this._resetRetryCount()}_successLossesReportHandler(e){this.dispatch("losses-report-success",null==e?void 0:e.detail),this.dispatch("hide-loader"),this._resetRetryCount()}_services(){return{"bbva-global-public-settings-api-dm":{"public-settings-api-dm-fetch-error":"_getPublicSettingsDm","api-dm-error":"_getPublicSettingsDm"},"bbva-global-vehicle-insurance-api-dm":{"vehicle-insurance-api-dm-fetch-error":"_getVehicleInsuranceDm","api-dm-error":"_getVehicleInsuranceDm"},"bbva-global-losses-report-requests-api-dm":{"losses-report-requests-api-dm-create-error":"createReport","api-dm-error":"createReport"},"bbva-global-auto-parts-retailers-api-dm":{"auto-parts-retailers-api-dm-fetch-error":"getAutoPartsDm","api-dm-error":"getAutoPartsDm"},"bbva-global-customer-contact-details-api-dm":{"customer-contact-details-api-dm-fetch-error":"_getCustomerContactDetails","api-dm-error":"_getCustomerContactDetails"}}[this.errorName]}_retryOn(){this[this._services()[this.errorType]](),this._retryCountError()}_retryCountError(){"api-dm-error"===this.errorType&&this.countRetryError<1&&(this.countDmError+=1),"api-dm-error"!==this.errorType&&this.countDmError<1&&(this.countRetryError+=1)}_comunicationError(e){var t;const{messages:i=[]}=e.detail;"alreadyRequested"===(null===(t=i[0])||void 0===t?void 0:t.code)?this.dispatch("already-requested"):this._retryType(e),this.dispatch("hide-loader")}_retryType(e){const{type:t,target:i}=e,s=this.countDmError>0?this.countDmError:this.countRetryError;this.errorType=t,this.errorName=i.getAttribute("data-tag-name"),this.dispatch("retry-error",{errorId:s>=3?"callForHelp":"retry"})}_resetRetryCount(){this.countDmError=0,this.countRetryError=0}get _tplDms(){return g`
      <bbva-global-public-settings-api-dm
        host="${this.host}"
        version="${this.appSettingsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @public-settings-api-dm-fetch="${this._successPublicSettingsHandler}"
        @public-settings-api-dm-fetch-error="${this._comunicationError}"
        @api-dm-error="${this._comunicationError}"
      >
      </bbva-global-public-settings-api-dm>
      <bbva-global-vehicle-insurance-api-dm
        host="${this.host}"
        version="${this.vehicleInsurancesApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @vehicle-insurance-api-dm-fetch="${this._successVehicleInsuranceHandler}"
        @vehicle-insurance-api-dm-fetch-error="${this._comunicationError}"
        @api-dm-error="${this._comunicationError}"
      >
      </bbva-global-vehicle-insurance-api-dm>
      <bbva-global-losses-report-requests-api-dm
        host="${this.host}"
        version="${this.lossesReportApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @losses-report-requests-api-dm-create="${this._successLossesReportHandler}"
        @losses-report-requests-api-dm-create-error="${this._comunicationError}"
        @api-dm-error="${this._comunicationError}"
      >
      </bbva-global-losses-report-requests-api-dm>
      <bbva-global-auto-parts-retailers-api-dm
        host="${this.host}"
        version="${this.autoPartsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @auto-parts-retailers-api-dm-fetch="${this._successAutoPartsHandler}"
        @auto-parts-retailers-api-dm-fetch-error="${this._comunicationError}"
        @api-dm-error="${this._comunicationError}"
      >
      </bbva-global-auto-parts-retailers-api-dm>
      <bbva-global-customer-contact-details-api-dm
        host="${this.host}"
        version="${this.customersApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @customer-contact-details-api-dm-fetch="${this._successCustomerContactDetailsHandler}"
        @customer-contact-details-api-dm-fetch-error="${this._comunicationError}"
        @api-dm-error="${this._comunicationError}"
      >
      </bbva-global-customer-contact-details-api-dm>
    `}render(){return g` ${this._tplDms} `}}var jr=t`
:host {
  display: flex;
  flex-direction: row;
  align-items: center;
  justify-content: space-between;
  box-sizing: border-box;
  margin-left: 1rem;
  margin-right: 1rem;
  margin-bottom: 1rem;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

:host([hide-margin-bottom]) {
  margin-bottom: 0;
}

:host([margin-bottom=""]) {
  margin-bottom: 0;
}

:host([margin-bottom=M]) {
  margin-bottom: 0.5rem;
}

:host([margin-bottom=L]) {
  margin-bottom: 1rem;
}

.list-label {
  display: flex;
  align-items: center;
}
.list-label [data-tag-name=bbva-type-text] {
  color: var(--glass-reports-list-item-label);
}

.list-description {
  display: flex;
  flex-direction: row;
  align-items: center;
}
.list-description [data-tag-name=bbva-type-text] {
  color: var(--glass-reports-list-item-description);
  text-align: end;
}
`;class Fr extends(y(et(Xe(h)))){static get is(){return"glass-reports-list-item"}static get scopedElements(){const e=[tt,...Fr.configurationScopedElements()];return Fr.scopedElementsFromClasses(e)}static get properties(){return{description:{type:String},descriptionFontWeight:{type:Number,attribute:"description-font-weight"},label:{type:String},hideMarginBottom:{type:Boolean,attribute:"hide-margin-bottom"},marginBottom:{type:String,attribute:"margin-buttom"}}}constructor(){super(),this.description="",this.descriptionFontWeight=400,this.label="",this.hideMarginBottom=!1,this.marginBottom=""}static get styles(){return[jr,it.primary,m("glass-reports-list-item-shared-styles")]}render(){return g`
      <div class="list-label">
        <bbva-type-text tag="span" text="${this.label}" size="S"></bbva-type-text>
      </div>
      <div class="list-description">
        ${this.description.length?g`
              <bbva-type-text
                tag="span"
                text="${this.description}"
                font-weight="${this.descriptionFontWeight}"
                size="S"
              ></bbva-type-text>
            `:E}
      </div>
    `}}var zr=t`
:host {
  display: block;
  box-sizing: border-box;
  padding: 0 1rem;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-notification-message] {
  margin: 1rem 0 1.5rem 0;
}

.car-glasses-btn {
  padding-bottom: 1rem;
}
`;class Gr extends(y(Xe(et(c(Br(h)))))){static get is(){return"accident-date-step"}static get scopedElements(){const e=[st,Kt,tt,at,...Gr.configurationScopedElements()];return Gr.scopedElementsFromClasses(e)}static get properties(){return{deductiblePercentage:{type:String,attribute:"deductible-percentage"},percentageCovered:{type:String,attribute:"percentage-covered"},selectedDate:{type:String,attribute:"selected-date"},_maxAccidentDate:{type:String,state:!0}}}constructor(){super(),this.prefix="",this.deductiblePercentage="",this.percentageCovered="",this.selectedDate="",this._maxAccidentDate=moment().format("YYYY-MM-DD")}_onCompleteStep(){this.dispatch("accident-date-select",this.selectedDate),this.dispatch("next-step",0),this._dispatchCustomEvent("complete")}_launchCalendar(e){this.native?(e.preventDefault(),this.dispatch("open-date-native",{dateFormat:"yyyy-MM-dd",maxDate:this._maxAccidentDate,defaultDate:this._maxAccidentDate})):this.shadowRoot.querySelector("#accidentDateInput").removeAttribute("readonly")}get _buildFooterButton(){return g`
      <bbva-button-default
        id="accidentDateContinue"
        ?disabled="${!this.selectedDate}"
        fullwidth
        text="${this._locale("continue-label")}"
        @click=${this._onCompleteStep}
      >
      </bbva-button-default>
    `}static get styles(){return[zr,rt.primary,Xt.primaryAlt,it.primary,m("accident-date-step-shared-styles")]}render(){return g`
      <bbva-type-text size="S" text="${this._locale("accident-date-description")}">
      </bbva-type-text>
      <bbva-form-date
        id="accidentDateInput"
        optional-label=""
        ambient="primary-alt"
        label="${this._locale("accident-date-input-label")}"
        info-message="${this._locale("accident-date-input-info-message")}"
        .max="${this._maxAccidentDate}"
        value="${this.selectedDate}"
        @change=${e=>{var t;this.selectedDate=null==e||null===(t=e.target)||void 0===t?void 0:t.value}}
        @click="${this._launchCalendar}"
      >
      </bbva-form-date>
      <bbva-notification-message
        book-title
        message-title="${this._locale("accident-date-message",{percentageCovered:this.percentageCovered,deductiblePercentage:this.deductiblePercentage})}"
      >
      </bbva-notification-message>
      <div class="car-glasses-btn">
        ${this._buildFooterButton}
      </div>
    `}}var Ur=t`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.search-option {
  margin-bottom: 0.5rem;
}

.search-description {
  padding-top: 0.625rem;
}

.search-report-description {
  padding-top: 1rem;
  padding-bottom: 0.5rem;
}

.car-glasses-btn {
  padding-left: 1rem;
  padding-right: 1rem;
  padding-bottom: 1rem;
}

[data-tag-name=bbva-type-text],
[data-tag-name=bbva-button-group] {
  padding-left: 1rem;
  padding-right: 1rem;
}

[data-tag-name=bbva-form-checkbox] {
  padding: 0.5rem 0 0;
}

[data-tag-name=bbva-notification-message] {
  margin: 1rem;
}

.views-container {
  position: relative;
  margin-top: 0.5rem;
}
.views-container .view-bg {
  width: 100%;
}
.views-container .window {
  position: absolute;
  top: 0;
  left: 0;
}
`;class Kr extends(y(Xe(et(c(Br(h)))))){static get is(){return"car-glasses-step"}static get scopedElements(){const e=[st,Wt,Fe,Dt,Qt,Zt,tt,at,...Kr.configurationScopedElements()];return Kr.scopedElementsFromClasses(e)}static get properties(){return{aemHost:{type:String,attribute:"aem-host"},aemPath:{type:String,attribute:"aem-path"},dataModal:{type:Object,attribute:"data-modal"},personalSupplier:{type:String,attribute:"personal-supplier"},resetSelected:{type:Number,reflect:!0},views:{type:Array},viewSelected:{type:String,attribute:"view-selected"},vehicle:{type:Object},selectedCrystals:{type:Array,attribute:"selected-crystals"},selectedSupplier:{type:String,attribute:"selected-supplier"},selectedView:{type:Number,attribute:"selected-view"},storageSupplier:{type:String,attribute:"storage-supplier"}}}constructor(){super(),this.prefix="",this.aemHost="",this.aemPath="",this.dataModal={},this.personalSupplier="",this.resetSelected=0,this.vehicle={},this.views=[],this.viewSelected="",this.selectedSupplier="",this.selectedView=-1,this.storageSupplier="",this.selectedCrystals=[]}update(e){var t;super.update(e),e.has("dataModal")&&null!==(t=this.dataModal)&&void 0!==t&&t.glassSupplierType&&this._validSupplierType(),e.has("vehicle")&&Object.keys(this.vehicle).length&&(this.views=this._handleViews())}get _someSupplierType(){const e=this.selectedSupplier!==this.personalSupplier;return!!this.selectedSupplier.length&&e}get _supplierTypeLength(){var e,t;return null===(e=this.dataModal)||void 0===e||null===(t=e.glassSupplierType)||void 0===t?void 0:t.length}_handleViews(){var e;return Object.keys(null===(e=this.vehicle)||void 0===e?void 0:e.glasses).map((e=>({text:this._locale(`car-glasses-view-${e}`),value:e})))}_onGlassChecked(e){var t;const{target:i}=e,s=Number(i.getAttribute("value")),a=null!==i.getAttribute("checked"),r=null===(t=this.vehicle)||void 0===t?void 0:t.glasses;r[this.viewSelected][s].checked=a,r[this.viewSelected][s].view=this.viewSelected,this.vehicle={...this.vehicle,glasses:r},this.selectedCrystals=this._selectedGlasses(),this._supplierTypeLength>1&&this._selfSelectedSupplierType(),this.dispatch("car-glasses-selected-crystals",this.selectedCrystals)}_selfSelectedSupplierType(){if(this.selectedCrystals.length>1){var e;const{id:t}=((null===(e=this.dataModal)||void 0===e?void 0:e.glassSupplierType)||[]).find((e=>(null==e?void 0:e.id)!==this.personalSupplier));this.selectedSupplier=t}this.selectedCrystals.length<=1&&(this.selectedSupplier=this.storageSupplier)}_selectedSupplierType({detail:e}){this.storageSupplier=null==e?void 0:e.value,this.selectedSupplier=this.storageSupplier,this.dispatch("car-glasses-item-change",e)}_validSupplierType(){var e,t;1===this._supplierTypeLength&&(this.selectedSupplier=null===(e=this.dataModal)||void 0===e||null===(t=e.glassSupplierType[0])||void 0===t?void 0:t.id)}_selectedGlasses(){var e;return Object.keys(null===(e=this.vehicle)||void 0===e?void 0:e.glasses).reduce(((e,t)=>{var i;const s=null===(i=this.vehicle)||void 0===i?void 0:i.glasses[t].filter((e=>null==e?void 0:e.checked));return s.length&&e.push(...s),e}),[])}_handleViewSelected({detail:e}){this.viewSelected=null==e?void 0:e.value,this.dispatch("car-glasses-selected-view",null==e?void 0:e.selected)}_getDisableButton(){return!(this.selectedSupplier.length&&this.selectedCrystals.length)}_onCompleteStep(){this.dispatch("car-glasses-supplier-select",this.selectedSupplier),this.dispatch("car-glasses-glasses-select",this.selectedCrystals),this.dispatch("next-step",1),this._dispatchCustomEvent("complete")}_dividerSize(e){return(this.vehicle.glasses||{})[this.viewSelected].length-1>e?"full":""}get _buildButtonGroup(){return g`
      <bbva-button-group
        selected="${this.selectedView}"
        type="radio"
        has-ellipsis=""
        name="views"
        .items=${this.views}
        @button-group-item-change="${this._handleViewSelected}"
      >
      </bbva-button-group>
    `}get _getVehicleVisuals(){var e;const t=this.vehicle[`${this.viewSelected}Bg`];let i=[];var s;Object.keys(this.vehicle).length&&(i=null===(s=this.vehicle)||void 0===s?void 0:s.glasses[this.viewSelected]);return g`
      <div class="views-container">
        ${t?g`
              <bbva-core-image
                class="view-bg"
                alt="${this._locale(`car-glasses-img-accessibility-text-${this.viewSelected}`)}"
                src=${this.aemHost+this.aemPath+t}
              >
              </bbva-core-image>
            `:""}
        ${null===(e=i)||void 0===e?void 0:e.map((e=>g`
            <bbva-core-image
              ?hidden=${!e.checked}
              class="view-bg window"
              alt="${this._locale(`car-glasses-img-accessibility-text-${null==e?void 0:e.id.toLowerCase()}`)}"
              src=${this.aemHost+this.aemPath+e.src}
            >
            </bbva-core-image>
          `))}
      </div>
    `}get _buildChecksBox(){var e;return Object.keys(this.vehicle).length&&this.viewSelected.length?g`
          ${Je(null===(e=this.vehicle)||void 0===e?void 0:e.glasses[this.viewSelected],(e=>null==e?void 0:e.id),((e,t)=>g`
              <bbva-form-checkbox
                name="${e.id}"
                value="${t}"
                label="${this._locale(`car-glasses-${null==e?void 0:e.label}`)}"
                ?checked="${null==e?void 0:e.checked}"
                divider-size="${this._dividerSize(t)}"
                @click="${this._onGlassChecked}"
              >
              </bbva-form-checkbox>
            `))}
        `:E}get _buildRadioButtons(){var e;return this._supplierTypeLength>1?g`
          <div ?hidden="${this.selectedCrystals.length>1}">
            <bbva-type-text
              class="search-description"
              size="S"
              text="${this._locale("car-glasses-supplier-description")}"
            ></bbva-type-text>
            <bbva-form-radio-group
              selected="${this.resetSelected}"
              @form-radio-group-item-change="${this._selectedSupplierType}"
            >
              ${Je(null===(e=this.dataModal)||void 0===e?void 0:e.glassSupplierType,(e=>null==e?void 0:e.id),((e,t)=>{var i,s;return g`
                  <bbva-form-radio-button divider="${t?"":"full"}" .value="${e.id}">
                    <bbva-type-text
                      class="search-option"
                      tag="span"
                      font-weight="500"
                      size="L"
                      text="${this._locale(`car-glasses-radio-title-${null==e||null===(i=e.id)||void 0===i?void 0:i.toLowerCase().replace("_","-")}`,{title:e.title})}"
                    >
                    </bbva-type-text>
                    <bbva-type-text
                      tag="span"
                      size="S"
                      text="${this._locale(`car-glasses-radio-help-description-${null==e||null===(s=e.id)||void 0===s?void 0:s.toLowerCase().replace("_","-")}`,{helpDescription:e.helpDescription})}"
                    >
                    </bbva-type-text>
                  </bbva-form-radio-button>
                `}))}
            </bbva-form-radio-group>
          </div>
        `:E}get _buildNotificationMessage(){return this._someSupplierType?g`
          <div ?hidden="${!this._someSupplierType}">
            <bbva-notification-message
              message-title="${this._locale("car-glasses-auto-search-message")}"
              book-title
            >
            </bbva-notification-message>
          </div>
        `:E}get _buildFooterButton(){return g`
      <bbva-button-default
        id="carGlassesContinue"
        ?disabled=${this._getDisableButton()}
        fullwidth
        text="${this._locale("continue-label")}"
        @click=${this._onCompleteStep}
      >
      </bbva-button-default>
    `}static get styles(){return[Ur,rt.primary,Jt.primary,Ot.primary,Yt.primary,ei.primary,it.primary,m("car-glasses-step-shared-styles")]}render(){return g`
      <bbva-type-text size="S" text="${this._locale("car-glasses-description")}"></bbva-type-text>
      ${this._buildButtonGroup} ${this._getVehicleVisuals}
      <bbva-type-text
        class="search-report-description"
        size="S"
        tag="span"
        text="${this._locale("car-glasses-select-window-message")}"
      ></bbva-type-text>
      ${this._buildChecksBox} ${this._buildRadioButtons} ${this._buildNotificationMessage}
      <bbva-type-text
        size="S"
        font-weight="500"
        text="${this._locale("car-glasses-selected-count",{count:this.selectedCrystals.length})}"
      ></bbva-type-text>
      <div class="car-glasses-btn">${this._buildFooterButton}</div>
    `}}var Xr=t`
:host {
  --_skeleton-default-bg-color: var(--bbva-skeleton-default--_ambient--bg-color, var(--bbva-skeleton-default--custom--primary-ambient--bg-color, var(--color-primary-surface-ambient-preloading,#ffffff)));
  --_skeleton-default-animated-bg-color: var(--bbva-skeleton-default--_ambient--animated-bg-color, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color, var(--color-primary-surface-ambient-default,#f4f4f4)));
  --_skeleton-default-bg-color-alt: var(--bbva-skeleton-default--_ambient--bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--bg-color-alt, var(--color-primary-surface-alternative-preloading,#e9e9e9)));
  --_skeleton-default-animated-bg-color-alt: var(--bbva-skeleton-default--_ambient--animated-bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color-alt, var(--color-primary-surface-alternative-default,#ffffff)));
}

:host {
  display: block;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.bbva-map-static-section {
  height: 10rem;
}
.bbva-map-static-section.desktop {
  height: 28rem;
}
.bbva-map-static-section.tablet {
  height: 19rem;
}

.bbva-map-static-text {
  padding: 0.5rem 1rem;
}

:host([loading]) {
  overflow: hidden;
  width: 100%;
  height: 14.6875rem;
  background-color: var(--_skeleton-default-bg-color);
  mask-image: linear-gradient(black 100%, transparent 0), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%);
  mask-position: 0 0, 16px 168px, 16px 192px;
  mask-repeat: no-repeat;
  mask-size: 100% 160px, calc((60% * 2) + (16px/ 2)) 16px, calc((45% * 2) + (16px/ 2)) 16px;
  pointer-events: none;
  /* 
  &::after {
     display: block;
     width: 100%;
     height: 100%;
     animation: skeletonAnimation 1500ms ease-in 100ms infinite alternate-reverse;
     background-color: var(--_skeleton-default-animated-bg-color);
     background-repeat: no-repeat;
     content: '';
     object-fit: cover;
     opacity: 0.1;
   }
   @keyframes skeletonAnimation {
     0% {
       opacity: 0.1;
     }
     100%{
       opacity: 1;
     }
   }*/
}
:host([loading])::after {
  display: block;
  width: 100%;
  height: 100%;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  background-color: var(--_skeleton-default-animated-bg-color);
  background-image: linear-gradient(var(--_skeleton-default-bg-color) 100%, transparent 0);
  background-position-x: 100vh;
  background-repeat: no-repeat;
  content: "";
  object-fit: cover;
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
}
@keyframes skeletonAnimation {
  from {
    opacity: 0.5;
  }
  50% {
    opacity: 0.6;
  }
  60% {
    opacity: 0.6;
  }
  70% {
    opacity: 0.3;
  }
  90% {
    opacity: 0.1;
  }
  100% {
    opacity: 0;
    transform: translateX(0%) scaleX(2);
  }
}
`;const Wr=[{featureType:"all",elementType:"all",stylers:[{visibility:"on"}]},{featureType:"all",elementType:"geometry",stylers:[{visibility:"simplified"}]},{featureType:"all",elementType:"labels",stylers:[{visibility:"simplified"}]},{featureType:"administrative",elementType:"labels.text.fill",stylers:[{color:"#444444"}]},{featureType:"landscape",elementType:"all",stylers:[{color:"#f2f2f2"}]},{featureType:"landscape",elementType:"geometry",stylers:[{visibility:"on"}]},{featureType:"landscape.man_made",elementType:"all",stylers:[{visibility:"simplified"},{hue:"#ff0000"}]},{featureType:"landscape.natural",elementType:"all",stylers:[{visibility:"on"},{color:"#d9efec"}]},{featureType:"landscape.natural.terrain",elementType:"all",stylers:[{visibility:"on"},{lightness:"31"},{hue:"#00fdff"}]},{featureType:"poi",elementType:"all",stylers:[{visibility:"off"}]},{featureType:"poi.park",elementType:"all",stylers:[{visibility:"simplified"},{color:"#2dcccd"},{lightness:"85"}]},{featureType:"road",elementType:"all",stylers:[{saturation:-100},{lightness:45}]},{featureType:"road.highway",elementType:"all",stylers:[{visibility:"simplified"}]},{featureType:"road.arterial",elementType:"labels.icon",stylers:[{visibility:"off"}]},{featureType:"transit",elementType:"all",stylers:[{visibility:"off"}]},{featureType:"transit.station.rail",elementType:"all",stylers:[{visibility:"on"}]},{featureType:"water",elementType:"all",stylers:[{color:"#2dcccd"},{visibility:"on"},{saturation:"26"}]}],Jr=[{featureType:"all",elementType:"all",stylers:[{visibility:"on"}]},{featureType:"all",elementType:"geometry",stylers:[{visibility:"simplified"}]},{featureType:"all",elementType:"labels",stylers:[{visibility:"simplified"}]},{featureType:"administrative",elementType:"geometry.stroke",stylers:[{color:"#1973b8"}]},{featureType:"administrative",elementType:"labels.text.fill",stylers:[{color:"#444444"}]},{featureType:"administrative.locality",elementType:"labels.text.fill",stylers:[{color:"#ffffff"}]},{featureType:"administrative.neighborhood",elementType:"labels.text.fill",stylers:[{color:"#f4f4f4"}]},{featureType:"landscape",elementType:"all",stylers:[{color:"#f2f2f2"}]},{featureType:"landscape",elementType:"geometry",stylers:[{visibility:"on"},{color:"#072146"}]},{featureType:"landscape",elementType:"labels",stylers:[{color:"#ffffff"},{visibility:"on"}]},{featureType:"landscape",elementType:"labels.text.fill",stylers:[{visibility:"on"},{color:"#ffffff"}]},{featureType:"landscape",elementType:"labels.text.stroke",stylers:[{color:"#ffffff"}]},{featureType:"landscape.man_made",elementType:"all",stylers:[{visibility:"simplified"},{hue:"#ff0000"}]},{featureType:"landscape.man_made",elementType:"geometry.fill",stylers:[{color:"#072146"}]},{featureType:"landscape.man_made",elementType:"geometry.stroke",stylers:[{color:"#043263"}]},{featureType:"landscape.natural",elementType:"all",stylers:[{visibility:"on"},{color:"#d9efec"}]},{featureType:"landscape.natural.landcover",elementType:"geometry.fill",stylers:[{color:"#043263"}]},{featureType:"landscape.natural.terrain",elementType:"all",stylers:[{visibility:"on"},{lightness:"31"},{hue:"#00fdff"}]},{featureType:"poi",elementType:"all",stylers:[{visibility:"off"}]},{featureType:"poi.attraction",elementType:"geometry.fill",stylers:[{color:"#004481"}]},{featureType:"poi.park",elementType:"all",stylers:[{visibility:"simplified"},{color:"#2dcccd"},{lightness:"85"}]},{featureType:"poi.park",elementType:"geometry.fill",stylers:[{color:"#072146"}]},{featureType:"road",elementType:"all",stylers:[{saturation:-100},{lightness:45}]},{featureType:"road",elementType:"geometry.fill",stylers:[{color:"#043263"}]},{featureType:"road",elementType:"labels.text.fill",stylers:[{color:"#ffffff"}]},{featureType:"road",elementType:"labels.icon",stylers:[{color:"#ff0000"}]},{featureType:"road.highway",elementType:"all",stylers:[{visibility:"simplified"}]},{featureType:"road.highway.controlled_access",elementType:"geometry.fill",stylers:[{color:"#004481"}]},{featureType:"road.highway.controlled_access",elementType:"labels",stylers:[{visibility:"off"}]},{featureType:"road.arterial",elementType:"labels.icon",stylers:[{visibility:"off"}]},{featureType:"transit",elementType:"all",stylers:[{visibility:"off"}]},{featureType:"transit",elementType:"labels.text.fill",stylers:[{color:"#ffffff"},{visibility:"off"}]},{featureType:"transit",elementType:"labels.text.stroke",stylers:[{color:"#004481"},{visibility:"off"}]},{featureType:"transit.station.rail",elementType:"all",stylers:[{visibility:"on"}]},{featureType:"water",elementType:"all",stylers:[{color:"#2dcccd"},{visibility:"on"},{saturation:"26"}]},{featureType:"water",elementType:"geometry.fill",stylers:[{color:"#1973b8"}]}];class Qr extends(ot(nt(lt(h)))){static get is(){return"bbva-map-static"}static get scopedElements(){const e=[tt];return Qr.scopedElementsFromClasses(e)}static get properties(){return{api:{type:String},apiKey:{type:String,attribute:"api-key"},message:{type:String},mapType:{type:String,attribute:"map-type"},icon:{type:String},location:{type:Object},size:{type:Object},zoom:{type:Number},scale:{type:Number},mapStyles:{type:String,attribute:"map-styles"},ellipsis:{type:Boolean,reflect:!0},iconDark:{type:String,attribute:"icon-dark"},loading:{type:Boolean,reflect:!0},_desktop:{type:Boolean,state:!0},_tablet:{type:Boolean,state:!0}}}constructor(){super(),this.api="https://maps.googleapis.com/maps/api/staticmap?",this.apiKey="",this.mapType="roadmap",this.icon="https://assets.bbvaexperience.com/visual/images/user-location/user-location-lightbg.png",this.location={latitude:"40.4219977",longitude:"-3.7058366"},this.size={width:"1024",height:"200"},this.zoom=16,this.scale=2,this.mapStyles="",this.mapAmbient=Wr,this.ellipsis=!1,this.loading=!1,this._iconURL=this.icon,this.iconDark="https://assets.bbvaexperience.com/visual/images/user-location/user-location-darkbg.png"}static get _mediaQueries(){return{_desktop:"(min-width: 62rem)",_tablet:"(min-width: 37.5rem) and (max-width: 61rem)"}}updated(e){super.updated(e),e.has("disabled")&&this.setAttribute("aria-disabled",this.disabled),(e.has("ambient")||e.has("icon"))&&this._checkAmbient(),this.loading||this._createStaticMap(this._encodeIcon())}_checkAmbient(){var e;const t=null===(e=this.ambient)||void 0===e?void 0:e.includes("secondary");this.mapAmbient=t?Jr:Wr,this._iconURL=t?this.iconDark:this.icon}_encodeIcon(){return encodeURIComponent(`icon:${this._iconURL}|`)}static get styles(){return[super.styles,Xr,m("bbva-map-static-shared-styles")]}render(){return this.loading?g``:g`<section
            id="map"
            class="bbva-map-static-section ${qe({desktop:this._desktop,tablet:this._tablet})}"
          ></section>
          ${this.message?g`<bbva-type-text
                class="bbva-map-static-text"
                text="${this.message}"
                tag="section"
                size="S"
                ?ellipsis="${this.ellipsis}"
              ></bbva-type-text>`:""}`}_createStaticMap(e){const t=this.shadowRoot.getElementById("map");t.style.backgroundImage=`url(${this.api}${Qr._getStaticStyle(this.mapAmbient)}&style=${encodeURIComponent(this.mapStyles)}&zoom=${this.zoom}&scale=${this.scale}&size=${this.size.width}x${this.size.height}&maptype=${this.mapType}&markers=${e}${this.location.latitude},${this.location.longitude}&key=${this.apiKey})`,t.style.backgroundPosition="center",t.style.backgroundSize="cover"}static _getStaticStyle(e){const t=[];return e.forEach((e=>{let i="";e.stylers.length>0&&(i+=(Object.prototype.hasOwnProperty.call(e,"featureType")?`feature:${e.featureType}`:"feature:all")+"|",i+=(Object.prototype.hasOwnProperty.call(e,"elementType")?`element:${e.elementType}`:"element:all")+"|",e.stylers.forEach((e=>{const t=Object.keys(e)[0],s=e[t].toString().replace("#","0x");i+=`${t}:${s}|`}))),t.push(`style=${encodeURIComponent(i)}`)})),t.join("&")}}const Yr=ct([it]);Object.values(Yr);var Zr=t`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.auto-parts-description {
  padding: 1.5rem 1rem 1rem 1rem;
}

.auto-parts-option {
  padding-bottom: 0.5rem;
}

.location-btn {
  padding-left: 1rem;
  padding-right: 1rem;
  padding-bottom: 1rem;
}

[data-tag-name=bbva-type-link] {
  padding-left: 1rem;
  padding-right: 1rem;
}

[data-tag-name=bbva-notification-message] {
  margin: 1rem;
}
`;class eo extends(y(Xe(et(c(Br(h)))))){static get is(){return"location-step"}static get scopedElements(){const e=[Qr,st,dt,Qt,Zt,tt,at,...eo.configurationScopedElements()];return eo.scopedElementsFromClasses(e)}static get properties(){return{address:{type:String},apiKey:{type:String,attribute:"api-key"},selectedGlassware:{type:Object,attribute:"selected-glassware"},dataAutoParts:{type:Array,attribute:"data-auto-parts"},geoLocation:{type:Object,attribute:"geo-location"},loading:{type:Boolean,attribute:"loading",reflect:!0},personalSupplier:{type:String,attribute:"personal-supplier"},resetSelected:{type:Number,attribute:"reset-selected",reflect:!0},selectedSupplier:{type:String,attribute:"selected-supplier"},userEmail:{type:String,attribute:"user-email"}}}constructor(){super(),this.prefix="",this.address="",this.apiKey="",this.selectedGlassware={},this.dataAutoParts=[],this.geoLocation={},this.loading=!1,this.personalSupplier="",this.resetSelected=0,this.selectedSupplier="",this.userEmail=""}get _setNotificationMessage(){return this.selectedSupplier!==this.personalSupplier?this._locale("location-step-search-by-bbva"):this._locale("location-step-search-by-user")}_handleClick(e){e.stopImmediatePropagation(),this.dispatch("location-link-click")}_selectedAutoParts({detail:e}){const t=this.dataAutoParts.find((t=>t.id===e.value));this.selectedGlassware={...t},this.dispatch("location-auto-parts-select",this.selectedGlassware)}_onCompleteStep(){this.dispatch("next-step",2),this._dispatchCustomEvent("complete")}_getDisableButton(){return this.selectedSupplier===this.personalSupplier?!this._validGlassware():!this._validGeoLocation()}_validGeoLocation(){return!!Object.keys(this.geoLocation||{}).length}_validGlassware(){return!!Object.keys(this.selectedGlassware).length&&this._validGeoLocation()}get _buildMapStatic(){var e,t;return this.apiKey.length?g`
          <bbva-map-static
            api-key="${this.apiKey}"
            message="${this.address}"
            ?loading="${!this.loading}"
            .location="${{latitude:null===(e=this.geoLocation)||void 0===e?void 0:e.lat,longitude:null===(t=this.geoLocation)||void 0===t?void 0:t.lng}}"
          >
          </bbva-map-static>

          <bbva-type-link id="change-location" size="S" @click="${this._handleClick}">
            ${this._locale("location-step-change-location-label")}
          </bbva-type-link>
        `:E}get _buildRadioButtons(){return this.selectedSupplier===this.personalSupplier?g`
          <bbva-type-text
            class="auto-parts-description"
            size="S"
            tag="span"
            text="${this._locale("location-step-search-description")}"
          >
          </bbva-type-text>
          <bbva-form-radio-group
            selected="${this.resetSelected}"
            @form-radio-group-item-change="${this._selectedAutoParts}"
          >
            ${Je(this.dataAutoParts,(e=>null==e?void 0:e.id),((e,t)=>g`
                <bbva-form-radio-button
                  divider="${t<2?"full":""}"
                  value="${e.id}"
                >
                  <bbva-type-text
                    class="auto-parts-option"
                    tag="span"
                    font-weight="500"
                    size="L"
                    text="${this._capitalize(e.name)}"
                  >
                  </bbva-type-text>
                  <bbva-type-text
                    tag="span"
                    size="S"
                    text="${this._locale("location-step-auto-parts-distance",{distance:e.stores[0].location.geolocation.distance})}"
                  >
                  </bbva-type-text>
                  <bbva-type-text
                    tag="span"
                    size="S"
                    text="${this._capitalize(e.stores[0].location.formattedAddress)}"
                  >
                  </bbva-type-text>
                </bbva-form-radio-button>
              `))}
          </bbva-form-radio-group>
        `:E}get _buildNotificationMessage(){return g`
      <bbva-notification-message
        message-title="${this._setNotificationMessage}"
        message="${this.userEmail}"
        book-title
      >
      </bbva-notification-message>
    `}get _buildFooterButton(){return g`
      <bbva-button-default
        id="locationContinue"
        ?disabled=${this._getDisableButton()}
        fullwidth
        text="${this._locale("continue-label")}"
        @click=${this._onCompleteStep}
      >
      </bbva-button-default>
    `}static get styles(){return[Zr,Yr.primary,rt.primary,ht.primary,Yt.primary,ei.primary,it.primary,m("location-step-shared-styles")]}render(){return g`
      ${this._buildMapStatic} ${this._buildRadioButtons} ${this._buildNotificationMessage}
      <div class="location-btn">
        ${this._buildFooterButton}
      </div>
    `}}var to=t`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0;
  --bbva-help-modal-padding-bottom: 0;
  overflow: unset;
}

[data-tag-name=bbva-expandable-step] {
  --bbva-expandable-step-default-content-max-height: auto;
  padding-bottom: 0;
}
[data-tag-name=bbva-expandable-step] .summary [data-tag-name=glass-reports-list-item] {
  --glass-reports-list-item-label: var(--_emergency-car-emergency-vehicle-glass-reports-multistep-item-completed-color);
  --glass-reports-list-item-description: var(--_emergency-car-emergency-vehicle-glass-reports-multistep-item-completed-color);
}
[data-tag-name=bbva-expandable-step] .summary [data-tag-name=bbva-type-text] {
  color: var(--_emergency-car-emergency-vehicle-glass-reports-multistep-item-completed-color);
  margin-left: 1rem;
  margin-right: 1rem;
  margin-bottom: 1rem;
}

#accidentDateStep {
  height: 100%;
}
#accidentDateStep[completed] {
  height: auto;
}

.confirmation-area {
  width: 100%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  padding-top: 1.5rem;
  padding-bottom: 1.5rem;
  padding-left: 1rem;
  padding-right: 1rem;
  background-color: var(--_emergency-car-emergency-vehicle-glass-reports-multistep-confirmation-area);
}
`;class io extends(y(Xe(et(c(Br(h)))))){static get is(){return"glass-reports-multistep-modal"}static get scopedElements(){const e=[Qe,pt,Nt,qt,tt,dt,st,Fr,Gr,Kr,eo,...io.configurationScopedElements()];return io.scopedElementsFromClasses(e)}static get properties(){return{address:{type:String},aemHost:{type:String,attribute:"aem-host"},aemPath:{type:String,attribute:"aem-path"},apiKey:{type:String,attribute:"api-key"},dataAutoParts:{type:Array,attribute:"data-auto-parts"},dataModal:{type:Object,attribute:"data-modal"},dataVehicle:{type:Object,attribute:"data-modal"},dateFormat:{type:String,attribute:"date-format"},deductiblePercentage:{type:String,attribute:"deductible-percentage"},geoLocation:{type:Object,attribute:"geo-location"},personalSupplier:{type:String,attribute:"personal-supplier"},percentageCovered:{type:String,attribute:"percentage-covered"},privacyTermsPdf:{type:Boolean,attribute:"privacy-terms-pdf"},pdfDocument:{type:String,attribute:"pdf-document"},selectedCrystals:{type:Array,attribute:"selected-crystals"},selectedDate:{type:String,attribute:"selected-date"},selectedGlassware:{type:Object,attribute:"selected-glassware"},selectedSupplier:{type:String,attribute:"selected-supplier"},stepCompleted:{type:Boolean,attribute:"step-completed",reflect:!0},userEmail:{type:String,attribute:"user-email"},vehicle:{type:Object},visibleModal:{type:Boolean,attribute:"visible-modal"},_resetSelected:{type:Number,state:!0,reflect:!0},_scrollToStepIndex:{type:Number,state:!0},_stepsToReset:{type:Array,state:!0},_selectedCrystals:{type:Array,state:!0},_selectedView:{type:Number,state:!0},_storageSupplier:{type:String,state:!0},_viewSelected:{type:String,state:!0}}}constructor(){super(),this.prefix="emergency-car-emergency-vehicle-glass-reports-multistep",this.address="",this.aemHost="",this.aemPath="",this.apiKey="",this.dataAutoParts=[],this.dataModal={},this.dataVehicle={},this.dateFormat="",this.deductiblePercentage="",this.geoLocation={},this.personalSupplier="",this.percentageCovered="",this.privacyTermsPdf=!1,this.pdfDocument="",this.selectedCrystals=[],this.selectedDate="",this.selectedGlassware={},this.selectedSupplier="",this.stepCompleted=!1,this.userEmail="",this.vehicle={},this.visibleModal=!1,this._resetSelected=0,this._scrollToStepIndex=-1,this._stepsToReset=[],this._selectedCrystals=[],this._selectedView=-1,this._storageSupplier="",this._viewSelected=""}attributeChangedCallback(e,t,i){if(super.attributeChangedCallback&&(super.attributeChangedCallback(e,t,i),"selected-supplier"===e&&i.length&&t.length&&i!==t)){const{length:e}=this._steps;this._steps[e-1].active=!0,this._steps[e-1].completed=!1,this._stepsToReset=[e]}}async update(e){super.update(e),e.has("vehicle")&&Object.keys(this.vehicle).length&&(await this.updateComplete,this._selectedView=0)}get _setLocationTitle(){return this.selectedSupplier!==this.personalSupplier?this._locale("location-step-title"):this._locale("location-and-glasses-step-title")}get _multistep(){return this.shadowRoot.querySelector("[data-tag-name=bbva-expandable-multistep]")}get _steps(){return this.shadowRoot.querySelectorAll("[data-tag-name=bbva-expandable-step]:not([prefilled])")}_handleCloseModal(e){e.stopImmediatePropagation(),this.dispatch("header-right-primary-click")}_saveAccidentDate({detail:e}){this.selectedDate=e}_handleModalState(e){e.stopImmediatePropagation();const{detail:{visible:t},target:i}=e;this.dispatchEvent(new CustomEvent("emergency-car-emergency-vehicle-glass-reports-modal-state-change",{bubbles:!0,composed:!0,detail:{visible:t,target:i,mode:"GlassMultistep"}})),t?(this._scrollToStepIndex=1,this._stepsToReset=[],this._resetSelected=-1,this._viewSelected="top"):this._reset()}_handleLinkClick(e){e.stopImmediatePropagation();let t="footer-link",i=!0;this.pdfDocument.length&&(t="pdf",i=this.pdfDocument),this.dispatch(`${t}-click`,i)}_handleGlassReport(){this.dispatch("report-create")}_handleAllComplete(e){this.dispatch("all-complete",e)}_handleStepComplete(e){const t=e.target.getAttribute("step");this.dispatch("step-complete-change",{step:t,completed:null==e?void 0:e.detail})}_reset(){this.selectedDate="",this._steps.forEach(((e,t)=>{this._steps[t].active=0===(null==e?void 0:e.step),this._steps[t].ambient="primary-alt",this._steps[t].completed=!1,this._steps[t].disabled=(null==e?void 0:e.step)>0})),this._resetSelected=0,this._scrollToStepIndex=-1,this._stepsToReset=[1,2,3],this._selectedCrystals=[],this._selectedView=0,this._storageSupplier="",this._viewSelected="",this._multistep.removeAttribute("edition-enabled"),this.dispatch("request-geolocation",!0)}get _buildVehicleDetail(){var e,t,i,s,a;return g`
      <bbva-expandable-step
        id="vehicleDetailStep"
        hide-padding-left
        hide-padding-right
        header="${this._locale("your-vehicle")}"
        prefilled
      >
        <div class="content"></div>
        <div slot="summary" class="summary">
          <glass-reports-list-item
            label="${this._locale("brand")}"
            description="${`${this._capitalize(null===(e=this.dataVehicle)||void 0===e||null===(t=e.brand)||void 0===t?void 0:t.name)} ${this._capitalize(null===(i=this.dataVehicle)||void 0===i||null===(s=i.subBrand)||void 0===s?void 0:s.name)}`}"
          >
          </glass-reports-list-item>
          <glass-reports-list-item
            label="${this._locale("policy")}"
            description="${(null===(a=this.dataVehicle)||void 0===a?void 0:a.policyNumber)||""}"
            hide-margin-bottom
          >
          </glass-reports-list-item>
        </div>
      </bbva-expandable-step>
    `}get _buildAccidentDateStep(){return g`
      <bbva-expandable-step
        id="accidentDateStep"
        step="0"
        disabled-target=".action"
        current-step-label="${this.prefix}-step-heading"
        hide-padding-left
        hide-padding-right
        header="${this._locale("accident-date-step-title")}"
        edit-label="${this._locale("edit-label")}"
        show-link
        @expandable-step-complete-change="${e=>this._handleStepComplete(e)}"
      >
        <div class="content">
          <accident-date-step
            prefix="${this.prefix}"
            ?native="${this.native}"
            deductible-percentage="${this.deductiblePercentage}"
            percentage-covered="${this.percentageCovered}"
            selected-date="${this.selectedDate}"
            @emergency-car-emergency-vehicle-glass-reports-multistep-accident-date-select="${this._saveAccidentDate}"
          >
          </accident-date-step>
        </div>
        <div slot="summary" class="summary">
          <glass-reports-list-item label="${moment(this.selectedDate).format(this.dateFormat)}">
          </glass-reports-list-item>
          <glass-reports-list-item
            label="${this._locale("summary-label-deductible")}"
            description="${this.deductiblePercentage}"
            hide-margin-bottom
          >
          </glass-reports-list-item>
        </div>
      </bbva-expandable-step>
    `}get _buildVehicleGlassesStep(){return g`
      <bbva-expandable-step
        id="glassesStep"
        step="1"
        disabled-target=".action"
        current-step-label="${this.prefix}-step-heading"
        hide-padding-left
        hide-padding-right
        header="${this._locale("glasses-step-title")}"
        edit-label="${this._locale("edit-label")}"
        show-link
        @expandable-step-complete-change="${e=>this._handleStepComplete(e)}"
      >
        <div class="content">
          <car-glasses-step
            aem-host="${this.aemHost}"
            aem-path="${this.aemPath}"
            prefix="${this.prefix}"
            .dataModal="${this.dataModal}"
            .resetSelected="${this._resetSelected}"
            .selectedCrystals="${this._selectedCrystals}"
            .vehicle="${this.vehicle}"
            storage-supplier="${this._storageSupplier}"
            personal-supplier="${this.personalSupplier}"
            selected-supplier="${this.selectedSupplier}"
            selected-view="${this._selectedView}"
            view-selected="${this._viewSelected}"
            @emergency-car-emergency-vehicle-glass-reports-multistep-car-glasses-item-change="${({detail:e})=>{this._storageSupplier=e}}"
            @emergency-car-emergency-vehicle-glass-reports-multistep-car-glasses-selected-crystals="${({detail:e})=>{this._selectedCrystals=e}}"
            @emergency-car-emergency-vehicle-glass-reports-multistep-car-glasses-selected-view="${({detail:e})=>{this._selectedView=e}}"
          >
          </car-glasses-step>
        </div>
        <div slot="summary" class="summary">
          ${Je(this.selectedCrystals,(e=>null==e?void 0:e.value),((e,t)=>g`
              <glass-reports-list-item
                label="${this._locale(`view-${e.view}-label`)}"
                description="${this._locale(`car-glasses-${e.label}`)}"
                margin-bottom="${t+1<this.selectedCrystals.length?"M":""}"
              >
              </glass-reports-list-item>
            `))}
        </div>
      </bbva-expandable-step>
    `}get _summaryAutoParts(){var e,t,i,s;return this.selectedSupplier===this.personalSupplier&&Object.keys(this.selectedGlassware).length?g`
          <bbva-type-text
            tag="span"
            text="${this.t("emergency-car-emergency-vehicle-glass-reports-auto-parts-formatted",{name:this._capitalize(null===(e=this.selectedGlassware)||void 0===e?void 0:e.name),formattedAddress:this._capitalize(null===(t=this.selectedGlassware)||void 0===t||null===(i=t.stores[0])||void 0===i||null===(s=i.location)||void 0===s?void 0:s.formattedAddress)})}"
          >
          </bbva-type-text>
        `:E}get _buildLocationStep(){return g`
      <bbva-expandable-step
        id="locationStep"
        step="2"
        disabled-target=".action"
        current-step-label="${this.prefix}-step-heading"
        hide-padding-left
        hide-padding-right
        header="${this._setLocationTitle}"
        edit-label="${this._locale("edit-label")}"
        show-link
        @expandable-step-complete-change="${e=>this._handleStepComplete(e)}"
      >
        <div class="content">
          <location-step
            ?loading="${!!Object.keys(this.geoLocation||{}).length}"
            prefix="${this.prefix}"
            selected-supplier="${this.selectedSupplier}"
            personal-supplier="${this.personalSupplier}"
            api-key="${this.apiKey}"
            .resetSelected="${this._resetSelected}"
            .selectedGlassware="${this.selectedGlassware}"
            .dataAutoParts="${this.dataAutoParts}"
            .geoLocation="${this.geoLocation}"
            address="${this.address}"
            user-email="${this.userEmail}"
          >
          </location-step>
        </div>
        <div slot="summary" class="summary">
          <bbva-type-text tag="span" text="${this.address}"> </bbva-type-text>
          ${this._summaryAutoParts}
          <glass-reports-list-item
            label="${this._locale("summary-email-label")}"
            description="${this.userEmail}"
            hide-margin-bottom
          >
          </glass-reports-list-item>
        </div>
      </bbva-expandable-step>
    `}get _tplSteps(){return g`
      ${this._buildVehicleDetail} ${this._buildAccidentDateStep} ${this._buildVehicleGlassesStep}
      ${this._buildLocationStep}
    `}get _tplConfirmPanel(){return g`
      <bbva-button-default
        variant="positive"
        text="${this._locale("confirm-label")}"
        @click="${this._handleGlassReport}"
        fullwidth
      >
      </bbva-button-default>
      <bbva-type-text text="${this._locale("legal-notice-message")}" size="S"></bbva-type-text>
      ${this.privacyTermsPdf?g`
            <bbva-type-link @click="${this._handleLinkClick}">
              ${this._locale("legal-notice-link-label")}
            </bbva-type-link>
          `:E}
    `}get _content(){return g`
      <bbva-expandable-multistep
        ambient="light"
        hide-disabled-steps
        scroll-to-step-index="${this._scrollToStepIndex}"
        step-selector="[data-tag-name='bbva-expandable-step']"
        .stepsToReset="${this._stepsToReset}"
        @expandable-multistep-specific-step-scroll="${({detail:e})=>{this.stepCompleted=null==e?void 0:e.completed}}"
        @expandable-multistep-all-complete="${({detail:e})=>this._handleAllComplete(e)}"
      >
        <div slot="content">
          ${this._tplSteps}
        </div>
        <div class="confirmation-area" slot="confirmation">
          ${this._tplConfirmPanel}
        </div>
      </bbva-expandable-multistep>
    `}static get styles(){return[to,rt.primary,ht.primary,it.primary,m("glass-reports-multistep-modal-shared-styles")]}render(){var e;return g`
      <bbva-help-modal
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ambient="light"
        full-height
        header-text=" "
        ?visible="${this.visibleModal}"
        hide-content-padding-top
        @modal-state-change="${this._handleModalState}"
      >
        <div slot="slot-header" class="header-slot">
          <bbva-header-main
            variant="${this.stepCompleted?"modal-initial-secondary":"modal-initial"}"
            .closeIconAriaLabel="${this.t("emergency-car-emergency-vehicle-glass-reports-header-return")}"
            text="${this.t("emergency-car-emergency-vehicle-glass-reports-multistep-header-title",{helpDescription:(null===(e=this.dataModal)||void 0===e?void 0:e.helpDescription)||" "})}"
            @header-main-icon-click="${this._handleCloseModal}"
          >
          </bbva-header-main>
        </div>
        <div slot="slot-content">
          ${this._content}
        </div>
      </bbva-help-modal>
    `}}var so=t`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0;
  --bbva-help-modal-footer-last-button-margin-top: 0;
}

.slotted-map {
  height: 100%;
}
.slotted-map [data-tag-name=bbva-map-dynamic] {
  text-align: left;
}
`;class ao extends(y(Xe(et(c(Br(h)))))){static get is(){return"glass-reports-change-location-modal"}static get scopedElements(){const e=[Qe,ti,...ao.configurationScopedElements()];return ao.scopedElementsFromClasses(e)}static get properties(){return{apiKey:{type:String,attribute:"api-key"},geoLocation:{type:Object,attribute:"geo-location"},tempGeoLocation:{type:Object,attribute:"temp-geo-location"},visibleModal:{type:Boolean,attribute:"visible-modal"},_refreshGeoLocation:{type:Object,state:!0},_minChars:{type:Number,state:!0},_saveAddress:{type:String,state:!0}}}constructor(){super(),this.prefix="emergency-car-emergency-vehicle-glass-reports-change-location",this.apiKey="",this.tempGeoLocation={},this.visibleModal=!1,this._refreshGeoLocation={},this._minChars=1e3,this._saveAddress=""}get _refresh(){var e,t;return this.visibleModal&&null!==(e=this.tempGeoLocation)&&void 0!==e&&e.lat&&null!==(t=this.tempGeoLocation)&&void 0!==t&&t.lng?this.tempGeoLocation:this._temporaryRequestGeoLocation}get _temporaryRequestGeoLocation(){var e,t;return null!==(e=this._refreshGeoLocation)&&void 0!==e&&e.lat&&null!==(t=this._refreshGeoLocation)&&void 0!==t&&t.lng?this._refreshGeoLocation:this.geoLocation}_parseDynamicAddress({detail:e}){var t,i,s,a,r,o;null!==(t=e.address)&&void 0!==t&&t.formatted_address&&null!==(i=e.address)&&void 0!==i&&i.address_components&&(this._saveAddress=null===(s=e.address)||void 0===s?void 0:s.formatted_address,this.dispatch("formatted-address-change",{formattedAddress:this._saveAddress,addressComponents:ao._parsedAddressComponents(null===(a=e.address)||void 0===a?void 0:a.address_components),state:ao._handleSearchTypes(null===(r=e.address)||void 0===r?void 0:r.address_components,"administrative_area_level_1"),locality:ao._handleSearchTypes(null===(o=e.address)||void 0===o?void 0:o.address_components,"locality")}))}static _handleSearchTypes(e,t){var i,s;return null===(i=e.find((e=>e.types.includes(t))))||void 0===i||null===(s=i.long_name)||void 0===s?void 0:s.toUpperCase()}static _parsedAddressComponents(e){const t={route:{label:"route",uses:"long_name"},street_number:{label:"strNumber",uses:"long_name"},locality:{label:"city",uses:"long_name"},postal_code:{label:"postalCode",uses:"long_name"},country:{label:"country",uses:"short_name"}};return e.reduce(((e,i)=>{const s=i.types.find((e=>t[e]));return s&&(e[t[s].label]=i[t[s].uses]),e}),{})}_parseGeoLocation({detail:e}){this._refreshGeoLocation={...e.geoLocation},this.dispatch("geolocation-refresh")}_reset(e){"boolean"!=typeof e||e||(this._refreshGeoLocation={})}_handleModalState(e){e.stopImmediatePropagation();const{detail:{visible:t},target:i}=e;this.dispatchEvent(new CustomEvent("emergency-car-emergency-vehicle-glass-reports-modal-state-change",{bubbles:!0,composed:!0,detail:{visible:t,target:i,mode:"GlassChangeLocation"}})),this._reset(t)}_handleCloseModal(e){e.stopImmediatePropagation();const{type:t}=e;"help-modal-header-click"===t&&this.dispatch("close-click"),"help-modal-footer-button-click"===t&&this.dispatch("footer-button-click")}_mapReady(){this.dispatch("map-ready",!0)}_requestGeoLocation(){this.dispatch("geolocation-request",!1)}_changeGeoLocation(e){e.stopImmediatePropagation(),this.dispatch("geolocation-change",{newGeoLocation:this._refresh,formattedAddress:this._saveAddress}),this._handleCloseModal(e)}static get styles(){return[so,ii.primaryAlt,m("glass-reports-change-location-modal-shared-styles")]}render(){return g`
      <bbva-help-modal
        ambient="light"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        full-height
        fixed-footer
        hide-content-padding-top
        ?visible=${this.visibleModal}
        header-text="${this._locale("header-text")}"
        button-text="${this._locale("button-text")}"
        header-close-icon-aria-label="${this.t("emergency-car-emergency-vehicle-glass-reports-header-return")}"
        @modal-state-change="${this._handleModalState}"
        @help-modal-footer-button-click="${this._changeGeoLocation}"
        @help-modal-header-click="${this._handleCloseModal}"
      >
        <div slot="slot-content" class="slotted-map">
          <bbva-map-dynamic
            ambient="primary-alt"
            variant="large"
            api-key="${this.apiKey}"
            is-draggable-pin
            hide-map-info-footer
            .geoLocation="${this._refresh}"
            .label="${this._locale("map-dynamic-label")}"
            accessibility-button-action="${this._locale("map-dynamic-accessibility-button-action")}"
            min-chars="${this._minChars}"
            predictive-info-message="${this._locale("predictive-info-message")}"
            is-required-input
            show-predictive
            @map-dynamic-map-ready="${this._mapReady}"
            @map-dynamic-geolocation-request="${this._requestGeoLocation}"
            @map-dynamic-geolocation-changed="${this._parseGeoLocation}"
            @map-dynamic-address-changed="${this._parseDynamicAddress}"
          >
          </bbva-map-dynamic>
        </div>
      </bbva-help-modal>
    `}}var ro=t`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class oo extends(y(c(et(Xe(Br(h)))))){static get is(){return"glass-reports-generic-modal"}static get scopedElements(){const e=[Qe,tt,...oo.configurationScopedElements()];return oo.scopedElementsFromClasses(e)}static get properties(){return{dataModal:{type:Object,attribute:"data-modal"},visibleModal:{type:Boolean,attribute:"visible-modal"}}}constructor(){super(),this.prefix="emergency-car-emergency-vehicle-glass-reports-generic",this.dataModal={},this.visibleModal=!1}_handleModalState(e){var t;const{detail:{visible:i},target:s}=e;this.dispatchEvent(new CustomEvent("emergency-car-emergency-vehicle-glass-reports-modal-state-change",{bubbles:!0,composed:!0,detail:{visible:i,target:s,mode:`Glass${null===(t=this.dataModal)||void 0===t?void 0:t.id}`}}))}_handleCloseModal(e){e.stopImmediatePropagation();const{type:t}=e;var i,s,a;["help-modal-footer-button-click"].includes(t)&&this.dispatch(`${null===(i=this.dataModal)||void 0===i?void 0:i.id}-footer-button-click`,null===(s=this.dataModal)||void 0===s?void 0:s.detail);["help-modal-footer-link-click","help-modal-header-click","help-modal-veil-click"].includes(t)&&this.dispatch(`${null===(a=this.dataModal)||void 0===a?void 0:a.id}-footer-link-click`)}get _buildSlotTitle(){var e,t,i,s,a;return null!==(e=this.dataModal)&&void 0!==e&&e.slotTitle?g`
          <div slot="slot-title">
            ${null!==(t=this.dataModal)&&void 0!==t&&null!==(i=t.customTitle)&&void 0!==i&&i.title?g`
                  <bbva-type-text
                    size="S"
                    text="${this._locale(null===(s=this.dataModal)||void 0===s||null===(a=s.customTitle)||void 0===a?void 0:a.title)}"
                  >
                  </bbva-type-text>
                `:E}
          </div>
        `:E}get _buildSlotContent(){var e,t,i,s,a,r,o,n,l;return null!==(e=this.dataModal)&&void 0!==e&&e.slotContent?g`
          <div slot="slot-content">
            ${null!==(t=this.dataModal)&&void 0!==t&&null!==(i=t.customParagraph)&&void 0!==i&&i.paragraph?g`
                  <bbva-type-text
                    size="S"
                    text="${this._locale(null===(s=this.dataModal)||void 0===s||null===(a=s.customParagraph)||void 0===a?void 0:a.paragraph)}"
                  >
                  </bbva-type-text>
                `:E}
            ${null!==(r=this.dataModal)&&void 0!==r&&null!==(o=r.customParagraph)&&void 0!==o&&o.paragraphTwo?g`
                  <bbva-type-text
                    size="S"
                    text="${this._locale(null===(n=this.dataModal)||void 0===n||null===(l=n.customParagraph)||void 0===l?void 0:l.paragraphTwo)}"
                  >
                  </bbva-type-text>
                `:E}
          </div>
        `:E}static get styles(){return[ro,it.primary,m("glass-reports-generic-modal-shared-styles")]}render(){var e,t,i,s,a,r,o,n,l,c,d,h,p,u;return g`
      <bbva-help-modal
        ambient="light"
        ?hide-content-padding-top="${null===(e=this.dataModal)||void 0===e?void 0:e.hideContentPaddingTop}"
        ?visible=${this.visibleModal}
        ?fixed-footer="${null===(t=this.dataModal)||void 0===t?void 0:t.fixedFooter}"
        ?full-height="${null===(i=this.dataModal)||void 0===i?void 0:i.fullHeight}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        body-text="${this._locale(null===(s=this.dataModal)||void 0===s?void 0:s.bodyText)}"
        button-text="${this._locale(null===(a=this.dataModal)||void 0===a||null===(r=a.buttons)||void 0===r?void 0:r.buttonText)}"
        header-close-icon-aria-label="${this.t("emergency-car-emergency-vehicle-glass-reports-header-return")}"
        header-text="${this._locale(null===(o=this.dataModal)||void 0===o?void 0:o.headerText)}"
        link-text="${null!==(n=this.dataModal)&&void 0!==n&&null!==(l=n.buttons)&&void 0!==l&&l.buttonLinkText?this._locale(null===(c=this.dataModal)||void 0===c||null===(d=c.buttons)||void 0===d?void 0:d.buttonLinkText):""}"
        modal-type="${null===(h=this.dataModal)||void 0===h?void 0:h.modalType}"
        title-icon="${null===(p=this.dataModal)||void 0===p?void 0:p.titleIcon}"
        .closeModalElements="${null===(u=this.dataModal)||void 0===u?void 0:u.closeModalElements}"
        @modal-state-change="${this._handleModalState}"
        @help-modal-veil-click="${this._handleCloseModal}"
        @help-modal-header-click="${this._handleCloseModal}"
        @help-modal-footer-button-click="${this._handleCloseModal}"
        @help-modal-footer-link-click="${this._handleCloseModal}"
      >
        ${this._buildSlotTitle} ${this._buildSlotContent}
      </bbva-help-modal>
    `}}var no=t`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0;
}

[data-tag-name=bbva-clip-microillustration] {
  margin-left: 1rem;
  margin-bottom: 1rem;
}

.report-description {
  display: flex;
  flex-direction: column;
  padding-left: 1rem;
  margin-bottom: 1.5rem;
}
.report-description [data-tag-name=bbva-type-text] {
  margin-bottom: 0.5rem;
}

[data-tag-name=bbva-header-category] {
  margin-left: 1rem;
}

[data-tag-name=bbva-notification-message] {
  margin-left: 1rem;
  margin-right: 1rem;
  margin-bottom: 1.5rem;
}

[data-tag-name=glass-reports-list-item] {
  display: flex;
  justify-content: space-between;
  flex-direction: row;
  align-items: flex-start;
}

[data-tag-name=bbva-header-category] {
  margin-top: 1rem;
  margin-bottom: 1rem;
}
`;class lo extends(y(c(et(Xe(Br(h)))))){static get is(){return"glass-reports-success-modal"}static get scopedElements(){const e=[Qe,ut,tt,Fr,at,mt,gt,...lo.configurationScopedElements()];return lo.scopedElementsFromClasses(e)}static get properties(){return{dataModal:{type:Object,attribute:"data-modal"},personalSupplier:{type:String,attribute:"personal-supplier"},selectedSupplier:{type:String,attribute:"selected-supplier"},vehicle:{type:Object},visibleModal:{type:Boolean,attribute:"visible-modal"}}}constructor(){super(),this.prefix="emergency-car-emergency-vehicle-glass-reports-success",this.dataModal={},this.vehicle={},this.personalSupplier="",this.selectedSupplier="",this.visibleModal=!1}_handleModalState(e){const{detail:{visible:t},target:i}=e;this.dispatchEvent(new CustomEvent("emergency-car-emergency-vehicle-glass-reports-modal-state-change",{bubbles:!0,composed:!0,detail:{visible:t,target:i,mode:"GlassSuccess"}}))}_handleCloseModal(e){e.stopImmediatePropagation(),this.dispatch("close-click")}_vehicleView(e){var t;return`view-${Object.keys(null===(t=this.vehicle)||void 0===t?void 0:t.glasses).reduce(((e,t)=>{var i;return{...e,...null===(i=this.vehicle)||void 0===i?void 0:i.glasses[t].reduce(((e,i)=>({...e,[i.id]:t})),{})}}),{})[e]}-label`}_handleReceiptAction({detail:e}){var t,i;const{id:s}=(null===(t=this.dataModal)||void 0===t?void 0:t.sharingOptions[e])||{};this.dispatchEvent(new CustomEvent(`emergency-car-emergency-vehicle-glass-reports-${s}`,{bubbles:!0,composed:!0,detail:null===(i=this.dataModal)||void 0===i?void 0:i.ticketSharing}))}get _microillustration(){return this.selectedSupplier===this.personalSupplier?"success":"pending"}get _buildMicroillustration(){return g`
      <bbva-clip-microillustration
        role="presentation"
        .microillustration="${this._microillustration}"
      >
      </bbva-clip-microillustration>
    `}get _buildDescription(){return g`
      <div class="report-description">
        <bbva-type-text
          tag="span"
          text="${this._locale("title-message")}"
          size="XL"
          font-weight="700"
        ></bbva-type-text>
        <bbva-type-text tag="span" text="${this._locale("description")}" size="S"></bbva-type-text>
      </div>
    `}get _buildDataReport(){var e;return g`
      <div>
        <bbva-header-category text="${this._locale("report-data")}"></bbva-header-category>
        ${Je((null===(e=this.dataModal)||void 0===e?void 0:e.information)||[],(e=>e.id),(e=>g`
            ${null!=e&&e.value?g`
                  <glass-reports-list-item
                    label="${this._locale(null==e?void 0:e.id)}"
                    description="${null==e?void 0:e.value}"
                    description-font-weight="500"
                  ></glass-reports-list-item>
                `:E}
          `))}
      </div>
    `}get _buildDamagedGlass(){var e;return g`
      <div>
        <bbva-header-category text="${this._locale("damaged-glass")}"></bbva-header-category>
        ${Je((null===(e=this.dataModal)||void 0===e?void 0:e.glasses)||[],(e=>null==e?void 0:e.id),(e=>{var t;return g`
            ${null!=e&&e.id?g`
                  <glass-reports-list-item
                    label="${this._locale(this._vehicleView(null==e?void 0:e.id))}"
                    description="${this.t(`emergency-car-emergency-vehicle-glass-reports-multistep-car-glasses-${null==e||null===(t=e.id)||void 0===t?void 0:t.toLowerCase().replace(/ /gi,"-")}`)}"
                    description-font-weight="500"
                  ></glass-reports-list-item>
                `:E}
          `}))}
      </div>
    `}get _buildNotificationMessages(){var e,t;return g`
      ${this.selectedSupplier!==this.personalSupplier?g`
            <bbva-notification-message
              book-title
              variant="caution"
              message-title="${this._locale("message-sms")}"
              message="${null===(e=this.dataModal)||void 0===e?void 0:e.userPhone}"
            >
            </bbva-notification-message>
          `:E}
      <bbva-notification-message
        book-title
        variant="default"
        message-title="${this.selectedSupplier===this.personalSupplier?this._locale("message-pass-email"):this._locale("message-email")}"
        message="${null===(t=this.dataModal)||void 0===t?void 0:t.userEmail}"
      >
      </bbva-notification-message>
    `}get _buttonRow(){var e;return g`
      <bbva-button-row
        ambient="primary-alt"
        @button-row-item-click="${this._handleReceiptAction}"
        .options="${(null===(e=this.dataModal)||void 0===e?void 0:e.sharingOptions)||[]}"
        accessibility-text="${this._locale("accessibility-button-row")}"
      ></bbva-button-row>
    `}static get styles(){return[no,bt.primary,it.primary,vt.primary,yt.primaryAlt,m("glass-reports-success-modal-shared-styles")]}render(){return g`
      <bbva-help-modal
        ambient="light"
        full-height
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        header-text="${this._locale("header-text")}"
        header-close-icon-aria-label="${this.t("emergency-car-emergency-vehicle-glass-reports-header-return")}"
        ?visible="${this.visibleModal}"
        @modal-state-change="${this._handleModalState}"
        @help-modal-header-click="${this._handleCloseModal}"
      >
        <div slot="slot-content">
          ${this._buildMicroillustration} ${this._buildDescription} ${this._buildDataReport}
          ${this._buildDamagedGlass} ${this._buildNotificationMessages} ${this._buttonRow}
        </div>
      </bbva-help-modal>
    `}}var co=t`
:host {
  display: block;
  box-sizing: border-box;
  height: 100%;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-progress-content] {
  z-index: 15;
}
`,ho=t`
:host {
  --_emergency-car-emergency-vehicle-glass-reports-multistep-confirmation-area: var(--_emergency-car-emergency-vehicle-glass-reports-multistep--_ambient--confirmation-area, ${ft("colorPrimaryAltSurfaceAmbientDefault",_t)});
  --_emergency-car-emergency-vehicle-glass-reports-multistep-item-completed-color: var(--_emergency-car-emergency-vehicle-glass-reports-multistep--_ambient--completed-color, ${ft("colorSecondaryText01Default",_t)});
}
`;class po extends(y(Xe(et(c(Br(h)))))){static get is(){return"emergency-car-emergency-vehicle-glass-reports"}static get scopedElements(){const e=[Hr,io,ao,oo,lo,...po.configurationScopedElements()];return po.scopedElementsFromClasses(e)}static get properties(){return{aemHost:{type:String,attribute:"aem-host"},aemPath:{type:String,attribute:"aem-path"},apiKey:{type:String,attribute:"api-key"},appSettingsApiVersion:{type:String,attribute:"app-settings-api-version"},autoPartsApiVersion:{type:String,attribute:"auto-parts-api-version"},customersApiVersion:{type:String,attribute:"customers-api-version"},customerId:{type:String,attribute:"customer-id"},dateFormat:{type:String,attribute:"date-format"},deductiblePercentage:{type:String,attribute:"deductible-percentage"},fieldsProperty:{type:String,attribute:"fields-property"},geoLocation:{type:Object,attribute:"geo-location"},insuranceCompany:{type:Object,attribute:"insurance-company"},initGlass:{type:Boolean,attribute:"init-glass"},lossesReportApiVersion:{type:String,attribute:"losses-report-api-version"},operationDateFormat:{type:String,attribute:"operation-date-format"},personalSupplier:{type:String,attribute:"personal-supplier"},percentageCovered:{type:String,attribute:"percentage-covered"},phoneNumberBbvaLine:{type:String,attribute:"phone-number-bbva-line"},phoneNumberBbvaLineVehicle:{type:String,attribute:"phone-number-bbva-line-vehicle"},publicSettings:{type:Array,attribute:"public-settings"},publicSettingsId:{type:String,attribute:"public-settings-id"},publicSettingsKey:{type:String,attribute:"public-settings-key"},productTypeVehicleInsurance:{type:String,attribute:"product-type-vehicle-insurance"},subProductType:{type:String,attribute:"sub-product-type"},customerContactDetails:{type:Array,attribute:"customer-contact-details"},privacyTermsPdf:{type:Boolean,attribute:"privacy-terms-pdf"},pdfDocument:{type:String,attribute:"pdf-document"},selectedDate:{type:String,attribute:"selected-date"},tempGeoLocation:{type:Object,attribute:"temp-geo-location"},ticketSharing:{type:Object,attribute:"ticket-sharing"},vehicle:{type:Object},vehicleInsurance:{type:Object,attribute:"vehicle-insurance"},vehicleInsurancesApiVersion:{type:String,attribute:"vehicle-insurances-api-version"},vehicleInsuranceId:{type:String,attribute:"vehicle-insurance-id"},_address:{type:Object,state:!0},_selectedGlassware:{type:Object,state:!0},_searchYourCrystal:{type:Number,state:!0},_errorName:{type:String,state:!0},_errorType:{type:String,state:!0},_dataAutoParts:{type:Array,state:!0},_dataPublicSettings:{type:Object,state:!0},_dataVehicleInsurance:{type:Object,state:!0},_genericModal:{type:Object,state:!0},_locality:{type:String,state:!0},_openChangeLocationModal:{type:Boolean,state:!0},_openGenericModal:{type:Boolean,state:!0},_openMultistepModal:{type:Boolean,state:!0},_selectedCrystals:{type:Array,state:!0},_selectedSupplier:{type:String,state:!0},_showExitConfirm:{type:Boolean,state:!0},_showSuccessModal:{type:Boolean,state:!0},_successModal:{type:Object,state:!0},_state:{type:String,state:!0},_userEmail:{type:String,state:!0},_userPhone:{type:String,state:!0}}}constructor(){super(),this.config={loader:!0},this.prefix="emergency-car-emergency-vehicle-glass-reports",this.aemHost="",this.aemPath="",this.apiKey="",this.appSettingsApiVersion="0",this.autoPartsApiVersion="0",this.customerContactDetails=[],this.privacyTermsPdf=!1,this.pdfDocument="",this.customerId="",this.customersApiVersion="3",this.dateFormat="",this.deductiblePercentage="",this.fieldsProperty="",this.insuranceCompany={},this.initGlass=!1,this.lossesReportApiVersion="1",this.operationDateFormat="",this.personalSupplier="",this.percentageCovered="",this.phoneNumberBbvaLine="",this.phoneNumberBbvaLineVehicle="",this.publicSettings=[],this.publicSettingsId="",this.publicSettingsKey="",this.productTypeVehicleInsurance="",this.subProductType="",this.selectedDate="",this.tempGeoLocation={},this.ticketSharing={},this.vehicle={},this.vehicleInsurance={},this.vehicleInsurancesApiVersion="1",this.vehicleInsuranceId="",this._address={},this._errorName="",this._errorType="",this._dataAutoParts=[],this._dataPublicSettings={},this._dataVehicleInsurance={},this._genericModal={},this._locality="",this._openChangeLocationModal=!1,this._openGenericModal=!1,this._openMultistepModal=!1,this._searchYourCrystal=0,this._selectedGlassware={},this._selectedCrystals=[],this._selectedSupplier="",this._showExitConfirm=!1,this._showSuccessModal=!1,this._successModal={},this._state="",this._userEmail="",this._userPhone=""}update(e){super.update(e);const t=!!Object.keys(this._dataPublicSettings).length||!!Object.keys(this._dataVehicleInsurance).length;(e.has("_dataPublicSettings")||e.has("_dataVehicleInsurance"))&&t&&(this._openMultistepModal=!0)}get _dm(){return this.shadowRoot.querySelector('[data-tag-name="emergency-car-emergency-vehicle-glass-reports-dm"]')}navigateForward(e=!1,t=!0,i={}){this._dispatchCustomEvent("navigation-go-forward",{id:"EmergencyCarEmergencyVehicleGlassReports",params:{target:{id:"EmergencyCarEmergencyVehicleGlassReports",params:i,history:{routes:[],data:{vehicleInsuranceData:this._dataVehicleInsurance,publicSettingsData:this._dataPublicSettings}}}},replace:e,external:t})}navigateBack(e=!0){e&&this._dispatchCustomEvent("navigation-go-back",e)}_dmDataPublicSettings({detail:e}){this._dataPublicSettings=e}_dmDataVehicleInsurance({detail:e}){this._dataVehicleInsurance={...e}}_dmDataCustomerDetails({detail:e}){this._userEmail=null==e?void 0:e.userEmail,this._userPhone=null==e?void 0:e.userPhone}_dmDataAutoParts({detail:e}){this._dataAutoParts=[...e]}_exitConfirm(){this._showExitConfirm=!0}_manageBackButton(){this._showExitConfirm?this._settingsExitModal():this._handleClosed()}_settingsExitModal(){const e={id:"exit",bodyText:"exit-modal-body-text",buttons:{buttonText:"leave-button-text",buttonLinkText:"exit-modal-link-text"},closeModalElements:["footer-link"],fullHeight:!1,headerText:"exit-modal-header-text",modalType:"caution",titleIcon:ze()};this._genericModal={...e},this._openGenericModal=!0}_settingsAlreadyRequested(){const e={headerText:"operation-not-carried-out-header-text",modalType:"warning",titleIcon:A(),id:"alreadyRequested",bodyText:"already-requested-modal-body-text",buttons:{buttonText:"call-for-help-button-text",buttonLinkText:"leave-button-text"},closeModalElements:["footer-link"],fixedFooter:!0,fullHeight:!0,detail:{phoneNumber:this.phoneNumberBbvaLineVehicle}};this._genericModal={...e},this._openGenericModal=!0}_settingsRetryErrorModal({detail:e}){const t={headerText:"operation-not-carried-out-header-text",modalType:"warning",titleIcon:A()},i={retry:{id:"retry",bodyText:"retry-modal-body-text",buttons:{buttonText:"retry-modal-button-text",buttonLinkText:"leave-button-text"},closeModalElements:["footer-button","footer-link"],fullHeight:!1},callForHelp:{id:"callForHelp",bodyText:"call-for-help-modal-body-text",buttons:{buttonText:"call-for-help-button-text",buttonLinkText:"leave-button-text"},closeModalElements:["footer-link"],fixedFooter:!0,fullHeight:!0,headerText:"call-for-help-communication-error-header-text",detail:{phoneNumber:this.phoneNumberBbvaLine}}}[null==e?void 0:e.errorId];this._genericModal={...t,...i},this._openGenericModal=!0}_settingSuccessModal({detail:e}){var t,i,s,a,r,o,n,l,c,d,h,p;const u=null==e||null===(t=e.requestType)||void 0===t||null===(i=t.lossDetail)||void 0===i||null===(s=i.serviceSpecificLosses)||void 0===s?void 0:s.find((e=>"CRYSTALS"===e.id));let m={};var g,b,v,y,f;this._selectedSupplier===this.personalSupplier&&(m={id:"glass-provider",value:this._locale("auto-parts-formatted",{name:this._capitalize(null==u||null===(g=u.serviceDetails)||void 0===g||null===(b=g.glassware)||void 0===b?void 0:b.description),formattedAddress:this._capitalize(null===(v=this._selectedGlassware)||void 0===v||null===(y=v.stores[0])||void 0===y||null===(f=y.location)||void 0===f?void 0:f.formattedAddress)})});const _={id:"success",information:[{id:"operation-date",value:moment(null==e?void 0:e.operationDate).format(this.operationDateFormat)},{id:"operation-number",value:null==e?void 0:e.id},{id:"vehicle-brand",value:`${this._capitalize(null===(a=this._dataVehicleInsurance)||void 0===a||null===(r=a.brand)||void 0===r?void 0:r.name)} ${this._capitalize(null===(o=this._dataVehicleInsurance)||void 0===o||null===(n=o.subBrand)||void 0===n?void 0:n.name)}`},{id:"policy",value:null===(l=this._dataVehicleInsurance)||void 0===l?void 0:l.policyNumber},{id:"accident-date",value:moment(null==u||null===(c=u.serviceDetails)||void 0===c?void 0:c.reportDate).format(this.dateFormat)},{id:"deductible",value:`${this.deductiblePercentage}`},{id:"location",value:null===(d=this._address)||void 0===d?void 0:d.formattedAddress},m],glasses:null==u||null===(h=u.serviceDetails)||void 0===h||null===(p=h.glassware)||void 0===p?void 0:p.glasswareType,userPhone:this._userPhone,userEmail:this._userEmail,sharingOptions:[{id:"ticket-share",icon:Ee(),label:this._locale("success-share")}],ticketSharing:this.ticketSharing};this._successModal={..._},this._showSuccessModal=!0}_settingsNoticePrivacy(){this._genericModal={id:"noticePrivacy",buttons:{buttonText:"notice-privacy-button-text"},closeModalElements:["footer-button"],fixedFooter:!0,fullHeight:!0,headerText:"notice-privacy-modal-header-text",slotTitle:!0,slotContent:!0,customParagraph:{paragraph:"notice-privacy-modal-paragraph-text",paragraphTwo:"notice-privacy-modal-paragraph-two-text"},detail:{}},this._openGenericModal=!0}_closeGenericModal(){this._openGenericModal=!1}_closeRetryModal(){this._openGenericModal=!1,this._dm._retryOn()}_handleClosed(){this.initGlass=!1,this.tempGeoLocation={},this.vehicle.glasses={...this._setVehicle()},this.selectedDate="",this._selectedGlassware={},this._dataAutoParts=[],this._errorName="",this._errorType="",this._openMultistepModal=!1,this._openGenericModal=!1,this._showExitConfirm=!1,this._showSuccessModal=!1,this._selectedCrystals=[],this._selectedSupplier=""}_setVehicle(){var e;return Object.keys(null===(e=this.vehicle)||void 0===e?void 0:e.glasses).reduce(((e,t)=>{var i;const s={...e};return s[t]=null===(i=this.vehicle)||void 0===i?void 0:i.glasses[t].map((e=>({id:e.id,label:e.label,src:e.src,view:e.view}))),s}),{})}_callPhoneNumber({detail:{phoneNumber:e}}){const t=String(e).split("#"),i={phoneNumber:t[0]||void 0,showConfirmation:!0,extension:t[1]||void 0};this.dispatch("action-generate-call",i)}_selectedSupplierType({detail:e}){this._searchYourCrystal=this.personalSupplier===e?0:1,this._selectedSupplier=e}_selectedAccidentDate({detail:e}){this.selectedDate=e}_selectedGlasses({detail:e}){this._selectedCrystals=e}_selectedAutoParts({detail:e}){this._selectedGlassware={...e}}_formattedAddress({detail:e}){const{addressComponents:t,formattedAddress:i,locality:s,state:a}=e;this._address={addressComponents:t,formattedAddress:i},this._locality=s,this._state=a}async _newGeoLocation({detail:e}){const{newGeoLocation:t,formattedAddress:i}=e;this.geoLocation={...t},this._address.formattedAddress=i,await this.updateComplete,this._selectedSupplier===this.personalSupplier&&this._dm.getAutoPartsDm()}_resetTempGeoLocation(){this.tempGeoLocation={}}_nativePluginGeoLocation({detail:e}){this.native?this.dispatch("native-geolocation",e):this._getWebCurrentPosition(e)}_getWebCurrentPosition(e){navigator.geolocation.getCurrentPosition((t=>{const i={lat:t.coords.latitude,lng:t.coords.longitude};e?this.geoLocation={...i}:this._openChangeLocation?this.tempGeoLocation={...i}:this._resetTempGeoLocation()}),(e=>{this.dispatch("geolocation-error",{code:e.code,message:e.message})}),{enableHighAccuracy:!0,timeout:5e3,maximumAge:0})}_openChangeLocation(){this._openChangeLocationModal=!0,this._resetTempGeoLocation()}_closeChangeLocation(){this._openChangeLocationModal=!1}get _tplDm(){return g`
      <emergency-car-emergency-vehicle-glass-reports-dm
        host="${this.host}"
        ?native="${this.native}"
        required-token="${this.requiredToken}"
        app-settings-api-version="${this.appSettingsApiVersion}"
        auto-parts-api-version="${this.autoPartsApiVersion}"
        losses-report-api-version="${this.lossesReportApiVersion}"
        .address="${this._address}"
        selected-date="${this.selectedDate}"
        customers-api-version="${this.customersApiVersion}"
        customer-id="${this.customerId}"
        error-name="${this._errorName}"
        error-type="${this._errorType}"
        fields-property="${this.fieldsProperty}"
        ?init-glass="${this.initGlass}"
        locality="${this._locality}"
        personal-supplier="${this.personalSupplier}"
        public-settings-id="${this.publicSettingsId}"
        public-settings-key="${this.publicSettingsKey}"
        product-type-vehicle-insurance="${this.productTypeVehicleInsurance}"
        selected-supplier="${this._selectedSupplier}"
        state="${this._state}"
        search-your-crystal="${this._searchYourCrystal}"
        sub-product-type="${this.subProductType}"
        vehicle-insurances-api-version="${this.vehicleInsurancesApiVersion}"
        vehicle-insurance-id="${this.vehicleInsuranceId}"
        .selectedCrystals="${this._selectedCrystals}"
        .selectedGlassware="${this._selectedGlassware}"
        .customerContactDetails="${this.customerContactDetails}"
        .geoLocation="${this.geoLocation}"
        .insuranceCompany="${this.insuranceCompany}"
        .publicSettings="${this.publicSettings}"
        .vehicleInsurance="${this.vehicleInsurance}"
        @emergency-car-emergency-vehicle-glass-reports-dm-already-requested="${this._settingsAlreadyRequested}"
        @emergency-car-emergency-vehicle-glass-reports-dm-auto-parts="${this._dmDataAutoParts}"
        @emergency-car-emergency-vehicle-glass-reports-dm-customer-contact-details="${this._dmDataCustomerDetails}"
        @emergency-car-emergency-vehicle-glass-reports-dm-hide-loader="${this.clearLoader}"
        @emergency-car-emergency-vehicle-glass-reports-dm-public-settings="${this._dmDataPublicSettings}"
        @emergency-car-emergency-vehicle-glass-reports-dm-retry-error="${this._settingsRetryErrorModal}"
        @emergency-car-emergency-vehicle-glass-reports-dm-show-loader="${this.showLoader}"
        @emergency-car-emergency-vehicle-glass-reports-dm-vehicle-insurance="${this._dmDataVehicleInsurance}"
        @emergency-car-emergency-vehicle-glass-reports-dm-losses-report-success="${this._settingSuccessModal}"
      >
      </emergency-car-emergency-vehicle-glass-reports-dm>
    `}get _tplMultistep(){return g`
      <glass-reports-multistep-modal
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        address="${this._address.formattedAddress}"
        aem-host="${this.aemHost}"
        aem-path="${this.aemPath}"
        api-key="${this.apiKey}"
        ?visible-modal="${this._openMultistepModal}"
        ?privacy-terms-pdf="${this.privacyTermsPdf}"
        date-format="${this.dateFormat}"
        deductible-percentage="${this.deductiblePercentage}"
        .selectedCrystals="${this._selectedCrystals}"
        .selectedGlassware="${this._selectedGlassware}"
        .dataModal="${this._dataPublicSettings}"
        .dataVehicle="${this._dataVehicleInsurance}"
        .dataAutoParts="${this._dataAutoParts}"
        .geoLocation="${this.geoLocation}"
        .vehicle="${this.vehicle}"
        ?native="${this.native}"
        personal-supplier="${this.personalSupplier}"
        percentage-covered="${this.percentageCovered}"
        pdf-document="${this.pdfDocument}"
        selected-date="${this.selectedDate}"
        selected-supplier="${this._selectedSupplier}"
        user-email="${this._userEmail}"
        @emergency-car-emergency-vehicle-glass-reports-multistep-request-geolocation="${this._nativePluginGeoLocation}"
        @emergency-car-emergency-vehicle-glass-reports-multistep-accident-date-select="${this._selectedAccidentDate}"
        @emergency-car-emergency-vehicle-glass-reports-multistep-car-glasses-glasses-select="${this._selectedGlasses}"
        @emergency-car-emergency-vehicle-glass-reports-multistep-car-glasses-supplier-select="${this._selectedSupplierType}"
        @emergency-car-emergency-vehicle-glass-reports-multistep-footer-link-click="${this._settingsNoticePrivacy}"
        @emergency-car-emergency-vehicle-glass-reports-multistep-header-right-primary-click="${this._manageBackButton}"
        @emergency-car-emergency-vehicle-glass-reports-multistep-location-auto-parts-select="${this._selectedAutoParts}"
        @emergency-car-emergency-vehicle-glass-reports-multistep-location-link-click="${this._openChangeLocation}"
        @emergency-car-emergency-vehicle-glass-reports-multistep-next-step="${this._exitConfirm}"
        @emergency-car-emergency-vehicle-glass-reports-multistep-report-create="${()=>this._dm.createReport()}"
      >
      </glass-reports-multistep-modal>
    `}get _tplChangeLocation(){return g`
      <glass-reports-change-location-modal
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ?visible-modal="${this._openChangeLocationModal}"
        api-key="${this.apiKey}"
        .geoLocation="${this.geoLocation}"
        .tempGeoLocation="${this.tempGeoLocation}"
        @emergency-car-emergency-vehicle-glass-reports-change-location-close-click="${this._closeChangeLocation}"
        @emergency-car-emergency-vehicle-glass-reports-change-location-footer-button-click="${this._closeChangeLocation}"
        @emergency-car-emergency-vehicle-glass-reports-change-location-formatted-address-change="${this._formattedAddress}"
        @emergency-car-emergency-vehicle-glass-reports-change-location-geolocation-change="${this._newGeoLocation}"
        @emergency-car-emergency-vehicle-glass-reports-change-location-geolocation-refresh="${this._resetTempGeoLocation}"
        @emergency-car-emergency-vehicle-glass-reports-change-location-geolocation-request="${this._nativePluginGeoLocation}"
        @emergency-car-emergency-vehicle-glass-reports-change-location-map-ready="${this._nativePluginGeoLocation}"
      >
      </glass-reports-change-location-modal>
    `}get _tplGenericModal(){return g`
      <glass-reports-generic-modal
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ?visible-modal="${this._openGenericModal}"
        .dataModal="${this._genericModal}"
        @emergency-car-emergency-vehicle-glass-reports-generic-alreadyRequested-footer-button-click="${this._callPhoneNumber}"
        @emergency-car-emergency-vehicle-glass-reports-generic-alreadyRequested-footer-link-click="${this._handleClosed}"
        @emergency-car-emergency-vehicle-glass-reports-generic-callForHelp-footer-button-click="${this._callPhoneNumber}"
        @emergency-car-emergency-vehicle-glass-reports-generic-callForHelp-footer-link-click="${this._handleClosed}"
        @emergency-car-emergency-vehicle-glass-reports-generic-exit-footer-button-click="${this._handleClosed}"
        @emergency-car-emergency-vehicle-glass-reports-generic-exit-footer-link-click="${this._closeGenericModal}"
        @emergency-car-emergency-vehicle-glass-reports-generic-noticePrivacy-footer-button-click="${this._closeGenericModal}"
        @emergency-car-emergency-vehicle-glass-reports-generic-noticePrivacy-footer-link-click="${this._closeGenericModal}"
        @emergency-car-emergency-vehicle-glass-reports-generic-retry-footer-button-click="${this._closeRetryModal}"
        @emergency-car-emergency-vehicle-glass-reports-generic-retry-footer-link-click="${this._handleClosed}"
      >
      </glass-reports-generic-modal>
    `}get _tplSuccessModal(){return g`
      <glass-reports-success-modal
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ?visible-modal="${this._showSuccessModal}"
        .dataModal="${this._successModal}"
        .vehicle="${this.vehicle}"
        personal-supplier="${this.personalSupplier}"
        selected-supplier="${this._selectedSupplier}"
        @emergency-car-emergency-vehicle-glass-reports-success-close-click="${this._handleClosed}"
      >
      </glass-reports-success-modal>
    `}static get styles(){return[co,ho,m("emergency-car-emergency-vehicle-glass-reports-shared-styles")]}render(){return g`
      ${super.render()} ${this._tplDm}
      <div ambient="light">
        ${this._tplMultistep} ${this._tplChangeLocation} ${this._tplGenericModal}
        ${this._tplSuccessModal}
      </div>
    `}}customElements.define(po.is,po);class uo{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let i=Object(this),s=i.length>>>0;if(0===s)return!1;let a=0|t,r=Math.max(a>=0?a:s-Math.abs(a),0);for(;r<s;){if((o=i[r])===(n=e)||"number"==typeof o&&"number"==typeof n&&isNaN(o)&&isNaN(n))return!0;r++}var o,n;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var i=[],s=0,a="",r=0,o=arguments.length;r!==o;++r){var n=+arguments[r];if(!(n<1114111&&n>>>0===n))throw RangeError("Invalid code point: "+n);n<=65535?s=i.push(n):(n-=65536,s=i.push(55296+(n>>10),n%1024+56320)),s>=16383&&(a+=e.apply(null,i),i.length=0)}return a+e.apply(null,i)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",i=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${i&&i.message}`)}}class mo extends uo{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}}const go=0,bo=1,vo="jwt",yo="tsec",fo="none";class _o extends uo{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=go,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new mo,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=yo:this.requiredToken=fo,this.requiresJWT=!1):this.requiredToken===yo?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===vo?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===fo?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(yo)}_setJwtHandler(){this._setTokenHandler(vo)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((i,s)=>{t=Object.assign(t,{resolve:i,reject:s}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let i=this._getRequestHeaders();Object.keys(i).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,i[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let t=null;return!!window.CellsNativePlugins&&(t=e),t}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let i=e.replace(/[\{\}]+/g,""),s=t[i];return s?delete t[i]:this._error(9,`Missing ${i} param value`),s})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let i=Object.keys(t);i.length&&(e=[e,i.map((e=>{let i=t[e];return Array.isArray(i)&&this.paramArrayMode===bo?this._arrayToQueryParam(e,i):`${e}=${i}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(yo,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(vo,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(i){var s=t.getItem(i);s&&"null"!==s&&(e[i]=s)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const i=window.sessionStorage;t=Object.keys(i).filter((t=>t.startsWith(e))).reduce(((t,s)=>(t[s.replace(e,"")]=i.getItem(s),t)),{})}return t}_getTokenForRequestHeaders(e,t){const i=`${e}Handler`,s=e===vo?"JWT ":"",a=e===vo?"Authorization":yo;if(void 0===this[i]||null===this[i])this._error(11,`${e} handler is undefined`);else{const r=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let o=this[i].getItem(r);o?t[a]=t[a]||s+o:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((i=>{t.push(`${i}=${e[i]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let i;const s=new Promise(((e,t)=>{i=(i,s)=>{i?t(i):e(s)}}));return t.addEventListener("loadend",(function e(s){t.removeEventListener("loadend",e),s.error?i(s.error):i(null,t.result)})),t.readAsText(e),s}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let i=0;for(;i<e.length;){let s=e[i],a=0,r=0;if(s<=127?(a=0,r=255&s):s<=223?(a=1,r=31&s):s<=239?(a=2,r=15&s):s<=244&&(a=3,r=7&s),e.length-i-a>0){let t=0;for(;t<a;)s=e[i+t+1],r=r<<6|63&s,t+=1}else r=65533,a=e.length-i;t+=String.fromCodePoint(r),i+=a+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},i=e.trim().split(/[\r\n]+/);for(const e in i)if(i.hasOwnProperty(e)&&""!==i[e]){let s=": ",a=i[e].split(s);t[a.shift().toLowerCase()]=a.join(s)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,i,s){let a=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(s)>=0&&(a=t.getResponseHeader(s));break;case this._NATIVE_XHR:t&&t.headers&&(a=JSON.parse(t.headers)[s])}if(a){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):i;e.getItem(t)!==a&&(e.setItem(t,a),this._emitTokenUpdate(i,a))}}_emitTokenUpdate(e,t){if(this.htmlContext){const i=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(i)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,i,s,a,r;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),i=e.getResponseHeader("AuthenticationData"),s=e.getResponseHeader("AuthenticationState"),a=e.getResponseHeader("AuthenticationChallenge"),r=e.getResponseHeader("AuthenticationResponse");else{let o=JSON.parse(e.headers);t=o.authenticationtype,i=o.authenticationdata||null,s=o.authenticationstate,a=o.authenticationchallenge,r=o.authenticationresponse}return{type:t,data:i,state:s,challenge:a,response:r}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",i=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const s=this._getSignatureData(e,t,i);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:s}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",i="",s=""){let a;if("object"==typeof e&&e){const r=this._getSignatureData(e.signatureType,t,i);a=this._makeKeyValuePairFromObject(r,e.signatureValue),e.challenge&&(a+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(a,e.signatureType,s)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(a=`password=${e}`,this._buildSignatureHeaders(a,"2",s)):(a=`${i}=${e}`,this._buildSignatureHeaders(a,t,s)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let i,s=e.split(",");if(s.length>1){i=s.map((e=>`${e}=${t[e]}`)).join(",")}else i=`${e}=${t}`;return i}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",i=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),i&&(this.headers=Object.assign(this.headers,{AuthenticationState:i})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),a=this._ERROR_CODES.SIGNATURE_INVALID.includes(s),{type:r,data:o,state:n,challenge:l,response:c}=this._extractSignatureResponseHeaders(e),d=this._getRequestMetadata(e);if(a)this._notifySignatureInvalid(d),i=!0;else if(r)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(s)?(this._notifySignatureTypeUsingErrorCode(s,d,r,o,n,l,c),i=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(d,r,o,n,l,c),i=!0}return i}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),a=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(s),r=this._getRequestMetadata(e);a&&(this._notifyWaitingForProcessResponse(r),i=!0)}return i}_notifySignatureRequiredFirstStep(e,t,i,s){this._defineSignatureType(t,i),this._defineSignatureValue(t,i,s),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:i,metadata:e}}))}_notifySignatureRequired(e,t,i,s,a,r){this._defineSignatureValue(t,i,s);const o={type:t,data:i,challenge:a,metadata:e};r&&(o.response=r),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:o}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:i}=e;return{path:this._path,method:this.method,url:t,status:i}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",i=""){const s=t.split(";").findIndex((t=>t===e));return i?i.split(";")[s]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,i,s,a,r){s?this._notifySignatureRequired(e,t,i,s,a,r):this._notifySignatureRequiredFirstStep(e,t,i,s)}_notifySignatureTypeUsingErrorCode(e,t,i,s,a,r,o){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,i,s,a):this._notifySignatureRequired(t,i,s,a,r,o)}}class So extends _o{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}}class $o extends _o{constructor(e=null){super(Object.assign(e||{},{method:"POST"}))}toString(e=""){return super.toString(e||"BGADPRequestPOST")}}class xo extends So{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`routing/v${this.version}/proactive-assist-rules`)}toString(){return super.toString("BGADPRoutingProactiveAssistRulesGetV2")}}class Co extends $o{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`routing/v${this.version}/route`)}toString(){return super.toString("BGADPRoutingRoutePostV2")}}class To extends(He(h)){}class ko extends To{static get is(){return"bbva-global-route-api-dm"}constructor(){super()}postRoute(e){this._requestMapping(e),this._generateGetService(this._getService("post",e),{customEvent:"route-api-dm-create",errorFireEventHandler:"route-api-dm-create-error"},this._responseMapping)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}Route`,this._getBgadp(s))}_getBgadp(e){return{postRouteV1:()=>new St(e),postRouteV2:()=>new Co(e),default:()=>"BGADP called not exist"}}_requestMapping(e){return"1"==this.version&&Object.keys(e).length&&(e.accessPoint&&this._renameProperty(e,"accessPoint","currentAccessRoute"),this._removeFields(["maxNumChannels"],e)),e}_responseMapping(e){if("1"==this.version&&Array.isArray(e)){const t=["additionalInformation","isCustServiceHours","attentionChannel","attentionSubchannel"],i={};(e=e[0]).routingOptions=[],i.assistanceTouchpoint=e.attentionChannel,i.assistanceTouchpointSegment=e.attentionSubchannel,e.additionalInformations&&(this._renameProperty(e,"additionalInformations","additionalInformation"),e.additionalInformation.map((e=>{this._renameProperty(e,"additionalInformation","name")})),i.additionalInformation=e.additionalInformation),e.routingOptions.push(i),this._removeFields(t,e),this.lastResponse&&(this.lastResponse.data=e)}return e}}class Io extends To{static get is(){return"bbva-global-routing-proactive-assist-rules-base-api-dm"}getProactiveAssistRules(e){this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}ProactiveAssistRules`,this._getBgadp(s))}_getBgadp(e){return{getProactiveAssistRulesV2:()=>new xo(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}je(Io,"GET_EVENTS",{customEvent:"proactive-assist-rules-api-dm-fetch",errorFireEventHandler:"proactive-assist-rules-api-dm-fetch-error"}),customElements.define(Io.is,Io);class Eo extends(Xe(et(c(h)))){static get is(){return"bbva-manager-emergency-authentication"}static get scopedElements(){const e=[$t,xt,Ct,ko];return Eo.scopedElementsFromClasses(e)}static get properties(){return{aapTarget:{type:String},journeyContextItemsApiVersion:{type:String},routingApiVersion:{type:String},singleSignOnApiVersion:{type:String},_authenticationFlag:{type:Boolean,state:!0},_contextId:{type:String,state:!0},_interactionContextBody:{type:Object,state:!0},_journeyId:{type:String,state:!0},_callRejectedLine:{type:String,state:!0}}}constructor(){super(),this.aapTarget="10000183",this.host="",this.native=!1,this.requiredToken="none",this.journeyContextItemsApiVersion="2",this.routingApiVersion="1",this.singleSignOnApiVersion="0",this._authenticationFlag=!1,this._contextId="",this._interactionContextBody={},this._journeyId="",this._callRejectedLine=""}get _dpInteractionContext(){return this.shadowRoot.querySelector('[data-tag-name="bbva-dataprovider-interaction-context"]')}get _singleSignOnDm(){return this.shadowRoot.querySelector('[data-tag-name="bbva-global-single-sign-on-api-dm"]')}get _journeyContextItemsDm(){return this.shadowRoot.querySelector('[data-tag-name="bbva-global-journey-context-items-api-dm"]')}get _routeDm(){return this.shadowRoot.querySelector('[data-tag-name="bbva-global-route-api-dm"]')}getFeatureFlagsCollection(e){var t;this._authenticationFlag=(null===(t=e["glomo.assistanceSection.authenticateInheritance"])||void 0===t?void 0:t.value)??!1}callInheritanceAuthentication(e){this._callRejectedLine=e,this._authenticationFlag&&this._handleInheritanceAuthentication(),this._authenticationFlag||this._dispatchEvent("phone-number-card-rejected",e)}_handleInheritanceAuthentication(){this._interactionContextBody={contextInformation:{currentAccessRoute:"GLOMO_VOICE",intent:"HA03",customerQuery:"Emergencias_TarjetaRechazada"}},this._dpInteractionContext.version="1",this._dpInteractionContext.createJourney(this._interactionContextBody)}_handleSuccessJourneyCreation(e){var t,i,s,a;this._journeyId=null==e||null===(t=e.detail)||void 0===t?void 0:t.journeyId;const r={currentAccessRoute:null===(i=this._interactionContextBody.contextInformation)||void 0===i?void 0:i.currentAccessRoute,intent:null===(s=this._interactionContextBody.contextInformation)||void 0===s?void 0:s.intent,customerQuery:null===(a=this._interactionContextBody.contextInformation)||void 0===a?void 0:a.customerQuery};this._dpInteractionContext.version="0",this._dpInteractionContext.params={"journey-id":this._journeyId},this._dpInteractionContext.postContext(r)}_handleCreateContextSuccess(e){var t,i;this._contextId=null==e||null===(t=e.detail)||void 0===t?void 0:t.contextId,null===(i=this._singleSignOnDm)||void 0===i||i.postSingleSignOn({aapTarget:this.aapTarget})}_handleSuccessCreateSSO(e){var t,i;null===(t=this._journeyContextItemsDm)||void 0===t||t.postJourneyContextItems(this._journeyId,this._contextId,{name:"token",content:null==e||null===(i=e.detail)||void 0===i?void 0:i.pkcs7,category:"security"})}_handleItemsContextSuccess(){var e,t,i,s;this._routeDm.postRoute({contextId:this._contextId,currentAccessRoute:null===(e=this._interactionContextBody)||void 0===e||null===(t=e.contextInformation)||void 0===t?void 0:t.currentAccessRoute,digitalCustomer:!0,intent:null===(i=this._interactionContextBody)||void 0===i||null===(s=i.contextInformation)||void 0===s?void 0:s.intent,journeyId:this._journeyId})}_handleCreateRoutingSuccess(e){var t,i;if("VOICE"===(null==e||null===(t=e.detail)||void 0===t||null===(i=t.routingOptions[0])||void 0===i?void 0:i.assistanceTouchpoint)){var s,a,r,o,n,l;const t=`${(null==e||null===(s=e.detail)||void 0===s||null===(a=s.routingOptions[0])||void 0===a||null===(r=a.additionalInformation[0])||void 0===r?void 0:r.name)??""},99${(null==e||null===(o=e.detail)||void 0===o||null===(n=o.routingOptions[0])||void 0===n||null===(l=n.additionalInformation[1])||void 0===l?void 0:l.name)??""}`;this._dispatchEvent("open-call-card-rejected",{value:t})}}_errorCallAuthentication(){this._dispatchEvent("phone-number-card-rejected",this._callRejectedLine)}_dispatchEvent(e="",t=null){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}render(){return g`
      <bbva-dataprovider-interaction-context
          .host="${this.host}"
          ?native="${this.native}"
          .requiredToken="${this.requiredToken}"
          @create-journey-success=${this._handleSuccessJourneyCreation}
          @post-context-success=${this._handleCreateContextSuccess}
          @post-context-error=${this._errorCallAuthentication}
          @api-dm-error=${this._errorCallAuthentication}
      ></bbva-dataprovider-interaction-context>

      <bbva-global-single-sign-on-api-dm
        .host="${this.host}"
        .version="${this.singleSignOnApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @single-sign-on-api-dm-create=${this._handleSuccessCreateSSO}
        @single-sign-on-api-dm-create-error=${this._errorCallAuthentication}
        @api-dm-error=${this._errorCallAuthentication}
      ></bbva-global-single-sign-on-api-dm>

    <bbva-global-journey-context-items-api-dm
        .host="${this.host}"
        .version="${this.journeyContextItemsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @journey-context-items-api-dm-create="${this._handleItemsContextSuccess}"
        @journey-context-items-api-dm-create-error="${this._errorCallAuthentication}"
        @api-dm-error=${this._errorCallAuthentication}
    ></bbva-global-journey-context-items-api-dm>

    <bbva-global-route-api-dm
        .host="${this.host}"
        .version="${this.routingApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @route-api-dm-create="${this._handleCreateRoutingSuccess}"
        @route-api-dm-create-error="${this._errorCallAuthentication}"
        @api-dm-error=${this._errorCallAuthentication}
    ></bbva-global-route-api-dm>
    `}}customElements.define(Eo.is,Eo);
