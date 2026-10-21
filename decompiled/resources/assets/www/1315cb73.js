import{J as e,L as t,z as i,a8 as a,ac as r,ar as s,a9 as o,aa as n,ap as l,an as h,ak as d,bx as c,h as p,i as u,ab as g,ad as b,cR as m,bF as v,a as y,y as f,ah as _,aN as x,ai as S,ag as T,F as w,b$ as $,b1 as R,c0 as k,f as E,g as C,H as I,aX as A,v as O,u as P,cI as H,cJ as L,aD as N,bU as q,aF as D,b6 as M}from"./952f98a9.js";import{bz as j}from"./7f3d7ca9.js";import"./216055dc.js";import"./c0a2f832.js";import"./cae0f1de.js";class V extends(e(t)){}class F{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let i=Object(this),a=i.length>>>0;if(0===a)return!1;let r=0|t,s=Math.max(r>=0?r:a-Math.abs(r),0);for(;s<a;){if((o=i[s])===(n=e)||"number"==typeof o&&"number"==typeof n&&isNaN(o)&&isNaN(n))return!0;s++}var o,n;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var i=[],a=0,r="",s=0,o=arguments.length;s!==o;++s){var n=+arguments[s];if(!(n<1114111&&n>>>0===n))throw RangeError("Invalid code point: "+n);n<=65535?a=i.push(n):(n-=65536,a=i.push(55296+(n>>10),n%1024+56320)),a>=16383&&(r+=e.apply(null,i),i.length=0)}return r+e.apply(null,i)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",i=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${i&&i.message}`)}}class U extends F{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}}const z="jwt",B="tsec",G="none";class J extends F{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assingSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new U,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assingSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=B:this.requiredToken=G,this.requiresJWT=!1):this.requiredToken===B?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===z?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===G?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(B)}_setJwtHandler(){this._setTokenHandler(z)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((i,a)=>{t=Object.assign(t,{resolve:i,reject:a}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let i=this._getRequestHeaders();Object.keys(i).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,i[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t(e,this._buildBody(),this._getRequestHeaders(),this._onRequestSuccess.bind(this),this._onRequestFail.bind(this),this.multipart,1e3*this.timeout):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){const e=!!window.CellsNativePlugins&&!!window.CellsNativePlugins.Http,t=!!window.cordovaCells&&!!window.cordovaCells.Http;return e?window.CellsNativePlugins.Http:t?window.cordovaCells.Http:null}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let i=e.replace(/[\{\}]+/g,""),a=t[i];return a?delete t[i]:this._error(9,`Missing ${i} param value`),a})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let i=Object.keys(t);i.length&&(e=[e,i.map((e=>`${e}=${t[e]}`)).join("&")].join("?"))}return e}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(B,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(z,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(i){var a=t.getItem(i);a&&"null"!==a&&(e[i]=a)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const i=window.sessionStorage;t=Object.keys(i).filter((t=>t.startsWith(e))).reduce(((t,a)=>(t[a.replace(e,"")]=i.getItem(a),t)),{})}return t}_getTokenForRequestHeaders(e,t){const i=`${e}Handler`,a=e===z?"JWT ":"",r=e===z?"Authorization":B;if(void 0===this[i]||null===this[i])this._error(11,`${e} handler is undefined`);else{const s=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let o=this[i].getItem(s);o?t[r]=t[r]||a+o:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((i=>{t.push(`${i}=${e[i]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/form-data")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let i;const a=new Promise(((e,t)=>{i=(i,a)=>{i?t(i):e(a)}}));return t.addEventListener("loadend",(function e(a){t.removeEventListener("loadend",e),a.error?i(a.error):i(null,t.result)})),t.readAsText(e),a}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let i=0;for(;i<e.length;){let a=e[i],r=0,s=0;if(a<=127?(r=0,s=255&a):a<=223?(r=1,s=31&a):a<=239?(r=2,s=15&a):a<=244&&(r=3,s=7&a),e.length-i-r>0){let t=0;for(;t<r;)a=e[i+t+1],s=s<<6|63&a,t+=1}else s=65533,r=e.length-i;t+=String.fromCodePoint(s),i+=r+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},i=e.trim().split(/[\r\n]+/);for(const e in i)if(i.hasOwnProperty(e)&&""!==i[e]){let a=": ",r=i[e].split(a);t[r.shift().toLowerCase()]=r.join(a)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,i,a){let r=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(a)>=0&&(r=t.getResponseHeader(a));break;case this._NATIVE_XHR:r=JSON.parse(t.headers)[a]}if(r){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):i;e.getItem(t)!==r&&(e.setItem(t,r),this._emitTokenUpdate(i,r))}}_emitTokenUpdate(e,t){if(this.htmlContext){const i=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(i)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,i,a,r;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),i=e.getResponseHeader("AuthenticationData"),a=e.getResponseHeader("AuthenticationState"),r=e.getResponseHeader("AuthenticationChallenge");else{let s=JSON.parse(e.headers);t=s.authenticationtype,i=s.authenticationdata,a=s.authenticationstate,r=s.authenticationchallenge}return{type:t,data:i,state:a,challenge:r}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",i=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const a=this._getSignatureData(e,t,i);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:a}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",i="",a=""){let r;if("object"==typeof e&&e){r=`${this._getSignatureData(e.signatureType,t,i)}=${e.signatureValue}`,e.challenge&&(r+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(r,e.signatureType,a)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(r=`password=${e}`,this._buildSignatureHeaders(r,"2",a)):(r=`${i}=${e}`,this._buildSignatureHeaders(r,t,a)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",i=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),i&&(this.headers=Object.assign(this.headers,{AuthenticationState:i})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),a=this._extractResponseErrorCode(t),r=this._ERROR_CODES.SIGNATURE_INVALID.includes(a),{type:s,data:o,state:n,challenge:l}=this._extractSignatureResponseHeaders(e),h=this._getSignatureMetadata(e);if(r)this._notifySignatureInvalid(h),i=!0;else if(s)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(a)?(this._notifySignatureTypeUsingErrorCode(a,h,s,o,n,l),i=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response ir rejected.")}else this._notifySignatureTypeUsingHeaders(h,s,o,n,l),i=!0}return i}_notifySignatureRequiredFirstStep(e,t,i,a){this._defineSignatureType(t,i),this._defineSignatureValue(t,i,a),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:i,metadata:e}}))}_notifySignatureRequired(e,t,i,a,r){this._defineSignatureValue(t,i,a),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:{type:t,data:i,challenge:r,metadata:e}}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_getSignatureMetadata(e){const{responseURL:t,status:i}=e;return{path:this._path,method:this.method,url:t,status:i}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",i=""){const a=t.split(";").findIndex((t=>t===e));return i.split(";")[a]}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,i,a,r){a?this._notifySignatureRequired(e,t,i,a,r):this._notifySignatureRequiredFirstStep(e,t,i,a)}_notifySignatureTypeUsingErrorCode(e,t,i,a,r,s){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,i,a,r):this._notifySignatureRequired(t,i,a,r,s)}}class X extends J{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}}class K extends X{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`financial-overview/v${this.version}/financial-overview`)}toString(){return super.toString("BGADPFinancialOverviewGetV0")}}class W extends V{static get is(){return"bbva-global-financial-overview-api-dm"}static get properties(){return{overview:{type:Object}}}constructor(){super(),this.overview={}}resetCache(){this.overview={}}getFinancialOverview(e={}){if(!Object.entries(this.overview).length){this._generateGetService(this._getService(e),{customEvent:"financial-overview-api-dm-fetch",errorFireEventHandler:"financial-overview-api-dm-fetch-error"},this._responseMapping,e.fields)}}_getService(e){var t=this._getServiceParams(e);return t.params=e||{},this._getServicePath("financialOverview",this._getBgadp(t))}_getBgadp(e){return{financialOverviewV0:()=>new K(e),default:()=>"BGADP called not exist"}}_responseMapping(e={}){return e}}customElements.define(W.is,W);const Y=new s;var Q=i`:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${a(o.primaryCoreDarkened)}));
  color: var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${a(o.primaryCoreLightened)}));
  --_bg-color-modal: var(--colorsPrimaryCore, ${a(o.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${a(o.primaryCoreLightened)});
  --_color-modal-three-level: var(--colorsSecondary600, ${a(o.secondary600)});
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${a(o.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${a(o.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
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

.header-main {
  display: flex;
  justify-content: space-between;
  align-items: center;
  position: relative;
  padding-top: var(--bbva-header-main-padding-top, 0);
  padding-left: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(n.spacer)}))) / 16) * 1rem);
  padding-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(n.spacer)}))) / 16) * 1rem);
  margin-left: auto;
  margin-right: auto;
  min-height: var(--bbva-header-main-min-height, calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${a(n.spacer)}))) / 16) * 1rem));
  max-width: var(--bbva-header-main-max-width, 100%);
}
.header-main .text {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
  display: block;
  position: absolute;
  bottom: 0;
  top: var(--bbva-header-main-text-top, var(--bbva-header-main-padding-top, 0));
  left: 0;
  width: 100%;
  height: var(--bbva-header-main-min-height, calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${a(n.spacer)}))) / 16) * 1rem));
  margin: 0;
  padding: 0 var(--bbva-header-main-text-padding-horizontal, calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${a(n.spacer)}))) / 16) * 1rem));
  text-align: center;
  font-size: var(--bbva-header-main-text-font-size, var(--typographyTypeMedium, ${a(r.typeMedium)}));
  line-height: var(--bbva-header-main-text-line-height, calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${a(n.spacer)}))) / 16) * 1rem));
  font-weight: 400;
}
.header-main .text.full-padding {
  --bbva-header-main-text-padding-horizontal: calc(((12 * var(--gridSpacerVariant, var(--gridSpacer, ${a(n.spacer)}))) / 16) * 1rem);
}
.header-main .text.image {
  display: flex;
  justify-content: center;
}
.header-main .header-icons {
  display: flex;
}
.header-main .icon {
  display: block;
  position: relative;
  border: none;
  background: none;
  width: var(--bbva-header-main-min-height, calc(((5.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(n.spacer)}))) / 16) * 1rem));
  min-height: var(--bbva-header-main-min-height, calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${a(n.spacer)}))) / 16) * 1rem));
  padding: 0;
  color: inherit;
  margin: 0;
}

:host([variant*=modal]) {
  background-color: var(--_bg-color-modal);
}

:host([variant*=modal-three-level]) {
  background-color: var(--_bg-color-modal-three-level);
  color: var(--_color-modal-three-level);
}

:host([variant*=process]) {
  background-color: var(--_bg-color-process);
}

:host([variant*=sign]) {
  background-color: var(--_bg-color-sign);
}

:host([variant*=transparent]) {
  background-color: var(--_bg-color-transparent);
}

:host([variant*=fixed]) {
  position: fixed;
  width: 100%;
}

@supports (padding-top: env(safe-area-inset-top)) {
  :host([variant*=notch-top]) {
    --safe-area-inset-top: env(safe-area-inset-top);
    padding-top: var(--safe-area-inset-top, 0);
  }
}
${Y.mediaRules()}`;let Z=class extends(l(h(t))){static get is(){return"bbva-header-main"}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},text:{type:String},variant:{type:String,reflect:!0}}}get _fullPadding(){return this.iconLeftSecondary||this.iconRightSecondary?"full-padding":""}get _hasImage(){return this.image?"image":""}constructor(){super(),this.iconSize=20}static get styles(){return[Q,d("bbva-header-main-shared-styles"),c("button:focus")]}render(){const{_fullPadding:e,_hasImage:t,text:i,image:a,accessibilityTextIconLeftPrimary:r,accessibilityTextIconLeftSecondary:s,accessibilityTextIconRightPrimary:o,accessibilityTextIconRightSecondary:n,iconLeftPrimary:l,iconLeftSecondary:h,iconRightPrimary:d,iconRightSecondary:c,iconSize:g}=this;return p`
      <header class="header-main">
        <h1 class="text ${e} ${t}" id="headding">
          <span id="text">${this.t(i)}</span>
          <img src="${u(a)}" alt="" ?hidden="${!a}" id="image" />
        </h1>

        <div class="header-icons">
          <button
            class="icon"
            id="btn-left-primary"
            aria-label="${u(this.t(r))}"
            ?hidden="${!l}"
            @click="${()=>this._headerIconClick("left-primary")}"
          >
            <bbva-core-icon
              icon="${u(l)}"
              size="${g}"
            ></bbva-core-icon>
          </button>
          <button
            class="icon"
            id="btn-left-secondary"
            aria-label="${u(this.t(s))}"
            ?hidden="${!h}"
            @click="${()=>this._headerIconClick("left-secondary")}"
          >
            <bbva-core-icon
              icon="${u(h)}"
              size="${g}"
            ></bbva-core-icon>
          </button>
        </div>

        <div class="header-icons">
          <button
            class="icon"
            id="btn-right-secondary"
            aria-label="${u(this.t(n))}"
            ?hidden="${!c}"
            @click="${()=>this._headerIconClick("right-secondary")}"
          >
            <bbva-core-icon
              icon="${u(c)}"
              size="${g}"
            ></bbva-core-icon>
          </button>

          <button
            class="icon"
            id="btn-right-primary"
            aria-label="${u(this.t(o))}"
            ?hidden="${!d}"
            @click="${()=>this._headerIconClick("right-primary")}"
          >
            <bbva-core-icon
              icon="${u(d)}"
              size="${g}"
            ></bbva-core-icon>
          </button>
        </div>
      </header>
    `}_headerIconClick(e){this.dispatchEvent(new CustomEvent(`header-main-icon-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}};customElements.define(Z.is,Z);const ee=new s;var te=i`:host {
  display: block;
  --_veil-bg-color: var(--colorsPrimaryCoreDarkened, ${a(o.primaryCoreDarkened)});
  --bbva-help-modal-safe-area-inset-top: 0;
  --_help-modal-content-bg-color: var(--bbva-help-modal-content-bg-color, var(--colorsPrimaryCoreLightened, ${a(o.primaryCoreLightened)}));
  --_help-modal-title-icon-color: var(--bbva-help-modal-title-icon-color, var(--colorsPrimarySubdued, ${a(o.primarySubdued)}));
  --_help-modal-title-icon-color-warning: var(--bbva-help-modal-title-icon-color-warning, var(--colorsTertiaryType1Dark, ${a(o.tertiaryType1Dark)}));
  --_help-modal-title-icon-color-info: var(--bbva-help-modal-title-icon-color-info, var(--colorsTertiaryType3Dark, ${a(o.tertiaryType3Dark)}));
  --_help-modal-title-title-color: var(--bbva-help-modal-title-title-color, var(--colorsSecondary600, ${a(o.secondary600)}));
  --_help-modal-content-color: var(--bbva-help-modal-content-color, var(--colorsSecondary500, ${a(o.secondary500)}));
  --_help-modal-footer-bg-color: var(--bbva-help-modal-footer-bg-color, var(--colorsPrimaryCoreLightened, ${a(o.primaryCoreLightened)}));
  --_help-modal-ios-header-bg-color: var(--bbva-help-modal-ios-header-bg-color, var(--colorsPrimaryCore, ${a(o.primaryCore)}));
}

:host(:not([visible])) {
  display: var(--bbva-help-modal-display, none);
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
  transition: visibility 0.2s ease-in-out, opacity 0.2s ease-in-out;
  visibility: hidden;
}

.help-modal {
  background-color: var(--_help-modal-content-bg-color);
  bottom: 0;
  box-sizing: border-box;
  display: flex;
  flex-direction: column;
  height: auto;
  left: 0;
  max-height: 50%;
  overflow-y: auto;
  position: fixed;
  transform: translateY(100%);
  transition: transform 0.2s ease-in-out;
  width: 100%;
  will-change: transform;
  padding-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(n.spacer)}))) / 16) * 1rem);
}

.modal-container {
  padding: var(--bbva-help-modal-padding, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${a(n.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(n.spacer)}))) / 16) * 1rem) 0);
  display: flex;
  flex-direction: column;
  align-items: center;
}

.modal-title {
  align-items: center;
  display: flex;
  flex-direction: column;
  font-size: var(--bbva-help-modal-title-font-size, var(--typographyTypeMedium, ${a(r.typeMedium)}));
  font-weight: var(--bbva-help-modal-title-font-weight, var(--fontFacePrimaryMediumFontWeight, ${a(g.medium.fontWeight)}));
  line-height: var(--bbva-help-modal-title-line-height, var(--lineHeightTypeMedium, ${a(b.typeMedium)}));
  position: relative;
}
.modal-title .title-icon {
  color: var(--_help-modal-title-icon-color);
  margin-bottom: var(--bbva-help-modal-title-icon-margin-bottom, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(n.spacer)}))) / 16) * 1rem));
}
.modal-title .title-text {
  color: var(--_help-modal-title-title-color);
}

:host([modal-type=warning]) .title-icon {
  color: var(--_help-modal-title-icon-color-warning);
}

:host([modal-type=info]) .title-icon {
  color: var(--_help-modal-title-icon-color-info);
}

.modal-content-wrapper {
  max-width: var(--bbva-help-modal-content-max-width, 100%);
  width: var(--bbva-help-modal-content-width, 100%);
  color: var(--_help-modal-content-color);
  font-size: var(--bbva-help-modal-content-font-size, var(--typographyTypeSmall, ${a(r.typeSmall)}));
  line-height: var(--bbva-help-modal-content-line-height, var(--lineHeightTypeSmall, ${a(b.typeSmall)}));
  text-align: center;
}
:host(:not([hide-content-padding-top])) .modal-content-wrapper {
  padding-top: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${a(n.spacer)}))) / 16) * 1rem);
}

.slot-footer {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: var(--bbva-help-modal-footer-padding, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${a(n.spacer)}))) / 16) * 1rem) 0 0);
  background-color: var(--_help-modal-footer-bg-color);
}

.footer-button:last-child {
  margin-top: var(--bbva-help-modal-footer-last-button-margin-top, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(n.spacer)}))) / 16) * 1rem));
}

:host([visible]) .veil {
  visibility: visible;
  opacity: var(--_veil-opacity, 0.9);
}
:host([visible]) .help-modal {
  transform: translateY(0);
}

:host([full-height]) .modal-header {
  position: sticky;
  top: 0;
  z-index: 1;
}
:host([full-height]) .help-modal {
  height: 100%;
  max-height: initial;
}

:host([fixed-footer]) .modal-container {
  flex-grow: 1;
  overflow-y: auto;
}
:host([fixed-footer]) .modal-content-wrapper, :host([fixed-footer]) .modal-content, :host([fixed-footer]) .slot-content {
  flex-grow: 1;
  display: flex;
  flex-direction: column;
  width: 100%;
}
:host([fixed-footer]) .slot-footer {
  box-shadow: var(--bbva-help-modal-footer-fixed-shadow, 0 0 4px 0 rgba(18, 18, 18, 0.3));
  padding-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(n.spacer)}))) / 16) * 1rem);
}
:host([fixed-footer]) .help-modal {
  padding-bottom: 0;
}

.help-modal[_should-display-fixed-header] {
  padding-top: var(--bbva-help-modal-safe-area-inset-top, 0);
  position: fixed;
}
@supports (padding-top: constant(safe-area-inset-top)) {
  .help-modal[_should-display-fixed-header] {
    --bbva-help-modal-safe-area-inset-top: constant(safe-area-inset-top);
  }
}
@supports (padding-top: env(safe-area-inset-top)) {
  .help-modal[_should-display-fixed-header] {
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
.iOS-fixed-header {
  background-color: var(--_help-modal-ios-header-bg-color);
  height: var(--bbva-help-modal-safe-area-inset-top, 0);
  position: absolute;
  bottom: calc(100vh - var(--bbva-help-modal-safe-area-inset-top, 0));
  width: 100%;
  z-index: 5;
}

@media (min-width: 45rem) {
  :host([full-height]) .help-modal {
    --_help-modal-content-bg-color: transparent;
    padding-bottom: 0;
  }
  :host([full-height]) .modal-header {
    --bbva-header-main-max-width: $breakpoint;
  }
  :host([full-height]) .modal-container,
:host([full-height]) .modal-footer {
    margin: auto;
  }
  :host([full-height]) .modal-container {
    max-width: 45rem;
    background-color: var(--colorsPrimaryCoreLightened, ${a(o.primaryCoreLightened)});
    flex-grow: 1;
    overflow-y: auto;
  }
  :host([full-height]) .modal-footer {
    width: 45rem;
  }
  :host([full-height]) .modal-footer .slot-footer {
    padding-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(n.spacer)}))) / 16) * 1rem);
  }
}
${ee.mediaRules()}`;class ie extends(h(m)){static get is(){return"bbva-help-modal"}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},headerText:{type:String,attribute:"header-text"},headerType:{type:String,attribute:"header-type"},titleIcon:{type:String,attribute:"title-icon"},titleText:{type:String,attribute:"title-text"},bodyText:{type:String,attribute:"body-text"},buttonText:{type:String,attribute:"button-text"},linkText:{type:String,attribute:"link-text"},fixedFooter:{type:Boolean,attribute:"fixed-footer",reflect:!0},stickyFooter:{type:Boolean,attribute:"sticky-footer",reflect:!0},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"},iOSDevices:{type:Array,attribute:"i-o-s-devices"},userAgentRegex:{type:String,attribute:"user-agent-regex"},hideContentPaddingTop:{type:Boolean,attribute:"hide-content-padding-top"},modalType:{type:String,reflect:!0,attribute:"modal-type"}}}constructor(){super(),this.iconLeftPrimary="",this.iconLeftSecondary="",this.iconRightPrimary=v(),this.iconRightSecondary="",this.accessibilityTextIconLeftPrimary="",this.accessibilityTextIconLeftSecondary="",this.accessibilityTextIconRightPrimary="",this.accessibilityTextIconRightSecondary="",this.headerText="",this.headerType="modal-three-level",this.titleIcon="",this.titleText="",this.bodyText="",this.buttonText="",this.linkText="",this.iOSFixedHeader=!1,this.iOSDevices=["iOS","iPhone"],this.userAgentRegex=/\(([^)]+)\)/,this.hideContentPaddingTop=!1,this.modalType="",this.resetScroll=!0}firstUpdated(e){super.firstUpdated&&super.firstUpdated(e),this._modal=this.shadowRoot.querySelector(".help-modal"),this._header=this.shadowRoot.querySelector(".modal-header"),this._content=this.shadowRoot.querySelector(".modal-content-wrapper"),this._footer=this.shadowRoot.querySelector(".modal-footer"),this._container=this.shadowRoot.querySelector(".modal-container"),this._checkHeight()}updated(e){if(super.updated&&super.updated(e),e.has("visible")){let e="close";this.visible&&(e="open"),this.dispatchEvent(new CustomEvent(`help-modal-${e}`,{detail:{status:e},bubbles:!0,composed:!0}))}this._updateAccessibility()}static get styles(){return[super.styles,te,d("bbva-help-modal-shared-styles")]}get _fixedIOSHeader(){return p`
      <div ?hidden="${!this._shouldDisplayFixedHeader()}" class="iOS-fixed-header"></div>
    `}get helpModalHeader(){return this.headerText?p`
          <slot name="slot-header" class="header-slot">
            <bbva-header-main
              id="helpModalHeader"
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
              @header-main-icon-right-primary-click="${this.close}"
            ></bbva-header-main>
          </slot>
        `:""}get helpModalContent(){return p`
      <div id="helpModalContent" class="modal-content">
        <span class="slot-content-header"><slot name="slot-content-header"></slot></span>
        <span class="slot-content"><slot name="slot-content">${this.bodyText}</slot></span>
      </div>
    `}get helpModalFooter(){return p`
      <div class="modal-footer">
        <slot name="slot-footer">
          <div class="slot-footer" ?hidden="${!this.buttonText&&!this.linkText}">
            <bbva-button-default
              class="footer-button"
              ?hidden="${!this.buttonText}"
              @click="${()=>this._handleClick("footer-button")}"
              >${this.buttonText}</bbva-button-default
            >
            <bbva-link
              class="footer-button"
              @click="${()=>this._handleClick("footer-link")}"
              ?hidden="${!this.linkText}"
              >${this.linkText}</bbva-link
            >
          </div>
        </slot>
      </div>
    `}get helpModalTitle(){return p`
      <div id="helpModalTitle" class="modal-title">
        <slot name="slot-title">
          <bbva-core-icon
            class="title-icon"
            size="24"
            icon="${this.titleIcon}"
            ?hidden="${!this.titleIcon}"
          ></bbva-core-icon>
          <span class="title-text" ?hidden="${!this.titleText}">${this.titleText}</span>
        </slot>
      </div>
    `}_updateAccessibility(){this.visible?this.removeAttribute("aria-hidden"):this.setAttribute("aria-hidden","true"),this.titleText&&this.setAttribute("aria-labelledby","helpModalTitle"),this.bodyText&&this.setAttribute("aria-describedby","helpModalContent")}_checkHeight(){this._container.offsetHeight>=this._content.offsetHeight?this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","none"):this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","0 0 4px 0 rgba(18, 18, 18, .3)")}_setFooterShadow(e){e.currentTarget.scrollTop>=this._header.offsetHeight+this._content.offsetHeight+this._footer.offsetHeight-this._modal.offsetHeight?this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","none"):this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","0 0 4px 0 rgba(18, 18, 18, .3)")}_handleClick(e){this.dispatchEvent(new CustomEvent(`help-modal-${e}-click`,{detail:!0,bubbles:!0,composed:!0})),this.close()}_shouldDisplayFixedHeader(){const e=window.navigator.userAgent.match(this.userAgentRegex)[1].split(";");return this.iOSFixedHeader&&this.iOSDevices.includes(e[0])}get _modalContent(){return p`
      ${this._fixedIOSHeader}
      <div class="help-modal" ?_should-display-fixed-header="${this._shouldDisplayFixedHeader()}">
        <div class="modal-header">
          ${this.helpModalHeader}
        </div>
        <div class="modal-container" @scroll="${this._setFooterShadow}">
          <div class="modal-content-wrapper">
            ${this.helpModalTitle} ${this.helpModalContent}
          </div>
        </div>
        ${this.helpModalFooter}
      </div>
    `}}var ae=i`:host {
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
${(new s).mediaRules()}`;class re extends(y(t)){static get is(){return"bbva-notification-container"}static get scopedElements(){return{"bbva-notification-toast":f}}static get properties(){return{duration:{type:Number},defaultType:{type:String,attribute:"default-type"},notificationIcons:{type:Object},fixedBottom:{type:Boolean,attribute:"fixed-bottom"},roleText:{type:String,attribute:"role-text"},ariaLiveText:{type:String,attribute:"aria-live-text"}}}constructor(){super(),this.ariaLiveText="polite",this.roleText="alert",this.defaultType="error",this.duration=4e3,this.notificationIcons={info:_(),warning:_(),error:x(),success:S()},this._stack=[],this._currentNotification={},this._toastOpened=!1,this._uniqueId=String(Math.floor(Math.random()*Date.now()))}get _defaultNotification(){return{description:"",simpleLinkText:"",type:this.defaultType,duration:this.duration}}getParentElement(){const e=this.getRootNode();return 11===e.nodeType?e.host:document}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._parentElement=this.getParentElement(),this._boundShowNotification=this._showNotification.bind(this),this._boundHideNotification=this._hideOnEvent.bind(this),this._parentElement.addEventListener("show-notification",this._boundShowNotification),this._parentElement.addEventListener("hide-notification",this._boundHideNotification)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.clear(),this._parentElement.removeEventListener("show-notification",this._boundShowNotification),this._parentElement.removeEventListener("hide-notification",this._boundHideNotification)}clear(e=!1){e&&(this._stack=[]),this._hideNotification()}_hideNotification(){this._currentTime&&this._clearTime(),this._toastOpened=!1,this.requestUpdate()}_clearTime(){clearTimeout(this._currentTime),this._currentTime=null}_computeIcon(e){return this.notificationIcons[e]||this.notificationIcons[this.defaultType]}_onNotificationClosed(e){e.stopPropagation(),this._showNextInStack()}_setCurrentNotification(){this._currentNotification={...this._defaultNotification,...this._stack.shift()}}_setNotificationDuration(){const{duration:e}=this._currentNotification;e>0&&(this._currentTime=setTimeout(this.clear.bind(this),e))}_hideOnEvent(e){this.clear(e.detail),e.stopPropagation(),e.stopImmediatePropagation(),e.preventDefault()}_showNotification(e){this.add(e.detail),e.stopPropagation(),e.stopImmediatePropagation(),e.preventDefault()}_showNextInStack(){this._stack.length>0&&!this._toastOpened&&(this._setCurrentNotification(),this._toastOpened=!0,this._setNotificationDuration(),this.requestUpdate())}add({description:e="",simpleLinkText:t,type:i=this.defaultType,duration:a=this.duration}={}){const r=i;this._stack.push({type:r,description:e,simpleLinkText:t,duration:a}),this._showNextInStack()}static get styles(){return[ae,d("bbva-notification-container-shared-styles")]}render(){return p`
      <bbva-notification-toast
        .id="toast_${this._uniqueId}"
        ?show="${this._toastOpened}"
        @click="${this._hideNotification}"
        type="${u(this._currentNotification.type)}"
        .iconExplainer="${this._computeIcon(this._currentNotification.type)}"
        @closed="${this._onNotificationClosed}"
        .simpleLinkText="${this._currentNotification.simpleLinkText}"
        .alertText="${u(this._currentNotification.description)}"
        ?fixed-bottom="${this.fixedBottom}"
        .ariaLiveText="${this.ariaLiveText}"
        .roleText="${this.roleText}"
      ></bbva-notification-toast>
    `}}var se=i`
:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-dark-mode-bg-color, var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${a(o.primaryCoreDarkened)})));
  color: var(--_text-color);
  position: var(--bbva-header-main-position, -webkit-sticky);
  position: var(--bbva-header-main-position, sticky);
  top: 0;
  z-index: var(--bbva-header-main-z-index, 1);
  padding: 0 0.25rem;
  --_bg-color-modal: var(--colorsPrimaryCore, ${a(o.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${a(o.primaryCoreLightened)});
  --_color-modal-three-level: var(--bbva-header-main-dark-mode-color-modal-three-level ,var(--colorsSecondary600, ${a(o.secondary600)}));
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${a(o.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${a(o.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
  --_text-color: var(--bbva-header-main-dark-mode-text-color ,var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${a(o.primaryCoreLightened)})));
  --_bg-color-modal: var(--colorsPrimaryCore, ${a(o.primaryCore)});
  --_header-main-active-icon-color: var(--bbva-header-main-dark-active-icon-color, var(--colorsPrimarySubduedLight, ${a(o.primarySubduedLight)}));
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
  font-size: var(--bbva-header-main-text-font-size, var(--typographyTypeMedium, ${a(r.typeMedium)}));
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
`;class oe extends(y(l(h(t)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":T,"bbva-icon":w,"bbva-badge-notification":$}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const e={1:"half-space",2:"full-space"},t=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,i=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,a=Math.max(t,i);return a in e?e[a]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[se,d("bbva-header-main-shared-styles"),c("button:focus"),R.dark]}static toCamelCase(e){return(e.charAt(0).toUpperCase()+e.slice(1)).replace(/([-_][a-z])/gi,(e=>e.toUpperCase().replace("-","").replace("_","")))}_icon(e){return p`<bbva-icon icon="${u(this[e])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(e){return p`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right-header"
      variant="alert"
    >
      ${this._icon(e)}
    </bbva-badge-notification>`}_tplButton(e,t,i,a){const r=oe.toCamelCase(e),s=`icon${r}`,o=`accessibilityTextIcon${r}`;return p`<button
      class="${t}"
      id="btn-${e}"
      aria-label="${u(this.t(this[o]))}"
      aria-expanded=${u(a)}
      ?hidden="${!this[s]}"
      @click="${()=>this._headerIconClick(e)}"
    >
      ${"left-primary"===e&&this.notificationText?this._badgeNotification(s):this._icon(s)}
      ${this.showTextIcon?this._textIcon(i):""}
    </button>`}_textIcon(e){return p` <bbva-text
      unset
      ambient="dark"
      ellipsis
      class="text-icon"
      size="3XS"
      tag="span"
      alignment="center"
      .text="${u(this.t(e))}"
    >
    </bbva-text>`}_tplHeading(e){return p`
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
    `}render(){const{_availableHeadingSpace:e,_hasImage:t,text:i,image:a,_hasMicroillustration:r}=this;return p`
      <header class="header-main">
        <div class="header-icons ${e} left-group" data-id="iconsLeft">
          ${this._tplButton("left-primary","icon primary",this.textIconLeftPrimary?this.textIconLeftPrimary:this.accessibilityTextIconLeftPrimary)}
          ${this._tplButton("left-secondary","icon secondary",this.textIconLeftSecondary?this.textIconLeftSecondary:this.accessibilityTextIconLeftSecondary)}
        </div>

        <h1
          class="heading-wrapper ${t}"
          id="heading"
          aria-label=${(r||a)&&this.accessibilityTextImage?this.t(this.accessibilityTextImage):this.t(i)}
          tabindex="-1"
        >
          ${i&&" "!==i&&this._tplHeading(i)||""}
          <img src="${u(a)}" alt="" ?hidden="${!a}" id="image" aria-hidden="true" />

          <span
            class="${r}"
            ?hidden="${!r}"
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
    `}_headerIconClick(e){this.dispatchEvent(new CustomEvent(`header-main-icon-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}}C("colors.primaryCoreLightened"),C("colors.cool80"),C("colors.cool70"),C("colors.primaryCoreLightened"),C("colors.cool100"),C("colors.tertiaryType6Darkened"),C("colors.tertiaryType4Darkened"),C("colors.secondary300");const ne=I((e=>class extends(A(e)){static configurationScopedElements(){return[re,O,oe,P]}static get properties(){return{config:{type:Object},_showNotifyTop:{type:Boolean}}}constructor(){super(),this.config={header:!1,back:!0,fixedHeader:!1,loader:!1,notify:!1,notifyTop:!1,notifyFeature:!1,smartAssistant:!1,faqs:!1},this._showNotifyTop=!1,this._boundBackHandler=this._back.bind(this),this._fixedHeaderStyles="position: sticky; top: 0; left: 0; width: 100%; z-index: var(--bbva-header-main-z-index, 1);"}firstUpdated(){this.config={...this.config,back:!Object.prototype.hasOwnProperty.call(this.config,"back")||this.config.back}}get _headerStyles(){return this.config.header&&this.config.fixedHeader?this._fixedHeaderStyles:""}_tpl(e,t){const i=`_${e}`;return this[i]||(this[i]=document.createElement(e)),"object"==typeof t&&Object.keys(t).forEach((e=>{"@"===e[0]?this[i].addEventListener(e.substring(1),t[e]):this[i][e]=t[e]})),this._setPrimaryLeftIcon(e,i),this._setSecondaryRightIcon(e,i),p`${this[i]}`}_back(){this._dispatchCustomEvent("navigation-go-back")}_setPrimaryLeftIcon(e,t){if(this.config.header&&e===this.getScopedTagName("bbva-header-main")&&this.config.back){this[t].iconLeftPrimary=this.config.header.iconLeftPrimary||H();const e="@header-main-icon-left-primary-click",i=this.config.header[e]?this.config.header[e]:this._boundBackHandler;this[t].removeEventListener("header-main-icon-left-primary-click",i),this[t].addEventListener("header-main-icon-left-primary-click",i)}}_setSecondaryRightIcon(e,t){this.config.header&&e===this.getScopedTagName("bbva-header-main")&&(this[t].iconRightSecondary=this[t].iconRightSecondary||this.config.smartAssistant&&L()||this.config.faqs&&N())}_dispatchCustomEvent(e,t=!0,i=!0,a=!0){this.dispatchEvent(new CustomEvent(e,{bubbles:i,composed:a,detail:t,cancelable:!0}))}showLoader(e="full",t=!1,i=!1){const a={variant:e,showSpinnerMessageLabel:t,loginAnimation:i};this._dispatchCustomEvent("show-loader",a)}clearLoader(){this._dispatchCustomEvent("hide-loader")}showNotify(e,t,i,a){const r={description:e,simpleLinkText:t,type:i,duration:a};this._dispatchCustomEvent("show-notification",r)}clearNotify(){this._dispatchCustomEvent("hide-notification")}showNotifyTop({text:e="",status:t=""}={}){this.config.notifyTop={...this.config.notifyTop,text:e,status:t},this._showNotifyTop=!0}clearNotifyTop(){this._showNotifyTop=!1}renderNotify(){var e,t,i;return p`
          ${null!==(e=this.config)&&void 0!==e&&e.notify||null!==(t=this.config)&&void 0!==t&&t.notifyFeature?this._tpl(this.getScopedTagName("bbva-notification-container"),{fixedBottom:null===(i=this.config)||void 0===i?void 0:i.notifyFeature,...this.config.notify}):null}
        `}_getElements(){var e,t,i,a;return{[this.getScopedTagName("bbva-notification-status")]:{config:{...this.config.notifyTop,hide:!this._showNotifyTop},condition:(null===(e=this.config)||void 0===e?void 0:e.notifyTop)||(null===(t=this.config)||void 0===t?void 0:t.notifyFeature)},[this.getScopedTagName("bbva-progress-content")]:{config:this.config.loader,condition:null===(i=this.config)||void 0===i?void 0:i.loader},[this.getScopedTagName("bbva-header-main")]:{config:this.config.header,condition:null===(a=this.config)||void 0===a?void 0:a.header}}}render(){const e=this._getElements();return p`
          <section style="${this._headerStyles}">
            ${Object.keys(e).map((t=>e[t].condition?this._tpl(t,e[t].config):null))}
            <slot name="customHeaderContainer"></slot>
          </section>
          ${this.renderNotify()}
        `}})),le=I((e=>class extends e{static get properties(){return{host:{type:String,attribute:"host"},native:{type:Boolean},requiredToken:{type:String,attribute:"required-token"},language:{type:String},headers:{type:Object},ambient:{type:String,reflect:!0},locale:{type:String},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"},publicSettingsHost:{type:String,attribute:"public-settings-host"},publicSettingsRequiredToken:{type:String,attribute:"public-settings-required-token"},history:{type:Object}}}constructor(){super(),this.native=!1,this.iOSFixedHeader=!1,this.publicSettingsRequiredToken="none"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.addEventListener("help-modal-open",this._handleModalState),this.addEventListener("help-modal-close",this._handleModalState),this.setAttribute("data-tag-name",this.constructor.is)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("help-modal-open",this._handleModalState),this.removeEventListener("help-modal-close",this._handleModalState)}static scopedElementsFromClasses(e){return e.reduce(((e,t)=>(e[t.is]=t,e)),{})}_handleModalState(e){var t;const i=null==e||null===(t=e.detail)||void 0===t?void 0:t.modal;this.dispatchEvent(new CustomEvent("modal-state-change",{bubbles:!0,composed:!0,detail:{visible:null==i?void 0:i.visible,modal:i}}))}})),he={ERROR_RETRY_GET_ALIAS:{id:"error-retry-get-alias",modalType:"warning",titleText:"",titleIcon:x(),bodyText:"bbva-feature-edit-alias-error-retry-message",buttonText:{text:"bbva-feature-edit-alias-error-retry-accept",fn:"getCurrentAlias"},linkText:{text:"bbva-feature-edit-alias-error-retry-cancel",fn:"closeModal"}},ERROR_CONNECTION:{id:"error-connection",modalType:"warning",titleText:"",titleIcon:x(),bodyText:"bbva-feature-edit-alias-error-connection-message",buttonText:{text:"bbva-feature-edit-alias-understood",fn:"closeModal"},linkText:{text:"",fn:""}},ERROR_RETRY_UPDATED_ALIAS:{id:"error-retry-updated-alias",modalType:"warning",titleText:"",titleIcon:x(),bodyText:"bbva-feature-edit-alias-error-retry-message",buttonText:{text:"bbva-feature-edit-alias-error-retry-accept",fn:"updatedAlias"},linkText:{text:"bbva-feature-edit-alias-error-retry-cancel",fn:"closeModal"}},NAVIGATION_PREVIOUS_PAGE:{id:"navigation-previuos-page",modalType:"warning",titleText:"",titleIcon:x(),bodyText:"bbva-feature-edit-alias-modal-return",buttonText:{text:"bbva-feature-edit-alias-accept",fn:"navigateToPreviousPage"},linkText:{text:"bbva-feature-edit-alias-cancel",fn:"closeModal"}}},de=new s;var ce=i`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-form-field] {
  padding: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${a(n.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(n.spacer)}))) / 16) * 1rem) 0;
}

.btn-content {
  display: flex;
  align-items: center;
  justify-content: center;
  flex-direction: column;
}
.btn-content [data-tag-name=bbva-button-default] {
  margin: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${a(n.spacer)}))) / 16) * 1rem) 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(n.spacer)}))) / 16) * 1rem);
}
.btn-content [data-tag-name=bbva-link] {
  margin-bottom: calc(((2.25 * var(--gridSpacerVariant, var(--gridSpacer, ${a(n.spacer)}))) / 16) * 1rem);
}
${de.mediaRules()}`;class pe extends(ne(le(h(t)))){static get is(){return"bbva-feature-edit-alias-account"}static get scopedElements(){const e=[q,D,j,W,ie,M,O,...pe.configurationScopedElements()];return pe.scopedElementsFromClasses(e)}static get properties(){return{alias:{type:String,attribute:"alias"},allowedPattern:{type:String},apiVersion:{type:String,attribute:"api-version"},errorMessage:{type:String},financialApiVersion:{type:String,attribute:"financial-api-version"},infoMessage:{type:String},infoModal:{type:Object},label:{type:String},labelText:{type:String},maskedDefaultAlias:{type:String,attribute:"masked-default-alias"},maxLength:{type:Number},minLength:{type:Number},modalType:{type:String,attribute:"modal-type"},openModal:{type:Boolean,attribute:"open-modal"},optionalLabel:{type:String,attribute:"optional-label"},originalAlias:{type:Object,attribute:"original-alias"},pattern:{type:String},placeholder:{type:String},productId:{type:String,attribute:"product-id"},productTypeEvent:{type:String,attribute:"product-type-event"},totalAttempts:{type:Number,attribute:"total-attemps"},_attempts:{type:Number},_editAliasDm:Object,_financialOverviewDm:Object,_invalidAlias:{type:Boolean}}}constructor(){super(),this.alias="",this.allowedPattern="",this.apiVersion="",this.config={loader:!0},this.errorMessage="",this.financialApiVersion="0",this.host="",this.infoMessage="",this.infoModal={},this.label="",this.labelText="",this.maskedDefaultAlias="",this.maxLength=0,this.minLength=0,this.modalType="",this.native=!1,this.openModal=!1,this.optionalLabel="",this.originalAlias={},this.pattern="",this.placeholder="",this.productId="",this.productTypeEvent="",this.requiredToken="",this.totalAttempts=0,this._attempts=0,this._invalidAlias=!1}updated(e){var t,i,a,r,s,o,n,l,h;e.has("originalAlias")&&null!==(t=this.originalAlias)&&void 0!==t&&t.product&&null!==(i=this.originalAlias)&&void 0!==i&&null!==(a=i.product)&&void 0!==a&&a.alias&&(this.alias=null===(r=this.originalAlias)||void 0===r||null===(s=r.product)||void 0===s?void 0:s.alias,this.maskedDefaultAlias=null===(o=this.originalAlias)||void 0===o||null===(n=o.product)||void 0===n?void 0:n.alias,this.placeholder=null===(l=this.originalAlias)||void 0===l||null===(h=l.product)||void 0===h?void 0:h.name);!this.maskedDefaultAlias&&e.has("productId")&&this.productId.length>0&&this.getCurrentAlias()}static get styles(){return[ce,d("bbva-feature-edit-alias-account-shared-styles")]}reset(){this.maskedDefaultAlias="",this.alias="",this._invalidAlias=!1,this.openModal=!1,this.modalType="",this.productId="",this.infoModal={}}get _shouldDisableButton(){return!(this.alias.length&&!this._invalidAlias&&this.alias!==this.maskedDefaultAlias)}get _editAliasApisDm(){return this._editAliasDm||(this._editAliasDm=this.shadowRoot.getElementById("editAliasApisDM")),this._editAliasDm}get _financialDm(){return this._financialOverviewDm||(this._financialOverviewDm=this.shadowRoot.getElementById("financialOverviewDM")),this._financialOverviewDm}_fetchFinancialOverviewData(){this._financialDm.getFinancialOverview()}_filterProductData(e){var t,i,a;const r=null==e||null===(t=e.detail)||void 0===t?void 0:t.contracts.filter((e=>e.id===this.productId));this.alias=null===(i=r[0])||void 0===i?void 0:i.alias,this.maskedDefaultAlias=null===(a=r[0])||void 0===a?void 0:a.alias}getCurrentAlias(){this._editAliasApisDm.getAlias(this.productId)}updatedAlias(){this._editAliasApisDm.patchAlias(this.productId,{alias:this.alias}),this.showLoader()}_onAliasUpdateSuccess(){this.clearLoader(),this.reset();const e=`bbva-feature-edit-alias-${this.productTypeEvent}-success-event`;this._dispatchCustomEvent(e,this.alias)}_cancelAliasUpdate(){if(this.alias!==this.maskedDefaultAlias)this.showCancelEditAliasModal();else{const e=`bbva-feature-edit-alias-${this.productTypeEvent}-cancel-event`;this._dispatchCustomEvent(e),this.reset()}}_handleGetAliasError(e){var t;405===(null==e||null===(t=e.detail)||void 0===t?void 0:t.status)?this._fetchFinancialOverviewData():this.showModal(he.ERROR_CONNECTION)}showModal(e){this.openModal=!0,this.infoModal=e,this.modalType=null==e?void 0:e.id}showRetryErrorModal(e){this._attempts>=this.totalAttempts?(this.showModal(he.ERROR_CONNECTION),this._attempts=0):(this._attempts+=1,this.showModal(e))}_handleAliasUpdateError(e){var t;((null==e||null===(t=e.detail)||void 0===t?void 0:t["error-code"])||[]).length>0?this.showRetryErrorModal(he.ERROR_RETRY_UPDATED_ALIAS):this.showModal(he.ERROR_CONNECTION),this.clearLoader()}navigateToPreviousPage(){const e=`bbva-feature-edit-alias-${this.productTypeEvent}-prepare-back-navigation`;this._dispatchCustomEvent(e),this.reset()}get headerMain(){return p`
      <bbva-header-main
        accessibility-text-icon-left-primary="Return"
        icon-left-primary=${H()}
        @header-main-icon-left-primary-click=${this.showCancelEditAliasModal}
        text=${this.t("bbva-feature-edit-alias-header-title")}
      ></bbva-header-main>
    `}showCancelEditAliasModal(){this.openModal=!0,this.showModal(he.NAVIGATION_PREVIOUS_PAGE)}closeModal(){this.openModal=!1,this.modalType="",this.infoModal={}}renderModalContent(){const{id:e,titleIcon:t,titleText:i,bodyText:a,buttonText:r,linkText:s,modalType:o}=this.infoModal||{},n=0===(null==s?void 0:s.text.length),l=n?this[null==r?void 0:r.fn]:this[null==s?void 0:s.fn],h=n?void 0:this[null==r?void 0:r.fn],d=p`
      <bbva-help-modal
        id="${e}"
        modal-type="${o}"
        title-icon="${t}"
        title-text="${this.t(i)}"
        body-text="${this.t(a)}"
        button-text="${this.t(null==r?void 0:r.text)}"
        link-text="${this.t(null==s?void 0:s.text)}"
        ?visible="${this.openModal}"
        @help-modal-close="${l}"
        @help-modal-footer-button-click="${h}"
      >
      </bbva-help-modal>
    `;return e?d:""}get formField(){return p`
      <bbva-form-field
        type="text"
        label="${this.t(this.label)}"
        label-out="${this.t(this.labelText)}"
        optional-label="${this.optionalLabel}"
        value="${this.maskedDefaultAlias}"
        allowed-pattern="${this.allowedPattern}"
        pattern="${this.pattern}"
        maxlength="${this.maxLength}"
        minlength="${this.minlength}"
        auto-validate
        info-message="${this._invalidAlias?"":this.t(this.infoMessage)}"
        info-icon="${this._invalidAlias?"":_()}"
        error-message="${this.t(this.errorMessage)}"
        placeholder="${this.t(this.placeholder)}"
        error-icon="${x()}"
        @input="${e=>{var t;this.alias=null===(t=e.target)||void 0===t?void 0:t.value}}"
        @invalid-changed="${e=>{var t;this._invalidAlias=null===(t=e.detail)||void 0===t?void 0:t.value}}"
      >
      </bbva-form-field>
    `}get editAliasButtons(){return p`
      <div class="btn-content">
        <bbva-button-default
          ?disabled="${this._shouldDisableButton}"
          @click="${this.updatedAlias}">
          ${this.t("bbva-feature-edit-alias-save")}
        </bbva-button-default>

        <bbva-link 
          @click="${this._cancelAliasUpdate}">
          ${this.t("bbva-feature-edit-alias-cancel")}
        </bbva-link>
      </div>
    `}get financialOverviewDM(){return p`
      <bbva-global-financial-overview-api-dm
        id="financialOverviewDM"
        .host="${this.host}"
        .version="${this.financialApiVersion}"
        .requiredToken="${this.requiredToken}"
        @financial-overview-api-dm-fetch="${e=>this._filterProductData(e)}"
      >
      </bbva-global-financial-overview-api-dm>
    `}get editAliasApisDm(){return p`
      <bbva-global-edit-alias-api-dm
        id="editAliasApisDM"
        .host="${this.host}"
        .version="${this.apiVersion}"
        type="accounts"
        .requiredToken="${this.requiredToken}"
        ?native="${this.native}"
        @edit-alias-api-dm-fetch="${e=>{var t,i;this.alias=null===(t=e.detail)||void 0===t?void 0:t.alias,this.maskedDefaultAlias=null===(i=e.detail)||void 0===i?void 0:i.alias}}"
        @edit-alias-api-dm-fetch-error="${e=>this._handleGetAliasError(e)}"
        @edit-alias-api-dm-update="${this._onAliasUpdateSuccess}"
        @edit-alias-api-dm-update-error="${e=>this._handleAliasUpdateError(e)}"
      >
      </bbva-global-edit-alias-api-dm>
    `}render(){return p`
    ${this.headerMain}
      ${super.render()}
      <div ambient="light">
        ${this.formField} ${this.editAliasButtons} ${this.financialOverviewDM} ${this.editAliasApisDm}
        ${this.renderModalContent()}
      </div>
    `}}customElements.define(pe.is,pe);
