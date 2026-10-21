import{L as e,M as t,j as s,e as i,R as a,S as r,v as n,a1 as o,V as c,D as l,z as d,a2 as h,f as p,H as u,G as m,ae as _,N as g,af as y,K as b,I as v,E as f,A as T,F as S,T as E,x as C,Q as A,ap as R,w as O,a3 as P,a4 as $,h as D,ao as I,an as k,as as w,at as x}from"./216055dc.js";import{J as N,L as M,aZ as q,a7 as H,h as F,dC as L,dD as j,dE as V,a as U,i as B,b as K,aX as G,H as z,z as W,an as Y,ak as X,aV as J,as as Q,cU as Z,a8 as ee,ac as te,ab as se,ch as ie,ci as ae,ah as re,ad as ne,aS as oe,dH as ce,aU as le,fw as de,cT as he,aD as pe,bF as ue,aa as me}from"./952f98a9.js";import{B as _e,a as ge}from"./a0b89eb0.js";import{B as ye,a as be}from"./4eb8d874.js";import{B as ve}from"./40b41b3c.js";import{B as fe,a as Te}from"./a4e2d801.js";import{a2 as Se,a3 as Ee,a4 as Ce,a5 as Ae,by as Re,aI as Oe,aH as Pe,bQ as $e,bP as De,bS as Ie,bT as ke,bf as we,bg as xe,n as Ne}from"./7f3d7ca9.js";import{B as Me,a as qe,b as He}from"./d2484b66.js";import{a as Fe}from"./4656db6d.js";import{B as Le}from"./459fa8f1.js";import"./28fb68d0.js";import{b as je,c as Ve}from"./4966a83d.js";import"./e5f89cd9.js";import{B as Ue}from"./69d7eba8.js";import{H as Be}from"./e7d77b44.js";import{b as Ke,B as Ge}from"./d335c75d.js";import{b as ze,B as We}from"./972f570a.js";import{B as Ye}from"./2b04e291.js";import{B as Xe}from"./6b902eda.js";import{B as Je,a as Qe}from"./ff7f0130.js";import{b as Ze,B as et}from"./41ed0536.js";import{b as tt,j as st,B as it}from"./30ef6f1f.js";import{b as at,B as rt,a as nt}from"./e3d898b2.js";class ot extends je{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`stores/v${this.version}/economic-activities`)}toString(){return super.toString("BGADPStoresEconomicActivitiesGetV1")}}class ct extends Ve{static get is(){return"bbva-global-economic-activities-api-dm"}static get properties(){return{economicActivities:{type:Array,attribute:!1}}}constructor(){super(),this.economicActivities=[]}resetEconomicActivities(){this.economicActivities=[]}getEconomicActivities(e={}){if(Object.keys(this.economicActivities).length)return;this._generateGetService(this._getService("get",{},e),{customEvent:"economic-activities-api-dm-fetch",errorFireEventHandler:"economic-activities-api-dm-fetch-error"},this._responseMapping,e.fields)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}EconomicActivities`,this._getBgadp(i))}_getBgadp(e){return{getEconomicActivitiesV1:()=>new ot(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}class lt extends(N(M)){_mappingIndicators(e){e.map((e=>{this._removeFields(["name"],e),this._renameProperty(e,"indicatorId","id")}));for(let t=0;t<e.length;t++)"DESTINATION_IMMEDIATE_DEBIT"==e[t].id&&e.splice(t,1),"CAN_BE_ASSOCIATED_TO_A_CUSTODY_ACCOUNT"==e[t].id&&e.splice(t,1);return e}}let dt=class{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let s=Object(this),i=s.length>>>0;if(0===i)return!1;let a=0|t,r=Math.max(a>=0?a:i-Math.abs(a),0);for(;r<i;){if((n=s[r])===(o=e)||"number"==typeof n&&"number"==typeof o&&isNaN(n)&&isNaN(o))return!0;r++}var n,o;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var s=[],i=0,a="",r=0,n=arguments.length;r!==n;++r){var o=+arguments[r];if(!(o<1114111&&o>>>0===o))throw RangeError("Invalid code point: "+o);o<=65535?i=s.push(o):(o-=65536,i=s.push(55296+(o>>10),o%1024+56320)),i>=16383&&(a+=e.apply(null,s),s.length=0)}return a+e.apply(null,s)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",s=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${s&&s.message}`)}},ht=class extends dt{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}};const pt=0,ut=1,mt="jwt",_t="tsec",gt="none";let yt=class extends dt{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=pt,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new ht,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=_t:this.requiredToken=gt,this.requiresJWT=!1):this.requiredToken===_t?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===mt?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===gt?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(_t)}_setJwtHandler(){this._setTokenHandler(mt)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((s,i)=>{t=Object.assign(t,{resolve:s,reject:i}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let s=this._getRequestHeaders();Object.keys(s).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,s[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=q),e}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let s=e.replace(/[\{\}]+/g,""),i=t[s];return i?delete t[s]:this._error(9,`Missing ${s} param value`),i})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let s=Object.keys(t);s.length&&(e=[e,s.map((e=>{let s=t[e];return Array.isArray(s)&&this.paramArrayMode===ut?this._arrayToQueryParam(e,s):`${e}=${s}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(_t,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(mt,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(s){var i=t.getItem(s);i&&"null"!==i&&(e[s]=i)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const s=window.sessionStorage;t=Object.keys(s).filter((t=>t.startsWith(e))).reduce(((t,i)=>(t[i.replace(e,"")]=s.getItem(i),t)),{})}return t}_getTokenForRequestHeaders(e,t){const s=`${e}Handler`,i=e===mt?"JWT ":"",a=e===mt?"Authorization":_t;if(void 0===this[s]||null===this[s])this._error(11,`${e} handler is undefined`);else{const r=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let n=this[s].getItem(r);n?t[a]=t[a]||i+n:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((s=>{t.push(`${s}=${e[s]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(s){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(s){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let s;const i=new Promise(((e,t)=>{s=(s,i)=>{s?t(s):e(i)}}));return t.addEventListener("loadend",(function e(i){t.removeEventListener("loadend",e),i.error?s(i.error):s(null,t.result)})),t.readAsText(e),i}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let s=0;for(;s<e.length;){let i=e[s],a=0,r=0;if(i<=127?(a=0,r=255&i):i<=223?(a=1,r=31&i):i<=239?(a=2,r=15&i):i<=244&&(a=3,r=7&i),e.length-s-a>0){let t=0;for(;t<a;)i=e[s+t+1],r=r<<6|63&i,t+=1}else r=65533,a=e.length-s;t+=String.fromCodePoint(r),s+=a+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},s=e.trim().split(/[\r\n]+/);for(const e in s)if(s.hasOwnProperty(e)&&""!==s[e]){let i=": ",a=s[e].split(i);t[a.shift().toLowerCase()]=a.join(i)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,s,i){let a=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(i)>=0&&(a=t.getResponseHeader(i));break;case this._NATIVE_XHR:t&&t.headers&&(a=JSON.parse(t.headers)[i])}if(a){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):s;e.getItem(t)!==a&&(e.setItem(t,a),this._emitTokenUpdate(s,a))}}_emitTokenUpdate(e,t){if(this.htmlContext){const s=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(s)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,s,i,a,r;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),s=e.getResponseHeader("AuthenticationData"),i=e.getResponseHeader("AuthenticationState"),a=e.getResponseHeader("AuthenticationChallenge"),r=e.getResponseHeader("AuthenticationResponse");else{let n=JSON.parse(e.headers);t=n.authenticationtype,s=n.authenticationdata||null,i=n.authenticationstate,a=n.authenticationchallenge,r=n.authenticationresponse}return{type:t,data:s,state:i,challenge:a,response:r}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",s=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const i=this._getSignatureData(e,t,s);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:i}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",s="",i=""){let a;if("object"==typeof e&&e){const r=this._getSignatureData(e.signatureType,t,s);a=this._makeKeyValuePairFromObject(r,e.signatureValue),e.challenge&&(a+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(a,e.signatureType,i)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(a=`password=${e}`,this._buildSignatureHeaders(a,"2",i)):(a=`${s}=${e}`,this._buildSignatureHeaders(a,t,i)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let s,i=e.split(",");if(i.length>1){s=i.map((e=>`${e}=${t[e]}`)).join(",")}else s=`${e}=${t}`;return s}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",s=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),s&&(this.headers=Object.assign(this.headers,{AuthenticationState:s})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let s=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),a=this._ERROR_CODES.SIGNATURE_INVALID.includes(i),{type:r,data:n,state:o,challenge:c,response:l}=this._extractSignatureResponseHeaders(e),d=this._getRequestMetadata(e);if(a)this._notifySignatureInvalid(d),s=!0;else if(r)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(i)?(this._notifySignatureTypeUsingErrorCode(i,d,r,n,o,c,l),s=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(d,r,n,o,c,l),s=!0}return s}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let s=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),a=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(i),r=this._getRequestMetadata(e);a&&(this._notifyWaitingForProcessResponse(r),s=!0)}return s}_notifySignatureRequiredFirstStep(e,t,s,i){this._defineSignatureType(t,s),this._defineSignatureValue(t,s,i),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:s,metadata:e}}))}_notifySignatureRequired(e,t,s,i,a,r){this._defineSignatureValue(t,s,i);const n={type:t,data:s,challenge:a,metadata:e};r&&(n.response=r),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:n}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:s}=e;return{path:this._path,method:this.method,url:t,status:s}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",s=""){const i=t.split(";").findIndex((t=>t===e));return s?s.split(";")[i]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,s,i,a,r){i?this._notifySignatureRequired(e,t,s,i,a,r):this._notifySignatureRequiredFirstStep(e,t,s,i)}_notifySignatureTypeUsingErrorCode(e,t,s,i,a,r,n){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,s,i,a):this._notifySignatureRequired(t,s,i,a,r,n)}},bt=class extends yt{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}},vt=class extends yt{constructor(e=null){super(Object.assign(e||{},{method:"POST"}))}toString(e=""){return super.toString(e||"BGADPRequestPOST")}};class ft extends bt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts`)}toString(){return super.toString("BGADPAccountsGetV0")}}class Tt extends vt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts`)}toString(){return super.toString("BGADPAccountsPostV0")}}class St extends bt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/financial-statements`)}toString(){return super.toString("BGADPAccountsAccountFinancialStatementsGetV0")}}class Et extends bt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/financial-statements/{financial-statement-id}`)}toString(){return super.toString("BGADPAccountsAccountFinancialStatementsFinancialStatementGetV0")}}class Ct extends bt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/limits`)}toString(){return super.toString("BGADPAccountsAccountLimitsGetV0")}}class At extends bt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/transactions`)}toString(){return super.toString("BGADPAccountsAccountTransactionsGetV0")}}class Rt extends lt{static get is(){return"bbva-global-accounts-base-api-dm"}resetAccounts(){this.accounts=[]}getAccounts(e){this._paramsMapping(e),this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields,this._paginationMapping)}postAccounts(e){this._requestMapping(e),this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping),this.resetAccounts()}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}Accounts`,this._getBgadp(i))}_getBgadp(e){return{getAccountsV1:()=>new ve(e),getAccountsV0:()=>new ft(e),postAccountsV0:()=>new Tt(e),postAccountsV1:()=>new ye(e),getAccountsV2:()=>new _e(e),default:()=>"BGADP does not exist."}}_renameQueryParam(e,t,s){t in e&&(e[s]=e[t],delete e[t])}_paramsMapping(e){if("0"==this.version&&Object.keys(e).length){const t=["ANNULLED","CHARGE_OFF","INACTIVE","PROPOSAL"],s=["ORIGIN_TO_TRANSPORT_RECHARGE","DESTINATION_TO_MERCHANT_QR","SPI_ACTIVE_PAYMENTS"];e["status.id"]&&t.includes(e["status.id"])&&this._removeFields(["status.id"],e),e["indicators.id"]&&s.includes(e["indicators.id"])&&this._removeFields(["indicators.id"],e),this._renameProperty(e,"currency","currencies.currency"),this._renameQueryParam(e,"indicators.id","indicators.indicatorId")}return"0"!=this.version&&"1"!=this.version||this._renameQueryParam(e,"expand.id","expand"),e}_responseMapping(e){if(Array.isArray(e)&&e.length>0){if("0"==this.version)for(let t=0;t<e.length;t++){this._renameProperty(e[t],"accountId","id"),this._renameProperty(e[t],"title","product");["COMMON","CREDIT"].includes(e[t].accountType.id)||this._removeFields(["accountType"],e[t]),this._removeFields(["subType"],e[t].accountType),this._removeFields(["previousMonthAverageBalances"],e[t].availableBalance),"DORMANT"===e[t].status.id&&this._removeFields(["status"],e[t]),this._removeFields(["reason","reasonDescription","situation"],e[t].status),e[t].indicators&&e[t].indicators.length&&(e[t].indicators=this._mappingIndicators(e[t].indicators)),this._removeFields(["clabe","bank","accountFamily","commercialPackage","joint","openingDate","currencies","disposedBalance","image","meta","offerId","delivery","accountAgreement","cardInformation","petitionerBusinessAgent"],e[t])}else if("1"==this.version)for(let t=0;t<e.length;t++)e[t].product&&this._removeFields(["subProduct"],e[t].product),this._removeFields(["bank","joint","participants","isPayrollAccount"],e[t]),e[t].indicators&&e[t].indicators.length&&(e[t].indicators=this._mappingIndicators(e[t].indicators));return e}return this._postResponseMapping(e)}_postResponseMapping(e){if("0"==this.version&&Object.keys(e).length){this._renameProperty(e,"accountId","id"),e.customizedFormats&&e.customizedFormats.forEach((e=>{this._renameProperty(e,"customizedFormatId","id")})),this._renameProperty(e,"joint","jointSignatureType"),this._renameProperty(e,"title","product"),e.bank&&(this._renameProperty(e.bank,"bankId","id"),this._renameProperty(e.bank.branch,"branchId","id")),e.status.reason&&(e.status.reason={id:e.status.reason});["COMMON","CREDIT","CREDIT_EXTENSION","SAVINGS","MONEY_MARKET","SAVINGS_EXTENSION"].includes(e.accountType.id)||this._removeFields(["accountType"],e),e.participants.forEach((e=>{this._renameProperty(e,"participantId","id"),"NATURAL_PERSON"===e.personType||Object.keys(e).some((e=>"firstName"===e))?(e.customDetails={personType:"NATURAL_UNKNOWN"},e.firstName&&(e.customDetails={...e.customDetails,firstName:e.firstName}),e.middleName&&(e.customDetails={...e.customDetails,middleName:e.middleName}),e.lastName&&(e.customDetails={...e.customDetails,lastName:e.lastName}),e.secondLastName&&(e.customDetails={...e.customDetails,secondLastName:e.secondLastName}),e.identityDocument&&(e.customDetails.identityDocuments=[{documentNumber:e.identityDocument.documentNumber,documentType:{id:e.identityDocument.documentType}}],"NIE"===e.customDetails.identityDocuments[0].documentType.id&&this._removeFields(["documentType"],e.customDetails.identityDocuments[0])),this._removeFields(["personType","firstName","middleName","lastName","secondLastName","identityDocument"],e)):("LEGAL_PERSON"===e.personType||Object.keys(e).some((e=>"legalName"===e)))&&(e.customDetails={personType:"LEGAL_UNKNOWN"},e.legalName&&(e.customDetails={...e.customDetails,legalName:e.legalName}),e.identityDocument&&(e.customDetails.businessDocuments=[{documentNumber:e.identityDocument.documentNumber,documentType:{id:e.identityDocument.documentType}}],"NIE"===e.customDetails.businessDocuments[0].documentType.id&&this._removeFields(["documentType"],e.customDetails.businessDocuments[0])),this._removeFields(["personType","legalName","identityDocument"],e)),e.participantType.order&&(e.order=e.participantType.order,this._removeFields(["order"],e.participantType)),this._removeFields(["suffix","documents"],e)})),e.conditions&&e.conditions.forEach((e=>{this._renameProperty(e,"conditionId","id"),this._removeFields(["period","facts","outcomes"],e)})),e.delivery&&(e.deliveries=e.delivery,this._removeFields(["delivery"],e),e.deliveries.forEach((e=>{"VIRTUAL"===e.deliveryType?e.method="DIGITAL":"PHYSICAL"===e.deliveryType&&(e.method="STANDARD"),e.address&&this._renameProperty(e.address,"addressType","deliveryAddressType"),e.destination&&e.destination.branch&&(e.destination.bank={branch:e.destination.branch},this._removeFields(["branch"],e.destination)),e.contactDetails&&e.contactDetails[0].contactDetail&&e.contactDetails[0].contactDetail.contactDetailId&&(e.contactDetails={id:e.contactDetails[0].contactDetail.contactDetailId,deliveryContactType:"STORED"}),this._removeFields(["documentType","deliveryType"],e)}))),e.fees&&e.fees.itemizeFees.forEach((e=>{this._renameProperty(e,"name","description"),e.itemizeFeeUnits=[{unitType:"AMOUNT",amount:e.feeAmount.amount,currency:e.feeAmount.currency}],e.feeAmount.percentage&&e.itemizeFeeUnits.push({unitType:"PERCENTAGE",percentage:e.feeAmount.percentage}),this._removeFields(["feeAmount"],e)})),e.rates&&e.rates.forEach((e=>{e.itemizeRates=[{rateType:e.rateType.id,itemizeRateUnits:[e.unit]}],this._renameProperty(e.itemizeRates[0].itemizeRateUnits[0],"mode","unitType"),e.rateType.name&&(e.itemizeRates=[{...e.itemizeRates[0],description:e.rateType.name}]),this._removeFields(["rateType","unit"],e)})),e.operationNumber&&(e.operationTracking={operationNumber:e.operationNumber}),e.relatedContracts&&e.relatedContracts.forEach((e=>{this._renameProperty(e.relationType,"name","description"),e.contractDetails={number:e.number,contractType:"INTERNAL_CONTRACT"},this._removeFields(["number"],e)})),this._removeFields(["businessType","operationNumber","accountFamily","billingInformation"],e)}return e}_requestMapping(e){return"0"==this.version&&(e.bank&&(this._renameProperty(e.bank,"id","bankId"),this._renameProperty(e.bank.branch,"id","branchId")),this._renameProperty(e,"jointSignatureType","joint"),this._renameProperty(e,"product","title"),this._removeFields(["subproduct"],e.title),e.status&&this._removeFields(["name"],e.status),e.limits&&e.limits.forEach((e=>{this._renameProperty(e,"id","limitId")})),e.indicators&&e.indicators.forEach((e=>{this._renameProperty(e,"id","indicatorId")})),e.participants.forEach((e=>{["GUARANTOR","COLLATERAL_GUARANTOR","CLIENT_AGENT","PROVIDER_AGENT","CONTRACTOR","LEGAL_REPRESENTATIVE","INSPECTOR"].includes(e.participantType.id)&&this._removeFields(["participantType"],e),e.order&&(e.participantType={...e.participantType,order:e.order},this._removeFields(["order"],e)),e.customDetails.firstName&&(e.firstName=e.customDetails.firstName),e.customDetails.lastName&&(e.lastName=e.customDetails.lastName),e.customDetails.secondLastName&&(e.secondLastName=e.customDetails.secondLastName);const t=["DNI","NIE","NIF","CIF","PASSPORT"];e.customDetails.identityDocuments&&e.customDetails.identityDocuments.forEach((s=>{t.includes(s.documentType.id)&&(e.identityDocument={documentNumber:s.documentNumber,documentType:s.documentType.id})})),this._removeFields(["customDetails"],e)})),e.conditions&&e.conditions.forEach((e=>{this._renameProperty(e,"id","conditionId"),this._removeFields(["isNegotiable","conditionType","formats"],e)})),e.relatedContracts&&e.relatedContracts.forEach((e=>{"INTERNAL_CONTRACT"===e.contractDetails.contractType&&(e.contractId=e.contractDetails.contractId),this._removeFields(["contractDetails"],e)})),e.deliveries&&(e.delivery=e.deliveries,this._removeFields(["deliveries"],e),e.delivery.forEach((e=>{if(this._renameProperty(e,"method","deliveryType"),"DIGITAL"===e.deliveryType?e.deliveryType="VIRTUAL":"STANDARD"===e.deliveryType?e.deliveryType="PHYSICAL":this._removeFields(["deliveryType"],e),"DIGITAL_CONTACT"===e.destination.id&&this._removeFields(["id"],e.destination),e.destination.bank&&(e.destination={...e.destination,branch:e.destination.bank.branch},this._removeFields(["bank"],e.destination)),e.contactDetails&&"STORED"===e.contactDetails.deliveryContactType){let t=[{contactDetail:{contactDetailId:e.contactDetails.id}}];e.contactDetails=t}else this._removeFields(["contactDetails"],e);e.address&&"STORED"===e.address.deliveryAddressType?this._renameProperty(e.address,"deliveryAddressType","addressType"):this._removeFields(["address"],e),this._removeFields(["deliverySchedules","serviceType","packagingType"],e)})))),e}_paginationMapping(e){return e}}H(Rt,"GET_EVENTS",{customEvent:"accounts-api-dm-fetch",paginationEvent:"accounts-api-dm-pagination",errorFireEventHandler:"accounts-api-dm-fetch-error"}),H(Rt,"POST_EVENTS",{customEvent:"accounts-api-dm-create",errorFireEventHandler:"accounts-api-dm-create-error"}),customElements.define(Rt.is,Rt);class Ot extends lt{static get is(){return"bbva-global-accounts-api-dm"}static get properties(){return{accounts:{type:Array,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.accounts=[],this.country="",this.localCustomProperties={},this._countries=["Mx"],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties","accounts"],this._loaded=!1,this._requestParams={},this._modules={Mx:()=>import("./b604e95a.js")}}update(e){super.update(e),e.forEach(((e,t)=>{"country"===t&&this.country&&this.country!==e?this._loadModule():"_module"!==t&&"_requestParams"!==t&&"_loaded"!==t&&this._module&&this[t]!==e?this._module[t]=this[t]:("_requestParams"===t&&this._requestParams&&this._requestParams!==e&&void 0!==e&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===t&&this._loaded)&&Object.entries(this._requestParams).forEach((([e])=>{this[`_${e}Accounts`]()}))}))}async _loadModule(){const e=this._capitalize(this.country);if(this._countries.includes(e)&&this._modules[e]){const t=`BbvaAccounts${e}ApiDm`;(0,this._modules[e])().then((async e=>{const s=e[t].is;this._module=this._createModuleElement(s),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-accounts-api-dm-module-load")})).catch((async e=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-accounts-api-dm-module-error",e)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(e){return e.charAt(0).toUpperCase()+e.slice(1).toLowerCase()}_createModuleElement(e=Rt.is){const t=document.createElement(e);return this._bindConfig(t),t}async _bindConfig(e){this._configProperties.forEach((t=>{e[t]=this[t]})),await this.updateComplete}_dispatchEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}async resetAccounts(){await this.module.updateComplete,this.module.resetAccounts()}async getAccounts(e={}){await this.module.updateComplete,this._requestParams.get?this._requestParams.get.push({params:e}):this._requestParams={get:[{params:e}]}}async _getAccounts(){await this.module.updateComplete,Object.keys(this.accounts).length||(this._requestParams.get.forEach((e=>{this.module.getAccounts(e.params)})),delete this._requestParams.get)}async postAccounts(e){await this.module.updateComplete,this._requestParams.post?this._requestParams.post.push({body:e}):this._requestParams={post:[{body:e}]}}async _postAccounts(){await this.module.updateComplete,this._requestParams.post.forEach((e=>{this.module.postAccounts(e.body)})),delete this._requestParams.post}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return F` ${this._module?this._module:""}`}}class Pt extends lt{static get is(){return"bbva-global-account-transactions-base-api-dm"}resetAccountTransactions(){this.accountTransactions=[]}getAccountTransactions(e,t){this._paramsMapping(t),t=Object.assign({"account-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}AccountTransactions`,this._getBgadp(i))}_getBgadp(e){return{getAccountTransactionsV2:()=>new L(e),getAccountTransactionsV0:()=>new At(e),default:()=>"BGADP does not exist."}}_paramsMappingCanonical(e){if("0"==this.version){this._removeFields(["customerId"],e),e["transactionType.id"]&&(e["transactionType.id"]=e["transactionType.id"].toString()),e["status.id"]&&(e["status.id"]=e["status.id"].toString());let t=Object.keys(e);for(let s=0;s<t.length;s++){let i=t[s];if("operationAmount.id"===i&&"LOCAL_AMOUNT"===e[i])for(let s=0;s<t.length;s++)"operationAmount.fromAmount"===t[s]?this._renameQueryParam(e,"operationAmount.fromAmount","fromLocalAmount.amount"):"operationAmount.toAmount"===t[s]?this._renameQueryParam(e,"operationAmount.toAmount","toLocalAmount.amount"):"operationAmount.currency"===t[s]&&this._renameQueryParam(e,"operationAmount.currency","localAmount.currency");this._removeFields(["operationAmount.id","operationAmount.fromAmount","operationAmount.toAmount","operationAmount.currency"],e)}}return e}_renameQueryParam(e,t,s){t in e&&(e[s]=e[t],delete e[t])}_paramsMapping(e){return this._paramsMappingCanonical(e),e}responseMappingCanonical(e){if("0"==this.version&&Object.keys(e).length)for(let t=0;t<e.length;t++){this._renameProperty(e[t],"valuationDate","valueDate"),this._renameProperty(e[t].contract.numberType,"name","description"),this._removeFields(["category","exchangeRate","fundsOrigin"],e[t]),this._removeFields(["product","bank"],e[t].contract),this._removeFields(["description"],e[t].transactionType),this._removeFields(["updateDate"],e[t].status);const s=e[t].classification;s&&(this._removeFields(["pfmId","customName"],s),this._removeFields(["customName"],s.category),this._removeFields(["customName"],s.category.subcategory));const i=e[0].additionalInformation;this._removeFields(["postedBalance","reportingBalance","authorizedBalance","hold"],i),i&&i.branch&&(e[t].branch={id:i.branch.id,name:i.branch.name},this._removeFields(["branch"],i)),i&&i.updatedBalance&&(i.balances=[{id:"UPDATED_BALANCE",amount:i.updatedBalance.amount,currency:i.updatedBalance.currency}],this._removeFields(["updatedBalance"],i)),e[t].localAmount&&(e[t].operationAmounts=[{id:"LOCAL_AMOUNT",amount:e[t].localAmount.amount,currency:e[t].localAmount.currency}],this._removeFields(["localAmount"],e[t]));const a=e[t].operationAmounts[0];e[t].originAmount&&(e[t].operationAmounts=[a,{id:"ORIGIN_AMOUNT",amount:e[t].originAmount.amount,currency:e[t].originAmount.currency}],this._removeFields(["originAmount"],e[t]))}return e}_responseMapping(e){return this.responseMappingCanonical(e),e}}H(Pt,"GET_EVENTS",{customEvent:"account-transactions-api-dm-fetch",paginationEvent:"account-transactions-api-dm-pagination",errorFireEventHandler:"account-transactions-api-dm-fetch-error"}),customElements.define(Pt.is,Pt);class $t extends lt{static get is(){return"bbva-global-account-participants-base-api-dm"}resetAccountParticipants(){this.accountParticipants=[]}getAccountParticipants(e,t={}){this._paramsMapping(t),t=Object.assign({"account-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}postAccountParticipants(e,t){const s={"account-id":e};this._generateGetService(this._getService("post",t,s),this.constructor.POST_EVENTS),this.resetAccountParticipants()}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}AccountParticipants`,this._getBgadp(i))}_getBgadp(e){return{getAccountParticipantsV2:()=>new fe(e),getAccountParticipantsV1:()=>new j(e),postAccountParticipantsV1:()=>new V(e),default:()=>"BGADP does not exist."}}_paramsMapping(e){return"1"==this.version&&(e={}),e}_responseMapping(e){return"1"==this.version&&e.length>0&&e.forEach((e=>{"NATURAL_KNOWN"==e.customDetails.personType?this._removeFields(["nonCustomerId","suffix","birthDate","identityDocuments","relationType","participationPercentage"],e.customDetails):"LEGAL_KNOWN"==e.customDetails.personType||this._removeFields(["customDetails"],e),this._removeFields(["description"],e.participantType)})),e}}H($t,"GET_EVENTS",{customEvent:"account-participants-api-dm-fetch",errorFireEventHandler:"account-participants-api-dm-fetch-error"}),H($t,"POST_EVENTS",{customEvent:"account-participants-api-dm-create",errorFireEventHandler:"account-participants-api-dm-create-error"}),customElements.define($t.is,$t);const Dt={0:"notCategorizable",1:"cash",2:"saving",3:"taxes",4:"associations",6:"health",7:"shopping",8:"education",9:"bank",10:"home",11:"leisure",15:"transportation",16:"travel",17:"paycheck",18:"check",19:"otherIncome",20:"investment",21:"financing",999:"notCategorizable",9999:"toCategorize"},It={notCategorizable:["0","998","999"],cash:["42","44","46","51"],bizum:["78"],toCategorize:["9998","9999"],paycheck:["41","96","97"],check:["98","99"],otherIncome:["43","50","100","101","102"],saving:["4","10","103","104"],investment:["6","11","105","106","107","110"],financing:["7"],taxes:["1","2","3"],associations:["12","13","81"],health:["23","64","65","7","69"],shopping:["24","25","27","28","30","63","87","88","109"],education:["31","32","33","34","82"],bank:["14","16","18","19","21","35","59","61","62","70","77","108"],home:["36","37","38","39","40","68","76","83","84","85"],leisure:["52","53","54","55","56","86"],transportation:["67","72","73","74","75","92","93","94","95"],travel:["57","58","71","89","90","91"]};class kt extends(U(Pt)){static get is(){return"bbva-account-transactions-es-api-dm"}static get properties(){return{_financingTypeId:{type:String}}}static get scopedElements(){const e=[K];return kt.scopedElementsFromClasses(e)}render(){return F` ${this.accountTransactionsDM} `}constructor(){super(),this._financingTypeId=""}get accountTransactionsDM(){return F`
      <bbva-core-generic-dp
        id="accountTransactions"
        requiresToken
        cross-domain
        .host="${this.host}"
        .cacheKey="${this.cacheKey}"
        .cacheType="${this.cacheType}"
        .path="${this.path}"
        headers="${B(((e,t)=>{let s={};if(e.includes("ASO")){const e="x-dm-local-",t=window.sessionStorage;s=Object.keys(t).filter((t=>t.startsWith(e))).reduce(((s,i)=>(s[i.replace(e,"")]=t.getItem(i),s)),{})}return JSON.stringify({...t,...s})})(this.host,this.headers))}"
        method="${this.method}"
        @request-success="${this._handleLocalDMSuccess}"
        @request-error="${this._handleLocalDMError}"
      >
      </bbva-core-generic-dp>
    `}_handleLocalDMSuccess(e){const t=this._formatData(e.detail);this.dispatchEvent(new CustomEvent("account-transactions-api-dm-fetch",{bubbles:!0,composed:!0,detail:t})),this.dispatchEvent(new CustomEvent("api-dm-response",{bubbles:!0,composed:!0,detail:!0}))}_handleLocalDMError(e){this._handleError("account-transactions-api-dm-fetch-error",this.shadowRoot.getElementById("accountTransactions"))(e.detail)}_requestAccountTransactions(e,t){const s=this.shadowRoot.getElementById("accountTransactions"),i=t.moneyFlow?{INCOME:"IN",EXPENSE:"OUT"}[t.moneyFlow.id]:"BOTH";this._financingTypeId=null==t?void 0:t["financingType.id"],this._setGenericRequest({dm:s,path:"accountTransactions/V02/accountTransactionsAdvancedSearch",method:"post",params:t.pagination?`?paginationKey=${t.pagination}`:`?paginationKey=0&pageSize=${t.pageSize?t.pageSize:40}`,body:{accountContracts:[{contract:{id:e}}],customer:{id:this.localCustomProperties.customerId},filter:{dates:{from:t.filterDateFrom,to:t.filterDateTo},operationType:[i]},searchType:"SEARCH"}})}_filterFinancingData(e){const t={FINANCING_AVAILABLE:"SF"};return t[this._financingTypeId]?e.filter((e=>{var s;return(null==e||null===(s=e.financingData)||void 0===s?void 0:s.customizableIndicator)===t[this._financingTypeId]})):e}_formatingOperationAmounts(e){const t="ORIGIN_AMOUNT",s=null==e?void 0:e.amount;let i={};var a,r;s&&(i={id:"EUR"===(null===(a=s.currency)||void 0===a?void 0:a.code)?"CONTRACT_AMOUNT":t,amount:null==s?void 0:s.amount,currency:null==s||null===(r=s.currency)||void 0===r?void 0:r.id});let n={};if(null!=e&&e.wireTransactionDetail){const{wireTransactionDetail:s}=e;n={id:t,amount:s.payment.amount,currency:s.payment.currency.id}}const o=0===Object.keys(i).length,c=0===Object.keys(n).length;return o&&c?null:o?[n]:c?[i]:[i,n]}_formatData(e){const t=this._filterFinancingData(e.accountTransactions).map((e=>{var t,s;return{id:e.id,operationAmounts:this._formatingOperationAmounts(e),contract:{id:e.contract.id},moneyFlow:{id:(null==e||null===(t=e.amount)||void 0===t?void 0:t.amount)<0?"EXPENSE":"INCOME",name:(null==e||null===(s=e.amount)||void 0===s?void 0:s.amount)<0?"expense":"income"},classification:this._formatClassification(e),operationDate:e.transactionDate,valueDate:e.valueDate,concept:this._formatConcept(e.humanConceptName)}}));return e.pagination&&(e.pagination={links:{first:e.pagination.firstPage,...void 0!==e.pagination.lastPage&&{last:e.pagination.lastPage},...void 0!==e.pagination.previousPage&&{previous:e.pagination.previousPage},...void 0!==e.pagination.nextPage&&{next:e.pagination.nextPage}},page:e.pagination.page,totalPages:e.pagination.total,totalElements:e.totalResults,pageSize:e.pagination.pageSize}),this.dispatchEvent(new CustomEvent("account-transactions-api-dm-pagination",{bubbles:!0,composed:!0,detail:e.pagination})),t}_formatConcept(e){return e.charAt(0).toUpperCase()+e.slice(1).toLowerCase()}_formatClassification(e){var t,s;const i=null==e||null===(t=e.humanCategory)||void 0===t?void 0:t.id,a=null==e||null===(s=e.humanSubcategory)||void 0===s?void 0:s.id,r=Dt[i];var n;return{id:i,name:r,category:{id:i,name:r,subcategory:{id:a,name:(n=a,Object.keys(It).find((e=>It[e].includes(n))))}}}}async getAccountTransactions(e,t){this._requestAccountTransactions(e,t)}_setGenericRequest({dm:e,path:t,method:s,params:i,body:a}){return e.native=!1,e.requiresToken=!0,e.path=`${t}${i}`,e.method=s,e.body=a,e.generateRequest(!0)}}customElements.define(kt.is,kt);class wt extends lt{static get is(){return"bbva-global-account-limits-base-api-dm"}resetAccountLimits(){this.accountLimits=[]}getAccountLimits(e,t){t=Object.assign({"account-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}AccountLimits`,this._getBgadp(i))}_getBgadp(e){return{getAccountLimitsV0:()=>new Ct(e),getAccountLimitsV2:()=>new be(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return this._responseMappingCanonical(e),e}_responseMappingCanonical(e){"0"==this.version&&Object.keys(e).length&&e.map((e=>{this._renameProperty(e,"limitId","id"),this._removeFields(["name"],e)}))}}H(wt,"GET_EVENTS",{customEvent:"account-limits-api-dm-fetch",errorFireEventHandler:"account-limits-api-dm-fetch-error"}),customElements.define(wt.is,wt);class xt extends lt{static get is(){return"bbva-global-accounts-opening-child-account-base-api-dm"}postAccountsOpeningChildAccount(e){this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}AccountsOpeningChildAccount`,this._getBgadp(i))}_getBgadp(e){return{postAccountsOpeningChildAccountV3:()=>new Te(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}H(xt,"POST_EVENTS",{customEvent:"accounts-opening-child-account-api-dm-create",errorFireEventHandler:"accounts-opening-child-account-api-dm-create-error"}),customElements.define(xt.is,xt);class Nt extends lt{static get is(){return"bbva-global-account-financial-statement-base-api-dm"}resetAccountFinancialStatement(){this.accountFinancialStatement={}}getAccountFinancialStatement(e,t,s){s=Object.assign({"account-id":e,"financial-statement-id":t},s),this._generateGetService(this._getService("get",{},s),this.constructor.GET_EVENTS,s.fields)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}AccountFinancialStatement`,this._getBgadp(i))}_getBgadp(e){return{getAccountFinancialStatementV0:()=>new Et(e),default:()=>"BGADP does not exist."}}}H(Nt,"GET_EVENTS",{customEvent:"account-financial-statement-api-dm-fetch",errorFireEventHandler:"account-financial-statement-api-dm-fetch-error"}),customElements.define(Nt.is,Nt);class Mt extends lt{static get is(){return"bbva-global-account-financial-statements-base-api-dm"}resetAccountFinancialStatements(){this.accountFinancialStatements=[]}getAccountFinancialStatements(e,t){t=Object.assign({"account-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields,this._paginationMapping)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}AccountFinancialStatements`,this._getBgadp(i))}_getBgadp(e){return{getAccountFinancialStatementsV0:()=>new St(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}_paginationMapping(e){return e}}H(Mt,"GET_EVENTS",{customEvent:"account-financial-statements-api-dm-fetch",paginationEvent:"account-financial-statements-api-dm-pagination",errorFireEventHandler:"account-financial-statements-api-dm-fetch-error"}),customElements.define(Mt.is,Mt);class qt extends lt{static get is(){return"bbva-global-accounts-account-related-contracts-base-api-dm"}resetAccountRelatedContracts(){this.accountRelatedContracts=[]}getAccountRelatedContracts(e,t){t=Object.assign({"account-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}AccountRelatedContracts`,this._getBgadp(i))}_getBgadp(e){return{getAccountRelatedContractsV2:()=>new ge(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}H(qt,"GET_EVENTS",{customEvent:"account-related-contracts-api-dm-fetch",errorFireEventHandler:"account-related-contracts-api-dm-fetch-error"}),customElements.define(qt.is,qt);const Ht=Object.freeze({INCOME:"income",PAYMENT:"payment"}),Ft=Object.freeze({EMAIL:"EMAIL",MOBILE:"MOBILE"}),Lt=Object.freeze({MAIN:"main",OTHER:"other"}),jt={year:"numeric",month:"long",day:"numeric",hour:"2-digit",minute:"2-digit"},Vt=Object.freeze({OFFER:"offer",MULTISTEP:"multistep",THANK_YOU:"thankYou"}),Ut=Object.freeze({DEFAULT_ERROR:"defaultError",INSUFFICIENT_STOCK:"insufficientStock"}),Bt=Object.freeze({BENEFITS:"benefits",CONSIDERATIONS:"considerations",SPECIFICATIONS:"specifications"}),Kt=Object.freeze({MPOS:"MPOS",TOP:"TAP_ON_PHONE"}),Gt=Object.freeze({AMOUNT_TYPE:"TOTAL_DEBT",ACCOUNTS:"ACCOUNTS"}),zt=Object.freeze({TAP_ON_PHONE:"TAP_ON_PHONE"}),Wt=Object.freeze({ACCOUNTS:"accounts",ADD_PRODUCTS:"addProducts",AEM_COMMISSIONS:"aemCommissions",CLIENT_ONBOARDING:"clientOnboarding",CUSTOMER_ADDRESSES:"customerAddresses",CUSTOMER_CONTACT_DETAILS:"customerContactDetails",DOCUMENT_FILE:"documentFile",ECONOMIC_ACTIVITIES:"economicActivities",LOAD_OFFER:"loadOffer",MPOS_PRICE_STOCK:"mposPriceStock",MPOS_PURCHASE:"mposPurchase",SERVICE_PAYMENTS:"servicePayments",TERM_TYPES:"termTypes"}),Yt=Object.freeze({CUSTOMER_CONTACT_DETAILS:"customerContactDetails",CUSTOMER_ADDRESSES:"customerAddresses",CLIENT_ONBOARDING:"clientOnboarding",SERVICE_PAYMENTS:"servicePayments"}),Xt=Object.freeze({ALERT_MPOS_PRICE_STOCK:"alertMposPriceStock",MODAL_ALL_ACCOUNTS_LIST:"modalAllAccountsList",MODAL_CARD_READER_CONFIRMATION:"modalCardReaderConfirmation",MODAL_COMMISSIONS_DETAILS:"modalCommissionsDetails",MODAL_DELETE_OTHER_ADDRESS:"modalDeleteOtherAddress",MODAL_DELIVERY_DETAILS:"modalDeliveryDetails",MODAL_EXIT_ORDER:"modalExitOrder",MODAL_FAQS:"modalFaqs",MODAL_OTHER_ADDRESS:"modalOtherAddress",MODAL_PAYMENT_METHODS_DETAILS:"modalPaymentMethodsDetails",MODAL_PRIVACY_NOTICE:"modalPrivacyNotice",PAGE_MULTISTEP:"pageMultistep",PAGE_OFFER:"pageOffer",PAGE_THANK_YOU:"pageThankYou"}),Jt=Object.freeze({FAMILIES:"families",CATEGORIES:"categories",ACTIVITIES:"activities"}),Qt=Object.freeze({KEY_VALUE:1}),Zt=Object.freeze({UNIT_PRICE:"XXX.XX",SERVICES_ID:"123456"}),es=Object.freeze(["HOME","POSTAL","LEGAL","WORK"]),ts=Object.freeze({SPECIALS_CHARACTERS:/^[a-zA-Z0-9À-ÿ\u00f1\u00d1\s]*$/,MAX_CHARACTERS:/^(?=.{0,220}$)([\s\S]*)*$/,SPECIALS_CHARACTERS_AND_MAX_CHARACTERS_PATTERN:"^[a-zA-Z0-9À-ÿñÑ\\s]{0,255}$"}),ss=Object.freeze({SPECIALS_CHARACTERS_AND_MAX_CHARACTERS_PATTERN:"^[!-πÀ-ÿ‘-•‰‹›⁄€™∂∏∑√∫≈≠≤≥◊ﬂ–∞…∆ﬁ—\\s]{0,255}$"}),is=Object.freeze({MODAL_SEQUENTIAL:"modal-sequential"}),as=Object.freeze({WITH_CARD_READER:"withCardReader",WITHOUT_CARD_READER:"withoutCardReader"}),rs=Object.freeze({ALERT_MPOS_PRICE_INSUFFICIENT_STOCK:"alertMposPriceInsufficientStock",ALERT_MPOS_PRICE_STOCK:"alertMposPriceStock",MODAL_COMMISSIONS_DETAILS:"modalCommissionsDetails",MODAL_DELIVERY_DETAILS:"modalDeliveryDetails",MODAL_PAYMENT_METHODS_DETAILS:"modalPaymentMethodsDetails",MODAL_PRIVACY_NOTICE:"modalPrivacyNotice",PAGE_OFFER:"pageOffer",PAGE_THANK_YOU:"pageThankYou",STEP_CARD_READER:"stepCardReader",STEP_DELIVERY_ADDRESS:"stepDeliveryAddress",STEP_INCOME_ACCOUNT:"stepIncomeAccount",STEP_ORDER_INFO:"stepOrderInfo",STEP_PAYMENT_ACCOUNT:"stepPaymentAccount",STEP_SUMMARY:"stepSummary",STEP_TERMS_AND_CONDITIONS:"stepTermsAndConditions"}),ns=Object.freeze({CLICK_COMMISSIONS_DETAILS_LINK:"clickCommissionsDetailsLink",CLICK_PAYMENT_METHODS_DETAILS_LINK:"clickPaymentMethodsDetailsLink",CLICK_START_ORDER_BUTTON:"clickStartOrderButton",CLICK_ASK_FOR_ADVICE_LINK:"clickAskForAdviceLink"}),os=Object.freeze({MPOS_TOP_WITH_CARD_READER:"mposTopWithCardReader",MPOS_TOP_WITHOUT_CARD_READER:"mposTopWithoutCardReader",MPOS_TOP_WITHOUT_STOCK:"mposTopWithoutStock",MPOS_TOP:"mposTop",MPOS:"mpos",TOP:"top"}),cs=Object.freeze({LOAD_OFFER:"loadOffer",OPEN_COMMISSIONS_DETAILS_MODAL:"openCommissions",RETRY_MPOS_PRICE_STOCK:"retryMposPriceStock",COMPLETE_OFFER:"completeOffer",TOGGLE_CONTACT_DETAILS_MASK:"toggleContactDetailsMask",SELECT_ECONOMIC_FAMILY:"selectEconomicFamily",SELECT_ECONOMIC_CATEGORY:"selectEconomicCategory",COMPLETE_ORDER_INFO:"completeOrderInfo",COMPLETE_INCOME_ACCOUNT:"completeIncomeAccount",COMPLETE_CARD_READER:"completeCardReader",COMPLETE_DELIVERY_ADDRESS:"completeDeliveryAddress",TOGGLE_DELIVERY_ADDRESS_MASK:"toggleDeliveryAddressMask",COMPLETE_PAYMENT_ACCOUNT:"completePaymentAccount",COMPLETE_TERMS_AND_CONDITIONS:"completeTermsAndConditions",OPEN_TERMS_AND_CONDITIONS_FILE:"openTermsAndConditionsFile",COMPLETE_MULTISTEP:"completeMultistep"});const ls=new class{constructor(){this.state={},this.listeners=[]}clearState(){this.state={}}getState(){return this.state}reset(){this.clearState(),this.listeners=[]}setState(e,t=!1){this.state=t?{...e}:{...this.state,...e},this.listeners.forEach((e=>e(this.state)))}subscribe(e){return this.listeners.push(e),()=>{this.listeners=this.listeners.filter((t=>t!==e))}}},ds=e=>{const t=e.toLowerCase();return t.charAt(0).toUpperCase()+t.slice(1)},hs=e=>e.replace(/\*+/g,"•"),ps=e=>`•${e.slice(-4)}`,us=e=>Number(e.replace(/\s/g,"").slice(-10)),ms=e=>e.replace(/-+(?=\s*,)/g,"");function _s(e,t,s){const i=[];return e.forEach((e=>{t.forEach((t=>{var a;if(null!=t&&null!==(a=t.componentTypes)&&void 0!==a&&a.includes(e))if(s){const e=null!=t&&t.name?t.name:null==t?void 0:t.code;i.push(e)}else i.push(null==t?void 0:t.code)}))})),i}const gs=e=>e.reduce(((e,t)=>{var s,i,a;const r=null==t||null===(s=t.contact)||void 0===s?void 0:s.contactDetailType,n=null==t||null===(i=t.contact)||void 0===i?void 0:i.number,o=null==t||null===(a=t.contact)||void 0===a?void 0:a.address;if(null==t?void 0:t.isPreferential){if(r===Ft.MOBILE)return{...e,mobile:hs(n)};if(r===Ft.EMAIL)return{...e,email:hs(o)}}else{if(!e.mobile&&r===Ft.MOBILE)return{...e,mobile:hs(n)};if(!e.email&&r===Ft.EMAIL)return{...e,email:hs(o)}}return e}),{}),ys=(e,t,s,i)=>{var a,r;let n=[],o="";const c=e.filter((e=>{var t;return-1!==es.indexOf(null==e||null===(t=e.addressType)||void 0===t?void 0:t.id)})).sort(((e,t)=>{var s,i;return es.indexOf(null==e||null===(s=e.addressType)||void 0===s?void 0:s.id)-es.indexOf(null==t||null===(i=t.addressType)||void 0===i?void 0:i.id)})).shift(),l=null==c||null===(a=c.location)||void 0===a?void 0:a.formattedAddress,d=null==c||null===(r=c.location)||void 0===r?void 0:r.addressComponents;return i?(n=_s(s,d,i),o=`${hs(l)}, ${n.join(", ")}`):(n=_s(t,d,i),o=`${hs(l)} ${n.join(", ")}`),{fullFormattedAddress:o}},bs=e=>null==e?void 0:e.map((e=>{var t,s,i,a,r,n,o,c,l;return{name:null==e||null===(t=e.product)||void 0===t?void 0:t.name,number:null==e?void 0:e.number,amount:null==e||null===(s=e.availableBalance)||void 0===s||null===(i=s.currentBalances)||void 0===i||null===(a=i[0])||void 0===a?void 0:a.amount,currency:null==e||null===(r=e.availableBalance)||void 0===r||null===(n=r.currentBalances)||void 0===n||null===(o=n[0])||void 0===o?void 0:o.currency,accountId:null==e?void 0:e.id,numberClabe:null==e||null===(c=e.formats)||void 0===c||null===(l=c[0])||void 0===l?void 0:l.number}})),vs=(e,t,s)=>{var i;return{name:null==e||null===(i=e[0])||void 0===i?void 0:i.name,terms:null==e?void 0:e.map((e=>{var i,a;return{id:null==e?void 0:e.id,description:null==e||null===(i=e.description)||void 0===i||null===(a=i.replace(Zt.SERVICES_ID,t))||void 0===a?void 0:a.replace(Zt.UNIT_PRICE,s)}}))}},fs=(e,t)=>{var s,i,a,r;const n=`${t}Account`;if(null==e||!e[n]||!Object.keys(e[n]).length)return{};return{accountData:{number:null==e||null===(s=e[n])||void 0===s?void 0:s.number,name:null==e||null===(i=e[n])||void 0===i?void 0:i.name,amount:null==e||null===(a=e[n])||void 0===a?void 0:a.amount,currency:null==e||null===(r=e[n])||void 0===r?void 0:r.currency,accountDescription:"availableBalance"}}};function Ts({name:e,errorId:t,defaultMessage:s}){return class extends Error{constructor(i=s){super(i),this.name=e,this.errorId=t,Error.captureStackTrace&&Error.captureStackTrace(this,this.constructor)}}}const Ss=Ts({name:"AccountsError",errorId:Wt.ACCOUNTS,defaultMessage:"An error occurred with the Accounts service."}),Es=Ts({name:"AddProductsError",errorId:Wt.ADD_PRODUCTS,defaultMessage:"An error occurred with the AddProducts service."}),Cs=Ts({name:"ClientOnboardingError",errorId:Wt.CLIENT_ONBOARDING,defaultMessage:"An error occurred with the ClientOnboarding service."}),As=Ts({name:"CommissionsError",errorId:Wt.AEM_COMMISSIONS,defaultMessage:"An error occurred with the aem commissions service."}),Rs=Ts({name:"CustomerAddressesError",errorId:Wt.CUSTOMER_ADDRESSES,defaultMessage:"An error occurred with the CustomerAddresses service."}),Os=Ts({name:"CustomerContactDetailsError",errorId:Wt.CUSTOMER_CONTACT_DETAILS,defaultMessage:"An error occurred with the CustomerContactDetails service."}),Ps=Ts({name:"DocumentFileError",errorId:Wt.DOCUMENT_FILE,defaultMessage:"An error occurred with the DocumentFile service."}),$s=Ts({name:"EconomicActivitiesError",errorId:Wt.ECONOMIC_ACTIVITIES,defaultMessage:"An error occurred with the EconomicActivities service."}),Ds=Ts({name:"MposPriceStockError",errorId:Wt.MPOS_PRICE_STOCK,defaultMessage:"An error occurred with the MposPriceStock service."}),Is=Ts({name:"MposPurchaseError",errorId:Wt.MPOS_PURCHASE,defaultMessage:"An error occurred with the MposPurchase service."}),ks=Ts({name:"ServicePaymentsError",errorId:Wt.SERVICE_PAYMENTS,defaultMessage:"An error occurred with the ServicePayments service."}),ws=Ts({name:"TermTypesError",errorId:Wt.TERM_TYPES,defaultMessage:"An error occurred with the TermTypes service."});class xs extends(G(e(t(M)))){static get is(){return"payments-mpos-digital-sales-accounts-dm"}static get scopedElements(){const e=[Ot];return xs.scopedElementsFromClasses(e)}static get properties(){return{accountsApiVersion:{type:Number,attribute:"accounts-api-version"},accountsOrderBy:{type:String,attribute:"accounts-order-by"},countryCode:{type:String,attribute:"country-code"}}}constructor(){super(),this.accountsApiVersion=0,this.accountsOrderBy="",this.countryCode="",this.host="",this.reject=null,this.requiredToken="tsec",this.resolve=null}firstUpdated(e){super.firstUpdated(e),this._accountsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-accounts-api-dm"]')}getAccounts(){return new Promise(((e,t)=>{this.resolve=e,this.reject=t,this._accountsDm.accounts&&Object.keys(this._accountsDm.accounts).length?e(bs(this._accountsDm.accounts)):this._accountsDm.getAccounts({orderBy:this.accountsOrderBy})}))}_setDmAccounts(e){this._accountsDm.accounts=e}_onSuccess({detail:e}){this._setDmAccounts(e),this.resolve(bs(e))}_onError(){this.reject(new Ss)}render(){return F`
      <bbva-global-accounts-api-dm
        .country=${this.countryCode}
        .host=${this.host}
        .requiredToken=${this.requiredToken}
        .version=${this.accountsApiVersion}
        ?native=${this.native}
        @accounts-api-dm-fetch=${this._onSuccess}
        @api-dm-response-error=${this._onError}
      >
      </bbva-global-accounts-api-dm>
    `}}class Ns extends(N(M)){}let Ms=class{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let s=Object(this),i=s.length>>>0;if(0===i)return!1;let a=0|t,r=Math.max(a>=0?a:i-Math.abs(a),0);for(;r<i;){if((n=s[r])===(o=e)||"number"==typeof n&&"number"==typeof o&&isNaN(n)&&isNaN(o))return!0;r++}var n,o;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var s=[],i=0,a="",r=0,n=arguments.length;r!==n;++r){var o=+arguments[r];if(!(o<1114111&&o>>>0===o))throw RangeError("Invalid code point: "+o);o<=65535?i=s.push(o):(o-=65536,i=s.push(55296+(o>>10),o%1024+56320)),i>=16383&&(a+=e.apply(null,s),s.length=0)}return a+e.apply(null,s)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",s=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${s&&s.message}`)}},qs=class extends Ms{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}};const Hs=0,Fs=1,Ls="jwt",js="tsec",Vs="none";let Us=class extends Ms{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=Hs,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new qs,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=js:this.requiredToken=Vs,this.requiresJWT=!1):this.requiredToken===js?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===Ls?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===Vs?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(js)}_setJwtHandler(){this._setTokenHandler(Ls)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((s,i)=>{t=Object.assign(t,{resolve:s,reject:i}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let s=this._getRequestHeaders();Object.keys(s).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,s[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=q),e}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let s=e.replace(/[\{\}]+/g,""),i=t[s];return i?delete t[s]:this._error(9,`Missing ${s} param value`),i})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let s=Object.keys(t);s.length&&(e=[e,s.map((e=>{let s=t[e];return Array.isArray(s)&&this.paramArrayMode===Fs?this._arrayToQueryParam(e,s):`${e}=${s}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(js,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(Ls,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(s){var i=t.getItem(s);i&&"null"!==i&&(e[s]=i)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const s=window.sessionStorage;t=Object.keys(s).filter((t=>t.startsWith(e))).reduce(((t,i)=>(t[i.replace(e,"")]=s.getItem(i),t)),{})}return t}_getTokenForRequestHeaders(e,t){const s=`${e}Handler`,i=e===Ls?"JWT ":"",a=e===Ls?"Authorization":js;if(void 0===this[s]||null===this[s])this._error(11,`${e} handler is undefined`);else{const r=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let n=this[s].getItem(r);n?t[a]=t[a]||i+n:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((s=>{t.push(`${s}=${e[s]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(s){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(s){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let s;const i=new Promise(((e,t)=>{s=(s,i)=>{s?t(s):e(i)}}));return t.addEventListener("loadend",(function e(i){t.removeEventListener("loadend",e),i.error?s(i.error):s(null,t.result)})),t.readAsText(e),i}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let s=0;for(;s<e.length;){let i=e[s],a=0,r=0;if(i<=127?(a=0,r=255&i):i<=223?(a=1,r=31&i):i<=239?(a=2,r=15&i):i<=244&&(a=3,r=7&i),e.length-s-a>0){let t=0;for(;t<a;)i=e[s+t+1],r=r<<6|63&i,t+=1}else r=65533,a=e.length-s;t+=String.fromCodePoint(r),s+=a+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},s=e.trim().split(/[\r\n]+/);for(const e in s)if(s.hasOwnProperty(e)&&""!==s[e]){let i=": ",a=s[e].split(i);t[a.shift().toLowerCase()]=a.join(i)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,s,i){let a=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(i)>=0&&(a=t.getResponseHeader(i));break;case this._NATIVE_XHR:t&&t.headers&&(a=JSON.parse(t.headers)[i])}if(a){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):s;e.getItem(t)!==a&&(e.setItem(t,a),this._emitTokenUpdate(s,a))}}_emitTokenUpdate(e,t){if(this.htmlContext){const s=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(s)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,s,i,a,r;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),s=e.getResponseHeader("AuthenticationData"),i=e.getResponseHeader("AuthenticationState"),a=e.getResponseHeader("AuthenticationChallenge"),r=e.getResponseHeader("AuthenticationResponse");else{let n=JSON.parse(e.headers);t=n.authenticationtype,s=n.authenticationdata||null,i=n.authenticationstate,a=n.authenticationchallenge,r=n.authenticationresponse}return{type:t,data:s,state:i,challenge:a,response:r}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",s=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const i=this._getSignatureData(e,t,s);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:i}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",s="",i=""){let a;if("object"==typeof e&&e){const r=this._getSignatureData(e.signatureType,t,s);a=this._makeKeyValuePairFromObject(r,e.signatureValue),e.challenge&&(a+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(a,e.signatureType,i)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(a=`password=${e}`,this._buildSignatureHeaders(a,"2",i)):(a=`${s}=${e}`,this._buildSignatureHeaders(a,t,i)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let s,i=e.split(",");if(i.length>1){s=i.map((e=>`${e}=${t[e]}`)).join(",")}else s=`${e}=${t}`;return s}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",s=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),s&&(this.headers=Object.assign(this.headers,{AuthenticationState:s})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let s=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),a=this._ERROR_CODES.SIGNATURE_INVALID.includes(i),{type:r,data:n,state:o,challenge:c,response:l}=this._extractSignatureResponseHeaders(e),d=this._getRequestMetadata(e);if(a)this._notifySignatureInvalid(d),s=!0;else if(r)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(i)?(this._notifySignatureTypeUsingErrorCode(i,d,r,n,o,c,l),s=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(d,r,n,o,c,l),s=!0}return s}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let s=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),a=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(i),r=this._getRequestMetadata(e);a&&(this._notifyWaitingForProcessResponse(r),s=!0)}return s}_notifySignatureRequiredFirstStep(e,t,s,i){this._defineSignatureType(t,s),this._defineSignatureValue(t,s,i),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:s,metadata:e}}))}_notifySignatureRequired(e,t,s,i,a,r){this._defineSignatureValue(t,s,i);const n={type:t,data:s,challenge:a,metadata:e};r&&(n.response=r),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:n}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:s}=e;return{path:this._path,method:this.method,url:t,status:s}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",s=""){const i=t.split(";").findIndex((t=>t===e));return s?s.split(";")[i]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,s,i,a,r){i?this._notifySignatureRequired(e,t,s,i,a,r):this._notifySignatureRequiredFirstStep(e,t,s,i)}_notifySignatureTypeUsingErrorCode(e,t,s,i,a,r,n){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,s,i,a):this._notifySignatureRequired(t,s,i,a,r,n)}},Bs=class extends Us{constructor(e=null){super(Object.assign(e||{},{method:"POST"}))}toString(e=""){return super.toString(e||"BGADPRequestPOST")}};class Ks extends Bs{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`openpay/v${this.version}/add-products`)}toString(){return super.toString("BGADPOpenpayAddProductsPostV0")}}class Gs extends Bs{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`openpay/v${this.version}/client-onboarding`)}toString(){return super.toString("BGADPOpenpayClientOnboardingPostV0")}}class zs extends Bs{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`openpay/v${this.version}/mpos-purchase`)}toString(){return super.toString("BGADPOpenpayMposPurchasePostV0")}}let Ws=class{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let s=Object(this),i=s.length>>>0;if(0===i)return!1;let a=0|t,r=Math.max(a>=0?a:i-Math.abs(a),0);for(;r<i;){if((n=s[r])===(o=e)||"number"==typeof n&&"number"==typeof o&&isNaN(n)&&isNaN(o))return!0;r++}var n,o;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var s=[],i=0,a="",r=0,n=arguments.length;r!==n;++r){var o=+arguments[r];if(!(o<1114111&&o>>>0===o))throw RangeError("Invalid code point: "+o);o<=65535?i=s.push(o):(o-=65536,i=s.push(55296+(o>>10),o%1024+56320)),i>=16383&&(a+=e.apply(null,s),s.length=0)}return a+e.apply(null,s)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",s=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${s&&s.message}`)}},Ys=class extends Ws{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}};const Xs=0,Js=1,Qs="jwt",Zs="tsec",ei="none";let ti=class extends Ws{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=Xs,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new Ys,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=Zs:this.requiredToken=ei,this.requiresJWT=!1):this.requiredToken===Zs?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===Qs?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===ei?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(Zs)}_setJwtHandler(){this._setTokenHandler(Qs)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((s,i)=>{t=Object.assign(t,{resolve:s,reject:i}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let s=this._getRequestHeaders();Object.keys(s).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,s[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=q),e}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let s=e.replace(/[\{\}]+/g,""),i=t[s];return i?delete t[s]:this._error(9,`Missing ${s} param value`),i})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let s=Object.keys(t);s.length&&(e=[e,s.map((e=>{let s=t[e];return Array.isArray(s)&&this.paramArrayMode===Js?this._arrayToQueryParam(e,s):`${e}=${s}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(Zs,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(Qs,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(s){var i=t.getItem(s);i&&"null"!==i&&(e[s]=i)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const s=window.sessionStorage;t=Object.keys(s).filter((t=>t.startsWith(e))).reduce(((t,i)=>(t[i.replace(e,"")]=s.getItem(i),t)),{})}return t}_getTokenForRequestHeaders(e,t){const s=`${e}Handler`,i=e===Qs?"JWT ":"",a=e===Qs?"Authorization":Zs;if(void 0===this[s]||null===this[s])this._error(11,`${e} handler is undefined`);else{const r=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let n=this[s].getItem(r);n?t[a]=t[a]||i+n:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((s=>{t.push(`${s}=${e[s]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(s){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(s){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let s;const i=new Promise(((e,t)=>{s=(s,i)=>{s?t(s):e(i)}}));return t.addEventListener("loadend",(function e(i){t.removeEventListener("loadend",e),i.error?s(i.error):s(null,t.result)})),t.readAsText(e),i}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let s=0;for(;s<e.length;){let i=e[s],a=0,r=0;if(i<=127?(a=0,r=255&i):i<=223?(a=1,r=31&i):i<=239?(a=2,r=15&i):i<=244&&(a=3,r=7&i),e.length-s-a>0){let t=0;for(;t<a;)i=e[s+t+1],r=r<<6|63&i,t+=1}else r=65533,a=e.length-s;t+=String.fromCodePoint(r),s+=a+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},s=e.trim().split(/[\r\n]+/);for(const e in s)if(s.hasOwnProperty(e)&&""!==s[e]){let i=": ",a=s[e].split(i);t[a.shift().toLowerCase()]=a.join(i)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,s,i){let a=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(i)>=0&&(a=t.getResponseHeader(i));break;case this._NATIVE_XHR:t&&t.headers&&(a=JSON.parse(t.headers)[i])}if(a){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):s;e.getItem(t)!==a&&(e.setItem(t,a),this._emitTokenUpdate(s,a))}}_emitTokenUpdate(e,t){if(this.htmlContext){const s=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(s)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,s,i,a,r;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),s=e.getResponseHeader("AuthenticationData"),i=e.getResponseHeader("AuthenticationState"),a=e.getResponseHeader("AuthenticationChallenge"),r=e.getResponseHeader("AuthenticationResponse");else{let n=JSON.parse(e.headers);t=n.authenticationtype,s=n.authenticationdata||null,i=n.authenticationstate,a=n.authenticationchallenge,r=n.authenticationresponse}return{type:t,data:s,state:i,challenge:a,response:r}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",s=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const i=this._getSignatureData(e,t,s);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:i}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",s="",i=""){let a;if("object"==typeof e&&e){const r=this._getSignatureData(e.signatureType,t,s);a=this._makeKeyValuePairFromObject(r,e.signatureValue),e.challenge&&(a+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(a,e.signatureType,i)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(a=`password=${e}`,this._buildSignatureHeaders(a,"2",i)):(a=`${s}=${e}`,this._buildSignatureHeaders(a,t,i)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let s,i=e.split(",");if(i.length>1){s=i.map((e=>`${e}=${t[e]}`)).join(",")}else s=`${e}=${t}`;return s}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",s=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),s&&(this.headers=Object.assign(this.headers,{AuthenticationState:s})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let s=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),a=this._ERROR_CODES.SIGNATURE_INVALID.includes(i),{type:r,data:n,state:o,challenge:c,response:l}=this._extractSignatureResponseHeaders(e),d=this._getRequestMetadata(e);if(a)this._notifySignatureInvalid(d),s=!0;else if(r)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(i)?(this._notifySignatureTypeUsingErrorCode(i,d,r,n,o,c,l),s=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(d,r,n,o,c,l),s=!0}return s}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let s=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),a=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(i),r=this._getRequestMetadata(e);a&&(this._notifyWaitingForProcessResponse(r),s=!0)}return s}_notifySignatureRequiredFirstStep(e,t,s,i){this._defineSignatureType(t,s),this._defineSignatureValue(t,s,i),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:s,metadata:e}}))}_notifySignatureRequired(e,t,s,i,a,r){this._defineSignatureValue(t,s,i);const n={type:t,data:s,challenge:a,metadata:e};r&&(n.response=r),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:n}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:s}=e;return{path:this._path,method:this.method,url:t,status:s}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",s=""){const i=t.split(";").findIndex((t=>t===e));return s?s.split(";")[i]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,s,i,a,r){i?this._notifySignatureRequired(e,t,s,i,a,r):this._notifySignatureRequiredFirstStep(e,t,s,i)}_notifySignatureTypeUsingErrorCode(e,t,s,i,a,r,n){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,s,i,a):this._notifySignatureRequired(t,s,i,a,r,n)}},si=class extends ti{constructor(e=null){super(Object.assign(e||{},{method:"POST"}))}toString(e=""){return super.toString(e||"BGADPRequestPOST")}};class ii extends si{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`openpay/v${this.version}/client-onboarding`)}toString(){return super.toString("BGADPOpenpayClientOnboardingPostV2")}}class ai extends Ns{static get is(){return"bbva-global-openpay-client-onboarding-base-api-dm"}postClientOnboarding(e){this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}ClientOnboarding`,this._getBgadp(i))}_getBgadp(e){return{postClientOnboardingV0:()=>new Gs(e),postClientOnboardingV2:()=>new ii(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}H(ai,"POST_EVENTS",{customEvent:"client-onboarding-api-dm-create",errorFireEventHandler:"client-onboarding-api-dm-create-error"}),customElements.define(ai.is,ai);class ri extends Ns{static get is(){return"bbva-global-client-onboarding-api-dm"}static get properties(){return{country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.country="",this.localCustomProperties={},this._countries=[],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties","maxRetries","pendingTimeOut"],this._loaded=!1,this._requestParams={}}update(e){super.update(e),e.forEach(((e,t)=>{"country"===t&&this.country&&this.country!==e?this._loadModule():"_module"!==t&&"_requestParams"!==t&&"_loaded"!==t&&this._module&&this[t]!==e?this._module[t]=this[t]:("_requestParams"===t&&this._requestParams&&this._requestParams!==e&&void 0!==e&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===t&&this._loaded)&&Object.entries(this._requestParams).forEach((([e])=>{this[`_${e}ClientOnboarding`]()}))}))}get lastResponse(){return this.module.lastResponse}get lastResponseHeaders(){return this.module.lastResponseHeaders}get lastResponseRaw(){return this.module.lastResponseRaw}get lastRequest(){return this.module.lastRequest}async _loadModule(){const e=this._capitalize(this.country);if(this._countries.includes(e)&&this._modules[e]){const t=`BbvaOpenpayClientOnboarding${e}ApiDm`;(0,this._modules[e])().then((async e=>{const s=e[t].is;this._module=this._createModuleElement(s),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-client-onboarding-api-dm-module-load")})).catch((async e=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-client-onboarding-api-dm-module-error",e)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(e){return e.charAt(0).toUpperCase()+e.slice(1).toLowerCase()}_createModuleElement(e=ai.is){const t=document.createElement(e);return this._bindConfig(t),t}async _bindConfig(e){this._configProperties.forEach((t=>{e[t]=this[t]})),await this.updateComplete}_dispatchEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}async postClientOnboarding(e){await this.module.updateComplete,this._requestParams.post?this._requestParams.post.push({body:e}):this._requestParams={post:[{body:e}]}}async _postClientOnboarding(){await this.module.updateComplete,this._requestParams.post.forEach((e=>{this.module.postClientOnboarding(e.body)})),delete this._requestParams.post}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return F` ${this._module?this._module:""}`}}let ni=class{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let s=Object(this),i=s.length>>>0;if(0===i)return!1;let a=0|t,r=Math.max(a>=0?a:i-Math.abs(a),0);for(;r<i;){if((n=s[r])===(o=e)||"number"==typeof n&&"number"==typeof o&&isNaN(n)&&isNaN(o))return!0;r++}var n,o;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var s=[],i=0,a="",r=0,n=arguments.length;r!==n;++r){var o=+arguments[r];if(!(o<1114111&&o>>>0===o))throw RangeError("Invalid code point: "+o);o<=65535?i=s.push(o):(o-=65536,i=s.push(55296+(o>>10),o%1024+56320)),i>=16383&&(a+=e.apply(null,s),s.length=0)}return a+e.apply(null,s)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",s=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${s&&s.message}`)}},oi=class extends ni{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}};const ci=0,li=1,di="jwt",hi="tsec",pi="none";let ui=class extends ni{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=ci,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new oi,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=hi:this.requiredToken=pi,this.requiresJWT=!1):this.requiredToken===hi?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===di?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===pi?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(hi)}_setJwtHandler(){this._setTokenHandler(di)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((s,i)=>{t=Object.assign(t,{resolve:s,reject:i}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let s=this._getRequestHeaders();Object.keys(s).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,s[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=q),e}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let s=e.replace(/[\{\}]+/g,""),i=t[s];return i?delete t[s]:this._error(9,`Missing ${s} param value`),i})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let s=Object.keys(t);s.length&&(e=[e,s.map((e=>{let s=t[e];return Array.isArray(s)&&this.paramArrayMode===li?this._arrayToQueryParam(e,s):`${e}=${s}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(hi,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(di,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(s){var i=t.getItem(s);i&&"null"!==i&&(e[s]=i)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const s=window.sessionStorage;t=Object.keys(s).filter((t=>t.startsWith(e))).reduce(((t,i)=>(t[i.replace(e,"")]=s.getItem(i),t)),{})}return t}_getTokenForRequestHeaders(e,t){const s=`${e}Handler`,i=e===di?"JWT ":"",a=e===di?"Authorization":hi;if(void 0===this[s]||null===this[s])this._error(11,`${e} handler is undefined`);else{const r=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let n=this[s].getItem(r);n?t[a]=t[a]||i+n:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((s=>{t.push(`${s}=${e[s]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(s){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(s){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let s;const i=new Promise(((e,t)=>{s=(s,i)=>{s?t(s):e(i)}}));return t.addEventListener("loadend",(function e(i){t.removeEventListener("loadend",e),i.error?s(i.error):s(null,t.result)})),t.readAsText(e),i}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let s=0;for(;s<e.length;){let i=e[s],a=0,r=0;if(i<=127?(a=0,r=255&i):i<=223?(a=1,r=31&i):i<=239?(a=2,r=15&i):i<=244&&(a=3,r=7&i),e.length-s-a>0){let t=0;for(;t<a;)i=e[s+t+1],r=r<<6|63&i,t+=1}else r=65533,a=e.length-s;t+=String.fromCodePoint(r),s+=a+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},s=e.trim().split(/[\r\n]+/);for(const e in s)if(s.hasOwnProperty(e)&&""!==s[e]){let i=": ",a=s[e].split(i);t[a.shift().toLowerCase()]=a.join(i)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,s,i){let a=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(i)>=0&&(a=t.getResponseHeader(i));break;case this._NATIVE_XHR:t&&t.headers&&(a=JSON.parse(t.headers)[i])}if(a){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):s;e.getItem(t)!==a&&(e.setItem(t,a),this._emitTokenUpdate(s,a))}}_emitTokenUpdate(e,t){if(this.htmlContext){const s=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(s)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,s,i,a,r;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),s=e.getResponseHeader("AuthenticationData"),i=e.getResponseHeader("AuthenticationState"),a=e.getResponseHeader("AuthenticationChallenge"),r=e.getResponseHeader("AuthenticationResponse");else{let n=JSON.parse(e.headers);t=n.authenticationtype,s=n.authenticationdata||null,i=n.authenticationstate,a=n.authenticationchallenge,r=n.authenticationresponse}return{type:t,data:s,state:i,challenge:a,response:r}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",s=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const i=this._getSignatureData(e,t,s);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:i}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",s="",i=""){let a;if("object"==typeof e&&e){const r=this._getSignatureData(e.signatureType,t,s);a=this._makeKeyValuePairFromObject(r,e.signatureValue),e.challenge&&(a+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(a,e.signatureType,i)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(a=`password=${e}`,this._buildSignatureHeaders(a,"2",i)):(a=`${s}=${e}`,this._buildSignatureHeaders(a,t,i)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let s,i=e.split(",");if(i.length>1){s=i.map((e=>`${e}=${t[e]}`)).join(",")}else s=`${e}=${t}`;return s}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",s=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),s&&(this.headers=Object.assign(this.headers,{AuthenticationState:s})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let s=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),a=this._ERROR_CODES.SIGNATURE_INVALID.includes(i),{type:r,data:n,state:o,challenge:c,response:l}=this._extractSignatureResponseHeaders(e),d=this._getRequestMetadata(e);if(a)this._notifySignatureInvalid(d),s=!0;else if(r)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(i)?(this._notifySignatureTypeUsingErrorCode(i,d,r,n,o,c,l),s=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(d,r,n,o,c,l),s=!0}return s}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let s=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),a=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(i),r=this._getRequestMetadata(e);a&&(this._notifyWaitingForProcessResponse(r),s=!0)}return s}_notifySignatureRequiredFirstStep(e,t,s,i){this._defineSignatureType(t,s),this._defineSignatureValue(t,s,i),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:s,metadata:e}}))}_notifySignatureRequired(e,t,s,i,a,r){this._defineSignatureValue(t,s,i);const n={type:t,data:s,challenge:a,metadata:e};r&&(n.response=r),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:n}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:s}=e;return{path:this._path,method:this.method,url:t,status:s}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",s=""){const i=t.split(";").findIndex((t=>t===e));return s?s.split(";")[i]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,s,i,a,r){i?this._notifySignatureRequired(e,t,s,i,a,r):this._notifySignatureRequiredFirstStep(e,t,s,i)}_notifySignatureTypeUsingErrorCode(e,t,s,i,a,r,n){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,s,i,a):this._notifySignatureRequired(t,s,i,a,r,n)}},mi=class extends ui{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}};class _i extends mi{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`openpay/v${this.version}/mpos-price-stock`)}toString(){return super.toString("BGADPOpenpayMposPriceStockGetV1")}}class gi extends Ns{static get is(){return"bbva-global-mpos-price-stock-api-dm"}static get properties(){return{mposPriceStock:{type:Object,attribute:!1}}}constructor(){super(),this.mposPriceStock={}}resetMposPriceStock(){this.mposPriceStock={}}getMposPriceStock(e={}){if(Object.keys(this.mposPriceStock).length)return;this._generateGetService(this._getService("get",{},e),{customEvent:"mpos-price-stock-api-dm-fetch",errorFireEventHandler:"mpos-price-stock-api-dm-fetch-error"},this._responseMapping,e.fields)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}MposPriceStock`,this._getBgadp(i))}_getBgadp(e){return{getMposPriceStockV1:()=>new _i(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}class yi extends Ns{static get is(){return"bbva-global-mpos-purchase-api-dm"}constructor(){super()}postMposPurchase(e){this._generateGetService(this._getService("post",e),{customEvent:"mpos-purchase-api-dm-create",errorFireEventHandler:"mpos-purchase-api-dm-create-error"},this._responseMapping)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}MposPurchase`,this._getBgadp(i))}_getBgadp(e){return{postMposPurchaseV0:()=>new zs(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}class bi extends Ns{static get is(){return"bbva-global-add-products-api-dm"}constructor(){super()}postAddProducts(e){this._generateGetService(this._getService("post",e),{customEvent:"add-products-api-dm-create",errorFireEventHandler:"add-products-api-dm-create-error"})}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}AddProducts`,this._getBgadp(i))}_getBgadp(e){return{postAddProductsV0:()=>new Ks(e),default:()=>"BGADP called not exist"}}}const vi=z((e=>class extends e{_dispatchEvent(e,t={},s=!0,i=!0){this.dispatchEvent(new CustomEvent(e,{bubbles:s,composed:i,detail:t}))}_dispatchPublicEvent(e,t={},s=!0,i=!0){this.dispatchEvent(new CustomEvent(`payments-mpos-digital-sales-${e}`,{bubbles:s,composed:i,detail:t}))}_dispatchErrorEvent({errorId:e}){this.dispatchEvent(new CustomEvent("payments-mpos-digital-sales-error-send",{bubbles:!0,composed:!0,detail:{errorId:e,ERROR_IDS:Wt}}))}_dispatchNavigationExternal(e){this.dispatchEvent(new CustomEvent(`payments-mpos-digital-sales-${e}-navigation-external`,{bubbles:!0,composed:!0}))}_dispatchShowEvent({viewName:e,payload:t={}}){this.dispatchEvent(new CustomEvent("payments-mpos-digital-sales-show",{bubbles:!0,composed:!0,detail:{viewName:e,viewNames:rs,productType:this.selectedProductFlow,productTypes:os,payload:t}}))}_dispatchActionEvent({viewName:e,action:t,payload:s={}}){this.dispatchEvent(new CustomEvent("payments-mpos-digital-sales-action",{bubbles:!0,composed:!0,detail:{action:t,actions:ns,viewName:e,viewNames:rs,productType:this.selectedProductFlow,productTypes:os,payload:s}}))}}));class fi extends(G(e(t(vi(M))))){static get is(){return"payments-mpos-digital-sales-add-products-dm"}static get scopedElements(){const e=[bi];return fi.scopedElementsFromClasses(e)}static get properties(){return{addProductsApiVersion:{type:Number,attribute:"add-products-api-version"}}}constructor(){super(),this.addProductsApiVersion=0,this.host="",this.requiredToken="tsec"}firstUpdated(e){super.firstUpdated(e),this._addProductsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-add-products-api-dm"]')}postAddProducts(e){return new Promise(((t,s)=>{this.resolve=t,this.reject=s,this._addProductsDm.postAddProducts(e)}))}_onSuccess(){this._dispatchPublicEvent("add-products-complete"),this.resolve()}_onError(){this.reject(new Es)}render(){return F`
      <bbva-global-add-products-api-dm
        .host=${this.host}
        .requiredToken=${this.requiredToken}
        .version=${this.addProductsApiVersion}
        ?native=${this.native}
        @add-products-api-dm-create=${this._onSuccess}
        @api-dm-response-error=${this._onError}
      >
      </bbva-global-add-products-api-dm>
    `}}class Ti extends(G(e(t(M)))){static get is(){return"payments-mpos-digital-sales-aem-content-fragment-dm"}static get scopedElements(){const e=[s];return Ti.scopedElementsFromClasses(e)}static get properties(){return{aemHost:{type:String,attribute:"aem-host"},aemPathCommission:{type:String,attribute:"aem-path-commission"}}}constructor(){super(),this.aemHost="",this.aemPathCommission="",this.reject=null,this.resolve=null}firstUpdated(e){super.firstUpdated(e),this._aemContentFragmentDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-aem-content-fragment-dm"]')}getAemData(){return new Promise(((e,t)=>{this.resolve=e,this.reject=t,this._aemContentFragmentDm.getAemData()}))}_onSuccess({detail:e}){this.resolve((e=>{var t,s,i,a,r,n,o,c,l,d,h;const p=null==e||null===(t=e.items)||void 0===t||null===(s=t.contentfragmentlist)||void 0===s||null===(i=s.items)||void 0===i||null===(a=i[0])||void 0===a?void 0:a.elements,u=null==p||null===(r=p.detailMSI)||void 0===r||null===(n=r.value)||void 0===n?void 0:n.reduce(((e,t,s,i)=>(s%2==0&&e.push({offer:t,condition:i[s+1]}),e)),[]);return{titleCommissions:null==p||null===(o=p.tittleComissions)||void 0===o?void 0:o.value,textCommissions:null==p||null===(c=p.textComissions)||void 0===c?void 0:c.value,bulletsCommissions:null==p||null===(l=p.bulletsComissions)||void 0===l?void 0:l.value,titleMSI:null==p||null===(d=p.tittleMSI)||void 0===d?void 0:d.value,msiCommissions:null==p||null===(h=p.msiComissions)||void 0===h?void 0:h.value,detailMSI:u}})(e))}_onError(){this.reject(new As)}render(){return F`
      <bbva-global-aem-content-fragment-dm
        .host="${this.aemHost}"
        .path="${this.aemPathCommission}"
        ?native="${this.native}"
        @aem-content-fragment-dm-fetch=${this._onSuccess}
        @aem-content-fragment-dm-fetch-error=${this._onError}
      >
      </bbva-global-aem-content-fragment-dm>
    `}}class Si extends(G(e(t(vi(M))))){static get is(){return"payments-mpos-digital-sales-client-onboarding-dm"}static get scopedElements(){const e=[ri];return Si.scopedElementsFromClasses(e)}static get properties(){return{clientOnboardingApiVersion:{type:Number,attribute:"client-onboarding-api-version"}}}constructor(){super(),this.clientOnboardingApiVersion=0,this.host="",this.requiredToken="tsec"}firstUpdated(e){super.firstUpdated(e),this._clientOnboardingDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-client-onboarding-api-dm"]')}postClientOnboarding(e){return new Promise(((t,s)=>{this.resolve=t,this.reject=s,this._clientOnboardingDm.postClientOnboarding(e)}))}_onSuccess({detail:{merchantId:e}}){this._dispatchPublicEvent("client-onboarding-complete"),this.resolve(e)}_onError(){this.reject(new Cs)}render(){return F`
      <bbva-global-client-onboarding-api-dm
        requiredOTP
        .host=${this.host}
        .otpId=${Yt.CLIENT_ONBOARDING}
        .requiredToken=${this.requiredToken}
        .version=${this.clientOnboardingApiVersion}
        ?native=${this.native}
        @client-onboarding-api-dm-create=${this._onSuccess}
        @api-dm-response-error=${this._onError}
      >
      </bbva-global-client-onboarding-api-dm>
    `}}class Ei extends bt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/addresses`)}toString(){return super.toString("BGADPCustomersCustomerAddressesGetV0")}}class Ci extends bt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/contact-details`)}toString(){return super.toString("BGADPCustomersCustomerContactDetailsGetV0")}}class Ai extends bt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/economic-data`)}toString(){return super.toString("BGADPCustomersCustomerEconomicDataGetV0")}}class Ri extends bt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/civil-registries`)}toString(){return super.toString("BGADPCustomersCivilRegistriesGetV1")}}class Oi extends vt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/civil-registries/search`)}toString(){return super.toString("BGADPCustomersCivilRegistriesSearchPostV1")}}class Pi extends bt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/addresses`)}toString(){return super.toString("BGADPCustomersCustomerAddressesGetV1")}}class $i extends bt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/contact-details`)}toString(){return super.toString("BGADPCustomersCustomerContactDetailsGetV1")}}class Di extends bt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/identification-process/documents`)}toString(){return super.toString("BGADPCustomersCustomerIdentificationProcessDocumentsGetV1")}}class Ii extends vt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/identification-process/documents`)}toString(){return super.toString("BGADPCustomersCustomerIdentificationProcessDocumentsPostV1")}}class ki extends bt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/indicators`)}toString(){return super.toString("BGADPCustomersCustomerIndicatorsGetV1")}}class wi extends bt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/terms`)}toString(){return super.toString("BGADPCustomersCustomerTermsGetV1")}}class xi extends vt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/terms`)}toString(){return super.toString("BGADPCustomersCustomerTermsPostV1")}}class Ni extends(N(M)){_mappingBank(e){this._renameProperty(e,"bank.bankId","id"),this._renameProperty(e,"bank.branch.branchId","id"),e.bank&&e.bank.branch&&e.bank.branch.costCenter&&(e.bank.branch.costCenter={id:e.bank.branch.costCenter})}_mappingGender(e){this._renameProperty(e,"gender.name","description")}_mappingIdentityDocuments(e){for(let t=0;t<e.identityDocuments.length;t++)this._renameProperty(e.identityDocuments[t],"documentType.name","description"),this._renameProperty(e.identityDocuments[t],"status.name","description")}_mappingMaritalStatus(e){this._renameProperty(e,"maritalStatus.name","description")}_mappingNationalities(e){for(let t=0;t<e.nationalities.length;t++)this._renameProperty(e.nationalities[t],"name","description")}_mappingPersonalTitle(e){this._renameProperty(e,"personalTitle.name","description")}_mappingResidence(e){this._renameProperty(e,"residence","taxResidence"),this._renameProperty(e,"taxResidence.residenceType.name","description")}_mappingVerification(e){this._renameProperty(e,"enrollmentModality","verification"),this._renameProperty(e,"verification.enrollmentMethod","identificationMethod")}_mappingSegments(e){for(let t=0;t<e.segments.length;t++)this._renameProperty(e.segments[t],"name","description")}_changeNameToDescription(e){e.map((e=>{this._renameProperty(e,"name","description")}))}}class Mi extends Ni{static get is(){return"bbva-global-customer-terms-base-api-dm"}resetCustomerTerms(){this.customerTerms=[]}getCustomerTerms(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields,this._paginationMapping)}postCustomerTerms(e,t){this._requestMapping(t);const s={"customer-id":e};this._generateGetService(this._getService("post",t,s),this.constructor.POST_EVENTS,this._responseMapping),this.resetCustomerTerms()}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}CustomerTerms`,this._getBgadp(i))}_getBgadp(e){return{getCustomerTermsV1:()=>new wi(e),postCustomerTermsV1:()=>new xi(e),default:()=>"BGADP does not exist."}}_requestMapping(e){return e}_responseMapping(e){return e}_paginationMapping(e){return e}}H(Mi,"GET_EVENTS",{customEvent:"customer-terms-api-dm-fetch",paginationEvent:"customer-terms-api-dm-pagination",errorFireEventHandler:"customer-terms-api-dm-fetch-error"}),H(Mi,"POST_EVENTS",{customEvent:"customer-terms-api-dm-create",errorFireEventHandler:"customer-terms-api-dm-create-error"}),customElements.define(Mi.is,Mi);class qi extends Ni{static get is(){return"bbva-global-customer-contact-details-api-dm"}static get properties(){return{customerContactDetails:{type:Array,attribute:!1},_contactType:{type:Object,attribute:!1},_socialNetwork:{type:Object,attribute:!1},_emailType:{type:Object,attribute:!1},_phoneType:{type:Object,attribute:!1}}}constructor(){super(),this.customerContactDetails=[],this._contactType={WORK_EMAIL:"EMAIL",FACEBOOK_EMAIL:"EMAIL",EMAIL:"EMAIL",PHONE_NUMBER:"LANDLINE",MOBILE_NUMBER:"MOBILE",OFFICE_NUMBER:"LANDLINE",FACEBOOK_ACCOUNT:"SOCIALMEDIA",TWITTER_ACCOUNT:"SOCIALMEDIA"},this._socialNetwork={FACEBOOK_ACCOUNT:"FACEBOOK",TWITTER_ACCOUNT:"TWITTER"},this._emailType={EMAIL:"PERSONAL",WORK_EMAIL:"WORK",FACEBOOK_EMAIL:"SOCIALMEDIA"},this._phoneType={PHONE_NUMBER:"HOME",OFFICE_NUMBER:"WORK"}}resetCustomerContactDetails(){this.customerContactDetails=[]}getCustomerContactDetails(e,t={}){if(Object.keys(this.customerContactDetails).length)return;this._paramsMapping(t);t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),{customEvent:"customer-contact-details-api-dm-fetch",paginationEvent:"customer-contact-details-api-dm-pagination",errorFireEventHandler:"customer-contact-details-api-dm-fetch-error"},this._responseMapping,t.fields)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}CustomerContactDetails`,this._getBgadp(i))}_getBgadp(e){return{getCustomerContactDetailsV0:()=>new Ci(e),getCustomerContactDetailsV1:()=>new $i(e),getCustomerContactDetailsV2:()=>new Se(e),getCustomerContactDetailsV3:()=>new Ee(e),default:()=>"BGADP called not exist"}}_paramsMapping(e){"0"==this.version&&(this._removeFields(["contact.isMultichannel"],e),this._removeFields(["contact.contactDetailType"],e)),"2"==this.version&&this._removeFields(["contact.contactDetailType"],e)}_responseMapping(e){if("0"==this.version&&Object.keys(e).length){let t;for(let s=0;s<e.length;s++)if(this._renameProperty(e[s],"contactDetailId","id"),e[s].contactType){switch(t=e[s].contact,e[s].contact={contactDetailType:this._contactType[e[s].contactType.id]},e[s].contact.contactDetailType){case"EMAIL":e[s].contact.address=t,e[s].hasOwnProperty("isVerified")&&(e[s].contact.isVerified=e[s].isVerified),e[s].contact.receivesNotifications=e[s].isChecked,e[s].contact.emailType=this._emailType[e[s].contactType.id];break;case"LANDLINE":e[s].contact.number=t,e[s].contact.phoneType=this._phoneType[e[s].contactType.id],e[s].country&&(e[s].contact.country=e[s].country),e[s].regionalCode&&(e[s].contact.regionalCode=e[s].regionalCode),e[s].extension&&(e[s].contact.extension=e[s].extension),e[s].hasOwnProperty("isVerified")&&(e[s].contact.isVerified=e[s].isVerified);break;case"MOBILE":e[s].contact.number=t,e[s].phoneCompany&&(e[s].contact.phoneCompany=e[s].phoneCompany),e[s].hasOwnProperty("isVerified")&&(e[s].contact.isVerified=e[s].isVerified),e[s].contact.receivesNotifications=e[s].isChecked,e[s].contact.phoneType="HOME";break;case"SOCIALMEDIA":e[s].contact.userName=t,e[s].contact.socialNetwork=this._socialNetwork[e[s].contactType.id]}this._removeFields(["country","regionalCode","extension","isChecked","isVerified","contactType","phoneCompany"],e[s])}}if("1"==this.version&&Object.keys(e).length){const t=["isSafe","isVerifiedByCustomer"];for(let s=0;s<e.length;s++)e[s].contact&&"MOBILE"===e[s].contact.contactDetailType&&this._removeFields(["isMobileToken"],e[s].contact),this._removeFields(t,e[s])}return e}}class Hi extends Ni{static get is(){return"bbva-global-customer-addresses-api-dm"}static get properties(){return{customerAddresses:{type:Array,attribute:!1}}}constructor(){super(),this.customerAddresses=[]}resetCustomerAddresses(){this.customerAddresses=[]}getCustomerAddresses(e,t={}){if(Object.keys(this.customerAddresses).length)return;this._paramsMapping(t);t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),{customEvent:"customer-addresses-api-dm-fetch",paginationEvent:"customer-addresses-api-dm-pagination",errorFireEventHandler:"customer-addresses-api-dm-fetch-error"},this._responseMapping,t.fields)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}CustomerAddresses`,this._getBgadp(i))}_getBgadp(e){return{getCustomerAddressesV3:()=>new Ce(e),getCustomerAddressesV2:()=>new Ae(e),getCustomerAddressesV1:()=>new Pi(e),getCustomerAddressesV0:()=>new Ei(e),default:()=>"BGADP called not exist"}}_paramsMapping(e){"0"!=this.version&&"2"!=this.version||this._removeFields(["addressType.id"],e)}_responseMapping(e){if(Object.keys(e).length&&"1"==this.version)for(let t=0;t<e.length;t++)this._removeFields(["order","creationDate","isVerifiedByCustomer"],e[t]),this._geolocationToString(e[t].location.geolocation);else if(Object.keys(e).length&&"0"==this.version)for(let t=0;t<e.length;t++)if(!e[t].location.addressComponents){let s=[];this._renameProperty(e[t].location,"addressName","formattedAddress"),this._renameProperty(e[t],"addressId","id"),this._renameProperty(e[t].addressType,"name","description"),this._renameProperty(e[t].ownershipType,"name","description"),e[t].ownershipType&&this._renameProperty(e[t].ownershipType.propertyType,"name","description"),s.push({componentTypes:["COUNTRY"],code:e[t].location.country.id,name:e[t].location.country.name}),e[t].location.city&&s.push({componentTypes:["CITY"],name:e[t].location.city}),e[t].location.zipCode&&s.push({componentTypes:["POSTAL_CODE"],code:e[t].location.zipCode}),e[t].location.state&&s.push({componentTypes:["ADMINISTRATIVE_AREA_LEVEL_1"],code:e[t].location.state.id,name:e[t].location.state.name}),e[t].location.geographicGroups&&(s=[...e[t].location.geographicGroups,...s],delete e[t].location.geographicGroups),this._geolocationToString(e[t].location.geolocation);for(let e=0;e<s.length;e++)s[e].geographicGroupType&&(s[e].componentTypes=[s[e].geographicGroupType.id],this._removeFields(["geographicGroupType"],s[e]));e[t].location.addressComponents=s,this._removeFields(["city","state","country","zipCode"],e[t].location)}return e}_geolocationToString(e){e&&Object.keys(e).length>0&&(e.latitude=e.latitude.toString(),e.longitude=e.longitude.toString())}}class Fi extends Ni{static get is(){return"bbva-global-customer-lopd-documents-base-api-dm"}resetCustomerLopdDocuments(){this.customerLopdDocuments={}}getCustomerLopdDocuments(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}CustomerLopdDocuments`,this._getBgadp(i))}_getBgadp(e){return{getCustomerLopdDocumentsV3:()=>new Re(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}H(Fi,"GET_EVENTS",{customEvent:"customer-lopd-documents-api-dm-fetch",errorFireEventHandler:"customer-lopd-documents-api-dm-fetch-error"}),customElements.define(Fi.is,Fi);class Li extends Ni{static get is(){return"bbva-global-customer-economic-data-base-api-dm"}resetCustomerEconomicData(){this.customerEconomicData={}}getCustomerEconomicData(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}CustomerEconomicData`,this._getBgadp(i))}_getBgadp(e){return{getCustomerEconomicDataV0:()=>new Ai(e),getCustomerEconomicDataV2:()=>new Me(e),getCustomerEconomicDataV3:()=>new qe(e),default:()=>"BGADP does not exist."}}_incomesMapping(e){e.map((e=>{e.incomeValue={},e.incomeValue={valueType:"EXACT",amount:{amount:e.incomeValues[0].amount,currency:e.incomeValues[0].currency}},e.incomeValues[0].concept&&(e.incomeValue.concept=e.incomeValues[0].concept),e.incomeValues[0].frecuency&&(e.incomeValue.frequency=e.incomeValues[0].frecuency),"BIWEEKLY"==e.incomeValue.frequency&&(e.incomeValue.frequency="BI_WEEKLY"),this._removeFields(["incomeValues"],e),this._changeNameToDescription([e.incomeType])}))}_expensesMapping(e){e.map((e=>{e.expenseValue={currency:e.expenseValues[0].currency,amount:e.expenseValues[0].amount},e.expenseValues[0].frecuency&&(e.expenseValue.frequency=e.expenseValues[0].frecuency),e.expenseValue.frequency&&"BIWEEKLY"==e.expenseValue.frequency&&(e.expenseValue.frequency="BI_WEEKLY"),this._removeFields(["expenseValues"],e),this._changeNameToDescription([e.expenseType])}))}_workPlaceMapping(e){e.address&&(e.address.addressType&&"WORK"!==e.address.addressType.id&&this._removeFields(["id"],e.address.addressType),e.address.ownershipType&&(["MOVED","REJECTED","NOT_LOCATED"].includes(e.address.ownershipType.id)&&this._removeFields(["id"],e.address.ownershipType),this._changeNameToDescription([e.address.ownershipType,e.address.ownershipType.propertyType])),this._renameProperty(e.address.location,"addressName","formatedAddress"),this._removeFields(["residenceStartDate"],e.address),this._removeFields(["city","state","country","zipCode","geolocation","geographicGroups","meta"],e.address.location)),this._changeNameToDescription([e.address.addressType,e.economicActivity,e.profesionPosition]),this._renameProperty(e,"profesionPosition","professionPosition"),this._removeFields(["taxpayerIdentification"],e)}_assetsMapping(e){e.map((e=>{this._changeNameToDescription([e.assetType]),e.assetValues.map((e=>{this._removeFields(["concept"],e)}))}))}_liabilitiesMapping(e){e.map((e=>{this._changeNameToDescription([e.liabilityType]),e.liabilityValues.map((e=>{this._removeFields(["concept","frecuency"],e)}))}))}_responseMapping(e){return"0"==this.version&&Object.keys(e).length?(this._changeNameToDescription([e.economicActivity,e.occupationType,e.employmentSituation,e.education]),e.incomes&&this._incomesMapping(e.incomes),e.expenses&&this._expensesMapping(e.expenses),e.workPlace&&this._workPlaceMapping(e.workPlace),e.assets&&this._assetsMapping(e.assets),e.liabilities&&this._liabilitiesMapping(e.liabilities),e.balances&&e.balances.map((e=>{this._changeNameToDescription([e])})),this._renameProperty(e,"workPlace","workplace"),this._removeFields(["financialGroup","financialSubGroup","indicators","incomeSources"],e)):"2"==this.version&&Object.keys(e).length&&(e.workPlace&&e.workPlace.economicActivities&&(e.workPlace.economicActivity=e.workPlace.economicActivities[0],this._removeFields(["economicActivities"],e.workPlace)),e.balances&&e.balances.forEach((e=>{e.id=e.balanceType.id,e.description=e.balanceType.description,e.amount=e.balanceValue.amount,e.currency=e.balanceValue.currency,this._removeFields(["balanceType","balanceValue"],e)})),e.expenses&&e.expenses.forEach((e=>{["OTHER_LOAN","REVOLVING_CARD","FIXED_PAYMENT"].includes(e.expenseType.id)&&this._removeFields(["expenseType"],e)})),e.assets&&e.assets.forEach((e=>{["BANK_DEPOSIT"].includes(e.assetType.id)&&this._removeFields(["assetType"],e)})),e.liabilities&&e.liabilities.forEach((e=>{["MORTGAGE","PERSONAL_LOANS","OTHER_LOANS"].includes(e.liabilityType.id)&&this._removeFields(["liabilityType"],e)})),this._renameProperty(e,"workPlace","workplace"),this._removeFields(["financialSummaries"],e)),e}}H(Li,"GET_EVENTS",{customEvent:"customer-economic-data-api-dm-fetch",errorFireEventHandler:"customer-economic-data-api-dm-fetch-error"}),customElements.define(Li.is,Li);class ji extends Ni{static get is(){return"bbva-global-civil-registries-search-base-api-dm"}resetCivilRegistriesSearch(){this.civilRegistriesSearch=[]}postCivilRegistriesSearch(e){this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}CivilRegistriesSearch`,this._getBgadp(i))}_getBgadp(e){return{postCivilRegistriesSearchV1:()=>new Oi(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}H(ji,"POST_EVENTS",{customEvent:"civil-registries-search-api-dm-fetch",errorFireEventHandler:"civil-registries-search-api-dm-fetch-error"}),customElements.define(ji.is,ji);class Vi extends Ni{static get is(){return"bbva-global-civil-registries-base-api-dm"}resetCivilRegistries(){this.civilRegistries=[]}getCivilRegistries(e){this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields,this._paginationMapping)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}CivilRegistries`,this._getBgadp(i))}_getBgadp(e){return{getCivilRegistriesV1:()=>new Ri(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}_paginationMapping(e){return e}}H(Vi,"GET_EVENTS",{customEvent:"civil-registries-api-dm-fetch",paginationEvent:"civil-registries-api-dm-pagination",errorFireEventHandler:"civil-registries-api-dm-fetch-error"}),customElements.define(Vi.is,Vi);class Ui extends Ni{static get is(){return"bbva-global-customers-child-customers-base-api-dm"}postCustomersChildCustomers(e){this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}CustomersChildCustomers`,this._getBgadp(i))}_getBgadp(e){return{postCustomersChildCustomersV3:()=>new Fe(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}H(Ui,"POST_EVENTS",{customEvent:"customers-child-customers-api-dm-create",errorFireEventHandler:"customers-child-customers-api-dm-create-error"}),customElements.define(Ui.is,Ui);class Bi extends Ni{static get is(){return"bbva-global-customer-identification-process-documents-base-api-dm"}resetCustomerIdentificationProcessDocuments(){this.customerIdentificationProcessDocuments=[]}getCustomerIdentificationProcessDocuments(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}postCustomerIdentificationProcessDocuments(e,t){const s={"customer-id":e};this._generateGetService(this._getService("post",t,s),this.constructor.POST_EVENTS,this._responseMapping),this.resetCustomerIdentificationProcessDocuments()}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}CustomerIdentificationProcessDocuments`,this._getBgadp(i))}_getBgadp(e){return{getCustomerIdentificationProcessDocumentsV1:()=>new Di(e),postCustomerIdentificationProcessDocumentsV1:()=>new Ii(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}H(Bi,"GET_EVENTS",{customEvent:"customer-identification-process-documents-api-dm-fetch",errorFireEventHandler:"customer-identification-process-documents-api-dm-fetch-error"}),H(Bi,"POST_EVENTS",{customEvent:"customer-identification-process-documents-api-dm-create",errorFireEventHandler:"customer-identification-process-documents-api-dm-create-error"}),customElements.define(Bi.is,Bi);class Ki extends Ni{static get is(){return"bbva-global-customer-indicators-base-api-dm"}resetCustomerIndicators(){this.customerIndicators=[]}getCustomerIndicators(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}CustomerIndicators`,this._getBgadp(i))}_getBgadp(e){return{getCustomerIndicatorsV1:()=>new ki(e),getCustomerIndicatorsV3:()=>new He(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return"1"==this.version&&Object.keys(e).length&&e.forEach((e=>{["BASIC_DATA","ENTREPRENEUR_AND_POTENTIAL","WEB_CONSUMPTION_ACCOUNT","USER_EXPIRED"].includes(e.id)&&this._removeFields(["id"],e),this._removeFields(["payrollAmounts","payrollAge"],e)})),e}}H(Ki,"GET_EVENTS",{customEvent:"customer-indicators-api-dm-fetch",errorFireEventHandler:"customer-indicators-api-dm-fetch-error"}),customElements.define(Ki.is,Ki);class Gi extends(G(e(t(M)))){static get is(){return"payments-mpos-digital-sales-customer-addresses-dm"}static get scopedElements(){const e=[Hi];return Gi.scopedElementsFromClasses(e)}static get properties(){return{componentTypes:{type:Array},componentTypesUnmasked:{type:Array},customerAddressesApiVersion:{type:Number,attribute:"customer-addresses-api-version"},customerId:{type:String,attribute:"customer-id"},_isAddressUnmasked:{type:Boolean}}}constructor(){super(),this.componentTypes=[],this.componentTypesUnmasked=[],this.customerAddressesApiVersion=0,this.customerId="",this.host="",this.requiredToken="tsec",this._isAddressUnmasked=!1}firstUpdated(e){super.firstUpdated(e),this._customerAddressesDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-customer-addresses-api-dm"]')}getCustomerAddresses({unmasked:e}){return new Promise(((t,s)=>{this.resolve=t,this.reject=s,this._isAddressUnmasked=e,this._customerAddressesDm.customerAddresses&&Object.keys(this._customerAddressesDm.customerAddresses).length?t(ys(this._customerAddressesDm.customerAddresses,this.componentTypes,this.componentTypesUnmasked,this._isAddressUnmasked)):this._customerAddressesDm.getCustomerAddresses(this.customerId,{unmasked:e})}))}resetDmCustomerAddresses(){this._customerAddressesDm.resetCustomerAddresses()}_setDmCustomerAddresses(e){this._customerAddressesDm.customerAddresses=e}_onSuccess({detail:e}){this._setDmCustomerAddresses(e),this.resolve(ys(e,this.componentTypes,this.componentTypesUnmasked,this._isAddressUnmasked))}_onError(){this.reject(new Rs)}render(){return F`
      <bbva-global-customer-addresses-api-dm
        requiredOTP
        .host=${this.host}
        .otpId=${Yt.CUSTOMER_ADDRESSES}
        .requiredToken=${this.requiredToken}
        .version=${this.customerAddressesApiVersion}
        ?native=${this.native}
        @customer-addresses-api-dm-fetch=${this._onSuccess}
        @api-dm-response-error=${this._onError}
      >
      </bbva-global-customer-addresses-api-dm>
    `}}class zi extends(G(e(t(M)))){static get is(){return"payments-mpos-digital-sales-customer-contact-details-dm"}static get scopedElements(){const e=[qi];return zi.scopedElementsFromClasses(e)}static get properties(){return{customerContactDetailsApiVersion:{type:Number,attribute:"customer-contact-details-api-version"},customerId:{type:String,attribute:"customer-id"}}}constructor(){super(),this.customerContactDetailsApiVersion=0,this.customerId="",this.host="",this.requiredToken="tsec"}firstUpdated(e){super.firstUpdated(e),this._customerContactDetailsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-customer-contact-details-api-dm"]')}getCustomerContactDetails({unmasked:e}){return new Promise(((t,s)=>{this.resolve=t,this.reject=s,this._customerContactDetailsDm.customerContactDetails&&Object.keys(this._customerContactDetailsDm.customerContactDetails).length?t(gs(this._customerContactDetailsDm.customerContactDetails)):this._customerContactDetailsDm.getCustomerContactDetails(this.customerId,{unmasked:e})}))}resetDmCustomerContactDetails(){this._customerContactDetailsDm.resetCustomerContactDetails()}_setDmCustomerContactDetails(e){this._customerContactDetailsDm.customerContactDetails=e}_onSuccess({detail:e}){this._setDmCustomerContactDetails(e),this.resolve(gs(e))}_onError(){this.reject(new Os)}render(){return F`
      <bbva-global-customer-contact-details-api-dm
        requiredOTP
        .host=${this.host}
        .otpId=${Yt.CUSTOMER_CONTACT_DETAILS}
        .requiredToken=${this.requiredToken}
        .version=${this.customerContactDetailsApiVersion}
        ?native=${this.native}
        @customer-contact-details-api-dm-fetch=${this._onSuccess}
        @api-dm-response-error=${this._onError}
      >
      </bbva-global-customer-contact-details-api-dm>
    `}}class Wi extends(G(e(t(M)))){static get is(){return"payments-mpos-digital-sales-document-file-dm"}static get scopedElements(){const e=[Le];return Wi.scopedElementsFromClasses(e)}static get properties(){return{countryCode:{type:String,attribute:"country-code"},documentFileApiVersion:{type:Number,attribute:"document-file-api-version"},documentId:{type:String,attribute:"document-id"},documentType:{type:String,attribute:"document-type"}}}constructor(){super(),this.countryCode="",this.documentFileApiVersion=0,this.documentId="",this.documentType="",this.host="",this.requiredToken="tsec",this._previousParams={}}firstUpdated(e){super.firstUpdated(e),this._documentFileDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-document-file-api-dm"]')}getDocumentFile(){return new Promise(((e,t)=>{this.resolve=e,this.reject=t;const s=this.documentId;JSON.stringify(s)===JSON.stringify(this._previousParams)&&this._documentFileDm.documentFile&&Object.keys(this._documentFileDm.documentFile).length?e(this._documentFileDm.documentFile):(this._previousParams=s,this._documentFileDm.getDocumentFile(s))}))}_setDmDocumentFile(e){this._documentFileDm.documentFile=e}_onSuccess({detail:e}){this._setDmDocumentFile(e),this.resolve(e)}_onError(){this.reject(new Ps)}render(){return F`
      <bbva-global-document-file-api-dm
        .country=${this.countryCode}
        .host=${this.host}
        .localCustomProperties=${{documentType:this.documentType}}
        .requiredToken=${this.requiredToken}
        .version=${this.documentFileApiVersion}
        ?native=${this.native}
        @document-file-api-dm-fetch=${this._onSuccess}
        @api-dm-response-error=${this._onError}
      >
        >
      </bbva-global-document-file-api-dm>
    `}}class Yi extends(G(e(t(M)))){static get is(){return"payments-mpos-digital-sales-economic-activities-dm"}static get scopedElements(){const e=[ct];return Yi.scopedElementsFromClasses(e)}static get properties(){return{deviceType:{type:String,attribute:"device-type"},economicActivitiesApiVersion:{type:Number,attribute:"economic-activities-api-version"},_economicActivitiesResponseType:{type:String}}}constructor(){super(),this.deviceType="",this.economicActivitiesApiVersion=0,this.host="",this.requiredToken="tsec",this._economicActivitiesResponseType=""}firstUpdated(e){super.firstUpdated(e),this._economicActivitiesDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-economic-activities-api-dm"]')}getEconomicActivities({familyId:e="",categoryId:t=""}){return new Promise(((s,i)=>{if(this.resolve=s,this.reject=i,this._economicActivitiesResponseType=e&&t?Jt.ACTIVITIES:e&&!t?Jt.CATEGORIES:Jt.FAMILIES,this._economicActivitiesDm.economicActivities&&Object.keys(this._economicActivitiesDm.economicActivities).length)return void this._handleEconomicActivitiesResponse(this._economicActivitiesDm.economicActivities);const a={deviceType:this.deviceType};e&&(a["families.id"]=e),t&&(a["categories.id"]=t),this._economicActivitiesDm.getEconomicActivities(a)}))}resetDmEconomicActivities(){this._economicActivitiesDm.resetEconomicActivities()}_setDmEconomicActivities(e){this._economicActivitiesDm.economicActivities=e}_onSuccess({detail:e}){this._setDmEconomicActivities(e),this._handleEconomicActivitiesResponse(e)}_handleEconomicActivitiesResponse(e){this._economicActivitiesResponseType!==Jt.ACTIVITIES?this._economicActivitiesResponseType!==Jt.CATEGORIES?this.resolve(e.reduce(((e,t)=>{var s,i,a,r;const n=null==t?void 0:t.id,o=null==t||null===(s=t.families)||void 0===s||null===(i=s[0])||void 0===i?void 0:i.id,c=null==t||null===(a=t.families)||void 0===a||null===(r=a[0])||void 0===r?void 0:r.description;return[...e,{mcc:n,id:o,description:ds(c)}]}),[])):this.resolve(e.reduce(((e,t)=>{var s,i,a,r,n,o,c,l;const d=null==t?void 0:t.id,h=null==t||null===(s=t.families)||void 0===s||null===(i=s[0])||void 0===i||null===(a=i.categories)||void 0===a||null===(r=a[0])||void 0===r?void 0:r.id,p=null==t||null===(n=t.families)||void 0===n||null===(o=n[0])||void 0===o||null===(c=o.categories)||void 0===c||null===(l=c[0])||void 0===l?void 0:l.description;return[...e,{mcc:d,id:h,description:ds(p)}]}),[])):this.resolve(e.reduce(((e,t)=>{var s,i,a,r,n,o,c,l,d,h,p,u;const m=null==t?void 0:t.id,_=null==t||null===(s=t.families)||void 0===s||null===(i=s[0])||void 0===i||null===(a=i.categories)||void 0===a||null===(r=a[0])||void 0===r||null===(n=r.activities)||void 0===n||null===(o=n[0])||void 0===o?void 0:o.id,g=null==t||null===(c=t.families)||void 0===c||null===(l=c[0])||void 0===l||null===(d=l.categories)||void 0===d||null===(h=d[0])||void 0===h||null===(p=h.activities)||void 0===p||null===(u=p[0])||void 0===u?void 0:u.description;return[...e,{mcc:m,id:_,description:ds(g)}]}),[]))}_onError(){this.reject(new $s)}render(){return F`
      <bbva-global-economic-activities-api-dm
        .host=${this.host}
        .requiredToken=${this.requiredToken}
        .version=${this.economicActivitiesApiVersion}
        ?native=${this.native}
        emitRequestEvents
        @economic-activities-api-dm-fetch=${this._onSuccess}
        @api-dm-response-error=${this._onError}
      >
      </bbva-global-economic-activities-api-dm>
    `}}class Xi extends(G(e(t(M)))){static get is(){return"payments-mpos-digital-sales-mpos-price-stock-dm"}static get scopedElements(){const e=[gi];return Xi.scopedElementsFromClasses(e)}static get properties(){return{countryId:{type:String,attribute:"country-id"},mposPriceStockApiVersion:{type:Number,attribute:"mpos-price-stock-api-version"}}}constructor(){super(),this.countryId="",this.host="",this.mposPriceStockApiVersion=0,this.reject=null,this.requiredToken="tsec",this.resolve=null}firstUpdated(e){super.firstUpdated(e),this._mposPriceStockDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-mpos-price-stock-api-dm"]')}getMposPriceStock(){return new Promise(((e,t)=>{this.resolve=e,this.reject=t,this._mposPriceStockDm.mposPriceStock&&Object.keys(this._mposPriceStockDm.mposPriceStock).length?e(this._mposPriceStockDm.mposPriceStock):this._mposPriceStockDm.getMposPriceStock({"country.id":this.countryId})}))}_setDmMposPriceStock(e){this._mposPriceStockDm.mposPriceStock=e}_onSuccess({detail:e}){var t,s,i,a,r,n,o;this._setDmMposPriceStock(e),this.resolve({availableStock:null==(t=e)?void 0:t.availableStock,sku:null==t||null===(s=t.products)||void 0===s||null===(i=s[0])||void 0===i?void 0:i.sku,percentage:null==t||null===(a=t.feePlansCost)||void 0===a||null===(r=a[0])||void 0===r?void 0:r.percentage,unitPrice:null==t||null===(n=t.products)||void 0===n||null===(o=n[0])||void 0===o?void 0:o.unitPrice})}_onError(){this.reject(new Ds)}render(){return F`
      <bbva-global-mpos-price-stock-api-dm
        .host=${this.host}
        .requiredToken=${this.requiredToken}
        .version=${this.mposPriceStockApiVersion}
        ?native=${this.native}
        @mpos-price-stock-api-dm-fetch=${this._onSuccess}
        @api-dm-response-error=${this._onError}
      >
      </bbva-global-mpos-price-stock-api-dm>
    `}}class Ji extends(G(e(t(M)))){static get is(){return"payments-mpos-digital-sales-mpos-purchase-dm"}static get scopedElements(){const e=[yi];return Ji.scopedElementsFromClasses(e)}static get properties(){return{mposPurchaseApiVersion:{type:Number,attribute:"mpos-purchase-api-version"}}}constructor(){super(),this.host="",this.mposPurchaseApiVersion=0,this.requiredToken="tsec"}firstUpdated(e){super.firstUpdated(e),this._mposPurchaseDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-mpos-purchase-api-dm"]')}postMposPurchase(e){return new Promise(((t,s)=>{this.resolve=t,this.reject=s,this._mposPurchaseDm.postMposPurchase(e)}))}_onSuccess(){this.resolve()}_onError(){this.reject(new Is)}render(){return F`
      <bbva-global-mpos-purchase-api-dm
        .host=${this.host}
        .requiredToken=${this.requiredToken}
        .version=${this.mposPurchaseApiVersion}
        ?native=${this.native}
        @mpos-purchase-api-dm-create=${this._onSuccess}
        @api-dm-response-error=${this._onError}
      >
      </bbva-global-mpos-purchase-api-dm>
    `}}class Qi extends(G(e(t(M)))){static get is(){return"payments-mpos-digital-sales-service-payments-dm"}static get scopedElements(){const e=[Ue];return Qi.scopedElementsFromClasses(e)}static get properties(){return{countryCode:{type:String,attribute:"country-code"},servicePaymentsApiVersion:{type:Number,attribute:"service-payments-api-version"}}}constructor(){super(),this.countryCode="",this.host="",this.servicePaymentsApiVersion=0,this.requiredToken="tsec"}firstUpdated(e){super.firstUpdated(e),this._servicePaymentsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-service-payments-api-dm"]')}postServicePayments(e){return new Promise(((t,s)=>{this.resolve=t,this.reject=s,this._servicePaymentsDm.postServicePayments(e)}))}_onSuccess({detail:e}){var t,s,i;this.resolve({id:null==(t=e)?void 0:t.id,trackingReference:null==t?void 0:t.trackingReference,description:null==t?void 0:t.description,serviceId:null==t||null===(s=t.services)||void 0===s||null===(i=s[0])||void 0===i?void 0:i.id})}_onError(){this.reject(new ks)}render(){return F`
      <bbva-global-service-payments-api-dm
        requiredOTP
        .country=${this.countryCode}
        .host=${this.host}
        .otpId=${Yt.SERVICE_PAYMENTS}
        .requiredToken=${this.requiredToken}
        .version=${this.servicePaymentsApiVersion}
        ?native=${this.native}
        @service-payments-api-dm-create=${this._onSuccess}
        @api-dm-response-error=${this._onError}
      >
      </bbva-global-service-payments-api-dm>
    `}}class Zi extends(N(M)){}class ea{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let s=Object(this),i=s.length>>>0;if(0===i)return!1;let a=0|t,r=Math.max(a>=0?a:i-Math.abs(a),0);for(;r<i;){if((n=s[r])===(o=e)||"number"==typeof n&&"number"==typeof o&&isNaN(n)&&isNaN(o))return!0;r++}var n,o;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var s=[],i=0,a="",r=0,n=arguments.length;r!==n;++r){var o=+arguments[r];if(!(o<1114111&&o>>>0===o))throw RangeError("Invalid code point: "+o);o<=65535?i=s.push(o):(o-=65536,i=s.push(55296+(o>>10),o%1024+56320)),i>=16383&&(a+=e.apply(null,s),s.length=0)}return a+e.apply(null,s)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",s=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${s&&s.message}`)}}class ta extends ea{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}}const sa=0,ia=1,aa="jwt",ra="tsec",na="none";class oa extends ea{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=sa,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new ta,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=ra:this.requiredToken=na,this.requiresJWT=!1):this.requiredToken===ra?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===aa?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===na?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(ra)}_setJwtHandler(){this._setTokenHandler(aa)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((s,i)=>{t=Object.assign(t,{resolve:s,reject:i}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let s=this._getRequestHeaders();Object.keys(s).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,s[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=q),e}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let s=e.replace(/[\{\}]+/g,""),i=t[s];return i?delete t[s]:this._error(9,`Missing ${s} param value`),i})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let s=Object.keys(t);s.length&&(e=[e,s.map((e=>{let s=t[e];return Array.isArray(s)&&this.paramArrayMode===ia?this._arrayToQueryParam(e,s):`${e}=${s}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(ra,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(aa,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(s){var i=t.getItem(s);i&&"null"!==i&&(e[s]=i)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const s=window.sessionStorage;t=Object.keys(s).filter((t=>t.startsWith(e))).reduce(((t,i)=>(t[i.replace(e,"")]=s.getItem(i),t)),{})}return t}_getTokenForRequestHeaders(e,t){const s=`${e}Handler`,i=e===aa?"JWT ":"",a=e===aa?"Authorization":ra;if(void 0===this[s]||null===this[s])this._error(11,`${e} handler is undefined`);else{const r=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let n=this[s].getItem(r);n?t[a]=t[a]||i+n:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((s=>{t.push(`${s}=${e[s]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(s){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(s){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let s;const i=new Promise(((e,t)=>{s=(s,i)=>{s?t(s):e(i)}}));return t.addEventListener("loadend",(function e(i){t.removeEventListener("loadend",e),i.error?s(i.error):s(null,t.result)})),t.readAsText(e),i}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let s=0;for(;s<e.length;){let i=e[s],a=0,r=0;if(i<=127?(a=0,r=255&i):i<=223?(a=1,r=31&i):i<=239?(a=2,r=15&i):i<=244&&(a=3,r=7&i),e.length-s-a>0){let t=0;for(;t<a;)i=e[s+t+1],r=r<<6|63&i,t+=1}else r=65533,a=e.length-s;t+=String.fromCodePoint(r),s+=a+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},s=e.trim().split(/[\r\n]+/);for(const e in s)if(s.hasOwnProperty(e)&&""!==s[e]){let i=": ",a=s[e].split(i);t[a.shift().toLowerCase()]=a.join(i)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,s,i){let a=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(i)>=0&&(a=t.getResponseHeader(i));break;case this._NATIVE_XHR:t&&t.headers&&(a=JSON.parse(t.headers)[i])}if(a){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):s;e.getItem(t)!==a&&(e.setItem(t,a),this._emitTokenUpdate(s,a))}}_emitTokenUpdate(e,t){if(this.htmlContext){const s=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(s)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,s,i,a,r;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),s=e.getResponseHeader("AuthenticationData"),i=e.getResponseHeader("AuthenticationState"),a=e.getResponseHeader("AuthenticationChallenge"),r=e.getResponseHeader("AuthenticationResponse");else{let n=JSON.parse(e.headers);t=n.authenticationtype,s=n.authenticationdata||null,i=n.authenticationstate,a=n.authenticationchallenge,r=n.authenticationresponse}return{type:t,data:s,state:i,challenge:a,response:r}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",s=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const i=this._getSignatureData(e,t,s);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:i}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",s="",i=""){let a;if("object"==typeof e&&e){const r=this._getSignatureData(e.signatureType,t,s);a=this._makeKeyValuePairFromObject(r,e.signatureValue),e.challenge&&(a+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(a,e.signatureType,i)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(a=`password=${e}`,this._buildSignatureHeaders(a,"2",i)):(a=`${s}=${e}`,this._buildSignatureHeaders(a,t,i)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let s,i=e.split(",");if(i.length>1){s=i.map((e=>`${e}=${t[e]}`)).join(",")}else s=`${e}=${t}`;return s}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",s=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),s&&(this.headers=Object.assign(this.headers,{AuthenticationState:s})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let s=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),a=this._ERROR_CODES.SIGNATURE_INVALID.includes(i),{type:r,data:n,state:o,challenge:c,response:l}=this._extractSignatureResponseHeaders(e),d=this._getRequestMetadata(e);if(a)this._notifySignatureInvalid(d),s=!0;else if(r)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(i)?(this._notifySignatureTypeUsingErrorCode(i,d,r,n,o,c,l),s=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(d,r,n,o,c,l),s=!0}return s}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let s=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),a=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(i),r=this._getRequestMetadata(e);a&&(this._notifyWaitingForProcessResponse(r),s=!0)}return s}_notifySignatureRequiredFirstStep(e,t,s,i){this._defineSignatureType(t,s),this._defineSignatureValue(t,s,i),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:s,metadata:e}}))}_notifySignatureRequired(e,t,s,i,a,r){this._defineSignatureValue(t,s,i);const n={type:t,data:s,challenge:a,metadata:e};r&&(n.response=r),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:n}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:s}=e;return{path:this._path,method:this.method,url:t,status:s}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",s=""){const i=t.split(";").findIndex((t=>t===e));return s?s.split(";")[i]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,s,i,a,r){i?this._notifySignatureRequired(e,t,s,i,a,r):this._notifySignatureRequiredFirstStep(e,t,s,i)}_notifySignatureTypeUsingErrorCode(e,t,s,i,a,r,n){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,s,i,a):this._notifySignatureRequired(t,s,i,a,r,n)}}class ca extends oa{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}}class la extends oa{constructor(e=null){super(Object.assign(e||{},{method:"POST"}))}toString(e=""){return super.toString(e||"BGADPRequestPOST")}}class da extends la{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`terms/v${this.version}/term-types`)}toString(){return super.toString("BGADPTermsTermTypesPostV0")}}class ha extends ca{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`terms/v${this.version}/term-types`)}toString(){return super.toString("BGADPTermsTermTypesGetV0")}}class pa extends Zi{static get is(){return"bbva-global-term-types-base-api-dm"}resetTermTypes(){this.termTypes=[]}getTermTypes(e){this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields,this._paginationMapping)}postTermTypes(e){this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping),this.resetTermTypes()}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}TermTypes`,this._getBgadp(i))}_getBgadp(e){return{getTermTypesV0:()=>new ha(e),postTermTypesV0:()=>new da(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}_paginationMapping(e){return e}}H(pa,"GET_EVENTS",{customEvent:"term-types-api-dm-fetch",paginationEvent:"term-types-api-dm-pagination",errorFireEventHandler:"term-types-api-dm-fetch-error"}),H(pa,"POST_EVENTS",{customEvent:"term-types-api-dm-create",errorFireEventHandler:"term-types-api-dm-create-error"}),customElements.define(pa.is,pa);class ua extends Zi{static get is(){return"bbva-global-term-types-api-dm"}static get properties(){return{termTypes:{type:Array,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.termTypes=[],this.country="",this.localCustomProperties={},this._countries=["Mx"],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties","termTypes"],this._loaded=!1,this._requestParams={},this._modules={Mx:()=>import("./cca1f9da.js")}}update(e){super.update(e),e.forEach(((e,t)=>{"country"===t&&this.country&&this.country!==e?this._loadModule():"_module"!==t&&"_requestParams"!==t&&"_loaded"!==t&&this._module&&this[t]!==e?this._module[t]=this[t]:("_requestParams"===t&&this._requestParams&&this._requestParams!==e&&void 0!==e&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===t&&this._loaded)&&Object.entries(this._requestParams).forEach((([e])=>{this[`_${e}TermTypes`]()}))}))}async _loadModule(){const e=this._capitalize(this.country);if(this._countries.includes(e)&&this._modules[e]){const t=`BbvaTermTypes${e}ApiDm`;(0,this._modules[e])().then((async e=>{const s=e[t].is;this._module=this._createModuleElement(s),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-term-types-api-dm-module-load")})).catch((async e=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-term-types-api-dm-module-error",e)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(e){return e.charAt(0).toUpperCase()+e.slice(1).toLowerCase()}_createModuleElement(e=pa.is){const t=document.createElement(e);return this._bindConfig(t),t}async _bindConfig(e){this._configProperties.forEach((t=>{e[t]=this[t]})),await this.updateComplete}_dispatchEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}async resetTermTypes(){await this.module.updateComplete,this.module.resetTermTypes()}async getTermTypes(e={}){await this.module.updateComplete,this._requestParams.get?this._requestParams.get.push({params:e}):this._requestParams={get:[{params:e}]}}async _getTermTypes(){await this.module.updateComplete,Object.keys(this.termTypes).length||(this._requestParams.get.forEach((e=>{this.module.getTermTypes(e.params)})),delete this._requestParams.get)}async postTermTypes(e){await this.module.updateComplete,this._requestParams.post?this._requestParams.post.push({body:e}):this._requestParams={post:[{body:e}]}}async _postTermTypes(){await this.module.updateComplete,this._requestParams.post.forEach((e=>{this.module.postTermTypes(e.body)})),delete this._requestParams.post}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return F` ${this._module?this._module:""}`}}class ma extends(G(e(t(M)))){static get is(){return"payments-mpos-digital-sales-term-types-dm"}static get scopedElements(){const e=[ua];return ma.scopedElementsFromClasses(e)}static get properties(){return{countryCode:{type:String,attribute:"country-code"},documentId:{type:String,attribute:"document-id"},servicesId:{type:String,attribute:"services-id"},termTypesApiVersion:{type:Number,attribute:"term-types-api-version"},unitPrice:{type:Number,attribute:"unit-price"}}}constructor(){super(),this.countryCode="",this.documentId="",this.host="",this.requiredToken="tsec",this.servicesId="",this.termTypesApiVersion=0,this.unitPrice=0,this._previousParams={}}firstUpdated(e){super.firstUpdated(e),this._termTypesDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-term-types-api-dm"]')}getTermTypes({termTypeIds:e}){return new Promise(((t,s)=>{this.resolve=t,this.reject=s;const i={id:e,"country.id":this.countryCode.toUpperCase()};JSON.stringify(i)===JSON.stringify(this._previousParams)&&this._termTypesDm.termTypes&&Object.keys(this._termTypesDm.termTypes).length?t(vs(this._termTypesDm.termTypes,this.servicesId,String(this.unitPrice))):(this._resetDmTermTypes(),this._previousParams=i,this._termTypesDm.getTermTypes(i))}))}_setDmTermTypes(e){this._termTypesDm.termTypes=e}_resetDmTermTypes(){this._termTypesDm.resetTermTypes(),this._termTypesDm.termTypes=[]}_onSuccess({detail:e}){this._setDmTermTypes(e),this.resolve(vs(e,this.servicesId,String(this.unitPrice)))}_onError(){this.reject(new ws)}render(){return F`
      <bbva-global-term-types-api-dm
        .country=${this.countryCode}
        .host=${this.host}
        .localCustomProperties=${{documentId:this.documentId}}
        .paramArrayMode=${Qt.KEY_VALUE}
        .requiredToken=${this.requiredToken}
        .version=${this.termTypesApiVersion}
        ?native=${this.native}
        @term-types-api-dm-fetch=${this._onSuccess}
        @api-dm-response-error=${this._onError}
      ></bbva-global-term-types-api-dm>
    `}}const _a=z((e=>class extends e{static get properties(){return{hasFeatureHeaderHidden:{type:Boolean,attribute:"has-feature-header-hidden"},selectedProductFlow:{type:String,attribute:"selected-product-flow"}}}constructor(){super(),this.hasFeatureHeaderHidden=!1,this.selectedProductFlow=os.MPOS_TOP_WITH_CARD_READER}get isMposTopWithCardReaderFlow(){return this.selectedProductFlow===os.MPOS_TOP_WITH_CARD_READER}get isMposTopWithoutCardReaderFlow(){return this.selectedProductFlow===os.MPOS_TOP_WITHOUT_CARD_READER}get isMposTopWithoutStockFlow(){return this.selectedProductFlow===os.MPOS_TOP_WITHOUT_STOCK}get isMposTopFlow(){return this.selectedProductFlow===os.MPOS_TOP_WITH_CARD_READER||this.selectedProductFlow===os.MPOS_TOP_WITHOUT_CARD_READER||this.selectedProductFlow===os.MPOS_TOP_WITHOUT_STOCK}get isMposFlow(){return this.selectedProductFlow===os.MPOS}get isTopFlow(){return this.selectedProductFlow===os.TOP}})),ga=z((e=>class extends e{static get properties(){return{i18nKeys:{type:Object,attribute:!1},_i18nKeys:{type:Object}}}constructor(){super(),this.i18nKeys={},this._i18nKeys={}}updated(e){var t;null===(t=super.updated)||void 0===t||t.call(this,e);e.has("i18nKeys")&&(this._i18nKeys={...this.constructor.commonI18nKeys,...this.constructor.defaultI18nKeys,...this.i18nKeys})}static get commonI18nKeys(){const e="payments-mpos-digital-sales-common";return{accounts:`${e}-accounts`,activityType:`${e}-activity-type`,benefits:`${e}-benefits`,category:`${e}-category`,closeIcon:`${e}-close-icon`,considerations:`${e}-considerations`,contactPhoneNumber:`${e}-contact-phone-number`,continue:`${e}-continue`,continueOperation:`${e}-continue-operation`,contractingCollectionZone:`${e}-contracting-collection-zone`,contractingCollectionZoneTop:`${e}-contracting-collection-zone-top`,email:`${e}-email`,exit:`${e}-exit`,help:`${e}-help`,helpIcon:`${e}-help-icon`,hideData:`${e}-hide-data`,loading:`${e}-loading`,paymentZone:`${e}-payment-zone`,privacyNoticeTitle:`${e}-privacy-notice-title`,return:`${e}-return`,showData:`${e}-show-data`,subcategory:`${e}-subcategory`,technicalSpecifications:`${e}-technical-specifications`,understood:`${e}-understood`}}})),ya=new class{constructor(){this.items=[]}add(e){!this.items.some((t=>t.id===e.id))&&this.items.push(e)}remove(e){const t=this.items.findIndex((t=>t.id===e));if(-1!==t){const[e]=this.items.splice(t,1);return e}return null}peek(){return this.items[this.items.length-1]}clear(){this.items=[]}},ba=z((e=>class extends e{get navigationStack(){return ya}addView({id:e,view:t}){ya.add({id:e,view:t}),this.dispatchEvent(new CustomEvent("navigation-go-forward",{bubbles:!0,composed:!0,detail:{id:e}}))}closeView(e){ya.remove(e)}currentView(){return ya.peek()}navigateBack(){const e=this.currentView();e?(e.view.navigateBack(),this.dispatchEvent(new CustomEvent("navigation-go-back",{bubbles:!0,composed:!0}))):this._dispatchNavigationExternal("back-step")}}));var va=W`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0;
}
`;class fa extends(G(e(t(Y(ga(ba(vi(_a(M))))))))){static get is(){return"payments-mpos-digital-sales-faqs-modal"}static get scopedElements(){const e=[i,Be];return fa.scopedElementsFromClasses(e)}static get styles(){return[va,X("payments-mpos-digital-sales-faqs-modal-shared-styles")]}static get defaultI18nKeys(){return{frequentQuestions:"payments-mpos-digital-sales-faqs-modal-frequent-questions"}}static get properties(){return{aemHost:{type:String,attribute:"aem-host"},contentFragmentPath:{type:String,attribute:"content-fragment-path"},showHelpFaqs:{type:Boolean,attribute:"show-help-faqs"},_isHelpFaqsVisible:{type:Boolean},_isModalVisible:{type:Boolean}}}constructor(){super(),this.aemHost="",this.contentFragmentPath="",this.showHelpFaqs=!1,this._isHelpFaqsVisible=!1,this._isModalVisible=!1}navigateBack(){this._close()}open(){this.showHelpFaqs?(this._isModalVisible=!0,this._isHelpFaqsVisible=!0,this.addView({id:Xt.MODAL_FAQS,view:this})):this._dispatchPublicEvent("help-click")}_close(){this._isModalVisible=!1,this.closeView(Xt.MODAL_FAQS)}_handleStopPropagation(e){e.stopPropagation()}_handleCloseClick(e){e.stopPropagation(),this._close()}get _helpFaqsTpl(){return F`
      ${this._isHelpFaqsVisible?F`
            <help-faqs-aem
              host=${this.aemHost}
              content-fragment-path=${this.contentFragmentPath}
              headerText=${this.t(this._i18nKeys.frequentQuestions)}
              ?i-o-s-fixed-header=${this.iOSFixedHeader}
              ?native=${this.native}
              @help-modal-header-click=${this._handleStopPropagation}
              @help-modal-veil-click=${this._handleStopPropagation}
            >
            </help-faqs-aem>
          `:J}
    `}render(){return F`
      ${this.showHelpFaqs?F`
            <bbva-help-modal
              data-selector="bbva-help-modal-faqs"
              accessibility-text-icon-right-primary=${this.t(this._i18nKeys.closeIcon)}
              header-text=${this.hasFeatureHeaderHidden?"":this.t(this._i18nKeys.help)}
              header-type=${is.MODAL_SEQUENTIAL}
              full-height
              hide-content-padding-top
              ?i-o-s-fixed-header=${this.iOSFixedHeader}
              ?visible=${this._isModalVisible}
              @help-modal-header-click=${this._handleCloseClick}
              @help-modal-veil-click=${this._handleCloseClick}
            >
              <div slot="slot-content">${this._helpFaqsTpl}</div>
            </bbva-help-modal>
          `:J}
    `}}var Ta=W`
:host {
  --_payments-mpos-digital-sales-panel-button-background-color-skeleton: ${a("colorSecondarySurfaceContrastPreloading",r)};
  --_payments-mpos-digital-sales-panel-button-text-color: ${a("colorPrimaryText01Default",r)};
}
`,Sa=W`
:host {
  display: block;
  box-sizing: border-box;
  background-color: ${a("colorPrimaryAltSurfaceAmbientDefault",r)};
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

.content {
  padding: 1rem;
}

.description {
  margin-bottom: 1rem;
}

[data-tag-name=bbva-button-default] {
  margin-bottom: 0;
}

[data-tag-name=bbva-type-text] {
  color: var(--_payments-mpos-digital-sales-panel-button-text-color);
}

:host([show-all-content]) [data-tag-name=bbva-button-default] {
  margin-bottom: 1rem;
}

.link-container {
  display: flex;
  align-items: center;
  justify-content: center;
  height: 3rem;
}

:host([sticky]) {
  position: sticky;
  display: block;
  bottom: -0.0625rem;
  box-shadow: none;
  transform: translateY(100%);
  animation: sticky-in-animation 500ms cubic-bezier(0, 0, 0.1, 1) 1s 1 normal forwards;
  animation-fill-mode: forwards;
}

:host([shadowed]) {
  box-shadow: 0 -3px 2px 0 rgba(18, 18, 18, 0.08);
}

@keyframes sticky-in-animation {
  from {
    transform: translateY(100%);
  }
  to {
    transform: translateY(0);
  }
}
.skeleton {
  display: block;
  overflow: hidden;
  height: 7rem;
  background-color: var(--_payments-mpos-digital-sales-panel-button-background-color-skeleton);
  mask-position: 1rem 1rem, 1rem 3.375rem, 1rem 5rem;
  mask-repeat: no-repeat;
  mask-size: 23.875rem 1rem, 28.125rem 1rem, 23.875rem 1rem;
  mask-image: linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%);
  pointer-events: none;
}

.skeleton::after {
  display: block;
  height: 100%;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  background-image: linear-gradient(white 100%, transparent 0);
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
`;class Ea extends(Q(n(M))){static get is(){return"payments-mpos-digital-sales-panel-button"}static get scopedElements(){const e=[h,p,u,m];return Ea.scopedElementsFromClasses(e)}static get properties(){return{amount:{type:String},buttonText:{type:String,attribute:"button-text"},buttonPositive:{type:Boolean,attribute:"button-positive"},customElementObserved:{type:Object,attribute:"custom-element-observed"},description:{type:String},label:{type:String},language:{type:String},linkText:{type:String,attribute:"link-text"},loading:{type:Boolean,reflect:!0},showAllContent:{type:Boolean,attribute:"show-all-content"},sticky:{type:Boolean,reflect:!0}}}static get styles(){return[Ta,Sa,o.primaryAlt,c.primaryAlt,l.primaryAlt,d.primaryAlt,X(`${Ea.is}-shared-styles`)]}constructor(){super(),this.amount="",this.buttonText="",this.buttonPositive=!1,this.customElementObserved=this,this.description="",this.showAllContent=!1,this.label="",this.language="en-EN",this.linkText="",this.loading=!1,this.sticky=!1}firstUpdated(){this.sticky&&(this._observer=new IntersectionObserver((([e])=>{e.target.toggleAttribute("shadowed",e.intersectionRatio<1)}),{threshold:1}),this._observer.observe(this.customElementObserved))}_handleButtonClick(){this.dispatchEvent(new CustomEvent(`${this.constructor.is}-default-button-click`,{bubbles:!0,composed:!0}))}_handleLinkClick(){this.dispatchEvent(new CustomEvent(`${this.constructor.is}-link-click`,{bubbles:!0,composed:!0}))}get _labelTpl(){return F` <bbva-type-text size="S" text=${this.label} unset></bbva-type-text> `}get _amountTpl(){return F`
      <bbva-type-amount
        amount=${this.amount}
        currency-code=${B(this.currencyCode)}
        language=${this.language}
        local-currency=${B(this.localCurrency)}
        type="bold"
        variant="3xl"
      >
      </bbva-type-amount>
    `}get _descriptionTpl(){return F`
      <bbva-type-text class="description" size="S" text=${this.description} unset></bbva-type-text>
    `}get _buttonTpl(){return F`
      <bbva-button-default
        text=${this.buttonText}
        variant=${B(this.buttonPositive?"positive":J)}
        fullwidth
        ?loading=${this.loading}
        @click=${this._handleButtonClick}
      >
      </bbva-button-default>
    `}get _linkTpl(){return F`
      <div class="link-container">
        <bbva-type-link ?loading=${this.loading} @click=${this._handleLinkClick}
          >${this.linkText}</bbva-type-link
        >
      </div>
    `}get _contentTpl(){return this.showAllContent?F`
        <div class="content">
          ${this.label&&this._labelTpl} ${this.amount&&this._amountTpl}
          ${this.description&&this._descriptionTpl} ${this.buttonText&&this._buttonTpl}
          ${this.linkText&&this._linkTpl}
        </div>
      `:F` <div class="content">${this.buttonText&&this._buttonTpl}</div> `}render(){return this.loading?F` <div class="skeleton"></div> `:F`${this._contentTpl}`}}var Ca=W`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0 1rem;
}
`;class Aa extends(G(e(t(Y(ga(ba(vi(_a(M))))))))){static get is(){return"payments-mpos-digital-sales-exit-order-modal"}static get scopedElements(){const e=[i];return Aa.scopedElementsFromClasses(e)}static get styles(){return[Ca,X("payments-mpos-digital-sales-exit-order-modal-shared-styles")]}static get defaultI18nKeys(){const e="payments-mpos-digital-sales-exit-order-modal";return{description:`${e}-description`,title:`${e}-title`}}static get properties(){return{_isModalVisible:{type:Boolean}}}constructor(){super(),this._isModalVisible=!1}navigateBack(){this._close()}open(){this._isModalVisible=!0,this.addView({view:this,id:Xt.MODAL_EXIT_ORDER})}_close(){this._isModalVisible=!1,this.closeView(Xt.MODAL_EXIT_ORDER)}_handleCloseClick(e){e.stopPropagation(),this._close()}_handleFooterButtonClick(e){e.stopPropagation(),this._dispatchEvent(`${this.constructor.is}-footer-button-click`),this._close()}_handleTransitionend(e){e.stopPropagation()}_handleHeaderIconClick(e){e.stopPropagation()}render(){return F`
      <bbva-help-modal
        accessibility-text-icon-right-primary=${this.t(this._i18nKeys.closeIcon)}
        body-text=${this.t(this._i18nKeys.description)}
        button-text=${this.t(this._i18nKeys.exit)}
        data-selector="bbva-help-modal-exit-order"
        header-text=${this.hasFeatureHeaderHidden?"":this.t(this._i18nKeys.exit)}
        link-text=${this.t(this._i18nKeys.continueOperation)}
        modal-type="caution"
        title-icon=${Z()}
        title-text=${this.t(this._i18nKeys.title)}
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        ?visible=${this._isModalVisible}
        @help-modal-footer-button-click=${this._handleFooterButtonClick}
        @help-modal-footer-link-click=${this._handleCloseClick}
        @help-modal-header-click=${this._handleCloseClick}
        @help-modal-veil-click=${this._handleCloseClick}
        @help-modal-transitionend=${this._handleTransitionend}
        @header-main-icon-click=${this._handleHeaderIconClick}
      >
      </bbva-help-modal>
    `}}var Ra=W`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0 1rem;
}
`;class Oa extends(G(e(t(Y(ga(ba(vi(_a(M))))))))){static get is(){return"payments-mpos-digital-sales-card-reader-confirmation-modal"}static get scopedElements(){const e=[i];return Oa.scopedElementsFromClasses(e)}static get styles(){return[Ra,X("payments-mpos-digital-sales-card-reader-confirmation-modal-shared-styles")]}static get defaultI18nKeys(){const e="payments-mpos-digital-sales-card-reader-confirmation-modal";return{description:`${e}-description`,header:`${e}-header`,linkText:`${e}-link-text`,title:`${e}-title`}}static get properties(){return{_isChangeSelectionConfirm:{type:Boolean},_isModalVisible:{type:Boolean}}}constructor(){super(),this._isChangeSelectionConfirm=!1,this._isModalVisible=!1}navigateBack(){this._close()}open(){this._isModalVisible=!0,this.addView({view:this,id:Xt.MODAL_CARD_READER_CONFIRMATION})}_close(){this._isModalVisible=!1,this.closeView(Xt.MODAL_CARD_READER_CONFIRMATION)}_handleFooterButtonClick(e){e.stopPropagation(),this._isChangeSelectionConfirm=!0,this._close()}_handleCloseClick(e){e.stopPropagation(),this._close()}_handleTransitionend(e){e.stopPropagation();const{detail:{propertyName:t,visible:s}}=e;"visibility"===t&&!s&&this._isChangeSelectionConfirm&&(this._dispatchEvent(`${this.constructor.is}-confirm`),this._isChangeSelectionConfirm=!1)}_handleHeaderIconClick(e){e.stopPropagation()}render(){return F`
      <bbva-help-modal
        accessibility-text-icon-right-primary=${this.t(this._i18nKeys.closeIcon)}
        body-text=${this.t(this._i18nKeys.description)}
        button-text=${this.t(this._i18nKeys.continue)}
        data-selector="bbva-help-modal-card-reader-confirmation"
        header-text=${this.hasFeatureHeaderHidden?"":this.t(this._i18nKeys.header)}
        hide-content-padding-top
        link-text=${this.t(this._i18nKeys.linkText)}
        modal-type="caution"
        title-icon=${Z()}
        title-text=${this.t(this._i18nKeys.title)}
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        ?visible=${this._isModalVisible}
        @help-modal-footer-button-click=${this._handleFooterButtonClick}
        @help-modal-footer-link-click=${this._handleCloseClick}
        @help-modal-header-click=${this._handleCloseClick}
        @help-modal-veil-click=${this._handleCloseClick}
        @help-modal-transitionend=${this._handleTransitionend}
        @header-main-icon-click=${this._handleHeaderIconClick}
      >
      </bbva-help-modal>
    `}}var Pa=W`
:host([hidden]),
[hidden] {
  display: none !important;
}

.content-panel {
  padding: 1rem 1rem 1.5rem 1rem;
}

.description-content {
  font-size: var(--typographyTypeSmall, ${ee(te.typeSmall)});
}

.title {
  font-weight: var(--fontFacePrimaryBoldFontWeight, ${ee(se.bold.fontWeight)});
  margin: 1rem 0;
}

[data-tag-name=bbva-banner-image] {
  --bbva-banner-image-object-fit: contain;
  --_bbva-banner-image-height: 10rem;
}
`;class $a extends(n(M)){static get is(){return"payments-mpos-digital-sales-panel-info"}static get scopedElements(){const e=[y,b,m];return $a.scopedElementsFromClasses(e)}static get properties(){return{altImage:{type:String,attribute:"alt-image"},title:{type:String},description:{type:String},titleSize:{type:String,attribute:"title-size"},image:{type:String},imgAccessibilityText:{type:String,attribute:"img-accessibility-text"},loading:{type:Boolean,reflect:!0},microillustration:{type:String},sizeMicroillustration:{type:String,attribute:"size-microillustration"}}}constructor(){super(),this.altImage="",this.title="",this.description="",this.titleSize="XL",this.image="",this.imgAccessibilityText="",this.loading=!1,this.microillustration="",this.sizeMicroillustration=""}static get styles(){return[Pa,_.primaryAlt,g.primaryAlt,l.primaryAlt,X("payments-mpos-digital-sales-panel-info-shared-styles")]}get _contentTpl(){return F`
      <div class="content-panel">
        ${this.microillustration?this._contentImageTpl:J}
        ${this.image?this._contentImgUrlTpl:J}
        ${this.title?this._contentTitleTpl:J}
        ${this.description?this._contentDescriptionTpl:J}
      </div>
    `}get _contentImageTpl(){return F`
      <bbva-clip-microillustration
        alt-image=${this.altImage}
        disabled-tabindex
        alt-microillustration=${this.microillustration}
        size=${this.sizeMicroillustration}
        ?loading=${this.loading}
      >
      </bbva-clip-microillustration>
    `}get _contentImgUrlTpl(){return F`
      <bbva-banner-image
        image-src=${this.image}
        img-accessibility-text=${this.imgAccessibilityText}
      ></bbva-banner-image>
    `}get _contentTitleTpl(){return F`
      <bbva-type-text
        alignment="left"
        class="title"
        inherit
        .size=${this.titleSize}
        .text=${this.title}
        ?loading=${this.loading}
      ></bbva-type-text>
    `}get _contentDescriptionTpl(){return F`
      <bbva-type-text
        alignment="left"
        class="description-content"
        inherit
        .text=${this.description}
        ?loading=${this.loading}
      >
      </bbva-type-text>
    `}render(){return F` ${this._contentTpl} `}}var Da=W`
:host {
  --_payments-mpos-digital-sales-payment-methods-details-modal-text: ${a("colorPrimaryAltCtaComplementaryTextDefault",r)};
  --_payments-mpos-digital-sales-payment-methods-details-modal-expandable: ${a("colorPrimaryAltText01Default",r)};
}
`,Ia=W`
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

.modal-info-reader {
  --bbva-help-modal-padding: 0;
  --_help-modal-padding-bottom: 0;
}
.modal-info-reader-content {
  display: flex;
  flex-direction: column;
  height: 100vh;
}
.modal-info-reader-main {
  flex-grow: 1;
}
.modal-info-reader [data-tag-name=bbva-expandable-accordion] {
  --bbva-expandable-accordion-padding: 0 1rem;
}
.modal-info-reader [data-tag-name=bbva-expandable-accordion] [data-tag-name=bbva-list-bullet]:last-of-type {
  padding-bottom: 0.25rem;
}
.modal-info-reader [data-tag-name=bbva-expandable-accordion] [data-tag-name=bbva-type-text] {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${ee(se.medium.fontWeight)});
  color: var(--_payments-mpos-digital-sales-payment-methods-details-modal-text);
  font-size: var(--typographyTypeSmall, ${ee(te.typeSmall)});
  padding: 0 1rem;
}
.modal-info-reader [data-tag-name=bbva-expandable-accordion][opened] [data-tag-name=bbva-type-text] {
  color: var(--_payments-mpos-digital-sales-payment-methods-details-modal-expandable);
}

.fit {
  padding: 0 1rem;
}

.panel {
  padding-top: 1.5rem;
}
`;class ka extends(G(e(t(Y(ga(ba(vi(_a(M))))))))){static get is(){return"payments-mpos-digital-sales-payment-methods-details-modal"}static get scopedElements(){const e=[v,Ye,i,Pe,Xe,m,$a];return ka.scopedElementsFromClasses(e)}static get styles(){return[Da,Ia,Oe.primaryAlt,X("payments-mpos-digital-sales-payment-methods-details-modal-shared-styles")]}static get defaultI18nKeys(){const e="payments-mpos-digital-sales-payment-methods-details-modal";return{altImage:`${e}-alt-image`,cellPhone:`${e}-cell-phone`,cellPhoneBenefitsOne:`${e}-cell-phone-benefits-one`,cellPhoneBenefitsThree:`${e}-cell-phone-benefits-three`,cellPhoneBenefitsTwo:`${e}-cell-phone-benefits-two`,cellPhoneConsiderationOne:`${e}-cell-phone-considerations-one`,cellPhoneConsiderationsTwo:`${e}-cell-phone-considerations-two`,cellPhoneConsiderationsThree:`${e}-cell-phone-considerations-three`,cellPhoneImageAccesibilityText:`${e}-cell-phone-image-accesibility-text`,cellPhoneInformationDescription:`${e}-cell-phone-information-description`,cellPhoneSpecificationsReaderOne:`${e}-cell-phone-specifications-one`,cellPhoneSpecificationsTwo:`${e}-cell-phone-specifications-two`,link:`${e}-link`,linkBenefitsOne:`${e}-link-benefits-one`,linkBenefitsTwo:`${e}-link-benefits-two`,linkConsiderationsOne:`${e}-link-considerations-one`,linkImageAccesibilityText:`${e}-link-image-accesibilitytext`,linkInformationDescription:`${e}-link-information-description`,linkSpecificationsOne:`${e}-link-specifications-one`,linkSpecificationsThree:`${e}-link-specifications-three`,linkSpecificationsTwo:`${e}-link-specifications-two`,moreInformationReader:`${e}-more-information-reader`,reader:`${e}-reader`,readerBenefitsOne:`${e}-reader-benefits-one`,readerBenefitsThree:`${e}-reader-benefits-three`,readerBenefitsTwo:`${e}-reader-benefits-two`,readerConsiderationsOne:`${e}-reader-considerations-one`,readerConsiderationsTwo:`${e}-reader-considerations-two`,readerConsiderationsOneWithoutStock:`${e}-reader-considerations-one-without-stock`,readerConsiderationsTwoWithoutStock:`${e}-reader-considerations-two-without-stock`,readerConsiderationsThree:`${e}-reader-considerations-three`,readerImageAccesibilityText:`${e}-reader-image-accesibility-text`,readerInformationDescription:`${e}-reader-information-description`,readerSpecificationsFour:`${e}-reader-specifications-four`,readerSpecificationsOne:`${e}-reader-specifications-one`,readerSpecificationsThree:`${e}-reader-specifications-three`,readerSpecificationsTwo:`${e}-reader-specifications-two`}}static get properties(){return{imagesUrl:{type:Object},isMposTopWithoutStockFlow:{type:Boolean,attribute:"is-mpos-top-without-stock-flow"},mposPriceStock:{type:Object},tabSelected:{type:Number,attribute:"tab-selected"},_isBenefitsOpened:{type:Boolean},_isConsiderationsOpened:{type:Boolean},_isModalVisible:{type:Boolean},_isSpecificationsOpened:{type:Boolean}}}constructor(){super(),this.imagesUrl={},this.isMposTopWithoutStockFlow=!1,this.mposPriceStock={},this.tabSelected=0,this._isBenefitsOpened=!1,this._isConsiderationsOpened=!1,this._isModalVisible=!1,this._isSpecificationsOpened=!1}navigateBack(){this._close()}open(){this._isModalVisible=!0,this.addView({id:Xt.MODAL_PAYMENT_METHODS_DETAILS,view:this})}_close(){this._isModalVisible=!1,this.closeView(Xt.MODAL_PAYMENT_METHODS_DETAILS)}_handleCloseClick(e){e.stopPropagation(),this._close()}_handleTransitionend(e){e.stopPropagation();const{detail:{propertyName:t,visible:s}}=e;"transform"===t&&s&&this._dispatchShowEvent({viewName:rs.MODAL_PAYMENT_METHODS_DETAILS})}_handleHeaderIconClick(e){e.stopPropagation()}_handleAccordion(e){e.stopPropagation();const{target:t,detail:s}=e;s&&this._setAccordionState(s,t.id)}_setAccordionState(e,t){t===Bt.BENEFITS?(this._isBenefitsOpened=e,this._isConsiderationsOpened=!1,this._isSpecificationsOpened=!1):t===Bt.CONSIDERATIONS?(this._isConsiderationsOpened=e,this._isBenefitsOpened=!1,this._isSpecificationsOpened=!1):t===Bt.SPECIFICATIONS&&(this._isSpecificationsOpened=e,this._isBenefitsOpened=!1,this._isConsiderationsOpened=!1)}_hideChangeTab(e){e.stopPropagation(),this._isBenefitsOpened=!1,this._isConsiderationsOpened=!1,this._isSpecificationsOpened=!1}_expandableTpl(e){const t=[{id:Bt.BENEFITS,isOpened:this._isBenefitsOpened,i18nKey:"benefits",elements:e[Bt.BENEFITS],hideDivider:!1},{id:Bt.CONSIDERATIONS,isOpened:this._isConsiderationsOpened,i18nKey:"considerations",elements:e[Bt.CONSIDERATIONS],hideDivider:!1},{id:Bt.SPECIFICATIONS,isOpened:this._isSpecificationsOpened,i18nKey:"technicalSpecifications",elements:e[Bt.SPECIFICATIONS],hideDivider:!0}];return F`
      ${t.map((({id:e,isOpened:t,i18nKey:s,elements:i,hideDivider:a})=>F`
          <bbva-expandable-accordion
            clip-box
            id=${e}
            heading-level="2"
            ?opened=${t}
            @expandable-accordion-open-change=${this._handleAccordion}
          >
            <div slot="header">
              <bbva-type-text text=${this.t(this._i18nKeys[s])}></bbva-type-text>
            </div>
            <div slot="content">
              ${i.map((e=>F`
                  <bbva-list-bullet
                    text=${this.t(e,{commission:this.mposPriceStock.percentage,amount:this.mposPriceStock.unitPrice})}
                  ></bbva-list-bullet>
                `))}
            </div>
          </bbva-expandable-accordion>
          <div class="fit" .hidden=${a}>
            <bbva-divider-default></bbva-divider-default>
          </div>
        `))}
    `}get _paymentMethodsTabs(){const e=(e,t,s,i,a,r,n)=>{var o;return{title:this.t(this._i18nKeys[e]),description:this.t(this._i18nKeys[t]),image:null===(o=this.imagesUrl)||void 0===o?void 0:o[s],imgAccessibilityText:this.t(this._i18nKeys[i]),bullets:{[Bt.BENEFITS]:a.map((e=>this._i18nKeys[e])),[Bt.CONSIDERATIONS]:r.map((e=>this._i18nKeys[e])),[Bt.SPECIFICATIONS]:n.map((e=>this._i18nKeys[e]))}}},t=[this.isMposTopWithoutStockFlow?"readerConsiderationsOneWithoutStock":"readerConsiderationsOne",this.isMposTopWithoutStockFlow?"readerConsiderationsTwoWithoutStock":"readerConsiderationsTwo","readerConsiderationsThree"],s=e("cellPhone","cellPhoneInformationDescription","imageCelular","cellPhoneImageAccesibilityText",["cellPhoneBenefitsOne","cellPhoneBenefitsTwo","cellPhoneBenefitsThree"],["cellPhoneConsiderationOne","cellPhoneConsiderationsTwo","cellPhoneConsiderationsThree"],["cellPhoneSpecificationsReaderOne","cellPhoneSpecificationsTwo"]),i=e("reader","readerInformationDescription","imageLector","readerImageAccesibilityText",["readerBenefitsOne","readerBenefitsTwo","readerBenefitsThree"],t,["readerSpecificationsOne","readerSpecificationsTwo","readerSpecificationsThree","readerSpecificationsFour"]),a=e("link","linkInformationDescription","imageLink","linkImageAccesibilityText",["linkBenefitsOne","linkBenefitsTwo"],["linkConsiderationsOne"],["linkSpecificationsOne","linkSpecificationsTwo","linkSpecificationsThree"]);return this.isMposTopFlow?[s,i,a]:this.isMposFlow?[i,a]:[s]}get _tabContentTpl(){return F`
      ${this._paymentMethodsTabs.map((({title:e,description:t,image:s,imgAccessibilityText:i,bullets:a},r)=>F`
          <div class="panel" role="tabpanel" id="content-${r}" aria-labelledby="tab-${r}">
            <payments-mpos-digital-sales-panel-info
              alt-image=${this.t(this._i18nKeys.altImage)}
              title=${e}
              description=${t}
              image=${s}
              img-accessibility-text=${i}
            ></payments-mpos-digital-sales-panel-info>
            ${this._expandableTpl(a)}
          </div>
        `))}
    `}render(){const e=this._paymentMethodsTabs.map((({title:e})=>({title:e})));return F`
      <bbva-help-modal
        class="modal-info-reader"
        data-selector="bbva-help-modal-more-info-reader"
        full-height
        header-close-icon-aria-label=${this.t(this._i18nKeys.closeIcon)}
        header-text=${this.hasFeatureHeaderHidden?"":this.t(this._i18nKeys.moreInformationReader)}
        header-type=${is.MODAL_SEQUENTIAL}
        hide-content-padding-top
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        ?visible=${this._isModalVisible}
        @help-modal-transitionend=${this._handleTransitionend}
        @help-modal-header-click=${this._handleCloseClick}
        @help-modal-veil-click=${this._handleCloseClick}
        @header-main-icon-click=${this._handleHeaderIconClick}
      >
        <div slot="slot-content">
          ${this.isTopFlow?F`${this._tabContentTpl}`:F`
                <div>
                  <bbva-tab-default
                    id="tab-default"
                    .options=${e}
                    selected=${this.tabSelected}
                    tabs-per-page="2"
                    class="default-basic"
                    @tab-default-tab-change=${this._hideChangeTab}
                  >
                    ${this._tabContentTpl}
                  </bbva-tab-default>
                </div>
              `}
        </div>
      </bbva-help-modal>
    `}}var wa=W`
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

.fit {
  padding: 0 1rem;
}

.description {
  margin-bottom: 0.5rem;
}

.link {
  margin-bottom: 1rem;
}

.radio-group {
  margin-bottom: 1.5rem;
}

[data-tag-name=bbva-notification-help] {
  padding-top: 0.5rem;
}

.divider {
  padding: 0.5rem 1rem;
}
`;class xa extends(G(e(t(Y(ga(vi(_a(M)))))))){static get is(){return"payments-mpos-digital-sales-card-reader"}static get scopedElements(){const e=[p,v,Ge,We,S,u,m,Oa,ka];return xa.scopedElementsFromClasses(e)}static get styles(){return[wa,c.primaryAlt,f.primaryAlt,Ke.primaryAlt,ze.primaryAlt,T.primaryAlt,d.primaryAlt,l.primaryAlt,X("payments-mpos-digital-sales-card-reader-shared-styles")]}static get defaultI18nKeys(){const e="payments-mpos-digital-sales-card-reader";return{description:`${e}-description`,readerDetails:`${e}-reader-details`,withCardReader:`${e}-with-card-reader`,withCardReaderMessage:`${e}-with-card-reader-message`,withoutCardReader:`${e}-without-card-reader`,withoutCardReaderMessage:`${e}-without-card-reader-message`}}static get properties(){return{cardReaderOptionSelected:{type:String,attribute:"card-reader-option-selected"},imagesUrl:{type:Object},mposPriceStock:{type:Object},_cardReaderOptionSelected:{type:String}}}constructor(){super(),this.cardReaderOptionSelected="",this.imagesUrl={},this.mposPriceStock={},this._cardReaderOptionSelected=as.WITH_CARD_READER}firstUpdated(){this._refCardReaderConfirmationModal=this.shadowRoot.querySelector("[data-tag-name=payments-mpos-digital-sales-card-reader-confirmation-modal]"),this._refPaymentMethodsDetailsModal=this.shadowRoot.querySelector("[data-tag-name=payments-mpos-digital-sales-payment-methods-details-modal]")}_openPaymentMethodsDetailsModal(){this._refPaymentMethodsDetailsModal.open()}_handleSelectCardReader(e){e.stopPropagation();const{value:t}=e.detail;this._cardReaderOptionSelected=t}_handleButtonDefaultClick(){this.cardReaderOptionSelected&&this._cardReaderOptionSelected!==this.cardReaderOptionSelected?this._refCardReaderConfirmationModal.open():this._handleCompleteStep()}_handleChangeSelectionConfirm(e){e.stopPropagation(),this._dispatchEvent(`${this.constructor.is}-steps-reset`),this._handleCompleteStep()}_handleCompleteStep(){this._dispatchEvent(`${this.constructor.is}-option-select`,{cardReaderOptionSelected:this._cardReaderOptionSelected});const e={cardReader:{cardReaderOptionSelected:this._cardReaderOptionSelected,priceReader:this.mposPriceStock.unitPrice}};this._dispatchEvent(`${this.constructor.is}-complete`,{requestActionName:cs.COMPLETE_CARD_READER,stepData:e})}get _cardReaderConfirmationModalTpl(){return F`
      <payments-mpos-digital-sales-card-reader-confirmation-modal
        ?has-feature-header-hidden=${this.hasFeatureHeaderHidden}
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        @payments-mpos-digital-sales-card-reader-confirmation-modal-confirm=${this._handleChangeSelectionConfirm}
      >
      </payments-mpos-digital-sales-card-reader-confirmation-modal>
    `}get _descriptionTpl(){return F`
      <div class="fit description">
        <bbva-type-text
          inherit
          size="S"
          text=${this.t(this._i18nKeys.description)}
        ></bbva-type-text>
      </div>
    `}get _paymentMethodsDetailsModalTpl(){return F`
      <payments-mpos-digital-sales-payment-methods-details-modal
        selected-product-flow=${this.selectedProductFlow}
        tab-selected="1"
        .imagesUrl=${this.imagesUrl}
        .mposPriceStock=${this.mposPriceStock}
        ?has-feature-header-hidden=${this.hasFeatureHeaderHidden}
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
      >
      </payments-mpos-digital-sales-payment-methods-details-modal>
    `}get _readerDetailsLinkTpl(){return F`
      <div class="fit link">
        <bbva-type-link
          aria-label=${this.t(this._i18nKeys.readerDetails)}
          @click=${this._openPaymentMethodsDetailsModal}
        >
          ${this.t(this._i18nKeys.readerDetails)}
        </bbva-type-link>
      </div>
    `}get _selectCardReaderTpl(){return F`
      <bbva-form-radio-group
        class="radio-group"
        name="selectCardReader"
        selected="1"
        @form-radio-group-item-change=${this._handleSelectCardReader}
      >
        <bbva-form-radio-button
          data-selector="bbva-form-radio-button-without-card-reader"
          value=${as.WITHOUT_CARD_READER}
        >
          ${this.t(this._i18nKeys.withoutCardReader)}
          <bbva-notification-help
            variant="info"
            text=${this.t(this._i18nKeys.withoutCardReaderMessage)}
          ></bbva-notification-help>
        </bbva-form-radio-button>
        <div class="divider"><bbva-divider-default></bbva-divider-default></div>
        <bbva-form-radio-button
          data-selector="bbva-form-radio-button-with-card-reader"
          value=${as.WITH_CARD_READER}
        >
          ${this.t(this._i18nKeys.withCardReader)}
          <bbva-notification-help
            variant="info"
            text=${this.t(this._i18nKeys.withCardReaderMessage,{amount:this.mposPriceStock.unitPrice})}
          ></bbva-notification-help>
        </bbva-form-radio-button>
      </bbva-form-radio-group>
    `}get _continueButtonTpl(){return F`
      <div class="fit">
        <bbva-button-default
          aria-label=${this.t(this._i18nKeys.continue)}
          fullwidth
          @click=${this._handleButtonDefaultClick}
        >
          ${this.t(this._i18nKeys.continue)}
        </bbva-button-default>
      </div>
    `}render(){return F`
      ${this._paymentMethodsDetailsModalTpl} ${this._cardReaderConfirmationModalTpl}
      ${this._descriptionTpl} ${this._readerDetailsLinkTpl} ${this._selectCardReaderTpl}
      ${this._continueButtonTpl}
    `}}var Na=W`
:host {
  --_payments-mpos-digital-sales-list-action-icon-fill: ${a("colorSecondaryAltFormInputAddIconError",r)};
  --_payments-mpos-digital-sales-list-action-icon-active: ${a("colorPrimaryAltSurfaceContrastPressed",r)};
}
`,Ma=W`
:host {
  display: block;
  box-sizing: border-box;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

[data-tag-name=bbva-type-text] {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${ee(se.medium.fontWeight)});
}

[data-tag-name=bbva-type-icon] {
  fill: var(--_payments-mpos-digital-sales-list-action-icon-fill);
}
[data-tag-name=bbva-type-icon]:active {
  fill: var(--_payments-mpos-digital-sales-list-action-icon-active);
}

.container {
  display: flex;
  align-items: flex-start;
  justify-content: space-between;
  gap: 1rem;
  width: 100%;
}

.actions-container {
  display: flex;
  gap: 1rem;
}
`;class qa extends(n(Y(M))){static get is(){return"payments-mpos-digital-sales-list-action"}static get scopedElements(){const e=[m,C];return qa.scopedElementsFromClasses(e)}static get properties(){return{actionsIcons:{type:Boolean,attribute:"actions-icons",reflect:!0},title:{type:String}}}constructor(){super(),this.actionsIcons=!1,this.title=""}static get styles(){return[Na,Ma,l.primaryAlt,E.primaryAlt,X("payments-mpos-digital-sales-list-action-shared-styles")]}_iconClick(e){this.dispatchEvent(new CustomEvent(`payments-mpos-digital-sales-list-action-${e}-icon-click`,{bubbles:!0,composed:!0}))}get _titleTpl(){return F` <bbva-type-text unset size="S" text=${this.title}></bbva-type-text> `}get _actionIconsTpl(){return this.actionsIcons?F`
        <div class="actions-container">
          <bbva-type-icon
            icon=${ie()}
            size="24"
            @click=${()=>this._iconClick("edit")}
          ></bbva-type-icon>
          <bbva-type-icon
            icon=${ae()}
            size="24"
            @click=${()=>this._iconClick("trash")}
          ></bbva-type-icon>
        </div>
      `:J}render(){return F`<div class="container">${this._titleTpl} ${this._actionIconsTpl}</div>`}}var Ha=W`
:host {
  --_payments-mpos-digital-sales-list-simple-label-text-color: var(--payments-mpos-digital-sales-list-simple-label-text-color, ${a("colorSecondaryFormInputFieldTextError",r)});
  --_payments-mpos-digital-sales-list-simple-icon-fill: var(--payments-mpos-digital-sales-list-simple-icon-fill, ${a("colorSecondaryLinkMainHover",r)});
  --_payments-mpos-digital-sales-list-simple-icon-color: ${a("colorPrimaryFormInputIconDefault",r)};
  --_payments-mpos-digital-sales-list-simple-icon-active: ${a("colorPrimaryFormInputAddIconDefault",r)};
}
`,Fa=W`
:host {
  display: block;
  box-sizing: border-box;
  position: relative;
  padding: 0.5rem 1rem;
  min-height: 1.5rem;
  --_payments-mpos-digital-sales-list-simple-description-text-font-weight: var(--payments-mpos-digital-sales-list-simple-description-text-font-weight, var(--fontFacePrimaryBookFontWeight, ${ee(se.book.fontWeight)}));
  --_payments-mpos-digital-sales-list-simple-description-text-font-style: var(--payments-mpos-digital-sales-list-simple-description-text-font-style, var(--fontFacePrimaryBookFontStyle, ${ee(se.book.fontStyle)}));
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-type-icon] {
  color: var(--_payments-mpos-digital-sales-list-simple-icon-color);
  fill: var(--_payments-mpos-digital-sales-list-simple-icon-fill);
}
[data-tag-name=bbva-type-icon]:active {
  color: var(--_payments-mpos-digital-sales-list-simple-icon-active);
}

.container {
  display: flex;
  align-items: flex-start;
  justify-content: space-between;
  gap: 1rem;
  width: 100%;
}

.label-container {
  flex: 1;
  min-width: 4.0625rem;
}
.label-container [data-tag-name=bbva-type-text] {
  min-width: 0;
}

.description-container {
  min-width: 0;
  word-break: break-word;
}
.description-container [data-tag-name=bbva-type-text] {
  font-weight: var(--_payments-mpos-digital-sales-list-simple-description-text-font-weight);
  font-style: var(--_payments-mpos-digital-sales-list-simple-description-text-font-style);
}

:host([label-ellipsis]:not([description-ellipsis])) .description-container {
  flex-shrink: 0;
}

:host([description-ellipsis]:not([label-ellipsis])) .label-container {
  flex-shrink: 0;
}

:host([stacked]) .container,
:host([action-icon]) .container {
  flex-direction: column;
  gap: 0;
}
:host([stacked]) .stacked-container,
:host([action-icon]) .stacked-container {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 1rem;
}

:host([variant=stacked][detail]) .label-container {
  justify-content: space-between;
}
`;class La extends(n(Y(M))){static get is(){return"payments-mpos-digital-sales-list-simple"}static get scopedElements(){const e=[m,C];return La.scopedElementsFromClasses(e)}static get properties(){return{actionIcon:{type:Boolean,attribute:"action-icon",reflect:!0},description:{type:String},descriptionEllipsis:{type:Boolean,attribute:"description-ellipsis",reflect:!0},label:{type:String},labelEllipsis:{type:Boolean,attribute:"label-ellipsis",reflect:!0},stacked:{type:Boolean,reflect:!0}}}constructor(){super(),this.actionIcon=!1,this.description="",this.descriptionEllipsis=!1,this.label="",this.labelEllipsis=!1,this.stacked=!1}static get styles(){return[Ha,Fa,l.primaryAlt,E.primaryAlt,X("payments-mpos-digital-sales-list-simple-shared-styles")]}_handleEditIconClick(){this.dispatchEvent(new CustomEvent("payments-mpos-digital-sales-list-simple-edit-icon-click",{bubbles:!0,composed:!0}))}get _labelTpl(){return F`
      <bbva-type-text
        size="S"
        text=${this.label}
        unset
        ?ellipsis=${this.labelEllipsis}
      ></bbva-type-text>
    `}get _descriptionTpl(){return this.description?F`
        <bbva-type-text
          lines="2"
          size="S"
          text=${this.description}
          unset
          ?ellipsis=${this.descriptionEllipsis}
          .alignment=${this.stacked?"left":"right"}
        ></bbva-type-text>
      `:J}get _actionIconTpl(){return this.actionIcon?F`
        <bbva-type-icon
          icon=${ie()}
          size="24"
          @click=${this._handleEditIconClick}
        ></bbva-type-icon>
      `:J}render(){return F`
      <div class="stacked-container">
        <div class="container">
          <div class="label-container">${this._labelTpl}</div>
          <div class="description-container">${this._descriptionTpl}</div>
        </div>
        ${this._actionIconTpl}
      </div>
    `}}var ja=W`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0 1rem;
}
`;class Va extends(G(e(t(Y(ga(ba(vi(_a(M))))))))){static get is(){return"payments-mpos-digital-sales-delete-other-address-modal"}static get scopedElements(){const e=[i];return Va.scopedElementsFromClasses(e)}static get styles(){return[ja,X("payments-mpos-digital-sales-delete-other-address-modal-shared-styles")]}static get defaultI18nKeys(){const e="payments-mpos-digital-sales-delete-other-address-modal";return{buttonText:`${e}-button-text`,description:`${e}-description`,header:`${e}-header`,keepAddress:`${e}-keep-address`,title:`${e}-title`}}static get properties(){return{_isModalVisible:{type:Boolean}}}constructor(){super(),this._isModalVisible=!1}navigateBack(){this._close()}open(){this._isModalVisible=!0,this.addView({view:this,id:Xt.MODAL_DELETE_OTHER_ADDRESS})}_close(){this._isModalVisible=!1,this.closeView(Xt.MODAL_DELETE_OTHER_ADDRESS)}_handleCloseClick(e){e.stopPropagation(),this._close()}_handleFooterButtonClick(e){e.stopPropagation(),this._dispatchEvent(`${this.constructor.is}-footer-button-click`),this._close()}_handleModalTransitionEnd(e){e.stopPropagation()}_handleHeaderIconClick(e){e.stopPropagation()}render(){return F`
      <bbva-help-modal
        body-text=${this.t(this._i18nKeys.description)}
        button-text=${this.t(this._i18nKeys.buttonText)}
        data-selector="bbva-help-modal-delete-other-address"
        header-text=${this.hasFeatureHeaderHidden?"":this.t(this._i18nKeys.header)}
        link-text=${this.t(this._i18nKeys.keepAddress)}
        modal-type="caution"
        title-icon=${Z()}
        title-text=${this.t(this._i18nKeys.title)}
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        ?visible=${this._isModalVisible}
        @help-modal-footer-button-click=${this._handleFooterButtonClick}
        @help-modal-footer-link-click=${this._handleCloseClick}
        @help-modal-header-click=${this._handleCloseClick}
        @help-modal-transitionend=${this._handleModalTransitionEnd}
        @help-modal-veil-click=${this._handleCloseClick}
        @header-main-icon-click=${this._handleHeaderIconClick}
      >
      </bbva-help-modal>
    `}}var Ua=W`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}

[data-tag-name=bbva-list-bullet] {
  padding: 0;
}

[data-tag-name=bbva-list-bullet]:last-of-type {
  padding-bottom: 1rem;
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0 1rem;
}
`;class Ba extends(G(e(t(Y(ga(ba(vi(_a(M))))))))){static get is(){return"payments-mpos-digital-sales-delivery-details-modal"}static get scopedElements(){const e=[Pe,i,m];return Ba.scopedElementsFromClasses(e)}static get styles(){return[Ua,Oe.primaryAlt,l.primaryAlt,X("payments-mpos-digital-sales-delivery-details-modal-shared-styles")]}static get defaultI18nKeys(){const e="payments-mpos-digital-sales-delivery-details-modal";return{bulletOne:`${e}-bullet-one`,bulletThree:`${e}-bullet-three`,bulletTwo:`${e}-bullet-two`,description:`${e}-description`,header:`${e}-header`,title:`${e}-title`}}static get properties(){return{_isModalVisible:{type:Boolean}}}constructor(){super(),this._isModalVisible=!1}navigateBack(){this._close()}open(){this._isModalVisible=!0,this.addView({id:Xt.MODAL_DELIVERY_DETAILS,view:this})}_close(){this._isModalVisible=!1,this.closeView(Xt.MODAL_DELIVERY_DETAILS)}_handleCloseClick(e){e.stopPropagation(),this._close()}_handleTransitionend(e){e.stopPropagation();const{detail:{propertyName:t,visible:s}}=e;"visibility"===t&&s&&this._dispatchShowEvent({viewName:rs.MODAL_DELIVERY_DETAILS})}_handleHeaderIconClick(e){e.stopPropagation()}render(){return F`
      <bbva-help-modal
        accessibility-text-icon-right-primary=${this.t(this._i18nKeys.closeIcon)}
        data-selector="bbva-help-modal-more-info"
        fixed-footer
        header-text=${this.hasFeatureHeaderHidden?"":this.t(this._i18nKeys.header)}
        hide-content-padding-top
        title-icon=${re()}
        title-lines="2"
        title-text=${this.t(this._i18nKeys.title)}
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        ?visible=${this._isModalVisible}
        @help-modal-header-click=${this._handleCloseClick}
        @help-modal-veil-click=${this._handleCloseClick}
        @help-modal-transitionend=${this._handleTransitionend}
        @header-main-icon-click=${this._handleHeaderIconClick}
      >
        <div class="content" slot="slot-content">
          <bbva-type-text text=${this.t(this._i18nKeys.description)}></bbva-type-text>
          <bbva-list-bullet text=${this.t(this._i18nKeys.bulletOne)}></bbva-list-bullet>
          <bbva-list-bullet text=${this.t(this._i18nKeys.bulletTwo)}></bbva-list-bullet>
          <bbva-list-bullet text=${this.t(this._i18nKeys.bulletThree)}></bbva-list-bullet>
        </div>
      </bbva-help-modal>
    `}}var Ka=W`
:host {
  --_payments-mpos-digital-sales-delivery-address-list-simple: ${a("colorPrimaryBadgeOffBackground",r)};
  --_payments-mpos-digital-sales-delivery-address-content: ${a("colorPrimaryText02Default",r)};
}
`,Ga=W`
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

.description {
  margin-bottom: 1.5rem;
}

.description, [data-tag-name=bbva-notification-message] {
  margin-left: 1rem;
  margin-right: 1rem;
}

[data-tag-name=bbva-notification-message] {
  margin-bottom: 0.5rem;
}

[data-tag-name=bbva-form-control-input] {
  text-align: start;
}

.address-link {
  display: block;
  margin-top: 1rem;
}

.address-container {
  margin-left: 0.5rem;
}

.main-address-container {
  padding-top: 1rem;
}

.address-title {
  margin-bottom: 0.5rem;
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${ee(se.medium.fontWeight)});
}

.address-content {
  color: var(--_payments-mpos-digital-sales-delivery-address-content);
}

[data-tag-name=payments-mpos-digital-sales-list-action] {
  margin-bottom: 0.5rem;
}

.link-toggle-address {
  margin: 1rem 0 0.5rem;
}

.other-address-input {
  margin-top: 0.25rem;
  margin-bottom: 0.5rem;
  --bbva-form-control-input-container-align: center;
}

[data-tag-name=payments-mpos-digital-sales-list-simple] {
  padding: 0;
  --payments-mpos-digital-sales-list-simple-label-text-color: var(--_payments-mpos-digital-sales-delivery-address-list-simple);
}

.show-new-address {
  margin-top: 1rem;
}

.hide-new-address {
  margin-top: 1.5rem;
}

[data-tag-name=bbva-button-default] {
  margin-bottom: 0.5rem;
}

[data-tag-name=bbva-form-container] {
  margin: 0 1rem 0.5rem 1rem;
}

.fit {
  padding: 0 1rem;
}

.link-show-data {
  margin-top: 0.5rem;
}
`;class za extends(G(e(t(Y(ga(ba(vi(_a(M))))))))){static get is(){return"payments-mpos-digital-sales-delivery-address"}static get scopedElements(){const e=[p,v,Je,Qe,A,R,u,m,Va,Ba,qa,La];return za.scopedElementsFromClasses(e)}static get styles(){return[Ka,Ga,c.primaryAlt,f.primaryAlt,d.primaryAlt,l.primaryAlt,X("payments-mpos-digital-sales-delivery-address-shared-styles")]}static get defaultI18nKeys(){const e="payments-mpos-digital-sales-delivery-address";return{addAddress:`${e}-add-address`,addNewAddress:`${e}-add-new-address`,deleteAddress:`${e}-delete-address`,description:`${e}-description`,mainAddress:`${e}-main-address`,notificationDescription:`${e}-notification-description`,notificationLink:`${e}-notification-link`,notificationTitle:`${e}-notification-title`,otherAddress:`${e}-other-address`,otherAddressLongFormat:`${e}-other-address-long-format`,updateAddress:`${e}-update-address`}}static get properties(){return{address:{type:Object},isAddressUnmasked:{type:Boolean,attribute:"is-address-unmasked"},otherAddress:{type:Object},_addressMasked:{type:String},_addressType:{type:String},_isCompleteStepButtonDisabled:{type:Boolean},_isOtherAddressFill:{type:Boolean},_showAddOtherAddressLink:{type:Boolean},_showNotificationAddAddress:{type:Boolean},_showNotificationDeleteAddress:{type:Boolean},_showNotificationUpdateAddress:{type:Boolean}}}constructor(){super(),this.address={},this.isAddressUnmasked=!1,this.otherAddress={},this._addressMasked="",this._addressType=Lt.MAIN,this._isCompleteStepButtonDisabled=!1,this._isOtherAddressFill=!1,this._showAddOtherAddressLink=!1,this._showNotificationAddAddress=!1,this._showNotificationDeleteAddress=!1,this._showNotificationUpdateAddress=!1}firstUpdated(e){var t;null===(t=super.firstUpdated)||void 0===t||t.call(this,e),this._refDeleteOtherAddressModal=this.shadowRoot.querySelector('[data-tag-name="payments-mpos-digital-sales-delete-other-address-modal"]'),this._refDeliveryDetailsModal=this.shadowRoot.querySelector('[data-tag-name="payments-mpos-digital-sales-delivery-details-modal"]')}updated(e){var t,s;(null===(t=super.updated)||void 0===t||t.call(this,e),e.has("otherAddress")&&Object.keys(this.otherAddress).length&&(this._isCompleteStepButtonDisabled=!1,this._isOtherAddressFill?this._showNotificationUpdateAddress=!0:this._showNotificationAddAddress=!0,this._isOtherAddressFill=!0,this._showAddOtherAddressLink=!1),this.isAddressUnmasked)||(this._addressMasked=null===(s=this.address)||void 0===s?void 0:s.fullFormattedAddress)}navigateBack(){this._dispatchPublicEvent("other-address-close")}_handleSelectedAddress(e){e.stopPropagation();const{value:t}=e.detail;if(this._addressType=t,this._addressType===Lt.OTHER&&!this._isOtherAddressFill)return this._showAddOtherAddressLink=!0,void(this._isCompleteStepButtonDisabled=!0);this._showAddOtherAddressLink=!1,this._isCompleteStepButtonDisabled=!1}_toggleAddressMask(){this._dispatchEvent(`${this.constructor.is}-unmask-toggle`,{requestActionName:cs.TOGGLE_DELIVERY_ADDRESS_MASK})}_addOtherAddressView(){this.addView({id:Xt.MODAL_OTHER_ADDRESS,view:this})}_openOtherAddressModal(){this._addOtherAddressView(),this._dispatchPublicEvent("other-address-open")}_editOtherAddressModal(e){e.stopPropagation(),this._addOtherAddressView(),this._dispatchPublicEvent("other-address-edit")}_deleteOtherAddress(e){e.stopPropagation(),this._showAddOtherAddressLink=!0,this._isOtherAddressFill=!1,this._isCompleteStepButtonDisabled=!0,this._showNotificationDeleteAddress=!0,this._dispatchEvent(`${this.constructor.is}-other-address-delete`)}_handleCompleteStep(){const e={deliveryAddress:{addressName:this._addressMasked,addressType:this._addressType,...this._addressType===Lt.OTHER?{addressName:ms(this.t(this._i18nKeys.otherAddressLongFormat,this.otherAddress)),otherAddress:this.otherAddress}:{}}};this._dispatchEvent(`${this.constructor.is}-complete`,{requestActionName:cs.COMPLETE_DELIVERY_ADDRESS,stepData:e})}_handleDeliveryDetailsLinkClick(e){e.stopPropagation(),this._refDeliveryDetailsModal.open()}_handleTrashIconClick(e){e.stopPropagation(),this._refDeleteOtherAddressModal.open()}_closeToast(e){e.stopPropagation(),this._showNotificationDeleteAddress=!1,this._showNotificationAddAddress=!1,this._showNotificationUpdateAddress=!1}get _toggleAddressLinkText(){return this.isAddressUnmasked?this.t(this._i18nKeys.hideData):this.t(this._i18nKeys.showData)}get _deliveryDetailsModalTpl(){return F`
      <payments-mpos-digital-sales-delivery-details-modal
        selected-product-flow=${this.selectedProductFlow}
        ?has-feature-header-hidden=${this.hasFeatureHeaderHidden}
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
      >
      </payments-mpos-digital-sales-delivery-details-modal>
    `}get _deleteOtherAddressModalTpl(){return F`
      <payments-mpos-digital-sales-delete-other-address-modal
        ?has-feature-header-hidden=${this.hasFeatureHeaderHidden}
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        @payments-mpos-digital-sales-delete-other-address-modal-footer-button-click=${this._deleteOtherAddress}
      >
      </payments-mpos-digital-sales-delete-other-address-modal>
    `}get _notificationDeleteAddress(){return F`
      <bbva-notification-toast
        auto-hide
        fixed-bottom
        type="success"
        ?show=${this._showNotificationDeleteAddress}
        @notification-toast-close=${this._closeToast}
      >
        <bbva-type-text
          inherit
          size="S"
          text=${this.t(this._i18nKeys.deleteAddress)}
        ></bbva-type-text>
      </bbva-notification-toast>
    `}get _notificationUpdateAddress(){return F`
      <bbva-notification-toast
        auto-hide
        fixed-bottom
        type="success"
        ?show=${this._showNotificationUpdateAddress}
        @notification-toast-close=${this._closeToast}
      >
        <bbva-type-text
          inherit
          size="S"
          text=${this.t(this._i18nKeys.updateAddress)}
        ></bbva-type-text>
      </bbva-notification-toast>
    `}get _notificationAddAddress(){return F`
      <bbva-notification-toast
        auto-hide
        fixed-bottom
        type="success"
        ?show=${this._showNotificationAddAddress}
        @notification-toast-close=${this._closeToast}
      >
        <bbva-type-text
          inherit
          size="S"
          text=${this.t(this._i18nKeys.addNewAddress)}
        ></bbva-type-text>
      </bbva-notification-toast>
    `}get _descriptionTpl(){return F`
      <div class="description">
        <bbva-type-text
          inherit
          size="S"
          text=${this.t(this._i18nKeys.description)}
        ></bbva-type-text>
      </div>
    `}get _notificationTpl(){return F`
      <bbva-notification-message
        accessibility-link-label=${this.t(this._i18nKeys.notificationLink)}
        variant="default"
        message-title=${this.t(this._i18nKeys.notificationTitle)}
        link-title=${this.t(this._i18nKeys.notificationLink)}
        @notification-message-link-click=${this._handleDeliveryDetailsLinkClick}
      >
        ${this.t(this._i18nKeys.notificationDescription)}
      </bbva-notification-message>
    `}get _selectAddressTypeTpl(){return F`
      <bbva-form-container
        name="select-address-type"
        @form-container-radio-change=${this._handleSelectedAddress}
      >
        ${this._mainAddressTypeTpl}${this._otherAddressTypeTpl}
      </bbva-form-container>
    `}get _mainAddressTypeTpl(){return F`
      <bbva-form-control-input
        alignment="right"
        checked
        name="select-address-type"
        slot="_option"
        type="radio"
        value=${Lt.MAIN}
      >
        <div slot="right" class="address-container main-address-container">
          <bbva-type-text
            class="address-title"
            size="S"
            text=${this.t(this._i18nKeys.mainAddress)}
            unset
          ></bbva-type-text>
          <bbva-type-text
            class="address-content"
            data-acoustic-obfuscate
            inherit
            font-style=${this.isAddressUnmasked?"":"italic"}
            size="XS"
            text=${this.address.fullFormattedAddress}
          ></bbva-type-text>
        </div>
        <div slot="bottom">
          <bbva-type-link
            class="link-toggle-address"
            data-selector="bbva-link-toggle-address-mask"
            @click=${this._toggleAddressMask}
          >
            ${this._toggleAddressLinkText}
          </bbva-type-link>
          <bbva-divider-default></bbva-divider-default>
        </div>
      </bbva-form-control-input>
    `}get _otherAddressTypeTpl(){return F`
      <bbva-form-control-input
        class="other-address-input"
        alignment="right"
        name="select-address-type"
        slot="_option"
        type="radio"
        value=${Lt.OTHER}
      >
        <div slot="right" class="address-container">
          <payments-mpos-digital-sales-list-action
            title=${this.t(this._i18nKeys.otherAddress)}
            ?actions-icons=${this._isOtherAddressFill}
            @payments-mpos-digital-sales-list-action-edit-icon-click=${this._editOtherAddressModal}
            @payments-mpos-digital-sales-list-action-trash-icon-click=${this._handleTrashIconClick}
          ></payments-mpos-digital-sales-list-action>
          ${this._isOtherAddressFill?F`
                <payments-mpos-digital-sales-list-simple
                  data-selector="payments-mpos-digital-sales-list-simple"
                  label=${ms(this.t(this._i18nKeys.otherAddressLongFormat,this.otherAddress))}
                ></payments-mpos-digital-sales-list-simple>
              `:J}
        </div>
        <div slot="bottom">
          ${this._isOtherAddressFill?J:F`
                <bbva-type-link
                  data-selector="bbva-link-add-address"
                  class="address-link"
                  tabindex="0"
                  ?hidden=${!this._showAddOtherAddressLink}
                  @click=${this._openOtherAddressModal}
                >
                  ${this.t(this._i18nKeys.addAddress)}
                </bbva-type-link>
              `}
        </div>
      </bbva-form-control-input>
    `}get _continueButtonTpl(){return F`
      <div class="fit">
        <bbva-button-default
          class="${this._showAddOtherAddressLink?"hide-new-address":"show-new-address"}"
          fullwidth
          ?disabled=${this._isCompleteStepButtonDisabled}
          @click=${this._handleCompleteStep}
        >
          ${this.t(this._i18nKeys.continue)}
        </bbva-button-default>
      </div>
    `}render(){return F`
      ${this._deliveryDetailsModalTpl} ${this._deleteOtherAddressModalTpl}
      ${this._notificationDeleteAddress} ${this._descriptionTpl} ${this._notificationTpl}
      ${this._selectAddressTypeTpl} ${this._continueButtonTpl} ${this._notificationUpdateAddress}
      ${this._notificationAddAddress}
    `}}var Wa=W`
:host {
  --_payments-mpos-digital-sales-list-card-active-type-text-color: ${a("colorPrimaryAltSurfaceAmbientPressed",r)};
  --_payments-mpos-digital-sales-list-card-active-account-text-color: ${a("colorPrimaryLinkMainDefault",r)};
  --_payments-mpos-digital-sales-list-card-disabled-account-text-color: ${a("colorPrimaryText01Default",r)};
}
`,Ya=W`
:host {
  box-sizing: border-box;
  width: 100%;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
  margin: 0;
  padding: 0;
}

[data-tag-name=bbva-type-link] {
  display: block;
  padding: 1rem;
}

.flex-container {
  display: flex;
  justify-content: space-between;
  gap: 1rem;
}

.account-name {
  font-style: var(--fontFacePrimaryMediumFontStyle, ${ee(se.medium.fontStyle)});
  font-size: var(--typographyTypeMedium, ${ee(te.typeMedium)});
  line-height: var(--lineHeightTypeMedium, ${ee(ne.typeMedium)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${ee(se.medium.fontWeight)});
}

.account-amount {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${ee(se.medium.fontWeight)});
}

:host([active]) [data-tag-name=bbva-type-link]:active {
  background-color: var(--_payments-mpos-digital-sales-list-card-active-type-text-color);
}
:host([active]) .account-name {
  color: var(--_payments-mpos-digital-sales-list-card-active-account-text-color);
}

:host([aria-disabled=true]) {
  cursor: default;
  pointer-events: none;
}
:host([aria-disabled=true]) .account-name {
  color: var(--_payments-mpos-digital-sales-list-card-disabled-account-text-color);
}
`;class Xa extends(n(O(oe(M)))){static get is(){return"payments-mpos-digital-sales-list-card"}static get scopedElements(){const e=[et,m,h];return Xa.scopedElementsFromClasses(e)}static get properties(){return{accountName:{type:String,attribute:"account-name"},accountNumber:{type:String,attribute:"account-number"},active:{type:Boolean,reflect:!0},description:{type:String}}}constructor(){super(),this.accountName="",this.accountNumber="",this.active=!1,this.description=""}static get styles(){return[Wa,Ya,o.primaryAlt,Ze.primaryAlt,l.primaryAlt,o.secondary,Ze.secondary,l.secondary,X("payments-mpos-digital-sales-list-simple-shared-styles")]}_handleAccountClick(){this.dispatchEvent(new CustomEvent(`${this.constructor.is}-click`,{composed:!0,bubbles:!0}))}render(){return F`
      <bbva-type-link @click=${this._handleAccountClick}>
        <div class="flex-container">
          <bbva-type-text class="account-name" text=${this.accountName} unset> </bbva-type-text>
          <bbva-type-amount
            class="account-amount"
            disabled-tabindex
            symbol-left
            variant="xl"
            amount=${this.amount}
            local-currency=${this.localCurrency}
            currency-code=${this.currencyCode}
            language=${this.language}
          ></bbva-type-amount>
        </div>
        <div class="flex-container">
          <bbva-badge-reference
            disabled-tabindex
            number=${Number(this.accountNumber)}
          ></bbva-badge-reference>
          <bbva-type-text
            class="description"
            size="S"
            text=${this.description}
            unset
          ></bbva-type-text>
        </div>
      </bbva-type-link>
    `}}var Ja=W`
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

[data-tag-name=bbva-notification-help] {
  margin: 0 0 0.5rem 1rem;
  padding-top: 0;
}

.fit {
  padding: 0 1rem;
}
.fit:last-of-type {
  display: none;
}
`;const Qa="Enter";class Za extends(G(e(t(Y(ga(ba(vi(_a(M))))))))){static get is(){return"payments-mpos-digital-sales-account-list"}static get scopedElements(){const e=[v,S,Xa];return Za.scopedElementsFromClasses(e)}static get styles(){return[Ja,T.primaryAlt,f.primaryAlt,X("payments-mpos-digital-sales-account-list-shared-styles")]}static get defaultI18nKeys(){const e="payments-mpos-digital-sales-account-list";return{noCredit:`${e}-no-credit`,availableBalance:`${e}-available-balance`}}static get properties(){return{accounts:{type:Array},priceReader:{type:Number,attribute:"price-reader"},isLimitToThreeAccounts:{type:Boolean,attribute:"is-limit-to-three-accounts"}}}constructor(){super(),this.accounts=[],this.priceReader=0,this.isLimitToThreeAccounts=!1}_handleSelectAccount(e,t){e.stopPropagation(),this._dispatchEvent(`${this.constructor.is}-select`,t)}get _accounts(){return this.isLimitToThreeAccounts?this.accounts.slice(0,3):this.accounts}get _hasOneAccount(){return 1===this.accounts.length}render(){var e;return F`
      ${null===(e=this._accounts)||void 0===e?void 0:e.map((e=>{const{amount:t,name:s,number:i,currency:a}=e,r=this.priceReader>t,n=this.priceReader&&r||this._hasOneAccount;return F`
          <payments-mpos-digital-sales-list-card
            account-name=${s}
            account-number=${us(i)}
            active
            amount=${t}
            currency-code=${a}
            data-acoustic-obfuscate
            data-selector="payments-mpos-digital-sales-list-card"
            description=${this.t(this._i18nKeys.availableBalance)}
            language=${this.language}
            local-currency=${a}
            disabled-tabindex=${B(n)}
            tabindex="0"
            ?disabled=${n}
            @payments-mpos-digital-sales-list-card-click=${t=>this._handleSelectAccount(t,e)}
            @keypress=${t=>t.code===Qa&&this._handleSelectAccount(t,e)}
          >
          </payments-mpos-digital-sales-list-card>
          ${r?F`
                <bbva-notification-help
                  accessibility-label-icon="payments-mpos-digital-sales-account-warning-a11y"
                  class="alert"
                  disabled-tabindex
                  variant="alert"
                  text=${this.t(this._i18nKeys.noCredit)}
                ></bbva-notification-help>
              `:J}
          ${this._hasOneAccount?J:F`
                <div class="fit">
                  <bbva-divider-default></bbva-divider-default>
                </div>
              `}
        `}))}
    `}}var er=W`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0;
}
`;class tr extends(G(e(t(Y(ga(ba(vi(_a(M))))))))){static get is(){return"payments-mpos-digital-sales-all-accounts-modal"}static get scopedElements(){const e=[i,Za];return tr.scopedElementsFromClasses(e)}static get styles(){return[er,X("payments-mpos-digital-sales-all-accounts-modal-shared-styles")]}static get properties(){return{accounts:{type:Array},priceReader:{type:Number,attribute:"price-reader"},_isModalVisible:{type:Boolean},_selectedAccount:{type:Object}}}constructor(){super(),this.accounts=[],this.priceReader=0,this._isModalVisible=!1,this._selectedAccount={}}navigateBack(){this._close()}open(){this._isModalVisible=!0,this.addView({id:Xt.MODAL_ALL_ACCOUNTS_LIST,view:this})}_close(){this._isModalVisible=!1,this.closeView(Xt.MODAL_ALL_ACCOUNTS_LIST)}_handleSelectAccount(e){e.stopPropagation();const t=e.detail;this._selectedAccount=t,this._close()}_handleCloseClick(e){e.stopPropagation(),this._close()}_handleTransitionend(e){e.stopPropagation();const{detail:{propertyName:t,visible:s}}=e;"visibility"===t&&!s&&Object.keys(this._selectedAccount).length&&this._dispatchEvent(`${this.constructor.is}-select`,this._selectedAccount)}_handleHeaderIconClick(e){e.stopPropagation()}render(){return F`
      <bbva-help-modal
        accessibility-text-icon-right-primary=${this.t(this._i18nKeys.closeIcon)}
        header-text=${this.hasFeatureHeaderHidden?"":this.t(this._i18nKeys.accounts)}
        header-type=${is.MODAL_SEQUENTIAL}
        hide-content-padding-top
        full-height
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        ?visible=${this._isModalVisible}
        @help-modal-header-click=${this._handleCloseClick}
        @help-modal-veil-click=${this._handleCloseClick}
        @help-modal-transitionend=${this._handleTransitionend}
        @header-main-icon-click=${this._handleHeaderIconClick}
      >
        <div slot="slot-content">
          <payments-mpos-digital-sales-account-list
            price-reader=${this.priceReader}
            .accounts=${this.accounts}
            @payments-mpos-digital-sales-account-list-select=${this._handleSelectAccount}
          ></payments-mpos-digital-sales-account-list>
        </div>
      </bbva-help-modal>
    `}}var sr=W`
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
  padding: 1rem 0 0.5rem 0;
}

[data-tag-name=bbva-type-text] {
  margin-bottom: 0.5rem;
}

.add-hzont-margin {
  margin: 0 1rem;
}

[data-tag-name=bbva-button-default] {
  margin-top: 1.5rem;
}

.btn-fit {
  padding: 0 1rem;
}
`;class ir extends(G(e(t(Y(ga(ba(vi(_a(M))))))))){static get is(){return"payments-mpos-digital-sales-financial-accounts"}static get scopedElements(){const e=[p,$,m,Za,tr,Xa];return ir.scopedElementsFromClasses(e)}static get styles(){return[sr,P.primaryAlt,l.primaryAlt,c.primaryAlt,X("payments-mpos-digital-sales-financial-accounts-shared-styles")]}static get defaultI18nKeys(){const e="payments-mpos-digital-sales-financial-accounts";return{incomeReaderParagraph:`${e}-income-reader-paragraph`,paymentReaderParagraph:`${e}-payment-reader-paragraph`,seeAll:`${e}-see-all`}}static get properties(){return{accounts:{type:Array},priceReader:{type:Number,attribute:"price-reader"},type:{type:String},_isAllAccountsListModalVisible:{type:Boolean}}}constructor(){super(),this.accounts=[],this.priceReader=0,this.type="",this._isAllAccountsListModalVisible=!1}firstUpdated(e){super.firstUpdated(e),this._refAllAccountsModal=this.shadowRoot.querySelector('[data-tag-name="payments-mpos-digital-sales-all-accounts-modal"]')}_handleHeaderLinkClick(e){e.stopPropagation(),this._refAllAccountsModal.open()}_handleContinueClick(e,t={}){let s;e.stopPropagation(),s=Object.keys(t).length?t:e.detail,this._dispatchEvent(`${this.constructor.is}-complete`,{requestActionName:this.type===Ht.INCOME?cs.COMPLETE_INCOME_ACCOUNT:cs.COMPLETE_PAYMENT_ACCOUNT,stepData:{[`${this.type}Account`]:s}})}get _hasOneAccount(){return 1===this.accounts.length}get _allAccountsModalTpl(){return F`
      <payments-mpos-digital-sales-all-accounts-modal
        price-reader=${this.type===Ht.PAYMENT?this.priceReader:0}
        .accounts=${this.accounts}
        ?has-feature-header-hidden=${this.hasFeatureHeaderHidden}
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        @payments-mpos-digital-sales-all-accounts-modal-select=${this._handleContinueClick}
      ></payments-mpos-digital-sales-all-accounts-modal>
    `}get _headerTpl(){return F`
      <bbva-header-category
        class="add-hzont-margin"
        option-link=${this.accounts.length>3?this.t(this._i18nKeys.seeAll):""}
        text=${this.t(this._i18nKeys.accounts)}
        @header-category-link-click=${this._handleHeaderLinkClick}
      ></bbva-header-category>
    `}get _descriptionTpl(){return F`
      <bbva-type-text
        class="add-hzont-margin"
        unset
        size="S"
        text=${this.type===Ht.PAYMENT?this.t(this._i18nKeys.paymentReaderParagraph):this.t(this._i18nKeys.incomeReaderParagraph)}
      ></bbva-type-text>
    `}get _accountListTpl(){return F`
      <payments-mpos-digital-sales-account-list
        is-limit-to-three-accounts
        price-reader=${this.type===Ht.PAYMENT?this.priceReader:0}
        .accounts=${this.accounts}
        @payments-mpos-digital-sales-account-list-select=${this._handleContinueClick}
      ></payments-mpos-digital-sales-account-list>
    `}get continueButtonTpl(){if(this._hasOneAccount){var e;const t=null===(e=this.accounts)||void 0===e?void 0:e[0],s=Number(null==t?void 0:t.amount)<this.priceReader;return F`<div class="btn-fit">
        <bbva-button-default
          data-selector="bbva-button-default-financial-accounts"
          variant="primary"
          fullwidth
          ?disabled=${s}
          @click=${e=>this._handleContinueClick(e,t)}
        >
          ${this.t(this._i18nKeys.continue)}
        </bbva-button-default>
      </div>`}return J}render(){return F`
      ${this._allAccountsModalTpl} ${this._descriptionTpl} ${this._headerTpl}
      ${this._accountListTpl} ${this.continueButtonTpl}
    `}}var ar=W`
:host {
  box-sizing: border-box;
  display: flex;
  flex-direction: column;
  gap: 0.5rem;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-type-icon] {
  float: left;
  margin-right: 0.5rem;
}
`;class rr extends(n(M)){static get is(){return"payments-mpos-digital-sales-panel-privacy"}static get scopedElements(){const e=[C,u,m];return rr.scopedElementsFromClasses(e)}static get properties(){return{linkText:{type:String,attribute:"link-text"},privacyText:{type:String,attribute:"privacy-text"}}}static get styles(){return[ar,E.primaryAlt,d.primaryAlt,l.primaryAlt,X("payments-mpos-digital-sales-panel-privacy-shared-styles")]}constructor(){super(),this.linkText="",this.privacyText=""}_linkClick(){this.dispatchEvent(new CustomEvent(`${this.constructor.is}-link-click`,{detail:!0,bubbles:!0,composed:!0}))}render(){return F`
      <div>
        <bbva-type-icon icon=${ce()}></bbva-type-icon>
        <bbva-type-text size="2XS" text=${this.privacyText} unset></bbva-type-text>
      </div>
      <bbva-type-link size="2XS" @click=${this._linkClick}>${this.linkText}</bbva-type-link>
    `}}var nr=W`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0.5rem 1rem 0;
}
`;class or extends(G(e(t(Y(ga(ba(vi(_a(M))))))))){static get is(){return"payments-mpos-digital-sales-privacy-notice-modal"}static get scopedElements(){const e=[i];return or.scopedElementsFromClasses(e)}static get styles(){return[nr,X("payments-mpos-digital-sales-privacy-notice-modal-shared-styles")]}static get defaultI18nKeys(){return{content:"payments-mpos-digital-sales-privacy-notice-modal-content"}}static get properties(){return{_isModalVisible:{type:Boolean}}}constructor(){super(),this._isModalVisible=!1}navigateBack(){this._close()}open(){this._isModalVisible=!0,this.addView({id:Xt.MODAL_PRIVACY_NOTICE,view:this})}_close(){this._isModalVisible=!1,this.closeView(Xt.MODAL_PRIVACY_NOTICE)}_handleCloseClick(e){e.stopPropagation(),this._close()}_handleTransitionend(e){e.stopPropagation();const{detail:{propertyName:t,visible:s}}=e;"visibility"===t&&s&&this._dispatchShowEvent({viewName:rs.MODAL_PRIVACY_NOTICE})}_handleHeaderIconClick(e){e.stopPropagation()}render(){return F`
      <bbva-help-modal
        accessibility-text-icon-right-primary=${this.t(this._i18nKeys.closeIcon)}
        body-text=${this.t(this._i18nKeys.content)}
        header-text=${this.hasFeatureHeaderHidden?"":this.t(this._i18nKeys.privacyNoticeTitle)}
        hide-content-padding-top
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        ?visible=${this._isModalVisible}
        @help-modal-header-click=${this._handleCloseClick}
        @help-modal-transitionend=${this._handleTransitionend}
        @help-modal-veil-click=${this._handleCloseClick}
        @header-main-icon-click=${this._handleHeaderIconClick}
      >
      </bbva-help-modal>
    `}}var cr=W`
:host {
  --_payments-mpos-digital-sales-header-category-color: ${a("colorPrimaryLocationsPinsTextSelected",r)};
}
`,lr=W`
:host {
  display: block;
  box-sizing: border-box;
  text-align: left;
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

[data-tag-name=bbva-header-category] {
  padding: 1rem 0;
}

[data-tag-name=bbva-form-input][type=text] {
  margin-bottom: 1rem;
}
[data-tag-name=bbva-form-input][type=textarea] {
  margin-bottom: 1.5rem;
}

[data-tag-name=payments-mpos-digital-sales-panel-privacy] {
  margin: 1rem 0 1.5rem 0;
}

[data-tag-name=payments-mpos-digital-sales-list-simple] {
  padding: 0 0 1rem 0;
  --payments-mpos-digital-sales-list-simple-description-text-font-weight: var(--fontFacePrimaryMediumFontWeight, ${ee(se.medium.fontWeight)});
}
[data-tag-name=payments-mpos-digital-sales-list-simple].description-italic {
  --payments-mpos-digital-sales-list-simple-description-text-font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${ee(se.mediumItalic.fontStyle)});
}

[data-tag-name=payments-mpos-digital-sales-list-simple]:last-of-type {
  padding-bottom: 0.5rem;
}

[data-tag-name=bbva-notification-message] {
  margin: 1.5rem 0 0.5rem 0;
}

[data-tag-name=bbva-form-select] {
  padding-bottom: 0.5rem;
}

.header-select {
  --bbva-header-category--_ambient--heading-color: : var(--_payments-mpos-digital-sales-header-category-color);
}

.button-container {
  display: flex;
  justify-content: center;
}

[data-tag-name=bbva-button-default] {
  margin-bottom: 0.5rem;
}
`;class dr extends(G(e(t(Y(ga(ba(vi(_a(M))))))))){static get is(){return"payments-mpos-digital-sales-order-info"}static get scopedElements(){const e=[p,it,rt,nt,$,m,La,rr,or];return dr.scopedElementsFromClasses(e)}static get styles(){return[cr,lr,c.primaryAlt,tt.primaryAlt,at.primaryAlt,st.primaryAlt,P.primaryAlt,l.primaryAlt,X("payments-mpos-digital-sales-order-info-shared-styles")]}static get defaultI18nKeys(){const e="payments-mpos-digital-sales-order-info";return{availableCharacters:`${e}-available-characters`,commerceCategory:`${e}-commerce-category`,commerceDescription:`${e}-commerce-description`,commercialName:`${e}-commercial-name`,description:`${e}-description`,erroremojis:`${e}-error-emojis`,exceded:`${e}-exceded`,excededInvalid:`${e}-exceded-invalid`,headerCommercial:`${e}-header-commercial`,headerPersonalData:`${e}-header-personal-data`,informationalText:`${e}-informational-text`,invalid:`${e}-invalid`,securityAndProtected:`${e}-security-and-protected`}}static get properties(){return{activities:{type:Array},categories:{type:Array},contactDetails:{type:Object},families:{type:Array},isContactDetailsUnmasked:{type:Boolean,attribute:"is-contact-details-unmasked"},notFoundMcc:{type:String,attribute:"not-found-mcc"},_activity:{type:Object},_category:{type:Object},_commercialDescription:{type:String},_commercialName:{type:String},_emailMasked:{type:String},_hasExcededTextCharacters:{type:Boolean},_hasInvalidTextCharacters:{type:Boolean},_hasInvalidTextAreaCharacters:{type:Boolean},_isPrivacyNoticeModalVisible:{type:Boolean},_mcc:{type:String},_phoneMasked:{type:String},_showSubcategory:{type:Boolean},_subcategory:{type:Object}}}constructor(){super(),this.activities=[],this.categories=[],this.contactDetails={},this.families=[],this.isContactDetailsUnmasked=!1,this.notFoundMcc="",this._activity={},this._category={},this._commercialDescription="",this._commercialName="",this._emailMasked="",this._hasExcededTextCharacters=!1,this._hasInvalidTextCharacters=!1,this._hasInvalidTextAreaCharacters=!1,this._isPrivacyNoticeModalVisible=!1,this._mcc="0000",this._phoneMasked="",this._showSubcategory=!1,this._subcategory={}}firstUpdated(e){super.firstUpdated(e),this._refPrivacyNoticeModal=this.shadowRoot.querySelector("[data-tag-name=payments-mpos-digital-sales-privacy-notice-modal]")}updated(e){var t,s,i;(null===(t=super.updated)||void 0===t||t.call(this,e),this.isContactDetailsUnmasked)||(this._emailMasked=null===(s=this.contactDetails)||void 0===s?void 0:s.email,this._phoneMasked=null===(i=this.contactDetails)||void 0===i?void 0:i.mobile)}_removeCategorySelectsData(){this._category={}}_removeSubcategorySelectsData(){this._subcategory={},this._showSubcategory=!1}_getSelectFamilyIdClick(){this._removeCategorySelectsData(),this._removeSubcategorySelectsData(),this._dispatchEvent(`${this.constructor.is}-family-select`,{requestActionName:cs.SELECT_ECONOMIC_FAMILY,familyId:this._activity.id})}_getSelectCategoryIdClick(){this._removeSubcategorySelectsData();const[e]=this.categories.filter((e=>e.id===this._category.id));e.mcc===this.notFoundMcc?(this._showSubcategory=!0,this._dispatchEvent(`${this.constructor.is}-category-select`,{requestActionName:cs.SELECT_ECONOMIC_CATEGORY,categoryId:this._category.id})):this._showSubcategory=!1}_onActivityChange(e){const[t]=this._getSelectedOption(e.target.value,this.families);this._activity={id:t.id,value:t.description},this._mcc=t.mcc,this._getSelectFamilyIdClick()}_onCategoryChange(e){const[t]=this._getSelectedOption(e.target.value,this.categories);this._category={id:t.id,value:t.description},this._mcc=t.mcc,this._getSelectCategoryIdClick()}_onSubcategoryChange(e){const[t]=this._getSelectedOption(e.target.value,this.activities);this._subcategory={id:t.id,value:t.description},this._mcc=t.mcc}_getSelectedOption(e,t){return t.filter((t=>t.id===e))}_onFormTextFill(e){var t;e.stopPropagation(),this._commercialName=null===(t=e.detail)||void 0===t?void 0:t.value,this._hasExcededTextCharacters=!ts.MAX_CHARACTERS.test(this._commercialName),this._hasInvalidTextCharacters=!ts.SPECIALS_CHARACTERS.test(this._commercialName)}_onFormTextareaFill(e){var t;e.stopPropagation(),this._commercialDescription=null===(t=e.detail)||void 0===t?void 0:t.value;const s=new RegExp(ss.SPECIALS_CHARACTERS_AND_MAX_CHARACTERS_PATTERN);this._hasInvalidTextAreaCharacters=!s.test(this._commercialDescription)}_onFormTextClear(e){e.stopPropagation(),this._commercialName="",this._hasExcededTextCharacters=!1}_onFormTextareaClear(e){e.stopPropagation(),this._commercialDescription=""}_toggleContactDetailsMask(e){e.stopPropagation(),this._dispatchEvent(`${this.constructor.is}-contact-details-unmask-toggle`,{requestActionName:cs.TOGGLE_CONTACT_DETAILS_MASK})}_handlePrivacyNoticeLinkClick(e){e.stopPropagation(),this._refPrivacyNoticeModal.open()}_handleContinueClick(){const e={orderInfo:{contactDetails:this.contactDetails={email:this._emailMasked,mobile:this._phoneMasked},commercialData:{commercialName:this._commercialName,commercialDescription:this._commercialDescription,activity:this._activity,category:this._category,subcategory:this._subcategory,mcc:this._mcc}}};this._dispatchEvent(`${this.constructor.is}-complete`,{requestActionName:cs.COMPLETE_ORDER_INFO,stepData:e})}get _toggleAddressLinkText(){return this.isContactDetailsUnmasked?this.t(this._i18nKeys.hideData):this.t(this._i18nKeys.showData)}get _isCompleteButtonDisabled(){return!this._commercialName||!this._commercialDescription||this._mcc===this.notFoundMcc||this._hasExcededTextCharacters||this._hasInvalidTextCharacters||this._hasInvalidTextAreaCharacters}get _errorMessageCommercialName(){return this._hasExcededTextCharacters&&this._hasInvalidTextCharacters?`${this.t(this._i18nKeys.excededInvalid)}`:this._hasExcededTextCharacters?`${this.t(this._i18nKeys.exceded)}`:this._hasInvalidTextCharacters?`${this.t(this._i18nKeys.invalid)}`:""}get _privacyNoticeModalTpl(){return F`
      <payments-mpos-digital-sales-privacy-notice-modal
        selected-product-flow=${this.selectedProductFlow}
        ?has-feature-header-hidden=${this.hasFeatureHeaderHidden}
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
      ></payments-mpos-digital-sales-privacy-notice-modal>
    `}get _descriptionTpl(){return F`
      <bbva-type-text inherit text=${this.t(this._i18nKeys.description)} size="S"></bbva-type-text>
    `}get _headerContactDetailsTpl(){const{email:e,mobile:t}=this.contactDetails;return F`
      <bbva-header-category
        text=${this.t(this._i18nKeys.headerPersonalData)}
        option-link=${this._toggleAddressLinkText}
        @header-category-link-click=${this._toggleContactDetailsMask}
      >
      </bbva-header-category>
      <payments-mpos-digital-sales-list-simple
        class="${this.isContactDetailsUnmasked?"":"description-italic"}"
        data-acoustic-obfuscate
        label=${this.t(this._i18nKeys.email)}
        description=${e}
        stacked
      >
      </payments-mpos-digital-sales-list-simple>
      <payments-mpos-digital-sales-list-simple
        class="${this.isContactDetailsUnmasked?"":"description-italic"}"
        data-acoustic-obfuscate
        label=${this.t(this._i18nKeys.contactPhoneNumber)}
        description=${t}
        stacked
      >
      </payments-mpos-digital-sales-list-simple>
    `}get _commercialDataTpl(){return F`
      <bbva-header-category text=${this.t(this._i18nKeys.headerCommercial)}></bbva-header-category>
      <bbva-form-input
        auto-validate
        pattern=${ts.SPECIALS_CHARACTERS_AND_MAX_CHARACTERS_PATTERN}
        info-message=${this.t(this._i18nKeys.informationalText)}
        error-message=${this._errorMessageCommercialName}
        label=${this.t(this._i18nKeys.commercialName)}
        type="text"
        @form-input-value-change=${this._onFormTextFill}
        @form-field-input-clear=${this._onFormTextClear}
      ></bbva-form-input>
      <bbva-form-input
        auto-validate
        pattern=${ss.SPECIALS_CHARACTERS_AND_MAX_CHARACTERS_PATTERN}
        error-message=${this.t(this._i18nKeys.erroremojis)}
        character-counter-label=${this.t(this._i18nKeys.availableCharacters)}
        label=${this.t(this._i18nKeys.commerceDescription)}
        maxlength=${220}
        type="textarea"
        @form-input-value-change=${this._onFormTextareaFill}
        @form-textarea-input-clear=${this._onFormTextareaClear}
      >
      </bbva-form-input>
    `}get _comercialCategory(){var e,t,s,i;const a=e=>F`<bbva-form-option value=${e.id}>${e.description}</bbva-form-option>`;return F`<bbva-header-category
        class="header-select"
        text=${this.t(this._i18nKeys.commerceCategory)}
      ></bbva-header-category>
      <bbva-form-select
        data-selector="bbva-form-activity-select"
        label=${this.t(this._i18nKeys.activityType)}
        required
        @change=${this._onActivityChange}
      >
        ${null===(e=this.families)||void 0===e?void 0:e.map(a)}
      </bbva-form-select>
      <bbva-form-select
        data-selector="bbva-form-category-select"
        label=${this.t(this._i18nKeys.category)}
        required
        .value=${this._category.id}
        ?hidden=${!(null!==(t=this._activity)&&void 0!==t&&t.id)}
        @change=${this._onCategoryChange}
      >
        ${null===(s=this.categories)||void 0===s?void 0:s.map(a)}
      </bbva-form-select>
      <bbva-form-select
        data-selector="bbva-form-select-subcategory"
        label=${this.t(this._i18nKeys.subcategory)}
        required
        .value=${this._subcategory.id}
        ?hidden=${!this._showSubcategory}
        @change=${this._onSubcategoryChange}
      >
        ${null===(i=this.activities)||void 0===i?void 0:i.map(a)}
      </bbva-form-select> `}get _panelPrivacyTpl(){return F`
      <payments-mpos-digital-sales-panel-privacy
        link-text=${this.t(this._i18nKeys.privacyNoticeTitle)}
        privacy-text=${this.t(this._i18nKeys.securityAndProtected)}
        @payments-mpos-digital-sales-panel-privacy-link-click=${this._handlePrivacyNoticeLinkClick}
      >
      </payments-mpos-digital-sales-panel-privacy>
    `}get _continueButtonTpl(){return F`
      <div class="button-container">
        <bbva-button-default
          variant="primary"
          fullwidth
          ?disabled=${this._isCompleteButtonDisabled}
          @click=${this._handleContinueClick}
        >
          ${this.t(this._i18nKeys.continue)}
        </bbva-button-default>
      </div>
    `}render(){return F`
      ${this._privacyNoticeModalTpl} ${this._descriptionTpl}
      <div>${this._headerContactDetailsTpl}</div>
      ${this._commercialDataTpl}
      ${this._comercialCategory}${this._panelPrivacyTpl}${this._continueButtonTpl}
    `}}var hr=W`
:host {
  --_payments-mpos-digital-sales-step-summary-list-simple-color: ${a("colorPrimaryCtaComplementaryTextDefault",r)};
}
`,pr=W`
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

[data-tag-name=payments-mpos-digital-sales-list-simple] {
  padding: 0.5rem 0;
  --payments-mpos-digital-sales-list-simple-label-text-color: var(--_payments-mpos-digital-sales-step-summary-list-simple-color);
}
[data-tag-name=payments-mpos-digital-sales-list-simple].description-italic {
  --payments-mpos-digital-sales-list-simple-description-text-font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${ee(se.mediumItalic.fontStyle)});
}

.hide-padding-bottom {
  padding-bottom: 0;
}

[data-tag-name=bbva-header-category] {
  padding-left: 0;
  padding-right: 0;
  margin-bottom: 0.5rem;
}

.add-hzont-margin {
  margin-left: 1rem;
  margin-right: 1rem;
}

.summary-container-divider {
  margin: 1rem 0 1rem -1rem;
}

[data-tag-name=payments-mpos-digital-sales-list-card] {
  --payments-mpos-digital-sales-list-card-padding-link: 1rem 1rem 0 1rem;
}

[data-tag-name=bbva-notification-help] {
  padding: 0.5rem 0 0 1rem;
}
`;class ur extends(G(e(t(Y(ga(vi(M))))))){static get is(){return"payments-mpos-digital-sales-step-summary"}static get scopedElements(){const e=[La,Xa,S];return ur.scopedElementsFromClasses(e)}static get defaultI18nKeys(){const e="payments-mpos-digital-sales-step-summary";return{"main-address":`${e}-main-address`,"other-address":`${e}-other-address`,availableBalance:`${e}-available-balance`,comercialDescription:`${e}-comercial-description`,comercialName:`${e}-comercial-name`,freeShipping:`${e}-free-shipping`,priceReader:`${e}-price-reader`,withCardReader:`${e}-with-card-reader`,withoutCardReader:`${e}-without-card-reader`}}static get properties(){return{summary:{type:Object}}}constructor(){super(),this.summary={}}static get styles(){return[hr,pr,T.primaryAlt,X("payments-mpos-digital-sales-step-summary-shared-styles")]}updated(e){var t;null===(t=super.updated)||void 0===t||t.call(this,e)}get _listSimpleTpl(){const{items:e=[],requireHoznPadding:t}=this.summary;return F`
      ${e.map((({id:s,label:i,description:a,isDescriptionItalic:r},n)=>F`
          ${"notificationHelp"===s?F`
                <bbva-notification-help
                  ambient="secondary"
                  variant="info"
                  text=${this.t(this._i18nKeys[i.name],i.params)}
                  accessibility-label-icon="Info"
                ></bbva-notification-help>
              `:F`
                <payments-mpos-digital-sales-list-simple
                  class="${t?"add-hzont-margin":""}
                  ${n===e.length-1?"hide-padding-bottom":""}
                  ${r?"description-italic":""}"
                  label=${this.t(this._i18nKeys[i.name],i.params)}
                  description=${B(a)}
                  ?data-acoustic-obfuscate=${r}
                  description-ellipsis
                  label-ellipsis
                >
                </payments-mpos-digital-sales-list-simple>
              `}
        `))}
    `}get _listAccountTpl(){const{accountData:{number:e,name:t,amount:s,currency:i,accountDescription:a}={}}=this.summary;return F`
      <payments-mpos-digital-sales-list-card
        ambient="secondary"
        data-acoustic-obfuscate
        amount=${s}
        account-name=${t}
        account-number=${us(e)}
        currency-code=${i}
        description=${this.t(this._i18nKeys[a])}
        language=${this.language}
        local-currency=${i}
      ></payments-mpos-digital-sales-list-card>
    `}render(){var e,t,s;return this.summary&&null!==(e=this.summary)&&void 0!==e&&null!==(t=e.items)&&void 0!==t&&t.length?this._listSimpleTpl:this.summary&&null!==(s=this.summary)&&void 0!==s&&s.accountData?this._listAccountTpl:J}}var mr=W`
:host {
  --_payments-mpos-digital-sales-list-file-type-text-color: ${a("colorPrimaryCtaComplementaryTextDefault",r)};
  --_payments-mpos-digital-sales-list-file-type-icon-color: ${a("colorSecondaryAltFormInputAddIconError",r)};
}
`,_r=W`
:host {
  box-sizing: border-box;
  width: 100%;
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

.text-link {
  color: var(--_payments-mpos-digital-sales-list-file-type-text-color);
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${ee(se.medium.fontWeight)});
}

.size-file {
  font-style: italic;
  padding-left: 1rem;
  padding-bottom: 1rem;
  padding-top: 0.5rem;
}

[data-tag-name=bbva-type-link] {
  padding-left: 1rem;
  display: flex;
  gap: 0.5rem;
}

[data-tag-name=bbva-type-icon] {
  margin-right: 0.5rem;
  float: left;
  fill: var(--_payments-mpos-digital-sales-list-file-type-icon-color);
}
`;class gr extends(n(M)){static get is(){return"payments-mpos-digital-sales-list-file"}static get scopedElements(){const e=[C,u,m];return gr.scopedElementsFromClasses(e)}static get properties(){return{fileName:{type:String,attribute:"file-name"},fileSize:{type:String,attribute:"file-size"}}}constructor(){super(),this.fileName="",this.fileSize=""}static get styles(){return[mr,_r,E.primaryAlt,d.primaryAlt,l.primaryAlt,X(`${gr.is}-shared-styles`)]}_handleFileClick(){this.dispatchEvent(new CustomEvent(`${this.constructor.is}-link-click`,{composed:!0,bubbles:!0}))}render(){return F`
      <bbva-type-link unset @click=${this._handleFileClick}>
        <div>
          <bbva-type-icon icon=${le()} size="24"></bbva-type-icon>
          <bbva-type-text unset size="M" class="text-link" text=${this.fileName}></bbva-type-text>
        </div>
      </bbva-type-link>
      <bbva-type-text unset size="S" class="size-file" text=${this.fileSize}> </bbva-type-text>
    `}}var yr=W`
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

.checkbox-container {
  margin-bottom: 1rem;
}

.fit {
  padding: 0 1rem 0.25rem 1rem;
}
`;class br extends(G(e(t(Y(ga(vi(M))))))){static get is(){return"payments-mpos-digital-sales-terms-and-conditions"}static get scopedElements(){const e=[p,v,De,gr];return br.scopedElementsFromClasses(e)}static get styles(){return[yr,c.primaryAlt,f.primaryAlt,$e.primaryAlt,X("payments-mpos-digital-sales-terms-and-conditions-shared-styles")]}static get defaultI18nKeys(){return{fileSize:"payments-mpos-digital-sales-terms-and-conditions-file-size"}}static get properties(){return{termTypes:{type:Object},_isAllCheckboxesSelected:{type:Boolean}}}constructor(){super(),this.termTypes={},this._isAllCheckboxesSelected=!1,this._checksTermsAndConditions=new Set}_handleTermsAndConditionsFileLinkClick(e){e.stopPropagation(),this._dispatchEvent(`${this.constructor.is}-file-click`,{requestActionName:cs.OPEN_TERMS_AND_CONDITIONS_FILE})}_handleCheckboxChange(e){e.stopPropagation();const{checked:t,value:s}=e.target;t?this._checksTermsAndConditions.add(s):this._checksTermsAndConditions.delete(s),this._isAllCheckboxesSelected=this._totalChecks===this._checksTermsAndConditions.size}_handleContinueClick(){this._dispatchEvent(`${this.constructor.is}-complete`,{requestActionName:cs.COMPLETE_TERMS_AND_CONDITIONS})}get _totalChecks(){var e,t;return null===(e=this.termTypes)||void 0===e||null===(t=e.terms)||void 0===t?void 0:t.length}get _fileName(){var e;return null===(e=this.termTypes)||void 0===e?void 0:e.name}get _listFileTpl(){return F`
      <payments-mpos-digital-sales-list-file
        file-name=${this._fileName}
        file-size=${this.t(this._i18nKeys.fileSize)}
        @payments-mpos-digital-sales-list-file-link-click=${this._handleTermsAndConditionsFileLinkClick}
      >
      </payments-mpos-digital-sales-list-file>
    `}get _checkboxesListTpl(){var e;return F`
      <div class="checkbox-container">
        ${null===(e=this.termTypes.terms)||void 0===e?void 0:e.map(((e,t)=>F`
            ${this._checkboxTpl(e)}
            ${t<this.termTypes.terms.length-1?F`
                  <div class="fit">
                    <bbva-divider-default></bbva-divider-default>
                  </div>
                `:J}
          `))}
      </div>
    `}get _continueButtonTpl(){return F`
      <div class="fit">
        <bbva-button-default
          fullwidth
          variant="primary"
          ?disabled=${!this._isAllCheckboxesSelected}
          @click=${this._handleContinueClick}
        >
          ${this.t(this._i18nKeys.continue)}
        </bbva-button-default>
      </div>
    `}_checkboxTpl(e){return F`
      <bbva-form-checkbox
        label=${e.description}
        value=${e.id}
        @bbva-form-checkbox-input-change=${this._handleCheckboxChange}
      ></bbva-form-checkbox>
    `}render(){return F` ${this._listFileTpl} ${this._checkboxesListTpl} ${this._continueButtonTpl} `}}var vr=W`
:host {
  display: block;
  box-sizing: border-box;
  --bbva-expandable-step-default-content-max-height: auto;
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

.multistep-modal {
  --bbva-help-modal-padding-bottom: 0;
  --bbva-help-modal-padding: 0;
}

[data-tag-name=bbva-header-main] {
  transition: all 0.3s linear;
}

[data-tag-name=bbva-badge-icon] {
  margin-left: 1rem;
  margin-right: 1rem;
}

[slot=confirmation] {
  width: 100%;
  padding-left: 0;
  border: none;
}
`;const fr=[rs.STEP_ORDER_INFO,rs.STEP_INCOME_ACCOUNT,rs.STEP_DELIVERY_ADDRESS,rs.STEP_PAYMENT_ACCOUNT,rs.STEP_TERMS_AND_CONDITIONS],Tr=[rs.STEP_ORDER_INFO,rs.STEP_INCOME_ACCOUNT,rs.STEP_CARD_READER,rs.STEP_DELIVERY_ADDRESS,rs.STEP_PAYMENT_ACCOUNT,rs.STEP_TERMS_AND_CONDITIONS],Sr=[rs.STEP_ORDER_INFO,rs.STEP_INCOME_ACCOUNT,rs.STEP_CARD_READER,rs.STEP_TERMS_AND_CONDITIONS],Er=[rs.STEP_ORDER_INFO,rs.STEP_INCOME_ACCOUNT,rs.STEP_TERMS_AND_CONDITIONS];class Cr extends(G(e(t(Y(ga(ba(vi(_a(M))))))))){static get is(){return"payments-mpos-digital-sales-multistep"}static get scopedElements(){const e=[ke,we,xe,D,i,ir,xa,za,Aa,dr,Ea,ur,br];return Cr.scopedElementsFromClasses(e)}static get styles(){return[vr,Ie.secondary,X("payments-mpos-digital-sales-multistep-shared-styles")]}static get defaultI18nKeys(){const e="payments-mpos-digital-sales-multistep";return{accepted:`${e}-accepted`,cardReader:`${e}-card-reader`,change:`${e}-change`,confirm:`${e}-confirm`,contractingData:`${e}-contracting-data`,deliveryAddress:`${e}-delivery-address`,incomeAccount:`${e}-income-account`,page:`${e}-page`,paymentAccount:`${e}-payment-account`,paymentBills:`${e}-payment-bills`,taxIncluded:`${e}-tax-included`,termsAndConditions:`${e}-terms-and-conditions`,totalAmount:`${e}-total-amount`}}static get properties(){return{accounts:{type:Array},activities:{type:Array},address:{type:Object},cardReaderOptionSelected:{type:String,attribute:"card-reader-option-selected"},categories:{type:Array},contactDetails:{type:Object},currencyCode:{type:String,attribute:"currency-code"},families:{type:Array},imagesUrl:{type:Object},isAddressUnmasked:{type:Boolean,attribute:"is-address-unmasked"},isContactDetailsUnmasked:{type:Boolean,attribute:"is-contact-details-unmasked"},localCurrency:{type:String,attribute:"local-currency"},mposPriceStock:{type:Object},notFoundMcc:{type:String,attribute:"not-found-mcc"},otherAddress:{type:Object},selectedProductFlow:{type:String,attribute:"selected-product-flow"},termTypes:{type:Object},_activeSteps:{type:Array},_completedSteps:{type:Array},_isScrollOnSummary:{type:Boolean},_shouldResetTemplatesBeVisible:{type:Boolean}}}constructor(){super(),this.accounts=[],this.activities=[],this.address={},this.cardReaderOptionSelected="",this.categories=[],this.contactDetails={},this.currencyCode="",this.families=[],this.imagesUrl={},this.isAddressUnmasked=!1,this.isContactDetailsUnmasked=!1,this.localCurrency="",this.mposPriceStock={},this.notFoundMcc="",this.otherAddress={},this.selectedProductFlow="",this.termTypes={},this._activeSteps=Tr,this._isScrollOnSummary=!1,this._shouldResetTemplatesBeVisible=!1}firstUpdated(e){super.firstUpdated(e),this._shouldResetTemplatesBeVisible=!0,this._refExitOrderModal=this.shadowRoot.querySelector('[data-tag-name="payments-mpos-digital-sales-exit-order-modal"]')}updated(e){var t;null===(t=super.updated)||void 0===t||t.call(this,e),e.has("selectedProductFlow")&&this.selectedProductFlow===os.MPOS_TOP_WITHOUT_STOCK&&(this._activeSteps=Er),e.has("selectedProductFlow")&&this.selectedProductFlow===os.MPOS&&(this._activeSteps=fr)}navigateBack(){this._refExitOrderModal.open()}goToNextStep(){this._refExpandableMultistep.currentStep.completeStep(),this._dispatchEvent(`${this.constructor.is}-is-scroll-on-summary`,!0)}async openMultistep(){this.addView({view:this,id:Xt.PAGE_MULTISTEP}),await this.updateComplete,this._refExpandableMultistep=this.shadowRoot.querySelector('[data-tag-name="bbva-expandable-multistep"]')}close(){this._refExitOrderModal.open()}_handleCompleteStep(e){e.stopPropagation();const{stepData:t={},requestActionName:s}=e.detail;Object.keys(t).length&&ls.setState({...t}),this._dispatchEvent(`${this.constructor.is}-complete-step`,{requestActionName:s})}_handleCloseOrder(e){e.stopPropagation(),this._dispatchEvent(`${this.constructor.is}-exit`)}_handleCompleteAllSteps(e){e.stopPropagation(),this.requestUpdate();e.detail&&this._dispatchShowEvent({viewName:rs.STEP_SUMMARY})}_handleCompleteOrder(e){e.stopPropagation(),this._dispatchEvent(`${this.constructor.is}-complete-step`,{requestActionName:cs.COMPLETE_MULTISTEP})}_dispatchShowStepEvent(e){var t;e.stopPropagation();const s=(null===(t=e.detail)||void 0===t?void 0:t.id)??"";s&&this._dispatchShowEvent({viewName:s})}_handleSpecificStepScroll(e){e.stopPropagation();const{completed:t}=e.detail;this._dispatchEvent(`${this.constructor.is}-is-scroll-on-summary`,t)}_handleOptionSelect(e){e.stopPropagation();const{cardReaderOptionSelected:t}=e.detail;t===as.WITH_CARD_READER?this._activeSteps=Tr:this._activeSteps=Sr}async _handleResetSteps(){this._shouldResetTemplatesBeVisible=!1,await this.updateComplete,this._shouldResetTemplatesBeVisible=!0}get _multistepTpl(){return F`
      <bbva-expandable-multistep
        class="scrollable"
        tabindex="0"
        hide-disabled-steps
        .activeSteps=${this._activeSteps}
        @expandable-multistep-all-complete=${this._handleCompleteAllSteps}
        @expandable-multistep-specific-step-scroll=${this._handleSpecificStepScroll}
        @expandable-multistep-current-active-step=${this._dispatchShowStepEvent}
      >
        <div slot="content">
          ${this._orderInfoStepTpl} ${this._incomeAccountStepTpl} ${this._cardReaderStepTpl}
          ${this._deliveryAddressStepTpl} ${this._paymentAccountStepTpl}
          ${this._termsAndConditionsStepTpl}
        </div>
        <div slot="confirmation">${this._confirmationTpl}</div>
      </bbva-expandable-multistep>
    `}get _orderInfoStepTpl(){return F`
      <bbva-expandable-step
        id=${rs.STEP_ORDER_INFO}
        class="animation"
        edit-label=${this.t(this._i18nKeys.change)}
        header=${this.t(this._i18nKeys.contractingData)}
        hide-padding-top
        show-link
      >
        <payments-mpos-digital-sales-order-info
          not-found-mcc=${this.notFoundMcc}
          selected-product-flow=${this.selectedProductFlow}
          .activities=${this.activities}
          .categories=${this.categories}
          .contactDetails=${this.contactDetails}
          .families=${this.families}
          ?has-feature-header-hidden=${this.hasFeatureHeaderHidden}
          ?i-o-s-fixed-header=${this.iOSFixedHeader}
          ?is-contact-details-unmasked=${this.isContactDetailsUnmasked}
          @payments-mpos-digital-sales-order-info-complete=${this._handleCompleteStep}
        ></payments-mpos-digital-sales-order-info>
        <div slot="summary">
          <payments-mpos-digital-sales-step-summary
            .summary=${(e=>{var t,s,i,a,r,n,o,c,l,d,h,p,u,m,_,g,y;if(null==e||!e.orderInfo||!Object.keys(e.orderInfo).length)return{};const b=null==e||null===(t=e.orderInfo)||void 0===t||null===(s=t.contactDetails)||void 0===s?void 0:s.email,v=null==e||null===(i=e.orderInfo)||void 0===i||null===(a=i.contactDetails)||void 0===a?void 0:a.mobile,f=null==e||null===(r=e.orderInfo)||void 0===r||null===(n=r.commercialData)||void 0===n?void 0:n.commercialName,T=null==e||null===(o=e.orderInfo)||void 0===o||null===(c=o.commercialData)||void 0===c?void 0:c.commercialDescription,S=null==e||null===(l=e.orderInfo)||void 0===l||null===(d=l.commercialData)||void 0===d||null===(h=d.activity)||void 0===h?void 0:h.value,E=null==e||null===(p=e.orderInfo)||void 0===p||null===(u=p.commercialData)||void 0===u||null===(m=u.category)||void 0===m?void 0:m.value,C=null==e||null===(_=e.orderInfo)||void 0===_||null===(g=_.commercialData)||void 0===g||null===(y=g.subcategory)||void 0===y?void 0:y.value;return{items:[{id:"mail",label:{name:"email"},description:b,isDescriptionItalic:!0},{id:"phone",label:{name:"contactPhoneNumber"},description:v,isDescriptionItalic:!0},{id:"name",label:{name:"comercialName"},description:f},{id:"description",label:{name:"comercialDescription"},description:T},{id:"family",label:{name:"activityType"},description:S},{id:"category",label:{name:"category"},description:E},...C?[{id:"subcategory",label:{name:"subcategory"},description:C}]:[]]}})(ls.getState())}
          ></payments-mpos-digital-sales-step-summary>
        </div>
      </bbva-expandable-step>
    `}get _incomeAccountStepTpl(){return F`
      <bbva-expandable-step
        id=${rs.STEP_INCOME_ACCOUNT}
        class="animation"
        edit-label=${this.t(this._i18nKeys.change)}
        header=${this.t(this._i18nKeys.incomeAccount)}
        hide-padding-left
        hide-padding-right
        hide-padding-top
        show-link
      >
        <payments-mpos-digital-sales-financial-accounts
          language=${this.language}
          type=${Ht.INCOME}
          .accounts=${this.accounts}
          ?has-feature-header-hidden=${this.hasFeatureHeaderHidden}
          @payments-mpos-digital-sales-financial-accounts-complete=${this._handleCompleteStep}
        ></payments-mpos-digital-sales-financial-accounts>
        <div slot="summary">
          <payments-mpos-digital-sales-step-summary
            language=${this.language}
            .summary=${e=ls.getState(),fs(e,Ht.INCOME)}
          ></payments-mpos-digital-sales-step-summary>
        </div>
      </bbva-expandable-step>
    `;var e}get _cardReaderStepTpl(){return F`
      <bbva-expandable-step
        id=${rs.STEP_CARD_READER}
        class="animation"
        edit-label=${this.t(this._i18nKeys.change)}
        header=${this.t(this._i18nKeys.cardReader)}
        hide-padding-left
        hide-padding-right
        hide-padding-top
        is-dynamic-handler
        show-link
      >
        <payments-mpos-digital-sales-card-reader
          card-reader-option-selected=${this.cardReaderOptionSelected}
          selected-product-flow=${this.selectedProductFlow}
          .imagesUrl=${this.imagesUrl}
          .mposPriceStock=${this.mposPriceStock}
          ?has-feature-header-hidden=${this.hasFeatureHeaderHidden}
          ?i-o-s-fixed-header=${this.iOSFixedHeader}
          @payments-mpos-digital-sales-card-reader-option-select=${this._handleOptionSelect}
          @payments-mpos-digital-sales-card-reader-steps-reset=${this._handleResetSteps}
          @payments-mpos-digital-sales-card-reader-complete=${this._handleCompleteStep}
        ></payments-mpos-digital-sales-card-reader>
        <div slot="summary">
          <payments-mpos-digital-sales-step-summary
            .summary=${(e=>{var t,s;if(null==e||!e.cardReader||!Object.keys(e.cardReader).length)return{};const i=null==e||null===(t=e.cardReader)||void 0===t?void 0:t.cardReaderOptionSelected,a=null==e||null===(s=e.cardReader)||void 0===s?void 0:s.priceReader;return{items:[{id:"cardReader",...i===as.WITHOUT_CARD_READER?{label:{name:"withoutCardReader"}}:{label:{name:"withCardReader"}}},...i===as.WITH_CARD_READER?[{id:"notificationHelp",label:{name:"priceReader",params:{amount:a}}}]:[]],requireHoznPadding:!0}})(ls.getState())}
          ></payments-mpos-digital-sales-step-summary>
        </div>
      </bbva-expandable-step>
    `}get _deliveryAddressStepTpl(){return F`
      <bbva-expandable-step
        id=${rs.STEP_DELIVERY_ADDRESS}
        class="animation"
        edit-label=${this.t(this._i18nKeys.change)}
        header=${this.t(this._i18nKeys.deliveryAddress)}
        hide-padding-left
        hide-padding-right
        hide-padding-top
        show-link
      >
        ${this._shouldResetTemplatesBeVisible?F`
              <payments-mpos-digital-sales-delivery-address
                .address=${this.address}
                .deliveryAddressToStore=${this.deliveryAddressToStore}
                .otherAddress=${this.otherAddress}
                ?has-feature-header-hidden=${this.hasFeatureHeaderHidden}
                ?i-o-s-fixed-header=${this.iOSFixedHeader}
                ?is-address-unmasked=${this.isAddressUnmasked}
                @payments-mpos-digital-sales-delivery-address-complete=${this._handleCompleteStep}
              ></payments-mpos-digital-sales-delivery-address>
              <div slot="summary">
                <payments-mpos-digital-sales-step-summary
                  .summary=${(e=>{var t,s;if(null==e||!e.deliveryAddress||!Object.keys(e.deliveryAddress).length)return{};const i=null==e||null===(t=e.deliveryAddress)||void 0===t?void 0:t.addressType;return{items:[{id:"address",label:{name:`${i}-address`},description:null==e||null===(s=e.deliveryAddress)||void 0===s?void 0:s.addressName,isDescriptionItalic:i===Lt.MAIN},{id:"shipping",label:{name:"freeShipping"}}],requireHoznPadding:!0}})(ls.getState())}
                ></payments-mpos-digital-sales-step-summary>
              </div>
            `:J}
      </bbva-expandable-step>
    `}get _paymentAccountStepTpl(){var e,t;return F`
      <bbva-expandable-step
        id=${rs.STEP_PAYMENT_ACCOUNT}
        class="animation"
        edit-label=${this.t(this._i18nKeys.change)}
        header=${this.t(this._i18nKeys.paymentAccount)}
        hide-padding-left
        hide-padding-right
        hide-padding-top
        show-link
      >
        ${this._shouldResetTemplatesBeVisible?F`
              <payments-mpos-digital-sales-financial-accounts
                language=${this.language}
                price-reader=${null===(e=this.mposPriceStock)||void 0===e?void 0:e.unitPrice}
                type=${Ht.PAYMENT}
                .accounts=${this.accounts}
                ?has-feature-header-hidden=${this.hasFeatureHeaderHidden}
                @payments-mpos-digital-sales-financial-accounts-complete=${this._handleCompleteStep}
              ></payments-mpos-digital-sales-financial-accounts>
              <div slot="summary">
                <payments-mpos-digital-sales-step-summary
                  language=${this.language}
                  .summary=${t=ls.getState(),fs(t,Ht.PAYMENT)}
                ></payments-mpos-digital-sales-step-summary>
              </div>
            `:J}
      </bbva-expandable-step>
    `}get _termsAndConditionsStepTpl(){return F`
      <bbva-expandable-step
        id=${rs.STEP_TERMS_AND_CONDITIONS}
        class="animation"
        edit-label=${this.t(this._i18nKeys.change)}
        header=${this.t(this._i18nKeys.termsAndConditions)}
        hide-padding-left
        hide-padding-right
        hide-padding-top
        show-link
      >
        ${this._shouldResetTemplatesBeVisible?F`
              <payments-mpos-digital-sales-terms-and-conditions
                .termTypes=${this.termTypes}
                @payments-mpos-digital-sales-terms-and-conditions-complete=${this._handleCompleteStep}
              >
              </payments-mpos-digital-sales-terms-and-conditions>
              <div slot="summary">
                <bbva-badge-icon status="checked" description=${this.t(this._i18nKeys.accepted)}>
                </bbva-badge-icon>
              </div>
            `:J}
      </bbva-expandable-step>
    `}get _confirmationTpl(){var e;return F`
      <payments-mpos-digital-sales-panel-button
        amount=${null===(e=this.mposPriceStock)||void 0===e?void 0:e.unitPrice}
        button-positive
        button-text=${this.t(this._i18nKeys.confirm)}
        currency-code=${this.currencyCode}
        description=${this.t(this._i18nKeys.taxIncluded)}
        label=${this.t(this._i18nKeys.totalAmount)}
        language=${this.language}
        local-currency=${this.localCurrency}
        ?show-all-content=${this.isMposTopWithCardReaderFlow||this.isMposFlow}
        @payments-mpos-digital-sales-panel-button-default-button-click=${this._handleCompleteOrder}
      ></payments-mpos-digital-sales-panel-button>
    `}get _exitOrderModalTpl(){return F`
      <payments-mpos-digital-sales-exit-order-modal
        ?has-feature-header-hidden=${this.hasFeatureHeaderHidden}
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        @payments-mpos-digital-sales-exit-order-modal-footer-button-click=${this._handleCloseOrder}
      >
      </payments-mpos-digital-sales-exit-order-modal>
    `}render(){return F`${this._multistepTpl} ${this._exitOrderModalTpl}`}}var Ar=W`
:host {
  display: flex;
  box-sizing: border-box;
  flex-direction: column;
  height: calc(100vh - 3.5625rem);
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}

.container {
  display: flex;
  flex-direction: column;
  flex: 1;
  justify-content: space-between;
}

.button-container {
  padding: 1rem;
}
`;class Rr extends(G(e(t(Y(ga(ba(vi(_a(M))))))))){static get is(){return"payments-mpos-digital-sales-mpos-price-stock-error-alert"}static get scopedElements(){const e=[p,$a];return Rr.scopedElementsFromClasses(e)}static get styles(){return[Ar,c.primaryAlt,X("payments-mpos-digital-sales-mpos-price-stock-error-alert-shared-styles")]}static get defaultI18nKeys(){const e="payments-mpos-digital-sales-mpos-price-stock-error-alert";return{accessibilityMicroillustration:`${e}-accessibility-microillustration`,altImage:`${e}-alt-image`,buttonCall:`${e}-button-call`,buttonRetry:`${e}-button-retry`,noRetry:`${e}-no-retry`,retry:`${e}-retry`,stock:`${e}-stock`,title:`${e}-title`,titleStock:`${e}-title-stock`}}static get properties(){return{typeError:{type:String,attribute:"type-error"},_hasNavigatedBack:{type:Boolean},_maxRetries:{type:Number},_numRetry:{type:Number}}}constructor(){super(),this.typeError="",this._hasNavigatedBack=!1,this._maxRetries=3,this._numRetry=0}updated(e){var t;null===(t=super.updated)||void 0===t||t.call(this,e),this._hasNavigatedBack||this.addView({id:Xt.ALERT_MPOS_PRICE_STOCK,view:this})}navigateBack(){this._hasNavigatedBack=!0,this._dispatchNavigationExternal("back-step"),this.closeView(Xt.ALERT_MPOS_PRICE_STOCK)}_handleCall(){this._dispatchPublicEvent("advisor-contact")}_handleRetry(){this._numRetry+=1,this._dispatchEvent(`${this.constructor.is}-retry`,{requestActionName:cs.RETRY_MPOS_PRICE_STOCK}),this._numRetry===this._maxRetries&&this._dispatchShowEvent({viewName:rs.ALERT_MPOS_PRICE_STOCK})}get _isInsufficientStock(){return this.typeError===Ut.INSUFFICIENT_STOCK}get _isMaxRetry(){return this._numRetry<this._maxRetries}get _panelInfoTpl(){let e;return e=this._isInsufficientStock?this.t(this._i18nKeys.stock):this._isMaxRetry?this.t(this._i18nKeys.retry):this.t(this._i18nKeys.noRetry),F`
      <payments-mpos-digital-sales-panel-info
        alt-image=${this.t(this._i18nKeys.altImage)}
        title=${this._isInsufficientStock?this.t(this._i18nKeys.titleStock):this.t(this._i18nKeys.title)}
        description=${e}
        title-size="3XL"
        microillustration="error"
        size-microillustration="M"
        img-accessibility-text=${this.t(this._i18nKeys.accessibilityMicroillustration)}
      >
      </payments-mpos-digital-sales-panel-info>
    `}get _buttonDefaultTpl(){const e=!this._isInsufficientStock&&this._isMaxRetry,t=e?this._handleRetry:this._handleCall,s=this.t(this._i18nKeys[e?"buttonRetry":"buttonCall"]),i="bbva-button-default-"+(this._isInsufficientStock?"call":"retry");return F`
      <div class="button-container">
        <bbva-button-default data-selector=${i} fullwidth @click=${t}>
          ${s}
        </bbva-button-default>
      </div>
    `}render(){return F` <div class="container">${this._panelInfoTpl} ${this._buttonDefaultTpl}</div> `}}var Or=W`
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

.modal-info-commissions {
  --bbva-help-modal-padding: 0 1rem;
}
.modal-info-commissions [data-tag-name=bbva-list-bullet] {
  padding-left: 0;
}
.modal-info-commissions [data-tag-name=bbva-list-bullet]:first-child {
  padding-top: 1rem;
}
.modal-info-commissions .title {
  font-weight: var(--fontFacePrimaryBoldFontWeight, ${ee(se.bold.fontWeight)});
  margin: 0.75rem 0 0.5rem 0;
}
.modal-info-commissions .offer {
  padding-top: 1rem;
}
.modal-info-commissions .condition {
  padding-bottom: 0.5rem;
}
`;class Pr extends(G(e(t(Y(ga(ba(vi(_a(M))))))))){static get is(){return"payments-mpos-digital-sales-commissions-details-modal"}static get scopedElements(){const e=[i,Pe,m,$a];return Pr.scopedElementsFromClasses(e)}static get styles(){return[Or,Oe.primaryAlt,l.primaryAlt,X("payments-mpos-digital-sales-commissions-details-modal-shared-styles")]}static get defaultI18nKeys(){return{header:"payments-mpos-digital-sales-commissions-details-modal-header"}}static get properties(){return{commissionsData:{type:Object},commissionPercentage:{type:String},_isModalVisible:{type:Boolean}}}constructor(){super(),this._isModalVisible=!1,this.commissionsData={},this.commissionPercentage=""}navigateBack(){this._close()}open(){this._isModalVisible=!0,this.addView({id:Xt.MODAL_COMMISSIONS_DETAILS,view:this})}_close(){this._isModalVisible=!1,this.closeView(Xt.MODAL_COMMISSIONS_DETAILS)}_handleCloseClick(e){e.stopPropagation(),this._close()}_handleTransitionend(e){e.stopPropagation();const{detail:{propertyName:t,visible:s}}=e;"transform"===t&&s&&this._dispatchShowEvent({viewName:rs.MODAL_COMMISSIONS_DETAILS})}_handleHeaderIconClick(e){e.stopPropagation()}get _bulletsTpl(){var e;if(null===(e=this.commissionsData)||void 0===e||!e.bulletsCommissions)return J;return F`${this.commissionsData.bulletsCommissions.map((e=>F`<bbva-list-bullet
        text=${e.replaceAll("X.XX",this.commissionPercentage)}
      ></bbva-list-bullet>`))}`}get _detailTpl(){var e;if(null===(e=this.commissionsData)||void 0===e||!e.detailMSI)return J;return F`
      <bbva-type-text
        class="title"
        size="S"
        .text=${this.commissionsData.titleMSI}
      ></bbva-type-text>
      <bbva-type-text .text=${this.commissionsData.msiCommissions} size="S"> </bbva-type-text>

      ${this.commissionsData.detailMSI.map((e=>F`<div class="offer">${e.offer}</div>
        <div class="condition">${e.condition}</div>`))}
    `}render(){var e,t;return F`
      <bbva-help-modal
        accessibility-text-icon-right-primary=${this.t(this._i18nKeys.closeIcon)}
        class="modal-info-commissions"
        data-selector="bbva-help-modal-commissions-details"
        full-height
        header-text=${this.hasFeatureHeaderHidden?"":this.t(this._i18nKeys.header)}
        header-type=${is.MODAL_SEQUENTIAL}
        title-icon="bbva:help"
        title-lines="2"
        title-text=${(null===(e=this.commissionsData)||void 0===e?void 0:e.titleCommissions)??""}
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        ?visible=${this._isModalVisible}
        @help-modal-header-click=${this._handleCloseClick}
        @help-modal-transitionend=${this._handleTransitionend}
        @help-modal-veil-click=${this._handleCloseClick}
        @header-main-icon-click=${this._handleHeaderIconClick}
      >
        <div slot="slot-content">
          ${this.t((null===(t=this.commissionsData)||void 0===t?void 0:t.textCommissions)??"")} ${this._bulletsTpl}
          ${this._detailTpl}
        </div>
      </bbva-help-modal>
    `}}var $r=W`
:host {
  display: block;
  box-sizing: border-box;
  margin-bottom: 0.0625rem;
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

[data-tag-name=bbva-header-category] {
  padding-top: 0.5rem;
  padding-bottom: 0.75rem;
}

[data-tag-name=bbva-type-text] {
  padding-left: 3rem;
  padding-bottom: 0.5rem;
}

[data-tag-name=bbva-type-link] {
  padding-left: 1rem;
  padding-bottom: 0.25rem;
}

[data-tag-name=bbva-list-bullet] + [data-tag-name=bbva-type-link] {
  margin-bottom: 0.25rem;
}

.description-container {
  padding: 0 1rem 1rem 1rem;
}
.description-container [data-tag-name=bbva-list-bullet] {
  padding: 0;
  margin-bottom: 0.25rem;
}
.description-container [data-tag-name=bbva-type-text],
.description-container [data-tag-name=bbva-type-link],
.description-container [data-tag-name=bbva-notification-help] {
  padding: 0;
  margin-bottom: 0.5rem;
}

[data-tag-name=payments-mpos-digital-sales-panel-detail][loading] {
  display: none;
}

[data-tag-name=bbva-header-category][loading] {
  background-size: 215px 18px, 133px 18px;
  mask-position: 0 12px, calc(100% - 0px) 12px;
  background-position: -9px 12px, calc(100% - 1px) 12px;
}

[data-tag-name=bbva-list-bullet][loading] {
  background-position: 0 0.5rem, 1.875rem 0.5rem;
  mask-position: 0 0.75rem, 1.5rem 0.75rem;
}

.fit {
  padding: 0 1rem;
}

.category {
  padding-bottom: 1.5rem;
}
.category > [data-tag-name=bbva-type-link]:last-child {
  margin-bottom: 0;
}
`;class Dr extends(G(e(t(Y(ga(ba(vi(_a(M))))))))){static get is(){return"payments-mpos-digital-sales-offer"}static get scopedElements(){const e=[$,Pe,S,u,m,Pr,Rr,Ea,$a,ka];return Dr.scopedElementsFromClasses(e)}static get styles(){return[$r,P.primaryAlt,Oe.primaryAlt,d.primaryAlt,l.primaryAlt,T.primaryAlt,X("payments-mpos-digital-sales-offer-shared-styles")]}static get defaultI18nKeys(){const e="payments-mpos-digital-sales-offer";return{addPaymentMethod:`${e}-add-payment-method`,altImage:`${e}-alt-image`,atAnotherTime:`${e}-at-another-time`,cardReader:`${e}-card-reader`,cardReaderDescription:`${e}-card-reader-description`,contactAnAdvisor:`${e}-contact-an-advisor`,costAndCommissions:`${e}-cost-and-commissions`,costPerCommissionMposOne:`${e}-cost-per-comision-mpos-one`,costPerCommissionOne:`${e}-cost-per-comision-one`,costPerCommissionTwo:`${e}-cost-per-comision-two`,costPerCommissionTopOne:`${e}-cost-per-comision-top-one`,description:`${e}-description`,descriptionTop:`${e}-description-top`,generateLinks:`${e}-generate-links`,headerTop:`${e}-header-top`,insufficientStock:`${e}-insufficient-stock`,linkPayment:`${e}-link-payment`,linkPaymentDescription:`${e}-link-payment-description`,listBenefitsOne:`${e}-list-benefits-one`,listBenefitsThree:`${e}-list-benefits-three`,listBenefitsTopOne:`${e}-list-benefits-top-one`,listBenefitsTopTwo:`${e}-list-benefits-top-two`,listBenefitsTwo:`${e}-list-benefits-two`,listConsiderationTopOne:`${e}-list-consideration-top-one`,listConsiderationTopThree:`${e}-list-consideration-top-three`,listConsiderationTopTwo:`${e}-list-consideration-top-two`,mobilePayment:`${e}-mobile-payment`,mobilePaymentDescription:`${e}-mobile-payment-description`,moreInfoCommissions:`${e}-more-info-commissions`,moreInfoReader:`${e}-more-info-reader`,paymentAreaAccessibilityMicroillustration:`${e}-payment-area-accessibility-microillustration`,paymentMethods:`${e}-payment-methods`,uniqueCost:`${e}-unique-cost`}}static get properties(){return{commissionsData:{type:Object},isLoading:{type:Boolean,attribute:"is-loading"},imagesUrl:{type:Object},localCurrency:{type:String,attribute:"local-currency"},mposPriceStock:{type:Object},mposPriceStockErrorType:{type:String,attribute:"mpos-price-stock-error-type"},_hasNavigatedBack:{type:Boolean},_isPaymentMethodsDetailsModalVisible:{type:Boolean}}}constructor(){super(),this.commissionsData={},this.isLoading=!1,this.imagesUrl={},this.localCurrency="",this.mposPriceStock={},this.mposPriceStockErrorType="",this._hasNavigatedBack=!1,this._isPaymentMethodsDetailsModalVisible=!1}updated(e){var t;null===(t=super.updated)||void 0===t||t.call(this,e),e.has("mposPriceStockErrorType")&&this.mposPriceStockErrorType===Ut.INSUFFICIENT_STOCK&&this._dispatchShowEvent({viewName:rs.ALERT_MPOS_PRICE_INSUFFICIENT_STOCK}),!e.has("isLoading")||this.isLoading||this.mposPriceStockErrorType||this._hasNavigatedBack||(this.addView({id:Xt.PAGE_OFFER,view:this}),this._dispatchShowEvent({viewName:rs.PAGE_OFFER}))}firstUpdated(){super.firstUpdated(),this._refCommissionsDetailsModal=this.shadowRoot.querySelector("[data-tag-name=payments-mpos-digital-sales-commissions-details-modal]")}navigateBack(){this._hasNavigatedBack=!0,this._dispatchNavigationExternal("back-step"),this.closeView(Xt.PAGE_OFFER)}close(){this._dispatchNavigationExternal("back-step"),this.closeView(Xt.PAGE_OFFER)}async _openPaymentMethodsDetailsModal(){this._isPaymentMethodsDetailsModalVisible=!0,await this.updateComplete,this._refPaymentMethodsDetailsModal=this.shadowRoot.querySelector("[data-tag-name=payments-mpos-digital-sales-payment-methods-details-modal]"),await this.updateComplete,this._refPaymentMethodsDetailsModal.open()}_handlePaymentMethodsDetailsLinkClick(){this._dispatchActionEvent({viewName:rs.PAGE_OFFER,action:ns.CLICK_PAYMENT_METHODS_DETAILS_LINK}),this._openPaymentMethodsDetailsModal()}_handleCommissionsDetailsLinkClick(){this._dispatchActionEvent({viewName:rs.PAGE_OFFER,action:ns.CLICK_COMMISSIONS_DETAILS_LINK}),this._dispatchEvent(`${this.constructor.is}-commissions-open`,{requestActionName:cs.OPEN_COMMISSIONS_DETAILS_MODAL}),this._refCommissionsDetailsModal.open()}_handleStartOrder(e){e.stopPropagation(),this._dispatchEvent(`${this.constructor.is}-order-start`,{requestActionName:cs.COMPLETE_OFFER}),this._dispatchActionEvent({viewName:rs.PAGE_OFFER,action:ns.CLICK_START_ORDER_BUTTON})}_handleContactAnAdvisor(e){e.stopPropagation(),this.isTopFlow?this._dispatchNavigationExternal("back-step"):(this._dispatchActionEvent({viewName:rs.PAGE_OFFER,action:ns.CLICK_ASK_FOR_ADVICE_LINK}),this._dispatchPublicEvent("advisor-contact"))}_generateCategoryBullets(e,t){const s=({textKey:e,textParams:t})=>F`<bbva-list-bullet
        text=${this.t(this._i18nKeys[e],t)}
        ?loading=${this.isLoading}
      ></bbva-list-bullet>`,i=({textKey:e,textParams:t})=>F`<bbva-type-text
        class="bullet-description"
        unset
        size="S"
        text=${this.t(this._i18nKeys[e],t)}
        ?loading=${this.isLoading}
      ></bbva-type-text> `,a=({textKey:e,textParams:t})=>F`<bbva-notification-help
        variant="warning"
        text=${this.t(this._i18nKeys[e],t)}
        ?loading=${this.isLoading}
      ></bbva-notification-help>`,r=({textKey:e,textParams:t,onClick:s})=>{return F`<bbva-type-link
        aria-label=${this.t(this._i18nKeys[e],t)}
        data-selector="bbva-link-${i=e,i.replace(/\s+/g,"-").replace(/([a-z])([A-Z])/g,"$1-$2").toLowerCase()}"
        ?loading=${this.isLoading}
        @click=${s}
        >${this.t(this._i18nKeys[e],t)}
      </bbva-type-link>`;var i};return F`<div class="category">
      <bbva-header-category
        heading-level="2"
        text=${this.t(this._i18nKeys[e])}
        ?loading=${this.isLoading}
      ></bbva-header-category>
      ${t.map((({bullet:e,notification:t,bulletDescription:n,bulletLink:o})=>F`
          ${e?s(e):J}
          ${n?i(n):J}
          ${t?a(t):J}
          ${o?r(o):J}
        `))}
    </div>`}get _panelActionsTpl(){const e=this._i18nKeys[this.isTopFlow?"addPaymentMethod":"continue"],t=this._i18nKeys[this.isTopFlow?"atAnotherTime":"contactAnAdvisor"];return F`
      <payments-mpos-digital-sales-panel-button
        button-text=${this.t(e)}
        link-text=${this.t(t)}
        sticky
        show-all-content
        ?loading=${this.isLoading}
        @payments-mpos-digital-sales-panel-button-default-button-click=${this._handleStartOrder}
        @payments-mpos-digital-sales-panel-button-link-click=${this._handleContactAnAdvisor}
      ></payments-mpos-digital-sales-panel-button>
    `}get _paymentMethodsTpl(){const e={bullet:{textKey:"cardReader"},bulletDescription:{textKey:"cardReaderDescription"},...this.isMposTopWithoutStockFlow&&{notification:{textKey:"insufficientStock"}}},t={bullet:{textKey:"linkPayment"},bulletDescription:{textKey:"linkPaymentDescription"},bulletLink:{textKey:"moreInfoReader",onClick:this._handlePaymentMethodsDetailsLinkClick}},s=this.isMposFlow?[e,t]:[{bullet:{textKey:"mobilePayment"},bulletDescription:{textKey:"mobilePaymentDescription"}},e,t];return F`${this._generateCategoryBullets("paymentMethods",s)} `}get _benefitsTpl(){const e=this.isTopFlow?[{bullet:{textKey:"listBenefitsTopOne"}},{bullet:{textKey:"listBenefitsTopTwo"},bulletLink:{textKey:"moreInfoReader",onClick:this._handlePaymentMethodsDetailsLinkClick}}]:[{bullet:{textKey:"listBenefitsOne"}},{bullet:{textKey:"listBenefitsTwo"}},{bullet:{textKey:"listBenefitsThree"}}];return F`${this._generateCategoryBullets("benefits",e)} `}_bulletCostPerCommission(){return this.isTopFlow?"costPerCommissionTopOne":this.isMposFlow?"costPerCommissionMposOne":"costPerCommissionOne"}get _costAndCommissionsTpl(){const e=(e,t)=>t?e:{},{percentage:t,unitPrice:s}=this.mposPriceStock,i={bullet:{textKey:this._bulletCostPerCommission(),textParams:{percentage:t}}},a={bullet:{textKey:"costPerCommissionTwo",textParams:{percentage:t}}},r={bulletLink:{textKey:"moreInfoCommissions",onClick:this._handleCommissionsDetailsLinkClick}},n={bullet:{textKey:"uniqueCost",textParams:{unitPrice:s}}},o=e(a,t),c=e(n,s),l={bullet:{textKey:"generateLinks"}};let d;return d=this.isMposTopFlow?[i,o,r,l]:this.isMposFlow?[i,r,c,l]:[i,o,r],F`${this._generateCategoryBullets("costAndCommissions",d)} `}get _considerationsTpl(){return F`${this._generateCategoryBullets("considerations",[{bullet:{textKey:"listConsiderationTopOne"}},{bullet:{textKey:"listConsiderationTopTwo"}},{bullet:{textKey:"listConsiderationTopThree"}}])} `}get _paymentMethodsDetailsModalTpl(){return F`
      <payments-mpos-digital-sales-payment-methods-details-modal
        selected-product-flow=${this.selectedProductFlow}
        .imagesUrl=${this.imagesUrl}
        .mposPriceStock=${this.mposPriceStock}
        ?has-feature-header-hidden=${this.hasFeatureHeaderHidden}
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        ?is-mpos-top-without-stock-flow=${this.isMposTopWithoutStockFlow}
      >
      </payments-mpos-digital-sales-payment-methods-details-modal>
    `}get _panelContainerTpl(){const e=this._i18nKeys[this.isTopFlow?"descriptionTop":"description"];return F`
      <payments-mpos-digital-sales-panel-info
        alt-image=${this.t(this._i18nKeys.altImage)}
        title=${this._i18nKeys[this.isTopFlow?"headerTop":"paymentZone"]}
        description=${this.t(e)}
        title-size="3XL"
        microillustration="${this.isTopFlow?"safe_tap":"digital_cashing_dollar"}"
        size-microillustration="M"
        img-accessibility-text=${this.t(this._i18nKeys.paymentAreaAccessibilityMicroillustration)}
        ?loading=${this.isLoading}
      ></payments-mpos-digital-sales-panel-info>
    `}get _commissionsDetailsModalTpl(){return F`
      <payments-mpos-digital-sales-commissions-details-modal
        commissionPercentage=${this.mposPriceStock.percentage}
        selected-product-flow=${this.selectedProductFlow}
        .commissionsData=${this.commissionsData}
        ?has-feature-header-hidden=${this.hasFeatureHeaderHidden}
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
      ></payments-mpos-digital-sales-commissions-details-modal>
    `}get _errorMposPriceTpl(){return F`
      <payments-mpos-digital-sales-mpos-price-stock-error-alert
        selected-product-flow=${this.selectedProductFlow}
        type-error=${this.mposPriceStockErrorType}
      >
      </payments-mpos-digital-sales-mpos-price-stock-error-alert>
    `}get _offerPageTpl(){return F`
      <div>
        ${this._isPaymentMethodsDetailsModalVisible?this._paymentMethodsDetailsModalTpl:J}
        ${this._commissionsDetailsModalTpl} ${this._panelContainerTpl}
        <div class="description-container">
          ${this.isTopFlow?J:this._paymentMethodsTpl} ${this._benefitsTpl}
          ${this._costAndCommissionsTpl} ${this.isTopFlow?this._considerationsTpl:J}
        </div>
        ${this._panelActionsTpl}
      </div>
    `}render(){return F` ${this.mposPriceStockErrorType?this._errorMposPriceTpl:this._offerPageTpl} `}}var Ir=W`
:host {
  box-sizing: border-box;
  width: 100%;
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

.panel-process-container {
  padding: 1.5rem 1rem;
}
.panel-process-container [data-tag-name=bbva-clip-microillustration] {
  margin-bottom: 0.5rem;
}
.panel-process-container [data-tag-name=bbva-type-text] {
  margin-bottom: 1rem;
}
.panel-process-container .title {
  margin-bottom: 1.5rem;
}
.panel-process-container .subtitle {
  margin-bottom: 0.5rem;
}
.panel-process-container [data-tag-name=bbva-type-amount] {
  margin-bottom: 0.5rem;
}
.panel-process-container [data-tag-name=bbva-type-link] {
  margin-top: 1rem;
}
`;class kr extends(n(oe(M))){static get is(){return"payments-mpos-digital-sales-panel-process"}static get scopedElements(){const e=[b,u,m,h];return kr.scopedElementsFromClasses(e)}static get properties(){return{altImage:{type:String,attribute:"alt-image"},description:{type:String},link:{type:String},subtitle:{type:String},title:{type:String}}}constructor(){super(),this.altImage="",this.amount=0,this.description="",this.link="",this.subtitle="",this.title=""}static get styles(){return[Ir,g.primaryAlt,d.primaryAlt,l.primaryAlt,o.primaryAlt,X(`${kr.is}-shared-styles`)]}_clickLinkPanelProcess(){this.dispatchEvent(new CustomEvent(`${this.constructor.is}-click-link`,{composed:!0,bubbles:!0}))}get titleTpl(){return this.title?F` <bbva-type-text
          class="title"
          unset
          size="3XL"
          text=${this.title}
          font-weight="700"
        ></bbva-type-text>`:J}get _subtitleTpl(){return this.subtitle?F`<bbva-type-text class="subtitle" unset text=${this.subtitle}></bbva-type-text>`:J}get _amountTpl(){return this.amount?F`<bbva-type-amount
          amount=${this.amount}
          currency-code=${this.currencyCode}
          language=${this.language}
          local-currency=${this.localCurrency}
          type="bold"
          variant="xl"
        >
        </bbva-type-amount>`:J}get _descriptionTpl(){return this.description?F`<bbva-type-text class="description" unset text=${this.description}></bbva-type-text>`:J}get _linkTpl(){return this.link?F`<bbva-type-link
          unset
          text=${this.link}
          @click=${this._clickLinkPanelProcess}
        ></bbva-type-link>`:J}render(){return F`
      <div class="panel-process-container">
        <bbva-clip-microillustration
          alt-image=${this.altImage}
          alt-microillustration="success"
        ></bbva-clip-microillustration>
        ${this.titleTpl} ${this._subtitleTpl} ${this._amountTpl} ${this._descriptionTpl}
        ${this._linkTpl}
      </div>
    `}}var wr=W`
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

[data-tag-name=bbva-header-category] {
  margin-top: 1rem;
  padding: 0.5rem 1rem;
}

[data-tag-name=bbva-notification-help] {
  padding: 0.5rem 1rem;
}

[data-tag-name=payments-mpos-digital-sales-list-simple] {
  --payments-mpos-digital-sales-list-simple-description-text-font-weight: var(--fontFacePrimaryMediumItalicFontWeight, ${ee(se.mediumItalic.fontWeight)});
}

[data-tag-name=bbva-notification-message] {
  margin: 1rem;
  --bbva-notification-message-paragraph-weight: var(--fontFacePrimaryMediumFontWeight, ${ee(se.medium.fontWeight)});
}

[data-tag-name=bbva-button-row] {
  margin-top: 1.5rem;
  margin-bottom: 1.5rem;
}
`;class xr extends(G(e(t(Y(ga(ba(vi(_a(M))))))))){static get is(){return"payments-mpos-digital-sales-thank-you"}static get scopedElements(){const e=[k,$,S,A,La,kr];return xr.scopedElementsFromClasses(e)}static get styles(){return[wr,I.primaryAlt,P.primaryAlt,T.primaryAlt,X("thank-you-shared-styles")]}static get defaultI18nKeys(){const e="payments-mpos-digital-sales-thank-you";return{agreement:`${e}-agreement`,altImage:`${e}-alt-image`,amountWithCardReader:`${e}-amount-with-card-reader`,availableActions:`${e}-available-actions`,comercialDescription:`${e}-comercial-description`,comercialName:`${e}-comercial-name`,contractingData:`${e}-contracting-data`,date:`${e}-date`,deliveryAddress:`${e}-delivery-address`,deliveryAddressInfo:`${e}-delivery-address-info`,descriptionCompleted:`${e}-description-completed`,descriptionCompletedWithoutCardReader:`${e}-description-completed-without-card-reader`,descriptionWait:`${e}-description-wait`,financial:`${e}-financial`,guide:`${e}-guide`,goToPaymentArea:`${e}-go-to-payment-area`,incomeAccount:`${e}-income-account`,mposLink:`${e}-mpos-link`,notificationEmailTitle:`${e}-notification-email-title`,notificationEmailWithoutCardReaderTitle:`${e}-notification-email-without-card-reader-title`,operationType:`${e}-operation-type`,paper:`${e}-paper`,paymentData:`${e}-payment-data`,paymentAccount:`${e}-payment-account`,reference:`${e}-reference`,share:`${e}-share`,subtitle:`${e}-subtitle`,titleRecruitment:`${e}-title-recruitment`,titleRecruitmentAndPayment:`${e}-title-recruitment-and-payment`,titleRecruitmentTop:`${e}-title-recruitment-top`,withCardReader:`${e}-with-card-reader`,withoutCardReader:`${e}-without-card-reader`}}static get properties(){return{confirmationDate:{type:String,attribute:"confirmation-date"},currencyCode:{type:String,attribute:"currency-code"},localCurrency:{type:String,attribute:"local-currency"},merchantId:{type:String,attribute:"merchant-id"},paymentsData:{type:Object},priceReader:{type:Number,attribute:"price-reader"},servicesId:{type:String,attribute:"services-id"},thankYouData:{type:Object}}}constructor(){super(),this.confirmationDate="",this.currencyCode="",this.localCurrency="",this.merchantId="",this.paymentsData={},this.priceReader=0,this.servicesId="",this.thankYouData={}}firstUpdated(e){super.firstUpdated(e),this._dispatchShowEvent({viewName:rs.PAGE_THANK_YOU,payload:{folio:this.paymentsData.id,amount:this.priceReader}}),this.addView({id:Xt.PAGE_THANK_YOU,view:this})}navigateBack(){this._navigationExternal()}close(){this._navigationExternal()}_handleButtonRowItemClick(e){e.stopPropagation();const t=e.detail,s=1;t===0&&this._navigationExternal(),t===s&&this._onShared()}_navigationExternal(e){null==e||e.stopPropagation(),this._dispatchEvent(`${this.constructor.is}-exit`),this.closeView(Xt.PAGE_THANK_YOU),this.isTopFlow?this._dispatchNavigationExternal("top-thank-you"):this._dispatchNavigationExternal("thank-you")}_onShared(){var e,t,s,i,a,r,n,o,c,l,d,h,p,u,m,_,g,y,b,v,f,T,S,E,C,A,R,O;const P=`${null===(e=this.thankYouData)||void 0===e||null===(t=e.incomeAccount)||void 0===t?void 0:t.name} ${ps(null===(s=this.thankYouData)||void 0===s||null===(i=s.incomeAccount)||void 0===i?void 0:i.number)}`;let $={email:null===(a=this.thankYouData)||void 0===a||null===(r=a.orderInfo)||void 0===r||null===(n=r.contactDetails)||void 0===n?void 0:n.email,mobile:null===(o=this.thankYouData)||void 0===o||null===(c=o.orderInfo)||void 0===c||null===(l=c.contactDetails)||void 0===l?void 0:l.mobile,commercialName:null===(d=this.thankYouData)||void 0===d||null===(h=d.orderInfo)||void 0===h||null===(p=h.commercialData)||void 0===p?void 0:p.commercialName,commercialDescription:null===(u=this.thankYouData)||void 0===u||null===(m=u.orderInfo)||void 0===m||null===(_=m.commercialData)||void 0===_?void 0:_.commercialDescription,activityType:null===(g=this.thankYouData)||void 0===g||null===(y=g.orderInfo)||void 0===y||null===(b=y.commercialData)||void 0===b||null===(v=b.activity)||void 0===v?void 0:v.value,category:null===(f=this.thankYouData)||void 0===f||null===(T=f.orderInfo)||void 0===T||null===(S=T.commercialData)||void 0===S||null===(E=S.category)||void 0===E?void 0:E.value,subcategory:null===(C=this.thankYouData)||void 0===C||null===(A=C.orderInfo)||void 0===A||null===(R=A.commercialData)||void 0===R||null===(O=R.subcategory)||void 0===O?void 0:O.value,incomeAccount:P,operationDate:this.confirmationDate};if(this.isMposTopWithCardReaderFlow||this.isMposFlow){var D,I,k,w,x,N,M,q,H;const e=`${null===(D=this.thankYouData)||void 0===D||null===(I=D.paymentAccount)||void 0===I?void 0:I.name} ${ps(null===(k=this.thankYouData)||void 0===k||null===(w=k.paymentAccount)||void 0===w?void 0:w.number)}`;$={...$,amount:{value:this.priceReader,currency:this.currencyCode},agreementNumber:this.servicesId,reference:this.merchantId,operationType:null===(x=this.paymentsData)||void 0===x?void 0:x.description,cieGuide:null===(N=this.paymentsData)||void 0===N?void 0:N.trackingReference,folio:null===(M=this.paymentsData)||void 0===M?void 0:M.id,financialInstitution:"BBVA",shippingAddress:null===(q=this.thankYouData)||void 0===q||null===(H=q.deliveryAddress)||void 0===H?void 0:H.addressName,paymentAccount:e}}(this.isMposTopWithoutCardReaderFlow||this.isMposTopWithoutStockFlow)&&($={...$,withoutMposText:this.t(this._i18nKeys.withoutCardReader)}),this._dispatchPublicEvent("receipt-share",$)}_getNotificationTpl({textKey:e,params:t}){return F` <bbva-notification-help
      variant="info"
      text=${this.t(this._i18nKeys[e],t)}
    ></bbva-notification-help>`}_getListSimpleTpl({selector:e,description:t}){return F` <payments-mpos-digital-sales-list-simple
      description-ellipsis
      data-selector="payments-mpos-digital-sales-list-simple-${e}"
      description=${t}
      label-ellipsis
      label=${this.t(this._i18nKeys[(s=e,s.split("-").map(((e,t)=>0===t?e:e.charAt(0).toUpperCase()+e.slice(1))).join(""))])}
    ></payments-mpos-digital-sales-list-simple>`;var s}_getPanelProcessTpl({title:e,subtitle:t,description:s,link:i,amount:a}){return F`
      <payments-mpos-digital-sales-panel-process
        alt-image=${this.t(this._i18nKeys.altImage)}
        title=${B(e)}
        subtitle=${B(t)}
        description=${B(s)}
        link=${B(i)}
        amount=${B(a)}
        currency-code=${this.currencyCode}
        local-currency=${this.localCurrency}
        language=${this.language}
        @payments-mpos-digital-sales-panel-process-click-link=${this._navigationExternal}
      ></payments-mpos-digital-sales-panel-process>
    `}get _dateTpl(){const e=(t=this.confirmationDate,s=this.language,i=jt,new Date(t).toLocaleString(s,i));var t,s,i;return this._getListSimpleTpl({selector:"date",description:e})}get _operationDataTpl(){const{description:e,trackingReference:t,id:s}=this.paymentsData,{name:i,number:a}=this.thankYouData.paymentAccount,r=[{selector:"agreement",description:this.servicesId},{selector:"reference",description:this.merchantId},{selector:"operation-type",description:e},{selector:"guide",description:t},{selector:"paper",description:s},{selector:"financial",description:"BBVA"},{selector:"payment-account",description:`${i} ${ps(a)}`}];return F`<div class="category">
      <bbva-header-category
        class="title-header title-header-characteristics"
        heading-level="2"
        text=${this.t(this._i18nKeys.paymentData)}
        ?loading=${this.isLoading}
      ></bbva-header-category>
      ${r.map((e=>this._getListSimpleTpl(e)))}
    </div>`}get _contactDetailsTpl(){const{email:e,mobile:t}=this.thankYouData.orderInfo.contactDetails;return[{selector:"email",description:e},{selector:"contact-phone-number",description:t}].map((e=>this._getListSimpleTpl(e)))}get _contractingDataTpl(){return F`<div class="category">
      <bbva-header-category
        class="title-header title-header-characteristics"
        heading-level="2"
        text=${this.t(this._i18nKeys.contractingData)}
        ?loading=${this.isLoading}
      ></bbva-header-category>
      ${this._contactDetailsTpl} ${this._comercialDataTpl}
      ${this._getListSimpleTpl({selector:"withCardReader",description:""})}
      ${this._getNotificationTpl({textKey:"amountWithCardReader",params:{priceReader:this.priceReader}})}
      ${this._deliveryAddressTpl} ${this._getNotificationTpl({textKey:"deliveryAddressInfo"})}
      ${this._incomeAccountTpl}
    </div>`}get _comercialDataTpl(){const e=this.thankYouData.orderInfo.commercialData,t=[{selector:"comercial-name",description:e.commercialName},{selector:"comercial-description",description:e.commercialDescription},{selector:"activity-type",description:e.activity.value},{selector:"category",description:e.category.value}];return e.subcategory.value&&t.push({selector:"subcategory",description:e.subcategory.value}),t.map((e=>this._getListSimpleTpl(e)))}get _incomeAccountTpl(){const{name:e,number:t}=this.thankYouData.incomeAccount;return F`
      ${this._getListSimpleTpl({selector:"income-account",description:`${e} ${ps(t)}`})}
    `}get _deliveryAddressTpl(){return F`
      ${this._getListSimpleTpl({selector:"delivery-address",description:this.thankYouData.deliveryAddress.addressName})}
    `}get _notificationEmailTpl(){if(this.isTopFlow)return J;const e=this.isMposTopWithoutCardReaderFlow?this._i18nKeys.notificationEmailWithoutCardReaderTitle:this._i18nKeys.notificationEmailTitle;return F`
      <bbva-notification-message book-title message-title=${this.t(e)}
        >${this.thankYouData.orderInfo.contactDetails.email}</bbva-notification-message
      >
    `}get _actionButtonsTpl(){if(this.isTopFlow)return J;const e=[{icon:de(),label:this.t(this._i18nKeys.mposLink)},{icon:he(),label:this.t(this._i18nKeys.share)}];return F`
      <bbva-button-row
        accessibility-text=${this.t(this._i18nKeys.availableActions)}
        .options=${e}
        @button-row-item-click=${this._handleButtonRowItemClick}
      ></bbva-button-row>
    `}get _thankYouInfoTpl(){if(this.isMposTopWithCardReaderFlow||this.isMposFlow){const e=this.priceReader,t=this.t(this._i18nKeys.descriptionCompleted),s=this.t(this._i18nKeys.goToPaymentArea),i=this.t(this._i18nKeys.titleRecruitmentAndPayment),a=this.t(this._i18nKeys.subtitle);return F`${this._getPanelProcessTpl({amount:e,description:t,link:s,title:i,subtitle:a})}
      ${this._dateTpl}${this._operationDataTpl}${this._contractingDataTpl}`}if(this.isMposTopWithoutCardReaderFlow||this.isMposTopWithoutStockFlow){const e=this.t(this._i18nKeys.descriptionCompletedWithoutCardReader),t=this.t(this._i18nKeys.goToPaymentArea),s=this.t(this._i18nKeys.titleRecruitment);return F`${this._getPanelProcessTpl({description:e,link:t,title:s})}
      ${this._dateTpl}${this._contactDetailsTpl} ${this._comercialDataTpl}
      ${this._getListSimpleTpl({selector:"withoutCardReader",description:""})}
      ${this._incomeAccountTpl}`}if(this.isTopFlow){const e=this.t(this._i18nKeys.descriptionWait),t=this.t(this._i18nKeys.titleRecruitmentTop);return F`${this._getPanelProcessTpl({description:e,title:t})}`}return J}render(){return F`
      <div>${this._thankYouInfoTpl} ${this._notificationEmailTpl} ${this._actionButtonsTpl}</div>
    `}}var Nr=W`
:host {
  --_payments-mpos-digital-sales-background-color: ${a("colorPrimaryAltSurfaceAmbientDefault",r)};
}
`,Mr=W`
:host {
  display: block;
  box-sizing: border-box;
  --bbva-progress-content-z-index: 11;
  height: 100vh;
}

:host([hidden]), [hidden] {
  display: none !important;
}

div {
  background-color: var(--_payments-mpos-digital-sales-background-color);
}

.help-modal {
  --bbva-help-modal-padding: 0;
  --bbva-help-modal-padding-bottom: 0;
}
`;class qr extends(G(e(t(Y(ba(vi(_a(ga(M))))))))){static get is(){return"payments-mpos-digital-sales"}static get scopedElements(){const e=[i,x,xs,fi,Ti,Si,Gi,zi,Wi,Yi,fa,Xi,Ji,Cr,Dr,Qi,ma,xr];return qr.scopedElementsFromClasses(e)}static get styles(){return[Nr,Mr,w.primaryAlt,X("payments-mpos-digital-sales-shared-styles")]}static get properties(){return{accountsApiVersion:{type:Number,attribute:"accounts-api-version"},accountsOrderBy:{type:String,attribute:"accounts-order-by"},addProductsApiVersion:{type:Number,attribute:"add-products-api-version"},aemHost:{type:String,attribute:"aem-host"},aemPathCommission:{type:String,attribute:"aem-path-commission"},contentFragmentPath:{type:String,attribute:"content-fragment-path"},componentTypes:{type:Array},clientOnboardingApiVersion:{type:Number,attribute:"client-onboarding-api-version"},componentTypesUnmasked:{type:Array},countryCode:{type:String,attribute:"country-code"},countryId:{type:String,attribute:"country-id"},currencyCode:{type:String,attribute:"currency-code"},customerAddressesApiVersion:{type:Number,attribute:"customer-addresses-api-version"},customerContactDetailsApiVersion:{type:Number,attribute:"customer-contact-details-api-version"},customerId:{type:String,attribute:"customer-id"},deviceType:{type:String,attribute:"device-type"},documentFileApiVersion:{type:Number,attribute:"document-file-api-version"},documentId:{type:String,attribute:"document-id"},documentIdTop:{type:String,attribute:"document-id-top"},documentType:{type:String,attribute:"document-type"},documentTypeTop:{type:String,attribute:"document-type-top"},economicActivitiesApiVersion:{type:Number,attribute:"economic-activities-api-version"},hasFeatureHeaderHidden:{type:Boolean,attribute:"has-feature-header-hidden"},imagesUrl:{type:Object},localCurrency:{type:String,attribute:"local-currency"},mposPriceStockApiVersion:{type:Number,attribute:"mpos-price-stock-api-version"},mposPurchaseApiVersion:{type:Number,attribute:"mpos-purchase-api-version"},mposQuantity:{type:Number,attribute:"mpos-quantity"},notFoundMcc:{type:String,attribute:"not-found-mcc"},otherAddress:{type:Object},paymentDayIds:{type:Array},paymentDayNames:{type:Array},paymentDescription:{type:String,attribute:"payment-description"},productType:{type:Object},servicePaymentsApiVersion:{type:Number,attribute:"service-payments-api-version"},servicesId:{type:String,attribute:"services-id"},showHelpFaqs:{type:Boolean,attribute:"show-help-faqs"},termTypeIds:{type:Array},termTypesApiVersion:{type:Number,attribute:"term-types-api-version"},termTypeTop:{type:Array},_accounts:{type:Array},_activities:{type:Array},_address:{type:Object},_categories:{type:Array},_categoryId:{type:String},_commissionsData:{type:Object},_confirmationDate:{type:String},_contactDetails:{type:Object},_families:{type:Array},_familyId:{type:String},_isAddressUnmasked:{type:Boolean},_isClientOnboardingComplete:{type:Boolean},_isContactDetailsUnmasked:{type:Boolean},_isHelpModalVisible:{type:Boolean},_isLoadPriceStockData:{type:Boolean},_isMultistepScrollOnSummary:{type:Boolean},_isServicePaymentsComplete:{type:Boolean},_merchantId:{type:String},_mposPriceStock:{type:Object},_mposPriceStockErrorType:{type:String},_requestActionName:{type:String},_servicePaymentsData:{type:Object},_termTypes:{type:Object},_viewMode:{type:String}}}constructor(){super(),this.accountsApiVersion=0,this.accountsOrderBy="",this.addProductsApiVersion=0,this.aemHost="",this.aemPathCommission="",this.ambient="primary-alt",this.clientOnboardingApiVersion=0,this.componentTypes=[],this.componentTypesUnmasked=[],this.config={},this.contentFragmentPath="",this.countryCode="",this.countryId="",this.currencyCode="",this.customerAddressesApiVersion=0,this.customerContactDetailsApiVersion=0,this.customerId="",this.deviceType="",this.documentFileApiVersion=0,this.documentId="",this.documentIdTop="",this.documentType="",this.documentTypeTop="",this.economicActivitiesApiVersion=0,this.hasFeatureHeaderHidden=!1,this.host="",this.imagesUrl={},this.language="",this.localCurrency="",this.mposPriceStockApiVersion=0,this.mposPurchaseApiVersion=0,this.mposQuantity=1,this.notFoundMcc="",this.otherAddress={},this.paymentDayIds=[],this.paymentDayNames=[],this.paymentDescription="",this.productType={},this.servicePaymentsApiVersion=0,this.servicesId="",this.showHelpFaqs=!1,this.termTypeIds=[],this.termTypesApiVersion=0,this.termTypeTop=[],this._accounts=[],this._activities=[],this._address={},this._categories=[],this._categoryId="",this._commissionsData={},this._confirmationDate="",this._contactDetails={},this._families=[],this._familyId="",this._isAddressUnmasked=!1,this._isClientOnboardingComplete=!1,this._isContactDetailsUnmasked=!1,this._isHelpModalVisible=!1,this._isLoadPriceStockData=!1,this._isMultistepScrollOnSummary=!1,this._isServicePaymentsComplete=!1,this._merchantId="",this._mposPriceStock={},this._mposPriceStockErrorType="",this._requestActionName="",this._servicePaymentsData={},this._termTypes={},this._viewMode=Vt.OFFER}async firstUpdated(e){super.firstUpdated(e),this.config={loader:{text:this.t(this._i18nKeys.loading)},faqs:!0}}async updated(e){super.updated(e),e.has("productType")&&Object.keys(this.productType).length&&(this._refMposPriceStockDm=this.shadowRoot.querySelector('[data-tag-name="payments-mpos-digital-sales-mpos-price-stock-dm"]'),this._refAemContentFragmentDm=this.shadowRoot.querySelector('[data-tag-name="payments-mpos-digital-sales-aem-content-fragment-dm"]'),this._refCustomerContactDetailsDm=this.shadowRoot.querySelector('[data-tag-name="payments-mpos-digital-sales-customer-contact-details-dm"]'),this._refEconomicActivitiesDm=this.shadowRoot.querySelector('[data-tag-name="payments-mpos-digital-sales-economic-activities-dm"]'),this._refAccountsDm=this.shadowRoot.querySelector('[data-tag-name="payments-mpos-digital-sales-accounts-dm"]'),this._refCustomerAddressesDm=this.shadowRoot.querySelector('[data-tag-name="payments-mpos-digital-sales-customer-addresses-dm"]'),this._refTermTypesDm=this.shadowRoot.querySelector('[data-tag-name="payments-mpos-digital-sales-term-types-dm"]'),this._refDocumentFileDm=this.shadowRoot.querySelector('[data-tag-name="payments-mpos-digital-sales-document-file-dm"]'),this._refClientOnboardingDm=this.shadowRoot.querySelector('[data-tag-name="payments-mpos-digital-sales-client-onboarding-dm"]'),this._refServicePaymentsDm=this.shadowRoot.querySelector('[data-tag-name="payments-mpos-digital-sales-service-payments-dm"]'),this._refMposPurchaseDm=this.shadowRoot.querySelector('[data-tag-name="payments-mpos-digital-sales-mpos-purchase-dm"]'),this._refAddProductsDm=this.shadowRoot.querySelector('[data-tag-name="payments-mpos-digital-sales-add-products-dm"]'),this._refFaqsModal=this.shadowRoot.querySelector('[data-tag-name="payments-mpos-digital-sales-faqs-modal"]'),await this.updateComplete,this._refOffer=await this._showOffer(),this._isHelpModalVisible=!0,this._updateAndHandleRequestAction(cs.LOAD_OFFER))}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),ls.reset()}setOtherAddress(e){this.otherAddress={...e}}handleRequestActions(){var e;null===(e=this._getActions())||void 0===e||e[this._requestActionName]()}handleCancelSignActions(){var e;null===(e=this._getActions({isCancelSignAction:!0}))||void 0===e||e[this._requestActionName]()}handleCancelErrorActions(){var e;null===(e=this._getActions({isCancelErrorAction:!0}))||void 0===e||e[this._requestActionName]()}_getActions({isCancelErrorAction:e=!1,isCancelSignAction:t=!1}={}){const s=({action:s,cancelErrorAction:i=null,cancelSignAction:a=null})=>{e&&i?i.apply(this):t&&a?a.apply(this):s.apply(this)};return{[cs.LOAD_OFFER]:()=>{s({action:this._loadOfferAction})},[cs.OPEN_COMMISSIONS_DETAILS_MODAL]:()=>{s({action:this._openCommissionsDetailsModalAction,cancelErrorAction:this._exitOrder})},[cs.RETRY_MPOS_PRICE_STOCK]:()=>{s({action:this._retryMposPriceStockAction})},[cs.COMPLETE_OFFER]:()=>{s({action:this._completeOfferActions,cancelErrorAction:this._completeOfferCancelErrorActions})},[cs.TOGGLE_CONTACT_DETAILS_MASK]:()=>{s({action:this._toggleContactDetailsMaskAction,cancelErrorAction:this._toggleContactDetailsMaskCancelErrorAction,cancelSignAction:this._toggleContactDetailsMaskCancelSignAction})},[cs.SELECT_ECONOMIC_FAMILY]:()=>{s({action:this._selectEconomicFamilyAction,cancelErrorAction:this._exitOrder})},[cs.SELECT_ECONOMIC_CATEGORY]:()=>{s({action:this._selectEconomicCategoryAction,cancelErrorAction:this._exitOrder})},[cs.COMPLETE_ORDER_INFO]:()=>{s({action:this._completeOrderInfoAction,cancelErrorAction:this._exitOrder})},[cs.COMPLETE_INCOME_ACCOUNT]:()=>{s({action:this._completeIncomeAccountActions,cancelErrorAction:this._exitOrder})},[cs.COMPLETE_CARD_READER]:()=>{s({action:this._completeCardReaderActions,cancelErrorAction:this._exitOrder})},[cs.TOGGLE_DELIVERY_ADDRESS_MASK]:()=>{s({action:this._toggleDeliveryAddressMaskAction,cancelErrorAction:this._toggleDeliveryAddressMaskCancelErrorAction,cancelSignAction:this._toggleDeliveryAddressMaskCancelAction})},[cs.COMPLETE_DELIVERY_ADDRESS]:()=>{s({action:this._completeDeliveryAddressAction})},[cs.COMPLETE_PAYMENT_ACCOUNT]:()=>{s({action:this._completePaymentAccountAction,cancelErrorAction:this._exitOrder})},[cs.OPEN_TERMS_AND_CONDITIONS_FILE]:()=>{s({action:this._openTermsAndConditionsFileAction,cancelErrorAction:this._exitOrder})},[cs.COMPLETE_TERMS_AND_CONDITIONS]:()=>{s({action:this._completeTermsAndConditionsAction})},[cs.COMPLETE_MULTISTEP]:()=>{s({action:this._completeMultistepActions,cancelErrorAction:this._completeMultistepCancelErrorActions,cancelSignAction:this._completeMultistepCancelSignActions})}}}async _loadOfferAction(){this._isLoadPriceStockData=!0;try{this._mposPriceStock=await this._getMposPriceStock(),!this._mposPriceStock.availableStock&&this._isMposProduct?this._mposPriceStockErrorType=Ut.INSUFFICIENT_STOCK:this._mposPriceStockErrorType=""}catch(e){this._mposPriceStockErrorType=Ut.DEFAULT_ERROR}finally{this._isLoadPriceStockData=!1}}async _openCommissionsDetailsModalAction(){this.showLoader("transparent",!0);try{Object.keys(this._commissionsData).length||(this._commissionsData=await this._getAemCommissionsData())}catch(e){this._handleErrorSend(e)}finally{this.clearLoader()}}async _retryMposPriceStockAction(){this.showLoader("transparent",!0);try{this._mposPriceStock=await this._getMposPriceStock(),this._mposPriceStockErrorType=""}catch(e){e instanceof Ds&&(this._mposPriceStockErrorType=Ut.DEFAULT_ERROR)}finally{this.clearLoader()}}async _completeOfferActions(){if(this._selectedProductFlow===os.TOP){this.showLoader("transparent",!0);try{await this._postAddProducts()}catch(e){return void this._handleErrorSend(e)}finally{this.clearLoader()}this.closeView(Xt.PAGE_OFFER),this._refThankYou=await this._showThankYou()}else{this.showLoader("transparent",!0);try{this._refEconomicActivitiesDm.resetDmEconomicActivities();const[e,t]=await Promise.all([this._getContactDetails(),this._getEconomicActivities()]);this._contactDetails=e,this._families=t}catch(e){const t=Ts({name:"LoadOfferError",errorId:Wt.LOAD_OFFER,defaultMessage:"An error occurred when load offer."});return void this._handleErrorSend(new t)}finally{this.clearLoader()}this._refMultistep=await this._showMultistep(),this._refMultistep.openMultistep()}}async _completeOfferCancelErrorActions(){if(this._selectedProductFlow===os.TOP)this._refOffer=await this._showOffer();else this._exitOrder()}async _toggleContactDetailsMaskAction(){this.showLoader("transparent",!0);try{this._refCustomerContactDetailsDm.resetDmCustomerContactDetails(),this._contactDetails=await this._getContactDetails()}catch(e){this._handleErrorSend(e)}finally{this.clearLoader()}}_toggleContactDetailsMaskCancelErrorAction(){this._isContactDetailsUnmasked=!this._isContactDetailsUnmasked}_toggleContactDetailsMaskCancelSignAction(){this.clearLoader(),this._isContactDetailsUnmasked=!1}async _selectEconomicFamilyAction(){this.showLoader("transparent",!0);try{this._refEconomicActivitiesDm.resetDmEconomicActivities(),this._categories=await this._getEconomicActivities()}catch(e){this._handleErrorSend(e)}finally{this.clearLoader()}}async _selectEconomicCategoryAction(){this.showLoader("transparent",!0);try{this._refEconomicActivitiesDm.resetDmEconomicActivities(),this._activities=await this._getEconomicActivities()}catch(e){this._handleErrorSend(e)}finally{this.clearLoader()}}async _completeOrderInfoAction(){this.showLoader("transparent",!0);try{this._accounts=await this._getAccounts(),this._refMultistep.goToNextStep()}catch(e){this._handleErrorSend(e)}finally{this.clearLoader()}}async _completeIncomeAccountActions(){switch(this._selectedProductFlow){case os.MPOS_TOP_WITHOUT_STOCK:this.showLoader("transparent",!0);try{this._termTypes=await this._getTermTypes()}catch(e){return void this._handleErrorSend(e)}finally{this.clearLoader()}break;case os.MPOS:this.showLoader("transparent",!0);try{this._address=await this._getCustomerAddresses()}catch(e){return void this._handleErrorSend(e)}finally{this.clearLoader()}}this._refMultistep.goToNextStep()}async _completeCardReaderActions(){switch(this._selectedProductFlow){case os.MPOS_TOP_WITH_CARD_READER:this.showLoader("transparent",!0);try{this._address=await this._getCustomerAddresses()}catch(e){return void this._handleErrorSend(e)}finally{this.clearLoader()}break;case os.MPOS_TOP_WITHOUT_CARD_READER:this.showLoader("transparent",!0);try{this._termTypes=await this._getTermTypes()}catch(e){return void this._handleErrorSend(e)}finally{this.clearLoader()}}this._refMultistep.goToNextStep()}async _toggleDeliveryAddressMaskAction(){this.showLoader("transparent",!0);try{this._refCustomerAddressesDm.resetDmCustomerAddresses(),this._address=await this._getCustomerAddresses()}catch(e){this._handleErrorSend(e)}finally{this.clearLoader()}}_toggleDeliveryAddressMaskCancelErrorAction(){this._isAddressUnmasked=!this._isAddressUnmasked}async _toggleDeliveryAddressMaskCancelAction(){this.clearLoader(),this._isAddressUnmasked=!1}async _completeDeliveryAddressAction(){this._refMultistep.goToNextStep()}async _completePaymentAccountAction(){this.showLoader("transparent",!0);try{this._termTypes=await this._getTermTypes()}catch(e){return void this._handleErrorSend(e)}finally{this.clearLoader()}this._refMultistep.goToNextStep()}async _openTermsAndConditionsFileAction(){this.showLoader("transparent",!0);try{const e=await this._getDocumentFile();this._dispatchPublicEvent("terms-and-conditions-file-open",e)}catch(e){this._handleErrorSend(e)}finally{this.clearLoader()}}async _completeTermsAndConditionsAction(){this._refMultistep.goToNextStep()}async _completeMultistepActions(){switch(this._selectedProductFlow){case os.MPOS_TOP_WITH_CARD_READER:case os.MPOS:this.showLoader("transparent",!0);try{this._isClientOnboardingComplete||(this._merchantId=await this._postClientOnboarding(),this._isClientOnboardingComplete=!0),this._isServicePaymentsComplete||(this._servicePaymentsData=await this._postServicePayments(),this._isServicePaymentsComplete=!0),await this._postMposPurchase()}catch(e){return void this._handleErrorSend(e)}finally{this.clearLoader()}break;case os.MPOS_TOP_WITHOUT_CARD_READER:case os.MPOS_TOP_WITHOUT_STOCK:this.showLoader("transparent",!0);try{this._merchantId=await this._postClientOnboarding()}catch(e){return void this._handleErrorSend(e)}finally{this.clearLoader()}}this._completeOrder()}_completeMultistepCancelErrorActions(){this._isClientOnboardingComplete?this._dispatchNavigationExternal("back-step"):this._exitOrder()}_completeMultistepCancelSignActions(){this.clearLoader(),this._dispatchNavigationExternal("back-step")}async _getMposPriceStock(){return this._refMposPriceStockDm.getMposPriceStock()}async _getContactDetails(){return this._refCustomerContactDetailsDm.getCustomerContactDetails({unmasked:this._isContactDetailsUnmasked})}async _getEconomicActivities(){return this._refEconomicActivitiesDm.getEconomicActivities({familyId:this._familyId,categoryId:this._categoryId})}async _getAccounts(){return this._refAccountsDm.getAccounts()}async _getCustomerAddresses(){return this._refCustomerAddressesDm.getCustomerAddresses({unmasked:this._isAddressUnmasked})}async _getDocumentFile(){return this._refDocumentFileDm.getDocumentFile()}async _getAemCommissionsData(){return this._refAemContentFragmentDm.getAemData()}async _getTermTypes(){const e=this._isCardReaderRequired?this.termTypeIds:this.termTypeTop;return this._refTermTypesDm.getTermTypes({termTypeIds:e})}async _postClientOnboarding(){this._confirmationDate=(new Date).toISOString();const e=(({confirmationDate:e,products:t,paymentDayIds:s,paymentDayNames:i})=>{var a,r,n,o,c;const l=null===(a=ls.getState())||void 0===a?void 0:a.orderInfo,d=null===(r=ls.getState())||void 0===r?void 0:r.incomeAccount,h=s.map(((e,t)=>({paymentDayType:{id:e,name:i[t]}}))),p=t.map((e=>({productType:{id:e,name:e}})));return{commercialInfo:{tradename:null==l||null===(n=l.commercialData)||void 0===n?void 0:n.commercialName,merchantCategoryCode:null==l||null===(o=l.commercialData)||void 0===o?void 0:o.mcc,description:null==l||null===(c=l.commercialData)||void 0===c?void 0:c.commercialDescription,productInfo:p},paymentInfo:{bankAccount:null==d?void 0:d.numberClabe,currencies:{id:null==d?void 0:d.currency,name:null==d?void 0:d.currency},paymentDay:h},acceptTerms:{confirmationDate:e,isConfirm:!0}}})({confirmationDate:this._confirmationDate,products:this._isMposTopProduct?[Kt.MPOS,Kt.TOP]:[Kt.MPOS],paymentDayIds:this.paymentDayIds,paymentDayNames:this.paymentDayNames});return this._refClientOnboardingDm.postClientOnboarding(e)}async _postServicePayments(){const e=(({servicesId:e,merchantId:t,unitPrice:s,localCurrency:i,description:a})=>{var r,n;const o=null===(r=ls.getState())||void 0===r||null===(n=r.paymentAccount)||void 0===n?void 0:n.accountId;return{services:[{id:e,bills:[{number:t,amounts:[{amountType:{id:Gt.AMOUNT_TYPE},amountValue:{amount:s,currency:i}}]}]}],origin:{contractId:o,productType:{id:Gt.ACCOUNTS}},description:a}})({servicesId:this.servicesId,merchantId:this._merchantId,unitPrice:this._mposPriceStock.unitPrice,localCurrency:this.localCurrency,description:this.paymentDescription});return this._refServicePaymentsDm.postServicePayments(e)}async _postMposPurchase(){var e,t,s;const i=(({trackingReference:e,sku:t,unitPrice:s,quantity:i})=>{var a,r,n,o;const c=null===(a=ls.getState())||void 0===a||null===(r=a.deliveryAddress)||void 0===r?void 0:r.addressType,l=null===(n=ls.getState())||void 0===n||null===(o=n.deliveryAddress)||void 0===o?void 0:o.otherAddress,d=c===Lt.MAIN;return{deliveryInformation:{authorizationId:e,mainAddress:d,...!1===d?{alternateDeliveryAddress:(h=l,Object.fromEntries(Object.entries(h).filter((([,e])=>""!==e))))}:{}},purchaseInformation:{quantity:i,sku:t,total:s,unitPrice:s}};var h})({trackingReference:null===(e=this._servicePaymentsData)||void 0===e?void 0:e.trackingReference,sku:null===(t=this._mposPriceStock)||void 0===t?void 0:t.sku,unitPrice:null===(s=this._mposPriceStock)||void 0===s?void 0:s.unitPrice,quantity:this.mposQuantity});await this._refMposPurchaseDm.postMposPurchase(i)}async _postAddProducts(){const e={productTypes:[{id:zt.TAP_ON_PHONE}]};await this._refAddProductsDm.postAddProducts(e)}_handleErrorSend({errorId:e}){this._dispatchErrorEvent({errorId:e})}_otherAddressDetele(){this.otherAddress={},this._dispatchPublicEvent("other-address-delete")}_handleOtherAddressDelete(e){e.stopPropagation(),this._otherAddressDetele()}async _exitOrder(){this._familyId="",this._categoryId="",this.closeView(Xt.PAGE_MULTISTEP),this._refOffer=await this._showOffer()}_handleScrollOnSummary(e){e.stopPropagation(),this._isMultistepScrollOnSummary=e.detail}_handleMultistepExit(e){e.stopPropagation(),this._exitOrder()}async _completeOrder(){this.closeView(Xt.PAGE_MULTISTEP),this.closeView(Xt.PAGE_OFFER),this._refThankYou=await this._showThankYou()}async _showOffer(){return this._viewMode=Vt.OFFER,await this.updateComplete,this.shadowRoot.querySelector('[data-tag-name="payments-mpos-digital-sales-offer"]')}async _showMultistep(){return this._viewMode=Vt.MULTISTEP,await this.updateComplete,this.shadowRoot.querySelector('[data-tag-name="payments-mpos-digital-sales-multistep"]')}async _showThankYou(){return this._viewMode=Vt.THANK_YOU,await this.updateComplete,this.shadowRoot.querySelector('[data-tag-name="payments-mpos-digital-sales-thank-you"]')}_handleHeaderIconClick(e){e.stopPropagation();const{index:t}=e.detail,s=1;if(t===0){if(this._isThankYouViewMode)return this._isHelpModalVisible=!1,void this._refThankYou.close();if(this._mposPriceStockErrorType)return void this._dispatchNavigationExternal("back-step");this._refFaqsModal.open()}t===s&&(this._isOfferViewMode&&this._refOffer.close(),this._isMultistepViewMode&&this._refMultistep.close())}_handleContactDetailsUnmaskToggle(e){e.stopPropagation();const{requestActionName:t}=e.detail;this._isContactDetailsUnmasked=!this._isContactDetailsUnmasked,this._updateAndHandleRequestAction(t)}_handleAdressUnmaskToggle(e){e.stopPropagation();const{requestActionName:t}=e.detail;this._isAddressUnmasked=!this._isAddressUnmasked,this._updateAndHandleRequestAction(t)}_handleFamilySelect(e){e.stopPropagation();const{familyId:t,requestActionName:s}=e.detail;this._familyId=t,this._categoryId="",this._updateAndHandleRequestAction(s)}_handleCategorySelect(e){e.stopPropagation();const{categoryId:t,requestActionName:s}=e.detail;this._categoryId=t,this._updateAndHandleRequestAction(s)}_updateRequestActionName(e){e.stopPropagation();const{requestActionName:t}=e.detail;this._updateAndHandleRequestAction(t)}_updateAndHandleRequestAction(e){this._requestActionName=e,this.handleRequestActions()}_handleResetSteps(e){e.stopPropagation(),this._isAddressUnmasked=!1,this._otherAddressDetele(),ls.setState({deliveryAddress:{}}),ls.setState({paymentAccount:{}}),ls.setState({termsAndConditions:{}}),this._termsAndConditionsData={}}_handleThankYouExit(e){e.stopPropagation(),this._isHelpModalVisible=!1}get _isMposTopProduct(){return this.productType.mpos&&this.productType.top}get _isMposProduct(){return this.productType.mpos&&!this.productType.top}get _isTopProduct(){return!this.productType.mpos&&this.productType.top}get _isMposTopWithoutCardReaderFlow(){var e,t;return this._isMposTopProduct&&(null===(e=ls.getState())||void 0===e||null===(t=e.cardReader)||void 0===t?void 0:t.cardReaderOptionSelected)===as.WITHOUT_CARD_READER}get _isMposTopWithoutStockFlow(){return this._isMposTopProduct&&Object.keys(this._mposPriceStock).length&&!this._mposPriceStock.availableStock}get _selectedProductFlow(){return this._isMposTopWithoutCardReaderFlow?os.MPOS_TOP_WITHOUT_CARD_READER:this._isMposTopWithoutStockFlow?os.MPOS_TOP_WITHOUT_STOCK:this._isMposProduct&&this._mposPriceStock.availableStock?os.MPOS:this._isTopProduct?os.TOP:os.MPOS_TOP_WITH_CARD_READER}get _isCardReaderRequired(){return[os.MPOS_TOP_WITH_CARD_READER,os.MPOS].includes(this._selectedProductFlow)}get _isOfferViewMode(){return this._viewMode===Vt.OFFER}get _isMultistepViewMode(){return this._viewMode===Vt.MULTISTEP}get _isThankYouViewMode(){return this._viewMode===Vt.THANK_YOU}get _mposPriceStockDmTpl(){return F`
      <payments-mpos-digital-sales-mpos-price-stock-dm
        country-id=${this.countryId}
        host=${this.host}
        mpos-price-stock-api-version=${this.mposPriceStockApiVersion}
        required-token=${this.requiredToken}
        ?native=${this.native}
      ></payments-mpos-digital-sales-mpos-price-stock-dm>
    `}get _aemContentFragmentDmTpl(){return F`
      <payments-mpos-digital-sales-aem-content-fragment-dm
        aem-host="${this.aemHost}"
        aem-path-commission="${this.aemPathCommission}"
        ?native="${this.native}"
      ></payments-mpos-digital-sales-aem-content-fragment-dm>
    `}get _customerContactDetailsDmTpl(){return F`
      <payments-mpos-digital-sales-customer-contact-details-dm
        customer-contact-details-api-version=${this.customerContactDetailsApiVersion}
        customer-id=${this.customerId}
        host=${this.host}
        required-token=${this.requiredToken}
        ?native=${this.native}
      ></payments-mpos-digital-sales-customer-contact-details-dm>
    `}get _economicActivitiesDmTpl(){return F`
      <payments-mpos-digital-sales-economic-activities-dm
        device-type=${this.deviceType}
        economic-activities-api-version=${this.economicActivitiesApiVersion}
        host=${this.host}
        required-token=${this.requiredToken}
        ?native=${this.native}
      ></payments-mpos-digital-sales-economic-activities-dm>
    `}get _accountsDmTpl(){return F`
      <payments-mpos-digital-sales-accounts-dm
        accounts-api-version=${this.accountsApiVersion}
        accounts-order-by=${this.accountsOrderBy}
        country-code=${this.countryCode}
        host=${this.host}
        required-token=${this.requiredToken}
        ?native=${this.native}
      ></payments-mpos-digital-sales-accounts-dm>
    `}get _customerAddressesDmTpl(){return F`
      <payments-mpos-digital-sales-customer-addresses-dm
        customer-addresses-api-version=${this.customerAddressesApiVersion}
        customer-id=${this.customerId}
        host=${this.host}
        required-token=${this.requiredToken}
        ?is-address-unmasked=${this._isAddressUnmasked}
        ?native=${this.native}
        .componentTypes=${this.componentTypes}
        .componentTypesUnmasked=${this.componentTypesUnmasked}
      ></payments-mpos-digital-sales-customer-addresses-dm>
    `}get _termTypesDmTpl(){return F`
      <payments-mpos-digital-sales-term-types-dm
        country-code=${this.countryCode}
        document-id=${this._isCardReaderRequired?this.documentId:this.documentIdTop}
        host=${this.host}
        required-token=${this.requiredToken}
        services-id=${this.servicesId}
        term-types-api-version=${this.termTypesApiVersion}
        unit-price=${this._mposPriceStock.unitPrice}
        ?native=${this.native}
      ></payments-mpos-digital-sales-term-types-dm>
    `}get _documentFileDmTpl(){return F`
      <payments-mpos-digital-sales-document-file-dm
        country-code=${this.countryCode}
        document-file-api-version=${this.documentFileApiVersion}
        document-id=${this._isCardReaderRequired?this.documentId:this.documentIdTop}
        document-type=${this._isCardReaderRequired?this.documentType:this.documentTypeTop}
        host=${this.host}
        required-token=${this.requiredToken}
        ?native=${this.native}
      ></payments-mpos-digital-sales-document-file-dm>
    `}get _clientOnboardingDmTpl(){return F`
      <payments-mpos-digital-sales-client-onboarding-dm
        client-onboarding-api-version=${this.clientOnboardingApiVersion}
        host=${this.host}
        required-token=${this.requiredToken}
        ?native=${this.native}
      ></payments-mpos-digital-sales-client-onboarding-dm>
    `}get _servicePaymentsDmTpl(){return F`
      <payments-mpos-digital-sales-service-payments-dm
        country-code=${this.countryCode}
        host=${this.host}
        required-token=${this.requiredToken}
        service-payments-api-version=${this.servicePaymentsApiVersion}
        ?native=${this.native}
      ></payments-mpos-digital-sales-service-payments-dm>
    `}get _mposPurchaseDmTpl(){return F`
      <payments-mpos-digital-sales-mpos-purchase-dm
        host=${this.host}
        mpos-purchase-api-version=${this.mposPurchaseApiVersion}
        required-token=${this.requiredToken}
        ?native=${this.native}
      ></payments-mpos-digital-sales-mpos-purchase-dm>
    `}get _addProductsDmTpl(){return F`
      <payments-mpos-digital-sales-add-products-dm
        add-products-api-version=${this.addProductsApiVersion}
        host=${this.host}
        required-token=${this.requiredToken}
        ?native=${this.native}
      ></payments-mpos-digital-sales-add-products-dm>
    `}get _offerTpl(){return this._viewMode===Vt.OFFER?F`
          <payments-mpos-digital-sales-offer
            language=${this.language}
            local-currency=${this.localCurrency}
            mpos-price-stock-error-type=${this._mposPriceStockErrorType}
            selected-product-flow=${this._selectedProductFlow}
            ?has-feature-header-hidden=${this.hasFeatureHeaderHidden}
            ?i-o-s-fixed-header=${this.iOSFixedHeader}
            ?is-loading=${this._isLoadPriceStockData}
            .commissionsData=${this._commissionsData}
            .imagesUrl=${this.imagesUrl}
            .mposPriceStock=${this._mposPriceStock}
            @payments-mpos-digital-sales-mpos-price-stock-error-alert-retry=${this._updateRequestActionName}
            @payments-mpos-digital-sales-offer-commissions-open=${this._updateRequestActionName}
            @payments-mpos-digital-sales-offer-order-start=${this._updateRequestActionName}
          ></payments-mpos-digital-sales-offer>
        `:J}get _multistepTpl(){var e,t;return this._isMultistepViewMode?F`
          <payments-mpos-digital-sales-multistep
            card-reader-option-selected=${(null===(e=ls.getState())||void 0===e||null===(t=e.cardReader)||void 0===t?void 0:t.cardReaderOptionSelected)||""}
            currency-code=${this.currencyCode}
            language=${this.language}
            local-currency=${this.localCurrency}
            not-found-mcc=${this.notFoundMcc}
            selected-product-flow=${this._selectedProductFlow}
            ?has-feature-header-hidden=${this.hasFeatureHeaderHidden}
            ?i-o-s-fixed-header=${this.iOSFixedHeader}
            ?is-address-unmasked=${this._isAddressUnmasked}
            ?is-contact-details-unmasked=${this._isContactDetailsUnmasked}
            .accounts=${this._accounts}
            .activities=${this._activities}
            .address=${this._address}
            .categories=${this._categories}
            .contactDetails=${this._contactDetails}
            .families=${this._families}
            .imagesUrl=${this.imagesUrl}
            .mposPriceStock=${this._mposPriceStock}
            .otherAddress=${this.otherAddress}
            .termTypes=${this._termTypes}
            @payments-mpos-digital-sales-multistep-complete-step=${this._updateRequestActionName}
            @payments-mpos-digital-sales-multistep-exit=${this._exitOrder}
            @payments-mpos-digital-sales-multistep-is-scroll-on-summary=${this._handleScrollOnSummary}
            @payments-mpos-digital-sales-order-info-contact-details-unmask-toggle=${this._handleContactDetailsUnmaskToggle}
            @payments-mpos-digital-sales-order-info-category-select=${this._handleCategorySelect}
            @payments-mpos-digital-sales-order-info-family-select=${this._handleFamilySelect}
            @payments-mpos-digital-sales-card-reader-steps-reset=${this._handleResetSteps}
            @payments-mpos-digital-sales-delivery-address-other-address-delete=${this._handleOtherAddressDelete}
            @payments-mpos-digital-sales-delivery-address-unmask-toggle=${this._handleAdressUnmaskToggle}
            @payments-mpos-digital-sales-terms-and-conditions-file-click=${this._updateRequestActionName}
          ></payments-mpos-digital-sales-multistep>
        `:J}get _thankYouTpl(){return this._viewMode===Vt.THANK_YOU?F`
          <payments-mpos-digital-sales-thank-you
            confirmation-date=${this._confirmationDate}
            currency-code=${this.currencyCode}
            language=${this.language}
            local-currency=${this.localCurrency}
            merchant-id=${this._merchantId}
            price-reader=${this._mposPriceStock.unitPrice}
            selected-product-flow=${this._selectedProductFlow}
            services-id=${this.servicesId}
            ?has-feature-header-hidden=${this.hasFeatureHeaderHidden}
            .paymentsData=${this._servicePaymentsData}
            .thankYouData=${ls.getState()}
            @payments-mpos-digital-sales-thank-you-exit=${this._handleThankYouExit}
          ></payments-mpos-digital-sales-thank-you>
        `:J}get _faqsModalTpl(){return F`
      <payments-mpos-digital-sales-faqs-modal
        content-fragment-path=${this.contentFragmentPath}
        aem-host=${this.aemHost}
        ?has-feature-header-hidden=${this.hasFeatureHeaderHidden}
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        ?native=${this.native}
        ?show-help-faqs=${this.showHelpFaqs}
      >
      </payments-mpos-digital-sales-faqs-modal>
    `}get _headerText(){return this._isTopProduct?this.t(this._i18nKeys.contractingCollectionZoneTop):this._mposPriceStockErrorType?this.t(this._i18nKeys.paymentZone):this.t(this._i18nKeys.contractingCollectionZone)}get _helpModalTpl(){const e={id:"btn-help",icon:pe(),accessibilityText:this.t(this._i18nKeys.helpIcon)},t={id:"btn-close",icon:ue(),accessibilityText:this.t(this._i18nKeys.closeIcon)},s=this._isThankYouViewMode||this._mposPriceStockErrorType?[t]:[e,t],i=this._isMultistepScrollOnSummary?"modal-initial-secondary":"modal-initial",a=this._isMultistepViewMode?i:"modal-initial";return F`
      <bbva-help-modal
        class="help-modal"
        avoid-icon-close-modal
        full-height
        header-text=${this.hasFeatureHeaderHidden?"":this._headerText}
        header-type=${a}
        hide-content-padding-top
        .headerButtons=${s}
        .closeModalIndex=${[]}
        ?i-o-s-fixed-header=${this.iosFixedHeader}
        ?visible=${this._isHelpModalVisible}
        @help-modal-header-click=${this._handleHeaderIconClick}
      >
        <div slot="slot-content">
          ${this._offerTpl} ${this._isTopProduct?J:this._multistepTpl}
          ${this._thankYouTpl}
        </div>
      </bbva-help-modal>
    `}get _renderTemplatesByProductType(){return this._isMposTopProduct||this._isMposProduct?F`
        ${this._mposPriceStockDmTpl} ${this._aemContentFragmentDmTpl}
        ${this._customerContactDetailsDmTpl} ${this._economicActivitiesDmTpl} ${this._accountsDmTpl}
        ${this._customerAddressesDmTpl} ${this._termTypesDmTpl} ${this._documentFileDmTpl}
        ${this._clientOnboardingDmTpl} ${this._servicePaymentsDmTpl} ${this._mposPurchaseDmTpl}
        ${this._helpModalTpl}
      `:this._isTopProduct?F`
        ${this._mposPriceStockDmTpl} ${this._addProductsDmTpl} ${this._aemContentFragmentDmTpl}
        ${this._helpModalTpl}
      `:J}render(){return F`
      <div ambient="primary-alt">
        ${super.render()} ${this._renderTemplatesByProductType} ${this._faqsModalTpl}
      </div>
    `}}customElements.define(qr.is,qr);const Hr="unavailableOperations",Fr="unfinishedOperations",Lr={[Hr]:{retryConfig:{acceptBtLabel:"glomo-standard-error-handler-retry-error",cancelBtLabel:"glomo-standard-error-handler-go-back",className:"error",fullModal:!1,message:"glomo-standard-error-handler-operation-not-done-message-text",srcImage:"./images/micro-error.svg",title:"glomo-standard-error-handler-blocking-title"},callConfig:{acceptBtLabel:"glomo-standard-error-handler-call-btn",className:"full-height-error",fullModal:!0,header:"payments-mpos-digital-sales-error-header",message:"glomo-standard-error-handler-operation-not-done-call-bbva-line-text",srcImage:"./images/errors/error.svg",title:"glomo-standard-error-handler-blocking-title"}},[Fr]:{retryConfig:{cancelBtLabel:"glomo-standard-error-handler-retry-later-exit",message:"glomo-standard-error-handler-operation-not-done-message-text"},callConfig:{acceptBtLabel:"glomo-standard-error-handler-call-btn",className:"full-height-error",fullModal:!0,message:"glomo-standard-error-handler-operation-not-done-call-bbva-line-text",srcImage:"./images/errors/error.svg"}}};class jr extends M{static get is(){return"bbva-controller-oc-cash-zone"}static get properties(){return{isIosNative:{type:Boolean,attribute:"is-ios-native"},isTtlReset:{type:Boolean,attribute:"is-ttl-reset"},localStorageKey:{type:String,attribute:"local-storage-key"},phoneNumber:{type:String,attribute:"phone-number"},retryErrorsId:{type:String,attribute:"retry-errors-id"},upgradeTop:{type:Boolean,attribute:"upgrade-top"}}}constructor(){super(),this.isIosNative=!1,this.isTtlReset=!1,this.localStorageKey="",this.phoneNumber="",this.retryErrorsId="",this.upgradeTop=!1}hideFeature(){this._dispatchEvent("set-hidden",!0)}showFeature(){this._dispatchEvent("set-hidden",!1)}getCustomerId(e){const{customerId:t}=e;this._dispatchEvent("set-customer-id",t)}getAppSettings(e){const{cashZone:{digitalSales:{pagoCie:t,template:s,consentTypes:i,withoutMpos:a}={}}={}}=e,{template:r,consentTypes:n}=a||{},{convenio:{id:o}={}}=t||{},{id:c,templateTypeId:l}=s||{},{id:d,templateTypeId:h}=r||{},p=(null==i?void 0:i.map((e=>e.id)))||[],u=(null==n?void 0:n.map((e=>e.id)))||[],{cashZone:{mpos:{openPayPhoneHelp:m}={}}={}}=e;this._dispatchEvent("set-term-type-id",p),this._dispatchEvent("set-document-id",c),this._dispatchEvent("set-document-type",l),this._dispatchEvent("set-services-id",o),this._dispatchEvent("set-document-id-top",d),this._dispatchEvent("set-document-type-top",h),this._dispatchEvent("set-term-type-id-top",u),this.phoneNumber=m}handleContactAdvisor(){const e=this.phoneNumber.replace(/[\s()]+/g,"");this._dispatchEvent("contact-advisor",{value:e})}handleRetryError(e){const{errorId:t,ERROR_IDS:s}=e;let i=Fr;t===s.LOAD_OFFER&&(i=Hr);const{retryConfig:a}=Lr[i],{callConfig:r}=Lr[i];this._dispatchEvent("retry-error",{retryErrorData:{errorId:this.retryErrorsId,errorType:i,retryConfig:a,callConfig:r}})}saveLocalStorage(){const e={key:this.localStorageKey,value:{isOpenPayUser:!0},secure:!0};this._dispatchEvent("set-local-storage",e)}navigateToDashboard(){this._dispatchEvent("navigate-to-dashboard")}openTermsAndConditionsDocument(e){if(Object.keys(e).length){const t={value:e.replace(/(\r\n|\n|\r)/gm,""),mimeType:"application/pdf"};this._dispatchEvent("open-terms-and-conditions-document",t)}}handleUpgradeTopStatus(){this.upgradeTop?this._dispatchEvent("set-product-type",{mpos:!1,top:!0}):(this.isTtlReset=!0,this._dispatchEvent("check-top-capabilities"))}sdkCheckTopCapabilitiesSuccess(e){const{isDeviceCapable:t}=e;t?this._dispatchEvent("set-product-type",{mpos:!0,top:!0}):this._dispatchEvent("set-product-type",{mpos:!0,top:!1})}sdkCheckTopCapabilitiesError(){this._dispatchEvent("set-product-type",{mpos:!0,top:!1})}getMercurioMposFromStorage(){const e={key:this.localStorageKey,secure:!0};this._dispatchEvent("get-local-storage",e)}resetStorageTtl(e){if(Object.keys(e).length&&!this.isTtlReset){const t={key:this.localStorageKey,value:{...e,ttl:""},secure:!0};this.isTtlReset=!0,this._dispatchEvent("set-local-storage",t)}}getDataToGenerateImage(e){this._dispatchEvent("get-image-set-result",e),setTimeout((()=>{this._dispatchEvent("get-image-capture-receipt",{operative:"ocCashZone"})}),100)}resolveImageAndOpenSocialShare(e){const t={shareContent:[{source:"raw",filename:"comprobante_de_operacion.png",content:e.receipt}]};this._dispatchEvent("open-native-social-share",t)}_dispatchEvent(e,t){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}}customElements.define(jr.is,jr);class Vr extends(Ne(M)){static get is(){return"bbva-analyticmanager-oc-cash-zone"}handleAnalyticsShow(e){const{productTypes:t,viewName:s,viewNames:i}=e;let{productType:a}=e;const r=[i.STEP_TERMS_AND_CONDITIONS,i.STEP_SUMMARY,i.PAGE_THANK_YOU].includes(s),n=[t.MPOS_TOP_WITH_CARD_READER,t.MPOS_TOP_WITHOUT_CARD_READER].includes(a),o=[i.PAGE_OFFER,i.STEP_ORDER_INFO,i.STEP_INCOME_ACCOUNT,i.STEP_TERMS_AND_CONDITIONS,i.STEP_SUMMARY,i.PAGE_THANK_YOU].includes(s);!r&&n&&(a=t.MPOS_TOP);const c=this._camelToKebabCase(a),l=this._camelToKebabCase(s);if(o){var d,h;const t=null==e||null===(d=e.payload)||void 0===d?void 0:d.folio,s=null==e||null===(h=e.payload)||void 0===h?void 0:h.amount;this._dispatch(`analytics-${c}-${l}-show`,{operationNumber:t,amount:s})}else this._dispatch(`analytics-${l}-show`)}handleAnalyticsAction(e){const{productTypes:t,viewName:s,action:i}=e;let{productType:a}=e;[t.MPOS_TOP_WITH_CARD_READER,t.MPOS_TOP_WITHOUT_CARD_READER].includes(a)&&(a=t.MPOS_TOP);const r=this._camelToKebabCase(a),n=this._camelToKebabCase(s),o=this._camelToKebabCase(i);this._dispatch(`analytics-${r}-${n}-${o}-action`)}fireAppStepOtp(){this._dispatch("analytics-service-payments-otp")}}customElements.define(Vr.is,Vr);var Ur=W`
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

[data-tag-name=bbva-button-default] {
  margin: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${ee(me.spacer)}))) / 16) * 1rem) 0;
}

[data-tag-name=bbva-form-input] {
  text-align: left;
}

.content-inputs {
  padding-top: calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${ee(me.spacer)}))) / 16) * 1rem);
}
`;const Br="add",Kr="edit",Gr=Object.freeze({SPECIALS_CHARACTERS:/^[!-πÀ-ÿ‘-•‰‹›⁄€™∂∏∑√∫≈≠≤≥◊ﬂ–∞…∆ﬁ—\s]*$/,MAX_CHARACTERS_POSTAL_CODE:/^(?=.[0-9]{5}$)([\s\S]*)*$/});class zr extends(n(Y(M))){static get is(){return"bbva-aggregation-configurable-form-field-set"}static get properties(){return{inputDataConfiguration:{type:Array},_headerType:{type:String},_idValues:{type:Object},_inputValues:{type:Object},_showModal:{type:Boolean},_validDataInput:{type:Object},_hasInvalidTextCharacters:{type:Boolean}}}constructor(){super(),this.inputDataConfiguration=[],this._headerType="",this._idValues={},this._inputValues={},this._showModal=!1,this._validDataInput={},this._hasInvalidTextCharacters=!1}static get styles(){return[Ur,X("bbva-aggregation-configurable-form-field-set-shared-styles")]}static get scopedElements(){return{"bbva-type-text":m,"bbva-help-modal":i,"bbva-form-input":it,"bbva-button-default":p}}updated(e){e.has("inputDataConfiguration")&&(this._inputValues=Object.fromEntries(this.inputDataConfiguration.map((e=>[e.namePropertieInput,""]))),this._idValues=this.inputDataConfiguration.map((e=>e.namePropertieInput)),this._validDataInput=Object.fromEntries(this.inputDataConfiguration.map((e=>[e.namePropertieInput,!1]))))}openModalAddAddress(){this._headerType=Br,this._openModal()}openModalEditAddress(){this._headerType=Kr,this._openModal()}closeModal(){this._showModal=!1,this.dispatchEvent(new CustomEvent("bbva-aggregation-configurable-form-field-set-close",{bubbles:!0,composed:!0}))}reset(){Object.keys(this._inputValues).forEach((e=>{this._inputValues[e]=""})),this._idValues.forEach((e=>{this.shadowRoot.querySelector(`#${e}`).value=""}))}_openModal(){this._showModal=!0,this.dispatchEvent(new CustomEvent("bbva-aggregation-configurable-form-field-set-open",{bubbles:!0,composed:!0}))}_handleHelpModalCloseClick(e){e.stopPropagation(),this.closeModal()}_handleHelpModalTransitionend(e){e.stopPropagation()}_validateInput(e,t){this._validDataInput[e]=t}_saveValueInput(e,t){this.inputDataConfiguration.map((s=>(s.namePropertieInput===e&&(this._inputValues[e]=t,this._hasInvalidTextCharacters=!Gr.SPECIALS_CHARACTERS.test(this._inputValues[e]),this._hasInvalidTextCharacters?s.errorMessage=`${this.t(`${this.constructor.is}-error-message-emoji`)}`:s.errorMessage="postalCode"===e?`${this.t(`${this.constructor.is}-error-message-postcode`)}`:`${this.t(`${this.constructor.is}-error-message-maximum-characters`)}`),s))),this.requestUpdate()}_clearInput(e){this._inputValues[e]="",this.requestUpdate()}_sendAddressData(){this.dispatchEvent(new CustomEvent("bbva-aggregation-configurable-form-field-set-submit",{bubbles:!0,composed:!0,detail:this._inputValues})),this.closeModal()}get _isSaveButtonDisabled(){const e=this.inputDataConfiguration.filter((e=>e.optional)).map((e=>e.namePropertieInput));return!Object.keys(this._inputValues).every((t=>!e.includes(t)&&""!==this._inputValues[t]&&!this._validDataInput[t]||e.includes(t)&&!this._validDataInput[t]))}get _headerTypeText(){return this._headerType===Br?`${this.constructor.is}-header-add-address`:`${this.constructor.is}-header-edit-address`}get _descriptionText(){return F`
      <bbva-type-text
        text=${this.t(`${this.constructor.is}-description`)}
      ></bbva-type-text>
    `}get _formatInputs(){return this.inputDataConfiguration.length?F`
        ${this.inputDataConfiguration.map((e=>F`
            <bbva-form-input
              allowed-pattern=${"number"===e.type?"[0-9]":""}
              class="content-inputs"
              error-message=${e.errorMessage}
              id=${e.namePropertieInput}
              info-message=${this.t(e.infoMessage)}
              label=${this.t(e.label)}
              type=${"number"===e.type?"text":e.type}
              ?auto-validate=${e.autoValidate}
              pattern=${e.pattern}
              @form-input-value-change=${t=>{this._saveValueInput(e.namePropertieInput,t.detail.value)}}
              @form-field-input-clear=${()=>{this._clearInput(e.namePropertieInput)}}
              @form-field-input-validate="${t=>{this._validateInput(e.namePropertieInput,t.detail.invalid)}}"
            >
            </bbva-form-input>
          `))}
      `:F``}get _saveButton(){return F`
      <bbva-button-default
        fullwidth
        text=${this.t(`${this.constructor.is}-save-button-text`)}
        ?disabled=${this._isSaveButtonDisabled}
        @click=${this._sendAddressData}
      >
      </bbva-button-default>
    `}render(){return F`
      <bbva-help-modal
        accessibility-text-icon-right-primary=${this.t(`${this.constructor.is}-accessibility-text-icon-right-primary`)}
        fixed-footer
        full-height
        header-text="${this.t(this._headerTypeText)}"
        hide-content-padding-top
        ?visible=${this._showModal}
        @help-modal-header-click=${this._handleHelpModalCloseClick}
        @help-modal-veil-click=${this._handleHelpModalCloseClick}
        @help-modal-transitionend=${this._handleHelpModalTransitionend}
      >
        <div slot="slot-content">
          ${this._descriptionText} ${this._formatInputs} ${this._saveButton}
        </div>
      </bbva-help-modal>
    `}}customElements.define(zr.is,zr);var Wr=Object.freeze({__proto__:null});export{pa as B,bt as a,Rt as b,Wr as o};
