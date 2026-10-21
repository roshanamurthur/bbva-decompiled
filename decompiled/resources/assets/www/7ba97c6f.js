import{aZ as t,J as e,L as a,z as i,ar as s,a8 as r,a9 as o,b0 as n,au as l,bd as c,ab as p,aa as d,ap as u,as as h,at as g,aJ as b,a as m,an as v,bx as y,ak as _,h as f,V as S,av as k,i as T,aw as x,b6 as R,S as $,ag as C,af as A,ac as E,ad as I,bU as D,F as w,ah as P,cU as O,ai as N,aN as L,dj as M,cS as q,bF as H,aV as j,b3 as V,cH as U,aD as F,b5 as B,bc as W,al as K,b1 as z,bf as G,be as X,aS as J,bg as Q,ae as Z,bh as Y,bi as tt,bj as et,j as at,r as it,o as st,f as rt,g as ot,bG as nt,di as lt,H as ct}from"./952f98a9.js";import{a7 as pt,a$ as dt}from"./7f3d7ca9.js";import{R as ut,S as ht,u as gt,z as bt,A as mt,D as vt,O as yt,a5 as _t,v as ft,w as St,G as kt,P as Tt,H as xt,a6 as Rt,F as $t,K as Ct}from"./216055dc.js";import"./c0a2f832.js";import"./cae0f1de.js";let At=class{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(t,e){if(null===this)throw new TypeError('"this" is null or not defined');let a=Object(this),i=a.length>>>0;if(0===i)return!1;let s=0|e,r=Math.max(s>=0?s:i-Math.abs(s),0);for(;r<i;){if((o=a[r])===(n=t)||"number"==typeof o&&"number"==typeof n&&isNaN(o)&&isNaN(n))return!0;r++}var o,n;return!1}}),String.fromCodePoint||function(t){var e=function(e){for(var a=[],i=0,s="",r=0,o=arguments.length;r!==o;++r){var n=+arguments[r];if(!(n<1114111&&n>>>0===n))throw RangeError("Invalid code point: "+n);n<=65535?i=a.push(n):(n-=65536,i=a.push(55296+(n>>10),n%1024+56320)),i>=16383&&(s+=t.apply(null,a),a.length=0)}return s+t.apply(null,a)};try{Object.defineProperty(String,"fromCodePoint",{value:e,configurable:!0,writable:!0})}catch(t){String.fromCodePoint=e}}(String.fromCharCode)}_error(t=0,e="",a=null){throw t=`0000${t=t.toString()}`.substr(t.length),Error(`BGADP_ERROR_${t} :: ${e} :: ${a&&a.message}`)}},Et=class extends At{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(t="",e=""){if("string"==typeof t&&t)if(this._reservedKeys.includes(t))this._error(2,`"${t}" should NOT be a reserved key`);else{if("string"!=typeof e)try{e=JSON.stringify(e)}catch(t){this._error(1,`"${e}" couldn't be transformed into String`)}e=e.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[t]=e}else this._error(3,"Missing {item} parameter")}getItem(t=""){return this._items[t]?this._items[t]:null}removeItem(t=""){this._items.hasOwnProperty(t)&&delete this._items[t]}clear(){Object.keys(this._items).length&&(this._items={})}};const It=0,Dt=1,wt="jwt",Pt="tsec",Ot="none";let Nt=class extends At{constructor(t=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=It,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(t),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let t={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(t).forEach((e=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!1,value:t[e],writable:"_headers"!==e})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new Et,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this)}_assignConfigValues(t=null){null!=t&&"object"==typeof t&&Object.keys(t).forEach((e=>{if(this.hasOwnProperty(e)&&"_"!==e.charAt(0)&&"function"!=typeof this[e])if("object"==typeof this[e])Array.isArray(t[e])?this[e]=Array.from(t[e]):null===this[e]?this[e]=t[e]:this[e]=Object.assign(this[e]||{},t[e]);else this[e]=t[e];else"signatureRequiredErrors"===e?this._ERROR_CODES.SIGNATURE_REQUIRED=t[e]:"signatureInvalidErrors"===e?this._ERROR_CODES.SIGNATURE_INVALID=t[e]:"signatureFirstErrorCode"===e?this._ERROR_CODES.SIGNATURE_FIRST_STEP=t[e]:"pendingProcessResponseErrors"===e?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=t[e]:"signatureInvalidStatus"===e?this._STATUS_CODES.SIGNATURE_INVALID=t[e]:"pendingProcessResponseStatus"==e?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=t[e]:"getTokenHandlerKey"===e?this.getTokenHandlerKey=t[e]:("function"==typeof this[e]&&this._error(1,`${e} is a class method, can't be override`),"_"===e.charAt(0)&&this._error(2,`"${e}" is a restricted property, can't be override`),this.hasOwnProperty(e)||this._error(3,`"${e}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=Pt:this.requiredToken=Ot,this.requiresJWT=!1):this.requiredToken===Pt?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===wt?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===Ot?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(Pt)}_setJwtHandler(){this._setTokenHandler(wt)}_setTokenHandler(t){const e=`${t}Handler`;this[e]=this[e]||window.sessionStorage;try{this[e].setItem("test","test"),this[e].removeItem("test")}catch(t){this._error(4,`Invalid [${e}]. If not specified, default window.sessionStorage can't be written/read`,t)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(t=""){t&&"string"==typeof t?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:t,writable:!1}):this._error(6,"[path] is required")}_buildPromise(t=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let e={isPending:!0};e.promise=new window.Promise(((a,i)=>{e=Object.assign(e,{resolve:a,reject:i}),this._buildRequest(t)})),this._promise=Object.assign({},e)}return this._promise.promise}_defaultXHR(t=""){let e=new window.XMLHttpRequest;if(e instanceof window.XMLHttpRequest){e.withCredentials=this.withCredentials,e.timeout=1e3*this.timeout,e.onreadystatechange=this._onReadyStateChange.bind(this),e.responseType=this.responseType,e.open(this.method.toUpperCase(),t);let a=this._getRequestHeaders();Object.keys(a).forEach((t=>{this.forceBoundary&&this.multipart&&"Content-Type"===t||e.setRequestHeader(t,a[t])})),e.send(this._buildBody())}return e}_nativeXHR(t=""){let e=this._buildNativeRequest();return e?(e=e[this.method.toLowerCase()],"function"==typeof e?e=e({url:t,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),e}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=t),e}_buildRequest(t=!1){let e=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const t={url:e,path:this._path,method:this.method};this._emitRequestEvent("start",t)}if(!t&&this._cacheItem&&e===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!t&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:e,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(e);break;case this._NATIVE_XHR:this._request=this._nativeXHR(e)}return this._request}_buildURL(){let t=[this.host,this._path].join("/");if(null!==this.params){let e=Object.assign({},this.params);-1!==t.lastIndexOf("{")&&(t=t.replace(/(\{[\w\-]+\})/g,(t=>{let a=t.replace(/[\{\}]+/g,""),i=e[a];return i?delete e[a]:this._error(9,`Missing ${a} param value`),i})),-1!==t.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let a=Object.keys(e);a.length&&(t=[t,a.map((t=>{let a=e[t];return Array.isArray(a)&&this.paramArrayMode===Dt?this._arrayToQueryParam(t,a):`${t}=${a}`})).join("&")].join("?"))}return t}_arrayToQueryParam(t,e){return e.map((e=>`${t}=${e}`)).join("&")}_getRequestHeaders(){let t=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(t=this._getTokenForRequestHeaders(Pt,t)),!0===this.requiresJWT&&(t=this._getTokenForRequestHeaders(wt,t)),!0===this.semaasMonitoring){let e=this._getSemaasHeaders();Object.assign(t,e)}const e=this._getCustomHeaders();return Object.assign(t,e),t}_getSemaasHeaders(){var t={};if(window.sessionStorage){var e=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(a){var i=e.getItem(a);i&&"null"!==i&&(t[a]=i)}))}return t}_getCustomHeaders(){const t="x-bgadp-";let e={};if(window.sessionStorage){const a=window.sessionStorage;e=Object.keys(a).filter((e=>e.startsWith(t))).reduce(((e,i)=>(e[i.replace(t,"")]=a.getItem(i),e)),{})}return e}_getTokenForRequestHeaders(t,e){const a=`${t}Handler`,i=t===wt?"JWT ":"",s=t===wt?"Authorization":Pt;if(void 0===this[a]||null===this[a])this._error(11,`${t} handler is undefined`);else{const r=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):t;let o=this[a].getItem(r);o?e[s]=e[s]||i+o:this._error(12,`Missing '${t}' value`)}return e}_buildBody(){let t=this.body;if(t&&this._xhrType===this._DEFAULT_XHR){let e=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===e){let e=[];Object.keys(t).forEach((a=>{e.push(`${a}=${t[a]}`)})),t=e.join("&")}else this.headers&&-1!==e.indexOf("multipart/")||(t=JSON.stringify(t))}return t}_onReadyStateChange(){let t=this._request;if(t&&t.readyState===window.XMLHttpRequest.DONE)switch(t.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(t);break;default:this._onRequestFail(t)}}_extractRequestResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)e={result:e};else if(e&&e instanceof ArrayBuffer)try{const t=this._decode(e);try{e=JSON.parse(t)}catch(a){e={result:t,originalResponse:e}}}catch(t){e=null}else if(e&&"string"==typeof e)try{e=JSON.parse(e)}catch(t){e=null}return e}async _extractRequestErrorResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)try{const t=await this._blobDecode(e);try{e=JSON.parse(t)}catch(a){e={result:t,originalResponse:e}}}catch(t){e=null}else e=this._extractRequestResponse(t);return e}_blobDecode(t){const e=new FileReader;let a;const i=new Promise(((t,e)=>{a=(a,i)=>{a?e(a):t(i)}}));return e.addEventListener("loadend",(function t(i){e.removeEventListener("loadend",t),i.error?a(i.error):a(null,e.result)})),e.readAsText(t),i}_decode(t){let e;if("function"==typeof TextDecoder){e=new TextDecoder("utf-8").decode(t)}else{let a=0;for(;a<t.length;){let i=t[a],s=0,r=0;if(i<=127?(s=0,r=255&i):i<=223?(s=1,r=31&i):i<=239?(s=2,r=15&i):i<=244&&(s=3,r=7&i),t.length-a-s>0){let e=0;for(;e<s;)i=t[a+e+1],r=r<<6|63&i,e+=1}else r=65533,s=t.length-a;e+=String.fromCodePoint(r),a+=s+1}}return e}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let t=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(t=window.btoa(t)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,t);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,t);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,t);case this._CACHE_NONE:}}catch(t){this._error(13,`Can't write into cache engine: ${t.message}`,t)}}_retrieveFromCache(){let t;try{switch(this._cache){case this._CACHE_MEMORY:t=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:t=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:t=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(t){this._error(14,"Can't read from cache engine",t)}return t&&(this.encodeCache&&(t=window.atob(t)),"string"==typeof t&&/[\{\[]/.test(t.charAt(0))&&(t=JSON.parse(t))),t}_setLastResponse(t=null){t&&(this._lastResponse=Object.assign({},t))}_setLastResponseHeaders(t=null){let e={};t&&(t instanceof window.XMLHttpRequest?e=this._parseResponseHeadersToObject(t.getAllResponseHeaders()):t.headers&&(e=JSON.parse(t.headers))),this._lastResponseHeaders=e}_parseResponseHeadersToObject(t){let e={},a=t.trim().split(/[\r\n]+/);for(const t in a)if(a.hasOwnProperty(t)&&""!==a[t]){let i=": ",s=a[t].split(i);e[s.shift().toLowerCase()]=s.join(i)}return e}_onRequestSuccess(t=null){this._setLastResponse(this._extractRequestResponse(t)),this._setLastResponseHeaders(t),this.jwtHandler&&this._storeToken(this.jwtHandler,t,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,t,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",t)}_storeToken(t,e,a,i){let s=null;switch(this._xhrType){case this._DEFAULT_XHR:e&&e.getAllResponseHeaders&&e.getResponseHeader&&e.getAllResponseHeaders().indexOf(i)>=0&&(s=e.getResponseHeader(i));break;case this._NATIVE_XHR:e&&e.headers&&(s=JSON.parse(e.headers)[i])}if(s){const e=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):a;t.getItem(e)!==s&&(t.setItem(e,s),this._emitTokenUpdate(a,s))}}_emitTokenUpdate(t,e){if(this.htmlContext){const a=new CustomEvent("token-update",{bubbles:!0,detail:{type:t,token:e}});this.htmlContext.dispatchEvent(a)}}_emitRequestEvent(t,e){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${t}`,{bubbles:!0,composed:!0,detail:{metadata:e}})):console.warn(`Missing htmlContext to dispatch event http-request-${t}`)}_onRequestFail(t=null){(async()=>{if(!this._isSignatureRequired(t)&&!this._isWaitingForProcessResponse(t)){let e=await this._extractRequestErrorResponse(t);this._setLastResponse(e),this._setLastResponseHeaders(t),this._onRequestEnd("reject",t)}})()}_onRequestEnd(t="resolve",e=null){if(this._resetDPState(),this.emitRequestEvents){const t={method:this.method,path:this._path};null!==e&&(t.status=e.status,t.url=e.responseURL),this._emitRequestEvent("end",t)}this._promise&&"function"==typeof this._promise[t]&&(this._promise.isPending=!1,this._promise[t](e))}_resetDPState(){["Data","Type","State"].forEach((t=>{let e=`Authentication${t}`;this._headers&&this._headers.hasOwnProperty(e)&&delete this._headers[e],this.headers&&this.headers.hasOwnProperty(e)&&delete this.headers[e]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(t=null){let e,a,i,s,r;if(t instanceof window.XMLHttpRequest)e=t.getResponseHeader("AuthenticationType"),a=t.getResponseHeader("AuthenticationData"),i=t.getResponseHeader("AuthenticationState"),s=t.getResponseHeader("AuthenticationChallenge"),r=t.getResponseHeader("AuthenticationResponse");else{let o=JSON.parse(t.headers);e=o.authenticationtype,a=o.authenticationdata||null,i=o.authenticationstate,s=o.authenticationchallenge,r=o.authenticationresponse}return{type:e,data:a,state:i,challenge:s,response:r}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureTypeChange(t,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureValueChange(t,...arguments)}})}_onSignatureTypeChange(t="",e="",a=""){if("string"==typeof t&&""!==t)if(e.includes(t)){if("string"==typeof t&&""!==t){const i=this._getSignatureData(t,e,a);this.headers=Object.assign(this.headers||{},{AuthenticationType:t,AuthenticationData:i}),this._buildRequest()}}else this._error(15,`${t} is not a valid signature type`);"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(t=null,e="",a="",i=""){let s;if("object"==typeof t&&t){const r=this._getSignatureData(t.signatureType,e,a);s=this._makeKeyValuePairFromObject(r,t.signatureValue),t.challenge&&(s+=`,challenge=${t.challenge}`),this._buildSignatureHeaders(s,t.signatureType,i)}else"string"==typeof t&&""!==t&&(this._hasSignatureAuthenticationType(e,"2")?(s=`password=${t}`,this._buildSignatureHeaders(s,"2",i)):(s=`${a}=${t}`,this._buildSignatureHeaders(s,e,i)));"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(t="",e=""){if(!t)return"";let a,i=t.split(",");if(i.length>1){a=i.map((t=>`${t}=${e[t]}`)).join(",")}else a=`${t}=${e}`;return a}_hasSignatureAuthenticationType(t,e){return-1!==t.split(";").findIndex((t=>t===e))}_buildSignatureHeaders(t="",e="",a=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:t,AuthenticationType:e||""}),a&&(this.headers=Object.assign(this.headers,{AuthenticationState:a})),this._buildRequest()}_isSignatureRequired(t=null){const e=Number((t||{}).status);let a=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(e)){const e=this._extractRequestResponse(t),i=this._extractResponseErrorCode(e),s=this._ERROR_CODES.SIGNATURE_INVALID.includes(i),{type:r,data:o,state:n,challenge:l,response:c}=this._extractSignatureResponseHeaders(t),p=this._getRequestMetadata(t);if(s)this._notifySignatureInvalid(p),a=!0;else if(r)if(e){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(i)?(this._notifySignatureTypeUsingErrorCode(i,p,r,o,n,l,c),a=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(p,r,o,n,l,c),a=!0}return a}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(t=null){const e=Number((t||{}).status);let a=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(e)){const e=this._extractRequestResponse(t),i=this._extractResponseErrorCode(e),s=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(i),r=this._getRequestMetadata(t);s&&(this._notifyWaitingForProcessResponse(r),a=!0)}return a}_notifySignatureRequiredFirstStep(t,e,a,i){this._defineSignatureType(e,a),this._defineSignatureValue(e,a,i),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:e,data:a,metadata:t}}))}_notifySignatureRequired(t,e,a,i,s,r){this._defineSignatureValue(e,a,i);const o={type:e,data:a,challenge:s,metadata:t};r&&(o.response=r),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:o}))}_notifySignatureInvalid(t){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:t}}))}_notifyWaitingForProcessResponse(t){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:t}}))}_getRequestMetadata(t){const{responseURL:e,status:a}=t;return{path:this._path,method:this.method,url:e,status:a}}_emitEvent(t){this.htmlContext?this.htmlContext.dispatchEvent(t):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(t="",e="",a=""){const i=e.split(";").findIndex((e=>e===t));return a?a.split(";")[i]:""}toString(t=""){return`[object ${t||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(t=!1){return this._buildPromise(t)}_extractResponseErrorCode(t){return t?t["error-code"]||t.messages&&t.messages[0].code:null}_notifySignatureTypeUsingHeaders(t,e,a,i,s,r){i?this._notifySignatureRequired(t,e,a,i,s,r):this._notifySignatureRequiredFirstStep(t,e,a,i)}_notifySignatureTypeUsingErrorCode(t,e,a,i,s,r,o){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(t)?this._notifySignatureRequiredFirstStep(e,a,i,s):this._notifySignatureRequired(e,a,i,s,r,o)}};class Lt extends Nt{constructor(t=null){super(Object.assign(t||{},{method:"POST"}))}toString(t=""){return super.toString(t||"BGADPRequestPOST")}}class Mt extends Lt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`contracts/v${this.version}/contracting-processes/loan-contracting-processes/tracking-task`)}toString(){return super.toString("BGADPMxContractsContractingProcessesLoanContractingProcessesTrackingTaskPostV1")}}class qt extends(e(a)){}class Ht extends qt{static get is(){return"bbva-local-contracting-processes-tracking-task-api-dm"}static get properties(){return{}}constructor(){super(),this.apiVersion="1",this.requiredToken="tsec",this.native=!1,this.headers={},this.timeout=120}postContractingProcessesTrackingTask(t){const e={host:this.host,headers:{...this.headers,"Content-Type":"application/json"},body:t,version:this.apiVersion,requiredToken:this.requiredToken,native:this.native,timeout:this.timeout,forceBoundary:!1},a=Ht._serviceTrackingTask(e);this._generateGetService(a,{customEvent:"contracting-processes-tracking-task-api-dm-post",errorFireEventHandler:"contracting-processes-tracking-task-api-dm-post-error"})}static _serviceTrackingTask(t){return new Mt(t)}}class jt{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(t,e){if(null===this)throw new TypeError('"this" is null or not defined');let a=Object(this),i=a.length>>>0;if(0===i)return!1;let s=0|e,r=Math.max(s>=0?s:i-Math.abs(s),0);for(;r<i;){if((o=a[r])===(n=t)||"number"==typeof o&&"number"==typeof n&&isNaN(o)&&isNaN(n))return!0;r++}var o,n;return!1}}),String.fromCodePoint||function(t){var e=function(e){for(var a=[],i=0,s="",r=0,o=arguments.length;r!==o;++r){var n=+arguments[r];if(!(n<1114111&&n>>>0===n))throw RangeError("Invalid code point: "+n);n<=65535?i=a.push(n):(n-=65536,i=a.push(55296+(n>>10),n%1024+56320)),i>=16383&&(s+=t.apply(null,a),a.length=0)}return s+t.apply(null,a)};try{Object.defineProperty(String,"fromCodePoint",{value:e,configurable:!0,writable:!0})}catch(t){String.fromCodePoint=e}}(String.fromCharCode)}_error(t=0,e="",a=null){throw t=`0000${t=t.toString()}`.substr(t.length),Error(`BGADP_ERROR_${t} :: ${e} :: ${a&&a.message}`)}}class Vt extends jt{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(t="",e=""){if("string"==typeof t&&t)if(this._reservedKeys.includes(t))this._error(2,`"${t}" should NOT be a reserved key`);else{if("string"!=typeof e)try{e=JSON.stringify(e)}catch(t){this._error(1,`"${e}" couldn't be transformed into String`)}e=e.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[t]=e}else this._error(3,"Missing {item} parameter")}getItem(t=""){return this._items[t]?this._items[t]:null}removeItem(t=""){this._items.hasOwnProperty(t)&&delete this._items[t]}clear(){Object.keys(this._items).length&&(this._items={})}}const Ut=0,Ft=1,Bt="jwt",Wt="tsec",Kt="none";class zt extends jt{constructor(t=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=Ut,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(t),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let t={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(t).forEach((e=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!1,value:t[e],writable:"_headers"!==e})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new Vt,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this)}_assignConfigValues(t=null){null!=t&&"object"==typeof t&&Object.keys(t).forEach((e=>{if(this.hasOwnProperty(e)&&"_"!==e.charAt(0)&&"function"!=typeof this[e])if("object"==typeof this[e])Array.isArray(t[e])?this[e]=Array.from(t[e]):null===this[e]?this[e]=t[e]:this[e]=Object.assign(this[e]||{},t[e]);else this[e]=t[e];else"signatureRequiredErrors"===e?this._ERROR_CODES.SIGNATURE_REQUIRED=t[e]:"signatureInvalidErrors"===e?this._ERROR_CODES.SIGNATURE_INVALID=t[e]:"signatureFirstErrorCode"===e?this._ERROR_CODES.SIGNATURE_FIRST_STEP=t[e]:"pendingProcessResponseErrors"===e?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=t[e]:"signatureInvalidStatus"===e?this._STATUS_CODES.SIGNATURE_INVALID=t[e]:"pendingProcessResponseStatus"==e?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=t[e]:"getTokenHandlerKey"===e?this.getTokenHandlerKey=t[e]:("function"==typeof this[e]&&this._error(1,`${e} is a class method, can't be override`),"_"===e.charAt(0)&&this._error(2,`"${e}" is a restricted property, can't be override`),this.hasOwnProperty(e)||this._error(3,`"${e}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=Wt:this.requiredToken=Kt,this.requiresJWT=!1):this.requiredToken===Wt?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===Bt?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===Kt?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(Wt)}_setJwtHandler(){this._setTokenHandler(Bt)}_setTokenHandler(t){const e=`${t}Handler`;this[e]=this[e]||window.sessionStorage;try{this[e].setItem("test","test"),this[e].removeItem("test")}catch(t){this._error(4,`Invalid [${e}]. If not specified, default window.sessionStorage can't be written/read`,t)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(t=""){t&&"string"==typeof t?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:t,writable:!1}):this._error(6,"[path] is required")}_buildPromise(t=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let e={isPending:!0};e.promise=new window.Promise(((a,i)=>{e=Object.assign(e,{resolve:a,reject:i}),this._buildRequest(t)})),this._promise=Object.assign({},e)}return this._promise.promise}_defaultXHR(t=""){let e=new window.XMLHttpRequest;if(e instanceof window.XMLHttpRequest){e.withCredentials=this.withCredentials,e.timeout=1e3*this.timeout,e.onreadystatechange=this._onReadyStateChange.bind(this),e.responseType=this.responseType,e.open(this.method.toUpperCase(),t);let a=this._getRequestHeaders();Object.keys(a).forEach((t=>{this.forceBoundary&&this.multipart&&"Content-Type"===t||e.setRequestHeader(t,a[t])})),e.send(this._buildBody())}return e}_nativeXHR(t=""){let e=this._buildNativeRequest();return e?(e=e[this.method.toLowerCase()],"function"==typeof e?e=e({url:t,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),e}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=t),e}_buildRequest(t=!1){let e=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const t={url:e,path:this._path,method:this.method};this._emitRequestEvent("start",t)}if(!t&&this._cacheItem&&e===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!t&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:e,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(e);break;case this._NATIVE_XHR:this._request=this._nativeXHR(e)}return this._request}_buildURL(){let t=[this.host,this._path].join("/");if(null!==this.params){let e=Object.assign({},this.params);-1!==t.lastIndexOf("{")&&(t=t.replace(/(\{[\w\-]+\})/g,(t=>{let a=t.replace(/[\{\}]+/g,""),i=e[a];return i?delete e[a]:this._error(9,`Missing ${a} param value`),i})),-1!==t.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let a=Object.keys(e);a.length&&(t=[t,a.map((t=>{let a=e[t];return Array.isArray(a)&&this.paramArrayMode===Ft?this._arrayToQueryParam(t,a):`${t}=${a}`})).join("&")].join("?"))}return t}_arrayToQueryParam(t,e){return e.map((e=>`${t}=${e}`)).join("&")}_getRequestHeaders(){let t=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(t=this._getTokenForRequestHeaders(Wt,t)),!0===this.requiresJWT&&(t=this._getTokenForRequestHeaders(Bt,t)),!0===this.semaasMonitoring){let e=this._getSemaasHeaders();Object.assign(t,e)}const e=this._getCustomHeaders();return Object.assign(t,e),t}_getSemaasHeaders(){var t={};if(window.sessionStorage){var e=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(a){var i=e.getItem(a);i&&"null"!==i&&(t[a]=i)}))}return t}_getCustomHeaders(){const t="x-bgadp-";let e={};if(window.sessionStorage){const a=window.sessionStorage;e=Object.keys(a).filter((e=>e.startsWith(t))).reduce(((e,i)=>(e[i.replace(t,"")]=a.getItem(i),e)),{})}return e}_getTokenForRequestHeaders(t,e){const a=`${t}Handler`,i=t===Bt?"JWT ":"",s=t===Bt?"Authorization":Wt;if(void 0===this[a]||null===this[a])this._error(11,`${t} handler is undefined`);else{const r=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):t;let o=this[a].getItem(r);o?e[s]=e[s]||i+o:this._error(12,`Missing '${t}' value`)}return e}_buildBody(){let t=this.body;if(t&&this._xhrType===this._DEFAULT_XHR){let e=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===e){let e=[];Object.keys(t).forEach((a=>{e.push(`${a}=${t[a]}`)})),t=e.join("&")}else this.headers&&-1!==e.indexOf("multipart/")||(t=JSON.stringify(t))}return t}_onReadyStateChange(){let t=this._request;if(t&&t.readyState===window.XMLHttpRequest.DONE)switch(t.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(t);break;default:this._onRequestFail(t)}}_extractRequestResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)e={result:e};else if(e&&e instanceof ArrayBuffer)try{const t=this._decode(e);try{e=JSON.parse(t)}catch(a){e={result:t,originalResponse:e}}}catch(t){e=null}else if(e&&"string"==typeof e)try{e=JSON.parse(e)}catch(t){e=null}return e}async _extractRequestErrorResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)try{const t=await this._blobDecode(e);try{e=JSON.parse(t)}catch(a){e={result:t,originalResponse:e}}}catch(t){e=null}else e=this._extractRequestResponse(t);return e}_blobDecode(t){const e=new FileReader;let a;const i=new Promise(((t,e)=>{a=(a,i)=>{a?e(a):t(i)}}));return e.addEventListener("loadend",(function t(i){e.removeEventListener("loadend",t),i.error?a(i.error):a(null,e.result)})),e.readAsText(t),i}_decode(t){let e;if("function"==typeof TextDecoder){e=new TextDecoder("utf-8").decode(t)}else{let a=0;for(;a<t.length;){let i=t[a],s=0,r=0;if(i<=127?(s=0,r=255&i):i<=223?(s=1,r=31&i):i<=239?(s=2,r=15&i):i<=244&&(s=3,r=7&i),t.length-a-s>0){let e=0;for(;e<s;)i=t[a+e+1],r=r<<6|63&i,e+=1}else r=65533,s=t.length-a;e+=String.fromCodePoint(r),a+=s+1}}return e}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let t=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(t=window.btoa(t)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,t);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,t);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,t);case this._CACHE_NONE:}}catch(t){this._error(13,`Can't write into cache engine: ${t.message}`,t)}}_retrieveFromCache(){let t;try{switch(this._cache){case this._CACHE_MEMORY:t=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:t=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:t=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(t){this._error(14,"Can't read from cache engine",t)}return t&&(this.encodeCache&&(t=window.atob(t)),"string"==typeof t&&/[\{\[]/.test(t.charAt(0))&&(t=JSON.parse(t))),t}_setLastResponse(t=null){t&&(this._lastResponse=Object.assign({},t))}_setLastResponseHeaders(t=null){let e={};t&&(t instanceof window.XMLHttpRequest?e=this._parseResponseHeadersToObject(t.getAllResponseHeaders()):t.headers&&(e=JSON.parse(t.headers))),this._lastResponseHeaders=e}_parseResponseHeadersToObject(t){let e={},a=t.trim().split(/[\r\n]+/);for(const t in a)if(a.hasOwnProperty(t)&&""!==a[t]){let i=": ",s=a[t].split(i);e[s.shift().toLowerCase()]=s.join(i)}return e}_onRequestSuccess(t=null){this._setLastResponse(this._extractRequestResponse(t)),this._setLastResponseHeaders(t),this.jwtHandler&&this._storeToken(this.jwtHandler,t,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,t,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",t)}_storeToken(t,e,a,i){let s=null;switch(this._xhrType){case this._DEFAULT_XHR:e&&e.getAllResponseHeaders&&e.getResponseHeader&&e.getAllResponseHeaders().indexOf(i)>=0&&(s=e.getResponseHeader(i));break;case this._NATIVE_XHR:e&&e.headers&&(s=JSON.parse(e.headers)[i])}if(s){const e=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):a;t.getItem(e)!==s&&(t.setItem(e,s),this._emitTokenUpdate(a,s))}}_emitTokenUpdate(t,e){if(this.htmlContext){const a=new CustomEvent("token-update",{bubbles:!0,detail:{type:t,token:e}});this.htmlContext.dispatchEvent(a)}}_emitRequestEvent(t,e){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${t}`,{bubbles:!0,composed:!0,detail:{metadata:e}})):console.warn(`Missing htmlContext to dispatch event http-request-${t}`)}_onRequestFail(t=null){(async()=>{if(!this._isSignatureRequired(t)&&!this._isWaitingForProcessResponse(t)){let e=await this._extractRequestErrorResponse(t);this._setLastResponse(e),this._setLastResponseHeaders(t),this._onRequestEnd("reject",t)}})()}_onRequestEnd(t="resolve",e=null){if(this._resetDPState(),this.emitRequestEvents){const t={method:this.method,path:this._path};null!==e&&(t.status=e.status,t.url=e.responseURL),this._emitRequestEvent("end",t)}this._promise&&"function"==typeof this._promise[t]&&(this._promise.isPending=!1,this._promise[t](e))}_resetDPState(){["Data","Type","State"].forEach((t=>{let e=`Authentication${t}`;this._headers&&this._headers.hasOwnProperty(e)&&delete this._headers[e],this.headers&&this.headers.hasOwnProperty(e)&&delete this.headers[e]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(t=null){let e,a,i,s,r;if(t instanceof window.XMLHttpRequest)e=t.getResponseHeader("AuthenticationType"),a=t.getResponseHeader("AuthenticationData"),i=t.getResponseHeader("AuthenticationState"),s=t.getResponseHeader("AuthenticationChallenge"),r=t.getResponseHeader("AuthenticationResponse");else{let o=JSON.parse(t.headers);e=o.authenticationtype,a=o.authenticationdata||null,i=o.authenticationstate,s=o.authenticationchallenge,r=o.authenticationresponse}return{type:e,data:a,state:i,challenge:s,response:r}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureTypeChange(t,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureValueChange(t,...arguments)}})}_onSignatureTypeChange(t="",e="",a=""){if("string"==typeof t&&""!==t)if(e.includes(t)){if("string"==typeof t&&""!==t){const i=this._getSignatureData(t,e,a);this.headers=Object.assign(this.headers||{},{AuthenticationType:t,AuthenticationData:i}),this._buildRequest()}}else this._error(15,`${t} is not a valid signature type`);"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(t=null,e="",a="",i=""){let s;if("object"==typeof t&&t){const r=this._getSignatureData(t.signatureType,e,a);s=this._makeKeyValuePairFromObject(r,t.signatureValue),t.challenge&&(s+=`,challenge=${t.challenge}`),this._buildSignatureHeaders(s,t.signatureType,i)}else"string"==typeof t&&""!==t&&(this._hasSignatureAuthenticationType(e,"2")?(s=`password=${t}`,this._buildSignatureHeaders(s,"2",i)):(s=`${a}=${t}`,this._buildSignatureHeaders(s,e,i)));"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(t="",e=""){if(!t)return"";let a,i=t.split(",");if(i.length>1){a=i.map((t=>`${t}=${e[t]}`)).join(",")}else a=`${t}=${e}`;return a}_hasSignatureAuthenticationType(t,e){return-1!==t.split(";").findIndex((t=>t===e))}_buildSignatureHeaders(t="",e="",a=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:t,AuthenticationType:e||""}),a&&(this.headers=Object.assign(this.headers,{AuthenticationState:a})),this._buildRequest()}_isSignatureRequired(t=null){const e=Number((t||{}).status);let a=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(e)){const e=this._extractRequestResponse(t),i=this._extractResponseErrorCode(e),s=this._ERROR_CODES.SIGNATURE_INVALID.includes(i),{type:r,data:o,state:n,challenge:l,response:c}=this._extractSignatureResponseHeaders(t),p=this._getRequestMetadata(t);if(s)this._notifySignatureInvalid(p),a=!0;else if(r)if(e){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(i)?(this._notifySignatureTypeUsingErrorCode(i,p,r,o,n,l,c),a=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(p,r,o,n,l,c),a=!0}return a}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(t=null){const e=Number((t||{}).status);let a=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(e)){const e=this._extractRequestResponse(t),i=this._extractResponseErrorCode(e),s=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(i),r=this._getRequestMetadata(t);s&&(this._notifyWaitingForProcessResponse(r),a=!0)}return a}_notifySignatureRequiredFirstStep(t,e,a,i){this._defineSignatureType(e,a),this._defineSignatureValue(e,a,i),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:e,data:a,metadata:t}}))}_notifySignatureRequired(t,e,a,i,s,r){this._defineSignatureValue(e,a,i);const o={type:e,data:a,challenge:s,metadata:t};r&&(o.response=r),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:o}))}_notifySignatureInvalid(t){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:t}}))}_notifyWaitingForProcessResponse(t){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:t}}))}_getRequestMetadata(t){const{responseURL:e,status:a}=t;return{path:this._path,method:this.method,url:e,status:a}}_emitEvent(t){this.htmlContext?this.htmlContext.dispatchEvent(t):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(t="",e="",a=""){const i=e.split(";").findIndex((e=>e===t));return a?a.split(";")[i]:""}toString(t=""){return`[object ${t||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(t=!1){return this._buildPromise(t)}_extractResponseErrorCode(t){return t?t["error-code"]||t.messages&&t.messages[0].code:null}_notifySignatureTypeUsingHeaders(t,e,a,i,s,r){i?this._notifySignatureRequired(t,e,a,i,s,r):this._notifySignatureRequiredFirstStep(t,e,a,i)}_notifySignatureTypeUsingErrorCode(t,e,a,i,s,r,o){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(t)?this._notifySignatureRequiredFirstStep(e,a,i,s):this._notifySignatureRequired(e,a,i,s,r,o)}}class Gt extends zt{constructor(t=null){super(Object.assign(t||{},{method:"GET"}))}toString(t=""){return super.toString(t||"BGADPRequestGET")}}class Xt extends Gt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`mortgages/v${this.version}/quotations`)}toString(){return super.toString("BGADPMortgagesQuotationsGetV0")}}class Jt extends Gt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`mortgages/v${this.version}/quotations/{quotation-id}`)}toString(){return super.toString("BGADPMortgagesQuotationsQuotationGetV0")}}class Qt extends(e(a)){static get is(){return"bbva-local-mortgages-api-dm"}static get properties(){return{host:{type:String},apiVersion:{type:String,attribute:"api-version"},requiredToken:{type:String,attribute:"required-token"},native:{type:Boolean,attribute:"native"},headers:{type:Object,attribute:"headers"},timeout:{type:Number,attribute:"timeout"}}}constructor(){super(),this.apiVersion="0",this.requiredToken="tsec",this.native=!1,this.headers={},this.timeout=120}getMortgageListQuotations(){const t={host:this.host,headers:{...this.headers,"Content-Type":"application/json"},version:this.apiVersion,requiredToken:this.requiredToken,native:this.native,timeout:this.timeout,forceBoundary:!1},e=Qt._serviceMortgagesListQuotationsGetV0(t);this._generateGetService(e,{customEvent:"get-mortgage-list-quotations-v0-success",errorFireEventHandler:"get-mortgage-list-quotations-v0-error"})}getMortgageQuotationId(t){const e={host:this.host,headers:{...this.headers,"Content-Type":"application/json"},body:t.body,version:this.apiVersion,requiredToken:this.requiredToken,native:this.native,timeout:this.timeout,forceBoundary:!1,params:{"quotation-id":t.quotationId}},a=Qt._serviceMortgagesQuotationsQuotationGetV0(e);this._generateGetService(a,{customEvent:"get-mortgage-quotations-quotation-v0-success",errorFireEventHandler:"get-mortgage-quotations-quotation-v0-error"})}static _serviceMortgagesListQuotationsGetV0(t){return new Xt(t)}static _serviceMortgagesQuotationsQuotationGetV0(t){return new Jt(t)}}var Zt=i`
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

.notification-margin {
  margin-top: 1rem;
}
`;var Yt=i`[ambient^=light] {
  --bbva-list-simple-label-color: initial;
  --bbva-list-simple-mask-color: initial;
  --bbva-list-simple-description-color: initial;
  --bbva-list-simple-icon-color: initial;
  --bbva-list-simple-active-bg-color: initial;
  --bbva-list-simple-active-link-color: initial;
  --bbva-list-simple-link-color: initial;
  --bbva-list-simple-link-active-color: initial;
  --bbva-list-simple-skeleton-color: initial;
  --bbva-list-simple-skeleton-bg: initial;
  --bbva-list-simple-stacked-label-color: initial;
}
${(new s).mediaRules()}`;const te=new s;var ee=i`[ambient^=dark] {
  --bbva-list-simple-label-color: var(--colorsPrimaryCoreLightened, ${r(o.primaryCoreLightened)});
  --bbva-list-simple-mask-color: var(--colorsPrimaryCoreLightened, ${r(o.primaryCoreLightened)});
  --bbva-list-simple-description-color: var(--colorsPrimaryCoreLightened, ${r(o.primaryCoreLightened)});
  --bbva-list-simple-icon-color: var(--colorsPrimaryCoreLightened, ${r(o.primaryCoreLightened)});
  --bbva-list-simple-active-bg-color: token("foundations.colors.primaryCoreDark");
  --bbva-list-simple-active-link-color: var(--colorsPrimarySubduedLight, ${r(o.primarySubduedLight)});
  --bbva-list-simple-link-color: var(--colorsPrimaryCoreLightened, ${r(o.primaryCoreLightened)});
  --bbva-list-simple-link-active-color: var(--colorsPrimarySubduedLight, ${r(o.primarySubduedLight)});
  --bbva-list-simple-skeleton-color: var(--colorsPrimaryMedium, ${r(o.primaryMedium)});
  --bbva-list-simple-stacked-label-color: var(--colorsPrimaryCoreLightened, ${r(o.primaryCoreLightened)});
}
${te.mediaRules()}`;const ae={dark:i`
    ${n.dark}
    ${l.dark}
    ${c.dark}
    ${ee}
  `,light:i`
    ${n.light}
    ${l.light}
    ${c.light}
    ${Yt}
  `},ie=new s;var se=i`:host {
  --_list-simple-text-color: var(--bbva-list-simple-dark-mode-text-color,var(--bbva-list-simple-text-color, var(--colorsSecondary600, ${r(o.secondary600)})));
  --_list-simple-mask-color: var(--bbva-list-simple-dark-mode-mask-color,var(--bbva-list-simple-mask-color, var(--colorsSecondary600, ${r(o.secondary600)})));
  --_list-simple-label-color: var(--bbva-list-simple-dark-mode-label-color,var(--bbva-list-simple-label-color, var(--colorsSecondary600, ${r(o.secondary600)})));
  --_list-simple-description-color: var(--bbva-list-simple-dark-mode-description-color,var(--bbva-list-simple-description-color, var(--colorsSecondary600, ${r(o.secondary600)})));
  --_list-simple-active-bg-color: var(--bbva-list-simple-dark-mode-active-bg-color,var(--bbva-list-simple-active-bg-color, var(--colorsSecondary100, ${r(o.secondary100)})));
  --_list-simple-stacked-label-color: var(--bbva-list-simple-dark-mode-stacked-label-color,var(--bbva-list-simple-stacked-label-color, var(--colorsSecondary500, ${r(o.secondary500)})));
  --_list-simple-link-color: var(--bbva-list-simple-dark-mode-link-color,var(--bbva-list-simple-link-color, var(--colorsPrimaryMedium, ${r(o.primaryMedium)})));
  --_list-simple-link-active-color: var(--bbva-list-simple-dark-mode-link-active-color,var(--bbva-list-simple-link-active-color, var(--colorsPrimaryCoreDark, ${r(o.primaryCoreDark)})));
  --_list-simple-icon-color: var(--bbva-list-simple-dark-mode-icon-color,var(--bbva-list-simple-icon-color, var(--colorsPrimaryMedium, ${r(o.primaryMedium)})));
  --_list-simple-icon-active-color: var(--bbva-list-simple-dark-mode-icon-active-color,var(--bbva-list-simple-icon-active-color, var(--colorsPrimaryCoreDark, ${r(o.primaryCoreDark)})));
  --_list-simple-skeleton-quote-color: var(--bbva-list-simple-dark-mode-skeleton-color,var(--bbva-list-simple-skeleton-color, var(--colorsSecondary200, ${r(o.secondary200)})));
  --_list-simple-skeleton-quote-bg: var(--bbva-list-simple-dark-mode-skeleton-bg,var(--bbva-list-simple-skeleton-bg, transparent));
  display: block;
  box-sizing: border-box;
  position: relative;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(d.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(d.spacer)}))) / 16) * 1rem);
  min-height: var(--bbva-list-simple-min-height, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${r(d.spacer)}))) / 16) * 1rem));
  color: var(--_list-simple-text-color);
  user-select: none;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.sr-only {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
}

.ellipsis {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

.wrapper-description,
.wrapper-description [data-tag-name=bbva-text] {
  text-align: right;
}

dl,
dd {
  margin: 0;
}

dl {
  display: flex;
  justify-content: space-between;
}

dt,
dd {
  display: flex;
}

dt {
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(d.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-link] {
  text-align: left;
  color: var(--_list-simple-link-color);
}
[data-tag-name=bbva-link]:active {
  --_list-simple-link-color: var(--_list-simple-link-active-color);
}

.action-icons {
  display: flex;
}

button {
  height: 1.5rem;
  width: 1.5rem;
  border: none;
  padding: 0;
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(d.spacer)}))) / 16) * 1rem);
  background-color: transparent;
  color: var(--_list-simple-icon-color);
}
button:active {
  --_list-simple-icon-color: var(--_list-simple-icon-active-color);
}

.wrapper-mask {
  color: var(--_list-simple-mask-color);
}
:host(:not([variant=stacked])) .wrapper-mask {
  align-self: center;
}

.label {
  color: var(--_list-simple-label-color);
}

.description {
  color: var(--_list-simple-description-color);
}

.wrapper-amount {
  overflow: initial;
}

:host([label-medium]) [data-tag-name=bbva-text].label,
:host([description-medium]) [data-tag-name=bbva-text].description,
:host([description-medium]) [data-tag-name=bbva-amount],
:host([description-medium]) .wrapper-mask {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${r(p.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${r(p.medium.fontStyle)});
}

:host([description-italic]) [data-tag-name=bbva-text].description,
:host([description-italic]) [data-tag-name=bbva-amount] {
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${r(p.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${r(p.bookItalic.fontStyle)});
}

:host([description-medium][description-italic]) [data-tag-name=bbva-text].description,
:host([description-medium][description-italic]) [data-tag-name=bbva-amount],
:host([description-date]) [data-tag-name=bbva-text].description {
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight, ${r(p.mediumItalic.fontWeight)});
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${r(p.mediumItalic.fontStyle)});
}

:host([disabled]) [data-tag-name=bbva-link][disabled] {
  opacity: 1;
}

.skeleton {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  pointer-events: none;
  transition: opacity 0.4s ease-in-out;
  background-repeat: no-repeat;
  opacity: 0;
  background-image: linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%);
  background-color: var(--_list-simple-skeleton-quote-bg);
  background-size: calc((30% * 2) + (16px/ 2)) 16px, calc((40% * 2) + (16px/ 2)) 16px;
  background-position: 24px 12px, 305% 12px;
}
:host([variant=stacked]) .skeleton {
  background-image: linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%);
  background-color: var(--_list-simple-skeleton-quote-bg);
  background-size: calc((30% * 2) + (16px/ 2)) 16px, calc((40% * 2) + (16px/ 2)) 16px;
  background-position: 24px 12px, 24px 36px;
}
:host([variant=stacked-center]) .skeleton {
  background-image: linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%);
  background-color: var(--_list-simple-skeleton-quote-bg);
  background-size: calc((30% * 2) + (16px/ 2)) 16px, calc((40% * 2) + (16px/ 2)) 16px;
  background-position: 90% 12px, 160% 36px;
}

:host([variant=stacked]) .wrapper {
  display: flex;
  align-items: center;
  justify-content: space-between;
}
:host([variant=stacked]) dl {
  flex-direction: column;
}
:host([variant=stacked]) .wrapper-description,
:host([variant=stacked]) .wrapper-description [data-tag-name=bbva-text] {
  text-align: left;
}

[data-tag-name=bbva-link]:not([href])[active]:not([disabled]) {
  background-color: transparent;
}

:host([action-link]:active),
:host([description-link]:active),
:host([label-link]:active) {
  background-color: var(--_list-simple-active-bg-color);
}

:host([hide-padding-top]) {
  padding-top: 0;
}

:host([hide-padding-bottom]) {
  padding-bottom: 0;
}

:host([variant=stacked-center]) .wrapper {
  display: flex;
  align-items: center;
  justify-content: center;
}
:host([variant=stacked-center]) .wrapper [data-tag-name=bbva-link], :host([variant=stacked-center]) [data-tag-name=bbva-text],
:host([variant=stacked-center]) .wrapper-description {
  text-align: center;
}
:host([variant=stacked-center]) dl {
  flex-direction: column;
  margin: auto;
}
:host([variant=stacked-center]) dt,
:host([variant=stacked-center]) dd {
  padding: 0;
  margin: auto;
}
:host([variant=stacked-center]) .action-icons {
  position: absolute;
  right: 1rem;
}

:host([loading]) {
  pointer-events: none;
}
:host([loading]) * {
  opacity: 0;
}
:host([loading]) .skeleton {
  opacity: 1;
}

:host([variant^=stacked]) .label {
  color: var(--_list-simple-stacked-label-color);
}

:host([variant=stacked-center][action-icon]) dl,
:host([variant=stacked-center][action-secondary-icon]) dl {
  padding: 0 calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${r(d.spacer)}))) / 16) * 1rem);
}

:host([variant=stacked-center][action-icon][action-secondary-icon]) dl {
  padding: 0 calc(((8 * var(--gridSpacerVariant, var(--gridSpacer, ${r(d.spacer)}))) / 16) * 1rem);
}
${ie.mediaRules()}`;class re extends(u(h(g(b(m(v(a))))))){static get is(){return"bbva-list-simple"}static get scopedElements(){const t=[x,R,$,C,A];return re.scopedElementsFromClasses(t)}static get properties(){return{label:{type:String},labelLink:{type:Boolean,attribute:"label-link"},labelEllipsis:{type:Boolean,attribute:"label-ellipsis"},labelMedium:{type:Boolean,attribute:"label-medium",reflect:!0},description:{type:String},descriptionLink:{type:Boolean,attribute:"description-link"},descriptionMedium:{type:Boolean,attribute:"description-medium",reflect:!0},descriptionDate:{type:Boolean,attribute:"description-date",reflect:!0},descriptionItalic:{type:Boolean,attribute:"description-italic"},descriptionEllipsis:{type:Boolean,attribute:"description-ellipsis"},actionIcon:{type:String,attribute:"action-icon",reflect:!0},actionSecondaryIcon:{type:String,attribute:"action-secondary-icon",reflect:!0},actionAccessibilityText:{type:String,attribute:"action-accessibility-text"},actionSecondaryAccessibilityText:{type:String,attribute:"action-secondary-accessibility-text"},actionLink:{type:String,attribute:"action-link"},actionLinkEllipsis:{type:Boolean,attribute:"action-link-ellipsis"},status:{type:String},color:{type:String},mask:{type:String},loading:{type:Boolean,reflect:!0},disableLink:{type:Boolean},variant:{type:String,reflect:!0},hidePaddingTop:{type:Boolean,attribute:"hide-padding-top"},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom"},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"},maskChars:{type:String,attribute:"mask-chars"},visibleChars:{type:Number,attribute:"visible-chars"},labelAccessibilityText:{type:String,attribute:"label-accessibility-text"},labelLinkAccessibilityText:{type:String,attribute:"label-link-accessibility-text"},descriptionLinkAccessibilityText:{type:String,attribute:"description-link-accessibility-text"},actionLinkAccessibilityText:{type:String,attribute:"action-link-accessibility-text"},descriptionAccessibilityText:{type:String,attribute:"description-accessibility-text"},rolelink:{type:String,attribute:"role-link"},arialiveLink:{type:String,attribute:"aria-live-link"},labelTagText:{type:String,attribute:"label-tag-text"},descriptionTagText:{type:String,attribute:"description-tag-text"},labelRoleText:{type:String,attribute:"label-role-text"},descriptionRoleText:{type:String,attribute:"description-role-text"},labelAriaLiveText:{type:String,attribute:"label-aria-live-text"},descriptionAriaLiveText:{type:String,attribute:"description-aria-live-text"},showCurrencyCode:{type:Boolean,attribute:"show-currency-code"}}}constructor(){super(),this.stackedCenter=!1,this.labelMedium=!1,this.labelLink=!1,this.descriptionLink=!1,this.descriptionMedium=!1,this.descriptionDate=!1,this.descriptionItalic=!1,this.labelEllipsis=!1,this.descriptionEllipsis=!1,this.actionLinkEllipsis=!1,this.loading=!1,this.disableLink=!1,this.actionLink="",this.description="",this.status="",this.color="",this.variant="",this.hidePaddingTop=!1,this.hidePaddingBottom=!1,this.decimalsHidden=!1,this.actionAccessibilityText="bbva-list-simple-action-accessibility-text",this.actionSecondaryAccessibilityText="bbva-list-simple-secondary-action-accessibility-text",this.labelAccessibilityText="bbva-list-simple-label-accessibility-text",this.descriptionAccessibilityText="bbva-list-simple-description-accessibility-text",this.maskChars="••••",this.visibleChars=0,this.showCurrencyCode=!1}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.disabledTabindex=!0}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.disabledTabindex=!1}static get styles(){return[super.styles,se,ae.light,ae.dark,y("button:focus"),_("bbva-list-simple-shared-styles")]}get _isValidAmount(){return this.amount||0===this.amount}get _amount(){return f`
      <bbva-amount
        disabled-tabindex
        ?decimals-hidden="${this.decimalsHidden}"
        variant="m"
        .amount="${this.amount}"
        .localCurrency="${this.localCurrency}"
        .currencyCode="${this.currencyCode}"
        .language="${this.language}"
        ?symbol-right="${this.symbolRight}"
        ?show-currency-code="${this.showCurrencyCode}"
      >
      </bbva-amount>
    `}get _icon(){return f`
      <button @click="${()=>this._iconClick("icon")}">
        <span class="sr-only">${this.t(this.actionAccessibilityText)}</span>
        <bbva-core-icon icon="${this.actionIcon}" size="24" aria-hidden="true"></bbva-core-icon>
      </button>
    `}get _secondaryIcon(){return f`
      <button @click="${()=>this._iconClick("secondary-icon")}">
        <span class="sr-only">${this.t(this.actionSecondaryAccessibilityText)}</span>
        <bbva-core-icon
          icon="${this.actionSecondaryIcon}"
          size="24"
          aria-hidden="true"
        ></bbva-core-icon>
      </button>
    `}get _actionIcons(){return f`
      <div class="action-icons">
        ${this.actionIcon?this._icon:""} ${this.actionSecondaryIcon?this._secondaryIcon:""}
      </div>
    `}get _badgeVariability(){const t="nochange"===this.status?"no-change":this.status;return f`
      <bbva-badge-variability
        disabled-tabindex
        .status=${t}
        .color=${this.color}
      ></bbva-badge-variability>
    `}get _mask(){const t=S(this.mask,this.maskChars,!0,this.visibleChars);return f`
      <div>
        <span class="mask">${this.maskChars}</span>
        <span class="number">${t.substr(this.maskChars.length)}</span>
      </div>
    `}get _actions(){let t=null;return this.actionIcon||this.actionSecondaryIcon?t=this._actionIcons:this.actionLink&&(t=this._tplLink("actionLink")),t}get _definitionDescriptionTpl(){let t=null,e="";return this.description?(t=this._tplText("description"),e="description"):this.mask?(t=this._mask,e="mask"):this._isValidAmount&&(t=this._amount,e="amount"),f`
      <dd class=${k({[`wrapper-${e}`]:!0,ellipsis:this.descriptionEllipsis})}>
        ${this.status?this._badgeVariability:""} ${t}
      </dd>
    `}_tplLink(t){const e="actionLink"===t?`${t}AccessibilityText`:`${t}LinkAccessibilityText`;return f`
      <bbva-link
        class=${k({ellipsis:this[`${t}Ellipsis`]})}
        aria-label="${T(this.t(this[e]))}"
        ?disabled=${this.disabled||this.disableLink}
        @click="${()=>this._linkClick(t)}"
      >
        <span role=${T(this.roleLink)} aria-live=${T(this.arialiveLink)}>
          ${this[t]}
        </span>
      </bbva-link>
    `}_tplNoLink(t){const e=`${t}AccessibilityText`,a=`${t}TagText`,i=`${t}RoleText`,s=`${t}AriaLiveText`;return f`
      <bbva-text
        aria-label="${this.t(this[e])}"
        role="${T(this[i])}"
        aria-live="${T(this[s])}"
        class="${t}"
        unset
        size="S"
        text="${this[t]}"
        tag="${T(this[a])}"
      >
      </bbva-text>
    `}_tplText(t){return f` ${this[`${t}Link`]?this._tplLink(t):this._tplNoLink(t)} `}_iconClick(t){this.dispatchEvent(new CustomEvent(`list-simple-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}_linkClick(t){const e=t.replace(/[A-Z]/g,(t=>`-${t.toLowerCase()}`));this.dispatchEvent(new CustomEvent(`list-simple-link-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}renderDefault(){return f`
      <dl>
        <dt class=${k({ellipsis:this.labelEllipsis})}>
          ${this._tplText("label")} ${this.actionIcon?this._actionIcons:""}
        </dt>
        ${this._definitionDescriptionTpl}
      </dl>
    `}renderStacked(){return f`
      <div class="wrapper">
        ${this.description||this._isValidAmount||this.mask?f`
              <dl>
                <dt>${this._tplText("label")}</dt>
                ${this._definitionDescriptionTpl}
              </dl>
            `:this._tplText("label")}
        ${this._actions}
      </div>
    `}render(){let t=null;const e=["stacked","stacked-center"].includes(this.variant);return t=this.label?this.description||this._isValidAmount||this.mask||e?e?this.renderStacked():this.renderDefault():this._tplText("label"):f` <div class="wrapper-description">${this._tplText("description")}</div> `,f`
      ${t}
      <div class="skeleton"></div>
    `}}customElements.define(re.is,re);const oe=new s;var ne=i`:host {
  display: flex;
  flex-direction: column;
  align-items: center;
  text-align: center;
  box-sizing: border-box;
  padding: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${r(d.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(d.spacer)}))) / 16) * 1em);
  position: relative;
  background-color: var(--bbva-notification-message-dark-mode-background-color, var(--bbva-notification-message-background-color, var(--colorsPrimarySubduedLight, ${r(o.primarySubduedLight)})));
  --_notification-message-icon-color: var(--bbva-notification-message-dark-mode-icon-color, var(--bbva-notification-message-icon-color, var(--colorsPrimaryCoreDark, ${r(o.primaryCoreDark)})));
  --_notification-message-information-icon-color: var(--bbva-notification-message-dark-mode-information-icon-color, var(--bbva-notification-message-information-icon-color, var(--colorsTertiaryType3Dark, ${r(o.tertiaryType3Dark)})));
  --_notification-message-success-icon-color: var(--bbva-notification-message-dark-mode-success-icon-color, var(--bbva-notification-message-success-icon-color, var(--colorsTertiaryType6Dark, ${r(o.tertiaryType6Dark)})));
  --_notification-message-error-icon-color: var(--bbva-notification-message-dark-mode-error-icon-color, var(--bbva-notification-message-error-icon-color, var(--colorsTertiaryType1Dark, ${r(o.tertiaryType1Dark)})));
  --_notification-message-sustainability-icon-color: var(--bbva-notification-message-dark-mode-sustainability-icon-color, var(--bbva-notification-message-sustainability-icon-color, var(--colorsPrimaryVariantDark, ${r(o.primaryVariantDark)})));
  --_notification-message-information-background-color: var(--bbva-notification-message-dark-mode-information-background-color, var(--bbva-notification-message-information-background-color, var(--colorsTertiaryType3Lightened, ${r(o.tertiaryType3Lightened)})));
  --_notification-message-success-background-color: var(--bbva-notification-message-dark-mode-success-background-color, var(--bbva-notification-message-success-background-color, var(--colorsTertiaryType6Lightened, ${r(o.tertiaryType6Lightened)})));
  --_notification-message-error-background-color: var(--bbva-notification-message-dark-mode-error-background-color, var(--bbva-notification-message-error-background-color, var(--colorsTertiaryType5Lightened, ${r(o.tertiaryType5Lightened)})));
  --_notification-message-sustainability-background-color: var(--bbva-notification-message-dark-mode-sustainability-background-color, var(--bbva-notification-message-sustainability-background-color, var(--colorsPrimaryVariantLightened, ${r(o.primaryVariantLightened)})));
  --_notification-message-title-color: var(--bbva-notification-message-dark-mode-title-color, var(--bbva-notification-message-title-color, var(--colorsSecondary600, ${r(o.secondary600)})));
  --_notification-message-paragraph-color: var(--bbva-notification-message-dark-mode-paragraph-color, var(--bbva-notification-message-paragraph-color, var(--colorsSecondary600, ${r(o.secondary600)})));
  --_text-weight: var(--bbva-notification-message-dark-mode-text-weight, var(--bbva-notification-message-text-weight, var(--fontFacePrimaryBookFontWeight, ${r(p.book.fontWeight)})));
  --skeleton-quote-color: var(--bbva-notification-message-dark-mode-skeleton-color, var(--bbva-notification-message-skeleton-color, var(--colorsPrimaryCoreLightened, ${r(o.primaryCoreLightened)})));
  --skeleton-quote-bg: var(--bbva-notification-message-dark-mode-skeleton-bg-color, var(--bbva-notification-message-skeleton-bg-color, var(--colorsPrimarySubduedLight, ${r(o.primarySubduedLight)})));
  --_notification-message-skeleton-animated-layer-bg: var(--bbva-notification-message-dark-mode-skeleton-animated-layer-bg-color, var(--colorsPrimaryCoreLightened, ${r(o.primaryCoreLightened)}));
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

.title {
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(d.spacer)}))) / 16) * 1rem);
  color: var(--_notification-message-title-color);
  font-size: var(--bbva-notification-message-title-size, var(--typographyTypeLarge, ${r(E.typeLarge)}));
}

.paragraph {
  color: var(--_notification-message-paragraph-color);
  font-weight: var(--bbva-notification-message-paragraph-weight, var(--_text-weight));
  font-size: var(--bbva-notification-message-paragraph-size, var(--typographyTypeSmall, ${r(E.typeSmall)}));
  line-height: var(--bbva-notification-message-line-height, var(--lineHeightTypeSmall, ${r(I.typeSmall)}));
}
.paragraph:not(.no-space) {
  padding: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(d.spacer)}))) / 16) * 1rem);
}

:host([hide-bottom-padding-paragraph]) > .paragraph {
  padding: 0;
}

.description {
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(d.spacer)}))) / 16) * 1rem);
  color: var(--_notification-message-title-color);
  font-style: var(--fontFacePrimaryMediumFontStyle, ${r(p.medium.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${r(p.medium.fontWeight)});
}

:host([description][description-text-italic]) > .description {
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${r(p.mediumItalic.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight, ${r(p.mediumItalic.fontWeight)});
}

[data-tag-name=bbva-icon] {
  margin: 0 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(d.spacer)}))) / 16) * 1rem);
  --bbva-icon-color: var(--_notification-message-icon-color);
}

[data-tag-name=bbva-link]:not(.no-space) {
  padding: 0 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(d.spacer)}))) / 16) * 1rem);
}

:host([hide-bottom-padding-link]) [data-tag-name=bbva-link] {
  padding: 0;
}

[data-tag-name=bbva-button-default][variant="icon no-background"] {
  position: absolute;
  top: 0;
  right: 0;
}

:host([variant=information]) {
  background-color: var(--_notification-message-information-background-color);
}
:host([variant=information]) [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_notification-message-information-icon-color);
}

:host([variant=success]) {
  background-color: var(--_notification-message-success-background-color);
}
:host([variant=success]) [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_notification-message-success-icon-color);
}

:host([variant=error]) {
  background-color: var(--_notification-message-error-background-color);
}
:host([variant=error]) [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_notification-message-error-icon-color);
}

:host([variant=sustainability]) {
  background-color: var(--_notification-message-sustainability-background-color);
}
:host([variant=sustainability]) [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_notification-message-sustainability-icon-color);
}

:host([loading]) {
  position: relative;
  pointer-events: none;
  background-repeat: no-repeat;
  overflow: hidden;
  opacity: 1;
  height: 10.125rem;
  background-image: linear-gradient(var(--skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: 24px 24px, calc((87% * 2) + (16px/ 2)) 16px, calc((87% * 2) + (16px/ 2)) 16px, calc((64.5% * 2) + (16px/ 2)) 16px;
  background-position: 50% 32px, -7% 72px, -7% 96px, -17.3% 120px;
}
:host([loading]) .skeleton {
  contain: strict;
  position: absolute;
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  height: inherit;
  top: 0;
  right: 0;
  left: 6.25rem;
}
:host([loading]):host([variant=default]) .skeleton {
  background-color: var(--bbva-notification-message-dark-mode-background-color, var(--bbva-notification-message-background-color, var(--colorsPrimarySubduedLight, ${r(o.primarySubduedLight)})));
}
:host([loading]):host([variant=information]) {
  background-color: var(--_notification-message-information-background-color);
}
:host([loading]):host([variant=information]) .skeleton {
  background-color: var(--_notification-message-information-background-color);
}
:host([loading]):host([variant=success]) {
  background-color: var(--_notification-message-success-background-color);
}
:host([loading]):host([variant=success]) .skeleton {
  background-color: var(--_notification-message-success-background-color);
}
:host([loading]):host([variant=error]) {
  background-color: var(--_notification-message-error-background-color);
}
:host([loading]):host([variant=error]) .skeleton {
  background-color: var(--_notification-message-error-background-color);
}
:host([loading]):host([variant=sustainability]) {
  background-color: var(--_notification-message-sustainability-background-color);
}
:host([loading]):host([variant=sustainability]) .skeleton {
  background-color: var(--_notification-message-sustainability-background-color);
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
${oe.mediaRules()}`;class le extends(m(v(b(a)))){static get is(){return"bbva-notification-message"}static get scopedElements(){return{"bbva-button-default":D,"bbva-link":R,"bbva-icon":w,"bbva-text":C}}static get properties(){return{iconSize:{type:Number,attribute:"icon-size"},icon:{type:String,attribute:"icon"},messageTitle:{type:String,attribute:"message-title"},message:{type:String},description:{type:String},tagTitle:{type:String,attribute:"tag-title"},linkTitle:{type:String,attribute:"link-title"},linkIcon:{type:String,attribute:"link-icon"},buttonText:{type:String,attribute:"button-text"},href:{type:String},loading:{type:Boolean,reflect:!1},variant:{type:String,reflect:!0},iconClose:{type:Boolean,attribute:"icon-close"},hideBottomPaddingParagraph:{type:Boolean,attribute:"hide-bottom-padding-paragraph"},hideBottomPaddingLink:{type:Boolean,attribute:"hide-bottom-padding-link"},descriptionTextItalic:{type:Boolean,attribute:"description-text-italic"},accessibilityLinkLabel:{type:String,attribute:"accessibility-link-label"}}}constructor(){super(),this.iconClose=!1,this.iconSize=24,this.variant="default",this._types={default:P(),information:O(),success:N(),error:L(),sustainability:M()},this.hideBottomPaddingParagraph=!1,this.hideBottomPaddingLink=!1,this.descriptionTextItalic=!1,this.loading=!1,this.accessibilityLinkLabel="bbva-notification-message-accessibility-link-label",this._accessibilityTextIcon="bbva-notification-message-accessibility-icon-text-",this.tagTitle="p"}static get styles(){return[super.styles,ne,_("bbva-notification-message-shared-styles"),q.light]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.isRoleAlert?this.setAttribute("role","alert"):this.setAttribute("role","status"),this.disabledTabindex=!0}get isRoleAlert(){return"error"===this.variant}get _icon(){return this.icon?this.icon:this._types[this.variant]||P()}get _closeIcon(){return this.iconClose&&"default"===this.variant?f`
          <bbva-button-default
            variant="icon no-background"
            .icon="${H()}"
            @click="${this._iconClick}"
            aria-label="${this.t("bbva-notification-message-close")}"
          >
          </bbva-button-default>
        `:j}get _title(){return this.messageTitle?f`
          <bbva-text
            .tag="${this.tagTitle}"
            alignment="center"
            .text="${this.messageTitle}"
            class="title"
            unset
            size="M"
          ></bbva-text>
        `:j}get _paragraph(){return f`<div
      class="paragraph
            ${k({"no-space":!this.buttonText&&!this.linkTitle})}"
    >
      ${this.message?f`<bbva-text alignment="center" text=${this.message} unset size="S"></bbva-text> `:f`<slot></slot>`}
    </div>`}get _description(){return this.description?f` <bbva-text
          class="description"
          alignment="center"
          .text=${this.description}
          unset
          size="S"
        ></bbva-text>`:j}get _link(){return this.linkTitle?f`
          <bbva-link
            aria-label="${this.t(this.accessibilityLinkLabel)}"
            class="${k({"no-space":!this.buttonText})}"
            variant="message"
            .href="${this.href}"
            @click="${this._linkClick}"
            .icon="${this.linkIcon}"
          >
            <span>${this.linkTitle}</span>
          </bbva-link>
        `:j}get _button(){return this.buttonText?f`
          <bbva-button-default
            ambient="light"
            data-tag-name="bbva-button-default"
            text="${this.buttonText}"
            @click="${this._buttonClick}"
          ></bbva-button-default>
        `:j}get _accessibilityIconDescription(){return`${this._accessibilityTextIcon}${this.variant}`}_iconClick(){this.dispatchEvent(new CustomEvent("notification-message-icon-click",{detail:!0,bubbles:!0,composed:!0}))}_linkClick(){this.dispatchEvent(new CustomEvent("notification-message-link-click",{detail:!0,bubbles:!0,composed:!0}))}_buttonClick(){this.dispatchEvent(new CustomEvent("notification-message-button-click",{detail:!0,bubbles:!0,composed:!0}))}render(){return f`${this.loading?f`<div class="skeleton"></div> `:f` ${this._closeIcon}
          <bbva-icon
            data-tag-name="bbva-icon"
            role="img"
            aria-label=${this.t(this._accessibilityIconDescription)}
            .icon="${this._icon}"
            .size="${this.iconSize}"
          ></bbva-icon>
          ${this._title} ${this._paragraph} ${this._description} ${this._link} ${this._button}`}`}}customElements.define(le.is,le);var ce=i`
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

[data-tag-name=bbva-header-category] {
  margin-top: 1rem;
}
`,pe=i`
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
`;class de extends(pt(V(v(a)))){static get is(){return"mortgage-tracking-tooltip"}static get scopedElements(){const t=[U,...de.configurationScopedElements()];return de.scopedElementsFromClasses(t)}static get properties(){return{configTooltip:{type:Object,attribute:"configTooltip"}}}constructor(){super(),this.configTooltip={}}static get styles(){return[pe,_("mortgage-tracking-tooltip-shared-styles")]}get modalTooltipDetail(){return this.shadowRoot.querySelector('[data-tag-name="bbva-help-modal"]')}openDetailTooltip(t){this.configTooltip=t,this.modalTooltipDetail.open()}openExpirateDate(){this.openDetailTooltip({id:"tooltipExpirateDate",headerText:this.t("bbva-feature-mortgage-tracking-detail-view-modal-expiration-requested-header"),title:this.t("bbva-feature-mortgage-tracking-detail-view-modal-expiration-date-title"),bodyText:this.t("bbva-feature-mortgage-tracking-detail-view-modal-expiration-date-text")})}openRequestAmount(){this.openDetailTooltip({id:"tooltipRequestAmount",headerText:this.t("bbva-feature-mortgage-tracking-detail-view-modal-amount-requested-header"),title:this.t("bbva-feature-mortgage-tracking-detail-view-modal-amount-requested-title"),bodyText:this.t("bbva-feature-mortgage-tracking-detail-view-modal-amount-requested-info")})}openMonthlyPayment(){this.openDetailTooltip({id:"tooltipMonthlyPayment",headerText:this.t("bbva-feature-mortgage-tracking-detail-view-modal-monthly-payment-header"),title:this.t("bbva-feature-mortgage-tracking-detail-view-modal-monthly-payment-title"),bodyText:this.t("bbva-feature-mortgage-tracking-detail-view-modal-monthly-payment-text")})}get tooltipTemplate(){return f`
    <bbva-help-modal
      full-height
      fixed-footer
      hide-content-padding-top
      id="${this.configTooltip.id}"
      class="mortgage-tracking-tooltip"
      header-text="${this.configTooltip.headerText}"
      title-icon=${F()}
      title-lines=2
      title-text="${this.configTooltip.title}"
      body-text="${this.configTooltip.bodyText}"
      button-text=${this.t("bbva-feature-mortgage-tracking-modal-button-understood")}
      >
    </bbva-help-modal>   
    `}render(){return f`${this.tooltipTemplate}`}}class ue extends(pt(V(v(a)))){static get is(){return"mortgage-tracking-detail"}static get scopedElements(){const t=[de,B,dt,U,re,le,C,...ue.configurationScopedElements()];return ue.scopedElementsFromClasses(t)}static get properties(){return{textProduct:{type:String,attribute:"text-product"},textSubproduct:{type:String,attribute:"text-subproduct"},textCertificateFolio:{type:String,attribute:"text-certificate-folio"},textRequestDate:{type:String,attribute:"text-request-date"},textExpirationDate:{type:String,attribute:"text-expiration-date"},textRequestAmount:{type:String,attribute:"text-request-amount"},textTerm:{type:String,attribute:"text-term"},textMonthlyPayment:{type:String,attribute:"text-monthly-payment"},textInterestRate:{type:String,attribute:"text-interest-rate"},textCat:{type:String,attribute:"text-cat"},descriptionCat:{type:String,attribute:"description-cat"}}}constructor(){super(),this.textProduct="",this.textSubproduct="",this.textCertificateFolio="",this.textRequestDate="",this.textExpirationDate="",this.textRequestAmount="",this.textTerm="",this.textInterestRate="",this.textMonthlyPayment="",this.textCat="",this.descriptionCat=""}static get styles(){return[ce,_("mortgage-tracking-detail-shared-styles")]}get getTooltipInformation(){return this.shadowRoot.querySelector('[data-tag-name="mortgage-tracking-tooltip"]')}_openTooltipExpirateDate(){this.getTooltipInformation.openExpirateDate()}_openTooltipRequestAmount(){this.getTooltipInformation.openRequestAmount()}_openTooltipMonthlyPayment(){this.getTooltipInformation.openMonthlyPayment()}_detailHeaderMain(){return f`
      <bbva-header-main
        variant="modal-three-level"
        id="detail-header"
        text="${this.t("bbva-feature-mortgage-tracking-detail-view-header")}"
        icon-right-primary="${H()}"
        > 
      </bbva-header-main>
    `}_detailHeaderGeneral(){return f`
      <bbva-header-category
        id="detailCategory"
        text="${this.t("bbva-feature-mortgage-tracking-detail-view-list-title")}"
      >
      </bbva-header-category>
    `}_detailSimpleListGeneral(){return f`
      <bbva-list-simple
        id="tracking-product"
        class='alter-font-weight'
        variant='stacked'
        label=${this.t("bbva-feature-mortgage-tracking-detail-view-list-product")}
        description="${this.textProduct}"
      >
      </bbva-list-simple>
      <bbva-list-simple
        id="tracking-subproduct"
        class='alter-font-weight'
        variant='stacked'
        label=${this.t("bbva-feature-mortgage-tracking-detail-view-list-subproduct")}
        description="${this.textSubproduct}"
      >
      </bbva-list-simple>
      <bbva-list-simple
        id="tracking-description"
        class='alter-font-weight'
        variant='stacked'
        label=${this.t("bbva-feature-mortgage-tracking-detail-view-list-type")}
        description=${this.t("bbva-feature-mortgage-tracking-detail-view-list-type-description")}
      >
      </bbva-list-simple>
      <bbva-list-simple
        id="tracking-folio"
        class='alter-font-weight'
        variant='stacked'
        label=${this.t("bbva-feature-mortgage-tracking-detail-view-list-id")}
        description="${this.textCertificateFolio}"
      >
      </bbva-list-simple>
      <bbva-list-simple
        id="tracking-request-date"
        class='alter-font-weight'
        variant='stacked'
        label=${this.t("bbva-feature-mortgage-tracking-detail-view-list-request-date")}
        description="${this.textRequestDate}"
      >
      </bbva-list-simple>
      <bbva-list-simple
        id="tracking-expiration-date"
        class='alter-font-weight'
        variant='stacked'
        label=${this.t("bbva-feature-mortgage-tracking-detail-view-list-expiration-date")}
        description="${this.textExpirationDate}"
        action-icon="${F()}"
        action-accessibility-text="help"
        @list-simple-icon-click=${this._openTooltipExpirateDate}
      >
      </bbva-list-simple>
      <bbva-list-simple
        id="tracking-request-amount"
        class='alter-font-weight'
        variant='stacked'
        label=${this.t("bbva-feature-mortgage-tracking-detail-view-list-amount")}
        description="${this.textRequestAmount}"
        action-icon="${F()}"
        action-accessibility-text="help"
        @list-simple-icon-click=${this._openTooltipRequestAmount}
      >
      </bbva-list-simple>
      <bbva-list-simple
        id="tracking-term"
        class='alter-font-weight'
        variant='stacked'
        label=${this.t("bbva-feature-mortgage-tracking-detail-view-list-term")}
        description="${this.textTerm}"
      >
      </bbva-list-simple>
      <bbva-list-simple
        id="tracking-monthly-payment"
        class='alter-font-weight'
        variant='stacked'
        label=${this.t("bbva-feature-mortgage-tracking-detail-view-list-monthly-payment")}
        description="${this.textMonthlyPayment}"
        action-icon="${F()}"
        action-accessibility-text="help"
        @list-simple-icon-click=${this._openTooltipMonthlyPayment}
      >
      </bbva-list-simple>

      <mortgage-tracking-tooltip
        id="tracking-tooltip"
        >
      </mortgage-tracking-tooltip>
    `}_detailHeaderRates(){return f`
      <bbva-header-category
        id="detail-category"
        text="${this.t("bbva-feature-mortgage-tracking-detail-view-header-category-text")}"
      >
      </bbva-header-category>
    `}_detailSimpleListRates(){return f`
      <bbva-list-simple
        id="detail-text-interest-rate"
        class='alter-font-weight'
        variant='stacked'
        label=${this.t("bbva-feature-mortgage-tracking-detail-view-list-interest-rate-text")}
        description="${this.textInterestRate}"
      >
      </bbva-list-simple>
      <bbva-list-simple
        id="detail-text-cat"
        class='alter-font-weight'
        variant='stacked'
        label=${this.t("bbva-feature-mortgage-tracking-detail-view-list-cat-rate-label")}
        description="${this.textCat}"
      >
      </bbva-list-simple>
    `}_detailTextRate(){return f`
      <bbva-text
        alignment="center"
        id="detail-category"
        text="${this.descriptionCat}"
      >
      </bbva-text>
    `}_detailNotitificationMessage(){return f`
      <bbva-notification-message
        id="detail-notification"
        message="${this.t("bbva-feature-mortgage-tracking-detail-view-notification-text")}"
      >
      </bbva-notification-message>
    `}get detailTemplate(){return f`
      ${super.render()}
      <div slot="slot-content" class="detail">
        ${this._detailHeaderMain()}
        ${this._detailHeaderGeneral()}
        ${this._detailSimpleListGeneral()}
        ${this._detailHeaderRates()}
        ${this._detailSimpleListRates()}
        ${this._detailTextRate()}
        ${this._detailNotitificationMessage()}
      </div>
    `}render(){return f`${this.detailTemplate}`}}var he=i`[ambient^=light] {
  --bbva-panel-detail-title-color: initial;
  --bbva-panel-detail-status-description-color: initial;
  --bbva-panel-detail-amount-info-color: initial;
  --bbva-panel-detail-negative-amount-color: initial;
  --bbva-progress-bar-main-legend-bg-color: initial;
  --bbva-progress-bar-secondary-legend-bg-color: initial;
  --bbva-panel-detail-extra-info-color: initial;
  --bbva-panel-detail-wrapper-color: initial;
  --bbva-panel-detail-progress-bar-color: initial;
  --bbva-panel-detail-skeleton-color: initial;
}
${(new s).mediaRules()}`;const ge=new s;const be={dark:i`
    ${i`[ambient^=dark] {
  --bbva-panel-detail-title-color: var(--colorsPrimaryCoreLightened, ${r(o.primaryCoreLightened)});
  --bbva-panel-detail-status-description-color: var(--colorsPrimaryCoreLightened, ${r(o.primaryCoreLightened)});
  --bbva-panel-detail-amount-info-color: var(--colorsPrimaryCoreLightened, ${r(o.primaryCoreLightened)});
  --bbva-panel-detail-negative-amount-color: var(--colorsPrimaryCoreLightened, ${r(o.primaryCoreLightened)});
  --bbva-progress-bar-main-legend-bg-color: var(--colorsPrimaryCoreLightened, ${r(o.primaryCoreLightened)});
  --bbva-progress-bar-secondary-legend-bg-color: var(--colorsPrimaryCoreLightened, ${r(o.primaryCoreLightened)});
  --bbva-panel-detail-extra-info-color: var(--colorsPrimaryCoreLightened, ${r(o.primaryCoreLightened)});
  --bbva-panel-detail-wrapper-color: var(--colorsPrimaryCoreLightened, ${r(o.primaryCoreLightened)});
  --bbva-panel-detail-progress-bar-color: var(--colorsPrimaryMediumLight, ${r(o.primaryMediumLight)});
  --bbva-panel-detail-skeleton-color: var(--colorsPrimaryMedium, ${r(o.primaryMedium)});
}
${ge.mediaRules()}`}
    ${n.dark}
    ${l.dark}
    ${W.dark}
    ${K.dark}
    ${c.dark}
    ${z.dark}
  `,light:i`
    ${he}
    ${n.light}
    ${l.light}
    ${W.light}
    ${K.light}
    ${c.light}
    ${z.light}
  `},me=new s;var ve=i`:host {
  display: block;
  padding: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${r(d.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(d.spacer)}))) / 16) * 1em);
  box-sizing: border-box;
  border-radius: var(--bbva-panel-detail-border-radius, var(--borderRadiusSmall, ${r(X.small)}));
  box-shadow: var(--bbva-panel-detail-box-shadow, var(--boxShadowType1, ${r(G.type1)}));
  text-align: center;
  --_panel-detail-title-color: var(--bbva-panel-detail-title-dark-mode-color, var(--bbva-panel-detail-title-color, var(--colorsSecondary600, ${r(o.secondary600)})));
  --_panel-detail-status-description-color: var(--bbva-panel-detail-status-description-dark-mode-color, var(--bbva-panel-detail-status-description-color, var(--colorsSecondary500, ${r(o.secondary500)})));
  --_panel-detail-amount-info-color: var(--bbva-panel-detail-amount-info-dark-mode-color, var(--bbva-panel-detail-amount-info-color, var(--colorsSecondary500, ${r(o.secondary500)})));
  --_panel-detail-negative-amount-color: var(--bbva-panel-detail-negative-amount-dark-mode-color, var(--bbva-panel-detail-negative-amount-color, var(--colorsTertiaryType1Dark, ${r(o.tertiaryType1Dark)})));
  --_panel-detail-main-legend-bg-color: var(--bbva-progress-bar-main-legend-dark-mode-bg-color, var(--bbva-progress-bar-main-legend-bg-color, var(--colorsPrimaryCoreLight, ${r(o.primaryCoreLight)})));
  --_panel-detail-secondary-legend-bg-color: var(--bbva-progress-bar-secondary-legend-dark-mode-bg-color, var(--bbva-progress-bar-secondary-legend-bg-color, var(--colorsSecondary200, ${r(o.secondary200)})));
  --_panel-detail-extra-info-color: var(--bbva-panel-detail-extra-info-dark-mode-color, var(--bbva-panel-detail-extra-info-color, var(--colorsSecondary500, ${r(o.secondary500)})));
  --_panel-detail-wrapper-color: var(--bbva-panel-detail-wrapper-dark-mode-color, var(--bbva-panel-detail-wrapper-color, var(--colorsSecondary600, ${r(o.secondary600)})));
  --_panel-detail-progress-bar-color: var(--bbva-panel-detail-progress-bar-dark-mode-color, var(--bbva-panel-detail-progress-bar-color, var(--colorsPrimaryMedium, ${r(o.primaryMedium)})));
  --_panel-detail-skeleton-color: var(--bbva-panel-detail-skeleton-dark-mode-color, var(--bbva-panel-detail-skeleton-color, var(--colorsSecondary200, ${r(o.secondary200)})));
  --_panel-detail-skeleton-background: var(--bbva-panel-detail-skeleton-background-dark-mode-color, var(--bbva-panel-detail-skeleton-background, "transparent"));
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

button {
  background-color: transparent;
  padding: 0;
  border: none;
  width: 100%;
  font-family: inherit;
}

.title {
  display: block;
  font-size: var(--bbva-panel-detail-title-font-size, var(--typographyTypeLarge, ${r(E.typeLarge)}));
  font-weight: var(--bbva-panel-detail-title-font-weight, var(--fontFacePrimaryMediumFontWeight, ${r(p.medium.fontWeight)}));
  line-height: var(--bbva-panel-detail-title-line-height, var(--lineHeightTypeLarge, ${r(I.typeLarge)}));
  color: var(--_panel-detail-title-color);
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(d.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-badge-default] {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(d.spacer)}))) / 16) * 1rem);
  width: 100%;
}

.status-description {
  display: block;
  color: var(--_panel-detail-status-description-color);
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(d.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-clip-card] {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(d.spacer)}))) / 16) * 1rem);
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(d.spacer)}))) / 16) * 1rem);
  display: inline-block;
}

.bank-info {
  display: flex;
  justify-content: center;
  align-items: center;
}

.amount-info {
  display: block;
  font-size: var(--bbva-panel-detail-amount-info-font-size, var(--typographyTypeSmall, ${r(E.typeSmall)}));
  line-height: var(--bbva-panel-detail-amount-info-line-height, var(--lineHeightTypeSmall, ${r(I.typeSmall)}));
  color: var(--_panel-detail-amount-info-color);
}

.total-amount {
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(d.spacer)}))) / 16) * 1rem);
}

.main-amount,
[data-tag-name=bbva-amount] {
  align-items: center;
}

[data-tag-name=bbva-amount][negative] {
  color: var(--_panel-detail-negative-amount-color);
}

[data-tag-name=bbva-progress-bar-default] {
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(d.spacer)}))) / 16) * 1rem);
  --bbva-progress-bar-default-progress-color: var(--_panel-detail-progress-bar-color);
}

.legend {
  height: 0.625rem;
  width: 0.625rem;
  transform: skew(-27deg);
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(d.spacer)}))) / 16) * 1rem);
  display: inline-block;
}
.legend.main {
  background-color: var(--_panel-detail-main-legend-bg-color);
}
.legend.secondary {
  background-color: var(--_panel-detail-secondary-legend-bg-color);
}

.extra-info {
  display: block;
  font-weight: var(--bbva-panel-detail-extra-info-font-weight, var(--fontFacePrimaryMediumFontWeight, ${r(p.medium.fontWeight)}));
  font-style: var(--bbva-panel-detail-extra-info-font-style, var(--fontFacePrimaryMediumFontStyle, ${r(p.medium.fontStyle)}));
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(d.spacer)}))) / 16) * 1rem);
  color: var(--_panel-detail-extra-info-color);
}

[data-tag-name=bbva-clip-entities] {
  border-radius: 50%;
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(d.spacer)}))) / 16) * 1rem);
}

.wrapper {
  color: var(--_panel-detail-wrapper-color);
}
.wrapper .number {
  font-weight: var(--fontFacePrimaryBookItalicTypeSmall, ${r(p.bookItalic.typeSmall)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${r(p.bookItalic.fontStyle)});
  font-size: var(--typographyTypeSmall, ${r(E.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${r(I.typeSmall)});
}

[data-tag-name=bbva-link] {
  font-size: var(--bbva-panel-detail-link-font-size, var(--typographyTypeSmall, ${r(E.typeSmall)}));
  line-height: var(--bbva-panel-detail-link-line-height, var(--lineHeightTypeSmall, ${r(I.typeSmall)}));
  font-weight: var(--bbva-panel-detail-link-font-weight, var(--fontFacePrimaryMediumFontWeight, ${r(p.medium.fontWeight)}));
  font-style: var(--bbva-panel-detail-link-font-style, var(--fontFacePrimaryMediumFontStyle, ${r(p.medium.fontStyle)}));
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(d.spacer)}))) / 16) * 1rem);
}

.text-left {
  text-align: left;
}

.text-right {
  text-align: right;
}

.amount {
  display: flex;
  align-items: center;
  justify-content: space-between;
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(d.spacer)}))) / 16) * 1rem);
}
.amount .amount-wrapper-content {
  display: flex;
  justify-content: center;
}
.amount .text-right, .amount .text-left {
  flex: 1;
}
.amount .text-left .amount-wrapper-content {
  justify-content: flex-start;
}
.amount .text-right .amount-wrapper-content {
  justify-content: flex-end;
}

.short-amount {
  flex-direction: row;
  align-items: flex-start;
}

.long-amount {
  flex-direction: column;
}
.long-amount .secondary-panel {
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(d.spacer)}))) / 16) * 1rem);
}

:host([loading]) {
  padding: 0;
  height: 100%;
  min-height: var(--panel-detail-loading-min-height, 12.5rem);
  max-height: var(--panel-detail-loading-max-height, 12.5rem);
}
:host([loading]) .skeleton {
  display: block;
  width: 100%;
  height: 100%;
  pointer-events: none;
  transition: opacity 0.4s ease-in-out;
  background-repeat: no-repeat;
  animation: pulse 2s ease-in-out infinite;
  background-image: linear-gradient(-60deg, transparent 50%, var(--_panel-detail-skeleton-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_panel-detail-skeleton-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_panel-detail-skeleton-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_panel-detail-skeleton-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_panel-detail-skeleton-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_panel-detail-skeleton-color) 50%);
  background-color: var(--_panel-detail-skeleton-background);
  background-size: calc((55% * 2) + (17px/ 2)) 17px, calc((34% * 2) + (17px/ 2)) 17px, calc((37% * 2) + (17px/ 2)) 17px, calc((27% * 2) + (17px/ 2)) 17px, calc((31% * 2) + (17px/ 2)) 17px, calc((40% * 2) + (17px/ 2)) 17px;
  background-position: -172% 26%, 18% 45%, 240% 45%, 12.5% 59%, 174% 59%, 156% 77%;
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
${me.mediaRules()}`;class ye extends(m(J(a))){static get is(){return"bbva-panel-detail"}static get scopedElements(){return{"bbva-text":C,"bbva-clip-card":Q,"bbva-clip-entities":Z,"bbva-amount":x,"bbva-link":R,"bbva-badge-default":Y,"bbva-progress-bar-default":tt,"bbva-core-heading":et,"bbva-badge-variability":$}}static get properties(){return{cardTitle:{type:String,attribute:"card-title"},cardTitleAriaLevel:{type:Number,attribute:"card-title-aria-level"},mask:{type:Number},entity:{type:String},entitySrc:{type:String,attribute:"entity-src"},badgeText:{type:String,attribute:"badge-text"},badgeTextType:{type:String,attribute:"badge-text-type"},statusDescription:{type:String,attribute:"status-description"},cardImage:{type:String,attribute:"card-image"},secondaryAmount:{type:Number,attribute:"secondary-amount"},totalAmount:{type:Number,attribute:"total-amount"},amountInfo:{type:String,attribute:"amount-info"},secondaryAmountInfo:{type:String,attribute:"secondary-amount-info"},totalAmountInfo:{type:String,attribute:"total-amount-info"},extraInfo:{type:String,attribute:"extra-info"},link:{type:String},maskChars:{type:String,attribute:"mask-chars"},visibleChars:{type:Number,attribute:"visible-chars"},showProgressBar:{type:Boolean,attribute:"show-progress-bar"},ariaLabel:{type:String,attribute:"aria-label"},contentAriaLabel:{type:String,attribute:"content-aria-label"},noLink:{type:Boolean,attribute:"no-link",reflect:!0},cardStatus:{type:String,attribute:"card-status"},variant:{type:String,reflect:!0},badgeAlignment:{type:String,attribute:"badge-alignment"},badgeVariabilityLeft:{type:String,attribute:"badge-variability-left"},badgeVariabilityRight:{type:String,attribute:"badge-variability-right"},iconLink:{type:String,attribute:"icon-link"},loading:{type:Boolean,reflect:!0}}}constructor(){super(),this.visibleChars=4,this.maskChars="•",this.cardTitleAriaLevel="2",this.variant="long-amount",this.badgeAlignment="left",this.iconLink="",this.loading=!1}update(t){super.update(t),t.has("ariaLabel")&&this._ariaLabelContent()}_ariaLabelContent(){this.ariaLabel&&(this.contentAriaLabel=this.ariaLabel,this.ariaLabel="",this.removeAttribute("aria-label"))}static get styles(){return[ve,_("bbva-panel-detail-shared-styles"),be.light,be.dark]}get _cardImage(){return f`
      <bbva-clip-card card-image="${this.cardImage}" .status="${this.cardStatus}"> </bbva-clip-card>
    `}get _badgeText(){return f`
      <bbva-badge-default
        .text="${this.badgeText}"
        text-alignment="${this.badgeAlignment}"
        type="${this.badgeTextType}"
      >
      </bbva-badge-default>
    `}get _statusDescription(){return f`
      <bbva-text
        alignment="center"
        class="status-description"
        size="S"
        tag="span"
        .text="${this.statusDescription}"
        unset
      ></bbva-text>
    `}get _amount(){return f`
      <bbva-amount
        class="main-amount"
        variant="xl"
        .amount="${this.amount}"
        .currencyCode="${this.currencyCode}"
        .localCurrency="${this.localCurrency}"
        .language="${this.language}"
      >
      </bbva-amount>
    `}get _secondaryAmount(){return f`
      <bbva-amount
        variant="xl"
        .amount="${this.secondaryAmount}"
        .currencyCode="${this.currencyCode}"
        .localCurrency="${this.localCurrency}"
        .language="${this.language}"
      >
      </bbva-amount>
    `}get _totalAmount(){return f`
      <bbva-amount
        variant="xl"
        .amount="${this.totalAmount}"
        .currencyCode="${this.currencyCode}"
        .localCurrency="${this.localCurrency}"
        .language="${this.language}"
      >
      </bbva-amount>
    `}get _amountInfo(){return f`
      <div class="amount-info">
        ${this.showProgressBar?this.constructor._renderProgressLegend("main"):""}
        ${this.amountInfo}
      </div>
    `}get _secondaryAmountInfo(){return f`
      <div class="amount-info">
        ${this.showProgressBar?this.constructor._renderProgressLegend("secondary"):""}
        ${this.secondaryAmountInfo}
      </div>
    `}get _totalAmountInfo(){return f` <div class="amount-info">${this.totalAmountInfo}</div> `}get _extraInfo(){return f`
      <bbva-text
        alignment="center"
        class="extra-info"
        .text=${this.extraInfo}
        size="S"
        unset
        tag="span"
      ></bbva-text>
    `}get _progressBar(){return f`
      <bbva-progress-bar-default
        accessibility-text="Default progress bar"
        .currentValue=${this.amount}
        .maxValue=${this.amount+this.secondaryAmount}
      >
      </bbva-progress-bar-default>
    `}get _entity(){return f` <bbva-clip-entities size="small" src="${T(this.entitySrc)}" .entity="${this.entity}"></bbva-clip-entities> `}get _link(){return f`
      <bbva-link @click=${this._onLinkClick} .icon="${this.iconLink}"
        ><span>${this.link}</span></bbva-link
      >
    `}static _renderProgressLegend(t){return f` <span class="legend ${t}"></span> `}get _cardTitle(){return f`
      <bbva-core-heading class="title" level="${this.cardTitleAriaLevel}"
        >${this.cardTitle}</bbva-core-heading
      >
    `}static _getMaskElement(t,e,a,i){if(t){const s=S(t,e,a,i);return f`
        <div class="wrapper">
          <span class="mask">${e}</span>
          <span class="number">${s.substr(e.length)}</span>
        </div>
      `}return f``}static _tmplBadgeVariability(t){return f` <bbva-badge-variability .status=${t}></bbva-badge-variability> `}get _accountDetail(){return f`
      <div class="bank-info">
        ${this.entity||this.entitySrc?this._entity:""}
        ${ye._getMaskElement(this.mask,this.maskChars,!0,this.visibleChars)}
      </div>
    `}get _tmplAmountContent(){return f`
      ${(this.amount||0===this.amount)&&f`<div class="${"short-amount"===this.variant?"text-left":""}">
          <div class="amount-wrapper-content">
            ${this.badgeVariabilityLeft&&ye._tmplBadgeVariability(this.badgeVariabilityLeft)}
            ${this._amount}
          </div>
          ${this.amountInfo?this._amountInfo:""}
        </div>`||""}
    `}get _tmplSecondaryAmountContent(){return f`
      ${(this.secondaryAmount||0===this.secondaryAmount)&&f`<div class="${"short-amount"===this.variant?"text-right":"secondary-panel"}">
          <div class="amount-wrapper-content">
            ${this.badgeVariabilityRight&&ye._tmplBadgeVariability(this.badgeVariabilityRight)}
            ${this._secondaryAmount}
          </div>
          ${this.secondaryAmountInfo?this._secondaryAmountInfo:""}
        </div>`||""}
    `}get _detailContent(){return f`
      ${this.cardTitle?this._cardTitle:""} ${this.badgeText?this._badgeText:""}
      ${this.statusDescription?this._statusDescription:""}
      ${this.cardImage?this._cardImage:""} ${this.mask?this._accountDetail:""}
      ${this.showProgressBar?this._progressBar:""}
      ${(this.secondaryAmount||0===this.secondaryAmount||this.amount||0===this.amount||this.badgeVariabilityLeft||this.badgeVariabilityRight)&&f`<div class="amount ${this.variant}">
          ${this._tmplAmountContent} ${this._tmplSecondaryAmountContent}
        </div>`||""}
      ${this.totalAmount||0===this.totalAmount?f`<div class="total-amount">${this._totalAmount}</div>`:""}
      ${this.totalAmountInfo?this._totalAmountInfo:""} ${this.extraInfo?this._extraInfo:""}
      <slot></slot>
    `}get _loadedContent(){return f`
      ${this.noLink?f` <div class="container">${this._detailContent}</div> `:f`
            <button
              class="panel"
              @click=${this._onPanelClick}
              aria-label="${T(this.contentAriaLabel)}"
            >
              ${this._detailContent}
            </button>
          `}
      ${this.link?this._link:""}
    `}render(){return this.loading?f`<div class="skeleton"></div>`:this._loadedContent}_onLinkClick(){this.dispatchEvent(new CustomEvent("panel-detail-link-click",{detail:!0,composed:!0,bubbles:!0}))}_onPanelClick(){this.dispatchEvent(new CustomEvent("panel-detail-click",{detail:{title:this.cardTitle,number:this.mask},composed:!0,bubbles:!0}))}}customElements.define(ye.is,ye);const _e=i`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-progress-vertical-step--_ambient--status-pending-color: initial;
    --bbva-progress-vertical-step--_ambient--status-pending-line-color: initial;
    --bbva-progress-vertical-step--_ambient--status-completed-color: initial;
    --bbva-progress-vertical-step--_ambient--status-completed-line-color: initial;
    --bbva-progress-vertical-step--_ambient--status-error-color: initial;
    --bbva-progress-vertical-step--_ambient--status-error-line-color: initial;
    --bbva-progress-vertical-step--_ambient--status-warning-color: initial;
    --bbva-progress-vertical-step--_ambient--status-warning-line-color: initial;
  }
`,fe=i`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-progress-vertical-step--_ambient--status-pending-color: var(
      --bbva-progress-vertical-step--custom--primary-alt-ambient--status-pending-color,
      ${ut("colorPrimaryAltProcessPending",ht)}
    );
    --bbva-progress-vertical-step--_ambient--status-pending-line-color: var(
      --bbva-progress-vertical-step--custom--primary-alt-ambient--status-pending-line-color,
      ${ut("colorPrimaryAltFormatDivider",ht)}
    );
    --bbva-progress-vertical-step--_ambient--status-completed-color: var(
      --bbva-progress-vertical-step--custom--primary-alt-ambient--status-completed-color,
      ${ut("colorPrimaryAltProcessCompleted",ht)}
    );
    --bbva-progress-vertical-step--_ambient--status-completed-line-color: var(
      --bbva-progress-vertical-step--custom--primary-alt-ambient--status-completed-line-color,
      ${ut("colorPrimaryAltProcessCompleted",ht)}
    );
    --bbva-progress-vertical-step--_ambient--status-error-color: var(
      --bbva-progress-vertical-step--custom--primary-alt-ambient--status-error-color,
      ${ut("colorPrimaryAltProcessAlert",ht)}
    );
    --bbva-progress-vertical-step--_ambient--status-error-line-color: var(
      --bbva-progress-vertical-step--custom--primary-alt-ambient--status-error-line-color,
      ${ut("colorPrimaryAltFormatDivider",ht)}
    );
    --bbva-progress-vertical-step--_ambient--status-warning-color: var(
      --bbva-progress-vertical-step--custom--primary-alt-ambient--status-warning-color,
      ${ut("colorPrimaryAltProcessWarning",ht)}
    );
    --bbva-progress-vertical-step--_ambient--status-warning-line-color: var(
      --bbva-progress-vertical-step--custom--primary-alt-ambient--status-warning-line-color,
      ${ut("colorPrimaryAltFormatDivider",ht)}
    );
  }
`,Se=i`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-progress-vertical-step--_ambient--status-pending-color: var(
      --bbva-progress-vertical-step--custom--secondary-ambient--status-pending-color,
      ${ut("colorSecondaryProcessPending",ht)}
    );
    --bbva-progress-vertical-step--_ambient--status-pending-line-color: var(
      --bbva-progress-vertical-step--custom--secondary-ambient--status-pending-line-color,
      ${ut("colorSecondaryFormatDivider",ht)}
    );
    --bbva-progress-vertical-step--_ambient--status-completed-color: var(
      --bbva-progress-vertical-step--custom--secondary-ambient--status-completed-color,
      ${ut("colorSecondaryProcessCompleted",ht)}
    );
    --bbva-progress-vertical-step--_ambient--status-completed-line-color: var(
      --bbva-progress-vertical-step--custom--secondary-ambient--status-completed-line-color,
      ${ut("colorSecondaryProcessCompleted",ht)}
    );
    --bbva-progress-vertical-step--_ambient--status-error-color: var(
      --bbva-progress-vertical-step--custom--secondary-ambient--status-error-color,
      ${ut("colorSecondaryProcessAlert",ht)}
    );
    --bbva-progress-vertical-step--_ambient--status-error-line-color: var(
      --bbva-progress-vertical-step--custom--secondary-ambient--status-error-line-color,
      ${ut("colorSecondaryFormatDivider",ht)}
    );
    --bbva-progress-vertical-step--_ambient--status-warning-color: var(
      --bbva-progress-vertical-step--custom--secondary-ambient--status-warning-color,
      ${ut("colorSecondaryProcessWarning",ht)}
    );
    --bbva-progress-vertical-step--_ambient--status-warning-line-color: var(
      --bbva-progress-vertical-step--custom--secondary-ambient--status-warning-line-color,
      ${ut("colorSecondaryFormatDivider",ht)}
    );
  }
`,ke=i`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-progress-vertical-step--_ambient--status-pending-color: var(
      --bbva-progress-vertical-step--custom--secondary-alt-ambient--status-pending-color,
      ${ut("colorSecondaryAltProcessPending",ht)}
    );
    --bbva-progress-vertical-step--_ambient--status-pending-line-color: var(
      --bbva-progress-vertical-step--custom--secondary-alt-ambient--status-pending-line-color,
      ${ut("colorSecondaryAltFormatDivider",ht)}
    );
    --bbva-progress-vertical-step--_ambient--status-completed-color: var(
      --bbva-progress-vertical-step--custom--secondary-alt-ambient--status-completed-color,
      ${ut("colorSecondaryAltProcessCompleted",ht)}
    );
    --bbva-progress-vertical-step--_ambient--status-completed-line-color: var(
      --bbva-progress-vertical-step--custom--secondary-alt-ambient--status-completed-line-color,
      ${ut("colorSecondaryAltProcessCompleted",ht)}
    );
    --bbva-progress-vertical-step--_ambient--status-error-color: var(
      --bbva-progress-vertical-step--custom--secondary-alt-ambient--status-error-color,
      ${ut("colorSecondaryAltProcessAlert",ht)}
    );
    --bbva-progress-vertical-step--_ambient--status-error-line-color: var(
      --bbva-progress-vertical-step--custom--secondary-alt-ambient--status-error-line-color,
      ${ut("colorSecondaryAltFormatDivider",ht)}
    );
    --bbva-progress-vertical-step--_ambient--status-warning-color: var(
      --bbva-progress-vertical-step--custom--secondary-alt-ambient--status-warning-color,
      ${ut("colorSecondaryAltProcessWarning",ht)}
    );
    --bbva-progress-vertical-step--_ambient--status-warning-line-color: var(
      --bbva-progress-vertical-step--custom--secondary-alt-ambient--status-warning-line-color,
      ${ut("colorSecondaryAltFormatDivider",ht)}
    );
  }
`;const Te=gt([Object.freeze({__proto__:null,primary:_e,primaryAlt:fe,secondary:Se,secondaryAlt:ke}),bt,mt,vt,yt,_t]),xe=Object.values(Te);var Re=i`
:host {
  --_progress-vertical-step-status-pending-color:
    var(--bbva-progress-vertical-step--_ambient--status-pending-color,
        var(--bbva-progress-vertical-step--custom--primary-ambient--status-pending-color,
            ${ut("colorPrimaryProcessPending",ht)}));
  --_progress-vertical-step-status-pending-line-color:
    var(--bbva-progress-vertical-step--_ambient--status-pending-line-color,
        var(--bbva-progress-vertical-step--custom--primary-ambient--status-pending-line-color,
            ${ut("colorPrimaryFormatDivider",ht)}));
  --_progress-vertical-step-status-completed-color:
    var(--bbva-progress-vertical-step--_ambient--status-completed-color,
        var(--bbva-progress-vertical-step--custom--primary-ambient--status-completed-color,
            ${ut("colorPrimaryProcessCompleted",ht)}));
  --_progress-vertical-step-status-completed-line-color:
    var(--bbva-progress-vertical-step--_ambient--status-completed-line-color,
        var(--bbva-progress-vertical-step--custom--primary-ambient--status-completed-line-color,
            ${ut("colorPrimaryProcessCompleted",ht)}));
  --_progress-vertical-step-status-error-color:
    var(--bbva-progress-vertical-step--_ambient--status-error-color,
        var(--bbva-progress-vertical-step--custom--primary-ambient--status-error-color,
            ${ut("colorPrimaryProcessAlert",ht)}));
  --_progress-vertical-step-status-error-line-color:
    var(--bbva-progress-vertical-step--_ambient--status-error-line-color,
        var(--bbva-progress-vertical-step--custom--primary-ambient--status-error-line-color,
            ${ut("colorPrimaryFormatDivider",ht)}));
  --_progress-vertical-step-status-warning-color:
    var(--bbva-progress-vertical-step--_ambient--status-warning-color,
        var(--bbva-progress-vertical-step--custom--primary-ambient--status-warning-color,
            ${ut("colorPrimaryProcessWarning",ht)}));
  --_progress-vertical-step-status-warning-line-color:
    var(--bbva-progress-vertical-step--_ambient--status-warning-line-color,
        var(--bbva-progress-vertical-step--custom--primary-ambient--status-warning-line-color,
            ${ut("colorPrimaryFormatDivider",ht)}));
}
`,$e=i`
:host {
  --_skeleton-default-bg-color: var(--bbva-skeleton-default--_ambient--bg-color, var(--bbva-skeleton-default--custom--primary-ambient--bg-color, var(--color-primary-surface-ambient-preloading,#ffffff)));
  --_skeleton-default-animated-bg-color: var(--bbva-skeleton-default--_ambient--animated-bg-color, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color, var(--color-primary-surface-ambient-default,#f4f4f4)));
  --_skeleton-default-bg-color-alt: var(--bbva-skeleton-default--_ambient--bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--bg-color-alt, var(--color-primary-surface-alternative-preloading,#e9e9e9)));
  --_skeleton-default-animated-bg-color-alt: var(--bbva-skeleton-default--_ambient--animated-bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color-alt, var(--color-primary-surface-alternative-default,#ffffff)));
}

:host {
  display: block;
  box-sizing: border-box;
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

.sr-only {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
}

.steps {
  margin: 0;
}

ol {
  padding: 0;
}

.disabled {
  opacity: 0.4;
}
.disabled [data-tag-name=bbva-type-link] {
  opacity: 1;
}

.content {
  --_progress-vertical-step-status-color: var(--_progress-vertical-step-status-pending-color);
  --_progress-vertical-step-status-line-color: var(--_progress-vertical-step-status-pending-line-color);
  position: relative;
  display: flex;
  width: 100%;
}
.content:before {
  position: absolute;
  top: 1.5rem;
  left: 0.4375rem;
  width: 0.0625rem;
  height: calc(100% - 24px);
  background: var(--_progress-vertical-step-status-line-color);
  content: "";
}
.content:last-of-type::before {
  display: none;
}
.content:last-of-type .main-content {
  margin-bottom: 0;
}

.completed {
  --_progress-vertical-step-status-color: var(--_progress-vertical-step-status-completed-color);
  --_progress-vertical-step-status-line-color: var(--_progress-vertical-step-status-completed-line-color);
}

.error {
  --_progress-vertical-step-status-color: var(--_progress-vertical-step-status-error-color);
  --_progress-vertical-step-status-line-color: var(--_progress-vertical-step-status-error-line-color);
}

.warning {
  --_progress-vertical-step-status-color: var(--_progress-vertical-step-status-warning-color);
  --_progress-vertical-step-status-line-color: var(--_progress-vertical-step-status-warning-line-color);
}

.circle {
  position: relative;
  width: 1rem;
  height: 1rem;
  border-radius: 50%;
  margin-top: 0.25rem;
  background-color: var(--_progress-vertical-step-status-color);
}

.main-content {
  min-width: 0;
  flex: 1;
  margin-bottom: 1.5rem;
  margin-left: 1rem;
}

.step-heading {
  display: flex;
  align-items: flex-start;
  justify-content: space-between;
}

.title {
  font-style: var(--fontFacePrimaryMediumFontStyle, ${r(p.medium.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${r(p.medium.fontWeight)});
}

[data-tag-name=bbva-type-text] {
  min-width: 0;
}

[data-tag-name=bbva-badge-default] {
  margin-top: 1rem;
}

.text {
  margin-top: 0.5rem;
}

.notification {
  margin-top: 0.5rem;
}

[data-tag-name=bbva-type-link] {
  margin-top: 1rem;
}

.content.substep .circle {
  width: 0.5rem;
  height: 0.5rem;
  margin: 0.25rem;
}
.content.substep:before {
  position: absolute;
  top: 1rem;
  height: calc(100% - 16px);
}
.content.substep .main-content {
  position: relative;
  top: -0.25rem;
}

:host([loading]) {
  overflow: hidden;
  height: 4.375rem;
  background-color: var(--_skeleton-default-bg-color);
  mask-image: radial-gradient( 16px 100%, black 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%);
  mask-position: 16px 0px, 48px 0px, 48px 24px, 48px 48px;
  mask-repeat: no-repeat;
  mask-size: 16px 16px, calc((55% * 2) + (16px/ 2)) 16px, calc((40% * 2) + (16px/ 2)) 16px, calc((15% * 2) + (16px/ 2)) 16px;
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
`;class Ce extends(ft(v(St(a)))){static get is(){return"bbva-progress-vertical-step"}static get scopedElements(){return{"bbva-type-text":kt,"bbva-type-date":Tt,"bbva-type-link":xt,"bbva-badge-default":Rt,"bbva-notification-help":$t}}static get properties(){return{steps:{type:Array},statusText:{type:Object,attribute:"status-text"},titleEllipsis:{type:Boolean,attribute:"title-ellipsis"},descriptionEllipsis:{type:Boolean,attribute:"description-ellipsis"},language:{type:String},loading:{type:Boolean,reflect:!0},titleTag:{type:String,reflect:!0},descriptionSize:{type:String,reflect:!0},titleSize:{type:String,reflect:!0}}}static get styles(){return[super.styles,$e,xe,Re,_("bbva-progress-vertical-step-shared-styles")]}constructor(){super(),this.steps=[],this.statusText={completed:"bbva-progress-vertical-step-completed",pending:"bbva-progress-vertical-step-pending",error:"bbva-progress-vertical-step-error",warning:"bbva-progress-vertical-step-warning"},this.language="es-ES",this.loading=!1,this.titleTag="h3",this.descriptionSize="S",this.titleSize="L",this.titleEllipsis=!1,this.descriptionEllipsis=!1,this._timeOptions={hour:"2-digit",minute:"2-digit"}}_linkClicked(t){this.dispatchEvent(new CustomEvent("progress-vertical-step-link-click",{bubbles:!0,composed:!0,detail:t}))}_subtitleTemplate(t){return f` ${Array.isArray(t)?f` <div class="text">
          ${t.map((t=>f` <bbva-type-text
              size="${this.descriptionSize}"
              ?ellipsis="${this.descriptionEllipsis}"
              text="${t}"
              tag="p"
              unset
            ></bbva-type-text>`))}
        </div>`:f`
          <bbva-type-text
            class="text"
            size="${this.descriptionSize}"
            ?ellipsis="${this.descriptionEllipsis}"
            text="${t}"
            tag="p"
            unset
          ></bbva-type-text>
        `}`}_stepContent(t){return f`
      <div class="step-heading">
        <bbva-type-text
          text="${t.title}"
          size="${this.titleSize}"
          ?ellipsis="${this.titleEllipsis}"
          class="title"
          tag="${this.titleTag}"
          unset
        ></bbva-type-text>
      </div>
      ${t.date?this._dateTpl(t):j}
      ${t.subtitle?f` <bbva-badge-default
            text="${t.subtitle}"
            type="${t.badgeStatus}"
          ></bbva-badge-default>`:j}
      ${t.content?this._subtitleTemplate(t.content):j}
      ${t.notificationText?f`
            <bbva-notification-help
              variant="${T(t.notificationVariant)}"
              class="notification"
              text="${T(t.notificationText)}"
            ></bbva-notification-help>
          `:j}
      ${t.linkText?f`
            <bbva-type-link
              @click="${()=>this._linkClicked(t)}"
              href="${T(t.link)}"
              target="${T(t.target)}"
              ?disabled=${t.disabled}
              ><span>${t.linkText}</span>
            </bbva-type-link>
          `:j}
    `}_dateTpl(t){return f`
      <bbva-type-date
        font-weight="${t.datefontweight}"
        date="${t.date}"
        font-style="italic"
        locale="${this.language}"
      ></bbva-type-date>
      ${t.time?f` <bbva-type-date
            date="${t.date}"
            font-weight="${t.datefontweight}"
            .options=${this._timeOptions}
            clock-suffix=""
            font-style="italic"
            locale="${this.language}"
          ></bbva-type-date>`:j}
    `}_substepContent(t){return f`
      <div class="substep-heading">
        ${t.title?f`
              <bbva-type-text
                text="${t.title}"
                size="S"
                ?ellipsis="${!this.titleEllipsis}"
                class="title"
                tag="${this.titleTag}"
                unset
              ></bbva-type-text>
            `:""}
      </div>
      ${this._dateTpl(t)}
      ${t.content?this._subtitleTemplate(t.content):j}
    `}_stepTpl(t){return f` <li
      class="content ${t.disabled?"pending":t.status} ${t.disabled&&"pending"!==t.status?"disabled":""} "
    >
      <span class="sr-only">${this.t(this.statusText[t.status])}</span>
      <span class="circle" aria-hidden="true"></span>
      <div class="main-content">${this._stepContent(t)}</div>
    </li>`}_substepTpl(t){return f`<li
      class="content ${t.disabled?"pending":t.status} substep ${t.disabled?"disabled":""}"
    >
      <span class="sr-only">${this.t(this.statusText[t.status])}</span>
      <span class="circle" aria-hidden="true"></span>
      <div class="main-content">${this._substepContent(t)}</div>
    </li>`}render(){return f`${this.loading?f``:f`
          <div
            role="group"
            aria-label="${this.t("bbva-progress-vertical-label-accessibility-text")}"
          >
            <ol class="steps">
              ${this.steps.map((t=>f`
                    ${this._stepTpl(t)}
                    ${t.middle?t.substep.map((t=>this._substepTpl(t))):j}
                  `))}
            </ol>
          </div>
        `}`}}var Ae=i`
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

[data-tag-name=bbva-notification-message] {
  margin: 1rem;
}

[data-tag-name=bbva-progress-vertical-step] {
  margin: 1rem;
  padding: 1rem;
}

[data-tag-name=bbva-panel-detail] {
  margin: 1rem;
}
`;class Ee extends(pt(V(v(a)))){static get is(){return"mortgage-tracking-main"}static get scopedElements(){const t=[dt,U,le,ye,Ce,...Ee.configurationScopedElements()];return Ee.scopedElementsFromClasses(t)}static get properties(){return{textCertificateFolio:{type:String,attribute:"text-certificate-folio"},stepsTracking:{type:Array},textStatusPanelDetail:{type:String,attribute:"text-status-panel"},textNotificationMessage:{type:String,attribute:"text-notification"},statusNotificationMessage:{type:String,attribute:"status-notification"}}}static get styles(){return[Ae,_("mortgage-tracking-main-shared-styles")]}constructor(){super(),this.textCertificateFolio="",this.stepsTracking=[],this.textStatusPanelDetail="",this.textNotificationMessage="",this.statusNotificationMessage=""}_onTrackingClose(){this._dispatchCustomEvent("close-tracking")}_mainHeader(){return f`
      <bbva-header-main
        variant="modal"
        id="main-header"
        accessibility-text-icon-right-primary="Return"
        icon-right-primary="${H()}"
        text="${this.t("bbva-feature-mortgage-tracking-main-review-header")}"
        @header-main-icon-right-primary-click="${this._onTrackingClose}"
      >  
      </bbva-header-main>
    `}_mainPanelDetail(){return f`
      <bbva-panel-detail
        id="main-panel-detail"
        card-title="${this.t("bbva-feature-mortgage-tracking-main-review-panel-detail-title")}"
        badge-text="${this.textStatusPanelDetail}"
        badge-text-type="pending"
        badge-alignment="center"
        status-description="${this.t("bbva-feature-mortgage-tracking-main-review-panel-detail-certificate-id")}"
        extra-info="${this.textCertificateFolio}"
        link="${this.t("bbva-feature-mortgage-tracking-main-review-panel-detail-link")}"
        >  
      </bbva-panel-detail>
    `}_mainNotitificationMessage(){return f`
      <bbva-notification-message
        id="main-notification"
        message="${this.textNotificationMessage}"
        variant="${this.statusNotificationMessage}"
      >
      </bbva-notification-message>
    `}_mainProgressVerticalStep(){return f`
      <bbva-progress-vertical-step
        id="main-vertical-step"
        .steps="${this.stepsTracking}"
      >
      </bbva-progress-vertical-step>
    `}get mainTrackingTemplate(){return f`
      ${super.render()}
      <div slot="slot-content" class="tracking">
        ${this._mainHeader()}
        ${this._mainPanelDetail()} 
        ${this._mainNotitificationMessage()} 
        ${this._mainProgressVerticalStep()} 
      </div>
    `}render(){return f`${this.mainTrackingTemplate}`}}ot("colors.primaryCoreLightened"),ot("colors.primaryCoreLightened"),ot("colors.primaryCoreLightened"),ot("colors.primaryCoreLightened"),ot("colors.cool60"),ot("colors.primaryCoreLightened"),ot("colors.primarySubdued"),ot("colors.primaryMediumLight"),ot("colors.primarySubdued"),ot("colors.primaryMediumLight"),ot("colors.cool50");var Ie=i`
[data-tag-name=bbva-list-bullet] {
  text-align: left;
}

[data-tag-name=bbva-text] {
  text-align: center;
}

.title, .list-title {
  font-weight: 500;
}

.list-title {
  text-align: left;
  text-transform: uppercase;
}

.notification-margin {
  margin-top: 1rem;
}
`;class De extends(pt(V(v(a)))){static get is(){return"mortgage-tracking-modal"}static get scopedElements(){const t=[Ct,U,le,nt,re,C,...De.configurationScopedElements()];return De.scopedElementsFromClasses(t)}static get properties(){return{appraisalDate:{type:String,attribute:"appraisal-date"},appraisalAmount:{type:String,attribute:"appraisal-amount"},notaryName:{type:String,attribute:"notary-name"},notaryOffice:{type:String,attribute:"notary-office"},notaryMail:{type:String,attribute:"notary-mail"},notaryAddress:{type:String,attribute:"notary-address"},signatureDate:{type:String,attribute:"signature-date"},signatureExecutive:{type:String,attribute:"signature-executive"},signatureOffice:{type:String,attribute:"signature-office"},signatureAddress:{type:String,attribute:"signature-address"},config:{attribute:"config",type:Object},srcImage:{type:String,attribute:"src-image"},listBulletItems:{type:Array,attribute:"list-bullet-items"},listSimpleItems:{type:Array,attribute:"list-simple-items"},notificationMessage:{type:String,attribute:"notification-message"},urlPage:{type:String,attribute:"url-page"},callNumber:{type:String,attribute:"call-number"}}}constructor(){super(),this.appraisalDate="",this.appraisalAmount="",this.notaryName="",this.notaryOffice="",this.notaryMail="",this.notaryAddress="",this.signatureDate="",this.signatureExecutive="",this.signatureOffice="",this.signatureAddress="",this.config={},this.listBulletItems={},this.listSimpleItems={},this.notificationMessage="",this.srcImage="",this.urlPage="",this.callNumber=""}static get styles(){return[Ie,_("mortgage-tracking-modals-shared-styles")]}get modalConfig(){return this.shadowRoot.querySelector('[data-tag-name="bbva-help-modal"]')}openTrackingModal(t){var e;this.config=t,this.modalConfig.open(),this._dispatchCustomEvent("analytics-fire-fingerprint-mortgages-tracking-modal",null===(e=this.config)||void 0===e?void 0:e.id)}modalOptions(t){const e={MWII_TRKHP_SUBIR_DOCUMENTACION_PREAPROBADO:"openDocumentationModal",MWII_TRKHP_SUBIR_DOCUMENTACION_RECHAZADA:"openDocumentationModalError",MWII_TRKHP_VALIDAR_DOCUMENTACION_PREAPROBADO:"openDocumentationModal",MWII_TRKHP_SOLICITAR_DATOS_BASICOS_AVALUO:"openUploadAppraisalDocumentsModal",MWII_TRKHP_SUBIR_DOCUMENTACION_AVALUO:"openUploadAppraisalDocumentsModal",MWII_TRKHP_VALIDAR_DOCUMENTACION_AVALUO:"openUploadAppraisalDocumentsModal",MWII_TRKHP_SUBIR_DOCUMENTACION_AVALUO_RECHAZADA:"openDocumentationModalError",MWII_TRKHP_REGISTRAR_FECHA_AVALUO:"openDefinitionAppraisalDateModal",MWII_TRKHP_VISUALIZAR_FECHA_AVALUO:"openConsultAppraisalDateModal",MWII_TRKHP_REGISTRAR_RESULTADO_AVALUO:"openAppraisalDateCaptureModal",MWII_TRKHP_VISUALIZAR_RESULTADO_AVALUO:"openAmountAppraisalModal",MWII_TRKHP_ASIGNAR_NOTARIO:"openNotaryElectionModal",MWII_TRKHP_VISUALIZAR_NOTARIO_ASIGNADO:"openNotaryInformationModal",MWII_TRKHP_CAPTURAR_FECHAS_NOTARIO:"openDateSelectionNotarialModal",MWII_TRKHP_CONFIRMAR_CITA_NOTARIO:"openNotarialSignatureModal",MWII_TRKHP_FINALIZAR_PROCESO:"openNotarialSignatureModal",EXPIRED:"openExpirateDateModal",ERROR:"openErrorModal"};t in e?this[e[t]]():this[e.ERROR]()}openDocumentationModal(){this.openTrackingModal({id:"documentation-step",headerText:this.t("bbva-feature-mortgage-tracking-modal-documentation-header"),title:this.t("bbva-feature-mortgage-tracking-modal-documentation-title"),srcImage:"officialdocument",bodyText:this.t("bbva-feature-mortgage-tracking-modal-documentation-text"),listBulletItems:[],notificationMessage:this.t("bbva-feature-mortgage-tracking-modal-documentation-notification"),buttonText:this.t("bbva-feature-mortgage-tracking-modal-button-exit"),linkText:this.t("bbva-feature-mortgage-tracking-modal-button-site")})}openDocumentationModalError(){this.openTrackingModal({id:"documentation-error",headerText:this.t("bbva-feature-mortgage-tracking-modal-documentation-header"),title:this.t("bbva-feature-mortgage-tracking-modal-documentation-rejected-title"),srcImage:"officialdocument",bodyText:this.t("bbva-feature-mortgage-tracking-modal-documentation-rejected-text"),notificationMessage:this.t("bbva-feature-mortgage-tracking-modal-documentation-rejected-message"),buttonText:this.t("bbva-feature-mortgage-tracking-modal-button-exit"),linkText:this.t("bbva-feature-mortgage-tracking-modal-button-site")})}openUploadAppraisalDocumentsModal(){this.openTrackingModal({id:"upload-appraisal-documents",headerText:this.t("bbva-feature-mortgage-tracking-main-review-progress-appraisal-subtitle-1"),title:this.t("bbva-feature-mortgage-tracking-modal-documentation-property-title"),srcImage:"officialdocument",listBulletItems:[this.t("bbva-feature-mortgage-tracking-modal-documentation-property-bullet-1"),this.t("bbva-feature-mortgage-tracking-modal-documentation-property-bullet-2"),this.t("bbva-feature-mortgage-tracking-modal-documentation-property-bullet-3"),this.t("bbva-feature-mortgage-tracking-modal-documentation-property-bullet-4"),this.t("bbva-feature-mortgage-tracking-modal-documentation-property-bullet-5")],notificationMessage:this.t("bbva-feature-mortgage-tracking-modal-documentation-notification"),buttonText:this.t("bbva-feature-mortgage-tracking-modal-button-exit"),linkText:this.t("bbva-feature-mortgage-tracking-modal-button-site")})}openDefinitionAppraisalDateModal(){this.openTrackingModal({id:"definition-appraisal-date",headerText:this.t("bbva-feature-mortgage-tracking-modal-appraisal-date-ready-header"),title:this.t("bbva-feature-mortgage-tracking-modal-appraisal-date-title"),srcImage:"calendar",bodyText:this.t("bbva-feature-mortgage-tracking-modal-appraisal-date-text"),notificationMessage:this.t("bbva-feature-mortgage-tracking-modal-appraisal-date-notification"),buttonText:this.t("bbva-feature-mortgage-tracking-modal-button-understood")})}openConsultAppraisalDateModal(){this.openTrackingModal({id:"consult-appraisal-date",headerText:this.t("bbva-feature-mortgage-tracking-modal-appraisal-date-header"),title:this.t("bbva-feature-mortgage-tracking-modal-appraisal-date-ready-title"),srcImage:"calendar",bodyText:this.t("bbva-feature-mortgage-tracking-modal-appraisal-date-ready-text"),listSimpleItems:[{label:this.t("bbva-feature-mortgage-tracking-modal-appraisal-date-header"),description:this.appraisalDate}],titleList:this.t("bbva-feature-mortgage-tracking-modal-appraisal-date-ready-title-category"),listBulletItems:[this.t("bbva-feature-mortgage-tracking-modal-appraisal-date-ready-bullet-1"),this.t("bbva-feature-mortgage-tracking-modal-appraisal-date-ready-bullet-2"),this.t("bbva-feature-mortgage-tracking-modal-appraisal-date-ready-bullet-3"),this.t("bbva-feature-mortgage-tracking-modal-appraisal-date-ready-bullet-4")],notificationMessage:this.t("bbva-feature-mortgage-tracking-modal-appraisal-date-ready-notification"),buttonText:this.t("bbva-feature-mortgage-tracking-modal-button-exit"),linkText:this.t("bbva-feature-mortgage-tracking-modal-button-site")})}openAppraisalDateCaptureModal(){this.openTrackingModal({id:"appraisal-date-capture",headerText:this.t("bbva-feature-mortgage-tracking-modal-appraisal-result-header"),title:this.t("bbva-feature-mortgage-tracking-modal-appraisal-result-title"),srcImage:"homedollar",bodyText:this.t("bbva-feature-mortgage-tracking-modal-appraisal-result-text"),listSimpleItems:[{label:this.t("bbva-feature-mortgage-tracking-modal-appraisal-date-header"),description:this.appraisalDate}],buttonText:this.t("bbva-feature-mortgage-tracking-modal-button-understood")})}openAmountAppraisalModal(){this.openTrackingModal({id:"appraisal-amount-result",headerText:this.t("bbva-feature-mortgage-tracking-modal-appraisal-result-header"),title:this.t("bbva-feature-mortgage-tracking-modal-appraisal-result-header"),srcImage:"home",bodyText:this.appraisalAmount,notificationMessage:this.t("bbva-feature-mortgage-tracking-modal-notary-meet-notification"),buttonText:this.t("bbva-feature-mortgage-tracking-modal-button-exit"),linkText:this.t("bbva-feature-mortgage-tracking-modal-button-site")})}openNotaryElectionModal(){this.openTrackingModal({id:"notary-election",headerText:this.t("bbva-feature-mortgage-tracking-modal-notary-election-title"),title:this.t("bbva-feature-mortgage-tracking-modal-notary-election-title"),srcImage:"bbvamanagerman",bodyText:this.t("bbva-feature-mortgage-tracking-modal-notary-election-text"),listSimpleItems:[{label:this.t("bbva-feature-mortgage-tracking-modal-appraisal-date-header"),description:this.appraisalDate}],buttonText:this.t("bbva-feature-mortgage-tracking-modal-button-understood")})}openNotaryInformationModal(){this.openTrackingModal({id:"notary-information",headerText:this.t("bbva-feature-mortgage-tracking-modal-notary-meet-header"),title:this.t("bbva-feature-mortgage-tracking-modal-notary-meet-title"),srcImage:"bbvamanagerman",bodyText:this.t("bbva-feature-mortgage-tracking-modal-notary-meet-data"),listSimpleItems:[{label:this.t("bbva-feature-mortgage-tracking-modal-notary-meet-title-name"),description:this.notaryName},{label:this.t("bbva-feature-mortgage-tracking-modal-notary-meet-title-notary"),description:this.notaryId},{label:this.t("bbva-feature-mortgage-tracking-modal-notary-meet-title-phone"),description:this.notaryNumber},{label:this.t("bbva-feature-mortgage-tracking-modal-notary-meet-title-email"),description:this.notaryMail},{label:this.t("bbva-feature-mortgage-tracking-modal-notary-meet-title-address"),description:this.notaryAddress}],notificationMessage:this.t("bbva-feature-mortgage-tracking-modal-notary-meet-notification"),buttonText:this.t("bbva-feature-mortgage-tracking-modal-button-exit"),linkText:this.t("bbva-feature-mortgage-tracking-modal-button-site")})}openDateSelectionNotarialModal(){this.openTrackingModal({id:"date-selection-notarial",headerText:this.t("bbva-feature-mortgage-tracking-modal-notary-date-selection-header"),title:this.t("bbva-feature-mortgage-tracking-modal-notary-date-selection-title"),srcImage:"calendar",bodyText:this.t("bbva-feature-mortgage-tracking-modal-notary-date-selection-text"),notificationMessage:this.t("bbva-feature-mortgage-tracking-modal-notary-date-selection-notification"),buttonText:this.t("bbva-feature-mortgage-tracking-modal-button-exit"),linkText:this.t("bbva-feature-mortgage-tracking-modal-button-site")})}openNotarialSignatureModal(){this.openTrackingModal({id:"notarial-signature",headerText:this.t("bbva-feature-mortgage-tracking-modal-notary-meet-date"),title:this.t("bbva-feature-mortgage-tracking-modal-notary-date-selection-title-2"),srcImage:"calendar",listSimpleItems:[{label:this.t("bbva-feature-mortgage-tracking-modal-notary-date-selection-title-date"),description:this.signatureDate},{label:this.t("bbva-feature-mortgage-tracking-modal-notary-date-selection-title-schedule"),description:this.t("bbva-feature-mortgage-tracking-modal-notary-date-selection-title-schedule-text")},{label:this.t("bbva-feature-mortgage-tracking-modal-notary-date-selection-title-name"),description:this.notaryName},{label:this.t("bbva-feature-mortgage-tracking-modal-notary-date-selection-title-number"),description:this.notaryId},{label:this.t("bbva-feature-mortgage-tracking-modal-notary-date-selection-title-address"),description:this.notaryAddress}],notificationMessage:this.t("bbva-feature-mortgage-tracking-modal-notary-date-selection-notification-signature"),buttonText:this.t("bbva-feature-mortgage-tracking-modal-button-understood")})}openMortgageCenterModal(){this.openTrackingModal({id:"error-modal",headerText:this.t("bbva-feature-mortgage-tracking-modal-center-header"),title:this.t("bbva-feature-mortgage-tracking-modal-center-title"),srcImage:"mortgage",bodyText:this.t("bbva-feature-mortgage-tracking-modal-center-text"),listBulletItems:[this.t("bbva-feature-mortgage-tracking-modal-center-bullet-1",{phone:this.callNumber}),this.t("bbva-feature-mortgage-tracking-modal-center-bullet-2")],footerText:this.t("bbva-feature-mortgage-tracking-modal-center-footer"),buttonText:this.t("bbva-feature-mortgage-tracking-modal-button-understood")})}openErrorModal(){this.openTrackingModal({id:"error-modal",headerText:this.t("bbva-feature-mortgage-tracking-modal-error-header"),srcImage:"error",title:this.t("bbva-feature-mortgage-tracking-modal-error-title"),bodyText:this.t("bbva-feature-mortgage-tracking-modal-error-text"),buttonText:this.t("bbva-feature-mortgage-tracking-modal-error-button-exit")})}onCloseModalError(){var t;"error-modal"===(null===(t=this.config)||void 0===t?void 0:t.id)&&this._dispatchCustomEvent("close-tracking-modal-error")}onClickLink(){var t;null!==(t=this.config)&&void 0!==t&&t.linkText&&this._dispatchCustomEvent("navigation-to-tracking-page",{scheme:this.urlPage})}openExpirateDateModal(){this.openTrackingModal({id:"expirate-date-error",headerText:this.t("bbva-feature-mortgage-tracking-modal-expirate-date-error-header"),title:this.t("bbva-feature-mortgage-tracking-modal-expirate-date-error-title"),srcImage:"error",bodyText:this.t("bbva-feature-mortgage-tracking-modal-expirate-date-error-text"),buttonText:this.t("bbva-feature-mortgage-tracking-modal-button-exit"),linkText:this.t("bbva-feature-mortgage-tracking-modal-button-site")})}get modalTemplate(){var t,e,a,i,s,r,o,n,l,c,p,d,u,h,g,b,m,v,y;return f`
    <bbva-help-modal
      class="mortgage-tracking-modal"
      id=${(null===(t=this.config)||void 0===t?void 0:t.id)||""}
      text-lines="2"
      variant=${(null===(e=this.config)||void 0===e?void 0:e.variant)||""}
      modal-type=${(null===(a=this.config)||void 0===a?void 0:a.modalType)||""}
      header-text=${(null===(i=this.config)||void 0===i?void 0:i.headerText)||""}
      title-icon=${(null===(s=this.config)||void 0===s?void 0:s.titleIcon)||""}
      button-text=${(null===(r=this.config)||void 0===r?void 0:r.buttonText)||""}
      link-text=${(null===(o=this.config)||void 0===o?void 0:o.linkText)||""}
      fixed-footer
      full-height
      hide-content-padding-top
      @help-modal-footer-link-click=${this.onClickLink}
      @help-modal-header-right-primary-click=${this.onCloseModalError}
      @help-modal-footer-button-click=${this.onCloseModalError}
      >
      <div class="title" slot="slot-title">
        <bbva-clip-microillustration
          microillustration=${null===(n=this.config)||void 0===n?void 0:n.srcImage}
          ?hidden=${!(null!==(l=this.config)&&void 0!==l&&l.srcImage)}
          size="M"
        ></bbva-clip-microillustration>
      </div>
      <div class="content" slot="slot-content" >
        <bbva-text class="title" size="M" text=${null===(c=this.config)||void 0===c?void 0:c.title}></bbva-text>
        <bbva-text size="S" text=${null===(p=this.config)||void 0===p?void 0:p.bodyText}></bbva-text>
        ${this.config&&null!==(d=this.config)&&void 0!==d&&d.listSimpleItems?f`
            <div class="list-simple-container">
              ${null===(u=this.config)||void 0===u?void 0:u.listSimpleItems.map((t=>f`
                <bbva-list-simple
                  variant="stacked-center"
                  label=${t.label}
                  description=${t.description||""}
                ></bbva-list-simple>
              `))}
            </div>
          `:""}

        ${null!==(h=this.config)&&void 0!==h&&h.titleList?f`
            <bbva-text
              class="list-title"
              size="S"
              text=${this.config.titleList}
            ></bbva-text>
          `:""}

        ${this.config&&null!==(g=this.config)&&void 0!==g&&g.listBulletItems?f`
            <div class="list-bullet-container">
              ${null===(b=this.config)||void 0===b?void 0:b.listBulletItems.map((t=>f`
                <bbva-list-bullet>${t}</bbva-list-bullet>
              `))}
            </div>
          `:""}

        ${null!==(m=this.config)&&void 0!==m&&m.footerText?f`
            <bbva-text size="S" text=${this.config.footerText}></bbva-text>
          `:""}

        <bbva-notification-message class="notification-margin"
          message=${null===(v=this.config)||void 0===v?void 0:v.notificationMessage}
          ?hidden=${!(null!==(y=this.config)&&void 0!==y&&y.notificationMessage)}
        ></bbva-notification-message>
      </div>
    </bbva-help-modal>
    `}render(){return f`${this.modalTemplate}`}}class we extends(pt(V(v(a)))){static get is(){return"bbva-feature-mortgage-tracking"}static get scopedElements(){const t=[Ht,Qt,Ee,De,ue,de,lt,...we.configurationScopedElements()];return we.scopedElementsFromClasses(t)}static get styles(){return[Zt,_("bbva-feature-mortgage-tracking-shared-styles")]}static get properties(){return{mortgagesDmLocal:{type:String,attribute:"mortgages-dm-local"},appSettingsParams:{type:Object,attribute:"app-setting-params"},callNumber:{type:String,attribute:"call-number"},mortgageLoanCurrency:{type:String,attribute:"mortgage-loan-currency"},trackingTaskResponse:{type:Object,attribute:"response-tracking-task"},quotationId:{type:String,attribute:"quotation-id"},quotationDetail:{type:Object,attribute:"quotation-detail"},listQuotations:{type:Object,attribute:"list-quotations"},taskType:{type:String,attribute:"task-type"},product:{type:String},subProduct:{type:String,attribute:"sub-product"},certificateFolio:{type:String,attribute:"certificate-folio"},requestDate:{type:String,attribute:"request-date"},expirationDate:{type:String,attribute:"expiration-date"},requestAmount:{type:String,attribute:"request-amount"},termCredit:{type:String},monthlyPayment:{type:String,attribute:"monthly-payment"},interestRate:{type:String,attribute:"interest-rate"},cat:{type:String},calculationDate:{type:String,attribute:"calculation-date"},trackingSteps:{type:Array,attribute:"tracking-steps"},bodyTrackingTask:{type:Object,attribute:"body-tracking-task"},staticOffers:{type:Array,attribute:"static-offers"},statusProcess:{type:String,attribute:"status-process"},linkTextStepModal:{type:String,attribute:"link-text-step-modal"},alertErrorText:{type:String,attribute:"alert-error-text"},alertErrorTextRejected:{type:String,attribute:"alert-error-text-rejected"},statusSubTextDone:{type:String,attribute:"status-sub-text-done"},statusSubTextInprogress:{type:String,attribute:"status-sub-text-inprogress"},statusSubTextPending:{type:String,attribute:"status-sub-text-pending"},statusSubTextError:{type:String,attribute:"status-sub-text-error"},textStatusPanelDecline:{type:String,attribute:"text-status-panel-decline"},linkTextCommon:{type:String,attribute:"link-text-common"},iconError:{type:String,attribute:"icon-error"},statusStepDone:{type:String,attribute:"status-step-done"},statusStepError:{type:String,attribute:"status-step-error"},propNull:{type:String,attribute:"prop-null"},documentationTitle:{type:String,attribute:"title-documentation"},documentationBadgeStatus:{type:String,attribute:"badge-status-documentation"},documentationSubtitle:{type:String,attribute:"subtitle-documentation"},documentDescription:{type:String,attribute:"description-document"},documentationLinkText:{type:String,attribute:"link-text-documentation"},documentationStatus:{type:String,attribute:"status-documentation"},textExpirationDate:{type:String,attribute:"text-expiration-date"},documentationNotification:{type:String,attribute:"notification-documentation"},appraisalTitle:{type:String,attribute:"title-appraisal"},appraisalBadgeStatus:{type:String,attribute:"badge-status-appraisal"},appraisalSubtitle:{type:String,attribute:"subtitle-appraisal"},appraisalStatus:{type:String,attribute:"status-appraisal"},appraisalSubstepTitle1:{type:String,attribute:"title-appraisal-substep-1"},apprasialTextAlert:{type:String,attribute:"text-alert-appraisal"},apprasialNotification:{type:String,attribute:"notification-appraisal"},appraisalSubstepContent1:{type:String,attribute:"content-appraisal-substep-1"},appraisalSubstepStatus1:{type:String,attribute:"status-appraisal-substep-1"},appraisalSubstepTitle2:{type:String,attribute:"title-appraisal-substep-2"},appraisalSubstepContent2:{type:String,attribute:"content-appraisal-substep-2"},appraisalSubstepStatus2:{type:String,attribute:"status-appraisal-substep-2"},appraisalSubstepTitle3:{type:String,attribute:"title-appraisal-substep-3"},appraisalSubstepContent3:{type:String,attribute:"content-appraisal-substep-3"},appraisalSubstepStatus3:{type:String,attribute:"status-appraisal-substep-3"},notarialTitle:{type:String,attribute:"title-notarial"},notarialBadgeStatus:{type:String,attribute:"badge-status-notarial"},notarialSubtitle:{type:String,attribute:"subtitle-notarial"},notarialStatus:{type:String,attribute:"status-notarial"},notarialSubstepTitle1:{type:String,attribute:"title-notarial-substep-1"},notarialSubstepContent1:{type:String,attribute:"content-notarial-substep-1"},notarialSubstepStatus1:{type:String,attribute:"status-notarial-substep-1"},notarialSubstepTitle2:{type:String,attribute:"title-notarial-substep-2"},notarialSubstepContent2:{type:String,attribute:"content-notarial-substep-2"},notarialSubstepStatus2:{type:String,attribute:"status-notarial-substep-2"},appraisalDate:{type:String,attribute:"appraisal-date"},appraisalAmount:{type:String,attribute:"appraisal-amount"},notaryName:{type:String,attribute:"notary-name"},notaryOffice:{type:String,attribute:"notary-office"},notaryMail:{type:String,attribute:"notary-mail"},notaryAddress:{type:String,attribute:"notary-address"},signatureDate:{type:String,attribute:"signature-date"},signatureExecutive:{type:String,attribute:"signature-executive"},signatureOffice:{type:String,attribute:"signature-office"},signatureAddress:{type:String,attribute:"signature-address"},urlPage:{type:String,attribute:"url-page"},_isDetailPageVisible:{type:Boolean,state:!0}}}constructor(){super(),this.mortgagesDmLocal=null,this.mortgageLoanCurrency="",this.trackingTaskResponse={},this.quotationId="",this.quotationDetail={},this._isDetailPageVisible=!1,this.listQuotations={},this.taskType=null,this.product="",this.subproduct="",this.certificateFolio="",this.requestDate="",this.expirationDate="",this.requestAmount="",this.termCredit="",this.monthlyPayment="",this.interestRate="",this.cat="",this.calculationDate="",this.trackingSteps=[],this.staticOffers=[],this.statusProcess=null,this.bodyTrackingTask={process:{channel:"AP",processName:"TRKHP",flow:"TRKHP"}},this.textNotification="",this.statusNotification="",this.linkTextStepModal=this.t("bbva-feature-mortgage-tracking-main-review-progress-link-modal-text"),this.alertErrorText=this.t("bbva-feature-mortgage-tracking-main-review-progress-common-alert-error-text"),this.alertErrorTextRejected=this.t("bbva-feature-mortgage-tracking-main-review-progress-common-alert-error-text-rejected"),this.statusSubTextDone=this.t("bbva-feature-mortgage-tracking-main-review-progress-common-done-subtitle-status"),this.statusSubTextInprogress=this.t("bbva-feature-mortgage-tracking-main-review-progress-common-inprogress-subtitle-status"),this.statusSubTextPending=this.t("bbva-feature-mortgage-tracking-main-review-progress-common-pending-subtitle-status"),this.statusSubTextError=this.t("bbva-feature-mortgage-tracking-main-review-progress-common-error-subtitle-status"),this.textStatusPanelDecline=this.t("bbva-feature-mortgage-tracking-main-review-progress-documentation-badge-status-decline"),this.linkTextCommon="Ver más",this.iconError="alert",this.statusStepDone="completed",this.statusStepError="error",this.propNull="",this.documentationTitle=this.t("bbva-feature-mortgage-tracking-main-review-progress-documentation-title"),this.documentationBadgeStatus="pending",this.documentationSubtitle=this.t("bbva-feature-mortgage-tracking-main-review-progress-documentation-badge-status"),this.documentDescription=this.t("bbva-feature-mortgage-tracking-main-review-progress-documentation-description"),this.documentationLinkText="Ver más",this.documentationStatus="pending",this.textExpirationDate=null,this.documentationNotification="info",this.appraisalTitle=this.t("bbva-feature-mortgage-tracking-main-review-progress-appraisal-title"),this.appraisalBadgeStatus="pending",this.appraisalSubtitle=this.t("bbva-feature-mortgage-tracking-main-review-progress-appraisal-badge-status"),this.appraisalStatus="pending",this.appraisalSubstepTitle1=this.t("bbva-feature-mortgage-tracking-main-review-progress-appraisal-subtitle-1"),this.appraisalSubstepContent1=this.t("bbva-feature-mortgage-tracking-main-review-progress-appraisal-description-1"),this.appraisalSubstepStatus1="pending",this.appraisalSubstepTitle2=this.t("bbva-feature-mortgage-tracking-main-review-progress-appraisal-subtitle-2"),this.appraisalSubstepContent2=this.t("bbva-feature-mortgage-tracking-main-review-progress-appraisal-description-2"),this.appraisalSubstepStatus2="pending",this.appraisalSubstepTitle3=this.t("bbva-feature-mortgage-tracking-main-review-progress-appraisal-subtitle-3"),this.appraisalSubstepContent3=this.t("bbva-feature-mortgage-tracking-main-review-progress-appraisal-description-3"),this.appraisalSubstepStatus3="pending",this.apprasialLinkText="",this.notarialTitle=this.t("bbva-feature-mortgage-tracking-main-review-progress-notarial-title"),this.notarialBadgeStatus="pending",this.notarialSubtitle=this.t("bbva-feature-mortgage-tracking-main-review-progress-notarial-badge-status"),this.notarialStatus="pending",this.notarialSubstepTitle1=this.t("bbva-feature-mortgage-tracking-main-review-progress-notarial-subtitle-1"),this.notarialSubstepContent1=this.t("bbva-feature-mortgage-tracking-main-review-progress-notarial-description-1"),this.notarialSubstepStatus1="pending",this.notarialSubstepTitle2=this.t("bbva-feature-mortgage-tracking-main-review-progress-notarial-subtitle-2"),this.notarialSubstepContent2=this.t("bbva-feature-mortgage-tracking-main-review-progress-notarial-description-2"),this.notarialSubstepStatus2="pending",this.notarialLinkText="",this.appraisalDate="",this.appraisalAmount="",this.notaryName="",this.notaryId="",this.notaryNumber="",this.notaryMail="",this.notaryAddress="",this.signatureDate="",this.signatureExecutive="",this.signatureOffice="",this.signatureAddress="",this.urlPage="",this.callNumber="",this.appSettingsParams={}}init(){this._reset(),this._setUpBbvaLocalMortgagesDM(),this._setUpBbvaLocalContractsDM()}_setUpBbvaLocalContractsDM(){this._contractsDmLocal=this.shadowRoot.querySelector('[data-tag-name="bbva-local-contracting-processes-tracking-task-api-dm"]'),this._contractsDmLocal.postContractingProcessesTrackingTask(this.bodyTrackingTask)}_setUpBbvaLocalMortgagesDM(){this.mortgagesDmLocal=this.shadowRoot.querySelector('[data-tag-name="bbva-local-mortgages-api-dm"]'),this.mortgagesDmLocal.getMortgageListQuotations()}_reset(){this._isDetailPageVisible=!1,this.statusProcess=null,this.taskType=null}getModal(){return this.shadowRoot.querySelector('[data-tag-name="mortgage-tracking-modal"]')}viewMoreModal(){this.getModal().modalOptions(this.taskType)}onRequestError(){this.getModal().openErrorModal()}_openDetail(){this._isDetailPageVisible=!0}_openTracking(){this._isDetailPageVisible=!1}updated(t){if(super.updated(t),t.has("appSettingsParams")&&Object.keys(this.appSettingsParams).length){var e;const t=null===(e=this.appSettingsParams.contact)||void 0===e?void 0:e.contactMortgageTracking;this.callNumber=t}}handleOnSuccesListQuotations(t){Object.keys(t.detail).length?([this.listQuotations]=t.detail,this._formatListQuotationsProperties()):(this.viewMortgageCenterModal(),this._dispatchCustomEvent("update-static-campaigns",this._filterStaticOffers()))}viewMortgageCenterModal(){this.getModal().openMortgageCenterModal()}_filterStaticOffers(){return this.staticOffers.filter((t=>"oc-mortgage-tracking"!==t.bannerType))}_formatListQuotationsProperties(){const{simulation:t,id:e}=this.listQuotations;this.certificateFolio=t.id,this.quotationId=e,this.mortgagesDmLocal.getMortgageQuotationId({quotationId:this.quotationId})}handleOnSuccesQuotationIdDetail(t){this.quotationDetail=t.detail,this._formatQuotationIdProperties()}_formatQuotationIdProperties(){var t,e,a,i,s,r,o,n,l,c,p,d,u,h,g,b,m;const{product:v={},issueDate:y="",expirationDate:_="",balance:f={},term:S="",calculationDate:k="",status:T={},appraisal:x={},notarialData:R={}}=this.quotationDetail;this.product=v.name||"",this.statusProcess=T.id||"",this.subproduct=v.subProductName||"",this.requestDate=y,this.expirationDate=_,this.requestAmount=(null===(t=f.initialAmount)||void 0===t?void 0:t.amount)||"",this.termCredit=S,this.mortgageLoanCurrency=(null===(e=f.monthlyPayment)||void 0===e?void 0:e.mortgageLoanCurrency)||"",this.monthlyPayment=(null===(a=f.monthlyPayment)||void 0===a?void 0:a.amount)||"",this.interestRate=(null===(i=f.interestRate)||void 0===i?void 0:i.amount)||"",this.cat=(null===(s=f.totalAnualCost)||void 0===s?void 0:s.amount)||"",this.calculationDate=k,this.appraisalDate=x.valueDate||"",this.appraisalAmount=(null===(r=x.amount)||void 0===r?void 0:r.amount)||"",this.notaryName=(null===(o=R.executive)||void 0===o?void 0:o.name)||"",this.notaryId=(null===(n=R.notary)||void 0===n||null===(l=n.office)||void 0===l?void 0:l.id)||"",this.notaryNumber=(null===(c=R.notary)||void 0===c||null===(p=c.office)||void 0===p||null===(d=p.contacts[0])||void 0===d?void 0:d.number)||"",this.notaryMail=(null===(u=R.notary)||void 0===u||null===(h=u.office)||void 0===h||null===(g=h.contacts[1])||void 0===g?void 0:g.address)||"",this.notaryAddress=(null===(b=R.branch)||void 0===b?void 0:b.address)||"";const $=null===(m=R.signatureDates)||void 0===m?void 0:m.find((t=>!0===t.isScheduled));if(this.signatureDate=$?$.dateSignature:"",this.formatTextExpirationDate(),this._appAnalyticMainView(),"EXPIRED"===this.statusProcess){this.textNotification=this.t("bbva-feature-mortgage-tracking-main-review-notification-text-error"),this.statusNotification=this.statusStepError,this.alertErrorText=this.t("bbva-feature-mortgage-tracking-main-review-progress-common-alert-error-text-rejected"),this.taskType="MWII_TRKHP_SUBIR_DOCUMENTACION_RECHAZADA";this.getModal().modalOptions(this.statusProcess)}}handleOnTrackingTrask(t){Object.keys((null==t?void 0:t.detail.process)||{}).length?(this.trackingTaskResponse=t.detail,this._formatTrackingTaskProperties()):this.onRequestError()}_formatTrackingTaskProperties(){const{tasks:t}=this.trackingTaskResponse;this.taskType=t[0].taskType,this._appAnalyticMainView()}_appAnalyticMainView(){this.statusProcess&&this.taskType&&(this.analyticsStatusProccess(),this.analyticsStageProccess(),this._dispatchCustomEvent("analytics-fire-fingerprint-mortgages-tracking",{customFields:`${this.analyticsStatus},${this.analyticsStage}`}))}static date(t){return moment(t).format("D [de] MMMM [de] YYYY")}analyticsStageProccess(){const t={MWII_TRKHP_SUBIR_DOCUMENTACION_PREAPROBADO:"documentacion necesaria",MWII_TRKHP_SUBIR_DOCUMENTACION_RECHAZADA:"documentacion necesaria",MWII_TRKHP_VALIDAR_DOCUMENTACION_PREAPROBADO:"documentacion necesaria",MWII_TRKHP_SOLICITAR_DATOS_BASICOS_AVALUO:"avaluo documentos del inmueble",MWII_TRKHP_SUBIR_DOCUMENTACION_AVALUO:"avaluo documentos del inmueble",MWII_TRKHP_VALIDAR_DOCUMENTACION_AVALUO:"avaluo documentos del inmueble",MWII_TRKHP_SUBIR_DOCUMENTACION_AVALUO_RECHAZADA:"avaluo documentos del inmueble",MWII_TRKHP_REGISTRAR_FECHA_AVALUO:"avaluo definiendo fecha",MWII_TRKHP_VISUALIZAR_FECHA_AVALUO:"avaluo fecha lista",MWII_TRKHP_REGISTRAR_RESULTADO_AVALUO:"avaluo analizando resultado",MWII_TRKHP_VISUALIZAR_RESULTADO_AVALUO:"avaluo resultado listo",MWII_TRKHP_ASIGNAR_NOTARIO:"avaluo resultado listo",MWII_TRKHP_VISUALIZAR_NOTARIO_ASIGNADO:"notarial notario asignado",MWII_TRKHP_CAPTURAR_FECHAS_NOTARIO:"notarial firma notarial",MWII_TRKHP_CONFIRMAR_CITA_NOTARIO:"notarial detalle firma notarial",MWII_TRKHP_FINALIZAR_PROCESO:"notarial detalle firma notarial"};return this.taskType in t&&(this.analyticsStage=`etapa solicitud credito hipotecario:${t[this.taskType]}`),this.analyticsStage}analyticsStatusProccess(){return this.analyticsStatus={ACTIVE:"estado solicitud credito hipotecario:pendiente",EXPIRATE:"estado solicitud credito hipotecario:detenido",REJECTED:"estado solicitud credito hipotecario:rechazado"}[this.statusProcess],this.analyticsStatus}statusOptions(){const t={EXPIRED:"Rechazado",MWII_TRKHP_SUBIR_DOCUMENTACION_RECHAZADA:"Detenido",MWII_TRKHP_SUBIR_DOCUMENTACION_AVALUO_RECHAZADA:"Detenido"};return t[this.statusProcess]||t[this.taskType]||"En proceso"}formatAppraisalDate(){return`${we.date(this.appraisalDate)}`}formatAppraisalAmount(){return`${this.t("bbva-feature-mortgage-tracking-modal-appraisal-result-text-2")} ${this.appraisalAmount} ${this.mortgageLoanCurrency}`}formatSignatureDate(){return`${moment(this.signatureDate).format("DD/MM/YY")}`}formatRequestDate(){return`${we.date(this.requestDate)}`}formatExpirationDate(){return`${we.date(this.expirationDate)}`}formatRequestAmount(){return`${this.requestAmount} ${this.mortgageLoanCurrency}`}formatTermText(){return`${this.termCredit} años`}formatMonthlyPayment(){return`${this.monthlyPayment} ${this.mortgageLoanCurrency}`}formatRatesInterest(){return`${this.interestRate}%`}formatRatesCat(){return`${this.cat}%`}formatDescriptionCat(){return`CAT ${this.cat}% sin IVA informativo para fines informativos y de comparación. Fecha de cálculo: ${we.date(this.calculationDate)}. Vencimiento de la oferta: ${we.date(this.expirationDate)}.`}formatTextExpirationDate(){return this.textExpirationDate=`Tienes hasta el ${moment(this.expirationDate).format("DD/MM/YY")}`,this.textExpirationDate}_generationSteps(t){this.trackingSteps=[{title:this.documentationTitle,badgeStatus:this.documentationBadgeStatus,subtitle:this.documentationSubtitle,content:this.documentDescription,middle:!1,linkText:this.documentationLinkText,status:this.documentationStatus,notificationText:this.propNull,notificationVariant:this.documentationNotification},{title:this.appraisalTitle,badgeStatus:this.appraisalBadgeStatus,subtitle:this.appraisalSubtitle,status:this.appraisalStatus,middle:!0,linkText:this.apprasialLinkText,notificationText:this.apprasialTextAlert,notificationVariant:this.apprasialNotification,substep:[{title:this.appraisalSubstepTitle1,content:this.appraisalSubstepContent1,status:this.appraisalSubstepStatus1},{title:this.appraisalSubstepTitle2,content:this.appraisalSubstepContent2,status:this.appraisalSubstepStatus2},{title:this.appraisalSubstepTitle3,content:this.appraisalSubstepContent3,status:this.appraisalSubstepStatus3}]},{title:this.notarialTitle,badgeStatus:this.notarialBadgeStatus,subtitle:this.notarialSubtitle,status:this.notarialStatus,middle:!0,linkText:this.notarialLinkText,substep:[{title:this.notarialSubstepTitle1,content:this.notarialSubstepContent1,status:this.notarialSubstepStatus1},{title:this.notarialSubstepTitle2,content:this.notarialSubstepContent2,status:this.notarialSubstepStatus2}]}];const e={MWII_TRKHP_SUBIR_DOCUMENTACION_PREAPROBADO:{documentationSubtitle:this.documentationSubtitle,textExpirationDate:this.propNull,documentationNotification:this.documentationNotification},MWII_TRKHP_SUBIR_DOCUMENTACION_RECHAZADA:{documentationStatus:this.statusStepError,documentationSubtitle:this.statusSubTextError,documentationBadgeStatus:this.statusStepError,textExpirationDate:this.alertErrorText,documentationNotification:this.iconError},MWII_TRKHP_VALIDAR_DOCUMENTACION_PREAPROBADO:{documentationSubtitle:this.statusSubTextInprogress},MWII_TRKHP_SOLICITAR_DATOS_BASICOS_AVALUO:{documentationSubtitle:this.statusSubTextDone,documentationStatus:this.statusStepDone,documentDescription:this.propNull,textExpirationDate:this.propNull,documentationNotification:this.propNull,documentationLinkText:this.propNull,apprasialLinkText:this.linkTextCommon},MWII_TRKHP_SUBIR_DOCUMENTACION_AVALUO:{documentationSubtitle:this.statusSubTextDone,documentationStatus:this.statusStepDone,appraisalSubtitle:this.statusSubTextInprogress,documentDescription:this.propNull,textExpirationDate:this.propNull,documentationNotification:this.propNull,documentationLinkText:this.propNull,apprasialLinkText:this.linkTextCommon},MWII_TRKHP_VALIDAR_DOCUMENTACION_AVALUO:{documentationSubtitle:this.statusSubTextDone,documentationStatus:this.statusStepDone,appraisalSubtitle:this.statusSubTextInprogress,documentDescription:this.propNull,textExpirationDate:this.propNull,documentationNotification:this.propNull,documentationLinkText:this.propNull,apprasialLinkText:this.linkTextCommon},MWII_TRKHP_SUBIR_DOCUMENTACION_AVALUO_RECHAZADA:{documentationSubtitle:this.statusSubTextDone,documentationStatus:this.statusStepDone,appraisalSubtitle:this.statusSubTextError,documentDescription:this.propNull,textExpirationDate:this.propNull,documentationNotification:this.propNull,documentationLinkText:this.propNull,apprasialLinkText:this.linkTextCommon,appraisalStatus:this.statusStepError,apprasialTextAlert:this.alertErrorText,apprasialNotification:this.iconError,appraisalSubstepStatus1:this.statusStepError,appraisalBadgeStatus:this.statusStepError},MWII_TRKHP_REGISTRAR_FECHA_AVALUO:{documentationSubtitle:this.statusSubTextDone,documentationStatus:this.statusStepDone,appraisalSubtitle:this.statusSubTextInprogress,documentDescription:this.propNull,textExpirationDate:this.propNull,documentationNotification:this.propNull,documentationLinkText:this.propNull,appraisalStatus:this.statusStepDone,appraisalSubstepStatus1:this.statusStepDone,apprasialLinkText:this.linkTextCommon},MWII_TRKHP_VISUALIZAR_FECHA_AVALUO:{documentationSubtitle:this.statusSubTextDone,documentationStatus:this.statusStepDone,appraisalSubtitle:this.statusSubTextPending,documentDescription:this.propNull,textExpirationDate:this.propNull,documentationNotification:this.propNull,documentationLinkText:this.propNull,appraisalStatus:this.statusStepDone,appraisalSubstepStatus1:this.statusStepDone,apprasialLinkText:this.linkTextCommon},MWII_TRKHP_REGISTRAR_RESULTADO_AVALUO:{documentationSubtitle:this.statusSubTextDone,documentationStatus:this.statusStepDone,appraisalSubtitle:this.statusSubTextInprogress,documentDescription:this.propNull,textExpirationDate:this.propNull,documentationNotification:this.propNull,documentationLinkText:this.propNull,appraisalStatus:this.statusStepDone,appraisalSubstepStatus1:this.statusStepDone,appraisalSubstepStatus2:this.statusStepDone,apprasialLinkText:this.linkTextCommon},MWII_TRKHP_VISUALIZAR_RESULTADO_AVALUO:{documentationSubtitle:this.statusSubTextDone,documentationStatus:this.statusStepDone,appraisalSubtitle:this.statusSubTextInprogress,documentDescription:this.propNull,textExpirationDate:this.propNull,documentationNotification:this.propNull,documentationLinkText:this.propNull,appraisalStatus:this.statusStepDone,appraisalSubstepStatus1:this.statusStepDone,appraisalSubstepStatus2:this.statusStepDone,apprasialLinkText:this.linkTextCommon},MWII_TRKHP_ASIGNAR_NOTARIO:{documentationSubtitle:this.statusSubTextDone,documentationStatus:this.statusStepDone,appraisalSubtitle:this.statusSubTextDone,documentDescription:this.propNull,textExpirationDate:this.propNull,documentationNotification:this.propNull,documentationLinkText:this.propNull,appraisalStatus:this.statusStepDone,appraisalSubstepStatus1:this.statusStepDone,appraisalSubstepStatus2:this.statusStepDone,appraisalSubstepStatus3:this.statusStepDone,appraisalSubstepContent1:this.propNull,appraisalSubstepContent2:this.propNull,appraisalSubstepContent3:this.propNull,apprasialLinkText:this.propNull,notarialSubtitle:this.statusSubTextInprogress,notarialLinkText:this.linkTextCommon},MWII_TRKHP_VISUALIZAR_NOTARIO_ASIGNADO:{documentationSubtitle:this.statusSubTextDone,documentationStatus:this.statusStepDone,appraisalSubtitle:this.statusSubTextDone,documentDescription:this.propNull,textExpirationDate:this.propNull,documentationNotification:this.propNull,documentationLinkText:this.propNull,appraisalStatus:this.statusStepDone,appraisalSubstepStatus1:this.statusStepDone,appraisalSubstepStatus2:this.statusStepDone,appraisalSubstepStatus3:this.statusStepDone,appraisalSubstepContent1:this.propNull,appraisalSubstepContent2:this.propNull,appraisalSubstepContent3:this.propNull,apprasialLinkText:this.propNull,notarialSubtitle:this.statusSubTextPending,notarialLinkText:this.linkTextCommon},MWII_TRKHP_CAPTURAR_FECHAS_NOTARIO:{documentationSubtitle:this.statusSubTextDone,documentationStatus:this.statusStepDone,appraisalSubtitle:this.statusSubTextDone,documentDescription:this.propNull,textExpirationDate:this.propNull,documentationNotification:this.propNull,documentationLinkText:this.propNull,appraisalStatus:this.statusStepDone,appraisalSubstepStatus1:this.statusStepDone,appraisalSubstepStatus2:this.statusStepDone,appraisalSubstepStatus3:this.statusStepDone,appraisalSubstepContent1:this.propNull,appraisalSubstepContent2:this.propNull,appraisalSubstepContent3:this.propNull,apprasialLinkText:this.propNull,notarialSubtitle:this.statusSubTextPending,notarialLinkText:this.linkTextCommon,notarialStatus:this.statusStepDone,notarialSubstepStatus1:this.statusStepDone},MWII_TRKHP_CONFIRMAR_CITA_NOTARIO:{documentationSubtitle:this.statusSubTextDone,documentationStatus:this.statusStepDone,appraisalSubtitle:this.statusSubTextDone,documentDescription:this.propNull,textExpirationDate:this.propNull,documentationNotification:this.propNull,documentationLinkText:this.propNull,appraisalStatus:this.statusStepDone,appraisalSubstepStatus1:this.statusStepDone,appraisalSubstepStatus2:this.statusStepDone,appraisalSubstepStatus3:this.statusStepDone,appraisalSubstepContent1:this.propNull,appraisalSubstepContent2:this.propNull,appraisalSubstepContent3:this.propNull,apprasialLinkText:this.propNull,notarialSubtitle:this.statusSubTextDone,notarialLinkText:this.linkTextCommon,notarialStatus:this.statusStepDone,notarialSubstepStatus1:this.statusStepDone,notarialSubstepStatus2:this.statusStepDone},MWII_TRKHP_FINALIZAR_PROCESO:{documentationSubtitle:this.statusSubTextDone,documentationStatus:this.statusStepDone,appraisalSubtitle:this.statusSubTextDone,documentDescription:this.propNull,textExpirationDate:this.propNull,documentationNotification:this.propNull,documentationLinkText:this.propNull,appraisalStatus:this.statusStepDone,appraisalSubstepStatus1:this.statusStepDone,appraisalSubstepStatus2:this.statusStepDone,appraisalSubstepStatus3:this.statusStepDone,appraisalSubstepContent1:this.propNull,appraisalSubstepContent2:this.propNull,appraisalSubstepContent3:this.propNull,apprasialLinkText:this.propNull,notarialSubtitle:this.statusSubTextDone,notarialLinkText:this.linkTextCommon,notarialStatus:this.statusStepDone,notarialSubstepStatus1:this.statusStepDone,notarialSubstepStatus2:this.statusStepDone,notarialSubstepContent1:this.propNull,notarialSubstepContent2:this.propNull,statusNotification:"success",textNotification:this.t("bbva-feature-mortgage-tracking-main-review-notification-complete-process-text")}};if(t in e){const a=e[t];return Object.assign(this,a),this.trackingSteps}return this.trackingSteps}_BbvaMortgagesDm(){return f`
      <bbva-local-mortgages-api-dm
        id="mortgageDm"
        .host="${this.host}"
        .version="${this.apiVersion}"
        .requiredToken="${this.requiredToken}"
        ?native="${this.native}"
        @get-mortgage-list-quotations-v0-success="${this.handleOnSuccesListQuotations}"
        @get-mortgage-list-quotations-v0-error="${this.onRequestError}"
        @get-mortgage-quotations-quotation-v0-success="${this.handleOnSuccesQuotationIdDetail}"
        @get-mortgage-quotations-quotation-v0-error="${this.onRequestError}"
      >
      </bbva-local-mortgages-api-dm>
    `}_BbvaContractsDm(){return f` 
    <bbva-local-contracting-processes-tracking-task-api-dm
      id="contractsDm"
      .host="${this.host}"
      .version="${this.apiVersion}"
      .requiredToken="${this.requiredToken}"
      ?native="${this.native}"
      @contracting-processes-tracking-task-api-dm-post="${this.handleOnTrackingTrask}"
      @contracting-processes-tracking-task-api-dm-post-error="${this.onRequestError}"
    >
    </bbva-local-contracting-processes-tracking-task-api-dm>
    `}get mainTemplate(){return f`
    ${this._BbvaMortgagesDm()}
    ${this._BbvaContractsDm()}
    <div slot="slot-content" class="container">
      <mortgage-tracking-main
        id="trackingMain"
        text-status-panel="${this.statusOptions()}"
        text-notification="${this.textNotification||this.t("bbva-feature-mortgage-tracking-main-review-notification-text")}"
        status-notification="${this.statusNotification}"
        text-certificate-folio="${this.certificateFolio}"
        .stepsTracking="${this._generationSteps(this.taskType)}"
        @panel-detail-link-click="${this._openDetail}"
        @progress-vertical-step-link-click="${this.viewMoreModal}"
      >
      </mortgage-tracking-main>
    </div>

    <bbva-transition-container id="tracking-detail" ?visible="${this._isDetailPageVisible}">
      <div slot="slot-content" class="container">
        <mortgage-tracking-detail
          id="detailPage"
          text-product="${this.product}"
          text-subproduct="${this.subproduct}"
          text-certificate-folio="${this.certificateFolio}"
          text-request-date="${this.formatRequestDate()}"
          text-expiration-date="${this.formatExpirationDate()}"
          text-request-amount="${this.formatRequestAmount()}"
          text-term="${this.formatTermText()}"
          text-monthly-payment="${this.formatMonthlyPayment()}"
          text-interest-rate="${this.formatRatesInterest()}"
          text-cat="${this.formatRatesCat()}"
          description-cat="${this.formatDescriptionCat()}"
          @header-main-icon-right-primary-click="${this._openTracking}"
        ></mortgage-tracking-detail>
      </div>
    </bbva-transition-container>

    <mortgage-tracking-modal
      id="trackingModal"
      .appraisalDate="${this.formatAppraisalDate()}"
      .appraisalAmount="${this.formatAppraisalAmount()}"
      .notaryName="${this.notaryName}"
      .notaryId="${this.notaryId}"
      .notaryNumber="${this.notaryNumber}"
      .notaryMail="${this.notaryMail}"
      .notaryAddress="${this.notaryAddress}"
      .signatureDate="${this.formatSignatureDate()}"
      .urlPage="${this.urlPage}"
      .callNumber="${this.callNumber}"
      >
    </mortgage-tracking-modal>
  `}render(){return f`${this.mainTemplate}`}}customElements.define(we.is,we);const Pe=ct((t=>class extends t{static get properties(){return{config:{type:Object},data:{type:Object},appStartedText:{type:String},stringNormalizeExceptions:{type:Array},dynamicMethodsName:{type:Array},dependsOnAppStartedLaunched:{type:Boolean},_isAppStartedLaunched:{type:Boolean}}}constructor(){super(),this.config={items:{},buttons:{continue:""},steps:{}},this.data={},this.appStartedText="app started:",this.stringNormalizeExceptions=["paymentCurrency","currency","operationNumber"],this.dynamicMethodsName=[],this.dependsOnAppStartedLaunched=!1,this._isAppStartedLaunched=!1}persistData(t){Object.assign(this.data,t)}buildDynamicMethods(){this.dynamicMethodsName.forEach((t=>{this[t]=()=>this._dispatch(`analytics-${this._camelToKebabCase(t)}`,this.data)}))}_camelToKebabCase(t){return t.replace(/[A-Z]/g,(t=>`-${t.toLowerCase()}`))}persistDataString(t){Object.assign(this.data,this.parseDataToString(t))}_toStringProcess(t,e){const a=t.toString();return this.stringNormalizeExceptions.includes(e)?a:this._normalizeStr(a)}_normalizeStr(t){let e=t;if("string"==typeof t){const a="ÁÃÀÄÂÉËÈÊÍÏÌÎÓÖÒÔÚÜÙÛÇáãàäâéëèêíïìîóöòôúüùûç",i="AAAAAEEEEIIIIOOOOUUUUCaaaaaeeeeiiiioooouuuuc",s=new RegExp(`[${a}]`,"ug");e=t.replace(s,(t=>i.charAt(a.indexOf(t)))).toLowerCase()}return e}parseDataToString(t,e){if(!t)return t;switch(typeof t){case"string":case"boolean":case"number":return this._toStringProcess(t,e);case"object":if(Array.isArray(t))return t.map((t=>this.parseDataToString(t)));const a={...t};return Object.keys(a).forEach((e=>{a[e]=this.parseDataToString(t[e],e)})),a;case"function":return this.parseDataToString(t());default:return t.toString()}}firePersistedData(t){this.persistData(t),this._dispatch("analytics-persisted-data",this.data)}fireNormalizedPersistedData(t){let e=t;"string"==typeof e&&(e=this.normalizeString(e)),"object"==typeof e&&Object.keys(e).forEach((t=>{e[t]=this.normalizeString(e[t])})),this.firePersistedData(e)}resetData(){this.data={},this._isAppStartedLaunched=!1}firePageVisit(){this._dispatch("analytics-page-visit",this.data),this._isAppStartedLaunched=!1}firePageView(t){this._dispatch("analytics-page-view"+(t?`-${t}`:""))}fireModal(){this._dispatch("analytics-modal")}fireModalWithData(){this._dispatch("analytics-modal",this.data)}fireInternalLink(t){this._dispatch("analytics-internal-link",t)}fireInternalLinkCard(t){this._dispatch("analytics-internal-link-card",t)}fireExternalLink(){this._dispatch("analytics-external-link")}fireItemAppStarted(t){if(!this._isAppStartedLaunched){const e=(null==t?void 0:t.id)||t,a=this._getTextConfig(e,"items");a&&(this.fireAppStarted(a),this._isAppStartedLaunched=this.dependsOnAppStartedLaunched)}}fireAppOnClickStart(){this._dispatch("analytics-app-on-click-start",this.data)}fireAppStarted(t){this.persistData({detail:`${this.appStartedText}${t}`}),this._dispatch("analytics-app-started",this.data)}fireAdvancedMark(){this._dispatch("analytics-advanced-mark",this.data)}fireAppCompleted(){this._dispatch("analytics-app-completed",this.data),this.resetData()}fireFrequentAppCompleted(){this._dispatch("analytics-frequent-app-completed",this.data),this.resetData()}normalizeString(t){return t.toLowerCase().normalize("NFD").replace(/[^a-zA-Z0-9 ]/g,"")}_getTextConfig(t,e){var a,i;return null===(a=this.config)||void 0===a||null===(i=a[e])||void 0===i?void 0:i[t]}getPathValue(t,e){return e.split(".").reduce(((t,e)=>t[e]),t)}_dispatch(t,e){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}}));class Oe extends(Pe(a)){static get is(){return"bbva-analyticmanager-loan-and-mortgage-information"}static get properties(){return{}}fireProductDetailError(){this._dispatch("bbva-analyticmanager-loan-and-mortgage-information-product-detail-error")}fireInstallmentError(){this._dispatch("bbva-analyticmanager-loan-and-mortgage-information-installment-error")}fireMoreInfoError(){this._dispatch("bbva-analyticmanager-loan-and-mortgage-information-more-info-error")}}customElements.define(Oe.is,Oe);
