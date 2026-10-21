import{J as t,L as e,aZ as n,a7 as a,h as i,dC as s,a as o,i as r,b as l,z as c,aX as d,an as m,ak as u,aY as p,dp as h,aV as y,aD as v,bF as g,aN as _,cU as b,cT as f}from"./952f98a9.js";import{R as S,S as x,M as A,L as T,a2 as $,P,G as M,D as E,a1 as I,f as C,Q as O,V as L,F as R,A as D,I as w,a4 as N,a3 as F,H as k,x as B,T as j,z as V,O as H,e as q,E as z,h as G,an as U,K as W,ao as Y,N as K}from"./216055dc.js";import{cm as X,bW as J,bq as Q,bf as Z,bg as tt,bO as et,bX as nt}from"./7f3d7ca9.js";import{B as at,a as it}from"./4eb8d874.js";import{B as st}from"./40b41b3c.js";import{B as ot,h as rt,b as lt}from"./30ef6f1f.js";import{B as ct,a as dt,c as mt}from"./ff7f0130.js";import{B as ut,a as pt,b as ht}from"./e3d898b2.js";import{B as yt,b as vt}from"./41ed0536.js";class gt extends X{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`flexible-financings/v${this.version}/financing-lines/{financing-line-id}/payments`)}toString(){return super.toString("BGADPFlexibleFinancingsFinancingLinesFinancingLinePaymentsPostV0")}}class _t extends X{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`flexible-financings/v${this.version}/financing-lines/{financing-line-id}/payments/simulate`)}toString(){return super.toString("BGADPFlexibleFinancingsFinancingLinesFinancingLinePaymentsSimulatePostV0")}}class bt extends J{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`flexible-financings/v${this.version}/microloans/{microloan-id}/payments`)}toString(){return super.toString("BGADPFlexibleFinancingsMicroloansMicroloanPaymentsGetV0")}}class ft extends X{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`flexible-financings/v${this.version}/microloans/{microloan-id}/payments`)}toString(){return super.toString("BGADPFlexibleFinancingsMicroloansMicroloanPaymentsPostV0")}}class St extends X{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`flexible-financings/v${this.version}/microloans/{microloan-id}/payments/simulate`)}toString(){return super.toString("BGADPFlexibleFinancingsMicroloansMicroloanPaymentsSimulatePostV0")}}class xt extends J{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`flexible-financings/v${this.version}/microloans/{microloan-id}/specific-amounts`)}toString(){return super.toString("BGADPFlexibleFinancingsMicroloansMicroloanSpecificAmountsGetV0")}}class At extends Q{static get is(){return"bbva-global-microloan-payments-api-dm"}static get properties(){return{microloanPayments:{type:Array,attribute:!1}}}constructor(){super(),this.microloanPayments=[]}resetMicroloanPayments(){this.microloanPayments=[]}getMicroloanPayments(t,e={}){if(Object.keys(this.microloanPayments).length)return;e=Object.assign({"microloan-id":t},e),this._generateGetService(this._getService("get",{},e),{customEvent:"microloan-payments-api-dm-fetch",paginationEvent:"microloan-payments-api-dm-pagination",errorFireEventHandler:"microloan-payments-api-dm-fetch-error"},this._responseMapping,e.fields,this._paginationMapping)}postMicroloanPayments(t,e){const n={"microloan-id":t};this._generateGetService(this._getService("post",e,n),{customEvent:"microloan-payments-api-dm-create",errorFireEventHandler:"microloan-payments-api-dm-create-error"},this._responseMapping),this.resetMicroloanPayments()}_getService(t,e={},n={}){const a=this._getServiceParams(n,e);return this._getServicePath(`${t}MicroloanPayments`,this._getBgadp(a))}_getBgadp(t){return{getMicroloanPaymentsV0:()=>new bt(t),postMicroloanPaymentsV0:()=>new ft(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}_paginationMapping(t){return t}}class Tt extends Q{static get is(){return"bbva-global-financing-line-payments-api-dm"}constructor(){super()}postFinancingLinePayments(t,e){const n={"financing-line-id":t};this._generateGetService(this._getService("post",e,n),{customEvent:"financing-line-payments-api-dm-create",errorFireEventHandler:"financing-line-payments-api-dm-create-error"},this._responseMapping)}_getService(t,e={},n={}){const a=this._getServiceParams(n,e);return this._getServicePath(`${t}FinancingLinePayments`,this._getBgadp(a))}_getBgadp(t){return{postFinancingLinePaymentsV0:()=>new gt(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}}class $t extends Q{static get is(){return"bbva-global-financing-line-payments-simulate-api-dm"}static get properties(){return{financingLinePaymentsSimulate:{type:Object,attribute:!1}}}constructor(){super(),this.financingLinePaymentsSimulate={}}resetFinancingLinePaymentsSimulate(){this.financingLinePaymentsSimulate={}}postFinancingLinePaymentsSimulate(t,e){if(Object.keys(this.financingLinePaymentsSimulate).length)return;const n={"financing-line-id":t};this._generateGetService(this._getService("post",e,n),{customEvent:"financing-line-payments-simulate-api-dm-fetch",errorFireEventHandler:"financing-line-payments-simulate-api-dm-fetch-error"},this._responseMapping)}_getService(t,e={},n={}){const a=this._getServiceParams(n,e);return this._getServicePath(`${t}FinancingLinePaymentsSimulate`,this._getBgadp(a))}_getBgadp(t){return{postFinancingLinePaymentsSimulateV0:()=>new _t(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}}class Pt extends Q{static get is(){return"bbva-global-microloan-payments-simulate-api-dm"}static get properties(){return{microloanPaymentsSimulate:{type:Object,attribute:!1}}}constructor(){super(),this.microloanPaymentsSimulate={}}resetMicroloanPaymentsSimulate(){this.microloanPaymentsSimulate={}}postMicroloanPaymentsSimulate(t,e){if(Object.keys(this.microloanPaymentsSimulate).length)return;const n={"microloan-id":t};this._generateGetService(this._getService("post",e,n),{customEvent:"microloan-payments-simulate-api-dm-fetch",errorFireEventHandler:"microloan-payments-simulate-api-dm-fetch-error"},this._responseMapping)}_getService(t,e={},n={}){const a=this._getServiceParams(n,e);return this._getServicePath(`${t}MicroloanPaymentsSimulate`,this._getBgadp(a))}_getBgadp(t){return{postMicroloanPaymentsSimulateV0:()=>new St(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}}class Mt extends Q{static get is(){return"bbva-global-microloan-specific-amounts-api-dm"}static get properties(){return{microloanSpecificAmounts:{type:Array,attribute:!1}}}constructor(){super(),this.microloanSpecificAmounts=[]}resetMicroloanSpecificAmounts(){this.microloanSpecificAmounts=[]}getMicroloanSpecificAmounts(t,e={}){if(Object.keys(this.microloanSpecificAmounts).length)return;e=Object.assign({"microloan-id":t},e),this._generateGetService(this._getService("get",{},e),{customEvent:"microloan-specific-amounts-api-dm-fetch",errorFireEventHandler:"microloan-specific-amounts-api-dm-fetch-error"},this._responseMapping,e.fields)}_getService(t,e={},n={}){const a=this._getServiceParams(n,e);return this._getServicePath(`${t}MicroloanSpecificAmounts`,this._getBgadp(a))}_getBgadp(t){return{getMicroloanSpecificAmountsV0:()=>new xt(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}}class Et extends(t(e)){_mappingIndicators(t){t.map((t=>{this._removeFields(["name"],t),this._renameProperty(t,"indicatorId","id")}));for(let e=0;e<t.length;e++)"DESTINATION_IMMEDIATE_DEBIT"==t[e].id&&t.splice(e,1);return t}}class It{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(t,e){if(null===this)throw new TypeError('"this" is null or not defined');let n=Object(this),a=n.length>>>0;if(0===a)return!1;let i=0|e,s=Math.max(i>=0?i:a-Math.abs(i),0);for(;s<a;){if((o=n[s])===(r=t)||"number"==typeof o&&"number"==typeof r&&isNaN(o)&&isNaN(r))return!0;s++}var o,r;return!1}}),String.fromCodePoint||function(t){var e=function(e){for(var n=[],a=0,i="",s=0,o=arguments.length;s!==o;++s){var r=+arguments[s];if(!(r<1114111&&r>>>0===r))throw RangeError("Invalid code point: "+r);r<=65535?a=n.push(r):(r-=65536,a=n.push(55296+(r>>10),r%1024+56320)),a>=16383&&(i+=t.apply(null,n),n.length=0)}return i+t.apply(null,n)};try{Object.defineProperty(String,"fromCodePoint",{value:e,configurable:!0,writable:!0})}catch(t){String.fromCodePoint=e}}(String.fromCharCode)}_error(t=0,e="",n=null){throw t=`0000${t=t.toString()}`.substr(t.length),Error(`BGADP_ERROR_${t} :: ${e} :: ${n&&n.message}`)}}class Ct extends It{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(t="",e=""){if("string"==typeof t&&t)if(this._reservedKeys.includes(t))this._error(2,`"${t}" should NOT be a reserved key`);else{if("string"!=typeof e)try{e=JSON.stringify(e)}catch(t){this._error(1,`"${e}" couldn't be transformed into String`)}e=e.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[t]=e}else this._error(3,"Missing {item} parameter")}getItem(t=""){return this._items[t]?this._items[t]:null}removeItem(t=""){this._items.hasOwnProperty(t)&&delete this._items[t]}clear(){Object.keys(this._items).length&&(this._items={})}}const Ot=0,Lt=1,Rt="jwt",Dt="tsec",wt="none";class Nt extends It{constructor(t=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=Ot,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(t),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let t={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(t).forEach((e=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!1,value:t[e],writable:"_headers"!==e})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new Ct,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this)}_assignConfigValues(t=null){null!=t&&"object"==typeof t&&Object.keys(t).forEach((e=>{if(this.hasOwnProperty(e)&&"_"!==e.charAt(0)&&"function"!=typeof this[e])if("object"==typeof this[e])Array.isArray(t[e])?this[e]=Array.from(t[e]):null===this[e]?this[e]=t[e]:this[e]=Object.assign(this[e]||{},t[e]);else this[e]=t[e];else"signatureRequiredErrors"===e?this._ERROR_CODES.SIGNATURE_REQUIRED=t[e]:"signatureInvalidErrors"===e?this._ERROR_CODES.SIGNATURE_INVALID=t[e]:"signatureFirstErrorCode"===e?this._ERROR_CODES.SIGNATURE_FIRST_STEP=t[e]:"pendingProcessResponseErrors"===e?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=t[e]:"signatureInvalidStatus"===e?this._STATUS_CODES.SIGNATURE_INVALID=t[e]:"pendingProcessResponseStatus"==e?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=t[e]:"getTokenHandlerKey"===e?this.getTokenHandlerKey=t[e]:("function"==typeof this[e]&&this._error(1,`${e} is a class method, can't be override`),"_"===e.charAt(0)&&this._error(2,`"${e}" is a restricted property, can't be override`),this.hasOwnProperty(e)||this._error(3,`"${e}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=Dt:this.requiredToken=wt,this.requiresJWT=!1):this.requiredToken===Dt?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===Rt?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===wt?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(Dt)}_setJwtHandler(){this._setTokenHandler(Rt)}_setTokenHandler(t){const e=`${t}Handler`;this[e]=this[e]||window.sessionStorage;try{this[e].setItem("test","test"),this[e].removeItem("test")}catch(t){this._error(4,`Invalid [${e}]. If not specified, default window.sessionStorage can't be written/read`,t)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(t=""){t&&"string"==typeof t?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:t,writable:!1}):this._error(6,"[path] is required")}_buildPromise(t=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let e={isPending:!0};e.promise=new window.Promise(((n,a)=>{e=Object.assign(e,{resolve:n,reject:a}),this._buildRequest(t)})),this._promise=Object.assign({},e)}return this._promise.promise}_defaultXHR(t=""){let e=new window.XMLHttpRequest;if(e instanceof window.XMLHttpRequest){e.withCredentials=this.withCredentials,e.timeout=1e3*this.timeout,e.onreadystatechange=this._onReadyStateChange.bind(this),e.responseType=this.responseType,e.open(this.method.toUpperCase(),t);let n=this._getRequestHeaders();Object.keys(n).forEach((t=>{this.forceBoundary&&this.multipart&&"Content-Type"===t||e.setRequestHeader(t,n[t])})),e.send(this._buildBody())}return e}_nativeXHR(t=""){let e=this._buildNativeRequest();return e?(e=e[this.method.toLowerCase()],"function"==typeof e?e=e({url:t,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),e}_buildNativeRequest(){let t=null;return!!window.CellsNativePlugins&&(t=n),t}_buildRequest(t=!1){let e=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const t={url:e,path:this._path,method:this.method};this._emitRequestEvent("start",t)}if(!t&&this._cacheItem&&e===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!t&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:e,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(e);break;case this._NATIVE_XHR:this._request=this._nativeXHR(e)}return this._request}_buildURL(){let t=[this.host,this._path].join("/");if(null!==this.params){let e=Object.assign({},this.params);-1!==t.lastIndexOf("{")&&(t=t.replace(/(\{[\w\-]+\})/g,(t=>{let n=t.replace(/[\{\}]+/g,""),a=e[n];return a?delete e[n]:this._error(9,`Missing ${n} param value`),a})),-1!==t.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let n=Object.keys(e);n.length&&(t=[t,n.map((t=>{let n=e[t];return Array.isArray(n)&&this.paramArrayMode===Lt?this._arrayToQueryParam(t,n):`${t}=${n}`})).join("&")].join("?"))}return t}_arrayToQueryParam(t,e){return e.map((e=>`${t}=${e}`)).join("&")}_getRequestHeaders(){let t=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(t=this._getTokenForRequestHeaders(Dt,t)),!0===this.requiresJWT&&(t=this._getTokenForRequestHeaders(Rt,t)),!0===this.semaasMonitoring){let e=this._getSemaasHeaders();Object.assign(t,e)}const e=this._getCustomHeaders();return Object.assign(t,e),t}_getSemaasHeaders(){var t={};if(window.sessionStorage){var e=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(n){var a=e.getItem(n);a&&"null"!==a&&(t[n]=a)}))}return t}_getCustomHeaders(){const t="x-bgadp-";let e={};if(window.sessionStorage){const n=window.sessionStorage;e=Object.keys(n).filter((e=>e.startsWith(t))).reduce(((e,a)=>(e[a.replace(t,"")]=n.getItem(a),e)),{})}return e}_getTokenForRequestHeaders(t,e){const n=`${t}Handler`,a=t===Rt?"JWT ":"",i=t===Rt?"Authorization":Dt;if(void 0===this[n]||null===this[n])this._error(11,`${t} handler is undefined`);else{const s=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):t;let o=this[n].getItem(s);o?e[i]=e[i]||a+o:this._error(12,`Missing '${t}' value`)}return e}_buildBody(){let t=this.body;if(t&&this._xhrType===this._DEFAULT_XHR){let e=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===e){let e=[];Object.keys(t).forEach((n=>{e.push(`${n}=${t[n]}`)})),t=e.join("&")}else this.headers&&-1!==e.indexOf("multipart/")||(t=JSON.stringify(t))}return t}_onReadyStateChange(){let t=this._request;if(t&&t.readyState===window.XMLHttpRequest.DONE)switch(t.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(t);break;default:this._onRequestFail(t)}}_extractRequestResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)e={result:e};else if(e&&e instanceof ArrayBuffer)try{const t=this._decode(e);try{e=JSON.parse(t)}catch(n){e={result:t,originalResponse:e}}}catch(t){e=null}else if(e&&"string"==typeof e)try{e=JSON.parse(e)}catch(t){e=null}return e}async _extractRequestErrorResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)try{const t=await this._blobDecode(e);try{e=JSON.parse(t)}catch(n){e={result:t,originalResponse:e}}}catch(t){e=null}else e=this._extractRequestResponse(t);return e}_blobDecode(t){const e=new FileReader;let n;const a=new Promise(((t,e)=>{n=(n,a)=>{n?e(n):t(a)}}));return e.addEventListener("loadend",(function t(a){e.removeEventListener("loadend",t),a.error?n(a.error):n(null,e.result)})),e.readAsText(t),a}_decode(t){let e;if("function"==typeof TextDecoder){e=new TextDecoder("utf-8").decode(t)}else{let n=0;for(;n<t.length;){let a=t[n],i=0,s=0;if(a<=127?(i=0,s=255&a):a<=223?(i=1,s=31&a):a<=239?(i=2,s=15&a):a<=244&&(i=3,s=7&a),t.length-n-i>0){let e=0;for(;e<i;)a=t[n+e+1],s=s<<6|63&a,e+=1}else s=65533,i=t.length-n;e+=String.fromCodePoint(s),n+=i+1}}return e}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let t=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(t=window.btoa(t)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,t);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,t);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,t);case this._CACHE_NONE:}}catch(t){this._error(13,`Can't write into cache engine: ${t.message}`,t)}}_retrieveFromCache(){let t;try{switch(this._cache){case this._CACHE_MEMORY:t=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:t=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:t=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(t){this._error(14,"Can't read from cache engine",t)}return t&&(this.encodeCache&&(t=window.atob(t)),"string"==typeof t&&/[\{\[]/.test(t.charAt(0))&&(t=JSON.parse(t))),t}_setLastResponse(t=null){t&&(this._lastResponse=Object.assign({},t))}_setLastResponseHeaders(t=null){let e={};t&&(t instanceof window.XMLHttpRequest?e=this._parseResponseHeadersToObject(t.getAllResponseHeaders()):t.headers&&(e=JSON.parse(t.headers))),this._lastResponseHeaders=e}_parseResponseHeadersToObject(t){let e={},n=t.trim().split(/[\r\n]+/);for(const t in n)if(n.hasOwnProperty(t)&&""!==n[t]){let a=": ",i=n[t].split(a);e[i.shift().toLowerCase()]=i.join(a)}return e}_onRequestSuccess(t=null){this._setLastResponse(this._extractRequestResponse(t)),this._setLastResponseHeaders(t),this.jwtHandler&&this._storeToken(this.jwtHandler,t,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,t,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",t)}_storeToken(t,e,n,a){let i=null;switch(this._xhrType){case this._DEFAULT_XHR:e&&e.getAllResponseHeaders&&e.getResponseHeader&&e.getAllResponseHeaders().indexOf(a)>=0&&(i=e.getResponseHeader(a));break;case this._NATIVE_XHR:e&&e.headers&&(i=JSON.parse(e.headers)[a])}if(i){const e=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):n;t.getItem(e)!==i&&(t.setItem(e,i),this._emitTokenUpdate(n,i))}}_emitTokenUpdate(t,e){if(this.htmlContext){const n=new CustomEvent("token-update",{bubbles:!0,detail:{type:t,token:e}});this.htmlContext.dispatchEvent(n)}}_emitRequestEvent(t,e){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${t}`,{bubbles:!0,composed:!0,detail:{metadata:e}})):console.warn(`Missing htmlContext to dispatch event http-request-${t}`)}_onRequestFail(t=null){(async()=>{if(!this._isSignatureRequired(t)&&!this._isWaitingForProcessResponse(t)){let e=await this._extractRequestErrorResponse(t);this._setLastResponse(e),this._setLastResponseHeaders(t),this._onRequestEnd("reject",t)}})()}_onRequestEnd(t="resolve",e=null){if(this._resetDPState(),this.emitRequestEvents){const t={method:this.method,path:this._path};null!==e&&(t.status=e.status,t.url=e.responseURL),this._emitRequestEvent("end",t)}this._promise&&"function"==typeof this._promise[t]&&(this._promise.isPending=!1,this._promise[t](e))}_resetDPState(){["Data","Type","State"].forEach((t=>{let e=`Authentication${t}`;this._headers&&this._headers.hasOwnProperty(e)&&delete this._headers[e],this.headers&&this.headers.hasOwnProperty(e)&&delete this.headers[e]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(t=null){let e,n,a,i,s;if(t instanceof window.XMLHttpRequest)e=t.getResponseHeader("AuthenticationType"),n=t.getResponseHeader("AuthenticationData"),a=t.getResponseHeader("AuthenticationState"),i=t.getResponseHeader("AuthenticationChallenge"),s=t.getResponseHeader("AuthenticationResponse");else{let o=JSON.parse(t.headers);e=o.authenticationtype,n=o.authenticationdata||null,a=o.authenticationstate,i=o.authenticationchallenge,s=o.authenticationresponse}return{type:e,data:n,state:a,challenge:i,response:s}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureTypeChange(t,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureValueChange(t,...arguments)}})}_onSignatureTypeChange(t="",e="",n=""){if("string"==typeof t&&""!==t)if(e.includes(t)){if("string"==typeof t&&""!==t){const a=this._getSignatureData(t,e,n);this.headers=Object.assign(this.headers||{},{AuthenticationType:t,AuthenticationData:a}),this._buildRequest()}}else this._error(15,`${t} is not a valid signature type`);"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(t=null,e="",n="",a=""){let i;if("object"==typeof t&&t){const s=this._getSignatureData(t.signatureType,e,n);i=this._makeKeyValuePairFromObject(s,t.signatureValue),t.challenge&&(i+=`,challenge=${t.challenge}`),this._buildSignatureHeaders(i,t.signatureType,a)}else"string"==typeof t&&""!==t&&(this._hasSignatureAuthenticationType(e,"2")?(i=`password=${t}`,this._buildSignatureHeaders(i,"2",a)):(i=`${n}=${t}`,this._buildSignatureHeaders(i,e,a)));"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(t="",e=""){if(!t)return"";let n,a=t.split(",");if(a.length>1){n=a.map((t=>`${t}=${e[t]}`)).join(",")}else n=`${t}=${e}`;return n}_hasSignatureAuthenticationType(t,e){return-1!==t.split(";").findIndex((t=>t===e))}_buildSignatureHeaders(t="",e="",n=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:t,AuthenticationType:e||""}),n&&(this.headers=Object.assign(this.headers,{AuthenticationState:n})),this._buildRequest()}_isSignatureRequired(t=null){const e=Number((t||{}).status);let n=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(e)){const e=this._extractRequestResponse(t),a=this._extractResponseErrorCode(e),i=this._ERROR_CODES.SIGNATURE_INVALID.includes(a),{type:s,data:o,state:r,challenge:l,response:c}=this._extractSignatureResponseHeaders(t),d=this._getRequestMetadata(t);if(i)this._notifySignatureInvalid(d),n=!0;else if(s)if(e){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(a)?(this._notifySignatureTypeUsingErrorCode(a,d,s,o,r,l,c),n=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(d,s,o,r,l,c),n=!0}return n}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(t=null){const e=Number((t||{}).status);let n=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(e)){const e=this._extractRequestResponse(t),a=this._extractResponseErrorCode(e),i=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(a),s=this._getRequestMetadata(t);i&&(this._notifyWaitingForProcessResponse(s),n=!0)}return n}_notifySignatureRequiredFirstStep(t,e,n,a){this._defineSignatureType(e,n),this._defineSignatureValue(e,n,a),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:e,data:n,metadata:t}}))}_notifySignatureRequired(t,e,n,a,i,s){this._defineSignatureValue(e,n,a);const o={type:e,data:n,challenge:i,metadata:t};s&&(o.response=s),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:o}))}_notifySignatureInvalid(t){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:t}}))}_notifyWaitingForProcessResponse(t){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:t}}))}_getRequestMetadata(t){const{responseURL:e,status:n}=t;return{path:this._path,method:this.method,url:e,status:n}}_emitEvent(t){this.htmlContext?this.htmlContext.dispatchEvent(t):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(t="",e="",n=""){const a=e.split(";").findIndex((e=>e===t));return n?n.split(";")[a]:""}toString(t=""){return`[object ${t||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(t=!1){return this._buildPromise(t)}_extractResponseErrorCode(t){return t?t["error-code"]||t.messages&&t.messages[0].code:null}_notifySignatureTypeUsingHeaders(t,e,n,a,i,s){a?this._notifySignatureRequired(t,e,n,a,i,s):this._notifySignatureRequiredFirstStep(t,e,n,a)}_notifySignatureTypeUsingErrorCode(t,e,n,a,i,s,o){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(t)?this._notifySignatureRequiredFirstStep(e,n,a,i):this._notifySignatureRequired(e,n,a,i,s,o)}}class Ft extends Nt{constructor(t=null){super(Object.assign(t||{},{method:"GET"}))}toString(t=""){return super.toString(t||"BGADPRequestGET")}}class kt extends Nt{constructor(t=null){super(Object.assign(t||{},{method:"POST"}))}toString(t=""){return super.toString(t||"BGADPRequestPOST")}}class Bt extends Ft{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts`)}toString(){return super.toString("BGADPAccountsGetV0")}}class jt extends kt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts`)}toString(){return super.toString("BGADPAccountsPostV0")}}class Vt extends Ft{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/limits`)}toString(){return super.toString("BGADPAccountsAccountLimitsGetV0")}}class Ht extends Ft{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/transactions`)}toString(){return super.toString("BGADPAccountsAccountTransactionsGetV0")}}class qt extends Et{static get is(){return"bbva-global-accounts-base-api-dm"}resetAccounts(){this.accounts=[]}getAccounts(t){this._paramsMapping(t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields,this._paginationMapping)}postAccounts(t){this._requestMapping(t),this._generateGetService(this._getService("post",t),this.constructor.POST_EVENTS,this._responseMapping),this.resetAccounts()}_getService(t,e={},n={}){const a=this._getServiceParams(n,e);return this._getServicePath(`${t}Accounts`,this._getBgadp(a))}_getBgadp(t){return{getAccountsV1:()=>new st(t),getAccountsV0:()=>new Bt(t),postAccountsV0:()=>new jt(t),postAccountsV1:()=>new at(t),default:()=>"BGADP does not exist."}}_paramsMapping(t){return"0"==this.version?(this._renameProperty(t,"currency","currencies.currency"),this._renameProperty(t,"indicators.id","indicators.indicatorId"),t):t}_responseMapping(t){if(Array.isArray(t)){if("0"==this.version&&Object.keys(t).length)for(let e=0;e<t.length;e++)this._renameProperty(t[e],"accountId","id"),this._renameProperty(t[e],"title","product"),this._removeFields(["bank","commercialPackage","joint","alias","openingDate","currencies","disposedBalance","image","meta","offerId","delivery","accountAgreement"],t[e]),this._removeFields(["previousMonthAverageBalance"],t[e].availableBalance),this._removeFields(["subType"],t[e].accountType),this._removeFields(["reason","reasonDescription"],t[e].status),t[e].indicators&&t[e].indicators.length&&(t[e].indicators=this._mappingIndicators(t[e].indicators));return t}return this._postResponseMapping(t)}_postResponseMapping(t){return"0"==this.version&&Object.keys(t).length&&(this._renameProperty(t,"accountId","id"),t.customizedFormats&&t.customizedFormats.forEach((t=>{this._renameProperty(t,"customizedFormatId","id")})),this._renameProperty(t,"joint","jointSignatureType"),this._renameProperty(t,"title","product"),t.bank&&(this._renameProperty(t.bank,"bankId","id"),this._renameProperty(t.bank.branch,"branchId","id")),t.participants.forEach((t=>{var e;this._renameProperty(t,"participantId","id"),"NATURAL_PERSON"===t.personType?(t.customDetails={personType:"NATURAL_UNKNOWN"},t.firstName&&(t.customDetails={...t.customDetails,firstName:t.firstName}),t.middleName&&(t.customDetails={...t.customDetails,middleName:t.middleName}),t.lastName&&(t.customDetails={...t.customDetails,lastName:t.lastName}),t.secondLastName&&(t.customDetails={...t.customDetails,secondLastName:t.secondLastName}),t.identityDocument&&(t.customDetails.identityDocuments=[{documentNumber:t.identityDocument.documentNumber,documentType:{id:t.identityDocument.documentType}}]),this._removeFields(["personType","firstName","middleName","lastName","secondLastName","identityDocument"],t)):"LEGAL_PERSON"===t.personType&&(t.customDetails={personType:"LEGAL_UNKNOWN"},t.legalName&&(t.customDetails={...t.customDetails,legalName:t.legalName}),t.identityDocument&&(t.customDetails.businessDocuments=[{documentNumber:t.identityDocument.documentNumber,documentType:{id:t.identityDocument.documentType}}]),this._removeFields(["personType","legalName","identityDocument"],t)),null!==(e=t.participantType)&&void 0!==e&&e.order&&(t.order=t.participantType.order,this._removeFields(["order"],t.participantType)),this._removeFields(["suffix","documents"],t)})),t.conditions&&t.conditions.forEach((t=>{this._renameProperty(t,"conditionId","id"),this._removeFields(["period","facts","outcomes"],t)})),t.delivery&&(t.deliveries=t.delivery,this._removeFields(["delivery"],t),t.deliveries.forEach((t=>{"VIRTUAL"===t.deliveryType?t.method="DIGITAL":"PHYSICAL"===t.deliveryType&&(t.method="STANDARD"),t.address&&this._renameProperty(t.address,"addressType","deliveryAddressType"),t.destination.branch&&(t.destination.bank={branch:t.destination.branch},this._removeFields(["branch"],t.destination)),t.contactDetails[0].contactDetail&&t.contactDetails[0].contactDetail.contactDetailId&&(t.contactDetails={id:t.contactDetails[0].contactDetail.contactDetailId,deliveryContactType:"STORED"}),t.documentType&&(t.serviceType={id:t.documentType},this._removeFields(["documentType"],t)),this._removeFields(["deliveryType"],t)}))),t.fees&&t.fees.itemizeFees.forEach((t=>{this._renameProperty(t,"name","description"),t.itemizeFeeUnits=[{unitType:"AMOUNT",amount:t.feeAmount.amount,currency:t.feeAmount.currency}],t.feeAmount.percentage&&t.itemizeFeeUnits.push({unitType:"PERCENTAGE",percentage:t.feeAmount.percentage}),this._removeFields(["feeAmount"],t)})),t.rates&&t.rates.forEach((t=>{t.itemizeRates=[{rateType:t.rateType.id,itemizeRateUnits:[t.unit]}],this._renameProperty(t.itemizeRates[0].itemizeRateUnits[0],"mode","unitType"),t.rateType.name&&(t.itemizeRates=[{...t.itemizeRates[0],description:t.rateType.name}]),this._removeFields(["rateType","unit"],t)})),t.operationNumber&&(t.operationTracking={operationNumber:t.operationNumber}),t.relatedContracts&&t.relatedContracts.forEach((t=>{this._renameProperty(t.relationType,"name","description"),t.contractDetails={number:t.number,contractType:"INTERNAL_CONTRACT"},this._removeFields(["number"],t)})),this._removeFields(["businessType","operationNumber","accountFamily","billingInformation","offerId"],t)),t}_requestMapping(t){return"0"==this.version&&(t.bank&&(this._renameProperty(t.bank,"id","bankId"),this._renameProperty(t.bank.branch,"id","branchId")),this._renameProperty(t,"jointSignatureType","joint"),this._renameProperty(t,"product","title"),this._removeFields(["subproduct"],t.title),t.limits&&t.limits.forEach((t=>{this._renameProperty(t,"id","limitId")})),t.indicators&&t.indicators.forEach((t=>{this._renameProperty(t,"id","indicatorId")})),t.participants.forEach((t=>{var e,n,a,i,s,o;null!==(e=t.customDetails)&&void 0!==e&&e.firstName&&(t.firstName=t.customDetails.firstName),null!==(n=t.customDetails)&&void 0!==n&&n.middleName&&(t.middleName=t.customDetails.middleName),null!==(a=t.customDetails)&&void 0!==a&&a.lastName&&(t.lastName=t.customDetails.lastName),null!==(i=t.customDetails)&&void 0!==i&&i.secondLastName&&(t.secondLastName=t.customDetails.secondLastName),null!==(s=t.customDetails)&&void 0!==s&&s.identityDocuments?t.identityDocument={documentNumber:t.customDetails.identityDocuments[0].documentNumber,documentType:t.customDetails.identityDocuments[0].documentType.id}:null!==(o=t.customDetails)&&void 0!==o&&o.businessDocuments&&(t.identityDocument={documentNumber:t.customDetails.businessDocuments[0].documentNumber,documentType:t.customDetails.businessDocuments[0].documentType.id}),this._removeFields(["customDetails"],t)})),t.conditions&&t.conditions.forEach((t=>{this._renameProperty(t,"id","conditionId"),this._removeFields(["isNegotiable","conditionType","formats"],t)})),this._removeFields(["contractDetails"],t.relatedContracts),t.deliveries&&(t.delivery=t.deliveries,this._removeFields(["deliveries"],t),t.delivery.forEach((t=>{if(this._renameProperty(t,"method","deliveryType"),"DIGITAL"===t.deliveryType?t.deliveryType="VIRTUAL":"STANDARD"===t.deliveryType?t.deliveryType="PHYSICAL":this._removeFields(["deliveryType"],t),t.destination.bank&&(t.destination={...t.destination,branch:t.destination.bank.branch},this._removeFields(["bank"],t.destination)),t.contactDetails&&"STORED"===t.contactDetails.deliveryContactType){let e=[{contactDetail:{contactDetailId:t.contactDetails.id}}];t.contactDetails=e}else this._removeFields(["contactDetails"],t);t.address&&"STORED"===t.address.deliveryAddressType?this._renameProperty(t.address,"deliveryAddressType","addressType"):this._removeFields(["address"],t),this._removeFields(["deliverySchedules","serviceType","packagingtype"],t)})))),t}_paginationMapping(t){return t}}a(qt,"GET_EVENTS",{customEvent:"accounts-api-dm-fetch",paginationEvent:"accounts-api-dm-pagination",errorFireEventHandler:"accounts-api-dm-fetch-error"}),a(qt,"POST_EVENTS",{customEvent:"accounts-api-dm-create",errorFireEventHandler:"accounts-api-dm-create-error"}),customElements.define(qt.is,qt);class zt extends Et{static get is(){return"bbva-global-accounts-api-dm"}static get properties(){return{accounts:{type:Array,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object}}}constructor(){super(),this.accounts=[],this.country="",this.localCustomProperties={},this._countries=["Mx"],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages"],this._modules={Mx:()=>import("./322b45ee.js")}}update(t){super.update(t),t.forEach(((t,e)=>{"country"===e&&this.country&&this.country!==t?this._loadModule():"_module"!==e&&this._module&&this[e]!==t&&(this._module[e]=this[e])}))}async _loadModule(){const t=this._capitalize(this.country);if(this._countries.includes(t)&&this._modules[t]){const e=`BbvaAccounts${t}ApiDm`;(0,this._modules[t])().then((async t=>{const n=t[e].is;this._module=this._createModuleElement(n),await this.updateComplete,this._dispatchEvent("bbva-global-accounts-api-dm-module-load")})).catch((async t=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-accounts-api-dm-module-error",t)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(t){return t.charAt(0).toUpperCase()+t.slice(1).toLowerCase()}_createModuleElement(t=qt.is){const e=document.createElement(t);return this._bindConfig(e),e}async _bindConfig(t){this._configProperties.forEach((e=>{t[e]=this[e]})),await this.updateComplete}_dispatchEvent(t,e=!0){this.dispatchEvent(new CustomEvent(t,{detail:e,bubbles:!0,composed:!0}))}async resetAccounts(){await this.module.updateComplete,this.module.resetAccounts()}async getAccounts(t={}){await this.module.updateComplete,Object.keys(this.accounts).length||this.module.getAccounts(t)}async postAccounts(t){await this.module.updateComplete,this.module.postAccounts(t)}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return i` ${this._module?this._module:""}`}}class Gt extends Et{static get is(){return"bbva-global-account-transactions-base-api-dm"}resetAccountTransactions(){this.accountTransactions=[]}getAccountTransactions(t,e){this._paramsMapping(e),e=Object.assign({"account-id":t},e),this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields)}_getService(t,e={},n={}){const a=this._getServiceParams(n,e);return this._getServicePath(`${t}AccountTransactions`,this._getBgadp(a))}_getBgadp(t){return{getAccountTransactionsV2:()=>new s(t),getAccountTransactionsV0:()=>new Ht(t),default:()=>"BGADP does not exist."}}_paramsMappingCanonical(t){if("0"==this.version){this._removeFields(["customerId"],t),t["transactionType.id"]&&(t["transactionType.id"]=t["transactionType.id"].toString()),t["status.id"]&&(t["status.id"]=t["status.id"].toString());let e=Object.keys(t);for(let n=0;n<e.length;n++){let a=e[n];if("operationAmount.id"===a&&"LOCAL_AMOUNT"===t[a])for(let n=0;n<e.length;n++)"operationAmount.fromAmount"===e[n]?this._renameQueryParam(t,"operationAmount.fromAmount","fromLocalAmount.amount"):"operationAmount.toAmount"===e[n]?this._renameQueryParam(t,"operationAmount.toAmount","toLocalAmount.amount"):"operationAmount.currency"===e[n]&&this._renameQueryParam(t,"operationAmount.currency","localAmount.currency");this._removeFields(["operationAmount.id","operationAmount.fromAmount","operationAmount.toAmount","operationAmount.currency"],t)}}return t}_renameQueryParam(t,e,n){e in t&&(t[n]=t[e],delete t[e])}_paramsMapping(t){return this._paramsMappingCanonical(t),t}responseMappingCanonical(t){if("0"==this.version&&Object.keys(t).length)for(let e=0;e<t.length;e++){this._renameProperty(t[e],"valuationDate","valueDate"),this._renameProperty(t[e].contract.numberType,"name","description"),this._removeFields(["category","exchangeRate","fundsOrigin"],t[e]),this._removeFields(["product","bank"],t[e].contract),this._removeFields(["description"],t[e].transactionType),this._removeFields(["updateDate"],t[e].status);const n=t[e].classification;n&&(this._removeFields(["pfmId","customName"],n),this._removeFields(["customName"],n.category),this._removeFields(["customName"],n.category.subcategory));const a=t[0].additionalInformation;this._removeFields(["postedBalance","reportingBalance","authorizedBalance","hold"],a),a&&a.branch&&(t[e].branch={id:a.branch.id,name:a.branch.name},this._removeFields(["branch"],a)),a&&a.updatedBalance&&(a.balances=[{id:"UPDATED_BALANCE",amount:a.updatedBalance.amount,currency:a.updatedBalance.currency}],this._removeFields(["updatedBalance"],a)),t[e].localAmount&&(t[e].operationAmounts=[{id:"LOCAL_AMOUNT",amount:t[e].localAmount.amount,currency:t[e].localAmount.currency}],this._removeFields(["localAmount"],t[e]));const i=t[e].operationAmounts[0];t[e].originAmount&&(t[e].operationAmounts=[i,{id:"ORIGIN_AMOUNT",amount:t[e].originAmount.amount,currency:t[e].originAmount.currency}],this._removeFields(["originAmount"],t[e]))}return t}_responseMapping(t){return this.responseMappingCanonical(t),t}}a(Gt,"GET_EVENTS",{customEvent:"account-transactions-api-dm-fetch",paginationEvent:"account-transactions-api-dm-pagination",errorFireEventHandler:"account-transactions-api-dm-fetch-error"}),customElements.define(Gt.is,Gt);const Ut={0:"notCategorizable",1:"cash",2:"saving",3:"taxes",4:"associations",6:"health",7:"shopping",8:"education",9:"bank",10:"home",11:"leisure",15:"transportation",16:"travel",17:"paycheck",18:"check",19:"otherIncome",20:"investment",21:"financing",999:"notCategorizable",9999:"toCategorize"},Wt={notCategorizable:["0","998","999"],cash:["42","44","46","51"],bizum:["78"],toCategorize:["9998","9999"],paycheck:["41","96","97"],check:["98","99"],otherIncome:["43","50","100","101","102"],saving:["4","10","103","104"],investment:["6","11","105","106","107","110"],financing:["7"],taxes:["1","2","3"],associations:["12","13","81"],health:["23","64","65","7","69"],shopping:["24","25","27","28","30","63","87","88","109"],education:["31","32","33","34","82"],bank:["14","16","18","19","21","35","59","61","62","70","77","108"],home:["36","37","38","39","40","68","76","83","84","85"],leisure:["52","53","54","55","56","86"],transportation:["67","72","73","74","75","92","93","94","95"],travel:["57","58","71","89","90","91"]};class Yt extends(o(Gt)){static get is(){return"bbva-account-transactions-es-api-dm"}static get properties(){return{_financingTypeId:{type:String}}}static get scopedElements(){const t=[l];return Yt.scopedElementsFromClasses(t)}render(){return i` ${this.accountTransactionsDM} `}constructor(){super(),this._financingTypeId=""}get accountTransactionsDM(){return i`
      <bbva-core-generic-dp
        id="accountTransactions"
        requiresToken
        cross-domain
        .host="${this.host}"
        .path="${this.path}"
        headers="${r(((t,e)=>{let n={};if(t.includes("ASO")){const t="x-dm-local-",e=window.sessionStorage;n=Object.keys(e).filter((e=>e.startsWith(t))).reduce(((n,a)=>(n[a.replace(t,"")]=e.getItem(a),n)),{})}return JSON.stringify({...e,...n})})(this.host,this.headers))}"
        method="${this.method}"
        @request-success="${this._handleLocalDMSuccess}"
        @request-error="${this._handleLocalDMError}"
      >
      </bbva-core-generic-dp>
    `}_handleLocalDMSuccess(t){const e=this._formatData(t.detail);this.dispatchEvent(new CustomEvent("account-transactions-api-dm-fetch",{bubbles:!0,composed:!0,detail:e})),this.dispatchEvent(new CustomEvent("api-dm-response",{bubbles:!0,composed:!0,detail:!0}))}_handleLocalDMError(t){this._handleError("account-transactions-api-dm-fetch-error",this.shadowRoot.getElementById("accountTransactions"))(t.detail)}_requestAccountTransactions(t,e){var n;const a=this.shadowRoot.getElementById("accountTransactions"),i=e.moneyFlow?{INCOME:"IN",EXPENSE:"OUT"}[e.moneyFlow.id]:"BOTH";this._financingTypeId=null==e||null===(n=e.financingType)||void 0===n?void 0:n.id,this._setGenericRequest({dm:a,path:"accountTransactions/V02/accountTransactionsAdvancedSearch",method:"post",params:e.pagination?`?paginationKey=${e.pagination}`:`?paginationKey=0&pageSize=${e.pageSize?e.pageSize:40}`,body:{accountContracts:[{contract:{id:t}}],customer:{id:this.localCustomProperties.customerId},filter:{dates:{from:e.filterDateFrom,to:e.filterDateTo},operationType:[i]},searchType:"SEARCH"}})}_filterFinancingData(t){const e={FINANCING_AVAILABLE:"SF"};return e[this._financingTypeId]?t.filter((t=>{var n;return(null==t||null===(n=t.financingData)||void 0===n?void 0:n.customizableIndicator)===e[this._financingTypeId]})):t}_formatingOperationAmounts(t){const e="ORIGIN_AMOUNT",n=null==t?void 0:t.amount;let a={};var i,s;n&&(a={id:"EUR"===(null===(i=n.currency)||void 0===i?void 0:i.code)?"CONTRACT_AMOUNT":e,amount:null==n?void 0:n.amount,currency:null==n||null===(s=n.currency)||void 0===s?void 0:s.id});let o={};if(null!=t&&t.wireTransactionDetail){const{wireTransactionDetail:n}=t;o={id:e,amount:n.payment.amount,currency:n.payment.currency.id}}const r=0===Object.keys(a).length,l=0===Object.keys(o).length;return r&&l?null:r?[o]:l?[a]:[a,o]}_formatData(t){const e=this._filterFinancingData(t.accountTransactions).map((t=>{var e,n;return{id:t.id,operationAmounts:this._formatingOperationAmounts(t),contract:{id:t.contract.id},moneyFlow:{id:(null==t||null===(e=t.amount)||void 0===e?void 0:e.amount)<0?"EXPENSE":"INCOME",name:(null==t||null===(n=t.amount)||void 0===n?void 0:n.amount)<0?"expense":"income"},classification:this._formatClassification(t),operationDate:t.transactionDate,valueDate:t.valueDate,concept:this._formatConcept(t.humanConceptName)}}));return t.pagination&&(t.pagination={links:{first:t.pagination.firstPage,...void 0!==t.pagination.lastPage&&{last:t.pagination.lastPage},...void 0!==t.pagination.previousPage&&{previous:t.pagination.previousPage},...void 0!==t.pagination.nextPage&&{next:t.pagination.nextPage}},page:t.pagination.page,totalPages:t.pagination.total,totalElements:t.totalResults,pageSize:t.pagination.pageSize}),this.dispatchEvent(new CustomEvent("account-transactions-api-dm-pagination",{bubbles:!0,composed:!0,detail:t.pagination})),e}_formatConcept(t){return t.charAt(0).toUpperCase()+t.slice(1).toLowerCase()}_formatClassification(t){var e,n;const a=null==t||null===(e=t.humanCategory)||void 0===e?void 0:e.id,i=null==t||null===(n=t.humanSubcategory)||void 0===n?void 0:n.id,s=Ut[a];var o;return{id:a,name:s,category:{id:a,name:s,subcategory:{id:i,name:(o=i,Object.keys(Wt).find((t=>Wt[t].includes(o))))}}}}async getAccountTransactions(t,e){this._requestAccountTransactions(t,e)}_setGenericRequest({dm:t,path:e,method:n,params:a,body:i}){return t.native=!1,t.requiresToken=!0,t.path=`${e}${a}`,t.method=n,t.body=i,t.generateRequest()}}customElements.define(Yt.is,Yt);class Kt extends Et{static get is(){return"bbva-global-account-limits-base-api-dm"}resetAccountLimits(){this.accountLimits=[]}getAccountLimits(t,e){e=Object.assign({"account-id":t},e),this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields)}_getService(t,e={},n={}){const a=this._getServiceParams(n,e);return this._getServicePath(`${t}AccountLimits`,this._getBgadp(a))}_getBgadp(t){return{getAccountLimitsV0:()=>new Vt(t),getAccountLimitsV2:()=>new it(t),default:()=>"BGADP does not exist."}}_responseMapping(t){return this._responseMappingCanonical(t),t}_responseMappingCanonical(t){"0"==this.version&&Object.keys(t).length&&t.map((t=>{this._renameProperty(t,"limitId","id"),this._removeFields(["name"],t)}))}}a(Kt,"GET_EVENTS",{customEvent:"account-limits-api-dm-fetch",errorFireEventHandler:"account-limits-api-dm-fetch-error"}),customElements.define(Kt.is,Kt);var Xt=c`
:host {
  display: block;
  box-sizing: border-box;
  padding-bottom: 0;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-expandable-step] {
  padding-bottom: 0.5rem;
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0;
}

.confirm-step {
  background-color: var(--_card-transaction-servicing-finance-transaction-advanced-payments-confirmation-bg);
  width: auto;
  padding-right: 1rem 0;
}

.panel-summary {
  margin: 1rem 0;
  display: flex;
  flex-direction: column;
  width: 100%;
  padding-right: 1rem;
}
.panel-summary [data-tag-name=bbva-type-amount] {
  margin-bottom: 1rem;
}
`,Jt=c`
:host {
  --_card-transaction-servicing-finance-transaction-advanced-payments-confirmation-bg: var(--card-transaction-servicing-finance-transaction-advanced-payments--_ambient--confirmation-bg,var(--card-transaction-servicing-finance-transaction-advanced-payments--custom--primary-ambient--confirmation-bg,${S("colorPrimarySurfaceAmbientDefault",x)}));
}
`;const Qt={advancePayment:"card-transaction-servicing-finance-transaction-advanced-payments-operative-header-advance-payment",overduePayment:"card-transaction-servicing-finance-transaction-advanced-payments-operative-header-overdue",monthlyPayment:"card-transaction-servicing-finance-transaction-advanced-payments-operative-header-monthly-payment"},Zt={EARLY_MONTHLY_INSTALLMENT_PAYMENT:"card-transaction-servicing-finance-transaction-advanced-payments-success-advance-payments-detail-operation-type-early-installment",EARLY_MULTIPLE_INSTALLMENTS_PAYMENT:"card-transaction-servicing-finance-transaction-advanced-payments-success-advance-payments-detail-operation-type-early-multiple-installments",EARLY_PAYMENT_AMOUNT:"card-transaction-servicing-finance-transaction-advanced-payments-success-advance-payments-detail-operation-type-early-payment-amount",EARLY_PARTIAL_PAYMENT_LOWER_MONTHLY_INSTALLMENT:"card-transaction-servicing-finance-transaction-advanced-payments-success-advance-payments-detail-operation-type-early-partial-payment-lower-installment",EARLY_TOTAL_PAYMENT:"card-transaction-servicing-finance-transaction-advanced-payments-success-advance-payments-detail-operation-type-early-total-payment",INSTALLMENT_PAYMENT:"card-transaction-servicing-finance-transaction-advanced-payments-success-advance-payments-detail-operation-type-installment-payment",TOTAL_OVERDUE:"card-transaction-servicing-finance-transaction-advanced-payments-success-advance-payments-detail-operation-type-total-overdue",PARTIAL_OVERDUE:"card-transaction-servicing-finance-transaction-advanced-payments-success-advance-payments-detail-operation-type-partial-overdue"},te={totalOverdue:"card-transaction-servicing-finance-transaction-advanced-payments-overdue-payment-step-notification-message-total-overdue",partialOverdue:"card-transaction-servicing-finance-transaction-advanced-payments-overdue-payment-step-notification-message-partial-overdue"},ee={totalOverdue:"TOTAL_OVERDUE",partialOverdue:"PARTIAL_OVERDUE"},ne={advancePayment:"card-transaction-servicing-finance-transaction-advanced-payments-select-advance-payment-type-step-radio-button-advance-payment-title",settleTotalDebt:"card-transaction-servicing-finance-transaction-advanced-payments-select-advance-payment-type-step-radio-button-settle-total-debt-title"},ae={moreAmount:"card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-step-higher-than-installment",lessAmount:"card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-step-lower-than-installment"},ie="EARLY_MONTHLY_INSTALLMENT_PAYMENT",se="EARLY_MULTIPLE_INSTALLMENTS_PAYMENT",oe="EARLY_PAYMENT_AMOUNT",re="EARLY_PARTIAL_PAYMENT_LOWER_MONTHLY_INSTALLMENT",le="EARLY_TOTAL_PAYMENT",ce="INSTALLMENT_PAYMENT",de="PARTIAL_OVERDUE",me="TOTAL_OVERDUE",ue="advancePaymentMonthlyPayment",pe="advancePaymentAllInstallments",he="advancePaymentLessThanOneInstallment",ye="advancePaymentOverdue";var ve=c`
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

.financing-line-info {
  display: flex;
  flex-direction: column;
  row-gap: 0.5rem;
}

.summary-list-container {
  display: flex;
  justify-content: space-between;
}

.summary-list {
  display: flex;
  flex-direction: column;
  row-gap: 0.5rem;
  margin: 0;
  padding: 0;
}

.summary-list-item {
  display: flex;
  justify-content: space-between;
}
`;class ge extends(d(A(T(m(e))))){static get is(){return"financing-line-info"}static get scopedElements(){const t=[$,P,M,...ge.configurationScopedElements()];return ge.scopedElementsFromClasses(t)}static get properties(){return{financingLineDetail:{type:Object,attribute:"financing-line-detail"},operativeId:{type:String,attribute:"operative-id"},options:{type:Object}}}constructor(){super(),this.financingLineDetail={},this.language="",this.operativeId="",this.options={day:"2-digit",month:"short",year:"numeric"}}static get styles(){return[ve,E.secondary,I.secondary,u("financing-line-info-shared-styles")]}get _renderSummaryList(){var t,e,n,a,s,o,r,l;return i`
      <ul class="summary-list">
        ${this._summaryList({leftTextContent:this.t("card-transaction-servicing-finance-transaction-advanced-payments-financing-line-info-available-balance"),rightAmountContent:null===(t=this.financingLineDetail)||void 0===t||null===(e=t.availableBalance)||void 0===e?void 0:e.amount,currency:null===(n=this.financingLineDetail)||void 0===n||null===(a=n.availableBalance)||void 0===a?void 0:a.currency})}
        ${this._summaryList({leftTextContent:this.t("card-transaction-servicing-finance-transaction-advanced-payments-financing-line-info-disposed-balance"),rightAmountContent:null===(s=this.financingLineDetail)||void 0===s||null===(o=s.disposedBalance)||void 0===o?void 0:o.amount,currency:null===(r=this.financingLineDetail)||void 0===r||null===(l=r.disposedBalance)||void 0===l?void 0:l.currency})}
        ${this._showLastFieldInSummaryList}
      </ul>
    `}get _showLastFieldInSummaryList(){var t,e,n,a,s;return"overduePayment"!==this.operativeId?i`
          <li class="summary-list-container">
            <bbva-type-text
              text="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-financing-line-info-next-payment-date")}"
              tag="span"
              size="S"
            ></bbva-type-text>           
            <bbva-type-date
              font-weight="${p.fontWeight40}"
              font-style="${h.fontStyle20}"
              date="${null===(t=this.financingLineDetail)||void 0===t?void 0:t.nextPaymentDate}"
              utc
              .options="${this.options}"
            ></bbva-type-date>
          </li>
        `:i`
          ${this._summaryList({leftTextContent:this.t("card-transaction-servicing-finance-transaction-advanced-payments-financing-line-info-overdue-balance"),rightAmountContent:null===(e=this.financingLineDetail)||void 0===e||null===(n=e.overdueBalance)||void 0===n?void 0:n.amount,currency:null===(a=this.financingLineDetail)||void 0===a||null===(s=a.overdueBalance)||void 0===s?void 0:s.currency})}
        `}_summaryList({leftTextContent:t,rightAmountContent:e,currency:n}){return i`
      <li class="summary-list-item">
        <bbva-type-text text="${t}" tag="span" size="S"></bbva-type-text>
        <bbva-type-amount
          amount="${e}"
          currency-code="${n}"
          local-currency="${n}"
          language="${this.language}"
          variant="m"
          type="bold"
        ></bbva-type-amount>
      </li>
    `}render(){return i` <div class="financing-line-info" ambient="secondary">${this._renderSummaryList}</div> `}}const _e=(t,e,n)=>{const a="complete"===e?"complete":`card-transaction-servicing-finance-transaction-advanced-payments-${e}`;t.dispatchEvent(new CustomEvent(a,{detail:n,bubbles:!0,composed:!0}))};function be(t=0,e="EUR",n="es-ES",a=!0){const i={style:"currency",currency:e,...t%1!=0||a?{minimumFractionDigits:2}:{minimumFractionDigits:0,maximumFractionDigits:0}};return new Intl.NumberFormat(n,i).format(t??0)}const{moment:fe}=window;function Se(t,e="DD MMM YYYY"){var n,a;return t?null===(n=fe(t))||void 0===n||null===(a=n.format(e))||void 0===a?void 0:a.replace(".",""):""}function xe(t,e,n){const a="microloansModal"===t,i="monthlyPayment"===n;return e.map((t=>({id:(null==t?void 0:t.id)||"",textTopLeft:a?null==t?void 0:t.concept:null==t?void 0:t.productName,textTopRigth:{amount:i?t.installmentAmount.amount:null==t?void 0:t.amount,currency:i?t.installmentAmount.currency:null==t?void 0:t.currency},textBottomLeft:a?{paidInstallments:null==t?void 0:t.paidInstallments,totalInstallments:null==t?void 0:t.totalInstallments}:null==t?void 0:t.number,isMicroloansModal:a,isValidAccount:(null==t?void 0:t.isValidateAccount)||!1})))}var Ae=c`
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

.summary-list-detail {
  display: flex;
  flex-direction: column;
  gap: 1rem;
}

.summary-list {
  display: flex;
  justify-content: space-between;
  align-items: start;
}

.summary-list-text {
  display: flex;
  align-items: start;
}
.summary-list-text [data-tag-name=bbva-button-default] {
  width: 1.5rem;
  height: 1.5rem;
  padding-bottom: 1rem;
}

.input-form {
  display: flex;
  flex-direction: column;
  row-gap: 1rem;
}

[data-tag-name=bbva-form-input] {
  margin-bottom: 1rem 0;
  margin-top: 0.5rem 0;
}

.notification-message {
  margin-bottom: 1rem 0;
}

.summary-list-text.resize-flex2 {
  flex: 2;
}

.resize-flex1 {
  flex: 1;
}
`;class Te extends(d(A(T(m(e))))){static get is(){return"import-payment"}static get scopedElements(){const t=[C,ot,O,$,M,...Te.configurationScopedElements()];return Te.scopedElementsFromClasses(t)}static get properties(){return{currency:{type:String},financialResponse:{type:Object,attribute:"financial-response"},invalid:{type:Boolean},isLoading:{type:Boolean,attribute:"is-loading"},language:{type:String,attribute:"language"},oldValue:{type:String,attribute:"old-value"},partialOverdue:{type:String,attribute:"partial-overdue"},selectImport:{type:Number,attribute:"select-import"},_focusInputFlag:{type:Boolean},_loadStepFlag:{type:Boolean},_showMessageTotal:{type:Boolean},_typePayment:{type:String}}}constructor(){super(),this.currency="",this.financialResponse={},this.invalid=!1,this.isLoading=!1,this.language="",this.oldValue="",this.partialOverdue="",this.selectImport=0,this._focusInputFlag=!1,this._loadStepFlag=!1,this._showMessageTotal=!1,this._typePayment=""}static get styles(){return[Ae,rt.primaryAlt,L.primaryAlt,I.primaryAlt,E.primaryAlt,u("import-payment-shared-styles")]}updated(t){t.has("partialOverdue")&&""!==this.partialOverdue?(this.isLoading=!1,this._showMessageTotal=!0):this._overdueStepLoadHandler()}_focusAmountInputHandler(){this._focusInputFlag||_e(this,"overdue-payment-input-click"),this._focusInputFlag=!0}_getImportPayment(t){t.stopPropagation();const e="totalOverdue"===this._typePayment?me:de,n={import:this.selectImport,paymentType:e,ev:t};_e(this,"complete"),_e(this,"overdue-payment-step-complete",n)}_inputWithoutValue(t){var e,n;0===this.selectImport&&(null==t||null===(e=t.target)||void 0===e?void 0:e.value)!==this.oldValue&&(this._showMessageTotal=!1,this.oldValue=null==t||null===(n=t.target)||void 0===n?void 0:n.value)}_isTotalOverdue(t,e){var n,a;this.selectImport>0&&(null==e||null===(n=e.target)||void 0===n?void 0:n.value)!==this.oldValue&&this.selectImport===(null==t?void 0:t.amount)&&(this._resetFinancialLinePaymentSimulateResponse(),this.oldValue=null==e||null===(a=e.target)||void 0===a?void 0:a.value,this._showMessageTotal=!0)}_openOverdueFeeModal(t,e){t.stopPropagation(),_e(this,"import-payment-overdue-fee-modal-open",e),_e(this,"overdue-payment-modal-first-click")}async _overdueStepLoadHandler(){this._loadStepFlag||_e(this,"overdue-payment-step-load"),this._loadStepFlag=!0,await this.updateComplete}_postResponseBody(t){const e={paymentAmount:{amount:this.selectImport,currency:this.currency},paymentType:ee[this._typePayment]};this._resetFinancialLinePaymentSimulateResponse(),_e(null==t?void 0:t.target,"financing-line-payments-simulate-post-request",e)}get _renderInputForm(){const{overdueBalance:t}=this.financialResponse;return i`
      <div class="content">
        <div class="input-form" ambient="primary-alt">
          <bbva-type-text
            text="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-overdue-payment-step-description-text")}"
            tag="p"
            inherit
            size="S"
          ></bbva-type-text>
          ${this._renderSummaryList}
          <bbva-form-input
            type="amount"
            label="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-overdue-payment-step-input-label")}"
            clear-accessible-text="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-overdue-payment-step-input-label")}"
            info-message="${this.invalid?"":`${this.t("card-transaction-servicing-finance-transaction-advanced-payments-overdue-payment-step-input-info-message")} ${be(null==t?void 0:t.amount,null==t?void 0:t.currency,this.language,!0)}`}"
            ?invalid=${this.invalid}
            ?auto-validate=${this.invalid}
            error-message="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-overdue-payment-step-input-error-message")}"
            local-currency="${this.currency}"
            currency-code="${this.currency}"
            language="${this.language}"
            pattern=""
            @form-amount-input-change=${this._setValueAndInvalidInput}
            @form-field-input-blur=${this._setRequest}
            @form-field-input-focus=${this._focusAmountInputHandler}
          ></bbva-form-input>
          ${this._renderMessageTotalOrPartialPayment(t)}
          <bbva-button-default
            ?disabled=${this.invalid||0===this.selectImport||!this._showMessageTotal}
            id="import-payment-btn"
            fullwidth
            @click=${this._getImportPayment}
            >${this.t("card-transaction-servicing-finance-transaction-advanced-payments-overdue-payment-step-continue-button-text")}</bbva-button-default
          >
        </div>
      </div>
    `}_renderMessageTotalOrPartialPayment(t){return this._typePayment=this.selectImport===(null==t?void 0:t.amount)?"totalOverdue":"partialOverdue",this._showMessageTotal?i`
          <bbva-notification-message
            variant="default"
            book-title
            ?loading=${this.isLoading}
            message-title="${this.t(te[this._typePayment],{value:this.partialOverdue})}"
          >
          </bbva-notification-message>
        `:y}get _renderSummaryList(){const{overdueBalance:t,overduePaymentFee:e,overduePaymentWithoutFee:n}=this.financialResponse;return i`
      <div class="summary-list-detail">
        <div class="summary-list-item-wrapper">
          ${this._summaryList({leftTextContent:this.t("card-transaction-servicing-finance-transaction-advanced-payments-overdue-payment-step-detail-list-overdue"),leftAmountContent:null==n?void 0:n.amount,icon:!1,currency:null==n?void 0:n.currency})}
        </div>
        ${this._summaryList({leftTextContent:this.t("card-transaction-servicing-finance-transaction-advanced-payments-overdue-payment-step-detail-list-penalty"),classLeft:"resize-flex2",classRight:"resize-flex1",leftAmountContent:null==e?void 0:e.amount,icon:!0,currency:null==e?void 0:e.currency,overduePaymentFee:e})}
        ${this._summaryList({leftTextContent:this.t("card-transaction-servicing-finance-transaction-advanced-payments-overdue-payment-step-detail-list-total-overdue"),leftAmountContent:null==t?void 0:t.amount,icon:!1,currency:null==t?void 0:t.currency})}
      </div>
    `}_resetFinancialLinePaymentSimulateResponse(){_e(this,"reset-financing-line-payments-simulate",!0)}_setRequest(t){var e;t.stopPropagation();const{overdueBalance:n}=this.financialResponse;var a;this.selectImport>0&&(null==t||null===(e=t.target)||void 0===e?void 0:e.value)!==this.oldValue&&this.selectImport<(null==n?void 0:n.amount)&&(this.oldValue=null==t||null===(a=t.target)||void 0===a?void 0:a.value,this._showMessageTotal=!0,this._postResponseBody(t),this._validateIsLoading());this._isTotalOverdue(n,t),this._inputWithoutValue(t)}_setValueAndInvalidInput(t){var e;t.stopPropagation();const{overdueBalance:n}=this.financialResponse;this.selectImport=null==t||null===(e=t.detail)||void 0===e?void 0:e.amount,this.invalid=this.selectImport>(null==n?void 0:n.amount),this._showMessageTotal=t.detail.amount>0,this.selectImport<(null==n?void 0:n.amount)?this.isLoading=!0:this.isLoading=!1}_summaryList({overduePaymentFee:t,leftTextContent:e,leftAmountContent:n,icon:a,classRight:s,classLeft:o}){return i`
      <div class="summary-list">
        <div class=${`summary-list-text ${o}`}>
          <bbva-type-text text="${e}" tag="span"> </bbva-type-text>
          ${a?i`<bbva-button-default
                id="btn-summary-list"
                aria-label="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-overdue-payment-step-detail-list-button-default")}"
                variant="icon no-background"
                icon="${v()}"
                @click=${e=>this._openOverdueFeeModal(e,t)}
              ></bbva-button-default>`:y}
        </div>
        <bbva-type-text
          tag="span"
          text="${be(n,this.currency,this.language,!0)}"
          font-weight="${p.fontWeight40}"
          size="S"
          alignment="right"
          class="${s}"
        ></bbva-type-text>
      </div>
    `}_validateIsLoading(){"partialOverdue"===this._typePayment&&(this.isLoading=!0)}render(){return i` ${this._renderInputForm} `}}var $e=c`
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

.import-payment-collapsed-summary-list-container {
  display: flex;
  flex-direction: column;
  row-gap: 0.5rem;
}
.import-payment-collapsed-summary-list-container .import-payment-collapsed-summary-list {
  display: flex;
  justify-content: space-between;
}
`;class Pe extends(d(A(T(m(e))))){static get is(){return"import-payment-collapsed"}static get scopedElements(){const t=[$,M,...Pe.configurationScopedElements()];return Pe.scopedElementsFromClasses(t)}static get properties(){return{financialResponse:{type:Object,attribute:"financial-response"},partialOverdue:{type:String,attribute:"partial-overdue"},selectedImport:{type:Number,attribute:"selected-import"}}}constructor(){super(),this.financialResponse={},this.language="",this.partialOverdue="",this.selectedImport=0}static get styles(){return[$e,I.secondary,E.secondary,u("import-payment-collapsed-shared-styles")]}get _renderSummaryList(){const{overdueBalance:t,overduePaymentFee:e,overduePaymentWithoutFee:n}=this.financialResponse,a=this.selectedImport<(null==t?void 0:t.amount);return i`
      <div class="import-payment-collapsed-summary-list-container">
        ${this._summaryList({leftTextContent:this.t("card-transaction-servicing-finance-transaction-advanced-payments-overdue-payment-step-summary-overdue"),leftAmountContent:null==t?void 0:t.amount,currency:null==t?void 0:t.currency})}
        ${this._summaryList({leftTextContent:this.t("card-transaction-servicing-finance-transaction-advanced-payments-overdue-payment-step-summary-overdue-penalty"),leftAmountContent:null==e?void 0:e.amount,currency:null==e?void 0:e.currency})}
        ${this._summaryList({leftTextContent:this.t("card-transaction-servicing-finance-transaction-advanced-payments-overdue-payment-step-summary-total-overdue"),leftAmountContent:null==n?void 0:n.amount,currency:null==n?void 0:n.currency})}
        ${this._summaryList({leftTextContent:this.t("card-transaction-servicing-finance-transaction-advanced-payments-overdue-payment-step-summary-paid-amount"),leftAmountContent:this.selectedImport,currency:null==n?void 0:n.currency})}
        ${a?this._summaryList({leftTextContent:this.t("card-transaction-servicing-finance-transaction-advanced-payments-overdue-payment-step-summary-pending-to-pay-amount"),leftAmountContent:this.partialOverdue},a):y}
      </div>
    `}_summaryList({leftTextContent:t,leftAmountContent:e,currency:n},a){return i`
      <div class="import-payment-collapsed-summary-list">
        <bbva-type-text text="${t}" tag="span"></bbva-type-text>
        ${a?i`
              <bbva-type-text
                text="${e}"
                tag="span"
                font-weight="${p.fontWeight40}"
              ></bbva-type-text>
            `:i`
              <bbva-type-amount
                amount=${e}
                type="bold"
                variant="m"
                currency-code="${n}"
                local-currency="${n}"
                language="${this.language}"
              ></bbva-type-amount>
            `}
      </div>
    `}render(){return i` <div class="content" ambient="secondary">${this._renderSummaryList}</div> `}}var Me=c`
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

.content {
  display: flex;
  flex-direction: column;
  row-gap: 0.25rem;
}
.content .monthly-detail-collapsed-summary-list-container {
  display: flex;
  flex-direction: column;
  row-gap: 0.5rem;
  margin: 0.5rem 0;
}
.content .monthly-detail-collapsed-summary-list-container .monthly-detail-collapsed-summary-list {
  display: flex;
  justify-content: space-between;
}
`;class Ee extends(d(A(T(m(e))))){static get is(){return"monthly-detail-collapsed"}static get scopedElements(){const t=[R,$,M,...Ee.configurationScopedElements()];return Ee.scopedElementsFromClasses(t)}static get properties(){return{financingLineResponse:{type:Object,attribute:"financing-line-response"},language:{type:String,attribute:"language"},microloansResponse:{type:Object,attribute:"microloans-response"}}}constructor(){super(),this.financingLineResponse={},this.language="",this.microloansResponse={}}static get styles(){return[Me,D.secondary,I.secondary,E.secondary,u("monthly-detail-collapsed-shared-styles")]}_renderSummaryList(t,e){var n,a;return i`
      <div class="monthly-detail-collapsed-summary-list-container">
        ${e.map((({concept:t,installmentAmount:e})=>this._summaryList({leftTextContent:t,leftAmountContent:null==e?void 0:e.amount,currency:null==e?void 0:e.currency})))}
        ${this._summaryList({leftTextContent:this.t("card-transaction-servicing-finance-transaction-advanced-payments-monthly-payment-step-total-payment-amount"),leftAmountContent:null==t||null===(n=t.totalInstallmentMonthlyAmount)||void 0===n?void 0:n.amount,currency:null==t||null===(a=t.totalInstallmentMonthlyAmount)||void 0===a?void 0:a.currency})}
      </div>
    `}_summaryList({leftTextContent:t,leftAmountContent:e,currency:n}){return i`
      <div class="monthly-detail-collapsed-summary-list" >
        <bbva-type-text text="${t}" tag="span" size="S"></bbva-type-text>
        <bbva-type-amount
          amount="${e}"
          currency-code="${n}"
          local-currency="${n}"
          language="${this.language}"
          type="bold"
          variant="m"
        ></bbva-type-amount>
      </div>
    `}render(){return i`
      <div class="content" ambient="secondary">
        ${this._renderSummaryList(this.financingLineResponse,this.microloansResponse)}
        <bbva-notification-help
          variant="info"
          text="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-monthly-payment-notification-help-message")}"
        ></bbva-notification-help>
      </div>
    `}}var Ie=c`
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

.monthly-detail-opened-summary-list-container {
  display: flex;
  flex-direction: column;
  row-gap: 0.5rem;
  margin: 1rem 0;
}
.monthly-detail-opened-summary-list-container .monthly-detail-opened-summary-list {
  display: flex;
  justify-content: space-between;
  padding: 0.5rem 0;
}

.microloans-list-modal-type-text-amount {
  display: flex;
  justify-content: space-between;
  padding: 0.5rem 0;
}
`;class Ce extends(d(A(T(m(e))))){static get is(){return"monthly-detail-opened"}static get scopedElements(){const t=[C,w,N,$,M,...Ce.configurationScopedElements()];return Ce.scopedElementsFromClasses(t)}static get properties(){return{language:{type:String,attribute:"language"},microloansResponse:{type:Object,attribute:"microloans-response"}}}constructor(){super(),this.language="",this.microloansResponse={}}static get styles(){return[Ie,L.primary,F.primary,I.primary,I.primary,u("monthly-detail-opened-shared-styles")]}updated(t){super.updated(t),t.has("microloansResponse")&&0!==this.microloansResponse.length&&_e(this,"monthly-payment-step-load")}_getImportPayment(t){t.stopPropagation(),_e(this,"monthly-payment-step-continue"),_e(this,"complete")}_openMicroloansListModal(t){t.stopPropagation(),_e(this,"monthly-modal-show",!1)}_renderSummaryList(){return this.microloansResponse.map(((t,e)=>{var n,a;return e<3?i`
            <div class="monthly-detail-opened-summary-list-container">
              ${this._summaryList({leftTextContent:null==t?void 0:t.concept,leftAmountContent:null==t||null===(n=t.installmentAmount)||void 0===n?void 0:n.amount,currency:null==t||null===(a=t.installmentAmount)||void 0===a?void 0:a.currency})}
              ${e!==this.microloansResponse.length-1?i`<bbva-divider-default size="fit"></bbva-divider-default>`:y}
            </div>
          `:y}))}_renderViewAllLink(t){return t.length>3?i`
          <bbva-header-category
            option-link="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-monthly-payment-view-all-link-text")}"
            text="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-monthly-payment-view-all-header-text")}"
            @click=${this._openMicroloansListModal}
          ></bbva-header-category>
        `:y}_summaryList({leftTextContent:t,leftAmountContent:e,currency:n}){return i`
      <div class="monthly-detail-opened-summary-list">
        <bbva-type-text
          text="${t}"
          tag="span"
          size="S"
          font-weight="${p.fontWeight40}"
        ></bbva-type-text>
        <bbva-type-amount
          amount="${e}"
          currency-code="${n}"
          local-currency="${n}"
          language="${this.language}"
          type="bold"
        ></bbva-type-amount>
      </div>
    `}render(){return i`
      <div class="content" ambient="primary">
        ${this._renderViewAllLink(this.microloansResponse)} ${this._renderSummaryList()}
        <bbva-button-default
          id="monthly-detail-btn"
          fullwidth
          text="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-monthly-payment-step-continue-button-text")}"
          @click=${this._getImportPayment}
        ></bbva-button-default>
      </div>
    `}}var Oe=c`
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
  margin-bottom: 1rem;
}

.form-container {
  margin: 1rem 0 1rem 1rem;
  display: flex;
  flex-direction: column;
  row-gap: 0.5rem;
}

.notification-message {
  margin-top: 1rem;
  margin-bottom: 2rem;
}

.microloan-list-element {
  padding-bottom: 0.5rem;
  display: flex;
  flex-direction: column;
}

.microloan-element-top {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding-top: 1rem;
}

.microloan-element-bottom {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding-bottom: 1rem;
}

.select-advance-payment-type-button {
  display: flex;
  flex-direction: column;
  gap: 1rem;
  padding-bottom: 1rem;
}
`;class Le extends(d(A(T(m(e))))){static get is(){return"select-advance-payment-type"}static get scopedElements(){const t=[C,w,ct,dt,N,O,$,k,M,B,...Le.configurationScopedElements()];return Le.scopedElementsFromClasses(t)}static get properties(){return{microloansResponse:{type:Array,attribute:"microloans-response"},resetStep:{type:Boolean,attribute:"reset-step"},selectedPaymentType:{type:String,attribute:"selected-payment-type"},_disabledButton:{type:Boolean},_oldValue:{type:String},_paymentTypesArr:{type:Array}}}constructor(){super(),this.language="",this.microloansResponse=[],this.resetStep=!1,this.selectedPaymentType="",this._disabledButton=!1,this._oldValue="",this._paymentTypesArr=[{radioTitle:this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-advance-payment-type-step-radio-button-advance-payment-title"),radioDescription:this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-advance-payment-type-step-radio-button-advance-payment-description"),value:"advancePayment"},{radioTitle:this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-advance-payment-type-step-radio-button-settle-total-debt-title"),radioDescription:this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-advance-payment-type-step-radio-button-settle-total-debt-description"),value:"settleTotalDebt"}]}static get styles(){return[Oe,mt.primaryAlt,L.primary,F.primaryAlt,L.primaryAlt,I.primaryAlt,E.primaryAlt,j.primaryAlt,V.primaryAlt,u("select-advance-payment-type-shared-styles")]}updated(t){super.updated(t),t.has("resetStep")&&!this.resetStep&&(this.selectedPaymentType=""),t.has("microloansResponse")&&0!==this.microloansResponse.length&&_e(this,"select-payment-type-step-load")}dispatchEvents(){_e(this,"select-advance-payment-type-complete",this.selectedPaymentType),_e(this,"complete"),this._oldValue=this.selectedPaymentType,"advancePayment"===this.selectedPaymentType?_e(this,"payment-type-option-selected",this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-advance-payment-type-step-radio-button-advance-payment-title")):_e(this,"payment-type-option-selected",this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-advance-payment-type-step-radio-button-settle-total-debt-title"))}openMicroloansListModal(t){t.stopPropagation(),_e(this,"payment-type-modal-show",!1)}_radioChangeEventHandler(t){this.selectedPaymentType=null==t?void 0:t.value,this._disabledButton=!0,"advancePayment"===this.selectedPaymentType?_e(this,"select-advance-payment"):_e(this,"select-settle-total-debt")}_renderMicroloansList(t=[]){var e;return(null===(e=this.microloansResponse)||void 0===e?void 0:e.length)>0?t.map(((t,e)=>"settleTotalDebt"===this.selectedPaymentType&&e<3?i`
            <div class="microloan-list-element">
              <div class="microloan-element-top">
                <bbva-type-text
                  text="${null==t?void 0:t.concept}"
                  tag="span"
                  font-weight="${p.fontWeight40}"
                  size="L"
                ></bbva-type-text>
                <bbva-type-amount
                  amount="${null==t?void 0:t.amount}"
                  currency-code="${null==t?void 0:t.currency}"
                  local-currency="${null==t?void 0:t.currency}"
                  language="${this.language}"
                  type="bold"
                ></bbva-type-amount>
              </div>
              <div class="microloan-element-bottom">
                <bbva-type-text
                  text="${t.paidInstallments} ${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-advance-payment-type-step-settle-total-debt-microloans-payments-text")} ${t.totalInstallments}"
                  tag="span"
                  size="S"
                ></bbva-type-text>
                <bbva-type-text
                  text="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-advance-payment-type-step-settle-total-debt-microloans-pending-debt-text")}"
                  tag="span"
                  size="S"
                ></bbva-type-text>
              </div>
              ${e<2?i`<bbva-divider-default size="full"></bbva-divider-default>`:y}
            </div>
          `:y)):y}_renderNotificationMessage(){return"settleTotalDebt"===this.selectedPaymentType?i`
          <bbva-notification-message
            variant="default"
            message-title="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-advance-payment-type-step-settle-total-debt-notification-text")}"
            book-title
          ></bbva-notification-message>
        `:y}get _renderPaymentTypesList(){return this._paymentTypesArr.map((({radioTitle:t,radioDescription:e,value:n})=>i`
        <bbva-form-control-input slot="_option" type="radio" name="custom" value=${n}>
          <div slot="right" class="form-container">
            <bbva-type-text
              tag="p"
              text="${t}"
              size="L"
              font-weight="${p.fontWeight40}"
              inherit
            ></bbva-type-text>
            <bbva-type-text tag="p" inherit text="${e}" size="S"></bbva-type-text>
          </div>
        </bbva-form-control-input>
      `))}_renderViewAllLink(t){return"settleTotalDebt"===this.selectedPaymentType&&t.length>3?i`
          <bbva-header-category
            option-link="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-advance-payment-type-step-settle-total-debt-view-all-microloans-link-text")}"
            text="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-advance-payment-type-step-settle-total-debt-view-all-microloans-header-text")}"
            @header-category-link-click=${this.openMicroloansListModal}
          ></bbva-header-category>
        `:y}_selectAdvancePaymentTypeDispatch(t){t.stopPropagation(),this._oldValue&&this._oldValue!==this.selectedPaymentType&&"settleTotalDebt"===this.selectedPaymentType?(_e(this,"select-advance-payments-type-modal-show"),this._oldValue=""):this.dispatchEvents()}render(){return i`
      <div class="content" ambient="primary-alt">
        <bbva-type-text
          text="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-advance-payment-type-step-description-text")}"
          tag="p"
          size="S"
          inherit
          class="description-text"
        ></bbva-type-text>
        <bbva-form-container
          divider-size="full"
          id="form-container"
          @form-container-radio-change=${t=>{t.stopPropagation(),this._radioChangeEventHandler(null==t?void 0:t.detail)}}
        >
          ${this._renderPaymentTypesList}
        </bbva-form-container>
        ${this._renderViewAllLink(this.microloansResponse)}
        ${this._renderMicroloansList(this.microloansResponse)}
        ${this._renderNotificationMessage(this.microloansResponse)}
        <div class="select-advance-payment-type-button" ambient="primary">
          <bbva-button-default
            fullwidth
            @click=${this._selectAdvancePaymentTypeDispatch}
            ?disabled=${!this._disabledButton}
            >${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-advance-payment-type-step-continue-button-text")}</bbva-button-default
          >
        </div>
      </div>
    `}}var Re=c`
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

.total-debt {
  padding-bottom: 0.5rem;
  display: flex;
  flex-direction: column;
}

.microloan-list {
  display: flex;
  flex-direction: column;
}

.list-item {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding-top: 1rem;
}
`;class De extends(d(A(T(m(e))))){static get is(){return"select-advance-payment-type-summary"}static get scopedElements(){const t=[R,$,M,...De.configurationScopedElements()];return De.scopedElementsFromClasses(t)}static get properties(){return{currency:{type:String},isTotalDebt:{type:Boolean,attribute:"is-total-debt"},microloans:{type:Array},selectedPaymentType:{type:String,attribute:"selected-payment-type"},disposedBalanceAmount:{type:Object,attribute:"disposed-balance-amount"}}}constructor(){super(),this.currency="",this.language="",this.microloans=[],this.selectedPaymentType="",this.disposedBalanceAmount={},this.isTotalDebt=!1}static get styles(){return[Re,I.secondary,D.secondary,u("select-advance-payment-type-summary-shared-styles")]}_renderMicroloansList(t){return t.map((t=>i`
        <div class="microloan-list">
          <div class="list-item">
            <bbva-type-text text="${null==t?void 0:t.concept}" tag="span" size="S"></bbva-type-text>
            <bbva-type-amount
              amount="${null==t?void 0:t.amount}"
              currency-code="${null==t?void 0:t.currency}"
              local-currency="${null==t?void 0:t.currency}"
              language="${this.language}"
              type="bold"
              variant="m"
            ></bbva-type-amount>
          </div>
        </div>
      `))}get _renderNotificationHelp(){return i`
      <bbva-notification-help
        variant="info"
        text="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-advance-payment-type-step-settle-total-debt-summary-notification-help")}"
      ></bbva-notification-help>
    `}get _renderSummaryContent(){return i`
      <div>
        <bbva-type-text text=${this.selectedPaymentType} size="S" tag="span"></bbva-type-text>
        ${this._renderWhenSettleTotalDebt}
      </div>
    `}get _renderTotalDebt(){var t,e,n;return i`
      <div class="total-debt">
        <div class="list-item">
          <bbva-type-text
            text="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-advance-payment-type-step-settle-total-debt-summary-total-debt-label")}"
            tag="span"
            size="S"
          ></bbva-type-text>
          <bbva-type-amount
            amount="${null===(t=this.disposedBalanceAmount)||void 0===t?void 0:t.amount}"
            currency-code="${null===(e=this.disposedBalanceAmount)||void 0===e?void 0:e.currency}"
            local-currency="${null===(n=this.disposedBalanceAmount)||void 0===n?void 0:n.currency}"
            language="${this.language}"
            type="bold"
            variant="m"
          ></bbva-type-amount>
        </div>
      </div>
    `}get _renderWhenSettleTotalDebt(){return this.isTotalDebt?i`
          <div ambient="secondary">
            ${this._renderMicroloansList(this.microloans)} ${this._renderTotalDebt}
            ${this._renderNotificationHelp}
          </div>
        `:y}render(){return i` ${this._renderSummaryContent} `}}var we=c`
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

.microloan-link-item {
  padding-bottom: 0.5rem;
  display: flex;
  flex-direction: column;
}

.microloan-item-top {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding-top: 1rem;
}

.microloan-item-bottom {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding-bottom: 1rem;
}

[data-tag-name=bbva-button-default] {
  padding-bottom: 1rem;
}
`;class Ne extends(d(A(T(m(e))))){static get is(){return"select-microloan"}static get scopedElements(){const t=[C,w,N,$,k,M,...Ne.configurationScopedElements()];return Ne.scopedElementsFromClasses(t)}static get properties(){return{microloansResponse:{type:Array,attribute:"microloans-response"}}}constructor(){super(),this.language="",this.microloansResponse=[]}static get styles(){return[we,L.primaryAlt,F.primaryAlt,I.primaryAlt,E.primaryAlt,V.primaryAlt,u("select-microloan-shared-styles")]}openMicroloansListModal(t){t.stopPropagation(),_e(this,"microloan-modal-show",!0)}_canSelectMicroloan(t){return this.microloansResponse.length>1?i`
          <bbva-type-link
            text=${null==t?void 0:t.concept}
          ></bbva-type-link>
        `:i` <bbva-type-text text="${null==t?void 0:t.concept}" size="L" tag="span"> </bbva-type-text> `}_renderContinueButton(){return 1===this.microloansResponse.length?i`
          <bbva-button-default
            fullwidth
            text="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-microloan-step-continue-button-text")}"
            @click=${t=>this._selectMicroloanDispatch(t,this.microloansResponse[0])}
          ></bbva-button-default>
        `:y}_renderMicroloansList(t=[]){var e;return(null===(e=this.microloansResponse)||void 0===e?void 0:e.length)>0?t.map(((e,n)=>n<3?i`
            <bbva-type-link class="microloan-link-item"  @click=${t=>this._selectMicroloanDispatch(t,e)}>
              <div class="microloan-item-top">
                ${this._canSelectMicroloan(e)}
                <bbva-type-amount
                  type="bold"
                  amount="${null==e?void 0:e.amount}"
                  currency-code="${null==e?void 0:e.currency}"
                  local-currency="${null==e?void 0:e.currency}"
                  language="${this.language}"
                ></bbva-type-amount>
              </div>
              <div class="microloan-item-bottom">
                <bbva-type-text
                  text="${null==e?void 0:e.paidInstallments} ${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-microloan-step-microloans-payments-text")} ${null==e?void 0:e.totalInstallments}"
                  tag="span"
                  size="S"
                ></bbva-type-text>
                <bbva-type-text
                  text="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-microloan-step-microloans-pending-debt-text")}"
                  tag="span"
                  size="S"
                ></bbva-type-text>
              </div>
              ${t.length>1&&n<2?i`<bbva-divider-default size="full"></bbva-divider-default>`:y}
            </bbva-type-link>
          `:y)):y}_renderViewAllLink(t){return t.length>3?i`
          <bbva-header-category
            option-link="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-microloan-step-view-all-microloans-link-text")}"
            text="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-microloan-step-view-all-microloans-header-text")}"
            @header-category-link-click=${this.openMicroloansListModal}
          ></bbva-header-category>
        `:y}_selectMicroloanDispatch(t,e){t.stopPropagation();const{id:n,concept:a,amount:i,currency:s}=e,o={id:n,concept:a,amount:i,currency:s};_e(this,"complete"),_e(this,"select-microloan",o)}render(){return i`
      <div class="content" ambient="primary-alt">
        ${this._renderViewAllLink(this.microloansResponse)}
        ${this._renderMicroloansList(this.microloansResponse)}
        ${this._renderContinueButton(this.microloansResponse)}
      </div>
    `}}var Fe=c`
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

.microloan-summary-item {
  display: flex;
  justify-content: space-between;
}
`;class ke extends(d(A(T(m(e))))){static get is(){return"select-microloan-summary"}static get scopedElements(){const t=[$,M,...ke.configurationScopedElements()];return ke.scopedElementsFromClasses(t)}static get properties(){return{selectedValues:{type:Object,attribute:"selected-values"}}}constructor(){super(),this.language="",this.selectedValues={}}static get styles(){return[Fe,E.secondary,I.secondary,u("select-microloan-summary-shared-styles")]}render(){const{concept:t,amount:e,currency:n}=this.selectedValues;return i` <div class="microloan-summary-item" ambient="secondary">
      <bbva-type-text text="${t}" tag="span" size="S"></bbva-type-text>
      <bbva-type-amount
        amount=${e}
        currency-code=${n}
        local-currency=${n}
        language="${this.language}"
        type="bold"
        variant="m"
      ></bbva-type-amount>
    </div>`}}var Be=c`
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

.list-amount-item {
  display: flex;
  justify-content: space-between;
}

.list-text-item {
  display: flex;
  justify-content: space-between;
}
.list-text-item :last-child() {
  flex: 1;
}

.summary-list {
  display: flex;
  flex-direction: column;
  row-gap: 0.5rem;
  margin: 0;
  padding: 0;
}
.summary-list .resize-flex1 {
  flex: 1;
}
.summary-list .resize-flex2 {
  flex: 2;
}
`;class je extends(d(A(T(m(e))))){static get is(){return"select-monthly-payment-collapsed"}static get scopedElements(){const t=[$,P,M,R,...je.configurationScopedElements()];return je.scopedElementsFromClasses(t)}static get properties(){return{currency:{type:String},selectedOption:{type:Object,attribute:"selected-option"},options:{type:Object},_paymentAmount:{type:Number},_paymentType:{type:String},_resume:{type:Object},_showAmountMoreThanInstallment:{type:Boolean},_showInstallmentsDetail:{type:Boolean}}}constructor(){super(),this.currency="",this.language="",this.selectedOption={},this.options={day:"2-digit",month:"short",year:"numeric"},this._paymentAmount=0,this._paymentType="",this._resume={},this._showAmountMoreThanInstallment=!1,this._showAmountSelect=!1,this._showInstallmentsDetail=!1}static get styles(){return[Be,D.secondary,I.secondary,E.secondary,H.secondary,u("select-monthly-payment-collapsed-shared-styles")]}updated(t){if(super.updated(),t.has("selectedOption")){const{amount:t,selectedOption:e,paymentType:n}=this.selectedOption;this._resume=e,this._paymentAmount=t,this._paymentType=n,this.validateShowDetail(),this.validateShowMoreThanInstallmentAmount()}}static summaryListText(t){const{leftTextContent:e,rightTextContent:n,classesRight:a,classesLeft:s,dateClass:o}=t;return i`
      <li class="list-text-item">
        <bbva-type-text
          class="${s}"
          text="${e}"
          tag="span"
          size="S"
        ></bbva-type-text>
        <bbva-type-text
          class="${a}"
          font-style="${o}"
          font-weight="${p.fontWeight40}"
          alignment="right"
          text="${n}"
          tag="span"
        >
        </bbva-type-text>
      </li>
    `}validateShowDetail(){this._paymentType===ie||this._paymentType===se?this._showInstallmentsDetail=!0:this._showInstallmentsDetail=!1}validateShowMoreThanInstallmentAmount(){this._paymentType===oe&&(this._showAmountMoreThanInstallment=!0),this._paymentType===re&&(this._showAmountMoreThanInstallment=!1)}_defineOptionNotificationHelp(t){const e="allInstallments"===t?"card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-step-summary-all-installments-notification":"card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-step-summary-different-amount-notification";return i`
      <bbva-notification-help
        accessibility-label-icon="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-accessibility-label-icon")}"
        variant="info"
        text="${this.t(e)}"
      ></bbva-notification-help>
    `}get _detailAmountSelect(){var t,e,n,a,s,o,r,l,c,d;const m=1===(null===(t=this._resume)||void 0===t||null===(e=t.specificDates)||void 0===e?void 0:e.term)?this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-step-installment-to-pay"):this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-step-installments-to-pay");return this._showAmountMoreThanInstallment?i`
          ${je.summaryListText({leftTextContent:this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-advance-reduce-installment"),rightTextContent:`${null===(n=this._resume)||void 0===n||null===(a=n.specificDates)||void 0===a?void 0:a.term} ${m}`})}
          ${this._summaryListDate({leftTextContent:this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-step-summary-last-payment-date-amount"),rightTextContent:null===(s=this._resume)||void 0===s||null===(o=s.specificDates)||void 0===o?void 0:o.valueDate,classesLeft:"resize-flex2"})}
        `:i`
          ${this._summaryListAmount({leftTextContent:this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-last-installment-amount"),amount:null===(r=this._resume)||void 0===r||null===(l=r.lastInstallmentAmount)||void 0===l?void 0:l.amount,currency:null===(c=this._resume)||void 0===c||null===(d=c.lastInstallmentAmount)||void 0===d?void 0:d.currency})}
          ${this._defineOptionNotificationHelp("isDifferentAmount")}
        `}get _renderAmountSelect(){return this._showInstallmentsDetail?y:i`
          <ul class="summary-list">
            ${this._summaryListAmount({leftTextContent:this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-step-summary-selected-amount"),amount:this._paymentAmount,currency:this.currency})}
            ${this._detailAmountSelect}
          </ul>
        `}get _date(){var t;return null===(t=this._resume)||void 0===t?void 0:t.maturityDate}get _renderInstallmentSelect(){var t;const e=this._paymentType===se?"all-installments":"selected-monthly";return this._showInstallmentsDetail?i`
          <ul class="summary-list">
            ${this._summaryListAmount({leftTextContent:this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-step-summary-selected-amount"),amount:this._paymentAmount,currency:this.currency})}
            ${je.summaryListText({leftTextContent:this.t(`card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-step-summary-${e}-payments`),rightTextContent:null===(t=this._resume)||void 0===t?void 0:t.number})}
            ${this._resume.maturityDate?this._summaryListDate({leftTextContent:this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-step-summary-last-payment-date"),rightTextContent:this._date,classesLeft:"resize-flex2"}):this._defineOptionNotificationHelp("allInstallments")}
          </ul>
        `:y}_summaryListAmount({leftTextContent:t,amount:e,currency:n}){return i`
      <li class="list-amount-item">
        <bbva-type-text text="${t}" tag="span" size="S"></bbva-type-text>
        <bbva-type-amount
          amount=${e}
          currency-code=${n}
          local-currency=${n}
          language="${this.language}"
          variant="m"
          type="bold"
        ></bbva-type-amount>
      </li>
    `}_summaryListDate(t){const{leftTextContent:e,rightTextContent:n,classesLeft:a}=t;return i`
      <li class="list-text-item">
        <bbva-type-text
          class="${a}"
          text="${e}"
          tag="span"
          size="S"
        ></bbva-type-text>
        <bbva-type-date
          font-weight="${p.fontWeight40}"
          font-style="${h.fontStyle20}"
          date="${n}"
          utc
          .options="${this.options}"
        ></bbva-type-date>
      </li>
    `}render(){return i`
      <div class="content" ambient="secondary">
        ${this._renderInstallmentSelect} ${this._renderAmountSelect}
      </div>
    `}}var Ve=c`
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

.list-amount-item {
  display: flex;
  justify-content: space-between;
}
.list-amount-item .flex1 {
  flex: 1;
}

.list-date-item {
  display: flex;
  justify-content: space-between;
}
.list-date-item .resize-flex1 {
  flex: 1;
}

.step-container {
  display: flex;
  flex-direction: column;
}
.step-container.detail {
  row-gap: 0.5rem;
  margin: 1rem 0;
}

.step-container-type-text {
  padding-bottom: 1rem;
}

.content-button {
  display: flex;
  padding-bottom: 1rem;
}
`;class He extends(d(A(T(m(e))))){static get is(){return"select-monthly-payment-opened"}static get scopedElements(){const t=[C,ot,ut,pt,R,$,P,M,...He.configurationScopedElements()];return He.scopedElementsFromClasses(t)}static get properties(){return{currency:{type:String},flagToResetProperties:{type:Boolean,attribute:"flag-to-reset-properties"},isLoading:{type:Boolean,attribute:"is-loading"},microloanPaymentsSimulate:{type:Object,attribute:"microloan-payments-simulate"},microloanSpecificAmounts:{type:Array,attribute:"microloan-specific-amounts"},paymentAmountId:{type:String,attribute:"payment-amount-id"},paymentType:{type:String,attribute:"payment-type"},_defaultOption:{type:Object},_differentAmount:{type:Boolean},_differentAmountValue:{type:Number},_flagPaymentData:{type:Boolean},_hasUpdatedOnce:{type:Boolean},_indexDefault:{type:Number},_infoMessage:{type:String},_inputError:{type:Boolean},_lastInstallment:{type:Object},_maxAmount:{type:String},_microloanInstallments:{type:Array},_oldValue:{type:String},_selectAmount:{type:Object},_selectedOption:{type:Object},_showLessThanInstallment:{type:Boolean},_showMessageLastInstallment:{type:Boolean},_showMonthlyDetail:{type:Boolean},_showMoreThanInstallment:{type:Boolean},options:{type:Object}}}constructor(){super(),this.currency="",this.data={},this.flagToResetProperties=!1,this.isLoading=!1,this.language="",this.microloanPaymentsSimulate={},this.microloanSpecificAmounts=[],this.paymentAmountId="",this.selectedMicroloan="",this.options={day:"2-digit",month:"short",year:"numeric"},this._defaultOption={},this._differentAmount=!1,this._differentAmountValue=0,this._flagPaymentData=!1,this._hasUpdatedOnce=!1,this._indexDefault=0,this._infoMessage="",this._inputError=!1,this._lastInstallment={},this._maxAmount="",this._microloanInstallments=[],this._oldValue="",this._paymentType="",this._selectedOption={},this._showLessThanInstallment=!1,this._showMessageLastInstallment=!1,this._showMonthlyDetail=!1,this._showMoreThanInstallment=!1}static get styles(){return[Ve,ht.primaryAlt,L.primaryAlt,lt.primaryAlt,I.primaryAlt,E.primaryAlt,H.primaryAlt,D.primaryAlt,u("select-monthly-payment-opened-shared-styles")]}firstUpdated(){super.firstUpdated(),this._setValues(),this._resetValues()}updated(t){if(t.has("flagToResetProperties")&&this.flagToResetProperties&&(this._setValues(),this._resetValues()),t.has("microloanPaymentsSimulate")&&Object.keys(this.microloanPaymentsSimulate).length>0&&(this.isLoading=!1),!this._hasUpdatedOnce&&this._flagPaymentData){var e,n,a,i;const t={amount:null===(e=this._defaultOption)||void 0===e||null===(n=e.amounts)||void 0===n?void 0:n.amount,currency:null===(a=this._defaultOption)||void 0===a||null===(i=a.amounts)||void 0===i?void 0:i.currency};this._selectAmountData(t),this._hasUpdatedOnce=!0}this._flagPaymentData=!0}static differentAmountInstallments({leftTextContent:t,installments:e,installmentsString:n,isLoading:a}){return i`
      <div class="list-date-item">
        <bbva-type-text text="${t}" tag="span"></bbva-type-text>
        <bbva-type-text
          font-weight="${p.fontWeight40}"
          font-style="${h.fontStyle20}"
          text="${e}${n}"
          tag="span"
          ?loading=${a}
        ></bbva-type-text>
      </div>
    `}_buildData({amount:t,paymentType:e,selectedOption:n}){const a={amount:t,paymentType:e,selectedOption:n};this._selectAmount=a}_defineNotificationHelp({message:t,isLoading:e=!1}){return i`
      <bbva-notification-help
        accessibility-label-icon="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-accessibility-label-icon")}"
        ?loading="${e}"
        text="${ae[t]}"
      >
      </bbva-notification-help>
    `}_findSelectedOption(t){var e,n;const a=this._microloanInstallments.find((e=>(null==e?void 0:e.id)===(null==t?void 0:t.value))),i={amount:null==a||null===(e=a.amounts)||void 0===e?void 0:e.amount,currency:null==a||null===(n=a.amounts)||void 0===n?void 0:n.currency};return this._selectAmountData(i),a}_handlePaymentSimulate(t){var e,n;(t.stopPropagation(),this._differentAmountValue>0&&this._oldValue!==(null==t||null===(e=t.target)||void 0===e?void 0:e.value))&&(this._oldValue=null==t||null===(n=t.target)||void 0===n?void 0:n.value,this.isLoading=!0,this._postRequestMicroloanPaymentSimulateResponse(),this._validateDifferentAmount(),this._resetMicroloansPaymentSimulateResponse())}_inputChangesAmount(t){var e,n,a,i;(t.stopPropagation(),this._inputError=(null==t||null===(e=t.detail)||void 0===e?void 0:e.amount)>=(null===(n=this._lastInstallment)||void 0===n||null===(a=n.amounts)||void 0===a?void 0:a.amount),this._inputError)?this._differentAmountValue=0:this._differentAmountValue=null==t||null===(i=t.detail)||void 0===i?void 0:i.amount}async _itemSelected(t){var e,n,a,i,s;(t.stopPropagation(),await this.updateComplete,"differentAmount"===(null==t||null===(e=t.detail)||void 0===e?void 0:e.value))?(this._showMonthlyDetail=!0,this._infoMessage="",this.isLoading=!0,this._differentAmount=!0):(this._showMessageLastInstallment=(null==t||null===(n=t.detail)||void 0===n?void 0:n.value)===(null===(a=this._lastInstallment)||void 0===a?void 0:a.id),this._showMonthlyDetail=!1,this._selectedOption=this._findSelectedOption(t.detail),this._selectedInstallments(this._selectedOption),this._infoMessage=(null==t||null===(i=t.detail)||void 0===i?void 0:i.value)===(null===(s=this._lastInstallment)||void 0===s?void 0:s.id)?this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-settle-total-debt"):"",this._differentAmount=!1,this._oldValue="")}_postRequestMicroloanPaymentSimulateResponse(){const t={specificAmounts:[{amounts:[{amount:this._differentAmountValue,currency:this.currency}],id:this.paymentAmountId}]};_e(this,"execute-microloan-payment-simulate",t);const e={amount:this._differentAmountValue,currency:this.currency};this._selectAmountData(e)}get _renderButtonContinue(){return i`
      <div class="content-button" ambient="primary-alt">
        <bbva-button-default
          id="select-monthly-btn"
          fullwidth
          ?disabled="${this._inputError||this._differentAmount&&this.isLoading}"
          text="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-step-continue-button-text")}"
          @click=${this._selectMonthlyPaymentsDispatch}
        >
        </bbva-button-default>
      </div>
    `}get _renderDifferentAmountDetail(){return this._showMonthlyDetail?i`
          <div ambient="primary-alt">
            <bbva-form-input
              type="amount"
              currency-code="${this.currency}"
              local-currency="${this.currency}"
              label="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-input-label")}"
              info-message="${this._inputError?"":`${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-input-info-message")} ${this._maxAmount}`}"
              ?invalid=${this._inputError}
              ?auto-validate=${this._inputError}
              language="${this.language}"
              pattern=""
              error-message="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-input-error-message")}"
              @form-amount-input-change=${this._inputChangesAmount}
              @form-field-input-blur=${this._handlePaymentSimulate}
              @form-field-input-clear=${this._resetResumeDifferentAmount}
              ?reset-value=${!this._showMonthlyDetail}
            ></bbva-form-input>
            ${this._renderDifferentAmountResumeLessThanOneMonthly}
            ${this._renderDifferentAmountResumeMoreThanOneMonthly}
          </div>
        `:y}get _renderDifferentAmountResumeLessThanOneMonthly(){var t,e,n,a,s,o,r,l,c,d,m,u;return this._showLessThanInstallment?y:i`
          <div class="step-container detail">
            ${this._summaryListAmount({leftTextContent:this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-installment-monthly-amount"),leftAmountContent:null===(t=this.microloanPaymentsSimulate)||void 0===t||null===(e=t.monthlyInstallmentAmount)||void 0===e?void 0:e.amount,currency:(null===(n=this.microloanPaymentsSimulate)||void 0===n||null===(a=n.monthlyInstallmentAmount)||void 0===a?void 0:a.currency)||this.currency})}
            ${this._summaryListAmount({leftTextContent:this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-amount-to-advance"),leftAmountContent:null===(s=this.microloanPaymentsSimulate)||void 0===s||null===(o=s.paymentAmount)||void 0===o?void 0:o.amount,currency:(null===(r=this.microloanPaymentsSimulate)||void 0===r||null===(l=r.paymentAmount)||void 0===l?void 0:l.currency)||this.currency})}
            ${this._defineNotificationHelp({message:"lessAmount",isLoading:this.isLoading})}
            ${this._summaryListAmount({leftTextContent:this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-last-installment-amount"),leftAmountContent:null===(c=this.microloanPaymentsSimulate)||void 0===c||null===(d=c.lastInstallmentAmount)||void 0===d?void 0:d.amount,currency:(null===(m=this.microloanPaymentsSimulate)||void 0===m||null===(u=m.lastInstallmentAmount)||void 0===u?void 0:u.currency)||this.currency,isLoading:this.isLoading})}
          </div>
        `}get _renderDifferentAmountResumeMoreThanOneMonthly(){var t,e,n,a,s,o,r,l,c,d,m,u,p,h;const v=1===(null===(t=this.microloanPaymentsSimulate)||void 0===t||null===(e=t.specificDates)||void 0===e?void 0:e.term)?this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-step-installment-to-pay"):this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-step-installments-to-pay");return this._showMoreThanInstallment?y:i`
          <div class="step-container detail">
            ${this._summaryListAmount({leftTextContent:this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-amount-to-advance"),leftAmountContent:null===(n=this.microloanPaymentsSimulate)||void 0===n||null===(a=n.paymentAmount)||void 0===a?void 0:a.amount,currency:(null===(s=this.microloanPaymentsSimulate)||void 0===s||null===(o=s.paymentAmount)||void 0===o?void 0:o.currency)||this.currency})}
            ${this._summaryListAmount({leftTextContent:this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-installment-monthly-amount"),leftAmountContent:null===(r=this.microloanPaymentsSimulate)||void 0===r||null===(l=r.monthlyInstallmentAmount)||void 0===l?void 0:l.amount,currency:(null===(c=this.microloanPaymentsSimulate)||void 0===c||null===(d=c.monthlyInstallmentAmount)||void 0===d?void 0:d.currency)||this.currency})}
            ${He.differentAmountInstallments({leftTextContent:this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-advance-amount"),installments:null===(m=this.microloanPaymentsSimulate)||void 0===m||null===(u=m.specificDates)||void 0===u?void 0:u.term,installmentsString:v,isLoading:this.isLoading})}
            ${this._defineNotificationHelp({message:"moreAmount",isLoading:this.isLoading})}
            ${this._summaryListDate({leftTextContent:this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-last-installment-date"),date:null===(p=this.microloanPaymentsSimulate)||void 0===p||null===(h=p.specificDates)||void 0===h?void 0:h.valueDate,isLoading:this.isLoading})}
          </div>
        `}get _renderFormSelect(){return i`
      <div class="step-container" ambient="primary-alt">
        <div class="step-container-type-text">
          <bbva-type-text
            tag="p"
            text="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-step-description-text")}"
            inherit
            size="S"
          ></bbva-type-text>
        </div>
        <bbva-form-select
          label="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-installments")}"
          required
          selected-index="${this.flagToResetProperties?this._indexDefault:""}"
          info-message="${this._infoMessage}"
          @bbva-form-select-selected-item=${this._itemSelected}
        >
          ${this._renderOptions(this.microloanSpecificAmounts)}
        </bbva-form-select>
      </div>
    `}_renderOptions(t){return t.map(((e,n)=>{var a,s;return i`
        <bbva-form-option
          value="${e.id}"
          extra-label=${n<((null==t?void 0:t.length)??0)-1?be((null==e||null===(a=e.amounts)||void 0===a?void 0:a.amount)??0,null==e||null===(s=e.amounts)||void 0===s?void 0:s.currency,this.language,!0):""}
        >
          ${e.concept}
        </bbva-form-option>
      `}))}get _renderSummaryList(){var t,e,n,a,s,o;return this._showMonthlyDetail?y:i`
          <div class="step-container detail">
            ${this._summaryListAmount({leftTextContent:this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-step-selected-amount"),leftAmountContent:null===(t=this._selectedOption)||void 0===t||null===(e=t.amounts)||void 0===e?void 0:e.amount,currency:null===(n=this._selectedOption)||void 0===n||null===(a=n.amounts)||void 0===a?void 0:a.currency})}
            ${null!==(s=this._selectedOption)&&void 0!==s&&s.maturityDate?this._summaryListDate({leftTextContent:this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-step-continue-last-payment-date"),date:null===(o=this._selectedOption)||void 0===o?void 0:o.maturityDate}):y}
          </div>
        `}_resetMicroloansPaymentSimulateResponse(){_e(this,"reset-payments-simulate-response",!0)}_resetResumeDifferentAmount(t){t&&t.stopPropagation(),this._showLessThanInstallment=!0,this._showMoreThanInstallment=!1,this.isLoading=!0,this._resetMicroloansPaymentSimulateResponse()}_resetValues(){var t,e;this._defaultOption=this.microloanSpecificAmounts.find((t=>1===(null==t?void 0:t.number))),this._selectedOption=this._defaultOption,this._selectedInstallments(this._selectedOption),this._microloanInstallments=this.microloanSpecificAmounts.filter((t=>"differentAmount"!==(null==t?void 0:t.id))),this._lastInstallment=this._microloanInstallments.find(((t,e)=>e===this._microloanInstallments.length-1)),this._maxAmount=be(null===(t=this._lastInstallment)||void 0===t||null===(e=t.amounts)||void 0===e?void 0:e.amount,this.currency,this.language,!0),this._showLessThanInstallment=!0,this._inputError=!1,this._infoMessage=""}_selectAmountData(t){const e={amount:t.amount,currency:t.currency,customFields:`${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-step-custom-fields-deferral")}${this.selectedMicroloan}`};_e(this,"amount-and-currency-selected",e)}_selectedInstallments(t){var e,n;(null===(e=this._defaultOption)||void 0===e?void 0:e.number)===(null==t?void 0:t.number)||(null==t?void 0:t.number)<(null===(n=this._lastInstallment)||void 0===n?void 0:n.number)?this._paymentType=ie:this._paymentType=se}_selectMonthlyPaymentsDispatch(t){var e,n;(t.stopPropagation(),this._differentAmount)?this._buildData({amount:this._differentAmountValue,paymentType:this._paymentType,selectedOption:this.microloanPaymentsSimulate}):this._buildData({amount:null===(e=this._selectedOption)||void 0===e||null===(n=e.amounts)||void 0===n?void 0:n.amount,paymentType:this._paymentType,selectedOption:this._selectedOption});_e(this,"select-monthly-payments",this._selectAmount),_e(this,"complete")}_setValues(){this._differentAmountValue=0,this._showMonthlyDetail=!1,this._inputError=!1,this._differentAmount=!1,this._oldValue="",this._resetResumeDifferentAmount()}_summaryListAmount({leftTextContent:t,leftAmountContent:e=0,currency:n,isLoading:a=!1}){return i`
      <div class="list-amount-item">
        <bbva-type-text text="${t}" tag="span"></bbva-type-text>
        <bbva-type-amount
          amount="${e}"
          currency-code="${n}"
          local-currency="${n}"
          language="${this.language}"
          ?loading="${a}"
          variant="m"
          type="bold"
        >
        </bbva-type-amount>
      </div>
    `}_summaryListDate({leftTextContent:t,date:e,isLoading:n=!1}){return i`
      <div class="list-date-item">
        <bbva-type-text class="resize-flex1" text="${t}" tag="span"></bbva-type-text>
        <bbva-type-date
          font-weight="${p.fontWeight40}"
          font-style="${h.fontStyle20}"
          date="${e}"
          utc
          ?loading="${n}"
          .options="${this.options}"
        ></bbva-type-date>
      </div>
    `}_validateDifferentAmount(){var t,e;this._differentAmountValue<(null===(t=this._defaultOption)||void 0===t||null===(e=t.amounts)||void 0===e?void 0:e.amount)?(this._paymentType=re,this._showLessThanInstallment=!1,this._showMoreThanInstallment=!0):(this._showLessThanInstallment=!0,this._showMoreThanInstallment=!1,this._paymentType=oe)}render(){return i`
      ${this._renderFormSelect} ${this._renderSummaryList} ${this._renderDifferentAmountDetail}
      ${this._renderButtonContinue}
    `}}var qe=c`
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

.accounts-list {
  padding-bottom: 0.5rem;
  display: flex;
  flex-direction: column;
}
.accounts-list [data-tag-name=bbva-notification-help] {
  margin: 0 0 1rem;
}

.account-item-top {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding-top: 1rem;
}

.account-item-bottom {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding-bottom: 1rem;
}
`;const ze=[{id:"btn-close",icon:g(),accessibilityText:"Close"}],Ge=({footerLinkClick:t,footerButtonClick:e,veilClick:n,headerPrimaryClick:a})=>({ERROR_SERVICE_RETRY:{id:"errorModalRetry",fullHeight:!1,headerText:"card-transaction-servicing-finance-transaction-advanced-payments-error-service-retry-modal-header-text",titleIcon:_(),modalType:"warning",bodyText:"card-transaction-servicing-finance-transaction-advanced-payments-error-service-retry-modal-body-text",buttonText:"card-transaction-servicing-finance-transaction-advanced-payments-error-service-retry-modal-button-text",linkText:"card-transaction-servicing-finance-transaction-advanced-payments-error-service-retry-modal-link-text",subtitleText:"",titleText:"",footerButtonClick:e,footerLinkClick:t,veilClick:n,headerPrimaryClick:a},ERROR_SERVICE_EXIT:{id:"retryErrorModal",fullHeight:!1,headerText:"card-transaction-servicing-finance-transaction-advanced-payments-error-service-exit-modal-header-text",titleIcon:_(),modalType:"warning",bodyText:"card-transaction-servicing-finance-transaction-advanced-payments-error-service-exit-modal-body-text",buttonText:"card-transaction-servicing-finance-transaction-advanced-payments-error-service-exit-modal-button-text",linkText:"",subtitleText:"",titleText:"",footerButtonClick:e,footerLinkClick:t,veilClick:n,headerPrimaryClick:a},EXIT_OPERATIVE:{id:"exitModal",fullHeight:!1,headerText:"card-transaction-servicing-finance-transaction-advanced-payments-exit-modal-header-text",titleIcon:b(),modalType:"caution",bodyText:"card-transaction-servicing-finance-transaction-advanced-payments-exit-modal-body-text",buttonText:"card-transaction-servicing-finance-transaction-advanced-payments-exit-modal-button-text",linkText:"card-transaction-servicing-finance-transaction-advanced-payments-exit-modal-link-text",subtitleText:"",titleText:"",footerButtonClick:e,headerPrimaryClick:a}}),Ue=({footerButtonClick:t,headerPrimaryClick:e})=>({id:"onboardingModal",headerType:"modal",titleIcon:"",fullHeight:!0,hideContentPaddingTop:!0,fixedFooter:!0,headerText:"card-transaction-servicing-finance-transaction-advanced-payments-onboarding-modal-header-text",buttonText:"card-transaction-servicing-finance-transaction-advanced-payments-onboarding-modal-button-text",isShowModalWithMicroillustration:!0,headerButtons:ze,content:{microillustration:"calendar",microillustrationSize:"M",texts:[{text:"card-transaction-servicing-finance-transaction-advanced-payments-onboarding-modal-title-text",tag:"h2",size:"XL",fontWeight:p.fontWeight50},{text:"card-transaction-servicing-finance-transaction-advanced-payments-onboarding-modal-body-first-text",tag:"p",fontWeight:p.fontWeight20},{text:"card-transaction-servicing-finance-transaction-advanced-payments-onboarding-modal-body-second-text",tag:"p",fontWeight:p.fontWeight20}]},footerButtonClick:t,headerPrimaryClick:e}),We=(t,{footerButtonClick:e,headerPrimaryClick:n})=>({id:"withoutMicroloansModal",headerText:t.headerText,headerType:"modal",buttonText:"card-transaction-servicing-finance-transaction-advanced-payments-no-movements-modal-button-text",fullHeight:!0,fixedFooter:!0,hideContentPaddingTop:!0,titleIcon:"",isShowModalWithMicroillustration:!0,headerButtons:ze,content:{microillustration:"emptystateday",microillustrationSize:"M",texts:[{text:"card-transaction-servicing-finance-transaction-advanced-payments-no-movements-modal-title",tag:"h4",size:"XL",fontWeight:p.fontWeight50},{text:`card-transaction-servicing-finance-transaction-${t.text}-no-movements-modal-description-text`,tag:"p",fontWeight:p.fontWeight20}]},footerButtonClick:e,headerPrimaryClick:n}),Ye=({footerButtonClick:t,headerPrimaryClick:e})=>({id:"monthlyPaymentErrorModal",headerText:"card-transaction-servicing-finance-transaction-advanced-payments-operative-header-monthly-payment",headerType:"modal",buttonText:"card-transaction-servicing-finance-transaction-advanced-payments-monthly-payment-modal-button-text",fullHeight:!0,fixedFooter:!0,hideContentPaddingTop:!0,titleIcon:"",isShowModalWithMicroillustration:!0,headerButtons:ze,content:{microillustration:"caution",microillustrationSize:"M",texts:[{text:"card-transaction-servicing-finance-transaction-advanced-payments-monthly-payment-modal-title-text",tag:"h2",size:"XL",fontWeight:p.fontWeight50},{text:"card-transaction-servicing-finance-transaction-advanced-payments-monthly-payment-modal-body-text",tag:"p",size:"M",fontWeight:p.fontWeight40}]},footerButtonClick:t,headerPrimaryClick:e}),Ke=t=>({id:"moreThanThreeMicroloansModal",headerText:"card-transaction-servicing-finance-transaction-advanced-payments-select-microloan-step-view-all-microloans-modal-header-text",headerType:"modal",fullHeight:!0,fixedFooter:!0,hideContentPaddingTop:!0,isShowModalWithMicroillustration:!1,headerButtons:ze,canSelect:t.canSelect,content:{textLeft:"card-transaction-servicing-finance-transaction-advanced-payments-select-microloan-step-all-microloans-modal-payments-text",textRight:"card-transaction-servicing-finance-transaction-advanced-payments-select-microloan-step-all-microloans-modal-pending-debt-text"},hideBottomPart:t.hideBottomPart,response:t.response}),Xe=t=>({id:"moreThanThreeAccountsModal",headerText:"card-transaction-servicing-finance-transaction-advanced-payments-select-origin-account-step-view-all-accounts-modal-header-text",headerType:"modal",fullHeight:!0,fixedFooter:!1,hideContentPaddingTop:!0,isShowModalWithMicroillustration:!1,canSelect:t.canSelect,headerButtons:ze,content:{textLeft:"card-transaction-servicing-finance-transaction-advanced-payments-select-microloan-step-all-microloans-modal-payments-text",textRight:"card-transaction-servicing-finance-transaction-advanced-payments-select-microloan-step-all-microloans-modal-pending-debt-text",errorMessage:"card-transaction-servicing-finance-transaction-advanced-payments-select-origin-account-step-view-all-accounts-modal-insufficient-funds-error-text",errorIcon:_()},hideBottomPart:!1,response:t.response}),Je=({footerButtonClick:t})=>({id:"changeOperative",fullHeight:!1,headerText:"card-transaction-servicing-finance-transaction-advanced-payments-change-process-modal-header-text",titleIcon:b(),modalType:"caution",hideContentPaddingTop:!0,bodyText:"card-transaction-servicing-finance-transaction-advanced-payments-change-process-modal-body-text",buttonText:"card-transaction-servicing-finance-transaction-advanced-payments-change-process-modal-button-text",linkText:"card-transaction-servicing-finance-transaction-advanced-payments-change-process-modal-link-text",subtitleText:"",titleText:"",footerButtonClick:t}),Qe=({overdueFee:t})=>({id:"overduePaymentFeeModal",headerText:"card-transaction-servicing-finance-transaction-advanced-payments-overdue-payment-step-overdue-penalty-modal-header",titleIcon:v(),headerType:"modal",fullHeight:!0,fixedFooter:!0,hideContentPaddingTop:!1,buttonText:"card-transaction-servicing-finance-transaction-advanced-payments-overdue-payment-step-overdue-penalty-modal-button-text",isShowModalWithMicroillustration:!0,headerButtons:ze,content:{texts:[{text:"card-transaction-servicing-finance-transaction-advanced-payments-overdue-payment-step-overdue-penalty-modal-header",tag:"h2",fontWeight:p.fontWeight50,size:"L"},{text:"card-transaction-servicing-finance-transaction-advanced-payments-overdue-payment-step-overdue-penalty-modal-amount-first",tag:"p",size:"S",fontWeight:p.fontWeight20,isOverdue:!0},{text:"card-transaction-servicing-finance-transaction-advanced-payments-overdue-payment-step-overdue-penalty-modal-description",tag:"p",size:"S",fontWeight:p.fontWeight20}]},overdueFee:t.amount});class Ze extends(d(A(T(m(e))))){static get is(){return"select-origin-account"}static get scopedElements(){const t=[yt,w,N,q,$,k,M,_,O,R,...Ze.configurationScopedElements()];return Ze.scopedElementsFromClasses(t)}static get properties(){return{accountsErrorVisible:{type:Boolean,attribute:"accounts-error-visible"},accountsResponse:{type:Array,attribute:"accounts-response"},isRetry:{type:Boolean,attribute:"is-retry"},payment:{type:Object,attribute:"total-pay"}}}constructor(){super(),this.accountsErrorVisible=!1,this.accountsResponse=[],this.isRetry=!1,this.language="",this.operativeId="",this.payment={}}static get styles(){return[qe,vt.primaryAlt,z.primaryAlt,F.primaryAlt,D.primaryAlt,I.primaryAlt,V.primaryAlt,E.primaryAlt,u("select-origin-account-shared-styles")]}get parsedAccount(){return xe("accountsModal",this.validateAccount)}get validateAccount(){return this.accountsResponse.map((t=>{var e;return{...t,isValidateAccount:Number(null==t?void 0:t.amount)>(null===(e=this.payment)||void 0===e?void 0:e.amount)}}))}_openAccountsListModal(t){t.stopPropagation();const e=Xe({canSelect:!1,response:this.parsedAccount});_e(this,"modal-show",e)}get _renderAccountsError(){return this.accountsErrorVisible?i`
          <bbva-notification-message
            variant="error"
            id="notification-message"
            book-title
            message-title="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-origin-account-step-loading-accounts-error")}"
            link-title="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-origin-account-step-loading-accounts-error-retry")}"
            @notification-message-link-click="${this._retryError}"
          >
          </bbva-notification-message>
        `:y}_renderAccountsList(t){return t.map(((t,e)=>e<3?i`
            <bbva-type-link class="accounts-list" @click=${e=>this._selectOriginAccountDispatch(e,t)}>
              <div class="account-item-top">
                ${this._renderLinkOrText(t)}
                <bbva-type-amount
                  amount="${null==t?void 0:t.amount}"
                  currency-code="${null==t?void 0:t.currency}"
                  local-currency="${null==t?void 0:t.currency}"
                  language="${this.language}"
                  type="bold"
                ></bbva-type-amount>
              </div>
              <div class="account-item-bottom">
                <bbva-badge-reference number="${null==t?void 0:t.number}"></bbva-badge-reference>
                <bbva-type-text
                  text="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-origin-account-step-accounts-available-balance-text")}"
                  tag="span"
                  size="S"
                ></bbva-type-text>
              </div>
              ${this._renderErrorInsufficientBalance(t)}
              <bbva-divider-default size="full"></bbva-divider-default>
            </bbva-type-link>
          `:y))}get _renderAfterRetryThreeTimes(){return this.accountsErrorVisible?i`
          <bbva-notification-message
            variant="error"
            book-title
            message-title=${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-origin-account-step-loading-accounts-error-after-retry")}
            link-title=${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-origin-account-step-loading-accounts-error-after-retry-exit")}
            @notification-message-link-click="${this._retryError}"
          >
          </bbva-notification-message>
        `:y}_renderErrorInsufficientBalance(t){var e;return(null===(e=this.payment)||void 0===e?void 0:e.amount)>(null==t?void 0:t.amount)?i`
          <bbva-notification-help
            accessibility-label-icon="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-accessibility-label-icon-alert")}"
            variant="alert"
            icon="${_()}"
            text="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-origin-account-step-insufficient-funds-error")}"
          ></bbva-notification-help>
        `:y}_renderLinkOrText(t){var e;return(null===(e=this.payment)||void 0===e?void 0:e.amount)>(null==t?void 0:t.amount)?i` <bbva-type-text text=${null==t?void 0:t.productName} tag="span" size="L"> </bbva-type-text> `:i`
          <bbva-type-link

          > <span>${null==t?void 0:t.productName}</span>
        </bbva-type-link>
        `}_renderViewAllLink(t){return(null==t?void 0:t.length)>3?i`
          <bbva-header-category
            option-link="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-origin-account-step-view-all-accounts-link-text")}"
            text="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-origin-account-step-view-all-accounts-header-text")}"
            @header-category-link-click=${this._openAccountsListModal}
          ></bbva-header-category>
        `:y}_retryError(t){t.stopPropagation(),_e(this,"retry-accounts-service","GETACCOUNTS")}_selectOriginAccountDispatch(t,e){t.stopPropagation();const{productName:n,amount:a,currency:i,number:s}=e;_e(this,"select-origin-account",{productName:n,amount:a,currency:i,number:s}),_e(this,"complete"),"overduePayment"===this.operativeId?_e(this,"confirm-overdue-payment"):"monthlyPayment"===this.operativeId?_e(this,"confirm-monthly-payment"):_e(this,"confirm-advance-payment")}render(){return i`
      <div class="content" ambient="primary-alt">
        <bbva-type-text
          text="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-origin-account-step-description-text")}"
          tag="p"
          size="S"
          inherit
        ></bbva-type-text>
        ${this._renderViewAllLink(this.accountsResponse)}
        ${this._renderAccountsList(this.accountsResponse)}
        ${this.isRetry?this._renderAccountsError:this._renderAfterRetryThreeTimes}
      </div>
    `}}var tn=c`
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

.account-list-container {
  padding-bottom: 0.5rem;
}

.account-list-item-top {
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.account-list-item-bottom {
  display: flex;
  justify-content: space-between;
  align-items: center;
}
`;class en extends(d(A(T(m(e))))){static get is(){return"select-origin-account-summary"}static get scopedElements(){const t=[yt,$,M,...en.configurationScopedElements()];return en.scopedElementsFromClasses(t)}static get properties(){return{selectedValues:{type:Object,attribute:"selected-values"}}}constructor(){super(),this.language="",this.selectedValues={}}static get styles(){return[tn,I.secondary,vt.secondary,E.secondary,u("select-origin-account-summary-shared-styles")]}_accountSummary({productName:t,amount:e,currency:n,number:a}){return i`
      <div class="account-list-container" ambient="secondary">
        <div class="account-list-item-top">
          <bbva-type-text text="${t}" tag="span" size="S"></bbva-type-text>
          <bbva-type-amount
            amount="${e}"
            currency-code="${n}"
            local-currency="${n}"
            language="${this.language}"
            type="bold"
          ></bbva-type-amount>
        </div>
        <div class="account-list-item-bottom">
          <bbva-badge-reference number="${a}"></bbva-badge-reference>
          <bbva-type-text
            text="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-origin-account-step-summary-available-balance-text")}"
            tag="span"
            size="S"
          ></bbva-type-text>
        </div>
      </div>
    `}get _renderSummaryContent(){return i` <div>${this._accountSummary(this.selectedValues)}</div> `}render(){return i` ${this._renderSummaryContent} `}}class nn extends(d(A(T(m(e))))){static get is(){return"advance-payments-multistep"}static get scopedElements(){const t=[C,Z,tt,$,M,q,G,ge,Te,Pe,Ee,Ce,Le,De,Ne,ke,je,He,Ze,en,...nn.configurationScopedElements()];return nn.scopedElementsFromClasses(t)}static get properties(){return{accountsError:{type:Object,attribute:"accounts-error"},accountsResponse:{type:Array,attribute:"accounts-response"},collapseStep:{type:String,attribute:"collapse-step"},collapsedStepSelectAccount:{type:Object,attribute:"collapsed-step-select-account"},currency:{type:String},chargeAccount:{type:String,attribute:"charge-account"},financingLineDetail:{type:Object,attribute:"financing-line-detail"},financingLinePaymentsSimulate:{type:String,attribute:"financing-line-payments-simulate"},internalContract:{type:String,attribute:"internal-contract"},microloanPaymentsSimulate:{type:Object,attribute:"microloan-payments-simulate"},microloansDetail:{type:Array,attribute:"microloans-detail"},microloanSpecificAmounts:{type:Array,attribute:"microloan-specific-amounts"},operativeId:{type:String,attribute:"operative-id"},operatives:{type:Object},paymentAmountId:{type:String,attribute:"payment-amount-id"},selectMicroloan:{type:Object,attribute:"select-microloan"},showMultistep:{type:Boolean},_advancePaymentVersionFlag:{type:Boolean},_flagToResetAdvancePaymentType:{type:Boolean},_isCompletedAccountStep:{type:Boolean},_isCompleteSelectMicroloan:{type:Boolean},_isCompleteSelectMonthlyPayment:{type:Boolean},_isCompleteSelect:{type:Boolean},_oldSelectedOptionPayment:{type:String},_paymentTypeId:{type:String},_resetPropertiesStep3:{type:Boolean},_resetStep:{type:Boolean},_selectedAdvancePaymentType:{type:String},_selectedAmount:{type:Number},_selectedInstallmentsOption:{type:Object},_selectedMicroloanDetail:{type:Object},_selectedOriginAccountDetail:{type:Object},_totalDebtVersionFlag:{type:Boolean},_totalPay:{type:Object},_typePay:{type:String},_validateExitFromMonthlyStep:{type:Boolean},_monthlyVersionFlag:{type:Boolean},_overdueVersionFlag:{type:Boolean}}}constructor(){super(),this.accountsError={},this.accountsResponse=[],this.collapseStep="",this.collapsedStepSelectAccount={},this.currency="",this.chargeAccount="",this.financingLineDetail={},this.financingLinePaymentsSimulate="",this.internalContract="INTERNAL_CONTRACT",this.iOSFixedHeader=!1,this.language="",this.microloanPaymentsSimulate={},this.microloansDetail=[],this.microloanSpecificAmounts=[],this.operativeId="",this.operatives=Qt,this.paymentAmountId="",this.selectMicroloan={},this.showMultistep=!1,this._advancePaymentVersionFlag=!1,this._flagToResetAdvancePaymentType=!1,this._isCompletedAccountStep=!1,this._isCompleteSelect=!1,this._isCompleteSelectMicroloan=!1,this._isCompleteSelectMonthlyPayment=!1,this._monthlyVersionFlag=!1,this._oldSelectedOptionPayment="",this._overdueVersionFlag=!1,this._paymentTypeId="",this._resetPropertiesStep3=!1,this._resetStep="",this._selectedAdvancePaymentType="",this._selectedAmount=0,this._selectedInstallmentsOption={},this._selectedMicroloanDetail={},this._selectedOriginAccountDetail={},this._totalDebtVersionFlag=!1,this._totalPay={},this._typePay="",this._validateExitFromMonthlyStep=!1}static get styles(){return[Xt,E.primaryAlt,I.primaryAlt,L.primaryAlt,Jt,u("advance-payments-multistep-shared-styles")]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._handleHeaderBack()}completeStep({detail:t}){var e;(this._typePay=t,"settleTotalDebt"===this._typePay)?(this._totalDebtVersionFlag=!0,this._totalPay=(null===(e=this.financingLineDetail)||void 0===e?void 0:e.disposedBalance)||0,this._paymentTypeId=le,_e(this,"accounts-service-execute",!0)):this._totalDebtVersionFlag=!1;t!==this._oldSelectedOptionPayment&&(this._flagToResetAdvancePaymentType=!0,this._oldSelectedOptionPayment=t,this._dynamicSteps(this._totalDebtVersionFlag,"step-2"),this._resetPropertiesStep3=!0),this._selectedAdvancePaymentType=ne[this._typePay],this._isCompleteSelect=!1}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this._removeHeaderBack()}editStep(t){t.stopPropagation(),0===(null==t?void 0:t.detail)&&(this._resetPropertiesStep3=!0,this._isCompleteSelectMicroloan=!1,this._isCompleteSelectMonthlyPayment=!1,this._isCompletedAccountStep=!1,this._isCompleteMonthlyStep=!1),1===(null==t?void 0:t.detail)&&(this._resetPropertiesStep3=!0,this._isCompletedAccountStep=!1,this._isCompleteSelectMicroloan=!1,this._isCompleteSelectMonthlyPayment=!1,this._isCompletedAccountStep=!1),2!==(null==t?void 0:t.detail)&&3!==(null==t?void 0:t.detail)||(this._isCompletedAccountStep=!1)}firstUpdated(){super.firstUpdated&&super.firstUpdated(),this.selectSteps()}selectSteps(){"overduePayment"===this.operativeId?this._overdueVersionFlag=!0:"monthlyPayment"===this.operativeId?this._monthlyVersionFlag=!0:this._advancePaymentVersionFlag=!0}updated(t){super.updated(t),t.has("collapseStep")&&"changeOperative"===this.collapseStep&&(this.completeStep({detail:"settleTotalDebt"}),this._isCompleteSelect=!0,this.collapseStep=""),t.has("selectMicroloan")&&Object.keys(this.selectMicroloan).length>0&&this._completeSelectMicroloanStep(this.selectMicroloan),t.has("collapsedStepSelectAccount")&&Object.keys(this.collapsedStepSelectAccount).length>0&&this._completeSelectOriginAccountStep(this.collapsedStepSelectAccount)}_completeMonthlyPaymentStep(t,e){t.stopPropagation(),this._dynamicSteps(!0,"monthly-step"),this._totalPay={amount:e,currency:this.currency},this._paymentTypeId=ce,this._validateExitFromMonthlyStep="monthlyPayment"===this.operativeId,_e(this,"monthly-amount-payment",this._totalPay),_e(this,"accounts-service-execute",!0)}_completeMonthlyPaymentsStep(t){var e,n,a,i,s,o,r,l,c;this._selectedInstallmentsOption=null==t?void 0:t.detail,this._totalPay={amount:null==t||null===(e=t.detail)||void 0===e?void 0:e.amount,currency:this.currency},this._paymentTypeId=null==t||null===(n=t.detail)||void 0===n?void 0:n.paymentType,this._isCompleteSelectMonthlyPayment=!0;const d=null!==(a=this._selectedInstallmentsOption)&&void 0!==a&&null!==(i=a.selectedOption)&&void 0!==i&&i.concept?null===(s=this._selectedInstallmentsOption)||void 0===s||null===(o=s.selectedOption)||void 0===o?void 0:o.number:null===(r=this._selectedInstallmentsOption)||void 0===r||null===(l=r.selectedOption)||void 0===l||null===(c=l.specificDates)||void 0===c?void 0:c.term;_e(this,"accounts-service-execute",!0),_e(this,"account-select",{customFields:`${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-step-custom-fields-deferral")}${this._selectedMicroloanDetail.concept}${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-step-custom-fields-installments")}${d}`})}_completeOverduePaymentStep({detail:t}){this._dynamicSteps(!0,"overdue-step"),this._selectedAmount=t.import,this._totalPay={amount:this._selectedAmount,currency:this.currency},this._paymentTypeId=null==t?void 0:t.paymentType,_e(this,"overdue-payment-amount",this._totalPay),_e(this,"accounts-service-execute",!0)}_completeSelectMicroloanStep(t){var e;this._selectedMicroloanDetail=null==t?void 0:t.detail,this._isCompleteSelectMicroloan=!0,this._resetPropertiesStep3=!1,_e(this,"specific-amount-execute",null===(e=this._selectedMicroloanDetail)||void 0===e?void 0:e.id)}_completeSelectOriginAccountStep(t){this._isCompletedAccountStep=!0,this._selectedOriginAccountDetail=(null==t?void 0:t.detail)||(null==t?void 0:t.selectAccount)}_dynamicSteps(t,e){const n=this.shadowRoot.querySelector('[data-tag-name="bbva-expandable-multistep"]'),a=["step-1","step-2","step-3","step-4","step-5"],i=["step-1",`${e}`,"step-5"];n.activeSteps=t?i:a}_getVariableStepInfo(t){return{step:t,total:"settleTotalDebt"===this._typePay||"advancePayment"!==this.operativeId?2:4}}_handleHeaderBack(){this.addEventListener("header-main-icon-click",(()=>{this._modalExitOperative()}))}_modalExitOperative(){""!==this._selectedAdvancePaymentType||0!==this._selectedAmount||this._validateExitFromMonthlyStep?_e(this,"manage-reset-advance-payments"):_e(this,"advance-payments-exit")}_openSuccessModalDispatch(){var t;const e={account:this._selectedOriginAccountDetail,settleTotalDebtFlag:this._totalDebtVersionFlag,microloanDetail:null===(t=this._selectedMicroloanDetail)||void 0===t?void 0:t.concept,paymentTypeId:this._paymentTypeId};_e(this,"success-modal-open",e)}_removeHeaderBack(){this.removeEventListener("header-main-icon-click",this._modalExitOperative.bind(this),!0)}get _renderFinancingLineStep(){return i`
      <bbva-expandable-step
        id="step-1"
        header="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-financing-line-info-header")}"
        prefilled
      >
        <div class="summary" slot="summary">
          <financing-line-info
            .financingLineDetail=${this.financingLineDetail}
            .operativeId=${this.operativeId}
            language="${this.language}"
          >
          </financing-line-info>
        </div>
      </bbva-expandable-step>
    `}get _renderMonthlyPaymentStep(){return this._monthlyVersionFlag?i` <bbva-expandable-step
          id="monthly-step"
          ?hide-padding-top="${!0}"
          header-completed-ellipsis
          header="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-monthly-payment-step-header")}"
          is-dynamic-handler
          edit-label="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-overdue-payment-step-edit-label")}"
          show-link
          current-step-label="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-multistep-current-step-label",this._getVariableStepInfo(1))}"
          @complete=${t=>{var e,n;return this._completeMonthlyPaymentStep(t,null===(e=this.financingLineDetail)||void 0===e||null===(n=e.totalInstallmentMonthlyAmount)||void 0===n?void 0:n.amount)}}
        >
          <div class="content">
            <monthly-detail-opened
              language="${this.language}"
              .microloansResponse=${this.microloansDetail}
            >
            </monthly-detail-opened>
          </div>
          <div class="summary" slot="summary">
            <monthly-detail-collapsed
              language="${this.language}"
              .microloansResponse=${this.microloansDetail}
              .financingLineResponse=${this.financingLineDetail}
            >
            </monthly-detail-collapsed>
          </div>
        </bbva-expandable-step>`:y}get _renderMultistep(){return i`
      <bbva-expandable-multistep
        step-selector="${'[data-tag-name="bbva-expandable-step"]'}"
        @expandable-step-edit-step=${this.editStep}

      >
        <div slot="content">
          ${this._renderFinancingLineStep} ${this._renderSelectAdvancePaymentTypeStep}
          ${this._renderSelectMicroloanStep} ${this._renderSelectMonthlyPayment}
          ${this._renderOverduePaymentStep} ${this._renderMonthlyPaymentStep}
          ${this._renderSelectOriginAccount}
        </div>
        <div class="confirm-step" slot="confirmation" ambient="primary-alt">
          ${this._summaryButton}
        </div>
      </bbva-expandable-multistep>
    `}get _renderOverduePaymentStep(){return this._overdueVersionFlag&&!this._monthlyVersionFlag?i`
          <bbva-expandable-step
            show-link
            ?hide-padding-top="${!0}"
            id="overdue-step"
            header="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-overdue-payment-step-header")}"
            edit-label="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-overdue-payment-step-edit-label")}"
            current-step-label="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-multistep-current-step-label",this._getVariableStepInfo(1))}"
            @card-transaction-servicing-finance-transaction-advanced-payments-overdue-payment-step-complete="${this._completeOverduePaymentStep}"
          >
            <div class="content">
              <import-payment
                currency="${this.currency}"
                language="${this.language}"
                .financialResponse=${this.financingLineDetail}
                .partialOverdue=${this.financingLinePaymentsSimulate}
              >
              </import-payment>
            </div>
            <div class="summary" slot="summary">
              <import-payment-collapsed
                language="${this.language}"
                selected-import=${this._selectedAmount}
                .financialResponse=${this.financingLineDetail}
                .partialOverdue=${this.financingLinePaymentsSimulate}
              >
              </import-payment-collapsed>
            </div>
          </bbva-expandable-step>
        `:y}get _renderSelectAdvancePaymentTypeStep(){var t;return this._advancePaymentVersionFlag?i`
          <bbva-expandable-step
            show-link
            id="step-2"
            header="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-advance-payment-type-step-header")}"
            header-completed-ellipsis
            edit-label="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-advance-payment-type-step-edit-label")}"
            current-step-label="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-multistep-current-step-label",this._getVariableStepInfo(1))}"
            @card-transaction-servicing-finance-transaction-advanced-payments-select-advance-payment-type-complete=${this.completeStep}
            ?completed=${this._isCompleteSelect}
            is-dynamic-handler
            ?hide-padding-top="${!0}"
          >
            <div class="content">
              <select-advance-payment-type
                language="${this.language}"
                .microloansResponse="${this.microloansDetail}"
                ?reset-step=${this._flagToResetAdvancePaymentType}
              ></select-advance-payment-type>
            </div>
            <div class="summary" slot="summary">
              <select-advance-payment-type-summary
                .currency="${this.currency}"
                .language="${this.language}"
                .disposedBalanceAmount=${null===(t=this.financingLineDetail)||void 0===t?void 0:t.disposedBalance}
                selected-payment-type=${this._selectedAdvancePaymentType}
                .microloans=${this.microloansDetail}
                ?is-total-debt=${this._totalDebtVersionFlag}
              >
              </select-advance-payment-type-summary>
            </div>
          </bbva-expandable-step>
        `:y}get _renderSelectMicroloanStep(){return this._advancePaymentVersionFlag?i`
          <bbva-expandable-step
            show-link
            id="step-3"
            header="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-microloan-step-header")}"
            edit-label="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-microloan-step-edit-label")}"
            current-step-label="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-multistep-current-step-label",this._getVariableStepInfo(2))}"
            @card-transaction-servicing-finance-transaction-advanced-payments-select-microloan=${this._completeSelectMicroloanStep}
            ?completed=${this._isCompleteSelectMicroloan}
            ?active=${!this._isCompleteSelectMicroloan}
            ?hide-padding-top="${!0}"
            header-completed-ellipsis
          >
            <div class="content">
              <select-microloan
                language="${this.language}"
                .microloansResponse="${this.microloansDetail}"
              >
              </select-microloan>
            </div>
            <div class="summary" slot="summary">
              <select-microloan-summary
                language="${this.language}"
                .selectedValues=${this._selectedMicroloanDetail}
              >
              </select-microloan-summary>
            </div>
          </bbva-expandable-step>
        `:y}get _renderSelectMonthlyPayment(){var t,e;return this._advancePaymentVersionFlag?i`
          <bbva-expandable-step
            show-link
            id="step-4"
            header="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-step-header")}"
            current-step-label="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-multistep-current-step-label",this._getVariableStepInfo(3))}"
            edit-label="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-step-edit-label")}"
            ?hide-padding-top="${!0}"
            ?completed=${this._isCompleteSelectMonthlyPayment}
            @card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments=${t=>this._completeMonthlyPaymentsStep(t)}
          >
            <div class="content">
              ${(null===(t=this.microloanSpecificAmounts)||void 0===t?void 0:t.length)>0?i`
                    <select-monthly-payment-opened
                      .currency="${this.currency}"
                      .language="${this.language}"
                      .flagToResetProperties=${this._resetPropertiesStep3}
                      .microloanSpecificAmounts=${this.microloanSpecificAmounts}
                      .microloanPaymentsSimulate=${this.microloanPaymentsSimulate}
                      .selectedMicroloan=${this._selectedMicroloanDetail.concept}
                      .paymentAmountId=${this.paymentAmountId}
                    >
                    </select-monthly-payment-opened>
                  `:y}
            </div>
            <div class="summary" slot="summary">
              ${(null===(e=Object.keys(this._selectedInstallmentsOption))||void 0===e?void 0:e.length)>0?i`
                    <select-monthly-payment-collapsed
                      currency="${this.currency}"
                      language="${this.language}"
                      .selectedOption=${this._selectedInstallmentsOption}
                    >
                    </select-monthly-payment-collapsed>
                  `:y}
            </div>
          </bbva-expandable-step>
        `:y}get _renderSelectOriginAccount(){var t,e;const n="advancePayment"===this._typePay?4:2;return i`
      <bbva-expandable-step
        show-link
        id="step-5"
        header="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-origin-account-step-header")}"
        edit-label="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-origin-account-step-edit-label")}"
        ?hide-padding-top="${!0}"
        current-step-label="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-multistep-current-step-label",this._getVariableStepInfo(n))}"
        @card-transaction-servicing-finance-transaction-advanced-payments-select-origin-account=${t=>this._completeSelectOriginAccountStep(t)}
        ?completed=${this._isCompletedAccountStep}
      >
        <div class="content">
          <select-origin-account
            language="${this.language}"
            .payment=${this._totalPay}
            .accountsResponse=${this.accountsResponse}
            .accountsErrorVisible=${null===(t=this.accountsError)||void 0===t?void 0:t.visible}
            .isRetry=${null===(e=this.accountsError)||void 0===e?void 0:e.isRetry}
            .operativeId=${this.operativeId}
          >
          </select-origin-account>
        </div>
        <div class="summary" slot="summary">
          <select-origin-account-summary
            language="${this.language}"
            .selectedValues=${this._selectedOriginAccountDetail}
          >
          </select-origin-account-summary>
        </div>
      </bbva-expandable-step>
    `}_requesBody(){var t,e;return{paymentAmount:{amount:null===(t=this._totalPay)||void 0===t?void 0:t.amount,currency:this.currency},paymentType:this._paymentTypeId,relatedContracts:[{relationType:{id:this.chargeAccount},contractDetails:{contractType:"INTERNAL_CONTRACT",number:null===(e=this._selectedOriginAccountDetail)||void 0===e?void 0:e.number}}]}}get _summaryButton(){var t;const e="settleTotalDebt"===this._typePay||"advancePayment"!==this.operativeId||this._paymentTypeId===re?"settle":"advanced-payments";return i`
      <div class="panel-summary" ambient="primary-alt">
        <bbva-type-text
          text="${this.t(`card-transaction-servicing-finance-transaction-${e}-multistep-summary-payment-amount`)}"
          tag="p"
          size="S"
          inherit
        ></bbva-type-text>
        <bbva-type-amount
          amount="${null===(t=this._totalPay)||void 0===t?void 0:t.amount}"
          currency-code="${this.currency}"
          local-currency="${this.currency}"
          language="${this.language}"
          type="bold"
          variant="3xl"
        ></bbva-type-amount>
        <bbva-button-default
          fullwidth
          variant="positive"
          text="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-multistep-summary-confirm-button-text")}"
          class="button"
          @click=${this.summaryButtonHandleEvent}
        >
        </bbva-button-default>
      </div>
    `}summaryButtonHandleEvent(t){t.stopPropagation(),this._validatePaymentType(),this._openSuccessModalDispatch()}_validatePaymentType(){const t=this._requesBody();"advancePayment"===this.operativeId&&"advancePayment"===this._typePay?_e(this,"execute-microloan-payments-post-response",t):_e(this,"execute-financingline-payments-post",t)}get _renderModal(){const t=[{id:"btn-close",icon:g(),accessibilityText:"card-transaction-servicing-finance-transaction-advanced-payments-accessibility-close-button"}];return i`
        <bbva-help-modal
          full-height
          ?visible=${this.showMultistep}
          ?i-o-s-fixed-header="${this.iOSFixedHeader}"
          hide-content-padding-top
          ambient="primary-alt"
        >
          <div slot="slot-content-header">
            <bbva-header-main
              text="${this.operatives[this.operativeId]}"
              variant="modal-initial-secondary"
              .buttons="${r(t)}"
            ></bbva-header-main>
          </div>
          <div class="content" slot="slot-content">
            ${this._renderMultistep}
          </div>
        </bbva-help-modal>
      `}render(){return i` ${super.render()} ${this._renderModal} `}}var an=c`
:host {
  display: block;
  box-sizing: border-box;
  --_card-transaction-servicing-finance-transaction-advanced-payments-list-item-margin: rem(8px), 0;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.microillustration-container {
  display: flex;
  flex-direction: column;
  row-gap: 1rem;
}

.payment-description-container {
  display: flex;
  flex-direction: column;
  row-gap: 0.5rem;
  margin: 1rem 0;
}

.item-value-content {
  display: flex;
  justify-content: space-between;
  margin-top: 1rem;
}
.item-value-content .resize-flex1 {
  flex: 1;
}
.item-value-content .resize-flex2 {
  flex: 2;
}

[data-tag-name=bbva-notification-message] {
  margin-top: 1rem;
}

.share-button {
  margin-top: 2rem;
}
`;class sn extends(d(A(T(m(e))))){static get is(){return"success-advance-payment"}static get scopedElements(){const t=[U,W,N,O,$,P,M,...sn.configurationScopedElements()];return sn.scopedElementsFromClasses(t)}static get properties(){return{dataFromMultistep:{type:Object,attribute:"data-from-multistep"},localCurrency:{type:String,attribute:"local-currency"},operativeId:{type:String,attribute:"operative-id"},dateOptions:{type:Object},paymentAmounts:{type:Object},responseDataPayment:{type:Object,attribute:"response-data-payment"},settleTotalDebtFlag:{type:Boolean,attribute:"settle-total-debt-flag"},userEmail:{type:String,attribute:"user-email"},_notificationMessageText:{type:String}}}constructor(){super(),this.dataFromMultistep={},this.language="",this.localCurrency="",this.operativeId="",this.dateOptions={day:"2-digit",month:"short",year:"numeric"},this.paymentAmounts={},this.responseDataPayment={},this.settleTotalDebtFlag=!1,this.userEmail="",this._notificationMessageText=""}static get styles(){return[an,Y.primaryAlt,E.primaryAlt,F.primaryAlt,I.primaryAlt,H.primaryAlt,u("success-advance-payment-shared-styles")]}get _hasInstallments(){var t;return this._isAdvanceInstallment||this._isMoreThanOneInstallmentAmount||this._isAdvanceAllInstallments?i`
          <div class="item-value-content">
            ${this._renderText({text:this.t("card-transaction-servicing-finance-transaction-advanced-payments-success-advance-payments-detail-description-paid-installments"),classes:"resize-flex2"})}
            ${this._renderText({text:null===(t=this.responseDataPayment)||void 0===t?void 0:t.paidInstallmentsNumber,classes:"resize-flex1",fontWeight:p.fontWeight40,alignment:"right"})}
          </div>
        `:y}get _hasLastInstallment(){var t,e;return this._isLessThanOneInstallmentAmount?i`
          <div class="item-value-content">
            ${this._renderText({text:this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-last-installment-amount"),classes:"flex2"})}
            ${this._renderText({amount:null===(t=this.paymentAmounts)||void 0===t||null===(e=t.lastInstallment)||void 0===e?void 0:e.amount,fontWeight:"bold",size:"m"})}
          </div>
        `:y}get _hasLastPaymentDate(){var t;return this._isAdvanceInstallment||this._isMoreThanOneInstallmentAmount?i`
          <div class="item-value-content">
            ${this._renderText({text:this._selectTypeDate,classes:"resize-flex2"})}
            ${this._renderDate({date:null===(t=this.responseDataPayment)||void 0===t?void 0:t.lastPaymentDate,fontWeight:p.fontWeight40,fontStyle:h.fontStyle20})}
          </div>
        `:y}get _hasMicroloan(){var t,e;return"advancePayment"!==this.operativeId||null!==(t=this.dataFromMultistep)&&void 0!==t&&t.settleTotalDebtFlag?y:i`
          <div class="item-value-content">
            ${this._renderText({text:"card-transaction-servicing-finance-transaction-advanced-payments-success-advance-payments-detail-description-selected-microloan"})}
            ${this._renderText({text:null===(e=this.responseDataPayment)||void 0===e?void 0:e.concept,fontWeight:p.fontWeight40,alignment:"right"})}
          </div>
        `}get _hasOverduePayment(){var t,e;return this._isLessThanTotalOverdueAmount?i`
          <div class="item-value-content">
            ${this._renderText({text:this.t("card-transaction-servicing-finance-transaction-advanced-payments-success-advance-payments-detail-description-pending-debt"),classes:"flex1"})}
            ${this._renderText({amount:null===(t=this.paymentAmounts)||void 0===t||null===(e=t.overdueAmount)||void 0===e?void 0:e.amount,classes:"resize-flex1",fontWeight:"bold",size:"m"})}
          </div>
        `:y}get _isAdvanceAllInstallments(){return this.dataFromMultistep.paymentTypeId===se}get _isAdvanceInstallment(){return this.dataFromMultistep.paymentTypeId===ie}get _isLessThanOneInstallmentAmount(){return this.dataFromMultistep.paymentTypeId===re}get _isLessThanTotalOverdueAmount(){return this.dataFromMultistep.paymentTypeId===de}get _isMoreThanOneInstallmentAmount(){return this.dataFromMultistep.paymentTypeId===oe}get _notificationMessage(){return"advancePayment"===this.operativeId?i`
          <bbva-notification-message
            variant="default"
            message-title="${this._notificationMessageText}"
            book-title
          ></bbva-notification-message>
        `:y}get _renderMicroillustration(){return i`
      <div class="microillustration-container">
        <bbva-clip-microillustration
          microillustration="success"
          size="S"
        ></bbva-clip-microillustration>
        <bbva-type-text
          text="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-success-advance-payments-successful-operation")}"
          font-weight="${p.fontWeight50}"
          tag="h1"
          inherit
        ></bbva-type-text>
      </div>
    `}get _renderPaymentAmount(){var t,e;const n="advancePayment"===this.operativeId?"advance":"paid";return i`
      <div class="payment-description-container">
        <bbva-type-text
          text="${this.t(`card-transaction-servicing-finance-transaction-advanced-payments-success-advance-payments-${n}-amount`)}"
          tag="p"
          inherit
        ></bbva-type-text>
        ${this._renderText({amount:null===(t=this.paymentAmounts)||void 0===t||null===(e=t.paymentAmount)||void 0===e?void 0:e.amount,size:"3xl",fontWeight:"bold"})}
      </div>
    `}get _renderPaymentDetailHeader(){return i`
      <bbva-header-category
        text="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-success-advance-payments-payment-detail-header")}"
      ></bbva-header-category>
    `}get _renderSuccessDetail(){var t,e,n,a,s,o,r,l;return i`
      <div>
        <div class="item-value-content">
          ${this._renderText({text:"card-transaction-servicing-finance-transaction-advanced-payments-success-advance-payments-detail-description-origin-account",classes:"resize-flex1"})}
          ${this._renderText({text:null===(t=this.responseDataPayment)||void 0===t?void 0:t.originAccount,classes:"resize-flex1",alignment:"right",fontWeight:p.fontWeight40})}
        </div>
        <div class="item-value-content">
          ${this._renderText({text:"card-transaction-servicing-finance-transaction-advanced-payments-success-advance-payments-detail-description-operation-date",classes:"resize-flex1"})}
          ${this._renderText({text:null===(e=this.responseDataPayment)||void 0===e?void 0:e.dateTime,fontWeight:p.fontWeight40,style:h.fontStyle20,classes:"resize-flex1",alignment:"right"})}
        </div>
        ${this._hasMicroloan} ${this._hasInstallments} ${this._hasLastInstallment}
        ${this._hasLastPaymentDate} ${this._hasOverduePayment}
        <div class="item-value-content">
          ${this._renderText({text:"card-transaction-servicing-finance-transaction-advanced-payments-success-advance-payments-detail-description-available-balance",classes:"resize-flex1"})}
          ${this._renderText({amount:null===(n=this.paymentAmounts)||void 0===n||null===(a=n.available)||void 0===a?void 0:a.amount,classes:"resize-flex1",fontWeight:"bold",size:"m"})}
        </div>
        <div class="item-value-content">
          ${this._renderText({text:"card-transaction-servicing-finance-transaction-advanced-payments-success-advance-payments-detail-description-disposed-balance",classes:"resize-flex1"})}
          ${this._renderText({amount:null===(s=this.paymentAmounts)||void 0===s||null===(o=s.disposedBalance)||void 0===o?void 0:o.amount,classes:"resize-flex1",fontWeight:"bold",size:"m"})}
        </div>
        <div class="item-value-content">
          ${this._renderText({text:"card-transaction-servicing-finance-transaction-advanced-payments-success-advance-payments-detail-description-operation-type",classes:"resize-flex1"})}
          ${this._renderText({text:null===(r=this.responseDataPayment)||void 0===r?void 0:r.operationType,classes:"resize-flex1",fontWeight:p.fontWeight40,alignment:"right"})}
        </div>
        <div class="item-value-content">
          ${this._renderText({text:"card-transaction-servicing-finance-transaction-advanced-payments-success-advance-payments-detail-description-operation-number",classes:"resize-flex1"})}
          ${this._renderText({text:null===(l=this.responseDataPayment)||void 0===l?void 0:l.operationFolio,classes:"resize-flex1",fontWeight:p.fontWeight40,alignment:"right"})}
        </div>
        <div class="item-value-content">
          ${this._renderText({text:"card-transaction-servicing-finance-transaction-advanced-payments-success-advance-payments-detail-description-user-email",classes:"resize-flex1"})}
          ${this._renderText({text:this.userEmail,classes:"resize-flex1",fontWeight:p.fontWeight40,alignment:"right",hasObfuscate:!0})}
        </div>
      </div>
    `}_renderText(t){const{text:e,classes:n="",tag:a="span",hasObfuscate:s,fontWeight:o=p.fontWeight20,size:l="S",style:c=h.fontStyle10,alignment:d="left",amount:m}=t;return e?i`
          <bbva-type-text
            ?data-acoustic-obfuscate="${r(s)}"
            class="${n}"
            text="${this.t(e)}"
            tag="${a}"
            font-weight=${o}
            font-style=${c}
            size=${l}
            alignment=${d}
          ></bbva-type-text>
        `:i`
          <bbva-type-amount
            amount="${m}"
            currency-code="${this.localCurrency}"
            local-currency="${this.localCurrency}"
            language="${this.language}"
            type="${o}"
            variant="${l}"></bbva-type-amount>
        `}_renderDate(t){const{date:e,classes:n="",fontWeight:a,fontStyle:s}=t;return i`
        <bbva-type-date
          class="${n}"
          font-weight="${a}"
          font-style="${s}"
          date="${e}"
          utc
          .options="${this.dateOptions}"
        ></bbva-type-date>
     `}get _selectTypeDate(){return"card-transaction-servicing-finance-transaction-advanced-payments-success-advance-payments-detail-description-last-payment-date"+(this._isMoreThanOneInstallmentAmount?"-different-amount":"")}_setNotificationMessage(){var t;this._isAdvanceAllInstallments&&(this._notificationMessageText=this.t("card-transaction-servicing-finance-transaction-advanced-payments-success-advance-payments-notification-message-all-installments")),(this._isAdvanceInstallment||this._isMoreThanOneInstallmentAmount||this._isLessThanOneInstallmentAmount)&&(this._notificationMessageText=this.t("card-transaction-servicing-finance-transaction-advanced-payments-success-advance-payments-notification-message")),null!==(t=this.dataFromMultistep)&&void 0!==t&&t.settleTotalDebtFlag&&(this._notificationMessageText=this.t("card-transaction-servicing-finance-transaction-advanced-payments-success-advance-payments-notification-message-settle-total-debt"))}get _shareButtonSettings(){const t=[{icon:f(),label:this.t("card-transaction-servicing-finance-transaction-advanced-payments-success-advance-payments-share-button-label"),id:"button-1"}];return i`
      <bbva-button-row
        .options=${t}
        class="share-button"
        @click=${this._shareReceipt}
      ></bbva-button-row>
    `}_shareReceipt(t){t.stopPropagation(),_e(this,"show-receipt")}render(){return this._setNotificationMessage(),i`
      <div ambient="primary-alt">
        ${this._renderMicroillustration}
        ${this._renderPaymentAmount}${this._renderPaymentDetailHeader} ${this._renderSuccessDetail}
        ${this._notificationMessage} ${this._shareButtonSettings}
      </div>
    `}}var on=c`
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

[data-tag-name=advance-payments-multistep].isNativeIos {
  margin-top: -0.5rem;
}
`,rn=c`
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
`;class ln extends(d(A(T(m(e))))){static get is(){return"half-modal-content"}static get scopedElements(){const t=[q];return ln.scopedElementsFromClasses(t)}static get properties(){return{modalConfig:{type:Object,attribute:"modal-config"},visible:{type:Boolean}}}constructor(){super(),this.modalConfig={},this.visible=!1}static get styles(){return[rn,u("half-modal-content-shared-styles")]}get _renderHalfModals(){var t,e,n,a,s,o,r,l,c,d,m,u,p,h,y;return i`
      <bbva-help-modal
        ?visible="${this.visible}"
        id="${null===(t=this.modalConfig)||void 0===t?void 0:t.id}"
        header-text="${this.t(null===(e=this.modalConfig)||void 0===e?void 0:e.headerText)}"
        title-icon="${null===(n=this.modalConfig)||void 0===n?void 0:n.titleIcon}"
        modal-type="${null===(a=this.modalConfig)||void 0===a?void 0:a.modalType}"
        body-text="${this.t(null===(s=this.modalConfig)||void 0===s?void 0:s.bodyText)}"
        button-text="${this.t(null===(o=this.modalConfig)||void 0===o?void 0:o.buttonText)}"
        subtitle-text="${this.t(null===(r=this.modalConfig)||void 0===r?void 0:r.subtitleText)}"
        title-text="${this.t(null===(l=this.modalConfig)||void 0===l?void 0:l.titleText)}"
        .linkText="${this.t(null===(c=this.modalConfig)||void 0===c?void 0:c.linkText)}"
        .headerButtons="${(null===(d=this.modalConfig)||void 0===d?void 0:d.headerButtons)||[]}"
        ?full-height="${null===(m=this.modalConfig)||void 0===m?void 0:m.fullHeight}"
        @help-modal-footer-button-click="${null===(u=this.modalConfig)||void 0===u?void 0:u.footerButtonClick}"
        @help-modal-header-click="${null===(p=this.modalConfig)||void 0===p?void 0:p.headerPrimaryClick}"
        @help-modal-veil-click="${null===(h=this.modalConfig)||void 0===h?void 0:h.veilClick}"
        @help-modal-footer-link-click="${null===(y=this.modalConfig)||void 0===y?void 0:y.footerLinkClick}"
      >
      </bbva-help-modal>
    `}render(){return i` ${super.render()} ${this._renderHalfModals}`}}var cn=c`
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

.modal-custom-content-with-calendar-wrapper {
  padding: 2rem 0 0.5rem;
}

.modal-config-content-texts {
  margin-top: 1rem;
  display: flex;
  flex-direction: column;
  row-gap: 0.5rem;
}
`;class dn extends(d(A(T(m(e))))){static get is(){return"custom-content-modal"}static get scopedElements(){const t=[W,w,q,$,M,k];return dn.scopedElementsFromClasses(t)}static get properties(){return{configModal:{type:Object,attribute:"config-modal"},localCurrency:{type:String,attribute:"local-currency"},visible:{type:Boolean}}}constructor(){super(),this.configModal={},this.language="",this.localCurrency="",this.iOSFixedHeader=!1,this.visible=!1}static get styles(){return[cn,K.primary,z.primary,I.primary,V.primary,E.primary,u("custom-content-modal-shared-styles")]}get slotContent(){var t;return i`
      <div slot="slot-content">
        ${null!==(t=this.configModal)&&void 0!==t&&t.isShowModalWithMicroillustration?this._modalContentWithMicroillustration:y}
      </div>
    `}_listParagraph(t){var e;const n=t.isOverdue?this.t(null==t?void 0:t.text,{overdueFee:be(null===(e=this.configModal)||void 0===e?void 0:e.overdueFee,this.localCurrency,this.language)}):this.t(null==t?void 0:t.text);return i`
      <bbva-type-text
        tag="${null==t?void 0:t.tag}"
        size=${null==t?void 0:t.size}
        text="${n}"
        font-weight="${null==t?void 0:t.fontWeight}"
        inherit
      ></bbva-type-text>
    `}get _modalContentWithMicroillustration(){var t,e,n,a,s,o,r,l,c;return i`
      <div
        class="modal-custom-content-with-${null===(t=this.configModal)||void 0===t||null===(e=t.content)||void 0===e?void 0:e.microillustration}-wrapper"
      >
        <bbva-clip-microillustration
          microillustration="${null===(n=this.configModal)||void 0===n||null===(a=n.content)||void 0===a?void 0:a.microillustration}"
          size="${null===(s=this.configModal)||void 0===s||null===(o=s.content)||void 0===o?void 0:o.microillustrationSize}"
        ></bbva-clip-microillustration>
      </div>
      <div class="modal-config-content-texts">
        ${null===(r=this.configModal)||void 0===r||null===(l=r.content)||void 0===l||null===(c=l.texts)||void 0===c?void 0:c.map((t=>this._listParagraph(t)))}
      </div>
    `}get _renderModal(){var t,e,n,a,s,o,r,l,c,d,m,u,p,h;return i`
      <bbva-help-modal
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        id="${null===(t=this.configModal)||void 0===t?void 0:t.id}"
        .headerButtons="${(null===(e=this.configModal)||void 0===e?void 0:e.headerButtons)||[]}"
        button-text="${this.t(null===(n=this.configModal)||void 0===n?void 0:n.buttonText)}"
        ?full-height="${null===(a=this.configModal)||void 0===a?void 0:a.fullHeight}"
        ?fixed-footer="${null===(s=this.configModal)||void 0===s?void 0:s.fixedFooter}"
        ?hide-content-padding-top="${null===(o=this.configModal)||void 0===o?void 0:o.hideContentPaddingTop}"
        title-icon="${null===(r=this.configModal)||void 0===r?void 0:r.titleIcon}"
        ?visible="${this.visible}"
        header-text="${this.t(null===(l=this.configModal)||void 0===l?void 0:l.headerText)}"
        modal-type="${null===(c=this.configModal)||void 0===c?void 0:c.headerType}"
        @help-modal-header-click="${null===(d=this.configModal)||void 0===d?void 0:d.headerPrimaryClick}"
        @help-modal-footer-button-click="${null===(m=this.configModal)||void 0===m?void 0:m.footerButtonClick}"
        @help-modal-veil-click="${null===(u=this.configModal)||void 0===u?void 0:u.veilClick}"
        @help-modal-footer-link-click="${null===(p=this.configModal)||void 0===p?void 0:p.footerLinkClick}"
        ambient="primary"
      >
        ${null!==(h=this.configModal)&&void 0!==h&&h.content?this.slotContent:y}
      </bbva-help-modal>
    `}render(){return i` ${super.render()} ${this._renderModal} `}}var mn=c`
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

.list-item {
  padding: 1.125rem 0;
  display: flex;
  flex-direction: column;
}

.list-item-top {
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.list-item-bottom {
  display: flex;
  justify-content: space-between;
  align-items: center;
}

[data-tag-name=bbva-notification-help] {
  margin-top: 0.5rem;
}
`;class un extends(d(A(T(m(e))))){static get is(){return"dynamic-content-modal"}static get scopedElements(){const t=[W,w,q,$,M,k,yt,R];return un.scopedElementsFromClasses(t)}static get properties(){return{configModal:{type:Object,attribute:"config-modal"},hasNextPage:{type:Boolean,attribute:"has-next-page"},visible:{type:Boolean}}}constructor(){super(),this.hasNextPage=!1,this.iOSFixedHeader=!1,this.language="",this.configModal={},this.visible=!1}static get styles(){return[mn,vt.primaryAlt,K.primaryAlt,z.primaryAlt,D.primaryAlt,I.primaryAlt,V.primaryAlt,E.primaryAlt,u("dynamic-content-modal-shared-styles")]}static headerMainClick(t){t.stopPropagation()}get modalContent(){var t,e,n;return null!==(t=this.configModal)&&void 0!==t&&t.response?i`
          ${null===(e=this.configModal)||void 0===e||null===(n=e.response)||void 0===n?void 0:n.map(((t,e)=>this._renderContentList(t,e)))}
          ${this._renderLoader}
        `:y}sendDataToMultistep(t){let e={};var n,a,i,s;null!=t&&t.isMicroloansModal&&(e={id:null==t?void 0:t.id,concept:null==t?void 0:t.textTopLeft,amount:null==t||null===(n=t.textTopRigth)||void 0===n?void 0:n.amount,currency:null==t||null===(a=t.textTopRigth)||void 0===a?void 0:a.currency,isMicroloansModal:null==t?void 0:t.isMicroloansModal});null!=t&&t.isMicroloansModal||(e={productName:null==t?void 0:t.textTopLeft,amount:null==t||null===(i=t.textTopRigth)||void 0===i?void 0:i.amount,currency:null==t||null===(s=t.textTopRigth)||void 0===s?void 0:s.currency,number:null==t?void 0:t.textBottomLeft});_e(this,"modal-hide",e)}get slotContent(){var t;return i`
      <div slot="slot-content-header">${this.t(null===(t=this.configModal)||void 0===t?void 0:t.titleText)}</div>
      <div slot="slot-content">${this.modalContent}</div>
    `}static showTextBottomLeft(t,e){return null!=t&&t.isMicroloansModal?i` <bbva-type-text text="${e}" tag="span" size="S"></bbva-type-text> `:i` <bbva-badge-reference number="${e}"> </bbva-badge-reference> `}_canSelect(t){var e;return null!==(e=this.configModal)&&void 0!==e&&e.canSelect&&null!=t&&t.isMicroloansModal||null!=t&&t.isValidAccount?i`
          <bbva-type-link
            text="${null==t?void 0:t.textTopLeft}"
          ></bbva-type-link>
        `:i`
          <bbva-type-text
            font-weight="${p.fontWeight40}"
            text="${null==t?void 0:t.textTopLeft}"
            tag="span"
            size="L"
          ></bbva-type-text>
        `}_managePaginationScroll(t){t.stopPropagation(),_e(this,"key-microloans-send",null==t?void 0:t.detail)}_renderContentList(t,e){var n,a,s,o,r,l,c,d,m,u,p;const h=null!=t&&t.isMicroloansModal?`${null==t||null===(n=t.textBottomLeft)||void 0===n?void 0:n.paidInstallments} ${this.t(null===(a=this.configModal)||void 0===a||null===(s=a.content)||void 0===s?void 0:s.textLeft)} ${null==t||null===(o=t.textBottomLeft)||void 0===o?void 0:o.totalInstallments}`:this.t(null==t?void 0:t.textBottomLeft);return i`
      <bbva-type-link class="list-item" @click=${e=>{e.stopPropagation(),this.sendDataToMultistep(t)}}>
        <div class="list-item-top">
          ${this._canSelect(t)}
          <bbva-type-amount
            amount="${null==t||null===(r=t.textTopRigth)||void 0===r?void 0:r.amount}"
            currency-code="${null==t||null===(l=t.textTopRigth)||void 0===l?void 0:l.currency}"
            local-currency="${null==t||null===(c=t.textTopRigth)||void 0===c?void 0:c.currency}"
            language="${this.language}"
            type="bold"
          >
          </bbva-type-amount>
        </div>
        ${null!==(d=this.configModal)&&void 0!==d&&d.hideBottomPart||null!=t&&t.isValidAccount?i`
              <div class="list-item-bottom">
                ${un.showTextBottomLeft(t,h)}
                <bbva-type-text
                  text="${null===(m=this.configModal)||void 0===m||null===(u=m.content)||void 0===u?void 0:u.textRight}"
                  tag="span"
                  size="S"
                ></bbva-type-text>
              </div>
            `:y}
        ${this._showInvalidAccountMessage(t)}
      </bbva-type-link>

      ${e<((null===(p=this.configModal)||void 0===p?void 0:p.response.length)??0)-1||null==t||!t.isMicroloansModal?i`<bbva-divider-default size="full"></bbva-divider-default>`:y}
    `}get _renderLoader(){return this.hasNextPage?i`
          <div class="list-item-top">
            <bbva-type-text loading tag="span"></bbva-type-text>
            <bbva-type-text loading tag="span"></bbva-type-text>
          </div>
          <div class="list-item-bottom">
            <bbva-type-text loading tag="span"></bbva-type-text>
            <bbva-type-text loading tag="span"></bbva-type-text>
          </div>
        `:y}get _renderModal(){var t,e,n,a,s,o,r,l;return i`
      <bbva-help-modal
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        .headerType="${null===(t=this.configModal)||void 0===t?void 0:t.headerType}"
        .headerText="${this.t(null===(e=this.configModal)||void 0===e?void 0:e.headerText)}"
        ?fixed-footer="${null===(n=this.configModal)||void 0===n?void 0:n.fixedFooter}"
        ?full-height="${null===(a=this.configModal)||void 0===a?void 0:a.fullHeight}"
        ?hide-content-padding-top="${null===(s=this.configModal)||void 0===s?void 0:s.hideContentPaddingTop}"
        ?visible="${this.visible}"
        @header-main-icon-click="${un.headerMainClick}"
        @help-modal-header-click="${null===(o=this.configModal)||void 0===o?void 0:o.headerPrimaryClick}"
        @help-modal-veil-click="${null===(r=this.configModal)||void 0===r?void 0:r.veilClick}"
        @help-modal-content-scroll-bottom-reach="${this._managePaginationScroll}"
        ambient="primary-alt"
      >
        ${null!==(l=this.configModal)&&void 0!==l&&l.content?this.slotContent:y}
      </bbva-help-modal>
    `}_showInvalidAccountMessage(t){var e,n,a,s;return null!=t&&t.isValidAccount||null!=t&&t.isMicroloansModal?y:i`
          <bbva-notification-help
            accessibility-label-icon="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-accessibility-label-icon-alert")}"
            variant="alert"
            icon="${null===(e=this.configModal)||void 0===e||null===(n=e.content)||void 0===n?void 0:n.errorIcon}"
            text="${this.t(null===(a=this.configModal)||void 0===a||null===(s=a.content)||void 0===s?void 0:s.errorMessage)}"
          ></bbva-notification-help>
        `}render(){return i` ${super.render()} ${this._renderModal}`}}class pn extends(d(A(T(m(e))))){static get is(){return"card-transaction-servicing-finance-transaction-advanced-payments"}static get scopedElements(){const t=[et,nt,Mt,Pt,$t,zt,At,Tt,q,nn,sn,dn,ln,un,...pn.configurationScopedElements()];return pn.scopedElementsFromClasses(t)}static get properties(){return{accountsApiVersion:{type:String,attribute:"account-api-version"},accountsError:{type:Object,attribute:"accounts-error"},availableBalance:{type:String,attribute:"available-balance"},chargeAccount:{type:String,attribute:"charge-account"},customerEmail:{type:String,attribute:"customer-email"},disposedBalance:{type:String,attribute:"disposed-balance"},financingLineId:{type:String,attribute:"financing-line-id"},financingLineResponse:{type:Object,attribute:"financing-line-response"},flexibleFinancingsApiVersion:{type:String,attribute:"financing-line-api-version"},installmentMonthlyAmount:{type:String,attribute:"installment-monthly-amount"},installmentsDetail:{type:String,attribute:"installments-detail"},lastInstallmentAmount:{type:String,attribute:"last-installment-amount"},localCurrency:{type:String,attribute:"local-currency"},maxRetries:{type:Number,attribute:"max-retries"},microloansPagination:{type:Object,attribute:"microloans-pagination"},monthlyInstallmentAmount:{type:String,attribute:"monthly-installment-amount"},operativeId:{type:String,attribute:"operative-id"},overdueAmount:{type:String,attribute:"overdue-amount"},overdueBalance:{type:String,attribute:"overdue-balance"},overduePaymentFee:{type:String,attribute:"overdue-payment-fee"},overduePaymentWithoutFee:{type:String,attribute:"overdue-payment-without-fee"},pageName:{type:String,attribute:"page-name"},paymentAmount:{type:String,attribute:"payment-amount"},paymentAmountId:{type:String,attribute:"payment-amount-id"},paymentsDetail:{type:String,attribute:"payments-detail"},pendingAmount:{type:String,attribute:"pending-amount"},totalInstallmentMonthlyAmount:{type:String,attribute:"total-installment-monthly-amount"},_accountsResponse:{type:Array},_canSelect:{type:Boolean},_closeModalListeners:{type:Object},_collapseStep:{type:String},_configModal:{type:Object},_dataPostFinancingLine:{type:Object},_dataPostFinancingLinePayment:{type:Object},_dataPostMicroloanPayment:{type:Object},_dataPostPaymentSimulate:{type:Object},_dataSuccessScreen:{type:Object},_deferredMovements:{type:Array},_financingLinePaymentSimulateResponse:{type:String},_microloanId:{type:String},_microloansModalConfig:{type:Object},_microloanPaymentsSimulateResponse:{type:Object},_microloanSpecificAmountsResponse:{type:Array},_microloansResponse:{type:Array},_modalConfigDynamic:{type:Object},_modalStaticConfig:{type:Object},_pageKey:{type:String},_paymentAmounts:{type:Object},_responseDataPayment:{type:Object},_retriesConfig:{type:Object,state:!0},_scrollBottomReached:{type:Boolean},_selectedAccountFromModal:{type:Object},_selectMicroloan:{type:Object},_setOperativeHeader:{type:String},_settleTotalDebtFlag:{type:Boolean},_showDynamicModal:{type:Boolean},_showHalfModal:{type:Boolean},_showModal:{type:Boolean},_showModalMicroloans:{type:Boolean},_showModalStatic:{type:Boolean},_showModalSuccess:{type:Boolean},_showMultistep:{type:Boolean},_showOnboarding:{type:Boolean},_showMultiStepModal:{type:Boolean}}}constructor(){super(),this.accountsApiVersion="1",this.accountsError={},this.availableBalance="",this.chargeAccount="",this.config={loader:!0},this.customerEmail="",this.disposedBalance="",this.financingLineId="",this.financingLineResponse={},this.flexibleFinancingsApiVersion="0",this.installmentMonthlyAmount="",this.installmentsDetail="",this.iOSFixedHeader=!1,this.language="",this.lastInstallmentAmount="",this.localCurrency="EUR",this.maxRetries=3,this.microloansData=[],this.microloansPagination={},this.monthlyInstallmentAmount="",this.operativeId="",this.overdueAmount="",this.overdueBalance="",this.overduePaymentFee="",this.overduePaymentWithoutFee="",this.pageName="",this.paymentAmount="",this.paymentAmountId="",this.paymentsDetail="",this.pendingAmount="",this.totalInstallmentMonthlyAmount="",this._accountsResponse=[],this._canSelect=!1,this._closeModalListeners={GETFINANCIALLINE:this._closeMultistep.bind(this),GETMICROLOANS:this._closeMultistep.bind(this),GETMICROLOANSPECIFICAMOUNTS:this._closeMultistep.bind(this),POSTMICROLOANPAYMENTSSIMULATE:this._closeMultistep.bind(this),GETACCOUNTS:this._closeMultistep.bind(this),POSTFINANCINGLINEPAYMENTSIMULATE:this._closeMultistep.bind(this),POSTMICROLOANPAYMENTS:this._closeMultistep.bind(this),POSTFINANCINGLINEPAYMENT:this._closeMultistep.bind(this)},this._collapseStep="",this._configModal={},this._dataPostFinancingLine={},this._dataPostFinancingLinePayment={},this._dataPostMicroloanPayment={},this._dataPostPaymentSimulate={},this._dataSuccessScreen={},this._deferredMovements=[],this._financingLinePaymentSimulateResponse="",this._microloanId="",this._microloanPaymentsSimulateResponse={},this._microloanSpecificAmountsResponse=[],this._microloansModalConfig={},this._microloansResponse=[],this._modalConfigDynamic={},this._modalStaticConfig={},this._pageKey="0",this._paymentAmounts={},this._responseDataPayment={},this._retriesConfig={GETFINANCIALLINE:0,GETMICROLOANS:0,GETMICROLOANSPECIFICAMOUNTS:0,POSTMICROLOANPAYMENTSSIMULATE:0,GETACCOUNTS:0,POSTFINANCINGLINEPAYMENTSIMULATE:0,POSTMICROLOANPAYMENTS:0,POSTFINANCINGLINEPAYMENT:0},this._scrollBottomReached=!1,this._selectedAccountFromModal={},this._selectMicroloan={},this._setOperativeHeader="",this._settleTotalDebtFlag=!1,this._showDynamicModal=!1,this._showHalfModal=!1,this._showModal=!1,this._showModalMicroloans=!1,this._showModalStatic=!1,this._showModalSuccess=!1,this._showMultistep=!1,this._showOnboarding=!1,this._showMultiStepModal=!1}static get styles(){return[on,u("card-transaction-servicing-finance-transaction-advanced-payments-shared-styles")]}async dataFinancialDashboard(t){this.financingLineResponse=t||{},await this.updateComplete,this.financialLineFilter(t)}filterAccounts(t){this._accountsResponse=t.map((t=>{var e,n,a,i,s;return{productName:pn.parseAccountName(null==t||null===(e=t.product)||void 0===e?void 0:e.name),amount:null==t||null===(n=t.availableBalance)||void 0===n||null===(a=n.currentBalances[0])||void 0===a?void 0:a.amount,currency:null==t||null===(i=t.availableBalance)||void 0===i||null===(s=i.currentBalances[0])||void 0===s?void 0:s.currency,number:null==t?void 0:t.number}}))}financialLineFilter(t={}){if(Object.keys(t).length>0){var e,n,a;this.financingLineId=null==t?void 0:t.id;let i;(null==t||null===(e=t.fees)||void 0===e||null===(n=e.itemizeFees)||void 0===n?void 0:n.filter((t=>t.feeType===this.overduePaymentFee))).map((t=>{const{itemizeFeeUnits:e}=t;return i=e.find((t=>"AMOUNT"===(null==t?void 0:t.unitType))),i})),this.financingLineResponse={nextPaymentDate:null==t?void 0:t.nextPaymentDate,availableBalance:pn.findBalance(this.availableBalance,null==t?void 0:t.balances),disposedBalance:pn.findBalance(this.disposedBalance,null==t?void 0:t.balances),overdueBalance:pn.findBalance(this.overdueBalance,null==t?void 0:t.balances),overduePaymentWithoutFee:pn.findBalance(this.overduePaymentWithoutFee,null==t?void 0:t.balances),overduePaymentFee:i,totalInstallmentMonthlyAmount:null==t||null===(a=t.specificAmounts)||void 0===a?void 0:a.find((t=>(null==t?void 0:t.id)===this.totalInstallmentMonthlyAmount)).amounts[0]}}}static findBalance(t,e){var n;return null==e||null===(n=e.find((e=>(null==e?void 0:e.id)===t)))||void 0===n?void 0:n.amounts[0]}getLocalStorageErrorResponse(){this._showOnboarding=!0,_e(this,"onboarding-modal-show"),this._setLocalStorage("advance_payment",0)}getLocalStorageSuccessResponse(t){if(Number(t)<3){let e=Number(t);this._showOnboarding=!0,_e(this,"onboarding-modal-show"),e+=1,this._setLocalStorage("advance_payment",e)}else this._showOnboarding=!1,this._showMultistep=!0,this._showMultiStepModal=!0}getUserEmail(t=""){const[e,n]=t.split("@"),a=e.slice(-3);this.customerEmail=`•${a}@${n}`}async initWidget(){var t;this.showLoader(),this._resetModals(),0===(null===(t=Object.keys(this.financingLineResponse))||void 0===t?void 0:t.length)&&this._getFinancingLine(),this.validateMonthlyPayment(),await this.updateComplete}managerShowOnboarding(){"advancePayment"===this.operativeId?this._getLocalStorage("advance_payment"):(this._showMultistep=!0,this._showMultiStepModal=!0)}microloansFilter(t){let e={},n={};t?this._microloansResponse=null==t?void 0:t.map((t=>{var a,i,s,o,r,l,c,d,m,u,p;return e=null==t||null===(a=t.customBalances)||void 0===a?void 0:a.reduce(((t,e)=>(t[null==e?void 0:e.balanceType]=e,t)),{}),n=null==t||null===(i=t.specificAmounts)||void 0===i?void 0:i.reduce(((t,e)=>{var n,a;return t[null==e?void 0:e.id]={amount:null==e||null===(n=e.amounts[0])||void 0===n?void 0:n.amount,currency:null==e||null===(a=e.amounts[0])||void 0===a?void 0:a.currency},t}),{}),{id:null==t?void 0:t.id,concept:(null==t||null===(s=t.transactions)||void 0===s?void 0:s.length)>1?this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-microloan-step-multipurchase"):null==t||null===(o=t.transactions[0])||void 0===o?void 0:o.concept,amount:null===(r=e[this.paymentsDetail])||void 0===r||null===(l=r.pendingAmount)||void 0===l?void 0:l.amount,currency:null===(c=e[this.paymentsDetail])||void 0===c||null===(d=c.pendingAmount)||void 0===d?void 0:d.currency,paidInstallments:null===(m=e[this.installmentsDetail])||void 0===m?void 0:m.paidInstallments,pendingInstallments:null===(u=e[this.installmentsDetail])||void 0===u?void 0:u.pendingInstallments,totalInstallments:null==t||null===(p=t.terms)||void 0===p?void 0:p.number,installmentAmount:n[this.installmentMonthlyAmount]}})):this._validateShowModalWithoutMicroloans()}nativeBackNavigation(t){var e,n;(null==t||null===(e=t.value)||void 0===e||null===(n=e.cancelledNavigation)||void 0===n?void 0:n.currentPage)===this.pageName&&this._manageMultistepCloseRequest()}openModalSuccess({detail:t}){this._dataSuccessScreen=t}static parseAccountName(t){return t?t.charAt(0)+t.slice(1).toLowerCase():""}parsedResponse(t){return this._microloansModalConfig=Ke({canSelect:this._canSelect,response:xe("microloansModal",t,this.operativeId),hideBottomPart:"monthlyPayment"!==this.operativeId}),this._microloansModalConfig}postFinancingLinePayment(t,e=!1){this.showLoader(),this._showMultiStepModal=!1,e||(t.stopPropagation(),this._dataPostFinancingLine=null==t?void 0:t.detail),this._getFinancingLinePaymentsDM.postFinancingLinePayments(this.financingLineId,this._dataPostFinancingLine)}reset(){this.financingLineId="",this.financingLineResponse={},this._microloansResponse={},this._microloanSpecificAmountsResponse=[],this._microloanPaymentsSimulateResponse={},this._financingLinePaymentSimulateResponse="",this._settleTotalDebtFlag=!1,this._showOnboarding=!1,this._showMultistep=!1,this._showModal=!1,this._showModalSuccess=!1,this._showModalStatic=!1,this.microloansData=[],this._dataSuccessScreen={},this._dataPostPaymentSimulate={},this._dataPostFinancingLinePayment={},this._dataPostMicroloanPayment={},this._dataPostFinancingLine={},this._retriesConfig={GETFINANCIALLINE:0,GETMICROLOANS:0,GETMICROLOANSPECIFICAMOUNTS:0,POSTMICROLOANPAYMENTSSIMULATE:0,GETACCOUNTS:0,POSTFINANCINGLINEPAYMENTSIMULATE:0,POSTMICROLOANPAYMENTS:0,POSTFINANCINGLINEPAYMENT:0},this.pageName="",this.operativeId="",this.accountsError={},this._collapseStep="",this._selectedAccountFromModal={},this._showModalMicroloans=!1,this._scrollBottomReached=!1,this._selectMicroloan=!1,this._deferredMovements=[],this._canSelect=!1,this._accountsResponse=[],this._showMultiStepModal=!1,_e(this,"operative-exit")}_resetModals(){this._modalStaticConfig={},this._responseDataPayment={},this._setOperativeHeader=""}resetResponseFinancingLinePaymentsSimulate(){this._financingLinePaymentSimulateResponse=""}resetResponsePaymentsSimulate(){this._microloanPaymentsSimulateResponse={}}static selectTemplateRecipt(t=""){const e=[le,ce,de,me];let n="";return[ie,oe].includes(t)&&(n=ue),e.includes(t)&&(n=ye),t===se&&(n=pe),t===re&&(n=he),n}setOperativeData(t){this.financingLineId=(null==t?void 0:t.financingLineId)||"",this.operativeId="overdue"===(null==t?void 0:t.operativeId)?"overduePayment":null==t?void 0:t.operativeId,this.managerShowOnboarding()}setResponseFinancingLinePayment(t){t.stopPropagation(),this._filterResponsePayment(null==t?void 0:t.detail)}setResponseMicroloansPayment(t){t.stopPropagation(),this._filterResponsePayment(null==t?void 0:t.detail)}shareReceiptData(t){var e,n,a,i,s,o,r,l,c,d,m,u,p,h;const{account:y,paymentType:v}=this._dataSuccessScreen,g=`${null==y?void 0:y.productName} •${null==y||null===(e=y.number)||void 0===e?void 0:e.substr(-4)}`,_=pn.selectTemplateRecipt(v);var b,f;this._paymentAmounts=t,this._responseDataPayment={templateSelected:_,operationType:Zt[null==t?void 0:t.paymentType],paidAmount:be(null==t||null===(n=t.paymentAmount)||void 0===n?void 0:n.amount,null==t||null===(a=t.paymentAmount)||void 0===a?void 0:a.currency,this.language,!0),originAccount:g,concept:(null===(i=this._dataSuccessScreen)||void 0===i?void 0:i.microloanDetail)||"",dateTime:(b=null==t?void 0:t.paymentDate,b?`${null===(f=fe(b))||void 0===f?void 0:f.format("LLL")} h`:""),lastPaymentAmount:be(null==t||null===(s=t.lastInstallment)||void 0===s?void 0:s.amount,null==t||null===(o=t.lastInstallment)||void 0===o?void 0:o.currency,this.language,!0)||"",paidInstallmentsNumber:(null==t||null===(r=t.advancePaymentsInstallment)||void 0===r?void 0:r.term)||"",lastPaymentDate:Se(null==t||null===(l=t.lastPaymentDate)||void 0===l?void 0:l.valueDate)||"",overduePayment:be(null==t||null===(c=t.overdueAmount)||void 0===c?void 0:c.amount,null==t||null===(d=t.overdueAmount)||void 0===d?void 0:d.currency,this.language,!0)||"",availableBalance:be(null==t||null===(m=t.available)||void 0===m?void 0:m.amount,null==t||null===(u=t.available)||void 0===u?void 0:u.currency,this.language,!0),disposedBalance:be(null==t||null===(p=t.disposedBalance)||void 0===p?void 0:p.amount,null==t||null===(h=t.disposedBalance)||void 0===h?void 0:h.currency,this.language,!0),operationFolio:`${null==t?void 0:t.operationTrackingNumber} BBVA`,customerEmail:this.customerEmail},_e(this,"share-receipt-data",this._responseDataPayment);let S="";S="overduePayment"===this.operativeId?"success-overdue-payment-modal-show":"monthlyPayment"===this.operativeId?"success-monthly-payment-modal-show":"success-advance-payment-modal-show",_e(this,S,{operationPaymentFolio:null==t?void 0:t.operationTrackingNumber})}showMultiStep(){this._showMultistep=!0,this._showMultiStepModal=!0,this.clearLoader()}successChanged(t){t.stopPropagation(),this._showModalSuccess=null==t?void 0:t.detail}updated(t){super.updated(t),t.has("_microloansResponse")&&Object.keys(this._microloansResponse).length>0&&this._persistMovements()}validateMonthlyPayment(){var t,e;0===(null===(t=this.financingLineResponse)||void 0===t||null===(e=t.totalInstallmentMonthlyAmount)||void 0===e?void 0:e.amount)&&"monthlyPayment"===this.operativeId?(this._modalStaticConfig=Ye({footerButtonClick:this._closeMultistep.bind(this),headerPrimaryClick:this._closeMultistep.bind(this)}),this._showModalStatic=!0,_e(this,"monthly-error-modal-show")):this._getMicroloans()}get _accountsDM(){return i`
      <bbva-global-accounts-api-dm
        id="accountsDm"
        .host="${this.host}"
        .version="${this.accountsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @accounts-api-dm-fetch="${this._setAccounts}"
        @api-dm-error="${()=>this._manageError("GETACCOUNTS")}"
        @accounts-api-dm-fetch-error="${()=>this._manageError("GETACCOUNTS")}"
      ></bbva-global-accounts-api-dm>
    `}_closeMultistep(){this.reset()}_collapsePay(){this._collapseStep="changeOperative"}_commonModalActions(t,e){return{veilClick:e?this._retryService.bind(this,t):this._closeModalListeners[t],footerLinkClick:this._closeModalListeners[t]}}_configModalChangeOperative(){this._collapseStep="",this._configModal=Je({footerButtonClick:this._collapsePay.bind(this)}),this._showHalfModal=!0}_configModalOverduePaymentFeeModal(t){this._modalStaticConfig=Qe({overdueFee:null==t?void 0:t.detail}),this._showModalStatic=!0}_filterResponsePayment(t){var e,n;this._responseDataPayment={paymentDate:null==t?void 0:t.paymentDate,advancePaymentsInstallment:(null==t?void 0:t.specificDates[0])||"",lastPaymentDate:(null==t?void 0:t.specificDates[1])||"",available:pn.findBalance(this.availableBalance,null==t?void 0:t.balances),disposedBalance:pn.findBalance(this.disposedBalance,null==t?void 0:t.balances),lastInstallment:pn.findBalance(this.lastInstallmentAmount,null==t?void 0:t.balances)||"",overdueAmount:pn.findBalance(this.overdueAmount,null==t?void 0:t.balances)||"",paymentType:null==t?void 0:t.paymentType,operationTrackingNumber:null==t||null===(e=t.operationTracking)||void 0===e?void 0:e.operationNumber,paymentAmount:null==t?void 0:t.paymentAmount,status:null==t||null===(n=t.status)||void 0===n?void 0:n.id},this._responseDataPayment&&(this.clearLoader(),this._showModalSuccess=!0,this.shareReceiptData(this._responseDataPayment))}get _financingLineDM(){return i`
      <bbva-global-financing-line-api-dm
        id="financingLineDm"
        .host="${this.host}"
        .version="${this.flexibleFinancingsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @financing-line-api-dm-fetch="${this._setFinancingLineData}"
        @api-dm-error="${()=>this._manageError("GETFINANCIALLINE")}"
        @financing-line-api-dm-fetch-error="${()=>this._manageError("GETFINANCIALLINE")}"
      >
      </bbva-global-financing-line-api-dm>
    `}get _financingLinePaymentDM(){return i`
      <bbva-global-financing-line-payments-api-dm
        id="financingLinePaymentsDm"
        .host="${this.host}"
        .version="${this.flexibleFinancingsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        requiredOTP
        @signature-required-first-step-dm="${()=>{"overduePayment"===this.operativeId?_e(this,"otp-overdue-payment"):_e(this,"otp-monthly-payment")}}"
        @financing-line-payments-api-dm-create="${this.setResponseFinancingLinePayment}"
        @api-dm-error="${()=>this._manageError("POSTFINANCINGLINEPAYMENT")}"
        @financing-line-payments-api-dm-create-error="${()=>this._manageError("POSTFINANCINGLINEPAYMENT")}"
      >
      </bbva-global-financing-line-payments-api-dm>
    `}get _financingLinePaymentSimulateDM(){return i`
      <bbva-global-financing-line-payments-simulate-api-dm
        id="financingLinePaymentsSimulateDm"
        .host="${this.host}"
        .version="${this.flexibleFinancingsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @financing-line-payments-simulate-api-dm-fetch="${this._handleFetchFLPaymentSimulate}"
        @api-dm-error="${()=>this._manageError("POSTFINANCINGLINEPAYMENTSIMULATE")}"
        @financing-line-payments-simulate-api-dm-fetch-error="${()=>this._manageError("POSTFINANCINGLINEPAYMENTSIMULATE")}"
      >
      </bbva-global-financing-line-payments-simulate-api-dm>
    `}_getAccounts(){0===this._accountsResponse.length&&this._getAccountsDM.getAccounts()}get _getAccountsDM(){return this.shadowRoot.querySelector(`[data-tag-name="${zt.is}"]`)}_getDataFromEvent(t){t.stopPropagation(),this._modalConfigDynamic=null==t?void 0:t.detail,this._showDynamicModal=!0}_getErrorModalActions({service:t,showRetries:e}){return{...this._commonModalActions(t,e),footerButtonClick:e?this._retryService.bind(this,t):this._closeMultistep.bind(this),headerPrimaryClick:this._closeMultistep.bind(this)}}_getFinancingLine(){this.financingLineId&&this._getFinancingLineDM.getFinancingLine(this.financingLineId)}get _getFinancingLineDM(){return this.shadowRoot.querySelector(`[data-tag-name="${et.is}"]`)}get _getFinancingLinePaymentsDM(){return this.shadowRoot.querySelector(`[data-tag-name="${Tt.is}"]`)}_getLocalStorage(t){_e(this,"get-native-local-storage",{key:t})}_getMicroloans(){this.financingLineId&&"overduePayment"!==this.operativeId&&this._getMicroloansDM.getMicroloans({"financingLine.id":this.financingLineId,expand:"transactions","status.id":["ACTIVE"],pageSize:10,paginationKey:this._pageKey})}get _getMicroloansDM(){return this.shadowRoot.querySelector(`[data-tag-name="${nt.is}"]`)}get _getMicroloansPaymentsDM(){return this.shadowRoot.querySelector(`[data-tag-name="${At.is}"]`)}_getModalConfig({service:t,showRetries:e}){const n="ERROR_SERVICE"+(e?"_RETRY":"_EXIT");return Ge({service:t,...this._getErrorModalActions({configLabel:n,service:t,showRetries:e})})[n]}get _getPaymentSimulateDM(){return this.shadowRoot.querySelector(`[data-tag-name="${Pt.is}"]`)}get _getPaymentSimulateFinancialLineDM(){return this.shadowRoot.querySelector(`[data-tag-name="${$t.is}"]`)}_getSpecificAmount(t,e=!1){e||(t.stopPropagation(),this._microloanId=null==t?void 0:t.detail),this._getSpecificAmountDM.getMicroloanSpecificAmounts(this._microloanId)}get _getSpecificAmountDM(){return this.shadowRoot.querySelector(`[data-tag-name="${Mt.is}"]`)}_handleFetchFLPaymentSimulate(t={}){var e,n;t.stopPropagation();const{specificAmounts:a}=t.detail,i=null==a?void 0:a.find((t=>(null==t?void 0:t.id)===this.pendingAmount)),s=be(null==i||null===(e=i.amounts[0])||void 0===e?void 0:e.amount,null==i||null===(n=i.amounts[0])||void 0===n?void 0:n.currency,this.language,!0);this._financingLinePaymentSimulateResponse=s}_handleShareClickEvent(t){t.stopPropagation(),_e(this,"share-receipt",!0)}_manageError(t){this.clearLoader();const e=this._retriesConfig[t]<this.maxRetries;this._retriesConfig[t]+=1,"GETACCOUNTS"===t?this.accountsError={visible:!0,isRetry:this._retriesConfig[t]<this.maxRetries}:(this._configModal=this._getModalConfig({service:t,showRetries:e}),this._showHalfModal=!0)}_manageMicroloansPagination(t){var e;t.stopPropagation();let n="";const a=Object.hasOwn(null==t||null===(e=t.detail)||void 0===e?void 0:e.links,"next"),{totalElements:i}=t.detail;if(a){var s,o;let e=[];(null==t||null===(s=t.detail)||void 0===s||null===(o=s.links)||void 0===o?void 0:o.next.split("&")).map((t=>(t.includes("paginationKey")&&(e=t.split("paginationKey=")),t))),n=e[e.length-1]}const r={totalElements:i,hasNextPage:a};this.microloansPagination=r,this._pageKey=n}_manageMultistepCloseRequest(){this._configModal=Ge({footerButtonClick:this._closeMultistep.bind(this),headerPrimaryClick:this._closeMultistep.bind(this)}).EXIT_OPERATIVE,this._showHalfModal=!0}_managePaginationScroll(t){t.stopPropagation(),null!=t&&t.detail&&!this._scrollBottomReached&&(this._scrollBottomReached=null==t?void 0:t.detail,this._getMicroloans())}get _microloansDM(){return i`
      <bbva-global-microloans-api-dm
        id="microloansDm"
        .host="${this.host}"
        .version="${this.flexibleFinancingsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @microloans-api-dm-fetch="${this._setMicroloansResponse}"
        @microloans-api-dm-pagination="${this._manageMicroloansPagination}"
        @api-dm-error="${()=>this._manageError("GETMICROLOANS")}"
        @microloans-api-dm-fetch-error="${()=>this._manageError("GETMICROLOANS")}"
      >
      </bbva-global-microloans-api-dm>
    `}get _microloansPaymentsDM(){return i`
      <bbva-global-microloan-payments-api-dm
        id="microloanPaymentsDm"
        .host="${this.host}"
        .version="${this.flexibleFinancingsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        requiredOTP
        @signature-required-first-step-dm="${()=>{"advancePayment"===this.operativeId&&_e(this,"otp-advance-payment")}}"
        @microloan-payments-api-dm-create="${this.setResponseMicroloansPayment}"
        @api-dm-error="${()=>this._manageError("POSTMICROLOANPAYMENTS")}"
        @microloan-payments-api-dm-create-error="${()=>this._manageError("POSTMICROLOANPAYMENTS")}"
      ></bbva-global-microloan-payments-api-dm>
    `}get _microloansPaymentsSimulateDM(){return i`
      <bbva-global-microloan-payments-simulate-api-dm
        id="microloanPaymentsSimulateDm"
        .host="${this.host}"
        .version="${this.flexibleFinancingsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @microloan-payments-simulate-api-dm-fetch="${this._setPaymentsSimulate}"
        @api-dm-error="${()=>this._manageError("POSTMICROLOANPAYMENTSSIMULATE")}"
        @microloan-payments-simulate-api-dm-fetch-error="${()=>this._manageError("POSTMICROLOANPAYMENTSSIMULATE")}"
      ></bbva-global-microloan-payments-simulate-api-dm>
    `}get _microloansSpecificAmountsDM(){return i`
      <bbva-global-microloan-specific-amounts-api-dm
        id="microloanSpecificAmountsDm"
        .host="${this.host}"
        .version="${this.flexibleFinancingsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @microloan-specific-amounts-api-dm-fetch="${this._setSpecificAmount}"
        @api-dm-error="${()=>this._manageError("GETMICROLOANSPECIFICAMOUNTS")}"
        @microloan-specific-amounts-api-dm-fetch-error="${()=>this._manageError("GETMICROLOANSPECIFICAMOUNTS")}"
      >
      </bbva-global-microloan-specific-amounts-api-dm>
    `}_openModalMicroloan(t){this._showModalMicroloans=!0,this._canSelect=null==t?void 0:t.detail,this._microloansModalConfig=Ke({canSelect:null==t?void 0:t.detail,response:xe("microloansModal",this._deferredMovements,this.operativeId),hideBottomPart:"monthlyPayment"!==this.operativeId})}_persistMovements(){this._microloansResponse.map((t=>(this._deferredMovements.push(t),t))),this.parsedResponse(this._deferredMovements)}_postFinancingPaymentSimulate(t,e=!1){e||(t.stopPropagation(),this._dataPostFinancingLinePayment=null==t?void 0:t.detail),this._getPaymentSimulateFinancialLineDM.postFinancingLinePaymentsSimulate(this.financingLineId,this._dataPostFinancingLinePayment)}_postMicroloansPayment(t,e=!1){this.showLoader(),this._showMultiStepModal=!1,e||(t.stopPropagation(),this._dataPostMicroloanPayment=null==t?void 0:t.detail),this._getMicroloansPaymentsDM.postMicroloanPayments(this._microloanId,this._dataPostMicroloanPayment)}_postPaymentSimulate(t,e=!1){e||(t.stopPropagation(),this._dataPostPaymentSimulate=null==t?void 0:t.detail),this._getPaymentSimulateDM.postMicroloanPaymentsSimulate(this._microloanId,this._dataPostPaymentSimulate)}get _renderApis(){return i`
      ${this._financingLineDM} ${this._microloansDM} ${this._microloansSpecificAmountsDM}
      ${this._microloansPaymentsSimulateDM} ${this._accountsDM}
      ${this._financingLinePaymentSimulateDM} ${this._microloansPaymentsDM}
      ${this._financingLinePaymentDM}
    `}get _renderHalfModal(){return i`
      <half-modal-content
        .modalConfig="${this._configModal}"
        ?visible="${this._showHalfModal}"
        @visible-changed="${t=>{t.stopPropagation(),this._showHalfModal=null==t?void 0:t.detail}}"
      >
      </half-modal-content>
    `}get _renderModalDynamicContent(){return i`
      <dynamic-content-modal
        ?visible="${this._showDynamicModal}"
        @visible-changed="${t=>{t.stopPropagation(),this._showDynamicModal=null==t?void 0:t.detail}}"
        .configModal="${this._modalConfigDynamic}"
        @card-transaction-servicing-finance-transaction-advanced-payments-modal-hide="${this._selectStep}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
      >
      </dynamic-content-modal>
    `}get _renderModalMicroloans(){var t;return i`
      <dynamic-content-modal
        id="modalMicroloans"
        ?visible="${this._showModalMicroloans}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        @visible-changed=${t=>{t.stopPropagation(),this._showModalMicroloans=null==t?void 0:t.detail}}
        .configModal="${this._microloansModalConfig}"
        .hasNextPage="${null===(t=this.microloansPagination)||void 0===t?void 0:t.hasNextPage}"
        @card-transaction-servicing-finance-transaction-advanced-payments-modal-hide="${this._selectMicroloanStep}"
        @card-transaction-servicing-finance-transaction-advanced-payments-key-microloans-send="${this._managePaginationScroll}"
      >
      </dynamic-content-modal>
    `}get _renderModalInfo(){return i`
      <custom-content-modal
        id="modalInfo"
        .localCurrency="${this.localCurrency}"
        language="${this.language}"
        .configModal="${this._modalStaticConfig}"
        ?visible="${this._showModalStatic}"
        @visible-changed="${t=>{t.stopPropagation(),this._showModalStatic=null==t?void 0:t.detail}}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ambient="primary-alt"
      >
      </custom-content-modal>
    `}get _renderMultistep(){this._setOperativeHeader=Qt[this.operativeId];const t=this.iOSFixedHeader?"isNativeIos":"";return this._showMultistep?i`
          <advance-payments-multistep
            class="${t}"
            ?i-o-s-fixed-header="${this.iOSFixedHeader}"
            .operativeId="${this.operativeId}"
            currency="${this.localCurrency}"
            .chargeAccount="${this.chargeAccount}"
            language="${this.language}"
            .financingLineDetail="${this.financingLineResponse}"
            .microloansDetail="${this._microloansResponse}"
            .microloanSpecificAmounts="${this._microloanSpecificAmountsResponse}"
            .microloanPaymentsSimulate="${this._microloanPaymentsSimulateResponse}"
            .accountsResponse="${this._accountsResponse}"
            .financingLinePaymentsSimulate="${this._financingLinePaymentSimulateResponse}"
            .accountsError="${this.accountsError}"
            .collapsedStepSelectAccount="${this._selectedAccountFromModal}"
            .selectMicroloan="${this._selectMicroloan}"
            .collapseStep="${this._collapseStep}"
            .paymentAmountId="${this.paymentAmountId}"
            .showMultistep="${this._showMultiStepModal}"
            @card-transaction-servicing-finance-transaction-advanced-payments-retry-accounts-service="${({detail:t})=>this._retryService(t)}"
            @card-transaction-servicing-finance-transaction-advanced-payments-success-modal-open="${this.openModalSuccess}"
            @card-transaction-servicing-finance-transaction-advanced-payments-specific-amount-execute="${this._getSpecificAmount}"
            @card-transaction-servicing-finance-transaction-advanced-payments-execute-microloan-payment-simulate="${this._postPaymentSimulate}"
            @card-transaction-servicing-finance-transaction-advanced-payments-financing-line-payments-simulate-post-request="${this._postFinancingPaymentSimulate}"
            @card-transaction-servicing-finance-transaction-advanced-payments-accounts-service-execute="${this._getAccounts}"
            @card-transaction-servicing-finance-transaction-advanced-payments-execute-microloan-payments-post-response="${this._postMicroloansPayment}"
            @card-transaction-servicing-finance-transaction-advanced-payments-execute-financingline-payments-post="${this.postFinancingLinePayment}"
            @card-transaction-servicing-finance-transaction-advanced-payments-reset-payments-simulate-response="${this.resetResponsePaymentsSimulate}"
            @card-transaction-servicing-finance-transaction-advanced-payments-reset-financing-line-payments-simulate="${this.resetResponseFinancingLinePaymentsSimulate}"
            @card-transaction-servicing-finance-transaction-advanced-payments-manage-reset-advance-payments="${this._manageMultistepCloseRequest}"
            @card-transaction-servicing-finance-transaction-advanced-payments-advance-payments-exit="${this.reset}"
            @card-transaction-servicing-finance-transaction-advanced-payments-modal-show="${this._getDataFromEvent}"
            @card-transaction-servicing-finance-transaction-advanced-payments-select-advance-payments-type-modal-show="${this._configModalChangeOperative}"
            @card-transaction-servicing-finance-transaction-advanced-payments-import-payment-overdue-fee-modal-open="${this._configModalOverduePaymentFeeModal}"
            @card-transaction-servicing-finance-transaction-advanced-payments-microloan-modal-show="${this._openModalMicroloan}"
            @card-transaction-servicing-finance-transaction-advanced-payments-payment-type-modal-show="${this._openModalMicroloan}"
            @card-transaction-servicing-finance-transaction-advanced-payments-monthly-modal-show="${this._openModalMicroloan}"
          ></advance-payments-multistep>
        `:y}get _renderOnBoarding(){return this._showOnboarding?i`
          <custom-content-modal
            id="onboardingModal"
            @visible-changed="${t=>{t.stopPropagation(),this._showOnboarding=null==t?void 0:t.detail}}"
            ?visible="${this._showOnboarding}"
            .configModal="${Ue({footerButtonClick:this.showMultiStep.bind(this),headerPrimaryClick:this.showMultiStep.bind(this)})}"
            ?i-o-s-fixed-header="${this.iOSFixedHeader}"
          ></custom-content-modal>
        `:y}_retryGetAccounts(){this._retriesConfig.GETACCOUNTS<this.maxRetries?this._getAccounts():this._closeMultistep()}_retryGetFinancingLine(){this.showLoader(),this._getFinancingLine()}_retryGetMicroloans(){this.showLoader(),this._getMicroloans()}_retryGetSpecificAmount(){this.showLoader(),this._getSpecificAmount({},!0)}_retryPostFinancingLinePayment(){this.showLoader(),this.postFinancingLinePayment({},!0)}_retryPostFinancingLinePaymentSimulate(){this.showLoader(),this._postFinancingPaymentSimulate({},!0)}_retryPostMicroloansPayment(){this.showLoader(),this._postMicroloansPayment({},!0)}_retryPostPaymentSimulate(){this.showLoader(),this._postPaymentSimulate({},!0)}_retryService(t){this[{GETFINANCIALLINE:"_retryGetFinancingLine",GETMICROLOANS:"_retryGetMicroloans",GETMICROLOANSPECIFICAMOUNTS:"_retryGetSpecificAmount",POSTMICROLOANPAYMENTSSIMULATE:"_retryPostPaymentSimulate",GETACCOUNTS:"_retryGetAccounts",POSTFINANCINGLINEPAYMENTSIMULATE:"_retryPostFinancingLinePaymentSimulate",POSTMICROLOANPAYMENTS:"_retryPostMicroloansPayment",POSTFINANCINGLINEPAYMENT:"_retryPostFinancingLinePayment"}[t]]()}_selectMicroloanStep(t){var e;t.stopPropagation(),this._showModalMicroloans=!1,null!=t&&null!==(e=t.detail)&&void 0!==e&&e.isMicroloansModal&&(this._selectMicroloan=t)}_selectStep(t){var e;if(this._showDynamicModal=!1,null==t||null===(e=t.detail)||void 0===e||!e.isMicroloansModal){const e=null==t?void 0:t.detail;this._selectedAccountFromModal={selectAccount:e}}}_setAccounts(t){t.stopPropagation(),this.filterAccounts(null==t?void 0:t.detail)}async _setFinancingLineData(t){var e;t.stopPropagation(),this.clearLoader(),this.financingLineId=null==t||null===(e=t.detai)||void 0===e?void 0:e.id,this.financialLineFilter(null==t?void 0:t.detail),await this.updateComplete}_setLocalStorage(t,e){_e(this,"set-native-local-storage",{key:t,value:e})}async _setMicroloansResponse(t){t.stopPropagation(),this.clearLoader(),this.microloansFilter(null==t?void 0:t.detail),await this.updateComplete}_setPaymentsSimulate(t){var e;t.stopPropagation();const n=e=>{var n,a;return null==t||null===(n=t.detail)||void 0===n||null===(a=n.specificAmounts)||void 0===a?void 0:a.find((t=>(null==t?void 0:t.id)===e))},a=t=>{var e;return null==t||null===(e=t.amounts)||void 0===e?void 0:e.find((t=>(null==t?void 0:t.amount)>0))};this._microloanPaymentsSimulateResponse={lastInstallmentAmount:a(n(this.lastInstallmentAmount)),paymentAmount:a(n(this.paymentAmount)),monthlyInstallmentAmount:a(n(this.monthlyInstallmentAmount)),specificDates:null==t||null===(e=t.detail)||void 0===e?void 0:e.specificDates[0]}}_setSpecificAmount(t){var e;t.stopPropagation();const n=null==t||null===(e=t.detail)||void 0===e?void 0:e.map((({id:t,number:e,amounts:n,maturityDate:a})=>({concept:1===e?`${e} ${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-step-installment-to-pay")}`:`${e} ${this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-step-installments-to-pay")}`,id:t,amounts:n[0],maturityDate:a,number:e}))),a={concept:this.t("card-transaction-servicing-finance-transaction-advanced-payments-select-monthly-payments-advance-different-amount"),id:"differentAmount",number:t.detail.length+1};this._microloanSpecificAmountsResponse=[...n,a]}get _successAdvancePayment(){return i`
      <bbva-help-modal
        header-type="modal"
        full-height
        header-text="${this._setOperativeHeader}"
        header-close-icon-aria-label="${this.t("card-transaction-servicing-finance-transaction-advanced-payments-accessibility-close-button")}"
        ?visible="${this._showModalSuccess}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        @visible-changed="${this.successChanged}"
        @help-modal-close="${t=>{t.stopPropagation(),this.reset()}}"
        ambient="primary-alt"
      >
        <div slot="slot-content">
          <success-advance-payment
            .operativeId="${this.operativeId}"
            .paymentAmounts="${this._paymentAmounts}"
            .responseDataPayment="${this._responseDataPayment}"
            .dataFromMultistep="${this._dataSuccessScreen}"
            .userEmail="${this.customerEmail}"
            .localCurrency="${this.localCurrency}"
            @card-transaction-servicing-finance-transaction-advanced-payments-show-receipt="${this._handleShareClickEvent}"
          ></success-advance-payment>
        </div>
      </bbva-help-modal>
    `}_validateShowModalWithoutMicroloans(){if("overduePayment"!==this.operativeId){const t="advancePayment"===this.operativeId?"advanced-payments":"monthly-payment";this._modalStaticConfig=We({headerText:this._setOperativeHeader,text:t},{footerButtonClick:this._closeMultistep.bind(this),headerPrimaryClick:this._closeMultistep.bind(this)}),this._showModalStatic=!0}}render(){return i`
      ${super.render()} ${this._renderApis} ${this._renderOnBoarding} ${this._renderMultistep}
      ${this._renderModalInfo} ${this._renderHalfModal} ${this._renderModalDynamicContent}
      ${this._successAdvancePayment} ${this._renderModalMicroloans}
    `}}customElements.define(pn.is,pn);var hn=Object.freeze({__proto__:null});export{Ft as B,qt as a,hn as b};
