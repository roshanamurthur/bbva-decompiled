import{z as t,aS as e,L as a,ak as i,h as s,a8 as r,ab as n,ap as o,bb as l,cw as d,aV as c,i as p,an as h,aN as m,ee as g,ef as u,aX as b,a9 as f,cP as v,cJ as y,ck as _,cQ as x,eg as S,eh as k,ei as $,ej as T,ek as P,W as C}from"./952f98a9.js";import{R as E,S as w,v as B,a1 as D,D as A,a2 as O,G as I,w as R,T as q,x as F,a5 as L,Y as M,az as G,a6 as V,Z as z,aA as j,N as K,z as N,K as U,H as X,M as W,L as H,I as Y,d as J,t as Q,a4 as Z,Q as tt,E as et,ag as at,a3 as it,aC as st,aq as rt,aw as nt}from"./216055dc.js";import{a as ot}from"./e352c657.js";import{a as lt,e as dt,c as ct,d as pt}from"./19a62a96.js";import{bR as ht,bS as mt,bT as gt,bU as ut}from"./7f3d7ca9.js";import{B as bt,a as ft}from"./095cef71.js";import{B as vt}from"./ab4d0dcb.js";import{B as yt,b as _t}from"./6b902eda.js";import{O as xt}from"./f891897b.js";import{b as St,B as kt}from"./161ddab1.js";import{B as $t}from"./5d7c176a.js";import"./eb966b2a.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./be12d7a2.js";import"./77df3611.js";import"./72e6e777.js";class Tt extends lt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`personal-finances/v${this.version}/petty-expenses/balances`)}toString(){return super.toString("BGADPPersonalFinancesPettyExpensesBalancesGetV1")}}class Pt extends lt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`personal-finances/v${this.version}/pfms/{pfm-id}/budgets`)}toString(){return super.toString("BGADPPersonalFinancesPfmsPfmBudgetsGetV1")}}class Ct extends dt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`personal-finances/v${this.version}/pfms/{pfm-id}/budgets`)}toString(){return super.toString("BGADPPersonalFinancesPfmsPfmBudgetsPostV1")}}class Et extends ct{static get is(){return"bbva-global-pfm-budgets-api-dm"}static get properties(){return{pfmBudgets:{type:Array,attribute:!1}}}constructor(){super(),this.pfmBudgets=[]}resetPfmBudgets(){this.pfmBudgets=[]}getPfmBudgets(t,e={}){if(Object.keys(this.pfmBudgets).length)return;e=Object.assign({"pfm-id":t},e),this._generateGetService(this._getService("get",{},e),{customEvent:"pfm-budgets-api-dm-fetch",paginationEvent:"pfm-budgets-api-dm-pagination",errorFireEventHandler:"pfm-budgets-api-dm-fetch-error"},this._responseMapping,e.fields)}postPfmBudgets(t,e){const a={"pfm-id":t};this._generateGetService(this._getService("post",e,a),{customEvent:"pfm-budgets-api-dm-create",errorFireEventHandler:"pfm-budgets-api-dm-create-error"},this._responseMapping),this.resetPfmBudgets()}_getService(t,e={},a={}){const i=this._getServiceParams(a,e);return this._getServicePath(`${t}PfmBudgets`,this._getBgadp(i))}_getBgadp(t){return{getPfmBudgetsV1:()=>new Pt(t),postPfmBudgetsV1:()=>new Ct(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}}class wt extends ct{static get is(){return"bbva-global-petty-expenses-balances-api-dm"}static get properties(){return{pettyExpensesBalances:{type:Object,attribute:!1}}}constructor(){super(),this.pettyExpensesBalances={}}resetPettyExpensesBalances(){this.pettyExpensesBalances={}}getPettyExpensesBalances(t={}){if(Object.keys(this.pettyExpensesBalances).length)return;this._generateGetService(this._getService("get",{},t),{customEvent:"petty-expenses-balances-api-dm-fetch",errorFireEventHandler:"petty-expenses-balances-api-dm-fetch-error"},this._responseMapping,t.fields)}_getService(t,e={},a={}){const i=this._getServiceParams(a,e);return this._getServicePath(`${t}PettyExpensesBalances`,this._getBgadp(i))}_getBgadp(t){return{getPettyExpensesBalancesV1:()=>new Tt(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}}class Bt extends ct{static get is(){return"bbva-global-balances-search-api-dm"}static get properties(){return{balancesSearch:{type:Object,attribute:!1}}}constructor(){super(),this.balancesSearch={}}resetBalancesSearch(){this.balancesSearch={}}postBalancesSearch(t){if(Object.keys(this.balancesSearch).length)return;this._generateGetService(this._getService("post",t),{customEvent:"balances-search-api-dm-fetch",errorFireEventHandler:"balances-search-api-dm-fetch-error"},this._responseMapping)}_getService(t,e={},a={}){const i=this._getServiceParams(a,e);return this._getServicePath(`${t}BalancesSearch`,this._getBgadp(i))}_getBgadp(t){return{postBalancesSearchV2:()=>new ht(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}}class Dt extends ct{static get is(){return"bbva-global-forecast-balances-search-api-dm"}static get properties(){return{forecastBalancesSearch:{type:Object,attribute:!1}}}constructor(){super(),this.forecastBalancesSearch={}}resetForecastBalancesSearch(){this.forecastBalancesSearch={}}postForecastBalancesSearch(t){if(Object.keys(this.forecastBalancesSearch).length)return;this._generateGetService(this._getService("post",t),{customEvent:"forecast-balances-search-api-dm-fetch",errorFireEventHandler:"forecast-balances-search-api-dm-fetch-error"},this._responseMapping)}_getService(t,e={},a={}){const i=this._getServiceParams(a,e);return this._getServicePath(`${t}ForecastBalancesSearch`,this._getBgadp(i))}_getBgadp(t){return{postForecastBalancesSearchV2:()=>new bt(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}}class At extends ct{static get is(){return"bbva-global-recurring-expenses-balances-search-api-dm"}static get properties(){return{recurringExpensesBalancesSearch:{type:Object,attribute:!1}}}constructor(){super(),this.recurringExpensesBalancesSearch={}}resetRecurringExpensesBalancesSearch(){this.recurringExpensesBalancesSearch={}}postRecurringExpensesBalancesSearch(t){if(Object.keys(this.recurringExpensesBalancesSearch).length)return;this._generateGetService(this._getService("post",t),{customEvent:"recurring-expenses-balances-search-api-dm-fetch",errorFireEventHandler:"recurring-expenses-balances-search-api-dm-fetch-error"},this._responseMapping)}_getService(t,e={},a={}){const i=this._getServiceParams(a,e);return this._getServicePath(`${t}RecurringExpensesBalancesSearch`,this._getBgadp(i))}_getBgadp(t){return{postRecurringExpensesBalancesSearchV2:()=>new ft(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}}var Ot=t`
  :host {
    box-sizing: border-box;
    display: block;
    align-items: center;
    text-align: center;
    padding: 0 1rem 1rem;
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
    align-items: center;
  }
  dl dd {
    display: flex;
    align-items: center;
  }
  dl dd.description-wrapper {
    justify-content: space-between;
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
        var(--_pfm-pfm-dashboard-list-definition-amount-skeleton-quote-color) 50%
      ),
      linear-gradient(
        -60deg,
        transparent 50%,
        var(--_pfm-pfm-dashboard-list-definition-amount-skeleton-quote-color) 50%
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
    background: var(--_pfm-pfm-dashboard-list-definition-amount-skeleton-animated-layer-bg);
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
`,It=t`
  :host {
    --_pfm-pfm-dashboard-list-definition-amount-skeleton-quote-color: ${E("colorPrimarySurfaceAmbientPreloading",w)};
    --_pfm-pfm-dashboard-list-definition-amount-skeleton-animated-layer-bg: ${E("colorPrimarySurfaceAmbientDefault",w)};
  }
`;class Rt extends(B(e(a))){static get is(){return"pfm-pfm-dashboard-list-definition-amount"}static get scopedElements(){const t=[O,I];return Rt.scopedElementsFromClasses(t)}static get properties(){return{amount:{type:Number},amountVariant:{type:String,attribute:"amount-variant"},currencyCode:{type:String,attribute:"currency-code"},decimalDigits:{type:Number,attribute:"decimal-digits"},discreetMode:{type:Boolean,attribute:"discreet-mode"},heading:{type:String},language:{type:String,attribute:"language"},loading:{type:Boolean,reflect:!0},localCurrency:{type:String,attribute:"local-currency"}}}constructor(){super(),this.amount=0,this.amountVariant="3xl",this.currencyCode="EUR",this.decimalDigits=2,this.discreetMode=!1,this.heading="",this.language="es-ES",this.loading=!1,this.localCurrency="EUR"}static get styles(){return[Ot,It,D.primary,A.primary,i("bbva-list-definition-amount-shared-styles")]}render(){return this.loading?s` <div class="skeleton"></div> `:s`
        <dl>
          <dt>
          <bbva-type-text
              size="S"
              tag="span"
              text="${this.heading}"
              unset
            ></bbva-type-text>
          </dt>
          <dd>
            <bbva-type-amount
              ?mask="${this.discreetMode}"
              .currencyCode="${this.currencyCode}"
              .decimalDigits="${this.decimalDigits}"
              .language="${this.language}"
              .localCurrency="${this.localCurrency}"
              amount="${this.amount}"
              type="bold"
              variant="${this.amountVariant}"
            ></bbva-type-amount>
          </dd>
        </dl>
      </div>
    `}}var qt=t`
  :host {
    display: block;
    position: relative;
    box-sizing: border-box;
    border: none;
    padding: 1rem;
    cursor: pointer;
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

  [data-tag-name='bbva-type-text']#descriptionText {
    margin-top: 0.5rem;
  }

  .header {
    display: flex;
    justify-content: space-between;
    align-items: center;
  }
  .header [data-tag-name='bbva-type-text'] {
    flex: 1;
    margin-left: 0.5rem;
    color: var(--_pfm-pfm-dashboard-list-link-heading-link-color);
    font-weight: var(
      --fontFacePrimaryMediumFontWeight,
      ${r(n.medium.fontWeight)}
    );
  }
  .header [data-tag-name='bbva-type-icon'] {
    fill: var(--_pfm-pfm-dashboard-list-link-heading-link-color);
  }

  :host(:active),
  :host([focus-visible]) {
    background-color: var(--_pfm-pfm-dashboard-list-link-pressed-bg-color);
  }
  :host(:active) [data-tag-name='bbva-type-text']:active,
  :host([focus-visible]) [data-tag-name='bbva-type-text']:active {
    color: var(--_pfm-pfm-dashboard-list-link-pressed-color);
  }
  :host(:active) [data-tag-name='bbva-type-icon'],
  :host([focus-visible]) [data-tag-name='bbva-type-icon'] {
    fill: var(--_pfm-pfm-dashboard-list-link-pressed-color);
  }

  :host([loading]) {
    position: relative;
    overflow: hidden;
    pointer-events: none;
    background-repeat: no-repeat;
    opacity: 1;
    height: 5rem;
    width: 100%;
    margin-left: auto;
    margin-right: auto;
    background-image: linear-gradient(
        var(--_pfm-pfm-dashboard-list-link-skeleton-quote-color) 100%,
        transparent 0
      ),
      linear-gradient(
        -60deg,
        transparent 50%,
        var(--_pfm-pfm-dashboard-list-link-skeleton-quote-color) 50%
      ),
      linear-gradient(
        -60deg,
        var(--_pfm-pfm-dashboard-list-link-skeleton-quote-color) 50%,
        transparent 50%
      );
    background-color: transparent;
    background-size:
      28px 28px,
      calc((40% * 2) + (18px / 2)) 18px,
      calc((8% * 2) + (18px / 2)) 18px;
    background-position:
      16px 14px,
      51px 19px,
      calc(100% - 16px) 19px;
  }
  :host([loading]) .skeleton {
    contain: strict;
    position: absolute;
    left: 0;
    top: 0;
    right: 0;
    bottom: 0;
    background: var(--_pfm-pfm-dashboard-list-link-skeleton-animated-layer-bg);
    opacity: 0.5;
    transform: translateX(200%) scaleX(1);
    transform-origin: right bottom;
    animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
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
`,Ft=t`
  :host {
    --_pfm-pfm-dashboard-list-link-pressed-bg-color: ${E("colorPrimaryAltSurfaceAlternativePressed",w)};
    --_pfm-pfm-dashboard-list-link-heading-link-color: ${E("colorPrimaryLinkMainDefault",w)};
    --_pfm-pfm-dashboard-list-link-pressed-color: ${E("colorPrimaryLinkMainPressed",w)};
    --_pfm-pfm-dashboard-list-link-skeleton-quote-color: ${E("colorPrimarySurfaceAmbientPreloading",w)};
    --_pfm-pfm-dashboard-list-link-skeleton-animated-layer-bg: ${E("colorPrimarySurfaceAmbientDefault",w)};
  }
`;class Lt extends(o(B(R(a)))){static get is(){return"pfm-pfm-dashboard-list-link"}static get scopedElements(){const t=[F,I];return Lt.scopedElementsFromClasses(t)}static get properties(){return{descriptionText:{type:String,attribute:"description-text"},headerText:{type:String,attribute:"header-text"},loading:{type:Boolean,reflect:!0}}}constructor(){super(),this.descriptionText="",this.headerText="",this.loading=!1}static get styles(){return[super.styles,qt,Ft,A.primary,q.primary,i("pfm-pfm-dashboard-shared-styles")]}firstUpdated(t){super.firstUpdated(t),this.setAttribute("role","button"),this.setAttribute("tabindex","0"),this.addEventListener("click",this._linkClicked),this.addEventListener("keydown",this.keyDown)}keyDown(t){32!==t.keyCode&&13!==t.keyCode||this._linkClicked()}get headerTemplate(){return s`
      <div class="header">
        <bbva-type-icon icon=${l()} size="24"></bbva-type-icon>
        <bbva-type-text unset font-weight="500" size="L" text="${this.headerText}"></bbva-type-text>
        <bbva-type-icon icon=${d()} size="16"></bbva-type-icon>
      </div>
      ${this.descriptionText&&s`
          <bbva-type-text
            id="descriptionText"
            size="S"
            tag="span"
            text="${this.descriptionText}"
            unset
          ></bbva-type-text>
        `||c}
    `}_linkClicked(){this.dispatchEvent(new CustomEvent("pfm-pfm-dashboard-list-link-click",{detail:!0,bubbles:!0,composed:!0}))}render(){return this.loading?s` <div class="skeleton"></div> `:this.headerTemplate}}var Mt=t`
  :host {
    display: block;
    box-sizing: border-box;
    text-align: left;
    cursor: pointer;
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

  :host(:active),
  :host([focus-visible]) {
    background-color: var(--_pfm-pfm-dashboard-list-movement-bg-active-color);
  }
  :host(:active) [data-tag-name='bbva-type-text'][variant='spotlight'],
  :host([focus-visible]) [data-tag-name='bbva-type-text'][variant='spotlight'] {
    color: var(--_pfm-pfm-dashboard-list-movement-title-pressed-color);
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
    display: flex;
    overflow: hidden;
  }
  .main-content .title-row .clip-title [data-tag-name='bbva-type-text'] {
    overflow: hidden;
    margin: auto 0.5rem;
  }
  .main-content .title-row [data-tag-name='bbva-type-amount'] {
    margin: auto 0;
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
        var(--_pfm-pfm-dashboard-list-movement-skeleton-quote-color) 50%
      ),
      linear-gradient(
        -60deg,
        var(--_pfm-pfm-dashboard-list-movement-skeleton-quote-color) 50%,
        transparent 50%
      ),
      linear-gradient(
        -60deg,
        transparent 50%,
        var(--_pfm-pfm-dashboard-list-movement-skeleton-quote-color) 50%
      ),
      linear-gradient(
        -60deg,
        var(--_pfm-pfm-dashboard-list-movement-skeleton-quote-color) 50%,
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
    background: var(--_pfm-pfm-dashboard-list-movement-skeleton-animated-layer-bg);
    opacity: 0.5;
    transform: translateX(200%) scaleX(1);
    transform-origin: right bottom;
    animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
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
`,Gt=t`
  :host {
    --_pfm-pfm-dashboard-list-movement-bg-active-color: ${E("colorPrimarySurfaceAlternativeDefault",w)};
    --_pfm-pfm-dashboard-list-movement-title-pressed-color: ${E("colorPrimaryLinkMainPressed",w)};
    --_pfm-pfm-dashboard-list-movement-skeleton-quote-color: ${E("colorPrimarySurfaceAmbientPreloading",w)};
    --_pfm-pfm-dashboard-list-movement-skeleton-animated-layer-bg: ${E("colorPrimarySurfaceAmbientDefault",w)};
  }
`;class Vt extends(o(B(R(a)))){static get is(){return"pfm-pfm-dashboard-list-movement"}static get scopedElements(){const t=[V,gt,z,j,O,I];return Vt.scopedElementsFromClasses(t)}static get properties(){return{amount:{type:Number},amountType:{type:String,attribute:"amount-type"},bgColorClip:{type:String,attribute:"bg-color-clip"},cardTitle:{type:String,attribute:"card-title"},currencyCode:{type:String,attribute:"currency-code"},description:{type:String},discreetMode:{type:Boolean,attribute:"discreet-mode",reflect:!0},iconClip:{type:String,attribute:"icon-clip"},language:{type:String,reflect:!0},loading:{type:Boolean,reflect:!0}}}constructor(){super(),this.amountType="",this.bgColorClip="",this.cardTitle="",this.description="",this.discreetMode=!1,this.iconClip="",this.language="es-ES",this.loading=!1}static get styles(){return[Mt,Gt,L.primary,mt.primary,M.primary,G.primary,D.primary,A.primary,i("pfm-pfm-dashboard-list-movement")]}firstUpdated(t){super.firstUpdated(t),this.setAttribute("role","button"),this.setAttribute("tabindex","0"),this.addEventListener("click",this._onClick),this.addEventListener("keydown",this.keyDown)}keyDown(t){(32===t.keyCode||13===t.keyCode&&!this.loading)&&this._onClick()}get _listMovementImageItem(){return{bgColor:this.bgColorClip,icon:this.iconClip,size:"xs"}}render(){return s`
      ${this.loading&&s` <div class="skeleton"></div> `||s`
        <div class="main-content">
          <div class="title-row">
            <div class="clip-title">
              ${this.iconClip?s`
                    <bbva-clip-box
                      .group=${[this._listMovementImageItem]}
                      ambient="primary"
                    ></bbva-clip-box>
                  `:c}
              <bbva-type-text
                ambient="primary"
                ellipsis
                size="L"
                tag="span"
                text="${this.cardTitle}"
                unset
                variant="spotlight"
              ></bbva-type-text>
            </div>
            <bbva-type-amount
              ?mask="${this.discreetMode}"
              ambient="primary"
              amount="${this.amount}"
              currency-code="${p(this.currencyCode)}"
              language="${this.language}"
              local-currency="${p(this.currencyCode)}"
              type="${p(this.amountType)}"
              variant="xl"
            ></bbva-type-amount>
          </div>
          <bbva-badge-default
            ambient="primary"
            class="extended-concept"
            text="${this.description}"
            type="neutral"
          ></bbva-badge-default>
        </div>
      `}
    `}_onClick(){this.dispatchEvent(new CustomEvent("pfm-pfm-dashboard-list-movement-item-click"))}}var zt=t`
  :host {
    display: block;
    box-sizing: border-box;
    padding: 1rem;
    cursor: pointer;
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

  .accessible-hide {
    border: 0;
    clip: rect(0 0 0 0);
    height: 1px;
    margin: -1px;
    overflow: hidden;
    padding: 0;
    position: absolute;
    width: 1px;
  }

  :host(:active),
  :host([focus-visible]) {
    background-color: var(--_pfm-pfm-dashboard-list-progress-pressed-bg-color);
  }
  :host(:active) [data-tag-name='bbva-type-text'][variant='spotlight'],
  :host([focus-visible]) [data-tag-name='bbva-type-text'][variant='spotlight'] {
    color: var(--_pfm-pfm-dashboard-list-progress-pressed-color);
  }

  .heading-wrapper {
    display: flex;
    justify-content: space-between;
    align-items: center;
    margin-bottom: 0.5rem;
  }

  [data-tag-name='bbva-type-icon'] {
    flex-shrink: 0;
    margin-right: 0.5rem;
    color: var(--_list-progress-icon-color);
  }

  .footer-wrapper {
    display: flex;
    justify-content: flex-end;
    align-items: center;
    margin-top: 0.5rem;
  }
  .footer-wrapper [data-tag-name='bbva-type-amount'] {
    margin-left: 0.5rem;
  }
  .footer-wrapper [data-tag-name='bbva-type-icon'] {
    margin-right: 0.5rem;
    --bbva-type-icon--custom--primary-ambient--color: ${E("colorPrimarySupportErrorDefault",w)};
  }

  :host([loading]) {
    position: relative;
    overflow: hidden;
    pointer-events: none;
    background-repeat: no-repeat;
    opacity: 1;
    height: 6.5rem;
    width: 100%;
    margin-left: auto;
    margin-right: auto;
    background-image: radial-gradient(
        48px 100%,
        var(--_pfm-pfm-dashboard-list-progress-skeleton-quote-color) 50%,
        transparent 50%
      ),
      linear-gradient(
        -60deg,
        transparent 50%,
        var(--_pfm-pfm-dashboard-list-progress-skeleton-quote-color) 50%
      ),
      linear-gradient(
        -60deg,
        transparent 50%,
        var(--_pfm-pfm-dashboard-list-progress-skeleton-quote-color) 50%
      );
    background-color: transparent;
    background-size:
      48px 48px,
      calc((40% * 2) + (16px / 2)) 16px,
      calc((88% * 2) + (14px / 2)) 14px;
    background-position:
      16px 14px,
      78px 30px,
      16px 72px;
  }
  :host([loading]) .skeleton {
    contain: strict;
    position: absolute;
    left: 0;
    top: 0;
    right: 0;
    bottom: 0;
    background: var(--_pfm-pfm-dashboard-list-progress-skeleton-animated-layer-bg);
    opacity: 0.5;
    transform: translateX(200%) scaleX(1);
    transform-origin: right bottom;
    animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
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
`,jt=t`
  :host {
    --_pfm-pfm-dashboard-list-progress-pressed-bg-color: ${E("colorPrimaryAltSurfaceAlternativePressed",w)};
    --_pfm-pfm-dashboard-list-progress-pressed-color: ${E("colorPrimaryLinkMainPressed",w)};
    --_pfm-pfm-dashboard-list-progress-skeleton-quote-color: ${E("colorPrimarySurfaceAmbientPreloading",w)};
    --_pfm-pfm-dashboard-list-progress-skeleton-animated-layer-bg: ${E("colorPrimarySurfaceAmbientDefault",w)};
  }
`;class Kt extends(o(e(B(h(a))))){static get is(){return"pfm-pfm-dashboard-list-progress"}static get scopedElements(){const t=[kt,O,F,I];return Kt.scopedElementsFromClasses(t)}static get properties(){return{amount:{type:Number},currencyCode:{type:String,attribute:"currency-code"},currentValue:{type:Number,attribute:"current-value"},decimalDigits:{type:Number,attribute:"decimal-digits"},description:{type:String},discreetMode:{type:Boolean,attribute:"discreet-mode",reflect:!0},heading:{type:String},icon:{type:Boolean},language:{type:String,reflect:!0},loading:{type:Boolean,reflect:!0},localCurrency:{type:String,attribute:"local-currency"},maxValue:{type:Number,attribute:"max-value"},secondaryAmount:{type:Number,attribute:"secondary-amount"}}}constructor(){super(),this.amount=0,this.currencyCode="EUR",this.currentValue=0,this.decimalDigits=2,this.description="",this.discreetMode=!1,this.heading="",this.icon=!1,this.language="es-ES",this.loading=!1,this.localCurrency="EUR"}static get styles(){return[zt,jt,St.primary,D.primary,q.primary,A.primary,i("bbva-list-progress-shared-styles")]}firstUpdated(t){super.firstUpdated(t),this.setAttribute("role","button"),this.setAttribute("tabindex","0"),this.addEventListener("click",this._linkClicked),this.addEventListener("keydown",this.keyDown)}keyDown(t){32!==t.keyCode&&13!==t.keyCode||this._linkClicked()}renderTitle(){return s`
      <div class="heading-wrapper">
        ${Kt._tplText({text:this.heading,variant:"spotlight",fontWeight:"bold",size:"L"})}
        ${Kt._tplAmount({amount:this.amount,variant:"l",currencyCode:this.currencyCode,decimalDigits:this.decimalDigits,language:this.language,discreetMode:this.discreetMode,localCurrency:this.localCurrency})}
      </div>
    `}renderFooter(){return this.secondaryAmount||0===this.secondaryAmount||this.description||this.icon?s`
          <div class="footer-wrapper">
            ${this.icon?s`
                  <bbva-type-icon
                    aria-label="${this.t("pfm-pfm-dashboard-aria-label-error-message")}"
                    icon="${m()}"
                    role="img"
                    size="16"
                  ></bbva-type-icon>
                `:c}
            ${Kt._tplText({size:"S",text:this.description})}
            ${this.secondaryAmount||0===this.secondaryAmount?Kt._tplAmount({amount:this.secondaryAmount,currencyCode:this.currencyCode,decimalDigits:this.decimalDigits,discreetMode:this.discreetMode,language:this.language,localCurrency:this.localCurrency,variant:"m"}):c}
          </div>
        `:c}static _tplAmount({amount:t,currencyCode:e,decimalDigits:a,discreetMode:i,language:r,localCurrency:n,variant:o}){return s`
      <bbva-type-amount
        ?mask="${i}"
        amount="${t}"
        currency-code="${e}"
        decimal-digits="${p(a)}"
        language="${r}"
        local-currency="${n}"
        variant="${o}"
      >
      </bbva-type-amount>
    `}static _tplText({text:t,variant:e,size:a,fontWeight:i}){return s`
      <bbva-type-text
        font-weight="${p(i)}"
        size="${a}"
        tag="span"
        text="${t}"
        unset
        variant="${p(e)}"
      ></bbva-type-text>
    `}render(){return this.loading?s` <div class="skeleton"></div> `:s`
          ${this.renderTitle()}
          <bbva-data-visualization-bar
            .fillColor="${this.fillColor}"
            ambient="primary"
            aria-hidden="true"
            current-value="${p(this.currentValue)}"
            max-value="${p(this.maxValue)}"
          ></bbva-data-visualization-bar>
          ${this.renderFooter()}
        `}_linkClicked(){this.dispatchEvent(new CustomEvent("pfm-pfm-dashboard-list-progress-click"))}}var Nt=t`
  :host {
    display: flex;
    flex-direction: column;
    box-sizing: border-box;
    text-align: left;
    padding: 1.5rem 1rem;
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

  .title {
    margin-bottom: 0.5rem;
  }

  .description {
    margin-bottom: 0.5rem;
  }

  [data-tag-name='bbva-clip-microillustration'] {
    margin-bottom: 1rem;
  }

  :host([loading]) {
    position: relative;
    overflow: hidden;
    pointer-events: none;
    background-repeat: no-repeat;
    opacity: 1;
    width: 100%;
    min-height: 18.5rem;
    flex: 1;
    margin-left: auto;
    margin-right: auto;
    background-image: linear-gradient(
        var(--_pfm-pfm-dashboard-panel-info-skeleton-quote-color) 100%,
        transparent 0
      ),
      linear-gradient(
        -60deg,
        transparent 50%,
        var(--_pfm-pfm-dashboard-panel-info-skeleton-quote-color) 50%
      ),
      linear-gradient(
        -60deg,
        transparent 50%,
        var(--_pfm-pfm-dashboard-panel-info-skeleton-quote-color) 50%
      ),
      linear-gradient(
        -60deg,
        transparent 50%,
        var(--_pfm-pfm-dashboard-panel-info-skeleton-quote-color) 50%
      );
    background-color: transparent;
    background-size:
      80px 80px,
      calc((60% * 2) + (16px / 2)) 16px,
      calc((85% * 2) + (16px / 2)) 16px,
      calc((30% * 2) + (16px / 2)) 16px;
    background-position:
      16px 24px,
      16px 120px,
      16px 144px,
      16px 168px;
  }
  :host([loading]) .skeleton {
    contain: strict;
    position: absolute;
    left: 0;
    top: 0;
    right: 0;
    bottom: 0;
    opacity: 0.5;
    height: 13rem;
    transform: translateX(200%) scaleX(1);
    transform-origin: right bottom;
    animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
    background: var(--_pfm-pfm-dashboard-panel-info-skeleton-animated-layer-bg);
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
`,Ut=t`
  :host {
    --_pfm-pfm-dashboard-panel-info-skeleton-quote-color: ${E("colorPrimarySurfaceAmbientPreloading",w)};
    --_pfm-pfm-dashboard-panel-info-skeleton-animated-layer-bg: ${E("colorPrimarySurfaceAmbientDefault",w)};
  }
`;class Xt extends(o(B(R(a)))){static get is(){return"pfm-pfm-dashboard-panel-info"}static get scopedElements(){const t=[U,X,I];return Xt.scopedElementsFromClasses(t)}static get properties(){return{description:{type:String},heading:{type:String},headingLevelTitle:{type:String,attribute:"heading-level-title"},linkText:{type:String,attribute:"link-text"},loading:{type:Boolean,reflect:!0},microillustration:{type:String},microillustrationSize:{type:String,attribute:"microillustration-size"}}}constructor(){super(),this.description="",this.heading="",this.headingLevelTitle="h2",this.linkText="",this.loading=!1,this.microillustration="",this.microillustrationSize="L"}static get styles(){return[Nt,Ut,K.primary,N.primary,A.primary]}static _getBbvaTypeText(t,e,a,i,r){return s`
      <bbva-type-text
        class="${i}"
        font-weight="${a}"
        size="${e}"
        tag="${r}"
        text="${t}"
        unset
      ></bbva-type-text>
    `}render(){return s`
      ${this.loading&&s` <div class="skeleton"></div> `||s`
        <bbva-clip-microillustration
          aria-hidden="true"
          disabled-tabindex
          microillustration="${this.microillustration}"
          size="${this.microillustrationSize}"
        ></bbva-clip-microillustration>
        ${this.heading?Xt._getBbvaTypeText(this.heading,"XL","700","title",this.headingLevelTitle):c}
        ${this.description?Xt._getBbvaTypeText(this.description,"S","300","description","span"):c}
        ${this.linkText&&s`
            <bbva-type-link size="S" @click="${this._linkClickHandler}"
              ><span>${this.linkText}</span></bbva-type-link
            >
          `||c}
      `}
    `}_linkClickHandler(){this.dispatchEvent(new CustomEvent("pfm-pfm-dashboard-panel-info-link-click",{detail:!0,bubbles:!0,composed:!0}))}}function Wt(t,e,a,i){const s=g({amount:t,language:a,decimalDigits:2,localCurrency:e,currencyCode:e}),r="••••";let n="";return n=i?u(e)?`${r} ${s.currencySymbol}`:`${s.currencySymbol} ${r}`:u(e)?`${s.integer}${s.separator}${s.fractional} ${s.currencySymbol}`:`${s.currencySymbol} ${s.integer}${s.separator}${s.fractional}`,n}var Ht=t`
  :host {
    display: block;
    box-sizing: border-box;
    margin-top: 3.75rem;
    background-color: var(--_pfm-pfm-dashboard-bg-ambient-primary);
  }
  :host [role='listitem'] {
    position: relative;
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

  [data-tag-name='bbva-divider-default'].fit {
    display: block;
    margin: 0 1rem;
  }

  @supports (margin-top: constant(safe-area-inset-top)) {
    :host {
      --pfm-pfm-dashboard-safe-area-inset-top: constant(safe-area-inset-top);
      padding-top: var(--pfm-pfm-dashboard-safe-area-inset-top, 0);
    }
  }
  @supports (margin-top: env(safe-area-inset-top)) {
    :host {
      --pfm-pfm-dashboard-safe-area-inset-top: env(safe-area-inset-top);
      padding-top: var(--pfm-pfm-dashboard-safe-area-inset-top, 0);
    }
  }
  [data-tag-name='bbva-tab-default'] {
    margin-bottom: 0;
  }

  [data-tag-name='bbva-type-text'].paragraph {
    margin: 0 1rem 1rem;
  }

  [data-tag-name='bbva-notification-message'],
  [data-tag-name='bbva-notification-contextual'] {
    margin: 0 1rem 1rem;
  }

  [data-tag-name='proactivity-message'] {
    padding: 1rem;
  }

  [data-tag-name='bbva-header-category'] {
    padding: 0.5rem 1rem;
  }
  [data-tag-name='bbva-header-category'][variant='date'] {
    padding: 1rem;
  }
  [data-tag-name='bbva-header-category'].no-padding-bottom {
    padding-bottom: 0;
  }

  [data-tag-name='bbva-data-visualization-bar'] {
    width: auto;
    margin: 0.5rem 1rem;
  }

  [ambient='primary'] {
    background-color: var(--_pfm-pfm-dashboard-bg-ambient-primary);
  }

  .tab-panel {
    padding-top: 1rem;
  }
`,Yt=t`
  :host {
    --_pfm-pfm-dashboard-bg-ambient-primary: ${E("colorPrimarySurfaceAmbientDefault",w)};
  }
`;const Jt="error",Qt="loading",Zt="success",{moment:te}=window;class ee extends(b(W(H(h(a))))){static get is(){return"pfm-pfm-dashboard"}static get scopedElements(){const t=[Y,Bt,J,Dt,pt,Q,At,Z,vt,tt,yt,O,F,X,I,xt,Rt,Lt,Vt,Kt,Xt,ut,...ee.configurationScopedElements()];return{"bbva-global-retail-financial-overview-api-dm":ot,...ee.scopedElementsFromClasses(t)}}static get styles(){return[Ht,Yt,et.primary,at,it.primary,_t.primary,D.primary,q.primary,N.primary,A.primary,i("pfm-pfm-dashboard-shared-styles")]}static get properties(){return{appSettingsApiVersion:{type:String,attribute:"app-settings-api-version"},balances:{type:Object},balancesApiVersion:{type:String,attribute:"balances-api-version"},balancesSearchCacheKey:{type:String,attribute:"balances-search-cache-key"},cacheKey:{type:String,attribute:"cache-key"},cacheType:{type:String,attribute:"cache-type"},channelId:{type:String,attribute:"channel-id"},contentFragmentHost:{type:String,attribute:"content-fragment-host"},contentFragmentPath:{type:String,attribute:"content-fragment-path"},contractId:{type:String,attribute:"contract-id"},contractSubtypeId:{type:String,attribute:"contract-subtype-id"},contractTypeId:{type:String,attribute:"contract-type-id"},debitCardType:{type:String,attribute:"debit-card-type"},discreetMode:{type:Boolean,attribute:"discreet-mode"},emplacement:{type:String},expensesGroupId:{type:String,attribute:"expenses-group-id"},externalProducts:{type:Array,attribute:"external-products"},financialOverviewApiVersion:{type:String,attribute:"financial-overview-api-version"},financialOverviewCacheKey:{type:String,attribute:"financial-overview-cache-key"},forecastBalancesCacheKey:{type:String,attribute:"forecast-balances-cache-key"},hideConfigPfm:{type:Boolean,attribute:"hide-config-pfm"},incomesGroupId:{type:String,attribute:"incomes-group-id"},internalProducts:{type:Array,attribute:"internal-products"},investmentSavingsFinancingGroupId:{type:String,attribute:"investment-savings-financing-group-id"},localCurrency:{type:String,attribute:"local-currency"},personalFinancesApiVersion:{type:String,attribute:"personal-finances-api-version"},personName:{type:String,attribute:"person-name"},pfmId:{type:String,attribute:"pfm-id"},pfmKeySettings:{type:String,attribute:"pfm-key-settings"},pfmsCacheKey:{type:String,attribute:"pfms-cache-key"},proactivityMessageAemKey:{type:String,attribute:"proactivity-message-aem-key"},proactivityMessagePublicSettingsEndpoint:{type:String,attribute:"proactivity-message-public-settings-endpoint"},publicSettings:{type:Array,attribute:"public-settings"},publicSettingsHost:{type:String,attribute:"public-settings-host"},publicSettingsId:{type:String,attribute:"public-settings-id"},publicSettingsRequiredToken:{type:String,attribute:"public-settings-required-token"},recurringExpensesBalancesCacheKey:{type:String,attribute:"recurring-expenses-balances-cache-key"},relatedContracts:{type:Array,attribute:"related-contracts"},relevantFacts:{type:Array,attribute:"relevant-facts"},requiredTokenProactivity:{type:String,attribute:"required-token-proactivity"},retailFinancialOverviewApiVersion:{type:String,attribute:"retail-financial-overview-api-version"},retailFinancialOverviewCacheKey:{type:String,attribute:"retail-financial-overview-cache-key"},retailFinancialOverviewCountry:{type:String,attribute:"retail-financial-overview-country"},selectedTab:{type:Number,attribute:"selected-tab"},showDetailCard:{type:Boolean,attribute:"show-detail-card"},showForecastingLink:{type:Boolean,attribute:"show-forecasting-link"},showProactivityCard:{type:Boolean,attribute:"show-proactivity-card"},showRecurringExpensesLink:{type:Boolean,attribute:"show-recurring-expenses-link"},showUndatedEstimates:{type:Boolean,attribute:"show-undated-estimates"},showWelcomeOnboarding:{type:Boolean,attribute:"show-welcome-onboarding"},showWelcomeTooltips:{type:Boolean,attribute:"show-welcome-tooltips"},titles:{type:Object},useExternalProducts:{type:Boolean,attribute:"use-external-products"},_balanceSearchStatus:{type:String},_commonMonthlyPeriod:{type:Object},_defaultCategory:{type:Object},_expenses:{type:Object},_forecastStatus:{type:String},_globalPfmStatus:{type:String},_groupsData:{type:Array},_incomes:{type:Object},_pendingAmount:{type:String},_personExpenseAmount:{type:Number},_pfmPeriod:{type:Object},_recurringExpensesStatus:{type:String},_tooltipOrder:{type:Array},_tooltipPositionToShow:{type:Number}}}constructor(){super(),this._defaultCategory={color:f.primaryCoreLight,icon:v.shopping.icon},this._commonMonthlyPeriod={startDate:te().startOf("month").toISOString(),endDate:te().endOf("month").toISOString()},this._balanceSearchStatus=Qt,this._forecastStatus=Qt,this._globalPfmStatus=Qt,this._pendingAmount="",this._personExpenseAmount=80,this._recurringExpensesStatus=Qt,this._tooltipOrder=["configurateProducts","dashboardPeriod","incomes","expenses"],this._tooltipPositionToShow=0,this.appSettingsApiVersion="0",this.balancesApiVersion="2",this.cacheKey="ckPfmPfmDashboard",this.cacheType="LOCAL",this.channelId="BBVANet",this.contentFragmentHost="",this.contentFragmentPath="",this.debitCardType="DEBIT_CARD",this.discreetMode=!1,this.emplacement="DAY_TO_DAY",this.expensesGroupId="103",this.financialOverviewApiVersion="4",this.hideConfigPfm=!1,this.incomesGroupId="101",this.investmentSavingsFinancingGroupId="102",this.language="es-ES",this.localCurrency="EUR",this.personalFinancesApiVersion="2",this.personName="",this.proactivityMessageAemKey="",this.proactivityMessagePublicSettingsEndpoint="",this.publicSettings={},this.publicSettingsRequiredToken="none",this.requiredTokenProactivity="",this.retailFinancialOverviewApiVersion="1",this.retailFinancialOverviewCountry="",this.selectedTab=0,this.showDetailCard=!1,this.showForecastingLink=!1,this.showProactivityCard=!1,this.showRecurringExpensesLink=!1,this.showUndatedEstimates=!1,this.showWelcomeOnboarding=!1,this.showWelcomeTooltips=!1,this.useExternalProducts=!1,this.titles={101:"pfm-pfm-dashboard-entry-title",102:"pfm-pfm-dashboard-investments-title",103:"pfm-pfm-dashboard-expense-title"},this.config={header:{id:"main-header",leftIconAriaLabel:this.t("pfm-pfm-dashboard-return"),leftIconLabel:this.t("pfm-pfm-dashboard-return"),position:"fixed",showLeftIcon:!0,text:this.t("pfm-pfm-dashboard-title"),variant:"first-level-sequential",buttons:[{accessibilityText:this.t("pfm-pfm-dashboard-help"),icon:y(),id:"btn-help",label:this.t("pfm-pfm-dashboard-help")},{accessibilityText:this.t("pfm-pfm-dashboard-menu"),icon:_(),id:"btn-menu",label:this.t("pfm-pfm-dashboard-menu")}]}}}firstUpdated(){super.firstUpdated(),this._dmBalancesSearch=this.shadowRoot.querySelector("#dmBalancesSearch"),this._dmForecastBalancesSearch=this.shadowRoot.querySelector("#dmForecastBalancesSearch"),this._dmPfms=this.shadowRoot.querySelector("#dmPfms"),this._dmPublicSettings=this.shadowRoot.querySelector("#dmPublicSettings"),this._dmRecurringBalancesSearch=this.shadowRoot.querySelector("#dmRecurringExpensesBalancesSearch"),this.internalProducts||(this._dmFinancialOverview=this.shadowRoot.querySelector("#dmFinancialOverview"),this._dmFinancialOverview.getFinancialOverview()),!this.externalProducts&&this.useExternalProducts&&(this._dmRetailFinancialOverview=this.shadowRoot.querySelector("#dmRetailFinancialOverview"),this._dmRetailFinancialOverview.getFinancialOverview()),this.relatedContracts||this.contractId?this._sendGetPublicSettingsRequest():this._sendGetPfmsRequest()}updated(t){super.updated(t),t.has("relatedContracts")&&0===this.relatedContracts.length&&this._sendGetPfmsRequest()}resetRelatedContracts(){this.relatedContracts=[]}get _appSettingsHost(){return this.publicSettingsHost||this.host}get _appSettingsRequiredToken(){return this.publicSettingsHost?this.publicSettingsRequiredToken:this.requiredToken}get _filteredExternalProducts(){var t;const e=null===(t=this.externalProducts)||void 0===t?void 0:t.flatMap((t=>{var e;return(null===(e=t.externalFinancialEntity)||void 0===e?void 0:e.contracts)||[]}));return(null==e?void 0:e.filter((t=>{var e,a,i,s,r;return"CARD"===(null===(e=t.detail)||void 0===e||null===(a=e.productType)||void 0===a?void 0:a.toUpperCase())&&(null===(i=t.detail)||void 0===i||null===(s=i.cardType)||void 0===s?void 0:s.id)!==this.debitCardType||"ACCOUNT"===(null===(r=t.detail)||void 0===r?void 0:r.productType.toUpperCase())})))||[]}get _filteredInternalProducts(){var t,e;return(null===(t=this.internalProducts)||void 0===t||null===(e=t.contracts)||void 0===e?void 0:e.filter((t=>{var e;return("ACCOUNT"===t.productType||"CARD"===t.productType)&&(null===(e=t.subProductType)||void 0===e?void 0:e.id)!==this.debitCardType&&this._isVisible(t.userAccessControl)})))||[]}get currentPeriod(){return this.contractId?this._commonMonthlyPeriod:this._pfmPeriod}get dataIsLoaded(){return this._globalPfmStatus===Zt&&this._balanceSearchStatus===Zt}get headers(){return{"accept-language":this.language}}get incomesExceeded(){var t,e;return Math.abs(null===(t=this.totalExpenses)||void 0===t?void 0:t.amount)>(null===(e=this.totalIncomes)||void 0===e?void 0:e.amount)}get remainIncomes(){return Math.round(100*(this.totalIncomes.amount+this.totalExpenses.amount))/100}get totalExpenses(){return ee.getTotalAmount(this._expenses,this.localCurrency)}get totalIncomes(){return ee.getTotalAmount(this._incomes,this.localCurrency)}static getTotalAmount(t,e){const a={amount:0,currency:e};return(null==t?void 0:t.totalAmount)||a}_sendGetPfmsRequest(){this._globalPfmStatus=Qt,this._dmPfms.getPfms()}_manageGetPfmsResponse({detail:t}){const e=null==t?void 0:t.find((({id:t})=>t===this.pfmId));if(e){this.relatedContracts=e.relatedContracts,this._personExpenseAmount=e.personExpenseAmount?e.personExpenseAmount:this._personExpenseAmount;const{startDate:t,endDate:a}=e.period;this._pfmPeriod={startDate:te(t).toISOString(),endDate:te(a).toISOString()}}else this._pfmPeriod=this._commonMonthlyPeriod;this._globalPfmStatus=Zt,this._sendGetPublicSettingsRequest()}_manageGlobalPfmStatus(t){this._globalPfmStatus=t,this._balanceSearchStatus=t,this._pfmPeriod=this._commonMonthlyPeriod}_sendGetPublicSettingsRequest(){if(Object.keys(this.publicSettings).length){const t=this.publicSettings.detail.find((t=>t.key===this.pfmKeySettings));this._manageGetPublicSettingsResponse(t)}else this._dmPublicSettings.getPublicSettings(this.publicSettingsId,{key:this.pfmKeySettings})}_manageGetPublicSettingsResponse(t){var e;const a=t.detail?JSON.parse(t.detail[0].value):JSON.parse(t.value);this._groupsConfig=null===(e=a.data)||void 0===e?void 0:e.donut,this.balances?this._manageGetBalancesSearchResponse(this.balances):this._sendGetBalancesSearchRequest()}_sendGetBalancesSearchRequest(){this._balanceSearchStatus=Qt;const{startDate:t,endDate:e}=this.currentPeriod;let a={pfmId:this.pfmId,frequencyId:"ONE_TIME",periodStartDate:t,periodEndDate:e};this.contractId&&(a={...a,contractId:this.contractId,productTypeId:this.contractTypeId,...this.contractSubtypeId&&{subProductTypeId:this.contractSubtypeId}}),this._dmBalancesSearch.postBalancesSearch(a)}_manageGetBalancesSearchResponse(t){var e,a,i;this._balanceSearchStatus=Zt,this.showForecastingLink&&this._sendGetForecastBalancesRequest(),this.showRecurringExpensesLink&&this._sendGetRecurringExpensesBalancesRequest();const{balances:[s]}=t;this._expenses=null===(e=s.groups)||void 0===e?void 0:e.find((({id:t})=>t===this.expensesGroupId)),this._incomes=null===(a=s.groups)||void 0===a?void 0:a.find((({id:t})=>t===this.incomesGroupId));const r=null===(i=this._groupsConfig)||void 0===i?void 0:i.map((t=>({...this._formatBalanceGroupData(t,s.groups),period:s.period})));this._groupsData=null==r?void 0:r.sort(((t,e)=>t.order<e.order?-1:1))}_manageSearchBalancesErrorResponse(){this._balanceSearchStatus=Jt}_sendGetForecastBalancesRequest(){var t;this._forecastStatus=Qt;const e={startDate:te().startOf("day").toISOString(),endDate:null===(t=this._pfmPeriod)||void 0===t?void 0:t.endDate},{startDate:a,endDate:i}=this.contractId?this._commonMonthlyPeriod:e,s={pfmId:this.pfmId,periodStartDate:a,periodEndDate:i};this.showUndatedEstimates||(s.isUndatedEstimates=this.showUndatedEstimates),this.contractId&&(s.contractId=this.contractId),this._dmForecastBalancesSearch.postForecastBalancesSearch(s)}_manageGetForecastBalancesResponse(t){var e,a,i;this._forecastStatus=Zt;const s=null==t?void 0:t.groups.find((t=>t.id===this.expensesGroupId)),r=null==t?void 0:t.groups.find((t=>t.id===this.investmentSavingsFinancingGroupId)),n=(Math.abs(parseFloat(null==s||null===(e=s.totalAmount)||void 0===e?void 0:e.amount,0))||0)+(Math.abs(parseFloat(null==r||null===(a=r.totalAmount)||void 0===a?void 0:a.amount,0))||0);this._pendingAmount=Wt(n,(null==s||null===(i=s.totalAmount)||void 0===i?void 0:i.currency)||"",this.language,this.discreetMode)}_manageForecastErrorResponse(){this._forecastStatus=Jt}_sendGetRecurringExpensesBalancesRequest(){var t;this._recurringExpensesStatus=Qt;const e={startDate:te().startOf("day").toISOString(),endDate:null===(t=this._pfmPeriod)||void 0===t?void 0:t.endDate},{startDate:a,endDate:i}=this.contractId?this._commonMonthlyPeriod:e;let s={pfmId:this.pfmId,periodStartDate:a,periodEndDate:i,isPaid:!1};this.contractId&&(s={...s,contractId:this.contractId,productTypeId:this.contractTypeId,...this.contractSubtypeId&&{subProductTypeId:this.contractSubtypeId}}),this._dmRecurringBalancesSearch.postRecurringExpensesBalancesSearch(s)}_manageGetRecurringExpensesBalancesResponse(t){var e,a;this._recurringExpensesStatus=Zt;const i=null==t?void 0:t.balances.find((t=>"MONTHLY"===t.frequency.id)),s=Math.abs(parseFloat(null==i||null===(e=i.expense)||void 0===e?void 0:e.amount,0))||0;this._pendingAmount=Wt(s,(null==i||null===(a=i.expense)||void 0===a?void 0:a.currency)||"",this.language,this.discreetMode)}_manageRecurringExpensesErrorResponse(){this._recurringExpensesStatus=Jt}_manageInternalProductsResponse({detail:t}){this.internalProducts=t}_manageExternalProductsResponse({detail:t}){this.externalProducts=t}_formatBalanceGroupData(t,e=[]){const a=null==e?void 0:e.find((e=>(null==e?void 0:e.id)===t.relatedGroup)),i={title:this.titles[t.relatedGroup],groupId:t.relatedGroup,order:t.order,data:[]};if(!a)return i;const{categories:s}=a;return s.sort(((t,e)=>Math.abs(t.totalAmount.amount)<Math.abs(e.totalAmount.amount)?1:-1)),Object.assign(i,{data:this._getCategoriesToShow(s,t,a),totalAmount:a.totalAmount})}_getCategoriesToShow(t,e,a){const i=Number(e.numberOfItems)||t.length,s=t.length>i?t.slice(i-t.length):[],r=t.slice(0,i).map((t=>{var e;return{...t,iconData:v[null===(e=t.image)||void 0===e?void 0:e.id]||this._defaultCategory}}));return s.length&&r.push(this._getRemainCategory(s,a)),r}_getRemainCategory(t){return t.reduce(((t,e)=>(t.totalAmount.amount+=e.totalAmount.amount,t.totalTransactions+=e.totalTransactions,t)),{iconData:this._defaultCategory,totalAmount:{amount:0},totalTransactions:0})}_handleNextTooltip(t){this._tooltipPositionToShow+=1,this.showWelcomeTooltips=!t,t&&this._dispatchEvent("pfm-pfm-dashboard-last-welcome-tooltip-close")}_getTooltipLabels(t,e){return{title:this.t(`pfm-pfm-dashboard-tooltip-${t}-title`),description:this.t(`pfm-pfm-dashboard-tooltip-${t}-description`),linkText:e?this.t("pfm-pfm-dashboard-close"):this.t("pfm-pfm-dashboard-next")}}_wrapComponentWithHelpTooltip(t,e,a){const i=this._tooltipOrder.indexOf(t),r=i===this._tooltipOrder.length-1,{title:n,description:o,linkText:l}=this._getTooltipLabels(t,r);return this.showWelcomeTooltips&&this.dataIsLoaded&&!this.showWelcomeOnboarding?s`
          <bbva-help-tooltip
            avoid-clickable
            ?opened="${this._tooltipPositionToShow===i}"
            description="${o}"
            heading="${n}"
            horizontal-placement="${e}"
            link-text="${l}"
            vertical-placement="bottom"
            @help-tooltip-link-click="${()=>this._handleNextTooltip(r)}"
          >
            <div slot="invoker" ambient="primary">${a}</div>
          </bbva-help-tooltip>
        `:a}_handleOnboardingContentLoaded(){if(!this.personName)return;const t=this.shadowRoot.querySelector('[data-tag-name="onboarding-full-screen-carousel"]'),e=null==t?void 0:t.shadowRoot.querySelector('[data-tag-name="bbva-help-onboarding"]'),a=null==e?void 0:e.querySelector('[data-tag-name="bbva-help-onboarding-slide"]');var i;a&&(a.slideTitle=null===(i=a.slideTitle)||void 0===i?void 0:i.replace("<personName>",this.personName))}_handleOnboardingConfigureProducts(){this._handleOnboardingWindowClose(),this._dispatchEvent("pfm-pfm-dashboard-config-link-select")}_handleOnboardingWindowClose(){this.showWelcomeOnboarding=!1,this._dispatchEvent("pfm-pfm-dashboard-welcome-onboarding-close")}get welcomeOnboardingTmpl(){if(!this.showWelcomeOnboarding)return c;const t=(-1!==this.language.indexOf("en")?"en/":"")+this.contentFragmentPath;return s`
      <onboarding-full-screen-carousel
        visible
        ?hidden="${!this.showWelcomeOnboarding}"
        content-fragment-host="${this.contentFragmentHost}"
        content-fragment-path="${t}"
        language="${this.language}"
        @onboarding-full-screen-carousel-close="${this._handleOnboardingWindowClose}"
        @pfm-pfm-dashboard-onboarding-button-close="${this._handleOnboardingWindowClose}"
        @pfm-pfm-dashboard-onboarding-link-click="${this._handleOnboardingConfigureProducts}"
        @onboarding-full-screen-carousel-open="${this._handleOnboardingContentLoaded}"
      ></onboarding-full-screen-carousel>
    `}get _dashboardPeriodTmpl(){var t,e;if(this._globalPfmStatus===Qt)return c;const a=[null===(t=this.currentPeriod)||void 0===t?void 0:t.startDate,null===(e=this.currentPeriod)||void 0===e?void 0:e.endDate],i=s`
      <bbva-header-category
        heading-level="2"
        locale="${this.language}"
        text="${function(t,e){const a=(t,a)=>new Date(t).toLocaleDateString(e,a),i={day:"numeric",month:"short"},s={year:"numeric"},r=-1!==e.indexOf("en")?",":"",n=a(t[0],i),o=a(t[1],i);return`${n}${r} ${a(t[0],s)} - ${o}${r} ${a(t[1],s)}`}(a,this.language)}"
        variant="date"
      ></bbva-header-category>
    `;return this._wrapComponentWithHelpTooltip("dashboardPeriod","left",i)}get _headerErrorTmpl(){return s`
      <bbva-notification-message
        accessibility-link-label="Link de notification message"
        book-title=""
        link-title="${this.t("pfm-pfm-dashboard-retry")}"
        message-title="${this.t("pfm-pfm-dashboard-header-error")}"
        variant="error"
        @notification-message-link-click="${this._sendGetPfmsRequest}"
      ></bbva-notification-message>
    `}get _groupsErrorTmpl(){return s`
      <pfm-pfm-dashboard-panel-info
        description="${this.t("pfm-pfm-dashboard-loading-error-try-later")}"
        heading="${this.t("pfm-pfm-dashboard-feature-not-available")}"
        link-text="${this.t("pfm-pfm-dashboard-retry")}"
        microillustration-size="M"
        microillustration="error"
        @pfm-pfm-dashboard-panel-info-link-click="${this._sendGetBalancesSearchRequest}"
      ></pfm-pfm-dashboard-panel-info>
    `}get _proactivityMessageTmpl(){return s`
      <div ambient="light">
        <proactivity-message
          ?native="${this.native}"
          .host="${this.host}"
          .publicSettingsHost="${this._appSettingsHost}"
          .publicSettingsRequiredToken="${this._appSettingsRequiredToken}"
          .relevantFacts="${this.relevantFacts}"
          .requiredToken="${this.requiredTokenProactivity||this.requiredToken}"
          aem-key="${this.proactivityMessageAemKey}"
          ambient="primary"
          class="spacer-2"
          emplacement="${this.emplacement}"
          language="${this.language}"
          public-settings-endpoint="${this.proactivityMessagePublicSettingsEndpoint}"
          show-message
          title-tag="h2"
        ></proactivity-message>
      </div>
    `}_getCategoriesList(t){return s`
      <div role="list">
        ${t.data.map(((e,a,i)=>s`
            <div role="listitem">
              <pfm-pfm-dashboard-list-movement
                ?discreet-mode="${this.discreetMode}"
                ?loading="${this._balanceSearchStatus===Qt}"
                amount="${p(e.totalAmount.amount)}"
                aria-label="${p(e.ariaLabel)}"
                bg-color-clip="${p(e.iconData.color)}"
                card-title="${e.name||this.t("pfm-pfm-dashboard-other-categories")}"
                currency-code="${this.localCurrency}"
                icon-clip="${p(x[e.iconData.icon]?x[e.iconData.icon]():void 0)}"
                language="${this.language}"
                description="${this._balanceSearchStatus===Zt?this.t(e.totalTransactions>1?"pfm-pfm-dashboard-category-description":"pfm-pfm-dashboard-category-description-one",{totalTransactions:e.totalTransactions}):""} "
                @pfm-pfm-dashboard-list-movement-item-click="${()=>this._dispatchEvent("pfm-pfm-dashboard-category-select",{groupid:t.groupId,categoryid:e.id})}"
              ></pfm-pfm-dashboard-list-movement>

              ${a!==i.length-1?s` <bbva-divider-default class="fit"></bbva-divider-default> `:""}
            </div>
          `))}
      </div>
    `}_getEmptyCategoriesList(t){const e=this.t("pfm-pfm-dashboard-empty-state-header",{groupName:this.t(t.title)}),a=e.charAt(0).toUpperCase()+e.slice(1).toLowerCase();return s`
      <pfm-pfm-dashboard-panel-info
        description="${this.t("pfm-pfm-dashboard-empty-state-description")}"
        heading-level-title="h3"
        heading="${a}"
        id="emptySlideContent"
        microillustration="emptystateday"
      ></pfm-pfm-dashboard-panel-info>
    `}_isVisible(t){return!!t&&!!t.find((t=>t.channel.id===this.channelId&&t.isVisible))}get _configureProductsTmpl(){var t;if(this.hideConfigPfm||this.showDetailCard||this.contractId||this._globalPfmStatus===Qt)return c;const e=this._filteredInternalProducts.concat(this._filteredExternalProducts)||[],a=this._globalPfmStatus===Zt?this.t("pfm-pfm-dashboard-config-product-number-title",{relatedProducts:(null===(t=this.relatedContracts)||void 0===t?void 0:t.length)||0,totalProducts:e.length}):this.t("pfm-pfm-dashboard-config-product-title"),i=[this.t("pfm-pfm-dashboard-config-product-link"),a].join(" "),r=s`
      <bbva-header-category
        heading-level="2"
        link-accessibility-text="${i}"
        option-link="${this.t("pfm-pfm-dashboard-config-product-link")}"
        text="${a}"
        @header-category-link-click="${()=>!this.showWelcomeTooltips&&this._dispatchEvent("pfm-pfm-dashboard-config-link-select")}"
      ></bbva-header-category>
    `;return this._wrapComponentWithHelpTooltip("configurateProducts","right",r)}get _incomesProgressBarTmpl(){var t,e;const a=null===(t=this.totalIncomes)||void 0===t?void 0:t.currency,i=null===(e=this.totalIncomes)||void 0===e?void 0:e.amount,r=`${this.t("pfm-pfm-dashboard-entry-title")} ${i}`,n=s`
      <pfm-pfm-dashboard-list-progress
        ?discreet-mode="${this.discreetMode}"
        ?loading="${this._balanceSearchStatus===Qt}"
        ?mask="${this.discreetMode}"
        .fillColor="${f.tertiaryType3}"
        amount="${i}"
        aria-label="${r}"
        currency-code="${a}"
        current-value="${i}"
        heading="${this.t("pfm-pfm-dashboard-entry-title")}"
        language="${this.language}"
        local-currency="${a}"
        max-value="${i||1}"
        @pfm-pfm-dashboard-list-progress-click="${()=>!this.showWelcomeTooltips&&this._dispatchEvent("pfm-pfm-dashboard-show-more-select",{groupid:this.incomesGroupId})}"
      ></pfm-pfm-dashboard-list-progress>
    `;return this._wrapComponentWithHelpTooltip("incomes","left",n)}get _expensesProgressBarTmpl(){var t,e,a;const i=null===(t=this.totalExpenses)||void 0===t?void 0:t.amount,r=null===(e=this.totalExpenses)||void 0===e?void 0:e.currency,n=null===(a=this.totalIncomes)||void 0===a?void 0:a.amount,o=`${this.t("pfm-pfm-dashboard-expense-title")} ${i}`,l=Math.abs(i)>=Math.abs(n)*this._personExpenseAmount/100,d=l?f.tertiaryType1Light:f.primarySubdued,c=0===i&&0===n,p=this.incomesExceeded?0:this.remainIncomes,h=s`
      <pfm-pfm-dashboard-list-progress
        ?discreet-mode="${this.discreetMode}"
        ?icon=${l&&!c}
        ?loading="${this._balanceSearchStatus===Qt}"
        .fillColor="${d}"
        amount="${i}"
        aria-label="${o}"
        currency-code="${r}"
        current-value="${Math.abs(i)}"
        description="${c?"":this.t("pfm-pfm-dashboard-left-amount")}"
        heading="${this.t("pfm-pfm-dashboard-expense-title")}"
        language="${this.language}"
        local-currency="${r}"
        max-value="${n||1}"
        secondary-amount="${c?null:p}"
        @pfm-pfm-dashboard-list-progress-click="${()=>!this.showWelcomeTooltips&&this._dispatchEvent("pfm-pfm-dashboard-show-more-select",{groupid:this.expensesGroupId})}"
      ></pfm-pfm-dashboard-list-progress>
    `;return this._wrapComponentWithHelpTooltip("expenses","left",h)}get _incomesExceededTmpl(){var t;return this.incomesExceeded?s`
      <bbva-type-text
        class="paragraph"
        id="incomesExceeded"
        size="S"
        tag="span"
        unset
        text="${this.t("pfm-pfm-dashboard-incomes-exceeded-text",{amount:Wt(Math.abs(this.remainIncomes),(null===(t=this.totalExpenses)||void 0===t?void 0:t.currency)||"",this.language,this.discreetMode)})}"
      ></bbva-type-text>
    `:c}get _incomeVsExpensesTmpl(){var t,e;return this.showDetailCard?s`
        <pfm-pfm-dashboard-list-definition-amount
          ?loading="${this._balanceSearchStatus===Qt}"
          amount="${null===(t=this._expenses)||void 0===t?void 0:t.totalAmount.amount}"
          currency-code="${null===(e=this._expenses)||void 0===e?void 0:e.totalAmount.currency}"
          heading="${this.t("pfm-pfm-dashboard-current-total-expense")}"
          local-currency="${this.localCurrency}"
        ></pfm-pfm-dashboard-list-definition-amount>
      `:s`
      ${this._incomesProgressBarTmpl} ${this._expensesProgressBarTmpl} ${this._incomesExceededTmpl}
    `}get _forecastBalancesTmpl(){const t={description:this._forecastStatus!==Jt&&this._pendingAmount?`${this._pendingAmount} ${this.t("pfm-pfm-dashboard-extra-amount-description")}`:"",id:"forecastingLink",nameEvent:"pfm-pfm-dashboard-forecasting-link-select",title:this.t("pfm-pfm-dashboard-forecasting-link-text"),status:this._forecastStatus};return this._commonExternalLinkTmpl(t)}get _recurringExpensesBalancesTmpl(){const t={description:this._recurringExpensesStatus!==Jt&&this._pendingAmount?`${this._pendingAmount} ${this.t("pfm-pfm-dashboard-extra-amount-description")}`:"",id:"recurringExpensesLink",nameEvent:"pfm-pfm-dashboard-recurring-expenses-link-select",title:this.t("pfm-pfm-dashboard-recurring-expenses-link-text"),status:this._recurringExpensesStatus};return this._commonExternalLinkTmpl(t)}_commonExternalLinkTmpl({id:t,title:e,description:a,nameEvent:i,status:r}){return this._balanceSearchStatus===Jt?c:s`
      ${this.showDetailCard||r!==Zt?c:s` <bbva-divider-default class="fit"></bbva-divider-default> `}
      <pfm-pfm-dashboard-list-link
        ?disabled="${this.disabled}"
        ?loading="${r===Qt}"
        ambient="primary-alt"
        description-text="${a}"
        header-text="${e}"
        id="${t}"
        @pfm-pfm-dashboard-list-link-click="${()=>this._dispatchEvent(i)}"
      ></pfm-pfm-dashboard-list-link>
    `}get _cardDetailCategoriesTmpl(){var t,e;const a=[this.t("pfm-pfm-dashboard-show-more-link-text"),this.t("pfm-pfm-dashboard-by-category")].join(" "),i=null===(t=this._groupsData)||void 0===t?void 0:t.find((({groupId:t})=>t===this.expensesGroupId));return s`
      ${i?s`
            <div
              aria-labelledby="tab-card-detail"
              class="panel"
              id="content-card-detail"
              role="tabpanel"
            >
              <bbva-header-category
                class="no-padding-bottom"
                heading-level="2"
                link-accessibility-text="${a}"
                option-link=${this.t("pfm-pfm-dashboard-show-more-link-text")}
                text="${this.t("pfm-pfm-dashboard-by-category")}"
                variant="default"
                @header-category-link-click="${()=>this._dispatchEvent("pfm-pfm-dashboard-show-more-select",{groupid:i.groupId})}"
              ></bbva-header-category>
              ${null!==(e=i.data)&&void 0!==e&&e.length?this._getCategoriesList(i):this._getEmptyCategoriesList(i)}
            </div>
          `:s` <bbva-header-category variant="default" loading> </bbva-header-category> `}
    `}get _groupDataCategoriesTmpl(){var t;const e=[this.t("pfm-pfm-dashboard-show-more-link-text"),this.t("pfm-pfm-dashboard-by-category")].join(" ");return s`
      ${null!==(t=this._groupsData)&&void 0!==t&&t.length?s`
            <bbva-tab-default
              .options=${this._groupsData.map((({title:t})=>({title:t})))}
              aria-label="Available sections"
              class="default-basic"
              ellipsis
              selected="${this.selectedTab}"
              tabs-per-page="0"
              @tab-default-tab-change="${({detail:t})=>this._updateSelectedTab(t)}"
            >
              ${this._groupsData.map(((t,a)=>{var i;return s`
                  <div
                    aria-labelledby="tab-${a}"
                    class="panel tab-panel"
                    id="content-${a}"
                    role="tabpanel"
                  >
                    <bbva-header-category
                      class="no-padding-bottom"
                      heading-level="2"
                      link-accessibility-text="${e}"
                      option-link=${this.t("pfm-pfm-dashboard-show-more-link-text")}
                      text="${this.t("pfm-pfm-dashboard-by-category")}"
                      variant="default"
                      @header-category-link-click="${()=>this._dispatchEvent("pfm-pfm-dashboard-show-more-select",{groupid:t.groupId})}"
                    >
                    </bbva-header-category>
                    ${null!==(i=t.data)&&void 0!==i&&i.length?this._getCategoriesList(t):this._getEmptyCategoriesList(t)}
                  </div>
                `}))}
            </bbva-tab-default>
          `:s` <bbva-header-category variant="default" loading> </bbva-header-category> `}
    `}get _groupDataContentTmpl(){return this._balanceSearchStatus===Jt?this._groupsErrorTmpl:this.showDetailCard?this._cardDetailCategoriesTmpl:this._groupDataCategoriesTmpl}get _pfmPfmDashboardContentTmpl(){return s`
      ${this.welcomeOnboardingTmpl} ${this._configureProductsTmpl} ${this._dashboardPeriodTmpl}
      ${this._globalPfmStatus===Jt||this._balanceSearchStatus===Jt?this._headerErrorTmpl:this._incomeVsExpensesTmpl}
      ${!this.showRecurringExpensesLink&&this.showForecastingLink?this._forecastBalancesTmpl:c}
      ${this.showRecurringExpensesLink&&!this.showForecastingLink?this._recurringExpensesBalancesTmpl:c}
      ${this.showProactivityCard?this._proactivityMessageTmpl:c}
      ${this._groupDataContentTmpl}
    `}get _dataManagersTmpl(){return s`
      <bbva-global-public-settings-api-dm
        ?native="${this.native}"
        .cacheKey="${this.cacheKey}"
        .cacheType="${this.cacheType}"
        host="${this._appSettingsHost}"
        id="dmPublicSettings"
        requiredtoken="${this._appSettingsRequiredToken}"
        version="${this.appSettingsApiVersion}"
        @api-dm-error="${this._manageSearchBalancesErrorResponse}"
        @public-settings-api-dm-fetch-error="${this._manageSearchBalancesErrorResponse}"
        @public-settings-api-dm-fetch="${this._manageGetPublicSettingsResponse}"
      ></bbva-global-public-settings-api-dm>
      <bbva-global-pfms-api-dm
        ?native="${this.native}"
        .headers="${this.headers}"
        .requiredToken="${this.requiredToken}"
        cachekey="${p(this.pfmsCacheKey)}"
        cachetype="${p(this.pfmsCacheKey&&this.cacheType)}"
        host="${this.host}"
        id="dmPfms"
        version="${this.personalFinancesApiVersion}"
        @api-dm-error="${()=>this._manageGlobalPfmStatus(Jt)}"
        @pfms-api-dm-fetch-error="${()=>this._manageGlobalPfmStatus(Jt)}"
        @pfms-api-dm-fetch="${this._manageGetPfmsResponse}"
      ></bbva-global-pfms-api-dm>
      <bbva-global-balances-search-api-dm
        ?native="${this.native}"
        .headers="${this.headers}"
        .requiredToken="${this.requiredToken}"
        cachekey="${p(this.balancesSearchCacheKey)}"
        cachetype="${p(this.balancesSearchCacheKey&&this.cacheType)}"
        host="${this.host}"
        id="dmBalancesSearch"
        version="${this.balancesApiVersion}"
        @api-dm-error="${this._manageSearchBalancesErrorResponse}"
        @balances-search-api-dm-fetch-error="${this._manageSearchBalancesErrorResponse}"
        @balances-search-api-dm-fetch="${t=>this._manageGetBalancesSearchResponse(t.detail)}"
      ></bbva-global-balances-search-api-dm>
      <bbva-global-recurring-expenses-balances-search-api-dm
        ?native="${this.native}"
        .headers="${this.headers}"
        .requiredToken="${this.requiredToken}"
        cachekey="${p(this.recurringExpensesBalancesCacheKey)}"
        cachetype="${p(this.recurringExpensesBalancesCacheKey&&this.cacheType)}"
        host="${this.host}"
        id="dmRecurringExpensesBalancesSearch"
        version="${this.personalFinancesApiVersion}"
        @api-dm-error="${this._manageRecurringExpensesErrorResponse}"
        @recurring-expenses-balances-search-api-dm-fetch-error="${this._manageRecurringExpensesErrorResponse}"
        @recurring-expenses-balances-search-api-dm-fetch="${t=>this._manageGetRecurringExpensesBalancesResponse(t.detail)}"
      ></bbva-global-recurring-expenses-balances-search-api-dm>
      <bbva-global-forecast-balances-search-api-dm
        ?native="${this.native}"
        .headers="${this.headers}"
        .requiredToken="${this.requiredToken}"
        cachekey="${p(this.forecastBalancesCacheKey)}"
        cachetype="${p(this.forecastBalancesCacheKey&&this.cacheType)}"
        host="${this.host}"
        id="dmForecastBalancesSearch"
        version="${this.personalFinancesApiVersion}"
        @api-dm-error="${this._manageForecastErrorResponse}"
        @forecast-balances-search-api-dm-fetch-error="${this._manageForecastErrorResponse}"
        @forecast-balances-search-api-dm-fetch="${t=>this._manageGetForecastBalancesResponse(t.detail)}"
      ></bbva-global-forecast-balances-search-api-dm>
      <bbva-global-financial-overview-api-dm
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        cachekey="${p(this.financialOverviewCacheKey)}"
        cachetype="${p(this.financialOverviewCacheKey&&this.cacheType)}"
        host="${this.host}"
        id="dmFinancialOverview"
        version="${this.financialOverviewApiVersion}"
        @api-dm-error="${()=>this._manageGlobalPfmStatus(Jt)}"
        @financial-overview-api-dm-fetch-error="${()=>this._manageGlobalPfmStatus(Jt)}"
        @financial-overview-api-dm-fetch="${this._manageInternalProductsResponse}"
      ></bbva-global-financial-overview-api-dm>
      <bbva-global-retail-financial-overview-api-dm
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        cachekey="${p(this.retailFinancialOverviewCacheKey)}"
        cachetype="${p(this.retailFinancialOverviewCacheKey&&this.cacheType)}"
        country="${this.retailFinancialOverviewCountry}"
        host="${this.host}"
        id="dmRetailFinancialOverview"
        version="${this.retailFinancialOverviewApiVersion}"
        @api-dm-error="${()=>this._manageGlobalPfmStatus(Jt)}"
        @financial-overview-api-dm-fetch-error="${()=>this._manageGlobalPfmStatus(Jt)}"
        @financial-overview-api-dm-fetch="${this._manageExternalProductsResponse}"
      ></bbva-global-retail-financial-overview-api-dm>
    `}render(){return s`
      ${super.render()}
      <div ambient="primary">${this._dataManagersTmpl} ${this._pfmPfmDashboardContentTmpl}</div>
    `}_updateSelectedTab(t){const{selectedIndex:e}=t;this.selectedTab!==e&&(this.selectedTab=e,this._dispatchEvent("pfm-pfm-dashboard-select-tab-change",{selectedIndex:e}))}_dispatchEvent(t,e={}){this.contractId&&Object.assign(e,{contractId:this.contractId,contractTypeId:this.contractTypeId,contractSubtypeId:this.contractSubtypeId}),this.dispatchEvent(new CustomEvent(t,{detail:e,bubbles:!0,composed:!0}))}}customElements.define(ee.is,ee);var ae=t`
  :host {
    --_pfm-saving-tools-list-default-link-color: ${E("colorPrimaryLinkMainDefault",w)};
    --_pfm-saving-tools-list-default-link-pressed-color: ${E("colorPrimaryLinkMainPressed",w)};
    --_pfm-saving-tools-list-default-pressed-bg-color: ${E("colorPrimaryAltSurfaceAlternativePressed",w)};
    --_pfm-saving-tools-list-default-skeleton-animated-layer-bg: ${E("colorPrimarySurfaceAmbientDefault",w)};
    --_pfm-saving-tools-list-default-skeleton-quote-color: ${E("colorPrimarySurfaceAmbientPreloading",w)};
  }
`,ie=t`
  :host {
    display: block;
    position: relative;
    box-sizing: border-box;
    border: none;
    padding: 1rem;
    cursor: pointer;
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

  .header [data-tag-name='bbva-type-icon'] {
    float: left;
    margin-right: 0.5rem;
    fill: var(--_pfm-saving-tools-list-default-link-color);
  }

  :host(:active),
  :host([focus-visible]) {
    background-color: var(--_pfm-saving-tools-list-default-pressed-bg-color);
  }
  :host(:active) [data-tag-name='bbva-type-text'][variant='spotlight'],
  :host([focus-visible]) [data-tag-name='bbva-type-text'][variant='spotlight'] {
    color: var(--_pfm-saving-tools-list-default-link-pressed-color);
  }
  :host(:active) [data-tag-name='bbva-type-icon'],
  :host([focus-visible]) [data-tag-name='bbva-type-icon'] {
    fill: var(--_pfm-saving-tools-list-default-link-pressed-color);
  }

  :host([loading]) {
    position: relative;
    overflow: hidden;
    pointer-events: none;
    background-repeat: no-repeat;
    opacity: 1;
    height: 6.5rem;
    width: 100%;
    margin-left: auto;
    margin-right: auto;
    background-image: linear-gradient(
        var(--_pfm-saving-tools-list-default-skeleton-quote-color) 100%,
        transparent 0
      ),
      linear-gradient(
        -60deg,
        transparent 50%,
        var(--_pfm-saving-tools-list-default-skeleton-quote-color) 50%
      ),
      linear-gradient(
        -60deg,
        transparent 50%,
        var(--_pfm-saving-tools-list-default-skeleton-quote-color) 50%
      ),
      linear-gradient(
        -60deg,
        transparent 50%,
        var(--_pfm-saving-tools-list-default-skeleton-quote-color) 50%
      );
    background-color: transparent;
    background-size:
      20px 20px,
      calc((38% * 2) + (20px / 2)) 20px,
      calc((35% * 2) + (16px / 2)) 16px,
      calc((20% * 2) + (16px / 2)) 16px;
    background-position:
      16px 14px,
      48px 14px,
      16px 46px,
      16px 74px;
  }
  :host([loading]) .skeleton {
    contain: strict;
    position: absolute;
    left: 0;
    top: 0;
    right: 0;
    bottom: 0;
    background: var(--_pfm-saving-tools-list-default-skeleton-animated-layer-bg);
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
`;class se extends(o(B(R(a)))){static get is(){return"pfm-saving-tools-list-default"}static get scopedElements(){const t=[V,F,I];return se.scopedElementsFromClasses(t)}static get properties(){return{badgeText:{type:String,attribute:"badge-text"},badgeType:{type:String,attribute:"badge-type"},description:{type:String},heading:{type:String},headingLevel:{type:String,attribute:"heading-level"},icon:{type:String},loading:{type:Boolean,reflect:!0}}}constructor(){super(),this.badgeText="",this.badgeType="",this.description="",this.heading="",this.headingLevel="h3",this.icon="",this.loading=!1}static get styles(){return[super.styles,ie,ae,L.primary,q.primary,A.primary,i(`${se.is}-shared-styles`)]}firstUpdated(t){super.firstUpdated(t),this.setAttribute("role","button"),this.setAttribute("tabindex","0")}get headerTemplate(){return s`
      <div class="header" ambient="primary">
        <bbva-type-icon ambient="primary" icon=${this.icon} size="24"></bbva-type-icon>
        <bbva-type-text
          font-weight="500"
          size="L"
          tag="${this.headingLevel}"
          text="${this.heading}"
          unset
          variant="spotlight"
        ></bbva-type-text>
      </div>
      <bbva-type-text size="S" text="${this.description}" unset></bbva-type-text>
      ${this.badgeText?s`
            <bbva-badge-default
              role="none"
              text="${this.badgeText}"
              type="${this.badgeType}"
            ></bbva-badge-default>
          `:""}
    `}render(){return this.loading?s` <div class="skeleton"></div> `:this.headerTemplate}}var re=t`
  :host {
    --_pfm-saving-tools-list-definition-amount-skeleton-animated-layer-bg: ${E("colorPrimarySurfaceAmbientDefault",w)};
    --_pfm-saving-tools-list-definition-amount-skeleton-quote-color: ${E("colorPrimarySurfaceAmbientPreloading",w)};
  }
`,ne=t`
  :host {
    box-sizing: border-box;
    display: block;
    align-items: center;
    text-align: center;
    padding: 0 1rem;
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
    align-items: center;
  }
  dl dd {
    display: flex;
    align-items: center;
    margin-bottom: 1rem;
  }
  dl dd.description-wrapper {
    justify-content: space-between;
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
        var(--_pfm-saving-tools-list-definition-amount-skeleton-quote-color) 50%
      ),
      linear-gradient(
        -60deg,
        transparent 50%,
        var(--_pfm-saving-tools-list-definition-amount-skeleton-quote-color) 50%
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
    background: var(--_pfm-saving-tools-list-definition-amount-skeleton-animated-layer-bg);
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
`;class oe extends(B(e(a))){static get is(){return"pfm-saving-tools-list-definition-amount"}static get scopedElements(){const t=[rt,O,I];return oe.scopedElementsFromClasses(t)}static get properties(){return{amountVariant:{type:String,attribute:"amount-variant"},badgeVariabilityColor:{type:String,attribute:"badge-variability-color"},badgeVariabilityStatus:{type:String,attribute:"badge-variability-status"},decimalDigits:{type:Number,attribute:"decimal-digits"},description:{type:String},discreetMode:{type:Boolean,attribute:"discreet-mode"},loading:{type:Boolean,reflect:!0}}}constructor(){super(),this.amountVariant="3xl",this.badgeVariabilityColor="",this.badgeVariabilityStatus="",this.decimalDigits=2,this.description="",this.discreetMode=!1,this.loading=!1}static get styles(){return[ne,re,st.primary,D.primary,A.primary,i(`${oe.is}-shared-styles`)]}static _tplBadgeVariability({status:t,color:e}){return s`
      <bbva-badge-variability .status="${t}" .color="${e}"></bbva-badge-variability>
    `}render(){return this.loading?s` <div class="skeleton"></div> `:s`
        <dl>
          <dt>
            <bbva-type-amount
              ?mask="${this.discreetMode}"
              amount="${this.amount}"
              currency-code="${this.currencyCode}"
              decimal-digits="${this.decimalDigits}"
              language="${this.language}"
              local-currency="${this.localCurrency}"
              type="bold"
              variant="${this.amountVariant}"
            ></bbva-type-amount>
            ${oe._tplBadgeVariability({color:this.badgeVariabilityColor,status:this.badgeVariabilityStatus})}
          </dt>
          <dd>
            <bbva-type-text
              size="S"
              tag="span"
              text="${this.description}"
              unset
            ></bbva-type-text>
          </dd>
        </dl>
      </div>
    `}}var le=t`
  :host {
    --_pfm-saving-tools-background-color-primary: ${E("colorPrimarySurfaceAmbientDefault",w)};
    --_pfm-saving-tools-background-color-primary-alt: ${E("colorPrimaryAltSurfaceAmbientDefault",w)};
  }
`,de=t`
  :host {
    display: block;
    box-sizing: border-box;
    padding-top: 1.5rem;
    background-color: var(--_pfm-saving-tools-background-color-primary);
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

  [data-tag-name='bbva-header-category'] {
    padding: 0.5rem 1rem;
  }

  [data-tag-name='bbva-divider-default'] {
    margin: 0 1rem;
    display: block;
  }

  [data-tag-name='bbva-type-text'] {
    padding: 1.5rem 1rem 0;
  }

  [data-tag-name='bbva-type-link'] {
    display: flex;
    width: -webkit-max-content;
    width: max-content;
    margin: 0 1rem;
  }

  [ambient='primary'] {
    background-color: var(--_pfm-saving-tools-background-color-primary);
  }

  .card-container {
    background-color: var(--_pfm-saving-tools-background-color-primary-alt);
    padding: 0.5rem 0 1rem;
    margin: 0 1rem 1.5rem;
  }
`;const ce="error",pe="loading",{moment:he}=window;class me extends(b(H(h(a)))){static get is(){return"pfm-saving-tools"}static get scopedElements(){const t=[Y,Bt,wt,Et,$t,Z,X,I,se,oe];return me.scopedElementsFromClasses(t)}static get properties(){return{balances:{type:Object},cacheType:{type:String,attribute:"cache-type"},dateFormats:{type:Object},discreetMode:{type:Boolean,attribute:"discreet-mode"},expensesGroupId:{type:String,attribute:"expenses-group-id"},fromToDateFormat:{type:String,attribute:"from-to-date-format"},frequency:{type:String},fromOperationDate:{type:String,attribute:"from-operation-date"},headingLevel:{type:String,attribute:"heading-level"},hideSavingCheckLink:{type:Boolean,attribute:"hide-saving-check-link"},hideSavingDataPanel:{type:Boolean,attribute:"hide-saving-data-panel"},hideSavingToolsList:{type:Boolean,attribute:"hide-saving-tools-list"},hideSavingToolsTitle:{type:Boolean,attribute:"hide-saving-tools-title"},incomesGroupId:{type:String,attribute:"incomes-group-id"},listToolsOptions:{type:Array},personalFinancesApiVersion:{type:String,attribute:"personal-finances-api-version"},balancesApiVersion:{type:String,attribute:"balances-api-version"},pfmBalancesCacheKey:{type:String,attribute:"pfm-balances-cache-key"},pfmBudgetsCacheKey:{type:String,attribute:"pfm-budgets-cache-key"},pfmId:{type:String,attribute:"pfm-id"},pfmPiggyBanksCacheKey:{type:String,attribute:"pfm-piggy-banks-cache-key"},piggyBanksApiVersion:{type:String,attribute:"piggy-banks-api-version"},toOperationDate:{type:String,attribute:"to-operation-date"},useIsoStringDates:{type:Boolean,attribute:"use-iso-string-dates"},_pettyExpenseLimit:{type:Object,state:!0},_savingData:{type:Object,state:!0},_savingStatus:{type:String,state:!0}}}constructor(){super(),this._savingData={amount:0,badgeVariabilityColor:"success",badgeVariabilityStatus:"no-change",currencyCode:"",text:""},this._savingStatus=pe,this.ambient="primary",this.balances={},this.cacheType="LOCAL",this.dateFormats={day:"numeric",month:"long"},this.discreetMode=!1,this.expensesGroupId="103",this.fromToDateFormat="YYYY-MM-DD",this.frequency="MY_PERIOD",this.fromOperationDate="",this.headingLevel="h3",this.hideSavingCheckLink=!1,this.hideSavingDataPanel=!1,this.hideSavingToolsList=!1,this.hideSavingToolsTitle=!1,this.incomesGroupId="101",this.language="es-ES",this.listToolsOptions=[{icon:S(),id:"PettyExpenses"},{badgeText:"pfm-saving-tools-budgets-total-elements",elements:0,icon:k(),id:"Budgets"},{icon:$(),id:"Goals"},{icon:T(),id:"Program"},{badgeText:"pfm-saving-tools-piggybanks-total-elements",icon:P(),id:"PiggyBanks"}],this.personalFinancesApiVersion="1",this.piggyBanksApiVersion="0",this.balancesApiVersion="2",this.toOperationDate="",this.useIsoStringDates=!1}static get styles(){return[de,le,et.primary,it.primary,N.primary,A.primary,i(`${me.is}-shared-styles`)]}firstUpdated(){super.firstUpdated(),this._balanceSearchDm=this.shadowRoot.querySelector("#dmBalanceSearch"),this._pfmBudgetsDm=this.shadowRoot.querySelector("#dmPfmBudgets"),this._pfmPettyBalancesDm=this.shadowRoot.querySelector("#dmPettyExpensesBalances"),this._piggyBanksDm=this.shadowRoot.querySelector("#dmPiggyBanks"),0===Object.keys(this.balances).length?this._sendGetBalancesSearchRequest():this._handleBalancesSearchResponse(this.balances);this.listToolsOptions.find((t=>"Budgets"===t.id))&&this._sendGetPfmBudgetsRequest();const t=this.listToolsOptions.find((t=>"PiggyBanks"===t.id));t&&void 0===t.elements&&this._piggyBanksDm.getPiggyBanks({"status.id":"VALID"});this.listToolsOptions.find((t=>"PettyExpenses"===t.id))&&this._sendGetPettyExpensesBalancesRequest()}get amountInfo(){var t,e,a,i;if(null===(t=this._savingData)||void 0===t||!t.period)return"";const s=new Date(null===(e=this._savingData.period)||void 0===e?void 0:e.startDate).toLocaleDateString(this.language,this.dateFormats),r=new Date(null===(a=this._savingData.period)||void 0===a?void 0:a.endDate).toLocaleDateString(this.language,this.dateFormats);return this.t(`pfm-saving-tools-amount-info-${null===(i=this._savingData)||void 0===i?void 0:i.badgeVariabilityStatus}`,{startDate:s,endDate:r})}get headers(){return{"accept-language":this.language}}_sendGetPfmBudgetsRequest(){const t={"status.id":"ACTIVE"};this.listToolsOptions.find((t=>"expensescontrol"===t.id.toLowerCase()))?(t["budgetLevel.id"]="GROUPS",this._idBudgetsDm="ExpensesControl"):this._idBudgetsDm="Budgets",this._pfmBudgetsDm.getPfmBudgets(this.pfmId,t)}_sendGetBalancesSearchRequest(){const t={pfmId:this.pfmId,frequencyId:this.frequency};if(this.fromOperationDate&&this.toOperationDate){const e=this._getPreviousDate();t.periodStartDate=this._getRequestDates(e.startDate),t.periodEndDate=this._getRequestDates(e.endDate)}this._balanceSearchDm.postBalancesSearch(t)}_handleBalancesSearchResponse({balances:t=[]}){var e,a,i,s,r,n,o;const l=t.reduce(((t,e)=>{var a,i;const s=null===(a=e.groups)||void 0===a?void 0:a.find((t=>t.id===this.expensesGroupId));return t+(e=(null==s||null===(i=s.totalAmount)||void 0===i?void 0:i.amount)||0)||0}),0),d=(t.reduce(((t,e)=>{var a,i;const s=null===(a=e.groups)||void 0===a?void 0:a.find((t=>t.id===this.incomesGroupId));return t+(e=(null==s||null===(i=s.totalAmount)||void 0===i?void 0:i.amount)||0)}),0)||0)-(Math.abs(l)||0);this._savingStatus="success",this._savingData={period:{startDate:null===(e=t[0])||void 0===e||null===(a=e.period)||void 0===a?void 0:a.startDate,endDate:null===(i=t[t.length-1])||void 0===i||null===(s=i.period)||void 0===s?void 0:s.endDate},amount:d||0,currencyCode:(null===(r=t[0])||void 0===r?void 0:r.groups)&&(null===(n=t[0])||void 0===n||null===(o=n.groups[0])||void 0===o?void 0:o.totalAmount.currency)||""},d?d>0?(this._savingData.badgeVariabilityStatus="increase",this._savingData.badgeVariabilityColor="success"):(this._savingData.badgeVariabilityStatus="decrease",this._savingData.badgeVariabilityColor="error"):(this._savingData.badgeVariabilityStatus="no-change",this._savingData.badgeVariabilityColor="pending")}_handleBalancesSearchError(t){this._savingStatus=t}_sendGetPettyExpensesBalancesRequest(){const t={"pfm.id":this.pfmId,"period.startDate":he(this.fromOperationDate||he().startOf("month")).toISOString(),"period.endDate":he(this.toOperationDate||he()).toISOString()};this._pfmPettyBalancesDm.getPettyExpensesBalances(t)}_setPettyResourceData({detail:t}){const e=this.listToolsOptions.find((t=>"PettyExpenses"===t.id));e&&(e.title="pfm-saving-tools-pettyexpenses-title",e.description=t?"pfm-saving-tools-pettyexpenses-text":"pfm-saving-tools-pettyexpenses-no-data-text",t&&(e.elements=t.totalTransactions,e.badgeText=1===e.elements?"pfm-saving-tools-pettyexpenses-total-elements-one":"pfm-saving-tools-pettyexpenses-total-elements",this._pettyExpenseLimit=t.limit),this.listToolsOptions=[...this.listToolsOptions])}_setCommonResourceData(t,e){var a,i,s;const r={Budgets:this._pfmBudgetsDm,ExpensesControl:this._pfmBudgetsDm,PiggyBanks:this._piggyBanksDm},n={Budgets:null==e||null===(a=e.pagination)||void 0===a?void 0:a.totalElements,ExpensesControl:null==e||null===(i=e.pagination)||void 0===i?void 0:i.totalElements,PiggyBanks:null==e?void 0:e.length},o=this.listToolsOptions.findIndex((e=>e.id===t)),l=(null===(s=r[t].pagination)||void 0===s?void 0:s.totalElements)||n[t];if(o>=0&&l){const e=t.toLowerCase(),a=this.listToolsOptions,i=a[o];i&&(i.title=`pfm-saving-tools-${e}-title`,i.description=`pfm-saving-tools-${e}-text`,i.elements=l,i.badgeText=1===l?`pfm-saving-tools-${e}-total-elements-one`:`pfm-saving-tools-${e}-total-elements`),this.listToolsOptions=[...a]}}_getPreviousDate(){let t;const e={period:{startDate:this.fromOperationDate,endDate:this.toOperationDate}},a=he(e.period.startDate,this.fromToDateFormat).subtract(1,"month").format(this.fromToDateFormat);return t=this._isEndOfMonth(e.period.startDate)?he(e.period.endDate,this.fromToDateFormat).subtract(1,"month").endOf("month").format(this.fromToDateFormat):he(e.period.endDate,this.fromToDateFormat).subtract(1,"month").format(this.fromToDateFormat),{startDate:a,endDate:t}}_getRequestDates(t){return this.useIsoStringDates?he(t).toISOString():`${t}T00:00:00.000Z`}_isEndOfMonth(t){return he(t).endOf("month").format(this.fromToDateFormat)===he(t).format(this.fromToDateFormat)}render(){var t,e,a,i,r;return s`
      <bbva-global-balances-search-api-dm
        ?native="${this.native}"
        .headers="${this.headers}"
        .requiredToken="${this.requiredToken}"
        cachekey="${p(this.pfmBalancesCacheKey)}"
        cachetype="${p(this.pfmBalancesCacheKey&&this.cacheType)}"
        host="${this.host}"
        id="dmBalanceSearch"
        version="${this.balancesApiVersion}"
        @api-dm-error="${()=>this._handleBalancesSearchError(ce)}"
        @balances-search-api-dm-fetch-error="${()=>this._handleBalancesSearchError(ce)}"
        @balances-search-api-dm-fetch="${t=>this._handleBalancesSearchResponse(t.detail)}"
      ></bbva-global-balances-search-api-dm>

      <bbva-global-pfm-budgets-api-dm
        ?native="${this.native}"
        .headers="${this.headers}"
        .requiredToken="${this.requiredToken}"
        cachekey="${p(this.pfmBudgetsCacheKey)}"
        cachetype="${p(this.pfmBudgetsCacheKey&&this.cacheType)}"
        host="${this.host}"
        id="dmPfmBudgets"
        version="${this.personalFinancesApiVersion}"
        @pfm-budgets-api-dm-fetch="${t=>this._setCommonResourceData(this._idBudgetsDm,t.detail)}"
      ></bbva-global-pfm-budgets-api-dm>

      <bbva-global-petty-expenses-balances-api-dm
        ?native="${this.native}"
        .headers="${this.headers}"
        .requiredToken="${this.requiredToken}"
        host="${this.host}"
        id="dmPettyExpensesBalances"
        version="${this.personalFinancesApiVersion}"
        @petty-expenses-balances-api-dm-fetch="${this._setPettyResourceData}"
      ></bbva-global-petty-expenses-balances-api-dm>

      <bbva-global-piggy-banks-api-dm
        ?native="${this.native}"
        .headers="${this.headers}"
        .requiredToken="${this.requiredToken}"
        cachekey="${p(this.pfmPiggyBanksCacheKey)}"
        cachetype="${p(this.pfmPiggyBanksCacheKey&&this.cacheType)}"
        host="${this.host}"
        id="dmPiggyBanks"
        version="${this.piggyBanksApiVersion}"
        @piggy-banks-api-dm-fetch="${t=>this._setCommonResourceData("PiggyBanks",t.detail)}"
      ></bbva-global-piggy-banks-api-dm>

      ${this._savingStatus===ce||this.hideSavingDataPanel?"":s`
            <div class="card-container" ambient="primary-alt">
              <bbva-header-category
                heading-level="3"
                text="${this.t("pfm-saving-tools-head-title")}"
              ></bbva-header-category>
              <pfm-saving-tools-list-definition-amount
                ?discreet-mode="${this.discreetMode}"
                ?loading="${this._savingStatus===pe}"
                amount="${null===(t=this._savingData)||void 0===t?void 0:t.amount}"
                badge-variability-color="${null===(e=this._savingData)||void 0===e?void 0:e.badgeVariabilityColor}"
                badge-variability-status="${null===(a=this._savingData)||void 0===a?void 0:a.badgeVariabilityStatus}"
                currency-code="${null===(i=this._savingData)||void 0===i?void 0:i.currencyCode}"
                description="${this.amountInfo}"
                local-currency="${null===(r=this._savingData)||void 0===r?void 0:r.currencyCode}"
              ></pfm-saving-tools-list-definition-amount>
              ${this.hideSavingCheckLink||this.hideSavingDataPanel?c:s`
                    <bbva-type-link @click=${this._onLinkClick}>
                      <span>${this.t("pfm-saving-tools-link")}</span>
                    </bbva-type-link>
                  `}
            </div>
          `}
      ${this.hideSavingToolsTitle?c:s`
            <bbva-header-category
              ambient="primary"
              heading-level="3"
              id="toolsTitle"
              text="${this.t("pfm-saving-tools-title-options")}"
            ></bbva-header-category>
          `}

      <div role="list" ?hidden="${this.hideSavingToolsList}">
        ${nt(this.listToolsOptions,(t=>t.id),((t,e)=>{var a,i,r;const n=t.id.toLowerCase(),o="pettyexpenses"===n?C(null===(a=this._pettyExpenseLimit)||void 0===a?void 0:a.amount,{currencyCode:null===(i=this._pettyExpenseLimit)||void 0===i?void 0:i.currency,localCurrency:null===(r=this._pettyExpenseLimit)||void 0===r?void 0:r.currency,language:this.language}):"",l=t.badgeText&&this.t(t.badgeText,{numberItems:t.elements});return s`
              <div role="listitem">
                <pfm-saving-tools-list-default
                  ?loading="${this._savingStatus===pe}"
                  .icon="${t.icon}"
                  badge-text="${p(l)}"
                  badge-type="success"
                  description="${this.t(t.description||`pfm-saving-tools-${n}-text`,{amount:o})}"
                  heading="${this.t(t.title||`pfm-saving-tools-${n}-title`)}"
                  headingLevel="${t.headingLevel||this.headingLevel}"
                  id="bbvaListDefault${t.id}"
                  @click="${t=>this._onSavingToolItemClick(t,n)}"
                ></pfm-saving-tools-list-default>
                ${this.listToolsOptions.length-1!==e?s` <bbva-divider-default></bbva-divider-default> `:""}
              </div>
            `}))}
      </div>
    `}_onSavingToolItemClick(t,e){t.preventDefault(),this.dispatchEvent(new CustomEvent(`pfm-saving-tools-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}_onLinkClick(){this.dispatchEvent(new CustomEvent("pfm-saving-tools-link-click",{detail:!0,composed:!0,bubbles:!0}))}}customElements.define("pfm-saving-tools",me);
