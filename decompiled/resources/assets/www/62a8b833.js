import{aZ as t,J as e,L as s,dD as i,z as n,an as a,ak as r,h as o,aY as c,a9 as l,a8 as u,cU as h,ch as d,aU as p,cT as m,aD as b,aN as g,dH as v,ai as _,i as f,H as y}from"./952f98a9.js";import{B as S}from"./40b41b3c.js";import{B as E,a as A}from"./a1d2a84f.js";import{cD as R,J as C,cE as x,bg as P,bf as T,bP as $,bQ as w,bS as O,bT as D}from"./7f3d7ca9.js";import{M as I,L as k,D as q,V as H,N,z as j,G as L,f as B,K as F,H as V,a2 as G,I as M,h as z,e as U,a1 as X,E as Q,A as W,F as K,O as J,ao as Y,Q as Z,an as tt,P as et,T as st,ah as it,x as nt,a4 as at}from"./216055dc.js";import{B as rt,b as ot}from"./30ef6f1f.js";import{B as ct,a as lt}from"./722094db.js";import{B as ut}from"./fc449e46.js";import{b as ht,B as dt}from"./41ed0536.js";import{B as pt,b as mt}from"./161ddab1.js";import{B as bt,b as gt}from"./972f570a.js";import{B as vt,b as _t}from"./d335c75d.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./854beed0.js";import"./84dff06e.js";class ft extends R{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`risks/v${this.version}/risk-levels/calculate`)}toString(){return super.toString("BGADPRisksRiskLevelsCalculatePostV1")}}let yt=class{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(t,e){if(null===this)throw new TypeError('"this" is null or not defined');let s=Object(this),i=s.length>>>0;if(0===i)return!1;let n=0|e,a=Math.max(n>=0?n:i-Math.abs(n),0);for(;a<i;){if((r=s[a])===(o=t)||"number"==typeof r&&"number"==typeof o&&isNaN(r)&&isNaN(o))return!0;a++}var r,o;return!1}}),String.fromCodePoint||function(t){var e=function(e){for(var s=[],i=0,n="",a=0,r=arguments.length;a!==r;++a){var o=+arguments[a];if(!(o<1114111&&o>>>0===o))throw RangeError("Invalid code point: "+o);o<=65535?i=s.push(o):(o-=65536,i=s.push(55296+(o>>10),o%1024+56320)),i>=16383&&(n+=t.apply(null,s),s.length=0)}return n+t.apply(null,s)};try{Object.defineProperty(String,"fromCodePoint",{value:e,configurable:!0,writable:!0})}catch(t){String.fromCodePoint=e}}(String.fromCharCode)}_error(t=0,e="",s=null){throw t=`0000${t=t.toString()}`.substr(t.length),Error(`BGADP_ERROR_${t} :: ${e} :: ${s&&s.message}`)}},St=class extends yt{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(t="",e=""){if("string"==typeof t&&t)if(this._reservedKeys.includes(t))this._error(2,`"${t}" should NOT be a reserved key`);else{if("string"!=typeof e)try{e=JSON.stringify(e)}catch(t){this._error(1,`"${e}" couldn't be transformed into String`)}e=e.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[t]=e}else this._error(3,"Missing {item} parameter")}getItem(t=""){return this._items[t]?this._items[t]:null}removeItem(t=""){this._items.hasOwnProperty(t)&&delete this._items[t]}clear(){Object.keys(this._items).length&&(this._items={})}};const Et=0,At=1,Rt="jwt",Ct="tsec",xt="none";let Pt=class extends yt{constructor(t=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=Et,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(t),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let t={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(t).forEach((e=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!1,value:t[e],writable:"_headers"!==e})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new St,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this)}_assignConfigValues(t=null){null!=t&&"object"==typeof t&&Object.keys(t).forEach((e=>{if(this.hasOwnProperty(e)&&"_"!==e.charAt(0)&&"function"!=typeof this[e])if("object"==typeof this[e])Array.isArray(t[e])?this[e]=Array.from(t[e]):null===this[e]?this[e]=t[e]:this[e]=Object.assign(this[e]||{},t[e]);else this[e]=t[e];else"signatureRequiredErrors"===e?this._ERROR_CODES.SIGNATURE_REQUIRED=t[e]:"signatureInvalidErrors"===e?this._ERROR_CODES.SIGNATURE_INVALID=t[e]:"signatureFirstErrorCode"===e?this._ERROR_CODES.SIGNATURE_FIRST_STEP=t[e]:"pendingProcessResponseErrors"===e?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=t[e]:"signatureInvalidStatus"===e?this._STATUS_CODES.SIGNATURE_INVALID=t[e]:"pendingProcessResponseStatus"==e?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=t[e]:"getTokenHandlerKey"===e?this.getTokenHandlerKey=t[e]:("function"==typeof this[e]&&this._error(1,`${e} is a class method, can't be override`),"_"===e.charAt(0)&&this._error(2,`"${e}" is a restricted property, can't be override`),this.hasOwnProperty(e)||this._error(3,`"${e}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=Ct:this.requiredToken=xt,this.requiresJWT=!1):this.requiredToken===Ct?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===Rt?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===xt?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(Ct)}_setJwtHandler(){this._setTokenHandler(Rt)}_setTokenHandler(t){const e=`${t}Handler`;this[e]=this[e]||window.sessionStorage;try{this[e].setItem("test","test"),this[e].removeItem("test")}catch(t){this._error(4,`Invalid [${e}]. If not specified, default window.sessionStorage can't be written/read`,t)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(t=""){t&&"string"==typeof t?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:t,writable:!1}):this._error(6,"[path] is required")}_buildPromise(t=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let e={isPending:!0};e.promise=new window.Promise(((s,i)=>{e=Object.assign(e,{resolve:s,reject:i}),this._buildRequest(t)})),this._promise=Object.assign({},e)}return this._promise.promise}_defaultXHR(t=""){let e=new window.XMLHttpRequest;if(e instanceof window.XMLHttpRequest){e.withCredentials=this.withCredentials,e.timeout=1e3*this.timeout,e.onreadystatechange=this._onReadyStateChange.bind(this),e.responseType=this.responseType,e.open(this.method.toUpperCase(),t);let s=this._getRequestHeaders();Object.keys(s).forEach((t=>{this.forceBoundary&&this.multipart&&"Content-Type"===t||e.setRequestHeader(t,s[t])})),e.send(this._buildBody())}return e}_nativeXHR(t=""){let e=this._buildNativeRequest();return e?(e=e[this.method.toLowerCase()],"function"==typeof e?e=e({url:t,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),e}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=t),e}_buildRequest(t=!1){let e=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const t={url:e,path:this._path,method:this.method};this._emitRequestEvent("start",t)}if(!t&&this._cacheItem&&e===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!t&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:e,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(e);break;case this._NATIVE_XHR:this._request=this._nativeXHR(e)}return this._request}_buildURL(){let t=[this.host,this._path].join("/");if(null!==this.params){let e=Object.assign({},this.params);-1!==t.lastIndexOf("{")&&(t=t.replace(/(\{[\w\-]+\})/g,(t=>{let s=t.replace(/[\{\}]+/g,""),i=e[s];return i?delete e[s]:this._error(9,`Missing ${s} param value`),i})),-1!==t.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let s=Object.keys(e);s.length&&(t=[t,s.map((t=>{let s=e[t];return Array.isArray(s)&&this.paramArrayMode===At?this._arrayToQueryParam(t,s):`${t}=${s}`})).join("&")].join("?"))}return t}_arrayToQueryParam(t,e){return e.map((e=>`${t}=${e}`)).join("&")}_getRequestHeaders(){let t=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(t=this._getTokenForRequestHeaders(Ct,t)),!0===this.requiresJWT&&(t=this._getTokenForRequestHeaders(Rt,t)),!0===this.semaasMonitoring){let e=this._getSemaasHeaders();Object.assign(t,e)}const e=this._getCustomHeaders();return Object.assign(t,e),t}_getSemaasHeaders(){var t={};if(window.sessionStorage){var e=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(s){var i=e.getItem(s);i&&"null"!==i&&(t[s]=i)}))}return t}_getCustomHeaders(){const t="x-bgadp-";let e={};if(window.sessionStorage){const s=window.sessionStorage;e=Object.keys(s).filter((e=>e.startsWith(t))).reduce(((e,i)=>(e[i.replace(t,"")]=s.getItem(i),e)),{})}return e}_getTokenForRequestHeaders(t,e){const s=`${t}Handler`,i=t===Rt?"JWT ":"",n=t===Rt?"Authorization":Ct;if(void 0===this[s]||null===this[s])this._error(11,`${t} handler is undefined`);else{const a=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):t;let r=this[s].getItem(a);r?e[n]=e[n]||i+r:this._error(12,`Missing '${t}' value`)}return e}_buildBody(){let t=this.body;if(t&&this._xhrType===this._DEFAULT_XHR){let e=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===e){let e=[];Object.keys(t).forEach((s=>{e.push(`${s}=${t[s]}`)})),t=e.join("&")}else this.headers&&-1!==e.indexOf("multipart/")||(t=JSON.stringify(t))}return t}_onReadyStateChange(){let t=this._request;if(t&&t.readyState===window.XMLHttpRequest.DONE)switch(t.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(t);break;default:this._onRequestFail(t)}}_extractRequestResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)e={result:e};else if(e&&e instanceof ArrayBuffer)try{const t=this._decode(e);try{e=JSON.parse(t)}catch(s){e={result:t,originalResponse:e}}}catch(t){e=null}else if(e&&"string"==typeof e)try{e=JSON.parse(e)}catch(t){e=null}return e}async _extractRequestErrorResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)try{const t=await this._blobDecode(e);try{e=JSON.parse(t)}catch(s){e={result:t,originalResponse:e}}}catch(t){e=null}else e=this._extractRequestResponse(t);return e}_blobDecode(t){const e=new FileReader;let s;const i=new Promise(((t,e)=>{s=(s,i)=>{s?e(s):t(i)}}));return e.addEventListener("loadend",(function t(i){e.removeEventListener("loadend",t),i.error?s(i.error):s(null,e.result)})),e.readAsText(t),i}_decode(t){let e;if("function"==typeof TextDecoder){e=new TextDecoder("utf-8").decode(t)}else{let s=0;for(;s<t.length;){let i=t[s],n=0,a=0;if(i<=127?(n=0,a=255&i):i<=223?(n=1,a=31&i):i<=239?(n=2,a=15&i):i<=244&&(n=3,a=7&i),t.length-s-n>0){let e=0;for(;e<n;)i=t[s+e+1],a=a<<6|63&i,e+=1}else a=65533,n=t.length-s;e+=String.fromCodePoint(a),s+=n+1}}return e}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let t=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(t=window.btoa(t)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,t);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,t);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,t);case this._CACHE_NONE:}}catch(t){this._error(13,`Can't write into cache engine: ${t.message}`,t)}}_retrieveFromCache(){let t;try{switch(this._cache){case this._CACHE_MEMORY:t=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:t=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:t=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(t){this._error(14,"Can't read from cache engine",t)}return t&&(this.encodeCache&&(t=window.atob(t)),"string"==typeof t&&/[\{\[]/.test(t.charAt(0))&&(t=JSON.parse(t))),t}_setLastResponse(t=null){t&&(this._lastResponse=Object.assign({},t))}_setLastResponseHeaders(t=null){let e={};t&&(t instanceof window.XMLHttpRequest?e=this._parseResponseHeadersToObject(t.getAllResponseHeaders()):t.headers&&(e=JSON.parse(t.headers))),this._lastResponseHeaders=e}_parseResponseHeadersToObject(t){let e={},s=t.trim().split(/[\r\n]+/);for(const t in s)if(s.hasOwnProperty(t)&&""!==s[t]){let i=": ",n=s[t].split(i);e[n.shift().toLowerCase()]=n.join(i)}return e}_onRequestSuccess(t=null){this._setLastResponse(this._extractRequestResponse(t)),this._setLastResponseHeaders(t),this.jwtHandler&&this._storeToken(this.jwtHandler,t,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,t,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",t)}_storeToken(t,e,s,i){let n=null;switch(this._xhrType){case this._DEFAULT_XHR:e&&e.getAllResponseHeaders&&e.getResponseHeader&&e.getAllResponseHeaders().indexOf(i)>=0&&(n=e.getResponseHeader(i));break;case this._NATIVE_XHR:e&&e.headers&&(n=JSON.parse(e.headers)[i])}if(n){const e=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):s;t.getItem(e)!==n&&(t.setItem(e,n),this._emitTokenUpdate(s,n))}}_emitTokenUpdate(t,e){if(this.htmlContext){const s=new CustomEvent("token-update",{bubbles:!0,detail:{type:t,token:e}});this.htmlContext.dispatchEvent(s)}}_emitRequestEvent(t,e){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${t}`,{bubbles:!0,composed:!0,detail:{metadata:e}})):console.warn(`Missing htmlContext to dispatch event http-request-${t}`)}_onRequestFail(t=null){(async()=>{if(!this._isSignatureRequired(t)&&!this._isWaitingForProcessResponse(t)){let e=await this._extractRequestErrorResponse(t);this._setLastResponse(e),this._setLastResponseHeaders(t),this._onRequestEnd("reject",t)}})()}_onRequestEnd(t="resolve",e=null){if(this._resetDPState(),this.emitRequestEvents){const t={method:this.method,path:this._path};null!==e&&(t.status=e.status,t.url=e.responseURL),this._emitRequestEvent("end",t)}this._promise&&"function"==typeof this._promise[t]&&(this._promise.isPending=!1,this._promise[t](e))}_resetDPState(){["Data","Type","State"].forEach((t=>{let e=`Authentication${t}`;this._headers&&this._headers.hasOwnProperty(e)&&delete this._headers[e],this.headers&&this.headers.hasOwnProperty(e)&&delete this.headers[e]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(t=null){let e,s,i,n,a;if(t instanceof window.XMLHttpRequest)e=t.getResponseHeader("AuthenticationType"),s=t.getResponseHeader("AuthenticationData"),i=t.getResponseHeader("AuthenticationState"),n=t.getResponseHeader("AuthenticationChallenge"),a=t.getResponseHeader("AuthenticationResponse");else{let r=JSON.parse(t.headers);e=r.authenticationtype,s=r.authenticationdata||null,i=r.authenticationstate,n=r.authenticationchallenge,a=r.authenticationresponse}return{type:e,data:s,state:i,challenge:n,response:a}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureTypeChange(t,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureValueChange(t,...arguments)}})}_onSignatureTypeChange(t="",e="",s=""){if("string"==typeof t&&""!==t)if(e.includes(t)){if("string"==typeof t&&""!==t){const i=this._getSignatureData(t,e,s);this.headers=Object.assign(this.headers||{},{AuthenticationType:t,AuthenticationData:i}),this._buildRequest()}}else this._error(15,`${t} is not a valid signature type`);"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(t=null,e="",s="",i=""){let n;if("object"==typeof t&&t){const a=this._getSignatureData(t.signatureType,e,s);n=this._makeKeyValuePairFromObject(a,t.signatureValue),t.challenge&&(n+=`,challenge=${t.challenge}`),this._buildSignatureHeaders(n,t.signatureType,i)}else"string"==typeof t&&""!==t&&(this._hasSignatureAuthenticationType(e,"2")?(n=`password=${t}`,this._buildSignatureHeaders(n,"2",i)):(n=`${s}=${t}`,this._buildSignatureHeaders(n,e,i)));"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(t="",e=""){if(!t)return"";let s,i=t.split(",");if(i.length>1){s=i.map((t=>`${t}=${e[t]}`)).join(",")}else s=`${t}=${e}`;return s}_hasSignatureAuthenticationType(t,e){return-1!==t.split(";").findIndex((t=>t===e))}_buildSignatureHeaders(t="",e="",s=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:t,AuthenticationType:e||""}),s&&(this.headers=Object.assign(this.headers,{AuthenticationState:s})),this._buildRequest()}_isSignatureRequired(t=null){const e=Number((t||{}).status);let s=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(e)){const e=this._extractRequestResponse(t),i=this._extractResponseErrorCode(e),n=this._ERROR_CODES.SIGNATURE_INVALID.includes(i),{type:a,data:r,state:o,challenge:c,response:l}=this._extractSignatureResponseHeaders(t),u=this._getRequestMetadata(t);if(n)this._notifySignatureInvalid(u),s=!0;else if(a)if(e){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(i)?(this._notifySignatureTypeUsingErrorCode(i,u,a,r,o,c,l),s=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(u,a,r,o,c,l),s=!0}return s}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(t=null){const e=Number((t||{}).status);let s=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(e)){const e=this._extractRequestResponse(t),i=this._extractResponseErrorCode(e),n=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(i),a=this._getRequestMetadata(t);n&&(this._notifyWaitingForProcessResponse(a),s=!0)}return s}_notifySignatureRequiredFirstStep(t,e,s,i){this._defineSignatureType(e,s),this._defineSignatureValue(e,s,i),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:e,data:s,metadata:t}}))}_notifySignatureRequired(t,e,s,i,n,a){this._defineSignatureValue(e,s,i);const r={type:e,data:s,challenge:n,metadata:t};a&&(r.response=a),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:r}))}_notifySignatureInvalid(t){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:t}}))}_notifyWaitingForProcessResponse(t){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:t}}))}_getRequestMetadata(t){const{responseURL:e,status:s}=t;return{path:this._path,method:this.method,url:e,status:s}}_emitEvent(t){this.htmlContext?this.htmlContext.dispatchEvent(t):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(t="",e="",s=""){const i=e.split(";").findIndex((e=>e===t));return s?s.split(";")[i]:""}toString(t=""){return`[object ${t||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(t=!1){return this._buildPromise(t)}_extractResponseErrorCode(t){return t?t["error-code"]||t.messages&&t.messages[0].code:null}_notifySignatureTypeUsingHeaders(t,e,s,i,n,a){i?this._notifySignatureRequired(t,e,s,i,n,a):this._notifySignatureRequiredFirstStep(t,e,s,i)}_notifySignatureTypeUsingErrorCode(t,e,s,i,n,a,r){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(t)?this._notifySignatureRequiredFirstStep(e,s,i,n):this._notifySignatureRequired(e,s,i,n,a,r)}};class Tt extends Pt{constructor(t=null){super(Object.assign(t||{},{method:"DELETE"}))}toString(t=""){return super.toString(t||"BGADPRequestDELETE")}}let $t=class extends Pt{constructor(t=null){super(Object.assign(t||{},{method:"GET"}))}toString(t=""){return super.toString(t||"BGADPRequestGET")}},wt=class extends Pt{constructor(t=null){super(Object.assign(t||{},{method:"PATCH"}))}toString(t=""){return super.toString(t||"BGADPRequestPATCH")}},Ot=class extends Pt{constructor(t=null){super(Object.assign(t||{},{method:"POST"}))}toString(t=""){return super.toString(t||"BGADPRequestPOST")}};class Dt extends Pt{constructor(t=null){super(Object.assign(t||{},{method:"PUT"}))}toString(t=""){return super.toString(t||"BGADPRequestPUT")}}class It extends $t{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts`)}toString(){return super.toString("BGADPAccountsGetV0")}}class kt extends Ot{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts`)}toString(){return super.toString("BGADPAccountsPostV0")}}class qt extends $t{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}`)}toString(){return super.toString("BGADPAccountsAccountGetV0")}}class Ht extends wt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}`)}toString(){return super.toString("BGADPAccountsAccountPatchV0")}}class Nt extends Ot{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/cancellations`)}toString(){return super.toString("BGADPAccountsAccountCancellationsPostV0")}}class jt extends $t{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/current-balances`)}toString(){return super.toString("BGADPAccountsAccountCurrentBalancesGetV0")}}class Lt extends $t{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/customized-formats`)}toString(){return super.toString("BGADPAccountsAccountCustomizedFormatsGetV0")}}class Bt extends Dt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/customized-formats/{customized-format-id}`)}toString(){return super.toString("BGADPAccountsAccountCustomizedFormatsCustomizedFormatPutV0")}}class Ft extends Tt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/customized-formats/{customized-format-id}`)}toString(){return super.toString("BGADPAccountsAccountCustomizedFormatsCustomizedFormatDeleteV0")}}class Vt extends $t{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/financial-statements`)}toString(){return super.toString("BGADPAccountsAccountFinancialStatementsGetV0")}}class Gt extends $t{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/financial-statements/{financial-statement-id}`)}toString(){return super.toString("BGADPAccountsAccountFinancialStatementsFinancialStatementGetV0")}}class Mt extends $t{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/holds`)}toString(){return super.toString("BGADPAccountsAccountHoldsGetV0")}}class zt extends $t{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/holds/{hold-id}`)}toString(){return super.toString("BGADPAccountsAccountHoldsHoldGetV0")}}class Ut extends $t{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/indicators`)}toString(){return super.toString("BGADPAccountsAccountIndicatorsGetV0")}}class Xt extends $t{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/limits`)}toString(){return super.toString("BGADPAccountsAccountLimitsGetV0")}}class Qt extends $t{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/participants`)}toString(){return super.toString("BGADPAccountsAccountParticipantsGetV0")}}class Wt extends $t{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/related-contracts`)}toString(){return super.toString("BGADPAccountsAccountRelatedContractsGetV0")}}class Kt extends $t{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/transactions`)}toString(){return super.toString("BGADPAccountsAccountTransactionsGetV0")}}class Jt extends $t{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/transactions/{transaction-id}`)}toString(){return super.toString("BGADPAccountsAccountTransactionsTransactionGetV0")}}class Yt extends $t{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/account-types`)}toString(){return super.toString("BGADPAccountsAccountTypesGetV0")}}class Zt extends $t{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/balances`)}toString(){return super.toString("BGADPAccountsBalancesGetV0")}}class te extends $t{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/documentation-dossiers`)}toString(){return super.toString("BGADPAccountsDocumentationDossiersGetV0")}}class ee extends Ot{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/offers/{offer-id}/simulate`)}toString(){return super.toString("BGADPAccountsOffersOfferSimulatePostV0")}}let se=class{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(t,e){if(null===this)throw new TypeError('"this" is null or not defined');let s=Object(this),i=s.length>>>0;if(0===i)return!1;let n=0|e,a=Math.max(n>=0?n:i-Math.abs(n),0);for(;a<i;){if((r=s[a])===(o=t)||"number"==typeof r&&"number"==typeof o&&isNaN(r)&&isNaN(o))return!0;a++}var r,o;return!1}}),String.fromCodePoint||function(t){var e=function(e){for(var s=[],i=0,n="",a=0,r=arguments.length;a!==r;++a){var o=+arguments[a];if(!(o<1114111&&o>>>0===o))throw RangeError("Invalid code point: "+o);o<=65535?i=s.push(o):(o-=65536,i=s.push(55296+(o>>10),o%1024+56320)),i>=16383&&(n+=t.apply(null,s),s.length=0)}return n+t.apply(null,s)};try{Object.defineProperty(String,"fromCodePoint",{value:e,configurable:!0,writable:!0})}catch(t){String.fromCodePoint=e}}(String.fromCharCode)}_error(t=0,e="",s=null){throw t=`0000${t=t.toString()}`.substr(t.length),Error(`BGADP_ERROR_${t} :: ${e} :: ${s&&s.message}`)}},ie=class extends se{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(t="",e=""){if("string"==typeof t&&t)if(this._reservedKeys.includes(t))this._error(2,`"${t}" should NOT be a reserved key`);else{if("string"!=typeof e)try{e=JSON.stringify(e)}catch(t){this._error(1,`"${e}" couldn't be transformed into String`)}e=e.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[t]=e}else this._error(3,"Missing {item} parameter")}getItem(t=""){return this._items[t]?this._items[t]:null}removeItem(t=""){this._items.hasOwnProperty(t)&&delete this._items[t]}clear(){Object.keys(this._items).length&&(this._items={})}};const ne="jwt",ae="tsec",re="none";let oe=class extends se{constructor(t=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(t),this._assingSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let t={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(t).forEach((e=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!1,value:t[e],writable:"_headers"!==e})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new ie,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this)}_assignConfigValues(t=null){null!=t&&"object"==typeof t&&Object.keys(t).forEach((e=>{if(this.hasOwnProperty(e)&&"_"!==e.charAt(0)&&"function"!=typeof this[e])if("object"==typeof this[e])Array.isArray(t[e])?this[e]=Array.from(t[e]):null===this[e]?this[e]=t[e]:this[e]=Object.assign(this[e]||{},t[e]);else this[e]=t[e];else"signatureRequiredErrors"===e?this._ERROR_CODES.SIGNATURE_REQUIRED=t[e]:"signatureInvalidErrors"===e?this._ERROR_CODES.SIGNATURE_INVALID=t[e]:"signatureFirstErrorCode"===e?this._ERROR_CODES.SIGNATURE_FIRST_STEP=t[e]:"signatureInvalidStatus"===e?this._STATUS_CODES.SIGNATURE_INVALID=t[e]:"getTokenHandlerKey"===e?this.getTokenHandlerKey=t[e]:("function"==typeof this[e]&&this._error(1,`${e} is a class method, can't be override`),"_"===e.charAt(0)&&this._error(2,`"${e}" is a restricted property, can't be override`),this.hasOwnProperty(e)||this._error(3,`"${e}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assingSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=ae:this.requiredToken=re,this.requiresJWT=!1):this.requiredToken===ae?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===ne?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===re?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(ae)}_setJwtHandler(){this._setTokenHandler(ne)}_setTokenHandler(t){const e=`${t}Handler`;this[e]=this[e]||window.sessionStorage;try{this[e].setItem("test","test"),this[e].removeItem("test")}catch(t){this._error(4,`Invalid [${e}]. If not specified, default window.sessionStorage can't be written/read`,t)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(t=""){t&&"string"==typeof t?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:t,writable:!1}):this._error(6,"[path] is required")}_buildPromise(t=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let e={isPending:!0};e.promise=new window.Promise(((s,i)=>{e=Object.assign(e,{resolve:s,reject:i}),this._buildRequest(t)})),this._promise=Object.assign({},e)}return this._promise.promise}_defaultXHR(t=""){let e=new window.XMLHttpRequest;if(e instanceof window.XMLHttpRequest){e.withCredentials=this.withCredentials,e.timeout=1e3*this.timeout,e.onreadystatechange=this._onReadyStateChange.bind(this),e.responseType=this.responseType,e.open(this.method.toUpperCase(),t);let s=this._getRequestHeaders();Object.keys(s).forEach((t=>{this.forceBoundary&&this.multipart&&"Content-Type"===t||e.setRequestHeader(t,s[t])})),e.send(this._buildBody())}return e}_nativeXHR(t=""){let e=this._buildNativeRequest();return e?(e=e[this.method.toLowerCase()],"function"==typeof e?e=e(t,this._buildBody(),this._getRequestHeaders(),this._onRequestSuccess.bind(this),this._onRequestFail.bind(this),this.multipart,1e3*this.timeout):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),e}_buildNativeRequest(){const t=!!window.CellsNativePlugins&&!!window.CellsNativePlugins.Http,e=!!window.cordovaCells&&!!window.cordovaCells.Http;return t?window.CellsNativePlugins.Http:e?window.cordovaCells.Http:null}_buildRequest(t=!1){let e=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const t={url:e,path:this._path,method:this.method};this._emitRequestEvent("start",t)}if(!t&&this._cacheItem&&e===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!t&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:e,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(e);break;case this._NATIVE_XHR:this._request=this._nativeXHR(e)}return this._request}_buildURL(){let t=[this.host,this._path].join("/");if(null!==this.params){let e=Object.assign({},this.params);-1!==t.lastIndexOf("{")&&(t=t.replace(/(\{[\w\-]+\})/g,(t=>{let s=t.replace(/[\{\}]+/g,""),i=e[s];return i?delete e[s]:this._error(9,`Missing ${s} param value`),i})),-1!==t.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let s=Object.keys(e);s.length&&(t=[t,s.map((t=>`${t}=${e[t]}`)).join("&")].join("?"))}return t}_getRequestHeaders(){let t=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(t=this._getTokenForRequestHeaders(ae,t)),!0===this.requiresJWT&&(t=this._getTokenForRequestHeaders(ne,t)),!0===this.semaasMonitoring){let e=this._getSemaasHeaders();Object.assign(t,e)}const e=this._getCustomHeaders();return Object.assign(t,e),t}_getSemaasHeaders(){var t={};if(window.sessionStorage){var e=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(s){var i=e.getItem(s);i&&"null"!==i&&(t[s]=i)}))}return t}_getCustomHeaders(){const t="x-bgadp-";let e={};if(window.sessionStorage){const s=window.sessionStorage;e=Object.keys(s).filter((e=>e.startsWith(t))).reduce(((e,i)=>(e[i.replace(t,"")]=s.getItem(i),e)),{})}return e}_getTokenForRequestHeaders(t,e){const s=`${t}Handler`,i=t===ne?"JWT ":"",n=t===ne?"Authorization":ae;if(void 0===this[s]||null===this[s])this._error(11,`${t} handler is undefined`);else{const a=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):t;let r=this[s].getItem(a);r?e[n]=e[n]||i+r:this._error(12,`Missing '${t}' value`)}return e}_buildBody(){let t=this.body;if(t&&this._xhrType===this._DEFAULT_XHR){let e=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===e){let e=[];Object.keys(t).forEach((s=>{e.push(`${s}=${t[s]}`)})),t=e.join("&")}else this.headers&&-1!==e.indexOf("multipart/form-data")||(t=JSON.stringify(t))}return t}_onReadyStateChange(){let t=this._request;if(t&&t.readyState===window.XMLHttpRequest.DONE)switch(t.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(t);break;default:this._onRequestFail(t)}}_extractRequestResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)e={result:e};else if(e&&e instanceof ArrayBuffer)try{const t=this._decode(e);try{e=JSON.parse(t)}catch(s){e={result:t,originalResponse:e}}}catch(t){e=null}else if(e&&"string"==typeof e)try{e=JSON.parse(e)}catch(t){e=null}return e}async _extractRequestErrorResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)try{const t=await this._blobDecode(e);try{e=JSON.parse(t)}catch(s){e={result:t,originalResponse:e}}}catch(t){e=null}else e=this._extractRequestResponse(t);return e}_blobDecode(t){const e=new FileReader;let s;const i=new Promise(((t,e)=>{s=(s,i)=>{s?e(s):t(i)}}));return e.addEventListener("loadend",(function t(i){e.removeEventListener("loadend",t),i.error?s(i.error):s(null,e.result)})),e.readAsText(t),i}_decode(t){let e;if("function"==typeof TextDecoder){e=new TextDecoder("utf-8").decode(t)}else{let s=0;for(;s<t.length;){let i=t[s],n=0,a=0;if(i<=127?(n=0,a=255&i):i<=223?(n=1,a=31&i):i<=239?(n=2,a=15&i):i<=244&&(n=3,a=7&i),t.length-s-n>0){let e=0;for(;e<n;)i=t[s+e+1],a=a<<6|63&i,e+=1}else a=65533,n=t.length-s;e+=String.fromCodePoint(a),s+=n+1}}return e}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let t=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(t=window.btoa(t)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,t);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,t);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,t);case this._CACHE_NONE:}}catch(t){this._error(13,`Can't write into cache engine: ${t.message}`,t)}}_retrieveFromCache(){let t;try{switch(this._cache){case this._CACHE_MEMORY:t=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:t=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:t=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(t){this._error(14,"Can't read from cache engine",t)}return t&&(this.encodeCache&&(t=window.atob(t)),"string"==typeof t&&/[\{\[]/.test(t.charAt(0))&&(t=JSON.parse(t))),t}_setLastResponse(t=null){t&&(this._lastResponse=Object.assign({},t))}_setLastResponseHeaders(t=null){let e={};t&&(t instanceof window.XMLHttpRequest?e=this._parseResponseHeadersToObject(t.getAllResponseHeaders()):t.headers&&(e=JSON.parse(t.headers))),this._lastResponseHeaders=e}_parseResponseHeadersToObject(t){let e={},s=t.trim().split(/[\r\n]+/);for(const t in s)if(s.hasOwnProperty(t)&&""!==s[t]){let i=": ",n=s[t].split(i);e[n.shift().toLowerCase()]=n.join(i)}return e}_onRequestSuccess(t=null){this._setLastResponse(this._extractRequestResponse(t)),this._setLastResponseHeaders(t),this.jwtHandler&&this._storeToken(this.jwtHandler,t,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,t,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",t)}_storeToken(t,e,s,i){let n=null;switch(this._xhrType){case this._DEFAULT_XHR:e&&e.getAllResponseHeaders&&e.getResponseHeader&&e.getAllResponseHeaders().indexOf(i)>=0&&(n=e.getResponseHeader(i));break;case this._NATIVE_XHR:n=JSON.parse(e.headers)[i]}if(n){const e=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):s;t.getItem(e)!==n&&(t.setItem(e,n),this._emitTokenUpdate(s,n))}}_emitTokenUpdate(t,e){if(this.htmlContext){const s=new CustomEvent("token-update",{bubbles:!0,detail:{type:t,token:e}});this.htmlContext.dispatchEvent(s)}}_emitRequestEvent(t,e){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${t}`,{bubbles:!0,composed:!0,detail:{metadata:e}})):console.warn(`Missing htmlContext to dispatch event http-request-${t}`)}_onRequestFail(t=null){(async()=>{if(!this._isSignatureRequired(t)){let e=await this._extractRequestErrorResponse(t);this._setLastResponse(e),this._setLastResponseHeaders(t),this._onRequestEnd("reject",t)}})()}_onRequestEnd(t="resolve",e=null){if(this._resetDPState(),this.emitRequestEvents){const t={method:this.method,path:this._path};null!==e&&(t.status=e.status,t.url=e.responseURL),this._emitRequestEvent("end",t)}this._promise&&"function"==typeof this._promise[t]&&(this._promise.isPending=!1,this._promise[t](e))}_resetDPState(){["Data","Type","State"].forEach((t=>{let e=`Authentication${t}`;this._headers&&this._headers.hasOwnProperty(e)&&delete this._headers[e],this.headers&&this.headers.hasOwnProperty(e)&&delete this.headers[e]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(t=null){let e,s,i,n;if(t instanceof window.XMLHttpRequest)e=t.getResponseHeader("AuthenticationType"),s=t.getResponseHeader("AuthenticationData"),i=t.getResponseHeader("AuthenticationState"),n=t.getResponseHeader("AuthenticationChallenge");else{let a=JSON.parse(t.headers);e=a.authenticationtype,s=a.authenticationdata,i=a.authenticationstate,n=a.authenticationchallenge}return{type:e,data:s,state:i,challenge:n}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureTypeChange(t,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureValueChange(t,...arguments)}})}_onSignatureTypeChange(t="",e="",s=""){if("string"==typeof t&&""!==t)if(e.includes(t)){if("string"==typeof t&&""!==t){const i=this._getSignatureData(t,e,s);this.headers=Object.assign(this.headers||{},{AuthenticationType:t,AuthenticationData:i}),this._buildRequest()}}else this._error(15,`${t} is not a valid signature type`);"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(t=null,e="",s="",i=""){let n;if("object"==typeof t&&t){n=`${this._getSignatureData(t.signatureType,e,s)}=${t.signatureValue}`,t.challenge&&(n+=`,challenge=${t.challenge}`),this._buildSignatureHeaders(n,t.signatureType,i)}else"string"==typeof t&&""!==t&&(this._hasSignatureAuthenticationType(e,"2")?(n=`password=${t}`,this._buildSignatureHeaders(n,"2",i)):(n=`${s}=${t}`,this._buildSignatureHeaders(n,e,i)));"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_hasSignatureAuthenticationType(t,e){return-1!==t.split(";").findIndex((t=>t===e))}_buildSignatureHeaders(t="",e="",s=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:t,AuthenticationType:e||""}),s&&(this.headers=Object.assign(this.headers,{AuthenticationState:s})),this._buildRequest()}_isSignatureRequired(t=null){const e=Number((t||{}).status);let s=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(e)){const e=this._extractRequestResponse(t),i=this._extractResponseErrorCode(e),n=this._ERROR_CODES.SIGNATURE_INVALID.includes(i),{type:a,data:r,state:o,challenge:c}=this._extractSignatureResponseHeaders(t),l=this._getSignatureMetadata(t);if(n)this._notifySignatureInvalid(l),s=!0;else if(a)if(e){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(i)?(this._notifySignatureTypeUsingErrorCode(i,l,a,r,o,c),s=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response ir rejected.")}else this._notifySignatureTypeUsingHeaders(l,a,r,o,c),s=!0}return s}_notifySignatureRequiredFirstStep(t,e,s,i){this._defineSignatureType(e,s),this._defineSignatureValue(e,s,i),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:e,data:s,metadata:t}}))}_notifySignatureRequired(t,e,s,i,n){this._defineSignatureValue(e,s,i),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:{type:e,data:s,challenge:n,metadata:t}}))}_notifySignatureInvalid(t){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:t}}))}_getSignatureMetadata(t){const{responseURL:e,status:s}=t;return{path:this._path,method:this.method,url:e,status:s}}_emitEvent(t){this.htmlContext?this.htmlContext.dispatchEvent(t):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(t="",e="",s=""){const i=e.split(";").findIndex((e=>e===t));return s.split(";")[i]}toString(t=""){return`[object ${t||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(t=!1){return this._buildPromise(t)}_extractResponseErrorCode(t){return t?t["error-code"]||t.messages&&t.messages[0].code:null}_notifySignatureTypeUsingHeaders(t,e,s,i,n){i?this._notifySignatureRequired(t,e,s,i,n):this._notifySignatureRequiredFirstStep(t,e,s,i)}_notifySignatureTypeUsingErrorCode(t,e,s,i,n,a){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(t)?this._notifySignatureRequiredFirstStep(e,s,i,n):this._notifySignatureRequired(e,s,i,n,a)}},ce=class extends oe{constructor(t=null){super(Object.assign(t||{},{method:"POST"}))}toString(t=""){return super.toString(t||"BGADPRequestPOST")}};class le extends ce{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`api-aggregator/v${this.version}/api-aggregator`)}toString(){return super.toString("BGADPApiAggregatorPostV0")}}let ue=class{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(t,e){if(null===this)throw new TypeError('"this" is null or not defined');let s=Object(this),i=s.length>>>0;if(0===i)return!1;let n=0|e,a=Math.max(n>=0?n:i-Math.abs(n),0);for(;a<i;){if((r=s[a])===(o=t)||"number"==typeof r&&"number"==typeof o&&isNaN(r)&&isNaN(o))return!0;a++}var r,o;return!1}}),String.fromCodePoint||function(t){var e=function(e){for(var s=[],i=0,n="",a=0,r=arguments.length;a!==r;++a){var o=+arguments[a];if(!(o<1114111&&o>>>0===o))throw RangeError("Invalid code point: "+o);o<=65535?i=s.push(o):(o-=65536,i=s.push(55296+(o>>10),o%1024+56320)),i>=16383&&(n+=t.apply(null,s),s.length=0)}return n+t.apply(null,s)};try{Object.defineProperty(String,"fromCodePoint",{value:e,configurable:!0,writable:!0})}catch(t){String.fromCodePoint=e}}(String.fromCharCode)}_error(t=0,e="",s=null){throw t=`0000${t=t.toString()}`.substr(t.length),Error(`BGADP_ERROR_${t} :: ${e} :: ${s&&s.message}`)}},he=class extends ue{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(t="",e=""){if("string"==typeof t&&t)if(this._reservedKeys.includes(t))this._error(2,`"${t}" should NOT be a reserved key`);else{if("string"!=typeof e)try{e=JSON.stringify(e)}catch(t){this._error(1,`"${e}" couldn't be transformed into String`)}e=e.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[t]=e}else this._error(3,"Missing {item} parameter")}getItem(t=""){return this._items[t]?this._items[t]:null}removeItem(t=""){this._items.hasOwnProperty(t)&&delete this._items[t]}clear(){Object.keys(this._items).length&&(this._items={})}};const de="jwt",pe="tsec",me="none";let be=class extends ue{constructor(t=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(t),this._assingSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let t={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(t).forEach((e=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!1,value:t[e],writable:"_headers"!==e})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new he,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this)}_assignConfigValues(t=null){null!=t&&"object"==typeof t&&Object.keys(t).forEach((e=>{if(this.hasOwnProperty(e)&&"_"!==e.charAt(0)&&"function"!=typeof this[e])if("object"==typeof this[e])Array.isArray(t[e])?this[e]=Array.from(t[e]):null===this[e]?this[e]=t[e]:this[e]=Object.assign(this[e]||{},t[e]);else this[e]=t[e];else"signatureRequiredErrors"===e?this._ERROR_CODES.SIGNATURE_REQUIRED=t[e]:"signatureInvalidErrors"===e?this._ERROR_CODES.SIGNATURE_INVALID=t[e]:"signatureFirstErrorCode"===e?this._ERROR_CODES.SIGNATURE_FIRST_STEP=t[e]:"signatureInvalidStatus"===e?this._STATUS_CODES.SIGNATURE_INVALID=t[e]:"getTokenHandlerKey"===e?this.getTokenHandlerKey=t[e]:("function"==typeof this[e]&&this._error(1,`${e} is a class method, can't be override`),"_"===e.charAt(0)&&this._error(2,`"${e}" is a restricted property, can't be override`),this.hasOwnProperty(e)||this._error(3,`"${e}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assingSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=pe:this.requiredToken=me,this.requiresJWT=!1):this.requiredToken===pe?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===de?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===me?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(pe)}_setJwtHandler(){this._setTokenHandler(de)}_setTokenHandler(t){const e=`${t}Handler`;this[e]=this[e]||window.sessionStorage;try{this[e].setItem("test","test"),this[e].removeItem("test")}catch(t){this._error(4,`Invalid [${e}]. If not specified, default window.sessionStorage can't be written/read`,t)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(t=""){t&&"string"==typeof t?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:t,writable:!1}):this._error(6,"[path] is required")}_buildPromise(t=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let e={isPending:!0};e.promise=new window.Promise(((s,i)=>{e=Object.assign(e,{resolve:s,reject:i}),this._buildRequest(t)})),this._promise=Object.assign({},e)}return this._promise.promise}_defaultXHR(t=""){let e=new window.XMLHttpRequest;if(e instanceof window.XMLHttpRequest){e.withCredentials=this.withCredentials,e.timeout=1e3*this.timeout,e.onreadystatechange=this._onReadyStateChange.bind(this),e.responseType=this.responseType,e.open(this.method.toUpperCase(),t);let s=this._getRequestHeaders();Object.keys(s).forEach((t=>{this.forceBoundary&&this.multipart&&"Content-Type"===t||e.setRequestHeader(t,s[t])})),e.send(this._buildBody())}return e}_nativeXHR(t=""){let e=this._buildNativeRequest();return e?(e=e[this.method.toLowerCase()],"function"==typeof e?e=e(t,this._buildBody(),this._getRequestHeaders(),this._onRequestSuccess.bind(this),this._onRequestFail.bind(this),this.multipart,1e3*this.timeout):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),e}_buildNativeRequest(){const t=!!window.CellsNativePlugins&&!!window.CellsNativePlugins.Http,e=!!window.cordovaCells&&!!window.cordovaCells.Http;return t?window.CellsNativePlugins.Http:e?window.cordovaCells.Http:null}_buildRequest(t=!1){let e=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const t={url:e,path:this._path,method:this.method};this._emitRequestEvent("start",t)}if(!t&&this._cacheItem&&e===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!t&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:e,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(e);break;case this._NATIVE_XHR:this._request=this._nativeXHR(e)}return this._request}_buildURL(){let t=[this.host,this._path].join("/");if(null!==this.params){let e=Object.assign({},this.params);-1!==t.lastIndexOf("{")&&(t=t.replace(/(\{[\w\-]+\})/g,(t=>{let s=t.replace(/[\{\}]+/g,""),i=e[s];return i?delete e[s]:this._error(9,`Missing ${s} param value`),i})),-1!==t.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let s=Object.keys(e);s.length&&(t=[t,s.map((t=>`${t}=${e[t]}`)).join("&")].join("?"))}return t}_getRequestHeaders(){let t=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(t=this._getTokenForRequestHeaders(pe,t)),!0===this.requiresJWT&&(t=this._getTokenForRequestHeaders(de,t)),!0===this.semaasMonitoring){let e=this._getSemaasHeaders();Object.assign(t,e)}const e=this._getCustomHeaders();return Object.assign(t,e),t}_getSemaasHeaders(){var t={};if(window.sessionStorage){var e=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(s){var i=e.getItem(s);i&&"null"!==i&&(t[s]=i)}))}return t}_getCustomHeaders(){const t="x-bgadp-";let e={};if(window.sessionStorage){const s=window.sessionStorage;e=Object.keys(s).filter((e=>e.startsWith(t))).reduce(((e,i)=>(e[i.replace(t,"")]=s.getItem(i),e)),{})}return e}_getTokenForRequestHeaders(t,e){const s=`${t}Handler`,i=t===de?"JWT ":"",n=t===de?"Authorization":pe;if(void 0===this[s]||null===this[s])this._error(11,`${t} handler is undefined`);else{const a=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):t;let r=this[s].getItem(a);r?e[n]=e[n]||i+r:this._error(12,`Missing '${t}' value`)}return e}_buildBody(){let t=this.body;if(t&&this._xhrType===this._DEFAULT_XHR){let e=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===e){let e=[];Object.keys(t).forEach((s=>{e.push(`${s}=${t[s]}`)})),t=e.join("&")}else this.headers&&-1!==e.indexOf("multipart/form-data")||(t=JSON.stringify(t))}return t}_onReadyStateChange(){let t=this._request;if(t&&t.readyState===window.XMLHttpRequest.DONE)switch(t.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(t);break;default:this._onRequestFail(t)}}_extractRequestResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)e={result:e};else if(e&&e instanceof ArrayBuffer)try{const t=this._decode(e);try{e=JSON.parse(t)}catch(s){e={result:t,originalResponse:e}}}catch(t){e=null}else if(e&&"string"==typeof e)try{e=JSON.parse(e)}catch(t){e=null}return e}async _extractRequestErrorResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)try{const t=await this._blobDecode(e);try{e=JSON.parse(t)}catch(s){e={result:t,originalResponse:e}}}catch(t){e=null}else e=this._extractRequestResponse(t);return e}_blobDecode(t){const e=new FileReader;let s;const i=new Promise(((t,e)=>{s=(s,i)=>{s?e(s):t(i)}}));return e.addEventListener("loadend",(function t(i){e.removeEventListener("loadend",t),i.error?s(i.error):s(null,e.result)})),e.readAsText(t),i}_decode(t){let e;if("function"==typeof TextDecoder){e=new TextDecoder("utf-8").decode(t)}else{let s=0;for(;s<t.length;){let i=t[s],n=0,a=0;if(i<=127?(n=0,a=255&i):i<=223?(n=1,a=31&i):i<=239?(n=2,a=15&i):i<=244&&(n=3,a=7&i),t.length-s-n>0){let e=0;for(;e<n;)i=t[s+e+1],a=a<<6|63&i,e+=1}else a=65533,n=t.length-s;e+=String.fromCodePoint(a),s+=n+1}}return e}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let t=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(t=window.btoa(t)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,t);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,t);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,t);case this._CACHE_NONE:}}catch(t){this._error(13,`Can't write into cache engine: ${t.message}`,t)}}_retrieveFromCache(){let t;try{switch(this._cache){case this._CACHE_MEMORY:t=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:t=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:t=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(t){this._error(14,"Can't read from cache engine",t)}return t&&(this.encodeCache&&(t=window.atob(t)),"string"==typeof t&&/[\{\[]/.test(t.charAt(0))&&(t=JSON.parse(t))),t}_setLastResponse(t=null){t&&(this._lastResponse=Object.assign({},t))}_setLastResponseHeaders(t=null){let e={};t&&(t instanceof window.XMLHttpRequest?e=this._parseResponseHeadersToObject(t.getAllResponseHeaders()):t.headers&&(e=JSON.parse(t.headers))),this._lastResponseHeaders=e}_parseResponseHeadersToObject(t){let e={},s=t.trim().split(/[\r\n]+/);for(const t in s)if(s.hasOwnProperty(t)&&""!==s[t]){let i=": ",n=s[t].split(i);e[n.shift().toLowerCase()]=n.join(i)}return e}_onRequestSuccess(t=null){this._setLastResponse(this._extractRequestResponse(t)),this._setLastResponseHeaders(t),this.jwtHandler&&this._storeToken(this.jwtHandler,t,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,t,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",t)}_storeToken(t,e,s,i){let n=null;switch(this._xhrType){case this._DEFAULT_XHR:e&&e.getAllResponseHeaders&&e.getResponseHeader&&e.getAllResponseHeaders().indexOf(i)>=0&&(n=e.getResponseHeader(i));break;case this._NATIVE_XHR:n=JSON.parse(e.headers)[i]}if(n){const e=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):s;t.getItem(e)!==n&&(t.setItem(e,n),this._emitTokenUpdate(s,n))}}_emitTokenUpdate(t,e){if(this.htmlContext){const s=new CustomEvent("token-update",{bubbles:!0,detail:{type:t,token:e}});this.htmlContext.dispatchEvent(s)}}_emitRequestEvent(t,e){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${t}`,{bubbles:!0,composed:!0,detail:{metadata:e}})):console.warn(`Missing htmlContext to dispatch event http-request-${t}`)}_onRequestFail(t=null){(async()=>{if(!this._isSignatureRequired(t)){let e=await this._extractRequestErrorResponse(t);this._setLastResponse(e),this._setLastResponseHeaders(t),this._onRequestEnd("reject",t)}})()}_onRequestEnd(t="resolve",e=null){if(this._resetDPState(),this.emitRequestEvents){const t={method:this.method,path:this._path};null!==e&&(t.status=e.status,t.url=e.responseURL),this._emitRequestEvent("end",t)}this._promise&&"function"==typeof this._promise[t]&&(this._promise.isPending=!1,this._promise[t](e))}_resetDPState(){["Data","Type","State"].forEach((t=>{let e=`Authentication${t}`;this._headers&&this._headers.hasOwnProperty(e)&&delete this._headers[e],this.headers&&this.headers.hasOwnProperty(e)&&delete this.headers[e]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(t=null){let e,s,i,n;if(t instanceof window.XMLHttpRequest)e=t.getResponseHeader("AuthenticationType"),s=t.getResponseHeader("AuthenticationData"),i=t.getResponseHeader("AuthenticationState"),n=t.getResponseHeader("AuthenticationChallenge");else{let a=JSON.parse(t.headers);e=a.authenticationtype,s=a.authenticationdata,i=a.authenticationstate,n=a.authenticationchallenge}return{type:e,data:s,state:i,challenge:n}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureTypeChange(t,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureValueChange(t,...arguments)}})}_onSignatureTypeChange(t="",e="",s=""){if("string"==typeof t&&""!==t)if(e.includes(t)){if("string"==typeof t&&""!==t){const i=this._getSignatureData(t,e,s);this.headers=Object.assign(this.headers||{},{AuthenticationType:t,AuthenticationData:i}),this._buildRequest()}}else this._error(15,`${t} is not a valid signature type`);"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(t=null,e="",s="",i=""){let n;if("object"==typeof t&&t){n=`${this._getSignatureData(t.signatureType,e,s)}=${t.signatureValue}`,t.challenge&&(n+=`,challenge=${t.challenge}`),this._buildSignatureHeaders(n,t.signatureType,i)}else"string"==typeof t&&""!==t&&(this._hasSignatureAuthenticationType(e,"2")?(n=`password=${t}`,this._buildSignatureHeaders(n,"2",i)):(n=`${s}=${t}`,this._buildSignatureHeaders(n,e,i)));"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_hasSignatureAuthenticationType(t,e){return-1!==t.split(";").findIndex((t=>t===e))}_buildSignatureHeaders(t="",e="",s=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:t,AuthenticationType:e||""}),s&&(this.headers=Object.assign(this.headers,{AuthenticationState:s})),this._buildRequest()}_isSignatureRequired(t=null){const e=Number((t||{}).status);let s=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(e)){const e=this._extractRequestResponse(t),i=this._extractResponseErrorCode(e),n=this._ERROR_CODES.SIGNATURE_INVALID.includes(i),{type:a,data:r,state:o,challenge:c}=this._extractSignatureResponseHeaders(t),l=this._getSignatureMetadata(t);if(n)this._notifySignatureInvalid(l),s=!0;else if(a)if(e){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(i)?(this._notifySignatureTypeUsingErrorCode(i,l,a,r,o,c),s=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response ir rejected.")}else this._notifySignatureTypeUsingHeaders(l,a,r,o,c),s=!0}return s}_notifySignatureRequiredFirstStep(t,e,s,i){this._defineSignatureType(e,s),this._defineSignatureValue(e,s,i),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:e,data:s,metadata:t}}))}_notifySignatureRequired(t,e,s,i,n){this._defineSignatureValue(e,s,i),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:{type:e,data:s,challenge:n,metadata:t}}))}_notifySignatureInvalid(t){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:t}}))}_getSignatureMetadata(t){const{responseURL:e,status:s}=t;return{path:this._path,method:this.method,url:e,status:s}}_emitEvent(t){this.htmlContext?this.htmlContext.dispatchEvent(t):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(t="",e="",s=""){const i=e.split(";").findIndex((e=>e===t));return s.split(";")[i]}toString(t=""){return`[object ${t||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(t=!1){return this._buildPromise(t)}_extractResponseErrorCode(t){return t?t["error-code"]||t.messages&&t.messages[0].code:null}_notifySignatureTypeUsingHeaders(t,e,s,i,n){i?this._notifySignatureRequired(t,e,s,i,n):this._notifySignatureRequiredFirstStep(t,e,s,i)}_notifySignatureTypeUsingErrorCode(t,e,s,i,n,a){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(t)?this._notifySignatureRequiredFirstStep(e,s,i,n):this._notifySignatureRequired(e,s,i,n,a)}},ge=class extends be{constructor(t=null){super(Object.assign(t||{},{method:"GET"}))}toString(t=""){return super.toString(t||"BGADPRequestGET")}};class ve extends ge{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/holds/balances`)}toString(){return super.toString("BGADPPeAccountsAccountsAccountHoldsBalancesGetV0")}}class _e extends(e(s)){static get is(){return"bbva-dataprovider-accounts"}static get properties(){return{productId:{type:String},services:{type:Object},_bgadpNotExistMessage:{type:String},accounts:{type:Object},_accountsBalance:{type:Object},_accountsBalanceCommon:{type:Object},_accountsBalanceCurrency:{type:Object},account:{type:Object},accountId:{type:String},customizedFormatId:{type:String},transactionId:{type:String},accountTypes:{type:Array},transactions:{type:Array},transactionDetail:{type:Object},indicators:{type:Array},holdId:{type:String},holds:{type:Array},participants:{type:Array},holdsBalances:{type:Object},hold:{type:Array},customizedFormats:{type:Array},offerSimulate:{type:Object},createdAccount:{type:Object},accountsApiVersion:{type:String},apiAggregatorApiVersion:{type:String},callsMatch:{type:Array},accountFinancialStatements:{type:Array},loadPagesUntilEmptyPage:{type:Boolean},emptyPageReached:{type:Boolean},emptyLastResponse:{type:Boolean},nextPageIsNeeded:{type:Boolean},accountsDocumentationDossiers:{type:Object},apiErrorsEvents:{type:Object}}}constructor(){super(),this.native=!1,this.requiredToken="tsec",this._bgadpNotExistMessage="BGADP called not exist",this.requiredOTP=!0,this.apiErrorsEvents={403:{0:"signature-invalid-for-user",61:"tsec-invalid",68:"tsec-expired",69:"tsec-cancelled",161:"wrong-access-key",162:"user-blocked",164:"user-blocked-cause-retrials",168:"wrong-otp-sms",362:"signature-expired-error",363:"signature-attempts-error",398:"signature-invalid-soft-token-error",519:"signature-unsuccessful-validation-error",576:"signature-locked-credentials-error",forbidden:"forbidden"},428:{PRECONDITION_REQUIRED:"signature-required"},400:{invalidCredentials:"signature-invalid-soft-token-error",INVALID_DEPOSIT_LIQUIDATION_TYPE:"invalid-deposit-liquidation-type"},401:{154:"otp-not-found",168:"wrong-otp",70:"signature-not-found-error",stateChangeGoOn:"stateChangeGoOn",unauthorized:"tsec-expired"},409:{aliasAlreadyExists:"alias-already-exists-error",MobilephoneNumberIsNotAssociatedtoSMSKey:"signature-not-available-error",399:"signature-no-authentication-soft-token-error",402:"signature-blocked-soft-token-error",errorValidationFraudZoneBioCatch:"error-biocatch",errorValidationGrayZoneBioCatch:"error-biocatch"},500:{402:"signature-blocked-soft-token-error"}},this.services={BGADPAccountsAccountTransactionsGetV0:Kt,BGADPApiAggregatorPostV0:le,BGADPAccountsGetV0:It,BGADPAccountsBalancesGetV0:Zt,BGADPAccountsAccountGetV0:qt,BGADPAccountsAccountCurrentBalancesGetV0:jt,BGADPAccountsAccountLimitsGetV0:Xt,BGADPAccountsAccountIndicatorsGetV0:Ut,BGADPAccountsAccountFinancialStatementsGetV0:Vt,BGADPAccountsAccountFinancialStatementsFinancialStatementGetV0:Gt,BGADPAccountsAccountTransactionsTransactionGetV0:Jt,BGADPAccountsAccountCustomizedFormatsGetV0:Lt,BGADPAccountsAccountTypesGetV0:Yt,BGADPAccountsAccountPatchV0:Ht,BGADPAccountsAccountHoldsGetV0:Mt,BGADPAccountsAccountParticipantsGetV0:Qt,BGADPPeAccountsAccountsAccountHoldsBalancesGetV0:ve,BGADPAccountsAccountHoldsHoldGetV0:zt,BGADPAccountsAccountCustomizedFormatsCustomizedFormatPutV0:Bt,BGADPAccountsAccountCustomizedFormatsCustomizedFormatDeleteV0:Ft,BGADPAccountsOffersOfferSimulatePostV0:ee,BGADPAccountsPostV0:kt,BGADPAccountsAccountCancellationsPostV0:Nt,BGADPAccountsDocumentationDossiersGetV0:te,BGADPAccountsAccountRelatedContractsGetV0:Wt,BGADPAccountsGetV1:S,BGADPAccountsAccountParticipantsGetV1:i},this.accountsApiVersion="0",this.apiAggregatorApiVersion="0",this.callsMatch=["items","balances","balancesCommon","balancesCurrency"],this.loadPagesUntilEmptyPage=!1,this.emptyPageReached=!1,this.emptyLastResponse=!1,this.nextPageIsNeeded=!1}getFullAccounts(t){const e=this._getCalls(t),s=_e._generateBody(e),i=this._getServiceParams(this.params,s);i.version=this.apiAggregatorApiVersion,delete i.paramArrayMode;const n=this._getService("BGADPApiAggregatorPost",i,this.apiAggregatorApiVersion);this.addEventListener("success-on-get-full-accounts",(t=>{t.stopPropagation(),this.accounts=this._parseFullAccounts(this._parseResponse(n.getLastResponse())),this._dispatchEvent("accounts-changed",this.accounts)})),this._generateGetService(n,{customEvent:"success-on-get-full-accounts",errorFireEventHandler:"error-on-get-full-accounts"})}getAllAccounts(t,e=[]){const s=this._getServiceParams(t),i=this._getService("BGADPAccountsGet",s);this.addEventListener("success-on-get-accounts",(s=>{s.stopPropagation();const n=(this._parseResponse(i.getLastResponse())||[]).concat(e);if(this.nextKey){const e=Object.assign(t||{},{paginationKey:this.nextKey});this.getAllAccounts(e,n)}else this.accounts=n,this._dispatchEvent("accounts-changed",this.accounts),this._dispatchEvent("set-accounts",n)})),this._generateGetService(i,{customEvent:"success-on-get-accounts",errorFireEventHandler:"error-on-get-accounts"})}getAccounts(){this.version=this.accountsApiVersion;const t=this._getServiceParams(),e=this._getService("BGADPAccountsGet",t);this._generateGetService(e,{customEvent:"set-accounts",errorFireEventHandler:"error-on-get-accounts"})}getAccountsBalances(){const t=this._getServiceParams(),e=this._getService("BGADPAccountsBalancesGet",t);this.addEventListener("success-on-get-account-balances",(t=>{t.stopPropagation(),this._accountsBalance=this._parseResponse(e.getLastResponse())})),this._generateGetService(e,{customEvent:"success-on-get-account-balances",errorFireEventHandler:"error-on-get-account-balances"})}getAccountsBalancesCommon(){const t=this._getServiceParams({"accountType.id":"COMMON_ACCOUNT"}),e=this._getService("BGADPAccountsBalancesGet",t);this.addEventListener("success-on-get-account-balances-common",(t=>{t.stopPropagation(),this._accountsBalanceCommon=this._parseResponse(e.getLastResponse())})),this._generateGetService(e,{customEvent:"success-on-get-account-balances-common",errorFireEventHandler:"error-on-get-account-balances-common"})}getAccountsBalancesCurrency(){const t=this._getServiceParams({"accountType.id":"CURRENCY_ACCOUNT"}),e=this._getService("BGADPAccountsBalancesGet",t);this.addEventListener("success-on-get-account-balances-currency",(t=>{t.stopPropagation(),this._accountsBalanceCurrency=this._parseResponse(e.getLastResponse())})),this._generateGetService(e,{customEvent:"success-on-get-account-balances-currency",errorFireEventHandler:"error-on-get-account-balances-currency"})}getAccount(t){const e={"account-id":this.accountId},s=this._getServiceParams(t?{...e,params:t}:e),i=this._getService("BGADPAccountsAccountGet",s);this.addEventListener("get-on-get-account",(t=>{t.stopPropagation(),this.account=this._parseResponse(i.getLastResponse()),this._dispatchEvent("account-changed",this.account)})),this._generateGetService(i,{customEvent:"get-on-get-account",errorFireEventHandler:"error-on-get-account"})}getAccountCurrentBalances(t){const e=this._getServiceParams({"account-id":this.accountId,...t}),s=this._getService("BGADPAccountsAccountCurrentBalancesGet",e);this.addEventListener("success-on-get-account-current-balances",(t=>{t.stopPropagation(),this.currentBalances=this._parseResponse(s.getLastResponse())})),this._generateGetService(s,{customEvent:"success-on-get-account-current-balances",errorFireEventHandler:"error-on-get-account-current-balances"})}getAccountLimits(t){const e=this._getServiceParams({"account-id":this.accountId,...t}),s=this._getService("BGADPAccountsAccountLimitsGet",e);this.addEventListener("success-on-get-account-limits",(t=>{t.stopPropagation(),this.limits=this._parseResponse(s.getLastResponse())})),this._generateGetService(s,{customEvent:"success-on-get-account-limits",errorFireEventHandler:"error-on-get-account-limits"})}getAccountIndicators(t){const e=this._getServiceParams({"account-id":this.accountId,...t}),s=this._getService("BGADPAccountsAccountIndicatorsGet",e);this.addEventListener("success-on-get-account-indicators",(t=>{t.stopPropagation(),this.indicators=this._parseResponse(s.getLastResponse()),this._dispatchEvent("indicators-changed",this.indicators)})),this._generateGetService(s,{customEvent:"success-on-get-account-indicators",errorFireEventHandler:"error-on-get-account-indicators"})}getAccountFinancialStatements(t){const e=this._getServiceParams({"account-id":t||this.accountId}),s=this._getService("BGADPAccountsAccountFinancialStatementsGet",e);this._generateGetService(s,{customEvent:"set-account-financial-statements",errorFireEventHandler:"error-on-get-account-financial-statements"})}getAccountFinancialStatementPdf(t){const e=this._getServiceParams(t);e.headers={...this.headers,"Content-Type":"application/pdf",Accept:"*/*"};const s=this._getService("BGADPAccountsAccountFinancialStatementsFinancialStatementGet",e);this._generateGetService(s,{customEvent:"set-account-financial-statement-pdf",errorFireEventHandler:"error-on-get-account-financial-statement-pdf"})}getAccountFinancialStatementPdfUrl(t){const e=this._getServiceParams(t);e.headers={...this.headers,"Content-Type":"application/pdf",Accept:"application/json"};const s=this._getService("BGADPAccountsAccountFinancialStatementsFinancialStatementGet",e);this._generateGetService(s,{customEvent:"set-account-financial-statement-pdf-url",errorFireEventHandler:"error-on-get-account-financial-statement-pdf-url"})}getTransactions(t){const e=this._getServiceParams({...t,"account-id":this.accountId}),s=this._getService("BGADPAccountsAccountTransactionsGet",e);this.addEventListener("success-on-get-transactions",(t=>{t.stopPropagation();const e=this._parseResponse(s.getLastResponse())||[];this.nextPageIsNeeded&&this._dispatchEvent("empty-next-page",!!this.nextKey),this.emptyLastResponse&&0===e.length?this._onEmptyPageReached():(this.transactions=e,this._dispatchEvent("transactions-changed",this.transactions),this._dispatchEvent("set-account-transactions",e))})),this._generateGetService(s,{customEvent:"success-on-get-transactions",errorFireEventHandler:"error-on-get-transactions"})}getMoreTransactions(t){this.page&&(this.pagination||{}).page===this.page||this._generatePagination(this.pagination||{page:0}),this._checkEmptyPageReached();const e=this.loadPagesUntilEmptyPage||this.page<=this.totalPages;if(!this.emptyPageReached&&this.pagination&&e&&this.nextKey){this._dispatchEvent("get-more-data");const e=Object.assign(t||{},{expand:`&paginationKey=${this.nextKey}`});this.getTransactions(e)}}getTransactionDetail(){const t=this._getServiceParams({"account-id":this.accountId,"transaction-id":this.transactionId}),e=this._getService("BGADPAccountsAccountTransactionsTransactionGet",t);this.addEventListener("success-on-get-account-transaction-detail",(t=>{t.stopPropagation();const s=this._parseResponse(e.getLastResponse())||{};s.operations=[{label:"cells-successful-response-account-detail-share",id:"share",icon:"coronita:share",operative:"TRANSFER_DEBIT"===(s.transactionType||{}).id?"accountDebitDetail":"accountBasicDetail"}],this.transactionDetail=s,this._dispatchEvent("transaction-detail-changed",this.transactionDetail),this._dispatchEvent("set-account-transaction-detail",s)})),this._generateGetService(e,{customEvent:"success-on-get-account-transaction-detail",errorFireEventHandler:"error-on-get-account-transaction-detail"})}getAccountCustomizedFormats(t){const e=this._getServiceParams({...t,"account-id":this.accountId}),s=this._getService("BGADPAccountsAccountCustomizedFormatsGet",e);this.addEventListener("success-on-get-account-customized-formats",(t=>{t.stopPropagation();const e=this._parseResponse(s.getLastResponse());this.customizedFormats=e,this._dispatchEvent("customized-formats-changed",this.customizedFormats)})),this._generateGetService(s,{customEvent:"success-on-get-account-customized-formats",errorFireEventHandler:"error-on-get-account-customized-formats"})}getAccountTypes(){const t=this._getServiceParams(),e=this._getService("BGADPAccountsAccountTypesGet",t);this.addEventListener("success-on-get-account-types",(t=>{t.stopPropagation();const s=this._parseResponse(e.getLastResponse());this.accountTypes=s,this._dispatchEvent("account-types-changed",this.accountTypes)})),this._generateGetService(e,{customEvent:"success-on-get-account-types",errorFireEventHandler:"error-on-get-account-types"})}patchAccountAlias(t){const e={"account-id":this.accountId},s={alias:t},i=this._getServiceParams(e,s),n=this._getService("BGADPAccountsAccountPatch",i);this.addEventListener("success-on-patch-account",(e=>{e.stopPropagation();const s=this._parseResponse(n.getLastResponse());this.account=s,this._dispatchEvent("account-changed",this.account),this._dispatchEvent("patch-alias",t),this._dispatchEvent("patch-account",s)})),this._generateGetService(n,{customEvent:"success-on-patch-account",errorFireEventHandler:"error-on-patch-account"})}getAccountHolds(t){const e=this._getServiceParams({...t,"account-id":this.accountId}),s=this._getService("BGADPAccountsAccountHoldsGet",e);this.addEventListener("success-on-get-holds",(t=>{t.stopPropagation();const e=this._parseResponse(s.getLastResponse())||[];this.holds=e,this._dispatchEvent("holds-changed",this.holds),this._dispatchEvent("set-account-holds",e)})),this._generateGetService(s,{customEvent:"success-on-get-holds",errorFireEventHandler:"error-on-get-holds"})}getAccountParticipants(t){this.version=this.accountsApiVersion;const e=this._getServiceParams({...t,"account-id":this.accountId}),s=this._getService("BGADPAccountsAccountParticipantsGet",e);this.addEventListener("success-on-get-participants",(t=>{t.stopPropagation();const e=this._parseResponse(s.getLastResponse())||[];this.participants=e,this._dispatchEvent("participants-changed",this.participants),this._dispatchEvent("set-account-participants",e)})),this._generateGetService(s,{customEvent:"success-on-get-participants",errorFireEventHandler:"error-on-get-participants"})}getAccountHoldsBalances(t){const e=this._getServiceParams({...t,"account-id":this.accountId});delete e.paramArrayMode;const s=this._getService("BGADPPeAccountsAccountsAccountHoldsBalancesGet",e);this.addEventListener("success-on-get-holds-balances",(t=>{t.stopPropagation();const e=this._parseResponse(s.getLastResponse())||{};this.holdsBalances=e,this._dispatchEvent("holds-balances-changed",this.holdsBalances),this._dispatchEvent("set-account-holds-balances",e)})),this._generateGetService(s,{customEvent:"success-on-get-holds-balances",errorFireEventHandler:"error-on-get-holds-balances"})}getAccountHold(t){const e=this._getServiceParams({...t,"account-id":this.accountId,"hold-id":this.holdId}),s=this._getService("BGADPAccountsAccountHoldsHoldGet",e);this.addEventListener("success-on-get-hold",(t=>{t.stopPropagation();const e=this._parseResponse(s.getLastResponse());this.hold=e,this._dispatchEvent("hold-changed",this.hold),this._dispatchEvent("set-account-hold",e)})),this._generateGetService(s,{customEvent:"success-on-get-hold",errorFireEventHandler:"error-on-get-hold"})}putAccountCustomizedFormat(t){const e={"account-id":this.accountId,"customized-format-id":this.customizedFormatId||"SIMPLE_ACCOUNT"},s={value:t},i=this._getServiceParams(e,s),n=this._getService("BGADPAccountsAccountCustomizedFormatsCustomizedFormatPut",i);this.addEventListener("success-on-put-account",(t=>{t.stopPropagation(),this.customizedFormats=[],this._dispatchEvent("customized-formats-changed",this.customizedFormats),this.getAccountCustomizedFormats();const e=this._parseResponse(n.getLastResponse());this._dispatchEvent("cells-account-simple-changed",e)})),this._generateGetService(n,{customEvent:"success-on-put-account",errorFireEventHandler:"error-on-put-account"})}linkAccountSPEI(t){const e={"account-id":this.accountId,"customized-format-id":"SPEI"},s={value:t},i=this._getServiceParams(e,s),n=this._getService("BGADPAccountsAccountCustomizedFormatsCustomizedFormatPut",i);this.addEventListener("cells-account-spei-link-success-event",(t=>{t.stopPropagation(),this.customizedFormats=[],this._dispatchEvent("customized-formats-changed",this.customizedFormats),this.getAccountCustomizedFormats();const e=this._parseResponse(n.getLastResponse());this._dispatchEvent("cells-account-spei-link-success",e)})),this._generateGetService(n,{customEvent:"cells-account-spei-link-success-event",errorFireEventHandler:"cells-account-spei-link-error"})}unlinkAccountSPEI(){const t={"account-id":this.accountId,"customized-format-id":"SPEI"},e=this._getServiceParams(t),s=this._getService("BGADPAccountsAccountCustomizedFormatsCustomizedFormatDelete",e);this.addEventListener("cells-account-spei-unlink-success-event",(t=>{t.stopPropagation(),this.customizedFormats=[],this._dispatchEvent("customized-formats-changed",this.customizedFormats),this.getAccountCustomizedFormats();const e=this._parseResponse(s.getLastResponse());this._dispatchEvent("cells-account-spei-unlink-success",e)})),this._generateGetService(s,{customEvent:"cells-account-spei-unlink-success-event",errorFireEventHandler:"cells-account-spei-unlink-error"})}getOfferSimulation({offerId:t,productId:e,currency:s,subproductId:i}={}){const n={details:{product:{id:e}}};s&&(n.details.product.currencies=[{currency:s}]),i&&(n.details.product.subproduct={id:i});const a={"offer-id":t};this.version=this.accountsApiVersion;const r=this._getServiceParams(a,n),o=this._getService("BGADPAccountsOffersOfferSimulatePost",r);this.addEventListener("success-on-get-account-offer-simulation",(t=>{t.stopPropagation();const e=this._parseResponse(o.getLastResponse());this.offerSimulate=e,this._dispatchEvent("offer-simulate-changed",this.offerSimulate),this._dispatchEvent("set-account-offer-simulation",e)})),this._generateGetService(o,{customEvent:"success-on-get-account-offer-simulation",errorFireEventHandler:"error-on-get-account-offer-simulation"})}postAccounts(t){this.version=this.accountsApiVersion;const e=this._getServiceParams(this.params,t),s=this._getService("BGADPAccountsPost",e);this.addEventListener("success-on-post-accounts-accounts",(t=>{t.stopPropagation();const e=this._parseResponse(s.getLastResponse());this.createdAccount=e,this._dispatchEvent("created-account-changed",this.createdAccount),this._dispatchEvent("set-accounts-accounts",e)})),this._generateGetService(s,{customEvent:"success-on-post-accounts-accounts",errorFireEventHandler:"error-on-post-accounts-accounts"})}_handleError(t,e){return s=>{400!==s.status&&404!==s.status?this._handleApiErrorAndFireSeverityError(s,t):(this._dispatchEvent(t,this._extractError(s,e)),this._dispatchEvent("api-dm-response-error"))}}_handleApiErrorAndFireSeverityError(t,e){if(!this._handleErrorSeverity(t)){const s=_e._extractResponse(null==t?void 0:t.response).severity||"default";this._fireErrorEvent(`${e}-${s.toLowerCase()}`,t)}this._generateErrorFireEventHandler(e)(t)}_generateErrorFireEventHandler(t){return e=>{this._handleErrorSeverity(e)||this._fireErrorEvent(t,e)}}_handleErrorSeverity(t){let e=!1;const s=(null==t?void 0:t.response)||(null==t?void 0:t.responseBody);if(s){const i=_e._extractResponse(s);if(i){const s=Number(i["http-status"])||Number(t.status)||0,n=Number(i["error-code"])||(i.result||{}).code||i["error-code"]||0;e=this._dispatchErrorEvents(s,n,i,t)}}return e}_dispatchErrorEvents(t,e,s,i){let n=!1;if(this.apiErrorsEvents[t][e]){const a=_e._isOTPAvailable(s);428!==t||a?403===t&&"forbidden"===this.apiErrorsEvents[t][e]?(this._fireErrorEvent("forbidden"),this._fireErrorEvent("forbidden-softoken-enrollment")):401===t&&"stateChangeGoOn"===this.apiErrorsEvents[t][e]?this._fireErrorEvent("error-softtoken-status"):this._fireErrorEvent(this.apiErrorsEvents[t][e],i):this._fireErrorEvent("otp-not-available-error"),n=!0}return n}static _isOTPAvailable(t){return(t.data||{}).token}_fireErrorEvent(t,e){const s=_e._extractResponse(null==e?void 0:e.response),i={errorType:t,otpId:this.otpId,status:null==e?void 0:e.status};this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:Object.assign(s,i)}))}static _extractResponse(t){try{return JSON.parse(t)}catch(t){return{}}}postAccountsCancellations(t,e={}){const s=this._getServiceParams(e,t),i=this._getService("BGADPAccountsAccountCancellationsPost",s);this.addEventListener("success-on-post-accounts",(t=>{t.stopPropagation();const e=this._parseResponse(i.getLastResponse());this._dispatchEvent("cancel-account-response",e)})),this._generateGetService(i,{customEvent:"success-on-post-accounts",errorFireEventHandler:"error-on-post-accounts"})}getAccountsDocumentationDossiers(t={}){const e=this._getServiceParams(t),s=this._getService("BGADPAccountsDocumentationDossiersGet",e);this.addEventListener("success-on-get-accounts-documentation-dossiers",(t=>{t.stopPropagation();const e={...s.getLastResponse()};this.accountsDocumentationDossiers=e,this._dispatchEvent("accounts-documentation-dossiers-changed",this.accountsDocumentationDossiers),this._dispatchEvent("set-accounts-documentation-dossiers",e)})),this._generateGetService(s,{customEvent:"success-on-get-accounts-documentation-dossiers",errorFireEventHandler:"error-on-get-accounts-documentation-dossiers"})}getRelatedContracts(t){const e=this._getServiceParams({...t,"account-id":this.accountId}),s=this._getService("BGADPAccountsAccountRelatedContractsGet",e);this.addEventListener("success-event-on-get-related-contracts",(t=>{t.stopPropagation();const e=this._parseResponse(s.getLastResponse());this.account=e,this._dispatchEvent("account-changed",this.account),this._dispatchEvent("success-on-get-related-contracts",e)})),this._generateGetService(s,{customEvent:"success-event-on-get-related-contracts",errorFireEventHandler:"error-on-get-related-contracts"})}_getService(t,e,s=this.version){return new this.services[`${t}V${s}`](e)}_getToken(){return window.sessionStorage.getItem(this.requiredToken)}_getCalls(t){const e=this._getToken();let s=[];const i={accounts_simple:{endPoint:`/accounts/v${this.version}/accounts`},accounts_extended:{endPoint:`/accounts/v${this.version}/accounts`,params:{view:"full",expand:"related-contracts,limits,holds,customized-formats"}},balances_simple:{endPoint:`/accounts/v${this.version}/balances`},balances_common_account:{endPoint:`/accounts/v${this.version}/balances`,params:{"accountType.id":"COMMON_ACCOUNT"}},balances_currency_account:{endPoint:`/accounts/v${this.version}/balances`,params:{"accountType.id":"CURRENCY_ACCOUNT"}},accounts_simple_token:{headers:[{key:this.requiredToken,value:e}],endPoint:`/accounts/v${this.version}/accounts`},accounts_extended_token:{headers:[{key:this.requiredToken,value:e}],endPoint:`/accounts/v${this.version}/accounts`,params:{view:"full",expand:"related-contracts,limits,holds,customized-formats"}},balances_simple_token:{headers:[{key:this.requiredToken,value:e}],endPoint:`/accounts/v${this.version}/balances`},balances_common_account_token:{headers:[{key:this.requiredToken,value:e}],endPoint:`/accounts/v${this.version}/balances`,params:{"accountType.id":"COMMON_ACCOUNT"}},balances_currency_account_token:{headers:[{key:this.requiredToken,value:e}],endPoint:`/accounts/v${this.version}/balances`,params:{"accountType.id":"CURRENCY_ACCOUNT"}}};return t?(s=t.map((t=>i[t])),this.callsMatch=["items","balances"]):(s=[i.accounts_extended,i.balances_simple,i.balances_common_account,i.balances_currency_account],this.callsMatch=["items","balances","balancesCommon","balancesCurrency"]),s}static _generateBody(t){return null==t?void 0:t.reduce(((t,e,s)=>{const i={id:String(s),url:e.endPoint+(e.params?`?${_e._encodeData(e.params)}`:""),method:e.method||"GET"};return e.headers&&(i.headers=e.headers),t.push(i),t}),[])}static _encodeData(t){return Object.keys(t).map((e=>[e,t[e]].map(encodeURIComponent).join("="))).join("&")}_parseFullAccounts(t){const e=this.callsMatch;return null==t||t.sort(((t,e)=>t.id-e.id)),null==t?void 0:t.reduce(((t,s,i)=>(200===s.status&&s.body&&(t[e[i]]=this._parseResponse(JSON.parse(s.body))),t)),{})}_onEmptyPageReached(){this.emptyPageReached=!0,this.loading=!1,this.dispatchEvent(new CustomEvent("empty-page-reached",{bubbles:!0,composed:!0}))}_checkEmptyPageReached(){this.loadPagesUntilEmptyPage&&this.pagination.totalElements<this.pagination.pageSize&&this._onEmptyPageReached()}}class fe extends _e{static get is(){return"bbva-dataprovider-co-pensional-agreements"}getPensionAgreements(t={}){this._generateGetService(this._getService("get",{},t),{customEvent:"pension-agreements-dm-fetch",errorFireEventHandler:"pension-agreements-dm-fetch-error"})}_getService(t,e={},s={}){const i=this._getServiceParams(s,e);return this._getServicePath(`${t}PensionAgreements`,this._getBgadp(i))}_getBgadp(t){return{getPensionAgreementsV0:()=>new E(t),default:()=>this._bgadpNotExistMessage}}}class ye extends _e{static get is(){return"bbva-dataprovider-account-gmf"}postMarksAccountsGmf(t){this._generateGetService(this._getService("post",t),{customEvent:"accounts-mark-gmf-create",errorFireEventHandler:"accounts-mark-gmf-create-error"})}_getService(t,e={},s={}){const i=this._getServiceParams(s,e);return this._getServicePath(`${t}MarksAccountsGmf`,this._getBgadp(i))}_getBgadp(t){return{postMarksAccountsGmfV0:()=>new A(t),default:()=>this._bgadpNotExistMessage}}}customElements.define(_e.is,_e),customElements.define(fe.is,fe),customElements.define(ye.is,ye);class Se extends(e(s)){static get is(){return"bbva-local-business-documents-api-dm"}static get properties(){return{productId:{type:String,attribute:"product-id"},subproductId:{type:String,attribute:"sub-product-id"}}}constructor(){super(),this.productId="",this.subProductId=""}getBusinessDocuments(t={}){const e={"product.id":t.productId||this.productId,"subproduct.id":t.subproductId||this.subProductId};this._generateGetService(this._getService("get",{},e),{customEvent:"business-documents-api-dm-fetch",errorFireEventHandler:"business-documents-api-dm-fetch-error"},this._responseMapping)}postInvestmentBusinessDocuments(t={}){this._generateGetService(this._getService("postInvestment",t,{}),{customEvent:"post-investment-business-documents-api-dm-fetch",errorFireEventHandler:"post-investment-business-documents-api-dm-fetch-error"},this._responseMapping)}_getBgadp(t){return{getBusinessDocumentsV0:()=>new C(t),postInvestmentBusinessDocumentsV1:()=>new x(t),default:()=>"BGADP called not exist"}}_getService(t,e={},s={}){const i=this._getServiceParams(s,e);return this._getServicePath(`${t}BusinessDocuments`,this._getBgadp(i))}_responseMapping(t){return t}}class Ee extends(e(s)){}class Ae extends Ee{static get is(){return"bbva-local-risks-risk-levels-calculate-api-dm"}postCalculateRiskLevels(t={}){this._generateGetService(this._getService("post",t,{}),{customEvent:"risks-risk-levels-calculate-api-dm-fetch",errorFireEventHandler:"risks-risk-levels-calculate-api-dm-fetch-error"})}_getService(t,e={},s={}){const i=this._getServiceParams(s,e);return this._getServicePath(`${t}CalculateRisk`,Ae._getBgadp(i))}static _getBgadp(t){return{postCalculateRiskV1:()=>new ft(t),default:()=>"BGADP called not exist"}}}class Re{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(t,e){if(null===this)throw new TypeError('"this" is null or not defined');let s=Object(this),i=s.length>>>0;if(0===i)return!1;let n=0|e,a=Math.max(n>=0?n:i-Math.abs(n),0);for(;a<i;){if((r=s[a])===(o=t)||"number"==typeof r&&"number"==typeof o&&isNaN(r)&&isNaN(o))return!0;a++}var r,o;return!1}}),String.fromCodePoint||function(t){var e=function(e){for(var s=[],i=0,n="",a=0,r=arguments.length;a!==r;++a){var o=+arguments[a];if(!(o<1114111&&o>>>0===o))throw RangeError("Invalid code point: "+o);o<=65535?i=s.push(o):(o-=65536,i=s.push(55296+(o>>10),o%1024+56320)),i>=16383&&(n+=t.apply(null,s),s.length=0)}return n+t.apply(null,s)};try{Object.defineProperty(String,"fromCodePoint",{value:e,configurable:!0,writable:!0})}catch(t){String.fromCodePoint=e}}(String.fromCharCode)}_error(t=0,e="",s=null){throw t=`0000${t=t.toString()}`.substr(t.length),Error(`BGADP_ERROR_${t} :: ${e} :: ${s&&s.message}`)}}class Ce extends Re{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(t="",e=""){if("string"==typeof t&&t)if(this._reservedKeys.includes(t))this._error(2,`"${t}" should NOT be a reserved key`);else{if("string"!=typeof e)try{e=JSON.stringify(e)}catch(t){this._error(1,`"${e}" couldn't be transformed into String`)}e=e.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[t]=e}else this._error(3,"Missing {item} parameter")}getItem(t=""){return this._items[t]?this._items[t]:null}removeItem(t=""){this._items.hasOwnProperty(t)&&delete this._items[t]}clear(){Object.keys(this._items).length&&(this._items={})}}const xe=0,Pe=1,Te="jwt",$e="tsec",we="none";class Oe extends Re{constructor(t=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=xe,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(t),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let t={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(t).forEach((e=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!1,value:t[e],writable:"_headers"!==e})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new Ce,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this)}_assignConfigValues(t=null){null!=t&&"object"==typeof t&&Object.keys(t).forEach((e=>{if(this.hasOwnProperty(e)&&"_"!==e.charAt(0)&&"function"!=typeof this[e])if("object"==typeof this[e])Array.isArray(t[e])?this[e]=Array.from(t[e]):null===this[e]?this[e]=t[e]:this[e]=Object.assign(this[e]||{},t[e]);else this[e]=t[e];else"signatureRequiredErrors"===e?this._ERROR_CODES.SIGNATURE_REQUIRED=t[e]:"signatureInvalidErrors"===e?this._ERROR_CODES.SIGNATURE_INVALID=t[e]:"signatureFirstErrorCode"===e?this._ERROR_CODES.SIGNATURE_FIRST_STEP=t[e]:"pendingProcessResponseErrors"===e?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=t[e]:"signatureInvalidStatus"===e?this._STATUS_CODES.SIGNATURE_INVALID=t[e]:"pendingProcessResponseStatus"==e?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=t[e]:"getTokenHandlerKey"===e?this.getTokenHandlerKey=t[e]:("function"==typeof this[e]&&this._error(1,`${e} is a class method, can't be override`),"_"===e.charAt(0)&&this._error(2,`"${e}" is a restricted property, can't be override`),this.hasOwnProperty(e)||this._error(3,`"${e}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=$e:this.requiredToken=we,this.requiresJWT=!1):this.requiredToken===$e?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===Te?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===we?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler($e)}_setJwtHandler(){this._setTokenHandler(Te)}_setTokenHandler(t){const e=`${t}Handler`;this[e]=this[e]||window.sessionStorage;try{this[e].setItem("test","test"),this[e].removeItem("test")}catch(t){this._error(4,`Invalid [${e}]. If not specified, default window.sessionStorage can't be written/read`,t)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(t=""){t&&"string"==typeof t?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:t,writable:!1}):this._error(6,"[path] is required")}_buildPromise(t=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let e={isPending:!0};e.promise=new window.Promise(((s,i)=>{e=Object.assign(e,{resolve:s,reject:i}),this._buildRequest(t)})),this._promise=Object.assign({},e)}return this._promise.promise}_defaultXHR(t=""){let e=new window.XMLHttpRequest;if(e instanceof window.XMLHttpRequest){e.withCredentials=this.withCredentials,e.timeout=1e3*this.timeout,e.onreadystatechange=this._onReadyStateChange.bind(this),e.responseType=this.responseType,e.open(this.method.toUpperCase(),t);let s=this._getRequestHeaders();Object.keys(s).forEach((t=>{this.forceBoundary&&this.multipart&&"Content-Type"===t||e.setRequestHeader(t,s[t])})),e.send(this._buildBody())}return e}_nativeXHR(t=""){let e=this._buildNativeRequest();return e?(e=e[this.method.toLowerCase()],"function"==typeof e?e=e({url:t,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),e}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=t),e}_buildRequest(t=!1){let e=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const t={url:e,path:this._path,method:this.method};this._emitRequestEvent("start",t)}if(!t&&this._cacheItem&&e===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!t&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:e,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(e);break;case this._NATIVE_XHR:this._request=this._nativeXHR(e)}return this._request}_buildURL(){let t=[this.host,this._path].join("/");if(null!==this.params){let e=Object.assign({},this.params);-1!==t.lastIndexOf("{")&&(t=t.replace(/(\{[\w\-]+\})/g,(t=>{let s=t.replace(/[\{\}]+/g,""),i=e[s];return i?delete e[s]:this._error(9,`Missing ${s} param value`),i})),-1!==t.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let s=Object.keys(e);s.length&&(t=[t,s.map((t=>{let s=e[t];return Array.isArray(s)&&this.paramArrayMode===Pe?this._arrayToQueryParam(t,s):`${t}=${s}`})).join("&")].join("?"))}return t}_arrayToQueryParam(t,e){return e.map((e=>`${t}=${e}`)).join("&")}_getRequestHeaders(){let t=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(t=this._getTokenForRequestHeaders($e,t)),!0===this.requiresJWT&&(t=this._getTokenForRequestHeaders(Te,t)),!0===this.semaasMonitoring){let e=this._getSemaasHeaders();Object.assign(t,e)}const e=this._getCustomHeaders();return Object.assign(t,e),t}_getSemaasHeaders(){var t={};if(window.sessionStorage){var e=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(s){var i=e.getItem(s);i&&"null"!==i&&(t[s]=i)}))}return t}_getCustomHeaders(){const t="x-bgadp-";let e={};if(window.sessionStorage){const s=window.sessionStorage;e=Object.keys(s).filter((e=>e.startsWith(t))).reduce(((e,i)=>(e[i.replace(t,"")]=s.getItem(i),e)),{})}return e}_getTokenForRequestHeaders(t,e){const s=`${t}Handler`,i=t===Te?"JWT ":"",n=t===Te?"Authorization":$e;if(void 0===this[s]||null===this[s])this._error(11,`${t} handler is undefined`);else{const a=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):t;let r=this[s].getItem(a);r?e[n]=e[n]||i+r:this._error(12,`Missing '${t}' value`)}return e}_buildBody(){let t=this.body;if(t&&this._xhrType===this._DEFAULT_XHR){let e=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===e){let e=[];Object.keys(t).forEach((s=>{e.push(`${s}=${t[s]}`)})),t=e.join("&")}else this.headers&&-1!==e.indexOf("multipart/")||(t=JSON.stringify(t))}return t}_onReadyStateChange(){let t=this._request;if(t&&t.readyState===window.XMLHttpRequest.DONE)switch(t.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(t);break;default:this._onRequestFail(t)}}_extractRequestResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)e={result:e};else if(e&&e instanceof ArrayBuffer)try{const t=this._decode(e);try{e=JSON.parse(t)}catch(s){e={result:t,originalResponse:e}}}catch(t){e=null}else if(e&&"string"==typeof e)try{e=JSON.parse(e)}catch(t){e=null}return e}async _extractRequestErrorResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)try{const t=await this._blobDecode(e);try{e=JSON.parse(t)}catch(s){e={result:t,originalResponse:e}}}catch(t){e=null}else e=this._extractRequestResponse(t);return e}_blobDecode(t){const e=new FileReader;let s;const i=new Promise(((t,e)=>{s=(s,i)=>{s?e(s):t(i)}}));return e.addEventListener("loadend",(function t(i){e.removeEventListener("loadend",t),i.error?s(i.error):s(null,e.result)})),e.readAsText(t),i}_decode(t){let e;if("function"==typeof TextDecoder){e=new TextDecoder("utf-8").decode(t)}else{let s=0;for(;s<t.length;){let i=t[s],n=0,a=0;if(i<=127?(n=0,a=255&i):i<=223?(n=1,a=31&i):i<=239?(n=2,a=15&i):i<=244&&(n=3,a=7&i),t.length-s-n>0){let e=0;for(;e<n;)i=t[s+e+1],a=a<<6|63&i,e+=1}else a=65533,n=t.length-s;e+=String.fromCodePoint(a),s+=n+1}}return e}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let t=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(t=window.btoa(t)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,t);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,t);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,t);case this._CACHE_NONE:}}catch(t){this._error(13,`Can't write into cache engine: ${t.message}`,t)}}_retrieveFromCache(){let t;try{switch(this._cache){case this._CACHE_MEMORY:t=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:t=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:t=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(t){this._error(14,"Can't read from cache engine",t)}return t&&(this.encodeCache&&(t=window.atob(t)),"string"==typeof t&&/[\{\[]/.test(t.charAt(0))&&(t=JSON.parse(t))),t}_setLastResponse(t=null){t&&(this._lastResponse=Object.assign({},t))}_setLastResponseHeaders(t=null){let e={};t&&(t instanceof window.XMLHttpRequest?e=this._parseResponseHeadersToObject(t.getAllResponseHeaders()):t.headers&&(e=JSON.parse(t.headers))),this._lastResponseHeaders=e}_parseResponseHeadersToObject(t){let e={},s=t.trim().split(/[\r\n]+/);for(const t in s)if(s.hasOwnProperty(t)&&""!==s[t]){let i=": ",n=s[t].split(i);e[n.shift().toLowerCase()]=n.join(i)}return e}_onRequestSuccess(t=null){this._setLastResponse(this._extractRequestResponse(t)),this._setLastResponseHeaders(t),this.jwtHandler&&this._storeToken(this.jwtHandler,t,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,t,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",t)}_storeToken(t,e,s,i){let n=null;switch(this._xhrType){case this._DEFAULT_XHR:e&&e.getAllResponseHeaders&&e.getResponseHeader&&e.getAllResponseHeaders().indexOf(i)>=0&&(n=e.getResponseHeader(i));break;case this._NATIVE_XHR:e&&e.headers&&(n=JSON.parse(e.headers)[i])}if(n){const e=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):s;t.getItem(e)!==n&&(t.setItem(e,n),this._emitTokenUpdate(s,n))}}_emitTokenUpdate(t,e){if(this.htmlContext){const s=new CustomEvent("token-update",{bubbles:!0,detail:{type:t,token:e}});this.htmlContext.dispatchEvent(s)}}_emitRequestEvent(t,e){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${t}`,{bubbles:!0,composed:!0,detail:{metadata:e}})):console.warn(`Missing htmlContext to dispatch event http-request-${t}`)}_onRequestFail(t=null){(async()=>{if(!this._isSignatureRequired(t)&&!this._isWaitingForProcessResponse(t)){let e=await this._extractRequestErrorResponse(t);this._setLastResponse(e),this._setLastResponseHeaders(t),this._onRequestEnd("reject",t)}})()}_onRequestEnd(t="resolve",e=null){if(this._resetDPState(),this.emitRequestEvents){const t={method:this.method,path:this._path};null!==e&&(t.status=e.status,t.url=e.responseURL),this._emitRequestEvent("end",t)}this._promise&&"function"==typeof this._promise[t]&&(this._promise.isPending=!1,this._promise[t](e))}_resetDPState(){["Data","Type","State"].forEach((t=>{let e=`Authentication${t}`;this._headers&&this._headers.hasOwnProperty(e)&&delete this._headers[e],this.headers&&this.headers.hasOwnProperty(e)&&delete this.headers[e]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(t=null){let e,s,i,n,a;if(t instanceof window.XMLHttpRequest)e=t.getResponseHeader("AuthenticationType"),s=t.getResponseHeader("AuthenticationData"),i=t.getResponseHeader("AuthenticationState"),n=t.getResponseHeader("AuthenticationChallenge"),a=t.getResponseHeader("AuthenticationResponse");else{let r=JSON.parse(t.headers);e=r.authenticationtype,s=r.authenticationdata||null,i=r.authenticationstate,n=r.authenticationchallenge,a=r.authenticationresponse}return{type:e,data:s,state:i,challenge:n,response:a}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureTypeChange(t,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureValueChange(t,...arguments)}})}_onSignatureTypeChange(t="",e="",s=""){if("string"==typeof t&&""!==t)if(e.includes(t)){if("string"==typeof t&&""!==t){const i=this._getSignatureData(t,e,s);this.headers=Object.assign(this.headers||{},{AuthenticationType:t,AuthenticationData:i}),this._buildRequest()}}else this._error(15,`${t} is not a valid signature type`);"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(t=null,e="",s="",i=""){let n;if("object"==typeof t&&t){const a=this._getSignatureData(t.signatureType,e,s);n=this._makeKeyValuePairFromObject(a,t.signatureValue),t.challenge&&(n+=`,challenge=${t.challenge}`),this._buildSignatureHeaders(n,t.signatureType,i)}else"string"==typeof t&&""!==t&&(this._hasSignatureAuthenticationType(e,"2")?(n=`password=${t}`,this._buildSignatureHeaders(n,"2",i)):(n=`${s}=${t}`,this._buildSignatureHeaders(n,e,i)));"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(t="",e=""){if(!t)return"";let s,i=t.split(",");if(i.length>1){s=i.map((t=>`${t}=${e[t]}`)).join(",")}else s=`${t}=${e}`;return s}_hasSignatureAuthenticationType(t,e){return-1!==t.split(";").findIndex((t=>t===e))}_buildSignatureHeaders(t="",e="",s=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:t,AuthenticationType:e||""}),s&&(this.headers=Object.assign(this.headers,{AuthenticationState:s})),this._buildRequest()}_isSignatureRequired(t=null){const e=Number((t||{}).status);let s=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(e)){const e=this._extractRequestResponse(t),i=this._extractResponseErrorCode(e),n=this._ERROR_CODES.SIGNATURE_INVALID.includes(i),{type:a,data:r,state:o,challenge:c,response:l}=this._extractSignatureResponseHeaders(t),u=this._getRequestMetadata(t);if(n)this._notifySignatureInvalid(u),s=!0;else if(a)if(e){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(i)?(this._notifySignatureTypeUsingErrorCode(i,u,a,r,o,c,l),s=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(u,a,r,o,c,l),s=!0}return s}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(t=null){const e=Number((t||{}).status);let s=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(e)){const e=this._extractRequestResponse(t),i=this._extractResponseErrorCode(e),n=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(i),a=this._getRequestMetadata(t);n&&(this._notifyWaitingForProcessResponse(a),s=!0)}return s}_notifySignatureRequiredFirstStep(t,e,s,i){this._defineSignatureType(e,s),this._defineSignatureValue(e,s,i),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:e,data:s,metadata:t}}))}_notifySignatureRequired(t,e,s,i,n,a){this._defineSignatureValue(e,s,i);const r={type:e,data:s,challenge:n,metadata:t};a&&(r.response=a),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:r}))}_notifySignatureInvalid(t){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:t}}))}_notifyWaitingForProcessResponse(t){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:t}}))}_getRequestMetadata(t){const{responseURL:e,status:s}=t;return{path:this._path,method:this.method,url:e,status:s}}_emitEvent(t){this.htmlContext?this.htmlContext.dispatchEvent(t):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(t="",e="",s=""){const i=e.split(";").findIndex((e=>e===t));return s?s.split(";")[i]:""}toString(t=""){return`[object ${t||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(t=!1){return this._buildPromise(t)}_extractResponseErrorCode(t){return t?t["error-code"]||t.messages&&t.messages[0].code:null}_notifySignatureTypeUsingHeaders(t,e,s,i,n,a){i?this._notifySignatureRequired(t,e,s,i,n,a):this._notifySignatureRequiredFirstStep(t,e,s,i)}_notifySignatureTypeUsingErrorCode(t,e,s,i,n,a,r){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(t)?this._notifySignatureRequiredFirstStep(e,s,i,n):this._notifySignatureRequired(e,s,i,n,a,r)}}class De extends Oe{constructor(t=null){super(Object.assign(t||{},{method:"GET"}))}toString(t=""){return super.toString(t||"BGADPRequestGET")}}class Ie extends Oe{constructor(t=null){super(Object.assign(t||{},{method:"PATCH"}))}toString(t=""){return super.toString(t||"BGADPRequestPATCH")}}class ke extends Oe{constructor(t=null){super(Object.assign(t||{},{method:"POST"}))}toString(t=""){return super.toString(t||"BGADPRequestPOST")}}class qe extends De{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`questionnaires/v${this.version}/questionnaires`)}toString(){return super.toString("BGADPQuestionnairesGetV0")}}class He extends ke{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`questionnaires/v${this.version}/questionnaires`)}toString(){return super.toString("BGADPQuestionnairesPostV0")}}class Ne extends Ie{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`questionnaires/v${this.version}/questionnaires/{questionnaire-id}`)}toString(){return super.toString("BGADPQuestionnairesQuestionnairePatchV0")}}class je extends(e(s)){static get is(){return"bbva-local-questionnaires-api-dm"}static get properties(){return{}}getQuestionnaires(t={}){this._generateGetService(this._getService("get",{},t),{customEvent:"success-on-get-questionnaires",errorFireEventHandler:"error-on-get-questionnaires"},this._responseMapping)}postQuestionnaire(t={}){this._generateGetService(this._getService("post",t,{}),{customEvent:"success-on-post-questionnaire",errorFireEventHandler:"error-on-post-questionnaire"},this._responseMapping)}patchQuestionnaire(t="",e={}){const s={"questionnaire-id":t};this._generateGetService(this._getService("patch",e,s),{customEvent:"success-on-patch-questionnaire",errorFireEventHandler:"error-on-patch-questionnaire"},this._responseMapping,s.fields)}_getBgadp(t){return{getQuestionnairesV0:()=>new qe(t),postQuestionnairesV0:()=>new He(t),patchQuestionnairesV0:()=>new Ne(t),default:()=>"BGADP called not exist"}}_getService(t,e={},s={}){const i=this._getServiceParams(s,e);return this._getServicePath(`${t}Questionnaires`,this._getBgadp(i))}_responseMapping(t){return t}}var Le=n`
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

.form-input {
  margin-bottom: 1rem;
}

[data-tag-name=bbva-transition-container] {
  --bbva-transition-container-padding: 0;
  --bbva-transition-container-text-align: left;
}

.description {
  margin-top: 1rem;
  padding-left: 1rem;
  padding-right: 1rem;
}

.microillustration-position {
  display: flex;
  margin-top: 1rem;
  margin-left: 1rem;
}

.link-profile {
  margin-top: 1rem;
  margin-left: 1rem;
}

.footer {
  display: flex;
  flex-direction: column;
  padding-top: 14rem;
  position: fixed;
  bottom: 1rem;
  left: 0;
  width: 100%;
}

.title {
  margin-top: 1rem;
  margin-left: 1rem;
}

[data-tag-name=bbva-help-modal][visible] {
  transform: translateZ(0.1px);
}
`;class Be extends(I(k(a(s)))){static get is(){return"bbva-feature-investment-portfolio-profiling-result"}static get scopedElements(){const t=[L,dt,B,F,V];return Be.scopedElementsFromClasses(t)}static get properties(){return{nameProfileRisk:{type:String},descriptionProfileRisk:{type:String}}}constructor(){super(),this.config={loader:!0},this.nameProfileRisk="",this.descriptionProfileRisk=""}static get styles(){return[Le,ht.secondary,q.secondary,H.primary,N.primary,j.primary,r("bbva-investment-multistep-shared-styles")]}returnTestProfiling(){this._dispatchCustomEvent("show-test-profiling-again")}render(){return o`
    <div>
        <div class="microillustration-position">
            <bbva-clip-microillustration
                microillustration="success" 
                size="M">
            </bbva-clip-microillustration>
        </div>
        <div class="title">
            <bbva-type-text
                class="title-text"
                tag="span"
                font-weight="${c.fontWeight40}" 
                size="2XL"
                color="${l.primary}"
                text="${this.t("bbva-feature-investment-portfolio-profiling-result-title",{profile:this.nameProfileRisk})}">
            </bbva-type-text>
        </div>
        <div class="description">
            <bbva-type-text
                class="description-text"
                tag="span"
                weight="${c.regular}"
                color="${l.primary}"
                text="${this.t(this.descriptionProfileRisk)}">
            </bbva-type-text>
        </div>
    </div>
    <div class="footer">
        <div class="description">
            <bbva-button-default
            id="showProposalDetail"
            fullwidth
            @click="${()=>this._dispatchCustomEvent("show-proposal-detail")}"
            text="${this.t("bbva-feature-investment-portfolio-profiling-result-button-text")}">
            </bbva-button-default>
        </div>
        <div class="link-profile">
            <bbva-type-link
                id="showProfilingAgain"
                @click="${this.returnTestProfiling}"
                text="${this.t("bbva-feature-investment-portfolio-profiling-result-link-text")}"></bbva-type-link>
        </div>
    </div>
    `}}const Fe={questionsHeader:{1:"bbva-feature-investment-portfolio-multistep-experience-question-header",2:"bbva-feature-investment-portfolio-multistep-your-investment-question-header",3:"bbva-feature-investment-portfolio-multistep-your-investment-hide-question-header",4:"bbva-feature-investment-portfolio-multistep-your-finances-question-header",5:"bbva-feature-investment-portfolio-multistep-preferences-question-header",6:"bbva-feature-investment-portfolio-multistep-preferences-hide-question-header",7:"bbva-feature-investment-portfolio-multistep-other-hide-question-header"},questionsDescription:{1:"bbva-feature-investment-portfolio-multistep-select-instruments-question",2:"bbva-feature-investment-portfolio-multistep-want-to-investment-question",3:"bbva-feature-investment-portfolio-multistep-keep-your-investment-question",4:"bbva-feature-investment-portfolio-multistep-percentage-investment-question",5:"bbva-feature-investment-portfolio-multistep-expect-from-your-investment-question",6:"bbva-feature-investment-portfolio-multistep-loss-to-assume-question",7:"bbva-feature-investment-portfolio-multistep-what-would-you-question"},questionsOptionsCheckbox:{1:"bbva-feature-investment-portfolio-checkbox-never-investment-option-summary",2:"bbva-feature-investment-portfolio-checkbox-government-debt-option-summary",3:"bbva-feature-investment-portfolio-checkbox-debt-option-summary",4:"bbva-feature-investment-portfolio-checkbox-variable-income-option-summary",5:"bbva-feature-investment-portfolio-checkbox-structured-option-summary",6:"bbva-feature-investment-portfolio-checkbox-alternative-option-summary"},summaryRadioOptions:{4:"bbva-feature-investment-portfolio-multistep-radio-button-title-percentage",5:"bbva-feature-investment-portfolio-multistep-radio-button-title-level",6:"bbva-feature-investment-portfolio-multistep-radio-button-title-loss",7:"bbva-feature-investment-portfolio-multistep-radio-button-title-attitude"},summaryRadioOptionsReplace:{2:{1:"bbva-feature-investment-portfolio-multistep-radio-button-option-replace-no-loss",2:"bbva-feature-investment-portfolio-multistep-radio-button-option-replace-lower",3:"bbva-feature-investment-portfolio-multistep-radio-button-option-replace-moderate",4:"bbva-feature-investment-portfolio-multistep-radio-button-option-replace-high-risk"},4:{1:"bbva-feature-investment-portfolio-multistep-radio-button-option-replace-retire-preferences",2:"bbva-feature-investment-portfolio-multistep-radio-button-option-replace-keep-preferences",3:"bbva-feature-investment-portfolio-multistep-radio-button-option-replace-more-preferences"}}};var Ve=n`
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

[data-tag-name=bbva-transition-container] {
  --bbva-transition-container-padding: 0;
  --bbva-transition-container-text-align: left;
}

.microillustration-position {
  display: flex;
  margin-top: 1rem;
  margin-left: 1rem;
}

.description {
  margin-top: 1rem;
  margin-left: 1rem;
}

.footer {
  padding-top: 2rem;
}

.title {
  margin-top: 1rem;
  margin-left: 1rem;
}

.button {
  margin-top: 1rem;
  margin-left: 1rem;
  margin-right: 1rem;
}

[data-tag-name=bbva-help-modal][visible] {
  transform: translateZ(0.1px);
}
`;class Ge extends(I(k(a(s)))){static get is(){return"bbva-feature-investment-portfolio-profiling-welcome"}static get scopedElements(){const t=[L,dt,B,F,V,...Ge.configurationScopedElements()];return Ge.scopedElementsFromClasses(t)}static get properties(){return{nameHolder:{type:String}}}constructor(){super(),this.nameHolder=""}showProfilingTest(){this._dispatchCustomEvent("show-profiling-test")}static get styles(){return[H.primary,N.primary,j.primary,Ve,ht.secondary,q.secondary,r("bbva-investment-multistep-shared-styles")]}render(){return o`
            <div>
                <div class="microillustration-position">
                    <bbva-clip-microillustration
                        microillustration="tasklist" 
                        size="M">
                    </bbva-clip-microillustration>
                </div>
                <div class="title">
                    <bbva-type-text
                        class="title-text"
                        tag="span"
                        font-weight="${c.fontWeight40}" 
                        size="2XL"
                        color="${l.primary}"
                        text="${this.t("bbva-feature-investment-portfolio-profiling-welcome-title",{name:this.nameHolder})}">
                    </bbva-type-text>
                </div>
                <div class="description">
                    <bbva-type-text
                        class="description-text"
                        tag="span"
                        weight="${c.regular}"
                        color="${l.primary}"
                        text="${this.t("bbva-feature-investment-portfolio-profiling-welcome-content")}">
                    </bbva-type-text>
                </div>
            </div>
            <div class="footer button">
                <bbva-button-default
                id="showProposalDetail"
                fullwidth
                @click="${this.showProfilingTest}"
                text="${this.t("bbva-feature-investment-portfolio-profiling-welcome-button")}">
                </bbva-button-default>
            </div>
            `}}var Me=n`
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

[data-tag-name=bbva-transition-container] {
  --bbva-transition-container-padding: 0;
  --bbva-transition-container-text-align: left;
}

.form-input {
  margin-bottom: 1rem;
}

.summary-input {
  display: flex;
  justify-content: space-between;
}

.check-box-margin {
  right: 1rem;
}

.wrapper {
  background-color: var(--colorsPrimaryCoreLightened, ${u(l.primaryCoreLightened)});
  border-right: 1.0625rem solid transparent;
  width: auto;
  border-top-width: 1rem;
}

.render-confirm-message {
  margin-bottom: 1rem;
  margin-top: 1.5rem;
}

.continue-button {
  margin-top: 1.5rem;
}

.summary-text {
  color: var(--colorsSecondary100, ${u(l.secondary100)});
  padding: 0.5rem 1rem 0.5rem 1rem;
}

.summary {
  padding-bottom: 1rem;
}

[data-tag-name=bbva-help-modal][visible] {
  transform: translateZ(0.1px);
}
`;const ze="MULTIPLE_CHOICE",Ue="TEXT",Xe="SINGLE_CHOICE",Qe={button6:!1,button1:!1,button5:!1,button2:!1,button3:!1,button4:!1,button7:!1},We={"step-1":!1,"step-2":!1,"step-3":!1,"step-4":!1,"step-5":!1,"step-6":!1,"step-7":!1};class Ke extends(I(k(a(s)))){static get is(){return"bbva-profiling-investment-portfolio-test-profiling"}static get scopedElements(){const t=[L,P,T,G,dt,rt,$,bt,vt,B,pt,M,z,U,...Ke.configurationScopedElements()];return Ke.scopedElementsFromClasses(t)}static get properties(){return{stepsReset:{type:Array},_headerVariant:{type:String},_optionsChekbox:{type:Object},questionnaires:{type:Array},isLoaded:{type:Boolean},_invalidAmount:{type:Boolean},amountToInvest:{type:Number},dataQuestionnairesPost:{type:Object},showHeader:{type:Boolean},maxAmount:{type:Number},_messageErrorInput:{type:String},objectPostQuestionnaires:{type:Object},objectRadioButtonsText:{type:Object},_openExitModal:{type:Boolean},currency:{type:String}}}constructor(){super(),this.config={loader:!0},this.stepsReset=[],this._optionsChekbox={},this.questionnaires=[],this.isLoaded=!1,this._invalidAmount=!1,this.dataQuestionnairesPost={},this.amountToInvest=0,this.maxAmount=0,this._messageErrorInput="",this.objectPostQuestionnaires={},this._openExitModal=!1,this.objectRadioButtonsText={yourInvestment:0},this._headerVariant="modal-initial",this.currency=""}updated(t){t.has("isLoaded")&&7===this.questionnaires.length&&(this._optionsChekbox={},Object.keys(Qe).forEach((t=>{Qe[t]=!1})),this.questionnaires=[...this.questionnaires])}_insertDataSteps(){return this.questionnaires.map((t=>this._renderSteps(t.order,t.questionsHeader,t.description,t.questionType,t.questionOptions,t.id)))}_edit(){this.questionnaires[0].questionsHeader=Fe.questionsHeader[1],this._headerVariant="modal-initial"}_modalStatus(t){t.detail||(this._openExitModal=!1)}_handlerVariantHeader(t){this._headerVariant=t.detail.completed?"modal-initial-secondary":"modal-initial"}_renderCheckbox(t,e){return t.map((t=>{var s;return o`
        <div>
          <bbva-form-checkbox 
            name="choice${e}"
            class="check-box-margin"
            value="${t.id}"
            show-help-icon
            label="${t.description}"
            label-out
            @change="${this._onCheckboxChange}"
            ?checked="${(null===(s=this._optionsChekbox[`index${t.id}`])||void 0===s?void 0:s.checked)??!1}"
          >
          </bbva-form-checkbox>
        </div>
      `}))}_summaryAmountToInvest(){return o`
      <div class="summary-input summary">
        <bbva-type-text 
          text="${this.t("bbva-feature-investment-portfolio-multistep-input-amount")}" 
          size="XS" 
          tag="span" 
          ambient="secondary"
        >
        </bbva-type-text>
        <bbva-type-text 
          text="${this.t("bbva-feature-investment-portfolio-multistep-summary-amount",{amount:this.objectRadioButtonsText.yourInvestment.amountString})}"
          size="XS" 
          tag="span" 
          ambient="secondary"
        >
        </bbva-type-text>
      </div>
      ${void 0!==this.objectRadioButtonsText.yourInvestment.description?o` 
      <div class="summary-input summary ">
        <bbva-type-text 
          text="${this.t("bbva-feature-investment-portfolio-multistep-radio-button-title-term")}" 
          size="XS" 
          tag="span" 
          ambient="secondary"
        >
        </bbva-type-text>
        <bbva-type-text 
          text="${this.objectRadioButtonsText.yourInvestment.description}" 
          size="XS" 
          tag="span" 
          ambient="secondary"
        >
        </bbva-type-text>
      </div>
      `:o``}`}_renderInput(){return o`
      <div>
        <bbva-form-input
          class="form-input"
          mode-input="decimal"
          type="amount"
          label="${this.t("bbva-feature-investment-portfolio-multistep-input-amount-to-invest")}"
          ?invalid="${this._invalidAmount}"
          error-message="${this._messageErrorInput}"
          info-message="${this._invalidAmount?"":this.t("bbva-feature-investment-portfolio-multistep-input-amount-minimum")}"
          @form-amount-input-change="${this._validateAmount}"
          currency-code="${this.currency}"
          ambient="primary-alt"
          local-currency="${this.currency}"
          symbol-left
          decimal-digits="4"
        ></bbva-form-input>
      </div>
    `}_validateAmount({detail:t}){this.amountToInvest=parseFloat(t.amount,10);const e=this.amountToInvest.toLocaleString(void 0,{minimumFractionDigits:2}).toString();this.objectRadioButtonsText.yourInvestment={amount:this.amountToInvest,amountString:e},t.amount<500&&t.amount>0||t.amount>this.maxAmount?(this._invalidAmount=!0,this._messageErrorInput=this.maxAmount<t.amount?this.t("bbva-feature-investment-portfolio-multistep-input-amount-invalid-max-amount"):this.t("bbva-feature-investment-portfolio-multistep-input-amount-minimum")):this._invalidAmount=!1,Qe.button2=0!==t.amount&&!this._invalidAmount}_onCheckboxChange(t){this._optionsChekbox[`index${t.detail.value}`]={checked:t.detail.checked,value:t.detail.value,selected:Fe.questionsOptionsCheckbox[t.detail.value]},"1"===t.detail.value&&t.detail.checked?Object.keys(this._optionsChekbox).forEach((e=>{"index1"!==e&&(this._optionsChekbox[e]={checked:!1,value:t.detail.value,selected:Fe.questionsOptionsCheckbox[t.detail.value]})})):this._optionsChekbox.index1={checked:!1,value:"1",selected:Fe.questionsOptionsCheckbox[t.detail.value]},this._optionsChekbox={...this._optionsChekbox},Qe.button1=this._existCheckboxCheked()}_existCheckboxCheked(){return Object.keys(this._optionsChekbox).some((t=>this._optionsChekbox[t].checked))}_summaryRadioButtonFinance(t,e){var s;return o`
      <div class="summary-input summary">
        <bbva-type-text
          text="${this.t(Fe.summaryRadioOptions[t])}"
          size="XS"
          tag="span"
          ambient="secondary"
        >
        </bbva-type-text>
        <bbva-type-text
          text="${this.t(null===(s=this.dataQuestionnairesPost[e])||void 0===s?void 0:s.description)}"
          size="XS"
          tag="span"
          ambient="secondary"
          alignment="right"
        >
        </bbva-type-text>
      </div>
  `}modalExit(){return o`
      <bbva-help-modal
        id="exitHelpModal"
        class="exit-modal"
        header-text="${this.t("bbva-investment-feedback-operation-exit-profiling-title")}"
        title-icon="${h()}"
        body-text="${this.t("bbva-investment-feedback-operation-lost-information-description")}"
        button-text="${this.t("bbva-feature-investment-portfolio-multistep-button-continue")}"
        link-text="${this.t("bbva-feature-investment-portfolio-button-text")}"
        modal-type="caution"
        illustration="success"
        hide-content-padding-top
        ?visible="${this._openExitModal}"
        @help-modal-footer-link-click
        @help-modal-footer-button-click="${this._validateExit}"
        @visible-changed="${this._modalStatus}"
      ></bbva-help-modal>
    `}_summaryRadioButtons(){return this.objectRadioButtonsText.yourFinances?o`
        ${void 0!==this.objectRadioButtonsText.yourFinances.description2?o`
          <div class="summary-input summary">
              <bbva-type-text
                text="${this.t(Fe.summaryRadioOptions[5])}"
                size="XS"
                tag="span"
                ambient="secondary"
              >
              </bbva-type-text>
              <bbva-type-text
                text="${this.objectRadioButtonsText.yourFinances.description2}"
                size="XS"
                tag="span"
                ambient="secondary"
                alignment="right"
              >
              </bbva-type-text>
            </div>
          `:o``}
        ${void 0!==this.objectRadioButtonsText.yourFinances.description3?o`
        <div class="summary-input summary">
            <bbva-type-text
              text="${this.t(Fe.summaryRadioOptions[6])}"
              size="XS"
              tag="span"
              ambient="secondary"
            >
            </bbva-type-text>
            <bbva-type-text
              text="${this.objectRadioButtonsText.yourFinances.description3}"
              size="XS"
              tag="span"
              ambient="secondary"
              alignment="right"
            >
            </bbva-type-text>
          </div>
        `:o``}
        ${void 0!==this.objectRadioButtonsText.yourFinances.description4?o`
          <div class="summary-input ">
              <bbva-type-text
                text="${this.t(Fe.summaryRadioOptions[7])}"
                size="XS"
                tag="span"
                ambient="secondary"
              >
              </bbva-type-text>
              <bbva-type-text
                text="${this.objectRadioButtonsText.yourFinances.description4}"
                size="XS"
                tag="span"
                ambient="secondary"
                alignment="right"
              >
              </bbva-type-text>
            </div>
        `:o``}
        `:o``}_formatterTextOptions(){return Object.values(this._optionsChekbox).map((t=>o`
        <bbva-type-text
          class="summary"
          ?hidden="${!(null!=t&&t.checked)}"
          ambient="secondary"
          tag="span"
          text="${null!=t&&t.checked?this.t(null==t?void 0:t.selected):""}"
          size="XS"
        >
        </bbva-type-text>
      `))}renderSecondOptionStepAmount(){var t;this.objectRadioButtonsText.yourInvestment={...this.objectRadioButtonsText.yourInvestment,description:null===(t=this.dataQuestionnairesPost[1])||void 0===t?void 0:t.description.replace(".","")}}_continueButtonClickHandler({target:t}){this._dispatchCustomEvent("profiling-test-dispatch-analytics",t.id),this._steps[0].shadowRoot.querySelector(".header").style.display="none",this._steps[0].hidden=!1,this.renderSecondOptionStepAmount(),t.dispatchEvent(new CustomEvent("complete",{bubbles:!0,composed:!0}));Object.keys(this._optionsChekbox).filter((t=>this._optionsChekbox[t].checked)).length>1?this.questionnaires[0].questionsHeader=`${Fe.questionsHeader[1]}-multiple`:this.questionnaires[0].questionsHeader=Fe.questionsHeader[1],"step2"===t.id?(this._steps[3].completed=!1,this._steps[3].hidden=!1):"step5"===t.id&&(this._steps[6].completed=!1,this._steps[6].hidden=!1,this._steps[7].completed=!1,this._steps[7].hidden=!1)}_renderRadioButtons(t,e,s){return t.map((t=>o`
        <bbva-form-radio-button 
          value="${t.id}" 
          selected
          class="check-box-margin"
          name="choice${e}"
          @change="${this._radioButtonsSelected}"
          .optionsQuest="${{id:e,idOptionQuestion:t.id,description:t.description,order:s}}"
        >
          ${t.description}
        </bbva-form-radio-button>
      `))}_radioButtonsSelected({target:t}){const e=Fe.summaryRadioOptionsReplace[t.optionsQuest.id];this.dataQuestionnairesPost[t.optionsQuest.id]={id:t.optionsQuest.id,checked:t.optionsQuest.idOptionQuestion,description:e?e[t.optionsQuest.idOptionQuestion]:t.optionsQuest.description},this.dataQuestionnairesPost={...this.dataQuestionnairesPost},Qe[`button${t.optionsQuest.order}`]=!0,this.objectRadioButtonsText.yourFinances={...this.objectRadioButtonsText.yourFinances,[`description${t.optionsQuest.id}`]:this.dataQuestionnairesPost[t.optionsQuest.id].description.replace(".","")}}_renderSteps(t,e,s,i,n,a){return o`
      <bbva-expandable-step
        id="step-${t}"
        step="${t}"
        class="animation"
        edit-label="${this.t("bbva-feature-investment-portfolio-multistep-edit-label")}"
        ?show-link="${!We[`step-${t}`]}"
        hide-padding-top
        hide-padding-bottom
        header="${this.t(e)}"
        disabled-target=".action"
        @expandable-step-edit-step= "${this._edit}"
        @complete= ${this._actionSummary}
      >
      <div class="content" ambient="primary">
      <bbva-type-text
        font-weight="${c.fontWeight40}" 
        text="${this.t(s)}" 
        size="XS" 
        tag="span" 
      >
      </bbva-type-text>
        ${i.id===ze?this._renderCheckbox(n,a):""}
        ${i.id===Ue?this._renderInput(a):""}
        ${i.id===Xe?this._renderRadioButtons(n,a,t):""}
      <bbva-button-default
        fullwidth 
        id="step${t}" 
        step="${t}"
        class="continue-button"
        text="${this.t("bbva-feature-investment-portfolio-multistep-button-continue")}"
        ?disabled="${!Qe[`button${t}`]}"
        @click="${this._continueButtonClickHandler}">
      </bbva-button-default>
      </div>
      <div class="summary" slot="summary">
        ${i.id===ze?this._formatterTextOptions():""}
        ${i.id===ze?o`<bbva-divider-default size="full"></bbva-divider-default>`:""}
        ${i.id===Ue?this._summaryAmountToInvest():""}
        ${i.id===Ue?o`<bbva-divider-default size="full"></bbva-divider-default>`:""}
        ${i.id===Xe&&4===t?this._summaryRadioButtonFinance(t,a):""}
        ${i.id===Xe&&3!==t&&4!==t?this._summaryRadioButtons(a):""}
        ${i.id===Xe&&4===t?o`<bbva-divider-default size="full"></bbva-divider-default>`:""}

      </div>
      </bbva-expandable-step>
    `}_actionSummary({currentTarget:t}){if("step-0"===t.id||"step-3"===t.id||"step-6"===t.id||"step-7"===t.id){[...this.shadowRoot.querySelectorAll('[data-tag-name="bbva-expandable-step"]')].map((e=>e.id===t.id?e.setAttribute("hidden",""):"")),We[t.id]=!0,this.dataQuestionnairesPost={...this.dataQuestionnairesPost}}}get _steps(){return this.shadowRoot.querySelectorAll('[data-tag-name="bbva-expandable-step"]')}_stepPrefilledResume(){return o`
      <bbva-expandable-step
        prefilled
        id="step-0"
        hide-padding-top
        hide-padding-bottom
        hidden
        >
        <div slot="summary">
          <bbva-type-text
            class="summary-text check-box-margin"
            tag="span"
            text="${this.t("bbva-feature-investment-portfolio-multistep-step-prefilled")}"
            size="S"
            font-weight="${c.fontWeight10}">
          </bbva-type-text>
          <bbva-divider-default size="full"></bbva-divider-default>
        </div>
      </bbva-expandable-step>
    `}_renderCompleteConfirm(){return o`
      <div class="wrapper" slot="confirmation">
        <bbva-notification-message class="render-confirm-message" message-title="${this.t("bbva-investment-all-step-complete-toast")}" book-title="">
        </bbva-notification-message>
        <bbva-button-default 
          id="allCompleteButton" 
          fullwidth
          class="button-confirmation"
          variant="positive" 
          text="${this.t("bbva-feature-investment-portfolio-multistep-button-continue-all-step-complete")}" 
          @click="${this.sendAnswersToPortfolio}" 
        >
        </bbva-button-default>
      </div>
    `}_validateExit(){this.isLoaded=!1,this.questionnaires[0].questionsHeader=null==Fe?void 0:Fe.questionsHeader[1],this._dispatchCustomEvent("exit-investment-portfolio")}_exitModalHandler(){Object.keys(this._optionsChekbox).length>0?this._openExitModal=!0:this._validateExit()}sendAnswersToPortfolio(){const t=[],e=[];Object.keys(this._optionsChekbox).forEach((e=>{this._optionsChekbox[e].checked&&t.push({id:this._optionsChekbox[e].value,isSelected:!0})})),Object.keys(this.dataQuestionnairesPost).forEach((t=>{e.push({id:this.dataQuestionnairesPost[t].id,questionOptions:[{id:this.dataQuestionnairesPost[t].checked,isSelected:!0}]})})),e.push({id:"6",questionOptions:t}),this.objectPostQuestionnaires={INI:{amount:this.amountToInvest},PDV:{answers:e}},this._dispatchCustomEvent("profiling-test-show-result",this.objectPostQuestionnaires)}static get styles(){return[Me,ht.secondary,q.secondary,T.styles,X.secondary,ot.primary,mt.primary,gt.primary,_t.primary,w.primary,H.primary,Q.primary,r("bbva-investment-multistep-shared-styles")]}render(){return this.isLoaded?o`
      <div class="header-modal">
        <bbva-header-main
          id="primary"
          class="primary"
          variant="${this._headerVariant}"
          text="${this.t("bbva-feature-investment-portfolio-profiling-header-title")}"
          @header-main-icon-click="${this._exitModalHandler}"
        >
      </bbva-header-main>
      </div>
      <bbva-expandable-multistep
      step-selector='[data-tag-name="bbva-expandable-step"]'
      .stepsToReset="${this.stepsReset}"
      @expandable-multistep-specific-step-scroll="${this._handlerVariantHeader}" 
      tabindex="0"
      hide-padding-bottom
      hide-padding-top
      offset-bottom="24"
      show-dividers="hide-all"
      >
      <div slot="content">
        ${this._stepPrefilledResume()}
        ${this._insertDataSteps()}
      </div>
      ${this._renderCompleteConfirm()}
    </bbva-expandable-multistep>
    ${this.modalExit()}
    `:o`
      `}}var Je=n`
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

.generic-link {
  display: flex;
  padding: 0.5rem 0rem 1rem 0rem;
}

.generic-subtitle {
  color: var(--colorsSecondary500, ${u(l.secondary500)});
}

.large-padding-top {
  padding-top: 1rem;
}

.medium-padding-top {
  padding-top: 0.5rem;
}

.future-notification {
  padding-top: 0.5rem;
  padding-bottom: 1rem;
}

.hiring-button {
  padding-top: 1rem;
}

.future-link {
  display: flex;
}

.amount-label {
  display: inline-grid;
}

.invest-amount-composition {
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.microillustration-composition {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 1rem 0rem 1rem 0rem;
}
.microillustration-composition .illustration {
  padding: 0.5rem;
}
.microillustration-composition .description {
  margin-left: 1rem;
  margin-right: auto;
  display: inline-grid;
}

.legend {
  display: flex;
  width: 1rem;
  height: 1.5rem;
  flex: none;
  align-items: center;
  margin-right: 0.5rem;
}

.legend-bar span {
  width: 0.6875rem;
  height: 0.625rem;
  background-color: var(--_data-visualization-tooltip-bar-legend-color);
  transform: skewX(-26deg);
  transform-origin: left bottom;
}

.content-wrapper:first-child .label-wrapper {
  padding-top: 0;
}
.content-wrapper .label-wrapper {
  display: flex;
  overflow: hidden;
  flex: 1;
  justify-content: space-between;
  padding-top: 0.5rem;
}
.content-wrapper .label {
  overflow: hidden;
  align-self: center;
}
.content-wrapper .description {
  overflow: hidden;
  margin-left: auto;
}

.panel {
  display: flex;
  box-sizing: border-box;
  flex-direction: column;
  padding: 0.5rem 0.5rem 1rem 0rem;
  margin-top: 0.5rem;
}

[data-tag-name=bbva-help-modal][visible] {
  transform: translateZ(0.1px);
}
`;class Ye extends(I(k(a(s)))){static get is(){return"bbva-feature-investment-proposal"}static get scopedElements(){const t=[L,G,V,F,K,M,pt,B];return Ye.scopedElementsFromClasses(t)}static get styles(){return[N.primary,mt.primary,W.primary,Q.primary,H.primary,X.primary,q.primary,j.primary,Je,r("bbva-feature-investment-proposal-shared-styles")]}static get properties(){return{proposalDetail:{type:Object},currency:{type:String,attribute:"currency"},language:{type:String,attribute:"language"},_barValues:{type:Array},_barColor:{type:Array},_strategySectionTitle:{type:String},_strategySectionDescription:{type:String},_strategySectionSubtitle:{type:String}}}constructor(){super(),this._barValues=[],this._barColor=[],this._strategySectionTitle="",this._strategySectionDescription="",this._strategySectionSubtitle="",this.currency="",this.language=""}updated(t){t.has("proposalDetail")&&this._updateVisualization()}_updateVisualization(){this._barValues=[];const{strategies:t}=this.proposalDetail,e=t.length,s=e>1?"plural":"singular";this._barColor=e>1?[l.primaryMediumLight,l.primaryVariant,l.tertiaryType3,l.tertiaryType2]:[l.tertiaryType2],this._strategySectionTitle=this.t(`bbva-investment-proposal-detail-${s}-strategies-header`),this._strategySectionDescription=this.t(`bbva-investment-proposal-detail-${s}-strategies-description`),this._strategySectionSubtitle=this.t(`bbva-investment-proposal-detail-${s}-strategies-distribution-label`),t.forEach(((t,e)=>{const s={currentValue:t.strategyPercentage,bgColor:this._barColor[e],accessibilityLabel:t.strategyName};this._barValues.push(s)}))}get _editAmountTpl(){return o`
      <bbva-type-text
        size="S"
        text="${this.t("bbva-investment-proposal-detail-profile-description")}">
      </bbva-type-text>
        <div class="invest-amount-composition">
          <div class="amount-label">
            <bbva-type-text
              size="S"
              tag="span"
              font-weight="${c.fontWeight40}"
              text="${this.t("bbva-investment-proposal-detail-invest-amount-label")}">
            </bbva-type-text>
            <bbva-type-amount
              variant="S"
              language="${this.language}"
              currency-code="${this.currency}"
              local-currency="${this.currency}"
              amount="${this.proposalDetail.currentAmount}">
            </bbva-type-amount>
          </div>
          <bbva-type-link
            variant="icon"
            icon-size="24"
            icon=${d()}
            @click="${()=>this._dispatchCustomEvent("proposal-detail-show-amount-change",{amount:this.proposalDetail.currentAmount})}">
          </bbva-type-link>
      </div>
    </div>
    `}get _investScenariosTpl(){return o`
      <bbva-type-text
        size="S"
        font-weight="${c.fontWeight40}"
        class="generic-subtitle"
        text="${this.t("bbva-investment-proposal-detail-future-amount-description",{term:this.proposalDetail.term})}">
      </bbva-type-text>
      <div class="microillustration-composition">
        <bbva-clip-microillustration
          size="S"
          class="illustration"
          microillustration="moneygraphic">
        </bbva-clip-microillustration>
        <div class="description">
          <bbva-type-text
            size="S"
            tag="span"
            font-weight="${c.fontWeight40}"
            text="${this.t("bbva-investment-proposal-detail-future-amount-label")}">
          </bbva-type-text>
          <bbva-type-amount
            variant="S"
            language="${this.language}"
            currency-code="${this.currency}"
            local-currency="${this.currency}"
            amount="${this.proposalDetail.expectedAmount}">
          </bbva-type-amount>
        </div>
    </div>
    <bbva-type-link
      id="showProjections"
      class="future-link"
      @click="${()=>this._dispatchCustomEvent("proposal-detail-show-future-projections")}"
      text="${this.t("bbva-investment-proposal-detail-future-amount-link")}"></bbva-type-link>
    <bbva-notification-help
      class="future-notification"
      accessibility-label-icon="${this.t("bbva-feature-investment-portfolio-accessibility-label-icon")}"
      text="${this.t("bbva-investment-proposal-detail-future-amount-notification")}">
    </bbva-notification-help>
    <bbva-divider-default></bbva-divider-default>
    `}get _visualizationBarTpl(){return o`
      <bbva-data-visualization-bar
        title-medium
        bar-any-colors
        class="medium-padding-top"
        currency-code="${this.currency}"
        local-currency="${this.currency}"
        language="${this.language}"
        amount="${this.proposalDetail.currentAmount}"
        label="${this._strategySectionSubtitle}"
        .barValues=${this._barValues}>
      </bbva-data-visualization-bar>
    `}get _visualizationTooltipTpl(){return o`
      ${this.proposalDetail.strategies.map(((t,e)=>o`
        <div class="panel">
          <div class="content-wrapper">
            <div class="label-wrapper">
              <span class="legend legend-bar">
                <span style=${`background-color:${this._barColor[e]}`}></span>
              </span>
              <bbva-type-text
                lines="1"
                unset
                size="S"
                class="label"
                alignment="left"
                text="${t.strategyName}"
                font-weight="${c.fontWeight40}">
              </bbva-type-text>
              <bbva-type-text
                lines="1"
                unset
                size="S"
                class="description"
                alignment="right"
                text="${t.strategyPercentage} %"
                font-weight="${c.fontWeight40}">
              </bbva-type-text>
            </div>
          </div>
        </div>
        <bbva-type-text
          size="S"
          tag="span"
          class="medium-padding-top"
          text="${t.strategyshortDescription}">
        </bbva-type-text>
        <bbva-type-link
          class="generic-link"
          id="strategy${e}"
          @click="${()=>this._dispatchCustomEvent("proposal-detail-show-strategy-detail",{fundName:t.fundName})}">
          ${this.t("bbva-investment-proposal-detail-strategies-distribution-see-details-label")}
        </bbva-type-link>
        <bbva-divider-default></bbva-divider-default>
      `))}
    `}get _investStrategyTpl(){return o`
      <bbva-type-text
        size="XL"
        font-weight="${c.fontWeight40}"
        text="${this._strategySectionTitle}">
      </bbva-type-text>
      <bbva-type-text
        size="S"
        text="${this._strategySectionDescription}" >
      </bbva-type-text>
      ${this._visualizationBarTpl}
      ${this._visualizationTooltipTpl}
    `}get _investLinksTpl(){return o`
      <div class="large-padding-top">
        <bbva-type-link
          id="showGuide"
          icon-size="24"
          icon=${p()}
          class="generic-link"
          @click=${()=>this._dispatchCustomEvent("proposal-detail-show-guide-pdf")}>
          ${this.t("bbva-investment-proposal-detail-links-services-guide")}
        </bbva-type-link>
        <bbva-type-link
          id="shareProposal"
          icon-size="24"
          icon=${m()}
          class="generic-link"
          @click=${()=>this._dispatchCustomEvent("proposal-detail-show-proposal-pdf")}
          >
          ${this.t("bbva-investment-proposal-detail-links-share-proposal")}
        </bbva-type-link>
        <div class="hiring-button">
          <bbva-button-default
            id="startHiring"
            fullwidth
            @click="${()=>this._dispatchCustomEvent("proposal-detail-go-to-hiring")}"
            text="${this.t("bbva-investment-proposal-detail-start-hiring-button")}">
          </bbva-button-default>
        </div>
      </div>
      `}render(){return o`
      ${this._editAmountTpl}
      ${this._investScenariosTpl}
      ${this._investStrategyTpl}
      ${this._investLinksTpl}
    `}}var Ze=n`
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

[data-tag-name=bbva-transition-container] {
  --bbva-transition-container-padding: 0;
  --bbva-transition-container-text-align: left;
}

.two-texts-container-columns {
  display: flex;
  justify-content: space-between;
  padding-top: 1rem;
}

.padding-top-void {
  padding-top: 0;
}

.padding-top-default {
  padding-top: 1rem;
}

.content-account:hover {
  background-color: var(--colorsSecondary100, ${u(l.secondary100)});
}

.expandable-amount {
  padding-left: 1rem;
  padding-right: 1rem;
}

.panel-container {
  justify-content: space-between;
  display: flex;
}

.pdf-link-padding-left {
  padding-left: 0;
}

.kb-terms-conditions {
  padding-bottom: 1rem;
}

.pdf-link-padding-bottom {
  padding-bottom: 0.5rem;
}

.content-notice-privacy {
  padding-left: 0.9375rem;
  border-right-width: 0;
  padding-right: 1.3125rem;
}

.wrapper {
  background-color: var(--colorsPrimaryCoreLightened, ${u(l.primaryCoreLightened)});
  border-right: 1.0625rem solid transparent;
  width: auto;
}

.render-confirm-message {
  margin-bottom: 1rem;
  margin-top: 1.5rem;
}

.wrapper-icon-title {
  position: relative;
  min-height: 1.5rem;
}

.wrapper-icon-title [data-tag-name=bbva-type-icon] {
  position: absolute;
  margin-top: 0;
}

.privacy-link {
  padding-left: 0;
  padding-top: 1rem;
  padding-bottom: 1rem;
}

.icon-privacy {
  width: 1.25rem;
  height: 0.9375rem;
}

.title {
  text-indent: 1.5rem;
}

.complete-terms-check {
  padding-top: 0.625rem;
}

.email-section {
  margin-top: 1rem;
  margin-bottom: 1rem;
}

.check-box-margin {
  margin-left: -1rem;
}

.panel-container-summary {
  justify-content: space-between;
  display: flex;
  height: 3.4375rem;
  padding-top: 0;
}

[data-tag-name=bbva-help-modal][visible] {
  transform: translateZ(0.1px);
}
`;const ts={checkboxContent:[{title:"bbva-investment-checkbox-multistep-my-profile-title",option:"accepted-1"},{title:"bbva-investment-checkbox-multistep-my-contract-title",option:"accepted-2"},{title:"bbva-investment-checkbox-multistep-prospectuses-title",option:"accepted-3"},{title:"bbva-investment-checkbox-multistep-beneficiaries-title",option:"accepted-4"}]};var es=n`
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

[data-tag-name=bbva-transition-container] {
  --bbva-transition-container-padding: 0;
  --bbva-transition-container-text-align: left;
}

.two-texts-container-columns-complete {
  display: flex;
  justify-content: space-between;
}

.expandable-amount {
  padding-left: 1rem;
  padding-right: 1rem;
}

.pdf-link-padding-left {
  padding-left: 0;
}

.kb-terms-conditions {
  padding-bottom: 1rem;
}

.pdf-link-padding-bottom {
  padding-bottom: 0.5rem;
}

.padding-top-default {
  padding-top: 1rem;
}

.top-and-bottom-padding {
  margin-bottom: 0.5rem;
}

[data-tag-name=bbva-help-modal][visible] {
  transform: translateZ(0.1px);
}
`;class ss extends(I(k(a(s)))){static get is(){return"bbva-feature-invest-hiring-complete-multistep"}static get scopedElements(){const t=[ct,Z,dt,M,L,V,tt,U,G,ss,F,et];return ss.scopedElementsFromClasses(t)}static get properties(){return{amountToInvest:{type:Number},capitalPreservation:{type:Array},customerEmail:{type:String},investNumber:{type:String},objectDataHiring:{type:Object},orderError:{type:Boolean},originAccount:{type:String},orderDataHiring:{type:Array},_openDocumentsModal:{type:Boolean},currency:{type:String,attribute:"currency"},_distributionListReceipt:{type:Array}}}constructor(){super(),this.amountToInvest=0,this.capitalPreservation=[],this.customerEmail="",this.investNumber="0",this.objectDataHiring={},this.orderError=!1,this.originAccount="0",this.orderDataHiring=[],this._openDocumentsModal=!1,this.currency="",this._distributionListReceipt=[]}successfulHiringHeader(){return o`
          <bbva-clip-microillustration microillustration="${this.objectDataHiring.ilustration}"> </bbva-clip-microillustration>
          <bbva-type-text text="${this.t(this.objectDataHiring.title)}" size="L" font-weight="${c.fontWeight50}"></bbva-type-text>
          <bbva-type-text text="${this.t("bbva-investment-contracting-success-amount-aprox-title")}" size="XS" ?hidden="${this.orderError}" ></bbva-type-text>
          <bbva-type-amount class="top-and-bottom-padding" variant="l" amount="${this.amountToInvest}" currency-code="${this.currency}" local-currency="${this.currency}" type="bold"  language="${this.language}" ?hidden="${this.orderError}"></bbva-type-amount>
          <bbva-type-text text="${this.t("bbva-investment-contracting-content-title")}" size="XS" tag="span"  ?hidden="${this.orderError}"></bbva-type-text>
          ${this.detailsDateHiring()}
    `}detailsDateHiring(){var t,e,s;return o`
      <div class="padding-top-default">
        <div class="two-texts-container-columns-complete">
          <bbva-type-text class="top-and-bottom-padding"
            text="${this.t("bbva-investment-date-success-date")}"
            size="XS"
            alignment="right"
            tag="span"
          ></bbva-type-text>
          <bbva-type-date
            class="top-and-bottom-padding"
            font-weight="${c.fontWeight50}"
            font-style="italic"
            date="${null===(t=this.objectDataHiring)||void 0===t?void 0:t.date}"
            options="${'{"day":"2-digit","month":"short","year":"numeric","hour":"2-digit","minute":"2-digit"}'}">
          </bbva-type-date>
        </div>
        <div class="two-texts-container-columns-complete">
          <bbva-type-text class="top-and-bottom-padding" text="${this.t("bbva-investment-date-success-origin")}" size="XS" tag="span"></bbva-type-text>
          <bbva-type-text class="top-and-bottom-padding" text="${this.t("bbva-investment-feature-name-bbva-invest-number-account",{accountNumber:null===(e=this.originAccount)||void 0===e?void 0:e.slice(-4)})}" size="XS" font-weight="${c.fontWeight50}" alignment="right" tag="span"></bbva-type-text>
        </div>
        <div class="two-texts-container-columns-complete">
          <bbva-type-text class="top-and-bottom-padding" text="${this.t("bbva-investment-date-success-destination")}" size="XS" tag="span"></bbva-type-text>
          <bbva-type-text class="top-and-bottom-padding" text="${this.t("bbva-investment-feature-name-bbva-invest-number-contract",{investNumber:null===(s=this.investNumber)||void 0===s?void 0:s.slice(-4)})}" size="XS" font-weight="${c.fontWeight50}" alignment="right" tag="span"></bbva-type-text>
        </div>
      </div>
    `}detailsHiring(){var t;return o`
    <div>
      <bbva-type-text text="${this.t("bbva-investment-date-success-detail")}" size="XS" font-weight="${c.fontWeight40}" text-color="${l.secondary500}"></bbva-type-text>
      <div class="two-texts-container-columns-complete">
        <bbva-type-text class="top-and-bottom-padding" text="${this.t("bbva-investment-date-success-type-operation")}" size="XS" tag="span"></bbva-type-text>
        <bbva-type-text class="top-and-bottom-padding" text="Contratación Invest" size="XS" font-weight="${c.fontWeight50}" alignment="right" tag="span"></bbva-type-text>
      </div>
      <div class="two-texts-container-columns-complete">
        <bbva-type-text class="top-and-bottom-padding" text="${this.t("bbva-investment-date-success-number-contract")}" size="XS" tag="span"></bbva-type-text>
        <bbva-type-text class="top-and-bottom-padding" text="${null===(t=this.investNumber)||void 0===t?void 0:t.slice(-10)}" size="XS" font-weight="${c.fontWeight50}" alignment="right" tag="span"></bbva-type-text>
      </div>
      <div class="two-texts-container-columns-complete">
        <bbva-type-text class="top-and-bottom-padding" text="${this.t("bbva-investment-date-success-operation-folio")}" size="XS" tag="span"></bbva-type-text>
        <bbva-type-text class="top-and-bottom-padding" text="${this.objectDataHiring.operationNumber}" size="XS" font-weight="${c.fontWeight50}" alignment="right" tag="span"></bbva-type-text>
      </div>
    </div>
    `}investmentDistribution(){var t;return this.orderError?o``:o`
        <div>
          <bbva-type-text text="${this.t("bbva-investment-success-distribution")}" size="XS" font-weight="${c.fontWeight40}" text-color="${l.secondary500}"></bbva-type-text>
        ${null===(t=this.capitalPreservation)||void 0===t?void 0:t.map((t=>o`
              <div class="two-texts-container-columns-complete">
                <bbva-type-text class="top-and-bottom-padding" text="${t.strategyName}" size="XS" tag="span"></bbva-type-text>
                <bbva-type-text class="top-and-bottom-padding" text="${t.strategyPercentage}%" size="XS" font-weight="${c.fontWeight50}" alignment="right" tag="span"></bbva-type-text>
              </div>
            `))}
        </div>
      `}statusHiring(){var t,e;const s=null!==(t=this.objectDataHiring)&&void 0!==t&&t.contentMessageSecondary?`${this.t(this.objectDataHiring.contentMessage)}<br><br>${this.t(null===(e=this.objectDataHiring)||void 0===e?void 0:e.contentMessageSecondary)}`:this.t(this.objectDataHiring.contentMessage);return o`
      <bbva-notification-message
        variant="${this.objectDataHiring.variant}"
        message-title="${this.objectDataHiring.statusTitle}"
        message="${s}">
      </bbva-notification-message>
    `}sharingContract(){return o`
      <bbva-type-text text="${this.t("bbva-investment-success-email-confirmation")}" size="XS"></bbva-type-text>
      <bbva-type-text text="${this.customerEmail.toLowerCase()}" font-weight="${c.fontWeight50}" size="XS" tag="span"></bbva-type-text>
      ${this.iconsShared()}
    `}iconsShared(){return o`
      <div class="padding-top-default">
        <bbva-button-row  ambient="primary-alt" variant="simple" @button-row-item-click  accessibility-text="Share button"
          .options="${[{icon:p(),label:this.t("bbva-feature-investment-portfolio-view-documents"),id:"button-documents"},{icon:m(),label:this.t("bbva-investment-portfolio-shared-receipt"),id:"button-share"}]}"
    @button-row-item-button-documents-click="${this._documentsHiring}"
    @button-row-item-button-share-click="${()=>{this._dispatchCustomEvent("investment-portfolio-hiring-share-receipt",{operative:"bbvaInvestOperationReceipt"})}}"
  >
        </bbva-button-row>
      </div>
        `}_modalDocumentStatus(t){t.detail||(this._openDocumentsModal=!1)}_obtainProfilingComplete(){this._dispatchCustomEvent("generate-documents-hirings",{document:"profiling"})}_obtainContractComplete(){this._dispatchCustomEvent("generate-documents-hirings",{document:"contract"})}_reasonablenessLetterComplete(){this._dispatchCustomEvent("generate-documents-hirings",{document:"reasonablenessLetter"})}_modalDocuments(){return o`
      <bbva-help-modal id="modalDocument" full-height fixed-footer
      header-text="${this.t("cells-hiring-success-screen-documents-title")}"
      ?visible="${this._openDocumentsModal}"
      @visible-changed="${this._modalDocumentStatus}" >

      <div class="content" slot="slot-content">
        <div>
          <bbva-type-link 
            id="profilingComplete" 
            class="pdf-link-padding-left pdf-link-padding-bottom" 
            @click="${this._obtainProfilingComplete}" 
            icon="${p()}" 
            text="${this.t("bbva-investment-profiling-pdf-profile-invest")}"
          ></bbva-type-link>
          <bbva-type-text
                  class="kb-terms-conditions"
                  text="${this.t("bbva-feature-investment-portfolio-document-size")}"
                  size="2XS"
                  tag="span"
                  font-style="italic"
          ></bbva-type-text>
        </div>
        <bbva-divider-default size="full"></bbva-divider-default>
        <div>
          <bbva-type-link 
            id="contractComplete" 
            class="pdf-link-padding-left pdf-link-padding-bottom" 
            @click="${this._obtainContractComplete}" 
            icon="${p()}" 
            text="${this.t("bbva-investment-profiling-pdf-contract-invest")}"
          ></bbva-type-link>
          <bbva-type-text
                  class="kb-terms-conditions"
                  text="${this.t("bbva-feature-investment-portfolio-document-size")}"
                  size="2XS"
                  tag="span"
                  font-style="italic"
          ></bbva-type-text>
        </div>
        <bbva-divider-default size="full"></bbva-divider-default>
        <div>
          <bbva-type-link 
            id="letterComplete" 
            class="pdf-link-padding-left pdf-link-padding-bottom" 
            @click="${this._reasonablenessLetterComplete}" 
            icon="${p()}" 
            text="${this.t("bbva-investment-profiling-pdf-letter-invest")}"
          ></bbva-type-link>
          <bbva-type-text
                  class="kb-terms-conditions"
                  text="${this.t("bbva-feature-investment-portfolio-document-size")}"
                  size="2XS"
                  tag="span"
                  font-style="italic"
          ></bbva-type-text>
        </div>
      </div>
      </bbva-help-modal>
    `}_documentsHiring(){this._openDocumentsModal=!0}_shareReceiptBody(){var t,e,s,i,n;this._distributionListReceipt=null===(t=this.capitalPreservation)||void 0===t?void 0:t.map(((t,e)=>({key:`cells-share-operative-receipt-bbva-invest-distribution${e+1}`,fund:{name:t.strategyName,percentage:t.strategyPercentage}})));const a={templateSelected:"bbvaInvestOperationReceipt",title:"cells-share-operative-receipt-bbva-invest-title",destination:{avatar:{src:"./images/official-document.svg"}},operationOrderReceipt:[{key:"cells-share-operative-receipt-bbva-invest-amount-to-invest",amount:{amount:this.amountToInvest,currency:this.currency},class:"bold spacing"},{key:"cells-share-operative-receipt-bbva-invest-hour-date",value:null===(e=this.objectDataHiring)||void 0===e?void 0:e.date,class:"spacing light-key bold-value"},{key:"cells-share-operative-receipt-bbva-invest-origin-account",value:null===(s=this.originAccount)||void 0===s?void 0:s.slice(-4)},{key:"cells-share-operative-receipt-bbva-invest-destination-account",value:null===(i=this.investNumber)||void 0===i?void 0:i.slice(-4)},{key:"cells-share-operative-receipt-bbva-invest-details",value:"cells-share-operative-receipt-bbva-invest-details"},{key:"cells-share-operative-receipt-bbva-invest-type-of-operation",value:this.t("bbva-investment-success-header-title")},{key:"cells-share-operative-receipt-bbva-invest-origin-contract",value:null===(n=this.investNumber)||void 0===n?void 0:n.slice(-10)},{key:"cells-share-operative-receipt-bbva-invest-order-folio",value:this.objectDataHiring.operationNumber},{key:"cells-share-operative-receipt-bbva-invest-distribution-title",value:"cells-share-operative-receipt-bbva-invest-distribution-title"},...this._distributionListReceipt]};this._dispatchCustomEvent("investment-portfolio-hiring-set-data",a)}investHiringSuccess(t){var e,s,i,n,a,r,o,c,l;t||this.orderError||(this.objectDataHiring={ilustration:"success",variant:"default",title:"bbva-investment-contracting-success",statusTitle:"bbva-investment-success-message-title",contentMessage:"bbva-investment-success-message-content",date:moment(null===(e=this.orderDataHiring)||void 0===e?void 0:e.operationDate).format(),operationNumber:null===(s=this.orderDataHiring)||void 0===s||null===(i=s.orders)||void 0===i?void 0:i.find((t=>t.operationNumber)).operationNumber});t&&!this.orderError&&(this.objectDataHiring={ilustration:"pending",variant:"default",title:"bbva-investment-contracting-success-out-time",statusTitle:"bbva-investment-success--message-title",contentMessage:"bbva-investment-success-message-content-out-time",contentMessageSecondary:"bbva-investment-success-message-content-insufficient-out-time",date:moment(null===(n=this.orderDataHiring)||void 0===n||null===(a=n.orders)||void 0===a?void 0:a.find((t=>t)).schedule.creationDate).format(),operationNumber:null===(r=this.orderDataHiring)||void 0===r||null===(o=r.orders)||void 0===o?void 0:o.find((t=>t)).schedule.id});this.orderError&&(this.objectDataHiring={ilustration:"caution",variant:"caution",title:"bbva-investment-success-message-title-without-order",statusTitle:"bbva-investment-contracting-success-without-order",contentMessage:"bbva-investment-success-message-content-out-time-without-order",date:moment(null===(c=this.orderDataHiring)||void 0===c?void 0:c.openingDate).format(),operationNumber:null===(l=this.orderDataHiring)||void 0===l?void 0:l.investmentFundId});return this.objectDataHiring}static get styles(){return[q.primary,J.primary,X.primary,Q.primary,ht.primary,Y.primary,N.primary,j.primary,es,r("bbva-feature-invest-hiring-complete-multistep-shared-styles")]}render(){if(""!==this.orderDataHiring){var t,e;const s=(null===(t=this.orderDataHiring)||void 0===t||null===(e=t.orders)||void 0===e?void 0:e.find((t=>"schedule"in t)))??!1;return this.investHiringSuccess(s),o`
          <div slot="content"  class="expandable-amount">
            ${this.successfulHiringHeader()}
            ${this.detailsHiring()}
            ${this.investmentDistribution()}
            ${this.statusHiring()}
            ${this.sharingContract()}
            ${this._modalDocuments()}
            ${this._shareReceiptBody()}
          </div>
      `}return o``}}class is extends(I(k(a(s)))){static get is(){return"bbva-feature-invest-hiring-multistep"}static get scopedElements(){const t=[P,it,T,U,Z,D,$,V,nt,z,dt,L,tt,G,B,M,is,ss];return is.scopedElementsFromClasses(t)}static get properties(){return{_accountName:{type:String},_accountAlias:{type:String},_accountAmount:{type:Number},accountSelected:{type:Array},accountDataObject:{type:Array},amountToInvest:{type:Number},buttonDisabled:{type:Boolean},customerEmail:{type:String},financialOverview:{type:Object},hiddenProposalDetail:{type:Boolean},investmentFundNumber:{type:String},nameRiskProfile:{type:String},orderDataHiring:{type:Array},orderError:{type:Boolean},_originalProductNumber:{type:String},openPrivacyModal:{type:Boolean},proposalDetailObject:{type:Array},profileToInvest:{type:String},switchPage:{type:Boolean},_allStepCompleted:{type:Boolean},_errorAccountInsufficient:{type:Boolean},_headerVariant:{type:String},switchComplete:{type:Boolean},_openExitModal:{type:Boolean},_showMultistepHiring:{type:Boolean},currency:{type:String,attribute:"currency"}}}constructor(){super(),this._accountName="",this._accountAlias="",this._accountAmount=0,this.accountSelected=[],this.accountDataObject=[],this.amountToInvest=0,this.buttonDisabled=!1,this.customerEmail="",this.financialOverview={},this.hiddenProposalDetail=!1,this.investmentFundNumber="",this.nameRiskProfile="",this.orderDataHiring=[],this.orderError=!1,this._originalProductNumber="0",this.openPrivacyModal=!1,this.proposalDetailObject=[],this.profileToInvest="",this.switchPage=!1,this._allStepCompleted=!1,this._errorAccountInsufficient=!1,this._headerVariant="modal-initial",this.switchComplete=!1,this._openExitModal=!1,this._showMultistepHiring=!1,this.currency=""}static get styles(){return[Ze,j.primary,Y.primary,w.primary,st.primary,O.primary,q.primary,Q.primary,X.primary,H.primary,ht.primary,r("bbva-feature-invest-hiring-multistep-shared-styles")]}_resetMultistepComplete(){this.switchPage=!1,this._openExitModal=!1,this._headerVariant="modal-initial",this._accountName="",this._accountAlias="",this._accountAmount=0,this.switchComplete=!1,this._allStepCompleted=!1,this.buttonDisabled=!1,this.hiddenProposalDetail=!1,this._dispatchCustomEvent("reset-hiring-complete-screen")}_resetMultistep(){this.switchPage=!1,this._openExitModal=!1,this._headerVariant="modal-initial",this._accountName="",this._accountAlias="",this._accountAmount=0,this._allStepCompleted=!1,this._showMultistepHiring=!1,this.buttonDisabled=!1,this.hiddenProposalDetail=!1,this._dispatchCustomEvent("reset-hiring-to-proposal")}_modalStatus(t){t.detail||(this._openExitModal=!1)}updated(t){t.has("switchComplete")&&this.switchComplete&&(this.switchComplete=!0,this._showMultistepHiring=!1,this._dispatchCustomEvent("bbva-feature-investment-portfolio-hiring-trace-event",{pageName:"pagina exitosa",step:"pagina exitosa",amount:this.amountToInvest,operationNumber:this._operationNumber,channel:"app-completed-finished"})),t.has("switchPage")&&this.switchPage&&(this._showMultistepHiring=!0,this._dispatchCustomEvent("bbva-feature-investment-portfolio-hiring-trace-event",{channel:"app-page-visited-associated-accounts"}))}modalExit(){return o`
      <bbva-help-modal
        id="exitHelpModal"
        class="exit-modal"
        header-text="${this.t("bbva-investment-exit-hiring-header-text")}"
        title-icon="${h()}"
        body-text="${this.t("bbva-investment-exit-hiring-body-text")}"
        button-text="${this.t("bbva-investment-exit-hiring-button")}"
        link-text="${this.t("bbva-feature-investment-portfolio-button-text")}"
        modal-type="caution"
        illustration="success"
        hide-content-padding-top
        ?visible="${this._openExitModal}"
        @help-modal-footer-button-click="${this._resetMultistep}"
        @visible-changed="${this._modalStatus}"
      ></bbva-help-modal>
    `}_edit(){this._headerVariant="modal-initial",this.hiddenProposalDetail=!1}_handlerVariantHeader(t){this._headerVariant=t.detail.completed?"modal-initial-secondary":"modal-initial"}setDataAccountSelected(){var t;const e=null===(t=this.financialOverview)||void 0===t?void 0:t.contracts.filter((t=>t.number));this._accountName=null==e?void 0:e.find((t=>t.number===this.accountSelected[0].number)).alias,this._accountAlias=this.accountSelected[0].number,this._accountAmount=this.accountSelected[0].availableBalance.currentBalances[0].amount,this._originalProductNumber=this.accountSelected[0].number}_nextStep({target:t}){this._allStepCompleted=!0,this.hiddenProposalDetail=!0,t.dispatchEvent(new CustomEvent("complete",{bubbles:!0,composed:!0}))}_obtainAmount({target:t}){var e;if(this.accountSelected=[t.value],this._accountAmount=parseFloat(null===(e=this.accountSelected[0])||void 0===e?void 0:e.availableBalance.currentBalances[0].amount),this._accountAmount>=parseFloat(this.amountToInvest)){this._allStepCompleted&&this._nextStep({target:t}),this._headerVariant="modal-initial-secondary",this.setDataAccountSelected();const e=this.shadowRoot.querySelectorAll('[data-tag-name="bbva-expandable-step"]');e[2].active=!this._allStepCompleted,e[2].completed=!!this._allStepCompleted,this._dispatchCustomEvent("bbva-feature-investment-portfolio-hiring-trace-event",{pageName:"1 cuentas asociadas",step:"seleccionar cuenta",channel:"app-started-associated-accounts"}),t.dispatchEvent(new CustomEvent("complete",{bubbles:!0,composed:!0}))}else this._errorAccountInsufficient=!0}_privacyModalHandler(){this.openPrivacyModal=!0}_modalPrivacityStatus(t){t.detail||(this.openPrivacyModal=!1)}_amountChangeVisibilityError(t){t.detail||(this._errorAccountInsufficient=!1)}proposalDetailSetData(){var t;const e=this.t(this.proposalDetailObject.profile.name);return this.nameRiskProfile={Tradicional:"TRADITIONAL",Conservador:"CONSERVATIVE",Moderado:"MODERATE",Agresivo:"AGGRESSIVE"}[e],this.amountToInvest=this.proposalDetailObject.amount,this.profileToInvest=this.proposalDetailObject.profile.name,null===(t=this.proposalDetailObject)||void 0===t?void 0:t.strategies.map((t=>o`
                  <div slot="capital-invest" class="two-texts-container-columns">
                      <bbva-type-text text="${t.strategyName}" size="XS" tag="span" ambient="secondary"></bbva-type-text>
                      <bbva-type-text text="${t.strategyPercentage} %" ambient="secondary" size="2XS" tag="span"></bbva-type-text>
                  </div>
        `))}renderProposalDetail(){return o`
              <bbva-expandable-step id="expandableProposalPetail" header="${this.t("bbva-investment-step-all-complete-title")}" prefilled hide-divider hide-padding-top hide-content-padding-top ?hidden="${!this.hiddenProposalDetail}">
                <div class="summary" slot="summary">
                  <div slot="amount-aprox-invest-all-step" class="padding-top-void ">
                    <bbva-type-text text="${this.t("bbva-investment-step-all-complete-subtitle")}" size="XS" tag="span" ambient="secondary"></bbva-type-text>
                    <bbva-type-amount variant="3xl" amount="${this.amountToInvest}" currency-code="${this.currency}" local-currency="${this.currency}" type="bold" ambient="secondary" language="${this.language}"></bbva-type-amount>
                  </div>
                  <div slot="profile-invest-all-step" class="two-texts-container-columns">
                    <bbva-type-text text="${this.t("bbva-investment-content-summary-profiling-invest")}" size="XS" tag="span" ambient="secondary"></bbva-type-text>
                    <bbva-type-text text="${this.profileToInvest}" size="XS" tag="span" ambient="secondary"></bbva-type-text>
                  </div>
                  <div slot="distribution-invest-all-step" class="two-texts-container-columns">
                    <bbva-divider-default size="small" ></bbva-divider-default>
                  </div>
                  <div slot="distribution-invest" class="padding-top-default">
                      <bbva-type-text text="${this.t("bbva-investment-distribution-invest-title")}" size="XS" font-weight="${c.fontWeight40}" tag="span" ambient="secondary"></bbva-type-text>
                  </div>
                  ${this.proposalDetailSetData()}
                  <div slot="distribution-invest-all-step" class="two-texts-container-columns">
                      <bbva-divider-default size="small" ></bbva-divider-default>
                  </div>
                </div>
              </bbva-expandable-step>
    `}listCards(){var t,e;const s=null===(t=this.financialOverview)||void 0===t||null===(e=t.contracts)||void 0===e?void 0:e.filter((t=>t.number));return this.accountDataObject.map(((t,e)=>{var i;return o`
      <div id="obtainAmount" class="content-account padding-top-default pdf-link-padding-bottom" .value="${t}" @click="${t=>{this._obtainAmount(t)}}" @keyup="${t=>{"Enter"===t.key&&this._obtainAmount(t)}}">
          <div .value="${t}" class="panel-container">
              <bbva-type-text class="expandable-amount" id="_accountName" .value="${t}" text="${null==s||null===(i=s.find((e=>e.number===t.number)))||void 0===i?void 0:i.alias}" size="M" variant="spotlight" tag="span" ></bbva-type-text>
              <bbva-type-amount class="expandable-amount" variant="m" .value="${t}" amount="${null==t?void 0:t.availableBalance.currentBalances[0].amount}" currency-code="${this.currency}" local-currency="${this.currency}" type="bold"  language="${this.language}"></bbva-type-amount>
            </div>
            <div .value="${t}" class="panel-container">
              <bbva-badge-reference class="expandable-amount" .value="${t}" number="${t.number}" size="XL"  ></bbva-badge-reference>
              <bbva-type-text class="expandable-amount" .value="${t}" text="${this.t("bbva-investment-avaliable-balance")}" size="S" tag="span" ></bbva-type-text>
            </div>
          </div>
          <div class="expandable-amount">
            ${e<this.accountDataObject.length-1?o`<bbva-divider-default size="full"></bbva-divider-default>`:""}
      </div>
        `}))}renderSummaryAssociatedAccount(){return o`
      <div>
          <div class="panel-container">
          <bbva-type-text font-weight="${c.fontWeight40}" class="expandable-amount" id="_accountName" text="${this._accountName}" size="M" ambient="secondary" tag="span" ></bbva-type-text>
          <bbva-type-amount class="expandable-amount" ambient="secondary" variant="m" amount="${this._accountAmount}" currency-code="${this.currency}" local-currency="${this.currency}" type="bold"  language="${this.language}" ></bbva-type-amount>
          </div>
          <div class="panel-container">
          <bbva-badge-reference class="expandable-amount" number="${this._accountAlias}" size="XL"  ></bbva-badge-reference>
          <bbva-type-text class="expandable-amount" text="${this.t("bbva-investment-avaliable-balance")}" size="S" tag="span" ></bbva-type-text>
          </div>
      </div>
      `}renderAssociatedAccount(){return o`
      <bbva-expandable-step
        id="renderAssociatedAccountStep"
        class="animation"
        header="${this.t("bbva-investment-header-multistep-associated-account-title")}"
        show-link
        hide-padding-left
        hide-padding-right
        hide-divider
        hide-content-padding-top
        @expandable-step-edit-step = "${t=>{this._edit(t)}}"
        disabled-target=".action"
        @expandable-step-complete-change="${t=>{this._stepCompletionStatusHandler(t,"associatedAccount")}}"
      >
          <div >
              <bbva-type-text class="expandable-amount" text="${this.t("bbva-investment-expandable-step-associated-account-content")}" size="XS" tag="span" ></bbva-type-text>
              <bbva-type-text class="expandable-amount padding-top-default" text="${this.t("bbva-investment-profiling-accounts-title")}" size="XS" text-color="${l.secondary500}" font-weight="${c.fontWeight40}" tag="span" ></bbva-type-text>
              ${this.listCards()}
          </div>
          <div class="summary" slot="summary">
              ${this.renderSummaryAssociatedAccount()}
          </div>
      </bbva-expandable-step>
    `}_obtainProfilingPDF(){this._dispatchCustomEvent("generate-documents-hirings",{productId:"PASIVOS",subproductId:"CONTRATACION"})}_obtainContractPDF(){this._dispatchCustomEvent("generate-documents-hirings",{productId:"PASIVOS",subproductId:"FONDOSINV"})}_reasonablenessLetter(){this._dispatchCustomEvent("generate-documents-hirings",{productId:"CONSUMO",subproductId:"RAZONABILIDAD"})}renderPdfTermsAndConditions(){return o`
            <div>
                <bbva-type-link
                  id="obtainProfilingPDF"
                  class="pdf-link-padding-left pdf-link-padding-bottom"
                  @click="${this._obtainProfilingPDF}"
                  icon="${p()}"
                  text="${this.t("bbva-investment-profiling-pdf-profile-invest")}"
                ></bbva-type-link>
                <bbva-type-text
                  class="kb-terms-conditions"
                  text="${this.t("bbva-feature-investment-portfolio-document-size")}"
                  size="2XS"
                  tag="span"
                  font-style="italic"
                ></bbva-type-text>
                <bbva-divider-default size="full"></bbva-divider-default>
                <bbva-type-link
                  id="obtainContractPDF"
                  class="pdf-link-padding-left pdf-link-padding-bottom"
                  @click="${this._obtainContractPDF}"
                  icon="${p()}"
                  text="${this.t("bbva-investment-profiling-pdf-contract-invest")}"
                ></bbva-type-link>
                <bbva-type-text
                  class="kb-terms-conditions"
                  text="${this.t("bbva-feature-investment-portfolio-document-size")}"
                  size="2XS"
                  tag="span"
                  font-style="italic"
                ></bbva-type-text>
                <bbva-divider-default size="full"></bbva-divider-default>
                <bbva-type-link
                  id="reasonablenessLetter"
                  class="pdf-link-padding-left pdf-link-padding-bottom"
                  @click="${this._reasonablenessLetter}"
                  icon="${p()}"
                  text="${this.t("bbva-investment-profiling-pdf-letter-invest")}"
                ></bbva-type-link>
                <bbva-type-text
                  class="kb-terms-conditions"
                  text="${this.t("bbva-feature-investment-portfolio-document-size")}"
                  size="2XS"
                  tag="span"
                  font-style="italic"
                ></bbva-type-text>
            </div>
    `}_clickCheckboxHandler(){const t=![...this.shadowRoot.querySelectorAll('[data-tag-name="bbva-form-checkbox"]')].find((t=>!1===t.checked));this.buttonDisabled=t}_renderCheckbox(){return ts.checkboxContent.map((t=>o`
        <div>
          <bbva-form-checkbox
            class="check-box-margin"
            value="${this.t(t.option)}"
            show-help-icon
            label="${this.t(t.title,{profile:this.t(this.profileToInvest)})}"
            label-out
            @change="${t=>{this._clickCheckboxHandler(t)}}"
          ></bbva-form-checkbox>
        </div>
      `))}_renderTermdAndConditions(){return o`
        <div class="content expandable-amount">
          <bbva-divider-default size="full" ?hidden="${!this._allStepCompleted}"></bbva-divider-default>
        </div>
        <bbva-expandable-step 
          id="expandableTermsAndContiditions"
          hide-divider
          class="animation"
          header="${this.t("bbva-investment-header-multistep-associated-account-step-title")}" 
          show-link
          @expandable-step-edit-step = "${t=>{this._edit(t)}}" 
          edit-label="${this.t("bbva-feature-investment-portfolio-multistep-review-label")}"
          disabled-target=".action"
          @expandable-step-complete-change="${t=>{this._stepCompletionStatusHandler(t,"termsAndConditions")}}">
            <div class="content">
                <bbva-type-text text="${this.t("bbva-investment-description-multistep-2")}" size="XS" tag="span" ></bbva-type-text>
                  ${this.renderPdfTermsAndConditions()}
                  ${this._renderCheckbox()}
                  ${this._noticeOfPrivacy()}
                <bbva-button-default id="buttonTermsAndConditions" fullwidth ?disabled=${!this.buttonDisabled}  text="${this.t("bbva-investment-profiling-continue-button")}" @click="${t=>{this._nextStep(t)}}" ></bbva-button-default>
            </div>
            <div class="summary" slot="summary">
                ${this._summaryNoticeOfPrivacy()}
            </div>
        </bbva-expandable-step>
    `}_titleNotificationMessage(t){return o`
      <bbva-type-text text="${this.t(t)}" class="title" unset size="3XS"></bbva-type-text>
    `}_messageNotificationComponent(t,e){return o`
        <div class="wrapper-icon-title">
            <bbva-type-icon aria-label="${this.t("bbva-feature-investment-portfolio-accessibility-label-privacy-icon")}" class="icon-privacy" role="img" .icon="${t}"></bbva-type-icon>
            ${this._titleNotificationMessage(e)}
          </div>
    `}_modalPrivacity(){return o`
      <bbva-help-modal id="modalPrivacity" full-height fixed-footer title-icon="${b()}"
      header-text="${this.t("bbva-investment-notice-of-privacy-title")}"
      body-text="${this.t("bbva-investment-notice-of-privacy-description")}"
      button-text="${this.t("bbva-investment-notice-of-privacy-button")}"
      ?visible="${this.openPrivacyModal}"
      @visible-changed="${this._modalPrivacityStatus}" >
      </bbva-help-modal>
    `}_modalErrorAccountInsufficientBalance(){this.amountToInvest=parseFloat(this.amountToInvest,10);const t=this.amountToInvest.toLocaleString(void 0,{minimumFractionDigits:2}).toString();return o`
      <bbva-help-modal
          id="modal-insufficient-funds"
          class="exit-modal"
          header-text="${this.t("bbva-investment-modal-error-insufficient-funds-title")}"
          title-icon="${g()}"
          body-text="${this.t("bbva-investment-modal-error-insufficient-funds-content",{amountToInvest:t})}"
          button-text="${this.t("bbva-feature-investment-portfolio-change-account")}"
          modal-type="warning"
          illustration="success"
          hide-content-padding-top
          ?visible="${this._errorAccountInsufficient}"
          @visible-changed="${this._amountChangeVisibilityError}"
        ></bbva-help-modal>
    `}_noticeOfPrivacy(){return o`
      <div slot="content" class="content-notice-privacy">
        ${this._messageNotificationComponent(v(),"bbva-investment-notice-of-privacy")}
        <bbva-type-link id="privacyLink" class="privacy-link" text="${this.t("bbva-investment-notice-of-privacy-link")}" @click="${this._privacyModalHandler}" size="2XS" ></bbva-type-link>
      </div>
    `}_summaryNoticeOfPrivacy(){return o`
        <div>
          <bbva-badge-icon icon="${_()}" description="${this.t("bbva-investment-accepted-terms")}" ambient="secondary">
          </bbva-badge-icon>
        </div>
        <div class="complete-terms-check">
          <bbva-divider-default size="small" ></bbva-divider-default>
        </div>
        <div class="panel-container-summary email-section">
          <div>
            <bbva-type-text text="${this.t("bbva-investment-client-email")}" size="XS" tag="span" ></bbva-type-text>
          </div>
            <bbva-type-text class="email-text-success" font-weight="${c.fontWeight40}" text="${this.customerEmail.toLowerCase()}" size="XS" alignment="right" tag="span" ></bbva-type-text>
        </div>
      `}_stepCompletionStatusHandler({detail:t},e){t&&("associatedAccount"===e?this._dispatchCustomEvent("bbva-feature-investment-portfolio-hiring-trace-event",{pageName:"2 terminos y condiciones",step:"2 terminos y condiciones",channel:"app-step-terms-conditions"}):"termsAndConditions"===e&&this._dispatchCustomEvent("bbva-feature-investment-portfolio-hiring-trace-event",{pageName:"3 confirmacion",step:"3 confirmacion",amount:this.amountToInvest,channel:"app-step-confirmation"}))}_confirmComplete(){this._dispatchCustomEvent("bbva-feature-investment-portfolio-hiring-trace-event",{pageName:"4 otp",step:"4 otp",amount:this.amountToInvest,channel:"app-step-otp"}),this._dispatchCustomEvent("send-data-to-portfolio",{productNumber:this._originalProductNumber,riskProfile:this.nameRiskProfile}),this._dispatchCustomEvent("request-hiring-operation"),this._showMultistepHiring=!1}_renderCompleteConfirm(){return o`
      <div class="wrapper" slot="confirmation">
        <bbva-notification-message class="render-confirm-message" message-title="${this.t("bbva-investment-all-step-complete-toast")}" book-title>
        </bbva-notification-message>
        <bbva-button-default id="allCompleteButton" fullwidth variant="positive" text="${this.t("bbva-investment-profiling-all-complete-button")}" @click="${this._confirmComplete}" class="button">
        </bbva-button-default>
      </div>
    `}headerMainComplete(){return o`
      <div slot="content-header" >
        <bbva-header-main
          id="headerMainComplete"
          variant="modal-initial"
          text="${this.t("bbva-investment-header-text-title")}"
          @header-main-icon-click="${this._resetMultistepComplete}">
        </bbva-header-main>
      </div>
    `}headerMainMultiStep(){return o`
      <div slot="content-header" >
        <bbva-header-main
          id="headerMainMultistep"
          variant="${this._headerVariant}"
          text="${this.t("bbva-investment-header-text-title")}"
          @header-main-icon-click="${this._exitModalHandler}">
        </bbva-header-main>
      </div>
    `}_exitModalHandler(){""!==this._accountName?this._openExitModal=!0:this._resetMultistep()}_renderMultistep(){return this.accountDataObject&&this.switchPage?o`
          <bbva-expandable-multistep
            id="mainMultistep"
            step-selector='[data-tag-name="bbva-expandable-step"]'
            @expandable-multistep-specific-step-scroll="${this._handlerVariantHeader}"
            offset-bottom="24"
            show-dividers="hide-all"
            ?edition-enabled="${this._allStepCompleted}"
          >
              <div slot="content">
                  ${this.renderProposalDetail()}
                  ${this.renderAssociatedAccount()}
                  ${this._renderTermdAndConditions()}
              </div>
              ${this._renderCompleteConfirm()}
          </bbva-expandable-multistep>
      `:o``}render(){return o`
      <bbva-transition-container
        id ="uno"
        ?visible="${this._showMultistepHiring}"
      >
        <div slot="slot-content" >
          ${this.headerMainMultiStep()}
          ${this._renderMultistep()}
        </div>
      </bbva-transition-container>
      <bbva-transition-container
        id ="dos"
        ?visible="${this.switchComplete}"
        >
        <div slot="slot-content">
        ${this.headerMainComplete()}
        <bbva-feature-invest-hiring-complete-multistep
          .amountToInvest = "${this.amountToInvest}"
          .orderError = "${this.orderError}"
          .capitalPreservation = "${this.proposalDetailObject.strategies}"
          .customerEmail = "${this.customerEmail}"
          .orderDataHiring = "${this.orderDataHiring}"
          .investNumber = "${this.investmentFundNumber}"
          .originAccount = "${this._originalProductNumber}"
        ></bbva-feature-invest-hiring-complete-multistep>
        </div>
      </bbva-transition-container>
      ${this._modalErrorAccountInsufficientBalance()}
      ${this._modalPrivacity()}
      ${this.modalExit()}
    `}}const ns={accountType:{title:"bbva-feature-investment-portfolio-help-modal-error-account-type-title",message:"bbva-feature-investment-portfolio-help-modal-error-account-type-message",branch:"bbva-feature-investment-portfolio-help-modal-error-account-type-message-branch",button:"bbva-feature-investment-portfolio-help-modal-error-account-type-button",link:"bbva-feature-investment-portfolio-help-modal-error-account-type-link"},beneficiaries:{title:"bbva-feature-investment-portfolio-help-modal-error-beneficiaries-title",message:"bbva-feature-investment-portfolio-help-modal-error-beneficiaries-message",button:"bbva-feature-investment-portfolio-help-modal-error-beneficiaries-button",link:"bbva-feature-investment-portfolio-help-modal-error-beneficiaries-link",screen:"bbva-feature-investment-portfolio-help-modal-error-beneficiaries-message-screen",menu:"bbva-feature-investment-portfolio-help-modal-error-beneficiaries-message-menu",name:"bbva-feature-investment-portfolio-help-modal-error-beneficiaries-percentage-message-name",beneficiaries:"bbva-feature-investment-portfolio-help-modal-error-beneficiaries-message-beneficiaries",ready:"bbva-feature-investment-portfolio-help-modal-error-beneficiaries-message-ready"},beneficiariesPercentage:{title:"bbva-feature-investment-portfolio-help-modal-error-beneficiaries-percentage-title",message:"bbva-feature-investment-portfolio-help-modal-error-beneficiaries-percentage-message",button:"bbva-feature-investment-portfolio-help-modal-error-beneficiaries-percentage-button",link:"bbva-feature-investment-portfolio-help-modal-error-beneficiaries-percentage-link",screen:"bbva-feature-investment-portfolio-help-modal-error-beneficiaries-percentage-message-screen",menu:"bbva-feature-investment-portfolio-help-modal-error-beneficiaries-percentage-message-menu",name:"bbva-feature-investment-portfolio-help-modal-error-beneficiaries-percentage-message-name",beneficiaries:"bbva-feature-investment-portfolio-help-modal-error-beneficiaries-percentage-message-beneficiaries",ready:"bbva-feature-investment-portfolio-help-modal-error-beneficiaries-percentage-message-ready"}};var as=n`
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

[data-tag-name=bbva-transition-container] {
  --bbva-transition-container-text-align: left;
  z-index: auto;
}
[data-tag-name=bbva-transition-container]:not(.proposal-detail-container) {
  --bbva-transition-container-padding: 0;
}

.proposal-detail-container {
  --bbva-transition-container--custom--primary-ambient--content-bg-color: var(--colorsSecondary100, ${u(l.secondary100)});
}

.microillustration-composition {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 1rem 0rem 1rem 0rem;
}
.microillustration-composition .illustration {
  padding: 0.5rem;
}
.microillustration-composition .description {
  margin-left: 1rem;
  margin-right: auto;
  display: inline-grid;
}

.generic-link {
  padding-left: 0;
  padding-top: 1rem;
}

.close-button {
  margin-top: 1.5rem;
  margin-bottom: 1rem;
}

.amount-change-input-padding {
  padding: 0.5rem 0rem 2rem 0rem;
}

[data-tag-name=bbva-help-modal][visible] {
  transform: translateZ(0.1px);
}
`;class rs extends(I(k(a(s)))){static get is(){return"bbva-feature-investment-portfolio"}static get scopedElements(){const t=[F,_e,Ke,Ye,z,U,z,Ge,je,Ae,L,it,Be,F,G,ct,lt,at,is,Se,V,K,B,ut,Z,rt,...rs.configurationScopedElements()];return rs.scopedElementsFromClasses(t)}static get properties(){return{questionnaires:{type:Object},questionnairesFilter:{type:Object},questionariesOrder:{type:Array},isLoaded:{type:Boolean},_currentAccount:{type:Number},_errorOnCustomerAccounts:{type:Boolean},_errorData:{type:Object},_validAccounts:{type:Array},maxAmount:{type:Number},getQuestionnairesINIBody:{type:Object},getQuestionnairesPDVBody:{type:Object},currency:{type:String,attribute:"currency"},_newAmount:{type:Number},_buttonEnabled:{type:Boolean},_errorAmountMessage:{type:String},_strategyDetailVisibility:{type:Boolean},_futureProjectionsVisibility:{type:Boolean},_amountChangeVisibility:{type:Boolean},_proposalDetailVisible:{type:Boolean},_calculateRiskLevelsBody:{type:Object},showTestProfiling:{type:Boolean},showResultProfiling:{type:Boolean},showWelcomeProfiling:{type:Boolean},firstNameClient:{type:String},accountsApiVersion:{type:String,attribute:"accounts-api-version"},questionnairesApiVersion:{type:String,attribute:"questionnaires-api-version"},productsApiVersion:{type:String,attribute:"products-api-version"},risksApiVersion:{type:String,attribute:"risks-api-version"},investmentPortfolioApiVersion:{type:String,attribute:"investment-portfolio-api-version"},investmentFundsApiVersion:{type:String,attribute:"investment-funds-api-version"},businessDocumentsApiVersion:{type:String,attribute:"business-documents-api-version"},nameRiskProfile:{type:String},_futureProjections:{type:Object},_strategyDetail:{type:Object},hiringDetail:{type:Object},loadPortfolioFeature:{type:Boolean},_investmentPortfolioParams:{type:Object},currentAmount:{type:Number},_proposalDetail:{type:Object},_getFutureProjectionsBody:{type:Object},_listFundsParams:{type:Object},_createListOperationBody:{type:Object},_respondePDV:{type:Boolean},_hiringMultisteVisibility:{type:Boolean},_clientId:{type:String},customerEmail:{type:String},financialOverviewDetailsData:{type:Object},renderCompleteScreen:{type:Boolean},detailDocumentParams:{type:Object},_attemptNumberOnPostQuestionnaire:{type:Number},_errorOnPostQuestionnaire:{type:Boolean},_nameDocumentHiring:{type:String},_customerFullName:{type:String},_amountChange:{type:Object},_getBusinessDocumentsParams:{type:Object},_profilingResult:{type:Object},orderError:{type:Boolean},allowedAccounts:{type:Array},_errorOnInssuficientAmount:{type:Boolean},finalFundsCatalog:{type:Array}}}static get styles(){return[as,q.primary,j.primary,X.primary,W.primary,ot.primary,H.primary,r("bbva-feature--portfolio-shared-styles")]}constructor(){super(),this.config={loader:!0},this.questionnaires={},this.questionnairesFilter=[],this.questionariesOrder=[],this.isLoaded=!1,this._currentAccount=0,this._errorOnCustomerAccounts=!1,this._errorData={},this._validAccounts=[],this.showWelcomeProfiling=!1,this.showTestProfiling=!1,this.showResultProfiling=!1,this.firstNameClient="",this.nameRiskProfile="",this.maxAmount=0,this._newAmount=0,this._buttonEnabled=!1,this._errorAmountMessage="",this.currency="MXN",this.language="es-MX",this.orderError=!1,this._strategyDetailVisibility=!1,this._futureProjectionsVisibility=!1,this._amountChangeVisibility=!1,this._proposalDetailVisible=!1,this.maxAmount=0,this.showTestProfiling=!1,this.firstNameClient="",this.accountsApiVersion="1",this.questionnairesApiVersion="0",this.productsApiVersion="0",this.risksApiVersion="1",this.investmentPortfolioApiVersion="0",this.investmentFundsApiVersion="0",this.businessDocumentsApiVersion="0",this._futureProjections={},this.loadPortfolioFeature=!1,this._nameDocumentHiring="",this._customerFullName="",this._postDocumentsBody={documentTemplate:{id:"INVEST_PROPUESTA",version:"1.1",templateType:{id:"PDF"}},investment:{id:"GMCPROINVESTGL",term:"",level:"",format:"UGRM07J",portfolio:"",initialAmount:{amount:0,currency:"MXN"},complementaryAmount:{amount:0,currency:"MXN"},totalAmount:{amount:0,currency:""},prospect:{fullName:"",profile:{id:"",description:""}},strategy:{strategyType:"strategies",number:"",description:""}},channelName:"GLOMO"},this._strategyDetail={strategyName:"",fundDescription:"",fundName:"",fundSerie:"",fundHorizon:"",fundSchedule:"",fundLiquidity:"",documents:[]},this.currentAmount=0,this._respondePDV=!1,this._hiringMultisteVisibility=!1,this._clientId="",this.customerEmail="",this.allowedAccounts=[],this.renderCompleteScreen=!1,this.financialOverviewDetailsData={},this.detailDocumentParams={},this._attemptNumberOnPostQuestionnaire=0,this._errorOnPostQuestionnaire=!1,this._errorOnInssuficientAmount=!1,this._amountChange={currentAmount:0},this._profilingResult={category:"",description:"",level:""},this._getBusinessDocumentsParams={productId:"",subproductId:""},this._listFundsParams={"investment-fund-product-id":"EJOP",name:"",serie:""},this._getFutureProjectionsBody={initialContribution:0,addedContribution:{periodType:"MONTHLY",amount:0},fromProjectionDate:0,toProjectionDate:0,periodType:"MONTHLY",projectionTypes:["PESSIMISTIC","EXPECTED","OPTIMISTIC","CONTRIBUTED"]},this.hiringDetail={amount:0,profile:{name:"",level:0},strategies:[]},this._proposalDetail={strategies:[],currentAmount:0,expectedAmount:"",term:""},this._investmentPortfolioParams={currency:"MXN",expand:"strategies",riskProfile:0,"segment.id":123,initialContribution:0,addedContribution:0},this._createListOperationBody={relatedContract:{number:"",numberType:{id:"CCC"}},productClassification:{id:"20",classificationType:{id:"ASIN"}},riskLevelCategory:"",orders:[]},this._getQuestionnairesINIBody={questions:[{id:"1",questionOptions:[{id:"1",isSelected:!0,value:""}]},{id:"2",questionOptions:[{id:"1",isSelected:!0,value:0}]}],questionnaireType:{id:"INI"}},this._getQuestionnairesPDVBody={questions:[{id:"6",questionOptions:[]},{id:"1",questionOptions:[{id:"",isSelected:!0}]},{id:"5",questionOptions:[{id:"",isSelected:!0}]},{id:"2",questionOptions:[{id:"",isSelected:!0}]},{id:"3",questionOptions:[{id:"",isSelected:!0}]},{id:"4",questionOptions:[{id:"",isSelected:!0}]}],questionnaireType:{id:"PDV"}},this._calculateRiskLevelsBody={businessSector:{id:"INVEST"},questionnaire:{id:0}},this._createAssessmentBody={participantId:"",investmentPortfolioId:"",contractId:"",assessmentDate:"",initialContribution:{amount:"0",currency:"MXN"},investmentTerm:"SHORT_TERM",status:{id:"PROPOSED"}},this._createInvestmentFundBody={customerSegment:{description:"LEGAL_PERSON",id:"LEGAL_PERSON"},investmentManagement:{id:"DISCRETIONARY"},managementUnit:"444444",productClassification:{id:"20",jointType:{id:"JOINT"},productType:{id:"ASIN"},subproductType:{id:"INVEST"}},relatedContract:{number:"",numberType:{id:"CCC"},relationType:{id:"PAYING_ACCOUNT"}},riskProfile:{id:""},title:{id:"20"}},this._createFundOrderBody={productClassification:{id:"20"},orders:[]},this.finalFundsCatalog=[]}firstUpdated(){super.firstUpdated(),this._questionaries=this.shadowRoot.querySelector('[data-tag-name="bbva-local-questionnaires-api-dm"]'),this._risks=this.shadowRoot.querySelector('[data-tag-name="bbva-local-risks-risk-levels-calculate-api-dm"]'),this._investmentPortfolio=this.shadowRoot.querySelector('[data-tag-name="bbva-dataprovider-investment-portfolio"]'),this._products=this.shadowRoot.querySelector('[data-tag-name="bbva-dataprovider-products"]'),this._investmentFunds=this.shadowRoot.querySelector('[data-tag-name="bbva-dataprovider-investment-funds"]'),this._businessDocuments=this.shadowRoot.querySelector('[data-tag-name="bbva-local-business-documents-api-dm"]'),this._accountsDP=this.shadowRoot.querySelector('[data-tag-name="bbva-dataprovider-accounts"]')}updated(t){t.has("_amountChange")&&this._amountChange.currentAmount>0&&(this._newAmount=this._amountChange.currentAmount)}init(){this.showLoader("full",!1,!1),this._accountsDP.getAccounts()}_risksBGADM(){return o`
      <bbva-local-risks-risk-levels-calculate-api-dm
        requiredToken="${this.requiredToken}"
        .headers="${this.headers}"
        host="${this.host}"
        version=${this.risksApiVersion}
        ?native="${this.native}"
        @risks-risk-levels-calculate-api-dm-fetch="${this.manageResponseOnCalculateRiskLevels}"
        @risks-risk-levels-calculate-api-dm-fetch-error="${this.handleErrorOnCreateQuestionnaire}"
        >
      </bbva-local-risks-risk-levels-calculate-api-dm>
    `}capitalizeFirstLetterOfEachWord(t){return t.split(" ").map((t=>t.charAt(0).toUpperCase()+t.slice(1).toLowerCase())).join(" ")}_questionnairesBGADM(){return o`
      <bbva-local-questionnaires-api-dm
        requiredToken="${this.requiredToken}"
        .headers="${this.headers}"
        host="${this.host}"
        version="${this.questionnairesApiVersion}"
        ?native="${this.native}"
        @success-on-get-questionnaires="${this.manageResponseOnListQuestionnaires}"
        @error-on-get-questionnaires="${this.handleErrorOnCreateQuestionnaire}"
        @success-on-post-questionnaire="${this.manageResponseOnCreateQuestionnaire}"
        @error-on-post-questionnaire="${this.handleErrorOnCreateQuestionnaire}"
        @success-on-patch-questionnaire="${this.manageResponseOnUpdateQuestionnaire}"
        @error-on-patch-questionnaire="${this.handleErrorOnCreateQuestionnaire}"
      >
      </bbva-local-questionnaires-api-dm>
    `}_productsDataProvider(){return o`
      <bbva-dataprovider-products
        requiredToken="${this.requiredToken}"
        .headers="${this.headers}"
        host="${this.host}"
        version="${this.productsApiVersion}"
        ?native="${this.native}"
        @success-on-get-list-funds-event="${this.manageResponseOnListFunds}"
        @error-on-get-list-funds-event="${this.handleErrorOnCreateQuestionnaire}"
        >
      </bbva-dataprovider-products>
    `}_investmentPortfolioDataprovider(){return o`
      <bbva-dataprovider-investment-portfolio
        requiredToken="${this.requiredToken}"
        .headers="${this.headers}"
        host="${this.host}"
        version="${this.investmentPortfolioApiVersion}"
        ?native="${this.native}"
        @get-investment-portfolio-events-success="${this.manageResponseOnGetInvestmentPortfolio}"
        @error-on-investment-portfolio-events="${this.handleErrorOnCreateQuestionnaire}"
        @get-future-projections-events-success="${this.manageResponseOnGetFutureProjections}"
        @error-on-future-projections-events="${this.handleErrorOnCreateQuestionnaire}"
        @post-investment-portfolio-assessments-events-success="${this.postSuccessInvestmentPortfolioAssessments}"
        @error-on-investment-portfolio-assessments-events="${this.handleErrorOnCreateQuestionnaire}"
      >
      </bbva-dataprovider-investment-portfolio>
    `}_investmentFundsDataprovider(){return o`
      <bbva-dataprovider-investment-funds
        requiredToken="${this.requiredToken}"
        .headers="${this.headers}"
        host="${this.host}"
        version="${this.investmentFundsApiVersion}"
        ?native="${this.native}"
        @post-investment-funds-events-success="${this.createInvestmentFundSuccess}"
        @error-on-post-investment-funds-events="${this.handleErrorOnCreateQuestionnaire}"
        @post-validate-list-operations-events-success="${this.manageResponseOnValidateListOperations}"
        @error-on-post-validate-list-operations-events="${this.validateListOperationsResponseHandlerError}"
        @post-create-investment-funds-order-events-success="${this.createInvestmentFundOrderSuccess}"
        @error-on-post-create-investment-funds-order-events="${this.createInvestmentFundOrderError}"
        >
      </bbva-dataprovider-investment-funds>
    `}_businessDocumentsBGADM(){return o`
      <bbva-local-business-documents-api-dm
        requiredToken="${this.requiredToken}"
        .headers="${this.headers}"
        host="${this.host}"
        version="${this.businessDocumentsApiVersion}"
        ?native="${this.native}"
        @business-documents-api-dm-fetch="${this.manageResponseOnListBusinessDocuments}"
        @business-documents-api-dm-fetch-error="${this.handleErrorOnCreateQuestionnaire}"
        @post-investment-business-documents-api-dm-fetch="${this.manageResponseOnPostInvestmentBusinessDocuments}"
        @api-dm-error="${this.handleErrorOnCreateQuestionnaire}"
        @post-investment-business-documents-api-dm-fetch-error="${this.handleErrorOnCreateQuestionnaire}">
      </bbva-local-business-documents-api-dm>
    `}manageResponseOnListQuestionnaires({detail:[t]}){const{id:e,status:s,questions:i}=t,n=[3,5,6,7,4,1],[a]=e.split("|");this.loadPortfolioFeature=!0,this._calculateRiskLevelsBody.questionnaire.id=a,this._clientId=a,i.forEach(((t,e)=>{if("PDV"===t.category.id&&this.questionnairesFilter.length<7){if(t.order=n[e],t.description=Fe.questionsDescription[n[e]],t.questionsHeader=Fe.questionsHeader[n[e]],"1"===t.id){var s;const e=null===(s=t.questionOptions.find((t=>"S"===t.isSelected)))||void 0===s?void 0:s.id;this._termInvestmentNumber={1:1,2:3,3:5}[e],this._termInvestmentString={1:"1 año",2:"3 años",3:"5 años"}[e]}this.questionnairesFilter.push(t)}else if("INI"===t.category.id&&"1"===t.id&&this.questionnairesFilter.length<7){const[e]=t.questionOptions;this.currentAmount=e.value;const s=2;t.order=s,t.description=Fe.questionsDescription[s],t.questionsHeader=Fe.questionsHeader[s],this.questionnairesFilter.push(t)}})),this.questionnairesFilter=this.questionnairesFilter.sort(((t,e)=>t.order-e.order)),this.isLoaded=7===this.questionnairesFilter.length,"NEW"===s.id||0===this.questionnairesFilter.length?(this.showWelcomeProfiling=!0,this.clearLoader(),this._dispatchCustomEvent("bbva-feature-investment-portfolio-profiling-trace-event",{pageName:"bienvenida",channel:"page-view-welcome"})):this.showResultProfiling||7!==this.questionnairesFilter.length||this._risks.postCalculateRiskLevels(this._calculateRiskLevelsBody)}_postInvestmentFunds(){this.renderCompleteScreen&&(this.renderCompleteScreen=!1),this._createInvestmentFundBody.relatedContract.number=this._numberContract,this._createInvestmentFundBody.riskProfile.id=this._idRiskProfile,this._hiringMultisteVisibility=!1,this._profilingResultVisibility&&(this._profilingResultVisibility=!1),this._investmentFunds.version="0",this._investmentFunds.postInvestmentFunds(this._createInvestmentFundBody)}manageResponseOnListBusinessDocuments({detail:t}){let e="",s="",i="";if(""!==this._nameDocumentHiring)s=this._getDocumentType(this._nameDocumentHiring),i=t.filter((t=>t.customerDocument.documentInfo.description===s&&t.customerDocument.documentInfo.creationDate===moment().format("YYYY-MM-DD"))),this.detailDocumentParams.title=s,e=i.slice(-1).shift().id;else{const s=t.shift();e=s.id,this.detailDocumentParams.title=s.documentTemplate.id.charAt(0).toUpperCase()+s.documentTemplate.id.slice(1).toLowerCase()}this.detailDocumentParams.body={documentTemplate:{id:e,templateType:{id:"PDF"}}},this.detailDocumentParams.value=`${this.host}/business-documents/v0/business-documents`,this.detailDocumentParams.headers["Content-Type"]="application/json",this.clearLoader(),this._dispatchCustomEvent("native-request-pdf",this.detailDocumentParams)}onInternetDisconnection(){this._dispatchCustomEvent("bbva-feature-investment-portfolio-profiling-trace-event",{pageName:"error sin conexion a red",channel:"page-view-connection-error"})}_getDocumentType(t){const e={contract:"Contrato Fondos de Inversion",reasonablenessLetter:"Anexo de Razonabilidad de Inversion",profiling:"Acuse Perfil de Inversion"};return e[t]?e[t]:""}manageResponseOnValidateListOperations(t){if(0!==this._numberContract&&this._hiringMultisteVisibility)return this._validateListData=t,void this._postInvestmentFunds();this._proposalDetail.strategies=this._proposalDetail.strategies.map((e=>{const s=t.detail.orders.find((t=>t.fund.title.id===e.fundName)),i=s?s.fund.serie:null;return{...e,fundSerie:i}})),this._proposalDetailVisible=!0,this.clearLoader(),this._dispatchCustomEvent("bbva-feature-investment-portfolio-profiling-trace-event",{pageName:"propuesta personalizada",channel:"page-view-personalized-proposal"})}convertWordsToUpperCase(t){return t.toLowerCase().split(" ").map((t=>t.charAt(0).toUpperCase()+t.slice(1))).join(" ")}appSettingsFundsCatalog(t){this.finalFundsCatalog=t&&t.length>0?t:this.documentFundList}manageResponseOnListFunds({detail:t}){if(t.length>1)this._strategyFunds=this._proposalDetail.strategies.map((e=>{const s=t.find((t=>t.name===e.fundName));return s?{id:s.id,description:s.description,name:s.name}:null})).filter((t=>null!==t));else{var e,s,i,n,a,r,o,c,l,u,h,d,p,m,b;const g=(null===(e=this._strategyFunds)||void 0===e||null===(s=e.find((e=>e.name===t[0].name)))||void 0===s?void 0:s.description)||"",v=this.t("BBVAGF"===(null===(i=t[0])||void 0===i?void 0:i.name)||"BBVACR"===(null===(n=t[0])||void 0===n?void 0:n.name)?"bbva-investment-strategy-detail-fund-preposition-description-name":"bbva-investment-strategy-detail-fund-description-name",{strategy:"BBVAC+"===(null===(a=t[0])||void 0===a?void 0:a.name)?this.convertWordsToUpperCase(g):g.toLowerCase()}),_=null===(r=this.finalFundsCatalog)||void 0===r?void 0:r.find((e=>{var s;return e.key===(null===(s=t[0])||void 0===s?void 0:s.name)})),f=_.mrId??_.id,y=null!==(o=t[0])&&void 0!==o&&o.investmentHorizon&&null!==(c=t[0])&&void 0!==c&&c.investmentHorizon.id.toLowerCase().includes("plazo")?t[0].investmentHorizon.id.charAt(0)+t[0].investmentHorizon.id.slice(1).toLowerCase():"Largo plazo",S=null!==(l=t[0])&&void 0!==l&&l.tradingHours?this.t("bbva-investment-strategy-detail-fund-schedule-detailed",{startHour:null===(u=t[0])||void 0===u?void 0:u.tradingHours.startHour.substring(0,5),finalHour:null===(h=t[0])||void 0===h?void 0:h.tradingHours.finalHour.substring(0,5)}):"";this._strategyDetail={strategyName:null===(d=this._proposalDetail.strategies.find((e=>{var s;return e.fundName===(null===(s=t[0])||void 0===s?void 0:s.name)})))||void 0===d?void 0:d.strategyName,longDescription:null===(p=this._proposalDetail.strategies.find((e=>{var s;return e.fundName===(null===(s=t[0])||void 0===s?void 0:s.name)})))||void 0===p?void 0:p.strategylongDescription,fundDescription:v,fundName:null===(m=t[0])||void 0===m?void 0:m.name,fundSerie:null===(b=t[0])||void 0===b?void 0:b.serie,fundHorizon:y,fundSchedule:S,fundLiquidity:t[0].liquidity.id.charAt(0).toUpperCase()+t[0].liquidity.id.slice(1).toLowerCase(),documents:{DICI:{link:`https://portal.bbva.mx/siabinternet/Repositorio/import/doctos/analisis/${null==_?void 0:_.DICIId.padStart(8,"0")}.pdf`,name:this.t("bbva-investment-strategy-detail-documentation-dici")},MR:{link:`https://portal.bbva.mx/siabinternet/Repositorio/import/doctos/analisis/${f.toString().padStart(8,"0")}.pdf`,name:this.t("bbva-investment-strategy-detail-documentation-mr")},PR:{link:`https://portal.bbva.mx/siabinternet/Repositorio/import/doctos/analisis/${null==_?void 0:_.prospectId.padStart(8,"0")}.pdf`,name:this.t("bbva-investment-strategy-detail-documentation-pr")}}};const E={"Preservación de capital":{pageName:"preservacion de capital",channel:"page-view-capital-preservation"},"Generación de flujo":{pageName:"generacion de flujo",channel:"page-view-flow-generation"},"Crecimiento de capital":{pageName:"crecimiento de capital",channel:"page-view-capital-growth"},Liquidez:{pageName:"liquidez",channel:"page-view-liquidity"}};E[this._strategyDetail.strategyName]&&this._dispatchCustomEvent("bbva-feature-investment-portfolio-profiling-trace-event",E[this._strategyDetail.strategyName]),this.clearLoader(),this._strategyDetailVisibility=!0}}handleDocumentStatus(){this.clearLoader()}manageResponseOnGetInvestmentPortfolio({detail:[t]}){const{strategies:e}=t;this._getInvestmentPortfolio=e,this._proposalDetail.strategies=e.map((t=>({strategyId:t.id,strategyPercentage:t.percentage,strategyName:t.descriptions[0].name,strategyshortDescription:t.descriptions[0].shortDescription,strategylongDescription:t.descriptions[0].longDescription,fundName:t.investProducts[0].product.name,catalogStrategyId:t.catalogStrategyId,fundContribution:t.investProducts[0].initialContribution.amount}))),this.hiringDetail.strategies=this._proposalDetail.strategies;const s=["Preservación de capital","Generación de flujo","Crecimiento de capital"];this._proposalDetail.strategies.sort(((t,e)=>s.indexOf(t.strategyName)-s.indexOf(e.strategyName)));const i=new Date,n=new Date((new Date).setFullYear(i.getFullYear()+this._termInvestmentNumber)),a=i.toISOString().split("T")[0],r=n.toISOString().split("T")[0];this._getFutureProjectionsBody.initialContribution=this.currentAmount,this._getFutureProjectionsBody.fromProjectionDate=a,this._getFutureProjectionsBody.toProjectionDate=r,this._investmentPortfolio.getFutureProjections({"investment-portfolio-id":this._riskLevel},this._getFutureProjectionsBody),this._listFundsParams.name="",this._listFundsParams.serie="",this._products.getListFunds(this._listFundsParams)}manageResponseOnGetFutureProjections({detail:t}){const e={};t.slice().reverse().forEach((t=>{e[t.projectionType]||(e[t.projectionType]=t.returnValue)})),this._amountChange={currentAmount:this.currentAmount,maxAmount:this._maxAmountAccounts},this._futureProjections={expectedAmount:e.EXPECTED,optimisticAmount:e.OPTIMISTIC,pessimisticAmount:e.PESSIMISTIC,term:this._termInvestmentString},this._proposalDetail={strategies:this._proposalDetail.strategies,currentAmount:this.currentAmount,expectedAmount:e.EXPECTED,term:this._termInvestmentString},this._createListOperationBody.riskLevelCategory=this._profilingResult.category,this._createListOperationBody.orders=this._proposalDetail.strategies.map((t=>({fund:{title:{name:t.fundName},marketClassification:t.catalogStrategyId},positionSize:{positionType:{id:"AMOUNT"},positionAmount:{amount:t.fundContribution,currency:"MXN"}},contract:{numberType:{id:"CCC"}}}))),this._investmentFunds.version="1",this._investmentFunds.postValidateListOperations(this._createListOperationBody)}_showStrategyDetail({detail:t}){this.showLoader("full",!1,!1);const e=this._proposalDetail.strategies.find((e=>e.fundName===t.fundName));this._listFundsParams.name=e.fundName.replace(/\+/g,"%2B"),this._listFundsParams.serie=e.fundSerie,this._products.getListFunds(this._listFundsParams)}_closeAmountChange(){this._amountChangeVisibility=!1,this._amountChange={currentAmount:this.currentAmount,maxAmount:this._maxAmountAccounts}}_updateAmountChange(){this._newAmount!==this.currentAmount&&(this.currentAmount=this._newAmount,this.hiringDetail.amount=this._newAmount,this._investmentPortfolioParams.initialContribution=this._newAmount,this._getQuestionnairesINIBody.questions[0].questionOptions[0].value=this._newAmount,this._PDVPostStatusResponse=!1,this._investmentPortfolio.getInvestmentPortfolio(this._investmentPortfolioParams),this._questionaries.patchQuestionnaire("INI",this._getQuestionnairesINIBody)),this._closeAmountChange()}_openDocument(t){this.showLoader("full",!1,!1);const e=this._strategyDetail.documents[t],s=this.t(e.name);this.detailDocumentParams.value=e.link,this.detailDocumentParams.title=s,delete this.detailDocumentParams.body,this.detailDocumentParams.headers={},this._dispatchCustomEvent("native-request-pdf",this.detailDocumentParams)}_checkValidAmount(){const t=Number(this._newAmount);return t<500?(this._errorAmountMessage=this.t("bbva-investment-your-invest-minimun-error-input-message"),!0):t>this._amountChange.maxAmount?(this._errorAmountMessage=this.t("bbva-investment-your-invest-maximun-error-input-message"),!0):(this._errorAmountMessage="",!1)}_onChangeAmount(t){t.target.invalid=this._checkValidAmount()}get _editInvesmentAmountTpl(){return o`
        <bbva-type-text
          size="3XL"
          font-weight="${c.fontWeight40}"
          text="${this.t("bbva-investment-amount-change-title")}">
        </bbva-type-text>

        <bbva-type-text
          tag="span"
          text="${this.t("bbva-investment-amount-change-question")}"
          size="S"
          font-weight="${c.fontWeight40}">
        </bbva-type-text>

        <bbva-form-input
          class="amount-change-input-padding"
          language="${this.language}"
          type="amount"
          label="${this.t("bbva-investment-amount-change-input-placeholder")}"
          currency-code="${this.currency}"
          local-currency="${this.currency}"
          mode-input="decimal"
          amount="${this._newAmount}"
          required
          info-message="${this._errorAmountMessage?"":this.t("bbva-investment-amount-change-input-info-message")}"
          error-message="${this._errorAmountMessage}"
          @form-input-value-change="${t=>{var e;this._newAmount=(null===(e=t.detail)||void 0===e?void 0:e.value.replace(/,/g,""))||null,this._onChangeAmount(t)}}">
        </bbva-form-input>

        <bbva-button-default
          fullwidth
          class="continue-button"
          ?disabled="${this._checkValidAmount()}"
          text="${this.t("bbva-investment-amount-change-button")}"
          @click="${this._updateAmountChange}"
        >
        </bbva-button-default>
      `}get _futureProjectionsTpl(){const{expectedAmount:t,optimisticAmount:e,pessimisticAmount:s,term:i}=this._futureProjections,n=[{name:"expected",amount:t,microIllustration:"moneygraphic"},{name:"optimistic",amount:e,microIllustration:"investmentportfolio"},{name:"pessimistic",amount:s,microIllustration:"moneygraphicnegative"}];return o`
      <bbva-type-text
        size="L"
        tag="span"
        font-weight="${c.fontWeight40}"
        text="${this.t("bbva-investment-future-projections-title",{term:i})}">
      </bbva-type-text>
      <bbva-type-text
        size="S"
        font-weight="${c.fontWeight10}"
        text="${this.t("bbva-investment-future-projections-description")}">
      </bbva-type-text>
      ${n.map((t=>o`
        <div id="${t.name}-amount" class="microillustration-composition">
          <bbva-clip-microillustration
            size="S"
            class="illustration"
            microillustration="${t.microIllustration}">
          </bbva-clip-microillustration>
        <div class="description">
          <bbva-type-text
            size="S"
            tag="span"
            font-weight="${c.fontWeight40}"
            text="${this.t(`bbva-investment-future-projections-${t.name}-scenario`)}">
          </bbva-type-text>

          <bbva-type-amount
            variant="S"
            language="${this.language}"
            currency-code="${this.currency}"
            local-currency="${this.currency}"
            amount="${t.amount}">
          </bbva-type-amount>
        </div>
      </div>
      `))}
      <bbva-notification-help
        accessibility-label-icon="${this.t("bbva-feature-investment-portfolio-accessibility-label-icon")}"
        text="${this.t("bbva-investment-future-projections-notification-message")}">
      </bbva-notification-help>

      <bbva-button-default
        fullwidth
        class="close-button"
        text="${this.t("bbva-investment-future-projections-button")}"
        @click="${this._futureProjectionsVisibilityShow}">
      </bbva-button-default>
    `}get _documentsTpl(){return["MR","PR","DICI"].map((t=>o`
      <bbva-type-link
      icon-size="24"
      id="${t.toLowerCase()}-document"
      icon=${p()}
      class="generic-link"
      @click="${()=>this._openDocument(t)}"
      text="${this.t(`bbva-investment-strategy-detail-documentation-${t.toLowerCase()}`)}"></bbva-type-link>
      `))}get _fundDetailsTpl(){return[{id:"description",microIllustration:"funds",property:"fundDescription"},{id:"name",microIllustration:"investmentportfolio",property:"fundName"},{id:"serie",microIllustration:"moneygraphic",property:"fundSerie"},{id:"horizon",microIllustration:"calendar",property:"fundHorizon"},{id:"schedule",microIllustration:"clock",property:"fundSchedule"},{id:"liquidity",microIllustration:"refunddollar",property:"fundLiquidity"}].map((t=>o`
    <div id="fund-${t.id}" class="microillustration-composition">
    <bbva-clip-microillustration
      size="S"
      class="illustration"
      microillustration="${t.microIllustration}">
    </bbva-clip-microillustration>

    <div class="description">
      <bbva-type-text
        size="S"
        tag="span"
        font-weight="${c.fontWeight40}"
        text="${this.t(`bbva-investment-strategy-detail-fund-${t.id}`)}">
      </bbva-type-text>

      <bbva-type-text
        size="S"
        tag="span"
        text="${this._strategyDetail[`${t.property}`]}">
      </bbva-type-text>
    </div>
  </div>
    `))}get _strategyDetailTpl(){return o`
        <bbva-type-text
          size="L"
          tag="span"
          font-weight="${c.fontWeight40}"
          text="${this._strategyDetail.strategyName}">
        </bbva-type-text>

        <bbva-type-text
          size="S"
          text="${this._strategyDetail.longDescription||""}">
        </bbva-type-text>

        <bbva-header-category 
          text="${this.t("bbva-investment-strategy-detail-strategy-details-subtitle")}"
        >
        </bbva-header-category>

        ${this._fundDetailsTpl}

        <bbva-notification-help
          accessibility-label-icon="${this.t("bbva-feature-investment-portfolio-accessibility-label-icon")}"
          text="${this.t("bbva-investment-strategy-detail-notification-message")}">
        </bbva-notification-help>

        <bbva-header-category 
          class="generic-link"
          text="${this.t("bbva-investment-strategy-detail-documentation-subtitle")}"
        ></bbva-header-category>

        ${this._documentsTpl}

        <bbva-button-default
          fullwidth
          class="close-button"
          text="${this.t("bbva-investment-strategy-detail-button")}"
          @click="${this._strategyDetailVisibilityShow}">
        </bbva-button-default>
      `}_genericAccountErrorModal(){var t,e,s,i,n,a,r,l,u,h;return o`
      <bbva-help-modal
        header-text="${this.t("bbva-feature-investment-portfolio-help-modal-error-header")}"
        modal-type="warning"
        full-height
        title-lines="0"
        button-text="${null===(t=this._errorData)||void 0===t?void 0:t.button}"
        link-text="${this.t(null===(e=this._errorData)||void 0===e?void 0:e.link)}"
        fixed-footer
        title-text="${null===(s=this._errorData)||void 0===s?void 0:s.title}"
        title-icon="${g()}"
        ?visible="${this._errorOnCustomerAccounts}"
        @visible-changed="${t=>{!1===t.detail&&(this._errorOnCustomerAccounts=!1,this.showWelcomeProfiling=!1,this._dispatchCustomEvent("exit-feature-investment-portfolio"))}}"
      >
        <div class="content" slot="slot-content">
          <bbva-type-text
            text="${this.t((null===(i=this._errorData)||void 0===i?void 0:i.message)??"")}"
            font-weight="${c.fontWeight10}"
            size="S"
            tag="span"
          ></bbva-type-text>
          <bbva-type-text
            text="${(null===(n=this._errorData)||void 0===n?void 0:n.screen)??""}"
            font-weight="${c.fontWeight10}"
            size="S"
            tag="span"
          ></bbva-type-text>
          <bbva-type-text
            text="${this.t((null===(a=this._errorData)||void 0===a?void 0:a.menu)??"")}"
            font-weight="${c.fontWeight10}"
            size="S"
            tag="span"
          ></bbva-type-text>
          <bbva-type-text
            text="${this.t((null===(r=this._errorData)||void 0===r?void 0:r.branch)??"")}"
            font-weight="${c.fontWeight10}"
            size="S"
            tag="span"
          ></bbva-type-text>
          <bbva-type-text
            text="${this.t((null===(l=this._errorData)||void 0===l?void 0:l.name)??"")}"
            font-weight="${c.fontWeight10}"
            size="S"
            tag="span"
          ></bbva-type-text>
          <bbva-type-text
            text="${this.t((null===(u=this._errorData)||void 0===u?void 0:u.beneficiaries)??"")} "
            font-weight="${c.fontWeight10}"
            size="S"
            tag="span"
          ></bbva-type-text>
          <bbva-type-text
            text="${(null===(h=this._errorData)||void 0===h?void 0:h.ready)??""}"
            font-weight="${c.fontWeight10}"
            size="S"
            tag="span"
          ></bbva-type-text>
        </div>
      </bbva-help-modal>`}successOnListAccounts(t){this._validAccounts=t.detail.filter((t=>"N4"===t.meta.accountLevel));let e=0;var s;(this._validAccounts.forEach((t=>{const s=t.availableBalance.currentBalances.find((t=>"MXN"===t.currency));e=parseFloat(e)>parseFloat(s.amount)?e:s.amount})),this.maxAmount=e,this._validAccounts.length>0)?(this._currentAccount=0,this._accountsDP.accountId=null===(s=this._validAccounts[this._currentAccount])||void 0===s?void 0:s.accountId,this._accountsDP.getAccountParticipants()):(this._dispatchCustomEvent("bbva-feature-investment-portfolio-profiling-trace-event",{pageName:"error actualizar cuenta",channel:"page-view-account-error"}),this._setErrorModalData(ns.accountType))}errorOnListAccounts(){this._setErrorModalData(ns.accountType)}_setErrorModalData(t){this._errorData={...t},this._errorOnCustomerAccounts=!0,this.clearLoader()}_strategyDetailVisibilityShow(){this._strategyDetailVisibility=!1}getDataHiringMultiStep({detail:t}){this._numberContract=t.productNumber,this._idRiskProfile=t.riskProfile}postSuccessInvestmentPortfolioAssessments(){return"PROPOSED"!==this._createAssessmentBody.status.id?this._postInvestmentFundsOrder():""}_postInvestmentPortfolioAssessments(){this._createAssessmentBody.participantId=this._clientId,this._createAssessmentBody.investmentPortfolioId=this.hiringDetail.profile.level,this._createAssessmentBody.assessmentDate=moment().format("YYYY-MM-DD"),this._createAssessmentBody.initialContribution.amount=this.hiringDetail.amount,this._investmentPortfolio.postInvestmentPortfolioAssessments(this._createAssessmentBody)}createInvestmentFundSuccess({detail:t}){this.investmentFundData=t,this.investmentFundNumber=t.relatedContract.number,this._createAssessmentBody.contractId=this.investmentFundNumber,this._createAssessmentBody.status.id="CONTRACTED",this._postInvestmentPortfolioAssessments()}createInvestmentFundOrderSuccess({detail:t}){0===Object.keys(t).length?this.createInvestmentFundOrderError():(this.orderDataHiring=t,this._profilingTestVisibility=!1,this._profilingResultVisibility=!1,this.renderCompleteScreen=!0)}_postInvestmentFundsOrder(){var t;this._createFundOrderBody.orders=null===(t=this._validateListData)||void 0===t?void 0:t.detail.orders.map((t=>({investmentFund:{number:this.investmentFundNumber,numberType:{id:"CCC"}},orderType:{id:"SUBSCRIPTION"},orderSubtype:{id:t.subType.id},positionSize:{positionType:{id:"AMOUNT"},requestedPositionAmount:{amount:t.calculedPositionSize[0].positionAmount.amount,currency:"MXN"}},serializedNumber:"000000000",offerId:"0",fund:{serie:t.fund.serie,numberFormats:[{number:t.fund.numberFormats[0].number}]}}))),this._investmentFunds.version="0",this._investmentFunds.postCreateInvestmentFundOrder(this._createFundOrderBody)}createInvestmentFundError(){this.clearLoader()}createInvestmentFundOrderError(){this._profilingTestVisibility=!1,this._profilingResultVisibility=!1,this.orderDataHiring=this.investmentFundData,this.orderError=!0,this.renderCompleteScreen=!0,this.clearLoader()}_goToHiring(){this._hiringMultisteVisibility=!0,this._proposalDetailVisible=!1,this.showResultProfiling=!1,this._createAssessmentBody.status.id="PROPOSED",this.allowedAccounts=this._validAccounts,this._createAssessmentBody.contractId="",this.investmentFundNumber="0",this.customerEmail=`•${this.customerEmail.replace(/\*/g,"")}`,this._postInvestmentPortfolioAssessments(),this._dispatchCustomEvent("bbva-feature-investment-portfolio-hiring-trace-event",{pageName:"propuesta personalizada",channel:"app-on-click-start-personalized-proposal"})}successOnListParticipants(t){const e=this.capitalizeFirstLetterOfEachWord(t.detail.find((t=>"HOLDER"===t.participantType.id)).customDetails.firstName);this._customerFullName=t.detail.find((t=>"HOLDER"===t.participantType.id)).customDetails.fullName,this.firstNameClient=e;const s=t.detail.filter((t=>"BENEFICIARY"===t.participantType.id));if(s.length>0){const t=s.reduce(((t,e)=>t+e.customDetails.participationPercentage),0);this._validAccounts[this._currentAccount].totalPercentage=t,this._validAccounts[this._currentAccount].hasBeneficiaries=!0}else this._validAccounts[this._currentAccount].hasBeneficiaries=!1;var i;(this._currentAccount+=1,this._currentAccount<this._validAccounts.length)?(this._accountsDP.accountId=null===(i=this._validAccounts[this._currentAccount])||void 0===i?void 0:i.accountId,this._accountsDP.getAccountParticipants()):this._evaluateCustomerAccounts()}errorOnListParticipants(){var t;(this._currentAccount+=1,this._currentAccount<this._validAccounts.length)?(this._accountsDP.accountId=null===(t=this._validAccounts[this._currentAccount])||void 0===t?void 0:t.accountId,this._accountsDP.getAccountParticipants()):this._evaluateCustomerAccounts()}_evaluateCustomerAccounts(){const t=[],e=[];this._validAccounts.forEach((s=>{s.hasBeneficiaries&&100===s.totalPercentage?t.push(s):s.totalPercentage>0&&s.totalPercentage<100&&e.push(s)})),e.length>0?(this._setErrorModalData(ns.beneficiariesPercentage),this._dispatchCustomEvent("bbva-feature-investment-portfolio-profiling-trace-event",{pageName:"error completar porcentaje de beneficiarios",channel:"page-view-beneficiary-percentage-error"})):0===t.length?(this._dispatchCustomEvent("bbva-feature-investment-portfolio-profiling-trace-event",{pageName:"error asignar beneficiarios",channel:"page-view-beneficiary-error"}),this._setErrorModalData(ns.beneficiaries)):this._questionnaireServicesManager()}_accountsDataprovider(){return o`
      <bbva-dataprovider-accounts
        host="${this.host}"
        .headers="${this.headers}"
        requiredToken="${this.requiredToken}"
        accountsApiVersion="${this.accountsApiVersion}"
        ?native="${this.native}"
        @set-accounts="${this.successOnListAccounts}"
        @error-on-get-accounts="${this.errorOnListAccounts}"
        @success-on-get-participants="${this.successOnListParticipants}"
        @error-on-get-participants="${this.errorOnListParticipants}">
      </bbva-dataprovider-accounts>
    `}postQuestionnaireService({detail:t}){this.showLoader("full",!1,!1),this._getQuestionnairesINIBody.questions[0].questionOptions[0].value=t.INI.amount,this.currentAmount=t.INI.amount;const{answers:e}=t.PDV,[s]=e;this._termInvestmentNumber={1:1,2:3,3:5}[s.questionOptions[0].id],this._getQuestionnairesPDVBody.questions.forEach((e=>{t.PDV.answers.forEach((t=>{e.id===t.id&&(e.questionOptions=t.questionOptions)}))})),this._questionaries.postQuestionnaire(this._getQuestionnairesPDVBody),this._questionaries.postQuestionnaire(this._getQuestionnairesINIBody)}handleErrorOnCreateQuestionnaire(){this._businessDocuments.native=this.native,this._attemptNumberOnPostQuestionnaire+=1,this._errorOnPostQuestionnaire=!0,this.clearLoader(),this._hiringMultisteVisibility?this._dispatchCustomEvent("bbva-feature-investment-portfolio-hiring-trace-event",{pageName:"error informacion no disponible",channel:"page-view-information-error"}):this._dispatchCustomEvent("bbva-feature-investment-portfolio-profiling-trace-event",{pageName:"error operacion no disponible",channel:"page-view-operation-error"})}get _tplErrorModalPostQuestionnaire(){return o`
      <bbva-help-modal
        header-text="${this.t("bbva-feature-investment-portfolio-help-modal-error-header")}"
        modal-type="warning"
        ?full-height= "${this._attemptNumberOnPostQuestionnaire>=3}"
        title-lines="0"
        button-text="${this._attemptNumberOnPostQuestionnaire>=3?this.t("bbva-feature-investment-portfolio-help-modal-error-account-type-button"):this.t("bbva-feature-investment-portfolio-help-modal-error-button")}"
        link-text="${this._attemptNumberOnPostQuestionnaire>=3?this.t("bbva-feature-investment-portfolio-help-modal-error-link"):""}"
        fixed-footer
        title-text="${this.t("bbva-feature-investment-portfolio-help-modal-error-title")}"
        title-icon="${g()}"
        ?visible="${this._errorOnPostQuestionnaire}"
        header-close-icon-aria-label="${this.t("bbva-feature-investment-portfolio-help-modal-error-button")}"
        @help-modal-footer-button-click="${this.clearLoader}"
        @visible-changed="${t=>{!1===t.detail&&(this._errorOnPostQuestionnaire=!1,this.showWelcomeProfiling=!1,this._attemptNumberOnPostQuestionnaire>=3&&this._exitPortfolioFeature())}}"
      >
        <div class="content" slot="slot-content">
          <bbva-type-text
            text="${this.t("bbva-feature-investment-portfolio-help-modal-error-message")}"
            font-weight="${c.fontWeight10}"
            size="S"
            tag="span"
          ></bbva-type-text>
        </div>
      </bbva-help-modal>`}get _tplErrorModalInsufficentAmount(){return o`
        <bbva-help-modal
          id="insufficientModal"
          header-text="${this.t("bbva-feature-investment-portfolio-header-insufficient-amount-modal-error")}"
          modal-type="warning"
          full-height
          button-text="${this.t("bbva-feature-investment-portfolio-text-button-insufficient-amount-modal-error")}"
          fixed-footer
          title-text="${this.t("bbva-feature-investment-portfolio-subtitle-insufficient-amount-modal-error")}"
          title-icon="${g()}"
          ?visible="${this._errorOnInssuficientAmount}"
          @help-modal-footer-button-click="${()=>{this._amountChangeVisibility=!0}}"
          @visible-changed="${t=>{!1===t.detail&&(this._errorOnInssuficientAmount=!1)}}"
        >
          <div class="content" slot="slot-content">
            <bbva-type-text
              text="${this.t("bbva-feature-investment-portfolio-text-content-insufficient-amount-modal-error")}"
              font-weight="${c.fontWeight10}"
              size="S"
              tag="span"
            ></bbva-type-text>
            <bbva-notification-message
            class="notification-message"
            message-title="${this.t("bbva-feature-investment-portfolio-text-info-header-insufficient-amount-modal-error")}"
            message="${this.t("bbva-feature-investment-portfolio-text-info-content-insufficient-amount-modal-error")}"
          ></bbva-notification-message>
          </div>
        </bbva-help-modal>`}manageResponseOnCreateQuestionnaire({detail:{id:t}}){this[`_${t.toString().split("|")[1]}PostStatusResponse`]=!0,this._calculateRiskManager()}manageResponseOnPostInvestmentBusinessDocuments({detail:t}){this._businessDocuments.native=this.native;const e=t.split("--uuid");let s="";for(const t of e)if(t.includes("Content-Type: */*")&&t.includes("Content-Transfer-Encoding: binary")){const e=t.match(/Content-ID: <file>\s+([\s\S]+)/);if(e){s=e[1].trim();break}}s?(this.clearLoader(),this._dispatchCustomEvent("share-investment-proposal",{value:s,mimetype:"application/pdf"})):this.clearLoader()}manageResponseOnUpdateQuestionnaire({detail:{id:t}}){var e;this[`_${t}PostStatusResponse`]=!0,"CONTRACTED"!==(null===(e=this._createAssessmentBody.status)||void 0===e?void 0:e.id)&&this._calculateRiskManager()}listValidateOperationHiringFirstOrder(){var t;this._createListOperationBody.riskLevelCategory=this._profilingResult.category,this._createListOperationBody.relatedContract.number=this._numberContract,this._createListOperationBody.orders=null===(t=this._proposalDetail)||void 0===t?void 0:t.strategies.map((t=>({fund:{title:{name:t.fundName},marketClassification:t.catalogStrategyId},positionSize:{positionType:{id:"AMOUNT"},positionAmount:{amount:t.fundContribution,currency:"MXN"}},contract:{numberType:{id:"CCC"}}}))),this._investmentFunds.version="1",this._investmentFunds.postValidateListOperations(this._createListOperationBody)}validateListOperationsResponseHandlerError(t){this.clearLoader();const[e]=t.detail.messages;Array.isArray(t.detail.messages)&&e.message.includes("TPE1003")||Array.isArray(t.detail.messages)&&e.message.includes("TPE1040")?this._errorOnInssuficientAmount=!0:this.handleErrorOnCreateQuestionnaire()}_questionnaireServicesManager(){!1===this._respondePDV&&(this._questionaries.getQuestionnaires({questionnaireType:"PDV"}),this._respondePDV=!0),!0===this._respondePDV&&this._questionaries.getQuestionnaires({questionnaireType:"INI"})}_shareInvestmentProposal(){this.showLoader("full",!1,!1);this._postDocumentsBody.investment.term=this.t(`bbva-investment-your-invest-term-option-${{1:"short",3:"medium",5:"long"}[this._termInvestmentNumber]}`),this._postDocumentsBody.investment.level=this._riskLevel,this._postDocumentsBody.investment.portfolio=this._riskLevel,this._postDocumentsBody.investment.initialAmount.amount=this.currentAmount,this._postDocumentsBody.investment.complementaryAmount.amount=this.currentAmount,this._postDocumentsBody.investment.totalAmount.amount=this.currentAmount,this._postDocumentsBody.investment.prospect.fullName=this._customerFullName,this._postDocumentsBody.investment.prospect.profile.id=this._profilingResult.category,this._postDocumentsBody.investment.prospect.profile.description=this._profilingResult.description,this._postDocumentsBody.investment.strategy.number=1===this._riskLevel?1:3,this._postDocumentsBody.investment.strategy.description=1===this._riskLevel?"1 estrategia":"3 estrategias",this._businessDocuments.native=!1,this._businessDocuments.version="1",this._businessDocuments.responseType="multipart",this._businessDocuments.postInvestmentBusinessDocuments(this._postDocumentsBody)}openInvestmenDocumentHiring({detail:t}){this.showLoader("full",!1,!1),void 0===t.productId&&void 0===t.subproductId&&(this._nameDocumentHiring=t.document),this._getBusinessDocumentsParams.productId=t.productId,this._getBusinessDocumentsParams.subproductId=t.subproductId,this._businessDocuments.version="0",this._businessDocuments.responseType="text",this._businessDocuments.getBusinessDocuments(this._getBusinessDocumentsParams)}_showProposalDetail(){this.showLoader("full",!1,!1),this._dispatchCustomEvent("bbva-feature-investment-portfolio-profiling-trace-event",{pageName:"mi perfil",profileType:this._profilingResult.category.toLowerCase(),channel:"internal-link-continue"}),this._investmentPortfolioParams.riskProfile=this._profilingResult.level,this._investmentPortfolioParams.initialContribution=this.currentAmount,this.hiringDetail.amount=this.currentAmount,this.hiringDetail.profile.name=this._profilingResult.category,this.hiringDetail.profile.level=this._profilingResult.level,this._respondePDV=!1,this.questionnairesFilter=[],this._questionnaireServicesManager(),this._investmentPortfolio.getInvestmentPortfolio(this._investmentPortfolioParams)}_futureProjectionsVisibilityShow(){this._futureProjectionsVisibility=!1}manageResponseOnCalculateRiskLevels({detail:t}){this.isLoaded=!0,this.showResultProfiling||this.clearLoader(),t.forEach((t=>{if(t.isSelected){this._profileManager(t);const e=this.capitalizeFirstLetterOfEachWord(t.category.id);this.nameRiskProfile=e,this.showTestProfiling=!1,this.showResultProfiling=!0}}))}_multistepDispatchAnalytics({detail:t}){const e={step1:{pageName:"importe inicial",channel:"page-view-initial-amount"},step2:{pageName:"plazo de la inversion",channel:"page-view-investment-term"},step3:{pageName:"porcentaje para inversion",channel:"page-view-investment-percentage"},step4:{pageName:"expectativas de la inversion",channel:"page-view-investment-expectations"},step5:{pageName:"rendimiento",channel:"page-view-performance"},step6:{pageName:"actitud ante la perdida",channel:"page-view-lost-attitude"},step7:{pageName:"finalizado",channel:"page-view-finalized"}};e[t]&&this._dispatchCustomEvent("bbva-feature-investment-portfolio-profiling-trace-event",e[t])}_openInvestmentGuide(){this.showLoader("full",!1,!1),this._getBusinessDocumentsParams.productId="MBINVEST",this._getBusinessDocumentsParams.subproductId="GUIASERVIN",this._businessDocuments.version="0",this._businessDocuments.responseType="text",this._businessDocuments.getBusinessDocuments(this._getBusinessDocumentsParams)}_profileManager(t){const e=t.category.id,{level:s}=t,i={level:s},n={TRADICIONAL:{category:this.t("bbva-investment-profiling-result-traditional-name"),description:this.t("bbva-investment-profiling-result-traditional-description")},CONSERVADOR:{category:this.t("bbva-investment-profiling-result-conservative-name"),description:this.t("bbva-investment-profiling-result-conservative-description")},MODERADO:{category:this.t("bbva-investment-profiling-result-moderate-name"),description:this.t("bbva-investment-profiling-result-moderate-description")},AGRESIVO:{category:this.t("bbva-investment-profiling-result-aggressive-name"),description:this.t("bbva-investment-profiling-result-aggressive-description")}};n[e]&&(i.category=n[e].category,i.description=n[e].description),this._dispatchCustomEvent("bbva-feature-investment-portfolio-profiling-trace-event",{pageName:"mi perfil",profileType:this.t(i.category).toLowerCase(),channel:"page-view-my-profile"}),this._riskLevel=s,this._profilingResult=i}showProfilingTest(){this.showWelcomeProfiling=!1,this.showTestProfiling=!0,this.showResultProfiling=!1,this._INIPostStatusResponse=!1,this._PDVPostStatusResponse=!1,this.isLoaded=!1,this._dispatchCustomEvent("bbva-feature-investment-portfolio-profiling-trace-event",{pageName:"experiencia",channel:"page-view-experience"})}returnProposalDetail(){this.showWelcomeProfiling=!1,this.showTestProfiling=!1,this.isLoaded=!1,this.showResultProfiling=!0,this._hiringMultisteVisibility=!1,this._proposalDetailVisible=!0}exitHiringCompleteScreen(){this.showWelcomeProfiling=!1,this.showTestProfiling=!1,this.isLoaded=!1,this.showResultProfiling=!1,this._hiringMultisteVisibility=!1,this._proposalDetailVisible=!1,this.renderCompleteScreen=!1,this._dispatchCustomEvent("help-modal-footer-button-click-back-to-dashboard")}_exitPortfolioFeature(){this.showWelcomeProfiling=!1,this.loadPortfolioFeature=!1,this.showResultProfiling=!1,this.showTestProfiling=!1,this._hiringMultisteVisibility=!1,this._dispatchCustomEvent("exit-feature-investment-portfolio")}_handleProposalDetailClose(){this._proposalDetailVisible=!1}_calculateRiskManager(){this._INIPostStatusResponse&&this._PDVPostStatusResponse&&(this._risks.postCalculateRiskLevels(this._calculateRiskLevelsBody),this.clearLoader())}_setPreviousAmount(t){this._newAmount=t.detail.amount,this._amountChangeVisibility=!0}render(){var t;return o`
      ${super.render()}
      ${this._questionnairesBGADM()}
      ${this._accountsDataprovider()}
      ${this._risksBGADM()}
      ${this._investmentPortfolioDataprovider()}
      ${this._productsDataProvider()}
      ${this._investmentFundsDataprovider()}
      ${this._genericAccountErrorModal()}
      ${this._businessDocumentsBGADM()}
      ${this._tplErrorModalInsufficentAmount}
      ${this._tplErrorModalPostQuestionnaire}

      ${this.loadPortfolioFeature?o`
      <bbva-transition-container
        id="welcome-profile"
        ?visible="${this.showWelcomeProfiling}"
      >
        <div slot="slot-content">
          <div class="header-modal">
            <bbva-header-main
              id="primary"
              class="primary"
              variant="modal-initial"
              text="${this.t("bbva-feature-investment-portfolio-profiling-header-title")}"
              @header-main-icon-click="${this._exitPortfolioFeature}"
        >
            </bbva-header-main>
          </div>
          <bbva-feature-investment-portfolio-profiling-welcome
            nameHolder="${this.firstNameClient}"
            @show-profiling-test="${this.showProfilingTest}"
          >
          </bbva-feature-investment-portfolio-profiling-welcome>
        </div>
      </bbva-transition-container>

      <bbva-transition-container
        id="test-profiling"
        ?visible="${this.showTestProfiling}"
      >
        <div slot="slot-content">
          <bbva-profiling-investment-portfolio-test-profiling
            .isLoaded="${!this.isLoaded}"
            .questionnaires="${this.questionnairesFilter}"
            .maxAmount="${this.maxAmount}"
            .currency="${this.currency}"
            @profiling-test-dispatch-analytics=${this._multistepDispatchAnalytics}
            @exit-investment-portfolio="${this._exitPortfolioFeature}"
            @profiling-test-show-result="${this.postQuestionnaireService}"
          >
          </bbva-profiling-investment-portfolio-test-profiling>
        </div>
      </bbva-transition-container>

      <bbva-transition-container
        id="profiling-result"
        ?visible="${this.showResultProfiling}"
      >
        <div slot="slot-content">
        <div class="header-modal">
            <bbva-header-main
              id="primary"
              class="primary"
              variant="modal-initial"
              text="${this.t("bbva-feature-investment-portfolio-profiling-header-title")}"
              close-icon-aria-label="${this.t("bbva-feature-investment-portfolio-profiling-header-title")}"
              @header-main-icon-click="${this._exitPortfolioFeature}"
            ></bbva-header-main>
          </div>
          <bbva-feature-investment-portfolio-profiling-result
            .nameProfileRisk = "${this.nameRiskProfile}"
            .descriptionProfileRisk = "${this._profilingResult.description}"
            @show-proposal-detail="${this._showProposalDetail}"
            @show-test-profiling-again="${this.showProfilingTest}"
          >
          </bbva-feature-investment-portfolio-profiling-result>
        </div>
      </bbva-transition-container>

      <bbva-transition-container
      id="proposal-detail"
      header-show-left-icon
      class="proposal-detail-container"
      header-type="first-level-sequential"
      header-text="${this.t("bbva-investment-proposal-detail-transition-container-header")}"
      visible="${f(this._proposalDetailVisible||void 0)}"
      @transition-container-close="${this._handleProposalDetailClose}">
      >

      <div slot="slot-content" class="slot-content">
        <bbva-feature-investment-proposal
        .currency="${this.currency}"
        .language="${this.language}"
        .proposalDetail="${this._proposalDetail}"
        @proposal-detail-show-guide-pdf="${this._openInvestmentGuide}"
        @proposal-detail-show-proposal-pdf="${this._shareInvestmentProposal}"
        @proposal-detail-show-amount-change="${this._setPreviousAmount}"
        @proposal-detail-show-strategy-detail="${this._showStrategyDetail}"
        @proposal-detail-show-future-projections="${()=>{this._dispatchCustomEvent("bbva-feature-investment-portfolio-profiling-trace-event",{pageName:"escenarios de la inversion",channel:"page-view-investment-scenarios"}),this._futureProjectionsVisibility=!0}}"
            @proposal-detail-go-to-hiring=${this._goToHiring}>
          </bbva-feature-investment-proposal>
        </div>
      </bbva-transition-container>

      <bbva-transition-container
        id="hiring-multiStep"
        ?visible="${this._hiringMultisteVisibility}"
      >
        <div slot="slot-content">
          <bbva-feature-invest-hiring-multistep
          .switchPage = "${this._hiringMultisteVisibility}"
          .proposalDetailObject = "${this.hiringDetail}"
          .orderError = "${this.orderError}"
          .switchComplete="${this.renderCompleteScreen}"
          .accountDataObject = "${this.allowedAccounts}"
          .financialOverview = "${null===(t=this.financialOverviewDetailsData)||void 0===t?void 0:t.data}"
          .customerEmail = "${this.customerEmail}"
          .orderDataHiring = "${this.orderDataHiring}"
          .investmentFundNumber = "${this.investmentFundNumber}"
          .currency="${this.currency}"
          .language="${this.language}"
          @reset-hiring-to-proposal="${this.returnProposalDetail}"
          @reset-hiring-complete-screen="${this.exitHiringCompleteScreen}"
          @request-hiring-operation="${this.listValidateOperationHiringFirstOrder}"
          @send-data-to-portfolio = "${this.getDataHiringMultiStep}"
          @generate-documents-hirings = "${this.openInvestmenDocumentHiring}"
          >
          </bbva-feature-invest-hiring-multistep>
        </div>
      </bbva-transition-container>


      <bbva-help-modal
        full-height
        id="amount-change"
        class="generic-modal"
        transition-without-scroll
        hide-content-padding-top
        ?visible="${this._amountChangeVisibility}"
        header-text="${this.t("bbva-investment-generic-header")}"
        @help-modal-header-click="${this._closeAmountChange}">

        <div slot="slot-content" class="horizontal-padding">
          ${this._editInvesmentAmountTpl}
        </div>
      </bbva-help-modal>

      <bbva-help-modal
        full-height
        class="generic-modal"
        id="future-projections"
        hide-content-padding-top
        ?visible="${this._futureProjectionsVisibility}"
        header-text="${this.t("bbva-investment-future-projections-header")}"
        @help-modal-close="${this._futureProjectionsVisibilityShow}">
        <div slot="slot-content" class="full-padding">
        ${this._futureProjectionsTpl}
        </div>
      </bbva-help-modal>

      <bbva-help-modal
        full-height
        id="strategy-detail"
        class="generic-modal"
        hide-content-padding-top
        ?visible="${this._strategyDetailVisibility}"
        header-text="${this.t("bbva-investment-proposal-detail-strategies-distribution-see-details-label")}"
        @help-modal-close="${this._strategyDetailVisibilityShow}">

        <div slot="slot-content" class="full-padding">
          ${this._strategyDetailTpl}
        </div>
      </bbva-help-modal>
    `:o``}
    `}}customElements.define(rs.is,rs);const os=y((t=>class extends t{static get properties(){return{config:{type:Object},data:{type:Object},appStartedText:{type:String},stringNormalizeExceptions:{type:Array},dynamicMethodsName:{type:Array},dependsOnAppStartedLaunched:{type:Boolean},_isAppStartedLaunched:{type:Boolean}}}constructor(){super(),this.config={items:{},buttons:{continue:""},steps:{}},this.data={},this.appStartedText="app started:",this.stringNormalizeExceptions=["paymentCurrency","currency","operationNumber"],this.dynamicMethodsName=[],this.dependsOnAppStartedLaunched=!1,this._isAppStartedLaunched=!1}persistData(t){Object.assign(this.data,t)}buildDynamicMethods(){this.dynamicMethodsName.forEach((t=>{this[t]=()=>this._dispatch(`analytics-${this._camelToKebabCase(t)}`,this.data)}))}_camelToKebabCase(t){return t.replace(/[A-Z]/g,(t=>`-${t.toLowerCase()}`))}persistDataString(t){Object.assign(this.data,this.parseDataToString(t))}_toStringProcess(t,e){const s=t.toString();return this.stringNormalizeExceptions.includes(e)?s:this._normalizeStr(s)}_normalizeStr(t){let e=t;if("string"==typeof t){const s="ÁÃÀÄÂÉËÈÊÍÏÌÎÓÖÒÔÚÜÙÛÇáãàäâéëèêíïìîóöòôúüùûç",i="AAAAAEEEEIIIIOOOOUUUUCaaaaaeeeeiiiioooouuuuc",n=new RegExp(`[${s}]`,"ug");e=t.replace(n,(t=>i.charAt(s.indexOf(t)))).toLowerCase()}return e}parseDataToString(t,e){if(!t)return t;switch(typeof t){case"string":case"boolean":case"number":return this._toStringProcess(t,e);case"object":if(Array.isArray(t))return t.map((t=>this.parseDataToString(t)));const s={...t};return Object.keys(s).forEach((e=>{s[e]=this.parseDataToString(t[e],e)})),s;case"function":return this.parseDataToString(t());default:return t.toString()}}firePersistedData(t){this.persistData(t),this._dispatch("analytics-persisted-data",this.data)}fireNormalizedPersistedData(t){let e=t;"string"==typeof e&&(e=this.normalizeString(e)),"object"==typeof e&&Object.keys(e).forEach((t=>{e[t]=this.normalizeString(e[t])})),this.firePersistedData(e)}resetData(){this.data={},this._isAppStartedLaunched=!1}firePageVisit(){this._dispatch("analytics-page-visit",this.data),this._isAppStartedLaunched=!1}firePageView(t){this._dispatch("analytics-page-view"+(t?`-${t}`:""))}fireModal(){this._dispatch("analytics-modal")}fireModalWithData(){this._dispatch("analytics-modal",this.data)}fireInternalLink(t){this._dispatch("analytics-internal-link",t)}fireInternalLinkCard(t){this._dispatch("analytics-internal-link-card",t)}fireExternalLink(){this._dispatch("analytics-external-link")}fireItemAppStarted(t){if(!this._isAppStartedLaunched){const e=(null==t?void 0:t.id)||t,s=this._getTextConfig(e,"items");s&&(this.fireAppStarted(s),this._isAppStartedLaunched=this.dependsOnAppStartedLaunched)}}fireAppOnClickStart(){this._dispatch("analytics-app-on-click-start",this.data)}fireAppStarted(t){this.persistData({detail:`${this.appStartedText}${t}`}),this._dispatch("analytics-app-started",this.data)}fireAdvancedMark(){this._dispatch("analytics-advanced-mark",this.data)}fireAppCompleted(){this._dispatch("analytics-app-completed",this.data),this.resetData()}fireFrequentAppCompleted(){this._dispatch("analytics-frequent-app-completed",this.data),this.resetData()}normalizeString(t){return t.toLowerCase().normalize("NFD").replace(/[^a-zA-Z0-9 ]/g,"")}_getTextConfig(t,e){var s,i;return null===(s=this.config)||void 0===s||null===(i=s[e])||void 0===i?void 0:i[t]}getPathValue(t,e){return e.split(".").reduce(((t,e)=>t[e]),t)}_dispatch(t,e){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}}));class cs extends(os(s)){static get is(){return"bbva-analyticmanager-investment-portfolio"}static get properties(){return{}}fireProfilingAnalytics(t){const{pageName:e,profileType:s,channel:i}=t||{},n={...e&&{pageName:e},...s&&{profileType:`invest mi perfil:${s}`}},a=i?`investment-profiling-${i}-analytics`:"investment-profiling-generic-invest-analytics";this._dispatchEvent(a,n)}fireHiringAnalytics(t){const{pageName:e,step:s,amount:i,operationNumber:n,channel:a}=t||{},r={...e&&{pageName:e},...s&&{step:s},...i&&{amount:i},...n&&{operationNumber:n}},o=a?`investment-hiring-${a}-analytics`:"investment-hiring-generic-invest-analytics";this._dispatchEvent(o,r)}_dispatchEvent(t,e){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}}customElements.define(cs.is,cs);
