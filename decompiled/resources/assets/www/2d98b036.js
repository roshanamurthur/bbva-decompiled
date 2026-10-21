import{H as e,aZ as t,J as i,L as a,aX as s,an as o,h as n,z as r,bX as c,ak as l,aN as d,a8 as b,ac as u,ad as v,ab as h,aS as p,aV as g,i as m,a9 as y,dH as f,dw as _,Y as A,fi as k,fj as S,ah as w,fk as $,bn as x,ey as D,fl as P,be as C,cE as E,dv as T,da as L,cv as I,bF as M,cw as R,cx as B,cy as O,cz as N,aO as V,ck as z,cQ as q,cX as j,bS as H,cU as F}from"./952f98a9.js";import{G,R as W,S as U,u as X,D as K,T as Y,a1 as Q,N as J,v as Z,W as ee,a2 as te,x as ie,K as ae,aa as se,h as oe,H as ne,au as re,I as ce,ai as le,af as de,X as be,e as ue,ah as ve,at as he}from"./216055dc.js";import{a as pe,b as ge,B as me}from"./0c09f63f.js";import{B as ye,am as fe,aH as _e}from"./7f3d7ca9.js";import{a as Ae}from"./81f42801.js";import{B as ke}from"./b40ec134.js";import{d as Se,r as we,e as $e,a as xe,b as De}from"./4d2e5f99.js";import{o as Pe}from"./68ec5adf.js";import{d as Ce,a as Ee,b as Te,l as Le,q as Ie,s as Me,e as Re,c as Be,f as Oe,g as Ne,h as Ve}from"./f250a96c.js";import"./4c50294e.js";import{B as ze,a as qe}from"./be12d7a2.js";import{A as je,K as He}from"./72e6e777.js";import{u as Fe}from"./05f50fad.js";import"./95ab4332.js";import"./55752bf7.js";import"./c96773cf.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./98f361c8.js";const Ge=e((e=>class extends e{static get properties(){return{host:{type:String,attribute:"host"},native:{type:Boolean},requiredToken:{type:String,attribute:"required-token"},language:{type:String},headers:{type:Object},ambient:{type:String,reflect:!0},locale:{type:String},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"},publicSettingsHost:{type:String,attribute:"public-settings-host"},publicSettingsRequiredToken:{type:String,attribute:"public-settings-required-token"},history:{type:Object}}}constructor(){super(),this.native=!1,this.iOSFixedHeader=!1,this.publicSettingsRequiredToken="none"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.addEventListener("help-modal-open",this._handleModalState),this.addEventListener("help-modal-close",this._handleModalState),this.setAttribute("data-tag-name",this.constructor.is)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("help-modal-open",this._handleModalState),this.removeEventListener("help-modal-close",this._handleModalState)}static scopedElementsFromClasses(e){return e.reduce(((e,t)=>(e[t.is]=t,e)),{})}_handleModalState(e){var t;const i=null==e||null===(t=e.detail)||void 0===t?void 0:t.modal;this.dispatchEvent(new CustomEvent("modal-state-change",{bubbles:!0,composed:!0,detail:{visible:null==i?void 0:i.visible,modal:i}}))}}));class We{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let i=Object(this),a=i.length>>>0;if(0===a)return!1;let s=0|t,o=Math.max(s>=0?s:a-Math.abs(s),0);for(;o<a;){if((n=i[o])===(r=e)||"number"==typeof n&&"number"==typeof r&&isNaN(n)&&isNaN(r))return!0;o++}var n,r;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var i=[],a=0,s="",o=0,n=arguments.length;o!==n;++o){var r=+arguments[o];if(!(r<1114111&&r>>>0===r))throw RangeError("Invalid code point: "+r);r<=65535?a=i.push(r):(r-=65536,a=i.push(55296+(r>>10),r%1024+56320)),a>=16383&&(s+=e.apply(null,i),i.length=0)}return s+e.apply(null,i)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",i=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${i&&i.message}`)}}class Ue extends We{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}}const Xe=0,Ke=1,Ye="jwt",Qe="tsec",Je="none";class Ze extends We{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=Xe,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new Ue,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=Qe:this.requiredToken=Je,this.requiresJWT=!1):this.requiredToken===Qe?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===Ye?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===Je?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(Qe)}_setJwtHandler(){this._setTokenHandler(Ye)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((i,a)=>{t=Object.assign(t,{resolve:i,reject:a}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let i=this._getRequestHeaders();Object.keys(i).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,i[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=t),e}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let i=e.replace(/[\{\}]+/g,""),a=t[i];return a?delete t[i]:this._error(9,`Missing ${i} param value`),a})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let i=Object.keys(t);i.length&&(e=[e,i.map((e=>{let i=t[e];return Array.isArray(i)&&this.paramArrayMode===Ke?this._arrayToQueryParam(e,i):`${e}=${i}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(Qe,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(Ye,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(i){var a=t.getItem(i);a&&"null"!==a&&(e[i]=a)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const i=window.sessionStorage;t=Object.keys(i).filter((t=>t.startsWith(e))).reduce(((t,a)=>(t[a.replace(e,"")]=i.getItem(a),t)),{})}return t}_getTokenForRequestHeaders(e,t){const i=`${e}Handler`,a=e===Ye?"JWT ":"",s=e===Ye?"Authorization":Qe;if(void 0===this[i]||null===this[i])this._error(11,`${e} handler is undefined`);else{const o=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let n=this[i].getItem(o);n?t[s]=t[s]||a+n:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((i=>{t.push(`${i}=${e[i]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let i;const a=new Promise(((e,t)=>{i=(i,a)=>{i?t(i):e(a)}}));return t.addEventListener("loadend",(function e(a){t.removeEventListener("loadend",e),a.error?i(a.error):i(null,t.result)})),t.readAsText(e),a}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let i=0;for(;i<e.length;){let a=e[i],s=0,o=0;if(a<=127?(s=0,o=255&a):a<=223?(s=1,o=31&a):a<=239?(s=2,o=15&a):a<=244&&(s=3,o=7&a),e.length-i-s>0){let t=0;for(;t<s;)a=e[i+t+1],o=o<<6|63&a,t+=1}else o=65533,s=e.length-i;t+=String.fromCodePoint(o),i+=s+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},i=e.trim().split(/[\r\n]+/);for(const e in i)if(i.hasOwnProperty(e)&&""!==i[e]){let a=": ",s=i[e].split(a);t[s.shift().toLowerCase()]=s.join(a)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,i,a){let s=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(a)>=0&&(s=t.getResponseHeader(a));break;case this._NATIVE_XHR:t&&t.headers&&(s=JSON.parse(t.headers)[a])}if(s){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):i;e.getItem(t)!==s&&(e.setItem(t,s),this._emitTokenUpdate(i,s))}}_emitTokenUpdate(e,t){if(this.htmlContext){const i=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(i)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,i,a,s,o;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),i=e.getResponseHeader("AuthenticationData"),a=e.getResponseHeader("AuthenticationState"),s=e.getResponseHeader("AuthenticationChallenge"),o=e.getResponseHeader("AuthenticationResponse");else{let n=JSON.parse(e.headers);t=n.authenticationtype,i=n.authenticationdata||null,a=n.authenticationstate,s=n.authenticationchallenge,o=n.authenticationresponse}return{type:t,data:i,state:a,challenge:s,response:o}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",i=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const a=this._getSignatureData(e,t,i);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:a}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",i="",a=""){let s;if("object"==typeof e&&e){const o=this._getSignatureData(e.signatureType,t,i);s=this._makeKeyValuePairFromObject(o,e.signatureValue),e.challenge&&(s+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(s,e.signatureType,a)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(s=`password=${e}`,this._buildSignatureHeaders(s,"2",a)):(s=`${i}=${e}`,this._buildSignatureHeaders(s,t,a)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let i,a=e.split(",");if(a.length>1){i=a.map((e=>`${e}=${t[e]}`)).join(",")}else i=`${e}=${t}`;return i}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",i=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),i&&(this.headers=Object.assign(this.headers,{AuthenticationState:i})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),a=this._extractResponseErrorCode(t),s=this._ERROR_CODES.SIGNATURE_INVALID.includes(a),{type:o,data:n,state:r,challenge:c,response:l}=this._extractSignatureResponseHeaders(e),d=this._getRequestMetadata(e);if(s)this._notifySignatureInvalid(d),i=!0;else if(o)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(a)?(this._notifySignatureTypeUsingErrorCode(a,d,o,n,r,c,l),i=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(d,o,n,r,c,l),i=!0}return i}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),a=this._extractResponseErrorCode(t),s=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(a),o=this._getRequestMetadata(e);s&&(this._notifyWaitingForProcessResponse(o),i=!0)}return i}_notifySignatureRequiredFirstStep(e,t,i,a){this._defineSignatureType(t,i),this._defineSignatureValue(t,i,a),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:i,metadata:e}}))}_notifySignatureRequired(e,t,i,a,s,o){this._defineSignatureValue(t,i,a);const n={type:t,data:i,challenge:s,metadata:e};o&&(n.response=o),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:n}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:i}=e;return{path:this._path,method:this.method,url:t,status:i}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",i=""){const a=t.split(";").findIndex((t=>t===e));return i?i.split(";")[a]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,i,a,s,o){a?this._notifySignatureRequired(e,t,i,a,s,o):this._notifySignatureRequiredFirstStep(e,t,i,a)}_notifySignatureTypeUsingErrorCode(e,t,i,a,s,o,n){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,i,a,s):this._notifySignatureRequired(t,i,a,s,o,n)}}class et extends Ze{constructor(e=null){super(Object.assign(e||{},{method:"DELETE"}))}toString(e=""){return super.toString(e||"BGADPRequestDELETE")}}class tt extends Ze{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}}class it extends Ze{constructor(e=null){super(Object.assign(e||{},{method:"PATCH"}))}toString(e=""){return super.toString(e||"BGADPRequestPATCH")}}class at extends Ze{constructor(e=null){super(Object.assign(e||{},{method:"PUT"}))}toString(e=""){return super.toString(e||"BGADPRequestPUT")}}class st extends tt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`devices-management/v${this.version}/devices`)}toString(){return super.toString("BGADPDevicesManagementDevicesGetV0")}}class ot extends at{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`devices-management/v${this.version}/devices/{device-id}`)}toString(){return super.toString("BGADPDevicesManagementDevicesDevicePutV0")}}class nt extends tt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`devices-management/v${this.version}/devices/{device-id}/applications/{application-id}`)}toString(){return super.toString("BGADPDevicesManagementDevicesDeviceApplicationsApplicationGetV0")}}class rt extends at{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`devices-management/v${this.version}/devices/{device-id}/applications/{application-id}`)}toString(){return super.toString("BGADPDevicesManagementDevicesDeviceApplicationsApplicationPutV0")}}class ct extends it{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`devices-management/v${this.version}/devices/{device-id}/applications/{application-id}`)}toString(){return super.toString("BGADPDevicesManagementDevicesDeviceApplicationsApplicationPatchV0")}}class lt extends et{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`devices-management/v${this.version}/devices/{device-id}/applications/{application-id}`)}toString(){return super.toString("BGADPDevicesManagementDevicesDeviceApplicationsApplicationDeleteV0")}}class dt extends(i(a)){static get is(){return"bbva-dataprovider-devices-management"}static get properties(){return{customerId:{type:String},country:{type:String}}}constructor(){super(),this.country="",this.requiredToken="tsec",this.headers={"Content-Type":"application/json"},this.service={BGADPDevicesManagementDevicesGetV0:st,BGADPDevicesManagementDevicesDevicePutV0:ot,BGADPDevicesManagementDevicesDeviceApplicationsApplicationGetV0:nt,BGADPDevicesManagementDevicesDeviceApplicationsApplicationDeleteV0:lt,BGADPDevicesManagementDevicesDeviceApplicationsApplicationPatchV0:ct,BGADPDevicesManagementDevicesDeviceApplicationsApplicationPutV0:rt}}getDevices(){const e={country:this.country,userType:"CUSTOMER",userId:this.customerId},t=this._getServiceParams(e),i=this._getService("BGADPDevicesManagementDevicesGet",t);this._generateGetService(i,{customEvent:"get-devices-success",errorFireEventHandler:"get-devices-error"})}getDeviceApplicationData({id:e,appId:t}){const i={"device-id":e,"application-id":t},a=this._getServiceParams(i),s=this._getService("BGADPDevicesManagementDevicesDeviceApplicationsApplicationGet",a);this._generateGetService(s,{customEvent:"get-devices-application-success",errorFireEventHandler:"get-devices-application-error"})}deleteDeviceApplicationData({id:e,appId:t}){const i={"device-id":e,"application-id":t},a=this._getServiceParams(i),s=this._getService("BGADPDevicesManagementDevicesDeviceApplicationsApplicationDelete",a);this._generateGetService(s,{customEvent:"delete-devices-application-success",errorFireEventHandler:"delete-devices-application-error"})}patchDeviceApplicationData({id:e,appId:t,notifications:i,token:a,isValidToken:s}){const o={"device-id":e,"application-id":t},n={pushNotification:{isEnabled:i,token:a,isValidToken:s}},r=this._getServiceParams(o,n),c=this._getService("BGADPDevicesManagementDevicesDeviceApplicationsApplicationPatch",r);this._generateGetService(c,{customEvent:"patch-devices-application-success",errorFireEventHandler:"patch-devices-application-error"})}putDeviceIdDevicesDevice({id:e},t){const i={"device-id":e},a=this._getServiceParams(i,t),s=this._getService("BGADPDevicesManagementDevicesDevicePut",a);this._generateGetService(s,{customEvent:"put-devices-device-success",errorFireEventHandler:"put-devices-device-error"})}putDeviceApplicationData({id:e,appId:t},i){const a={"device-id":e,"application-id":t},s=this._getServiceParams(a,i),o=this._getService("BGADPDevicesManagementDevicesDeviceApplicationsApplicationPut",s);this._generateGetService(o,{customEvent:"put-devices-application-success",errorFireEventHandler:"put-devices-application-error"})}_getService(e,t){return new this.service[`${e}V${this.version}`](t)}}class bt extends(i(a)){static get is(){return"bbva-dataprovider-authentication-devices"}static get properties(){return{userId:{type:String},customerId:{type:String}}}constructor(){super(),this.requiredToken="tsec",this.native=!1,this.headers={"Content-Type":"application/json"},this.service={BGADPAuthenticationDevicesDevicesGetV0:Ae}}getDeviceAuthenticationData(e,t,i,a){const s={statusMode:e,profileId:i,"owner.roleType.id":t,"owner.id":a},o=this._getServiceParams(s),n=this._getService("BGADPAuthenticationDevicesDevicesGet",o);this._generateGetService(n,{customEvent:"get-devices-authentication-data-success",errorFireEventHandler:"get-devices-authentication-data-error"})}_getService(e,t){return new this.service[`${e}V${this.version}`](t)}}class ut extends(ye(a)){static get is(){return"bbva-nativeconnector-fido"}static get properties(){return{pluginName:{type:String}}}constructor(){super(),this.pluginName="NaturalAuth"}initializeNaturalAuth(){return this._genericCall(this.pluginName,"initialize","initialize-success",{},"initialize-error")}async register(e){return this._genericCall(this.pluginName,"register","register-success",e,"register-error")}async delete(e){return this._genericCall(this.pluginName,"delete","delete-success",e,"delete-error")}signTransaction(e){return this._genericCall(this.pluginName,"signtransaction","sign-transaction-success",e,"sign-transaction-error")}list(e){return this._genericCall(this.pluginName,"list","list-success",{user_id:e},"list-error")}authenticate(e){return this._genericCall(this.pluginName,"authenticate","authenticate-success",e,"authenticate-error")}async getDeviceId(){return this._genericCall(this.pluginName,"getDeviceId","get-device-id-success",{},"get-device-id-error")}}customElements.define(ut.is,ut);class vt extends(s(o(a))){static get is(){return"bbva-manager-device-manager"}static get properties(){return{userId:{type:String},customerId:{type:String},deviceId:{type:String},host:{type:String},apiVersion:{type:String},appVersion:{type:String},native:{type:Boolean},country:{type:String},appIds:{type:Object},devices:{type:Array},currentDevice:{type:String},deviceAccessesKey:{type:String},accessBiometricKey:{type:String},services:{type:Array},modalTextOptions:{type:Object},navigationPages:{type:Object},validRemoteServices:{type:Array},bankId:{type:String},mandatoryUserDigits:{type:Number},hideTokenService:{type:Boolean},contactNumber:{type:Number},toastSnackBarParams:{type:Object},preventFidoDelete:{type:Boolean},pageName:{type:String},currentDeviceLocale:{type:String},notificationsRemoteDevice:{type:Boolean},deleteRemoteDevice:{type:Boolean},enrolledSt:{type:Boolean},deletePageAction:{type:String},checkingDevice:{type:Boolean},_resolveGetDeviceData:Function,_rejectGetDeviceData:Function,_resolveGetDeviceAccesses:Function,_rejectGetDeviceAccesses:Function,_resolveGetBioAccess:Function,_rejectGetBioAccess:Function,_resolvePutDeviceIdDevicesDevice:Function,_rejectPutDeviceIdDevicesDevice:Function,_resolvePutDeviceApplicationData:Function,_rejectPutDeviceApplicationData:Function}}constructor(){super(),this.devices=[],this.services=[],this.toastSnackBarParams={},this.hideTokenService=!1,this.enrolledSt=!1,this.preventFidoDelete=!1,this.contactNumber=0,this.deviceAccessesKey="deviceAccesses",this.deletePageAction="",this.accessBiometricKey="activeBioAccess",this.currentDeviceLocale="glomo-device-manager-current-device",this.validRemoteServices={},this.mandatoryUserDigits=0,this.checkingDevice=!1,this.fidoPlugin=new ut}static get scopedElements(){return{"bbva-dataprovider-devices-management":dt,"bbva-dataprovider-authentication-devices":bt,"bbva-nativeconnector-device-info":ke,"bbva-nativeconnector-fido":ut,"bbva-nativeconnector-local-storage":fe}}render(){return n`
        <bbva-dataprovider-devices-management
                id="provider"
                @get-devices-success="${this._handleDeviceResponse}"
                @get-devices-error="${this._handleDeviceResponseError}"
                @get-devices-application-success="${this._resolveGetDeviceData}"
                @get-devices-application-error="${this._rejectGetDeviceData}"
                @delete-devices-application-success="${this.handleDeleteDeviceSuccess}"
                @delete-devices-application-error="${this._handleDeleteDevicesApplicationError}"
                @patch-devices-application-success="${this.handleDeleteNotificationSuccess}"
                @patch-devices-application-error="${this._handlePatchDevicesApplicationError}"
                @put-devices-device-success="${this._resolvePutDeviceIdDevicesDevice}"
                @put-devices-device-error="${this._rejectPutDeviceIdDevicesDevice}"
                @put-devices-application-success="${this._resolvePutDeviceApplicationData}"
                @put-devices-application-error="${this._rejectPutDeviceApplicationData}"
                @api-dm-error="${this._apiErrorDevicesManagement}"
                .version="${this.apiVersion}"
                .customerId="${this.customerId}"
                .host="${this.host}"
                .country="${this.country}"
                .native="${this.native}">
        </bbva-dataprovider-devices-management>
        <bbva-dataprovider-authentication-devices
                id="authenticationProvider"
                .version="${this.apiVersion}"
                .customerId="${this.customerId}"
                .host="${this.host}"
                .country="${this.country}"
                .native="${this.native}"
                @api-dm-error="${this._apiErrorAuthDevices}"
                @get-devices-authentication-data-success="${this._setRemoteDeviceServices}"
                @get-devices-authentication-data-error="${this._handleDevicesAuthenticationDataError}">
        </bbva-dataprovider-authentication-devices>
        <bbva-nativeconnector-device-info></bbva-nativeconnector-device-info>
        <bbva-nativeconnector-local-storage></bbva-nativeconnector-local-storage>
        <bbva-nativeconnector-fido></bbva-nativeconnector-fido>
    `}async init(){this._fireEvent("open-control-veil"),await this.updateComplete,await this.getDevices()}async getCurrentDevice(){const e=this.renderRoot.querySelector('[data-tag-name="bbva-nativeconnector-device-info"]');return{id:this.deviceId,brand:await e.getManufacturer().catch((()=>{})),model:await e.getModel().catch((()=>{})),osVersion:await e.getPlatform().then((e=>e.versionCode)).catch((()=>{}))}}async registerCurrentDevice(){await this._registerHMSDevice().then((async()=>{await this._registerHMSDeviceApplication().then((()=>{this.renderRoot.querySelector("#provider").getDevices()})).catch((()=>{this._fireEvent("device-security-settings-manager-error")}))})).catch((()=>{this._fireEvent("device-security-settings-manager-error")}))}async getDevices(){const{isHms:e=!1,isHmsOnly:t=!1}=await this._getFromLocalStorage("mobile_services")||{};(e||t)&&"deviceManagerList"!==this.pageName?await this.registerCurrentDevice():this.renderRoot.querySelector("#provider").getDevices()}async _registerHMSDevice(){const e=await this.getCurrentDevice(),t={brand:e.brand,model:e.model,os:"AOSP_HMS",osVersion:e.osVersion,alias:`${e.brand}-${e.model}`};return new Promise(((e,i)=>{this._resolvePutDeviceIdDevicesDevice=e,this._rejectPutDeviceIdDevicesDevice=i,this.renderRoot.querySelector("#provider").putDeviceIdDevicesDevice({id:this.deviceId},t)}))}_registerHMSDeviceApplication(){const e={appName:"BBVA_GLOMO",version:this.appVersion,language:"SPA",userId:this.customerId,userType:"CUSTOMER",country:this.country.toUpperCase()};return new Promise(((t,i)=>{this._resolvePutDeviceApplicationData=t,this._rejectPutDeviceApplicationData=i,this.renderRoot.querySelector("#provider").putDeviceApplicationData({id:this.deviceId,appId:this.appIds.aosp_hms},e)}))}async _handleDeviceResponse({detail:e}){const t=this._removeOldDuplicates(e),i=[];this.checkingDevice=!0;for await(const e of t)await this._getAsyncData(e).then((({detail:t})=>{var a;e.notifications=!!t&&!(null===(a=t.pushNotification)||void 0===a||!a.isEnabled),i.push(e)})).catch((e=>e));this.devices=this._sortDevices(i),this.checkingDevice=!1,this._fireEvent("set-current-device",this.devices[0]),this._fireEvent("show-device-list",await this._mapDevices()),this._fireEvent("close-control-veil")}async _getAsyncData(e){return new Promise(((t,i)=>{this._resolveGetDeviceData=t,this._rejectGetDeviceData=i,this.renderRoot.querySelector("#provider").getDeviceApplicationData({id:e.id,appId:this.appIds[e.os.toLowerCase()]})}))}async _mapDevices(){return this.devices.map((e=>this._parseDevice(e)))}_parseDevice(e){return{title:this._parseDeviceTitle(e.os,e.brand,e.model),buttonConfig:{leftIcon:"coronita:mobile"},texts:[...this.deviceId===e.id?[{text:this.currentDeviceLocale}]:[]],id:e.id,disableIconClick:!0,activateContainerClick:!0,alias:e.alias}}_parseDeviceTitle(e,t,i){const a=t.toLowerCase();return"ios"===e.toLowerCase()?i:`${a.charAt(0).toUpperCase()+a.slice(1)} ${i}`}_removeOldDuplicates(e){const t=new Map;for(const i of e)if(t.has(i.alias)){const e=t.get(i.alias);new Date(i.lastUpdateDate)>new Date(e.lastUpdateDate)?t.set(i.alias,i):this.renderRoot.querySelector("#provider").deleteDeviceApplicationData({id:i.id,appId:this.appIds[i.os.toLowerCase()]})}else t.set(i.alias,i);return Array.from(t.values())}_sortDevices(e){return e.sort(((e,t)=>e.id===this.deviceId?-1:t.id===this.deviceId?1:Date.parse(t.lastUpdateDate)-Date.parse(e.lastUpdateDate)))}async _handleDeleteServiceSuccess(e){this.currentDevice.notifications=e,this._showSuccessToast(1,"glomo-device-manager-snackbar-delete-services"),await this.checkDeviceState(),this._fireEvent("close-control-veil"),this._fireEvent("delete-service-success",this.currentDevice)}getFeatureFlags(e){this.notificationsRemoteDevice=e.notificationsRemoteDevice,this.deleteRemoteDevice=e.deleteRemoteDevice}handleDeleteNotificationSuccess(){this._handleDeleteServiceSuccess(!1)}handleDeleteFidoSuccess(){this._handleDeleteServiceSuccess(this.currentDevice.notifications)}handleDeleteDeviceSuccess(){"deviceManagerList"!==this.pageName&&(this._fireEvent("delete-device-success",this.currentDevice),this._fireEvent("navigate-to-page",{page:"deviceManagerList",cleanUntil:"deviceManagerList"}),this._showSuccessToast(2,"glomo-device-manager-snackbar-empty-services"),this._showSuccessToast(3,"glomo-device-manager-snackbar-delete-device-and-services"))}deleteFidoSuccess(){this._showSuccessToast(4,"glomo-device-manager-snackbar-delete-services")}_showSuccessToast(e,t){this.toastSnackBarParams=Object.assign(this.toastSnackBarParams,{id:e,message:this.t(t,{currentDevice:this.currentDevice.titleText}),duration:4e3}),this._fireEvent("global-message-snackbar",this.toastSnackBarParams)}showTooltip(){this._fireEvent("open-modal-device-manager",{code:"MODAL-DEVICE-MANAGER-TOOLTIP-DEVICE",selectedConfig:{className:"info",openMaximized:!1,hideCloseIcon:!0,acceptBtLabel:"glomo-device-manager-tooltip-button",template:{type:"paragraphs",values:[{icon:"coronita:info"},{text:"glomo-device-manager-tooltip-title"},{text:"glomo-device-manager-tooltip-text"}]}}})}manageDeviceClicked(e){const t=this.devices.find((t=>t.id===e.id));this._fireEvent("navigate-to-device-detail",{deviceId:t.id,alias:t.alias,notifications:t.notifications,titleText:this._parseDeviceTitle(t.os,t.brand,t.model),os:t.os,currentDevice:this._isThisDevice({deviceId:t.id})})}setDetail(e){this._fireEvent("open-control-veil"),this._fireEvent("show-detail-header",e.alias),this.currentDevice=e}initDeletePage(){this._fireEvent("open-control-veil"),this._fireEvent("delete-page-main-text",{title:`glomo-device-manager-delete-page-${this.deletePageAction}-action-title`,mainDescription:`glomo-device-manager-delete-page-${this.deletePageAction}-action-main-text`}),this._fireEvent("delete-page-header",`glomo-device-manager-delete-page-${this.deletePageAction}-action-header`),this._fireEvent("close-control-veil")}deleteDeviceEvaluation(){this.enrolledSt?(this.deletePageAction="delete",this._deleteNoTransferTokenModal("NO-ST")):this._fireEvent("navigation-device-manager-transfer-token",{currentDevice:this.currentDevice,preventFidoDelete:this.preventFidoDelete,deletePageAction:"delete"})}_deleteNoTransferTokenModal(e){this._fireEvent("open-modal-device-manager",{code:"MODAL-DEVICE-MANAGER-DELETE-DEVICE"+(e?`-${e}`:""),selectedConfig:{className:"caution",openMaximized:!1,hideCloseIcon:!0,acceptBtLabel:"glomo-device-manager-delete-device-accept",cancelBtLabel:"glomo-device-manager-delete-device-cancel",template:{type:"paragraphs",values:[{icon:"coronita:info"},{text:"glomo-device-manager-continue-no-st-transfer"}]}}})}_deleteDevice(){this.preventFidoDelete?this.renderRoot.querySelector("#provider").deleteDeviceApplicationData({id:this.currentDevice.deviceId,appId:this.appIds[this.currentDevice.os.toLowerCase()]}):this.unsubscribeBiometry().then((()=>{this.renderRoot.querySelector("#provider").deleteDeviceApplicationData({id:this.currentDevice.deviceId,appId:this.appIds[this.currentDevice.os.toLowerCase()]})})).catch((()=>{this._fireEvent("navigate-to-page",{page:"deviceManagerList",cleanUntil:"deviceManagerList"}),this._fireEvent("unsubscribe-service-error")}))}performAction(e){this[{token:"unsubscribeToken",biometry:"unsubscribeBiometry",notifications:"unsubscribeNotifications",delete:"_deleteDevice"}[e]]()}deleteDevice(){this.performAction(this.deletePageAction);const e="notifications"===this.deletePageAction?"-notifications":"";this._fireEvent(`delete-remote-device${e}`,this.currentDevice)}deleteStEnrolled(){this.enrolledSt=!0,this.deletePageAction="delete",this.deleteDevice()}unsubscribeNotifications(){this.deletePageAction="notifications",this.enrolledSt?this._unsubscribe("patchDeviceApplicationData",{notifications:!1}):this._fireEvent("navigation-device-manager-transfer-token",{currentDevice:this.currentDevice,preventFidoDelete:this.preventFidoDelete,deletePageAction:"notifications"})}unsubscribeToken(){this.deleteDeviceEvaluation()}async unsubscribeBiometry(){await this._deleteFido(this.currentDevice.deviceId)}_unsubscribe(e,t){const i={id:this.currentDevice.deviceId,appId:this.appIds[this.currentDevice.os.toLowerCase()],...t&&t};this.renderRoot.querySelector("#provider")[e](i)}async checkDeviceState(){const e=this._isThisDevice(this.currentDevice);if(this._setCurrentDevice(this.currentDevice.alias,e),this.resetServices(),e)this._getCurrentDeviceServices();else{this._fireEvent("open-control-veil"),await this.updateComplete;const{enrolledST:e=!1}=await this.getDeviceAccesses()||{};this.enrolledSt=e,this.renderRoot.querySelector("#authenticationProvider").getDeviceAuthenticationData("LIVE","CUSTOMER",this.userId,this._buildOwnerId(this.customerId))}this._fireEvent("init-page-detail",{device:this.currentDevice,isThisDevice:this._isThisDevice(this.currentDevice)})}async _getCurrentDeviceServices(){const e=new Set(JSON.parse(JSON.stringify(this.services))),t=await this._getDeviceState();e.forEach((i=>{const a=t[i.id];t.bioSettings||"biometry"!==i.id||e.delete(i),i.titleState=`glomo-device-manager-current-device-${a?"active":"inactive"}-state`,i.textStateClass=a?"active":"",i.buttonConfig.text="token"===i.id&&a?"":`glomo-device-manager-current-device-${a?"config":"activate"}-button-title`})),this._setServices(Array.from(e.values()))}_setRemoteDeviceServices({detail:e}){if(e){var t;const i={token:this._checkDeviceType(e,this.validRemoteServices.token),biometry:this._checkDeviceType(e,this.validRemoteServices.biometry),notifications:this.currentDevice.notifications};if(this.preventFidoDelete=!i.biometry,this.hideTokenService&&(i.token=!1),this.notificationsRemoteDevice||(i.notifications=!1),!i.biometry&&!i.notifications&&this.hideTokenService)return void this._noRemoteServices();this.currentDevice.serialNumber=null===(t=e.find((e=>"FIDO"===e.deviceType.id&&this.currentDevice.deviceId===e.channelDeviceId)))||void 0===t?void 0:t.serialNumber;const a=new Set(JSON.parse(JSON.stringify(this.services)));a.forEach((e=>{e.buttonConfig.text="token"===e.id?"glomo-device-manager-transfer":"glomo-device-manager-unsubscribe","token"===e.id&&(e.texts=[{text:"glomo-device-manager-service-tip"}]),i[e.id]||a.delete(e)})),this._fireEvent("cells-icon-message-text","glomo-device-manager-detail-remote-device-box-message"),this._setServices(Array.from(a.values()))}}_checkDeviceType(e,t){return e.some((e=>t===e.deviceType.id&&e.channelDeviceId===this.currentDevice.deviceId&&"ACTIVE"===e.status.id))}async _getDeviceState(){const{enrolledST:e=!1,bioSettings:t=!1}=await this.getDeviceAccesses()||{},{activeBioAccess:i=!1}=await this.getBioAccess().catch((()=>({activeBioAccess:!1})));return{token:e,biometry:i,bioSettings:t,notifications:this.currentDevice.notifications}}changeNotificationStatus(e){this.currentDevice.notifications=Object.values(e).some((e=>!0===e)),this._fireEvent("change-device-notifications",this.currentDevice.notifications),this.checkDeviceState()}changeNotificationStatusInRootList(e){this.devices.find((e=>e.id===this.deviceId)).notifications=e}_setCurrentDevice(e,t){const i={title:`glomo-device-manager-${t?"":"active-"}services-title`,mainDescription:"glomo-device-manager-main-description-text",...!t&&{titleIcon:"coronita:help"}},a={titleText:e,...t&&{text:this.currentDeviceLocale},...!t&&this.deleteRemoteDevice&&{linkText:"glomo-device-manager-delete-device",btnCustomClass:"Link"}};this._fireEvent("hide-icon-message",t),this._showDetail(i),this._setCard(a)}_showDetail(e){this._fireEvent("show-detail-description",e)}_setCard(e){this._fireEvent("set-card",e)}_noRemoteServices(){this._fireEvent("cells-icon-message-text","glomo-device-manager-detail-remote-no-services-icon-message"),this._showDetail({title:"glomo-device-manager-active-services-title",mainDescription:"glomo-device-manager-no-services-main-text"}),this._setServices([])}_setServices(e){this.requestUpdate(),this._fireEvent("set-services",e),this._fireEvent("close-control-veil")}serviceClicked({id:e}){this.currentDevice.deviceId===this.deviceId?this._fireEvent("modal-service-config",{code:"MODAL-DEVICE-MANAGER-SERVICE-CONFIG",selectedConfig:{className:"caution",openMaximized:!1,hideCloseIcon:!0,acceptBtLabel:"glomo-device-manager-accept-modal-service-config",cancelBtLabel:"glomo-device-manager-cancel-modal-service-config",template:{type:"paragraphs",values:[{icon:"coronita:info"},{text:this.modalTextOptions[e]}]},onAcceptDetail:e}}):this.performAction(e),this._serviceClicked(e)}_isThisDevice(e){return this.deviceId===e.deviceId}navigateToService(e){this._fireEvent("navigate-to-page",{page:this.navigationPages[e]}),this._fireEvent("accept-service-modal",{device:this.currentDevice,service:e})}navigateToStEnroll(){this._fireEvent("navigation-st-enrollment",{pageName:"stEnrollment",settingsFlow:!1}),this._fireEvent("st-enrollment-device-manager",{deviceManager:!0})}async _deleteFido(){this.fidoPlugin.list(this.customerId).then((e=>{const t=e.devices.find((e=>e.info[""+("id"in e.info?"id":"identifier")]===this.currentDevice.serialNumber));e.devices.length&&t?this.__deleteAuthenticators(t,this.currentDevice.serialNumber):this.fidoError()})).catch((()=>{this.fidoError()}))}async __deleteAuthenticators(e,t){const i=[];if(e.authenticators.length)for(const a of e.authenticators)i.push(this.__fidoPluginDelete("one",{device_id:t,auth_handler:a[""+("handle"in a?"handle":"authenticatorHandle")]}));else this.fidoError();await Promise.all(i).then((()=>{this.handleDeleteFidoSuccess()}))}__fidoPluginDelete(e,t){return this.fidoPlugin.delete({user_id:this.customerId,action:e,...t&&t})}_handleDeviceResponseError(){this._showErrorModal("GET-DEVICE-ERROR")}fidoError(){this._showErrorModal("DELETE-ERROR")}_handleDevicesAuthenticationDataError(){this._showErrorModal("GET-DEVICE-AUTHENTICATION-ERROR")}_handlePatchDevicesApplicationError(){this._showErrorModal("PATCH-DEVICE-AUTHENTICATION-ERROR")}_handleDeleteDevicesApplicationError(){this._showErrorModal("DELETE-DEVICE-AUTHENTICATION-ERROR")}_showErrorModal(e){const t={assistancePhone:this.contactNumber,retryErrorData:{errorId:`DEVICE-MANAGER-RETRY-${e}`,errorType:"operative"}};this._fireEvent("open-modal-error",t)}_apiError(e){this._fireEvent("close-control-veil"),this._fireEvent("device-manager-api-error",e)}_apiErrorAuthDevices(e){this._apiError(e)}_apiErrorDevicesManagement(e){this._apiError(e),this.checkingDevice&&this._rejectGetDeviceData()}getDeviceAccesses(){return new Promise(((e,t)=>{this._resolveGetDeviceAccesses=e,this._rejectGetDeviceAccesses=t,this._getLocalStorage(this.deviceAccessesKey)}))}getBioAccess(){return new Promise(((e,t)=>{this._resolveGetBioAccess=e,this._rejectGetBioAccess=t,this._getLocalStorage(this.accessBiometricKey)}))}reset(){this.devices=[],this.currentDevice=[],this.deletePageAction="",this.resetDetail(),this._fireEvent("show-device-list",[])}resetServices(){this._setServices([])}resetDetail(){this._setCard({text:"",linkText:"",btnCustomClass:""}),this._showDetail({title:"",mainDescription:"",titleIcon:""})}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("get-devices-success",this._handleDeviceResponse),this.removeEventListener("get-devices-application-success",this._resolveGetDeviceData)}getDeviceAccessesSuccess(e){this._resolveGetDeviceAccesses&&this._resolveGetDeviceAccesses(e)}getDeviceAccessesError(e){this._rejectGetDeviceAccesses&&this._rejectGetDeviceAccesses(e)}getBioAccessSuccess(e){this._resolveGetBioAccess&&this._resolveGetBioAccess(e)}getBioAccessError(){this._rejectGetBioAccess&&this._rejectGetBioAccess()}_getLocalStorage(e){this._fireEvent("get-native-local-storage",{key:e})}_buildOwnerId(e){const t=e.toString().padStart(this.mandatoryUserDigits,"0");return this.bankId+t}setProperties(e){Object.keys(e).forEach((t=>{this[t]=e[t]}))}async _getFromLocalStorage(e){return this.renderRoot.querySelector('[data-tag-name="bbva-nativeconnector-local-storage"]').get({key:e}).catch((()=>{}))}_serviceClicked(e){this._fireEvent((this._isThisDevice(this.currentDevice)?"current":"remote")+"-service-clicked",{id:e,currentDevice:this.currentDevice,text:this.services.find((t=>t.id===e)).buttonConfig.text.toLowerCase()})}_fireEvent(e,t){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}}class ht extends(s(o(a))){static get is(){return"bbva-security-settings-devices-manager"}static get scopedElements(){return{"bbva-manager-device-manager":vt}}static get properties(){return{devices:{type:Array},currentDevice:{type:Object},currentDeviceTitle:{type:Object},deviceId:{type:String},devicesApiVersion:{type:String},userId:{type:String},country:{type:String},customerId:{type:String},host:{type:String},native:{type:Boolean},appIds:{type:Object},appVersion:{type:String}}}constructor(){super(),this.currentDeviceTitle=void 0}updated(e){e.has("currentDeviceTitle")&&this._changeLoadingDevicesStatus()}async init(){await this.getDevices()}async getDevices(){const e=this.renderRoot.querySelector('[data-tag-name="bbva-manager-device-manager"]');this.currentDevice=await e.getDevices()}setCurrentDevice({detail:e}){this.currentDevice=e,this.currentDevice.deviceId=this.currentDevice.id,this.currentDeviceTitle=this.getDeviceTitle(),this.__fireEvent("set-current-device-title",this.currentDeviceTitle),this.__fireEvent("set-current-device",this.currentDevice)}getDeviceTitle(){const e=this.currentDevice.brand.toLowerCase();return"ios"===this.currentDevice.os.toLowerCase()?this.currentDevice.model:`${e.charAt(0).toUpperCase()+e.slice(1)} ${this.currentDevice.model}`}_changeLoadingDevicesStatus(){this.__fireEvent("change-loading-devices-status",!1)}async navigateToCurrentDevice(e){await this.renderRoot.querySelector('[data-tag-name="bbva-manager-device-manager"]').manageDeviceClicked(e)}__fireEvent(e,t){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}render(){return n`
      <bbva-manager-device-manager
       .apiVersion=${this.devicesApiVersion}
       .country=${this.country}
       .host=${this.host}
       .appVersion=${this.appVersion}
       .native=${this.native}
       .appIds=${this.appIds}
       .customerId=${this.customerId}
       .deviceId=${this.deviceId}
       @set-current-device=${this.setCurrentDevice}
       .userId=${this.userId}></bbva-manager-device-manager>
    `}}class pt extends a{static get is(){return"bbva-security-navigations-handler"}static get properties(){return{pages:{type:Object},pagesOrder:{type:Array},currentPage:{type:String}}}init(){const e=this.currentPage||"securitySettings";this.openPage(e)}openPage(e){this.setPageVisibility(e,!0),this._setActivePage(e)}closePage(e){if("securitySettings"!==e){"completedActions"===e&&(this.pagesOrder=["securitySettings","securityProfile","completedActions"],this.setPageVisibility(e,!1)),this.setPageVisibility(e,!1);const t=Object.keys(this.pages).find((e=>this.pages[e]));this._setActivePage(t)}else this.navigateToExternalPage("go-back")}setPageVisibility(e,t,i){if(Object.prototype.hasOwnProperty.call(this.pages,e))if(t)Object.keys(this.pages).forEach((t=>{t!==e&&(this.pages[t]=!1)}));else if(!i){const t=this.pagesOrder.indexOf(e);if(t>0){const e=this.pagesOrder[t-1];this.pages[e]=!0}}this.pages[e]=t,this.__fireEvent("request-update")}navigateToExternalPage(e,t){this.__fireEvent("set-loading",!0);const i=Object.keys(this.pages).find((e=>this.pages[e]));i&&(this.setPageVisibility(i,!1,!0),this.currentPage=i,this._setActivePage(i),this.__fireEvent(e,t))}_setActivePage(e){this.__fireEvent("security-settings-active-page",e)}__fireEvent(e,t){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}}var gt=r`:host {
  display: block;
  box-sizing: border-box;
  padding: 16px;
  padding-bottom: 0px;
}
:host [data-tag-name=bbva-list-link] {
  padding: 0px;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class mt extends(s(Ge(o(a)))){static get is(){return"bbva-emergency-zone-widget"}static get scopedElements(){return{"bbva-list-link":c,"bbva-type-text":G}}static get styles(){return[gt,l("bbva-emergency-zone-widget-shared-styles")]}static get properties(){return{emergencyWidgetDescription:{type:String},emergencyLink:{type:String}}}constructor(){super(),this.emergencyWidgetDescription="bbva-emergency-zone-widget-description",this.emergencyLink="bbva-emergency-zone-widget-link"}render(){return n`
      <div class="emergency-zone-container">
        <bbva-list-link
          link-icon-left="${d()}"
          header-text="${this.t(this.emergencyLink)}"
          @click="${this.fireEmergencyZoneWidgetLink}">
        </bbva-list-link>
        <bbva-type-text
          text="${this.t(this.emergencyWidgetDescription)}">
        </bbva-type-text>
      </div>
    `}fireEmergencyZoneWidgetLink(){this.__fireEvent("widget-clicked-link","navigate-to-security-settings-emergency")}__fireEvent(e,t){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}}var yt=r`
:host {
  display: inline-block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none;
}

*,
*::before,
*::after {
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

.shadow {
  filter: var(--bbva-data-visualization-donut-shadow-filter, drop-shadow(0 0.5rem 0.1875rem rgba(18, 18, 18, 0.25)));
}

.slice-selected .highlighted {
  opacity: 1;
}

/**
 * Arc's labels
 **/
.label {
  margin-top: 0.625rem;
  margin-bottom: 0.625rem;
  font-size: var(--typographyType3XSmall, ${b(u.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${b(v.type3XSmall)});
  pointer-events: none;
}

.center {
  display: flex;
  align-items: center;
}

.custom-label {
  justify-content: center;
}

.middle-donut-content {
  position: absolute;
  display: flex;
  flex-direction: column;
  align-items: center;
  margin: auto;
  font-size: var(--typographyTypeSmall, ${b(u.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${b(v.typeSmall)});
}

[data-tag-name=bbva-type-text] {
  max-width: var(--bbva-data-visualization-donut-max-width-text);
}

[data-tag-name=bbva-type-icon] {
  margin: 0 auto;
}

:host([size=XS]) {
  --bbva-data-visualization-donut-max-width-text: 2.1875rem;
}

:host([size=S]) {
  --bbva-data-visualization-donut-max-width-text: 2.625rem;
}

:host([size=M]) {
  --bbva-data-visualization-donut-max-width-text: 2.875rem;
}

:host([size=L]) {
  --bbva-data-visualization-donut-max-width-text: 4.75rem;
}

:host([size=XL]) {
  --bbva-data-visualization-donut-max-width-text: 8.75rem;
}

:host([size="2XL"]) {
  --bbva-data-visualization-donut-max-width-text: 14.625rem;
}

:host([size="3XL"]) {
  --bbva-data-visualization-donut-max-width-text: 21.875rem;
}

:host([show-levels]) [data-tag-name=bbva-type-text] {
  width: 11.25rem;
}

:host([loading]) {
  position: relative;
  border-radius: 50%;
  background-color: transparent;
  opacity: 1;
  pointer-events: none;
}
:host([loading]) .skeleton {
  position: absolute;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  background: var(--_data-visualization-donut-skeleton-animated-layer-bg);
  contain: strict;
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
}

:host([loading][size=XS]) {
  width: 2.5rem;
  height: 2.5rem;
  box-shadow: 0 0 0 0.0625rem var(--_data-visualization-donut-skeleton-quote-color) inset;
}
:host([loading][size=XS]) .skeleton {
  height: 2.5rem;
}

:host([loading][size=S]) {
  width: 3rem;
  height: 3rem;
  box-shadow: 0 0 0 0.0625rem var(--_data-visualization-donut-skeleton-quote-color) inset;
}
:host([loading][size=S]) .skeleton {
  height: 3rem;
}

:host([loading][size=M]) {
  width: 3.5rem;
  height: 3.5rem;
  box-shadow: 0 0 0 0.25rem var(--_data-visualization-donut-skeleton-quote-color) inset;
}
:host([loading][size=M]) .skeleton {
  height: 3.5rem;
}

:host([loading][size=L]) {
  width: 6rem;
  height: 6rem;
  box-shadow: 0 0 0 0.5rem var(--_data-visualization-donut-skeleton-quote-color) inset;
}
:host([loading][size=L]) .skeleton {
  height: 6rem;
}

:host([loading][size=XL]) {
  width: 10rem;
  height: 10rem;
  box-shadow: 0 0 0 0.5rem var(--_data-visualization-donut-skeleton-quote-color) inset;
}
:host([loading][size=XL]) .skeleton {
  height: 10rem;
}

:host([loading][size="2XL"]) {
  width: 16.5rem;
  height: 16.5rem;
  box-shadow: 0 0 0 0.75rem var(--_data-visualization-donut-skeleton-quote-color) inset;
}
:host([loading][size="2XL"]) .skeleton {
  height: 16.5rem;
}

:host([loading][size="3XL"]) {
  width: 23.75rem;
  height: 23.75rem;
  box-shadow: 0 0 0 1.25rem var(--_data-visualization-donut-skeleton-quote-color) inset;
}
:host([loading][size="3XL"]) .skeleton {
  height: 23.75rem;
}

:host([loading][show-levels]) {
  width: 15rem;
  height: 15rem;
  box-shadow: 0 0 0 0.75rem var(--_data-visualization-donut-skeleton-quote-color) inset;
}
:host([loading][show-levels]) .skeleton {
  height: 15rem;
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
.points {
  display: flex;
  width: 1.875rem;
  height: 0.375rem;
  justify-content: center;
}

.point {
  width: 0.375rem;
  height: 0.375rem;
  border-radius: 50%;
  background-color: var(--_data-visualization-donut-middle-content-text-color);
}
.point::before {
  position: relative;
  top: 0;
  right: 0.75rem;
  display: block;
  width: 0.375rem;
  height: 0.375rem;
  border-radius: 50%;
  background-color: inherit;
  content: "";
}
.point::after {
  position: relative;
  top: -0.375rem;
  right: -0.75rem;
  display: block;
  width: 0.375rem;
  height: 0.375rem;
  border-radius: 50%;
  background-color: inherit;
  content: "";
}

.bold-text {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${b(h.medium.fontWeight)});
}
`,ft=r`
:host {
  --_data-visualization-donut-middle-content-text-color:
  var(--bbva-data-visualization-donut--_ambient--middle-content-text-color,
    var(--bbva-data-visualization-donut--custom--primary-ambient--middle-content-text-color,
      ${W("colorPrimaryText01Default",U)}));
  --_data-visualization-donut-skeleton-animated-layer-bg:
  var(--bbva-data-visualization-donut--_ambient--skeleton-animated-layer-bg,
    var(--bbva-data-visualization-donut--custom--primary-ambient--skeleton-animated-layer-bg,
      ${W("colorPrimarySurfaceAmbientDefault",U)}));
  --_data-visualization-donut-skeleton-quote-color:
  var(--bbva-data-visualization-donut--_ambient--skeleton-quote-color,
    var(--bbva-data-visualization-donut--custom--primary-ambient--skeleton-quote-color,
      ${W("colorPrimarySurfaceAmbientPreloading",U)}));
}
`;const _t=r`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-data-visualization-donut--_ambient--middle-content-text-color: initial;
    --bbva-data-visualization-donut--_ambient--skeleton-quote-color: initial;
    --bbva-data-visualization-donut--_ambient--skeleton-animated-layer-bg: initial;
    
  }
`,At=r`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-data-visualization-donut--_ambient--middle-content-text-color: var(
      --bbva-data-visualization-donut--custom--primary-alt-ambient--middle-content-text-color,
      ${W("colorPrimaryAltText01Default",U)}
    );

    --bbva-data-visualization-donut--_ambient--skeleton-quote-color: var(
      --bbva-data-visualization-donut--custom--primary-alt-ambient--skeleton-quote-color,
      ${W("colorPrimaryAltSurfaceAlternativeDefault",U)}
    );

    --bbva-data-visualization-donut--_ambient--skeleton-animated-layer-bg: var(
      --bbva-data-visualization-donut--custom--primary-alt-ambient--skeleton-animated-layer-bg,
      ${W("colorPrimaryAltSurfaceAmbientDefault",U)}
    );
  }
`,kt=r`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-data-visualization-donut--_ambient--middle-content-text-color: var(
      --bbva-data-visualization-donut--custom--secondary-ambient--middle-content-text-color,
      ${W("colorSecondaryText01Default",U)}
    );

    --bbva-data-visualization-donut--_ambient--skeleton-quote-color: var(
      --bbva-data-visualization-donut--custom--secondary-ambient--skeleton-quote-color,
      ${W("colorSecondarySurfaceAlternativeDefault",U)}
    );

    --bbva-data-visualization-donut--_ambient--skeleton-animated-layer-bg: var(
      --bbva-data-visualization-donut--custom--secondary-ambient--skeleton-animated-layer-bg,
      ${W("colorSecondarySurfaceAmbientDefault",U)}
    );
  }
`,St=r`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-data-visualization-donut--_ambient--middle-content-text-color: var(
      --bbva-data-visualization-donut--custom--secondary-alt-ambient--middle-content-text-color,
      ${W("colorSecondaryAltText01Default",U)}
    );

    --bbva-data-visualization-donut--_ambient--skeleton-quote-color: var(
      --bbva-data-visualization-donut--custom--secondary-alt-ambient--skeleton-quote-color,
      ${W("colorSecondaryAltSurfaceAlternativeDefault",U)}
    );

    --bbva-data-visualization-donut--_ambient--skeleton-animated-layer-bg: var(
      --bbva-data-visualization-donut--custom--secondary-alt-ambient--skeleton-animated-layer-bg,
      ${W("colorSecondaryAltSurfaceAmbientDefault",U)}
    );
  }
`;const wt=X([Object.freeze({__proto__:null,primary:_t,primaryAlt:At,secondary:kt,secondaryAlt:St}),K,Y,Q,J]),$t=Object.values(wt),xt={ascending:({value:e},{value:t})=>e-t,descending:({value:e},{value:t})=>t-e},Dt={easeLinear:Le,easeQuad:Ie,easeCubic:De,easeSin:Me,easeExp:Re,easeCircle:Be,easeElastic:Oe,easeBack:Ne,easeBounce:Ve},Pt=["radius","innerRadius","data","showValues","padAngle","padRadius","sort","showLevels","showShadow","easing"];class Ct extends(p(o(Z(ee(a))))){static get is(){return"bbva-data-visualization-donut"}static get scopedElements(){const e=[te,ie,G,ae];return Ct.scopedElementsFromClasses(e)}static get properties(){return{data:{type:Array},radius:{type:Number},innerRadius:{type:Number,attribute:"inner-radius"},strokeColor:{type:String,attribute:"stroke-color"},strokeWidth:{type:Number,attribute:"stroke-width"},opacity:{type:Number},easing:{type:String},transitionDuration:{type:Number,attribute:"transition-duration"},selectedSlice:{type:Number,attribute:"selected-slice"},showValues:{type:Boolean,attribute:"show-values"},showLevels:{type:Boolean,attribute:"show-levels"},valueColor:{type:String,attribute:"value-color"},sort:{type:String},padAngle:{type:Number,attribute:"pad-angle"},padRadius:{type:Number,attribute:"pad-radius"},showShadow:{type:Boolean,attribute:"show-shadow"},gap:{type:Number},type:{type:String},amountVariant:{type:String,attribute:"amount-variant"},decimalDigits:{type:Number,attribute:"decimal-digits"},contentTitle:{type:String,attribute:"content-title"},cvv:{type:String,attribute:"cvv"},cvvHidden:{type:Boolean,attribute:"cvv-hidden"},label:{type:String},size:{type:String},percentage:{type:Number,attribute:"percentage"},iconName:{type:String,attribute:"icon-name"},loading:{type:Boolean,reflect:!0},clipName:{type:String,attribute:"clip-name"},altClipName:{type:String,attribute:"alt-clip-name"},altImage:{type:String,attribute:"alt-image"}}}static get _mediaQueries(){return{_desktop:"(min-width: 62rem)"}}constructor(){super(),this.data=[],this.easing="easeLinear",this.gap=0,this.innerRadius=90,this.opacity=1,this.padAngle=0,this.padRadius=0,this.radius=132,this.showLevels=!1,this.showShadow=!1,this.showValues=!1,this.sort=null,this.strokeColor="transparent",this.strokeWidth=0,this.transitionDuration=400,this.valueColor="darker",this.decimalDigits=0,this.type="",this.contentTitle="",this.cvv="",this.cvvHidden=!1,this.label="",this.size="",this.iconName="",this.percentage=0,this._limit=6,this._minRadius=86,this._maxRadius=132,this._minInnerRadius=74,this._maxInnerRadius=120,this._otherLabel="bbva-data-visualization-donut-other",this._onClickOutsideChart=this._onClickOutsideChart.bind(this),this.loading=!1,this.clipName=""}updated(e){e.has("showLevels")&&(this.radius=this.showLevels||!this.size?this._maxRadius:this._minRadius,this.innerRadius=this.showLevels||!this.size?this._maxInnerRadius:this._minInnerRadius),e.has("selectedSlice")&&this.dispatchEvent(new CustomEvent("data-visualization-donut-selected-slice-changed",{detail:{value:this.selectedSlice}}));const t=[...e.keys()];!this.loading&&Pt.some((e=>t.includes(e)))&&this._setChart(this._wh,this.innerRadius,this._data,this.showValues,this.padAngle,this.padRadius),e.has("selectedSlice")&&this._selectSlice(this.selectedSlice)}_percentageSize(){if(!this.size)return"";const e={XS:"2XS",S:"S",M:"S",L:"L",XL:"3XL",...this._desktop&&{"2XL":"3XL","3XL":"3XL"}};return e[this.size]||e.XL}get _createAccessibleTableRows(){return this.data?this.data.map((e=>n`
              <tr>
                <td>${e.label}</td>
                <td>${e.value}</td>
              </tr>
            `)):g}get _createAccessibleTable(){return this.data?n`
          <table class="accessible-table sr-only">
            ${this._createAccessibleTableRows}
          </table>
        `:g}static get styles(){return[yt,ft,$t,l("bbva-data-visualization-donut-shared-styles")]}get _withAmount(){return"L"===this.size?n`
        <bbva-type-amount
          .amount="${this.amount}"
          .localCurrency="${this.localCurrency}"
          .currencyCode="${this.currencyCode}"
          .language="${this.language}"
          decimal-digits=${this.decimalDigits}
          varian
          t="M"
        >
        </bbva-type-amount>
      `:n`
      <bbva-type-amount
        .amount="${this.amount}"
        .localCurrency="${this.localCurrency}"
        .currencyCode="${this.currencyCode}"
        .language="${this.language}"
        decimal-digits=${this.decimalDigits}
        variant="L"
      >
      </bbva-type-amount>
    `}get _withPercentage(){return n`
      <bbva-type-text
        tag="span"
        class="custom-text"
        size="${this._percentageSize()}"
        alignment="center"
        ellipsis
        text="${this.percentage}%"
      >
      </bbva-type-text>
    `}get _withIcon(){return n`<bbva-type-icon icon=${this.iconName} size="24"></bbva-type-icon>`}get _withText(){return this.contentTitle&&!this.cvv?n`
        <bbva-type-text
          size="S"
          tag="span"
          class="bold-text"
          alignment="center"
          ellipsis
          text=${m(this.contentTitle)}
        ></bbva-type-text>
      `:!this.cvv||this.cvvHidden||this.contentTitle?this.cvv&&this.cvvHidden&&!this.contentTitle?n`
        <span class="points">
          <span class="point"></span>
        </span>
      `:"":n`
        <bbva-type-text
          size="3XL"
          tag="span"
          class="bold-text"
          alignment="center"
          ellipsis
          text=${m(this.cvv)}
        ></bbva-type-text>
      `}get _withClip(){return this.showLevels?n`
          <bbva-clip-microillustration
            alt-image="${m(this.altImage)}"
            alt-microillustration="${m(this.altClipName)}"
            microillustration="${this.clipName}"
            size="S"
          >
          </bbva-clip-microillustration>
        `:""}get _data(){return this._sort?[...this.data].sort(xt[this._sort]):this.data}get _sort(){return["ascending","descending"].includes(this.sort)?this.sort:null}get _wh(){return 2*this.radius}get _hasSelectedSlice(){return this.selectedSlice||0===this.selectedSlice}get chart(){return this._chart||(this._chart=this.shadowRoot.querySelector("#chart")),this._chart}get svg(){return this._svg||(this._svg=this.shadowRoot.querySelector("svg")),this._svg}_selectRenderType(){switch(this._checkSize(),this.type){case"amount":return this._withAmount;case"percentage":return this._withPercentage;case"icon":return this._withIcon;case"clip":return this._withClip;default:return this._withText}}_checkSize(){if(this.size){const e={XS:[20,16],S:[24,20],M:[28,24],L:[48,40],XL:[80,72],...this._desktop&&{"2XL":[132,120],"3XL":[190,170]}};[this._minRadius,this._minInnerRadius]=e[this.size]||e.XL}}_setSelected(e){var t;this.selected=(t=e,JSON.parse(JSON.stringify(t))),this.dispatchEvent(new CustomEvent("data-visualization-donut-selected-changed",{detail:{value:this.selected}}))}_selectSlice(e){this._svg.classed("slice-selected",this._hasSelectedSlice),setTimeout((()=>{this._path.attr("opacity",((t,i)=>i===e?1:.4))}),0),this._setSelected(this._data[e])}updateData(){this._pie.value(((e,t)=>this.data[t].value)),this._path=this._path.data(this._pie),this._animateSections()}_setChart(e,t,i,a,s,o){this._setDataLimit(),this.chart.innerHTML="";const n=Pe(Ce);this._pie=Ee().value((e=>e.value)).sort(null).padAngle(s),this._arc=Te().innerRadius((e=>e.data.color||"XS"!==this.size&&"S"!==this.size?t:t+1.5)).outerRadius((e=>e.data.color||"XS"!==this.size&&"S"!==this.size?this.radius:this.radius-1.5)).padRadius(o),this._svg=Se(this.chart).append("svg").attr("width",e).attr("height",e).attr("overflow","visible").classed("slice-selected",this._hasSelectedSlice),this._group=this._svg.append("g").attr("transform",`translate(${this.radius}, ${this.radius})`),this._arcs=this._group.datum(i).selectAll("arc").data(this._pie(i)).enter().append("g"),this._path=this._arcs.append("path").attr("d",this._arc).attr("stroke",this.strokeColor).attr("stroke-width",this.strokeWidth).attr("opacity",(e=>e.data.opacity||this.opacity)).attr("fill",(e=>e.data.color?e.data.color||n(e.value):getComputedStyle(this).getPropertyValue("--_data-visualization-donut-skeleton-quote-color").replace(" ",""))).each((function(e){this.currentData=e})),this._hasSelectedSlice&&this._path.attr("opacity",((e,t)=>t===this.selectedSlice?1:.4)),a&&(this._text=this._arcs.append("text").attr("transform",(e=>`translate(${this._arc.centroid(e)})`)).attr("text-anchor","middle").attr("alignment-baseline","central").attr("class","label").attr("fill",(e=>we(e.data.color||n(e.value))[this.valueColor](2))).text((e=>`${e.value}%`))),this.svg._groups[0][0].classList[this.showShadow?"add":"remove"]("shadow"),this._bindPathEvents(),this.animate()}_setDataLimit(){if(this._data.length>this._limit){this._data.splice(this._limit).forEach((e=>{this._data[this._limit-1].value+=e.value})),this._data[this._limit-1].label=this.t(this._otherLabel)||""}}_bindPathEvents(){this._path.on("click",(e=>this._onPathClick(e))).on("mouseover",(e=>this._onPathMouseover(e))).on("mouseout",(()=>{const e=$e.composedPath()[0];Se(e).classed("highlighted",!1)}))}animate(){this._path.transition().duration(this.transitionDuration).ease(Dt[this.easing]).attrTween("d",(e=>{e.innerRadius=0;const t=xe({startAngle:0,endAngle:0},e);return e=>this._arc(t(e))})),this.gap=0!==this.gap?this.gap:this.radius-this.innerRadius;const e=this._path.transition("deploy-tweenPie").ease(Dt[this.easing]).duration(this.transitionDuration).attrTween("d",this._tweenPie.bind(this));if(this.showLevels){const t=Te();e.transition("rings-tweenArc").ease(Dt[this.easing]).duration(2*this.transitionDuration).attrTween("d",((e,i)=>a=>t(xe(e,{...e,...this.getDataRadius(i,e)})(a))))}this.showValues&&this._text.data(this._pie).attr("opacity",0).attr("transform",(e=>`translate(${this._arc.centroid(e)})`)).text((e=>`${e.value}%`)).transition().duration(this.transitionDuration).attr("opacity",1)}_animateSections(){const e=this.showLevels?Te():this._arc;this._path.transition("desplegar-datachange").duration(this.transitionDuration).attrTween("d",(function(t){const i=xe(this.currentData,t);return this.currentData=i(0),t=>e(i(t))})),this.showValues&&this._text.data(this._pie).attr("opacity",0).attr("transform",(e=>`translate(${this._arc.centroid(e)})`)).text((e=>`${e.value}%`)).transition().duration(this.transitionDuration).attr("opacity",1)}_onPathClick(e){$e.stopPropagation(),this._onSectionClickOrHover("click",e),this._svg.classed("slice-selected",!0),document.addEventListener("click",this._onClickOutsideChart,!0)}_onPathMouseover(e){this._onSectionClickOrHover("hover",e);const t=$e.composedPath()[0];Se(t).classed("highlighted",!0)}_onClickOutsideChart(e){e.target.nodeName.toLowerCase()!==this.is&&(document.removeEventListener("click",this._onClickOutsideChart,!0),this._svg.classed("slice-selected",!1))}_onSectionClickOrHover(e,t){this.dispatchEvent(new CustomEvent(`data-visualization-donut-section-${e}`,{bubbles:!0,composed:!0,detail:t.data})),"click"===e?this.selectedSlice=this._data.indexOf(t.data):this._setSelected(t.data)}getDataRadius(e,{innerRadius:t,outerRadius:i}){let a={innerRadius:t,outerRadius:i};return this._data.length%2==0&&e%2!=0&&e%2==0?a={innerRadius:+t-this.gap,outerRadius:+i-this.gap}:0===e?a={innerRadius:+t+this.gap,outerRadius:+i+this.gap}:e%2==0&&(a={innerRadius:+t-this.gap,outerRadius:+i-this.gap}),a}_tweenPie(e){const t=e;t.innerRadius=this.innerRadius,t.outerRadius=this.radius;const i=xe({startAngle:0,endAngle:0},t);return e=>this._arc(i(e))}render(){return n`${this.loading?n`<div class="skeleton"></div>`:n`<div class="center custom-label">
            <div id="chart" class="chart" aria-hidden="true"></div>
            <div class="middle-donut-content">
              ${this._selectRenderType()}
              <bbva-type-text
                tag="span"
                class="custom-text"
                size="S"
                alignment="center"
                ellipsis
                text="${this.label}"
              >
              </bbva-type-text>
            </div>
          </div>
          ${this._createAccessibleTable}`}`}}var Et=r`:host {
  display: block;
  box-sizing: border-box;
  background-color: white;
  margin-top: 8px;
  padding: 16px;
}
:host .security-profile-data-container {
  --bbva-data-visualization-donut-padding: 0;
  --bbva-data-visualization-donut-chart-padding: 0;
}
:host [data-tag-name=bbva-type-link] {
  padding-bottom: 16px;
}
:host [data-tag-name=bbva-type-text].highlighted {
  --_type-text-color: var(--colorsPrimaryCoreLight, ${b(y.primaryCoreLight)});
}
`;class Tt extends(s(Ge(o(a)))){static get is(){return"bbva-security-profile-widget"}static get scopedElements(){return{"bbva-panel-container":se,"bbva-data-visualization-donut":Ct,"bbva-header-main":oe,"bbva-type-text":G,"bbva-type-link":ne,"bbva-notification-contextual":re}}static get styles(){return[Et,l("bbva-security-profile-widget-shared-styles")]}static get properties(){return{dataWidgetDescription:{type:String},dataLink:{type:String},dataWidgetTitle:{type:String},dataWidgetCardTitle:{type:String},dataDonut:{type:Array},pendingConfig:{type:Object},pendingAction:{type:Object},contentEllipsisLines:{type:Number},innerRadius:{type:Number}}}constructor(){super(),this.dataWidgetTitle="bbva-security-profile-widget-title",this.dataWidgetCardTitle="bbva-security-profile-widget-card-title",this.contentEllipsisLines=3,this.dataLink="bbva-security-settings-profile-link-title",this.dataWidgetDescription="bbva-security-settings-profile-widget-description",this.pendingAction={},this.pendingConfig={}}render(){return n`
      ${this._renderSecurityProfileWidget()}`}_renderSecurityProfileWidget(){return n`
      <div class="security-profile-data-container">
        <bbva-data-visualization-donut
          type="icon"
          size="L"
          inner-radius="${this.innerRadius}"
          .data="${this.dataDonut}"
          icon-name="${f()}"
          >
        </bbva-data-visualization-donut>

        <bbva-type-text
          size="XL"
          font-weight="500"
          text="${this.dataWidgetTitle}">
        </bbva-type-text>

        <bbva-type-text
          text="${this.dataWidgetDescription}">
        </bbva-type-text>

        <bbva-type-link
          text=${this.t(this.dataLink)}
          @click=${this.goToNextStep}></bbva-type-link>

        ${this.pendingAction?this._renderNotification():""}

      </div>
      `}_renderPendingActions(){return n`
      <bbva-type-text
          class="highlighted"
          text="${this.pendingConfig.pendingActionsAmount} acciones pendientes"
          font-style="italic">
      </bbva-type-text>
    `}_renderNotification(){return n`
      <bbva-notification-contextual
        .contentEllipsisLines="${this.contentEllipsisLines}"
        ambient="primary-alt"
        variant="info"
        class="arrow-left"
        head-title="${this.t(this.dataWidgetCardTitle)}"
        body-text="${this.pendingAction.body}"
        link-text="${this.pendingAction.link}"
        icon-type="${_()}"
        @click="${this.navigateToPage}">
      </bbva-notification-contextual>
    `}goToNextStep(){this.__fireEvent("next-step")}navigateToPage(){this.__fireEvent("widget-clicked-link",{event:"navigate-to-pending-action",data:this.pendingAction.id})}__fireEvent(e,t){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}}var Lt=r`:host {
  display: block;
  box-sizing: border-box;
  background-color: white;
  margin-top: 0.5rem;
  padding: 1rem;
  --bbva-list-link-heading-color: var(--colorsSecondary600, ${b(y.secondary600)});
}
:host [data-tag-name=bbva-list-toggle] {
  padding: 1rem 0 0 0;
  --bbva-form-toggle-list-container-padding: 0 0 0 rem(16px);
}
:host [data-tag-name=bbva-type-text].highlighted {
  --_type-text-color: var(--colorsTertiaryType6Dark, ${b(y.tertiaryType6Dark)});
}
:host [data-tag-name=bbva-type-text].compromised {
  --_type-text-color: var(--colorsTertiaryType5Dark, ${b(y.tertiaryType5Dark)});
}
:host [data-tag-name=bbva-type-text].high {
  --_type-text-color: var(--colorsTertiaryType6Dark, ${b(y.tertiaryType6Dark)});
}
:host [data-tag-name=bbva-type-text].medium {
  --_type-text-color: var(--colorsTertiaryType3Dark, ${b(y.tertiaryType3Dark)});
}
:host [data-tag-name=bbva-type-text][disabled] {
  opacity: 0.4;
}
:host [data-tag-name=bbva-toggle-divider] {
  padding-top: 2rem;
}
:host div.enroll-token-info-container {
  display: flex;
  align-items: center;
}
:host div.enroll-token-info-container [data-tag-name=bbva-type-text] {
  padding-left: 0.5rem;
}
:host div.enroll-token-info-container [data-tag-name=bbva-type-icon] {
  --bbva-type-icon--_ambient--color: var(--colorsPrimaryCore, ${b(y.primaryCore)});
}
:host .password-list-link {
  display: flex;
  justify-content: flex-start;
  align-items: center;
  margin-top: 1rem;
}
:host .password-list-link [data-tag-name=bbva-type-text] {
  margin-left: 0.5rem;
}
:host .password-list-link [data-tag-name=bbva-type-link] {
  margin-left: auto;
}
:host .password-list-link--only {
  margin-bottom: 1rem;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class It extends(s(Ge(o(a)))){static get is(){return"bbva-security-access-widget"}static get scopedElements(){return{"bbva-type-text":G,"bbva-type-link":ne,"bbva-clip-microillustration":ae,"bbva-list-toggle":A,"bbva-divider-default":ce,"bbva-type-icon":ie}}static get styles(){return[Lt,l("bbva-security-access-widget-shared-styles")]}static get properties(){return{securityAccessTitle:{type:String},securityAccessDescription:{type:String},securityAccessMicroillustration:{type:String},biometricAccessDescription:{type:String},passwordStrength:{type:Object},passwordStrengthText:{type:String},passwordStrengthClass:{type:String},currentPasswordTitle:{type:String},modifyPasswordLink:{type:String},lastAccessDateDisplayed:{type:String},isLastAccessDateVisible:{type:Boolean},isPasswordStrengthVisible:{type:Boolean},isBiometricAccessVisible:{type:Boolean},isAccessKeyManagmentVisible:{type:Boolean},isStEnrolled:{type:Boolean},tokenInfoContainerText:{type:String},softokenEnrollmentLinkLabel:{type:String},isBiometryEnrolled:{type:Boolean}}}constructor(){super(),this.securityAccessTitle="bbva-security-access-title",this.securityAccessDescription="bbva-security-access-description",this.securityAccessMicroillustration="password",this.biometricAccessDescription="bbva-security-biometric-access-description",this.biometricAccessTitle="bbva-security-biometric-access-title",this.currentPasswordTitle="bbva-security-access-current-password-title",this.modifyPasswordLink="bbva-security-access-modify-password-link",this.tokenInfoContainerText="bbva-security-access-token-info-container-text",this.softokenEnrollmentLinkLabel="bbva-security-access-softoken-enrollment-link-label",this.isPasswordStrengthVisible=!1,this.isBiometricAccessVisible=!1,this.isBiometryEnrolled=!1}render(){return n`${this._renderSecurityAccessWidget()}`}_renderSecurityAccessWidget(){return n`
      <div class="security-access-container">
        <bbva-clip-microillustration
          microillustration="${this.securityAccessMicroillustration}"
          size="S">
        </bbva-clip-microillustration>
        <bbva-type-text
          size="XL"
          font-weight="500"
          text="${this.t(this.securityAccessTitle)}">
        </bbva-type-text>
        <bbva-type-text
          text="${this.t(this.securityAccessDescription)}">
        </bbva-type-text>
        ${this._renderPasswordListLink()}
        ${this.isPasswordStrengthVisible?this._renderPasswordStrength():""}
        ${this.isBiometricAccessVisible?this._renderBiometricAccess():""}
      </div>
    `}_passwordListLinkClass(){let e="password-list-link";return e+=this.isPasswordStrengthVisible?"":` ${e}--only`,e}_renderPasswordListLink(){return n`
      <div class=${this._passwordListLinkClass()}>
        <bbva-type-icon
          icon=${k()}
          size="24">
        </bbva-type-icon>
        <bbva-type-text
          text=${this.t(this.currentPasswordTitle)}
          font-weight="500"
          tag="span">
        </bbva-type-text>
        <bbva-type-link
          aria-label=${this.t(this.currentPasswordTitle)}
          @click=${this.fireSecurityAccessClickedLink}>
          ${this.isAccessKeyManagmentVisible?this.t(this.modifyPasswordLink):""}
        </bbva-type-link>
      </div>
    `}_renderBiometricAccess(){return n`
      <bbva-divider-default></bbva-divider-default>
      <bbva-list-toggle
        heading="${this.t(this.biometricAccessTitle)}"
        main-icon="${S()}"
        ?disabled="${!this.isStEnrolled}"
        ?checked="${this.isBiometryEnrolled}"
        @list-toggle-switch-change="${e=>this.manageSwitchState(e)}">
      </bbva-list-toggle>
      <bbva-type-text
        ?disabled="${!this.isStEnrolled}"
        text="${this.biometricAccessDescription}">
      </bbva-type-text>
      ${this.isStEnrolled?"":this._renderTokenEnroll()}
      `}manageSwitchState(e){this.__fireEvent("set-switch-state",e.detail),e.detail?this.__fireEvent("start-fido-enrollment","fidoEnrollmentAccess"):this.__fireEvent("fido-deactivate-modal")}updateWidget(){this.shadowRoot.querySelector('[data-tag-name="bbva-list-toggle"]').checked=this.isBiometryEnrolled}_renderTokenEnroll(){return n`
      <div class="enroll-token-info-container">
        <bbva-type-icon
          icon-color="blue"
          icon="${w()}">
        </bbva-type-icon>
        <bbva-type-text
          size="2XS"
          text="${this.tokenInfoContainerText}">
        </bbva-type-text>
      </div>
      <bbva-type-link
        id="tokenLink"
        aria-label=${this.t(this.tokenInfoContainerText)}
        @click="${this.navigateToSoftokenEnrollment}">
        ${this.t(this.softokenEnrollmentLinkLabel)}
      </bbva-type-link>`}_renderPasswordStrength(){return n`
      <bbva-type-text
        class="highlighted ${this.passwordStrengthClass}"
        variant="success"
        font-style="italic"
        text="${this.passwordStrengthText}">
      </bbva-type-text>`}fireSecurityAccessClickedLink(){this.__fireEvent("widget-clicked-link","navigate-to-key-recovery-update")}navigateToSoftokenEnrollment(){this.__fireEvent("widget-clicked-link","navigate-to-softoken-enrollment")}__fireEvent(e,t){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}}var Mt=r`:host {
  display: block;
  box-sizing: border-box;
  background-color: white;
  margin-top: 8px;
  padding: 16px;
  padding-bottom: 8px;
  --bbva-list-link-heading-color: var(--colorsSecondary600, ${b(y.secondary600)});
}
:host [data-tag-name=bbva-list-link] {
  padding: 0px;
}
:host [data-tag-name=bbva-type-link] {
  padding-bottom: 16px;
}
:host [data-tag-name=bbva-type-text].highlighted {
  --_type-text-color: var(--colorsTertiaryType6Dark, ${b(y.tertiaryType6Dark)});
}
`;class Rt extends(s(Ge(o(a)))){static get is(){return"bbva-security-devices-widget"}static get scopedElements(){return{"bbva-clip-microillustration":ae,"bbva-type-text":G,"bbva-type-link":ne,"bbva-list-link":c}}static get styles(){return[Mt,l("bbva-security-profile-widget-shared-styles")]}static get properties(){return{devicesTitle:{type:String},devicesDescription:{type:String},devicesMicroillustration:{type:String},devicesLink:{type:String},currentDeviceDescription:{type:String},accessibilityDeviceIconLinkText:{type:String},currentDevice:{type:Object},currentDeviceTitle:{type:String},loading:{type:Boolean}}}constructor(){super(),this.devicesTitle="bbva-security-devices-title",this.devicesDescription="bbva-security-devices-description",this.devicesMicroillustration="devices",this.devicesLink="bbva-security-devices-link",this.currentDeviceDescription="bbva-security-devices-current-device-title",this.accessibilityDeviceIconLinkText="bbva-security-devices-accessibility-link-text",this.loading=!1}render(){return n`
      ${this._renderSecurityDevicesWidget()}`}_renderSecurityDevicesWidget(){return n`
      <div class="security-devices-container">
        <bbva-clip-microillustration
          .loading=${this.loading}
          microillustration="${this.devicesMicroillustration}"
          size="S">
        </bbva-clip-microillustration>
        <bbva-type-text
          .loading=${this.loading}
          size="XL"
          font-weight="500"
          text="${this.t(this.devicesTitle)}">
        </bbva-type-text>
        <bbva-type-text
          .loading=${this.loading}
          text="${this.t(this.devicesDescription)}">
        </bbva-type-text>
        <bbva-type-link
          .loading=${this.loading}
          @click="${this.fireSecurityDevicesWidgetLink}"
          text="${this.t(this.devicesLink)}"></bbva-type-link>
        <bbva-list-link
          .loading=${this.loading}
          link-icon-left="${$()}"
          link-icon="${x()}"
          no-header-link
          header-text="${this.currentDeviceTitle}"
          accessibility-icon-link-text="${this.t(this.accessibilityDeviceIconLinkText)}"
          @list-link-click="${this.fireCurrentDeviceLink}">
        </bbva-list-link>
        <bbva-type-text
          .loading=${this.loading}
          class="highlighted"
          variant="success"
          font-style="italic"
          text="${this.t(this.currentDeviceDescription)}">
        </bbva-type-text>
      </div>
    `}fireSecurityDevicesWidgetLink(){this.__fireEvent("widget-clicked-link","navigate-to-security-devices")}fireCurrentDeviceLink(){this.__fireEvent("widget-clicked-link","navigate-to-security-current-device")}__fireEvent(e,t){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}}var Bt=r`:host {
  display: block;
  box-sizing: border-box;
  background-color: white;
  margin-top: 8px;
  padding: 16px;
  padding-bottom: 24px;
  --bbva-list-link-heading-color: var(--colorsSecondary600, ${b(y.secondary600)});
}
:host [data-tag-name=bbva-list-link] {
  padding: 0;
  padding-top: 8px;
}
:host [data-tag-name=bbva-list-link].app-permissions {
  padding-top: 16px;
}
:host [data-tag-name=bbva-divider-default] {
  padding-bottom: 8px;
}
:host [data-tag-name=bbva-type-text].highlighted {
  --_type-text-color: var(--colorsTertiaryType6Dark, ${b(y.tertiaryType6Dark)});
}
:host [data-tag-name=bbva-type-text].disabled {
  color: var(--primary-notification-status-type-neutral, #666);
}
`;class Ot extends(s(Ge(o(a)))){static get is(){return"bbva-security-privacy-widget"}static get scopedElements(){return{"bbva-clip-microillustration":ae,"bbva-type-text":G,"bbva-divider-default":ce,"bbva-list-link":c}}static get styles(){return[Bt,l("bbva-security-devices-widget-shared-styles")]}static get properties(){return{privacyTitle:{type:String},privacyMicroillustration:{type:String},privacyDescription:{type:String},discreetModeStatus:{type:String},isDiscreetModeVisible:{type:Boolean},isAppPermissionVisible:{type:Boolean},accessibilityAppPermissionsIconLinkText:{type:String},accessibilityDiscreetModeIconLinkText:{type:String}}}constructor(){super(),this.privacyTitle="bbva-security-app-permissions-title",this.privacyMicroillustration="securitycamera",this.privacyDescription="bbva-security-app-permissions-description",this.discreetModeTitle="bbva-security-app-permissions-discreet-mode-title",this.discreetModeStatus="bbva-security-app-permissions-discreet-mode-disabled",this.appPermissionsLink="bbva-security-app-permissions-link",this.isDiscreetModeVisible=!1,this.accessibilityAppPermissionsIconLinkText="bbva-security-app-permissions-accessibility-link-text",this.accessibilityDiscreetModeIconLinkText="bbva-security-discreet-mode-accessibility-link-text"}render(){return n`
      ${this._renderSecurityPrivacyWidget()}`}_renderSecurityPrivacyWidget(){return n`
        <div class="security-privacy-container">
          <bbva-clip-microillustration
            microillustration="${this.privacyMicroillustration}"
            size="S">
          </bbva-clip-microillustration>
          <bbva-type-text
            size="XL"
            font-weight="500"
            text="${this.t(this.privacyTitle)}">
          </bbva-type-text>
          <bbva-type-text
            text="${this.t(this.privacyDescription)}">
          </bbva-type-text>
          ${this.isDiscreetModeVisible?this._renderDiscreetMode():""}
          ${this.isAppPermissionVisible?this._renderAppPermissions():""}
        </div>
    `}_renderDiscreetMode(){var e,t;return n`<bbva-list-link
        link-icon-left="${D()}"
        link-icon="${x()}"
        no-header-link
        accessibility-icon-link-text="${this.t(this.accessibilityDiscreetModeIconLinkText)}"
        header-text="${this.t(this.discreetModeTitle)}"
        @click="${this.fireSecurityPrivacyAppDiscreetModeLink}">
      </bbva-list-link>
      <bbva-type-text
        class="${null===(e=this.discreetModeStatus)||void 0===e?void 0:e.class}"
        ambient="light"
        font-style="italic"
        text="${this.t(null===(t=this.discreetModeStatus)||void 0===t?void 0:t.text)}">
      </bbva-type-text>`}_renderAppPermissions(){return n`
      ${this.isDiscreetModeVisible?n`<bbva-divider-default></bbva-divider-default>`:""}
      <bbva-list-link
        class="app-permissions"
        accessibility-icon-link-text="${this.t(this.accessibilityAppPermissionsIconLinkText)}"
        link-icon-left="${P()}"
        link-icon="${x()}"
        no-header-link
        header-text="${this.t(this.appPermissionsLink)}"
        @click="${this.fireSecurityPrivacyAppPermissionsLink}">
      </bbva-list-link>
    `}fireSecurityPrivacyAppPermissionsLink(){this.__fireEvent("widget-clicked-link","navigate-to-security-settings-permissions")}fireSecurityPrivacyAppDiscreetModeLink(){this.__fireEvent("widget-clicked-link","navigate-to-discreet-mode-settings")}__fireEvent(e,t){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}}var Nt=r`:host {
  display: block;
  box-sizing: border-box;
  background-color: white;
  margin-top: 8px;
  padding: 16px;
}
:host [data-tag-name=bbva-type-text][type=link] {
  --_type-text-color: var(--colorsPrimaryCoreLight, ${b(y.primaryCoreLight)});
}
`;class Vt extends(s(Ge(o(a)))){static get is(){return"bbva-security-tips-widget"}static get scopedElements(){return{"bbva-clip-microillustration":ae,"bbva-type-text":G,"bbva-type-link":ne}}static get styles(){return[Nt,l("bbva-security-tips-widget-shared-styles")]}static get properties(){return{tipsTitle:{type:String},tipsDescription:{type:String},tipsMicroillustration:{type:String},tipsLink:{type:String}}}constructor(){super(),this.tipsTitle="bbva-security-tips-widget-title",this.tipsMicroillustration="security",this.tipsDescription="bbva-security-tips-widget-description",this.tipsLink="bbva-security-tips-widget-link"}render(){return n`
      <div class="security-tips-container">
        <bbva-clip-microillustration
          microillustration="${this.tipsMicroillustration}"
          size="S">
        </bbva-clip-microillustration>
        <bbva-type-text
          size="XL"
          font-weight="500"
          text="${this.t(this.tipsTitle)}">
        </bbva-type-text>
        <bbva-type-text
          text="${this.t(this.tipsDescription)}">
        </bbva-type-text>
        <bbva-type-link
          text="${this.t(this.tipsLink)}"
          @click=${this.fireSecurityTipsWidgetLink}></bbva-type-link>
      </div>
    `}fireSecurityTipsWidgetLink(){this.__fireEvent("widget-clicked-link","navigate-to-security-tips")}__fireEvent(e,t){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}}var zt=r`
:host {
  --_button-default-color: var(--bbva-button-default--_ambient--color,
      var(--bbva-button-default--custom--primary-ambient--color,
        ${W("colorPrimaryCtaMainTextDefault",U)}));
  --_button-default-focus-border-color: var(--bbva-button-default--_ambient--focus-border-color,
    var(--bbva-button-default--custom--primary-ambient--focus-border-color,
      ${W("colorPrimarySurfaceAmbientFocus",U)}));
  --_button-default-bg-color: var(--bbva-button-default--_ambient--bg-color,
    var(--bbva-button-default--custom--primary-ambient--bg-color,
      ${W("colorPrimaryCtaMainBackgroundDefault",U)}));
  --_button-default-color-active: var(--bbva-button-default--_ambient--color-active,
    var(--bbva-button-default--custom--primary-ambient--color-active,
      ${W("colorPrimaryCtaMainTextDefault",U)}));
  --_button-default-bg-color-active: var(--bbva-button-default--_ambient--bg-color-active,
    var(--bbva-button-default--custom--primary-ambient--bg-color-active,
      ${W("colorPrimaryCtaMainBackgroundPressed",U)}));
  --_button-default-bg-color-disabled: var(--bbva-button-default--_ambient--bg-color-disabled,
    var(--bbva-button-default--custom--primary-ambient--bg-color-disabled,
      ${W("colorPrimaryCtaDisabledBackground",U)}));
  --_button-default-color-disabled: var(--bbva-button-default--_ambient--color-disabled,
    var(--bbva-button-default--custom--primary-ambient--color-disabled,
      ${W("colorPrimaryCtaDisabledText",U)}));
  /* Secondary styles */
  --_button-default-secondary-color: var(--bbva-button-default--_ambient--secondary-color,
    var(--bbva-button-default--custom--primary-ambient--secondary-color,
      ${W("colorPrimaryCtaComplementaryTextDefault",U)}));
  --_button-default-secondary-bg-color: var(--bbva-button-default--_ambient--secondary-bg-color,
    var(--bbva-button-default--custom--primary-ambient--secondary-bg-color,
      transparent));
  --_button-default-secondary-border-color: var(--bbva-button-default--_ambient--secondary-border-color,
    var(--bbva-button-default--custom--primary-ambient--secondary-border-color,
      ${W("colorPrimaryCtaComplementaryBorderDefault",U)}));
  --_button-default-secondary-color-active: var(--bbva-button-default--_ambient--secondary-color-active,
    var(--bbva-button-default--custom--primary-ambient--secondary-color-active,
      ${W("colorPrimaryCtaComplementaryTextPressed",U)}));
  --_button-default-secondary-bg-color-active: var(--bbva-button-default--_ambient--secondary-bg-color-active,
    var(--bbva-button-default--custom--primary-ambient--secondary-bg-color-active,
      ${W("colorPrimaryCtaComplementaryBackgroundPressed",U)}));
  --_button-default-secondary-bg-color-disabled: var(--bbva-button-default--_ambient--secondary-bg-color-disabled,
    var(--bbva-button-default--custom--primary-ambient--bg-color-disabled,
      ${W("colorPrimaryCtaDisabledBackground",U)}));
  /* Link styles */
  --_button-default-link-color: var(--bbva-button-default--_ambient--link-color,
  var(--bbva-button-default--custom--primary-ambient--link-color,
    ${W("colorPrimaryLinkMainDefault",U)}));
  --_button-default-link-color-active: var(--bbva-button-default--_ambient--link-color-active,
  var(--bbva-button-default--custom--primary-ambient--link-color-active,
    ${W("colorPrimaryLinkMainPressed",U)}));
  --_button-default-link-color-disabled: var(--bbva-button-default--_ambient--link-color-disabled,
  var(--bbva-button-default--custom--primary-ambient--link-color-disabled,
    ${W("colorPrimaryCtaDisabledText",U)}));
  /* icon no-background styles */
  --_button-default-icon-no-background-color: var(--bbva-button-default--_ambient--icon-no-background-color,
    var(--bbva-button-default--custom--primary-ambient--icon-no-background-color,
      ${W("colorPrimaryLinkMainDefault",U)}));
  --_button-default-icon-no-background-color-active: var(--bbva-button-default--_ambient--icon-no-background-color-active,
    var(--bbva-button-default--custom--primary-ambient--icon-no-background-color-active,
      ${W("colorPrimaryLinkMainPressed",U)}));
  --_button-default-positive-color: var(--bbva-button-default--_ambient--positive-color,
    var(--bbva-button-default--custom--primary-ambient--positive-color,
      ${W("colorPrimaryCtaPositiveTextDefault",U)}));
  --_button-default-positive-bg-color: var(--bbva-button-default--_ambient--positive-bg-color,
    var(--bbva-button-default--custom--primary-ambient--positive-bg-color,
      ${W("colorPrimaryCtaPositiveBackgroundDefault",U)}));
  --_button-default-positive-color-active: var(--bbva-button-default--_ambient--positive-color-active,
    var(--bbva-button-default--custom--primary-ambient--positive-color-active,
      ${W("colorPrimaryCtaPositiveTextPressed",U)}));
  --_button-default-positive-bg-color-active: var(--bbva-button-default--_ambient--positive-bg-color-active,
    var(--bbva-button-default--custom--primary-ambient--positive-bg-color-active,
      ${W("colorPrimaryCtaPositiveBackgroundPressed",U)}));
  --_button-default-positive-color-disabled: var(--bbva-button-default--_ambient--positive-color-disabled,
    var(--bbva-button-default--custom--primary-ambient--positive-color-disabled,
      ${W("colorPrimaryCtaDisabledText",U)}));
  --_button-default-positive-bg-color-disabled: var(--bbva-button-default--_ambient--positive-bg-color-disabled,
  var(--bbva-button-default--custom--primary-ambient--positive-bg-color-disabled,
    ${W("colorPrimaryCtaDisabledBackground",U)}));
  /* Alert styles */
  --_button-default-alert-secondary-color: var(--bbva-button-default--_ambient--alert-secondary-color,
    var(--bbva-button-default--custom--primary-ambient--alert-secondary-color,
      ${W("colorPrimaryLinkInverseDefault",U)}));
  --_button-default-alert-secondary-bg-color: var(--bbva-button-default--_ambient--alert-secondary-bg-color,
    var(--bbva-button-default--custom--primary-ambient--alert-secondary-bg-color,
      ${W("colorPrimarySurfaceAlternativeDefault",U)}));
  --_button-default-alert-secondary-color-active: var(--bbva-button-default--_ambient--alert-secondary-color-active,
    var(--bbva-button-default--custom--primary-ambient--alert-secondary-color-active,
      ${W("colorPrimaryLinkInversePressed",U)}));
  --_button-default-alert-secondary-bg-color-active: var(--bbva-button-default--_ambient--alert-secondary-bg-color-active,
    var(--bbva-button-default--custom--primary-ambient--alert-secondary-bg-color-active,
      ${W("colorPrimarySurfaceAlternativePressed",U)}));
  --_button-default-alert-secondary-color-disabled: var(--bbva-button-default--_ambient--alert-secondary-color-disabled,
    var(--bbva-button-default--custom--primary-ambient--alert-secondary-color-disabled,
      ${W("colorPrimaryCtaDisabledText",U)}));
  --_button-default-alert-secondary-bg-color-disabled: var(--bbva-button-default--_ambient--alert-secondary-bg-color-disabled,
    var(--bbva-button-default--custom--primary-ambient--bg-color-disabled,
      ${W("colorPrimaryCtaDisabledBackground",U)}));
  /* Icon */
  --_button-default-icon-background: var(--bbva-button-default--_ambient--icon-background,
    var(--bbva-button-default--custom--primary-ambient--icon-background,
      ${W("colorPrimaryCtaMainBackgroundDefault",U)}));
  --_button-default-icon-color: var(--bbva-button-default--_ambient--icon-color,
    var(--bbva-button-default--custom--primary-ambient--icon-color,
      ${W("colorPrimaryCtaMainTextDefault",U)}));
  --_button-default-icon-background-disabled: var(--bbva-button-default--_ambient--icon-background-disabled,
    var(--bbva-button-default--custom--primary-ambient--icon-background-disabled,
      ${W("colorPrimaryCtaDisabledBackground",U)}));
  --_button-default-icon-color-disabled: var(--bbva-button-default--_ambient--icon-color-disabled,
    var(--bbva-button-default--custom--primary-ambient--icon-color-disabled,
      ${W("colorPrimaryCtaDisabledText",U)}));
  --_button-default-icon-background-active: var(--bbva-button-default--_ambient--icon-background-active,
    var(--bbva-button-default--custom--primary-ambient--icon-background-active,
      ${W("colorPrimaryCtaMainBackgroundPressed",U)}));
  --_button-default-icon-color-active: var(--bbva-button-default--_ambient--icon-color-active,
    var(--bbva-button-default--custom--primary-ambient--icon-color-active,
      ${W("colorPrimaryCtaMainTextPressed",U)}));
  /* Icon no-background alternative */
  --_button-default-icon-no-background-alternative-color:
    var(--bbva-button-default--_ambient--icon-no-background-alternative-color,
      var(--bbva-button-default--custom--primary-ambient--icon-no-background-alternative-color,
        ${W("colorPrimaryLinkComplementaryDefault",U)}));
  --_button-default-icon-no-background-alternative-color-active:
    var(--bbva-button-default--_ambient--icon-no-background-alternative-color-active,
      var(--bbva-button-default--custom--primary-ambient--icon-no-background-alternative-color-active,
        ${W("colorPrimaryLinkComplementaryPressed",U)}));
  /* Interactive styles */
  --_button-default-interaction-bg-color: var(--bbva-button-default--_ambient--interaction-bg-color,
    var(--bbva-button-default--custom--primary-ambient--interaction-bg-color,
      ${W("colorPrimaryCtaMainBackgroundDefault",U)}));
  --_button-default-interaction-icon-color: var(--bbva-button-default--_ambient--interaction-icon-color,
    var(--bbva-button-default--custom--primary-ambient--interaction-icon-color,
      ${W("colorPrimaryCtaMainTextDefault",U)}));
  --_button-default-interaction-border-color: var(--bbva-button-default--_ambient--interaction-border-color,
    var(--bbva-button-default--custom--primary-ambient--interaction-border-color,
      transparent));
  --_button-default-interaction-bg-color-active: var(--bbva-button-default--_ambient--interaction-bg-color-active,
    var(--bbva-button-default--custom--primary-ambient--interaction-bg-color-active,
      ${W("colorPrimaryCtaMainBackgroundPressed",U)}));
  --_button-default-interaction-disabled-bg-color: var(--bbva-button-default--_ambient--interaction-disabled-bg-color,
    var(--bbva-button-default--custom--primary-ambient--interaction-disabled-bg-color,
      ${W("colorPrimaryCtaDisabledBackground",U)}));
}
`;const qt=r`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-button-default--_ambient--color: initial;
    --bbva-button-default--_ambient--focus-border-color: initial;
    --bbva-button-default--_ambient--bg-color: initial;
    --bbva-button-default--_ambient--color-active: initial;
    --bbva-button-default--_ambient--bg-color-active: initial;
    --bbva-button-default--_ambient--bg-color-disabled: initial;
    --bbva-button-default--_ambient--color-disabled: initial;
    --bbva-button-default--_ambient--secondary-color: initial;
    --bbva-button-default--_ambient--secondary-border-color: initial;
    --bbva-button-default--_ambient--secondary-color-active: initial;
    --bbva-button-default--_ambient--secondary-bg-color-active: initial;
    --bbva-button-default--_ambient--secondary-color-disabled: initial;
    --bbva-button-default--_ambient--secondary-bg-color-disabled: initial;
    --bbva-button-default--_ambient--link-color: initial;
    --bbva-button-default--_ambient--link-color-active: initial;
    --bbva-button-default--_ambient--link-color-disabled: initial;
    --bbva-button-default--_ambient--icon-no-background-color: initial;
    --bbva-button-default--_ambient--icon-no-background-color-active: initial;
    --bbva-button-default--_ambient--positive-color: initial;
    --bbva-button-default--_ambient--positive-bg-color: initial;
    --bbva-button-default--_ambient--positive-color-active: initial;
    --bbva-button-default--_ambient--positive-bg-color-active: initial;
    --bbva-button-default--_ambient--positive-color-disabled: initial;
    --bbva-button-default--_ambient--positive-bg-color-disabled: initial;
    --bbva-button-default--_ambient--alert-secondary-color: initial;
    --bbva-button-default--_ambient--alert-secondary-bg-color: initial;
    --bbva-button-default--_ambient--alert-secondary-active-color: initial;
    --bbva-button-default--_ambient--alert-secondary-active-bg-color: initial;
    --bbva-button-default--_ambient--alert-secondary-color-disabled: initial;
    --bbva-button-default--_ambient--alert-secondary-bg-color-disabled: initial;
    --bbva-button-default--_ambient--icon-background: initial;
    --bbva-button-default--_ambient--icon-background-active: initial;
    --bbva-button-default--_ambient--icon-background-disabled: initial;
    --bbva-button-default--_ambient--icon-no-background-alternative-color: initial;
    --bbva-button-default--_ambient--icon-no-background-alternative-color-active: initial;
    --bbva-button-default--_ambient--icon-color: initial;
    --bbva-button-default--_ambient--icon-color-active: initial;
    --bbva-button-default--_ambient--icon-color-disabled: initial;
    --bbva-button-default--_ambient--interaction-bg-color: initial;
    --bbva-button-default--_ambient--interaction-icon-color: initial;
    --bbva-button-default--_ambient--interaction-border-color: initial;
    --bbva-button-default--_ambient--interaction-bg-color-active: initial;
    --bbva-button-default--_ambient--interaction-disabled-bg-color: initial;
  }
`,jt=r`
  /* Default styles */
  /* Static */
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-button-default--_ambient--color: var(
      --bbva-button-default--custom--primary-alt-ambient--color,
      ${W("colorPrimaryAltCtaMainTextDefault",U)}
    );

    --bbva-button-default--_ambient--focus-border-color: var(
      --bbva-button-default--custom--primary-alt-ambient--focus-border-color,
      ${W("colorPrimaryAltSurfaceAmbientFocus",U)}
    );

    --bbva-button-default--_ambient--bg-color: var(
      --bbva-button-default--custom--primary-alt-ambient--bg-color,
      ${W("colorPrimaryAltCtaMainBackgroundDefault",U)}
    );
    --bbva-button-default--_ambient--color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--color-active,
      ${W("colorPrimaryAltCtaMainTextDefault",U)}
    );
    --bbva-button-default--_ambient--bg-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--bg-color-active,
      ${W("colorPrimaryAltCtaMainBackgroundPressed",U)}
    );

    --bbva-button-default--_ambient--bg-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--bg-color-disabled,
      ${W("colorPrimaryAltCtaDisabledBackground",U)}
    );

    --bbva-button-default--_ambient--color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--color-disabled,
      ${W("colorPrimaryAltCtaDisabledText",U)}
    );

    /* Secondary styles */
    --bbva-button-default--_ambient--secondary-color: var(
      --bbva-button-default--custom--primary-alt-ambient--secondary-color,
      ${W("colorPrimaryAltCtaComplementaryTextDefault",U)}
    );

    --bbva-button-default--_ambient--secondary-border-color: var(
      --bbva-button-default--custom--primary-alt-ambient--secondary-border-color,
      ${W("colorPrimaryAltCtaComplementaryBorderDefault",U)}
    );

    --bbva-button-default--_ambient--secondary-bg-color: var(
      --bbva-button-default--custom--primary-alt-ambient--secondary-bg-color,
      transparent
    );

    --bbva-button-default--_ambient--secondary-bg-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--secondary-bg-color-active,
      ${W("colorPrimaryAltCtaComplementaryBackgroundPressed",U)}
    );

    --bbva-button-default--_ambient--secondary-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--secondary-color-disabled,
      ${W("colorPrimaryAltCtaDisabledText",U)}
    );

    --bbva-button-default--_ambient--secondary-bg-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--secondary-bg-color-disabled,
      ${W("colorPrimaryAltCtaDisabledBackground",U)}
    );

    /* Link styles */
    --bbva-button-default--_ambient--link-color: var(
      --bbva-button-default--custom--primary-alt-ambient--link-color,
      ${W("colorPrimaryAltLinkMainDefault",U)}
    );

    --bbva-button-default--_ambient--link-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--link-color-active,
      ${W("colorPrimaryAltLinkMainPressed",U)}
    );

    --bbva-button-default--_ambient--link-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--link-color-disabled,
      ${W("colorPrimaryAltCtaDisabledText",U)}
    );

    /* Icon no-background styles */
    --bbva-button-default--_ambient--icon-no-background-color: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-no-background-color,
      ${W("colorPrimaryAltLinkMainDefault",U)}
    );

    --bbva-button-default--_ambient--icon-no-background-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-no-background-color-active,
      ${W("colorPrimaryAltLinkMainPressed",U)}
    );

    /* Icon no-background alternative styles */

    --bbva-button-default--_ambient--icon-no-background-alternative-color: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-no-background-alternative-color,
      ${W("colorPrimaryAltLinkComplementaryDefault",U)}
    );

    --bbva-button-default--_ambient--icon-no-background-alternative-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-no-background-alternative-color-active,
      ${W("colorPrimaryAltLinkComplementaryPressed",U)}
    );

    /* Positive styles */
    --bbva-button-default--_ambient--positive-color: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-color,
      ${W("colorPrimaryAltCtaPositiveTextDefault",U)}
    );

    --bbva-button-default--_ambient--positive-bg-color: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-bg-color,
      ${W("colorPrimaryAltCtaPositiveBackgroundDefault",U)}
    );

    --bbva-button-default--_ambient--positive-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-color-active,
      ${W("colorPrimaryAltCtaPositiveTextPressed",U)}
    );

    --bbva-button-default--_ambient--positive-bg-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-bg-color-active,
      ${W("colorPrimaryAltCtaPositiveBackgroundPressed",U)}
    );

    --bbva-button-default--_ambient--positive-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-color-disabled,
      ${W("colorPrimaryAltCtaDisabledText",U)}
    );

    --bbva-button-default--_ambient--positive-bg-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-bg-color-disabled,
      ${W("colorPrimaryAltCtaDisabledBackground",U)}
    );

    /* Alert styles */
    --bbva-button-default--_ambient--alert-secondary-color: var(
      --bbva-button-default--custom--primary-alt-ambient-alert-secondary-color,
      ${W("colorPrimaryAltLinkInverseDefault",U)}
    );

    --bbva-button-default--_ambient--alert-secondary-bg-color: var(
      --bbva-button-default--custom--primary-alt-ambient-alert-secondary-bg-color,
      ${W("colorPrimarySurfaceAmbientDefault",U)}
    );

    --bbva-button-default--_ambient--alert-secondary-bg-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient-alert-secondary-bg-color-active,
      ${W("colorPrimarySurfaceAlternativeDefault",U)}
    );

    --bbva-button-default--_ambient--alert-secondary-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient-alert-secondary-color-disabled,
      ${W("colorPrimaryAltCtaDisabledText",U)}
    );

    --bbva-button-default--_ambient--alert-secondary-bg-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--bg-color-disabled,
      ${W("colorPrimaryAltCtaDisabledBackground",U)}
    );

    /* Icon styles */
    --bbva-button-default--_ambient--icon-background: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-background,
      ${W("colorPrimaryAltCtaMainBackgroundDefault",U)}
    );

    --bbva-button-default--_ambient--icon-background-active: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-background-active,
      ${W("colorPrimaryAltCtaMainBackgroundPressed",U)}
    );

    --bbva-button-default--_ambient--icon-background-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-background-disabled,
      ${W("colorPrimaryAltCtaDisabledBackground",U)}
    );

    --bbva-button-default--_ambient--icon-color: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-color,
      ${W("colorPrimaryAltCtaMainTextDefault",U)}
    );

    --bbva-button-default--_ambient--icon-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-color-active,
      ${W("colorPrimaryAltCtaMainTextPressed",U)}
    );

    --bbva-button-default--_ambient--icon-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-color-disabled,
      ${W("colorPrimaryAltCtaDisabledText",U)}
    );

    /* Interactive */
    --bbva-button-default--_ambient--interaction-bg-color: var(
      --bbva-button-default--custom--primary-alt-ambient--interaction-bg-color,
      ${W("colorPrimaryAltCtaMainBackgroundDefault",U)}
    );

    --bbva-button-default--_ambient--interaction-icon-color: var(
      --bbva-button-default--custom--primary-alt-ambient--interaction-icon-color,
      ${W("colorPrimaryAltCtaMainTextDefault",U)}
    );

    --bbva-button-default--_ambient--interaction-border-color: var(
      --bbva-button-default--custom--primary-alt-ambient--interaction-border-color,
      transparent
    );

    --bbva-button-default--_ambient--interaction-bg-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--interaction-bg-color-active,
      ${W("colorPrimaryAltCtaMainBackgroundPressed",U)}
    );

    --bbva-button-default--_ambient--interaction-disabled-bg-color: var(
      --bbva-button-default--custom--primary-alt-ambient--interaction-disabled-bg-color,
      ${W("colorPrimaryAltCtaDisabledBackground",U)}
    );
  }
`,Ht=r`
  /* Default styles */
  /* Static */
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-button-default--_ambient--color: var(
      --bbva-button-default--custom--secondary-ambient--color,
      ${W("colorSecondaryCtaMainTextDefault",U)}
    );

    --bbva-button-default--_ambient--focus-border-color: var(
      --bbva-button-default--custom--secondary-ambient--focus-border-color,
      ${W("colorSecondarySurfaceAmbientFocus",U)}
    );

    --bbva-button-default--_ambient--bg-color: var(
      --bbva-button-default--custom--secondary-ambient--bg-color,
      ${W("colorSecondaryCtaMainBackgroundDefault",U)}
    );

    --bbva-button-default--_ambient--color-active: var(
      --bbva-button-default--custom--secondary-ambient--color-active,
      ${W("colorSecondaryCtaMainTextDefault",U)}
    );

    --bbva-button-default--_ambient--bg-color-active: var(
      --bbva-button-default--custom--secondary-ambient--bg-color-active,
      ${W("colorSecondaryCtaMainBackgroundPressed",U)}
    );

    --bbva-button-default--_ambient--bg-color-disabled: var(
      --bbva-button-default--custom--secondary-ambient--bg-color-disabled,
      ${W("colorSecondaryCtaDisabledBackground",U)}
    );

    --bbva-button-default--_ambient--color-disabled: var(
      --bbva-button-default--custom--secondary-ambient--color-disabled,
      ${W("colorSecondaryCtaDisabledText",U)}
    );
    /* Secondary styles */
    --bbva-button-default--_ambient--secondary-color: var(
      --bbva-button-default--custom--secondary-ambient--secondary-color,
      ${W("colorSecondaryCtaComplementaryTextDefault",U)}
    );

    --bbva-button-default--_ambient--secondary-bg-color: var(
      --bbva-button-default--custom--secondary-ambient--secondary-bg-color,
      transparent
    );

    --bbva-button-default--_ambient--secondary-border-color: var(
      --bbva-button-default--custom--secondary-ambient--secondary-border-color,
      ${W("colorSecondaryCtaComplementaryBorderDefault",U)}
    );

    --bbva-button-default--_ambient--secondary-color-active: var(
      --bbva-button-default--custom--secondary-ambient--color-active,
      ${W("colorSecondaryCtaComplementaryTextPressed",U)}
    );

    --bbva-button-default--_ambient--secondary-bg-color-active: var(
      --bbva-button-default--custom--secondary-ambient--secondary-bg-color-active,
      ${W("colorSecondaryCtaComplementaryBackgroundPressed",U)}
    );

    --bbva-button-default--_ambient--secondary-color-disabled: var(
      --bbva-button-default--custom--secondary-ambient--secondary-color-disabled,
      ${W("colorSecondaryCtaDisabledText",U)}
    );

    --bbva-button-default--_ambient--secondary-bg-color-disabled: var(
      --bbva-button-default--custom--secondary-ambient--secondary-bg-color-disabled,
      ${W("colorSecondaryCtaDisabledBackground",U)}
    );

    /* Link styles */
    --bbva-button-default--_ambient--link-color: var(
      --bbva-button-default--custom--secondary-ambient--link-color,
      ${W("colorSecondaryLinkMainDefault",U)}
    );

    --bbva-button-default--_ambient--link-color-active: var(
      --bbva-button-default--custom--secondary-ambient--link-color-active,
      ${W("colorSecondaryLinkMainPressed",U)}
    );

    --bbva-button-default--_ambient--link-color-disabled: var(
      --bbva-button-default--custom--secondary-ambient--link-color-disabled,
      ${W("colorSecondaryCtaDisabledText",U)}
    );

    /* Icon no-background styles */
    --bbva-button-default--_ambient--icon-no-background-color: var(
      --bbva-button-default--custom--secondary-ambient--icon-no-background-color,
      ${W("colorSecondaryLinkMainDefault",U)}
    );

    --bbva-button-default--_ambient--icon-no-background-color-active: var(
      --bbva-button-default--custom--secondary-ambient--icon-no-background-color-active,
      ${W("colorSecondaryLinkMainPressed",U)}
    );

    /* Icon no-background alternative styles */

    --bbva-button-default--_ambient--icon-no-background-alternative-color: var(
      --bbva-button-default--custom--secondary-ambient--icon-no-background-alternative-color,
      ${W("colorSecondaryLinkComplementaryDefault",U)}
    );

    --bbva-button-default--_ambient--icon-no-background-alternative-color-active: var(
      --bbva-button-default--custom--secondary-ambient--icon-no-background-alternative-color-active,
      ${W("colorSecondaryLinkComplementaryPressed",U)}
    );

    /* Positive styles */
    --bbva-button-default--_ambient--positive-color: var(
      --bbva-button-default--custom--secondary-ambient--positive-color,
      ${W("colorSecondaryCtaPositiveTextDefault",U)}
    );

    --bbva-button-default--_ambient--positive-bg-color: var(
      --bbva-button-default--custom--secondary-ambient--positive-bg-color,
      ${W("colorSecondaryCtaPositiveBackgroundDefault",U)}
    );

    --bbva-button-default--_ambient--positive-color-active: var(
      --bbva-button-default--custom--secondary-ambient--positive-color-active,
      ${W("colorSecondaryCtaPositiveTextPressed",U)}
    );

    --bbva-button-default--_ambient--positive-bg-color-active: var(
      --bbva-button-default--custom--secondary-ambient--positive-bg-color-active,
      ${W("colorSecondaryCtaPositiveBackgroundPressed",U)}
    );

    --bbva-button-default--_ambient--positive-color-disabled: var(
      --bbva-button-default--custom--secondary-ambient--positive-color-disabled,
      ${W("colorSecondaryCtaDisabledText",U)}
    );

    --bbva-button-default--_ambient--positive-bg-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-bg-color-disabled,
      ${W("colorSecondaryCtaDisabledBackground",U)}
    );

    /* Alert styles */
    --bbva-button-default--_ambient--alert-secondary-color: var(
      --bbva-button-default--custom--secondary-ambient--alert-secondary-color,
      ${W("colorSecondaryLinkInverseDefault",U)}
    );

    --bbva-button-default--_ambient--alert-secondary-bg-color: var(
      --bbva-button-default--custom--secondary-ambient--alert-secondary-bg-color,
      ${W("colorSecondarySurfaceAlternativeDefault",U)}
    );

    --bbva-button-default--_ambient--alert-secondary-color-active: var(
      --bbva-button-default--custom--secondary-ambient--alert-secondary-active-color,
      ${W("colorSecondaryLinkInversePressed",U)}
    );

    --bbva-button-default--_ambient--alert-secondary-bg-color-active: var(
      --bbva-button-default--custom--secondary-ambient--alert-secondary-active-bg-color,
      ${W("colorSecondarySurfaceAlternativePressed",U)}
    );

    /* Icon styles */
    --bbva-button-default--_ambient--icon-background: var(
      --bbva-button-default--custom--secondary-ambient--icon-background,
      ${W("colorSecondaryCtaMainBackgroundDefault",U)}
    );

    --bbva-button-default--_ambient--icon-background-active: var(
      --bbva-button-default--custom--secondary-ambient--icon-background-active,
      ${W("colorSecondaryCtaMainBackgroundPressed",U)}
    );

    --bbva-button-default--_ambient--icon-color-active: var(
      --bbva-button-default--custom--secondary-ambient--icon-color-active,
      ${W("colorSecondaryCtaMainTextPressed",U)}
    );

    --bbva-button-default--_ambient--icon-background-disabled: var(
      --bbva-button-default--custom--secondary-ambient--icon-background-disabled,
      ${W("colorSecondaryCtaDisabledBackground",U)}
    );

    --bbva-button-default--_ambient--icon-color: var(
      --bbva-button-default--custom--secondary-ambient--icon-color,
      ${W("colorSecondaryCtaMainTextDefault",U)}
    );

    --bbva-button-default--_ambient--icon-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-color-disabled,
      ${W("colorSecondaryCtaDisabledText",U)}
    );

    /* Interactive styles */
    --bbva-button-default--_ambient--interaction-bg-color: var(
      --bbva-button-default--custom--secondary-ambient--interaction-bg-color,
      ${W("colorSecondaryCtaMainBackgroundDefault",U)}
    );

    --bbva-button-default--_ambient--interaction-icon-color: var(
      --bbva-button-default--custom--secondary-ambient--interaction-icon-color,
      ${W("colorSecondaryCtaMainTextDefault",U)}
    );

    --bbva-button-default--_ambient--interaction-border-color: var(
      --bbva-button-default--custom--secondary-ambient--interaction-border-color,
      transparent
    );

    --bbva-button-default--_ambient--interaction-bg-color-active: var(
      --bbva-button-default--custom--secondary-ambient--interaction-bg-color-active,
      ${W("colorSecondaryCtaMainBackgroundPressed",U)}
    );

    --bbva-button-default--_ambient--interaction-disabled-bg-color: var(
      --bbva-button-default--custom--secondary-ambient--interaction-disabled-bg-color,
      ${W("colorSecondaryCtaDisabledBackground",U)}
    );
  }
`,Ft=r`
  /* Default styles */
  /* Static */
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-button-default--_ambient--color: var(
      --bbva-button-default--custom--secondary-alt-ambient--color,
      ${W("colorSecondaryAltCtaMainTextDefault",U)}
    );

    --bbva-button-default--_ambient--focus-border-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--focus-border-color,
      ${W("colorSecondaryAltSurfaceAmbientFocus",U)}
    );

    --bbva-button-default--_ambient--bg-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--bg-color,
      ${W("colorSecondaryAltCtaMainBackgroundDefault",U)}
    );

    --bbva-button-default--_ambient--color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--color-active,
      ${W("colorSecondaryAltCtaMainTextDefault",U)}
    );

    --bbva-button-default--_ambient--bg-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--bg-color-active,
      ${W("colorSecondaryAltCtaMainBackgroundPressed",U)}
    );

    --bbva-button-default--_ambient--bg-color-disabled: var(
      --bbva-button-default--custom--secondary-alt-ambient--bg-color-disabled,
      ${W("colorSecondaryAltCtaDisabledBackground",U)}
    );

    --bbva-button-default--_ambient--color-disabled: var(
      --bbva-button-default--custom--secondary-alt-ambient--color-disabled,
      ${W("colorSecondaryAltCtaDisabledText",U)}
    );

    /* Secondary styles */
    --bbva-button-default--_ambient--secondary-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--secondary-color,
      ${W("colorSecondaryAltCtaComplementaryTextDefault",U)}
    );

    --bbva-button-default--_ambient--secondary-bg-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--secondary-bg-color,
      transparent
    );

    --bbva-button-default--_ambient--secondary-border-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--secondary-border-color,
      ${W("colorSecondaryAltCtaComplementaryBorderDefault",U)}
    );

    --bbva-button-default--_ambient--secondary-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--secondary-color-active,
      ${W("colorSecondaryAltCtaComplementaryTextPressed",U)}
    );

    --bbva-button-default--_ambient--secondary-bg-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--secondary-bg-color-active,
      ${W("colorSecondaryAltCtaComplementaryBackgroundPressed",U)}
    );

    --bbva-button-default--_ambient--secondary-color-disabled: var(
      --bbva-button-default--custom--secondary-alt-ambient--secondary-color-disabled,
      ${W("colorSecondaryAltCtaDisabledText",U)}
    );

    --bbva-button-default--_ambient--secondary-bg-color-disabled: var(
      --bbva-button-default--custom--secondary-alt-ambient--secondary-bg-color-disabled,
      ${W("colorSecondaryAltCtaDisabledBackground",U)}
    );

    /* Link styles */
    --bbva-button-default--_ambient--link-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--link-color,
      ${W("colorSecondaryAltLinkMainDefault",U)}
    );

    --bbva-button-default--_ambient--link-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--link-color-active,
      ${W("colorSecondaryAltLinkMainPressed",U)}
    );

    --bbva-button-default--_ambient--link-color-disabled: var(
      --bbva-button-default--custom--secondary-alt-ambient--link-color-disabled,
      ${W("colorSecondaryAltCtaDisabledText",U)}
    );

    /* Icon no-background styles */
    --bbva-button-default--_ambient--icon-no-background-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-no-background-color,
      ${W("colorSecondaryAltLinkMainDefault",U)}
    );

    --bbva-button-default--_ambient--icon-no-background-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-no-background-color-active,
      ${W("colorSecondaryAltLinkMainPressed",U)}
    );

    /* Icon no-background alternative styles */

    --bbva-button-default--_ambient--icon-no-background-alternative-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-no-background-alternative-color,
      ${W("colorSecondaryAltLinkComplementaryDefault",U)}
    );

    --bbva-button-default--_ambient--icon-no-background-alternative-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-no-background-alternative-color-active,
      ${W("colorSecondaryAltLinkComplementaryPressed",U)}
    );

    /* Positive styles */
    --bbva-button-default--_ambient--positive-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--positive-color,
      ${W("colorSecondaryAltCtaPositiveTextDefault",U)}
    );

    --bbva-button-default--_ambient--positive-bg-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--positive-bg-color,
      ${W("colorSecondaryCtaPositiveBackgroundDefault",U)}
    );

    --bbva-button-default--_ambient--positive-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--positive-color-active,
      ${W("colorSecondaryAltCtaPositiveTextPressed",U)}
    );

    --bbva-button-default--_ambient--positive-bg-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--positive-bg-color-active,
      ${W("colorSecondaryAltCtaPositiveBackgroundPressed",U)}
    );

    --bbva-button-default--_ambient--positive-color-disabled: var(
      --bbva-button-default--custom--secondary-alt-ambient--positive-color-disabled,
      ${W("colorSecondaryAltCtaDisabledText",U)}
    );

    --bbva-button-default--_ambient--positive-bg-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-bg-color-disabled,
      ${W("colorSecondaryAltCtaDisabledBackground",U)}
    );

    /* Alert styles */
    --bbva-button-default--_ambient--alert-secondary-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--alert-secondary-color,
      ${W("colorSecondaryAltLinkInverseDefault",U)}
    );

    --bbva-button-default--_ambient--alert-secondary-bg-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--alert-secondary-bg-color,
      ${W("colorSecondaryAltSurfaceAlternativeDefault",U)}
    );

    --bbva-button-default--_ambient--alert-secondary-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--alert-secondary-active-color,
      ${W("colorSecondaryAltLinkInversePressed",U)}
    );

    --bbva-button-default--_ambient--alert-secondary-bg-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--alert-secondary-active-bg-color,
      ${W("colorSecondaryAltSurfaceAlternativePressed",U)}
    );

    /* Icon styles*/
    --bbva-button-default--_ambient--icon-background: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-background,
      ${W("colorSecondaryAltCtaMainBackgroundDefault",U)}
    );

    --bbva-button-default--_ambient--icon-background-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-background-active,
      ${W("colorSecondaryAltCtaMainBackgroundPressed",U)}
    );

    --bbva-button-default--_ambient--icon-background-disabled: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-background-disabled,
      ${W("colorSecondaryAltCtaDisabledBackground",U)}
    );

    --bbva-button-default--_ambient--icon-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-color,
      ${W("colorSecondaryAltCtaMainTextDefault",U)}
    );

    --bbva-button-default--_ambient--icon-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-color-active,
      ${W("colorSecondaryAltCtaMainTextPressed",U)}
    );

    --bbva-button-default--_ambient--icon-color-disabled: var(
      --bbva-button-default--custom--secondary-ambient--icon-color-disabled,
      ${W("colorSecondaryAltCtaDisabledText",U)}
    );

    /* Interactive styles */
    --bbva-button-default--_ambient--interaction-bg-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--interaction-bg-color,
      ${W("colorSecondaryAltCtaMainBackgroundDefault",U)}
    );

    --bbva-button-default--_ambient--interaction-icon-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--interaction-icon-color,
      ${W("colorSecondaryAltCtaMainTextDefault",U)}
    );

    --bbva-button-default--_ambient--interaction-border-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--interaction-border-color,
      transparent
    );

    --bbva-button-default--_ambient--interaction-bg-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--interaction-bg-color-active,
      ${W("colorSecondaryAltCtaMainBackgroundPressed",U)}
    );

    --bbva-button-default--_ambient--interaction-disabled-bg-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--interaction-disabled-bg-color,
      ${W("colorSecondaryAltCtaDisabledBackground",U)}
    );
  }
`;const Gt=X([Object.freeze({__proto__:null,primary:qt,primaryAlt:jt,secondary:Ht,secondaryAlt:Ft}),K,Y]),Wt=Object.values(Gt);var Ut=r`
:host {
  position: relative;
  min-width: var(--button-default-min-width, 8rem);
  max-width: 100%;
  height: 3rem;
  box-sizing: border-box;
  padding: 0.75rem 2rem;
  border: none;
  border-radius: var(--button-default-border-radius, var(--borderRadiusSmall, ${b(C.small)}));
  margin-left: var(--button-default-margin-left, 0);
  background-color: var(--_button-default-bg-color);
  color: var(--_button-default-color);
  text-align: center;
  transition: background-color 0.15s ease-out;
  transition-timing-function: cubic-bezier(0, 0, 0.1, 1);
}
:host [data-tag-name=bbva-type-text] {
  color: var(--_button-default-color);
}
:host [data-tag-name=bbva-type-icon] {
  fill: var(--_button-default-color);
}

:host([fullwidth]) {
  width: 100%;
}

.text {
  display: block;
}
.text.ellipsis {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
.text.slot-text {
  font-size: var(--typographyTypeSmall, ${b(u.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${b(v.typeSmall)});
}

:host([variant=alert]),
:host([variant=alert-secondary]),
:host([variant=alert-positive]) {
  height: 2.5rem;
}
:host([variant=alert]) .icon,
:host([variant=alert-secondary]) .icon,
:host([variant=alert-positive]) .icon {
  min-width: 1rem;
  margin-right: 0.5rem;
}

:host,
[data-tag-name=bbva-type-text] {
  font-style: var(--button-default-font-weight, var(--fontFacePrimaryMediumFontStyle, ${b(h.medium.fontStyle)}));
  font-weight: var(--button-default-font-weight, var(--fontFacePrimaryMediumFontWeight, ${b(h.medium.fontWeight)}));
}

.wrapper {
  display: contents;
}

button {
  box-sizing: border-box;
  padding: 0;
}

:host([focus-visible]:not([aria-disabled=true])) {
  box-shadow: none;
}

:host([focus-visible]) {
  border-radius: 0 !important;
  outline: 2px solid var(--_button-default-focus-border-color);
  outline-offset: 4px;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

:host(:not([href])) {
  padding: 0.75rem 2rem;
  border: none;
  border-radius: var(--button-default-border-radius, var(--borderRadiusSmall, ${b(C.small)}));
  color: var(--_button-default-color);
}
:host(:not([href])):host([variant=alert]), :host(:not([href])):host([variant=alert-secondary]), :host(:not([href])):host([variant=alert-positive]) {
  padding: 0.5rem 1rem;
}

:host([size=L]:not([href]):not([variant=icon]):not([variant=alert]):not([variant=alert-positive]):not([variant=alert-secondary])) {
  height: 3.5rem;
  padding: 1rem 2rem;
}

:host([aria-disabled=true]) {
  transition: background-color 0.15s ease-in-out;
  transition-timing-function: cubic-bezier(0.2, 0, 0.1, 1);
}
:host([aria-disabled=true]) .text, :host([aria-disabled=true]) [data-tag-name=bbva-type-text] {
  color: var(--_button-default-color-disabled);
  transition: color 0.15s ease-in-out;
  transition-timing-function: cubic-bezier(0.2, 0, 0.1, 1);
}

:host([variant=icon]:not([href])) {
  border: none;
  border-radius: var(--button-default-icon-border-radius, var(--borderRadiusSmall, ${b(C.small)}));
  background-color: var(--_button-default-icon-background);
}
:host([variant=icon]:not([href])) [data-tag-name=bbva-type-icon] {
  fill: var(--_button-default-icon-color);
}

:host([variant~=icon][variant~=no-background][variant~=alternative]:not([href])) [data-tag-name=bbva-type-icon] {
  fill: var(--_button-default-icon-no-background-alternative-color);
}

:host([variant~=icon][variant~=no-background][variant~=alternative][active]:not([href])[active]:not([href])[active]:not([disabled])) [data-tag-name=bbva-type-icon],
:host([variant~=icon][variant~=no-background][variant~=alternative]:host(:hover)) [data-tag-name=bbva-type-icon] {
  fill: var(--_button-default-icon-no-background-alternative-color-active);
}

:host([variant~=no-background][focus-visible]) {
  outline-offset: --bbva-button-default-icon-no-bg-offset, 4px;
}

:host([variant~=icon][variant~=no-background][loading]) {
  cursor: default;
  pointer-events: none;
}
:host([variant~=icon][variant~=no-background][loading]) [data-tag-name=bbva-type-icon] {
  min-width: auto;
}

:host([variant=icon][disabled]) {
  border: none;
  background-color: var(--_button-default-icon-background-disabled);
}
:host([variant=icon][disabled]) [data-tag-name=bbva-type-icon] {
  fill: var(--_button-default-icon-color-disabled);
}

:host([variant=icon][active]),
:host([variant=icon]:host(:hover)) {
  border: none;
  border-radius: var(--button-default-icon-border-radius, var(--borderRadiusSmall, ${b(C.small)}));
  background-color: var(--_button-default-icon-background-active);
}
:host([variant=icon][active]) [data-tag-name=bbva-type-icon],
:host([variant=icon]:host(:hover)) [data-tag-name=bbva-type-icon] {
  fill: var(--_button-default-icon-color-active);
}

:host(:not([href])[active]:not([aria-disabled=true])), :host(:not([href]):host(:hover)) {
  background-color: var(--_button-default-bg-color-active);
  color: var(--_button-default-color-active);
}

:host(:not([href])[active]),
:host([variant=alert]:not([href])[active]) {
  background-color: var(--_button-default-bg-color-active);
  color: var(--_button-default-color-active);
}

:host([active]),
:host([variant=alert][active]),
:host([variant=alert]:host(:hover)) {
  background-color: var(--_button-default-bg-color-active);
  color: var(--_button-default-color-active);
  transition: background-color 0.15s ease-in-out;
  transition-timing-function: cubic-bezier(0.2, 0, 0.1, 1);
}

:host([variant=secondary]) {
  border: 0.0625rem solid var(--_button-default-secondary-border-color);
  background-color: var(--_button-default-secondary-bg-color);
  color: var(--_button-default-secondary-color);
}
:host([variant=secondary]) [data-tag-name=bbva-type-text] {
  color: var(--_button-default-secondary-color);
}
:host([variant=secondary]) [data-tag-name=bbva-type-icon] {
  fill: var(--_button-default-secondary-color);
}

:host([variant=alert-secondary]) {
  background-color: var(--_button-default-alert-secondary-bg-color);
  color: var(--_button-default-alert-secondary-color);
}
:host([variant=alert-secondary]) [data-tag-name=bbva-type-text] {
  color: var(--_button-default-alert-secondary-color);
}
:host([variant=alert-secondary]) [data-tag-name=bbva-type-icon] {
  fill: var(--_button-default-alert-secondary-color);
}

:host([variant=positive]),
:host([variant=alert-positive]) {
  background-color: var(--_button-default-positive-bg-color);
  color: var(--_button-default-positive-color);
}
:host([variant=positive]) [data-tag-name=bbva-type-text],
:host([variant=alert-positive]) [data-tag-name=bbva-type-text] {
  color: var(--_button-default-positive-color);
}
:host([variant=positive]) [data-tag-name=bbva-type-icon],
:host([variant=alert-positive]) [data-tag-name=bbva-type-icon] {
  fill: var(--_button-default-positive-color);
}

:host([variant=link]) {
  background-color: transparent;
  color: var(--_button-default-link-color);
}
:host([variant=link]) [data-tag-name=bbva-type-text] {
  color: var(--_button-default-link-color);
}

:host([variant=link][active]),
:host([variant=link]:host(:hover)),
:host([variant=link][active]:not([aria-disabled=true])) {
  border: none;
  background-color: transparent;
  color: var(--_button-default-link-color-active);
}
:host([variant=link][active]) [data-tag-name=bbva-type-text],
:host([variant=link]:host(:hover)) [data-tag-name=bbva-type-text],
:host([variant=link][active]:not([aria-disabled=true])) [data-tag-name=bbva-type-text] {
  color: var(--_button-default-link-color-active);
}

:host([variant=link][aria-disabled=true]) [data-tag-name=bbva-type-text] {
  color: var(--_button-default-link-color-disabled);
}

:host([aria-disabled=true]),
:host([variant=alert][aria-disabled=true]) {
  background-color: var(--_button-default-bg-color-disabled);
}
:host([aria-disabled=true]) [data-tag-name=bbva-type-icon],
:host([variant=alert][aria-disabled=true]) [data-tag-name=bbva-type-icon] {
  fill: var(--_button-default-color-disabled);
}

:host([variant=secondary][active]),
:host([variant=secondary]:host(:hover)),
:host([variant=secondary][active]:not([aria-disabled=true])) {
  border: none;
  background-color: var(--_button-default-secondary-bg-color-active);
  color: var(--_button-default-secondary-color-active);
}
:host([variant=secondary][active]) [data-tag-name=bbva-type-text],
:host([variant=secondary]:host(:hover)) [data-tag-name=bbva-type-text],
:host([variant=secondary][active]:not([aria-disabled=true])) [data-tag-name=bbva-type-text] {
  color: var(--_button-default-secondary-color-active);
}
:host([variant=secondary][active]) [data-tag-name=bbva-type-icon],
:host([variant=secondary]:host(:hover)) [data-tag-name=bbva-type-icon],
:host([variant=secondary][active]:not([aria-disabled=true])) [data-tag-name=bbva-type-icon] {
  fill: var(--_button-default-secondary-color-active);
}

:host([variant=alert-secondary][active]),
:host([variant=alert-secondary]:host(:hover)),
:host([variant=alert-secondary][active]:not([aria-disabled=true])) {
  border-color: transparent;
  background-color: var(--_button-default-alert-secondary-bg-color-active);
  color: var(--_button-default-alert-secondary-color-active);
}
:host([variant=alert-secondary][active]) [data-tag-name=bbva-type-text],
:host([variant=alert-secondary]:host(:hover)) [data-tag-name=bbva-type-text],
:host([variant=alert-secondary][active]:not([aria-disabled=true])) [data-tag-name=bbva-type-text] {
  color: var(--_button-default-alert-secondary-color-active);
}
:host([variant=alert-secondary][active]) [data-tag-name=bbva-type-icon],
:host([variant=alert-secondary]:host(:hover)) [data-tag-name=bbva-type-icon],
:host([variant=alert-secondary][active]:not([aria-disabled=true])) [data-tag-name=bbva-type-icon] {
  fill: var(--_button-default-alert-secondary-color-active);
}

:host([variant=secondary][aria-disabled=true]),
:host([variant=alert-secondary][aria-disabled=true]) {
  border: none;
  background-color: var(--_button-default-secondary-bg-color-disabled);
}
:host([variant=secondary][aria-disabled=true]) [data-tag-name=bbva-type-text],
:host([variant=alert-secondary][aria-disabled=true]) [data-tag-name=bbva-type-text] {
  color: var(--_button-default-color-disabled);
}

:host([variant=positive][active]),
:host([variant=alert-positive][active]),
:host([variant=positive]:host(:hover)),
:host([variant=alert-positive]:host(:hover)),
:host([variant=positive][active]:not([aria-disabled=true])),
:host([variant=alert-positive][active]:not([aria-disabled=true])) {
  background-color: var(--_button-default-positive-bg-color-active);
  color: var(--_button-default-positive-color-active);
}

:host([variant=positive][aria-disabled=true]),
:host([variant=alert-positive][aria-disabled=true]) {
  background-color: var(--_button-default-positive-bg-color-disabled);
  color: var(--_button-default-positive-color-disabled);
}

:host([variant~=icon][variant~=no-background]:not([href])) {
  width: 2.5rem;
  height: 2.5rem;
  padding: var(--bbva-button-default-icon-no-bg-padding, 0.25rem);
  background: transparent;
  --button-default-min-width: rem(40px);
}
:host([variant~=icon][variant~=no-background]:not([href])) [data-tag-name=bbva-type-icon] {
  fill: var(--_button-default-icon-no-background-color);
}

:host([variant=icon]:not([href])[disabled]) {
  border: none;
  background-color: var(--_button-default-icon-background-disabled);
}
:host([variant=icon]:not([href])[disabled]) [data-tag-name=bbva-type-icon] {
  fill: var(--_button-default-icon-color-disabled);
}

:host([variant~=icon]) {
  display: inline-flex;
  min-width: var(--button-default-min-width, 3rem);
  max-width: var(--button-default-min-width, 3rem);
  box-sizing: border-box;
  align-items: center;
  justify-content: center;
  padding: 0.75rem;
}

:host([variant~=icon][icon-size="32"]) {
  padding: 0.5rem;
}

:host([variant=icon]:not([href])[active]),
:host([variant=icon]:not([href])[active]:not([disabled])) {
  border: none;
  border-radius: var(--button-default-icon-border-radius, var(--borderRadiusSmall, ${b(C.small)}));
  background-color: var(--_button-default-icon-background-active);
}
:host([variant=icon]:not([href])[active]) [data-tag-name=bbva-type-icon],
:host([variant=icon]:not([href])[active]:not([disabled])) [data-tag-name=bbva-type-icon] {
  fill: var(--_button-default-icon-color-active);
}

:host([variant=icon][hidden]),
[hidden] {
  display: none !important;
}

:host([variant~=icon][variant~=no-background][disabled]:not([href])[disabled]) {
  opacity: 0.4;
}

:host([variant~=icon][variant~=no-background][active]:not([href])[active]:not([href])[active]:not([disabled])) [data-tag-name=bbva-type-icon],
:host([variant~=icon][variant~=no-background]:host(:hover)) [data-tag-name=bbva-type-icon] {
  fill: var(--_button-default-icon-no-background-color-active);
}

:host([variant~=interaction]) {
  right: 0;
  display: inline-flex;
  min-width: var(--button-default-min-width, 3rem);
  max-width: var(--button-default-max-width, 3rem);
  box-sizing: border-box;
  align-items: center;
  justify-content: center;
  padding: 0;
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

.transcript {
  padding: 0.75rem;
  border: 0;
}

.action::before {
  position: absolute;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  display: block;
  background-color: var(--_button-default-interaction-bg-color);
  content: "";
}
:host([variant~=interaction][talking]) .action::before {
  background-color: transparent;
}
.action-icon {
  position: relative;
  fill: var(--_button-default-interaction-icon-color);
}
:host([variant~=interaction][disabled]) .action {
  cursor: default;
  pointer-events: none;
}
:host([variant~=interaction][disabled]) .action-icon {
  color: var(--_button-default-interaction-disabled-icon-color);
}
:host([variant~=interaction][disabled]) .action::before {
  background-color: var(--_button-default-interaction-disabled-bg-color);
}
.action-glow .before {
  position: absolute;
  top: 50%;
  left: 50%;
  display: none;
  width: 6rem;
  height: 6rem;
  border-radius: 50%;
  animation: lowerpulse 2s infinite;
  animation-play-state: paused;
  background-color: var(--_button-default-interaction-bg-color);
  opacity: 0.4;
  transform: translate(-50%, -50%) scale(1);
}
:host([variant~=interaction][talking]) .action-glow .before, :host(:hover[variant~=interaction]) .action-glow .before {
  display: block;
  animation-play-state: running;
}
:host([variant~=interaction]:not([talking])) .action-glow .before {
  animation: animationempty;
}
.action-glow .after {
  position: absolute;
  top: 50%;
  left: 50%;
  display: none;
  width: 5rem;
  height: 5rem;
  border-radius: 50%;
  animation: upperpulse 2s infinite;
  animation-play-state: paused;
  background-color: var(--_button-default-interaction-bg-color-active);
  transform: translate(-50%, -50%) scale(1);
}
:host([variant~=interaction][talking]) .action-glow .after, :host(:hover[variant~=interaction]) .action-glow .after {
  display: block;
  animation-play-state: running;
}
:host([variant~=interaction]:not([talking])) .action-glow .after {
  animation: animationempty;
}

/* MIC LISTENING ANIMATION */
@keyframes lowerpulse {
  0% {
    opacity: 0;
    transform: translate(-50%, -50%) scale(0);
  }
  50% {
    opacity: 0.4;
    transform: translate(-50%, -50%) scale(1);
  }
  100% {
    opacity: 0;
    transform: translate(-50%, -50%) scale(0);
  }
}
@keyframes upperpulse {
  0% {
    transform: translate(-50%, -50%) scale(0.83);
  }
  50% {
    transform: translate(-50%, -50%) scale(1);
  }
  100% {
    transform: translate(-50%, -50%) scale(0.83);
  }
}
@keyframes animationempty {
  0%, 100% {
    display: block;
  }
}
`;class Xt extends(Z(o(E))){static get is(){return"bbva-button-default"}static get properties(){return{text:{type:String},icon:{type:String},buttonTranscriptLabel:{type:String,attribute:"button-transcript-label"},interaction:{type:Boolean},size:{type:String},keepTalkingAnimation:{type:Boolean,attribute:"keep-talking-animation"},iconTalkingAnimation:{type:String,attribute:"icon-talking-animation"},fullwidth:{type:Boolean,attribute:"fullwidth",reflect:!0},hasEllipsis:{type:Boolean,attribute:"has-ellipsis"},variant:{type:String},iconSize:{type:String,attribute:"icon-size"},loading:{type:Boolean,reflect:!0},hideIconAlert:{type:Boolean,reflect:!0,attribute:"hide-icon-alert"}}}static get scopedElements(){return{"bbva-type-icon":ie,"bbva-type-text":G}}constructor(){super(),this.type="button",this.buttonTranscriptLabel="bbva-button-default-interaction-record-button",this.interaction=!1,this.size="",this.keepTalkingAnimation=!1,this.iconTalkingAnimation=T(),this.fullwidth=!1,this.hasEllipsis=!1,this.variant="",this.iconSize="24",this.loading=!1,this.hideIconAlert=!1,delete this.href}static get styles(){return[super.styles,zt,Ut,Wt,l("bbva-button-default-shared-styles")]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._endRecord=this._endRecord.bind(this),this.interaction&&(this.addEventListener("mousedown",this._startRecord),this.addEventListener("keydown",this._keydownRecord),this.addEventListener("keyup",this._keyupRecord),this.addEventListener("blur",this._endRecord))}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),document.removeEventListener("mouseup",this._endRecord),this.removeEventListener("mousedown",this._startRecord),this.removeEventListener("keydown",this._keydownRecord),this.removeEventListener("keyup",this._keyupRecord),this.removeEventListener("blur",this._endRecord)}_startRecord(){document.addEventListener("mouseup",this._endRecord),this._talking=!0,this.keepTalkingAnimation&&(this.icon=this.iconTalkingAnimation)}set _talking(e){e!==this._isTalking&&(e?(this.setAttribute("talking",""),this.dispatchEvent(new CustomEvent("button-interaction-mic-request",{detail:!0,composed:!0,bubbles:!0}))):(this.removeAttribute("talking"),this.dispatchEvent(new CustomEvent("button-interaction-mic-cancel",{detail:!0,composed:!0,bubbles:!0}))),this._isTalking=e,this.requestUpdate())}get _talking(){return this._isTalking}_keydownRecord(e){32!==e.keyCode&&13!==e.keyCode||this._startRecord()}_keyupRecord(e){32!==e.keyCode&&13!==e.keyCode||this._endRecord()}_endRecord(){document.removeEventListener("mouseup",this._endRecord);this._isTalkingAnimation||!this.keepTalkingAnimation?(this._talking=!1,this._isTalkingAnimation=!1,this.icon=L()):this._isTalkingAnimation=!0}get _icon(){return n`
      <bbva-type-icon
        class="icon"
        icon="${this.icon?this.icon:_()}"
        size="${this._setIconSize}"
        ?loading="${this.isLoading}"
      ></bbva-type-icon>
    `}get _setIconSize(){if(this.variant.includes("alert"))return 16;const e={16:16,24:24,32:32};return this.variant.includes("no-background")&&e[this.iconSize]||e[24]}get isLoading(){return Boolean(this.loading&&this.variant&&this.variant.includes("icon")&&this.variant.includes("no-background"))}get _text(){return void 0!==this.text?n`
          <bbva-type-text
            class="text"
            tag="span"
            size="S"
            .text=${this.text}
            ?ellipsis="${this.hasEllipsis}"
            alignment="center"
          ></bbva-type-text>
        `:n` <slot class="text slot-text ${this.hasEllipsis?"ellipsis":""}"></slot> `}get _interaction(){return n`
      <div class="action transcript">
        <span id="action-container" class="action-glow">
          <span class="before"></span><span class="after"></span>
        </span>
        <span class="sr-only">${this.t(this.buttonTranscriptLabel)}</span>
        <bbva-type-icon class="action-icon" .icon="${this.icon}" size="24"></bbva-type-icon>
      </div>
    `}get _buttonDefault(){var e;const t=void 0!==this.icon||null!==(e=this.variant)&&void 0!==e&&e.includes("alert")&&!this.hideIconAlert?this._icon:g;return this.interaction?n`${this._interaction}`:n`${t}${this._text}${this._action}`}render(){return n`
      <div onclick="void(0)" class="wrapper ${this.fullwidth?"fullwidth":""}">
        ${this._buttonDefault}
      </div>
    `}}var Kt=r`
:host {
  display: flex;
  box-sizing: border-box;
  align-items: center;
  padding-left: 0;
  --_carousel-default-step-bar-width: 4.75rem;
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

.stepbar {
  display: grid;
  min-width: var(--_carousel-default-step-bar-width);
  max-width: var(--_carousel-default-step-bar-width);
  align-items: center;
  grid-auto-flow: column;
  grid-template-columns: repeat(3, 1fr);
  justify-items: end;
  overflow-x: hidden;
}
.stepbar .bar {
  width: 1rem;
  flex: 1 0 auto;
  border: 0.0625rem solid var(--_carousel-default-step-bar-border-color);
  border-radius: 0.0625rem;
  margin-left: 0.25rem;
  transition: all 0.3s ease-in-out 0.1s;
}
.stepbar .bar:first-of-type {
  margin-left: 0;
}
.stepbar .bar.selected {
  width: 2rem;
  border: 0.0625rem solid var(--_carousel-default-step-bar-border-color-active);
  transition: all 0.3s ease-in-out 0.1s;
}
.stepbar.minimum {
  min-width: auto;
  grid-template-columns: auto;
}
.stepbar.minimum .bar {
  transition: none;
}
.stepbar.minimum .bar.selected {
  transition: none;
}

:host [data-tag-name=bbva-type-text] {
  margin-left: 0.5rem;
  color: var(--_carousel-default-step-bar-border-color-active);
}

:host([full-screen]) .stepbar .bar:not(.selected) {
  border: 0.0625rem solid var(--_carousel-default-step-bar-border-color-alternative);
}
`,Yt=r`
:host {
  --_carousel-default-step-bar-border-color:
    var(--bbva-carousel-default-step-bar--_ambient--border-color,
      var(--bbva-carousel-default-step-bar--custom--primary-ambient--border-color,
        ${W("colorPrimarySurfaceAmbientPreloading",U)}));
  --_carousel-default-step-bar-border-color-active:
    var(--bbva-carousel-default-step-bar--_ambient--border-color-active,
      var(--bbva-carousel-default-step-bar--custom--primary-ambient--border-color-active,
        ${W("colorPrimarySelectionInteraction01BackgroundSelected",U)}));
  --_carousel-default-step-bar-border-color-alternative:
    var(--bbva-carousel-default-step-bar--_ambient--border-color-alternative,
      var(--bbva-carousel-default-step-bar--custom--primary-ambient--border-color-alternative,
        ${W("colorPrimarySurfaceAmbientDefault",U)}));
}
`;const Qt=r`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-carousel-default-step-bar--_ambient--border-color: initial;
    --bbva-carousel-default-step-bar--_ambient--border-color-active: initial;
    --bbva-carousel-default-step-bar--_ambient--border-color-alternative: initial;
  }
`,Jt=r`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-carousel-default-step-bar--_ambient--border-color: var(
      --bbva-carousel-default-step-bar--custom--primary-alt-ambient--border-color,
      ${W("colorPrimaryAltSurfaceAmbientPreloading",U)}
    );

    --bbva-carousel-default-step-bar--_ambient--border-color-active: var(
      --bbva-carousel-default-step-bar--custom--primary-alt-ambient--border-color-active,
      ${W("colorPrimaryAltSelectionInteraction01BackgroundSelected",U)}
    );

    --bbva-carousel-default-step-bar--_ambient--border-color-alternative: var(
      --bbva-carousel-default-step-bar--custom--primary-alt-ambient--border-color-alternative,
      ${W("colorPrimaryAltSurfaceAmbientDefault",U)}
    );
  }
`,Zt=r`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-carousel-default-step-bar--_ambient--border-color: var(
      --bbva-carousel-default-step-bar--custom--secondary-ambient--border-color,
      ${W("colorSecondarySurfaceAmbientPreloading",U)}
    );

    --bbva-carousel-default-step-bar--_ambient--border-color-active: var(
      --bbva-carousel-default-step-bar--custom--secondary-ambient--border-color-active,
      ${W("colorSecondarySelectionInteraction01BackgroundSelected",U)}
    );

    --bbva-carousel-default-step-bar--_ambient--border-color-alternative: var(
      --bbva-carousel-default-step-bar--custom--secondary-ambient--border-color-alternative,
      ${W("colorSecondarySurfaceAmbientDefault",U)}
    );
  }
`,ei=r`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-carousel-default-step-bar--_ambient--border-color: var(
      --bbva-carousel-default-step-bar--custom--secondary-alt-ambient--border-color,
      ${W("colorSecondaryAltSurfaceAmbientPreloading",U)}
    );

    --bbva-carousel-default-step-bar--_ambient--border-color-active: var(
      --bbva-carousel-default-step-bar--custom--secondary-alt-ambient--border-color-active,
      ${W("colorSecondaryAltSelectionInteraction01BackgroundSelected",U)}
    );

    --bbva-carousel-default-step-bar--_ambient--border-color-alternative: var(
      --bbva-carousel-default-step-bar--custom--secondary-alt-ambient--border-color-alternative,
      ${W("colorSecondaryAltSurfaceAmbientDefault",U)}
    );
  }
`,ti={primary:r`
    ${Qt} ${K.primary}
  `,primaryAlt:r`
    ${Jt} ${K.primaryAlt}
  `,secondary:r`
    ${Zt} ${K.secondary}
  `,secondaryAlt:r`
    ${ei} ${K.secondaryAlt}
  `},ii=Object.values(ti);class ai extends(o(Z(a))){static get is(){return"bbva-step-bar"}static get scopedElements(){return{"bbva-type-text":G}}static get properties(){return{iconSelected:{type:Boolean,attribute:"icon-selected",reflected:!0},items:{type:Number},selected:{type:Number},scrollPosition:{type:Number,attribute:"scroll-position"},columns:{type:Number},fullScreen:{type:Boolean,attribute:"full-screen",reflect:!0},loop:{type:Boolean,reflect:!0}}}constructor(){super(),this.selected=0,this.canAdd=!1,this.iconSelected=!1,this.scrollPosition=0,this.columns=1,this.fullScreen=!1,this.loop=!1}updated(e){super.updated(e),e.has("scrollPosition")&&this._smoothScrollToPosition(300)}static _easeInOutQuad(e){return e<.5?2*e*e:1-(-2*e+2)**2/2}_smoothScrollToPosition(e=1e3){const t=this._stpBarCtn.scrollLeft,i=this.scrollPosition-t;let a;const s=o=>{a||(a=o);const n=o-a,r=Math.min(n/e,1);this._stpBarCtn.scrollLeft=t+i*ai._easeInOutQuad(r),r<1&&requestAnimationFrame(s)};requestAnimationFrame(s)}get _stpBarCtn(){return this._stepbar||(this._stepbar=this.shadowRoot.querySelector(".stepbar")),this._stepbar}get _items(){const e=this.items>0?this.items:1,t=this.loop?this.items+2:e;return Array(t).fill(void 0)}static get styles(){return[Yt,Kt,ii,l("bbva-step-bar-shared-styles")]}_minMaxValues(){const e=this.selected<0?1:this.selected+1,t=this.items<1?1:this.items;return this.t("bbva-carousel-default-value-min-max",{slide:e,totalSlides:t})}get _stepBar(){return n`
      <div class="stepbar ${this.items<3?"minimum":""}" .scrollLeft="${this.scrollPosition}">
        ${this._items.map(((e,t)=>{const i=(this.selected===t||this.selected<0)&&!this.loop||this.loop&&t===this.selected+1;return n`<div class="bar ${i?"selected":""}"></div>`}))}
      </div>
      <bbva-type-text
        tag="span"
        font-style="italic"
        size="2XS"
        .text="${this._minMaxValues()}"
      ></bbva-type-text>
    `}render(){return n` ${this._stepBar} `}}var si=r`
@font-face {
  font-family: "swiper-icons";
  src: url("data:application/font-woff;charset=utf-8;base64, d09GRgABAAAAAAZgABAAAAAADAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABGRlRNAAAGRAAAABoAAAAci6qHkUdERUYAAAWgAAAAIwAAACQAYABXR1BPUwAABhQAAAAuAAAANuAY7+xHU1VCAAAFxAAAAFAAAABm2fPczU9TLzIAAAHcAAAASgAAAGBP9V5RY21hcAAAAkQAAACIAAABYt6F0cBjdnQgAAACzAAAAAQAAAAEABEBRGdhc3AAAAWYAAAACAAAAAj//wADZ2x5ZgAAAywAAADMAAAD2MHtryVoZWFkAAABbAAAADAAAAA2E2+eoWhoZWEAAAGcAAAAHwAAACQC9gDzaG10eAAAAigAAAAZAAAArgJkABFsb2NhAAAC0AAAAFoAAABaFQAUGG1heHAAAAG8AAAAHwAAACAAcABAbmFtZQAAA/gAAAE5AAACXvFdBwlwb3N0AAAFNAAAAGIAAACE5s74hXjaY2BkYGAAYpf5Hu/j+W2+MnAzMYDAzaX6QjD6/4//Bxj5GA8AuRwMYGkAPywL13jaY2BkYGA88P8Agx4j+/8fQDYfA1AEBWgDAIB2BOoAeNpjYGRgYNBh4GdgYgABEMnIABJzYNADCQAACWgAsQB42mNgYfzCOIGBlYGB0YcxjYGBwR1Kf2WQZGhhYGBiYGVmgAFGBiQQkOaawtDAoMBQxXjg/wEGPcYDDA4wNUA2CCgwsAAAO4EL6gAAeNpj2M0gyAACqxgGNWBkZ2D4/wMA+xkDdgAAAHjaY2BgYGaAYBkGRgYQiAHyGMF8FgYHIM3DwMHABGQrMOgyWDLEM1T9/w8UBfEMgLzE////P/5//f/V/xv+r4eaAAeMbAxwIUYmIMHEgKYAYjUcsDAwsLKxc3BycfPw8jEQA/gZBASFhEVExcQlJKWkZWTl5BUUlZRVVNXUNTQZBgMAAMR+E+gAEQFEAAAAKgAqACoANAA+AEgAUgBcAGYAcAB6AIQAjgCYAKIArAC2AMAAygDUAN4A6ADyAPwBBgEQARoBJAEuATgBQgFMAVYBYAFqAXQBfgGIAZIBnAGmAbIBzgHsAAB42u2NMQ6CUAyGW568x9AneYYgm4MJbhKFaExIOAVX8ApewSt4Bic4AfeAid3VOBixDxfPYEza5O+Xfi04YADggiUIULCuEJK8VhO4bSvpdnktHI5QCYtdi2sl8ZnXaHlqUrNKzdKcT8cjlq+rwZSvIVczNiezsfnP/uznmfPFBNODM2K7MTQ45YEAZqGP81AmGGcF3iPqOop0r1SPTaTbVkfUe4HXj97wYE+yNwWYxwWu4v1ugWHgo3S1XdZEVqWM7ET0cfnLGxWfkgR42o2PvWrDMBSFj/IHLaF0zKjRgdiVMwScNRAoWUoH78Y2icB/yIY09An6AH2Bdu/UB+yxopYshQiEvnvu0dURgDt8QeC8PDw7Fpji3fEA4z/PEJ6YOB5hKh4dj3EvXhxPqH/SKUY3rJ7srZ4FZnh1PMAtPhwP6fl2PMJMPDgeQ4rY8YT6Gzao0eAEA409DuggmTnFnOcSCiEiLMgxCiTI6Cq5DZUd3Qmp10vO0LaLTd2cjN4fOumlc7lUYbSQcZFkutRG7g6JKZKy0RmdLY680CDnEJ+UMkpFFe1RN7nxdVpXrC4aTtnaurOnYercZg2YVmLN/d/gczfEimrE/fs/bOuq29Zmn8tloORaXgZgGa78yO9/cnXm2BpaGvq25Dv9S4E9+5SIc9PqupJKhYFSSl47+Qcr1mYNAAAAeNptw0cKwkAAAMDZJA8Q7OUJvkLsPfZ6zFVERPy8qHh2YER+3i/BP83vIBLLySsoKimrqKqpa2hp6+jq6RsYGhmbmJqZSy0sraxtbO3sHRydnEMU4uR6yx7JJXveP7WrDycAAAAAAAH//wACeNpjYGRgYOABYhkgZgJCZgZNBkYGLQZtIJsFLMYAAAw3ALgAeNolizEKgDAQBCchRbC2sFER0YD6qVQiBCv/H9ezGI6Z5XBAw8CBK/m5iQQVauVbXLnOrMZv2oLdKFa8Pjuru2hJzGabmOSLzNMzvutpB3N42mNgZGBg4GKQYzBhYMxJLMlj4GBgAYow/P/PAJJhLM6sSoWKfWCAAwDAjgbRAAB42mNgYGBkAIIbCZo5IPrmUn0hGA0AO8EFTQAA") format("woff");
  font-weight: 400;
  font-style: normal;
}
:root {
  --swiper-theme-color: #007aff;
}

.swiper-container {
  margin-left: auto;
  margin-right: auto;
  position: relative;
  overflow: hidden;
  list-style: none;
  padding: 0;
  /* Fix of Webkit flickering */
  z-index: 1;
}

.swiper-container-vertical > .swiper-wrapper {
  flex-direction: column;
}

.swiper-wrapper {
  position: relative;
  width: 100%;
  height: 100%;
  z-index: 1;
  display: flex;
  transition-property: transform;
  box-sizing: content-box;
}

.swiper-container-android .swiper-slide,
.swiper-wrapper {
  transform: translate3d(0px, 0, 0);
}

.swiper-container-multirow > .swiper-wrapper {
  flex-wrap: wrap;
}

.swiper-container-multirow-column > .swiper-wrapper {
  flex-wrap: wrap;
  flex-direction: column;
}

.swiper-container-free-mode > .swiper-wrapper {
  transition-timing-function: ease-out;
  margin: 0 auto;
}

.swiper-container-pointer-events {
  touch-action: pan-y;
}
.swiper-container-pointer-events.swiper-container-vertical {
  touch-action: pan-x;
}

.swiper-slide {
  flex-shrink: 0;
  width: 100%;
  height: 100%;
  position: relative;
  transition-property: transform;
}

.swiper-slide-invisible-blank {
  visibility: hidden;
}

/* Auto Height */
.swiper-container-autoheight,
.swiper-container-autoheight .swiper-slide {
  height: auto;
}
.swiper-container-autoheight .swiper-wrapper {
  align-items: flex-start;
  transition-property: transform, height;
}

/* 3D Effects */
.swiper-container-3d {
  perspective: 1200px;
}
.swiper-container-3d .swiper-wrapper,
.swiper-container-3d .swiper-slide,
.swiper-container-3d .swiper-slide-shadow-left,
.swiper-container-3d .swiper-slide-shadow-right,
.swiper-container-3d .swiper-slide-shadow-top,
.swiper-container-3d .swiper-slide-shadow-bottom,
.swiper-container-3d .swiper-cube-shadow {
  transform-style: preserve-3d;
}
.swiper-container-3d .swiper-slide-shadow-left,
.swiper-container-3d .swiper-slide-shadow-right,
.swiper-container-3d .swiper-slide-shadow-top,
.swiper-container-3d .swiper-slide-shadow-bottom {
  position: absolute;
  left: 0;
  top: 0;
  width: 100%;
  height: 100%;
  pointer-events: none;
  z-index: 10;
}
.swiper-container-3d .swiper-slide-shadow-left {
  background-image: linear-gradient(to left, rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0));
}
.swiper-container-3d .swiper-slide-shadow-right {
  background-image: linear-gradient(to right, rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0));
}
.swiper-container-3d .swiper-slide-shadow-top {
  background-image: linear-gradient(to top, rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0));
}
.swiper-container-3d .swiper-slide-shadow-bottom {
  background-image: linear-gradient(to bottom, rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0));
}

/* CSS Mode */
.swiper-container-css-mode > .swiper-wrapper {
  overflow: auto;
  scrollbar-width: none; /* For Firefox */
  -ms-overflow-style: none; /* For Internet Explorer and Edge */
}
.swiper-container-css-mode > .swiper-wrapper::-webkit-scrollbar {
  display: none;
}
.swiper-container-css-mode > .swiper-wrapper > .swiper-slide {
  scroll-snap-align: start start;
}

.swiper-container-horizontal.swiper-container-css-mode > .swiper-wrapper {
  scroll-snap-type: x mandatory;
}

.swiper-container-vertical.swiper-container-css-mode > .swiper-wrapper {
  scroll-snap-type: y mandatory;
}

:host {
  position: relative;
  z-index: var(--bbva-carousel-default-z-index, 0);
  display: block;
  max-height: 100%;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.swiper-container {
  padding: 0.5rem 1rem;
  transition-timing-function: linear;
}
.swiper-container.desktop {
  padding: 0.5rem 3rem;
}
.swiper-container.empty {
  padding: 0;
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

.swiper-container::before, .swiper-container::after {
  position: absolute;
  z-index: var(--bbva-carousel-asset-gradient-index, 2);
  top: 0;
  display: block;
  width: 1.5rem;
  height: 100%;
  content: "";
}

.swiper-container::before {
  left: 0;
  background: linear-gradient(to left, transparent 0%, var(--_carousel-default-gradient-color) 100%);
}

.swiper-container::after {
  right: 0;
  background: linear-gradient(to right, transparent 0%, var(--_carousel-default-gradient-color) 100%);
}

.swiper-wrapper,
.swiper-slide {
  height: auto;
  cursor: pointer;
}

.swiper-wrapper {
  width: 100%;
}

.swiper-slide {
  position: relative;
  display: flex;
  overflow: hidden;
  flex-direction: column;
  border-radius: var(--borderRadiusSmall, ${b(C.small)});
  background: var(--_carousel-default-slide-bg-color);
}
.swiper-slide:focus-visible {
  border-radius: 0;
  outline: 0.125rem solid var(--_carousel-default-swiper-container-focus);
  outline-offset: 0.25rem;
}
.swiper-slide.hide {
  opacity: 0;
  transition: opacity 500ms, width 500ms;
}

.button-container {
  position: absolute;
  right: 0;
}

:host([variant=full-screen]) {
  display: flex;
  flex-direction: column;
  background-color: var(--_carousel-default-slide-bg-color);
}
:host([variant=full-screen]) .swiper-container::before, :host([variant=full-screen]) .swiper-container::after {
  display: none;
  background: none;
}
:host([variant=full-screen]) .swiper-container::-webkit-scrollbar {
  display: none;
}
:host([variant=full-screen]) .swiper-container {
  width: 100%;
  flex: 1;
  padding: 0.5rem 0;
  -ms-overflow-style: none; /* IE and Edge */
  overflow-y: auto;
  scrollbar-width: none; /* Firefox */
}
:host([variant=full-screen]) .swiper-container.empty {
  padding: 0;
}
:host([variant=full-screen]) .steps.desktop {
  padding: 0;
}

:host([hide-gradient]) .swiper-container::before, :host([hide-gradient]) .swiper-container::after {
  display: none;
  background: none;
}
:host([hide-gradient]) .swiper-container::-webkit-scrollbar {
  display: none;
}

.steps {
  display: flex;
  justify-content: space-between;
  padding: 0 1rem;
}
.steps .chevrons {
  display: flex;
  gap: 1.5rem;
}
.steps .chevrons [data-tag-name=bbva-button-default] {
  margin: -0.5rem;
}
.steps.desktop {
  padding-right: 2.25rem;
  padding-left: 3rem;
}

.swiper-loading {
  display: none;
}

:host([loading-chevrons]) .steps, :host([loading]) .steps {
  justify-content: flex-end;
}
:host([loading-chevrons]) .chevrons, :host([loading]) .chevrons {
  display: none;
}
:host([loading-chevrons]) .chevrons-loading, :host([loading]) .chevrons-loading {
  position: relative;
  display: inline-block;
  overflow: hidden;
  width: 5.25rem;
  height: 3rem;
  background-repeat: no-repeat;
  opacity: 1;
  pointer-events: none;
  background-image: linear-gradient(var(--_carousel-default-skeleton-quote-color) 100%, transparent 0), linear-gradient(var(--_carousel-default-skeleton-quote-color) 100%, transparent 0);
  background-color: transparent;
  background-size: 24px 24px, 24px 24px;
  background-position: 0 12px, 48px 12px;
}
:host([loading-chevrons]) .chevrons-loading .skeleton, :host([loading]) .chevrons-loading .skeleton {
  position: absolute;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  width: 100%;
  height: 3rem;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  background: var(--_carousel-default-skeleton-animated-layer-bg);
  contain: strict;
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
}
:host([loading-chevrons]):host([autoplay]) .chevrons-loading, :host([loading]):host([autoplay]) .chevrons-loading {
  width: 8.25rem;
  background-image: linear-gradient(var(--_carousel-default-skeleton-quote-color) 100%, transparent 0), linear-gradient(var(--_carousel-default-skeleton-quote-color) 100%, transparent 0), linear-gradient(var(--_carousel-default-skeleton-quote-color) 100%, transparent 0);
  background-color: transparent;
  background-size: 24px 24px, 24px 24px, 24px 24px;
  background-position: 0 12px, 48px 12px, 96px 12px;
}
:host([loading-chevrons]):host([full-width]) .swiper-loading, :host([loading]):host([full-width]) .swiper-loading {
  background-image: linear-gradient(var(--_carousel-default-skeleton-quote-color) 100%, transparent 0);
  background-color: transparent;
  background-size: 100% 100%;
  background-position: 0 0;
}

:host([loading]) .swiper-container {
  display: none;
}
:host([loading]) [data-tag-name=bbva-type-text] {
  display: none;
}
:host([loading]) .swiper-loading {
  position: relative;
  display: inline-block;
  overflow: hidden;
  width: 100%;
  height: 9rem;
  background-repeat: no-repeat;
  opacity: 1;
  pointer-events: none;
  background-image: linear-gradient(var(--_carousel-default-skeleton-quote-color) 100%, transparent 0), linear-gradient(var(--_carousel-default-skeleton-quote-color) 100%, transparent 0), linear-gradient(var(--_carousel-default-skeleton-quote-color) 100%, transparent 0);
  background-color: transparent;
  background-size: 10% 100%, 75% 100%, 10% 100%;
  background-position: 0 0, 50% 0, 100% 0;
}
:host([loading]) .swiper-loading .skeleton {
  position: absolute;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  width: 100%;
  height: 9rem;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  background: var(--_carousel-default-skeleton-animated-layer-bg);
  contain: strict;
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
`,oi=r`
:host {
  --_carousel-default-slide-bg-color:
    var(--bbva-carousel-default--_ambient--slide-bg-color,
      var(--bbva-carousel-default--custom--primary-ambient--slide-bg-color,
        ${W("colorPrimarySurfaceAlternativeDefault",U)}));
  --_carousel-default-gradient-color:
    var(--bbva-carousel-default--_ambient--gradient-color,
      var(--bbva-carousel-default--custom--primary-ambient--gradient-color,
        ${W("colorPrimaryAltSurfaceAlternativeDefault",U)}));
  --_carousel-default-skeleton-quote-color:
    var(--bbva-carousel-default--_ambient--skeleton-quote-color,
      var(--bbva-carousel-default--custom--primary-ambient--skeleton-quote-color,
        ${W("colorPrimarySurfaceAmbientPreloading",U)}));
  --_carousel-default-skeleton-animated-layer-bg:
    var(--bbva-carousel-default--_ambient--skeleton-animated-layer-bg,
      var(--bbva-carousel-default--custom--primary-ambient--skeleton-animated-layer-bg,
        ${W("colorPrimarySurfaceAmbientDefault",U)}));
  --_carousel-default-swiper-container-focus:
    var(--bbva-carousel-default--_ambient--swiper-container-focus,
      var(--bbva-carousel-default--custom--primary-ambient--swiper-container-focus,
        ${W("colorPrimarySurfaceAmbientFocus",U)}));
}
`;const ni=r`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-carousel-default--_ambient--slide-bg-color: initial;
    --bbva-carousel-default--_ambient--gradient-color: initial;
    --bbva-carousel-default--_ambient--skeleton-quote-color: initial;
    --bbva-carousel-default--_ambient--skeleton-animated-layer-bg: initial;
    --bbva-carousel-default--_ambient--swiper-container-focus: initial;
  }
`,ri=r`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-carousel-default--_ambient--slide-bg-color: var(
      --bbva-carousel-default--custom--primary-alt-ambient--slide-bg-color,
      ${W("colorPrimaryAltSurfaceAlternativeDefault",U)}
    );

    --bbva-carousel-default--_ambient--gradient-color: var(
      --bbva-carousel-default--custom--primary-alt-ambient--gradient-color,
      ${W("colorPrimarySurfaceAlternativeDefault",U)}
    );

    --bbva-carousel-default--_ambient--skeleton-quote-color: var(
      --bbva-carousel-default--custom--primary-alt-ambient--skeleton-quote-color,
      ${W("colorPrimaryAltSurfaceAmbientPreloading",U)}
    );
    
    --bbva-carousel-default--_ambient--skeleton-animated-layer-bg: var(
      --bbva-carousel-default--custom--primary-alt-ambient--skeleton-animated-layer-bg,
      ${W("colorPrimaryAltSurfaceAmbientDefault",U)}
    );

    --bbva-carousel-default--_ambient--swiper-container-focus: var(
      --bbva-carousel-default--custom--primary-alt-ambient--swiper-container-focus,
      ${W("colorPrimaryAltSurfaceAmbientFocus",U)}
    );
  }
`,ci=r`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-carousel-default--_ambient--slide-bg-color: var(
      --bbva-carousel-default--custom--secondary-ambient--slide-bg-color,
      ${W("colorSecondarySurfaceAlternativeDefault",U)}
    );

    --bbva-carousel-default--_ambient--gradient-color: var(
      --bbva-carousel-default--custom--secondary-ambient--gradient-color,
      ${W("colorSecondaryAltSurfaceAlternativeDefault",U)}
    );

    --bbva-carousel-default--_ambient--skeleton-quote-color: var(
      --bbva-carousel-default--custom--secondary-ambient--skeleton-quote-color,
      ${W("colorSecondarySurfaceAmbientPreloading",U)}
    );
    
    --bbva-carousel-default--_ambient--skeleton-animated-layer-bg: var(
      --bbva-carousel-default--custom--secondary-ambient--skeleton-animated-layer-bg,
      ${W("colorSecondarySurfaceAmbientDefault",U)}
    );

    --bbva-carousel-default--_ambient--swiper-container-focus: var(
      --bbva-carousel-default--custom--secondary-ambient--swiper-container-focus,
      ${W("colorSecondarySurfaceAmbientFocus",U)}
    );
  }
`,li=r`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-carousel-default--_ambient--slide-bg-color: var(
      --bbva-carousel-default--custom--secondary-alt-ambient--slide-bg-color,
      ${W("colorSecondaryAltSurfaceAlternativeDefault",U)}
    );

    --bbva-carousel-default--_ambient--gradient-color: var(
      --bbva-carousel-default--custom--secondary-alt-ambient--gradient-color,
      ${W("colorSecondarySurfaceAlternativeDefault",U)}
    );

    --bbva-carousel-default--_ambient--skeleton-quote-color: var(
      --bbva-carousel-default--custom--secondary-alt-ambient--skeleton-quote-color,
      ${W("colorSecondaryAltSurfaceAmbientPreloading",U)}
    );
    
    --bbva-carousel-default--_ambient--skeleton-animated-layer-bg: var(
      --bbva-carousel-default--custom--secondary-alt-ambient--skeleton-animated-layer-bg,
      ${W("colorSecondaryAltSurfaceAmbientDefault",U)}
    );

    --bbva-carousel-default--_ambient--swiper-container-focus: var(
      --bbva-carousel-default--custom--secondary-alt-ambient--swiper-container-focus,
      ${W("colorSecondaryAltSurfaceAmbientFocus",U)}
    );
  }
`,di={primary:r`
    ${ni}
    ${ti.primary}
    ${Gt.primary}
  `,primaryAlt:r`
    ${ri}
    ${ti.primaryAlt}
    ${Gt.primaryAlt}
  `,secondary:r`
    ${ci}
    ${ti.secondary}
    ${Gt.secondary}
  `,secondaryAlt:r`
    ${li}
    ${ti.secondaryAlt}
    ${Gt.secondaryAlt}
  `},bi=Object.values(di);le.use([je,He]);class ui extends(Z(o(ee(ze(a))))){static get scopedElements(){return{"bbva-step-bar":ai,"bbva-button-default":Xt}}static get is(){return"bbva-carousel-default"}static get properties(){return{items:{type:Array},selected:{type:Number},swiperConfig:{type:Object},variant:{type:String},scopedComponents:{type:Array,attribute:"scoped-components"},type:{type:String},_sliderContainer:{type:Object},_leftGradient:{type:Object},_rightGradient:{type:Object},scrollPosition:{type:Number},columns:{type:Number},closeItem:{type:Boolean,attribute:"close-item"},loop:{type:Boolean,reflect:!0},stepLength:{type:Number,attribute:"step-length"},_ariaLive:{type:Boolean,state:!0},_showMessageSlideDeleted:{type:Boolean},_slideDeleted:{type:Number},hideGradient:{type:Boolean,attribute:"hide-gradient",reflect:!0},loading:{type:Boolean,reflect:!0},loadingChevrons:{type:Boolean,attribute:"loading-chevrons",reflect:!0},iconBack:{type:String},iconClose:{type:String},iconNext:{type:String},fullWidth:{type:Boolean,attribute:"full-width"},autoplay:{type:Boolean,reflect:!0},isPlaying:{type:Boolean},isList:{type:Boolean},_desktop:{type:Boolean,attribute:!1},autoplayDelay:{type:Number,attribute:"autoplay-delay"},_hasImage:{type:Boolean},_itemsWithVisibilityState:{type:Array},visibilityThreshold:{type:Number,attribute:"visibility-threshold"},carouselAccessibilityText:{type:String,attribute:"carousel-accessibility-text"},slideCloseAccessibilityText:{type:String,attribute:"slide-close-accessibility-text"},prevChevronAccessibilityText:{type:String,attribute:"prev-chevron-accessibility-text"},nextChevronAccessibilityText:{type:String,attribute:"next-chevron-accessibility-text"}}}constructor(){super(),this.items=[],this.selected=0,this.swiperConfig={},this.variant="",this.type="scroll",this.scrollPosition=0,this.columns=1,this.closeItem=!1,this.loop=!1,this.iconBack=I(),this.iconClose=M(),this.iconNext=R(),this.keepSlideOnInit=!1,this.stepLength=0,this._ariaLive=!1,this.hideGradient=!1,this.loading=!1,this.loadingChevrons=!1,this.fullWidth=!1,this.autoplay=!1,this.isPlaying=!1,this.isList=!1,this._showMessageSlideDeleted=!1,this._desktop=!1,this.autoplayDelay=3e3,this._hasImage=!1,this._itemsWithVisibilityState=[],this.visibilityThreshold=.5,this._itemsVisibilityChange=this._itemsVisibilityChange.bind(this),this.carouselAccessibilityText="bbva-carousel-default-carousel-sr-description",this.slideCloseAccessibilityText="bbva-carousel-default-slide-close",this.prevChevronAccessibilityText="bbva-carousel-default-chevron-prev-aria-label",this.nextChevronAccessibilityText="bbva-carousel-default-chevron-next-aria-label"}static get styles(){return[oi,si,bi,l("bbva-carousel-default-shared-styles")]}update(e){var t;if(super.update(e),this._sliderContainer=this._sliderContainer||this.shadowRoot.querySelector(".swiper-container"),e.has("scopedComponents")&&this.scopedComponents&&this.scopedComponents.forEach((e=>{this.defineScopedElement(e.tagName,e.class)})),(e.has("loading")||e.has("loadingChevrons")||e.has("items"))&&null!==(t=this.items)&&void 0!==t&&t.length&&!this._loading){this.stepLength=this.items.length;(this.items[0].content instanceof B?this.items[0].content.strings[0]:this.items[0].content).includes("img")&&(this._hasImage=!0,this._sliderContainer.classList.add("image"))}e.has("autoplay")&&(this.isPlaying=this.autoplay)}get _loading(){return this.loading||this.loadingChevrons}static get _mediaQueries(){return{_desktop:"(min-width: 62rem)"}}initializeSwiper(){this._swiper&&this._swiper.destroy(),this._swiper=new le(this._sliderContainer,this.configSwiper()),this._swiper.on("init",(()=>{this.requestUpdate(),"swipe"===this.type&&this.updateComplete.then((()=>{this._updateSlideAccessibility()}))})),this._swiper.init(),this._swiper.on("slideChange",(()=>{"swipe"===this.type&&(this._swiper.slides[this._swiper.previousIndex].setAttribute("aria-hidden",!0),this._select(this._swiper.realIndex),requestAnimationFrame((()=>{this._updateSlideAccessibility()})))})),this.loop&&this._swiper.on("slideChangeTransitionEnd",(()=>{this._swiper.loopFix()})),this.selected=this._setIndex()}_setIndex(){return this.selected||0}_fullWidth(){return this._desktop?this.fullWidth?0:32:this.fullWidth?0:8}configSwiper(){return{...{init:!1,loop:this.loop,freeMode:"scroll"===this.type,enabled:!(1===this.items.length),slidesPerView:this.getSlidesPerView(),spaceBetween:this._fullWidth(),speed:500,keyboard:{enabled:!0},initialSlide:this._setIndex(),loopAdditionalSlides:1,...this.autoplay&&{autoplay:{delay:this.autoplayDelay,disableOnInteraction:!1}}},...this.swiperConfig}}getSlidesPerView(){const e=+({swipe:{"two-columns":2,"three-columns":2.999,"four-columns":3.999,"five-columns":4.999,default:1},scroll:{"two-columns":1.409,"three-columns":2.351,"four-columns":3.3,"five-columns":4.15}}[this.type][this.variant]||"1");return this.columns=1===e?e:Math.floor(e+1),e}updated(e){super.updated(e),(e.has("loop")||e.has("items")||e.has("swiperConfig")||e.has("_desktop")||e.has("_hasImage")||e.has("_intlLanguage")||e.has("_intlResources")||e.has("loading"))&&this.initializeSwiper(),e.has("items")&&this._initIntersectionObserverControllers()}_select(e){this.selected!==e&&(this.selected=e,this.isPlaying||(this._ariaLive=!0),this.loop?this.scrollPosition=20*e:this.items.length>3&&e+1<this.items.length&&e>0&&(this.scrollPosition=20*(e-1)),this.dispatchEvent(new CustomEvent("carousel-default-item-select",{detail:this.selected,bubbles:!0,composed:!0})))}_tap(e){this.dispatchEvent(new CustomEvent("carousel-default-item-tap",{detail:e,bubbles:!0,composed:!0}))}_updateSlideAccessibility(){const e=this._swiper.slides.slice(this._swiper.activeIndex,this._swiper.activeIndex+Math.min(this._swiper.slidesPerViewDynamic(),this.items.length));this._swiper.slides.forEach((t=>{const i=!e.includes(t);i?(t.setAttribute("aria-hidden",i),t.setAttribute("tabindex",-1)):(t.removeAttribute("aria-hidden"),t.removeAttribute("tabindex"));const a=(e,t)=>{t?e.setAttribute("disabled",""):e.removeAttribute("disabled")};if(a(t,i),this.closeItem){a(t.querySelector(".swiper-slide-close"),i)}const s=t.querySelectorAll(`a, button, input, ${["button","link","checkbox","radio","tab","menuitem"].map((e=>`[role="${e}"]`)).join(", ")}`);i&&s.forEach((e=>{e.setAttribute("tabindex",-1)}))}))}_close(e,t){e.stopPropagation();const i=this.shadowRoot.querySelector(`.swiper-slide:nth-child(${this._getAdjustedIndex(t)})`);this.dispatchEvent(new CustomEvent("carousel-default-item-close",{detail:t,bubbles:!0,composed:!0})),this._showMessageSlideDeleted=!0,this._slideDeleted=t,i.classList.add("hide"),setTimeout((()=>{this._updateItem(t,i),this._showMessageSlideDeleted=!1}),500)}_updateItem(e,t){t.style.width=0,t.style.marginRight=0,t.style.height=0,setTimeout((()=>{this._deleteItem(e,t)}),500)}_deleteItem(e,t){const i=this.selected===this.items.length-(this.loop?1:this.columns);t.classList.remove("hide"),i&&(this.loop?(this.scrollPosition=0,this.selected=0):(this.scrollPosition=20*this.selected,this.selected-=1)),this.items=[...this.items.slice(0,e),...this.items.slice(e+1,this.items.length)],1===this.items.length&&(this.loop=!1),this.autoplay&&setTimeout((()=>{this._keepAutoplay()}),100)}_keepAutoplay(){this.isPlaying?this._swiper.autoplay.start():this._swiper.autoplay.stop()}_getAdjustedIndex(e){return this.loop?e+this._swiper.loopedSlides+1:e+1}_buttonClose(e,t){return t||this.closeItem?n`
        <div class="button-container" ambient="${this._hasImage?"secondary":""}">
          <bbva-button-default
            tabindex="${this._isDisabled(e)?-1:0}"
            aria-label="${this.t(this.slideCloseAccessibilityText)}"
            aria-describedby="${m("scroll"===this.type?void 0:`slide-${e}`)}"
            class="swiper-slide-close"
            icon="${this.iconClose}"
            icon-size="16"
            variant="icon no-background alternative"
            ?disabled=${this._isDisabled(e)}
            @click=${t=>this._close(t,e)}
          >
          </bbva-button-default>
        </div>
      `:n``}get _navigationChevronsTpl(){return n`
      <div class="chevrons">
        ${this.autoplay?this._playButton:""}

        <bbva-button-default
          class="chevron-button chevron-prev"
          aria-label="${this.t(this.prevChevronAccessibilityText)}"
          aria-controls="carouselSlides"
          variant="icon no-background"
          icon="${this.iconBack}"
          ?disabled="${!this.loop&&this.selected<=0}"
          aria-disabled="${this.disabled}"
          ?loading="${this._loading}"
          @click="${this._onChevronPrevClick}"
        >
        </bbva-button-default>

        <bbva-button-default
          class="chevron-button chevron-next"
          aria-label="${this.t(this.nextChevronAccessibilityText)}"
          aria-controls="carouselSlides"
          variant="icon no-background"
          icon="${this.iconNext}"
          ?disabled="${!this.loop&&this.selected===this.stepLength-this.columns}"
          aria-disabled="${this.disabled}"
          ?loading="${this._loading}"
          @click="${this._onChevronNextClick}"
        >
        </bbva-button-default>
      </div>
    `}_onChevronPrevClick(){this._swiper.slidePrev()}_togglePlay(){this.disabled||(this._ariaLive=!1,this.isPlaying=!this.isPlaying,this.isPlaying?this._swiper.autoplay.start():this._swiper.autoplay.stop())}_onChevronNextClick(){this._swiper.slideNext()}get _playButton(){return n`
      <bbva-button-default
        class="play-button"
        aria-label="${this.t(this.isPlaying?"bbva-carousel-default-automatic-pause":"bbva-carousel-default-automatic-play")}"
        variant="icon no-background"
        icon="${this.isPlaying?N():O()}"
        @click="${this._togglePlay}"
        aria-disabled=${this.disabled}
      >
      </bbva-button-default>
    `}_isDisabled(e){return this._swiper&&this._swiper.slides.length>0&&(e+1>this._swiper.slidesPerViewDynamic()+this._swiper.activeIndex||e+1<=this._swiper.activeIndex)}get _tpl(){return n`
      <div
        role="region"
        aria-labelledby="cards-heading"
        aria-live="${this._ariaLive&&"swipe"===this.type?"polite":"off"}"
        class="swiper-container ${this._desktop?"desktop":""}"
        id="${this.id}"
      >
        <p id="cards-heading" hidden>${this.t(this.carouselAccessibilityText)}</p>
        <div
          id="carouselSlides"
          class="swiper-wrapper"
          role="${m(this.isList&&"scroll"===this.type?"list":void 0)}"
        >
          ${"swipe"===this.type?this.items.map(((e,t)=>this._swipeTpl(e,t))):this.items.map(((e,t)=>this._scrollTpl(e,t)))}
        </div>
      </div>
      <div class="gradient bottom"></div>
      <div class="swiper-loading"><div class="skeleton"></div></div>

      ${this.items&&this.items.length>=1&&"swipe"===this.type?n`<div class="steps ${this._desktop?"desktop":""}">
            ${this._stepBar} ${this._navigationChevronsTpl}
          </div>`:n``}

      <div class="steps">
        <div class="chevrons-loading"><div class="skeleton"></div></div>
      </div>
      <span class="sr-only" aria-live="polite">
        ${this._showMessageSlideDeleted?this.t("bbva-carousel-default-slide-deleted",{slide:this._slideDeleted+1}):""}
      </span>
    `}_scrollTpl(e,t){return n`
      <div
        role="${m(this.isList&&"scroll"===this.type?"listitem":void 0)}"
        ambient="${(null==e?void 0:e.ambient)||""}"
        @click=${()=>this._tap(t)}
        @keypress="${()=>this._tap(t)}"
        class="swiper-slide"
      >
        ${this._buttonClose(t,null==e?void 0:e.closeItem)}
        ${e.content instanceof B?e.content:V(e.content)}
      </div>
    `}_swipeTpl(e,t){return n`
      <div
        ambient="${(null==e?void 0:e.ambient)||""}"
        tabindex="${m(this._isDisabled(t)?-1:void 0)}"
        @click=${()=>this._tap(t)}
        @keypress="${()=>this._tap(t)}"
        class="swiper-slide"
        role="group"
        aria-hidden="${m(this._isDisabled(t)?"true":void 0)}"
        aria-labelledby="slide-${t}"
      >
        <p id="slide-${t}" hidden>
          ${this.t("bbva-carousel-default-slide-aria-label",{slide:t+1,totalSlides:this.items&&this.items.length})}
        </p>
        ${this._buttonClose(t,null==e?void 0:e.closeItem)}
        ${e.content instanceof B?e.content:V(e.content)}
      </div>
    `}get _stepBar(){return this._loading?"":n`
          <bbva-step-bar
            aria-hidden="true"
            .items="${this.items.length+(this.loop?0:1-this.columns)}"
            .selected="${this.selected}"
            scroll-position="${this.scrollPosition}"
            .columns="${this.columns}"
            tabindex="-1"
            ?full-screen="${"full-screen"===this.variant}"
            .loop="${this.loop}"
          >
          </bbva-step-bar>
        `}_initIntersectionObserverControllers(){var e;const t=Array.from(this.shadowRoot.querySelectorAll(".swiper-slide"));null===(e=this._boxesIntersectionObserver)||void 0===e||e.disconnect(),this._itemsWithVisibilityState=t.map(((e,t)=>({id:`swiper-item-${t}`,target:e,visible:null}))),this._boxesIntersectionObserver=new qe(this,{target:t,config:{threshold:this.visibilityThreshold,delay:300},callback:this._itemsVisibilityChange,skipInitial:!1})}_itemsVisibilityChange(e){for(const t of e){const e=this._itemsWithVisibilityState.find((e=>e.target===t.target));e&&e.visible!==t.isIntersecting&&(e.visible=t.isIntersecting)}const t=this._itemsWithVisibilityState.filter((e=>e.visible));this.dispatchEvent(new CustomEvent("carousel-default-item-visibility-change",{composed:!0,bubbles:!0,detail:{visible:t,all:this._itemsWithVisibilityState}}))}render(){return n`${this._tpl}`}}var vi=r`:host {
  display: block;
  background-color: var(--colorsSecondary100, ${b(y.secondary100)});
}
:host .security-learn-more-container {
  --bbva-carousel-default--custom--primary-ambient--gradient-color: var(--colorsSecondary100, ${b(y.secondary100)});
}
:host .security-learn-more-container [data-tag-name=bbva-type-text] {
  padding-left: 1rem;
}
:host [data-tag-name=bbva-carousel-default].swiper-slide {
  min-width: 200px;
}
`;class hi extends(s(Ge(o(a)))){static get is(){return"bbva-security-learn-more-widget"}static get scopedElements(){return{"bbva-type-text":G,"bbva-type-link":ne,"bbva-clip-microillustration":ae,"bbva-carousel-default":ui}}static get styles(){return[vi,l("bbva-security-learn-more-widget-shared-styles")]}static get properties(){return{learnMoreTitle:{type:String},items:{type:Array}}}constructor(){super(),this.learnMoreTitle="bbva-learn-more-widget-title",this.scopedItems=[{tagName:"bbva-clip-microillustration",class:ae},{tagName:"bbva-type-link",class:ne},{tagName:"bbva-type-text",class:G}],this.parsedItems=[]}_generateContent(e){return{content:n`
          <div style="padding:16px;">
            <bbva-clip-microillustration
              microillustration="${e.image}"
              size="S">
            </bbva-clip-microillustration>
            <bbva-type-link
              bubble-event
              @click="${()=>this.fireLearnMoreItemAction(e)}"
              text="${e.title}"></bbva-type-link>
          </div>
        `}}updated(e){var t;e.has("items")&&(null!==(t=this.items)&&void 0!==t&&t.length&&(this.parsedItems=this.items.map((e=>this._generateContent(e))),this.shadowRoot.querySelector('[data-tag-name="bbva-carousel-default"]').scopedComponents=this.scopedItems))}render(){return n`
      <div class="security-learn-more-container">
        <bbva-type-text
          size="M"
          ambient="light"
          ambient-color="secondary500"
          font-weight="500"
          text="${this.t(this.learnMoreTitle)}">
        </bbva-type-text>
        <bbva-carousel-default
          variant="two-columns"
          .items="${this.parsedItems}"
        ></bbva-carousel-default>
      </div>
    `}fireLearnMoreItemAction(e){this.__fireEvent("widget-clicked-link",{event:"learn-more-widget-clicked-item",data:e})}__fireEvent(e,t){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}}var pi=r`:host {
  display: block;
  background-color: var(--colorsSecondary100, ${b(y.secondary100)});
  --_bbva-banner-image-padding: 0;
  --_bbva-banner-image-height: auto;
}
:host .security-lattest-container {
  --bbva-carousel-default--custom--primary-ambient--gradient-color: var(--colorsSecondary100, ${b(y.secondary100)});
}
:host .security-lattest-container [data-tag-name=bbva-type-text] {
  padding-left: 1rem;
}
:host [data-tag-name=bbva-carousel-default].swiper-slide {
  min-width: 200px;
}
`;class gi extends(s(Ge(o(a)))){static get is(){return"bbva-security-lattest-widget"}static get scopedElements(){return{"bbva-type-text":G,"bbva-type-link":ne,"bbva-banner-image":de,"bbva-carousel-default":ui}}static get styles(){return[pi,l("bbva-security-lattest-widget-shared-styles")]}static get properties(){return{lattestTitle:{type:String},items:{type:Array}}}constructor(){super(),this.lattestTitle="bbva-lattest-widget-title",this.scopedItems=[{tagName:"bbva-banner-image",class:de},{tagName:"bbva-type-link",class:ne},{tagName:"bbva-type-text",class:G}],this.parsedItems=[]}_generateContent(e){return{content:n`
          <bbva-banner-image
            image-src="${e.urlImage}"
            size="L">
          </bbva-banner-image>
          <div style="padding:16px;">
            <bbva-type-link
              size="M"
              bubble-event
              text="${e.title}"
              @click="${()=>this.fireLastMinuteItemAction(e)}"></bbva-type-link>
              <bbva-type-text
              size="S"
              text="${e.subtitle}"></bbva-type-text>
          </div>
        `}}updated(e){var t;e.has("items")&&(null!==(t=this.items)&&void 0!==t&&t.length&&(this.parsedItems=this.items.map((e=>this._generateContent(e))),this.shadowRoot.querySelector('[data-tag-name="bbva-carousel-default"]').scopedComponents=this.scopedItems))}render(){return n`
      <div class="security-lattest-container">
        <bbva-type-text
          size="M"
          ambient="light"
          ambient-color="secondary500"
          font-weight="500"
          text="${this.t(this.lattestTitle)}">
        </bbva-type-text>
        <bbva-carousel-default
          type="swipe"
          .items="${this.parsedItems}"
        ></bbva-carousel-default>
      </div>
    `}fireLastMinuteItemAction(e){this.__fireEvent("widget-clicked-link",{event:"lattest-widget-clicked-item",data:e})}__fireEvent(e,t){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}}var mi=r`:host {
  display: block;
  box-sizing: border-box;
}
:host [data-tag-name=bbva-carousel-default] {
  --_notification-contextual-title-color: var(--colorsSecondary600, ${b(y.secondary600)});
  --_notification-contextual-icon-color: var(--colorsSecondary600, ${b(y.secondary600)});
}
:host [data-tag-name=bbva-type-text] {
  padding-left: 0.5rem;
}
`;class yi extends(s(Ge(o(a)))){static get is(){return"bbva-device-alerts-widget"}static get scopedElements(){return{"bbva-type-text":G,"bbva-notification-contextual":re,"bbva-carousel-default":ui,"bbva-nativeconnector-local-storage":fe,"bbva-nativeconnector-device-info":ke,"bbva-nativeconnector-device-checker":pe}}static get styles(){return[mi,l("bbva-security-profile-widget-shared-styles")]}static get properties(){return{items:{type:Array},scopedItems:{type:Array},content:{type:Array},isCompromised:{type:Number},compromisedValue:{type:Number},isNativeIos:{type:Boolean},allAlerts:{type:Array},autofill:{type:Object},harmfulApps:{type:Array}}}constructor(){super(),this.items=[],this.content=[{content:n`
          <bbva-notification-contextual icon-close="" loading="" head-title="" body-text=""
                                        link-text=""></bbva-notification-contextual>`}],this.scopedItems=[{tagName:"bbva-notification-contextual",class:re}],this.isCompromised={},this.compromisedValue=0,this.isNativeIos=!1,this.harmfulApps=[],this.allAlerts=[{id:"screenLock",fn:"_checkScreenLocked",title:"bbva-feature-security-device-alerts-widget-screenLock-title",text:"bbva-feature-security-device-alerts-widget-screenLock-text",link:"bbva-feature-security-device-alerts-widget-link"},{id:"passStrength",fn:"_getPassStrength",title:"bbva-feature-security-device-alerts-widget-passStrength-title",text:"bbva-feature-security-device-alerts-widget-passStrength-text",link:"bbva-feature-security-device-alerts-widget-link"},{id:"deviceRisk",fn:"_checkRisk",title:"bbva-feature-security-device-alerts-widget-deviceRisk-title",text:"bbva-feature-security-device-alerts-widget-deviceRisk-text",link:"bbva-feature-security-device-alerts-widget-link"},{id:"deviceAlteredRooted",fn:"_getIsRooted",title:"bbva-feature-security-device-alerts-widget-deviceAlteredRooted-title",text:"bbva-feature-security-device-alerts-widget-deviceAlteredRooted-text",link:"bbva-feature-security-device-alerts-widget-link"},{id:"deviceAlteredDebugDev",fn:"_checkDevAltered",title:"bbva-feature-security-device-alerts-widget-deviceAlteredDebugDev-title",text:"bbva-feature-security-device-alerts-widget-deviceAlteredDebugDev-text",link:"bbva-feature-security-device-alerts-widget-link"},{id:"deviceAlteredIntegrity",fn:"_checkIntegrity",title:"bbva-feature-security-device-alerts-widget-deviceAlteredIntegrity-title",text:"bbva-feature-security-device-alerts-widget-deviceAlteredIntegrity-text",link:"bbva-feature-security-device-alerts-widget-link"},{id:"autofill",fn:"_getAutofill",title:"bbva-feature-security-device-alerts-widget-autofill-title",text:"bbva-feature-security-device-alerts-widget-autofill-text",link:"bbva-feature-security-device-alerts-widget-link"}]}_buildHtml(e){return{content:n`
          <bbva-notification-contextual
            icon-close
            id="${e.id}"
            variant="warning"
            head-title="${this.t(e.title)}"
            link-text="${this.t(e.link)}"
            body-text="${this.t(e.text)}"
            @notification-contextual-icon-click="${()=>this._handleAlertClosed(e.id)}}"
            @notification-contextual-link-click="${()=>{this._handleCardClick(e.id)}}">
          </bbva-notification-contextual>`}}async _handleCardClick(e){const t=await this._getDeviceAccesses(),i={alertType:e,hasLinkText:this.isNativeIos||"deviceAlteredRooted"===e};this.__fireEvent("navigation-alert-clicked",i),this.__fireEvent("device-alerts-fido-enrolled",t),this.__fireEvent("device-alerts-harmful-apps",this.harmfulApps)}async _handleAlertClosed(e){await this._setDiscardedDevicedAlerts(e),this.requestUpdate()}get deviceInfo(){return this.shadowRoot.querySelector('[data-tag-name="bbva-nativeconnector-device-info"]')}get deviceChecker(){return this.shadowRoot.querySelector('[data-tag-name="bbva-nativeconnector-device-checker"]')}get localStorage(){return this.shadowRoot.querySelector('[data-tag-name="bbva-nativeconnector-local-storage"]')}async getAlerts(){return await this.updateComplete,this._checkAlerts().then((e=>{if(e.length){const t=e.filter((e=>e)).map((e=>this._buildHtml(e)));return n`
          ${t.length>0?n`
              <bbva-type-text
              size="M"
              inherit
              ambient="light"
              ambient-color="secondary500"
              font-weight="500"
              text="${this.t(`bbva-feature-security-device-alerts-${t.length>1?"multiple-alerts":"one-alert"}-title`)}">
            </bbva-type-text>`:g}
          <bbva-carousel-default 
            type="${t.length>1?"swipe":""}"
            .items="${t}"
            hide-gradient
            .scopedComponents="${this.scopedItems}"
          ></bbva-carousel-default>`}return g})).catch((()=>g))}async _checkAlerts(){const e=await this._getDiscardedDeviceAlerts()||[],t=this.allAlerts.filter((t=>t&&!e.includes(t.id))).map((async e=>this[e.fn]().then((t=>!!t&&{id:e.id,title:e.title,link:e.link,text:e.text})).catch((t=>({id:e.id,err:t})))));return Promise.all(t)}_getAutofill(){var e;return Promise.resolve(null===(e=this.autofill)||void 0===e?void 0:e.isAutofilled)}_checkScreenLocked(){return this.deviceInfo.isDeviceSecure().then((e=>!e)).catch((()=>!1))}_checkRisk(){const e=[this.__checkFrida(),...this.isNativeIos?[this.__checkMagisk()]:[]];return Promise.all(e).then((e=>{const[t,i]=e,a=i?i[2]:[];return!(!t&&!a.length)&&(this.harmfulApps=[],this.harmfulApps=[...this.isNativeIos?a:[]],!0)}))}__checkFrida(){const e=this.isNativeIos?"checkExternalTools":"getFridaComplete";return this.deviceChecker[e]().then((e=>this.isNativeIos?e:Object.values(e).some((e=>e)))).catch((()=>!1))}__checkMagisk(){return this.deviceChecker.getMagiskComplete().catch((()=>!1))}_getPassStrength(){var e;return Promise.resolve((null===(e=this.isCompromised)||void 0===e?void 0:e.compromised)>this.compromisedValue)}_checkDevAltered(){if(this.isNativeIos)return Promise.resolve(!1);const e=[this.__checkDeveloper(),this.__checkDebug()];return Promise.all(e).then((e=>e.every((e=>e))))}async _getIsRooted(){const{value:e}=await this.localStorage.get({key:"isRootEnabled"}).catch((()=>{}))||{};return e}_checkIntegrity(){return this.isNativeIos?this.deviceChecker.checkSourceIntegrity().catch((()=>!1)):Promise.resolve(!1)}__checkDebug(){return this.deviceChecker.getDebug().catch((()=>!1))}__checkDeveloper(){return this.deviceChecker.getDeveloper().catch((()=>!1))}_getDeviceAccesses(){return this.localStorage.get({key:"deviceAccesses"}).catch((()=>{}))}_getDiscardedDeviceAlerts(){return this.localStorage.get({key:"discardedDeviceAlerts"}).catch((()=>{}))}async _setDiscardedDevicedAlerts(e){const t=await this._getDiscardedDeviceAlerts()||[];t.push(e),this.localStorage.set({key:"discardedDeviceAlerts",value:t})}__fireEvent(e,t){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}static _getSkeleton(){return n`<bbva-notification-contextual icon-close="" loading="" head-title="" body-text="" link-text=""></bbva-notification-contextual>`}render(){return n`
        <bbva-nativeconnector-local-storage></bbva-nativeconnector-local-storage>
        <bbva-nativeconnector-device-info></bbva-nativeconnector-device-info>
        <bbva-nativeconnector-device-checker></bbva-nativeconnector-device-checker>
        ${Fe(this.getAlerts(),yi._getSkeleton())}
    `}}var fi=r`:host {
  display: block;
  overflow-x: hidden;
  background-color: var(--colorsSecondary100, ${b(y.secondary100)});
  --bbva-header-main-bg-color: var(--colorsSecondary100, ${b(y.secondary100)});
  --bbva-header-main-color: var(--colorsSecondary600, ${b(y.secondary600)});
  --bbva-transition-container-text-align: left;
  --bbva-transition-container--custom--primary-ambient--content-bg-color: var(--colorsSecondary100, ${b(y.secondary100)});
  --bbva-transition-container-padding-bottom: 0;
}
:host .security-settings-container {
  padding: 1rem 0;
}
:host .security-settings-container [data-tag-name=bbva-panel-container]:not(.tips-container, .lattest-container) {
  padding: 0 1rem;
  display: block;
  margin-bottom: 1rem;
}
:host [data-tag-name=bbva-header-main] {
  padding-top: 0;
}
:host .alerts {
  animation: grow 1s ease-in-out forwards;
  -webkit-animation: grow 1s ease-in-out forwards;
  transition: all 3s ease-out;
}
:host [data-tag-name=bbva-device-alerts-widget] {
  padding-bottom: 1rem;
}
@keyframes grow {
  from {
    max-height: 0;
    opacity: 0.5;
  }
  to {
    max-height: 100%;
    opacity: 1;
  }
}
`;class _i extends(s(Ge(o(a)))){static get is(){return"bbva-feature-security-settings"}static get scopedElements(){return{"bbva-header-main":oe,"bbva-panel-container":se,"bbva-emergency-zone-widget":mt,"bbva-security-profile-widget":Tt,"bbva-security-access-widget":It,"bbva-security-devices-widget":Rt,"bbva-security-privacy-widget":Ot,"bbva-security-tips-widget":Vt,"bbva-security-learn-more-widget":hi,"bbva-security-lattest-widget":gi,"bbva-security-settings-manager":ge,"bbva-device-alerts-widget":yi}}static get styles(){return[fi,l("bbva-feature-security-settings-shared-styles")]}static get properties(){return{dataDonut:{type:Object},headerTitle:{type:String},lastMinuteItems:{type:Array},isPasswordStrengthVisible:{type:Boolean},passwordStrengthText:{type:String},passwordStrengthClass:{type:String},learnMoreItems:{type:Array},pendingAction:{type:Object},pendingConfig:{type:Object},reachedWeightedAverage:{type:Number},cardsKeys:{type:Object},cardsKeysOrder:{type:Array},carouselIds:{type:Array},neutralColor:{type:String},isBiometricAccessVisible:{type:Boolean},isDiscreetModeVisible:{type:Boolean},isAccessKeyManagmentVisible:{type:Boolean},discreetModeStatus:{type:Object},isStEnrolled:{type:Boolean},isBiometryEnrolled:{type:Boolean},currentDevice:{type:Object},currentDeviceTitle:{type:String},loading:{type:Boolean},featureFlags:{type:Object},isAppPermissionVisible:{type:Boolean},hideDevices:{type:Boolean},menuAccessibilityText:{type:String},isCompromised:{type:Object},isNativeIos:{type:Boolean},isAutofill:{type:Object}}}constructor(){super(),this.headerTitle="bbva-feature-security-settings-title",this.neutralColor="#f4f4f4",this.cardsKeys={deviceAlerts:"_renderAlerts",emergency:"_renderEmergencyZone",securityProfile:"_renderSecurityProfile",access:"_renderSecurityAccess",devices:"_renderSecurityDevices",privacity:"_renderSecurityPrivacy",securityTips:"_renderSecurityTips",learnMore:"_renderSecurityLearnMore",lastMinute:"_renderSecurityLattest"},this.cardsKeysOrder=[],this.isBiometricAccessVisible=!1,this.isStEnrolled=!1,this.isBiometryEnrolled=!1,this.loading=!0,this.hideDevices=!1,this.isLogged=JSON.parse(window.sessionStorage.getItem("isLogged"))}firstUpdated(){this._checkUserSession()}_checkUserSession(){this.isLogged&&this.__fireEvent("swipe-menu-enabled",!0)}render(){return n`
      ${this._renderHeader()}
      <div class="security-settings-container">
        ${this.cardsKeysOrder.map((e=>this[this.cardsKeys[e]]))}
      </div>
    `}get _renderAlerts(){return n`
        <div class="alerts">
            <bbva-device-alerts-widget .isCompromised="${this.isCompromised}" .autofill="${this.isAutofill}" .isNativeIos="${this.isNativeIos}"></bbva-device-alerts-widget>
        </div>`}get _alertWidget(){return this.renderRoot.querySelector('[data-tag-name="bbva-device-alerts-widget"]')}updateAlertWidget(){this._alertWidget.requestUpdate()}_headerButtons(){const e=[];return this.isLogged&&e.push({id:"btn-menu",icon:z(),accessibilityText:this.menuAccessibilityText}),e}_renderHeader(){return n`
      <bbva-header-main
        .buttons=${this._headerButtons()}
        class-name="security-settings-header"
        ambient="light"
        variant="first-level-sequential"
        show-left-icon
        @header-main-icon-click="${this.fireBackStep}"
        text="${this.t(this.headerTitle)}"
      >
      </bbva-header-main>
    `}get _renderEmergencyZone(){return n`
      <bbva-panel-container
        panel-color="primary-alt"
      >
        <bbva-emergency-zone-widget
        ></bbva-emergency-zone-widget>
      </bbva-panel-container>
    `}get _renderSecurityProfile(){return n`
      <bbva-panel-container
        panel-color="primary-alt"
      >
        <bbva-security-profile-widget
            .dataDonut="${this.dataDonut}"
            .pendingConfig=${this.pendingConfig}
            .pendingAction=${this.pendingAction}
            .dataWidgetTitle="${this.donutTitle}"
            .dataWidgetDescription="${this.donutDescription}"
        ></bbva-security-profile-widget>
      </bbva-panel-container>
    `}get _renderSecurityAccess(){return n`
      <bbva-panel-container
        id="accessWidget"
        panel-color="primary-alt"
      >
        <bbva-security-access-widget
          id="securityAccessWidget"
          .isPasswordStrengthVisible="${this.isPasswordStrengthVisible}"
          .passwordStrengthText="${this.passwordStrengthText}"
          .passwordStrengthClass="${this.passwordStrengthClass}"
          .isBiometricAccessVisible="${this.isBiometricAccessVisible}"
          .isStEnrolled="${this.isStEnrolled}"
          .isBiometryEnrolled="${this.isBiometryEnrolled}"
          .isAccessKeyManagmentVisible="${this.isAccessKeyManagmentVisible}"
          ></bbva-security-access-widget>
      </bbva-panel-container>
     </div>
    `}get _renderSecurityDevices(){return n`
      <bbva-panel-container
        ?hidden=${this.hideDevices}
        panel-color="primary-alt">
      <bbva-security-devices-widget
        .loading=${this.loading}
        .currentDevice=${this.currentDevice}
        .currentDeviceTitle=${this.currentDeviceTitle}
      ></bbva-security-devices-widget>
      </bbva-panel-container>`}get _renderSecurityPrivacy(){return this.isDiscreetModeVisible||this.isAppPermissionVisible?n`
        <bbva-panel-container
          panel-color="primary-alt"
        >
        <bbva-security-privacy-widget
          .isDiscreetModeVisible = "${this.isDiscreetModeVisible}"
          .discreetModeStatus = "${this.discreetModeStatus}"
          .isAppPermissionVisible = "${this.isAppPermissionVisible}"
        ></bbva-security-privacy-widget>
        </bbva-panel-container>
      </div>
      `:""}get _renderSecurityTips(){return n`
      <bbva-panel-container
        panel-color="primary-alt"
      >
      <bbva-security-tips-widget
      ></bbva-security-tips-widget>
      </bbva-panel-container>
      `}get _renderSecurityLearnMore(){return n`
      ${this.learnMoreItems?this._renderLearnMoreItemsSection():""}
    `}_renderLearnMoreItemsSection(){return n`
      <bbva-panel-container class="tips-container"
        panel-color="primary-alt"
      >
        <bbva-security-learn-more-widget
          .items="${this.learnMoreItems}"
          >
        </bbva-security-learn-more-widget>
      </bbva-panel-container>
      `}get _renderSecurityLattest(){return n`
      ${this.lastMinuteItems?this._renderLattestSection():""}
    `}fireBackStep({detail:{index:e}}){e?this.__fireEvent("bbva-header-main-sidebar-icon-clicked"):this.__fireEvent("back-step")}goBack(){this.__fireEvent("go-back-from-security-settings")}widgetClickedLinkNavigation(e){this.__fireEvent("widget-clicked-link",null==e?void 0:e.detail)}async updateAccessWidget(){await this.updateComplete;this.shadowRoot.querySelector("#accessWidget").shadowRoot.querySelector("#securityAccessWidget").updateWidget()}_renderLattestSection(){return n`
      <bbva-panel-container class="lattest-container"
        panel-color="primary-alt"
      >
        <bbva-security-lattest-widget
          .items="${this.lastMinuteItems}"
          >
        </bbva-security-lattest-widget>
      </bbva-panel-container>
      `}__fireEvent(e,t){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}}var Ai=r`:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--colorsSecondary100, ${b(y.secondary100)});
}
:host .security-profile-pending-actions-data-container {
  --bbva-data-visualization-donut-padding: 0;
}
:host .security-profile-pending-actions-data-container [data-tag-name=bbva-data-visualization-donut] {
  margin-top: 1.5rem;
}
:host [data-tag-name=bbva-type-text].highlighted {
  --_type-text-color: var(--colorsPrimaryCoreLight, ${b(y.primaryCoreLight)});
}
`;class ki extends(s(Ge(o(a)))){static get is(){return"bbva-security-profile-pending-actions-widget"}static get scopedElements(){return{"bbva-data-visualization-donut":Ct,"bbva-type-text":G}}static get styles(){return[Ai,l("bbva-security-profile-pending-actions-widget-shared-styles")]}static get properties(){return{securityProfilePendingActionsDescription:{type:String},securityProfilePendingActionsTitle:{type:String},dataDonut:{type:Array},pendingConfig:{type:Object},pendingAction:{type:Object},innerRadius:{type:Number}}}constructor(){super(),this.pendingAction={},this.pendingConfig={}}render(){return n`
      ${this._renderSecurityProfilePendingActionsWidget()}`}_renderSecurityProfilePendingActionsWidget(){return n`
      <div
      class="security-profile-pending-actions-data-container"
      style="display: flex; flex-direction: row; justify-content: space-between"
      >
        <div style="padding-right:1rem">
          <bbva-type-text
            size="XL"
            font-weight="500"
            lines="3"
            text="${this.securityProfilePendingActionsTitle}">
          </bbva-type-text>
          <bbva-type-text
            size="S"
            font-weight="350"
            text="${this.securityProfilePendingActionsDescription}">
          </bbva-type-text>
        </div>
        <bbva-data-visualization-donut
          ambient="light100"
          type="icon"
          size="L"
          inner-radius="${this.innerRadius}"
          .data="${this.dataDonut}"
          icon-name="${f()}"
          >
        </bbva-data-visualization-donut>
      </div>
      `}}var Si=r`:host {
  display: block;
  box-sizing: border-box;
  padding-bottom: 0px;
}
:host [data-tag-name=bbva-list-link] {
  padding: 0px;
}
:host .dark {
  --_type-link--with-icon-text-color: var(--colorsSecondary600, ${b(y.secondary600)});
  --_type-link--with-icon-icon-color: var(--colorsSecondary600, ${b(y.secondary600)});
  opacity: 1;
}

.item-cards-section-badge-title {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: center;
}

.item-cards-section-link-title {
  --bbva-list-link-heading-link-color: var(--colorsSecondary500, ${b(y.secondary500)});
  padding: 1rem 0;
}

.item-cards-list-container {
  background-color: #FFFFFF;
}

.item-cards-list-conditional {
  display: inline-flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: center;
}
.item-cards-list-conditional [data-tag-name=bbva-type-icon] {
  margin-right: 0.5rem;
}

.item-cards-list {
  padding: 1rem;
  padding-bottom: 0.5rem;
}
.item-cards-list [data-tag-name=bbva-type-link] {
  padding: 0;
}

[data-tag-name=bbva-divider-default]:last-of-type {
  display: none;
}

:host [data-tag-name=bbva-type-text].compromised {
  --_type-text-color: var(--colorsTertiaryType5Dark, ${b(y.tertiaryType5Dark)});
}
:host [data-tag-name=bbva-type-text].high {
  --_type-text-color: var(--colorsTertiaryType6Dark, ${b(y.tertiaryType6Dark)});
}
:host [data-tag-name=bbva-type-text].medium {
  --_type-text-color: var(--colorsTertiaryType3Dark, ${b(y.tertiaryType3Dark)});
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class wi extends(s(Ge(o(a)))){static get is(){return"bbva-item-cards-list-widget"}static get scopedElements(){return{"bbva-list-link":c,"bbva-type-text":G,"bbva-type-icon":ie,"bbva-type-link":ne,"bbva-badge-notification":be,"bbva-divider-default":ce}}static get styles(){return[Si,l("bbva-item-cards-list-widget-shared-styles")]}static get properties(){return{sectionTitle:{type:String},linkText:{type:String},linkVisibility:{type:Boolean},items:{type:Array},isBadgeTitle:{type:Boolean},isStEnrolled:{type:Boolean},softokenNotEnrolledText:{type:String}}}constructor(){super(),this.linkVisibility=!1,this.linkText="bbva-item-card-list-link-text",this.items=[],this.isStEnrolled=!1,this.softokenNotEnrolledText="bbva-security-profile-page-softoken-not-enrolled"}updated(e){e.has("linkVisibility")&&this._setLinkText()}render(){return n`
      ${this.sectionTitle?this._renderSectionTitle():this._renderGap()}
      ${this._renderList()}
    `}_renderGap(){return n`
      <div style="height:16px;"></div>
    `}_renderSectionTitle(){return n`
      ${this.isBadgeTitle?this._renderBadgeTitle():this._renderLinkTitle()}
    `}_renderBadgeTitle(){return n`
      <div class='item-cards-section-badge-title'>
        <bbva-type-text
          size="S"
          ambient="light"
          ambient-color="secondary500"
          font-weight="500"
          text="${this.t(this.sectionTitle)}">
        </bbva-type-text>
        <bbva-badge-notification
          text="${this.items.length}"
          ambient="light100"
        ></bbva-badge-notification>
      </div>`}_renderLinkTitle(){return n`
      <div class='item-cards-section-link-title'>
      <bbva-list-link
          header-text="${this.t(this.sectionTitle)}"
          link-text="${this.t(this.linkText)}"
          @list-link-click="${this.fireCardListWidgetLink}">
        </bbva-list-link>
      </div>`}_setLinkText(){this.linkText=this.linkVisibility?this.linkText:""}_renderList(){return n`
      <div class="item-cards-list-container">
        ${this.items.map((e=>this._renderCard(e)))}
      </div>`}_renderCard(e){return n`
        <div class="item-cards-list" id=${e.id}>
          <bbva-type-link
          class="${"biometry"!==e.id||this.isStEnrolled?"":"dark"}"
          icon-size=24
          icon="${q[e.icon]()}"
          @click=${()=>this.navigateToCardItem(e.navigation,e.id)}
          ?disabled="${"biometry"===e.id&&!this.isStEnrolled}"
          >
          ${e.title}
        </bbva-type-link>
          <bbva-type-text
            lines="6"
            text="${e.subtitle}">
          </bbva-type-text>
          ${e.additionalMessage?this._renderAdditionalMessage(e.additionalMessage,e.additionalMessageClass):""}
          ${"biometry"!==e.id||this.isStEnrolled?"":this._renderConditionalAction("bbvaInfo",this.softokenNotEnrolledText)}
        </div>
        <bbva-divider-default></bbva-divider-default>`}_renderConditionalAction(e,t){return n`
    <div class="item-cards-list-conditional">
      <bbva-type-icon class="icon-left" icon-color="#004481" size="18" icon=${q[e]()}></bbva-type-icon>
      <bbva-type-text size="S" text="${this.t(t)}"></bbva-type-text>
    </div>
    `}_renderAdditionalMessage(e,t){return n`
      <bbva-type-text
        size="S"
        font-style="italic"
        class="${t}"
        ambient-color="${t?"":"secondary500"}"
        text="${e}">
      </bbva-type-text>
    `}fireCardListWidgetLink(){this.__fireEvent("card-list-widget-clicked-link")}navigateToCardItem(e,t){this.__fireEvent(`navigate-to-${e}`,t)}__fireEvent(e,t){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}}var $i=r`:host {
  display: block;
  overflow-x: hidden;
  background-color: var(--colorsSecondary100, ${b(y.secondary100)});
  --bbva-header-main-bg-color: var(--colorsSecondary100, ${b(y.secondary100)});
  --bbva-header-main-color: var(--colorsSecondary600, ${b(y.secondary600)});
  --bbva-panel-container-columns: 2;
  --bbva-list-link-heading-color: var(--colorsPrimaryCoreLight, ${b(y.primaryCoreLight)});
  --bbva-transition-container--custom--primary-ambient--content-bg-color: var(--colorsSecondary100, ${b(y.secondary100)});
  --bbva-transition-container-padding-bottom: 0;
  --bbva-help-modal-footer-padding: 24px 16px;
}
:host .security-settings-carousel [data-tag-name=bbva-type-text] {
  margin-left: 1rem;
}
:host .security-settings-carousel [data-tag-name=bbva-notification-contextual] {
  padding: 0 1rem;
}
:host .security-profile-page-container {
  display: flex;
  flex-direction: column;
  padding: 1rem;
  padding-top: 0px;
}
:host [slot=slot-content] [data-tag-name=bbva-type-text] {
  padding: 0.5rem 0 1.5rem 0;
}
:host [slot=slot-content] [data-tag-name=bbva-list-bullet] {
  padding: 0.25rem 0;
}
:host [data-tag-name=bbva-header-main] {
  padding-top: 0;
}
`;class xi extends(s(Ge(o(a)))){static get is(){return"bbva-feature-security-profile-page"}static get scopedElements(){return{"bbva-header-main":oe,"bbva-panel-container":se,"bbva-security-profile-pending-actions-widget":ki,"bbva-notification-contextual":re,"bbva-security-learn-more-widget":hi,"bbva-security-lattest-widget":gi,"bbva-item-cards-list-widget":wi,"bbva-list-link":c,"bbva-help-modal":ue,"bbva-type-text":G,"bbva-clip-microillustration":ae,"bbva-list-bullet":_e}}static get styles(){return[$i,l("bbva-feature-security-profile-page-shared-styles")]}static get properties(){return{dataDonut:{type:Object},donutTitle:{type:String},donutDescription:{type:String},neutralColor:{type:String},headerTitle:{type:String},lastMinuteItems:{type:Array},learnMoreItems:{type:Array},securityProfileItems:{type:Array},pendingAction:{type:Object},pendingConfig:{type:Object},reachedWeightedAverage:{type:Number},completedActionsLink:{type:String},completedActionsLinkVisibility:{type:Boolean},accessibilityCompletedActionsLinkText:{type:String},mainPendingActions:{type:Array},mainPendingActionsTitle:{type:String},mediumPendingActions:{type:Array},mediumPendingActionsTitle:{type:String},pendingActionsTitle:{type:String},mainPendingActionsVisibility:{type:Boolean},pendingActionsItems:{type:Number},linkVisibility:{type:Boolean},notificationProfileTitle:{type:String},notificationProfileBody:{type:String},notificationProfileLink:{type:String},contentEllipsisLines:{type:Number},modalActionConfiguration:{type:Object},modalActions:{type:Object},isStEnrolled:{type:Boolean},menuAccessibilityText:{type:String},dontShowModals:{type:Boolean}}}constructor(){super(),this.isStEnrolled=!1,this.headerTitle="bbva-feature-security-profile-page-title",this.completedActionsLinkVisibility=!1,this.completedActionsLink="bbva-profile-completed-actions-link",this.accessibilityCompletedActionsLinkText="bbva-profile-completed-actions-link-accessibility-text",this.neutralColor="#ffffff",this.mediumPendingActions=[],this.mainPendingActionsVisibility=!1,this.mainPendingActionsTitle="bbva-item-card-list-badge-title",this.mediumPendingActions=[],this.mediumPendingActionsTitle="bbva-item-card-list-link-title",this.pendingActionsTitle="bbva-item-card-list-pending-actions-title",this.notificationProfileTitle="bbva-feature-security-profile-page-notification-title",this.notificationProfileBody="bbva-feature-security-profile-page-notification-body",this.notificationProfileLink="bbva-feature-security-profile-page-notification-link",this.dontShowModals=!1,this.modalActionConfiguration={idModal:"",fullHeight:!0,iOSFixedHeader:!0,headerText:"",titleText:"",illustration:"",descriptionText:"",buttonText:"",fixedFooter:!0,actionOnAccept:""},this.actionModals={push_notifications:{idModal:"push_notifications",fullHeight:!0,iOSFixedHeader:!0,headerText:"security-settings-bbva-help-modal-push_notifications-header-text",titleText:"security-settings-bbva-help-modal-push_notifications-title-text",illustration:"security-settings-bbva-help-modal-push_notifications-microillustration",descriptionText:"security-settings-bbva-help-modal-push_notifications-description-text",buttonText:"security-settings-bbva-help-modal-push_notifications-button-text",fixedFooter:!0,actionOnAccept:"go-to-activate-notifications"},identity_document:{idModal:"identity_document",fullHeight:!0,iOSFixedHeader:!0,headerText:"security-settings-bbva-help-modal-identity_document-header-text",titleText:"security-settings-bbva-help-modal-identity_document-title-text",illustration:"security",descriptionText:"security-settings-bbva-help-modal-identity_document-description-text",buttonText:"security-settings-bbva-help-modal-identity_document-button-text",fixedFooter:!0,actionOnAccept:"go-to-activate-id"},biometry:{idModal:"biometry",fullHeight:!0,iOSFixedHeader:!0,headerText:"security-settings-bbva-help-modal-biometry-header-text",titleText:"security-settings-bbva-help-modal-biometry-title-text",illustration:"security-settings-bbva-help-modal-biometry-microillustration",descriptionText:"security-settings-bbva-help-modal-biometry-description-text",buttonText:"security-settings-bbva-help-modal-biometry-button-text",fixedFooter:!0,actionOnAccept:"go-to-activate-biometry",bulletList:["security-settings-bbva-help-modal-biometry-bullet-text-first","security-settings-bbva-help-modal-biometry-bullet-text-second"]}},this.isLogged=JSON.parse(window.sessionStorage.getItem("isLogged"))}firstUpdated(){this.__fireEvent("security-profile-page-first-updated")}render(){return n`
      ${this._renderHeader()}
      ${this._renderSecurityActionModal()}
      ${this._renderSecurityProfile()}
      ${this.pendingActionsItems?this._renderProfileWidget():this._renderSuccessProfileSection()}
      ${this.completedActionsLinkVisibility?this._renderCompletedActionsLink():""}
    `}_renderProfileWidget(){return n`
    <div class="security-profile-page-container">
        ${this.mainPendingActionsVisibility?this._renderMainPendingActions():this._renderPendingActions()}
    </div>`}_headerButtons(){const e=[];return this.isLogged&&e.push({id:"btn-menu",icon:z(),accessibilityText:this.menuAccessibilityText}),e}_renderHeader(){return n`
      <bbva-header-main
        .buttons=${this._headerButtons()}
        class-name="security-settings-header"
        ambient="light"
        variant="first-level-sequential"
        show-left-icon
        @header-main-icon-click="${this.goBack}"
        text="${this.t(this.headerTitle)}"
      >
      </bbva-header-main>
    `}_renderSecurityActionModal(){return n`
      <bbva-help-modal
        .idModal="${this.t(this.modalActionConfiguration.idModal)}"
        ?full-height="${this.t(this.modalActionConfiguration.fullHeight)}"
        ?i-o-s-fixed-header="${this.t(this.modalActionConfiguration.iOSFixedHeader)}"
        header-text="${this.t(this.modalActionConfiguration.headerText)}"
        ?fixed-footer="${this.t(this.modalActionConfiguration.fixedFooter)}"
        button-text="${this.t(this.modalActionConfiguration.buttonText)}"
        @help-modal-footer-button-click="${this.goToModalAction}">
        ${this._getModalSlotTitle()}
        ${this._getModalSlotContent()}
      </bbva-help-modal>
    `}goToModalAction(){this.__fireEvent(`${this.modalActionConfiguration.actionOnAccept}`)}_getModalSlotTitle(){return n`
      <div class="content" slot="slot-title">
        <bbva-clip-microillustration
          microillustration="${this.t(this.modalActionConfiguration.illustration)}"
          size="M">
        </bbva-clip-microillustration>
        <bbva-type-text
          id="title-text"
          text=${this.t(this.modalActionConfiguration.titleText)}
          ?hidden="${!this.modalActionConfiguration.titleText}"
          ellipsis
          unset
          size="XL"
          font-weight="500"
          tag="h2"
        >
        </bbva-type-text>
      </div>
    `}_getModalSlotContent(){return n`
      <div class="content" slot="slot-content">
        <bbva-type-text
          id="description-text"
          text=${this.t(this.modalActionConfiguration.descriptionText)}
          ?hidden="${!this.modalActionConfiguration.descriptionText}"
          size="S"
          ellipsis
          lines="3"
          unset
        >
        </bbva-type-text>
        ${this.modalActionConfiguration.bulletList?this.modalActionConfiguration.bulletList.map((e=>n`<bbva-list-bullet text=${this.t(e)}></bbva-list-bullet>`)):""}
      </div>
    `}async _openModal(){var e;this.dontShowModals?this.__fireEvent(null===(e=this.modalActionConfiguration)||void 0===e?void 0:e.actionOnAccept):(await this.updateComplete,this.renderRoot.querySelector('[data-tag-name="bbva-help-modal"]').open())}_openPushNotificationsModal(){this.modalActionConfiguration=this.actionModals.push_notifications,this._openModal()}_openIdentityDocumentModal(){this.modalActionConfiguration=this.actionModals.identity_document,this._openModal()}_openBiometryModal(){this.modalActionConfiguration=this.actionModals.biometry,this._openModal()}_renderItemCardsListWidget(e,t,i,a){return n`
      <bbva-item-cards-list-widget
        .isStEnrolled= "${this.isStEnrolled}"
        .isBadgeTitle="${e}"
        .sectionTitle="${i}"
        .linkVisibility="${a}"
        .items="${t}"
        @navigate-to-push_notifications="${this._openPushNotificationsModal}"
        @navigate-to-identity_document="${this._openIdentityDocumentModal}">
      </bbva-item-cards-list-widget>
    `}_renderMainPendingActions(){return n`
      <bbva-panel-container
        panel-color="primary"
        id="main-pending-actions"
      >
        ${this._renderItemCardsListWidget(!0,this.mainPendingActions,this.mainPendingActionsTitle,this.linkVisibility)}
      </bbva-panel-container>
      <bbva-panel-container
        panel-color="primary"
        id="medium-pending-actions"
      >
      ${this.mediumPendingActions.length?this._renderItemCardsListWidget(!1,this.mediumPendingActions.slice(0,2),this.mediumPendingActionsTitle,this.linkVisibility):""}
       </bbva-panel-container>
    `}_renderPendingActions(){return n`
      <bbva-panel-container
        panel-color="primary"
      >
        ${this._renderItemCardsListWidget(!1,this.mediumPendingActions.slice(0,2),this.pendingActionsTitle,this.linkVisibility)}
      </bbva-panel-container>
    `}_renderSecurityProfile(){return n`
      <bbva-panel-container
       panel-color="primary"
       variant="card"
      >
        <bbva-security-profile-pending-actions-widget
            .dataDonut="${this.dataDonut}"
            .pendingConfig=${this.pendingConfig}
            .pendingAction=${this.pendingAction}
            .pendingActionsItems=${this.pendingActionsItems}
            .securityProfilePendingActionsTitle=${this.donutTitle}
            .securityProfilePendingActionsDescription=${this.donutDescription}
        ></bbva-security-profile-pending-actions-widget>
      </bbva-panel-container>
    `}_renderSuccessProfileSection(){return n`
       <div class="security-settings-carousel">
        ${this._renderNotification()}
        ${this._renderSecurityLearnMore()}
        ${this._renderSecurityLattest()}
      </div>`}_renderNotification(){return n`
      <bbva-notification-contextual
        .contentEllipsisLines="${this.contentEllipsisLines}"
        ambient="primary"
        variant="info"
        head-title="${this.t(this.notificationProfileTitle)}"
        body-text="${this.t(this.notificationProfileBody)}"
        link-text="${this.t(this.notificationProfileLink)}"
        icon-type="${j()}"
        @click="${this.fireProfileNotificationsLink}">
      </bbva-notification-contextual>
    `}_renderSecurityLearnMore(){return n`
      <bbva-panel-container class="tips-container"
        panel-color="primary-alt"
      >
        <bbva-security-learn-more-widget
          .items="${this.learnMoreItems}">
        </bbva-security-learn-more-widget>
      </bbva-panel-container>
      `}_renderSecurityLattest(){return n`
      <bbva-panel-container class="lattest-container"
        panel-color="primary-alt"
      >
        <bbva-security-lattest-widget
          .items="${this.lastMinuteItems}">
        </bbva-security-lattest-widget>
      </bbva-panel-container>
      `}_renderCompletedActionsLink(){return n`
      <bbva-list-link
        id="completed-actions-link"
        link-icon="${x()}"
        accessibility-icon-link-text="${this.t(this.accessibilityCompletedActionsLinkText)}"
        no-header-link
        header-text="${this.t(this.completedActionsLink)}"
        @click="${()=>{this.fireCompletedActionsLink()}}"></bbva-list-link>
    `}fireProfileNotificationsLink(){this.__fireEvent("profile-notifications-link")}fireCompletedActionsLink(){this.__fireEvent("completed-actions-link")}goBack({detail:{index:e}}){e?this.__fireEvent("bbva-header-main-sidebar-icon-clicked"):this.__fireEvent("back-step")}__fireEvent(e,t){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}}var Di=r`:host {
  display: block;
  overflow-x: hidden;
  background-color: var(--colorsSecondary100, ${b(y.secondary100)});
  --bbva-header-main-bg-color: var(--colorsSecondary100, ${b(y.secondary100)});
  --bbva-header-main-color: var(--colorsSecondary600, ${b(y.secondary600)});
  --bbva-list-link-heading-color: var(--colorsPrimaryCoreLight, ${b(y.primaryCoreLight)});
  --bbva-transition-container--custom--primary-ambient--content-bg-color: var(--colorsSecondary100, ${b(y.secondary100)});
  --bbva-transition-container-padding-bottom: 0;
}

:host [data-tag-name=bbva-header-main] {
  padding-top: 0;
}

.security-profile-pending-actions-page-container {
  display: flex;
  flex-direction: column;
  padding: 1rem;
  padding-top: 0px;
}
`;class Pi extends(s(Ge(o(a)))){static get is(){return"bbva-feature-security-profile-pending-actions"}static get scopedElements(){return{"bbva-header-main":oe,"bbva-panel-container":se,"bbva-item-cards-list-widget":wi}}static get styles(){return[Di,l("bbva-feature-security-profile-pending-actions-shared-styles")]}static get properties(){return{headerTitle:{type:String},mediumPendingActions:{type:Array},menuAccessibilityText:{type:String}}}constructor(){super(),this.headerTitle="bbva-feature-security-profile-pending-actions-title",this.isLogged=JSON.parse(window.sessionStorage.getItem("isLogged"))}render(){return n`
      ${this._renderHeader()}
      <div class="security-profile-pending-actions-page-container">
        ${this._renderPendingActions()}
      </div>
    `}_headerButtons(){const e=[];return this.isLogged&&e.push({id:"btn-menu",icon:z(),accessibilityText:this.menuAccessibilityText}),e}_renderHeader(){return n`
      <bbva-header-main
        .buttons=${this._headerButtons()}
        class-name="security-settings-header"
        ambient="light"
        variant="first-level-sequential"
        show-left-icon
        @header-main-icon-click="${this.goBack}"
        text="${this.t(this.headerTitle)}"
      >
      </bbva-header-main>
    `}_renderItemCardsListWidget(e,t,i){return n`
      <bbva-item-cards-list-widget
        .isBadgeTitle="${e}"
        .sectionTitle="${i}"
        .items="${t}">
      </bbva-item-cards-list-widget>
    `}_renderPendingActions(){return n`
      <bbva-panel-container
        panel-color="primary"
      >
        ${this._renderItemCardsListWidget(!1,this.mediumPendingActions,"")}
      </bbva-panel-container>
    `}goBack({detail:{index:e}}){e?this.__fireEvent("bbva-header-main-sidebar-icon-clicked"):this.__fireEvent("back-step")}__fireEvent(e,t){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}}var Ci=r`:host {
  display: block;
  box-sizing: border-box;
  padding-bottom: 0px;
  --bbva-type-icon-color: var(--colorsTertiaryType6Dark, ${b(y.tertiaryType6Dark)});
}

.item-text-list-container {
  background-color: #f4f4f4;
}

.item-text-list {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: center;
}

[data-tag-name=bbva-divider-default]:last-of-type {
  display: none;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class Ei extends(s(Ge(o(a)))){static get is(){return"bbva-items-text-list-widget"}static get scopedElements(){return{"bbva-type-icon":ie,"bbva-type-text":G,"bbva-divider-default":ce}}static get styles(){return[Ci,l("bbva-items-text-list-widget-shared-styles")]}static get properties(){return{items:{type:Array}}}constructor(){super(),this.items=[]}render(){return n`
      <div class="item-text-list-container">
        ${this.items.map((e=>this._renderItem(e)))}
      </div>
    `}_renderItem(e){return n`
        <div class="item-text-list">
          <bbva-type-text
            lines="6"
            font-weight="500"
            text="${e.completedTitle||e.title}">
          </bbva-type-text>
          <bbva-type-icon
            icon-color="green"
            size="24"
            icon="${H()}">
          </bbva-type-icon>
        </div>
        <bbva-divider-default></bbva-divider-default>`}}var Ti=r`:host {
  display: block;
  overflow-x: hidden;
  background-color: var(--colorsSecondary100, ${b(y.secondary100)});
  --bbva-header-main-bg-color: var(--colorsSecondary100, ${b(y.secondary100)});
  --bbva-header-main-color: var(--colorsSecondary600, ${b(y.secondary600)});
  --bbva-transition-container--custom--primary-ambient--content-bg-color: var(--colorsSecondary100, ${b(y.secondary100)});
  --bbva-transition-container-padding-bottom: 0;
}

:host [data-tag-name=bbva-header-main] {
  padding-top: 0;
}

body {
  background-color: var(--colorsSecondary100, ${b(y.secondary100)});
}

.security-profile-completed-actions-container {
  padding: 1rem;
}
`;class Li extends(s(Ge(o(a)))){static get is(){return"bbva-feature-security-profile-completed-actions"}static get scopedElements(){return{"bbva-header-main":oe,"bbva-panel-container":se,"bbva-items-text-list-widget":Ei}}static get styles(){return[Ti,l("bbva-feature-security-profile-completed-actions-shared-styles")]}static get properties(){return{headerTitle:{type:String},completedActions:{type:Array},menuAccessibilityText:{type:String}}}constructor(){super(),this.headerTitle="bbva-feature-security-profile-completed-actions-title",this.isLogged=JSON.parse(window.sessionStorage.getItem("isLogged"))}firstUpdated(){this.__fireEvent("security-profile-completed-actions-page-first-updated")}render(){return n`
      ${this._renderHeader()}
      <div class="security-profile-completed-actions-container">
        ${this._renderItemTextListWidget()}
      </div>
    `}_headerButtons(){const e=[];return this.isLogged&&e.push({id:"btn-menu",icon:z(),accessibilityText:this.menuAccessibilityText}),e}_renderHeader(){return n`
      <bbva-header-main
        .buttons=${this._headerButtons()}
        class-name="security-settings-header"
        ambient="light"
        variant="first-level-sequential"
        show-left-icon
        @header-main-icon-click="${this.goBack}"
        text="${this.t(this.headerTitle)}"
      >
      </bbva-header-main>
    `}_renderItemTextListWidget(){return n`
      <bbva-panel-container
        panel-color="primary"
      >
        <bbva-items-text-list-widget
        .items="${this.completedActions}"></bbva-items-text-list-widget>
      </bbva-panel-container>
    `}goBack({detail:{index:e}}){e?this.__fireEvent("bbva-header-main-sidebar-icon-clicked"):this.__fireEvent("back-step")}__fireEvent(e,t){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}}var Ii=r`:host {
  display: block;
  box-sizing: border-box;
  --bbva-transition-container-padding: 0;
  --bbva-transition-container-content-bg-color: var(--colorsSecondary100, ${b(y.secondary100)});
  --bbva-transition-container--custom--primary-ambient--content-bg-color: var(--colorsSecondary100, ${b(y.secondary100)});
}

:host([hidden]), [hidden] {
  display: none !important;
}

.header-container {
  position: sticky;
  top: 0;
  z-index: -3;
  color: white;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class Mi extends(s(Ge(o(a)))){static get is(){return"bbva-feature-security-settings-access"}static get securitySettingsManager(){return{"bbva-security-settings-manager":ge,"bbva-security-settings-devices-manager":ht,"bbva-security-navigations-handler":pt}}static get scopedElements(){return{...this.securitySettingsManager,"bbva-transition-container":ve,"bbva-feature-security-settings":_i,"bbva-feature-security-profile-page":xi,"bbva-feature-security-profile-pending-actions":Pi,"bbva-feature-security-profile-completed-actions":Li,"bbva-progress-content":he,"bbva-help-modal":ue}}static get properties(){return{cardsKeysOrder:{type:Array},dataDonut:{type:Object},profileNeutralColor:{type:String},donutTitle:{type:String},donutDescription:{type:String},pendingAction:{type:Object},pendingConfig:{type:Object},pendingActionsItems:{type:Number},mediumPendingActions:{type:Array},mainPendingActions:{type:Array},completedActionsLinkVisibility:{type:Boolean},linkVisibility:{type:Boolean},learnMoreItems:{type:Array},lastMinuteItems:{type:Array},pages:{type:Object},pagesOrder:{type:Array},securitySettingsVisible:{type:Boolean},securityProfileVisible:{type:Boolean},pendingActionsVisible:{type:Boolean},completedActionsVisible:{type:Boolean},completedActions:{type:Array},securitySettings:{type:Object},isNativeIos:{type:Boolean},discreetModeStatus:{type:Object},appSettings:{type:Object},customerContacts:{type:Array},customerDetail:{type:Array},passwordStrength:{type:Object},accessiblePublicItems:{type:Array},isStEnrolled:{type:Boolean},loading:{type:Boolean,reflect:!0},currentDevice:{type:Object},currentDeviceTitle:{type:String},deviceId:{type:String},devicesApiVersion:{type:String},userId:{type:String},country:{type:String},customerId:{type:String},host:{type:String},native:{type:Boolean},appIds:{type:Object},loadingDevice:{type:Boolean},featureFlags:{type:Object},appVersion:{type:String},isAutofill:{type:Object},isBiometryEnrolled:{type:Boolean},isDiscreetModeVisible:{type:Boolean},isAppPermissionVisible:{type:Boolean},isAccessKeyManagmentVisible:{type:Boolean},menuAccessibilityText:{type:String},currentPage:{type:String},modalFidoDeactivateConfiguration:{type:Object},isUserLogged:{type:Boolean}}}constructor(){super(),this.profileNeutralColor="#ffffff",this.securitySettingsVisible=!0,this.securityProfileVisible=!1,this.pendingActionsVisible=!1,this.completedActionsVisible=!1,this.loading=!1,this.isStEnrolled=!1,this.isUserLogged=!1,this.passwordStrength={},this.pagesOrder=["securitySettings","securityProfile","pendingActions","completedActions"],this.pages={securitySettings:!0,securityProfile:!1,pendingActions:!1,completedActions:!1},this.loadingDevice=!0,this.isBiometryEnrolled=!1,this.menuAccessibilityText="Menu",this.modalFidoDeactivateConfiguration={idModal:"deactive_fido",iOSFixedHeader:!0,headerText:"security-settings-bbva-help-modal-deactivate-biometry-header-text",descriptionText:"security-settings-bbva-help-modal-deactivate-biometry-descritpion-text",buttonText:"security-settings-bbva-help-modal-deactivate-biometry-button-text",fixedFooter:!0},this.headerButtons=[{id:"btn-close",name:"Close",icon:M(),accessibilityText:"Close"}]}static get styles(){return[Ii,fi,$i,l("bbva-feature-security-settings-access-shared-styles")]}get managerElement(){return this.shadowRoot.querySelector('[data-tag-name="bbva-security-settings-manager"]')}get securitySettingsElement(){return this.shadowRoot.querySelector('[data-tag-name="bbva-feature-security-settings"]')}get securityAccessWidget(){return this.securitySettingsElement.shadowRoot.querySelector("#accessWidget").shadowRoot.querySelector("#securityAccessWidget")}get devicesManagerElement(){return this.shadowRoot.querySelector('[data-tag-name="bbva-security-settings-devices-manager"]')}get navigationsHandlerElement(){return this.shadowRoot.querySelector('[data-tag-name="bbva-security-navigations-handler"]')}async firstUpdated(){await this.updateComplete,this.managerElement.getDiscreetModeStatus()}updated(e){e.has("appSettings")&&this.managerElement.setSecuritySettings(this.appSettings),e.has("customerContacts")&&this.managerElement.setCustomerContacts(this.customerContacts),e.has("passwordStrength")&&this.managerElement.setPasswordStrength(this.passwordStrength)}async init(){await this.updateComplete,this.manageFeatureFlags(),this.isBiometryEnrolled=await this.managerElement.checkBiometricFlags(),this.managerElement.init(),this.devicesManagerElement.init(),this.navigationsHandlerElement.init()}manageFeatureFlags(){this.isUserLogged=this.managerElement.getIsUserLogged();const e=!0;var t,i,a;this.featureFlags?(this.isDiscreetModeVisible=!!this.isUserLogged&&(null===(t=this.featureFlags)||void 0===t?void 0:t.discreetMode),this.isAppPermissionVisible=null===(i=this.featureFlags)||void 0===i?void 0:i.appPermissions,this.isAccessKeyManagmentVisible=null===(a=this.featureFlags)||void 0===a?void 0:a.accessKeyManagement):(this.isDiscreetModeVisible=this.isUserLogged,this.isAppPermissionVisible=e,this.isAccessKeyManagmentVisible=e)}_setKeysOrder(e){this.cardsKeysOrder=e.detail}_setCurrentDevice(e){this.currentDevice=e.detail}_setCurrentDeviceTitle(e){this.currentDeviceTitle=e.detail}_setLoadingDeviceStatus(e){this.loadingDevice=e.detail}async navigateToSecurityTips(){await this.updateComplete,this.managerElement.navigateToSecurityTips()}async navigateToAccessKeyManagement(){await this.updateComplete,this.managerElement.navigateToAccessKeyManagement()}async updateAuxiliarPasswordStrength(e){await this.updateComplete,this.managerElement.updateAuxiliarPasswordStrength(e)}async updatePasswordStrength(){await this.updateComplete,this.managerElement.updatePasswordStrength()}async navigateToSoftokenEnrollment(){await this.updateComplete,this.managerElement.navigateToSoftokenEnrollment()}async navigateToFidoEnrollment(e){await this.updateComplete,this.managerElement.fireStartFidoEnrollment(e.detail)}async manageSwitchState(e){await this.updateComplete,this.managerElement.manageSwitchState(e)}async navigateToAppPermissions(){await this.updateComplete,this.managerElement.navigateToAppPermissions()}async openNativeSettings(){await this.updateComplete,this.managerElement.openNativeSettings("settings")}async openScreenLockNativeSettings(){await this.updateComplete;const e=this.isNativeIos?"touchIdPasscode":"security";this.managerElement.openNativeSettings(e)}async openAppStore(){await this.updateComplete,this.managerElement.openAppStore()}_setDataDonut(e){this.dataDonut=e.detail}_setDonutTitle(e){this.donutTitle=e.detail}_setDonutDescription(e){this.donutDescription=e.detail}_setPendingConfig(e){this.pendingConfig=e.detail,this.pendingActionsItems=this.pendingConfig.pendingActionsAmount}_setPendingAction(e){this.pendingAction=e.detail}_setMainPendingActions(e){this.mainPendingActions=e.detail}_setMediumPendingActions(e){this.mediumPendingActions=e.detail}_setCompletedActions(e){this.completedActions=e.detail}_setMainPendingActionsVisibility(e){this.mainPendingActionsVisibility=e.detail}_setCompletedActionsLinkVisibility(e){this.completedActionsLinkVisibility=e.detail}_setPendingActionsLinkVisibility(e){this.linkVisibility=e.detail}_setWeightedAvarage(e){this.reachedWeightedAverage=e.detail}_hideDevices(e){this.hideDevices=e}_setBiometricAccessVisible({detail:e}){e&&(this.featureFlags?this.isBiometricAccessVisible=this.featureFlags.biometricAccess:this.isBiometricAccessVisible=!0)}_setDiscreetModeStatus(e){this.discreetModeStatus=e.detail}async getPercentageScoreItems(){await this.updateComplete,this.managerElement.getPercentageScoreItems()}async setBiometryEnrolled(e){this.isBiometryEnrolled=e.detail}async setCustomerDetail(e){await this.updateComplete,this.managerElement.setCustomerDetail(e)}setPasswordStrengthVisibility(e){this.isPasswordStrengthVisible=e.detail}setPasswordStrengthText(e){this.passwordStrengthText=e.detail}setPasswordStrengthClass(e){this.passwordStrengthClass=e.detail}_getLearnMoreItems(e){this.learnMoreItems=e.detail}async getLearnMoreItemAction(e){await this.updateComplete,this.managerElement.getLearnMoreItemAction(e)}_getLastMinuteItems(e){this.lastMinuteItems=e.detail}async getLattestItemAction(e){await this.updateComplete,this.managerElement.getLattestItemAction(e)}async navigateToCurrentDevice(){await this.updateComplete,this.devicesManagerElement.navigateToCurrentDevice(this.currentDevice)}setPageVisibility(e,t){this.navigationsHandlerElement.setPageVisibility(e,t)}async accessToSecurityProfile(){await this.updateComplete,this.__fireEvent("navigate-to-security-profile"),this.openPage("securityProfile")}openPage(e){(this.pages.securityProfile||this.pages.securitySettings)&&this.getPercentageScoreItems(),this.navigationsHandlerElement.openPage(e)}closePage(e){(this.pages.securityProfile||this.pages.securitySettings)&&this.getPercentageScoreItems(),this.navigationsHandlerElement.closePage(e),"securityProfile"===e&&this.__fireEvent("close-page-security-profile")}goBack(){this.shadowRoot.querySelector('[data-tag-name="bbva-feature-security-settings"]').goBack()}updateAccessWidget(){this.shadowRoot.querySelector('[data-tag-name="bbva-feature-security-settings"]').updateAccessWidget()}updatePage(){this.requestUpdate()}alertsUpdate(){this.shadowRoot.querySelector('[data-tag-name="bbva-feature-security-settings"]').updateAlertWidget()}setLoading(e){this.loading=e.detail}manageWidgetClickedLinkNavigation(e){var t;this[{"navigate-to-softoken-enrollment":"navigateToSoftokenEnrollment","navigate-to-pending-action":"managePendingActionsNavigation","learn-more-widget-clicked-item":"getLearnMoreItemAction","lattest-widget-clicked-item":"getLattestItemAction","navigate-to-security-current-device":"navigateToCurrentDevice"}[(null==e||null===(t=e.detail)||void 0===t?void 0:t.event)||(null==e?void 0:e.detail)]||"navigateToExternalPage"](e)}managePendingActionsNavigation(e){var t;const i=null==e||null===(t=e.detail)||void 0===t?void 0:t.data,a={security_tips:"navigate-to-security-tips",register_phone:"navigate-to-phone-number-validation"}[i]||""||e;this[{software_token:"navigateToSoftokenEnrollment",biometry:"navigateToFidoEnrollment"}[i]||"navigateToExternalPage"](a),this.__fireEvent("pending-action-link-clicked",i)}navigateToExternalPage(e){const t=(null==e?void 0:e.detail)||e;"object"==typeof t&&null!==t?this.navigationsHandlerElement.navigateToExternalPage(t.event,t.data):this.navigationsHandlerElement.navigateToExternalPage(t)}async fidoEnrollmentError(){await this.updateComplete,this.managerElement.fidoEnrollmentError()}closeVeil(){Object.values(this.pages).some((e=>!1!==e))&&(this.loading=!1)}async fidoDeactivateModal(){await this.updateComplete,this.shadowRoot.querySelector('[data-tag-name="bbva-help-modal"]').open()}helpModalClose(){this.isBiometryEnrolled=!0,this.securityAccessWidget.updateWidget()}goToDeactivateFidoEnrollment(){this.__fireEvent("security-settings-delete-fido")}__fireEvent(e,t){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}get _securitySettings(){return n`
      <bbva-transition-container
        i-o-s-fixed-header
        ?visible="${Boolean(this.pages.securitySettings)}"
        @transitionend="${this.closeVeil}">
        <div slot="slot-content">
          ${this.pages.securitySettings?n`
          <bbva-feature-security-settings
            .isNativeIos="${this.isNativeIos}"
            .featureFlags="${this.featureFlags}"
            .loading="${this.loadingDevice}"
            .isAutofill="${this.isAutofill}"
            .isCompromised="${this.passwordStrength}"
            .cardsKeysOrder="${this.cardsKeysOrder}"
            .dataDonut="${this.dataDonut}"
            .donutTitle="${this.donutTitle}"
            .donutDescription="${this.donutDescription}"
            .pendingAction="${this.pendingAction}"
            .pendingConfig="${this.pendingConfig}"
            .learnMoreItems="${this.learnMoreItems}"
            .lastMinuteItems="${this.lastMinuteItems}"
            .isBiometricAccessVisible="${this.isBiometricAccessVisible}"
            .isDiscreetModeVisible = "${this.isDiscreetModeVisible}"
            .isAppPermissionVisible = "${this.isAppPermissionVisible}"
            .isAccessKeyManagmentVisible = "${this.isAccessKeyManagmentVisible}"
            .isStEnrolled="${this.isStEnrolled}"
            .discreetModeStatus = "${this.discreetModeStatus}"
            .isBiometryEnrolled = "${this.isBiometryEnrolled}"
            .currentDevice="${this.currentDevice}"
            .currentDeviceTitle="${this.currentDeviceTitle}"
            .isPasswordStrengthVisible="${this.isPasswordStrengthVisible}"
            .passwordStrengthText="${this.passwordStrengthText}"
            .passwordStrengthClass="${this.passwordStrengthClass}"
            .hideDevices="${this.hideDevices}"
            .menuAccessibilityText=${this.menuAccessibilityText}
            @next-step="${()=>this.accessToSecurityProfile()}"
            @back-step="${()=>this.closePage("securitySettings")}"
            @widget-clicked-link="${e=>this.manageWidgetClickedLinkNavigation(e)}"
            @start-fido-enrollment="${e=>this.navigateToFidoEnrollment(e)}"
            @set-switch-state="${e=>this.manageSwitchState(e)}"
            @fido-deactivate-modal="${this.fidoDeactivateModal}"
          >
          </bbva-feature-security-settings>`:g}
        </div>
      </bbva-transition-container>
    `}get _securityProfilePage(){return n`
      <bbva-transition-container
        i-o-s-fixed-header
        ?visible="${Boolean(this.pages.securityProfile)}"
        @transitionend="${this.closeVeil}">
        <div slot="slot-content">
          ${this.pages.securityProfile?n`
    <bbva-feature-security-profile-page
      .isStEnrolled= "${this.isStEnrolled}"
      .dataDonut="${this.dataDonut}"
      .donutTitle="${this.donutTitle}"
      .donutDescription="${this.donutDescription}"
      .pendingAction="${this.pendingAction}"
      .pendingConfig="${this.pendingConfig}"
      .mainPendingActions="${this.mainPendingActions}"
      .mediumPendingActions="${this.mediumPendingActions}"
      .pendingActionsItems=${this.pendingActionsItems}
      .learnMoreItems="${this.learnMoreItems}"
      .lastMinuteItems="${this.lastMinuteItems}"
      .completedActionsLinkVisibility="${this.completedActionsLinkVisibility}"
      .mainPendingActionsVisibility="${this.mainPendingActionsVisibility}"
      .linkVisibility="${this.linkVisibility}"
      .menuAccessibilityText=${this.menuAccessibilityText}
      @back-step="${()=>this.closePage("securityProfile")}"
      @card-list-widget-clicked-link="${()=>this.openPage("pendingActions")}"
      @profile-notifications-link="${()=>this.navigateToSecurityTips()}"
      @completed-actions-link="${()=>this.openPage("completedActions")}"
      @navigate-to-screen_lock="${()=>this.openScreenLockNativeSettings()}"
      @navigate-to-app_update="${()=>this.openAppStore()}"
      @navigate-to-key_recovery_update="${()=>this.navigateToExternalPage({detail:"navigate-to-key-recovery-update"})}"
      @navigate-to-discreet_mode_settings="${()=>this.navigateToExternalPage({detail:"navigate-to-discreet-mode-settings"})}"
      @navigate-to-page_token="${this.navigateToSoftokenEnrollment}"
      @navigate-to-atm_locator="${()=>this.navigateToExternalPage({detail:"navigate-to-atm-locator"})}"
      @navigate-to-phone_validation="${()=>this.navigateToExternalPage({detail:"navigate-to-phone-number-validation"})}"
      @widget-clicked-link="${e=>this.manageWidgetClickedLinkNavigation(e)}"
      @navigate-to-page_biometria="${e=>this.navigateToFidoEnrollment(e)}"
    >
    </bbva-feature-security-profile-page>
    `:g}
        </div>
      </bbva-transition-container>

    `}get _pendingActionsPage(){return n`
      <bbva-transition-container
        i-o-s-fixed-header
        ?visible="${Boolean(this.pages.pendingActions)}"
        @transitionend="${this.closeVeil}">
        <div slot="slot-content">
          ${this.pages.pendingActions?n`
          <bbva-feature-security-profile-pending-actions
            .mediumPendingActions="${this.mediumPendingActions}"
            .menuAccessibilityText=${this.menuAccessibilityText}
            @navigate-to-key-recovery-update="${()=>this.managePendingActionsNavigation({detail:"navigate-to-key-recovery-update"})}"
            @navigate-to-discreet-mode-settings="${()=>this.managePendingActionsNavigation({detail:"navigate-to-discreet-mode-settings"})}"
            @navigate-to-screen_lock="${()=>this.openScreenLockNativeSettings()}"
            @navigate-to-app_update="${()=>this.openAppStore()}"
            @navigate-to-discreet_mode_settings="${()=>this.navigateToExternalPage({detail:"navigate-to-discreet-mode-settings"})}"
            @back-step="${()=>this.closePage("pendingActions")}"
          >
          </bbva-feature-security-profile-pending-actions>
          `:g}
        </div>
      </bbva-transition-container>
    `}get _completedActionsPage(){return n`
      <bbva-transition-container
        i-o-s-fixed-header
        ?visible="${Boolean(this.pages.completedActions)}"
        @transitionend="${this.closeVeil}">
        <div slot="slot-content">
          ${this.pages.completedActions?n`
          <bbva-feature-security-profile-completed-actions
            .completedActions="${this.completedActions}"
            .menuAccessibilityText=${this.menuAccessibilityText}
            @back-step="${()=>this.closePage("completedActions")}"
          >
          </bbva-feature-security-profile-completed-actions>
          `:g}
        </div>
      </bbva-transition-container>
    `}get _securitySettingsDevicesManager(){return n`
      <bbva-security-settings-devices-manager
        .country=${this.country}
        .deviceId=${this.deviceId}
        .userId=${this.userId}
        .customerId="${this.customerId}"
        .host=${this.host}
        .native=${this.native}
        .appIds=${this.appIds}
        .appVersion=${this.appVersion}
        .devicesApiVersion="${this.devicesApiVersion}"
        @set-current-device-title="${this._setCurrentDeviceTitle}"
        @set-current-device="${this._setCurrentDevice}"
        @device-security-settings-manager-error=${()=>{this._hideDevices(!0)}}
        @change-loading-devices-status="${this._setLoadingDeviceStatus}">
      </bbva-security-settings-devices-manager>
    `}get _securitySettingsManager(){return n`
      <bbva-security-settings-manager
        .accessiblePublicItems="${this.accessiblePublicItems}"
        .isNativeIos="${this.isNativeIos}"
        .passwordStrength="${this.passwordStrength}"
        .pages="${this.pages}"
        .isBiometryEnrolled = "${this.isBiometryEnrolled}"
        @updated-learn-more-items="${this._getLearnMoreItems}"
        @updated-last-minute-items="${this._getLastMinuteItems}"
        @update-password-strength-visibility="${this.setPasswordStrengthVisibility}"
        @update-password-strength-text="${this.setPasswordStrengthText}"
        @update-password-strength-class="${this.setPasswordStrengthClass}"
        @update-weighted-average="${this._setWeightedAvarage}"
        @update-data-visualization-donut="${this._setDataDonut}"
        @update-donut-title="${this._setDonutTitle}"
        @update-donut-description="${this._setDonutDescription}"
        @update-pending-actions="${this._setPendingConfig}"
        @update-highlighted-action="${this._setPendingAction}"
        @update-main-pending-actions="${this._setMainPendingActions}"
        @update-medium-pending-actions="${this._setMediumPendingActions}"
        @update-main-pending-actions-visibility="${this._setMainPendingActionsVisibility}"
        @update-completed-actions-link-visibility="${this._setCompletedActionsLinkVisibility}"
        @update-pending-actions-link-visibility="${this._setPendingActionsLinkVisibility}"
        @updated-completed-actions="${this._setCompletedActions}"
        @update-biometric-access-visible="${this._setBiometricAccessVisible}"
        @update-discreet-mode-status="${this._setDiscreetModeStatus}"
        @cards-keys-order="${this._setKeysOrder}"
        @set-biometry-enroll="${this.setBiometryEnroll}"
        @navigate-to-page="${e=>this.navigateToExternalPage(e)}"
        @request-widget-update="${this.updateAccessWidget}"
        @set-biometry-enrolled="${e=>this.setBiometryEnrolled(e)}"
        >
      </bbva-security-settings-manager>
    `}get _securityNavigationsHandler(){return n`
      <bbva-security-navigations-handler
        .pages="${this.pages}"
        .pagesOrder="${this.pagesOrder}"
        .currentPage ="${this.currentPage}"
        @go-back="${this.goBack}"
        @request-update="${this.updatePage}"
        @set-loading="${e=>this.setLoading(e)}"
        >
      </bbva-security-navigations-handler>
    `}get _getSpinner(){return n`
      ${this.loading?n`
            <bbva-progress-content
              class="spinner"
              size="48"
              visible
            ></bbva-progress-content>
          `:n`
          `}
    `}get _renderFidoDeactivateModal(){return this.isUserLogged?n`
      <bbva-help-modal
        .idModal="${this.t(this.modalFidoDeactivateConfiguration.idModal)}"
        modal-type="caution"
        .headerButtons="${this.headerButtons}"
        title-icon="${F()}"
        ?i-o-s-fixed-header="${this.t(this.modalFidoDeactivateConfiguration.iOSFixedHeader)}"
        header-text="${this.t(this.modalFidoDeactivateConfiguration.headerText)}"
        body-text="${this.t(this.modalFidoDeactivateConfiguration.descriptionText)}"
        ?fixed-footer="${this.t(this.modalFidoDeactivateConfiguration.fixedFooter)}"
        button-text="${this.t(this.modalFidoDeactivateConfiguration.buttonText)}"
        @help-modal-footer-button-click="${this.goToDeactivateFidoEnrollment}"
        @help-modal-close=${this.helpModalClose}>
      </bbva-help-modal>
    `:g}render(){return n`
      <div class="header-container">
        ${super.render()}
      </div>
      ${this._securitySettingsManager}
      ${this._securitySettingsDevicesManager}
      ${this._securityNavigationsHandler}
      ${this._securitySettings}
      ${this._securityProfilePage}
      ${this._pendingActionsPage}
      ${this._completedActionsPage}
      ${this._getSpinner}
      ${this._renderFidoDeactivateModal}
    `}}class Ri extends pt{static get is(){return"bbva-security-navigations-handler-mx"}init(){this.__fireEvent("set-loading",!1);const e=this.currentPage||"securityProfile";this.openPage(e)}closePage(e){"securityProfile"!==e?("completedActions"===e&&(this.pagesOrder=["securityProfile","completedActions"],this.setPageVisibility(e,!1)),this.setPageVisibility(e,!1)):this.navigateToExternalPage("go-back")}}var Bi=r`:host {
  display: block;
  overflow-x: hidden;
  background-color: var(--colorsSecondary100, ${b(y.secondary100)});
  --bbva-header-main-bg-color: var(--colorsSecondary100, ${b(y.secondary100)});
  --bbva-header-main-color: var(--colorsSecondary600, ${b(y.secondary600)});
  --bbva-panel-container-columns: 2;
  --bbva-list-link-heading-color: var(--colorsPrimaryCoreLight, ${b(y.primaryCoreLight)});
  --bbva-transition-container--custom--primary-ambient--content-bg-color: var(--colorsSecondary100, ${b(y.secondary100)});
  --bbva-transition-container-padding-bottom: 0;
  --bbva-help-modal-footer-padding: 24px 16px;
}
:host .security-settings-carousel [data-tag-name=bbva-type-text] {
  margin-left: 1rem;
}
:host .security-settings-carousel [data-tag-name=bbva-notification-contextual] {
  padding: 0 1rem;
}
:host .security-profile-page-container {
  display: flex;
  flex-direction: column;
  padding: 1rem;
  padding-top: 0px;
}
:host [slot=slot-content] [data-tag-name=bbva-type-text] {
  padding: 0.5rem 0 1.5rem 0;
}
:host [slot=slot-content] [data-tag-name=bbva-list-bullet] {
  padding: 0.25rem 0;
}

:host [data-tag-name=bbva-header-main] {
  padding-top: calc(env(safe-area-inset-top) + 10px);
}
`;class Oi extends xi{static get is(){return"bbva-feature-security-profile-page-mx"}static get styles(){return[Bi,l("bbva-feature-security-profile-page-shared-styles")]}}var Ni=r`:host {
  display: block;
  overflow-x: hidden;
  background-color: var(--colorsSecondary100, ${b(y.secondary100)});
  --bbva-header-main-bg-color: var(--colorsSecondary100, ${b(y.secondary100)});
  --bbva-header-main-color: var(--colorsSecondary600, ${b(y.secondary600)});
  --bbva-list-link-heading-color: var(--colorsPrimaryCoreLight, ${b(y.primaryCoreLight)});
  --bbva-transition-container--custom--primary-ambient--content-bg-color: var(--colorsSecondary100, ${b(y.secondary100)});
  --bbva-transition-container-padding-bottom: 0;
}

.security-profile-pending-actions-page-container {
  display: flex;
  flex-direction: column;
  padding: 1rem;
  padding-top: 0px;
}

:host [data-tag-name=bbva-header-main] {
  padding-top: calc(env(safe-area-inset-top) + 10px);
}
`;class Vi extends Pi{static get is(){return"bbva-feature-security-profile-pending-actions-mx"}static get styles(){return[Ni,l("bbva-feature-security-profile-pending-actions-shared-styles")]}}var zi=r`:host {
  display: block;
  overflow-x: hidden;
  background-color: var(--colorsSecondary100, ${b(y.secondary100)});
  --bbva-header-main-bg-color: var(--colorsSecondary100, ${b(y.secondary100)});
  --bbva-header-main-color: var(--colorsSecondary600, ${b(y.secondary600)});
  --bbva-transition-container--custom--primary-ambient--content-bg-color: var(--colorsSecondary100, ${b(y.secondary100)});
  --bbva-transition-container-padding-bottom: 0;
}

body {
  background-color: var(--colorsSecondary100, ${b(y.secondary100)});
}

.security-profile-completed-actions-container {
  padding: 1rem;
}

:host [data-tag-name=bbva-header-main] {
  padding-top: calc(env(safe-area-inset-top) + 10px);
}
`;class qi extends Li{static get is(){return"bbva-feature-security-profile-completed-actions-mx"}static get styles(){return[zi,l("bbva-feature-security-profile-completed-actions-shared-styles")]}}class ji extends Mi{static get is(){return"bbva-feature-security-settings-access-mx"}static get properties(){return{pages:{type:Object},hasNotificationPermissions:{type:Boolean}}}static get securitySettingsManager(){return{"bbva-security-settings-manager-mx":me,"bbva-security-navigations-handler-mx":Ri,"bbva-security-settings-devices-manager":ht}}static get scopedElements(){return{...this.securitySettingsManager,"bbva-transition-container":ve,"bbva-feature-security-settings":_i,"bbva-feature-security-profile-page-mx":Oi,"bbva-feature-security-profile-pending-actions-mx":Vi,"bbva-feature-security-profile-completed-actions-mx":qi,"bbva-progress-content":he}}get managerElement(){return this.shadowRoot.querySelector('[data-tag-name="bbva-security-settings-manager-mx"]')}constructor(){super(),this.pagesOrder=["securityProfile","pendingActions","completedActions"],this.isStEnrolled=!0,this.hasNotificationPermissions=!1,this.dontShowModals=!0,this.pages={securitySettings:!1,securityProfile:!0,pendingActions:!1,completedActions:!1}}async init(){await this.updateComplete,this.manageFeatureFlags(),this.isBiometryEnrolled=await this.managerElement.checkBiometricFlags(),this.managerElement.init(),this.navigationsHandlerElement.init()}async checkWebVisibility(e){await this.updateComplete,e&&(this.__fireEvent("web-visibility"),this.managerElement.init())}closePage(e){this.getPercentageScoreItems(),this.navigationsHandlerElement.closePage(e)}get navigationsHandlerElement(){return this.shadowRoot.querySelector('[data-tag-name="bbva-security-navigations-handler-mx"]')}async accessToSecurityProfile(){await this.updateComplete,this.managerElement.getVisitedSecurityPofile(),this.openPage("securityProfile")}async checkSecurityProfileFirstTime(){await this.updateComplete,this.managerElement.checkSecurityProfileFirstTime()}async getVisitedSecurityProfileConfig(){await this.updateComplete,this.managerElement.getVisitedSecurityProfileConfig()}exitOperative(){this.__fireEvent("exit-operative")}startFido(){this.__fireEvent("start-fido")}setNotificationPermissionsStatus(e){const t=null==e?void 0:e.status;this.hasNotificationPermissions=2===t}get _securitySettingsManager(){return n`
      <bbva-security-settings-manager-mx
        .isNativeIos="${this.isNativeIos}"
        .accessiblePublicItems="${this.accessiblePublicItems}"
        .passwordStrength="${this.passwordStrength}"
        .pages="${this.pages}"
        .hasNotificationPermissions="${this.hasNotificationPermissions}"
        @updated-learn-more-items="${this._getLearnMoreItems}"
        @updated-last-minute-items="${this._getLastMinuteItems}"
        @update-password-strength-visibility="${this.setPasswordStrengthVisibility}"
        @update-password-strength-text="${this.setPasswordStrengthText}"
        @update-password-strength-class="${this.setPasswordStrengthClass}"
        @update-weighted-average="${this._setWeightedAvarage}"
        @update-data-visualization-donut="${this._setDataDonut}"
        @update-donut-title="${this._setDonutTitle}"
        @update-donut-description="${this._setDonutDescription}"
        @update-pending-actions="${this._setPendingConfig}"
        @update-highlighted-action="${this._setPendingAction}"
        @update-main-pending-actions="${this._setMainPendingActions}"
        @update-medium-pending-actions="${this._setMediumPendingActions}"
        @update-main-pending-actions-visibility="${this._setMainPendingActionsVisibility}"
        @update-completed-actions-link-visibility="${this._setCompletedActionsLinkVisibility}"
        @update-pending-actions-link-visibility="${this._setPendingActionsLinkVisibility}"
        @updated-completed-actions="${this._setCompletedActions}"
        @update-biometric-access-visible="${this._setBiometricAccessVisible}"
        @update-discreet-mode-status="${this._setDiscreetModeStatus}"
        @cards-keys-order="${this._setKeysOrder}"
        @security-settings-start-fido-enrollment="${this.startFido}"
        @navigate-to-page="${e=>this.navigateToExternalPage(e)}"
        >
      </bbva-security-settings-manager-mx>
    `}get _securityNavigationsHandler(){return n`
      <bbva-security-navigations-handler-mx
        .pages="${this.pages}"
        .pagesOrder="${this.pagesOrder}"
        @go-back="${this.exitOperative}"
        @request-update="${this.updatePage}"
        @set-loading="${e=>this.setLoading(e)}"
        >
      </bbva-security-navigations-handler-mx>
    `}get _securityProfilePage(){return n`
      <bbva-transition-container
        ?visible="${Boolean(this.pages.securityProfile)}"
        @transitionend="${this.closeVeil}">
        <div slot="slot-content">
          ${this.pages.securityProfile?n`
    <bbva-feature-security-profile-page-mx
      .isStEnrolled= "${this.isStEnrolled}"
      .dataDonut="${this.dataDonut}"
      .donutTitle="${this.donutTitle}"
      .donutDescription="${this.donutDescription}"
      .pendingAction="${this.pendingAction}"
      .pendingConfig="${this.pendingConfig}"
      .mainPendingActions="${this.mainPendingActions}"
      .mediumPendingActions="${this.mediumPendingActions}"
      .pendingActionsItems=${this.pendingActionsItems}
      .learnMoreItems="${this.learnMoreItems}"
      .lastMinuteItems="${this.lastMinuteItems}"
      .completedActionsLinkVisibility="${this.completedActionsLinkVisibility}"
      .mainPendingActionsVisibility="${this.mainPendingActionsVisibility}"
      .linkVisibility="${this.linkVisibility}"
      .dontShowModals= "${this.dontShowModals}"
      @back-step="${()=>this.closePage("securityProfile")}"
      @card-list-widget-clicked-link="${()=>this.openPage("pendingActions")}"
      @profile-notifications-link="${()=>this.navigateToSecurityTips}"
      @completed-actions-link="${()=>this.openPage("completedActions")}"
      @navigate-to-screen_lock="${()=>this.openScreenLockNativeSettings()}"
      @navigate-to-app_update="${()=>this.openAppStore()}"
      @navigate-to-key_recovery_update="${()=>this.navigateToExternalPage({detail:"navigate-to-key-recovery-update"})}"
      @navigate-to-discreet_mode_settings="${()=>this.navigateToExternalPage({detail:"navigate-to-discreet-mode-settings"})}"
      @navigate-to-page_token="${this.navigateToSoftokenEnrollment}"
      @navigate-to-atm_locator="${()=>this.navigateToExternalPage({detail:"navigate-to-atm-locator"})}"
      @navigate-to-phone_validation="${()=>this.navigateToExternalPage({detail:"navigate-to-phone-number-validation"})}"
      @widget-clicked-link="${e=>this.manageWidgetClickedLinkNavigation(e)}"
      @navigate-to-securityTipsPage="${()=>this.managePendingActionsNavigation({detail:"navigate-to-security-tips"})}"
      @navigate-to-page_biometria="${e=>this.navigateToFidoEnrollment(e)}"
      @navigate-to-email_management="${()=>this.navigateToExternalPage({detail:{event:"navigate-to-email-management",data:{customerID:this.customerId}}})}"
    >
    </bbva-feature-security-profile-page-mx>
    `:g}
        </div>
      </bbva-transition-container>

    `}get _pendingActionsPage(){return n`
      <bbva-transition-container
        ?visible="${Boolean(this.pages.pendingActions)}"
        @transitionend="${this.closeVeil}">
        <div slot="slot-content">
          ${this.pages.pendingActions?n`
          <bbva-feature-security-profile-pending-actions-mx
            .mediumPendingActions="${this.mediumPendingActions}"
            @navigate-to-key-recovery-update="${()=>this.managePendingActionsNavigation({detail:"navigate-to-key-recovery-update"})}"
            @navigate-to-discreet-mode-settings="${()=>this.managePendingActionsNavigation({detail:"navigate-to-discreet-mode-settings"})}"
            @navigate-to-securityTipsPage="${()=>this.managePendingActionsNavigation({detail:"navigate-to-security-tips"})}"
            @navigate-to-screen_lock="${()=>this.openScreenLockNativeSettings()}"
            @navigate-to-app_update="${()=>this.openAppStore()}"
            @navigate-to-discreet_mode_settings="${()=>this.navigateToExternalPage({detail:"navigate-to-discreet-mode-settings"})}"
            @navigate-to-email_management="${()=>this.navigateToExternalPage({detail:{event:"navigate-to-email-management",data:{customerID:this.customerId}}})}"
            @back-step="${()=>this.closePage("pendingActions")}"
          >
          </bbva-feature-security-profile-pending-actions-mx>
          `:g}
        </div>
      </bbva-transition-container>
    `}get _completedActionsPage(){return n`
      <bbva-transition-container
        ?visible="${Boolean(this.pages.completedActions)}"
        @transitionend="${this.closeVeil}">
        <div slot="slot-content">
          ${this.pages.completedActions?n`
          <bbva-feature-security-profile-completed-actions-mx
            .completedActions="${this.completedActions}"
            .menuAccessibilityText=${this.menuAccessibilityText}
            @back-step="${()=>this.closePage("completedActions")}"
          >
          </bbva-feature-security-profile-completed-actions-mx>
          `:g}
        </div>
      </bbva-transition-container>
    `}}customElements.define(ji.is,ji);class Hi extends a{static get is(){return"bbva-security-settings-tagging-manager-mx"}static get properties(){return{dataDonut:Object,activePage:String,setPageView:Boolean}}constructor(){super(),this.dataDonut=[],this.setPageView=!1,this.activePage="securitySettings"}initManager(){this.setPageView=!0}onPageView(){"securitySettings"===this.activePage?this.onSecuritySettingsPageView():"completedActions"===this.activePage?this.onSecurityProfileCompletedActionsPageView():this.onSecurityProfilePageView()}setDataConfig(e){e&&(this.dataDonut=e),this.setPageView&&(this.onPageView(),this.setPageView=!1)}onSecuritySettingsPageView(){const e=this._getLevelMessage();this.__fireEvent("security-settings-page-view",{securityLevel:e})}onSecurityProfilePageView(){const e=this._getLevelMessage();this.__fireEvent("security-profile-page-view",{securityLevel:e})}onSecurityProfileCompletedActionsPageView(){const e=this._getLevelMessage();this.__fireEvent("security-profile-completed-actions-page-view",{securityLevel:e})}onKeyRecoveryUpdate(){const e=this._getLevelMessage(),t="securitySettings"===this.activePage?"security-settings-key-recovery-update":"security-profile-key-recovery-update";this.__fireEvent(t,{securityLevel:e})}onSecuritySettingsEmergency(){const e=this._getLevelMessage();this.__fireEvent("security-settings-emergency-zone",{securityLevel:e})}onSecurityDevicesZone(){const e=this._getLevelMessage();this.__fireEvent("security-settings-devices-zone",{securityLevel:e})}onDiscreetModeLink(){const e=this._getLevelMessage(),t="securitySettings"===this.activePage?"security-settings-discreet-mode":"security-profile-discreet-mode";this.__fireEvent(t,{securityLevel:e})}onValidateEmailLink(){const e=this._getLevelMessage();this.__fireEvent("security-profile-validate-email",{securityLevel:e})}onScreenLock(){const e=this._getLevelMessage();this.__fireEvent("security-profile-screen-lock",{securityLevel:e})}onSecuritySettingsPermissions(){const e=this._getLevelMessage();this.__fireEvent("security-settings-manage-permissions",{securityLevel:e})}onSecurityTips(e){if("interactiveLink"!==e){const e=this._getLevelMessage(),t="securitySettings"===this.activePage?"security-settings-security-tips":"security-profile-security-tips";this.__fireEvent(t,{securityLevel:e})}}onFidoEnrollment(){if("securitySettings"!==this.activePage){const e=this._getLevelMessage();this.__fireEvent("security-profile-digital-token",{securityLevel:e})}}onPhoneNumberValidation(){if("securitySettings"!==this.activePage){const e=this._getLevelMessage();this.__fireEvent("security-profile-phone-number-validation",{securityLevel:e})}}onSecurityProfileNavigation(){const e=this._getLevelMessage();this.__fireEvent("security-settings-security-profile",{securityLevel:e})}onInteractiveLink(e){const t=this._getLevelMessage();this.__fireEvent("security-settings-interactive-link",{title:e,securityLevel:t})}onSecurityProfileNotifications(){const e=this._getLevelMessage();this.__fireEvent("security-profile-notifications-link",{securityLevel:e})}onSecurityProfileIdentityDocument(){const e=this._getLevelMessage();this.__fireEvent("security-profile-identity-document-link",{securityLevel:e})}onUpdateApp(){const e=this._getLevelMessage();this.__fireEvent("security-profile-update-app-link",{securityLevel:e})}onPendingActionsLink(e){const t=`pending-actions-${e.replace(/_/g,"-")}-link`,i=this._getLevelMessage();this.__fireEvent(t,{securityLevel:i})}_getLevelMessage(){const e=this.dataDonut.length&&this.dataDonut[0].label;return`nivel de proteccion: ${this.dataDonut.length&&this.dataDonut[0].value}, proteccion de perfil nivel: ${{low:"bajo",medium:"medio",high:"alto",pro:"pro"}[e]}`}__fireEvent(e,t){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}}customElements.define(Hi.is,Hi);
