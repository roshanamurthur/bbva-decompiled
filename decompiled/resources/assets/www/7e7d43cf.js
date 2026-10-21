import{h as t,z as a,a8 as e,ac as o,ad as i,ab as n,be as r,an as l,cE as c,dv as s,ak as d,da as b,dw as u,aV as m,aN as v,dp as h,i as y,aY as f,a9 as p,dx as g,av as _,aX as k,L as $,bF as C}from"./952f98a9.js";import{R as S,S as x,D as P,T as D,v as M,x as w,G as L,M as A,L as T,N as B,ao as R,e as E,an as F,K as I,as as O,h as q,Q as K,at as z}from"./216055dc.js";import{b as j,B as H}from"./d335c75d.js";import{B as N,b as Y,a as U}from"./e3d898b2.js";import{bq as W,H as V,I as G}from"./7f3d7ca9.js";import"./c0a2f832.js";import"./cae0f1de.js";class X extends W{static get is(){return"bbva-global-financing-line-financial-statements-api-dm"}static get properties(){return{financingLineFinancialStatements:{type:Array,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.financingLineFinancialStatements=[],this.country="",this.localCustomProperties={},this._countries=["Mx"],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties","maxRetries","pendingTimeOut","financingLineFinancialStatements"],this._loaded=!1,this._requestParams={},this._modules={Mx:()=>import("./1df55098.js")}}update(t){super.update(t),t.forEach(((t,a)=>{"country"===a&&this.country&&this.country!==t?this._loadModule():"_module"!==a&&"_requestParams"!==a&&"_loaded"!==a&&this._module&&this[a]!==t?this._module[a]=this[a]:("_requestParams"===a&&this._requestParams&&this._requestParams!==t&&void 0!==t&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===a&&this._loaded)&&Object.entries(this._requestParams).forEach((([t])=>{this[`_${t}FinancingLineFinancialStatements`]()}))}))}get lastResponse(){return this.module.lastResponse}get lastResponseHeaders(){return this.module.lastResponseHeaders}get lastResponseRaw(){return this.module.lastResponseRaw}get lastRequest(){return this.module.lastRequest}async _loadModule(){const t=this._capitalize(this.country);if(this._countries.includes(t)&&this._modules[t]){const a=`BbvaFlexibleFinancingsFinancingLineFinancialStatements${t}ApiDm`;(0,this._modules[t])().then((async t=>{const e=t[a].is;this._module=this._createModuleElement(e),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-financing-line-financial-statements-api-dm-module-load")})).catch((async t=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-financing-line-financial-statements-api-dm-module-error",t)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(t){return t.charAt(0).toUpperCase()+t.slice(1).toLowerCase()}_createModuleElement(t=V.is){const a=document.createElement(t);return this._bindConfig(a),a}async _bindConfig(t){this._configProperties.forEach((a=>{t[a]=this[a]})),await this.updateComplete}_dispatchEvent(t,a=!0){this.dispatchEvent(new CustomEvent(t,{detail:a,bubbles:!0,composed:!0}))}resetFinancingLineFinancialStatements(){this.financingLineFinancialStatements=[]}async getFinancingLineFinancialStatements(t,a={}){await this.module.updateComplete,this._requestParams.get?this._requestParams.get.push({financingLineId:t,params:a}):this._requestParams={get:[{financingLineId:t,params:a}]}}async _getFinancingLineFinancialStatements(){await this.module.updateComplete,Object.keys(this.financingLineFinancialStatements).length||(this._requestParams.get.forEach((t=>{this.module.getFinancingLineFinancialStatements(t.financingLineId,t.params)})),delete this._requestParams.get)}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return t` ${this._module?this._module:""}`}}class Q extends W{static get is(){return"bbva-global-financing-line-financial-statement-api-dm"}static get properties(){return{financingLineFinancialStatement:{type:Object,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.financingLineFinancialStatement={},this.country="",this.localCustomProperties={},this._countries=["Mx"],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties","maxRetries","pendingTimeOut","financingLineFinancialStatement"],this._loaded=!1,this._requestParams={},this._modules={Mx:()=>import("./7ce3174e.js")}}update(t){super.update(t),t.forEach(((t,a)=>{"country"===a&&this.country&&this.country!==t?this._loadModule():"_module"!==a&&"_requestParams"!==a&&"_loaded"!==a&&this._module&&this[a]!==t?this._module[a]=this[a]:("_requestParams"===a&&this._requestParams&&this._requestParams!==t&&void 0!==t&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===a&&this._loaded)&&Object.entries(this._requestParams).forEach((([t])=>{this[`_${t}FinancingLineFinancialStatement`]()}))}))}get lastResponse(){return this.module.lastResponse}get lastResponseHeaders(){return this.module.lastResponseHeaders}get lastResponseRaw(){return this.module.lastResponseRaw}get lastRequest(){return this.module.lastRequest}async _loadModule(){const t=this._capitalize(this.country);if(this._countries.includes(t)&&this._modules[t]){const a=`BbvaFlexibleFinancingsFinancingLineFinancialStatement${t}ApiDm`;(0,this._modules[t])().then((async t=>{const e=t[a].is;this._module=this._createModuleElement(e),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-financing-line-financial-statement-api-dm-module-load")})).catch((async t=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-financing-line-financial-statement-api-dm-module-error",t)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(t){return t.charAt(0).toUpperCase()+t.slice(1).toLowerCase()}_createModuleElement(t=G.is){const a=document.createElement(t);return this._bindConfig(a),a}async _bindConfig(t){this._configProperties.forEach((a=>{t[a]=this[a]})),await this.updateComplete}_dispatchEvent(t,a=!0){this.dispatchEvent(new CustomEvent(t,{detail:a,bubbles:!0,composed:!0}))}resetFinancingLineFinancialStatement(){this.financingLineFinancialStatement={}}async getFinancingLineFinancialStatement(t,a,e={}){await this.module.updateComplete,this._requestParams.get?this._requestParams.get.push({financingLineId:t,financialStatementId:a,params:e}):this._requestParams={get:[{financingLineId:t,financialStatementId:a,params:e}]}}async _getFinancingLineFinancialStatement(){await this.module.updateComplete,Object.keys(this.financingLineFinancialStatement).length||(this._requestParams.get.forEach((t=>{this.module.getFinancingLineFinancialStatement(t.financingLineId,t.financialStatementId,t.params)})),delete this._requestParams.get)}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return t` ${this._module?this._module:""}`}}var Z=a`
:host {
  --_button-default-color: var(--bbva-button-default--_ambient--color,
      var(--bbva-button-default--custom--primary-ambient--color,
        ${S("colorPrimaryCtaMainTextDefault",x)}));
  --_button-default-focus-border-color: var(--bbva-button-default--_ambient--focus-border-color,
    var(--bbva-button-default--custom--primary-ambient--focus-border-color,
      ${S("colorPrimarySurfaceAmbientFocus",x)}));
  --_button-default-bg-color: var(--bbva-button-default--_ambient--bg-color,
    var(--bbva-button-default--custom--primary-ambient--bg-color,
      ${S("colorPrimaryCtaMainBackgroundDefault",x)}));
  --_button-default-color-active: var(--bbva-button-default--_ambient--color-active,
    var(--bbva-button-default--custom--primary-ambient--color-active,
      ${S("colorPrimaryCtaMainTextDefault",x)}));
  --_button-default-bg-color-active: var(--bbva-button-default--_ambient--bg-color-active,
    var(--bbva-button-default--custom--primary-ambient--bg-color-active,
      ${S("colorPrimaryCtaMainBackgroundPressed",x)}));
  --_button-default-bg-color-disabled: var(--bbva-button-default--_ambient--bg-color-disabled,
    var(--bbva-button-default--custom--primary-ambient--bg-color-disabled,
      ${S("colorPrimaryCtaDisabledBackground",x)}));
  --_button-default-color-disabled: var(--bbva-button-default--_ambient--color-disabled,
    var(--bbva-button-default--custom--primary-ambient--color-disabled,
      ${S("colorPrimaryCtaDisabledText",x)}));
  /* Secondary styles */
  --_button-default-secondary-color: var(--bbva-button-default--_ambient--secondary-color,
    var(--bbva-button-default--custom--primary-ambient--secondary-color,
      ${S("colorPrimaryCtaComplementaryTextDefault",x)}));
  --_button-default-secondary-bg-color: var(--bbva-button-default--_ambient--secondary-bg-color,
    var(--bbva-button-default--custom--primary-ambient--secondary-bg-color,
      transparent));
  --_button-default-secondary-border-color: var(--bbva-button-default--_ambient--secondary-border-color,
    var(--bbva-button-default--custom--primary-ambient--secondary-border-color,
      ${S("colorPrimaryCtaComplementaryBorderDefault",x)}));
  --_button-default-secondary-color-active: var(--bbva-button-default--_ambient--secondary-color-active,
    var(--bbva-button-default--custom--primary-ambient--secondary-color-active,
      ${S("colorPrimaryCtaComplementaryTextPressed",x)}));
  --_button-default-secondary-bg-color-active: var(--bbva-button-default--_ambient--secondary-bg-color-active,
    var(--bbva-button-default--custom--primary-ambient--secondary-bg-color-active,
      ${S("colorPrimaryCtaComplementaryBackgroundPressed",x)}));
  --_button-default-secondary-bg-color-disabled: var(--bbva-button-default--_ambient--secondary-bg-color-disabled,
    var(--bbva-button-default--custom--primary-ambient--bg-color-disabled,
      ${S("colorPrimaryCtaDisabledBackground",x)}));
  /* icon no-background styles */
  --_button-default-icon-no-background-color: var(--bbva-button-default--_ambient--icon-no-background-color,
    var(--bbva-button-default--custom--primary-ambient--icon-no-background-color,
      ${S("colorPrimaryLinkMainDefault",x)}));
  --_button-default-icon-no-background-color-active: var(--bbva-button-default--_ambient--icon-no-background-color-active,
    var(--bbva-button-default--custom--primary-ambient--icon-no-background-color-active,
      ${S("colorPrimaryLinkMainPressed",x)}));
  --_button-default-positive-color: var(--bbva-button-default--_ambient--positive-color,
    var(--bbva-button-default--custom--primary-ambient--positive-color,
      ${S("colorPrimaryCtaPositiveTextDefault",x)}));
  --_button-default-positive-bg-color: var(--bbva-button-default--_ambient--positive-bg-color,
    var(--bbva-button-default--custom--primary-ambient--positive-bg-color,
      ${S("colorPrimaryCtaPositiveBackgroundDefault",x)}));
  --_button-default-positive-color-active: var(--bbva-button-default--_ambient--positive-color-active,
    var(--bbva-button-default--custom--primary-ambient--positive-color-active,
      ${S("colorPrimaryCtaPositiveTextPressed",x)}));
  --_button-default-positive-bg-color-active: var(--bbva-button-default--_ambient--positive-bg-color-active,
    var(--bbva-button-default--custom--primary-ambient--positive-bg-color-active,
      ${S("colorPrimaryCtaPositiveBackgroundPressed",x)}));
  --_button-default-positive-color-disabled: var(--bbva-button-default--_ambient--positive-color-disabled,
    var(--bbva-button-default--custom--primary-ambient--positive-color-disabled,
      ${S("colorPrimaryCtaDisabledText",x)}));
  --_button-default-positive-bg-color-disabled: var(--bbva-button-default--_ambient--positive-bg-color-disabled,
  var(--bbva-button-default--custom--primary-ambient--positive-bg-color-disabled,
    ${S("colorPrimaryCtaDisabledBackground",x)}));
  /* Alert styles */
  --_button-default-alert-secondary-color: var(--bbva-button-default--_ambient--alert-secondary-color,
    var(--bbva-button-default--custom--primary-ambient--alert-secondary-color,
      ${S("colorPrimaryLinkInverseDefault",x)}));
  --_button-default-alert-secondary-bg-color: var(--bbva-button-default--_ambient--alert-secondary-bg-color,
    var(--bbva-button-default--custom--primary-ambient--alert-secondary-bg-color,
      ${S("colorPrimarySurfaceAlternativeDefault",x)}));
  --_button-default-alert-secondary-color-active: var(--bbva-button-default--_ambient--alert-secondary-color-active,
    var(--bbva-button-default--custom--primary-ambient--alert-secondary-color-active,
      ${S("colorPrimaryLinkInversePressed",x)}));
  --_button-default-alert-secondary-bg-color-active: var(--bbva-button-default--_ambient--alert-secondary-bg-color-active,
    var(--bbva-button-default--custom--primary-ambient--alert-secondary-bg-color-active,
      ${S("colorPrimarySurfaceAlternativePressed",x)}));
  --_button-default-alert-secondary-color-disabled: var(--bbva-button-default--_ambient--alert-secondary-color-disabled,
    var(--bbva-button-default--custom--primary-ambient--alert-secondary-color-disabled,
      ${S("colorPrimaryCtaDisabledText",x)}));
  --_button-default-alert-secondary-bg-color-disabled: var(--bbva-button-default--_ambient--alert-secondary-bg-color-disabled,
    var(--bbva-button-default--custom--primary-ambient--bg-color-disabled,
      ${S("colorPrimaryCtaDisabledBackground",x)}));
  /* Icon */
  --_button-default-icon-background: var(--bbva-button-default--_ambient--icon-background,
    var(--bbva-button-default--custom--primary-ambient--icon-background,
      ${S("colorPrimaryCtaMainBackgroundDefault",x)}));
  --_button-default-icon-color: var(--bbva-button-default--_ambient--icon-color,
    var(--bbva-button-default--custom--primary-ambient--icon-color,
      ${S("colorPrimaryCtaMainTextDefault",x)}));
  --_button-default-icon-background-disabled: var(--bbva-button-default--_ambient--icon-background-disabled,
    var(--bbva-button-default--custom--primary-ambient--icon-background-disabled,
      ${S("colorPrimaryCtaDisabledBackground",x)}));
  --_button-default-icon-color-disabled: var(--bbva-button-default--_ambient--icon-color-disabled,
    var(--bbva-button-default--custom--primary-ambient--icon-color-disabled,
      ${S("colorPrimaryCtaDisabledText",x)}));
  --_button-default-icon-background-active: var(--bbva-button-default--_ambient--icon-background-active,
    var(--bbva-button-default--custom--primary-ambient--icon-background-active,
      ${S("colorPrimaryCtaMainBackgroundPressed",x)}));
  --_button-default-icon-color-active: var(--bbva-button-default--_ambient--icon-color-active,
    var(--bbva-button-default--custom--primary-ambient--icon-color-active,
      ${S("colorPrimaryCtaMainTextPressed",x)}));
  /* Icon no-background alternative */
  --_button-default-icon-no-background-alternative-color:
    var(--bbva-button-default--_ambient--icon-no-background-alternative-color,
      var(--bbva-button-default--custom--primary-ambient--icon-no-background-alternative-color,
        ${S("colorPrimaryLinkComplementaryDefault",x)}));
  --_button-default-icon-no-background-alternative-color-active:
    var(--bbva-button-default--_ambient--icon-no-background-alternative-color-active,
      var(--bbva-button-default--custom--primary-ambient--icon-no-background-alternative-color-active,
        ${S("colorPrimaryLinkComplementaryPressed",x)}));
  /* Interactive styles */
  --_button-default-interaction-bg-color: var(--bbva-button-default--_ambient--interaction-bg-color,
    var(--bbva-button-default--custom--primary-ambient--interaction-bg-color,
      ${S("colorPrimaryCtaMainBackgroundDefault",x)}));
  --_button-default-interaction-icon-color: var(--bbva-button-default--_ambient--interaction-icon-color,
    var(--bbva-button-default--custom--primary-ambient--interaction-icon-color,
      ${S("colorPrimaryCtaMainTextDefault",x)}));
  --_button-default-interaction-border-color: var(--bbva-button-default--_ambient--interaction-border-color,
    var(--bbva-button-default--custom--primary-ambient--interaction-border-color,
      transparent));
  --_button-default-interaction-bg-color-active: var(--bbva-button-default--_ambient--interaction-bg-color-active,
    var(--bbva-button-default--custom--primary-ambient--interaction-bg-color-active,
      ${S("colorPrimaryCtaMainBackgroundPressed",x)}));
  --_button-default-interaction-disabled-bg-color: var(--bbva-button-default--_ambient--interaction-disabled-bg-color,
    var(--bbva-button-default--custom--primary-ambient--interaction-disabled-bg-color,
      ${S("colorPrimaryCtaDisabledBackground",x)}));
}
`;const J=a`
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
`,tt=a`
  /* Default styles */
  /* Static */
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-button-default--_ambient--color: var(
      --bbva-button-default--custom--primary-alt-ambient--color,
      ${S("colorPrimaryAltCtaMainTextDefault",x)}
    );

    --bbva-button-default--_ambient--focus-border-color: var(
      --bbva-button-default--custom--primary-alt-ambient--focus-border-color,
      ${S("colorPrimaryAltSurfaceAmbientFocus",x)}
    );

    --bbva-button-default--_ambient--bg-color: var(
      --bbva-button-default--custom--primary-alt-ambient--bg-color,
      ${S("colorPrimaryAltCtaMainBackgroundDefault",x)}
    );
    --bbva-button-default--_ambient--color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--color-active,
      ${S("colorPrimaryAltCtaMainTextDefault",x)}
    );
    --bbva-button-default--_ambient--bg-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--bg-color-active,
      ${S("colorPrimaryAltCtaMainBackgroundPressed",x)}
    );

    --bbva-button-default--_ambient--bg-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--bg-color-disabled,
      ${S("colorPrimaryAltCtaDisabledBackground",x)}
    );

    --bbva-button-default--_ambient--color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--color-disabled,
      ${S("colorPrimaryAltCtaDisabledText",x)}
    );

    /* Secondary styles */
    --bbva-button-default--_ambient--secondary-color: var(
      --bbva-button-default--custom--primary-alt-ambient--secondary-color,
      ${S("colorPrimaryAltCtaComplementaryTextDefault",x)}
    );

    --bbva-button-default--_ambient--secondary-border-color: var(
      --bbva-button-default--custom--primary-alt-ambient--secondary-border-color,
      ${S("colorPrimaryAltCtaComplementaryBorderDefault",x)}
    );

    --bbva-button-default--_ambient--secondary-bg-color: var(
      --bbva-button-default--custom--primary-alt-ambient--secondary-bg-color,
      transparent
    );

    --bbva-button-default--_ambient--secondary-bg-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--secondary-bg-color-active,
      ${S("colorPrimaryAltCtaComplementaryBackgroundPressed",x)}
    );

    --bbva-button-default--_ambient--secondary-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--secondary-color-disabled,
      ${S("colorPrimaryAltCtaDisabledText",x)}
    );

    --bbva-button-default--_ambient--secondary-bg-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--secondary-bg-color-disabled,
      ${S("colorPrimaryAltCtaDisabledBackground",x)}
    );

    /* Icon no-background styles */
    --bbva-button-default--_ambient--icon-no-background-color: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-no-background-color,
      ${S("colorPrimaryAltLinkMainDefault",x)}
    );

    --bbva-button-default--_ambient--icon-no-background-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-no-background-color-active,
      ${S("colorPrimaryAltLinkMainPressed",x)}
    );

    /* Icon no-background alternative styles */

    --bbva-button-default--_ambient--icon-no-background-alternative-color: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-no-background-alternative-color,
      ${S("colorPrimaryAltLinkComplementaryDefault",x)}
    );

    --bbva-button-default--_ambient--icon-no-background-alternative-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-no-background-alternative-color-active,
      ${S("colorPrimaryAltLinkComplementaryPressed",x)}
    );

    /* Positive styles */
    --bbva-button-default--_ambient--positive-color: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-color,
      ${S("colorPrimaryAltCtaPositiveTextDefault",x)}
    );

    --bbva-button-default--_ambient--positive-bg-color: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-bg-color,
      ${S("colorPrimaryAltCtaPositiveBackgroundDefault",x)}
    );

    --bbva-button-default--_ambient--positive-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-color-active,
      ${S("colorPrimaryAltCtaPositiveTextPressed",x)}
    );

    --bbva-button-default--_ambient--positive-bg-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-bg-color-active,
      ${S("colorPrimaryAltCtaPositiveBackgroundPressed",x)}
    );

    --bbva-button-default--_ambient--positive-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-color-disabled,
      ${S("colorPrimaryAltCtaDisabledText",x)}
    );

    --bbva-button-default--_ambient--positive-bg-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-bg-color-disabled,
      ${S("colorPrimaryAltCtaDisabledBackground",x)}
    );

    /* Alert styles */
    --bbva-button-default--_ambient--alert-secondary-color: var(
      --bbva-button-default--custom--primary-alt-ambient-alert-secondary-color,
      ${S("colorPrimaryAltLinkInverseDefault",x)}
    );

    --bbva-button-default--_ambient--alert-secondary-bg-color: var(
      --bbva-button-default--custom--primary-alt-ambient-alert-secondary-bg-color,
      ${S("colorPrimarySurfaceAmbientDefault",x)}
    );

    --bbva-button-default--_ambient--alert-secondary-bg-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient-alert-secondary-bg-color-active,
      ${S("colorPrimarySurfaceAlternativeDefault",x)}
    );

    --bbva-button-default--_ambient--alert-secondary-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient-alert-secondary-color-disabled,
      ${S("colorPrimaryAltCtaDisabledText",x)}
    );

    --bbva-button-default--_ambient--alert-secondary-bg-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--bg-color-disabled,
      ${S("colorPrimaryAltCtaDisabledBackground",x)}
    );

    /* Icon styles */
    --bbva-button-default--_ambient--icon-background: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-background,
      ${S("colorPrimaryAltCtaMainBackgroundDefault",x)}
    );

    --bbva-button-default--_ambient--icon-background-active: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-background-active,
      ${S("colorPrimaryAltCtaMainBackgroundPressed",x)}
    );

    --bbva-button-default--_ambient--icon-background-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-background-disabled,
      ${S("colorPrimaryAltCtaDisabledBackground",x)}
    );

    --bbva-button-default--_ambient--icon-color: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-color,
      ${S("colorPrimaryAltCtaMainTextDefault",x)}
    );

    --bbva-button-default--_ambient--icon-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-color-active,
      ${S("colorPrimaryAltCtaMainTextPressed",x)}
    );

    --bbva-button-default--_ambient--icon-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-color-disabled,
      ${S("colorPrimaryAltCtaDisabledText",x)}
    );

    /* Interactive */
    --bbva-button-default--_ambient--interaction-bg-color: var(
      --bbva-button-default--custom--primary-alt-ambient--interaction-bg-color,
      ${S("colorPrimaryAltCtaMainBackgroundDefault",x)}
    );

    --bbva-button-default--_ambient--interaction-icon-color: var(
      --bbva-button-default--custom--primary-alt-ambient--interaction-icon-color,
      ${S("colorPrimaryAltCtaMainTextDefault",x)}
    );

    --bbva-button-default--_ambient--interaction-border-color: var(
      --bbva-button-default--custom--primary-alt-ambient--interaction-border-color,
      transparent
    );

    --bbva-button-default--_ambient--interaction-bg-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--interaction-bg-color-active,
      ${S("colorPrimaryAltCtaMainBackgroundPressed",x)}
    );

    --bbva-button-default--_ambient--interaction-disabled-bg-color: var(
      --bbva-button-default--custom--primary-alt-ambient--interaction-disabled-bg-color,
      ${S("colorPrimaryAltCtaDisabledBackground",x)}
    );
  }
`,at=a`
  /* Default styles */
  /* Static */
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-button-default--_ambient--color: var(
      --bbva-button-default--custom--secondary-ambient--color,
      ${S("colorSecondaryCtaMainTextDefault",x)}
    );

    --bbva-button-default--_ambient--focus-border-color: var(
      --bbva-button-default--custom--secondary-ambient--focus-border-color,
      ${S("colorSecondarySurfaceAmbientFocus",x)}
    );

    --bbva-button-default--_ambient--bg-color: var(
      --bbva-button-default--custom--secondary-ambient--bg-color,
      ${S("colorSecondaryCtaMainBackgroundDefault",x)}
    );

    --bbva-button-default--_ambient--color-active: var(
      --bbva-button-default--custom--secondary-ambient--color-active,
      ${S("colorSecondaryCtaMainTextDefault",x)}
    );

    --bbva-button-default--_ambient--bg-color-active: var(
      --bbva-button-default--custom--secondary-ambient--bg-color-active,
      ${S("colorSecondaryCtaMainBackgroundPressed",x)}
    );

    --bbva-button-default--_ambient--bg-color-disabled: var(
      --bbva-button-default--custom--secondary-ambient--bg-color-disabled,
      ${S("colorSecondaryCtaDisabledBackground",x)}
    );

    --bbva-button-default--_ambient--color-disabled: var(
      --bbva-button-default--custom--secondary-ambient--color-disabled,
      ${S("colorSecondaryCtaDisabledText",x)}
    );
    /* Secondary styles */
    --bbva-button-default--_ambient--secondary-color: var(
      --bbva-button-default--custom--secondary-ambient--secondary-color,
      ${S("colorSecondaryCtaComplementaryTextDefault",x)}
    );

    --bbva-button-default--_ambient--secondary-bg-color: var(
      --bbva-button-default--custom--secondary-ambient--secondary-bg-color,
      transparent
    );

    --bbva-button-default--_ambient--secondary-border-color: var(
      --bbva-button-default--custom--secondary-ambient--secondary-border-color,
      ${S("colorSecondaryCtaComplementaryBorderDefault",x)}
    );

    --bbva-button-default--_ambient--secondary-color-active: var(
      --bbva-button-default--custom--secondary-ambient--color-active,
      ${S("colorSecondaryCtaComplementaryTextPressed",x)}
    );

    --bbva-button-default--_ambient--secondary-bg-color-active: var(
      --bbva-button-default--custom--secondary-ambient--secondary-bg-color-active,
      ${S("colorSecondaryCtaComplementaryBackgroundPressed",x)}
    );

    --bbva-button-default--_ambient--secondary-color-disabled: var(
      --bbva-button-default--custom--secondary-ambient--secondary-color-disabled,
      ${S("colorSecondaryCtaDisabledText",x)}
    );

    --bbva-button-default--_ambient--secondary-bg-color-disabled: var(
      --bbva-button-default--custom--secondary-ambient--secondary-bg-color-disabled,
      ${S("colorSecondaryCtaDisabledBackground",x)}
    );

    /* Icon no-background styles */
    --bbva-button-default--_ambient--icon-no-background-color: var(
      --bbva-button-default--custom--secondary-ambient--icon-no-background-color,
      ${S("colorSecondaryLinkMainDefault",x)}
    );

    --bbva-button-default--_ambient--icon-no-background-color-active: var(
      --bbva-button-default--custom--secondary-ambient--icon-no-background-color-active,
      ${S("colorSecondaryLinkMainPressed",x)}
    );

    /* Icon no-background alternative styles */

    --bbva-button-default--_ambient--icon-no-background-alternative-color: var(
      --bbva-button-default--custom--secondary-ambient--icon-no-background-alternative-color,
      ${S("colorSecondaryLinkComplementaryDefault",x)}
    );

    --bbva-button-default--_ambient--icon-no-background-alternative-color-active: var(
      --bbva-button-default--custom--secondary-ambient--icon-no-background-alternative-color-active,
      ${S("colorSecondaryLinkComplementaryPressed",x)}
    );

    /* Positive styles */
    --bbva-button-default--_ambient--positive-color: var(
      --bbva-button-default--custom--secondary-ambient--positive-color,
      ${S("colorSecondaryCtaPositiveTextDefault",x)}
    );

    --bbva-button-default--_ambient--positive-bg-color: var(
      --bbva-button-default--custom--secondary-ambient--positive-bg-color,
      ${S("colorSecondaryCtaPositiveBackgroundDefault",x)}
    );

    --bbva-button-default--_ambient--positive-color-active: var(
      --bbva-button-default--custom--secondary-ambient--positive-color-active,
      ${S("colorSecondaryCtaPositiveTextPressed",x)}
    );

    --bbva-button-default--_ambient--positive-bg-color-active: var(
      --bbva-button-default--custom--secondary-ambient--positive-bg-color-active,
      ${S("colorSecondaryCtaPositiveBackgroundPressed",x)}
    );

    --bbva-button-default--_ambient--positive-color-disabled: var(
      --bbva-button-default--custom--secondary-ambient--positive-color-disabled,
      ${S("colorSecondaryCtaDisabledText",x)}
    );

    --bbva-button-default--_ambient--positive-bg-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-bg-color-disabled,
      ${S("colorSecondaryCtaDisabledBackground",x)}
    );

    /* Alert styles */
    --bbva-button-default--_ambient--alert-secondary-color: var(
      --bbva-button-default--custom--secondary-ambient--alert-secondary-color,
      ${S("colorSecondaryLinkInverseDefault",x)}
    );

    --bbva-button-default--_ambient--alert-secondary-bg-color: var(
      --bbva-button-default--custom--secondary-ambient--alert-secondary-bg-color,
      ${S("colorSecondarySurfaceAlternativeDefault",x)}
    );

    --bbva-button-default--_ambient--alert-secondary-color-active: var(
      --bbva-button-default--custom--secondary-ambient--alert-secondary-active-color,
      ${S("colorSecondaryLinkInversePressed",x)}
    );

    --bbva-button-default--_ambient--alert-secondary-bg-color-active: var(
      --bbva-button-default--custom--secondary-ambient--alert-secondary-active-bg-color,
      ${S("colorSecondarySurfaceAlternativePressed",x)}
    );

    /* Icon styles */
    --bbva-button-default--_ambient--icon-background: var(
      --bbva-button-default--custom--secondary-ambient--icon-background,
      ${S("colorSecondaryCtaMainBackgroundDefault",x)}
    );

    --bbva-button-default--_ambient--icon-background-active: var(
      --bbva-button-default--custom--secondary-ambient--icon-background-active,
      ${S("colorSecondaryCtaMainBackgroundPressed",x)}
    );

    --bbva-button-default--_ambient--icon-color-active: var(
      --bbva-button-default--custom--secondary-ambient--icon-color-active,
      ${S("colorSecondaryCtaMainTextPressed",x)}
    );

    --bbva-button-default--_ambient--icon-background-disabled: var(
      --bbva-button-default--custom--secondary-ambient--icon-background-disabled,
      ${S("colorSecondaryCtaDisabledBackground",x)}
    );

    --bbva-button-default--_ambient--icon-color: var(
      --bbva-button-default--custom--secondary-ambient--icon-color,
      ${S("colorSecondaryCtaMainTextDefault",x)}
    );

    --bbva-button-default--_ambient--icon-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-color-disabled,
      ${S("colorSecondaryCtaDisabledText",x)}
    );

    /* Interactive styles */
    --bbva-button-default--_ambient--interaction-bg-color: var(
      --bbva-button-default--custom--secondary-ambient--interaction-bg-color,
      ${S("colorSecondaryCtaMainBackgroundDefault",x)}
    );

    --bbva-button-default--_ambient--interaction-icon-color: var(
      --bbva-button-default--custom--secondary-ambient--interaction-icon-color,
      ${S("colorSecondaryCtaMainTextDefault",x)}
    );

    --bbva-button-default--_ambient--interaction-border-color: var(
      --bbva-button-default--custom--secondary-ambient--interaction-border-color,
      transparent
    );

    --bbva-button-default--_ambient--interaction-bg-color-active: var(
      --bbva-button-default--custom--secondary-ambient--interaction-bg-color-active,
      ${S("colorSecondaryCtaMainBackgroundPressed",x)}
    );

    --bbva-button-default--_ambient--interaction-disabled-bg-color: var(
      --bbva-button-default--custom--secondary-ambient--interaction-disabled-bg-color,
      ${S("colorSecondaryCtaDisabledBackground",x)}
    );
  }
`,et=a`
  /* Default styles */
  /* Static */
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-button-default--_ambient--color: var(
      --bbva-button-default--custom--secondary-alt-ambient--color,
      ${S("colorSecondaryAltCtaMainTextDefault",x)}
    );

    --bbva-button-default--_ambient--focus-border-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--focus-border-color,
      ${S("colorSecondaryAltSurfaceAmbientFocus",x)}
    );

    --bbva-button-default--_ambient--bg-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--bg-color,
      ${S("colorSecondaryAltCtaMainBackgroundDefault",x)}
    );

    --bbva-button-default--_ambient--color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--color-active,
      ${S("colorSecondaryAltCtaMainTextDefault",x)}
    );

    --bbva-button-default--_ambient--bg-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--bg-color-active,
      ${S("colorSecondaryAltCtaMainBackgroundPressed",x)}
    );

    --bbva-button-default--_ambient--bg-color-disabled: var(
      --bbva-button-default--custom--secondary-alt-ambient--bg-color-disabled,
      ${S("colorSecondaryAltCtaDisabledBackground",x)}
    );

    --bbva-button-default--_ambient--color-disabled: var(
      --bbva-button-default--custom--secondary-alt-ambient--color-disabled,
      ${S("colorSecondaryAltCtaDisabledText",x)}
    );

    /* Secondary styles */
    --bbva-button-default--_ambient--secondary-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--secondary-color,
      ${S("colorSecondaryAltCtaComplementaryTextDefault",x)}
    );

    --bbva-button-default--_ambient--secondary-bg-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--secondary-bg-color,
      transparent
    );

    --bbva-button-default--_ambient--secondary-border-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--secondary-border-color,
      ${S("colorSecondaryAltCtaComplementaryBorderDefault",x)}
    );

    --bbva-button-default--_ambient--secondary-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--secondary-color-active,
      ${S("colorSecondaryAltCtaComplementaryTextPressed",x)}
    );

    --bbva-button-default--_ambient--secondary-bg-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--secondary-bg-color-active,
      ${S("colorSecondaryAltCtaComplementaryBackgroundPressed",x)}
    );

    --bbva-button-default--_ambient--secondary-color-disabled: var(
      --bbva-button-default--custom--secondary-alt-ambient--secondary-color-disabled,
      ${S("colorSecondaryAltCtaDisabledText",x)}
    );

    --bbva-button-default--_ambient--secondary-bg-color-disabled: var(
      --bbva-button-default--custom--secondary-alt-ambient--secondary-bg-color-disabled,
      ${S("colorSecondaryAltCtaDisabledBackground",x)}
    );

    /* Icon no-background styles */
    --bbva-button-default--_ambient--icon-no-background-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-no-background-color,
      ${S("colorSecondaryAltLinkMainDefault",x)}
    );

    --bbva-button-default--_ambient--icon-no-background-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-no-background-color-active,
      ${S("colorSecondaryAltLinkMainPressed",x)}
    );

    /* Icon no-background alternative styles */

    --bbva-button-default--_ambient--icon-no-background-alternative-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-no-background-alternative-color,
      ${S("colorSecondaryAltLinkComplementaryDefault",x)}
    );

    --bbva-button-default--_ambient--icon-no-background-alternative-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-no-background-alternative-color-active,
      ${S("colorSecondaryAltLinkComplementaryPressed",x)}
    );

    /* Positive styles */
    --bbva-button-default--_ambient--positive-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--positive-color,
      ${S("colorSecondaryAltCtaPositiveTextDefault",x)}
    );

    --bbva-button-default--_ambient--positive-bg-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--positive-bg-color,
      ${S("colorSecondaryCtaPositiveBackgroundDefault",x)}
    );

    --bbva-button-default--_ambient--positive-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--positive-color-active,
      ${S("colorSecondaryAltCtaPositiveTextPressed",x)}
    );

    --bbva-button-default--_ambient--positive-bg-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--positive-bg-color-active,
      ${S("colorSecondaryAltCtaPositiveBackgroundPressed",x)}
    );

    --bbva-button-default--_ambient--positive-color-disabled: var(
      --bbva-button-default--custom--secondary-alt-ambient--positive-color-disabled,
      ${S("colorSecondaryAltCtaDisabledText",x)}
    );

    --bbva-button-default--_ambient--positive-bg-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-bg-color-disabled,
      ${S("colorSecondaryAltCtaDisabledBackground",x)}
    );

    /* Alert styles */
    --bbva-button-default--_ambient--alert-secondary-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--alert-secondary-color,
      ${S("colorSecondaryAltLinkInverseDefault",x)}
    );

    --bbva-button-default--_ambient--alert-secondary-bg-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--alert-secondary-bg-color,
      ${S("colorSecondaryAltSurfaceAlternativeDefault",x)}
    );

    --bbva-button-default--_ambient--alert-secondary-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--alert-secondary-active-color,
      ${S("colorSecondaryAltLinkInversePressed",x)}
    );

    --bbva-button-default--_ambient--alert-secondary-bg-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--alert-secondary-active-bg-color,
      ${S("colorSecondaryAltSurfaceAlternativePressed",x)}
    );

    /* Icon styles*/
    --bbva-button-default--_ambient--icon-background: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-background,
      ${S("colorSecondaryAltCtaMainBackgroundDefault",x)}
    );

    --bbva-button-default--_ambient--icon-background-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-background-active,
      ${S("colorSecondaryAltCtaMainBackgroundPressed",x)}
    );

    --bbva-button-default--_ambient--icon-background-disabled: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-background-disabled,
      ${S("colorSecondaryAltCtaDisabledBackground",x)}
    );

    --bbva-button-default--_ambient--icon-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-color,
      ${S("colorSecondaryAltCtaMainTextDefault",x)}
    );

    --bbva-button-default--_ambient--icon-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-color-active,
      ${S("colorSecondaryAltCtaMainTextPressed",x)}
    );

    --bbva-button-default--_ambient--icon-color-disabled: var(
      --bbva-button-default--custom--secondary-ambient--icon-color-disabled,
      ${S("colorSecondaryAltCtaDisabledText",x)}
    );

    /* Interactive styles */
    --bbva-button-default--_ambient--interaction-bg-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--interaction-bg-color,
      ${S("colorSecondaryAltCtaMainBackgroundDefault",x)}
    );

    --bbva-button-default--_ambient--interaction-icon-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--interaction-icon-color,
      ${S("colorSecondaryAltCtaMainTextDefault",x)}
    );

    --bbva-button-default--_ambient--interaction-border-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--interaction-border-color,
      transparent
    );

    --bbva-button-default--_ambient--interaction-bg-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--interaction-bg-color-active,
      ${S("colorSecondaryAltCtaMainBackgroundPressed",x)}
    );

    --bbva-button-default--_ambient--interaction-disabled-bg-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--interaction-disabled-bg-color,
      ${S("colorSecondaryAltCtaDisabledBackground",x)}
    );
  }
`,ot={primary:a`
    ${J}
    ${P.primary}
    ${D.primary}
  `,primaryAlt:a`
    ${tt}
    ${P.primaryAlt}
    ${D.primaryAlt}
  `,secondary:a`
    ${at}
    ${P.secondary}
    ${D.secondary}
  `,secondaryAlt:a`
    ${et}
    ${P.secondaryAlt}
    ${D.secondaryAlt}
  `},it=Object.values(ot);var nt=a`
:host {
  position: relative;
  min-width: var(--button-default-min-width, 8rem);
  max-width: 100%;
  height: 3rem;
  box-sizing: border-box;
  padding: 0.75rem 2rem;
  border: none;
  border-radius: var(--button-default-border-radius, var(--borderRadiusSmall, ${e(r.small)}));
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
  font-size: var(--typographyTypeSmall, ${e(o.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${e(i.typeSmall)});
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
  font-style: var(--button-default-font-weight, var(--fontFacePrimaryMediumFontStyle, ${e(n.medium.fontStyle)}));
  font-weight: var(--button-default-font-weight, var(--fontFacePrimaryMediumFontWeight, ${e(n.medium.fontWeight)}));
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
  border-radius: var(--button-default-border-radius, var(--borderRadiusSmall, ${e(r.small)}));
  color: var(--_button-default-color);
}

:host([size=L]:not([href]):not([variant=icon])) {
  height: 3.5rem;
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
  border-radius: var(--button-default-icon-border-radius, var(--borderRadiusSmall, ${e(r.small)}));
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
  outline-offset: 0;
}

:host([variant~=icon][variant~=no-background][loading]) {
  pointer-events: none;
  cursor: default;
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
  border-radius: var(--button-default-icon-border-radius, var(--borderRadiusSmall, ${e(r.small)}));
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
  background: transparent;
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
  border-radius: var(--button-default-icon-border-radius, var(--borderRadiusSmall, ${e(r.small)}));
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
`;class rt extends(M(l(c))){static get is(){return"bbva-button-default"}static get properties(){return{text:{type:String},icon:{type:String},buttonTranscriptLabel:{type:String,attribute:"button-transcript-label"},interaction:{type:Boolean},size:{type:String},keepTalkingAnimation:{type:Boolean,attribute:"keep-talking-animation"},iconTalkingAnimation:{type:String,attribute:"icon-talking-animation"},fullwidth:{type:Boolean,attribute:"fullwidth"},hasEllipsis:{type:Boolean,attribute:"has-ellipsis"},variant:{type:String},iconSize:{type:String,attribute:"icon-size"},loading:{type:Boolean,reflect:!0}}}static get scopedElements(){return{"bbva-type-icon":w,"bbva-type-text":L}}constructor(){super(),this.type="button",this.buttonTranscriptLabel="bbva-button-default-interaction-record-button",this.interaction=!1,this.size="",this.keepTalkingAnimation=!1,this.iconTalkingAnimation=s(),this.fullwidth=!1,this.hasEllipsis=!1,this.loading=!1,delete this.href}static get styles(){return[super.styles,Z,nt,it,d("bbva-button-default-shared-styles")]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._endRecord=this._endRecord.bind(this),this.interaction&&(this.addEventListener("mousedown",this._startRecord),this.addEventListener("keydown",this._keydownRecord),this.addEventListener("keyup",this._keyupRecord),this.addEventListener("blur",this._endRecord))}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),document.removeEventListener("mouseup",this._endRecord),this.removeEventListener("mousedown",this._startRecord),this.removeEventListener("keydown",this._keydownRecord),this.removeEventListener("keyup",this._keyupRecord),this.removeEventListener("blur",this._endRecord)}_startRecord(){document.addEventListener("mouseup",this._endRecord),this._talking=!0,this.keepTalkingAnimation&&(this.icon=this.iconTalkingAnimation)}set _talking(t){t!==this._isTalking&&(t?(this.setAttribute("talking",""),this.dispatchEvent(new CustomEvent("button-interaction-mic-request",{detail:!0,composed:!0,bubbles:!0}))):(this.removeAttribute("talking"),this.dispatchEvent(new CustomEvent("button-interaction-mic-cancel",{detail:!0,composed:!0,bubbles:!0}))),this._isTalking=t,this.requestUpdate())}get _talking(){return this._isTalking}_keydownRecord(t){32!==t.keyCode&&13!==t.keyCode||this._startRecord()}_keyupRecord(t){32!==t.keyCode&&13!==t.keyCode||this._endRecord()}_endRecord(){document.removeEventListener("mouseup",this._endRecord);this._isTalkingAnimation||!this.keepTalkingAnimation?(this._talking=!1,this._isTalkingAnimation=!1,this.icon=b()):this._isTalkingAnimation=!0}get _icon(){return t`
      <bbva-type-icon
        class="icon"
        icon="${this.variant.includes("alert")?u():this.icon}"
        size="${this._setIconSize}"
        .loading="${this.isLoading}"
      ></bbva-type-icon>
    `}get _setIconSize(){if(this.variant.includes("alert"))return 16;const t={16:16,24:24,32:32};return this.variant.includes("no-background")&&t[this.iconSize]||t[24]}get isLoading(){return this.loading&&this.variant&&this.variant.substring("icon")&&this.variant.substring("no-background")}get _text(){return void 0!==this.text?t`
          <bbva-type-text
            class="text"
            tag="span"
            size="S"
            .text=${this.text}
            ?ellipsis="${this.hasEllipsis}"
            alignment="center"
          ></bbva-type-text>
        `:t` <slot class="text slot-text ${this.hasEllipsis?"ellipsis":""}"></slot> `}get _interaction(){return t`
      <div class="action transcript">
        <span id="action-container" class="action-glow">
          <span class="before"></span><span class="after"></span>
        </span>
        <span class="sr-only">${this.t(this.buttonTranscriptLabel)}</span>
        <bbva-type-icon class="action-icon" .icon="${this.icon}" size="24"></bbva-type-icon>
      </div>
    `}get _buttonDefault(){var a;const e=void 0!==this.icon||null!==(a=this.variant)&&void 0!==a&&a.includes("alert")?this._icon:m;return this.interaction?t`${this._interaction}`:t`${e}${this._text}${this._action}`}render(){return t`
      <div onclick="void(0)" class="wrapper ${this.fullwidth?"fullwidth":""}">
        ${this._buttonDefault}
      </div>
    `}}customElements.define(N.is,N);const lt="modal-initial",ct=t=>({main:{header:{text:`${t.constructor.is}-main-header-text`,closeIconAriaLabel:`${t.constructor.is}-header-accessibility-key`,variant:lt},loader:{visible:!0,ambient:"primary-alt"}},reset:{loader:{visible:!1}}}),{moment:st}=window;function dt(t){return t.replace(/([A-Z])/g," $1").split(" ").join("-").toLowerCase()}function bt(t,a,e="card-information-monthly-statement-enquiry-card-flexible-financing"){return Object.keys(t).reduce(((o,i)=>{var n;const r={...o},l=t[i],c=dt(i),s=dt(a),d=(null==c||null===(n=c.endsWith)||void 0===n?void 0:n.call(c,"key"))&&!0===l;return r[i]=d?`${e}-${s}-${c}`:l,r}),{})}function ut(t){return t.charAt(0).toUpperCase()+t.slice(1)}function mt(t,a){const e=[];return t.forEach((t=>{const a=st(t.cutOffDate).format("MMMM");e.includes(a)||e.push(a)})),function(t){const a=t=>st().month(t).toDate();return t.sort(((t,e)=>a(t)-a(e)))}(e).map((t=>({disabled:a,text:ut(t)})))}function vt(t){return st(t).format("DD/MM/YYYY")}class ht{constructor(t){this.controller=t}get data(){var t;return null===(t=this.controller)||void 0===t?void 0:t.data}t(...t){return this.controller.t(...t)}}class yt extends ht{get _receiptData(){var t;return null===(t=this.data)||void 0===t?void 0:t.receiptData}static get _renderMicroIllustration(){return t`
      <bbva-clip-microillustration
        microillustration="success"
        size="M"
      ></bbva-clip-microillustration>
    `}_renderText(a){const{text:e,classes:o="",tag:i="span",fontWeight:n,fontStyle:r=h.fontStyle10,size:l="S",textColor:c,alignment:s="left"}=a;return e?t`
          <bbva-type-text
            class="${o}"
            text="${this.t(e)}"
            tag="${i}"
            size="${l}"
            font-weight="${y(n)}"
            font-style="${r}"
            text-color="${y(c)}"
            alignment="${s}"
          ></bbva-type-text>
        `:m}get _renderMain(){var a;return t`
      <div class="receipt-main">
        ${this._renderText({text:"card-information-monthly-statement-enquiry-card-flexible-financing-section-receipt-option-download-receipt-title-text",fontWeight:f.fontWeight50,size:"XL",classes:"receipt-title"})}
        ${this._renderText({text:"card-information-monthly-statement-enquiry-card-flexible-financing-section-receipt-option-download-receipt-subtitle-text",fontWeight:f.fontWeight40,textColor:p.secondary500})}
        <div class="key-value-content">
          ${this._renderText({text:"card-information-monthly-statement-enquiry-card-flexible-financing-section-receipt-option-download-receipt-subtitle-tex-receipt-operation-date-text"})}
          ${this._renderText({text:null===(a=this._receiptData)||void 0===a?void 0:a.date,fontWeight:f.fontWeight40,fontStyle:h.fontStyle20,alignment:"right"})}
        </div>
      </div>
    `}get _renderFooter(){const a=[{icon:g(),label:this.t("card-information-monthly-statement-enquiry-card-flexible-financing-section-receipt-option-download"),id:"option-1"}];return t`
      <bbva-button-row
        .options=${a}
        accessibility-text=${this.t("card-information-monthly-statement-enquiry-card-flexible-financing-section-receipt-option-download")}
      ></bbva-button-row>
    `}render(){return t`
      <div slot="slot-content" class="${_({"full-height":this.data.fullHeight})}">
        <div class="receipt-wrapper">
          ${yt._renderMicroIllustration}
          ${this._renderMain}
        </div>
      </div>
      <div slot="slot-footer" class="footer">${this._renderFooter}</div>
    `}}var ft=a`
  :host([hidden]),
  [hidden] {
    display: none !important;
  }

  *,
  *:before,
  *:after {
    box-sizing: inherit;
  }

  [data-tag-name='bbva-help-modal'] .receipt-wrapper {
    margin-top: 1rem;
  }
  [data-tag-name='bbva-help-modal'] .receipt-wrapper .receipt-main .receipt-title {
    margin-top: 1rem;
    margin-bottom: 1.5rem;
  }
  [data-tag-name='bbva-help-modal'] .receipt-wrapper .receipt-main .key-value-content {
    margin-top: 1rem;
    display: flex;
    justify-content: space-between;
  }
  [data-tag-name='bbva-help-modal'] [data-tag-name='bbva-button-row'] {
    padding: 0 5rem 2.875rem 1.5rem;
  }

  [data-selector='modal-receiptModal'],
  [data-selector='modal-errorRetryModal'] {
    z-index: 9;
  }
`;class pt extends(A(T(k(l($))))){static get is(){return"card-information-monthly-statement-enquiry-card-flexible-financing-section"}static get scopedElements(){const t=[E,L,F,I];return pt.scopedElementsFromClasses(t)}static get properties(){return{visible:{type:Boolean,reflect:!0},data:{type:Object},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"},receiptPart:{type:Object,attribute:"receipt-part"},headerButtons:{type:Array,attribute:"header-buttons"}}}_initialDataConfig(t={}){const a=()=>null;this.data={mode:"",buttonKey:"",linkKey:"",linkText:"",bodyKey:"",panelTextKey:"",titleKey:"",panelHeadingKey:"",modalTitleKey:"",linkPanelTextKey:"",headerTextKey:"",modalType:"",className:"",iOSFixed:!1,microillustration:"error",fullHeight:!1,hidePrimaryButton:!1,iconRightPrimary:"",iconRightSecondary:"",iconLeftPrimary:"",iconLeftSecondary:"",titleIcon:"",headerType:"",accessibilityTextIconLeftPrimary:"",accessibilityTextIconLeftSecondary:"",accessibilityTextIconRightPrimary:"",accessibilityTextIconRightSecondary:"",messageGroup:[],headerRightPrimaryClick:a,headerRightSecondaryClick:a,headerLeftPrimaryClick:a,headerLeftSecondaryClick:a,swipeClose:a,footerButtonClick:a,footerLinkClick:a,panelLinkClick:a,modalClicked:a,closeModalElements:["footer-button","footer-link","header-right-primary"],disabledButton:!1,phoneError:!1,...t}}static get styles(){return[ft,P.primaryAlt,B.primaryAlt,R.primaryAlt,d("card-information-monthly-statement-enquiry-card-flexible-financing-section-shared-styles")]}constructor(){super(),this.visible=!1,this.iOSFixedHeader=!1,this.preventToUpdate=!1,this.receiptPart=new yt(this),this.headerButtons=[{id:"btn-close",name:"Close",icon:C(),accessibilityText:this.t("card-information-monthly-statement-enquiry-card-flexible-financing-header-accessibility-key")}],this._initialDataConfig()}shouldUpdate(){return!this.preventToUpdate}updated(t){var a,e;super.updated(t),null===(a=this._part)||void 0===a||null===(e=a.updated)||void 0===e||e.call(a,t)}get _part(){var t;const a={receiptModal:this.receiptPart};return null==a?void 0:a[null===(t=this.data)||void 0===t?void 0:t.mode]}get _content(){var t,a;return(null===(t=this._part)||void 0===t||null===(a=t.render)||void 0===a?void 0:a.call(t))||m}_changeVisible({detail:t}){var a,e,o,i;(this.visible=t,t)?(this._initialDataConfig(this.data),null===(a=this._part)||void 0===a||null===(e=a.init)||void 0===e||e.call(a)):null===(o=this._part)||void 0===o||null===(i=o.reset)||void 0===i||i.call(o)}get _modalContainer(){var a,e,o,i,n,r,l,c,s,d,b,u,m,v,h,y,f,p,g,_,k,$,C,S,x,P,D,M,w,L,A,T,B,R,E,F,I;return t`
      <div ambient="primary-alt">
        <bbva-help-modal
          ?visible=${this.visible}
          class="${null===(a=this.data)||void 0===a?void 0:a.className}"
          aria-label="${null!==(e=this.data)&&void 0!==e&&e.fullHeight?this.t(null===(o=this.data)||void 0===o?void 0:o.headerTextKey):""}"
          .headerText="${this.t(null===(i=this.data)||void 0===i?void 0:i.headerTextKey,"")}"
          .headerType="${null===(n=this.data)||void 0===n?void 0:n.headerType}"
          ?i-o-s-fixed-header="${this.iOSFixedHeader&&this.data.iOSFixed}"
          @help-modal-header-click="${null===(r=this.data)||void 0===r?void 0:r.headerClick}"
          @help-modal-header-right-primary-click="${null===(l=this.data)||void 0===l?void 0:l.headerRightPrimaryClick}"
          @help-modal-header-left-right-secondary="${null===(c=this.data)||void 0===c?void 0:c.headerRightSecondaryClick}"
          @help-modal-header-left-primary-click="${null===(s=this.data)||void 0===s?void 0:s.headerLeftPrimaryClick}"
          @help-modal-header-left-secondary-click="${null===(d=this.data)||void 0===d?void 0:d.headerLeftSecondaryClick}"
          @help-modal-swipe-close="${null===(b=this.data)||void 0===b?void 0:b.swipeClose}"
          @click="${null===(u=this.data)||void 0===u?void 0:u.modalClicked}"
          .iconRightPrimary="${null===(m=this.data)||void 0===m?void 0:m.iconRightPrimary}"
          .iconRightSecondary="${null===(v=this.data)||void 0===v?void 0:v.iconRightSecondary}"
          .iconLeftPrimary="${null===(h=this.data)||void 0===h?void 0:h.iconLeftPrimary}"
          .iconLeftSecondary="${null===(y=this.data)||void 0===y?void 0:y.iconLeftSecondary}"
          .accessibilityTextIconLeftPrimary="${this.t(null===(f=this.data)||void 0===f?void 0:f.accessibilityTextIconLeftPrimary)}"
          .accessibilityTextIconLeftSecondary="${this.t(null===(p=this.data)||void 0===p?void 0:p.accessibilityTextIconLeftSecondary)}"
          .accessibilityTextIconRightPrimary="${this.t(null===(g=this.data)||void 0===g?void 0:g.accessibilityTextIconRightPrimary)}"
          .accessibilityTextIconRightSecondary="${this.t(null===(_=this.data)||void 0===_?void 0:_.accessibilityTextIconRightSecondary)}"
          data-selector="${`modal-${null===(k=this.data)||void 0===k?void 0:k.mode}`}"
          @visible-changed=${this._changeVisible}
          ?fixed-footer=${null===($=this.data)||void 0===$?void 0:$.fixedFooter}
          modal-type=${null===(C=this.data)||void 0===C?void 0:C.modalType}
          title-icon="${null===(S=this.data)||void 0===S?void 0:S.titleIcon}"
          .titleText="${null===(x=this.data)||void 0===x?void 0:x.titleKey}"
          .bodyText=${this.t(null===(P=this.data)||void 0===P?void 0:P.bodyKey)}
          .subtitleText="${this.t(null===(D=this.data)||void 0===D?void 0:D.subtitleKey)}"
          .buttonText="${this.t(null===(M=this.data)||void 0===M?void 0:M.buttonKey)}"
          .linkText="${this.t(null===(w=this.data)||void 0===w?void 0:w.linkKey)}"
          .closeModalElements="${null===(L=this.data)||void 0===L?void 0:L.closeModalElements}"
          ?hide-content-padding-top="${null===(A=this.data)||void 0===A?void 0:A.hideContentPaddingTop}"
          ?full-height="${null===(T=this.data)||void 0===T?void 0:T.fullHeight}"
          @help-modal-footer-button-click=${null===(B=this.data)||void 0===B?void 0:B.footerButtonClick}
          @help-modal-footer-link-click=${null===(R=this.data)||void 0===R?void 0:R.footerLinkClick}
          @help-modal-veil-click=${null===(E=this.data)||void 0===E?void 0:E.veilClick}
          ?disabled-button=${null===(F=this.data)||void 0===F?void 0:F.disabledButton}
          ?reset-content-scroll="${this.resetContentScroll}"
          .headerButtons=${(null===(I=this.data)||void 0===I?void 0:I.headerButtons)||this.headerButtons}
        >
          ${this._slotContent}
        </bbva-help-modal>
      </div>
    `}get _slotContent(){return t`
      ${this._content}
    `}render(){return t`
      ${this._modalContainer}
    `}}var gt=a`
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

  .body-content-wrapper .empty-state {
    padding: 0 1rem;
  }
  .body-content-wrapper .empty-state [data-tag-name='bbva-clip-microillustration'] {
    margin: 1rem 0;
  }
  .body-content-wrapper .content [data-tag-name='bbva-type-text'] {
    padding: 0.5rem 1rem 0;
  }
  .body-content-wrapper .content [data-tag-name='bbva-notification-message'] {
    margin: 1.5rem 1rem 0;
  }
  .body-content-wrapper .content .content-radio-buttons {
    margin-top: 16px;
  }
  .body-content-wrapper .content .content-radio-buttons [data-tag-name='bbva-form-select'] {
    padding: 0 1rem;
  }
  .body-content-wrapper
    .content
    .content-radio-buttons
    [data-tag-name='bbva-form-select'].months-selector {
    margin: 0.5rem 0;
  }
  .body-content-wrapper .button {
    position: absolute;
    width: 100%;
    padding: 0 16px;
    bottom: 24px;
  }
`;class _t extends(A(T(l($)))){static get is(){return"card-information-monthly-statement-enquiry-card-flexible-financing"}static get scopedElements(){const t=[L,H,rt,q,K,I,U,N,z,X,Q,pt];return _t.scopedElementsFromClasses(t)}static get properties(){return{disableCallBbva:{type:Boolean,attribute:"disable-call-bbva"},financingLineId:{type:String,attribute:"financing-line-id"},flexibleFinancingsApiVersion:{type:String,attribute:"flexible-financings-api-version"},flexibleFinancingApiVersion:{type:String,attribute:"flexible-financing-api-version"},isActive:{type:Boolean,attribute:"is-active"},maxRetries:{type:Number,attribute:"max-retries"},pageName:{type:String,attribute:"page-name"},pdfDownloadParams:{type:Object,attribute:"pdf-download-params"},userPhone:{type:String,attribute:"user-phone"},_errorCounter:{type:Number},_financialLineData:{type:Array},_financialLineStatementData:{type:String},_iOSDevices:{type:Array},_isOpenedMonthsModal:{type:Boolean},_isOpenedYearsModal:{type:Boolean},_modalData:{type:Object},_monthsAvailable:{type:Array},_monthsSelected:{type:String},_radioSelected:{type:Boolean},_receiptData:{type:Object},_showErrorRetryModal:{type:Boolean},_showFormSelect:{type:Boolean},_showMainPage:{type:Boolean},_showMaximumErrorRetryModal:{type:Boolean},_showReceipt:{type:Boolean},_yearsAvailable:{type:Array},_yearsSelected:{type:String},_financialStatementsDmLoaded:{type:Boolean}}}static get styles(){return[gt,P.primaryAlt,j.primaryAlt,Y.primaryAlt,ot.primaryAlt,B.primaryAlt,O.primaryAlt,d("card-information-monthly-statement-enquiry-card-flexible-financing-shared-styles")]}constructor(){var t;super(),this.config.loader=ct(this).main.loader,this.disableCallBbva=!1,this.flexibleFinancingApiVersion="0",this.flexibleFinancingsApiVersion="0",this.isActive=!1,this.maxRetries=3,this.pageName="monthlyStatementEnquiry",this.language="es-ES",this.pdfDownloadParams={},this.userPhone="",this._errorCounter=0,this._financialLineData=[],this._financialStatementId="",this._financialStatementsDmLoaded=!1,this._iOSDevices=["iOS","iPhone"],this._modalData={receipt_modal:{mode:"receiptModal",className:"",closeModalElements:["header"],fullHeight:!0,fixedFooter:!0,headerType:"modal",headerTextKey:!0,modalTitleKey:!0,titleIcon:"",buttonKey:!1,linkKey:!1,hideContentPaddingTop:!0,headerClick:(t=this)._onReceiptHeaderClick.bind(t)},error_retry_modal:{mode:"errorRetryModal",closeModalElements:["header","footer-link"],modalType:"warning",headerTextKey:!0,modalTitleKey:!0,modalMessageKey:!0,bodyKey:!0,titleKey:!0,buttonKey:!0,titleIcon:v(),fullHeight:!1,linkKey:!0,veilClick:t._manageBackNavigation.bind(t),footerButtonClick:t._retryApiCall.bind(t),footerLinkClick:t._manageBackNavigation.bind(t)},error_maximum_retries_modal:{mode:"errorMaximumRetriesModal",closeModalElements:["header","footer-link"],modalType:"warning",fixedFooter:!0,headerType:"modal",headerTextKey:!0,modalTitleKey:!0,modalMessageKey:!0,bodyKey:!0,titleKey:!0,buttonKey:!0,titleIcon:v(),fullHeight:!0,linkKey:!0,veilClick:t._manageBackNavigation.bind(t),footerButtonClick:t._callToBank.bind(t),footerLinkClick:t._manageBackNavigation.bind(t)},error_maximum_retries_modal_disabled_call_bbva:{mode:"errorMaximumRetriesModalDisabledCallBbva",closeModalElements:["header","footer-link"],modalType:"warning",fixedFooter:!0,headerType:"modal",headerTextKey:!0,modalTitleKey:!0,modalMessageKey:!0,bodyKey:!0,titleKey:!0,buttonKey:!0,titleIcon:v(),fullHeight:!0,veilClick:t._manageBackNavigation.bind(t),footerButtonClick:t._manageBackNavigation.bind(t)}},this._setDefaulltProps()}reset(){this.config=ct(this).reset,this._setDefaulltProps()}_setDefaulltProps(){this.financingLineId="",this._errorCounter=0,this._monthsAvailable=[],this._monthsSelected="",this._yearsAvailable=[],this._yearsSelected="",this._financialLineData=[],this._showFormSelect=!1,this._showErrorRetryModal=!1,this._showReceipt=!1,this._showMaximumErrorRetryModal=!1,this._showMainPage=!1,this._receiptData={},this._radioSelected=!1,this._isOpenedMonthsModal=!1,this._isOpenedYearsModal=!1,this._financialLineStatementData=""}firstUpdated(){super.firstUpdated&&super.firstUpdated(),this._financingLineFinancialStatementsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-financing-line-financial-statements-api-dm"]'),this._financingLineFinancialStatementDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-financing-line-financial-statement-api-dm"]')}updated(t){super.updated(t),(t.has("_financialStatementsDmLoaded")&&this._financialStatementsDmLoaded&&this.financingLineId||t.has("financingLineId")&&this.financingLineId&&this._financialStatementsDmLoaded)&&this._getFinancingLineFinancialStatements(),t.has("locale")||this.locale||this._financialStatementsDmLoaded||(this._financialStatementsDmLoaded=!0)}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._handleHeaderBack()}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this._removeHeaderBack()}_handleHeaderBack(){this.addEventListener("header-main-icon-click",this._manageBackNavigation.bind(this),!0)}_removeHeaderBack(){this.removeEventListener("header-main-icon-click",this._manageBackNavigation.bind(this),!0)}_hideSpinner(){this.clearLoader(),this.config.loader={visible:!1}}_showSpinner(){this.showLoader(),this.config.loader={visible:!0}}_getFinancingLineFinancialStatements(t={}){this._showSpinner(),this.financialStatementsParams={...t,isActive:this.isActive},this._financingLineFinancialStatementsDm.getFinancingLineFinancialStatements(this.financingLineId,this.financialStatementsParams)}_getFinancingLineFinancialStatement(){this._showSpinner(),this._financingLineFinancialStatementDm.getFinancingLineFinancialStatement(this.financingLineId,this._financialStatementId)}_handleFinancialLineStatementsSuccess(t){this._configurePage(),this._financialLineData=(null==t?void 0:t.detail)||[],this._parseDates(),this._hideSpinner(),this._errorCounter=0,this._checkFinancialLineData()}_configurePage(){this._showMainPage=!0,this.config=ct(this).main}_parseDates(){[this._lastDate]=this._financialLineData;const{years:t,months:a,monthsByYear:e}=function(t){const a={},e=mt(t,!1);return t.forEach((e=>{const o=st(e.cutOffDate),i=o.format("YYYY"),n=ut(o.format("MMMM"));a[i]||(a[i]={months:mt(t,!0)});const r=a[i].months.find((t=>t.text===n));r.disabled=!1,r.id=e.id,r.cutOffDate=e.cutOffDate})),{monthsByYear:a,years:Object.keys(a).sort().map((t=>({disabled:!1,text:t}))),months:e}}(this._financialLineData);this._yearsAvailable=t,this._monthsAvailable=a,this._monthsByYear=e}_checkFinancialLineData(){this._financialLineData.length?this._dispatch(`${_t.is}-data-with-results`):this._dispatch(`${_t.is}-data-without-results`)}_manageError(t){this._hideSpinner(),this._errorMethod=t,this._showErrorModal()}_showErrorModal(){this._errorCounter<this.maxRetries?this._showErrorRetryModal=!0:(this._dispatch(`${_t.is}-show-maximum-error-retry-modal`),this._showMaximumErrorRetryModal=!0),this._errorCounter+=1}_handleFinancialLineStatementsError(){this._manageError(this._getFinancingLineFinancialStatements)}_handleFinancialLineStatementSuccess(t){this._financialLineStatementData=null==t?void 0:t.detail,this._hideSpinner(),this._showReceipt=!0,this._errorCounter=0}_handleFinancialLineStatementError(){this._manageError(this._getFinancingLineFinancialStatement)}handleDownloadPdfError(){this._manageError(this._handleButtonRowClick)}handleDownloadPdfSuccess(){this._hideSpinner(),this._errorCounter=0}getDeviceInfo(){var t,a,e,o,i,n,r;return null===(t=window)||void 0===t||null===(a=t.navigator)||void 0===a||null===(e=a.userAgent)||void 0===e||null===(o=e.match)||void 0===o||null===(i=o.call(e,this._userAgentRegex))||void 0===i||null===(n=i[1])||void 0===n||null===(r=n.split)||void 0===r?void 0:r.call(n,";")}get _shouldDisplayIOSFixedHeader(){var t,a;const e=this.getDeviceInfo()||null;return this.iOSFixedHeader&&(null===(t=this._iOSDevices)||void 0===t||null===(a=t.includes)||void 0===a?void 0:a.call(t,null==e?void 0:e[0]))}get _fixedIOSHeader(){return t`
      <div ?hidden="${!this._shouldDisplayIOSFixedHeader}" class="native-fixed-header"></div>
    `}get _financialLineStatementsDmTemplate(){return t`
      <bbva-global-financing-line-financial-statements-api-dm
        .country="${this.locale}"
        .host="${this.host}"
        .version="${this.flexibleFinancingsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @financing-line-financial-statements-api-dm-fetch="${this._handleFinancialLineStatementsSuccess}"
        @financing-line-financial-statements-api-dm-fetch-error="${this._handleFinancialLineStatementsError}"
        @api-dm-error="${this._handleFinancialLineStatementsError}"
        @bbva-global-financing-line-financial-statements-api-dm-module-load=${()=>{this._financialStatementsDmLoaded=!0}}
      >
      </bbva-global-financing-line-financial-statements-api-dm>
    `}get _financialLineStatementDmTemplate(){return t`
      <bbva-global-financing-line-financial-statement-api-dm
        .country="${this.locale}"
        .host="${this.host}"
        .version="${this.flexibleFinancingApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        requiredOtp
        @financing-line-financial-statement-api-dm-fetch="${this._handleFinancialLineStatementSuccess}"
        @financing-line-financial-statement-api-dm-fetch-error="${this._handleFinancialLineStatementError}"
        @api-dm-error="${this._handleFinancialLineStatementError}"
      >
      </bbva-global-financing-line-financial-statement-api-dm>
    `}get _renderBodyContent(){return this._showMainPage?t`
          <div ambient="primary-alt" class="body-content-wrapper">
            ${0===this._financialLineData.length?this._renderEmptyResults:t`
                  <div class="content">
                    <bbva-type-text
                      tag="span"
                      text=${this.t(`${_t.is}-description-key`)}
                      size="S"
                    ></bbva-type-text>
                    ${this._financialLineData.length>1?this._renderRadioButtons:t`
                          <bbva-notification-message
                            message-title=${this.t(`${_t.is}-notification-message-key`)}
                            book-title=""
                          ></bbva-notification-message>
                        `}
                  </div>
                  <div class="button">
                    <bbva-button-default
                      fullwidth
                      text=${this.t(`${_t.is}-consult-key`)}
                      ?disabled="${!this._validateForm()}"
                      @click=${t=>this._onContinueButtonClick(t)}
                    ></bbva-button-default>
                  </div>
                `}
          </div>
        `:m}_onContinueButtonClick(){var t;const{id:a,cutOffDate:e}=(null===(t=this._monthsByYear[this._yearsSelected])||void 0===t?void 0:t.months.find((t=>t.text===this._monthsSelected)))||this._lastDate;this._financialStatementId=a,this._receiptData.date=vt(e),this._getFinancingLineFinancialStatement(),this._dispatch(`${_t.is}-continue-button-click`)}_validateForm(){return this._radioSelected&&!this._showFormSelect||this._yearsSelected&&this._monthsSelected||1===this._financialLineData.length}get _renderRadioButtons(){var a;return t`
      <div class="content-radio-buttons">
        <bbva-form-radio-button
          name="radio"
          divider="full"
          info-message=${this.t(`${_t.is}-radio-button-info-message-key`,{cutOffDate:vt(null===(a=this._lastDate)||void 0===a?void 0:a.cutOffDate)})}
          @change="${()=>this._handleRadioButtonChange(!1)}"
          >${this.t(`${_t.is}-last-account-statement-key`)}
        </bbva-form-radio-button>
        <bbva-form-radio-button name="radio" @change="${()=>this._handleRadioButtonChange(!0)}"
          >${this.t(`${_t.is}-other-account-statement-key`)}
        </bbva-form-radio-button>
        ${this._showFormSelect?t`
              ${this._buildFormSelect("months",this._isOpenedMonthsModal)}
              ${this._buildFormSelect("years",this._isOpenedYearsModal)}
            `:m}
      </div>
    `}_handleRadioButtonChange(t){let a="last";t&&(this._yearsSelected="",this._monthsSelected="",a="other",this._parseDates()),this._showFormSelect=t,this._radioSelected=!0,this._dispatch(`${_t.is}-${a}-statement-selected`)}_buildFormSelect(a,e){return t`
      <bbva-form-select
        class=${`${a}-selector`}
        optional-label=""
        label=${this.t(`${_t.is}-${a}-label-key`)}
        @bbva-form-select-selected-item=${t=>this._updateOptions(`${a}`,t)}
        @click="${t=>this._checkOpened(t,a)}"
        ?opened=${e}
      >
        ${_t._buildOption(this[`_${a}Available`])}
      </bbva-form-select>
    `}_checkOpened({currentTarget:t},a){const e=t.opened;e&&!this[`_isOpened${ut(a)}Modal`]&&this._dispatch(`${_t.is}-${a}-modal-visible`),this[`_isOpened${ut(a)}Modal`]=e}static _buildOption(a){return a.map((a=>t`
        <bbva-form-option ?disabled=${a.disabled} value=${a.text}>${a.text} </bbva-form-option>
      `))}_updateOptions(t,{detail:a}){const e=null==a?void 0:a.value;"months"===t?this._yearsAvailable=function(t,a){const e=[];return Object.keys(t).forEach((o=>{const i=t[o].months.find((t=>t.text===a)),n=!i||!1===i.disabled;e.push({text:o,disabled:!n})})),e}(this._monthsByYear,e):this._monthsAvailable=this._monthsByYear[e].months,this[`_${t}Selected`]=e,this._dispatch(`${_t.is}-${t}-selected`,e)}get _renderEmptyResults(){return t`
      <div class="empty-state">
        <bbva-clip-microillustration
          microillustration="emptystateday"
          size="M"
        ></bbva-clip-microillustration>
        <bbva-type-text
          size="XL"
          tag="span"
          font-weight="700"
          .text=${this.t(`${_t.is}-empty-text-key`)}
        ></bbva-type-text>
      </div>
    `}get _receiptConfig(){return{...bt(this._modalData.receipt_modal,this._modalData.receipt_modal.mode),receiptData:{...this._receiptData,language:this.language,localCurrency:this.localCurrency}}}_handleButtonRowClick(){const t={value:this._financialLineStatementData,...this.pdfDownloadParams};this._showSpinner(),this._dispatch(`${_t.is}-download-pdf`,t)}get _renderReceiptModal(){return t`
      <card-information-monthly-statement-enquiry-card-flexible-financing-section
        ?visible="${this._showReceipt}"
        .data="${this._receiptConfig}"
        mode="receiptModal"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        @button-row-item-click="${this._handleButtonRowClick}"
        reset-content-scroll
      ></card-information-monthly-statement-enquiry-card-flexible-financing-section>
    `}_retryApiCall(){this._showErrorRetryModal=!1,this._errorCounter<=this.maxRetries?this._errorMethod():(this._dispatch(`${_t.is}-show-maximum-error-retry-modal`),this._showMaximumErrorRetryModal=!0)}_callToBank(){this._dispatch(`${_t.is}-call-to-bank`,{value:this.userPhone})}get _errorRetryModalConfig(){return bt(this._modalData.error_retry_modal,this._modalData.error_retry_modal.mode)}get _errorMaximumRetryModalConfig(){const t=this.disableCallBbva?this._modalData.error_maximum_retries_modal_disabled_call_bbva:this._modalData.error_maximum_retries_modal;return bt(t,t.mode)}get _renderErrorRetryModal(){return t`
      <card-information-monthly-statement-enquiry-card-flexible-financing-section
        ?visible="${this._showErrorRetryModal}"
        .data="${this._errorRetryModalConfig}"
        mode="errorRetryModal"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        reset-content-scroll
      ></card-information-monthly-statement-enquiry-card-flexible-financing-section>
    `}get _renderMaximumErrorRetriesModal(){return t`
      <card-information-monthly-statement-enquiry-card-flexible-financing-section
        ?visible="${this._showMaximumErrorRetryModal}"
        ?disable-call-bbva="${this.disableCallBbva}"
        .data="${this._errorMaximumRetryModalConfig}"
        mode="${this._errorMaximumRetryModalConfig.mode}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        reset-content-scroll
      ></card-information-monthly-statement-enquiry-card-flexible-financing-section>
    `}get _renderModalContent(){return t`
      ${this._renderReceiptModal} ${this._renderErrorRetryModal}
      ${this._renderMaximumErrorRetriesModal}
    `}get _apisTemplates(){return t`
      ${this._financialLineStatementsDmTemplate} ${this._financialLineStatementDmTemplate}
    `}_onReceiptHeaderClick(){this._showReceipt=!1}_manageBackNavigation(){this._isOpenedInfoModal?this._forceCloseModals():this._isOpenedErrorModal&&this._showMainPage?this._closeErrorModal():(this._goToBack(),this.reset())}nativeBackNavigation(t){var a,e,o,i;(null==t||null===(a=t.value)||void 0===a||null===(e=a.cancelledNavigation)||void 0===e?void 0:e.currentPage)!==this.pageName||null!==(o=this.config)&&void 0!==o&&null!==(i=o.loader)&&void 0!==i&&i.visible||this._manageBackNavigation()}get _isOpenedInfoModal(){return this._isOpenedYearsModal||this._isOpenedMonthsModal}get _isOpenedErrorModal(){return this._showErrorRetryModal||this._showMaximumErrorRetryModal}_closeErrorModal(){this._showErrorRetryModal=!1,this._showMaximumErrorRetryModal=!1}_forceCloseModals(){this._isOpenedYearsModal=!1,this._isOpenedMonthsModal=!1}_goToBack(){this._dispatch(`${_t.is}-go-to-back`)}handleOtpCancelled(){this._hideSpinner(),this._dispatch(`${_t.is}-otp-cancelled`)}_dispatch(t,a=null){!function(t,a,e){t.dispatchEvent(new CustomEvent(a,{detail:e,bubbles:!0,composed:!0}))}(this,t,a)}render(){return t`
      ${this._fixedIOSHeader} ${super.render()} ${this._apisTemplates} ${this._renderBodyContent}
      ${this._renderModalContent}
    `}}customElements.define(_t.is,_t);
