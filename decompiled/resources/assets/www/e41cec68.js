import{aZ as e,J as t,L as i,a7 as s,h as a,z as o,aX as n,b3 as r,an as c,ak as l,aV as d,aD as u,dH as h,cU as p,i as m}from"./952f98a9.js";import{D as b,a1 as v,aw as y,G as _,a2 as g,R as f,M as k,L as E,a3 as S,A,T as C,e as x,x as w,f as $,F as O,a4 as P,K as T,H as R,O as L,P as M,Q as D,t as I}from"./216055dc.js";import{a as q}from"./f18a73d9.js";import{c as N,a as H,d as B,e as j}from"./1979ce36.js";import{by as F,a7 as V,bf as Y,bg as U,bS as G,bT as K,aH as z,R as J}from"./7f3d7ca9.js";import{B as X,a as W,b as Q}from"./d2484b66.js";import{a as Z}from"./4656db6d.js";import{B as ee}from"./a101086e.js";import{b as te,B as ie}from"./f9d0fbbe.js";import{b as se,a as ae,B as oe}from"./e3d898b2.js";import{b as ne,B as re,g as ce}from"./30ef6f1f.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./854beed0.js";import"./84dff06e.js";class le{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let i=Object(this),s=i.length>>>0;if(0===s)return!1;let a=0|t,o=Math.max(a>=0?a:s-Math.abs(a),0);for(;o<s;){if((n=i[o])===(r=e)||"number"==typeof n&&"number"==typeof r&&isNaN(n)&&isNaN(r))return!0;o++}var n,r;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var i=[],s=0,a="",o=0,n=arguments.length;o!==n;++o){var r=+arguments[o];if(!(r<1114111&&r>>>0===r))throw RangeError("Invalid code point: "+r);r<=65535?s=i.push(r):(r-=65536,s=i.push(55296+(r>>10),r%1024+56320)),s>=16383&&(a+=e.apply(null,i),i.length=0)}return a+e.apply(null,i)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",i=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${i&&i.message}`)}}class de extends le{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}}const ue=0,he=1,pe="jwt",me="tsec",be="none";class ve extends le{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=ue,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new de,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=me:this.requiredToken=be,this.requiresJWT=!1):this.requiredToken===me?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===pe?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===be?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(me)}_setJwtHandler(){this._setTokenHandler(pe)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((i,s)=>{t=Object.assign(t,{resolve:i,reject:s}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let i=this._getRequestHeaders();Object.keys(i).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,i[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let t=null;return!!window.CellsNativePlugins&&(t=e),t}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let i=e.replace(/[\{\}]+/g,""),s=t[i];return s?delete t[i]:this._error(9,`Missing ${i} param value`),s})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let i=Object.keys(t);i.length&&(e=[e,i.map((e=>{let i=t[e];return Array.isArray(i)&&this.paramArrayMode===he?this._arrayToQueryParam(e,i):`${e}=${i}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(me,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(pe,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(i){var s=t.getItem(i);s&&"null"!==s&&(e[i]=s)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const i=window.sessionStorage;t=Object.keys(i).filter((t=>t.startsWith(e))).reduce(((t,s)=>(t[s.replace(e,"")]=i.getItem(s),t)),{})}return t}_getTokenForRequestHeaders(e,t){const i=`${e}Handler`,s=e===pe?"JWT ":"",a=e===pe?"Authorization":me;if(void 0===this[i]||null===this[i])this._error(11,`${e} handler is undefined`);else{const o=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let n=this[i].getItem(o);n?t[a]=t[a]||s+n:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((i=>{t.push(`${i}=${e[i]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let i;const s=new Promise(((e,t)=>{i=(i,s)=>{i?t(i):e(s)}}));return t.addEventListener("loadend",(function e(s){t.removeEventListener("loadend",e),s.error?i(s.error):i(null,t.result)})),t.readAsText(e),s}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let i=0;for(;i<e.length;){let s=e[i],a=0,o=0;if(s<=127?(a=0,o=255&s):s<=223?(a=1,o=31&s):s<=239?(a=2,o=15&s):s<=244&&(a=3,o=7&s),e.length-i-a>0){let t=0;for(;t<a;)s=e[i+t+1],o=o<<6|63&s,t+=1}else o=65533,a=e.length-i;t+=String.fromCodePoint(o),i+=a+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},i=e.trim().split(/[\r\n]+/);for(const e in i)if(i.hasOwnProperty(e)&&""!==i[e]){let s=": ",a=i[e].split(s);t[a.shift().toLowerCase()]=a.join(s)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,i,s){let a=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(s)>=0&&(a=t.getResponseHeader(s));break;case this._NATIVE_XHR:t&&t.headers&&(a=JSON.parse(t.headers)[s])}if(a){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):i;e.getItem(t)!==a&&(e.setItem(t,a),this._emitTokenUpdate(i,a))}}_emitTokenUpdate(e,t){if(this.htmlContext){const i=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(i)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,i,s,a,o;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),i=e.getResponseHeader("AuthenticationData"),s=e.getResponseHeader("AuthenticationState"),a=e.getResponseHeader("AuthenticationChallenge"),o=e.getResponseHeader("AuthenticationResponse");else{let n=JSON.parse(e.headers);t=n.authenticationtype,i=n.authenticationdata||null,s=n.authenticationstate,a=n.authenticationchallenge,o=n.authenticationresponse}return{type:t,data:i,state:s,challenge:a,response:o}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",i=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const s=this._getSignatureData(e,t,i);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:s}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",i="",s=""){let a;if("object"==typeof e&&e){const o=this._getSignatureData(e.signatureType,t,i);a=this._makeKeyValuePairFromObject(o,e.signatureValue),e.challenge&&(a+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(a,e.signatureType,s)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(a=`password=${e}`,this._buildSignatureHeaders(a,"2",s)):(a=`${i}=${e}`,this._buildSignatureHeaders(a,t,s)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let i,s=e.split(",");if(s.length>1){i=s.map((e=>`${e}=${t[e]}`)).join(",")}else i=`${e}=${t}`;return i}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",i=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),i&&(this.headers=Object.assign(this.headers,{AuthenticationState:i})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),a=this._ERROR_CODES.SIGNATURE_INVALID.includes(s),{type:o,data:n,state:r,challenge:c,response:l}=this._extractSignatureResponseHeaders(e),d=this._getRequestMetadata(e);if(a)this._notifySignatureInvalid(d),i=!0;else if(o)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(s)?(this._notifySignatureTypeUsingErrorCode(s,d,o,n,r,c,l),i=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(d,o,n,r,c,l),i=!0}return i}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),a=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(s),o=this._getRequestMetadata(e);a&&(this._notifyWaitingForProcessResponse(o),i=!0)}return i}_notifySignatureRequiredFirstStep(e,t,i,s){this._defineSignatureType(t,i),this._defineSignatureValue(t,i,s),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:i,metadata:e}}))}_notifySignatureRequired(e,t,i,s,a,o){this._defineSignatureValue(t,i,s);const n={type:t,data:i,challenge:a,metadata:e};o&&(n.response=o),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:n}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:i}=e;return{path:this._path,method:this.method,url:t,status:i}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",i=""){const s=t.split(";").findIndex((t=>t===e));return i?i.split(";")[s]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,i,s,a,o){s?this._notifySignatureRequired(e,t,i,s,a,o):this._notifySignatureRequiredFirstStep(e,t,i,s)}_notifySignatureTypeUsingErrorCode(e,t,i,s,a,o,n){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,i,s,a):this._notifySignatureRequired(t,i,s,a,o,n)}}class ye extends ve{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}}class _e extends ve{constructor(e=null){super(Object.assign(e||{},{method:"POST"}))}toString(e=""){return super.toString(e||"BGADPRequestPOST")}}class ge extends ye{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/economic-data`)}toString(){return super.toString("BGADPCustomersCustomerEconomicDataGetV0")}}class fe extends ye{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/civil-registries`)}toString(){return super.toString("BGADPCustomersCivilRegistriesGetV1")}}class ke extends _e{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/civil-registries/search`)}toString(){return super.toString("BGADPCustomersCivilRegistriesSearchPostV1")}}class Ee extends ye{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/identification-process/documents`)}toString(){return super.toString("BGADPCustomersCustomerIdentificationProcessDocumentsGetV1")}}class Se extends _e{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/identification-process/documents`)}toString(){return super.toString("BGADPCustomersCustomerIdentificationProcessDocumentsPostV1")}}class Ae extends ye{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/indicators`)}toString(){return super.toString("BGADPCustomersCustomerIndicatorsGetV1")}}class Ce extends ye{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/terms`)}toString(){return super.toString("BGADPCustomersCustomerTermsGetV1")}}class xe extends _e{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/terms`)}toString(){return super.toString("BGADPCustomersCustomerTermsPostV1")}}class we extends(t(i)){_mappingBank(e){this._renameProperty(e,"bank.bankId","id"),this._renameProperty(e,"bank.branch.branchId","id"),e.bank&&e.bank.branch&&e.bank.branch.costCenter&&(e.bank.branch.costCenter={id:e.bank.branch.costCenter})}_mappingGender(e){this._renameProperty(e,"gender.name","description")}_mappingIdentityDocuments(e){for(let t=0;t<e.identityDocuments.length;t++)this._renameProperty(e.identityDocuments[t],"documentType.name","description"),this._renameProperty(e.identityDocuments[t],"status.name","description")}_mappingMaritalStatus(e){this._renameProperty(e,"maritalStatus.name","description")}_mappingNationalities(e){for(let t=0;t<e.nationalities.length;t++)this._renameProperty(e.nationalities[t],"name","description")}_mappingPersonalTitle(e){this._renameProperty(e,"personalTitle.name","description")}_mappingResidence(e){this._renameProperty(e,"residence","taxResidence"),this._renameProperty(e,"taxResidence.residenceType.name","description")}_mappingVerification(e){this._renameProperty(e,"enrollmentModality","verification"),this._renameProperty(e,"verification.enrollmentMethod","identificationMethod")}_mappingSegments(e){for(let t=0;t<e.segments.length;t++)this._renameProperty(e.segments[t],"name","description")}_changeNameToDescription(e){e.map((e=>{this._renameProperty(e,"name","description")}))}}class $e extends we{static get is(){return"bbva-global-customer-terms-base-api-dm"}resetCustomerTerms(){this.customerTerms=[]}getCustomerTerms(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields,this._paginationMapping)}postCustomerTerms(e,t){this._requestMapping(t);const i={"customer-id":e};this._generateGetService(this._getService("post",t,i),this.constructor.POST_EVENTS,this._responseMapping),this.resetCustomerTerms()}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}CustomerTerms`,this._getBgadp(s))}_getBgadp(e){return{getCustomerTermsV1:()=>new Ce(e),postCustomerTermsV1:()=>new xe(e),default:()=>"BGADP does not exist."}}_requestMapping(e){return e}_responseMapping(e){return e}_paginationMapping(e){return e}}s($e,"GET_EVENTS",{customEvent:"customer-terms-api-dm-fetch",paginationEvent:"customer-terms-api-dm-pagination",errorFireEventHandler:"customer-terms-api-dm-fetch-error"}),s($e,"POST_EVENTS",{customEvent:"customer-terms-api-dm-create",errorFireEventHandler:"customer-terms-api-dm-create-error"}),customElements.define($e.is,$e);class Oe extends we{static get is(){return"bbva-global-customer-terms-api-dm"}static get properties(){return{customerTerms:{type:Array,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.customerTerms=[],this.country="",this.localCustomProperties={},this._countries=[],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties","customerTerms"],this._loaded=!1,this._requestParams={}}update(e){super.update(e),e.forEach(((e,t)=>{"country"===t&&this.country&&this.country!==e?this._loadModule():"_module"!==t&&"_requestParams"!==t&&"_loaded"!==t&&this._module&&this[t]!==e?this._module[t]=this[t]:("_requestParams"===t&&this._requestParams&&this._requestParams!==e&&void 0!==e&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===t&&this._loaded)&&Object.entries(this._requestParams).forEach((([e])=>{this[`_${e}CustomerTerms`]()}))}))}async _loadModule(){const e=this._capitalize(this.country);if(this._countries.includes(e)&&this._modules[e]){const t=`BbvaCustomerTerms${e}ApiDm`;(0,this._modules[e])().then((async e=>{const i=e[t].is;this._module=this._createModuleElement(i),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-customer-terms-api-dm-module-load")})).catch((async e=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-customer-terms-api-dm-module-error",e)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(e){return e.charAt(0).toUpperCase()+e.slice(1).toLowerCase()}_createModuleElement(e=$e.is){const t=document.createElement(e);return this._bindConfig(t),t}async _bindConfig(e){this._configProperties.forEach((t=>{e[t]=this[t]})),await this.updateComplete}_dispatchEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}async resetCustomerTerms(){await this.module.updateComplete,this.module.resetCustomerTerms()}async getCustomerTerms(e,t={}){await this.module.updateComplete,this._requestParams.get?this._requestParams.get.push({customerId:e,params:t}):this._requestParams={get:[{customerId:e,params:t}]}}async _getCustomerTerms(){await this.module.updateComplete,Object.keys(this.customerTerms).length||(this._requestParams.get.forEach((e=>{this.module.getCustomerTerms(e.customerId,e.params)})),delete this._requestParams.get)}async postCustomerTerms(e,t){await this.module.updateComplete,this._requestParams.post?this._requestParams.post.push({customerId:e,body:t}):this._requestParams={post:[{customerId:e,body:t}]}}async _postCustomerTerms(){await this.module.updateComplete,this._requestParams.post.forEach((e=>{this.module.postCustomerTerms(e.customerId,e.body)})),delete this._requestParams.post}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return a` ${this._module?this._module:""}`}}class Pe extends we{static get is(){return"bbva-global-customer-lopd-documents-base-api-dm"}resetCustomerLopdDocuments(){this.customerLopdDocuments={}}getCustomerLopdDocuments(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}CustomerLopdDocuments`,this._getBgadp(s))}_getBgadp(e){return{getCustomerLopdDocumentsV3:()=>new F(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}s(Pe,"GET_EVENTS",{customEvent:"customer-lopd-documents-api-dm-fetch",errorFireEventHandler:"customer-lopd-documents-api-dm-fetch-error"}),customElements.define(Pe.is,Pe);class Te extends we{static get is(){return"bbva-global-customer-economic-data-base-api-dm"}resetCustomerEconomicData(){this.customerEconomicData={}}getCustomerEconomicData(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}CustomerEconomicData`,this._getBgadp(s))}_getBgadp(e){return{getCustomerEconomicDataV0:()=>new ge(e),getCustomerEconomicDataV2:()=>new X(e),getCustomerEconomicDataV3:()=>new W(e),default:()=>"BGADP does not exist."}}_incomesMapping(e){e.map((e=>{e.incomeValue={},e.incomeValue={valueType:"EXACT",amount:{amount:e.incomeValues[0].amount,currency:e.incomeValues[0].currency}},e.incomeValues[0].concept&&(e.incomeValue.concept=e.incomeValues[0].concept),e.incomeValues[0].frecuency&&(e.incomeValue.frequency=e.incomeValues[0].frecuency),"BIWEEKLY"==e.incomeValue.frequency&&(e.incomeValue.frequency="BI_WEEKLY"),this._removeFields(["incomeValues"],e),this._changeNameToDescription([e.incomeType])}))}_expensesMapping(e){e.map((e=>{e.expenseValue={currency:e.expenseValues[0].currency,amount:e.expenseValues[0].amount},e.expenseValues[0].frecuency&&(e.expenseValue.frequency=e.expenseValues[0].frecuency),e.expenseValue.frequency&&"BIWEEKLY"==e.expenseValue.frequency&&(e.expenseValue.frequency="BI_WEEKLY"),this._removeFields(["expenseValues"],e),this._changeNameToDescription([e.expenseType])}))}_workPlaceMapping(e){e.address&&(e.address.addressType&&"WORK"!==e.address.addressType.id&&this._removeFields(["id"],e.address.addressType),e.address.ownershipType&&(["MOVED","REJECTED","NOT_LOCATED"].includes(e.address.ownershipType.id)&&this._removeFields(["id"],e.address.ownershipType),this._changeNameToDescription([e.address.ownershipType,e.address.ownershipType.propertyType])),this._renameProperty(e.address.location,"addressName","formatedAddress"),this._removeFields(["residenceStartDate"],e.address),this._removeFields(["city","state","country","zipCode","geolocation","geographicGroups","meta"],e.address.location)),this._changeNameToDescription([e.address.addressType,e.economicActivity,e.profesionPosition]),this._renameProperty(e,"profesionPosition","professionPosition"),this._removeFields(["taxpayerIdentification"],e)}_assetsMapping(e){e.map((e=>{this._changeNameToDescription([e.assetType]),e.assetValues.map((e=>{this._removeFields(["concept"],e)}))}))}_liabilitiesMapping(e){e.map((e=>{this._changeNameToDescription([e.liabilityType]),e.liabilityValues.map((e=>{this._removeFields(["concept","frecuency"],e)}))}))}_responseMapping(e){return"0"==this.version&&Object.keys(e).length?(this._changeNameToDescription([e.economicActivity,e.occupationType,e.employmentSituation,e.education]),e.incomes&&this._incomesMapping(e.incomes),e.expenses&&this._expensesMapping(e.expenses),e.workPlace&&this._workPlaceMapping(e.workPlace),e.assets&&this._assetsMapping(e.assets),e.liabilities&&this._liabilitiesMapping(e.liabilities),e.balances&&e.balances.map((e=>{this._changeNameToDescription([e])})),this._renameProperty(e,"workPlace","workplace"),this._removeFields(["financialGroup","financialSubGroup","indicators","incomeSources"],e)):"2"==this.version&&Object.keys(e).length&&(e.workPlace&&e.workPlace.economicActivities&&(e.workPlace.economicActivity=e.workPlace.economicActivities[0],this._removeFields(["economicActivities"],e.workPlace)),e.balances&&e.balances.forEach((e=>{e.id=e.balanceType.id,e.description=e.balanceType.description,e.amount=e.balanceValue.amount,e.currency=e.balanceValue.currency,this._removeFields(["balanceType","balanceValue"],e)})),e.expenses&&e.expenses.forEach((e=>{["OTHER_LOAN","REVOLVING_CARD","FIXED_PAYMENT"].includes(e.expenseType.id)&&this._removeFields(["expenseType"],e)})),e.assets&&e.assets.forEach((e=>{["BANK_DEPOSIT"].includes(e.assetType.id)&&this._removeFields(["assetType"],e)})),e.liabilities&&e.liabilities.forEach((e=>{["MORTGAGE","PERSONAL_LOANS","OTHER_LOANS"].includes(e.liabilityType.id)&&this._removeFields(["liabilityType"],e)})),this._renameProperty(e,"workPlace","workplace"),this._removeFields(["financialSummaries"],e)),e}}s(Te,"GET_EVENTS",{customEvent:"customer-economic-data-api-dm-fetch",errorFireEventHandler:"customer-economic-data-api-dm-fetch-error"}),customElements.define(Te.is,Te);class Re extends we{static get is(){return"bbva-global-civil-registries-search-base-api-dm"}resetCivilRegistriesSearch(){this.civilRegistriesSearch=[]}postCivilRegistriesSearch(e){this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}CivilRegistriesSearch`,this._getBgadp(s))}_getBgadp(e){return{postCivilRegistriesSearchV1:()=>new ke(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}s(Re,"POST_EVENTS",{customEvent:"civil-registries-search-api-dm-fetch",errorFireEventHandler:"civil-registries-search-api-dm-fetch-error"}),customElements.define(Re.is,Re);class Le extends we{static get is(){return"bbva-global-civil-registries-base-api-dm"}resetCivilRegistries(){this.civilRegistries=[]}getCivilRegistries(e){this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields,this._paginationMapping)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}CivilRegistries`,this._getBgadp(s))}_getBgadp(e){return{getCivilRegistriesV1:()=>new fe(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}_paginationMapping(e){return e}}s(Le,"GET_EVENTS",{customEvent:"civil-registries-api-dm-fetch",paginationEvent:"civil-registries-api-dm-pagination",errorFireEventHandler:"civil-registries-api-dm-fetch-error"}),customElements.define(Le.is,Le);class Me extends we{static get is(){return"bbva-global-customers-child-customers-base-api-dm"}postCustomersChildCustomers(e){this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}CustomersChildCustomers`,this._getBgadp(s))}_getBgadp(e){return{postCustomersChildCustomersV3:()=>new Z(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}s(Me,"POST_EVENTS",{customEvent:"customers-child-customers-api-dm-create",errorFireEventHandler:"customers-child-customers-api-dm-create-error"}),customElements.define(Me.is,Me);class De extends we{static get is(){return"bbva-global-customer-identification-process-documents-base-api-dm"}resetCustomerIdentificationProcessDocuments(){this.customerIdentificationProcessDocuments=[]}getCustomerIdentificationProcessDocuments(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}postCustomerIdentificationProcessDocuments(e,t){const i={"customer-id":e};this._generateGetService(this._getService("post",t,i),this.constructor.POST_EVENTS,this._responseMapping),this.resetCustomerIdentificationProcessDocuments()}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}CustomerIdentificationProcessDocuments`,this._getBgadp(s))}_getBgadp(e){return{getCustomerIdentificationProcessDocumentsV1:()=>new Ee(e),postCustomerIdentificationProcessDocumentsV1:()=>new Se(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}s(De,"GET_EVENTS",{customEvent:"customer-identification-process-documents-api-dm-fetch",errorFireEventHandler:"customer-identification-process-documents-api-dm-fetch-error"}),s(De,"POST_EVENTS",{customEvent:"customer-identification-process-documents-api-dm-create",errorFireEventHandler:"customer-identification-process-documents-api-dm-create-error"}),customElements.define(De.is,De);class Ie extends we{static get is(){return"bbva-global-customer-identification-process-documents-api-dm"}static get properties(){return{customerIdentificationProcessDocuments:{type:Array,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.customerIdentificationProcessDocuments=[],this.country="",this.localCustomProperties={},this._countries=[],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties","customerIdentificationProcessDocuments"],this._loaded=!1,this._requestParams={}}update(e){super.update(e),e.forEach(((e,t)=>{"country"===t&&this.country&&this.country!==e?this._loadModule():"_module"!==t&&"_requestParams"!==t&&"_loaded"!==t&&this._module&&this[t]!==e?this._module[t]=this[t]:("_requestParams"===t&&this._requestParams&&this._requestParams!==e&&void 0!==e&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===t&&this._loaded)&&Object.entries(this._requestParams).forEach((([e])=>{this[`_${e}CustomerIdentificationProcessDocuments`]()}))}))}async _loadModule(){const e=this._capitalize(this.country);if(this._countries.includes(e)&&this._modules[e]){const t=`BbvaCustomerIdentificationProcessDocuments${e}ApiDm`;(0,this._modules[e])().then((async e=>{const i=e[t].is;this._module=this._createModuleElement(i),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-customer-identification-process-documents-api-dm-module-load")})).catch((async e=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-customer-identification-process-documents-api-dm-module-error",e)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(e){return e.charAt(0).toUpperCase()+e.slice(1).toLowerCase()}_createModuleElement(e=De.is){const t=document.createElement(e);return this._bindConfig(t),t}async _bindConfig(e){this._configProperties.forEach((t=>{e[t]=this[t]})),await this.updateComplete}_dispatchEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}async resetCustomerIdentificationProcessDocuments(){await this.module.updateComplete,this.module.resetCustomerIdentificationProcessDocuments()}async getCustomerIdentificationProcessDocuments(e,t={}){await this.module.updateComplete,this._requestParams.get?this._requestParams.get.push({customerId:e,params:t}):this._requestParams={get:[{customerId:e,params:t}]}}async _getCustomerIdentificationProcessDocuments(){await this.module.updateComplete,Object.keys(this.customerIdentificationProcessDocuments).length||(this._requestParams.get.forEach((e=>{this.module.getCustomerIdentificationProcessDocuments(null==e?void 0:e.customerId,null==e?void 0:e.params)})),delete this._requestParams.get)}async postCustomerIdentificationProcessDocuments(e,t){await this.module.updateComplete,this._requestParams.post?this._requestParams.post.push({customerId:e,body:t}):this._requestParams={post:[{customerId:e,body:t}]}}async _postCustomerIdentificationProcessDocuments(){await this.module.updateComplete,this._requestParams.post.forEach((e=>{this.module.postCustomerIdentificationProcessDocuments(null==e?void 0:e.customerId,null==e?void 0:e.body)})),delete this._requestParams.post}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return a` ${this._module?this._module:""}`}}class qe extends we{static get is(){return"bbva-global-customer-indicators-base-api-dm"}resetCustomerIndicators(){this.customerIndicators=[]}getCustomerIndicators(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}CustomerIndicators`,this._getBgadp(s))}_getBgadp(e){return{getCustomerIndicatorsV1:()=>new Ae(e),getCustomerIndicatorsV3:()=>new Q(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return"1"==this.version&&Object.keys(e).length&&e.forEach((e=>{["BASIC_DATA","ENTREPRENEUR_AND_POTENTIAL","WEB_CONSUMPTION_ACCOUNT","USER_EXPIRED"].includes(e.id)&&this._removeFields(["id"],e),this._removeFields(["payrollAmounts","payrollAge"],e)})),e}}s(qe,"GET_EVENTS",{customEvent:"customer-indicators-api-dm-fetch",errorFireEventHandler:"customer-indicators-api-dm-fetch-error"}),customElements.define(qe.is,qe);const Ne=e=>!(e&&"object"==typeof e&&!Array.isArray(e))||!Object.entries(e).length,{moment:He}=window;const Be={B:"MARRIED_WITH_SEPARATED_PROPERTY",C:"MARRIED_WITHOUT_SEPARATED_PROPERTY",D:"DIVORCED",S:"SINGLE",U:"COHABITANT",V:"WIDOWED",X:"SEPARATED"},je=[{question:"bbva-kyc-question-1",hidden:!1,icon:{hidden:!0},selected:"0",answer:"bbva-kyc-answer-yes",config:[{text:"bbva-kyc-answer-yes",value:"bbva-kyc-answer-yes",key:"HOLDER"},{text:"bbva-kyc-answer-no",value:"bbva-kyc-answer-no",key:"THIRD_PARTY"}]},{question:"bbva-kyc-question-2",hidden:!1,icon:{hidden:!1,type:0},selected:"0",answer:"bbva-kyc-answer-no",config:[{text:"bbva-kyc-answer-no",value:"bbva-kyc-answer-no",key:!1},{text:"bbva-kyc-answer-yes",value:"bbva-kyc-answer-yes",key:!0}]},{question:"bbva-kyc-question-3",hidden:!1,icon:{hidden:!0},selected:"0",answer:"bbva-kyc-answer-no",config:[{text:"bbva-kyc-answer-no",value:"bbva-kyc-answer-no",key:!1},{text:"bbva-kyc-answer-yes",value:"bbva-kyc-answer-yes",key:!0}]},{question:"bbva-kyc-question-4",hidden:!1,icon:{hidden:!0},selected:"0",answer:"bbva-kyc-answer-yes",config:[{text:"bbva-kyc-answer-yes",value:"bbva-kyc-answer-yes",key:!0},{text:"bbva-kyc-answer-no",value:"bbva-kyc-answer-no",key:!1}]},{question:"bbva-kyc-question-5",hidden:!1,icon:{hidden:!0},selected:"0",answer:"bbva-kyc-answer-no",config:[{text:"bbva-kyc-answer-no",value:"bbva-kyc-answer-no",key:!1},{text:"bbva-kyc-answer-yes",value:"bbva-kyc-answer-yes",key:!0}]},{question:"bbva-kyc-question-6",hidden:!0,icon:{hidden:!0},selected:"0",answer:"bbva-kyc-answer-option-1",config:[{text:"bbva-kyc-answer-option-1",value:"bbva-kyc-answer-option-1",key:!1},{text:"bbva-kyc-answer-option-2",value:"bbva-kyc-answer-option-2",key:!0}]},{question:"bbva-kyc-question-7",hidden:!0,icon:{hidden:!0},selected:"0",answer:"bbva-kyc-answer-no",config:[{text:"bbva-kyc-answer-no",value:"bbva-kyc-answer-no",key:!1},{text:"bbva-kyc-answer-yes",value:"bbva-kyc-answer-yes",key:!0}]},{question:"bbva-kyc-question-8",hidden:!1,icon:{hidden:!1,type:1},selected:"0",answer:"bbva-kyc-answer-no",config:[{text:"bbva-kyc-answer-no",value:"bbva-kyc-answer-no"},{text:"bbva-kyc-answer-yes",value:"bbva-kyc-answer-yes"}]},{question:"bbva-kyc-question-9",hidden:!1,icon:{hidden:!0},selected:"0",answer:"bbva-kyc-answer-no",config:[{text:"bbva-kyc-answer-no",value:"bbva-kyc-answer-no"},{text:"bbva-kyc-answer-yes",value:"bbva-kyc-answer-yes"}]}],Fe=[{question:"bbva-kyc-label-bank-operations-1",answer:"",answerAmount:"",answerReason:"",symbol:"$",options:[{value:"bbva-kyc-label-bank-operations-deposits-option-1",key:15},{value:"bbva-kyc-label-bank-operations-deposits-option-2",key:20},{value:"bbva-kyc-label-bank-operations-deposits-option-3",key:25}],labelSelect:"bbva-kyc-label-bank-deposits-number",labelAmount:"bbva-kyc-label-bank-operations-amount",labelReason:"bbva-kyc-label-bank-operations-reason",localCurrency:"MXN",currencyCode:"MXN",infoMessage:"bbva-kyc-label-bank-operations-amount-greater",errorMessage:"bbva-kyc-label-bank-operations-warning-amount-greater",errorMessageArea:"bbva-kyc-label-bank-operations-special-characters",hidden:!1,step:{nextStep:!1,nextQuestion:null},form:{amount:!1,textArea:!1},icon:{hidden:!0}},{question:"bbva-kyc-label-bank-operations-2",answer:"",answerAmount:"",answerReason:"",symbol:"$",options:[{value:"bbva-kyc-label-bank-operations-transfers-option-1",key:30},{value:"bbva-kyc-label-bank-operations-transfers-option-2",key:45},{value:"bbva-kyc-label-bank-operations-transfers-option-3",key:60},{value:"bbva-kyc-label-bank-operations-transfers-option-4",key:75}],labelSelect:"bbva-kyc-label-bank-operations-number",labelAmount:"bbva-kyc-label-bank-operations-amount",labelReason:"bbva-kyc-label-bank-operations-reason",localCurrency:"MXN",currencyCode:"MXN",infoMessage:"bbva-kyc-label-bank-operations-amount-greater",errorMessage:"bbva-kyc-label-bank-operations-warning-amount-greater",errorMessageArea:"bbva-kyc-label-bank-operations-special-characters",hidden:!1,step:{nextStep:!1,nextQuestion:null},form:{amount:!1,textArea:!1},icon:{hidden:!1,type:2}},{question:"bbva-kyc-label-bank-operations-3",answer:"",answerAmount:"",answerReason:"",symbol:"$",options:[{value:"bbva-kyc-label-bank-operations-buy-dolars-option-1",key:"NOOPERATIONS"},{value:"bbva-kyc-label-bank-operations-buy-dolars-option-2",key:"LOWERTWOTOUSAND"},{value:"bbva-kyc-label-bank-operations-buy-dolars-option-3",key:"UPPERTWOTOUSAND"}],labelSelect:"bbva-kyc-label-bank-operations-amount",labelAmount:"",labelReason:"",localCurrency:"",currencyCode:"",hidden:!1,step:{nextStep:!0,nextQuestion:3},infoMessage:"",errorMessage:"",errorMessageArea:"",form:{amount:!0,textArea:!0},icon:{hidden:!0}},{question:"bbva-kyc-label-bank-operations-4",answer:"",answerAmount:"",answerReason:"",localCurrency:"USD",currencyCode:"",symbol:"USD",options:[{value:"bbva-kyc-label-bank-operations-dolars-option-1",key:3},{value:"bbva-kyc-label-bank-operations-dolars-option-2",key:6},{value:"bbva-kyc-label-bank-operations-dolars-option-3",key:9},{value:"bbva-kyc-label-bank-operations-dolars-option-4",key:12}],labelSelect:"bbva-kyc-label-bank-operations-number",labelAmount:"bbva-kyc-label-bank-operations-amount",labelReason:"bbva-kyc-label-bank-operations-reason",infoMessage:"bbva-kyc-label-bank-operations-amount-greater-usd",errorMessage:"bbva-kyc-label-bank-operations-warning-amount-greater-usd",errorMessageArea:"bbva-kyc-label-bank-operations-special-characters",hidden:!0,step:{nextStep:!1,nextQuestion:null},form:{amount:!0,textArea:!0},icon:{hidden:!0}}],Ve=[{question:"bbva-kyc-label-marital-status",type:"",notification:{text:""},answer:""},{question:"bbva-kyc-label-ocupation",type:"search",notification:{text:""},answer:""},{question:"bbva-kyc-label-economic-activity",type:"",notification:{text:"bbva-kyc-label-notification-ocupation",icon:"info"},answer:""}],Ye=[{question:"bbva-kyc-label-1",label:"bbva-kyc-label-information-your-account-selection-1",answer:"",key:""},{question:"bbva-kyc-label-2",label:"bbva-kyc-label-information-your-account-selection-2",answer:"",key:""},{question:"bbva-kyc-label-3",label:"bbva-kyc-label-information-your-account-selection-3",answer:"",key:""}],Ue=[{question:"bbva-kyc-label-4",answer:"",type:"",options:[{text:"bbva-kyc-label-bank-relationship-option-1",key:"EXCLUSIVE"},{text:"bbva-kyc-label-bank-relationship-option-2",key:"OCCASIONAL"},{text:"bbva-kyc-label-bank-relationship-option-3",key:"MAIN"}],hidden:!1,label:"bbva-kyc-label-information-your-account-selection-4",optionalLabel:"",infoMessage:"",errorMessage:""},{question:"bbva-kyc-label-5",answer:"",type:"number",options:[],hidden:!0,label:"bbva-kyc-label-information-your-account-selection-5",optionalLabel:"bbva-kyc-label-information-your-account-optional",infoMessage:"bbva-kyc-label-information-your-account-key-1",errorMessage:"bbva-kyc-label-information-your-account-key-2"},{question:"bbva-kyc-label-6",answer:"",type:"text",options:[],hidden:!1,label:"bbva-kyc-label-information-your-account-selection-6",optionalLabel:"bbva-kyc-label-information-your-account-optional",infoMessage:"",errorMessage:""}],Ge={modalId:"privacy-policy",headerText:"bbva-kyc-validation-privacy-modal-title",description:"bbva-kyc-validation-privacy-modal-description"},Ke={modalId:"public-charge",headerText:"bbva-kyc-validation-help-people-modal-title",subtitleText:"bbva-kyc-validation-help-people-modal-subtitle",description:"bbva-kyc-validation-help-people-modal-description",icon:"help"},ze={modalId:"monthly-operations",headerText:"bbva-kyc-validation-help-people-modal-title",subtitleText:"bbva-kyc-validation-help-operation-modal-subtitle",description:"bbva-kyc-validation-help-operation-modal-description",icon:"help"},Je={modalId:"monthly-transferes",headerText:"bbva-kyc-validation-help-people-modal-title",subtitleText:"bbva-kyc-validation-help-transfer-description",type:"full",list:["bbva-kyc-list-help-transfer-1","bbva-kyc-list-help-transfer-2","bbva-kyc-list-help-transfer-3","bbva-kyc-list-help-transfer-4","bbva-kyc-list-help-transfer-5","bbva-kyc-list-help-transfer-6"]},Xe={modalId:"sworn-declaration",headerText:"bbva-kyc-validation-sworn-declaration-title",description:"bbva-kyc-validation-sworn-declaration-description",subDescription:"bbva-kyc-validation-sworn-declaration-subdescription",listNumber:["bbva-kyc-validation-sworn-declaration-list-1","bbva-kyc-validation-sworn-declaration-list-2"]},We={modalId:"exit-kyc",headerText:"bbva-kyc-validation-exit-modal-title",description:"bbva-kyc-validation-exit-modal-title-description",link:"bbva-kyc-validation-exit-button-continue-operation",button:"bbva-kyc-validation-exit-button",icon:"caution",type:"caution"},Qe={accountUsageName:"accountUsageName",countryStates:"countryStates",maritalStatus:"maritalStatus",jobType:"jobType",jobTypeSecond:"jobTypeSecond",moneyOrigin:"moneyOrigin"},Ze=[{value:"Ahorros",id:"SAVINGS"},{value:"Herencia",id:"HEREDITY"},{value:"Venta de bienes/servicios",id:"SALE_OF_GOODS_AND_SERVICES"},{value:"Premios, rifas, sorteos",id:"REWARDS_RAFFLE_AND_LOTTERY"},{value:"Nomina/pension",id:"PAYROLL_OR_PENSION"},{value:"Prestamo bancario",id:"BANK_LOAN"},{value:"Otros",id:"OTHER"}],et={dataServices:[{name:"bbva-feature-proceedings-kyc-step-civil-state",value:""},{name:"bbva-feature-proceedings-kyc-step-ocupation",value:""},{name:"bbva-feature-proceedings-kyc-step-economic-activity",value:""}],dataBanking:[{name:"bbva-feature-proceedings-kyc-step-relation-type",value:""},{name:"bbva-feature-proceedings-kyc-step-add-clabe-account",value:""},{name:"bbva-feature-proceedings-kyc-step-add-e-signature",value:""}],dataAccount:[{name:"bbva-feature-proceedings-kyc-step-source-money",value:""},{name:"bbva-feature-proceedings-kyc-step-account-purpose",value:""},{name:"bbva-feature-proceedings-kyc-step-state",value:""}],bankOperations:[{name:"bbva-feature-proceedings-kyc-step-bank-operations-deposits-withdrawals",value:""},{name:"bbva-feature-proceedings-kyc-step-bank-operations-monthly-amount",value:""},{name:"bbva-feature-proceedings-kyc-step-specific-reason",value:""},{name:"bbva-feature-proceedings-kyc-step-bank-operations-transfers",value:""},{name:"bbva-feature-proceedings-kyc-step-bank-operations-monthly-amount",value:""},{name:"bbva-feature-proceedings-kyc-step-specific-reason",value:""},{name:"bbva-feature-proceedings-kyc-step-bank-operations-question-buy-sell-dollars",value:""},{name:"bbva-feature-proceedings-kyc-step-bank-operations-buy-sell-dollars",value:""},{name:"bbva-feature-proceedings-kyc-step-bank-operations-monthly-amount",value:""},{name:"bbva-feature-proceedings-kyc-step-specific-reason",value:""}],dataAboutYourHabits:[{name:"bbva-feature-proceedings-kyc-step-act-own",value:""},{name:"bbva-feature-proceedings-kyc-step-politic-activity",value:""},{name:"bbva-feature-proceedings-kyc-step-has-international-operations",value:""},{name:"bbva-feature-proceedings-kyc-setp-third-party-funds",value:""},{name:"bbva-feature-proceedings-kyc-step-have-credits",value:""},{name:"bbva-feature-proceedings-kyc-step-pay-credits",value:""},{name:"bbva-feature-proceedings-kyc-step-advance-pay-credits",value:""},{name:"bbva-feature-proceedings-kyc-step-more-than-operations-monthly",value:""},{name:"bbva-feature-proceedings-kyc-step-monthly-operations-exceed",value:""}]};var tt=o`
.list-simple {
  margin-bottom: 0.75rem;
}
.list-simple *:last-child {
  text-align: left;
}

.section {
  margin-top: 0.5rem;
}
`;class it extends(n(V(r(c(i))))){static get is(){return"list-simple"}static get scopedElements(){const e=[_,g];return it.scopedElementsFromClasses(e)}static get styles(){return[tt,b.primary,v.primary,v.secondary,l("list-simple-shared-styles")]}static get properties(){return{items:{type:Array}}}constructor(){super(),this.items=[]}render(){return a`
      ${Array.isArray(this.items)&&this.items.length>0?y(this.items,(e=>a`
          <div class="list-simple" ?hidden="${e.hidden}">
        ${e.hidden||""!==e.answer?a`
          <bbva-type-text size="S" text="${e.question}" unset>
           </bbva-type-text>`:d}
            ${e.answer?a`
                  <bbva-type-text
                    size="S"
                    text="${e.answer}"
                    font-weight="500"
                    unset
                  >
                  </bbva-type-text>
                `:d}
            ${e.answerAmount?a`
                  <div class="section">
                    <bbva-type-text size="S" text="${e.labelAmount}" unset>
                    </bbva-type-text>
                    <bbva-type-amount
                      variant="m"
                      language="en"
                      type="bold"
                      amount="${e.answerAmount}"
                      symbol="${e.symbol||""}"
                      ?symbol-right="${"USD"===e.symbol}"
                      ?symbol-left="${"USD"!==e.symbol}"
                    >
                    </bbva-type-amount>
                  </div>
                `:d}
            ${e.answerReason?a`
                  <div class="section">
                    <bbva-type-text size="S" text="${e.labelReason}" unset>
                    </bbva-type-text>
                    <bbva-type-text
                      size="S"
                      ellipsis=""
                      text="${e.answerReason}"
                      font-weight="500"
                      unset
                    >
                    </bbva-type-text>
                  </div>
                `:d}
          </div>
        `)):d}
    `}}var st=o`
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

[data-tag-name=bbva-expandable-multistep] {
  overflow: "";
}

.container-text-area {
  margin-top: 1rem;
}

.help {
  padding: 0.25rem;
  margin-bottom: 1rem;
}
.help [data-tag-name=bbva-type-icon] {
  --_type-icon--color: var(--bbva-type-text--_ambient-spotlight-color);
}

.notification-help {
  margin-left: 1rem;
  margin-top: -0.5rem;
}

.questions-container {
  width: 100%;
  display: flex;
  justify-content: space-between;
  align-items: end;
}

.container-bank-relationship .text-optional {
  display: flex;
  gap: 0.25rem;
}

.content {
  margin-bottom: 2rem;
}

.summary {
  margin-top: -1rem;
}

.expandable-content [data-tag-name=bbva-expandable-step] {
  --bbva-expandable-step-completed-content-max-height: auto;
}

.confirm-step {
  background-color: var(--_expandable-multistep-background-color-confirmation);
  width: 100%;
  padding: 1rem;
}
.confirm-step [data-tag-name=bbva-button-default] {
  padding: 0;
}

.text-subtitle {
  padding: 0.5rem 0 1rem;
}

.info-personal-about-your-account {
  margin-top: 0.5rem;
}

.information-about-your-habits {
  margin-bottom: 0.5rem;
}

.bank-operations {
  margin-top: -1rem;
}

.form-input {
  padding-bottom: 1rem;
}

#ContinueFooterButton {
  display: flex;
  justify-content: center;
  margin: 1.5rem 1rem 0.5rem 1rem;
}
`,at=o`
:host {
  --_primary-bg-color: var(--kyc-validation-mx--_ambient--_primary-bg-color, ${f("colorPrimarySurfaceAmbientDefault",{colorPrimarySurfaceAmbientDefault:"#f4f4f4"})});
  --bbva-type-text--_ambient-spotlight-color: var(--kyc-validation-mx--_ambient--_primary-bg-color-icon, ${f("colorPrimarySupportInfoDefault",{colorPrimarySupportInfoDefault:"#004481"})});
}
`;class ot extends(n(k(E(c(i))))){static get is(){return"kyc-multistep-page"}static get styles(){return[st,te.primaryAlt,se.primaryAlt,ne.primaryAlt,S.primaryAlt,S.secondary,A.secondary,C.primaryAlt,at,l("kyc-multistep-page-shared-styles")]}static get scopedElements(){const e=[x,_,w,ie,Y,U,ae,oe,re,ce,$,O,it,P];return ot.scopedElementsFromClasses(e)}static get properties(){return{visible:{type:Boolean},informationAboutYourHabitsList:{type:Array,attribute:"information-about-your-habits-list"},bankOperationsList:{type:Array,attribute:"bank-operations-list"},informationYourAccountList:{type:Array,attribute:"information-your-account-list"},bankingRelationshipList:{type:Array,attribute:"banking-relationship-list"},informationPersonalAboutYourAccountList:{type:Array,attribute:"information-personal-about-your-account-list"},openBankOperations:{type:Boolean,attribute:"open-bank-operations"},disableButton:{type:Boolean,attribute:"disable-button"},_validateErrorCharacters:{type:Boolean},_validateErrorAmountDeposits:{type:Boolean},_validateErrorAmountDollars:{type:Boolean},_validateErrorAmountTransfers:{type:Boolean},_validateErrorCharactersDeposits:{type:Boolean},_validateErrorCharactersDollars:{type:Boolean},_validateErrorCharactersTransfers:{type:Boolean},_validateErrorInterbankCode:{type:Boolean},countryStatesList:{type:Array,attribute:"country-states-list"},maritalStatusList:{type:Array,attribute:"marital-status-list"},accountUsageNameList:{type:Array,attribute:"account-usege-name-list"},moneyOriginList:{type:Array,attribute:"money-origin-list"},jobOptionSelected:{type:String,attribute:"job-option-selected"},economicActivity:{type:Array,attribute:"economic-activity"},_headerType:{type:String},resetAmount:{type:Boolean,attribute:"reset-amount"},isHightRiskUser:{type:Boolean,attribute:"is-hight-risk-user"},idEconomicActivity:{type:String,attribute:"id-economic-activity"},comesFromProceedings:{type:Boolean,attribute:"comes-from-proceedings"},_jobOptionFlag:{type:Boolean},_interbankCode:{type:Number},_isAtTop:{type:Boolean},_isAtBottom:{type:Boolean},_validationStates:{type:Object},_completedStep:{type:Boolean},isSpinnerHide:{type:Boolean,attribute:"is-spinner-hide"}}}constructor(){super(),this.visible=!1,this.informationAboutYourHabitsList=[],this.bankOperationsList=[],this.informationYourAccountList=[],this.bankingRelationshipList=[],this.informationPersonalAboutYourAccountList=[],this.openBankOperations=!1,this.countryStatesList=[],this.maritalStatusList=[],this.accountUsageNameList=[],this.moneyOriginList=[],this.disableButton=!1,this._validateErrorCharacters=!1,this._validateErrorAmount=!1,this._validateErrorAmountDeposits=!1,this._validateErrorAmountDollars=!1,this._validateErrorAmountTransfers=!1,this._validateErrorCharactersDeposits=!1,this._validateErrorCharactersDollars=!1,this._validateErrorCharactersTransfers=!1,this._validateErrorInterbankCode=!1,this.jobOptionSelected="",this.economicActivity=[],this._headerType="modal-initial",this.isHightRiskUser=!1,this.resetAmount=!1,this.idEconomicActivity="",this.comesFromProceedings=!1,this._jobOptionFlag=!1,this._interbankCode=18,this.container=null,this._isAtTop=!1,this._isAtBottom=!1,this._validationStates={0:!0,1:!0,3:!0},this._completedStep=!1,this.isSpinnerHide=!1}updated(e){this._handleJobOptionSelected(e),this._handleVisibility(e),this._handleProceedings(e),this._handleSpinner(e)}firstUpdated(){this._validateErrorInterbankCode=!0}_handleJobOptionSelected(e){if(e.has("jobOptionSelected")&&this._jobOptionFlag){const e=this.informationPersonalAboutYourAccountList.find((e=>"bbva-kyc-label-economic-activity"===e.question));e&&(e.answer="",this.informationPersonalAboutYourAccountList=[...this.informationPersonalAboutYourAccountList]),this._checkFields()}}_handleVisibility(e){e.has("visible")&&this.visible&&this.shadowRoot.querySelector("[data-tag-name='bbva-expandable-step']").edit()}_handleProceedings(e){e.has("comesFromProceedings")&&this.comesFromProceedings&&this.openBankOperations&&([0,1,3].forEach((e=>{const t=this.shadowRoot.querySelector(`#amount${e}`);t&&(t.amount=0)})),this._validateErrorCharacters=!0,this._validateErrorAmount=!0,this._validateErrorAmountDeposits=!0,this._validateErrorAmountDollars=!0,this._validateErrorAmountTransfers=!0,this._validateErrorCharactersDeposits=!0,this._validateErrorCharactersDollars=!0,this._validateErrorCharactersTransfers=!0,this._checkFields())}_handleSpinner(e){e.has("isSpinnerHide")&&this.isSpinnerHide&&this.openBankOperations&&[0,1,3].forEach((e=>{const t=this.shadowRoot.querySelector(`#amount${e}`);t&&(t.amount=this.bankOperationsList[e].answerAmount)}))}_openHalfModalPublicCharge(){this._dispatchCustomEvent("kyc-validation-mx-open-half-modal-public-charge",{nameModal:"HalfModal",config:Ke})}_openHalfModalMonthlyOperations(){this._dispatchCustomEvent("kyc-validation-mx-open-half-modal-monthly-operations",{nameModal:"HalfModal",config:ze})}_openHalfModalMonthlyTransferes(){this._dispatchCustomEvent("kyc-validation-mx-open-half-modal-monthly-transferes",{nameModal:"HalfModal",config:Je})}_openHalfModalSwornDeclaration(){this._dispatchCustomEvent("kyc-validation-mx-open-half-modal-sworn-declaration",{nameModal:"HalfModal",config:Xe})}_openHalfModalExit(){this._dispatchCustomEvent("kyc-validation-mx-open-half-modal-exit",{nameModal:"HalfModal",config:We,buttonDisable:this.disableButton,sectionBankOperation:this.openBankOperations})}_handleConfirmButton(){this._dispatchCustomEvent("kyc-validation-mx-completed-questionnaire")}_sectionSubtitle(e){return a`
    <div class="text-subtitle">
      <bbva-header-category
      .text="${this.t(e)}">
      </bbva-header-category>
    </div>
    `}_textQuestions(e){return a`
      <bbva-type-text
        .text="${this.t(e)}"
        size="4XS"
        font-weight="500"
      >
      </bbva-type-text>
    `}_handleQuestionChange({target:e,detail:t}){const i=t.value,s=e.name[e.name.length-1];if(this.informationAboutYourHabitsList[s].answer=i,this.informationAboutYourHabitsList[s].selected=t.selected,this.informationAboutYourHabitsList=[...this.informationAboutYourHabitsList],"radio_4"===e.name){const e=1===t.selected;this._toggleVisibility(5,e),this._toggleVisibility(6,e)}this._exceptionQuestions({target:e,detail:t}),this._showBankOperations({target:e,detail:t}),this._dispatchCustomEvent("kyc-validation-mx-information-about-your-habits",{answer:this.informationAboutYourHabitsList,button:this.openBankOperations})}_toggleVisibility(e,t){const i=this.informationAboutYourHabitsList[e];i&&(i.hidden=!t,this.informationAboutYourHabitsList=[...this.informationAboutYourHabitsList])}_exceptionQuestions({target:e,detail:t}){"radio_0"!==e.name&&"radio_1"!==e.name&&"radio_2"!==e.name&&"radio_3"!==e.name||(1===t.selected?this.isHightRiskUser=!0:this.isHightRiskUser=!1)}_showBankOperations({target:e,detail:t}){"radio_8"===e.name&&1===t.selected?this.openBankOperations=!0:"radio_8"===e.name&&0===t.selected&&(this.openBankOperations=!1),this._checkFields()}_showFormOptions(e){const t=this.bankOperationsList[e].options;return a`
      ${t.map((e=>a`
          <bbva-form-option value="${e.value}"
            >${this.t(e.value)}</bbva-form-option>
        `))}
    `}_openIconHelp(e=""){const t={0:this._openHalfModalPublicCharge,1:this._openHalfModalMonthlyOperations,2:this._openHalfModalMonthlyTransferes};return a`
      <div class="help" ?hidden="${e.icon.hidden||""}">
        <bbva-type-icon
          id="questionHelpModal_${e.icon.type??""}"
          size="16"
          icon="${u()}"
          @click="${t[e.icon.type]||(()=>{})}"
        >
        </bbva-type-icon>
      </div>
    `}_checkEspecialCharacters(e){const{detail:t}=e,i=t.value,s=/[`!@#$%^&*()_+\-={};':·"\\|<>/?~]/.test(i),a=e.target.getAttribute("id"),o=e.target,n={0:"_validateErrorCharactersDeposits",1:"_validateErrorCharactersTransfers",3:"_validateErrorCharactersDollars"};if(n[a]){const e=n[a];s?(o.setAttribute("invalid",""),this[e]=!1):(o.removeAttribute("invalid"),this[e]=!0)}this._validateErrorCharacters=this._validateErrorCharactersDeposits&&this._validateErrorCharactersTransfers,this.bankOperationsList[a].answerReason=i,this.bankOperationsList=[...this.bankOperationsList],this._dispatchCustomEvent("kyc-validation-mx-information-bank-operations",{answer:this.bankOperationsList,section:"bbva-kyc-multistep-subtitle-information-bank-operations"}),this._checkFields()}_checkLimitAmount(e){var t;const i=((null==e||null===(t=e.target)||void 0===t?void 0:t.value)||"").replace(/[,]/g,""),s=parseFloat(i),a=e.target,o=a.getAttribute("id").slice(-1),n={0:{maxAmount:2e5,validationFlag:"_validateErrorAmountDeposits"},1:{maxAmount:2e5,validationFlag:"_validateErrorAmountTransfers"},3:{maxAmount:2e3,validationFlag:"_validateErrorAmountDollars"}};if(n[o]){const{maxAmount:e,validationFlag:t}=n[o];s<=e?(a.setAttribute("invalid",""),this[t]=!1):(a.removeAttribute("invalid"),this[t]=!0),this._handleValidationState(o,this[t])}this._validateErrorAmount=this._validateErrorAmountDeposits&&this._validateErrorAmountTransfers,this.bankOperationsList[o].answerAmount=s||"",this.bankOperationsList=[...this.bankOperationsList],this._dispatchCustomEvent("kyc-validation-mx-information-bank-operations",{answer:this.bankOperationsList,section:"bbva-kyc-multistep-subtitle-information-bank-operations"}),this._checkFields()}_handleOptionsStep({target:e,detail:t}){var i;const s=t.selectedIndex,a=e.name[e.name.length-1];if(null!==(i=this.bankOperationsList[a].step)&&void 0!==i&&i.nextStep){var o;const e=null===(o=this.bankOperationsList[a].step)||void 0===o?void 0:o.nextQuestion,t={0:{hidden:!0,amount:!0,textArea:!0},1:{hidden:!1,amount:!0,textArea:!0},2:{hidden:!1,amount:!1,textArea:!1}};s in t&&Object.assign(this.bankOperationsList[e],{hidden:t[s].hidden,form:{...this.bankOperationsList[e].form,...t[s]}})}this.bankOperationsList[a].answer=this.bankOperationsList[a].options[s].value,this.bankOperationsList=[...this.bankOperationsList],this._dispatchCustomEvent("kyc-validation-mx-information-bank-operations",{answer:this.bankOperationsList,section:"bbva-kyc-multistep-subtitle-information-bank-operations"}),this._checkFields()}_showBankingRelationship(e){const t=e.detail.selectedIndex,[i,s]=this.bankingRelationshipList;0===t?s.hidden=!0:1!==t&&2!==t||(s.hidden=!1),i.answer=i.options[t].text,this.bankingRelationshipList=[...this.bankingRelationshipList],this._dispatchCustomEvent("kyc-validation-mx-information-banking-relationship",this.bankingRelationshipList),this._checkFields()}_interbankCodeFormat(e){const{detail:t}=e,i=t.value,s=e.target,a=s.getAttribute("id");"1"===a&&(0===i.length?(s.removeAttribute("invalid"),this._validateErrorInterbankCode=!0):i.length!==this._interbankCode?(s.setAttribute("invalid",""),this._validateErrorInterbankCode=!1):(s.removeAttribute("invalid"),this._validateErrorInterbankCode=!0)),this.bankingRelationshipList[a].answer=i,this.bankingRelationshipList=[...this.bankingRelationshipList],this._dispatchCustomEvent("kyc-validation-mx-information-banking-relationship",this.bankingRelationshipList),this._checkFields()}_bankingRelationship(){const[e]=this.bankingRelationshipList,t=e.options;return a`
      ${t.map((e=>a`
          <bbva-form-option value="${e.text}"
            >${this.t(e.text)}</bbva-form-option>
        `))}
    `}_handleAnswerDataServices({target:e,detail:t}){var i;const s=t.value,a=e.name[e.name.length-1];this.informationPersonalAboutYourAccountList[a].answer=s,this.idEconomicActivity=null===(i=this.economicActivity[t.selectedIndex])||void 0===i?void 0:i.id,this.informationPersonalAboutYourAccountList=[...this.informationPersonalAboutYourAccountList],this._dispatchCustomEvent("kyc-validation-mx-information-answer-data-services-information-personal",{list:this.informationPersonalAboutYourAccountList,id:this.idEconomicActivity}),this._checkFields()}_handleAnswerYourAccount({target:e,detail:t}){const i=t.value,s=e.id,a={0:[Ze.find((({value:e})=>e===t.value))],1:this.accountUsageNameList,2:this.countryStatesList}[s].find((e=>e.value===i));this.informationYourAccountList[s].key=a.id,this.informationYourAccountList[s].answer=i,this.informationYourAccountList=[...this.informationYourAccountList],this._dispatchCustomEvent("kyc-validation-mx-information-answer-data-services-your-account",this.informationYourAccountList),this._checkFields()}_checkFields(){const[e,t]=this.bankingRelationshipList,[i,s,a,o]=this.bankOperationsList,[n,r,c]=a.options,l=this.informationYourAccountList.every((e=>""!==e.answer)),d=""!==e.answer&&(this._validateErrorInterbankCode||""===t),u=this.informationPersonalAboutYourAccountList.every((e=>""!==e.answer)),h=[i.answer,i.answerAmount,i.answerReason,a.answer].every((e=>""!==e))&&this._validateErrorCharacters&&this._validateErrorAmount,p=[s.answer,s.answerAmount,s.answerReason,a.answer].every((e=>""!==e))&&this._validateErrorCharacters&&this._validateErrorAmount,m=""!==o.answer,b=[o.answerAmount,o.answerReason].every((e=>""!==e))&&this._validateErrorCharacters&&this._validateErrorCharactersDollars&&this._validateErrorAmount&&this._validateErrorAmountDollars,v=l&&d&&u;if(this.openBankOperations){if(this.disableButton=!1,""!==a.answer){const e={[n.value]:v&&h&&p,[r.value]:v&&h&&p&&m,[c.value]:v&&h&&p&&m&&b};this.disableButton=e[a.answer]||!1}}else this.disableButton=v;this.requestUpdate()}_changeHeaderSecondaryAmbient(){this._headerType="modal-initial-secondary",this._completedStep=!0,this._jobOptionFlag=!1,this.isHightRiskUser&&this._dispatchCustomEvent("kyc-validation-mx-open-branch-full-modal",{nameModal:"OpenBranchModal"}),this._dispatchCustomEvent("kyc-validation-mx-prepare-data-for-proceedings"),this.shadowRoot.querySelector("[data-tag-name='bbva-expandable-multistep']").scrollTo({top:0,behavior:"instant"})}_changeHeaderPrimaryAmbient(){this._headerType="modal-initial",this._completedStep=!1}_handleJobListModal(){this._dispatchCustomEvent("kyc-validation-mx-open-job-list-modal",{nameModal:"JobListModal"}),this._checkFields(),this._jobOptionFlag=!0}_checkValidationErrorTextArea(){this.bankOperationsList.forEach((e=>{0===e.answerReason.length&&(this._validateErrorCharacters=!1,this._checkFields())}))}_handleValidationState(e,t){this._validationStates={...this._validationStates,[e]:t}}get _kycHabitsInformation(){return a`
      <div class="information-about-your-habits">
        ${this._sectionSubtitle("bbva-kyc-multistep-subtitle-information-about-your-habits")}
        ${this.informationAboutYourHabitsList.map(((e,t)=>a`
            <div ?hidden="${null==e?void 0:e.hidden}">
              <div class="questions-container">
                ${this._textQuestions(null==e?void 0:e.question)} ${this._openIconHelp(e)}
              </div>
              <div>
                <bbva-button-group
                  type="radio"
                  name="radio_${t}"
                  selected="${e.selected}"
                  .items="${e.config}"
                  @button-group-item-change="${this._handleQuestionChange}"
                >
                </bbva-button-group>
              </div>
            </div>
          `))}
      </div>
    `}get _kycBankOperations(){return a`
      ${this.openBankOperations?a`
            ${this._sectionSubtitle("bbva-kyc-multistep-subtitle-information-bank-operations")}
            <div class="bank-operations">
            ${this.bankOperationsList.map(((e,t)=>a`
                <div class="container-bank" id="containerBank${t}" ?hidden="${null==e?void 0:e.hidden}">
                  <div class="questions-container">
                    ${this._textQuestions(e.question)}
                    ${this._openIconHelp(e)}
                  </div>

                  <bbva-form-select
                    name="option${t}"
                    label="${this.t(null==e?void 0:e.labelSelect)}"
                    value="${null==e?void 0:e.answer}"
                    close-button-aria-label="bbva-kyc-validation-content-button-aria-label-close"
                    @bbva-form-select-selected-item="${this._handleOptionsStep}"
                  >
                    ${this._showFormOptions(t)}
                  </bbva-form-select>

                  <bbva-form-input
                    id="amount${t}"
                    ?hidden="${e.form.amount}"
                    type="amount"
                    currency-code="${this.t(e.localCurrency)}"
                    local-currency="${this.t(e.currencyCode)}"
                    language="en"
                    decimal-digits="2"
                    error-message="${this.t(e.errorMessage)}"
                    info-message="${this._validationStates[t]?this.t(e.infoMessage):""}"
                    label="${this.t(e.labelAmount)}"
                    value="${e.answerAmount}"
                    amount="${e.answerAmount||null}"
                    ?reset-value="${this.resetAmount}"
                    clear-accessible-text="${this.t("bbva-kyc-validation-content-button-aria-label-clear")}"
                    @form-input-value-change="${this._checkLimitAmount}"
                  >
                  </bbva-form-input>

                  <div class="container-text-area">
                    <bbva-form-input
                      id="${t}"
                      ?hidden="${e.form.textArea}"
                      type="textarea"
                      maxlength="500"
                      character-counter-label="caracteres restantes"
                      error-message="${this.t(e.errorMessageArea)}"
                      label="${this.t(e.labelReason)}"
                      value="${e.answerReason}"
                      clear-accessible-text="${this.t("bbva-kyc-validation-content-button-aria-label-clear")}"
                      @form-input-value-change="${this._checkEspecialCharacters}"
                      @form-textarea-input-clear="${this._checkValidationErrorTextArea}"
                    >
                    </bbva-form-input>
                  </div>
                </div>
              `))}
          `:d}
      </div>`}get _kycAcountInformation(){return a`
      <div class="info-personal-about-your-account">
        ${this._sectionSubtitle("bbva-kyc-multistep-subtitle-information-your-account")}
        ${this.informationPersonalAboutYourAccountList.map(((e,t)=>{var i,s;return a`
          ${1!==t?a`
              <div>
                <bbva-form-select
                  name="option${t}"
                  required
                  ?disabled="${2===t&&!this.jobOptionSelected}"
                  label="${this.t(e.question)}"
                  value="${e.answer}"
                  label-medium-out=""
                  close-button-aria-label="bbva-kyc-validation-content-button-aria-label-close"
                  accessibility-icon-notification="${e.notification.icon}"
                  @bbva-form-select-selected-item="${this._handleAnswerDataServices}"
                >
                  ${0===t?null===(i=this.maritalStatusList)||void 0===i?void 0:i.map((e=>a`
                          <bbva-form-option value="${e.value}">
                            ${e.value}
                          </bbva-form-option>
                        `)):null===(s=this.economicActivity)||void 0===s?void 0:s.map((e=>a`
                          <bbva-form-option value="${e.value}">
                            ${e.value}
                          </bbva-form-option>
                        `))}
                </bbva-form-select>
              </div>
  
              ${2===t?a`
                  <div class="notification-help">
                    <bbva-notification-help
                      ?disabled="${!this.jobOptionSelected}"
                      variant="info"
                      text="${e.notification.text}"
                    >
                    </bbva-notification-help>
                  </div>
                `:d}
            `:a`
              <div class="form-input">
                <bbva-form-input
                  id="formJobList"
                  type="search"
                  readonly
                  label="${this.t(e.question)}"
                  value="${e.answer||this.jobOptionSelected}"
                  icon-variant="search"
                  @click="${this._handleJobListModal}"
                >
                </bbva-form-input>
              </div>
            `}
        `}))}
      </div>
    `}get _kycYourAccount(){var e,t,i;const s={0:null===(e=this.moneyOriginList)||void 0===e?void 0:e.map((e=>a`
        <bbva-form-option value="${e.value}">${e.value}</bbva-form-option>
      `)),1:null===(t=this.accountUsageNameList)||void 0===t?void 0:t.map((e=>a`
        <bbva-form-option value="${e.value}">${e.value}</bbva-form-option>
      `)),2:null===(i=this.countryStatesList)||void 0===i?void 0:i.map((e=>a`
        <bbva-form-option value="${e.value}">${e.value}</bbva-form-option>
      `))};return 0!==this.moneyOriginList.length&&0!==this.countryStatesList.length&&0!==this.accountUsageNameList.length?a`
      ${this.informationYourAccountList.map(((e,t)=>a`
        ${this._textQuestions(e.question)}
        <bbva-form-select
          id="${t}"
          label="${this.t(e.label)}"
          value="${e.answer}"
          name="formSelect${t}"
          close-button-aria-label="bbva-kyc-validation-content-button-aria-label-close"
          @bbva-form-select-selected-item="${this._handleAnswerYourAccount}"
        >
          ${s[t]||d}
        </bbva-form-select>
      `))}
    `:d}get _kycBankingRelationship(){return a`
     ${this.bankingRelationshipList.map(((e,t)=>a`
          <div class="container-bank-relationship" ?hidden="${null==e?void 0:e.hidden}">
            <div class="text-optional">
              ${this._textQuestions(e.question)}
              <bbva-type-text
                text="${this.t(e.optionalLabel)}"
                size="4XS"
                ambient-color="secondary500"
              >
              </bbva-type-text>
            </div>
            ${0===t?a`
                  <bbva-form-select
                    id="selectRelationship"
                    label="${this.t(e.label)}"
                    value="${null==e?void 0:e.answer}"
                    close-button-aria-label="bbva-kyc-validation-content-button-aria-label-close"
                    @bbva-form-select-selected-item="${this._showBankingRelationship}"
                  >
                    ${this._bankingRelationship()}
                  </bbva-form-select>
                `:a`
                  <bbva-form-input
                    id="${t}"
                    name="relationship${t}"
                    clear-accessible-text="${this.t("bbva-kyc-validation-content-button-aria-label-clear")}"
                    type="${e.type}"
                    label="${this.t(e.label)}"
                    value="${e.answer}"
                    error-message="${this.t(e.errorMessage)}"
                    info-message="${this.t(e.infoMessage)}"
                    @form-input-value-change="${this._interbankCodeFormat}"
                  >
                  </bbva-form-input>
                `}
          </div>
        `))}
    `}get _kycMultistep(){return a`
      <bbva-expandable-multistep>
        <div slot="content" class="expandable-content">
          <bbva-expandable-step
            step="1"
            total-steps="1"
            ?completed="${this._completedStep}"
            ?show-link="${!0}"
            edit-label="${this.t("bbva-kyc-expandable-step-modify")}"
            header="${this.t("bbva-kyc-expandable-step-title")}"
            summaryLabel="Continuar Resumen"
            @expandable-step-button-click="${this._changeHeaderSecondaryAmbient}"
            @expandable-step-edit-step="${this._changeHeaderPrimaryAmbient}"
            current-step-label="${this.t("bbva-kyc-expandable-step-current-step-label")}"
          >
            <div class="content" ambient="primary-alt">
              ${this.comesFromProceedings?a`
                    <bbva-type-text
                      text=${this.t("bbva-kyc-multistep-text-comes-from-proceedings")}
                      size="4XS"
                      font-weight="350"
                    ></bbva-type-text>
                  `:d}
              ${this._kycHabitsInformation}
              ${this._kycBankOperations}
              ${(()=>this.comesFromProceedings&&this.maritalStatusList.length&&this.economicActivity.length?this._kycAcountInformation:d)()}
              ${this.economicActivity.length&&this.comesFromProceedings?d:this._kycAcountInformation}
              ${this._kycYourAccount}
              ${this._kycBankingRelationship}
            </div>
            <div slot="summary" ambient="secondary">${this._summaryKyc}</div>
          </bbva-expandable-step>
        </div>
        ${this._footerConfirm}
      </bbva-expandable-multistep>
    `}get _summaryKyc(){return a`
    <div class="summary">
      ${this._sectionSubtitle("bbva-kyc-multistep-subtitle-information-about-your-habits")}
      <list-simple
        .items="${this.informationAboutYourHabitsList}"
      >
      </list-simple>
      ${this.openBankOperations?a` ${this._sectionSubtitle("bbva-kyc-multistep-subtitle-information-bank-operations")}
            <list-simple
              .items="${this.bankOperationsList}"
            >
            </list-simple>`:d}
      ${this._sectionSubtitle("bbva-kyc-multistep-subtitle-information-your-account")}

      <list-simple
        .items="${this.informationPersonalAboutYourAccountList}"
      >
      </list-simple>
      <list-simple
        .items="${this.informationYourAccountList}"
      >
      </list-simple>
      <list-simple .items="${this.bankingRelationshipList}">
      </list-simple>
      <bbva-notification-help
        variant="info"
        text="${this.t("bbva-kyc-multistep-text-notification-help")}"
      ></bbva-notification-help>
      </div>
    `}get _footerConfirm(){return a`
      <div class="confirm-step" slot="confirmation">
        <bbva-type-text
          ambient="primary"
          size="S"
          text="${this.t("bbva-kyc-validation-sworn-declaration")}"
        ></bbva-type-text>
        <bbva-button-default
          text="${this.t("bbva-kyc-validation-sworn-declaration-title")}"
          id="declaracionJurada"
          variant="link"
          @click="${this._openHalfModalSwornDeclaration}"
        >
        </bbva-button-default>
        <bbva-button-default
          fullwidth=""
          id= "confirmButton"
          @click="${this._handleConfirmButton}"
          text="${this.t("bbva-kyc-validation-content-button-confirm")}"
        >
        </bbva-button-default>
      </div>
    `}get _slotFooterHelpModal(){return a`
      <bbva-button-default
        id="ContinueFooterButton"
        text="Continuar"
        ?disabled="${!this.disableButton}"
        @click="${this._changeHeaderSecondaryAmbient}"
      >
      </bbva-button-default>
    `}render(){return a`
      <bbva-help-modal
        ?visible="${this.visible}"
        full-height
        header-text="${this.t("bbva-kyc-validation-main-title")}"
        header-type="${this._headerType}"
        header-close-icon-aria-label="${this.t("bbva-kyc-validation-content-button-aria-label-close")}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        left-icon-label="Back"
        avoid-icon-close-modal
        hide-content-padding-top
        ambient="primary"
        @header-main-close-icon-click="${this._openHalfModalExit}"
      >
        <div slot="slot-content" class="container">${this._kycMultistep}</div>
        <div slot="slot-footer" ?hidden="${this._completedStep}">${this._slotFooterHelpModal}</div>
      </bbva-help-modal>
    `}}customElements.define(ot.is,ot);var nt=o`
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

.privacity-container {
  margin-top: 2.5rem;
}
.privacity-container [data-tag-name=bbva-button-default] {
  padding: 0;
}

.text-subtitle {
  padding: 1rem 0;
}
`;class rt extends(n(k(E(c(i))))){static get is(){return"kyc-welcome-full-modal"}static get styles(){return[nt,G.primaryAlt,l("kyc-welcome-full-modal-shared-styles")]}static get scopedElements(){const e=[_,x,K,T,$];return rt.scopedElementsFromClasses(e)}static get properties(){return{visible:{type:Boolean}}}constructor(){super(),this.visible=!1}_handleShowMultistep(){this._dispatchCustomEvent("kyc-validation-mx-open-multistep")}_handleCloseModal(){this._dispatchCustomEvent("kyc-validation-mx-welcome-full-modal-close")}_openHalfModal(){this._dispatchCustomEvent("kyc-validation-mx-open-half-modal-privacy-policy",{nameModal:"HalfModal",config:Ge})}get _bbvaPrivacityInfo(){return a`
      <div class="privacity-container">
        <bbva-badge-icon
          ambient="primary-alt"
          icon="${h()}"
          description="${this.t("bbva-kyc-validation-content-privacy-description")}"
        >
        </bbva-badge-icon>

        <bbva-button-default
          id="btnPrivacityInfo"
          text="${this.t("bbva-kyc-validation-content-privacy-button-label")}"
          variant="link"
          @click="${this._openHalfModal}"
        >
        </bbva-button-default>
      </div>
    `}get _modalContent(){return a`
      <div slot="slot-content" class="container">
      <bbva-clip-microillustration
        microillustration="security"
      >
      </bbva-clip-microillustration>
      <bbva-type-text
        text="${this.t("bbva-kyc-validation-content-title")}"
        size="3XL"
        font-weight="700"
      >
      </bbva-type-text>
      <bbva-type-text
        inherit=""
        text="${this.t("bbva-kyc-validation-content-description")}"
        size="S"
        font-weight="350"
      >
      </bbva-type-text>
      <bbva-type-text
        inherit=""
        text="${this.t("bbva-kyc-validation-content-description-part-two")}"
        size="S"
        font-weight="350"
      >
      </bbva-type-text>
      ${this._bbvaPrivacityInfo}
      </div>
    `}render(){return a`
    <bbva-help-modal
      ?visible=${this.visible}
      id="welcomeModal"
      full-height
      fixed-footer
      header-text="${this.t("bbva-kyc-validation-main-title")}"
      button-text="${this.t("bbva-kyc-validation-content-button-continue")}"
      ?i-o-s-fixed-header="${this.iOSFixedHeader}"
      footer-button-aria-label="Boton Continuar"
      header-close-icon-aria-label="${this.t("bbva-kyc-validation-content-button-aria-label-close")}"
      @help-modal-footer-button-click="${this._handleShowMultistep}"
      @header-main-close-icon-click="${this._handleCloseModal}">
      ${this._modalContent}
    </bbva-help-modal>

    `}}customElements.define(rt.is,rt);var ct=o`
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

ul {
  padding: 0;
}

li {
  list-style: none;
}

[data-tag-name=bbva-list-bullet] {
  padding: 0.25rem 0;
}
`;class lt extends(n(k(E(c(i))))){static get is(){return"kyc-branch-full-modal"}static get styles(){return[ct,l("kyc-branch-full-modal-shared-styles")]}static get scopedElements(){const e=[_,x,z,$,T];return lt.scopedElementsFromClasses(e)}static get properties(){return{visible:{type:Boolean}}}constructor(){super(),this.visible=!1}_handleCloseBranchModal(){this._dispatchCustomEvent("kyc-validation-mx-branch-to-exit")}get _modalContent(){return a`
      <div slot="slot-content" class="container">
        <bbva-clip-microillustration alt-image="bbva_branch" alt-microillustration="bbva_branch">
        </bbva-clip-microillustration>
        <bbva-type-text
          text="${this.t("bbva-kyc-validation-branch-title")}"
          size="3XL"
          font-weight="700"
          id="branchTitle"
        >
        </bbva-type-text>
        <bbva-type-text
          text="${this.t("bbva-kyc-validation-branch-description")}"
          size="M"
          font-weight="350"
          id="branchDescription"
        >
        </bbva-type-text>
       <div class="list-bullet">
       <ul>
          <li>
            <bbva-list-bullet
              text="${this.t("bbva-kyc-validation-branch-option-ine")}"
              id="optionIne"
            ></bbva-list-bullet>
          </li>
          <li>
            <bbva-list-bullet
              text="${this.t("bbva-kyc-validation-branch-option-voucher-address")}"
              id='optionAddress'
            ></bbva-list-bullet>
          </li>
        </ul>
       </div>
      </div>
    `}render(){return a`
      <bbva-help-modal
        ?visible=${this.visible}
        full-height
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        fixed-footer
        header-text="${this.t("bbva-kyc-validation-main-title")}"
        button-text="${this.t("bbva-kyc-validation-branch-button-out")}"
        @help-modal-footer-button-click="${this._handleCloseBranchModal}"
        @header-main-close-icon-click="${this._handleCloseBranchModal}"
        header-close-icon-aria-label="${this.t("bbva-kyc-validation-content-button-aria-label-close")}"
      >
        ${this._modalContent}
      </bbva-help-modal>
    `}}customElements.define(lt.is,lt);var dt=o`
:host {
  display: block;
  box-sizing: border-box;
  --bbva-help-modal-padding: 0 1rem 1rem 1rem;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

ul {
  padding-left: 0.5rem;
  margin: 0.2rem;
  text-indent: 1.5rem;
  padding-bottom: 1rem;
}

li {
  list-style: none;
}

[data-tag-name=bbva-list-bullet] {
  padding: 0.25rem 0;
}

.footer-container {
  display: flex;
  flex-direction: column;
  padding: 0 1rem 0 1rem;
}

.button-default {
  margin: 1rem 0 1rem 0;
  display: flex;
  flex-direction: column;
}

#btnPrivacityInfo {
  padding: 0;
}

[data-tag-name=bbva-help-modal] {
  padding-top: --bbva-help-modal-safe-area-inset-top;
}

.description [data-tag-name=bbva-type-text] {
  margin-top: -1rem;
}
`;class ut extends(n(k(E(c(i))))){static get is(){return"kyc-half-modal"}static get styles(){return[dt,l("kyc-half-modal-shared-styles")]}static get scopedElements(){const e=[_,x,K,z,T,$,R];return ut.scopedElementsFromClasses(e)}static get properties(){return{visible:{type:Boolean},configModal:{type:Object},closeModalElements:{type:Array,attribute:"close-modal-elements"}}}constructor(){super(),this.visible=!1,this.configModal={},this.closeModalElements=["header"]}_getIcon(e=""){return{help:u(),caution:p()}[e]}exitKyc(){this._dispatchCustomEvent("kyc-validation-mx-exit-component"),this.visible=!1}_handleHeaderClick(e){e.stopPropagation(),this._dispatchCustomEvent("kyc-validation-mx-half-modal-header-click")}_resetConfigHalfModal(e){this.configModal={modalId:"",type:"",headerText:"",icon:"",subtitleText:"",description:"",list:[],listNumber:[],subDescription:"",button:"",link:"",closeModalElements:["header"],...e}}_handleModalStateChange(e){this.visible=e.detail.visible,e.detail.visible&&this._resetConfigHalfModal(this.configModal),e.stopPropagation(),this._dispatchCustomEvent("kyc-validation-mx-half-modal-change",e.detail.visible)}render(){const e=this.configModal||{},t=e.modalId||"",i=e.type||"",s=e.headerText||"",o=e.icon?this._getIcon(e.icon):"",n="full"===i,r=e.subtitleText?this.t(e.subtitleText):"",c=e.description||"",l=e.list||[],u=e.listNumber||[],h=e.subDescription?this.t(e.subDescription):"",p=e.button?this.t(e.button):"",b=e.link?this.t(e.link):"",v=e.link||e.button;return a`
      <bbva-help-modal
        ?visible=${m(this.visible)}
        id-modal="${m(t)}"
        modal-type="${m(i)}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ambient="primary"
        header-text="${m(s)}"
        title-icon="${m(o)}"
        ?full-height="${m(n)}"
        header-close-icon-aria-label="${this.t("bbva-kyc-validation-content-button-aria-label-close-sworn-statement")}"
        @modal-state-change="${this._handleModalStateChange}"
        @help-modal-header-click="${this._handleHeaderClick}"
        .close-modal-elements="${this.closeModalElements}"
      >
        <div slot="slot-content" class="description">
          ${r?a`
            <bbva-type-text class="subtitle-type-text" font-weight="500" text="${r}" size="L"></bbva-type-text>
          `:d}
          <bbva-type-text text="${c}" size="S"></bbva-type-text>
          ${l.length>0?a`
            <ul>
              ${l.map((e=>a`
                <li><bbva-list-bullet>${this.t(e)}</bbva-list-bullet></li>
              `))}
            </ul>
          `:d}
          ${u.length>0?a`
            <ul>
              ${u.map(((e,t)=>a`
                <li>
                  <bbva-list-bullet
                    ordered="true"
                    role="listitem"
                    value="${t+1}"
                    text="${e}"
                  ></bbva-list-bullet>
                </li>
              `))}
            </ul>
          `:d}
          ${h?a`
            <bbva-type-text size="S" text="${h}"></bbva-type-text>
          `:d}
        </div>

        ${v?a`
          <div slot="slot-footer">
            <div class="footer-container">
              ${p?a`
                <div class="button-default">
                  <bbva-button-default text="${p}" @click="${this.exitKyc}"></bbva-button-default>
                </div>
              `:d}
              ${b?a`
                <div class="type-link">
                  <bbva-button-default
                    id="btnPrivacityInfo"
                    text="${b}"
                    variant="link"
                    @click="${()=>{this._dispatchCustomEvent("kyc-validation-mx-close-half-modal",!1)}}">
                  </bbva-button-default>
                </div>
              `:d}
            </div>
          </div>
        `:d}
      </bbva-help-modal>
    `}}customElements.define(ut.is,ut);var ht=o`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

[data-tag-name=bbva-help-modal] .content {
  display: flex;
  flex-direction: column;
}
[data-tag-name=bbva-help-modal] .content [data-tag-name=bbva-button-default] {
  margin-bottom: 1rem;
  padding: 0;
  justify-content: start;
}

[data-tag-name=bbva-form-input] {
  --bbva-form-field--_ambient--bg-color: var(--colorsSecondary100);
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class pt extends(n(k(E(c(i))))){static get is(){return"kyc-job-list-modal"}static get styles(){return[ht,l("kyc-job-list-modal-shared-styles")]}static get scopedElements(){const e=[x,$,re];return pt.scopedElementsFromClasses(e)}static get properties(){return{visible:{type:Boolean},jobTypeList:{type:Array},_jobListFilter:{type:Array}}}constructor(){super(),this.visible=!1,this._jobListFilter=[],this.jobTypeList=[]}closeJobListModal(){this._dispatchCustomEvent("kyc-validation-mx-close-job-list-modal")}_inputSearchOcupations(){return a`
      <bbva-form-input
        label="${this.t("bbva-kyc-job-list-modal-ocupation")}"
        type="text"
        clear-accessible-text="${this.t("bbva-kyc-validation-content-button-aria-label-clear")}"
        @form-input-value-change="${this._filterDataOcupations}"
      >
      </bbva-form-input>
    `}_bbvaJobList(){return a`
      ${this._jobListFilter.map((e=>a`
        <div>
          <bbva-button-default
            variant="link"
            text="${e}"
            name="${e}"
            @click="${this._handleButtonClick}"
          >
          </bbva-button-default>
          </div>
        `))}
    `}_filterDataOcupations(e){const t=e.detail.value.toLowerCase()||"";this._jobListFilter=this.jobTypeList.filter((e=>-1!==e.value.toLowerCase().indexOf(t))).map((e=>e.value))||[]}_handleButtonClick({target:e}){this._dispatchCustomEvent("kyc-validation-mx-job-selected",e.name),this.closeJobListModal()}render(){return a`
      <bbva-help-modal
        ?visible="${this.visible}"
        full-height
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        header-text="${this.t("bbva-kyc-job-list-modal-search-ocupation")}"
        header-close-icon-aria-label="${this.t("bbva-kyc-validation-content-button-aria-label-close")}"
        @help-modal-close="${this.closeJobListModal}">
        <div class="content" slot="slot-content">
          ${this._inputSearchOcupations()} ${this._bbvaJobList()}
        </div>
      </bbva-help-modal>
    `}}customElements.define(pt.is,pt);var mt=o`
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

[data-tag-name=bbva-notification-message] {
  margin-top: 1.5rem;
  --bbva-notification-message-paragraph-weight: bold;
}

[data-tag-name=bbva-type-date] {
  margin-bottom: 1.5rem;
}

.text-subtitle {
  margin-bottom: 1rem;
  margin-top: 0.5rem;
}
`;class bt extends(n(k(E(c(i))))){static get is(){return"kyc-success-modal"}static get styles(){return[mt,L.primary,L.secondary,l("kyc-success-modal-shared-styles")]}static get scopedElements(){const e=[_,M,x,$,D,T,it,P];return bt.scopedElementsFromClasses(e)}static get properties(){return{visible:{type:Boolean},visibleBankOperations:{type:Boolean,attribute:"visible-bank-operations"},operationNumber:{type:String,attribute:"operation-number"},operationDate:{type:String,attribute:"operation-date"},userEmail:{type:String,attribute:"user-email"},_dateOptions:{type:Object},operationData:{type:Object,attribute:"operation-data"}}}constructor(){super(),this.visible=!1,this.visibleBankOperations=!1,this.operationNumber="",this.operationDate="",this.userEmail="",this._dateOptions={day:"2-digit",month:"long",year:"numeric",hour:"2-digit",minute:"2-digit",timeZone:"Mexico/General"},this.operationData={informationAboutYourHabits:[],bankOperations:[],informationPersonalAboutYourAccount:[],informationYourAccount:[],informationBankOfYourAccount:[]}}_handleSuccessModalClose(){this._dispatchCustomEvent("kyc-validation-mx-success-modal-close")}_sectionSubtitle(e){return a`
      <div class="text-subtitle">
        <bbva-header-category .text="${this.t(e)}">
        </bbva-header-category>
      </div>
    `}get _modalContentSuccess(){return a`
      <div slot="slot-content">
        <bbva-clip-microillustration microillustration="success" size="M">
        </bbva-clip-microillustration>
        <bbva-type-text
          tag="h2"
          text="${this.t("bbva-kyc-success-information")}"
          id="successInformation"
        >
        </bbva-type-text>
        <bbva-type-date
          .options="${this._dateOptions}"
          date-clock-suffix="h."
          font-weight="300"
          font-style="italic"
        >
        </bbva-type-date>
        ${this._sectionSubtitle("bbva-kyc-multistep-subtitle-information-about-your-habits")}
        <list-simple
          .items="${this.operationData.informationAboutYourHabits}"
        ></list-simple>
        ${this.visibleBankOperations?a`
              ${this._sectionSubtitle("bbva-kyc-multistep-subtitle-information-bank-operations")}
              <list-simple
                .items="${this.operationData.bankOperations}"
              ></list-simple>
            `:d}
        ${this._sectionSubtitle("bbva-kyc-multistep-subtitle-information-your-account")}
        <list-simple .items="${this.operationData.informationPersonalAboutYourAccount}"></list-simple>
        <list-simple .items="${this.operationData.informationYourAccount}"></list-simple>
        <list-simple .items="${this.operationData.informationBankOfYourAccount}"></list-simple>
        <bbva-type-text
          size="S"
          text="${this.t("bbva-kyc-success-operation-number")}"
          id="operationNumber"
          unset
        >
        </bbva-type-text>
        <bbva-type-text
          size="S"
          text="${this.operationNumber}"
          font-weight="500"
          unset
        >
        </bbva-type-text>
        ${this._contentNotifications}
      </div>
    `}get _contentNotifications(){return a`
      <bbva-notification-message
        message-title="${this.t("bbva-kyc-success-email-advice")}"
        book-title=""
      >
        <bbva-type-text
          size="S"
          text="${this.userEmail}"
          font-weight="500"
          unset
        >
        </bbva-type-text>
      </bbva-notification-message>
      <bbva-notification-message
        message-title="${this.t("bbva-kyc-success-in-case-of-require-data")}"
        book-title=""
      >
      </bbva-notification-message>
    `}render(){return a`
      <bbva-help-modal
        ?visible="${this.visible}"
        id="success"
        ambient="primary"
        full-height
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        header-text="${this.t("bbva-kyc-validation-main-title")}"
        header-close-icon-aria-label="${this.t("bbva-kyc-validation-content-button-aria-label-close")}"
        @header-main-close-icon-click="${this._handleSuccessModalClose}"
      >
        ${this._modalContentSuccess}
      </bbva-help-modal>
    `}}customElements.define(bt.is,bt);var vt=o`
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

.text-subtitle {
  padding: 1rem 0;
}
`;class yt extends(n(k(E(c(i))))){static get is(){return"kyc-error-line-full-modal"}static get styles(){return[vt,G.primaryAlt,l("kyc-error-line-full-modal-shared-styles")]}static get scopedElements(){const e=[_,x,K,T,$,R];return yt.scopedElementsFromClasses(e)}static get properties(){return{visible:{type:Boolean},countServiceErrors:{type:Number},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"}}}constructor(){super(),this.visible=!1,this.countServiceErrors=0,this.iOSFixedHeader=!1}get _modalContent(){return a`
      <div slot="slot-content" class="container">
      <bbva-clip-microillustration
        microillustration="error"
      >
      </bbva-clip-microillustration>
      <bbva-type-text
        text="${this.t("bbva-kyc-error-line-modal-information-not-available")}"
        size="3XL"
        font-weight="700"
      >
      </bbva-type-text>
      <bbva-type-text
        class="description"
        text="${this.t("bbva-kyc-error-line-modal-description")}"
        size="M"
        font-weight="350"
      >
      </bbva-type-text>
      ${this._bbvaPrivacityInfo}
      </div>
    `}_handleModalButtonClick(){this.countServiceErrors<=3?this._dispatchCustomEvent("kyc-validation-mx-error-line-full-modal-retry-request"):this._dispatchCustomEvent("kyc-validation-mx-error-line-full-modal-go-out")}_handleModalGoOutClick(){this._dispatchCustomEvent("kyc-validation-mx-error-line-full-modal-go-out")}render(){return a`
    <bbva-help-modal
      id="errorModal"
      ?visible=${this.visible}
      full-height
      ?i-o-s-fixed-header="${this.iOSFixedHeader}"
      fixed-footer
      header-text="${this.t("bbva-kyc-validation-main-title")}"
      link-text="${this.countServiceErrors<=3?this.t("bbva-kyc-error-line-modal-go-out"):""}"
      button-text="${this.countServiceErrors<=3?this.t("bbva-kyc-error-line-modal-retry"):this.t("bbva-kyc-error-line-modal-go-out")}"
      @help-modal-footer-button-click="${this._handleModalButtonClick}"
      @help-modal-footer-link-click="${this._handleModalGoOutClick}"
      @header-main-close-icon-click="${this._handleModalGoOutClick}"
      header-close-icon-aria-label="${this.t("bbva-kyc-validation-content-button-aria-label-close")}">
      ${this._modalContent}
    </bbva-help-modal>
    `}}customElements.define(yt.is,yt);const _t=[{termType:{id:"BD-MX-AA-CSTKYC-003"},acceptanceMethod:{id:"TA001"},acceptanceMessages:[{value:"BDFACKYC06"}]}];function gt(e,t,i){return{documentType:"O",verificationType:[{id:"NAME"}],metadata:[{key:"DOCUMENT_TYPE_ID",value:e},{key:"PRODUCT",value:"GM"},{key:"OPERATION_TYPE",value:"guardaDoctoOficial"},{key:"REFERENCE_NUMBER",value:t},{key:"PROCEDURE",value:"A2"}],contentInfo:{contentData:`documento ${i}`,contentType:"xml",documentFamily:"xml"},pageType:"FIRST_PAGE",side:"OBVERSE"}}const ft=(e,t,i)=>`<?xml version="1.0" encoding="UTF-8"?>\n    <CONTEXTO>\n      <OPCION>A2</OPCION>\n      <CANAL>GLMO</CANAL>\n      <CVEDOC>${e}</CVEDOC>\n      <PUBLICIDAD>true</PUBLICIDAD>\n      <JSON>BUILD_IT</JSON>\n      <NUMCLIE>${t}</NUMCLIE>\n      <FOLIO_REF>${i}</FOLIO_REF>\n      <IDPROCESO>KYC</IDPROCESO>\n    </CONTEXTO>`;var kt=o`
:host {
  display: block;
  box-sizing: border-box;
  --bbva-progress-content-z-index: 11;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class Et extends(n(k(E(c(i))))){static get is(){return"bbva-feature-kyc-validation-mx"}static get styles(){return[kt,l("bbva-feature-kyc-validation-mx-shared-styles")]}static get scopedElements(){const e=[lt,ut,bt,ot,rt,pt,q,I,N,H,B,j,Oe,Ie,ee,yt,...Et.configurationScopedElements()];return Et.scopedElementsFromClasses(e)}static get properties(){return{showOpenBranchModal:{type:Boolean,attribute:"show-open-branch-modal"},showWelcomeFullModal:{type:Boolean,attribute:"show-welcome-full-modal"},showMultistepPage:{type:Boolean,attribute:"show-multistep-page"},showHalfModal:{type:Boolean,attribute:"show-half-modal"},_showErrorLineModal:{type:Boolean},_halfModalConfig:{type:Object},showJobListModal:{type:Boolean,attribute:"show-list-modal"},_successModalOpened:{type:Boolean},_successModalData:{type:Object},activeSection:{type:Boolean,attribute:"active-section"},disableButton:{type:Boolean,attribute:"disable-button"},buttonBankOperation:{type:Boolean,attribute:"button-bank-operation"},_resetAmount:{type:Boolean},_isHightRiskUser:{type:Boolean},countryStatesList:{type:Array,attribute:"country-states-list"},maritalStatusList:{type:Array,attribute:"marital-status-list"},accountUsageNameList:{type:Array,attribute:"account-usage-name-list"},moneyOriginList:{type:Array,attribute:"money-origin-list"},jobTypeList:{type:Array,attribute:"job-type-list"},jobTypeSecondList:{type:Array,attribute:"job-type-second-list"},economicActivity:{type:Array,attribute:"economic-activity"},idEconomicActivity:{type:String,attribute:"id-economic-activity"},validateJobList:{type:Boolean,attribute:"validate-job-list"},idJob:{type:String,attribute:"id-job"},jobOptionSelected:{type:String,attribute:"job-option-selected"},customerId:{type:String,attribute:"customer-id"},email:{type:String},questionnaireResult:{type:Object,attribute:"questionnaire-result"},_countServiceErrors:{type:Number},_countCatalogRecordsErrors:{type:Number},_countCatalogRecordsSuccess:{type:Number},_lastService:{type:String},_informationAboutYourHabitsList:{type:Array},_bankOperationsList:{type:Array},_informationYourAccountList:{type:Array},_bankingRelationshipList:{type:Array},_informationPersonalAboutYourAccountList:{type:Array},kycDocumentKey:{type:String,attribute:"kyc-document-key"},kycDocumentName:{type:String,attribute:"kyc-document-name"},_termsCreationDate:{type:String},_termsOperationNumber:{type:String},state:{type:Object},comesFromProceedings:{type:Boolean},dateFormat:{type:String},payloadPatchCustomer:{type:Object,attribute:"payload-patch-customer"},payloadpatchEconomicData:{type:Object,attribute:"payload-patch-economic-data"},payloadpostAditionalInformation:{type:Object,attribute:"payload-patch-aditional-information"},payloadPostIdentificationProcessDocument:{type:Object,attribute:"payload-patch-identification-process-document"},customerApiVersion:{type:Number,attribute:"customer-api-version"},catalogsApiVersion:{type:Number,attribute:"catalogs-api-version"},_catalogIds:{type:Object},_expedientStatus:{type:String},_isSpinnerHide:{type:Boolean,state:!0},_occupationFromProceedings:{type:String,state:!0}}}constructor(){super(),this.config={loader:!0},this.showOpenBranchModal=!1,this.showWelcomeFullModal=!1,this.showMultistepPage=!1,this.showHalfModal=!1,this._showErrorLineModal=!1,this._halfModalConfig={},this.showJobListModal=!1,this._successModalOpened=!1,this._successModalData={},this.activeSection=!1,this.disableButton=!1,this.buttonBankOperation=!1,this._resetAmount=!1,this._isHightRiskUser=!1,this.countryStatesList=[],this.maritalStatusList=[],this.accountUsageNameList=[],this.moneyOriginList=[],this.jobTypeList=[],this.jobTypeSecondList=[],this.economicActivity=[],this.idEconomicActivity="",this.idJob="",this.jobOptionSelected="",this._ResponseEconomicActivity="",this.ansEconomicActivity="",this.customerId="",this.email="",this.questionnaireResult={},this._countServiceErrors=0,this._countCatalogRecordsErrors=0,this._countCatalogRecordsSuccess=0,this._lastService="",this._informationAboutYourHabitsList=structuredClone(je),this._bankOperationsList=structuredClone(Fe),this._informationYourAccountList=structuredClone(Ye),this._bankingRelationshipList=structuredClone(Ue),this._informationPersonalAboutYourAccountList=structuredClone(Ve),this.kycDocumentKey="777",this.kycDocumentName="KYC",this._termsCreationDate="",this._termsOperationNumber="",this.state={},this.comesFromProceedings=!1,this.dateFormat="DD [de] MMMM [de] YYYY HH:mm",this.language="es",this.payloadPatchCustomer={},this.payloadpatchEconomicData={},this.payloadpostAditionalInformation={},this.payloadPostIdentificationProcessDocument={},this.customerApiVersion=1,this.catalogsApiVersion=0,this.host="",this.native=!1,this.requiredToken="",this._catalogIds={[Qe.maritalStatus]:"MARITAL_STATUS",[Qe.countryStates]:"00410074E",[Qe.accountUsageName]:"06900074E",[Qe.jobType]:"00350074E",[Qe.moneyOrigin]:"05510074E"},this._expedientStatus="",this._occupationFromProceedings="",this._isSpinnerHide=!1}updated(e){e.has("comesFromProceedings")&&this.comesFromProceedings&&this._validateStatusAction(this._expedientStatus)}initKycFeature(e){Ne(e)||(this._dispatchCustomEvent("init-kyc-refactor"),this._initializeKycData(e),this.comesFromProceedings?this._processProceedingsData(e):this._validateStatusAction(e.expedientStatus))}_initializeKycData(e){const{expedientStatus:t,customerData:i,dataProceedings:s}=e;if(this.comesFromProceedings=(null==s?void 0:s.comesFromProceedings)||!1,t&&!Ne(i)){this.state=e;const{email:t,customerId:s}=i;this.email=t.replace(/^(\*+)([a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,})$/,"•$2"),this.customerId=s}}_processProceedingsData(e){const t=e.dataProceedings.dataServices.at(1);this._occupationFromProceedings=t.value,this.showWelcomeFullModal=!1,this._updateAnswers(this._informationPersonalAboutYourAccountList,e,"dataServices"),this._updateAnswers(this._bankingRelationshipList,e,"dataBanking"),this._updateAnswers(this._informationYourAccountList,e,"dataAccount"),this._updateAboutYourHabitsList(e),this._updateBankOperationsList(e),this._updateBankingRelationshipList(e),this.ansEconomicActivity=this._findValueByName(e.dataProceedings.dataServices||"","bbva-kyc-label-economic-activity")||""}_findValueByName(e,t){const i=e.find((e=>e.name===t));return i?i.value:null}_updateAnswers(e,t,i){e.forEach(((e,s)=>{e.answer=t.dataProceedings[i][s].value||""}))}_updateAboutYourHabitsList(e){e.dataProceedings.dataAboutYourHabits.some((e=>""!==e.value))?this._informationAboutYourHabitsList.forEach(((t,i)=>{t.answer=e.dataProceedings.dataAboutYourHabits[i].value||"","bbva-kyc-answer-no"===t.answer?t.selected="0":["bbva-kyc-answer-yes","bbva-kyc-answer-option-2"].includes(t.answer)&&![0,3].includes(i)&&(t.selected="1"),4===i&&"bbva-kyc-answer-yes"===t.answer&&[5,6].forEach((e=>{this._informationAboutYourHabitsList[e].hidden=!1})),8===i&&"bbva-kyc-answer-yes"===t.answer&&(this.buttonBankOperation=!0,this.activeSection=!0)})):this._informationAboutYourHabitsList=structuredClone(je)}_updateBankOperationsList(e){const t=e.dataProceedings.bankOperations||[];let i=0;this._bankOperationsList.forEach((e=>{const s=t[i];if(e.answer=s.value||"",6!==i?(e.answerAmount=t[i+1].value||"",e.answerReason=t[i+2].value||"",i+=3):i+=1,"bbva-kyc-label-bank-operations-buy-dolars-option-2"===e.answer||"bbva-kyc-label-bank-operations-buy-dolars-option-3"===e.answer){const t=this._bankOperationsList.find((e=>"bbva-kyc-label-bank-operations-4"===e.question));t.hidden=!1,"bbva-kyc-label-bank-operations-buy-dolars-option-3"===e.answer&&(t.form={...t.form,amount:!1,textArea:!1})}}))}_updateBankingRelationshipList(e){this._bankingRelationshipList=this._bankingRelationshipList.map(((t,i)=>{const s={...t};if(s.answer=e.dataProceedings.dataBanking[i].value||"","bbva-kyc-label-bank-relationship-option-2"===s.answer||"bbva-kyc-label-bank-relationship-option-3"===s.answer){const e=this._bankingRelationshipList.find((e=>"bbva-kyc-label-5"===e.question));e&&(e.hidden=!1)}return s}))}get status(){return this.state.expedientStatus}_validateStatusAction(){const e={A:async()=>{this.showWelcomeFullModal=!this.comesFromProceedings,this._dispatchCustomEvent("kyc-validation-mx-scroll"),this.comesFromProceedings&&(await this.updateComplete,this.openMultistep())},C:()=>{this.showOpenBranchModal=!0},R:()=>{this.showOpenBranchModal=!0},default:async()=>{this.showWelcomeFullModal=!this.comesFromProceedings,this._dispatchCustomEvent("kyc-validation-mx-scroll"),this.comesFromProceedings&&(await this.updateComplete,this.openMultistep())}};(e[this.status]||e.default)()}get _serviceRecords(){return this.shadowRoot.querySelector("#catalogsRecordsBaseDm")}get _serviceAppSettings(){return this.shadowRoot.querySelector("#publicSettings")}get _serviceQuestionnaire(){return this.shadowRoot.querySelector("#questionnaire")}get _serviceCustomer(){return this.shadowRoot.querySelector("#customer")}get _serviceEconomicData(){return this.shadowRoot.querySelector("#economicData")}get _serviceAditionalInformation(){return this.shadowRoot.querySelector("#additionalInformation")}get _serviceCustomerTerms(){return this.shadowRoot.querySelector("#customerTerms")}get _serviceCustomerIdentificationProcessDocuments(){return this.shadowRoot.querySelector("#identificationProcessDocuments")}get _serviceSendNotifications(){return this.shadowRoot.querySelector("#sendNotifications")}_getServiceRecords(){this.showLoader(),Object.keys(Qe).forEach((e=>{const t=this._catalogIds[e];t&&("05510074E"===t?this._serviceRecords.getCatalogRecords("05510074E",{pageSize:7,paginationKey:355}):this._serviceRecords.getCatalogRecords(t),"00350074E"===t&&this._serviceRecords.getCatalogRecords("00350074E",{paginationKey:50}))})),this._lastService="_getServiceRecords"}jobListOptionSelected(e){const[,t]=this._informationPersonalAboutYourAccountList;this.economicActivity=[],this.jobOptionSelected=e.detail,t.answer=e.detail,this.jobTypeList.forEach((e=>{e.value===this.jobOptionSelected&&(this.idJob=e.id)})),this.filterEconomicActivities()}filterEconomicActivities(){var e,t;null===(e=this._ResponseEconomicActivity)||void 0===e||null===(t=e.data)||void 0===t||t.OCCUPATIONS.forEach((e=>{e[`${this.idJob}`]&&(this.economicActivity=[...this.economicActivity,{value:e[`${this.idJob}`],id:e.id}])})),this.economicActivity=this._setUpCapitalLetter(this.economicActivity)}_makeGetRequestAppSettings(){this.showLoader();this._serviceAppSettings.getPublicSettings("GLOMO-MX-1.0-TEST",{key:"economic_data"}),this._lastService="_makeGetRequestAppSettings"}_handleAppSettingsSuccess({detail:e}){const[t]=e;this._countServiceErrors=0;const i=t.value,s=JSON.parse(i);this._ResponseEconomicActivity=s,this.comesFromProceedings&&(this.jobOptionSelected=this._occupationFromProceedings);const a={detail:this.jobOptionSelected};this.jobListOptionSelected(a),this._isSpinnerHide=!0,this.clearLoader()}_handleCatalogsSuccess({detail:e}){this._countServiceErrors=0;const t=[{key:"accountUsageName",condition:(e,t)=>Number(e)>=0&&2===e.length&&""!==t},{key:"countryStates",condition:(e,t)=>/\sS.+0+$/.test(t)&&""!==e},{key:"jobType",condition:(t,i)=>3===t.length&&50===e.length&&""!==i},{key:"jobTypeSecond",condition:(t,i)=>3===t.length&&49===e.length&&""!==i},{key:"moneyOrigin",condition:(e,t)=>6===e.length&&""!==t}];let i=Qe.maritalStatus;const s=e.map((({id:e,descriptions:s})=>{let{value:a}=s[0];const o=t.find((({condition:t})=>t(e,a)));i=o?Qe[o.key]:i;const n=1!==e.length&&!["jobType","jobTypeSecond","moneyOrigin"].includes(null==o?void 0:o.key);return a=n?a.slice(0,-11).trim():a,{value:a,id:e}}));this._setUpCatalogsList(i,s),this._countCatalogRecordsSuccess+=1,5===this._countCatalogRecordsSuccess&&this._makeGetRequestAppSettings(),this.clearLoader()}_setUpCapitalLetter(e){return e.map((e=>{const t={...e};return t.value=t.value.charAt(0).toUpperCase()+t.value.slice(1).toLowerCase(),t}))}_setUpCatalogsList(e,t){const i=e;this[`${i}List`]=this._setUpCapitalLetter(t),this[`${i}List`]=[...this[`${i}List`]],"countryStates"===i&&(this.countryStatesList=this.countryStatesList.map((e=>{const t=e.value.toLowerCase();let i;return i="ciudad de mexico"===t?"Ciudad de México":"estado de mexico"===t?"Estado de México":t.split(" ").map((e=>e.charAt(0).toUpperCase()+e.slice(1))).join(" "),{...e,value:i}}))),5===this._countCatalogRecordsSuccess&&(this.jobTypeList=this.jobTypeList.concat(this.jobTypeSecondList))}patchCustomer(){this.showLoader(),this.showMultistepPage=!1,this._serviceCustomer.patchCustomer(this.customerId,this.payloadPatchCustomer),this._lastService="patchCustomer"}_handlePatchCustomerSuccess(){this.clearLoader(),this._countServiceErrors=0,this.patchEconomicData()}patchEconomicData(){this.showLoader(),this.showMultistepPage=!1,this._serviceEconomicData.patchCustomerEconomicData(this.customerId,this.payloadpatchEconomicData),this._lastService="patchEconomicData"}_handleEconomicDataPatchSuccess(){this.clearLoader(),this._countServiceErrors=0,this.postAditionalInformation()}postAditionalInformation(){this.showLoader(),Object.keys(this.payloadpostAditionalInformation).length?(this._serviceAditionalInformation.postCustomerAdditionalInformation(this.customerId,this.payloadpostAditionalInformation),this._lastService="postAditionalInformation"):this.putQuestionnaire()}_handleAditionalInformationPostSuccess(){this.clearLoader(),this._countServiceErrors=0,this.putQuestionnaire()}putQuestionnaire(){this.showLoader(),this._serviceQuestionnaire.putCustomerQuestionnaire(this.customerId,"KYC",this.questionnaireResult),this._lastService="putQuestionnaire"}_handleQuestionnairesPutSuccess(){this.clearLoader(),this._countServiceErrors=0,this.showMultistepPage=!1,this.postCustomerTerms()}postCustomerTerms(){this.showLoader(),this.showMultistepPage=!1,this._serviceCustomerTerms.postCustomerTerms(this.customerId,_t),this._lastService="postCustomerTerms"}_handleTermsPostSuccess({detail:e}){this.clearLoader(),this._countServiceErrors=0,this.showMultistepPage=!1,0!==Object.keys(e).length&&(this._termsCreationDate=e.creationDate||"",this._termsOperationNumber=(e.operationTracking||{}).operationNumber||"",this._dispatchCustomEvent("kyc-validation-mx-app-completed",{operationNumber:this._termsOperationNumber}),this.postIdentificationProcessDocument())}postIdentificationProcessDocument(){if(this.showMultistepPage=!1,this.showLoader(),this._lastService="postIdentificationProcessDocument",this.native)this._serviceCustomerIdentificationProcessDocuments.multipart=this._generateMultipartData(),this._serviceCustomerIdentificationProcessDocuments.postCustomerIdentificationProcessDocuments(this.customerId);else{const e=this._generateBodyForIdProcessViaXMLMultipart();this._serviceCustomerIdentificationProcessDocuments.postCustomerIdentificationProcessDocuments(this.customerId,e)}}_generateMultipartData(){const e=gt(this.kycDocumentKey,this._termsOperationNumber,this.kycDocumentName),t=ft(this.kycDocumentKey,this.state.customerData.clientId,this._termsOperationNumber);return{type:"multipart/form-data",formDataParts:[{name:"documentInfo",body:{mediaType:"application/json",content:JSON.stringify(e)}},{name:"file",filename:"kyc_document.xml",body:{mediaType:"text/xml",content:btoa(t)}}]}}_generateIdProcessXMLFile(){const e=ft(this.kycDocumentKey,this.state.customerData.clientId,this._termsOperationNumber);return new Blob([e],{type:"text/xml"})}_generateIdProcessJSONMetadata(){const e=gt(this.kycDocumentKey,this._termsOperationNumber,this.kycDocumentName);return new Blob([JSON.stringify(e)],{type:"application/json"})}_generateBodyForIdProcessViaXMLMultipart(){const e=new FormData,t=this._generateIdProcessXMLFile(),i=this._generateIdProcessJSONMetadata();return e.append("file",t),e.append("documentInfo",i),e}_getMultipartHeaders(){return{"Accept-Language":"es","Content-Type":"multipart/form-data"}}_handleIdentificationProcessDocumentPostSuccess(){this.clearLoader(),this._countServiceErrors=0,this._dispatchCustomEvent("kyc-validation-mx-reset-profile",{value:!1}),this.showMultistepPage=!1,this._successModalOpened=!0,this._sendNotification()}_sendNotification(){this.showLoader();const e=(t=this._termsCreationDate,null===(i=He(t))||void 0===i?void 0:i.locale("es-MX")).format("DD [de] MMMM [de] YYYY HH:mm");var t,i;const s=function(e,t,i){const s=t.substring(t.length-5);return{eventCode:"A000000353",senderId:"0000000001",message:{messageBody:`{"sNOMBRE":"${e}","sFINANCIEROS":"Hábitos financieros","sFECHA":"${t.substring(0,t.length-6)}     ",   "sHORA":"${s}",   "sFOLIO":"${i}"}`}}}(this.state.customerData.firstName||"",e,this._termsOperationNumber);this._serviceSendNotifications.postNotificationSend(s),this.clearLoader(),this._successModalOpened=!0}openMultistep(){this.showMultistepPage=!0,this.showWelcomeFullModal=!1,this._getServiceRecords(),this._dispatchCustomEvent("kyc-validation-mx-show-multistep")}openModal(e){const t=e.detail.nameModal,i=e.detail.config||{};var s,a;("OpenBranchModal"===t&&(this._isHightRiskUser=!0,this._dispatchCustomEvent("kyc-validation-mx-write-exception-case",{key:"know_your_client_exception",value:"true"}),this._dispatchCustomEvent("kyc-validation-mx-reset-profile",{value:!1})),this[`show${t}`]=!0,this._halfModalConfig=i,this.comesFromProceedings)||(this.disableButton=null===(s=e.detail)||void 0===s?void 0:s.buttonDisable,this.buttonBankOperation=null===(a=e.detail)||void 0===a?void 0:a.sectionBankOperation)}closeHalfModal(){this.showHalfModal=!1}closeBranchModal(){this.showOpenBranchModal=!1,this.showMultistepPage=!1,this.comesFromProceedings?this._dispatchCustomEvent("kyc-validation-mx-navigate-to-entry-point"):this.closeWelcomeModal()}closeJobListModal(){this.showJobListModal=!1}closeWelcomeModal(){this.showWelcomeFullModal=!1,this._dispatchCustomEvent("kyc-validation-mx-go-back")}_exitKyc(){this._resetOperative()}_closeSuccessModal(){this._dispatchCustomEvent("kyc-validation-mx-ui-write-just-updated-flag",!0),this._resetOperative(),this._dispatchCustomEvent("kyc-validation-mx-go-back")}_handleServicesError({detail:{messages:e=[]}}){this.clearLoader();const t={6:1,12:2,18:3,24:4},[{message:i,code:s}={}]=e;switch(!0){case"putQuestionnaire"===this._lastService&&["PEE1117#CLIENTE CON RIESGO MEDIO","PEE1117#CLIENTE CON RIESGO ALTO"].includes(i):this.openModal({detail:{nameModal:"OpenBranchModal"}});break;case"functionalError"===s&&"PEE1117#E1 ERROR EN DATOS DE ENTRADA RUT:EU7CEXP0"===i:"patchCustomer"===this._lastService?this._handlePatchCustomerSuccess():this._handleEconomicDataPatchSuccess(),this.postAditionalInformation();break;case"_getServiceRecords"===this._lastService:this._countCatalogRecordsErrors+=1,this._countServiceErrors=t[this._countCatalogRecordsErrors]||this._countServiceErrors,this._showErrorLineModal=!0;break;default:this._countServiceErrors+=1,this._showErrorLineModal=!0}}_completedQuestionnaire(){this.activeSection||(this._bankOperationsList=[]),this._successModalData={informationAboutYourHabits:this._informationAboutYourHabitsList.length?this._informationAboutYourHabitsList:je,informationBankOfYourAccount:this._bankingRelationshipList,informationPersonalAboutYourAccount:this._informationPersonalAboutYourAccountList,informationYourAccount:this._informationYourAccountList,bankOperations:this._bankOperationsList},this.questionnaireResult=function(e){if(!e)return null;const t=e.informationAboutYourHabits||[],i=e=>t[e].config[t[e].selected].key,s=i(1),a=i(0),o=i(2),n=i(3),r=i(5),c=i(6),l=(e.informationBankOfYourAccount||[]).reduce(((e,t)=>(e[t.question]=t.answer,e))),d=l.options[l.answer.at(-1)-1].key||null,u=e.informationYourAccount||[],h=e=>u.find((t=>t.question===e))||{},p=h("bbva-kyc-label-2")||{},m=h("bbva-kyc-label-1")||{},b=h("bbva-kyc-label-3")||{},v=!(!e.bankOperations||!e.bankOperations.length),y=t=>e.bankOperations[t]||{},_=e=>y(e).options.find((t=>t.value===y(e).answer))||{},g=y(0),f=y(1),k=y(2),E=y(3);let S=2e3,A="";return"bbva-kyc-label-bank-operations-buy-dolars-option-1"!==k.answer&&(S=E.answerAmount||2e3,A=E.answerReason||""),{questionnaire:{questionnaireType:"KYC",politicActivity:{isPublicOfficer:s},representations:[{representationType:{id:a}}],hasInternationalOperations:o,hasThirdPartyFunds:n,bank:{relationType:d},account:{purpose:{id:p.key||null,description:p.answer||""},sourceFunds:{id:m.key||null,description:m.answer||"",location:{id:b.key||null,formattedAddress:b.answer||""}},operations:[{operationType:"INCOME",amount:{amount:v?Number(g.answerAmount)||0:2e5,currency:"MXN"},reason:v&&g.answerReason||"",totalOperations:v?_(0).key||0:6},{operationType:"TRANSFER",amount:{amount:v?Number(f.answerAmount)||0:2e5,currency:"MXN"},reason:v&&f.answerReason||"",totalOperations:v?_(1).key||0:5,source:{location:{id:b.key||null,formattedAddress:b.answer||""}},destination:{location:{id:b.key||null,formattedAddress:b.answer||""}}},{operationType:"FOREIGN_CURRENCY",amount:{amount:v?S:2e3,currency:"USD"},reason:v?A:"",totalOperations:v&&_(3).key||0}]},credit:{usesCash:r,paysInAdvance:c}}}}(this._successModalData),this._updateMaritalStatus(),this._updateEconomicData(),this._updateAdditionalInformation(),this._updateIdentificationProcessDocument(),this.comesFromProceedings||this.patchCustomer(),0===this._informationAboutYourHabitsList.length&&(this._informationAboutYourHabitsList=structuredClone(je))}_updateMaritalStatus(){let e;const[t]=this._informationPersonalAboutYourAccountList;this.maritalStatusList.forEach((i=>{i.value===t.answer&&(e=i.id)}));const i=Be[e];this.payloadPatchCustomer={maritalStatus:{id:i}}}_updateEconomicData(){const e=this.economicActivity.find((e=>this.ansEconomicActivity===e.value));e&&(this.idEconomicActivity=e.id),this.payloadpatchEconomicData={reason:"UPGRADE_ACCOUNT",economicActivity:{id:this.idEconomicActivity},occupationType:{id:this.idJob}}}_updateAdditionalInformation(){const[,e,t]=this._bankingRelationshipList,i=e.answer||"",s=t.answer||"";this.payloadpostAditionalInformation=i&&s?{mainExternalInterbankClabe:i,eSignatureSerialNumber:s}:i?{mainExternalInterbankClabe:i}:s?{eSignatureSerialNumber:s}:{}}_updateIdentificationProcessDocument(){this.payloadPostIdentificationProcessDocument=this._generateBodyForIdProcessViaXMLMultipart()}_handleFullModalFooterButton(){this._showErrorLineModal=!1,this[`${this._lastService}`]()}_resetOperative(){this.showMultistepPage=!1,this._showErrorLineModal=!1,this._successModalOpened=!1,this._informationPersonalAboutYourAccountList=structuredClone(Ve),this._informationAboutYourHabitsList=structuredClone(je),this._bankOperationsList=structuredClone(Fe),this._informationYourAccountList=structuredClone(Ye),this._bankingRelationshipList=structuredClone(Ue),this.disableButton=!1,this.buttonBankOperation=!1,this.activeSection=!1,this.jobOptionSelected="",this.closeWelcomeModal(),this.comesFromProceedings=!1,this._countCatalogRecordsSuccess=0,this.showJobListModal=!1,this.economicActivity=[],this._isSpinnerHide=!1}sendDataProceedings(){if(!this.comesFromProceedings)return;this._setKeys(),this._validateOpenBankOperations(),this._processBankOperations(),this._validateCreditsInOtherBanks(),this._validateAccountClabe(),this._updateDataProceedings(),this._completedQuestionnaire();const e=this._prepareDataForProceedings();this._isHightRiskUser||(this._dispatchCustomEvent("kyc-validation-mx-send-data-proceedings",e),this._resetOperative())}_setKeys(){const[e,t,i]=this._informationYourAccountList;this.accountUsageNameList.forEach((e=>{t.answer===e.value&&(t.key=e.id)})),Ze.forEach((t=>{e.answer===t.value&&(e.key=t.id)})),this.countryStatesList.forEach((e=>{i.answer===e.value&&(i.key=e.id)}))}_processBankOperations(){const e=this._bankOperationsList.find((e=>"bbva-kyc-label-bank-operations-3"===e.question)),{answer:t}=e,i=this._bankOperationsList.filter((e=>"bbva-kyc-label-bank-operations-4"===e.question));"bbva-kyc-label-bank-operations-buy-dolars-option-1"===t?this._clearBankOperationDetails(i):"bbva-kyc-label-bank-operations-buy-dolars-option-2"===t&&this._clearBankOperationDetails(i,["answerAmount","answerReason"])}_clearBankOperationDetails(e,t=["answer","answerAmount","answerReason"]){e.forEach((e=>{t.forEach((t=>{void 0!==e[t]&&(e[t]="")}))}))}_validateOpenBankOperations(){const e=this._informationAboutYourHabitsList.find((e=>"bbva-kyc-question-9"===e.question)),{answer:t}=e;"bbva-kyc-answer-no"===t&&this._bankOperationsList.forEach((e=>{this._clearBankOperationDetails([e])}))}_validateAccountClabe(){const e=this._bankingRelationshipList.find((e=>"bbva-kyc-label-4"===e.question)),{answer:t}=e;"bbva-kyc-label-bank-relationship-option-1"===t&&(this._bankingRelationshipList.find((e=>"bbva-kyc-label-5"===e.question)).answer="")}_validateCreditsInOtherBanks(){const e=this._informationAboutYourHabitsList,t=e.find((e=>"bbva-kyc-question-5"===e.question)),i=e.find((e=>"bbva-kyc-question-6"===e.question)),s=e.find((e=>"bbva-kyc-question-7"===e.question));t&&"bbva-kyc-answer-yes"===t.answer&&("0"===i.selected&&(i.answer="bbva-kyc-answer-option-1"),"0"===s.selected&&(s.answer="bbva-kyc-answer-no"))}_updateDataProceedings(){let e=0;const t=this._informationAboutYourHabitsList.find((e=>"bbva-kyc-question-5"===e.question)),{answer:i}=t;this._informationPersonalAboutYourAccountList.forEach(((e,t)=>{et.dataServices[t].value=e.answer})),this._informationAboutYourHabitsList.forEach(((e,t)=>{"bbva-kyc-answer-no"===i&&this._clearHabitQuestions([5,6]),et.dataAboutYourHabits[t].value=e.answer})),this._bankOperationsList.forEach((t=>{et.bankOperations[e].value=t.answer,6!==e?(et.bankOperations[e+1].value=t.answerAmount,et.bankOperations[e+2].value=t.answerReason,e+=3):e+=1})),this._informationYourAccountList.forEach(((e,t)=>{et.dataAccount[t].value=e.answer})),this._bankingRelationshipList.forEach(((e,t)=>{et.dataBanking[t].value=e.answer}))}_clearHabitQuestions(e){e.forEach((e=>{this._informationAboutYourHabitsList[e]&&(this._informationAboutYourHabitsList[e].answer="")}))}_prepareDataForProceedings(){return{dataProceedings:et,payloadPatchCustomer:this.payloadPatchCustomer,payloadpatchEconomicData:this.payloadpatchEconomicData,...Object.keys(this.payloadpostAditionalInformation).length>0&&{payloadpostAditionalInformation:this.payloadpostAditionalInformation},payloadQuestionnaires:this.questionnaireResult,payloadCustomerTerms:_t,payloadIdentificationProcessDocument:this.payloadPostIdentificationProcessDocument}}_openModalPrivacy(e){this._halfModalConfig=e.detail.config,this.showHalfModal=!0}get _tplsDm(){return a`
      <bbva-global-catalog-records-api-dm
      id="catalogsRecordsBaseDm"
      .host="${this.host}"
      .version="${this.catalogsApiVersion}"
      ?native="${this.native}"
      .requiredToken="${this.requiredToken}"
      @catalog-records-api-dm-fetch="${this._handleCatalogsSuccess}"
      @catalog-records-api-dm-fetch-error="${this._handleServicesError}"
      @api-dm-error="${this._handleServicesError}"
    >
    </bbva-global-catalog-records-api-dm>

    <bbva-global-public-settings-api-dm
      id="publicSettings"
      .host="${this.host}"
      .version="${this.catalogsApiVersion}"
      ?native="${this.native}"
      .requiredToken="${this.requiredToken}"
      @public-settings-api-dm-fetch="${this._handleAppSettingsSuccess}"
      @public-settings-api-dm-fetch-error="${this._handleServicesError}"
      @api-dm-error="${this._handleServicesError}"
    >
    </bbva-global-public-settings-api-dm>

    <bbva-local-customer-questionnaire-api-dm
      id="questionnaire"
      .host="${this.host}"
      .version="${this.customerApiVersion}"
      ?native="${this.native}"
      .requiredToken="${this.requiredToken}"
      @customer-questionnaire-api-dm-update="${this._handleQuestionnairesPutSuccess}"
      @customer-questionnaire-api-dm-update-error="${this._handleServicesError}"
      @api-dm-error="${this._handleServicesError}"
    >
    </bbva-local-customer-questionnaire-api-dm>

    <bbva-local-customer-api-dm
      id="customer"
      .host="${this.host}"
      .version="${this.customerApiVersion}"
      ?native="${this.native}"
      .requiredToken="${this.requiredToken}"
      ?requiredOTP="${!0}"
      @customer-api-dm-update="${this._handlePatchCustomerSuccess}"
      @customer-api-dm-update-error="${this._handleServicesError}"
      @api-dm-error="${this._handleServicesError}"
    >
    </bbva-local-customer-api-dm>

    <bbva-local-customer-economic-data-api-dm
      id="economicData"
      .host="${this.host}"
      .version="${this.customerApiVersion}"
      ?native="${this.native}"
      .requiredToken="${this.requiredToken}"
      ?requiredOTP="${!0}"
      @customer-economic-data-api-dm-update="${this._handleEconomicDataPatchSuccess}"
      @customer-economic-data-api-dm-update-error="${this._handleServicesError}"
      @api-dm-error="${this._handleServicesError}"
    >
    </bbva-local-customer-economic-data-api-dm>

    <bbva-local-customer-additional-information-api-dm-mx
      id="additionalInformation"
      .host="${this.host}"
      .version="${this.customerApiVersion}"
      ?native="${this.native}"
      .requiredToken="${this.requiredToken}"
      @customer-additional-information-api-dm-create="${this._handleAditionalInformationPostSuccess}"
      @customer-additional-information-api-dm-create-error="${this._handleServicesError}"
      @api-dm-error="${this._handleServicesError}"
    >
    </bbva-local-customer-additional-information-api-dm-mx>

    <bbva-global-customer-terms-api-dm
      id="customerTerms"
      .host="${this.host}"
      .version="${this.customerApiVersion}"
      ?native="${this.native}"
      .requiredToken="${this.requiredToken}"
      ?requiredOTP="${!0}"
      @customer-terms-api-dm-create="${this._handleTermsPostSuccess}"
      @customer-terms-api-dm-create-error="${this._handleServicesError}"
      @api-dm-error="${this._handleServicesError}"
    >
    </bbva-global-customer-terms-api-dm>

    <bbva-global-customer-identification-process-documents-api-dm
      id="identificationProcessDocuments"
      .host="${this.host}"
      .version="${this.customerApiVersion}"
      ?native="${this.native}"
      .requiredToken="${this.requiredToken}"
      ?requiredOTP="${!0}"
      .headers="${this._getMultipartHeaders()}"
      ?forceBoundary="${this.native}"
      @customer-identification-process-documents-api-dm-create="${this._handleIdentificationProcessDocumentPostSuccess}"
      @customer-identification-process-documents-api-dm-create-error="${this._handleServicesError}"
      @api-dm-error="${this._handleServicesError}"
    >
    </bbva-global-customer-identification-process-documents-api-dm>

    <bbva-local-notifications-send-api-dm
      id="sendNotifications"
      .host="${this.host}"
      .version="${this.catalogsApiVersion}"
      ?native="${this.native}"
      .requiredToken="${this.requiredToken}"
    >
    </bbva-local-notifications-send-api-dm>
    `}render(){return a`
      ${super.render()}
      ${this._tplsDm}
      <kyc-welcome-full-modal
        ?visible="${this.showWelcomeFullModal}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        @kyc-validation-mx-open-multistep="${this.openMultistep}"
        @kyc-validation-mx-open-half-modal-privacy-policy="${this._openModalPrivacy}"
        @kyc-validation-mx-welcome-full-modal-close="${this.closeWelcomeModal}"
      >
      </kyc-welcome-full-modal>

      <kyc-multistep-page
        ?visible="${this.showMultistepPage}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ?disable-button="${this.disableButton}"
        ?reset-amountt="${this._resetAmount}"
        ?open-bank-operations="${this.buttonBankOperation}"
        ?comes-from-proceedings="${this.comesFromProceedings}"
        ?is-spinner-hide="${this._isSpinnerHide}"
        .countryStatesList="${this.countryStatesList}"
        .maritalStatusList="${this.maritalStatusList}"
        .accountUsageNameList="${this.accountUsageNameList}"
        .moneyOriginList="${this.moneyOriginList}"
        job-option-selected="${this.jobOptionSelected}"
        .economicActivity="${this.economicActivity}"
        .informationAboutYourHabitsList="${this._informationAboutYourHabitsList}"
        .bankOperationsList="${this._bankOperationsList}"
        .informationYourAccountList="${this._informationYourAccountList}"
        .bankingRelationshipList="${this._bankingRelationshipList}"
        .informationPersonalAboutYourAccountList="${this._informationPersonalAboutYourAccountList}"
        @kyc-validation-mx-open-branch-full-modal="${this.openModal}"
        @kyc-validation-mx-open-half-modal-public-charge="${this.openModal}"
        @kyc-validation-mx-open-half-modal-monthly-operations="${this.openModal}"
        @kyc-validation-mx-open-half-modal-monthly-transferes="${this.openModal}"
        @kyc-validation-mx-open-half-modal-sworn-declaration="${this.openModal}"
        @kyc-validation-mx-open-half-modal-exit="${this.openModal}"
        @kyc-validation-mx-open-job-list-modal="${this.openModal}"
        @form-field-input-focus="${()=>{this._dispatchCustomEvent("form-field-input-focus")}}"
        @form-field-input-blur="${()=>{this._dispatchCustomEvent("form-field-input-blur")}}"
        @kyc-validation-mx-completed-questionnaire="${this._completedQuestionnaire}"
        @kyc-validation-mx-information-about-your-habits="${e=>{this._informationAboutYourHabitsList=e.detail.answer,this.activeSection=e.detail.button}}"
        @kyc-validation-mx-information-bank-operations="${e=>{this._bankOperationsList=e.detail.answer}}"
        @kyc-validation-mx-information-answer-data-services-information-personal="${e=>{this._informationPersonalAboutYourAccountList=e.detail.list,this.idEconomicActivity=e.detail.id}}"
        @kyc-validation-mx-information-answer-data-services-your-account="${e=>{this._informationYourAccountList=e.detail}}"
        @kyc-validation-mx-information-banking-relationship="${e=>{this._bankingRelationshipList=e.detail}}"
        @kyc-validation-mx-prepare-data-for-proceedings="${this.sendDataProceedings}"
      >
      </kyc-multistep-page>

      <kyc-half-modal
        id="${this._halfModalConfig.modalId}"
        ?visible="${this.showHalfModal}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        .configModal="${this._halfModalConfig}"
        @kyc-validation-mx-half-modal-change="${e=>{this.showHalfModal=e.detail}}"
        @kyc-validation-mx-half-modal-header-click="${this.closeHalfModal}"
        @kyc-validation-mx-exit-component="${this._exitKyc}"
        @kyc-validation-mx-close-half-modal="${this.closeHalfModal}"
      >
      </kyc-half-modal>

      <kyc-job-list-modal
        ?visible="${this.showJobListModal}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        .jobTypeList="${this.jobTypeList}"
        @kyc-validation-mx-close-job-list-modal="${this.closeJobListModal}"
        @kyc-validation-mx-job-selected="${this.jobListOptionSelected}"
      >
      </kyc-job-list-modal>

      <kyc-branch-full-modal
        ?visible="${this.showOpenBranchModal}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        @kyc-validation-mx-branch-to-exit="${this.closeBranchModal}"
      >
      </kyc-branch-full-modal>

      <kyc-error-line-full-modal
        ?visible="${this._showErrorLineModal}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        @kyc-validation-mx-error-line-full-modal-retry-request="${this._handleFullModalFooterButton}"
        @kyc-validation-mx-error-line-full-modal-go-out="${this._exitKyc}"
        countServiceErrors="${this._countServiceErrors}"
      >
      </kyc-error-line-full-modal>

      <kyc-success-modal
        ?visible="${this._successModalOpened}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ?visible-bank-operations="${this.activeSection}"
        .operationData="${this._successModalData}"
        operation-number="${this._termsOperationNumber}"
        operation-date="${this._termsCreationDate}"
        user-email="${this.email}"
        @kyc-validation-mx-success-modal-close="${this._closeSuccessModal}"
      >
      </kyc-success-modal>
    `}}customElements.define(Et.is,Et);class St extends(J(i)){static get is(){return"bbva-analyticmanager-kyc-validation-mx"}static get properties(){return{analyticsConfig:{type:Object},segments:{type:Object},segmentProfile:{type:String},customFields:{type:String},typology:{type:String},primaryCategory:{type:String},productName:{type:String}}}constructor(){super(),this.analyticsConfig={},this.segmentProfile="",this.customFields="",this.typology="",this.primaryCategory="",this.productName="",this.segments={warningNominees:"nominados alertados",proactiveNominees:"proactivos nominados",nonNominatedProactive:"proactivos no nominados",profile:"perfil"}}appPageVisit(){this.segmentProfile=this.segments[this.analyticsConfig.segmentProfile]||"perfil",this.analyticsConfig.completedModules?(this.customFields=`modulos completados:${this.analyticsConfig.completedModules}`,this.primaryCategory=this.analyticsConfig.primaryCategory,this.productName=this.analyticsConfig.productName,this.typology=this.analyticsConfig.level3):(this.customFields="",this.primaryCategory="",this.productName="",this.typology="perfil"),this.persistData({segmentProfile:this.segmentProfile,customFields:this.customFields,typology:this.typology,primaryCategory:this.primaryCategory,productName:this.productName}),this.firePageVisit()}appPageStarted(){this._dispatch("bbva-analytics-manager-kyc-validation-mx-app-page-started",this.data)}appPageStepSumary(){this._dispatch("bbva-analytics-manager-kyc-validation-mx-app-page-sumary",this.data)}appPageConfirmation(){this._dispatch("bbva-analytics-manager-kyc-validation-mx-app-page-confirmation",this.data)}appPageOtp(){this.analyticsConfig.completedModules?this.customFields=`firma:token, ${this.customFields}`:this.customFields="firma:token",this.persistData({customFields:this.customFields}),this._dispatch("bbva-analytics-manager-kyc-validation-mx-app-page-otp",this.data)}appCompleted({operationNumber:e}){e&&(this.persistData({operationNumber:e}),this.fireAppCompleted())}appFootPrint(){this._dispatch("bbva-analytics-manager-kyc-validation-mx-app-footPrint",{})}appErrorRetryRequest(){this._dispatch("bbva-analytics-manager-kyc-validation-mx-app-error-retry-request",{})}appErrorGoOut(){this._dispatch("bbva-analytics-manager-kyc-validation-mx-app-error-go-out",{})}}customElements.define(St.is,St);
