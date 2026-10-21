import{aZ as e,J as t,L as a,a7 as s,h as i,z as r,an as n,ak as o,ah as l,aX as u,aD as c,ck as d,W as p,bW as m,d_ as h}from"./952f98a9.js";import{R as b,S as g,L as v,M as f,D as y,a1 as _,A as x,as as S,G as E,a2 as T,F as $,Q as q,at as k,z as O,a3 as P,N as C,H as R,a4 as D,K as w,T as A,x as I,e as V,af as M,f as N,aa as L,Z as j,ap as F,ae as B,V as H,ar as G,Y as z}from"./216055dc.js";import{B as U,a as X}from"./b87bf4dd.js";import{by as Q,bP as K,aH as W,bQ as Y,aI as J}from"./7f3d7ca9.js";import{B as Z,a as ee,b as te}from"./d2484b66.js";import{a as ae}from"./4656db6d.js";import{B as se}from"./c0a2f832.js";import{B as ie,b as re,a as ne}from"./def1c0af.js";import{B as oe,b as le}from"./2b04e291.js";import{B as ue,b as ce}from"./30ef6f1f.js";import{b as de,B as pe}from"./99dc66c7.js";import{B as me}from"./9152f74c.js";import{s as he}from"./8dab2181.js";import"./cae0f1de.js";import"./7306257d.js";import"./854beed0.js";import"./84dff06e.js";import"./afb1d3bc.js";class be extends U{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`sustainability/v${this.version}/solar-panel/calculate-saving`)}toString(){return super.toString("BGADPSustainabilitySolarPanelCalculateSavingPostV1")}}class ge extends U{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`sustainability/v${this.version}/solar-panel/leads`)}toString(){return super.toString("BGADPSustainabilitySolarPanelLeadsPostV1")}}class ve extends U{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`sustainability/v${this.version}/solar-panel/simulate`)}toString(){return super.toString("BGADPSustainabilitySolarPanelSimulatePostV1")}}class fe extends X{static get is(){return"bbva-global-solar-panel-leads-api-dm"}constructor(){super()}postSolarPanelLeads(e){this._generateGetService(this._getService("post",e),{customEvent:"solar-panel-leads-api-dm-create",errorFireEventHandler:"solar-panel-leads-api-dm-create-error"},this._responseMapping)}_getService(e,t={},a={}){const s=this._getServiceParams(a,t);return this._getServicePath(`${e}SolarPanelLeads`,this._getBgadp(s))}_getBgadp(e){return{postSolarPanelLeadsV1:()=>new ge(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}class ye extends X{static get is(){return"bbva-global-solar-panel-simulate-api-dm"}static get properties(){return{solarPanelSimulate:{type:Object,attribute:!1}}}constructor(){super(),this.solarPanelSimulate={}}resetSolarPanelSimulate(){this.solarPanelSimulate={}}postSolarPanelSimulate(e){if(Object.keys(this.solarPanelSimulate).length)return;this._generateGetService(this._getService("post",e),{customEvent:"solar-panel-simulate-api-dm-fetch",errorFireEventHandler:"solar-panel-simulate-api-dm-fetch-error"},this._responseMapping)}_getService(e,t={},a={}){const s=this._getServiceParams(a,t);return this._getServicePath(`${e}SolarPanelSimulate`,this._getBgadp(s))}_getBgadp(e){return{postSolarPanelSimulateV1:()=>new ve(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}class _e extends X{static get is(){return"bbva-global-solar-panel-calculate-saving-api-dm"}static get properties(){return{solarPanelCalculateSaving:{type:Object,attribute:!1}}}constructor(){super(),this.solarPanelCalculateSaving={}}resetSolarPanelCalculateSaving(){this.solarPanelCalculateSaving={}}postSolarPanelCalculateSaving(e){if(Object.keys(this.solarPanelCalculateSaving).length)return;this._generateGetService(this._getService("post",e),{customEvent:"solar-panel-calculate-saving-api-dm-fetch",errorFireEventHandler:"solar-panel-calculate-saving-api-dm-fetch-error"},this._responseMapping)}_getService(e,t={},a={}){const s=this._getServiceParams(a,t);return this._getServicePath(`${e}SolarPanelCalculateSaving`,this._getBgadp(s))}_getBgadp(e){return{postSolarPanelCalculateSavingV1:()=>new be(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}class xe extends ie{constructor(e=null){super(Object.assign(e||{},{method:"PATCH"}))}toString(e=""){return super.toString(e||"BGADPRequestPATCH")}}class Se extends re{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`loans/v${this.version}/offers/{offer-id}`)}toString(){return super.toString("BGADPLoansOffersOfferGetV1")}}class Ee extends xe{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`loans/v${this.version}/offers/{offer-id}`)}toString(){return super.toString("BGADPLoansOffersOfferPatchV1")}}class Te extends me{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`loans/v${this.version}/offers/{offer-id}/quotations/simulate`)}toString(){return super.toString("BGADPLoansOffersOfferQuotationsSimulatePostV1")}}class $e extends ne{static get is(){return"bbva-global-offer-api-dm"}static get properties(){return{offer:{type:Object,attribute:!1}}}constructor(){super(),this.offer={}}resetOffer(){this.offer={}}getOffer(e,t={}){if(Object.keys(this.offer).length)return;t=Object.assign({"offer-id":e},t),this._generateGetService(this._getService("get",{},t),{customEvent:"offer-api-dm-fetch",errorFireEventHandler:"offer-api-dm-fetch-error"},this._responseMapping,t.fields)}patchOffer(e,t){const a={"offer-id":e};this._generateGetService(this._getService("patch",t,a),{customEvent:"offer-api-dm-update",errorFireEventHandler:"offer-api-dm-update-error"},this._responseMapping),this.resetOffer()}_getService(e,t={},a={}){const s=this._getServiceParams(a,t);return this._getServicePath(`${e}Offer`,this._getBgadp(s))}_getBgadp(e){return{getOfferV1:()=>new Se(e),patchOfferV1:()=>new Ee(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}class qe extends ne{static get is(){return"bbva-global-offer-quotations-simulate-api-dm"}static get properties(){return{offerQuotationsSimulate:{type:Object,attribute:!1}}}constructor(){super(),this.offerQuotationsSimulate={}}resetOfferQuotationsSimulate(){this.offerQuotationsSimulate={}}postOfferQuotationsSimulate(e,t){if(Object.keys(this.offerQuotationsSimulate).length)return;const a={"offer-id":e};this._generateGetService(this._getService("post",t,a),{customEvent:"offer-quotations-simulate-api-dm-fetch",errorFireEventHandler:"offer-quotations-simulate-api-dm-fetch-error"},this._responseMapping)}_getService(e,t={},a={}){const s=this._getServiceParams(a,t);return this._getServicePath(`${e}OfferQuotationsSimulate`,this._getBgadp(s))}_getBgadp(e){return{postOfferQuotationsSimulateV1:()=>new Te(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}class ke{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let a=Object(this),s=a.length>>>0;if(0===s)return!1;let i=0|t,r=Math.max(i>=0?i:s-Math.abs(i),0);for(;r<s;){if((n=a[r])===(o=e)||"number"==typeof n&&"number"==typeof o&&isNaN(n)&&isNaN(o))return!0;r++}var n,o;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var a=[],s=0,i="",r=0,n=arguments.length;r!==n;++r){var o=+arguments[r];if(!(o<1114111&&o>>>0===o))throw RangeError("Invalid code point: "+o);o<=65535?s=a.push(o):(o-=65536,s=a.push(55296+(o>>10),o%1024+56320)),s>=16383&&(i+=e.apply(null,a),a.length=0)}return i+e.apply(null,a)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",a=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${a&&a.message}`)}}class Oe extends ke{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}}const Pe=0,Ce=1,Re="jwt",De="tsec",we="none";class Ae extends ke{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=Pe,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new Oe,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=De:this.requiredToken=we,this.requiresJWT=!1):this.requiredToken===De?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===Re?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===we?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(De)}_setJwtHandler(){this._setTokenHandler(Re)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((a,s)=>{t=Object.assign(t,{resolve:a,reject:s}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let a=this._getRequestHeaders();Object.keys(a).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,a[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let t=null;return!!window.CellsNativePlugins&&(t=e),t}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let a=e.replace(/[\{\}]+/g,""),s=t[a];return s?delete t[a]:this._error(9,`Missing ${a} param value`),s})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let a=Object.keys(t);a.length&&(e=[e,a.map((e=>{let a=t[e];return Array.isArray(a)&&this.paramArrayMode===Ce?this._arrayToQueryParam(e,a):`${e}=${a}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(De,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(Re,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(a){var s=t.getItem(a);s&&"null"!==s&&(e[a]=s)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const a=window.sessionStorage;t=Object.keys(a).filter((t=>t.startsWith(e))).reduce(((t,s)=>(t[s.replace(e,"")]=a.getItem(s),t)),{})}return t}_getTokenForRequestHeaders(e,t){const a=`${e}Handler`,s=e===Re?"JWT ":"",i=e===Re?"Authorization":De;if(void 0===this[a]||null===this[a])this._error(11,`${e} handler is undefined`);else{const r=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let n=this[a].getItem(r);n?t[i]=t[i]||s+n:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((a=>{t.push(`${a}=${e[a]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(a){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(a){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let a;const s=new Promise(((e,t)=>{a=(a,s)=>{a?t(a):e(s)}}));return t.addEventListener("loadend",(function e(s){t.removeEventListener("loadend",e),s.error?a(s.error):a(null,t.result)})),t.readAsText(e),s}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let a=0;for(;a<e.length;){let s=e[a],i=0,r=0;if(s<=127?(i=0,r=255&s):s<=223?(i=1,r=31&s):s<=239?(i=2,r=15&s):s<=244&&(i=3,r=7&s),e.length-a-i>0){let t=0;for(;t<i;)s=e[a+t+1],r=r<<6|63&s,t+=1}else r=65533,i=e.length-a;t+=String.fromCodePoint(r),a+=i+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},a=e.trim().split(/[\r\n]+/);for(const e in a)if(a.hasOwnProperty(e)&&""!==a[e]){let s=": ",i=a[e].split(s);t[i.shift().toLowerCase()]=i.join(s)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,a,s){let i=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(s)>=0&&(i=t.getResponseHeader(s));break;case this._NATIVE_XHR:t&&t.headers&&(i=JSON.parse(t.headers)[s])}if(i){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):a;e.getItem(t)!==i&&(e.setItem(t,i),this._emitTokenUpdate(a,i))}}_emitTokenUpdate(e,t){if(this.htmlContext){const a=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(a)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,a,s,i,r;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),a=e.getResponseHeader("AuthenticationData"),s=e.getResponseHeader("AuthenticationState"),i=e.getResponseHeader("AuthenticationChallenge"),r=e.getResponseHeader("AuthenticationResponse");else{let n=JSON.parse(e.headers);t=n.authenticationtype,a=n.authenticationdata||null,s=n.authenticationstate,i=n.authenticationchallenge,r=n.authenticationresponse}return{type:t,data:a,state:s,challenge:i,response:r}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",a=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const s=this._getSignatureData(e,t,a);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:s}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",a="",s=""){let i;if("object"==typeof e&&e){const r=this._getSignatureData(e.signatureType,t,a);i=this._makeKeyValuePairFromObject(r,e.signatureValue),e.challenge&&(i+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(i,e.signatureType,s)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(i=`password=${e}`,this._buildSignatureHeaders(i,"2",s)):(i=`${a}=${e}`,this._buildSignatureHeaders(i,t,s)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let a,s=e.split(",");if(s.length>1){a=s.map((e=>`${e}=${t[e]}`)).join(",")}else a=`${e}=${t}`;return a}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",a=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),a&&(this.headers=Object.assign(this.headers,{AuthenticationState:a})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let a=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),i=this._ERROR_CODES.SIGNATURE_INVALID.includes(s),{type:r,data:n,state:o,challenge:l,response:u}=this._extractSignatureResponseHeaders(e),c=this._getRequestMetadata(e);if(i)this._notifySignatureInvalid(c),a=!0;else if(r)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(s)?(this._notifySignatureTypeUsingErrorCode(s,c,r,n,o,l,u),a=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(c,r,n,o,l,u),a=!0}return a}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let a=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),i=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(s),r=this._getRequestMetadata(e);i&&(this._notifyWaitingForProcessResponse(r),a=!0)}return a}_notifySignatureRequiredFirstStep(e,t,a,s){this._defineSignatureType(t,a),this._defineSignatureValue(t,a,s),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:a,metadata:e}}))}_notifySignatureRequired(e,t,a,s,i,r){this._defineSignatureValue(t,a,s);const n={type:t,data:a,challenge:i,metadata:e};r&&(n.response=r),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:n}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:a}=e;return{path:this._path,method:this.method,url:t,status:a}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",a=""){const s=t.split(";").findIndex((t=>t===e));return a?a.split(";")[s]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,a,s,i,r){s?this._notifySignatureRequired(e,t,a,s,i,r):this._notifySignatureRequiredFirstStep(e,t,a,s)}_notifySignatureTypeUsingErrorCode(e,t,a,s,i,r,n){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,a,s,i):this._notifySignatureRequired(t,a,s,i,r,n)}}class Ie extends Ae{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}}class Ve extends Ae{constructor(e=null){super(Object.assign(e||{},{method:"POST"}))}toString(e=""){return super.toString(e||"BGADPRequestPOST")}}class Me extends Ie{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/economic-data`)}toString(){return super.toString("BGADPCustomersCustomerEconomicDataGetV0")}}class Ne extends Ie{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/civil-registries`)}toString(){return super.toString("BGADPCustomersCivilRegistriesGetV1")}}class Le extends Ve{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/civil-registries/search`)}toString(){return super.toString("BGADPCustomersCivilRegistriesSearchPostV1")}}class je extends Ie{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/identification-process/documents`)}toString(){return super.toString("BGADPCustomersCustomerIdentificationProcessDocumentsGetV1")}}class Fe extends Ve{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/identification-process/documents`)}toString(){return super.toString("BGADPCustomersCustomerIdentificationProcessDocumentsPostV1")}}class Be extends Ie{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/indicators`)}toString(){return super.toString("BGADPCustomersCustomerIndicatorsGetV1")}}class He extends Ie{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/terms`)}toString(){return super.toString("BGADPCustomersCustomerTermsGetV1")}}class Ge extends Ve{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/terms`)}toString(){return super.toString("BGADPCustomersCustomerTermsPostV1")}}class ze extends(t(a)){_mappingBank(e){this._renameProperty(e,"bank.bankId","id"),this._renameProperty(e,"bank.branch.branchId","id"),e.bank&&e.bank.branch&&e.bank.branch.costCenter&&(e.bank.branch.costCenter={id:e.bank.branch.costCenter})}_mappingGender(e){this._renameProperty(e,"gender.name","description")}_mappingIdentityDocuments(e){for(let t=0;t<e.identityDocuments.length;t++)this._renameProperty(e.identityDocuments[t],"documentType.name","description"),this._renameProperty(e.identityDocuments[t],"status.name","description")}_mappingMaritalStatus(e){this._renameProperty(e,"maritalStatus.name","description")}_mappingNationalities(e){for(let t=0;t<e.nationalities.length;t++)this._renameProperty(e.nationalities[t],"name","description")}_mappingPersonalTitle(e){this._renameProperty(e,"personalTitle.name","description")}_mappingResidence(e){this._renameProperty(e,"residence","taxResidence"),this._renameProperty(e,"taxResidence.residenceType.name","description")}_mappingVerification(e){this._renameProperty(e,"enrollmentModality","verification"),this._renameProperty(e,"verification.enrollmentMethod","identificationMethod")}_mappingSegments(e){for(let t=0;t<e.segments.length;t++)this._renameProperty(e.segments[t],"name","description")}_changeNameToDescription(e){e.map((e=>{this._renameProperty(e,"name","description")}))}}class Ue extends ze{static get is(){return"bbva-global-customer-terms-base-api-dm"}resetCustomerTerms(){this.customerTerms=[]}getCustomerTerms(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields,this._paginationMapping)}postCustomerTerms(e,t){this._requestMapping(t);const a={"customer-id":e};this._generateGetService(this._getService("post",t,a),this.constructor.POST_EVENTS,this._responseMapping),this.resetCustomerTerms()}_getService(e,t={},a={}){const s=this._getServiceParams(a,t);return this._getServicePath(`${e}CustomerTerms`,this._getBgadp(s))}_getBgadp(e){return{getCustomerTermsV1:()=>new He(e),postCustomerTermsV1:()=>new Ge(e),default:()=>"BGADP does not exist."}}_requestMapping(e){return e}_responseMapping(e){return e}_paginationMapping(e){return e}}s(Ue,"GET_EVENTS",{customEvent:"customer-terms-api-dm-fetch",paginationEvent:"customer-terms-api-dm-pagination",errorFireEventHandler:"customer-terms-api-dm-fetch-error"}),s(Ue,"POST_EVENTS",{customEvent:"customer-terms-api-dm-create",errorFireEventHandler:"customer-terms-api-dm-create-error"}),customElements.define(Ue.is,Ue);class Xe extends ze{static get is(){return"bbva-global-customer-terms-api-dm"}static get properties(){return{customerTerms:{type:Array,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.customerTerms=[],this.country="",this.localCustomProperties={},this._countries=[],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties","customerTerms"],this._loaded=!1,this._requestParams={}}update(e){super.update(e),e.forEach(((e,t)=>{"country"===t&&this.country&&this.country!==e?this._loadModule():"_module"!==t&&"_requestParams"!==t&&"_loaded"!==t&&this._module&&this[t]!==e?this._module[t]=this[t]:("_requestParams"===t&&this._requestParams&&this._requestParams!==e&&void 0!==e&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===t&&this._loaded)&&Object.entries(this._requestParams).forEach((([e])=>{this[`_${e}CustomerTerms`]()}))}))}async _loadModule(){const e=this._capitalize(this.country);if(this._countries.includes(e)&&this._modules[e]){const t=`BbvaCustomerTerms${e}ApiDm`;(0,this._modules[e])().then((async e=>{const a=e[t].is;this._module=this._createModuleElement(a),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-customer-terms-api-dm-module-load")})).catch((async e=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-customer-terms-api-dm-module-error",e)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(e){return e.charAt(0).toUpperCase()+e.slice(1).toLowerCase()}_createModuleElement(e=Ue.is){const t=document.createElement(e);return this._bindConfig(t),t}async _bindConfig(e){this._configProperties.forEach((t=>{e[t]=this[t]})),await this.updateComplete}_dispatchEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}async resetCustomerTerms(){await this.module.updateComplete,this.module.resetCustomerTerms()}async getCustomerTerms(e,t={}){await this.module.updateComplete,this._requestParams.get?this._requestParams.get.push({customerId:e,params:t}):this._requestParams={get:[{customerId:e,params:t}]}}async _getCustomerTerms(){await this.module.updateComplete,Object.keys(this.customerTerms).length||(this._requestParams.get.forEach((e=>{this.module.getCustomerTerms(e.customerId,e.params)})),delete this._requestParams.get)}async postCustomerTerms(e,t){await this.module.updateComplete,this._requestParams.post?this._requestParams.post.push({customerId:e,body:t}):this._requestParams={post:[{customerId:e,body:t}]}}async _postCustomerTerms(){await this.module.updateComplete,this._requestParams.post.forEach((e=>{this.module.postCustomerTerms(e.customerId,e.body)})),delete this._requestParams.post}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return i` ${this._module?this._module:""}`}}class Qe extends ze{static get is(){return"bbva-global-customer-lopd-documents-base-api-dm"}resetCustomerLopdDocuments(){this.customerLopdDocuments={}}getCustomerLopdDocuments(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},a={}){const s=this._getServiceParams(a,t);return this._getServicePath(`${e}CustomerLopdDocuments`,this._getBgadp(s))}_getBgadp(e){return{getCustomerLopdDocumentsV3:()=>new Q(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}s(Qe,"GET_EVENTS",{customEvent:"customer-lopd-documents-api-dm-fetch",errorFireEventHandler:"customer-lopd-documents-api-dm-fetch-error"}),customElements.define(Qe.is,Qe);class Ke extends ze{static get is(){return"bbva-global-customer-economic-data-base-api-dm"}resetCustomerEconomicData(){this.customerEconomicData={}}getCustomerEconomicData(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},a={}){const s=this._getServiceParams(a,t);return this._getServicePath(`${e}CustomerEconomicData`,this._getBgadp(s))}_getBgadp(e){return{getCustomerEconomicDataV0:()=>new Me(e),getCustomerEconomicDataV2:()=>new Z(e),getCustomerEconomicDataV3:()=>new ee(e),default:()=>"BGADP does not exist."}}_incomesMapping(e){e.map((e=>{e.incomeValue={},e.incomeValue={valueType:"EXACT",amount:{amount:e.incomeValues[0].amount,currency:e.incomeValues[0].currency}},e.incomeValues[0].concept&&(e.incomeValue.concept=e.incomeValues[0].concept),e.incomeValues[0].frecuency&&(e.incomeValue.frequency=e.incomeValues[0].frecuency),"BIWEEKLY"==e.incomeValue.frequency&&(e.incomeValue.frequency="BI_WEEKLY"),this._removeFields(["incomeValues"],e),this._changeNameToDescription([e.incomeType])}))}_expensesMapping(e){e.map((e=>{e.expenseValue={currency:e.expenseValues[0].currency,amount:e.expenseValues[0].amount},e.expenseValues[0].frecuency&&(e.expenseValue.frequency=e.expenseValues[0].frecuency),e.expenseValue.frequency&&"BIWEEKLY"==e.expenseValue.frequency&&(e.expenseValue.frequency="BI_WEEKLY"),this._removeFields(["expenseValues"],e),this._changeNameToDescription([e.expenseType])}))}_workPlaceMapping(e){e.address&&(e.address.addressType&&"WORK"!==e.address.addressType.id&&this._removeFields(["id"],e.address.addressType),e.address.ownershipType&&(["MOVED","REJECTED","NOT_LOCATED"].includes(e.address.ownershipType.id)&&this._removeFields(["id"],e.address.ownershipType),this._changeNameToDescription([e.address.ownershipType,e.address.ownershipType.propertyType])),this._renameProperty(e.address.location,"addressName","formatedAddress"),this._removeFields(["residenceStartDate"],e.address),this._removeFields(["city","state","country","zipCode","geolocation","geographicGroups","meta"],e.address.location)),this._changeNameToDescription([e.address.addressType,e.economicActivity,e.profesionPosition]),this._renameProperty(e,"profesionPosition","professionPosition"),this._removeFields(["taxpayerIdentification"],e)}_assetsMapping(e){e.map((e=>{this._changeNameToDescription([e.assetType]),e.assetValues.map((e=>{this._removeFields(["concept"],e)}))}))}_liabilitiesMapping(e){e.map((e=>{this._changeNameToDescription([e.liabilityType]),e.liabilityValues.map((e=>{this._removeFields(["concept","frecuency"],e)}))}))}_responseMapping(e){return"0"==this.version&&Object.keys(e).length?(this._changeNameToDescription([e.economicActivity,e.occupationType,e.employmentSituation,e.education]),e.incomes&&this._incomesMapping(e.incomes),e.expenses&&this._expensesMapping(e.expenses),e.workPlace&&this._workPlaceMapping(e.workPlace),e.assets&&this._assetsMapping(e.assets),e.liabilities&&this._liabilitiesMapping(e.liabilities),e.balances&&e.balances.map((e=>{this._changeNameToDescription([e])})),this._renameProperty(e,"workPlace","workplace"),this._removeFields(["financialGroup","financialSubGroup","indicators","incomeSources"],e)):"2"==this.version&&Object.keys(e).length&&(e.workPlace&&e.workPlace.economicActivities&&(e.workPlace.economicActivity=e.workPlace.economicActivities[0],this._removeFields(["economicActivities"],e.workPlace)),e.balances&&e.balances.forEach((e=>{e.id=e.balanceType.id,e.description=e.balanceType.description,e.amount=e.balanceValue.amount,e.currency=e.balanceValue.currency,this._removeFields(["balanceType","balanceValue"],e)})),e.expenses&&e.expenses.forEach((e=>{["OTHER_LOAN","REVOLVING_CARD","FIXED_PAYMENT"].includes(e.expenseType.id)&&this._removeFields(["expenseType"],e)})),e.assets&&e.assets.forEach((e=>{["BANK_DEPOSIT"].includes(e.assetType.id)&&this._removeFields(["assetType"],e)})),e.liabilities&&e.liabilities.forEach((e=>{["MORTGAGE","PERSONAL_LOANS","OTHER_LOANS"].includes(e.liabilityType.id)&&this._removeFields(["liabilityType"],e)})),this._renameProperty(e,"workPlace","workplace"),this._removeFields(["financialSummaries"],e)),e}}s(Ke,"GET_EVENTS",{customEvent:"customer-economic-data-api-dm-fetch",errorFireEventHandler:"customer-economic-data-api-dm-fetch-error"}),customElements.define(Ke.is,Ke);class We extends ze{static get is(){return"bbva-global-civil-registries-search-base-api-dm"}resetCivilRegistriesSearch(){this.civilRegistriesSearch=[]}postCivilRegistriesSearch(e){this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping)}_getService(e,t={},a={}){const s=this._getServiceParams(a,t);return this._getServicePath(`${e}CivilRegistriesSearch`,this._getBgadp(s))}_getBgadp(e){return{postCivilRegistriesSearchV1:()=>new Le(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}s(We,"POST_EVENTS",{customEvent:"civil-registries-search-api-dm-fetch",errorFireEventHandler:"civil-registries-search-api-dm-fetch-error"}),customElements.define(We.is,We);class Ye extends ze{static get is(){return"bbva-global-civil-registries-base-api-dm"}resetCivilRegistries(){this.civilRegistries=[]}getCivilRegistries(e){this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields,this._paginationMapping)}_getService(e,t={},a={}){const s=this._getServiceParams(a,t);return this._getServicePath(`${e}CivilRegistries`,this._getBgadp(s))}_getBgadp(e){return{getCivilRegistriesV1:()=>new Ne(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}_paginationMapping(e){return e}}s(Ye,"GET_EVENTS",{customEvent:"civil-registries-api-dm-fetch",paginationEvent:"civil-registries-api-dm-pagination",errorFireEventHandler:"civil-registries-api-dm-fetch-error"}),customElements.define(Ye.is,Ye);class Je extends ze{static get is(){return"bbva-global-customers-child-customers-base-api-dm"}postCustomersChildCustomers(e){this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping)}_getService(e,t={},a={}){const s=this._getServiceParams(a,t);return this._getServicePath(`${e}CustomersChildCustomers`,this._getBgadp(s))}_getBgadp(e){return{postCustomersChildCustomersV3:()=>new ae(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}s(Je,"POST_EVENTS",{customEvent:"customers-child-customers-api-dm-create",errorFireEventHandler:"customers-child-customers-api-dm-create-error"}),customElements.define(Je.is,Je);class Ze extends ze{static get is(){return"bbva-global-customer-identification-process-documents-base-api-dm"}resetCustomerIdentificationProcessDocuments(){this.customerIdentificationProcessDocuments=[]}getCustomerIdentificationProcessDocuments(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}postCustomerIdentificationProcessDocuments(e,t){const a={"customer-id":e};this._generateGetService(this._getService("post",t,a),this.constructor.POST_EVENTS,this._responseMapping),this.resetCustomerIdentificationProcessDocuments()}_getService(e,t={},a={}){const s=this._getServiceParams(a,t);return this._getServicePath(`${e}CustomerIdentificationProcessDocuments`,this._getBgadp(s))}_getBgadp(e){return{getCustomerIdentificationProcessDocumentsV1:()=>new je(e),postCustomerIdentificationProcessDocumentsV1:()=>new Fe(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}s(Ze,"GET_EVENTS",{customEvent:"customer-identification-process-documents-api-dm-fetch",errorFireEventHandler:"customer-identification-process-documents-api-dm-fetch-error"}),s(Ze,"POST_EVENTS",{customEvent:"customer-identification-process-documents-api-dm-create",errorFireEventHandler:"customer-identification-process-documents-api-dm-create-error"}),customElements.define(Ze.is,Ze);class et extends ze{static get is(){return"bbva-global-customer-indicators-base-api-dm"}resetCustomerIndicators(){this.customerIndicators=[]}getCustomerIndicators(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},a={}){const s=this._getServiceParams(a,t);return this._getServicePath(`${e}CustomerIndicators`,this._getBgadp(s))}_getBgadp(e){return{getCustomerIndicatorsV1:()=>new Be(e),getCustomerIndicatorsV3:()=>new te(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return"1"==this.version&&Object.keys(e).length&&e.forEach((e=>{["BASIC_DATA","ENTREPRENEUR_AND_POTENTIAL","WEB_CONSUMPTION_ACCOUNT","USER_EXPIRED"].includes(e.id)&&this._removeFields(["id"],e),this._removeFields(["payrollAmounts","payrollAge"],e)})),e}}s(et,"GET_EVENTS",{customEvent:"customer-indicators-api-dm-fetch",errorFireEventHandler:"customer-indicators-api-dm-fetch-error"}),customElements.define(et.is,et);var tt=r`
  :host {
    --_sustainability-sustainable-solar-panels-simulator-savings-separator-color: var(
      --sustainability-sustainable-solar-panels-simulator-savings--_ambient--default-separator-color,
      var(
        --sustainability-sustainable-solar-panels-simulator-savings--custom--primary-ambient--default-separator-color,
        ${b("colorSecondaryFormatDivider",g)}
      )
    );
  }
`,at=r`
  :host {
    display: block;
    box-sizing: border-box;
    --sustainability-sustainable-solar-panels-simulator-savings-expenses-num-columns: 2;
    padding: 1rem;
  }

  :host([hidden]),
  [hidden] {
    display: none !important;
  }

  .header-description {
    padding-bottom: 0.5rem;
  }

  .installation-cost-disclaimer {
    margin-top: 1rem;
    margin-bottom: 1.5rem;
  }

  .definition-amount {
    display: flex;
    justify-content: space-between;
    gap: 1rem;
    padding-bottom: 0.5rem;
  }

  .notification-message {
    margin-top: 1rem;
    margin-bottom: 0.5rem;
  }

  .expenses-grid {
    display: grid;
    grid-template-columns: repeat(
      var(--sustainability-sustainable-solar-panels-simulator-savings-expenses-num-columns),
      1fr
    );
  }
  .expenses-grid .expense-cell {
    display: flex;
    flex-direction: column;
    padding-top: 1rem;
  }
  .expenses-grid > :nth-child(2n) {
    border-left: 0.0625rem solid
      var(--_sustainability-sustainable-solar-panels-simulator-savings-separator-color);
    padding-left: 1rem;
  }

  *,
  *:before,
  *:after {
    box-sizing: inherit;
  }
`;class st extends(v(f(n(a)))){static get is(){return"sustainability-sustainable-solar-panels-simulator-savings"}static get properties(){return{sustainabilityApiVersion:{type:String,attribute:"sustainability-api-version"},localCurrency:{type:String,attribute:"local-currency"},savings:{type:Object},solarPanelsSimulationData:{type:Object,attribute:"solar-panels-simulation-data"},quotationsData:{type:Object,attribute:"quotations-data"},financingTermValueYears:{type:Number,attribute:"financing-term-value-years"},maxRequestAttempts:{type:Number,attribute:"max-request-attempts"},suggestedTerm:{type:Object,attribute:"suggested-term"},_requestErrors:{type:Object},_currentRequests:{type:Object}}}static get scopedElements(){const e=[_e,E,T,$,q,k];return st.scopedElementsFromClasses(e)}constructor(){super(),this.suggestedTerm={},this.quotationsData={},this.solarPanelsSimulationData={},this.savings={},this.localCurrency="",this.sustainabilityApiVersion="1",this.financingTermValueYears=0,this.maxRequestAttempts=3,this._requestErrors={savings:0},this._currentRequests={savings:!1}}firstUpdated(e){super.firstUpdated(e)}updated(e){super.updated(e),e.has("quotationsData")&&Object.keys(this.quotationsData).length&&this._requestData()}static get styles(){return[at,tt,y.primary,_.primaryAlt,x.primary,S.primary,o("sustainability-sustainable-solar-panels-simulator-savings-shared-styles")]}get _headers(){return this.headers||{"Accept-Language":this.language}}get savingsDmElement(){return this._savingsDmElement||(this._savingsDmElement=this.shadowRoot.querySelector("#solar-panel-calculate-saving-api-dm")),this._savingsDmElement}get _installationCost(){var e,t;const a=null===(e=this.quotationsData)||void 0===e||null===(t=e.loanBreakDown)||void 0===t?void 0:t.find((e=>"INSTALLMENT"===e.id));return{amount:null==a?void 0:a.amount,currency:null==a?void 0:a.currency}}_requestData(){var e,t,a;const s={value:null===(e=this.suggestedTerm)||void 0===e?void 0:e.number,frequency:null===(t=this.suggestedTerm)||void 0===t?void 0:t.frequency},i={annualElectricityBills:null===(a=this.solarPanelsSimulationData)||void 0===a?void 0:a.annualElectricityBills,installationCost:this._installationCost,financingTerm:0!==Object.keys(this.financingTermValueYears).length?this.financingTermValueYears:s};this.savingsDmElement&&Object.keys(this.suggestedTerm).length>0&&Object.keys(this.quotationsData).length>0&&(this._currentRequests={...this._currentRequests,savings:!0},this.savingsDmElement.postSolarPanelCalculateSaving(i))}_onCalculateSavingRequestSuccess({detail:e}){this.savings=e||{},this._requestErrors={...this._requestErrors,savings:0},this._currentRequests={...this._currentRequests,savings:!1},this.dispatchEvent(new CustomEvent("sustainability-sustainable-solar-panels-simulator-savings-fetch",{detail:e,bubbles:!0,composed:!0}))}_onRequestError(){this._requestErrors={...this._requestErrors,savings:this._requestErrors.savings+1},this._currentRequests={...this._currentRequests,savings:!1}}get _hasSavingsError(){return this._requestErrors.savings>0}get _solarPanelSimulatorCalculateSavingDmTemplate(){return i`
      <bbva-global-solar-panel-calculate-saving-api-dm
        id="solar-panel-calculate-saving-api-dm"
        .host="${this.host}"
        .headers="${this._headers}"
        .version="${this.sustainabilityApiVersion}"
        .requiredToken="${this.requiredToken}"
        .native="${this.native}"
        @solar-panel-calculate-saving-api-dm-fetch="${e=>{this._onCalculateSavingRequestSuccess(e)}}"
        @solar-panel-calculate-saving-api-dm-fetch-error="${()=>{this._onRequestError()}}"
        @api-dm-error="${()=>{this._onRequestError()}}"
      >
      </bbva-global-solar-panel-calculate-saving-api-dm>
    `}get _savingsHeaderTemplate(){var e,t;return i`
      <bbva-type-text
        class="header-description"
        tag="span"
        text="${this.t("sustainability-sustainable-solar-panels-simulator-savings-header-description")}"
        size="XL"
        font-weight="500"
        ?loading="${!(null!==(e=this.solarPanelsSimulationData)&&void 0!==e&&null!==(t=e.annualElectricityBills)&&void 0!==t&&t.length)>0}"
      >
      </bbva-type-text>
    `}get _annualExpensesTemplate(){var e;const t=null===(e=this.solarPanelsSimulationData)||void 0===e?void 0:e.annualElectricityBills,a={...null==t?void 0:t.find((e=>"PANELS"===e.id)),text:"sustainability-sustainable-solar-panels-simulator-annual-expenses-text-with-panels"},s=[{...null==t?void 0:t.find((e=>"NO_PANELS"===e.id)),text:"sustainability-sustainable-solar-panels-simulator-annual-expenses-text-without-panels"},a,{},{amount:12*this._installationCost.amount,currency:this._installationCost.currency,text:"sustainability-sustainable-solar-panels-simulator-savings-installation-cost"}];return i`
      <div class="expenses-grid">
        ${null==s?void 0:s.map((e=>i`
            <div class="expense-cell">
              ${null!=e&&e.text?i`
                    <bbva-type-text
                      text="${this.t(null==e?void 0:e.text)}"
                      tag="span"
                      ?loading="${!(null!=t&&t.length)>0}"
                    ></bbva-type-text>
                    <bbva-type-amount
                      ambient="primary-alt"
                      decimals-hidden
                      amount="${null==e?void 0:e.amount}"
                      currency-code="${null==e?void 0:e.currency}"
                      language="es"
                      .localCurrency="${this.localCurrency}"
                      ?loading="${!(null!=t&&t.length)>0}"
                    >
                    </bbva-type-amount>
                  `:i``}
            </div>
          `))}
      </div>
    `}get _installationCostDisclaimerTemplate(){return i`
      <bbva-notification-help
        class="installation-cost-disclaimer"
        accessibility-label-icon="Info"
        icon=${l()}
        text=${this.t("sustainability-sustainable-solar-panels-simulator-savings-installation-cost-disclaimer",{years:this.financingTermValueYears})}
        ?loading="${this._currentRequests.savings}"
      >
      </bbva-notification-help>
    `}get _savingsTemplate(){var e,t,a;const s=null===(e=this.savings)||void 0===e?void 0:e.initialSavings,r=Number(null==s?void 0:s.year.value),n=!this._currentRequests.savings&&r>0&&Number(null==s?void 0:s.amount)>=Number(null==s||null===(t=s.threshold)||void 0===t?void 0:t.amount),o=null===(a=this.savings)||void 0===a?void 0:a.accumulatedSavings;return i`
      ${n?i`
            <div class="definition-amount">
              <bbva-type-text
                tag="span"
                class="amount-text"
                text="${this.t("sustainability-sustainable-solar-panels-simulator-savings-initial-savings",{year:this.savings.initialSavings.year.ordinalValue})}"
                size="S"
                font-weight="500"
              ></bbva-type-text>
              <bbva-type-amount
                ambient="primary-alt"
                variant="m"
                type="bold"
                decimals-hidden
                amount="${s.amount}"
                currency-code="${s.currency}"
                local-currency="${this.localCurrency}"
                language="${this.language}"
              ></bbva-type-amount>
            </div>
          `:i``}
      ${null==o?void 0:o.map(((e,t)=>(null==e?void 0:e.amount)>0?i`
              <div class="definition-amount">
                <bbva-type-text
                  tag="span"
                  class="amount-text"
                  text="${this.t(`sustainability-sustainable-solar-panels-simulator-savings-accumulated-savings-${t}`,{year:e.year})}"
                  size="S"
                  font-weight="350"
                  ?loading="${this._currentRequests.savings}"
                ></bbva-type-text>
                <bbva-type-amount
                  ambient="primary-alt"
                  variant="m"
                  type="bold"
                  decimals-hidden
                  amount="${e.amount}"
                  currency-code="${e.currency}"
                  local-currency="${this.localCurrency}"
                  language="${this.language}"
                  ?loading="${this._currentRequests.savings}"
                ></bbva-type-amount>
              </div>
            `:i``))}
    `}get notificationMessageTemplate(){return i`
      <bbva-notification-message
        class="notification-message"
        message="${this.t("sustainability-sustainable-solar-panels-simulator-savings-notification-message")}"
        message-title="${this.t("sustainability-sustainable-solar-panels-simulator-savings-notification-message-title")}"
        book-title
        ?loading="${this._currentRequests.savings}"
      >
      </bbva-notification-message>
    `}_sectionErrorTemplate(e){const t=this._requestErrors[e]<=this.maxRequestAttempts;return i`
      <div class="section-error-wrapper">
        <bbva-notification-message
          variant="error"
          book-title
          .messageTitle="${t?this.t("sustainability-sustainable-solar-panels-simulator-savings-error-section-text"):this.t("sustainability-sustainable-solar-panels-simulator-savings-error-section-text-no-retries")}"
          .linkTitle="${t?this.t("sustainability-sustainable-solar-panels-simulator-savings-error-section-link"):""}"
          @notification-message-link-click="${()=>{this._requestData()}}"
        ></bbva-notification-message>
        <bbva-progress-content
          ambient="primary"
          variant="transparent"
          ?visible="${this._currentRequests[e]}"
        ></bbva-progress-content>
      </div>
    `}render(){var e,t,a,s;const r=this._currentRequests.savings||Number(null===(e=this.savings)||void 0===e||null===(t=e.initialSavings)||void 0===t||null===(a=t.year)||void 0===a?void 0:a.value)<=Number(null===(s=this.savings)||void 0===s?void 0:s.savingsValidityPeriod);let n;return n=this._hasSavingsError?i`
        ${this._sectionErrorTemplate("savings")}
      `:r?i`
        ${this._savingsHeaderTemplate} ${this._annualExpensesTemplate}
        ${this._installationCostDisclaimerTemplate} ${this._savingsTemplate}
      `:i``,i`
      ${this._solarPanelSimulatorCalculateSavingDmTemplate} ${n}
      ${this.notificationMessageTemplate}
    `}}var it=r`
  :host {
    --_sustainability-sustainable-solar-panels-simulator-products-offer-card-bg-color: var(
      --sustainability-sustainable-solar-panels-simulator-products--_ambient--default-offer-card-bg-color,
      var(
        --sustainability-sustainable-solar-panels-simulator-products--custom--primary-ambient--default-offer-card-bg-color,
        ${b("colorSecondarySurfaceAmbientDefault",g)}
      )
    );
    --_sustainability_sustainable-solar-panels-simulator-products-skeleton-quote-color: var(
      --sustainability-sustainable-solar-panels-simulator-products--_ambient--default-skeleton-quote-color,
      var(
        --sustainability-sustainable-solar-panels-simulator-products--custom--primary-ambient--default-skeleton-quote-color,
        ${b("colorPrimarySurfaceAmbientOverlay",g)}
      )
    );
    --_sustainability-sustainable-solar-panels-simulator-products-skeleton-quote-bg: var(
      --sustainability-sustainable-solar-panels-simulator-products--_ambient--default-skeleton-quote-bg,
      var(
        --sustainability-sustainable-solar-panels-simulator-products--custom--primary-ambient--default-skeleton-quote-bg,
        ${b("colorSecondaryAltSurfaceAmbientDefault",g)}
      )
    );
  }
`,rt=r`
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

  .products-section {
    padding-bottom: 1.5rem;
  }
  .products-section [data-tag-name='bbva-header-category'] {
    padding: 0.5rem 1rem;
  }
  .products-section .offer-card {
    text-align: left;
    padding: 1rem 1rem 0.5rem;
    margin: 0 1rem;
    background-color: var(
      --_sustainability-sustainable-solar-panels-simulator-products-offer-card-bg-color
    );
  }
  .products-section .offer-card [data-tag-name='bbva-type-text'] {
    margin: 0.5rem 0;
    --bbva-type-text--_ambient-skeleton-quote-color: transparent;
  }
  .products-section .offer-card img {
    height: 3.5rem;
  }

  .section-error-wrapper {
    position: relative;
    padding: 0 1rem 1.5rem;
  }
  .section-error-wrapper [data-tag-name='bbva-progress-content'] {
    position: absolute;
  }

  .skeleton {
    position: relative;
    overflow: hidden;
    width: 90%;
    margin-left: 1rem;
    background-repeat: no-repeat;
    opacity: 1;
    pointer-events: none;
  }

  .skeleton-products {
    height: 13rem;
    background-image: linear-gradient(
        var(--_sustainability_sustainable-solar-panels-simulator-products-skeleton-quote-color) 100%,
        transparent 0
      ),
      linear-gradient(
        -60deg,
        transparent 50%,
        var(--_sustainability_sustainable-solar-panels-simulator-products-skeleton-quote-color) 50%
      ),
      linear-gradient(
        -60deg,
        transparent 50%,
        var(--_sustainability_sustainable-solar-panels-simulator-products-skeleton-quote-color) 50%
      ),
      linear-gradient(
        -60deg,
        transparent 50%,
        var(--_sustainability_sustainable-solar-panels-simulator-products-skeleton-quote-color) 50%
      );
    background-color: var(
      --_sustainability-sustainable-solar-panels-simulator-products-skeleton-quote-bg
    );
    background-size:
      80px 80px,
      calc((66% * 2) + (16px / 2)) 16px,
      calc((90% * 2) + (16px / 2)) 16px,
      calc((33% * 2) + (16px / 2)) 16px;
    background-position:
      16px 16px,
      16px 120px,
      16px 152px,
      16px 176px;
  }

  .animation {
    background-color: var(
      --_sustainability-sustainable-solar-panels-simulator-products-skeleton-quote-bg
    );
    position: relative;
    top: 0;
    left: 0;
    height: 13rem;
    animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
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
`;class nt extends(u(v(n(a)))){static get is(){return"sustainability-sustainable-solar-panels-simulator-products"}static get properties(){return{product:{type:Object},localCurrency:{type:String,attribute:"local-currency"},loanType:{type:String,attribute:"loan-type"},noPreapprovedLoanId:{type:String,attribute:"non-preapproved-id"},selectedProductOffer:{type:Object,default:{}},productId:{type:String,attribute:"product-id"},preferentialPreApproved:{type:Boolean,attribute:"preferential-preapproved"}}}static get scopedElements(){const e=[E,R,D,k,q,w];return nt.scopedElementsFromClasses(e)}constructor(){super(),this.selectedProductOffer={},this.product={},this.loanType="LOANS",this.noPreapprovedLoanId="00CB",this.productId="",this.preferentialPreApproved=!1}updated(e){super.updated(e),(e.has("product")||e.has("preferentialPreApproved"))&&(this.selectedProductOffer=this._selectedProductOffer)}static get styles(){return[it,rt,o("sustainability-sustainable-solar-panels-simulator-products-shared-styles"),y.primary,y.secondary,O.primary,O.secondary,P.primary,C.primary,C.secondary,S.primary]}get _selectedProductOffer(){let e;return e=this.preferentialPreApproved?"preference-preapproved":"conventional-preapproved",this.productId===this.noPreapprovedLoanId&&(e="non-preapproved"),e?{detail:{id:e,payload:this.product,eventId:"non-preapproved"===e?"non-preapproved":"preapproved"}}:{}}get _productOfferTemplate(){var e,t,a,s,r;const n=!(null!==(e=this.product)&&void 0!==e&&e.id);return i`
      ${n?i`
            <div class="skeleton skeleton-products">
              <div class="animation"></div>
            </div>
          `:i`
            <div class="offer-card" ambient="secondary">
              <bbva-clip-microillustration
                size="S"
                alt-microillustration="solar_panel"
                alt-image="Solar panel"
              >
              </bbva-clip-microillustration>

              <bbva-type-text
                .text="${this.t(`sustainability-sustainable-solar-panels-simulator-products-loan-${null===(t=this.selectedProductOffer)||void 0===t||null===(a=t.detail)||void 0===a?void 0:a.id}-description`)}"
                size="S"
                tag="span"
              >
              </bbva-type-text>
              <bbva-type-link
                size="S"
                @click="${()=>{var e;this._productsLinkClicked(null===(e=this.selectedProductOffer)||void 0===e?void 0:e.detail)}}"
                >${this.t(`sustainability-sustainable-solar-panels-simulator-products-loan-${null===(s=this.selectedProductOffer)||void 0===s||null===(r=s.detail)||void 0===r?void 0:r.id}-link`)}
              </bbva-type-link>
            </div>
          `}
    `}get _productsTemplate(){var e,t;const a=!(null!==(e=this.product)&&void 0!==e&&e.id);return i`
      ${null!==(t=Object.keys(this.selectedProductOffer))&&void 0!==t&&t.length?i`
            <div class="products-section" ambient="primary">
              <bbva-header-category
                heading-level="2"
                ?loading="${a}"
                .text="${this.t("sustainability-sustainable-solar-panels-simulator-products-title")}"
              >
              </bbva-header-category>
              ${this._productOfferTemplate}
            </div>
          `:i``}
    `}_productsLinkClicked(e){this.dispatchEvent(new CustomEvent("sustainability-sustainable-solar-panels-simulator-products-link-click",{detail:e,bubbles:!0,composed:!0}))}render(){return i`
      ${this._productsTemplate}
    `}}var ot=r`
  :host {
    --_sustainability-sustainable-solar-panels-simulator-financing-modal-icon: var(
      --sustainability-sustainable-solar-panels-simulator--_ambient--default-financing-modal-icon,
      var(
        --sustainability-sustainable-solar-panels-simulator--custom--primary-ambient--default-financing-modal-icon,
        ${b("colorPrimaryFormInputIconDefault",g)}
      )
    );
  }
`,lt=r`
  :host {
    --_skeleton-default-bg-color: var(
      --bbva-skeleton-default--_ambient--bg-color,
      var(
        --bbva-skeleton-default--custom--primary-ambient--bg-color,
        var(--color-primary-surface-ambient-preloading, #ffffff)
      )
    );
    --_skeleton-default-animated-bg-color: var(
      --bbva-skeleton-default--_ambient--animated-bg-color,
      var(
        --bbva-skeleton-default--custom--primary-ambient--animated-bg-color,
        var(--color-primary-surface-ambient-default, #f4f4f4)
      )
    );
    --_skeleton-default-bg-color-alt: var(
      --bbva-skeleton-default--_ambient--bg-color-alt,
      var(
        --bbva-skeleton-default--custom--primary-ambient--bg-color-alt,
        var(--color-primary-surface-alternative-preloading, #e9e9e9)
      )
    );
    --_skeleton-default-animated-bg-color-alt: var(
      --bbva-skeleton-default--_ambient--animated-bg-color-alt,
      var(
        --bbva-skeleton-default--custom--primary-ambient--animated-bg-color-alt,
        var(--color-primary-surface-alternative-default, #ffffff)
      )
    );
  }

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

  .financing-conditions {
    display: flex;
    justify-content: space-between;
    padding-top: 1rem;
  }
  .financing-conditions .financing-rate {
    display: flex;
  }
  .financing-conditions .financing-rate [data-tag-name='bbva-type-text'] {
    width: 80%;
  }
  .financing-conditions .financing-rate [data-tag-name='bbva-type-icon'] {
    float: right;
    margin: 0.25rem 0 0 0.5rem;
    --bbva-type-icon--_ambient--color: var(
      --_sustainability-sustainable-solar-panels-simulator-financing-modal-icon
    );
  }
  .financing-conditions .life-insurance {
    display: flex;
  }
  .financing-conditions .life-insurance [data-tag-name='bbva-type-icon'] {
    float: right;
    margin: 0.25rem 0 0 0.5rem;
    --bbva-type-icon--_ambient--color: var(
      --_sustainability-sustainable-solar-panels-simulator-financing-modal-icon
    );
  }

  .financing {
    padding: 0 1rem 1rem;
  }
  .financing [data-tag-name='bbva-header-category'] {
    padding: 0;
    margin-top: 2rem;
  }
  .financing .range [data-tag-name='bbva-type-text'] {
    padding: 1rem 0 1rem 0;
  }
  .financing .range [data-tag-name='bbva-form-range-controller'] {
    padding: 1rem 0 1rem 0;
  }
  .financing .header-financing {
    padding-top: 1rem;
  }
  .financing .header-financing [data-tag-name='bbva-type-amount'] {
    margin-bottom: 1rem;
  }
  .financing .monthly-cost [data-tag-name='bbva-type-text'] {
    padding-top: 2rem;
  }
  .financing .monthly-cost [data-tag-name='bbva-type-amount'] {
    font-weight: 700;
  }

  .section-error-wrapper {
    position: relative;
    padding: 0 1rem 0;
  }
  .section-error-wrapper [data-tag-name='bbva-progress-content'] {
    position: absolute;
  }

  #sustainability-sustainable-solar-panels-simulator-financing-modal
    [data-tag-name='bbva-type-icon'] {
    margin: 0 0 0 1rem;
    --bbva-type-icon--_ambient--color: var(
      --_sustainability-sustainable-solar-panels-simulator-financing-modal-icon
    );
  }
  #sustainability-sustainable-solar-panels-simulator-financing-modal
    .content
    [data-tag-name='bbva-type-text'] {
    padding: 1rem;
    padding: 0 1rem 0 1rem;
    margin: 0;
  }

  #skeleton-financing-offer-header {
    height: 12rem;
    overflow: hidden;
    background-color: var(--_skeleton-default-bg-color);
    -webkit-mask-image: linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(black 100%, transparent 0),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, transparent 50%, black 50%);
    mask-image: linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(black 100%, transparent 0),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, transparent 50%, black 50%);
    -webkit-mask-position:
      0 16px,
      0 48px,
      0 96px,
      0 120px,
      0 152px;
    mask-position:
      0 16px,
      0 48px,
      0 96px,
      0 120px,
      0 152px;
    -webkit-mask-repeat: no-repeat;
    mask-repeat: no-repeat;
    -webkit-mask-size:
      calc((60% * 2) + (16px / 2)) 16px,
      36px 24px,
      calc((50% * 2) + (16px / 2)) 16px,
      calc((40% * 2) + (16px / 2)) 16px,
      calc((50% * 2) + (16px / 2)) 16px;
    mask-size:
      calc((60% * 2) + (16px / 2)) 16px,
      36px 24px,
      calc((50% * 2) + (16px / 2)) 16px,
      calc((40% * 2) + (16px / 2)) 16px,
      calc((50% * 2) + (16px / 2)) 16px;
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
  #skeleton-financing-offer-header::after {
    display: block;
    width: 100%;
    height: 100%;
    animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
    background-color: var(--_skeleton-default-animated-bg-color);
    background-image: linear-gradient(var(--_skeleton-default-bg-color) 100%, transparent 0);
    background-position-x: 100vh;
    background-repeat: no-repeat;
    content: '';
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

  #skeleton-financing-offer-cost-conditions {
    height: 16.5rem;
    overflow: hidden;
    background-color: var(--_skeleton-default-bg-color);
    -webkit-mask-image: linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(black 100%, transparent 0),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, black 50%, transparent 50%),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, transparent 50%, black 50%);
    mask-image: linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(black 100%, transparent 0),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, black 50%, transparent 50%),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, transparent 50%, black 50%);
    -webkit-mask-position:
      0 16px,
      0 48px,
      0 96px,
      0 120px,
      0 168px,
      calc(450%) 168px,
      0 200px,
      calc(725%) 200px,
      0 232px,
      calc(725%) 232px;
    mask-position:
      0 16px,
      0 48px,
      0 96px,
      0 120px,
      0 168px,
      calc(450%) 168px,
      0 200px,
      calc(725%) 200px,
      0 232px,
      calc(725%) 232px;
    -webkit-mask-repeat: no-repeat;
    mask-repeat: no-repeat;
    -webkit-mask-size:
      calc((60% * 2) + (16px / 2)) 16px,
      36px 24px,
      calc((50% * 2) + (16px / 2)) 16px,
      calc((40% * 2) + (16px / 2)) 16px,
      calc((33% * 2) + (16px / 2)) 16px,
      calc((45% * 2) + (16px / 2)) 16px,
      calc((33% * 2) + (16px / 2)) 16px,
      calc((45% * 2) + (16px / 2)) 16px,
      calc((33% * 2) + (16px / 2)) 16px,
      calc((45% * 2) + (16px / 2)) 16px;
    mask-size:
      calc((60% * 2) + (16px / 2)) 16px,
      36px 24px,
      calc((50% * 2) + (16px / 2)) 16px,
      calc((40% * 2) + (16px / 2)) 16px,
      calc((33% * 2) + (16px / 2)) 16px,
      calc((45% * 2) + (16px / 2)) 16px,
      calc((33% * 2) + (16px / 2)) 16px,
      calc((45% * 2) + (16px / 2)) 16px,
      calc((33% * 2) + (16px / 2)) 16px,
      calc((45% * 2) + (16px / 2)) 16px;
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
  #skeleton-financing-offer-cost-conditions::after {
    display: block;
    width: 100%;
    height: 100%;
    animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
    background-color: var(--_skeleton-default-animated-bg-color);
    background-image: linear-gradient(var(--_skeleton-default-bg-color) 100%, transparent 0);
    background-position-x: 100vh;
    background-repeat: no-repeat;
    content: '';
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
`;const ut={accordionStructure:[{id:"installation"},{id:"work-at-night"},{id:"savings-on-receipt",listItems:["text-1","text-2"]},{id:"modify-installation"},{id:"follow-progress"},{id:"is-viable-installation",listItems:["text-1","text-2"]}],financingInfoModalStructure:[{id:"interest-rate"},{id:"cat-without-iva",listItems:["text-1","text-2"]},{id:"opening-comision"},{id:"life-insurance",listItems:["text-1","text-2"]},{id:"life-insurance-unemployment",listItems:["text-1","text-2"]}]};class ct extends(u(v(n(a)))){static get is(){return"sustainability-sustainable-solar-panels-simulator-financing"}static get properties(){return{localCurrency:{type:String,attribute:"local-currency"},offerId:{type:String,attribute:"offer-id"},loanType:{type:String,attribute:"loan-type"},lifeInsuranceIds:{type:Array,attribute:"life-insurances-ids"},lifeUnemploymentId:{type:String,attribute:"life-Unemploymen-ids"},loanOffersApiVersion:{type:String,attribute:"loan-offers-api-version"},quotationsOffersApiVersion:{type:String,attribute:"quotations-offers-api-version"},financingLoansOffersData:{type:Object,attribute:"financing-loans-offers-data"},rateTypes:{type:Object,attribute:"rate-types"},financingTermValue:{type:Number,attribute:"financing-term-value"},financingTermFrequency:{type:Number,attribute:"financing-term-frequency"},financingLoansQuotationOffersData:{type:Object,attribute:"financing-loans-quotations-offers-data"},simulatorSupplierOfferData:{type:Object,attribute:"simulator-data"},contractingType:{type:Object,attribute:"contracting-type"},maxRequestAttempts:{type:Number,attribute:"max-request-attempts"},financingModalVisible:{type:Boolean,attribute:"financing-modal-visible"},financingModalKey:{type:String,attribute:"financing-modal-number"},feeTypeId:{type:String,attribute:"fee-type-id"},financingTermValueYears:{type:Number,attribute:"financing-term-value-years"},_requestErrors:{type:Object},_currentRequests:{type:Object},_rangeValue:{type:Number},_isEditQuotationOfferRequest:{type:Boolean}}}static get scopedElements(){const e=[qe,E,I,T,V,pe,D,q,k];return ct.scopedElementsFromClasses(e)}constructor(){super(),this.loanOffersApiVersion="1",this.quotationsOffersApiVersion="1",this.maxRequestAttempts=3,this.offerId="",this.loanType="LOANS",this.lifeInsuranceIds=["PBCCMPPI01","PBCCMNOM02"],this.lifeUnemploymentId="PBCCMNOM01",this._requestErrors={quotationsOffers:0},this._currentRequests={quotationsOffers:!1},this.financingModalVisible=!1,this.financingModalKey="",this.financingLoansOffersData={},this.financingTermValue=0,this.financingTermFrequency="",this.financingLoansQuotationOffersData={},this.simulatorSupplierOfferData={},this.rateTypes={sustainable:"TASA_SOSTENIBLE",annual:"TASA_ANUAL",cat:"CAT"},this.contractingType={categoryId:"H"},this.feeTypeId="OPEN_FEE",this.financingTermValueYears=0,this._isEditQuotationOfferRequest=!1,this._rangeValue=0}updated(e){var t,a,s,i,r,n;(super.updated(e),e.has("financingLoansOffersData")&&Object.keys(this.financingLoansOffersData).length)&&(this.financingTermValue=null===(t=this.financingLoansOffersData)||void 0===t||null===(a=t.details)||void 0===a||null===(s=a.maximumTerms)||void 0===s?void 0:s.number,this.financingTermFrequency=null===(i=this.financingLoansOffersData)||void 0===i||null===(r=i.details)||void 0===r||null===(n=r.maximumTerms)||void 0===n?void 0:n.frequency,this._rangeValue=this.financingTermValue,this._requestFinancingLoansQuotationsOffersData(this._createQuotationsBody()))}static get styles(){return[ot,lt,o("sustainability-sustainable-solar-panels-simulator-financing-shared-styles"),y.primary,y.secondary,_.primary,P.primary,de.primary,A.primary,S.primary]}get _headers(){return this.headers||{"Accept-Language":this.language}}get _hasQuotationsOffersError(){return this._requestErrors.quotationsOffers>0}get _solarPanelFinancingLoansQuotationsOffersDmTemplate(){return i`
      <bbva-global-offer-quotations-simulate-api-dm
        id="global-offers-loans-quotations-api-dm"
        .host="${this.host}"
        .headers="${this._headers}"
        .version="${this.quotationsOffersApiVersion}"
        .requiredToken="${this.requiredToken}"
        .native="${this.native}"
        @offer-quotations-simulate-api-dm-fetch="${e=>{this._onSolarPanelFinancingLoansQuotationsOffersRequestSuccess(e)}}"
        @offer-quotations-simulate-api-dm-fetch-error="${()=>{this._onRequestError("quotationsOffers")}}"
        @api-dm-error="${()=>{this._onRequestError("quotationsOffers")}}"
      >
      </bbva-global-offer-quotations-simulate-api-dm>
    `}get _headerFinancingTemplate(){var e,t,a,s,r;const n=null===(e=this.simulatorSupplierOfferData)||void 0===e?void 0:e.supplierOffer,o=null==n?void 0:n.discounts.find((e=>"FINANCING"===e.id)),l=null==o||null===(t=o.price)||void 0===t?void 0:t.currency,u=null==o||null===(a=o.price)||void 0===a?void 0:a.amount,c=null===(s=this.financingLoansOffersData)||void 0===s||null===(r=s.details)||void 0===r?void 0:r.maximumAmount.amount,d=c<=u;return i`
      ${n?i`
            <bbva-type-text
              tag="span"
              text="${this.t("sustainability-sustainable-solar-panels-simulator-financing-header-title")}"
              size="XL"
              font-weight="500"
            ></bbva-type-text>
            <div class="header-financing">
              <bbva-type-text
                text="${this.t("sustainability-sustainable-solar-panels-simulator-financing-title")}"
                tag="span"
              ></bbva-type-text>
              <bbva-type-amount
                ambient="primary"
                decimals-hidden
                amount="${d?c:u}"
                currency-code="${l}"
                .localCurrency="${this.localCurrency}"
                language="${this.language}"
              >
              </bbva-type-amount>
              ${d?i`
                    <bbva-notification-message
                      variant="default"
                      message-title="${this.t("sustainability-sustainable-solar-panels-simulator-financing-header-info")}"
                      book-title
                    >
                    </bbva-notification-message>
                  `:i``}
            </div>
          `:i`
            <div id="skeleton-financing-offer-header"></div>
          `}
    `}get _rangeFinancingTemplate(){var e,t,a,s;const r=null===(e=this.financingLoansOffersData)||void 0===e?void 0:e.details,n=null===(t=this.financingLoansOffersData)||void 0===t||null===(a=t.details)||void 0===a?void 0:a.allowedTerms,o=null==r?void 0:r.maximumTerms.number.toString(),l=null==r?void 0:r.minimumTerms.number.toString(),u=null==r?void 0:r.maximumTerms.frequency,c=null==n||null===(s=n.sort(((e,t)=>e.number-t.number)))||void 0===s?void 0:s.reduce(((e,t)=>(t.frequency===u&&e.push(String(t.number)),e)),[]);return i`
      <div class="range" ambient="primary">
        <bbva-type-text
          tag="span"
          font-weight="300"
          text="${this.t("sustainability-sustainable-solar-panels-simulator-financing-range-description")}"
          ?loading="${!r}"
        ></bbva-type-text>
        <bbva-form-range
          decimals-hidden=""
          informational-title="${this.t("sustainability-sustainable-solar-panels-simulator-financing-range-form-title")}"
          variant="informational-basic-section"
          .min="${l}"
          .max="${o}"
          currency-symbol=" "
          amount-bold
          value=${this._rangeValue}
          .disabled="${!r}"
          @form-range-value-change="${e=>{this._rangeChangedValues(e)}}"
          .items="${c}"
          show-labels=""
        ></bbva-form-range>
      </div>
      ${this._isEditQuotationOfferRequest?i`
            <bbva-progress-content
              variant="transparent"
              ?visible="${Object.values(this._currentRequests).some((e=>e))}"
            >
            </bbva-progress-content>
          `:""}
    `}_rangeChangedValues(e){var t,a;const s=null===(t=this.financingLoansQuotationOffersData)||void 0===t||null===(a=t.terms)||void 0===a?void 0:a.frequency;this._rangeValue=e.detail.value;const i={value:this._rangeValue,frequency:s};this.dispatchEvent(new CustomEvent("sustainability-sustainable-solar-panels-simulator-campaings-offers-value-change",{detail:i,bubbles:!0,composed:!0})),this._requestFinancingLoansQuotationsOffersData(this._createQuotationsBody()),this._isEditQuotationOfferRequest=!0}get _monthlyCostFinancingTemplate(){var e,t;const a=null===(e=this.financingLoansQuotationOffersData)||void 0===e||null===(t=e.loanBreakDown)||void 0===t?void 0:t.find((e=>"INSTALLMENT"===e.id));this.financingTermValueYears=this._rangeValue/12;const s=this._rangeValue;return i`
      ${null!=a&&a.amount?i`
            <div class="monthly-cost">
              <bbva-type-text
                text="${this.t("sustainability-sustainable-solar-panels-simulator-financing-monthly-cost-text")}"
                tag="span"
              >
              </bbva-type-text>
              <bbva-type-amount
                ambient="primary"
                decimals-hidden
                amount="${null==a?void 0:a.amount}"
                currency-code="${null==a?void 0:a.currency}"
                .localCurrency="${this.localCurrency}"
                language="${this.language}"
              ></bbva-type-amount>
              <bbva-type-text
                text="${this.t("sustainability-sustainable-solar-panels-simulator-financing-value-years",{range:s,financingTermValueYears:this.financingTermValueYears})}"
                tag="span"
              ></bbva-type-text>
            </div>
            ${this._conditionsFinancingTemplate}
          `:i`
            <div id="skeleton-financing-offer-cost-conditions"></div>
          `}
    `}get _conditionsFinancingTemplate(){var e,t,a,s,r,n,o,l,u,d,p,m,h;const b=null===(e=this.financingLoansQuotationOffersData)||void 0===e?void 0:e.additionalProducts,g=null===(t=this.financingLoansOffersData)||void 0===t||null===(a=t.contractingType)||void 0===a||null===(s=a.category)||void 0===s?void 0:s.id,v=null===(r=this.financingLoansOffersData)||void 0===r?void 0:r.rates,f="PERCENTAGE",y="INSURANCES",_=(null==v?void 0:v.find((e=>{var t,a,s;return g===(null===(t=this.contractingType)||void 0===t?void 0:t.categoryId)&&(null==e||null===(a=e.mode)||void 0===a?void 0:a.id)===f&&(null==e||null===(s=e.rateType)||void 0===s?void 0:s.id)===this.rateTypes.sustainable})))||(null==v?void 0:v.find((e=>{var t,a;return(null==e||null===(t=e.mode)||void 0===t?void 0:t.id)===f&&(null==e||null===(a=e.rateType)||void 0===a?void 0:a.id)===this.rateTypes.annual}))),x=null==v?void 0:v.find((e=>{var t,a;return(null==e||null===(t=e.rateType)||void 0===t?void 0:t.id)===this.rateTypes.cat&&(null==e||null===(a=e.mode)||void 0===a?void 0:a.id)===f})),S=null==b?void 0:b.find((e=>{var t;return(null==e||null===(t=e.productType)||void 0===t?void 0:t.id)===y&&this.lifeInsuranceIds.some((t=>t===(null==e?void 0:e.name)))})),E=null==b?void 0:b.find((e=>{var t;return(null==e||null===(t=e.productType)||void 0===t?void 0:t.id)===y&&this.lifeUnemploymentId===(null==e?void 0:e.name)})),T=null===(n=this.financingLoansOffersData)||void 0===n||null===(o=n.fees)||void 0===o?void 0:o.itemizeFees.find((e=>{var t;return(null==e||null===(t=e.feeType)||void 0===t?void 0:t.id)===this.feeTypeId}));return i`
      <bbva-header-category
        ambient="primary"
        heading-level="2"
        text="${this.t("sustainability-sustainable-solar-panels-simulator-financing-conditions-title")}">
      </bbva-header-category>
      <div class="financing-conditions">
        <div class="financing-rate">
          <bbva-type-text
            tag="span"
            class="amount-text"
            text="${this.t("sustainability-sustainable-solar-panels-simulator-financing-conditions-text-1")}"
            size="M"
            font-weight="350"
          ></bbva-type-text>
          <bbva-type-icon
            icon="${c()}"
            size="16"
            @click="${()=>{this.financingModalKey="interest-rate",this.financingModalVisible=!0}}"
          >
          </bbva-type-icon>
        </div>
        <bbva-type-amount
          ambient="primary"
          variant="M"
          type="bold"
          decimal-digits="2"
          amount='${null==_||null===(l=_.unit)||void 0===l?void 0:l.percentage}'
          currency-code="%"
          language="${this.language}"
        ></bbva-type-amount>
      </div>
      <div class="financing-conditions">
        <div class="financing-rate">
          <bbva-type-text
            tag="span"
            class="amount-text"
            text="${this.t("sustainability-sustainable-solar-panels-simulator-financing-conditions-text-2")}"
            size="M"
            font-weight="350"
          ></bbva-type-text>
          <bbva-type-icon
            icon="${c()}"
            size="16"
            @click="${()=>{this.financingModalKey="cat-without-iva",this.financingModalVisible=!0}}"
          >
          </bbva-type-icon>
        </div>
        <bbva-type-amount
          ambient="primary"
          variant="M"
          type="bold"
          decimal-digits="1"
          amount='${null==x||null===(u=x.unit)||void 0===u?void 0:u.percentage}'
          currency-code="%"
          language="${this.language}"
        ></bbva-type-amount>
      </div>
      <div class="financing-conditions">
       ${T?i`
               <div class="financing-rate">
                 <bbva-type-text
                   tag="span"
                   class="amount-text"
                   text="${this.t("sustainability-sustainable-solar-panels-simulator-financing-conditions-text-3")}"
                   size="M"
                   font-weight="350"
                 ></bbva-type-text>
                 <bbva-type-icon
                   icon="${c()}"
                   size="16"
                   @click="${()=>{this.financingModalKey="opening-comision",this.financingModalVisible=!0}}"
                 >
                 </bbva-type-icon>
               </div>
               <bbva-type-amount
                 ambient="primary"
                 variant="M"
                 decimal-digits="2"
                 amount="${null==T?void 0:T.percentage}"
                 currency-code="%"
                 language="${this.language}"
               ></bbva-type-amount>
             `:i``}

      </div>
      ${S?i`
              <div class="financing-conditions">
                <div class="life-insurance">
                  <bbva-type-text
                    tag="span"
                    class="amount-text"
                    text="${this.t("sustainability-sustainable-solar-panels-simulator-financing-conditions-text-4")}"
                    size="M"
                    font-weight="350"
                  ></bbva-type-text>
                  <bbva-type-icon
                    icon="${c()}"
                    size="16"
                    @click="${()=>{this.financingModalKey="life-insurance",this.financingModalVisible=!0}}"
                  >
                  </bbva-type-icon>
                </div>
                <bbva-type-amount
                  ambient="primary"
                  variant="M"
                  amount="${null==S||null===(d=S.amount)||void 0===d?void 0:d.amount}"
                  decimal-digits="0"
                  currency-code="${null==S||null===(p=S.amount)||void 0===p?void 0:p.currency}"
                  local-currency="${this.localCurrency}"
                  language="${this.language}"
                ></bbva-type-amount>
              </div>
            `:i``}
      ${E?i`
              <div class="financing-conditions">
                <div class="life-insurance">
                  <bbva-type-text
                    tag="span"
                    class="amount-text"
                    text="${this.t("sustainability-sustainable-solar-panels-simulator-financing-conditions-text-5")}"
                    size="M"
                    font-weight="350"
                  ></bbva-type-text>
                  <bbva-type-icon
                    icon="${c()}"
                    size="16"
                    @click="${()=>{this.financingModalKey="life-insurance-unemployment",this.financingModalVisible=!0}}"
                  >
                  </bbva-type-icon>
                </div>
                <bbva-type-amount
                  ambient="primary"
                  variant="M"
                  decimal-digits="0"
                  amount="${null==E||null===(m=E.amount)||void 0===m?void 0:m.amount}"
                  currency-code="${null==E||null===(h=E.amount)||void 0===h?void 0:h.currency}"
                  local-currency="${this.localCurrency}"
                  language="${this.language}"
                ></bbva-type-amount>
              </div>
            `:i``}
      </div>
    `}get _financingInfoModalTemplate(){var e,t;const{financingInfoModalStructure:a}=ut,s="sustainability-sustainable-solar-panels-simulator-financing-modal",r=a.find((e=>e.id===this.financingModalKey)),n=`${s}-${this.t(null==r?void 0:r.id)}-header`,o=`${s}-${this.t(null==r?void 0:r.id)}-content`,u=null==r?void 0:r.listItems,c=null===(e=this.financingLoansOffersData)||void 0===e?void 0:e.rates,d=null==c?void 0:c.find((e=>{var t,a;return"PERCENTAGE"===(null==e||null===(t=e.mode)||void 0===t?void 0:t.id)&&(null==e||null===(a=e.rateType)||void 0===a?void 0:a.id)===this.rateTypes.cat})),p=null==d||null===(t=d.unit)||void 0===t?void 0:t.percentage,m=moment(null==d?void 0:d.calculationDate).format("LL"),h=moment(null==d?void 0:d.expirationDate).format("LL");return i`
      <bbva-help-modal
        id="sustainability-sustainable-solar-panels-simulator-financing-modal"
        header-text="${n}"
        header-close-icon-label="${this.t("sustainability-sustainable-solar-panels-simulator-modal-header-icon-label-close")}"
        ?visible="${this.financingModalVisible}"
        @visible-changed="${({detail:e})=>{this.financingModalVisible=e}}"
        @help-modal-header-click="${()=>{this.financingModalVisible=!1}}"
      >
        <div class="content" slot="slot-content">
          <bbva-type-icon icon="${l()}" size="24"> </bbva-type-icon>
          ${(null==u?void 0:u.length)>0?i`
                ${u.map((e=>i`
                    <bbva-type-text
                      size="S"
                      text="${this.t(`${o}-${e}`,{CATWeightedAverage:p,calculationDate:m,expirationDate:h})}"
                    ></bbva-type-text>
                  `))}
              `:i`
                <bbva-type-text size="S" text="${o}"></bbva-type-text>
              `}
        </div>
      </bbva-help-modal>
    `}get solarPanelFinancingLoansQuotationsOffersDmElement(){return this._solarPanelFinancingLoansQuotationsOffersDmElement||(this._solarPanelFinancingLoansQuotationsOffersDmElement=this.shadowRoot.querySelector("#global-offers-loans-quotations-api-dm")),this._solarPanelFinancingLoansQuotationsOffersDmElement}_createQuotationsBody(){var e,t,a,s,i,r,n,o,l,u,c;const d=null===(e=this.simulatorSupplierOfferData)||void 0===e||null===(t=e.supplierOffer)||void 0===t?void 0:t.discounts.find((e=>"FINANCING"===e.id)),p=null===(a=this.financingLoansQuotationOffersData)||void 0===a||null===(s=a.initialAmount)||void 0===s?void 0:s.currency,m=null===(i=this.financingLoansQuotationOffersData)||void 0===i||null===(r=i.terms)||void 0===r?void 0:r.frequency,h=null===(n=this.financingLoansOffersData)||void 0===n||null===(o=n.details)||void 0===o?void 0:o.maximumAmount.amount;return{initialAmount:{amount:h>=(null==d||null===(l=d.price)||void 0===l?void 0:l.amount)?null==d||null===(u=d.price)||void 0===u?void 0:u.amount:h,currency:p||(null==d||null===(c=d.price)||void 0===c?void 0:c.currency)},terms:{number:this._rangeValue,frequency:m||this.financingTermFrequency}}}_requestFinancingLoansQuotationsOffersData(e){this.solarPanelFinancingLoansQuotationsOffersDmElement&&(this._currentRequests={...this._currentRequests,quotationsOffers:!0},this.solarPanelFinancingLoansQuotationsOffersDmElement.postOfferQuotationsSimulate(this.offerId,e))}_onSolarPanelFinancingLoansQuotationsOffersRequestSuccess({detail:e}){this._requestErrors={...this._requestErrors,quotationsOffers:0},this._currentRequests={...this._currentRequests,quotationsOffers:!1},this.financingLoansQuotationOffersData={...e},this._isEditQuotationOfferRequest=!1,this.dispatchEvent(new CustomEvent("sustainability-sustainable-solar-panels-simulator-quotations-offers-fetch",{detail:e,bubbles:!0,composed:!0}))}_onRequestError(e){this._requestErrors={...this._requestErrors,[e]:this._requestErrors[e]+1},this._currentRequests={...this._currentRequests,[e]:!1}}_sectionErrorTemplate(e){const t=this._requestErrors[e]<=this.maxRequestAttempts;return i`
      <div class="section-error-wrapper">
        <bbva-notification-message
          variant="error"
          book-title
          .messageTitle="${t?this.t("sustainability-sustainable-solar-panels-simulator-error-section-text"):this.t("sustainability-sustainable-solar-panels-simulator-error-section-text-no-retries")}"
          .linkTitle="${t?this.t("sustainability-sustainable-solar-panels-simulator-error-section-link"):""}"
          @notification-message-link-click="${()=>{this._requestFinancingLoansQuotationsOffersData()}}"
        ></bbva-notification-message>
        <bbva-progress-content
          variant="transparent"
          ?visible="${this._currentRequests[e]}"
        ></bbva-progress-content>
      </div>
    `}get _solarPanelFinancingTemplate(){return i`
      <div class="financing">
        ${this._headerFinancingTemplate} ${this._rangeFinancingTemplate}
        ${this._monthlyCostFinancingTemplate}
      </div>
      ${this._financingInfoModalTemplate}
    `}render(){return i`
      ${this._solarPanelFinancingLoansQuotationsOffersDmTemplate}
      ${this._hasQuotationsOffersError?i`
            ${this._sectionErrorTemplate(Object.keys(this._requestErrors).find((e=>this._requestErrors[e]>0)))}
          `:i`
            ${this._solarPanelFinancingTemplate}
          `}
    `}}var dt=r`
  :host {
    --_sustainability-sustainable-solar-panels-simulator-solar-bg: var(
      --sustainability-sustainable-solar-panels-simulator--_ambient--default-bg,
      var(
        --sustainability-sustainable-solar-panels-simulator--custom--primary-ambient--bg,
        ${b("colorPrimarySurfaceAmbientDefault",g)}
      )
    );
    --_sustainability-sustainable-solar-panels-simulator-skeleton-quote-color: var(
      --sustainability-sustainable-solar-panels-simulator--_ambient--default-skeleton-quote-color,
      var(
        --sustainability-sustainable-solar-panels-simulator--custom--primary-ambient--default-skeleton-quote-color,
        ${b("colorPrimarySurfaceAmbientPreloading",g)}
      )
    );
    --_sustainability-sustainable-solar-panels-simulator-skeleton-quote-bg: var(
      --sustainability-sustainable-solar-panels-simulator--_ambient--default-skeleton-quote-bg,
      var(
        --sustainability-sustainable-solar-panels-simulator--custom--primary-ambient--default-skeleton-quote-bg,
        ${b("colorPrimarySurfaceAlternativePreloading",g)}
      )
    );
    --_sustainability-sustainable-solar-panels-simulator-partner-offer-skeleton-quote-color: var(
      --sustainability-sustainable-solar-panels-simulator-partner-offer--_ambient--default-skeleton-quote-color,
      var(
        --sustainability-sustainable-solar-panels-simulator-partner-offer--custom--primary-ambient--default-skeleton-quote-color,
        ${b("colorPrimarySurfaceAlternativePreloading",g)}
      )
    );
    --_sustainability-sustainable-solar-panels-simulator-partner-offer-skeleton-quote-bg: var(
      --sustainability-sustainable-solar-panels-simulator-partner-offer--_ambient--default-skeleton-quote-bg,
      var(
        --sustainability-sustainable-solar-panels-simulator-partner-offer--custom--primary-ambient--default-skeleton-quote-bg,
        ${b("colorPrimarySurfaceAmbientPreloading",g)}
      )
    );
    --_sustainability-sustainable-solar-panels-simulator-exit-modal-icon: var(
      --sustainability-sustainable-solar-panels-simulator--_ambient--default-exit-modal-icon,
      var(
        --sustainability-sustainable-solar-panels-simulator--custom--primary-ambient--default-exit-modal-icon,
        ${b("colorPrimarySupportWarningDefault",g)}
      )
    );
    --_sustainability-sustainable-solar-panels-simulator-solar-panel-offer-bg: var(
      --sustainability-sustainable-solar-panels-simulator--_ambient--default-offer-bg,
      var(
        --sustainability-sustainable-solar-panels-simulator--custom--primary-ambient--default-offer-bg,
        ${b("colorPrimarySurfaceAlternativeDefault",g)}
      )
    );
  }
`,pt=r`
  :host {
    --_skeleton-default-bg-color: var(
      --bbva-skeleton-default--_ambient--bg-color,
      var(
        --bbva-skeleton-default--custom--primary-ambient--bg-color,
        var(--color-primary-surface-ambient-preloading, #ffffff)
      )
    );
    --_skeleton-default-animated-bg-color: var(
      --bbva-skeleton-default--_ambient--animated-bg-color,
      var(
        --bbva-skeleton-default--custom--primary-ambient--animated-bg-color,
        var(--color-primary-surface-ambient-default, #f4f4f4)
      )
    );
    --_skeleton-default-bg-color-alt: var(
      --bbva-skeleton-default--_ambient--bg-color-alt,
      var(
        --bbva-skeleton-default--custom--primary-ambient--bg-color-alt,
        var(--color-primary-surface-alternative-preloading, #e9e9e9)
      )
    );
    --_skeleton-default-animated-bg-color-alt: var(
      --bbva-skeleton-default--_ambient--animated-bg-color-alt,
      var(
        --bbva-skeleton-default--custom--primary-ambient--animated-bg-color-alt,
        var(--color-primary-surface-alternative-default, #ffffff)
      )
    );
  }

  :host {
    display: block;
    box-sizing: border-box;
    background-color: var(--_sustainability-sustainable-solar-panels-simulator-solar-bg);
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

  .image-banner {
    padding: 0 4.6875rem;
  }

  .sustainability-sustainable-solar-panels-simulator-home-page [data-tag-name='bbva-banner-image'] {
    margin-bottom: 1rem;
  }
  .sustainability-sustainable-solar-panels-simulator-home-page
    [data-tag-name='bbva-header-category'] {
    padding: 0 0 0.5rem 1rem;
  }
  .sustainability-sustainable-solar-panels-simulator-home-page .header-description {
    margin: 0 1rem 2rem;
  }
  .sustainability-sustainable-solar-panels-simulator-home-page .home-page-link {
    margin: 1rem 1rem 1.5rem;
  }
  .sustainability-sustainable-solar-panels-simulator-home-page .definition-amount {
    display: flex;
    justify-content: space-between;
    gap: 1rem;
    padding-bottom: 0.5rem;
  }
  .sustainability-sustainable-solar-panels-simulator-home-page
    .partner-services-modal
    [data-tag-name='bbva-type-text'] {
    margin: 1rem;
  }
  .sustainability-sustainable-solar-panels-simulator-home-page .offer-card {
    margin: 0 1rem 1rem;
    padding: 1rem;
    background-color: var(
      --_sustainability-sustainable-solar-panels-simulator-solar-panel-offer-bg
    );
  }
  .sustainability-sustainable-solar-panels-simulator-home-page
    .offer-card
    [data-tag-name='bbva-type-text'] {
    margin-left: 0;
    margin-right: 0;
    margin-bottom: 0.5rem;
  }
  .sustainability-sustainable-solar-panels-simulator-home-page
    .offer-card
    [data-tag-name='bbva-header-category'] {
    padding-left: 0;
    margin-right: 0;
  }
  .sustainability-sustainable-solar-panels-simulator-home-page
    .offer-card
    [data-tag-name='bbva-notification-help'] {
    padding-left: 0;
    padding-right: 0;
    padding-bottom: 1.5rem;
  }
  .sustainability-sustainable-solar-panels-simulator-home-page .offer-card .bbva-price {
    padding-top: 0.5rem;
    padding-bottom: 0.5rem;
  }
  .sustainability-sustainable-solar-panels-simulator-home-page
    .offer-card
    .bbva-price
    [data-tag-name='bbva-type-text'] {
    margin: 0;
  }
  .sustainability-sustainable-solar-panels-simulator-home-page .offer-card .num-panels {
    padding-top: 1rem;
  }
  .sustainability-sustainable-solar-panels-simulator-home-page
    .offer-card
    .num-panels
    [data-tag-name='bbva-type-text'] {
    margin: 0;
  }
  .sustainability-sustainable-solar-panels-simulator-home-page
    .offer-card
    .num-panels
    [data-tag-name='bbva-type-text']:last-of-type {
    margin-bottom: 1.5rem;
  }

  .fixed-footer {
    position: sticky;
    display: block;
    bottom: 0;
    left: 0;
    width: 100%;
    padding: 1rem;
    text-align: center;
    background-color: ${b("colorPrimarySurfaceAlternativeDefault",g)};
  }
  .fixed-footer[shadowed] {
    box-shadow: 0 -3px 2px 0 rgba(18, 18, 18, 0.08);
  }

  #sustainability-sustainable-solar-panels-simulator-flexible-show-privacy-terms-modal
    [data-tag-name='bbva-type-text'] {
    margin: 0.5rem 1rem 1rem;
  }
  #sustainability-sustainable-solar-panels-simulator-flexible-show-privacy-terms-modal
    [data-tag-name='bbva-type-link'] {
    margin-left: 1rem;
  }

  #sustainability-sustainable-solar-panels-simulator-edit-expense-modal
    .content
    [data-tag-name='bbva-type-text'] {
    margin: 0 1rem 0.5rem 0;
  }
  #sustainability-sustainable-solar-panels-simulator-edit-expense-modal .input-container {
    padding-bottom: 1rem;
  }
  #sustainability-sustainable-solar-panels-simulator-edit-expense-modal
    .input-container
    .first-input {
    padding-bottom: 1rem;
  }

  #sustainability-sustainable-solar-panels-simulator-flexible-show-operation-modal
    .content
    [data-tag-name='bbva-type-text'] {
    margin: 0 1rem 0.5rem;
  }

  #sustainability-sustainable-solar-panels-simulator-request-contact-modal .flexible-modal-title {
    margin: 0 1rem 0.5rem;
  }
  #sustainability-sustainable-solar-panels-simulator-request-contact-modal
    .flexible-modal-description
    [data-tag-name='bbva-type-text'] {
    margin: 0 1rem 1rem;
  }
  #sustainability-sustainable-solar-panels-simulator-request-contact-modal
    [data-tag-name='bbva-clip-microillustration'] {
    padding: 1rem;
  }
  #sustainability-sustainable-solar-panels-simulator-request-contact-modal
    [data-tag-name='bbva-notification-message'] {
    margin: 1rem;
  }
  #sustainability-sustainable-solar-panels-simulator-request-contact-modal
    [data-tag-name='bbva-header-category'] {
    padding: 1rem;
    padding-bottom: 0;
  }
  #sustainability-sustainable-solar-panels-simulator-request-contact-modal
    .contact-flex-modal-button {
    padding: 1rem;
  }
  #sustainability-sustainable-solar-panels-simulator-request-contact-modal .request-contact-link {
    padding: 1rem;
  }

  #sustainability-sustainable-solar-panels-simulator-leads-response-modal
    .leads-response-modal-title {
    margin: 1rem 0 0;
  }
  #sustainability-sustainable-solar-panels-simulator-leads-response-modal
    .leads-response-modal-description
    [data-tag-name='bbva-type-text'] {
    margin: 1rem 0 1rem;
  }
  #sustainability-sustainable-solar-panels-simulator-leads-response-modal
    [data-tag-name='bbva-notification-message']
    p {
    font-weight: 500;
    margin-top: 0;
  }

  .accordion-container {
    padding-top: 1.5rem;
  }

  [data-tag-name='bbva-expandable-accordion'] {
    padding: 0.5rem;
  }

  #sustainability-sustainable-solar-panels-simulator-exit-modal [data-tag-name='bbva-type-icon'] {
    margin-bottom: 1rem;
    --bbva-type-icon--_ambient--color: var(
      --_sustainability-sustainable-solar-panels-simulator-exit-modal-icon
    );
  }
  #sustainability-sustainable-solar-panels-simulator-exit-modal
    .content
    [data-tag-name='bbva-type-text'] {
    margin: 0;
  }

  #sustainability-sustainable-solar-panels-simulator-full-error-modal
    .content
    [data-tag-name='bbva-type-text'],
  #sustainability-sustainable-solar-panels-simulator-lead-error-modal
    .content
    [data-tag-name='bbva-type-text'] {
    margin-top: 1rem;
    margin-bottom: 1rem;
  }

  .flexible-modal-button-text {
    margin: 0 1rem 0.5rem;
  }

  .section-error-wrapper {
    position: relative;
    padding: 0 1rem 0 1rem;
  }
  .section-error-wrapper [data-tag-name='bbva-progress-content'] {
    position: absolute;
  }

  #skeleton-banner-info {
    height: 13rem;
    overflow: hidden;
    background-color: var(--_skeleton-default-bg-color);
    -webkit-mask-image: linear-gradient(black 100%, transparent 0),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, transparent 50%, black 50%);
    mask-image: linear-gradient(black 100%, transparent 0),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, transparent 50%, black 50%);
    -webkit-mask-position:
      16px 16px,
      16px 120px,
      16px 152px,
      16px 176px;
    mask-position:
      16px 16px,
      16px 120px,
      16px 152px,
      16px 176px;
    -webkit-mask-repeat: no-repeat;
    mask-repeat: no-repeat;
    -webkit-mask-size:
      80px 80px,
      calc((66% * 2) + (16px / 2)) 16px,
      calc((90% * 2) + (16px / 2)) 16px,
      calc((33% * 2) + (16px / 2)) 16px;
    mask-size:
      80px 80px,
      calc((66% * 2) + (16px / 2)) 16px,
      calc((90% * 2) + (16px / 2)) 16px,
      calc((33% * 2) + (16px / 2)) 16px;
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
  #skeleton-banner-info::after {
    display: block;
    width: 100%;
    height: 100%;
    animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
    background-color: var(--_skeleton-default-animated-bg-color);
    background-image: linear-gradient(var(--_skeleton-default-bg-color) 100%, transparent 0);
    background-position-x: 100vh;
    background-repeat: no-repeat;
    content: '';
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

  #skeleton-partner-offer {
    height: 21rem;
    overflow: hidden;
    background-color: var(
      --_sustainability-sustainable-solar-panels-simulator-partner-offer-skeleton-quote-color
    );
    -webkit-mask-image: linear-gradient(black 100%, transparent 0),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, transparent 50%, black 50%);
    mask-image: linear-gradient(black 100%, transparent 0),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, transparent 50%, black 50%);
    -webkit-mask-position:
      0 0,
      0 104px,
      0 136px,
      0 160px,
      0 216px,
      0 248px,
      0 308px,
      calc(750%) 308px;
    mask-position:
      0 0,
      0 104px,
      0 136px,
      0 160px,
      0 216px,
      0 248px,
      0 308px,
      calc(750%) 308px;
    -webkit-mask-repeat: no-repeat;
    mask-repeat: no-repeat;
    -webkit-mask-size:
      80px 80px,
      calc((50% * 2) + (16px / 2)) 16px,
      calc((95% * 2) + (16px / 2)) 16px,
      calc((66% * 2) + (16px / 2)) 16px,
      calc((50% * 2) + (16px / 2)) 16px,
      calc((25% * 2) + (16px / 2)) 16px,
      calc((33% * 2) + (16px / 2)) 16px,
      calc((45% * 2) + (16px / 2)) 16px;
    mask-size:
      80px 80px,
      calc((50% * 2) + (16px / 2)) 16px,
      calc((95% * 2) + (16px / 2)) 16px,
      calc((66% * 2) + (16px / 2)) 16px,
      calc((50% * 2) + (16px / 2)) 16px,
      calc((25% * 2) + (16px / 2)) 16px,
      calc((33% * 2) + (16px / 2)) 16px,
      calc((45% * 2) + (16px / 2)) 16px;
    pointer-events: none;
    /*
  &::after {
     display: block;
     width: 100%;
     height: 100%;
     animation: skeletonAnimation 1500ms ease-in 100ms infinite alternate-reverse;
     background-color: var(--_sustainability-sustainable-solar-panels-simulator-partner-offer-skeleton-quote-bg);
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
  #skeleton-partner-offer::after {
    display: block;
    width: 100%;
    height: 100%;
    animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
    background-color: var(
      --_sustainability-sustainable-solar-panels-simulator-partner-offer-skeleton-quote-bg
    );
    background-image: linear-gradient(
      var(--_sustainability-sustainable-solar-panels-simulator-partner-offer-skeleton-quote-color)
        100%,
      transparent 0
    );
    background-position-x: 100vh;
    background-repeat: no-repeat;
    content: '';
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
`;class mt extends(v(f(n(a)))){static get is(){return"sustainability-sustainable-solar-panels-simulator"}static get scopedElements(){const e=[ye,Xe,fe,se,$e,M,N,oe,K,w,D,V,q,I,E,T,R,L,ue,W,j,$,k,F,st,ct,nt,...mt.configurationScopedElements()];return mt.scopedElementsFromClasses(e)}static get properties(){return{sustainabilityApiVersion:{type:String,attribute:"sustainability-api-version"},customerApiVersion:{type:String,attribute:"customer-api-version"},campaingsOffersApiVersion:{type:String,attribute:"offers-api-version"},loanOffersApiVersion:{type:String,attribute:"loan-offers-api-version"},aemHost:{type:String,attribute:"aem-host"},aemPath:{type:String,attribute:"aem-path"},localCurrency:{type:String,attribute:"local-currency"},toggles:{type:Object},simulatorData:{type:Object,attribute:"simulator-data"},customerData:{type:Object,attribute:"customer-data"},campaingsOffers:{type:Array,attribute:"campaings-offers"},contractingType:{type:Object,attribute:"contracting-type"},userName:{type:String,attribute:"user-name"},imageIds:{type:Object,attribute:"image-ids"},termTypeId:{type:String,attribute:"term-type-id"},preApprovedLoanIds:{type:Array,attribute:"pre-approved-loan-ids"},noPreApprovedLoanId:{type:String,attribute:"no-pre-approved-loan-id"},linkPage:{type:String,attribute:"link-page"},acceptanceMessages:{type:String,attribute:"aceptance-messages"},loanType:{type:String,attribute:"loan-type"},equivalenceId:{type:String,attribute:"equivalence-id"},customerId:{type:String,attribute:"customer-id"},defaultPartnerLogoId:{type:String,attribute:"default-partner-logo-id"},requestContactModalVisible:{type:Boolean,attribute:"request-contact-modal-visible"},showOperationFlexModalVisible:{type:Boolean,attribute:"show-operation-flex-modal-visible"},showPrivacyTermsModalVisible:{type:Boolean,attribute:"show-privacy-terms-modal-visible"},editExpenseModalVisible:{type:Boolean,attribute:"edit-expense-modal-visible"},exitModalVisible:{type:Boolean,attribute:"exit-modal-visible"},leadsResponseModalVisible:{type:Boolean,attribute:"leads-modal-response-visible"},partnerServicesModalVisible:{type:Boolean,attribute:"partner-services-modal-visible"},maxRequestAttempts:{type:Number,attribute:"max-request-attempts"},noPreApprovedLabel:{type:String,attribute:"no-pre-approved-label"},serviceCacheEnabled:{type:Boolean,attribute:"service-cache-enabled"},isRequiredOTP:{type:Boolean,attribute:"is-required-otp"},toastDuration:{type:Number,attribute:"toast-duration"},_leadsData:{type:Object},_loanOffers:{type:Object},_quotationsOffers:{type:Object},_userFinancingTerms:{type:Object},_offerId:{type:String},_productId:{type:String},_product:{type:Object},_acceptConditions:{type:Boolean},_editExpenseInputValue:{type:Number},_editZipcodeInputValue:{type:String},_requestErrors:{type:Object},_currentRequests:{type:Object},_isEditExpenseRequest:{type:Boolean},_isShowToast:{type:Boolean},_preferentialPreApproved:{type:Boolean},_nonPreaprovedCall:{type:Boolean}}}constructor(){super(),this.sustainabilityApiVersion="1",this.customerApiVersion="1",this.campaingsOffersApiVersion="1",this.loanOffersApiVersion="1",this.aemHost="",this.aemPath="",this.localCurrency="",this.simulatorData={},this.customerData={},this._leadsData={},this._userFinancingTerms={},this.campaingsOffers=[],this._loanOffers={},this._quotationsOffers={},this.toggles={},this.userName="",this.imageIds={header:"HEADER",housePanel:"HOUSE_PANEL"},this.acceptanceMessages="",this._product={},this._offerId="",this._productId="",this.preApprovedLoanIds=["0NOM","0PPI","0060"],this.noPreApprovedLoanId="00CB",this.loanType="LOANS",this.equivalenceId="sustainabilityEqKmDriveCar",this.customerId="",this.termTypeId="",this.contractingType={categoryId:"H"},this.defaultPartnerLogoId="noLogo",this.noPreApprovedLabel="no preaprobados",this._nonPreaprovedCall=!1,this.linkPage="",this.requestContactModalVisible=!1,this.showOperationFlexModalVisible=!1,this.showPrivacyTermsModalVisible=!1,this.editExpenseModalVisible=!1,this.exitModalVisible=!1,this.leadsResponseModalVisible=!1,this._acceptConditions=!1,this._preferentialPreApproved=!1,this.partnerServicesModalVisible=!1,this.ambient="primary",this.maxRequestAttempts=3,this.serviceCacheEnabled=!1,this.isRequiredOTP=!1,this.toastDuration=2e3,this._requestErrors={simulator:0,customer:0,lead:0,campaingsOffers:0,loanOffers:0},this._currentRequests={simulator:!1,customer:!1,lead:!1,campaingsOffers:!1,loanOffers:!1},this._editExpenseInputValue=0,this._editZipCodeInputValue="",this._isEditExpenseRequest=!1,this._isShowToast=!1,this._defaultToggles={products:!0},this.config={header:{variant:"first-level-sequential",showLeftIcon:!0,leftIconLabel:"sustainability-sustainable-solar-panels-simulator-header-back",leftIconAriaLabel:"sustainability-sustainable-solar-panels-simulator-header-back",text:"sustainability-sustainable-solar-panels-simulator-modal-header-text",buttons:[{id:"btn-menu",icon:d(),label:"sustainability-sustainable-solar-panels-simulator-header-main-menu",accessibilityText:"sustainability-sustainable-solar-panels-simulator-header-main-menu"}],id:"main-header","@header-main-icon-click":this._manageHeaderMainClicks.bind(this)},loader:!0,notify:!1,fixedHeader:!0}}firstUpdated(e){super.firstUpdated(e),this._requestData(),this._fixedFooterObserver=new IntersectionObserver((([e])=>{this.fixedFooterElement.toggleAttribute("shadowed",e.intersectionRatio<1)}),{threshold:1,rootMargin:`0px 0px -${this.fixedFooterElement.clientHeight}px 0px`}),this._fixedFooterObserver.observe(this.productsSection)}static get styles(){return[dt,pt,B.primary,H.primary,le.primary,P.primary,y.primary,G.primary,_.primary,O.primary,A.primary,C.primary,Y.primary,ce.primaryAlt,J.primary,z.primary,S.primary,o("sustainability-sustainable-solar-panels-simulator-shared-styles")]}connectedCallback(){super.connectedCallback(),this.addEventListener("help-modal-open",this._modalStateChanged),this.addEventListener("help-modal-close",this._modalStateChanged)}disconnectedCallback(){super.disconnectedCallback(),this.removeEventListener("help-modal-open",this._modalStateChanged),this.removeEventListener("help-modal-close",this._modalStateChanged)}_manageHeaderMainClicks(e){var t;const a={1:"sustainability-sustainable-solar-panels-simulator-menu-click"},s=null==e||null===(t=e.detail)||void 0===t?void 0:t.index;0===s?this.exitModalVisible=!0:this.dispatchEvent(new CustomEvent(a[s],{composed:!0,bubbles:!0}))}_modalStateChanged(e){var t;const a=null===(t=mt._getEventTargetPath(e))||void 0===t?void 0:t[0];this._handleModalStateChange(e,a)}static _getEventTargetPath(e){return e.composedPath&&e.composedPath()||e.path}_handleModalStateChange(e,t){const a={"sustainability-sustainable-solar-panels-simulator-edit-expense-modal":"editExpenseModalVisible","sustainability-sustainable-solar-panels-simulator-request-contact-modal":"requestContactModalVisible","sustainability-sustainable-solar-panels-simulator-flexible-show-operation-modal":"showOperationFlexModalVisible","sustainability-sustainable-solar-panels-simulator-flexible-show-privacy-terms-modal":"showPrivacyTermsModalVisible","sustainability-sustainable-solar-panels-simulator-exit-modal":"exitModalVisible","sustainability-sustainable-solar-panels-simulator-leads-response-modal":"leadsResponseModalVisible","sustainability-sustainable-solar-panels-simulator-partner-services-modal":"partnerServicesModalVisible","sustainability-sustainable-solar-panels-simulator-financing-modal":"financingModalVisible"}[t.id];if(a){var s;const t="open"===(null==e||null===(s=e.detail)||void 0===s?void 0:s.status);this[a]=t}}get _headers(){return this.headers||{"Accept-Language":this.language}}get _toggles(){return{...this._defaultToggles,...this.toggles}}get _hasFullError(){return this._requestErrors.simulator>0}get _hasCampaingsOffersError(){return this._requestErrors.campaingsOffers>0}get _hasLoansOffersError(){return this._requestErrors.loanOffers>0}get _sendLeadFullError(){return this._requestErrors.lead>0}get _sendCustomerTermsFullError(){return this._requestErrors.customer>0}get solarPanelSimulatorDmElement(){return this._solarPanelSimulatorDmElement||(this._solarPanelSimulatorDmElement=this.shadowRoot.querySelector("#solar-panel-simulator-api-dm")),this._solarPanelSimulatorDmElement}get customerTermsDmElement(){return this._customerTermsDmElement||(this._customerTermsDmElement=this.shadowRoot.querySelector("#global-customer-terms-api-dm")),this._customerTermsDmElement}get solarPanelLeadsDmElement(){return this._solarPanelLeadsDmElement||(this._solarPanelLeadsDmElement=this.shadowRoot.querySelector("#solar-panel-leads-api-dm")),this._solarPanelLeadsDmElement}get solarPanelFinancingCampaingsOffersDmElement(){return this._solarPanelFinancingCampaingsOffersDmElement||(this._solarPanelFinancingCampaingsOffersDmElement=this.shadowRoot.querySelector("#global-offers-api-dm")),this._solarPanelFinancingCampaingsOffersDmElement}get solarPanelFinancingLoansOffersDmElement(){return this._solarPanelFinancingLoanOffersDmElement||(this._solarPanelFinancingLoanOffersDmElement=this.shadowRoot.querySelector("#global-offers-loans-api-dm")),this._solarPanelFinancingLoanOffersDmElement}get productsSection(){return this.shadowRoot.querySelector('[data-tag-name="sustainability-sustainable-solar-panels-simulator-products"]')}get fixedFooterElement(){return this._fixedFooterElement||(this._fixedFooterElement=this.shadowRoot.querySelector(".fixed-footer")),this._fixedFooterElement}get _solarPanelSimulatorDmTemplate(){return i`
      <bbva-global-solar-panel-simulate-api-dm
        id="solar-panel-simulator-api-dm"
        .host="${this.host}"
        .headers="${this._headers}"
        .version="${this.sustainabilityApiVersion}"
        .requiredToken="${this.requiredToken}"
        .native="${this.native}"
        @solar-panel-simulate-api-dm-fetch="${e=>{this._onSimulatorRequestSuccess(e)}}"
        @solar-panel-simulate-api-dm-fetch-error="${()=>{this._onRequestError("simulator")}}"
        @api-dm-error="${()=>{this._onRequestError("simulator")}}"
      >
      </bbva-global-solar-panel-simulate-api-dm>
    `}get _globalCustomerDmTemplate(){return i`
      <bbva-global-customer-terms-api-dm
        id="global-customer-terms-api-dm"
        .host="${this.host}"
        .headers="${this._headers}"
        .version="${this.customerApiVersion}"
        .requiredToken="${this.requiredToken}"
        .native="${this.native}"
        ?requiredotp="${this.isRequiredOTP}"
        @customer-terms-api-dm-fetch="${e=>{this._onCustomerRequestSuccess(e,"GET")}}"
        @customer-terms-api-dm-create="${e=>{this._onCustomerRequestSuccess(e,"POST")}}"
        @customer-terms-api-dm-fetch-error="${()=>{this._onCustomerRequestError()}}"
        @customer-terms-api-dm-create-error="${()=>{this._onCustomerRequestError("customer","POST")}}"
        @api-dm-error="${e=>{var t;const a=null==e||null===(t=e.detail)||void 0===t?void 0:t.method;this._onCustomerRequestError("customer",a)}}"
      >
      </bbva-global-customer-terms-api-dm>
    `}get _solarPanelLeadsDmTemplate(){return i`
      <bbva-global-solar-panel-leads-api-dm
        id="solar-panel-leads-api-dm"
        .host="${this.host}"
        .headers="${this._headers}"
        .version="${this.sustainabilityApiVersion}"
        .requiredToken="${this.requiredToken}"
        .native="${this.native}"
        @solar-panel-leads-api-dm-create="${e=>{this._onSolarPanelLeadsRequestSuccess(e)}}"
        @solar-panel-leads-api-dm-create-error="${()=>{this._onRequestError("lead")}}"
        @api-dm-error="${()=>{this._onRequestError("lead")}}"
      >
      </bbva-global-solar-panel-leads-api-dm>
    `}get _solarPanelFinancingCampaingsOffersDmTemplate(){const e=`sustainabilityOffersCampaingsData-${this.language}`;return i`
      <bbva-global-offers-api-dm
        id="global-offers-api-dm"
        .host="${this.host}"
        .headers="${this._headers}"
        .version="${this.campaingsOffersApiVersion}"
        .requiredToken="${this.requiredToken}"
        .native="${this.native}"
        cachetype="${this.serviceCacheEnabled?"SESSION":"NONE"}"
        cachekey="${e}"
        @offers-api-dm-fetch="${e=>{this._onSolarPanelFinancingCampaingsOffersRequestSuccess(e)}}"
        @offers-api-dm-fetch-error="${()=>{this._onRequestError("campaingsOffers")}}"
        @api-dm-error="${()=>{this._onRequestError("campaingsOffers")}}"
      >
      </bbva-global-offers-api-dm>
    `}get _solarPanelFinancingLoansOffersDmTemplate(){return i`
      <bbva-global-offer-api-dm
        id="global-offers-loans-api-dm"
        .host="${this.host}"
        .headers="${this._headers}"
        .version="${this.loanOffersApiVersion}"
        .requiredToken="${this.requiredToken}"
        .native="${this.native}"
        @offer-api-dm-fetch="${e=>{this._onSolarPanelFinancingLoansOffersRequestSuccess(e)}}"
        @offer-api-dm-fetch-error="${()=>{this._onRequestError("loanOffers")}}"
        @api-dm-error="${()=>{this._onRequestError("loanOffers")}}"
      >
      </bbva-global-offer-api-dm>
    `}get _productsTemplate(){return i`
      <sustainability-sustainable-solar-panels-simulator-products
        .host="${this.host}"
        .headers="${this._headers}"
        .requiredToken="${this.requiredToken}"
        .sustainabilityApiVersion="${this.sustainabilityApiVersion}"
        .language="${this.language}"
        .native="${this.native}"
        .localCurrency="${this.localCurrency}"
        .product="${this._product}"
        .productId="${this._productId}"
        .loanType="${this.loanType}"
        .preferentialPreApproved="${this._preferentialPreApproved}"
        .toggles="${this.toggles}"
        @sustainability-sustainable-solar-panels-simulator-products-link-click="${({detail:e})=>{this.navigateForward({external:!0,params:e})}}"
      >
      </sustainability-sustainable-solar-panels-simulator-products>
    `}_handleNavigation(){}navigateForward(e={}){var t;this.dispatchEvent(new CustomEvent(`sustainability-sustainable-solar-panels-simulator-${null==e||null===(t=e.params)||void 0===t?void 0:t.id}-external-navigate`,{detail:null==e?void 0:e.params,composed:!0,bubbles:!0}))}navigateBack(e=!0){const t=this._findOpenedModal();t&&(this[t]=!1),e&&this.dispatchEvent(new CustomEvent("navigation-go-back",{bubbles:!0,composed:!0,detail:!0}))}OTPCancelled(){this._currentRequests={...this._currentRequests,customer:!1},this.requestContactModalVisible=!1}_findOpenedModal(){return Object.keys(mt.properties).find((e=>e.endsWith("Visible")&&this[e]))}_requestData(e={}){this.solarPanelSimulatorDmElement&&(this._isEditExpenseRequest=!1,this._currentRequests={...this._currentRequests,simulator:!0},this.solarPanelSimulatorDmElement.postSolarPanelSimulate(e))}_requestCustomerTermsData(e){if(this.customerTermsDmElement&&"GET"===e&&this.customerTermsDmElement.getCustomerTerms(this.customerId),this.customerTermsDmElement&&"POST"===e){this._currentRequests={...this._currentRequests,customer:!0};const e=[{termType:{id:this.termTypeId},acceptanceMessages:[{value:this.acceptanceMessages}]}];this.customerTermsDmElement.postCustomerTerms(this.customerId,e)}}_requestSolarPanelsLeadsData(){if(this.solarPanelLeadsDmElement){var e,t;this._currentRequests={...this._currentRequests,lead:!0};const a={annualElectricityBills:null===(e=this.simulatorData)||void 0===e?void 0:e.annualElectricityBills,zipCode:null===(t=this.simulatorData)||void 0===t?void 0:t.zipCode};this.solarPanelLeadsDmElement.postSolarPanelLeads(a)}}_requestFinancingCampaingsOffersData(e={}){this.solarPanelFinancingCampaingsOffersDmElement&&(this._nonPreaprovedCall=!1,this._currentRequests={...this._currentRequests,campaingsOffers:!0},this.solarPanelFinancingCampaingsOffersDmElement.getOffers(e))}_requestFinancingLoansOffersData(){this.solarPanelFinancingLoansOffersDmElement&&(this._currentRequests={...this._currentRequests,loanOffers:!0},this.solarPanelFinancingLoansOffersDmElement.getOffer(this._offerId))}_onSimulatorRequestSuccess({detail:e}){var t;this._requestErrors={...this._requestErrors,simulator:0},this._currentRequests={...this._currentRequests,simulator:!1},this.simulatorData={...e},this.simulatorData.annualElectricityBills=null==e||null===(t=e.annualElectricityBills)||void 0===t?void 0:t.sort((e=>"NO_PANELS"===e.id?-1:1)),this._isShowToast=!0,this._requestFinancingCampaingsOffersData()}_onRequestError(e){this._manageError(e)}_onCustomerRequestError(e,t){e&&["POST","postCustomerTermsBase"].includes(t)&&this._manageError(e)}_manageError(e){this._requestErrors={...this._requestErrors,[e]:this._requestErrors[e]+1},this._currentRequests={...this._currentRequests,[e]:!1},this._isEditExpenseRequest=!1}_onCustomerRequestSuccess({detail:e},t){if(this._requestErrors={...this._requestErrors,customer:0},this._currentRequests={...this._currentRequests,customer:!1},this.customerData={...e},"GET"===t){const e=Object.values(this.customerData);this._acceptConditions=null==e?void 0:e.find((e=>e.termType.id===this.termTypeId))}"POST"===t&&this._requestSolarPanelsLeadsData()}_onSolarPanelLeadsRequestSuccess({detail:e}){this._requestErrors={...this._requestErrors,lead:0},this._currentRequests={...this._currentRequests,lead:!1},this._leadsData={...e},this.leadsResponseModalVisible=!0}_onSolarPanelFinancingCampaingsOffersRequestSuccess({detail:e}){var t,a,s,i;this._requestErrors={...this._requestErrors,campaingsOffers:0},this._currentRequests={...this._currentRequests,campaingsOffers:!1},this.campaingsOffers=e||[],this._product=null===(t=this.campaingsOffers)||void 0===t?void 0:t.find((e=>{var t,a,s,i,r;return((null===(t=this.preApprovedLoanIds)||void 0===t?void 0:t.includes(null==e||null===(a=e.product)||void 0===a?void 0:a.id))||this.noPreApprovedLoanId===(null==e||null===(s=e.product)||void 0===s?void 0:s.id))&&(null==e||null===(i=e.product)||void 0===i||null===(r=i.productType)||void 0===r?void 0:r.id)===this.loanType})),this._offerId=null===(a=this._product)||void 0===a?void 0:a.id,this._productId=null===(s=this._product)||void 0===s||null===(i=s.product)||void 0===i?void 0:i.id,this._product||this._nonPreaprovedCall||(this._requestFinancingCampaingsOffersData({"label.id":this.noPreApprovedLabel}),this._nonPreaprovedCall=!0),this._requestFinancingLoansOffersData()}_onSolarPanelFinancingLoansOffersRequestSuccess({detail:e}){var t,a,s,i;this._requestErrors={...this._requestErrors,loanOffers:0},this._currentRequests={...this._currentRequests,loanOffers:!1},this._loanOffers={...e};const r=null===(t=this._loanOffers)||void 0===t||null===(a=t.contractingType)||void 0===a||null===(s=a.category)||void 0===s?void 0:s.id;this._preferentialPreApproved=r===(null===(i=this.contractingType)||void 0===i?void 0:i.categoryId)}get equivalenceMessage(){var e,t,a;const s=null===(e=this.simulatorData)||void 0===e||null===(t=e.environmentalImpact)||void 0===t?void 0:t.equivalences,i=null==s?void 0:s.findIndex((e=>e.id===this.equivalenceId));return null==s||null===(a=s[i])||void 0===a?void 0:a.description}_noRetryEventError(){this.dispatchEvent(new CustomEvent(`${mt.is}-error-not-available-retry`,{composed:!0,bubbles:!0}))}get _headerTemplate(){var e,t,a,s;const r=null===(e=this.simulatorData)||void 0===e?void 0:e.annualElectricityBills,n=null===(t=this.simulatorData)||void 0===t||null===(a=t.images)||void 0===a||null===(s=a.find((e=>e.id===this.imageIds.header)))||void 0===s?void 0:s.name,o=n?`${this.aemHost}${this.aemPath}${n}.svg`:"";return i`
      ${r?i`
            <bbva-banner-image
              size="L"
              image-src="${o}"
              img-accessibility-text="Solar Panel"
            ></bbva-banner-image>
            <bbva-type-text
              class="header-description"
              tag="span"
              text="${this.userName?this.t("sustainability-sustainable-solar-panels-simulator-header-text",{userName:this.userName}):this.t("sustainability-sustainable-solar-panels-simulator-header-text-without-username")}"
              size="3XL"
              font-weight="700"
            ></bbva-type-text>
          `:i` <div id="skeleton-banner-info"></div> `}
    `}get _annualExpensesTemplate(){var e;const t=null===(e=this.simulatorData)||void 0===e?void 0:e.annualElectricityBills;return i`
      ${t?i`
            <bbva-panel-container panel-color="primary" separator>
              ${null==t?void 0:t.map(((e,t)=>i`
                  <div style="display: flex; flex-direction: column; padding-left: 16px">
                    <bbva-type-text
                      text="${0===t?this.t("sustainability-sustainable-solar-panels-simulator-annual-expenses-text-without-panels"):this.t("sustainability-sustainable-solar-panels-simulator-annual-expenses-text-with-panels")}"
                      tag="span"
                    ></bbva-type-text>
                    <bbva-type-amount
                      ambient="primary"
                      type="bold"
                      decimals-hidden
                      amount="${null==e?void 0:e.amount}"
                      currency-code="${null==e?void 0:e.currency}"
                      .localCurrency="${this.localCurrency}"
                      language="${this.language}"
                    >
                    </bbva-type-amount>
                  </div>
                `))}
            </bbva-panel-container>
          `:i`
            <div>
              <bbva-panel-container panel-color="primary" separator="">
                ${Array.from(Array(2)).map((()=>i`
                    <div style="display: flex; flex-direction: column; padding-left: 16px">
                      <bbva-type-text loading="" text="."></bbva-type-text>
                      <bbva-type-amount loading="" amount="."> </bbva-type-amount>
                    </div>
                  `))}
              </bbva-panel-container>
            </div>
          `}
    `}get _editExpenseLinkTemplate(){var e;return i`
      <bbva-type-link
        class="home-page-link"
        id="sustainability-sustainable-solar-panels-simulator-edit-expense-link"
        size="S"
        ?loading="${!(null!==(e=this.simulatorData)&&void 0!==e&&e.annualElectricityBills)}"
        @click="${()=>{var e,t,a;this._editExpenseInputValue=null===(e=this.simulatorData)||void 0===e||null===(t=e.electricityBill)||void 0===t?void 0:t.amount,this._editZipcodeInputValue=null===(a=this.simulatorData)||void 0===a?void 0:a.zipCode,this.editExpenseModalVisible=!0}}"
      >
        ${this.t("sustainability-sustainable-solar-panels-simulator-link-detail-text")}
      </bbva-type-link>
    `}get _listBulletsTemplate(){var e,t,a,s,r,n;return i`
      <bbva-header-category
        ambient="primary"
        heading-level="2"
        ?loading="${!(null!==(e=this.simulatorData)&&void 0!==e&&e.environmentalImpact)}"
        text="${this.t("sustainability-sustainable-solar-panels-simulator-header-bullets")}"
      >
      </bbva-header-category>
      <bbva-list-bullet
        ambient="primary"
        ?loading="${!(null!==(t=this.simulatorData)&&void 0!==t&&t.environmentalImpact)}"
        text="${this.t("sustainability-sustainable-solar-panels-simulator-first-bullet")}"
      ></bbva-list-bullet>
      <bbva-list-bullet
        ambient="primary"
        ?loading="${!(null!==(a=this.simulatorData)&&void 0!==a&&a.environmentalImpact)}"
        text="${this.t("sustainability-sustainable-solar-panels-simulator-second-bullet")}"
      ></bbva-list-bullet>
      <bbva-list-bullet
        ambient="primary"
        ?loading="${!(null!==(s=this.simulatorData)&&void 0!==s&&s.environmentalImpact)}"
        text="${null===(r=this.simulatorData)||void 0===r||null===(n=r.environmentalImpact)||void 0===n?void 0:n.description}${this.equivalenceMessage}"
      ></bbva-list-bullet>
    `}get _editExpenseModalTemplate(){var e,t,a,s,r,n,o,l,u,c;return i`
      <bbva-help-modal
        full-height
        id="sustainability-sustainable-solar-panels-simulator-edit-expense-modal"
        header-text="${this.t("sustainability-sustainable-solar-panels-simulator-edit-expense-modal-title")}"
        hide-content-padding-top
        header-close-icon-label="${this.t("sustainability-sustainable-solar-panels-simulator-modal-header-icon-label-close")}"
        ?disabled-button="${!this._checkEditInputs}"
        button-text="${this.t("sustainability-sustainable-solar-panels-simulator-edit-expense-modal-button-text")}"
        @help-modal-footer-button-click="${()=>{var e,t,a,s;this._requestData({electricityBill:{amount:this._editExpenseInputValue,currency:null===(e=this.simulatorData)||void 0===e||null===(t=e.electricityBill)||void 0===t?void 0:t.currency,period:null===(a=this.simulatorData)||void 0===a||null===(s=a.electricityBill)||void 0===s?void 0:s.period},zipCode:this._editZipcodeInputValue}),this._isEditExpenseRequest=!0,this._isShowToast=!1}}"
        ?visible="${this.editExpenseModalVisible}"
      >
        <div class="content" slot="slot-content">
          <bbva-type-text
            .text="${this.t("sustainability-sustainable-solar-panels-simulator-edit-expense-modal-description")}"
            size="S"
            tag="span"
            font-weight="500"
          >
          </bbva-type-text>
          <div class="input-container" ambient="primary-alt">
            <bbva-form-input
              type="amount"
              required
              mode-input="tel"
              auto-validate
              pattern="^(?:10|[1-9]\\d|[1-9]\\d{2}|[1-9]\\d{2}[.,]\\d{1,3}|[1-9]\\d?[.,]\\d{1,3})$"
              error-message="${this.t("sustainability-sustainable-solar-panels-simulator-edit-expenses-validate",{minValue:p(null===(e=this.simulatorData)||void 0===e||null===(t=e.electricityBill)||void 0===t?void 0:t.minAmount,{currencyCode:null===(a=this.simulatorData)||void 0===a||null===(s=a.electricityBill)||void 0===s?void 0:s.currency,localCurrency:this.localCurrency,showCurrencyCode:!1,decimalsHidden:!0,language:this.language}),maxValue:p(null===(r=this.simulatorData)||void 0===r||null===(n=r.electricityBill)||void 0===n?void 0:n.maxAmount,{currencyCode:null===(o=this.simulatorData)||void 0===o||null===(l=o.electricityBill)||void 0===l?void 0:l.currency,localCurrency:this.localCurrency,showCurrencyCode:!1,decimalsHidden:!0,language:this.language})})}"
              decimal-digits="0"
              class="first-input"
              .label="${this.t("sustainability-sustainable-solar-panels-simulator-edit-expense-amount-input")}"
              .currencyCode="${null===(u=this.simulatorData)||void 0===u||null===(c=u.electricityBill)||void 0===c?void 0:c.currency}"
              .localCurrency="${this.localCurrency}"
              .language="${this.language}"
              .amount="${this._editExpenseInputValue}"
              @form-amount-input-change="${({detail:e})=>{this._editExpenseInputValue=e.amount}}"
            >
            </bbva-form-input>
            <bbva-form-input
              type="text"
              mode-input="tel"
              required
              auto-validate
              pattern="^\\d{5}$"
              .value="${this._editZipcodeInputValue}"
              error-message="${this.t("sustainability-sustainable-solar-panels-simulator-edit-zip-code-validate")}"
              .label="${this.t("sustainability-sustainable-solar-panels-simulator-edit-expense-postal-code-input")}"
              @form-input-value-change="${({detail:e})=>{this._editZipcodeInputValue=e.value}}"
            >
            </bbva-form-input>
          </div>
        </div>
      </bbva-help-modal>
      ${this._isEditExpenseRequest&&!this._isShowToast?i`
            <bbva-progress-content
              ambient="primary"
              variant="transparent"
              ?visible="${Object.values(this._currentRequests).some((e=>e))}"
            >
            </bbva-progress-content>
          `:""}
    `}get _editExpenseResponseTemplate(){return i`
      ${this._isShowToast&&this._isEditExpenseRequest?i`
            <bbva-notification-toast
              type="success"
              show
              auto-hide
              fixed-bottom
              duration=${this.toastDuration}
            >
              <bbva-type-text
                tag="span"
                size="S"
                text="${this.t("sustainability-sustainable-solar-panels-simulator-edit-expense-toast-response")}"
              ></bbva-type-text>
            </bbva-notification-toast>
          `:i``}
    `}get _checkEditInputs(){var e,t,a,s;const i=this._editExpenseInputValue>=(null===(e=this.simulatorData)||void 0===e||null===(t=e.electricityBill)||void 0===t?void 0:t.minAmount)&&this._editExpenseInputValue<=(null===(a=this.simulatorData)||void 0===a||null===(s=a.electricityBill)||void 0===s?void 0:s.maxAmount),r=/^\d{5}$/.test(this._editZipcodeInputValue);return i&&r}get _exitModalTemplate(){return i`
      <bbva-help-modal
        id="sustainability-sustainable-solar-panels-simulator-exit-modal"
        header-text="${this.t("sustainability-sustainable-solar-panels-simulator-exit-modal-title")}"
        button-text="${this.t("sustainability-sustainable-solar-panels-simulator-exit-modal-footer-button-text")}"
        link-text="${this.t("sustainability-sustainable-solar-panels-simulator-exit-modal-footer-button-link")}"
        ?visible="${this.exitModalVisible}"
        @help-modal-footer-button-click="${()=>{this.exitModalVisible=!1,this.navigateBack()}}"
        @help-modal-footer-link-click="${()=>{this.exitModalVisible=!1}}"
      >
        <div class="content" slot="slot-content">
          <bbva-type-icon icon="${l()}" size="24"> </bbva-type-icon>
          <bbva-type-text
            .text="${this.t("sustainability-sustainable-solar-panels-simulator-exit-modal-description")}"
            size="S"
            tag="span"
          >
          </bbva-type-text>
        </div>
      </bbva-help-modal>
    `}get _showOperationSolarPanelLinkTemplate(){var e;return i`
      <bbva-type-link
        class="home-page-link"
        id="sustainability-sustainable-solar-panels-simulator-show-operation-link"
        size="S"
        ?loading="${!(null!==(e=this.simulatorData)&&void 0!==e&&e.annualElectricityBills)}"
        @click="${()=>{this.showOperationFlexModalVisible=!0}}"
      >
        ${this.t("sustainability-sustainable-solar-panels-simulator-link-show-operation-detail-text")}
      </bbva-type-link>
    `}get _requestContactModalHeaderTemplate(){return i`
      <bbva-clip-microillustration
        size="M"
        alt-microillustration="bbva_managers"
        alt-image="Bbva manager"
      >
      </bbva-clip-microillustration>
      <bbva-type-text
        class="flexible-modal-title"
        tag="span"
        size="3XL"
        font-weight="700"
        text="${this.t("sustainability-sustainable-solar-panels-simulator-request-contact-modal-title-text")}"
      ></bbva-type-text>
    `}get _requestContactModalDescriptionTemplate(){return i`
      <div class="flexible-modal-description">
        <bbva-type-text
          tag="span"
          size="S"
          text="${this.t("sustainability-sustainable-solar-panels-simulator-request-contact-modal-first-description")}"
        ></bbva-type-text>
        <bbva-type-text
          tag="span"
          size="S"
          text="${this.t("sustainability-sustainable-solar-panels-simulator-request-contact-modal-second-description")}"
        ></bbva-type-text>
      </div>
    `}get _requestContactModalNotificationMessageTemplate(){return i`
      <bbva-notification-message
        variant="caution"
        message-title="${this.t("sustainability-sustainable-solar-panels-simulator-request-contact-modal-notification-message-title")}"
        book-title
      ></bbva-notification-message>
    `}get _requestContactModalPrivacyNoticeTemplate(){return i`
      <bbva-header-category
        ambient="primary"
        text="${this.t("sustainability-sustainable-solar-panels-simulator-request-contact-modal-header-category")}"
      ></bbva-header-category>
      <bbva-type-link
        class="request-contact-link"
        id="sustainability-sustainable-solar-panels-simulator-privacy-notice-link"
        size="S"
        icon=${m()}
        icon-size="24"
        @click="${()=>{this.showPrivacyTermsModalVisible=!0}}"
      >
        ${this.t("sustainability-sustainable-solar-panels-simulator-link-flexible-modal-text")}
      </bbva-type-link>
      <bbva-form-checkbox
        label="${this.t("sustainability-sustainable-solar-panels-simulator-request-contact-modal-form-checkbox")}"
        @input="${()=>{this._acceptConditions=!this._acceptConditions}}"
        .checked="${this._acceptConditions}"
      ></bbva-form-checkbox>
    `}get _requestContactModalFooterTemplate(){return i`
      <div class="contact-flex-modal-button">
        <bbva-button-default
          fullwidth
          @click="${()=>{this._requestCustomerTermsData("POST")}}"
          .disabled="${!this._acceptConditions}"
          >${this.t("sustainability-sustainable-solar-panels-simulator-request-contact-modal-footer-button-text")}
        </bbva-button-default>
      </div>
      <bbva-type-text
        class="flexible-modal-button-text"
        tag="span"
        size="S"
        text="${this.t("sustainability-sustainable-solar-panels-simulator-request-contact-modal-footer-text")}"
      ></bbva-type-text>
    `}get _leadsResponseModalTemplate(){return i`
      ${this._sendCustomerTermsFullError||this._sendLeadFullError?this._leadsFullErrorTemplate:i`
            <bbva-help-modal
              full-height
              id="sustainability-sustainable-solar-panels-simulator-leads-response-modal"
              header-text="${this.t("sustainability-sustainable-solar-panels-simulator-leads-response-modal-title")}"
              hide-content-padding-top
              header-close-icon-label="${this.t("sustainability-sustainable-solar-panels-simulator-modal-header-icon-label-close")}"
              ?visible="${this.leadsResponseModalVisible}"
              @help-modal-header-click=${e=>{"sustainability-sustainable-solar-panels-simulator-leads-response-modal"===e.target.id&&(this.requestContactModalVisible=!1,this.navigateBack())}}
            >
              <div class="content" slot="slot-content">
                ${this._leadsResponseHeaderTemplate} ${this._leadsResponseModalDescriptionTemplate}
                ${this._leadsResponseModalNotificationMessageTemplate}
              </div>
            </bbva-help-modal>
          `}
    `}get _leadsResponseHeaderTemplate(){return i`
      <bbva-clip-microillustration size="M" alt-microillustration="success" alt-image="Success">
      </bbva-clip-microillustration>
      <bbva-type-text
        class="leads-response-modal-title"
        tag="span"
        size="3XL"
        font-weight="700"
        text="${this.t("sustainability-sustainable-solar-panels-simulator-leads-response-modal-title-text")}"
      ></bbva-type-text>
    `}get _leadsResponseModalDescriptionTemplate(){return i`
      <div class="leads-response-modal-description">
        <bbva-type-text
          tag="span"
          size="S"
          text="${this.t("sustainability-sustainable-solar-panels-simulator-leads-response-modal-first-description")}"
        ></bbva-type-text>
        <bbva-type-text
          tag="span"
          size="S"
          text="${this.t("sustainability-sustainable-solar-panels-simulator-leads-response-modal-second-description")}"
        ></bbva-type-text>
      </div>
    `}get _leadsResponseModalNotificationMessageTemplate(){var e;return i`
      <bbva-notification-message
        variant="default"
        message-title="${this.t("sustainability-sustainable-solar-panels-simulator-leads-response-modal-notification-message-title")}"
        book-title
      >
        <p data-acoustic-obfuscate>${null===(e=this._leadsData)||void 0===e?void 0:e.email}</p>
      </bbva-notification-message>
    `}get _requestContactModalTemplate(){return i`
      <bbva-help-modal
        id="sustainability-sustainable-solar-panels-simulator-request-contact-modal"
        full-height
        hide-content-padding-top
        scrollable
        header-close-icon-label="${this.t("sustainability-sustainable-solar-panels-simulator-modal-header-icon-label-close")}"
        header-text="${this.t("sustainability-sustainable-solar-panels-simulator-request-contact-modal-header-text")}"
        ?visible="${this.requestContactModalVisible}"
      >
        <div class="content" slot="slot-content">
          ${this._requestContactModalHeaderTemplate} ${this._requestContactModalDescriptionTemplate}
          ${this._requestContactModalNotificationMessageTemplate}
          ${this._requestContactModalPrivacyNoticeTemplate}
          ${this._requestContactModalFooterTemplate}
        </div>
      </bbva-help-modal>
      ${this.requestContactModalVisible?i`
            <bbva-progress-content
              ambient="primary"
              variant="transparent"
              ?visible="${Object.values(this._currentRequests).some((e=>e))}"
            >
            </bbva-progress-content>
          `:i``}
    `}get _flexibleShowOperationModalTemplate(){return i`
      <bbva-help-modal
        id="sustainability-sustainable-solar-panels-simulator-flexible-show-operation-modal"
        full-height
        hide-content-padding-top
        scrollable
        header-close-icon-label="${this.t("sustainability-sustainable-solar-panels-simulator-modal-header-icon-label-close")}"
        header-text=" ${this.t("sustainability-sustainable-solar-panels-simulator-request-contact-modal-show-operation-header-text")}"
        ?visible="${this.showOperationFlexModalVisible}"
      >
        <div class="content" slot="slot-content">
          ${this._flexibleShowOperationModalHeaderTemplate}
          ${this._listShowOperationBulletsTemplate}
          <div class="accordion-container">${this._accordionShowOperationTemplate}</div>
        </div>
      </bbva-help-modal>
    `}get _flexibleShowPrivacyTermsModalTemplate(){return i`
      <bbva-help-modal
        id="sustainability-sustainable-solar-panels-simulator-flexible-show-privacy-terms-modal"
        full-height
        hide-content-padding-top
        scrollable
        header-close-icon-label="${this.t("sustainability-sustainable-solar-panels-simulator-modal-header-icon-label-close")}"
        header-text=" ${this.t("sustainability-sustainable-solar-panels-simulator-privacy-terms-modal-header-category")}"
        ?visible="${this.showPrivacyTermsModalVisible}"
      >
        <div class="content" slot="slot-content">
          <bbva-type-text
            tag="span"
            size="S"
            text="${this.t("sustainability-sustainable-solar-panels-simulator-privacy-terms-modal-first-description")}"
          ></bbva-type-text>
          <bbva-type-text
            tag="span"
            size="S"
            text="${this.t("sustainability-sustainable-solar-panels-simulator-privacy-terms-modal-second-description")}"
          ></bbva-type-text>
          <bbva-type-link
            id="sustainability-sustainable-solar-panels-simulator-privacy-notice-link"
            size="S"
            @click="${()=>{this.navigateForward({external:!0,params:{eventId:"privacy-terms",id:"privacy-terms",payload:{url:this.linkPage}}})}}"
          >
            ${this.t("sustainability-sustainable-solar-panels-simulator-privacy-terms-modal-link-description")}
          </bbva-type-link>
        </div>
      </bbva-help-modal>
    `}get _flexibleShowOperationModalHeaderTemplate(){var e,t,a;const s=null===(e=this.simulatorData)||void 0===e||null===(t=e.images)||void 0===t||null===(a=t.find((e=>e.id===this.imageIds.housePanel)))||void 0===a?void 0:a.name,r=s?`${this.aemHost}${this.aemPath}${s}.svg`:"";return i`
      <div>
        <div class="image-banner">
          <bbva-banner-image
            size="L"
            image-src="${r}"
            img-accessibility-text="Solar Panels"
          ></bbva-banner-image>
        </div>
        <bbva-type-text
          tag="span"
          size="S"
          text="${this.t("sustainability-sustainable-solar-panels-simulator-request-contact-modal-show-operation-header-description")}"
        ></bbva-type-text>
      </div>
    `}get _listShowOperationBulletsTemplate(){return i`
      <div role="list">
        <bbva-list-bullet
          ambient="primary"
          ordered=""
          role="listitem"
          value="1"
          text="${this.t("sustainability-sustainable-solar-panels-simulator-show-operation-modal-first-bullet")}"
        ></bbva-list-bullet>
        <bbva-list-bullet
          ambient="primary"
          ordered=""
          role="listitem"
          value="2"
          text="${this.t("sustainability-sustainable-solar-panels-simulator-show-operation-modal-second-bullet")}"
        ></bbva-list-bullet>
        <bbva-list-bullet
          ambient="primary"
          ordered=""
          role="listitem"
          value="3"
          text="${this.t("sustainability-sustainable-solar-panels-simulator-show-operation-modal-third-bullet")}"
        ></bbva-list-bullet>
        <bbva-list-bullet
          ambient="primary"
          ordered=""
          role="listitem"
          value="4"
          text="${this.t("sustainability-sustainable-solar-panels-simulator-show-operation-modal-fourth-bullet")}"
        ></bbva-list-bullet>
      </div>
    `}get _fullErrorTemplate(){const e=this._requestErrors.simulator<=this.maxRequestAttempts;return e||this._noRetryEventError(),i`
      <bbva-help-modal
        id="sustainability-sustainable-solar-panels-simulator-full-error-modal"
        full-height
        fixed-footer
        avoid-icon-close-modal
        title-lines="0"
        .closeModalElements="${[]}"
        header-close-icon-label="${this.t("sustainability-sustainable-solar-panels-simulator-modal-header-icon-label-close")}"
        .headerText="${this.t("sustainability-sustainable-solar-panels-simulator-error-modal-header")}"
        .buttonText="${e?this.t("sustainability-sustainable-solar-panels-simulator-error-section-link"):this.t("sustainability-sustainable-solar-panels-simulator-error-modal-exit")}"
        visible
        @help-modal-header-click="${()=>{this.navigateBack()}}"
        @help-modal-footer-button-click="${e?()=>{this._requestData()}:()=>{this.navigateBack()}}"
      >
        <div class="content" slot="slot-content">
          <bbva-clip-microillustration size="M" alt-microillustration="error" alt-image="Error">
          </bbva-clip-microillustration>
          <bbva-type-text
            text="${this.t("sustainability-sustainable-solar-panels-simulator-error-modal-title")}"
            size="3XL"
            tag="span"
            font-weight="500"
          >
          </bbva-type-text>
          <bbva-type-text
            .text="${e?this.t("sustainability-sustainable-solar-panels-simulator-error-section-text"):this.t("sustainability-sustainable-solar-panels-simulator-error-section-text-no-retries")}"
            size="S"
            tag="span"
          >
          </bbva-type-text>
        </div>
      </bbva-help-modal>
      <bbva-progress-content
        ambient="primary"
        variant="transparent"
        ?visible="${Object.values(this._currentRequests).some((e=>e))}"
      >
      </bbva-progress-content>
    `}get _leadsFullErrorTemplate(){const e=this._requestErrors.customer<=this.maxRequestAttempts&&this._requestErrors.lead<=this.maxRequestAttempts;return e||this._noRetryEventError(),i`
      <bbva-help-modal
        id="sustainability-sustainable-solar-panels-simulator-lead-error-modal"
        full-height
        fixed-footer
        avoid-icon-close-modal
        title-lines="0"
        .closeModalElements="${[]}"
        header-close-icon-label="${this.t("sustainability-sustainable-solar-panels-simulator-modal-header-icon-label-close")}"
        .headerText="${this.t("sustainability-sustainable-solar-panels-simulator-leads-response-modal-title")}"
        .buttonText="${e?this.t("sustainability-sustainable-solar-panels-simulator-error-section-link"):this.t("sustainability-sustainable-solar-panels-simulator-error-modal-exit")}"
        visible
        @help-modal-header-click="${()=>{this.navigateBack()}}"
        @help-modal-footer-button-click="${e?()=>{this._checkRequestType()}:()=>{this.navigateBack()}}"
      >
        <div class="content" slot="slot-content">
          <bbva-clip-microillustration size="M" alt-microillustration="error" alt-image="Error">
          </bbva-clip-microillustration>
          <bbva-type-text
            text="${this.t("sustainability-sustainable-solar-panels-simulator-lead-error-modal-title")}"
            size="3XL"
            tag="span"
            font-weight="500"
          >
          </bbva-type-text>
          <bbva-type-text
            .text="${e?this.t("sustainability-sustainable-solar-panels-simulator-error-section-text"):this.t("sustainability-sustainable-solar-panels-simulator-error-section-text-no-retries")}"
            size="S"
            tag="span"
          >
          </bbva-type-text>
        </div>
      </bbva-help-modal>
      <bbva-progress-content
        ambient="primary"
        variant="transparent"
        ?visible="${Object.values(this._currentRequests).some((e=>e))}"
      >
      </bbva-progress-content>
    `}_checkRequestType(){return this._sendCustomerTermsFullError?this._requestCustomerTermsData("POST"):this._requestSolarPanelsLeadsData()}get _accordionShowOperationTemplate(){const{accordionStructure:e}=ut,t="sustainability-sustainable-solar-panels-simulator-show-operation-modal";return e.map(((a,s)=>{const r=`${t}-${this.t(a.id)}-header`,n=`${t}-${this.t(a.id)}-content`,o=null==a?void 0:a.listItems;return i`
        <bbva-expandable-accordion divider=${s!==e.length-1?"full":""}>
          <div slot="header">
            <bbva-type-text size="S" font-weight="500" unset text="${r}"></bbva-type-text>
          </div>
          <div slot="content" class="slot-content">
            ${(null==o?void 0:o.length)>0?i`
                  ${o.map((e=>i`
                      <bbva-type-text
                        size="S"
                        text="${this.t(`${n}-${e}`)}"
                      ></bbva-type-text>
                    `))}
                `:i` <bbva-type-text size="S" text="${n}"></bbva-type-text> `}
          </div>
        </bbva-expandable-accordion>
      `}))}get _headerOfferTemplate(){var e;return i`
      <bbva-header-category
        ambient="primary"
        class="header-offer"
        heading-level="2"
        text="${this.t("sustainability-sustainable-solar-panels-simulator-offer-header-text")}"
        ?loading="${!(null!==(e=this.simulatorData)&&void 0!==e&&e.supplierOffer)}"
      >
      </bbva-header-category>
    `}get _partnerOfferCardTemplate(){var e;const t=null===(e=this.simulatorData)||void 0===e?void 0:e.supplierOffer;return i`
      <div class="offer-card">
        ${t?i`
              ${this._partnerOfferCardHeaderTemplate} ${this._partnerOfferNumPanelsTemplate}
              ${this._partnerOfferDefinitionAmountTemplate}
              ${this._partnerOfferNotificationHelpTemplate}
              ${this._partnerOfferShowServicesLinkemplate}
            `:i` <div id="skeleton-partner-offer"></div> `}
      </div>
    `}get _partnerOfferCardHeaderTemplate(){var e;const t=null===(e=this.simulatorData)||void 0===e?void 0:e.supplierOffer,a=null==t?void 0:t.id,s=[{icon:a&&"function"==typeof h[a]?h[a]():"",size:"xl",accessibilityText:"logo"}];return i`
      ${a===this.defaultPartnerLogoId?i`
            <bbva-clip-microillustration
              size="S"
              alt-microillustration="solar_panel_house"
              alt-image="Solar panel house"
            >
            </bbva-clip-microillustration>
          `:i` <bbva-clip-box .group="${s}"> </bbva-clip-box> `}

      <bbva-type-text
        tag="span"
        text="${this.t("sustainability-sustainable-solar-panels-simulator-offer-title")}"
        size="XL"
        font-weight="500"
      ></bbva-type-text>

      <bbva-type-text
        text="${this.t("sustainability-sustainable-solar-panels-simulator-offer-description")}"
        size="S"
        tag="span"
        font-weight="350"
      ></bbva-type-text>
    `}get _partnerOfferNumPanelsTemplate(){var e;const t=null===(e=this.simulatorData)||void 0===e?void 0:e.supplierOffer;return i`
      <div class="num-panels">
        <bbva-type-text
          .text="${this.t("sustainability-sustainable-solar-panels-simulator-offer-num-panels")}"
          size="S"
          tag="span"
          font-weight="350"
        ></bbva-type-text>

        <bbva-type-text
          .text="${t.numPanels}"
          size="L"
          tag="span"
          font-weight="500"
        ></bbva-type-text>
      </div>
    `}get _partnerOfferDefinitionAmountTemplate(){var e,t,a,s,r;const n=null===(e=this.simulatorData)||void 0===e?void 0:e.supplierOffer,o=null==n?void 0:n.discounts.find((e=>"NO_FINANCING"===e.id)),l="PERCENTAGE"===(null==o||null===(t=o.unit)||void 0===t?void 0:t.id)?`${null==o||null===(a=o.unit)||void 0===a?void 0:a.value}%`:"",u=null==n?void 0:n.discounts.find((e=>"FINANCING"===e.id)),c="PERCENTAGE"===(null==u||null===(s=u.unit)||void 0===s?void 0:s.id)?`${null==u||null===(r=u.unit)||void 0===r?void 0:r.value}%`:"";return i`
      <div class="definition-amount">
        <bbva-type-text
          tag="span"
          class="amount-text"
          text="${this.t("sustainability-sustainable-solar-panels-simulator-offer-general-price")}"
          size="XS"
          font-weight="350"
        ></bbva-type-text>
        <bbva-type-amount
          ambient="primary"
          variant="M"
          decimals-hidden
          amount="${n.generalPrice.amount}"
          currency-code="${n.generalPrice.currency}"
          local-currency="${this.localCurrency}"
          language="${this.language}"
        ></bbva-type-amount>
      </div>

      <div class="bbva-price">
        <bbva-header-category
          ambient="primary"
          heading-level="2"
          text="${this.t("sustainability-sustainable-solar-panels-simulator-offer-bbva-client-price")}"
        >
        </bbva-header-category>

        <div class="definition-amount">
          <bbva-type-text
            tag="span"
            class="amount-text"
            text="${this.t("sustainability-sustainable-solar-panels-simulator-offer-non-financing-discount",{noFinancingDiscountPercentage:l})}"
            size="XS"
            font-weight="350"
          ></bbva-type-text>
          <bbva-type-amount
            ambient="primary"
            variant="M"
            type="bold"
            decimals-hidden
            amount="${o.price.amount}"
            currency-code="${o.price.currency}"
            local-currency="${this.localCurrency}"
            language="${this.language}"
          ></bbva-type-amount>
        </div>

        <div class="definition-amount">
          <bbva-type-text
            tag="span"
            class="amount-text"
            text="${this.t("sustainability-sustainable-solar-panels-simulator-offer-financing-discount",{financingDiscountPercentage:c})}"
            size="XS"
            font-weight="350"
          ></bbva-type-text>
          <bbva-type-amount
            ambient="primary"
            variant="M"
            type="bold"
            decimals-hidden
            amount="${u.price.amount}"
            currency-code="${u.price.currency}"
            local-currency="${this.localCurrency}"
            language="${this.language}"
          ></bbva-type-amount>
        </div>
      </div>
    `}get _partnerOfferNotificationHelpTemplate(){return i`
      <bbva-notification-help
        accessibility-label-icon="Info"
        icon=${l()}
        text=${this.t("sustainability-sustainable-solar-panels-simulator-offer-disclaimer")}
      >
      </bbva-notification-help>
    `}get _partnerOfferShowServicesLinkemplate(){return i`
      <bbva-type-link
        size="S"
        @click="${()=>{this.partnerServicesModalVisible=!0}}"
      >
        ${this.t("sustainability-sustainable-solar-panels-simulator-offer-show-services-link")}
      </bbva-type-link>
    `}get _solarPanelOfferTemplate(){return i`
      ${this._headerOfferTemplate} ${this._partnerOfferCardTemplate}
      ${this._partnerServicesModalTemplate}
    `}get _partnerServicesModalTemplate(){return i`
      <bbva-help-modal
        id="sustainability-sustainable-solar-panels-simulator-partner-services-modal"
        full-height
        class="partner-services-modal"
        hide-content-padding-top
        scrollable
        header-close-icon-label="${this.t("sustainability-sustainable-solar-panels-simulator-modal-header-icon-label-close")}"
        header-text=" ${this.t("sustainability-sustainable-solar-panels-simulator-offer-partner-services-header-text")}"
        ?visible="${this.partnerServicesModalVisible}"
        @help-modal-header-click="${()=>{this.partnerServicesModalVisible=!1}}"
      >
        <div class="content" slot="slot-content">
          <bbva-type-text
            .text="${this.t("sustainability-sustainable-solar-panels-simulator-offer-partner-services-text")}"
            size="S"
            tag="span"
            font-weight="350"
          ></bbva-type-text>
          ${this._partnerServiceslistBulletsTemplate}
        </div>
      </bbva-help-modal>
    `}get _partnerServiceslistBulletsTemplate(){return i`
      ${[...Array(8).keys()].map((e=>{var t,a,s,r,n,o,l,u,c,d;return i`
          <bbva-list-bullet
            ambient="primary"
            text="${this.t(`sustainability-sustainable-solar-panels-simulator-offer-partner-services-bullet-${e}`,{numPanels:null===(t=this.simulatorData)||void 0===t||null===(a=t.supplierOffer)||void 0===a?void 0:a.numPanels,powerValue:null===(s=this.simulatorData)||void 0===s||null===(r=s.supplierOffer)||void 0===r||null===(n=r.power)||void 0===n?void 0:n.value,powerUnit:null===(o=this.simulatorData)||void 0===o||null===(l=o.supplierOffer)||void 0===l||null===(u=l.power)||void 0===u?void 0:u.unit,inverterModel:null===(c=this.simulatorData)||void 0===c||null===(d=c.supplierOffer)||void 0===d?void 0:d.inverterModel})}"
          ></bbva-list-bullet>
        `}))}
    `}get _financingTermValueYears(){var e,t,a,s;const i=(null===(e=this._userFinancingTerms)||void 0===e?void 0:e.value)||(null===(t=this._loanOffers)||void 0===t||null===(a=t.details)||void 0===a||null===(s=a.maximumTerms)||void 0===s?void 0:s.number);return Number(i)/12}_checkRequestError(){return this._nonPreaprovedCall=!1,this._hasCampaingsOffersError?this._requestFinancingCampaingsOffersData():this._requestFinancingLoansOffersData()}_sectionErrorSelect(){return this._hasCampaingsOffersError?this._sectionErrorTemplate("campaingsOffers"):this._sectionErrorTemplate("loanOffers")}_sectionErrorTemplate(e){const t=this._requestErrors[e]<=this.maxRequestAttempts;return i`
      <div class="section-error-wrapper">
        <bbva-notification-message
          variant="error"
          book-title
          .messageTitle="${t?this.t("sustainability-sustainable-solar-panels-simulator-error-section-text"):this.t("sustainability-sustainable-solar-panels-simulator-error-section-text-no-retries")}"
          .linkTitle="${t?this.t("sustainability-sustainable-solar-panels-simulator-error-section-link"):""}"
          @notification-message-link-click="${()=>{this._checkRequestError()}}"
        ></bbva-notification-message>
        <bbva-progress-content
          variant="transparent"
          ?visible="${this._currentRequests[e]}"
        ></bbva-progress-content>
      </div>
    `}get _solarPanelSavingsTemplate(){var e,t;return i`
      <sustainability-sustainable-solar-panels-simulator-savings
        .host="${this.host}"
        .headers="${this._headers}"
        .requiredToken="${this.requiredToken}"
        .sustainabilityApiVersion="${this.sustainabilityApiVersion}"
        .language="${this.language}"
        .native="${this.native}"
        .localCurrency="${this.localCurrency}"
        .solarPanelsSimulationData="${this.simulatorData}"
        .quotationsData="${this._quotationsOffers}"
        .suggestedTerm="${null===(e=this._loanOffers)||void 0===e||null===(t=e.details)||void 0===t?void 0:t.suggestedTerm}"
        .financingTermValueYears="${this._financingTermValueYears}"
      ></sustainability-sustainable-solar-panels-simulator-savings>
    `}get _solarPanelFinancingTemplate(){return i`
      <sustainability-sustainable-solar-panels-simulator-financing
        .host="${this.host}"
        .headers="${this._headers}"
        .requiredToken="${this.requiredToken}"
        .sustainabilityApiVersion="${this.sustainabilityApiVersion}"
        .language="${this.language}"
        .native="${this.native}"
        .localCurrency="${this.localCurrency}"
        .offerId="${this._offerId}"
        .simulatorSupplierOfferData="${this.simulatorData}"
        .financingLoansOffersData="${this._loanOffers}"
        @sustainability-sustainable-solar-panels-simulator-quotations-offers-fetch="${({detail:e})=>{this._quotationsOffers=e}}"
        @sustainability-sustainable-solar-panels-simulator-campaings-offers-value-change="${({detail:e})=>{this._userFinancingTerms={...e}}}"
      ></sustainability-sustainable-solar-panels-simulator-financing>
    `}get _fixedFooterTemplate(){var e;return i`
      <div class="fixed-footer">
        <bbva-button-default
          .disabled="${!(null!==(e=this.simulatorData)&&void 0!==e&&e.annualElectricityBills)}"
          fullwidth
          @click="${()=>{this._requestCustomerTermsData("GET"),this.requestContactModalVisible=!0}}"
        >
          ${this.t("sustainability-sustainable-solar-panels-simulator-modal-footer-button-text")}
        </bbva-button-default>
      </div>
    `}get _solarPanelSimulatorTemplate(){return i`
      <div
        id="sustainability-sustainable-solar-panels-simulator-home-page"
        class="sustainability-sustainable-solar-panels-simulator-home-page"
      >
        ${this._headerTemplate} ${this._annualExpensesTemplate} ${this._editExpenseLinkTemplate}
        ${this._listBulletsTemplate} ${this._showOperationSolarPanelLinkTemplate}
        ${this._flexibleShowOperationModalTemplate} ${this._requestContactModalTemplate}
        ${this._flexibleShowPrivacyTermsModalTemplate} ${this._solarPanelOfferTemplate}
        ${this._hasCampaingsOffersError||this._hasLoansOffersError?this._sectionErrorSelect():this._solarPanelFinancingTemplate}
        ${this._solarPanelSavingsTemplate}
        ${this._toggles.products&&!this._hasCampaingsOffersError?this._productsTemplate:i``}
        ${this._fixedFooterTemplate} ${this._editExpenseResponseTemplate} ${this._exitModalTemplate}
        ${this._editExpenseModalTemplate} ${this._leadsResponseModalTemplate}
      </div>
    `}render(){return i`
      ${super.render()} ${this._solarPanelSimulatorDmTemplate} ${this._globalCustomerDmTemplate}
      ${this._solarPanelLeadsDmTemplate} ${this._solarPanelFinancingCampaingsOffersDmTemplate}
      ${this._solarPanelFinancingLoansOffersDmTemplate}
      <div ambient="primary">
        ${this._hasFullError?this._fullErrorTemplate:i` ${this._solarPanelSimulatorTemplate} `}
      </div>
    `}}customElements.define(mt.is,mt);var ht=r`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class bt extends a{static get is(){return"bbva-controller-sustainable-solar-panels-simulator"}static get properties(){return{featureFlags:{type:Object},native:{type:Boolean}}}constructor(){super(),this.featureFlags={},this.native=!1}static get styles(){return[ht,o("bbva-controller-sustainable-solar-panels-simulator-shared-styles")]}updated(e){if(e.has("featureFlags")&&Object.keys(this.featureFlags).length){var t;const e={products:null===(t=this.featureFlags["glomo.sustainability.solarPanelsSimulator.products"])||void 0===t?void 0:t.value};this._dispatch("set-toggles-flags",e)}}initFeature(){this._dispatch("init-feature",!0)}setCachedUser(e){const t=null==e?void 0:e.username;this._dispatch("set-cached-user",t)}navigateToOfferLoanPage({payload:e}){const t={offerId:null==e?void 0:e.id};this._dispatch("navigate-to-loan-offer",t)}openExternalUrl({payload:e}){if(this.native){const t={scheme:null==e?void 0:e.url,packageId:null};this._dispatch("external-url-navigate",t)}else window.open(null==e?void 0:e.url,"_blank")}_dispatch(e,t){this.dispatchEvent(new CustomEvent(`${bt.is}-${e}`,{bubbles:!0,composed:!0,detail:t}))}}customElements.define(bt.is,bt);class gt extends a{static get is(){return"bbva-analyticmanager-sustainability-solar-panels-simulator"}static get properties(){return{persistData:{type:Object}}}constructor(){super(),this.persistData={}}static get styles(){return[he,o("bbva-analyticmanager-sustainability-shared-styles")]}manageAnalyticsModalNavigation(e){if(e.visible){var t,a,s;const i=(null===(t=e.target)||void 0===t?void 0:t.id)||(null===(a=e.modal)||void 0===a?void 0:a.id),r={"sustainability-sustainable-solar-panels-simulator-full-modal":{event:"home-view"},"sustainability-sustainable-solar-panels-simulator-flexible-show-operation-modal":{event:"show-operation-modal"},"sustainability-sustainable-solar-panels-simulator-partner-services-modal":{event:"partner-services-modal"},"sustainability-sustainable-solar-panels-simulator-request-contact-modal":{event:"request-contact-modal"},"sustainability-sustainable-solar-panels-simulator-leads-response-modal":{event:"request-success-modal"},"sustainability-sustainable-solar-panels-simulator-flexible-show-privacy-terms-modal":{event:"show-privacy-terms-modal"},"sustainability-sustainable-solar-panels-simulator-full-error-modal":{event:"error-modal"}};this._dispatch(null===(s=r[i])||void 0===s?void 0:s.event)}}manageAnalyticsExternalNavigation(e){var t,a,s;this.persistData={productName:"0NOM"===(null==e||null===(t=e.payload)||void 0===t||null===(a=t.product)||void 0===a||null===(s=a.productType)||void 0===s?void 0:s.name)?"prestamo nomina":"prestamo personal inmediato"},this._dispatch(`navigate-${null==e?void 0:e.id}`,this.persistData)}_dispatch(e,t){this.dispatchEvent(new CustomEvent(`${gt.is}-${e}`,{bubbles:!0,composed:!0,detail:t}))}}customElements.define(gt.is,gt);
