import{aZ as e,J as t,L as i,a7 as s,h as a,z as r,aX as o,an as n,ak as c,cU as l,ah as d,aV as h,aY as u,bF as m,aD as p,ai as g,eS as f,bn as b,eT as _,eU as v}from"./952f98a9.js";import{R as y,L as C,N as S,T as x,D as $,K as E,e as T,x as P,G as D,Q as I,aw as w,V as O,E as A,z as R,f as V,I as M,H as N,a3 as k,a4 as F,M as q,as as B,at as j}from"./216055dc.js";import{by as H,c6 as G,c7 as L,c8 as U,c9 as z,aI as K,aH as Y,bQ as X,bf as J,bg as W,bP as Q,ca as Z,q as ee,a6 as te,cb as ie,R as se}from"./7f3d7ca9.js";import{B as ae,a as re,b as oe}from"./d2484b66.js";import{a as ne}from"./4656db6d.js";import"./cff03f17.js";import{B as ce}from"./577155d8.js";import{B as le}from"./98f361c8.js";import{a as de,f as he}from"./1979ce36.js";import{b as ue,B as me}from"./30ef6f1f.js";class pe{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let i=Object(this),s=i.length>>>0;if(0===s)return!1;let a=0|t,r=Math.max(a>=0?a:s-Math.abs(a),0);for(;r<s;){if((o=i[r])===(n=e)||"number"==typeof o&&"number"==typeof n&&isNaN(o)&&isNaN(n))return!0;r++}var o,n;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var i=[],s=0,a="",r=0,o=arguments.length;r!==o;++r){var n=+arguments[r];if(!(n<1114111&&n>>>0===n))throw RangeError("Invalid code point: "+n);n<=65535?s=i.push(n):(n-=65536,s=i.push(55296+(n>>10),n%1024+56320)),s>=16383&&(a+=e.apply(null,i),i.length=0)}return a+e.apply(null,i)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",i=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${i&&i.message}`)}}class ge extends pe{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}}const fe=0,be=1,_e="jwt",ve="tsec",ye="none";class Ce extends pe{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=fe,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new ge,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=ve:this.requiredToken=ye,this.requiresJWT=!1):this.requiredToken===ve?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===_e?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===ye?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(ve)}_setJwtHandler(){this._setTokenHandler(_e)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((i,s)=>{t=Object.assign(t,{resolve:i,reject:s}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let i=this._getRequestHeaders();Object.keys(i).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,i[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let t=null;return!!window.CellsNativePlugins&&(t=e),t}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let i=e.replace(/[\{\}]+/g,""),s=t[i];return s?delete t[i]:this._error(9,`Missing ${i} param value`),s})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let i=Object.keys(t);i.length&&(e=[e,i.map((e=>{let i=t[e];return Array.isArray(i)&&this.paramArrayMode===be?this._arrayToQueryParam(e,i):`${e}=${i}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(ve,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(_e,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(i){var s=t.getItem(i);s&&"null"!==s&&(e[i]=s)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const i=window.sessionStorage;t=Object.keys(i).filter((t=>t.startsWith(e))).reduce(((t,s)=>(t[s.replace(e,"")]=i.getItem(s),t)),{})}return t}_getTokenForRequestHeaders(e,t){const i=`${e}Handler`,s=e===_e?"JWT ":"",a=e===_e?"Authorization":ve;if(void 0===this[i]||null===this[i])this._error(11,`${e} handler is undefined`);else{const r=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let o=this[i].getItem(r);o?t[a]=t[a]||s+o:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((i=>{t.push(`${i}=${e[i]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let i;const s=new Promise(((e,t)=>{i=(i,s)=>{i?t(i):e(s)}}));return t.addEventListener("loadend",(function e(s){t.removeEventListener("loadend",e),s.error?i(s.error):i(null,t.result)})),t.readAsText(e),s}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let i=0;for(;i<e.length;){let s=e[i],a=0,r=0;if(s<=127?(a=0,r=255&s):s<=223?(a=1,r=31&s):s<=239?(a=2,r=15&s):s<=244&&(a=3,r=7&s),e.length-i-a>0){let t=0;for(;t<a;)s=e[i+t+1],r=r<<6|63&s,t+=1}else r=65533,a=e.length-i;t+=String.fromCodePoint(r),i+=a+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},i=e.trim().split(/[\r\n]+/);for(const e in i)if(i.hasOwnProperty(e)&&""!==i[e]){let s=": ",a=i[e].split(s);t[a.shift().toLowerCase()]=a.join(s)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,i,s){let a=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(s)>=0&&(a=t.getResponseHeader(s));break;case this._NATIVE_XHR:t&&t.headers&&(a=JSON.parse(t.headers)[s])}if(a){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):i;e.getItem(t)!==a&&(e.setItem(t,a),this._emitTokenUpdate(i,a))}}_emitTokenUpdate(e,t){if(this.htmlContext){const i=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(i)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,i,s,a,r;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),i=e.getResponseHeader("AuthenticationData"),s=e.getResponseHeader("AuthenticationState"),a=e.getResponseHeader("AuthenticationChallenge"),r=e.getResponseHeader("AuthenticationResponse");else{let o=JSON.parse(e.headers);t=o.authenticationtype,i=o.authenticationdata||null,s=o.authenticationstate,a=o.authenticationchallenge,r=o.authenticationresponse}return{type:t,data:i,state:s,challenge:a,response:r}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",i=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const s=this._getSignatureData(e,t,i);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:s}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",i="",s=""){let a;if("object"==typeof e&&e){const r=this._getSignatureData(e.signatureType,t,i);a=this._makeKeyValuePairFromObject(r,e.signatureValue),e.challenge&&(a+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(a,e.signatureType,s)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(a=`password=${e}`,this._buildSignatureHeaders(a,"2",s)):(a=`${i}=${e}`,this._buildSignatureHeaders(a,t,s)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let i,s=e.split(",");if(s.length>1){i=s.map((e=>`${e}=${t[e]}`)).join(",")}else i=`${e}=${t}`;return i}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",i=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),i&&(this.headers=Object.assign(this.headers,{AuthenticationState:i})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),a=this._ERROR_CODES.SIGNATURE_INVALID.includes(s),{type:r,data:o,state:n,challenge:c,response:l}=this._extractSignatureResponseHeaders(e),d=this._getRequestMetadata(e);if(a)this._notifySignatureInvalid(d),i=!0;else if(r)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(s)?(this._notifySignatureTypeUsingErrorCode(s,d,r,o,n,c,l),i=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(d,r,o,n,c,l),i=!0}return i}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),a=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(s),r=this._getRequestMetadata(e);a&&(this._notifyWaitingForProcessResponse(r),i=!0)}return i}_notifySignatureRequiredFirstStep(e,t,i,s){this._defineSignatureType(t,i),this._defineSignatureValue(t,i,s),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:i,metadata:e}}))}_notifySignatureRequired(e,t,i,s,a,r){this._defineSignatureValue(t,i,s);const o={type:t,data:i,challenge:a,metadata:e};r&&(o.response=r),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:o}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:i}=e;return{path:this._path,method:this.method,url:t,status:i}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",i=""){const s=t.split(";").findIndex((t=>t===e));return i?i.split(";")[s]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,i,s,a,r){s?this._notifySignatureRequired(e,t,i,s,a,r):this._notifySignatureRequiredFirstStep(e,t,i,s)}_notifySignatureTypeUsingErrorCode(e,t,i,s,a,r,o){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,i,s,a):this._notifySignatureRequired(t,i,s,a,r,o)}}class Se extends Ce{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}}class xe extends Ce{constructor(e=null){super(Object.assign(e||{},{method:"POST"}))}toString(e=""){return super.toString(e||"BGADPRequestPOST")}}class $e extends Se{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/economic-data`)}toString(){return super.toString("BGADPCustomersCustomerEconomicDataGetV0")}}class Ee extends Se{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/civil-registries`)}toString(){return super.toString("BGADPCustomersCivilRegistriesGetV1")}}class Te extends xe{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/civil-registries/search`)}toString(){return super.toString("BGADPCustomersCivilRegistriesSearchPostV1")}}class Pe extends Se{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/identification-process/documents`)}toString(){return super.toString("BGADPCustomersCustomerIdentificationProcessDocumentsGetV1")}}class De extends xe{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/identification-process/documents`)}toString(){return super.toString("BGADPCustomersCustomerIdentificationProcessDocumentsPostV1")}}class Ie extends Se{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/indicators`)}toString(){return super.toString("BGADPCustomersCustomerIndicatorsGetV1")}}class we extends Se{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/terms`)}toString(){return super.toString("BGADPCustomersCustomerTermsGetV1")}}class Oe extends xe{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/terms`)}toString(){return super.toString("BGADPCustomersCustomerTermsPostV1")}}class Ae extends(t(i)){_mappingBank(e){this._renameProperty(e,"bank.bankId","id"),this._renameProperty(e,"bank.branch.branchId","id"),e.bank&&e.bank.branch&&e.bank.branch.costCenter&&(e.bank.branch.costCenter={id:e.bank.branch.costCenter})}_mappingGender(e){this._renameProperty(e,"gender.name","description")}_mappingIdentityDocuments(e){for(let t=0;t<e.identityDocuments.length;t++)this._renameProperty(e.identityDocuments[t],"documentType.name","description"),this._renameProperty(e.identityDocuments[t],"status.name","description")}_mappingMaritalStatus(e){this._renameProperty(e,"maritalStatus.name","description")}_mappingNationalities(e){for(let t=0;t<e.nationalities.length;t++)this._renameProperty(e.nationalities[t],"name","description")}_mappingPersonalTitle(e){this._renameProperty(e,"personalTitle.name","description")}_mappingResidence(e){this._renameProperty(e,"residence","taxResidence"),this._renameProperty(e,"taxResidence.residenceType.name","description")}_mappingVerification(e){this._renameProperty(e,"enrollmentModality","verification"),this._renameProperty(e,"verification.enrollmentMethod","identificationMethod")}_mappingSegments(e){for(let t=0;t<e.segments.length;t++)this._renameProperty(e.segments[t],"name","description")}_changeNameToDescription(e){e.map((e=>{this._renameProperty(e,"name","description")}))}}class Re extends Ae{static get is(){return"bbva-global-customer-terms-base-api-dm"}resetCustomerTerms(){this.customerTerms=[]}getCustomerTerms(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields,this._paginationMapping)}postCustomerTerms(e,t){this._requestMapping(t);const i={"customer-id":e};this._generateGetService(this._getService("post",t,i),this.constructor.POST_EVENTS,this._responseMapping),this.resetCustomerTerms()}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}CustomerTerms`,this._getBgadp(s))}_getBgadp(e){return{getCustomerTermsV1:()=>new we(e),postCustomerTermsV1:()=>new Oe(e),default:()=>"BGADP does not exist."}}_requestMapping(e){return e}_responseMapping(e){return e}_paginationMapping(e){return e}}s(Re,"GET_EVENTS",{customEvent:"customer-terms-api-dm-fetch",paginationEvent:"customer-terms-api-dm-pagination",errorFireEventHandler:"customer-terms-api-dm-fetch-error"}),s(Re,"POST_EVENTS",{customEvent:"customer-terms-api-dm-create",errorFireEventHandler:"customer-terms-api-dm-create-error"}),customElements.define(Re.is,Re);class Ve extends Ae{static get is(){return"bbva-global-customer-terms-api-dm"}static get properties(){return{customerTerms:{type:Array,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.customerTerms=[],this.country="",this.localCustomProperties={},this._countries=[],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties","customerTerms"],this._loaded=!1,this._requestParams={}}update(e){super.update(e),e.forEach(((e,t)=>{"country"===t&&this.country&&this.country!==e?this._loadModule():"_module"!==t&&"_requestParams"!==t&&"_loaded"!==t&&this._module&&this[t]!==e?this._module[t]=this[t]:("_requestParams"===t&&this._requestParams&&this._requestParams!==e&&void 0!==e&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===t&&this._loaded)&&Object.entries(this._requestParams).forEach((([e])=>{this[`_${e}CustomerTerms`]()}))}))}async _loadModule(){const e=this._capitalize(this.country);if(this._countries.includes(e)&&this._modules[e]){const t=`BbvaCustomerTerms${e}ApiDm`;(0,this._modules[e])().then((async e=>{const i=e[t].is;this._module=this._createModuleElement(i),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-customer-terms-api-dm-module-load")})).catch((async e=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-customer-terms-api-dm-module-error",e)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(e){return e.charAt(0).toUpperCase()+e.slice(1).toLowerCase()}_createModuleElement(e=Re.is){const t=document.createElement(e);return this._bindConfig(t),t}async _bindConfig(e){this._configProperties.forEach((t=>{e[t]=this[t]})),await this.updateComplete}_dispatchEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}async resetCustomerTerms(){await this.module.updateComplete,this.module.resetCustomerTerms()}async getCustomerTerms(e,t={}){await this.module.updateComplete,this._requestParams.get?this._requestParams.get.push({customerId:e,params:t}):this._requestParams={get:[{customerId:e,params:t}]}}async _getCustomerTerms(){await this.module.updateComplete,Object.keys(this.customerTerms).length||(this._requestParams.get.forEach((e=>{this.module.getCustomerTerms(e.customerId,e.params)})),delete this._requestParams.get)}async postCustomerTerms(e,t){await this.module.updateComplete,this._requestParams.post?this._requestParams.post.push({customerId:e,body:t}):this._requestParams={post:[{customerId:e,body:t}]}}async _postCustomerTerms(){await this.module.updateComplete,this._requestParams.post.forEach((e=>{this.module.postCustomerTerms(e.customerId,e.body)})),delete this._requestParams.post}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return a` ${this._module?this._module:""}`}}class Me extends Ae{static get is(){return"bbva-global-customer-lopd-documents-base-api-dm"}resetCustomerLopdDocuments(){this.customerLopdDocuments={}}getCustomerLopdDocuments(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}CustomerLopdDocuments`,this._getBgadp(s))}_getBgadp(e){return{getCustomerLopdDocumentsV3:()=>new H(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}s(Me,"GET_EVENTS",{customEvent:"customer-lopd-documents-api-dm-fetch",errorFireEventHandler:"customer-lopd-documents-api-dm-fetch-error"}),customElements.define(Me.is,Me);class Ne extends Ae{static get is(){return"bbva-global-customer-economic-data-base-api-dm"}resetCustomerEconomicData(){this.customerEconomicData={}}getCustomerEconomicData(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}CustomerEconomicData`,this._getBgadp(s))}_getBgadp(e){return{getCustomerEconomicDataV0:()=>new $e(e),getCustomerEconomicDataV2:()=>new ae(e),getCustomerEconomicDataV3:()=>new re(e),default:()=>"BGADP does not exist."}}_incomesMapping(e){e.map((e=>{e.incomeValue={},e.incomeValue={valueType:"EXACT",amount:{amount:e.incomeValues[0].amount,currency:e.incomeValues[0].currency}},e.incomeValues[0].concept&&(e.incomeValue.concept=e.incomeValues[0].concept),e.incomeValues[0].frecuency&&(e.incomeValue.frequency=e.incomeValues[0].frecuency),"BIWEEKLY"==e.incomeValue.frequency&&(e.incomeValue.frequency="BI_WEEKLY"),this._removeFields(["incomeValues"],e),this._changeNameToDescription([e.incomeType])}))}_expensesMapping(e){e.map((e=>{e.expenseValue={currency:e.expenseValues[0].currency,amount:e.expenseValues[0].amount},e.expenseValues[0].frecuency&&(e.expenseValue.frequency=e.expenseValues[0].frecuency),e.expenseValue.frequency&&"BIWEEKLY"==e.expenseValue.frequency&&(e.expenseValue.frequency="BI_WEEKLY"),this._removeFields(["expenseValues"],e),this._changeNameToDescription([e.expenseType])}))}_workPlaceMapping(e){e.address&&(e.address.addressType&&"WORK"!==e.address.addressType.id&&this._removeFields(["id"],e.address.addressType),e.address.ownershipType&&(["MOVED","REJECTED","NOT_LOCATED"].includes(e.address.ownershipType.id)&&this._removeFields(["id"],e.address.ownershipType),this._changeNameToDescription([e.address.ownershipType,e.address.ownershipType.propertyType])),this._renameProperty(e.address.location,"addressName","formatedAddress"),this._removeFields(["residenceStartDate"],e.address),this._removeFields(["city","state","country","zipCode","geolocation","geographicGroups","meta"],e.address.location)),this._changeNameToDescription([e.address.addressType,e.economicActivity,e.profesionPosition]),this._renameProperty(e,"profesionPosition","professionPosition"),this._removeFields(["taxpayerIdentification"],e)}_assetsMapping(e){e.map((e=>{this._changeNameToDescription([e.assetType]),e.assetValues.map((e=>{this._removeFields(["concept"],e)}))}))}_liabilitiesMapping(e){e.map((e=>{this._changeNameToDescription([e.liabilityType]),e.liabilityValues.map((e=>{this._removeFields(["concept","frecuency"],e)}))}))}_responseMapping(e){return"0"==this.version&&Object.keys(e).length?(this._changeNameToDescription([e.economicActivity,e.occupationType,e.employmentSituation,e.education]),e.incomes&&this._incomesMapping(e.incomes),e.expenses&&this._expensesMapping(e.expenses),e.workPlace&&this._workPlaceMapping(e.workPlace),e.assets&&this._assetsMapping(e.assets),e.liabilities&&this._liabilitiesMapping(e.liabilities),e.balances&&e.balances.map((e=>{this._changeNameToDescription([e])})),this._renameProperty(e,"workPlace","workplace"),this._removeFields(["financialGroup","financialSubGroup","indicators","incomeSources"],e)):"2"==this.version&&Object.keys(e).length&&(e.workPlace&&e.workPlace.economicActivities&&(e.workPlace.economicActivity=e.workPlace.economicActivities[0],this._removeFields(["economicActivities"],e.workPlace)),e.balances&&e.balances.forEach((e=>{e.id=e.balanceType.id,e.description=e.balanceType.description,e.amount=e.balanceValue.amount,e.currency=e.balanceValue.currency,this._removeFields(["balanceType","balanceValue"],e)})),e.expenses&&e.expenses.forEach((e=>{["OTHER_LOAN","REVOLVING_CARD","FIXED_PAYMENT"].includes(e.expenseType.id)&&this._removeFields(["expenseType"],e)})),e.assets&&e.assets.forEach((e=>{["BANK_DEPOSIT"].includes(e.assetType.id)&&this._removeFields(["assetType"],e)})),e.liabilities&&e.liabilities.forEach((e=>{["MORTGAGE","PERSONAL_LOANS","OTHER_LOANS"].includes(e.liabilityType.id)&&this._removeFields(["liabilityType"],e)})),this._renameProperty(e,"workPlace","workplace"),this._removeFields(["financialSummaries"],e)),e}}s(Ne,"GET_EVENTS",{customEvent:"customer-economic-data-api-dm-fetch",errorFireEventHandler:"customer-economic-data-api-dm-fetch-error"}),customElements.define(Ne.is,Ne);class ke extends Ae{static get is(){return"bbva-global-civil-registries-search-base-api-dm"}resetCivilRegistriesSearch(){this.civilRegistriesSearch=[]}postCivilRegistriesSearch(e){this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}CivilRegistriesSearch`,this._getBgadp(s))}_getBgadp(e){return{postCivilRegistriesSearchV1:()=>new Te(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}s(ke,"POST_EVENTS",{customEvent:"civil-registries-search-api-dm-fetch",errorFireEventHandler:"civil-registries-search-api-dm-fetch-error"}),customElements.define(ke.is,ke);class Fe extends Ae{static get is(){return"bbva-global-civil-registries-search-api-dm"}static get properties(){return{civilRegistriesSearch:{type:Array,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}async resetCivilRegistriesSearch(){await this.module.updateComplete,this.module.resetCivilRegistriesSearch()}constructor(){super(),this.civilRegistriesSearch=[],this.country="",this.localCustomProperties={},this._countries=["Mx"],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties"],this._loaded=!1,this._requestParams={},this._modules={Mx:()=>import("./b460522a.js")}}update(e){super.update(e),e.forEach(((e,t)=>{"country"===t&&this.country&&this.country!==e?this._loadModule():"_module"!==t&&"_requestParams"!==t&&"_loaded"!==t&&this._module&&this[t]!==e?this._module[t]=this[t]:("_requestParams"===t&&this._requestParams&&this._requestParams!==e&&void 0!==e&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===t&&this._loaded)&&Object.entries(this._requestParams).forEach((([e])=>{this[`_${e}CivilRegistriesSearch`]()}))}))}async _loadModule(){const e=this._capitalize(this.country);if(this._countries.includes(e)&&this._modules[e]){const t=`BbvaCivilRegistriesSearch${e}ApiDm`;(0,this._modules[e])().then((async e=>{const i=e[t].is;this._module=this._createModuleElement(i),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-civil-registries-search-api-dm-module-load")})).catch((async e=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-civil-registries-search-api-dm-module-error",e)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(e){return e.charAt(0).toUpperCase()+e.slice(1).toLowerCase()}_createModuleElement(e=ke.is){const t=document.createElement(e);return this._bindConfig(t),t}async _bindConfig(e){this._configProperties.forEach((t=>{e[t]=this[t]})),await this.updateComplete}_dispatchEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}async postCivilRegistriesSearch(e){await this.module.updateComplete,this._requestParams.post?this._requestParams.post.push({body:e}):this._requestParams={post:[{body:e}]}}async _postCivilRegistriesSearch(){await this.module.updateComplete,this._requestParams.post.forEach((e=>{this.module.postCivilRegistriesSearch(e.body)})),delete this._requestParams.post}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return a` ${this._module?this._module:""}`}}class qe extends Ae{static get is(){return"bbva-global-civil-registries-base-api-dm"}resetCivilRegistries(){this.civilRegistries=[]}getCivilRegistries(e){this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields,this._paginationMapping)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}CivilRegistries`,this._getBgadp(s))}_getBgadp(e){return{getCivilRegistriesV1:()=>new Ee(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}_paginationMapping(e){return e}}s(qe,"GET_EVENTS",{customEvent:"civil-registries-api-dm-fetch",paginationEvent:"civil-registries-api-dm-pagination",errorFireEventHandler:"civil-registries-api-dm-fetch-error"}),customElements.define(qe.is,qe);class Be extends Ae{static get is(){return"bbva-global-customers-child-customers-base-api-dm"}postCustomersChildCustomers(e){this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}CustomersChildCustomers`,this._getBgadp(s))}_getBgadp(e){return{postCustomersChildCustomersV3:()=>new ne(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}s(Be,"POST_EVENTS",{customEvent:"customers-child-customers-api-dm-create",errorFireEventHandler:"customers-child-customers-api-dm-create-error"}),customElements.define(Be.is,Be);class je extends Ae{static get is(){return"bbva-global-customer-identification-process-documents-base-api-dm"}resetCustomerIdentificationProcessDocuments(){this.customerIdentificationProcessDocuments=[]}getCustomerIdentificationProcessDocuments(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}postCustomerIdentificationProcessDocuments(e,t){const i={"customer-id":e};this._generateGetService(this._getService("post",t,i),this.constructor.POST_EVENTS,this._responseMapping),this.resetCustomerIdentificationProcessDocuments()}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}CustomerIdentificationProcessDocuments`,this._getBgadp(s))}_getBgadp(e){return{getCustomerIdentificationProcessDocumentsV1:()=>new Pe(e),postCustomerIdentificationProcessDocumentsV1:()=>new De(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}s(je,"GET_EVENTS",{customEvent:"customer-identification-process-documents-api-dm-fetch",errorFireEventHandler:"customer-identification-process-documents-api-dm-fetch-error"}),s(je,"POST_EVENTS",{customEvent:"customer-identification-process-documents-api-dm-create",errorFireEventHandler:"customer-identification-process-documents-api-dm-create-error"}),customElements.define(je.is,je);class He extends Ae{static get is(){return"bbva-global-customer-identification-process-documents-api-dm"}static get properties(){return{customerIdentificationProcessDocuments:{type:Array,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.customerIdentificationProcessDocuments=[],this.country="",this.localCustomProperties={},this._countries=[],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties","customerIdentificationProcessDocuments"],this._loaded=!1,this._requestParams={}}update(e){super.update(e),e.forEach(((e,t)=>{"country"===t&&this.country&&this.country!==e?this._loadModule():"_module"!==t&&"_requestParams"!==t&&"_loaded"!==t&&this._module&&this[t]!==e?this._module[t]=this[t]:("_requestParams"===t&&this._requestParams&&this._requestParams!==e&&void 0!==e&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===t&&this._loaded)&&Object.entries(this._requestParams).forEach((([e])=>{this[`_${e}CustomerIdentificationProcessDocuments`]()}))}))}async _loadModule(){const e=this._capitalize(this.country);if(this._countries.includes(e)&&this._modules[e]){const t=`BbvaCustomerIdentificationProcessDocuments${e}ApiDm`;(0,this._modules[e])().then((async e=>{const i=e[t].is;this._module=this._createModuleElement(i),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-customer-identification-process-documents-api-dm-module-load")})).catch((async e=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-customer-identification-process-documents-api-dm-module-error",e)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(e){return e.charAt(0).toUpperCase()+e.slice(1).toLowerCase()}_createModuleElement(e=je.is){const t=document.createElement(e);return this._bindConfig(t),t}async _bindConfig(e){this._configProperties.forEach((t=>{e[t]=this[t]})),await this.updateComplete}_dispatchEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}async resetCustomerIdentificationProcessDocuments(){await this.module.updateComplete,this.module.resetCustomerIdentificationProcessDocuments()}async getCustomerIdentificationProcessDocuments(e,t={}){await this.module.updateComplete,this._requestParams.get?this._requestParams.get.push({customerId:e,params:t}):this._requestParams={get:[{customerId:e,params:t}]}}async _getCustomerIdentificationProcessDocuments(){await this.module.updateComplete,Object.keys(this.customerIdentificationProcessDocuments).length||(this._requestParams.get.forEach((e=>{this.module.getCustomerIdentificationProcessDocuments(null==e?void 0:e.customerId,null==e?void 0:e.params)})),delete this._requestParams.get)}async postCustomerIdentificationProcessDocuments(e,t){await this.module.updateComplete,this._requestParams.post?this._requestParams.post.push({customerId:e,body:t}):this._requestParams={post:[{customerId:e,body:t}]}}async _postCustomerIdentificationProcessDocuments(){await this.module.updateComplete,this._requestParams.post.forEach((e=>{this.module.postCustomerIdentificationProcessDocuments(null==e?void 0:e.customerId,null==e?void 0:e.body)})),delete this._requestParams.post}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return a` ${this._module?this._module:""}`}}class Ge extends Ae{static get is(){return"bbva-global-customer-indicators-base-api-dm"}resetCustomerIndicators(){this.customerIndicators=[]}getCustomerIndicators(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}CustomerIndicators`,this._getBgadp(s))}_getBgadp(e){return{getCustomerIndicatorsV1:()=>new Ie(e),getCustomerIndicatorsV3:()=>new oe(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return"1"==this.version&&Object.keys(e).length&&e.forEach((e=>{["BASIC_DATA","ENTREPRENEUR_AND_POTENTIAL","WEB_CONSUMPTION_ACCOUNT","USER_EXPIRED"].includes(e.id)&&this._removeFields(["id"],e),this._removeFields(["payrollAmounts","payrollAge"],e)})),e}}s(Ge,"GET_EVENTS",{customEvent:"customer-indicators-api-dm-fetch",errorFireEventHandler:"customer-indicators-api-dm-fetch-error"}),customElements.define(Ge.is,Ge);class Le extends(t(i)){}class Ue extends Le{static get is(){return"bbva-global-verifications-api-dm"}constructor(){super()}postVerifications(e){this._generateGetService(this._getService("post",e),{customEvent:"verifications-api-dm-create",errorFireEventHandler:"verifications-api-dm-create-error"},this._responseMapping)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}Verifications`,this._getBgadp(s))}_getBgadp(e){return{postVerificationsV1:()=>new G(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}class ze extends Le{static get is(){return"bbva-global-verification-api-dm"}static get properties(){return{verification:{type:Object,attribute:!1}}}constructor(){super(),this.verification={}}resetVerification(){this.verification={}}getVerification(e,t={}){if(Object.keys(this.verification).length)return;t=Object.assign({"verification-id":e},t),this._generateGetService(this._getService("get",{},t),{customEvent:"verification-api-dm-fetch",errorFireEventHandler:"verification-api-dm-fetch-error"},this._responseMapping,t.fields)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}Verification`,this._getBgadp(s))}_getBgadp(e){return{getVerificationV1:()=>new L(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}class Ke extends Le{static get is(){return"bbva-global-verification-attachment-api-dm"}constructor(){super()}putVerificationAttachment(e,t,i){const s={"verification-id":e,"attachment-id":t};this._generateGetService(this._getService("put",i,s),{customEvent:"verification-attachment-api-dm-update",errorFireEventHandler:"verification-attachment-api-dm-update-error"},this._responseMapping)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}VerificationAttachment`,this._getBgadp(s))}_getBgadp(e){return{putVerificationAttachmentV1:()=>new U(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}class Ye extends Le{static get is(){return"bbva-global-verification-execute-api-dm"}constructor(){super()}postVerificationExecute(e){const t={"verification-id":e};this._generateGetService(this._getService("post",{},t),{customEvent:"verification-execute-api-dm-create",errorFireEventHandler:"verification-execute-api-dm-create-error"},this._responseMapping)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}VerificationExecute`,this._getBgadp(s))}_getBgadp(e){return{postVerificationExecuteV1:()=>new z(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}customElements.define(ze.is,ze),customElements.define(Ke.is,Ke),customElements.define(Ye.is,Ye),customElements.define(Ue.is,Ue);const{moment:Xe}=window;function Je(e,t,i){e.dispatchEvent(new CustomEvent(t,{detail:i,bubbles:!0,composed:!0}))}var We=r`
  :host([hidden]),
  [hidden] {
    display: none !important;
  }

  *,
  *:before,
  *:after {
    box-sizing: inherit;
  }

  [data-tag-name='bbva-help-modal']
    .half-modal-wrapper
    [data-tag-name='bbva-clip-microillustration'] {
    margin: 1rem 0;
  }
  [data-tag-name='bbva-help-modal'] .half-modal-wrapper .modal-title {
    margin-bottom: 0.5rem;
  }
  [data-tag-name='bbva-help-modal'] .half-modal-wrapper .modal-text {
    margin-bottom: 1.5rem;
  }
  [data-tag-name='bbva-help-modal']
    .half-modal-wrapper
    [data-tag-name='bbva-type-text']:last-child {
    margin-bottom: 0.5rem;
  }
  [data-tag-name='bbva-help-modal'] .half-modal-wrapper [data-tag-name='bbva-button-default'] {
    margin-bottom: 1rem;
  }
  [data-tag-name='bbva-help-modal']
    .half-modal-wrapper
    [data-tag-name='bbva-type-icon'][mode='caution'] {
    --bbva-type-icon--custom--primary-ambient--color: var(--_icon-warning);
    margin: 1.5rem 0 1rem 0;
  }

  .u-padding-top-1-5 {
    padding-top: 1.5rem;
  }
`,Qe=r`
  :host {
    --_icon-warning: var(
      --bbva-feature-national-id-and-videoselfie-mx--_ambient--_icon-warning,
      ${y("colorPrimaryAltSupportWarningDefault",{colorPrimaryAltSupportWarningDefault:"#685219"})}
    );
  }
`;class Ze extends(o(C(n(i)))){static get is(){return"national-videoselfie-half-modal"}static get scopedElements(){const e=[E,T,Y,P,D];return Ze.scopedElementsFromClasses(e)}static get styles(){return[We,Qe,S.primary,K.primary,x.primaryAlt,$.primary,c("national-videoselfie-half-modal-shared-styles")]}static get properties(){return{visible:{type:Boolean},config:{type:Object},closeModalElements:{type:Array},icons:{type:Object}}}constructor(){super(),this.visible=!1,this.closeModalElements=["header","footer-button"],this.iOSFixedHeader=!1,this.icons={caution:l(),default:d()},this._initialConfig()}_initialConfig(e={}){this.config={modalId:"",mode:"",headerText:"",buttonText:"",linkText:"",headerType:"modal",footerButtonAriaLabel:"",closeModalElements:["header","footer-button"],microillustration:"error",modalTitle:"",modalType:"",withoutSlot:!1,paragraphs:[],...e}}_changeVisible({detail:e}){this.visible=e,e&&this._initialConfig(this.config),this._dispatch(`${Ze.is}-change`,e)}_handleHeaderClick(e){e.stopPropagation(),this._dispatch(`${Ze.is}-header-click`)}_handleButtonClick(e){e.stopPropagation(),this._dispatch(`${Ze.is}-button-click`)}_dispatch(e,t=null){Je(this,e,t)}_renderParagraphs(e){return a`
      <bbva-type-text
        class="modal-text"
        size="S"
        text="${this.t(e)}"
        unset
      ></bbva-type-text>
    `}_renderBullets(e,t){return a`
      <bbva-list-bullet
        ordered=""
        role="listitem"
        value="${t+1}"
        text=${this.t(e)}
      ></bbva-list-bullet>
    `}_getIcon(e){return this.icons[e]}render(){return a`
      <bbva-help-modal
        ?visible="${this.visible}"
        id-modal="${this.config.modalId}Modal"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        header-text="${this.t(this.config.headerText)}"
        button-text="${this.t(this.config.buttonText||"")}"
        footer-button-aria-label="${this.t(this.config.buttonText||"")}"
        footer-link-aria-label="${this.t(this.config.linkText||"")}"
        header-left-icon-aria-label="${this.t(this.config.headerText||"")}"
        link-text="${this.t(this.config.linkText||"")}"
        header-type="${this.config.headerType||""}"
        header-close-icon-aria-label="bbva-feature-national-id-and-videoselfie-mx-close-button"
        hide-content-padding-top
        @visible-changed="${this._changeVisible}"
        @help-modal-header-click="${this._handleHeaderClick}"
        @help-modal-footer-button-click="${this._handleButtonClick}"
        .close-modal-elements="${this.closeModalElements}"
      >
        <div slot="slot-content">
          <div class="half-modal-wrapper ${this.config.additionalClass||""}" ambient="primary">
            ${this.config.modalType?a`
                  <bbva-type-icon
                    size="24"
                    mode="${this.config.modalType}"
                    icon="${this._getIcon(this.config.modalType||"default")}"
                  ></bbva-type-icon>
                `:h}
            ${this.config.microillustration?a`
                  <bbva-clip-microillustration
                    size="M"
                    microillustration="${this.config.microillustration}"
                  >
                  </bbva-clip-microillustration>
                `:h}
            ${this.config.modalTitle?a`
                  <bbva-type-text
                    class="modal-title"
                    size="3XL"
                    text="${this.config.modalTitle||""}"
                    font-weight="${u.fontWeight50}"
                    unset
                  ></bbva-type-text>
                `:h}
            ${(this.config.paragraphs||[]).map((e=>this._renderParagraphs(e)))}
            ${(this.config.recomendations||[]).map(((e,t)=>this._renderBullets(e,t)))}
          </div>
        </div>
      </bbva-help-modal>
    `}}var et=r`
  :host([hidden]),
  [hidden] {
    display: none !important;
  }

  *,
  *:before,
  *:after {
    box-sizing: inherit;
  }

  [data-tag-name='bbva-help-modal']
    .full-modal-wrapper
    [data-tag-name='bbva-clip-microillustration'] {
    margin: 1rem 0;
  }
  [data-tag-name='bbva-help-modal'] .full-modal-wrapper .modal-title {
    margin-bottom: 0.5rem;
  }
  [data-tag-name='bbva-help-modal'] .full-modal-wrapper .modal-text {
    margin-bottom: 1.5rem;
  }
  [data-tag-name='bbva-help-modal']
    .full-modal-wrapper
    [data-tag-name='bbva-type-icon'][mode='info'] {
    --bbva-type-icon--custom--primary-ambient--color: var(--_icon-info);
    margin: 1.5625rem 0 1rem 0;
  }

  .wrap-images-pairs {
    display: flex;
    justify-content: space-between;
    margin: 1rem 0;
  }
`,tt=r`
  :host {
    --_icon-info: var(
      --bbva-feature-national-id-and-videoselfie-mx--_ambient--_icon-info,
      ${y("colorPrimaryAltSupportInfoDefault",{colorPrimaryAltSupportInfoDefault:"#004481"})}
    );
  }
`;class it extends(o(C(n(i)))){static get is(){return"national-videoselfie-full-modal"}static get scopedElements(){const e=[E,T,I,P,D,Y];return it.scopedElementsFromClasses(e)}static get styles(){return[et,tt,S.primary,x.primaryAlt,$.primary,K.primary,c("national-videoselfie-full-modal-shared-styles")]}static get properties(){return{visible:{type:Boolean},config:{type:Object},closeModalElements:{type:Array},icons:{type:Object}}}constructor(){super(),this.visible=!1,this.closeModalElements=["header","footer-button"],this.iOSFixedHeader=!1,this.icons={info:d(),default:l()},this._initialConfig()}_initialConfig(e={}){this.config={modalId:"",mode:"",headerText:"",buttonText:"",footerButtonAriaLabel:"",closeModalElements:["header","footer-button"],microillustration:"error",modalTitle:"",notificationTitle:"",notificationMessage:"",modalType:"",instructions:[],paragraphs:[],recomendations:[],...e}}_renderParagraphs(e){return a`
      <bbva-type-text
        class="modal-text"
        size="S"
        text="${this.t(e)}"
        unset
      ></bbva-type-text>
    `}_renderBullets(e,t){return a`
      <bbva-list-bullet
        ordered=""
        role="listitem"
        value="${t+1}"
        text="${this.t(e)}"
      ></bbva-list-bullet>
    `}_changeVisible({detail:e}){this.visible=e,e&&this._initialConfig(this.config),this._dispatch(`${it.is}-change`,e)}_handleHeaderClick(e){e.stopPropagation(),this._dispatch(`${it.is}-header-click`)}_handleButtonClick(e){e.stopPropagation(),this._dispatch(`${it.is}-button-click`)}_dispatch(e,t=null){Je(this,e,t)}_getIcon(e){return this.icons[e]}render(){return a`
      <bbva-help-modal
        ?visible="${this.visible}"
        id-modal="${this.config.modalId}Modal"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        full-height
        fixed-footer
        hide-content-padding-top
        header-text="${this.config.headerText}"
        button-text="${this.config.buttonText||""}"
        header-close-icon-aria-label="bbva-feature-national-id-and-videoselfie-mx-close-button"
        footer-button-aria-label="${this.config.footerButtonAriaLabel||""}"
        @visible-changed="${this._changeVisible}"
        @help-modal-header-click="${this._handleHeaderClick}"
        @help-modal-footer-button-click="${this._handleButtonClick}"
        .close-modal-elements="${this.closeModalElements}"
      >
        <div slot="slot-content">
          <div class="full-modal-wrapper" ambient="primary">
            ${this.config.modalType?a`
                  <bbva-type-icon
                    size="24"
                    mode="${this.config.modalType}"
                    icon="${this._getIcon(this.config.modalType||"default")}"
                  ></bbva-type-icon>
                `:h}
            ${this.config.microillustration?a`
                  <bbva-clip-microillustration
                    size="M"
                    microillustration="${this.config.microillustration}"
                  >
                  </bbva-clip-microillustration>
                `:h}
            <bbva-type-text
              class="modal-title"
              size="3XL"
              text="${this.config.modalTitle||""}"
              font-weight="${u.fontWeight50}"
              unset
            ></bbva-type-text>
            ${(this.config.paragraphs||[]).map((e=>this._renderParagraphs(e)))}
            ${(this.config.recomendations||[]).map(((e,t)=>this._renderBullets(e,t)))}
            ${(this.config.instructions||[]).map((e=>a`
                ${this._renderParagraphs(e.detail)}
                <div class="wrap-images-pairs">
                  ${e.imgs.map((t=>a`
                  <img
                    src="${t}"
                    alt="${e.detail}"
                  ></img>
                `))}
                </div>
              `))}
          </div>
          ${this.config.notificationTitle?a`
                <bbva-notification-message
                  message-title="${this.config.notificationTitle}"
                  message="${this.config.notificationMessage}"
                  book-title
                ></bbva-notification-message>
              `:h}
        </div>
      </bbva-help-modal>
    `}}var st=r`
  .list-simple {
    display: flex;
    justify-content: space-between;
    padding-bottom: 0.5rem;
    padding-top: 0.5rem;
  }
  .list-simple *:last-child {
    text-align: right;
  }
`;class at extends(o(C(n(i)))){static get is(){return"list-simple"}static get scopedElements(){const e=[D];return at.scopedElementsFromClasses(e)}static get styles(){return[st,$.primary,c("list-simple-shared-styles")]}static get properties(){return{items:{type:Array}}}constructor(){super(),this.items=[]}render(){return a`
      ${w(this.items,(e=>a`
          <div class="list-simple">
            <bbva-type-text size="S" text="${e.name}" unset> </bbva-type-text>
            ${e.value&&e.value.text?a`
                  <bbva-type-text size="S" text="${e.value.text}" font-weight="500" unset>
                  </bbva-type-text>
                `:h}
          </div>
        `))}
    `}}const rt="modal-initial",ot="modal-initial-secondary",nt={main:{loader:{visible:!1,ambient:"primary-alt"}}},ct=e=>e?[{id:"btn-help",eventIconName:"help-modal-header-help-click",icon:p(),accessibilityText:"bbva-feature-videoselfie-gl-header-icon-help"},{id:"btn-close",icon:m(),accessibilityText:"bbva-feature-videoselfie-gl-header-icon-close"}]:[{id:"btn-close",icon:m(),accessibilityText:"bbva-feature-videoselfie-gl-header-icon-close"}],lt=["consent","capture","confirm"],dt={obverseImage:"obverse-image",obverseFlashImage:"obverse-flash-image",reverseImage:"reverse-image",selfieImage:"selfie-image",selfieAliveImage:"selfie-alive-image",selfieVideo:"selfie-video"};var ht=r`
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

  [data-tag-name='bbva-help-modal'] {
    --bbva-help-modal-padding: 0;
    --bbva-help-modal-padding-bottom: 0;
    overflow: unset;
  }

  .continue-button {
    padding: 1.5rem 1rem;
  }

  .wrapper-container {
    padding: 0 1rem;
    width: 100%;
  }

  .flex-item {
    display: flex;
    justify-content: flex-start;
    align-items: baseline;
  }
  .flex-item [data-tag-name='bbva-type-icon'] {
    margin-right: 0.5rem;
  }
  .flex-item *:last-child {
    text-align: left;
  }

  .u-padding-top-1 {
    padding-top: 1rem;
  }

  .u-padding-top-0-5 {
    padding-top: 0.5rem;
  }

  .u-padding-bottom-0-5 {
    padding-bottom: 0.5rem;
  }

  .u-padding-bottom-1 {
    padding-bottom: 1rem;
  }

  .u-padding-left-0-5 {
    padding-left: 0.5rem;
  }

  .bg-default {
    fill: var(--bg-default);
  }

  .text-color-pending {
    color: var(--bg-default);
  }

  .text-color-success {
    color: var(--support-success);
  }

  .option-validation-left {
    margin-left: auto;
  }

  .option-disabled {
    opacity: 0.4;
  }

  .flex-module-container {
    width: 100%;
    display: flex;
  }


  .container-scanner {
    background: none;
    border: none;
    padding: 0;
    margin: 0;
    width: 100%;
  }

  .option-validation-container {
    display: flex;
  }

  .confirmation {
    width: 100%;
    padding: 1rem 1rem 1.5rem;
    background-color: var(--_primary-bg-color);
    position: fixed;
    bottom: 0;
  }

  .privacy-link {
    font-size: 1.125rem;
  }
`,ut=r`
:host {
  --_primary-bg-color: var(--bbva-feature-national-id-and-videoselfie-mx--_ambient--_primary-bg-color, ${y("colorPrimarySurfaceAmbientDefault",{colorPrimarySurfaceAmbientDefault:"#f4f4f4"})});
  --bg-default: var(--bbva-feature-national-id-and-videoselfie-mx--_ambient--_bg-default, ${y("colorPrimaryAltLinkMainDefault",{colorPrimaryAltLinkMainDefault:"#1464A5"})});
  --support-success: var(--bbva-feature-national-id-and-videoselfie-mx--_ambient--_bg-hover, ${y("colorPrimaryAltSupportSuccessDefault",{colorPrimaryAltSupportSuccessDefault:"#277A3E"})});
}
`;class mt extends(o(C(n(i)))){static get is(){return"national-videoselfie-multistep"}static get scopedElements(){const e=[V,M,J,W,me,T,Q,P,N,D,at];return mt.scopedElementsFromClasses(e)}static get styles(){return[ht,ut,O.primary,A.primary,X.primaryAlt,ue.primaryAlt,R.primaryAlt,R.primary,$.primary,x.primary,c("national-videoselfie-multistep-shared-styles")]}static get properties(){return{visible:{type:Boolean},isVideoSelfie:{type:Boolean,attribute:"is-video-selfie"},headerVariant:{type:String,attribute:"header-variant"},localPrefix:{type:String,attribute:"local-prefix"},consentBtnDisabled:{type:Boolean,attribute:"consent-btn-disabled"},captureBtnDisabled:{type:Boolean,attribute:"capture-btn-disabled"},confirmIdentityBtnDisabled:{type:Boolean,attribute:"confirm-identity-btn-disabled"},dataCustomerForm:{type:Array},documentConfig:{type:Object},selfieConfig:{type:Object},videoConfig:{type:Object},headerButtons:{type:Array},_stepsToReset:{type:Array,state:!0},_currentStep:{type:Object,state:!0}}}constructor(){super(),this.iOSFixedHeader=!1,this.visible=!1,this.localPrefix="bbva-feature-national-id-and-videoselfie-mx",this.headerVariant=rt,this.isVideoSelfie=!1,this.consentBtnDisabled=!1,this.captureBtnDisabled=!1,this.confirmIdentityBtnDisabled=!1,this.dataCustomerForm=[],this.documentConfig={},this.selfieConfig={},this.videoConfig={},this.headerButtons=ct(!1),this._currentStep={},this._stepsToReset=[]}get multistep(){return this.shadowRoot.querySelector("[data-tag-name=bbva-expandable-multistep]")}get steps(){return Array.from(this.multistep.querySelectorAll("[data-tag-name=bbva-expandable-step]"))}_dispatch(e,t=null){Je(this,e,t)}reset(){this.headerVariant=rt,this.isVideoSelfie=!1,this.consentBtnDisabled=!1,this.resetCommonProperties(),this.cleanSteps()}resetCommonProperties(){this.captureBtnDisabled=!1,this.confirmIdentityBtnDisabled=!1,this.dataCustomerForm=[],this._currentStep={},this.headerButtons=ct(!1)}cleanSteps(e=!0){this._stepsToReset=e?[0,1,2]:[1,2];const t=this.steps.slice(e?0:1,this.steps.length),i=(e?"consent":"capture")+"Step";this.requestUpdate().then((()=>{Array.from(t.keys()).forEach((e=>{t[e].completed=!1,t[e].active=t[e].id===i})),this.multistep._editionEnabled=!1}))}_handleCloseButton(e){e.stopPropagation(),this._dispatch(`${mt.is}-header-click`)}setHeaderVariant(e){this.headerVariant=e}_multistepScrollingSpecificStep({completed:e}){const t=e?ot:rt;this.setHeaderVariant(t)}_checkAllStepsCompleted(e){e&&(this.setHeaderVariant(ot),this.headerButtons=ct(!e))}completeCurrentStep(){Je(this._currentStep,"complete",!0)}_sendStepDisabled({detail:e},t){e||this._dispatch(`${this.localPrefix}-step-enabled`,{stepNumber:t,name:lt[t-1]})}_handleEditStep({detail:e}){this._dispatch(`${this.localPrefix}-step-edit`,{stepNumber:e+1})}_onContinueButtonClick({target:e}){const t=(i=e.id,i.replace(/([A-Z])/g," $1").split(" ").join("-").toLowerCase()).replace("-btn","");var i;this._currentStep=e,this._dispatch(`${mt.is}-${t}-click`,this.dataCustomerForm)}_handleCurrentActiveStep({detail:e}){const t=(e||{}).id||"confirmStep";this.headerButtons=ct("confirmStep"===t)}_renderExpandableStep(e){const{index:t,stepId:i,header:s,content:r,summary:o,editLabel:n,cancelEdit:c}=e;return a`
      <bbva-expandable-step
        id="${i}Step"
        step="${t}"
        total-steps="3"
        show-link
        current-step-label="bbva-feature-national-id-and-videoselfie-mx-multistep-step-label"
        header="${this.t(s)}"
        disabled-target=".action"
        edit-label="${this.t(n)}"
        hide-padding-top
        hide-padding-right
        hide-padding-left
        .openEditStep="${c}"
        @expandable-step-disable-change="${e=>this._sendStepDisabled(e,t)}"
        @expandable-step-edit-step="${this._handleEditStep}"
        @expandable-step-edit-step-prevent-open="${e=>this._dispatch(`${this.localPrefix}-informative-modal-click`,{type:"half",name:`edit_${this.isVideoSelfie?"video":"national"}_identity_capture`},e)}"
      >
        <div class="content">${r}</div>
        <div class="summary" slot="summary">${o}</div>
      </bbva-expandable-step>
    `}_renderContinueButton(e,t){return a`
      <div class="continue-button">
        <bbva-button-default
          id="${e}"
          fullwidth
          ?disabled="${!this[t]}"
          text="${this.t(`${this.localPrefix}-step-button-text`)}"
          @click="${e=>this._onContinueButtonClick(e)}"
        ></bbva-button-default>
      </div>
    `}get _consentStep(){const e=a`
      ${this._consentStepOpened}
      ${this._renderContinueButton("consentContinueBtn","consentBtnDisabled")}
    `,t=a`${this._consentStepCollapsed}`,i={index:1,stepId:"consent",header:this.t(`${this.localPrefix}-step-consent-header-text`),content:e,summary:t,editLabel:this.t(`${this.localPrefix}-step-edit-label`),cancelEdit:!1};return this._renderExpandableStep(i)}get _consentStepOpened(){return a`
      <div class="wrapper-container">
        <bbva-type-text
          ambient="primary"
          text=${this.t(`${this.localPrefix}-step-consent-description`)}
        >
        </bbva-type-text>

        <bbva-type-link
          class="u-padding-bottom-1 u-padding-top-1 privacy-link"
          id="privacyContinue"
          active
          ambient="primary-alt"
          @click="${e=>this._dispatch(`${this.localPrefix}-informative-modal-click`,{type:"half",name:"consent"},e)}"
        >
          ${this.t(`${this.localPrefix}-step-consent-link-text`)}
        </bbva-type-link>
      </div>
      <bbva-form-checkbox
        id="consentCheckbox"
        ambient="primary-alt"
        alignment="left"
        label="${this.t(`${this.localPrefix}-${this.isVideoSelfie?"video":"national"}-step-consent-checkbox-label`)}"
        ?checked="${this.consentBtnDisabled}"
        @change="${e=>{e.stopPropagation(),this.consentBtnDisabled=!this.consentBtnDisabled,this._dispatch(`${this.localPrefix}-privacy-consent-check`,{checked:this.consentBtnDisabled,name:"check"})}}"
      ></bbva-form-checkbox>
    `}get _consentStepCollapsed(){return a`
      <div class="wrapper-container flex-item" ambient="secondary">
        <div>
          <bbva-type-icon icon-color="#FFFFFF" icon="${g()}"></bbva-type-icon>
        </div>
        <div>
          <bbva-type-text
            text="${this.t(`${this.localPrefix}-step-consent-summary-text`)}"
          ></bbva-type-text>
        </div>
      </div>
    `}get _identityCaptureStep(){const e=a`
      ${this._getIdentityCaptureStepOpened}
      ${this._renderContinueButton("captureContinueBtn","captureBtnDisabled")}
    `,t=this._getIdentityCaptureStepCollapsed,i={index:2,stepId:"capture",header:this.t(`${this.localPrefix}-step-identity-capture-header-text`),content:e,summary:t,editLabel:this.t(`${this.localPrefix}-step-edit-label`),cancelEdit:!0};return this._renderExpandableStep(i)}get _getIdentityCaptureStepOpened(){return a`
      <div class="wrapper-container">
        <bbva-type-text
          ambient="primary"
          text="${this.t(`${this.localPrefix}-${this.isVideoSelfie?"video":"national"}-step-identity-capture-description`)}"
        >
        </bbva-type-text>
        ${this._createOption(this.documentConfig)} ${this._createOption(this.selfieConfig)}
        ${this.isVideoSelfie?this._createOption(this.videoConfig):h}
      </div>
    `}_createOption(e){return a`
      ${e.divider?a`<bbva-divider-default size="full"></bbva-divider-default>`:h}
      <button
        aria-hidden="true"
        class="container-scanner"
        id="${e.id}Module"
        @click="${()=>this._handleModuleClick(e)}"
      >
        <div
          class="option-validation-container u-padding-top-1 ${e.disabled?"option-disabled":""}"
        >
          <bbva-type-icon
            id="${e.id}Icon"
            icon="${e.icon}"
            class="${e.completed?"":"bg-default"}"
            size="24"
          ></bbva-type-icon>
          <bbva-type-text
            id="${e.id}Title"
            class="u-padding-left-0-5 ${e.completed?"":"text-color-pending"}"
            ?disabled="${e.disabled}"
            text="${this.t(e.mainTitle)}"
            size="S"
            unset
            font-weight="500"
          ></bbva-type-text>
          <bbva-type-link
            id="${e.id}Status"
            class="option-validation-left"
            size="S"
            unset
            aria-disabled="false"
            aria-label="${this.t(e.mainTitle)}"
            title="${this.t(e.mainTitle)}"
          >
            ${e.completed?this.t(`${this.localPrefix}-step-identity-capture-repeat-module`):""}
          </bbva-type-link>
        </div>
        <bbva-type-text
          id="${e.id}Repeat"
          class="u-padding-top-0-5 u-padding-bottom-1 ${e.disabled?"option-disabled":""} text-color-${e.completed?"success":"pending"}"
          text="${e.completed?this.t(`${this.localPrefix}-step-identity-capture-completed`):this.t(`${this.localPrefix}-step-identity-capture-to-complete`)}"
          font-style="italic"
          size="S"
          ?disabled="${e.disabled}"
          unset
        >
        </bbva-type-text>
      </button>
    `}_handleModuleClick(e){e.disabled||this._dispatch(`${this.localPrefix}-module-click`,e.id)}get _getIdentityCaptureStepCollapsed(){const e=[{name:`${this.localPrefix}-step-identity-capture-id-module`,value:{text:`${this.localPrefix}-step-identity-capture-completed`}},{name:`${this.localPrefix}-step-identity-capture-selfie-module`,value:{text:`${this.localPrefix}-step-identity-capture-completed`}}];return this.isVideoSelfie&&e.push({name:`${this.localPrefix}-step-identity-capture-videoselfie-module`,value:{text:`${this.localPrefix}-step-identity-capture-completed`}}),a`
      <div class="wrapper-container">
        <list-simple ambient="secondary" .items="${e}"></list-simple>
      </div>
    `}get _confirmIdentityDataStep(){const e=a`
      ${this._getIdInformationStepOpened}
      ${this._renderContinueButton("confirmIdentityContinueBtn","confirmIdentityBtnDisabled")}
    `,t=this._getDataNationalIdentificationCollapse,i={index:3,stepId:"confirm",header:this.t(`${this.localPrefix}-step-identity-data-header-text`),content:e,summary:t,editLabel:this.t(`${this.localPrefix}-step-edit-label`),cancelEdit:!1};return this._renderExpandableStep(i)}get _getIdInformationStepOpened(){return a`
      ${this.dataCustomerForm.length?a`
            <div class="wrapper-container">
              <bbva-type-text
                ambient="primary"
                text="${this.t(`${this.localPrefix}-step-confirm-identity-description`)}"
              >
              </bbva-type-text>
              ${this.dataCustomerForm.map(((e,t)=>a`
                  <bbva-form-input
                    id="${e.id}"
                    class="u-padding-bottom-0-5 u-padding-top-0-5"
                    ambient="primary-alt"
                    type="text"
                    mode-input="${e.modeInput}"
                    label="${this.t(e.label)}"
                    value="${this.t(e.value)}"
                    info-message="${this.t(e.notification)}"
                    maxlength="${e.max}"
                    max="${e.max}"
                    min="${e.max}"
                    pattern="${e.pattern}"
                    auto-validate
                    error-message="${this.t(e.errorMessage)}"
                    accessible-description="${this.t(e.label)}"
                    action-accessible-text="${this.t(e.label)}"
                    action-secondary-accessible-text="${this.t(e.label)}"
                    clear-accessible-text="${this.t(e.label)}"
                    toggle-accessible-text="${this.t(e.label)}"
                    toggle-visible-accessible-text="${this.t(e.label)}"
                    @form-field-input-validate="${e=>this._validateFields(e,t)}"
                    @form-input-value-change="${e=>{this.dataCustomerForm[t].value=e.detail.value}}"
                    required
                  ></bbva-form-input>
                `))}
            </div>
          `:h}
    `}_validateFields({detail:e},t){this.dataCustomerForm[t].isValid=!e.invalid;const i=this.dataCustomerForm.every((e=>e.isValid));this.confirmIdentityBtnDisabled=i}get _getDataNationalIdentificationCollapse(){const e=this.dataCustomerForm.map((e=>({name:e.label,value:{text:e.value}})));return a`
      <div class="wrapper-container">
        <list-simple ambient="secondary" .items="${e}"></list-simple>
      </div>
    `}_confirmOperativeProcess(){this._dispatch(`${this.localPrefix}-confirm-button-click`,{name:"validate"})}render(){return a`
      <bbva-help-modal
        id="nationalVideoselfieMultistep"
        ?visible="${this.visible}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        full-height
        header-type="${this.headerVariant}"
        header-text="${this.t(`${this.localPrefix}-header-text`)}"
        header-close-icon-aria-label="${this.t(`${this.localPrefix}-header-icon-close`)}"
        header-position="sticky"
        hide-content-padding-top
        avoid-icon-close-modal
        .headerButtons="${this.headerButtons}"
        @help-modal-header-click="${this._handleCloseButton}"
        @help-modal-header-help-click="${e=>this._dispatch(`${this.localPrefix}-informative-modal-click`,{type:"full",name:"locate_your_info"},e)}"
      >
        <div slot="slot-content">
          <bbva-expandable-multistep
            .stepsToReset="${this._stepsToReset}"
            @expandable-multistep-specific-step-scroll="${e=>this._multistepScrollingSpecificStep.call(this,e.detail)}"
            @expandable-multistep-all-complete="${e=>{this._checkAllStepsCompleted(e.detail)}}"
            @expandable-multistep-current-active-step="${this._handleCurrentActiveStep}"
          >
            <div slot="content">
              ${this._consentStep} ${this._identityCaptureStep} ${this._confirmIdentityDataStep}
            </div>

            <div slot="confirmation" class="confirmation">
              <bbva-button-default
                id="confirmButton"
                fullwidth
                variant="positive"
                text="${this.t(`${this.localPrefix}-summary-button-text`)}"
                @click="${this._confirmOperativeProcess}"
              ></bbva-button-default>
            </div>
          </bbva-expandable-multistep>
        </div>
      </bbva-help-modal>
    `}}var pt=r`
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

  [data-tag-name='bbva-help-modal'] .receipt-modal-wrapper .panel-process {
    padding: 1.5rem 0;
  }
  [data-tag-name='bbva-help-modal'] .receipt-modal-wrapper .panel-process .modal-title {
    padding-bottom: 1rem;
  }
  [data-tag-name='bbva-help-modal'] .receipt-modal-wrapper .summary-receipt {
    padding-bottom: 1rem;
  }
  [data-tag-name='bbva-help-modal']
    .receipt-modal-wrapper
    [data-tag-name='bbva-notification-message'] {
    margin: 1rem 0;
  }
`;class gt extends(o(C(n(i)))){static get scopedElements(){const e=[F,T,E,D,I,at];return gt.scopedElementsFromClasses(e)}static get is(){return"national-videoselfie-receipt"}static get properties(){return{visible:{type:Boolean},receiptData:{type:Object},email:{type:String},localPrefix:{type:String,attribute:"local-prefix"}}}static get styles(){return[pt,k.primary,S.primary,$.primary,c("national-videoselfie-receipt-shared-styles")]}constructor(){super(),this.visible=!1,this.iOSFixedHeader=!1,this.receiptData={},this.email="",this.localPrefix="bbva-feature-national-id-and-videoselfie-mx"}_dispatch(e,t){Je(this,e,t)}render(){return a`
      <bbva-help-modal
        id-modal="sucessReceiptModal"
        full-height
        header-text="${this.t(`${this.localPrefix}-header-text`)}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ?visible="${this.visible}"
        hide-content-padding-top
        @help-modal-header-click="${e=>this._dispatch(`${gt.is}-header-click`,e)}"
        header-close-icon-aria-label="close"
      >
        <div slot="slot-content" role="region" tabindex="0">
          <div class="receipt-modal-wrapper" tabindex="0" ambient="primary">
            <div class="panel-process">
              <bbva-clip-microillustration size="M" microillustration="success">
              </bbva-clip-microillustration>
              <div class="modal-title">
                <bbva-type-text
                  size="3XL"
                  tag="h3"
                  text="${this.t(`${this.localPrefix}-receipt-first-title`)}"
                  font-weight="${u.fontWeight50}"
                  unset
                ></bbva-type-text>
                <bbva-type-text
                  size="3XL"
                  tag="h3"
                  text="${this.t(`${this.localPrefix}-receipt-second-title`)}"
                  font-weight="${u.fontWeight50}"
                  unset
                ></bbva-type-text>
              </div>
              <bbva-type-text
                class="modal-text"
                size="S"
                text="${this.t(`${this.localPrefix}-receipt-description`)}"
                unset
              ></bbva-type-text>
            </div>
            ${(this.receiptData.operationSummary||[]).map((e=>a`
                <div class="summary-receipt">
                  ${e.header?a`<bbva-header-category
                        text="${this.t(e.header)}"
                      ></bbva-header-category>`:h}
                  <list-simple ambient="primary" .items="${e.list}"></list-simple>
                </div>
              `))}
            <bbva-notification-message
              data-acoustic-obfuscate
              message-title="${this.t(`${this.localPrefix}-receipt-first-notification`)}"
              book-title
            >
              <bbva-type-text
                unset
                text="${this.email.toLowerCase()}"
                size="S"
                font-weight="500"
              ></bbva-type-text>
            </bbva-notification-message>
            ${this.receiptData.alternalNotification?a`
                  <bbva-notification-message
                    message-title="${this.t(this.receiptData.alternalNotification)}"
                    book-title
                  ></bbva-notification-message>
                `:h}
          </div>
        </div>
      </bbva-help-modal>
    `}}var ft=r`
  :host {
    display: block;
    box-sizing: border-box;
    --bbva-progress-content-z-index: 11;
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
`;class bt extends(q(C(o(n(i))))){static get is(){return"bbva-feature-national-id-and-videoselfie-mx"}static get properties(){return{videoSelfieMode:{type:Boolean,attribute:"video-selfie-mode"},customerId:{type:String,attribute:"customer-id"},customerEmail:{type:String,attribute:"customer-email"},accountId:{type:String,attribute:"account-id"},veridasConfig:{type:Object},customersApiVersion:{type:String,attribute:"customers-api-version"},documentsVerificationsApiVersion:{type:String,attribute:"documents-verifications-api-version"},customerDocumentsApiVersion:{type:String,attribute:"customer-documents-api-version"},processTermsId:{type:String,attribute:"process-terms-id"},verificationId:{type:String,attribute:"verification-id"},customerOperationNumber:{type:String,attribute:"customer-operation-number"},customerOperationDate:{type:String,attribute:"customer-operation-date"},maxRetries:{type:Number,attribute:"max-retries"},documentConfig:{type:Object},selfieConfig:{type:Object},videoConfig:{type:Object},isNativeIos:{type:Boolean,attribute:"is-native-ios"},documentType:{type:String,attribute:"document-type"},nextModuleCapture:{type:String,attribute:"next-module-capture"},temporalAttachmentParams:{type:Array},attachmentIds:{type:Object},capturedBiometrics:{type:Object},currentDocumentAttachmentParam:{type:Object},resizePercentage:{type:Number,attribute:"resize-percentage"},poolingGetVerificationMaxCalls:{type:Number,attribute:"pooling-get-verification-max-calls"},poolingGetVerificationDelay:{type:Number,attribute:"pooling-get-verification-delay"},poolingValidationsMaxCalls:{type:Number,attribute:"pooling-validations-max-calls"},poolingCallsCount:{type:Number,attribute:"pooling-calls-count"},poolingGetVerificationCount:{type:Number,attribute:"pooling-get-verification-count"},dataExtractedFromVeridas:{type:Object},separationSymbol:{type:String,attribute:"separation-symbol"},hyphen:{type:String},underscore:{type:String},evaluationCriteria:{type:String,attribute:"evaluation-criteria"},fromProceedings:{type:Boolean,attribute:"from-proceedings"},formFilledData:{type:Array},formIdentificationData:{type:Object},operationFormatDate:{type:String,attribute:"operation-format-date"},disabledDefaultModule:{type:Boolean,attribute:"disabled-default-module"},_modalData:{type:Object,state:!0},_showMultistep:{type:Boolean,state:!0},_halfModalOpened:{type:Boolean,state:!0},_halfModalConfig:{type:Object,state:!0},_fullModalOpened:{type:Boolean,state:!0},_fullModalConfig:{type:Object,state:!0},_errorCounter:{type:Number,state:!0},_errorExtractedCounter:{type:Number,state:!0},_lastService:{type:String,state:!0},_lastPlugin:{type:String,state:!0},_obverseSaved:{type:Boolean,state:!0},_reverseSaved:{type:Boolean,state:!0},_videoSelfieSaved:{type:Boolean,state:!0},_lastServiceRequest:{type:Object,state:!0},_receiptConfig:{type:Object,state:!0},_showReceipt:{type:Boolean,state:!0}}}static get scopedElements(){const e=[Fe,He,Ve,ce,Ke,Ye,ze,Ue,de,Z,ee,le,te,ie,he,j,it,Ze,mt,gt];return bt.scopedElementsFromClasses(e)}static get styles(){return[ft,B.primaryAlt,c("bbva-feature-national-id-and-videoselfie-mx-shared-styles")]}constructor(){var e;super(),this.config={loader:nt.main.loader},this.locale="es-MX",this.videoSelfieMode=!1,this.customerId="",this.customerEmail="",this.accountId="",this.customersApiVersion="1",this.customerDocumentsApiVersion="0",this.documentsVerificationsApiVersion="1",this.processTermsId="",this.customerOperationNumber="",this.customerOperationDate="",this.veridasConfig={},this.maxRetries=3,this.verificationId="",this.documentConfig=this._getOptionEnabledConfig(this.documentBaseConfig),this.selfieConfig=this._getOptionDisabledConfig(this.selfieBaseConfig),this.videoConfig=this._getOptionDisabledConfig(this.videoBaseConfig),this.isNativeIos=!1,this.documentType="",this.nextModuleCapture="",this.attachmentIds=dt,this.temporalAttachmentParams=[],this.capturedBiometrics={},this.currentDocumentAttachmentParam={},this.resizePercentage=100,this.poolingGetVerificationMaxCalls=5,this.poolingGetVerificationDelay=3e3,this.poolingValidationsMaxCalls=20,this.poolingGetVerificationCount=0,this.poolingCallsCount=0,this.dataExtractedFromVeridas={},this.separationSymbol="|",this.hyphen="-",this.underscore="_",this.evaluationCriteria="SI",this.formFilledData=[],this.formIdentificationData={},this.fromProceedings=!1,this.operationFormatDate="DD MMMM YYYY, HH:mm[ h]",this.disabledDefaultModule=!1,this._modalData={national_onboarding:{modalId:"onboardingNational",mode:"onboarding",headerText:(e=this).t(`${e.constructor.is}-national-onboarding-header-text`),microillustration:"idscan",modalTitle:e.t(`${e.constructor.is}-national-onboarding-modal-title`),buttonText:e.t(`${e.constructor.is}-national-onboarding-button-text`),notificationTitle:e.t(`${e.constructor.is}-national-onboarding-notification-title`),notificationMessage:e.t(`${e.constructor.is}-national-onboarding-notification-message`),paragraphs:[e.t(`${e.constructor.is}-national-onboarding-first-paragraph`),e.t(`${e.constructor.is}-national-onboarding-second-paragraph`)]},video_onboarding:{modalId:"onboardingVideoselfie",mode:"onboarding",headerText:e.t(`${e.constructor.is}-video-onboarding-header-text`),microillustration:"biometric",modalTitle:e.t(`${e.constructor.is}-video-onboarding-modal-title`),buttonText:e.t(`${e.constructor.is}-video-onboarding-button-text`),notificationTitle:e.t(`${e.constructor.is}-video-onboarding-notification-title`),notificationMessage:e.t(`${e.constructor.is}-video-onboarding-notification-message`),paragraphs:[e.t(`${e.constructor.is}-video-onboarding-first-paragraph`),e.t(`${e.constructor.is}-video-onboarding-second-paragraph`)]},consent:{modalId:"consent",mode:"informative",headerType:"modal-short",headerText:e.t(`${e.constructor.is}-consent-header-text`),modalTitle:"",buttonText:"",linkText:"",microillustration:"",additionalClass:"u-padding-top-1-5",paragraphs:[e.t(`${e.constructor.is}-consent-first-paragraph`),e.t(`${e.constructor.is}-consent-second-paragraph`)]},error_retry:{modalId:"errorRetry",mode:"error",headerType:"modal",headerText:e.t(`${e.constructor.is}-error-retry-header-text`),microillustration:"error",modalTitle:e.t(`${e.constructor.is}-error-retry-modal-title`),buttonText:e.t(`${e.constructor.is}-error-retry-button-text`),linkText:"",paragraphs:[e.t(`${e.constructor.is}-error-retry-first-paragraph`)]},error_maximum:{modalId:"errorMaximum",mode:"error",headerText:e.t(`${e.constructor.is}-error-maximum-header-text`),microillustration:"error",modalTitle:e.t(`${e.constructor.is}-error-maximum-modal-title`),buttonText:e.t(`${e.constructor.is}-error-maximum-button-text`),paragraphs:[e.t(`${e.constructor.is}-error-maximum-first-paragraph`)]},recommendations_document:{modalId:"recomendationsDocs",mode:"plugin",headerType:"modal",headerText:e.t(`${e.constructor.is}-recommendations-documents-header-text`),microillustration:"idscan",modalTitle:e.t(`${e.constructor.is}-recommendations-documents-modal-title`),buttonText:e.t(`${e.constructor.is}-recommendations-documents-button-text`),linkText:"",recomendations:[e.t(`${e.constructor.is}-recommendations-documents-first-recommendation`),e.t(`${e.constructor.is}-recommendations-documents-second-recommendation`),e.t(`${e.constructor.is}-recommendations-documents-third-recommendation`)]},recommendations_selfie:{modalId:"recomendationsSelfie",mode:"plugin",headerType:"modal",headerText:e.t(`${e.constructor.is}-recommendations-selfie-header-text`),microillustration:"camera",modalTitle:e.t(`${e.constructor.is}-recommendations-selfie-modal-title`),buttonText:e.t(`${e.constructor.is}-recommendations-selfie-button-text`),linkText:"",recomendations:[e.t(`${e.constructor.is}-recommendations-selfie-first-recommendation`),e.t(`${e.constructor.is}-recommendations-selfie-second-recommendation`),e.t(`${e.constructor.is}-recommendations-selfie-third-recommendation`)]},recommendations_video:{modalId:"recomendationsVideo",mode:"plugin",headerType:"modal",headerText:e.t(`${e.constructor.is}-recommendations-video-header-text`),microillustration:"biometric",modalTitle:e.t(`${e.constructor.is}-recommendations-video-modal-title`),buttonText:e.t(`${e.constructor.is}-recommendations-video-button-text`),linkText:"",recomendations:[e.t(`${e.constructor.is}-recommendations-video-first-recommendation`),e.t(`${e.constructor.is}-recommendations-video-second-recommendation`)]},deny_camera_permissions:{modalId:"denyCameraPermissions",mode:"plugin",headerType:"modal-short",modalType:"caution",headerText:e.t(`${e.constructor.is}-deny-camera-permissions-header-text`),paragraphs:[e.t(`${e.constructor.is}-deny-camera-permissions-body-text`)],buttonText:e.t(`${e.constructor.is}-deny-camera-permissions-button-text`),linkText:"",microillustration:""},deny_camera_permissions_permanently:{modalId:"denyCameraPermissionsPermanently",mode:"settings",headerText:e.t(`${e.constructor.is}-permanently-deny-camera-permissions-header-text`),microillustration:"caution",modalTitle:e.t(`${e.constructor.is}-permanently-deny-camera-permissions-title-text`),buttonText:e.t(`${e.constructor.is}-permanently-deny-camera-permissions-button-text`),paragraphs:[e.t(`${e.constructor.is}-permanently-deny-camera-permissions-first-paragraph`),e.t(`${e.constructor.is}-permanently-deny-camera-permissions-second-paragraph`)]},deny_audio_permissions:{modalId:"denyAudioPermissions",mode:"plugin",headerType:"modal-short",modalType:"caution",headerText:e.t(`${e.constructor.is}-deny-audio-permissions-header-text`),paragraphs:[e.t(`${e.constructor.is}-deny-audio-permissions-body-text`)],buttonText:e.t(`${e.constructor.is}-deny-audio-permissions-button-text`),linkText:"",microillustration:""},deny_audio_permissions_permanently:{modalId:"denyAudioPermissionsPermanently",mode:"settings",headerText:e.t(`${e.constructor.is}-permanently-deny-audio-permissions-header-text`),microillustration:"caution",modalTitle:e.t(`${e.constructor.is}-permanently-deny-audio-permissions-title-text`),buttonText:e.t(`${e.constructor.is}-permanently-deny-audio-permissions-button-text`),paragraphs:[e.t(`${e.constructor.is}-permanently-deny-audio-permissions-first-paragraph`),e.t(`${e.constructor.is}-permanently-deny-audio-permissions-second-paragraph`)]},error_veridas_process:{modalId:"errorVeridasProcess",mode:"veridas",headerType:"modal",headerText:e.t(`${e.constructor.is}-error-veridas-header-text`),microillustration:"error",modalTitle:e.t(`${e.constructor.is}-error-veridas-text-title`),buttonText:e.t(`${e.constructor.is}-error-veridas-button-text`),linkText:"",paragraphs:[e.t(`${e.constructor.is}-error-veridas-first-paragraph`)],recomendations:[e.t(`${e.constructor.is}-error-veridas-first-recommendation`),e.t(`${e.constructor.is}-error-veridas-second-recommendation`),e.t(`${e.constructor.is}-error-veridas-third-recommendation`)]},error_veridas_process_maximum:{modalId:"errorVeridasProcessMaximum",mode:"veridas",headerText:e.t(`${e.constructor.is}-error-veridas-maximum-header-text`),microillustration:"error",modalTitle:e.t(`${e.constructor.is}-error-veridas-maximum-title-text`),buttonText:e.t(`${e.constructor.is}-error-veridas-maximum-button-text`),paragraphs:[e.t(`${e.constructor.is}-error-veridas-maximum-first-paragraph`)],recomendations:[e.t(`${e.constructor.is}-error-veridas-maximum-first-recommendation`),e.t(`${e.constructor.is}-error-veridas-maximum-second-recommendation`)]},error_identity_verification:{modalId:"errorIdentityVerification",mode:"errorVerification",headerType:"modal",headerText:e.t(`${e.constructor.is}-error-identity-verification-header-text`),microillustration:"error",modalTitle:e.t(`${e.constructor.is}-error-identity-verification-title-text`),buttonText:e.t(`${e.constructor.is}-error-identity-verification-button-text`),linkText:"",paragraphs:[e.t(`${e.constructor.is}-error-identity-verification-first-paragraph`)]},error_identity_verification_maximum:{modalId:"errorIdentityVerificationMaximum",mode:"error",headerText:e.t(`${e.constructor.is}-error-veridas-maximum-header-text`),microillustration:"error",modalTitle:e.t(`${e.constructor.is}-error-veridas-maximum-title-text`),buttonText:e.t(`${e.constructor.is}-error-veridas-maximum-button-text`),paragraphs:[e.t(`${e.constructor.is}-error-veridas-maximum-first-paragraph`)],recomendations:[e.t(`${e.constructor.is}-error-veridas-maximum-first-recommendation`),e.t(`${e.constructor.is}-error-veridas-maximum-second-recommendation`)]},leave_operative_national:{modalId:"leaveOperative",mode:"exit",withoutSlot:!0,headerType:"modal-short",headerText:e.t(`${e.constructor.is}-leave-operative-header-text`),modalType:"caution",paragraphs:[e.t(`${e.constructor.is}-leave-operative-body-text`)],buttonText:e.t(`${e.constructor.is}-leave-operative-button-text`),linkText:e.t(`${e.constructor.is}-leave-operative-link-text`),microillustration:""},leave_operative_video:{modalId:"leaveOperative",mode:"exit",withoutSlot:!0,headerType:"modal-short",headerText:e.t(`${e.constructor.is}-leave-operative-header-text`),modalType:"caution",paragraphs:[e.t(`${e.constructor.is}-leave-operative-body-text`)],buttonText:e.t(`${e.constructor.is}-leave-operative-button-text`),linkText:e.t(`${e.constructor.is}-leave-operative-link-text-video`),microillustration:""},edit_national_identity_capture:{modalId:"editIdentityCapture",mode:"edit",modalType:"caution",headerType:"modal-short",headerText:e.t(`${e.constructor.is}-edit-identity-capture-header-text`),paragraphs:[e.t(`${e.constructor.is}-edit-national-identity-capture-body-text`)],buttonText:e.t(`${e.constructor.is}-edit-identity-capture-button-text`),linkText:"",microillustration:""},locate_your_info:{modalId:"locateInfo",mode:"informative",headerText:e.t(`${e.constructor.is}-locate-info-header-text`),buttonText:"",modalTitle:"",microillustration:"",modalType:"info",instructions:[{detail:e.t(`${e.constructor.is}-locate-info-first-instruction`),imgs:["images/nationalVideoselfie/OCR_1.svg","images/nationalVideoselfie/OCR_2.svg"]},{detail:e.t(`${e.constructor.is}-locate-info-second-instruction`),imgs:["images/nationalVideoselfie/NumEmision1.svg","images/nationalVideoselfie/NumEmision2.svg"]},{detail:e.t(`${e.constructor.is}-locate-info-third-instruction`),imgs:["images/nationalVideoselfie/Vigencia1.svg","images/nationalVideoselfie/Vigencia2.svg"]}]},edit_video_identity_capture:{modalId:"editIdentityCapture",mode:"edit",modalType:"caution",headerType:"modal-short",headerText:e.t(`${e.constructor.is}-edit-identity-capture-header-text`),paragraphs:[e.t(`${e.constructor.is}-edit-video-identity-capture-body-text`)],buttonText:e.t(`${e.constructor.is}-edit-identity-capture-button-text`),linkText:"",microillustration:""}},this._halfModalOpened=!1,this._fullModalOpened=!1,this._halfModalConfig={},this._fullModalConfig={},this._showMultistep=!1,this._errorCounter=0,this._errorExtractedCounter=0,this._lastService="",this._lastPlugin="",this._obverseSaved=!1,this._reverseSaved=!1,this._videoSelfieSaved=!1,this._lastServiceRequest={},this._receiptConfig={},this._showReceipt=!1}firstUpdated(){super.firstUpdated&&super.firstUpdated(),this._multistep=this.shadowRoot.querySelector('[data-tag-name="national-videoselfie-multistep"]'),this._loadPlugins(),this._loadServices()}updated(e){(e.has("videoSelfieMode")&&null!==this.videoSelfieMode||e.has("customerId")&&""!==this.customerId)&&this._loadViewMode(),super.updated(e)}_loadPlugins(){this._documentCapture=this.shadowRoot.querySelector('[data-tag-name="bbva-nativeconnector-document-capture"]'),this._selfieCapture=this.shadowRoot.querySelector('[data-tag-name="bbva-nativeconnector-selfie-capture"]'),this._videoCapture=this.shadowRoot.querySelector('[data-tag-name="bbva-nativeconnector-video-capture"]'),this._photoConverter=this.shadowRoot.querySelector('[data-tag-name="bbva-manager-photo-converter"]'),this._settingsPlugin=this.shadowRoot.querySelector('[data-tag-name="bbva-nativeconnector-native-settings"]')}_loadServices(){this._customerTermsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-customer-terms-api-dm"]'),this._globalVerificationsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-verifications-api-dm"]'),this._globalVerificationAttachmentDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-verification-attachment-api-dm"]'),this._globalVerificationDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-verification-api-dm"]'),this._globalVerificationExecuteDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-verification-execute-api-dm"]'),this._globalDocumentsVerificationsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-documents-verifications-api-dm"]'),this._globalCivilRegister=this.shadowRoot.querySelector('[data-tag-name="bbva-global-civil-registries-search-api-dm"]'),this._customerNationalElectoralInstitute=this.shadowRoot.querySelector('[data-tag-name="bbva-local-national-electoral-institute-validate-credetial-data-api-dm-mx"]'),this._localCustomerDm=this.shadowRoot.querySelector('[data-tag-name="bbva-local-customer-api-dm"]'),this._identificationProcessDocumentDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-customer-identification-process-documents-api-dm"]')}updateViewMode(e){this.videoSelfieMode=e.videoSelfieMode,this.accountId=e.productId||"",this.customerEmail=e.email||this.customerEmail,this.fromProceedings=e.fromProceedings}_manageBackNavigation(){if(this.processTermsId||this.verificationId){const e=this.videoSelfieMode?"video":"national";this._dispatch(`${bt.is}-exit-operative-modal-load`),this._halfModalConfig=this._modalData[`leave_operative_${e}`],this._halfModalOpened=!0}else this._leaveOperative()}_leaveOperative(){this.reset(),this._dispatch(`${bt.is}-leave-operative`)}reset(){this._showMultistep=!1,this.config={loader:nt.main.loader},this.videoSelfieMode=null,this.accountId="",this.processTermsId="",this._resetCommonProperties(),this.isNativeIos=!1,this.poolingGetVerificationMaxCalls=5,this.poolingGetVerificationDelay=3e3,this.fromProceedings=!1,this._errorExtractedCounter=0,this._multistep.reset()}_resetCommonProperties(){this._fullModalOpened=!1,this._halfModalOpened=!1,this.customerOperationNumber="",this.customerOperationDate="",this.documentConfig=this._getOptionEnabledConfig(this.documentBaseConfig),this.selfieConfig=this._getOptionDisabledConfig(this.selfieBaseConfig),this.videoConfig=this._getOptionDisabledConfig(this.videoBaseConfig),this.verificationId="",this.documentType="",this.nextModuleCapture="",this.temporalAttachmentParams=[],this.capturedBiometrics={},this.currentDocumentAttachmentParam={},this.poolingGetVerificationCount=0,this.poolingCallsCount=0,this.dataExtractedFromVeridas={},this.formFilledData=[],this.formIdentificationData={},this.disabledDefaultModule=!1,this._errorCounter=0,this._lastService="",this._lastPlugin="",this._obverseSaved=!1,this._reverseSaved=!1,this._videoSelfieSaved=!1,this._lastServiceRequest={},this._receiptConfig={},this._showReceipt=!1}_dispatch(e,t=null){Je(this,e,t)}_showSpinner(e="",t=""){this.showLoader("full",!!e),this.config.loader={visible:!0,titleMessage:e,text:t}}hideSpinner(){this._showMultistep=!0,this.clearLoader(),this.config.loader={visible:!1}}_handleFullModalHeaderClick(){const{mode:e}=this._fullModalConfig;"onboarding"!==e&&"error"!==e&&"veridas"!==e||this._leaveOperative()}_handleFullModalFooterButton(){"onboarding"===this._fullModalConfig.mode?this._confirmOnboarding():"settings"===this._fullModalConfig.mode?(this._settingsPlugin.openSetting({setting:"application_settings"}),this._dispatch(`${bt.is}-settings-open`)):this._leaveOperative()}_handleHalfModalFooterButton(){"error"===this._halfModalConfig.mode?this._retryApiCall():"plugin"===this._halfModalConfig.mode?this[this._lastPlugin]():"veridas"===this._halfModalConfig.mode||"edit"===this._halfModalConfig.mode?this.cleanIdentityCaptureStep():"errorVerification"!==this._halfModalConfig.mode&&this._leaveOperative()}cleanIdentityCaptureStep(){this._showSpinner(),this._showMultistep=!0,this.documentConfig=this._getOptionEnabledConfig(this.documentBaseConfig),this.selfieConfig=this._getOptionDisabledConfig(this.selfieBaseConfig),this.videoConfig=this._getOptionDisabledConfig(this.videoBaseConfig),this._resetCommonProperties(),this._multistep.resetCommonProperties(),this._multistep.cleanSteps(!1),this._createVerificationId()}_handleInformativeModal({detail:e}){this[`_${e.type}ModalConfig`]=this._modalData[e.name],this[`_${e.type}ModalOpened`]=!0,this._dispatch(`${bt.is}-informative-modal-load`,e)}_manageError(){this.hideSpinner(),this._showErrorModal()}_manageIdentityVerificationError(){this.hideSpinner(),this._showErrorModalIdentityVerification()}_showErrorModal(){this._errorCounter<this.maxRetries?(this._halfModalConfig=this._modalData.error_retry,this._halfModalOpened=!0):(this._dispatch(`${bt.is}-maximum-error-modal-load`,{name:"operation"}),this._fullModalConfig=this._modalData.error_maximum,this._fullModalOpened=!0),this._errorCounter+=1}_showErrorModalVeridasProcess(){this._errorExtractedCounter<this.maxRetries?(this._halfModalConfig=this._modalData.error_veridas_process,this._halfModalOpened=!0):(this._dispatch(`${bt.is}-maximum-error-modal-load`,{name:"error-veridas-process"}),this._fullModalConfig=this._modalData.error_veridas_process_maximum,this._fullModalOpened=!0),this._errorExtractedCounter+=1}_showErrorModalIdentityVerification(){this._errorExtractedCounter<this.maxRetries?(this._halfModalConfig=this._modalData.error_identity_verification,this._halfModalOpened=!0):(this._dispatch(`${bt.is}-maximum-error-modal-load`,{name:"error-identity-verification"}),this._fullModalConfig=this._modalData.error_identity_verification_maximum,this._fullModalOpened=!0),this._errorExtractedCounter+=1}_retryApiCall(){this._halfModalOpened=!1,this._showSpinner(),"attachFile"===this._lastService?this[`_${this._lastService}`](this.verificationId,this.currentDocumentAttachmentParam.attachmentId,this.currentDocumentAttachmentParam.url,this.currentDocumentAttachmentParam.name,this.currentDocumentAttachmentParam.mediaType):this[`_${this._lastService}`]()}_loadViewMode(){if(this.fromProceedings)return void this._confirmOnboarding();const e=this.videoSelfieMode?"video":"national";this._fullModalConfig=this._modalData[`${e}_onboarding`],this._fullModalOpened=!0,this._dispatch(`${bt.is}-onboarding-modal-load`,{name:`onboarding-${e}`})}_confirmOnboarding(){const e=this.videoSelfieMode?"video":"national";this.veridasConfig={acceptedDocuments:["MX_IDCard_2014","MX_IDCard_2008","MX_IDCard_2019"],useFlash:!1,liveVideo:this.videoSelfieMode,documentsPrefix:"glomo_mx",documentType:"",flowId:"new-upgrade-level-sdk-flow"},this._fullModalOpened=!1,this._showMultistep=!0,this._dispatch(`${bt.is}-onboarding-${e}-button-click`)}_grantIdentityConsent(){this.verificationId?this._multistep.completeCurrentStep():this._createVerificationId()}_createVerificationId(){const e=this.veridasConfig.flowId,t={validationType:this.veridasConfig.useFlash?"WITH_FLASH":"WITHOUT_FLASH",origin:{id:e}};this._showSpinner(),this._lastService="createVerificationId",this._globalVerificationsDm.postVerifications(t)}_onCreateVerificationIdSuccess({detail:e}){this._errorCounter=0,this._lastService="",this.verificationId=(e.data||e).id,this.hideSpinner(),"veridas"!==this._halfModalConfig.mode&&"edit"!==this._halfModalConfig.mode&&this._multistep.completeCurrentStep()}get documentBaseConfig(){return{id:"document",mainTitle:this.t(`${bt.is}-step-identity-capture-id-module`),icon:f(),divider:!1,iconRight:b()}}get selfieBaseConfig(){return{id:"selfie",mainTitle:this.t(`${bt.is}-step-identity-capture-selfie-module`),icon:_(),divider:!0,iconRight:b()}}get videoBaseConfig(){return{id:"video",mainTitle:this.t(`${bt.is}-step-identity-capture-record-video`),icon:v(),divider:!0,iconRight:b()}}_getOptionEnabledConfig(e){return{...e,disabled:this.disabledDefaultModule}}_getOptionDisabledConfig(e){return{...e,disabled:!this.disabledDefaultModule}}_getOptionCompletedConfig(e){return{...e,disabled:this.disabledDefaultModule,completed:!0}}_handleModalRecommendations({detail:e}){const t=(i=e).charAt(0).toUpperCase()+i.slice(1);var i;const s=`recommendations_${e}`;this._lastPlugin=`_launch${t}Capture`,this._halfModalConfig=this._modalData[s],this._halfModalOpened=!0,this._dispatch(`${bt.is}-recommendation-modal-load`,{name:e})}_getDocumentType(e){return this.documentType||e[0].documentIds[0]}_getFileName(e){const t=new Date,i=`${new Intl.DateTimeFormat(this.locale,{year:"numeric"}).format(t)}${new Intl.DateTimeFormat(this.locale,{month:"2-digit"}).format(t)}${new Intl.DateTimeFormat(this.locale,{day:"2-digit"}).format(t)}`;return`${this.veridasConfig.documentsPrefix?`${this.veridasConfig.documentsPrefix}_`:""}${i}_${e.replaceAll("-","_")}`}_launchDocumentCapture(){const e=(t=this.t,i=this.veridasConfig.acceptedDocuments,s=this.veridasConfig.useFlash,a=this.isNativeIos,{documents:i,configuration:{closebutton:"YES",alertstyle:"white",arrows:"YES",arrowcolor5:"#FF1973B8",arrowcolor4:"#FF49A5E6",arrowcolor3:"#FF5BBEFF",arrowcolor2:"#FFD4EDFC",arrowcolor1:"#FFFFFFFF",infoalertshow:"NO",infoalerttitle:t("bbva-widget-scanner-verifications-biometrics-document-plugin-info-alert-title"),infoalert:t("bbva-widget-scanner-verifications-biometrics-document-plugin-info-alert",{linebreak:a?"\n":"<br/>"}),shutterbuttonbackgroundcolor:"#FFFFFFFF",shutterbuttonbordercolor:"#FF000000",shutterbuttonmessage:t("bbva-widget-scanner-verifications-biometrics-document-plugin-shutter-button-message"),shutterbuttonmessagebackgroundcolor:"#B3072146",checkdocumenttext:t("bbva-feature-national-id-and-videoselfie-mx-check-document-text"),continuebuttonbackgroundcolor:"#1973B8",continuebuttontext:t("bbva-widget-scanner-verifications-biometrics-document-plugin-continue-button-text"),continuebuttontextcolor:"#FFFFFF",positivebuttontext:t("bbva-widget-scanner-verifications-biometrics-document-plugin-positive-button-text"),repeatbuttontextcolor:"#5BBEFF",repeatbuttonbackgroundcolor:"#072146",repeatbuttontext:t("bbva-widget-scanner-verifications-biometrics-document-plugin-repeat-button-text"),repeatbuttonicon:"",userinfo:t(""),validationbackgroundcolor:"#072146",popupvalidationbackgroundcolor:"#00FF0000",popupvalidationtextcolor:"#1EADF0",documentdetectedveryclosecolor:"#B3072146",documentdetectedveryfarcolor:"#B3072146",documentveryclose:t("bbva-widget-scanner-verifications-biometrics-document-plugin-document-very-close"),documentveryfar:t("bbva-widget-scanner-verifications-biometrics-document-plugin-document-very-far"),flashwaitingalert:t("bbva-widget-scanner-verifications-biometrics-document-plugin-flash-waiting-alert"),obversenotfoundtext:t("bbva-feature-national-id-and-videoselfie-mx-obverse-not-found-error"),reversenotfoundtext:t("bbva-feature-national-id-and-videoselfie-mx-reverse-not-found-error"),onpicturevibration:"YES",obverseflash:s?"YES":"NO",badqualitypictureinfo:"",cameraerroralert:t("bbva-widget-scanner-verifications-biometrics-document-plugin-camera-error-alert"),cameraerrortitle:t("bbva-widget-scanner-verifications-biometrics-document-plugin-camera-error-title"),informativetextcolor:"#FFFFFF",permissionrefused:t("bbva-widget-scanner-verifications-biometrics-document-plugin-permission-refused"),permissionrefusedtitle:t("bbva-widget-scanner-verifications-biometrics-document-plugin-permission-refused-title"),repeatnoflashalerttitle:t("bbva-feature-national-id-and-videoselfie-mx-repeat-no-flash-alert-title"),requirementsalertmessage:t("bbva-widget-scanner-verifications-biometrics-document-plugin-requirements-alert-message"),requirementsalerttitle:t("bbva-widget-scanner-verifications-biometrics-document-plugin-requirements-alert-title"),reversedetectiondelay:"",textbackgroundcolor:"#B3072146",tickcirclecolor:"#277A3E",tickcolor:"#FFFFFFFF",showtutorial:"NO"}});var t,i,s,a;this._documentCapture.launchDocumentCapture(e)}handleDocumentCaptureSuccess({detail:e}){this._dispatch(`${bt.is}-capture-documents-done`,{name:"document-capture-done"}),this.nextModuleCapture="selfie",this.documentType=this._getDocumentType(e),this._showSpinner(`${bt.is}-loader-title`,`${bt.is}-loader-message`),this._uploadDocumentsCaptured(this.verificationId,e)}handlePermissionPlugin({detail:e}){5===e.code?(this._fullModalConfig=this._modalData.deny_camera_permissions_permanently,this._fullModalOpened=!0,this._dispatch(`${bt.is}-denied-permissions-modal-load`,{name:"camera"})):(this._halfModalConfig=this._modalData.deny_camera_permissions,this._halfModalOpened=!0)}async _uploadDocumentsCaptured(e,t){this.temporalAttachmentParams=[],this._lastService="attachFile";for(const e of t){const t=this._getDocumentCapturedAttachmentId(e);if(t){const i=this._getFileName(t);this.temporalAttachmentParams.push({attachmentId:t,url:e.url,name:`${i}.jpeg`}),this.capturedBiometrics[t]={fileName:`${i}.jpeg`}}}this.currentDocumentAttachmentParam=this.temporalAttachmentParams.shift(),await this._photoConverter.getImageFile({url:this.currentDocumentAttachmentParam.url,name:this.currentDocumentAttachmentParam.name,id:this.currentDocumentAttachmentParam.attachmentId}),await this._attachFile(e,this.currentDocumentAttachmentParam.attachmentId,this.currentDocumentAttachmentParam.url,this.currentDocumentAttachmentParam.name)}_handleManagerConverter({detail:e}){const{id:t=this.attachmentIds.selfieVideo,url:i,base64:s}=e;Object.assign(this.capturedBiometrics[t],{base64:s,url:i})}_getDocumentCapturedAttachmentId(e){let t;return"front"===e.face?t=e.flash?this.attachmentIds.obverseFlashImage:this.attachmentIds.obverseImage:"back"===e.face&&(t=this.attachmentIds.reverseImage),t}_launchSelfieCapture(){const e=(t=this.t,i=this.isNativeIos,{configuration:{closebutton:"YES",livephoto:"NO",alertstyle:"white",veridaslogoshow:"NO",smartselfie:"NO",mobileoval:"NO",searchingfacestepinstruction:t("bbva-widget-scanner-verifications-biometrics-video-plugin-face-not-found"),backgroundcolor:"#072146",showselfie:"NO",validationbackgroundcolor:"#072146",popupvalidationbackgroundcolor:"#F01E31",popupvalidationtextcolor:"#1EADF0",deviceincorrectposition:t("bbva-widget-scanner-verifications-biometrics-selfie-plugin-device-incorrect-position"),facedetectednotcenteredcolor:"#DA3851",facedetectedokcolor:"#47FB12",finaltutorialalertshow:"YES",informativetextcolor:"#000000",orientationopacity:"YES",smilerequestmoresmile:t("bbva-widget-scanner-verifications-biometrics-selfie-plugin-smile-request-more-smile"),smilerequestserious:t("bbva-widget-scanner-verifications-biometrics-selfie-plugin-smile-request-serious"),smilerequestsmile:t("bbva-widget-scanner-verifications-biometrics-selfie-plugin-smile-request-smile"),smiletimeout:"YES",smiletimeoutmessage:t("bbva-widget-scanner-verifications-biometrics-selfie-plugin-smile-timeout-message"),smiletimeoutseconds:"10",smilewarningseconds:"5",textbackgroundcolor:"#B3072146",tickcirclecolor:"#277A3E",tickcolor:"#FFFFFFFF",tickshow:"YES",selfiengaserroralertdescription:t("bbva-widget-scanner-verifications-biometrics-selfie-plugin-selfie-ngas-error-alert-description"),selfiengaserroralertstep1:t("bbva-widget-scanner-verifications-biometrics-selfie-plugin-selfie-ngas-error-alert-step-1"),selfiengaserroralertstep2:t("bbva-widget-scanner-verifications-biometrics-selfie-plugin-selfie-ngas-error-alert-step-2"),selfiengaserroralertstep3:t("bbva-widget-scanner-verifications-biometrics-selfie-plugin-selfie-ngas-error-alert-step-3"),selfiengaserroralerttitle:t("bbva-widget-scanner-verifications-biometrics-selfie-plugin-selfie-ngas-error-alert-title"),selfiengaserroralertbuttontext:t("bbva-widget-scanner-verifications-biometrics-selfie-plugin-selfie-ngas-error-alert-button-text"),infoalertshow:"NO",infoalerttitle:t("bbva-widget-scanner-verifications-biometrics-selfie-plugin-info-alert-title"),infoalert:t("bbva-widget-scanner-verifications-biometrics-selfie-plugin-info-alert",{linebreak:i?"\n":"<br/>"}),permissionrefused:t("bbva-widget-scanner-verifications-biometrics-selfie-plugin-permission-refused"),permissionrefusedtitle:t("bbva-widget-scanner-verifications-biometrics-selfie-plugin-permission-refused-title"),showtutorial:"NO"}});var t,i;this._selfieCapture.launchSelfieCapture(e)}handleSelfieCaptureSuccess({detail:e}){this._dispatch(`${bt.is}-capture-selfie-done`,{name:"selfie-capture-done"}),this.nextModuleCapture="video",this._showSpinner(`${bt.is}-loader-title`,`${bt.is}-loader-message`),this._uploadSelfiesCaptured(this.verificationId,e)}async _uploadSelfiesCaptured(e,t){this.temporalAttachmentParams=[],this._lastService="attachFile";for(const e of t){const t=this._getSelfieCapturedAttachmentId(e);if(t){const i=this._getFileName(t);this.temporalAttachmentParams.push({attachmentId:t,url:e.url,name:`${i}.jpeg`}),this.capturedBiometrics[t]={fileName:`${i}.jpeg`}}}this.currentDocumentAttachmentParam=this.temporalAttachmentParams.shift(),await this._photoConverter.getImageFile({url:this.currentDocumentAttachmentParam.url,name:this.currentDocumentAttachmentParam.name,id:this.currentDocumentAttachmentParam.attachmentId}),this._attachFile(e,this.currentDocumentAttachmentParam.attachmentId,this.currentDocumentAttachmentParam.url,this.currentDocumentAttachmentParam.name)}_getSelfieCapturedAttachmentId(e){let t;return"SelfieCapture"===e.id&&(t=this.attachmentIds.selfieImage),t}_launchVideoCapture(){const e=(t=this.t,i=this.isNativeIos,s=this.documentType,{configuration:{alertstyle:"white",capturedlabeltext:t("bbva-widget-scanner-verifications-biometrics-video-plugin-captured-labeled-text"),closebutton:"YES",capturedbackgroundalpha:"0.5",capturedlabelposition:"bottom",documentlabeltextbackgroundcolor:"#AA000000",documentmobileoval:"YES",documentmobileovalcolor:"#00CC00",facemobileoval:"YES",facemobileovalcolor:"#00CC00",faceshapeoval:"YES",fixedoval:"YES",fixedrectangle:"YES",fixedrectangleposition:"top",documentobverselabeltext:"Parte delantera",documentreverselabeltext:"Parte trasera",infoalert:t("bbva-widget-scanner-verifications-biometrics-video-plugin-info-alert",{linebreak:i?"\n":"<br/>"}),infoalertshow:"NO",infoalerttitle:t("bbva-widget-scanner-verifications-biometrics-video-plugin-info-alert-title"),obversenotfounderror:t("bbva-widget-scanner-verifications-biometrics-video-plugin-obverse-not-found"),obversenotfounderrortitle:t("bbva-widget-scanner-verifications-biometrics-video-plugin-obverse-not-found-title"),permissionrefused:t("bbva-widget-scanner-verifications-biometrics-video-plugin-permission-refused"),permissionrefusedtitle:t("bbva-widget-scanner-verifications-biometrics-video-plugin-permission-refused-title"),positivebuttontitle:t("bbva-widget-scanner-verifications-biometrics-video-plugin-positive-bt-title"),reversedetection:"YES",reversenotfounderror:t("bbva-widget-scanner-verifications-biometrics-video-plugin-reverse-not-found"),reversenotfounderrortitle:t("bbva-widget-scanner-verifications-biometrics-video-plugin-reverse-not-found-title"),facenotfounderror:t("bbva-widget-scanner-verifications-biometrics-video-plugin-face-not-found"),facenotfounderrortitle:t("bbva-widget-scanner-verifications-biometrics-video-plugin-face-not-found-title"),finalerror:t("bbva-widget-scanner-verifications-biometrics-video-plugin-final-error"),finalerrortitle:t("bbva-widget-scanner-verifications-biometrics-video-plugin-final-error-title"),showtutorial:"NO",tickcirclecolor:"#277A3E",tickcolor:"#FFFFFFFF",videoflashingcolor:"NO",videoinformativelabel:"YES",videoinformativelabelbackgroundcolor:"#48AE64",videoinformativelabelobversebackgroundcolor:"#48AE64",videoinformativelabelposition:"top",videoinformativelabelreversebackgroundcolor:"#48AE64",videoinformativetext1:t("bbva-feature-national-id-and-videoselfie-mx-informative-text-1"),videoinformativetext2:t("bbva-feature-national-id-and-videoselfie-mx-informative-text-2"),videoinformativetext3:t("bbva-feature-national-id-and-videoselfie-mx-informative-text-3")},documentType:s});var t,i,s;this._videoCapture.launchVideoCapture(e)}handleVideoSelfieError({detail:e}){5===e.code?(this._fullModalConfig=this._modalData.deny_audio_permissions_permanently,this._fullModalOpened=!0,this._dispatch(`${bt.is}-denied-permissions-modal-load`,{name:"audio"})):(this._halfModalConfig=this._modalData.deny_audio_permissions,this._halfModalOpened=!0)}handleVideoSelfieSuccess({detail:e}){this._dispatch(`${bt.is}-capture-videoselfie-done`,{name:"video-capture-done"}),this._showSpinner(`${bt.is}-loader-title`,`${bt.is}-loader-message`),this._uploadVideoSelfieCaptured(this.verificationId,e)}async _uploadVideoSelfieCaptured(e,t){this.nextModuleCapture="completed",this._lastService="attachFile";const i=this.attachmentIds.selfieVideo,s=this._getFileName(i),a=t.length?t.find((e=>e.url)).url:t.url;this.temporalAttachmentParams={attachmentId:i,url:a,name:`${s}.mp4`,mediaType:"video/mp4"},this.capturedBiometrics[i]={fileName:`${s}.mp4`},await this._photoConverter.getVideoObject(a,`${s}.mp4`),await this._attachFile(e,i,a,`${s}.mp4`,"video/mp4")}_getHeaders(){return{...this.headers}}_getMultipartHeaders(){return{...this._getHeaders(),"Content-Type":"multipart/form-data"}}async _attachFile(e,t,i,s,a="image/jpeg"){const{documentType:r}=this,o={type:"multipart/form-data",formDataParts:[{name:"file",filename:s,body:{mediaType:a,content:i}},{name:"documentType",body:{mediaType:"text/plain",content:r}}]};this._globalVerificationAttachmentDm.forceBoundary=!0,this._globalVerificationAttachmentDm.multipart=o,this._globalVerificationAttachmentDm.putVerificationAttachment(e,t)}async onAttachmentResponseSuccess(){this._errorCounter=0,this.temporalAttachmentParams.length?(this.currentDocumentAttachmentParam=this.temporalAttachmentParams.shift(),await this._photoConverter.getImageFile({url:this.currentDocumentAttachmentParam.url,name:this.currentDocumentAttachmentParam.name,id:this.currentDocumentAttachmentParam.attachmentId}),await this._attachFile(this.verificationId,this.currentDocumentAttachmentParam.attachmentId,this.currentDocumentAttachmentParam.url,this.currentDocumentAttachmentParam.name,this.currentDocumentAttachmentParam.mediaType)):("selfie"===this.nextModuleCapture?(this.documentConfig=this._getOptionCompletedConfig(this.documentBaseConfig),this.selfieConfig=this._getOptionEnabledConfig(this.selfieBaseConfig)):"video"===this.nextModuleCapture?(this.selfieConfig=this._getOptionCompletedConfig(this.selfieBaseConfig),this.videoSelfieMode?this.videoConfig=this._getOptionEnabledConfig(this.videoBaseConfig):(this._multistep.captureBtnDisabled=!this._multistep.captureBtnDisabled,this._lastService="")):(this.videoConfig=this._getOptionCompletedConfig(this.videoBaseConfig),this._multistep.captureBtnDisabled=!this._multistep.captureBtnDisabled,this._lastService=""),this.hideSpinner())}_startVeridasProcess(){this._showSpinner(`${bt.is}-loader-title`,`${bt.is}-loader-message`),this.poolingGetVerificationCount=0,this._lastService?this[`_${this._lastService}`]():this._getVerification()}_getVerification(){this._lastService="getVerification",this._globalVerificationDm.getVerification(this.verificationId)}_handleGetVerificationSuccess({detail:e}){this._errorCounter=0;const{status:t={}}=e||{},i=t.id||"";"OPEN"===i?this._areCapturesUploadedSuccessfully(e)?this._executeVerification(this.verificationId):this.poolingGetVerificationCount<this.poolingGetVerificationMaxCalls?(this.poolingGetVerificationCount+=1,setTimeout((()=>{this._getVerification()}),this.poolingGetVerificationDelay)):this.errorDocumentUpload():"ERROR"===i?this.errorDocumentUpload():this._executeVerification(this.verificationId)}_areCapturesUploadedSuccessfully(e){const t=[this.attachmentIds.obverseImage,this.attachmentIds.reverseImage];this.veridasConfig.useFlash&&t.push(this.attachmentIds.obverseFlashImage);const i=[this.attachmentIds.selfieImage];this.veridasConfig.liveVideo&&i.push(this.attachmentIds.selfieVideo);const s=this._areAllItemsInVeridas(e.attachments,t),a=this._areAllItemsInVeridas(e.attachments,i);return s&&a}_areAllItemsInVeridas(e,t){return t.every((t=>e.find((e=>e.attachmentType.id===t.replace(/-/g,this.underscore).toUpperCase()))))}_executeVerification(){this._lastService="executeVerification",this._globalVerificationExecuteDm.postVerificationExecute(this.verificationId)}_handleVerificationExecuteSuccess(){this._errorCounter=0,this.poolingCallsCount=0,this._getDocumentsVerifications()}_getDocumentsVerifications(){this._lastService="getDocumentsVerifications",this._globalDocumentsVerificationsDm.getDocumentsVerifications({verificationId:this.verificationId,customerId:this.customerId})}_handleDocumentsVerificationsSuccess({detail:e}){this._errorCounter=0;const t=e.length&&e[0]||{},i=t.status||{},s=i.id||"";if("OPEN"===s||"PROCESSING"===s)this._callGetVerificationStatus();else if("DONE"===s&&this._dataExtractedAreValid(i)){this._lastService="",this._errorExtractedCounter=0;const{documentExtractedData:e}=t,{optionalData:i}=e,{gender:s="",birthDate:a="",firstName:r="",lastName:o="",secondLastName:n=""}=e,{expirationDate:c="",location:l=""}=e;this.dataExtractedFromVeridas={...i,validityYear:c,gender:s,birthDate:a,firstName:r,lastName:o,secondLastName:n,location:l},this._generateFormFilledData(),this.hideSpinner(),this._multistep.completeCurrentStep()}else this.errorDocumentUpload()}_dataExtractedAreValid({description:e}){return e.split(this.separationSymbol).includes(this.evaluationCriteria)}_callGetVerificationStatus(){this.poolingCallsCount>=this.poolingValidationsMaxCalls?this.errorDocumentUpload():(this.poolingCallsCount+=1,setTimeout((()=>{this._getDocumentsVerifications()}),this.poolingGetVerificationDelay))}errorDocumentUpload(){this._showErrorModalVeridasProcess(),this.hideSpinner()}_generateFormFilledData(){const{curp:e="",ocrNumber:t="",identificationNumber:i="",emisionNumber:s="",validityYear:a}=this.dataExtractedFromVeridas,r=(new Date).getFullYear().toString(),o=a.substring(0,4);this.formFilledData=[this._createInputData("curp",e,"curp","18","text","[a-zA-Z0-9]{18}"),this._createInputData("ocr",t,"ocr","13","number","[0-9]{13}"),this._createInputData("electoral",i,"electoral","18","text","[a-zA-Z0-9]{18}"),this._createInputData("emission",s,"","2","number","[0-9]{2}"),this._createInputData("expiration",o,"","4","number",`20(${r[2]}[${r[3]}-9]|[${Number(r[2])+1}-9][0-9])`,this.videoSelfieMode?"-video":"")]}_createInputData(e,t,i,s,a,r,o=""){return{id:`${e}-form`,label:this.t(`${bt.is}-step-confirm-identity-form-${e}-label`),value:t,notification:i?this.t(`${bt.is}-step-confirm-identity-form-${i}-notification`):"",errorMessage:this.t(`${bt.is}-step-confirm-identity-form-${e}-error${o}`),max:s,modeInput:a,pattern:r}}_verificationIdentityCaptured({detail:e}){this._showSpinner(),this.formIdentificationData=this._mapperFieldValues(e),this._lastService?this[`_${this._lastService}`]():this._postCustomerTerms()}_mapperFieldValues(e){return e.reduce(((e,t)=>Object.assign(e,{[t.id.split(this.hyphen).shift()]:t.value})),{})}_postCustomerTerms(){const e=this.videoSelfieMode?"VIDEO":"NATIONAL",t=((e="")=>({NATIONAL:[{termType:{id:"BD-MX-AA-USODPS-002"},acceptanceMethod:{id:"TA001"},status:{id:"ACCEPTED"},acceptanceMessages:[{value:"BDUSODPS15"}]}],VIDEO:[{termType:{id:"BD-MX-AA-USODPS-002"},acceptanceMethod:{id:"TA001"},status:{id:"ACCEPTED"},acceptanceMessages:[{value:"BDUSODPS16"}]}],CONSENT:[{termType:{id:"BD-MX-AA-USODPS-001"},status:{id:"ACCEPTED"},acceptanceMethod:{id:"Autorizado con Firma Electrónica"},referenceNumber:e,acceptanceMessages:[{value:"Al continuar nos otorgas tu consentimiento para que consultemos los datos de tu identificación ante el INE."}]}]}))()[`${e}`];this._lastService="postCustomerTerms",this._customerTermsDm.postCustomerTerms(this.customerId,t)}_handleCustomerTermsSuccess({detail:e}){this._errorCounter=0,this.processTermsId=(e.data||e).id,this._postCivilRegistriesSearch()}_postCivilRegistriesSearch(){this._lastService="postCivilRegistriesSearch";const{birthDate:e,firstName:t,lastName:i,secondLastName:s,gender:a}=this.dataExtractedFromVeridas,{curp:r}=this.formIdentificationData,o={gender:{id:a.id},documentNumber:r,lastName:i.replace(s,"").trim(),secondLastName:s,name:t,birthDate:`${e.substr(0,4)}-${r.substr(6,2)}-${r.substr(8,2)}`};this._globalCivilRegister.postCivilRegistriesSearch(o)}_handleCivilRegistriesSearchSuccess({detail:e}){this._errorCounter=0;const t=e&&e[0]&&e[0].identityDocuments&&e[0].identityDocuments[0]||{};"ACTIVE"===(t.status&&t.status.id)?this._validateDataBeforeIne():this._manageIdentityVerificationError()}_validateDataBeforeIne(){this._needValidationByIne()?this._verifyIne():this._verifyCic()}_needValidationByIne(){return this.dataExtractedFromVeridas.curp!==this.formIdentificationData.curp||this.dataExtractedFromVeridas.ocrNumber!==this.formIdentificationData.ocr||this.dataExtractedFromVeridas.identificationNumber!==this.formIdentificationData.electoral||this.dataExtractedFromVeridas.emisionNumber!==this.formIdentificationData.emission}_verifyIne(){this._lastService="verifyIne";const e={auditLog:{branch:{id:"3307"},operationType:{id:"GI"}},customer:{identityDocuments:[{documentType:{id:"INE"},code:this.formIdentificationData.ocr,key:this.formIdentificationData.electoral,registerYear:this.dataExtractedFromVeridas.registerYear,folio:this.formIdentificationData.emission}]}},t={type:"multipart/form-data",formDataParts:[{name:"metadata",body:{mediaType:"application/json",content:JSON.stringify(e)}},{name:"file2",body:{mediaType:"application/json",content:JSON.stringify(this.capturedBiometrics["selfie-image"].base64.split(",").pop())}}]};this._customerNationalElectoralInstitute.forceBoundary=!0,this._customerNationalElectoralInstitute.multipart=t,this._customerNationalElectoralInstitute.postNationalElectoralInstituteValidateCredentialsData()}_verifyCic(){this._lastService="verifyCic";const e={auditLog:{branch:{id:"3307"},operationType:{id:"GI"}},customer:{identityDocuments:[{documentType:{id:"INE"},documentNumber:this.dataExtractedFromVeridas.codeIdentificationCredential}]}},t={type:"multipart/form-data",formDataParts:[{name:"metadata",body:{mediaType:"application/json",content:JSON.stringify(e)}},{name:"file2",body:{mediaType:"application/json",content:JSON.stringify(this.capturedBiometrics["selfie-image"].base64.split(",").pop())}}]};this._customerNationalElectoralInstitute.forceBoundary=!0,this._customerNationalElectoralInstitute.multipart=t,this._customerNationalElectoralInstitute.postNationalElectoralInstituteValidateCredentialsData()}_handleNationalElectoralInstituteSuccess({detail:e}){this._errorCounter=0,this.hideSpinner();const{validationResults:t}=e&&e.auditLog||{};if(t.length>0){const e=t.some((e=>e&&e.result&&"REJECTED"===e.result.toUpperCase()));e||this.fromProceedings?!e&&this.fromProceedings?(this._errorExtractedCounter=0,this._showMultistep=!1,this._dispatch(`${bt.is}-proceedings-navigate`,this._createProceedingsData()),this._dispatch(`${bt.is}-leave-operative`)):this._manageIdentityVerificationError():(this._errorExtractedCounter=0,this._multistep.completeCurrentStep())}else this._manageIdentityVerificationError()}_createProceedingsData(){return{capturedBiometrics:this.capturedBiometrics,documentExtracted:{curp:this.formIdentificationData.curp,registerYear:this.dataExtractedFromVeridas.registerYear,emisionNumber:this.formIdentificationData.emission,identificationNumber:this.formIdentificationData.electoral,ocrNumber:this.formIdentificationData.ocr,expeditionDate:this.dataExtractedFromVeridas.expeditionDate,codeIdentificationCredential:this.dataExtractedFromVeridas.codeIdentificationCredential,validityYear:this.formIdentificationData.expiration},location:this.dataExtractedFromVeridas.location}}_saveguardCustomerData(){this._showSpinner(`${bt.is}-files-loader-title`,`${bt.is}-loader-message`),this.customerOperationNumber&&this.customerOperationDate?this._prepareRequest():this._patchCustomer()}_patchCustomer(){const e={identityDocuments:[{expirationDate:`${this.formIdentificationData.expiration}-12-31`,documentNumber:this.formIdentificationData.ocr,documentType:{id:"INE"}}]};this._showSpinner(`${bt.is}-files-loader-title`,`${bt.is}-loader-message`),this._lastService="patchCustomer",this._localCustomerDm.patchCustomer(this.customerId,e)}_handlePatchCustomerSuccess({detail:e}){this._errorCounter=0;const{operationNumber:t,operationDate:i}=e;this.customerOperationNumber=t,this.customerOperationDate=i,this._prepareRequest()}_prepareRequest(){this._obverseSaved?this._reverseSaved?this.videoSelfieMode&&!this._videoSelfieSaved?(this._lastServiceRequest={flag:"videoSelfieSaved",id:this.attachmentIds.selfieVideo},this._postIdentificationProcessDocuments()):(this._generateReceipt(),this.hideSpinner(),this._dispatch(`${bt.is}-success-load`,{operationNumber:this.customerOperationNumber}),this._showMultistep=!1,this._showReceipt=!0):(this._lastServiceRequest={flag:"reverseSaved",id:this.attachmentIds.reverseImage},this._postIdentificationProcessDocuments()):(this._lastServiceRequest={flag:"obverseSaved",id:this.attachmentIds.obverseImage},this._postIdentificationProcessDocuments())}_postIdentificationProcessDocuments(){const e=this.capturedBiometrics[this._lastServiceRequest.id],t=this._lastServiceRequest.id.toUpperCase(),{base64:i}=e,s="SELFIE-VIDEO"===t,a="OBVERSE-IMAGE"===t?"FIRST_PAGE":"LAST_PAGE",r=t.split("-").shift(),o=this._generateContentInfo(s,a,r),n={type:"multipart/form-data",formDataParts:[{name:"documentInfo",body:{mediaType:"application/json",content:JSON.stringify(o)}},{name:"file",filename:e.fileName,body:{mediaType:s?"video/mp4":"image/jpeg",content:s?i:i.split(",").pop()}}]};this._identificationProcessDocumentDm.forceBoundary=!0,this._identificationProcessDocumentDm.multipart=n,this._lastService="postIdentificationProcessDocuments",this._identificationProcessDocumentDm.postCustomerIdentificationProcessDocuments(this.customerId)}_generateContentInfo(e,t,i){const s={documentType:e?"A":"O",side:e?"OBVERSE":i,verificationType:[{id:"NAME"}],metadata:[{key:"DOCUMENT_TYPE_ID",value:e?"AGX":"001"},{key:"PRODUCT",value:"GM"},{key:"OPERATION_TYPE",value:"saveDocCteTempGM"},{key:"REFERENCE_NUMBER",value:""},{key:"PROCEDURE",value:e?"AD":"A2"}],contentInfo:{contentData:e?"video selfie":"identificacion INE",contentType:e?"mp4":"jpg",documentFamily:e?"mp4":"jpg"}},a=[{key:"numContrato",value:"",valueCypher:this.accountId},{key:"sucursal",value:"3607"},{key:"usuario",value:"ZG10003"},{key:"tipoMatriz",value:"AD01"},{key:"secRef",value:"001"},{key:"idProceso",value:"FAD_CONSUMO"},{key:"txEU",value:"EUG4"}];return e?s.metadata=s.metadata.concat(a):s.pageType=t,s}_handleIdentificationProcessDocumentsSuccess(){this._errorCounter=0,this[`_${this._lastServiceRequest.flag}`]=!0,this._prepareRequest()}_generateReceipt(){const e=this.videoSelfieMode?"video":"national",t=this.customerEmail.indexOf("@");this.customerEmail=`•••${this.customerEmail.substring(t-3,this.customerEmail.length)}`;const i={operationSummary:[{header:`${bt.is}-receipt-header-category-attachments-${e}`,list:this._getOficialIdSection()},{header:`${bt.is}-receipt-header-category-ine`,list:this._getDataIneSection()},{header:"",list:[{name:`${bt.is}-receipt-list-simple-date`,value:{text:(s=this.customerOperationDate,a=this.operationFormatDate,r=this.locale,Xe(s).locale(r).format(a))}},{name:`${bt.is}-receipt-list-simple-operation-number`,value:{text:this.customerOperationNumber}}]}]};var s,a,r;this.videoSelfieMode||(i.alternalNotification=`${bt.is}-receipt-second-notification`),this._receiptConfig=i}_getOficialIdSection(){const e=[{name:`${bt.is}-step-identity-capture-id-module`,value:{text:`${bt.is}-step-identity-capture-completed`}},{name:`${bt.is}-step-identity-capture-selfie-module`,value:{text:`${bt.is}-step-identity-capture-completed`}}];return this.videoSelfieMode&&e.push({name:`${bt.is}-step-identity-capture-videoselfie-module`,value:{text:`${bt.is}-step-identity-capture-completed`}}),e}_getDataIneSection(){return[{name:`${bt.is}-step-confirm-identity-form-curp-label`,value:{text:this.formIdentificationData.curp}},{name:`${bt.is}-step-confirm-identity-form-ocr-label`,value:{text:this.formIdentificationData.ocr}},{name:`${bt.is}-step-confirm-identity-form-electoral-label`,value:{text:this.formIdentificationData.electoral}},{name:`${bt.is}-step-confirm-identity-form-emission-label`,value:{text:this.formIdentificationData.emission}},{name:`${bt.is}-step-confirm-identity-form-expiration-label`,value:{text:this.formIdentificationData.expiration}}]}get _tplsVisuals(){return a`
      <national-videoselfie-multistep
        ?visible="${this._showMultistep}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ?is-video-selfie="${this.videoSelfieMode}"
        .documentConfig="${this.documentConfig}"
        .selfieConfig="${this.selfieConfig}"
        .videoConfig="${this.videoConfig}"
        .dataCustomerForm="${this.formFilledData}"
        @national-videoselfie-multistep-header-click="${this._manageBackNavigation}"
        @bbva-feature-national-id-and-videoselfie-mx-informative-modal-click="${this._handleInformativeModal}"
        @national-videoselfie-multistep-consent-continue-click="${this._grantIdentityConsent}"
        @national-videoselfie-multistep-capture-continue-click="${this._startVeridasProcess}"
        @national-videoselfie-multistep-confirm-identity-continue-click="${this._verificationIdentityCaptured}"
        @bbva-feature-national-id-and-videoselfie-mx-module-click="${this._handleModalRecommendations}"
        @bbva-feature-national-id-and-videoselfie-mx-confirm-button-click="${this._saveguardCustomerData}"
      ></national-videoselfie-multistep>

      <national-videoselfie-full-modal
        id="${this._fullModalConfig.modalId}"
        ?visible="${this._fullModalOpened}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        .config="${this._fullModalConfig}"
        @national-videoselfie-full-modal-header-click="${this._handleFullModalHeaderClick}"
        @national-videoselfie-full-modal-button-click="${this._handleFullModalFooterButton}"
        @national-videoselfie-full-modal-change="${e=>{this._fullModalOpened=e.detail}}"
      ></national-videoselfie-full-modal>

      <national-videoselfie-half-modal
        id="${this._halfModalConfig.modalId}"
        ?visible="${this._halfModalOpened}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        .config="${this._halfModalConfig}"
        @national-videoselfie-half-modal-header-click="${this._handleHalfModalHeaderClick}"
        @national-videoselfie-half-modal-button-click="${this._handleHalfModalFooterButton}"
        @national-videoselfie-half-modal-change="${e=>{this._halfModalOpened=e.detail}}"
      ></national-videoselfie-half-modal>

      <national-videoselfie-receipt
        id="nationalVideoselfieReceipt"
        ?visible="${this._showReceipt}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        email=${this.customerEmail}
        .receiptData="${this._receiptConfig}"
        @national-videoselfie-receipt-header-click="${this._leaveOperative}"
      >
      </national-videoselfie-receipt>
    `}get _tplsApis(){return a`
      <bbva-global-customer-terms-api-dm
        .host="${this.host}"
        .version="${this.customersApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        requiredOtp
        @customer-terms-api-dm-create="${this._handleCustomerTermsSuccess}"
        @customer-terms-api-dm-create-error="${this._manageError}"
        @api-dm-error="${this._manageError}"
      >
      </bbva-global-customer-terms-api-dm>

      <bbva-global-verifications-api-dm
        .host="${this.host}"
        ?native="${this.native}"
        .version="${this.documentsVerificationsApiVersion}"
        .requiredToken="${this.requiredToken}"
        cachetype="NONE"
        @verifications-api-dm-create="${this._onCreateVerificationIdSuccess}"
        @verifications-api-dm-create-error="${this._manageError}"
        @api-dm-error="${this._manageError}"
      >
      </bbva-global-verifications-api-dm>

      <bbva-global-verification-attachment-api-dm
        .host="${this.host}"
        ?native="${this.native}"
        .version="${this.documentsVerificationsApiVersion}"
        .requiredToken="${this.requiredToken}"
        cachetype="NONE"
        .headers="${this._getMultipartHeaders()}"
        @verification-attachment-api-dm-update="${this.onAttachmentResponseSuccess}"
        @verification-attachment-api-dm-update-error="${this._manageError}"
        @api-dm-error="${this._manageError}"
      >
      </bbva-global-verification-attachment-api-dm>

      <bbva-global-verification-api-dm
        host="${this.host}"
        ?native="${this.native}"
        .version="${this.documentsVerificationsApiVersion}"
        .requiredToken="${this.requiredToken}"
        cachetype="NONE"
        @verification-api-dm-fetch="${this._handleGetVerificationSuccess}"
        @verification-api-dm-fetch-error="${this._manageError}"
        @api-dm-error="${this._manageError}"
      >
      </bbva-global-verification-api-dm>

      <bbva-global-verification-execute-api-dm
        host="${this.host}"
        ?native="${this.native}"
        .version="${this.documentsVerificationsApiVersion}"
        .requiredToken="${this.requiredToken}"
        cachetype="NONE"
        .headers="${this._getHeaders()}"
        timeout="60"
        @verification-execute-api-dm-create="${this._handleVerificationExecuteSuccess}"
        @verification-execute-api-dm-create-error="${this._manageError}"
        @api-dm-error="${this._manageError}"
      >
      </bbva-global-verification-execute-api-dm>

      <bbva-global-documents-verifications-api-dm
        .host="${this.host}"
        ?native="${this.native}"
        version="${this.customerDocumentsApiVersion}"
        .requiredToken="${this.requiredToken}"
        cachetype="NONE"
        @documents-verifications-api-dm-fetch="${this._handleDocumentsVerificationsSuccess}"
        @documents-verifications-api-dm-fetch-error="${this._manageError}"
        @api-dm-error="${this._manageError}"
      >
      </bbva-global-documents-verifications-api-dm>

      <bbva-global-civil-registries-search-api-dm
        .host="${this.host}"
        .version="${this.customersApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @civil-registries-search-api-dm-fetch="${this._handleCivilRegistriesSearchSuccess}"
        @civil-registries-search-api-dm-fetch-error="${this._manageError}"
        @api-dm-error="${this._manageError}"
      >
      </bbva-global-civil-registries-search-api-dm>

      <bbva-local-national-electoral-institute-validate-credetial-data-api-dm-mx
        .host="${this.host}"
        .version="${this.customersApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        .headers="${this._getMultipartHeaders()}"
        @national-electoral-institute-validate-credetial-data-api-dm-create="${this._handleNationalElectoralInstituteSuccess}"
        @national-electoral-institute-validate-credetial-data-api-dm-create-error="${this._manageError}"
        @api-dm-error="${this._manageError}"
      >
      </bbva-local-national-electoral-institute-validate-credetial-data-api-dm-mx>

      <bbva-local-customer-api-dm
        .host="${this.host}"
        .version="${this.customersApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @customer-api-dm-update="${this._handlePatchCustomerSuccess}"
        @customer-api-dm-update-error="${this._manageError}"
        @api-dm-error="${this._manageError}"
      >
      </bbva-local-customer-api-dm>

      <bbva-global-customer-identification-process-documents-api-dm
        .host="${this.host}"
        .version="${this.customersApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        .headers="${this._getMultipartHeaders()}"
        requiredOtp
        @customer-identification-process-documents-api-dm-create="${this._handleIdentificationProcessDocumentsSuccess}"
        @customer-identification-process-documents-api-dm-create-error="${this._manageError}"
        @api-dm-error="${this._manageError}"
      >
      </bbva-global-customer-identification-process-documents-api-dm>
    `}get _tplPlugins(){return a`
      <bbva-nativeconnector-document-capture
        @launch-document-capture-success="${this.handleDocumentCaptureSuccess}"
        @launch-document-capture-error="${this.handlePermissionPlugin}"
      >
      </bbva-nativeconnector-document-capture>

      <bbva-nativeconnector-selfie-capture
        @launch-selfie-capture-success="${this.handleSelfieCaptureSuccess}"
        @launch-selfie-capture-error="${this.handlePermissionPlugin}"
      >
      </bbva-nativeconnector-selfie-capture>

      <bbva-nativeconnector-video-capture
        @launch-video-capture-success="${this.handleVideoSelfieSuccess}"
        @launch-video-capture-error="${this.handleVideoSelfieError}"
      >
      </bbva-nativeconnector-video-capture>

      <bbva-manager-photo-converter
        @obverse-image-success="${this._handleManagerConverter}"
        @obverse-flash-image-success="${this._handleManagerConverter}"
        @reverse-image-success="${this._handleManagerConverter}"
        @selfie-image-success="${this._handleManagerConverter}"
        @selfie-video-success="${this._handleManagerConverter}"
        .resizePercentage="${this.resizePercentage}"
      >
      </bbva-manager-photo-converter>

      <bbva-nativeconnector-native-settings> </bbva-nativeconnector-native-settings>
    `}render(){return a` ${super.render()} ${this._tplsVisuals} ${this._tplsApis} ${this._tplPlugins}`}}customElements.define(bt.is,bt);class _t extends(se(i)){static get is(){return"bbva-analyticmanager-national-id-and-videoselfie"}static get properties(){return{customerData:{type:Object},segments:{type:Object},interactions:{type:Object},_isAppPageViewStepsLaunched:{type:Boolean}}}constructor(){super(),this.customerData={},this.segments={warningNominees:"nominados alertados",proactiveNominees:"proactivos nominados",nonNominatedProactive:"proactivos no nominados",profile:"perfil"},this.interactions={check:"otorgar consentimiento",consent:"aviso de privacidad"},this._isAppPageViewStepsLaunched=!1}onAppPageVisit(){var e,t,i,s,a;const r=this.segments[null===(e=this.customerData)||void 0===e?void 0:e.segmentProfile]||"",o=null!==(t=this.customerData)&&void 0!==t&&t.videoSelfieMode?"national id y videoselfie":"national id selfie",n=null!==(i=this.customerData)&&void 0!==i&&i.completedModules?`modulos completados:${this.customerData.completedModules}`:"",c=(null===(s=this.customerData)||void 0===s?void 0:s.primaryCategory)||"",l=(null===(a=this.customerData)||void 0===a?void 0:a.productName)||"";this.persistData({segmentProfile:r,typology:o,customFields:n,primaryCategory:c,productName:l}),this.firePageVisit()}onAppStarted({name:e}){if(!this._isAppStartedLaunched){this.appStartedText="";const t=this.interactions[e.toLowerCase()]||"";this.fireAppStarted(t),this._isAppStartedLaunched=!0,this._isAppPageViewStepsLaunched=!0}}onAppPageView({name:e}){var t;const i=e.toLowerCase().replace(/_/g,"-"),s=`segmento usuario:${this.segments[null===(t=this.customerData)||void 0===t?void 0:t.segmentProfile]}`;this.persistData({customFieldsFootprint:s}),this._dispatch(`analytics-page-view-${i}`,this.data)}onAppPageViewOtp(){if(this._isAppPageViewStepsLaunched){var e;const t=`segmento usuario:${this.segments[null===(e=this.customerData)||void 0===e?void 0:e.segmentProfile]}, firma:token`;this.persistData({customFieldsFootprint:t}),this._dispatch("analytics-page-view-otp",this.data)}}onAppPageViewSteps(e){if(this._isAppPageViewStepsLaunched){if(e.name&&("capture"===e.name.toLowerCase()||"confirm"===e.name.toLowerCase()||"validate"===e.name.toLowerCase()))return void this._dispatch(`analytics-page-view-${e.name.toLowerCase()}`,this.data);Array.isArray(e)&&e.some((e=>"curp-form"===e.id))&&this._dispatch("analytics-page-view-confirm-identity",this.data)}}onAppPageSuccess({operationNumber:e=""}){this._isAppStartedLaunched&&(this.data.customFields=this.data.customFields.includes("firma:token")?this.data.customFields:`firma:token, ${this.data.customFields}`,this.persistData({operationNumber:e}),this.fireAppCompleted())}onInternalLink(e){this._dispatch(`analytics-internal-link-${e}`,this.data)}}customElements.define(_t.is,_t);var vt=Object.freeze({__proto__:null});export{ke as B,vt as n};
