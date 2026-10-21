import{aZ as e,J as t,L as a,a7 as i,z as s,a8 as r,ab as n,ak as o,V as c,h as d,i as l,aV as h,aX as p,an as u,cQ as g,cP as m,aS as y,av as b,bl as v,a9 as _,ch as f,fg as $,ep as S,bb as C,fh as x,ac as T,bm as E,bn as I,cJ as k,ah as w}from"./952f98a9.js";import{q as A,aG as P,aI as B,aJ as R,R as D,S as M,v as O,a5 as z,Y as q,az as H,a1 as F,D as N,a6 as V,Z as G,aA as j,a2 as L,G as K,L as U,U as Y,X,E as W,ag as J,I as Q,aC as Z,aq as ee,N as te,z as ae,K as ie,H as se,M as re,an as ne,a4 as oe,ao as ce,a3 as de,aw as le,u as he,O as pe,w as ue,P as ge,d as me,e as ye,ah as be}from"./216055dc.js";import{B as ve,b as _e}from"./1e9ee395.js";import{B as fe,b as $e}from"./d335c75d.js";import{B as Se,b as Ce}from"./972f570a.js";import{a as xe,b as Te}from"./e3d898b2.js";import{a as Ee}from"./e352c657.js";import{bR as Ie,cF as ke,bS as we,bT as Ae,bU as Pe}from"./7f3d7ca9.js";import{B as Be,a as Re,b as De,c as Me,d as Oe,e as ze,f as qe,g as He,h as Fe,i as Ne,j as Ve}from"./eb966b2a.js";import{b as Ge,B as je}from"./dd13577a.js";import{b as Le,B as Ke}from"./2fc6c95e.js";import{b as Ue,B as Ye}from"./6b902eda.js";import{b as Xe,B as We}from"./2b04e291.js";import{B as Je,a as Qe}from"./095cef71.js";import{B as Ze,b as et}from"./161ddab1.js";import{B as tt,a as at}from"./be12d7a2.js";import{b as it,B as st}from"./af1c6cf3.js";import{B as rt}from"./0b83b988.js";import"./ff2cdeea.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./4d2e5f99.js";import"./cf174536.js";import"./c5fdbfff.js";import"./79ad01ce.js";import"./68ec5adf.js";class nt extends A{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`personal-finances/v${this.version}/brands/balances-search`)}toString(){return super.toString("BGADPPersonalFinancesBrandsBalancesSearchPostV2")}}class ot extends A{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`personal-finances/v${this.version}/budgets/search`)}toString(){return super.toString("BGADPPersonalFinancesBudgetsSearchPostV2")}}class ct extends A{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`personal-finances/v${this.version}/forecast/transactions/search`)}toString(){return super.toString("BGADPPersonalFinancesForecastTransactionsSearchPostV2")}}class dt extends A{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`personal-finances/v${this.version}/recurring-expenses/search`)}toString(){return super.toString("BGADPPersonalFinancesRecurringExpensesSearchPostV2")}}let lt=class{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let a=Object(this),i=a.length>>>0;if(0===i)return!1;let s=0|t,r=Math.max(s>=0?s:i-Math.abs(s),0);for(;r<i;){if((n=a[r])===(o=e)||"number"==typeof n&&"number"==typeof o&&isNaN(n)&&isNaN(o))return!0;r++}var n,o;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var a=[],i=0,s="",r=0,n=arguments.length;r!==n;++r){var o=+arguments[r];if(!(o<1114111&&o>>>0===o))throw RangeError("Invalid code point: "+o);o<=65535?i=a.push(o):(o-=65536,i=a.push(55296+(o>>10),o%1024+56320)),i>=16383&&(s+=e.apply(null,a),a.length=0)}return s+e.apply(null,a)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",a=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${a&&a.message}`)}},ht=class extends lt{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}};const pt=0,ut=1,gt="jwt",mt="tsec",yt="none";let bt=class extends lt{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=pt,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new ht,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=mt:this.requiredToken=yt,this.requiresJWT=!1):this.requiredToken===mt?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===gt?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===yt?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(mt)}_setJwtHandler(){this._setTokenHandler(gt)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((a,i)=>{t=Object.assign(t,{resolve:a,reject:i}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let a=this._getRequestHeaders();Object.keys(a).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,a[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let t=null;return!!window.CellsNativePlugins&&(t=e),t}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let a=e.replace(/[\{\}]+/g,""),i=t[a];return i?delete t[a]:this._error(9,`Missing ${a} param value`),i})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let a=Object.keys(t);a.length&&(e=[e,a.map((e=>{let a=t[e];return Array.isArray(a)&&this.paramArrayMode===ut?this._arrayToQueryParam(e,a):`${e}=${a}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(mt,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(gt,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(a){var i=t.getItem(a);i&&"null"!==i&&(e[a]=i)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const a=window.sessionStorage;t=Object.keys(a).filter((t=>t.startsWith(e))).reduce(((t,i)=>(t[i.replace(e,"")]=a.getItem(i),t)),{})}return t}_getTokenForRequestHeaders(e,t){const a=`${e}Handler`,i=e===gt?"JWT ":"",s=e===gt?"Authorization":mt;if(void 0===this[a]||null===this[a])this._error(11,`${e} handler is undefined`);else{const r=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let n=this[a].getItem(r);n?t[s]=t[s]||i+n:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((a=>{t.push(`${a}=${e[a]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(a){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(a){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let a;const i=new Promise(((e,t)=>{a=(a,i)=>{a?t(a):e(i)}}));return t.addEventListener("loadend",(function e(i){t.removeEventListener("loadend",e),i.error?a(i.error):a(null,t.result)})),t.readAsText(e),i}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let a=0;for(;a<e.length;){let i=e[a],s=0,r=0;if(i<=127?(s=0,r=255&i):i<=223?(s=1,r=31&i):i<=239?(s=2,r=15&i):i<=244&&(s=3,r=7&i),e.length-a-s>0){let t=0;for(;t<s;)i=e[a+t+1],r=r<<6|63&i,t+=1}else r=65533,s=e.length-a;t+=String.fromCodePoint(r),a+=s+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},a=e.trim().split(/[\r\n]+/);for(const e in a)if(a.hasOwnProperty(e)&&""!==a[e]){let i=": ",s=a[e].split(i);t[s.shift().toLowerCase()]=s.join(i)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,a,i){let s=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(i)>=0&&(s=t.getResponseHeader(i));break;case this._NATIVE_XHR:t&&t.headers&&(s=JSON.parse(t.headers)[i])}if(s){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):a;e.getItem(t)!==s&&(e.setItem(t,s),this._emitTokenUpdate(a,s))}}_emitTokenUpdate(e,t){if(this.htmlContext){const a=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(a)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,a,i,s,r;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),a=e.getResponseHeader("AuthenticationData"),i=e.getResponseHeader("AuthenticationState"),s=e.getResponseHeader("AuthenticationChallenge"),r=e.getResponseHeader("AuthenticationResponse");else{let n=JSON.parse(e.headers);t=n.authenticationtype,a=n.authenticationdata||null,i=n.authenticationstate,s=n.authenticationchallenge,r=n.authenticationresponse}return{type:t,data:a,state:i,challenge:s,response:r}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",a=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const i=this._getSignatureData(e,t,a);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:i}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",a="",i=""){let s;if("object"==typeof e&&e){const r=this._getSignatureData(e.signatureType,t,a);s=this._makeKeyValuePairFromObject(r,e.signatureValue),e.challenge&&(s+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(s,e.signatureType,i)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(s=`password=${e}`,this._buildSignatureHeaders(s,"2",i)):(s=`${a}=${e}`,this._buildSignatureHeaders(s,t,i)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let a,i=e.split(",");if(i.length>1){a=i.map((e=>`${e}=${t[e]}`)).join(",")}else a=`${e}=${t}`;return a}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",a=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),a&&(this.headers=Object.assign(this.headers,{AuthenticationState:a})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let a=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),s=this._ERROR_CODES.SIGNATURE_INVALID.includes(i),{type:r,data:n,state:o,challenge:c,response:d}=this._extractSignatureResponseHeaders(e),l=this._getRequestMetadata(e);if(s)this._notifySignatureInvalid(l),a=!0;else if(r)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(i)?(this._notifySignatureTypeUsingErrorCode(i,l,r,n,o,c,d),a=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(l,r,n,o,c,d),a=!0}return a}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let a=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),s=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(i),r=this._getRequestMetadata(e);s&&(this._notifyWaitingForProcessResponse(r),a=!0)}return a}_notifySignatureRequiredFirstStep(e,t,a,i){this._defineSignatureType(t,a),this._defineSignatureValue(t,a,i),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:a,metadata:e}}))}_notifySignatureRequired(e,t,a,i,s,r){this._defineSignatureValue(t,a,i);const n={type:t,data:a,challenge:s,metadata:e};r&&(n.response=r),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:n}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:a}=e;return{path:this._path,method:this.method,url:t,status:a}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",a=""){const i=t.split(";").findIndex((t=>t===e));return a?a.split(";")[i]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,a,i,s,r){i?this._notifySignatureRequired(e,t,a,i,s,r):this._notifySignatureRequiredFirstStep(e,t,a,i)}_notifySignatureTypeUsingErrorCode(e,t,a,i,s,r,n){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,a,i,s):this._notifySignatureRequired(t,a,i,s,r,n)}},vt=class extends bt{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}};class _t extends bt{constructor(e=null){super(Object.assign(e||{},{method:"POST"}))}toString(e=""){return super.toString(e||"BGADPRequestPOST")}}class ft extends vt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`personal-finances/v${this.version}/pfms`)}toString(){return super.toString("BGADPPersonalFinancesPfmsGetV1")}}class $t extends _t{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`personal-finances/v${this.version}/pfms`)}toString(){return super.toString("BGADPPersonalFinancesPfmsPostV1")}}class St extends(t(a)){}class Ct extends St{static get is(){return"bbva-global-pfms-api-dm"}static get properties(){return{pfms:{type:Array,attribute:!1}}}constructor(){super(),this.pfms=[]}resetPfms(){this.pfms=[]}getPfms(e={}){if(Object.keys(this.pfms).length)return;this._generateGetService(this._getService("get",{},e),{customEvent:"pfms-api-dm-fetch",errorFireEventHandler:"pfms-api-dm-fetch-error"},this._responseMapping,e.fields)}postPfms(e){this._generateGetService(this._getService("post",e),{customEvent:"pfms-api-dm-create",errorFireEventHandler:"pfms-api-dm-create-error"},this._responseMapping),this.resetPfms()}_getService(e,t={},a={}){const i=this._getServiceParams(a,t);return this._getServicePath(`${e}Pfms`,this._getBgadp(i))}_getBgadp(e){return{getPfmsV2:()=>new P(e),getPfmsV1:()=>new ft(e),postPfmsV1:()=>new $t(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}class xt extends St{static get is(){return"bbva-global-balances-search-api-dm"}static get properties(){return{balancesSearch:{type:Object,attribute:!1}}}constructor(){super(),this.balancesSearch={}}resetBalancesSearch(){this.balancesSearch={}}postBalancesSearch(e){if(Object.keys(this.balancesSearch).length)return;this._generateGetService(this._getService("post",e),{customEvent:"balances-search-api-dm-fetch",errorFireEventHandler:"balances-search-api-dm-fetch-error"},this._responseMapping)}_getService(e,t={},a={}){const i=this._getServiceParams(a,t);return this._getServicePath(`${e}BalancesSearch`,this._getBgadp(i))}_getBgadp(e){return{postBalancesSearchV2:()=>new Ie(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}class Tt extends St{static get is(){return"bbva-global-brands-balances-search-api-dm"}static get properties(){return{brandsBalancesSearch:{type:Object,attribute:!1}}}constructor(){super(),this.brandsBalancesSearch={}}resetBrandsBalancesSearch(){this.brandsBalancesSearch={}}postBrandsBalancesSearch(e){if(Object.keys(this.brandsBalancesSearch).length)return;this._generateGetService(this._getService("post",e),{customEvent:"brands-balances-search-api-dm-fetch",errorFireEventHandler:"brands-balances-search-api-dm-fetch-error"},this._responseMapping)}_getService(e,t={},a={}){const i=this._getServiceParams(a,t);return this._getServicePath(`${e}BrandsBalancesSearch`,this._getBgadp(i))}_getBgadp(e){return{postBrandsBalancesSearchV2:()=>new nt(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}class Et extends St{static get is(){return"bbva-global-budgets-search-api-dm"}static get properties(){return{budgetsSearch:{type:Array,attribute:!1}}}constructor(){super(),this.budgetsSearch=[]}resetBudgetsSearch(){this.budgetsSearch=[]}postBudgetsSearch(e){if(Object.keys(this.budgetsSearch).length)return;this._generateGetService(this._getService("post",e),{customEvent:"budgets-search-api-dm-fetch",paginationEvent:"budgets-search-api-dm-pagination",errorFireEventHandler:"budgets-search-api-dm-fetch-error"},this._responseMapping,this._paginationMapping)}_getService(e,t={},a={}){const i=this._getServiceParams(a,t);return this._getServicePath(`${e}BudgetsSearch`,this._getBgadp(i))}_getBgadp(e){return{postBudgetsSearchV2:()=>new ot(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}_paginationMapping(e){return e}}class It extends St{static get is(){return"bbva-global-forecast-balances-search-api-dm"}static get properties(){return{forecastBalancesSearch:{type:Object,attribute:!1}}}constructor(){super(),this.forecastBalancesSearch={}}resetForecastBalancesSearch(){this.forecastBalancesSearch={}}postForecastBalancesSearch(e){if(Object.keys(this.forecastBalancesSearch).length)return;this._generateGetService(this._getService("post",e),{customEvent:"forecast-balances-search-api-dm-fetch",errorFireEventHandler:"forecast-balances-search-api-dm-fetch-error"},this._responseMapping)}_getService(e,t={},a={}){const i=this._getServiceParams(a,t);return this._getServicePath(`${e}ForecastBalancesSearch`,this._getBgadp(i))}_getBgadp(e){return{postForecastBalancesSearchV2:()=>new Je(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}class kt extends St{static get is(){return"bbva-global-forecast-transactions-search-api-dm"}static get properties(){return{forecastTransactionsSearch:{type:Array,attribute:!1}}}constructor(){super(),this.forecastTransactionsSearch=[]}resetForecastTransactionsSearch(){this.forecastTransactionsSearch=[]}postForecastTransactionsSearch(e){if(Object.keys(this.forecastTransactionsSearch).length)return;this._generateGetService(this._getService("post",e),{customEvent:"forecast-transactions-search-api-dm-fetch",paginationEvent:"forecast-transactions-search-api-dm-pagination",errorFireEventHandler:"forecast-transactions-search-api-dm-fetch-error"},this._responseMapping,this._paginationMapping)}_getService(e,t={},a={}){const i=this._getServiceParams(a,t);return this._getServicePath(`${e}ForecastTransactionsSearch`,this._getBgadp(i))}_getBgadp(e){return{postForecastTransactionsSearchV2:()=>new ct(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}_paginationMapping(e){return e}}class wt extends St{static get is(){return"bbva-global-recurring-expenses-balances-search-api-dm"}static get properties(){return{recurringExpensesBalancesSearch:{type:Object,attribute:!1}}}constructor(){super(),this.recurringExpensesBalancesSearch={}}resetRecurringExpensesBalancesSearch(){this.recurringExpensesBalancesSearch={}}postRecurringExpensesBalancesSearch(e){if(Object.keys(this.recurringExpensesBalancesSearch).length)return;this._generateGetService(this._getService("post",e),{customEvent:"recurring-expenses-balances-search-api-dm-fetch",errorFireEventHandler:"recurring-expenses-balances-search-api-dm-fetch-error"},this._responseMapping)}_getService(e,t={},a={}){const i=this._getServiceParams(a,t);return this._getServicePath(`${e}RecurringExpensesBalancesSearch`,this._getBgadp(i))}_getBgadp(e){return{postRecurringExpensesBalancesSearchV2:()=>new Qe(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}class At extends St{static get is(){return"bbva-global-recurring-expenses-search-api-dm"}static get properties(){return{recurringExpensesSearch:{type:Array,attribute:!1}}}constructor(){super(),this.recurringExpensesSearch=[]}resetRecurringExpensesSearch(){this.recurringExpensesSearch=[]}postRecurringExpensesSearch(e){if(Object.keys(this.recurringExpensesSearch).length)return;this._generateGetService(this._getService("post",e),{customEvent:"recurring-expenses-search-api-dm-fetch",errorFireEventHandler:"recurring-expenses-search-api-dm-fetch-error"},this._responseMapping)}_getService(e,t={},a={}){const i=this._getServiceParams(a,t);return this._getServicePath(`${e}RecurringExpensesSearch`,this._getBgadp(i))}_getBgadp(e){return{postRecurringExpensesSearchV2:()=>new dt(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}class Pt extends St{static get is(){return"bbva-global-transactions-search-api-dm"}static get properties(){return{transactionsSearch:{type:Array,attribute:!1}}}constructor(){super(),this.transactionsSearch=[]}resetTransactionsSearch(){this.transactionsSearch=[]}postTransactionsSearch(e){if(Object.keys(this.transactionsSearch).length)return;this._generateGetService(this._getService("post",e),{customEvent:"transactions-search-api-dm-fetch",paginationEvent:"transactions-search-api-dm-pagination",errorFireEventHandler:"transactions-search-api-dm-fetch-error"},this._responseMapping,this._paginationMapping)}_getService(e,t={},a={}){const i=this._getServiceParams(a,t);return this._getServicePath(`${e}TransactionsSearch`,this._getBgadp(i))}_getBgadp(e){return{postTransactionsSearchV2:()=>new ke(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}_paginationMapping(e){return e}}class Bt extends St{static get is(){return"bbva-global-brand-balances-brand-base-api-dm"}postBrandBalancesBrand(e,t){const a={"brand-id":e};this._generateGetService(this._getService("post",t,a),this.constructor.POST_EVENTS,this._responseMapping)}_getService(e,t={},a={}){const i=this._getServiceParams(a,t);return this._getServicePath(`${e}BrandBalancesBrand`,this._getBgadp(i))}_getBgadp(e){return{postBrandBalancesBrandV2:()=>new Be(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}i(Bt,"POST_EVENTS",{customEvent:"brand-balances-brand-api-dm-create",errorFireEventHandler:"brand-balances-brand-api-dm-create-error"}),customElements.define(Bt.is,Bt);class Rt extends St{static get is(){return"bbva-global-brand-groups-search-base-api-dm"}resetBrandGroupsSearch(){this.brandGroupsSearch=[]}postBrandGroupsSearch(e,t){const a={"brand-id":e};this._generateGetService(this._getService("post",t,a),this.constructor.POST_EVENTS,this._responseMapping)}_getService(e,t={},a={}){const i=this._getServiceParams(a,t);return this._getServicePath(`${e}BrandGroupsSearch`,this._getBgadp(i))}_getBgadp(e){return{postBrandGroupsSearchV2:()=>new Re(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}i(Rt,"POST_EVENTS",{customEvent:"brand-groups-search-api-dm-fetch",errorFireEventHandler:"brand-groups-search-api-dm-fetch-error"}),customElements.define(Rt.is,Rt);class Dt extends St{static get is(){return"bbva-global-brand-search-detail-base-api-dm"}resetBrandSearchDetail(){this.brandSearchDetail={}}postBrandSearchDetail(e,t){const a={"brand-id":e};this._generateGetService(this._getService("post",t,a),this.constructor.POST_EVENTS,this._responseMapping)}_getService(e,t={},a={}){const i=this._getServiceParams(a,t);return this._getServicePath(`${e}BrandSearchDetail`,this._getBgadp(i))}_getBgadp(e){return{postBrandSearchDetailV2:()=>new De(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}i(Dt,"POST_EVENTS",{customEvent:"brand-search-detail-api-dm-fetch",errorFireEventHandler:"brand-search-detail-api-dm-fetch-error"}),customElements.define(Dt.is,Dt);class Mt extends St{static get is(){return"bbva-global-recurring-expense-balances-base-api-dm"}resetRecurringExpenseBalances(){this.recurringExpenseBalances={}}getRecurringExpenseBalances(e,t){t=Object.assign({"recurring-expense-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},a={}){const i=this._getServiceParams(a,t);return this._getServicePath(`${e}RecurringExpenseBalances`,this._getBgadp(i))}_getBgadp(e){return{getRecurringExpenseBalancesV2:()=>new Me(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}i(Mt,"GET_EVENTS",{customEvent:"recurring-expense-balances-api-dm-fetch",errorFireEventHandler:"recurring-expense-balances-api-dm-fetch-error"}),customElements.define(Mt.is,Mt);class Ot extends St{static get is(){return"bbva-global-budgets-base-api-dm"}postBudgets(e){this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping)}_getService(e,t={},a={}){const i=this._getServiceParams(a,t);return this._getServicePath(`${e}Budgets`,this._getBgadp(i))}_getBgadp(e){return{postBudgetsV2:()=>new Oe(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}i(Ot,"POST_EVENTS",{customEvent:"budgets-api-dm-create",errorFireEventHandler:"budgets-api-dm-create-error"}),customElements.define(Ot.is,Ot);class zt extends St{static get is(){return"bbva-global-budget-base-api-dm"}resetBudget(){this.budget={}}getBudget(e,t){t=Object.assign({"budget-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}patchBudget(e,t){const a={"budget-id":e};this._generateGetService(this._getService("patch",t,a),this.constructor.PATCH_EVENTS,this._responseMapping),this.resetBudget()}deleteBudget(e,t){t=Object.assign({"budget-id":e},t),this._generateGetService(this._getService("delete",{},t),this.constructor.DELETE_EVENTS,this._responseMapping),this.resetBudget()}_getService(e,t={},a={}){const i=this._getServiceParams(a,t);return this._getServicePath(`${e}Budget`,this._getBgadp(i))}_getBgadp(e){return{deleteBudgetV2:()=>new ze(e),getBudgetV2:()=>new qe(e),patchBudgetV2:()=>new He(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}i(zt,"GET_EVENTS",{customEvent:"budget-api-dm-fetch",errorFireEventHandler:"budget-api-dm-fetch-error"}),i(zt,"PATCH_EVENTS",{customEvent:"budget-api-dm-update",errorFireEventHandler:"budget-api-dm-update-error"}),i(zt,"DELETE_EVENTS",{customEvent:"budget-api-dm-delete",errorFireEventHandler:"budget-api-dm-delete-error"}),customElements.define(zt.is,zt);class qt extends St{static get is(){return"bbva-global-transactions-base-api-dm"}patchTransactions(e){this._generateGetService(this._getService("patch",e,{}),this.constructor.PATCH_EVENTS,this._responseMapping)}_getService(e,t={},a={}){const i=this._getServiceParams(a,t);return this._getServicePath(`${e}Transactions`,this._getBgadp(i))}_getBgadp(e){return{patchTransactionsV2:()=>new B(e),default:()=>"BGADP does not exist."}}}i(qt,"PATCH_EVENTS",{customEvent:"transactions-api-dm-update",errorFireEventHandler:"transactions-api-dm-update-error"}),customElements.define(qt.is,qt);class Ht extends St{static get is(){return"bbva-global-transaction-base-api-dm"}resetTransaction(){this.transaction={}}getTransaction(e,t){t=Object.assign({"transaction-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},a={}){const i=this._getServiceParams(a,t);return this._getServicePath(`${e}Transaction`,this._getBgadp(i))}_getBgadp(e){return{getTransactionV2:()=>new R(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}i(Ht,"GET_EVENTS",{customEvent:"transaction-api-dm-fetch",errorFireEventHandler:"transaction-api-dm-fetch-error"}),customElements.define(Ht.is,Ht);class Ft extends St{static get is(){return"bbva-global-transaction-similar-transactions-search-base-api-dm"}resetTransactionSimilarTransactionsSearch(){this.transactionSimilarTransactionsSearch=[]}postTransactionSimilarTransactionsSearch(e,t){const a={"transaction-id":e};this._generateGetService(this._getService("post",t,a),this.constructor.POST_EVENTS,this._responseMapping)}_getService(e,t={},a={}){const i=this._getServiceParams(a,t);return this._getServicePath(`${e}TransactionSimilarTransactionsSearch`,this._getBgadp(i))}_getBgadp(e){return{postTransactionSimilarTransactionsSearchV2:()=>new Fe(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}i(Ft,"POST_EVENTS",{customEvent:"transaction-similar-transactions-search-api-dm-fetch",errorFireEventHandler:"transaction-similar-transactions-search-api-dm-fetch-error"}),customElements.define(Ft.is,Ft);class Nt extends St{static get is(){return"bbva-global-recurring-expense-base-api-dm"}resetRecurringExpense(){this.recurringExpense={}}getRecurringExpense(e,t){t=Object.assign({"recurring-expense-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}patchRecurringExpense(e,t){const a={"recurring-expense-id":e};this._generateGetService(this._getService("patch",t,a),this.constructor.PATCH_EVENTS,this._responseMapping),this.resetRecurringExpense()}_getService(e,t={},a={}){const i=this._getServiceParams(a,t);return this._getServicePath(`${e}RecurringExpense`,this._getBgadp(i))}_getBgadp(e){return{getRecurringExpenseV2:()=>new Ne(e),patchRecurringExpenseV2:()=>new Ve(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}i(Nt,"GET_EVENTS",{customEvent:"recurring-expense-api-dm-fetch",errorFireEventHandler:"recurring-expense-api-dm-fetch-error"}),i(Nt,"PATCH_EVENTS",{customEvent:"recurring-expense-api-dm-update",errorFireEventHandler:"recurring-expense-api-dm-update-error"}),customElements.define(Nt.is,Nt);const{moment:Vt}=window;function Gt(e){const t=Vt();return(e.isAfter(t)?e:t).startOf("day").toISOString()}function jt(e){return e.endOf("day").toISOString()}function Lt(e){return e?e[0].toUpperCase()+e.slice(1).toLowerCase():""}function Kt({startDate:e,endDate:t},a){const i=(e,t)=>new Date(e).toLocaleDateString(a,t),s={day:"numeric",month:"short"},r={year:"numeric"},n=-1!==a.indexOf("en")?",":"",o=s,c=i(e,s),d=i(t,o),l=i(t,r);return`${c}${n} ${i(e,r)} - ${d}${n} ${l}`}function Ut(e,t){const a=(e,a)=>new Date(e).toLocaleDateString(t,a),i=-1!==t.indexOf("en")?",":"";return`${a(e,{day:"numeric",month:"short"})}${i} ${a(e,{year:"numeric"})} `}var Yt=s`
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

  :host(:active) {
    background-color: var(--_pfm-categorization-detail-list-movement-bg-active-color);
  }
  :host(:active) [data-tag-name='bbva-type-text'][variant='spotlight'] {
    color: var(--_pfm-categorization-detail-list-movement-title-pressed-color);
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

  .main-content {
    display: flex;
    flex-direction: column;
    padding: 1rem;
  }
  .main-content .title-row {
    display: flex;
    justify-content: space-between;
  }
  .main-content .title-row .clip-title {
    margin-right: 1rem;
  }
  .main-content .title-row .clip-title [data-tag-name='bbva-clip-box'] {
    margin-right: 0.5rem;
    float: left;
  }
  .main-content .title-row .clip-title [data-tag-name='bbva-type-text'] {
    display: inline;
    vertical-align: top;
    -webkit-hyphens: auto;
    hyphens: auto;
  }
  .main-content .extended-concept {
    margin-top: 0.5rem;
  }
  .main-content .contract-alias {
    margin-top: 0.5rem;
  }
  .main-content .bank-info {
    margin-top: 0.5rem;
  }
  .main-content [data-tag-name='bbva-badge-icon'] {
    margin-top: 1rem;
  }
  .main-content .bank-number {
    font-weight: var(
      --fontFacePrimaryBookItalicFontWeight,
      ${r(n.bookItalic.fontWeight)}
    );
    font-style: var(
      --fontFacePrimaryBookItalicFontStyle,
      ${r(n.bookItalic.fontStyle)}
    );
    color: var(--_pfm-categorization-detail-list-movement-bank-number-color);
  }

  :host([loading]) {
    position: relative;
    overflow: hidden;
    pointer-events: none;
    background-repeat: no-repeat;
    opacity: 1;
    height: 4.75rem;
    width: 100%;
    margin-left: auto;
    margin-right: auto;
    background-image: linear-gradient(
        -60deg,
        transparent 50%,
        var(--_pfm-categorization-detail-list-movement-skeleton-quote-color) 50%
      ),
      linear-gradient(
        -60deg,
        var(--_pfm-categorization-detail-list-movement-skeleton-quote-color) 50%,
        transparent 50%
      ),
      linear-gradient(
        -60deg,
        transparent 50%,
        var(--_pfm-categorization-detail-list-movement-skeleton-quote-color) 50%
      ),
      linear-gradient(
        -60deg,
        var(--_pfm-categorization-detail-list-movement-skeleton-quote-color) 50%,
        transparent 50%
      );
    background-color: transparent;
    background-size:
      calc((26% * 2) + (16px / 2)) 16px,
      calc((32% * 2) + (16px / 2)) 16px,
      calc((15% * 2) + (16px / 2)) 16px,
      calc((20% * 2) + (16px / 2)) 16px;
    background-position:
      16px 16px,
      calc(100% - 16px) 16px,
      16px 44px,
      calc(100% - 16px) 44px;
  }
  :host([loading]) .skeleton {
    contain: strict;
    position: absolute;
    left: 0;
    top: 0;
    right: 0;
    bottom: 0;
    background: var(--_pfm-categorization-detail-list-movement-skeleton-animated-layer-bg);
    opacity: 0.5;
    transform: translateX(200%) scaleX(1);
    transform-origin: right bottom;
    animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  }
  :host([loading]) > :nth-child(n) {
    opacity: 0;
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
`,Xt=s`
  :host {
    --_pfm-categorization-detail-list-movement-bank-number-color: ${D("colorPrimaryText02Default",M)};
    --_pfm-categorization-detail-list-movement-bg-active-color: ${D("colorPrimarySurfaceAlternativeDefault",M)};
    --_pfm-categorization-detail-list-movement-skeleton-animated-layer-bg: ${D("colorPrimarySurfaceAmbientDefault",M)};
    --_pfm-categorization-detail-list-movement-skeleton-quote-color: ${D("colorPrimarySurfaceAmbientPreloading",M)};
    --_pfm-categorization-detail-list-movement-title-pressed-color: ${D("colorPrimaryLinkMainPressed",M)};
  }
`;class Wt extends(O(a)){static get is(){return"pfm-categorization-detail-list-movement"}static get scopedElements(){const e=[V,Ae,G,j,L,K];return Wt.scopedElementsFromClasses(e)}static get properties(){return{accessibilityMask:{type:String,attribute:"accessibility-mask"},amount:{type:Number},amountType:{type:String,attribute:"amount-type"},bgColorClip:{type:String,attribute:"bg-color-clip"},category:{type:String},contractAlias:{type:String,attribute:"contract-alias"},currencyCode:{type:String,attribute:"currency-code"},discreetMode:{type:Boolean,attribute:"discreet-mode"},extendedConcept:{type:String,attribute:"extended-concept"},heading:{type:String},iconClip:{type:String,attribute:"icon-clip"},image:{type:String},language:{type:String},loading:{type:Boolean,reflect:!0},mask:{type:String},noLink:{type:Boolean,attribute:"no-link"},subcategoryName:{type:String,attribute:"subcategory-name"}}}constructor(){super(),this.amountType="",this.bgColorClip="",this.category="",this.contractAlias="",this.discreetMode=!1,this.extendedConcept="",this.iconClip="",this.image="",this.language="en-EN",this.loading=!1,this.mask="",this.noLink=!1,this.subcategoryName=""}static get styles(){return[Yt,Xt,z.primary,we.primary,q.primary,H.primary,F.primary,N.primary,o(`${Wt.is}-shared-styles`)]}get _mask(){const e=c(this.mask,"•",!0,4),t=d`
      <div class="wrapper">
        <span class="sr-only">${this.accessibilityMask}</span>
        <span aria-hidden="true" class="mask">${e[0]}</span>
        <span class="number">${e.substr(1)}</span>
      </div>
    `;return d`
      <div class="bank-info">
        <span class="bank-number"> ${t} </span>
      </div>
    `}get _calculatedImageDark(){if(!this.image)return"";const e=this.image.lastIndexOf(".");return[this.image.slice(0,e),"_dark",this.image.slice(e)].join("")}get _listMovementImageItem(){const e={bgColor:this.bgColorClip,icon:this.iconClip,size:"xs"};return this.image&&(e.image=this.image),this._calculatedImageDark&&(e.imageDark=this._calculatedImageDark),e}static _getTypeTextTmpl({fontWeight:e,size:t,style:a,text:i,variant:s}){return d`
      <bbva-type-text
        ambient="primary"
        class="${l(a)}"
        font-weight="${l(e)}"
        size="${t}"
        tag="span"
        text="${i}"
        unset
        variant="${l(s)}"
      ></bbva-type-text>
    `}render(){return d`
      ${this.loading&&d` <div class="skeleton"></div> `||d`
        <div class="main-content">
          <div class="title-row">
            <div class="clip-title">
              ${this.image||this.iconClip?d`
                    <bbva-clip-box
                      ambient="primary"
                      mode="${this.mode}"
                      .group=${[this._listMovementImageItem]}
                    ></bbva-clip-box>
                  `:h}
              ${Wt._getTypeTextTmpl({fontWeight:this.noLink?"500":void 0,size:"L",text:this.heading,variant:this.noLink?void 0:"spotlight"})}
            </div>
            <bbva-type-amount
              ?mask="${this.discreetMode}"
              ambient="primary"
              amount="${this.amount}"
              currency-code="${l(this.currencyCode)}"
              language="${this.language}"
              local-currency="${l(this.currencyCode)}"
              type="${l(this.amountType)}"
              variant="l"
            ></bbva-type-amount>
          </div>
          ${this.contractAlias?Wt._getTypeTextTmpl({size:"S",style:"contract-alias",text:this.contractAlias}):h}
          ${this.mask&&!this.contractAlias?this._mask:h}
          ${this.extendedConcept?d`
                <bbva-badge-default
                  ambient="primary"
                  class="extended-concept"
                  text="${Lt(this.extendedConcept)}"
                  type="neutral"
                ></bbva-badge-default>
              `:h}
          ${this.category&&this.subcategoryName?d`
                <bbva-badge-icon
                  ambient="primary"
                  category="${this.category}"
                  description="${this.subcategoryName}"
                  has-ellipsis
                ></bbva-badge-icon>
              `:h}
        </div>
      `}
    `}}var Jt=s`
  :host {
    --_pfm-categorization-detail-bg-color-primary-alt: ${D("colorPrimaryAltSurfaceAmbientDefault",M)};
  }
`,Qt=s`
  :host {
    display: block;
    box-sizing: border-box;
    text-align: left;
  }

  *,
  *:before,
  *:after {
    box-sizing: inherit;
  }

  [data-tag-name='bbva-expandable-accordion'] {
    margin-top: 0.5rem;
  }
  [data-tag-name='bbva-expandable-accordion'] .customHeader2 {
    padding-left: 1rem;
    width: 90%;
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding-right: 0.5rem;
  }
  [data-tag-name='bbva-expandable-accordion'] .customHeader2 .notification {
    display: flex;
    align-items: center;
    min-width: 0;
  }
  [data-tag-name='bbva-expandable-accordion']
    .customHeader2
    .notification
    [data-tag-name='bbva-type-text'] {
    margin-right: 0.5rem;
    overflow: hidden;
  }
  [data-tag-name='bbva-expandable-accordion']
    .customHeader2
    .notification
    [data-tag-name='bbva-badge-notification'] {
    margin-right: 0.5rem;
  }

  [ambient='primary-alt'] {
    background-color: var(--_pfm-categorization-detail-bg-color-primary-alt);
  }
`;class Zt extends(p(U(u(a)))){static get is(){return"pfm-categorization-detail-brands-forecast"}static get scopedElements(){const e=[X,We,At,wt,L,K,Wt];return Zt.scopedElementsFromClasses(e)}static get properties(){return{cacheType:{type:String,attribute:"cache-type"},contractId:{type:String,attribute:"contract-id"},contractSubtypeId:{type:String,attribute:"contract-subtype-id"},contractTypeId:{type:String,attribute:"contract-type-id"},darkModeScheme:{type:String,attribute:"dark-mode-scheme"},discreetMode:{type:Boolean,attribute:"discreet-mode"},period:{type:Object},personalFinancesApiVersion:{type:String,attribute:"personal-finances-api-version"},pfmId:{type:String,attribute:"pfm-id"},recurringExpensesBalancesCacheKey:{type:String,attribute:"recurring-expenses-cache-key"},recurringExpensesCacheKey:{type:String,attribute:"recurring-expenses-cache-key"},_recurringExpenses:{type:Array,state:!0},_recurringExpensesBalances:{type:Array,state:!0},_loading:{type:Boolean,state:!0}}}constructor(){super(),this._loading=!1,this.darkModeScheme="",this.discreetMode=!1}static get styles(){return[Qt,Jt,Y.primary,Xe.primary,F.primary,N.primary]}firstUpdated(){super.firstUpdated(),this._recurringExpensesBalancesSearchDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-recurring-expenses-balances-search-api-dm"]'),this._recurringExpensesSearchDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-recurring-expenses-search-api-dm"]')}updated(e){super.updated(e),e.has("period")&&this._sendGetRecurringExpBalancesSearchRequest()}static getAmount(e,t){return e.find((({frequency:e})=>e.id===t))}get _endDate(){var e;return jt(null===(e=this.period)||void 0===e?void 0:e.endDate)}get _headers(){return this.headers||{"accept-language":this.language}}get _startDate(){var e;return Gt(null===(e=this.period)||void 0===e?void 0:e.startDate)}get _requestParams(){return{pfmId:this.pfmId,periodStartDate:this._startDate,periodEndDate:this._endDate,isPaid:!1,...this.contractId&&{contracts:[{id:this.contractId,"productType.id":this.contractTypeId,...this.contractSubtypeId&&{"subProductType.id":this.contractSubtypeId}}]}}}_sendGetRecurringExpBalancesSearchRequest(){this._loading=!0,this._recurringExpensesBalancesSearchDm.postRecurringExpensesBalancesSearch(this._requestParams)}_manageRecurringExpBalancesSearchResponse({detail:e}){this._loading=!1,e&&this._sendGetRecurringExpSearchRequest(),this._recurringExpensesBalances=null==e?void 0:e.balances.find((({frequency:e})=>"MONTHLY"===e.id))}_sendGetRecurringExpSearchRequest(){this._recurringExpensesSearchDm.postRecurringExpensesSearch(this._requestParams)}_manageRecurringExpSearchResponse({detail:e}){this._recurringExpenses=e}_manageRecurringExpSearchError(){this._loading=!1}_manageRecurringExpBalancesSearchError(){this._loading=!1}_handleRecurringExpItemClick(e){this.dispatchEvent(new CustomEvent("pfm-categorization-detail-movements-recurring-expense-selected",{detail:{params:e},bubbles:!0,composed:!0}))}get _content(){var e,t,a,i,s,r;return this._recurringExpensesBalances||this._loading?d`
      <bbva-expandable-accordion
        ?loading="${this._loading}"
        ambient="primary-alt"
        divider="full"
        size="L"
      >
        <div slot="header" class="customHeader2">
          <div class="notification">
            <bbva-type-text
              ellipsis
              font-weight="500"
              size="S"
              text="${this.t("pfm-categorization-detail-forecast-title")}"
            ></bbva-type-text>
            <bbva-badge-notification
              accessibility-text="${null===(e=this._recurringExpenses)||void 0===e?void 0:e.length}"
              text="${null===(t=this._recurringExpenses)||void 0===t?void 0:t.length}"
            ></bbva-badge-notification>
          </div>
          <bbva-type-amount
            ?mask="${this.discreetMode}"
            amount="${null===(a=this._recurringExpensesBalances)||void 0===a?void 0:a.expense.amount}"
            currency-code="${null===(i=this._recurringExpensesBalances)||void 0===i?void 0:i.expense.currency}"
            language="${this.language}"
            local-currency="${null===(s=this._recurringExpensesBalances)||void 0===s?void 0:s.expense.currency}"
            variant="m"
          ></bbva-type-amount>
        </div>
        <div slot="content">
          ${null===(r=this._recurringExpenses)||void 0===r?void 0:r.map(((e,t,a)=>{var i,s;const r=Zt.getAmount(e.amounts,"MONTHLY"),n=null===(i=e.image)||void 0===i||null===(s=i.link)||void 0===s?void 0:s.href;return d`
              <pfm-categorization-detail-list-movement
                ?discreet-mode="${this.discreetMode}"
                accessibility-mask="${this.t("pfm-categorization-detail-mask-products")}"
                amount="${r.expense.amount}"
                currency-code="${null==r?void 0:r.expense.currency}"
                heading="${e.name}"
                image="${l(n)}"
                language="${this.language}"
                local-currency="${null==r?void 0:r.expense.currency}"
                mode="${this.darkModeScheme}"
                no-link
                @click="${()=>this._handleRecurringExpItemClick(e)}"
              ></pfm-categorization-detail-list-movement>
              ${t!==a.length-1?d` <bbva-divider size="full"></bbva-divider> `:h}
            `}))}
        </div>
      </bbva-expandable-accordion>
    `:h}get _contentDmsTmpl(){return d`
      <bbva-global-recurring-expenses-search-api-dm
        ?native="${this.native}"
        .headers="${this._headers}"
        .requiredToken="${this.requiredToken}"
        cachekey="${l(this.recurringExpensesCacheKey)}"
        cachetype="${l(this.recurringExpensesCacheKey&&this.cacheType)}"
        host="${this.host}"
        version="${this.personalFinancesApiVersion}"
        @api-dm-error="${this._manageRecurringExpSearchError}"
        @recurring-expenses-search-api-dm-fetch-error="${this._manageRecurringExpSearchError}"
        @recurring-expenses-search-api-dm-fetch="${this._manageRecurringExpSearchResponse}"
      ></bbva-global-recurring-expenses-search-api-dm>

      <bbva-global-recurring-expenses-balances-search-api-dm
        ?native="${this.native}"
        .headers="${this._headers}"
        .requiredToken="${this.requiredToken}"
        cachekey="${l(this.recurringExpensesBalancesCacheKey)}"
        cachetype="${l(this.recurringExpensesBalancesCacheKey&&this.cacheType)}"
        host="${this.host}"
        version="${this.personalFinancesApiVersion}"
        @api-dm-error="${this._manageRecurringExpBalancesSearchError}"
        @recurring-expenses-balances-search-api-dm-fetch-error="${this._manageRecurringExpBalancesSearchError}"
        @recurring-expenses-balances-search-api-dm-fetch="${this._manageRecurringExpBalancesSearchResponse}"
      ></bbbva-global-recurring-expenses-balances-search-api-dm>
    `}render(){return d` ${this._contentDmsTmpl} ${this._content}`}}var ea=s`
  :host {
    --_pfm-categorization-detail-bg-color-primary-alt: ${D("colorPrimaryAltSurfaceAmbientDefault",M)};
  }
`,ta=s`
  :host {
    display: block;
    box-sizing: border-box;
    text-align: left;
  }

  *,
  *:before,
  *:after {
    box-sizing: inherit;
  }

  [data-tag-name='bbva-expandable-accordion'] {
    margin-top: 0.5rem;
  }
  [data-tag-name='bbva-expandable-accordion'] .customHeader2 {
    padding-left: 1rem;
    width: 90%;
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding-right: 0.5rem;
  }
  [data-tag-name='bbva-expandable-accordion'] .customHeader2 .notification {
    display: flex;
    align-items: center;
    min-width: 0;
  }
  [data-tag-name='bbva-expandable-accordion']
    .customHeader2
    .notification
    [data-tag-name='bbva-type-text'] {
    margin-right: 0.5rem;
    overflow: hidden;
  }
  [data-tag-name='bbva-expandable-accordion']
    .customHeader2
    .notification
    [data-tag-name='bbva-badge-notification'] {
    margin-right: 0.5rem;
  }

  [ambient='primary-alt'] {
    background-color: var(--_pfm-categorization-detail-bg-color-primary-alt);
  }
`;class aa extends(p(U(u(a)))){static get is(){return"pfm-categorization-detail-category-forecast"}static get scopedElements(){const e=[X,Q,We,It,L,K,Wt];return aa.scopedElementsFromClasses(e)}static get properties(){return{cacheType:{type:String,attribute:"cache-type"},categoryId:{type:String,attribute:"category-id"},contractId:{type:String,attribute:"contract-id"},contractSubtypeId:{type:String,attribute:"contract-subtype-id"},contractTypeId:{type:String,attribute:"contract-type-id"},darkModeScheme:{type:String,attribute:"dark-mode-scheme"},discreetMode:{type:Boolean,attribute:"discreet-mode"},expandAccordeon:{type:Boolean,attribute:"expand-accordeon",state:!0},forecastBalancesCacheKey:{type:String,attribute:"forecast-balances-cache-key"},groupId:{type:String,attribute:"group-id"},period:{type:Object},personalFinancesApiVersion:{type:String,attribute:"personal-finances-api-version"},pfmId:{type:String,attribute:"pfm-id"},showUndatedEstimates:{type:Boolean,attribute:"show-undated-estimates"},_forecast:{type:Array,state:!0},_loading:{type:Boolean,state:!0},_totalTransactions:{type:Number,state:!0}}}constructor(){super(),this._loading=!1,this.darkModeScheme="",this.discreetMode=!1,this.expandAccordeon=!1,this.showUndatedEstimates=!1}static get styles(){return[ta,ea,Y.primary,W.primary,J,Xe.primary,F.primary,N.primary]}firstUpdated(){super.firstUpdated(),this._forecastBalancesDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-forecast-balances-search-api-dm"]')}updated(e){super.updated(e),e.has("period")&&this._sendGetForecastBalancesSearchRequest()}get _endDate(){var e;return jt(null===(e=this.period)||void 0===e?void 0:e.endDate)}get _forecastKey(){return this.categoryId?"subcategories":"categories"}get _headers(){return this.headers||{"accept-language":this.language}}get _startDate(){var e;return Gt(null===(e=this.period)||void 0===e?void 0:e.startDate)}_sendGetForecastBalancesSearchRequest(){this._loading=!0;const e={pfmId:this.pfmId,periodStartDate:this._startDate,periodEndDate:this._endDate,...!this.showUndatedEstimates&&{isUndatedEstimates:this.showUndatedEstimates},...this.contractId&&{contracts:[{id:this.contractId,"productType.id":this.contractTypeId,...this.contractSubtypeId&&{"subProductType.id":this.contractSubtypeId}}]}};this._forecastBalancesDm.postForecastBalancesSearch(e)}_manageForecastBalancesSearchResponse({detail:e}){var t,a;this._loading=!1;let i=null==e?void 0:e.groups.find((({id:e})=>e===this.groupId));var s;this.categoryId&&(i=null===(s=i)||void 0===s?void 0:s.categories.find((({id:e})=>e===this.categoryId)));this._forecast=i,this._totalTransactions=null===(t=i)||void 0===t||null===(a=t[this._forecastKey])||void 0===a?void 0:a.length}_manageForecastBalancesSearchError(){this._loading=!1}_handleForecastCategoryItemClick(e){const{name:t,id:a,image:i}=e,s=Boolean(e.subcategories)?"category":"subcategory";this.dispatchEvent(new CustomEvent(`pfm-categorization-detail-category-forecast-${s}-selected`,{detail:{name:t,id:a,image:i},bubbles:!0,composed:!0}))}get _content(){var e,t,a;return this._totalTransactions&&this._forecast||this._loading?d`
      <bbva-expandable-accordion
        ?loading="${this._loading}"
        ?opened="${this.expandAccordeon}"
        ambient="primary-alt"
        divider="full"
        size="L"
      >
        <div slot="header" class="customHeader2">
          <div class="notification">
            <bbva-type-text
              ellipsis
              font-weight="500"
              size="S"
              text="${this.t(`pfm-categorization-detail-forecast-title-${this.groupId}`)}"
            ></bbva-type-text>
            <bbva-badge-notification
              accessibility-text="${this._totalTransactions}"
              text="${this._totalTransactions}"
            ></bbva-badge-notification>
          </div>
          <bbva-type-amount
            ?mask="${this.discreetMode}"
            amount="${null===(e=this._forecast)||void 0===e?void 0:e.totalAmount.amount}"
            currency-code="${null===(t=this._forecast)||void 0===t?void 0:t.totalAmount.currency}"
            language="${this.language}"
            local-currency="${null===(a=this._forecast)||void 0===a?void 0:a.totalAmount.currency}"
            variant="m"
          ></bbva-type-amount>
        </div>
        <div slot="content">
          ${this._forecast?this._forecast[this._forecastKey].map(((e,t,a)=>{var i;const s=Boolean(e.subcategories),r=null===(i=e.image)||void 0===i?void 0:i.id,n=m[r]||m.others,o=`${e.totalTransactions} ${this.t("pfm-categorization-detail-total-transaction-text")}`;return d`
                  <pfm-categorization-detail-list-movement
                    ?discreet-mode="${this.discreetMode}"
                    accessibility-mask="${this.t("pfm-categorization-detail-mask-products")}"
                    amount="${e.totalAmount.amount}"
                    bg-color-clip="${s?null==n?void 0:n.color:""}"
                    currency-code="${e.totalAmount.currency}"
                    extended-concept="${o}"
                    heading="${e.name}"
                    icon-clip="${s?g[null==n?void 0:n.icon]():""}"
                    icon="${s?g[null==n?void 0:n.icon]():""}"
                    language="${this.language}"
                    local-currency="${e.totalAmount.currency}"
                    mode="${this.darkModeScheme}"
                    @click="${()=>this._handleForecastCategoryItemClick(e)}"
                  ></pfm-categorization-detail-list-movement>
                  <bbva-divider-default
                    class="${t!==a.length-1?"fit":"full"}"
                  ></bbva-divider-default>
                `})):h}
        </div>
      </bbva-expandable-accordion>
    `:h}render(){return d`
      <bbva-global-forecast-balances-search-api-dm
        ?native="${this.native}"
        .headers="${this._headers}"
        .requiredToken="${this.requiredToken}"
        cachekey="${l(this.forecastBalancesCacheKey)}"
        cachetype="${l(this.forecastBalancesCacheKey&&this.cacheType)}"
        host="${this.host}"
        version="${this.personalFinancesApiVersion}"
        @api-dm-error="${this._manageForecastBalancesSearchError}"
        @forecast-balances-search-api-dm-fetch-error="${this._manageForecastBalancesSearchError}"
        @forecast-balances-search-api-dm-fetch="${this._manageForecastBalancesSearchResponse}"
      ></bbva-global-forecast-balances-search-api-dm>
      ${this._content}
    `}}var ia=s`
  :host {
    --_pfm-categorization-detail-list-definition-amount-skeleton-quote-color: ${D("colorPrimarySurfaceAmbientPreloading",M)};
    --_pfm-categorization-detail-list-definition-amount-skeleton-animated-layer-bg: ${D("colorPrimarySurfaceAmbientDefault",M)};
  }
`,sa=s`
  :host {
    box-sizing: border-box;
    display: block;
    align-items: center;
    text-align: center;
    padding: 0.5rem 1rem 0;
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

  dl,
  dd {
    margin: 0;
  }

  dl {
    display: flex;
    flex-direction: column;
  }
  dl dt {
    display: flex;
  }
  dl dd {
    display: flex;
    align-items: center;
  }
  dl dd.description-wrapper {
    align-items: flex-end;
  }
  dl dd.description-wrapper [data-tag-name='bbva-type-text'] {
    min-width: 0;
    margin-right: 1rem;
  }

  .amount {
    padding: 0.5rem 1rem;
  }

  :host([loading]) {
    position: relative;
    overflow: hidden;
    pointer-events: none;
    background-repeat: no-repeat;
    opacity: 1;
    width: 100%;
    flex: 1;
    margin-left: auto;
    margin-right: auto;
    height: 6rem;
    background-image: linear-gradient(
        -60deg,
        transparent 50%,
        var(--_pfm-categorization-detail-list-definition-amount-skeleton-quote-color) 50%
      ),
      linear-gradient(
        -60deg,
        transparent 50%,
        var(--_pfm-categorization-detail-list-definition-amount-skeleton-quote-color) 50%
      );
    background-color: transparent;
    background-size:
      calc((40% * 2) + (16px / 2)) 16px,
      calc((20% * 2) + (16px / 2)) 16px;
    background-position:
      16px 24px,
      16px 50px;
  }
  :host([loading]) .skeleton {
    contain: strict;
    position: absolute;
    left: 0;
    top: 0;
    right: 0;
    bottom: 0;
    opacity: 0.5;
    height: 6rem;
    transform: translateX(200%) scaleX(1);
    transform-origin: right bottom;
    animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
    background: var(--_pfm-categorization-detail-list-definition-amount-skeleton-animated-layer-bg);
  }
  :host([loading]) > :nth-child(n) {
    opacity: 0;
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
`;class ra extends(O(y(a))){static get is(){return"pfm-categorization-detail-list-definition-amount"}static get scopedElements(){const e=[ee,L,K];return ra.scopedElementsFromClasses(e)}static get properties(){return{amountFirst:{type:Boolean,attribute:"amount-first"},amountType:{type:String,attribute:"amount-type"},amountVariant:{type:String,attribute:"amount-variant"},badgeVariabilityColor:{type:String,attribute:"badge-variability-color"},badgeVariabilityColorSecondary:{type:String,attribute:"badge-variability-color-secondary"},badgeVariabilityStatus:{type:String,attribute:"badge-variability-status"},badgeVariabilityStatusSecondary:{type:String,attribute:"badge-variability-status-secondary"},currencyCodeSecondary:{type:String,attribute:"currency-code-secondary"},decimalDigits:{type:Number,attribute:"decimal-digits"},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"},description:{type:String},discreetMode:{type:Boolean,attribute:"discreet-mode"},loading:{type:Boolean,reflect:!0},localCurrencySecondary:{type:String,attribute:"local-currency-secondary"},secondaryAmount:{type:Number,attribute:"secondary-amount"},secondaryDescription:{type:String,attribute:"secondary-description"}}}constructor(){super(),this.amountFirst=!1,this.amountType="",this.amountVariant="3xl",this.badgeVariabilityColor="",this.badgeVariabilityColorSecondary="",this.badgeVariabilityStatus="",this.badgeVariabilityStatusSecondary="",this.currencyCodeSecondary="EUR",this.decimalDigits=2,this.decimalsHidden=!1,this.description="",this.discreetMode=!1,this.loading=!1,this.localCurrencySecondary="EUR",this.secondaryDescription=""}static get styles(){return[sa,ia,Z.primary,F.primary,N.primary,o(`${ra.is}-shared-styles`)]}static _getBadgeVariabilityTmpl({color:e,status:t}){return d`
      <bbva-badge-variability .color="${e}" .status="${t}"></bbva-badge-variability>
    `}_getTypeAmountTmpl({amount:e,amountType:t,currencyCode:a,decimalsHidden:i,localCurrency:s,variant:r}){return d`
      <bbva-type-amount
        ?decimals-hidden="${i}"
        ?mask="${this.discreetMode}"
        amount="${e}"
        currency-code="${a}"
        decimal-digits="${this.decimalDigits}"
        language="${this.language}"
        local-currency="${s}"
        type="${t}"
        variant="${r}"
      ></bbva-type-amount>
    `}static _getTypeTextTmpl({ellipsis:e,description:t}){return d`
      <bbva-type-text
        ?ellipsis="${e}"
        size="S"
        tag="span"
        text="${t}"
        unset
      ></bbva-type-text>
    `}render(){return this.loading?d` <div class="skeleton"></div> `:d`
        <dl>
          ${this.amountFirst?d`
                  <dt>
                    ${this._getTypeAmountTmpl({amount:this.amount,amountType:this.amountType,currencyCode:this.currencyCode,localCurrency:this.localCurrency,variant:this.amountVariant})}
                    ${this.badgeVariabilityStatus?ra._getBadgeVariabilityTmpl({color:this.badgeVariabilityColor,status:this.badgeVariabilityStatus}):h}
                  </dt>
                  <dd>
                    ${ra._getTypeTextTmpl({description:this.description})}
                  </dd>
                `:d`
                  ${this.description?d`
                        <dt>
                          ${ra._getTypeTextTmpl({description:this.description})}
                        </dt>
                      `:h}
                  <dd>
                    ${this._getTypeAmountTmpl({amount:this.amount,amountType:this.amountType,currencyCode:this.currencyCode,localCurrency:this.localCurrency,variant:this.amountVariant})}
                  </dd>
                `}

          ${this.secondaryAmount||this.secondaryDescription||this.badgeVariabilityStatusSecondary||this.badgeVariabilityColorSecondary?d`
                  <dd class="description-wrapper">
                    ${ra._getTypeTextTmpl({ellipsis:!0,description:this.secondaryDescription})}
                    ${this.secondaryAmount?d`
                          ${this._getTypeAmountTmpl({amount:this.secondaryAmount,amountType:this.amountType,currencyCode:this.currencyCodeSecondary,decimalsHidden:this.decimalDigits,localCurrency:this.localCurrencySecondary,variant:"m"})}
                        `:h}
                    ${this.badgeVariabilityStatusSecondary?ra._getBadgeVariabilityTmpl({color:this.badgeVariabilityColorSecondary,status:this.badgeVariabilityStatusSecondary}):h}
                  </dd>
                `:h}
        </dl>
      </div>
    `}}var na=s`
  :host {
    --_pfm-forecast-transactions-list-legend-average-color: ${D("colorPrimarySupportPendingDefault",M)};
    --_pfm-forecast-transactions-list-legend-skeleton-animated-layer-bg: ${D("colorPrimarySurfaceAmbientDefault",M)};
    --_pfm-forecast-transactions-list-legend-skeleton-quote-color: ${D("colorPrimarySurfaceAmbientPreloading",M)};
  }
`,oa=s`
  :host {
    display: block;
    box-sizing: border-box;
    text-align: left;
    padding: 1rem;
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

  .bar-legend {
    display: flex;
    align-items: center;
    flex: none;
    height: 1.5rem;
    width: 1rem;
    margin-right: 0.5rem;
  }

  .three-dots-legend-icon span {
    content: '';
    height: 0.25rem;
    width: 1rem;
    background: linear-gradient(
      to right,
      var(--_pfm-forecast-transactions-list-legend-average-color) 0.25rem,
      transparent 50%
    );
    background-size: 0.375rem;
  }

  .progress-bar-legend-icon span {
    width: calc(1rem - 0.3125rem);
    height: 0.625rem;
    transform-origin: left bottom;
    transform: skewX(-26deg);
  }

  .square-legend-icon span {
    width: 1rem;
    height: 1rem;
  }

  .oval-legend-icon span {
    width: 1rem;
    height: 1rem;
    border-radius: 50%;
  }

  .triangle-legend-icon span {
    width: 1rem;
    height: 1rem;
    border-left: 0.5rem solid transparent;
    border-right: 0.5rem solid transparent;
    border-bottom: 1rem solid black;
  }

  :host([legend-direction='row']) .list-legend-content {
    display: flex;
    justify-content: space-between;
  }
  :host([legend-direction='row']) .list-legend-content .label-wrapper {
    display: flex;
    flex: 1;
    overflow: hidden;
  }

  :host([legend-direction='column']) .list-legend-content {
    display: flex;
    flex-direction: column;
    justify-content: space-between;
  }
  :host([legend-direction='column']) .list-legend-content .label-wrapper {
    display: flex;
    flex: 1;
    overflow: hidden;
    padding-bottom: 0.5rem;
  }

  .label-content {
    display: flex;
    flex: 1 1 0%;
    justify-content: space-between;
    overflow: hidden;
  }

  .label {
    padding-right: 0.5rem;
    overflow: hidden;
  }

  .amount {
    display: block;
  }

  :host([loading]) {
    position: relative;
    overflow: hidden;
    pointer-events: none;
    background-repeat: no-repeat;
    opacity: 1;
    width: 100%;
    flex: 1;
    margin-left: auto;
    margin-right: auto;
    height: 3.375rem;
    background-image: linear-gradient(
        var(--_pfm-forecast-transactions-list-legend-skeleton-quote-color) 100%,
        transparent 0
      ),
      linear-gradient(
        -60deg,
        transparent 50%,
        var(--_pfm-forecast-transactions-list-legend-skeleton-quote-color) 50%
      ),
      linear-gradient(
        -60deg,
        var(--_pfm-forecast-transactions-list-legend-skeleton-quote-color) 50%,
        transparent 50%
      );
    background-color: transparent;
    background-size:
      16px 16px,
      calc((50% * 2) + (16px / 2)) 16px,
      calc((25% * 2) + (16px / 2)) 16px;
    background-position:
      16px 20px,
      40px 20px,
      calc(100% - 16px) 20px;
  }
  :host([loading]) .skeleton {
    contain: strict;
    position: absolute;
    left: 0;
    top: 0;
    right: 0;
    bottom: 0;
    opacity: 0.5;
    transform: translateX(200%) scaleX(1);
    transform-origin: right bottom;
    animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
    background: var(--_pfm-forecast-transactions-list-legend-skeleton-animated-layer-bg);
  }
  :host([loading]) > :nth-child(n) {
    opacity: 0;
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
`;class ca extends(O(y(a))){static get is(){return"pfm-categorization-detail-list-legend"}static get scopedElements(){const e=[L,K];return ca.scopedElementsFromClasses(e)}static get properties(){return{discreetMode:{type:Boolean,attribute:"discreet-mode"},iconColor:{type:String,attribute:"icon-color"},iconType:{type:String,attribute:"icon-type"},legendDirection:{type:String,attribute:"legend-direction",reflect:!0},loading:{type:Boolean,reflect:!0},text:{type:String},_iconTypes:{type:Object,state:!0}}}constructor(){super(),this.discreetMode=!1,this.iconType="progressBar",this.legendDirection="row",this.loading=!1,this._iconTypes={oval:"oval",progressBar:"progressBar",square:"square",threeDots:"threeDots",triangle:"triangle"}}static get styles(){return[oa,na,F.primary,N.primary,o(`${ca.is}-shared-styles`)]}get _listLegendIconTypes(){return{isOvalIcon:this.iconType===this._iconTypes.oval,isProgressBarIcon:this.iconType===this._iconTypes.progressBar,isSquareIcon:this.iconType===this._iconTypes.square,isThreeDotsIcon:this.iconType===this._iconTypes.threeDots,isTriangleIcon:this.iconType===this._iconTypes.triangle}}render(){const e={};return this.iconColor&&(this.iconType===this._iconTypes.triangle?e["border-bottom-color"]=this.iconColor:e["background-color"]=this.iconColor),d`
      ${this.loading&&d` <div class="skeleton"></div> `||d`
        <div class="list-legend-content">
          <div class="label-wrapper">
            <span
              class="${b({"bar-legend":!0,"oval-legend-icon":this._listLegendIconTypes.isOvalIcon,"progress-bar-legend-icon":this._listLegendIconTypes.isProgressBarIcon,"square-legend-icon":this._listLegendIconTypes.isSquareIcon,"three-dots-legend-icon":this._listLegendIconTypes.isThreeDotsIcon,"triangle-legend-icon":this._listLegendIconTypes.isTriangleIcon})}"
            >
              <span style=${v(e)}></span>
            </span>
            <bbva-type-text
              alignment="left"
              class="label"
              lines="1"
              size="S"
              text="${this.text}"
              unset
            ></bbva-type-text>
          </div>

          <bbva-type-amount
            ?mask="${this.discreetMode}"
            amount="${l(this.amount)}"
            class="amount"
            currency-code="${this.currencyCode}"
            disabled-tabindex
            language="${this.language}"
            local-currency="${this.localCurrency}"
            variant="l"
          ></bbva-type-amount>
        </div>
      `}
    `}}var da=s`
  :host {
    display: block;
    box-sizing: border-box;
    padding: 1.5rem 0;
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

  :host([link-text]) {
    padding-bottom: 0;
  }
  :host([link-text]) [data-tag-name='bbva-link'] {
    margin-top: 0.5rem;
  }

  .title {
    font-weight: var(
      --fontFacePrimaryMediumFontWeight,
      ${r(n.medium.fontWeight)}
    );
    font-style: var(
      --fontFacePrimaryMediumFontStyle,
      ${r(n.medium.fontStyle)}
    );
  }

  .description {
    margin-top: 0.5rem;
  }

  [data-tag-name='bbva-clip-microillustration'] {
    display: block;
    margin-bottom: 1rem;
  }
`;class la extends(O(a)){static get is(){return"pfm-categorization-detail-panel-info"}static get scopedElements(){const e=[ie,se,K];return la.scopedElementsFromClasses(e)}static get properties(){return{description:{type:String},heading:{type:String},linkText:{type:String,attribute:"link-text"},microillustration:{type:String},microillustrationText:{type:String,attribute:"microillustration-text"}}}constructor(){super(),this.description="",this.heading="",this.linkText="",this.microillustration="",this.microillustrationText=""}static get styles(){return[da,te.primary,ae.primary,N.primary,o(`${la.is}-shared-styles`)]}_linkClickHandler(){this.disabled||this.dispatchEvent(new CustomEvent("panel-info-link-click",{detail:!0,bubbles:!0,composed:!0}))}static _getTypeTextTmpl({style:e,size:t,tag:a,text:i}){return d`
      <bbva-type-text
        class="${e}"
        size="${t}"
        tag="${a}"
        text="${i}"
        unset
      ></bbva-type-text>
    `}render(){return d`
      <bbva-clip-microillustration
        alt-image="${this.microillustrationText}"
        alt-microillustration="${this.microillustration}"
        size="M"
      ></bbva-clip-microillustration>
      ${this.heading&&d`
          ${la._getTypeTextTmpl({style:"title",size:"L",tag:"h2",text:this.heading})}
        `||h}
      ${this.description&&d`
          ${la._getTypeTextTmpl({style:"description",size:"S",tag:"span",text:this.description})}
        `||h}
      ${this.linkText&&d`
          <bbva-type-link ambient="primary" size="S" @click="${this._linkClickHandler}">
            <span>${this.linkText}</span>
          </bbva-type-link>
        `||h}
    `}}var ha=s`
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

  .list-container {
    display: flex;
  }
  .list-container > * {
    width: 50%;
  }

  [data-tag-name='bbva-type-link'] {
    display: flex;
    margin: 0 auto 1.5rem 1rem;
    width: -webkit-max-content;
    width: max-content;
  }
  [data-tag-name='bbva-type-link'].link-container {
    margin: 1rem auto 1.5rem 1rem;
  }

  [data-tag-name='bbva-notification-contextual'] {
    margin: 1rem;
  }

  [data-tag-name='bbva-type-link']:not([href])[active]:not([aria-disabled='true']) {
    background-color: transparent;
  }

  [data-tag-name='bbva-data-visualization-bar'] {
    width: auto;
    margin: 0.5rem 1rem;
  }

  [data-tag-name='pfm-categorization-detail-list-legend'] {
    padding-top: 0;
  }

  [data-tag-name='bbva-button-row'] {
    margin-top: 1.5rem;
  }

  .bottom-spacer {
    padding-bottom: 1rem;
  }

  .spacer-2 {
    padding: 1rem;
  }
`;const{moment:pa}=window;class ua extends(U(re(u(a)))){static get is(){return"pfm-categorization-detail-detail-base"}static get scopedElements(){const e=[ee,ne,Ze,Q,oe,L,se,K,ra,ca,la,Pe,...ua.configurationScopedElements()];return ua.scopedElementsFromClasses(e)}static get properties(){return{actions:{type:Array},activeProactivity:{type:Boolean,attribute:"active-proactivity"},animateMovement:{type:Boolean,attribute:"animate-movement"},cacheType:{type:String,attribute:"cache-type"},contractId:{type:String,attribute:"contract-id"},contractSubtypeId:{type:String,attribute:"contract-subtype-id"},contractTypeId:{type:String,attribute:"contract-type-id"},darkModeScheme:{type:String,attribute:"dark-mode-scheme"},data:{type:Object},discreetMode:{type:Boolean,attribute:"discreet-mode"},emplacement:{type:String},enableMovementLink:{type:Boolean,attribute:"enable-movement-link"},error:{type:Boolean},evolutionBalance:{type:Object,attribute:"evolution-balance"},expandForecastAccordeon:{type:Boolean,attribute:"expand-forecast-accordeon"},fixedExpenses:{type:Boolean,attribute:"fixed-expenses"},forecastBalancesCacheKey:{type:String,attribute:"forecast-balances-cache-key"},forecastTransactionsCacheKey:{type:String,attribute:"forecast-transactions-cache-key"},groupId:{type:String,attribute:"group-id"},hideBrands:{type:Boolean,attribute:"hide-brands"},hideCommandLine:{type:Boolean,attribute:"hide-command-line"},hideProactivityMessage:{type:Boolean,attribute:"hide-proactivity-message"},hideSeeHistoricLink:{type:Boolean,attribute:"hide-see-historic-link"},isExpenseGroup:{type:Boolean,attribute:"is-expense-group"},isHistoryPeriod:{type:Boolean,attribute:"is-history-period"},legendColors:{type:Array,attribute:"legend-colors"},loading:{type:Boolean},localCurrency:{type:String,attribute:"local-currency"},otpCancelled:{type:Boolean,attribute:"otp-cancelled"},pendingCategoryId:{type:String,attribute:"pending-category-id"},period:{type:Object},personalFinancesApiVersion:{type:String,attribute:"personal-finances-api-version"},pfmId:{type:String,attribute:"pfm-id"},proactivityMessageAemKey:{type:String,attribute:"proactivity-message-aem-key"},proactivityMessagePublicSettingsEndpoint:{type:String,attribute:"proactivity-message-public-settings-endpoint"},proactivityMessagePublicSettingsHost:{type:String,attribute:"proactivity-message-public-settings-host"},proactivityMessagePublicSettingsRequiredToken:{type:String,attribute:"proactivity-message-public-settings-required-token"},recurringExpensesBalancesCacheKey:{type:String,attribute:"recurring-expenses-balances-cache-key"},recurringExpensesCacheKey:{type:String,attribute:"recurring-expenses-cache-key"},relevantFacts:{type:Array,attribute:"relevant-facts"},requiredTokenProactivity:{type:String,attribute:"required-token-proactivity"},selectedTab:{type:Number,attribute:"selected-tab"},showBrandsForecasting:{type:Boolean,attribute:"show-brands-forecasting"},showCategoryForecasting:{type:Boolean,attribute:"show-category-forecasting"},showEditPeriod:{type:Boolean,attribute:"show-edit-period"},showMovementsForecasting:{type:Boolean,attribute:"show-movements-forecasting"},transactionsOrderBy:{type:String,attribute:"transactions-order-by"},userContracts:{type:Array,attribute:"user-contracts"},variableExpenses:{type:Boolean,attribute:"variable-expenses"},_bubblePadding:{type:String,state:!0},_creditMovementType:{type:String,state:!0},_debitMovementType:{type:String,state:!0}}}constructor(){super(),this._bubblePadding="",this._creditMovementType="CREDIT_MOVEMENTS",this._debitMovementType="DEBIT_MOVEMENTS",this.actions=[],this.activeProactivity=!1,this.animateMovement=!1,this.cacheType="SESSION",this.darkModeScheme="",this.discreetMode=!1,this.emplacement="DAY_TO_DAY",this.enableMovementLink=!1,this.error=!1,this.expandForecastAccordeon=!1,this.fixedExpenses=!1,this.hideBrands=!1,this.hideCommandLine=!1,this.hideProactivityMessage=!1,this.hideSeeHistoricLink=!1,this.isExpenseGroup=!1,this.isHistoryPeriod=!1,this.language="en-EN",this.legendColors=[_.primarySubdued,_.primaryMedium],this.loading=!1,this.localCurrency="EUR",this.otpCancelled=!1,this.pendingCategoryId="9999",this.requiredTokenProactivity="",this.selectedTab="1",this.showBrandsForecasting=!1,this.showCategoryForecasting=!1,this.showEditPeriod=!1,this.showMovementsForecasting=!1,this.transactionsOrderBy="operationDate desc",this.userContracts=[],this.variableExpenses=!1}static get styles(){return[ha,Z.primary,ce.primary,et.primary,W.primary,J,de.primary,F.primary,ae.primary,N.primary]}_emptyList(e){const t={brands:{description:`pfm-categorization-detail-detail-empty-brands-${this.groupId}`,title:`pfm-categorization-detail-empty-category-list-title-${this.groupId}`},categories:{description:`pfm-categorization-detail-detail-empty-categories-${this.groupId}`,title:`pfm-categorization-detail-empty-category-list-title-${this.groupId}`}},{title:a,description:i}=t[e];return d`
      <pfm-categorization-detail-panel-info
        description="${this.t(i)}"
        heading="${this.t(a)}"
        microillustration-text="${this.t(a)}"
        microillustration="empty_state_day"
      ></pfm-categorization-detail-panel-info>
    `}_manageButtonRowSelect(e){var t;const a=this.actions[e.detail].id;this._dispatchEvent(`${this.constructor.is}-action-select`,{params:{actionId:a,categoryId:this.categoryId,contractId:this.contractId,contractSubtypeId:this.contractSubtypeId,contractTypeId:this.contractTypeId,groupId:this.groupId,name:null===(t=this.data)||void 0===t?void 0:t.name,subcategoryId:this.subcategoryId,target:`action-${a}`},external:!0,replace:!1})}_handleMessageExecute(e){this._dispatchEvent("pfm-categorization-detail-proactivity-message-execute",e)}get _formattedDate(){return this.period?Kt(this.period,this.language):""}_getAmount(e){var t,a;return(null===(t=this.data)||void 0===t||null===(a=t.amounts)||void 0===a?void 0:a.find((t=>t.pfmTransactionType===e)))||{amount:0,currency:this.localCurrency}}get _creditAmount(){return this._getAmount(this._creditMovementType)}get _debitAmount(){return this._getAmount(this._debitMovementType)}get _showForecastInfo(){var e;return null===(e=this.period)||void 0===e?void 0:e.endDate.isAfter(pa())}get _showProgressBar(){return!this.loading&&(this._creditAmount.amount||this._debitAmount.amount)&&this.isExpenseGroup}get _progressBar(){var e,t,a,i,s,r,n,o;const[c,l]=this.legendColors,h=(null===(e=m[null===(t=this.data.image)||void 0===t?void 0:t.id])||void 0===e?void 0:e.colorContrast)||c,p=(null===(a=m[null===(i=this.data.image)||void 0===i?void 0:i.id])||void 0===a?void 0:a.color)||l,u=Math.abs(this._debitAmount.amount),g=u+Math.abs(this._creditAmount.amount),y=Math.floor(100*u/g),b=(null===(s=this._creditAmount)||void 0===s?void 0:s.currency)||this.localCurrency,v=(null===(r=this._debitAmount)||void 0===r?void 0:r.currency)||this.localCurrency;return d`
      <bbva-data-visualization-bar
        accessibility-text="${this.t("pfm-categorization-detail-aria-progress-bar",{debit:Math.abs(this._debitAmount.amount),credit:Math.abs(this._creditAmount.amount)})}"
        aria-hidden="true"
        bar-any-colors
        .barValues="${[{accessibilityLabel:this.t("pfm-categorization-detail-credit-aria-legend",{amount:this._creditAmount.amount}),bgColor:h,currentValue:100-y},{accessibilityLabel:this.t("pfm-categorization-detail-debit-aria-legend",{amount:this._debitAmount.amount}),bgColor:p,currentValue:y}]}"
      >
      </bbva-data-visualization-bar>
      <div role="list" class="list-container">
        <div role="listitem">
          <pfm-categorization-detail-list-legend
            ?discreet-mode="${this.discreetMode}"
            amount="${null===(n=this._creditAmount)||void 0===n?void 0:n.amount}"
            currency-code="${b}"
            icon-color="${h}"
            icon-type="progressBar"
            label-ellipsis
            language="${this.language}"
            legend-direction="column"
            local-currency="${b}"
            text="${this.t("pfm-categorization-detail-credit-legend")}"
          ></pfm-categorization-detail-list-legend>
        </div>
        <div role="listitem">
          <pfm-categorization-detail-list-legend
            ?discreet-mode="${this.discreetMode}"
            amount="${null===(o=this._debitAmount)||void 0===o?void 0:o.amount}"
            currency-code="${v}"
            icon-color="${p}"
            icon-type="progressBar"
            label-ellipsis
            language="${this.language}"
            legend-direction="column"
            local-currency="${v}"
            text="${this.t("pfm-categorization-detail-debit-legend")}"
          ></pfm-categorization-detail-list-legend>
        </div>
      </div>
    `}get _errorTemplate(){return d`
      <pfm-categorization-detail-panel-info
        description="${this.t("pfm-categorization-detail-detail-error-description")}"
        heading="${this.t("pfm-categorization-detail-detail-error")}"
        microillustration-text="${this.t("pfm-categorization-detail-detail-error")}"
        microillustration="error"
      ></pfm-categorization-detail-panel-info>
    `}get _actionsRow(){const e=this.actions.map((e=>({...e,icon:g[e.icon]()})));return d`
      <bbva-button-row
        .options="${e}"
        accessibility-text="${this.t("pfm-categorization-detail-aria-operations")}"
        ambient="primary"
        variant="simple"
        @button-row-item-click="${this._manageButtonRowSelect}"
      ></bbva-button-row>
    `}get _proactivityBubble(){return d`
      <proactivity-message
        ?native="${this.native}"
        ?show-message="${!this.hideProactivityMessage}"
        .host="${this.host}"
        .publicSettingsHost="${this.proactivityMessagePublicSettingsHost}"
        .publicSettingsRequiredToken="${this.proactivityMessagePublicSettingsRequiredToken}"
        .relevantFacts="${this.relevantFacts}"
        .requiredToken="${this.requiredTokenProactivity||this.requiredToken}"
        aem-key="${this.proactivityMessageAemKey}"
        class="${this._bubblePadding}"
        emplacement="${this.emplacement}"
        language="${this.language}"
        public-settings-endpoint="${this.proactivityMessagePublicSettingsEndpoint}"
        @proactivity-message-execute="${this._handleMessageExecute}"
        @proactivity-message-load="${()=>{this._bubblePadding="spacer-2"}}"
      ></proactivity-message>
    `}_getDescriptionDefinitonAmount(){if(this._hasFixedVariableExpenses)return"";if(this.isExpenseGroup){if(!this._creditAmount.amount&&this._debitAmount.amount)return this.isHistoryPeriod?this.t("pfm-categorization-detail-detail-amount-legend-debit"):this.t("pfm-categorization-detail-detail-current-amount-legend-debit");if(this._creditAmount.amount&&!this._debitAmount.amount)return this.isHistoryPeriod?this.t("pfm-categorization-detail-detail-amount-legend-credit"):this.t("pfm-categorization-detail-detail-current-amount-legend-credit")}return this.isHistoryPeriod?this.t(`pfm-categorization-detail-detail-amount-legend-${this.groupId}`):this.t(`pfm-categorization-detail-detail-current-amount-legend-${this.groupId}`)}_getSecondaryDescription(){if(this.fixedExpenses||this.variableExpenses){const e=Ut(pa().format("YYYY-MM-DD"),this.language);return this.t("pfm-categorization-detail-detail-secondary-description-expenses",{date:e})}return""}get _mainContent(){var e,t,a,i,s,r,n,o,c,l,p,u;const g=(null===(e=this.data)||void 0===e||null===(t=e.totalAmount)||void 0===t?void 0:t.amount)||0,m=(null===(a=this.data)||void 0===a||null===(i=a.totalAmount)||void 0===i?void 0:i.currency)||this.localCurrency,y=(null===(s=this.evolutionBalance)||void 0===s?void 0:s.currency)||this.localCurrency;return d`
      <bbva-header-category
        ?loading="${this.loading}"
        heading-level="2"
        link-accessibility-text="${this.t("pfm-categorization-detail-edit-accessibility")} ${this._formattedDate}"
        option-link="${this.showEditPeriod?this.t("pfm-categorization-detail-edit"):""}"
        text="${this._formattedDate}"
        variant="date"
        @header-category-link-click="${()=>this._dispatchEvent("pfm-categorization-detail-period-select")}"
      ></bbva-header-category>

      ${null!==(r=this.evolutionBalance)&&void 0!==r&&r.amount?d`
            <pfm-categorization-detail-list-definition-amount
              ?discreet-mode="${this.discreetMode}"
              ?loading="${!(null!==(n=this.data)&&void 0!==n&&n.totalAmount)}"
              amount-type="bold"
              amount="${g}"
              badge-variability-color-secondary="${null===(o=this.evolutionBalance)||void 0===o?void 0:o.color}"
              badge-variability-status-secondary="${null===(c=this.evolutionBalance)||void 0===c?void 0:c.status}"
              currency-code-secondary="${y}"
              currency-code="${m}"
              decimal-digits="2"
              decimals-hidden
              description="${this.t(`pfm-categorization-detail-detail-amount-legend-${this.groupId}`)}"
              language="${this.language}"
              local-currency-secondary="${y}"
              local-currency="${m}"
              secondary-amount="${null===(l=this.evolutionBalance)||void 0===l?void 0:l.amount}"
              secondary-description="${this.t("pfm-categorization-detail-detail-variability-text",{date:Ut(null===(p=this.period)||void 0===p?void 0:p.startDate,this.language)})}"
            ></pfm-categorization-detail-list-definition-amount>
          `:d`
            <pfm-categorization-detail-list-definition-amount
              ?discreet-mode="${this.discreetMode}"
              ?loading="${!(null!==(u=this.data)&&void 0!==u&&u.totalAmount)}"
              amount-type="bold"
              amount="${g}"
              currency-code="${m}"
              description="${this._getDescriptionDefinitonAmount()}"
              language="${this.language}"
              local-currency="${m}"
              secondary-description="${this._getSecondaryDescription()}"
            ></pfm-categorization-detail-list-definition-amount>
          `}
      ${this._hasProgressBar?this._progressBar:h}
      ${this.hideSeeHistoricLink?h:this._historicLink}
      ${this.hideCommandLine||!this.actions.length||this.isHistoryPeriod?h:this._actionsRow}
      ${this.data&&this.activeProactivity?this._proactivityBubble:h}
      ${this.data?this.content:h}
    `}get _hasProgressBar(){return!this._hasFixedVariableExpenses&&this._showProgressBar&&this._hasCreditDebit}get _hasCreditDebit(){var e,t;return(null===(e=this._creditAmount)||void 0===e?void 0:e.amount)&&(null===(t=this._debitAmount)||void 0===t?void 0:t.amount)}get _hasFixedVariableExpenses(){return this.fixedExpenses||this.variableExpenses}get _historicLink(){return d`
      <bbva-type-link
        ambient="primary"
        class="${this._hasProgressBar?"":"link-container"}"
        text="${this.t("pfm-categorization-detail-see-history")}"
        @click="${()=>this._dispatchEvent("pfm-categorization-detail-history-show")}"
      ></bbva-type-link>
      <bbva-divider-default></bbva-divider-default>
    `}render(){return d` ${this._dataManagers} ${this.error?this._errorTemplate:this._mainContent} `}_dispatchEvent(e,t){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}}var ga=s`
  :host {
    display: block;
    box-sizing: border-box;
    text-align: left;
  }

  *,
  *:before,
  *:after {
    box-sizing: inherit;
  }

  [data-tag-name='bbva-header-category'] {
    padding: 1rem;
  }

  [data-tag-name='pfm-categorization-detail-panel-info'] {
    padding: 1.5rem;
  }

  .fit {
    display: block;
    margin-left: 1rem;
    margin-right: 1rem;
  }

  #sticky {
    margin-bottom: 0.0625rem;
  }
`;class ma extends(p(tt(U(u(a))))){static get is(){return"pfm-categorization-detail-movements"}static get scopedElements(){const e=[ie,Q,Pt,oe,Ke,Wt,la];return ma.scopedElementsFromClasses(e)}static get properties(){return{animateMovement:{type:Boolean,attribute:"animate-movement"},avoidGetTransactions:{type:Boolean,attribute:"avoid-get-transactions"},categoryId:{type:String,attribute:"category-id"},contractId:{type:String,attribute:"contract-id"},contractSubtypeId:{type:String,attribute:"contract-subtype-id"},contractTypeId:{type:String,attribute:"contract-type-id"},darkModeScheme:{type:String,attribute:"dark-mode-scheme"},discreetMode:{type:Boolean,attribute:"discreet-mode"},enableMovementLink:{type:Boolean,attribute:"enable-movement-link"},fromOperationDate:{type:String,attribute:"from-operation-date"},groupId:{type:String,attribute:"group-id"},hideOperativeActions:{type:Boolean,attribute:"hide-operative-actions"},otpCancelled:{type:Boolean,attribute:"otp-cancelled"},pendingCategoryId:{type:String,attribute:"pending-category-id"},period:{type:Object},personalFinancesApiVersion:{type:String,attribute:"personal-finances-api-version"},pfmId:{type:String,attribute:"pfm-id"},showHeader:{type:Boolean,attribute:"show-header"},subcategoryId:{type:String,attribute:"subcategory-id"},toOperationDate:{type:String,attribute:"to-operation-date"},transactionsOrderBy:{type:String,attribute:"transactions-order-by"},_loadingTransactions:{type:Boolean,state:!0},_requiredOtp:{type:Boolean,state:!0},_transactions:{type:Array,state:!0},_transactionsError:{type:Boolean,state:!0}}}constructor(){super(),this._loadingTransactions=!1,this._requiredOtp=!1,this._showOtpModal=!1,this._transactionsError=!1,this.animatedMovement=!1,this.avoidGetTransactions=!1,this.darkModeScheme="",this.discreetMode=!1,this.enableMovementLink=!1,this.hideOperativeActions=!1,this.otpCancelled=!1,this.pendingCategoryId="9999",this.showHeader=!1,this.showOtpModal=!1,this.transactionsOrderBy="operationDate desc",this.userContracts=[]}static get styles(){return[ga,te.primary,W.primary,J,de.primary,Le.primary]}firstUpdated(){super.firstUpdated(),this._transactionsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-transactions-search-api-dm"]'),this.setObserver()}updated(e){super.updated(e);["avoidGetTransactions","categoryId","fromOperationDate","groupId","subcategoryId","toOperationDate"].some((t=>e.has(t)))&&!this.avoidGetTransactions&&this.fromOperationDate&&this.toOperationDate&&"undefined"!==this.groupId&&(this._transactions=[],this._transactionsError=!1,this._transactionsDm.morePages=!1,this._getTransactions()),e.has("otpCancelled")&&this.otpCancelled&&this._requiredOtp&&(this._loadingTransactions=!1)}setObserver(){const e=this.shadowRoot.querySelector("#sticky");this._observer=new at(this,{target:[e],callback:this._handlePaginationObserverChanged.bind(this),config:{threshold:1},skipInitial:!1})}_handlePaginationObserverChanged(e){var t;e[0].isIntersecting&&!this._loadingTransactions&&null!==(t=this._transactionsDm)&&void 0!==t&&t.morePages&&this._getTransactions({paginationKey:this._transactionsDm.nextKey})}get _headers(){return this.headers||{"accept-language":this.language}}get _stopGettingTransactions(){var e;return!(this._loadingTransactions||null!==(e=this._transactionsDm)&&void 0!==e&&e.morePages)}_getTransactions(e={}){this._loadingTransactions=!0,this._requiredOtp=!1;const t={pfmId:this.pfmId,periodStartDate:this.fromOperationDate,periodEndDate:this.toOperationDate,orderBy:this.transactionsOrderBy,groupIds:[this.groupId],...this.categoryId&&{categoryIds:[this.categoryId]},...this.subcategoryId&&{subcategoryIds:[this.subcategoryId]},...this.contractId&&{contracts:[{id:this.contractId,"productType.id":this.contractTypeId,...this.contractSubtypeId&&{"subProductType.id":this.contractSubtypeId}}]},...e};this._transactionsDm.postTransactionsSearch(t)}_manageTransactionsResponse({detail:e}){this._loadingTransactions=!1,e&&(this._transactions=(this._transactions||[]).concat(e))}_manageTransactionsError(){this._loadingTransactions=!1,this._transactionsError=!0}_handleAnimationEnd(){this._dispatchEvent("pfm-categorization-detail-movement-animate")}_manageUpdateToken({detail:e}){this._dispatchEvent("token-update",e)}_manageSignature(){this._requiredOtp=!0}_handleMovementAction(e){this._dispatchEvent("pfm-categorization-detail-movement-recategorize",{target:"movement-recategorize",movement:e})}_handleClickMovement(e){this.enableMovementLink&&this._dispatchEvent("pfm-categorization-detail-movement-select",{target:"movement-detail",movement:e})}get _emptyList(){const e=`pfm-categorization-detail-empty-movements-list-title-${this.groupId}`,t=`pfm-categorization-detail-detail-empty-movements-${this.groupId}`;return d`
      <pfm-categorization-detail-panel-info
        description="${this.t(t)}"
        heading="${this.t(e)}"
        microillustration-text="${this.t(e)}"
        microillustration="empty_state_day"
      ></pfm-categorization-detail-panel-info>
    `}_getMovementActions(e){var t,a,i,s,r;return this.hideOperativeActions||(null===(t=e.group)||void 0===t||null===(a=t.category)||void 0===a?void 0:a.id)===this.pendingCategoryId&&"CARDS"===(null===(i=e.contract)||void 0===i||null===(s=i.product)||void 0===s||null===(r=s.productType)||void 0===r?void 0:r.id)?[]:[{icon:f(),label:this.t("pfm-categorization-detail-change-category")}]}_getContractDetail(e){return this.userContracts.find((({id:t})=>t===e))}_movementAlias(e){var t;const a=null===(t=this._getContractDetail(e.contract.id))||void 0===t?void 0:t.alias;if(a)return Lt(a)}_movementContractId(e){var t,a,i;const s=e.contract.id,r=null===(t=e.contract)||void 0===t?void 0:t.channelContractId;return(null===(a=this._getContractDetail(s))||void 0===a?void 0:a.number)||(null===(i=this._getContractDetail(r))||void 0===i?void 0:i.number)||s}get _errorTemplate(){return d`
      <pfm-categorization-detail-panel-info
        description="${this.t("pfm-categorization-detail-detail-error-description")}"
        heading="${this.t("pfm-categorization-detail-detail-error")}"
        microillustration-text="${this.t("pfm-categorization-detail-detail-error")}"
        microillustration="error"
      ></pfm-categorization-detail-panel-info>
    `}get _otpWarning(){return d`
      <pfm-categorization-detail-panel-info
        description="${this.t("pfm-categorization-detail-otp-message")}"
        link-text="${this.t("pfm-categorization-detail-consult-movements")}"
        microillustration-text="${this.t("pfm-categorization-detail-otp-message")}"
        microillustration="clock"
        @panel-info-link-click="${this._getTransactions}"
      ></pfm-categorization-detail-panel-info>
    `}get _transactionList(){var e;let t;return this._loadingTransactions&&(null===(e=this._transactions)||void 0===e||!e.length)||this.otpCancelled&&this._requiredOtp?h:d`
      ${le(this._transactions,(e=>e.id),((e,a)=>{var i,s,r,n,o,c,p,u,y;const b=null===(i=e.group)||void 0===i||null===(s=i.category)||void 0===s||null===(r=s.image)||void 0===r?void 0:r.id,v=null===(n=e.brand)||void 0===n||null===(o=n.image)||void 0===o||null===(c=o.links[0])||void 0===c?void 0:c.href,_=m[b]||m.others,f=this._transactions[a+1],$=Ut(null==f?void 0:f.operationDate,this.language),S=Ut(e.operationDate,this.language),C=d`
            ${S===t?h:d`
                  <bbva-header-category
                    variant="date"
                    heading-level="4"
                    text=${S}
                    hide-padding-bottom
                  ></bbva-header-category>
                `}
            <bbva-list-swipe
              ?animate="${this.animateMovement&&!this.hideOperativeActions&&0===a}"
              .operativeActions="${this._getMovementActions(e)}"
              ambient="primary"
              interactive
              @bbva-list-swipe-animation-end="${this._handleAnimationEnd}"
              @list-swipe-action-click="${()=>this._handleMovementAction(e)}"
            >
              <div slot="invoker">
                <pfm-categorization-detail-list-movement
                  ?discreet-mode="${this.discreetMode}"
                  ?no-link="${!this.enableMovementLink}"
                  accessibility-mask="${this.t("pfm-categorization-detail-mask-products")}"
                  ambient="primary"
                  amount="${e.amount.amount}"
                  bg-color-clip="${null==_?void 0:_.color}"
                  category="${b}"
                  contract-alias="${l(this._movementAlias(e))}"
                  currency-code="${e.amount.currency}"
                  extended-concept="${l(e.extendedConcept)}"
                  heading="${e.concept}"
                  highlight-category
                  icon-clip="${v?"":g[null==_?void 0:_.icon]()}"
                  icon="${g[null==_?void 0:_.icon]()}"
                  image="${l(v)}"
                  language="${this.language}"
                  mask="${this._movementContractId(e)}"
                  mode="${this.darkModeScheme}"
                  style="--_list-movement-concept-icon-color: ${null==_?void 0:_.color}"
                  subcategory-name="${null===(p=e.group)||void 0===p||null===(u=p.category)||void 0===u||null===(y=u.subcategory)||void 0===y?void 0:y.name}"
                  @click="${()=>this._handleClickMovement(e)}"
                ></pfm-categorization-detail-list-movement>
                <bbva-divider-default
                  class="${S===$?"fit":"full"}"
                ></bbva-divider-default>
              </div>
            </bbva-list-swipe>
          `;return t=S,C}))}
    `}render(){var e,t;return d`
      <bbva-global-transactions-search-api-dm
        ?native="${this.native}"
        .headers="${this._headers}"
        .requiredToken="${this.requiredToken}"
        host="${this.host}"
        requiredotp
        version="${this.personalFinancesApiVersion}"
        @api-dm-error="${e=>this._manageTransactionsError(e)}"
        @transactions-search-api-dm-fetch-error="${e=>this._manageTransactionsError(e)}"
        @transactions-search-api-dm-fetch="${this._manageTransactionsResponse}"
        @signature-required-dm="${this._manageSignature}"
        @signature-required-first-step-dm="${this._manageSignature}"
        @token-update="${this._manageUpdateToken}"
      ></bbva-global-transactions-search-api-dm>

      ${this.showHeader?d`
            <bbva-header-category
              ?loading="${this._loadingTransactions}"
              text="${this.t("pfm-categorization-detail-movements-heading")}"
            ></bbva-header-category>
          `:h}
      ${this.otpCancelled&&this._requiredOtp&&!this._loadingTransactions?this._otpWarning:h}
      ${this._transactionsError?this._errorTemplate:h}
      ${null!==(e=this._transactions)&&void 0!==e&&e.length&&!this._transactionsError?this._transactionList:h}
      ${null!==(t=this._transactions)&&void 0!==t&&t.length||this._transactionsError||this._loadingTransactions||this.otpCancelled?h:this._emptyList}
      <bbva-header-category
        ?hidden="${this._stopGettingTransactions||this.otpCancelled&&this._requiredOtp}"
        id="sticky"
        loading
      ></bbva-header-category>
    `}_dispatchEvent(e,t){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}}var ya=s`
  :host {
    --_pfm-categorization-detail-bg-color-primary-alt: ${D("colorPrimaryAltSurfaceAmbientDefault",M)};
  }
`,ba=s`
  :host {
    display: block;
    box-sizing: border-box;
    text-align: left;
  }

  *,
  *:before,
  *:after {
    box-sizing: inherit;
  }

  .fit {
    display: block;
    margin-left: 1rem;
    margin-right: 1rem;
  }

  [data-tag-name='bbva-header-category'] {
    padding: 1rem;
  }

  [data-tag-name='bbva-expandable-accordion'] {
    margin-top: 0.5rem;
  }
  [data-tag-name='bbva-expandable-accordion'] .customHeader2 {
    padding-left: 1rem;
    width: 90%;
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding-right: 0.5rem;
  }
  [data-tag-name='bbva-expandable-accordion'] .customHeader2 .notification {
    display: flex;
    align-items: center;
    min-width: 0;
  }
  [data-tag-name='bbva-expandable-accordion']
    .customHeader2
    .notification
    [data-tag-name='bbva-type-text'] {
    margin-right: 0.5rem;
    overflow: hidden;
  }
  [data-tag-name='bbva-expandable-accordion']
    .customHeader2
    .notification
    [data-tag-name='bbva-badge-notification'] {
    margin-right: 0.5rem;
  }

  [ambient='primary-alt'] {
    background-color: var(--_pfm-categorization-detail-bg-color-primary-alt);
  }
`;const{moment:va}=window;class _a extends(p(U(u(a)))){static get is(){return"pfm-categorization-detail-movements-forecast"}static get scopedElements(){const e=[X,Q,We,It,kt,oe,L,K,Wt];return _a.scopedElementsFromClasses(e)}static get properties(){return{cacheType:{type:String,attribute:"cache-type"},categoryId:{type:String,attribute:"category-id"},contractId:{type:String,attribute:"contract-id"},contractSubtypeId:{type:String,attribute:"contract-subtype-id"},contractTypeId:{type:String,attribute:"contract-type-id"},darkModeScheme:{type:String,attribute:"dark-mode-scheme"},discreetMode:{type:Boolean,attribute:"discreet-mode"},expandAccordeon:{type:Boolean,attribute:"expand-accordeon"},forecastBalancesCacheKey:{type:String,attribute:"forecast-balances-cache-key"},forecastTransactionsCacheKey:{type:String,attribute:"forecast-transactions-cache-key"},groupId:{type:String,attribute:"group-id"},period:{type:Object},personalFinancesApiVersion:{type:String,attribute:"personal-finances-api-version"},pfmId:{type:String,attribute:"pfm-id"},showUndatedEstimates:{type:Boolean,attribute:"show-undated-estimates"},subcategoryId:{type:String,attribute:"subcategory-id"},userContracts:{type:Array,attribute:"user-contracts"},_forecast:{type:Array,state:!0},_loading:{type:Boolean,state:!0},_totalTransactions:{type:Number,state:!0},_transactions:{type:Array,state:!0}}}constructor(){super(),this._loading=!1,this.darkModeScheme="",this.discreetMode=!1,this.expandAccordeon=!1,this.showUndatedEstimates=!1,this.userContracts=[]}static get styles(){return[ba,ya,Y.primary,W.primary,J,Xe.primary,de.primary,F.primary,N.primary]}firstUpdated(){super.firstUpdated(),this._forecastBalancesDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-forecast-balances-search-api-dm"]'),this._forecastTransactionsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-forecast-transactions-search-api-dm"]')}updated(e){super.updated(e),e.has("period")&&this._sendGetForecastBalancesSearchRequest()}get _endDate(){var e;return jt(null===(e=this.period)||void 0===e?void 0:e.endDate)}get _headers(){return this.headers||{"accept-language":this.language}}get _startDate(){var e;return Gt(null===(e=this.period)||void 0===e?void 0:e.startDate)}_sendGetForecastBalancesSearchRequest(){this._loading=!0;const e={pfmId:this.pfmId,periodStartDate:this._startDate,periodEndDate:this._endDate,...!this.showUndatedEstimates&&{isUndatedEstimates:this.showUndatedEstimates},...this.contractId&&{contracts:[{id:this.contractId,"productType.id":this.contractTypeId,...this.contractSubtypeId&&{"subProductType.id":this.contractSubtypeId}}]}};this._forecastBalancesDm.postForecastBalancesSearch(e)}_manageForecastBalancesSearchResponse({detail:e}){var t,a;this._loading=!1;let i=null==e||null===(t=e.groups)||void 0===t?void 0:t.find((({id:e})=>e===this.groupId)),s=null===(a=i)||void 0===a?void 0:a.totalTransactions;var r,n,o,c;this.categoryId&&(i=null===(r=i)||void 0===r?void 0:r.categories.find((({id:e})=>e===this.categoryId)),s=null===(n=i)||void 0===n?void 0:n.totalTransactions);this.subcategoryId&&(i=null===(o=i)||void 0===o?void 0:o.subcategories.find((({id:e})=>e===this.subcategoryId)),s=null===(c=i)||void 0===c?void 0:c.totalTransactions);this._forecast=i,this._totalTransactions=s,this._totalTransactions&&this._sendGetTransactionsForecastSearchRequest()}_sendGetTransactionsForecastSearchRequest(){const e={pfmId:this.pfmId,periodStartDate:this._startDate,periodEndDate:this._endDate,groupIds:[this.groupId],...this.categoryId&&{categoryIds:[this.categoryId]},...this.subcategoryId&&{subcategoryIds:[this.subcategoryId]},...!this.showUndatedEstimates&&{isUndatedEstimates:this.showUndatedEstimates},...this.contractId&&{contracts:[{id:this.contractId,"productType.id":this.contractTypeId,...this.contractSubtypeId&&{"subProductType.id":this.contractSubtypeId}}]}};this._forecastTransactionsDm.postForecastTransactionsSearch(e)}_manageForecastTransactionsSearchResponse({detail:e}){this._transactions=(null==e?void 0:e.sort(((e,t)=>{const a=va(t.operationDate)-va(e.operationDate);return 0!==a?a:e.expectedAmount.amount-t.expectedAmount.amount})))||[]}_manageForecastBalancesSearchError(){this._loading=!1}_manageForecastTransactionsSearchError(){this._loading=!1}_handleForecastMovementItemClick(e){this._dispatchEvent("pfm-categorization-detail-movements-forecast-selected",{params:e})}_handleForecastAccordeonClick(){this._dispatchEvent("pfm-categorization-detail-movements-forecast-accordeon-click")}_getContractDetail(e){return this.userContracts.find((({id:t})=>t===e))}_getMovementExtendedConcept(e){var t,a,i;const s=null===(t=this._getContractDetail(e.contract.id))||void 0===t?void 0:t.alias;return s?Lt(s):(null===(a=e.contract)||void 0===a||null===(i=a.product)||void 0===i?void 0:i.name)||void 0}get _transactionsList(){var e;let t;return null!==(e=this._transactions)&&void 0!==e&&e.length?d`
      ${le(this._transactions,(e=>e.id),((e,a)=>{var i,s,r,n,o,c;const p=this._transactions[a+1],u=Ut(null==p?void 0:p.operationDate,this.language),y=Ut(e.operationDate,this.language),b=null===(i=e.group)||void 0===i||null===(s=i.category)||void 0===s||null===(r=s.image)||void 0===r?void 0:r.id,v=null===(n=e.brand)||void 0===n||null===(o=n.image)||void 0===o||null===(c=o.links[0])||void 0===c?void 0:c.href,_=m[b]||m.others,f=d`
            ${y===t?h:d`
                  <bbva-header-category
                    variant="date"
                    heading-level="4"
                    text="${y}"
                  ></bbva-header-category>
                `}
            <pfm-categorization-detail-list-movement
              ?discreet-mode="${this.discreetMode}"
              accessibility-mask="${this.t("pfm-categorization-detail-mask-products")}"
              amount="${e.expectedAmount.amount}"
              bg-color-clip="${null==_?void 0:_.color}"
              contract-alias="${l(this._getMovementExtendedConcept(e))}"
              currency-code="${e.expectedAmount.currency}"
              heading="${e.concept}"
              icon-clip="${v?"":g[null==_?void 0:_.icon]()}"
              icon="${g[null==_?void 0:_.icon]()}"
              image="${l(v)}"
              language="${this.language}"
              mode="${this.darkModeScheme}"
              @click="${()=>this._handleForecastMovementItemClick(e)}"
            ></pfm-categorization-detail-list-movement>
            <bbva-divider-default
              class="${y===u?"fit":"full"}"
            ></bbva-divider-default>
          `;return t=y,f}))}
    `:h}get _content(){var e,t,a;return this._totalTransactions&&this._forecast||this._loading?d`
      <bbva-expandable-accordion
        ?loading="${this._loading}"
        ?opened="${this.expandAccordeon}"
        ambient="primary-alt"
        divider="full"
        size="L"
        @expandable-accordion-header-click="${this._handleForecastAccordeonClick}"
      >
        <div slot="header" class="customHeader2">
          <div class="notification">
            <bbva-type-text
              ellipsis
              font-weight="500"
              size="S"
              text="${this.t(`pfm-categorization-detail-forecast-title-${this.groupId}`)}"
            ></bbva-type-text>
            <bbva-badge-notification
              accessibility-text="${this._totalTransactions}"
              text="${this._totalTransactions}"
            ></bbva-badge-notification>
          </div>
          <bbva-type-amount
            ?mask="${this.discreetMode}"
            amount="${null===(e=this._forecast)||void 0===e?void 0:e.totalAmount.amount}"
            currency-code="${null===(t=this._forecast)||void 0===t?void 0:t.totalAmount.currency}"
            language="${this.language}"
            local-currency="${null===(a=this._forecast)||void 0===a?void 0:a.totalAmount.currency}"
            variant="m"
          ></bbva-type-amount>
        </div>
        <div slot="content">${this._transactionsList}</div>
      </bbva-expandable-accordion>
    `:h}render(){return d`
      <bbva-global-forecast-balances-search-api-dm
        ?native="${this.native}"
        .headers="${this._headers}"
        .requiredToken="${this.requiredToken}"
        cachekey="${l(this.forecastBalancesCacheKey)}"
        cachetype="${l(this.forecastBalancesCacheKey&&this.cacheType)}"
        host="${this.host}"
        version="${this.personalFinancesApiVersion}"
        @api-dm-error="${this._manageForecastBalancesSearchError}"
        @forecast-balances-search-api-dm-fetch-error="${this._manageForecastBalancesSearchError}"
        @forecast-balances-search-api-dm-fetch="${this._manageForecastBalancesSearchResponse}"
      ></bbva-global-forecast-balances-search-api-dm>
      <bbva-global-forecast-transactions-search-api-dm
        ?native="${this.native}"
        .headers="${this._headers}"
        .requiredToken="${this.requiredToken}"
        cachekey="${l(this.forecastTransactionsCacheKey)}"
        cachetype="${l(this.forecastTransactionsCacheKey&&this.cacheType)}"
        host="${this.host}"
        version="${this.personalFinancesApiVersion}"
        @api-dm-error="${this._manageForecastTransactionsSearchError}"
        @forecast-transactions-search-api-dm-fetch-error="${this._manageForecastTransactionsSearchError}"
        @forecast-transactions-search-api-dm-fetch="${this._manageForecastTransactionsSearchResponse}"
      ></bbva-global-forecast-transactions-search-api-dm>
      ${this._content}
    `}_dispatchEvent(e,t){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}}var fa=s`
  :host {
    display: block;
    box-sizing: border-box;
  }

  *,
  *:before,
  *:after {
    box-sizing: inherit;
  }

  .fit {
    display: block;
    margin-left: 1rem;
    margin-right: 1rem;
  }

  [data-tag-name='bbva-header-category'] {
    padding: 1rem;
  }

  [data-tag-name='bbva-tab-default'] {
    margin-bottom: 0;
  }
  [data-tag-name='bbva-tab-default'] [data-tag-name='bbva-header-category'] {
    padding: 1rem;
  }

  [data-tag-name='bbva-form-rating'] {
    padding: 1.5rem 0;
  }

  [data-tag-name='pfm-categorization-detail-panel-info'] {
    padding: 1.5rem;
  }

  [data-tag-name='pfm-categorization-detail-brands-forecast'],
  [data-tag-name='pfm-categorization-detail-movements-forecast'],
  [data-tag-name='pfm-categorization-detail-category-forecast'] {
    margin: 0 1rem;
  }
`;class $a extends ua{static get is(){return"pfm-categorization-detail-group-detail"}static get scopedElements(){const e=[Q,je,Tt,oe,Ke,Ye,Zt,aa,Wt,ma,_a];return{...super.scopedElements,...$a.scopedElementsFromClasses(e)}}static get properties(){return{animateBudgetsActions:{type:Boolean,attribute:"animate-budgets-actions"},avoidGetTransactions:{type:Boolean,attribute:"avoid-get-transactions"},brandsBalancesCacheKey:{type:String,attribute:"brands-balances-cache-key"},budgets:{type:Array},categoryId:{type:String,attribute:"category-id"},categoryName:{type:String,attribute:"category-name"},contractSubtypeId:{type:String,attribute:"contract-subtype-id"},contractTypeId:{type:String,attribute:"contract-type-id"},expandForecastAccordeon:{type:Boolean,attribute:"expand-forecast-accordeon"},expandForecastCategory:{type:Boolean,attribute:"expand-forecast-category"},expandForecastSubcategory:{type:Boolean,attribute:"expand-forecast-subcategory"},feedbackValue:{type:Number,attribute:"feedback-value"},hideBrands:{type:Boolean,attribute:"hide-brands"},hideOperativeActions:{type:Boolean,attribute:"hide-operative-actions"},legendColors:{type:Array,attribute:"legend-colors"},showBudgetsActions:{type:Boolean,attribute:"show-budgets-actions"},showFeedback:{type:Boolean,attribute:"show-feedback"},showUndatedEstimates:{type:Boolean,attribute:"show-undated-estimates"},_brands:{type:Array,state:!0},_brandsError:{type:Boolean,state:!0},_loadingBrands:{type:Boolean,state:!0}}}constructor(){super(),this._brandsError=!1,this._loadingBrands=!0,this.animateBudgetsActions=!1,this.avoidGetTransactions=!1,this.cacheType="SESSION",this.expandForecastCategory=!1,this.feedbackValue=void 0,this.hideBrands=!1,this.hideOperativeActions=!1,this.showBudgetsActions=!1,this.showFeedback=!1,this.showUndatedEstimates=!1}static get styles(){return[super.styles,fa,W.primary,J,Ge.primary,de.primary,Le.primary,Ue.primary]}firstUpdated(){super.firstUpdated(),this._brandsBalancesSearchDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-brands-balances-search-api-dm"]')}updated(e){var t,a;super.updated(e);!(e.has("data")&&(null===(t=e.get("data"))||void 0===t?void 0:t.id)!==(null===(a=this.data)||void 0===a?void 0:a.id))&&!e.has("period")||this.hideBrands||this._sendGetBrandsBalancesSearchRequest()}static _getIcon(e){return g[e]?g[e]():$()}get _headers(){return this.headers||{"accept-language":this.language}}get _isGroupLevel(){var e;return Boolean(null===(e=this.data)||void 0===e?void 0:e.categories)}_sendGetBrandsBalancesSearchRequest(){if(!this.data)return;this._loadingBrands=!0;const e={pfmId:this.pfmId,frequencyId:"ONE_TIME",groupIds:[this.groupId],...this._isGroupLevel&&{categoryIds:[this.data.id]},...this.period&&{periodStartDate:this.period.startDate.startOf("day").toISOString()},...this.period&&{periodEndDate:this.period.endDate.endOf("day").toISOString()},...this.contractId&&{contracts:[{id:this.contractId,"productType.id":this.contractTypeId,...this.contractSubtypeId&&{"subProductType.id":this.contractSubtypeId}}]}};this._brandsBalancesSearchDm.postBrandsBalancesSearch(e)}_manageBrandsBalancesSearchResponse({detail:e}){const[t]=(null==e?void 0:e.balances)||[],a=(null==t?void 0:t.brands)||[];this._brands=a.sort(((e,t)=>e.totalTransactions-t.totalTransactions)),this._loadingBrands=!1}_manageBrandsBalancesSearchError(){this._loadingBrands=!1,this._brandsError=!0}_manageCategorySelect(e){const t=this._isGroupLevel?"pfm-categorization-detail-category-select":"pfm-categorization-detail-subcategory-select";this._dispatchEvent(t,e)}_findBudget(e){var t;return null===(t=this.budgets)||void 0===t?void 0:t.find((t=>{var a,i;return(this.categoryId?null===(a=t.subcategory)||void 0===a?void 0:a.id:null===(i=t.category)||void 0===i?void 0:i.id)===e.id&&"MY_PERIOD"===t.frequency.id}))}_handleCategoryItemSwipeAction(e,t){var a,i,s,r;const n=null===(a=e.detail)||void 0===a||null===(i=a.item)||void 0===i?void 0:i.id,o={...t,categoryName:t.name,categoryId:this.categoryId||t.id};if("detail"===n){const e=this._findBudget(t);o.budgetId=null==e?void 0:e.id}this._isGroupLevel||(o.categoryName=this.data.name,o.subcategoryName=t.name,o.subcategoryId=t.id),this._dispatchEvent(`pfm-categorization-detail-budget-${null===(s=e.detail)||void 0===s||null===(r=s.item)||void 0===r?void 0:r.id}`,o)}_handleSwipeAnimationEnd(){this._dispatchEvent("pfm-categorization-detail-budgets-action-animate")}_animateBudgetsSwipe(e){return this.animateBudgetsActions&&this.showBudgetsActions&&0===e&&this.budgets}_getCategorySwipeActions(e){if(!this.showBudgetsActions)return[];return this._findBudget(e)?[{icon:S(),id:"detail",label:this.t("pfm-categorization-detail-budget-action-detail")}]:[{icon:C(),id:"create",label:this.t("pfm-categorization-detail-budget-action-create")}]}get _categoriesListTmpl(){var e,t;const a=this._isGroupLevel?null===(e=this.data)||void 0===e?void 0:e.categories:null===(t=this.data)||void 0===t?void 0:t.subcategories;return d`
      <div role="list" aria-busy="true">
        ${null!=a&&a.length?a.map(((e,t,a)=>{var i,s,r,n;return d`
                <bbva-list-swipe
                  ?animate="${this._animateBudgetsSwipe(t)}"
                  .operativeActions="${this._getCategorySwipeActions(e)}"
                  ambient="primary"
                  interactive
                  role="listitem"
                  @bbva-list-swipe-animation-end="${this._handleSwipeAnimationEnd}"
                  @list-swipe-action-click="${t=>this._handleCategoryItemSwipeAction(t,e)}"
                >
                  <div slot="invoker">
                    <pfm-categorization-detail-list-movement
                      ?discreet-mode="${this.discreetMode}"
                      accessibility-mask="${this.t("pfm-categorization-detail-mask-products")}"
                      amount="${e.totalAmount.amount}"
                      bg-color-clip="${l(this.data.categories&&(null===(i=m[null===(s=e.image)||void 0===s?void 0:s.id])||void 0===i?void 0:i.color))}"
                      currency-code="${e.totalAmount.currency}"
                      extended-concept="${this.t(e.totalTransactions>1?"pfm-categorization-detail-item-description":"pfm-categorization-detail-item-description-one",{totalTransactions:e.totalTransactions})}"
                      heading="${e.name}"
                      icon-clip="${l(this.data.categories&&$a._getIcon(null===(r=m[null===(n=e.image)||void 0===n?void 0:n.id])||void 0===r?void 0:r.icon))}"
                      language="${this.language}"
                      local-currency="${e.totalAmount.currency}"
                      mode="${this.darkModeScheme}"
                      @click="${()=>this._manageCategorySelect(e)}"
                    ></pfm-categorization-detail-list-movement>
                  </div>
                </bbva-list-swipe>
                <bbva-divider-default
                  class="${t!==a.length-1?"fit":"full"}"
                ></bbva-divider-default>
              `})):this._emptyList("categories")}
      </div>
    `}get _brandsListTmpl(){return d`
      <div role="list" aria-busy="true">
        ${this._brands.length?this._brands.map(((e,t,a)=>{var i,s,r,n,o,c;const h=null===(i=e.image)||void 0===i||null===(s=i.links)||void 0===s||null===(r=s[0])||void 0===r?void 0:r.href;let p=$(),u=_.secondary300;const g=m[null===(n=e.categoryImages)||void 0===n||null===(o=n[0])||void 0===o?void 0:o.id];return"NO_BRAND_ID"!==e.id&&(p=$a._getIcon(null==g?void 0:g.icon),u=(null==g?void 0:g.color)||_.secondary300),(null===(c=e.categoryImages)||void 0===c?void 0:c.length)>1&&(p=x()),d`
                <pfm-categorization-detail-list-movement
                  ?discreet-mode="${this.discreetMode}"
                  accessibility-mask="${this.t("pfm-categorization-detail-mask-products")}"
                  amount="${e.totalAmount.amount}"
                  bg-color-clip="${u}"
                  currency-code="${e.totalAmount.currency}"
                  extended-concept="${this.t(e.totalTransactions>1?"pfm-categorization-detail-item-description":"pfm-categorization-detail-item-description-one",{totalTransactions:e.totalTransactions})}"
                  heading="${e.name}"
                  highlight-category
                  icon-clip="${h?"":p}"
                  image="${l(h)}"
                  language="${this.language}"
                  local-currency="${e.totalAmount.currency}"
                  mode="${this.darkModeScheme}"
                  role="listitem"
                  @click="${()=>this._dispatchEvent("pfm-categorization-detail-brand-select",{...e,groupId:this.groupId,categoryId:this.categoryId,subcategoryId:this.subcategoryId,period:this.period})}"
                ></pfm-categorization-detail-list-movement>
                <bbva-divider-default
                  class="${t!==a.length-1?"fit":"full"}"
                ></bbva-divider-default>
              `})):this._emptyList("brands")}
      </div>
    `}get _tabs(){const e=[{name:this.categoryName,title:this.t("pfm-categorization-detail-tab3-text")},{name:this.categoryName,title:this._isGroupLevel?this.t("pfm-categorization-detail-tab1-text"):this.t("pfm-categorization-detail-tab1-subcategories")}];return this.hideBrands||e.push({name:this.categoryName,title:this.t("pfm-categorization-detail-tab2-text")}),d`
      <bbva-tab-default
        .options=${this.data?e:[]}
        accessibility-text="Available sections"
        ambient="primary"
        selected="${this.selectedTab}"
        @tab-default-tab-change="${e=>{this.selectedTab=e.detail.selectedIndex}}"
        @tab-default-tab-click="${e=>{this._dispatchEvent("pfm-categorization-detail-tab-click",e.detail)}}"
      >
        <div class="panel" role="tabpanel" id="content-0" aria-labelledby="tab-0">
          ${this._movementsTab}
        </div>
        <div class="panel" role="tabpanel" id="content-1" aria-labelledby="tab-1">
          ${this._categoriesTab}
        </div>
        ${this.hideBrands?h:d`
              <div class="panel" role="tabpanel" id="content-2" aria-labelledby="tab-2">
                ${this._brandsTab}
              </div>
            `}
      </bbva-tab-default>
    `}get _movementsTab(){var e,t,a,i;return d`
      ${this._movementsForecast}
      <pfm-categorization-detail-movements
        ?animate-movement="${this.animateMovement}"
        ?avoid-get-transactions="${this.avoidGetTransactions}"
        ?discreet-mode="${this.discreetMode}"
        ?enable-movement-link="${this.enableMovementLink}"
        ?native="${this.native}"
        ?otp-cancelled="${this.otpCancelled}"
        .requiredToken="${this.requiredToken}"
        .userContracts="${this.userContracts}"
        category-id="${l(this.categoryId)}"
        contract-id="${l(this.contractId)}"
        contract-subtype-id="${l(this.contractSubtypeId)}"
        contract-type-id="${l(this.contractTypeId)}"
        dark-mode-scheme="${this.darkModeScheme}"
        from-operation-date="${null===(e=this.period)||void 0===e||null===(t=e.startDate)||void 0===t?void 0:t.startOf("day").toISOString()}"
        group-id="${this.groupId}"
        ?hide-operative-actions="${this.hideOperativeActions}"
        host="${this.host}"
        language="${this.language}"
        pending-category-id="${this.pendingCategoryId}"
        personal-finances-api-version="${this.personalFinancesApiVersion}"
        pfm-id="${this.pfmId}"
        subcategory-id="${l(this.subcategoryId)}"
        to-operation-date="${null===(a=this.period)||void 0===a||null===(i=a.endDate)||void 0===i?void 0:i.endOf("day").toISOString()}"
        transactions-order-by="${this.transactionsOrderBy}"
      ></pfm-categorization-detail-movements>
    `}get _movementsForecast(){return this.showMovementsForecasting&&this._showForecastInfo?d`
        <pfm-categorization-detail-movements-forecast
          ?discreet-mode="${this.discreetMode}"
          ?expand-accordeon="${this.expandForecastAccordeon}"
          ?native="${this.native}"
          ?show-undated-estimates="${this.showUndatedEstimates}"
          .period="${this.period}"
          .requiredToken="${this.requiredToken}"
          .userContracts="${this.userContracts}"
          cache-type="${l(this.forecastTransactionsCacheKey&&this.cacheType)}"
          category-id="${l(this.categoryId)}"
          contract-id="${l(this.contractId)}"
          contract-subtype-id="${l(this.contractSubtypeId)}"
          contract-type-id="${l(this.contractTypeId)}"
          dark-mode-scheme="${this.darkModeScheme}"
          forecast-balances-cache-key="${l(this.forecastBalancesCacheKey)}"
          forecast-transactions-cache-key="${l(this.forecastTransactionsCacheKey)}"
          group-id="${this.groupId}"
          host="${this.host}"
          language="${this.language}"
          personal-finances-api-version="${this.personalFinancesApiVersion}"
          pfm-id="${this.pfmId}"
        ></pfm-categorization-detail-movements-forecast>
      `:h}get _categoriesTab(){var e,t;return d`
      ${this._categoryForecast}
      ${this.loading||null!==(e=this.data)&&void 0!==e&&null!==(t=e.categories)&&void 0!==t&&t.length?d`
            <bbva-header-category
              ?loading=${this.loading}
              heading-level="2"
              text="${this._formattedDate}"
              variant="date"
            ></bbva-header-category>
          `:h}
      ${this.loading?h:this._categoriesListTmpl}
    `}get _categoryForecast(){return this.showCategoryForecasting&&this._showForecastInfo?d`
        <pfm-categorization-detail-category-forecast
          ?discreet-mode="${this.discreetMode}"
          ?expand-accordeon="${this.expandForecastCategory}"
          ?native="${this.native}"
          ?show-undated-estimates="${this.showUndatedEstimates}"
          .period="${this.period}"
          .requiredToken="${this.requiredToken}"
          cache-type="${l(this.forecastBalancesCacheKey&&this.cacheType)}"
          category-id="${l(this.categoryId)}"
          contract-id="${l(this.contractId)}"
          contract-subtype-id="${l(this.contractSubtypeId)}"
          contract-type-id="${l(this.contractTypeId)}"
          dark-mode-scheme="${this.darkModeScheme}"
          forecast-balances-cache-key="${l(this.forecastBalancesCacheKey)}"
          group-id="${this.groupId}"
          host="${this.host}"
          language="${this.language}"
          personal-finances-api-version="${this.personalFinancesApiVersion}"
          pfm-id="${this.pfmId}"
          subcategory-id="${l(this.subcategoryId)}"
        ></pfm-categorization-detail-category-forecast>
      `:h}get _brandsTab(){var e;return d`
      ${this._brandsForecast}
      ${this._loadingBrands||null!==(e=this._brands)&&void 0!==e&&e.length?d`
            <bbva-header-category
              ?loading=${this._loadingBrands}
              heading-level="2"
              text="${this._formattedDate}"
              variant="date"
            ></bbva-header-category>
          `:h}
      ${this._brandsError?this._errorTemplate:h}
      ${this._loadingBrands||this._brandsError?h:this._brandsListTmpl}
    `}get _brandsForecast(){return this.showBrandsForecasting&&this._isGroupLevel&&this._showForecastInfo?d`
        <pfm-categorization-detail-brands-forecast
          ?discreet-mode="${this.discreetMode}"
          ?native="${this.native}"
          .period="${this.period}"
          .requiredToken="${this.requiredToken}"
          cache-type="${l(this.recurringExpensesBalancesCacheKey&&this.cacheType)}"
          contract-id="${l(this.contractId)}"
          contract-subtype-id="${l(this.contractSubtypeId)}"
          contract-type-id="${l(this.contractTypeId)}"
          dark-mode-scheme="${this.darkModeScheme}"
          host="${this.host}"
          language="${this.language}"
          personal-finances-api-version="${this.personalFinancesApiVersion}"
          pfm-id="${this.pfmId}"
          recurring-expenses-balances-cache-key="${l(this.recurringExpensesBalancesCacheKey)}"
          recurring-expenses-cache-key="${l(this.recurringExpensesCacheKey)}"
        ></pfm-categorization-detail-brands-forecast>
      `:h}get _dataManagers(){return d`
      <bbva-global-brands-balances-search-api-dm
        ?native="${this.native}"
        .headers="${this._headers}"
        .requiredToken="${this.requiredToken}"
        cachekey="${this.brandsBalancesCacheKey}"
        cachetype="${l(this.brandsBalancesCacheKey&&this.cacheType)}"
        host="${this.host}"
        version="${this.personalFinancesApiVersion}"
        @api-dm-error="${this._manageBrandsBalancesSearchError}"
        @brands-balances-search-api-dm-fetch-error="${this._manageBrandsBalancesSearchError}"
        @brands-balances-search-api-dm-fetch="${this._manageBrandsBalancesSearchResponse}"
      ></bbva-global-brands-balances-search-api-dm>
    `}get _feedback(){if(!this.showFeedback||this._brandsError)return h;const e=void 0!==this.feedbackValue?this.t("pfm-categorization-detail-feedback-text"):"";return d`
      <bbva-form-rating
        accessibility-text="${this.t("pfm-categorization-detail-feedback-accessibility")}"
        ambient="primary"
        content-title="${this.t("pfm-categorization-detail-feedback-title")}"
        text="${e}"
        thumbs
        value="${l(this.feedbackValue)}"
      ></bbva-form-rating>
    `}get content(){return d` ${this._tabs} ${this._feedback} `}}class Sa extends(t(a)){}class Ca{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let a=Object(this),i=a.length>>>0;if(0===i)return!1;let s=0|t,r=Math.max(s>=0?s:i-Math.abs(s),0);for(;r<i;){if((n=a[r])===(o=e)||"number"==typeof n&&"number"==typeof o&&isNaN(n)&&isNaN(o))return!0;r++}var n,o;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var a=[],i=0,s="",r=0,n=arguments.length;r!==n;++r){var o=+arguments[r];if(!(o<1114111&&o>>>0===o))throw RangeError("Invalid code point: "+o);o<=65535?i=a.push(o):(o-=65536,i=a.push(55296+(o>>10),o%1024+56320)),i>=16383&&(s+=e.apply(null,a),a.length=0)}return s+e.apply(null,a)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",a=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${a&&a.message}`)}}class xa extends Ca{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}}const Ta=0,Ea=1,Ia="jwt",ka="tsec",wa="none";class Aa extends Ca{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=Ta,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new xa,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=ka:this.requiredToken=wa,this.requiresJWT=!1):this.requiredToken===ka?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===Ia?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===wa?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(ka)}_setJwtHandler(){this._setTokenHandler(Ia)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((a,i)=>{t=Object.assign(t,{resolve:a,reject:i}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let a=this._getRequestHeaders();Object.keys(a).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,a[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let t=null;return!!window.CellsNativePlugins&&(t=e),t}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let a=e.replace(/[\{\}]+/g,""),i=t[a];return i?delete t[a]:this._error(9,`Missing ${a} param value`),i})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let a=Object.keys(t);a.length&&(e=[e,a.map((e=>{let a=t[e];return Array.isArray(a)&&this.paramArrayMode===Ea?this._arrayToQueryParam(e,a):`${e}=${a}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(ka,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(Ia,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(a){var i=t.getItem(a);i&&"null"!==i&&(e[a]=i)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const a=window.sessionStorage;t=Object.keys(a).filter((t=>t.startsWith(e))).reduce(((t,i)=>(t[i.replace(e,"")]=a.getItem(i),t)),{})}return t}_getTokenForRequestHeaders(e,t){const a=`${e}Handler`,i=e===Ia?"JWT ":"",s=e===Ia?"Authorization":ka;if(void 0===this[a]||null===this[a])this._error(11,`${e} handler is undefined`);else{const r=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let n=this[a].getItem(r);n?t[s]=t[s]||i+n:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((a=>{t.push(`${a}=${e[a]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(a){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(a){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let a;const i=new Promise(((e,t)=>{a=(a,i)=>{a?t(a):e(i)}}));return t.addEventListener("loadend",(function e(i){t.removeEventListener("loadend",e),i.error?a(i.error):a(null,t.result)})),t.readAsText(e),i}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let a=0;for(;a<e.length;){let i=e[a],s=0,r=0;if(i<=127?(s=0,r=255&i):i<=223?(s=1,r=31&i):i<=239?(s=2,r=15&i):i<=244&&(s=3,r=7&i),e.length-a-s>0){let t=0;for(;t<s;)i=e[a+t+1],r=r<<6|63&i,t+=1}else r=65533,s=e.length-a;t+=String.fromCodePoint(r),a+=s+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},a=e.trim().split(/[\r\n]+/);for(const e in a)if(a.hasOwnProperty(e)&&""!==a[e]){let i=": ",s=a[e].split(i);t[s.shift().toLowerCase()]=s.join(i)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,a,i){let s=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(i)>=0&&(s=t.getResponseHeader(i));break;case this._NATIVE_XHR:t&&t.headers&&(s=JSON.parse(t.headers)[i])}if(s){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):a;e.getItem(t)!==s&&(e.setItem(t,s),this._emitTokenUpdate(a,s))}}_emitTokenUpdate(e,t){if(this.htmlContext){const a=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(a)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,a,i,s,r;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),a=e.getResponseHeader("AuthenticationData"),i=e.getResponseHeader("AuthenticationState"),s=e.getResponseHeader("AuthenticationChallenge"),r=e.getResponseHeader("AuthenticationResponse");else{let n=JSON.parse(e.headers);t=n.authenticationtype,a=n.authenticationdata||null,i=n.authenticationstate,s=n.authenticationchallenge,r=n.authenticationresponse}return{type:t,data:a,state:i,challenge:s,response:r}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",a=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const i=this._getSignatureData(e,t,a);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:i}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",a="",i=""){let s;if("object"==typeof e&&e){const r=this._getSignatureData(e.signatureType,t,a);s=this._makeKeyValuePairFromObject(r,e.signatureValue),e.challenge&&(s+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(s,e.signatureType,i)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(s=`password=${e}`,this._buildSignatureHeaders(s,"2",i)):(s=`${a}=${e}`,this._buildSignatureHeaders(s,t,i)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let a,i=e.split(",");if(i.length>1){a=i.map((e=>`${e}=${t[e]}`)).join(",")}else a=`${e}=${t}`;return a}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",a=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),a&&(this.headers=Object.assign(this.headers,{AuthenticationState:a})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let a=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),s=this._ERROR_CODES.SIGNATURE_INVALID.includes(i),{type:r,data:n,state:o,challenge:c,response:d}=this._extractSignatureResponseHeaders(e),l=this._getRequestMetadata(e);if(s)this._notifySignatureInvalid(l),a=!0;else if(r)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(i)?(this._notifySignatureTypeUsingErrorCode(i,l,r,n,o,c,d),a=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(l,r,n,o,c,d),a=!0}return a}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let a=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),s=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(i),r=this._getRequestMetadata(e);s&&(this._notifyWaitingForProcessResponse(r),a=!0)}return a}_notifySignatureRequiredFirstStep(e,t,a,i){this._defineSignatureType(t,a),this._defineSignatureValue(t,a,i),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:a,metadata:e}}))}_notifySignatureRequired(e,t,a,i,s,r){this._defineSignatureValue(t,a,i);const n={type:t,data:a,challenge:s,metadata:e};r&&(n.response=r),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:n}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:a}=e;return{path:this._path,method:this.method,url:t,status:a}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",a=""){const i=t.split(";").findIndex((t=>t===e));return a?a.split(";")[i]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,a,i,s,r){i?this._notifySignatureRequired(e,t,a,i,s,r):this._notifySignatureRequiredFirstStep(e,t,a,i)}_notifySignatureTypeUsingErrorCode(e,t,a,i,s,r,n){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,a,i,s):this._notifySignatureRequired(t,a,i,s,r,n)}}class Pa extends Aa{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}}class Ba extends Pa{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customer-analytics/v${this.version}/customer-analytics`)}toString(){return super.toString("BGADPCustomerAnalyticsGetV0")}}class Ra extends Sa{static get is(){return"bbva-global-customer-analytics-api-dm"}static get properties(){return{customerAnalytics:{type:Array,attribute:!1}}}constructor(){super(),this.customerAnalytics=[]}resetCustomerAnalytics(){this.customerAnalytics=[]}getCustomerAnalytics(e={}){if(Object.keys(this.customerAnalytics).length)return;this._generateGetService(this._getService(e),{customEvent:"customer-analytics-api-dm-fetch",errorFireEventHandler:"customer-analytics-api-dm-fetch-error"},this._responseMapping,e.fields)}_getService(e){var t=this._getServiceParams(e);return t.params=e||{},this._getServicePath("customerAnalytics",this._getBgadp(t))}_getBgadp(e){return{customerAnalyticsV0:()=>new Ba(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}var Da=s`
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

:host([disabled]) [data-tag-name=bbva-type-link][focus-visible] {
  outline: none;
}

.header {
  display: flex;
  height: var(--bbva-header-navigation-height, calc(var(--bbva-global-spacer, 8px) * 5));
  align-items: center;
  justify-content: space-between;
}

.text {
  overflow: hidden;
  font-size: var(--bbva-header-navigation-font-size, var(--typographyTypeSmall, ${r(T.typeSmall)}));
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${r(n.medium.fontWeight)});
}

.content {
  position: relative;
  width: 100%;
  height: auto;
}

:host([loading]) {
  overflow: hidden;
  width: 100%;
  height: 4rem;
  background-color: var(--_skeleton-default-bg-color);
  -webkit-mask-image: linear-gradient(black 100%, transparent 0), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(black 100%, transparent 0);
  mask-image: linear-gradient(black 100%, transparent 0), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(black 100%, transparent 0);
  -webkit-mask-position: calc(0% + 24px) 12px, calc(50% + 50px) 16px, calc(100% - 24px) 12px;
  mask-position: calc(0% + 24px) 12px, calc(50% + 50px) 16px, calc(100% - 24px) 12px;
  -webkit-mask-repeat: no-repeat;
  mask-repeat: no-repeat;
  -webkit-mask-size: 24px 24px, calc((100px * 2) + (16px/ 2)) 16px, 24px 24px;
  mask-size: 24px 24px, calc((100px * 2) + (16px/ 2)) 16px, 24px 24px;
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
`;const Ma=s`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-header-navigation--_ambient--skeleton-quote-color: initial;
    --bbva-header-navigation--_ambient--skeleton-animated-layer-bg: initial;
  }
`,Oa=s`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-header-navigation--_ambient--skeleton-quote-color: var(
      --bbva-header-navigation--custom--primary-alt-ambient--skeleton-quote-color,
      ${D("colorPrimaryAltSurfaceAmbientPreloading",M)}
    );

    --bbva-header-navigation--_ambient--skeleton-animated-layer-bg: var(
      --bbva-header-navigation--custom--primary-alt-ambient--skeleton-animated-layer-bg,
      ${D("colorPrimaryAltSurfaceAmbientDefault",M)}
    );
  }
`,za=s`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-header-navigation--_ambient--skeleton-quote-color: var(
      --bbva-header-navigation--custom--secondary-ambient--skeleton-quote-color,
      ${D("colorSecondarySurfaceAmbientPreloading",M)}
    );

    --bbva-header-navigation--_ambient--skeleton-animated-layer-bg: var(
      --bbva-header-navigation--custom--secondary-ambient--skeleton-animated-layer-bg,
      ${D("colorSecondarySurfaceAmbientDefault",M)}
    );
  }
`,qa=s`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-header-navigation--_ambient--skeleton-quote-color: var(
      --bbva-header-navigation--custom--secondary-alt-ambient--skeleton-quote-color,
      ${D("colorSecondaryAltSurfaceAmbientPreloading",M)}
    );

    --bbva-header-navigation--_ambient--skeleton-animated-layer-bg: var(
      --bbva-header-navigation--custom--secondary-alt-ambient--skeleton-animated-layer-bg,
      ${D("colorSecondaryAltSurfaceAmbientDefault",M)}
    );
  }
`;const Ha=he([Object.freeze({__proto__:null,primary:Ma,primaryAlt:Oa,secondary:za,secondaryAlt:qa}),N,pe,ae]),Fa=Object.values(Ha);class Na extends(O(u(ue(a)))){static get is(){return"bbva-header-navigation"}static get scopedElements(){return{"bbva-type-link":se,"bbva-type-text":K,"bbva-type-date":ge}}static get properties(){return{accessibilityTextPrev:{type:String,attribute:"accessibility-text-prev"},accessibilityTextNext:{type:String,attribute:"accessibility-text-next"},iconPrev:{type:String,attribute:"icon-prev"},iconNext:{type:String,attribute:"icon-next"},prevDisabled:{type:Boolean,attribute:"prev-disabled"},nextDisabled:{type:Boolean,attribute:"next-disabled"},text:{type:String},loading:{type:Boolean,reflect:!0},isDateFormat:{type:Boolean,attribute:"is-date-format"},options:{type:Object},locale:{type:String},dateRange:{type:Array,attribute:"date-range"}}}constructor(){super(),this.accessibilityTextNext="Next",this.accessibilityTextPrev="Previous",this.iconPrev=E(),this.iconNext=I(),this.prevDisabled=!1,this.nextDisabled=!1,this.text="",this.loading=!1,this.isDateFormat=!1,this.options={day:"2-digit",month:"long",year:"numeric"}}static get styles(){return[super.styles,Da,Fa,o("bbva-header-navigation-shared-styles")]}_button(e){const t=e[0].toUpperCase()+e.slice(1);return d`
      <bbva-type-link
        id="${`btn-${e}`}"
        class="header-button"
        variant="icon"
        icon="${this[`icon${t}`]}"
        icon-size="24"
        @click="${this[`_${e}`]}"
        ?disabled="${this[`${e}Disabled`]}"
        aria-label="${this.t(this[`accessibilityText${t}`])}"
      ></bbva-type-link>
    `}get _text(){return this.isDateFormat?d`<bbva-type-date
          class="text"
          aria-live="polite"
          date="${this.text}"
          .dateRange="${this.dateRange}"
          .locale="${this.locale}"
          .options="${this.options}"
        ></bbva-type-date>`:d`<bbva-type-text
          unset
          class="text"
          aria-live="polite"
          .text="${this.t(this.text)}"
        ></bbva-type-text>`}render(){return this.loading?d``:d` <article>
          <header class="header" aria-controls="content-navigation">
            ${this._button("prev")}${this._text}${this._button("next")}
          </header>

          <div id="content-navigation" class="content">
            <slot></slot>
          </div>
        </article>`}_next(e){e.preventDefault(),this.dispatchEvent(new CustomEvent("header-navigation-next-click",{detail:!0,bubbles:!0,composed:!0}))}_prev(e){e.preventDefault(),this.dispatchEvent(new CustomEvent("header-navigation-prev-click",{detail:!0,bubbles:!0,composed:!0}))}}var Va=s`
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

  [role='listitem'] {
    position: relative;
  }

  [data-tag-name='bbva-header-navigation'] {
    padding: 1rem 0;
  }
  [data-tag-name='bbva-header-navigation'] [data-tag-name='bbva-type-text'].text {
    font-size: large;
    font-weight: 1rem;
  }

  [data-tag-name='pfm-categorization-detail-list-legend'] {
    padding: 0 1rem;
  }

  [data-tag-name='bbva-data-visualization-linear'] {
    padding: 0 1rem;
  }

  .list-container {
    display: flex;
    padding-bottom: 1rem;
  }
  .list-container > * {
    width: 50%;
  }
`;const{moment:Ga}=window,ja="MONTHLY",La="YEARLY",Ka={MONTHLY:{itemsPerPage:6,periods:24,sliceCurrentPeriod:{min:-12,max:void 0},slicePreviousPeriod:{min:-24,max:-12},type:"month"},YEARLY:{itemsPerPage:1,periods:2,sliceCurrentPeriod:{min:-2,max:void 0},slicePreviousPeriod:{min:-3,max:-1},type:"year"}};class Ua extends(p(U(u(a)))){static get is(){return"pfm-categorization-detail-chart"}static get scopedElements(){const e=[st,xt,rt,Ra,Na,ra,ca];return Ua.scopedElementsFromClasses(e)}static get properties(){return{cacheType:{type:String,attribute:"cache-type"},calculatorApiVersion:{type:String,attribute:"calculator-api-version"},categoryId:{type:String,attribute:"category-id"},chartType:{type:String,attribute:"chart-type"},contractId:{type:String,attribute:"contract-id"},contractSubtypeId:{type:String,attribute:"contract-subtype-id"},contractTypeId:{type:String,attribute:"contract-type-id"},currency:{type:String},customerAnalyticsApiVersion:{type:String,attribute:"customer-analytics-api-version"},customerAnalyticsCacheKey:{type:String,attribute:"customer-analytics-cache-key"},discreetMode:{type:Boolean,attribute:"discreet-mode"},groupId:{type:String,attribute:"group-id"},groupName:{type:String,attribute:"group-name"},hideComparativeMonths:{type:Boolean,attribute:"hide-comparative-months"},localCurrency:{type:String,attribute:"local-currency"},isExpenseGroup:{type:Boolean,attribute:"is-expense-group"},medianGroupId:{type:Object,attribute:"median-group-id"},period:{type:Object},personalFinancesApiVersion:{type:String,attribute:"personal-finances-api-version"},pfmId:{type:String,attribute:"pfm-id"},showChartAverage:{type:Boolean,attribute:"show-chart-average"},subcategoryId:{type:String,attribute:"subcategory-id"},useCustomerAnalytics:{type:Boolean,attribute:"use-customer-analytics"},_anualAverage:{type:Object,state:!0},_calculateAverageError:{type:Boolean,state:!0},_chartData:{type:Object,state:!0},_error:{type:Boolean,state:!0},_initialMonth:{type:Object,state:!0},_labelDateFormat:{type:String,state:!0},_selectedMonth:{type:Object,state:!0},_textCustomerAnalytics:{type:String,state:!0}}}static get styles(){return[Va,it.primary,Ha.primary]}constructor(){super(),this._calculateAverageError=!1,this._error=!1,this._labelDateFormat="MMM YYYY",this._textCustomerAnalytics="",this.cacheType="SESSION",this.calculatorApiVersion=0,this.chartType="MONTHLY",this.customerAnalyticsApiVersion="0",this.discreetMode=!1,this.groupName="",this.hideComparativeMonths=!1,this.isExpenseGroup=!1,this.localCurrency="EUR",this.showChartAverage=!1,this.useCustomerAnalytics=!1,this.medianGroupId={101:"medianIncomes",102:"investmentFundBalanceAmount",103:"medianExpenses"}}firstUpdated(){super.firstUpdated(),this._balancesSearchDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-balances-search-api-dm"]'),this._calculateApiDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-calculate-api-dm"]'),this._customerAnalyticsApiDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-customer-analytics-api-dm"]'),this._sendGetBalancesSearchRequest()}get _config(){return Ka[this.chartType]}get _headers(){return this.headers||{"accept-language":this.language}}_sendGetBalancesSearchRequest(){const{periods:e,type:t}=this._config,a={pfmId:this.pfmId,frequencyId:this.chartType,groupIds:[this.groupId],...this.categoryId&&{categoryIds:[this.categoryId]},...this.subcategoryId&&{subCategoryIds:[this.subcategoryId]},...this.period&&{periodStartDate:Ga().subtract(e,t).startOf(t).toISOString()},...this.period&&{periodEndDate:Ga().endOf(t).toISOString()},...this.contractId&&{contracts:[{id:this.contractId,"productType.id":this.contractTypeId,...this.contractSubtypeId&&{"subProductType.id":this.contractSubtypeId}}]}};this._balancesSearchDm.postBalancesSearch(a)}_manageBalancesSearchResponse({detail:e}){var t,a;const{sliceCurrentPeriod:i,slicePreviousPeriod:s,itemsPerPage:r}=this._config,n=(null==e||null===(t=e.balances)||void 0===t?void 0:t.slice(i.min,i.max))||[],o=(null==e||null===(a=e.balances)||void 0===a?void 0:a.slice(s.min,s.max))||[];this._balances=this.hideComparativeMonths?this._getBalancesWithoutComparativeMonths(n):this._getBalancesWithComparativeMonths(n,o),this._firstSemester=this._balances.slice(-r),this._secondSemester=this._balances.slice(2*-r,-r),this._chartData=this._firstSemester,this.period&&(this._selectedMonth=this._chartData.find((e=>Ga(e.currentPeriod.startDate).month()===this.period.startDate.month()))),this._selectedMonth=this._selectedMonth||this._chartData[this._chartData.length-1],this._initialMonth=this._selectedMonth,this._dispatchItemSelectedChange(),this.showChartAverage&&(this.useCustomerAnalytics?this._customerAnalyticsApiDm.getCustomerAnalytics():this._sendCalculateAverageRequest(this._balances))}_manageCustomerAnalyticsResponse({detail:e=[]}){if(null!=e&&e.length){var t,a,i;const s=null==e?void 0:e.find((e=>e.id===this.medianGroupId[this.groupId]));this._anualAverage=null==s||null===(t=s.measures)||void 0===t||null===(a=t[0])||void 0===a||null===(i=a.format.amounts)||void 0===i?void 0:i[0],this._textCustomerAnalytics=this.t(`pfm-categorization-detail-historical-analytics-${this.groupId}`)}else this._sendCalculateAverageRequest(this._balances)}_sendCalculateAverageRequest(e){const t=e.length;if(0===t)return void(this.showChartAverage=!1);const a=this.hideComparativeMonths?0:1,i=e.map((({values:e})=>({value:e[a].value||0,dividers:[{value:t}]})));this._textCustomerAnalytics=this.t("pfm-categorization-detail-historical-average"),this._calculateApiDm.postCalculate({operation:{operationType:"SUM_OR_SUBTRACTION",quantities:i}})}_manageCalculateAverageResponse({detail:e}){var t;this._anualAverage={amount:(null===(t=e.calculateValue)||void 0===t?void 0:t.value)||0,currency:this.currency}}_handleCalculateAverageError(){this._calculateAverageError=!0}_manageError(){this._error=!0}_getBalancesWithComparativeMonths(e,t){return e.map(((e,a)=>{var i,s,r,n,o;const{period:c}=e,{period:d}=(null==t?void 0:t[a])||e,l=e.groups?null===(i=e.groups)||void 0===i?void 0:i.find((({id:e})=>e===this.groupId)):e,h=(null==t||null===(s=t[a])||void 0===s||null===(r=s.groups)||void 0===r?void 0:r.find((({id:e})=>e===this.groupId)))||(null==t?void 0:t[a]),p=Ga(c.startDate).format("YYYY"),u=Ga(d.startDate).format("YYYY"),g=this.chartType===ja?`${Ga(c.startDate).locale(this.language).format("MMM")}`:`${u} - ${p}`,m=this.chartType===ja?`${Ga(c.startDate).locale(this.language).format(this._labelDateFormat)}`:`${this.t("pfm-categorization-detail-historical-year-label",{year:p})}`,y=this.chartType===ja?`${Ga(d.startDate).locale(this.language).format(this._labelDateFormat)}`:`${this.t("pfm-categorization-detail-historical-year-label",{year:u})}`,b=this.chartType===ja?`${Ga(c.startDate).locale(this.language).format("MMMM YYYY")}`:`${this.t("pfm-categorization-detail-historical-year-label",{year:p})}`,v=this.chartType===ja?`${Ga(d.startDate).locale(this.language).format("MMMM YYYY")}`:`${this.t("pfm-categorization-detail-historical-year-label",{year:u})}`,f=[{categoryColors:[_.primaryMediumLight],categoryColorsPressed:[_.primaryMedium],label:"pastYear",value:Math.abs((null==h||null===(n=h.totalAmount)||void 0===n?void 0:n.amount)||0)},{categoryColors:[_.tertiaryType3],categoryColorsPressed:[_.tertiaryType3Medium],label:"currentYear",value:Math.abs((null==l||null===(o=l.totalAmount)||void 0===o?void 0:o.amount)||0)}],$=Lt(m).replace(/\./g,""),S=Lt(y).replace(/\./g,""),C=Lt(b).replace(/\./g,""),x=Lt(v).replace(/\./g,""),T=Lt(g).replace(/\./g,"");return{categories:(null==l?void 0:l.categories)||(null==l?void 0:l.subcategories)||[],category:T,categoryTitle:Ga(c.startDate).format("MMMM YYYY"),currentPeriod:c,labelCurrentComparativePeriod:C,labelCurrentPeriod:$,labelPastComparativePeriod:x,labelPastPeriod:S,pastCategories:(null==h?void 0:h.categories)||(null==h?void 0:h.subcategories)||[],pastPeriod:d,values:f,year:Ga(c.startDate).format("YYYY")}}))}_getBalancesWithoutComparativeMonths(e){return e.map((e=>{var t,a;const{period:i}=e,s=e.groups?null===(t=e.groups)||void 0===t?void 0:t.find((({id:e})=>e===this.groupId)):e,r=`${Ga(i.startDate).locale(this.language).format("MMM")}`,n=`${Ga(i.startDate).locale(this.language).format(this._labelDateFormat)}`,o=[{categoryColors:[_.tertiaryType3],categoryColorsPressed:[_.tertiaryType3Medium],label:"currentYear",value:Math.abs((null==s||null===(a=s.totalAmount)||void 0===a?void 0:a.amount)||0)}],c=Lt(n).replace(/\./g,""),d=Lt(r).replace(/\./g,"");return{categories:(null==s?void 0:s.categories)||(null==s?void 0:s.subcategories)||[],category:d,categoryTitle:Ga(i.startDate).format("MMMM YYYY"),currentPeriod:i,labelCurrentPeriod:c,values:o,year:Ga(i.startDate).format("YYYY")}}))}_variabilityData(e){const t=this.isExpenseGroup&&e>0||!this.isExpenseGroup&&e>0?"increase":"decrease";return{status:t,color:this.isExpenseGroup&&"increase"===t||!this.isExpenseGroup&&"decrease"===t?"success":"error"}}_handlePeriodChange(e){"header-navigation-prev-click"===e.type?this._chartData=this._secondSemester:this._chartData=this._firstSemester,this._selectedMonth=this._chartData[this._chartData.length-1],this._initialMonth=this._selectedMonth,this._dispatchEvent("pfm-categorization-detail-range-dates-change",{categoryId:this.categoryId,subcategoryId:this.subcategoryId,type:e.type,chartType:this.chartType}),this._dispatchItemSelectedChange()}_handleBarClicked(e){var t;const a=(null===(t=e.detail)||void 0===t?void 0:t.selectedItem)||this._selectedMonth;a&&(this._selectedMonth=a),this._dispatchEvent("pfm-categorization-detail-chart-slider-change",{categoryId:this.categoryId,subcategoryId:this.subcategoryId,selectedMonth:a}),this._dispatchItemSelectedChange()}_dispatchItemSelectedChange(){this._dispatchEvent("pfm-categorization-detail-chart-item-selected-change",{...this._selectedMonth,categoryId:this.categoryId,subcategoryId:this.subcategoryId})}get _headerRangeDates(){const e=(e,t)=>new Date(e).toLocaleDateString(this.language,t),t=this._chartData[0],a=this._chartData[this._chartData.length-1],i={range:[],rangeOptions:this.chartType===ja?{month:"short",year:"numeric"}:{year:"numeric"}};if(!t||!a)return i;const s=this.chartType===ja?t.currentPeriod.startDate:t.pastPeriod.startDate;i.range.push(s),i.range.push(a.currentPeriod.startDate);let r=e(i.range[0],i.rangeOptions);r=r.charAt(0).toUpperCase()+r.slice(1);let n=e(i.range[1],i.rangeOptions);n=n.charAt(0).toUpperCase()+n.slice(1);return`${r} - ${n}`}get _dataManagers(){return d`
      <bbva-global-calculate-api-dm
        ?native="${this.native}"
        .host="${this.host}"
        .requiredToken="${this.requiredToken}"
        .version="${this.calculatorApiVersion}"
        @api-dm-error="${this._handleCalculateAverageError}"
        @calculate-api-dm-fetch-error="${this._handleCalculateAverageError}"
        @calculate-api-dm-fetch="${this._manageCalculateAverageResponse}"
      ></bbva-global-calculate-api-dm>
      <bbva-global-balances-search-api-dm
        ?native="${this.native}"
        .headers="${this._headers}"
        .requiredToken="${this.requiredToken}"
        host="${this.host}"
        version="${this.personalFinancesApiVersion}"
        @api-dm-error="${this._manageError}"
        @balances-search-api-dm-fetch-error="${this._manageError}"
        @balances-search-api-dm-fetch="${this._manageBalancesSearchResponse}"
      ></bbva-global-balances-search-api-dm>
      <bbva-global-customer-analytics-api-dm
        ?native="${this.native}"
        .host="${this.host}"
        .requiredToken="${this.requiredToken}"
        .version="${this.customerAnalyticsApiVersion}"
        cachekey="${this.customerAnalyticsCacheKey}"
        cachetype="${l(this.customerAnalyticsCacheKey&&this.cacheType)}"
        @api-dm-error="${this._handleCalculateAverageError}"
        @customer-analytics-api-dm-fetch-error="${this._handleCalculateAverageError}"
        @customer-analytics-api-dm-fetch="${this._manageCustomerAnalyticsResponse}"
      ></bbva-global-customer-analytics-api-dm>
    `}get _chartAverageTmpl(){var e,t,a;return d`
      <pfm-categorization-detail-list-legend
        ?discreet-mode="${this.discreetMode}"
        ?loading="${!this._anualAverage}"
        amount="${null===(e=this._anualAverage)||void 0===e?void 0:e.amount}"
        currency-code="${null===(t=this._anualAverage)||void 0===t?void 0:t.currency}"
        decimals-hidden
        icon-type="threeDots"
        label-ellipsis
        language="${this.language}"
        local-currency="${null===(a=this._anualAverage)||void 0===a?void 0:a.currency}"
        one-column
        text="${this._textCustomerAnalytics}"
      ></pfm-categorization-detail-list-legend>
    `}get _totalComparativeTmpl(){var e,t,a,i,s,r,n,o,c,l,h,p,u,g,m;const y=(null===(e=this._selectedMonth)||void 0===e||null===(t=e.values)||void 0===t||null===(a=t[0])||void 0===a?void 0:a.value)||0,b=(null===(i=this._selectedMonth)||void 0===i||null===(s=i.pastCategories[0])||void 0===s||null===(r=s.amounts)||void 0===r?void 0:r.currency)||this.localCurrency,v=(null===(n=this._selectedMonth)||void 0===n||null===(o=n.values)||void 0===o||null===(c=o[1])||void 0===c?void 0:c.value)||0,f=(null===(l=this._selectedMonth)||void 0===l||null===(h=l.categories[0])||void 0===h||null===(p=h.amounts)||void 0===p?void 0:p.currency)||this.localCurrency,$=v-y,S=this.chartType===La?"pfm-categorization-detail-history-comparative-year":"pfm-categorization-detail-history-comparative-title",{status:C,color:x}=this._variabilityData($);return d`
      <div role="list" class="list-container">
        <div role="listitem">
          <pfm-categorization-detail-list-legend
            ?discreet-mode="${this.discreetMode}"
            ?loading="${!this._chartData}"
            amount="${y}"
            currency-code="${b}"
            local-currency="${b}"
            icon-color="${_.primaryMediumLight}"
            icon-type="progressBar"
            label-ellipsis
            language="${this.language}"
            legend-direction="column"
            text="${(null===(u=this._selectedMonth)||void 0===u?void 0:u.labelPastPeriod)||""}"
          ></pfm-categorization-detail-list-legend>
        </div>
        <div role="listitem">
          <pfm-categorization-detail-list-legend
            ?discreet-mode="${this.discreetMode}"
            ?loading="${!this._chartData}"
            amount="${v}"
            currency-code="${f}"
            local-currency="${b}"
            icon-color="${_.tertiaryType3}"
            icon-type="progressBar"
            label-ellipsis
            language="${this.language}"
            legend-direction="column"
            text="${(null===(g=this._selectedMonth)||void 0===g?void 0:g.labelCurrentPeriod)||""}"
          ></pfm-categorization-detail-list-legend>
        </div>
      </div>
      <pfm-categorization-detail-list-definition-amount
        ?discreet-mode="${this.discreetMode}"
        ?loading="${!this._chartData}"
        amount-first
        amount-variant="l"
        amount="${Math.abs($)}"
        badge-variability-color="${x}"
        badge-variability-status="${C}"
        currency-code="${this.currency}"
        description="${this.t(S,{month:null===(m=this._selectedMonth)||void 0===m?void 0:m.categoryTitle.split(" ")[0]})}"
        language="${this.language}"
        local-currency="${this.currency}"
      ></pfm-categorization-detail-list-definition-amount>
    `}get _totalWithoutComparativeTmpl(){var e,t,a,i;const s=(null===(e=this._selectedMonth)||void 0===e||null===(t=e.values)||void 0===t||null===(a=t[0])||void 0===a?void 0:a.value)||0;return d`
      <pfm-categorization-detail-list-definition-amount
        ?discreet-mode="${this.discreetMode}"
        ?loading="${!this._selectedMonth}"
        amount-first
        amount-variant="l"
        amount="${s}"
        currency-code="${this.currency}"
        description="${this.t(`pfm-categorization-detail-chart-total-month-without-comparative-${this.groupId}`,{month:(null===(i=this._selectedMonth)||void 0===i?void 0:i.categoryTitle)||""})}"
        language="${this.language}"
        local-currency="${this.currency}"
      ></pfm-categorization-detail-list-definition-amount>
    `}get _mainContent(){var e;return d`
      <bbva-header-navigation
        ?next-disabled="${this._chartData===this._firstSemester}"
        ?prev-disabled="${this._chartData===this._secondSemester}"
        accessibility-text-next="${this.t("pfm-categorization-detail-historical-chart-next")}"
        accessibility-text-prev="${this.t("pfm-categorization-detail-historical-chart-prev")}"
        locale="${this.language}"
        text="${this._chartData?this._headerRangeDates:""}"
        @header-navigation-next-click="${this._handlePeriodChange}"
        @header-navigation-prev-click="${this._handlePeriodChange}"
      ></bbva-header-navigation>
      ${this.hideComparativeMonths?this._totalWithoutComparativeTmpl:this._totalComparativeTmpl}

      <bbva-data-visualization-linear
        ?narrow-bar="${this.chartType===ja}"
        ?show-range-selector="${this.chartType===ja}"
        .data="${this._chartData}"
        .selected="${null===(e=this._chartData)||void 0===e?void 0:e.indexOf(this._initialMonth)}"
        ambient="primary"
        chart-type="bar"
        show-avg-line
        show-bars-shadow
        show-x-axis
        show-x-axis-domain
        @data-visualization-vertical-bar-change="${this._handleBarClicked}"
      ></bbva-data-visualization-linear>
      ${this.showChartAverage&&!this._calculateAverageError?this._chartAverageTmpl:h}
    `}render(){return d` ${this._dataManagers} ${this._error?h:this._mainContent} `}_dispatchEvent(e,t){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}}var Ya=s`
  :host {
    --_pfm-categorization-detail-table-border-color: ${D("colorPrimaryCtaComplementaryBorderDefault",M)};
    --_pfm-categorization-detail-table-text-color: ${D("coplorPrimaryText02Default",M)};
    --_pfm-categorization-detail-table-amount-color: ${D("coplorPrimaryText02Default",M)};
    --_pfm-categorization-detail-table-background-color: ${D("colorPrimarySurfaceAlternativeDefault",M)};
  }
`,Xa=s`
  :host {
    display: block;
    box-sizing: border-box;
    --bbva-header-main-z-index: 1;
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

  [role='listitem'] {
    position: relative;
  }

  table {
    border-collapse: collapse;
    width: 100%;
  }
  table caption {
    padding-bottom: 0.5rem;
  }
  table td {
    border: 0.0625rem solid var(--_pfm-categorization-detail-table-border-color);
    width: 50%;
    vertical-align: top;
  }
  table td:nth-child(even) {
    background: var(--_pfm-categorization-detail-table-background-color);
  }
  table th {
    border: 0.0625rem solid var(--_pfm-categorization-detail-table-border-color);
    width: 50%;
    padding: 0.5rem 0;
    border-bottom: 0;
  }
  table th [data-tag-name='bbva-type-text'] {
    margin: 0;
    font-weight: var(
      --fontFacePrimaryMediumFontWeight,
      ${r(n.medium.fontWeight)}
    );
    font-style: var(
      --fontFacePrimaryMediumFontStyle,
      ${r(n.medium.fontStyle)}
    );
  }
  table th:nth-child(even) {
    background: var(--_pfm-categorization-detail-table-background-color);
  }
  table tbody tr:first-child td {
    border-top: 0;
  }
  table .c-list {
    padding: 1rem;
    text-align: left;
  }
  table .c-list__wrapper-secondary-amount {
    display: flex;
  }
  table .c-list [data-tag-name='bbva-type-link'] {
    margin: 0;
  }
  table .c-list [data-tag-name='bbva-type-text'] {
    margin-bottom: 0;
  }

  [data-tag-name='bbva-header-category'].detail-movements {
    margin: 1rem 1rem 0;
  }
  [data-tag-name='bbva-header-category']:first-child {
    padding-top: 1rem;
  }

  [data-tag-name='pfm-categorization-detail-panel-info'] {
    padding: 1rem;
  }

  [data-tag-name='bbva-tab-default'] {
    margin-bottom: 0;
  }
`;const{moment:Wa}=window,Ja="MONTHLY",Qa="YEARLY";class Za extends(p(U(u(a)))){static get is(){return"pfm-categorization-detail-history"}static get scopedElements(){const e=[ee,oe,Ye,L,se,K,Ua,ma,la];return Za.scopedElementsFromClasses(e)}static get properties(){return{animateMovement:{type:Boolean,attribute:"animate-movement"},cacheType:{type:String,attribute:"cache-type"},calculatorApiVersion:{type:String,attribute:"calculator-api-version"},categoryId:{type:String,attribute:"category-id"},contractId:{type:String,attribute:"contract-id"},contractSubtypeId:{type:String,attribute:"contract-subtype-id"},contractTypeId:{type:String,attribute:"contract-type-id"},currency:{type:String},customerAnalyticsApiVersion:{type:String,attribute:"customer-analytics-api-version"},customerAnalyticsCacheKey:{type:String,attribute:"customer-analytics-cache-key"},darkModeScheme:{type:String,attribute:"dark-mode-scheme"},discreetMode:{type:Boolean,attribute:"discreet-mode"},enableMovementLink:{type:Boolean,attribute:"enable-movement-link"},groupId:{type:String,attribute:"group-id"},groupName:{type:String,attribute:"group-name"},hideOperativeActions:{type:Boolean,attribute:"hide-operative-actions"},isExpenseGroup:{type:Boolean,attribute:"is-expense-group"},localCurrency:{type:String,attribute:"local-currency"},medianGroupId:{type:Object,attribute:"median-group-id"},otpCancelled:{type:Boolean,attribute:"otp-cancelled"},pendingCategoryId:{type:String,attribute:"pending-category-id"},period:{type:Object},personalFinancesApiVersion:{type:String,attribute:"personal-finances-api-version"},pfmId:{type:String,attribute:"pfm-id"},showChartAverage:{type:Boolean,attribute:"show-chart-average"},subcategoryId:{type:String,attribute:"subcategory-id"},transactionsOrderBy:{type:String,attribute:"transactions-order-by"},useCustomerAnalytics:{type:Boolean,attribute:"use-customer-analytics"},userContracts:{type:Array,attribute:"user-contracts"},_renderMovementsTab0:{type:Boolean,state:!0},_renderYearlyChart:{type:Boolean,state:!0},_selectedItemChart:{type:Object,state:!0}}}constructor(){super(),this._chartItems=6,this._chartTabSelected=0,this._renderMovementsTab0=!1,this._renderYearlyChart=!1,this._selectedChartView=Ja,this._selectedPeriodData={},this.animateMovement=!1,this.cacheType="SESSION",this.calculatorApiVersion="0",this.currency="EUR",this.customerAnalyticsApiVersion="0",this.darkModeScheme="",this.discreetMode=!1,this.enableMovementLink=!1,this.hideOperativeActions=!1,this.isExpenseGroup=!1,this.localCurrency="EUR",this.medianGroupId={101:"medianIncomes",102:"investmentFundBalanceAmount",103:"medianExpenses"},this.otpCancelled=!1,this.pendingCategoryId="9999",this.showChartAverage=!1,this.transactionsOrderBy="operationDate desc",this.useCustomerAnalytics=!1,this.userContracts=[]}static get styles(){return[Xa,Ya,Z.primary,de.primary,Ue.primary,F.primary,ae.primary,N.primary,N.primary]}static _tplText({alignment:e,className:t,fontWeight:a,loading:i,size:s,tag:r,text:n,unset:o}){return d`
      <bbva-type-text
        ?loading="${i}"
        ?unset="${o}"
        alignment="${l(e)}"
        class="${l(t)}"
        font-weight="${l(a)}"
        size="${l(s)}"
        tag="${l(r)}"
        text="${n}"
      ></bbva-type-text>
    `}_handleCategorySelect(e,t,a,i){const s=a?"subcategory":"category",{startDate:r,endDate:n}=t,o={amounts:[],averages:[],id:"",totalAmount:{amount:0,currency:i},totalTransactions:""};this._dispatchEvent(`pfm-categorization-detail-history-${s}-select`,{period:{startDate:Wa(r),endDate:Wa(n).endOf("month")},groupId:this.groupId,...o,...e})}_handleTabChange(e){0===e.detail.selectedIndex&&(this._renderMovementsTab0=!0),this._dispatchEvent("pfm-categorization-detail-history-tab-change",{...e.detail,groupId:this.groupId,categoryId:this.categoryId,subcategoryId:this.subcategoryId})}_handleTabChartChange(e){const t=[Ja,Qa],a=e.detail.selectedIndex;1===a&&(this._renderYearlyChart=!0),this._selectedChartView=t[a],this._selectedItemChart=this._selectedPeriodData[t[a]],this._dispatchEvent("pfm-categorization-detail-history-tab-chart-change",{...e.detail,groupId:this.groupId,categoryId:this.categoryId,subcategoryId:this.subcategoryId})}_handleChartItemChange(e,t){var a;const i=(null===(a=e.detail)||void 0===a?void 0:a.item)||e.detail;this._selectedPeriodData[t]=i,i&&t===this._selectedChartView&&(this._selectedItemChart=i)}_variabilityData(e){const t=this.isExpenseGroup&&e>0||!this.isExpenseGroup&&e>0?"increase":"decrease";return{status:t,color:this.isExpenseGroup&&"increase"===t||!this.isExpenseGroup&&"decrease"===t?"red":"green"}}get _headers(){return this.headers||{"accept-language":this.language}}get _showComparative(){return!this.subcategoryId}get selectedCurrentPeriod(){const e=this._selectedPeriodData[this._selectedChartView];return e&&e.currentPeriod?{startDate:Wa(e.currentPeriod.startDate),endDate:Wa(e.currentPeriod.endDate)}:null}get selectedPastPeriod(){const e=this._selectedPeriodData[this._selectedChartView];return e&&e.pastPeriod?{startDate:Wa(e.pastPeriod.startDate),endDate:Wa(e.pastPeriod.endDate)}:null}get _comparativeData(){var e,t,a,i;const s=(this.categoryId?null===(e=this._selectedItemChart.categories)||void 0===e||null===(t=e[0])||void 0===t?void 0:t.subcategories:this._selectedItemChart.categories)||[],r=(this.categoryId?null===(a=this._selectedItemChart.pastCategories)||void 0===a||null===(i=a[0])||void 0===i?void 0:i.subcategories:this._selectedItemChart.pastCategories)||[];if(!s.length&&!r.length)return[];const n=[...s,...r];return[...new Set(n.map((e=>e.id)))].map((e=>{var t,a;const i=s.find((({id:t})=>t===e)),n=r.find((({id:t})=>t===e)),o=(null==i||null===(t=i.totalAmount)||void 0===t?void 0:t.amount)||0,c=(null==n||null===(a=n.totalAmount)||void 0===a?void 0:a.amount)||0,d=Math.abs(o)-Math.abs(c),{status:l,color:h}=this._variabilityData(d);return{categoryId:e,color:h,currentCategory:i,diffAmount:d,pastCategory:n,status:l}})).sort(((e,t)=>e.diffAmount<t.diffAmount?1:-1))}cListItem({activeLink:e,category:t,categoryName:a,color:i,currency:s,isSubcategory:r,period:n,secondAmount:o,status:c}){var l;return d`
      <div class="c-list">
        ${e?d`
              <bbva-type-link
                ambient="primary"
                text="${a}"
                @click="${()=>this._handleCategorySelect(t,n,r,s)}"
              ></bbva-type-link>
            `:d`
              ${Za._tplText({fontWeight:500,size:"S",text:a,unset:!0})}
            `}
        ${Za._tplText({size:"S",text:this.t("pfm-categorization-detail-item-description",{totalTransactions:(null==t?void 0:t.totalTransactions)||0}),unset:!0})}
        <bbva-type-amount
          ?mask="${this.discreetMode}"
          amount="${(null==t||null===(l=t.totalAmount)||void 0===l?void 0:l.amount)||0}"
          currency-code="${s}"
          language="${this.language}"
          local-currency="${s}"
          variant="m"
        ></bbva-type-amount>
        ${o?d`
              <div class="c-list__wrapper-secondary-amount">
                <bbva-badge-variability color="${i}" status="${c}"></bbva-badge-variability
                ><bbva-type-amount
                  ?mask="${this.discreetMode}"
                  amount="${o}"
                  currency-code="${s}"
                  local-currency="${s}"
                  variant="m"
                ></bbva-type-amount>
              </div>
            `:h}
      </div>
    `}get _movementsComparative(){var e,t,a,i,s,r,n,o;return d`
      <bbva-header-category
        class="detail-movements"
        heading-level="2"
        text="${this.t("pfm-categorization-detail-movements-heading")}"
      >
      </bbva-header-category>
      <bbva-tab-default
        .options=${[{title:this._selectedItemChart.labelPastPeriod||""},{title:this._selectedItemChart.labelCurrentPeriod||""}]}
        accessibility-text="Available sections"
        selected="1"
        @tab-default-tab-click="${this._handleTabChange}"
      >
        <div class="panel" role="tabpanel" id="content-0" aria-labelledby="tab-0">
          ${this._renderMovementsTab0?d`
                <pfm-categorization-detail-movements
                  ?animate-movement="${this.animateMovement}"
                  ?discreet-mode="${this.discreetMode}"
                  ?enable-movement-link="${this.enableMovementLink}"
                  ?native="${this.native}"
                  ?otp-cancelled="${this.otpCancelled}"
                  .headers="${this._headers}"
                  ?hide-operative-actions="${this.hideOperativeActions}"
                  .requiredToken="${this.requiredToken}"
                  .userContracts="${this.userContracts}"
                  category-id="${l(this.categoryId)}"
                  contract-id="${l(this.contractId)}"
                  contract-subtype-id="${l(this.contractSubtypeId)}"
                  contract-type-id="${l(this.contractTypeId)}"
                  dark-mode-scheme="${this.darkModeScheme}"
                  from-operation-date="${l(null===(e=this.selectedPastPeriod)||void 0===e||null===(t=e.startDate)||void 0===t?void 0:t.startOf("day").toISOString())}"
                  group-id="${this.groupId}"
                  host="${this.host}"
                  language="${this.language}"
                  pending-category-id="${this.pendingCategoryId}"
                  personal-finances-api-version="${this.personalFinancesApiVersion}"
                  pfm-id="${this.pfmId}"
                  subcategory-id="${l(this.subcategoryId)}"
                  to-operation-date="${l(null===(a=this.selectedPastPeriod)||void 0===a||null===(i=a.endDate)||void 0===i?void 0:i.endOf("day").toISOString())}"
                  transactions-order-by="${this.transactionsOrderBy}"
                ></pfm-categorization-detail-movements>
              `:h}
        </div>
        <div class="panel" role="tabpanel" id="content-1" aria-labelledby="tab-1">
          <pfm-categorization-detail-movements
            ?animate-movement="${this.animateMovement}"
            ?discreet-mode="${this.discreetMode}"
            ?enable-movement-link="${this.enableMovementLink}"
            ?native="${this.native}"
            ?otp-cancelled="${this.otpCancelled}"
            .headers="${this._headers}"
            ?hide-operative-actions="${this.hideOperativeActions}"
            .requiredToken="${this.requiredToken}"
            .userContracts="${this.userContracts}"
            category-id="${l(this.categoryId)}"
            contract-id="${l(this.contractId)}"
            contract-subtype-id="${l(this.contractSubtypeId)}"
            contract-type-id="${l(this.contractTypeId)}"
            dark-mode-scheme="${this.darkModeScheme}"
            from-operation-date="${l(null===(s=this.selectedCurrentPeriod)||void 0===s||null===(r=s.startDate)||void 0===r?void 0:r.startOf("day").toISOString())}"
            group-id="${this.groupId}"
            host="${this.host}"
            language="${this.language}"
            pending-category-id="${this.pendingCategoryId}"
            personal-finances-api-version="${this.personalFinancesApiVersion}"
            pfm-id="${this.pfmId}"
            subcategory-id="${l(this.subcategoryId)}"
            to-operation-date="${l(null===(n=this.selectedCurrentPeriod)||void 0===n||null===(o=n.endDate)||void 0===o?void 0:o.endOf("day").toISOString())}"
            transactions-order-by="${this.transactionsOrderBy}"
          ></pfm-categorization-detail-movements>
        </div>
      </bbva-tab-default>
    `}get _emptyList(){return d`
      <bbva-header-category
        class="detail-movements"
        heading-level="2"
        text="${this._headerTitleComparative}"
      ></bbva-header-category>
      <pfm-categorization-detail-panel-info
        description="${this.t("pfm-categorization-detail-empty-history-movements")}"
        heading="${this.t(`pfm-categorization-detail-empty-category-list-title-${this.groupId}`)}"
        microillustration-text="${this.t(`pfm-categorization-detail-empty-category-list-title-${this.groupId}`)}"
        microillustration="empty_state_day"
      ></pfm-categorization-detail-panel-info>
    `}get _headerTitleComparative(){return this.categoryId?this.t(`pfm-categorization-detail-history-comparative-subcategories-title-${this.groupId}`):this.t(`pfm-categorization-detail-history-comparative-categories-title-${this.groupId}`)}get _categoryComparative(){return this._comparativeData.length?d`
      <table aria-labelledby="tableHeading">
        <caption>
          <bbva-header-category
            class="detail-movements"
            heading-level="2"
            text="${this._headerTitleComparative}"
          ></bbva-header-category>
        </caption>
        <thead>
          <tr>
            <th scope="col">
              ${Za._tplText({alignment:"center",size:"S",tag:"span",text:this._selectedItemChart.labelPastComparativePeriod,unset:!0})}
            </th>
            <th scope="col">
              ${Za._tplText({alignment:"center",size:"S",tag:"span",text:this._selectedItemChart.labelCurrentComparativePeriod,unset:!0})}
            </th>
          </tr>
        </thead>
        <tbody>
          ${this._comparativeData.map((e=>{var t,a,i,s,r,n,o,c,l,h,p,u;const g=(null===(t=e.pastCategory)||void 0===t?void 0:t.name)||(null===(a=e.currentCategory)||void 0===a?void 0:a.name),m=(null===(i=e.pastCategory)||void 0===i?void 0:i.id)||(null===(s=e.currentCategory)||void 0===s?void 0:s.id),y=Boolean(this.categoryId),b=(null===(r=e.pastCategory)||void 0===r?void 0:r.totalAmount.currency)||(null===(n=e.currentCategory)||void 0===n?void 0:n.totalAmount.currency);return d`
              <tr>
                <td>
                  ${this.cListItem({activeLink:Boolean(null===(o=e.pastCategory)||void 0===o?void 0:o.totalTransactions),category:e.pastCategory||{id:null===(c=e.currentCategory)||void 0===c?void 0:c.id,name:null===(l=e.currentCategory)||void 0===l?void 0:l.name},categoryId:m,categoryName:g,currency:b,isSubcategory:y,period:this._selectedItemChart.pastPeriod})}
                </td>
                <td>
                  ${this.cListItem({activeLink:Boolean(null===(h=e.currentCategory)||void 0===h?void 0:h.totalTransactions)||Wa(this._selectedItemChart.currentPeriod.startDate).format("MMYY")===Wa().format("MMYY"),category:e.currentCategory||{id:null===(p=e.pastCategory)||void 0===p?void 0:p.id,name:null===(u=e.pastCategory)||void 0===u?void 0:u.name},categoryId:m,categoryName:g,color:e.color,currency:b,isSubcategory:y,period:this._selectedItemChart.currentPeriod,secondAmount:Math.abs(e.diffAmount),status:e.status})}
                </td>
              </tr>
            `}))}
        </tbody>
      </table>
    `:this._emptyList}render(){return d`
      <bbva-tab-default
        .options=${[{title:this.t("pfm-categorization-detail-history-tab1")},{title:this.t("pfm-categorization-detail-history-tab2")}]}
        accessibility-text="Available sections"
        ambient="primary"
        selected="0"
        @tab-default-tab-click="${this._handleTabChartChange}"
      >
        <div class="panel" role="tabpanel" id="content-0" aria-labelledby="tab-0">
          <pfm-categorization-detail-chart
            ?discreet-mode="${this.discreetMode}"
            ?is-expense-group="${this.isExpenseGroup}"
            ?native="${this.native}"
            ?show-chart-average="${this.showChartAverage}"
            ?use-customer-analytics="${this.useCustomerAnalytics}"
            .headers="${this._headers}"
            .medianGroupId="${this.medianGroupId}"
            .period="${this.period}"
            .requiredToken="${this.requiredToken}"
            cache-type="${this.cacheType}"
            calculator-api-version="${this.calculatorApiVersion}"
            category-id="${l(this.categoryId)}"
            chart-type="MONTHLY"
            contract-id="${l(this.contractId)}"
            contract-subtype-id="${l(this.contractSubtypeId)}"
            contract-type-id="${l(this.contractTypeId)}"
            currency="${this.currency}"
            local-currency="${this.localCurrency}"
            customer-analytics-api-version="${this.customerAnalyticsApiVersion}"
            customer-analytics-cache-key="${this.customerAnalyticsCacheKey}"
            group-id="${this.groupId}"
            host="${this.host}"
            language="${this.language}"
            personal-finances-api-version="${this.personalFinancesApiVersion}"
            pfm-id="${this.pfmId}"
            subcategory-id="${l(this.subcategoryId)}"
            @pfm-categorization-detail-chart-item-selected-change="${e=>this._handleChartItemChange(e,"MONTHLY")}"
          >
          </pfm-categorization-detail-chart>
        </div>
        <div class="panel" role="tabpanel" id="content-1" aria-labelledby="tab-1">
          ${this._renderYearlyChart?d`
                <pfm-categorization-detail-chart
                  ?discreet-mode="${this.discreetMode}"
                  ?is-expense-group="${this.isExpenseGroup}"
                  ?native="${this.native}"
                  ?use-customer-analytics="${this.useCustomerAnalytics}"
                  .headers="${this._headers}"
                  .medianGroupId="${this.medianGroupId}"
                  .period="${this.period}"
                  .requiredToken="${this.requiredToken}"
                  cache-type="${this.cacheType}"
                  calculator-api-version="${this.calculatorApiVersion}"
                  category-id="${l(this.categoryId)}"
                  chart-type="YEARLY"
                  contract-id="${l(this.contractId)}"
                  contract-subtype-id="${l(this.contractSubtypeId)}"
                  contract-type-id="${l(this.contractTypeId)}"
                  currency="${this.currency}"
                  local-currency="${this.localCurrency}"
                  customer-analytics-api-version="${this.customerAnalyticsApiVersion}"
                  customer-analytics-cache-key="${this.customerAnalyticsCacheKey}"
                  group-id="${this.groupId}"
                  host="${this.host}"
                  language="${this.language}"
                  personal-finances-api-version="${this.personalFinancesApiVersion}"
                  pfm-id="${this.pfmId}"
                  subcategory-id="${l(this.subcategoryId)}"
                  @pfm-categorization-detail-chart-item-selected-change="${e=>this._handleChartItemChange(e,"YEARLY")}"
                >
                </pfm-categorization-detail-chart>
              `:h}
        </div>
      </bbva-tab-default>
      ${this._selectedItemChart?d` ${this._showComparative?this._categoryComparative:this._movementsComparative} `:d` <bbva-header-category loading></bbva-header-category> `}
    `}_dispatchEvent(e,t){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}}var ei=s`
  :host {
    --_pfm-categorization-detail-table-border-color: ${D("colorPrimaryCtaComplementaryBorderDefault",M)};
    --_pfm-categorization-detail-table-text-color: ${D("coplorPrimaryText02Default",M)};
    --_pfm-categorization-detail-table-amount-color: ${D("coplorPrimaryText02Default",M)};
  }
`,ti=s`
  :host {
    display: block;
    box-sizing: border-box;
    --bbva-header-main-z-index: 1;
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

  [role='listitem'] {
    position: relative;
  }

  .fit {
    display: block;
    margin-left: 1rem;
    margin-right: 1rem;
  }

  table {
    border-collapse: collapse;
    width: 100%;
  }
  table caption {
    padding-bottom: 0.5rem;
  }
  table td {
    border: 0.0625rem solid var(--_pfm-categorization-detail-table-border-color);
    width: 50%;
    vertical-align: top;
  }
  table td:nth-child(odd) {
    background: var(--_pfm-categorization-detail-table-background-color);
  }
  table th {
    border: 0.0625rem solid var(--_pfm-categorization-detail-table-border-color);
    width: 50%;
    padding: 0.5rem 0;
  }
  table th:nth-child(odd) {
    background: var(--_pfm-categorization-detail-table-background-color);
  }
  table th [data-tag-name='bbva-type-text'] {
    margin: 0;
    font-weight: var(
      --fontFacePrimaryMediumFontWeight,
      ${r(n.medium.fontWeight)}
    );
    font-style: var(
      --fontFacePrimaryMediumFontStyle,
      ${r(n.medium.fontStyle)}
    );
  }
  table tbody tr:first-child td {
    border-top: 0;
  }
  table .c-list {
    padding: 1rem;
    text-align: left;
  }
  table .c-list__wrapper-secondary-amount {
    display: flex;
  }
  table .c-list__wrapper-secondary-amount [data-tag-name='bbva-type-amount'] {
    color: var(--_pfm-categorization-detail-table-amount-color);
  }
  table .c-list [data-tag-name='bbva-type-link'] {
    margin: 0;
  }
  table .c-list [data-tag-name='bbva-type-text'] {
    margin-bottom: 0;
    color: var(--_pfm-categorization-detail-table-text-color);
  }

  [data-tag-name='bbva-header-category'].detail-movements {
    margin: 1rem 1rem 0;
  }
  [data-tag-name='bbva-header-category']:first-child {
    padding-top: 1rem;
  }

  [data-tag-name='bbva-tab-default'] {
    margin-bottom: 0;
  }

  [data-tag-name='pfm-categorization-detail-panel-info'] {
    padding: 1rem;
  }
`;const{moment:ai}=window,ii="MONTHLY";class si extends(p(U(u(a)))){static get is(){return"pfm-categorization-detail-history-without-comparative"}static get scopedElements(){const e=[Q,oe,Ua,Wt,ma,la];return si.scopedElementsFromClasses(e)}static get properties(){return{animateMovement:{type:Boolean,attribute:"animate-movement"},cacheType:{type:String,attribute:"cache-type"},calculatorApiVersion:{type:String,attribute:"calculator-api-version"},categoryId:{type:String,attribute:"category-id"},contractId:{type:String,attribute:"contract-id"},contractSubtypeId:{type:String,attribute:"contract-subtype-id"},contractTypeId:{type:String,attribute:"contract-type-id"},currency:{type:String},customerAnalyticsApiVersion:{type:String,attribute:"customer-analytics-api-version"},customerAnalyticsCacheKey:{type:String,attribute:"customer-analytics-cache-key"},darkModeScheme:{type:String,attribute:"dark-mode-scheme"},discreetMode:{type:Boolean,attribute:"discreet-mode"},enableMovementLink:{type:Boolean,attribute:"enable-movement-link"},groupId:{type:String,attribute:"group-id"},groupName:{type:String,attribute:"group-name"},hideComparativeMonths:{type:Boolean,attribute:"hide-comparative-months"},hideOperativeActions:{type:Boolean,attribute:"hide-operative-actions"},isExpenseGroup:{type:Boolean,attribute:"is-expense-group"},localCurrency:{type:String,attribute:"local-currency"},medianGroupId:{type:Object,attribute:"median-group-id"},otpCancelled:{type:Boolean,attribute:"otp-cancelled"},pendingCategoryId:{type:String,attribute:"pending-category-id"},personalFinancesApiVersion:{type:String,attribute:"personal-finances-api-version"},pfmId:{type:String,attribute:"pfm-id"},showChartAverage:{type:Boolean,attribute:"show-chart-average"},subcategoryId:{type:String,attribute:"subcategory-id"},transactionsOrderBy:{type:String,attribute:"transactions-order-by"},useCustomerAnalytics:{type:Boolean,attribute:"use-customer-analytics"},userContracts:{type:Array,attribute:"user-contracts"},_chartType:{type:String},_selectedItemChart:{type:Object,state:!0}}}constructor(){super(),this._chartItems=6,this._chartType="MONTHLY",this._dateFormat="YYYY-MM-DD[T]HH:mm:ss.SSS[Z]",this._selectedChartView=ii,this._selectedPeriodData={},this.animateMovement=!1,this.cacheType="SESSION",this.calculatorApiVersion="0",this.customerAnalyticsApiVersion="0",this.darkModeScheme="",this.discreetMode=!1,this.enableMovementLink=!1,this.hideOperativeActions=!1,this.isExpenseGroup=!1,this.localCurrency="EUR",this.medianGroupId={101:"medianIncomes",102:"investmentFundBalanceAmount",103:"medianExpenses"},this.otpCancelled=!1,this.pendingCategoryId="9999",this.showChartAverage=!1,this.transactionsOrderBy="operationDate desc",this.useCustomerAnalytics=!1,this.userContracts=[]}static get styles(){return[ti,ei,W.primary,J,de.primary]}_handleCategorySelect(e){if(null==e||!e.totalTransactions)return;const t=e.subcategories?"category":"subcategory",{startDate:a,endDate:i}=this._selectedItemChart.currentPeriod;this._dispatchEvent(`pfm-categorization-detail-history-without-comparative-${t}-select`,{...e,period:{startDate:ai(a),endDate:ai(i)},groupId:this.groupId})}_handleChartItemChange(e,t){var a;const i=(null===(a=e.detail)||void 0===a?void 0:a.item)||e.detail;this._selectedPeriodData[t]=i,i&&t===this._selectedChartView&&(this._selectedItemChart=i)}get _headers(){return this.headers||{"accept-language":this.language}}get _showComparative(){return!this.subcategoryId}get selectedCurrentPeriod(){const e=this._selectedPeriodData[this._selectedChartView];return e?{startDate:ai(e.currentPeriod.startDate),endDate:ai(e.currentPeriod.endDate)}:null}get _comparativeData(){var e,t;const a=(this.categoryId?null===(e=this._selectedItemChart.categories)||void 0===e||null===(t=e[0])||void 0===t?void 0:t.subcategories:this._selectedItemChart.categories)||[];if(!a.length)return[];return[...a]}get _movementsComparative(){return d`
      <bbva-header-category
        class="detail-movements"
        heading-level="2"
        text="${this.t("pfm-categorization-detail-movements-heading")}"
      ></bbva-header-category>
      <pfm-categorization-detail-movements
        ?animate-movement="${this.animateMovement}"
        ?discreet-mode="${this.discreetMode}"
        ?enable-movement-link="${this.enableMovementLink}"
        ?native="${this.native}"
        ?otp-cancelled="${this.otpCancelled}"
        .headers="${this._headers}"
        ?hide-operative-actions="${this.hideOperativeActions}"
        .requiredToken="${this.requiredToken}"
        .userContracts="${this.userContracts}"
        category-id="${l(this.categoryId)}"
        contract-id="${l(this.contractId)}"
        contract-subtype-id="${l(this.contractSubtypeId)}"
        contract-type-id="${l(this.contractTypeId)}"
        dark-mode-scheme="${this.darkModeScheme}"
        from-operation-date="${this.selectedCurrentPeriod.startDate.startOf("day").toISOString()}"
        group-id="${this.groupId}"
        host="${this.host}"
        language="${this.language}"
        pending-category-id="${this.pendingCategoryId}"
        personal-finances-api-version="${this.personalFinancesApiVersion}"
        pfm-id="${this.pfmId}"
        subcategory-id="${l(this.subcategoryId)}"
        to-operation-date="${this.selectedCurrentPeriod.endDate.endOf("day").toISOString()}"
        transactions-order-by="${this.transactionsOrderBy}"
      ></pfm-categorization-detail-movements>
    `}get _emptyList(){return d`
      <bbva-header-category
        class="detail-movements"
        heading-level="2"
        text="${this._headerTitleComparative}"
      ></bbva-header-category>
      <pfm-categorization-detail-panel-info
        description="${this.t("pfm-categorization-detail-empty-history-movements")}"
        heading="${this.t(`pfm-categorization-detail-empty-category-list-title-${this.groupId}`)}"
        microillustration-text="${this.t(`pfm-categorization-detail-empty-category-list-title-${this.groupId}`)}"
        microillustration="empty_state_day"
      ></pfm-categorization-detail-panel-info>
    `}get _headerTitleComparative(){return this.categoryId?this.t(`pfm-categorization-detail-history-comparative-subcategories-title-${this.groupId}`):this.t(`pfm-categorization-detail-history-comparative-categories-title-${this.groupId}`)}static _getIcon(e){return g[e]?g[e]():$()}get _categoryComparative(){var e;return null!==(e=this._comparativeData)&&void 0!==e&&e.length?d`
      <bbva-header-category
        class="detail-movements"
        heading-level="2"
        text="${this._headerTitleComparative}"
      >
      </bbva-header-category>
      <div role="list">
        ${this._comparativeData.map(((e,t,a)=>{var i,s,r,n;return d`
            <pfm-categorization-detail-list-movement
              ?discreet-mode="${this.discreetMode}"
              accessibility-mask="${this.t("pfm-categorization-detail-mask-products")}"
              amount="${e.totalAmount.amount}"
              bg-color-clip="${l(null===(i=m[null===(s=e.image)||void 0===s?void 0:s.id])||void 0===i?void 0:i.color)}"
              currency-code="${e.totalAmount.currency}"
              extended-concept="${this.t(e.totalTransactions>1?"pfm-categorization-detail-item-description":"pfm-categorization-detail-item-description-one",{totalTransactions:e.totalTransactions})}"
              heading="${e.name}"
              icon-clip="${l(si._getIcon(null===(r=m[null===(n=e.image)||void 0===n?void 0:n.id])||void 0===r?void 0:r.icon))}"
              language="${this.language}"
              local-currency="${e.totalAmount.currency}"
              mode="${this.darkModeScheme}"
              @click="${()=>this._handleCategorySelect(e)}"
            >
            </pfm-categorization-detail-list-movement>
            <bbva-divider-default
              class="${t!==a.length-1?"fit":"full"}"
            ></bbva-divider-default>
          `}))}
      </div>
    `:this._emptyList}render(){return d`
      <pfm-categorization-detail-chart
        ?discreet-mode="${this.discreetMode}"
        ?hide-comparative-months="${this.hideComparativeMonths}"
        ?is-expense-group="${this.isExpenseGroup}"
        ?native="${this.native}"
        ?show-chart-average="${this.showChartAverage}"
        ?use-customer-analytics="${this.useCustomerAnalytics}"
        .headers="${this._headers}"
        .medianGroupId="${this.medianGroupId}"
        .requiredToken="${this.requiredToken}"
        cache-type="${this.cacheType}"
        calculator-api-version="${this.calculatorApiVersion}"
        category-id="${l(this.categoryId)}"
        chart-type="${this._chartType}"
        contract-id="${l(this.contractId)}"
        contract-subtype-id="${l(this.contractSubtypeId)}"
        contract-type-id="${l(this.contractTypeId)}"
        currency="${this.currency}"
        local-currency="${this.localCurrency}"
        customer-analytics-api-version="${this.customerAnalyticsApiVersion}"
        customer-analytics-cache-key="${this.customerAnalyticsCacheKey}"
        group-id="${this.groupId}"
        group-name="${this.groupName}"
        host="${this.host}"
        language="${this.language}"
        personal-finances-api-version="${this.personalFinancesApiVersion}"
        pfm-id="${this.pfmId}"
        subcategory-id="${l(this.subcategoryId)}"
        @pfm-categorization-detail-chart-item-selected-change="${e=>this._handleChartItemChange(e,"MONTHLY")}"
      >
      </pfm-categorization-detail-chart>
      ${this._selectedItemChart?d` ${this._showComparative?this._categoryComparative:this._movementsComparative} `:d` <bbva-header-category loading></bbva-header-category> `}
    `}_dispatchEvent(e,t){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}}var ri=s`
  :host {
    display: block;
    box-sizing: border-box;
    text-align: left;
  }

  [data-tag-name='bbva-header-category'] {
    padding: 1rem;
  }
`;class ni extends ua{static get is(){return"pfm-categorization-detail-subcategory-detail"}static get scopedElements(){const e=[ne,Ze,Pt,oe,se,ma,_a];return{...super.scopedElements,...ni.scopedElementsFromClasses(e)}}static get properties(){return{avoidGetTransactions:{type:Boolean,attribute:"avoid-get-transactions"},categoryId:{type:String,attribute:"category-id"},expandForecastSubcategory:{type:Boolean,attribute:"expand-forecast-subcategory"},hideOperativeActions:{type:Boolean,attribute:"hide-operative-actions"},pendingCategoryId:{type:String,attribute:"pending-category-id"},pfmId:{type:String,attribute:"pfm-id"},showUndatedEstimates:{type:Boolean,attribute:"show-undated-estimates"},subcategoryId:{type:String,attribute:"subcategory-id"}}}constructor(){super(),this.avoidGetTransactions=!1,this.legendColors=[_.tertiaryType4Medium,_.tertiaryType4],this.hideOperativeActions=!1,this.showUndatedEstimates=!1}static get styles(){return[super.styles,ri,ce.primary,et.primary,de.primary,ae.primary]}get _headers(){return this.headers||{"accept-language":this.language}}get _movementsForecast(){return this.showMovementsForecasting&&this._showForecastInfo?d`
        <pfm-categorization-detail-movements-forecast
          ?discreet-mode="${this.discreetMode}"
          ?expand-accordeon="${this.expandForecastSubcategory}"
          ?native="${this.native}"
          ?show-undated-estimates="${this.showUndatedEstimates}"
          .period="${this.period}"
          .requiredToken="${this.requiredToken}"
          .userContracts="${this.userContracts}"
          cache-type="${l(this.forecastTransactionsCacheKey&&this.cacheType)}"
          category-id="${l(this.categoryId)}"
          contract-id="${l(this.contractId)}"
          contract-subtype-id="${l(this.contractSubtypeId)}"
          contract-type-id="${l(this.contractTypeId)}"
          dark-mode-scheme="${this.darkModeScheme}"
          forecast-balances-cache-key="${l(this.forecastBalancesCacheKey)}"
          forecast-transactions-cache-key="${l(this.forecastTransactionsCacheKey)}"
          group-id="${this.groupId}"
          host="${this.host}"
          language="${this.language}"
          personal-finances-api-version="${this.personalFinancesApiVersion}"
          pfm-id="${this.pfmId}"
          subcategory-id="${l(this.subcategoryId)}"
        ></pfm-categorization-detail-movements-forecast>
      `:h}get content(){var e,t,a,i;return d`
      ${this._movementsForecast}
      <pfm-categorization-detail-movements
        ?animate-movement="${this.animateMovement}"
        ?avoid-get-transactions="${this.avoidGetTransactions}"
        ?discreet-mode="${this.discreetMode}"
        ?enable-movement-link="${this.enableMovementLink}"
        ?native="${this.native}"
        ?otp-cancelled="${this.otpCancelled}"
        .headers="${this._headers}"
        ?hide-operative-actions="${this.hideOperativeActions}"
        .requiredToken="${this.requiredToken}"
        .userContracts="${this.userContracts}"
        ambient="primary"
        category-id="${l(this.categoryId)}"
        contract-id="${l(this.contractId)}"
        contract-subtype-id="${l(this.contractSubtypeId)}"
        contract-type-id="${l(this.contractTypeId)}"
        dark-mode-scheme="${this.darkModeScheme}"
        from-operation-date="${null===(e=this.period)||void 0===e||null===(t=e.startDate)||void 0===t?void 0:t.startOf("day").toISOString()}"
        group-id="${this.groupId}"
        host="${this.host}"
        language="${this.language}"
        pending-category-id="${this.pendingCategoryId}"
        personal-finances-api-version="${this.personalFinancesApiVersion}"
        pfm-id="${this.pfmId}"
        show-header
        subcategory-id="${l(this.subcategoryId)}"
        to-operation-date="${null===(a=this.period)||void 0===a||null===(i=a.endDate)||void 0===i?void 0:i.endOf("day").toISOString()}"
        transactions-order-by="${this.transactionsOrderBy}"
      ></pfm-categorization-detail-movements>
    `}}var oi=s`
  [data-tag-name='bbva-help-modal'][full-height] {
    --bbva-help-modal-padding: 0.5rem 1rem 0;
  }

  [data-tag-name='bbva-transition-container'] {
    --bbva-transition-container-padding: 0;
    --bbva-transition-container-padding-bottom: 0;
  }

  [data-tag-name='bbva-help-modal'] {
    --bbva-help-modal-padding: 0.5rem 0 0;
  }

  [data-tag-name='bbva-form-radio-group'] {
    text-align: left;
  }
`,ci=s``,di=s`
  :host {
    display: block;
    box-sizing: border-box;
    --_pfm-categorization-detail-bg-color-primary: ${D("colorPrimarySurfaceAmbientDefault",M)};
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

  .container-wrapper {
    max-width: 45rem;
    margin-left: auto;
    margin-right: auto;
  }

  [ambient='primary'] {
    background-color: var(--_pfm-categorization-detail-bg-color-primary);
  }

  [data-tag-name='bbva-transition-container'] {
    --bbva-transition-container-padding: 0;
    --bbva-transition-container--custom--primary-ambient--content-bg-color: var(
      --_pfm-categorization-detail-bg-color-primary
    );
    --bbva-transition-container-padding-bottom: 0;
  }
  [data-tag-name='bbva-transition-container']
    [data-tag-name='pfm-categorization-detail-group-detail'] {
    padding-top: 0;
  }

  @media (min-width: 45rem) {
    :host {
      --bbva-header-main-max-width: 45rem;
    }
  }
`;const{moment:li}=window;class hi extends(re(U(u(a)))){static get is(){return"pfm-categorization-detail"}static get scopedElements(){const e=[Q,ve,me,fe,Se,xe,xt,Et,Ct,oe,ye,be,K,$a,Za,si,ni,...hi.configurationScopedElements()];return{"bbva-global-retail-financial-overview-api-dm":Ee,...hi.scopedElementsFromClasses(e)}}static get properties(){return{actions:{type:Array},addAttachToBody:{type:Boolean,attribute:"add-attach-to-body"},balanceSearchApiVersion:{type:String,attribute:"balance-search-api-version"},budgetsCacheKey:{type:String,attribute:"budgets-cache-key"},budgetsPaginationSize:{type:Number,attribute:"budgets-pagination-size"},cacheType:{type:String,attribute:"cache-type"},calculatorApiVersion:{type:String,attribute:"calculator-api-version"},calendarDate:{type:Object,attribute:"calendar-date"},channelId:{type:String,attribute:"channel-id"},contractId:{type:String,attribute:"contract-id"},contractName:{type:String,attribute:"contract-name"},contracts:{type:Array},contractSubtypeId:{type:String,attribute:"contract-subtype-id"},contractTypeId:{type:String,attribute:"contract-type-id"},customerAnalyticsApiVersion:{type:String,attribute:"customer-analytics-api-version"},customerAnalyticsCacheKey:{type:String,attribute:"customer-analytics-cache-key"},darkModeScheme:{type:String,attribute:"dark-mode-scheme"},debitCardType:{type:String,attribute:"debit-card-type"},discreetMode:{type:Boolean,attribute:"discreet-mode"},emplacement:{type:String},enableMovementLink:{type:Boolean,attribute:"enable-movement-link"},evolutionBalance:{type:Object,attribute:"evolution-balance"},expensesGroupId:{type:String,attribute:"expenses-group-id"},externalContracts:{type:Array,attribute:"external-contracts"},feedbackValue:{type:Number,attribute:"feedback-value"},financialOverviewApiVersion:{type:String,attribute:"financial-overview-api-version"},financialOverviewCacheKey:{type:String,attribute:"financial-overview-cache-key"},fixedExpenses:{type:Boolean,attribute:"fixed-expenses"},forecastBalancesCacheKey:{type:String,attribute:"forecast-balances-cache-key"},forecastTransactionsCacheKey:{type:String,attribute:"forecast-transactions-cache-key"},groupActions:{type:Array,attribute:"group-actions"},groupId:{type:String,attribute:"group-id"},groups:{type:Array},hasCustomerAnalytics:{type:Boolean,attribute:"has-customer-analytics"},headerIconRightPrimary:{type:String,attribute:"header-icon-right-primary"},hideBrands:{type:Boolean,attribute:"hide-brands"},hideCommandLine:{type:Boolean,attribute:"hide-command-line"},hideComparativeMonths:{type:Boolean,attribute:"hide-comparative-months"},hideOperativeActions:{type:Boolean,attribute:"hide-operative-actions"},hideProactivityMessage:{type:Boolean,attribute:"hide-proactivity-message"},hideReturnText:{type:Boolean,attribute:"hide-return-text"},hideSeeHistoricLink:{type:Boolean,attribute:"hide-see-historic-link"},history:{type:Object,attribute:"history"},incomesGroupId:{type:String,attribute:"incomes-group-id"},localCurrency:{type:String,attribute:"local-currency"},medianGroupId:{type:Object,attribute:"median-group-id"},modalHeaderButtons:{type:Array,attribute:"modal-header-buttons"},otpCancelled:{type:Boolean,attribute:"otp-cancelled"},pendingCategoryId:{type:String,attribute:"pending-category-id"},personalFinancesApiVersion:{type:String,attribute:"personal-finances-api-version"},pfmBalancesCacheKey:{type:String,attribute:"pfm-balances-cache-key"},pfmBrandsBalancesCacheKey:{type:String,attribute:"pfm-brands-balances-cache-key"},pfmId:{type:String,attribute:"pfm-id"},pfms:{type:Array,attribute:"personal-finances-pfms"},pfmsCacheKey:{type:String,attribute:"pfms-cache-key"},proactivityMessageAemKey:{type:String,attribute:"proactivity-message-aem-key"},proactivityMessagePublicSettingsEndpoint:{type:String,attribute:"proactivity-message-public-settings-endpoint"},proactivityMessagePublicSettingsHost:{type:String,attribute:"proactivity-message-public-settings-host"},proactivityMessagePublicSettingsRequiredToken:{type:String,attribute:"proactivity-message-public-settings-required-token"},recurringExpensesBalancesCacheKey:{type:String,attribute:"recurring-expenses-balances-cache-key"},recurringExpensesCacheKey:{type:String,attribute:"recurring-expenses-cache-key"},relevantFacts:{type:Array,attribute:"relevant-facts"},requiredTokenProactivity:{type:String,attribute:"required-token-proactivity"},retailFinancialOverviewApiVersion:{type:String,attribute:"retail-financial-overview-api-version"},retailFinancialOverviewCacheKey:{type:String,attribute:"retail-financial-overview-cache-key"},retailFinancialOverviewCountry:{type:String,attribute:"retail-financial-overview-country"},_returnText:{type:String},selectedCategoryTab:{type:Number,attribute:"selected-category-tab"},selectedPeriodDefault:{type:Number,attribute:"selected-period-default"},selectedTab:{type:Number,attribute:"selected-tab"},showBrandsForecasting:{type:Boolean,attribute:"show-brands-forecasting"},showBudgetsActions:{type:Boolean,attribute:"show-budgets-actions"},showCalendar:{type:Boolean,attribute:"show-calendar"},showCategoryForecasting:{type:Boolean,attribute:"show-category-forecasting"},showChartAverage:{type:Boolean,attribute:"show-chart-average"},showFeedback:{type:Boolean,attribute:"show-feedback"},showMovementsForecasting:{type:Boolean,attribute:"show-movements-forecasting"},showOtpModal:{type:Boolean,attribute:"show-otp-modal"},showPeriodSelector:{type:Boolean,attribute:"show-period-selector"},showSelectPeriodGroup:{type:Boolean,attribute:"show-select-period-group"},showUndatedEstimates:{type:Boolean,attribute:"show-undated-estimates"},transactionsOrderBy:{type:String,attribute:"transactions-order-by"},variableExpenses:{type:Boolean,attribute:"variable-expenses"},useInternalContracts:{type:Boolean,attribute:"use-internal-contracts"},useExternalContracts:{type:Boolean,attribute:"use-external-contracts"},_animateBudgetsActions:{type:Boolean,state:!0},_animateMovement:{type:Boolean,state:!0},_budgets:{type:Array,state:!0},_calendarToShow:{type:String,state:!0},_endDateRange:{type:String,state:!0},_error:{type:Boolean,state:!0},_expandForecastCategory:{type:Boolean,state:!0},_expandForecastMovementsCategory:{type:Boolean,state:!0},_expandForecastMovementsGroup:{type:Boolean,state:!0},_expandForecastMovementsSubcategory:{type:Boolean,state:!0},_expandForecastSubcategory:{type:Boolean,state:!0},_groupDetail:{type:Object,state:!0},_historyFilters:{type:Object,state:!0},_isDisabledPeriodSelectorButton:{type:Boolean,state:!0},_isHistoryPeriod:{type:Boolean,state:!0},_itemSchema:{type:Object,state:!0},_loading:{type:Boolean,state:!0},_optionSelected:{type:Number},_optionSelectedStart:{type:Number},_period:{type:Object,state:!0},_periods:{type:Array,state:!0},_selectedCategory:{type:Object,state:!0},_selectedCategoryHistory:{type:Object,state:!0},_selectedSubcategory:{type:Object,state:!0},_selectedSubcategoryHistory:{type:Object,state:!0},_showCustomPeriodGroupCombo:{type:Boolean,state:!0},_showDateRange:{type:Boolean,state:!0},_showHistory:{type:Boolean,state:!0},_showOtpModal:{type:Boolean,state:!0},_startDateRange:{type:String},_useCustomerAnalytics:{type:Boolean,state:!0}}}static get styles(){return[di,ci,W.primary,J,_e.primary,$e.primary,Ce.primary,Te.primary,de.primary,N.primary,o(`${hi.is}-shared-styles`)]}constructor(){super(),this._animateBudgetsActions=!0,this._animateMovement=!0,this.balanceSearchApiVersion="2",this._calendarToShow="",this._endDateRange="",this._error=!1,this._expandForecastCategory=!1,this._expandForecastMovementsCategory=!1,this._expandForecastMovementsGroup=!1,this._expandForecastMovementsSubcategory=!1,this._headerMainClickHandlers={0:()=>this._dispatchBackEvent(),1:()=>this._dispatchHelpEvent()},this._isDisabledPeriodSelectorButton=!1,this._isHistoryPeriod=!1,this._itemSchema={},this._loading=!1,this._optionSelected=-1,this._optionSelectedStart=-1,this._periods=[],this._showCustomPeriodGroupCombo=!1,this._showDateRange=!1,this._showHistory=!1,this._showOtpModal=!1,this._startDateRange="",this._useCustomerAnalytics=!1,this.actions=[],this.addAttachToBody=!1,this.budgetsPaginationSize=10,this.cacheType="SESSION",this.calculatorApiVersion="0",this.calendarDate={},this.channelId="BBVANet",this.contractName="",this.contracts=[],this.customerAnalyticsApiVersion="0",this.darkModeScheme="",this.debitCardType="DEBIT_CARD",this.discreetMode=!1,this.emplacement="DAY_TO_DAY",this.enableMovementLink=!1,this.expensesGroupId="103",this.externalContracts=[],this.feedbackValue=void 0,this.financialOverviewApiVersion="4",this.fixedExpenses=!1,this.groups=[{id:"101",text:"pfm-categorization-detail-incomes-title"},{id:"102",text:"pfm-categorization-detail-investments-title"},{id:"103",text:"pfm-categorization-detail-expense-title"}],this.hasCustomerAnalytics=!1,this.headerIconRightPrimary=k(),this.hideBrands=!1,this.hideCommandLine=!1,this.hideOperativeActions=!1,this.hideProactivityMessage=!1,this.hideReturnText=!1,this.hideSeeHistoricLink=!1,this.history={},this.incomesGroupId="101",this.language="en-EN",this.localCurrency="EUR",this.medianGroupId={101:"medianIncomes",102:"investmentFundBalanceAmount",103:"medianExpenses"},this.modalHeaderButtons=[{accessibilityText:this.t("pfm-categorization-detail-help-accessibility-text"),icon:k(),id:"btn-help",label:this.t("pfm-categorization-detail-help")}],this.otpCancelled=!1,this.pendingCategoryId="9999",this.personalFinancesApiVersion="2",this.pfms=[],this.proactivityMessageAemKey="",this.proactivityMessagePublicSettingsEndpoint="",this.proactivityMessagePublicSettingsHost="",this.proactivityMessagePublicSettingsRequiredToken="none",this.requiredTokenProactivity="",this.retailFinancialOverviewApiVersion="1",this.retailFinancialOverviewCountry="",this._returnText=this.t("pfm-categorization-detail-return"),this.selectedCategoryTab=1,this.selectedTab=1,this.showBrandsForecasting=!1,this.showBudgetsActions=!1,this.showCalendar=!1,this.showCategoryForecasting=!1,this.showChartAverage=!1,this.showFeedback=!1,this.showMovementsForecasting=!1,this.showOtpModal=!1,this.showPeriodSelector=!1,this.showSelectPeriodGroup=!1,this.transactionsOrderBy="operationDate desc",this.variableExpenses=!1,this.useInternalContracts=!1,this.useExternalContracts=!1}firstUpdated(){var e,t,a;super.firstUpdated(),this._itemSchema={amounts:[],averages:[],id:"",totalAmount:{amount:0,currency:this.localCurrency},totalTransactions:""},this._restoreStateFromHistory(),null!==(e=this.contracts)&&void 0!==e&&e.length||!this.useInternalContracts||(this._financialOverviewDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-financial-overview-api-dm"]'),this._financialOverviewDm.getFinancialOverview()),null!==(t=this.externalContracts)&&void 0!==t&&t.length||!this.useExternalContracts||(this._retailFinancialOverviewDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-retail-financial-overview-api-dm"]'),this._retailFinancialOverviewDm.getFinancialOverview()),this._balancesSearchDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-balances-search-api-dm"]'),this._budgetsSearchDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-budgets-search-api-dm"]'),this._pfmsDM=this.shadowRoot.querySelector('[data-tag-name="bbva-global-pfms-api-dm"]'),null!==(a=this.pfms)&&void 0!==a&&a.length?this._managePfmsResponse({detail:this.pfms}):this._pfmsDM.getPfms(),this.showBudgetsActions&&this.groupId===this.expensesGroupId&&this._sendGetBudgetsSearchRequest(),this.hideReturnText&&(this._returnText=""),this.config={back:!0,fixedHeader:!0,header:{buttons:this.modalHeaderButtons,id:"main-header",leftIconAriaLabel:this.t("pfm-categorization-detail-return-accessibility-text"),leftIconLabel:this._returnText,showLeftIcon:!0,text:this._setTitleGroup,variant:"first-level-sequential","@header-main-icon-click":this._handleHeaderMainClick.bind(this)}},this.showSelectPeriodGroup&&(this._showDateRange=!0,this._showCustomPeriodGroupCombo=!0,this._checkDisablePeriodSelectorButton())}updated(e){super.updated(e);["_expandForecastMovementsCategory","_expandForecastMovementsGroup","_expandForecastMovementsSubcategory","_selectedCategory","_selectedCategoryHistory","_selectedSubcategory","_selectedSubcategoryHistory","_showHistory","selectedCategoryTab","selectedTab","showPeriodSelector","_period"].some((t=>e.has(t)))&&this.updateHistory(),e.has("_period")&&li(this._period.startDate).startOf("day").toISOString()&&this._sendPostBalancesSearchRequest(),e.has("calendarDate")&&(this[`_${this._calendarToShow}DateRange`]=this.calendarDate.selectedDate)}static _getFormattedPeriod(e){return{startDate:li(null==e?void 0:e.startDate,"YYYY-MM-DD"),endDate:li(null==e?void 0:e.endDate,"YYYY-MM-DD")}}get _setTitleGroup(){return this.contractName&&this.contractTypeId?this.t(`pfm-categorization-detail-detail-${this.contractTypeId.toLowerCase()}-title-${this.groupId}`):this.fixedExpenses||this.variableExpenses?this.fixedExpenses?this.t("pfm-categorization-detail-detail-title-fixed-expenses"):this.t("pfm-categorization-detail-detail-title-variable-expenses"):this.t(`pfm-categorization-detail-detail-title-${this.groupId}`)}_titleCategory(e){let t;return this.contractName&&this.contractTypeId&&(t=`${this.t(`pfm-categorization-detail-${this.contractTypeId.toLowerCase()}`)} ${this.contractName}`),t?`${e} ${t.toLowerCase()}`:e}get _filteredExternalContracts(){var e;const t=null===(e=this.externalContracts)||void 0===e?void 0:e.flatMap((e=>{var t;return(null===(t=e.externalFinancialEntity)||void 0===t?void 0:t.contracts)||[]}));return(null==t?void 0:t.filter((e=>{var t,a,i,s,r;return"CARD"===(null===(t=e.detail)||void 0===t||null===(a=t.productType)||void 0===a?void 0:a.toUpperCase())&&(null===(i=e.detail)||void 0===i||null===(s=i.cardType)||void 0===s?void 0:s.id)!==this.debitCardType||"ACCOUNT"===(null===(r=e.detail)||void 0===r?void 0:r.productType.toUpperCase())})))||[]}get _filteredInternalContracts(){var e,t;return(null===(e=this.contracts)||void 0===e||null===(t=e.contracts)||void 0===t?void 0:t.filter((e=>{var t,a;return["ACCOUNT","CARD"].includes(e.productType)&&(null===(t=e.subProductType)||void 0===t?void 0:t.id)!==this.debitCardType&&(null===(a=e.userAccessControl)||void 0===a?void 0:a.find((e=>e.channel.id===this.channelId&&e.isVisible)))})))||[]}get _filteredUserContracts(){return[...this._filteredInternalContracts,...this._filteredExternalContracts]}get _historyTitle(){var e,t,a,i;let s,r;if(this.contractName&&this.contractTypeId){var n;const e=null===(n=this.groups.find((e=>e.id===this.groupId)))||void 0===n?void 0:n.text;s=this.t(`${e}`),r=`${this.t(`pfm-categorization-detail-${this.contractTypeId.toLowerCase()}`)} ${this.contractName}`}const o=(null===(e=this._selectedSubcategory)||void 0===e?void 0:e.name)||(null===(t=this._historyFilters)||void 0===t?void 0:t.nameSubcategory)||(null===(a=this._selectedCategory)||void 0===a?void 0:a.name)||(null===(i=this._historyFilters)||void 0===i?void 0:i.nameCategory)||s||this.t(`pfm-categorization-detail-detail-title-${this.groupId}`),c=this.t("pfm-categorization-detail-history-heading",{label:o.toLowerCase()});return r?`${c} ${r.toLowerCase()}`:c}get _headers(){return this.headers||{"accept-language":this.language}}get _pmPublicSettingsHost(){return this.proactivityMessagePublicSettingsHost||this.host}get _pmPublicSettingsRequiredToken(){return this.proactivityMessagePublicSettingsHost?this.proactivityMessagePublicSettingsRequiredToken:this.requiredToken}get _periodFormatted(){var e,t;return{startDate:null===(e=this._period)||void 0===e?void 0:e.startDate.format("DD/MM/YYYY"),endDate:null===(t=this._period)||void 0===t?void 0:t.endDate.format("DD/MM/YYYY")}}get isHideBrands(){return this.hideBrands||this.groupId!==this.expensesGroupId}_handleHeaderMainClick(e){var t,a;const i=null==e||null===(t=e.detail)||void 0===t?void 0:t.index;null===(a=this._headerMainClickHandlers)||void 0===a||a[i]()}_manageInternalContractsResponse({detail:e}){this.contracts=e}_manageExternalContractsResponse({detail:e}){this.externalContracts=e}_managePfmsResponse({detail:e}){this.pfms=e,this.pfmId||(this.pfmId=this.pfms.find((e=>e.isDefault)).id);const t=this.pfms.find((({id:e})=>e===this.pfmId)),a=hi._getFormattedPeriod(null==t?void 0:t.period);this._configurePeriods(a)}_sendPostBalancesSearchRequest(){this._loading=!0;const e={pfmId:!this.contractId&&this.pfmId,frequencyId:"ONE_TIME",...this._period&&{periodStartDate:li(this._period.startDate).startOf("day").toISOString()},...this._period&&{periodEndDate:li(this._period.endDate).endOf("day").toISOString()},...this.contractId&&{contracts:[{id:this.contractId,"productType.id":this.contractTypeId,...this.contractSubtypeId&&{"subProductType.id":this.contractSubtypeId}}]}};this._balancesSearchDm.postBalancesSearch(e)}_manageBalancesSearchResponse({detail:e}){var t;const[a]=(null==e?void 0:e.balances)||[],i={...this._itemSchema,categories:[],name:this.t(`pfm-categorization-detail-detail-title-${this.groupId}`)},s=(null==a||null===(t=a.groups)||void 0===t?void 0:t.find((({id:e})=>e===this.groupId)))||i;this._groupDetail=s,this._refreshSelectedCategory(),this._refreshSelectedSubcategory(),this._loading=!1,this.contractName&&(this.config.header.text=this._setTitleGroup+this.contractName)}_sendGetBudgetsSearchRequest(){if(this._budgets)return;const e={pfmId:this.pfmId,pageSize:this.budgetsPaginationSize,statusId:"ACTIVE",...this.contractId&&{contracts:[{id:this.contractId,"productType.id":this.contractTypeId,...this.contractSubtypeId&&{"subProductType.id":this.contractSubtypeId}}]}};this._budgetsSearchDm.postBudgetsSearch(e)}_manageBudgetsSearchResponse({detail:e}){this._budgets=e||[]}_manageError(){this._error=!0,this._loading=!1}_manageSignature(e){this.otpCancelled=!1,this.showOtpModal&&!this._otpEvent&&(e.stopPropagation(),this._showOtpModal=!0,this._otpEvent=e)}_manageOtpAcept(){var e;this.dispatchEvent(new CustomEvent(null===(e=this._otpEvent)||void 0===e?void 0:e.type,this._otpEvent))}_restoreStateFromHistory(){Object.keys(this.history||{}).length&&Object.keys(this.history).forEach((e=>{this[e]="_period"===e?{startDate:li(this.history[e].startDate),endDate:li(this.history[e].endDate)}:this.history[e]}))}updateHistory(){var e,t;const a=["_expandForecastMovementsCategory","_expandForecastMovementsGroup","_expandForecastMovementsSubcategory","_showHistory","selectedCategoryTab","selectedTab"],i=Object.keys(hi.properties).filter((e=>a.includes(e))).reduce(((e,t)=>({...e,[t]:this[t]})),{});var s,r,n,o;(i._period={startDate:null===(e=this._period)||void 0===e?void 0:e.startDate.toISOString(),endDate:null===(t=this._period)||void 0===t?void 0:t.endDate.toISOString()},this._selectedCategory)&&(i._selectedCategory={id:null===(s=this._selectedCategory)||void 0===s?void 0:s.id,name:null===(r=this._selectedCategory)||void 0===r?void 0:r.name});this._selectedSubcategory&&(i._selectedSubcategory={id:null===(n=this._selectedSubcategory)||void 0===n?void 0:n.id,name:null===(o=this._selectedSubcategory)||void 0===o?void 0:o.name});this.history={...i}}navigateBack(){this._selectedSubcategoryHistory?this._selectedSubcategoryHistory=null:this._selectedCategoryHistory?this._selectedCategoryHistory=null:this._showHistory?this._showHistory=!1:this._selectedSubcategory?(this._selectedSubcategory=null,this._expandForecastMovementsSubcategory=!1):this._selectedCategory&&(this._selectedCategory=null,this._expandForecastMovementsCategory=!1)}_configurePeriods(e){this.showSelectPeriodGroup||(this._period=e),this._periods=[e,{startDate:li(e.startDate).subtract(1,"month"),endDate:1===li(e.startDate).date()?li(e.endDate).subtract(1,"month").endOf("month"):li(e.endDate).subtract(1,"month")},{startDate:li().startOf("year"),endDate:li().endOf("month")},{startDate:li().startOf("year").subtract(12,"months"),endDate:li().endOf("year").subtract(12,"months")}],this.showSelectPeriodGroup?(this.selectedPeriodDefault=4,this._showCustomPeriodGroupCombo=!0):this.selectedPeriodDefault?(this._selectedPeriod=this._periods[this.selectedPeriodDefault],this._managePeriodConfirm()):this._selectedPeriod=e}_refreshSelectedCategory(){if(this._selectedCategory){const{id:e,name:t}=this._selectedCategory;this._selectedCategory=this._groupDetail.categories.find((e=>e.id===this._selectedCategory.id))||{...this._itemSchema,id:e,name:t,subcategories:[]}}}_refreshSelectedSubcategory(){if(this._selectedSubcategory){const{id:e,name:t}=this._selectedSubcategory;this._selectedSubcategory=this._selectedCategory.subcategories.find((e=>e.id===this._selectedSubcategory.id))||{...this._itemSchema,id:e,name:t}}}_manageCategorySelection(e){this._selectedCategory=e.detail,this._expandForecastCategory=!1}_handleCategorHistorySelect(e){this._selectedCategoryHistory=e.detail}_manageSubcategorySelection(e){this._selectedSubcategory=e.detail,this._expandForecastSubcategory=!1,this._expandForecastCategory=!1}_manageSubcategoryHistorySelection(e){this._selectedSubcategoryHistory=e.detail}_manageShowHistory({detail:e}){var t,a;this._useCustomerAnalytics=this.hasCustomerAnalytics&&!this._selectedCategory&&(this.groupId===this.expensesGroupId||this.groupId===this.incomesGroupId),this._showHistory=!0,this._historyFilters=e||{subcategoryId:null===(t=this._selectedSubcategory)||void 0===t?void 0:t.id,categoryId:null===(a=this._selectedCategory)||void 0===a?void 0:a.id}}_manageTabChange(e){this.selectedTab=e.detail.selectedIndex}_manageTabCategoryChange(e){this.selectedCategoryTab=e.detail.selectedIndex}_handleMovementAnimate(){this._animateMovement=!1}_handleBudgetActionsAnimate(){this._animateBudgetsActions=!1}_handleForecastCategorySelected({detail:e}){var t;const a=null===(t=this._groupDetail)||void 0===t?void 0:t.categories.find((({id:t})=>t===e.id));this._expandForecastCategory=!0,this._selectedCategory=a||e}_handleForecastSubcategorySelected({detail:e}){var t,a;const i=null===(t=this._selectedCategory)||void 0===t||null===(a=t.subcategories)||void 0===a?void 0:a.find((({id:t})=>t===e.id));this._expandForecastSubcategory=!0,this._selectedSubcategory=i||{...this._itemSchema,...e}}_handleForecastSubcategoryHistorySelected({detail:e}){var t,a;const i=null===(t=this._selectedCategoryHistory)||void 0===t||null===(a=t.subcategories)||void 0===a?void 0:a.find((({id:t})=>t===e.id));this._selectedSubcategoryHistory=i||{...this._itemSchema,...e}}_openPeriodSelector(){this.showPeriodSelector=!0,this._optionSelected=this._optionSelected>-1?this._optionSelected:this.selectedPeriodDefault,this._optionSelectedStart=this._optionSelected,this._dispatchEvent("pfm-categorization-detail-dates-selector-select",this._selectedPeriod)}_dispatchHelpEvent(){this._dispatchEvent("pfm-categorization-detail-assistance-select")}_dispatchBackEvent(){this._periods=[],this.selectedPeriodDefault=0,this._configurePeriods(this._period),this._dispatchEvent("pfm-categorization-detail-navigation-go-back")}get balancesCacheKey(){if(this.pfmBalancesCacheKey){const{startDate:e,endDate:t}=this._periodFormatted;return`${this.pfmBalancesCacheKey}_${e}_${t}_${this.groupId}`}return this.pfmBalancesCacheKey}get brandsBalancesCacheKey(){if(this.pfmBrandsBalancesCacheKey){var e;const{startDate:t,endDate:a}=this._periodFormatted,i=null===(e=this._selectedCategory)||void 0===e?void 0:e.id;return`${this.pfmBrandsBalancesCacheKey}_${t}_${a}_${i}_${this.groupId}`}return this.pfmBrandsBalancesCacheKey}get forecastBalancesDmCacheKey(){if(this.forecastBalancesCacheKey){const{startDate:e,endDate:t}=this._periodFormatted;return`${this.forecastBalancesCacheKey}_${e}_${t}_${this.pfmId}`}return this.forecastBalancesCacheKey}get forecastTransactionsDmCacheKey(){if(this.forecastTransactionsCacheKey){var e,t;const{startDate:a,endDate:i}=this._periodFormatted;return`${this.forecastTransactionsCacheKey}_${a}_${i}_${this.groupId}_${null===(e=this._selectedCategory)||void 0===e?void 0:e.id}_${null===(t=this._selectedSubcategory)||void 0===t?void 0:t.id}_${this.pfmId}`}return this.forecastTransactionsCacheKey}get recurringExpensesBalancesDmCacheKey(){if(this.recurringExpensesBalancesCacheKey){var e,t;const a=null===(e=this._period)||void 0===e?void 0:e.startDate.format("DD/MM/YYYY"),i=null===(t=this._period)||void 0===t?void 0:t.endDate.format("DD/MM/YYYY");return`${this.recurringExpensesBalancesCacheKey}_${a}_${i}_${this.pfmId}`}return this.recurringExpensesBalancesCacheKey}get recurringExpensesDmCacheKey(){if(this.recurringExpensesCacheKey){var e,t;const a=null===(e=this._period)||void 0===e?void 0:e.startDate.format("DD/MM/YYYY"),i=null===(t=this._period)||void 0===t?void 0:t.endDate.format("DD/MM/YYYY");return`${this.recurringExpensesCacheKey}_${a}_${i}_${this.pfmId}`}return this.recurringExpensesBalancesCacheKey}get customerAnalyticsDmCacheKey(){if(this.customerAnalyticsCacheKey){var e,t;const a=null===(e=this._period)||void 0===e?void 0:e.startDate.format("DD/MM/YYYY"),i=null===(t=this._period)||void 0===t?void 0:t.endDate.format("DD/MM/YYYY");return`${this.customerAnalyticsCacheKey}_${a}_${i}_${this.pfmId}`}return this.customerAnalyticsCacheKey}get _historyPageId(){let e="historyPage";return this._selectedCategory&&(e+="Category"),this._selectedSubcategory&&(e+="Subcategory"),e}get _otpModal(){return d`
      <bbva-help-modal
        ?attach-to-body="${this.addAttachToBody}"
        ?visible="${this._showOtpModal}"
        aria-label="${this.t("pfm-categorization-detail-period-selector-title")}"
        body-text="${this.t("pfm-categorization-detail-otp-message")}"
        button-text="${this.t("pfm-categorization-detail-accept")}"
        header-close-icon-aria-label="${this.t("pfm-categorization-detail-close-accessibility-text")}"
        header-close-icon-label="${this.t("pfm-categorization-detail-close")}"
        header-text="${this.t("pfm-categorization-detail-warning")}"
        header-type="modal-initial"
        id-modal="otp-modal"
        modal-type="caution"
        title-icon="${w()}"
        title-lines="0"
        title-text="${this.t("pfm-categorization-detail-otp-modal-title",{group:this.t(`pfm-categorization-detail-detail-title-${this.groupId}`)})}"
        @help-modal-close="${()=>{this.otpCancelled=!0,this._showOtpModal=!1}}"
        @help-modal-footer-button-click="${this._manageOtpAcept}"
      ></bbva-help-modal>
    `}get _groupPage(){return d`
      <pfm-categorization-detail-group-detail
        ?active-proactivity="${!this._selectedCategory&&!this._selectedSubcategory}"
        ?animate-budgets-actions="${this._animateBudgetsActions}"
        ?animate-movement="${this._animateMovement}"
        ?avoid-get-transactions="${this.showPeriodSelector||this._selectedCategory}"
        ?discreet-mode="${this.discreetMode}"
        ?enable-movement-link="${this.enableMovementLink}"
        ?error="${this._error}"
        ?expand-forecast-accordeon="${this._expandForecastMovementsGroup}"
        ?expand-forecast-category="${this._expandForecastCategory}"
        ?fixed-expenses="${this.fixedExpenses}"
        ?hidden="${this.showPeriodSelector||this._selectedCategory}"
        ?hide-brands="${this.isHideBrands}"
        ?hide-command-line="${this.hideCommandLine}"
        ?hide-see-historic-link="${this.hideSeeHistoricLink}"
        ?hide-operative-actions="${this.hideOperativeActions}"
        ?is-expense-group="${this.groupId===this.expensesGroupId}"
        ?is-history-period="${this._isHistoryPeriod}"
        ?loading="${this._loading}"
        ?native="${this.native}"
        ?otp-cancelled="${this.otpCancelled}"
        ?show-brands-forecasting="${this.showBrandsForecasting}"
        ?show-budgets-actions="${this.showBudgetsActions}"
        ?show-category-forecasting="${this.showCategoryForecasting}"
        ?show-feedback="${this.showFeedback}"
        ?show-movements-forecasting="${this.showMovementsForecasting}"
        ?show-undated-estimates="${this.showUndatedEstimates}"
        ?variable-expenses="${this.variableExpenses}"
        .actions="${this.groupActions||this.actions}"
        .budgets="${this._budgets}"
        .data="${this._groupDetail}"
        .evolutionBalance="${l(this.evolutionBalance)}"
        .hideProactivityMessage="${this.hideProactivityMessage}"
        .period="${this._period}"
        .proactivityMessageAemKey="${this.proactivityMessageAemKey}"
        .proactivityMessagePublicSettingsEndpoint="${this.proactivityMessagePublicSettingsEndpoint}"
        .proactivityMessagePublicSettingsHost="${this._pmPublicSettingsHost}"
        .proactivityMessagePublicSettingsRequiredToken="${this._pmPublicSettingsRequiredToken}"
        .relevantFacts="${this.relevantFacts}"
        .requiredToken="${this.requiredToken}"
        .requiredTokenProactivity="${this.requiredTokenProactivity}"
        .selectedTab="${this.selectedTab}"
        .userContracts="${this._filteredUserContracts}"
        brands-balances-cache-key="${l(this.brandsBalancesCacheKey)}"
        cache-type="${this.cacheType}"
        class="container-wrapper"
        contract-id="${l(this.contractId)}"
        contract-subtype-id="${l(this.contractSubtypeId)}"
        contract-type-id="${l(this.contractTypeId)}"
        dark-mode-scheme="${this.darkModeScheme}"
        emplacement="${this.emplacement}"
        feedback-value="${l(this.feedbackValue)}"
        forecast-balances-cache-key="${l(this.forecastBalancesDmCacheKey)}"
        forecast-transactions-cache-key="${l(this.forecastTransactionsDmCacheKey)}"
        group-id="${this.groupId}"
        host="${this.host}"
        language="${this.language}"
        pending-category-id="${this.pendingCategoryId}"
        personal-finances-api-version="${this.balanceSearchApiVersion}"
        pfm-id="${this.pfmId}"
        recurring-expenses-balances-cache-key="${l(this.recurringExpensesBalancesDmCacheKey)}"
        recurring-expenses-cache-key="${l(this.recurringExpensesDmCacheKey)}"
        show-edit-period
        transactions-order-by="${this.transactionsOrderBy}"
        @pfm-categorization-detail-budgets-action-animate="${this._handleBudgetActionsAnimate}"
        @pfm-categorization-detail-category-forecast-category-selected="${this._handleForecastCategorySelected}"
        @pfm-categorization-detail-category-select="${this._manageCategorySelection}"
        @pfm-categorization-detail-group-detail-action-select="${this.updateHistory}"
        @pfm-categorization-detail-history-show="${this._manageShowHistory}"
        @pfm-categorization-detail-movement-animate="${this._handleMovementAnimate}"
        @pfm-categorization-detail-movements-forecast-accordeon-click="${()=>{this._expandForecastMovementsGroup=!this._expandForecastMovementsGroup}}"
        @pfm-categorization-detail-period-select="${this._openPeriodSelector}"
        @signature-required-dm="${this._manageSignature}"
        @signature-required-first-step-dm="${this._manageSignature}"
        @tab-default-tab-click="${this._manageTabChange}"
      ></pfm-categorization-detail-group-detail>
    `}get _categoryPage(){var e,t,a,i;return d`
      <bbva-transition-container
        ?visible="${Boolean(this._selectedCategory)}"
        header-left-icon-aria-label="${this.t("pfm-categorization-detail-return-accessibility-text")}"
        header-left-icon-label="${this._returnText}"
        header-show-left-icon
        header-text="${l(this._titleCategory(null===(e=this._selectedCategory)||void 0===e?void 0:e.name))}"
        header-type="first-level-sequential"
        id="categoryPage"
        @header-main-icon-click=${this.navigateBack}
      >
        <div slot="slot-content" ambient="primary">
          <pfm-categorization-detail-group-detail
            ?active-proactivity="${l(null===(t=this._selectedCategory)||void 0===t?void 0:t.id)&&!this._selectedSubcategory}"
            ?animate-budgets-actions="${this._animateBudgetsActions}"
            ?animate-movement="${this._animateMovement}"
            ?avoid-get-transactions="${this.showPeriodSelector||this._selectedSubcategory||!this._selectedCategory}"
            ?discreet-mode="${this.discreetMode}"
            ?enable-movement-link="${this.enableMovementLink}"
            ?error="${this._error}"
            ?expand-forecast-accordeon="${this._expandForecastMovementsCategory}"
            ?expand-forecast-category="${this._expandForecastCategory}"
            ?fixed-expenses="${this.fixedExpenses}"
            ?hidden="${this.showPeriodSelector||this._selectedSubcategory||!this._selectedCategory}"
            ?hide-brands="${this.isHideBrands}"
            ?hide-command-line="${this.hideCommandLine}"
            ?hide-operative-actions="${this.hideOperativeActions}"
            ?hide-see-historic-link="${this.hideSeeHistoricLink}"
            ?is-expense-group="${this.groupId===this.expensesGroupId}"
            ?is-history-period="${this._isHistoryPeriod}"
            ?loading="${this._loading}"
            ?native="${this.native}"
            ?otp-cancelled="${this.otpCancelled}"
            ?show-budgets-actions="${this.showBudgetsActions}"
            ?show-category-forecasting="${this.showCategoryForecasting}"
            ?show-feedback="${this.showFeedback}"
            ?show-movements-forecasting="${this.showMovementsForecasting}"
            ?show-undated-estimates="${this.showUndatedEstimates}"
            ?variable-expenses="${this.variableExpenses}"
            .actions="${this.actions}"
            .budgets="${this._budgets}"
            .data="${this._selectedCategory}"
            .hideProactivityMessage="${this.hideProactivityMessage}"
            .legendColors="${[_.tertiaryType4Dark,_.tertiaryType4Light]}"
            .period="${this._period}"
            .proactivityMessageAemKey="${this.proactivityMessageAemKey}"
            .proactivityMessagePublicSettingsEndpoint="${this.proactivityMessagePublicSettingsEndpoint}"
            .proactivityMessagePublicSettingsHost="${this._pmPublicSettingsHost}"
            .proactivityMessagePublicSettingsRequiredToken="${this._pmPublicSettingsRequiredToken}"
            .relevantFacts="${this.relevantFacts}"
            .requiredToken="${this.requiredToken}"
            .requiredTokenProactivity="${this.requiredTokenProactivity}"
            .selectedTab="${this.selectedCategoryTab}"
            .userContracts="${this._filteredUserContracts}"
            brands-balances-cache-key="${l(this.brandsBalancesCacheKey)}"
            cache-type="${this.cacheType}"
            category-id="${null===(a=this._selectedCategory)||void 0===a?void 0:a.id}"
            category-name="${null===(i=this._selectedCategory)||void 0===i?void 0:i.name}"
            contract-id="${l(this.contractId)}"
            contract-subtype-id="${l(this.contractSubtypeId)}"
            contract-type-id="${l(this.contractTypeId)}"
            dark-mode-scheme="${this.darkModeScheme}"
            emplacement="${this.emplacement}"
            feedback-value="${l(this.feedbackValue)}"
            forecast-balances-cache-key="${l(this.forecastBalancesDmCacheKey)}"
            forecast-transactions-cache-key="${l(this.forecastTransactionsDmCacheKey)}"
            group-id="${this.groupId}"
            host="${this.host}"
            language="${this.language}"
            pending-category-id="${this.pendingCategoryId}"
            personal-finances-api-version="${this.balanceSearchApiVersion}"
            pfm-id="${this.pfmId}"
            show-edit-period
            transactions-order-by="${this.transactionsOrderBy}"
            @pfm-categorization-detail-budgets-action-animate="${this._handleBudgetActionsAnimate}"
            @pfm-categorization-detail-category-forecast-subcategory-selected="${this._handleForecastSubcategorySelected}"
            @pfm-categorization-detail-history-show="${this._manageShowHistory}"
            @pfm-categorization-detail-movement-animate="${this._handleMovementAnimate}"
            @pfm-categorization-detail-movements-forecast-accordeon-click="${()=>{this._expandForecastMovementsCategory=!this._expandForecastMovementsCategory}}"
            @pfm-categorization-detail-period-select="${this._openPeriodSelector}"
            @pfm-categorization-detail-subcategory-select="${this._manageSubcategorySelection}"
            @signature-required-dm="${this._manageSignature}"
            @signature-required-first-step-dm="${this._manageSignature}"
            @tab-default-tab-click="${this._manageTabCategoryChange}"
          ></pfm-categorization-detail-group-detail>
        </div>
      </bbva-transition-container>
    `}get _subcategoryPage(){var e,t,a,i,s;return d`
      <bbva-transition-container
        ?visible="${Boolean(this._selectedSubcategory)}"
        header-left-icon-aria-label="${this.t("pfm-categorization-detail-return-accessibility-text")}"
        header-left-icon-label="${this._returnText}"
        header-show-left-icon
        header-text="${l(this._titleCategory(null===(e=this._selectedSubcategory)||void 0===e?void 0:e.name))}"
        header-type="first-level-sequential"
        id="subcategoryPage"
        @header-main-icon-click=${this.navigateBack}
      >
        <div slot="slot-content" ambient="primary">
          <pfm-categorization-detail-subcategory-detail
            ?active-proactivity="${l(null===(t=this._selectedCategory)||void 0===t?void 0:t.id)&&l(null===(a=this._selectedSubcategory)||void 0===a?void 0:a.id)}"
            ?animate-budgets-actions="${this._animateBudgetsActions}"
            ?animate-movement="${this._animateMovement}"
            ?avoid-get-transactions="${!this._selectedSubcategory}"
            ?discreet-mode="${this.discreetMode}"
            ?enable-movement-link="${this.enableMovementLink}"
            ?error="${this._error}"
            ?expand-forecast-accordeon="${this._expandForecastMovementsSubcategory}"
            ?expand-forecast-subcategory="${this._expandForecastSubcategory}"
            ?hidden="${this.showPeriodSelector||!this._selectedSubcategory}"
            ?hide-brands="${this.isHideBrands}"
            ?hide-command-line="${this.hideCommandLine}"
            ?hide-operative-actions="${this.hideOperativeActions}"
            ?hide-see-historic-link="${this.hideSeeHistoricLink}"
            ?is-expense-group="${this.groupId===this.expensesGroupId}"
            ?is-history-period="${this._isHistoryPeriod}"
            ?loading="${this._loading}"
            ?native="${this.native}"
            ?otp-cancelled="${this.otpCancelled}"
            ?show-budgets-actions="${this.showBudgetsActions}"
            ?show-movements-forecasting="${this.showMovementsForecasting}"
            ?show-undated-estimates="${this.showUndatedEstimates}"
            .actions="${this.actions}"
            .data="${this._selectedSubcategory}"
            .hideProactivityMessage="${this.hideProactivityMessage}"
            .period="${this._period}"
            .proactivityMessageAemKey="${this.proactivityMessageAemKey}"
            .proactivityMessagePublicSettingsEndpoint="${this.proactivityMessagePublicSettingsEndpoint}"
            .proactivityMessagePublicSettingsHost="${this._pmPublicSettingsHost}"
            .proactivityMessagePublicSettingsRequiredToken="${this._pmPublicSettingsRequiredToken}"
            .relevantFacts="${this.relevantFacts}"
            .requiredToken="${this.requiredToken}"
            .requiredTokenProactivity="${this.requiredTokenProactivity}"
            .userContracts="${this._filteredUserContracts}"
            cache-type="${this.cacheType}"
            category-id="${l(null===(i=this._selectedCategory)||void 0===i?void 0:i.id)}"
            contract-id="${l(this.contractId)}"
            contract-subtype-id="${l(this.contractSubtypeId)}"
            contract-type-id="${l(this.contractTypeId)}"
            dark-mode-scheme="${this.darkModeScheme}"
            emplacement="${this.emplacement}"
            forecast-balances-cache-key="${l(this.forecastBalancesDmCacheKey)}"
            forecast-transactions-cache-key="${l(this.forecastTransactionsDmCacheKey)}"
            group-id="${this.groupId}"
            host="${this.host}"
            language="${this.language}"
            pending-category-id="${this.pendingCategoryId}"
            personal-finances-api-version="${this.balanceSearchApiVersion}"
            pfm-id="${this.pfmId}"
            show-edit-period
            subcategory-id="${l(null===(s=this._selectedSubcategory)||void 0===s?void 0:s.id)}"
            @pfm-categorization-detail-budgets-action-animate="${this._handleBudgetActionsAnimate}"
            @pfm-categorization-detail-history-show="${this._manageShowHistory}"
            @pfm-categorization-detail-movement-animate="${this._handleMovementAnimate}"
            @pfm-categorization-detail-movements-forecast-accordeon-click="${()=>{this._expandForecastMovementsSubcategory=!this._expandForecastMovementsSubcategory}}"
            @pfm-categorization-detail-period-select="${this._openPeriodSelector}"
            @signature-required-dm="${this._manageSignature}"
            @signature-required-first-step-dm="${this._manageSignature}"
          ></pfm-categorization-subcategory-detail>
        </div>
      </bbva-transition-container>
    `}get _historyPage(){var e,t,a,i,s,r,n;return d`
      <bbva-transition-container
        ?visible="${Boolean(this._showHistory)}"
        header-left-icon-aria-label="${null===(e=this.config.header)||void 0===e?void 0:e.leftIconAriaLabel}"
        header-left-icon-label="${null===(t=this.config.header)||void 0===t?void 0:t.leftIconLabel}"
        header-show-left-icon
        header-text="${this._historyTitle}"
        header-type="first-level-sequential"
        id="${this._historyPageId}"
        @header-main-icon-click=${this.navigateBack}
      >
        <div slot="slot-content" ambient="primary">
          ${this._showHistory?d`
                <pfm-categorization-detail-history
                  ?animate-movement="${this._animateMovement}"
                  ?discreet-mode="${this.discreetMode}"
                  ?enable-movement-link="${this.enableMovementLink}"
                  ?error="${this._error}"
                  ?hidden="${this.showPeriodSelector}"
                  ?is-expense-group="${this.groupId===this.expensesGroupId}"
                  ?loading="${this._loading}"
                  ?native="${this.native}"
                  ?otp-cancelled="${this.otpCancelled}"
                  ?show-chart-average="${this.showChartAverage}"
                  ?use-customer-analytics="${this._useCustomerAnalytics}"
                  .calculatorApiVersion="${this.calculatorApiVersion}"
                  .customerAnalyticsApiVersion="${this.customerAnalyticsApiVersion}"
                  .medianGroupId="${this.medianGroupId}"
                  .period="${this._period}"
                  .requiredToken="${this.requiredToken}"
                  .userContracts="${this._filteredUserContracts}"
                  cache-type="${this.cacheType}"
                  category-id="${l(null===(a=this._historyFilters)||void 0===a?void 0:a.categoryId)}"
                  contract-id="${l(this.contractId)}"
                  contract-subtype-id="${l(this.contractSubtypeId)}"
                  contract-type-id="${l(this.contractTypeId)}"
                  currency="${null===(i=this._groupDetail)||void 0===i||null===(s=i.totalAmount)||void 0===s?void 0:s.currency}"
                  customer-analytics-cache-key="${l(this.customerAnalyticsDmCacheKey)}"
                  dark-mode-scheme="${this.darkModeScheme}"
                  group-id="${this.groupId}"
                  group-name="${null===(r=this._groupDetail)||void 0===r?void 0:r.name}"
                  ?hide-operative-actions="${this.hideOperativeActions}"
                  host="${this.host}"
                  language="${this.language}"
                  local-currency="${this.localCurrency}"
                  pending-category-id="${this.pendingCategoryId}"
                  personal-finances-api-version="${this.balanceSearchApiVersion}"
                  pfm-id="${this.pfmId}"
                  subcategory-id="${l(null===(n=this._historyFilters)||void 0===n?void 0:n.subcategoryId)}"
                  transactions-order-by="${this.transactionsOrderBy}"
                  @pfm-categorization-detail-history-category-select="${this._handleCategorHistorySelect}"
                  @pfm-categorization-detail-history-subcategory-select="${this._manageSubcategoryHistorySelection}"
                  @pfm-categorization-detail-movement-animate="${this._handleMovementAnimate}"
                  @signature-required-dm="${this._manageSignature}"
                  @signature-required-first-step-dm="${this._manageSignature}"
                ></pfm-categorization-detail-history>
              `:h}
        </div>
      </bbva-transition-container>
    `}get _historyPageWithoutComparative(){var e,t,a,i,s;return d`
      <bbva-transition-container
        ?visible="${Boolean(this._showHistory)}"
        header-left-icon-aria-label="${this.t("pfm-categorization-detail-return-accessibility-text")}"
        header-left-icon-label="${this._returnText}"
        header-show-left-icon
        header-text="${this._historyTitle}"
        header-type="first-level-sequential"
        id="${this._historyPageId}"
        @header-main-icon-click=${this.navigateBack}
      >
        <div slot="slot-content" ambient="primary">
          ${this._showHistory?d`
                <pfm-categorization-detail-history-without-comparative
                  ?animate-movement="${this._animateMovement}"
                  ?discreet-mode="${this.discreetMode}"
                  ?enable-movement-link="${this.enableMovementLink}"
                  ?error="${this._error}"
                  ?hidden="${this.showPeriodSelector}"
                  ?hide-comparative-months="${this.hideComparativeMonths}"
                  ?is-expense-group="${this.groupId===this.expensesGroupId}"
                  ?loading="${this._loading}"
                  ?native="${this.native}"
                  ?otp-cancelled="${this.otpCancelled}"
                  ?show-chart-average="${this.showChartAverage}"
                  ?use-customer-analytics="${this._useCustomerAnalytics}"
                  .calculatorApiVersion="${this.calculatorApiVersion}"
                  .customerAnalyticsApiVersion="${this.customerAnalyticsApiVersion}"
                  .period="${this._period}"
                  .requiredToken="${this.requiredToken}"
                  .userContracts="${this._filteredUserContracts}"
                  cache-type="${this.cacheType}"
                  category-id="${l(null===(e=this._historyFilters)||void 0===e?void 0:e.categoryId)}"
                  contract-id="${l(this.contractId)}"
                  contract-subtype-id="${l(this.contractSubtypeId)}"
                  contract-type-id="${l(this.contractTypeId)}"
                  currency="${null===(t=this._groupDetail)||void 0===t||null===(a=t.totalAmount)||void 0===a?void 0:a.currency}"
                  customer-analytics-cache-key="${l(this.customerAnalyticsDmCacheKey)}"
                  dark-mode-scheme="${this.darkModeScheme}"
                  group-id="${this.groupId}"
                  group-name="${null===(i=this._groupDetail)||void 0===i?void 0:i.name}"
                  ?hide-operative-actions="${this.hideOperativeActions}"
                  host="${this.host}"
                  language="${this.language}"
                  pending-category-id="${this.pendingCategoryId}"
                  personal-finances-api-version="${this.balanceSearchApiVersion}"
                  pfm-id="${this.pfmId}"
                  subcategory-id="${l(null===(s=this._historyFilters)||void 0===s?void 0:s.subcategoryId)}"
                  transactions-order-by="${this.transactionsOrderBy}"
                  @pfm-categorization-detail-history-without-comparative-category-select="${this._handleCategorHistorySelect}"
                  @pfm-categorization-detail-history-without-comparative-subcategory-select="${this._manageSubcategoryHistorySelection}"
                  @pfm-categorization-detail-movement-animate="${this._handleMovementAnimate}"
                  @signature-required-dm="${this._manageSignature}"
                  @signature-required-first-step-dm="${this._manageSignature}"
                ></pfm-categorization-detail-history-without-comparative>
              `:h}
        </div>
      </bbva-transition-container>
    `}get _historyCategoryPage(){var e,t,a,i;return d`
      <bbva-transition-container
        ?visible="${Boolean(this._selectedCategoryHistory)}"
        header-left-icon-aria-label="${this.t("pfm-categorization-detail-return-accessibility-text")}"
        header-left-icon-label="${this._returnText}"
        header-show-left-icon
        header-text="${l(this._titleCategory(null===(e=this._selectedCategoryHistory)||void 0===e?void 0:e.name))}"
        header-type="first-level-sequential"
        id="historyCategoryPage"
        @header-main-icon-click=${this.navigateBack}
      >
        <div slot="slot-content" ambient="primary">
          <pfm-categorization-detail-group-detail
            ?animate-movement="${this._animateMovement}"
            ?avoid-get-transactions="${this.showPeriodSelector||this._selectedSubcategory||!this._selectedCategoryHistory}"
            ?discreet-mode="${this.discreetMode}"
            ?enable-movement-link="${this.enableMovementLink}"
            ?error="${this._error}"
            ?fixed-expenses="${this.fixedExpenses}"
            ?hide-brands="${this.isHideBrands}"
            ?hide-command-line="${this.hideCommandLine}"
            ?hide-operative-actions="${this.hideOperativeActions}"
            ?is-history-period="${this._isHistoryPeriod}"
            ?loading="${this._loading}"
            ?native="${this.native}"
            ?otp-cancelled="${this.otpCancelled}"
            ?show-brands-forecasting="${this.showBrandsForecasting}"
            ?show-category-forecasting="${this.showCategoryForecasting}"
            ?show-feedback="${this.showFeedback}"
            ?show-movements-forecasting="${this.showMovementsForecasting}"
            ?show-undated-estimates="${this.showUndatedEstimates}"
            ?variable-expenses="${this.variableExpenses}"
            .actions="${this.actions}"
            .data="${this._selectedCategoryHistory}"
            .hideProactivityMessage="${this.hideProactivityMessage}"
            .legendColors="${[_.tertiaryType4Dark,_.tertiaryType4Light]}"
            .period="${null===(t=this._selectedCategoryHistory)||void 0===t?void 0:t.period}"
            .proactivityMessageAemKey="${this.proactivityMessageAemKey}"
            .proactivityMessagePublicSettingsEndpoint="${this.proactivityMessagePublicSettingsEndpoint}"
            .proactivityMessagePublicSettingsHost="${this._pmPublicSettingsHost}"
            .proactivityMessagePublicSettingsRequiredToken="${this._pmPublicSettingsRequiredToken}"
            .relevantFacts="${this.relevantFacts}"
            .requiredToken="${this.requiredToken}"
            .requiredTokenProactivity="${this.requiredTokenProactivity}"
            .userContracts="${this._filteredUserContracts}"
            brands-balances-cache-key="${l(this.brandsBalancesCacheKey)}"
            cache-type="${this.cacheType}"
            category-id="${null===(a=this._selectedCategoryHistory)||void 0===a?void 0:a.id}"
            category-name="${null===(i=this._selectedCategoryHistory)||void 0===i?void 0:i.name}"
            contract-id="${l(this.contractId)}"
            contract-type-id="${l(this.contractTypeId)}"
            dark-mode-scheme="${this.darkModeScheme}"
            emplacement="${this.emplacement}"
            feedback-value="${l(this.feedbackValue)}"
            group-id="${this.groupId}"
            hide-see-historic-link
            host="${this.host}"
            language="${this.language}"
            local-currency="${this.localCurrency}"
            pending-category-id="${this.pendingCategoryId}"
            personal-finances-api-version="${this.balanceSearchApiVersion}"
            pfm-id="${this.pfmId}"
            transactions-order-by="${this.transactionsOrderBy}"
            @pfm-categorization-detail-brand-select="${this._manageBrandHistorySelection}"
            @pfm-categorization-detail-category-forecast-subcategory-selected="${this._handleForecastSubcategoryHistorySelected}"
            @pfm-categorization-detail-movement-animate="${this._handleMovementAnimate}"
            @pfm-categorization-detail-movements-forecast-accordeon-click="${()=>{this._expandForecastMovementsCategory=!this._expandForecastMovementsCategory}}"
            @pfm-categorization-detail-subcategory-select="${this._manageSubcategoryHistorySelection}"
            @signature-required-dm="${this._manageSignature}"
            @signature-required-first-step-dm="${this._manageSignature}"
            @tab-default-tab-click="${this._manageTabChange}"
          ></pfm-categorization-detail-group-detail>
        </div>
      </bbva-transition-container>
    `}get _historySubcategoryPage(){var e,t,a,i,s,r;return d`
      <bbva-transition-container
        ?visible="${Boolean(this._selectedSubcategoryHistory)}"
        header-left-icon-aria-label="${this.t("pfm-categorization-detail-return-accessibility-text")}"
        header-left-icon-label="${this._returnText}"
        header-show-left-icon
        header-text="${l(this._titleCategory(null===(e=this._selectedSubcategoryHistory)||void 0===e?void 0:e.name))}"
        header-type="first-level-sequential"
        id="historySubcategoryPage"
        @header-main-icon-click=${this.navigateBack}
      >
        <div slot="slot-content" ambient="primary">
          <pfm-categorization-detail-subcategory-detail
            ?animate-movement="${this._animateMovement}"
            ?avoid-get-transactions="${!this._selectedSubcategoryHistory}"
            ?discreet-mode="${this.discreetMode}"
            ?enable-movement-link="${this.enableMovementLink}"
            ?error="${this._error}"
            ?hidden="${this.showPeriodSelector||!this._selectedSubcategoryHistory}"
            ?hide-brands="${this.isHideBrands}"
            ?hide-command-line="${this.hideCommandLine}"
            ?hide-operative-actions="${this.hideOperativeActions}"
            ?is-history-period="${this._isHistoryPeriod}"
            ?loading="${this._loading}"
            ?native="${this.native}"
            ?otp-cancelled="${this.otpCancelled}"
            ?show-movements-forecasting="${this.showMovementsForecasting}"
            ?show-undated-estimates="${this.showUndatedEstimates}"
            .actions="${this.actions}"
            .data="${this._selectedSubcategoryHistory}"
            .hideProactivityMessage="${this.hideProactivityMessage}"
            .period="${(null===(t=this._selectedSubcategoryHistory)||void 0===t?void 0:t.period)||(null===(a=this._selectedCategoryHistory)||void 0===a?void 0:a.period)}"
            .proactivityMessageAemKey="${this.proactivityMessageAemKey}"
            .proactivityMessagePublicSettingsEndpoint="${this.proactivityMessagePublicSettingsEndpoint}"
            .proactivityMessagePublicSettingsHost="${this._pmPublicSettingsHost}"
            .proactivityMessagePublicSettingsRequiredToken="${this._pmPublicSettingsRequiredToken}"
            .relevantFacts="${this.relevantFacts}"
            .requiredToken="${this.requiredToken}"
            .requiredTokenProactivity="${this.requiredTokenProactivity}"
            .userContracts="${this._filteredUserContracts}"
            cache-type="${this.cacheType}"
            category-id="${l((null===(i=this._selectedCategoryHistory)||void 0===i?void 0:i.id)||(null===(s=this._selectedCategory)||void 0===s?void 0:s.id))}"
            contract-id="${l(this.contractId)}"
            contract-type-id="${l(this.contractTypeId)}"
            dark-mode-scheme="${this.darkModeScheme}"
            emplacement="${this.emplacement}"
            group-id="${this.groupId}"
            hide-see-historic-link
            host="${this.host}"
            language="${this.language}"
            local-currency="${this.localCurrency}"
            pending-category-id="${this.pendingCategoryId}"
            personal-finances-api-version="${this.balanceSearchApiVersion}"
            pfm-id="${this.pfmId}"
            subcategory-id="${l(null===(r=this._selectedSubcategoryHistory)||void 0===r?void 0:r.id)}"
            transactions-order-by="${this.transactionsOrderBy}"
            @pfm-categorization-detail-movement-animate="${this._handleMovementAnimate}"
            @pfm-categorization-detail-period-select="${this._openPeriodSelector}"
            @signature-required-dm="${this._manageSignature}"
            @signature-required-first-step-dm="${this._manageSignature}"
          ></pfm-categorization-detail-subcategory-detail>
        </div>
      </bbva-transition-container>
    `}get _content(){return d`
      ${this._groupPage} ${this._categoryPage} ${this._subcategoryPage}
      ${this.hideComparativeMonths?this._historyPageWithoutComparative:this._historyPage}
      ${this._historyCategoryPage} ${this._historySubcategoryPage}
    `}_changeFormSelect(e){this.groupId=e.target.value,this.config.header.text=this._setTitleGroup}_managePeriodSelection(e){this._optionSelected=e.detail.selected;this._showDateRange=4===this._optionSelected,4!==this._optionSelected?(this._selectedPeriod=e.detail.value,this._showCustomPeriodGroupCombo=!1):(this._selectedPeriod=void 0,this._showCustomPeriodGroupCombo=this.showSelectPeriodGroup),this._checkDisablePeriodSelectorButton()}_checkDisablePeriodSelectorButton(){var e,t;this._isDisabledPeriodSelectorButton=!(null!==(e=this._selectedPeriod)&&void 0!==e&&e.startDate&&null!==(t=this._selectedPeriod)&&void 0!==t&&t.endDate)}_managePeriodConfirm(){this._isHistoryPeriod=0!==this._periods.indexOf(this._selectedPeriod),this.selectedPeriodDefault=this._periods.findIndex((e=>e===this._selectedPeriod)),this._optionSelectedStart=this._optionSelected,this._dispatchEvent("pfm-categorization-detail-period-selector-confirm",{...this._selectedPeriod,index:this._periods.indexOf(this._selectedPeriod)}),this._showCustomPeriodGroupCombo=!1,this._selectedPeriod?this._period=this._selectedPeriod:(this._periods&&(this._period={startDate:this._periods[0].startDate,endDate:this._periods[0].endDate}),this._showDateRange=!1)}_managePeriodClose(){this._selectedPeriod=this._periods[this.selectedPeriodDefault],this._optionSelected=this._optionSelectedStart,this.showPeriodSelector=!1,this._period||(this._period={startDate:this._periods[0].startDate,endDate:this._periods[0].endDate})}_showCalendar(e){if(this.native&&this.showCalendar){this._calendarToShow=e.detail.currentTarget.dataset.date;const t={dateFormat:"yyyy-MM-dd",defaultDate:li().format("YYYY-MM-DD")};this._dispatchEvent("pfm-categorization-detail-native-calendar-show",t)}}get _radioGroup(){return this._periods.map(((e,t)=>({text:`${this.t(`pfm-categorization-detail-period-selector-radio${t}`)}<span slot="description">${Kt(e,this.language)}</span>`,labelMedium:!0,value:e,checked:this.selectedPeriodDefault===t||e===this._selectedPeriod,divider:"full"}))).concat({text:`${this.t("pfm-categorization-detail-period-selector-radio4")}<span slot="description">${this.t("pfm-categorization-detail-period-selector-radio4-text")}</span>`,value:{},labelMedium:!0,checked:this.showSelectPeriodGroup})}get _getList(){var e;return null===(e=this.groups)||void 0===e?void 0:e.map((({id:e,text:t},a)=>({value:e,text:this.t(t),selected:0===a})))}get _tplComboPeriod(){const e=this.groups[0].text;return d`
      <bbva-form-select
        ?hidden="${!this._showCustomPeriodGroupCombo}"
        .items="${this._getList}"
        ambient="primary-alt"
        info-title="${this.t("pfm-categorization-detail-form-select-info-title")}"
        label="${this.t("pfm-categorization-detail-form-select-label")}"
        native-select-accessibility-text="${this.t(e)}"
        native-selector
        required
        @change="${this._changeFormSelect}"
      ></bbva-form-select>
    `}get _periodModal(){return d`
      <bbva-help-modal
        ?attach-to-body="${this.addAttachToBody}"
        ?disabled-button="${this._isDisabledPeriodSelectorButton}"
        ?visible="${this.showPeriodSelector}"
        .contentStyles="${oi}"
        aria-label="${this.t("pfm-categorization-detail-period-selector-title")}"
        button-text="${this.t("pfm-categorization-detail-filter")}"
        full-height
        header-close-icon-aria-label="${this.t("pfm-categorization-detail-close-accessibility-text")}"
        header-close-icon-label="${this.t("pfm-categorization-detail-close")}"
        header-text="${this.t("pfm-categorization-detail-period-selector-title")}"
        header-type="modal-initial"
        hide-content-padding-top
        id-modal="date-filter"
        @help-modal-close="${this._managePeriodClose}"
        @help-modal-footer-button-click="${this._managePeriodConfirm}"
      >
        <div slot="slot-content">
          <form>
            <bbva-form-radio-group
              .items="${this._radioGroup}"
              ambient="light"
              label-out="${this.t("pfm-categorization-detail-period-selector-head")}"
              name="choice"
              required
              label-medium-out
              selected="${this._optionSelected}"
              @form-radio-group-item-change="${this._managePeriodSelection}"
            ></bbva-form-radio-group>
            ${this._showDateRange?d`
                  <bbva-form-date-range
                    ambient="light"
                    end-date="${this._endDateRange}"
                    end-text="${this.t("pfm-categorization-detail-period-selector-custom-date-to")}"
                    end-title-text="${this.t("pfm-categorization-detail-period-selector-custom-date")}"
                    locale="${this.language}"
                    start-date="${this._startDateRange}"
                    start-text="${this.t("pfm-categorization-detail-period-selector-custom-date-from")}"
                    start-title-text="${this.t("pfm-categorization-detail-period-selector-custom-date")}"
                    @form-date-range-end-date-select="${e=>{this._selectedPeriod={...this._selectedPeriod,endDate:li(e.detail).endOf("day")},this._checkDisablePeriodSelectorButton()}}"
                    @form-date-range-show-end-calendar="${this._showCalendar}"
                    @form-date-range-show-start-calendar="${this._showCalendar}"
                    @form-date-range-start-date-select="${e=>{this._selectedPeriod={...this._selectedPeriod,startDate:li(e.detail).startOf("day")},this._checkDisablePeriodSelectorButton()}}"
                  ></bbva-form-date-range>
                `:h}
            ${this._tplComboPeriod}
          </form>
        </div>
      </bbva-help-modal>
    `}render(){return d`
      ${super.render()}
      <bbva-global-financial-overview-api-dm
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        cachekey="${l(this.financialOverviewCacheKey)}"
        cachetype="${l(this.financialOverviewCacheKey&&this.cacheType)}"
        host="${this.host}"
        version="${this.financialOverviewApiVersion}"
        @api-dm-error="${this._manageError}"
        @financial-overview-api-dm-fetch-error="${this._manageError}"
        @financial-overview-api-dm-fetch="${this._manageInternalContractsResponse}"
      ></bbva-global-financial-overview-api-dm>
      <bbva-global-retail-financial-overview-api-dm
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        cachekey="${l(this.retailFinancialOverviewCacheKey)}"
        cachetype="${l(this.retailFinancialOverviewCacheKey&&this.cacheType)}"
        country="${this.retailFinancialOverviewCountry}"
        host="${this.host}"
        version="${this.retailFinancialOverviewApiVersion}"
        @api-dm-error="${this._manageError}"
        @financial-overview-api-dm-fetch-error="${this._manageError}"
        @financial-overview-api-dm-fetch="${this._manageExternalContractsResponse}"
      ></bbva-global-retail-financial-overview-api-dm>
      <bbva-global-pfms-api-dm
        ?native="${this.native}"
        .headers="${this._headers}"
        .requiredToken="${this.requiredToken}"
        cachekey="${l(this.pfmsCacheKey)}"
        cachetype="${l(this.pfmsCacheKey&&this.cacheType)}"
        host="${this.host}"
        version="${this.personalFinancesApiVersion}"
        @api-dm-error="${this._manageError}"
        @pfms-api-dm-fetch-error="${this._manageError}"
        @pfms-api-dm-fetch="${this._managePfmsResponse}"
      ></bbva-global-pfms-api-dm>
      <bbva-global-balances-search-api-dm
        ?native="${this.native}"
        .headers="${this._headers}"
        .requiredToken="${this.requiredToken}"
        cachekey="${l(this.balancesCacheKey)}"
        cachetype="${l(this.pfmBalancesCacheKey&&this.cacheType)}"
        host="${this.host}"
        version="${this.balanceSearchApiVersion}"
        @api-dm-error="${this._manageError}"
        @balances-search-api-dm-fetch-error="${this._manageError}"
        @balances-search-api-dm-fetch="${this._manageBalancesSearchResponse}"
      ></bbva-global-balances-search-api-dm>
      <bbva-global-budgets-search-api-dm
        ?native="${this.native}"
        .headers="${this._headers}"
        .requiredToken="${this.requiredToken}"
        cachekey="${l(this.budgetsCacheKey)}"
        cachetype="${l(this.budgetsCacheKey&&this.cacheType)}"
        host="${this.host}"
        version="${this.balanceSearchApiVersion}"
        @budgets-search-api-dm-fetch="${this._manageBudgetsSearchResponse}"
      ></bbva-global-budgets-search-api-dm>
      <div ambient="primary">
        ${this._content} ${this._periodModal} ${this.showOtpModal?this._otpModal:h}
      </div>
    `}_dispatchEvent(e,t){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}}customElements.define(hi.is,hi);
