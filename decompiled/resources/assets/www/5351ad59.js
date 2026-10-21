import{H as e,aZ as t,J as i,L as s,a7 as r,an as a,aj as o,az as n,h as l,z as c,a8 as d,ac as h,ab as p,ad as u,ar as g,a9 as m,aa as b,a as v,cR as y,bU as _,F as f,ag as k,b6 as S,bF as x,ak as T,cS as R,b0 as E,av as $,o as C,m as I,cG as L,f as w,g as q,cU as A,aX as P,b1 as O,cD as M,aL as H,bf as j,be as D,bc as N,bY as V,D as B,A as F,aK as G,bh as U,i as z,G as K,aI as W}from"./952f98a9.js";import{a7 as J,a$ as X,bt as Y}from"./7f3d7ca9.js";import{B as Q}from"./af0d21d4.js";import"./216055dc.js";import{b as Z,B as ee}from"./8f7ccd2d.js";import"./c0a2f832.js";import"./cae0f1de.js";const te=e((e=>class extends e{static get properties(){return{host:{type:String,attribute:"host"},native:{type:Boolean},requiredToken:{type:String,attribute:"required-token"},language:{type:String},headers:{type:Object},ambient:{type:String,reflect:!0},locale:{type:String},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"},publicSettingsHost:{type:String,attribute:"public-settings-host"},publicSettingsRequiredToken:{type:String,attribute:"public-settings-required-token"},history:{type:Object}}}constructor(){super(),this.native=!1,this.iOSFixedHeader=!1,this.publicSettingsRequiredToken="none"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.addEventListener("help-modal-open",this._handleModalState),this.addEventListener("help-modal-close",this._handleModalState),this.setAttribute("data-tag-name",this.constructor.is)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("help-modal-open",this._handleModalState),this.removeEventListener("help-modal-close",this._handleModalState)}static scopedElementsFromClasses(e){return e.reduce(((e,t)=>(e[t.is]=t,e)),{})}_handleModalState(e){var t;const i=null==e||null===(t=e.detail)||void 0===t?void 0:t.modal;this.dispatchEvent(new CustomEvent("modal-state-change",{bubbles:!0,composed:!0,detail:{visible:null==i?void 0:i.visible,modal:i}}))}}));class ie{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let i=Object(this),s=i.length>>>0;if(0===s)return!1;let r=0|t,a=Math.max(r>=0?r:s-Math.abs(r),0);for(;a<s;){if((o=i[a])===(n=e)||"number"==typeof o&&"number"==typeof n&&isNaN(o)&&isNaN(n))return!0;a++}var o,n;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var i=[],s=0,r="",a=0,o=arguments.length;a!==o;++a){var n=+arguments[a];if(!(n<1114111&&n>>>0===n))throw RangeError("Invalid code point: "+n);n<=65535?s=i.push(n):(n-=65536,s=i.push(55296+(n>>10),n%1024+56320)),s>=16383&&(r+=e.apply(null,i),i.length=0)}return r+e.apply(null,i)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",i=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${i&&i.message}`)}}class se extends ie{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}}const re=0,ae=1,oe="jwt",ne="tsec",le="none";class ce extends ie{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=re,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new se,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=ne:this.requiredToken=le,this.requiresJWT=!1):this.requiredToken===ne?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===oe?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===le?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(ne)}_setJwtHandler(){this._setTokenHandler(oe)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((i,s)=>{t=Object.assign(t,{resolve:i,reject:s}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let i=this._getRequestHeaders();Object.keys(i).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,i[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=t),e}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let i=e.replace(/[\{\}]+/g,""),s=t[i];return s?delete t[i]:this._error(9,`Missing ${i} param value`),s})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let i=Object.keys(t);i.length&&(e=[e,i.map((e=>{let i=t[e];return Array.isArray(i)&&this.paramArrayMode===ae?this._arrayToQueryParam(e,i):`${e}=${i}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(ne,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(oe,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(i){var s=t.getItem(i);s&&"null"!==s&&(e[i]=s)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const i=window.sessionStorage;t=Object.keys(i).filter((t=>t.startsWith(e))).reduce(((t,s)=>(t[s.replace(e,"")]=i.getItem(s),t)),{})}return t}_getTokenForRequestHeaders(e,t){const i=`${e}Handler`,s=e===oe?"JWT ":"",r=e===oe?"Authorization":ne;if(void 0===this[i]||null===this[i])this._error(11,`${e} handler is undefined`);else{const a=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let o=this[i].getItem(a);o?t[r]=t[r]||s+o:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((i=>{t.push(`${i}=${e[i]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let i;const s=new Promise(((e,t)=>{i=(i,s)=>{i?t(i):e(s)}}));return t.addEventListener("loadend",(function e(s){t.removeEventListener("loadend",e),s.error?i(s.error):i(null,t.result)})),t.readAsText(e),s}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let i=0;for(;i<e.length;){let s=e[i],r=0,a=0;if(s<=127?(r=0,a=255&s):s<=223?(r=1,a=31&s):s<=239?(r=2,a=15&s):s<=244&&(r=3,a=7&s),e.length-i-r>0){let t=0;for(;t<r;)s=e[i+t+1],a=a<<6|63&s,t+=1}else a=65533,r=e.length-i;t+=String.fromCodePoint(a),i+=r+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},i=e.trim().split(/[\r\n]+/);for(const e in i)if(i.hasOwnProperty(e)&&""!==i[e]){let s=": ",r=i[e].split(s);t[r.shift().toLowerCase()]=r.join(s)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,i,s){let r=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(s)>=0&&(r=t.getResponseHeader(s));break;case this._NATIVE_XHR:t&&t.headers&&(r=JSON.parse(t.headers)[s])}if(r){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):i;e.getItem(t)!==r&&(e.setItem(t,r),this._emitTokenUpdate(i,r))}}_emitTokenUpdate(e,t){if(this.htmlContext){const i=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(i)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,i,s,r,a;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),i=e.getResponseHeader("AuthenticationData"),s=e.getResponseHeader("AuthenticationState"),r=e.getResponseHeader("AuthenticationChallenge"),a=e.getResponseHeader("AuthenticationResponse");else{let o=JSON.parse(e.headers);t=o.authenticationtype,i=o.authenticationdata||null,s=o.authenticationstate,r=o.authenticationchallenge,a=o.authenticationresponse}return{type:t,data:i,state:s,challenge:r,response:a}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",i=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const s=this._getSignatureData(e,t,i);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:s}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",i="",s=""){let r;if("object"==typeof e&&e){const a=this._getSignatureData(e.signatureType,t,i);r=this._makeKeyValuePairFromObject(a,e.signatureValue),e.challenge&&(r+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(r,e.signatureType,s)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(r=`password=${e}`,this._buildSignatureHeaders(r,"2",s)):(r=`${i}=${e}`,this._buildSignatureHeaders(r,t,s)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let i,s=e.split(",");if(s.length>1){i=s.map((e=>`${e}=${t[e]}`)).join(",")}else i=`${e}=${t}`;return i}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",i=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),i&&(this.headers=Object.assign(this.headers,{AuthenticationState:i})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),r=this._ERROR_CODES.SIGNATURE_INVALID.includes(s),{type:a,data:o,state:n,challenge:l,response:c}=this._extractSignatureResponseHeaders(e),d=this._getRequestMetadata(e);if(r)this._notifySignatureInvalid(d),i=!0;else if(a)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(s)?(this._notifySignatureTypeUsingErrorCode(s,d,a,o,n,l,c),i=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(d,a,o,n,l,c),i=!0}return i}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),r=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(s),a=this._getRequestMetadata(e);r&&(this._notifyWaitingForProcessResponse(a),i=!0)}return i}_notifySignatureRequiredFirstStep(e,t,i,s){this._defineSignatureType(t,i),this._defineSignatureValue(t,i,s),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:i,metadata:e}}))}_notifySignatureRequired(e,t,i,s,r,a){this._defineSignatureValue(t,i,s);const o={type:t,data:i,challenge:r,metadata:e};a&&(o.response=a),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:o}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:i}=e;return{path:this._path,method:this.method,url:t,status:i}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",i=""){const s=t.split(";").findIndex((t=>t===e));return i?i.split(";")[s]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,i,s,r,a){s?this._notifySignatureRequired(e,t,i,s,r,a):this._notifySignatureRequiredFirstStep(e,t,i,s)}_notifySignatureTypeUsingErrorCode(e,t,i,s,r,a,o){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,i,s,r):this._notifySignatureRequired(t,i,s,r,a,o)}}class de extends ce{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}}class he extends ce{constructor(e=null){super(Object.assign(e||{},{method:"PATCH"}))}toString(e=""){return super.toString(e||"BGADPRequestPATCH")}}class pe extends ce{constructor(e=null){super(Object.assign(e||{},{method:"POST"}))}toString(e=""){return super.toString(e||"BGADPRequestPOST")}}class ue extends ce{constructor(e=null){super(Object.assign(e||{},{method:"PUT"}))}toString(e=""){return super.toString(e||"BGADPRequestPUT")}}class ge extends pe{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`insurances-losses/v${this.version}/insurances-losses`)}toString(){return super.toString("BGADPInsurancesLossesPostV1")}}class me extends de{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`insurances-losses/v${this.version}/insurances-losses`)}toString(){return super.toString("BGADPInsurancesLossesGetV1")}}class be extends de{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`insurances-losses/v${this.version}/insurances-losses/{insurance-loss-id}`)}toString(){return super.toString("BGADPInsurancesLossesInsuranceLossGetV1")}}class ve extends ue{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`insurances-losses/v${this.version}/insurances-losses/{insurance-loss-id}`)}toString(){return super.toString("BGADPInsurancesLossesInsuranceLossPutV1")}}class ye extends he{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`insurances-losses/v${this.version}/insurances-losses/{insurance-loss-id}`)}toString(){return super.toString("BGADPInsurancesLossesInsuranceLossPatchV1")}}class _e extends(i(s)){}class fe extends _e{static get is(){return"bbva-global-insurances-loss-api-dm"}static get properties(){return{insurancesLoss:{type:Object,attribute:!1}}}constructor(){super(),this.insurancesLoss={}}resetInsurancesLoss(){this.insurancesLoss={}}getInsurancesLoss(e,t={}){if(Object.keys(this.insurancesLoss).length)return;t=Object.assign({"insurance-loss-id":e},t),this._generateGetService(this._getService("get",{},t),{customEvent:"insurances-loss-api-dm-fetch",errorFireEventHandler:"insurances-loss-api-dm-fetch-error"},this._responseMapping,t.fields)}patchInsurancesLoss(e,t){const i={"insurance-loss-id":e};this._generateGetService(this._getService("patch",t,i),{customEvent:"insurances-loss-api-dm-update",errorFireEventHandler:"insurances-loss-api-dm-update-error"},this._responseMapping),this.resetInsurancesLoss()}putInsurancesLoss(e,t){const i={"insurance-loss-id":e};this._generateGetService(this._getService("put",t,i),{customEvent:"insurances-loss-api-dm-update",errorFireEventHandler:"insurances-loss-api-dm-update-error"},this._responseMapping),this.resetInsurancesLoss()}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}InsurancesLoss`,this._getBgadp(s))}_getBgadp(e){return{getInsurancesLossV1:()=>new be(e),patchInsurancesLossV1:()=>new ye(e),putInsurancesLossV1:()=>new ve(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}class ke extends _e{static get is(){return"bbva-global-insurances-losses-insurances-losses-base-api-dm"}getInsurancesLosses(e){this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields)}postInsurancesLosses(e){this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}InsurancesLosses`,this._getBgadp(s))}_getBgadp(e){return{getInsurancesLossesV1:()=>new me(e),postInsurancesLossesV1:()=>new ge(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}r(ke,"GET_EVENTS",{customEvent:"insurances-losses-api-dm-fetch",errorFireEventHandler:"insurances-losses-api-dm-fetch-error"}),r(ke,"POST_EVENTS",{customEvent:"insurances-losses-api-dm-create",errorFireEventHandler:"insurances-losses-api-dm-create-error"}),customElements.define(ke.is,ke);class Se{constructor(e,t,i){this.host=e,this.origin=t,this.destination=i}distanceMatrixService(){const e=new google.maps.DistanceMatrixService,t={origins:[this.origin],destinations:[this.destination],travelMode:google.maps.TravelMode.DRIVING,unitSystem:google.maps.UnitSystem.METRIC,avoidHighways:!1,avoidTolls:!1},i={min:"minutos",h:"horas"};e.getDistanceMatrix(t).then((e=>{var t,s,r;let a=null==e||null===(t=e.rows[0])||void 0===t||null===(s=t.elements[0])||void 0===s||null===(r=s.duration)||void 0===r?void 0:r.text;a&&"string"==typeof a&&(a=a.replace(/min|h/gi,(e=>i[e]))),this.host.timeOfArrival=a}))}}class xe extends(J(te(a(s)))){static get is(){return"emergency-tracking-reports-dm"}static get scopedElements(){const e=[fe,Q];return xe.scopedElementsFromClasses(e)}static get properties(){return{insurancesLossesApiVersion:{type:String,attribute:"insurances-losses-api-version"},vehicleInsurancesApiVersion:{type:String,attribute:"vehicle-insurances-api-version"},lossesReportRequestsId:{type:String,attribute:"losses-report-request-id"},insuranceLossFields:{type:String,attribute:"insurance-loss-fields"},apiKey:{type:String,attribute:"api-key"},insurancesLoss:{type:Object},geolocationRequestsFrequency:{type:Number},policyId:{type:Object},claimTask:{type:String},phoneNumberBbvaLineVehicle:{type:String},timeOfArrival:{type:String},_adjuster:{type:Object,state:!0},_avatarInitials:{type:String,state:!0},_status:{type:String,state:!0},_intervalInsurancesLossId:{type:Object,state:!0},_minimumArrivalTimes:{type:Array,state:!0}}}constructor(){super(),this.insurancesLossesApiVersion="1",this.vehicleInsurancesApiVersion="1",this.lossesReportRequestsId="",this.insuranceLossFields="",this.apiKey="",this.insurancesLoss={},this.geolocationRequestsFrequency=0,this.policyId={},this.claimTask="",this.phoneNumberBbvaLineVehicle="",this._adjuster={},this._avatarInitials="",this._status="",this._intervalInsurancesLossId=null,this.timeOfArrival="",this._minimumArrivalTimes=["1 minutos","2 minutos"]}firstUpdated(){this._insurancesLossDm=this.shadowRoot.querySelector("#insurancesLossDm"),this._lossesReportDm=this.shadowRoot.querySelector("#lossesReportDm"),super.firstUpdated()}update(e){e.has("geolocationRequestsFrequency")&&0===this.geolocationRequestsFrequency&&(this.geolocationRequestsFrequency=15e3),super.update(e)}_postLossesReportRequests(e){this._lossesReportDm.postLossesReportRequests(e)}_lossesReportRequestBody(){var e;return{policy:{id:null===(e=this.policyId)||void 0===e?void 0:e.id},requestType:{id:"CANCEL",lossReport:{id:this.claimTask}}}}startTracking(){this._getInsurancesLoss(),this._intervalInsurancesLossId=setInterval((()=>{this._getInsurancesLoss()}),this.geolocationRequestsFrequency)}stopInsuranceLossRequest(){clearInterval(this._intervalInsurancesLossId),this._intervalInsurancesLossId=null}cancelReport(){this.stopInsuranceLossRequest();const e=this._lossesReportRequestBody();this._postLossesReportRequests(e)}_getInsurancesLoss(){var e;Object.keys(this.insurancesLoss).length?this._insurancesLossDm.insurancesLoss=this.insurancesLoss:null===(e=this._insurancesLossDm)||void 0===e||e.getInsurancesLoss(this.lossesReportRequestsId,{fields:this.insuranceLossFields,expand:"services"})}_handleSuccessInsurancesLossResponse({detail:e}){var t,i,s,r,a,o,n,l,c,d;this.insurancesLoss=e,this._status=null===(t=this.insurancesLoss)||void 0===t||null===(i=t.services)||void 0===i||null===(s=i[0])||void 0===s?void 0:s.status,this._adjuster=null===(r=this.insurancesLoss)||void 0===r||null===(a=r.services)||void 0===a||null===(o=a[0])||void 0===o?void 0:o.adjuster,this._avatarInitials=(null===(n=this._adjuster)||void 0===n||null===(l=n.firstName)||void 0===l?void 0:l.charAt(0))+(null===(c=this._adjuster)||void 0===c||null===(d=c.lastName)||void 0===d?void 0:d.charAt(0)),this._adjusterArrivalTime(),this._finishTracking?(this.stopInsuranceLossRequest(),this._dispatchCustomEvent("emergency-tracking-reports-finish-tracking")):(this._dispatchCustomEvent("emergency-tracking-reports-set-adjuster-tracking-data",{geoLocation:this._geoLocation,mapTooltip:this._mapTooltipConfig,mobileMarkerPopup:{lat:this._adjusterLocation.lat,lng:this._adjusterLocation.lng},adjusterLocation:{address:{geolocation:{latitude:this._adjusterLocation.lat,longitude:this._adjusterLocation.lng}}}}),this._resetInsuranceLoss())}_resetInsuranceLoss(){this.insurancesLoss={},this._insurancesLossDm.resetInsurancesLoss()}get _finishTracking(){return["CLOSED","CANCELLED","IN_PROCESS"].includes(this._status)}get _geoLocation(){var e,t,i,s,r,a,o,n;return{lat:null===(e=this.insurancesLoss)||void 0===e||null===(t=e.address)||void 0===t||null===(i=t.location)||void 0===i||null===(s=i.geolocation)||void 0===s?void 0:s.latitude,lng:null===(r=this.insurancesLoss)||void 0===r||null===(a=r.address)||void 0===a||null===(o=a.location)||void 0===o||null===(n=o.geolocation)||void 0===n?void 0:n.longitude}}get _adjusterLocation(){var e,t,i,s;return{lat:null===(e=this._adjuster)||void 0===e||null===(t=e.lastGeolocation)||void 0===t?void 0:t.latitude,lng:null===(i=this._adjuster)||void 0===i||null===(s=i.lastGeolocation)||void 0===s?void 0:s.longitude}}get _adjusterName(){var e,t,i,s;return null!==(e=this._adjuster)&&void 0!==e&&e.name?null===(s=this._adjuster)||void 0===s?void 0:s.name:`${null===(t=this._adjuster)||void 0===t?void 0:t.firstName}  ${null===(i=this._adjuster)||void 0===i?void 0:i.lastName}`}get _mapTooltipConfig(){var e,t,i;return{avatarText:this._avatarInitials,avatarImage:null===(e=this._adjuster)||void 0===e||null===(t=e.picture)||void 0===t?void 0:t.url,title:this._adjusterName,description:this.t("emergency-tracking-reports-modal-tracking-map-tooltip-description",{policyNumber:null===(i=this.policyId)||void 0===i?void 0:i.number}),subDescription:this.t("emergency-tracking-reports-modal-tracking-map-tooltip-sub-description"),badgeText:this._badgeText,options:this._tooltipOptions}}get _tooltipOptions(){var e,t,i;return[{icon:o(),label:this.t("emergency-tracking-reports-modal-tracking-map-tooltip-cancel-report"),event:"emergency-tracking-reports-modal-tracking-warning"},{icon:n(),label:this.t(this._adjusterPhoneIsAvailable?"emergency-tracking-reports-modal-tracking-map-tooltip-call-broker-car":"emergency-tracking-reports-modal-tracking-map-tooltip-call-bbva-vehicle-line"),event:"emergency-tracking-reports-phone-call",detail:{value:this._adjusterPhoneIsAvailable?null===(e=this._adjuster)||void 0===e||null===(t=e.contactDetails)||void 0===t||null===(i=t[0])||void 0===i?void 0:i.contact:this.phoneNumberBbvaLineVehicle}}]}get _adjusterPhoneIsAvailable(){var e,t,i,s,r,a;return"PHONE_NUMBER"===(null===(e=this._adjuster)||void 0===e||null===(t=e.contactDetails)||void 0===t||null===(i=t[0])||void 0===i?void 0:i.contactType)||"MOBILE_NUMBER"===(null===(s=this._adjuster)||void 0===s||null===(r=s.contactDetails)||void 0===r||null===(a=r[0])||void 0===a?void 0:a.contactType)}get _badgeText(){return this._minimumArrivalTimes.includes(this.timeOfArrival)?this.t("emergency-tracking-reports-modal-tracking-map-tooltip-badge-text-arriving"):this.t("emergency-tracking-reports-modal-tracking-map-tooltip-badge-text",{timeOfArrival:this.timeOfArrival})}_adjusterArrivalTime(){if(this.apiKey){new Se(this,this._adjusterLocation,this._geoLocation).distanceMatrixService()}}_handleInsuranceLossError(e){e&&(this.stopInsuranceLossRequest(),this._dispatchCustomEvent("emergency-tracking-reports-insurances-loss-communication-error"))}_handleLossesReportError(e){this._dispatchCustomEvent("emergency-tracking-reports-losses-report-error",{isCommunicationError:e})}_handleSuccessLossesReportResponse({detail:e}){this._dispatchCustomEvent("emergency-tracking-reports-losses-report-cancellation-process",null==e?void 0:e.id)}render(){return l`
      <bbva-global-insurances-loss-api-dm
        id="insurancesLossDm"
        .host="${this.host}"
        .version="${this.insurancesLossesApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @insurances-loss-api-dm-fetch="${this._handleSuccessInsurancesLossResponse}"
        @insurances-loss-api-dm-fetch-error="${()=>this._handleInsuranceLossError(!1)}"
        @api-dm-error="${()=>this._handleInsuranceLossError(!0)}"
      >
      </bbva-global-insurances-loss-api-dm>
      <bbva-global-losses-report-requests-api-dm
        id="lossesReportDm"
        .host="${this.host}"
        .version="${this.vehicleInsurancesApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @losses-report-requests-api-dm-create="${this._handleSuccessLossesReportResponse}"
        @losses-report-requests-api-dm-create-error="${()=>this._handleLossesReportError(!1)}"
        @api-dm-error="${()=>this._handleLossesReportError(!0)}"
      >
      </bbva-global-losses-report-requests-api-dm>
    `}}const Te=new g;var Re=c`:host {
  display: block;
  --_veil-bg-color: var(--bbva-help-modal-dark-mode-veil-bg-color, var(--colorsPrimaryCoreDarkened, ${d(m.primaryCoreDarkened)}));
  --bbva-help-modal-safe-area-inset-top: 0;
  --bbva-help-modal-safe-area-inset-bottom: 0;
  --_modal-padding: 0;
  --_help-modal-content-bg-color: var(--bbva-help-modal-dark-mode-content-bg-color, var(--bbva-help-modal-content-bg-color, var(--colorsPrimaryCoreLightened, ${d(m.primaryCoreLightened)})));
  --_help-modal-title-icon-color: var(--bbva-help-modal-dark-mode-title-icon-color, var(--bbva-help-modal-title-icon-color, var(--colorsPrimaryCoreDark, ${d(m.primaryCoreDark)})));
  --_help-modal-title-icon-color-warning: var(--bbva-help-modal-dark-mode-title-icon-color-warning, var(--bbva-help-modal-title-icon-color-warning, var(--colorsTertiaryType1Dark, ${d(m.tertiaryType1Dark)})));
  --_help-modal-title-icon-color-info: var(--bbva-help-modal-dark-mode-title-icon-color-info, var(--bbva-help-modal-title-icon-color-info, var(--colorsTertiaryType3Dark, ${d(m.tertiaryType3Dark)})));
  --_help-modal-title-color: var(--bbva-help-modal-dark-mode-title-color, var(--bbva-help-modal-title-color, var(--colorsSecondary600, ${d(m.secondary600)})));
  --_help-modal-content-color: var(--bbva-help-modal-dark-mode-content-color, var(--bbva-help-modal-content-color, var(--colorsSecondary500, ${d(m.secondary500)})));
  --_help-modal-footer-bg-color: var(--bbva-help-modal-dark-mode-footer-bg-color, var(--bbva-help-modal-footer-bg-color, var(--colorsPrimaryCoreLightened, ${d(m.primaryCoreLightened)})));
  --_help-modal-ios-header-bg-color: var(--bbva-help-modal-dark-mode-ios-header-bg-color, var(--bbva-help-modal-ios-header-bg-color, var(--colorsPrimaryCore, ${d(m.primaryCore)})));
  --_help-modal-transition-duration: var(--bbva-help-modal-transition-duration, 0.3s);
  --_help-modal-veil-transition-duration: var(--bbva-help-modal-veil-transition-duration, 0.25s);
  --_help-modal-transition-easing: var(--bbva-help-modal-transition-easing, cubic-bezier(0.2,0,0.1,1));
  --_help-modal-veil-transition-easing: var(--bbva-help-modal-veil-transition-easing, cubic-bezier(0.2,0,0.1,1));
  --_help-modal-full-height-bg-color: var(--bbva-help-modal-dark-mode-full-height-bg-color, var(--bbva-help-modal-full-height-bg-color, var(--colorsPrimaryCoreLightened, ${d(m.primaryCoreLightened)})));
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  visibility: hidden;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.veil {
  opacity: 0;
  position: fixed;
  transition: visibility 0.2s ease-in-out, opacity var(--_help-modal-veil-transition-duration) var(--_help-modal-veil-transition-easing);
  visibility: hidden;
  pointer-events: none;
}

.modal-main {
  display: flex;
  flex-direction: column;
  overflow-y: auto;
  width: 100%;
  height: 100%;
  padding-bottom: calc(calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${d(b.spacer)}))) / 16) * 1em) + var(--bbva-help-modal-safe-area-inset-bottom) / 2);
  max-width: 45rem;
}

.transition-container {
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  position: fixed;
  transform: translateY(100%);
  transition: visibility var(--_help-modal-transition-duration), transform var(--_help-modal-transition-duration) var(--_help-modal-transition-easing);
  width: 100%;
  will-change: transform;
  z-index: 1;
}
.transition-container.half-height {
  max-height: 50%;
  top: auto;
}
.transition-container.half-height .modal-main {
  background-color: var(--_help-modal-content-bg-color);
}
.transition-container .help-modal {
  width: 100%;
  box-sizing: border-box;
  height: 100%;
  align-items: center;
  margin: auto;
  display: flex;
  justify-content: center;
}

.modal-container {
  width: 100%;
  padding: var(--bbva-help-modal-padding, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${d(b.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${d(b.spacer)}))) / 16) * 1em) 0);
  align-items: center;
  outline: 0;
}

.modal-title {
  align-items: center;
  display: flex;
  flex-direction: column;
  font-size: var(--bbva-help-modal-title-font-size, var(--typographyTypeMedium, ${d(h.typeMedium)}));
  font-weight: var(--bbva-help-modal-title-font-weight, var(--fontFacePrimaryMediumFontWeight, ${d(p.medium.fontWeight)}));
  line-height: var(--bbva-help-modal-title-line-height, var(--lineHeightTypeMedium, ${d(u.typeMedium)}));
  position: relative;
  outline: 0;
}
.modal-title .title-icon {
  fill: var(--_help-modal-title-icon-color);
  margin-bottom: var(--bbva-help-modal-title-icon-margin-bottom, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${d(b.spacer)}))) / 16) * 1rem));
}
.modal-title [data-tag-name=bbva-text] {
  width: 100%;
  color: var(--_help-modal-title-color);
}

.slot-footer {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: var(--bbva-help-modal-footer-padding, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${d(b.spacer)}))) / 16) * 1em) 0 0);
  transform: translateZ(0.01px);
}

:host(:not([full-height])) .slot-footer {
  background-color: var(--_help-modal-footer-bg-color);
}

:host([full-height]) .help-modal {
  background-color: var(--_help-modal-full-height-bg-color);
  display: block;
}
:host([full-height]) .modal-header {
  width: 100%;
  position: sticky;
  position: -webkit-sticky;
  top: 0;
  z-index: 1;
}

.modal-content {
  outline: 0;
}
.modal-content [data-tag-name=bbva-text] {
  color: var(--_help-modal-content-color);
}

:host([modal-type=warning]) .modal-title .title-icon {
  fill: var(--_help-modal-title-icon-color-warning);
}

:host([modal-type=info]) .modal-title .title-icon {
  fill: var(--_help-modal-title-icon-color-info);
}

.modal-content-wrapper {
  max-width: var(--bbva-help-modal-content-max-width, 100%);
  width: var(--bbva-help-modal-content-width, 100%);
  color: var(--_help-modal-content-color);
  font-size: var(--bbva-help-modal-content-font-size, var(--typographyTypeSmall, ${d(h.typeSmall)}));
  line-height: var(--bbva-help-modal-content-line-height, var(--lineHeightTypeSmall, ${d(u.typeSmall)}));
  text-align: center;
  margin: 0 auto;
}
:host(:not([hide-content-padding-top])) .modal-content-wrapper {
  padding-top: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${d(b.spacer)}))) / 16) * 1em);
}

.footer-button:last-child {
  margin-top: var(--bbva-help-modal-footer-last-button-margin-top, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${d(b.spacer)}))) / 16) * 1rem));
}

[data-tag-name=bbva-link].footer-button {
  text-align: center;
}

:host([fixed-footer]) .modal-container {
  flex-grow: 1;
  overflow-y: auto;
  display: flex;
  flex-direction: column;
}
:host([fixed-footer]) .modal-content-wrapper, :host([fixed-footer]) .modal-content, :host([fixed-footer]) .slot-content {
  flex-grow: 1;
  display: flex;
  flex-direction: column;
  width: 100%;
}
:host([fixed-footer]) .slot-footer {
  box-shadow: var(--bbva-help-modal-footer-fixed-shadow, 0 0 4px 0 rgba(18, 18, 18, 0.3));
  padding-bottom: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${d(b.spacer)}))) / 16) * 1em);
}
:host([fixed-footer]) .transition-container .modal-main {
  padding-bottom: var(--bbva-help-modal-safe-area-inset-bottom, 0);
}

:host([visible]) {
  visibility: visible;
}
:host([visible]) .veil {
  visibility: visible;
  opacity: var(--_veil-opacity, 0.9);
  pointer-events: all;
}
:host([visible]) .transition-container {
  transform: translateY(0%);
}
:host([visible]) .transition-container .help-modal {
  display: flex;
  flex-direction: column;
}

:host(:not([visible])) {
  position: relative;
  height: auto;
  width: auto;
  --bbva-help-modal-transition-duration: 0.15s;
  --bbva-help-modal-veil-transition-duration: 0.15s;
  --bbva-help-modal-transition-easing: cubic-bezier(0.8,0,1,1);
  --bbva-help-modal-veil-transition-easing: cubic-bezier(0.8,0,1,1);
  --_modal-padding: 0;
}
:host(:not([visible])) .transition-container {
  visibility: hidden;
}
:host(:not([visible]))[full-height] .veil {
  transition: none;
}
:host(:not([visible])) div[tabindex="0"] > .veil {
  visibility: hidden;
  opacity: 0;
}

@supports (padding-top: constant(safe-area-inset-top)) {
  :host([i-o-s-fixed-header]) [data-tag-name=bbva-header-main] {
    padding-top: 0;
  }
}
@supports (padding-top: env(safe-area-inset-top)) {
  :host([i-o-s-fixed-header]) [data-tag-name=bbva-header-main] {
    padding-top: 0;
  }
}

:host([visible][full-height]) {
  --bbva-help-modal-veil-transition-duration: 0.15s;
}

:host(:not([visible])[full-height]) {
  --bbva-help-modal-transition-duration: 0.2s;
}
:host(:not([visible])[full-height]) .transition-container {
  transform: translateY(100%);
}
:host(:not([visible])[full-height]) .modal-main {
  max-width: none;
}

.transition-container[_should-display-fixed-header] {
  padding-top: var(--bbva-help-modal-safe-area-inset-top, 0);
  position: fixed;
}
@supports (padding-top: constant(safe-area-inset-top)) {
  .transition-container[_should-display-fixed-header] {
    --bbva-help-modal-safe-area-inset-top: constant(safe-area-inset-top);
  }
}
@supports (padding-top: env(safe-area-inset-top)) {
  .transition-container[_should-display-fixed-header] {
    --bbva-help-modal-safe-area-inset-top: env(safe-area-inset-top);
  }
}

@supports (padding-top: constant(safe-area-inset-top)) {
  .iOS-fixed-header {
    --bbva-help-modal-safe-area-inset-top: constant(safe-area-inset-top);
  }
}
@supports (padding-top: env(safe-area-inset-top)) {
  .iOS-fixed-header {
    --bbva-help-modal-safe-area-inset-top: env(safe-area-inset-top);
  }
}
@supports (padding-bottom: constant(safe-area-inset-bottom)) {
  .modal-main {
    --bbva-help-modal-safe-area-inset-bottom: constant(safe-area-inset-bottom);
  }
}
@supports (padding-bottom: env(safe-area-inset-bottom)) {
  .modal-main {
    --bbva-help-modal-safe-area-inset-bottom: env(safe-area-inset-bottom);
  }
}
@supports (will-change: transform) {
  .transition-container {
    will-change: transform;
  }
}
.iOS-fixed-header {
  background-color: var(--_help-modal-ios-header-bg-color);
  height: var(--bbva-help-modal-safe-area-inset-top, 0);
  position: absolute;
  bottom: calc(100vh - var(--bbva-help-modal-safe-area-inset-top, 0));
  width: 100%;
  z-index: 5;
}

@media (min-width: 45rem) {
  :host([full-height]) .transition-container {
    padding-bottom: 0;
  }
  :host([full-height]) .modal-header {
    --bbva-header-main-max-width: 45rem;
  }
  :host([full-height]) .modal-container,
:host([full-height]) .modal-footer {
    margin: auto;
  }
  :host([full-height]) .modal-container {
    max-width: 45rem;
    flex-grow: 1;
    overflow-y: auto;
  }
  :host([full-height]) .modal-footer {
    width: 45rem;
  }
  :host([full-height]) .modal-footer .slot-footer {
    padding-bottom: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${d(b.spacer)}))) / 16) * 1em);
  }

  .modal-title [data-tag-name=bbva-text] {
    width: 40rem;
  }
}
${Te.mediaRules()}`;class Ee extends(v(a(y))){static get is(){return"bbva-help-modal"}static get scopedElements(){return{"bbva-button-default":_,"bbva-icon":f,"bbva-text":k,"bbva-header-main":X,"bbva-link":S}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},closeModalElements:{type:Array,attribute:"close-modal-elements"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},headerText:{type:String,attribute:"header-text"},headerType:{type:String,attribute:"header-type"},titleIcon:{type:String,attribute:"title-icon"},titleText:{type:String,attribute:"title-text"},descriptionText:{type:String,attribute:"description-text"},bodyText:{type:String,attribute:"body-text"},buttonText:{type:String,attribute:"button-text"},linkText:{type:String,attribute:"link-text"},fixedFooter:{type:Boolean,attribute:"fixed-footer",reflect:!0},stickyFooter:{type:Boolean,attribute:"sticky-footer",reflect:!0},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header",reflect:!0},iOSDevices:{type:Array,attribute:"i-o-s-devices"},userAgentRegex:{type:String,attribute:"user-agent-regex"},hideContentPaddingTop:{type:Boolean,attribute:"hide-content-padding-top",reflect:!0},modalType:{type:String,reflect:!0,attribute:"modal-type"},idModal:{type:String,reflect:!0,attribute:"id-modal"},fullHeight:{type:Boolean,attribute:"full-height",reflect:!0},disabledButton:{type:Boolean,attribute:"disabled-button"},titleLines:{type:Number,attribute:"title-lines"},showTextIcon:{type:Boolean,attribute:"show-text-icon"}}}constructor(){super(),this.iconLeftPrimary="",this.iconLeftSecondary="",this.iconRightPrimary=x(),this.iconRightSecondary="",this.accessibilityTextIconLeftPrimary="",this.accessibilityTextIconLeftSecondary="",this.accessibilityTextIconRightPrimary="",this.accessibilityTextIconRightSecondary="",this.closeModalElements=["footer-button","footer-link","header-right-primary"],this.headerText="",this.headerType="modal-three-level",this.titleIcon="",this.titleText="",this.descriptionText="",this.bodyText="",this.buttonText="",this.linkText="",this.iOSFixedHeader=!1,this.iOSDevices=["iOS","iPhone"],this.userAgentRegex=/\(([^)]+)\)/,this.hideContentPaddingTop=!1,this.modalType="",this.resetScroll=!0,this.fullHeight=!1,this.disabledButton=!1,this.showTextIcon=!1}firstUpdated(e){super.firstUpdated&&super.firstUpdated(e),this._modal=this.shadowRoot.querySelector(".help-modal"),this._header=this.shadowRoot.querySelector(".modal-header"),this._content=this.shadowRoot.querySelector(".modal-content-wrapper"),this._footer=this.shadowRoot.querySelector(".modal-footer"),this._container=this.shadowRoot.querySelector(".modal-container"),this.removeAttribute("aria-modal"),this._checkHeight()}updated(e){if(super.updated&&super.updated(e),this.fullHeight||this.setAttribute("hide-content-padding-top",!0),e.has("visible")){let e="close";this.visible&&(e="open"),this.dispatchEvent(new CustomEvent(`help-modal-${e}`,{detail:{status:e,modal:this},bubbles:!0,composed:!0}))}this._updateAccessibility()}static get styles(){return[super.styles,Re,T("bbva-help-modal-shared-styles"),R.light,E.light]}get _fixedIOSHeader(){return l`
      <div ?hidden="${!this._shouldDisplayFixedHeader()}" class="iOS-fixed-header"></div>
    `}get helpModalHeader(){return this.headerText?l`
          <slot name="slot-header" class="header-slot">
            <bbva-header-main
              data-tag-name="bbva-header-main"
              id="helpModalHeader"
              ?show-text-icon="${this.showTextIcon}"
              variant="${this.headerType}"
              text="${this.headerText}"
              icon-right-primary="${this.iconRightPrimary}"
              icon-right-secondary="${this.iconRightSecondary}"
              icon-left-primary="${this.iconLeftPrimary}"
              icon-left-secondary="${this.iconLeftSecondary}"
              accessibility-text-icon-left-primary="${this.accessibilityTextIconLeftPrimary}"
              accessibility-text-icon-left-secondary="${this.accessibilityTextIconLeftSecondary}"
              accessibility-text-icon-right-primary="${this.accessibilityTextIconRightPrimary}"
              accessibility-text-icon-right-secondary="${this.accessibilityTextIconRightSecondary}"
              @header-main-icon-right-primary-click="${()=>this._handleClick("header-right-primary")}"
              @header-main-icon-right-secondary-click="${()=>this._handleClick("header-right-secondary",!1)}"
              @header-main-icon-left-primary-click="${()=>this._handleClick("header-left-primary",!1)}"
              @header-main-icon-left-secondary-click="${()=>this._handleClick("header-left-secondary",!1)}"
            ></bbva-header-main>
          </slot>
        `:""}get helpModalContent(){return l`
      <div id="helpModalContent" class="modal-content">
        <span class="slot-content-header"><slot name="slot-content-header"></slot></span>
        <div class="slot-content">
          ${this.descriptionText?l`<bbva-text
                id="description-text"
                .text=${this.descriptionText}
                ?hidden="${!this.descriptionText}"
                alignment="center"
                size="S"
                ellipsis
                lines="3"
                unset
              >
              </bbva-text>`:l`<slot name="slot-content"><div>${this.bodyText}</div></slot>`}
        </div>
      </div>
    `}get _veilTpl(){return this.fullHeight?"":l`
        <div class="veil" @keyup="${this._keyupEvent}" @click="${this._onVeilClick}"></div>
      `}get helpModalFooter(){return l`
      <div class="modal-footer">
        <slot name="slot-footer">
          <div class="slot-footer" ?hidden="${!this.buttonText&&!this.linkText}">
            <bbva-button-default
              ambient="light"
              class="footer-button"
              data-tag-name="bbva-button-default"
              ?hidden="${!this.buttonText}"
              ?disabled="${this.disabledButton}"
              @click="${()=>this._handleClick("footer-button")}"
              >${this.buttonText}</bbva-button-default
            >
            ${this.linkText?l`<bbva-link
                  ambient="light"
                  class="footer-button"
                  data-tag-name="bbva-link"
                  @click="${()=>this._handleClick("footer-link")}"
                  ?hidden="${!this.linkText}"
                  >${this.linkText}</bbva-link
                >`:null}
          </div>
        </slot>
      </div>
    `}get helpModalTitle(){return l`
      <div id="helpModalTitle" class="modal-title">
        <slot name="slot-title">
          <bbva-icon
            class="title-icon"
            data-tag-name="bbva-icon"
            size="24"
            icon="${this.titleIcon}"
            ?hidden="${!this.titleIcon}"
            aria-hidden="true"
          ></bbva-icon>
          ${this.titleText?l` <bbva-text
                id="title-text"
                .text=${this.titleText}
                ?hidden="${!this.titleText}"
                alignment="center"
                ellipsis
                .lines="${this.titleLines}"
                unset
                font-weight="500"
                tag="h2"
              >
              </bbva-text>`:null}
        </slot>
      </div>
    `}_updateAccessibility(){!this.getAttribute("aria-label")&&this.titleText&&this.setAttribute("aria-label",this.titleText)}_checkHeight(){this._container.offsetHeight>=this._content.offsetHeight?this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","none"):this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","0 0 4px 0 rgba(18, 18, 18, .3)")}_runScrollReset(){const e=this._getFirstScrollableParent(this._container);requestAnimationFrame((()=>{requestAnimationFrame((()=>{null==e||e.scrollTo(0,0)}))}))}_setFooterShadow(e){e.currentTarget.scrollTop>=this._header.offsetHeight+this._content.offsetHeight+this._footer.offsetHeight-this._modal.offsetHeight?(this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","none"),this.dispatchEvent(new CustomEvent("help-modal-content-scroll-bottom-reach",{detail:!0,bubbles:!0,composed:!0}))):this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","0 0 4px 0 rgba(18, 18, 18, .3)")}_handleClick(e){this.dispatchEvent(new CustomEvent(`help-modal-${e}-click`,{detail:!0,bubbles:!0,composed:!0})),this.closeModalElements.includes(e)&&this.close()}_onVeilClick(){super._onVeilClick&&super._onVeilClick(),this._handleClick("veil")}_shouldDisplayFixedHeader(){const e=window.navigator.userAgent.match(this.userAgentRegex)[1].split(";");return this.iOSFixedHeader&&this.iOSDevices.includes(e[0])}get _modalContent(){return l`
      ${this._fixedIOSHeader}
      <section
        class="transition-container ${$({"half-height":!this.fullHeight})}"
        ?_should-display-fixed-header="${this._shouldDisplayFixedHeader()}"
      >
        <div class="help-modal">
          <div class="modal-header">${this.helpModalHeader}</div>
          <div class="modal-main">
            <div class="modal-container" @scroll="${this._setFooterShadow}">
              <div class="modal-content-wrapper">
                ${this.helpModalTitle} ${this.helpModalContent}
              </div>
            </div>
            ${this.helpModalFooter}
          </div>
        </div>
      </section>
    `}}q("colors.cool100"),q("colors.cool60"),q("colors.primarySubduedLight"),q("colors.tertiaryType1Light"),q("colors.tertiaryType3Light"),q("colors.primaryCoreLightened"),q("colors.cool20"),q("colors.cool60"),q("colors.cool60"),q("colors.cool100");class $e{constructor(e){this.controller=e}closeModal(){var e;null===(e=this.controller)||void 0===e||e.closeModal()}get lossesReportRequestsId(){var e;return null===(e=this.controller)||void 0===e?void 0:e.lossesReportRequestsId}get cancellationReportId(){var e;return null===(e=this.controller)||void 0===e?void 0:e.cancellationReportId}get phoneNumber(){var e;return null===(e=this.controller)||void 0===e?void 0:e.phoneNumber}get source(){var e;return null===(e=this.controller)||void 0===e?void 0:e.source}get viewCallVisible(){var e;return null===(e=this.controller)||void 0===e?void 0:e.viewCallVisible}get insuranceLossApiCommunicationError(){var e;return null===(e=this.controller)||void 0===e?void 0:e.insuranceLossApiCommunicationError}fireEvent(e,t=!0){this.controller._fireEvent(e,t)}}class Ce extends $e{get _header(){return"login-entry-point"!==String(this.source)?"emergency-tracking-reports-modal-header-title":"emergency-tracking-reports-modal-report-detected-header-text"}get _illustration(){return"emergencies-entry-point"!==String(this.source)?"requestok":"requestprogress"}configs(){return{modalAriaLabel:"emergency-tracking-reports-modal-report-detected-aria-label",fullHeight:!0,hideContentPaddingTop:!0,microIllustration:this._illustration,headerText:this._header,contentTitle:`emergency-tracking-reports-modal-report-detected-${this.source}-content-title`,contentDescription:`emergency-tracking-reports-modal-report-detected-${this.source}-content-description`,buttonText:"emergency-tracking-reports-modal-report-detected-button-text",linkText:`emergency-tracking-reports-modal-report-detected-${this.source}-link-text`}}headerRightPrimaryClick(){this.fireEvent("emergency-tracking-reports-get-out")}footerButtonClick(){this.fireEvent("emergency-tracking-reports-start-tracking"),this.closeModal()}footerLinkClick(){"emergencies-entry-point"!==String(this.source)?(this.fireEvent("emergency-tracking-reports-get-out"),this.closeModal()):this.fireEvent("emergency-tracking-reports-raise-a-new-report",{value:this.phoneNumber})}}class Ie extends $e{configs(){return{modalAriaLabel:"emergency-tracking-reports-modal-cancellation-warning-aria-label",modalType:"warning",titleIcon:A(),titleText:"emergency-tracking-reports-modal-cancellation-warning-title-text",bodyText:"emergency-tracking-reports-modal-cancellation-warning-body-text",notificationDescription:this.lossesReportRequestsId,buttonText:"emergency-tracking-reports-modal-cancellation-warning-button-text",linkText:"emergency-tracking-reports-modal-cancellation-warning-link-text"}}footerButtonClick(){this.fireEvent("emergency-tracking-reports-request-cancellation")}}class Le extends $e{configs(){return{modalAriaLabel:"emergency-tracking-reports-modal-cancellation-process-aria-label",fullHeight:!0,notificationMessage:!0,hideContentPaddingTop:!0,microIllustration:"pending",headerText:"emergency-tracking-reports-modal-header-title",notificationBodyText:"emergency-tracking-reports-modal-cancellation-process-body-text",notificationDescription:this.cancellationReportId,contentTitle:"emergency-tracking-reports-modal-cancellation-process-content-title",buttonText:"emergency-tracking-reports-modal-cancellation-process-button-text",notificationLink:this.phoneNumber,notificationLinkIcon:n()}}headerRightPrimaryClick(){this.fireEvent("emergency-tracking-reports-get-out")}footerButtonClick(){this.fireEvent("emergency-tracking-reports-get-out"),this.closeModal()}footerLinkClick(){this.fireEvent("emergency-tracking-reports-phone-call",{value:this.phoneNumber})}}class we extends $e{get illustration(){return this.insuranceLossApiCommunicationError?"locate":"error"}get idError(){return this.insuranceLossApiCommunicationError?"IL":"LR"}get buttonText(){return this.viewCallVisible?`emergency-tracking-reports-modal-communication-${this.idError}-error-button-text`:null}configs(){return{modalAriaLabel:"emergency-tracking-reports-modal-communication-error-aria-label",fullHeight:!0,hideContentPaddingTop:!0,microIllustration:this.illustration,headerText:`emergency-tracking-reports-modal-communication-${this.idError}-error-header-text`,contentTitle:`emergency-tracking-reports-modal-communication-${this.idError}-error-content-title`,contentDescription:`emergency-tracking-reports-modal-communication-${this.idError}-error-content-description`,buttonText:this.buttonText,linkText:`emergency-tracking-reports-modal-communication-${this.idError}-error-link-text`}}headerRightPrimaryClick(){this.fireEvent("emergency-tracking-reports-get-out")}footerButtonClick(){this.fireEvent("emergency-tracking-reports-phone-call",{value:this.phoneNumber})}footerLinkClick(){this.fireEvent("emergency-tracking-reports-get-out"),this.closeModal()}}class qe extends $e{get buttonText(){return this.viewCallVisible?"emergency-tracking-reports-modal-cancellation-error-button-text":null}configs(){return{modalAriaLabel:"emergency-tracking-reports-modal-cancellation-error-aria-label",fullHeight:!0,hideContentPaddingTop:!0,microIllustration:"error",headerText:"emergency-tracking-reports-modal-cancellation-error-header-text",contentTitle:"emergency-tracking-reports-modal-cancellation-error-content-title",contentDescription:"emergency-tracking-reports-modal-cancellation-error-content-description",buttonText:this.buttonText,linkText:"emergency-tracking-reports-modal-cancellation-error-link-text"}}headerRightPrimaryClick(){this.fireEvent("emergency-tracking-reports-get-out")}footerButtonClick(){this.fireEvent("emergency-tracking-reports-phone-call",{value:this.phoneNumber})}footerLinkClick(){this.fireEvent("emergency-tracking-reports-get-out"),this.closeModal()}}const Ae=new g;var Pe=c`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.modal-pane-image {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${d(b.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${d(b.spacer)}))) / 16) * 1em) auto;
}
.modal-pane-image [data-tag-name=bbva-clip-microillustration] {
  display: block;
  width: 5rem;
  height: auto;
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${d(b.spacer)}))) / 16) * 1rem) auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${d(b.spacer)}))) / 16) * 1rem);
}

.modal-pane-content {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${d(b.spacer)}))) / 16) * 1em) calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${d(b.spacer)}))) / 16) * 1em);
}

.modal-pane-content-title {
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${d(b.spacer)}))) / 16) * 1rem);
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${d(p.medium.fontWeight)});
  line-height: var(--lineHeightTypeLarge, ${d(u.typeLarge)});
}

.modal-pane-content-description {
  margin: 0 auto;
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-title-icon-color-warning: var(--colorsTertiaryType3Dark, ${d(m.tertiaryType3Dark)});
}
${Ae.mediaRules()}`;class Oe extends(P(te(a(s)))){static get is(){return"emergency-tracking-reports-modal"}static get scopedElements(){const e=[Ee,M,k,H,Ce,Ie,Le,we,qe];return Oe.scopedElementsFromClasses(e)}static get MODES(){return{cancellationWarning:"cancellationWarning",reportDetected:"reportDetected",cancellationProcess:"cancellationProcess",cancellationError:"cancellationError",communicationError:"communicationError"}}static get properties(){return{visible:{type:Boolean,reflect:!0},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"},mode:{type:String,reflect:!0},source:{type:String,reflect:!0},lossesReportRequestsId:{type:String,attribute:"losses-report-request-id"},_closeModalElements:{type:Array}}}static get styles(){return[Pe,O.light,T("emergency-tracking-reports-modal-shared-styles")]}constructor(){super(),this.iOSFixedHeader=!1,this.visible=!1,this.mode=null,this.source=null,this._resetConfig(),this.lossesReportRequestsId="",this._closeModalElements=[]}update(e){(e.has("mode")||e.has("source"))&&(this._resetConfig(),this._configs()),super.update(e)}_fireEvent(e,t){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t,cancelable:!0}))}get _part(){const e={reportDetected:new Ce(this),cancellationProcess:new Le(this),communicationError:new we(this),cancellationError:new qe(this),cancellationWarning:new Ie(this)};return this.mode in e?e[this.mode]:null}_configs(){this._part&&Object.assign(this,this._part.configs())}_changeVisible(e){const{detail:t,target:i}=e;this._fireEvent("modal-state-change",{visible:t,target:i,mode:this.mode,source:this.source})}_footerButtonClick(e){var t,i;null!==(t=this._part)&&void 0!==t&&t.footerButtonClick?null===(i=this._part)||void 0===i||i.footerButtonClick(e):this.closeModal()}_footerLinkClick(e){var t,i;null!==(t=this._part)&&void 0!==t&&t.footerLinkClick?null===(i=this._part)||void 0===i||i.footerLinkClick(e):this.closeModal()}_headerRightPrimaryClick(e){var t,i;(e.stopPropagation(),null!==(t=this._part)&&void 0!==t&&t.headerRightPrimaryClick)?null===(i=this._part)||void 0===i||i.headerRightPrimaryClick(e):this.closeModal()}_resetConfig(){Object.assign(this,{modalAriaLabel:"",bodyText:"",buttonText:null,fullHeight:!1,notificationMessage:!1,notificationLink:null,notificationDescription:null,notificationBodyText:null,notificationLinkIcon:null,headerText:null,headerType:"modal",hideContentPaddingTop:!1,linkText:null,modalType:"info",titleIcon:null,titleText:null,contentTitle:null,contentDescription:"",microIllustration:null})}closeModal(){this.visible=!1}get _renderModalPane(){return l`
      <div class="modal-pane-image">
        <bbva-clip-microillustration microillustration=${this.microIllustration} size="L">
      </div>
      <div class="modal-pane-content">
        <bbva-text
          ambient="light"
          class="modal-pane-content-title"
          text=${this.t(this.contentTitle,{lossesReportRequestsId:this.lossesReportRequestsId})}
          size="L"
          alignment="center"
          inherit
        >
        </bbva-text>
        <bbva-text
          ambient="light"
          tabindex="0"
          class="modal-pane-content-description"
          text=${this.t(this.contentDescription,{lossesReportRequestsId:this.lossesReportRequestsId})}
          size="S"
          alignment="center"
          inherit
        >
        </bbva-text>
      </div>
    `}get _renderModalNotification(){return this.notificationMessage?l`
          <div slot="slot-content">
            <bbva-notification-message
              ambient="light"
              message=${this.notificationBodyText}
              description=${this.notificationDescription}
              link-icon=${this.notificationLinkIcon}
              link-title=${this.t(this.notificationLink)}
              @notification-message-link-click=${this._footerLinkClick}
            >
            </bbva-notification-message>
          </div>
        `:null}render(){return l`
      <bbva-help-modal
        aria-label=${this.t(this.modalAriaLabel)}
        .modalType=${this.modalType}
        .headerType="${this.headerType}"
        .headerText="${this.t(this.headerText)}"
        .titleIcon="${this.titleIcon}"
        .titleText="${this.t(this.titleText)}"
        .bodyText="${this.t(this.bodyText)}"
        .buttonText="${this.t(this.buttonText)}"
        .linkText="${this.t(this.linkText)}"
        .closeModalElements="${this._closeModalElements}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ?full-height=${this.fullHeight}
        ?hide-content-padding-top=${this.hideContentPaddingTop}
        ?visible=${this.visible}
        fixed-footer
        @visible-changed=${this._changeVisible}
        accessibility-text-icon-right-primary=${this.t("emergency-tracking-reports-modal-text-icon-close")}
        @help-modal-footer-button-click=${this._footerButtonClick}
        @help-modal-footer-link-click=${this._footerLinkClick}
        @help-modal-header-right-primary-click=${this._headerRightPrimaryClick}
        @help-modal-veil-click=${this.closeModal}
      >
        ${this.fullHeight?l`
              <div slot="slot-title">
                ${this._renderModalPane}
              </div>
              ${this._renderModalNotification}
            `:null}
      </bbva-help-modal>
    `}}const Me=new g;var He=c`:host {
  display: block;
  background-color: var(--emergency-tracking-reports-map-tooltip-dark-mode-bg-color, var(--emergency-tracking-reports-map-tooltip-bg-color, var(--colorsPrimaryCoreLightened, ${d(m.primaryCoreLightened)})));
  border-radius: var(--borderRadiusSmall, ${d(D.small)});
  box-shadow: var(--boxShadowType1, ${d(j.type1)});
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${d(b.spacer)}))) / 16) * 1rem) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${d(b.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${d(b.spacer)}))) / 16) * 1rem) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${d(b.spacer)}))) / 16) * 1rem);
  --_map-tooltip-icon-color: var(--emergency-tracking-reports-map-tooltip-dark-mode-icon-color, var(--emergency-tracking-reports-map-tooltip-icon-color, var(--colorsPrimaryMedium, ${d(m.primaryMedium)})));
  --_map-tooltip-icon-active-color: var(--emergency-tracking-reports-map-tooltip-dark-mode-icon-active-color, var(--emergency-tracking-reports-map-tooltip-icon-active-color, var(--colorsPrimaryCore, ${d(m.primaryCore)})));
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.map-tooltip-icon {
  text-align: right;
}
.map-tooltip-icon [data-tag-name=bbva-button-default] {
  --bbva-button-default-icon-color-variant: var(--_map-tooltip-icon-color);
  --bbva-button-default-icon-color-focus-variant: var(--_map-tooltip-icon-active-color);
}

.map-tooltip-title {
  padding: 0.5rem 0;
}

.map-tooltip {
  display: flex;
  flex-direction: column;
  align-items: center;
  margin-top: -2.125rem;
}

.map-tooltip-sub-description {
  --bbva-text-color: var(--colorsSecondary500, ${d(m.secondary500)});
}

[data-tag-name=bbva-button-row] {
  width: 100%;
}

[data-tag-name=bbva-badge-default] {
  display: flex;
  justify-content: center;
  align-items: center;
  padding-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${d(b.spacer)}))) / 16) * 1rem);
}
${Me.mediaRules()}`;class je extends(J(te(s))){static get is(){return"emergency-tracking-reports-map-tooltip"}static get scopedElements(){const e=[_,F,G,U,k,je];return je.scopedElementsFromClasses(e)}static get styles(){return[He,R.light,N.light,V.light,B.light,O.light,T("emergency-tracking-reports-map-tooltip-shared-styles")]}static get properties(){return{icon:{type:String},title:{type:String,attribute:"title"},description:{type:String,attribute:"description"},subDescription:{type:String,attribute:"sub-description"},badgeText:{type:String,attribute:"badge-text"},avatarText:{type:String,attribute:"avatar-text"},avatarImage:{type:String,attribute:"avatar-image"},avatarClass:{type:String,attribute:"avatar-class"},avatarColors:{type:Object,attribute:"avatar-colors"},options:{type:Array}}}constructor(){super(),this.icon="",this.title="",this.description="",this.subDescription="",this.badgeText="",this.avatarText="",this.avatarImage="",this.avatarClass="bitone",this.avatarColors={bgColor:"#49A5E6",bgColor2:"#1973B8"},this.options=[]}_closeMapTooltip(){this._dispatchCustomEvent("emergency-tracking-reports-map-tooltip-close")}_optionButtonClicked(e){var t,i;e.stopPropagation();const s=null===(t=this.options[e.detail])||void 0===t?void 0:t.event,r=null===(i=this.options[e.detail])||void 0===i?void 0:i.detail;this._dispatchCustomEvent(s,r)}render(){var e,t;return l`
      <div class="map-tooltip-icon">
        <bbva-button-default
          ambient="light"
          variant="icon no-background"
          @click="${this._closeMapTooltip}"
          icon="${this.icon}"
        >
        </bbva-button-default>
      </div>
      <div class="map-tooltip" ambient="light">
        <bbva-clip-box
          aria-disabled="true"
          size="large"
          class="${this.avatarClass}"
          bg-color="${null===(e=this.avatarColors)||void 0===e?void 0:e.bgColor}"
          bg-color2="${null===(t=this.avatarColors)||void 0===t?void 0:t.bgColor2}"
          .text="${this.avatarText}"
          .image="${this.avatarImage}"
        >
        </bbva-clip-box>
        <bbva-text
          class="map-tooltip-title"
          size="M"
          alignment="center"
          font-weight="500"
          unset
          .text="${this.title}"
        >
        </bbva-text>
        <bbva-text size="S" alignment="center" unset .text="${this.description}"> </bbva-text>
        <bbva-text
          class="map-tooltip-sub-description"
          size="S"
          alignment="center"
          unset
          .text="${this.subDescription}"
        >
        </bbva-text>
        <bbva-badge-default text="${this.badgeText}" type="pending"> </bbva-badge-default>
        <bbva-button-row
          @button-row-item-click="${this._optionButtonClicked}"
          .options="${this.options}"
        ></bbva-button-row>
      </div>
    `}}const De=new g;var Ne=c`:host {
  display: block;
  box-sizing: border-box;
  --_map-tracking-loader-bg-color: var(--emergency-tracking-reports-modal-tracking-loader-dark-mode-bg-color, var(--emergency-tracking-reports-modal-tracking-loader-bg-color,var(--colorsPrimaryCoreLightened, ${d(m.primaryCoreLightened)})));
  --_map-tracking-loader-text-color: var(--emergency-tracking-reports-modal-tracking-loader-dark-mode-text-color, var(--emergency-tracking-reports-modal-tracking-loader-text-color,var(--colorsSecondary600, ${d(m.secondary600)})));
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.custom-header {
  align-items: center;
  flex-direction: column;
}

.map-tracking-tooltip {
  z-index: 10;
  position: fixed;
  display: initial;
  top: auto;
  width: auto;
  height: auto;
  left: 1rem;
  right: 1rem;
  bottom: 1rem;
  flex-direction: column;
  overflow: hidden;
}

.map-tracking-loader {
  z-index: 10;
  box-sizing: border-box;
  position: fixed;
  left: 0;
  display: initial;
  top: auto;
  bottom: 0;
  width: 100%;
  height: auto;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  min-height: 3rem;
  background-color: var(--_map-tracking-loader-bg-color);
  overflow: hidden;
  padding: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${d(b.spacer)}))) / 16) * 1rem) 0;
  --bbva-spinner-size: 2rem;
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0;
}

[data-tag-name=bbva-text] {
  padding: 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${d(b.spacer)}))) / 16) * 1rem) 0;
  color: var(--_map-tracking-loader-text-color);
}

[data-tag-name=bbva-map-dynamic] {
  position: fixed;
  inset: 0;
  --_map-dynamic-section-large-action-button-action: transparent;
}
${De.mediaRules()}`;class Ve extends(P(te(a(s)))){static get is(){return"emergency-tracking-reports-modal-tracking"}static get scopedElements(){const e=[Ee,ee,K,k,je];return Ve.scopedElementsFromClasses(e)}static get styles(){return[Ne,Z.light,O.light,T("emergency-tracking-reports-modal-tracking-shared-styles")]}static get properties(){return{visible:{type:Boolean,reflect:!0},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"},lossesReportRequestsId:{type:String,attribute:"losses-report-request-id"},apiKey:{type:String,attribute:"api-key"},geoLocation:{type:Object,attribute:"geo-location"},pois:{type:Array},popupAxis:{type:Object},adjusterIsAssigned:{type:Boolean},mapTooltip:{type:Object},mobileMarkerPopup:{type:Object},_hideMapTooltip:{type:Boolean,state:!0},_closeModalElements:{type:Array,state:!0},_clearPois:{type:Boolean,state:!0}}}constructor(){super(),this.visible=!1,this.iOSFixedHeader=!1,this.lossesReportRequestsId="",this.apiKey="",this.geoLocation={},this.pois=[],this.popupAxis={},this.adjusterIsAssigned=!1,this.mapTooltip={},this.mobileMarkerPopup={},this._hideMapTooltip=!1,this._closeModalElements=[],this._clearPois=!1}update(e){super.update(e),this._clearPois=!(!e.has("pois")&&!e.has("mobileMarkerPopup"))}_fireEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t,cancelable:!0}))}_changeVisible(e){const{detail:t,target:i}=e;this._fireEvent("modal-state-change",{target:i,visible:t,mode:Ve.is})}_headerRightPrimaryClick(e){e.stopPropagation(),this._fireEvent("emergency-tracking-reports-modal-tracking-stop-request-interval")}_changeMapTooltipVisible(){this._hideMapTooltip=!this._hideMapTooltip}get renderTrackingMap(){return l`
      <div class="map-tracking-content" slot="slot-content">
        <bbva-map-dynamic
          id="map-id"
          api-key=${this.apiKey}
          .popupAxis=${this.popupAxis}
          .geoLocation=${this.geoLocation}
          .pois=${this.pois}
          .mobileMarkerPopup=${this.mobileMarkerPopup}
          ?clear-pois=${this._clearPois}
          @map-dynamic-popup-click=${this._changeMapTooltipVisible}
          @map-dynamic-popup-tap="${this._changeMapTooltipVisible}"
        ></bbva-map-dynamic>
        ${this.renderLoading}
      </div>
    `}get renderLoading(){var e,t,i,s,r,a,o,n,c;return this.adjusterIsAssigned?l`
          <emergency-tracking-reports-map-tooltip
            class="map-tracking-tooltip"
            .icon=${x()}
            ?hidden=${this._hideMapTooltip}
            avatar-class=${z(null===(e=this.mapTooltip)||void 0===e?void 0:e.avatarClass)}
            avatar-text=${z(null===(t=this.mapTooltip)||void 0===t?void 0:t.avatarText)}
            avater-image=${z(null===(i=this.mapTooltip)||void 0===i?void 0:i.avatarImage)}
            title=${z(null===(s=this.mapTooltip)||void 0===s?void 0:s.title)}
            description=${z(null===(r=this.mapTooltip)||void 0===r?void 0:r.description)}
            sub-description=${z(null===(a=this.mapTooltip)||void 0===a?void 0:a.subDescription)}
            badge-text=${z(null===(o=this.mapTooltip)||void 0===o?void 0:o.badgeText)}
            .avatarColors=${null===(n=this.mapTooltip)||void 0===n?void 0:n.avatarColors}
            .options=${null===(c=this.mapTooltip)||void 0===c?void 0:c.options}
            @emergency-tracking-reports-map-tooltip-close=${this._changeMapTooltipVisible}
          >
          </emergency-tracking-reports-map-tooltip>
        `:l`
          <div class="map-tracking-loader">
            <bbva-spinner ?paused="${this.adjusterIsAssigned}" with-mask=""></bbva-spinner>
            <bbva-text
              size="S"
              alignment="center"
              .text=${this.t("emergency-tracking-reports-modal-tracking-loader-text")}
            >
            </bbva-text>
          </div>
        `}render(){return l`
      <bbva-help-modal
        aria-label=${this.t("emergency-tracking-reports-modal-tracking-aria-label")}
        header-type="modal"
        hide-content-padding-top
        header-text=${this.t("emergency-tracking-reports-modal-tracking-header-title")}
        ?visible=${this.visible}
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        accessibility-text-icon-right-primary=${this.t("emergency-tracking-reports-modal-tracking-text-icon-close")}
        @visible-changed=${this._changeVisible}
        full-height
        .closeModalElements="${this._closeModalElements}"
        @help-modal-header-right-primary-click="${this._headerRightPrimaryClick}"
      >
        ${this.renderTrackingMap}
      </bbva-help-modal>
    `}}const Be=new g;var Fe=c`:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--_emergency-tracking-reports-bg-color);
  --_emergency-tracking-reports-bg-color: var(--emergency-tracking-reports-dark-mode-bg-color, var(--emergency-tracking-reports-bg-color, var(--ambientsLight100, ${d(W.light100)})));
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-progress-content] {
  --bbva-progress-content-z-index: 100;
}
${Be.mediaRules()}`;class Ge extends(J(te(a(s)))){static get is(){return"emergency-tracking-reports"}static get scopedElements(){const e=[xe,Oe,Ve,...Ge.configurationScopedElements()];return Ge.scopedElementsFromClasses(e)}static get properties(){return{lossesReportRequestsId:{type:String,attribute:"losses-report-request-id"},sosEntryPoint:{type:Boolean,attribute:"sos-entry-point"},emergenciesEntryPoint:{type:Boolean,attribute:"emergencies-entry-point"},insuranceLossFields:{type:String,attribute:"insurance-loss-fields"},geolocationRequestsFrequency:{type:Number,attribute:"geo-location-request-frequency"},phoneNumberBbvaLineVehicle:{type:String,attribute:"phone-number-bbva-line-vehicle"},policyId:{type:Object,attribute:"policy-id"},claimTask:{type:String,attribute:"claim-task"},viewCallVisible:{type:Boolean,attribute:"view-call-visible"},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"},apiKey:{type:String,attribute:"api-key"},_geoLocation:{type:Object,state:!0},_cancellationReportId:{type:String,state:!0},_vehicleInsurancesApiVersion:{type:String,state:!0},_insurancesLossesApiVersion:{type:String,state:!0},_pois:{type:Array,state:!0},_popupAxis:{type:Object,state:!0},_adjusterIsAssigned:{type:Boolean,state:!0},_generalModalVisible:{type:Boolean,state:!0},_trackingModalVisible:{type:Boolean,state:!0},_generalModalMode:{type:String,state:!0},_source:{type:String,state:!0},_mapTooltip:{type:Object,state:!0},_mobileMarkerPopup:{type:Object,state:!0},_isAInsuranceLossApiCommunicationError:{type:Boolean,state:!0},_trackingHasBeenShownFirstTime:{type:Boolean,state:!0},_trackingData:{type:Object,state:!0}}}constructor(){super(),this._visibilityListener(),this.config={loader:!0},this.lossesReportRequestsId="",this.sosEntryPoint=!1,this.emergenciesEntryPoint=!1,this.insuranceLossFields="",this.geolocationRequestsFrequency=0,this.phoneNumberBbvaLineVehicle="",this.policyId={},this.claimTask="",this.viewCallVisible=!1,this.iOSFixedHeader=!1,this.apiKey="",this._vehicleInsurancesApiVersion="1",this._insurancesLossesApiVersion="1",this._geoLocation=void 0,this._cancellationReportId="",this._pois=[],this._popupAxis={},this._adjusterIsAssigned=!1,this._generalModalVisible=!1,this._trackingModalVisible=!1,this._generalModalMode="",this._source="",this._mapTooltip="",this._mobileMarkerPopup={},this._isAInsuranceLossApiCommunicationError=!1,this._trackingHasBeenShownFirstTime=!1,this._trackingData={}}firstUpdated(){this._dmTracking=this.shadowRoot.querySelector("#dmTracking"),super.firstUpdated()}update(e){(e.has("sosEntryPoint")||e.has("emergenciesEntryPoint")||e.has("lossesReportRequestsId"))&&""!==this.lossesReportRequestsId&&(this.sosEntryPoint&&!this.emergenciesEntryPoint?this._source="sos-entry-point":this.sosEntryPoint||this.emergenciesEntryPoint?this._source="emergencies-entry-point":this._source="login-entry-point",this._openModal(!1,Oe.MODES.reportDetected)),e.has("_trackingData")&&this._setAdjusterTrackingData(),super.update(e)}static get styles(){return[Fe,T("emergency-tracking-reports-shared-styles")]}_visibilityListener(){document.addEventListener("visibilitychange",this._setAdjusterTrackingData.bind(this))}_changeGeneralModalStatus({detail:e}){this._generalModalVisible=null==e?void 0:e.visible}_changeTrackingModalStatus({detail:e}){this._trackingModalVisible=null==e?void 0:e.visible}_showWarningModal(){this._openModal(!1,Oe.MODES.cancellationWarning)}navigateBack(){this._hideAndResetAllModals(),this._dispatchCustomEvent("emergency-tracking-reports-back-step")}_cancelReport(){this.showLoader(),this._dmTracking.cancelReport()}_openModal(e,t=""){e?this._trackingModalVisible=!0:(this._generalModalMode=t,this._generalModalVisible=!0)}_startTracking(){this._dmTracking.startTracking(),this._openModal(!0)}_openInsurancesLossCommunicationError(){this.clearLoader(),this._isAInsuranceLossApiCommunicationError=!0,this._openModal(!1,Oe.MODES.communicationError)}_handleLossesReportError({detail:e}){this.clearLoader(),null!=e&&e.isCommunicationError?(this._isAInsuranceLossApiCommunicationError=!1,this._openModal(!1,Oe.MODES.communicationError)):this._openModal(!1,Oe.MODES.cancellationError)}_handleCancellationProcess({detail:e}){this.clearLoader(),this._cancellationReportId=e,this._openModal(!1,Oe.MODES.cancellationProcess),this._dispatchCustomEvent("emergency-tracking-reports-remove-losses-report-requests-id")}_finishTracking(){this._dispatchCustomEvent("emergency-tracking-reports-remove-losses-report-requests-id"),this.navigateBack()}_setAdjusterTrackingData(){if(!document.hidden&&Object.entries(this._trackingData).length){var e,t,i,s;if(this._mapTooltip=null===(e=this._trackingData)||void 0===e?void 0:e.mapTooltip,this._popupAxis={axisX:20,axisY:53},this._trackingHasBeenShownFirstTime)this._mobileMarkerPopup=null===(t=this._trackingData)||void 0===t?void 0:t.mobileMarkerPopup;else this._geoLocation=null===(i=this._trackingData)||void 0===i?void 0:i.geoLocation,this._pois=[{icon:"bbvaAuto",...null===(s=this._trackingData)||void 0===s?void 0:s.adjusterLocation}],this._trackingHasBeenShownFirstTime=!0;this._adjusterIsAssigned=!0}}_stopRequestInterval(){this._dmTracking.stopInsuranceLossRequest(),this.navigateBack()}_hideAndResetAllModals(){this.lossesReportRequestsId="",this.sosEntryPoint=!1,this.emergenciesEntryPoint=!1,this._trackingModalVisible=!1,this._generalModalVisible=!1}get _renderDm(){return l`
      <emergency-tracking-reports-dm
        id="dmTracking"
        host=${this.host}
        required-token=${this.requiredToken}
        ?native=${this.native}
        vehicle-insurances-api-version=${this._vehicleInsurancesApiVersion}
        insurances-losses-api-version=${this._insurancesLossesApiVersion}
        losses-report-request-id=${this.lossesReportRequestsId}
        insurance-loss-fields=${this.insuranceLossFields}
        api-key=${this.apiKey}
        .phoneNumberBbvaLineVehicle=${this.phoneNumberBbvaLineVehicle}
        .geolocationRequestsFrequency=${this.geolocationRequestsFrequency}
        .policyId=${this.policyId}
        .claimTask=${this.claimTask}
        @emergency-tracking-reports-set-adjuster-tracking-data=${e=>{this._trackingData=e.detail}}
        @emergency-tracking-reports-finish-tracking=${this._finishTracking}
        @emergency-tracking-reports-insurances-loss-communication-error=${this._openInsurancesLossCommunicationError}
        @emergency-tracking-reports-losses-report-error=${this._handleLossesReportError}
        @emergency-tracking-reports-losses-report-cancellation-process=${this._handleCancellationProcess}
      >
      </emergency-tracking-reports-dm>
    `}get _renderTrackingModal(){return l`
      <emergency-tracking-reports-modal-tracking
        ?visible=${this._trackingModalVisible}
        i-o-s-fixed-header=${this.iOSFixedHeader}
        report-requests-id=${this.lossesReportRequestsId}
        api-key=${this.apiKey}
        .geoLocation=${this._geoLocation}
        .popupAxis=${this._popupAxis}
        .pois=${this._pois}
        .adjusterIsAssigned=${this._adjusterIsAssigned}
        .mapTooltip=${this._mapTooltip}
        .mobileMarkerPopup=${this._mobileMarkerPopup}
        @modal-state-change=${this._changeTrackingModalStatus}
        @emergency-tracking-reports-modal-tracking-warning=${this._showWarningModal}
        @emergency-tracking-reports-request-cancellation=${this._cancelReport}
        @emergency-tracking-reports-modal-tracking-stop-request-interval=${this._stopRequestInterval}
      >
      </emergency-tracking-reports-modal-tracking>
    `}get _renderGeneralModal(){return l`
      <emergency-tracking-reports-modal
        ?visible=${this._generalModalVisible}
        mode=${this._generalModalMode}
        source=${this._source}
        i-o-s-fixed-header="${this.iOSFixedHeader}"
        losses-report-request-id=${this.lossesReportRequestsId}
        .cancellationReportId=${this._cancellationReportId}
        .phoneNumber=${this.phoneNumberBbvaLineVehicle}
        .viewCallVisible=${this.viewCallVisible}
        .insuranceLossApiCommunicationError=${this._isAInsuranceLossApiCommunicationError}
        @modal-state-change=${this._changeGeneralModalStatus}
        @emergency-tracking-reports-get-out=${this.navigateBack}
        @emergency-tracking-reports-request-cancellation=${this._cancelReport}
        @emergency-tracking-reports-start-tracking=${this._startTracking}
      >
      </emergency-tracking-reports-modal>
    `}render(){return l`
      ${super.render()} ${this._renderDm}
      <div ambient="light">
        ${this._renderTrackingModal} ${this._renderGeneralModal}
      </div>
    `}}customElements.define(Ge.is,Ge);
