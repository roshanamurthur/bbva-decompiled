import{L as e,h as t,aZ as i,J as s,z as a,a8 as r,ad as o,ab as n,a9 as h,aa as c,b0 as l,aJ as d,a as p,ap as g,an as u,bj as b,b6 as m,ag as v,dt as y,ak as f,av as _,i as S,f as C,o as w,g as x,ac as T,ar as E,cR as $,bU as k,F as R,bF as O,cS as I,m as A,cG as P,aY as N,dJ as D,dp as H,bI as M,y as L,dy as q,bG as j,v as F,aw as B,bg as V,b4 as U,ah as z,aN as W,aO as G,ai as J,cU as K}from"./952f98a9.js";import{ax as X}from"./216055dc.js";import{B as Q,a as Y}from"./8bd033ff.js";import{a$ as Z,bt as ee,aL as te,ao as ie,u as se}from"./7f3d7ca9.js";import"./111ad2c6.js";import"./6547a2ba.js";import{B as ae,a as re,b as oe}from"./718d2902.js";class ne extends e{static get is(){return"bbva-global-generic-dm"}static get properties(){return{data:{type:Object},params:{type:Object},_customEvents:{type:Object},host:{type:String},path:{type:String},method:{type:String},body:{type:Object},headers:{type:Object},native:{type:Boolean},contentType:{type:String,attribute:"content-type"},verbose:{type:Boolean},crossDomain:{type:Boolean,attribute:"cross-domain"},withCredentials:{type:Boolean,attribute:"with-credentials"},timeout:{type:Number},token:{type:Object},requiresToken:{type:Boolean,attribute:"requires-token"},monitoring:{type:Boolean}}}constructor(){super(),this.data={},this.params={},this._customEvents={},this.host="",this.path="",this.method="GET",this.body={},this.headers={},this.native=!1,this.verbose=!1,this.crossDomain=!1,this.withCredentials=!1,this.timeout=6e4,this.token={},this.requiresToken=!1,this.monitoring=!1}firstUpdated(e){this._dataProvider=this.shadowRoot.getElementById("dp")}resetCache(){this.data={}}async getData(e={}){Object.entries(this.data).length>0||(this._customEvents={customEvent:"generic-dm-fetch",errorFireEventHandler:"generic-dm-fetch-error"},this.params=e,await this._generateRequest("GET"))}async patchData(e={}){this._customEvents={customEvent:"generic-dm-update",errorFireEventHandler:"generic-dm-update-error"},await this._generateRequest("PATCH",e)}async postData(e={}){this._customEvents={customEvent:"generic-dm-create",errorFireEventHandler:"generic-dm-create-error"},await this._generateRequest("POST",e)}async putData(e={}){this._customEvents={customEvent:"generic-dm-update",errorFireEventHandler:"generic-dm-update-error"},await this._generateRequest("PUT",e)}async deleteData(){this._customEvents={customEvent:"generic-dm-remove",errorFireEventHandler:"generic-dm-remove-error"},await this._generateRequest("DELETE")}async _generateRequest(e,t){this.method=e,t&&(this.body=t),await this.updateComplete,await this._dataProvider.generateRequest()}_handleSuccessResponse(e){this.dispatchEvent(new CustomEvent(this._customEvents.customEvent,{detail:this._getFields(e.detail,this.params&&this.params.fields?this.params.fields:[]),bubbles:!0,composed:!0}))}_handleErrorResponse(e){this.dispatchEvent(new CustomEvent(this._customEvents.errorFireEventHandler,{detail:e,bubbles:!0,composed:!0}))}_getFields(e,t){if(!Array.isArray(t)||0==t.length)return e;if(Array.isArray(e)){const i=[];for(const s of e)i.push(this._reduceFields(s,t));return i}return this._reduceFields(e,t)}_reduceFields(e,t){const i={};for(const s of t)this._reduceField(e,i,s);return this._deletedEmptyObjects(i),0===Object.entries(i).length?e:i}_reduceField(e,t,i){if(i){if(i.includes(".")){const s=i.split(".");if(void 0!==e[s[0]])if(Array.isArray(e[s[0]])){void 0===t[s[0]]&&(t[s[0]]=[]);for(const[i,a]of e[s[0]].entries())void 0===t[s[0]][i]&&(t[s[0]][i]={}),this._reduceField(a,t[s[0]][i],s.slice(1,s.length).join("."))}else void 0===t[s[0]]&&(t[s[0]]={}),this._reduceField(e[s[0]],t[s[0]],s.slice(1,s.length).join("."))}else void 0!==e[i]&&(t[i]=e[i]);return t}}_deletedEmptyObjects(e){for(const t of Object.keys(e))"object"==typeof e[t]&&(this._deletedEmptyObjects(e[t]),0===Object.entries(e[t]).length&&delete e[t]);return e}render(){return t`
      <bbva-core-generic-dp
        id="dp"
        .host=${this.host}
        .path=${this.path}
        .method=${this.method}
        .body=${this.body}
        .headers=${this.headers}
        .native=${this.native}
        .contentType=${this.contentType}
        ?verbose=${this.verbose}
        ?cross-domain=${this.crossDomain}
        ?with-credentials=${this.withCredentials}
        .timeout=${this.timeout}
        .token=${this.token}
        ?requires-token=${this.requiresToken}
        .semaasMonitoring=${this.monitoring}
        @request-success=${this._handleSuccessResponse}
        @request-error=${this._handleErrorResponse}>
      </bbva-core-generic-dp>
    `}}customElements.define(ne.is,ne);class he extends ne{static get is(){return"bbva-global-aem-content-fragment-dm"}static get properties(){return{fieldPaths:{type:Object}}}constructor(){super(),this.fieldPaths={items:":items.root.:items"}}async getAemData(e={}){Object.entries(this.data).length>0||(e.fields=this._fields,await this.getData(e))}async getData(e={}){this._customEvents={customEvent:"aem-content-fragment-dm-fetch",errorFireEventHandler:"aem-content-fragment-dm-fetch-error"},this.params=e,await this._generateRequest("GET")}get _fields(){const e=[];for(const t in this.fieldPaths)this.fieldPaths.hasOwnProperty(t)&&e.push(this.fieldPaths[t]);return e}_handleSuccessResponse(e){const t={},i=this._getFields(e.detail,this.params.fields);for(let e=0;e<Object.keys(this.fieldPaths).length;e++)t[Object.keys(this.fieldPaths)[e]]=this._getNestedItem(this.fieldPaths[Object.keys(this.fieldPaths)[e]].split("."),i);this.dispatchEvent(new CustomEvent(this._customEvents.customEvent,{detail:t,bubbles:!0,composed:!0}))}_getNestedItem(e=[],t={}){if(0===e.length)return t;const[i,...s]=e;return t[i]?this._getNestedItem(s,t[i]):t[i]}}customElements.define(he.is,he);class ce extends e{static get is(){return"bbva-dataprovider-genesys-external-service"}static get properties(){return{genericDm:{type:Object},host:{type:String},native:{type:Boolean},path:{type:String},eventNames:{type:Object,attribute:!1},jwt:{type:String},organizationId:{type:String},deploymentId:{type:String},targetType:{type:String},targetAddress:{type:String},displayName:{type:String}}}constructor(){super(),this.genericDm={},this.host="",this.native=!1,this.path="api/v2/webchat/guest/conversations",this.eventNames={},this.jwt="",this.organizationId="",this.deploymentId="",this.targetType="",this.targetAddress="",this.displayName=""}firstUpdated(){this.genericDm=this.renderRoot.querySelector(".genericDM"),this.updateNotice()}getBody(){return{organizationId:this.organizationId,deploymentId:this.deploymentId,routingTarget:{targetType:this.targetType,targetAddress:this.targetAddress},memberInfo:{displayName:this.displayName}}}getHeaders(){return{"Content-Type":"application/json",Authorization:`Bearer ${this.jwt}`}}createChat(){this.eventNames={success:"create-chat-success",error:"create-chat-error"},this.genericDm.setAttribute("path",this.path),this.genericDm.headers=this.getHeaders(),this.genericDm.postData(this.getBody())}sendMessage(e){const{body:t,conversationId:i,memberId:s,jwtChat:a}=e;this.jwt=a,this.eventNames={success:"send-message-success",error:"send-message-error"},this.genericDm.headers=this.getHeaders(),this.genericDm.setAttribute("path",`${this.path}/${i}/members/${s}/messages`),t&&i&&s&&this.jwt&&this.genericDm.postData(t)}getMember(e,t,i){this.jwt=i,this.eventNames={success:"get-member-success",error:"get-member-error"},this.genericDm.setAttribute("path",`${this.path}/${e}/members/${t}`),this.genericDm.headers=this.getHeaders(),this.genericDm.getData()}getMembers(e){this.eventNames={success:"get-members-success",error:"get-members-error"},this.genericDm.setAttribute("path",`${this.path}/${e}/members`),this.genericDm.headers=this.getHeaders(),this.requestUpdate(),this.genericDm.getData()}deleteMember(e="",t="",i=""){this.jwt=i,this.eventNames={success:"delete-member-success",error:"delete-member-error"},this.genericDm.setAttribute("path",`${this.path}/${e}/members/${t}`),this.genericDm.headers=this.getHeaders(),this.genericDm.body=null,this.requestUpdate(),this.genericDm.deleteData()}recoverMessages(e,t){this.jwt=t,this.requestUpdate(),this.eventNames={success:"recover-messages-success",error:"recover-messages-error"},this.genericDm.setAttribute("path",`${this.path}/${e}/messages`),this.genericDm.headers=this.getHeaders(),this.genericDm.getData()}reconnectChat(e,t){this.eventNames={success:"reconnect-chat-success",error:"reconnect-chat-error"},this.genericDm.headers=this.getHeaders(),this.genericDm.setAttribute("path",`${this.path}/${e}/members/${t}`),this.genericDm.getData()}typing(e,t,i){this.jwt=e,this.eventNames={success:"tipyng-chat-success",error:"tipyng-chat-error"},this.genericDm.headers=this.getHeaders(),this.genericDm.setAttribute("path",`${this.path}/${t}/members/${i}/typing`),this.genericDm.postData()}render(){return t`
      <bbva-global-generic-dm
        class="genericDM"
        host="${this.host}"
        ?native="${this.native}"
        path="${this.path}"
        .headers=${this.getHeaders()}
        @generic-dm-create = ${this._genericSuccessResponse}
        @generic-dm-create-error = ${this._genericErrorResponse}
        @generic-dm-fetch = ${this._genericSuccessResponse}
        @generic-dm-fetch-error = ${this._genericErrorResponse}
        @generic-dm-remove=${this._genericSuccessResponse}
        @generic-dm-remove-error=${this._genericErrorResponse}
      >
      </bbva-global-generic-dm>
    `}_genericSuccessResponse(e){this.jwt=e.detail.jwt?e.detail.jwt:"";const{success:t}=this.eventNames;this._fireEvent(t,e)}_genericErrorResponse(e){const{error:t}=this.eventNames;this._fireEvent(t,e)}updateNotice(){this._fireEvent("update-notice")}_fireEvent(e="",t={}){const i=new CustomEvent(e,{detail:t,bubbles:!0,composed:!0});this.dispatchEvent(i)}}class le{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let i=Object(this),s=i.length>>>0;if(0===s)return!1;let a=0|t,r=Math.max(a>=0?a:s-Math.abs(a),0);for(;r<s;){if((o=i[r])===(n=e)||"number"==typeof o&&"number"==typeof n&&isNaN(o)&&isNaN(n))return!0;r++}var o,n;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var i=[],s=0,a="",r=0,o=arguments.length;r!==o;++r){var n=+arguments[r];if(!(n<1114111&&n>>>0===n))throw RangeError("Invalid code point: "+n);n<=65535?s=i.push(n):(n-=65536,s=i.push(55296+(n>>10),n%1024+56320)),s>=16383&&(a+=e.apply(null,i),i.length=0)}return a+e.apply(null,i)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",i=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${i&&i.message}`)}}class de extends le{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}}const pe=0,ge=1,ue="jwt",be="tsec",me="none";class ve extends le{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=pe,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new de,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=be:this.requiredToken=me,this.requiresJWT=!1):this.requiredToken===be?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===ue?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===me?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(be)}_setJwtHandler(){this._setTokenHandler(ue)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((i,s)=>{t=Object.assign(t,{resolve:i,reject:s}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let i=this._getRequestHeaders();Object.keys(i).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,i[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=i),e}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let i=e.replace(/[\{\}]+/g,""),s=t[i];return s?delete t[i]:this._error(9,`Missing ${i} param value`),s})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let i=Object.keys(t);i.length&&(e=[e,i.map((e=>{let i=t[e];return Array.isArray(i)&&this.paramArrayMode===ge?this._arrayToQueryParam(e,i):`${e}=${i}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(be,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(ue,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(i){var s=t.getItem(i);s&&"null"!==s&&(e[i]=s)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const i=window.sessionStorage;t=Object.keys(i).filter((t=>t.startsWith(e))).reduce(((t,s)=>(t[s.replace(e,"")]=i.getItem(s),t)),{})}return t}_getTokenForRequestHeaders(e,t){const i=`${e}Handler`,s=e===ue?"JWT ":"",a=e===ue?"Authorization":be;if(void 0===this[i]||null===this[i])this._error(11,`${e} handler is undefined`);else{const r=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let o=this[i].getItem(r);o?t[a]=t[a]||s+o:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((i=>{t.push(`${i}=${e[i]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let i;const s=new Promise(((e,t)=>{i=(i,s)=>{i?t(i):e(s)}}));return t.addEventListener("loadend",(function e(s){t.removeEventListener("loadend",e),s.error?i(s.error):i(null,t.result)})),t.readAsText(e),s}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let i=0;for(;i<e.length;){let s=e[i],a=0,r=0;if(s<=127?(a=0,r=255&s):s<=223?(a=1,r=31&s):s<=239?(a=2,r=15&s):s<=244&&(a=3,r=7&s),e.length-i-a>0){let t=0;for(;t<a;)s=e[i+t+1],r=r<<6|63&s,t+=1}else r=65533,a=e.length-i;t+=String.fromCodePoint(r),i+=a+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},i=e.trim().split(/[\r\n]+/);for(const e in i)if(i.hasOwnProperty(e)&&""!==i[e]){let s=": ",a=i[e].split(s);t[a.shift().toLowerCase()]=a.join(s)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,i,s){let a=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(s)>=0&&(a=t.getResponseHeader(s));break;case this._NATIVE_XHR:t&&t.headers&&(a=JSON.parse(t.headers)[s])}if(a){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):i;e.getItem(t)!==a&&(e.setItem(t,a),this._emitTokenUpdate(i,a))}}_emitTokenUpdate(e,t){if(this.htmlContext){const i=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(i)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,i,s,a,r;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),i=e.getResponseHeader("AuthenticationData"),s=e.getResponseHeader("AuthenticationState"),a=e.getResponseHeader("AuthenticationChallenge"),r=e.getResponseHeader("AuthenticationResponse");else{let o=JSON.parse(e.headers);t=o.authenticationtype,i=o.authenticationdata||null,s=o.authenticationstate,a=o.authenticationchallenge,r=o.authenticationresponse}return{type:t,data:i,state:s,challenge:a,response:r}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",i=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const s=this._getSignatureData(e,t,i);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:s}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",i="",s=""){let a;if("object"==typeof e&&e){const r=this._getSignatureData(e.signatureType,t,i);a=this._makeKeyValuePairFromObject(r,e.signatureValue),e.challenge&&(a+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(a,e.signatureType,s)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(a=`password=${e}`,this._buildSignatureHeaders(a,"2",s)):(a=`${i}=${e}`,this._buildSignatureHeaders(a,t,s)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let i,s=e.split(",");if(s.length>1){i=s.map((e=>`${e}=${t[e]}`)).join(",")}else i=`${e}=${t}`;return i}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",i=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),i&&(this.headers=Object.assign(this.headers,{AuthenticationState:i})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),a=this._ERROR_CODES.SIGNATURE_INVALID.includes(s),{type:r,data:o,state:n,challenge:h,response:c}=this._extractSignatureResponseHeaders(e),l=this._getRequestMetadata(e);if(a)this._notifySignatureInvalid(l),i=!0;else if(r)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(s)?(this._notifySignatureTypeUsingErrorCode(s,l,r,o,n,h,c),i=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(l,r,o,n,h,c),i=!0}return i}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),a=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(s),r=this._getRequestMetadata(e);a&&(this._notifyWaitingForProcessResponse(r),i=!0)}return i}_notifySignatureRequiredFirstStep(e,t,i,s){this._defineSignatureType(t,i),this._defineSignatureValue(t,i,s),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:i,metadata:e}}))}_notifySignatureRequired(e,t,i,s,a,r){this._defineSignatureValue(t,i,s);const o={type:t,data:i,challenge:a,metadata:e};r&&(o.response=r),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:o}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:i}=e;return{path:this._path,method:this.method,url:t,status:i}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",i=""){const s=t.split(";").findIndex((t=>t===e));return i?i.split(";")[s]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,i,s,a,r){s?this._notifySignatureRequired(e,t,i,s,a,r):this._notifySignatureRequiredFirstStep(e,t,i,s)}_notifySignatureTypeUsingErrorCode(e,t,i,s,a,r,o){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,i,s,a):this._notifySignatureRequired(t,i,s,a,r,o)}}class ye extends ve{constructor(e=null){super(Object.assign(e||{},{method:"POST"}))}toString(e=""){return super.toString(e||"BGADPRequestPOST")}}class fe extends ye{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`contact-center/v${this.version}/register-traceability`)}toString(){return super.toString("BGADPMxContactCenterRegisterTraceabilityPostV0")}}class _e extends(s(e)){static get is(){return"bbva-dataprovider-contact-center"}constructor(){super(),this.version="0",this.requiredToken="tsec",this.native=!1,this.headers={},this.timeout=120,this.htmlContext=this}registerTraceability(e){const t=this._getServiceParams(this.params,e),i=_e._serviceContactCenterRegisterTraceabilityPostV0(t);this._generateGetService(i,{customEvent:"register-traceability-success",errorFireEventHandler:"register-traceability-error"})}static _serviceContactCenterRegisterTraceabilityPostV0(e){return new fe(e)}}var Se=a`
:host {
  display: flex;
  flex-direction: column;
  box-sizing: border-box;
  text-align: center;
  position: relative;
  --_panel-info-title-color: var(--bbva-panel-info-title-dark-mode-color, var(--bbva-panel-info-title-color, var(--colorsSecondary600, ${r(h.secondary600)})));
  --_panel-info-text-color: var(--bbva-panel-info-text-dark-mode-color, var(--bbva-panel-info-text-color, var(--colorsSecondary600, ${r(h.secondary600)})));
  --bbva-text-highlight-color: var(--bbva-panel-info-text-highlight-dark-mode-color, var(--bbva-panel-info-text-highlight-color, var(--colorsSecondary600, ${r(h.secondary600)})));
  --_skeleton-quote-color: var(--bbva-panel-info-skeleton-dark-mode-color, var(--bbva-panel-info-skeleton-color, var(--colorsSecondary200, ${r(h.secondary200)})));
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

.image {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(c.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(c.spacer)}))) / 16) * 1em) auto;
}
.image img {
  width: var(--bbva-panel-info-image-width, 100%);
  height: var(--bbva-panel-info-image-height, auto);
  object-fit: cover;
  margin: 0 auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(c.spacer)}))) / 16) * 1rem);
}
.image span {
  display: block;
  width: var(--bbva-panel-info-microillustration-width, 5rem);
  height: var(--bbva-panel-info-microillustration-height, auto);
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(c.spacer)}))) / 16) * 1rem) auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(c.spacer)}))) / 16) * 1rem);
}
.image span.empty-state {
  width: 9rem;
}

.content {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(c.spacer)}))) / 16) * 1em) calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${r(c.spacer)}))) / 16) * 1em);
}
.content ::slotted(*) {
  margin: 0;
  line-height: var(--lineHeightTypeSmall, ${r(o.typeSmall)});
}

:host([hide-padding-bottom]) .content {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(c.spacer)}))) / 16) * 1em) 0;
}

.title {
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(c.spacer)}))) / 16) * 1rem);
  color: var(--_panel-info-title-color);
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${r(n.medium.fontWeight)});
  line-height: var(--lineHeightTypeLarge, ${r(o.typeLarge)});
}
.title.not-text {
  margin-bottom: 0;
}

.description {
  margin: 0 auto;
  color: var(--_panel-info-text-color);
}

[data-tag-name=bbva-link] {
  display: inline-block;
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(c.spacer)}))) / 16) * 1rem);
}
[data-tag-name=bbva-link][disabled] {
  opacity: 1;
}

:host([loading]):before {
  background-image: linear-gradient(var(--_skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg, transparent);
  background-size: 144px 144px, calc((44% * 2) + (16px/ 2)) 16px, calc((75% * 2) + (16px/ 2)) 16px, calc((30% * 2) + (16px/ 2)) 16px;
  background-position: 50% 8px, 283% 168px, -20% 200px, 92% 232px;
}

:host([loading][image]):before {
  margin-top: 0;
  min-height: 17.5rem;
  background-image: linear-gradient(var(--_skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg, transparent);
  background-size: 100% 152px, calc((44% * 2) + (16px/ 2)) 16px, calc((75% * 2) + (16px/ 2)) 16px, calc((30% * 2) + (16px/ 2)) 16px;
  background-position: 50% 0px, 283% 172px, -20% 204px, 92% 236px;
}

:host([loading]):before {
  content: "";
  position: absolute;
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(c.spacer)}))) / 16) * 1rem);
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  min-height: 18.5rem;
  display: inline-block;
  pointer-events: none;
  background-repeat: no-repeat;
  font-size: 1em;
  transform: opacity;
  animation: pulse 2s ease-in-out infinite;
}
:host([loading]) > :nth-child(n) {
  opacity: 0;
}

@keyframes pulse {
  0% {
    filter: opacity(100%);
  }
  50% {
    filter: opacity(60%);
  }
  100% {
    filter: opacity(100%);
  }
}
`,Ce=a`
[ambient^=light] {
  --bbva-panel-info-title-color: initial;
  --bbva-panel-info-text-color: initial;
  --bbva-panel-info-text-highlight-color: initial;
  --bbva-panel-info-skeleton-color: initial;
}
`,we=a`
[ambient^=dark] {
  --bbva-panel-info-title-color: var(--colorsPrimaryCoreLightened, ${r(h.primaryCoreLightened)});
  --bbva-panel-info-text-color: var(--colorsPrimaryCoreLightened, ${r(h.primaryCoreLightened)});
  --bbva-panel-info-text-highlight-color: var(--colorsPrimaryCoreLightened, ${r(h.primaryCoreLightened)});
  --bbva-panel-info-skeleton-color: var(--colorsPrimaryMedium, ${r(h.primaryMedium)});
}
`;const xe={light:a`
    ${l.light}
    ${Ce}
  `,dark:a`
    ${l.dark}
    ${we}
  `};class Te extends(d(p(g(u(e))))){static get is(){return"bbva-panel-info"}static get scopedElements(){return{"bbva-core-heading":b,"bbva-link":m,"bbva-text":v}}static get properties(){return{image:{type:String},imageAltText:{type:String,attribute:"image-alt-text"},microillustration:{type:Object},heading:{type:String},headingLines:{type:Number,attribute:"heading-lines"},text:{type:String},textLines:{type:Number,attribute:"text-lines"},linkText:{type:String,attribute:"link-text"},loading:{type:Boolean,reflect:!0},headingLevelTitle:{type:String,attribute:"heading-level-title",reflect:!0},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom",reflect:!0},isNested:{type:Boolean,attribute:"is-nested"}}}constructor(){super(),this.imageAltText="",this.microillustration=y,this.text="",this.loading=!1,this.headingLevelTitle="h2",this.hidePaddingBottom=!1,this.isNested=!1,this.heading="",this.linkText=""}static get styles(){return[Se,super.styles,f("bbva-panel-info-shared-styles"),xe.light,xe.dark]}get _contentImage(){return this.image?t` <img id="image" src="${this.image}" alt="${this.imageAltText}" /> `:t`
      <span
        class="${_({"empty-state":this._isEmptyState&&!this.isNested})}"
        aria-hidden="true"
        >${this.microillustration}</span
      >
    `}get _isEmptyState(){return this.microillustration===y}render(){return t`
      <div class="image">${this._contentImage}</div>
      <div class="content">
        ${this.heading&&t`
          <bbva-text
            tabindex="0"
            class="title ${_({"not-text":!this.text})}"
            text=${this.t(this.heading)}
            size="L"
            alignment="center"
            tag="${S(this.headingLevelTitle)}"
            ?ellipsis="${!!this.headingLines}"
            .lines="${this.headingLines}"
            inherit
          ></bbva-text>
        `}
        ${this.t(this.text)&&t`
          <bbva-text
            tabindex="0"
            class="description"
            text=${this.t(this.text)}
            size="S"
            alignment="center"
            ?ellipsis="${!!this.textLines}"
            .lines="${this.textLines}"
            inherit
          ></bbva-text>
        `}
        ${t` <slot></slot> `}
        ${this.linkText&&t`
          <bbva-link
            ?disabled=${this.disabled}
            @click="${this._buttonClickHandler}"
            .text="${this.t(this.linkText)}"
          ></bbva-link>
        `}
      </div>
    `}_buttonClickHandler(){this.disabled||this.dispatchEvent(new CustomEvent("panel-info-link-click",{detail:!0,bubbles:!0,composed:!0}))}}x("colors.primaryCoreLightened"),x("colors.primaryCoreLightened"),x("colors.primaryCoreLightened"),x("colors.cool50");const Ee=new E;var $e=a`:host {
  display: block;
  --_veil-bg-color: var(--bbva-help-modal-dark-mode-veil-bg-color, var(--colorsPrimaryCoreDarkened, ${r(h.primaryCoreDarkened)}));
  --bbva-help-modal-safe-area-inset-top: 0;
  --_help-modal-content-bg-color: var(--bbva-help-modal-dark-mode-content-bg-color, var(--bbva-help-modal-content-bg-color, var(--colorsPrimaryCoreLightened, ${r(h.primaryCoreLightened)})));
  --_help-modal-title-icon-color: var(--bbva-help-modal-dark-mode-title-icon-color, var(--bbva-help-modal-title-icon-color, var(--colorsPrimaryCoreDark, ${r(h.primaryCoreDark)})));
  --_help-modal-title-icon-color-warning: var(--bbva-help-modal-dark-mode-title-icon-color-warning, var(--bbva-help-modal-title-icon-color-warning, var(--colorsTertiaryType1Dark, ${r(h.tertiaryType1Dark)})));
  --_help-modal-title-icon-color-info: var(--bbva-help-modal-dark-mode-title-icon-color-info, var(--bbva-help-modal-title-icon-color-info, var(--colorsTertiaryType3Dark, ${r(h.tertiaryType3Dark)})));
  --_help-modal-title-color: var(--bbva-help-modal-dark-mode-title-color, var(--bbva-help-modal-title-color, var(--colorsSecondary600, ${r(h.secondary600)})));
  --_help-modal-content-color: var(--bbva-help-modal-dark-mode-content-color, var(--bbva-help-modal-content-color, var(--colorsSecondary500, ${r(h.secondary500)})));
  --_help-modal-footer-bg-color: var(--bbva-help-modal-dark-mode-footer-bg-color, var(--bbva-help-modal-footer-bg-color, var(--colorsPrimaryCoreLightened, ${r(h.primaryCoreLightened)})));
  --_help-modal-ios-header-bg-color: var(--bbva-help-modal-dark-mode-ios-header-bg-color, var(--bbva-help-modal-ios-header-bg-color, var(--colorsPrimaryCore, ${r(h.primaryCore)})));
  --_help-modal-transition-duration: var(--bbva-help-modal-transition-duration, 0.3s);
  --_help-modal-veil-transition-duration: var(--bbva-help-modal-veil-transition-duration, 0.25s);
  --_help-modal-transition-easing: var(--bbva-help-modal-transition-easing, cubic-bezier(0.2,0,0.1,1));
  --_help-modal-veil-transition-easing: var(--bbva-help-modal-veil-transition-easing, cubic-bezier(0.2,0,0.1,1));
  --_help-modal-full-height-bg-color: var(--bbva-help-modal-dark-mode-full-height-bg-color, var(--bbva-help-modal-full-height-bg-color, var(--colorsPrimaryCoreLightened, ${r(h.primaryCoreLightened)})));
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
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
}

.modal-main {
  display: flex;
  flex-direction: column;
  overflow-y: auto;
  width: 100%;
  height: 100%;
  padding-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(c.spacer)}))) / 16) * 1em);
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
  padding: var(--bbva-help-modal-padding, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${r(c.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(c.spacer)}))) / 16) * 1em) 0);
  align-items: center;
  outline: 0;
}

.modal-title {
  align-items: center;
  display: flex;
  flex-direction: column;
  font-size: var(--bbva-help-modal-title-font-size, var(--typographyTypeMedium, ${r(T.typeMedium)}));
  font-weight: var(--bbva-help-modal-title-font-weight, var(--fontFacePrimaryMediumFontWeight, ${r(n.medium.fontWeight)}));
  line-height: var(--bbva-help-modal-title-line-height, var(--lineHeightTypeMedium, ${r(o.typeMedium)}));
  position: relative;
  outline: 0;
}
.modal-title .title-icon {
  fill: var(--_help-modal-title-icon-color);
  margin-bottom: var(--bbva-help-modal-title-icon-margin-bottom, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(c.spacer)}))) / 16) * 1rem));
}
.modal-title [data-tag-name=bbva-text] {
  width: 18.125rem;
  color: var(--_help-modal-title-color);
}

.slot-footer {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: var(--bbva-help-modal-footer-padding, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${r(c.spacer)}))) / 16) * 1em) 0 0);
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
  font-size: var(--bbva-help-modal-content-font-size, var(--typographyTypeSmall, ${r(T.typeSmall)}));
  line-height: var(--bbva-help-modal-content-line-height, var(--lineHeightTypeSmall, ${r(o.typeSmall)}));
  text-align: center;
  margin: 0 auto;
}
:host(:not([hide-content-padding-top])) .modal-content-wrapper {
  padding-top: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${r(c.spacer)}))) / 16) * 1em);
}

.footer-button:last-child {
  margin-top: var(--bbva-help-modal-footer-last-button-margin-top, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(c.spacer)}))) / 16) * 1rem));
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
  padding-bottom: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${r(c.spacer)}))) / 16) * 1em);
}
:host([fixed-footer]) .transition-container .modal-main {
  padding-bottom: 0;
}

:host([visible]) .veil {
  visibility: visible;
  opacity: var(--_veil-opacity, 0.9);
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
    padding-bottom: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${r(c.spacer)}))) / 16) * 1em);
  }

  .modal-title [data-tag-name=bbva-text] {
    width: 40rem;
  }
}
${Ee.mediaRules()}`;class ke extends(p(u($))){static get is(){return"bbva-help-modal"}static get scopedElements(){return{"bbva-button-default":k,"bbva-icon":R,"bbva-text":v,"bbva-header-main":Z,"bbva-link":m}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},closeModalElements:{type:Array,attribute:"close-modal-elements"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},headerText:{type:String,attribute:"header-text"},headerType:{type:String,attribute:"header-type"},titleIcon:{type:String,attribute:"title-icon"},titleText:{type:String,attribute:"title-text"},descriptionText:{type:String,attribute:"description-text"},bodyText:{type:String,attribute:"body-text"},buttonText:{type:String,attribute:"button-text"},linkText:{type:String,attribute:"link-text"},fixedFooter:{type:Boolean,attribute:"fixed-footer",reflect:!0},stickyFooter:{type:Boolean,attribute:"sticky-footer",reflect:!0},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"},iOSDevices:{type:Array,attribute:"i-o-s-devices"},userAgentRegex:{type:String,attribute:"user-agent-regex"},hideContentPaddingTop:{type:Boolean,attribute:"hide-content-padding-top"},modalType:{type:String,reflect:!0,attribute:"modal-type"},idModal:{type:String,reflect:!0,attribute:"id-modal"},fullHeight:{type:Boolean,attribute:"full-height"}}}constructor(){super(),this.iconLeftPrimary="",this.iconLeftSecondary="",this.iconRightPrimary=O(),this.iconRightSecondary="",this.accessibilityTextIconLeftPrimary="",this.accessibilityTextIconLeftSecondary="",this.accessibilityTextIconRightPrimary="",this.accessibilityTextIconRightSecondary="",this.closeModalElements=["footer-button","footer-link","header-right-primary"],this.headerText="",this.headerType="modal-three-level",this.titleIcon="",this.titleText="",this.descriptionText="",this.bodyText="",this.buttonText="",this.linkText="",this.iOSFixedHeader=!1,this.iOSDevices=["iOS","iPhone"],this.userAgentRegex=/\(([^)]+)\)/,this.hideContentPaddingTop=!1,this.modalType="",this.resetScroll=!0,this.fullHeight=!1}firstUpdated(e){super.firstUpdated&&super.firstUpdated(e),this._modal=this.shadowRoot.querySelector(".help-modal"),this._header=this.shadowRoot.querySelector(".modal-header"),this._content=this.shadowRoot.querySelector(".modal-content-wrapper"),this._footer=this.shadowRoot.querySelector(".modal-footer"),this._container=this.shadowRoot.querySelector(".modal-container"),this._checkHeight()}updated(e){if(super.updated&&super.updated(e),e.has("visible")){let e="close";this.visible&&(e="open"),this.dispatchEvent(new CustomEvent(`help-modal-${e}`,{detail:{status:e},bubbles:!0,composed:!0}))}this._updateAccessibility()}static get styles(){return[super.styles,$e,f("bbva-help-modal-shared-styles"),I.light,l.light]}get _fixedIOSHeader(){return t`
      <div ?hidden="${!this._shouldDisplayFixedHeader()}" class="iOS-fixed-header"></div>
    `}get helpModalHeader(){return this.headerText?t`
          <slot name="slot-header" class="header-slot">
            <bbva-header-main
              data-tag-name="bbva-header-main"
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
              @header-main-icon-right-primary-click="${()=>this._handleClick("header-right-primary")}"
              @header-main-icon-right-secondary-click="${()=>this._handleClick("header-right-secondary",!1)}"
              @header-main-icon-left-primary-click="${()=>this._handleClick("header-left-primary",!1)}"
              @header-main-icon-left-secondary-click="${()=>this._handleClick("header-left-secondary",!1)}"
            ></bbva-header-main>
          </slot>
        `:""}get helpModalContent(){return t`
      <div id="helpModalContent" class="modal-content">
        <span class="slot-content-header"><slot name="slot-content-header"></slot></span>
        <div class="slot-content">
          ${this.descriptionText?t`<bbva-text
                id="description-text"
                .text=${this.descriptionText}
                ?hidden="${!this.descriptionText}"
                alignment="center"
                size="S"
                ellipsis
                lines="3"
                unset
              >
              </bbva-text>`:t`<slot name="slot-content"><div>${this.bodyText}</div></slot>`}
        </div>
      </div>
    `}get _veilTpl(){return this.fullHeight?"":t`
        <div class="veil" @keyup="${this._keyupEvent}" @click="${this._onVeilClick}"></div>
      `}get helpModalFooter(){return t`
      <div class="modal-footer">
        <slot name="slot-footer">
          <div class="slot-footer" ?hidden="${!this.buttonText&&!this.linkText}">
            <bbva-button-default
              ambient="light"
              class="footer-button"
              data-tag-name="bbva-button-default"
              ?hidden="${!this.buttonText}"
              @click="${()=>this._handleClick("footer-button")}"
              >${this.buttonText}</bbva-button-default
            >
            ${this.linkText?t`<bbva-link
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
    `}get helpModalTitle(){return t`
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
          ${this.titleText?t` <bbva-text
                id="title-text"
                .text=${this.titleText}
                ?hidden="${!this.titleText}"
                alignment="center"
                ellipsis
                unset
                font-weight="500"
                tag="h2"
              >
              </bbva-text>`:null}
        </slot>
      </div>
    `}_updateAccessibility(){!this.getAttribute("aria-label")&&this.titleText&&this.setAttribute("aria-label",this.titleText)}_checkHeight(){this._container.offsetHeight>=this._content.offsetHeight?this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","none"):this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","0 0 4px 0 rgba(18, 18, 18, .3)")}_setFooterShadow(e){e.currentTarget.scrollTop>=this._header.offsetHeight+this._content.offsetHeight+this._footer.offsetHeight-this._modal.offsetHeight?this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","none"):this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","0 0 4px 0 rgba(18, 18, 18, .3)")}_handleClick(e){this.dispatchEvent(new CustomEvent(`help-modal-${e}-click`,{detail:!0,bubbles:!0,composed:!0})),this.closeModalElements.includes(e)&&this.close()}_onVeilClick(){super._onVeilClick&&super._onVeilClick(),this._handleClick("veil")}_shouldDisplayFixedHeader(){const e=window.navigator.userAgent.match(this.userAgentRegex)[1].split(";");return this.iOSFixedHeader&&this.iOSDevices.includes(e[0])}get _modalContent(){return t`
      ${this._fixedIOSHeader}
      <section
        class="transition-container ${_({"half-height":!this.fullHeight})}"
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
    `}}x("colors.cool100"),x("colors.cool60"),x("colors.primarySubduedLight"),x("colors.tertiaryType1Light"),x("colors.tertiaryType3Light"),x("colors.primaryCoreLightened"),x("colors.cool20"),x("colors.cool60"),x("colors.cool60"),x("colors.cool100");class Re extends(s(e)){static get is(){return"bbva-dataprovider-purecloud"}constructor(){super(),this.version="0",this.requiredToken="tsec",this.native=!1,this.headers={},this.timeout=120,this.htmlContext=this}createConversation(e){const t=this._getServiceParams(this.params,e),i=Re._servicePurecloudConversationsPostV0(t);this._generateGetService(i,{customEvent:"create-conversation-success",errorFireEventHandler:"create-conversation-error"})}listParticipants(e){const t=this._getServiceParams(this.params,e),i=Re._servicePurecloudConversationsConversationParticipantsGetV0(t);this._generateGetService(i,{customEvent:"list-participants-success",errorFireEventHandler:"list-participants-error"})}modifyParticipants(e){const t=this._getServiceParams(this.params,e),i=Re._servicePureCloudConversationsConversationParticipantsParticipantPatchV0(t);this._generateGetService(i,{customEvent:"modify-participants-success",errorFireEventHandler:"modify-participants-error"})}static _servicePurecloudConversationsPostV0(e){return new ae(e)}static _servicePurecloudConversationsConversationParticipantsGetV0(e){return new re(e)}static _servicePureCloudConversationsConversationParticipantsParticipantPatchV0(e){return new oe(e)}}var Oe=a`:host {
  display: block;
  box-sizing: border-box;
  height: 100%;
  --bbva-chat-form-gradient-color: var(--colorsPrimaryCoreLightened, ${r(h.primaryCoreLightened)});
  --bbva-amount-font-weight: var(--fontWeightOptionsFontWeight50, ${r(N.fontWeight50)});
  --bbva-amount-currency-font-size: var(--fontSizeOptionsFontSize60, ${r(D.fontSize60)});
  --bbva-amount-currency-line-height: var(--lineHeightTypeQuote, ${r(o.typeQuote)});
  --bbva-amount-color: var(--colorsPrimaryCoreLightened, ${r(h.primaryCoreLightened)});
  --num-product-font-weight-normal: 350;
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

.bbva-chat-text--received {
  --_chat-text-bg-color: var(--colorsPrimaryCore, ${r(h.primaryCore)});
}

.container {
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(c.spacer)}))) / 16) * 1rem) calc(((0 * var(--gridSpacerVariant, var(--gridSpacer, ${r(c.spacer)}))) / 16) * 1rem);
  color: none;
}
.container__chat {
  width: 100%;
  height: 90vh;
  overflow-y: scroll;
  padding: calc(((0 * var(--gridSpacerVariant, var(--gridSpacer, ${r(c.spacer)}))) / 16) * 1rem) calc(((0 * var(--gridSpacerVariant, var(--gridSpacer, ${r(c.spacer)}))) / 16) * 1rem) calc(((12.5 * var(--gridSpacerVariant, var(--gridSpacer, ${r(c.spacer)}))) / 16) * 1rem) calc(((0 * var(--gridSpacerVariant, var(--gridSpacer, ${r(c.spacer)}))) / 16) * 1rem);
}

.header {
  position: fixed;
  top: 0px;
  width: 100%;
}

.footer__form, .footer__toast {
  position: fixed;
  bottom: 0px;
  width: 100%;
}
.footer__form {
  background-color: var(--bbva-white, #ffffff);
}
.footer__form--component {
  width: 100%;
  position: sticky;
  top: 36rem;
}

.supportChatSpinner {
  position: inherit;
}

.header-front {
  z-index: 99;
}

.card-container {
  height: 5rem;
  padding: 1rem 1rem 0rem 0rem;
  width: 100%;
  display: flex;
}

.left-column {
  width: 50%;
}
.left-column .product-alias {
  color: var(--colorsPrimarySubdued, ${r(h.primarySubdued)});
  font-weight: var(--fontWeightOptionsFontWeight40, ${r(N.fontWeight40)});
  font-size: var(--fontSizeOptionsFontSize60, ${r(D.fontSize60)});
}

.right-column {
  width: 50%;
  display: flex;
  flex-direction: column;
  align-items: flex-end;
}
.right-column .amount-description {
  text-align: right;
  color: var(--colorsPrimaryCoreLightened, ${r(h.primaryCoreLightened)});
  font-size: var(--fontSizeOptionsFontSize50, ${r(D.fontSize50)});
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
  display: block;
  width: 100%;
}

.card-num {
  display: flex;
  align-items: center;
}
.card-num .num-product {
  margin-left: 0.5rem;
  font-weight: var(--num-product-font-weight-normal);
  font-style: var(--fontStyleOptionsFontStyle20, ${r(H.fontStyle20)});
  font-size: var(--fontSizeOptionsFontSize40, ${r(D.fontSize40)});
}

.num-product {
  font-weight: var(--num-product-font-weight-normal);
  font-style: var(--fontStyleOptionsFontStyle20, ${r(H.fontStyle20)});
}

.card-list > [data-tag-name=bbva-divider]:last-of-type {
  display: none;
}
`;class Ie extends(u(d(p(e)))){static get is(){return"bbva-widget-chat"}static get scopedElements(){return{"bbva-global-single-sign-on-api-dm":X,"bbva-dataprovider-genesys-external-service":ce,"bbva-dataprovider-purecloud":Re,"bbva-dataprovider-contact-center":_e,"bbva-chat-text":Q,"bbva-notification-help":M,"bbva-notification-toast":L,"bbva-chat-form":Y,"bbva-help-modal":ke,"bbva-panel-offer":q,"bbva-panel-info":Te,"bbva-list-bullet":j,"bbva-panel-button-fixed":te,"bbva-progress-content":F,"bbva-text":v,"bbva-amount":B,"bbva-clip-card":V,"bbva-divider":U,"bbva-header-main":Z,"bbva-list-card":ie,"bbva-form-rating":se}}static get properties(){return{host:{type:String,attribute:!1},nativeGenesys:{type:Boolean,attribute:!1},native:{type:Boolean,attribute:!1},hostASO:{type:String,attribute:!1},path:{type:String,attribute:!1},eventStreamUri:{type:String,attribute:!1},conversationId:{type:String,attribute:!1},jwtChat:{type:String,attribute:!1},organizationId:{type:String,attribute:"organization-id"},deploymentId:{type:String,attribute:"deployment-id"},targetType:{type:String,attribute:"target-type"},targetAddress:{type:String,attribute:"target-address"},displayName:{type:String,attribute:"display-name"},message:{type:String,attribute:!1},conversationMessages:{type:Array,attribute:!1},typing:{type:Boolean,attribute:!1},genesysDm:{type:Object,attribute:!1},idCustomer:{type:String,attribute:!1},isLocalStorageActive:{type:Boolean,attribute:!1},idAdvisor:{type:String,attribute:!1},idWorkflow:{type:String,attribute:!1},idAcd:{type:String,attribute:!1},containerChat:{type:Object,attribute:!1},stateToast:{type:Boolean,attribute:!1},stateForm:{type:Boolean,attribute:!1},online:{type:Boolean,attribute:!1},closeStatus:{type:Boolean,attribute:!1},controlModal:{type:Boolean,attribute:!1},controlStatus:{type:Boolean,attribute:!1},messageWorkflow:{type:Object,attribute:!1},urlFeedback:{type:String},timeToast:{type:Number},messageToast:{type:String},messageConnectedAdvisor:{type:String},messageEndingConversation:{type:String},messageConversationResults:{type:String},messageTitleError:{type:String},messageBodyError:{type:String},messageButtonError:{type:String},messageChatForm:{type:String},messageButtonCancel:{type:String},messageButtonAccept:{type:String},messageTextClose:{type:String},reconnection:{type:Boolean},isSupportCenterChat:{type:Boolean},showNotificationHelp:{type:Boolean},showMiddleSpinner:{type:Boolean},showPanelChat:{type:Boolean},disableChatForm:{type:Boolean},enableVoiceToTextIcon:{type:Boolean},singleSignOnBody:{type:String},singleSignOnApiVersion:{type:Number},purecloudApiVersion:{type:Number},contactCenterApiVersion:{type:Number},singleSignOnDm:{type:Object,attribute:!1},purecloudDm:{type:Object,attribute:!1},fullProgressContent:{type:Boolean,attribute:!1},agentId:{type:String,attribute:!1},customerId:{type:String,attribute:!1},memberAuthToken:{type:String,attribute:!1},pkcs7:{type:String,attribute:!1},agentDisconnected:{type:Boolean,attribute:!1},agentName:{type:String,attribute:!1},customerName:{type:String,attribute:!1},bbvaLinePhone:{type:String,attribute:!1},isChatOutOfService:{type:Boolean,attribute:!1},showPrivacyHelp:{type:Boolean,attribute:!1},minTime:{type:Number,attribute:!1},maxTime:{type:Number,attribute:!1},customerCache:{type:Object,attribute:!1},showOnboarding:{type:Boolean,attribute:!1},currentMessageInput:{type:String,attribute:!1},chatCreated:{type:Boolean,attribute:!1},_talking:{type:Boolean},journeyId:{type:String,attribute:!1},cardObject:{type:Object,attribute:!1},tdcId:{type:Object,attribute:!1},cardImageUrl:{type:String,attribute:!1},ratingText:{type:String,attribute:!1},statusTypeFeedback:{type:String,attribute:!1},showFeedbackToast:{type:Boolean,attribute:!1},shouldShowFeedback:{type:Boolean,attribute:!1},chatInForeground:{type:Boolean,attribute:!1},microillustration:{type:String,attribute:!1}}}constructor(){super(),this.host="https://api.mypurecloud.com",this.native=!1,this.nativeGenesys=!1,this.hostASO="",this.path="api/v2/webchat/guest/conversations",this.message="",this.eventStreamUri="",this.conversationId="",this.jwtChat="",this.idCustomer="",this.isLocalStorageActive=!1,this.conversationMessages=[],this.typing=!1,this.genesysDm={},this.idAdvisor="",this.idWorkflow="",this.idAcd="",this.containerChat={},this.stateToast=!1,this.stateForm=!1,this.online=!1,this.closeStatus=!0,this.controlModal=!1,this.controlStatus=!0,this.messageWorkflow={},this.urlFeedback="",this.timeToast=2e3,this.messageToast="bbva-widget-chat-message-toast",this.messageConnectedAdvisor="bbva-widget-chat-message-connected-advisor",this.messageEndingConversation="bbva-widget-chat-message-ending-conversation",this.messageConversationResults="bbva-widget-chat-message-conversation-results",this.messageTitleError="bbva-widget-chat-message-title-error",this.messageBodyError="bbva-widget-chat-message-body-error",this.messageButtonError="bbva-widget-chat-message-button-error",this.messageChatForm="bbva-widget-chat-message-chat-form",this.messageButtonCancel="bbva-widget-chat-message-button-cancel",this.messageButtonAccept="bbva-widget-chat-message-button-accept",this.messageTextClose="bbva-widget-chat-message-text-close",this.reconnection=!1,this.enableVoiceToTextIcon=!1,this.isSupportCenterChat=!1,this.showNotificationHelp=!1,this.showMiddleSpinner=!1,this.showPanelChat=!1,this.disableChatForm=!1,this.singleSignOnBody={aapTarget:"10000228"},this.createConversationBody={},this.singleSignOnApiVersion=0,this.purecloudApiVersion=0,this.singleSignOnDm={},this.purecloudDm={},this.fullProgressContent=!1,this.agentId="",this.customerId="",this.pkcs7="",this.agentDisconnected=!1,this.agentName="",this.customerName="",this.bbvaLinePhone="",this.isChatOutOfService=!1,this.showPrivacyHelp=!1,this.minTime=0,this.maxTime=0,this.customerCache={},this.showOnboarding=!1,this.currentMessageInput="",this.contactCenterApiVersion=0,this.chatCreated=!1,this._talking=!1,this.language="es-MX",this.journeyId="",this.cardObject={},this.tdcId={TE:"https://cardcovers.caasbbva.com/mexico/410180-TE.png.imgcaas.w320.png",PN:"https://cardcovers.caasbbva.com/mexico/477210-PN.png.imgcaas.w320.png",AG:"https://cardcovers.caasbbva.com/mexico/477211-AG.png.imgcaas.w320.png",AV:"https://cardcovers.caasbbva.com/mexico/477213-AV.png.imgcaas.w320.png",AP:"https://cardcovers.caasbbva.com/mexico/477214-AP.png.imgcaas.w320.png",AC:"https://cardcovers.caasbbva.com/mexico/477291-AC.png.imgcaas.w320.png",AR:"https://cardcovers.caasbbva.com/mexico/477292-AR.png.imgcaas.w320.png",UM:"https://cardcovers.caasbbva.com/mexico/554629-UM.png.imgcaas.w320.png",XA:"https://cardcovers.caasbbva.com/mexico/542015-XA.png.imgcaas.w320.png",V4:"https://cardcovers.caasbbva.com/mexico/481514-DW-455504.png.imgcaas.w320.png"},this.cardImageUrl="https://cardcovers.caasbbva.com/mexico/415231-VD.png.imgcaas.w320.png",this.ratingText="",this.statusTypeFeedback="default",this.showFeedbackToast=!1,this.shouldShowFeedback=!1,this.chatInForeground=!1,this.microillustration="bbvamanagers"}static get styles(){return[Oe,f("bbva-widget-chat-shared-styles")]}updated(e){if(super.updated(e),this.agentDisconnected){const e=this.shadowRoot.querySelector(".feedback").shadowRoot.querySelector("#text");e&&e.setAttribute("type",this.statusTypeFeedback)}}firstUpdated(){this.genesysDm=this.renderRoot.querySelector(".genesysDm"),this.singleSignOnDm=this.renderRoot.querySelector("#apiSSO"),this.contactCenterDm=this.renderRoot.querySelector("#apiContactCenter"),this.purecloudDm=this.renderRoot.querySelector("#apiPurecloud")}checkSupportService(){if(this.isChatOutOfService){const e={code:"SUPPORT-CENTER-CHAT-OUT-OF-SERVICE",selectedConfig:{className:"full-height-error",hideCloseIcon:!1,openMaximized:!0,title:this.t("bbva-widget-chat-panel-title"),heroImage:"./images/Clock_funds.svg",message:this.t("bbva-widget-chat-support-center-out-of-servive"),acceptBtLabel:this.t("bbva-widget-chat-message-button-accept"),template:{type:"paragraphs",values:[{text:this.t("bbva-widget-chat-support-center-schedule")}]}}};this._fireEvent("show-modal",e),this._fireEvent("chat-out-of-service",!0)}}init(){this.isChatOutOfService?(this.isChatOutOfService=!0,this.showOnboarding=!1):(this.isChatOutOfService=!1,this.showOnboarding=!0),this.checkSupportService()}initChat(){var e;(this._fireEvent("init-support-center-chat",!0),this.isChatOutOfService)||(this.closeChat(),this.fullProgressContent=!0,this.showOnboarding=!1,null===(e=this.contactCenterDm)||void 0===e||e.registerTraceability({}))}setJourneyId(e){this.journeyId=e}_successRegisterTraceability(){var e;null===(e=this.singleSignOnDm)||void 0===e||e.postSingleSignOn(this.singleSignOnBody)}setFinancialOverviewData(e){var t;const i=e.value.find((e=>"cards"===e.id)),s=null==i||null===(t=i.data[0])||void 0===t?void 0:t.products;this.cardObject=s.map((e=>{var t,i,s,a,r,o,n,h;return{alias:this._formatAlias(e.product.name),numProduct:null==e||null===(t=e.description)||void 0===t?void 0:t.value,amount:null==e||null===(i=e.detail)||void 0===i||null===(s=i.specificAmounts)||void 0===s||null===(a=s.find((e=>"CURRENT_BALANCE"===e.id)))||void 0===a||null===(r=a.amounts)||void 0===r||null===(o=r[0])||void 0===o?void 0:o.amount,productType:null==e||null===(n=e.product)||void 0===n?void 0:n.id,productName:null==e||null===(h=e.product)||void 0===h?void 0:h.name}}))}_formatAlias(e){return e.split(" ").map(((e,t)=>"BBVA"===e||"UNAM"===e||"IPN"===e?e:0===t?e.charAt(0).toUpperCase()+e.slice(1).toLowerCase():e.toLowerCase())).join(" ")}_onAppResume(e){e&&(this.conversationMessages=[],this.recoverMessages(),this.wS&&(this.wS.removeEventListener("open",this._handleWebSocketOpen),this.wS.removeEventListener("message",this._handleWebSocketMessage),this.wS.close()),this.connectWebSocket(this.eventStreamUri))}getCustomerName(e){if(e.value||e.customer){var t;const i=(null===(t=e.value)||void 0===t?void 0:t.customer.firstName)??e.customer.firstName;this.clientName=i.toLowerCase(),this.clientName=this.clientName.charAt(0).toUpperCase()+this.clientName.slice(1)}else this.clientName=e.firstName}checkVisibility(e){if(this.chatInForeground=e.isVisible,!this.chatInForeground){const e={enable:!1,id:2};this._fireEvent("set-push-notification",e)}this.chatInForeground&&this.chatCreated&&this._onAppResume(!0)}sendMessageSuccess(e){e&&this.updateScroll(),this._fireEvent("support-center-chat-message-sent",!0)}bbvaPanelOffer(){return t`
    <bbva-panel-offer content-title="${this.t("bbva-widget-chat-panel-title")}" microillustration="${this.microillustration}">
      <p>${this.t("bbva-widget-chat-panel-text")}</p>
    </bbva-panel-offer>
    `}bbvaNotificationHelp(){return t`
    <bbva-notification-help
    accessibility-label-icon="Info"
    icon=${z()}
    text="${this.t("bbva-widget-chat-notification-help-text")}"
    ></bbva-notification-help>
    `}bbvaPrivacyMessage(){return t`
    <bbva-notification-help
      accessibility-label-icon="Info"
      icon=${z()}
      text=${this.t("bbva-widget-chat-support-center-privacy-message")}
    ></bbva-notification-help>
    `}bbvaHeaderMain(){return t`
    <bbva-header-main
      class='header-front'
      variant='modal'
      text=${this.t("bbva-widget-chat-panel-title")}
      icon-right-primary=${O()}
      accessibility-text-icon-right-primary="Close"
      @header-main-icon-right-primary-click=${this.closeChatModal}
    ></bbva-header-main>
    `}BbvaProgressContentWaiting(){const e=this.t("bbva-widget-chat-support-center-wait-time-message",{minTime:this.minTime.toString(),maxTime:this.maxTime.toString()});return t`
    <bbva-progress-content
      show-spinner-message-label=""
      visible=${this.waitForAgent}
      spinner-message-label="
        &lt;p style='text-align:center; font-weight:bold;'&gt;${e}&lt;/p&gt;
        &lt;p style='text-align:center;'&gt;${this.t("bbva-widget-chat-support-center-stand-by-message")}&lt;/p&gt;&lt;br&gt;
      ">
    </bbva-progress-content>
    `}BbvaProgressContentFull(){return t`
      <bbva-progress-content
        show-spinner-message-label=""
        visible="${this.fullProgressContent}"
        spinner-message-label="
          &lt;p style='text-align:center; font-weight:bold;'&gt;${this.t("bbva-widget-chat-panel-title")}&lt;/p&gt;
          &lt;p style='text-align:center;'&gt;${this.t("bbva-widget-chat-support-center-connecting-agent")}&lt;/p&gt;&lt;br&gt;
          ">
      </bbva-progress-content>
      <p></p>
      `}_handleCardClick(e){const t=this.cardObject[e],{productName:i}=t,s=this.t("bbva-widget-chat-support-center-card-click",{productName:i.toLowerCase()});this._fireEvent("support-center-chat-card-click",s),this._sendCardMessage(t)}_sendCardMessage(e){var t;const i={detail:`${null==e?void 0:e.alias} •${null==e||null===(t=e.numProduct)||void 0===t?void 0:t.slice(-4)}`};this.chatFormSendClick(i)}showCardBasic(e,i,s,a,r){const o=null==i?void 0:i.slice(-4);let n;return a in this.tdcId?(this.cardImageUrl=this.tdcId[a],n=!0):this.cardImageUrl="https://cardcovers.caasbbva.com/mexico/415231-VD.png.imgcaas.w320.png",t`
      <div
        class='card-container'
        card-id=${r}
        @click="${()=>this._handleCardClick(r)}"
        @keydown="${e=>this._handleKeydown(e,r)}">
        <div class="left-column">
          <span class='product-alias'>
            ${e}
          </span>
          <div class="card-num">
            <bbva-clip-card
              size="xsmall"
              card-image="${this.cardImageUrl}">
            </bbva-clip-card>
            <span class='num-product'>
              • ${o}
            </span>
          </div>
        </div>
        <div class="right-column">
          ${n?t`<bbva-amount
            amount=${s}
            currency-code="MXN"
            local-currency="MXN"
            language="es-MX">
          </bbva-amount>`:""}
          <span class='amount-description'>
            ${n?this.t("bbva-widget-chat-support-center-available-balance"):""}
          </span>
        </div>
      </div>
        <bbva-divider></bbva-divider>
    `}_handleKeydown(e,t){"Enter"!==e.key&&" "!==e.key||(this._handleCardClick(t),e.preventDefault())}initSupportCenterChat(){this.conversationMessages=[],this.chatCreated&&(this.isLocalStorageActive=!0,this.closeChat(),this.requestUpdate()),this.createConversationBody={context:{conversationRouteId:this.journeyId},routingTarget:{targetType:"QUEUE",targetAddress:"CHAT_ASESOR"},participants:[{displayName:this.clientName}]},this.purecloudDm.createConversation(this.createConversationBody)}bbvaGenesysDm(){return t`
      <bbva-dataprovider-genesys-external-service
        class="genesysDm"
        ?createsChat=${this.controlModal}
        host=${this.host}
        ?native=${this.nativeGenesys}
        organizationId=${this.organizationId}
        deploymentId=${this.deploymentId}
        targetType=${this.targetType}
        targetAddress=${this.targetAddress}
        displayName=${this.displayName}
        memberAuthToken=${this.memberAuthToken}
        @create-chat-success=${this.createChatSuccess}
        @create-chat-error=${this.createChatError}
        @send-message-success=${this.sendMessageSuccess}
        @send-message-error=${this.sendMessageError}
        @get-member-success=${this.getMemberSuccess}
        @recover-messages-success=${this.recoverMessagesSuccess}
        @recover-messages-error=${this.recoverMessagesError}
        @update-notice=${this.updateNotice}
        @get-members-success=${this._getMembersSuccess}
        @get-members-error=${this.getMembersError}
        @delete-member-success=${this._deleteMemberSuccess}
        @delete-member-error=${this.deleteMemberError}
      ></bbva-dataprovider-genesys-external-service>
    `}bbvaContactCenterDm(){return t`
      <bbva-dataprovider-contact-center
        id="apiContactCenter"
        .host="${this.hostASO}"
        .headers="${this.headers}"
        .version="${this.contactCenterApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @register-traceability-success=${this._successRegisterTraceability}
        @register-traceability-error=${this._errorRegisterTraceability}
      ></bbva-dataprovider-contact-center>
    `}bbvaSingleSignOnDm(){return t`
      <bbva-global-single-sign-on-api-dm
        id="apiSSO"
        .host="${this.hostASO}"
        .headers="${this.headers}"
        .version="${this.singleSignOnApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @single-sign-on-api-dm-create=${this._successCreateSSO}
        @single-sign-on-api-dm-create-error=${this._errorCreateSSO}
        @api-dm-response-error=${this._errorCreateSSO}
      ></bbva-global-single-sign-on-api-dm>
    `}_successCreateSSO(e){var t;this.stateForm=!0,this.enableVoiceToTextIcon=!0,this.disableChatForm=!0,this.pkcs7=null==e||null===(t=e.detail)||void 0===t?void 0:t.pkcs7,this.searchLocalStorage("support_center_chat"),this.initSupportCenterChat()}_errorCreateSSO(){this._fireEvent("send-retry-error",{retryErrorData:{errorId:"create-sso-error",errorType:"operative",assistancePhone:this.bbvaLinePhone,retryConfig:{fullModal:!0,acceptBtLabel:this.t("bbva-widget-chat-support-center-retry"),cancelBtLabel:this.t("bbva-widget-chat-support-center-exit"),header:this.t("bbva-widget-chat-support-center-error"),title:this.t("bbva-widget-chat-support-center-error-sso-title"),message:this.t("bbva-widget-chat-support-center-error-sso-description")},callConfig:{fullModal:!0,acceptBtLabel:this.t("bbva-widget-chat-support-center-error-sso-init-call"),cancelBtLabel:this.t("bbva-widget-chat-support-center-exit"),header:this.t("bbva-widget-chat-support-center-error"),title:this.t("bbva-widget-chat-support-center-error-sso-title-call"),message:this.t("bbva-widget-chat-support-center-error-sso-description-call")}}})}_errorRegisterTraceability(){this._fireEvent("send-retry-error",{retryErrorData:{errorId:"register-traceability-error",errorType:"operative",assistancePhone:this.bbvaLinePhone,retryConfig:{fullModal:!0,acceptBtLabel:this.t("bbva-widget-chat-support-center-retry"),cancelBtLabel:this.t("bbva-widget-chat-support-center-exit"),header:this.t("bbva-widget-chat-support-center-error"),title:this.t("bbva-widget-chat-support-center-error-sso-title"),message:this.t("bbva-widget-chat-support-center-error-sso-description")},callConfig:{fullModal:!0,acceptBtLabel:this.t("bbva-widget-chat-support-center-error-sso-init-call"),cancelBtLabel:this.t("bbva-widget-chat-support-center-exit"),header:this.t("bbva-widget-chat-support-center-error"),title:this.t("bbva-widget-chat-support-center-error-sso-title-call"),message:this.t("bbva-widget-chat-support-center-error-sso-description-call")}}})}handleCall(){this._fireEvent("call-bbva",{value:this.bbvaLinePhone})}handleExit(){this.clearAll(),this.closeChat(),this._fireEvent("leave-support-center-chat",!0),this._fireEvent("support-center-chat-inactive",!1)}bbvaPurecloudDm(){return t`
      <bbva-dataprovider-purecloud
        id="apiPurecloud"
        .host="${this.hostASO}"
        .headers="${this.headers}"
        .version="${this.purecloudApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @create-conversation-success=${this._successCreateConversation}
        @create-conversation-error=${this._errorCreateConversation}
        @list-participants-success=${this._successListParticipants}
        @list-participants-error=${this._errorListParticipants}
        @modify-participants-success=${this._successModifyingParticipants}
        @modify-participants-error=${this._errorModifyingParticipants}
      ></bbva-dataprovider-purecloud>
    `}_successListParticipants(e){const t=(null==e?void 0:e.detail).find((e=>"customer"===e.role)).id;this._modifyParticipants(t)}_errorListParticipants(){this._fireEvent("send-retry-error",{retryErrorData:{errorId:"list-participants-error",errorType:"operative",assistancePhone:this.bbvaLinePhone,retryConfig:{fullModal:!0,acceptBtLabel:this.t("bbva-widget-chat-support-center-retry"),cancelBtLabel:this.t("bbva-widget-chat-support-center-exit"),header:this.t("bbva-widget-chat-support-center-error"),title:this.t("bbva-widget-chat-support-center-error-sso-title"),message:this.t("bbva-widget-chat-support-center-error-sso-description")},callConfig:{fullModal:!0,acceptBtLabel:this.t("bbva-widget-chat-support-center-error-sso-init-call"),cancelBtLabel:this.t("bbva-widget-chat-support-center-exit"),header:this.t("bbva-widget-chat-support-center-error"),title:this.t("bbva-widget-chat-support-center-error-sso-title-call"),message:this.t("bbva-widget-chat-support-center-error-sso-description-call")}}})}_listParticipants(){var e;this.purecloudDm.params={"conversation-id":this.conversationId},null===(e=this.purecloudDm)||void 0===e||e.listParticipants()}_modifyParticipants(e){var t;this.purecloudDm.params={"conversation-id":this.conversationId,"participant-id":e};const i={customFields:[{id:"pkcs7",value:this.pkcs7}],phoneCallClassification:{id:"CHAT",description:"Chat asesor"}};null===(t=this.purecloudDm)||void 0===t||t.modifyParticipants(i)}_successModifyingParticipants(){this.saveLocalStorage("support_center_chat",{conversationId:this.conversationId,customerId:this.customerId,jwtChat:this.jwtChat,isChatActive:!0})}_errorModifyingParticipants(){this._fireEvent("send-retry-error",{retryErrorData:{errorId:"modify-participants-error",errorType:"operative",assistancePhone:this.bbvaLinePhone,retryConfig:{fullModal:!0,acceptBtLabel:this.t("bbva-widget-chat-support-center-retry"),cancelBtLabel:this.t("bbva-widget-chat-support-center-exit"),header:this.t("bbva-widget-chat-support-center-error"),title:this.t("bbva-widget-chat-support-center-error-sso-title"),message:this.t("bbva-widget-chat-support-center-error-sso-description")},callConfig:{fullModal:!0,acceptBtLabel:this.t("bbva-widget-chat-support-center-error-sso-init-call"),cancelBtLabel:this.t("bbva-widget-chat-support-center-exit"),header:this.t("bbva-widget-chat-support-center-error"),title:this.t("bbva-widget-chat-support-center-error-sso-title-call"),message:this.t("bbva-widget-chat-support-center-error-sso-description-call")}}})}connectWebSocket(e){this.wS=this.socket(e),this._handleWebSocketOpen=()=>{this._listParticipants()},this._handleWebSocketMessage=e=>{const t=JSON.parse(e.data);this._parseSocketData(t)},this.wS.addEventListener("open",this._handleWebSocketOpen),this.wS.addEventListener("message",this._handleWebSocketMessage)}_parseSocketData(e){var t,i,s,a;let r;const o=null==e||null===(t=e.eventBody)||void 0===t?void 0:t.bodyType,n=!(null==e||null===(i=e.eventBody)||void 0===i||!i.sender),h=n?null==e||null===(s=e.eventBody)||void 0===s||null===(a=s.sender)||void 0===a?void 0:a.id:"";if(e&&e.eventBody&&e.eventBody.body&&(r=e.eventBody.body),"notice"===o){var c;const t=null==e||null===(c=e.eventBody)||void 0===c?void 0:c.body,i=t.match(/\((.*)\)/)?t.match(/\((.*)\)/).pop():"";if(this.minTime=parseInt(i.split(",")[0],10),this.maxTime=parseInt(i.split(",")[1],10),this.minTime>1&&(this.fullProgressContent=!1,this.waitForAgent=!0,this._fireEvent("support-center-chat-waiting-agent",!0)),t.includes("E001")){const e={code:"SUPPORT-CENTER-CHAT-INVALID-SESSION",selectedConfig:{className:"full-height-error",hideCloseIcon:!1,openMaximized:!0,title:this.t("bbva-widget-chat-support-center-error"),heroImage:"./images/errors/error.svg",message:this.t("bbva-widget-chat-support-center-error-session-message"),acceptBtLabel:this.t("bbva-widget-chat-support-center-error-sso-init-call"),cancelBtLabel:this.t("bbva-widget-chat-support-center-exit"),template:{type:"paragraphs",values:[{text:this.t("bbva-widget-chat-support-center-error-session-description")}]}}};this._fireEvent("support-center-chat-error-creating-session",!0),this._fireEvent("show-modal",e)}}if("member-join"===o&&(this.genesysDm.jwt=this.jwtChat,this.genesysDm.getHeaders(),this.genesysDm.getMembers(this.conversationId),this.agentId&&(this.fullProgressContent=!1,this.waitForAgent=!1)),n&&h===this.customerId&&"member-leave"===o&&(this.agentDisconnected=!0,this.disableChatForm=!0,this.showNotificationHelp=!0,this.stateForm=!1,this._fireEvent("support-center-chat-ended",!0),this._fireEvent("support-center-chat-inactive",!1)),n&&h===this.agentId&&"typing-indicator"===e.metadata.type?(this.typing=!0,this.updateScroll()):this.typing=!1,n&&h===this.agentId&&""!==e.eventBody.body&&void 0!==e.eventBody.body){if(!this.conversationMessages.some((t=>t.message===e.eventBody.body&&"received"===t.type))){const t={message:e.eventBody.body,hour:(new Date).toISOString(),type:"received",showCards:r.includes("##ConfirmarTarjeta##")};this.conversationMessages=[...this.conversationMessages,t],this.updateScroll()}}}_successCreateConversation(e){this.chatCreated=!0,this.waitForAgent=!1,this.stateForm=!1,this.enableVoiceToTextIcon=!1,this.showMiddleSpinner=!1;const t=e.detail;this.eventStreamUri=t.eventStreamUri,this.conversationId=t.id,this.jwtChat=t.token,this.idCustomer=t.participants[0].id,this.connectWebSocket(this.eventStreamUri),this.stateForm=!0,this.stateToast=!0,this.enableVoiceToTextIcon=!0,this.showPanelChat=!0,this.disableChatForm=!1,this.setPushNotification()}setPushNotification(){const e={enable:!0,id:2,timer:1e4,notification:{id:12,title:"Plugin Reminder Notification!!",smallIcon:"ic_stat_name",channelID:"test",channelName:"test",largeIcon:"cells_icon",bigPicture:"pic_login_02",autoCancel:!0}};this._fireEvent("set-push-notification",e)}_errorCreateConversation(){this._fireEvent("send-retry-error",{retryErrorData:{errorId:"create-conversation-error",errorType:"operative",assistancePhone:this.bbvaLinePhone,retryConfig:{fullModal:!0,acceptBtLabel:this.t("bbva-widget-chat-support-center-retry"),cancelBtLabel:this.t("bbva-widget-chat-support-center-exit"),header:this.t("bbva-widget-chat-support-center-error"),title:this.t("bbva-widget-chat-support-center-error-sso-title"),message:this.t("bbva-widget-chat-support-center-error-sso-description")},callConfig:{fullModal:!0,acceptBtLabel:this.t("bbva-widget-chat-support-center-error-sso-init-call"),cancelBtLabel:this.t("bbva-widget-chat-support-center-exit"),header:this.t("bbva-widget-chat-support-center-error"),title:this.t("bbva-widget-chat-support-center-error-sso-title-call"),message:this.t("bbva-widget-chat-support-center-error-sso-description-call")}}})}_getMembersSuccess(e){var t,i;const s=null==e||null===(t=e.detail)||void 0===t||null===(i=t.detail)||void 0===i?void 0:i.entities,a=s.find((e=>"AGENT"===e.role&&"CONNECTED"===e.state)),r=s.find((e=>"CUSTOMER"===e.role));this.agentId=a&&void 0!==a.id?a.id:"",this.agentId&&""!==this.agentId&&(this.fullProgressContent=!1,this.waitForAgent=!1,this.showPrivacyHelp=!0,this._fireEvent("support-center-chat-active",!0),this._fireEvent("support-center-chat-started",!0)),this.customerId=null==r?void 0:r.id,this.customerName=null==r?void 0:r.displayName,this.agentName=a&&void 0!==a.displayName?a.displayName:""}getMemberInitials(e){const t=null==e?void 0:e.split(" ");let i="";for(let e=0;e<t.length;e+=1)i+=t[e][0];return i}bbvaHelpModal(){return t`
      <bbva-help-modal
        class="modal"
        modal-type="warning"
        title-icon="${W()}"
        title-text="${this.t(this.messageTitleError)}"
        body-text="${this.t(this.messageBodyError)}"
        button-text="${this.t(this.messageButtonError)}"
      ></bbva-help-modal>
    `}showCardList(){return t`
      <div class='card-list'>
        ${this.cardObject.map(((e,i)=>t`${this.showCardBasic(e.alias,e.numProduct,e.amount,e.productType,i)}`))}
      </div>
    `}showSendMessages(e,i,s="received",a=0,r=!1){const o=e.replace("##ConfirmarTarjeta##","");return{send:t`
        <bbva-chat-text
          class="bbva-chat-text"
          id="${a}"
          owner=${this.isSupportCenterChat?this.customerName:this.t("bbva-widget-chat-you")}
          initials="${this.isSupportCenterChat?this.getMemberInitials(this.customerName):""}"
          micro="${this.isSupportCenterChat?"":"man"}"
          date="${i}">
          ${e}
        </bbva-chat-text>`,received:t`
        <bbva-chat-text
          class="bbva-chat-text bbva-chat-text--received"
          id="${a}"
          owner=${this.isSupportCenterChat?this.agentName:this.t("bbva-widget-chat-agent")}
          date="${i}"
          initials="${this.isSupportCenterChat?this.getMemberInitials(this.agentName):""}"
          micro="${this.isSupportCenterChat?"":"man"}"
          variant="received">
          ${this.isSupportCenterChat?G(o):o}
          ${r?this.showCardList():""}
        </bbva-chat-text>`,workflow:t`
        <bbva-notification-help
        class = "container__alert"
        accessibility-label-icon="Info"
        icon=${z()}
        text="${i} - ${o}"
      ></bbva-notification-help>`}[s]}bbvaChatTextTyping(){return t`
      <bbva-chat-text
        initials="${this.isSupportCenterChat?this.getMemberInitials(this.agentName):""}"
        micro="${this.isSupportCenterChat?"":"man"}"
        state="typing"
        variant="received">
      </bbva-chat-text> `}bbvaChatForm(){return t`
      <bbva-chat-form
        id="chatForm"
        class="footer__form--component container-space"
        ?show-send-icon=${!this.enableVoiceToTextIcon}
        with-space
        text-placeholder="${this.t(this.messageChatForm)}"
        keep-talking-animation
        ?talking="${this._talking}"
        @chat-form-mic-request="${this._onMicRequest}"
        @chat-form-mic-cancel="${this._onMicCancel}"
        @chat-form-send-click=${this.chatFormSendClick}
        ?disabled=${this.disableChatForm}
        message=${this.currentMessageInput}
        @keydown=${this.typingChat}
      ></bbva-chat-form>
    `}bbvaFeedback(){return t`
      <bbva-form-rating
        class="feedback"
        content-title=${this.t("bbva-widget-chat-support-center-feedback-title")}
        accessibility-text=${this.t("bbva-widget-chat-support-center-feedback-message")}
        status-type=${this.statusTypeFeedback||"default"}
        text=${this.ratingText||this.t("bbva-widget-chat-support-center-feedback-text")}
        @form-rating-value-change=${this._getFeedback}>
      </bbva-form-rating>
    `}_getFeedback(e){const t=e.detail;switch(t){case 1:this.ratingText=this.t("bbva-widget-chat-support-center-feedback-rating-very-bad"),this.statusTypeFeedback="warning";break;case 2:this.ratingText=this.t("bbva-widget-chat-support-center-feedback-rating-bad"),this.statusTypeFeedback="warning";break;case 3:this.ratingText=this.t("bbva-widget-chat-support-center-feedback-rating-neutral"),this.statusTypeFeedback="warning";break;case 4:this.ratingText=this.t("bbva-widget-chat-support-center-feedback-rating-good"),this.statusTypeFeedback="default";break;case 5:this.ratingText=this.t("bbva-widget-chat-support-center-feedback-rating-very-good"),this.statusTypeFeedback="success";break;default:this.ratingText=this.t("bbva-widget-chat-support-center-feedback-text"),this.statusTypeFeedback="default"}this.shadowRoot.querySelector(".feedback").shadowRoot.querySelector("#text").setAttribute("type",this.statusTypeFeedback),this.showFeedbackToast=!0}bbvaFeedbackToast(){return t`
      <bbva-notification-toast
        pusher
        type="success"
        icon-explainer="${J()}"
        alert-text=${this.t("bbva-widget-chat-support-center-feedback-success")}
        show
      ></bbva-notification-toast>
    `}bbvaNotificationToast(){return t`
      <bbva-notification-toast pusher type="success" show auto-hide duration="${this.timeToast}">
        <p>${this.t(this.messageToast)}</p>
      </bbva-notification-toast>
    `}createChat(){this.controlStatus=!1,this.genesysDm.createChat(this._getBodyCreateChat())}sendMessage(){const e={body:this._getBodySendMessage(),conversationId:this.conversationId,memberId:this.idCustomer,jwtChat:this.jwtChat};this.genesysDm.sendMessage(e)}getMember(e,t="",i=""){const s=t||this.conversationId;this.genesysDm.getMember(s,e,i)}recoverMessages(){this.genesysDm.recoverMessages(this.conversationId,this.jwtChat)}reconnectChat(){this._fireEvent("open-spinner"),this.socketConnect(this.eventStreamUri),this.getMember(this.idAdvisor,this.conversationId,this.jwtChat)}typingChat(e){if(this.genesysDm.typing(this.jwtChat,this.conversationId,this.idCustomer),this.isSupportCenterChat){const t=/^[a-zA-Z0-9%\s.,¿?¡!áÁéÉíÍóÓúÚñÑ$]*$/,i=e.key;1!==i.length||t.test(i)||e.preventDefault()}}createChatSuccess(e){var t,i;const s=null==e||null===(t=e.detail)||void 0===t?void 0:t.detail;this.eventStreamUri=null==s?void 0:s.eventStreamUri,this.conversationId=null==s?void 0:s.id,this.jwtChat=null==s?void 0:s.jwt,this.idCustomer=null==s||null===(i=s.member)||void 0===i?void 0:i.id,this.socketConnect(this.eventStreamUri),this.stateToast=!0,this.stateForm=!0}getMemberSuccess(e){const{role:t,state:i}=e.detail.detail,s=e.detail.detail.id,a={AGENT:{CONNECTED:this._agentConnected.bind(this),DISCONNECTED:this._agentDisconnected.bind(this)},WORKFLOW:{CONNECTED:e=>{this.idWorkflow=e}},CUSTOMER:{CONNECTED:e=>{this.idCustomer=e}},ACD:{CONNECTED:e=>{this.idAcd=e}}};"AGENT"===t&&a[t][i](s),"AGENT"!==t&&"DISCONNECTED"!==i&&a[t][i](s)}recoverMessagesSuccess(e){const t=e.detail.detail.entities;this.conversationMessages=[],t.forEach((e=>{const{bodyType:t}=e,{id:i}=e.sender,s={standard:{id:i,message:e.body}};"member-join"===t&&this.idAdvisor===i&&(s["member-join"]={id:this.idWorkflow,message:this.t(this.messageConnectedAdvisor)}),s[t]&&this._messageType(s[t].id,s[t].message,e.timestamp)}))}createChatError(e){e&&(this.openErrorModal(),this._fireEvent("create-chat-error"),this.stateForm=!0)}sendMessageError(e){e&&this.openErrorModal()}recoverMessagesError(e){e&&this.openErrorModal()}saveLocalStorage(e,t){this._fireEvent("global-set-in-storage",{key:e,value:t})}searchLocalStorage(e){this._fireEvent("get-from-storage",{key:e})}deleteLocalStorage(e){this._fireEvent("global-remove-from-storage",{key:e})}fetchSupportCenterStorageSuccess(e){this.jwtChat=null==e?void 0:e.jwtChat,this.conversationId=null==e?void 0:e.conversationId,this.customerId=null==e?void 0:e.customerId,this.chatCreated=null==e?void 0:e.isChatActive}fetchSupportCenterStorageError(){this.searchLocalStorage("support_center_chat")}searchLocalStorageSuccess(e){this.eventStreamUri=e.eventStreamUri,this.conversationId=e.conversationId,this.idCustomer=e.idCustomer,this.jwtChat=e.jwtChat,this.idAdvisor=e.idAdvisor,this.idWorkflow=e.idWorkflow,this.idAcd=e.idAcd,this.reconnection=e.reconnection,this.stateToast=!1,this.stateForm=!0,this.controlStatus&&this.reconnectChat(),this.controlStatus=!1}searchLocalStorageError(e){e&&(this.controlStatus&&this.createChat(),this.controlStatus=!1)}socketConnect(e){this.wS=this.socket(e),this.wS.addEventListener("open",this._openSocket.bind(this)),this.wS.addEventListener("message",this._messageSocket.bind(this)),this.wS.addEventListener("close",this._closeSocket.bind(this))}socket(e){return new WebSocket(e)}_openSocket(e){e&&this._fireEvent("successful-connection",!0)}_messageSocket(e){const t=JSON.parse(e.data),i={message:this._metadataTypeMessage.bind(this),"typing-indicator":this._metadataTypeTypingIndicator.bind(this)};t.eventBody.message&&this.typing&&(this.typing=!1),t&&t.metadata&&t.metadata.type&&("message"!==t.metadata.type&&"typing-indicator"!==t.metadata.type||i[t.metadata.type](t))}_closeSocket(e){e&&this._fireEvent("close-socket")}_metadataTypeMessage(e){const{id:t}=e.eventBody.sender,{body:i,bodyType:s}=e.eventBody,a=e.eventBody.timestamp;({standard:this._messageType.bind(this,t,i,a),"member-join":this.getMember.bind(this,t,"",this.jwtChat),"member-leave":this.getMember.bind(this,t,"",this.jwtChat)})[s]()}_metadataTypeTypingIndicator(e){const{id:t}=e.eventBody.sender;t===this.idAdvisor&&(this.typing=!0,this.updateScroll())}_messageType(e,t,i){const s={[this.idCustomer]:"send",[this.idWorkflow]:"workflow",[this.idAdvisor]:"received"};if(e===this.idAdvisor&&(this.typing=!1),t){const a="workflow"===s[e]?this.getHour(i):i;this.showSendAlert({type:s[e],message:t,hour:a})}}showSendAlert(e){this.conversationMessages.push({message:e.message,hour:e.hour,type:e.type}),this.updateScroll()}_getBodyCreateChat(){return{organizationId:this.organizationId,deploymentId:this.deploymentId,routingTarget:{targetType:this.targetType,targetAddress:this.targetAddress},memberInfo:{displayName:this.displayName}}}_getBodySendMessage(){return{body:this.message,bodyType:"standard"}}async setWorkflow(e){this.idWorkflow=e,await this.updateComplete}_agentConnected(e){this.reconnection?(this.recoverMessages(),this.reconnection=!1):(this.idAdvisor=e,this.showSendAlert({type:"workflow",hour:this.getHour(),message:this.t(this.messageConnectedAdvisor)}),this._fireEvent("adviser-connected"),this.saveLocalStorage("chat_login",{eventStreamUri:this.eventStreamUri,conversationId:this.conversationId,idCustomer:this.idCustomer,jwtChat:this.jwtChat,idAdvisor:this.idAdvisor,idWorkflow:this.idWorkflow,idAcd:this.idAcd,reconnection:!0}))}_agentDisconnected(){if(this.reconnection)this.clearAll(),this.createChat(),this._fireEvent("close-spinner"),this.reconnection=!1;else{const e={type:"workflow",hour:this.getHour()};this.closeStatus=!1,this.deleteLocalStorage("chat_login"),this._fireEvent("finished-conversation"),this.showSendAlert({...e,message:this.t(this.messageEndingConversation)}),this.showSendAlert({...e,message:this.t(this.messageConversationResults)})}}chatFormSendClick(e){if(this.message=e.detail,this.sendMessage(),this.isSupportCenterChat){const t={message:e.detail,hour:(new Date).toISOString(),type:"send"};t.message.length>0&&this.conversationMessages.push(t),this.conversationMessages.length>3&&(this.showPrivacyHelp=!1)}}async controlChat(){this.controlStatus&&(this.requestUpdate(),await this.updateComplete,this.genesysDm=this.renderRoot.querySelector(".genesysDm"),this.searchLocalStorage("chat_login"))}async updateScroll(){this.requestUpdate(),await this.updateComplete,this.containerChat=this.renderRoot.querySelector(".container__chat"),this.containerChat.scrollHeight&&(this.containerChat.scrollTop=this.containerChat.scrollHeight)}getHour(e=""){return(e?new Date(e):new Date).toLocaleTimeString("es-ES",{hour:"2-digit",minute:"2-digit"}).concat("h")}updateNotice(e){e&&(this.genesysDm=this.renderRoot.querySelector(".genesysDm"),this.searchLocalStorage("chat_login"))}openFeedback(){this._fireEvent("set-feedback-link",this.urlFeedback),this._fireEvent("navigate-to-feedback",!0)}optionClose(){this.closeStatus?this.controlModal?(this._fireEvent("close-chat"),this._fireEvent("clear-data")):this._fireEvent("close-chat-modal",this.getModalData()):(this._fireEvent("open-opinator"),this.closeStatus=!0,this.controlModal=!0)}closeChatModal(){if(!this.agentDisconnected&&this.chatCreated||this.showOnboarding){const e={code:"SUPPORT-CENTER-CHAT-CLOSE-CHAT",selectedConfig:{className:"caution",openMaximized:!1,hideCloseIcon:!0,acceptBtLabel:this.t("bbva-widget-chat-support-center-exit"),cancelBtLabel:this.t("bbva-widget-chat-support-center-continue-in-chat"),template:{type:"paragraphs",values:[{icon:"coronita:info",iconClass:"icon-size-24",class:"caution"},{title:this.t("bbva-widget-chat-support-center-exit-chat")},{text:this.t("bbva-widget-chat-support-center-warning-exit-message"),class:"title-grey"}]}}};this._fireEvent("show-modal",e)}else this._fireEvent("navigate-to-feedback",{feedbackOperation:"support_center_chat_success"})}closeChat(){this.chatCreated&&(this.genesysDm.jwt=this.jwtChat,this.genesysDm.deleteMember(this.conversationId,this.customerId,this.jwtChat),this.deleteLocalStorage("support_center_chat"))}_deleteMemberSuccess(){this.chatCreated=!1,this.isLocalStorageActive||(this._fireEvent("leave-support-center-chat",!0),this._fireEvent("support-center-chat-ended",!0)),this.clearAll()}bbvaHelpModalSupportCenterChat(){return t`
      <bbva-help-modal
        class="modal"
        modal-type="warning"
        title-icon="${K()}"
        title-text=${this.t("bbva-widget-chat-support-center-exit-chat")}
        body-text=${this.t("bbva-widget-chat-support-center-warning-exit-message")}
        button-text=${this.t("bbva-widget-chat-support-center-exit")}
        link-text=${this.t("bbva-widget-chat-support-center-continue-in-chat")}
      ></bbva-help-modal>
    `}getModalData(){return{code:"chat-CAUTION",selectedConfig:{className:"error",openMaximized:!1,iconOnlyFullHeight:!0,acceptBtLabel:this.t(this.messageButtonAccept),cancelBtLabel:this.t(this.messageButtonCancel),template:{type:"paragraphs",values:[{icon:"coronita:alert"},{text:this.t(this.messageTextClose)}]}}}}openErrorModal(){this.renderRoot.querySelector(".modal").open()}clearAll(){this.message="",this.eventStreamUri="",this.conversationId="",this.jwtChat="",this.idCustomer="",this.conversationMessages=[],this.typing=!1,this.idAdvisor="",this.idWorkflow="",this.idAcd="",this.stateToast=!1,this.online=!1,this.closeStatus=!0,this.controlStatus=!0,this.controlModal=!1,this.reconnection=!1,this.agentName="",this.minTime="",this.maxTime="",this.showPrivacyHelp="",this.showOnboarding=!1,this.isLocalStorageActive=!1,this.showNotificationHelp=!1}_onMicRequest(){this._talking=!0,this.dispatchEvent(new CustomEvent("bbva-widget-chat-support-center-start-recognition",{bubbles:!0,composed:!0,detail:{language:this.language,autoStopAfter:8}}))}_onMicCancel(){this._talking=!1,this._cancelStopRecognition||(this._cancelStopRecognition=!1,this.dispatchEvent(new CustomEvent("bbva-widget-chat-support-center-stop-recognition",{bubbles:!0,composed:!0,detail:!0})))}transcription(e){this._chatForm.transcript=e,this._cancelStopRecognition=!0}get _chatForm(){return this._chatFormQS||(this._chatFormQS=this.shadowRoot.querySelector('[data-tag-name="bbva-chat-form"]')),this._chatFormQS}render(){return t`
      ${this.bbvaContactCenterDm()}
      ${this.isSupportCenterChat?this.bbvaHeaderMain():""}
      ${this.isSupportCenterChat&&this.showOnboarding?this.initChat():""}
      ${this.isSupportCenterChat&&this.fullProgressContent?this.BbvaProgressContentFull():""}
      ${this.isSupportCenterChat&&!this.fullProgressContent&&this.waitForAgent?this.BbvaProgressContentWaiting():""}
      ${this.bbvaGenesysDm()}
      ${this.bbvaSingleSignOnDm()}
      ${this.bbvaPurecloudDm()}
      ${this.bbvaHelpModal()}
      ${this.bbvaHelpModalSupportCenterChat()}
      <main class="container">
      <div class = "container__chat">
          ${this.showFeedbackToast?this.bbvaFeedbackToast():""}
          ${this.showPanelChat?this.bbvaPanelOffer():""}
          ${this.conversationMessages?this.conversationMessages.map(((e,i)=>t`${this.showSendMessages(e.message,e.hour,e.type,i,e.showCards)}`)):""}
          ${this.typing?this.bbvaChatTextTyping():""}
        </div>
      </main>
      <footer class="footer">
      <div class="footer__form">
          ${this.showNotificationHelp?this.bbvaNotificationHelp():""}
          ${this.showPrivacyHelp?this.bbvaPrivacyMessage():""}
          ${this.stateForm?this.bbvaChatForm():""}
          ${this.shouldShowFeedback?this.bbvaFeedback():""}
        </div>
        <div class="footer__toast">
          ${this.stateToast?this.bbvaNotificationToast():""}
        </div>
      </footer>

    `}_fireEvent(e="",t={}){const i=new CustomEvent(e,{detail:t,bubbles:!0,composed:!0});this.dispatchEvent(i)}}customElements.define(Ie.is,Ie);
