import{aZ as t,J as e,L as i,a7 as s,h as o,dC as a,dD as n,dE as r,a as c,i as l,b as d,an as u,z as h,ak as p,aV as m,a8 as g,a9 as _,aU as v,bb as y,ci as b,bF as f,dI as C,cn as S,aD as E,cT as T,fq as P,fr as R,ai as A,dH as I,cU as O,aN as $,aX as x}from"./952f98a9.js";import{M as k,L as D,V as N,D as w,f as M,G as F,z as q,E as L,H as B,I as V,a3 as H,a4 as j,Q as G,T as U,x as z,N as K,e as Y,K as X,h as W,ap as J,ao as Q,an as Z,R as tt,S as et,a9 as it}from"./216055dc.js";import{a as st}from"./f18a73d9.js";import{B as ot}from"./c281d121.js";import{a2 as at,a3 as nt,a4 as rt,a5 as ct,by as lt,bQ as dt,bP as ut,aI as ht,aH as pt,bg as mt,bf as gt}from"./7f3d7ca9.js";import{B as _t,a as vt,b as yt}from"./d2484b66.js";import{a as bt}from"./4656db6d.js";import{B as ft,a as Ct}from"./a0b89eb0.js";import{B as St,a as Et}from"./4eb8d874.js";import{B as Tt}from"./40b41b3c.js";import{B as Pt,a as Rt}from"./a4e2d801.js";import{b as At,B as It,n as Ot,o as $t}from"./30ef6f1f.js";import{b as xt,B as kt}from"./d335c75d.js";import{b as Dt,c as Nt,B as wt,a as Mt}from"./e3d898b2.js";import{B as Ft,b as qt}from"./972f570a.js";import{H as Lt}from"./e7d77b44.js";import{B as Bt}from"./8fb69d5e.js";import{g as Vt}from"./1979ce36.js";import"./137e0eeb.js";import"./c6217679.js";import"./7b36b381.js";import"./2dde318b.js";import"./010d8aa7.js";import"./ff2cdeea.js";let Ht=class{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(t,e){if(null===this)throw new TypeError('"this" is null or not defined');let i=Object(this),s=i.length>>>0;if(0===s)return!1;let o=0|e,a=Math.max(o>=0?o:s-Math.abs(o),0);for(;a<s;){if((n=i[a])===(r=t)||"number"==typeof n&&"number"==typeof r&&isNaN(n)&&isNaN(r))return!0;a++}var n,r;return!1}}),String.fromCodePoint||function(t){var e=function(e){for(var i=[],s=0,o="",a=0,n=arguments.length;a!==n;++a){var r=+arguments[a];if(!(r<1114111&&r>>>0===r))throw RangeError("Invalid code point: "+r);r<=65535?s=i.push(r):(r-=65536,s=i.push(55296+(r>>10),r%1024+56320)),s>=16383&&(o+=t.apply(null,i),i.length=0)}return o+t.apply(null,i)};try{Object.defineProperty(String,"fromCodePoint",{value:e,configurable:!0,writable:!0})}catch(t){String.fromCodePoint=e}}(String.fromCharCode)}_error(t=0,e="",i=null){throw t=`0000${t=t.toString()}`.substr(t.length),Error(`BGADP_ERROR_${t} :: ${e} :: ${i&&i.message}`)}},jt=class extends Ht{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(t="",e=""){if("string"==typeof t&&t)if(this._reservedKeys.includes(t))this._error(2,`"${t}" should NOT be a reserved key`);else{if("string"!=typeof e)try{e=JSON.stringify(e)}catch(t){this._error(1,`"${e}" couldn't be transformed into String`)}e=e.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[t]=e}else this._error(3,"Missing {item} parameter")}getItem(t=""){return this._items[t]?this._items[t]:null}removeItem(t=""){this._items.hasOwnProperty(t)&&delete this._items[t]}clear(){Object.keys(this._items).length&&(this._items={})}};const Gt=0,Ut=1,zt="jwt",Kt="tsec",Yt="none";let Xt=class extends Ht{constructor(t=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=Gt,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(t),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let t={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(t).forEach((e=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!1,value:t[e],writable:"_headers"!==e})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new jt,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this)}_assignConfigValues(t=null){null!=t&&"object"==typeof t&&Object.keys(t).forEach((e=>{if(this.hasOwnProperty(e)&&"_"!==e.charAt(0)&&"function"!=typeof this[e])if("object"==typeof this[e])Array.isArray(t[e])?this[e]=Array.from(t[e]):null===this[e]?this[e]=t[e]:this[e]=Object.assign(this[e]||{},t[e]);else this[e]=t[e];else"signatureRequiredErrors"===e?this._ERROR_CODES.SIGNATURE_REQUIRED=t[e]:"signatureInvalidErrors"===e?this._ERROR_CODES.SIGNATURE_INVALID=t[e]:"signatureFirstErrorCode"===e?this._ERROR_CODES.SIGNATURE_FIRST_STEP=t[e]:"pendingProcessResponseErrors"===e?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=t[e]:"signatureInvalidStatus"===e?this._STATUS_CODES.SIGNATURE_INVALID=t[e]:"pendingProcessResponseStatus"==e?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=t[e]:"getTokenHandlerKey"===e?this.getTokenHandlerKey=t[e]:("function"==typeof this[e]&&this._error(1,`${e} is a class method, can't be override`),"_"===e.charAt(0)&&this._error(2,`"${e}" is a restricted property, can't be override`),this.hasOwnProperty(e)||this._error(3,`"${e}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=Kt:this.requiredToken=Yt,this.requiresJWT=!1):this.requiredToken===Kt?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===zt?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===Yt?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(Kt)}_setJwtHandler(){this._setTokenHandler(zt)}_setTokenHandler(t){const e=`${t}Handler`;this[e]=this[e]||window.sessionStorage;try{this[e].setItem("test","test"),this[e].removeItem("test")}catch(t){this._error(4,`Invalid [${e}]. If not specified, default window.sessionStorage can't be written/read`,t)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(t=""){t&&"string"==typeof t?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:t,writable:!1}):this._error(6,"[path] is required")}_buildPromise(t=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let e={isPending:!0};e.promise=new window.Promise(((i,s)=>{e=Object.assign(e,{resolve:i,reject:s}),this._buildRequest(t)})),this._promise=Object.assign({},e)}return this._promise.promise}_defaultXHR(t=""){let e=new window.XMLHttpRequest;if(e instanceof window.XMLHttpRequest){e.withCredentials=this.withCredentials,e.timeout=1e3*this.timeout,e.onreadystatechange=this._onReadyStateChange.bind(this),e.responseType=this.responseType,e.open(this.method.toUpperCase(),t);let i=this._getRequestHeaders();Object.keys(i).forEach((t=>{this.forceBoundary&&this.multipart&&"Content-Type"===t||e.setRequestHeader(t,i[t])})),e.send(this._buildBody())}return e}_nativeXHR(t=""){let e=this._buildNativeRequest();return e?(e=e[this.method.toLowerCase()],"function"==typeof e?e=e({url:t,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),e}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=t),e}_buildRequest(t=!1){let e=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const t={url:e,path:this._path,method:this.method};this._emitRequestEvent("start",t)}if(!t&&this._cacheItem&&e===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!t&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:e,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(e);break;case this._NATIVE_XHR:this._request=this._nativeXHR(e)}return this._request}_buildURL(){let t=[this.host,this._path].join("/");if(null!==this.params){let e=Object.assign({},this.params);-1!==t.lastIndexOf("{")&&(t=t.replace(/(\{[\w\-]+\})/g,(t=>{let i=t.replace(/[\{\}]+/g,""),s=e[i];return s?delete e[i]:this._error(9,`Missing ${i} param value`),s})),-1!==t.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let i=Object.keys(e);i.length&&(t=[t,i.map((t=>{let i=e[t];return Array.isArray(i)&&this.paramArrayMode===Ut?this._arrayToQueryParam(t,i):`${t}=${i}`})).join("&")].join("?"))}return t}_arrayToQueryParam(t,e){return e.map((e=>`${t}=${e}`)).join("&")}_getRequestHeaders(){let t=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(t=this._getTokenForRequestHeaders(Kt,t)),!0===this.requiresJWT&&(t=this._getTokenForRequestHeaders(zt,t)),!0===this.semaasMonitoring){let e=this._getSemaasHeaders();Object.assign(t,e)}const e=this._getCustomHeaders();return Object.assign(t,e),t}_getSemaasHeaders(){var t={};if(window.sessionStorage){var e=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(i){var s=e.getItem(i);s&&"null"!==s&&(t[i]=s)}))}return t}_getCustomHeaders(){const t="x-bgadp-";let e={};if(window.sessionStorage){const i=window.sessionStorage;e=Object.keys(i).filter((e=>e.startsWith(t))).reduce(((e,s)=>(e[s.replace(t,"")]=i.getItem(s),e)),{})}return e}_getTokenForRequestHeaders(t,e){const i=`${t}Handler`,s=t===zt?"JWT ":"",o=t===zt?"Authorization":Kt;if(void 0===this[i]||null===this[i])this._error(11,`${t} handler is undefined`);else{const a=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):t;let n=this[i].getItem(a);n?e[o]=e[o]||s+n:this._error(12,`Missing '${t}' value`)}return e}_buildBody(){let t=this.body;if(t&&this._xhrType===this._DEFAULT_XHR){let e=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===e){let e=[];Object.keys(t).forEach((i=>{e.push(`${i}=${t[i]}`)})),t=e.join("&")}else this.headers&&-1!==e.indexOf("multipart/")||(t=JSON.stringify(t))}return t}_onReadyStateChange(){let t=this._request;if(t&&t.readyState===window.XMLHttpRequest.DONE)switch(t.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(t);break;default:this._onRequestFail(t)}}_extractRequestResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)e={result:e};else if(e&&e instanceof ArrayBuffer)try{const t=this._decode(e);try{e=JSON.parse(t)}catch(i){e={result:t,originalResponse:e}}}catch(t){e=null}else if(e&&"string"==typeof e)try{e=JSON.parse(e)}catch(t){e=null}return e}async _extractRequestErrorResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)try{const t=await this._blobDecode(e);try{e=JSON.parse(t)}catch(i){e={result:t,originalResponse:e}}}catch(t){e=null}else e=this._extractRequestResponse(t);return e}_blobDecode(t){const e=new FileReader;let i;const s=new Promise(((t,e)=>{i=(i,s)=>{i?e(i):t(s)}}));return e.addEventListener("loadend",(function t(s){e.removeEventListener("loadend",t),s.error?i(s.error):i(null,e.result)})),e.readAsText(t),s}_decode(t){let e;if("function"==typeof TextDecoder){e=new TextDecoder("utf-8").decode(t)}else{let i=0;for(;i<t.length;){let s=t[i],o=0,a=0;if(s<=127?(o=0,a=255&s):s<=223?(o=1,a=31&s):s<=239?(o=2,a=15&s):s<=244&&(o=3,a=7&s),t.length-i-o>0){let e=0;for(;e<o;)s=t[i+e+1],a=a<<6|63&s,e+=1}else a=65533,o=t.length-i;e+=String.fromCodePoint(a),i+=o+1}}return e}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let t=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(t=window.btoa(t)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,t);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,t);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,t);case this._CACHE_NONE:}}catch(t){this._error(13,`Can't write into cache engine: ${t.message}`,t)}}_retrieveFromCache(){let t;try{switch(this._cache){case this._CACHE_MEMORY:t=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:t=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:t=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(t){this._error(14,"Can't read from cache engine",t)}return t&&(this.encodeCache&&(t=window.atob(t)),"string"==typeof t&&/[\{\[]/.test(t.charAt(0))&&(t=JSON.parse(t))),t}_setLastResponse(t=null){t&&(this._lastResponse=Object.assign({},t))}_setLastResponseHeaders(t=null){let e={};t&&(t instanceof window.XMLHttpRequest?e=this._parseResponseHeadersToObject(t.getAllResponseHeaders()):t.headers&&(e=JSON.parse(t.headers))),this._lastResponseHeaders=e}_parseResponseHeadersToObject(t){let e={},i=t.trim().split(/[\r\n]+/);for(const t in i)if(i.hasOwnProperty(t)&&""!==i[t]){let s=": ",o=i[t].split(s);e[o.shift().toLowerCase()]=o.join(s)}return e}_onRequestSuccess(t=null){this._setLastResponse(this._extractRequestResponse(t)),this._setLastResponseHeaders(t),this.jwtHandler&&this._storeToken(this.jwtHandler,t,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,t,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",t)}_storeToken(t,e,i,s){let o=null;switch(this._xhrType){case this._DEFAULT_XHR:e&&e.getAllResponseHeaders&&e.getResponseHeader&&e.getAllResponseHeaders().indexOf(s)>=0&&(o=e.getResponseHeader(s));break;case this._NATIVE_XHR:e&&e.headers&&(o=JSON.parse(e.headers)[s])}if(o){const e=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):i;t.getItem(e)!==o&&(t.setItem(e,o),this._emitTokenUpdate(i,o))}}_emitTokenUpdate(t,e){if(this.htmlContext){const i=new CustomEvent("token-update",{bubbles:!0,detail:{type:t,token:e}});this.htmlContext.dispatchEvent(i)}}_emitRequestEvent(t,e){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${t}`,{bubbles:!0,composed:!0,detail:{metadata:e}})):console.warn(`Missing htmlContext to dispatch event http-request-${t}`)}_onRequestFail(t=null){(async()=>{if(!this._isSignatureRequired(t)&&!this._isWaitingForProcessResponse(t)){let e=await this._extractRequestErrorResponse(t);this._setLastResponse(e),this._setLastResponseHeaders(t),this._onRequestEnd("reject",t)}})()}_onRequestEnd(t="resolve",e=null){if(this._resetDPState(),this.emitRequestEvents){const t={method:this.method,path:this._path};null!==e&&(t.status=e.status,t.url=e.responseURL),this._emitRequestEvent("end",t)}this._promise&&"function"==typeof this._promise[t]&&(this._promise.isPending=!1,this._promise[t](e))}_resetDPState(){["Data","Type","State"].forEach((t=>{let e=`Authentication${t}`;this._headers&&this._headers.hasOwnProperty(e)&&delete this._headers[e],this.headers&&this.headers.hasOwnProperty(e)&&delete this.headers[e]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(t=null){let e,i,s,o,a;if(t instanceof window.XMLHttpRequest)e=t.getResponseHeader("AuthenticationType"),i=t.getResponseHeader("AuthenticationData"),s=t.getResponseHeader("AuthenticationState"),o=t.getResponseHeader("AuthenticationChallenge"),a=t.getResponseHeader("AuthenticationResponse");else{let n=JSON.parse(t.headers);e=n.authenticationtype,i=n.authenticationdata||null,s=n.authenticationstate,o=n.authenticationchallenge,a=n.authenticationresponse}return{type:e,data:i,state:s,challenge:o,response:a}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureTypeChange(t,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureValueChange(t,...arguments)}})}_onSignatureTypeChange(t="",e="",i=""){if("string"==typeof t&&""!==t)if(e.includes(t)){if("string"==typeof t&&""!==t){const s=this._getSignatureData(t,e,i);this.headers=Object.assign(this.headers||{},{AuthenticationType:t,AuthenticationData:s}),this._buildRequest()}}else this._error(15,`${t} is not a valid signature type`);"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(t=null,e="",i="",s=""){let o;if("object"==typeof t&&t){const a=this._getSignatureData(t.signatureType,e,i);o=this._makeKeyValuePairFromObject(a,t.signatureValue),t.challenge&&(o+=`,challenge=${t.challenge}`),this._buildSignatureHeaders(o,t.signatureType,s)}else"string"==typeof t&&""!==t&&(this._hasSignatureAuthenticationType(e,"2")?(o=`password=${t}`,this._buildSignatureHeaders(o,"2",s)):(o=`${i}=${t}`,this._buildSignatureHeaders(o,e,s)));"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(t="",e=""){if(!t)return"";let i,s=t.split(",");if(s.length>1){i=s.map((t=>`${t}=${e[t]}`)).join(",")}else i=`${t}=${e}`;return i}_hasSignatureAuthenticationType(t,e){return-1!==t.split(";").findIndex((t=>t===e))}_buildSignatureHeaders(t="",e="",i=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:t,AuthenticationType:e||""}),i&&(this.headers=Object.assign(this.headers,{AuthenticationState:i})),this._buildRequest()}_isSignatureRequired(t=null){const e=Number((t||{}).status);let i=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(e)){const e=this._extractRequestResponse(t),s=this._extractResponseErrorCode(e),o=this._ERROR_CODES.SIGNATURE_INVALID.includes(s),{type:a,data:n,state:r,challenge:c,response:l}=this._extractSignatureResponseHeaders(t),d=this._getRequestMetadata(t);if(o)this._notifySignatureInvalid(d),i=!0;else if(a)if(e){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(s)?(this._notifySignatureTypeUsingErrorCode(s,d,a,n,r,c,l),i=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(d,a,n,r,c,l),i=!0}return i}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(t=null){const e=Number((t||{}).status);let i=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(e)){const e=this._extractRequestResponse(t),s=this._extractResponseErrorCode(e),o=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(s),a=this._getRequestMetadata(t);o&&(this._notifyWaitingForProcessResponse(a),i=!0)}return i}_notifySignatureRequiredFirstStep(t,e,i,s){this._defineSignatureType(e,i),this._defineSignatureValue(e,i,s),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:e,data:i,metadata:t}}))}_notifySignatureRequired(t,e,i,s,o,a){this._defineSignatureValue(e,i,s);const n={type:e,data:i,challenge:o,metadata:t};a&&(n.response=a),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:n}))}_notifySignatureInvalid(t){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:t}}))}_notifyWaitingForProcessResponse(t){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:t}}))}_getRequestMetadata(t){const{responseURL:e,status:i}=t;return{path:this._path,method:this.method,url:e,status:i}}_emitEvent(t){this.htmlContext?this.htmlContext.dispatchEvent(t):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(t="",e="",i=""){const s=e.split(";").findIndex((e=>e===t));return i?i.split(";")[s]:""}toString(t=""){return`[object ${t||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(t=!1){return this._buildPromise(t)}_extractResponseErrorCode(t){return t?t["error-code"]||t.messages&&t.messages[0].code:null}_notifySignatureTypeUsingHeaders(t,e,i,s,o,a){s?this._notifySignatureRequired(t,e,i,s,o,a):this._notifySignatureRequiredFirstStep(t,e,i,s)}_notifySignatureTypeUsingErrorCode(t,e,i,s,o,a,n){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(t)?this._notifySignatureRequiredFirstStep(e,i,s,o):this._notifySignatureRequired(e,i,s,o,a,n)}},Wt=class extends Xt{constructor(t=null){super(Object.assign(t||{},{method:"GET"}))}toString(t=""){return super.toString(t||"BGADPRequestGET")}};class Jt extends Wt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`products/v${this.version}/card-products`)}toString(){return super.toString("BGADPCardProductsGetV0")}}class Qt extends Wt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`products/v${this.version}/investment-fund-products/{investment-fund-product-id}/funds`)}toString(){return super.toString("BGADPInvestmentFundProductsInvestmentFundProductFundsGetV0")}}class Zt extends Wt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`products/v${this.version}/investment-fund-products/{investment-fund-product-id}/funds/{fund-id}`)}toString(){return super.toString("BGADPInvestmentFundProductsInvestmentFundProductFundsFundGetV0")}}class te extends Wt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`products/v${this.version}/investment-fund-products/{investment-fund-product-id}/funds/{fund-id}/evolution-profits`)}toString(){return super.toString("BGADPInvestmentFundProductsInvestmentFundProductFundsFundEvolutionProfitsGetV0")}}class ee extends Wt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`products/v${this.version}/products/{product-id}/limits`)}toString(){return super.toString("BGADPProductsProductLimitsGetV0")}}class ie extends(e(i)){}class se extends ie{static get is(){return"bbva-global-product-limits-api-dm"}static get properties(){return{productLimits:{type:Array,attribute:!1}}}constructor(){super(),this.productLimits=[]}resetProductLimits(){this.productLimits=[]}getProductLimits(t,e={}){if(Object.keys(this.productLimits).length)return;e=Object.assign({"product-id":t},e),this._generateGetService(this._getService("get",{},e),{customEvent:"product-limits-api-dm-fetch",errorFireEventHandler:"product-limits-api-dm-fetch-error"},this._responseMapping,e.fields)}_getService(t,e={},i={}){const s=this._getServiceParams(i,e);return this._getServicePath(`${t}ProductLimits`,this._getBgadp(s))}_getBgadp(t){return{getProductLimitsV0:()=>new ee(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}}class oe extends ie{static get is(){return"bbva-global-products-investment-fund-product-fund-base-api-dm"}getInvestmentFundProductFund(t,e,i){i=Object.assign({"investment-fund-product-id":t,"fund-id":e},i),this._generateGetService(this._getService("get",{},i),this.constructor.GET_EVENTS,this._responseMapping,i.fields)}_getService(t,e={},i={}){const s=this._getServiceParams(i,e);return this._getServicePath(`${t}InvestmentFundProductFund`,this._getBgadp(s))}_getBgadp(t){return{getInvestmentFundProductFundV0:()=>new Zt(t),default:()=>"BGADP does not exist."}}_responseMapping(t){return t}}s(oe,"GET_EVENTS",{customEvent:"investment-fund-product-fund-api-dm-fetch",errorFireEventHandler:"investment-fund-product-fund-api-dm-fetch-error"}),customElements.define(oe.is,oe);class ae extends ie{static get is(){return"bbva-global-products-investment-fund-product-fund-evolution-profits-base-api-dm"}getInvestmentFundProductFundEvolutionProfits(t,e,i){i=Object.assign({"investment-fund-product-id":t,"fund-id":e},i),this._generateGetService(this._getService("get",{},i),this.constructor.GET_EVENTS,this._responseMapping,i.fields)}_getService(t,e={},i={}){const s=this._getServiceParams(i,e);return this._getServicePath(`${t}InvestmentFundProductFundEvolutionProfits`,this._getBgadp(s))}_getBgadp(t){return{getInvestmentFundProductFundEvolutionProfitsV0:()=>new te(t),default:()=>"BGADP does not exist."}}_responseMapping(t){return t}}s(ae,"GET_EVENTS",{customEvent:"investment-fund-product-fund-evolution-profits-api-dm-fetch",errorFireEventHandler:"investment-fund-product-fund-evolution-profits-api-dm-fetch-error"}),customElements.define(ae.is,ae);class ne extends ie{static get is(){return"bbva-global-products-card-products-base-api-dm"}getCardProducts(t){this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(t,e={},i={}){const s=this._getServiceParams(i,e);return this._getServicePath(`${t}CardProducts`,this._getBgadp(s))}_getBgadp(t){return{getCardProductsV0:()=>new Jt(t),default:()=>"BGADP does not exist."}}_responseMapping(t){return t}}s(ne,"GET_EVENTS",{customEvent:"card-products-api-dm-fetch",errorFireEventHandler:"card-products-api-dm-fetch-error"}),customElements.define(ne.is,ne);let re=class{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(t,e){if(null===this)throw new TypeError('"this" is null or not defined');let i=Object(this),s=i.length>>>0;if(0===s)return!1;let o=0|e,a=Math.max(o>=0?o:s-Math.abs(o),0);for(;a<s;){if((n=i[a])===(r=t)||"number"==typeof n&&"number"==typeof r&&isNaN(n)&&isNaN(r))return!0;a++}var n,r;return!1}}),String.fromCodePoint||function(t){var e=function(e){for(var i=[],s=0,o="",a=0,n=arguments.length;a!==n;++a){var r=+arguments[a];if(!(r<1114111&&r>>>0===r))throw RangeError("Invalid code point: "+r);r<=65535?s=i.push(r):(r-=65536,s=i.push(55296+(r>>10),r%1024+56320)),s>=16383&&(o+=t.apply(null,i),i.length=0)}return o+t.apply(null,i)};try{Object.defineProperty(String,"fromCodePoint",{value:e,configurable:!0,writable:!0})}catch(t){String.fromCodePoint=e}}(String.fromCharCode)}_error(t=0,e="",i=null){throw t=`0000${t=t.toString()}`.substr(t.length),Error(`BGADP_ERROR_${t} :: ${e} :: ${i&&i.message}`)}},ce=class extends re{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(t="",e=""){if("string"==typeof t&&t)if(this._reservedKeys.includes(t))this._error(2,`"${t}" should NOT be a reserved key`);else{if("string"!=typeof e)try{e=JSON.stringify(e)}catch(t){this._error(1,`"${e}" couldn't be transformed into String`)}e=e.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[t]=e}else this._error(3,"Missing {item} parameter")}getItem(t=""){return this._items[t]?this._items[t]:null}removeItem(t=""){this._items.hasOwnProperty(t)&&delete this._items[t]}clear(){Object.keys(this._items).length&&(this._items={})}};const le=0,de=1,ue="jwt",he="tsec",pe="none";let me=class extends re{constructor(t=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=le,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(t),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let t={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(t).forEach((e=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!1,value:t[e],writable:"_headers"!==e})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new ce,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this)}_assignConfigValues(t=null){null!=t&&"object"==typeof t&&Object.keys(t).forEach((e=>{if(this.hasOwnProperty(e)&&"_"!==e.charAt(0)&&"function"!=typeof this[e])if("object"==typeof this[e])Array.isArray(t[e])?this[e]=Array.from(t[e]):null===this[e]?this[e]=t[e]:this[e]=Object.assign(this[e]||{},t[e]);else this[e]=t[e];else"signatureRequiredErrors"===e?this._ERROR_CODES.SIGNATURE_REQUIRED=t[e]:"signatureInvalidErrors"===e?this._ERROR_CODES.SIGNATURE_INVALID=t[e]:"signatureFirstErrorCode"===e?this._ERROR_CODES.SIGNATURE_FIRST_STEP=t[e]:"pendingProcessResponseErrors"===e?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=t[e]:"signatureInvalidStatus"===e?this._STATUS_CODES.SIGNATURE_INVALID=t[e]:"pendingProcessResponseStatus"==e?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=t[e]:"getTokenHandlerKey"===e?this.getTokenHandlerKey=t[e]:("function"==typeof this[e]&&this._error(1,`${e} is a class method, can't be override`),"_"===e.charAt(0)&&this._error(2,`"${e}" is a restricted property, can't be override`),this.hasOwnProperty(e)||this._error(3,`"${e}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=he:this.requiredToken=pe,this.requiresJWT=!1):this.requiredToken===he?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===ue?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===pe?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(he)}_setJwtHandler(){this._setTokenHandler(ue)}_setTokenHandler(t){const e=`${t}Handler`;this[e]=this[e]||window.sessionStorage;try{this[e].setItem("test","test"),this[e].removeItem("test")}catch(t){this._error(4,`Invalid [${e}]. If not specified, default window.sessionStorage can't be written/read`,t)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(t=""){t&&"string"==typeof t?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:t,writable:!1}):this._error(6,"[path] is required")}_buildPromise(t=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let e={isPending:!0};e.promise=new window.Promise(((i,s)=>{e=Object.assign(e,{resolve:i,reject:s}),this._buildRequest(t)})),this._promise=Object.assign({},e)}return this._promise.promise}_defaultXHR(t=""){let e=new window.XMLHttpRequest;if(e instanceof window.XMLHttpRequest){e.withCredentials=this.withCredentials,e.timeout=1e3*this.timeout,e.onreadystatechange=this._onReadyStateChange.bind(this),e.responseType=this.responseType,e.open(this.method.toUpperCase(),t);let i=this._getRequestHeaders();Object.keys(i).forEach((t=>{this.forceBoundary&&this.multipart&&"Content-Type"===t||e.setRequestHeader(t,i[t])})),e.send(this._buildBody())}return e}_nativeXHR(t=""){let e=this._buildNativeRequest();return e?(e=e[this.method.toLowerCase()],"function"==typeof e?e=e({url:t,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),e}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=t),e}_buildRequest(t=!1){let e=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const t={url:e,path:this._path,method:this.method};this._emitRequestEvent("start",t)}if(!t&&this._cacheItem&&e===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!t&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:e,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(e);break;case this._NATIVE_XHR:this._request=this._nativeXHR(e)}return this._request}_buildURL(){let t=[this.host,this._path].join("/");if(null!==this.params){let e=Object.assign({},this.params);-1!==t.lastIndexOf("{")&&(t=t.replace(/(\{[\w\-]+\})/g,(t=>{let i=t.replace(/[\{\}]+/g,""),s=e[i];return s?delete e[i]:this._error(9,`Missing ${i} param value`),s})),-1!==t.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let i=Object.keys(e);i.length&&(t=[t,i.map((t=>{let i=e[t];return Array.isArray(i)&&this.paramArrayMode===de?this._arrayToQueryParam(t,i):`${t}=${i}`})).join("&")].join("?"))}return t}_arrayToQueryParam(t,e){return e.map((e=>`${t}=${e}`)).join("&")}_getRequestHeaders(){let t=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(t=this._getTokenForRequestHeaders(he,t)),!0===this.requiresJWT&&(t=this._getTokenForRequestHeaders(ue,t)),!0===this.semaasMonitoring){let e=this._getSemaasHeaders();Object.assign(t,e)}const e=this._getCustomHeaders();return Object.assign(t,e),t}_getSemaasHeaders(){var t={};if(window.sessionStorage){var e=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(i){var s=e.getItem(i);s&&"null"!==s&&(t[i]=s)}))}return t}_getCustomHeaders(){const t="x-bgadp-";let e={};if(window.sessionStorage){const i=window.sessionStorage;e=Object.keys(i).filter((e=>e.startsWith(t))).reduce(((e,s)=>(e[s.replace(t,"")]=i.getItem(s),e)),{})}return e}_getTokenForRequestHeaders(t,e){const i=`${t}Handler`,s=t===ue?"JWT ":"",o=t===ue?"Authorization":he;if(void 0===this[i]||null===this[i])this._error(11,`${t} handler is undefined`);else{const a=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):t;let n=this[i].getItem(a);n?e[o]=e[o]||s+n:this._error(12,`Missing '${t}' value`)}return e}_buildBody(){let t=this.body;if(t&&this._xhrType===this._DEFAULT_XHR){let e=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===e){let e=[];Object.keys(t).forEach((i=>{e.push(`${i}=${t[i]}`)})),t=e.join("&")}else this.headers&&-1!==e.indexOf("multipart/")||(t=JSON.stringify(t))}return t}_onReadyStateChange(){let t=this._request;if(t&&t.readyState===window.XMLHttpRequest.DONE)switch(t.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(t);break;default:this._onRequestFail(t)}}_extractRequestResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)e={result:e};else if(e&&e instanceof ArrayBuffer)try{const t=this._decode(e);try{e=JSON.parse(t)}catch(i){e={result:t,originalResponse:e}}}catch(t){e=null}else if(e&&"string"==typeof e)try{e=JSON.parse(e)}catch(t){e=null}return e}async _extractRequestErrorResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)try{const t=await this._blobDecode(e);try{e=JSON.parse(t)}catch(i){e={result:t,originalResponse:e}}}catch(t){e=null}else e=this._extractRequestResponse(t);return e}_blobDecode(t){const e=new FileReader;let i;const s=new Promise(((t,e)=>{i=(i,s)=>{i?e(i):t(s)}}));return e.addEventListener("loadend",(function t(s){e.removeEventListener("loadend",t),s.error?i(s.error):i(null,e.result)})),e.readAsText(t),s}_decode(t){let e;if("function"==typeof TextDecoder){e=new TextDecoder("utf-8").decode(t)}else{let i=0;for(;i<t.length;){let s=t[i],o=0,a=0;if(s<=127?(o=0,a=255&s):s<=223?(o=1,a=31&s):s<=239?(o=2,a=15&s):s<=244&&(o=3,a=7&s),t.length-i-o>0){let e=0;for(;e<o;)s=t[i+e+1],a=a<<6|63&s,e+=1}else a=65533,o=t.length-i;e+=String.fromCodePoint(a),i+=o+1}}return e}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let t=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(t=window.btoa(t)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,t);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,t);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,t);case this._CACHE_NONE:}}catch(t){this._error(13,`Can't write into cache engine: ${t.message}`,t)}}_retrieveFromCache(){let t;try{switch(this._cache){case this._CACHE_MEMORY:t=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:t=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:t=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(t){this._error(14,"Can't read from cache engine",t)}return t&&(this.encodeCache&&(t=window.atob(t)),"string"==typeof t&&/[\{\[]/.test(t.charAt(0))&&(t=JSON.parse(t))),t}_setLastResponse(t=null){t&&(this._lastResponse=Object.assign({},t))}_setLastResponseHeaders(t=null){let e={};t&&(t instanceof window.XMLHttpRequest?e=this._parseResponseHeadersToObject(t.getAllResponseHeaders()):t.headers&&(e=JSON.parse(t.headers))),this._lastResponseHeaders=e}_parseResponseHeadersToObject(t){let e={},i=t.trim().split(/[\r\n]+/);for(const t in i)if(i.hasOwnProperty(t)&&""!==i[t]){let s=": ",o=i[t].split(s);e[o.shift().toLowerCase()]=o.join(s)}return e}_onRequestSuccess(t=null){this._setLastResponse(this._extractRequestResponse(t)),this._setLastResponseHeaders(t),this.jwtHandler&&this._storeToken(this.jwtHandler,t,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,t,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",t)}_storeToken(t,e,i,s){let o=null;switch(this._xhrType){case this._DEFAULT_XHR:e&&e.getAllResponseHeaders&&e.getResponseHeader&&e.getAllResponseHeaders().indexOf(s)>=0&&(o=e.getResponseHeader(s));break;case this._NATIVE_XHR:e&&e.headers&&(o=JSON.parse(e.headers)[s])}if(o){const e=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):i;t.getItem(e)!==o&&(t.setItem(e,o),this._emitTokenUpdate(i,o))}}_emitTokenUpdate(t,e){if(this.htmlContext){const i=new CustomEvent("token-update",{bubbles:!0,detail:{type:t,token:e}});this.htmlContext.dispatchEvent(i)}}_emitRequestEvent(t,e){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${t}`,{bubbles:!0,composed:!0,detail:{metadata:e}})):console.warn(`Missing htmlContext to dispatch event http-request-${t}`)}_onRequestFail(t=null){(async()=>{if(!this._isSignatureRequired(t)&&!this._isWaitingForProcessResponse(t)){let e=await this._extractRequestErrorResponse(t);this._setLastResponse(e),this._setLastResponseHeaders(t),this._onRequestEnd("reject",t)}})()}_onRequestEnd(t="resolve",e=null){if(this._resetDPState(),this.emitRequestEvents){const t={method:this.method,path:this._path};null!==e&&(t.status=e.status,t.url=e.responseURL),this._emitRequestEvent("end",t)}this._promise&&"function"==typeof this._promise[t]&&(this._promise.isPending=!1,this._promise[t](e))}_resetDPState(){["Data","Type","State"].forEach((t=>{let e=`Authentication${t}`;this._headers&&this._headers.hasOwnProperty(e)&&delete this._headers[e],this.headers&&this.headers.hasOwnProperty(e)&&delete this.headers[e]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(t=null){let e,i,s,o,a;if(t instanceof window.XMLHttpRequest)e=t.getResponseHeader("AuthenticationType"),i=t.getResponseHeader("AuthenticationData"),s=t.getResponseHeader("AuthenticationState"),o=t.getResponseHeader("AuthenticationChallenge"),a=t.getResponseHeader("AuthenticationResponse");else{let n=JSON.parse(t.headers);e=n.authenticationtype,i=n.authenticationdata||null,s=n.authenticationstate,o=n.authenticationchallenge,a=n.authenticationresponse}return{type:e,data:i,state:s,challenge:o,response:a}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureTypeChange(t,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureValueChange(t,...arguments)}})}_onSignatureTypeChange(t="",e="",i=""){if("string"==typeof t&&""!==t)if(e.includes(t)){if("string"==typeof t&&""!==t){const s=this._getSignatureData(t,e,i);this.headers=Object.assign(this.headers||{},{AuthenticationType:t,AuthenticationData:s}),this._buildRequest()}}else this._error(15,`${t} is not a valid signature type`);"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(t=null,e="",i="",s=""){let o;if("object"==typeof t&&t){const a=this._getSignatureData(t.signatureType,e,i);o=this._makeKeyValuePairFromObject(a,t.signatureValue),t.challenge&&(o+=`,challenge=${t.challenge}`),this._buildSignatureHeaders(o,t.signatureType,s)}else"string"==typeof t&&""!==t&&(this._hasSignatureAuthenticationType(e,"2")?(o=`password=${t}`,this._buildSignatureHeaders(o,"2",s)):(o=`${i}=${t}`,this._buildSignatureHeaders(o,e,s)));"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(t="",e=""){if(!t)return"";let i,s=t.split(",");if(s.length>1){i=s.map((t=>`${t}=${e[t]}`)).join(",")}else i=`${t}=${e}`;return i}_hasSignatureAuthenticationType(t,e){return-1!==t.split(";").findIndex((t=>t===e))}_buildSignatureHeaders(t="",e="",i=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:t,AuthenticationType:e||""}),i&&(this.headers=Object.assign(this.headers,{AuthenticationState:i})),this._buildRequest()}_isSignatureRequired(t=null){const e=Number((t||{}).status);let i=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(e)){const e=this._extractRequestResponse(t),s=this._extractResponseErrorCode(e),o=this._ERROR_CODES.SIGNATURE_INVALID.includes(s),{type:a,data:n,state:r,challenge:c,response:l}=this._extractSignatureResponseHeaders(t),d=this._getRequestMetadata(t);if(o)this._notifySignatureInvalid(d),i=!0;else if(a)if(e){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(s)?(this._notifySignatureTypeUsingErrorCode(s,d,a,n,r,c,l),i=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(d,a,n,r,c,l),i=!0}return i}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(t=null){const e=Number((t||{}).status);let i=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(e)){const e=this._extractRequestResponse(t),s=this._extractResponseErrorCode(e),o=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(s),a=this._getRequestMetadata(t);o&&(this._notifyWaitingForProcessResponse(a),i=!0)}return i}_notifySignatureRequiredFirstStep(t,e,i,s){this._defineSignatureType(e,i),this._defineSignatureValue(e,i,s),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:e,data:i,metadata:t}}))}_notifySignatureRequired(t,e,i,s,o,a){this._defineSignatureValue(e,i,s);const n={type:e,data:i,challenge:o,metadata:t};a&&(n.response=a),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:n}))}_notifySignatureInvalid(t){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:t}}))}_notifyWaitingForProcessResponse(t){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:t}}))}_getRequestMetadata(t){const{responseURL:e,status:i}=t;return{path:this._path,method:this.method,url:e,status:i}}_emitEvent(t){this.htmlContext?this.htmlContext.dispatchEvent(t):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(t="",e="",i=""){const s=e.split(";").findIndex((e=>e===t));return i?i.split(";")[s]:""}toString(t=""){return`[object ${t||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(t=!1){return this._buildPromise(t)}_extractResponseErrorCode(t){return t?t["error-code"]||t.messages&&t.messages[0].code:null}_notifySignatureTypeUsingHeaders(t,e,i,s,o,a){s?this._notifySignatureRequired(t,e,i,s,o,a):this._notifySignatureRequiredFirstStep(t,e,i,s)}_notifySignatureTypeUsingErrorCode(t,e,i,s,o,a,n){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(t)?this._notifySignatureRequiredFirstStep(e,i,s,o):this._notifySignatureRequired(e,i,s,o,a,n)}},ge=class extends me{constructor(t=null){super(Object.assign(t||{},{method:"GET"}))}toString(t=""){return super.toString(t||"BGADPRequestGET")}},_e=class extends me{constructor(t=null){super(Object.assign(t||{},{method:"POST"}))}toString(t=""){return super.toString(t||"BGADPRequestPOST")}};class ve extends ge{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`products/v${this.version}/investment-fund-products/{investment-fund-product-id}/funds`)}toString(){return super.toString("BGADPInvestmentFundProductsInvestmentFundProductFundsGetV1")}}class ye extends _e{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`products/v${this.version}/products/activations`)}toString(){return super.toString("BGADPProductsActivationsPostV1")}}class be extends _e{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`products/v${this.version}/products/activations/{activation-id}/processes`)}toString(){return super.toString("BGADPProductsActivationsActivationProcessesPostV1")}}class fe extends _e{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`products/v${this.version}/products/products-checkout`)}toString(){return super.toString("BGADPProductsProductsCheckoutPostV1")}}class Ce extends ge{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`products/v${this.version}/products/validate-active-products`)}toString(){return super.toString("BGADPProductsValidateActiveProductsGetV1")}}class Se extends _e{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`products/v${this.version}/products/validations`)}toString(){return super.toString("BGADPProductsValidationsPostV1")}}class Ee extends ge{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`products/v${this.version}/products/validations/{validation-id}`)}toString(){return super.toString("BGADPProductsValidationsValidationGetV1")}}class Te extends ie{static get is(){return"bbva-global-products-investment-fund-product-funds-base-api-dm"}getInvestmentFundProductFunds(t,e){e=Object.assign({"investment-fund-product-id":t},e),this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields)}_getService(t,e={},i={}){const s=this._getServiceParams(i,e);return this._getServicePath(`${t}InvestmentFundProductFunds`,this._getBgadp(s))}_getBgadp(t){return{getInvestmentFundProductFundsV0:()=>new Qt(t),getInvestmentFundProductFundsV1:()=>new ve(t),default:()=>"BGADP does not exist."}}_responseMapping(t){return"0"==this.version&&t.length&&t.map((t=>{t.netAssetValueDate&&(t.netAssetValue.netAssetValueDate=t.netAssetValueDate),this._removeFields(["netAssetValueDate","conditions","isSchedulable"],t)})),t}}s(Te,"GET_EVENTS",{customEvent:"investment-fund-product-funds-api-dm-fetch",errorFireEventHandler:"investment-fund-product-funds-api-dm-fetch-error"}),customElements.define(Te.is,Te);class Pe extends ie{static get is(){return"bbva-global-products-products-validate-active-products-base-api-dm"}getProductsValidateActiveProducts(t){this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(t,e={},i={}){const s=this._getServiceParams(i,e);return this._getServicePath(`${t}ProductsValidateActiveProducts`,this._getBgadp(s))}_getBgadp(t){return{getProductsValidateActiveProductsV1:()=>new Ce(t),default:()=>"BGADP does not exist."}}_responseMapping(t){return t}}s(Pe,"GET_EVENTS",{customEvent:"products-validate-active-products-api-dm-fetch",errorFireEventHandler:"products-validate-active-products-api-dm-fetch-error"}),customElements.define(Pe.is,Pe);class Re extends ie{static get is(){return"bbva-global-products-products-activations-base-api-dm"}postProductsActivations(t){this._generateGetService(this._getService("post",t),this.constructor.POST_EVENTS,this._responseMapping)}_getService(t,e={},i={}){const s=this._getServiceParams(i,e);return this._getServicePath(`${t}ProductsActivations`,this._getBgadp(s))}_getBgadp(t){return{postProductsActivationsV1:()=>new ye(t),default:()=>"BGADP does not exist."}}}s(Re,"POST_EVENTS",{customEvent:"products-activations-api-dm-create",errorFireEventHandler:"products-activations-api-dm-create-error"}),customElements.define(Re.is,Re);class Ae extends ie{static get is(){return"bbva-global-products-products-validations-base-api-dm"}postProductsValidations(t){this._generateGetService(this._getService("post",t),this.constructor.POST_EVENTS,this._responseMapping)}_getService(t,e={},i={}){const s=this._getServiceParams(i,e);return this._getServicePath(`${t}ProductsValidations`,this._getBgadp(s))}_getBgadp(t){return{postProductsValidationsV1:()=>new Se(t),default:()=>"BGADP does not exist."}}_responseMapping(t){return t}}s(Ae,"POST_EVENTS",{customEvent:"products-validations-api-dm-create",errorFireEventHandler:"products-validations-api-dm-create-error"}),customElements.define(Ae.is,Ae);class Ie extends ie{static get is(){return"bbva-global-products-products-validation-base-api-dm"}getProductsValidation(t,e){e=Object.assign({"validation-id":t},e),this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields)}_getService(t,e={},i={}){const s=this._getServiceParams(i,e);return this._getServicePath(`${t}ProductsValidation`,this._getBgadp(s))}_getBgadp(t){return{getProductsValidationV1:()=>new Ee(t),default:()=>"BGADP does not exist."}}_responseMapping(t){return t}}s(Ie,"GET_EVENTS",{customEvent:"products-validation-api-dm-fetch",errorFireEventHandler:"products-validation-api-dm-fetch-error"}),customElements.define(Ie.is,Ie);class Oe extends ie{static get is(){return"bbva-global-products-products-activation-processes-base-api-dm"}postProductsActivationProcesses(t,e){const i={"activation-id":t};this._generateGetService(this._getService("post",e,i),this.constructor.POST_EVENTS,this._responseMapping)}_getService(t,e={},i={}){const s=this._getServiceParams(i,e);return this._getServicePath(`${t}ProductsActivationProcesses`,this._getBgadp(s))}_getBgadp(t){return{postProductsActivationProcessesV1:()=>new be(t),default:()=>"BGADP does not exist."}}}s(Oe,"POST_EVENTS",{customEvent:"products-activation-processes-api-dm-create",errorFireEventHandler:"products-activation-processes-api-dm-create-error"}),customElements.define(Oe.is,Oe);class $e extends ie{static get is(){return"bbva-global-products-products-products-checkout-base-api-dm"}postProductsProductsCheckout(t){this._generateGetService(this._getService("post",t),this.constructor.POST_EVENTS,this._responseMapping)}_getService(t,e={},i={}){const s=this._getServiceParams(i,e);return this._getServicePath(`${t}ProductsProductsCheckout`,this._getBgadp(s))}_getBgadp(t){return{postProductsProductsCheckoutV1:()=>new fe(t),default:()=>"BGADP does not exist."}}_responseMapping(t){return t}}s($e,"POST_EVENTS",{customEvent:"products-products-checkout-api-dm-create",errorFireEventHandler:"products-products-checkout-api-dm-create-error"}),customElements.define($e.is,$e);class xe{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(t,e){if(null===this)throw new TypeError('"this" is null or not defined');let i=Object(this),s=i.length>>>0;if(0===s)return!1;let o=0|e,a=Math.max(o>=0?o:s-Math.abs(o),0);for(;a<s;){if((n=i[a])===(r=t)||"number"==typeof n&&"number"==typeof r&&isNaN(n)&&isNaN(r))return!0;a++}var n,r;return!1}}),String.fromCodePoint||function(t){var e=function(e){for(var i=[],s=0,o="",a=0,n=arguments.length;a!==n;++a){var r=+arguments[a];if(!(r<1114111&&r>>>0===r))throw RangeError("Invalid code point: "+r);r<=65535?s=i.push(r):(r-=65536,s=i.push(55296+(r>>10),r%1024+56320)),s>=16383&&(o+=t.apply(null,i),i.length=0)}return o+t.apply(null,i)};try{Object.defineProperty(String,"fromCodePoint",{value:e,configurable:!0,writable:!0})}catch(t){String.fromCodePoint=e}}(String.fromCharCode)}_error(t=0,e="",i=null){throw t=`0000${t=t.toString()}`.substr(t.length),Error(`BGADP_ERROR_${t} :: ${e} :: ${i&&i.message}`)}}class ke extends xe{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(t="",e=""){if("string"==typeof t&&t)if(this._reservedKeys.includes(t))this._error(2,`"${t}" should NOT be a reserved key`);else{if("string"!=typeof e)try{e=JSON.stringify(e)}catch(t){this._error(1,`"${e}" couldn't be transformed into String`)}e=e.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[t]=e}else this._error(3,"Missing {item} parameter")}getItem(t=""){return this._items[t]?this._items[t]:null}removeItem(t=""){this._items.hasOwnProperty(t)&&delete this._items[t]}clear(){Object.keys(this._items).length&&(this._items={})}}const De=0,Ne=1,we="jwt",Me="tsec",Fe="none";class qe extends xe{constructor(t=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=De,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(t),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let t={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(t).forEach((e=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!1,value:t[e],writable:"_headers"!==e})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new ke,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this)}_assignConfigValues(t=null){null!=t&&"object"==typeof t&&Object.keys(t).forEach((e=>{if(this.hasOwnProperty(e)&&"_"!==e.charAt(0)&&"function"!=typeof this[e])if("object"==typeof this[e])Array.isArray(t[e])?this[e]=Array.from(t[e]):null===this[e]?this[e]=t[e]:this[e]=Object.assign(this[e]||{},t[e]);else this[e]=t[e];else"signatureRequiredErrors"===e?this._ERROR_CODES.SIGNATURE_REQUIRED=t[e]:"signatureInvalidErrors"===e?this._ERROR_CODES.SIGNATURE_INVALID=t[e]:"signatureFirstErrorCode"===e?this._ERROR_CODES.SIGNATURE_FIRST_STEP=t[e]:"pendingProcessResponseErrors"===e?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=t[e]:"signatureInvalidStatus"===e?this._STATUS_CODES.SIGNATURE_INVALID=t[e]:"pendingProcessResponseStatus"==e?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=t[e]:"getTokenHandlerKey"===e?this.getTokenHandlerKey=t[e]:("function"==typeof this[e]&&this._error(1,`${e} is a class method, can't be override`),"_"===e.charAt(0)&&this._error(2,`"${e}" is a restricted property, can't be override`),this.hasOwnProperty(e)||this._error(3,`"${e}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=Me:this.requiredToken=Fe,this.requiresJWT=!1):this.requiredToken===Me?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===we?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===Fe?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(Me)}_setJwtHandler(){this._setTokenHandler(we)}_setTokenHandler(t){const e=`${t}Handler`;this[e]=this[e]||window.sessionStorage;try{this[e].setItem("test","test"),this[e].removeItem("test")}catch(t){this._error(4,`Invalid [${e}]. If not specified, default window.sessionStorage can't be written/read`,t)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(t=""){t&&"string"==typeof t?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:t,writable:!1}):this._error(6,"[path] is required")}_buildPromise(t=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let e={isPending:!0};e.promise=new window.Promise(((i,s)=>{e=Object.assign(e,{resolve:i,reject:s}),this._buildRequest(t)})),this._promise=Object.assign({},e)}return this._promise.promise}_defaultXHR(t=""){let e=new window.XMLHttpRequest;if(e instanceof window.XMLHttpRequest){e.withCredentials=this.withCredentials,e.timeout=1e3*this.timeout,e.onreadystatechange=this._onReadyStateChange.bind(this),e.responseType=this.responseType,e.open(this.method.toUpperCase(),t);let i=this._getRequestHeaders();Object.keys(i).forEach((t=>{this.forceBoundary&&this.multipart&&"Content-Type"===t||e.setRequestHeader(t,i[t])})),e.send(this._buildBody())}return e}_nativeXHR(t=""){let e=this._buildNativeRequest();return e?(e=e[this.method.toLowerCase()],"function"==typeof e?e=e({url:t,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),e}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=t),e}_buildRequest(t=!1){let e=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const t={url:e,path:this._path,method:this.method};this._emitRequestEvent("start",t)}if(!t&&this._cacheItem&&e===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!t&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:e,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(e);break;case this._NATIVE_XHR:this._request=this._nativeXHR(e)}return this._request}_buildURL(){let t=[this.host,this._path].join("/");if(null!==this.params){let e=Object.assign({},this.params);-1!==t.lastIndexOf("{")&&(t=t.replace(/(\{[\w\-]+\})/g,(t=>{let i=t.replace(/[\{\}]+/g,""),s=e[i];return s?delete e[i]:this._error(9,`Missing ${i} param value`),s})),-1!==t.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let i=Object.keys(e);i.length&&(t=[t,i.map((t=>{let i=e[t];return Array.isArray(i)&&this.paramArrayMode===Ne?this._arrayToQueryParam(t,i):`${t}=${i}`})).join("&")].join("?"))}return t}_arrayToQueryParam(t,e){return e.map((e=>`${t}=${e}`)).join("&")}_getRequestHeaders(){let t=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(t=this._getTokenForRequestHeaders(Me,t)),!0===this.requiresJWT&&(t=this._getTokenForRequestHeaders(we,t)),!0===this.semaasMonitoring){let e=this._getSemaasHeaders();Object.assign(t,e)}const e=this._getCustomHeaders();return Object.assign(t,e),t}_getSemaasHeaders(){var t={};if(window.sessionStorage){var e=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(i){var s=e.getItem(i);s&&"null"!==s&&(t[i]=s)}))}return t}_getCustomHeaders(){const t="x-bgadp-";let e={};if(window.sessionStorage){const i=window.sessionStorage;e=Object.keys(i).filter((e=>e.startsWith(t))).reduce(((e,s)=>(e[s.replace(t,"")]=i.getItem(s),e)),{})}return e}_getTokenForRequestHeaders(t,e){const i=`${t}Handler`,s=t===we?"JWT ":"",o=t===we?"Authorization":Me;if(void 0===this[i]||null===this[i])this._error(11,`${t} handler is undefined`);else{const a=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):t;let n=this[i].getItem(a);n?e[o]=e[o]||s+n:this._error(12,`Missing '${t}' value`)}return e}_buildBody(){let t=this.body;if(t&&this._xhrType===this._DEFAULT_XHR){let e=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===e){let e=[];Object.keys(t).forEach((i=>{e.push(`${i}=${t[i]}`)})),t=e.join("&")}else this.headers&&-1!==e.indexOf("multipart/")||(t=JSON.stringify(t))}return t}_onReadyStateChange(){let t=this._request;if(t&&t.readyState===window.XMLHttpRequest.DONE)switch(t.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(t);break;default:this._onRequestFail(t)}}_extractRequestResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)e={result:e};else if(e&&e instanceof ArrayBuffer)try{const t=this._decode(e);try{e=JSON.parse(t)}catch(i){e={result:t,originalResponse:e}}}catch(t){e=null}else if(e&&"string"==typeof e)try{e=JSON.parse(e)}catch(t){e=null}return e}async _extractRequestErrorResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)try{const t=await this._blobDecode(e);try{e=JSON.parse(t)}catch(i){e={result:t,originalResponse:e}}}catch(t){e=null}else e=this._extractRequestResponse(t);return e}_blobDecode(t){const e=new FileReader;let i;const s=new Promise(((t,e)=>{i=(i,s)=>{i?e(i):t(s)}}));return e.addEventListener("loadend",(function t(s){e.removeEventListener("loadend",t),s.error?i(s.error):i(null,e.result)})),e.readAsText(t),s}_decode(t){let e;if("function"==typeof TextDecoder){e=new TextDecoder("utf-8").decode(t)}else{let i=0;for(;i<t.length;){let s=t[i],o=0,a=0;if(s<=127?(o=0,a=255&s):s<=223?(o=1,a=31&s):s<=239?(o=2,a=15&s):s<=244&&(o=3,a=7&s),t.length-i-o>0){let e=0;for(;e<o;)s=t[i+e+1],a=a<<6|63&s,e+=1}else a=65533,o=t.length-i;e+=String.fromCodePoint(a),i+=o+1}}return e}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let t=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(t=window.btoa(t)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,t);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,t);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,t);case this._CACHE_NONE:}}catch(t){this._error(13,`Can't write into cache engine: ${t.message}`,t)}}_retrieveFromCache(){let t;try{switch(this._cache){case this._CACHE_MEMORY:t=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:t=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:t=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(t){this._error(14,"Can't read from cache engine",t)}return t&&(this.encodeCache&&(t=window.atob(t)),"string"==typeof t&&/[\{\[]/.test(t.charAt(0))&&(t=JSON.parse(t))),t}_setLastResponse(t=null){t&&(this._lastResponse=Object.assign({},t))}_setLastResponseHeaders(t=null){let e={};t&&(t instanceof window.XMLHttpRequest?e=this._parseResponseHeadersToObject(t.getAllResponseHeaders()):t.headers&&(e=JSON.parse(t.headers))),this._lastResponseHeaders=e}_parseResponseHeadersToObject(t){let e={},i=t.trim().split(/[\r\n]+/);for(const t in i)if(i.hasOwnProperty(t)&&""!==i[t]){let s=": ",o=i[t].split(s);e[o.shift().toLowerCase()]=o.join(s)}return e}_onRequestSuccess(t=null){this._setLastResponse(this._extractRequestResponse(t)),this._setLastResponseHeaders(t),this.jwtHandler&&this._storeToken(this.jwtHandler,t,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,t,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",t)}_storeToken(t,e,i,s){let o=null;switch(this._xhrType){case this._DEFAULT_XHR:e&&e.getAllResponseHeaders&&e.getResponseHeader&&e.getAllResponseHeaders().indexOf(s)>=0&&(o=e.getResponseHeader(s));break;case this._NATIVE_XHR:e&&e.headers&&(o=JSON.parse(e.headers)[s])}if(o){const e=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):i;t.getItem(e)!==o&&(t.setItem(e,o),this._emitTokenUpdate(i,o))}}_emitTokenUpdate(t,e){if(this.htmlContext){const i=new CustomEvent("token-update",{bubbles:!0,detail:{type:t,token:e}});this.htmlContext.dispatchEvent(i)}}_emitRequestEvent(t,e){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${t}`,{bubbles:!0,composed:!0,detail:{metadata:e}})):console.warn(`Missing htmlContext to dispatch event http-request-${t}`)}_onRequestFail(t=null){(async()=>{if(!this._isSignatureRequired(t)&&!this._isWaitingForProcessResponse(t)){let e=await this._extractRequestErrorResponse(t);this._setLastResponse(e),this._setLastResponseHeaders(t),this._onRequestEnd("reject",t)}})()}_onRequestEnd(t="resolve",e=null){if(this._resetDPState(),this.emitRequestEvents){const t={method:this.method,path:this._path};null!==e&&(t.status=e.status,t.url=e.responseURL),this._emitRequestEvent("end",t)}this._promise&&"function"==typeof this._promise[t]&&(this._promise.isPending=!1,this._promise[t](e))}_resetDPState(){["Data","Type","State"].forEach((t=>{let e=`Authentication${t}`;this._headers&&this._headers.hasOwnProperty(e)&&delete this._headers[e],this.headers&&this.headers.hasOwnProperty(e)&&delete this.headers[e]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(t=null){let e,i,s,o,a;if(t instanceof window.XMLHttpRequest)e=t.getResponseHeader("AuthenticationType"),i=t.getResponseHeader("AuthenticationData"),s=t.getResponseHeader("AuthenticationState"),o=t.getResponseHeader("AuthenticationChallenge"),a=t.getResponseHeader("AuthenticationResponse");else{let n=JSON.parse(t.headers);e=n.authenticationtype,i=n.authenticationdata||null,s=n.authenticationstate,o=n.authenticationchallenge,a=n.authenticationresponse}return{type:e,data:i,state:s,challenge:o,response:a}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureTypeChange(t,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureValueChange(t,...arguments)}})}_onSignatureTypeChange(t="",e="",i=""){if("string"==typeof t&&""!==t)if(e.includes(t)){if("string"==typeof t&&""!==t){const s=this._getSignatureData(t,e,i);this.headers=Object.assign(this.headers||{},{AuthenticationType:t,AuthenticationData:s}),this._buildRequest()}}else this._error(15,`${t} is not a valid signature type`);"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(t=null,e="",i="",s=""){let o;if("object"==typeof t&&t){const a=this._getSignatureData(t.signatureType,e,i);o=this._makeKeyValuePairFromObject(a,t.signatureValue),t.challenge&&(o+=`,challenge=${t.challenge}`),this._buildSignatureHeaders(o,t.signatureType,s)}else"string"==typeof t&&""!==t&&(this._hasSignatureAuthenticationType(e,"2")?(o=`password=${t}`,this._buildSignatureHeaders(o,"2",s)):(o=`${i}=${t}`,this._buildSignatureHeaders(o,e,s)));"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(t="",e=""){if(!t)return"";let i,s=t.split(",");if(s.length>1){i=s.map((t=>`${t}=${e[t]}`)).join(",")}else i=`${t}=${e}`;return i}_hasSignatureAuthenticationType(t,e){return-1!==t.split(";").findIndex((t=>t===e))}_buildSignatureHeaders(t="",e="",i=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:t,AuthenticationType:e||""}),i&&(this.headers=Object.assign(this.headers,{AuthenticationState:i})),this._buildRequest()}_isSignatureRequired(t=null){const e=Number((t||{}).status);let i=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(e)){const e=this._extractRequestResponse(t),s=this._extractResponseErrorCode(e),o=this._ERROR_CODES.SIGNATURE_INVALID.includes(s),{type:a,data:n,state:r,challenge:c,response:l}=this._extractSignatureResponseHeaders(t),d=this._getRequestMetadata(t);if(o)this._notifySignatureInvalid(d),i=!0;else if(a)if(e){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(s)?(this._notifySignatureTypeUsingErrorCode(s,d,a,n,r,c,l),i=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(d,a,n,r,c,l),i=!0}return i}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(t=null){const e=Number((t||{}).status);let i=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(e)){const e=this._extractRequestResponse(t),s=this._extractResponseErrorCode(e),o=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(s),a=this._getRequestMetadata(t);o&&(this._notifyWaitingForProcessResponse(a),i=!0)}return i}_notifySignatureRequiredFirstStep(t,e,i,s){this._defineSignatureType(e,i),this._defineSignatureValue(e,i,s),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:e,data:i,metadata:t}}))}_notifySignatureRequired(t,e,i,s,o,a){this._defineSignatureValue(e,i,s);const n={type:e,data:i,challenge:o,metadata:t};a&&(n.response=a),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:n}))}_notifySignatureInvalid(t){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:t}}))}_notifyWaitingForProcessResponse(t){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:t}}))}_getRequestMetadata(t){const{responseURL:e,status:i}=t;return{path:this._path,method:this.method,url:e,status:i}}_emitEvent(t){this.htmlContext?this.htmlContext.dispatchEvent(t):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(t="",e="",i=""){const s=e.split(";").findIndex((e=>e===t));return i?i.split(";")[s]:""}toString(t=""){return`[object ${t||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(t=!1){return this._buildPromise(t)}_extractResponseErrorCode(t){return t?t["error-code"]||t.messages&&t.messages[0].code:null}_notifySignatureTypeUsingHeaders(t,e,i,s,o,a){s?this._notifySignatureRequired(t,e,i,s,o,a):this._notifySignatureRequiredFirstStep(t,e,i,s)}_notifySignatureTypeUsingErrorCode(t,e,i,s,o,a,n){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(t)?this._notifySignatureRequiredFirstStep(e,i,s,o):this._notifySignatureRequired(e,i,s,o,a,n)}}class Le extends qe{constructor(t=null){super(Object.assign(t||{},{method:"GET"}))}toString(t=""){return super.toString(t||"BGADPRequestGET")}}class Be extends qe{constructor(t=null){super(Object.assign(t||{},{method:"POST"}))}toString(t=""){return super.toString(t||"BGADPRequestPOST")}}class Ve extends Le{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/addresses`)}toString(){return super.toString("BGADPCustomersCustomerAddressesGetV0")}}class He extends Le{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/contact-details`)}toString(){return super.toString("BGADPCustomersCustomerContactDetailsGetV0")}}class je extends Le{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/economic-data`)}toString(){return super.toString("BGADPCustomersCustomerEconomicDataGetV0")}}class Ge extends Le{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`customers/v${this.version}/civil-registries`)}toString(){return super.toString("BGADPCustomersCivilRegistriesGetV1")}}class Ue extends Be{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`customers/v${this.version}/civil-registries/search`)}toString(){return super.toString("BGADPCustomersCivilRegistriesSearchPostV1")}}class ze extends Le{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/addresses`)}toString(){return super.toString("BGADPCustomersCustomerAddressesGetV1")}}class Ke extends Le{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/contact-details`)}toString(){return super.toString("BGADPCustomersCustomerContactDetailsGetV1")}}class Ye extends Le{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/identification-process/documents`)}toString(){return super.toString("BGADPCustomersCustomerIdentificationProcessDocumentsGetV1")}}class Xe extends Be{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/identification-process/documents`)}toString(){return super.toString("BGADPCustomersCustomerIdentificationProcessDocumentsPostV1")}}class We extends Le{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/indicators`)}toString(){return super.toString("BGADPCustomersCustomerIndicatorsGetV1")}}class Je extends Le{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/terms`)}toString(){return super.toString("BGADPCustomersCustomerTermsGetV1")}}class Qe extends Be{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/terms`)}toString(){return super.toString("BGADPCustomersCustomerTermsPostV1")}}class Ze extends(e(i)){_mappingBank(t){this._renameProperty(t,"bank.bankId","id"),this._renameProperty(t,"bank.branch.branchId","id"),t.bank&&t.bank.branch&&t.bank.branch.costCenter&&(t.bank.branch.costCenter={id:t.bank.branch.costCenter})}_mappingGender(t){this._renameProperty(t,"gender.name","description")}_mappingIdentityDocuments(t){for(let e=0;e<t.identityDocuments.length;e++)this._renameProperty(t.identityDocuments[e],"documentType.name","description"),this._renameProperty(t.identityDocuments[e],"status.name","description")}_mappingMaritalStatus(t){this._renameProperty(t,"maritalStatus.name","description")}_mappingNationalities(t){for(let e=0;e<t.nationalities.length;e++)this._renameProperty(t.nationalities[e],"name","description")}_mappingPersonalTitle(t){this._renameProperty(t,"personalTitle.name","description")}_mappingResidence(t){this._renameProperty(t,"residence","taxResidence"),this._renameProperty(t,"taxResidence.residenceType.name","description")}_mappingVerification(t){this._renameProperty(t,"enrollmentModality","verification"),this._renameProperty(t,"verification.enrollmentMethod","identificationMethod")}_mappingSegments(t){for(let e=0;e<t.segments.length;e++)this._renameProperty(t.segments[e],"name","description")}_changeNameToDescription(t){t.map((t=>{this._renameProperty(t,"name","description")}))}}class ti extends Ze{static get is(){return"bbva-global-customer-terms-base-api-dm"}resetCustomerTerms(){this.customerTerms=[]}getCustomerTerms(t,e){e=Object.assign({"customer-id":t},e),this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields,this._paginationMapping)}postCustomerTerms(t,e){this._requestMapping(e);const i={"customer-id":t};this._generateGetService(this._getService("post",e,i),this.constructor.POST_EVENTS,this._responseMapping),this.resetCustomerTerms()}_getService(t,e={},i={}){const s=this._getServiceParams(i,e);return this._getServicePath(`${t}CustomerTerms`,this._getBgadp(s))}_getBgadp(t){return{getCustomerTermsV1:()=>new Je(t),postCustomerTermsV1:()=>new Qe(t),default:()=>"BGADP does not exist."}}_requestMapping(t){return t}_responseMapping(t){return t}_paginationMapping(t){return t}}s(ti,"GET_EVENTS",{customEvent:"customer-terms-api-dm-fetch",paginationEvent:"customer-terms-api-dm-pagination",errorFireEventHandler:"customer-terms-api-dm-fetch-error"}),s(ti,"POST_EVENTS",{customEvent:"customer-terms-api-dm-create",errorFireEventHandler:"customer-terms-api-dm-create-error"}),customElements.define(ti.is,ti);class ei extends Ze{static get is(){return"bbva-global-customer-contact-details-api-dm"}static get properties(){return{customerContactDetails:{type:Array,attribute:!1},_contactType:{type:Object,attribute:!1},_socialNetwork:{type:Object,attribute:!1},_emailType:{type:Object,attribute:!1},_phoneType:{type:Object,attribute:!1}}}constructor(){super(),this.customerContactDetails=[],this._contactType={WORK_EMAIL:"EMAIL",FACEBOOK_EMAIL:"EMAIL",EMAIL:"EMAIL",PHONE_NUMBER:"LANDLINE",MOBILE_NUMBER:"MOBILE",OFFICE_NUMBER:"LANDLINE",FACEBOOK_ACCOUNT:"SOCIALMEDIA",TWITTER_ACCOUNT:"SOCIALMEDIA"},this._socialNetwork={FACEBOOK_ACCOUNT:"FACEBOOK",TWITTER_ACCOUNT:"TWITTER"},this._emailType={EMAIL:"PERSONAL",WORK_EMAIL:"WORK",FACEBOOK_EMAIL:"SOCIALMEDIA"},this._phoneType={PHONE_NUMBER:"HOME",OFFICE_NUMBER:"WORK"}}resetCustomerContactDetails(){this.customerContactDetails=[]}getCustomerContactDetails(t,e={}){if(Object.keys(this.customerContactDetails).length)return;this._paramsMapping(e);e=Object.assign({"customer-id":t},e),this._generateGetService(this._getService("get",{},e),{customEvent:"customer-contact-details-api-dm-fetch",paginationEvent:"customer-contact-details-api-dm-pagination",errorFireEventHandler:"customer-contact-details-api-dm-fetch-error"},this._responseMapping,e.fields)}_getService(t,e={},i={}){const s=this._getServiceParams(i,e);return this._getServicePath(`${t}CustomerContactDetails`,this._getBgadp(s))}_getBgadp(t){return{getCustomerContactDetailsV0:()=>new He(t),getCustomerContactDetailsV1:()=>new Ke(t),getCustomerContactDetailsV2:()=>new at(t),getCustomerContactDetailsV3:()=>new nt(t),default:()=>"BGADP called not exist"}}_paramsMapping(t){"0"==this.version&&(this._removeFields(["contact.isMultichannel"],t),this._removeFields(["contact.contactDetailType"],t)),"2"==this.version&&this._removeFields(["contact.contactDetailType"],t)}_responseMapping(t){if("0"==this.version&&Object.keys(t).length){let e;for(let i=0;i<t.length;i++)if(this._renameProperty(t[i],"contactDetailId","id"),t[i].contactType){switch(e=t[i].contact,t[i].contact={contactDetailType:this._contactType[t[i].contactType.id]},t[i].contact.contactDetailType){case"EMAIL":t[i].contact.address=e,t[i].hasOwnProperty("isVerified")&&(t[i].contact.isVerified=t[i].isVerified),t[i].contact.receivesNotifications=t[i].isChecked,t[i].contact.emailType=this._emailType[t[i].contactType.id];break;case"LANDLINE":t[i].contact.number=e,t[i].contact.phoneType=this._phoneType[t[i].contactType.id],t[i].country&&(t[i].contact.country=t[i].country),t[i].regionalCode&&(t[i].contact.regionalCode=t[i].regionalCode),t[i].extension&&(t[i].contact.extension=t[i].extension),t[i].hasOwnProperty("isVerified")&&(t[i].contact.isVerified=t[i].isVerified);break;case"MOBILE":t[i].contact.number=e,t[i].phoneCompany&&(t[i].contact.phoneCompany=t[i].phoneCompany),t[i].hasOwnProperty("isVerified")&&(t[i].contact.isVerified=t[i].isVerified),t[i].contact.receivesNotifications=t[i].isChecked,t[i].contact.phoneType="HOME";break;case"SOCIALMEDIA":t[i].contact.userName=e,t[i].contact.socialNetwork=this._socialNetwork[t[i].contactType.id]}this._removeFields(["country","regionalCode","extension","isChecked","isVerified","contactType","phoneCompany"],t[i])}}if("1"==this.version&&Object.keys(t).length){const e=["isSafe","isVerifiedByCustomer"];for(let i=0;i<t.length;i++)t[i].contact&&"MOBILE"===t[i].contact.contactDetailType&&this._removeFields(["isMobileToken"],t[i].contact),this._removeFields(e,t[i])}return t}}class ii extends Ze{static get is(){return"bbva-global-customer-addresses-api-dm"}static get properties(){return{customerAddresses:{type:Array,attribute:!1}}}constructor(){super(),this.customerAddresses=[]}resetCustomerAddresses(){this.customerAddresses=[]}getCustomerAddresses(t,e={}){if(Object.keys(this.customerAddresses).length)return;this._paramsMapping(e);e=Object.assign({"customer-id":t},e),this._generateGetService(this._getService("get",{},e),{customEvent:"customer-addresses-api-dm-fetch",paginationEvent:"customer-addresses-api-dm-pagination",errorFireEventHandler:"customer-addresses-api-dm-fetch-error"},this._responseMapping,e.fields)}_getService(t,e={},i={}){const s=this._getServiceParams(i,e);return this._getServicePath(`${t}CustomerAddresses`,this._getBgadp(s))}_getBgadp(t){return{getCustomerAddressesV3:()=>new rt(t),getCustomerAddressesV2:()=>new ct(t),getCustomerAddressesV1:()=>new ze(t),getCustomerAddressesV0:()=>new Ve(t),default:()=>"BGADP called not exist"}}_paramsMapping(t){"0"!=this.version&&"2"!=this.version||this._removeFields(["addressType.id"],t)}_responseMapping(t){if(Object.keys(t).length&&"1"==this.version)for(let e=0;e<t.length;e++)this._removeFields(["order","creationDate","isVerifiedByCustomer"],t[e]),this._geolocationToString(t[e].location.geolocation);else if(Object.keys(t).length&&"0"==this.version)for(let e=0;e<t.length;e++)if(!t[e].location.addressComponents){let i=[];this._renameProperty(t[e].location,"addressName","formattedAddress"),this._renameProperty(t[e],"addressId","id"),this._renameProperty(t[e].addressType,"name","description"),this._renameProperty(t[e].ownershipType,"name","description"),t[e].ownershipType&&this._renameProperty(t[e].ownershipType.propertyType,"name","description"),i.push({componentTypes:["COUNTRY"],code:t[e].location.country.id,name:t[e].location.country.name}),t[e].location.city&&i.push({componentTypes:["CITY"],name:t[e].location.city}),t[e].location.zipCode&&i.push({componentTypes:["POSTAL_CODE"],code:t[e].location.zipCode}),t[e].location.state&&i.push({componentTypes:["ADMINISTRATIVE_AREA_LEVEL_1"],code:t[e].location.state.id,name:t[e].location.state.name}),t[e].location.geographicGroups&&(i=[...t[e].location.geographicGroups,...i],delete t[e].location.geographicGroups),this._geolocationToString(t[e].location.geolocation);for(let t=0;t<i.length;t++)i[t].geographicGroupType&&(i[t].componentTypes=[i[t].geographicGroupType.id],this._removeFields(["geographicGroupType"],i[t]));t[e].location.addressComponents=i,this._removeFields(["city","state","country","zipCode"],t[e].location)}return t}_geolocationToString(t){t&&Object.keys(t).length>0&&(t.latitude=t.latitude.toString(),t.longitude=t.longitude.toString())}}class si extends Ze{static get is(){return"bbva-global-customer-lopd-documents-base-api-dm"}resetCustomerLopdDocuments(){this.customerLopdDocuments={}}getCustomerLopdDocuments(t,e){e=Object.assign({"customer-id":t},e),this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields)}_getService(t,e={},i={}){const s=this._getServiceParams(i,e);return this._getServicePath(`${t}CustomerLopdDocuments`,this._getBgadp(s))}_getBgadp(t){return{getCustomerLopdDocumentsV3:()=>new lt(t),default:()=>"BGADP does not exist."}}_responseMapping(t){return t}}s(si,"GET_EVENTS",{customEvent:"customer-lopd-documents-api-dm-fetch",errorFireEventHandler:"customer-lopd-documents-api-dm-fetch-error"}),customElements.define(si.is,si);class oi extends Ze{static get is(){return"bbva-global-customer-economic-data-base-api-dm"}resetCustomerEconomicData(){this.customerEconomicData={}}getCustomerEconomicData(t,e){e=Object.assign({"customer-id":t},e),this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields)}_getService(t,e={},i={}){const s=this._getServiceParams(i,e);return this._getServicePath(`${t}CustomerEconomicData`,this._getBgadp(s))}_getBgadp(t){return{getCustomerEconomicDataV0:()=>new je(t),getCustomerEconomicDataV2:()=>new _t(t),getCustomerEconomicDataV3:()=>new vt(t),default:()=>"BGADP does not exist."}}_incomesMapping(t){t.map((t=>{t.incomeValue={},t.incomeValue={valueType:"EXACT",amount:{amount:t.incomeValues[0].amount,currency:t.incomeValues[0].currency}},t.incomeValues[0].concept&&(t.incomeValue.concept=t.incomeValues[0].concept),t.incomeValues[0].frecuency&&(t.incomeValue.frequency=t.incomeValues[0].frecuency),"BIWEEKLY"==t.incomeValue.frequency&&(t.incomeValue.frequency="BI_WEEKLY"),this._removeFields(["incomeValues"],t),this._changeNameToDescription([t.incomeType])}))}_expensesMapping(t){t.map((t=>{t.expenseValue={currency:t.expenseValues[0].currency,amount:t.expenseValues[0].amount},t.expenseValues[0].frecuency&&(t.expenseValue.frequency=t.expenseValues[0].frecuency),t.expenseValue.frequency&&"BIWEEKLY"==t.expenseValue.frequency&&(t.expenseValue.frequency="BI_WEEKLY"),this._removeFields(["expenseValues"],t),this._changeNameToDescription([t.expenseType])}))}_workPlaceMapping(t){t.address&&(t.address.addressType&&"WORK"!==t.address.addressType.id&&this._removeFields(["id"],t.address.addressType),t.address.ownershipType&&(["MOVED","REJECTED","NOT_LOCATED"].includes(t.address.ownershipType.id)&&this._removeFields(["id"],t.address.ownershipType),this._changeNameToDescription([t.address.ownershipType,t.address.ownershipType.propertyType])),this._renameProperty(t.address.location,"addressName","formatedAddress"),this._removeFields(["residenceStartDate"],t.address),this._removeFields(["city","state","country","zipCode","geolocation","geographicGroups","meta"],t.address.location)),this._changeNameToDescription([t.address.addressType,t.economicActivity,t.profesionPosition]),this._renameProperty(t,"profesionPosition","professionPosition"),this._removeFields(["taxpayerIdentification"],t)}_assetsMapping(t){t.map((t=>{this._changeNameToDescription([t.assetType]),t.assetValues.map((t=>{this._removeFields(["concept"],t)}))}))}_liabilitiesMapping(t){t.map((t=>{this._changeNameToDescription([t.liabilityType]),t.liabilityValues.map((t=>{this._removeFields(["concept","frecuency"],t)}))}))}_responseMapping(t){return"0"==this.version&&Object.keys(t).length?(this._changeNameToDescription([t.economicActivity,t.occupationType,t.employmentSituation,t.education]),t.incomes&&this._incomesMapping(t.incomes),t.expenses&&this._expensesMapping(t.expenses),t.workPlace&&this._workPlaceMapping(t.workPlace),t.assets&&this._assetsMapping(t.assets),t.liabilities&&this._liabilitiesMapping(t.liabilities),t.balances&&t.balances.map((t=>{this._changeNameToDescription([t])})),this._renameProperty(t,"workPlace","workplace"),this._removeFields(["financialGroup","financialSubGroup","indicators","incomeSources"],t)):"2"==this.version&&Object.keys(t).length&&(t.workPlace&&t.workPlace.economicActivities&&(t.workPlace.economicActivity=t.workPlace.economicActivities[0],this._removeFields(["economicActivities"],t.workPlace)),t.balances&&t.balances.forEach((t=>{t.id=t.balanceType.id,t.description=t.balanceType.description,t.amount=t.balanceValue.amount,t.currency=t.balanceValue.currency,this._removeFields(["balanceType","balanceValue"],t)})),t.expenses&&t.expenses.forEach((t=>{["OTHER_LOAN","REVOLVING_CARD","FIXED_PAYMENT"].includes(t.expenseType.id)&&this._removeFields(["expenseType"],t)})),t.assets&&t.assets.forEach((t=>{["BANK_DEPOSIT"].includes(t.assetType.id)&&this._removeFields(["assetType"],t)})),t.liabilities&&t.liabilities.forEach((t=>{["MORTGAGE","PERSONAL_LOANS","OTHER_LOANS"].includes(t.liabilityType.id)&&this._removeFields(["liabilityType"],t)})),this._renameProperty(t,"workPlace","workplace"),this._removeFields(["financialSummaries"],t)),t}}s(oi,"GET_EVENTS",{customEvent:"customer-economic-data-api-dm-fetch",errorFireEventHandler:"customer-economic-data-api-dm-fetch-error"}),customElements.define(oi.is,oi);class ai extends Ze{static get is(){return"bbva-global-civil-registries-search-base-api-dm"}resetCivilRegistriesSearch(){this.civilRegistriesSearch=[]}postCivilRegistriesSearch(t){this._generateGetService(this._getService("post",t),this.constructor.POST_EVENTS,this._responseMapping)}_getService(t,e={},i={}){const s=this._getServiceParams(i,e);return this._getServicePath(`${t}CivilRegistriesSearch`,this._getBgadp(s))}_getBgadp(t){return{postCivilRegistriesSearchV1:()=>new Ue(t),default:()=>"BGADP does not exist."}}_responseMapping(t){return t}}s(ai,"POST_EVENTS",{customEvent:"civil-registries-search-api-dm-fetch",errorFireEventHandler:"civil-registries-search-api-dm-fetch-error"}),customElements.define(ai.is,ai);class ni extends Ze{static get is(){return"bbva-global-civil-registries-search-api-dm"}static get properties(){return{civilRegistriesSearch:{type:Array,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}async resetCivilRegistriesSearch(){await this.module.updateComplete,this.module.resetCivilRegistriesSearch()}constructor(){super(),this.civilRegistriesSearch=[],this.country="",this.localCustomProperties={},this._countries=["Mx"],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties"],this._loaded=!1,this._requestParams={},this._modules={Mx:()=>import("./26f0ef8f.js")}}update(t){super.update(t),t.forEach(((t,e)=>{"country"===e&&this.country&&this.country!==t?this._loadModule():"_module"!==e&&"_requestParams"!==e&&"_loaded"!==e&&this._module&&this[e]!==t?this._module[e]=this[e]:("_requestParams"===e&&this._requestParams&&this._requestParams!==t&&void 0!==t&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===e&&this._loaded)&&Object.entries(this._requestParams).forEach((([t])=>{this[`_${t}CivilRegistriesSearch`]()}))}))}async _loadModule(){const t=this._capitalize(this.country);if(this._countries.includes(t)&&this._modules[t]){const e=`BbvaCivilRegistriesSearch${t}ApiDm`;(0,this._modules[t])().then((async t=>{const i=t[e].is;this._module=this._createModuleElement(i),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-civil-registries-search-api-dm-module-load")})).catch((async t=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-civil-registries-search-api-dm-module-error",t)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(t){return t.charAt(0).toUpperCase()+t.slice(1).toLowerCase()}_createModuleElement(t=ai.is){const e=document.createElement(t);return this._bindConfig(e),e}async _bindConfig(t){this._configProperties.forEach((e=>{t[e]=this[e]})),await this.updateComplete}_dispatchEvent(t,e=!0){this.dispatchEvent(new CustomEvent(t,{detail:e,bubbles:!0,composed:!0}))}async postCivilRegistriesSearch(t){await this.module.updateComplete,this._requestParams.post?this._requestParams.post.push({body:t}):this._requestParams={post:[{body:t}]}}async _postCivilRegistriesSearch(){await this.module.updateComplete,this._requestParams.post.forEach((t=>{this.module.postCivilRegistriesSearch(t.body)})),delete this._requestParams.post}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return o` ${this._module?this._module:""}`}}class ri extends Ze{static get is(){return"bbva-global-civil-registries-base-api-dm"}resetCivilRegistries(){this.civilRegistries=[]}getCivilRegistries(t){this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields,this._paginationMapping)}_getService(t,e={},i={}){const s=this._getServiceParams(i,e);return this._getServicePath(`${t}CivilRegistries`,this._getBgadp(s))}_getBgadp(t){return{getCivilRegistriesV1:()=>new Ge(t),default:()=>"BGADP does not exist."}}_responseMapping(t){return t}_paginationMapping(t){return t}}s(ri,"GET_EVENTS",{customEvent:"civil-registries-api-dm-fetch",paginationEvent:"civil-registries-api-dm-pagination",errorFireEventHandler:"civil-registries-api-dm-fetch-error"}),customElements.define(ri.is,ri);class ci extends Ze{static get is(){return"bbva-global-customers-child-customers-base-api-dm"}postCustomersChildCustomers(t){this._generateGetService(this._getService("post",t),this.constructor.POST_EVENTS,this._responseMapping)}_getService(t,e={},i={}){const s=this._getServiceParams(i,e);return this._getServicePath(`${t}CustomersChildCustomers`,this._getBgadp(s))}_getBgadp(t){return{postCustomersChildCustomersV3:()=>new bt(t),default:()=>"BGADP does not exist."}}_responseMapping(t){return t}}s(ci,"POST_EVENTS",{customEvent:"customers-child-customers-api-dm-create",errorFireEventHandler:"customers-child-customers-api-dm-create-error"}),customElements.define(ci.is,ci);class li extends Ze{static get is(){return"bbva-global-customers-child-customers-api-dm"}static get properties(){return{country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.country="",this.localCustomProperties={},this._countries=["Mx"],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties"],this._loaded=!1,this._requestParams={},this._modules={Mx:()=>import("./20c85213.js")}}update(t){super.update(t),t.forEach(((t,e)=>{"country"===e&&this.country&&this.country!==t?this._loadModule():"_module"!==e&&"_requestParams"!==e&&"_loaded"!==e&&this._module&&this[e]!==t?this._module[e]=this[e]:("_requestParams"===e&&this._requestParams&&this._requestParams!==t&&void 0!==t&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===e&&this._loaded)&&Object.entries(this._requestParams).forEach((([t])=>{this[`_${t}CustomersChildCustomers`]()}))}))}async _loadModule(){const t=this._capitalize(this.country);if(this._countries.includes(t)&&this._modules[t]){const e=`BbvaCustomersChildCustomers${t}ApiDm`;(0,this._modules[t])().then((async t=>{const i=t[e].is;this._module=this._createModuleElement(i),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-customers-child-customers-api-dm-module-load")})).catch((async t=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-customers-child-customers-api-dm-module-error",t)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(t){return t.charAt(0).toUpperCase()+t.slice(1).toLowerCase()}_createModuleElement(t=ci.is){const e=document.createElement(t);return this._bindConfig(e),e}async _bindConfig(t){this._configProperties.forEach((e=>{t[e]=this[e]})),await this.updateComplete}_dispatchEvent(t,e=!0){this.dispatchEvent(new CustomEvent(t,{detail:e,bubbles:!0,composed:!0}))}async postCustomersChildCustomers(t){await this.module.updateComplete,this._requestParams.post?this._requestParams.post.push({body:t}):this._requestParams={post:[{body:t}]}}async _postCustomersChildCustomers(){await this.module.updateComplete,this._requestParams.post.forEach((t=>{this.module.postCustomersChildCustomers(t.body)})),delete this._requestParams.post}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return o` ${this._module?this._module:""}`}}class di extends Ze{static get is(){return"bbva-global-customer-identification-process-documents-base-api-dm"}resetCustomerIdentificationProcessDocuments(){this.customerIdentificationProcessDocuments=[]}getCustomerIdentificationProcessDocuments(t,e){e=Object.assign({"customer-id":t},e),this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields)}postCustomerIdentificationProcessDocuments(t,e){const i={"customer-id":t};this._generateGetService(this._getService("post",e,i),this.constructor.POST_EVENTS,this._responseMapping),this.resetCustomerIdentificationProcessDocuments()}_getService(t,e={},i={}){const s=this._getServiceParams(i,e);return this._getServicePath(`${t}CustomerIdentificationProcessDocuments`,this._getBgadp(s))}_getBgadp(t){return{getCustomerIdentificationProcessDocumentsV1:()=>new Ye(t),postCustomerIdentificationProcessDocumentsV1:()=>new Xe(t),default:()=>"BGADP does not exist."}}_responseMapping(t){return t}}s(di,"GET_EVENTS",{customEvent:"customer-identification-process-documents-api-dm-fetch",errorFireEventHandler:"customer-identification-process-documents-api-dm-fetch-error"}),s(di,"POST_EVENTS",{customEvent:"customer-identification-process-documents-api-dm-create",errorFireEventHandler:"customer-identification-process-documents-api-dm-create-error"}),customElements.define(di.is,di);class ui extends Ze{static get is(){return"bbva-global-customer-identification-process-documents-api-dm"}static get properties(){return{customerIdentificationProcessDocuments:{type:Array,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.customerIdentificationProcessDocuments=[],this.country="",this.localCustomProperties={},this._countries=[],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties","customerIdentificationProcessDocuments"],this._loaded=!1,this._requestParams={}}update(t){super.update(t),t.forEach(((t,e)=>{"country"===e&&this.country&&this.country!==t?this._loadModule():"_module"!==e&&"_requestParams"!==e&&"_loaded"!==e&&this._module&&this[e]!==t?this._module[e]=this[e]:("_requestParams"===e&&this._requestParams&&this._requestParams!==t&&void 0!==t&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===e&&this._loaded)&&Object.entries(this._requestParams).forEach((([t])=>{this[`_${t}CustomerIdentificationProcessDocuments`]()}))}))}async _loadModule(){const t=this._capitalize(this.country);if(this._countries.includes(t)&&this._modules[t]){const e=`BbvaCustomerIdentificationProcessDocuments${t}ApiDm`;(0,this._modules[t])().then((async t=>{const i=t[e].is;this._module=this._createModuleElement(i),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-customer-identification-process-documents-api-dm-module-load")})).catch((async t=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-customer-identification-process-documents-api-dm-module-error",t)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(t){return t.charAt(0).toUpperCase()+t.slice(1).toLowerCase()}_createModuleElement(t=di.is){const e=document.createElement(t);return this._bindConfig(e),e}async _bindConfig(t){this._configProperties.forEach((e=>{t[e]=this[e]})),await this.updateComplete}_dispatchEvent(t,e=!0){this.dispatchEvent(new CustomEvent(t,{detail:e,bubbles:!0,composed:!0}))}async resetCustomerIdentificationProcessDocuments(){await this.module.updateComplete,this.module.resetCustomerIdentificationProcessDocuments()}async getCustomerIdentificationProcessDocuments(t,e={}){await this.module.updateComplete,this._requestParams.get?this._requestParams.get.push({customerId:t,params:e}):this._requestParams={get:[{customerId:t,params:e}]}}async _getCustomerIdentificationProcessDocuments(){await this.module.updateComplete,Object.keys(this.customerIdentificationProcessDocuments).length||(this._requestParams.get.forEach((t=>{this.module.getCustomerIdentificationProcessDocuments(null==t?void 0:t.customerId,null==t?void 0:t.params)})),delete this._requestParams.get)}async postCustomerIdentificationProcessDocuments(t,e){await this.module.updateComplete,this._requestParams.post?this._requestParams.post.push({customerId:t,body:e}):this._requestParams={post:[{customerId:t,body:e}]}}async _postCustomerIdentificationProcessDocuments(){await this.module.updateComplete,this._requestParams.post.forEach((t=>{this.module.postCustomerIdentificationProcessDocuments(null==t?void 0:t.customerId,null==t?void 0:t.body)})),delete this._requestParams.post}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return o` ${this._module?this._module:""}`}}class hi extends Ze{static get is(){return"bbva-global-customer-indicators-base-api-dm"}resetCustomerIndicators(){this.customerIndicators=[]}getCustomerIndicators(t,e){e=Object.assign({"customer-id":t},e),this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields)}_getService(t,e={},i={}){const s=this._getServiceParams(i,e);return this._getServicePath(`${t}CustomerIndicators`,this._getBgadp(s))}_getBgadp(t){return{getCustomerIndicatorsV1:()=>new We(t),getCustomerIndicatorsV3:()=>new yt(t),default:()=>"BGADP does not exist."}}_responseMapping(t){return"1"==this.version&&Object.keys(t).length&&t.forEach((t=>{["BASIC_DATA","ENTREPRENEUR_AND_POTENTIAL","WEB_CONSUMPTION_ACCOUNT","USER_EXPIRED"].includes(t.id)&&this._removeFields(["id"],t),this._removeFields(["payrollAmounts","payrollAge"],t)})),t}}s(hi,"GET_EVENTS",{customEvent:"customer-indicators-api-dm-fetch",errorFireEventHandler:"customer-indicators-api-dm-fetch-error"}),customElements.define(hi.is,hi);class pi extends(e(i)){_mappingIndicators(t){t.map((t=>{this._removeFields(["name"],t),this._renameProperty(t,"indicatorId","id")}));for(let e=0;e<t.length;e++)"DESTINATION_IMMEDIATE_DEBIT"==t[e].id&&t.splice(e,1),"CAN_BE_ASSOCIATED_TO_A_CUSTODY_ACCOUNT"==t[e].id&&t.splice(e,1);return t}}class mi extends Le{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts`)}toString(){return super.toString("BGADPAccountsGetV0")}}class gi extends Be{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts`)}toString(){return super.toString("BGADPAccountsPostV0")}}class _i extends Le{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/financial-statements`)}toString(){return super.toString("BGADPAccountsAccountFinancialStatementsGetV0")}}class vi extends Le{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/financial-statements/{financial-statement-id}`)}toString(){return super.toString("BGADPAccountsAccountFinancialStatementsFinancialStatementGetV0")}}class yi extends Le{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/limits`)}toString(){return super.toString("BGADPAccountsAccountLimitsGetV0")}}class bi extends Le{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/transactions`)}toString(){return super.toString("BGADPAccountsAccountTransactionsGetV0")}}class fi extends pi{static get is(){return"bbva-global-accounts-base-api-dm"}resetAccounts(){this.accounts=[]}getAccounts(t){this._paramsMapping(t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields,this._paginationMapping)}postAccounts(t){this._requestMapping(t),this._generateGetService(this._getService("post",t),this.constructor.POST_EVENTS,this._responseMapping),this.resetAccounts()}_getService(t,e={},i={}){const s=this._getServiceParams(i,e);return this._getServicePath(`${t}Accounts`,this._getBgadp(s))}_getBgadp(t){return{getAccountsV1:()=>new Tt(t),getAccountsV0:()=>new mi(t),postAccountsV0:()=>new gi(t),postAccountsV1:()=>new St(t),getAccountsV2:()=>new ft(t),default:()=>"BGADP does not exist."}}_renameQueryParam(t,e,i){e in t&&(t[i]=t[e],delete t[e])}_paramsMapping(t){if("0"==this.version&&Object.keys(t).length){const e=["ANNULLED","CHARGE_OFF","INACTIVE","PROPOSAL"],i=["ORIGIN_TO_TRANSPORT_RECHARGE","DESTINATION_TO_MERCHANT_QR","SPI_ACTIVE_PAYMENTS"];t["status.id"]&&e.includes(t["status.id"])&&this._removeFields(["status.id"],t),t["indicators.id"]&&i.includes(t["indicators.id"])&&this._removeFields(["indicators.id"],t),this._renameProperty(t,"currency","currencies.currency"),this._renameQueryParam(t,"indicators.id","indicators.indicatorId")}return"0"!=this.version&&"1"!=this.version||this._renameQueryParam(t,"expand.id","expand"),t}_responseMapping(t){if(Array.isArray(t)&&t.length>0){if("0"==this.version)for(let e=0;e<t.length;e++){this._renameProperty(t[e],"accountId","id"),this._renameProperty(t[e],"title","product");["COMMON","CREDIT"].includes(t[e].accountType.id)||this._removeFields(["accountType"],t[e]),this._removeFields(["subType"],t[e].accountType),this._removeFields(["previousMonthAverageBalances"],t[e].availableBalance),"DORMANT"===t[e].status.id&&this._removeFields(["status"],t[e]),this._removeFields(["reason","reasonDescription","situation"],t[e].status),t[e].indicators&&t[e].indicators.length&&(t[e].indicators=this._mappingIndicators(t[e].indicators)),this._removeFields(["clabe","bank","accountFamily","commercialPackage","joint","openingDate","currencies","disposedBalance","image","meta","offerId","delivery","accountAgreement","cardInformation","petitionerBusinessAgent"],t[e])}else if("1"==this.version)for(let e=0;e<t.length;e++)t[e].product&&this._removeFields(["subProduct"],t[e].product),this._removeFields(["bank","joint","participants","isPayrollAccount"],t[e]),t[e].indicators&&t[e].indicators.length&&(t[e].indicators=this._mappingIndicators(t[e].indicators));return t}return this._postResponseMapping(t)}_postResponseMapping(t){if("0"==this.version&&Object.keys(t).length){this._renameProperty(t,"accountId","id"),t.customizedFormats&&t.customizedFormats.forEach((t=>{this._renameProperty(t,"customizedFormatId","id")})),this._renameProperty(t,"joint","jointSignatureType"),this._renameProperty(t,"title","product"),t.bank&&(this._renameProperty(t.bank,"bankId","id"),this._renameProperty(t.bank.branch,"branchId","id")),t.status.reason&&(t.status.reason={id:t.status.reason});["COMMON","CREDIT","CREDIT_EXTENSION","SAVINGS","MONEY_MARKET","SAVINGS_EXTENSION"].includes(t.accountType.id)||this._removeFields(["accountType"],t),t.participants.forEach((t=>{this._renameProperty(t,"participantId","id"),"NATURAL_PERSON"===t.personType||Object.keys(t).some((t=>"firstName"===t))?(t.customDetails={personType:"NATURAL_UNKNOWN"},t.firstName&&(t.customDetails={...t.customDetails,firstName:t.firstName}),t.middleName&&(t.customDetails={...t.customDetails,middleName:t.middleName}),t.lastName&&(t.customDetails={...t.customDetails,lastName:t.lastName}),t.secondLastName&&(t.customDetails={...t.customDetails,secondLastName:t.secondLastName}),t.identityDocument&&(t.customDetails.identityDocuments=[{documentNumber:t.identityDocument.documentNumber,documentType:{id:t.identityDocument.documentType}}],"NIE"===t.customDetails.identityDocuments[0].documentType.id&&this._removeFields(["documentType"],t.customDetails.identityDocuments[0])),this._removeFields(["personType","firstName","middleName","lastName","secondLastName","identityDocument"],t)):("LEGAL_PERSON"===t.personType||Object.keys(t).some((t=>"legalName"===t)))&&(t.customDetails={personType:"LEGAL_UNKNOWN"},t.legalName&&(t.customDetails={...t.customDetails,legalName:t.legalName}),t.identityDocument&&(t.customDetails.businessDocuments=[{documentNumber:t.identityDocument.documentNumber,documentType:{id:t.identityDocument.documentType}}],"NIE"===t.customDetails.businessDocuments[0].documentType.id&&this._removeFields(["documentType"],t.customDetails.businessDocuments[0])),this._removeFields(["personType","legalName","identityDocument"],t)),t.participantType.order&&(t.order=t.participantType.order,this._removeFields(["order"],t.participantType)),this._removeFields(["suffix","documents"],t)})),t.conditions&&t.conditions.forEach((t=>{this._renameProperty(t,"conditionId","id"),this._removeFields(["period","facts","outcomes"],t)})),t.delivery&&(t.deliveries=t.delivery,this._removeFields(["delivery"],t),t.deliveries.forEach((t=>{"VIRTUAL"===t.deliveryType?t.method="DIGITAL":"PHYSICAL"===t.deliveryType&&(t.method="STANDARD"),t.address&&this._renameProperty(t.address,"addressType","deliveryAddressType"),t.destination&&t.destination.branch&&(t.destination.bank={branch:t.destination.branch},this._removeFields(["branch"],t.destination)),t.contactDetails&&t.contactDetails[0].contactDetail&&t.contactDetails[0].contactDetail.contactDetailId&&(t.contactDetails={id:t.contactDetails[0].contactDetail.contactDetailId,deliveryContactType:"STORED"}),this._removeFields(["documentType","deliveryType"],t)}))),t.fees&&t.fees.itemizeFees.forEach((t=>{this._renameProperty(t,"name","description"),t.itemizeFeeUnits=[{unitType:"AMOUNT",amount:t.feeAmount.amount,currency:t.feeAmount.currency}],t.feeAmount.percentage&&t.itemizeFeeUnits.push({unitType:"PERCENTAGE",percentage:t.feeAmount.percentage}),this._removeFields(["feeAmount"],t)})),t.rates&&t.rates.forEach((t=>{t.itemizeRates=[{rateType:t.rateType.id,itemizeRateUnits:[t.unit]}],this._renameProperty(t.itemizeRates[0].itemizeRateUnits[0],"mode","unitType"),t.rateType.name&&(t.itemizeRates=[{...t.itemizeRates[0],description:t.rateType.name}]),this._removeFields(["rateType","unit"],t)})),t.operationNumber&&(t.operationTracking={operationNumber:t.operationNumber}),t.relatedContracts&&t.relatedContracts.forEach((t=>{this._renameProperty(t.relationType,"name","description"),t.contractDetails={number:t.number,contractType:"INTERNAL_CONTRACT"},this._removeFields(["number"],t)})),this._removeFields(["businessType","operationNumber","accountFamily","billingInformation"],t)}return t}_requestMapping(t){return"0"==this.version&&(t.bank&&(this._renameProperty(t.bank,"id","bankId"),this._renameProperty(t.bank.branch,"id","branchId")),this._renameProperty(t,"jointSignatureType","joint"),this._renameProperty(t,"product","title"),this._removeFields(["subproduct"],t.title),t.status&&this._removeFields(["name"],t.status),t.limits&&t.limits.forEach((t=>{this._renameProperty(t,"id","limitId")})),t.indicators&&t.indicators.forEach((t=>{this._renameProperty(t,"id","indicatorId")})),t.participants.forEach((t=>{["GUARANTOR","COLLATERAL_GUARANTOR","CLIENT_AGENT","PROVIDER_AGENT","CONTRACTOR","LEGAL_REPRESENTATIVE","INSPECTOR"].includes(t.participantType.id)&&this._removeFields(["participantType"],t),t.order&&(t.participantType={...t.participantType,order:t.order},this._removeFields(["order"],t)),t.customDetails.firstName&&(t.firstName=t.customDetails.firstName),t.customDetails.lastName&&(t.lastName=t.customDetails.lastName),t.customDetails.secondLastName&&(t.secondLastName=t.customDetails.secondLastName);const e=["DNI","NIE","NIF","CIF","PASSPORT"];t.customDetails.identityDocuments&&t.customDetails.identityDocuments.forEach((i=>{e.includes(i.documentType.id)&&(t.identityDocument={documentNumber:i.documentNumber,documentType:i.documentType.id})})),this._removeFields(["customDetails"],t)})),t.conditions&&t.conditions.forEach((t=>{this._renameProperty(t,"id","conditionId"),this._removeFields(["isNegotiable","conditionType","formats"],t)})),t.relatedContracts&&t.relatedContracts.forEach((t=>{"INTERNAL_CONTRACT"===t.contractDetails.contractType&&(t.contractId=t.contractDetails.contractId),this._removeFields(["contractDetails"],t)})),t.deliveries&&(t.delivery=t.deliveries,this._removeFields(["deliveries"],t),t.delivery.forEach((t=>{if(this._renameProperty(t,"method","deliveryType"),"DIGITAL"===t.deliveryType?t.deliveryType="VIRTUAL":"STANDARD"===t.deliveryType?t.deliveryType="PHYSICAL":this._removeFields(["deliveryType"],t),"DIGITAL_CONTACT"===t.destination.id&&this._removeFields(["id"],t.destination),t.destination.bank&&(t.destination={...t.destination,branch:t.destination.bank.branch},this._removeFields(["bank"],t.destination)),t.contactDetails&&"STORED"===t.contactDetails.deliveryContactType){let e=[{contactDetail:{contactDetailId:t.contactDetails.id}}];t.contactDetails=e}else this._removeFields(["contactDetails"],t);t.address&&"STORED"===t.address.deliveryAddressType?this._renameProperty(t.address,"deliveryAddressType","addressType"):this._removeFields(["address"],t),this._removeFields(["deliverySchedules","serviceType","packagingType"],t)})))),t}_paginationMapping(t){return t}}s(fi,"GET_EVENTS",{customEvent:"accounts-api-dm-fetch",paginationEvent:"accounts-api-dm-pagination",errorFireEventHandler:"accounts-api-dm-fetch-error"}),s(fi,"POST_EVENTS",{customEvent:"accounts-api-dm-create",errorFireEventHandler:"accounts-api-dm-create-error"}),customElements.define(fi.is,fi);class Ci extends pi{static get is(){return"bbva-global-account-transactions-base-api-dm"}resetAccountTransactions(){this.accountTransactions=[]}getAccountTransactions(t,e){this._paramsMapping(e),e=Object.assign({"account-id":t},e),this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields)}_getService(t,e={},i={}){const s=this._getServiceParams(i,e);return this._getServicePath(`${t}AccountTransactions`,this._getBgadp(s))}_getBgadp(t){return{getAccountTransactionsV2:()=>new a(t),getAccountTransactionsV0:()=>new bi(t),default:()=>"BGADP does not exist."}}_paramsMappingCanonical(t){if("0"==this.version){this._removeFields(["customerId"],t),t["transactionType.id"]&&(t["transactionType.id"]=t["transactionType.id"].toString()),t["status.id"]&&(t["status.id"]=t["status.id"].toString());let e=Object.keys(t);for(let i=0;i<e.length;i++){let s=e[i];if("operationAmount.id"===s&&"LOCAL_AMOUNT"===t[s])for(let i=0;i<e.length;i++)"operationAmount.fromAmount"===e[i]?this._renameQueryParam(t,"operationAmount.fromAmount","fromLocalAmount.amount"):"operationAmount.toAmount"===e[i]?this._renameQueryParam(t,"operationAmount.toAmount","toLocalAmount.amount"):"operationAmount.currency"===e[i]&&this._renameQueryParam(t,"operationAmount.currency","localAmount.currency");this._removeFields(["operationAmount.id","operationAmount.fromAmount","operationAmount.toAmount","operationAmount.currency"],t)}}return t}_renameQueryParam(t,e,i){e in t&&(t[i]=t[e],delete t[e])}_paramsMapping(t){return this._paramsMappingCanonical(t),t}responseMappingCanonical(t){if("0"==this.version&&Object.keys(t).length)for(let e=0;e<t.length;e++){this._renameProperty(t[e],"valuationDate","valueDate"),this._renameProperty(t[e].contract.numberType,"name","description"),this._removeFields(["category","exchangeRate","fundsOrigin"],t[e]),this._removeFields(["product","bank"],t[e].contract),this._removeFields(["description"],t[e].transactionType),this._removeFields(["updateDate"],t[e].status);const i=t[e].classification;i&&(this._removeFields(["pfmId","customName"],i),this._removeFields(["customName"],i.category),this._removeFields(["customName"],i.category.subcategory));const s=t[0].additionalInformation;this._removeFields(["postedBalance","reportingBalance","authorizedBalance","hold"],s),s&&s.branch&&(t[e].branch={id:s.branch.id,name:s.branch.name},this._removeFields(["branch"],s)),s&&s.updatedBalance&&(s.balances=[{id:"UPDATED_BALANCE",amount:s.updatedBalance.amount,currency:s.updatedBalance.currency}],this._removeFields(["updatedBalance"],s)),t[e].localAmount&&(t[e].operationAmounts=[{id:"LOCAL_AMOUNT",amount:t[e].localAmount.amount,currency:t[e].localAmount.currency}],this._removeFields(["localAmount"],t[e]));const o=t[e].operationAmounts[0];t[e].originAmount&&(t[e].operationAmounts=[o,{id:"ORIGIN_AMOUNT",amount:t[e].originAmount.amount,currency:t[e].originAmount.currency}],this._removeFields(["originAmount"],t[e]))}return t}_responseMapping(t){return this.responseMappingCanonical(t),t}}s(Ci,"GET_EVENTS",{customEvent:"account-transactions-api-dm-fetch",paginationEvent:"account-transactions-api-dm-pagination",errorFireEventHandler:"account-transactions-api-dm-fetch-error"}),customElements.define(Ci.is,Ci);class Si extends pi{static get is(){return"bbva-global-account-participants-base-api-dm"}resetAccountParticipants(){this.accountParticipants=[]}getAccountParticipants(t,e={}){this._paramsMapping(e),e=Object.assign({"account-id":t},e),this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields)}postAccountParticipants(t,e){const i={"account-id":t};this._generateGetService(this._getService("post",e,i),this.constructor.POST_EVENTS),this.resetAccountParticipants()}_getService(t,e={},i={}){const s=this._getServiceParams(i,e);return this._getServicePath(`${t}AccountParticipants`,this._getBgadp(s))}_getBgadp(t){return{getAccountParticipantsV2:()=>new Pt(t),getAccountParticipantsV1:()=>new n(t),postAccountParticipantsV1:()=>new r(t),default:()=>"BGADP does not exist."}}_paramsMapping(t){return"1"==this.version&&(t={}),t}_responseMapping(t){return"1"==this.version&&t.length>0&&t.forEach((t=>{"NATURAL_KNOWN"==t.customDetails.personType?this._removeFields(["nonCustomerId","suffix","birthDate","identityDocuments","relationType","participationPercentage"],t.customDetails):"LEGAL_KNOWN"==t.customDetails.personType||this._removeFields(["customDetails"],t),this._removeFields(["description"],t.participantType)})),t}}s(Si,"GET_EVENTS",{customEvent:"account-participants-api-dm-fetch",errorFireEventHandler:"account-participants-api-dm-fetch-error"}),s(Si,"POST_EVENTS",{customEvent:"account-participants-api-dm-create",errorFireEventHandler:"account-participants-api-dm-create-error"}),customElements.define(Si.is,Si);const Ei={0:"notCategorizable",1:"cash",2:"saving",3:"taxes",4:"associations",6:"health",7:"shopping",8:"education",9:"bank",10:"home",11:"leisure",15:"transportation",16:"travel",17:"paycheck",18:"check",19:"otherIncome",20:"investment",21:"financing",999:"notCategorizable",9999:"toCategorize"},Ti={notCategorizable:["0","998","999"],cash:["42","44","46","51"],bizum:["78"],toCategorize:["9998","9999"],paycheck:["41","96","97"],check:["98","99"],otherIncome:["43","50","100","101","102"],saving:["4","10","103","104"],investment:["6","11","105","106","107","110"],financing:["7"],taxes:["1","2","3"],associations:["12","13","81"],health:["23","64","65","7","69"],shopping:["24","25","27","28","30","63","87","88","109"],education:["31","32","33","34","82"],bank:["14","16","18","19","21","35","59","61","62","70","77","108"],home:["36","37","38","39","40","68","76","83","84","85"],leisure:["52","53","54","55","56","86"],transportation:["67","72","73","74","75","92","93","94","95"],travel:["57","58","71","89","90","91"]};class Pi extends(c(Ci)){static get is(){return"bbva-account-transactions-es-api-dm"}static get properties(){return{_financingTypeId:{type:String}}}static get scopedElements(){const t=[d];return Pi.scopedElementsFromClasses(t)}render(){return o` ${this.accountTransactionsDM} `}constructor(){super(),this._financingTypeId=""}get accountTransactionsDM(){return o`
      <bbva-core-generic-dp
        id="accountTransactions"
        requiresToken
        cross-domain
        .host="${this.host}"
        .cacheKey="${this.cacheKey}"
        .cacheType="${this.cacheType}"
        .path="${this.path}"
        headers="${l(((t,e)=>{let i={};if(t.includes("ASO")){const t="x-dm-local-",e=window.sessionStorage;i=Object.keys(e).filter((e=>e.startsWith(t))).reduce(((i,s)=>(i[s.replace(t,"")]=e.getItem(s),i)),{})}return JSON.stringify({...e,...i})})(this.host,this.headers))}"
        method="${this.method}"
        @request-success="${this._handleLocalDMSuccess}"
        @request-error="${this._handleLocalDMError}"
      >
      </bbva-core-generic-dp>
    `}_handleLocalDMSuccess(t){const e=this._formatData(t.detail);this.dispatchEvent(new CustomEvent("account-transactions-api-dm-fetch",{bubbles:!0,composed:!0,detail:e})),this.dispatchEvent(new CustomEvent("api-dm-response",{bubbles:!0,composed:!0,detail:!0}))}_handleLocalDMError(t){this._handleError("account-transactions-api-dm-fetch-error",this.shadowRoot.getElementById("accountTransactions"))(t.detail)}_requestAccountTransactions(t,e){const i=this.shadowRoot.getElementById("accountTransactions"),s=e.moneyFlow?{INCOME:"IN",EXPENSE:"OUT"}[e.moneyFlow.id]:"BOTH";this._financingTypeId=null==e?void 0:e["financingType.id"],this._setGenericRequest({dm:i,path:"accountTransactions/V02/accountTransactionsAdvancedSearch",method:"post",params:e.pagination?`?paginationKey=${e.pagination}`:`?paginationKey=0&pageSize=${e.pageSize?e.pageSize:40}`,body:{accountContracts:[{contract:{id:t}}],customer:{id:this.localCustomProperties.customerId},filter:{dates:{from:e.filterDateFrom,to:e.filterDateTo},operationType:[s]},searchType:"SEARCH"}})}_filterFinancingData(t){const e={FINANCING_AVAILABLE:"SF"};return e[this._financingTypeId]?t.filter((t=>{var i;return(null==t||null===(i=t.financingData)||void 0===i?void 0:i.customizableIndicator)===e[this._financingTypeId]})):t}_formatingOperationAmounts(t){const e="ORIGIN_AMOUNT",i=null==t?void 0:t.amount;let s={};var o,a;i&&(s={id:"EUR"===(null===(o=i.currency)||void 0===o?void 0:o.code)?"CONTRACT_AMOUNT":e,amount:null==i?void 0:i.amount,currency:null==i||null===(a=i.currency)||void 0===a?void 0:a.id});let n={};if(null!=t&&t.wireTransactionDetail){const{wireTransactionDetail:i}=t;n={id:e,amount:i.payment.amount,currency:i.payment.currency.id}}const r=0===Object.keys(s).length,c=0===Object.keys(n).length;return r&&c?null:r?[n]:c?[s]:[s,n]}_formatData(t){const e=this._filterFinancingData(t.accountTransactions).map((t=>{var e,i;return{id:t.id,operationAmounts:this._formatingOperationAmounts(t),contract:{id:t.contract.id},moneyFlow:{id:(null==t||null===(e=t.amount)||void 0===e?void 0:e.amount)<0?"EXPENSE":"INCOME",name:(null==t||null===(i=t.amount)||void 0===i?void 0:i.amount)<0?"expense":"income"},classification:this._formatClassification(t),operationDate:t.transactionDate,valueDate:t.valueDate,concept:this._formatConcept(t.humanConceptName)}}));return t.pagination&&(t.pagination={links:{first:t.pagination.firstPage,...void 0!==t.pagination.lastPage&&{last:t.pagination.lastPage},...void 0!==t.pagination.previousPage&&{previous:t.pagination.previousPage},...void 0!==t.pagination.nextPage&&{next:t.pagination.nextPage}},page:t.pagination.page,totalPages:t.pagination.total,totalElements:t.totalResults,pageSize:t.pagination.pageSize}),this.dispatchEvent(new CustomEvent("account-transactions-api-dm-pagination",{bubbles:!0,composed:!0,detail:t.pagination})),e}_formatConcept(t){return t.charAt(0).toUpperCase()+t.slice(1).toLowerCase()}_formatClassification(t){var e,i;const s=null==t||null===(e=t.humanCategory)||void 0===e?void 0:e.id,o=null==t||null===(i=t.humanSubcategory)||void 0===i?void 0:i.id,a=Ei[s];var n;return{id:s,name:a,category:{id:s,name:a,subcategory:{id:o,name:(n=o,Object.keys(Ti).find((t=>Ti[t].includes(n))))}}}}async getAccountTransactions(t,e){this._requestAccountTransactions(t,e)}_setGenericRequest({dm:t,path:e,method:i,params:s,body:o}){return t.native=!1,t.requiresToken=!0,t.path=`${e}${s}`,t.method=i,t.body=o,t.generateRequest(!0)}}customElements.define(Pi.is,Pi);class Ri extends pi{static get is(){return"bbva-global-account-limits-base-api-dm"}resetAccountLimits(){this.accountLimits=[]}getAccountLimits(t,e){e=Object.assign({"account-id":t},e),this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields)}_getService(t,e={},i={}){const s=this._getServiceParams(i,e);return this._getServicePath(`${t}AccountLimits`,this._getBgadp(s))}_getBgadp(t){return{getAccountLimitsV0:()=>new yi(t),getAccountLimitsV2:()=>new Et(t),default:()=>"BGADP does not exist."}}_responseMapping(t){return this._responseMappingCanonical(t),t}_responseMappingCanonical(t){"0"==this.version&&Object.keys(t).length&&t.map((t=>{this._renameProperty(t,"limitId","id"),this._removeFields(["name"],t)}))}}s(Ri,"GET_EVENTS",{customEvent:"account-limits-api-dm-fetch",errorFireEventHandler:"account-limits-api-dm-fetch-error"}),customElements.define(Ri.is,Ri);class Ai extends pi{static get is(){return"bbva-global-accounts-opening-child-account-base-api-dm"}postAccountsOpeningChildAccount(t){this._generateGetService(this._getService("post",t),this.constructor.POST_EVENTS,this._responseMapping)}_getService(t,e={},i={}){const s=this._getServiceParams(i,e);return this._getServicePath(`${t}AccountsOpeningChildAccount`,this._getBgadp(s))}_getBgadp(t){return{postAccountsOpeningChildAccountV3:()=>new Rt(t),default:()=>"BGADP does not exist."}}_responseMapping(t){return t}}s(Ai,"POST_EVENTS",{customEvent:"accounts-opening-child-account-api-dm-create",errorFireEventHandler:"accounts-opening-child-account-api-dm-create-error"}),customElements.define(Ai.is,Ai);class Ii extends pi{static get is(){return"bbva-global-accounts-opening-child-account-api-dm"}static get properties(){return{country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.country="",this.localCustomProperties={},this._countries=["Mx"],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties"],this._loaded=!1,this._requestParams={},this._modules={Mx:()=>import("./88a18e76.js")}}update(t){super.update(t),t.forEach(((t,e)=>{"country"===e&&this.country&&this.country!==t?this._loadModule():"_module"!==e&&"_requestParams"!==e&&"_loaded"!==e&&this._module&&this[e]!==t?this._module[e]=this[e]:("_requestParams"===e&&this._requestParams&&this._requestParams!==t&&void 0!==t&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===e&&this._loaded)&&Object.entries(this._requestParams).forEach((([t])=>{this[`_${t}AccountsOpeningChildAccount`]()}))}))}async _loadModule(){const t=this._capitalize(this.country);if(this._countries.includes(t)&&this._modules[t]){const e=`BbvaAccountsOpeningChildAccount${t}ApiDm`;(0,this._modules[t])().then((async t=>{const i=t[e].is;this._module=this._createModuleElement(i),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-accounts-opening-child-account-api-dm-module-load")})).catch((async t=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-accounts-opening-child-account-api-dm-module-error",t)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(t){return t.charAt(0).toUpperCase()+t.slice(1).toLowerCase()}_createModuleElement(t=Ai.is){const e=document.createElement(t);return this._bindConfig(e),e}async _bindConfig(t){this._configProperties.forEach((e=>{t[e]=this[e]})),await this.updateComplete}_dispatchEvent(t,e=!0){this.dispatchEvent(new CustomEvent(t,{detail:e,bubbles:!0,composed:!0}))}async postAccountsOpeningChildAccount(t){await this.module.updateComplete,this._requestParams.post?this._requestParams.post.push({body:t}):this._requestParams={post:[{body:t}]}}async _postAccountsOpeningChildAccount(){await this.module.updateComplete,this._requestParams.post.forEach((t=>{this.module.postAccountsOpeningChildAccount(t.body)})),delete this._requestParams.post}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return o` ${this._module?this._module:""}`}}class Oi extends pi{static get is(){return"bbva-global-account-financial-statement-base-api-dm"}resetAccountFinancialStatement(){this.accountFinancialStatement={}}getAccountFinancialStatement(t,e,i){i=Object.assign({"account-id":t,"financial-statement-id":e},i),this._generateGetService(this._getService("get",{},i),this.constructor.GET_EVENTS,i.fields)}_getService(t,e={},i={}){const s=this._getServiceParams(i,e);return this._getServicePath(`${t}AccountFinancialStatement`,this._getBgadp(s))}_getBgadp(t){return{getAccountFinancialStatementV0:()=>new vi(t),default:()=>"BGADP does not exist."}}}s(Oi,"GET_EVENTS",{customEvent:"account-financial-statement-api-dm-fetch",errorFireEventHandler:"account-financial-statement-api-dm-fetch-error"}),customElements.define(Oi.is,Oi);class $i extends pi{static get is(){return"bbva-global-account-financial-statements-base-api-dm"}resetAccountFinancialStatements(){this.accountFinancialStatements=[]}getAccountFinancialStatements(t,e){e=Object.assign({"account-id":t},e),this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields,this._paginationMapping)}_getService(t,e={},i={}){const s=this._getServiceParams(i,e);return this._getServicePath(`${t}AccountFinancialStatements`,this._getBgadp(s))}_getBgadp(t){return{getAccountFinancialStatementsV0:()=>new _i(t),default:()=>"BGADP does not exist."}}_responseMapping(t){return t}_paginationMapping(t){return t}}s($i,"GET_EVENTS",{customEvent:"account-financial-statements-api-dm-fetch",paginationEvent:"account-financial-statements-api-dm-pagination",errorFireEventHandler:"account-financial-statements-api-dm-fetch-error"}),customElements.define($i.is,$i);class xi extends pi{static get is(){return"bbva-global-accounts-account-related-contracts-base-api-dm"}resetAccountRelatedContracts(){this.accountRelatedContracts=[]}getAccountRelatedContracts(t,e){e=Object.assign({"account-id":t},e),this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields)}_getService(t,e={},i={}){const s=this._getServiceParams(i,e);return this._getServicePath(`${t}AccountRelatedContracts`,this._getBgadp(s))}_getBgadp(t){return{getAccountRelatedContractsV2:()=>new Ct(t),default:()=>"BGADP does not exist."}}_responseMapping(t){return t}}s(xi,"GET_EVENTS",{customEvent:"account-related-contracts-api-dm-fetch",errorFireEventHandler:"account-related-contracts-api-dm-fetch-error"}),customElements.define(xi.is,xi);class ki extends(k(D(u(i)))){static get is(){return"oc-account-young-manager"}static get scopedElements(){const t=[se,st,ii,ni,ot,ei,li,Ii,ui,...ki.configurationScopedElements()];return ki.scopedElementsFromClasses(t)}static get properties(){return{accountsOpeningChildAccountVersion:{type:String,attribute:"accounts-opening-child-account-version"},catalogsVersion:{type:String,attribute:"catalogs-version"},customerAddressesVersion:{type:String,attribute:"customer-addresses-version"},customerId:{type:String,attribute:"customer-id"},civilRegistriesVersion:{type:String,attribute:"civil-registries-version"},customerContactDetailsVersion:{type:String,attribute:"customer-contact-details-version"},customerCreateChildCustomerVersion:{type:String,attribute:"customer-create-child-customer-version"},customerIdentificationProcessDocumentsVersion:{type:String,attribute:"customer-identification-process-documents-version"},country:{type:String},productLimitsVersion:{type:String,attribute:"product-limits-version"},placesVersion:{type:String,attribute:"places-version"},unmasked:{type:Boolean},headersCustomersIdentifications:{type:Object,attribute:"headers-customers-identifications"}}}constructor(){super(),this.placesVersion="",this.catalogsVersion="",this.customerAddressesVersion="",this.productLimitsVersion="",this.civilRegistriesVersion="",this.customerId="",this.customerContactDetailsVersion="",this.unmasked=!1,this.customerCreateChildCustomerVersion="",this.accountsOpeningChildAccountVersion="",this.country="",this.customerIdentificationProcessDocumentsVersion="",this.headersCustomersIdentifications={"Content-Type":"multipart/form-data"}}doRequestForCivilRegistries(t){this._bgadmCivilRegistries.postCivilRegistriesSearch(t)}doRequestForCatalogs(t){this._bgadmCatalogRecordsApiDm.getCatalogRecords(t)}doRequestForGetAddresses(){this._bgadmCustomerAddresses.getCustomerAddresses(this.customerId,{unmasked:this.unmasked})}doRequestForGetCodeZip(t){this._bgadmPlaces.getPlaces({zipCode:t})}doRequestForCustomerContactDetails(t){this._bgadmCustomerContactDetails.getCustomerContactDetails(t)}doRequestForCustomerChildCustomer(t){this._bgadmCustomerChildCustomer.postCustomersChildCustomers(t)}doRequestForAccountsOpeningChildAccount(t){this._bgadmAccountOpeningChildAccount.postAccountsOpeningChildAccount(t)}doRequestForProductLimits(t,e={}){this._bgadmProductsLimits.getProductLimits(t,e)}doRequestForCustomerIdentificationProcessDocuments(t,e){this._bgadmCustomerIdentificationProcessDocuments.multipart=e,this._bgadmCustomerIdentificationProcessDocuments.postCustomerIdentificationProcessDocuments(t)}_errorGetProductLimits({detail:t}){this._dispatchCustomEvent("account-origination-oc-account-young-error-from-product-limits-get",t)}_errorGetCatalogs({detail:t}){this._dispatchCustomEvent("account-origination-oc-account-young-error-from-catalogs-get",t)}_errorPostCivilRegistries({detail:t}){this._dispatchCustomEvent("account-origination-oc-account-young-error-from-civil-registries-post",t)}_errorGetPlaces({detail:t}){this._dispatchCustomEvent("account-origination-oc-account-young-error-from-places-get",t)}_errorCustomAddressApi({detail:t}){this._dispatchCustomEvent("account-origination-oc-account-young-error-from-customer-address-get",t)}_errorGetCustomerContactDetails({detail:t}){this._dispatchCustomEvent("account-origination-oc-account-young-error-from-customer-contact-details-get",t)}_errorPostCustomerChildCustomer({detail:t}){this._dispatchCustomEvent("account-origination-oc-account-young-error-from-customer-child-customer-post",t)}_errorPostAccountsOpeningChildAccount({detail:t}){this._dispatchCustomEvent("account-origination-oc-account-young-error-from-accounts-opening-child-account-post",t)}_errorPostCustomerIdentificationProcessDocuments({detail:t}){this._dispatchCustomEvent("account-origination-oc-account-young-error-from-customer-identification-process-documents-post",t)}static _capitalizeFirstLetter(t){return t.charAt(0).toUpperCase()+t.slice(1).toLowerCase()}static _parseStateInfo(t){return t.map((t=>{var e;const i=null==t||null===(e=t.descriptions[0])||void 0===e?void 0:e.value,s=ki._capitalizeFirstLetter(i.toLowerCase());return{id:null==t?void 0:t.id,value:s}}))}_onRequiredOtp(t){const{target:e}=t;this._dispatchCustomEvent("account-origination-oc-account-young-otp-even-sendt",{currentStep:`otp-${e.id}-modal`})}_parseCustomersAddresses(t){var e,i;const s=null===(e=t.find((t=>{var e;return"HOME"===(null==t||null===(e=t.addressType)||void 0===e?void 0:e.id)})))||void 0===e||null===(i=e.location)||void 0===i?void 0:i.addressComponents;let o="";var a,n,r,c,l,d,u,h,p;this.unmasked?o={unmasked:!0,address:`${null===(a=s[0])||void 0===a?void 0:a.name}, ${null===(n=s[1])||void 0===n?void 0:n.name}, ${null===(r=s[5])||void 0===r?void 0:r.code}, ${null===(c=s[2])||void 0===c?void 0:c.name},\n        ${null===(l=s[6])||void 0===l?void 0:l.name}, ${null===(d=s[3])||void 0===d?void 0:d.name}, ${null===(u=s[4])||void 0===u?void 0:u.name}`}:o={address:`•${null===(h=s[3])||void 0===h?void 0:h.code}, ${null===(p=s[4])||void 0===p?void 0:p.code}`};return o}_successGetProductLimits({detail:t}){this._dispatchCustomEvent("account-origination-oc-account-young-success-from-product-limits-get",t)}_successGetCatalogs({detail:t}){this._dispatchCustomEvent("account-origination-oc-account-young-success-from-catalogs-get",ki._parseStateInfo(t))}_successGetCustomersAddresses({detail:t}){this._dispatchCustomEvent("account-origination-oc-account-young-success-from-customers-addresses-get",this._parseCustomersAddresses(t))}_successGetPlaces({detail:t}){this._dispatchCustomEvent("account-origination-oc-account-young-success-from-places-get",t)}_successPostCivilRegistries({detail:t}){this._dispatchCustomEvent("account-origination-oc-account-young-success-from-civil-registries-post",t)}_successGetCustomerContactDetails({detail:t}){this._dispatchCustomEvent("account-origination-oc-account-young-success-from-customer-contact-details-get",t)}_successPostCustomerChildCustomer({detail:t}){this._dispatchCustomEvent("account-origination-oc-account-young-success-from-customer-child-customer-post",t)}_successPostAccountsOpeningChildAccount({detail:t}){this._dispatchCustomEvent("account-origination-oc-account-young-success-from-accounts-opening-child-account-post",t)}_successPostCustomerIdentificationProcessDocuments({detail:t}){this._dispatchCustomEvent("account-origination-oc-account-young-success-from-customer-identification-process-documents-post",t)}get _bgadmProductsLimits(){return this.shadowRoot.querySelector(`[data-tag-name="${se.is}"]`)}get _bgadmCivilRegistries(){return this.shadowRoot.querySelector(`[data-tag-name="${ni.is}"]`)}get _bgadmCatalogRecordsApiDm(){return this.shadowRoot.querySelector(`[data-tag-name="${st.is}"]`)}get _bgadmCustomerAddresses(){return this.shadowRoot.querySelector(`[data-tag-name="${ii.is}"]`)}get _bgadmCustomerContactDetails(){return this.shadowRoot.querySelector(`[data-tag-name="${ei.is}"]`)}get _bgadmPlaces(){return this.shadowRoot.querySelector(`[data-tag-name="${ot.is}"]`)}get _bgadmCustomerChildCustomer(){return this.shadowRoot.querySelector(`[data-tag-name="${li.is}"]`)}get _bgadmAccountOpeningChildAccount(){return this.shadowRoot.querySelector(`[data-tag-name="${Ii.is}"]`)}get _bgadmCustomerIdentificationProcessDocuments(){return this.shadowRoot.querySelector(`[data-tag-name="${ui.is}"]`)}render(){return o`
      <bbva-global-places-api-dm
        host="${this.host}"
        version="${this.placesVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @places-api-dm-fetch="${this._successGetPlaces}"
        @places-api-dm-fetch-error="${this._errorGetPlaces}"
        @api-dm-error="${this._errorGetPlaces}">
      </bbva-global-places-api-dm>
      <bbva-global-catalog-records-api-dm
        host="${this.host}"
        version="${this.catalogsVersion}"
        .requiredToken="${this.requiredToken}"
        ?native="${this.native}"
        @catalog-records-api-dm-fetch="${this._successGetCatalogs}"
        @catalog-records-api-dm-fetch-error="${this._errorGetCatalogs}"
        @api-dm-error="${this._errorGetCatalogs}">
      </bbva-global-catalog-records-api-dm>
      <bbva-global-customer-addresses-api-dm
        id="customer-addresses"
        host="${this.host}"
        version="${this.customerAddressesVersion}"
        ?native="${this.native}"
        requiredOTP
        .requiredToken="${this.requiredToken}"
        @signature-required-first-step-dm="${this._onRequiredOtp}"
        @customer-addresses-api-dm-fetch="${this._successGetCustomersAddresses}"
        @customer-addresses-api-dm-fetch-error="${this._errorCustomAddressApi}"
        @api-dm-error="${this._errorCustomAddressApi}">
      </bbva-global-customer-addresses-api-dm>
      <bbva-global-product-limits-api-dm
        host="${this.host}"
        version="${this.productLimitsVersion}"
        .requiredToken="${this.requiredToken}"
        ?native="${this.native}"
        @product-limits-api-dm-fetch="${this._successGetProductLimits}"
        @product-limits-api-dm-fetch-error="${this._errorGetProductLimits}"
        @api-dm-error="${this._errorGetProductLimits}">
      </bbva-global-product-limits-api-dm>
      <bbva-global-civil-registries-search-api-dm
        host="${this.host}"
        version="${this.civilRegistriesVersion}"
        .requiredToken="${this.requiredToken}"
        ?native="${this.native}"
        .country="${this.country}"
        @civil-registries-search-api-dm-fetch="${this._successPostCivilRegistries}"
        @civil-registries-search-api-dm-fetch-error="${this._errorPostCivilRegistries}"
        @api-dm-error="${this._errorPostCivilRegistries}">
      </bbva-global-civil-registries-search-api-dm>
      <bbva-global-customer-contact-details-api-dm
        host="${this.host}"
        version="${this.customerContactDetailsVersion}"
        .requiredToken="${this.requiredToken}"
        ?native="${this.native}"
        @customer-contact-details-api-dm-fetch="${this._successGetCustomerContactDetails}"
        @customer-contact-details-api-dm-fetch-error="${this._errorGetCustomerContactDetails}"
        @api-dm-error="${this._errorGetCustomerContactDetails}">
      </bbva-global-customer-contact-details-api-dm>
      <bbva-global-customers-child-customers-api-dm
        host="${this.host}"
        version="${this.customerCreateChildCustomerVersion}"
        requiredOTP
        requiredToken="${this.requiredToken}"
        ?native="${this.native}"
        .country="${this.country}"
        @customers-child-customers-api-dm-create="${this._successPostCustomerChildCustomer}"
        @customers-child-customers-api-dm-create-error="${this._errorPostCustomerChildCustomer}"
        @api-dm-error="${this._errorPostCustomerChildCustomer}">
      </bbva-global-customers-child-customers-api-dm>
      <bbva-global-accounts-opening-child-account-api-dm
        id="opening-child-account"
        host="${this.host}"
        version="${this.accountsOpeningChildAccountVersion}"
        requiredOTP
        .requiredToken="${this.requiredToken}"
        ?native="${this.native}"
        .country="${this.country}"
        @signature-required-first-step-dm="${this._onRequiredOtp}"
        @accounts-opening-child-account-api-dm-create="${this._successPostAccountsOpeningChildAccount}"
        @accounts-opening-child-account-api-dm-create-error="${this._errorPostAccountsOpeningChildAccount}"
        @api-dm-error="${this._errorPostAccountsOpeningChildAccount}">
      </bbva-global-accounts-opening-child-account-api-dm>
      <bbva-global-customer-identification-process-documents-api-dm
        host="${this.host}"
        version="${this.customerIdentificationProcessDocumentsVersion}"
        requiredOTP
        .requiredToken="${this.requiredToken}"
        ?native="${this.native}"
        .headers="${this.headersCustomersIdentifications}"
        @customer-identification-process-documents-api-dm-create="${this._successPostCustomerIdentificationProcessDocuments}"
        @customer-identification-process-documents-api-dm-create-error="${this._errorPostCustomerIdentificationProcessDocuments}"
        @api-dm-error="${this._errorPostCustomerIdentificationProcessDocuments}">
      </bbva-global-customer-identification-process-documents-api-dm>
    `}}var Di=h`
.form-input {
  margin: 0.5rem 0 1.5rem;
}

.registry-id-label {
  margin: 1rem 0 0.5rem;
}
`;class Ni extends(k(D(u(i)))){static get is(){return"additional-info-step"}static get scopedElements(){const t=[M,F,It];return Ni.scopedElementsFromClasses(t)}static get properties(){return{civilRegistries:{type:Array,attribute:"civil-registries"},maxLengthIdentificationKey:{type:Number,attribute:"max-length-identification-key"},resetValue:{type:Boolean,attribute:"reset-value"},requestBodyCivilRegistries:{type:Object,attribute:"request-body-civil-registries"},visible:{type:Boolean},modifyStep:{type:Boolean,attribute:"modify-step"},_isButtonEnabled:{type:Boolean,state:!0},_curp:{type:String,state:!0},_infoMessage:{type:String,state:!0},_errorMessage:{type:String,state:!0}}}constructor(){super(),this.civilRegistries=[],this.maxLengthIdentificationKey=0,this.resetValue=!1,this._isButtonEnabled=!1,this._curp="",this.requestBodyCivilRegistries={},this.visible=!1,this.modifyStep=!1,this._infoMessage="account-origination-oc-account-young-registry-id-info-length",this._errorMessage="account-origination-oc-account-young-registry-id-error-length",this.ambient="primary-alt"}static get styles(){return[Di,N.primary,At.primaryAlt,w.primary,p("additional-info-step-shared-styles")]}updated(t){(t.has("resetValue")&&this.resetValue||t.has("modifyStep")&&this.modifyStep)&&this._resetStep(),t.has("civilRegistries")&&1===this.civilRegistries.length&&this.visible&&this._fireCompleteEvent()}_fireCompleteEvent(){this._dispatchCustomEvent("account-origination-oc-account-young-multistep-step-complete"),this._dispatchCustomEvent("complete")}_postCivilRegistries(t){t.stopPropagation(),Object.assign(this.requestBodyCivilRegistries,{documentNumber:this._curp}),this._dispatchCustomEvent("account-origination-oc-account-young-additional-info-step-civil-registries-post",this.requestBodyCivilRegistries)}_resetStep(){this.resetValue=!1,this._curp="",this._isButtonEnabled=!1}_setValueAndValidateInput(t){var e,i;t.stopPropagation(),this._curp=null==t||null===(e=t.detail)||void 0===e||null===(i=e.value)||void 0===i?void 0:i.toUpperCase(),this._infoMessage="account-origination-oc-account-young-registry-id-info-length",this._errorMessage="",this._invalidRegistry=!1,this._isButtonEnabled=!1}_validateAdditionalInfo(t){t.stopPropagation();const e=this._curp.length,i=e!==this.maxLengthIdentificationKey;0===e?(this._infoMessage="account-origination-oc-account-young-registry-id-info-length",this._errorMessage="",this._invalidRegistry=!1):i&&(this._infoMessage="",this._errorMessage="account-origination-oc-account-young-registry-id-error-length",this._invalidRegistry=!0),this._isButtonEnabled=!i,this.requestUpdate()}get _tplAdditionalInfo(){return o`
      <bbva-type-text unset tag="p" size="S" text="account-origination-oc-account-young-additional-info-description"></bbva-type-text>
      <bbva-type-text class="registry-id-label" tag="p" unset font-weight="500" text="account-origination-oc-account-young-additional-info-text"></bbva-type-text>
      <bbva-form-input
        id="curpInput"
        class="form-input"
        type="text"
        allowed-pattern="^[a-zA-Z0-9]+$"
        error-message="${this.t(this._errorMessage,{max:this.maxLengthIdentificationKey})}"
        info-message="${this.t(this._infoMessage,{max:this.maxLengthIdentificationKey})}"
        maxlength="${this.maxLengthIdentificationKey}"
        ?invalid="${this._invalidRegistry}"
        ?reset-value="${this.resetValue||this.modifyStep}"
        label="${this.t("account-origination-oc-account-young-additional-info-curp")}"
        @form-input-value-change="${this._setValueAndValidateInput}"
        @form-field-input-blur="${this._validateAdditionalInfo}">
      </bbva-form-input>
    `}get _tplButton(){return o`
      <bbva-button-default
        id="button-additional-info"
        fullwidth
        ?disabled="${!this._isButtonEnabled}"
        @click="${this._postCivilRegistries}">
        ${this.t("account-origination-oc-account-young-continue-button")}
      </bbva-button-default>
    `}render(){return o`
      ${this._tplAdditionalInfo}
      ${this._tplButton}
    `}}var wi=h`
.radio-buttons {
  margin-left: -1rem;
}

.address {
  padding-left: 2.5rem;
}

.link-unmasked-address {
  padding: 0 0 1rem 2.5rem;
}

.input-address {
  padding: 0.5rem 0;
}

.radio-group-same-address {
  margin-top: 0.5rem;
}

[data-tag-name=bbva-button-default] {
  margin-top: 1rem;
}
`;class Mi extends(k(D(u(i)))){static get is(){return"address-step"}static get scopedElements(){const t=[F,kt,B,M,V,It,wt,Mt];return Mi.scopedElementsFromClasses(t)}static get properties(){return{addressHome:{type:Array,attribute:"address-home"},addressHomeUnmasked:{type:Array,attribute:"address-home-unmasked"},cpAddressResponse:{type:Array,attribute:"cp-address-response"},colonySelect:{type:Object,attribute:"colony-select"},countryName:{type:String,attribute:"country-name"},colonyNativeSelected:{type:Object,attribute:"colony-native-selected"},resetValue:{type:Boolean,attribute:"reset-value"},zipCodeInvalid:{type:Boolean,attribute:"zip-code-invalid"},_unmasked:{type:Boolean,state:!0},_addressChildFill:{type:Object,state:!0},_enableButton:{type:Boolean,state:!0},_switchFormAddress:{type:Boolean,state:!0},_checkedRadioButton:{type:Boolean,state:!0},_childAddress:{type:Boolean,state:!0},_activeError:{type:Boolean,state:!0},_selectByNative:{type:Object,state:!0},_optionsNative:{type:Array,state:!0},_optionNativeSelected:{type:Object,state:!0}}}static get styles(){return[wi,N.primary,xt.primaryAlt,At.primaryAlt,Dt.primaryAlt,Nt.primary,q.primary,w.primary,L.primary,p("address-step-shared-styles")]}constructor(){super(),this.addressHome=[],this.cpAddressResponse=[],this.addressHomeUnmasked=[],this.colonySelect={},this.resetValue=!1,this._unmasked=!1,this._addressChildFill={},this._enableButton=!1,this._switchFormAddress=!1,this._checkedRadioButton=!1,this._childAddress=!1,this.zipCodeInvalid=!1,this._activeError=!1,this._optionsNative=[],this._selectByNative={},this.colonyNativeSelected={id:"",value:"",selected:!1},this.countryName="",this.ambient="primary-alt"}updated(t){if(t.has("addressHomeUnmasked")&&0!==this.addressHomeUnmasked.length&&(this._unmasked=!0),t.has("resetValue")&&this.resetValue&&this._resetStep(),t.has("cpAddressResponse")&&this.cpAddressResponse.length>0&&this.native&&!this.iOSFixedHeader&&(this._selectByNative=this.shadowRoot.querySelector("#colonySelectAndroid")),t.has("colonyNativeSelected")&&Object.keys(this.colonyNativeSelected).length>0){var e;if(this.cpAddressResponse.find((t=>{var e;return(null==t?void 0:t.name)===(null===(e=this.colonyNativeSelected)||void 0===e?void 0:e.name)})))this._colonySelected({detail:{value:null===(e=this.colonyNativeSelected)||void 0===e?void 0:e.name}}),this._selectByNative.requestUpdate()}}_addressPrincipalFormat(){return this._unmasked?this.addressHomeUnmasked:this.addressHome}_callPluginNativeListModal(t){t.stopPropagation(),this._dispatchCustomEvent("account-origination-oc-account-young-colony-native-select","places")}_checkInput(t){var e,i,s;t.stopPropagation(),this._activeError="zipCode"===(null==t||null===(e=t.target)||void 0===e?void 0:e.id)&&5!==(null==t||null===(i=t.target)||void 0===i||null===(s=i.value)||void 0===s?void 0:s.length)}_clearInput(t){var e;t.stopPropagation(),"zipCode"===(null==t||null===(e=t.target)||void 0===e?void 0:e.id)&&(this._activeError=!1,delete this._addressChildFill.colony,delete this._addressChildFill.municipality,delete this._addressChildFill.state,delete this._addressChildFill.country,this._dispatchCustomEvent("account-origination-oc-account-young-inputs-zip-code-clear"))}_colonySelected(t){var e;null!=t&&t.target&&t.stopPropagation();const i=this.cpAddressResponse.find((e=>{var i;return(null==e?void 0:e.name)===(null==t||null===(i=t.detail)||void 0===i?void 0:i.value)}));this.colonySelect=i||{},Object.assign(this._addressChildFill,{colonyName:null===(e=this.colonySelect)||void 0===e?void 0:e.name})}_formInputsFill(t){var e,i;t.stopPropagation();const s=null==t||null===(e=t.target)||void 0===e?void 0:e.id,o=null==t||null===(i=t.detail)||void 0===i?void 0:i.value;o?this._addressChildFill[s]=o:delete this._addressChildFill[s],"zipCode"===s&&5===(null==o?void 0:o.length)?this._dispatchCustomEvent("account-origination-oc-account-young-zip-code-request",o):this._clearInput(t),this._validateButtonContinue()}_fireEventsOnClick(){this._addressChildFill={...this._addressChildFill,sameAddress:!this._switchFormAddress,colonySelect:this.colonySelect,addressFormat:this._addressPrincipalFormat()},this._dispatchCustomEvent("account-origination-oc-account-young-step-address-child-fill",this._addressChildFill),delete this._addressChildFill.sameAddress,delete this._addressChildFill.colonySelect,delete this._addressChildFill.addressFormat,this._dispatchCustomEvent("account-origination-oc-account-young-multistep-step-complete"),this._dispatchCustomEvent("complete")}_getParameters(){return this.zipCodeInvalid?["zipCode",this.t("account-origination-oc-account-young-address-label-zipcode"),"",!1,"[0-9]",this.t("account-origination-oc-account-young-address-label-invalid-zipcode"),!0]:["zipCode",this.t("account-origination-oc-account-young-address-label-zipcode"),"",!1,"[0-9]",this.t("account-origination-oc-account-young-address-error-message"),this._activeError]}_resetStep(){this.resetValue=!1,this._unmasked=!1,this._addressChildFill={},this._enableButton=!1,this._switchFormAddress=!1,this._checkedRadioButton=!1,this._childAddress=!1,this.colonyNativeSelected={id:"",value:"",selected:!1}}_selectSameAddress(){this._switchFormAddress=!1,this._addressChildFill={},this._enableButton=!0,this._checkedRadioButton=!0}_showUnmaskedAddress(t){t.stopPropagation(),0!==this.addressHomeUnmasked.length||this._unmasked?(this._unmasked=!this._unmasked,this._dispatchCustomEvent("account-origination-oc-account-young-address-mask")):this._dispatchCustomEvent("account-origination-oc-account-young-address-unmask",!0)}_selectChildOption(){this._switchFormAddress=!0,this._addressChildFill={},this._childAddress=!0,this._validateButtonContinue()}_validateButtonContinue(){var t;const{street:e,outsideNumber:i,zipCode:s}=this._addressChildFill;this._enableButton=(null===(t=Object.keys(this._addressChildFill))||void 0===t?void 0:t.length)>=7&&e&&i&&5===(null==s?void 0:s.length)&&!this.zipCodeInvalid}_renderInputForm(t,e,i="",s=!1,a="",n="",r=!1){return o`
      <bbva-form-input
        type="text"
        id="${t}"
        class="input-address"
        value="${i}"
        label="${e}"
        allowed-pattern="${a}"
        ?invalid="${r}"
        error-message="${n}"
        ?disabled="${s}"
        @form-input-value-change="${this._formInputsFill}"
        @form-field-input-clear="${this._clearInput}"
        @form-field-input-blur="${this._checkInput}"
      ></bbva-form-input>
    `}get _tplRadioButtonSameAddress(){return o`
      <div class="radio-group-same-address">
        <bbva-form-radio-button
          id="sameAddress"
          class="radio-buttons padding-top"
          name="choice"
          value=""
          ?checked="${this._checkedRadioButton}"
          label-medium
          info-message="${this.t("account-origination-oc-account-young-address-info-message-same-address")}"
          @change="${this._selectSameAddress}">
          ${this.t("account-origination-oc-account-young-address-title-same-address")}
        </bbva-form-radio-button>
        <bbva-type-text class="address" unset size="S" tag="p" text="${this._addressPrincipalFormat()}"></bbva-type-text>
        <bbva-type-link
          @click="${this._showUnmaskedAddress}"
          class="link-unmasked-address">
          ${this._unmasked?this.t("account-origination-oc-account-young-address-link-same-address-unmasked"):this.t("account-origination-oc-account-young-address-link-same-address")}
        </bbva-type-link>
      </div>
    `}get _tplRadioButtonChildAddress(){return o`
      <bbva-divider-default></bbva-divider-default>
      <bbva-form-radio-button
        id="childAddress"
        name="choice"
        value=""
        class= "radio-buttons"
        ?checked="${this._childAddress}"
        label-medium
        info-message="${this.t("account-origination-oc-account-young-address-info-message-other-address")}"
        accessibility-icon-info-notification="info message"
        @change="${this._selectChildOption}">
        ${this.t("account-origination-oc-account-young-address-title-other-address")}
      </bbva-form-radio-button>
  `}get _tplAddInfoAddressChild(){return o`
      ${this._renderInputForm("street",this.t("account-origination-oc-account-young-address-label-street"))}
      ${this._renderInputForm("outsideNumber",this.t("account-origination-oc-account-young-address-label-outdoor-number"))}
      ${this._renderInputForm("insideNumber",this.t("account-origination-oc-account-young-address-label-interior-number"))}
      ${this._renderInputForm(...this._getParameters())}
      ${this._tplColonies}
  `}get _tplColonies(){if(this.cpAddressResponse.length>0){var t,e,i,s;const{name:a,state:n,country:r,geographicPlaceTypes:c}=this.colonySelect;return this._addressChildFill={...this._addressChildFill,colony:a,municipality:null==c||null===(t=c.find((t=>null==t?void 0:t.value)))||void 0===t?void 0:t.value,state:null==n?void 0:n.name,country:(null==r?void 0:r.name)||this.countryName},this._validateButtonContinue(),Object.keys(this.colonySelect).length>0?o`
        ${this.native&&!this.iOSFixedHeader&&this.cpAddressResponse?this._tplSelectAndroid:this._tplSelectIos}
        ${this._renderInputForm("municipality",this.t("account-origination-oc-account-young-address-label-town"),null===(e=this._addressChildFill)||void 0===e?void 0:e.municipality,!0)}
        ${this._renderInputForm("state",this.t("account-origination-oc-account-young-address-label-state"),null===(i=this._addressChildFill)||void 0===i?void 0:i.state,!0)}
        ${this._renderInputForm("country",this.t("account-origination-oc-account-young-address-label-country"),this.t(null===(s=this._addressChildFill)||void 0===s?void 0:s.country),!0)}
      `:m}return m}get _tplSelectAndroid(){var t,e,i;return o` <div @click="${this._callPluginNativeListModal}">
        <bbva-form-select
          id="colonySelectAndroid"
          class="input-address"
          required
          readonly
          label="${this.t("account-origination-oc-account-young-address-label-colony")}">
          <bbva-form-option
            value="${null===(t=this.colonyNativeSelected)||void 0===t?void 0:t.value}"
            ?selected="${null===(e=this.colonyNativeSelected)||void 0===e?void 0:e.selected}">
            ${null===(i=this.colonyNativeSelected)||void 0===i?void 0:i.value}
          </bbva-form-option>
        </bbva-form-select>
      </div>
    `}get _tplSelectIos(){var t;return o`
      <bbva-form-select
        id="colonySelectIos"
        class="input-address"
        ?native-selector="${this.iOSFixedHeader}"
        label="${this.t("account-origination-oc-account-young-address-label-colony")}"
        @bbva-form-select-selected-item="${this._colonySelected}">
        ${null===(t=this.cpAddressResponse)||void 0===t?void 0:t.map((t=>o`
          <bbva-form-option
            value="${null==t?void 0:t.value}"
            ?selected="${null==t?void 0:t.selected}">
            ${null==t?void 0:t.value}
          </bbva-form-option>
        `))}
      </bbva-form-select>
    `}get _tplButtonAddress(){return o`
      <bbva-button-default
        id="button-address"
        fullwidth
        ?disabled="${!this._enableButton}"
        class="margin-top-button"
        @click="${this._fireEventsOnClick}">
        ${this.t("account-origination-oc-account-young-continue-button")}
      </bbva-button-default>
    `}render(){return o`
      <bbva-type-text unset tag="p" size="S" text="account-origination-oc-account-young-address-title"></bbva-type-text>
      ${this._tplRadioButtonSameAddress}
      ${this._tplRadioButtonChildAddress}
      ${this._switchFormAddress?this._tplAddInfoAddressChild:m}
      ${this._tplButtonAddress}
    `}}var Fi=h`
.radio-button {
  margin-left: -1rem;
}

.margin-step {
  margin-top: 1rem;
}

.notification-message {
  margin: 1.5rem 0;
}

.service-denied-link {
  padding: 1rem 0.5rem 0.5rem 0;
  font-size: 1.125rem;
}

[data-tag-name=bbva-header-category] {
  padding: 1rem 0 0.5rem;
  --_header-category-heading-color: var(--colorsSecondary600, ${g(_.secondary600)});
}

[data-tag-name=bbva-button-default] {
  margin-top: 1rem;
}

.data-correct-label {
  margin: 1rem 0 0.5rem;
}
`;class qi extends(k(D(u(i)))){static get is(){return"digital-service-step"}static get scopedElements(){const t=[F,j,kt,V,B,M,It,G];return qi.scopedElementsFromClasses(t)}static get properties(){return{addressChildInfo:{type:Object,attribute:"addess-child-info"},civilRegistries:{type:Array,attribute:"civil-registries"},cellsPhoneNumber:{type:String,attribute:"cells-phone-number"},componentTypes:{type:Object,attribute:"component-types"},modifyStep:{type:Boolean,attribute:"modify-step"},isCompleted:{type:Boolean,attribute:"is-completed"},nationality:{type:String},phoneCompanyId:{type:String,attribute:"phone-company-id"},resetValue:{type:Boolean,attribute:"reset-value"},_cellPhoneEqual:{type:Boolean,state:!0},_checkedRadio:{type:Boolean,state:!0},_checkedDigitalService:{type:Boolean,state:!0},_confirmEmailErrorMessage:{type:String,state:!0},_digitalServiceFlag:{type:Boolean,state:!0},_isEmailInvalid:{type:Boolean,state:!0},_isConfirmEmailInvalid:{type:Boolean,state:!0},_isButtonEnabled:{type:Boolean,state:!0},_emailErrorMessage:{type:String,state:!0},_theSameEmail:{type:Boolean,state:!0},_phoneChildErrorMessage:{type:String,state:!0},_hiringDigitalServiceInfo:{type:Object,state:!0}}}static get styles(){return[Fi,w.primary,xt.primaryAlt,L.primary,q.primaryAlt,N.primary,At.primaryAlt,H.primaryAlt,p("digital-service-step-shared-styles")]}constructor(){super(),this.addressChildInfo={},this.resetValue=!1,this._digitalServiceFlag=!1,this._cellPhoneEqual=!1,this._isEmailInvalid=!1,this._isConfirmEmailInvalid=!1,this._hiringDigitalServiceInfo={},this._theSameEmail="",this._emailErrorMessage="",this._confirmEmailErrorMessage="",this._phoneChildErrorMessage="account-origination-oc-account-young-digital-services-error-message-cell-phone-min",this.cellsPhoneNumber="",this.civilRegistries=[],this.phoneCompanyId="",this._checkedRadio=!1,this._checkedDigitalService=!1,this._isButtonEnabled=!1,this.modifyStep=!1,this.isCompleted=!1,this.ambient="primary-alt",this.nationality="",this.componentTypes={}}updated(t){super.updated(t),t.has("resetValue")&&this.resetValue&&this._resetStep(),t.has("modifyStep")&&this.modifyStep&&this._clearStep(),t.has("isCompleted")&&this.isCompleted&&this._onCompletedStep()}_clearStep(){this.modifyStep=!1}_onCompletedStep(){this._dispatchCustomEvent("account-origination-oc-account-young-multistep-step-complete")}_openDigitalServicesHelp(t){t.stopPropagation(),this._dispatchCustomEvent("account-origination-oc-account-young-digital-services-info-open")}_deniedDigitalServices({target:t}){this._checkedDigitalService=null==t?void 0:t.checked,this.checkedRadio=!1,this._digitalServiceFlag=!1,this._hiringDigitalServiceInfo.inputEmail="",this._isButtonEnabled=!0,this.changeStateDigitalServices=!1}_confirmEmailValidation(){(this._hiringDigitalServiceInfo.inputEmail?this._hiringDigitalServiceInfo.inputEmail:"")!==this._theSameEmail&&""!==this._theSameEmail?(this._confirmEmailErrorMessage=this.t("account-origination-oc-account-young-digital-services-error-message-confirm-email"),this._isConfirmEmailInvalid=!0):(this._confirmEmailErrorMessage="",this._isConfirmEmailInvalid=!1),this._enableButton()}_enableButton(){this._isButtonEnabled=""!==this._hiringDigitalServiceInfo.phoneChild&&""===this._phoneChildErrorMessage&&""!==this._hiringDigitalServiceInfo.inputEmail&&""===this._emailErrorMessage&&""!==this._theSameEmail&&""===this._confirmEmailErrorMessage}_resetStep(){this._digitalServiceFlag=!1,this.resetValue=!1,this._checkedRadio=!1,this._checkedDigitalService=!1,this._isButtonEnabled=!1,this._phoneChildErrorMessage="",this._emailErrorMessage="",this._hiringDigitalServiceInfo={},this._theSameEmail="",this._confirmEmailErrorMessage=""}_handleInput(t){var e,i;t.stopPropagation(),this._hiringDigitalServiceInfo[null==t||null===(e=t.target)||void 0===e?void 0:e.id]=null==t||null===(i=t.detail)||void 0===i?void 0:i.value,this._validateCellphone(),this._validateEmail(),this._confirmEmailValidation()}_fillTheSameEmail(t){var e;t.stopPropagation(),this._theSameEmail=null==t||null===(e=t.detail)||void 0===e?void 0:e.value,this._confirmEmailValidation()}_fireEventsOnClick(){var t,e,i,s,o,a,n,r,c,l,d,u,h,p,m,g,_,v,y,b,f,C;this._hiringDigitalServiceInfo.hiringDigitalService=this._digitalServiceFlag;const S={firstName:null===(t=this.civilRegistries)||void 0===t||null===(e=t[0])||void 0===e?void 0:e.name,lastName:null===(i=this.civilRegistries)||void 0===i||null===(s=i[0])||void 0===s?void 0:s.lastName,secondLastName:(null===(o=this.civilRegistries)||void 0===o||null===(a=o[0])||void 0===a?void 0:a.secondLastName)||"",gender:{id:null===(n=this.civilRegistries)||void 0===n||null===(r=n[0])||void 0===r||null===(c=r.gender)||void 0===c?void 0:c.id},birthData:{birthDate:null===(l=this.civilRegistries)||void 0===l||null===(d=l[0])||void 0===d?void 0:d.birthDate,state:{id:null===(u=this.civilRegistries)||void 0===u||null===(h=u[0])||void 0===h?void 0:h.birthPlace},country:{id:null===(p=this.civilRegistries)||void 0===p||null===(m=p[0])||void 0===m||null===(g=m.identityDocuments)||void 0===g||null===(_=g[0])||void 0===_||null===(v=_.country)||void 0===v?void 0:v.id}},identityDocuments:[{documentType:{id:"CURP"},documentNumber:null===(y=this.civilRegistries[0])||void 0===y?void 0:y.id}],nationalities:[{id:(null===(b=this.civilRegistries[0])||void 0===b?void 0:b.nationality)||this.nationality}],isActiveDigitalServices:this._digitalServiceFlag,isSameAddress:null===(f=this.addressChildInfo)||void 0===f?void 0:f.sameAddress};var E,T,P,R,A,I,O,$,x,k,D,N,w,M,F,q,L,B,V,H,j,G,U;this._digitalServiceFlag&&(S.contactDetails=[{contact:{contactDetailType:"MOBILE",number:null===(E=this._hiringDigitalServiceInfo)||void 0===E?void 0:E.phoneChild,phoneCompany:{id:this.phoneCompanyId}}},{contact:{contactDetailType:"EMAIL",address:null===(T=this._hiringDigitalServiceInfo)||void 0===T?void 0:T.inputEmail}}]);null!==(C=this.addressChildInfo)&&void 0!==C&&C.sameAddress||(S.addresses=[{location:{addressComponents:[{name:(null===(P=this.addressChildInfo)||void 0===P?void 0:P.insideNumber)||"",componentTypes:[null===(R=this.componentTypes)||void 0===R?void 0:R.interiorNumber]},{name:null===(A=this.addressChildInfo)||void 0===A?void 0:A.outsideNumber,componentTypes:[null===(I=this.componentTypes)||void 0===I?void 0:I.exteriorNumber]},{name:null===(O=this.addressChildInfo)||void 0===O?void 0:O.street,componentTypes:[null===($=this.componentTypes)||void 0===$?void 0:$.street]},{name:(null===(x=this.addressChildInfo)||void 0===x?void 0:x.colonyName)||(null===(k=this.addressChildInfo)||void 0===k?void 0:k.colony),componentTypes:[null===(D=this.componentTypes)||void 0===D?void 0:D.colony]},{name:null===(N=this.addressChildInfo)||void 0===N?void 0:N.municipality,componentTypes:[null===(w=this.componentTypes)||void 0===w?void 0:w.municipality]},{code:null===(M=this.addressChildInfo)||void 0===M||null===(F=M.colonySelect)||void 0===F||null===(q=F.state)||void 0===q?void 0:q.id,componentTypes:[null===(L=this.componentTypes)||void 0===L?void 0:L.state]},{code:null===(B=this.civilRegistries[0])||void 0===B||null===(V=B.identityDocuments[0])||void 0===V||null===(H=V.country)||void 0===H?void 0:H.id,componentTypes:[null===(j=this.componentTypes)||void 0===j?void 0:j.country]},{name:null===(G=this.addressChildInfo)||void 0===G?void 0:G.zipCode,componentTypes:[null===(U=this.componentTypes)||void 0===U?void 0:U.zipCode]}]}}]);this._dispatchCustomEvent("account-origination-oc-account-young-post-customer-child-create",S),this._dispatchCustomEvent("account-origination-oc-account-young-data-of-digital-services-send",this._hiringDigitalServiceInfo)}_hiringDigitalServices({target:t}){this._checkedRadio=null==t?void 0:t.checked,this._checkedDigitalService=!1,this._digitalServiceFlag=!0,this._isButtonEnabled=!(null!=t&&t.checked)}_validateEmail(){var t,e;const i=null!==(t=this._hiringDigitalServiceInfo)&&void 0!==t&&t.inputEmail?null===(e=this._hiringDigitalServiceInfo)||void 0===e?void 0:e.inputEmail:"";""===i||/^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]+$/.test(i)?(this._emailErrorMessage="",this._isEmailInvalid=!1):(this._emailErrorMessage=this.t("account-origination-oc-account-young-digital-services-error-message-email"),this._isEmailInvalid=!0),this._enableButton()}_validateCellphone(){var t,e;const i=null!==(t=this._hiringDigitalServiceInfo)&&void 0!==t&&t.phoneChild?null===(e=this._hiringDigitalServiceInfo)||void 0===e?void 0:e.phoneChild:"";let s="",o=!1;10===i.length?i===this.cellsPhoneNumber&&(s=this.t("account-origination-oc-account-young-digital-services-error-message-cell-phone-equal"),o=!0):""!==i&&(s=this.t("account-origination-oc-account-young-digital-services-error-message-cell-phone-min"),o=!0),this._phoneChildErrorMessage=s,this._cellPhoneEqual=o,this._enableButton()}_clickLinkPdfCud(){this._dispatchCustomEvent("account-origination-oc-account-young-pdf-cud-open")}get _tplRBHiringDigitalServiceAcept(){return o`
      <bbva-header-category
        has-help
        text="${this.t("account-origination-oc-account-young-digital-services-text-with-services")}"
        link-accessibility-text="${this.t("account-origination-oc-account-young-digital-services-link-accessibility-text")}"
        @header-category-help-click="${this._openDigitalServicesHelp}">
      </bbva-header-category>
      <bbva-form-radio-button
        id="accept-digital-services"
        class="radio-button"
        value=""
        ?checked="${this._checkedRadio}"
        info-message="${this.t("account-origination-oc-account-young-digital-services-info-message-with-services")}"
        @change="${this._hiringDigitalServices}"
        name="choice">
        ${this.t("account-origination-oc-account-young-digital-services-label-with-services")}
      </bbva-form-radio-button>
    `}get _tplFormDigitalService(){var t;return this._digitalServiceFlag?o`
      <bbva-form-input
        id="phoneChild"
        class="margin-step"
        type="text"
        maxlength="10"
        allowed-pattern="[0-9]"
        error-message="${this._phoneChildErrorMessage}"
        ?invalid="${this._cellPhoneEqual}"
        ?reset-value="${this.modifyStep}"
        label="${this.t("account-origination-oc-account-young-digital-services-label-phone")}"
        @form-input-value-change="${this._handleInput}"
        info-message="${this.t("account-origination-oc-account-young-digital-services-info-message-phone")}">
      </bbva-form-input>
      <bbva-form-input
        id="inputEmail"
        class="margin-step"
        type="text"
        ?invalid="${this._isEmailInvalid}"
        ?reset-value="${this.modifyStep}"
        error-message="${this._emailErrorMessage}"
        @form-input-value-change="${this._handleInput}"
        label="${this.t("account-origination-oc-account-young-digital-services-label-email")}"
        info-message="${this.t("account-origination-oc-account-young-digital-services-info-message-email")}">
      </bbva-form-input>
      <bbva-form-input
        id="input-confirm-email"
        class="margin-step"
        type="text"
        error-message="${this._confirmEmailErrorMessage}"
        ?invalid="${this._isConfirmEmailInvalid}"
        ?reset-value="${this.modifyStep}"
        @form-input-value-change="${this._fillTheSameEmail}"
        label="${this.t("account-origination-oc-account-young-digital-services-label-confirm-email")}"
        ?disabled="${!(""===this._emailErrorMessage&&null!==(t=this._hiringDigitalServiceInfo)&&void 0!==t&&t.inputEmail)}">
      </bbva-form-input>
      <bbva-notification-message
        message-title="${this.t("account-origination-oc-account-young-digital-services-message-title")}"
        message="${this.t("account-origination-oc-account-young-digital-services-message-text")}"
        class="notification-message margin-step">
      </bbva-notification-message>
    `:m}get _tplRBHiringDigitalServiceDenied(){return o`
      <bbva-divider-default class="margin-step"></bbva-divider-default>
      <bbva-form-radio-button
        id="denied-digital-services"
        class="radio-button"
        value=""
        name="choice"
        ?checked="${this._checkedDigitalService}"
        info-message="${this.t("account-origination-oc-account-young-digital-services-info-message-without-services")}"
        @change="${this._deniedDigitalServices}">
        ${this.t("account-origination-oc-account-young-digital-services-label-without-services")}
      </bbva-form-radio-button>
      <bbva-type-link
        class="service-denied-link"
        icon="${v()}"
        icon-size="24"
        @click="${this._clickLinkPdfCud}">
        ${this.t("account-origination-oc-account-young-terms-conditions-link-cud")}
      </bbva-type-link>
    `}get _tplSelectWithoutServices(){return this._digitalServiceFlag?o`
      <bbva-type-text
        class="data-correct-label"
        tag="p"
        unset
        size="S"
        text="account-origination-oc-account-young-digital-services-text-without-services">
      </bbva-type-text>
    `:m}get _tplButton(){return o`
      <bbva-button-default
        id="button-services"
        fullwidth
        ?disabled="${!this._isButtonEnabled}"
        @click="${this._fireEventsOnClick}">
        ${this.t("account-origination-oc-account-young-continue-button")}
      </bbva-button-default>
    `}render(){return o`
      <bbva-type-text tag="p" unset size="S" text="account-origination-oc-account-young-digital-services-title"></bbva-type-text>
      ${this._tplRBHiringDigitalServiceAcept}
      ${this._tplFormDigitalService}
      ${this._tplRBHiringDigitalServiceDenied}
      ${this._tplSelectWithoutServices}
      ${this._tplButton}
    `}}var Li=h`
.link-pdf {
  padding: 1rem 0;
  font-size: 1.125rem;
}

.check-button {
  margin-left: -1rem;
}

.terms-and-conditions-notification {
  margin: 1rem 0;
}

.button-terms {
  margin-top: 0.5rem;
}
`;class Bi extends(k(D(u(i)))){static get is(){return"terms-conditions-step"}static get scopedElements(){const t=[F,B,V,G,ut,M];return Bi.scopedElementsFromClasses(t)}static get properties(){return{cellsPhoneNumber:{type:String,attribute:"cells-phone-number"},customerIdChild:{type:String,attribute:"customer-id-child"},contractTemplates:{type:Object,attribute:"contract-templates"},contractingConsents:{type:Object,attribute:"contracting-consents"},cellsPhoneNumberChild:{type:String,attribute:"cells-phone-number-child"},digitalServiceFlag:{type:Boolean,attribute:"digital-service-flag"},resetValue:{type:Boolean,attribute:"reset-value"},userEmail:{type:String,attribute:"user-email"},userEmailChild:{type:String,attribute:"user-email-child"},paramsCreateAccount:{type:Object,attribute:"params-create-account"},_checksState:{type:Object,state:!0},_isButtonEnabled:{type:Boolean,state:!0}}}static get styles(){return[Li,w.primary,q.primary,L.primary,dt.primaryAlt,N.primary,p("terms-conditions-step-shared-styles")]}constructor(){super(),this.cellsPhoneNumber="",this.userEmail="",this.cellsPhoneNumberChild="",this.digitalServiceFlag=!1,this._checksState={linkCard:!1,cud:!1,operations:!1},this._isButtonEnabled=!1,this.customerIdChild="",this.paramsCreateAccount={},this.contractTemplates={},this.contractingConsents={},this.userEmailChild="",this.ambient="primary-alt"}updated(t){super.updated(t),t.has("resetValue")&&this.resetValue&&this._resetStep()}_enableButton(t){var e,i,s;(t.stopPropagation(),this._checksState[null==t||null===(e=t.detail)||void 0===e?void 0:e.name]=null==t||null===(i=t.detail)||void 0===i?void 0:i.checked,this.digitalServiceFlag)?this._isButtonEnabled=Bi._validChecks(this._checksState):this._isButtonEnabled=null===(s=this._checksState)||void 0===s?void 0:s.linkCard}_resetStep(){this.digitalServiceFlag=!1,this._checksState={linkCard:!1,cud:!1,operations:!1},this._isButtonEnabled=!1}_fireEventsOnClick(t){var e,i,s,o,a,n,r,c,l,d,u;t.stopPropagation();const h={customerId:this.customerIdChild,openingKey:null===(e=this.paramsCreateAccount)||void 0===e?void 0:e.openingKey,jointSignatureType:{id:null===(i=this.paramsCreateAccount)||void 0===i?void 0:i.jointSignatureTypeId},product:{id:null===(s=this.paramsCreateAccount)||void 0===s?void 0:s.productId,subproduct:{id:null===(o=this.paramsCreateAccount)||void 0===o?void 0:o.subproductId}},participants:[{mobileNumber:this.digitalServiceFlag?this.cellsPhoneNumberChild:this.cellsPhoneNumber}],fiscalAccountScheme:{id:null===(a=this.paramsCreateAccount)||void 0===a?void 0:a.fiscalAccountSchemeId},currencies:[{currency:null===(n=this.paramsCreateAccount)||void 0===n?void 0:n.currency}],meta:{accountLevel:null===(r=this.paramsCreateAccount)||void 0===r?void 0:r.accountLevel},termsAndConditions:{isAccepted:null===(c=this._checksState)||void 0===c?void 0:c.linkCard,alerts:this.digitalServiceFlag},contractingConsents:[{id:null===(l=this.contractingConsents)||void 0===l?void 0:l.bdy1},{id:null===(d=this.contractingConsents)||void 0===d?void 0:d.bdy2}],contractTemplates:[{id:null===(u=this.contractTemplates)||void 0===u?void 0:u.linkCard}]};var p,m,g;this.digitalServiceFlag&&(h.contractingConsents.push({id:null===(p=this.contractingConsents)||void 0===p?void 0:p.bdy3},{id:null===(m=this.contractingConsents)||void 0===m?void 0:m.bdy4}),h.contractTemplates.push({id:null===(g=this.contractTemplates)||void 0===g?void 0:g.cud}));this._dispatchCustomEvent("account-origination-oc-account-young-body-to-create-account-send",h),this._dispatchCustomEvent("account-origination-oc-account-young-multistep-step-complete"),this._dispatchCustomEvent("complete")}static _validChecks(t){let e=!1;return null!=t&&t.linkCard&&null!=t&&t.cud&&null!=t&&t.operations&&(e=!0),e}get _showEmailsMessage(){let t;if(this.digitalServiceFlag){var e,i;t=`•${null===(e=(this.userEmailChild?this.userEmailChild.match(/[a-zA-Z0-9._%+-]{4}@[a-zA-Z0-9]+.[a-zA-Z0-9]+/):"")[0])||void 0===e?void 0:e.toLowerCase()} <br> •${null===(i=this.userEmail.replace(/\*/g,""))||void 0===i?void 0:i.toLowerCase()}`}else{var s;t=`•${null===(s=this.userEmail)||void 0===s?void 0:s.toLowerCase().replace(/\*/g,"")}`}return t}_renderFormCheckBox(t,e,i){return o`
      <bbva-form-checkbox
        id="${t}"
        class="check-button"
        label="${e}"
        name="${t}"
        required
        ?checked="${i}"
        @bbva-form-checkbox-input="${this._enableButton}"
      ></bbva-form-checkbox>
    `}_clickLinkPdf(t){t.stopPropagation(),this._dispatchCustomEvent("account-origination-oc-account-young-pdf-link-card-open")}_clickLinkPdfCud(t){t.stopPropagation(),this._dispatchCustomEvent("account-origination-oc-account-young-pdf-cud-open")}get _tplPdf(){return o`
      <bbva-type-link
        class="link-pdf link-card-pdf"
        icon="${v()}"
        icon-size="24"
        @click="${this._clickLinkPdf}">
        <span>${this.t("account-origination-oc-account-young-terms-conditions-link-link-card")}</span>
      </bbva-type-link>
      ${this.digitalServiceFlag?o`
      <bbva-divider-default></bbva-divider-default>
      <bbva-type-link
        class="link-pdf cud-pdf"
        icon="${v()}"
        icon-size="24"
        @click="${this._clickLinkPdfCud}">
        <span>${this.t("account-origination-oc-account-young-terms-conditions-link-cud")}</span>
      </bbva-type-link>
    `:m}`}get _tplChecks(){var t,e,i;return o`
      ${this._renderFormCheckBox("linkCard",this.t("account-origination-oc-account-young-terms-conditions-label-link-card"),null===(t=this._checksState)||void 0===t?void 0:t.linkCard)}
      ${this.digitalServiceFlag?o`
      <bbva-divider-default></bbva-divider-default>
      ${this._renderFormCheckBox("cud",this.t("account-origination-oc-account-young-terms-conditions-label-cud"),null===(e=this._checksState)||void 0===e?void 0:e.cud)}
      <bbva-divider-default></bbva-divider-default>
      ${this._renderFormCheckBox("operations",this.t("account-origination-oc-account-young-terms-conditions-label-operations"),null===(i=this._checksState)||void 0===i?void 0:i.operations)}`:m}`}get _tplButton(){return o`
      <div class="margin-step">
        <bbva-button-default
          id="button-terms"
          class="button-terms"
          ?disabled="${!this._isButtonEnabled}"
          fullwidth=""
          @click="${this._fireEventsOnClick}">
          ${this.t("account-origination-oc-account-young-continue-button")}
        </bbva-button-default>
      </div>
    `}get _tplMessage(){return o`
      <bbva-notification-message
        message-title="${this.t("account-origination-oc-account-young-terms-conditions-message-title")}"
        message="&lt;span class='highlight'&gt;${this._showEmailsMessage}&lt;/span&gt;"
        book-title=""
        class="terms-and-conditions-notification">
      </bbva-notification-message>
    `}render(){return o`
      <bbva-type-text tag="p" unset size="S" class="margin-step" text="account-origination-oc-account-young-terms-conditions-subtitle"></bbva-type-text>
      ${this._tplPdf}
      ${this._tplChecks}
      ${this._tplMessage}
      ${this._tplButton}
    `}}var Vi=h`
.input-minor-form {
  padding: 0.5rem 0;
}

.check-group {
  margin-left: -1rem;
}

.link-padding {
  padding: 1rem 0;
}

.privacy-regristry-text {
  padding: 0.5rem 0 1.5rem;
}

.minor-info-description {
  margin-bottom: 1rem;
}
`;const{moment:Hi}=window;class ji extends(k(D(u(i)))){static get is(){return"minor-info-step"}static get scopedElements(){const t=[M,B,F,It,Ot,Mt,kt,ut,V,wt,Ft,...ji.configurationScopedElements()];return ji.scopedElementsFromClasses(t)}static get properties(){return{activeSteps:{type:Array,attribute:"active-steps"},birthplaces:{type:Array},birthplaceNativeSelected:{type:Object,attribute:"birthplace-native-selected"},civilRegistries:{type:Array,attribute:"civil-registries"},homonomyId:{type:String,attribute:"homonomy-id"},maxAge:{type:Object,attribute:"max-age"},resetValue:{type:Boolean,attribute:"reset-value"},selectedDate:{type:String,attribute:"selected-date"},visible:{type:Boolean},_isButtonEnabled:{type:Boolean,state:!0},_isInvalidAge:{type:Boolean,state:!0},_checkboxPrivacy:{type:Boolean,state:!0},_minorInfoBody:{type:Object,state:!0},_index:{type:Number,state:!0},_selectByNative:{type:Object,state:!0}}}constructor(){super(),this.birthplaces=[],this.civilRegistries=[],this.activeSteps=[],this.maxAge={},this.resetValue=!1,this.selectedDate="",this.visible=!1,this._isButtonEnabled=!1,this._isInvalidAge=!1,this._checkboxPrivacy=!1,this._selectByNative={},this._minorInfoBody={name:"",lastName:"",secondLastName:"",birthdate:"",birthplace:"",gender:""},this.birthplaceNativeSelected={id:"",value:"",selected:!1},this._index=-1,this.homonomyId="",this.ambient="primary-alt"}static get styles(){return[Vi,w.primary,q.primary,L.primary,N.primary,dt.primaryAlt,At.primaryAlt,$t.primaryAlt,Nt.primaryAlt,qt.primary,xt.primaryAlt,Dt.primaryAlt,p("minor-info-step-shared-styles")]}updated(t){if(super.updated(t),t.has("civilRegistries")&&this.civilRegistries.length>0&&this.visible&&this._validateCurp(this.civilRegistries),t.has("resetValue")&&this.resetValue&&this._resetStep(),t.has("birthplaces")&&this.birthplaces.length>0&&this.native&&!this.iOSFixedHeader&&(this._selectByNative=this.shadowRoot.querySelector("#birthPlaceSelect")),t.has("selectedDate")&&""!==this.selectedDate&&this._setValueAndValidateAge({detail:{value:this.selectedDate}}),t.has("birthplaceNativeSelected")&&Object.keys(this.birthplaceNativeSelected).length>0){var e;if(this.birthplaces.find((t=>{var e;return(null==t?void 0:t.id)===(null===(e=this.birthplaceNativeSelected)||void 0===e?void 0:e.id)})))this._setBirthplaceValue({detail:{value:null===(e=this.birthplaceNativeSelected)||void 0===e?void 0:e.id}}),this._selectByNative.requestUpdate()}}static _buildBodyMinorInfo(t){var e,i;return{name:null==t?void 0:t.name,lastName:null==t?void 0:t.lastName,secondLastName:null==t?void 0:t.secondLastName,birthDate:null==t?void 0:t.birthdate,birthPlace:null==t||null===(e=t.birthplace)||void 0===e?void 0:e.id,gender:{id:null==t||null===(i=t.gender)||void 0===i?void 0:i.value}}}_callPluginNativeDatePicker(t){t.stopPropagation(),this._dispatchCustomEvent("account-origination-oc-account-young-datepicker-native-open",this.selectedDate)}_callPluginNativeListModal(t){t.stopPropagation(),this.native&&!this.iOSFixedHeader&&this._dispatchCustomEvent("account-origination-oc-account-young-selector-native-open","birthplaces")}_eventOpenNoticePrivacy(t){t.stopPropagation(),this._dispatchCustomEvent("account-origination-oc-account-young-notice-privacy-open","NOTICE_PRIVACY")}_fireCompleteEventCardMinor(){var t,e,i,s,o;const a={...this._minorInfoBody};a.birthdate=Hi(null===(t=this._minorInfoBody)||void 0===t?void 0:t.birthdate).format("DD/MM/YYYY"),a.birthplace=null===(e=this._minorInfoBody)||void 0===e||null===(i=e.birthplace)||void 0===i?void 0:i.value,a.gender=this._parseGender(null===(s=this._minorInfoBody)||void 0===s||null===(o=s.gender)||void 0===o?void 0:o.id),this._dispatchCustomEvent("account-origination-oc-account-young-minor-info-step-complete",a),this._dispatchCustomEvent("account-origination-oc-account-young-multistep-step-complete"),this._dispatchCustomEvent("complete")}_postCivilRegistries(t){t.stopPropagation();const e=ji._buildBodyMinorInfo(this._minorInfoBody);this._dispatchCustomEvent("account-origination-oc-account-young-minor-info-step-civil-registries-post",e)}_parseGender(t){return 0===t?`${this.t("account-origination-oc-account-young-minor-info-female")}`:`${this.t("account-origination-oc-account-young-minor-info-male")}`}_resetStep(){this._checkboxPrivacy=!1,this.resetValue=!1,this._index=-1,this.civilRegistries=[],this.selectedDate="",this.birthplaceNativeSelected={id:"",value:"",selected:!1}}static _removeAccents(t){return t.normalize("NFD").replace(/n\u0303/g,"ñ").replace(/[\u0300-\u036f]/g,"")}_setBirthplaceValue(t){null!=t&&t.target&&t.stopPropagation();const e=this.birthplaces.find((e=>{var i;return(null==e?void 0:e.id)===(null==t||null===(i=t.detail)||void 0===i?void 0:i.value)}));this._minorInfoBody.birthplace=e,this._validateAllInputsFilled()}_setCheckboxPrivacy(t){var e;t.stopPropagation(),this._checkboxPrivacy=null==t||null===(e=t.detail)||void 0===e?void 0:e.checked,this._validateAllInputsFilled()}_setGenderValue(t){t.stopPropagation();const{detail:e}=t;this._index=null==e?void 0:e.selected;const i={id:null==e?void 0:e.selected,value:null==e?void 0:e.value};this._minorInfoBody.gender=i,this._validateAllInputsFilled()}_setValueAndValidateInput(t){var e,i;t.stopPropagation();const{target:s,detail:o}=t,a=null==s||null===(e=s.id)||void 0===e?void 0:e.replace("Input",""),n=ji._removeAccents(null==o||null===(i=o.value)||void 0===i?void 0:i.trim());this._minorInfoBody[a]=n,this._validateAllInputsFilled()}_setValueAndValidateAge(t){var e,i;null!=t&&t.target&&t.stopPropagation();const s=Hi(null==t||null===(e=t.detail)||void 0===e?void 0:e.value).format("YYYY-MM-DD"),o=Hi().subtract(this.maxAge).format("YYYY-MM-DD");this._isInvalidAge=s<o,this._minorInfoBody.birthdate=null==t||null===(i=t.detail)||void 0===i?void 0:i.value}_validateAllInputsFilled(){const t=this._minorInfoBody,e=Object.values(t).every((t=>""!==t));this._isButtonEnabled=e&&!this._isInvalidAge&&this._checkboxPrivacy}_validateCurp(t){var e,i,s,o;(null==t||null===(e=t[0])||void 0===e||null===(i=e.identityDocuments)||void 0===i||null===(s=i[0])||void 0===s||null===(o=s.status)||void 0===o?void 0:o.description)===this.homonomyId&&this._dispatchCustomEvent("account-origination-oc-account-young-additional-info-step-show"),this._fireCompleteEventCardMinor()}get _tplBirthplacesFormSelect(){return o` <div @click="${this._callPluginNativeListModal}">
        <bbva-form-select
          id="birthPlaceSelect"
          required
          ?readonly="${this.native&&!this.iOSFixedHeader&&this.birthplaces}"
          ?native-selector="${this.iOSFixedHeader}"
          class="input-minor-form"
          .selectedIndex="${this.resetValue?-1:""}"
          label="${this.t("account-origination-oc-account-young-minor-info-birthplace")}"
          @bbva-form-select-selected-item="${this._setBirthplaceValue}">
          ${this.native&&!this.iOSFixedHeader?o`
            <bbva-form-option
              class="form-select"
              value="${this.birthplaceNativeSelected.id}"
              ?selected="${this.birthplaceNativeSelected.selected}">
              ${this.birthplaceNativeSelected.value}
            </bbva-form-option>`:this.birthplaces.map((t=>o`
              <bbva-form-option
                class="form-select"
                value="${null==t?void 0:t.id}"
                ?selected="${null==t?void 0:t.selected}">
                ${null==t?void 0:t.value}
              </bbva-form-option>
            `))}
        </bbva-form-select>
      </div>
    `}get _tplButton(){return o`
      <bbva-button-default
        id="button-minor-info"
        fullwidth
        ?disabled="${!this._isButtonEnabled}"
        @click="${this._postCivilRegistries}">
        ${this.t("account-origination-oc-account-young-continue-button")}
      </bbva-button-default>
    `}get _tplFormDate(){return o`
      <bbva-form-input
        id="birthDateInput"
        .min="${Hi().subtract(this.maxAge).format("YYYY-MM-DD")}"
        .max="${Hi().format("YYYY-MM-DD")}"
        ?invalid="${this._isInvalidAge}"
        error-message="${this.t("account-origination-oc-account-young-minor-info-error-birthdate",this.maxAge)}"
        class="input-minor-form"
        type="date"
        value="${this.selectedDate}"
        ?reset-value="${this.resetValue}"
        label="${this.t("account-origination-oc-account-young-minor-info-birthdate")}"
        @form-input-value-change="${this._setValueAndValidateAge}">
      </bbva-form-input>
    `}get _tplFormField(){return o`
      <bbva-form-field
        id="birthDateInput"
        optional-label=""
        ?invalid="${this._isInvalidAge}"
        error-message="${this.t("account-origination-oc-account-young-minor-info-error-birthdate",this.maxAge)}"
        class="input-minor-form"
        readonly
        value="${""!==this.selectedDate?Hi(this.selectedDate).format("DD/MM/YYYY"):""}"
        ?reset-value="${this.resetValue}"
        label="${this.t("account-origination-oc-account-young-minor-info-birthdate")}"
        action-into-form
        action-icon="${y()}"
        @click="${this._callPluginNativeDatePicker}">
      </bbva-form-field>
    `}get _tplMinorInfo(){return o`
        <bbva-type-text
          class="minor-info-description"
          tag="p"
          unset
          size="S"
          text="account-origination-oc-account-young-minor-info-title">
        </bbva-type-text>
        <bbva-form-input
          id="nameInput"
          class="input-minor-form"
          type="text"
          allowed-pattern="^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s.]+$"
          ?reset-value="${this.resetValue}"
          label="${this.t("account-origination-oc-account-young-minor-info-name")}"
          @form-input-value-change="${this._setValueAndValidateInput}">
        </bbva-form-input>
        <bbva-form-input
          id="lastNameInput"
          class="input-minor-form"
          type="text"
          allowed-pattern="^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s.]+$"
          ?reset-value="${this.resetValue}"
          label="${this.t("account-origination-oc-account-young-minor-info-last-name")}"
          @form-input-value-change="${this._setValueAndValidateInput}">
        </bbva-form-input>
        <bbva-form-input
          id="secondLastNameInput"
          class="input-minor-form"
          type="text"
          allowed-pattern="^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s.]+$"
          ?reset-value="${this.resetValue}"
          label="${this.t("account-origination-oc-account-young-minor-info-second-last-name")}"
          @form-input-value-change="${this._setValueAndValidateInput}">
        </bbva-form-input>
        ${this.native?this._tplFormField:this._tplFormDate}
        ${this._tplBirthplacesFormSelect}
        <bbva-form-radio-group
          id="genderRadioGroup"
          label-medium-out="500"
          label-out="account-origination-oc-account-young-minor-info-gender"
          optional-label=""
          class="check-group"
          @form-radio-group-item-change="${this._setGenderValue}">
          <bbva-form-radio-button
            id="female"
            name="choice"
            divider="full"
            ?checked="${0===this._index}"
            value="${this.t("account-origination-oc-account-young-minor-info-female-value")}"
            >${this.t("account-origination-oc-account-young-minor-info-female")}
          </bbva-form-radio-button>
          <bbva-form-radio-button
            id="male"
            class="gender"
            name="choice"
            ?checked="${1===this._index}"
            value="${this.t("account-origination-oc-account-young-minor-info-male-value")}"
            >${this.t("account-origination-oc-account-young-minor-info-male")}
          </bbva-form-radio-button>
        </bbva-form-radio-group>
        <bbva-type-link
          id="linkPrivacy"
          class="link-padding"
          @click="${this._eventOpenNoticePrivacy}">
          ${this.t("account-origination-oc-account-young-offer-panel-privacy-link")}
        </bbva-type-link>
        <bbva-form-checkbox
          id="checkboxPrivacy"
          label="${this.t("account-origination-oc-account-young-minor-info-checkbox-label-privacy")}"
          required
          ?checked="${this._checkboxPrivacy}"
          class="check-group"
          @bbva-form-checkbox-input="${this._setCheckboxPrivacy}"
        ></bbva-form-checkbox>
        <bbva-type-text
          class="privacy-regristry-text"
          size="S"
          tag="p"
          unset
          text="account-origination-oc-account-young-minor-info-renapo">
        </bbva-type-text>
    `}render(){return o`
      ${this._tplMinorInfo}
      ${this._tplButton}
    `}}var Gi=h`
:host {
  --_skeleton-default-bg-color: var(--bbva-skeleton-default--_ambient--bg-color, var(--bbva-skeleton-default--custom--primary-ambient--bg-color, var(--color-primary-surface-ambient-preloading,#ffffff)));
  --_skeleton-default-animated-bg-color: var(--bbva-skeleton-default--_ambient--animated-bg-color, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color, var(--color-primary-surface-ambient-default,#f4f4f4)));
  --_skeleton-default-bg-color-alt: var(--bbva-skeleton-default--_ambient--bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--bg-color-alt, var(--color-primary-surface-alternative-preloading,#e9e9e9)));
  --_skeleton-default-animated-bg-color-alt: var(--bbva-skeleton-default--_ambient--animated-bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color-alt, var(--color-primary-surface-alternative-default,#ffffff)));
}

.image {
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.image-button {
  padding: 1rem;
  margin-top: 1rem;
  cursor: pointer;
}
.image-button:active {
  background: var(--colorsSecondary200, ${g(_.secondary200)});
}

.icon {
  fill: var(--colorsPrimaryCoreLight, ${g(_.primaryCoreLight)});
}

.type-link {
  padding: 1rem 0 1.5rem;
  font-size: 1rem;
}
.type-link:not([disabled]) {
  padding-top: 1.5rem;
}

.button {
  margin: 1.5rem 0;
}

.file-size-label {
  padding-top: 0.5rem;
}

.link-image {
  font-size: 1.125rem;
  overflow-wrap: anywhere;
}

.uploaded-image-link {
  padding-right: 1rem;
}

.wrapper-general {
  margin: 0 1rem;
}

.wrapper-button {
  display: flex;
  justify-content: center;
  padding-top: 1.5rem;
}
`;class Ui extends(k(D(u(i)))){static get is(){return"birth-certificate-step"}static get scopedElements(){const t=[F,G,M,B,z];return Ui.scopedElementsFromClasses(t)}static get properties(){return{dataUploadedImage:{type:Object,attribute:"data-uploaded-image"},isButtonEnabled:{type:Boolean,attribute:"is-button-enabled"},_isUploadedImage:{type:Boolean,state:!0},_isLinkEnabled:{type:Boolean,state:!0}}}static get styles(){return[Gi,w.primary,N.primary,q.primary,U.primary,p("birth-certificate-step-shared-styles")]}constructor(){super(),this.isButtonEnabled=!1,this._isUploadedImage=!1,this._isLinkEnabled=!1,this.dataUploadedImage={}}updated(t){super.updated(t),Object.keys(this.dataUploadedImage).length>0?this._loadedImage():this._deleteImage()}_deleteImage(){this.isButtonEnabled=!1,this._isUploadedImage=!1,this._isLinkEnabled=!1}_fileUploadedLinkClick(t){t.stopPropagation(),this._dispatchCustomEvent("account-origination-oc-account-young-birth-certificate-visualize")}_fireCompleteEventCardMinor(){this._dispatchCustomEvent("account-origination-oc-account-young-multistep-step-complete"),this._dispatchCustomEvent("complete")}_loadedImage(){this.isButtonEnabled=!0,this._isUploadedImage=!0,this._isLinkEnabled=!0}_iconLinkClick(t){t.stopPropagation(),this._dispatchCustomEvent("account-origination-oc-account-young-birth-certificate-delete","FILE_DELETE")}get _tplButton(){return o`
      <div class="wrapper-button">
        <bbva-button-default
          id="button-birth"
          class="button wrapper-general"
          fullwidth
          ?disabled="${!this.isButtonEnabled}"
          @click="${this._fireCompleteEventCardMinor}"
          >${this.t("account-origination-oc-account-young-continue-button")}
        </bbva-button-default>
      </div>
    `}get _tplDeleteFileIcon(){return o`
      <bbva-type-link
        id="icon-delete-birth"
        class="icon"
        variant="icon"
        icon-size="24"
        icon="${b()}"
        @click="${this._iconLinkClick}"
      ></bbva-type-link>
    `}get _tplUploadImage(){return o`
      <bbva-type-link
        id="link-upload-image"
        class="type-link wrapper-general"
        ?disabled="${this._isLinkEnabled}"
        @click="${()=>this._dispatchCustomEvent("account-origination-oc-account-young-birth-certificate-modal-upload","CHOOSE_FILE")}">
        <span>${this.t("account-origination-oc-account-young-birth-certificate-link")}</span>
      </bbva-type-link>
      <bbva-notification-message
        class="wrapper-general"
        message-title="${this.t("account-origination-oc-account-young-birth-certificate-message-title")}"
        message="${this.t("account-origination-oc-account-young-birth-certificate-message-text")}">
      </bbva-notification-message>
    `}get _tplUploadedImage(){var t;return o`
      <div
        class="image-button"
        role="button"
        tabindex="0"
        @click="${this._fileUploadedLinkClick}"
        @keypress="${this._fileUploadedLinkClick}">
        <div class="image">
          <div class="uploaded-image-link">
            ${this._tplUploadedImageLink}
          </div>
          <div class="image-trash-icon">
            ${this._tplDeleteFileIcon}
          </div>
        </div>
        <bbva-type-text
          class="file-size-label"
          size="S"
          tag="p"
          unset
          text="${null===(t=this.dataUploadedImage)||void 0===t?void 0:t.size} kb">
        </bbva-type-text>
      </div>
    `}get _tplUploadedImageLink(){var t;return o`
      <bbva-type-link
        id="link-uploaded-image-birth"
        @click="${this._fileUploadedLinkClick}">
        <bbva-type-text
          id="link-uploaded-birth"
          class="link-image"
          variant="spotlight"
          tag="p"
          unset
          text="${null===(t=this.dataUploadedImage)||void 0===t?void 0:t.name}">
        </bbva-type-text>
      </bbva-type-link>
    `}render(){return o`
        <bbva-type-text tag="p" unset size="S" class="text-birth wrapper-general" text="account-origination-oc-account-young-birth-certificate-title"></bbva-type-text>
        ${this._isUploadedImage?this._tplUploadedImage:m}
        ${this._tplUploadImage}
        ${this._tplButton}
    `}}var zi=h`
.microilustration-padding {
  padding-top: 1rem;
}

[data-tag-name=bbva-list-bullet] {
  padding: 0.25rem 0;
}

.choose-file {
  width: 100%;
}
`;class Ki extends(k(D(u(i)))){static get is(){return"oc-account-young-help-modal"}static get scopedElements(){const t=[Y,B,F,V,pt,X,M];return Ki.scopedElementsFromClasses(t)}static get properties(){return{modalVisible:{type:Boolean,attribute:"modal-visible"},modalConfig:{type:Object,attribute:"modal-config"},_headerButtons:{type:Array,state:!0}}}static get styles(){return[zi,N.primary,K.primary,L.primary,ht.primary,q.primary,w.primary,p("oc-account-young-help-modal-shared-styles")]}constructor(){super(),this.modalVisible=!1,this.modalConfig={},this._headerButtons=[{id:"btn-close",name:"Close",icon:f(),accessibilityText:"account-origination-oc-account-young-modal-common-error-link",eventIconName:"account-origination-oc-account-young-header-button-close-click"}]}get _panelContent(){var t,e;return null!==(t=this.modalConfig)&&void 0!==t&&t.panel?o`
      <div class="content" slot="slot-content">
        ${"CHOOSE_FILE"===(null===(e=this.modalConfig)||void 0===e?void 0:e.id)?this._panelChooseFile:this._panelGeneral}
      </div>
    `:m}get _panelChooseFile(){var t;return o`
      <bbva-type-text size="S" text="${null===(t=this.modalConfig)||void 0===t?void 0:t.bodyText}"></bbva-type-text>
      <bbva-type-link id="link-camera" class="choose-file" icon="${C()}"
        @click=${()=>this._dispatchCustomEvent("account-origination-oc-account-young-suggest-modal-open","camera")}>
        ${this.t("account-origination-oc-account-young-modal-choose-file-take-photo")}
      </bbva-type-link>
      <bbva-divider-default> </bbva-divider-default>
      <bbva-type-link id="link-file" class="choose-file" icon="${S()}"
        @click=${()=>this._dispatchCustomEvent("account-origination-oc-account-young-image-choose","gallery")}>
        ${this.t("account-origination-oc-account-young-modal-choose-file-from-gallery")}
      </bbva-type-link>
      <bbva-divider-default> </bbva-divider-default>
      <bbva-type-link id="link-pdf" class="choose-file" icon="${v()}"
        @click=${()=>this._dispatchCustomEvent("account-origination-oc-account-young-pdf-choose","file")}>
        ${this.t("account-origination-oc-account-young-modal-choose-file-pdf")}
      </bbva-type-link>
    `}get _panelGeneral(){var t,e,i,s,a,n,r,c;return o`
        ${null!==(t=this.modalConfig)&&void 0!==t&&t.illustration?o`<bbva-clip-microillustration class="microilustration-padding" size="M" microillustration="${null===(e=this.modalConfig)||void 0===e?void 0:e.illustration}"></bbva-clip-microillustration>`:""}
        <bbva-type-text tag="h2" unset size="XL" font-weight="700" class="suggestions-title-modal" text="${null===(i=this.modalConfig)||void 0===i?void 0:i.subTitleText}"></bbva-type-text>
        <div class="description-modal">
          <bbva-type-text size="S" text="${null===(s=this.modalConfig)||void 0===s?void 0:s.bodyText}"></bbva-type-text>
          <bbva-type-text size="S" text="${null===(a=this.modalConfig)||void 0===a?void 0:a.complementaryText}"></bbva-type-text>
          <bbva-type-text size="S" text="${null===(n=this.modalConfig)||void 0===n?void 0:n.optionalText}"></bbva-type-text>
        </div>
        <div class="suggestions-bullets-list">
          ${null!==(r=this.modalConfig)&&void 0!==r&&r.list?null===(c=this.modalConfig)||void 0===c?void 0:c.list.map((t=>o`
            <bbva-list-bullet>${this.t(t)}</bbva-list-bullet>`)):m}
        </div>
    `}get _renderModal(){var t,e,i,s,a,n,r,c,l,d,u,h,p,g,_,v,y,b,f;return o`
    <bbva-help-modal
      id="${null===(t=this.modalConfig)||void 0===t?void 0:t.id}"
      hide-content-padding-top
      ?visible="${this.modalVisible}"
      ?full-height="${null===(e=this.modalConfig)||void 0===e?void 0:e.fullHeight}"
      header-text="${this.t(null===(i=this.modalConfig)||void 0===i?void 0:i.headerText)}"
      header-type="${(null===(s=this.modalConfig)||void 0===s?void 0:s.headerType)||""}"
      modal-type="${null===(a=this.modalConfig)||void 0===a?void 0:a.modalType}"
      title-icon="${null===(n=this.modalConfig)||void 0===n?void 0:n.titleIcon}"
      title-text="${this.t(null===(r=this.modalConfig)||void 0===r?void 0:r.titleText)}"
      button-text="${this.t(null===(c=this.modalConfig)||void 0===c?void 0:c.buttonText)}"
      title-lines="3"
      .bodyText="${this.t(null===(l=this.modalConfig)||void 0===l?void 0:l.bodyText)}"
      .linkText="${this.t(null===(d=this.modalConfig)||void 0===d?void 0:d.linkText)}"
      .headerButtons="${(null===(u=this.modalConfig)||void 0===u?void 0:u.headerButtons)||this._headerButtons}"
      .closeModalElements="${(null===(h=this.modalConfig)||void 0===h?void 0:h.closeModalElements)||[]}"
      ?fixed-footer="${null===(p=this.modalConfig)||void 0===p?void 0:p.fixedFooter}"
      ?hide-content-padding-top="${null===(g=this.modalConfig)||void 0===g?void 0:g.hideContentPaddingTop}"
      @help-modal-swipe-close="${null===(_=this.modalConfig)||void 0===_?void 0:_.swipeClose}"
      @help-modal-footer-button-click="${null===(v=this.modalConfig)||void 0===v?void 0:v.footerButtonClick}"
      @help-modal-footer-link-click="${null===(y=this.modalConfig)||void 0===y?void 0:y.footerLinkClick}"
      @help-modal-veil-click="${null===(b=this.modalConfig)||void 0===b?void 0:b.veilClick}">
    ${null!==(f=this.modalConfig)&&void 0!==f&&f.panel?this._panelContent:m}
  </bbva-help-modal>
    `}render(){return o`
      ${this._renderModal}
    `}}const Yi=[{id:"btn-info",name:"Help",icon:E(),accessibilityText:"Help",eventIconName:"account-origination-oc-account-young-header-button-faqs-click"},{id:"btn-close",name:"Close",icon:f(),accessibilityText:"Close",eventIconName:"account-origination-oc-account-young-header-button-close-click"}],Xi=[{icon:T(),label:"account-origination-oc-account-young-success-share",id:"btn-share",accessibilityText:"Share"}],Wi=["account-origination-oc-account-young-offer-benefits-bullet-one","account-origination-oc-account-young-offer-benefits-bullet-two","account-origination-oc-account-young-offer-benefits-bullet-three"],Ji=["account-origination-oc-account-young-offer-considerations-bullet-one","account-origination-oc-account-young-offer-considerations-bullet-two","account-origination-oc-account-young-offer-considerations-bullet-three","account-origination-oc-account-young-offer-considerations-bullet-four"],Qi=["account-origination-oc-account-young-photo-suggest-bullet-one","account-origination-oc-account-young-photo-suggest-bullet-two","account-origination-oc-account-young-photo-suggest-bullet-three"],Zi=["account-origination-oc-account-young-errors-page-bullet-one","account-origination-oc-account-young-errors-page-bullet-two","account-origination-oc-account-young-errors-page-bullet-three"];function ts(t=0,e=""){return P(t,R(e))}const{moment:es}=window;function is(t=""){return es(t).format("D [de] MMMM [de] YYYY")}function ss(t){return t.replace(/([A-Z])/g,"-$1").toLowerCase()}function os(t,e=""){var i;return e?null===(i=es(e))||void 0===i?void 0:i.format(t):""}function as(t){const e=t.match(/\.([a-z0-9]+)$/i);return e?e[1]:""}var ns=h`
.summary .summary-align {
  display: flex;
  justify-content: space-between;
  padding: 0.5rem 0;
}
.summary .summary-align:first-of-type {
  padding-top: 0;
}
.summary .summary-align:last-of-type {
  padding-bottom: 1rem;
}
.summary .summary-align-certificate {
  display: flex;
  justify-content: space-between;
  padding-bottom: 1rem;
}
.summary .summary-align-terms {
  display: flex;
  align-items: center;
  padding-bottom: 1rem;
}

.summary-content {
  height: 6.5rem;
  width: auto;
  background: var(--_account-origination-oc-account-young-summary-content-bg);
  display: flex;
  align-items: center;
}

.summary-button {
  margin-right: 1rem;
}

[data-tag-name=bbva-header-main] {
  transition: background-color 0.5s ease;
}

.icon-margin {
  margin-right: 0.5rem;
}

.summary-image {
  width: 50vw;
  overflow-wrap: anywhere;
}

.wrapper-summary {
  margin: 0 1rem;
}

.address-description {
  margin-left: 1rem;
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0;
}
`;class rs extends(k(D(u(i)))){static get is(){return"oc-account-young-multistep"}static get scopedElements(){const t=[F,Mi,Ni,mt,gt,qi,Bi,z,ji,Ui,W,M,Ki,Y,J,rs.configurationScopedElements()];return rs.scopedElementsFromClasses(t)}static get properties(){return{addressHome:{type:Array,attribute:"address-home"},addressHomeUnmasked:{type:Array,attribute:"address-home-unmasked"},birthplaceSelected:{type:String,attribute:"birthplace-selected"},birthplaces:{type:Array},colonySelected:{type:Object,attribute:"colony-selected"},countryName:{type:String,attribute:"country-name"},cellsPhoneNumber:{type:String,attribute:"cells-phone-number"},curp:{type:String},customerIdChild:{type:String,attribute:"customer-id-child"},colonySelect:{type:Object,attribute:"colony-select"},contractTemplates:{type:Object,attribute:"contract-templates"},contractingConsents:{type:Object,attribute:"contracting-consents"},cpAddressResponse:{type:Array,attribute:"cp-address-response"},civilRegistries:{type:Array,attribute:"civil-registries"},componentTypes:{type:Object,attribute:"component-types"},disconnectMultistep:{type:Boolean,attribute:"disconnect-multistep"},dataUploadedImage:{type:Object,attribute:"data-uploaded-image"},editStep:{type:Boolean,attribute:"edit-step"},editDigitalServiceStep:{type:Boolean,attribute:"edit-digital-service-step"},homonomyId:{type:String,attribute:"homonomy-id"},isCompleted:{type:Boolean,attribute:"is-completed"},maxLengthIdentificationKey:{type:Number,attribute:"max-length-identification-key"},maxAge:{type:Object,attribute:"max-age"},messageToast:{type:String,attribute:"message-toast"},nationality:{type:String},phoneCompanyId:{type:String,attribute:"phone-company-id"},paramsCreateAccount:{type:Object,attribute:"params-create-account"},resetValue:{type:Boolean,attribute:"reset-value"},requestBodyCivilRegistries:{type:Object,attribute:"request-body-civil-registries"},showSuccessToast:{type:Boolean,attribute:"show-success-toast"},selectedDate:{type:String,attribute:"selected-date"},showMultiStepPage:{type:Boolean,attribute:"show-multi-step-page"},toastDuration:{type:String,attribute:"toast-duration"},userEmail:{type:String,attribute:"user-email"},visible:{type:Boolean},zipCodeInvalid:{type:Boolean,attribute:"zip-code-invalid"},_activeSteps:{type:Array,state:!0},_personalDataMinor:{type:Array,state:!0},_stepsToReset:{type:Array,state:!0},_isBtnBirthCertificate:{type:Boolean,state:!0},_addressChildInfo:{type:Object,state:!0},_showAdditionalStep:{type:Boolean,state:!0},_clearAdditionalStep:{type:Boolean,state:!0},_digitalServiceMandatory:{type:Boolean,state:!0},_digitalServicesData:{type:Object,state:!0},_variantHeader:{type:String,state:!0}}}constructor(){super(),this.visible=!1,this.birthplaces=[],this.civilRegistries=[],this.maxAge={},this.selectedDate="",this.birthplaceSelected="",this.editStep=!1,this.showMultiStepPage=!1,this.resetValue=!1,this.disconnectMultistep=!1,this.dataUploadedImage={},this.colonySelect={},this.cpAddressResponse=[],this.addressHome=[],this.addressHomeUnmasked=[],this.colonySelected={},this.countryName="",this.zipCodeInvalid=!1,this.maxLengthIdentificationKey=0,this.requestBodyCivilRegistries={},this.phoneCompanyId="",this.cellsPhoneNumber="",this.curp="",this.editDigitalServiceStep=!1,this.isCompleted=!1,this.userEmail="",this.customerIdChild="",this.paramsCreateAccount={},this.contractTemplates={},this.contractingConsents={},this.showSuccessToast=!1,this.messageToast="",this.homonomyId="",this.toastDuration="",this._variantHeader="",this._digitalServicesData={},this._digitalServiceMandatory=!1,this._clearAdditionalStep=!1,this._showAdditionalStep=!1,this._addressChildInfo={},this._isBtnBirthCertificate=!1,this._personalDataMinor=[],this._stepsToReset=[],this._activeSteps=["minor-info-step","birth-certificate-step","address-step","digital-services-step","terms-conditions-step"],this.nationality="",this.componentTypes={}}static get styles(){return[ns,N.primary,w.primary,U.primary,p("oc-account-young-multistep-shared-styles")]}firstUpdated(){this._onCurrentStep(),this.addEventListener("account-origination-oc-account-young-multistep-step-complete",this._onCurrentStep.bind(this)),this.addEventListener("expandable-step-edit-step",this._onEditStep.bind(this))}updated(t){super.updated(t),(t.has("editStep")&&this.editStep||t.has("disconnectMultistep")&&this.disconnectMultistep)&&(this._stepsToReset=[],this._resetMultiStep()),t.has("resetValue")&&this.resetValue&&(this.editStep=!1,this.disconnectMultistep=!1),t.has("editDigitalServiceStep")&&this.editDigitalServiceStep&&(this._updateCompleteStepState(this._steps.length-2,!0,!1,!1),this._updateCompleteStepState(this._steps.length-1),this._onEditDigitalServices(),this._onCurrentStep())}static _buildMinorInfoSummary(t){return Object.keys(t).map((e=>({text:`account-origination-oc-account-young-minor-info-${ss(e)}`,translate:t[e],class:e})))}_buildStepDetail(t){let e=!1;var i;"terms-conditions-step"===t&&(e=null===(i=this._digitalServicesData)||void 0===i?void 0:i.hiringDigitalService);return e}_changeVariantHeader({detail:t}){this._variantHeader=null!=t&&t.completed?"modal-initial-secondary":"modal-initial"}_clearStep(){this.civilRegistries=[],this._clearAdditionalStep=!0,this.requestUpdate()}_getPersonalDataMinor({detail:t}){this._personalDataMinor=rs._buildMinorInfoSummary(t)}_setAdditonalStepVisible(t){t.stopPropagation(),this._activeSteps.splice(1,0,"additional-info-step"),this._showAdditionalStep=!0}_setAddressInfo({detail:t}){this._addressChildInfo={...t}}_setDigitalServicesData({detail:t}){this._digitalServicesData=t}_editStepModal(t){var e;t.stopPropagation();const i=null===(e=this._activeSteps)||void 0===e?void 0:e[null==t?void 0:t.detail];this._dispatchCustomEvent("account-origination-oc-account-young-multistep-step-edit",i)}_onCompleteDigitalServices(){var t;this._digitalServiceMandatory=null===(t=this._digitalServicesData)||void 0===t?void 0:t.hiringDigitalService}_onEditDigitalServices(){this._dispatchCustomEvent("account-origination-oc-account-young-step-digital-services-edit")}_onEditStep(t){t.stopPropagation();const e=null==t?void 0:t.detail,i=this._activeSteps[e];"additional-info-step"===i?this._clearStep():"digital-services-step"===i?(this._onEditDigitalServices(),this._validateLastSteps()):"digital-services-step"!==i&&"terms-conditions-step"!==i&&this._validateLastSteps(),this._onCurrentStep()}async _onCurrentStep(){if(await this.updateComplete,this._currentStep){var t,e;const i=this._buildStepDetail(null===(t=this._currentStep)||void 0===t?void 0:t.id);this._dispatchCustomEvent("account-origination-oc-account-young-step-current",{currentStep:null===(e=this._currentStep)||void 0===e?void 0:e.id,isDigitalService:i})}else this._dispatchCustomEvent("account-origination-oc-account-young-step-current",{currentStep:"summary-view"})}_updateCompleteStepState(t=0,e=!1,i=!1,s=!0){this._steps[t].completed=i,this._steps[t].disabled=s,this._steps[t].active=e,this.requestUpdate()}_resetMultiStep(){var t;null===(t=this._steps)||void 0===t||t.forEach(((t,e)=>{0!==e&&(this._steps[e].completed=!1,this._steps[e].className="",this._steps[e].disabled=!0,this._steps[e].active=!1,this._stepsToReset.push(e))})),this._steps[0].completed=!1,this._steps[0].active=!0,this._steps[0].disabled=!1,this._resetData(),this.requestUpdate(),this.disconnectMultistep?this._dispatchCustomEvent("account-origination-oc-account-young-multistep-disconnect"):(this._onCurrentStep(),this._dispatchCustomEvent("account-origination-oc-account-young-steps-reset"))}_resetData(){this._isValidateCurp=!1,this._isBtnBirthCertificate=!1,this._variantHeader="",this.colonySelect={},this.cpAddressResponse=[],this._listTexts=[],this.birthplaces=[],this._digitalServicesData={},this.curp="",this.selectedDate="",this.birthplaceSelected="",this._showAdditionalStep=!1,this._clearStep()}async _validateLastSteps(){const t=this.shadowRoot.querySelector("#digital-services-step"),e=this.shadowRoot.querySelector("#terms-conditions-step");null!=t&&t.completed&&(this._digitalServiceMandatory=!1,await this.updateComplete,this._updateCompleteStepState(this._steps.length-2),this._onEditDigitalServices()),null!=e&&e.completed&&this._updateCompleteStepState(this._steps.length-1)}get _steps(){return[...this.shadowRoot.querySelectorAll(`[data-tag-name="${mt.is}"]`)]}get _currentStep(){return this._displayedSteps=this._steps.filter((t=>this._activeSteps.includes(t.id))),this._displayedSteps.find((t=>!t.completed))}get _tplChildInfoStep(){return o`
      <bbva-expandable-step
        id="minor-info-step"
        header="${this.t("account-origination-oc-account-young-multistep-minor-info-header")}"
        show-link
        is-dynamic-handler
        hide-padding-top
        hide-padding-bottom
        ?open-edit-step="${!this.editStep}"
        edit-label="${this.t("account-origination-oc-account-young-modify-label")}">
        <div class="content">
          <minor-info-step
            ?visible="${!this._showAdditionalStep}"
            ?native="${this.native}"
            ?i-o-s-fixed-header="${this.iOSFixedHeader}"
            ?reset-value="${this.resetValue}"
            .birthplaces="${this.birthplaces}"
            .civilRegistries="${this.civilRegistries}"
            .activeSteps="${this._activeSteps}"
            .maxAge="${this.maxAge}"
            .selectedDate="${this.selectedDate}"
            .birthplaceNativeSelected="${this.birthplaceSelected}"
            .homonomyId="${this.homonomyId}"
            @account-origination-oc-account-young-additional-info-step-show="${this._setAdditonalStepVisible}"
            @account-origination-oc-account-young-minor-info-step-complete="${this._getPersonalDataMinor}"
          ></minor-info-step>
        </div>
        <div class="summary" slot="summary">
          ${this._personalDataMinor.map((t=>o`
            <div class="summary-align ${ss(null==t?void 0:t.class)}">
              <bbva-type-text unset tag="p" size="S" text="${null==t?void 0:t.text}"></bbva-type-text>
              <bbva-type-text unset alignment="right" tag="p" size="S" text="${null==t?void 0:t.translate}" font-weight="500"></bbva-type-text>
            </div>
            `))}
        </div>
      </bbva-expandable-step>
    `}get _tplBirthCertificateStep(){var t,e;return o`
      <bbva-expandable-step
        id="birth-certificate-step"
        header="${this.t("account-origination-oc-account-young-multistep-birth-certificate-header")}"
        show-link
        hide-padding-top
        hide-padding-bottom
        hide-padding-left
        hide-padding-right
        edit-label="${this.t("account-origination-oc-account-young-modify-label")}">
        <div class="content">
          <birth-certificate-step
            .dataUploadedImage="${this.dataUploadedImage}"
            ?is-button-enabled="${this._isBtnBirthCertificate}">
          </birth-certificate-step>
        </div>
        <div class="summary" slot="summary">
          <div class="summary-align-certificate wrapper-summary">
            <bbva-type-text tag="p" unset class="summary-image" size="S" text="${null===(t=this.dataUploadedImage)||void 0===t?void 0:t.name}" font-weight="500"></bbva-type-text>
            <bbva-type-text tag="p" alignment="right" unset size="S" text="${null===(e=this.dataUploadedImage)||void 0===e?void 0:e.size} kb"></bbva-type-text>
          </div>
        </div>
      </bbva-expandable-step>
    `}get _tplAddressStep(){return o`
      <bbva-expandable-step
        id="address-step"
        show-link
        hide-padding-top
        hide-padding-bottom
        header="${this.t("account-origination-oc-account-young-multistep-address-header")}"
        edit-label="${this.t("account-origination-oc-account-young-modify-label")}">
        <div class="content">
          <address-step
              .colonySelect="${this.colonySelect}"
              .cpAddressResponse="${this.cpAddressResponse}"
              .addressHome="${this.addressHome}"
              .addressHomeUnmasked="${this.addressHomeUnmasked}"
              .colonyNativeSelected="${this.colonySelected}"
              country-name="${this.countryName}"
              ?reset-value="${this.resetValue}"
              ?native="${this.native}"
              ?i-o-s-fixed-header="${this.iOSFixedHeader}"
              ?zip-code-invalid="${this.zipCodeInvalid}"
              @account-origination-oc-account-young-step-address-child-fill="${this._setAddressInfo}">
            </address-step>
          </div>
          <div class="summary" slot="summary">
            <div class="summary-align-certificate">
              ${this._tplSummaryAddress}
            </div>
          </div>
        </bbva-expandable-step>
      `}get _tplSummaryAddress(){var t;let e;var i,s,a,n,r,c,l,d,u,h,p;null!==(t=this._addressChildInfo)&&void 0!==t&&t.sameAddress?e=o`
        <bbva-type-text tag="p" unset size="S" text="account-origination-oc-account-young-address-title-same-address"></bbva-type-text>
        <bbva-type-text class="address-description" tag="p" alignament="right" unset size="S" text="${null===(i=this._addressChildInfo)||void 0===i?void 0:i.addressFormat}" font-weight="500"></bbva-type-text>
        `:e=o`
        <bbva-type-text tag="p" unset size="S" text="account-origination-oc-account-young-address-title-other-address"></bbva-type-text>
        <bbva-type-text class="address-description" tag="p" alignment="right" unset font-weight="500" size="S"
          text="
            ${null===(s=this._addressChildInfo)||void 0===s?void 0:s.street}
            ${null===(a=this._addressChildInfo)||void 0===a?void 0:a.outsideNumber},
            ${null!==(n=this._addressChildInfo)&&void 0!==n&&n.insideNumber?`${null===(r=this._addressChildInfo)||void 0===r?void 0:r.insideNumber}, `:""}
            ${null===(c=this._addressChildInfo)||void 0===c?void 0:c.zipCode},
            ${null===(l=this._addressChildInfo)||void 0===l?void 0:l.municipality},
            ${(null===(d=this._addressChildInfo)||void 0===d?void 0:d.colonyName)||(null===(u=this._addressChildInfo)||void 0===u?void 0:u.colony)},
            ${null===(h=this._addressChildInfo)||void 0===h?void 0:h.state},
            ${this.t(null===(p=this._addressChildInfo)||void 0===p?void 0:p.country)}">
          </bbva-type-text>
      `;return e}get _tplDigitalServicesStep(){return o`
      <bbva-expandable-step
        id="digital-services-step"
        header="${this.t("account-origination-oc-account-young-multistep-digital-services-header")}"
        show-link
        hide-padding-top
        hide-padding-bottom
        ?open-edit-step="${this._digitalServiceMandatory}"
        ?completed="${this.isCompleted}"
        edit-label="${this.t("account-origination-oc-account-young-modify-label")}"
        @expandable-step-complete-change="${this._onCompleteDigitalServices}">
        <div class="content">
          <digital-service-step
            .addressChildInfo="${this._addressChildInfo}"
            .civilRegistries="${this.civilRegistries}"
            .addressHomeUnmasked="${this.addressHomeUnmasked}"
            .cpAddressResponse="${this.cpAddressResponse}"
            phone-company-id="${this.phoneCompanyId}"
            cells-phone-number="${this.cellsPhoneNumber}"
            curp="${this.curp}"
            nationality="${this.nationality}"
            .componentTypes="${this.componentTypes}"
            ?reset-value="${this.resetValue}"
            ?modify-step="${this.editDigitalServiceStep}"
            ?is-completed="${this.isCompleted}"
            @account-origination-oc-account-young-data-of-digital-services-send="${this._setDigitalServicesData}"
          ></digital-service-step>
        </div>
        <div class="summary" slot="summary">
          ${this._tplDigitalServicesSummary}
        </div>
      </bbva-expandable-step>
    `}get _tplDigitalServicesSummary(){var t,e,i;return null!==(t=this._digitalServicesData)&&void 0!==t&&t.hiringDigitalService?o`
    <div class="digital-service-summary">
      <div class="summary-align">
        <bbva-type-text tag="p" unset size="S" text="account-origination-oc-account-young-multistep-digital-services-summary-title-phone"></bbva-type-text>
        <bbva-type-text tag="p" alignment="right" unset size="S" text="${null===(e=this._digitalServicesData)||void 0===e?void 0:e.phoneChild}" font-weight="500"></bbva-type-text>
      </div>
      <div class="summary-align">
        <bbva-type-text tag="p" unset size="S" text="account-origination-oc-account-young-digital-services-label-email"></bbva-type-text>
        <bbva-type-text tag="p" alignment="right" unset size="S" text="${null===(i=this._digitalServicesData)||void 0===i?void 0:i.inputEmail}" font-weight="500"></bbva-type-text>
      </div>
    </div>
    `:o`
      <div class="summary-align digital-service-summary">
        <bbva-type-text tag="p" unset size="S" text="account-origination-oc-account-young-multistep-digital-services-summary-title-without-services"></bbva-type-text>
        <bbva-type-text tag="p" alignment="right" unset size="S" text="account-origination-oc-account-young-digital-services-label-without-services" font-weight="500"></bbva-type-text>
      </div>
    `}get _tplTermsConditionsStep(){var t,e,i;return o`
        <bbva-expandable-step
          id="terms-conditions-step"
          header="${this.t("account-origination-oc-account-young-multistep-terms-conditions-header")}"
          show-link
          hide-padding-top
          hide-padding-bottom
          edit-label="${this.t("account-origination-oc-account-young-modify-label")}">
          <div class="content">
            <terms-conditions-step
              user-email="${this.userEmail}"
              cells-phone-number="${this.cellsPhoneNumber}"
              user-email-child="${null===(t=this._digitalServicesData)||void 0===t?void 0:t.inputEmail}"
              cells-phone-number-child="${null===(e=this._digitalServicesData)||void 0===e?void 0:e.phoneChild}"
              .customerIdChild="${this.customerIdChild}"
              .paramsCreateAccount="${this.paramsCreateAccount}"
              .contractTemplates="${this.contractTemplates}"
              .contractingConsents="${this.contractingConsents}"
              ?digital-service-flag="${null===(i=this._digitalServicesData)||void 0===i?void 0:i.hiringDigitalService}"
              ?reset-value="${this.resetValue}">
            </terms-conditions-step>
          </div>
          <div class="summary" slot="summary">
            <div class="summary-align-terms">
              <bbva-type-icon class="icon-margin" icon="${A()}"></bbva-type-icon>
              <bbva-type-text tag="p" unset text="account-origination-oc-account-young-multistep-digital-services-summary-title"></bbva-type-text>
            </div>
          </div>
        </bbva-expandable-step>
      `}_onCompleteAdditionalInfo(){this._clearAdditionalStep=!1,this._onEditDigitalServices(),this._updateCompleteStepState(this._steps.length-2),this._updateCompleteStepState(this._steps.length-1)}get _tplAdditionalInfoStep(){var t;return o`
      <bbva-expandable-step
        id="additional-info-step"
        header="${this.t("account-origination-oc-account-young-multistep-additional-info-header")}"
        show-link
        hide-padding-top
        hide-padding-bottom
        edit-label="${this.t("account-origination-oc-account-young-modify-label")}"
        @complete="${this._onCompleteAdditionalInfo}">
        <div class="content">
          <additional-info-step
            ?visible="${this._showAdditionalStep}"
            .maxLengthIdentificationKey="${this.maxLengthIdentificationKey}"
            .civilRegistries="${this.civilRegistries}"
            .requestBodyCivilRegistries="${this.requestBodyCivilRegistries}"
            ?reset-value="${this.resetValue}"
            ?modify-step="${this._clearAdditionalStep}"
          ></additional-info-step>
        </div>
        <div class="summary" slot="summary">
          <div class="summary-additional-data summary-align-certificate">
            <bbva-type-text tag="p" unset size="S" text="account-origination-oc-account-young-additional-info-curp"></bbva-type-text>
            <bbva-type-text tag="p" alignment="right" unset size="S" text="${null===(t=this.requestBodyCivilRegistries)||void 0===t?void 0:t.documentNumber}" font-weight="500"></bbva-type-text>
          </div>
        </div>
      </bbva-expandable-step>
    `}get _tplSummaryButton(){return o`
      <bbva-button-default
        fullwidth=""
        variant="positive"
        @click="${()=>this._dispatchCustomEvent("account-origination-oc-account-young-post-account-create")}"
        class="button summary-button">${this.t("account-origination-oc-account-young-multistep-summary-button")}
      </bbva-button-default>
    `}get _tplToast(){return o`
      <bbva-notification-toast
        type="success"
        duration="${this.toastDuration}"
        ?show="${this.showSuccessToast}"
        ?auto-hide="${this.showSuccessToast}"
        fixed-bottom>
      <bbva-type-text tag="p" unset text="${this.messageToast}"></bbva-type-text>
      </bbva-notification-toast>
    `}get _tplHelpModal(){return o`
    <bbva-help-modal
        id="modal-multistep"
        ?visible="${this.visible}"
        full-height
        hide-content-padding-top
        avoid-icon-close-modal
        fixed-footer
        .headerButtons="${Yi}"
        header-type="${this._variantHeader}"
        header-text="${this.t("account-origination-oc-account-young-link-card-header")}"
        button-text="">
        <div class="marginStep" slot="slot-content">
          <bbva-expandable-multistep
            .stepsToReset="${this._stepsToReset}"
            .activeSteps="${this._activeSteps}"
            @expandable-multistep-specific-step-scroll="${this._changeVariantHeader}"
            @expandable-step-edit-step-prevent-open="${this._editStepModal}"
            id="multistep">
            <div slot="content">
              ${this._tplChildInfoStep}
              ${this._tplAdditionalInfoStep}
              ${this._tplBirthCertificateStep}
              ${this._tplToast}
              ${this._tplAddressStep}
              ${this._tplDigitalServicesStep}
              ${this._tplTermsConditionsStep}
            </div>
            <div slot="confirmation" class="summary-content">
              ${this._tplSummaryButton}
            </div>
          </bbva-expandable-multistep>
        </div>
      </bbva-help-modal>
    `}render(){return o`
      ${this._tplHelpModal}
    `}}var cs=h`
:host {
  --_skeleton-default-bg-color: var(--bbva-skeleton-default--_ambient--bg-color, var(--bbva-skeleton-default--custom--primary-ambient--bg-color, var(--color-primary-surface-ambient-preloading,#ffffff)));
  --_skeleton-default-animated-bg-color: var(--bbva-skeleton-default--_ambient--animated-bg-color, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color, var(--color-primary-surface-ambient-default,#f4f4f4)));
  --_skeleton-default-bg-color-alt: var(--bbva-skeleton-default--_ambient--bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--bg-color-alt, var(--color-primary-surface-alternative-preloading,#e9e9e9)));
  --_skeleton-default-animated-bg-color-alt: var(--bbva-skeleton-default--_ambient--animated-bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color-alt, var(--color-primary-surface-alternative-default,#ffffff)));
}

.margin-step {
  margin: 0 1rem;
}

.align-icon {
  float: left;
  margin-right: 0.3125rem;
}

.benefits, .considerations {
  margin: 0.5rem 0;
}

.costs {
  margin: 0.5rem 0;
}

[data-tag-name=bbva-list-bullet] {
  padding: 0.25rem 0;
}

[data-tag-name=bbva-header-category] {
  margin: 1.5rem 0 1rem;
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0;
}

.costs-section [data-tag-name=bbva-header-category] {
  margin-bottom: 0.5rem;
}

.privacy {
  padding: 0;
  text-align: left;
  height: auto;
  background: transparent;
  margin: 0.75rem 0 0.5rem;
  border: none;
}
.privacy [data-tag-name=bbva-type-text] {
  margin-bottom: 1rem;
}
.privacy:active {
  background: var(--colorsSecondary200, ${g(_.secondary200)});
}

.text-with-icon-wrapper [data-tag-name=bbva-type-text] {
  margin: 1rem 0 0.5rem;
}

.title-offer {
  line-height: 2rem;
  margin: 1rem 0 0.5rem;
}
`;class ls extends(k(D(u(i)))){static get is(){return"oc-account-young-offer"}static get scopedElements(){const t=[Y,X,V,j,W,pt,z,B,F,M];return ls.scopedElementsFromClasses(t)}static get properties(){return{productLimitData:{type:Object,attribute:"product-limit-data"},visible:{type:Boolean}}}static get styles(){return[cs,K.primary,L.primary,H.primary,ht.primary,U.primary,q.primary,w.primary,p("oc-account-young-offer-shared-styles")]}constructor(){super(),this.visible=!1,this.productLimitData={}}updated(t){t.has("visible")&&this.visible&&this._dispatchCustomEvent("account-origination-oc-account-young-offer-open",{currentStep:"offer-modal"})}_stopEventAndDispatchEvent(t){var e;t.stopPropagation();const i=null==t?void 0:t.currentTarget,s={benefits:{event:"account-origination-oc-account-young-benefits-open",detail:"OPEN_TERMS_BROWSER"},considerations:{event:"account-origination-oc-account-young-deposit-limit-open",detail:"DEPOSIT_LIMIT"},costs:{event:"account-origination-oc-account-young-cost-open",detail:"OPEN_GAT_BROWSER"},privacy:{event:"account-origination-oc-account-young-notice-privacy-open",detail:"NOTICE_PRIVACY"},offer:{event:"account-origination-oc-account-young-offer-continue",detail:"CONTINUE_OFFER"}};this._dispatchCustomEvent(s[null==i?void 0:i.className].event,null===(e=s[null==i?void 0:i.className])||void 0===e?void 0:e.detail)}_tplBulletList(t,e,i,s,a){return o`
      <bbva-header-category
        heading-level="3"
        text="${this.t(e)}">
      </bbva-header-category>
      <div class="${t}-bullet-list">
        ${i.map((t=>{var e,i,s;return o`
          <bbva-list-bullet>${this.t(t,{limitMonthlyAmount:ts(null===(e=this.productLimitData)||void 0===e||null===(i=e.amountLimits)||void 0===i||null===(s=i[0])||void 0===s?void 0:s.amount,this.language)})}</bbva-list-bullet>
        `}))}
      </div>
      <bbva-type-link
        @click="${this._stopEventAndDispatchEvent}"
        class="${s}">
        ${this.t(a)}
      </bbva-type-link>
    `}get _tplCost(){return o`
      <div class="costs-section">
        <bbva-header-category text="${this.t("account-origination-oc-account-young-offer-category-cost")}"></bbva-header-category>
        <bbva-type-text unset tag="p" size="S" class="costs-text" text="account-origination-oc-account-young-offer-cost-open-account"></bbva-type-text>
        <bbva-type-link
          @click="${this._stopEventAndDispatchEvent}"
          class="costs">
          ${this.t("account-origination-oc-account-young-offer-gat-link")}
        </bbva-type-link>
        <bbva-divider-default></bbva-divider-default>
      </div>
    `}get _tplOcAccountYoungOfferSections(){return o`
      <div class="offer-panel">
        <bbva-clip-microillustration
          class="microillustration-offer"
          size="M"
          microillustration="youngaccount">
        </bbva-clip-microillustration>
        <bbva-type-text
          class="title-offer"
          tag="h2"
          unset
          size="3XL"
          font-weight="700"
          text="account-origination-oc-account-young-offer-panel-info-title">
        </bbva-type-text>
        <bbva-type-text
          class="description-offer"
          size="S"
          tag="p"
          unset
          text="account-origination-oc-account-young-offer-panel-info-text">
        </bbva-type-text>
      </div>
      ${this._tplBulletList("benefits","account-origination-oc-account-young-offer-category-benefits",Wi,"benefits","account-origination-oc-account-young-offer-benefits-link")}
      ${this._tplBulletList("considerations","account-origination-oc-account-young-offer-category-considerations",Ji,"considerations","account-origination-oc-account-young-offer-considerations-link")}
      ${this._tplCost}
    `}get _tplModal(){return o`
      <bbva-help-modal
        class="offer"
        ?visible="${this.visible}"
        full-height
        hide-content-padding-top
        avoid-icon-close-modal
        .headerButtons="${Yi}"
        header-type="modal-sequential"
        header-text="${this.t("account-origination-oc-account-young-offer-header")}"
        button-text="${this.t("account-origination-oc-account-young-continue-button")}"
        .closeModalElements="${[]}"
        @help-modal-footer-button-click="${this._stopEventAndDispatchEvent}">
          <div slot="slot-content">
            <div class="margin-step">
              ${this._tplOcAccountYoungOfferSections}
            </div>
            ${this._tplNoticePrivacy}
          </div>
      </bbva-help-modal>
    `}get _tplNoticePrivacy(){return o`
      <button
        class="privacy"
        tabindex="-1"
        @click="${this._stopEventAndDispatchEvent}">
        <div class="text-with-icon-wrapper margin-step">
          <bbva-type-icon size="16" class="align-icon" icon="${I()}"></bbva-type-icon>
          <bbva-type-text tag="p" size="2XS" unset text="account-origination-oc-account-young-offer-panel-privacy-text"></bbva-type-text>
        </div>
        <bbva-type-text
          class="margin-step"
          variant="spotlight"
          size="2XS"
          tag="p"
          unset
          text="account-origination-oc-account-young-offer-panel-privacy-link">
        </bbva-type-text>
      </button>
    `}render(){return o`
      ${this._tplModal}
    `}}var ds=h`
.notification-message {
  margin: 1.5rem 1rem;
}

.align-panel {
  margin: 1rem;
}

.align-items {
  display: flex;
  align-items: baseline;
  justify-content: space-between;
  padding: 0.5rem 0;
}

.position {
  text-align: end;
}

.typography {
  font-style: italic;
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0;
}

.success-title {
  margin: 1rem 0 0.5rem;
}
`;class us extends(k(D(u(i)))){static get is(){return"oc-account-young-success"}static get scopedElements(){const t=[X,W,Y,F,G,Z];return us.scopedElementsFromClasses(t)}static get properties(){return{childAccountResponse:{type:Object,attribute:"child-account-response"},digitalServiceFlag:{type:Boolean,attribute:"digital-service-flag"},visible:{type:Boolean}}}static get styles(){return[ds,K.primary,w.primary,Q.primaryAlt,p("oc-account-young-success-shared-styles")]}constructor(){super(),this.visible=!1,this.digitalServiceFlag=!1,this.childAccountResponse={}}updated(t){var e;(super.updated(t),t.has("visible")&&this.visible)&&(this._getShareTemplateReceipt(),this._dispatchCustomEvent("account-origination-oc-account-young-success-open",{currentStep:"success-modal",operationNumber:null===(e=this.childAccountResponse)||void 0===e?void 0:e.operationNumber}))}_getShareTemplateReceipt(){var t,e,i,s,o,a,n,r,c,l,d,u,h;const p={templateSelected:this.digitalServiceFlag?"linkCardWithDigitalServices":"linkCard",title:this.t("account-origination-oc-account-young-success-panel-info-title"),dateTime:`${os("LLL",null===(t=this.childAccountResponse)||void 0===t?void 0:t.operationDate)} h`,description:this.t("account-origination-oc-account-young-success-panel-info-text"),accountNumber:null===(e=this.childAccountResponse)||void 0===e?void 0:e.number,virtualDebitCardNumber:null===(i=this.childAccountResponse)||void 0===i?void 0:i.cardNumber,name:null===(s=this.childAccountResponse)||void 0===s||null===(o=s.participants)||void 0===o||null===(a=o[0])||void 0===a?void 0:a.name,lastName:null===(n=this.childAccountResponse)||void 0===n||null===(r=n.participants)||void 0===r||null===(c=r[0])||void 0===c?void 0:c.firstSurname,secondLastName:null===(l=this.childAccountResponse)||void 0===l||null===(d=l.participants)||void 0===d||null===(u=d[0])||void 0===u?void 0:u.secondSurname,operationFolio:`${null===(h=this.childAccountResponse)||void 0===h?void 0:h.operationNumber} ${this.t("account-origination-oc-account-young-success-bbva")}`};if(this.digitalServiceFlag){var m,g,_,v,y,b;const t={phone:null===(m=this.childAccountResponse)||void 0===m||null===(g=m.participants)||void 0===g||null===(_=g[0])||void 0===_?void 0:_.mobileNumber,email:null===(v=this.childAccountResponse)||void 0===v||null===(y=v.participants)||void 0===y||null===(b=y[0])||void 0===b?void 0:b.email,digitalService:this.t("account-origination-oc-account-young-success-cud"),alerts:this.t("account-origination-oc-account-young-success-active-alerts"),message:this.t("account-origination-oc-account-young-success-notificacion-message-text")};Object.assign(p,t)}this._dispatchCustomEvent("account-origination-oc-account-young-receipt-template-share",p)}static _getValueTag({id:t,value:e,className:i}){return{TEXT:o`
        <bbva-type-text
          class="${i}"
          text="${e}"
          tag="p"
          unset
          size="S"
          alignment="right"
          font-weight="500"
        ></bbva-type-text>
      `}[t]}_shareReceipt(t){t.stopPropagation(),this._dispatchCustomEvent("account-origination-oc-account-young-receipt-share",{operative:this.digitalServiceFlag?"linkCardWithDigitalServices":"linkCard"})}get _tplButtonRow(){return o`
      <bbva-button-row
        ambient="primary-alt"
        .options="${Xi}"
        accessibility-text="${this.t("account-origination-oc-account-young-success-button-row-accessibility-text")}"
        @button-row-item-btn-share-click="${this._shareReceipt}">
      </bbva-button-row>
    `}get _tplHeader(){return o`
      <bbva-header-main
        variant="modal-initial"
        text="${this.t("account-origination-oc-account-young-link-card-header")}">
      </bbva-header-main>

    `}get _tplHelpModal(){return o`
      <bbva-help-modal
        ?visible="${this.visible}"
        full-height
        hide-content-padding-top
        fixed-footer
        header-type="modal-sequential"
        header-text="${this.t("account-origination-oc-account-young-offer-header")}"
        button-text="">
        <div slot="slot-header">
          ${this._tplHeader}
        </div>
        <div slot="slot-content">
          <div class="align-panel">
            <bbva-clip-microillustration size="M" microillustration="success"></bbva-clip-microillustration>
            <bbva-type-text tag="h2" unset class="success-title" size="3XL" font-weight="700" text="account-origination-oc-account-young-success-panel-info-title"></bbva-type-text>
            <bbva-type-text tag="p" unset size="S" text="account-origination-oc-account-young-success-panel-info-text"></bbva-type-text>
          </div>
        <div class="align-panel">
          ${this._tplListSimple}
        </div>
        <div class="notification-message">
          ${this._tplNotificationMessage}
        </div>
        ${this._tplButtonRow}
        </div>
      </bbva-help-modal>
    `}get _tplListSimple(){var t,e,i,s,a,n,r,c,l,d,u,h,p;const m=[];var g,_,v,y,b,f;(m.push({id:"date",description:this.t("account-origination-oc-account-young-success-date"),valueType:{id:"TEXT",value:`${os("D [de] MMMM [de] YYYY, HH:mm [h]",null===(t=this.childAccountResponse)||void 0===t?void 0:t.operationDate)}`,className:"position typography"}}),m.push({id:"account",description:this.t("account-origination-oc-account-young-success-number-account"),valueType:{id:"TEXT",value:null===(e=this.childAccountResponse)||void 0===e?void 0:e.number,className:"position"}}),m.push({id:"card",description:this.t("account-origination-oc-account-young-success-virtual-debit-card"),valueType:{id:"TEXT",value:null===(i=this.childAccountResponse)||void 0===i?void 0:i.cardNumber,className:"position"}}),m.push({id:"name",description:this.t("account-origination-oc-account-young-success-name"),valueType:{id:"TEXT",value:null===(s=this.childAccountResponse)||void 0===s||null===(a=s.participants)||void 0===a||null===(n=a[0])||void 0===n?void 0:n.name,className:"position"}}),m.push({id:"surname",description:this.t("account-origination-oc-account-young-success-surname"),valueType:{id:"TEXT",value:null===(r=this.childAccountResponse)||void 0===r||null===(c=r.participants)||void 0===c||null===(l=c[0])||void 0===l?void 0:l.firstSurname,className:"position"}}),m.push({id:"lastname",description:this.t("account-origination-oc-account-young-success-last-name"),valueType:{id:"TEXT",value:null===(d=this.childAccountResponse)||void 0===d||null===(u=d.participants)||void 0===u||null===(h=u[0])||void 0===h?void 0:h.secondSurname,className:"position"}}),this.digitalServiceFlag)&&(m.push({id:"phone",description:this.t("account-origination-oc-account-young-success-phone-number"),valueType:{id:"TEXT",value:null===(g=this.childAccountResponse)||void 0===g||null===(_=g.participants)||void 0===_||null===(v=_[0])||void 0===v?void 0:v.mobileNumber,className:"position"}}),m.push({id:"email",description:this.t("account-origination-oc-account-young-digital-services-label-email"),valueType:{id:"TEXT",value:null===(y=this.childAccountResponse)||void 0===y||null===(b=y.participants)||void 0===b||null===(f=b[0])||void 0===f?void 0:f.email,className:"position"}}),m.push({id:"digitalServices",description:this.t("account-origination-oc-account-young-success-digital-services"),valueType:{id:"TEXT",value:this.t("account-origination-oc-account-young-success-cud"),className:"position"}}),m.push({id:"alerts",description:this.t("account-origination-oc-account-young-success-alerts"),valueType:{id:"TEXT",value:this.t("account-origination-oc-account-young-success-active-alerts"),className:"position"}}));return m.push({id:"folio",description:this.t("account-origination-oc-account-young-success-operation-folio"),valueType:{id:"TEXT",value:`${null===(p=this.childAccountResponse)||void 0===p?void 0:p.operationNumber} ${this.t("account-origination-oc-account-young-success-bbva")}`,className:"position"}}),o`
      <section class="list-container"> ${null==m?void 0:m.map((({id:t,description:e,valueType:i})=>o`
        <div id="${t}" class="align-items">
          <bbva-type-text tag="p" unset size="S" alignment="left" text="${e}"></bbva-type-text>
          ${us._getValueTag(i)}
        </div>`))}
      </section>
    `}get _tplNotificationMessage(){return this.digitalServiceFlag?o`
      <bbva-notification-message
        variant="default">
        ${this.t("account-origination-oc-account-young-success-notificacion-message-text")}
      </bbva-notification-message>
    `:m}render(){return o`
      ${this._tplHelpModal}
    `}}var hs=h`
:host {
  display: block;
  box-sizing: border-box;
  overflow: hidden;
}

[data-tag-name=bbva-help-modal] {
  z-index: 99;
}

[data-tag-name=bbva-help-modal]#faqsModal {
  --bbva-help-modal-padding: 0;
}

[data-tag-name=help-faqs-aem] {
  text-align: left;
}
`,ps=h`
[data-tag-name=bbva-help-modal] {
  z-index: 99;
  --bbva-help-modal-second-modal-z-index: 99;
  --bbva-help-modal-padding: 0;
}
`;class ms extends(k(D(u(i)))){static get is(){return"oc-account-young-faqs"}static get scopedElements(){const t=[F,Lt,Y,...ms.configurationScopedElements()];return ms.scopedElementsFromClasses(t)}static get properties(){return{attachToBodyFaqs:{type:Boolean,attribute:"attach-to-body-faqs"},optionalParams:{type:Object,attribute:"optional-params"},path:{type:String},visible:{type:Boolean}}}static get styles(){return[hs,ps,w.primary,p("oc-account-young-faqs-shared-styles")]}constructor(){super(),this.visible=!1,this.path="",this.optionalParams={},this.attachToBodyFaqs=!1}updated(t){t.has("optionalParams")&&this.optionalParams&&this._listFaqs&&this._parseFaqs()}_closeModal(t){t.stopPropagation(),this._dispatchCustomEvent("account-origination-oc-account-young-faqs-modal-close")}_parseFaqs(){if(this._listFaqs&&this.optionalParams){var t,e,i;const s=null===(t=this._listFaqs)||void 0===t||null===(e=t.items)||void 0===e||null===(i=e.contentfragmentlist)||void 0===i?void 0:i.items,o=null==s?void 0:s.map((t=>{var e,i,s;const o={...t},a=null==o||null===(e=o.elements)||void 0===e||null===(i=e.answer)||void 0===i||null===(s=i.value)||void 0===s?void 0:s[0];return a&&(o.elements.answer.value[0]=ms._replaceHashes(a,this.optionalParams)),o}));this._listFaqs.items.contentfragmentlist.items=o}}static _replaceHashes(t,e){let i=t;return Object.keys(e).map((t=>(i=i.replace("#",e[t]),i))),i}_setAEMData(t){t.stopPropagation(),this._listFaqs=null==t?void 0:t.detail,this._parseFaqs()}get _tplHelpFaqsAem(){return o`
      <help-faqs-aem
        host="${this.host}"
        content-fragment-path="${this.path}"
        ?native="${this.native}"
        .aemData="${this._listFaqs}"
        faqs-message-text=""
        hide-icon-text
        hide-footer
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        @visible-changed="${t=>t.stopPropagation()}"
        @show-loader="${t=>t.stopPropagation()}"
        @hide-loader="${t=>t.stopPropagation()}"
        @aem-content-fragment-dm-fetch="${this._setAEMData}"
      ></help-faqs-aem>
    `}get _tplHelpModal(){return o`
      <bbva-help-modal
        id="faqsModal"
        ?visible="${this.visible}"
        .contentStyles="${this.attachToBodyFaqs?ps:""}"
        header-text="${this.t("account-origination-oc-account-young-faqs-header-title")}"
        full-height
        fixed-footer
        ?attach-to-body="${this.attachToBodyFaqs}"
        hide-content-padding-top
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        @help-modal-close="${this._closeModal}">
          <div slot="slot-content">${this._tplHelpFaqsAem}</div>
      </bbva-help-modal>
    `}render(){return o`
      ${super.render()}
      ${this._tplHelpModal}
    `}}const gs=({footerButtonClick:t,footerLinkClick:e,veilClick:i,closeModal:s,swipeClose:o,bodyText:a})=>({CONTRACTED_ACCOUNT:{fullHeight:!1,fixedFooter:!1,hideContentPaddingTop:!1,modalType:"caution",headerType:"modal-short",headerText:"account-origination-oc-account-young-modal-incorrect-info-header",titleText:"account-origination-oc-account-young-modal-contracted-account-title",titleIcon:O(),bodyText:"account-origination-oc-account-young-modal-contracted-account-body",buttonText:"account-origination-oc-account-young-modify-label",linkText:"account-origination-oc-account-young-see-branches-link-button",closeModalElements:["footer-button","footer-link","header","veil"],footerButtonClick:t,footerLinkClick:e,veilClick:i,closeModal:s,swipeClose:o},RENAPO_ERROR:{fullHeight:!1,fixedFooter:!1,hideContentPaddingTop:!1,headerType:"modal-short",modalType:"caution",headerText:"account-origination-oc-account-young-modal-incorrect-info-header",titleText:"account-origination-oc-account-young-modal-renapo-error-title",titleIcon:O(),bodyText:"account-origination-oc-account-young-modal-renapo-error-body",buttonText:"account-origination-oc-account-young-modify-label",linkText:"account-origination-oc-account-young-see-branches-link-button",closeModalElements:["footer-button","footer-link","header"],footerButtonClick:t,footerLinkClick:e,veilClick:i,closeModal:s,swipeClose:o},REGISTRY_MATCH_ERROR:{fullHeight:!1,fixedFooter:!1,hideContentPaddingTop:!1,headerType:"modal-short",modalType:"caution",headerText:"account-origination-oc-account-young-additional-info-invalid-registry-header",titleText:"account-origination-oc-account-young-additional-info-invalid-registry-title",titleIcon:O(),linkText:"",bodyText:"account-origination-oc-account-young-additional-info-invalid-registry-body",buttonText:"account-origination-oc-account-young-additional-info-invalid-registry-button-text",closeModalElements:["footer-button","header"],footerButtonClick:t,veilClick:i,closeModal:s,swipeClose:o},REGISTRY_MATCH_ERROR_EXIT:{fullHeight:!1,fixedFooter:!1,hideContentPaddingTop:!1,headerType:"modal-short",modalType:"caution",headerText:"account-origination-oc-account-young-additional-info-no match-registry-header",titleText:"",titleIcon:O(),bodyText:"account-origination-oc-account-young-additional-info-no match-registry-body",buttonText:"account-origination-oc-account-young-close-button",linkText:"account-origination-oc-account-young-see-branches-link-button",closeModalElements:["footer-button","footer-link","header"],footerButtonClick:t,footerLinkClick:e,veilClick:i,closeModal:s,swipeClose:o},INCORRECT_NUMBER:{fullHeight:!1,fixedFooter:!1,hideContentPaddingTop:!1,headerType:"modal-short",modalType:"caution",headerText:"account-origination-oc-account-young-modal-incorrect-info-header",titleText:"account-origination-oc-account-young-modal-incorrect-number-title",titleIcon:O(),bodyText:"account-origination-oc-account-young-modal-incorrect-number-body",buttonText:"account-origination-oc-account-young-modify-label",closeModalElements:["footer-button","veil","header"],linkText:"",footerButtonClick:t,veilClick:i,closeModal:s,swipeClose:o},FILE_DELETE:{fullHeight:!1,fixedFooter:!1,hideContentPaddingTop:!1,headerType:"modal-short",modalType:"caution",headerText:"account-origination-oc-account-young-modal-file-delete-header",titleText:"account-origination-oc-account-young-modal-file-delete-title",titleIcon:O(),bodyText:"account-origination-oc-account-young-modal-file-delete-body",buttonText:"account-origination-oc-account-young-modal-file-delete-button",linkText:"account-origination-oc-account-young-modal-file-delete-link",footerButtonClick:t,footerLinkClick:e,veilClick:i,closeModal:s,swipeClose:o},CLOSE_PROCESS:{fullHeight:!1,fixedFooter:!1,hideContentPaddingTop:!1,headerType:"modal-short",modalType:"caution",headerText:"account-origination-oc-account-young-modal-close-process-header",titleText:"",titleIcon:O(),bodyText:"account-origination-oc-account-young-modal-close-process-body",buttonText:"account-origination-oc-account-young-close-button",linkText:"account-origination-oc-account-young-modal-return-link",footerButtonClick:t,footerLinkClick:e,veilClick:i,closeModalElements:["footer-button","footer-link","header"],closeModal:s,swipeClose:o},OPEN_TERMS_BROWSER:{id:"termsBrowserModal",fullHeight:!1,fixedFooter:!1,hideContentPaddingTop:!1,modalType:"caution",headerText:"account-origination-oc-account-young-modal-terms-browser-header",titleIcon:O(),titleText:"",subTitleText:"",bodyText:"account-origination-oc-account-young-modal-terms-browser-body",complementaryText:"account-origination-oc-account-young-modal-terms-browser-complementary-text",optionalText:"",buttonText:"account-origination-oc-account-young-continue-button",linkText:"account-origination-oc-account-young-modal-return-link",panel:!0,footerButtonClick:t,footerLinkClick:e,veilClick:i,closeModal:s,swipeClose:o},OPEN_GAT_BROWSER:{fullHeight:!1,fixedFooter:!1,hideContentPaddingTop:!1,headerType:"modal-short",modalType:"caution",headerText:"account-origination-oc-account-young-modal-gat-browser-header",titleText:"",subTitleText:"",titleIcon:O(),bodyText:"account-origination-oc-account-young-modal-gat-browser-body",complementaryText:"account-origination-oc-account-young-modal-gat-browser-complementary-text",optionalText:"",buttonText:"account-origination-oc-account-young-continue-button",linkText:"account-origination-oc-account-young-modal-return-link",panel:!0,footerButtonClick:t,footerLinkClick:e,veilClick:i,closeModal:s,swipeClose:o},MODIFY_STEP:{fullHeight:!1,fixedFooter:!1,hideContentPaddingTop:!1,headerType:"modal-short",modalType:"caution",headerText:"account-origination-oc-account-young-modify-label",titleText:"account-origination-oc-account-young-modal-modify-step-title",titleIcon:O(),bodyText:"account-origination-oc-account-young-modal-modify-step-body",buttonText:"account-origination-oc-account-young-modify-label",linkText:"account-origination-oc-account-young-modal-return-link",footerButtonClick:t,footerLinkClick:e,veilClick:i,closeModal:s,swipeClose:o},DIGITAL_SERVICES:{fullHeight:!1,fixedFooter:!1,hideContentPaddingTop:!1,headerType:"modal-short",modalType:"",headerText:"account-origination-oc-account-young-multistep-digital-services-header",titleText:"account-origination-oc-account-young-modal-digital-services-title",subTitleText:"",titleIcon:E(),bodyText:"account-origination-oc-account-young-modal-digital-services-body",complementaryText:"account-origination-oc-account-young-modal-digital-services-complementary-text",optionalText:"account-origination-oc-account-young-modal-digital-services-optional-text",buttonText:"",linkText:"",panel:!0,veilClick:i,swipeClose:o},NOTICE_PRIVACY:{fullHeight:!1,fixedFooter:!1,hideContentPaddingTop:!1,modalType:"",headerType:"modal-sequential",headerText:"account-origination-oc-account-young-modal-notice-privacy-header",titleText:"",subTitleText:"",titleIcon:"",bodyText:"account-origination-oc-account-young-modal-notice-privacy-body",complementaryText:"account-origination-oc-account-young-modal-notice-privacy-complementary-text",optionalText:"",buttonText:"",linkText:"",panel:!0,veilClick:i,closeModal:s,swipeClose:o},CHOOSE_FILE:{fullHeight:!1,fixedFooter:!1,hideContentPaddingTop:!1,id:"CHOOSE_FILE",modalType:"",headerType:"modal-short",headerText:"account-origination-oc-account-young-modal-choose-file-header",titleText:"",titleIcon:"",bodyText:"account-origination-oc-account-young-modal-choose-file-body",buttonText:"",linkText:"",panel:!0,veilClick:i,closeModal:s,swipeClose:o},PHOTO_SUGGESTIONS:{fullHeight:!1,fixedFooter:!1,hideContentPaddingTop:!1,headerType:"modal-sequential",modalType:"",headerText:"account-origination-oc-account-young-modal-photo-suggestions-header",titleText:"",subTitleText:"account-origination-oc-account-young-modal-photo-suggestions-body",titleIcon:"",bodyText:"",complementaryText:"",optionalText:"",buttonText:"account-origination-oc-account-young-continue-button",illustration:"camera",list:Qi,linkText:"",panel:!0,footerButtonClick:t,veilClick:i,closeModal:s,swipeClose:o},UPDATE_DOCUMENTS:{fullHeight:!0,fixedFooter:!0,hideContentPaddingTop:!0,headerType:"modal-sequential",modalType:"",headerText:"account-origination-oc-account-young-offer-header",titleText:"",subTitleText:"account-origination-oc-account-young-modal-update-documents-subtitle",titleIcon:"",bodyText:"account-origination-oc-account-young-modal-update-documents-body",complementaryText:"",optionalText:"",buttonText:"account-origination-oc-account-young-see-branches-link-button",illustration:"caution",list:[],linkText:"",panel:!0,footerButtonClick:t,veilClick:i,closeModal:s},ACCOUNT_LIMIT:{fullHeight:!0,fixedFooter:!0,hideContentPaddingTop:!0,headerType:"modal-sequential",headerText:"account-origination-oc-account-young-link-card-header",titleText:"",subTitleText:"account-origination-oc-account-young-modal-account-limit-subtitle",titleIcon:"",complementaryText:"",bodyText:"account-origination-oc-account-young-modal-account-limit-body",optionalText:"",illustration:"caution",list:[],linkText:"",buttonText:"account-origination-oc-account-young-close-button",panel:!0,headerButtons:Yi,footerButtonClick:t,veilClick:i,closeModal:s},DEPOSIT_LIMIT:{id:"depositLimitModal",fixedFooter:!0,hideContentPaddingTop:!0,headerType:"modal-sequential",headerText:"account-origination-oc-account-young-modal-deposit-limit-header",titleText:"",subTitleText:"account-origination-oc-account-young-modal-deposit-limit-subtitle",titleIcon:"",bodyText:a,complementaryText:"account-origination-oc-account-young-modal-deposit-limit-complementary-text",optionalText:"",illustration:"info",buttonText:"",linkText:"",panel:!0,fullHeight:!0,headerButtons:Yi,footerButtonClick:t,closeModal:s},RENAPO_VALIDATION_ERROR:{fullHeight:!0,fixedFooter:!0,hideContentPaddingTop:!0,headerType:"modal-sequential",headerText:"account-origination-oc-account-young-link-card-header",titleText:"",subTitleText:"account-origination-oc-account-young-modal-renapo-validation-error-subtitle",titleIcon:"",bodyText:"account-origination-oc-account-young-modal-file-error-body",complementaryText:"",optionalText:"",illustration:"error",list:Zi,buttonText:"account-origination-oc-account-young-close-button",linkText:"account-origination-oc-account-young-see-branches-link-button",panel:!0,footerButtonClick:t,footerLinkClick:e,veilClick:i,closeModal:s},PHOTO_ERROR:{fullHeight:!0,fixedFooter:!0,hideContentPaddingTop:!0,headerType:"modal-sequential",headerText:"account-origination-oc-account-young-link-card-header",titleText:"",subTitleText:"account-origination-oc-account-young-modal-photo-error-subtitle",titleIcon:"",bodyText:"account-origination-oc-account-young-modal-file-error-body",optionalText:"",complementaryText:"",illustration:"error",list:Zi,buttonText:"account-origination-oc-account-young-close-button",linkText:"account-origination-oc-account-young-see-branches-link-button",panel:!0,footerButtonClick:t,footerLinkClick:e,veilClick:i,closeModal:s},PDF_FILE_ERROR:{fullHeight:!0,fixedFooter:!0,hideContentPaddingTop:!0,headerType:"modal-sequential",headerText:"account-origination-oc-account-young-link-card-header",titleText:"",subTitleText:"account-origination-oc-account-young-modal-pdf-file-error-subtitle",titleIcon:"",bodyText:"account-origination-oc-account-young-modal-file-error-body",optionalText:"",complementaryText:"",illustration:"error",list:Zi,buttonText:"account-origination-oc-account-young-close-button",linkText:"account-origination-oc-account-young-see-branches-link-button",panel:!0,footerButtonClick:t,footerLinkClick:e,veilClick:i,closeModal:s},CUSTOMER_CREATION_ERROR:{fullHeight:!0,fixedFooter:!0,hideContentPaddingTop:!0,headerType:"modal-sequential",headerText:"account-origination-oc-account-young-link-card-header",titleText:"",subTitleText:"account-origination-oc-account-young-modal-customer-creation-error-subtitle",titleIcon:"",bodyText:"account-origination-oc-account-young-modal-file-error-body",complementaryText:"",optionalText:"",illustration:"error",list:Zi,buttonText:"account-origination-oc-account-young-close-button",linkText:"account-origination-oc-account-young-see-branches-link-button",panel:!0,footerButtonClick:t,footerLinkClick:e,veilClick:i,closeModal:s},COMMON_ERROR:{fullHeight:!1,fixedFooter:!1,hideContentPaddingTop:!1,headerType:"modal-short",modalType:"warning",headerText:"account-origination-oc-account-young-modal-common-error-header",titleText:"",subTitleText:"",titleIcon:$(),bodyText:"account-origination-oc-account-young-modal-common-error-body",complementaryText:"",optionalText:"",buttonText:"account-origination-oc-account-young-modal-common-error-button",linkText:"account-origination-oc-account-young-modal-common-error-link",panel:!0,footerButtonClick:t,footerLinkClick:e,veilClick:i,closeModal:s,swipeClose:o}});var _s=h`
:host {
  display: block;
  box-sizing: border-box;
  min-height: 100%;
  background-color: var(--_account-origination-oc-account-young-bg);
  --bbva-progress-content-z-index: 11;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}
`,vs=h`
  :host {
    --_account-origination-oc-account-young-bg: var(
      --account-origination-oc-account-young--_ambient--bg,
      var(
        --account-origination-oc-account-young--custom--primary-ambient--bg,
        ${tt("colorPrimarySurfaceAmbientDefault",et)}
      )
    );

    --_account-origination-oc-account-young-summary-content-bg: var(
      --account-origination-oc-account-young--_ambient--summary-content-bg,
      var(
        --account-origination-oc-account-young--custom--primary-ambient--summary-content-bg,
        ${tt("colorPrimarySurfaceAmbientDefault",et)}
      )
    );
  }
`;class ys extends(k(D(u(i)))){static get is(){return"account-origination-oc-account-young"}static get scopedElements(){const t=[rs,ls,us,Ki,ms,ki,...ys.configurationScopedElements()];return ys.scopedElementsFromClasses(t)}static get properties(){return{accounstApiVersion:{type:String,attribute:"account-api-version"},aemHost:{type:String,attribute:"aem-host"},aemHelpFaqsPath:{type:String,attribute:"aem-help-faqs-path"},accountLevel:{type:String,attribute:"account-level"},attachToBody:{type:Boolean,attribute:"attach-to-body"},birthplaceSelected:{type:String,attribute:"birthplace-selected"},branchName:{type:Object,attribute:"branch-name"},cellsPhoneNumber:{type:String,attribute:"cells-phone-number"},civilRegistriesSearchApiVersion:{type:String,attribute:"civil-registries-search-api-version"},customerAddressesApiVersion:{type:String,attribute:"customer-addresses-api-version"},customerChildCustomerApiVersion:{type:String,attribute:"customer-child-customer-api-version"},customerContactDetailsApiVersion:{type:String,attribute:"customer-contact-details-api-version"},customerIdentificationProcessDocumentsApiVersion:{type:String,attribute:"customer-identification-process-documents-api-version"},customerId:{type:String,attribute:"customer-id"},catalogId:{type:String,attribute:"catalog-id"},catalogsApiVersion:{type:String,attribute:"catalogs-api-version"},contentData:{type:String,attribute:"content-data"},countryName:{type:String,attribute:"country-name"},country:{type:String},colonySelected:{type:Object,attribute:"colony-selected"},componentTypes:{type:Object,attribute:"component-types"},contractTemplates:{type:Object,attribute:"contract-templates"},contractingConsents:{type:Object,attribute:"contracting-consents"},documentType:{type:String,attribute:"document-type"},externalLink:{type:String,attribute:"external-link"},geographicPlacesApiVersion:{type:String,attribute:"geographic-places-api-version"},incompleteFile:{type:Boolean,attribute:"incomplete-file"},limitId:{type:String,attribute:"limit-id"},modalVisible:{type:Boolean,attribute:"modal-visible"},modalVisibleSuggest:{type:Boolean,attribute:"modal-visible-suggest"},maxLengthIdentificationKey:{type:Number,attribute:"max-length-identification-key"},maxAge:{type:Object,attribute:"max-age"},maxRetries:{type:Number,attribute:"max-retries"},metadata:{type:Object},metadataDocument:{type:Object,attribute:"metadata-document"},metadataDocumentType:{type:Object,attribute:"metadata-document-type"},metadataFlow:{type:Object,attribute:"metadata-flow"},metadataOperationType:{type:Object,attribute:"metadata-operation-type"},metadataProduct:{type:Object,attribute:"metadata-product"},metadataTemporal:{type:Object,attribute:"metadata-temporal"},multipartDocumentName:{type:String,attribute:"multipart-document-name"},multipartFile:{type:String,attribute:"multipart-file"},multipartMediaType:{type:String,attribute:"multipart-media-type"},multipartType:{type:String,attribute:"multipart-type"},nationality:{type:String},processDocumentsId:{type:String,attribute:"process-documents-id"},productsApiVersion:{type:String,attribute:"products-api-version"},selectedDate:{type:String,attribute:"selected-date"},showOfferPage:{type:Boolean,attribute:"show-offer-page"},showMultiStepPage:{type:Boolean,attribute:"show-multi-step-page"},subproductId:{type:String,attribute:"subproduct-id"},showSuccessPage:{type:Boolean,attribute:"show-success-page"},showHelpFaqs:{type:Boolean,attribute:"show-help-faqs"},productId:{type:String,attribute:"product-id"},phoneCompanyId:{type:String,attribute:"phone-company-id"},paramsCreateAccount:{type:Object,attribute:"params-create-account"},toastDuration:{type:String,attribute:"toast-duration"},unmasked:{type:Boolean},verificationTypeId:{type:String,attribute:"verification-type-id"},verificationTypeStatusId:{type:String,attribute:"verification-type-status-id"},birthplaces:{type:Array},homonomyId:{type:String,attribute:"homonomy-id"},_addressHome:{type:Array,state:!0},_addressHomeUnmasked:{type:Array,state:!0},_customerIdChild:{type:String,state:!0},_colonySelect:{type:Object,state:!0},_childAccountResponse:{type:Object,state:!0},_customerInfo:{type:Object,state:!0},_cpAddressResponse:{type:Array,state:!0},_civilRegistries:{type:Array,state:!0},_digitalService:{type:Boolean,state:!0},_digitalServicesData:{type:Object,state:!0},_disconnectMultistep:{type:Boolean,state:!0},_dataUploadedImage:{type:Object,state:!0},_bodyToCreateAccount:{type:Object,state:!0},_bodyToCreateCustomerChild:{type:Object,state:!0},_editDigitalServiceStep:{type:Boolean,state:!0},_editStep:{type:Boolean,state:!0},_initialized:{type:Boolean,state:!0},_isCompleted:{type:Boolean,state:!0},_retriesConfig:{type:Object,state:!0},_requestBodyCivilRegistries:{type:Object,state:!0},_messageToast:{type:String,state:!0},_noMatchRegistry:{type:Boolean,state:!0},_navigationStack:{type:Array,state:!0},_productLimitsData:{type:Object,state:!0},_resetValue:{type:Boolean,state:!0},_optionalParamsFaqs:{type:Object,state:!0},_showSuccessToast:{type:Boolean,state:!0},_showFaqsModal:{type:Boolean,state:!0},_userEmail:{type:String,state:!0},_zipCode:{type:String,state:!0},_zipCodeInvalid:{type:Boolean,state:!0},_renderMultistep:{type:Boolean,state:!0},_typePlugin:{type:String,state:!0}}}constructor(){super(),this.accounstApiVersion=0,this.catalogsApiVersion=0,this.civilRegistriesSearchApiVersion=0,this.customerAddressesApiVersion=0,this.customerChildCustomerApiVersion=0,this.customerContactDetailsApiVersion=0,this.customerIdentificationProcessDocumentsApiVersion=0,this.geographicPlacesApiVersion=0,this.productsApiVersion=0,this.cellsPhoneNumber="",this._userEmail="",this.customerId="",this.config={loader:!0},this._cpAddressResponse=[],this._addressHome=[],this._addressHomeUnmasked=[],this.unmasked=!1,this.showOfferPage=!1,this.showMultiStepPage=!1,this.modalVisible=!1,this.modalVisibleSuggest=!1,this._dataUploadedImage={},this._colonySelect={},this._showFaqsModal=!1,this.aemHost="",this.aemHelpFaqsPath="",this.birthplaces=[],this._civilRegistries=[],this.productId="",this.subproductId="",this.accountLevel="",this.limitId="",this.externalLink="",this._customerIdChild="",this._productLimitsData={},this._editStep=!1,this._resetValue=!1,this._navigationStack=[],this.showSuccessPage=!1,this.showHelpFaqs=!1,this.maxLengthIdentificationKey=0,this.maxAge={},this.catalogId="",this._initialized=!1,this.selectedDate="",this.birthplaceSelected="",this.colonySelected={},this._requestBodyCivilRegistries={},this.country="",this.paramsCreateAccount={},this.contractTemplates={},this.contractingConsents={},this._childAccountResponse={},this._zipCodeInvalid=!1,this._zipCode="",this._noMatchRegistry=!1,this._retriesConfig={GETPLACES:0,GETADDRESSES:0,GETCONTACTDETAILS:0,GETPRODUCTLIMITS:0,CIVILREGISTRIES:0,GETCATALOGS:0,POSTCUSTOMERSCHILDCUSTOMERS:0,POSTACCOUNTSOPENINGCHILDACCOUNT:0,POSTCUSTOMERIDENTIFICATIONPROCESSDOCUMENTS:0,OPENMEDIACAPTURE:0,OPENFILEFETCHER:0},this.maxRetries=3,this._bodyToCreateAccount={},this._digitalService=!1,this.phoneCompanyId="",this.countryName="",this._isCompleted=!1,this._digitalServicesData={},this._bodyToCreateCustomerChild={},this._editDigitalServiceStep=!1,this._showSuccessToast=!1,this._messageToast="",this._optionalParamsFaqs={},this._customerInfo={},this.contentData="",this.branchName={},this._renderMultistep=!1,this._typePlugin="",this.documentType="",this.verificationTypeId="",this.verificationTypeStatusId="",this.metadataDocumentType={},this.metadataProduct={},this.metadataOperationType={},this.metadataTemporal={},this.metadataFlow={},this.metadataDocument={},this.multipartType="",this.multipartMediaType="",this.multipartDocumentName="",this.multipartFile="",this.processDocumentsId="",this.homonomyId="",this.toastDuration="",this.nationality="",this.componentTypes={},this.metadata={},this.attachToBody=!1}static get styles(){return[_s,vs,it.primary,p("account-origination-oc-account-young-shared-styles")]}updated(t){t.has("incompleteFile")&&void 0!==this.incompleteFile&&(this.incompleteFile?(this.modalConfig=gs({footerButtonClick:this._viewBranches.bind(this)}).UPDATE_DOCUMENTS,this.modalVisible=!0,this._saveNavigation("incompleteFileModal"),this._dispatchCustomEvent("account-origination-oc-account-young-incomplete-file-modal-open"),this.clearLoader()):this._getInitServices())}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._addListeners()}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this._removeListeners()}init(){this._initialized||(this.showLoader(),this._dispatchCustomEvent("account-origination-oc-account-young-initialize"),this._initialized=!0)}openPdfError(){this.clearLoader(),this.modalConfig=gs({veilClick:this._removeLastNavigationElement.bind(this)}).COMMON_ERROR,this.modalVisible=!0,this._saveNavigation("modal")}permissionsSuccess(){this._addFile()}permissionsError(){this._closeModalSuggestions(),this._removeModal()}_getMobilePlatform(t){"file"===(null==t?void 0:t.detail)&&(this._typePlugin=null==t?void 0:t.detail),this._dispatchCustomEvent("account-origination-oc-account-young-mobile-platform-get")}mobilPlatformInfo(t){if("iOS"===(null==t?void 0:t.platformName)&&parseFloat(null==t?void 0:t.versionName)>15||"ANDROID"===(null==t?void 0:t.platformName)&&parseFloat(null==t?void 0:t.versionName)>12)this._addFile();else{const t=this.iOSFixedHeader?"media-library":"read-storage";this._dispatchCustomEvent("account-origination-oc-account-young-permissions-file-check",t)}}validatePermissionsFile(t){"granted"!==(null==t?void 0:t.state)&&"partially_granted"!==(null==t?void 0:t.state)||this._addFile(),"denied"===(null==t?void 0:t.state)||"permanently_denied"===(null==t?void 0:t.message)?this._permissionsFile():100===(null==t?void 0:t.code)&&this._addFile()}_openMediaCapture(t){const e={source:t,quality:65,showMetadata:!0,base64:!0,monochrome:!1,scaleType:"maxWeight",scaleRate:6};this._dispatchCustomEvent("account-origination-oc-account-young-media-capture-open",e)}_permissionsFile(){this._dispatchCustomEvent("account-origination-oc-account-young-camera-permissions-request","read-storage")}mediaCaptureSuccess(t){this._closeModalSuggestions(),this._removeModal(),this._dataUploadedImage=t,null!=t&&t.extension||(this._dataUploadedImage.extension=as(null==t?void 0:t.name)),this._messageToast=this.t("account-origination-oc-account-young-birth-certificate-image-success-message-toast"),this._showSuccessToast=!0}mediaCaptureError(t){"Canceled"!==(null==t?void 0:t.message)&&(this._closeModalSuggestions(),this._removeModal(),this._manageError("OPENMEDIACAPTURE"))}filefetcherSuccess(t){var e;this.modalVisibleSuggest&&this._closeModalSuggestions(),this._removeModal(),this._dataUploadedImage=t,null!=t&&t.extension||(this._dataUploadedImage.extension=as(null==t?void 0:t.name)),this._messageToast="pdf"===(null===(e=this._dataUploadedImage)||void 0===e?void 0:e.extension)?this.t("account-origination-oc-account-young-birth-certificate-pdf-success-message-toast"):this.t("account-origination-oc-account-young-birth-certificate-image-success-message-toast"),this._showSuccessToast=!0}fileFetcherError(t){"Canceled"!==(null==t?void 0:t.message)&&(this.modalVisibleSuggest&&this._closeModalSuggestions(),this._removeModal(),this._manageError("OPENFILEFETCHER"))}async resetOperative(){this.showOfferPage=!1,this._editStep=!0,this._initialized=!1,this.incompleteFile=void 0,await this.updateComplete,this.resetSteps(),this._popStackNavigation()}resetSteps(){this.modalVisible=!1,this._civilRegistries=[],this._editStep=!1,this._resetValue=!0,this._dataUploadedImage={},this._cpAddressResponse=[],this._colonySelect={},this.selectedDate="",this.birthplaceSelected="",this._zipCodeInvalid=!1,this.unmasked=!1,this._zipCode="",this._bodyToCreateCustomerChild={},this._disconnectMultistep=!1,this._isCompleted=!1,this._bodyToCreateCustomerChild={},this._showSuccessToast=!1}setCustomerInfo(t){this._customerInfo=t}showMultiStep(){this.showOfferPage=!1,this._renderMultistep=!0,this.showMultiStepPage=!0,0===this.birthplaces.length&&this._onGetCatalogs(),this._saveNavigation("multistep"),this.clearLoader()}_addBodyText(t){var e,i,s,o,a,n,r,c,l;return"DEPOSIT_LIMIT"===t?{bodyText:this.t("account-origination-oc-account-young-modal-deposit-limit-body",{udis:ts(null===(e=this._productLimitsData)||void 0===e||null===(i=e.amountLimits[1])||void 0===i?void 0:i.amount,null===(s=this._productLimitsData)||void 0===s||null===(o=s.amountLimits[0])||void 0===o?void 0:o.currency),amount:ts(null===(a=this._productLimitsData)||void 0===a||null===(n=a.amountLimits[0])||void 0===n?void 0:n.amount,null===(r=this._productLimitsData)||void 0===r||null===(c=r.amountLimits[0])||void 0===c?void 0:c.currency),date:is(null===(l=this._productLimitsData)||void 0===l?void 0:l.calculationDate)})}:{bodyText:""}}_addListeners(){this.addEventListener("account-origination-oc-account-young-header-button-faqs-click",this._openFaqs.bind(this)),this.addEventListener("account-origination-oc-account-young-header-button-close-click",this._removeLastNavigationElement.bind(this))}_addFile(){"camera"===this._typePlugin?this._openMediaCapture("camera"):"gallery"===this._typePlugin?this._openMediaCapture("gallery"):this._openFileFetcher()}_removeListeners(){this.removeEventListener("account-origination-oc-account-young-header-button-faqs-click",this._openFaqs.bind(this)),this.removeEventListener("account-origination-oc-account-young-header-button-close-click",this._removeLastNavigationElement.bind(this))}_bindDataFromCivilRegistries({detail:t}){var e,i,s;void 0===(null==t||null===(e=t[0])||void 0===e||null===(i=e.identityDocuments)||void 0===i||null===(s=i[0])||void 0===s?void 0:s.documentNumber)?(this.modalConfig=gs({footerButtonClick:this._removeModal.bind(this),footerLinkClick:this._viewBranches.bind(this),veilClick:this._removeModal.bind(this),swipeClose:this._removeModal.bind(this)}).RENAPO_ERROR,this.modalVisible=!0,this._saveNavigation("modal")):(this._civilRegistries=t,this.requestUpdate()),this.clearLoader()}_bindErrorFromCivilRegistries({detail:t}){const e=t;"dataNoMatch"===(null==e?void 0:e.code)?(this.modalConfig=gs({footerButtonClick:this._noMatchRegistry?this._closeOperative.bind(this):this._removeModal.bind(this),footerLinkClick:this._viewBranches.bind(this),veilClick:this._noMatchRegistry?this._closeOperative.bind(this):this._removeModal.bind(this),swipeClose:this._noMatchRegistry?this._closeOperative.bind(this):this._removeModal.bind(this)})[this._noMatchRegistry?"REGISTRY_MATCH_ERROR_EXIT":"REGISTRY_MATCH_ERROR"],this.modalVisible=!0,this._noMatchRegistry?(this._dispatchCustomEvent("account-origination-oc-account-young-registry-match-error-modal-open"),this._saveNavigation("noMatchRegistryModal")):this._saveNavigation("modal"),this._noMatchRegistry=!0):this._manageError("CIVILREGISTRIES"),this.clearLoader()}_bindErrorFromCustomerChildCustomer({detail:t}){const e=t;this.showMultiStepPage=!0,this._digitalService=!1,"phoneAlreadyExists"===(null==e?void 0:e.code)?(this.modalConfig=gs({footerButtonClick:this._editDigitalService.bind(this),veilClick:this._editDigitalService.bind(this),swipeClose:this._editDigitalService.bind(this)}).INCORRECT_NUMBER,this.modalVisible=!0,this._saveNavigation("invalidNumberModal")):"invalidParameters"===(null==e?void 0:e.code)?(this.modalConfig=gs({footerButtonClick:this._closeOperative.bind(this)}).ACCOUNT_LIMIT,this.modalVisible=!0,this._saveNavigation("accountLimitModal"),this._dispatchCustomEvent("account-origination-oc-account-young-account-limit-modal-open")):this._manageError("POSTCUSTOMERSCHILDCUSTOMERS"),this.clearLoader()}_bindErrorFromAccountsOpeningChildAccount({detail:t}){const e=t;this.showMultiStepPage=!0,"invalidParameters"===(null==e?void 0:e.code)?(this.modalConfig=gs({footerButtonClick:this._removeModal.bind(this),footerLinkClick:this._viewBranches.bind(this),veilClick:this._removeModal.bind(this),swipeClose:this._removeModal.bind(this)}).CONTRACTED_ACCOUNT,this.modalVisible=!0,this._saveNavigation("modal")):this._manageError("POSTACCOUNTSOPENINGCHILDACCOUNT"),this.clearLoader()}_bindDataFromGetCatalogs({detail:t}){t&&t.length>0&&(this.birthplaces=t.map((t=>({...t,selected:!1}))))}_bindDataPlaces({detail:t}){t?(this._cpAddressResponse=t.map(((t,e)=>({...t,value:null==t?void 0:t.name,selected:0===e}))),[this._colonySelect]=this._cpAddressResponse,this._dispatchCustomEvent("account-origination-oc-account-young-places-send",this._cpAddressResponse)):this._zipCodeInvalid=!0,this.clearLoader()}_bindDataFromProductLimits({detail:t}){this.clearLoader(),this._productLimitsData=null==t?void 0:t.data[0],this._optionalParamsFaqs=this._buildOptionalParams(),this.showOfferPage=!0,this._saveNavigation("offer")}_bindDataFromCustomerContactDetails({detail:t}){const e=t.find((t=>{var e;return"EMAIL"===(null==t||null===(e=t.contact)||void 0===e?void 0:e.contactDetailType.toUpperCase())}));var i;e&&(this._userEmail=null==e||null===(i=e.contact)||void 0===i?void 0:i.address)}_bindDataFromCustomerChildCustomer({detail:t}){this._customerIdChild=null==t?void 0:t.id,this._isCompleted=!0,this.showMultiStepPage=!0,this.clearLoader()}_bindDataFromAccountsOpeningChildAccount({detail:t}){this._childAccountResponse=t,this._onPostCustomerIdentificationProcessDocuments()}_bindDataFromCustomerIdentificationProcessDocuments(){this.clearLoader(),this.showMultiStepPage=!1,this.showSuccessPage=!0,this._saveNavigation("success")}_buildOptionalParams(){var t,e,i,s,o,a,n,r,c;return{udis:ts(null===(t=this._productLimitsData)||void 0===t||null===(e=t.amountLimits[1])||void 0===e?void 0:e.amount,null===(i=this._productLimitsData)||void 0===i||null===(s=i.amountLimits[0])||void 0===s?void 0:s.currency),amount:ts(null===(o=this._productLimitsData)||void 0===o||null===(a=o.amountLimits[0])||void 0===a?void 0:a.amount,null===(n=this._productLimitsData)||void 0===n||null===(r=n.amountLimits[0])||void 0===r?void 0:r.currency),date:is(null===(c=this._productLimitsData)||void 0===c?void 0:c.calculationDate)}}closeModal(){this.modalVisible=!1,this._removeLastNavigationElement()}_closeModalSuggestions(){this.modalVisibleSuggest=!1,this._popStackNavigation()}_closeFaqs(){this._showFaqsModal=!1,this._popStackNavigation()}_closeMultistep(){this.modalVisible=!1,this.showMultiStepPage=!1,this.showOfferPage=!0,this._disconnectMultistep=!0,this._resetValue=!1,this._navigationStack=["offer"],this._dispatchCustomEvent("account-origination-oc-account-young-multistep-close")}_closeOperative(){this.showMultiStepPage=!1;"noMatchRegistryModal"===this._navigationStack[this._navigationStack.length-1]&&this._dispatchCustomEvent("account-origination-oc-account-young-registry-match-error-exit"),this._dispatchCustomEvent("account-origination-oc-account-young-operative-close")}_closeSuccess(){this.showSuccessPage=!1,this._navigationStack=["offer"],this._closeOperative()}_closeElement(t){return{faqs:this._closeFaqs.bind(this),modal:this._removeModal.bind(this),multistep:this._manageMultistepClose.bind(this),offer:this._closeOperative.bind(this),success:this._closeSuccess.bind(this),incompleteFileModal:this._closeOperative.bind(this),noMatchRegistryModal:this._closeOperative.bind(this),errorModal:this._closeOperative.bind(this),invalidNumberModal:this._editDigitalService.bind(this),accountLimitModal:this._closeOperative.bind(this),modalSuggestions:this._closeModalSuggestions.bind(this)}[t]}_clearZipCodeAddress(){this._cpAddressResponse=[],this._colonySelect={},this._zipCodeInvalid=!1}_editStepDigitalServices(){this._isCompleted=!1,this._editDigitalServiceStep=!1}_editDigitalService(){this.modalVisible=!1,this._digitalService=!0,this._popStackNavigation()}_editStepModal(t){const e="digital-services-step"===(null==t?void 0:t.detail);this._resetValue=!1,this.modalConfig=gs({footerButtonClick:e?this._editStepDigitalService.bind(this):this._editStepMinorInfo.bind(this),footerLinkClick:this.closeModal.bind(this),closeModal:this.closeModal.bind(this),swipeClose:this.closeModal.bind(this)}).MODIFY_STEP,this.modalVisible=!0,this._saveNavigation("modal")}_editStepDigitalService(){this._editDigitalServiceStep=!0,this.modalVisible=!1,this._popStackNavigation()}_editStepMinorInfo(){this._editStep=!0,this.modalVisible=!1,this._popStackNavigation()}_deleteImageModal({detail:t}){this.modalConfig=gs({footerButtonClick:this._resetDataUploadedImage.bind(this),footerLinkClick:this._removeLastNavigationElement.bind(this),veilClick:this._removeModal.bind(this),closeModal:this._removeLastNavigationElement.bind(this),swipeClose:this._removeLastNavigationElement.bind(this)})[t],this.modalVisible=!0,this._saveNavigation("modal")}_openFaqs(){this.showHelpFaqs?(this._showFaqsModal=!0,this._saveNavigation("faqs")):this._dispatchCustomEvent("account-origination-oc-account-young-header-button-help-click")}_onCompleteMultiStepSummary(){this._onPostAccountsOpeningChildAccount()}_openModal({detail:t}){this.modalConfig=gs({footerButtonClick:this._openURL.bind(this),footerLinkClick:this._removeLastNavigationElement.bind(this),veilClick:this._removeLastNavigationElement.bind(this),swipeClose:this._removeLastNavigationElement.bind(this)})[t],this.modalVisible=!0,this._saveNavigation("modal")}_openURL(){const t={scheme:this.externalLink,packageId:null};this._dispatchCustomEvent("account-origination-oc-account-young-action-launcher-link-external",t)}_openInformationModal({detail:t}){var e;this.modalConfig=gs({bodyText:null===(e=this._addBodyText(t))||void 0===e?void 0:e.bodyText,veilClick:this._removeModal.bind(this),swipeClose:this._removeModal.bind(this)})[t],this.modalVisible=!0,this._saveNavigation("modal")}_openChooseFile({detail:t}){this.modalConfig=gs({veilClick:this._removeModal.bind(this),closeModal:this._removeLastNavigationElement.bind(this),swipeClose:this._removeLastNavigationElement.bind(this)})[t],this.modalVisible=!0,this._saveNavigation("modal")}_openSuggestions({detail:t}){this._typePlugin=t,this.modalConfigSugguest=gs({closeModal:this._removeLastNavigationElement.bind(this),footerButtonClick:"camera"===this._typePlugin?this._permissionsCamera.bind(this):this._getMobilePlatform.bind(this),veilClick:this._closeModalSuggestions.bind(this),swipeClose:this._closeModalSuggestions.bind(this)}).PHOTO_SUGGESTIONS,this.modalVisibleSuggest=!0,this._saveNavigation("modalSuggestions")}_getModalConfig({service:t,showRetries:e}){const i=e?"COMMON_ERROR":ys._getNameModal(t);return this._dispatchCustomEvent(`account-origination-oc-account-young-${i.replaceAll("_","-").toLowerCase()}-modal-open`),gs({service:t,...this._getErrorModalActions({service:t,showRetries:e})})[i]}static _getNameModal(t){return{POSTCUSTOMERSCHILDCUSTOMERS:"CUSTOMER_CREATION_ERROR",POSTACCOUNTSOPENINGCHILDACCOUNT:"CUSTOMER_CREATION_ERROR",OPENMEDIACAPTURE:"PHOTO_ERROR",OPENFILEFETCHER:"PDF_FILE_ERROR"}[t]||"RENAPO_VALIDATION_ERROR"}_getErrorModalActions({service:t,showRetries:e}){return{footerButtonClick:e?this._retryService.bind(this,t):this._closeOperative.bind(this),veilClick:this._retryService.bind(this,t),footerLinkClick:e?this._closeOperative.bind(this):this._viewBranches.bind(this),closeModal:this._closeOperative.bind(this)}}_getInitServices(){this._initialized&&(this._onGetProductLimits(),this._onGetAddressUnmasked(),this._onGetCustomerContactDetailsData())}_manageMultistepClose(){this.modalConfig=gs({footerButtonClick:this._closeMultistep.bind(this),footerLinkClick:this._removeModal.bind(this),veilClick:this._removeModal.bind(this),swipeClose:this._removeModal.bind(this)}).CLOSE_PROCESS,this.modalVisible=!0,this._saveNavigation("modal")}_manageError(t){this.clearLoader();const e=this._retriesConfig[t]<this.maxRetries;this._retriesConfig[t]+=1,this.modalConfig=this._getModalConfig({service:t,showRetries:e}),this.modalVisible=!0,this._saveNavigation("errorModal")}_openFileFetcher(){this._dispatchCustomEvent("account-origination-oc-account-young-file-fetcher-open",{contentType:"application/pdf"})}_openDocument(){var t,e,i;const s={value:null===(t=this._dataUploadedImage)||void 0===t?void 0:t.fileBase64,mimeType:"pdf"===(null===(e=this._dataUploadedImage)||void 0===e?void 0:e.extension)?"application/pdf":"image/jpeg",method:"get",headers:{"Content-Type":"pdf"===(null===(i=this._dataUploadedImage)||void 0===i?void 0:i.extension)?"application/pdf":"image/jpeg"},title:this.t("account-origination-oc-account-young-open-document"),headerColor:"FFFFFFFF",tintColor:"FF072146",canShare:!1,titleColor:"FF072146",blackStatusBar:!1};this._dispatchCustomEvent("account-origination-oc-account-young-document-open",s)}_openInfoDigitalServices(){this.modalConfig=gs({veilClick:this._removeModal.bind(this),swipeClose:this._removeModal.bind(this)}).DIGITAL_SERVICES,this.modalVisible=!0,this._saveNavigation("modal")}_onPostCivilRegistries(t){this.showLoader("transparent"),null!=t&&t.detail&&(this._requestBodyCivilRegistries=null==t?void 0:t.detail),this._ocAccountYoungManagerDm.doRequestForCivilRegistries(this._requestBodyCivilRegistries)}_onGetCatalogs(){this._ocAccountYoungManagerDm.doRequestForCatalogs(this.catalogId)}_onGetProductLimits(){const t={"subproduct.id":this.subproductId,accountLevel:this.accountLevel,"limit.id":this.limitId};this._ocAccountYoungManagerDm.doRequestForProductLimits(this.productId,t)}_onGetCodeZip(t){this.showLoader("transparent"),this._zipCodeInvalid=!1,this._cpAddressResponse=[],t&&(this._zipCode=null==t?void 0:t.detail),this._ocAccountYoungManagerDm.doRequestForGetCodeZip(this._zipCode)}async _onGetAddressUnmasked(t){this.showLoader(),null!=t&&t.detail&&(this.unmasked=null==t?void 0:t.detail,this.showMultiStepPage=!1),await this.updateComplete,this._ocAccountYoungManagerDm.doRequestForGetAddresses()}_onGetCustomerContactDetailsData(){this._ocAccountYoungManagerDm.doRequestForCustomerContactDetails(this.customerId)}_onPostCustomerChildCustomer(t){this.showLoader("transparent"),t&&(this._bodyToCreateCustomerChild=t),this.showMultiStepPage=!1,this._ocAccountYoungManagerDm.doRequestForCustomerChildCustomer(this._bodyToCreateCustomerChild)}_onFinishSuccessPage(){this._removeLastNavigationElement()}_onPostCustomerIdentificationProcessDocuments(){var t,e,i,s,o,a,n,r,c,l,d,u,h,p,m,g,_,v,y,b,f,C,S,E,T,P,R,A,I,O,$,x,k,D,N,w,M,F,q,L,B,V,H,j,G,U,z;this.showLoader();const K={documentType:this.documentType,verificationType:[{id:this.verificationTypeId,status:{id:this.verificationTypeStatusId}}],metadata:[{key:null===(t=this.metadataDocumentType)||void 0===t?void 0:t.key,value:null===(e=this.metadataDocumentType)||void 0===e?void 0:e.value},{key:null===(i=this.metadataProduct)||void 0===i?void 0:i.key,value:null===(s=this.metadataProduct)||void 0===s?void 0:s.value},{key:null===(o=this.metadataOperationType)||void 0===o?void 0:o.key,value:null===(a=this.metadataOperationType)||void 0===a?void 0:a.value},{key:null===(n=this.metadataTemporal)||void 0===n?void 0:n.key,value:null===(r=this.metadataTemporal)||void 0===r?void 0:r.value},{key:null===(c=this.metadataFlow)||void 0===c?void 0:c.key,value:null===(l=this.metadataFlow)||void 0===l?void 0:l.value},{key:null===(d=this.metadata)||void 0===d?void 0:d.personalName,value:null===(u=this._customerInfo)||void 0===u||null===(h=u[0])||void 0===h?void 0:h.firstName},{key:null===(p=this.metadata)||void 0===p?void 0:p.lastName,value:null===(m=this._customerInfo)||void 0===m||null===(g=m[0])||void 0===g?void 0:g.lastName},{key:null===(_=this.metadata)||void 0===_?void 0:_.mothersLastName,value:null===(v=this._customerInfo)||void 0===v||null===(y=v[0])||void 0===y?void 0:y.secondLastName},{key:null===(b=this.metadata)||void 0===b?void 0:b.procedureName,value:null===(f=this._childAccountResponse)||void 0===f?void 0:f.number},{key:null===(C=this.metadata)||void 0===C?void 0:C.expeditionDate,value:os("YYYY-MM-DD",null===(S=this._childAccountResponse)||void 0===S?void 0:S.operationDate)},{key:null===(E=this.metadata)||void 0===E?void 0:E.expirationDate,value:os("YYYY-MM-DD",null===(T=this._childAccountResponse)||void 0===T?void 0:T.operationDate)},{key:null===(P=this.branchName)||void 0===P?void 0:P.key,value:null===(R=this.branchName)||void 0===R?void 0:R.value},{key:null===(A=this.metadataDocument)||void 0===A?void 0:A.key,value:null===(I=this.metadataDocument)||void 0===I?void 0:I.value},{key:null===(O=this.metadata)||void 0===O?void 0:O.aditionalName,value:null===($=this._childAccountResponse)||void 0===$||null===(x=$.participants)||void 0===x||null===(k=x[0])||void 0===k?void 0:k.name},{key:null===(D=this.metadata)||void 0===D?void 0:D.aditionalLastName,value:null===(N=this._childAccountResponse)||void 0===N||null===(w=N.participants)||void 0===w||null===(M=w[0])||void 0===M?void 0:M.firstSurname},{key:null===(F=this.metadata)||void 0===F?void 0:F.aditionalMothersLastName,value:null===(q=this._childAccountResponse)||void 0===q||null===(L=q.participants)||void 0===L||null===(B=L[0])||void 0===B?void 0:B.secondSurname},{key:null===(V=this.metadata)||void 0===V?void 0:V.aditionalCustomerId,value:this._customerIdChild}],contentInfo:{contentData:this.contentData,contentType:null===(H=this._dataUploadedImage)||void 0===H?void 0:H.extension,documentFamily:null===(j=this._dataUploadedImage)||void 0===j?void 0:j.extension}};this.processDocumentsId&&(K.id=this.processDocumentsId);const Y={type:this.multipartType,formDataParts:[{name:this.multipartDocumentName,body:{mediaType:this.multipartMediaType,content:JSON.stringify(K)}},{name:this.multipartFile,filename:null===(G=this._dataUploadedImage)||void 0===G?void 0:G.name,body:{mediaType:"pdf"===(null===(U=this._dataUploadedImage)||void 0===U?void 0:U.extension)?"application/pdf":"image/jpeg",content:null===(z=this._dataUploadedImage)||void 0===z?void 0:z.fileBase64}}]};this._ocAccountYoungManagerDm.doRequestForCustomerIdentificationProcessDocuments(this.customerId,Y)}_onPostAccountsOpeningChildAccount(){this.showLoader(),this.showMultiStepPage=!1,this._ocAccountYoungManagerDm.doRequestForAccountsOpeningChildAccount(this._bodyToCreateAccount)}_offMultistep(){this.resetSteps(),this._renderMultistep=!1}_removeModal(){this.modalVisible&&(this.modalVisible=!1,this._popStackNavigation())}_retryService(t){this.modalVisible=!1;this[{GETPLACES:"_retryGetPlaces",GETADDRESSES:"_retryGetAdresses",GETCONTACTDETAILS:"_retryGetContactDetails",GETPRODUCTLIMITS:"_retryGetProductLimits",CIVILREGISTRIES:"_retryGetCivilRegistries",GETCATALOGS:"_retryGetCatalogs",POSTCUSTOMERSCHILDCUSTOMERS:"_retryPostChildCustomers",POSTACCOUNTSOPENINGCHILDACCOUNT:"_retryPostAccountsOpeningChildAccount",POSTCUSTOMERIDENTIFICATIONPROCESSDOCUMENTS:"_retryPostCustomerIdentificationProcessDocuments",OPENMEDIACAPTURE:"_retryOpenMediaCapture",OPENFILEFETCHER:"_retryOpenFileFetcher"}[t]]()}_retryOpenFileFetcher(){this._permissionsCamera()}_retryOpenMediaCapture(){this._permissionsCamera()}_retryPostCustomerIdentificationProcessDocuments(){this._onPostCustomerIdentificationProcessDocuments()}_retryPostAccountsOpeningChildAccount(){this._onPostAccountsOpeningChildAccount()}_retryPostChildCustomers(){this.showLoader(),this._onPostCustomerChildCustomer(!1)}_retryGetCivilRegistries(){this.showLoader(),this._onPostCivilRegistries()}_retryGetPlaces(){this.showLoader(),this._onGetCodeZip()}_retryGetAdresses(){this.showLoader(),this._onGetAddressUnmasked()}_retryGetContactDetails(){this.showLoader(),this._onGetCustomerContactDetailsData()}_retryGetCatalogs(){this.showLoader(),this._onGetCatalogs()}_retryGetProductLimits(){this.showLoader(),this._onGetProductLimits()}_removeLastNavigationElement(){const t=this._navigationStack[this._navigationStack.length-1];this._closeElement.call(this,t)()}_resetDataUploadedImage(){this._removeModal(),this._dataUploadedImage={},this._showSuccessToast=!1}_saveNavigation(t){this._navigationStack.push(t)}_popStackNavigation(){this._navigationStack.pop()}_permissionsCamera(){this._dispatchCustomEvent("account-origination-oc-account-young-camera-permissions-request","camera")}_parseCustomersAddresses({detail:t}){null!=t&&t.unmasked?(this.showMultiStepPage=!0,this._addressHomeUnmasked=null==t?void 0:t.address):this._addressHome=null==t?void 0:t.address,this.clearLoader()}_sendBodyToCreateAccount(t){this._bodyToCreateAccount=t}_setDigitalServicesData({detail:t}){this._digitalServicesData=t}_viewBranches(){"noMatchRegistryModal"===this._navigationStack[this._navigationStack.length-1]&&this._dispatchCustomEvent("account-origination-oc-account-young-registry-match-error-branches-view"),this._removeModal(),this._dispatchCustomEvent("account-origination-oc-account-young-branches-view")}_openPdfCud(){this.showLoader("transparent"),this._dispatchCustomEvent("account-origination-oc-account-young-cud-document-get")}_openPdfLinkCard(){this.showLoader("transparent"),this._dispatchCustomEvent("account-origination-oc-account-young-link-card-document-get")}get _ocAccountYoungManagerDm(){return this.shadowRoot.querySelector(`[data-tag-name="${ki.is}"]`)}get _tplOfferPage(){return this.showOfferPage?o`
      <oc-account-young-offer
        id="OcAccounYoungOfferModal"
        ambient="primary"
        ?visible="${this.showOfferPage}"
        .productLimitData="${this._productLimitsData}"
        language="${this.language}"
        @account-origination-oc-account-young-offer-continue="${this.showMultiStep}"
        @account-origination-oc-account-young-deposit-limit-open="${this._openInformationModal}"
        @account-origination-oc-account-young-benefits-open="${this._openModal}"
        @account-origination-oc-account-young-cost-open="${this._openModal}"
        @account-origination-oc-account-young-notice-privacy-open="${this._openInformationModal}">
      </oc-account-young-offer>
    `:m}get _tplHelpModalSuggestions(){return o`
      <oc-account-young-help-modal
        id="ocAccountYoungHelpModalSuggest"
        ambient="primary"
        .modalConfig="${this.modalConfigSugguest}"
        ?modal-visible="${this.modalVisibleSuggest}">
      </oc-account-young-help-modal>
    `}get _tplHelpModal(){return o`
      <oc-account-young-help-modal
        id="ocAccountYoungHelpModal"
        ambient="primary"
        .modalConfig="${this.modalConfig}"
        ?modal-visible="${this.modalVisible}"
        @account-origination-oc-account-young-suggest-modal-open="${this._openSuggestions}"
        @account-origination-oc-account-young-image-choose="${this._openSuggestions}"
        @account-origination-oc-account-young-pdf-choose="${this._getMobilePlatform}">
      </oc-account-young-help-modal>
    `}get _tplMultiStepPage(){return this._renderMultistep?o`
      <oc-account-young-multistep
        ambient="primary"
        ?visible="${this.showMultiStepPage}"
        .birthplaces="${this.birthplaces}"
        .civilRegistries="${this._civilRegistries}"
        .dataUploadedImage="${this._dataUploadedImage}"
        .cpAddressResponse="${this._cpAddressResponse}"
        .addressHome="${this._addressHome}"
        .addressHomeUnmasked="${this._addressHomeUnmasked}"
        .colonySelect="${this._colonySelect}"
        .maxAge="${this.maxAge}"
        .maxLengthIdentificationKey="${this.maxLengthIdentificationKey}"
        .selectedDate="${this.selectedDate}"
        .birthplaceSelected="${this.birthplaceSelected}"
        .colonySelected="${this.colonySelected}"
        .requestBodyCivilRegistries="${this._requestBodyCivilRegistries}"
        .customerIdChild="${this._customerIdChild}"
        .paramsCreateAccount=${this.paramsCreateAccount}
        .contractTemplates="${this.contractTemplates}"
        .contractingConsents="${this.contractingConsents}"
        cells-phone-number="${this.cellsPhoneNumber}"
        user-email="${this._userEmail}"
        phone-company-id="${this.phoneCompanyId}"
        country-name="${this.countryName}"
        homonomy-id="${this.homonomyId}"
        nationality="${this.nationality}"
        .componentTypes="${this.componentTypes}"
        ?native="${this.native}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ?edit-step="${this._editStep}"
        ?reset-value="${this._resetValue}"
        ?zip-code-invalid="${this._zipCodeInvalid}"
        ?digital-service="${this._digitalService}"
        ?edit-digital-service-step="${this._editDigitalServiceStep}"
        ?is-completed="${this._isCompleted}"
        ?show-success-toast="${this._showSuccessToast}"
        ?disconnect-multistep="${this._disconnectMultistep}"
        message-toast="${this._messageToast}"
        toast-duration="${this.toastDuration}"
        @account-origination-oc-account-young-zip-code-request="${this._onGetCodeZip}"
        @account-origination-oc-account-young-address-unmask="${this._onGetAddressUnmasked}"
        @account-origination-oc-account-young-inputs-zip-code-clear="${this._clearZipCodeAddress}"
        @account-origination-oc-account-young-birth-certificate-delete="${this._deleteImageModal}"
        @account-origination-oc-account-young-birth-certificate-visualize="${this._openDocument}"
        @account-origination-oc-account-young-minor-info-step-civil-registries-post="${this._onPostCivilRegistries}"
        @account-origination-oc-account-young-additional-info-step-civil-registries-post="${this._onPostCivilRegistries}"
        @account-origination-oc-account-young-notice-privacy-open="${this._openInformationModal}"
        @account-origination-oc-account-young-birth-certificate-modal-upload="${this._openChooseFile}"
        @account-origination-oc-account-young-digital-services-info-open="${this._openInfoDigitalServices}"
        @account-origination-oc-account-young-post-account-create="${({detail:t})=>this._onCompleteMultiStepSummary(t)}"
        @account-origination-oc-account-young-post-customer-child-create="${({detail:t})=>this._onPostCustomerChildCustomer(t)}"
        @account-origination-oc-account-young-body-to-create-account-send="${({detail:t})=>this._sendBodyToCreateAccount(t)}"
        @account-origination-oc-account-young-multistep-step-edit="${this._editStepModal}"
        @account-origination-oc-account-young-step-digital-services-edit="${this._editStepDigitalServices}"
        @account-origination-oc-account-young-steps-reset=${this.resetSteps}
        @account-origination-oc-account-young-multistep-disconnect="${this._offMultistep}"
        @account-origination-oc-account-young-data-of-digital-services-send="${this._setDigitalServicesData}"
        @account-origination-oc-account-young-pdf-cud-open="${this._openPdfCud}"
        @account-origination-oc-account-young-pdf-link-card-open="${this._openPdfLinkCard}">
      </oc-account-young-multistep>
    `:m}get _tplHelpFaqs(){return this.showHelpFaqs?o`
      <oc-account-young-faqs
        ?visible="${this._showFaqsModal}"
        ambient="primary"
        host="${this.aemHost}"
        path="${this.aemHelpFaqsPath}"
        .optionalParams="${this._optionalParamsFaqs}"
        ?attach-to-body-faqs="${this.attachToBody}"
        ?native="${this.native}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        @account-origination-oc-account-young-faqs-modal-close="${this._removeLastNavigationElement}">
      </oc-account-young-faqs>
    `:m}get _tplSuccessPage(){var t;return o`
      <oc-account-young-success
        ?visible="${this.showSuccessPage}"
        ambient="primary"
        ?digital-service-flag="${null===(t=this._digitalServicesData)||void 0===t?void 0:t.hiringDigitalService}"
        .childAccountResponse="${this._childAccountResponse}"
        @header-main-close-icon-click="${this._onFinishSuccessPage}">
      </oc-account-young-success>`}get _tplManagerDm(){return o`
      <oc-account-young-manager
        customer-id="${this.customerId}"
        host="${this.host}"
        places-version="${this.geographicPlacesApiVersion}"
        customer-addresses-version="${this.customerAddressesApiVersion}"
        product-limits-version="${this.productsApiVersion}"
        catalogs-version="${this.catalogsApiVersion}"
        civil-registries-version="${this.civilRegistriesSearchApiVersion}"
        customer-create-child-customer-version="${this.customerChildCustomerApiVersion}"
        accounts-opening-child-account-version="${this.accounstApiVersion}"
        customer-contact-details-version="${this.customerContactDetailsApiVersion}"
        customer-identification-process-documents-version="${this.customerIdentificationProcessDocumentsApiVersion}"
        required-token="${this.requiredToken}"
        ?native="${this.native}"
        .country="${this.country}"
        ?unmasked="${this.unmasked}"
        @account-origination-oc-account-young-success-from-places-get="${this._bindDataPlaces}"
        @account-origination-oc-account-young-error-from-places-get="${()=>this._manageError("GETPLACES")}"
        @account-origination-oc-account-young-success-from-customers-addresses-get="${this._parseCustomersAddresses}"
        @account-origination-oc-account-young-error-from-customer-address-get="${()=>this._manageError("GETADDRESSES")}"
        @account-origination-oc-account-young-success-from-civil-registries-post="${this._bindDataFromCivilRegistries}"
        @account-origination-oc-account-young-error-from-civil-registries-post="${this._bindErrorFromCivilRegistries}"
        @account-origination-oc-account-young-success-from-catalogs-get="${this._bindDataFromGetCatalogs}"
        @account-origination-oc-account-young-error-from-catalogs-get="${()=>this._manageError("GETCATALOGS")}"
        @account-origination-oc-account-young-success-from-product-limits-get="${this._bindDataFromProductLimits}"
        @account-origination-oc-account-young-error-from-product-limits-get="${()=>this._manageError("GETPRODUCTLIMITS")}"
        @account-origination-oc-account-young-success-from-customer-contact-details-get="${this._bindDataFromCustomerContactDetails}"
        @account-origination-oc-account-young-error-from-customer-contact-details-get="${()=>this._manageError("GETCONTACTDETAILS")}"
        @account-origination-oc-account-young-success-from-customer-child-customer-post="${this._bindDataFromCustomerChildCustomer}"
        @account-origination-oc-account-young-error-from-customer-child-customer-post="${this._bindErrorFromCustomerChildCustomer}"
        @account-origination-oc-account-young-success-from-accounts-opening-child-account-post="${this._bindDataFromAccountsOpeningChildAccount}"
        @account-origination-oc-account-young-error-from-accounts-opening-child-account-post="${this._bindErrorFromAccountsOpeningChildAccount}"
        @account-origination-oc-account-young-success-from-customer-identification-process-documents-post="${this._bindDataFromCustomerIdentificationProcessDocuments}"
        @account-origination-oc-account-young-error-from-customer-identification-process-documents-post="${()=>this._manageError("POSTCUSTOMERIDENTIFICATIONPROCESSDOCUMENTS")}">
      </oc-account-young-manager>
    `}render(){return o`
      <div class="container" ambient="primary">
        ${super.render()}
        ${this._tplManagerDm}
        ${this._tplOfferPage}
        ${this._tplMultiStepPage}
        ${this._tplHelpModal}
        ${this._tplHelpModalSuggestions}
        ${this._tplSuccessPage}
        ${this._tplHelpFaqs}
      </div>
    `}}customElements.define(ys.is,ys);class bs extends(Bt(i)){static get is(){return"bbva-analyticmanager-oc-account-young"}static get properties(){return{offers:{type:Object}}}constructor(){super(),this.offers={}}appOnClickStart(){var t,e,i;const s=this.offers.find((t=>{var e,i;return"oc-account-young"===(null==t||null===(e=t.config)||void 0===e||null===(i=e.offerType)||void 0===i?void 0:i.id)})),o=this._buildLocation(),a=`-${null==s||null===(t=s.config)||void 0===t||null===(e=t.originalPayload)||void 0===e||null===(i=e.description)||void 0===i?void 0:i.toLowerCase()}`,n={location:o,campaignName:a,collectiveCode:"VD-",siteActionName:`${o}:list:VD-:${a}:inversiones::`};this.persistData({...n}),this.fireAppOnClickStart()}_buildLocation(){const t=this.offers.findIndex((t=>{var e,i;return"oc-account-young"===(null==t||null===(e=t.config)||void 0===e||null===(i=e.offerType)||void 0===i?void 0:i.id)}))+1;return`contract product section--${1===t?`superior-${t}-${this.offers.length}`:`centro-${t}-${this.offers.length}`}`}appStep(t){const e=null==t?void 0:t.currentStep;if("terms-conditions-step"===e){const e=(null!=t&&t.isDigitalService?"con":"sin")+" servicios digitales";this.persistData({typology:e})}else"otp-opening-child-account-modal"===e&&this.persistData({customFields:"firma:token"});this.onStep({currentStep:e})}appCompleted(t){this.persistData({operationNumber:null==t?void 0:t.operationNumber}),this.fireAppCompleted()}}customElements.define(bs.is,bs);class fs extends(x(u(c(i)))){static get is(){return"bbva-controller-oc-account-young-mx"}static get scopedElements(){const t=[Vt,st];return fs.scopedElementsFromClasses(t)}static get properties(){return{host:{type:String},requiredToken:{type:String},native:{type:Boolean},_contractId:{type:String,state:!0},productIdCud:{type:String,attribute:"product-id-cud"},subProductIdCud:{type:String,attribute:"sub-product-id-cud"},productIdLinkCard:{type:String,attribute:"product-id-link-card"},subProductIdLinkCard:{type:String,attribute:"sub-product-id-link-card"},contractTemplates:{type:Object,attribute:"contract-templates"},documentTemplateCud:{type:Object,attribute:"document-template-cud"},documentTemplateLinkCard:{type:Object,attribute:"document-template-link-card"},customersApiVersion:{type:String,attribute:"customers-api-version"},catalogsApiVersion:{type:String,attribute:"catalogs-api-version"},catalogId:{type:String,attribute:"catalog-id"},maxAge:{type:Object,attribute:"max-age"},places:{type:Array},skipValidateDigitalFile:{type:Boolean,attribute:"skip-validate-digital-file"},_apiCustomers:{type:Object,state:!0},_apiCatalogs:{type:Object,state:!0},_birthplaces:{type:Array,state:!0},_birthplacesOptionsNative:{type:Object,state:!0},_birthplaceNativeSelected:{type:Object,state:!0},_birthplaceSelected:{type:String,state:!0},_placesOptionsNative:{type:Object,state:!0},_placeNativeSelected:{type:Object,state:!0},_placeSelected:{type:String,state:!0}}}constructor(){super(),this.host="",this.requiredToken="",this._contractId="",this.native=!1,this.productIdCud="",this.subProductIdCud="",this.productIdLinkCard="",this.subProductIdLinkCard="",this.contractTemplates={linkCard:"",cud:""},this.documentTemplateCud="",this.documentTemplateLinkCard="",this.customersApiVersion="0",this.catalogsApiVersion="0",this.catalogId="",this.maxAge={},this.places=[],this.skipValidateDigitalFile=!1,this._apiCustomers={},this._apiCatalogs={},this._birthplaces=[],this._birthplacesOptionsNative={},this._birthplaceNativeSelected={},this._birthplaceSelected="",this._placesOptionsNative={},this._placeNativeSelected={},this._placeSelected=""}firstUpdated(){this._apiCustomers=this.shadowRoot.querySelector(`[data-tag-name="${Vt.is}"]`),this._apiCatalogs=this.shadowRoot.querySelector(`[data-tag-name="${st.is}"]`)}updated(t){t.has("_birthplaces")&&this._birthplaces.length>0&&this._validateBirthplacesOptionsNative(),t.has("places")&&this.places.length>0&&this._validatePlacesOptionsNative()}_validateBirthplacesOptionsNative(){const t=this._birthplaces.map((t=>({...t,tag:null==t?void 0:t.id,text:null==t?void 0:t.value})));this._birthplacesOptionsNative={selected:"",values:t}}_validatePlacesOptionsNative(){const t=this.places.map((t=>({...t,tag:null==t?void 0:t.value,text:null==t?void 0:t.value})));this._placesOptionsNative={selected:"",values:t},this._placeNativeSelected=this._getPlaceOptionNativeSelected(),this._dispatchCustomEvent("bbva-controller-oc-account-young-mx-set-place-native-select",this._placeNativeSelected)}_updatePlacesNativeOptionSelected(){var t,e,i;this._placesOptionsNative.selected=this._placeSelected;const s=null===(t=this._placesOptionsNative)||void 0===t||null===(e=t.values)||void 0===e?void 0:e.map((t=>{var e;return{...t,selected:(null==t?void 0:t.tag)===(null===(e=this._placesOptionsNative)||void 0===e?void 0:e.selected)}}));this._placesOptionsNative.values=[...s],this._placeNativeSelected=this._getPlaceOptionNativeSelected(null===(i=this._placesOptionsNative)||void 0===i?void 0:i.selected),this._dispatchCustomEvent("bbva-controller-oc-account-young-mx-set-place-native-select",this._placeNativeSelected)}_getPlaceOptionNativeSelected(t=""){var e,i;return null===(e=this._placesOptionsNative)||void 0===e||null===(i=e.values)||void 0===i?void 0:i.find((e=>t?(null==e?void 0:e.tag)===t:null==e?void 0:e.selected))}_updateBirthplacesNativeOptionSelected(){var t,e,i,s;this._birthplacesOptionsNative.selected=this._birthplaceSelected;const o=null===(t=this._birthplacesOptionsNative)||void 0===t||null===(e=t.values)||void 0===e?void 0:e.map((t=>{var e;return{...t,selected:(null==t?void 0:t.tag)===(null===(e=this._birthplacesOptionsNative)||void 0===e?void 0:e.selected)}}));this._birthplacesOptionsNative.values=[...o],this._birthplaceNativeSelected=null===(i=this._birthplacesOptionsNative)||void 0===i||null===(s=i.values)||void 0===s?void 0:s.find((t=>{var e;return(null==t?void 0:t.tag)===(null===(e=this._birthplacesOptionsNative)||void 0===e?void 0:e.selected)})),this._dispatchCustomEvent("bbva-controller-oc-account-young-mx-set-birthplace-native-select",this._birthplaceNativeSelected)}setBirthplaceSelected(t){const{native_modal_item_selected:e}=t;this._birthplaceSelected=e;this._birthplaces.find((t=>(null==t?void 0:t.id)===this._birthplaceSelected))&&this._updateBirthplacesNativeOptionSelected()}setPlaceSelected(t){const{native_modal_item_selected:e}=t;this._placeSelected=e;this.places.find((t=>(null==t?void 0:t.value)===e))&&this._updatePlacesNativeOptionSelected()}getContractId(t){var e,i;const s=null==t||null===(e=t.data)||void 0===e||null===(i=e.contracts)||void 0===i?void 0:i.find((t=>{var e,i;return null==t||null===(e=t.detail)||void 0===e||null===(i=e.indicators)||void 0===i?void 0:i.some((t=>"IS_PRINCIPAL_ACCOUNT"===(null==t?void 0:t.id)&&(null==t?void 0:t.isActive)))}));this._contractId=null==s?void 0:s.simpleCode}doRequestPostValidateDigitalFile(){if(this.skipValidateDigitalFile)this._dispatchCustomEvent("bbva-controller-oc-account-young-mx-set-digital-file",!1);else{const t={contract:{id:this._contractId}};this._apiCustomers.postValidateDigitalFile(t),this._dispatchCustomEvent("bbva-controller-oc-account-young-mx-body-on-post-validate-digital-file",t)}}doRequestGetCatalogsRecords(){this._apiCatalogs.getCatalogRecords(this.catalogId)}_validateDocuments(t){const e=null==t?void 0:t.documents,i=[];e&&null!=e&&e.length?(e.map((t=>{var e;var s;"VALID"!==(null==t||null===(e=t.status)||void 0===e?void 0:e.id)&&i.push(null==t||null===(s=t.documentCategory)||void 0===s?void 0:s.id);return i})),this._dispatchCustomEvent("bbva-controller-oc-account-young-mx-set-digital-file",0!==i.length)):this._dispatchCustomEvent("bbva-controller-oc-account-young-mx-set-digital-file")}getCustomerInfo(t){const{customerId:e,userId:i}=t[0];this._dispatchCustomEvent("bbva-controller-oc-account-young-mx-set-customer-id",e),this.native||this._dispatchCustomEvent("bbva-controller-oc-account-young-mx-set-user-id",i)}getNativeUserId(t){this._dispatchCustomEvent("bbva-controller-oc-account-young-mx-set-user-id",t)}getContractTemplates(){this._getBusinessDocumentsCud(),this._getBusinessDocumentsLinkCard(),this._dispatchCustomEvent("bbva-controller-oc-account-young-mx-set-document-name",this.t("account-origination-oc-account-young-document-name"))}_getBusinessDocumentsCud(){const t={"product.id":this.productIdCud,"subproduct.id":this.subProductIdCud};this._dispatchCustomEvent("bbva-controller-oc-account-young-mx-get-business-documents",t)}_getBusinessDocumentsLinkCard(){const t={"product.id":this.productIdLinkCard,"subproduct.id":this.subProductIdLinkCard};this._dispatchCustomEvent("bbva-controller-oc-account-young-mx-get-business-documents",t)}successGetBusinessDocuments(t){var e,i,s,o;"CONTRATO UNICO DIGITAL"===(null===(e=t[0])||void 0===e||null===(i=e.documentTemplate)||void 0===i?void 0:i.id)?(this.documentTemplateCud={documentTemplate:{id:null===(s=t[0])||void 0===s?void 0:s.id,templateType:{id:"PDF"}}},this.contractTemplates.cud=t[0].id):(this.documentTemplateLinkCard={documentTemplate:{id:null===(o=t[0])||void 0===o?void 0:o.id,templateType:{id:"PDF"}}},this.contractTemplates.linkCard=t[0].id);this._dispatchCustomEvent("bbva-controller-oc-account-young-mx-save-contract-templates",this.contractTemplates)}postBusinessDocumentCud(){this._dispatchCustomEvent("bbva-controller-oc-account-young-mx-post-business-document",this.documentTemplateCud)}postBusinessDocumentLinkCard(){this._dispatchCustomEvent("bbva-controller-oc-account-young-mx-post-business-document",this.documentTemplateLinkCard)}successPostBusinessDocuments(t){const e={value:this._getFile(t),mimeType:"application/pdf",title:this.t("account-origination-oc-account-young-multistep-terms-conditions-header"),headerColor:"FFFFFFFF",tintColor:"FF072146",canShare:!1,titleColor:"FF072146",blackStatusBar:!1};this._dispatchCustomEvent("bbva-controller-oc-account-young-mx-show-document",e)}_getFile(t){let e="";if(this.native){var i,s;e=this._validateBasePdf(null==t||null===(i=t.data)||void 0===i||null===(s=i.parts[0])||void 0===s?void 0:s.content)}else{const i=this._validateBasePdf(t),s=i.indexOf(">")+3;let o=i.indexOf("=")+3;if(o<=2){const t=i.substring(s);o=t.indexOf("-"),e=t.substring(0,o)}else e=i.substring(s,o)}return e.replace(/(\r\n|\n|\r)/gm,"")}_validateBasePdf(t){const e=t;try{return e!==window.atob(e)?window.atob(e):""}catch{return e}}errorBusinessDocuments(){this._dispatchCustomEvent("bbva-controller-oc-account-young-mx-show-modal-error")}_onValidateDigitalFileError(t){this._dispatchCustomEvent("bbva-controller-oc-account-young-mx-digital-file-error",t),this._dispatchCustomEvent("bbva-controller-oc-account-young-mx-set-digital-file")}_successGetCatalogs(t){if(t){const e=this._parseStateInfo(t);this._birthplaces=e.map((t=>({...t,selected:!1}))),this._dispatchCustomEvent("bbva-controller-oc-account-young-mx-states-list-send",this._birthplaces)}}_errorGetCatalogs(t){this._dispatchCustomEvent("bbva-controller-oc-account-young-mx-get-catalogs-error",t)}_parseStateInfo(t){return t.map((t=>{var e;const i=null==t||null===(e=t.descriptions[0])||void 0===e?void 0:e.value.split(/\s{2,}/)[0],s=this._capitalizeFirstLetter(i.toLowerCase());return{id:null==t?void 0:t.id,value:s}}))}_capitalizeFirstLetter(t){return t.charAt(0).toUpperCase()+t.slice(1).toLowerCase()}callDatePickerNativePlugin(t){const e={dateFormat:"yyyy-MM-dd",defaultDate:""!==t?t:moment().format("YYYY-MM-DD"),maxDate:moment().format("YYYY-MM-DD"),minDate:moment().subtract(this.maxAge).format("YYYY-MM-DD")};this._dispatchCustomEvent("bbva-controller-oc-account-young-mx-call-date-picker-plugin",e)}callShowInfoNativePlugin(t){this._dispatchCustomEvent("bbva-controller-oc-account-young-mx-call-show-info-plugin","birthplaces"===t?this._birthplacesOptionsNative:this._placesOptionsNative)}setDateSelect({selectedDate:t}){this._dispatchCustomEvent("bbva-controller-oc-account-young-mx-set-date-select",t)}setAppSettingsParams(t){var e;const i=null==t||null===(e=t.externalUrlLinkCard)||void 0===e?void 0:e.url;this._dispatchCustomEvent("bbva-controller-oc-account-young-mx-set-external-link",i)}_dispatchCustomEvent(t,e=!0){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}render(){return o`
      <bbva-local-customers-api-dm
        id="customersApiDm"
        version="${this.customersApiVersion}"
        host="${this.host}"
        requiredToken="${this.requiredToken}"
        ?native="${this.native}"
        @post-validate-digital-file-success="${({detail:t})=>this._validateDocuments(t)}"
        @post-validate-digital-file-error="${({detail:t})=>this._onValidateDigitalFileError(t)}"
        @api-dm-error="${({detail:t})=>this._onValidateDigitalFileError(t)}">
      </bbva-local-customers-api-dm>
      <bbva-global-catalog-records-api-dm
        id="catalogsApiDm"
        host="${this.host}"
        version="${this.catalogsApiVersion}"
        requiredToken="${this.requiredToken}"
        ?native="${this.native}"
        @catalog-records-api-dm-fetch="${({detail:t})=>this._successGetCatalogs(t)}"
        @catalog-records-api-dm-fetch-error="${({detail:t})=>this._errorGetCatalogs(t)}"
        @api-dm-error="${({detail:t})=>this._errorGetCatalogs(t)}">
      </bbva-global-catalog-records-api-dm>
    `}}customElements.define(fs.is,fs);var Cs=Object.freeze({__proto__:null});export{ai as B,ci as a,Ai as b,Cs as o};
