import{aZ as e,J as t,L as i,a7 as n,z as a,aV as s,h as o,cU as r,aN as l,av as d,dp as c,i as h,aY as u,a9 as p,cT as m,aX as g,an as _,ak as v,bF as b,H as f,V as y}from"./952f98a9.js";import{M as S,L as C,D as T,T as x,N as R,ao as E,e as $,G as O,x as w,K as k,an as I,R as A,S as M,a1 as D,A as L,V as N,as as P,h as H,a2 as B,F as q,f as j,Q as F,at as K}from"./216055dc.js";import{a2 as V,a3 as U,by as G,aI as W,aH as z,bO as X,bf as J,bg as Q}from"./7f3d7ca9.js";import{b as Y,B as Z}from"./41ed0536.js";import{b as ee,B as te}from"./d335c75d.js";import{B as ie,a as ne}from"./5b8531e8.js";import"./c0a2f832.js";import"./cae0f1de.js";class ae{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let i=Object(this),n=i.length>>>0;if(0===n)return!1;let a=0|t,s=Math.max(a>=0?a:n-Math.abs(a),0);for(;s<n;){if((o=i[s])===(r=e)||"number"==typeof o&&"number"==typeof r&&isNaN(o)&&isNaN(r))return!0;s++}var o,r;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var i=[],n=0,a="",s=0,o=arguments.length;s!==o;++s){var r=+arguments[s];if(!(r<1114111&&r>>>0===r))throw RangeError("Invalid code point: "+r);r<=65535?n=i.push(r):(r-=65536,n=i.push(55296+(r>>10),r%1024+56320)),n>=16383&&(a+=e.apply(null,i),i.length=0)}return a+e.apply(null,i)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",i=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${i&&i.message}`)}}class se extends ae{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}}const oe=0,re=1,le="jwt",de="tsec",ce="none";class he extends ae{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=oe,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new se,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=de:this.requiredToken=ce,this.requiresJWT=!1):this.requiredToken===de?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===le?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===ce?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(de)}_setJwtHandler(){this._setTokenHandler(le)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((i,n)=>{t=Object.assign(t,{resolve:i,reject:n}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let i=this._getRequestHeaders();Object.keys(i).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,i[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let t=null;return!!window.CellsNativePlugins&&(t=e),t}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let i=e.replace(/[\{\}]+/g,""),n=t[i];return n?delete t[i]:this._error(9,`Missing ${i} param value`),n})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let i=Object.keys(t);i.length&&(e=[e,i.map((e=>{let i=t[e];return Array.isArray(i)&&this.paramArrayMode===re?this._arrayToQueryParam(e,i):`${e}=${i}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(de,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(le,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(i){var n=t.getItem(i);n&&"null"!==n&&(e[i]=n)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const i=window.sessionStorage;t=Object.keys(i).filter((t=>t.startsWith(e))).reduce(((t,n)=>(t[n.replace(e,"")]=i.getItem(n),t)),{})}return t}_getTokenForRequestHeaders(e,t){const i=`${e}Handler`,n=e===le?"JWT ":"",a=e===le?"Authorization":de;if(void 0===this[i]||null===this[i])this._error(11,`${e} handler is undefined`);else{const s=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let o=this[i].getItem(s);o?t[a]=t[a]||n+o:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((i=>{t.push(`${i}=${e[i]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let i;const n=new Promise(((e,t)=>{i=(i,n)=>{i?t(i):e(n)}}));return t.addEventListener("loadend",(function e(n){t.removeEventListener("loadend",e),n.error?i(n.error):i(null,t.result)})),t.readAsText(e),n}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let i=0;for(;i<e.length;){let n=e[i],a=0,s=0;if(n<=127?(a=0,s=255&n):n<=223?(a=1,s=31&n):n<=239?(a=2,s=15&n):n<=244&&(a=3,s=7&n),e.length-i-a>0){let t=0;for(;t<a;)n=e[i+t+1],s=s<<6|63&n,t+=1}else s=65533,a=e.length-i;t+=String.fromCodePoint(s),i+=a+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},i=e.trim().split(/[\r\n]+/);for(const e in i)if(i.hasOwnProperty(e)&&""!==i[e]){let n=": ",a=i[e].split(n);t[a.shift().toLowerCase()]=a.join(n)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,i,n){let a=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(n)>=0&&(a=t.getResponseHeader(n));break;case this._NATIVE_XHR:t&&t.headers&&(a=JSON.parse(t.headers)[n])}if(a){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):i;e.getItem(t)!==a&&(e.setItem(t,a),this._emitTokenUpdate(i,a))}}_emitTokenUpdate(e,t){if(this.htmlContext){const i=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(i)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,i,n,a,s;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),i=e.getResponseHeader("AuthenticationData"),n=e.getResponseHeader("AuthenticationState"),a=e.getResponseHeader("AuthenticationChallenge"),s=e.getResponseHeader("AuthenticationResponse");else{let o=JSON.parse(e.headers);t=o.authenticationtype,i=o.authenticationdata||null,n=o.authenticationstate,a=o.authenticationchallenge,s=o.authenticationresponse}return{type:t,data:i,state:n,challenge:a,response:s}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",i=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const n=this._getSignatureData(e,t,i);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:n}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",i="",n=""){let a;if("object"==typeof e&&e){const s=this._getSignatureData(e.signatureType,t,i);a=this._makeKeyValuePairFromObject(s,e.signatureValue),e.challenge&&(a+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(a,e.signatureType,n)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(a=`password=${e}`,this._buildSignatureHeaders(a,"2",n)):(a=`${i}=${e}`,this._buildSignatureHeaders(a,t,n)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let i,n=e.split(",");if(n.length>1){i=n.map((e=>`${e}=${t[e]}`)).join(",")}else i=`${e}=${t}`;return i}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",i=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),i&&(this.headers=Object.assign(this.headers,{AuthenticationState:i})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),n=this._extractResponseErrorCode(t),a=this._ERROR_CODES.SIGNATURE_INVALID.includes(n),{type:s,data:o,state:r,challenge:l,response:d}=this._extractSignatureResponseHeaders(e),c=this._getRequestMetadata(e);if(a)this._notifySignatureInvalid(c),i=!0;else if(s)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(n)?(this._notifySignatureTypeUsingErrorCode(n,c,s,o,r,l,d),i=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(c,s,o,r,l,d),i=!0}return i}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),n=this._extractResponseErrorCode(t),a=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(n),s=this._getRequestMetadata(e);a&&(this._notifyWaitingForProcessResponse(s),i=!0)}return i}_notifySignatureRequiredFirstStep(e,t,i,n){this._defineSignatureType(t,i),this._defineSignatureValue(t,i,n),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:i,metadata:e}}))}_notifySignatureRequired(e,t,i,n,a,s){this._defineSignatureValue(t,i,n);const o={type:t,data:i,challenge:a,metadata:e};s&&(o.response=s),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:o}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:i}=e;return{path:this._path,method:this.method,url:t,status:i}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",i=""){const n=t.split(";").findIndex((t=>t===e));return i?i.split(";")[n]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,i,n,a,s){n?this._notifySignatureRequired(e,t,i,n,a,s):this._notifySignatureRequiredFirstStep(e,t,i,n)}_notifySignatureTypeUsingErrorCode(e,t,i,n,a,s,o){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,i,n,a):this._notifySignatureRequired(t,i,n,a,s,o)}}class ue extends he{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}}class pe extends ue{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}`)}toString(){return super.toString("BGADPCustomersCustomerGetV0")}}class me extends ue{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/contact-details`)}toString(){return super.toString("BGADPCustomersCustomerContactDetailsGetV0")}}class ge extends ue{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}`)}toString(){return super.toString("BGADPCustomersCustomerGetV1")}}class _e extends ue{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/contact-details`)}toString(){return super.toString("BGADPCustomersCustomerContactDetailsGetV1")}}class ve extends(t(i)){_mappingBank(e){this._renameProperty(e,"bank.bankId","id"),this._renameProperty(e,"bank.branch.branchId","id"),e.bank&&e.bank.branch&&e.bank.branch.costCenter&&(e.bank.branch.costCenter={id:e.bank.branch.costCenter})}_mappingGender(e){this._renameProperty(e,"gender.name","description")}_mappingIdentityDocuments(e){for(let t=0;t<e.identityDocuments.length;t++)this._renameProperty(e.identityDocuments[t],"documentType.name","description"),this._renameProperty(e.identityDocuments[t],"status.name","description")}_mappingMaritalStatus(e){this._renameProperty(e,"maritalStatus.name","description")}_mappingNationalities(e){for(let t=0;t<e.nationalities.length;t++)this._renameProperty(e.nationalities[t],"name","description")}_mappingPersonalTitle(e){this._renameProperty(e,"personalTitle.name","description")}_mappingResidence(e){this._renameProperty(e,"residence","taxResidence"),this._renameProperty(e,"taxResidence.residenceType.name","description")}_mappingVerification(e){this._renameProperty(e,"enrollmentModality","verification"),this._renameProperty(e,"verification.enrollmentMethod","identificationMethod")}_mappingSegments(e){for(let t=0;t<e.segments.length;t++)this._renameProperty(e.segments[t],"name","description")}_changeNameToDescription(e){e.map((e=>{this._renameProperty(e,"name","description")}))}}class be extends ve{static get is(){return"bbva-global-customer-api-dm"}static get properties(){return{customer:{type:Object,attribute:!1}}}constructor(){super(),this.customer={}}resetCustomer(){this.customer={}}getCustomer(e,t={}){if(Object.keys(this.customer).length)return;t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),{customEvent:"customer-api-dm-fetch",errorFireEventHandler:"customer-api-dm-fetch-error"},this._responseMapping,t.fields)}_getService(e,t={},i={}){const n=this._getServiceParams(i,t);return this._getServicePath(`${e}Customer`,this._getBgadp(n))}_getBgadp(e){return{getCustomerV0:()=>new pe(e),getCustomerV1:()=>new ge(e),default:()=>"BGADP called not exist"}}_responseMapping(e){const t=["arrivalReference","membershipDate"];return Object.keys(e).length&&(this._renameProperty(e,"customerId","id"),this._mappingBank(e),this._mappingGender(e),this._mappingIdentityDocuments(e),this._mappingMaritalStatus(e),this._mappingNationalities(e),this._mappingPersonalTitle(e),this._mappingResidence(e),this._mappingVerification(e),this._removeFields(t,e)),e}}class fe extends ve{static get is(){return"bbva-global-customer-contact-details-api-dm"}static get properties(){return{customerContactDetails:{type:Array,attribute:!1},_contactType:{type:Object,attribute:!1},_socialNetwork:{type:Object,attribute:!1},_emailType:{type:Object,attribute:!1},_phoneType:{type:Object,attribute:!1}}}constructor(){super(),this.customerContactDetails=[],this._contactType={WORK_EMAIL:"EMAIL",FACEBOOK_EMAIL:"EMAIL",EMAIL:"EMAIL",PHONE_NUMBER:"LANDLINE",MOBILE_NUMBER:"MOBILE",OFFICE_NUMBER:"LANDLINE",FACEBOOK_ACCOUNT:"SOCIALMEDIA",TWITTER_ACCOUNT:"SOCIALMEDIA"},this._socialNetwork={FACEBOOK_ACCOUNT:"FACEBOOK",TWITTER_ACCOUNT:"TWITTER"},this._emailType={EMAIL:"PERSONAL",WORK_EMAIL:"WORK",FACEBOOK_EMAIL:"SOCIALMEDIA"},this._phoneType={PHONE_NUMBER:"HOME",OFFICE_NUMBER:"WORK"}}resetCustomerContactDetails(){this.customerContactDetails=[]}getCustomerContactDetails(e,t={}){if(Object.keys(this.customerContactDetails).length)return;this._paramsMapping(t);t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),{customEvent:"customer-contact-details-api-dm-fetch",paginationEvent:"customer-contact-details-api-dm-pagination",errorFireEventHandler:"customer-contact-details-api-dm-fetch-error"},this._responseMapping,t.fields)}_getService(e,t={},i={}){const n=this._getServiceParams(i,t);return this._getServicePath(`${e}CustomerContactDetails`,this._getBgadp(n))}_getBgadp(e){return{getCustomerContactDetailsV0:()=>new me(e),getCustomerContactDetailsV1:()=>new _e(e),getCustomerContactDetailsV2:()=>new V(e),getCustomerContactDetailsV3:()=>new U(e),default:()=>"BGADP called not exist"}}_paramsMapping(e){"0"==this.version&&(this._removeFields(["contact.isMultichannel"],e),this._removeFields(["contact.contactDetailType"],e)),"2"==this.version&&this._removeFields(["contact.contactDetailType"],e)}_responseMapping(e){if("0"==this.version&&Object.keys(e).length){let t;for(let i=0;i<e.length;i++)if(this._renameProperty(e[i],"contactDetailId","id"),e[i].contactType){switch(t=e[i].contact,e[i].contact={contactDetailType:this._contactType[e[i].contactType.id]},e[i].contact.contactDetailType){case"EMAIL":e[i].contact.address=t,e[i].hasOwnProperty("isVerified")&&(e[i].contact.isVerified=e[i].isVerified),e[i].contact.receivesNotifications=e[i].isChecked,e[i].contact.emailType=this._emailType[e[i].contactType.id];break;case"LANDLINE":e[i].contact.number=t,e[i].contact.phoneType=this._phoneType[e[i].contactType.id],e[i].country&&(e[i].contact.country=e[i].country),e[i].regionalCode&&(e[i].contact.regionalCode=e[i].regionalCode),e[i].extension&&(e[i].contact.extension=e[i].extension),e[i].hasOwnProperty("isVerified")&&(e[i].contact.isVerified=e[i].isVerified);break;case"MOBILE":e[i].contact.number=t,e[i].phoneCompany&&(e[i].contact.phoneCompany=e[i].phoneCompany),e[i].hasOwnProperty("isVerified")&&(e[i].contact.isVerified=e[i].isVerified),e[i].contact.receivesNotifications=e[i].isChecked,e[i].contact.phoneType="HOME";break;case"SOCIALMEDIA":e[i].contact.userName=t,e[i].contact.socialNetwork=this._socialNetwork[e[i].contactType.id]}this._removeFields(["country","regionalCode","extension","isChecked","isVerified","contactType","phoneCompany"],e[i])}}if("1"==this.version&&Object.keys(e).length){const t=["isSafe","isVerifiedByCustomer"];for(let i=0;i<e.length;i++)e[i].contact&&"MOBILE"===e[i].contact.contactDetailType&&this._removeFields(["isMobileToken"],e[i].contact),this._removeFields(t,e[i])}return e}}class ye extends ve{static get is(){return"bbva-global-customer-lopd-documents-base-api-dm"}resetCustomerLopdDocuments(){this.customerLopdDocuments={}}getCustomerLopdDocuments(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},i={}){const n=this._getServiceParams(i,t);return this._getServicePath(`${e}CustomerLopdDocuments`,this._getBgadp(n))}_getBgadp(e){return{getCustomerLopdDocumentsV3:()=>new G(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}n(ye,"GET_EVENTS",{customEvent:"customer-lopd-documents-api-dm-fetch",errorFireEventHandler:"customer-lopd-documents-api-dm-fetch-error"}),customElements.define(ye.is,ye);var Se=a`
  :host {
    display: block;
    box-sizing: border-box;
  }

  :host([hidden]),
  [hidden] {
    display: none !important;
  }

  *,
  *::before,
  *::after {
    box-sizing: inherit;
  }

  .continue-button {
    margin-top: 2rem;
    margin-bottom: 0.5rem;
  }

  .data-info-section {
    margin-top: 0.5rem;
  }
  .data-info-section .data-info-row {
    display: flex;
    justify-content: space-between;
    margin-bottom: 1rem;
  }

  .reasons-container .reasons-message {
    padding: 0 1rem;
    margin-top: 0.25rem;
    margin-bottom: 0.5rem;
  }
  .reasons-container .continue-button {
    margin-left: 1rem;
    margin-right: 1rem;
  }

  .reasons-container-collapsed {
    padding: 0 1rem;
  }

  .detail-row {
    display: flex;
    justify-content: space-between;
  }

  .detail-container .detail-row {
    margin-top: 1rem;
  }
  .detail-container [data-tag-name='bbva-notification-message'] {
    margin-top: 2rem;
  }

  .detail-container-collapsed {
    margin: 0.5rem 0;
  }

  .summary-info-container .summary-button {
    margin: 1rem 0;
  }

  .confirmation-summary {
    background-color: var(
      --_loan-and-mortgage-origination-finance-line-cancellation-confirmation-bg
    );
    width: 100%;
    padding-left: 1rem;
    padding-right: 1rem;
  }
`;const{moment:Ce}=window;function Te(e){return e.replace(/([A-Z])/g," $1").split(" ").join("-").toLowerCase()}function xe(e,t,i="loan-and-mortgage-origination-finance-line-cancellation"){return Object.keys(e).reduce(((n,a)=>{var s;const o={...n},r=e[a],l=Te(a),d=Te(t),c=(null==l||null===(s=l.endsWith)||void 0===s?void 0:s.call(l,"key"))&&!0===r;return o[a]=c?`${i}-${d}-${l}`:r,o}),{})}function Re(e,t,i){e.dispatchEvent(new CustomEvent(t,{detail:i,bubbles:!0,composed:!0}))}function Ee(e,t="D MMMM, h:mm[ h]"){var i,n;return null===(i=Ce.utc(e))||void 0===i||null===(n=i.format(t))||void 0===n?void 0:n.replace(".","")}class $e{constructor(e){this.controller=e}get data(){var e;return null===(e=this.controller)||void 0===e?void 0:e.data}t(...e){return this.controller.t(...e)}_dispatch(e,t=!0){this.controller._dispatch(e,t)}render(){return s}}class Oe extends $e{constructor(e,t={}){super(e),this.step=t}}class we extends Oe{render(){return o`
      <div class="data-info-container">${this.controller._renderDataInfo()}</div>
    `}}class ke extends Oe{render(){return o`
      <div class="reasons-container">${this.controller._renderCancellationReasons}</div>
    `}}class Ie extends Oe{render(){return o`
      <div class="reasons-container-collapsed">
        ${this.controller._renderCancellationReasonsCollapsed}
      </div>
    `}}class Ae extends Oe{render(){return o`
      <div class="detail-container">${this.controller._renderCancellationDetail}</div>
    `}}class Me extends Oe{render(){return o`
      <div class="detail-container-collapsed">
        ${this.controller._renderCancellationDetailCollapsed}
      </div>
    `}}class De extends Oe{render(){return o`
      <div class="summary-info-container">${this.controller._renderSummary}</div>
    `}}const Le={id:"",totalSteps:"",currentStepLabel:"",editLabel:"",viewLabel:"",header:"",buttonText:""},Ne="modal-initial",Pe="modal-initial-secondary",He=e=>({main:{header:{text:e.t(`${e.constructor.is}-main-header-text`),closeIconAriaLabel:e.t(`${e.constructor.is}-header-accessibility-key`),variant:Pe},loader:{visible:!0,ambient:"primary-alt"}}});class Be extends $e{render(){var e,t,i,n;return o`
      <div
        slot="slot-content"
        class="${d({"full-height":this.data.fullHeight})}"
      >
        <div class="onboarding-wrapper" ambient="primary-alt">
          <bbva-clip-microillustration
            microillustration="periodiccontribution"
            size="M"
          ></bbva-clip-microillustration>
          <bbva-type-text
            class="modal-title"
            size="3XL"
            tag="span"
            text="${null===(e=this.data)||void 0===e?void 0:e.modalTitleKey}"
            font-weight="700"
          ></bbva-type-text>
          <bbva-type-text
            class="modal-text"
            size="S"
            tag="span"
            text="${null===(t=this.data)||void 0===t?void 0:t.modalMessageKey}"
          ></bbva-type-text>
          ${null===(i=this.data)||void 0===i||null===(n=i.modalBenefits)||void 0===n?void 0:n.map((e=>this._renderBullet(e)))}
        </div>
      </div>
    `}_renderBullet(e){return o`
      <bbva-list-bullet>${this.t(e)}</bbva-list-bullet>
    `}}class qe extends $e{get _receiptData(){var e;return null===(e=this.data)||void 0===e?void 0:e.receiptData}static get _renderMicroIllustration(){return o`
      <bbva-clip-microillustration
        microillustration="success"
        size="M"
      ></bbva-clip-microillustration>
    `}_renderText(e){const{text:t,classes:i="",tag:n="span",fontWeight:a,fontStyle:r=c.fontStyle10,size:l="S",textColor:d,alignment:u="left",hasObfuscate:p,hasEllipsis:m}=e;return t?o`
          <bbva-type-text
            ?data-acoustic-obfuscate="${h(p)}"
            class="${i}"
            text="${this.t(t)}"
            tag="${n}"
            size="${l}"
            font-weight="${h(a)}"
            font-style="${r}"
            text-color="${h(d)}"
            alignment="${u}"
            ?ellipsis="${h(m)}"
          ></bbva-type-text>
        `:s}get _renderMain(){var e,t,i,n,a,r,l,d,h,m,g;return o`
      <div class="receipt-main">
        ${this._renderText({text:"loan-and-mortgage-origination-finance-line-cancellation-receipt-title-text",fontWeight:u.fontWeight50,size:"XL",classes:"receipt-title"})}
        ${this._renderText({text:"loan-and-mortgage-origination-finance-line-cancellation-receipt-subtitle-text",fontWeight:u.fontWeight40,textColor:p.secondary500})}
        <div class="key-value-content">
          ${this._renderText({text:"loan-and-mortgage-origination-finance-line-cancellation-receipt-operation-date-text",classes:"flex2"})}
          ${this._renderText({text:null===(e=this._receiptData)||void 0===e?void 0:e.date,fontWeight:u.fontWeight40,fontStyle:c.fontStyle20,alignment:"right",classes:"flex1"})}
        </div>
        <div class="key-value-content">
          ${this._renderText({text:"loan-and-mortgage-origination-finance-line-cancellation-receipt-associated-account-text"})}
          ${this._renderText({hasObfuscate:!0,text:null===(t=this._receiptData)||void 0===t?void 0:t.account,fontWeight:u.fontWeight40,alignment:"right"})}
        </div>
        <div class="key-value-content">
          ${this._renderText({text:"loan-and-mortgage-origination-finance-line-cancellation-receipt-operation-type-text"})}
          ${this._renderText({text:this.t(`loan-and-mortgage-origination-finance-line-cancellation-receipt-${null===(i=this._receiptData)||void 0===i?void 0:i.operationType}-value`,{productName:null===(n=this._receiptData)||void 0===n?void 0:n.productName}),fontWeight:u.fontWeight40,alignment:"right"})}
        </div>
        <div class="key-value-content">
          ${this._renderText({text:this.t(`loan-and-mortgage-origination-finance-line-cancellation-receipt-${null===(a=this._receiptData)||void 0===a?void 0:a.operationType}-text`,{productName:null===(r=this._receiptData)||void 0===r?void 0:r.productName}),classes:"flex2"})}
          ${this._renderText({text:null===(l=this._receiptData)||void 0===l?void 0:l.number,fontWeight:u.fontWeight40,alignment:"right",classes:"flex1"})}
        </div>
        <div class="key-value-content">
          ${this._renderText({text:"loan-and-mortgage-origination-finance-line-cancellation-receipt-reason-text"})}
          ${this._renderText({text:null===(d=this._receiptData)||void 0===d?void 0:d.reason,fontWeight:u.fontWeight40,alignment:"right"})}
        </div>
        <div class="key-value-content">
          ${this._renderText({text:"loan-and-mortgage-origination-finance-line-cancellation-receipt-operation-folio-text",classes:"flex1"})}
          ${this._renderText({text:null===(h=this._receiptData)||void 0===h?void 0:h.operationNumber,fontWeight:u.fontWeight40,alignment:"right",classes:"flex2"})}
        </div>
        ${null!==(m=this._receiptData)&&void 0!==m&&m.email?o`
              <div class="key-value-content">
                ${this._renderText({text:"loan-and-mortgage-origination-finance-line-cancellation-receipt-email-text"})}
                ${this._renderText({hasObfuscate:!0,text:null===(g=this._receiptData)||void 0===g?void 0:g.email,fontWeight:u.fontWeight40,alignment:"right"})}
              </div>
            `:s}
      </div>
    `}get _renderFooter(){const e=[{icon:m(),label:this.t("loan-and-mortgage-origination-finance-line-cancellation-receipt-option-download"),id:"option-1"}];return o`
      <div class="receipt-footer">
        <bbva-button-row
          .options="${e}"
          ambient="primary-alt"
          accessibility-text=${this.t("loan-and-mortgage-origination-finance-line-cancellation-section-receipt-option-download-accessibility-text")}
        ></bbva-button-row>
      </div>
    `}render(){return this._receiptData.operationNumber?o`
          <div slot="slot-content" class="${d({"full-height":this.data.fullHeight})}">
            <div class="receipt-wrapper" ambient="primary-alt">
              ${qe._renderMicroIllustration}
              ${this._renderMain} ${this._renderFooter}
            </div>
          </div>
        `:s}}var je=a`
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
    .onboarding-wrapper
    [data-tag-name='bbva-clip-microillustration'] {
    margin: 1rem 0;
  }
  [data-tag-name='bbva-help-modal'] .onboarding-wrapper .modal-title {
    margin-bottom: 0.5rem;
  }
  [data-tag-name='bbva-help-modal'] .onboarding-wrapper .modal-text {
    margin-bottom: 1.5rem;
  }
  [data-tag-name='bbva-help-modal'] .onboarding-wrapper [data-tag-name='bbva-list-bullet'] {
    padding-left: 0;
    padding-right: 0;
  }
  [data-tag-name='bbva-help-modal'] .receipt-wrapper {
    margin-top: 1rem;
  }
  [data-tag-name='bbva-help-modal'] .receipt-wrapper .receipt-main {
    margin-top: 1rem;
  }
  [data-tag-name='bbva-help-modal'] .receipt-wrapper .receipt-main .receipt-title {
    margin-bottom: 2rem;
  }
  [data-tag-name='bbva-help-modal'] .receipt-wrapper .receipt-main .key-value-content {
    margin-top: 1rem;
    display: flex;
    justify-content: space-between;
  }
  [data-tag-name='bbva-help-modal'] .receipt-wrapper .receipt-main .key-value-content .flex1 {
    flex: 1;
  }
  [data-tag-name='bbva-help-modal'] .receipt-wrapper .receipt-main .key-value-content .flex2 {
    flex: 2;
  }
  [data-tag-name='bbva-help-modal'] .receipt-wrapper .receipt-footer {
    margin-top: 1.875rem;
  }
  [data-tag-name='bbva-help-modal'] [data-tag-name='bbva-button-default'] {
    margin-bottom: 1rem;
  }

  .restrictive-modals {
    --bbva-help-modal-footer-padding: 1rem;
  }

  .receipt-email-text {
    min-width: 0;
  }
`;class Fe extends(S(C(g(_(i))))){static get is(){return"loan-and-mortgage-origination-finance-line-cancellation-section"}static get scopedElements(){const e=[$,O,w,k,z,I];return Fe.scopedElementsFromClasses(e)}static get properties(){return{visible:{type:Boolean,reflect:!0},data:{type:Object},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"},resetContentScroll:{type:Boolean,reflect:!0,attribute:"reset-content-scroll"},onBoardingPart:{type:Object,attribute:"on-boarding-part"},receiptPart:{type:Object,attribute:"receipt-part"},headerButtons:{type:Array,attribute:"header-buttons"}}}_initialDataConfig(e={}){const t=()=>null;this.data={mode:"",buttonKey:"",linkKey:"",linkText:"",bodyKey:"",panelTextKey:"",titleKey:"",panelHeadingKey:"",modalTitleKey:"",linkPanelTextKey:"",headerTextKey:"",modalType:"",className:"",iOSFixed:!1,microillustration:"error",fullHeight:!1,hidePrimaryButton:!1,iconRightPrimary:"",iconRightSecondary:"",iconLeftPrimary:"",iconLeftSecondary:"",titleIcon:"",headerType:"",accessibilityTextIconLeftPrimary:"",accessibilityTextIconLeftSecondary:"",accessibilityTextIconRightPrimary:"",accessibilityTextIconRightSecondary:"",messageGroup:[],headerRightPrimaryClick:t,headerRightSecondaryClick:t,headerLeftPrimaryClick:t,headerLeftSecondaryClick:t,swipeClose:t,footerButtonClick:t,footerLinkClick:t,panelLinkClick:t,modalClicked:t,closeModalElements:["footer-button","footer-link","header-right-primary"],disabledButton:!1,phoneError:!1,...e}}static get styles(){return[je,T.primaryAlt,x.primaryAlt,R.primaryAlt,W.primaryAlt,E.primaryAlt,v("loan-and-mortgage-origination-finance-line-cancellation-shared-styles")]}constructor(){super(),this.visible=!1,this.iOSFixedHeader=!1,this.preventToUpdate=!1,this.resetContentScroll=!1,this.onBoardingPart=new Be(this),this.receiptPart=new qe(this),this._initialDataConfig(),this.headerButtons=[{id:"btn-close",name:"Close",icon:b(),accessibilityText:"loan-and-mortgage-origination-finance-line-cancellation-header-accessibility-key"}]}shouldUpdate(){return!this.preventToUpdate}updated(e){var t,i;super.updated(e),null===(t=this._part)||void 0===t||null===(i=t.updated)||void 0===i||i.call(t,e)}get _part(){var e;const t={onboarding:this.onBoardingPart,receiptModal:this.receiptPart};return null==t?void 0:t[null===(e=this.data)||void 0===e?void 0:e.mode]}get _content(){var e,t;return(null===(e=this._part)||void 0===e||null===(t=e.render)||void 0===t?void 0:t.call(e))||s}_changeVisible({detail:e}){var t,i,n,a;(this.visible=e,e)?(this._initialDataConfig(this.data),null===(t=this._part)||void 0===t||null===(i=t.init)||void 0===i||i.call(t)):null===(n=this._part)||void 0===n||null===(a=n.reset)||void 0===a||a.call(n)}get _modalContainer(){var e,t,i,n,a,s,r,l,d,c,h,u,p,m,g,_,v,b,f,y,S,C,T,x,R,E,$,O,w,k,I,A,M,D,L,N,P;return o`
      <bbva-help-modal
        ?visible=${this.visible}
        class="${null===(e=this.data)||void 0===e?void 0:e.className}"
        aria-label="${null!==(t=this.data)&&void 0!==t&&t.fullHeight?this.t(null===(i=this.data)||void 0===i?void 0:i.headerTextKey):""}"
        .headerText="${this.t(null===(n=this.data)||void 0===n?void 0:n.headerTextKey,"")}"
        .headerType="${null===(a=this.data)||void 0===a?void 0:a.headerType}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader&&this.data.iOSFixed}"
        @help-modal-header-click="${null===(s=this.data)||void 0===s?void 0:s.headerClick}"
        @help-modal-header-right-primary-click="${null===(r=this.data)||void 0===r?void 0:r.headerRightPrimaryClick}"
        @help-modal-header-left-right-secondary="${null===(l=this.data)||void 0===l?void 0:l.headerRightSecondaryClick}"
        @help-modal-header-left-primary-click="${null===(d=this.data)||void 0===d?void 0:d.headerLeftPrimaryClick}"
        @help-modal-header-left-secondary-click="${null===(c=this.data)||void 0===c?void 0:c.headerLeftSecondaryClick}"
        @help-modal-swipe-close="${null===(h=this.data)||void 0===h?void 0:h.swipeClose}"
        @click="${null===(u=this.data)||void 0===u?void 0:u.modalClicked}"
        .iconRightPrimary="${null===(p=this.data)||void 0===p?void 0:p.iconRightPrimary}"
        .iconRightSecondary="${null===(m=this.data)||void 0===m?void 0:m.iconRightSecondary}"
        .iconLeftPrimary="${null===(g=this.data)||void 0===g?void 0:g.iconLeftPrimary}"
        .iconLeftSecondary="${null===(_=this.data)||void 0===_?void 0:_.iconLeftSecondary}"
        .accessibilityTextIconLeftPrimary="${null===(v=this.data)||void 0===v?void 0:v.accessibilityTextIconLeftPrimary}"
        .accessibilityTextIconLeftSecondary="${null===(b=this.data)||void 0===b?void 0:b.accessibilityTextIconLeftSecondary}"
        .accessibilityTextIconRightPrimary="${null===(f=this.data)||void 0===f?void 0:f.accessibilityTextIconRightPrimary}"
        .accessibilityTextIconRightSecondary="${null===(y=this.data)||void 0===y?void 0:y.accessibilityTextIconRightSecondary}"
        data-selector="${`modal-${null===(S=this.data)||void 0===S?void 0:S.mode}`}"
        @visible-changed=${this._changeVisible}
        ?fixed-footer=${null===(C=this.data)||void 0===C?void 0:C.fixedFooter}
        modal-type=${null===(T=this.data)||void 0===T?void 0:T.modalType}
        title-icon="${null===(x=this.data)||void 0===x?void 0:x.titleIcon}"
        .titleText="${null===(R=this.data)||void 0===R?void 0:R.titleKey}"
        .bodyText=${this.t(null===(E=this.data)||void 0===E?void 0:E.bodyKey,{br:e=>o`
              <br />${e}
            `})}
        .subtitleText="${this.t(null===($=this.data)||void 0===$?void 0:$.subtitleKey)}"
        .buttonText="${this.t(null===(O=this.data)||void 0===O?void 0:O.buttonKey)}"
        .linkText="${this.t(null===(w=this.data)||void 0===w?void 0:w.linkKey)}"
        .closeModalElements="${null===(k=this.data)||void 0===k?void 0:k.closeModalElements}"
        ?hide-content-padding-top="${null===(I=this.data)||void 0===I?void 0:I.hideContentPaddingTop}"
        ?full-height="${null===(A=this.data)||void 0===A?void 0:A.fullHeight}"
        @help-modal-footer-button-click=${null===(M=this.data)||void 0===M?void 0:M.footerButtonClick}
        @help-modal-footer-link-click=${null===(D=this.data)||void 0===D?void 0:D.footerLinkClick}
        @help-modal-veil-click=${null===(L=this.data)||void 0===L?void 0:L.veilClick}
        ?disabled-button=${null===(N=this.data)||void 0===N?void 0:N.disabledButton}
        ?reset-content-scroll="${this.resetContentScroll}"
        .headerButtons=${(null===(P=this.data)||void 0===P?void 0:P.headerButtons)||this.headerButtons}
      >
        ${this._slotContent}
      </bbva-help-modal>
    `}get _slotContent(){return o`
      ${this._content}
    `}render(){return o`
      ${this._modalContainer}
    `}}const Ke=f((e=>class extends e{static get properties(){return{_multiStepsInitialConfig:{type:Object},_multiStepsConfig:{type:Object},_multiStepsVisible:{type:Boolean},_hasAllStepsCompleted:{type:Boolean},_firstAnimationEnd:{type:Boolean}}}constructor(){super(),this._multiStepsInitialConfig={},this._multiStepsConfig={},this._multiStepsVisible=!1,this._hasAllStepsCompleted=!1,this._firstAnimationEnd=!1}_configureSteps(){var e;this._multiStepsInitialConfig={stepSelector:'[data-tag-name="bbva-expandable-step"]',buttonSelector:".button-action",hideDisabledSteps:!0,scrollToStepIndex:-1,summary:{part:new De(e=this)},steps:[{mode:"data",parts:{collapsed:new we(e)},config:{id:"prefilled-step",prefilled:!0,header:e.t(`${e.constructor.is}-data-step-header`),hidePaddingTop:!0}},{mode:"reasons",parts:{opened:new ke(e),collapsed:new Ie(e)},config:{id:"step-1",step:1,currentStepLabel:"loan-and-mortgage-origination-finance-line-cancellation-expandable-step-heading",header:"loan-and-mortgage-origination-finance-line-cancellation-reasons-step-header",editLabel:"loan-and-mortgage-origination-finance-line-cancellation-reasons-edit",viewLabel:"",showLink:!0,disabled:!0,hidePaddingRight:!0,hidePaddingLeft:!0,hidePaddingTop:!0}},{mode:"detail",parts:{opened:new Ae(e),collapsed:new Me(e)},config:{id:"step-2",step:2,currentStepLabel:"loan-and-mortgage-origination-finance-line-cancellation-expandable-step-heading",header:"loan-and-mortgage-origination-finance-line-cancellation-detail-step-header",editLabel:"loan-and-mortgage-origination-finance-line-cancellation-detail-edit",viewLabel:"",showLink:!0,disabled:!0,hidePaddingTop:!0}}]},this._multiStepsConfig=this._composeMultiStepConfig(),setTimeout((()=>{this._multiStepsVisible=!0}),0)}_resetMultiStep(){this._multiStepsVisible=!1,this._firstAnimationEnd=!1,this._multiStepsConfig=[]}_composeMultiStepConfig(){var e,t,i,n,a,s,o,r;return{stepSelector:null===(e=this._multiStepsInitialConfig)||void 0===e?void 0:e.stepSelector,buttonSelector:null===(t=this._multiStepsInitialConfig)||void 0===t?void 0:t.buttonSelector,stepsToReset:null===(i=this._multiStepsInitialConfig)||void 0===i?void 0:i.stepsToReset,hideDisabledSteps:null===(n=this._multiStepsInitialConfig)||void 0===n?void 0:n.hideDisabledSteps,hideAnimation:null===(a=this._multiStepsInitialConfig)||void 0===a?void 0:a.hideAnimation,scrollToStepIndex:null===(s=this._multiStepsInitialConfig)||void 0===s?void 0:s.scrollToStepIndex,steps:null===(o=this._multiStepsInitialConfig)||void 0===o||null===(r=o.steps)||void 0===r?void 0:r.map((e=>({mode:null==e?void 0:e.mode,config:{...Le,...null==e?void 0:e.config}})))}}_findMultiStepIndex(e){var t,i,n;return null===(t=this._multiStepsConfig)||void 0===t||null===(i=t.steps)||void 0===i||null===(n=i.findIndex)||void 0===n?void 0:n.call(i,(t=>t.mode===e))}_setMultiStepProp(e,t,i){const n=this._findMultiStepIndex(e),a={...this._multiStepsConfig};n>=0&&(a.steps[n].config[t]=i,this._multiStepsConfig=a)}_getMultiStepConfig(e){var t,i;const n=this._findMultiStepIndex(e);return null===(t=this._multiStepsConfig.steps)||void 0===t||null===(i=t[n])||void 0===i?void 0:i.config}_getMultiStepProp(e,t){const i=this._getMultiStepConfig(e);return null==i?void 0:i[t]}_getMultiStepParts(e){var t,i,n;const a=this._findMultiStepIndex(e);return null===(t=this._multiStepsInitialConfig)||void 0===t||null===(i=t.steps)||void 0===i||null===(n=i[a])||void 0===n?void 0:n.parts}_renderStep(e){var t,i;const n=null==e?void 0:e.config,a=null===(t=this._multiStepsConfig)||void 0===t||null===(i=t.steps)||void 0===i?void 0:i.length,s=n.totalSteps||a||1;return o`
          <bbva-expandable-step
            id="${n.id}"
            step="${n.step}"
            total-steps="${s}"
            current-step-label="${n.currentStepLabel}"
            edit-label="${n.editLabel}"
            view-label="${n.viewLabel}"
            header="${this.t(n.header)}"
            button-text="${n.buttonText}"
            ?prefilled="${n.prefilled}"
            ?show-link="${n.showLink}"
            ?completed="${n.completed}"
            ?disabled="${n.disabled}"
            ?hide-padding-right="${n.hidePaddingRight}"
            ?hide-padding-left="${n.hidePaddingLeft}"
            ?hide-padding-top="${n.hidePaddingTop}"
            ?disable-on-previous-step-edit="${n.disableOnPreviousStepEdit}"
            @expandable-step-complete-change="${t=>this._completeChanged(null==t?void 0:t.detail,e)}"
            @expandable-step-edit-step="${()=>this._editStep(e)}"
          >
            ${this._renderStepParts(e)}
          </bbva-expandable-step>
        `}_renderMultistepSummary(){var e,t,i,n;return(null===(e=this._multiStepsInitialConfig)||void 0===e||null===(t=e.summary)||void 0===t||null===(i=t.part)||void 0===i||null===(n=i.render)||void 0===n?void 0:n.call(i))||s}_renderMultiStep(){var e,t,i;const n=(null===(e=this._multiStepsConfig)||void 0===e?void 0:e.stepSelector)||"bbva-expandable-step",a=(null===(t=this._multiStepsConfig)||void 0===t?void 0:t.buttonSelector)||'[data-tag-name="bbva-button-default"]',r=(null===(i=this._multiStepsConfig)||void 0===i?void 0:i.stepsToReset)||[];var l,d,c,h,u;return this._multiStepsVisible?o`
            <bbva-expandable-multistep
              step-selector="${n}"
              button-selector="${a}"
              .stepsToReset="${r}"
              @expandable-multistep-specific-step-scroll="${e=>this._multistepScrollingSpecificStep.call(this,e.detail)}"
              ?hide-disabled-steps="${null===(l=this._multiStepsConfig)||void 0===l?void 0:l.hideDisabledSteps}"
              ?hide-animation="${null===(d=this._multiStepsConfig)||void 0===d?void 0:d.hideAnimation}"
              scroll-to-step-index="${null===(c=this._multiStepsConfig)||void 0===c?void 0:c.scrollToStepIndex}"
              @expandable-multistep-scroll-animation-end="${e=>this._checkAnimationEnd(e)}"
              @expandable-multistep-all-complete="${e=>{this._checkAllStepsCompleted(e.detail)}}"
            >
              <div slot="content">
                ${null===(h=this._multiStepsConfig)||void 0===h||null===(u=h.steps)||void 0===u?void 0:u.map((e=>this._renderStep(e)))}
              </div>

              <div class="confirmation-summary" slot="confirmation">
                ${this._renderMultistepSummary()}
              </div>
            </bbva-expandable-multistep>
          `:s}_checkAnimationEnd(e){!this._firstAnimationEnd&&e&&(this._firstAnimationEnd=!0,setTimeout((()=>{this.shadowRoot.getElementById("step-1").scrollIntoView({block:"nearest"})}),100))}_multistepScrollingSpecificStep(e){var t;const i=null!=e&&e.completed?Pe:Ne;null==this||null===(t=this._setHeaderVariant)||void 0===t||t.call(this,i)}_checkAllStepsCompleted(e){var t;e&&(null==this||null===(t=this._setHeaderVariant)||void 0===t||t.call(this,Pe));this._hasAllStepsCompleted=e,this._checkVisibleSteps(this._multiStepsConfig.steps)}_renderStepParts(e){const t=this._getMultiStepParts(null==e?void 0:e.mode),i=[];var n,a,s,r,l,d;null!=t&&t.opened&&i.push(o`
            <div class="content">
              ${null!=e&&null!==(n=e.config)&&void 0!==n&&n.edited&&null!=t&&t.edited?null==t||null===(a=t.edited)||void 0===a||null===(s=a.render)||void 0===s?void 0:s.call(a):null==t||null===(r=t.opened)||void 0===r||null===(l=r.render)||void 0===l?void 0:l.call(r)}
            </div>
          `);null!=t&&t.collapsed&&i.push(o`
            <div class="summary" slot="summary">${null==t||null===(d=t.collapsed)||void 0===d?void 0:d.render()}</div>
          `);return i}_editStep(e){this._hasSpecificStepItemFocus=!1,this._setMultiStepProp(null==e?void 0:e.mode,"edited",!0)}_completeChanged(e,t){this._hasSpecificStepItemFocus=!1,this._setMultiStepProp(null==t?void 0:t.mode,"completed",e),e&&this._setMultiStepProp(null==t?void 0:t.mode,"edited",!1)}}));var Ve=a`
  :host {
    --_loan-and-mortgage-origination-finance-line-cancellation-confirmation-bg: var(
      --loan-and-mortgage-origination-finance-line-cancellation--_ambient--confirmation-bg,
      var(
        --loan-and-mortgage-origination-finance-line-cancellation--custom--primary-ambient--confirmation-bg,
        ${A("colorPrimarySurfaceAmbientDefault",M)}
      )
    );
  }
`;class Ue extends(S(C(g(_(Ke(i)))))){static get is(){return"loan-and-mortgage-origination-finance-line-cancellation"}static get scopedElements(){const e=[X,be,Fe,Ke,J,Q,H,O,Z,B,q,te,j,F,K,fe];return Ue.scopedElementsFromClasses(e)}static get properties(){return{cancellationReasons:{type:Array,attribute:"cancellation-reasons"},customerEmail:{type:String,attribute:"customer-email"},customerId:{type:String,attribute:"customer-id"},customersApiVersion:{type:String,attribute:"customers-api-version"},disposedBalance:{type:String,attribute:"disposed-balance"},financingLine:{type:Object,attribute:"financing-line"},financingLineId:{type:String,attribute:"financing-line-id"},flexibleFinancingsApiVersion:{type:String,attribute:"flexible-financings-api-version"},grantedAmount:{type:String,attribute:"granted-amount"},maxRetries:{type:Number,attribute:"max-retries"},overdueBalance:{type:String,attribute:"overdue-balance"},pageName:{type:String,attribute:"page-name"},chargeAccount:{type:String,attribute:"charge-account"},disableCallBbva:{type:Boolean,attribute:"disable-call-bbva"},statusId:{type:String,attribute:"status-id"},substatusId:{type:String,attribute:"substatus-id"},userPhone:{type:String,attribute:"user-phone"},notificationChar:{type:String,attribute:"notification-char"},visibleNotificationChars:{type:Number,attribute:"visible-notification-chars"},_cancellationReason:{type:Object},_errorCounter:{type:Number},_iOSDevices:{type:Array},_modalData:{type:Object},_receiptData:{type:Object},_showConfirmLeaveModal:{type:Boolean},_showErrorRetryModal:{type:Boolean},_showMaximumErrorRetryModal:{type:Boolean},_showOnboarding:{type:Boolean},_showOutstandingModal:{type:Boolean},_showOverdueModal:{type:Boolean},_showReceipt:{type:Boolean},_userEmail:{type:String}}}constructor(){var e;super(),this.cancellationReasons=[{id:"DATE_NOT_FLEXIBLE",text:"loan-and-mortgage-origination-finance-line-cancellation-reasons-date-not-flexible"},{id:"HIGH_FEE",text:"loan-and-mortgage-origination-finance-line-cancellation-reasons-high-fee"},{id:"LOW_LIMIT",text:"loan-and-mortgage-origination-finance-line-cancellation-reasons-low-limit"},{id:"COMPLICATED_PAYMENT",text:"loan-and-mortgage-origination-finance-line-cancellation-reasons-complicated-payment"},{id:"OTHER",text:"loan-and-mortgage-origination-finance-line-cancellation-reasons-other"}],this.config.loader=He(this).main.loader,this.customerEmail="",this.customerId="",this.customersApiVersion="0",this.disposedBalance="DISPOSED_BALANCE",this.financingLine={},this.financingLineId="",this.flexibleFinancingsApiVersion="0",this.grantedAmount="GRANTED_AMOUNT",this.maxRetries=3,this.overdueBalance="OVERDUE_BALANCE",this.pageName="",this.chargeAccount="CHARGE_ACCOUNT",this.statusId="ACTIVE",this.substatusId="DELINQUENCY",this.userPhone="",this._cancellationReason={},this._errorCounter=0,this._iOSDevices=["iOS","iPhone"],this._modalData={on_boarding:{mode:"onboarding",closeModalElements:["header","footer-button"],fullHeight:!0,headerType:"modal",headerTextKey:!0,modalTitleKey:!0,modalMessageKey:!0,buttonKey:!0,linkKey:!0,titleIcon:"",hideContentPaddingTop:!0,modalBenefits:[(e=this).t(`${e.constructor.is}-onboarding-first-benefit`),e.t(`${e.constructor.is}-onboarding-second-benefit`),e.t(`${e.constructor.is}-onboarding-third-benefit`),e.t(`${e.constructor.is}-onboarding-fourth-benefit`)],footerButtonClick:e._confirmOnboarding.bind(e),veilClick:e._manageBackNavigation.bind(e),footerLinkClick:e._cancelOnbording.bind(e)},outstanding_balances:{mode:"outstandingBalances",closeModalElements:["header"],modalType:"caution",fixedFooter:!0,headerTextKey:!0,modalTitleKey:!0,modalMessageKey:!0,bodyKey:!0,titleKey:!0,buttonKey:!0,titleIcon:r(),className:"restrictive-modals",fullHeight:!1,footerButtonClick:e._confirmOutstandingBalances.bind(e),veilClick:e._goToBack.bind(e)},overdue_payments:{mode:"overduePayments",closeModalElements:["header"],modalType:"caution",fixedFooter:!0,headerTextKey:!0,modalTitleKey:!0,modalMessageKey:!0,bodyKey:!0,titleKey:!0,buttonKey:!0,titleIcon:r(),className:"restrictive-modals",fullHeight:!1,footerButtonClick:e._confirmOverduePayments.bind(e),veilClick:e._goToBack.bind(e)},receipt_modal:{mode:"receiptModal",className:"",closeModalElements:["header"],fullHeight:!0,fixedFooter:!1,headerType:"modal",headerTextKey:!0,modalTitleKey:!0,titleIcon:"",buttonKey:!1,linkKey:!1,hideContentPaddingTop:!0},error_retry_modal:{mode:"errorRetryModal",closeModalElements:["header","footer-link"],modalType:"warning",headerTextKey:!0,modalTitleKey:!0,modalMessageKey:!0,bodyKey:!0,titleKey:!0,buttonKey:!0,titleIcon:l(),fullHeight:!1,linkKey:!0,veilClick:e._manageBackNavigation.bind(e),footerButtonClick:e._retryApiCall.bind(e),footerLinkClick:e._manageBackNavigation.bind(e)},error_maximum_retries_modal:{mode:"errorMaximumRetriesModal",closeModalElements:["header","footer-link"],modalType:"warning",fixedFooter:!0,headerType:"modal",headerTextKey:!0,modalTitleKey:!0,modalMessageKey:!0,bodyKey:!0,titleKey:!0,buttonKey:!0,titleIcon:l(),fullHeight:!0,linkKey:!0,veilClick:e._manageBackNavigation.bind(e),footerButtonClick:e._callToBank.bind(e),footerLinkClick:e._manageBackNavigation.bind(e)},error_maximum_retries_modal_disable_call_bbva:{mode:"errorMaximumRetriesModalDisableCallBbva",closeModalElements:["header","footer-link"],modalType:"warning",fixedFooter:!0,headerType:"modal",headerTextKey:!0,modalTitleKey:!0,modalMessageKey:!0,bodyKey:!0,titleKey:!0,buttonKey:!0,titleIcon:l(),fullHeight:!0,veilClick:e._manageBackNavigation.bind(e),footerButtonClick:e._manageBackNavigation.bind(e)},confirm_leave:{mode:"confirmLeave",closeModalElements:["header","footer-link"],modalType:"caution",headerTextKey:!0,modalTitleKey:!0,modalMessageKey:!0,bodyKey:!0,buttonKey:!0,titleIcon:r(),fullHeight:!1,linkKey:!0,veilClick:e._manageBackNavigation.bind(e),footerButtonClick:e._confirmLeaveExit.bind(e),footerLinkClick:e._manageBackNavigation.bind(e)}},this._receiptData={},this._showConfirmLeaveModal=!1,this._showErrorRetryModal=!1,this._showMaximumErrorRetryModal=!1,this._showOnboarding=!1,this._showOutstandingModal=!1,this._showOverdueModal=!1,this._showReceipt=!1,this._userEmail="",this.notificationChar="•",this.visibleNotificationChars=4,this.disableCallBbva=!1}static get styles(){return[Se,T.primaryAlt,Y.primaryAlt,D.primaryAlt,L.primaryAlt,ee.primaryAlt,N.primaryAlt,P.primaryAlt,Ve,v("loan-and-mortgage-origination-finance-line-cancellation-shared-styles")]}reset(){this._showOnboarding=!1,this._showOutstandingModal=!1,this._showOverdueModal=!1,this._showMaximumErrorRetryModal=!1,this._showErrorRetryModal=!1,this._showConfirmLeaveModal=!1,this._showReceipt=!1,this._resetMultiStep(),this._errorCounter=0,this._cancellationReason={},this.financingLine={},this.financingLineId="",this.config={loader:He(this).main.loader}}updated(e){e.has("financingLineId")&&this.financingLineId&&this._getFinancingLine(),e.has("customerId")&&this.customerId&&this._getCustomerContactDetails(),e.has("financingLine")&&Object.keys(this.financingLine).length&&this._handleFinancingLineView(),super.updated(e)}firstUpdated(){super.firstUpdated&&super.firstUpdated(),this._financingLineDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-financing-line-api-dm"]'),this._contactDetailDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-customer-contact-details-api-dm"]')}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._handleHeaderBack()}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this._removeHeaderBack()}_handleHeaderBack(){this.addEventListener("header-main-icon-click",this._manageBackNavigation.bind(this),!0)}_removeHeaderBack(){this.removeEventListener("header-main-icon-click",this._manageBackNavigation.bind(this),!0)}_setHeaderVariant(e){this.config={...this.config,header:{...this.config.header,variant:e}}}hideSpinner(){this.clearLoader(),this.config.loader={visible:!1}}_showSpinner(){this.showLoader(),this.config.loader={visible:!0}}_getFinancingLine(){this._showSpinner(),this._financingLineDm.getFinancingLine(this.financingLineId)}_getCustomerContactDetails(){this._contactDetailDm.getCustomerContactDetails(this.customerId)}_handleFinancingLineSuccess(e){this._errorCounter=0,this.financingLine=null==e?void 0:e.detail}_handleFinancingLineView(){var e,t,i,n,a;this.hideSpinner();const s=e=>{var t,i;return null===(t=this.financingLine)||void 0===t||null===(i=t.balances)||void 0===i?void 0:i.find((t=>(null==t?void 0:t.id)===e))},o=e=>{var t;return null==e||null===(t=e.amounts)||void 0===t?void 0:t.find((e=>(null==e?void 0:e.amount)>0))},r=o(s(this.disposedBalance)),l=(null===(e=this.financingLine)||void 0===e||null===(t=e.status)||void 0===t?void 0:t.id)===this.statusId&&(null===(i=this.financingLine)||void 0===i||null===(n=i.status)||void 0===n||null===(a=n.subStatus)||void 0===a?void 0:a.id)===this.substatusId&&o(s(this.overdueBalance));let d="";void 0===r||l?l?(this._showOverdueModal=!0,d="overdue"):(this._showOnboarding=!0,d="onboarding"):(this._showOutstandingModal=!0,d="outstanding"),this._dispatch(`${Ue.is}-${d}-modal-visible`)}_handleFinancingLineError(){this._manageError(this._getFinancingLine)}_handleFinancingLineDeleteError(){this._manageError(this._deleteFinancingLine)}_manageError(e){this.hideSpinner(),this._errorMethod=e,this._showErrorModal()}_showErrorModal(){this._errorCounter<this.maxRetries?this._showErrorRetryModal=!0:(this._dispatch(`${Ue.is}-maximum-error-modal-visible`),this._showMaximumErrorRetryModal=!0),this._errorCounter+=1}_retryApiCall(){this._showErrorRetryModal=!1,this._errorMethod()}_callToBank(){this._dispatch(`${Ue.is}-call-to-bank`,{value:this.userPhone})}_cancelOnbording(){this._dispatch(`${Ue.is}-onboarding-modal-link-click`),this._manageBackNavigation()}_manageBackNavigation(){var e;this._isOpenedErrorModal&&this._multiStepsVisible?this._closeErrorModal():null===(e=this._cancellationReason)||void 0===e||!e.id||this._showConfirmLeaveModal||this._showReceipt?this._goToBack():this._showConfirmLeaveModal=!0}nativeBackNavigation(e){var t,i,n,a;(null==e||null===(t=e.value)||void 0===t||null===(i=t.cancelledNavigation)||void 0===i?void 0:i.currentPage)!==this.pageName||null!==(n=this.config)&&void 0!==n&&null!==(a=n.loader)&&void 0!==a&&a.visible||this._manageBackNavigation()}_receiptResult(){var e,t,i,n,a,s,o,r,l;return{templateSelected:"loanMortgageOriginationFinanceLineCancellation",operationDate:{key:this.t("loan-and-mortgage-origination-finance-line-cancellation-receipt-operation-date-text"),value:null===(e=this._receiptData)||void 0===e?void 0:e.date},operationAccount:{key:this.t("loan-and-mortgage-origination-finance-line-cancellation-receipt-associated-account-text"),value:null===(t=this._receiptData)||void 0===t?void 0:t.account},operationType:{key:this.t("loan-and-mortgage-origination-finance-line-cancellation-receipt-operation-type-text"),value:this.t(`loan-and-mortgage-origination-finance-line-cancellation-receipt-${null===(i=this._receiptData)||void 0===i?void 0:i.operationType}-value`,{productName:null===(n=this._receiptData)||void 0===n?void 0:n.productName})},operationNumber:{key:this.t(`loan-and-mortgage-origination-finance-line-cancellation-receipt-${null===(a=this._receiptData)||void 0===a?void 0:a.operationType}-text`,{productName:null===(s=this._receiptData)||void 0===s?void 0:s.productName}),value:null===(o=this._receiptData)||void 0===o?void 0:o.number},operationDetail:{key:this.t("loan-and-mortgage-origination-finance-line-cancellation-receipt-reason-text"),value:null===(r=this._receiptData)||void 0===r?void 0:r.reason},operationInvoiceNumber:{key:this.t("loan-and-mortgage-origination-finance-line-cancellation-receipt-operation-folio-text"),value:null===(l=this._receiptData)||void 0===l?void 0:l.operationNumber}}}_confirmLeaveExit(){this._showConfirmLeaveModal=!1,this._cancellationReason={},this._manageBackNavigation()}get _isOpenedErrorModal(){return this._showErrorRetryModal||this._showMaximumErrorRetryModal||this._showConfirmLeaveModal}_closeErrorModal(){this._showErrorRetryModal=!1,this._showMaximumErrorRetryModal=!1,this._showConfirmLeaveModal=!1}_handleContactDetailSuccess(e){var t,i;const n=null==e?void 0:e.detail,a=null==n||null===(t=n.find)||void 0===t?void 0:t.call(n,(e=>{var t,i;return(null==e||null===(t=e.contact)||void 0===t?void 0:t.receivesNotifications)&&"EMAIL"===(null==e||null===(i=e.contact)||void 0===i?void 0:i.contactDetailType)}));this._userEmail=(null==a||null===(i=a.contact)||void 0===i?void 0:i.address)||this.customerEmail;const s=this._userEmail.indexOf("@");if(-1!==s){const e=this._userEmail.substring(s-3,this._userEmail.length);this._userEmail=`•${e.toLocaleLowerCase()}`}else this._userEmail=""}_handleContactDetailError(){this._userEmail=""}get _onBoardingConfig(){return xe(this._modalData.on_boarding,this._modalData.on_boarding.mode)}get _outstandingBalancesConfig(){return xe(this._modalData.outstanding_balances,this._modalData.outstanding_balances.mode)}get _overduePaymentsConfig(){return xe(this._modalData.overdue_payments,this._modalData.overdue_payments.mode)}get _receiptConfig(){return{...xe(this._modalData.receipt_modal,this._modalData.receipt_modal.mode),receiptData:{...this._receiptData,language:this.language,localCurrency:this.localCurrency}}}_handleButtonRowClick(){this._dispatch(`${Ue.is}-share-receipt-operative`,{operative:"loanMortgageOriginationFinanceLineCancellation"}),this._dispatch(`${Ue.is}-share-receipt-result`,this._receiptResult())}_confirmOnboarding(){this._dispatch(`${Ue.is}-onboarding-modal-button-click`),this._configureMultiStep(),this._showOnboarding=!1}_configureMultiStep(){this.config.header=He(this).main.header,this._configureSteps()}_confirmOutstandingBalances(){this._showOutstandingModal=!1,this._dispatch(`${Ue.is}-navigate-financing-dashboard`,{financingLineId:this.financingLineId,operativeId:"advancePayment"})}_confirmOverduePayments(){this._showOverdueModal=!1,this._dispatch(`${Ue.is}-navigate-overdue-payments`,{financingLineId:this.financingLineId,operativeId:"overdue"})}_goToBack(){this._dispatch(`${Ue.is}-go-to-back`),this.reset()}_dispatch(e,t=null){Re(this,e,t)}getDeviceInfo(){var e,t,i,n,a,s,o;return null===(e=window)||void 0===e||null===(t=e.navigator)||void 0===t||null===(i=t.userAgent)||void 0===i||null===(n=i.match)||void 0===n||null===(a=n.call(i,this._userAgentRegex))||void 0===a||null===(s=a[1])||void 0===s||null===(o=s.split)||void 0===o?void 0:o.call(s,";")}get _shouldDisplayIOSFixedHeader(){var e,t;const i=this.getDeviceInfo();return this.iOSFixedHeader&&(null===(e=this._iOSDevices)||void 0===e||null===(t=e.includes)||void 0===t?void 0:t.call(e,null==i?void 0:i[0]))}get _fixedIOSHeader(){return o`
      <div ?hidden="${!this._shouldDisplayIOSFixedHeader}" class="native-fixed-header"></div>
    `}_deleteFinancingLine(){this._showSpinner(),this._financingLineDm.deleteFinancingLine(this.financingLineId)}_handleFinancingLineUpdateSuccess({detail:e}){var t;this._receiptData=this._parseLineUpdateResponse(e),this._showReceipt=!0,this.hideSpinner(),this._dispatch(`${Ue.is}-receipt-visible`,{operationNumber:null===(t=this._receiptData)||void 0===t?void 0:t.operationNumber})}_parseLineUpdateResponse(e){var t,i,n,a,s;return{date:Ee(null==e||null===(t=e.operationTracking)||void 0===t?void 0:t.operationDate),account:this._getAccountData(null==e?void 0:e.relatedContracts),operationType:(null==e||null===(i=e.operationTracking)||void 0===i?void 0:i.operationType)||"CONTRACT_TERMINATION",productName:this._subproductName,number:y(null==e||null===(n=e.contract)||void 0===n?void 0:n.number,this.notificationChar,!0,this.visibleNotificationChars),reason:null===(a=this._cancellationReason)||void 0===a?void 0:a.text,operationNumber:null==e||null===(s=e.operationTracking)||void 0===s?void 0:s.operationNumber,email:this._userEmail}}get _subproductName(){var e,t,i;return null===(e=this.financingLine)||void 0===e||null===(t=e.product)||void 0===t||null===(i=t.subproduct)||void 0===i?void 0:i.name}_getAccountData(e){const t=e.find((e=>{var t;return"INTERNAL_CONTRACT"===(null===(t=e.contractDetails)||void 0===t?void 0:t.contractType)})),{number:i}=t.contractDetails;var n;return`${(n=this._accountName).charAt(0).toUpperCase()+n.slice(1).toLowerCase()} ${y(i,this.notificationChar,!0,this.visibleNotificationChars)}`}static _onContinueButtonClick(e){Re(null==e?void 0:e.target,"complete",!0)}_renderDataInfo(){var e,t,i;return o`
      <div class="data-info-section">
        <div class="data-info-row">
          <bbva-type-text
            tag="span"
            ambient="secondary-alt"
            text=${this.t("loan-and-mortgage-origination-finance-line-cancellation-main-data-associated-account")}
            size="S"
          ></bbva-type-text>
          <bbva-badge-reference
            number=${this._accountNumber}
            ambient="secondary-alt"
          ></bbva-badge-reference>
        </div>
        <div class="data-info-row">
          <bbva-type-text
            tag="span"
            ambient="secondary-alt"
            text=${this.t("loan-and-mortgage-origination-finance-line-cancellation-main-data-line-limit")}
            size="S"
          ></bbva-type-text>
          <bbva-type-amount
            language="${this.language}"
            ambient="secondary-alt"
            variant="m"
            currency-code="${null===(e=this._financeAmount)||void 0===e?void 0:e.currency}"
            local-currency="${null===(t=this._financeAmount)||void 0===t?void 0:t.currency}"
            amount=${null===(i=this._financeAmount)||void 0===i?void 0:i.amount}
          ></bbva-type-amount>
        </div>
        <bbva-notification-help
          variant="info"
          ambient="secondary-alt"
          text="${this.t("loan-and-mortgage-origination-finance-line-cancellation-main-data-info-message")}"
        ></bbva-notification-help>
      </div>
    `}_reasonSelectedChange({target:e}){var t;this._cancellationReason=this.cancellationReasons.find((t=>(null==t?void 0:t.id)===(null==e?void 0:e.value))),this._dispatch(`${Ue.is}-selected-reason-change`,{selected:null===(t=this._cancellationReason)||void 0===t?void 0:t.id})}get _accountNumber(){var e,t;return null===(e=this.financingLine)||void 0===e||null===(t=e.relatedContracts)||void 0===t?void 0:t.reduce(((e,t)=>"INTERNAL_CONTRACT"===t.contractDetails.contractType&&t.relationType.id===this.chargeAccount?t.contractDetails.number:e),null)}get _accountName(){var e,t;return null===(e=this.financingLine)||void 0===e||null===(t=e.relatedContracts)||void 0===t?void 0:t.reduce(((e,t)=>{var i,n;return"INTERNAL_CONTRACT"===t.contractDetails.contractType&&t.relationType.id===this.chargeAccount?(null==t||null===(i=t.contractDetails)||void 0===i||null===(n=i.product)||void 0===n?void 0:n.name)||"":e}),null)}get _financeAmount(){var e,t;return null===(e=this.financingLine)||void 0===e||null===(t=e.specificAmounts)||void 0===t?void 0:t.reduce(((e,t)=>t.id===this.grantedAmount?null==t?void 0:t.amounts[0]:e),null)}get _lineCancellationDataCompleted(){return!!this._getMultiStepProp("data","completed")}_checkVisibleSteps(e){const t=e.find((e=>{var t;return!(null!=e&&null!==(t=e.config)&&void 0!==t&&t.completed)}));if(t){var i;const e={["detail"===t.mode]:{reason:this.t(null===(i=this._cancellationReason)||void 0===i?void 0:i.text)}};this._dispatch(`${Ue.is}-${t.mode}-step-visible`,(null==e?void 0:e.true)||null)}else this._dispatch(`${Ue.is}-summary-visible`)}get _renderReasons(){return this.cancellationReasons.map((e=>o`
        <bbva-form-radio-button
          name="choice"
          value=${null==e?void 0:e.id}
          @change="${e=>this._reasonSelectedChange(e)}"
          >${this.t(null==e?void 0:e.text)}
        </bbva-form-radio-button>
      `))}get _renderCancellationReasons(){var e;return o`
      <bbva-type-text
        class="reasons-message"
        tag="span"
        size="S"
        text="${this.t("loan-and-mortgage-origination-finance-line-cancellation-reasons-message")}"
      ></bbva-type-text>
      ${this._renderReasons}
      <div class="continue-button">
        <bbva-button-default
          fullwidth
          ?disabled=${!(null!==(e=this._cancellationReason)&&void 0!==e&&e.id)}
          text=${this.t("loan-and-mortgage-origination-finance-line-cancellation-continue")}
          @click="${e=>Ue._onContinueButtonClick(e)}"
        ></bbva-button-default>
      </div>
    `}get _renderCancellationDetail(){var e,t,i,n;return o`
      <bbva-type-text
        class="detail-message"
        tag="span"
        size="S"
        text="${this.t("loan-and-mortgage-origination-finance-line-cancellation-detail-message")}"
      ></bbva-type-text>
      <div class="detail-row">
        <bbva-type-text
          tag="span"
          size="S"
          text="${this.t("loan-and-mortgage-origination-finance-line-cancellation-detail-product-name")}"
        ></bbva-type-text>
        <bbva-type-text tag="span" size="S" text="${this._subproductName}"></bbva-type-text>
      </div>
      <div class="detail-row">
        <bbva-type-text
          tag="span"
          size="S"
          text="${this.t("loan-and-mortgage-origination-finance-line-cancellation-detail-line-limit")}"
        ></bbva-type-text>
        <bbva-type-amount
          language="${this.language}"
          variant="m"
          currency-code="${null===(e=this._financeAmount)||void 0===e?void 0:e.currency}"
          local-currency="${null===(t=this._financeAmount)||void 0===t?void 0:t.currency}"
          amount=${null===(i=this._financeAmount)||void 0===i?void 0:i.amount}
        ></bbva-type-amount>
      </div>
      <bbva-notification-message
        message-title="${this.t("loan-and-mortgage-origination-finance-line-cancellation-detail-notification-message")}"
        book-title=""
      ></bbva-notification-message>
      <div class="continue-button">
        <bbva-button-default
          fullwidth
          ?disabled=${!(null!==(n=this._cancellationReason)&&void 0!==n&&n.id)}
          text=${this.t("loan-and-mortgage-origination-finance-line-cancellation-continue")}
          @click="${e=>Ue._onContinueButtonClick(e)}"
        ></bbva-button-default>
      </div>
    `}get _renderCancellationReasonsCollapsed(){var e;return o`
      <bbva-type-text
        tag="span"
        size="S"
        text="${this.t(null===(e=this._cancellationReason)||void 0===e?void 0:e.text)}"
      ></bbva-type-text>
    `}get _renderCancellationDetailCollapsed(){return o`
      <div class="detail-row">
        <bbva-type-text
          tag="span"
          size="S"
          text="${this.t("loan-and-mortgage-origination-finance-line-cancellation-detail-product-name")}"
        ></bbva-type-text>
        <bbva-type-text tag="span" size="S" text="${this._subproductName}"></bbva-type-text>
      </div>
    `}get _renderSummary(){return o`
      <div class="summary-button">
        <bbva-button-default
          variant="positive"
          fullwidth
          text=${this.t("loan-and-mortgage-origination-finance-line-cancellation-summary-button-text")}
          @click=${()=>this._deleteFinancingLine()}
          ambient="primary-alt"
        >
        </bbva-button-default>
      </div>
    `}get _renderOnboardingModal(){return o`
      <loan-and-mortgage-origination-finance-line-cancellation-section
        ?visible="${this._showOnboarding}"
        .data="${this._onBoardingConfig}"
        mode="onboarding"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        reset-content-scroll
      ></loan-and-mortgage-origination-finance-line-cancellation-section>
    `}get _renderReceiptModal(){return o`
      <loan-and-mortgage-origination-finance-line-cancellation-section
        ?visible="${this._showReceipt}"
        .data="${this._receiptConfig}"
        mode="receiptModal"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        @button-row-item-click="${this._handleButtonRowClick}"
        reset-content-scroll
      ></loan-and-mortgage-origination-finance-line-cancellation-section>
    `}get _renderOutstandingModal(){return o`
      <loan-and-mortgage-origination-finance-line-cancellation-section
        ?visible="${this._showOutstandingModal}"
        mode="outstandingBalances"
        .data="${this._outstandingBalancesConfig}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        reset-content-scroll
      ></loan-and-mortgage-origination-finance-line-cancellation-section>
    `}get _renderOverduePaymentsModal(){return o`
      <loan-and-mortgage-origination-finance-line-cancellation-section
        ?visible="${this._showOverdueModal}"
        mode="overduePayments"
        .data="${this._overduePaymentsConfig}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        reset-content-scroll
      ></loan-and-mortgage-origination-finance-line-cancellation-section>
    `}get _renderErrorRetryModal(){return o`
      <loan-and-mortgage-origination-finance-line-cancellation-section
        ?visible="${this._showErrorRetryModal}"
        .data="${this._errorRetryModalConfig}"
        mode="errorRetryModal"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        reset-content-scroll
      ></loan-and-mortgage-origination-finance-line-cancellation-section>
    `}get _renderMaximumErrorRetriesModal(){return o`
      <loan-and-mortgage-origination-finance-line-cancellation-section
        ?visible="${this._showMaximumErrorRetryModal}"
        .data="${this._errorMaximumRetryModalConfig}"
        mode="${this._errorMaximumRetryModalConfig.mode}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        reset-content-scroll
      ></loan-and-mortgage-origination-finance-line-cancellation-section>
    `}get _renderConfirmLeaveModal(){return o`
      <loan-and-mortgage-origination-finance-line-cancellation-section
        ?visible="${this._showConfirmLeaveModal}"
        .data="${this._confirmLeaveConfig}"
        mode="confirmLeave"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        reset-content-scroll
      ></loan-and-mortgage-origination-finance-line-cancellation-section>
    `}get _finaningLineDmTemplate(){return o`
      <bbva-global-financing-line-api-dm
        .host="${this.host}"
        .version="${this.flexibleFinancingsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        requiredOtp
        @financing-line-api-dm-fetch="${this._handleFinancingLineSuccess}"
        @financing-line-api-dm-fetch-error="${this._handleFinancingLineError}"
        @financing-line-api-dm-delete="${this._handleFinancingLineUpdateSuccess}"
        @financing-line-api-dm-delete-error="${this._handleFinancingLineDeleteError}"
        @api-dm-error="${this._handleFinancingLineError}"
      >
      </bbva-global-financing-line-api-dm>
    `}get _contactDetailDmTemplate(){return o`
      <bbva-global-customer-contact-details-api-dm
        .host="${this.host}"
        .version="${this.customersApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @customer-contact-details-api-dm-fetch="${this._handleContactDetailSuccess}"
        @customer-contact-details-api-dm-fetch-error="${this._handleContactDetailError}"
        @api-dm-error="${this._handleContactDetailError}"
      >
      </bbva-global-customer-contact-details-api-dm>
    `}get _apisTemplates(){return o`
      ${this._finaningLineDmTemplate}${this._contactDetailDmTemplate}
    `}get _errorRetryModalConfig(){return xe(this._modalData.error_retry_modal,this._modalData.error_retry_modal.mode)}get _errorMaximumRetryModalConfig(){const e=this.disableCallBbva?this._modalData.error_maximum_retries_modal_disable_call_bbva:this._modalData.error_maximum_retries_modal;return xe(e,e.mode)}get _confirmLeaveConfig(){return xe(this._modalData.confirm_leave,this._modalData.confirm_leave.mode)}get _renderVisualContent(){return o`
      <div
        class="${d({"line-cancellation-container":!0,"all-completed":this._hasAllStepsCompleted,"data-step-completed":this._lineCancellationDataCompleted})}"
      >
        ${this._renderMultiStep()}
      </div>
    `}render(){return o`
      ${this._fixedIOSHeader} ${super.render()} ${this._apisTemplates} ${this._renderVisualContent}
      ${this._renderOnboardingModal} ${this._renderOutstandingModal}
      ${this._renderOverduePaymentsModal} ${this._renderReceiptModal} ${this._renderErrorRetryModal}
      ${this._renderMaximumErrorRetriesModal} ${this._renderConfirmLeaveModal}
    `}}customElements.define(Ue.is,Ue);class Ge extends(ie(ne(i))){static get is(){return"bbva-analyticmanager-finance-debit-line-cancel-mx"}static get properties(){return{}}fireAppStep3({reason:e}){this.persistData({reason:`motivo cancelacion:${this.normalizeString(e)}`}),this.onStep({currentStep:"3"})}fireAppStep4(){this.onStep({currentStep:"4"})}fireAppStep5(){this.onStep({currentStep:"5"})}fireDataCompleted(e){this.persistData(e),this.fireAppCompleted()}}customElements.define(Ge.is,Ge);
