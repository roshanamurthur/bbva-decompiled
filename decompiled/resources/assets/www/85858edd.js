import{z as t,L as e,ak as o,a8 as i,ac as a,ad as r,ab as s,be as n,an as l,cE as c,dv as d,da as m,h as p,dw as u,aV as h,aa as b,ct as v,bF as g,aN as y,ah as f,i as _,bo as $,bp as w,bq as S,as as x,at as C,dI as P,aT as k,bb as T,dZ as E,ex as I,ai as A,aM as D,ey as M,ep as F,aD as B,aZ as R,J as O,a7 as L,aJ as V,ap as q,bj as N,ag as z,b5 as H,dt as j,a$ as G,b1 as U,a9 as W,aI as Y,aX as K,F as X,b4 as J,cm as Q,a_ as Z,cp as tt,cO as et,cn as ot,co as it,fX as at,av as rt,bf as st,bh as nt,bc as lt,bU as ct,b6 as dt,cS as mt,b0 as pt,H as ut,dR as ht,eH as bt,fL as vt,fY as gt,fM as yt,fZ as ft,fK as _t,fc as $t,fN as wt,ew as St,f_ as xt,f$ as Ct,g0 as Pt,g1 as kt,g2 as Tt,g3 as Et,g4 as It,g5 as At,g6 as Dt,eF as Mt,g7 as Ft,cX as Bt,fk as Rt,fg as Ot,g8 as Lt,g9 as Vt,ga as qt,gb as Nt,eD as zt,ci as Ht,e_ as jt,aO as Gt,cU as Ut,gc as Wt,cK as Yt,bH as Kt,cM as Xt,bI as Jt,gd as Qt,ge as Zt,gf as te,ch as ee,D as oe,du as ie,cD as ae,bg as re,A as se,cw as ne,cP as le,b7 as ce,y as de,v as me,dz as pe,fJ as ue,j as he,l as be,a2 as ve,m as ge,dl as ye,p as fe,b8 as _e,eW as $e,b9 as we,cG as Se,o as xe,e as Ce,e$ as Pe,aA as ke,gg as Te,f as Ee,g as Ie,ck as Ae,W as De,ff as Me,ds as Fe}from"./952f98a9.js";import{s as Be}from"./8dab2181.js";import{R as Re,S as Oe,D as Le,T as Ve,v as qe,x as Ne,G as ze,z as He,A as je,H as Ge,F as Ue,ex as We,M as Ye,L as Ke,e as Xe,ah as Je,E as Qe,ae as Ze,a3 as to,a4 as eo,af as oo,I as io,Q as ao,N as ro,a5 as so,K as no,a6 as lo,a2 as co,at as mo,a1 as po,as as uo}from"./216055dc.js";import{by as ho,o as bo,d2 as vo,ba as go,y as yo,d6 as fo,bp as _o,d7 as $o,x as wo,d8 as So,bo as xo,cC as Co,bS as Po,bT as ko,bQ as To,aI as Eo,aH as Io,bP as Ao,d4 as Do,d9 as Mo,d5 as Fo,da as Bo,db as Ro,dc as Oo,dd as Lo,de as Vo,df as qo,dg as No}from"./7f3d7ca9.js";import{B as zo,a as Ho,d as jo,c as Go}from"./ff7f0130.js";import{B as Uo}from"./854beed0.js";import{b as Wo,B as Yo}from"./84dff06e.js";import{B as Ko,a as Xo,b as Jo}from"./d2484b66.js";import{a as Qo}from"./4656db6d.js";import{B as Zo}from"./5cdfdc82.js";import{B as ti}from"./187e605b.js";import{b as ei}from"./9b163ef4.js";import"./b87bf4dd.js";import{B as oi}from"./d9e9a750.js";import{B as ii}from"./c0a2f832.js";import"./cae0f1de.js";var ai=t`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class ri extends e{static get is(){return"bbva-controller-sustainable-appliance-simulator"}static get properties(){return{featureFlags:{type:Object}}}constructor(){super(),this.featureFlags={}}static get styles(){return[ai,o("bbva-controller-sustainable-appliance-simulator-shared-styles")]}updated(t){if(t.has("featureFlags")&&Object.keys(this.featureFlags).length){var e,o;const t={products:null===(e=this.featureFlags["glomo.sustainability.applianceSimulator.products"])||void 0===e?void 0:e.value,promotions:null===(o=this.featureFlags["glomo.sustainability.applianceSimulator.promotions"])||void 0===o?void 0:o.value};this._dispatch("set-toggles-flags",t)}}navigateToCreditCardHolder(t){var e;const o={offerId:t.id,productId:null==t||null===(e=t.product)||void 0===e?void 0:e.contractId,continue:"appliance-simulator"};this._dispatch("navigate-to-credit-card-holder",o)}navigateToIncrementLimitCreditCard(t){var e;const o={offerId:t.id,productId:null==t||null===(e=t.product)||void 0===e?void 0:e.contractId};this._dispatch("navigate-to-increment-limit-credit-card",o)}closeCustomizeConsumptionModal(){this._dispatch("close-customize-consumption-modal",!1)}setCachedUser(t){const e=null==t?void 0:t.username;this._dispatch("set-cached-user",e)}_dispatch(t,e){this.dispatchEvent(new CustomEvent(`${ri.is}-${t}`,{bubbles:!0,composed:!0,detail:e}))}}customElements.define(ri.is,ri);class si extends e{static get is(){return"bbva-analyticmanager-sustainability-appliance-simulator"}static get properties(){return{persistData:{type:Object}}}constructor(){super(),this.persistData={}}static get styles(){return[Be,o("bbva-analyticmanager-sustainability-shared-styles")]}pageView(t){this.persistData.applicationCustomFields=t?"gasto anual:promedio":"gasto anual:conocido",this._dispatch("page-view",this.persistData)}analyticsModals(t){if(t.visible){var e,o,i,a,r;const s=(null===(e=t.target)||void 0===e?void 0:e.id)||(null===(o=t.modal)||void 0===o?void 0:o.id),n={"sustainability-sustainable-appliance-simulator-edit-consumption-modal":{label:"editar gasto",event:"modal-edit",errorDescription:""},"sustainability-sustainable-appliance-simulator-customize-consumption-modal":{label:"personalizar gasto",event:"modal-customize",errorDescription:""},"sustainability-sustainable-appliance-simulator-calculation-explanation-modal":{label:"como hacemos los calculos",event:"modal-calculation",errorDescription:""}};this.persistData.pageName=`app:privada:personas:sostenibilidad:simulador electrodomesticos:${null===(i=n[s])||void 0===i?void 0:i.label}`,this.persistData.pageInfoErrorPage=null===(a=n[s])||void 0===a?void 0:a.errorDescription,this._dispatch(null===(r=n[s])||void 0===r?void 0:r.event,this.persistData)}}_dispatch(t,e){this.dispatchEvent(new CustomEvent(`${si.is}-${t}`,{bubbles:!0,composed:!0,detail:e}))}}customElements.define(si.is,si);var ni=t`
:host {
  --_button-default-color: var(--bbva-button-default--_ambient--color,
      var(--bbva-button-default--custom--primary-ambient--color,
        ${Re("colorPrimaryCtaMainTextDefault",Oe)}));
  --_button-default-focus-border-color: var(--bbva-button-default--_ambient--focus-border-color,
    var(--bbva-button-default--custom--primary-ambient--focus-border-color,
      ${Re("colorPrimarySurfaceAmbientFocus",Oe)}));
  --_button-default-bg-color: var(--bbva-button-default--_ambient--bg-color,
    var(--bbva-button-default--custom--primary-ambient--bg-color,
      ${Re("colorPrimaryCtaMainBackgroundDefault",Oe)}));
  --_button-default-color-active: var(--bbva-button-default--_ambient--color-active,
    var(--bbva-button-default--custom--primary-ambient--color-active,
      ${Re("colorPrimaryCtaMainTextDefault",Oe)}));
  --_button-default-bg-color-active: var(--bbva-button-default--_ambient--bg-color-active,
    var(--bbva-button-default--custom--primary-ambient--bg-color-active,
      ${Re("colorPrimaryCtaMainBackgroundPressed",Oe)}));
  --_button-default-bg-color-disabled: var(--bbva-button-default--_ambient--bg-color-disabled,
    var(--bbva-button-default--custom--primary-ambient--bg-color-disabled,
      ${Re("colorPrimaryCtaDisabledBackground",Oe)}));
  --_button-default-color-disabled: var(--bbva-button-default--_ambient--color-disabled,
    var(--bbva-button-default--custom--primary-ambient--color-disabled,
      ${Re("colorPrimaryCtaDisabledText",Oe)}));
  /* Secondary styles */
  --_button-default-secondary-color: var(--bbva-button-default--_ambient--secondary-color,
    var(--bbva-button-default--custom--primary-ambient--secondary-color,
      ${Re("colorPrimaryCtaComplementaryTextDefault",Oe)}));
  --_button-default-secondary-bg-color: var(--bbva-button-default--_ambient--secondary-bg-color,
    var(--bbva-button-default--custom--primary-ambient--secondary-bg-color,
      transparent));
  --_button-default-secondary-border-color: var(--bbva-button-default--_ambient--secondary-border-color,
    var(--bbva-button-default--custom--primary-ambient--secondary-border-color,
      ${Re("colorPrimaryCtaComplementaryBorderDefault",Oe)}));
  --_button-default-secondary-color-active: var(--bbva-button-default--_ambient--secondary-color-active,
    var(--bbva-button-default--custom--primary-ambient--secondary-color-active,
      ${Re("colorPrimaryCtaComplementaryTextPressed",Oe)}));
  --_button-default-secondary-bg-color-active: var(--bbva-button-default--_ambient--secondary-bg-color-active,
    var(--bbva-button-default--custom--primary-ambient--secondary-bg-color-active,
      ${Re("colorPrimaryCtaComplementaryBackgroundPressed",Oe)}));
  --_button-default-secondary-bg-color-disabled: var(--bbva-button-default--_ambient--secondary-bg-color-disabled,
    var(--bbva-button-default--custom--primary-ambient--bg-color-disabled,
      ${Re("colorPrimaryCtaDisabledBackground",Oe)}));
  /* icon no-background styles */
  --_button-default-icon-no-background-color: var(--bbva-button-default--_ambient--icon-no-background-color,
    var(--bbva-button-default--custom--primary-ambient--icon-no-background-color,
      ${Re("colorPrimaryLinkMainDefault",Oe)}));
  --_button-default-icon-no-background-color-active: var(--bbva-button-default--_ambient--icon-no-background-color-active,
    var(--bbva-button-default--custom--primary-ambient--icon-no-background-color-active,
      ${Re("colorPrimaryLinkMainPressed",Oe)}));
  --_button-default-positive-color: var(--bbva-button-default--_ambient--positive-color,
    var(--bbva-button-default--custom--primary-ambient--positive-color,
      ${Re("colorPrimaryCtaPositiveTextDefault",Oe)}));
  --_button-default-positive-bg-color: var(--bbva-button-default--_ambient--positive-bg-color,
    var(--bbva-button-default--custom--primary-ambient--positive-bg-color,
      ${Re("colorPrimaryCtaPositiveBackgroundDefault",Oe)}));
  --_button-default-positive-color-active: var(--bbva-button-default--_ambient--positive-color-active,
    var(--bbva-button-default--custom--primary-ambient--positive-color-active,
      ${Re("colorPrimaryCtaPositiveTextPressed",Oe)}));
  --_button-default-positive-bg-color-active: var(--bbva-button-default--_ambient--positive-bg-color-active,
    var(--bbva-button-default--custom--primary-ambient--positive-bg-color-active,
      ${Re("colorPrimaryCtaPositiveBackgroundPressed",Oe)}));
  --_button-default-positive-color-disabled: var(--bbva-button-default--_ambient--positive-color-disabled,
    var(--bbva-button-default--custom--primary-ambient--positive-color-disabled,
      ${Re("colorPrimaryCtaDisabledText",Oe)}));
  --_button-default-positive-bg-color-disabled: var(--bbva-button-default--_ambient--positive-bg-color-disabled,
  var(--bbva-button-default--custom--primary-ambient--positive-bg-color-disabled,
    ${Re("colorPrimaryCtaDisabledBackground",Oe)}));
  /* Alert styles */
  --_button-default-alert-secondary-color: var(--bbva-button-default--_ambient--alert-secondary-color,
    var(--bbva-button-default--custom--primary-ambient--alert-secondary-color,
      ${Re("colorPrimaryLinkInverseDefault",Oe)}));
  --_button-default-alert-secondary-bg-color: var(--bbva-button-default--_ambient--alert-secondary-bg-color,
    var(--bbva-button-default--custom--primary-ambient--alert-secondary-bg-color,
      ${Re("colorPrimarySurfaceAlternativeDefault",Oe)}));
  --_button-default-alert-secondary-color-active: var(--bbva-button-default--_ambient--alert-secondary-color-active,
    var(--bbva-button-default--custom--primary-ambient--alert-secondary-color-active,
      ${Re("colorPrimaryLinkInversePressed",Oe)}));
  --_button-default-alert-secondary-bg-color-active: var(--bbva-button-default--_ambient--alert-secondary-bg-color-active,
    var(--bbva-button-default--custom--primary-ambient--alert-secondary-bg-color-active,
      ${Re("colorPrimarySurfaceAlternativePressed",Oe)}));
  --_button-default-alert-secondary-color-disabled: var(--bbva-button-default--_ambient--alert-secondary-color-disabled,
    var(--bbva-button-default--custom--primary-ambient--alert-secondary-color-disabled,
      ${Re("colorPrimaryCtaDisabledText",Oe)}));
  --_button-default-alert-secondary-bg-color-disabled: var(--bbva-button-default--_ambient--alert-secondary-bg-color-disabled,
    var(--bbva-button-default--custom--primary-ambient--bg-color-disabled,
      ${Re("colorPrimaryCtaDisabledBackground",Oe)}));
  /* Icon */
  --_button-default-icon-background: var(--bbva-button-default--_ambient--icon-background,
    var(--bbva-button-default--custom--primary-ambient--icon-background,
      ${Re("colorPrimaryCtaMainBackgroundDefault",Oe)}));
  --_button-default-icon-color: var(--bbva-button-default--_ambient--icon-color,
    var(--bbva-button-default--custom--primary-ambient--icon-color,
      ${Re("colorPrimaryCtaMainTextDefault",Oe)}));
  --_button-default-icon-background-disabled: var(--bbva-button-default--_ambient--icon-background-disabled,
    var(--bbva-button-default--custom--primary-ambient--icon-background-disabled,
      ${Re("colorPrimaryCtaDisabledBackground",Oe)}));
  --_button-default-icon-color-disabled: var(--bbva-button-default--_ambient--icon-color-disabled,
    var(--bbva-button-default--custom--primary-ambient--icon-color-disabled,
      ${Re("colorPrimaryCtaDisabledText",Oe)}));
  --_button-default-icon-background-active: var(--bbva-button-default--_ambient--icon-background-active,
    var(--bbva-button-default--custom--primary-ambient--icon-background-active,
      ${Re("colorPrimaryCtaMainBackgroundPressed",Oe)}));
  --_button-default-icon-color-active: var(--bbva-button-default--_ambient--icon-color-active,
    var(--bbva-button-default--custom--primary-ambient--icon-color-active,
      ${Re("colorPrimaryCtaMainTextPressed",Oe)}));
  /* Icon no-background alternative */
  --_button-default-icon-no-background-alternative-color:
    var(--bbva-button-default--_ambient--icon-no-background-alternative-color,
      var(--bbva-button-default--custom--primary-ambient--icon-no-background-alternative-color,
        ${Re("colorPrimaryLinkComplementaryDefault",Oe)}));
  --_button-default-icon-no-background-alternative-color-active:
    var(--bbva-button-default--_ambient--icon-no-background-alternative-color-active,
      var(--bbva-button-default--custom--primary-ambient--icon-no-background-alternative-color-active,
        ${Re("colorPrimaryLinkComplementaryPressed",Oe)}));
  /* Interactive styles */
  --_button-default-interaction-bg-color: var(--bbva-button-default--_ambient--interaction-bg-color,
    var(--bbva-button-default--custom--primary-ambient--interaction-bg-color,
      ${Re("colorPrimaryCtaMainBackgroundDefault",Oe)}));
  --_button-default-interaction-icon-color: var(--bbva-button-default--_ambient--interaction-icon-color,
    var(--bbva-button-default--custom--primary-ambient--interaction-icon-color,
      ${Re("colorPrimaryCtaMainTextDefault",Oe)}));
  --_button-default-interaction-border-color: var(--bbva-button-default--_ambient--interaction-border-color,
    var(--bbva-button-default--custom--primary-ambient--interaction-border-color,
      transparent));
  --_button-default-interaction-bg-color-active: var(--bbva-button-default--_ambient--interaction-bg-color-active,
    var(--bbva-button-default--custom--primary-ambient--interaction-bg-color-active,
      ${Re("colorPrimaryCtaMainBackgroundPressed",Oe)}));
  --_button-default-interaction-disabled-bg-color: var(--bbva-button-default--_ambient--interaction-disabled-bg-color,
    var(--bbva-button-default--custom--primary-ambient--interaction-disabled-bg-color,
      ${Re("colorPrimaryCtaDisabledBackground",Oe)}));
}
`;const li=t`
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
`,ci=t`
  /* Default styles */
  /* Static */
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-button-default--_ambient--color: var(
      --bbva-button-default--custom--primary-alt-ambient--color,
      ${Re("colorPrimaryAltCtaMainTextDefault",Oe)}
    );

    --bbva-button-default--_ambient--focus-border-color: var(
      --bbva-button-default--custom--primary-alt-ambient--focus-border-color,
      ${Re("colorPrimaryAltSurfaceAmbientFocus",Oe)}
    );

    --bbva-button-default--_ambient--bg-color: var(
      --bbva-button-default--custom--primary-alt-ambient--bg-color,
      ${Re("colorPrimaryAltCtaMainBackgroundDefault",Oe)}
    );
    --bbva-button-default--_ambient--color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--color-active,
      ${Re("colorPrimaryAltCtaMainTextDefault",Oe)}
    );
    --bbva-button-default--_ambient--bg-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--bg-color-active,
      ${Re("colorPrimaryAltCtaMainBackgroundPressed",Oe)}
    );

    --bbva-button-default--_ambient--bg-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--bg-color-disabled,
      ${Re("colorPrimaryAltCtaDisabledBackground",Oe)}
    );

    --bbva-button-default--_ambient--color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--color-disabled,
      ${Re("colorPrimaryAltCtaDisabledText",Oe)}
    );

    /* Secondary styles */
    --bbva-button-default--_ambient--secondary-color: var(
      --bbva-button-default--custom--primary-alt-ambient--secondary-color,
      ${Re("colorPrimaryAltCtaComplementaryTextDefault",Oe)}
    );

    --bbva-button-default--_ambient--secondary-border-color: var(
      --bbva-button-default--custom--primary-alt-ambient--secondary-border-color,
      ${Re("colorPrimaryAltCtaComplementaryBorderDefault",Oe)}
    );

    --bbva-button-default--_ambient--secondary-bg-color: var(
      --bbva-button-default--custom--primary-alt-ambient--secondary-bg-color,
      transparent
    );

    --bbva-button-default--_ambient--secondary-bg-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--secondary-bg-color-active,
      ${Re("colorPrimaryAltCtaComplementaryBackgroundPressed",Oe)}
    );

    --bbva-button-default--_ambient--secondary-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--secondary-color-disabled,
      ${Re("colorPrimaryAltCtaDisabledText",Oe)}
    );

    --bbva-button-default--_ambient--secondary-bg-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--secondary-bg-color-disabled,
      ${Re("colorPrimaryAltCtaDisabledBackground",Oe)}
    );

    /* Icon no-background styles */
    --bbva-button-default--_ambient--icon-no-background-color: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-no-background-color,
      ${Re("colorPrimaryAltLinkMainDefault",Oe)}
    );

    --bbva-button-default--_ambient--icon-no-background-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-no-background-color-active,
      ${Re("colorPrimaryAltLinkMainPressed",Oe)}
    );

    /* Icon no-background alternative styles */

    --bbva-button-default--_ambient--icon-no-background-alternative-color: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-no-background-alternative-color,
      ${Re("colorPrimaryAltLinkComplementaryDefault",Oe)}
    );

    --bbva-button-default--_ambient--icon-no-background-alternative-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-no-background-alternative-color-active,
      ${Re("colorPrimaryAltLinkComplementaryPressed",Oe)}
    );

    /* Positive styles */
    --bbva-button-default--_ambient--positive-color: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-color,
      ${Re("colorPrimaryAltCtaPositiveTextDefault",Oe)}
    );

    --bbva-button-default--_ambient--positive-bg-color: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-bg-color,
      ${Re("colorPrimaryAltCtaPositiveBackgroundDefault",Oe)}
    );

    --bbva-button-default--_ambient--positive-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-color-active,
      ${Re("colorPrimaryAltCtaPositiveTextPressed",Oe)}
    );

    --bbva-button-default--_ambient--positive-bg-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-bg-color-active,
      ${Re("colorPrimaryAltCtaPositiveBackgroundPressed",Oe)}
    );

    --bbva-button-default--_ambient--positive-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-color-disabled,
      ${Re("colorPrimaryAltCtaDisabledText",Oe)}
    );

    --bbva-button-default--_ambient--positive-bg-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-bg-color-disabled,
      ${Re("colorPrimaryAltCtaDisabledBackground",Oe)}
    );

    /* Alert styles */
    --bbva-button-default--_ambient--alert-secondary-color: var(
      --bbva-button-default--custom--primary-alt-ambient-alert-secondary-color,
      ${Re("colorPrimaryAltLinkInverseDefault",Oe)}
    );

    --bbva-button-default--_ambient--alert-secondary-bg-color: var(
      --bbva-button-default--custom--primary-alt-ambient-alert-secondary-bg-color,
      ${Re("colorPrimarySurfaceAmbientDefault",Oe)}
    );

    --bbva-button-default--_ambient--alert-secondary-bg-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient-alert-secondary-bg-color-active,
      ${Re("colorPrimarySurfaceAlternativeDefault",Oe)}
    );

    --bbva-button-default--_ambient--alert-secondary-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient-alert-secondary-color-disabled,
      ${Re("colorPrimaryAltCtaDisabledText",Oe)}
    );

    --bbva-button-default--_ambient--alert-secondary-bg-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--bg-color-disabled,
      ${Re("colorPrimaryAltCtaDisabledBackground",Oe)}
    );

    /* Icon styles */
    --bbva-button-default--_ambient--icon-background: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-background,
      ${Re("colorPrimaryAltCtaMainBackgroundDefault",Oe)}
    );

    --bbva-button-default--_ambient--icon-background-active: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-background-active,
      ${Re("colorPrimaryAltCtaMainBackgroundPressed",Oe)}
    );

    --bbva-button-default--_ambient--icon-background-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-background-disabled,
      ${Re("colorPrimaryAltCtaDisabledBackground",Oe)}
    );

    --bbva-button-default--_ambient--icon-color: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-color,
      ${Re("colorPrimaryAltCtaMainTextDefault",Oe)}
    );

    --bbva-button-default--_ambient--icon-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-color-active,
      ${Re("colorPrimaryAltCtaMainTextPressed",Oe)}
    );

    --bbva-button-default--_ambient--icon-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-color-disabled,
      ${Re("colorPrimaryAltCtaDisabledText",Oe)}
    );

    /* Interactive */
    --bbva-button-default--_ambient--interaction-bg-color: var(
      --bbva-button-default--custom--primary-alt-ambient--interaction-bg-color,
      ${Re("colorPrimaryAltCtaMainBackgroundDefault",Oe)}
    );

    --bbva-button-default--_ambient--interaction-icon-color: var(
      --bbva-button-default--custom--primary-alt-ambient--interaction-icon-color,
      ${Re("colorPrimaryAltCtaMainTextDefault",Oe)}
    );

    --bbva-button-default--_ambient--interaction-border-color: var(
      --bbva-button-default--custom--primary-alt-ambient--interaction-border-color,
      transparent
    );

    --bbva-button-default--_ambient--interaction-bg-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--interaction-bg-color-active,
      ${Re("colorPrimaryAltCtaMainBackgroundPressed",Oe)}
    );

    --bbva-button-default--_ambient--interaction-disabled-bg-color: var(
      --bbva-button-default--custom--primary-alt-ambient--interaction-disabled-bg-color,
      ${Re("colorPrimaryAltCtaDisabledBackground",Oe)}
    );
  }
`,di=t`
  /* Default styles */
  /* Static */
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-button-default--_ambient--color: var(
      --bbva-button-default--custom--secondary-ambient--color,
      ${Re("colorSecondaryCtaMainTextDefault",Oe)}
    );

    --bbva-button-default--_ambient--focus-border-color: var(
      --bbva-button-default--custom--secondary-ambient--focus-border-color,
      ${Re("colorSecondarySurfaceAmbientFocus",Oe)}
    );

    --bbva-button-default--_ambient--bg-color: var(
      --bbva-button-default--custom--secondary-ambient--bg-color,
      ${Re("colorSecondaryCtaMainBackgroundDefault",Oe)}
    );

    --bbva-button-default--_ambient--color-active: var(
      --bbva-button-default--custom--secondary-ambient--color-active,
      ${Re("colorSecondaryCtaMainTextDefault",Oe)}
    );

    --bbva-button-default--_ambient--bg-color-active: var(
      --bbva-button-default--custom--secondary-ambient--bg-color-active,
      ${Re("colorSecondaryCtaMainBackgroundPressed",Oe)}
    );

    --bbva-button-default--_ambient--bg-color-disabled: var(
      --bbva-button-default--custom--secondary-ambient--bg-color-disabled,
      ${Re("colorSecondaryCtaDisabledBackground",Oe)}
    );

    --bbva-button-default--_ambient--color-disabled: var(
      --bbva-button-default--custom--secondary-ambient--color-disabled,
      ${Re("colorSecondaryCtaDisabledText",Oe)}
    );
    /* Secondary styles */
    --bbva-button-default--_ambient--secondary-color: var(
      --bbva-button-default--custom--secondary-ambient--secondary-color,
      ${Re("colorSecondaryCtaComplementaryTextDefault",Oe)}
    );

    --bbva-button-default--_ambient--secondary-bg-color: var(
      --bbva-button-default--custom--secondary-ambient--secondary-bg-color,
      transparent
    );

    --bbva-button-default--_ambient--secondary-border-color: var(
      --bbva-button-default--custom--secondary-ambient--secondary-border-color,
      ${Re("colorSecondaryCtaComplementaryBorderDefault",Oe)}
    );

    --bbva-button-default--_ambient--secondary-color-active: var(
      --bbva-button-default--custom--secondary-ambient--color-active,
      ${Re("colorSecondaryCtaComplementaryTextPressed",Oe)}
    );

    --bbva-button-default--_ambient--secondary-bg-color-active: var(
      --bbva-button-default--custom--secondary-ambient--secondary-bg-color-active,
      ${Re("colorSecondaryCtaComplementaryBackgroundPressed",Oe)}
    );

    --bbva-button-default--_ambient--secondary-color-disabled: var(
      --bbva-button-default--custom--secondary-ambient--secondary-color-disabled,
      ${Re("colorSecondaryCtaDisabledText",Oe)}
    );

    --bbva-button-default--_ambient--secondary-bg-color-disabled: var(
      --bbva-button-default--custom--secondary-ambient--secondary-bg-color-disabled,
      ${Re("colorSecondaryCtaDisabledBackground",Oe)}
    );

    /* Icon no-background styles */
    --bbva-button-default--_ambient--icon-no-background-color: var(
      --bbva-button-default--custom--secondary-ambient--icon-no-background-color,
      ${Re("colorSecondaryLinkMainDefault",Oe)}
    );

    --bbva-button-default--_ambient--icon-no-background-color-active: var(
      --bbva-button-default--custom--secondary-ambient--icon-no-background-color-active,
      ${Re("colorSecondaryLinkMainPressed",Oe)}
    );

    /* Icon no-background alternative styles */

    --bbva-button-default--_ambient--icon-no-background-alternative-color: var(
      --bbva-button-default--custom--secondary-ambient--icon-no-background-alternative-color,
      ${Re("colorSecondaryLinkComplementaryDefault",Oe)}
    );

    --bbva-button-default--_ambient--icon-no-background-alternative-color-active: var(
      --bbva-button-default--custom--secondary-ambient--icon-no-background-alternative-color-active,
      ${Re("colorSecondaryLinkComplementaryPressed",Oe)}
    );

    /* Positive styles */
    --bbva-button-default--_ambient--positive-color: var(
      --bbva-button-default--custom--secondary-ambient--positive-color,
      ${Re("colorSecondaryCtaPositiveTextDefault",Oe)}
    );

    --bbva-button-default--_ambient--positive-bg-color: var(
      --bbva-button-default--custom--secondary-ambient--positive-bg-color,
      ${Re("colorSecondaryCtaPositiveBackgroundDefault",Oe)}
    );

    --bbva-button-default--_ambient--positive-color-active: var(
      --bbva-button-default--custom--secondary-ambient--positive-color-active,
      ${Re("colorSecondaryCtaPositiveTextPressed",Oe)}
    );

    --bbva-button-default--_ambient--positive-bg-color-active: var(
      --bbva-button-default--custom--secondary-ambient--positive-bg-color-active,
      ${Re("colorSecondaryCtaPositiveBackgroundPressed",Oe)}
    );

    --bbva-button-default--_ambient--positive-color-disabled: var(
      --bbva-button-default--custom--secondary-ambient--positive-color-disabled,
      ${Re("colorSecondaryCtaDisabledText",Oe)}
    );

    --bbva-button-default--_ambient--positive-bg-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-bg-color-disabled,
      ${Re("colorSecondaryCtaDisabledBackground",Oe)}
    );

    /* Alert styles */
    --bbva-button-default--_ambient--alert-secondary-color: var(
      --bbva-button-default--custom--secondary-ambient--alert-secondary-color,
      ${Re("colorSecondaryLinkInverseDefault",Oe)}
    );

    --bbva-button-default--_ambient--alert-secondary-bg-color: var(
      --bbva-button-default--custom--secondary-ambient--alert-secondary-bg-color,
      ${Re("colorSecondarySurfaceAlternativeDefault",Oe)}
    );

    --bbva-button-default--_ambient--alert-secondary-color-active: var(
      --bbva-button-default--custom--secondary-ambient--alert-secondary-active-color,
      ${Re("colorSecondaryLinkInversePressed",Oe)}
    );

    --bbva-button-default--_ambient--alert-secondary-bg-color-active: var(
      --bbva-button-default--custom--secondary-ambient--alert-secondary-active-bg-color,
      ${Re("colorSecondarySurfaceAlternativePressed",Oe)}
    );

    /* Icon styles */
    --bbva-button-default--_ambient--icon-background: var(
      --bbva-button-default--custom--secondary-ambient--icon-background,
      ${Re("colorSecondaryCtaMainBackgroundDefault",Oe)}
    );

    --bbva-button-default--_ambient--icon-background-active: var(
      --bbva-button-default--custom--secondary-ambient--icon-background-active,
      ${Re("colorSecondaryCtaMainBackgroundPressed",Oe)}
    );

    --bbva-button-default--_ambient--icon-color-active: var(
      --bbva-button-default--custom--secondary-ambient--icon-color-active,
      ${Re("colorSecondaryCtaMainTextPressed",Oe)}
    );

    --bbva-button-default--_ambient--icon-background-disabled: var(
      --bbva-button-default--custom--secondary-ambient--icon-background-disabled,
      ${Re("colorSecondaryCtaDisabledBackground",Oe)}
    );

    --bbva-button-default--_ambient--icon-color: var(
      --bbva-button-default--custom--secondary-ambient--icon-color,
      ${Re("colorSecondaryCtaMainTextDefault",Oe)}
    );

    --bbva-button-default--_ambient--icon-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-color-disabled,
      ${Re("colorSecondaryCtaDisabledText",Oe)}
    );

    /* Interactive styles */
    --bbva-button-default--_ambient--interaction-bg-color: var(
      --bbva-button-default--custom--secondary-ambient--interaction-bg-color,
      ${Re("colorSecondaryCtaMainBackgroundDefault",Oe)}
    );

    --bbva-button-default--_ambient--interaction-icon-color: var(
      --bbva-button-default--custom--secondary-ambient--interaction-icon-color,
      ${Re("colorSecondaryCtaMainTextDefault",Oe)}
    );

    --bbva-button-default--_ambient--interaction-border-color: var(
      --bbva-button-default--custom--secondary-ambient--interaction-border-color,
      transparent
    );

    --bbva-button-default--_ambient--interaction-bg-color-active: var(
      --bbva-button-default--custom--secondary-ambient--interaction-bg-color-active,
      ${Re("colorSecondaryCtaMainBackgroundPressed",Oe)}
    );

    --bbva-button-default--_ambient--interaction-disabled-bg-color: var(
      --bbva-button-default--custom--secondary-ambient--interaction-disabled-bg-color,
      ${Re("colorSecondaryCtaDisabledBackground",Oe)}
    );
  }
`,mi=t`
  /* Default styles */
  /* Static */
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-button-default--_ambient--color: var(
      --bbva-button-default--custom--secondary-alt-ambient--color,
      ${Re("colorSecondaryAltCtaMainTextDefault",Oe)}
    );

    --bbva-button-default--_ambient--focus-border-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--focus-border-color,
      ${Re("colorSecondaryAltSurfaceAmbientFocus",Oe)}
    );

    --bbva-button-default--_ambient--bg-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--bg-color,
      ${Re("colorSecondaryAltCtaMainBackgroundDefault",Oe)}
    );

    --bbva-button-default--_ambient--color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--color-active,
      ${Re("colorSecondaryAltCtaMainTextDefault",Oe)}
    );

    --bbva-button-default--_ambient--bg-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--bg-color-active,
      ${Re("colorSecondaryAltCtaMainBackgroundPressed",Oe)}
    );

    --bbva-button-default--_ambient--bg-color-disabled: var(
      --bbva-button-default--custom--secondary-alt-ambient--bg-color-disabled,
      ${Re("colorSecondaryAltCtaDisabledBackground",Oe)}
    );

    --bbva-button-default--_ambient--color-disabled: var(
      --bbva-button-default--custom--secondary-alt-ambient--color-disabled,
      ${Re("colorSecondaryAltCtaDisabledText",Oe)}
    );

    /* Secondary styles */
    --bbva-button-default--_ambient--secondary-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--secondary-color,
      ${Re("colorSecondaryAltCtaComplementaryTextDefault",Oe)}
    );

    --bbva-button-default--_ambient--secondary-bg-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--secondary-bg-color,
      transparent
    );

    --bbva-button-default--_ambient--secondary-border-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--secondary-border-color,
      ${Re("colorSecondaryAltCtaComplementaryBorderDefault",Oe)}
    );

    --bbva-button-default--_ambient--secondary-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--secondary-color-active,
      ${Re("colorSecondaryAltCtaComplementaryTextPressed",Oe)}
    );

    --bbva-button-default--_ambient--secondary-bg-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--secondary-bg-color-active,
      ${Re("colorSecondaryAltCtaComplementaryBackgroundPressed",Oe)}
    );

    --bbva-button-default--_ambient--secondary-color-disabled: var(
      --bbva-button-default--custom--secondary-alt-ambient--secondary-color-disabled,
      ${Re("colorSecondaryAltCtaDisabledText",Oe)}
    );

    --bbva-button-default--_ambient--secondary-bg-color-disabled: var(
      --bbva-button-default--custom--secondary-alt-ambient--secondary-bg-color-disabled,
      ${Re("colorSecondaryAltCtaDisabledBackground",Oe)}
    );

    /* Icon no-background styles */
    --bbva-button-default--_ambient--icon-no-background-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-no-background-color,
      ${Re("colorSecondaryAltLinkMainDefault",Oe)}
    );

    --bbva-button-default--_ambient--icon-no-background-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-no-background-color-active,
      ${Re("colorSecondaryAltLinkMainPressed",Oe)}
    );

    /* Icon no-background alternative styles */

    --bbva-button-default--_ambient--icon-no-background-alternative-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-no-background-alternative-color,
      ${Re("colorSecondaryAltLinkComplementaryDefault",Oe)}
    );

    --bbva-button-default--_ambient--icon-no-background-alternative-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-no-background-alternative-color-active,
      ${Re("colorSecondaryAltLinkComplementaryPressed",Oe)}
    );

    /* Positive styles */
    --bbva-button-default--_ambient--positive-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--positive-color,
      ${Re("colorSecondaryAltCtaPositiveTextDefault",Oe)}
    );

    --bbva-button-default--_ambient--positive-bg-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--positive-bg-color,
      ${Re("colorSecondaryCtaPositiveBackgroundDefault",Oe)}
    );

    --bbva-button-default--_ambient--positive-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--positive-color-active,
      ${Re("colorSecondaryAltCtaPositiveTextPressed",Oe)}
    );

    --bbva-button-default--_ambient--positive-bg-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--positive-bg-color-active,
      ${Re("colorSecondaryAltCtaPositiveBackgroundPressed",Oe)}
    );

    --bbva-button-default--_ambient--positive-color-disabled: var(
      --bbva-button-default--custom--secondary-alt-ambient--positive-color-disabled,
      ${Re("colorSecondaryAltCtaDisabledText",Oe)}
    );

    --bbva-button-default--_ambient--positive-bg-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-bg-color-disabled,
      ${Re("colorSecondaryAltCtaDisabledBackground",Oe)}
    );

    /* Alert styles */
    --bbva-button-default--_ambient--alert-secondary-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--alert-secondary-color,
      ${Re("colorSecondaryAltLinkInverseDefault",Oe)}
    );

    --bbva-button-default--_ambient--alert-secondary-bg-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--alert-secondary-bg-color,
      ${Re("colorSecondaryAltSurfaceAlternativeDefault",Oe)}
    );

    --bbva-button-default--_ambient--alert-secondary-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--alert-secondary-active-color,
      ${Re("colorSecondaryAltLinkInversePressed",Oe)}
    );

    --bbva-button-default--_ambient--alert-secondary-bg-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--alert-secondary-active-bg-color,
      ${Re("colorSecondaryAltSurfaceAlternativePressed",Oe)}
    );

    /* Icon styles*/
    --bbva-button-default--_ambient--icon-background: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-background,
      ${Re("colorSecondaryAltCtaMainBackgroundDefault",Oe)}
    );

    --bbva-button-default--_ambient--icon-background-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-background-active,
      ${Re("colorSecondaryAltCtaMainBackgroundPressed",Oe)}
    );

    --bbva-button-default--_ambient--icon-background-disabled: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-background-disabled,
      ${Re("colorSecondaryAltCtaDisabledBackground",Oe)}
    );

    --bbva-button-default--_ambient--icon-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-color,
      ${Re("colorSecondaryAltCtaMainTextDefault",Oe)}
    );

    --bbva-button-default--_ambient--icon-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-color-active,
      ${Re("colorSecondaryAltCtaMainTextPressed",Oe)}
    );

    --bbva-button-default--_ambient--icon-color-disabled: var(
      --bbva-button-default--custom--secondary-ambient--icon-color-disabled,
      ${Re("colorSecondaryAltCtaDisabledText",Oe)}
    );

    /* Interactive styles */
    --bbva-button-default--_ambient--interaction-bg-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--interaction-bg-color,
      ${Re("colorSecondaryAltCtaMainBackgroundDefault",Oe)}
    );

    --bbva-button-default--_ambient--interaction-icon-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--interaction-icon-color,
      ${Re("colorSecondaryAltCtaMainTextDefault",Oe)}
    );

    --bbva-button-default--_ambient--interaction-border-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--interaction-border-color,
      transparent
    );

    --bbva-button-default--_ambient--interaction-bg-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--interaction-bg-color-active,
      ${Re("colorSecondaryAltCtaMainBackgroundPressed",Oe)}
    );

    --bbva-button-default--_ambient--interaction-disabled-bg-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--interaction-disabled-bg-color,
      ${Re("colorSecondaryAltCtaDisabledBackground",Oe)}
    );
  }
`,pi={primary:t`
    ${li}
    ${Le.primary}
    ${Ve.primary}
  `,primaryAlt:t`
    ${ci}
    ${Le.primaryAlt}
    ${Ve.primaryAlt}
  `,secondary:t`
    ${di}
    ${Le.secondary}
    ${Ve.secondary}
  `,secondaryAlt:t`
    ${mi}
    ${Le.secondaryAlt}
    ${Ve.secondaryAlt}
  `},ui=Object.values(pi);var hi=t`
:host {
  position: relative;
  min-width: var(--button-default-min-width, 8rem);
  max-width: 100%;
  height: 3rem;
  box-sizing: border-box;
  padding: 0.75rem 2rem;
  border: none;
  border-radius: var(--button-default-border-radius, var(--borderRadiusSmall, ${i(n.small)}));
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
  font-size: var(--typographyTypeSmall, ${i(a.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${i(r.typeSmall)});
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
  font-style: var(--button-default-font-weight, var(--fontFacePrimaryMediumFontStyle, ${i(s.medium.fontStyle)}));
  font-weight: var(--button-default-font-weight, var(--fontFacePrimaryMediumFontWeight, ${i(s.medium.fontWeight)}));
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
  border-radius: var(--button-default-border-radius, var(--borderRadiusSmall, ${i(n.small)}));
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
  border-radius: var(--button-default-icon-border-radius, var(--borderRadiusSmall, ${i(n.small)}));
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
  border-radius: var(--button-default-icon-border-radius, var(--borderRadiusSmall, ${i(n.small)}));
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
  border-radius: var(--button-default-icon-border-radius, var(--borderRadiusSmall, ${i(n.small)}));
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
`;class bi extends(qe(l(c))){static get is(){return"bbva-button-default"}static get properties(){return{text:{type:String},icon:{type:String},buttonTranscriptLabel:{type:String,attribute:"button-transcript-label"},interaction:{type:Boolean},size:{type:String},keepTalkingAnimation:{type:Boolean,attribute:"keep-talking-animation"},iconTalkingAnimation:{type:String,attribute:"icon-talking-animation"},fullwidth:{type:Boolean,attribute:"fullwidth"},hasEllipsis:{type:Boolean,attribute:"has-ellipsis"},variant:{type:String},iconSize:{type:String,attribute:"icon-size"},loading:{type:Boolean,reflect:!0}}}static get scopedElements(){return{"bbva-type-icon":Ne,"bbva-type-text":ze}}constructor(){super(),this.type="button",this.buttonTranscriptLabel="bbva-button-default-interaction-record-button",this.interaction=!1,this.size="",this.keepTalkingAnimation=!1,this.iconTalkingAnimation=d(),this.fullwidth=!1,this.hasEllipsis=!1,this.loading=!1,delete this.href}static get styles(){return[super.styles,ni,hi,ui,o("bbva-button-default-shared-styles")]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._endRecord=this._endRecord.bind(this),this.interaction&&(this.addEventListener("mousedown",this._startRecord),this.addEventListener("keydown",this._keydownRecord),this.addEventListener("keyup",this._keyupRecord),this.addEventListener("blur",this._endRecord))}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),document.removeEventListener("mouseup",this._endRecord),this.removeEventListener("mousedown",this._startRecord),this.removeEventListener("keydown",this._keydownRecord),this.removeEventListener("keyup",this._keyupRecord),this.removeEventListener("blur",this._endRecord)}_startRecord(){document.addEventListener("mouseup",this._endRecord),this._talking=!0,this.keepTalkingAnimation&&(this.icon=this.iconTalkingAnimation)}set _talking(t){t!==this._isTalking&&(t?(this.setAttribute("talking",""),this.dispatchEvent(new CustomEvent("button-interaction-mic-request",{detail:!0,composed:!0,bubbles:!0}))):(this.removeAttribute("talking"),this.dispatchEvent(new CustomEvent("button-interaction-mic-cancel",{detail:!0,composed:!0,bubbles:!0}))),this._isTalking=t,this.requestUpdate())}get _talking(){return this._isTalking}_keydownRecord(t){32!==t.keyCode&&13!==t.keyCode||this._startRecord()}_keyupRecord(t){32!==t.keyCode&&13!==t.keyCode||this._endRecord()}_endRecord(){document.removeEventListener("mouseup",this._endRecord);this._isTalkingAnimation||!this.keepTalkingAnimation?(this._talking=!1,this._isTalkingAnimation=!1,this.icon=m()):this._isTalkingAnimation=!0}get _icon(){return p`
      <bbva-type-icon
        class="icon"
        icon="${this.variant.includes("alert")?u():this.icon}"
        size="${this._setIconSize}"
        .loading="${this.isLoading}"
      ></bbva-type-icon>
    `}get _setIconSize(){if(this.variant.includes("alert"))return 16;const t={16:16,24:24,32:32};return this.variant.includes("no-background")&&t[this.iconSize]||t[24]}get isLoading(){return this.loading&&this.variant&&this.variant.substring("icon")&&this.variant.substring("no-background")}get _text(){return void 0!==this.text?p`
          <bbva-type-text
            class="text"
            tag="span"
            size="S"
            .text=${this.text}
            ?ellipsis="${this.hasEllipsis}"
            alignment="center"
          ></bbva-type-text>
        `:p` <slot class="text slot-text ${this.hasEllipsis?"ellipsis":""}"></slot> `}get _interaction(){return p`
      <div class="action transcript">
        <span id="action-container" class="action-glow">
          <span class="before"></span><span class="after"></span>
        </span>
        <span class="sr-only">${this.t(this.buttonTranscriptLabel)}</span>
        <bbva-type-icon class="action-icon" .icon="${this.icon}" size="24"></bbva-type-icon>
      </div>
    `}get _buttonDefault(){var t;const e=void 0!==this.icon||null!==(t=this.variant)&&void 0!==t&&t.includes("alert")?this._icon:h;return this.interaction?p`${this._interaction}`:p`${e}${this._text}${this._action}`}render(){return p`
      <div onclick="void(0)" class="wrapper ${this.fullwidth?"fullwidth":""}">
        ${this._buttonDefault}
      </div>
    `}}var vi=t`
:host {
  display: block;
  box-sizing: border-box;
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

.field {
  position: relative;
  height: 3rem;
  flex: auto;
  border-bottom: 1px solid var(--_form-field-border-color);
  background-color: var(--_form-field-bg-color);
}
:host([focused]) .field {
  border-bottom-color: var(--_form-field-focused-border-color);
}
:host([invalid]:not([action-into-form])) .field {
  background-color: var(--_form-field-invalid-field-bg-color);
  border-bottom-color: var(--_form-field-invalid-field-border-color);
}

.slot-input ::slotted(input) {
  width: 100%;
  height: 100%;
  font-family: inherit;
  font-size: var(--bbva-form-field-input-font-size, var(--typographyTypeSmall, ${i(a.typeSmall)}));
  color: var(--_form-field-input-color);
  background-color: transparent;
  border: none;
  margin: 0;
  padding: calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 15) * 1em) calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 15) * 1em);
  position: relative;
  outline: none;
  appearance: none;
  box-shadow: none;
  box-sizing: border-box;
}
:host([focused]) .slot-input ::slotted(input), :host([invalid][filled]) .slot-input ::slotted(input) {
  max-width: calc(100% - 3rem);
}
:host([readonly]) .slot-input ::slotted(input) {
  color: var(--_form-field-readonly-input-color);
}
.slot-input ::slotted(input)::-ms-clear {
  display: none;
}

.slot-input ::slotted(input)::placeholder {
  padding-left: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1em);
  color: var(--_form-field-input-placeholder-color);
}

.slot-input ::slotted(input:not(:focus):placeholder-shown) {
  opacity: 0;
}

:host([type=number]) .slot-input ::slotted(input) {
  -moz-appearance: textfield;
}

:host([type=search]) .slot-input ::slotted(input) {
  -webkit-appearance: textfield;
}

.label {
  position: absolute;
  top: 0;
  left: 1rem;
  right: 1rem;
  color: var(--_form-field-label-color);
  font-size: var(--bbva-form-field-label-font-size, var(--typographyTypeSmall, ${i(a.typeSmall)}));
  line-height: var(--bbva-form-field-label-line-height, var(--lineHeightTypeSmall, ${i(r.typeSmall)}));
  font-weight: var(--bbva-form-field-label-font-weight, var(--fontFacePrimaryBookFontWeight, ${i(s.book.fontWeight)}));
  will-change: transform;
  transform: translateY(0.75rem);
  transform-origin: top left;
  transition: transform 0.2s ease-in-out;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
:host([focused]) .label, :host([filled]) .label {
  color: var(--_form-field-focused-label-color);
  transform: translateY(0.15rem) scale(0.8);
}
.label :host([invalid]) {
  color: var(--_form-field-invalid-field-label-color);
}
:host([readonly]) .label {
  color: var(--_form-field-readonly-label-color);
}

.label-out {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem);
  display: flex;
  align-items: center;
}

[data-tag-name=bbva-type-link] {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem);
}

.clear {
  display: none;
  position: absolute;
  top: 0;
  right: 0;
  --bbva-button-default--_ambient--link-color: var(--_form-field-action-icon-color);
}
:host([focused]) .clear, :host([invalid][filled]) .clear {
  display: flex;
}

:host([invalid]) {
  /* Remove Firefox invalid inputs red border */
}
:host([invalid]) .slot-input ::slotted(input),
:host([invalid]) .slot-input ::slotted(input:invalid) {
  box-shadow: none;
  color: var(--_form-field-invalid-field-color);
}
:host([invalid]) .label {
  color: var(--_form-field-invalid-field-label-color);
}
:host([invalid]) .clear, :host([invalid]):host([action-into-form][action-variant]) .action {
  --bbva-button-default--_ambient--link-color: var(--_form-field-invalid-field-label-color);
  --bbva-button-default--_ambient--icon-no-background-color: var(--_form-field-invalid-error-icon-color);
}

:host([action-into-form]) .action {
  flex: 0 0 auto;
  --bbva-button-default--_ambient--link-color: var(--_form-field-action-icon-color);
}
:host([action-into-form]) .wrapper {
  display: flex;
  align-items: center;
  background-color: var(--_form-field-bg-color);
  border-bottom: 1px solid var(--_form-field-border-color);
}
:host([action-into-form]):host([invalid]) .field, :host([action-into-form]) .field {
  background-color: transparent;
  border-bottom: none;
}
:host([action-into-form]) .wrapper-action {
  display: flex;
  padding: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1em) calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1em) calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1em) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1em);
}
:host([action-into-form]) .wrapper-action [data-tag-name=bbva-type-icon] {
  fill: var(--_form-field-no-action-icon-color);
}
:host([action-into-form]) .wrapper-action [data-tag-name=bbva-type-icon][disabled] {
  color: unset;
}
:host([action-into-form]):host([readonly]) .wrapper-action [data-tag-name=bbva-type-icon] {
  fill: var(--_form-field-readonly-icon-color);
}
:host([action-into-form]):host([invalid]) .wrapper {
  background-color: var(--_form-field-invalid-field-bg-color);
  border-bottom-color: var(--_form-field-invalid-field-border-color);
}
:host([action-into-form]):host([invalid]) .wrapper-action [data-tag-name=bbva-type-icon] {
  fill: var(--_form-field-invalid-action-icon-color);
  --bbva-button-default--_ambient--color: var(--_form-field-invalid-action-icon-color);
}

:host(:not([action-into-form])) .wrapper .field {
  border-bottom: none;
  background-color: transparent;
}

:host([action-into-form][action-type]:not([action-variant]):not([readonly])) .wrapper {
  border-bottom: none;
}
:host([action-into-form][action-type]:not([action-variant]):not([readonly])) .field {
  border-bottom: 1px solid var(--_form-field-border-color);
}

:host([action-into-form][icon-variant][action-type]:not([action-variant]):not([readonly])) .wrapper {
  border-bottom: 1px solid var(--_form-field-border-color);
}
:host([action-into-form][icon-variant][action-type]:not([action-variant]):not([readonly])) .field {
  border-bottom: none;
}

.message {
  display: flex;
  justify-content: flex-start;
  align-items: flex-start;
  font-size: var(--bbva-form-field-message-font-size, var(--typographyType3XSmall, ${i(a.type3XSmall)}));
  line-height: var(--bbva-form-field-message-line-height, var(--lineHeightType3XSmall, ${i(r.type3XSmall)}));
  color: var(--_form-field-message-color);
}

.notification {
  padding-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1em);
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem);
}

:host(:not([action-into-form])[disabled]) .field, :host([disabled]) [data-tag-name=bbva-type-icon], :host([disabled]) .wrapper {
  opacity: 0.4;
}
`,gi=t`
:host {
  --_form-field-bg-color:
      var(--bbva-form-field--_ambient--bg-color,
          var(--bbva-form-field--custom--primary-ambient--bg-color,
              ${Re("colorPrimaryFormInputBackgroundDefault",Oe)}));
  --_form-field-input-color:
      var(--bbva-form-field--_ambient--input-color,
          var(--bbva-form-field--custom--primary-ambient--input-color,
              ${Re("colorPrimaryFormInputFieldTextDefault",Oe)}));
  --_form-field-invalid-field-color:
      var(--bbva-form-field--_ambient--invalid-field-color,
          var(--bbva-form-field--custom--primary-ambient--invalid-field-color,
              ${Re("colorPrimaryFormInputFieldTextError",Oe)}));
  --_form-field-input-placeholder-color:
      var(--bbva-form-field--_ambient--input-placeholder-color,
          var(--bbva-form-field--custom--primary-ambient--input-placeholder-color,
              ${Re("colorPrimaryFormInputPlaceholderDefault",Oe)}));
  --_form-field-readonly-input-color:
      var(--bbva-form-field--_ambient--readonly-input-color,
          var(--bbva-form-field--custom--primary-ambient--readonly-input-color,
              ${Re("colorPrimaryFormInputPlaceholderDefault",Oe)}));
  --_form-field-label-color:
      var(--bbva-form-field--_ambient--label-color,
          var(--bbva-form-field--custom--primary-ambient--label-color,
              ${Re("colorPrimaryFormInputPlaceholderDefault",Oe)}));
  --_form-field-focused-label-color:
      var(--bbva-form-field--_ambient--focused-label-color,
          var(--bbva-form-field--custom--primary-ambient--focused-label-color,
              ${Re("colorPrimaryFormInputPlaceholderDefault",Oe)}));
  --_form-field-readonly-label-color:
      var(--bbva-form-field--_ambient--readonly-label-color,
          var(--bbva-form-field--custom--primary-ambient--readonly-label-color,
              ${Re("colorPrimaryFormInputPlaceholderDefault",Oe)}));
  --_form-field-border-color:
      var(--bbva-form-field--_ambient--border-color,
          var(--bbva-form-field--custom--primary-ambient--border-color,
              ${Re("colorPrimaryFormInputBorderInactive",Oe)}));
  --_form-field-focused-border-color:
      var(--bbva-form-field--_ambient--focused-border-color,
          var(--bbva-form-field--custom--primary-ambient--focused-border-color,
              ${Re("colorPrimaryFormInputBorderActive",Oe)}));
  --_form-field-invalid-field-bg-color:
      var(--bbva-form-field--_ambient--invalid-field-bg-color,
          var(--bbva-form-field--custom--primary-ambient--invalid-field-bg-color,
              ${Re("colorPrimaryFormInputBackgroundError",Oe)}));
  --_form-field-invalid-field-border-color:
      var(--bbva-form-field--_ambient--invalid-field-border-color,
          var(--bbva-form-field--custom--primary-ambient--invalid-field-border-color,
              ${Re("colorPrimaryFormInputBorderError",Oe)}));
  --_form-field-invalid-field-label-color:
      var(--bbva-form-field--_ambient--invalid-field-label-color,
          var(--bbva-form-field--custom--primary-ambient--invalid-field-label-color,
              ${Re("colorPrimaryFormInputPlaceholderError",Oe)}));
  --_form-field-action-icon-color:
      var(--bbva-form-field--_ambient--action-icon-color,
          var(--bbva-form-field--custom--primary-ambient--action-icon-color,
              ${Re("colorPrimaryFormInputIconDefault",Oe)}));
  --_form-field-no-action-icon-color:
      var(--bbva-form-field--_ambient--no-action-icon-color,
          var(--bbva-form-field--custom--primary-ambient--no-action-icon-color,
              ${Re("colorPrimaryFormInputIconReadOnly",Oe)}));
  --_form-field-invalid-action-icon-color:
      var(--bbva-form-field--_ambient--invalid-action-icon-color,
          var(--bbva-form-field--custom--primary-ambient--invalid-action-icon-color,
              ${Re("colorPrimaryFormInputPlaceholderError",Oe)}));
  --_form-field-readonly-icon-color:
      var(--bbva-form-field--_ambient--readonly-icon-color,
          var(--bbva-form-field--custom--primary-ambient--readonly-icon-color,
              ${Re("colorPrimaryFormInputIconReadOnly",Oe)}));
  --_form-field-invalid-error-icon-color:
      var(--bbva-form-field--_ambient--invalid-error-icon-color,
          var(--bbva-form-field--custom--primary-ambient--invalid-error-icon-color,
              ${Re("colorPrimaryFormInputIconError",Oe)}));
}
`;const yi=t`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-form-field--_ambient--bg-color: initial;
    --bbva-form-field--_ambient--input-placeholder-color: initial;
    --bbva-form-field--_ambient--invalid-field-color: initial;
    --bbva-form-field--_ambient--input-color: initial;
    --bbva-form-field--_ambient--readonly-input-color: initial;
    --bbva-form-field--_ambient--readonly-icon-color: initial;
    --bbva-form-field--_ambient--label-color: initial;
    --bbva-form-field--_ambient--focused-label-color: initial;
    --bbva-form-field--_ambient--readonly-label-color: initial;
    --bbva-form-field--_ambient--border-color: initial;
    --bbva-form-field--_ambient--focused-border-color: initial;
    --bbva-form-field--_ambient--invalid-field-bg-color: initial;
    --bbva-form-field--_ambient--invalid-field-border-color: initial;
    --bbva-form-field--_ambient--invalid-field-label-color: initial;
    --bbva-form-field--_ambient--action-icon-color: initial;
    --bbva-form-field--_ambient--no-action-icon-color: initial;
    --bbva-form-field--_ambient--invalid-action-icon-color: initial;
    --bbva-form-field--_ambient--invalid-error-icon-color: initial;
  }
`,fi=t`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-form-field--_ambient--bg-color: var(
      --bbva-form-field--custom--primary-alt-ambient--bg-color,
      ${Re("colorPrimaryAltFormInputBackgroundDefault",Oe)}
    );

    --bbva-form-field--_ambient--input-color: var(
      --bbva-form-field--custom--primary-alt-ambient--input-color,
      ${Re("colorPrimaryAltFormInputFieldTextDefault",Oe)}
    );

    --bbva-form-field--_ambient--invalid-field-color: var(
      --bbva-form-field--custom--primary-alt-ambient--invalid-field-color,
      ${Re("colorPrimaryAltFormInputFieldTextError",Oe)}
    );

    --bbva-form-field--_ambient--input-placeholder-color: var(
      --bbva-form-field--custom--primary-alt-ambient--input-placeholder-color,
      ${Re("colorPrimaryAltFormInputPlaceholderDefault",Oe)}
    );

    --bbva-form-field--_ambient--readonly-input-color: var(
      --bbva-form-field--custom--primary-alt-ambient--readonly-input-color,
      ${Re("colorPrimaryAltFormInputPlaceholderDefault",Oe)}
    );

    --bbva-form-field--_ambient--readonly-icon-color: var(
      --bbva-form-field--custom--secondary-ambient--readonly-icon-color,
      ${Re("colorPrimaryAltFormInputIconReadOnly",Oe)}
    );

    --bbva-form-field--_ambient--no-action-icon-color: var(
      --bbva-form-field--custom--primary-alt-ambient--no-action-icon-color,
      ${Re("colorPrimaryAltFormInputIconReadOnly",Oe)}
    );

    --bbva-form-field--_ambient--label-color: var(
      --bbva-form-field--custom--primary-alt-ambient--label-color,
      ${Re("colorPrimaryAltFormInputPlaceholderDefault",Oe)}
    );

    --bbva-form-field--_ambient--focused-label-color: var(
      --bbva-form-field--custom--primary-alt-ambient--focused-label-color,
      ${Re("colorPrimaryAltFormInputPlaceholderDefault",Oe)}
    );

    --bbva-form-field--_ambient--readonly-label-color: var(
      --bbva-form-field--custom--primary-alt-ambient--readonly-label-color,
      ${Re("colorPrimaryAltFormInputPlaceholderDefault",Oe)}
    );

    --bbva-form-field--_ambient--border-color: var(
      --bbva-form-field--custom--primary-alt-ambient--border-color,
      ${Re("colorPrimaryAltFormInputBorderInactive",Oe)}
    );

    --bbva-form-field--_ambient--focused-border-color: var(
      --bbva-form-field--custom--primary-alt-ambient--focused-border-color,
      ${Re("colorPrimaryAltFormInputBorderActive",Oe)}
    );

    --bbva-form-field--_ambient--invalid-field-bg-color: var(
      --bbva-form-field--custom--primary-alt-ambient--invalid-field-bg-color,
      ${Re("colorPrimaryAltFormInputBackgroundError",Oe)}
    );

    --bbva-form-field--_ambient--invalid-field-border-color: var(
      --bbva-form-field--custom--primary-alt-ambient--invalid-field-border-color,
      ${Re("colorPrimaryAltFormInputBorderError",Oe)}
    );

    --bbva-form-field--_ambient--invalid-field-label-color: var(
      --bbva-form-field--custom--primary-alt-ambient--invalid-field-label-color,
      ${Re("colorPrimaryAltFormInputPlaceholderError",Oe)}
    );

    --bbva-form-field--_ambient--action-icon-color: var(
      --bbva-form-field--custom--primary-alt-ambient--action-icon-color,
      ${Re("colorPrimaryAltFormInputIconDefault",Oe)}
    );

    --bbva-form-field--_ambient--invalid-action-icon-color: var(
      --bbva-form-field--custom--primary-alt-ambient--invalid-action-icon-color,
      ${Re("colorPrimaryAltFormInputPlaceholderError",Oe)}
    );

    --bbva-form-field--_ambient--invalid-error-icon-color: var(
      --bbva-form-field--custom--primary-alt-ambient--invalid-error-icon-color,
        ${Re("colorPrimaryAltFormInputIconError",Oe)}
    );
  }
`,_i=t`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-form-field--_ambient--bg-color: var(
      --bbva-form-field--custom--secondary-ambient--bg-color,
      ${Re("colorSecondaryFormInputBackgroundDefault",Oe)}
    );

    --bbva-form-field--_ambient--input-color: var(
      --bbva-form-field--custom--secondary-ambient--input-color,
      ${Re("colorSecondaryFormInputFieldTextDefault",Oe)}
    );

    --bbva-form-field--_ambient--invalid-field-color: var(
      --bbva-form-field--custom--primary-alt-ambient--invalid-field-color,
      ${Re("colorSecondaryFormInputFieldTextError",Oe)}
    );

    --bbva-form-field--_ambient--input-placeholder-color: var(
      --bbva-form-field--custom--secondary-ambient--input-placeholder-color,
      ${Re("colorSecondaryFormInputPlaceholderDefault",Oe)}
    );

    --bbva-form-field--_ambient--readonly-input-color: var(
      --bbva-form-field--custom--secondary-ambient--readonly-input-color,
      ${Re("colorSecondaryFormInputPlaceholderDefault",Oe)}
    );

    --bbva-form-field--_ambient--label-color: var(
      --bbva-form-field--custom--secondary-ambient--label-color,
      ${Re("colorSecondaryFormInputPlaceholderDefault",Oe)}
    );

    --bbva-form-field--_ambient--focused-label-color: var(
      --bbva-form-field--custom--secondary-ambient--focused-label-color,
      ${Re("colorSecondaryFormInputPlaceholderDefault",Oe)}
    );

    --bbva-form-field--_ambient--readonly-icon-color: var(
      --bbva-form-field--custom--secondary-ambient--readonly-icon-color,
      ${Re("colorSecondaryFormInputIconReadOnly",Oe)}
    );

    --bbva-form-field--_ambient--readonly-label-color: var(
      --bbva-form-field--custom--secondary-ambient--readonly-label-color,
      ${Re("colorSecondaryFormInputPlaceholderDefault",Oe)}
    );

    --bbva-form-field--_ambient--border-color: var(
      --bbva-form-field--custom--secondary-ambient--border-color,
      ${Re("colorSecondaryFormInputBorderInactive",Oe)}
    );

    --bbva-form-field--_ambient--focused-border-color: var(
      --bbva-form-field--custom--secondary-ambient--focused-border-color,
      ${Re("colorSecondaryFormInputBorderActive",Oe)}
    );

    --bbva-form-field--_ambient--invalid-field-bg-color: var(
      --bbva-form-field--custom--secondary-ambient--invalid-field-bg-color,
      ${Re("colorSecondaryFormInputBackgroundError",Oe)}
    );

    --bbva-form-field--_ambient--invalid-field-border-color: var(
      --bbva-form-field--custom--secondary-ambient--invalid-field-border-color,
      ${Re("colorSecondaryFormInputBorderError",Oe)}
    );

    --bbva-form-field--_ambient--invalid-field-label-color: var(
      --bbva-form-field--custom--secondary-ambient--invalid-field-label-color,
      ${Re("colorSecondaryFormInputPlaceholderError",Oe)}
    );

    --bbva-form-field--_ambient--action-icon-color: var(
      --bbva-form-field--custom--secondary-ambient--action-icon-color,
      ${Re("colorSecondaryFormInputIconDefault",Oe)}
    );

    --bbva-form-field--_ambient--no-action-icon-color: var(
      --bbva-form-field--custom--secondary-ambient--no-action-icon-color,
      ${Re("colorSecondaryFormInputIconReadOnly",Oe)}
    );

    --bbva-form-field--_ambient--invalid-action-icon-color: var(
      --bbva-form-field--custom--secondary-ambient--invalid-action-icon-color,
      ${Re("colorSecondaryFormInputPlaceholderError",Oe)}
    );

    --bbva-form-field--_ambient--invalid-error-icon-color: var(
      --bbva-form-field--custom--secondary-ambient--invalid-error-icon-color,
        ${Re("colorSecondaryFormInputIconError",Oe)}
    );
  }
`,$i=t`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-form-field--_ambient--bg-color: var(
      --bbva-form-field--custom--secondary-alt-ambient--bg-color,
      ${Re("colorSecondaryAltFormInputBackgroundDefault",Oe)}
    );

    --bbva-form-field--_ambient--input-color: var(
      --bbva-form-field--custom--secondary-alt-ambient--input-color,
      ${Re("colorSecondaryAltFormInputFieldTextDefault",Oe)}
    );

    --bbva-form-field--_ambient--invalid-field-color: var(
      --bbva-form-field--custom--secondary-alt-ambient--invalid-field-color,
      ${Re("colorSecondaryAltFormInputFieldTextError",Oe)}
    );

    --bbva-form-field--_ambient--input-placeholder-color: var(
      --bbva-form-field--custom--secondary-alt-ambient--input-placeholder-color,
      ${Re("colorSecondaryAltFormInputPlaceholderDefault",Oe)}
    );

    --bbva-form-field--_ambient--readonly-input-color: var(
      --bbva-form-field--custom--secondary-ambient--readonly-input-color,
      ${Re("colorSecondaryFormInputPlaceholderDefault",Oe)}
    );

    --bbva-form-field--_ambient--readonly-icon-color: var(
      --bbva-form-field--custom--secondary-alt-ambient--readonly-icon-color,
      ${Re("colorSecondaryAltFormInputIconReadOnly",Oe)}
    );

    --bbva-form-field--_ambient--label-color: var(
      --bbva-form-field--custom--secondary-alt-ambient--label-color,
      ${Re("colorSecondaryAltFormInputPlaceholderDefault",Oe)}
    );

    --bbva-form-field--_ambient--focused-label-color: var(
      --bbva-form-field--custom--secondary-alt-ambient--focused-label-color,
      ${Re("colorSecondaryAltFormInputPlaceholderDefault",Oe)}
    );

    --bbva-form-field--_ambient--readonly-label-color: var(
      --bbva-form-field--custom--secondary-alt-ambient--readonly-label-color,
      ${Re("colorSecondaryAltFormInputPlaceholderDefault",Oe)}
    );

    --bbva-form-field--_ambient--border-color: var(
      --bbva-form-field--custom--secondary-alt-ambient--border-color,
      ${Re("colorSecondaryAltFormInputBorderInactive",Oe)}
    );

    --bbva-form-field--_ambient--focused-border-color: var(
      --bbva-form-field--custom--secondary-alt-ambient--focused-border-color,
      ${Re("colorSecondaryAltFormInputBorderActive",Oe)}
    );

    --bbva-form-field--_ambient--invalid-field-bg-color: var(
      --bbva-form-field--custom--secondary-alt-ambient--invalid-field-bg-color,
      ${Re("colorSecondaryAltFormInputBackgroundError",Oe)}
    );

    --bbva-form-field--_ambient--invalid-field-border-color: var(
      --bbva-form-field--custom--secondary-alt-ambient--invalid-field-border-color,
      ${Re("colorSecondaryAltFormInputBorderError",Oe)}
    );

    --bbva-form-field--_ambient--invalid-field-label-color: var(
      --bbva-form-field--custom--secondary-alt-ambient--invalid-field-label-color,
      ${Re("colorSecondaryAltFormInputPlaceholderError",Oe)}
    );

    --bbva-form-field--_ambient--action-icon-color: var(
      --bbva-form-field--custom--secondary-alt-ambient--action-icon-color,
      ${Re("colorSecondaryAltFormInputIconDefault",Oe)}
    );

    --bbva-form-field--_ambient--no-action-icon-color: var(
      --bbva-form-field--custom--secondary-alt-ambient--no-action-icon-color,
      ${Re("colorSecondaryAltFormInputIconReadOnly",Oe)}
    );

    --bbva-form-field--_ambient--invalid-action-icon-color: var(
      --bbva-form-field--custom--secondary-alt-ambient--invalid-action-icon-color,
      ${Re("colorSecondaryAltFormInputPlaceholderError",Oe)}
    );

    --bbva-form-field--_ambient--invalid-error-icon-color: var(
      --bbva-form-field--custom--secondary-alt-ambient--invalid-error-icon-color,
        ${Re("colorSecondaryAltFormInputIconError",Oe)}
    );
  }
`,wi={primary:t`
    ${yi}
    ${He.primary}
    ${Le.primary}
    ${Ve.primary}
    ${je.primary}
    ${pi.primary}
  `,primaryAlt:t`
    ${fi}
    ${He.primaryAlt}
    ${Le.primaryAlt}
    ${Ve.primaryAlt}
    ${je.primaryAlt}
    ${pi.primaryAlt}
  `,secondary:t`
    ${_i}
    ${He.secondary}
    ${Le.secondary}
    ${Ve.secondary}
    ${je.secondary}
    ${pi.secondary}
  `,secondaryAlt:t`
    ${$i}
    ${He.secondaryAlt}
    ${Le.secondaryAlt}
    ${Ve.secondaryAlt}
    ${je.secondaryAlt}
    ${pi.secondaryAlt}
  `},Si=Object.values(wi);class xi extends(qe(l(v))){static get is(){return"bbva-form-field"}static get scopedElements(){return{"bbva-type-text":ze,"bbva-type-link":Ge,"bbva-notification-help":Ue,"bbva-type-icon":Ne,"bbva-button-default":bi}}static get properties(){return{actionType:{type:String,reflect:!0,attribute:"action-type"},actionIcon:{type:String,attribute:"action-icon"},actionIconSize:{type:Number,attribute:"action-icon-size"},actionIconSecondary:{type:String,attribute:"action-icon-secondary"},actionIconSecondarySize:{type:Number,attribute:"action-icon-secondary-size"},helpIconSize:{type:Number,attribute:"help-icon-size"},actionAccessibleText:{type:String,attribute:"action-accessible-text"},actionSecondaryAccessibleText:{type:String,attribute:"action-secondary-accessible-text"},actionVariant:{type:String,reflect:!0,attribute:"action-variant"},actionIntoForm:{type:Boolean,reflect:!0,attribute:"action-into-form"},validateOnBlur:{type:Boolean,attribute:"validate-on-blur"},clearIcon:{type:String,attribute:"clear-icon"},clearIconSize:{type:Number,attribute:"clear-icon-size"},clearAccessibleText:{type:String,attribute:"clear-accessible-text"},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},helpIcon:{type:String,attribute:"help-icon"},linkHref:{type:String,attribute:"link-href"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},infoMessage:{type:String,attribute:"info-message"},labelOut:{type:String,attribute:"label-out"},optionalLabel:{type:String,attribute:"optional-label"},iconVariant:{type:String,attribute:"icon-variant"},hideBottomPaddingInfoMessage:{type:Boolean,attribute:"hide-bottom-padding-info-message"}}}constructor(){super(),this.actionIconSize=24,this.actionIconSecondarySize=24,this.helpIconSize=16,this.actionAccessibleText="bbva-form-input-field-submit",this.actionIntoForm=!1,this.clearIcon=g(),this.clearIconSize=24,this.clearAccessibleText="bbva-form-input-field-clear",this.optionalLabel="bbva-form-input-field-optional-label",this.errorIcon=y(),this.errorIconSize=16,this.errorMessage="",this.infoIcon=f(),this.infoIconSize=16,this.infoMessage="",this._secondary=!1,this.hideBottomPaddingInfoMessage=!1}firstUpdated(t){super.firstUpdated(t),this._rootNode=this.getRootNode?this.getRootNode():document,this._field=this.shadowRoot.querySelector(".field");const e=document.createElement("style");this._action=this.actionIntoForm?this.shadowRoot.querySelector(".action"):"",e.style.display="none",e.innerHTML=this.inputInnerStyles,this.appendChild(e)}updated(t){super.updated(t),t.has("value")&&(this.autoValidate||void 0===t.get("value")||(this.invalid=!!this.required&&this._isEmpty),this._isEmpty?this.removeAttribute("filled"):this.setAttribute("filled",""))}get _errorVisible(){return this.errorMessage&&this.invalid}get accessibleDescription(){const t=this.invalid?this.errorMessage:"";return t&&this.infoMessage?`${t}. ${this.infoMessage}`:t||this.infoMessage}get _isEmpty(){return""===this.value||void 0===this.value||null===this.value}get inputLabel(){return this.labelOut&&!this.label&&(this.label=this.labelOut),this.labelOut||this.required?`${this.t(this.label)}`:`${this.t(this.label)} ${this.t(this.optionalLabel)}`}get _helpIcon(){return this.helpIcon?p`
          <bbva-type-link
            @click="${this._helpClicked}"
            .icon="${this.helpIcon}"
            .iconSize="${this.helpIconSize}"
            href="${_(this.linkHref)}"
            aria-label="${this.t("bbva-form-input-field-help-text")}"
          >
          </bbva-type-link>
        `:""}get _labelOut(){return this.labelOut?p`
        <div class="label-out">
          <bbva-type-text
            id="labelOutText"
            unset
            tag="legend"
            text=${this.required?`${this.t(this.labelOut)}`:`${this.t(this.labelOut)} ${this.t(this.optionalLabel)}`}
            size="S"
            font-weight="500"
          >
          </bbva-type-text>
          ${this._helpIcon}
        </div>
      `:""}static get styles(){return[super.styles,vi,gi,Si,o("bbva-form-input-field-shared-styles")]}get inputInnerStyles(){return`\n      input#${this._formElementId}::-webkit-inner-spin-button,\n      input#${this._formElementId}::-webkit-outer-spin-button {\n        -webkit-appearance: none;\n        margin: 0;\n      }\n      input#${this._formElementId}::-webkit-clear-button,\n      input#${this._formElementId}::-webkit-search-decoration,\n      input#${this._formElementId}::-webkit-search-cancel-button,\n      input#${this._formElementId}::-webkit-search-results-button,\n      input#${this._formElementId}::-webkit-search-results-decoration {\n        appearance: none;\n        display: none;\n      }\n    `}get field(){return p`
      <div class="field" @focusin="${this._onFocusin}" @focusout="${this._onFocusout}">
        ${this.labelledInput} ${this.clearButton}
      </div>
    `}get fieldAction(){return p`
      <div
        class="wrapper"
        @keydown="${t=>13===t.keyCode&&!this.readonly&&!this.actionIconSecondary&&this.submitInput()}"
      >
        ${this.field} ${!this.iconVariant&&this.actionType?this.actionButton:this.rightIcon}
      </div>
    `}get clearButton(){return p`
      <bbva-button-default
        tabindex="0"
        class="clear"
        .icon="${this.clearIcon}"
        .size="${this.clearIconSize}"
        @click="${this.clearInput}"
        variant="icon no-background"
        aria-label="${this.t(this.clearAccessibleText)}"
      >
      </bbva-button-default>
    `}get isSecondary(){return this.actionIconSecondary&&this._secondary}get actionButton(){return p` <bbva-button-default
      class="action"
      type="${this.actionType}"
      ?disabled="${this.disabled||this.disabledButton||this.readonly}"
      .icon="${this.isSecondary?this.actionIconSecondary:this.actionIcon}"
      .size="${this.isSecondary?this.actionIconSecondarySize:this.actionIconSize}"
      @click="${this.isSecondary?this.switchIcon:this._actionEvent}"
      aria-label="${this.isSecondary?this.t(this.actionSecondaryAccessibleText):this.t(this.actionAccessibleText)}"
      variant="icon${this.actionVariant?` ${this.actionVariant}`:""}"
    >
    </bbva-button-default>`}get rightIcon(){return this.actionIcon?p`
          <div class="wrapper-action">
            <bbva-type-icon
              .icon="${this.actionIcon}"
              .size="${this.actionIconSize}"
            ></bbva-type-icon>
          </div>
        `:""}get _actionEvent(){return this.actionIconSecondary?this.switchIcon:this.submitInput}switchIcon(){this._secondary=!this._secondary,this.requestUpdate(),this.dispatchEvent(new CustomEvent("form-field-button-switch",{detail:this._secondary,bubbles:!0,composed:!0}))}get messageError(){return this._errorVisible?p`
          <div class="message error" role="alert">
            <bbva-notification-help
              variant="alert"
              class="message-error notification"
              accessibility-label-icon="${this.t("bbva-form-input-field-accessibility-alert-icon")}"
              icon="${this.errorIcon}"
              .size="${this.errorIconSize}"
              text=${this.t(this.errorMessage)}
              disabled-tabindex
            ></bbva-notification-help>
          </div>
        `:""}get messageInfo(){return this.infoMessage?p`
          <bbva-notification-help
            class="notification"
            ?hide-bottom-padding=${this.hideBottomPaddingInfoMessage}
            accessibility-label-icon="${this.t("bbva-form-input-field-accessibility-info-icon")}"
            .icon="${this.infoIcon}"
            text=${this.t(this.infoMessage)}
            disabled-tabindex
          ></bbva-notification-help>
        `:""}get labelBlock(){return p`
      <bbva-type-text
        unset
        size="2XS"
        tag="label"
        for="${this._formElementId}"
        text="${this.inputLabel}"
        class="label"
        aria-hidden="true"
        @click="${this.focus}"
      ></bbva-type-text>
    `}_onFocusin(){this.readonly||setTimeout((()=>{this._focus()}),1)}_onFocusout(){this.readonly||setTimeout((()=>{const t=this._rootNode.activeElement,e=this.shadowRoot.activeElement||t;this._field.contains(e)||t===this._formElement||(this._blur(),this.validateOnBlur&&this.validate())}),1)}_focus(){this.setAttribute("focused",""),this.dispatchEvent(new CustomEvent("form-field-input-focus",{detail:!0,bubbles:!0,composed:!0}))}_blur(){this.removeAttribute("focused"),this.dispatchEvent(new CustomEvent("form-field-input-blur",{detail:!0,bubbles:!0,composed:!0}))}clearInput(){this._formElement.value="",this._formElement.dispatchEvent(new CustomEvent("input",{detail:!0,bubbles:!0,composed:!0})),this.dispatchEvent(new CustomEvent("form-field-input-clear",{detail:!0,bubbles:!0,composed:!0})),this.focus()}_helpClicked(){this.dispatchEvent(new CustomEvent("form-field-help-click",{detail:!0,bubbles:!0,composed:!0}))}submitInput(){this.dispatchEvent(new CustomEvent("form-field-button-submit",{detail:this.value,bubbles:!0,composed:!0}))}render(){return p`
      ${this._labelOut} ${this.actionIntoForm?this.fieldAction:this.field} ${this.messageError}
      ${this.messageInfo}
    `}}var Ci=t`
@charset "UTF-8";
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

.slot-input ::slotted(input) {
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 15) * 1em);
}

.back {
  position: absolute;
  display: flex;
  align-items: center;
  width: 100%;
  height: 100%;
  top: 0;
  left: 0;
  padding: calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 15) * 1em) calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 15) * 1em);
  font-family: inherit;
  font-size: var(--bbva-form-field-input-font-size, var(--typographyTypeSmall, ${i(a.typeSmall)}));
}
:host([focused]) .back, :host([filled]) .back {
  padding: calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 15) * 1em) calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 15) * 1em);
}
.back-amount {
  flex: auto;
  opacity: 0;
}
:host([focused]) .back-amount, :host([filled]) .back-amount {
  flex: none;
  max-width: calc(100% - 3rem);
}
.back-currency {
  order: 1;
  color: var(--_form-amount-currency-color);
}
:host([readonly]) .back-currency {
  color: var(--_form-amount-readonly-currency-color);
}
.back-currency::before {
  content: " ";
}
:host([focused]) .back-currency, :host([filled]) .back-currency {
  order: -1;
}
:host([focused]) .back-currency::before, :host([filled]) .back-currency::before {
  content: "";
}
:host([focused]) .back-currency.right, :host([filled]) .back-currency.right {
  order: 1;
}
:host([focused]) .back-currency.hide-currency, :host([filled]) .back-currency.hide-currency {
  opacity: 0;
}
:host([focused]) .back-currency:not(.right)::after, :host([focused]) .back-currency.right::before, :host([filled]) .back-currency:not(.right)::after, :host([filled]) .back-currency.right::before {
  content: " ";
}

:host([flag]) .back {
  padding-left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1em);
}

:host([show-card]) .back {
  padding-left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1em);
}

:host([focused][flag]) .back {
  padding-left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1em);
}

:host([focused][show-card]) .back {
  padding-left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1em);
}

:host([invalid]) .back-currency,
:host([focused][invalid]) .back-currency {
  color: var(--_form-amount-currency-invalid-color);
}

:host([invalid][auto-validate]) .back-currency {
  color: var(--_form-amount-currency-invalid-auto-validate-color);
}

.with-clip .slot-input ::slotted(input) {
  padding-left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1em);
}
.with-clip .label {
  left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1em);
}

.clip {
  display: inline-flex;
  align-items: center;
  position: absolute;
  height: 100%;
  margin: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem);
}

.lines {
  font-weight: 600;
}
`,Pi=t`
:host {
  --_form-amount-currency-color:
      var(--bbva-form-amount--_ambient--currency-color,
          var(--bbva-form-amount--custom--primary-ambient--currency-color,
              ${Re("colorPrimaryFormInputPlaceholderDefault",Oe)}));
  --_form-amount-readonly-currency-color:
          var(--bbva-form-amount--_ambient--readonly-currency-color,
              var(--bbva-form-amount--custom--primary-ambient--readonly-currency-color,
                  ${Re("colorPrimaryFormInputPlaceholderDefault",Oe)}));
  --_form-amount-currency-invalid-color:
          var(--bbva-form-amount--_ambient--currency-invalid-color,
              var(--bbva-form-amount--custom--primary-ambient--currency-invalid-color,
                  ${Re("colorPrimaryFormInputPlaceholderError",Oe)}));
  --_form-amount-currency-invalid-auto-validate-color:
          var(--bbva-form-amount--_ambient--currency-invalid-auto-validate-color,
              var(--bbva-form-amount--custom--primary-ambient--currency-invalid-auto-validate-color,
                  ${Re("colorPrimaryFormInputFieldTextError",Oe)}));
}
`;const ki=t`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-form-amount--_ambient--currency-color: initial;
    --bbva-form-amount--_ambient--readonly-currency-color: initial;
    --bbva-form-amount--_ambient--currency-invalid-color: initial;
    --bbva-form-amount--_ambient--currency-invalid-auto-validate-color: initial;
  }
`,Ti=t`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-form-amount--_ambient--currency-color: var(
      --bbva-form-amount--custom--primary-alt-ambient--currency-color,
      ${Re("colorPrimaryAltFormInputPlaceholderDefault",Oe)}
    );

    --bbva-form-amount--_ambient--readonly-currency-color: var(
      --bbva-form-amount--custom--primary-alt-ambient--readonly-currency-color,
      ${Re("colorPrimaryAltFormInputPlaceholderDefault",Oe)}
    );

    --bbva-form-amount--_ambient--currency-invalid-color: var(
      --bbva-form-amount--custom--primary-alt-ambient--currency-invalid-color,
      ${Re("colorPrimaryAltFormInputPlaceholderError",Oe)}
    );

    --bbva-form-amount--_ambient--currency-invalid-auto-validate-color: var(
      --bbva-form-amount--custom--primary-alt-ambient--currency-invalid-auto-validate-color,
      ${Re("colorPrimaryAltFormInputFieldTextError",Oe)}
    );
  }
`,Ei=t`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-form-amount--_ambient--currency-color: var(
      --bbva-form-amount--custom--secondary-ambient--currency-color,
      ${Re("colorSecondaryFormInputPlaceholderDefault",Oe)}
    );

    --bbva-form-amount--_ambient--readonly-currency-color: var(
      --bbva-form-amount--custom--secondary-ambient--readonly-currency-color,
      ${Re("colorSecondaryFormInputPlaceholderDefault",Oe)}
    );

    --bbva-form-amount--_ambient--currency-invalid-color: var(
      --bbva-form-amount--custom--secondary-ambient--currency-invalid-color,
      ${Re("colorSecondaryFormInputPlaceholderError",Oe)}
    );

    --bbva-form-amount--_ambient--currency-invalid-auto-validate-color: var(
      --bbva-form-amount--custom--secondary-ambient--currency-invalid-auto-validate-color,
      ${Re("colorSecondaryFormInputFieldTextError",Oe)}
    );
  }
`,Ii=t`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-form-amount--_ambient--currency-color: var(
      --bbva-form-amount--custom--secondary-alt-ambient--currency-color,
      ${Re("colorSecondaryAltFormInputPlaceholderDefault",Oe)}
    );

    --bbva-form-amount--_ambient--readonly-currency-color: var(
      --bbva-form-amount--custom--secondary-alt-ambient--readonly-currency-color,
      ${Re("colorSecondaryAltFormInputPlaceholderDefault",Oe)}
    );

    --bbva-form-amount--_ambient--currency-invalid-color: var(
      --bbva-form-amount--custom--secondary-alt-ambient--currency-invalid-color,
      ${Re("colorSecondaryAltFormInputPlaceholderError",Oe)}
    );

    --bbva-form-amount--_ambient--currency-invalid-auto-validate-color: var(
      --bbva-form-amount--custom--secondary-alt-ambient--currency-invalid-auto-validate-color,
      ${Re("colorSecondaryAltFormInputFieldTextError",Oe)}
    );
  }
`,Ai={primary:t`
    ${ki}
    ${wi.primary}
    ${Wo.primary}
  `,primaryAlt:t`
    ${Ti}
    ${wi.primaryAlt}
    ${Wo.primaryAlt}
  `,secondary:t`
    ${Ei}
    ${wi.secondary}
    ${Wo.secondary}
  `,secondaryAlt:t`
    ${Ii}
    ${wi.secondaryAlt}
    ${Wo.secondaryAlt}
  `},Di=Object.values(Ai);$(),w(),S();const Mi={apple:{logo:"applepay",text:"bbva-clip-card-pay-compatibility-apple"},google:{logo:"googlepay",text:"bbva-clip-card-pay-compatibility-google"}};class Fi extends(x(C(qe(l(xi))))){static get is(){return"bbva-form-amount"}static get scopedElements(){return{"bbva-type-text":ze,"bbva-type-link":Ge,"bbva-notification-help":Ue,"bbva-type-icon":Ne,"bbva-button-default":bi,"bbva-clip-flag":Uo,"bbva-clip-card":Yo}}static get properties(){return{flag:{type:String,reflect:!0},showCard:{type:Boolean,attribute:"show-card"},flagLabel:{type:String,attribute:"flag-label"},cardStatus:{type:String,attribute:"card-status",reflect:!0},payCompatibility:{type:String,attribute:"pay-compatibility"},cardVariant:{type:String,attribute:"card-variant"},cardType:{type:String,attribute:"card-type"},cardImage:{type:String,attribute:"card-image"},accessibilityText:{type:String,attribute:"accessibility-text"},partnerLogo:{type:String,attribute:"partner-logo"},partnerLogoVariant:{type:String,attribute:"partner-logo-variant"},partner:{type:Boolean}}}constructor(){super(),this.cardType="",this.cardVariant="",this.showCard=!1,this.cardStatus="",this.partner=!1,this.cardImage="",this.payCompatibility="",this.payCompatibilityInfo=Mi,this.accessibilityText="bbva-form-input-amount-clip-card-image"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._checkTrailingDecimal=this._checkTrailingDecimal.bind(this),this.addEventListener("blur",this._checkTrailingDecimal),this.addEventListener("focusout",this._checkTrailingDecimal)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("blur",this._checkTrailingDecimal),this.removeEventListener("focusout",this._checkTrailingDecimal)}firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),this._currencyBlock=this.shadowRoot.querySelector(".back-currency")}updated(t){super.updated&&super.updated(t),t.has("language")&&(this.allowedPattern=`[0-9${this._separator}${this._groupChar}]`),t.has("value")&&this.formatValue(this.value),t.has("amount")&&Number.isFinite(this.amount)&&(this.value=String(this.amount).replace(/\./g,this._separator)),(t.has("localCurrency")||t.has("currencyCode"))&&this._setCurrencyWidth()}static get styles(){return[super.styles,Ci,Pi,Di,o("bbva-form-amount-shared-styles")]}get flagBlock(){return p`
      ${this.flag?p`
            <span class="clip">
              <bbva-clip-flag icon="${_(this.flag)}" size="small"></bbva-clip-flag>
            </span>
          `:""}
    `}get cardBlock(){return p`
      ${this.showCard?p`
            <span class="clip">
              <bbva-clip-card
                size="s"
                status="${this.cardStatus}"
                card-type="${this.cardType}"
                variant="${this.cardVariant}"
                pay-compatibility="${this.payCompatibility}"
                card-image="${this.cardImage}"
                accessibilityText="${this.t(this.accessibilityText)}"
                ?partner="${this.partner}"
                partner-logo="${_(this.partnerLogo)}"
                partner-logo-variant="${_(this.partnerLogoVariant)}"
                disabled-tabindex
              ></bbva-clip-card>
            </span>
          `:""}
    `}get _isRightAligned(){return this._alignRight}get inputLabel(){return`${this.label}`}get field(){return p`
      <div
        class="field ${this.flag||this.showCard?"with-clip":""}"
        @focusin="${this._onFocusin}"
        @focusout="${this._onFocusout}"
      >
        ${this.flagBlock} ${this.cardBlock}${this.backAmount} ${this.labelledInput}
        ${this.clearButton}
      </div>
    `}get backAmount(){return p`
      <span class="back" aria-hidden="true">
        <span class="back-currency ${this._isRightAligned?"right":""}">${this._currency}</span>
        <span class="back-amount">${this.value}</span>
      </span>
    `}_setCurrencyWidth(){const e=this._isRightAligned?0:this._currencyBlock.offsetWidth,o=t`
      ${e/16}rem
    `;this._formElement.style.setProperty("margin-left",o)}_formatNumber(t,e){return e?t.replace(/\D/g,"").replace(/\B(?=(\d{3})+(?!\d))/g,this._groupChar):t.replace(/\D/g,"")}_formatCurrency(t,e){let o;if(t.indexOf(e)>=0){const i=t.indexOf(e);let a=t.substring(0,i),r=t.substring(i);a=this._formatNumber(a,!0),r=this._formatNumber(r,!1),r=r.substring(0,this.decimalDigits),o=this.decimalDigits?a+e+r:a}else o=this._formatNumber(t,!0);return o}formatValue(t){if(""===t||null==t)return void this._fireChange(t,this.amount);this.amount=t?Number(t.replace(new RegExp(`\\${this._groupChar}`,"g"),"").replace(new RegExp(`\\${this._separator}`),".")):0;const e=String(t),o=this._formElement,i=e.length;let a=o.selectionStart;const r=this._formatCurrency(e,this._separator);o.value=r,e===r&&this._fireChange(r,this.amount),this.value=o.value;a=r.length-i+a,o.setSelectionRange(a,a)}_checkTrailingDecimal(){this.value&&this.value.endsWith(this._separator)&&(this.value=this.value.replace(this._separator,""))}_fireChange(t,e){this.dispatchEvent(new CustomEvent("form-amount-input-change",{detail:{value:t,amount:e},bubbles:!0,composed:!0}))}}var Bi=t`
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
`;const Ri={primary:t`
    ${wi.primary}
  `,primaryAlt:t`
    ${wi.primaryAlt}
  `,secondary:t`
    ${wi.secondary}
  `,secondaryAlt:t`
    ${wi.secondaryAlt}
  `},Oi=Object.values(Ri);class Li extends(qe(xi)){static get is(){return"bbva-form-attach"}static get properties(){return{inputType:{type:String,attribute:"input-type"}}}constructor(){super(),this.actionIcon="",this.actionIntoForm=!0,this.actionType="submit",this.actionVariant="no-background",this.inputType=""}static get styles(){return[super.styles,Bi,Oi,o("bbva-form-attach-shared-styles")]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.actionIcon=this._icons}get _icons(){const t={camera:P(),contact:k()};return this.inputType in t&&t[this.inputType]}}var Vi=t`
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

.with-flag .slot-input ::slotted(input) {
  padding-left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem);
}
.with-flag .label {
  left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem);
}

.flag {
  display: inline-flex;
  align-items: center;
  position: absolute;
  height: 100%;
  margin: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem);
}
`;const qi={primary:t`
    ${wi.primary}
  `,primaryAlt:t`
    ${wi.primaryAlt}
  `,secondary:t`
    ${wi.secondary}
  `,secondaryAlt:t`
    ${wi.secondaryAlt}
  `},Ni=Object.values(qi);class zi extends(qe(xi)){static get is(){return"bbva-form-text"}static get scopedElements(){return{"bbva-clip-flag":Uo,"bbva-type-icon":Ne,"bbva-type-text":ze,"bbva-type-link":Ge,"bbva-notification-help":Ue,"bbva-button-default":bi}}static get properties(){return{flag:{type:String},flagLabel:{type:String,attribute:"flag-label"}}}constructor(){super(),this.type="text"}static get styles(){return[super.styles,Vi,Ni,o("bbva-form-text-shared-styles")]}get field(){return p`
      <div
        class="field ${this.flag?"with-flag":""}"
        @focusin="${this._onFocusin}"
        @focusout="${this._onFocusout}"
      >
        ${this.flagBlock} ${this.labelledInput} ${this.clearButton}
      </div>
    `}get flagBlock(){return p`
      ${this.flag?p`
            <span class="flag">
              <bbva-clip-flag icon="${_(this.flag)}" size="small"></bbva-clip-flag>
            </span>
          `:""}
    `}get ariaInputLabel(){return`${this.label}${this.flagLabel?` - ${this.flagLabel}`:""}`}}var Hi=t`
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

.slot-input ::slotted(input) {
  padding-right: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 15) * 1em);
}
:host([focused]) .slot-input ::slotted(input), :host([invalid][filled]) .slot-input ::slotted(input) {
  max-width: 100%;
}
:host(:not([filled])) .slot-input ::slotted(input) {
  opacity: 0;
}
:host([readonly][filled]) .slot-input ::slotted(input), :host([invalid][filled]) .slot-input ::slotted(input), :host([focused]) .slot-input ::slotted(input) {
  opacity: 1;
}

.clear {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 3rem;
  height: 3rem;
}
.clear [data-tag-name=bbva-type-icon] {
  fill: var(--_form-date-clear-icon-color);
}

:host([invalid]) .clear [data-tag-name=bbva-type-icon] {
  fill: var(--_form-date-invalid-clear-icon-color);
}

:host([readonly]) .clear [data-tag-name=bbva-type-icon] {
  color: var(--_form-date-readonly-clear-icon-color);
}
`,ji=t`
:host {
  --_form-date-clear-icon-color:
      var(--bbva-form-date--_ambient--clear-icon-color,
          var(--bbva-form-date--custom--primary-ambient--clear-icon-color,
          ${Re("colorPrimaryFormInputIconReadOnly",Oe)}));
  --_form-date-readonly-clear-icon-color:
      var(--bbva-form-date--_ambient--readonly-clear-icon-color,
          var(--bbva-form-date--custom--primary-ambient--readonly-clear-icon-color,
              ${Re("colorPrimaryFormInputIconReadOnly",Oe)}));
  --_form-date-invalid-clear-icon-color:
      var(--bbva-form-date--_ambient--invalid-clear-icon-color,
          var(--bbva-form-date--custom--primary-ambient--invalid-clear-icon-color,
              ${Re("colorPrimaryFormInputIconError",Oe)}));
}
`;const Gi=t`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-form-date--_ambient--clear-icon-color: initial;
    --bbva-form-date--_ambient--readonly-clear-icon-color: initial;
    --bbva-form-date--_ambient--invalid-clear-icon-color: initial;
  }
`,Ui=t`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-form-date--_ambient--clear-icon-color: var(
      --bbva-form-date--custom--primary-alt-ambient--clear-icon-color,
      ${Re("colorPrimaryAltFormInputIconReadOnly",Oe)}
    );

    --bbva-form-date--_ambient--readonly-clear-icon-color: var(
      --bbva-form-date--custom--primary-alt-ambient--readonly-clear-icon-color,
      ${Re("colorPrimaryAltFormInputIconReadOnly",Oe)}
    );

    --bbva-form-date--_ambient--invalid-clear-icon-color: var(
      --bbva-form-date--custom--primary-alt-ambient--invalid-clear-icon-color,
      ${Re("colorPrimaryAltFormInputIconError",Oe)}
    );
  }
`,Wi=t`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-form-date--_ambient--clear-icon-color: var(
      --bbva-form-date--custom--secondary-ambient--clear-icon-color,
      ${Re("colorSecondaryFormInputIconReadOnly",Oe)}
    );

    --bbva-form-date--_ambient--readonly-clear-icon-color: var(
      --bbva-form-date--custom--secondary-ambient--readonly-clear-icon-color,
      ${Re("colorSecondaryFormInputIconReadOnly",Oe)}
    );

    --bbva-form-date--_ambient--invalid-clear-icon-color: var(
      --bbva-form-date--custom--secondary-ambient--invalid-clear-icon-color,
      ${Re("colorSecondaryFormInputIconError",Oe)}
    );
  }
`,Yi=t`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-form-date--_ambient--clear-icon-color: var(
      --bbva-form-date--custom--secondary-alt-ambient--clear-icon-color,
      ${Re("colorSecondaryAltFormInputIconReadOnly",Oe)}
    );

    --bbva-form-date--_ambient--readonly-clear-icon-color: var(
      --bbva-form-date--custom--secondary-alt-ambient--readonly-clear-icon-color,
      ${Re("colorSecondaryAltFormInputIconReadOnly",Oe)}
    );

    --bbva-form-date--_ambient--invalid-clear-icon-color: var(
      --bbva-form-date--custom--secondary-alt-ambient--invalid-clear-icon-color,
      ${Re("colorSecondaryAltFormInputIconError",Oe)}
    );
  }
`,Ki={primary:t`
    ${Gi}
    ${Ve.primary}
    ${wi.primary}
  `,primaryAlt:t`
    ${Ui}
    ${Ve.primaryAlt}
    ${wi.primaryAlt}
  `,secondary:t`
    ${Wi}
    ${Ve.secondary}
    ${wi.secondary}
  `,secondaryAlt:t`
    ${Yi}
    ${Ve.secondaryAlt}
    ${wi.secondaryAlt}
  `},Xi=Object.values(Ki);class Ji extends(qe(xi)){static get is(){return"bbva-form-date"}static get scopedElements(){return{"bbva-type-icon":Ne,"bbva-type-text":ze,"bbva-type-link":Ge,"bbva-notification-help":Ue,"bbva-button-default":bi}}constructor(){super(),this.type="date",this.clearIcon=T()}static get styles(){return[super.styles,Hi,ji,Xi,o("bbva-form-date-shared-styles")]}get valueAsDate(){return this._formElement.valueAsDate}get valueAsNumber(){return this._formElement.valueAsNumber}stepDown(){this._formElement.stepDown(),this.value=this._formElement.value}stepUp(){this._formElement.stepUp(),this.value=this._formElement.value}get field(){return p`
      <div
        class="field"
        @keydown="${this._onFocusin}"
        @click="${this._onFocusin}"
        @focusin="${this._onFocusin}"
        @focusout="${this._onFocusout}"
      >
        ${this.clearIconBlock} ${this.labelledInput}
      </div>
    `}get inputInnerStyles(){return`\n      input#${this._formElementId}::-webkit-inner-spin-button,\n      input#${this._formElementId}::-webkit-outer-spin-button {\n        -webkit-appearance: none;\n        margin: 0;\n      }\n      input#${this._formElementId}::-webkit-clear-button {\n        appearance: none;\n        display: none;\n      }\n      input#${this._formElementId}::-webkit-calendar-picker-indicator {\n        position: absolute;\n        top: 0;\n        left: 0;\n        color: transparent;\n        background: transparent;\n        opacity: 0;\n        width: 100%;\n        height: 100%;\n      }\n    `}get clearIconBlock(){return p`
      <span class="clear">
        <bbva-type-icon .icon="${this.clearIcon}" .size="${this.clearIconSize}"></bbva-type-icon>
      </span>
    `}}var Qi=t`
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

.with-flag .slot-input ::slotted(input) {
  padding-left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem);
}
.with-flag .label {
  left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem);
}

.flag {
  display: inline-flex;
  align-items: center;
  position: absolute;
  height: 100%;
  margin: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem);
}
`;const Zi={primary:t`
    ${wi.primary}
  `,primaryAlt:t`
    ${wi.primaryAlt}
  `,secondary:t`
    ${wi.secondary}
  `,secondaryAlt:t`
    ${wi.secondaryAlt}
  `},ta=Object.values(Zi);class ea extends(qe(xi)){static get is(){return"bbva-form-number"}static get scopedElements(){return{"bbva-clip-flag":Uo,"bbva-type-text":ze,"bbva-type-icon":Ne,"bbva-type-link":Ge,"bbva-notification-help":Ue,"bbva-button-default":bi}}static get properties(){return{flag:{type:String},flagLabel:{type:String,attribute:"flag-label"}}}constructor(){super(),this.type="number"}static get styles(){return[super.styles,Qi,ta,o("bbva-form-number-shared-styles")]}get field(){return p`
      <div
        class="field ${this.flag?"with-flag":""}"
        @focusin="${this._onFocusin}"
        @focusout="${this._onFocusout}"
      >
        ${this.flagBlock} ${this.labelledInput} ${this.clearButton}
      </div>
    `}get flagBlock(){return p`
      ${this.flag?p`
            <span class="flag">
              <bbva-clip-flag icon="${_(this.flag)}" size="small"></bbva-clip-flag>
            </span>
          `:""}
    `}get ariaInputLabel(){return`${this.label}${this.flagLabel?` - ${this.flagLabel}`:""}`}}var oa=t`
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

.wrapper {
  display: flex;
}

.field {
  flex: auto;
}
`;const ia={primary:t`
    ${wi.primary}
    ${pi.primary}
  `,primaryAlt:t`
    ${wi.primaryAlt}
    ${pi.primaryAlt}
  `,secondary:t`
    ${wi.secondary}
    ${pi.secondary}
  `,secondaryAlt:t`
    ${wi.secondaryAlt}
    ${pi.secondaryAlt}
  `},aa=Object.values(ia);class ra extends(qe(l(xi))){static get is(){return"bbva-form-search"}static get scopedElements(){return{"bbva-type-icon":Ne,"bbva-type-text":ze,"bbva-type-link":Ge,"bbva-notification-help":Ue,"bbva-button-default":bi}}static get properties(){return{disabledButton:{type:Boolean,attribute:"disabled-button"},variant:{type:String},iconVariant:{type:String,attribute:"icon-variant"}}}constructor(){super(),this.type="search",this.actionType="submit",this.actionIcon=E(),this.actionAccessibleText="bbva-form-input-search-submit",this.actionIntoForm=!0}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.actionIcon=this._icons}firstUpdated(t){super.firstUpdated(t),this._field=this.shadowRoot.querySelector(".field"),this._action=this.shadowRoot.querySelector(".action")}updated(t){super.updated&&super.updated(t),t.has("variant")&&"trigger"===this.variant&&this._field.addEventListener("click",this.handleInputClick)}static get styles(){return[super.styles,oa,aa,o("bbva-form-search-shared-styles")]}handleInputClick(){this.dispatchEvent(new CustomEvent("form-search-input-click",{detail:!0,bubbles:!0,composed:!0}))}submitInput(){this.value&&this.dispatchEvent(new CustomEvent("form-search-button-submit",{detail:this.value,bubbles:!0,composed:!0}))}get _icons(){const t={access:I(),search:E()};return this.iconVariant in t?t[this.iconVariant]:t.search}}var sa=t`
:host {
  display: block;
  box-sizing: border-box;
}

.clear {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 3rem;
  height: 3rem;
}
.clear [data-tag-name=bbva-type-icon] {
  fill: var(--_form-time-clear-icon-color);
}

:host([invalid]) .clear [data-tag-name=bbva-type-icon] {
  fill: var(--_form-time-invalid-clear-icon-color);
}

:host([readonly]) .clear [data-tag-name=bbva-type-icon] {
  color: var(--_form-time-readonly-clear-color);
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

.slot-input ::slotted(input) {
  padding-right: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 15) * 1em);
}
:host([focused]) .slot-input ::slotted(input), :host([invalid][filled]) .slot-input ::slotted(input) {
  max-width: 100%;
}
:host(:not([filled])) .slot-input ::slotted(input) {
  opacity: 0;
}
:host([readonly][filled]) .slot-input ::slotted(input), :host([invalid][filled]) .slot-input ::slotted(input), :host([focused]) .slot-input ::slotted(input) {
  opacity: 1;
}
`,na=t`
:host {
  --_form-time-clear-icon-color:
      var(--bbva-form-time--_ambient--clear-icon-color,
          var(--bbva-form-time--custom--primary-ambient--clear-icon-color,
              ${Re("colorPrimaryFormInputIconReadOnly",Oe)}));
  --_form-time-invalid-clear-icon-color:
  var(--bbva-form-time--_ambient--invalid-clear-icon-color,
      var(--bbva-form-time--custom--primary-ambient--invalid-clear-icon-color,
          ${Re("colorPrimaryFormInputIconError",Oe)}));
  --_form-time-readonly-clear-color:
      var(--bbva-form-time--_ambient--readonly-clear-color,
          var(--bbva-form-time--custom--primary-ambient--readonly-clear-color,
              ${Re("colorPrimaryFormInputIconReadOnly",Oe)}));
}
`;const la=t`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-form-time--_ambient--clear-icon-color: initial;
    --bbva-form-time--_ambient--invalid-clear-icon-color: initial;
    --bbva-form-time--_ambient--readonly-clear-color: initial;
  }
`,ca=t`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-form-time--_ambient--clear-icon-color: var(
      --bbva-form-time--custom--primary-alt-ambient--clear-icon-color,
      ${Re("colorPrimaryAltFormInputIconReadOnly",Oe)}
    );

    --bbva-form-time--_ambient--invalid-clear-icon-color: var(
      --bbva-form-time--custom--primary-alt-ambient--invalid-clear-icon-color,
      ${Re("colorPrimaryAltFormInputIconError",Oe)}
    );

    --bbva-form-time--_ambient--readonly-clear-color: var(
      --bbva-form-time--custom--primary-alt-ambient--readonly-clear-color,
      ${Re("colorPrimaryAltFormInputIconReadOnly",Oe)}
    );
  }
`,da=t`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-form-time--_ambient--clear-icon-color: var(
      --bbva-form-time--custom--secondary-ambient--clear-icon-color,
      ${Re("colorSecondaryFormInputIconReadOnly",Oe)}
    );

    --bbva-form-time--_ambient--invalid-clear-icon-color: var(
      --bbva-form-time--custom--secondary-ambient--invalid-clear-icon-color,
      ${Re("colorSecondaryFormInputIconError",Oe)}
    );

    --bbva-form-time--_ambient--readonly-clear-color: var(
      --bbva-form-time--custom--secondary-ambient--readonly-clear-color,
      ${Re("colorSecondaryFormInputIconReadOnly",Oe)}
    );
  }
`,ma=t`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-form-time--_ambient--clear-icon-color: var(
      --bbva-form-time--custom--secondary-alt-ambient--clear-icon-color,
      ${Re("colorSecondaryAltFormInputIconReadOnly",Oe)}
    );

    --bbva-form-time--_ambient--invalid-clear-icon-color: var(
      --bbva-form-time--custom--secondary-alt-ambient--invalid-clear-icon-color,
      ${Re("colorSecondaryAltFormInputIconError",Oe)}
    );

    --bbva-form-time--_ambient--readonly-clear-color: var(
      --bbva-form-time--custom--secondary-alt-ambient--readonly-clear-color,
      ${Re("colorSecondaryAltFormInputIconReadOnly",Oe)}
    );
  }
`,pa={primary:t`
    ${la}
    ${wi.primary}
  `,primaryAlt:t`
    ${ca}
    ${wi.primaryAlt}
  `,secondary:t`
    ${da}
    ${wi.secondary}
  `,secondaryAlt:t`
    ${ma}
    ${wi.secondaryAlt}
  `},ua=Object.values(pa);class ha extends(qe(xi)){static get is(){return"bbva-form-time"}static get scopedElements(){return{"bbva-type-icon":Ne,"bbva-type-text":ze,"bbva-type-link":Ge,"bbva-notification-help":Ue,"bbva-button-default":bi}}constructor(){super(),this.type="time",this.clearIcon=S()}static get styles(){return[super.styles,sa,na,ua,o("bbva-form-time-shared-styles")]}get valueAsDate(){return this._formElement.valueAsDate}get valueAsNumber(){return this._formElement.valueAsNumber}stepDown(){this._formElement.stepDown(),this.value=this._formElement.value}stepUp(){this._formElement.stepUp(),this.value=this._formElement.value}get field(){return p`
      <div
        class="field"
        @click="${this._onFocusin}"
        @keydown="${this._onFocusin}"
        @focusin="${this._onFocusin}"
        @focusout="${this._onFocusout}"
      >
        ${this.clearIconBlock} ${this.labelledInput}
      </div>
    `}get clearIconBlock(){return p`
      <span class="clear">
        <bbva-type-icon .icon="${this.clearIcon}" .size="${this.clearIconSize}"></bbva-type-icon>
      </span>
    `}get inputInnerStyles(){return`\n      input#${this._formElementId}::-webkit-inner-spin-button,\n      input#${this._formElementId}::-webkit-outer-spin-button {\n        -webkit-appearance: none;\n        margin: 0;\n      }\n      input#${this._formElementId}::-webkit-clear-button {\n        appearance: none;\n        display: none;\n      }\n      input#${this._formElementId}::-webkit-calendar-picker-indicator {\n        position: absolute;\n        top: 0;\n        left: 0;\n        color: transparent;\n        background: transparent;\n        opacity: 0;\n        width: 100%;\n        height: 100%;\n      }\n    `}}var ba=t`
:host {
  display: flex;
  align-items: flex-start;
  box-sizing: border-box;
  margin: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem) 1rem 0;
  font-size: var(--typographyType3XSmall, ${i(a.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${i(r.type3XSmall)});
  color: var(--_form-password-hint-text-color);
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

.sr-only {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
  font-size: 1px;
  white-space: nowrap;
  text-overflow: ellipsis;
}

.mark {
  width: 1rem;
  height: 1rem;
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem);
}

.icon {
  fill: var(--_form-password-hint-icon-color);
}

.unmarked {
  display: block;
  border: 1px solid var(--_form-password-hint-icon-color);
  border-radius: 50%;
}
`,va=t`
:host {
  --_form-password-hint-icon-color:
      var(--bbva-form-password-hint--_ambient--icon-color,
          var(--bbva-form-password-hint--custom--primary-ambient--icon-color,
              ${Re("colorPrimarySupportSuccessDefault",Oe)}));
  --_form-password-hint-text-color:
      var(--bbva-form-password-hint--_ambient--text-color,
          var(--bbva-form-password-hint--custom--primary-ambient--text-color,
              ${Re("colorPrimaryFormInputPlaceholderDefault",Oe)}));
}
`;const ga=t`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-form-password-hint--_ambient--icon-color: initial;
    --bbva-form-password-hint--_ambient--text-color: initial;
  }
`,ya=t`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-form-password-hint--_ambient--icon-color: var(
      --bbva-form-password-hint--custom--primary-alt-ambient--icon-color,
      ${Re("colorPrimaryAltSupportSuccessDefault",Oe)}
    );

    --bbva-form-password-hint--_ambient--text-color: var(
      --bbva-form-password-hint--custom--primary-alt-ambient--text-color,
      ${Re("colorPrimaryFormInputPlaceholderDefault",Oe)}
    );
  }
`,fa=t`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-form-password-hint--_ambient--icon-color: var(
      --bbva-form-password-hint--custom--secondary-ambient--icon-color,
      ${Re("colorSecondarySupportSuccessDefault",Oe)}
    );

    --bbva-form-password-hint--_ambient--text-color: var(
      --bbva-form-password-hint--custom--secondary-ambient--text-color,
      ${Re("colorSecondaryFormInputPlaceholderDefault",Oe)}
    );
  }
`,_a=t`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-form-password-hint--_ambient--icon-color: var(
      --bbva-form-password-hint--custom--secondary-alt-ambient--icon-color,
      ${Re("colorSecondaryAltSupportSuccessDefault",Oe)}
    );

    --bbva-form-password-hint--_ambient--text-color: var(
      --bbva-form-password-hint--custom--secondary-alt-ambient--text-color,
      ${Re("colorSecondaryAltFormInputPlaceholderDefault",Oe)}
    );
  }
`,$a={primary:t`
    ${ga}
    ${wi.primary}
    ${Ve.primary}
  `,primaryAlt:t`
    ${ya}
    ${wi.primaryAlt}
    ${Ve.primaryAlt}
  `,secondary:t`
    ${fa}
    ${wi.secondary}
    ${Ve.secondary}
  `,secondaryAlt:t`
    ${_a}
    ${wi.secondaryAlt}
    ${Ve.secondaryAlt}
  `},wa=Object.values($a),Sa=A(),xa="bbva-form-input-form-password-hint-checked",Ca="bbva-form-input-form-password-hint-unchecked";class Pa extends(l(qe(e))){static get is(){return"bbva-form-password-hint"}static get scopedElements(){return{"bbva-type-icon":Ne}}static get properties(){return{checked:{type:Boolean,reflect:!0}}}constructor(){super(),this.checked=!1}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.getAttribute("role")||this.setAttribute("role","listitem")}static get styles(){return[ba,va,wa,o("bbva-form-password-hint-shared-styles")]}render(){return p`
      ${this.checked?this._markedTpl:this._unmarkedTpl}
      <div class="text">
        <slot></slot>
        <span class="sr-only">${this._srCheckedMessage}</span>
      </div>
    `}get _markedTpl(){return p` <bbva-type-icon class="mark icon" icon="${Sa}"></bbva-type-icon> `}get _unmarkedTpl(){return p` <span class="mark unmarked" aria-hidden="true"></span> `}get _srCheckedMessage(){return this.checked?this.t(xa):this.t(Ca)}}var ka=t`
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
`;const Ta={primary:t`
    ${wi.primary}
    ${$a.primary}
  `,primaryAlt:t`
    ${wi.primaryAlt}
    ${$a.primaryAlt}
  `,secondary:t`
    ${wi.secondary}
    ${$a.secondary}
  `,secondaryAlt:t`
    ${wi.secondaryAlt}
    ${$a.secondaryAlt}
  `},Ea=Object.values(Ta);class Ia extends(qe(D(l(xi)))){static get is(){return"bbva-form-password"}static get scopedElements(){return{"bbva-type-text":ze,"bbva-type-icon":Ne,"bbva-type-link":Ge,"bbva-notification-help":Ue,"bbva-button-default":bi,"bbva-form-password-hint":Pa}}static get properties(){return{toggleIcon:{type:String,attribute:"toggle-icon"},toggleVisibleIcon:{type:String,attribute:"toggle-visible-icon"},toggleIconSize:{type:Number,attribute:"toggle-icon-size"},toggleAccessibleText:{type:String,attribute:"toggle-accessible-text"},toggleVisibleAccessibleText:{type:String,attribute:"toggle-visible-accessible-text"},visible:{type:Boolean},hintsListLabel:{type:String,reflect:!0,attribute:"hints-list-label"}}}constructor(){super(),this.actionType="button",this.actionVariant="no-background",this.actionIntoForm=!0,this.type="password",this.toggleVisibleIcon=M(),this.toggleIconSize=24,this.toggleAccessibleText="bbva-form-input-password-toggle",this.toggleVisibleAccessibleText="bbva-form-input-password-toggle-visible",this.visible=!1,this.toggleIcon=F(),this.actionIcon=this.toggleIcon,this.actionIconSecondary=this.toggleVisibleIcon,this.actionAccessibleText=this.toggleAccessibleText,this.actionSecondaryAccessibleText=this.toggleVisibleAccessibleText,this.hintsListLabel="",this._onSlotsChange=this._onSlotsChange.bind(this),this.addEventListener("slotschanges",this._onSlotsChange)}updated(t){super.updated(t),t.has("visible")&&(this.type=this.visible?"text":"password")}static get styles(){return[super.styles,ka,Ea,o("bbva-form-password-shared-styles")]}switchIcon(){this._secondary=!this._secondary,this.visible=!this.visible,this.focus(),this.requestUpdate(),this.dispatchEvent(new CustomEvent("form-field-button-switch",{detail:this.visible,bubbles:!0,composed:!0}))}get _hintsTpl(){return p`
      <div
        class="hints"
        role="list"
        aria-label="${this.t(this._hintsListLabel)}"
        ?hidden="${this.readonly||!this._hasHints}"
      >
        <slot name="hints"></slot>
      </div>
    `}get _hintsListLabel(){return this.hintsListLabel}_onSlotsChange(t){const{slotName:e,contentSlots:o}=t.detail;"hints"===e&&(this._hasHints=Boolean(o.length))}render(){return p`
      ${this._labelOut} ${this.actionIntoForm?this.fieldAction:this.field} ${this.messageError}
      ${this.messageInfo} ${this._hintsTpl}
    `}}var Aa=t`
:host {
  display: block;
  box-sizing: border-box;
}

:host([disabled]) {
  opacity: 0.4;
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

.field {
  position: relative;
  max-height: 8.75rem;
  padding: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1em) 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1em);
  background-color: var(--_form-textarea-field-bg-color);
  border-bottom: 1px solid var(--_form-textarea-field-border-color);
  border-radius: var(--bbva-form-textarea-field-border-radius, var(--borderRadiusSmall, ${i(n.small)}));
}
:host([focused]) .field {
  border-bottom-color: var(--_form-textarea-focused-field-border-color);
}
:host([invalid]) .field {
  background-color: var(--_form-textarea-invalid-field-bg-color);
  border-bottom-color: var(--_form-textarea-invalid-field-border-color);
}

.label,
.message,
.slot-textarea ::slotted(textarea) {
  font-style: var(--fontFacePrimaryBookFontStyle, ${i(s.book.fontStyle)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${i(s.book.fontWeight)});
}

.label,
.slot-textarea ::slotted(textarea) {
  font-size: var(--typographyTypeSmall, ${i(a.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${i(r.typeSmall)});
}

.slot-textarea ::slotted(textarea) {
  will-change: transform;
  width: 100%;
  height: var(--area-height, 3.5rem);
  min-height: 3.5rem;
  max-height: 6.25rem;
  font-family: inherit;
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 15) * 1em) 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 15) * 1em);
  outline: none;
  resize: none;
  overflow-x: hidden;
  border: none;
  background: transparent;
  color: var(--_form-textarea-textarea-color);
}
:host([readonly]) .slot-textarea ::slotted(textarea) {
  color: var(--_form-textarea-readonly-textarea-color);
}
:host(:not([invalid])) .slot-textarea ::slotted(textarea) {
  color: var(--_form-textarea-invalid-textarea-color);
}
:host([focused]) .slot-textarea ::slotted(textarea) {
  width: calc(100% - 2rem);
}

.label {
  position: absolute;
  top: 0;
  left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 15) * 1em);
  right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 15) * 1em);
  color: var(--_form-textarea-label-color);
  will-change: transform;
  transform: translateY(calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 15) * 1em));
  transform-origin: top left;
  transition: transform 0.2s ease-in-out;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
:host([focused]) .label, :host([filled]) .label {
  color: var(--_form-textarea-focused-label-color);
  transform: translateY(calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 15) * 1em)) scale(0.8);
}
:host([readonly]) .label {
  color: var(--_form-textarea-readonly-textarea-color);
}
:host([invalid]) .label {
  color: var(--_form-textarea-invalid-label-color);
}

.clear {
  display: none;
  position: absolute;
  top: 0;
  right: 0;
}
:host(:not([invalid])[focused]) .clear {
  display: flex;
}
:host([invalid][focused]) .clear {
  display: flex;
  --bbva-button-default--_ambient--icon-no-background-color: var(--_form-textarea-error-icon-color);
}

.message {
  display: flex;
  justify-content: flex-start;
  align-items: flex-start;
  color: var(--_form-textarea-message-color);
}
.message.counter {
  padding-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem);
  display: flex;
  align-items: center;
  justify-content: flex-end;
}
.message.counter [data-tag-name=bbva-type-text] {
  color: var(--_form-textarea-message-info-counter-color);
}

:host([maxlength][info-message]) .message {
  margin-top: 0;
}

.message-error[data-tag-name=bbva-notification-help] {
  --bbva-notification-help--_ambient--icon-color: var(--_form-textarea-message-error-icon-color);
}

.label-out {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem);
  display: flex;
  align-items: center;
}

[data-tag-name=bbva-type-link] {
  --bbva-type-link-with-icon-icon-color: var(--_help-icon-color);
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem);
}

.notification {
  padding-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem);
}
`,Da=t`
:host {
  --_form-textarea-field-bg-color:
      var(--bbva-form-textarea--_ambient--field-bg-color,
          var(--bbva-form-textarea--custom--primary-ambient--field-bg-color,
              ${Re("colorPrimaryFormInputBackgroundDefault",Oe)}));
  --_form-textarea-field-border-color:
      var(--bbva-form-textarea--_ambient--field-border-color,
          var(--bbva-form-textarea--custom--primary-ambient--field-border-color,
              ${Re("colorPrimaryFormInputBorderInactive",Oe)}));
  --_form-textarea-focused-field-border-color:
     var(--bbva-form-textarea--_ambient--focused-field-border-color,
         var(--bbva-form-textarea--custom--primary-ambient--focused-field-border-color,
             ${Re("colorPrimaryFormInputBorderActive",Oe)}));
  --_form-textarea-invalid-field-bg-color:
      var(--bbva-form-textarea--_ambient--invalid-field-bg-color,
          var(--bbva-form-textarea--custom--primary-ambient--invalid-field-bg-color,
              ${Re("colorPrimaryFormInputBackgroundError",Oe)}));
  --_form-textarea-invalid-field-border-colors:
      var(--bbva-form-textarea--_ambient--invalid-field-border-colors,
          var(--bbva-form-textarea--custom--primary-ambient--invalid-field-border-colors,
              ${Re("colorPrimaryFormInputBorderError",Oe)}));
  --_form-textarea-textarea-color:
         var(--bbva-form-textarea--custom--primary-ambient--textarea-color,
             ${Re("colorPrimaryFormInputFieldTextDefault",Oe)});
  --_form-textarea-readonly-textarea-color:
      var(--bbva-form-textarea--_ambient--readonly-textarea-color,
          var(--bbva-form-textarea--custom--primary-ambient--readonly-textarea-color,
              ${Re("colorPrimaryFormInputFieldTextDefault",Oe)}));
  --_form-textarea-invalid-textarea-color:
      var(--bbva-form-textarea--_ambient--invalid-textarea-color,
          var(--bbva-form-textarea--custom--primary-ambient--invalid-textarea-color,
              ${Re("colorPrimaryText01Default",Oe)}));
  --_form-textarea-label-color:
      var(--bbva-form-textarea--_ambient--label-color,
          var(--bbva-form-textarea--custom--primary-ambient--label-color,
              ${Re("colorPrimaryFormInputPlaceholderDefault",Oe)}));
  --_form-textarea-label-out-color:
      var(--bbva-form-textarea--_ambient--label-out-color,
          var(--bbva-form-textarea--custom--primary-ambient--label-out-color,
              ${Re("colorPrimaryText01Default",Oe)}));
  --_form-textarea-focused-label-color:
      var(--bbva-form-textarea--_ambient--focused-label-color,
          var(--bbva-form-textarea--custom--primary-ambient--focused-label-color,
              ${Re("colorPrimaryFormInputPlaceholderDefault",Oe)}));
  --_form-textarea-invalid-label-color:
      var(--bbva-form-textarea--_ambient--invalid-label-color,
          var(--bbva-form-textarea--custom--primary-ambient--invalid-label-color,
              ${Re("colorPrimaryFormInputPlaceholderError",Oe)}));
  --_form-textarea-message-info-counter-color:
      var(--bbva-form-textarea--_ambient--message-info-counter-color,
          var(--bbva-form-textarea--custom--primary-ambient--message-info-counter-color,
              ${Re("colorPrimaryText02Default",Oe)}));
  --_form-textarea-message-error-icon-color:
      var(--bbva-form-textarea--_ambient--message-icon-color,
          var(--bbva-form-textarea--custom--primary-ambient--message-icon-color,
              ${Re("colorPrimarySupportErrorDefault",Oe)}));
  --_form-textarea-error-icon-color:
      var(--bbva-form-textarea--_ambient--error-icon-color,
          var(--bbva-form-textarea--custom--primary-ambient--error-icon-color,
              ${Re("colorPrimaryFormInputIconError",Oe)}));
}
`;const Ma=t`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-form-textarea--_ambient--field-bg-color: initial;
    --bbva-form-textarea--_ambient--field-border-color: initial;
    --bbva-form-textarea--_ambient--focused-field-border-color: initial;
    --bbva-form-textarea--_ambient--invalid-field-bg-color: initial;
    --bbva-form-textarea--_ambient--invalid-field-border-colors: initial;
    --bbva-form-textarea--_ambient--textarea-color: initial;
    --bbva-form-textarea--_ambient--readonly-textarea-color: initial;
    --bbva-form-textarea--_ambient--invalid-textarea-color: initial;
    --bbva-form-textarea--_ambient--label-color: initial;
    --bbva-form-textarea--_ambient--label-out-color: initial;
    --bbva-form-textarea--_ambient--focused-label-color: initial;
    --bbva-form-textarea--_ambient--readonly-label-color: initial;
    --bbva-form-textarea--_ambient--invalid-label-color: initial;
    --bbva-form-textarea--_ambient--message-info-counter-color: initial;
    --bbva-form-textarea--_ambient--message-icon-color: initial;
    --bbva-form-textarea--_ambient--error-icon-color: initial;
  }
`,Fa=t`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-form-textarea--_ambient--field-bg-color: var(
      --bbva-form-textarea--custom--primary-alt-ambient--field-bg-color,
      ${Re("colorPrimaryAltFormInputBackgroundDefault",Oe)}
    );

    --bbva-form-textarea--_ambient--field-border-color: var(
      --bbva-form-textarea--custom--primary-alt-ambient--field-border-color,
      ${Re("colorPrimaryAltFormInputBorderInactive",Oe)}
    );

    --bbva-form-textarea--_ambient--focused-field-border-color: var(
      --bbva-form-textarea--custom--primary-alt-ambient--focused-field-border-color,
      ${Re("colorPrimaryAltFormInputBorderActive",Oe)}
    );

    --bbva-form-textarea--_ambient--invalid-field-bg-color: var(
      --bbva-form-textarea--custom--primary-alt-ambient--invalid-field-bg-color,
      ${Re("colorPrimaryAltFormInputBackgroundError",Oe)}
    );

    --bbva-form-textarea--_ambient--invalid-field-border-colors: var(
      --bbva-form-textarea--custom--primary-alt-ambient--invalid-field-border-colors,
      ${Re("colorPrimaryAltFormInputBorderError",Oe)}
    );

    --bbva-form-textarea--_ambient--textarea-color: var(
      --bbva-form-textarea--custom--primary-alt-ambient--textarea-color,
      ${Re("colorPrimaryAltFormInputFieldTextDefault",Oe)}
    );

    --bbva-form-textarea--_ambient--readonly-textarea-color: var(
      --bbva-form-textarea--custom--primary-alt-ambient--readonly-textarea-color,
      ${Re("colorPrimaryAltFormInputFieldTextDefault",Oe)}
    );

    --bbva-form-textarea--_ambient--invalid-textarea-color: var(
      --bbva-form-textarea--custom--primary-alt-ambient--invalid-textarea-color,
      ${Re("colorPrimaryAltText01Default",Oe)}
    );

    --bbva-form-textarea--_ambient--label-color: var(
      --bbva-form-textarea--custom--primary-alt-ambient--label-color,
      ${Re("colorPrimaryAltFormInputPlaceholderDefault",Oe)}
    );

    --bbva-form-textarea--_ambient--label-out-color: var(
      --bbva-form-textarea--custom--primary-alt-ambient--label-out-color,
      ${Re("colorPrimaryAltText01Default",Oe)}
    );

    --bbva-form-textarea--_ambient--focused-label-color: var(
      --bbva-form-textarea--custom--primary-alt-ambient--focused-label-color,
      ${Re("colorPrimaryAltFormInputPlaceholderDefault",Oe)}
    );

    --bbva-form-textarea--_ambient--readonly-label-color: var(
      --bbva-form-textarea--custom--primary-alt-ambient--readonly-label-color,
      ${Re("colorPrimaryAltFormInputPlaceholderDefault",Oe)}
    );

    --bbva-form-textarea--_ambient--invalid-label-color: var(
      --bbva-form-textarea--custom--primary-alt-ambient--invalid-label-color,
      ${Re("colorPrimaryAltFormInputPlaceholderError",Oe)}
    );

    --bbva-form-textarea--_ambient--message-info-counter-color: var(
      --bbva-form-textarea--custom--primary-alt-ambient--message-info-counter-color,
      ${Re("colorPrimaryAltText02Default",Oe)}
    );

    --bbva-form-textarea--_ambient--message-icon-color: var(
      --bbva-form-textarea--custom--primary-alt-ambient--message-icon-color,
      ${Re("colorPrimaryAltSupportErrorDefault",Oe)}
    );

    --bbva-form-textarea--_ambient--error-icon-color: var(
      --bbva-form-textarea--custom--primary-alt-ambient--error-icon-color,
        ${Re("colorPrimaryAltFormInputIconError",Oe)}
    );
  }
`,Ba=t`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-form-textarea--_ambient--field-bg-color: var(
      --bbva-form-textarea--custom--secondary-ambient--field-bg-color,
      ${Re("colorSecondaryFormInputBackgroundDefault",Oe)}
    );

    --bbva-form-textarea--_ambient--field-border-color: var(
      --bbva-form-textarea--custom--secondary-ambient--field-border-color,
      ${Re("colorSecondaryFormInputBorderInactive",Oe)}
    );

    --bbva-form-textarea--_ambient--focused-field-border-color: var(
      --bbva-form-textarea--custom--secondary-ambient--focused-field-border-color,
      ${Re("colorSecondaryFormInputBorderActive",Oe)}
    );

    --bbva-form-textarea--_ambient--invalid-field-bg-color: var(
      --bbva-form-textarea--custom--secondary-ambient--invalid-field-bg-color,
      ${Re("colorSecondaryFormInputBackgroundError",Oe)}
    );

    --bbva-form-textarea--_ambient--invalid-field-border-colors: var(
      --bbva-form-textarea--custom--secondary-ambient--invalid-field-border-colors,
      ${Re("colorSecondaryFormInputBorderError",Oe)}
    );

    --bbva-form-textarea--_ambient--textarea-color: var(
      --bbva-form-textarea--custom--secondary-ambient--textarea-color,
      ${Re("colorSecondaryFormInputFieldTextDefault",Oe)}
    );

    --bbva-form-textarea--_ambient--readonly-textarea-color: var(
      --bbva-form-textarea--custom--secondary-ambient--readonly-textarea-color,
      ${Re("colorSecondaryFormInputFieldTextDefault",Oe)}
    );

    --bbva-form-textarea--_ambient--invalid-textarea-color: var(
      --bbva-form-textarea--custom--secondary-ambient--invalid-textarea-color,
      ${Re("colorSecondaryText01Default",Oe)}
    );

    --bbva-form-textarea--_ambient--label-color: var(
      --bbva-form-textarea--custom--secondary-ambient--label-color,
      ${Re("colorSecondaryFormInputPlaceholderDefault",Oe)}
    );

    --bbva-form-textarea--_ambient--label-out-color: var(
      --bbva-form-textarea--custom--secondary-ambient--label-out-color,
      ${Re("colorSecondaryText01Default",Oe)}
    );

    --bbva-form-textarea--_ambient--focused-label-color: var(
      --bbva-form-textarea--custom--secondary-ambient--focused-label-color,
      ${Re("colorSecondaryFormInputPlaceholderDefault",Oe)}
    );

    --bbva-form-textarea--_ambient--readonly-label-color: var(
      --bbva-form-textarea--custom--secondary-ambient--readonly-label-color,
      ${Re("colorSecondaryFormInputPlaceholderDefault",Oe)}
    );

    --bbva-form-textarea--_ambient--invalid-label-color: var(
      --bbva-form-textarea--custom--secondary-ambient--invalid-label-color,
      ${Re("colorSecondaryFormInputPlaceholderError",Oe)}
    );

    --bbva-form-textarea--_ambient--message-info-counter-color: var(
      --bbva-form-textarea--custom--secondary-ambient--message-info-counter-color,
      ${Re("colorSecondaryText02Default",Oe)}
    );

    --bbva-form-textarea--_ambient--message-icon-color: var(
      --bbva-form-textarea--custom--secondary-ambient--message-icon-color,
      ${Re("colorSecondarySupportErrorDefault",Oe)}
    );

    --bbva-form-textarea--_ambient--error-icon-color: var(
      --bbva-form-textarea--custom--secondary-ambient--error-icon-color,
        ${Re("colorSecondaryFormInputIconError",Oe)}
    );
  }
`,Ra=t`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-form-textarea--_ambient--field-bg-color: var(
      --bbva-form-textarea--custom--secondary-alt-ambient--field-bg-color,
      ${Re("colorSecondaryAltFormInputBackgroundDefault",Oe)}
    );

    --bbva-form-textarea--_ambient--field-border-color: var(
      --bbva-form-textarea--custom--secondary-alt-ambient--field-border-color,
      ${Re("colorSecondaryAltFormInputBorderInactive",Oe)}
    );

    --bbva-form-textarea--_ambient--focused-field-border-color: var(
      --bbva-form-textarea--custom--secondary-alt-ambient--focused-field-border-color,
      ${Re("colorSecondaryAltFormInputBorderActive",Oe)}
    );

    --bbva-form-textarea--_ambient--invalid-field-bg-color: var(
      --bbva-form-textarea--custom--secondary-alt-ambient--invalid-field-bg-color,
      ${Re("colorSecondaryAltFormInputBackgroundError",Oe)}
    );

    --bbva-form-textarea--_ambient--invalid-field-border-colors: var(
      --bbva-form-textarea--custom--secondary-alt-ambient--invalid-field-border-colors,
      ${Re("colorSecondaryAltFormInputBorderError",Oe)}
    );

    --bbva-form-textarea--_ambient--textarea-color: var(
      --bbva-form-textarea--custom--secondary-alt-ambient--textarea-color,
      ${Re("colorSecondaryAltFormInputFieldTextDefault",Oe)}
    );

    --bbva-form-textarea--_ambient--readonly-textarea-color: var(
      --bbva-form-textarea--custom--secondary-alt-ambient--readonly-textarea-color,
      ${Re("colorSecondaryAltFormInputFieldTextDefault",Oe)}
    );

    --bbva-form-textarea--_ambient--invalid-textarea-color: var(
      --bbva-form-textarea--custom--secondary-alt-ambient--invalid-textarea-color,
      ${Re("colorSecondaryAltText01Default",Oe)}
    );

    --bbva-form-textarea--_ambient--label-color: var(
      --bbva-form-textarea--custom--secondary-alt-ambient--label-color,
      ${Re("colorSecondaryAltFormInputPlaceholderDefault",Oe)}
    );

    --bbva-form-textarea--_ambient--label-out-color: var(
      --bbva-form-textarea--custom--secondary-alt-ambient--label-out-color,
      ${Re("colorSecondaryAltText01Default",Oe)}
    );

    --bbva-form-textarea--_ambient--focused-label-color: var(
      --bbva-form-textarea--custom--secondary-alt-ambient--focused-label-color,
      ${Re("colorSecondaryAltFormInputPlaceholderDefault",Oe)}
    );

    --bbva-form-textarea--_ambient--readonly-label-color: var(
      --bbva-form-textarea--custom--secondary-alt-ambient--readonly-label-color,
      ${Re("colorSecondaryAltFormInputPlaceholderDefault",Oe)}
    );

    --bbva-form-textarea--_ambient--invalid-label-color: var(
      --bbva-form-textarea--custom--secondary-alt-ambient--invalid-label-color,
      ${Re("colorSecondaryAltFormInputPlaceholderError",Oe)}
    );

    --bbva-form-textarea--_ambient--message-info-counter-color: var(
      --bbva-form-textarea--custom--secondary-alt-ambient--message-info-counter-color,
      ${Re("colorSecondaryAltText02Default",Oe)}
    );

    --bbva-form-textarea--_ambient--message-icon-color: var(
      --bbva-form-textarea--custom--secondary-alt-ambient--message-icon-color,
      ${Re("colorSecondaryAltSupportErrorDefault",Oe)}
    );

    --bbva-form-textarea--_ambient--error-icon-color: var(
      --bbva-form-textarea--custom--secondary-alt-ambient--error-icon-color,
        ${Re("colorSecondaryAltFormInputIconError",Oe)}
    );
  }
`,Oa={primary:t`
    ${Ma}
    ${Le.primary}
    ${je.primary}
    ${He.primary}
    ${pi.primary}
  `,primaryAlt:t`
    ${Fa}
    ${Le.primaryAlt}
    ${je.primaryAlt}
    ${He.primaryAlt}
    ${pi.primaryAlt}
  `,secondary:t`
    ${Ba}
    ${Le.secondary}
    ${je.secondary}
    ${He.secondary}
    ${pi.secondary}
  `,secondaryAlt:t`
    ${Ra}
    ${Le.secondaryAlt}
    ${je.secondaryAlt}
    ${He.secondary}
    ${pi.secondaryAlt}
  `},La=Object.values(Oa);class Va extends(qe(l(We))){static get is(){return"bbva-form-textarea"}static get scopedElements(){return{"bbva-type-text":ze,"bbva-type-link":Ge,"bbva-button-default":bi,"bbva-notification-help":Ue}}static get properties(){return{validateOnBlur:{type:Boolean,attribute:"validate-on-blur"},characterCounterLabel:{type:String,attribute:"character-counter-label"},clearIcon:{type:String,attribute:"clear-icon"},clearIconSize:{type:Number,attribute:"clear-icon-size"},clearAccessibleText:{type:String,attribute:"clear-accessible-text"},errorIcon:{type:String,attribute:"error-icon"},errorMessage:{type:String,attribute:"error-message"},infoIcon:{type:String,attribute:"info-icon"},infoMessage:{type:String,attribute:"info-message"},label:{type:String},labelOut:{type:String,attribute:"label-out"}}}constructor(){super(),this.label="",this.labelOut="",this.optionalLabel="bbva-form-input-textarea-optional-label",this.characterCounterLabel="bbva-form-input-textarea-counter-label",this.clearIcon=g(),this.clearIconSize=24,this.clearAccessibleText="bbva-form-input-textarea-clear",this.errorIcon=y(),this.errorMessage="",this.infoIcon=f(),this.infoMessage=""}firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),this._rootNode=this.getRootNode?this.getRootNode():document,this._field=this.shadowRoot.querySelector(".field"),this._formElement=this.querySelector("textarea")}updated(t){super.updated(t),t.has("value")&&(this.autoValidate||void 0===t.get("value")||(this.invalid=!!this.required&&this._isEmpty),this._isEmpty?this.removeAttribute("filled"):this.setAttribute("filled",""))}static get styles(){return[Aa,Da,La,o("bbva-form-textarea-shared-styles")]}render(){return p`${this._labelOut} ${this.field} ${this.messageError} ${this._characterCounter}
    ${this.messageInfo}`}get inputLabel(){return this.labelOut&&!this.label&&(this.label=this.labelOut),`${this.label} ${this.labelOut||this.required?this.t(this.optionalLabel):""}`}get _helpIcon(){return this.helpIcon?p`
          <bbva-type-link
            @click="${this._helpClicked}"
            icon="${B}"
            iconSize="24"
            href="${_(this.linkHref)}"
            aria-label="${this.t("bbva-form-input-textarea-help-text")}"
          >
          </bbva-type-link>
        `:""}get _labelOut(){return this.labelOut?p`
        <div class="label-out">
          <bbva-type-text
            id="labelOutText"
            unset
            text=${this.required?`${this.labelOut}`:`${this.labelOut} ${this.t(this.optionalLabel)}`}
            size="M"
          >
          </bbva-type-text>
          ${this._helpIcon}
        </div>
      `:""}get _isEmpty(){return""===this.value||void 0===this.value||null===this.value}_onInput(){this.value=this._formElement.value,this.style.removeProperty("--area-height"),this.style.setProperty("--area-height",this._formElement.scrollHeight/16+"rem"),this._calculateCharacters()}get field(){return p`
      <div class="field" @focusin="${this._onFocusin}" @focusout="${this._onFocusout}">
        ${this._labelledTextarea} ${this.clearButton}
      </div>
    `}get clearButton(){return p`
      <bbva-button-default
        class="clear"
        variant="icon no-background"
        .icon="${this.clearIcon}"
        .size="${this.clearIconSize}"
        @click="${this.clearTextarea}"
        aria-label="${this.t(this.clearAccessibleText)}"
      >
      </bbva-button-default>
    `}get messageError(){return this._errorVisible?p`
          <div class="message error" role="alert">
            <bbva-notification-help
              class="message-error notification"
              accessibility-label-icon="${this.t("bbva-form-input-field-accessibility-alert-icon")}"
              icon="${this.errorIcon}"
              .size="${this.errorIconSize}"
              text=${this.t(this.errorMessage)}
              disabled-tabindex
            ></bbva-notification-help>
          </div>
        `:""}get _errorVisible(){return this.errorMessage&&this.invalid}get _characters(){return"number"==typeof this._remainingCharacters?this._remainingCharacters:this.maxlength}get _characterCounter(){return this.maxlength?p`
          <div class="message info counter">
            <bbva-type-text
              unset
              text="${this._characters} ${this.t(this.characterCounterLabel)}"
              size="2XS"
            >
            </bbva-type-text>
          </div>
        `:""}get messageInfo(){return this.infoMessage?p`
          <bbva-notification-help
            disabled-tabindex
            accessibility-label-icon="${this.t("bbva-form-input-field-accessibility-info-icon")}"
            .icon="${this.infoIcon}"
            text=${this.t(this.infoMessage)}
            class="notification"
          ></bbva-notification-help>
        `:""}get _labelBlock(){return p`
      <bbva-type-text
        unset
        size="2XS"
        tag="label"
        for="${this._formElementId}"
        text="${this._textareaLabel}"
        class="label"
        aria-hidden="true"
        @click="${this.focus}"
      ></bbva-type-text>
    `}_calculateCharacters(){var t;this._remainingCharacters=this.maxlength-((null===(t=this._formElement)||void 0===t?void 0:t.value.length)||0)}_onFocusin(){this.readonly||setTimeout((()=>{this._focus()}),1)}_onFocusout(){this.readonly||setTimeout((()=>{const{activeElement:t}=this._rootNode,e=this.shadowRoot.activeElement||t;this._field.contains(e)||t===this._formElement||(this._blur(),this.validateOnBlur&&this.validate())}),1)}_focus(){this.setAttribute("focused",""),this.dispatchEvent(new CustomEvent("form-textarea-input-focus",{detail:!0,bubbles:!0,composed:!0}))}_blur(){this.removeAttribute("focused"),this.dispatchEvent(new CustomEvent("form-textarea-input-blur",{detail:!0,bubbles:!0,composed:!0}))}clearTextarea(){this._formElement.value="",this._formElement.dispatchEvent(new CustomEvent("input",{detail:!0,bubbles:!0})),this.dispatchEvent(new CustomEvent("form-textarea-input-clear",{detail:!0,bubbles:!0,composed:!0})),this.focus()}_helpClicked(){this.dispatchEvent(new CustomEvent("form-field-help-click",{detail:!0,bubbles:!0,composed:!0}))}}var qa=t`
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
`;const Na={primary:t`
    ${wi.primary}
    ${Ki.primary}
    ${Zi.primary}
    ${Ai.primary}
    ${Ta.primary}
    ${ia.primary}
    ${qi.primary}
    ${pa.primary}
    ${Oa.primary}
    ${Ri.primary}
  `,primaryAlt:t`
    ${wi.primaryAlt}
    ${Ki.primaryAlt}
    ${Zi.primaryAlt}
    ${Ai.primaryAlt}
    ${Ta.primaryAlt}
    ${ia.primaryAlt}
    ${qi.primaryAlt}
    ${pa.primaryAlt}
    ${Oa.primaryAlt}
    ${Ri.primaryAlt}
  `,secondary:t`
    ${wi.secondary}
    ${Ki.secondary}
    ${Zi.secondary}
    ${Ai.secondary}
    ${Ta.secondary}
    ${ia.secondary}
    ${qi.secondary}
    ${pa.secondary}
    ${Oa.secondary}
    ${Ri.secondary}
  `,secondaryAlt:t`
    ${wi.secondaryAlt}
    ${Ki.secondaryAlt}
    ${Zi.secondaryAlt}
    ${Ai.secondaryAlt}
    ${Ta.secondaryAlt}
    ${ia.secondaryAlt}
    ${qi.secondaryAlt}
    ${pa.secondaryAlt}
    ${Oa.secondaryAlt}
    ${Ri.secondaryAlt}
  `},za=Object.values(Na);class Ha extends(qe(D(e))){static get is(){return"bbva-form-input"}static get scopedElements(){return{"bbva-form-attach":Li,"bbva-form-text":zi,"bbva-form-amount":Fi,"bbva-form-date":Ji,"bbva-form-number":ea,"bbva-form-search":ra,"bbva-form-password":Ia,"bbva-form-time":ha,"bbva-form-textarea":Va}}static get properties(){return{type:{type:String,reflect:!0},disabled:{type:Boolean,reflect:!0},value:{type:String},name:{type:String},required:{type:Boolean},readonly:{type:Boolean},autocomplete:{type:String},inputmode:{type:String},label:{type:String},pattern:{type:String},allowedPattern:{type:String,attribute:"allowed-pattern"},max:{type:String},maxlength:{type:Number},min:{type:String},minlength:{type:Number},placeholder:{type:String},step:{type:Number},accessibleDescription:{type:String,attribute:"accessible-description"},autoValidate:{type:Boolean,attribute:"auto-validate"},form:{type:Object},actionType:{type:String,reflect:!0,attribute:"action-type"},actionIcon:{type:String,attribute:"action-icon"},actionIconSize:{type:Number,attribute:"action-icon-size"},actionIconSecondary:{type:String,attribute:"action-icon-secondary"},actionIconSecondarySize:{type:Number,attribute:"action-icon-secondary-size"},helpIconSize:{type:Number,attribute:"help-icon-size"},actionAccessibleText:{type:String,attribute:"action-accessible-text"},actionSecondaryAccessibleText:{type:String,attribute:"action-secondary-accessible-text"},actionVariant:{type:String,reflect:!0,attribute:"action-variant"},actionIntoForm:{type:Boolean,reflect:!0,attribute:"action-into-form"},validateOnBlur:{type:Boolean,attribute:"validate-on-blur"},clearIcon:{type:String,attribute:"clear-icon"},clearIconSize:{type:Number,attribute:"clear-icon-size"},clearAccessibleText:{type:String,attribute:"clear-accessible-text"},errorIcon:{type:String,attribute:"error-icon"},errorMessage:{type:String,attribute:"error-message"},helpIcon:{type:String,attribute:"help-icon"},linkHref:{type:String,attribute:"link-href"},infoMessage:{type:String,attribute:"info-message"},labelOut:{type:String,attribute:"label-out"},optionalLabel:{type:String,attribute:"optional-label"},currencyCode:{type:String,attribute:"currency-code"},localCurrency:{type:String,attribute:"local-currency"},symbol:{type:String},symbolLeft:{type:Boolean,attribute:"symbol-left"},symbolRight:{type:Boolean,attribute:"symbol-right"},amount:{type:Number},language:{type:String},abbr:{type:Number},abbreviations:{type:Object},decimalDigits:{type:Number,attribute:"decimal-digits"},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"},zeroDecimalsHidden:{type:Boolean,attribute:"zero-decimals-hidden"},trailingZeroDecimalsHidden:{type:Boolean,attribute:"trailing-zero-decimals-hidden"},separatorChar:{type:String,attribute:"separator-char"},groupChar:{type:String,attribute:"group-char"},_intlLanguage:{attribute:!1},_intlAmountLanguage:{attribute:!1},flag:{type:String},flagLabel:{type:String,attribute:"flag-label"},items:{type:Array},minChars:{type:Number,attribute:"min-chars"},maxResults:{type:Number,attribute:"max-results"},filterValueKey:{type:String,attribute:"filter-value-key"},autoselect:{type:Boolean},selectOnBlur:{type:Boolean,attribute:"select-on-blur"},keepOnBlur:{type:Boolean,attribute:"keep-on-blur"},keepOnSelect:{type:Boolean,attribute:"keep-on-select"},preventValueUpdateOnSelect:{type:Boolean,attribute:"prevent-value-update-on-select"},overlay:{type:Boolean,reflect:!0},search:{type:Boolean},toggleIcon:{type:String,attribute:"toggle-icon"},toggleVisibleIcon:{type:String,attribute:"toggle-visible-icon"},toggleIconSize:{type:Number,attribute:"toggle-icon-size"},toggleAccessibleText:{type:String,attribute:"toggle-accessible-text"},toggleVisibleAccessibleText:{type:String,attribute:"toggle-visible-accessible-text"},visible:{type:Boolean},disabledButton:{type:Boolean,attribute:"disabled-button"},variant:{type:String},characterCounterLabel:{type:String,attribute:"character-counter-label"},iconVariant:{type:String,attribute:"icon-variant"},showCard:{type:Boolean,attribute:"show-card"},invalid:{type:Boolean},autoFocus:{type:Boolean,attribute:"autofocus"},logo:{type:String},cardType:{type:String,attribute:"card-type"},cardImage:{type:String,attribute:"card-image"},partner:{type:Boolean},partnerLogo:{type:String,attribute:"partner-logo"},cardVariant:{type:String,attribute:"card-variant"},inlineAutocomplete:{type:Boolean,attribute:"inline-autocomplete"},cardStatus:{type:String,attribute:"card-status",reflect:!0},payCompatibility:{type:String,attribute:"pay-compatibility"},hideBottomPaddingInfoMessage:{type:Boolean,attribute:"hide-bottom-padding-info-message"}}}constructor(){super(),this.logo="",this.cardStatus="",this.cardType="",this.cardImage="",this.partner=!1,this.cardVariant="",this.payCompatibility="",this.abbreviations={1:"da",2:"h",3:"k",6:"M",9:"B"},this.autoFocus=!1,this.actionAccessibleText="",this.actionIconSize=24,this.actionIconSecondary=this.toggleVisibleIcon,this.actionIconSecondarySize=24,this.actionSecondaryAccessibleText=this.toggleVisibleAccessibleText,this.allowedPattern="",this.autoselect=!1,this.autoValidate=!1,this.clearIcon="",this.clearIconSize=24,this.clearAccessibleText="",this.currencyCode="EUR",this.decimalDigits=2,this.decimalsHidden=!1,this.errorIcon="",this.errorMessage="",this.filterValueKey=null,this.hasError=!1,this.helpIconSize=24,this.invalid=!1,this.infoMessage="",this.items=[],this.keepOnBlur=!1,this.keepOnSelect=!1,this.label="",this.labelOut="",this.localCurrency="EUR",this.maxResults=5,this.minChars=1,this.name="",this.optionalLabel="",this.overlay=!1,this.preventValueUpdateOnSelect=!1,this.required=!1,this.search=!1,this.selectOnBlur=!1,this.toggleAccessibleText="",this.toggleIcon="",this.toggleIconSize=24,this.toggleVisibleIcon="",this.toggleVisibleAccessibleText="",this.trailingZeroDecimalsHidden=!1,this.type="",this.value="",this.form={},this.visible=!1,this.zeroDecimalsHidden=!1,this.hideBottomPaddingInfoMessage=!1,this.addEventListener("slotschanges",this._onSlotsChange)}static get styles(){return[qa,za,o("bbva-form-input-shared-styles")]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.addEventListener("input",this._updateValue)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("input",this._updateValue)}firstUpdated(){super.firstUpdated(),this.form=this.shadowRoot.firstElementChild}_updateValue(){const{firstElementChild:t}=this.shadowRoot,{firstElementChild:e}=t;this.value=e.value||t.value,this.dispatchEvent(new CustomEvent("form-input-value-change",{detail:{value:this.value},bubbles:!0,composed:!0}))}get _formAttachTpl(){return p` <bbva-form-attach
      ?autofocus=${this.autoFocus}
      input-type=${this.type}
      action-icon=${_(this.actionIcon)}
      action-icon-secondary=${_(this.actionIconSecondary)}
      label=${_(this.label)}
      label-out=${_(this.labelOut)}
      ?required=${this.required}
      help-icon=${_(this.helpIcon)}
      placeholder=${_(this.placeholder)}
      value=${_(this.value)}
      ?disabled=${this.disabled}
      ?readonly=${this.readonly}
      info-message=${_(this.infoMessage)}
      allowed-pattern=${_(this.allowedPattern)}
      ?auto-validate=${this.autoValidate}
      pattern=${_(this.pattern)}
      error-message=${_(this.errorMessage)}
      ?action-into-form=${this.actionIntoForm}
      action-variant=${_(this.actionVariant)}
      action-type=${_(this.actionType)}
      action-accessible-text=${_(this.actionAccessibleText)}
      action-secondary-accessible-text=${_(this.actionSecondaryAccessibleText)}
      ?validate-on-blur=${this.validateOnBlur}
      link-href=${_(this.linkHref)}
      optional-label=${_(this.optionalLabel)}
      icon-variant=${_(this.iconVariant)}
      ?invalid=${this.invalid}
    ></bbva-form-attach>`}get _formDateTpl(){return p` <bbva-form-date
      ?autofocus=${this.autoFocus}
      label=${_(this.label)}
      label-out=${_(this.labelOut)}
      ?required=${this.required}
      value=${_(this.value)}
      ?disabled=${this.disabled}
      help-icon=${_(this.helpIcon)}
      ?readonly=${this.readonly}
      info-message=${_(this.infoMessage)}
      ?validate-on-blur=${this.validateOnBlur}
      allowed-pattern=${_(this.allowedPattern)}
      ?auto-validate=${this.autoValidate}
      pattern=${_(this.pattern)}
      error-message=${_(this.errorMessage)}
      .min=${this.min}
      .max=${this.max}
      action-type=${_(this.actionType)}
      action-icon=${_(this.actionIcon)}
      action-icon-secondary=${_(this.actionIconSecondary)}
      action-accessible-text=${_(this.actionAccessibleText)}
      action-secondary-accessible-text=${_(this.actionSecondaryAccessibleText)}
      action-variant=${_(this.actionVariant)}
      ?action-into-form=${this.actionIntoForm}
      link-href=${_(this.linkHref)}
      optional-label=${_(this.optionalLabel)}
      icon-variant=${_(this.iconVariant)}
      ?invalid=${this.invalid}
    ></bbva-form-date>`}get _formTextTpl(){return p` <bbva-form-text
      ?autofocus=${this.autoFocus}
      inputmode="${_(this.inputmode)}"
      label=${_(this.label)}
      label-out=${_(this.labelOut)}
      ?required=${this.required}
      help-icon=${_(this.helpIcon)}
      .flag-label=${this.flagLabel}
      .flag=${this.flag}
      placeholder=${_(this.placeholder)}
      value=${_(this.value)}
      ?disabled=${this.disabled}
      ?readonly=${this.readonly}
      info-message=${_(this.infoMessage)}
      error-message=${_(this.errorMessage)}
      action-type=${_(this.actionType)}
      action-icon=${_(this.actionIcon)}
      maxlength=${_(this.maxlength)}
      minlength=${_(this.minlength)}
      action-icon-secondary=${_(this.actionIconSecondary)}
      action-accessible-text=${_(this.actionAccessibleText)}
      action-secondary-accessible-text=${_(this.actionSecondaryAccessibleText)}
      action-variant=${_(this.actionVariant)}
      ?action-into-form=${this.actionIntoForm}
      link-href=${_(this.linkHref)}
      optional-label=${_(this.optionalLabel)}
      icon-variant=${_(this.iconVariant)}
      ?validate-on-blur=${this.validateOnBlur}
      ?invalid=${this.invalid}
      pattern=${_(this.pattern)}
      ?auto-validate=${this.autoValidate}
      allowed-pattern=${_(this.allowedPattern)}
      aria-autocomplete="${this.inlineAutocomplete?"both":"list"}"
    ></bbva-form-text>`}get _formAmountTpl(){return p`<bbva-form-amount
      ?autofocus=${this.autoFocus}
      label=${this.label}
      label-out=${this.labelOut}
      ?required=${this.required}
      placeholder=${_(this.placeholder)}
      help-icon=${_(this.helpIcon)}
      amount=${_(this.amount)}
      ?readonly=${this.readonly}
      info-message=${_(this.infoMessage)}
      ?disabled=${this.disabled}
      currency-code=${_(this.currencyCode)}
      local-currency=${_(this.localCurrency)}
      language=${_(this.language)}
      ?symbol-right=${this.symbolRight}
      error-message=${_(this.errorMessage)}
      ?validate-on-blur=${this.validateOnBlur}
      .flag=${this.flag}
      .flag-label=${this.flagLabel}
      ?show-card=${this.showCard}
      card-status=${this.cardStatus}
      card-variant=${this.cardVariant}
      card-type=${_(this.cardType)}
      pay-compatibility=${this.payCompatibility}
      ?partner=${this.partner}
      partner-logo=${_(this.partnerLogo)}
      card-image=${_(this.cardImage)}
      action-type=${_(this.actionType)}
      action-icon=${_(this.actionIcon)}
      action-icon-secondary=${_(this.actionIconSecondary)}
      action-accessible-text=${_(this.actionAccessibleText)}
      action-secondary-accessible-text=${_(this.actionSecondaryAccessibleText)}
      action-variant=${_(this.actionVariant)}
      ?action-into-form=${this.actionIntoForm}
      link-href=${_(this.linkHref)}
      optional-label=${_(this.optionalLabel)}
      icon-variant=${_(this.iconVariant)}
      ?invalid=${this.invalid}
      pattern=${_(this.pattern)}
      ?auto-validate=${this.autoValidate}
      allowed-pattern=${_(this.allowedPattern)}
      decimal-digits=${_(this.decimalDigits)}
      ?decimals-hidden=${this.decimalsHidden}
      ?trailing-zero-decimals-hidden=${this.trailingZeroDecimalsHidden}
      ?zero-decimals-hidden=${this.zeroDecimalsHidden}
      group-char=${_(this.groupChar)}
      separator-char=${_(this.separatorChar)}
    ></bbva-form-amount> `}get _formNumberTpl(){return p`<bbva-form-number
      ?autofocus=${this.autoFocus}
      label=${this.label}
      label-out=${this.labelOut}
      ?required=${this.required}
      value=${_(this.value)}
      .flag=${this.flag}
      .flag-label=${this.flagLabel}
      placeholder=${_(this.placeholder)}
      ?disabled=${this.disabled}
      ?readonly=${this.readonly}
      help-icon=${_(this.helpIcon)}
      info-message=${_(this.infoMessage)}
      error-message=${_(this.errorMessage)}
      min=${this.min}
      max=${this.max}
      ?invalid=${this.invalid}
      action-type=${_(this.actionType)}
      action-icon=${_(this.actionIcon)}
      action-icon-secondary=${_(this.actionIconSecondary)}
      action-accessible-text=${_(this.actionAccessibleText)}
      action-secondary-accessible-text=${_(this.actionSecondaryAccessibleText)}
      action-variant=${_(this.actionVariant)}
      ?action-into-form=${this.actionIntoForm}
      link-href=${_(this.linkHref)}
      optional-label=${_(this.optionalLabel)}
      icon-variant=${_(this.iconVariant)}
      ?validate-on-blur=${this.validateOnBlur}
      pattern=${_(this.pattern)}
      ?auto-validate=${this.autoValidate}
      allowed-pattern=${_(this.allowedPattern)}
    ></bbva-form-number> `}get _formSearchTpl(){return p`<bbva-form-search
      ?autofocus=${this.autoFocus}
      label=${_(this.label)}
      label-out=${_(this.labelOut)}
      ?required=${this.required}
      value=${_(this.value)}
      .placeholder=${this.placeholder}
      ?readonly=${this.readonly}
      info-message=${_(this.infoMessage)}
      error-message=${_(this.errorMessage)}
      ?disabled-button=${this.disabledButton}
      help-icon=${_(this.helpIcon)}
      ?disabled=${this.disabled}
      allowed-pattern=${_(this.allowedPattern)}
      ?auto-validate=${this.autoValidate}
      pattern=${_(this.pattern)}
      variant=${_(this.variant)}
      icon-variant=${_(this.iconVariant)}
      ?invalid=${this.invalid}
      action-type=${_(this.actionType)}
      action-icon=${_(this.actionIcon)}
      action-icon-secondary=${_(this.actionIconSecondary)}
      action-accessible-text=${_(this.actionAccessibleText)}
      action-secondary-accessible-text=${_(this.actionSecondaryAccessibleText)}
      action-variant=${_(this.actionVariant)}
      ?action-into-form=${this.actionIntoForm}
      link-href=${_(this.linkHref)}
      optional-label=${_(this.optionalLabel)}
      ?validate-on-blur=${this.validateOnBlur}
      aria-autocomplete="${this.inlineAutocomplete?"both":"list"}"
    ></bbva-form-search> `}get _formPasswordTpl(){return p`<bbva-form-password
      ?autofocus=${this.autoFocus}
      label=${_(this.label)}
      label-out=${_(this.labelOut)}
      ?required=${this.required}
      value=${_(this.value)}
      ?readonly=${this.readonly}
      info-message=${_(this.infoMessage)}
      pattern=${_(this.pattern)}
      help-icon=${_(this.helpIcon)}
      allowed-pattern=${_(this.allowedPattern)}
      error-message=${_(this.errorMessage)}
      ?validate-on-blur=${this.validateOnBlur}
      ?auto-validate=${this.autoValidate}
      name=${_(this.name)}
      ?disabled=${this.disabled}
      ?invalid=${this.invalid}
      .min=${this.min}
      .max=${this.max}
      action-variant=${_(this.actionVariant)}
      toggle-icon=${_(this.toggleIcon)}
      toggle-visible-icon=${_(this.toggleVisibleIcon)}
      toggle-icon-size=${_(this.toggleIconSize)}
      toggle-accessible-text=${_(this.toggleAccessibleText)}
      toggle-visible-accessible-text=${_(this.toggleVisibleAccessibleText)}
      ?visible=${this.visible}
      action-type=${_(this.actionType)}
      action-icon=${_(this.actionIcon)}
      action-icon-secondary=${_(this.actionIconSecondary)}
      action-accessible-text=${_(this.actionAccessibleText)}
      action-secondary-accessible-text=${_(this.actionSecondaryAccessibleText)}
      ?action-into-form=${this.actionIntoForm}
      link-href=${_(this.linkHref)}
      optional-label=${_(this.optionalLabel)}
      icon-variant=${_(this.iconVariant)}
      ?hide-bottom-padding-info-message=${this.hideBottomPaddingInfoMessage}
      ><div slot="hints"><slot name="hint"></slot></div
    ></bbva-form-password> `}get _formTimeTpl(){return p` <bbva-form-time
      ?autofocus=${this.autoFocus}
      label=${_(this.label)}
      label-out=${_(this.labelOut)}
      ?required=${this.required}
      value=${_(this.value)}
      ?readonly=${this.readonly}
      info-message=${_(this.infoMessage)}
      error-message=${_(this.errorMessage)}
      help-icon=${_(this.helpIcon)}
      pattern=${_(this.pattern)}
      ?auto-validate=${this.autoValidate}
      ?validate-on-blur=${this.validateOnBlur}
      .min=${this.min}
      .max=${this.max}
      ?disabled=${this.disabled}
      ?invalid=${this.invalid}
      action-type=${_(this.actionType)}
      action-icon=${_(this.actionIcon)}
      action-icon-secondary=${_(this.actionIconSecondary)}
      action-accessible-text=${_(this.actionAccessibleText)}
      action-secondary-accessible-text=${_(this.actionSecondaryAccessibleText)}
      action-variant=${_(this.actionVariant)}
      ?action-into-form=${this.actionIntoForm}
      link-href=${_(this.linkHref)}
      optional-label=${_(this.optionalLabel)}
      icon-variant=${_(this.iconVariant)}
    ></bbva-form-time>`}get _formTextareaTpl(){return p` <bbva-form-textarea
      label=${this.label}
      label-out=${this.labelOut}
      ?required=${this.required}
      value=${_(this.value)}
      ?readonly=${this.readonly}
      info-message=${_(this.infoMessage)}
      ?disabled=${this.disabled}
      maxlength=${_(this.maxlength)}
      minlength=${_(this.minlength)}
      ?auto-validate=${this.autoValidate}
      error-message=${_(this.errorMessage)}
      ?autofocus=${this.autoFocus}
      ?invalid=${this.invalid}
      help-icon=${_(this.helpIcon)}
      ?validate-on-blur=${this.validateOnBlur}
      character-counter-label=${_(this.characterCounterLabel)}
      pattern=${_(this.pattern)}
      allowed-pattern=${_(this.allowedPattern)}
    ></bbva-form-textarea>`}_inputTpl(t){return{text:this._formTextTpl,camera:this._formAttachTpl,contact:this._formAttachTpl,amount:this._formAmountTpl,date:this._formDateTpl,number:this._formNumberTpl,search:this._formSearchTpl,time:this._formTimeTpl,password:this._formPasswordTpl,textarea:this._formTextareaTpl}[t]}_onSlotsChange(t){const{slotName:e,contentSlots:o}=t.detail;"hint"===e&&(this._hasHints=Boolean(o.length),this.hideBottomPaddingInfoMessage=this._hasHints)}render(){return p` ${this._inputTpl(this.type)} `}}class ja{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(t,e){if(null===this)throw new TypeError('"this" is null or not defined');let o=Object(this),i=o.length>>>0;if(0===i)return!1;let a=0|e,r=Math.max(a>=0?a:i-Math.abs(a),0);for(;r<i;){if((s=o[r])===(n=t)||"number"==typeof s&&"number"==typeof n&&isNaN(s)&&isNaN(n))return!0;r++}var s,n;return!1}}),String.fromCodePoint||function(t){var e=function(e){for(var o=[],i=0,a="",r=0,s=arguments.length;r!==s;++r){var n=+arguments[r];if(!(n<1114111&&n>>>0===n))throw RangeError("Invalid code point: "+n);n<=65535?i=o.push(n):(n-=65536,i=o.push(55296+(n>>10),n%1024+56320)),i>=16383&&(a+=t.apply(null,o),o.length=0)}return a+t.apply(null,o)};try{Object.defineProperty(String,"fromCodePoint",{value:e,configurable:!0,writable:!0})}catch(t){String.fromCodePoint=e}}(String.fromCharCode)}_error(t=0,e="",o=null){throw t=`0000${t=t.toString()}`.substr(t.length),Error(`BGADP_ERROR_${t} :: ${e} :: ${o&&o.message}`)}}class Ga extends ja{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(t="",e=""){if("string"==typeof t&&t)if(this._reservedKeys.includes(t))this._error(2,`"${t}" should NOT be a reserved key`);else{if("string"!=typeof e)try{e=JSON.stringify(e)}catch(t){this._error(1,`"${e}" couldn't be transformed into String`)}e=e.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[t]=e}else this._error(3,"Missing {item} parameter")}getItem(t=""){return this._items[t]?this._items[t]:null}removeItem(t=""){this._items.hasOwnProperty(t)&&delete this._items[t]}clear(){Object.keys(this._items).length&&(this._items={})}}const Ua=0,Wa=1,Ya="jwt",Ka="tsec",Xa="none";class Ja extends ja{constructor(t=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=Ua,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(t),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let t={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(t).forEach((e=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!1,value:t[e],writable:"_headers"!==e})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new Ga,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this)}_assignConfigValues(t=null){null!=t&&"object"==typeof t&&Object.keys(t).forEach((e=>{if(this.hasOwnProperty(e)&&"_"!==e.charAt(0)&&"function"!=typeof this[e])if("object"==typeof this[e])Array.isArray(t[e])?this[e]=Array.from(t[e]):null===this[e]?this[e]=t[e]:this[e]=Object.assign(this[e]||{},t[e]);else this[e]=t[e];else"signatureRequiredErrors"===e?this._ERROR_CODES.SIGNATURE_REQUIRED=t[e]:"signatureInvalidErrors"===e?this._ERROR_CODES.SIGNATURE_INVALID=t[e]:"signatureFirstErrorCode"===e?this._ERROR_CODES.SIGNATURE_FIRST_STEP=t[e]:"pendingProcessResponseErrors"===e?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=t[e]:"signatureInvalidStatus"===e?this._STATUS_CODES.SIGNATURE_INVALID=t[e]:"pendingProcessResponseStatus"==e?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=t[e]:"getTokenHandlerKey"===e?this.getTokenHandlerKey=t[e]:("function"==typeof this[e]&&this._error(1,`${e} is a class method, can't be override`),"_"===e.charAt(0)&&this._error(2,`"${e}" is a restricted property, can't be override`),this.hasOwnProperty(e)||this._error(3,`"${e}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=Ka:this.requiredToken=Xa,this.requiresJWT=!1):this.requiredToken===Ka?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===Ya?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===Xa?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(Ka)}_setJwtHandler(){this._setTokenHandler(Ya)}_setTokenHandler(t){const e=`${t}Handler`;this[e]=this[e]||window.sessionStorage;try{this[e].setItem("test","test"),this[e].removeItem("test")}catch(t){this._error(4,`Invalid [${e}]. If not specified, default window.sessionStorage can't be written/read`,t)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(t=""){t&&"string"==typeof t?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:t,writable:!1}):this._error(6,"[path] is required")}_buildPromise(t=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let e={isPending:!0};e.promise=new window.Promise(((o,i)=>{e=Object.assign(e,{resolve:o,reject:i}),this._buildRequest(t)})),this._promise=Object.assign({},e)}return this._promise.promise}_defaultXHR(t=""){let e=new window.XMLHttpRequest;if(e instanceof window.XMLHttpRequest){e.withCredentials=this.withCredentials,e.timeout=1e3*this.timeout,e.onreadystatechange=this._onReadyStateChange.bind(this),e.responseType=this.responseType,e.open(this.method.toUpperCase(),t);let o=this._getRequestHeaders();Object.keys(o).forEach((t=>{this.forceBoundary&&this.multipart&&"Content-Type"===t||e.setRequestHeader(t,o[t])})),e.send(this._buildBody())}return e}_nativeXHR(t=""){let e=this._buildNativeRequest();return e?(e=e[this.method.toLowerCase()],"function"==typeof e?e=e({url:t,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),e}_buildNativeRequest(){let t=null;return!!window.CellsNativePlugins&&(t=R),t}_buildRequest(t=!1){let e=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const t={url:e,path:this._path,method:this.method};this._emitRequestEvent("start",t)}if(!t&&this._cacheItem&&e===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!t&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:e,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(e);break;case this._NATIVE_XHR:this._request=this._nativeXHR(e)}return this._request}_buildURL(){let t=[this.host,this._path].join("/");if(null!==this.params){let e=Object.assign({},this.params);-1!==t.lastIndexOf("{")&&(t=t.replace(/(\{[\w\-]+\})/g,(t=>{let o=t.replace(/[\{\}]+/g,""),i=e[o];return i?delete e[o]:this._error(9,`Missing ${o} param value`),i})),-1!==t.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let o=Object.keys(e);o.length&&(t=[t,o.map((t=>{let o=e[t];return Array.isArray(o)&&this.paramArrayMode===Wa?this._arrayToQueryParam(t,o):`${t}=${o}`})).join("&")].join("?"))}return t}_arrayToQueryParam(t,e){return e.map((e=>`${t}=${e}`)).join("&")}_getRequestHeaders(){let t=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(t=this._getTokenForRequestHeaders(Ka,t)),!0===this.requiresJWT&&(t=this._getTokenForRequestHeaders(Ya,t)),!0===this.semaasMonitoring){let e=this._getSemaasHeaders();Object.assign(t,e)}const e=this._getCustomHeaders();return Object.assign(t,e),t}_getSemaasHeaders(){var t={};if(window.sessionStorage){var e=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(o){var i=e.getItem(o);i&&"null"!==i&&(t[o]=i)}))}return t}_getCustomHeaders(){const t="x-bgadp-";let e={};if(window.sessionStorage){const o=window.sessionStorage;e=Object.keys(o).filter((e=>e.startsWith(t))).reduce(((e,i)=>(e[i.replace(t,"")]=o.getItem(i),e)),{})}return e}_getTokenForRequestHeaders(t,e){const o=`${t}Handler`,i=t===Ya?"JWT ":"",a=t===Ya?"Authorization":Ka;if(void 0===this[o]||null===this[o])this._error(11,`${t} handler is undefined`);else{const r=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):t;let s=this[o].getItem(r);s?e[a]=e[a]||i+s:this._error(12,`Missing '${t}' value`)}return e}_buildBody(){let t=this.body;if(t&&this._xhrType===this._DEFAULT_XHR){let e=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===e){let e=[];Object.keys(t).forEach((o=>{e.push(`${o}=${t[o]}`)})),t=e.join("&")}else this.headers&&-1!==e.indexOf("multipart/")||(t=JSON.stringify(t))}return t}_onReadyStateChange(){let t=this._request;if(t&&t.readyState===window.XMLHttpRequest.DONE)switch(t.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(t);break;default:this._onRequestFail(t)}}_extractRequestResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)e={result:e};else if(e&&e instanceof ArrayBuffer)try{const t=this._decode(e);try{e=JSON.parse(t)}catch(o){e={result:t,originalResponse:e}}}catch(t){e=null}else if(e&&"string"==typeof e)try{e=JSON.parse(e)}catch(t){e=null}return e}async _extractRequestErrorResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)try{const t=await this._blobDecode(e);try{e=JSON.parse(t)}catch(o){e={result:t,originalResponse:e}}}catch(t){e=null}else e=this._extractRequestResponse(t);return e}_blobDecode(t){const e=new FileReader;let o;const i=new Promise(((t,e)=>{o=(o,i)=>{o?e(o):t(i)}}));return e.addEventListener("loadend",(function t(i){e.removeEventListener("loadend",t),i.error?o(i.error):o(null,e.result)})),e.readAsText(t),i}_decode(t){let e;if("function"==typeof TextDecoder){e=new TextDecoder("utf-8").decode(t)}else{let o=0;for(;o<t.length;){let i=t[o],a=0,r=0;if(i<=127?(a=0,r=255&i):i<=223?(a=1,r=31&i):i<=239?(a=2,r=15&i):i<=244&&(a=3,r=7&i),t.length-o-a>0){let e=0;for(;e<a;)i=t[o+e+1],r=r<<6|63&i,e+=1}else r=65533,a=t.length-o;e+=String.fromCodePoint(r),o+=a+1}}return e}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let t=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(t=window.btoa(t)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,t);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,t);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,t);case this._CACHE_NONE:}}catch(t){this._error(13,`Can't write into cache engine: ${t.message}`,t)}}_retrieveFromCache(){let t;try{switch(this._cache){case this._CACHE_MEMORY:t=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:t=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:t=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(t){this._error(14,"Can't read from cache engine",t)}return t&&(this.encodeCache&&(t=window.atob(t)),"string"==typeof t&&/[\{\[]/.test(t.charAt(0))&&(t=JSON.parse(t))),t}_setLastResponse(t=null){t&&(this._lastResponse=Object.assign({},t))}_setLastResponseHeaders(t=null){let e={};t&&(t instanceof window.XMLHttpRequest?e=this._parseResponseHeadersToObject(t.getAllResponseHeaders()):t.headers&&(e=JSON.parse(t.headers))),this._lastResponseHeaders=e}_parseResponseHeadersToObject(t){let e={},o=t.trim().split(/[\r\n]+/);for(const t in o)if(o.hasOwnProperty(t)&&""!==o[t]){let i=": ",a=o[t].split(i);e[a.shift().toLowerCase()]=a.join(i)}return e}_onRequestSuccess(t=null){this._setLastResponse(this._extractRequestResponse(t)),this._setLastResponseHeaders(t),this.jwtHandler&&this._storeToken(this.jwtHandler,t,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,t,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",t)}_storeToken(t,e,o,i){let a=null;switch(this._xhrType){case this._DEFAULT_XHR:e&&e.getAllResponseHeaders&&e.getResponseHeader&&e.getAllResponseHeaders().indexOf(i)>=0&&(a=e.getResponseHeader(i));break;case this._NATIVE_XHR:e&&e.headers&&(a=JSON.parse(e.headers)[i])}if(a){const e=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):o;t.getItem(e)!==a&&(t.setItem(e,a),this._emitTokenUpdate(o,a))}}_emitTokenUpdate(t,e){if(this.htmlContext){const o=new CustomEvent("token-update",{bubbles:!0,detail:{type:t,token:e}});this.htmlContext.dispatchEvent(o)}}_emitRequestEvent(t,e){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${t}`,{bubbles:!0,composed:!0,detail:{metadata:e}})):console.warn(`Missing htmlContext to dispatch event http-request-${t}`)}_onRequestFail(t=null){(async()=>{if(!this._isSignatureRequired(t)&&!this._isWaitingForProcessResponse(t)){let e=await this._extractRequestErrorResponse(t);this._setLastResponse(e),this._setLastResponseHeaders(t),this._onRequestEnd("reject",t)}})()}_onRequestEnd(t="resolve",e=null){if(this._resetDPState(),this.emitRequestEvents){const t={method:this.method,path:this._path};null!==e&&(t.status=e.status,t.url=e.responseURL),this._emitRequestEvent("end",t)}this._promise&&"function"==typeof this._promise[t]&&(this._promise.isPending=!1,this._promise[t](e))}_resetDPState(){["Data","Type","State"].forEach((t=>{let e=`Authentication${t}`;this._headers&&this._headers.hasOwnProperty(e)&&delete this._headers[e],this.headers&&this.headers.hasOwnProperty(e)&&delete this.headers[e]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(t=null){let e,o,i,a,r;if(t instanceof window.XMLHttpRequest)e=t.getResponseHeader("AuthenticationType"),o=t.getResponseHeader("AuthenticationData"),i=t.getResponseHeader("AuthenticationState"),a=t.getResponseHeader("AuthenticationChallenge"),r=t.getResponseHeader("AuthenticationResponse");else{let s=JSON.parse(t.headers);e=s.authenticationtype,o=s.authenticationdata||null,i=s.authenticationstate,a=s.authenticationchallenge,r=s.authenticationresponse}return{type:e,data:o,state:i,challenge:a,response:r}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureTypeChange(t,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureValueChange(t,...arguments)}})}_onSignatureTypeChange(t="",e="",o=""){if("string"==typeof t&&""!==t)if(e.includes(t)){if("string"==typeof t&&""!==t){const i=this._getSignatureData(t,e,o);this.headers=Object.assign(this.headers||{},{AuthenticationType:t,AuthenticationData:i}),this._buildRequest()}}else this._error(15,`${t} is not a valid signature type`);"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(t=null,e="",o="",i=""){let a;if("object"==typeof t&&t){const r=this._getSignatureData(t.signatureType,e,o);a=this._makeKeyValuePairFromObject(r,t.signatureValue),t.challenge&&(a+=`,challenge=${t.challenge}`),this._buildSignatureHeaders(a,t.signatureType,i)}else"string"==typeof t&&""!==t&&(this._hasSignatureAuthenticationType(e,"2")?(a=`password=${t}`,this._buildSignatureHeaders(a,"2",i)):(a=`${o}=${t}`,this._buildSignatureHeaders(a,e,i)));"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(t="",e=""){if(!t)return"";let o,i=t.split(",");if(i.length>1){o=i.map((t=>`${t}=${e[t]}`)).join(",")}else o=`${t}=${e}`;return o}_hasSignatureAuthenticationType(t,e){return-1!==t.split(";").findIndex((t=>t===e))}_buildSignatureHeaders(t="",e="",o=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:t,AuthenticationType:e||""}),o&&(this.headers=Object.assign(this.headers,{AuthenticationState:o})),this._buildRequest()}_isSignatureRequired(t=null){const e=Number((t||{}).status);let o=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(e)){const e=this._extractRequestResponse(t),i=this._extractResponseErrorCode(e),a=this._ERROR_CODES.SIGNATURE_INVALID.includes(i),{type:r,data:s,state:n,challenge:l,response:c}=this._extractSignatureResponseHeaders(t),d=this._getRequestMetadata(t);if(a)this._notifySignatureInvalid(d),o=!0;else if(r)if(e){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(i)?(this._notifySignatureTypeUsingErrorCode(i,d,r,s,n,l,c),o=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(d,r,s,n,l,c),o=!0}return o}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(t=null){const e=Number((t||{}).status);let o=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(e)){const e=this._extractRequestResponse(t),i=this._extractResponseErrorCode(e),a=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(i),r=this._getRequestMetadata(t);a&&(this._notifyWaitingForProcessResponse(r),o=!0)}return o}_notifySignatureRequiredFirstStep(t,e,o,i){this._defineSignatureType(e,o),this._defineSignatureValue(e,o,i),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:e,data:o,metadata:t}}))}_notifySignatureRequired(t,e,o,i,a,r){this._defineSignatureValue(e,o,i);const s={type:e,data:o,challenge:a,metadata:t};r&&(s.response=r),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:s}))}_notifySignatureInvalid(t){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:t}}))}_notifyWaitingForProcessResponse(t){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:t}}))}_getRequestMetadata(t){const{responseURL:e,status:o}=t;return{path:this._path,method:this.method,url:e,status:o}}_emitEvent(t){this.htmlContext?this.htmlContext.dispatchEvent(t):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(t="",e="",o=""){const i=e.split(";").findIndex((e=>e===t));return o?o.split(";")[i]:""}toString(t=""){return`[object ${t||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(t=!1){return this._buildPromise(t)}_extractResponseErrorCode(t){return t?t["error-code"]||t.messages&&t.messages[0].code:null}_notifySignatureTypeUsingHeaders(t,e,o,i,a,r){i?this._notifySignatureRequired(t,e,o,i,a,r):this._notifySignatureRequiredFirstStep(t,e,o,i)}_notifySignatureTypeUsingErrorCode(t,e,o,i,a,r,s){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(t)?this._notifySignatureRequiredFirstStep(e,o,i,a):this._notifySignatureRequired(e,o,i,a,r,s)}}class Qa extends Ja{constructor(t=null){super(Object.assign(t||{},{method:"GET"}))}toString(t=""){return super.toString(t||"BGADPRequestGET")}}class Za extends Ja{constructor(t=null){super(Object.assign(t||{},{method:"PATCH"}))}toString(t=""){return super.toString(t||"BGADPRequestPATCH")}}class tr extends Ja{constructor(t=null){super(Object.assign(t||{},{method:"POST"}))}toString(t=""){return super.toString(t||"BGADPRequestPOST")}}class er extends Qa{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/economic-data`)}toString(){return super.toString("BGADPCustomersCustomerEconomicDataGetV0")}}class or extends Qa{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`customers/v${this.version}/civil-registries`)}toString(){return super.toString("BGADPCustomersCivilRegistriesGetV1")}}class ir extends tr{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`customers/v${this.version}/civil-registries/search`)}toString(){return super.toString("BGADPCustomersCivilRegistriesSearchPostV1")}}class ar extends Qa{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/identification-process/documents`)}toString(){return super.toString("BGADPCustomersCustomerIdentificationProcessDocumentsGetV1")}}class rr extends tr{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/identification-process/documents`)}toString(){return super.toString("BGADPCustomersCustomerIdentificationProcessDocumentsPostV1")}}class sr extends Qa{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/indicators`)}toString(){return super.toString("BGADPCustomersCustomerIndicatorsGetV1")}}class nr extends Qa{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/terms`)}toString(){return super.toString("BGADPCustomersCustomerTermsGetV1")}}class lr extends tr{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/terms`)}toString(){return super.toString("BGADPCustomersCustomerTermsPostV1")}}class cr extends Qa{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/terms/{term-id}`)}toString(){return super.toString("BGADPCustomersCustomerTermsTermGetV1")}}class dr extends Za{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/terms/{term-id}`)}toString(){return super.toString("BGADPCustomersCustomerTermsTermPatchV1")}}class mr extends(O(e)){_mappingBank(t){this._renameProperty(t,"bank.bankId","id"),this._renameProperty(t,"bank.branch.branchId","id"),t.bank&&t.bank.branch&&t.bank.branch.costCenter&&(t.bank.branch.costCenter={id:t.bank.branch.costCenter})}_mappingGender(t){this._renameProperty(t,"gender.name","description")}_mappingIdentityDocuments(t){for(let e=0;e<t.identityDocuments.length;e++)this._renameProperty(t.identityDocuments[e],"documentType.name","description"),this._renameProperty(t.identityDocuments[e],"status.name","description")}_mappingMaritalStatus(t){this._renameProperty(t,"maritalStatus.name","description")}_mappingNationalities(t){for(let e=0;e<t.nationalities.length;e++)this._renameProperty(t.nationalities[e],"name","description")}_mappingPersonalTitle(t){this._renameProperty(t,"personalTitle.name","description")}_mappingResidence(t){this._renameProperty(t,"residence","taxResidence"),this._renameProperty(t,"taxResidence.residenceType.name","description")}_mappingVerification(t){this._renameProperty(t,"enrollmentModality","verification"),this._renameProperty(t,"verification.enrollmentMethod","identificationMethod")}_mappingSegments(t){for(let e=0;e<t.segments.length;e++)this._renameProperty(t.segments[e],"name","description")}_changeNameToDescription(t){t.map((t=>{this._renameProperty(t,"name","description")}))}}class pr extends mr{static get is(){return"bbva-global-customer-term-api-dm"}static get properties(){return{customerTerm:{type:Object,attribute:!1}}}constructor(){super(),this.customerTerm={}}resetCustomerTerm(){this.customerTerm={}}getCustomerTerm(t,e,o={}){if(Object.keys(this.customerTerm).length)return;o=Object.assign({"customer-id":t,"term-id":e},o),this._generateGetService(this._getService("get",{},o),{customEvent:"customer-term-api-dm-fetch",errorFireEventHandler:"customer-term-api-dm-fetch-error"},this._responseMapping,o.fields)}patchCustomerTerm(t,e,o){const i={"customer-id":t,"term-id":e};this._generateGetService(this._getService("patch",o,i),{customEvent:"customer-term-api-dm-update",errorFireEventHandler:"customer-term-api-dm-update-error"},this._responseMapping),this.resetCustomerTerm()}_getService(t,e={},o={}){const i=this._getServiceParams(o,e);return this._getServicePath(`${t}CustomerTerm`,this._getBgadp(i))}_getBgadp(t){return{getCustomerTermV1:()=>new cr(t),patchCustomerTermV1:()=>new dr(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}}class ur extends mr{static get is(){return"bbva-global-customer-terms-base-api-dm"}resetCustomerTerms(){this.customerTerms=[]}getCustomerTerms(t,e){e=Object.assign({"customer-id":t},e),this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields,this._paginationMapping)}postCustomerTerms(t,e){this._requestMapping(e);const o={"customer-id":t};this._generateGetService(this._getService("post",e,o),this.constructor.POST_EVENTS,this._responseMapping),this.resetCustomerTerms()}_getService(t,e={},o={}){const i=this._getServiceParams(o,e);return this._getServicePath(`${t}CustomerTerms`,this._getBgadp(i))}_getBgadp(t){return{getCustomerTermsV1:()=>new nr(t),postCustomerTermsV1:()=>new lr(t),default:()=>"BGADP does not exist."}}_requestMapping(t){return t}_responseMapping(t){return t}_paginationMapping(t){return t}}L(ur,"GET_EVENTS",{customEvent:"customer-terms-api-dm-fetch",paginationEvent:"customer-terms-api-dm-pagination",errorFireEventHandler:"customer-terms-api-dm-fetch-error"}),L(ur,"POST_EVENTS",{customEvent:"customer-terms-api-dm-create",errorFireEventHandler:"customer-terms-api-dm-create-error"}),customElements.define(ur.is,ur);class hr extends mr{static get is(){return"bbva-global-customer-terms-api-dm"}static get properties(){return{customerTerms:{type:Array,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.customerTerms=[],this.country="",this.localCustomProperties={},this._countries=[],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties","customerTerms"],this._loaded=!1,this._requestParams={}}update(t){super.update(t),t.forEach(((t,e)=>{"country"===e&&this.country&&this.country!==t?this._loadModule():"_module"!==e&&"_requestParams"!==e&&"_loaded"!==e&&this._module&&this[e]!==t?this._module[e]=this[e]:("_requestParams"===e&&this._requestParams&&this._requestParams!==t&&void 0!==t&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===e&&this._loaded)&&Object.entries(this._requestParams).forEach((([t])=>{this[`_${t}CustomerTerms`]()}))}))}async _loadModule(){const t=this._capitalize(this.country);if(this._countries.includes(t)&&this._modules[t]){const e=`BbvaCustomerTerms${t}ApiDm`;(0,this._modules[t])().then((async t=>{const o=t[e].is;this._module=this._createModuleElement(o),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-customer-terms-api-dm-module-load")})).catch((async t=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-customer-terms-api-dm-module-error",t)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(t){return t.charAt(0).toUpperCase()+t.slice(1).toLowerCase()}_createModuleElement(t=ur.is){const e=document.createElement(t);return this._bindConfig(e),e}async _bindConfig(t){this._configProperties.forEach((e=>{t[e]=this[e]})),await this.updateComplete}_dispatchEvent(t,e=!0){this.dispatchEvent(new CustomEvent(t,{detail:e,bubbles:!0,composed:!0}))}async resetCustomerTerms(){await this.module.updateComplete,this.module.resetCustomerTerms()}async getCustomerTerms(t,e={}){await this.module.updateComplete,this._requestParams.get?this._requestParams.get.push({customerId:t,params:e}):this._requestParams={get:[{customerId:t,params:e}]}}async _getCustomerTerms(){await this.module.updateComplete,Object.keys(this.customerTerms).length||(this._requestParams.get.forEach((t=>{this.module.getCustomerTerms(t.customerId,t.params)})),delete this._requestParams.get)}async postCustomerTerms(t,e){await this.module.updateComplete,this._requestParams.post?this._requestParams.post.push({customerId:t,body:e}):this._requestParams={post:[{customerId:t,body:e}]}}async _postCustomerTerms(){await this.module.updateComplete,this._requestParams.post.forEach((t=>{this.module.postCustomerTerms(t.customerId,t.body)})),delete this._requestParams.post}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return p` ${this._module?this._module:""}`}}class br extends mr{static get is(){return"bbva-global-customer-lopd-documents-base-api-dm"}resetCustomerLopdDocuments(){this.customerLopdDocuments={}}getCustomerLopdDocuments(t,e){e=Object.assign({"customer-id":t},e),this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields)}_getService(t,e={},o={}){const i=this._getServiceParams(o,e);return this._getServicePath(`${t}CustomerLopdDocuments`,this._getBgadp(i))}_getBgadp(t){return{getCustomerLopdDocumentsV3:()=>new ho(t),default:()=>"BGADP does not exist."}}_responseMapping(t){return t}}L(br,"GET_EVENTS",{customEvent:"customer-lopd-documents-api-dm-fetch",errorFireEventHandler:"customer-lopd-documents-api-dm-fetch-error"}),customElements.define(br.is,br);class vr extends mr{static get is(){return"bbva-global-customer-economic-data-base-api-dm"}resetCustomerEconomicData(){this.customerEconomicData={}}getCustomerEconomicData(t,e){e=Object.assign({"customer-id":t},e),this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields)}_getService(t,e={},o={}){const i=this._getServiceParams(o,e);return this._getServicePath(`${t}CustomerEconomicData`,this._getBgadp(i))}_getBgadp(t){return{getCustomerEconomicDataV0:()=>new er(t),getCustomerEconomicDataV2:()=>new Ko(t),getCustomerEconomicDataV3:()=>new Xo(t),default:()=>"BGADP does not exist."}}_incomesMapping(t){t.map((t=>{t.incomeValue={},t.incomeValue={valueType:"EXACT",amount:{amount:t.incomeValues[0].amount,currency:t.incomeValues[0].currency}},t.incomeValues[0].concept&&(t.incomeValue.concept=t.incomeValues[0].concept),t.incomeValues[0].frecuency&&(t.incomeValue.frequency=t.incomeValues[0].frecuency),"BIWEEKLY"==t.incomeValue.frequency&&(t.incomeValue.frequency="BI_WEEKLY"),this._removeFields(["incomeValues"],t),this._changeNameToDescription([t.incomeType])}))}_expensesMapping(t){t.map((t=>{t.expenseValue={currency:t.expenseValues[0].currency,amount:t.expenseValues[0].amount},t.expenseValues[0].frecuency&&(t.expenseValue.frequency=t.expenseValues[0].frecuency),t.expenseValue.frequency&&"BIWEEKLY"==t.expenseValue.frequency&&(t.expenseValue.frequency="BI_WEEKLY"),this._removeFields(["expenseValues"],t),this._changeNameToDescription([t.expenseType])}))}_workPlaceMapping(t){t.address&&(t.address.addressType&&"WORK"!==t.address.addressType.id&&this._removeFields(["id"],t.address.addressType),t.address.ownershipType&&(["MOVED","REJECTED","NOT_LOCATED"].includes(t.address.ownershipType.id)&&this._removeFields(["id"],t.address.ownershipType),this._changeNameToDescription([t.address.ownershipType,t.address.ownershipType.propertyType])),this._renameProperty(t.address.location,"addressName","formatedAddress"),this._removeFields(["residenceStartDate"],t.address),this._removeFields(["city","state","country","zipCode","geolocation","geographicGroups","meta"],t.address.location)),this._changeNameToDescription([t.address.addressType,t.economicActivity,t.profesionPosition]),this._renameProperty(t,"profesionPosition","professionPosition"),this._removeFields(["taxpayerIdentification"],t)}_assetsMapping(t){t.map((t=>{this._changeNameToDescription([t.assetType]),t.assetValues.map((t=>{this._removeFields(["concept"],t)}))}))}_liabilitiesMapping(t){t.map((t=>{this._changeNameToDescription([t.liabilityType]),t.liabilityValues.map((t=>{this._removeFields(["concept","frecuency"],t)}))}))}_responseMapping(t){return"0"==this.version&&Object.keys(t).length?(this._changeNameToDescription([t.economicActivity,t.occupationType,t.employmentSituation,t.education]),t.incomes&&this._incomesMapping(t.incomes),t.expenses&&this._expensesMapping(t.expenses),t.workPlace&&this._workPlaceMapping(t.workPlace),t.assets&&this._assetsMapping(t.assets),t.liabilities&&this._liabilitiesMapping(t.liabilities),t.balances&&t.balances.map((t=>{this._changeNameToDescription([t])})),this._renameProperty(t,"workPlace","workplace"),this._removeFields(["financialGroup","financialSubGroup","indicators","incomeSources"],t)):"2"==this.version&&Object.keys(t).length&&(t.workPlace&&t.workPlace.economicActivities&&(t.workPlace.economicActivity=t.workPlace.economicActivities[0],this._removeFields(["economicActivities"],t.workPlace)),t.balances&&t.balances.forEach((t=>{t.id=t.balanceType.id,t.description=t.balanceType.description,t.amount=t.balanceValue.amount,t.currency=t.balanceValue.currency,this._removeFields(["balanceType","balanceValue"],t)})),t.expenses&&t.expenses.forEach((t=>{["OTHER_LOAN","REVOLVING_CARD","FIXED_PAYMENT"].includes(t.expenseType.id)&&this._removeFields(["expenseType"],t)})),t.assets&&t.assets.forEach((t=>{["BANK_DEPOSIT"].includes(t.assetType.id)&&this._removeFields(["assetType"],t)})),t.liabilities&&t.liabilities.forEach((t=>{["MORTGAGE","PERSONAL_LOANS","OTHER_LOANS"].includes(t.liabilityType.id)&&this._removeFields(["liabilityType"],t)})),this._renameProperty(t,"workPlace","workplace"),this._removeFields(["financialSummaries"],t)),t}}L(vr,"GET_EVENTS",{customEvent:"customer-economic-data-api-dm-fetch",errorFireEventHandler:"customer-economic-data-api-dm-fetch-error"}),customElements.define(vr.is,vr);class gr extends mr{static get is(){return"bbva-global-civil-registries-search-base-api-dm"}resetCivilRegistriesSearch(){this.civilRegistriesSearch=[]}postCivilRegistriesSearch(t){this._generateGetService(this._getService("post",t),this.constructor.POST_EVENTS,this._responseMapping)}_getService(t,e={},o={}){const i=this._getServiceParams(o,e);return this._getServicePath(`${t}CivilRegistriesSearch`,this._getBgadp(i))}_getBgadp(t){return{postCivilRegistriesSearchV1:()=>new ir(t),default:()=>"BGADP does not exist."}}_responseMapping(t){return t}}L(gr,"POST_EVENTS",{customEvent:"civil-registries-search-api-dm-fetch",errorFireEventHandler:"civil-registries-search-api-dm-fetch-error"}),customElements.define(gr.is,gr);class yr extends mr{static get is(){return"bbva-global-civil-registries-base-api-dm"}resetCivilRegistries(){this.civilRegistries=[]}getCivilRegistries(t){this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields,this._paginationMapping)}_getService(t,e={},o={}){const i=this._getServiceParams(o,e);return this._getServicePath(`${t}CivilRegistries`,this._getBgadp(i))}_getBgadp(t){return{getCivilRegistriesV1:()=>new or(t),default:()=>"BGADP does not exist."}}_responseMapping(t){return t}_paginationMapping(t){return t}}L(yr,"GET_EVENTS",{customEvent:"civil-registries-api-dm-fetch",paginationEvent:"civil-registries-api-dm-pagination",errorFireEventHandler:"civil-registries-api-dm-fetch-error"}),customElements.define(yr.is,yr);class fr extends mr{static get is(){return"bbva-global-customers-child-customers-base-api-dm"}postCustomersChildCustomers(t){this._generateGetService(this._getService("post",t),this.constructor.POST_EVENTS,this._responseMapping)}_getService(t,e={},o={}){const i=this._getServiceParams(o,e);return this._getServicePath(`${t}CustomersChildCustomers`,this._getBgadp(i))}_getBgadp(t){return{postCustomersChildCustomersV3:()=>new Qo(t),default:()=>"BGADP does not exist."}}_responseMapping(t){return t}}L(fr,"POST_EVENTS",{customEvent:"customers-child-customers-api-dm-create",errorFireEventHandler:"customers-child-customers-api-dm-create-error"}),customElements.define(fr.is,fr);class _r extends mr{static get is(){return"bbva-global-customer-identification-process-documents-base-api-dm"}resetCustomerIdentificationProcessDocuments(){this.customerIdentificationProcessDocuments=[]}getCustomerIdentificationProcessDocuments(t,e){e=Object.assign({"customer-id":t},e),this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields)}postCustomerIdentificationProcessDocuments(t,e){const o={"customer-id":t};this._generateGetService(this._getService("post",e,o),this.constructor.POST_EVENTS,this._responseMapping),this.resetCustomerIdentificationProcessDocuments()}_getService(t,e={},o={}){const i=this._getServiceParams(o,e);return this._getServicePath(`${t}CustomerIdentificationProcessDocuments`,this._getBgadp(i))}_getBgadp(t){return{getCustomerIdentificationProcessDocumentsV1:()=>new ar(t),postCustomerIdentificationProcessDocumentsV1:()=>new rr(t),default:()=>"BGADP does not exist."}}_responseMapping(t){return t}}L(_r,"GET_EVENTS",{customEvent:"customer-identification-process-documents-api-dm-fetch",errorFireEventHandler:"customer-identification-process-documents-api-dm-fetch-error"}),L(_r,"POST_EVENTS",{customEvent:"customer-identification-process-documents-api-dm-create",errorFireEventHandler:"customer-identification-process-documents-api-dm-create-error"}),customElements.define(_r.is,_r);class $r extends mr{static get is(){return"bbva-global-customer-indicators-base-api-dm"}resetCustomerIndicators(){this.customerIndicators=[]}getCustomerIndicators(t,e){e=Object.assign({"customer-id":t},e),this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields)}_getService(t,e={},o={}){const i=this._getServiceParams(o,e);return this._getServicePath(`${t}CustomerIndicators`,this._getBgadp(i))}_getBgadp(t){return{getCustomerIndicatorsV1:()=>new sr(t),getCustomerIndicatorsV3:()=>new Jo(t),default:()=>"BGADP does not exist."}}_responseMapping(t){return"1"==this.version&&Object.keys(t).length&&t.forEach((t=>{["BASIC_DATA","ENTREPRENEUR_AND_POTENTIAL","WEB_CONSUMPTION_ACCOUNT","USER_EXPIRED"].includes(t.id)&&this._removeFields(["id"],t),this._removeFields(["payrollAmounts","payrollAge"],t)})),t}}L($r,"GET_EVENTS",{customEvent:"customer-indicators-api-dm-fetch",errorFireEventHandler:"customer-indicators-api-dm-fetch-error"}),customElements.define($r.is,$r);var wr=t`
:host {
  display: block;
  flex-direction: column;
  box-sizing: border-box;
  text-align: center;
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

.image {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1em) auto;
}
.image img {
  width: var(--rewards-promotions-panel-info-image-width, 100%);
  height: var(--rewards-promotions-panel-info-image-height, auto);
  object-fit: cover;
  margin: 0 auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem);
}
.image span {
  display: block;
  width: var(--rewards-promotions-panel-info-microillustration-width, 5rem);
  height: var(--rewards-promotions-panel-info-microillustration-height, auto);
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem) auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem);
}

:host(.empty-state) .image span {
  width: 9rem;
  margin: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem) auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem);
}

.content {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1em) calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1em);
}
.content ::slotted(*) {
  margin: 0;
  line-height: var(--lineHeightTypeSmall, ${i(r.typeSmall)});
}

:host([hide-padding-bottom]) .content {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1em) 0;
}

.title {
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem);
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${i(s.medium.fontWeight)});
  line-height: var(--lineHeightTypeLarge, ${i(r.typeLarge)});
}
.title.not-text {
  margin-bottom: 0;
}

.description {
  margin: 0 auto;
  --bbva-text-white-space: pre-wrap;
}
`;class Sr extends(V(Ye(Ke(q(l(e)))))){static get is(){return"rewards-promotions-panel-info"}static get scopedElements(){const t=[N,z,H,...Sr.configurationScopedElements()];return Sr.scopedElementsFromClasses(t)}static get properties(){return{microillustration:{type:Object},text:{type:String},heading:{type:String},headingLevelTitle:{type:String,attribute:"heading-level-title",reflect:!0}}}constructor(){super(),this.microillustration=j,this.text="",this.headingLevelTitle="h2",this.heading=""}static get styles(){return[wr,super.styles,G.light,U.light,o("rewards-promotions-panel-info-shared-styles")]}render(){return p`
      <div class="image">${this._contentImage}</div>
      <div class="content">
        ${this.heading&&p`
            <bbva-text
              tabindex="0"
              class="title"
              text=${this.t(this.heading)}
              size="L"
              alignment="center"
              tag="${_(this.headingLevelTitle)}"
              inherit
            ></bbva-text>
          `}
        ${this.t(this.text)&&p`
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
      </div>
    `}get _contentImage(){return p`
      <span aria-hidden="true">${this.microillustration}</span>
    `}}customElements.define(Sr.is,Sr);var xr=t`
:host {
  --_rewards_promotions_missing-image-background-color: var(--rewards-promotions-card-sale-missing-image-background-color,var(--colorsSecondary100, ${i(W.secondary100)}));
  --_rewards_promotions_missing-image-color: var(--rewards-promotions-card-sale-missing-image-color,var(--colorsSecondary500, ${i(W.secondary500)}));
  --_rewards_promotions_image-height: var(--rewards-promotions-card-sale-image-height, 13.5rem);
  --_rewards_promotions_image-width: var(--rewards-promotions-card-sale-image-width, 100%);
  --_rewards-promotions-object-position: var(--rewards-promotions-card-sale-object-position, center);
  --_rewards-promotions-object-fit: var(--rewards-promotions-card-sale-object-fit, cover);
  --_rewards_promotions_main-text-padding-top: var(--rewards-promotions-card-sale-main-text-padding-top, calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1em));
  --_rewards_promotions_main-text-padding-bottom: var(--rewards-promotions-card-sale-main-text-padding-bottom, 0);
  --_rewards_promotions_main-text-padding-left-right: var(--rewards-promotions-card-sale-main-text-padding-sides,calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem));
  --_rewards_promotions_text-color: var(--rewards-promotions-card-sale-dark-mode-text-color, var(--rewards-promotions-card-sale-color, var(--colorsSecondary600, ${i(W.secondary600)})));
  --_rewards_promotions_detail-color: var(--rewards-promotions-card-sale-detail-dark-mode-color, var(--rewards-promotions-card-sale-detail-color,var(--colorsSecondary500, ${i(W.secondary500)})));
  --_rewards_promotions_card-sale-title-container-color: var(--rewards-promotions-card-sale-title-color, var(--colorsPrimaryMedium, ${i(W.primaryMedium)}));
  --_rewards_promotions_card-sale-bg-color-pressed: var(--rewards-promotions-card-sale-dark-mode-bg-color-pressed, var(--rewards-promotions-card-sale-bg-color-pressed, var(--colorsSecondary100, ${i(W.secondary100)})));
  --_rewards_promotions_card-sale-link-color: var(--rewards-promotions-card-sale-link-color, var(--colorsSecondary100, ${i(W.secondary100)}));
  --_rewards_promotions_card-sale-link-color-active: var(--rewards-promotions-card-sale-link-color-active, var(--colorsPrimaryCoreDark, ${i(W.primaryCoreDark)}));
  --_rewards_promotions_card-sale-promotion-date-color: var(--rewards-promotions-card-sale-dark-mode-promotion-date-color, var(--rewards-promotions-card-sale-promotion-date-color, var(--colorsSecondary500, ${i(W.secondary500)})));
  display: block;
  box-sizing: border-box;
  border-radius: 0.0625rem;
  font-size: var(--typographyTypeSmall, ${i(a.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${i(r.typeSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${i(s.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${i(s.medium.fontStyle)});
  background-color: var(--rewards-promotions-card-sale-dark-mode-bg, var(--rewards-promotions-card-sale-bg, var(--ambientsLight, ${i(Y.light)})));
  color: var(--_rewards_promotions_text-color);
}

:host([hidden]),
[hidden] {
  display: none !important;
}

:host(:active) {
  background: var(--_rewards_promotions_card-sale-bg-color-pressed);
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.top-part {
  display: flex;
  flex-direction: column;
}

.bot-part {
  display: block;
  text-align: start;
  width: 100%;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem);
  color: var(--_rewards_promotions_detail-color);
  font-size: var(--typographyTypeSmall, ${i(a.typeSmall)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${i(s.book.fontStyle)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${i(s.book.fontWeight)});
  line-height: var(--lineHeightTypeSmall, ${i(r.typeSmall)});
}

.slot {
  display: contents;
}

.slot ::slotted([slot=footer]) {
  flex-grow: 1;
  margin: 0;
  color: var(--_rewards_promotions_card-sale-promotion-date-color);
}

.image-container {
  flex: none;
  position: relative;
  overflow: hidden;
  height: var(--_rewards_promotions_image-height);
  width: var(--_rewards_promotions_image-width);
}

.image {
  position: absolute;
  object-fit: var(--_rewards-promotions-object-fit);
  object-position: var(--_rewards-promotions-object-position);
  height: 100%;
  width: 100%;
}

.missing-image {
  display: flex;
  flex-direction: column;
  align-items: center;
  text-align: center;
  justify-content: center;
  height: var(--_rewards_promotions_image-height);
  width: var(--_rewards_promotions_image-width);
  background-color: var(--_rewards_promotions_missing-image-background-color);
}

.missing-image .icon {
  color: var(--_rewards_promotions_missing-image-color);
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem);
}

.missing-description {
  text-align: center;
  font-size: var(--typographyType3XSmall, ${i(a.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${i(r.type3XSmall)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${i(s.book.fontStyle)});
  font-weight: var(--fontFacePrimaryBookFontStyle, ${i(s.book.fontStyle)});
  color: var(--_rewards_promotions_text-color);
}

.main-text {
  display: flex;
  flex-direction: column;
  padding: var(--_rewards_promotions_main-text-padding-top) var(--_rewards_promotions_main-text-padding-left-right) var(--_rewards_promotions_main-text-padding-bottom);
  overflow: hidden;
}

:host([layout*=compact]),
:host([variant*=compact]) {
  --_rewards_promotions_image-height: 6.5rem;
  --_rewards_promotions_image-width: calc(48px * 1.5 + 32px);
  --_rewards_promotions_main-text-padding-left-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1em);
}
:host([layout*=compact]) .top-part,
:host([variant*=compact]) .top-part {
  flex-direction: row;
}

:host([layout=promotion-compact]),
:host([variant=promotion-compact]) {
  --_rewards_promotions_image-height: 8rem;
}
:host([layout=promotion-compact]) .bot-part,
:host([variant=promotion-compact]) .bot-part {
  text-align: start;
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${i(s.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${i(s.bookItalic.fontStyle)});
}

.title {
  font-size: var(--typographyTypeMedium, ${i(a.typeMedium)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${i(s.medium.fontWeight)});
  margin-bottom: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-link] {
  text-align: left;
}
[data-tag-name=bbva-link]:active {
  background: var(--_rewards_promotions_card-sale-bg-color-pressed);
  --_rewards_promotions_card-sale-link-color: var(--_rewards_promotions_card-sale-bg-color-pressed);
}

.description {
  font-size: var(--typographyTypeSmall, ${i(a.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${i(r.typeSmall)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${i(s.medium.fontStyle)});
  color: var(--_rewards_promotions_text-color);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem);
}
.description.bold {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${i(s.medium.fontWeight)});
}

.categories-container {
  display: flex;
  flex-wrap: wrap;
  margin: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem) 0 0;
}
.categories-container [data-tag-name=bbva-badge-icon] {
  margin: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem) 0 0;
}
.categories-container--full-width [data-tag-name=bbva-badge-icon] {
  width: 100%;
}

:host([is-campaign]) [data-tag-name=bbva-badge-icon] {
  --bbva-badge-icon-icon-color: var(--colorsSecondary500, ${i(W.secondary500)});
}
`;class Cr extends(V(l(Ye(Ke(K(e)))))){static get is(){return"rewards-promotions-card-sale"}static get scopedElements(){const t=[X,J,Q,z,...Cr.configurationScopedElements()];return Cr.scopedElementsFromClasses(t)}static get properties(){return{image:{type:String},imageAlt:{type:String,attribute:"image-alt"},title:{type:String},description:{type:String},categoryType:{type:String,attribute:"category-type"},categoryText:{type:String,attribute:"category-text"},categoryIcon:{type:String,attribute:"category-icon"},secondaryCategoryType:{type:String,attribute:"secondary-category-type"},secondaryCategoryText:{type:String,attribute:"secondary-category-text"},secondaryCategoryIcon:{type:String,attribute:"secondary-category-icon"},principalCategoryType:{type:String,attribute:"principal-category-type"},principalCategoryText:{type:String,attribute:"principal-category-text"},principalCategoryIcon:{type:String,attribute:"principal-category-icon"},hideDivider:{type:Boolean,attribute:"hide-divider"},loadingImgType:{type:String,attribute:"loading-img-type"},_errorImage:{type:Boolean},enableInteractivity:{type:Boolean,attribute:"enable-interactivity"},deactivateClick:{type:Boolean,attribute:"deactivate-click"},isCampaign:{type:Boolean,attribute:"is-campaign"}}}static get styles(){return[xr,Z.light,U.light,tt.light,et.light,o("rewards-promotions-card-sale-shared-styles")]}constructor(){super(),this.image="",this.imageAlt="",this.description="",this.categoryType="",this.categoryText="",this.categoryIcon="",this.secondaryCategoryType="",this.secondaryCategoryText="",this.secondaryCategoryIcon="",this.principalCategoryType="",this.principalCategoryText="",this.principalCategoryIcon="",this.hideDivider=!1,this.loadingImgType="lazy",this._errorImage=!1,this.addEventListener("click",this._onClick),this.enableInteractivity=!1,this.deactivateClick=!1,this.isCampaign=!1}updated(){this.deactivateClick||(this.setAttribute("role","button"),this.setAttribute("tabindex",0))}_renderMissingIcon(t,e){return p`
      <div class="missing-image">
        <bbva-icon class="icon" icon="${t}"></bbva-icon>
        ${e&&p`
            <bbva-text
              ?enable-interactivity="${this.enableInteractivity}"
              unset
              class="missing-description"
              .text="${this.t(e)}"
            ></bbva-text>
          `}
      </div>
    `}get _image(){var t;return this.image?p`
          <img
            loading="${this.loadingImgType}"
            class="image"
            @error=${()=>{this._errorImage=!0}}
            .src="${this.image}"
            alt="${this.imageAlt}"
          />
        `:null===(t=this._renderMissingIcon)||void 0===t?void 0:t.call(this,ot(),"")}get _icon(){var t;return null===(t=this._renderMissingIcon)||void 0===t?void 0:t.call(this,it(),"rewards-promotions-card-sale-text-imageoff")}_renderImage(){return p`
      <div class="image-container" aria-hidden="true">
        ${this._errorImage?this._icon:this._image}
      </div>
    `}get _renderTitle(){return this.title?p`
          <bbva-text
            ?enable-interactivity="${this.enableInteractivity}"
            class="title"
            variant="spotlight"
            text=${this.title}
            ellipsis
            lines="1"
            unset
          ></bbva-text>
        `:h}static _composeCategoryConfig(t,e,o){return{icon:t,category:e,description:o}}static _reduceCategory(t,e){const o=[...t];return(e.description||e.category)&&o.push(e),o}get _composeCategories(){var t;return null===(t=[Cr._composeCategoryConfig(this.categoryIcon,this.categoryType,this.categoryText),Cr._composeCategoryConfig(this.secondaryCategoryIcon,this.secondaryCategoryType,this.secondaryCategoryText)])||void 0===t?void 0:t.reduce(Cr._reduceCategory,[])}get _composePrincipalCategory(){var t;return null===(t=[Cr._composeCategoryConfig(this.principalCategoryIcon,this.principalCategoryType,this.principalCategoryText)])||void 0===t?void 0:t.reduce(Cr._reduceCategory,[])}get _renderCategories(){return this._renderCategorySection(this._composeCategories)}get _renderPrincipalCategory(){return this._renderCategorySection(this._composePrincipalCategory,!0,!0)}_renderCategorySection(t,e=!1,o=!1){const i="categories-container"+(e?" categories-container--full-width":"");return t.length?p`
          <div class="${i}">
            ${t.map((t=>p`
                <bbva-badge-icon
                  ambient="light"
                  disabled-tabindex
                  ?enable-interactivity="${this.enableInteractivity}"
                  .icon=${this.isCampaign&&o?at():t.icon}
                  .category=${t.category}
                  .description=${this.t(t.description)}
                  has-ellipsis
                >
                </bbva-badge-icon>
              `))}
          </div>
        `:h}get _renderDescription(){return this.description?p`
          <bbva-text
            ?enable-interactivity="${this.enableInteractivity}"
            class="description ${rt({bold:!0})}"
            .text=${this.description}
            ellipsis
            lines="2"
            unset
          ></bbva-text>
        `:h}_renderDivider(){return this.hideDivider?h:p`
          <bbva-divider></bbva-divider>
        `}_onClick(){this.deactivateClick||this.dispatchEvent(new CustomEvent("rewards-promotions-card-sale-item-click",{bubbles:!0,composed:!0}))}render(){return p`
      <div class="top-part" onclick="void(0)">
        ${this._renderImage()}
        <div class="main-text">
          ${this._renderTitle} ${this._renderPrincipalCategory} ${this._renderDescription}
          <span class="slot">
            <slot></slot>
          </span>
        </div>
      </div>
      ${this._renderDivider()}
      <div class="bot-part" onclick="void(0)">
        <span class="slot">
          <slot name="footer"> </slot>
        </span>
        ${this._renderCategories}
      </div>
    `}}customElements.define(Cr.is,Cr);var Pr=t`
:host {
  position: relative;
  display: block;
  background: var(--rewards_promotions_card-article-bg-color);
  box-sizing: border-box;
  border-radius: 1px;
  --_rewards_promotions_image-height: var(--rewards-promotions-card-article-image-height, 9rem);
  --_rewards_promotions_image-width: var(--rewards-promotions-card-article-image-width, 100%);
  --_rewards-promotions-object-position: var(--rewards-promotions-card-article-object-position, top);
  --_rewards-promotions-object-fit: var(--rewards-promotions-card-article-object-fit, cover);
  --rewards_promotions_card-article-title-container-color: var(--rewards-promotions-card-article-color, var(--colorsPrimaryMedium, ${i(W.primaryMedium)}));
  --rewards_promotions_card-article-bg-color-pressed: var(--rewards-promotions-card-article-dark-mode-bg-color-pressed, var(--rewards-promotions-card-article-bg-color-pressed, var(--colorsSecondary100, ${i(W.secondary100)})));
  --rewards_promotions_card-article-title-color-pressed: var(--rewards-promotions-card-article-dark-mode-title-color-pressed, var(--rewards-promotions-card-article-title-color-pressed, var(--colorsPrimaryCore, ${i(W.primaryCore)})));
  --rewards_promotions_card-article-missing-image-background-color: var(--rewards-promotions-card-article-missing-image-background-color, var(--colorsSecondary100, ${i(W.secondary100)}));
  --rewards_promotions_card-article-missing-image-color: var(--rewards-promotions-card-article-missing-image-color, var(--colorsSecondary500, ${i(W.secondary500)}));
  --_rewards_promotions_card_article_text-color: var(--rewards-promotions-card-article-dark-mode-text-color, var(--rewards-promotions-card-article-color, var(--colorsSecondary600, ${i(W.secondary600)})));
  --_rewards_promotions_card-article-promotion-date-color: var(--rewards-promotions-card-article-dark-mode-promotion-date-color, var(--rewards-promotions-card-article-promotion-date-color, var(--colorsSecondary500, ${i(W.secondary500)})));
  --rewards_promotions_card-article-bg-color: var(--rewards-promotions-card-article-dark-mode-bg-color, var(--rewards-promotions-card-article-bg-color, var(--colorsPrimaryCoreLightened, ${i(W.primaryCoreLightened)})));
  box-shadow: var(--boxShadowType1, ${i(st.type1)});
}

:host([hidden]),
[hidden] {
  display: none !important;
}

:host(:active) {
  background: var(--rewards_promotions_card-article-bg-color-pressed);
  --rewards_promotions_card-article-title-container-color: var(--rewards_promotions_card-article-title-color-pressed);
}
:host(:active) .content {
  background-color: var(--rewards_promotions_card-article-bg-color-pressed);
}

:host([disabled]) {
  opacity: 0.4;
  cursor: default;
  pointer-events: none;
}

:host([hide-box-shadow]) {
  box-shadow: none;
}

:host([is-carousel]) {
  height: 100%;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.content {
  background-color: var(--rewards_promotions_card-article-bg-color);
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1em);
}

.missing-description {
  font-size: var(--typographyType3XSmall, ${i(a.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${i(r.type3XSmall)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${i(s.book.fontStyle)});
  font-weight: var(--fontFacePrimaryBookFontStyle, ${i(s.book.fontStyle)});
  color: var(--colorsSecondary600, ${i(W.secondary600)});
}

.title {
  font-size: var(--typographyTypeMedium, ${i(a.typeMedium)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${i(s.medium.fontWeight)});
}

.categories-container {
  display: flex;
  flex-wrap: wrap;
}
.categories-container [data-tag-name=bbva-badge-icon] {
  margin: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem) 0 0;
  overflow: hidden;
}

.image-container {
  flex: none;
  position: relative;
  overflow: hidden;
  height: var(--_rewards_promotions_image-height);
  width: var(--_rewards_promotions_image-width);
}

.header-img {
  width: 100%;
  height: 100%;
  object-fit: var(--_rewards-promotions-object-fit);
  object-position: var(--_rewards-promotions-object-position);
}

.missing-image {
  display: flex;
  flex-direction: column;
  align-items: center;
  text-align: center;
  justify-content: center;
  height: 9rem;
  width: 100%;
  background-color: var(--rewards_promotions_card-article-missing-image-background-color);
}

.missing-image .icon {
  color: var(--rewards_promotions_card-article-missing-image-color);
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem);
}

.description {
  display: block;
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem) 0 0;
  font-size: var(--typographyTypeSmall, ${i(a.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${i(r.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${i(s.book.fontWeight)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${i(s.book.fontStyle)});
  color: var(--_rewards_promotions_card_article_text-color);
}

.promotion-date {
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem);
  color: var(--_rewards_promotions_card-article-promotion-date-color);
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${i(s.bookItalic.fontStyle)});
}

:host([description-medium]) [data-tag-name=bbva-text].description {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem);
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${i(s.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${i(s.medium.fontStyle)});
}

:host([is-campaign]) [data-tag-name=bbva-badge-icon] {
  --bbva-badge-icon-icon-color: var(--colorsSecondary500, ${i(W.secondary500)});
}
`;class kr extends(l(Ye(Ke(e)))){static get is(){return"rewards-promotions-card-article"}static get scopedElements(){const t=[X,nt,Q,z,...kr.configurationScopedElements()];return kr.scopedElementsFromClasses(t)}static get properties(){return{category:{type:String},categoryIcon:{type:String,attribute:"category-icon"},secondaryCategoryIcon:{type:String,attribute:"secondary-category-icon"},categoryText:{type:String,attribute:"category-text"},secondaryCategoryText:{type:String,attribute:"secondary-category-text"},principalCategory:{type:String,attribute:"principal-category"},principalCategoryIcon:{type:String,attribute:"principal-category-icon"},principalCategoryText:{type:String,attribute:"principal-category-text"},description:{type:String},image:{type:String},loadingImgType:{type:String,attribute:"loading-img-type"},imageAccessibilityText:{type:String,attribute:"image-accesibility-text"},contentTitle:{type:String,attribute:"content-title"},_errorImage:{type:Boolean,attribute:"error-image"},enableInteractivity:{type:Boolean,attribute:"enable-interactivity"},promotionDate:{type:String,attribute:"promotion-date"},isCarousel:{type:Boolean,attribute:"is-carousel"},deactivateClick:{type:Boolean,attribute:"deactivate-click"},variant:{type:String},isCampaign:{type:Boolean,attribute:"is-campaign"}}}constructor(){super(),this.category="",this.loadingImgType="lazy",this.imageAccessibilityText="",this._errorImage=!1,this.contentTitle="",this.enableInteractivity=!1,this.isCarousel=!1,this.deactivateClick=!1,this.description="",this.image="",this.principalCategory="",this.principalCategoryIcon="",this.principalCategoryText="",this.promotionDate="",this.secondaryCategoryText="",this.secondaryCategoryIcon="",this.addEventListener("click",this._handleClickPromotion),this.variant="",this.isCampaign=!1}static get styles(){return[Pr,lt.light,tt.light,U.light,et.light,o("rewards-promotions-card-article-shared-styles")]}updated(){this.deactivateClick||(this.setAttribute("role","button"),this.setAttribute("tabindex",0))}_handleClickPromotion(){this.deactivateClick||this.dispatchEvent(new CustomEvent("rewards-promotions-card-article-click",{detail:!0,bubbles:!0,composed:!0}))}_renderMissingIcon(t,e){return p`
      <div class="missing-image">
        <bbva-icon class="icon" icon="${t}"></bbva-icon>
        ${e&&p`
            <bbva-text
              ?enable-interactivity="${this.enableInteractivity}"
              unset
              class="missing-description"
              text="${this.t(e)}"
            ></bbva-text>
          `}
      </div>
    `}get _image(){return this.image?p`
          <img
            loading="${this.loadingImgType}"
            class="header-img"
            @error=${()=>{this._errorImage=!0}}
            src="${this.image}"
            alt="${this.imageAccessibilityText}"
          />
        `:this._renderMissingIcon(ot())}get _icon(){return this._renderMissingIcon(it(),"rewards-promotions-card-article-text-imageoff")}get _description(){return p`
      <bbva-text
        ?enable-interactivity="${this.enableInteractivity}"
        class="description"
        .text=${this.description}
        ellipsis
        lines="2"
        unset
      ></bbva-text>
    `}static _composeCategoryConfig(t,e,o){return{icon:t,category:e,description:o}}get _composeCategories(){return[kr._composeCategoryConfig(this.categoryIcon,this.category,this.categoryText),kr._composeCategoryConfig(this.secondaryCategoryIcon,"",this.secondaryCategoryText)].reduce(kr._reduceCategory,[])}get _composePrincipalCategory(){return[kr._composeCategoryConfig(this.principalCategoryIcon,this.principalCategory,this.principalCategoryText)].reduce(kr._reduceCategory,[])}static _reduceCategory(t,e){const o=[...t];return(e.description||e.category)&&o.push(e),o}get _renderCategories(){return this._renderCategorySection(this._composeCategories)}get _renderPrincipalCategory(){return this._renderCategorySection(this._composePrincipalCategory,!0)}_renderPromotionDate(){return p`
      <bbva-text
        ?enable-interactivity="${this.enableInteractivity}"
        class="promotion-date"
        text=${this.promotionDate}
        ellipsis
        lines="2"
        unset
      ></bbva-text>
    `}_renderCategorySection(t,e=!1){return t.length?p`
        <div class="categories-container">
          ${t.map((t=>p`
              <bbva-badge-icon
                ambient="light"
                disabled-tabindex
                ?enable-interactivity="${this.enableInteractivity}"
                .icon=${this.isCampaign&&e?at():t.icon}
                .category=${t.category}
                .description=${this.t(t.description)}
                has-ellipsis
              >
              </bbva-badge-icon>
            `))}
        </div>
      `:h}_renderImage(){return p`
      <div class="image-container" aria-hidden="true" onclick="void(0)">
        ${this._errorImage?this._icon:this._image}
      </div>
    `}render(){return p`
      ${this._renderImage()}
      <div class="content" ambient="light" onclick="void(0)">
        <bbva-text
          ?enable-interactivity="${this.enableInteractivity}"
          class="title"
          variant="${_(this.variant)}"
          text=${_(this.contentTitle)}
          ellipsis
          lines="1"
          unset
        ></bbva-text>
        ${this._renderPrincipalCategory}
        <div class="secondary-content" onclick="void(0)">
          ${this.description?this._description:h}
          ${this.promotionDate?this._renderPromotionDate():h} ${this._renderCategories}
        </div>
      </div>
      <div class="skeleton"></div>
    `}}customElements.define(kr.is,kr);var Tr=t`
*,
*:before,
*:after {
  box-sizing: inherit;
}

:host {
  position: fixed;
  bottom: 0;
  left: 0;
  display: block;
  opacity: 0;
  box-sizing: border-box;
  width: 100%;
  padding: 0;
  text-align: center;
  color: var(--_panel-button-color);
  max-height: 0;
  transition: all ease-in-out var(--rewards-promotions-panel-button-transition-time, 0.2s);
  --_panel-button-label: var(--rewards-promotions-panel-button-label, var(--colorsSecondary500, ${i(W.secondary500)}));
  --_panel-button-icon-color: var(--rewards-promotions-panel-button-icon-color, var(--colorsPrimaryMedium, ${i(W.primaryMedium)}));
  --_panel-button-icon-color-focus: var(--rewards-promotions-panel-button-icon-color-focus, var(--colorsPrimaryCoreLight, ${i(W.primaryCoreLight)}));
  --_panel-button-background: var(--rewards-promotions-dark-mode-bg , var(--rewards-promotions-panel-button-background, var(--colorsPrimaryCoreLightened, ${i(W.primaryCoreLightened)})));
  --_panel-button-color: var(--rewards-promotions-panel-button-text-color, var(--colorsSecondary600, ${i(W.secondary600)}));
}

:host([show]) {
  opacity: 1;
  padding: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1em);
  max-height: 100vh;
  z-index: var(--bbva-z-index-notifications, 1);
}

:host([show]) {
  visibility: visible;
}

:host([disabled]:not([show])) {
  opacity: 0;
}

:host([disabled][show]) {
  opacity: 0.4;
}

:host([none]),
[none] {
  display: none !important;
}

[data-tag-name=bbva-button-default] {
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem) 0;
}

[data-tag-name=bbva-text] {
  color: var(--_panel-button-color);
  font-weight: var(--fontFacePrimaryBookFontWeight, ${i(s.book.fontWeight)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${i(s.book.fontStyle)});
  display: block;
}
`;function Er(t,e){return t?e:""}class Ir extends(Ye(Ke(V(e)))){static get is(){return"rewards-promotions-panel-button"}static get scopedElements(){const t=[z,ct,dt,...Ir.configurationScopedElements()];return Ir.scopedElementsFromClasses(t)}static get properties(){return{show:{type:Boolean,reflect:!0},buttonText:{type:String,attribute:"button-text"},buttonVariant:{type:String,attribute:"button-variant"},footerLink:{type:String,attribute:"footer-link"}}}constructor(){super(),this.show=!1,this.buttonVariant="positive"}static get styles(){return[super.styles,Tr,mt.light,pt.light,U.light,o("rewards-promotions-panel-button-shared-styles")]}_dispatchCustomEvent(t,e){t&&e&&this.dispatchEvent(new CustomEvent(t,{detail:e,bubbles:!0,composed:!0}))}_renderButtonLink(){return Er(this.footerLink,p`
        <bbva-link
          @click=${()=>this._dispatchCustomEvent("rewards-promotions-panel-button-footer-link-click",!0)}
        >
          ${this.footerLink}
        </bbva-link>
      `)}_renderFooter(){return Er(this.footerLink,p`
        <footer>
          ${this._renderButtonLink()}
        </footer>
      `)}render(){return p`
      <section>
        ${Er(this.buttonText,p`
            <bbva-button-default
              @click=${()=>this._dispatchCustomEvent("panel-button-item-click",!0)}
              text=${_(this.buttonText)}
              class=${_(this.buttonVariant)}
            >
            </bbva-button-default>
          `)}
        ${this._renderFooter()}
      </section>
    `}}customElements.define(Ir.is,Ir);var Ar=t`
:host {
  display: block;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: border-box;
}

.rewards-promotions-search {
  box-sizing: content-box;
  display: grid;
  grid-template-columns: 1fr 2.75rem;
  border-bottom: 1px solid var(--_rewards-promotions-search-button-border-bottom);
  height: 3rem;
  background-color: var(--_rewards-promotions-search-button-bg-color);
}
.rewards-promotions-search [data-tag-name=bbva-type-text] {
  padding-inline: 1rem;
  align-self: center;
}
.rewards-promotions-search [data-tag-name=bbva-type-icon] {
  align-self: center;
  justify-self: center;
}
`,Dr=t`
:host {
  --_rewards-promotions-search-button-bg-color:
    var(--rewards-promotions-search-button--_ambient--bg-color,
        ${Re("colorSecondarySurfaceAmbientDefault",Oe)});
  --_rewards-promotions-search-button-border-bottom:
    var(--rewards-promotions-search-button--_ambient--border-bottom,
        ${Re("colorSecondaryFormInputBorderInactive",Oe)});
}
`;class Mr extends(qe(e)){static get is(){return"rewards-promotions-fake-search-input"}static get scopedElements(){const t=[ze,Ne];return Mr.scopedElementsFromClasses(t)}static get properties(){return{label:{type:String}}}constructor(){super(),this.label="",this.ambient="secondary"}static get styles(){return[Ar,Dr,Le.secondary,Ve.secondary,o("rewards-promotions-search-shared-styles")]}render(){return p`
      <div class="rewards-promotions-search">
        <bbva-type-text unset text="${this.label}" size="S"></bbva-type-text>
        <bbva-type-icon icon="${E()}" size="24"></bbva-type-icon>
      </div>
    `}}const Fr=ut((t=>class extends t{static get properties(){return{assistancePhone:{type:String,attribute:"assistance-phone"},maxRequestAttempts:{type:Number,attribute:"max-request-attempts"},visiblePages:{type:Object,attribute:"visible-pages"},showMaxAttempsError:{type:Boolean,attribute:"show-max-attemps-error"},showError:{type:Boolean,attribute:"show-error"}}}constructor(){super(),this.maxRequestAttempts=3,this.visiblePages={"view-more-promotions":!1,"promotion-detail":!1,"how-get-points-modal":!1,"terms-and-conditions-modal":!1},this.showMaxAttempsError=!1,this.showError=!1,this.showFavoriteCategoriesPacthError=!1}dispatchCustomEvent(t,e=!0){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}navigateToPreviousPage(){this.dispatchEvent(new CustomEvent("rewards-promotions-go-back-to-previous-page",{bubbles:!0,composed:!0,detail:!0}))}backStep(){this.dispatchCustomEvent("rewards-promotions-back-step")}_handleErrorPromotionRetry(){this.showMaxAttempsError?(this.isLoadingPromotionDetail=!0,this._getPromotionDetail()):this.assistancePhone?this._clickCallBBVA():this._handleHeaderLeftClick()}_getErrorTemplate(t=!1,e=!1,o=!1){return p`
          <div
            class="${rt({"notification-error-message":!0===t})}"
          >
            <bbva-notification-message
              variant="error"
              link-title="${this._getServiceErrorNotificationTitle(e)}"
              accessibility-link-label=${this._getServiceErrorNotificationTitle(e)}
              @notification-message-link-click="${()=>this._handleNotificationMessageLink()}"
            >
              ${this._getServiceErrorNotificationText(e,o)}
            </bbva-notification-message>
          </div>
        `}get _errorPromotionsCampaignTemplate(){return p`
          <div class="notification-error-message">
            <bbva-notification-message
              variant="error"
              size="M"
              message-title=${this._getServiceCampaignErrorNotificationText()}
              book-title=""
              link-title=${this._getServiceErrorNotificationTitle()}
              accessibility-link-label=${this._getServiceErrorNotificationTitle()}
              @notification-message-link-click="${()=>this._handleNotificationMessageLink()}"
            >
            </bbva-notification-message>
          </div>
        `}_errorPromotionDetailTemplate(t){const e=this.assistancePhone?"call-bank":"back";return p`
          <rewards-promotions-panel-info
            heading-level-title="h2"
            .microillustration="${ht}"
            heading="${this.t("rewards-promotions-promotion-detail-error-title")}"
            text="${this.showMaxAttempsError?this.t("rewards-promotions-promotion-detail-error-message"):this.t(`rewards-promotions-promotion-detail-error-message-${e}`)}"
          >
          </rewards-promotions-panel-info>
          <rewards-promotions-panel-button
            button-variant="default"
            button-text="${this.t(`rewards-promotions-promotion-detail-button-text-${this.showMaxAttempsError?"retry":e}`)}"
            footer-link="${this.assistancePhone||this.showMaxAttempsError?this.t("rewards-promotions-promotion-detail-link-text"):""}"
            ?show="${this.showError&&t}"
            @panel-button-item-click="${this._handleErrorPromotionRetry}"
            @rewards-promotions-panel-button-footer-link-click="${this._handleHeaderLeftClick}"
          >
          </rewards-promotions-panel-button>
        `}getBasicInfoPanel(t,e,o,i,a,r="basic-info-panel",s){return p`
          <div class="${r}" slot="invoker">
            <bbva-header-category text="${this.t(t)}"></bbva-header-category>
            <div class="content-panel">
              <div class="content-image" aria-hidden="true">
                <div class="microillustration">${e}</div>
              </div>
              <div class="content-text">
                <bbva-text
                  alignment="left"
                  class="description-content"
                  .text="${this.t(o)}"
                  unset
                >
                </bbva-text>
                <bbva-link
                  class="link"
                  data-type="panel-link"
                  @click="${()=>this._basicInfoPanelClick(a,s)}"
                >
                  ${this.t(i)}
                </bbva-link>
              </div>
            </div>
          </div>
        `}_basicInfoPanelClick(t,e){this.dispatchCustomEvent(t,e)}_toastClosed(){this.showNotifySuccess=!1}renderNotificationToast(){return p`
          <div>
            <bbva-notification-toast
              type="success"
              fixed-bottom
              icon-explainer="${A()}"
              auto-hide=""
              duration="5000"
              ?show="${this.showNotifySuccess}"
              @notification-toast-close="${()=>this._toastClosed()}"
            >
              <p>${this.t(this.notificationToastMessage)}</p>
            </bbva-notification-toast>
          </div>
        `}_getServiceErrorNotificationTitle(t){return this.showMaxAttempsError?this.t("rewards-promotions-bbva-notification-message-service-error-title"):this.assistancePhone?this.t("rewards-promotions-bbva-notification-message-service-error-call"):""}_getServiceErrorNotificationText(t=!1,e=!1){return!this.showMaxAttempsError&&e&&this.dispatchCustomEvent("rewards-promotions-notification-message-error-call-last"),this.showMaxAttempsError?this.t("rewards-promotions-bbva-notification-message-service-error-text"+(t?"-alt":"")):this.t("rewards-promotions-bbva-notification-message-service-error-call-text"+(t?"-alt":""))}_getServiceCampaignErrorNotificationText(){return this.showMaxAttempsError?this.t("rewards-promotions-bbva-notification-message-service-campaign-error-text"):this.t("rewards-promotions-bbva-notification-message-service-campaign-error-call-text")}_handleNotificationMessageLink(){return this.showMaxAttempsError?this._clickRetry():this._clickCallBBVA()}_clickCallBBVA(){this.dispatchCustomEvent("rewards-promotions-click-call-bbva-link",{value:this.assistancePhone})}_clickCallBBVAWeb(){window.open(`tel:${this.assistancePhone}`)}})),{moment:Br}=window,Rr={bbvaShopping:bt,bbvaAuto:vt,bbvaDesktop:gt,bbvaShop:yt,bbvaNearme:ft,bbvaPuntos:_t,bbvaBonusaccount:$t,bbvaDiscount:wt,bbvaPromotion:St,bbvaToys:xt,bbvaTravel:Ct,bbvaStorageroom:Pt,bbvaHealth:kt,bbvaRetirement:Tt,bbvaHome:Et,bbvaJewelry:It,bbvaEducation:At,bbvaPetshop:Dt,bbvaRestaurant:Mt,bbvaServices:Ft,bbvaSales:Bt,bbvaMobile:Rt,bbvaEntertainment:Ot,bbvaAeroplane:Lt,bbvaWellness:Vt,bbvaRetail:qt,bbvaFootball:Nt,bbvaRewards:zt},Or=[{id:"ONLINE",name:"rewards-promotions-search-modal-online-filter",image:{name:"bbvaDesktop"}},{id:"PHYSICAL",name:"rewards-promotions-search-modal-offline-filter",image:{name:"bbvaShop"}}],Lr=[{id:"LOCATION",name:"rewards-promotions-search-modal-location-filter",image:{name:"bbvaNearme"}}],Vr=[{id:"LOYALTY_POINTS",name:"rewards-promotions-search-modal-points-filter",color:"filter-icon-points-fill",image:{name:"bbvaPuntos"}},{id:"POST_PAYMENT",name:"rewards-promotions-search-modal-interest-free-filter",color:"filter-icon-interest-free-fill",image:{name:"bbvaBonusaccount"}},{id:"RATE,FIXED,GIFT,CASHBACK,OTHER",name:"rewards-promotions-search-modal-discount-filter",color:"filter-icon-discounts-fill",image:{name:"bbvaDiscount"}}],qr=[{id:"HOT",name:"rewards-promotions-search-modal-promotion-filter",color:"filter-icon-promotions-fill",image:{name:"bbvaPromotion"}}],Nr=["RATE","RATE_FROM","RATE_TO"],zr=["FIXED","FIXED_FROM","FIXED_TO"],Hr=["SPECIAL_PRICE","OTHER"];function jr(t,e="D MMM YYYY"){return Br(t).format(e).replace(".","")}function Gr(t,e){var o;const i=null==t||null===(o=t.commerceInformation)||void 0===o?void 0:o.name;return void 0===i||""===i?e:i}function Ur(t={}){var e;return!(null!==(e=Object.values(t))&&void 0!==e&&e.find((t=>{var e;return(null==t||null===(e=t.data)||void 0===e?void 0:e.length)>0})))}function Wr(t){return t.replace(/(\w)(\w*)/g,((t,e,o)=>`${e.toUpperCase()}${o.toLowerCase()}`))}function Yr(t,e,o=0,i=!1,a=" "){return t&&"KILOMETERS"===e?t<1?`${Math.round(1e3*t)}${a}${i?Wr("m"):"m"}`:`${t.toFixed(o)}${a}${i?Wr("km"):"km"}`:""}function Kr(t){return t?t.normalize("NFD").replace(/[\u0300-\u036f]/g,"").replace(/[^a-zA-Z0-9 -_]/g,"").toLowerCase():""}class Xr{constructor(t){this.controller=t}t(...t){return this.controller.t(...t)}dispatchCustomEvent(t,e=!0){var o;null===(o=this.controller)||void 0===o||o.dispatchCustomEvent(t,e)}get data(){var t;return(null===(t=this.controller)||void 0===t?void 0:t.data)||{}}setData(t,e){this.controller.data={...this.data,[t]:e},this.dispatchCustomEvent("rewards-promotions-persist-data",this.controller.data)}}var Jr=t`
:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.list-item {
  margin: 0;
  padding: 0;
  outline: none;
  display: flex;
  justify-content: space-between;
  font-size: var(--typographyTypeSmall, ${i(a.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${i(r.typeSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${i(s.medium.fontWeight)});
  color: var(--rewards-promotions-dark-mode-text-color, var(--_form-predictive-option-color));
  cursor: pointer;
}
.list-item[aria-selected=true] {
  color: var(--_form-predictive-option-selected-color);
}

.list {
  background-color: var(--rewards-promotions-dark-mode-bg, var(--colorsSecondary100, ${i(W.secondary100)}));
}

.item {
  width: 100%;
  margin: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem);
  display: block;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}

[data-tag-name=bbva-icon] {
  margin: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem);
  display: block;
}
`;class Qr extends bo{static get is(){return"rewards-promotions-form-predictive"}static get styles(){return[super.styles,Jr]}static get scopedElements(){return{"bbva-icon":X,...bo.scopedElements}}update(t){t.has("items")&&this._updateOptionsList(this.value),super.update(t)}filterCriteria(t,e){const o=this.cleanString(t);return-1!==this.cleanString(e).indexOf(o)}_deleteItem(t,e){t.stopPropagation();const o=this._historicalItems.filter((t=>t.detail!==e));this._historicalItems=[...o],this.dispatchEvent(new CustomEvent("rewards-promotions-form-predictive-historical-item-delete",{detail:e,bubbles:!0,composed:!0})),this.focus()}itemTemplate(t){var e;return p`
      <span class="item"> ${t} </span>
      <div
        class="delete-item"
        @click=${e=>this._deleteItem(e,t)}
        @keydown=${e=>this._deleteItem(e,t)}
      >
        <bbva-icon
          ?hidden="${!!this.value||!(null!==(e=this.historicalItems)&&void 0!==e&&e.length)}"
          .icon="${Ht()}"
          size="24"
        ></bbva-icon>
      </div>
    `}}customElements.define(Qr.is,Qr);var Zr=t`
:host {
  --bbva-help-modal-ios-header-bg-color: var(--ambientsDark, ${i(Y.dark)});
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

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-transition-duration: 0.3s;
  --bbva-help-modal-veil-transition-duration: 0.25s;
  --bbva-help-modal-veil-transition-delay: 0s;
  --bbva-help-modal-transition-delay: 0s;
}

.col-content {
  text-align: left;
}

:host([mode=error]) [data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0;
}

.list {
  position: absolute;
  top: 5.4375rem;
  z-index: 100;
  width: 100%;
  background-color: var(--colorsSecondary100, ${i(W.secondary100)});
  border-radius: var(--borderRadiusSmall, ${i(n.small)});
  box-shadow: var(--boxShadowType1, ${i(st.type1)});
  margin: 0.5rem 0;
  padding: 0.5rem 0;
  list-style: none;
}

.list-item {
  margin: 0;
  outline: none;
  padding: 0.5rem 1rem;
  display: flex;
  justify-content: space-between;
  font-size: var(--typographyTypeSmall, ${i(a.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${i(r.typeSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${i(s.medium.fontWeight)});
  color: var(--colorsPrimaryMedium, ${i(W.primaryMedium)});
  cursor: pointer;
}

.item {
  width: 100%;
  display: block;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}

[data-tag-name=rewards-promotions-panel-info] {
  --rewards-promotions-panel-info-text-color: var(--colorsSecondary500, ${i(W.secondary500)});
}
`,ts=t`
:host {
  display: flex;
  box-sizing: border-box;
  position: relative;
  min-height: var(--rewards-promotions-list-info-min-height, 5.25rem);
  padding: var(--rewards-promotions-list-info-padding, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem));
  color: var(--rewards-promotions-list-info-color, var(--colorsSecondary600, ${i(W.secondary600)}));
  --_list-info-icon-color: var(--rewards-promotions-list-info-icon-color, var(--colorsSecondary600, ${i(W.secondary600)}));
}

:host([hidden]),
[hidden] {
  display: none !important;
}

:host([hide-padding-top]) {
  padding-top: 0;
}

:host([hide-padding-bottom]) {
  padding-bottom: 0;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-icon] {
  flex: none;
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(b.spacer)}))) / 16) * 1rem);
  color: var(--_list-info-icon-color);
}

::slotted(*) {
  margin: 0;
  font-size: var(--typographyTypeSmall, ${i(a.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${i(r.typeSmall)});
}
`;class es extends(Ke(Ye(l(e)))){static get is(){return"rewards-promotions-list-info"}static get scopedElements(){const t=[X,z,...es.configurationScopedElements()];return es.scopedElementsFromClasses(t)}static get properties(){return{icon:{type:String},message:{type:String}}}constructor(){super(),this.icon="",this.message=""}static get styles(){return[ts,U.light,et.light,o("rewards-promotions-list-info-shared-styles")]}render(){return p`
      <bbva-icon aria-hidden="true" .icon="${this.icon}" size="24"></bbva-icon>

      <div class="content-text">
        ${this.message?p`
              <bbva-text unset .text="${this.message}" size="S"></bbva-text>
            `:p`
              <slot></slot>
            `}
      </div>

      <div class="skeleton"></div>
    `}}customElements.define(es.is,es);var os=t`
[data-tag-name=bbva-help-modal].rewards-promotions-terms-and-conditions-modal {
  --bbva-help-modal-padding: 0;
}
[data-tag-name=bbva-help-modal].rewards-promotions-terms-and-conditions-modal .image {
  padding: 1rem 1rem auto;
}
[data-tag-name=bbva-help-modal].rewards-promotions-terms-and-conditions-modal .image img {
  width: 100%;
  height: auto;
  object-fit: cover;
  margin: 0 auto 1rem;
}
[data-tag-name=bbva-help-modal].rewards-promotions-terms-and-conditions-modal .image span {
  display: block;
  width: 5rem;
  height: auto;
  margin: 1rem 0 1rem 1rem;
}
[data-tag-name=bbva-help-modal].rewards-promotions-terms-and-conditions-modal .title {
  margin: 0 1rem;
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${i(s.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${i(s.medium.fontStyle)});
  line-height: var(--lineHeightTypeLarge, ${i(r.typeLarge)});
  text-align: left;
}
[data-tag-name=bbva-help-modal].rewards-promotions-terms-and-conditions-modal .description {
  margin: 0 1rem;
  text-align: left;
  --bbva-type-text-white-space: pre-wrap;
}
[data-tag-name=bbva-help-modal].rewards-promotions-terms-and-conditions-modal .description li {
  list-style: disc;
  list-style-position: inside;
  padding-inline-start: auto;
}
`;class is extends Xr{configs(){return{attachToBodyConfig:{attachToBody:!0,contentStyles:os,modalClass:"rewards-promotions-terms-and-conditions-modal"},fullHeight:!0,shouldTransition:!0,headerType:"modal-initial",headerText:this.t("rewards-promotions-promotion-terms-and-conditions-modal-header-text"),ariaLabel:this.t("rewards-promotions-promotion-terms-and-conditions-modal-header-text"),headerCloseIconLabel:this.t("rewards-promotions-icon-close"),headerCloseIconAriaLabel:this.t("rewards-promotions-icon-close-accessibility-text"),buttonText:this.t("rewards-promotions-promotion-terms-and-conditions-modal-button-text"),closeModalElements:["footer-button"],hideContentPaddingTop:!0}}get termsAndConditionsText(){var t;return null===(t=this.controller.data)||void 0===t?void 0:t.termsAndConditionsText}render(){return p`
      <div class="col-content terms-and-conditions" slot="slot-content">
        <div class="image"><span aria-hidden="true">${jt}</span></div>
        <div class="content">
          <bbva-type-text
            class="title"
            text=${this.t("rewards-promotions-promotion-terms-and-conditions-modal-title-text")}
            size="3XL"
          ></bbva-type-text>
          ${Gt(`<div class="description"\n          >${this.termsAndConditionsText}</div>`)}
        </div>
      </div>
    `}}var as=t`
[data-tag-name=bbva-help-modal].rewards-promotions-search-modal {
  --bbva-help-modal-padding: 0;
}
[data-tag-name=bbva-help-modal].rewards-promotions-search-modal .predictive-search {
  position: relative;
  margin: 0 1rem;
}
[data-tag-name=bbva-help-modal].rewards-promotions-search-modal .filter-list {
  padding: 0 1rem;
}
[data-tag-name=bbva-help-modal].rewards-promotions-search-modal .filter-list [data-tag-name=bbva-notification-help] {
  padding-left: 0;
}
[data-tag-name=bbva-help-modal].rewards-promotions-search-modal .filter-block {
  margin-bottom: 1rem;
}
[data-tag-name=bbva-help-modal].rewards-promotions-search-modal .categories-list__item {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: center;
  --rewards-promotions-list-info-min-height: 0;
}
[data-tag-name=bbva-help-modal].rewards-promotions-search-modal .categories-list__checkbox {
  padding: 0.5rem 0;
  --_form-checkbox-label-gap: 0;
}
[data-tag-name=bbva-help-modal].rewards-promotions-search-modal [data-tag-name=rewards-promotions-list-info] {
  --rewards-promotions-list-info-icon-color: var(--colorsSecondary500, ${i(W.secondary500)});
  --rewards-promotions-list-info-padding: 0;
}
[data-tag-name=bbva-help-modal].rewards-promotions-search-modal [data-tag-name=rewards-promotions-list-info].category-icon-fill-disabled {
  --rewards-promotions-list-info-icon-color: var(--colorsSecondary300, ${i(W.secondary300)});
  --bbva-text-color: var(--colorsSecondary300, ${i(W.secondary300)});
}
[data-tag-name=bbva-help-modal].rewards-promotions-search-modal .filter-icon-points-fill {
  --rewards-promotions-list-info-padding: rem(16px) 0;
  --rewards-promotions-list-info-icon-color: var(--colorsPrimaryVariantDark, ${i(W.primaryVariantDark)});
}
[data-tag-name=bbva-help-modal].rewards-promotions-search-modal .filter-icon-interest-free-fill {
  --rewards-promotions-list-info-padding: rem(16px) 0;
  --rewards-promotions-list-info-icon-color: var(--colorsTertiaryType4Dark, ${i(W.tertiaryType4Dark)});
}
[data-tag-name=bbva-help-modal].rewards-promotions-search-modal .filter-icon-discounts-fill {
  --rewards-promotions-list-info-padding: rem(16px) 0;
  --rewards-promotions-list-info-icon-color: var(--colorsTertiaryType7Dark, ${i(W.tertiaryType7Dark)});
}
[data-tag-name=bbva-help-modal].rewards-promotions-search-modal .filter-icon-promotions-fill {
  --rewards-promotions-list-info-padding: rem(16px) 0;
  --rewards-promotions-list-info-icon-color: var(--colorsTertiaryType8Dark, ${i(W.tertiaryType8Dark)});
}
`;class rs extends Xr{configs(){return{attachToBodyConfig:{attachToBody:!0,contentStyles:as,modalClass:"rewards-promotions-search-modal"},shouldTransition:!0,fullHeight:!0,headerType:"modal-initial",headerText:this.t("rewards-promotions-search-label"),ariaLabel:this.t("rewards-promotions-search-label"),headerCloseIconLabel:this.t("rewards-promotions-icon-close"),headerCloseIconAriaLabel:this.t("rewards-promotions-icon-close-accessibility-text"),buttonText:this.t("rewards-promotions-search-modal-button-text"),linkText:this.t("rewards-promotions-search-modal-button-link"),closeModalElements:["footer-button"]}}init(){var t,e;this.setData("storedCategoriesEdited",null===(t=this.data)||void 0===t?void 0:t.storedCategories),this.setData("searchNameEdited",null===(e=this.data)||void 0===e?void 0:e.searchName),this.setData("footerButtonClick",(()=>{this._footerButtonClick()})),this.setData("footerLinkClick",(()=>{this.setData("storedCategoriesEdited",[]),this.setData("searchNameEdited",""),this._checkFilterButton()})),this._checkFilterButton(),this._selectedItem=!1,this.dispatchCustomEvent("rewards-promotions-modal-search-opened")}_footerButtonClick(){var t,e,o;this.setData("storedCategories",null===(t=this.data)||void 0===t?void 0:t.storedCategoriesEdited),this.setData("searchName",null===(e=this.data)||void 0===e?void 0:e.searchNameEdited),this.data.fromExternalEdited?this.controller.navigateToPreviousPage():(this.setData("fromExternalEdited",!1),this.dispatchCustomEvent("rewards-promotion-modal-search",this.data)),null===(o=this.controller)||void 0===o||o._resetTermTypedByUser()}_throttleSuggestionApiCall(t){this._timerId&&clearTimeout(this._timerId),this._timerId=setTimeout((()=>{var e,o;!((null==t?void 0:t.length)>=3)||this._selectedItem||null!==(e=this.data)&&void 0!==e&&e.invalid||(null===(o=this.controller)||void 0===o||o._getSuggestionsForPromotions(t))}),1e3)}_selectedItemEvent(){this._selectedItem=!0}_storeSearchName(t){var e,o;const i=null==t||null===(e=t.currentTarget)||void 0===e?void 0:e.value;""!==i&&(null===(o=this.data)||void 0===o?void 0:o.searchNameEdited)===i||(this._selectedItem=!1),this.setData("searchNameEdited",i),this.setData("showHistoricalPredictive",!i),this.setData("invalid",i&&!i.match(/^[A-Za-zÀ-ÿ0-9 ]+$/g)),this._throttleSuggestionApiCall(i),this.setData("fromExternalEdited",!1),this._checkFilterButton()}_storeSelectedCategories(t,e,o,i){var a,r,s;const n=null==t?void 0:t.currentTarget,l=null===(a=this.data)||void 0===a||null===(r=a.storedCategoriesEdited)||void 0===r||null===(s=r.find)||void 0===s?void 0:s.call(r,(t=>(null==t?void 0:t.id)===n.id&&(null==t?void 0:t.group)===e)),c={name:o,removable:!0,id:null==n?void 0:n.id,group:e};let d=[...this.data.storedCategoriesEdited];var m;(this.setData("fromExternalEdited",!1),null!=n&&n.checked)?l||(d=this._filterStoredCategories(e,i,c)):d=null===(m=d)||void 0===m?void 0:m.filter((t=>t.id!==n.id||t.group!==e));this.setData("storedCategoriesEdited",d),this._checkFilterButton()}_filterStoredCategories(t,e,o){return["categories.id","usageTypes.id","location","promotionType.id","trending.id"].reduce(((i,a)=>{var r;const s=[...i];let n=null===(r=this.data)||void 0===r?void 0:r.storedCategoriesEdited.filter((t=>(null==t?void 0:t.group)===a));return a===t&&(n=n.concat(o),e.reduce(((t,e)=>t.concat(n.find((t=>(null==t?void 0:t.id)===(null==e?void 0:e.id))))),[])),s.concat(n)}),[])}_checkFilterButton(){var t,e,o,i,a,r,s,n,l;this.setData("disabledButton",!(null!==(t=this.data)&&void 0!==t&&null!==(e=t.storedCategoriesEdited)&&void 0!==e&&e.length)&&!(null!==(o=this.data)&&void 0!==o&&null!==(i=o.searchNameEdited)&&void 0!==i&&i.length)||(null===(a=this.data)||void 0===a?void 0:a.invalid)),this.setData("disabledLink",!(null!==(r=this.data)&&void 0!==r&&null!==(s=r.storedCategoriesEdited)&&void 0!==s&&s.length||null!==(n=this.data)&&void 0!==n&&null!==(l=n.searchNameEdited)&&void 0!==l&&l.length)),this.dispatchCustomEvent("rewards-promotions-check-input-term-search",this.data)}_composeCheckbox(t,e,o,i,a=!1){var r,s,n,l,c,d,m;const u=!(null===(r=this.data)||void 0===r||null===(s=r.storedCategoriesEdited)||void 0===s||!s.find((e=>(null==e?void 0:e.id)===t.id&&e.group===i))),b=Rr[null==t||null===(n=t.image)||void 0===n?void 0:n.name]||Rr.bbvaStorageroom,v=null!=t&&t.color?t.color:"category-icon-fill",g="LOCATION"===t.id&&(null===(l=this.data)||void 0===l?void 0:l.locationDisabled)||(null===(c=this.data)||void 0===c||null===(d=c.storedCategoriesEdited)||void 0===d?void 0:d.length)>=(null===(m=this.data)||void 0===m?void 0:m.limitFavoriteCategoriesToSelect)&&!u;return p`
      <div class="categories-list__row">
        ${0!==e||0===e&&a?p`
              <bbva-divider></bbva-divider>
            `:h}
        <div class="categories-list__item">
          <rewards-promotions-list-info
            class="${v}${g?"-disabled":""}"
            icon="${b()}"
            message="${this.t(null==t?void 0:t.name,null==t?void 0:t.data)}"
          >
          </rewards-promotions-list-info>
          <bbva-form-checkbox
            ?disabled="${g}"
            id="${null==t?void 0:t.id}"
            class="categories-list__checkbox"
            hide-label
            ?checked="${u}"
            @change=${e=>this._storeSelectedCategories(e,i,this.t(null==t?void 0:t.name,null==t?void 0:t.data),o)}
          ></bbva-form-checkbox>
        </div>
      </div>
    `}_renderCategoriesCheckBox(){var t,e,o,i;const a=null!==(t=this.data)&&void 0!==t&&t.shouldShowAllCategories?null===(e=this.data)||void 0===e?void 0:e.categories:null===(o=this.data)||void 0===o||null===(i=o.categories)||void 0===i?void 0:i.slice(0,5);return this._renderGenericCheckList(a,"categories.id")}_renderGenericCheckList(t,e,o=!1){return null==t?void 0:t.map(((i,a)=>this._composeCheckbox(i,a,t,e,o)))}_deleteHistoricalItem(t){var e;this.data.promotionsHistoricalSearch=[...this.data.promotionsHistoricalSearch.filter((e=>e!==t))],this.dispatchCustomEvent("rewards-promotions-set-native-local-storage",{key:"promotions_historical_search",value:null===(e=this.data)||void 0===e?void 0:e.promotionsHistoricalSearch}),this.dispatchCustomEvent("rewards-promotions-persist-modal-data",this.data)}_linkExpandableClick(t){this.setData("shouldShowAllCategories",t.detail)}_renderCategories(){var t,e,o,i,a,r,s,n;return p`
      <div class="filter-block category-search">
        <bbva-header-category
          text="${this.t("rewards-promotions-search-modal-categories-text")}"
        ></bbva-header-category>
        <div class="filter-list">
          ${this._renderCategoriesCheckBox()}
        </div>
        <bbva-expandable-panel
          text-expanded="${this.t("rewards-promotions-search-modal-see-less")}"
          text-unexpanded="${`${this.t("rewards-promotions-search-modal-see-more")} (${null===(t=this.data)||void 0===t||null===(e=t.categories)||void 0===e?void 0:e.length})`}"
          ?expanded=${null===(o=this.data)||void 0===o?void 0:o.shouldShowAllCategories}
          @expandable-panel-expand="${t=>this._linkExpandableClick(t)}"
        ></bbva-expandable-panel>
      </div>
      <div
        class="${rt({"filter-block":(null===(i=this.data)||void 0===i?void 0:i.showSearchByLocation)||(null===(a=this.data)||void 0===a?void 0:a.showSearchByPromotionType),"presential-online-search":!0})}"
      >
        <bbva-header-category
          text="${this.t("rewards-promotions-search-modal-offer-type-text")}"
        ></bbva-header-category>
        <div class="filter-list">
          ${this._renderGenericCheckList(Or,"usageTypes.id")}
        </div>
      </div>
      ${null!==(r=this.data)&&void 0!==r&&r.showSearchByLocation?p`
            <div
              class="${rt({"filter-block":null===(s=this.data)||void 0===s?void 0:s.showSearchByPromotionType,"location-search":!0})}"
            >
              <bbva-header-category
                text="${this.t("rewards-promotions-search-modal-location-text")}"
              ></bbva-header-category>
              <div class="filter-list">
                ${this._renderGenericCheckList(Lr,"location")}
                <bbva-notification-help
                  accessibility-label-icon="Info"
                  icon=${f()}
                  text="${this.t("rewards-promotions-search-modal-location-help-text")}"
                ></bbva-notification-help>
              </div>
            </div>
          `:h}
      ${null!==(n=this.data)&&void 0!==n&&n.showSearchByPromotionType?p`
            <div class="type-search">
              <bbva-header-category
                text="${this.t("rewards-promotions-search-modal-promotions-type-text")}"
              ></bbva-header-category>
              <div class="filter-list">
                ${this._renderGenericCheckList(Vr,"promotionType.id")}
                ${this._renderGenericCheckList(qr,"trending.id",!0)}
              </div>
            </div>
          `:h}
    `}render(){var t,e,o,i;return p`
      <div class="col-content" slot="slot-content">
        <div class="predictive-search">
          <rewards-promotions-form-predictive
            ambient="light"
            required
            overlay
            ?invalid="${null===(t=this.data)||void 0===t?void 0:t.invalid}"
            label="${this.t("rewards-promotions-search-modal-label")}"
            label-out="${this.t("rewards-promotions-search-modal-label-out")}"
            info-message="${this.t("rewards-promotions-search-modal-info-message")}"
            error-message="${this.t("rewards-promotions-search-modal-error-message")}"
            action-variant="no-background"
            max-results="5"
            min-chars="3"
            .items="${null===(e=this.controller)||void 0===e?void 0:e.suggestions}"
            .historicalItems="${[...(null===(o=this.data)||void 0===o?void 0:o.promotionsHistoricalSearch)||[]].reverse()}"
            @keydown=${t=>{var e,o,i,a,r;13!==t.keyCode||!(null!==(e=this.data)&&void 0!==e&&null!==(o=e.storedCategoriesEdited)&&void 0!==o&&o.length||null!==(i=this.data)&&void 0!==i&&null!==(a=i.searchNameEdited)&&void 0!==a&&a.length)||null!==(r=this.data)&&void 0!==r&&r.invalid||(this._footerButtonClick(),this.controller.visibleModal=!1)}}
            @form-predictive-value-change=${t=>this._storeSearchName(t)}
            @form-predictive-item-select=${t=>this._selectedItemEvent(t)}
            @rewards-promotions-form-predictive-historical-item-delete=${t=>this._deleteHistoricalItem(t.detail)}
            .value="${null===(i=this.data)||void 0===i?void 0:i.searchNameEdited}"
          >
          </rewards-promotions-form-predictive>
        </div>
        <div class="search-checkboxes">
          ${this._renderCategories()}
        </div>
      </div>
    `}}class ss extends Xr{configs(){return{modalType:"caution",shouldTransition:!0,titleIcon:Ut(),closeModalElements:["footer-button","footer-link"]}}init(){this.controller.ariaLabel=this.t("rewards-promotions-remove-favorite-categories-aria-label"),this.controller.bodyText=this.t("rewards-promotions-remove-favorite-categories-body-text"),this.controller.buttonText=this.t("rewards-promotions-remove-favorite-categories-button-text"),this.controller.linkText=this.t("rewards-promotions-remove-favorite-categories-link-text"),this.setData("footerButtonClick",(()=>{this._removeFavoriteCategories()}))}_removeFavoriteCategories(){var t;const e={isFromViewMore:null===(t=this.data)||void 0===t?void 0:t.isFromViewMore};this.controller.dispatchEvent(new CustomEvent("rewards-promotion-modal-remove-favorite-categories",{bubbles:!0,composed:!0,detail:e}))}render(){return p``}}class ns extends Xr{configs(){return{shouldTransition:!0,fullHeight:!0,headerType:"modal-initial",headerCloseIconLabel:this.t("rewards-promotions-icon-close"),headerCloseIconAriaLabel:this.t("rewards-promotions-icon-close-accessibility-text"),closeModalElements:[]}}init(){var t;this.isFavoriteCategoriesCommitted=!1,this.controller.headerText=this.t("rewards-promotions-favorite-categories-modal-header-text"),this.controller.ariaLabel=this.t("rewards-promotions-favorite-categories-modal-header-text"),this.controller.buttonText=this.t("rewards-promotions-favorite-categories-modal-button-text"),this.controller.linkText=this.t("rewards-promotions-favorite-categories-modal-link-text"),this.setData("storedCategoriesEdited",null===(t=this.data)||void 0===t?void 0:t.storedCategories),this.setData("footerButtonClick",(()=>{this._commitFavoriteCategories(this.data),this.isFavoriteCategoriesCommitted=!0})),this.controller.closeModal=()=>{let t="rewards-promotions-modal-close-page",e=!0;this.showConfirmExitModal&&!this.isFavoriteCategoriesCommitted&&(t="rewards-promotions-show-exit-modal",e={mode:this.controller.constructor.MODES.exit,data:{ariaLabel:this.t("rewards-promotions-exit-modal-button-text"),bodyText:this.t("rewards-promotions-exit-modal-body-text"),buttonText:this.t("rewards-promotions-exit-modal-button-text"),linkText:this.t("rewards-promotions-exit-modal-link-text"),titleIcon:Ut(),disabledButton:!1,disabledLink:!1}}),this.controller.dispatchCustomEvent(t,e)},this.setData("footerLinkClick",this._resetSelection.bind(this)),this._checkModalFooterButtonsStatus()}_commitFavoriteCategories({storedCategoriesEdited:t,action:e}){this.controller.dispatchCustomEvent("rewards-promotion-modal-commit-favorite-categories",{storedCategoriesEdited:t,action:e})}_resetSelection(){this.setData("storedCategoriesEdited",[]),this._checkModalFooterButtonsStatus()}get storedCategoriesIdSorted(){var t;return null===(t=this.data)||void 0===t?void 0:t.storedCategories.map((({id:t})=>t)).sort(((t,e)=>t.toLowerCase()<e.toLowerCase()?-1:1))}get storedCategoriesEditedIdSorted(){var t;return null===(t=this.data)||void 0===t?void 0:t.storedCategoriesEdited.map((({id:t})=>t)).sort(((t,e)=>t.toLowerCase()<e.toLowerCase()?-1:1))}get isNewCategoriesGroup(){return!this.storedCategoriesIdSorted.every(((t,e)=>t===this.storedCategoriesEditedIdSorted[e]))}get isNewCategoriesSelection(){var t,e;return!(null!==(t=this.data)&&void 0!==t&&t.storedCategories.length||null===(e=this.data)||void 0===e||!e.storedCategoriesEdited.length)}get showConfirmExitModal(){return this.isNewCategoriesGroup||this.isNewCategoriesSelection}_storeSelectedCategories(t){var e,o,i,a,r,s,n;const l=null==t?void 0:t.currentTarget,c=null===(e=this.data)||void 0===e||null===(o=e.storedCategoriesEdited)||void 0===o||null===(i=o.find)||void 0===i?void 0:i.call(o,(({id:t})=>t===l.id)),d={name:null==l?void 0:l.name,removable:!0,id:null==l?void 0:l.id},m=null!=l&&l.checked?null===(a=this.data)||void 0===a||null===(r=a.storedCategoriesEdited)||void 0===r?void 0:r.concat(c?[]:d):null===(s=this.data)||void 0===s||null===(n=s.storedCategoriesEdited)||void 0===n?void 0:n.filter((t=>t.id!==l.id));this.setData("storedCategoriesEdited",m),this._checkModalFooterButtonsStatus()}_checkModalFooterButtonsStatus(){var t,e,o,i,a;this.setData("disabledButton",(null===(t=this.data)||void 0===t||null===(e=t.storedCategoriesEdited)||void 0===e?void 0:e.length)!==(null===(o=this.data)||void 0===o?void 0:o.limitFavoriteCategoriesToSelect)),this.setData("disabledLink",!(null!==(i=this.data)&&void 0!==i&&null!==(a=i.storedCategoriesEdited)&&void 0!==a&&a.length))}_composeCheckbox(t,e,o,i){var a,r,s,n,l;const c=!(null===(a=this.data)||void 0===a||null===(r=a.storedCategoriesEdited)||void 0===r||!r.find((({id:e})=>e===t.id))),d=(null===(s=this.data)||void 0===s?void 0:s.storedCategoriesEdited.length)>=(null===(n=this.data)||void 0===n?void 0:n.limitFavoriteCategoriesToSelect)&&!c,m=Rr[null==t||null===(l=t.image)||void 0===l?void 0:l.name]||Rr.bbvaStorageroom;return p`
      <div class="categories-list__row">
        ${0!==e?p`
              <bbva-divider></bbva-divider>
            `:h}
        <div class="categories-list__item">
          <rewards-promotions-list-info
            class="category-icon-fill${d?"-disabled":""}"
            icon="${m()}"
            message="${null==t?void 0:t.name}"
          >
          </rewards-promotions-list-info>
          <bbva-form-checkbox
            ?disabled="${d}"
            id="${null==t?void 0:t.id}"
            class="categories-list__checkbox"
            hide-label
            ?checked="${c}"
            @change=${e=>this._storeSelectedCategories(e,i,null==t?void 0:t.name,o)}
          ></bbva-form-checkbox>
        </div>
      </div>
    `}_renderCategoriesCheckBox(){var t,e;return null===(t=this.data)||void 0===t||null===(e=t.categories)||void 0===e?void 0:e.map(((t,e,o)=>this._composeCheckbox(t,e,o)))}_renderCategories(){return p`
      <div class="category-list">
        ${this._renderCategoriesCheckBox()}
      </div>
    `}render(){return p`
      <div class="col-content" slot="slot-content">
        <rewards-promotions-panel-info
          .microillustration="${Wt}"
          heading="${this.t("rewards-promotions-favorite-categories-modal-panel-title")}"
          text="${this.t("rewards-promotions-favorite-categories-modal-panel-text")}"
        >
        </rewards-promotions-panel-info>
        <div class="categories-checkboxes">
          ${this._renderCategories()}
        </div>
      </div>
    `}}class ls extends Xr{configs(){return{shouldTransition:!0,modalType:"caution",closeModalElements:["footer-button","footer-link"]}}init(){this.setData("disabledButton",!1),this.setData("disabledLink",!1),this.setData("footerButtonClick",(()=>{this.controller.dispatchCustomEvent("rewards-promotions-exit-modal-close-page")}))}render(){return p``}}let cs=class extends Xr{configs(){return{shouldTransition:!0,titleIcon:y(),closeModalElements:["footer-button","footer-link"],modalType:"warning"}}init(){this.controller.buttonText=this.t("rewards-promotions-half-error-button-text"),this.controller.linkText=this.t("rewards-promotions-half-error-link-text"),this.setData("footerButtonClick",(()=>{this._retryButtonClicked()}))}_retryButtonClicked(){var t;null===(t=this.controller)||void 0===t||t.dispatchEvent(new CustomEvent("rewards-promotions-half-error-retry-button",{bubbles:!0,composed:!0}))}render(){return p``}};class ds extends Xr{configs(){return{shouldTransition:!0,titleIcon:Ut(),modalType:"caution",closeModalElements:["footer-button","footer-link"]}}render(){return p``}}let ms=class extends Xr{configs(){return{shouldTransition:!0,fullHeight:!0,headerType:"modal-initial",headerCloseIconLabel:this.t("rewards-promotions-icon-exit"),headerCloseIconAriaLabel:this.t("rewards-promotions-icon-exit-accessibility-text"),closeModalElements:["footer-button","footer-link"]}}get headingText(){var t,e;return null===(t=this.controller)||void 0===t||null===(e=t.data)||void 0===e?void 0:e.heading}get detailText(){var t,e;return null===(t=this.controller)||void 0===t||null===(e=t.data)||void 0===e?void 0:e.text}render(){return p`
      <div slot="slot-content">
        <rewards-promotions-panel-info
          heading-level-title="h2"
          .microillustration="${ht}"
          heading="${this.headingText}"
          text="${this.detailText}"
        >
        </rewards-promotions-panel-info>
      </div>
    `}};class ps extends(K(l(Ke(Fr(e))))){static get MODES(){return{terms:"terms",search:"search",remove:"remove",favoriteCategories:"favoriteCategories",exit:"exit",halfError:"halfError",error:"error",halfExit:"halfExit"}}static get is(){return"rewards-promotions-modal"}static get scopedElements(){const t=[z,ze,Xe,go,Qr,Xt,H,ti,es,Sr,Ir,J,X,Jt];return ps.scopedElementsFromClasses(t)}static get properties(){return{visibleModal:{type:Boolean,attribute:"visible-modal"},data:{type:Object},headerText:{type:String},titleText:{type:String},buttonText:{type:String},mode:{type:String,attribute:"mode",reflect:!0},ariaLabel:{type:String},headerCloseIconAriaLabel:{type:String},headerCloseIconLabel:{type:String},suggestions:{type:Array},fixedFooter:{type:Boolean,attribute:"fixed-footer"}}}constructor(){super(),this.mode="",this.visibleModal=!1,this.modalType="modal",this.titleText="",this.data={},this.fixedFooter=!1,this.termsAndConditionsPart=new is(this),this.searchPart=new rs(this),this.suggestions=[],this.removePart=new ss(this),this.favoriteCategoriesPart=new ns(this),this.exitPart=new ls(this),this.halfErrorPart=new cs(this),this.errorPart=new ms(this),this.halfExitPart=new ds(this)}static get styles(){return[Zr,vo.light,Yt.light,G.light,Z.light,et.light,U.light,Le.primary,Kt.light,o("rewards-promotions-modal-shared-styles")]}update(t){var e,o,i;(t.has("mode")&&(this._resetConfig(),this._configs()),t.has("suggestions")&&null!==(e=this._part)&&void 0!==e&&e._checkFilterButton)&&(null===(o=this._part)||void 0===o||null===(i=o._checkFilterButton)||void 0===i||i.call(o));super.update(t)}get _part(){const t={terms:this.termsAndConditionsPart,search:this.searchPart,remove:this.removePart,favoriteCategories:this.favoriteCategoriesPart,exit:this.exitPart,halfError:this.halfErrorPart,error:this.errorPart,halfExit:this.halfExitPart};return(null==t?void 0:t[this.mode])||null}_configs(){var t,e;this._part&&Object.assign(this,null===(t=this._part)||void 0===t||null===(e=t.configs)||void 0===e?void 0:e.call(t))}_resetConfig(){Object.assign(this,{bodyText:null,buttonText:null,fullHeight:!1,headerText:null,headerType:null,hideContentPaddingTop:!1,linkText:null,titleText:null,titleIcon:"",modalType:"modal",shouldTransition:!1,suggestions:null})}get _content(){var t,e;return(null===(t=this._part)||void 0===t||null===(e=t.render)||void 0===e?void 0:e.call(t))||h}_changeVisible(t){const e=null==t?void 0:t.detail;e!==this.visible&&(this.visible=e,this.dispatchCustomEvent("rewards-promotions-modal-status",{visible:e,mode:this.mode,viewType:"modal"}))}_handleClick(t){null==t||t.stopPropagation(),this.closeModal()}navigateToPreviousPage(){var t;null!==(t=this._part)&&void 0!==t&&t.showConfirmExitModal||(this.visibleModal=!1),this.closeModal()}closeModal(){this.dispatchCustomEvent("rewards-promotions-modal-close-page"),"search"===this.mode&&(this._resetTermTypedByUser(),this.dispatchCustomEvent("rewards-promotions-modal-search-closed"))}_getSuggestionsForPromotions(t){this.dispatchCustomEvent("rewards-promotions-get-suggestions",{data:this.data,termInputSearch:t})}_resetTermTypedByUser(){this.dispatchCustomEvent("rewards-promotions-select-item",{data:this.data})}_handleRewardsModalState(t){var e;const{target:o}=t;var i;(this.visibleModal=o.visible,null!==(e=this._part)&&void 0!==e&&e.init&&this.visibleModal)&&(null===(i=this._part)||void 0===i||i.init())}render(){var t,e,o,i,a,r,s,n,l,c,d,m,u,h,b,v,g,y,f;return p`
      <bbva-help-modal
        ambient="primary-alt"
        ?attach-to-body=${null===(t=this.attachToBodyConfig)||void 0===t?void 0:t.attachToBody}
        .contentStyles="${null!==(e=this.attachToBodyConfig)&&void 0!==e&&e.attachToBody?null===(o=this.attachToBodyConfig)||void 0===o?void 0:o.contentStyles:{}}"
        class="${null!==(i=this.attachToBodyConfig)&&void 0!==i&&i.attachToBody?null===(a=this.attachToBodyConfig)||void 0===a?void 0:a.modalClass:""}"
        ?full-height=${this.fullHeight}
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        modal-type="${this.modalType??(null===(r=this.data)||void 0===r?void 0:r.modalType)}"
        ?hide-content-padding-top="${this.hideContentPaddingTop??(null===(s=this.data)||void 0===s?void 0:s.hideContentPaddingTop)}"
        ?fixed-footer=${this.fixedFooter}
        header-type="${this.headerType}"
        header-text="${_(this.headerText??(null===(n=this.data)||void 0===n?void 0:n.headerText))}"
        body-text="${this.bodyText??(null===(l=this.data)||void 0===l?void 0:l.bodyText)}"
        button-text="${this.buttonText??(null===(c=this.data)||void 0===c?void 0:c.buttonText)}"
        title-text=${_(this.titleText??(null===(d=this.data)||void 0===d?void 0:d.titleText))}
        title-lines="0"
        .titleIcon="${this.titleIcon||(null===(m=this.data)||void 0===m?void 0:m.titleIcon)}"
        .linkText="${this.linkText??(null===(u=this.data)||void 0===u?void 0:u.linkText)}"
        ?visible=${this.visibleModal}
        @visible-changed=${this._changeVisible}
        aria-label=${this.ariaLabel??(null===(h=this.data)||void 0===h?void 0:h.ariaLabel)}
        header-close-icon-label="${this.t("rewards-promotions-icon-close")}"
        header-close-icon-aria-label="${this.t("rewards-promotions-icon-close-accessibility-text")}"
        @help-modal-header-click="${this._handleClick}"
        @modal-state-change="${this._handleRewardsModalState}"
        @help-modal-footer-button-click=${null===(b=this.data)||void 0===b?void 0:b.footerButtonClick}
        @help-modal-footer-link-click=${null===(v=this.data)||void 0===v?void 0:v.footerLinkClick}
        ?disabled-button=${null===(g=this.data)||void 0===g?void 0:g.disabledButton}
        ?disabled-link=${null===(y=this.data)||void 0===y?void 0:y.disabledLink}
        .closeModalElements="${this.closeModalElements||(null===(f=this.data)||void 0===f?void 0:f.closeModalElements)}"
      >
        ${this._content}
      </bbva-help-modal>
    `}}class us extends Xr{async initConfig(){this.controller._getPromotionDetail()}_scrollToTop(){var t;null===(t=this.controller.scrollableParentElement(!0))||void 0===t||t.scrollTo(0,0)}_clickShowTerms(t){var e,o;t?t.endsWith("pdf")?this.dispatchCustomEvent("rewards-promotions-navigate-terms-condition",t):this.dispatchCustomEvent("rewards-promotions-navigate-terms-condition-in-app",{method:"GET",title:this.t("rewards-promotions-promotions-detail-terms-and-conditions-in-app-title"),url:t}):this.dispatchCustomEvent("rewards-promotions-show-modal",{mode:ps.MODES.terms,data:{termsAndConditionsText:null===(e=this.controller.promotion)||void 0===e||null===(o=e.legalConditions)||void 0===o?void 0:o.text}})}_clickStoreAboutWeb(){var t,e,o;this.dispatchCustomEvent("rewards-promotions-navigate-terms-condition-store-web",null===(t=this.controller)||void 0===t||null===(e=t.promotion)||void 0===e||null===(o=e.commerceInformation)||void 0===o?void 0:o.web)}_renderCardArticle(){var t,e,o,i,a,r,s,n,l,c,d,m,u,h,b,v,g;const y=null===(t=this.controller.promotion)||void 0===t||null===(e=t.images)||void 0===e?void 0:e.find((t=>"DETAIL"===(null==t?void 0:t.id))),f=this.controller.promotionCategoriesMap[null===(o=this.controller.promotion)||void 0===o||null===(i=o.promotionType)||void 0===i?void 0:i.id]??(null===(a=this.controller.promotionCategoriesMap)||void 0===a?void 0:a.RATE),$=null===(r=this.controller)||void 0===r||null===(s=r.promotion.usageTypes)||void 0===s||null===(n=s.find((t=>"ONLINE"===(null==t?void 0:t.id))))||void 0===n?void 0:n.id,w=null===(l=this.controller)||void 0===l||null===(c=l.promotion.usageTypes)||void 0===c||null===(d=c.find((t=>"PHYSICAL"===(null==t?void 0:t.id))))||void 0===d?void 0:d.id,S=this.t(`rewards-promotions-category-type-${null==$?void 0:$.toLowerCase()}`),x=this.t(`rewards-promotions-category-type-${null==w?void 0:w.toLowerCase()}`),C={categoryIcon:$?null===(m=this.controller.promotionIcons[$])||void 0===m?void 0:m.icon:"",categoryText:$?S:"",secondaryCategoryIcon:w?null===(u=this.controller)||void 0===u||null===(h=u.promotionIcons[w])||void 0===h?void 0:h.icon:"",secondaryCategoryText:w?x:""};return p`
      <rewards-promotions-card-article
        image=${_(null==y?void 0:y.url)}
        with-icon
        content-title="${_(Gr(this.controller.promotion,this.t("rewards-promotions-promotions-detail-header1")))}"
        description=${null===(b=this.controller.promotion)||void 0===b?void 0:b.name}
        description-medium
        promotion-date="${this.t("rewards-promotions-promotions-until-date-text",{formattedDate:jr(null===(v=this.controller.promotion)||void 0===v?void 0:v.endDate,this.controller.formatDate)})}"
        language="${this.controller.language}"
        principal-category=${f}
        principal-category-text=${_(this.t(null===(g=this.controller.promotion)||void 0===g?void 0:g.benefit))}
        fixed
        deactivate-click
        category-icon=${null==C?void 0:C.categoryIcon}
        category-text=${null==C?void 0:C.categoryText}
        secondary-category-icon=${_(null==C?void 0:C.secondaryCategoryIcon)}
        secondary-category-text=${_(null==C?void 0:C.secondaryCategoryText)}
      ></rewards-promotions-card-article>
      <bbva-divider></bbva-divider>
    `}_renderPromotionInfo(){var t,e,o,i,a,r;const s=null===(t=this.controller.promotion)||void 0===t||null===(e=t.descriptions)||void 0===e||null===(o=e.find((t=>"EXTENDED"===(null==t?void 0:t.id))))||void 0===o?void 0:o.value,n=null===(i=this.controller.promotion)||void 0===i||null===(a=i.legalConditions)||void 0===a?void 0:a.url;return p`
      <bbva-header-category
        data-selector="promotion-detail-extended-description-title"
        text="${this.t("rewards-promotions-promotions-detail-header2")}"
      ></bbva-header-category>
      ${s?p`
            <bbva-text
              data-selector="promotion-detail-extended-description"
              text=${s}
              size="S"
              unset
            ></bbva-text>
          `:h}
      ${null!==(r=this.controller.promotion)&&void 0!==r&&r.legalConditions?p`
            <bbva-link @click="${()=>this._clickShowTerms(n)}">
              ${this.t("rewards-promotions-promotions-detail-terms-and-conditions")}
            </bbva-link>
          `:h}
    `}_renderContent(){return this.controller.isLoadingPromotionDetail?p`
          <div class="skeleton" ambient="light">
            <div class="skeleton-animation"></div>
            <div class="basic-skeleton"></div>
            ${this._loadSkeletonCards()} ${this._loadSkeletonAboutCommerce()}
            ${this._loadSkeletonStores()}
          </div>
        `:this._renderPromotion()}_loadSkeletonCards(){return p`
      ${this.controller.showCardsForPromotion?p`
            <div class="cards-skeleton"></div>
            <div class="cards-skeleton"></div>
            <div class="cards-skeleton"></div>
          `:h}
    `}_loadSkeletonAboutCommerce(){var t;return p`
      ${null!==(t=this.controller)&&void 0!==t&&t.showStoreInformation?p`
            <div class="about-commerce-skeleton">
              <div class="commerce-item-skeleton"></div>
              <div class="commerce-item-skeleton"></div>
              <div class="commerce-item-skeleton"></div>
            </div>
          `:h}
    `}_loadSkeletonStores(){var t;return p`
      ${null!==(t=this.controller)&&void 0!==t&&t.showStoresForPromotion?p`
            <div class="stores-skeleton">
              <div class="stores-item-skeleton"></div>
              <div class="stores-item-skeleton"></div>
              <div class="stores-item-skeleton"></div>
            </div>
          `:h}
    `}_renderPromotion(){return this.controller.showError?this._renderPromotionDetailServiceError():this._renderPromotionDetail()}_renderPromotionDetail(){return this.controller.promotion?p`
          ${this._renderCardArticle()} ${this._renderPromotionInfo()}
          ${this._renderParticipantCards()} ${this._aboutStores} ${this._stores}
          ${this._exChangeCouponButton}
        `:h}get _exChangeCouponButton(){var t;return(null===(t=this.controller.promotion.paymentTypes)||void 0===t?void 0:t.some((({id:t})=>"COUPON"===t)))?p`
          <div data-selector="promotion-detail-exchange-coupon-button-wrapper">
            <bbva-button-default
              @click="${()=>this.controller.handleExchangeCouponClick()}"
              data-selector="promotion-detail-exchange-coupon-button"
            >
              ${this.t("rewards-promotions-promotion-coupon-exchange-button-text")}
            </bbva-button-default>
          </div>
        `:h}_renderParticipantCardsExpandable(){var t;return(null===(t=this.controller._promotionParticipantCards)||void 0===t?void 0:t.length)>5?p`
          <bbva-expandable-panel
            see-less="${this.t("rewards-promotions-promotions-detail-cards-see-less")}"
            see-more="${`${this.t("rewards-promotions-promotions-detail-cards-see-more")} (${this.controller._promotionParticipantCards.length-5} ${this.t("rewards-promotions-promotions-detail-cards-more")})`}"
            ?expanded=${this.controller._shouldShowAllCards}
            @expandable-panel-expand="${t=>this._linkExpandableClick(t)}"
          ></bbva-expandable-panel>
        `:h}_renderParticipantCards(){var t;return this.controller.showCardsForPromotion&&(null===(t=this.controller._promotionParticipantCards)||void 0===t?void 0:t.length)>0?p`
          <bbva-header-category
            text="${this.t("rewards-promotions-promotions-detail-participant-cards-title")}"
          ></bbva-header-category>
          ${this._renderCards()}
          <bbva-divider></bbva-divider>
          ${this._renderParticipantCardsExpandable()}
        `:h}_linkExpandableClick(t){this.controller._shouldShowAllCards=t.detail}get _cardsToRender(){return this.controller._shouldShowAllCards?this.controller._promotionParticipantCards:this.controller._promotionParticipantCards.slice(0,5)}_renderCards(){return this._cardsToRender.map(((t,e)=>{var o,i,a,r;return p`
          <bbva-divider ?hidden=${!e}></bbva-divider>
          <div class="participant-card-content">
            <div class="participant-card-image">
              <bbva-clip-card
                size="medium"
                .cardImage="${null==t||null===(o=t.detail)||void 0===o||null===(i=o.images)||void 0===i||null===(a=i.find((t=>"FRONT_CARD"===t.id)))||void 0===a?void 0:a.url}"
              ></bbva-clip-card>
            </div>
            <div class="participant-card-name">
              <bbva-text tag="span" font-weight="500" text="${null==t||null===(r=t.product)||void 0===r?void 0:r.name}"></bbva-text>
            </div>
          </div>
        `}))}_renderPromotionDetailServiceError(){var t;return this.controller._errorPromotionDetailTemplate(null===(t=this.controller)||void 0===t?void 0:t.visiblePage)}_hasViewMoreStores(t){var e;return(null==t?void 0:t.length)>=(null===(e=this.controller)||void 0===e?void 0:e._initialPagePromotionsNumber)}get _showStoreInformation(){var t,e,o,i;return""!==((null===(t=this.controller.promotion)||void 0===t||null===(e=t.commerceInformation)||void 0===e?void 0:e.description)??"").trim()||""!==((null===(o=this.controller.promotion)||void 0===o||null===(i=o.commerceInformation)||void 0===i?void 0:i.web)??"").trim()}get _aboutStores(){var t,e,o,i,a,r,s,n,l,c,d;return this._showStoreInformation&&null!==(t=this.controller)&&void 0!==t&&t.showStoreInformation?p`
          <bbva-header-category
            data-selector="promotion-detail-about-stores-title"
            text="${this.t("rewards-promotions-promotions-detail-stores")}"
          ></bbva-header-category>
          <bbva-text
            data-selector="promotion-detail-store-description"
            text=${(null===(e=this.controller)||void 0===e||null===(o=e.promotion)||void 0===o||null===(i=o.commerceInformation)||void 0===i?void 0:i.description)??""}
            size="S"
            unset
          ></bbva-text>
          ${""!==(null===(a=this.controller)||void 0===a||null===(r=a.promotion)||void 0===r||null===(s=r.commerceInformation)||void 0===s||null===(n=s.web)||void 0===n?void 0:n.trim())?p`
                <bbva-link class="about-stores-link" @click="${()=>this._clickStoreAboutWeb()}">
                  <span>
                    ${this.t("rewards-promotions-promotions-detail-stores-go-to",{storeName:null===(l=this.controller)||void 0===l||null===(c=l.promotion)||void 0===c||null===(d=c.commerceInformation)||void 0===d?void 0:d.name})}
                  </span></bbva-link
                >
              `:h}
        `:h}_navigateToViewMoreStores(t){this.dispatchCustomEvent("rewards-promotions-navigate-to-view-more-stores",{stores:t})}get _stores(){var t,e,o,i,a,r;const s=null===(t=this.controller)||void 0===t||null===(e=t.promotion)||void 0===e||null===(o=e.stores)||void 0===o?void 0:o.slice(0,5);return null!==(i=this.controller)&&void 0!==i&&i.showStoresForPromotion?p`
          ${null!=s&&s.length?p`
                <bbva-header-category
                  data-selector="promotion-detail-store-title"
                  text="${this.t("rewards-promotions-promotions-detail-title-stores")}"
                  @header-category-link-click="${()=>{var t,e;return this._navigateToViewMoreStores(null===(t=this.controller)||void 0===t||null===(e=t.promotion)||void 0===e?void 0:e.stores)}}"
                  option-link=${this._hasViewMoreStores(null===(a=this.controller)||void 0===a||null===(r=a.promotion)||void 0===r?void 0:r.stores)?this.t("rewards-promotions-promotions-view-more-stores"):""}
                ></bbva-header-category>
              `:h}
          ${null==s?void 0:s.map(((t,e)=>{var o,i,a,r,n,l,c,d,m;return p`
              <div
                class="store"
                onclick="void(0)"
                @click="${()=>{var e;return null===(e=this.controller)||void 0===e?void 0:e.handleStoreClick(null==t?void 0:t.location)}}"
                @keyup="${()=>{}}"
              >
                <div class="store-information">
                  <bbva-link>${null==t?void 0:t.name}</bbva-link>
                  ${null!==(o=Object.keys(null===(i=this.controller)||void 0===i?void 0:i.location))&&void 0!==o&&o.length&&null!=t&&null!==(a=t.distance)&&void 0!==a&&a.length?p`
                        <bbva-text
                          data-selector="promotion-detail-store-description-distance"
                          text=${this.t("rewards-promotions-stores-distance",{units:Yr(null==t||null===(r=t.distance)||void 0===r?void 0:r.length,null==t||null===(n=t.distance)||void 0===n||null===(l=n.lengthType)||void 0===l?void 0:l.id,1)})}
                          size="S"
                          unset
                        ></bbva-text>
                      `:h}
                </div>
                <bbva-text
                  data-selector="promotion-detail-store-description-list"
                  text=${`${null==t||null===(c=t.location)||void 0===c?void 0:c.formattedAddress}, ${null==t||null===(d=t.location)||void 0===d?void 0:d.city}, ${null==t||null===(m=t.location)||void 0===m?void 0:m.state}`}
                  size="S"
                  unset
                ></bbva-text
                ><bbva-divider ?hidden="${e===s.length-1}"></bbva-divider>
              </div>
            `}))}
        `:h}render(){return p`
      <bbva-transition-container
        @transitionend="${()=>this._onDetailTransitionEnd()}"
        header-text="${this.t("rewards-promotions-promotions-detail-title")}"
        header-type="first-level-sequential"
        header-show-left-icon
        ?visible="${this.controller.visiblePage}"
        @header-main-icon-click=${this.controller._handleHeaderLeftClick}
        header-left-icon-label="${this.t("rewards-promotions-icon-exit")}"
        header-left-icon-aria-label="${this.t("rewards-promotions-icon-exit-accessibility-text")}"
        @visible-changed=${this.controller._changeVisible}
        .headerButtons="${_(this.controller.headerButtons)}"
      >
        <div slot="slot-content">
          <div class="promotion-detail-scroll">
            ${this._renderContent()}
          </div>
        </div>
      </bbva-transition-container>
    `}_onDetailTransitionEnd(){var t;null!==(t=this.controller)&&void 0!==t&&t.visiblePage&&this._scrollToTop()}}class hs extends Xr{_performScrollTo(){var t,e,o,i;const a=null===(t=this.controller)||void 0===t||null===(e=t.shadowRoot)||void 0===e||null===(o=e.querySelector)||void 0===o?void 0:o.call(e,".promotion-list");(null==a||null===(i=a.querySelector)||void 0===i?void 0:i.call(a,".tooltip-scroll"))&&(a.addEventListener("scroll",this._onScrollCheck.bind(this),{passive:!0}),setTimeout((()=>{a.scrollBy({top:this._scrollToReach(),left:0,behavior:"smooth"})}),100))}_onScrollCheck(){var t,e,o;(null===(t=this.controller)||void 0===t||null===(e=t.shadowRoot)||void 0===e||null===(o=e.querySelector)||void 0===o?void 0:o.call(e,".promotion-list")).scrollTop>=this._scrollToReach()&&(this.controller._finishScroll=!0)}_scrollToReach(){var t,e,o,i,a,r,s,n;const l=null===(t=this.controller)||void 0===t||null===(e=t.shadowRoot)||void 0===e||null===(o=e.querySelector)||void 0===o?void 0:o.call(e,".promotion-list"),c=null===(i=this.controller)||void 0===i||null===(a=i.shadowRoot)||void 0===a||null===(r=a.querySelector)||void 0===r?void 0:r.call(a,".promotions-search"),d=null==l||null===(s=l.querySelector)||void 0===s?void 0:s.call(l,".tooltip-scroll"),m=null==d||null===(n=d.querySelector)||void 0===n?void 0:n.call(d,'[data-tag-name="bbva-help-tooltip"]');if(d){var p,u,h;const t=(null==m||null===(p=m.shadowRoot)||void 0===p||null===(u=p.querySelector)||void 0===u||null===(h=u.call(p,".tooltip"))||void 0===h?void 0:h.offsetHeight)??0,e=(null==c?void 0:c.offsetHeight)??0;return d.offsetTop-e-t}return 0}_clickGetMorePromotions(t){this.dispatchCustomEvent("rewards-promotion-list-button-view-more-promotions",t)}_clickChangeFavoritePromotionsCategories(){var t,e,o,i;this.dispatchCustomEvent("rewards-promotions-change-favorite-link-click");const a=(null===(t=this.controller)||void 0===t||null===(e=t.categories)||void 0===e?void 0:e.filter((t=>t.isFavourite)))||[];this.dispatchCustomEvent("rewards-promotions-show-modal",{mode:ps.MODES.favoriteCategories,data:{categories:null===(o=this.controller)||void 0===o?void 0:o.categories,storedCategories:a,storedCategoriesEdited:a,limitFavoriteCategoriesToSelect:null===(i=this.controller)||void 0===i?void 0:i.limitFavoriteCategoriesToSelect,action:"change"}})}_clickRemoveFavoritePromotionsCategories(){this.dispatchCustomEvent("rewards-promotions-remove-favorite-link-click"),this.dispatchCustomEvent("rewards-promotions-show-modal",{mode:ps.MODES.remove})}_renderPromotionsNoCards(){return p`
      <div class="notification-error-message">
        <bbva-notification-message>
          ${this.t("rewards-promotions-notification-message-user-has-no-cards-text-for-promotions")}
        </bbva-notification-message>
      </div>
    `}_renderNoPromotionsInfo(){var t;return null!==(t=this.controller)&&void 0!==t&&t.showPromotionsByOneType?h:p`
          <rewards-promotions-panel-info
            heading-level-title="h2"
            .microillustration="${Qt}"
            heading="${this.t("rewards-promotions-notification-message-user-has-no-promitions-title")}"
            text="${this.t("rewards-promotions-notification-message-user-has-no-promitions")}"
          >
          </rewards-promotions-panel-info>
        `}_getCategoriesInfo(t){var e,o,i;let a,r,s,n;const l=(null===(e=this.controller.promotionCategoriesMap)||void 0===e?void 0:e[null==t||null===(o=t.promotionType)||void 0===o?void 0:o.id])??(null===(i=this.controller.promotionCategoriesMap)||void 0===i?void 0:i.RATE);if(null==t?void 0:t.isCampaign)a=this.t("rewards-promotions-campaign-category-text"),r=yt(),n="",s="";else{var c,d;const e=null===(c=t.usageTypes.find((t=>"ONLINE"===(null==t?void 0:t.id))))||void 0===c?void 0:c.id,o=null===(d=t.usageTypes.find((t=>"PHYSICAL"===(null==t?void 0:t.id))))||void 0===d?void 0:d.id;r=e?this.controller.promotionIcons[e].icon:"",a=e?this.t(`rewards-promotions-category-type-${null==e?void 0:e.toLowerCase()}`):"",n=o?this.controller.promotionIcons[o].icon:"",s=o?this.t(`rewards-promotions-category-type-${null==o?void 0:o.toLowerCase()}`):""}return{principalCategoryType:_(l),principalCategoryText:_(null==t?void 0:t.benefit),categoryIcon:r,categoryText:a,secondaryCategoryIcon:n,secondaryCategoryText:s}}_renderCardArticlePromotion(t){var e,o,i;const a=null==t||null===(e=t.images)||void 0===e?void 0:e.find((t=>"DETAIL"===(null==t?void 0:t.id))),r=this._getCategoriesInfo(t);return p`
      <rewards-promotions-card-article
        image=${_(null==a?void 0:a.url)}
        with-icon
        content-title="${_(Gr(t,this.t("rewards-promotions-promotions-show-detail-text")))}"
        description=${_(null==t?void 0:t.name)}
        description-medium
        promotion-date="${this.t("rewards-promotions-promotions-until-date-text",{formattedDate:jr(null==t?void 0:t.endDate,this.controller.formatDate)})}"
        language="${this.controller.language}"
        principal-category=${null==r?void 0:r.principalCategoryType}
        principal-category-text=${this.t(null==r?void 0:r.principalCategoryText)}
        ?is-carousel="${null===(o=this.controller)||void 0===o?void 0:o.showPromotionsByFeature}"
        ?is-campaign="${(null==t?void 0:t.isCampaign)||!1}"
        category-icon=${null==r?void 0:r.categoryIcon}
        category-text=${null==r?void 0:r.categoryText}
        secondary-category-icon=${null==r?void 0:r.secondaryCategoryIcon}
        secondary-category-text=${null==r?void 0:r.secondaryCategoryText}
        ?deactivate-click=${null===(i=this.controller)||void 0===i?void 0:i.showPromotionsByFeature}
        variant="spotlight"
        @rewards-promotions-card-article-click="${()=>this._clickPromotion(t)}"
      ></rewards-promotions-card-article>
    `}_renderCardSalePromotion(t){var e,o;const i=null==t||null===(e=t.images)||void 0===e?void 0:e.find((t=>"LIST"===(null==t?void 0:t.id))),a=this._getCategoriesInfo(t);return p`
      <rewards-promotions-card-sale
        enable-interactivity
        variant="promotion-compact"
        title=${_(Gr(t,this.t("rewards-promotions-promotions-show-detail-text")))}
        image=${_(null==i?void 0:i.url)}
        loading-img-type="lazy"
        description=${_(null==t?void 0:t.name)}
        bold-description
        principal-category-type=${null==a?void 0:a.principalCategoryType}
        principal-category-text=${this.t(null==a?void 0:a.principalCategoryText)}
        category-icon=${null==a?void 0:a.categoryIcon}
        category-text=${null==a?void 0:a.categoryText}
        secondary-category-icon=${null==a?void 0:a.secondaryCategoryIcon}
        secondary-category-text=${null==a?void 0:a.secondaryCategoryText}
        @rewards-promotions-card-sale-item-click="${()=>this._clickPromotion(t)}"
        ?deactivate-click="${null===(o=this.controller)||void 0===o?void 0:o.showPromotionsByType}"
        language="${this.controller.language}"
      >
        <span slot="footer">
          ${this.t("rewards-promotions-promotions-until-date-text",{formattedDate:jr(null==t?void 0:t.endDate,this.controller.formatDate)})}
        </span>
      </rewards-promotions-card-sale>
    `}_promotionsListType(t,e){var o,i;return null==e||null===(o=e[t])||void 0===o?void 0:o.data.slice(0,null===(i=this.controller)||void 0===i?void 0:i._initialCarouselPromotionsNumber)}_generateItemsForPromotions(t){const e=null==t?void 0:t.map((t=>p`
          ${this._renderCardSalePromotion(t)}
        `));return this._generateItemsForCarousel(e)}_generateItemsForPromotionsFeature(t){const e=null==t?void 0:t.map((t=>p`
          ${this._renderCardArticlePromotion(t)}
        `));return this._generateItemsForCarousel(e)}_generateItemsForCarousel(t){return null==t?void 0:t.map((t=>({content:p`
        ${t}
      `})))}_handleClickOnPromotionCarousel(t,e,o,i){var a,r;const s=t.detail,n=null==e?void 0:e[s],l=i?"-hot":"";this.controller._promotionSelectedInfo=n,this.dispatchCustomEvent(`rewards-promotions-select-promotion-from${l}-carrousel`,{siteActionName:`points redeem-${o.toLowerCase()}${i?"-superior":"-centro"}-${s+1}-${e.length}:carrusel:PY-:${Kr(`-${null===(a=n.commerceInformation)||void 0===a?void 0:a.name}-${null===(r=n.promotionType)||void 0===r?void 0:r.id}`)}::${Kr(n.benefit)}:`}),this.dispatchCustomEvent("rewards-promotions-on-promotion-selected",n)}_renderCarouselForPromotions(t,e=[],o,i,a,r,s){return p`
      <bbva-carousel-default
        @carousel-default-item-tap="${e=>this._handleClickOnPromotionCarousel(e,t,r,s)}"
        type="swipe"
        ?loop="${o}"
        icon-selected
        selected="0"
        .items=${e}
        .scopedComponents=${[{tagName:i,class:a}]}
      ></bbva-carousel-default>
    `}_hasViewMoreType(t){var e,o,i,a,r;return(null===(e=this.controller)||void 0===e||null===(o=e.promotionsByType)||void 0===o||null===(i=o[t])||void 0===i||null===(a=i.data)||void 0===a?void 0:a.length)>=(null===(r=this.controller)||void 0===r?void 0:r._initialCarouselPromotionsNumber)}_hasViewMoreFeature(t){var e,o,i,a,r;return(null===(e=this.controller)||void 0===e||null===(o=e.promotionsByFeature)||void 0===o||null===(i=o[t])||void 0===i||null===(a=i.data)||void 0===a?void 0:a.length)>=(null===(r=this.controller)||void 0===r?void 0:r._initialCarouselPromotionsNumber)}_hasViewMoreCategory(t){var e,o,i,a,r;return(null===(e=this.controller)||void 0===e||null===(o=e.promotionsByCategory)||void 0===o||null===(i=o[t])||void 0===i||null===(a=i.data)||void 0===a?void 0:a.length)>=(null===(r=this.controller)||void 0===r?void 0:r._initialCarouselPromotionsNumber)}get _renderFavoritePanel(){var t;return null!==(t=this.controller)&&void 0!==t&&t.shouldShowFavoriteCategoriesPanel?p`
          <div class="basic-panel-container">${this._renderTooltip}</div>
        `:h}get _renderTooltip(){var t,e,o,i,a;const r=(null===(t=this.controller)||void 0===t||null===(e=t.categories)||void 0===e?void 0:e.filter((t=>t.isFavourite)))||[],s="basic-panel-container__tooltip"+(this.controller.availableTooltip?" tooltip-scroll":"");return p`
      <div class="${s}">
        <bbva-help-tooltip
          heading="${this.t("rewards-promotions-favorite-tooltip-title")}"
          link-text="${this.t("rewards-promotions-favorite-tooltip-link")}"
          description="${this.t("rewards-promotions-favorite-tooltip-description")}"
          horizontal-placement="center"
          @help-tooltip-link-click="${this._tooltipLinkClick}"
          @help-tooltip-overlay-click="${this._tooltipLinkClick}"
          ?opened="${this.controller.availableTooltip}"
        >
          ${null===(o=this.controller)||void 0===o?void 0:o.getBasicInfoPanel("rewards-promotions-favorite-info-panel-title",Wt,"rewards-promotions-favorite-info-panel-description","rewards-promotions-favorite-info-panel-link-text","rewards-promotions-show-modal","basic-info-panel",{mode:ps.MODES.favoriteCategories,data:{categories:null===(i=this.controller)||void 0===i?void 0:i.categories,storedCategories:r,storedCategoriesEdited:r,limitFavoriteCategoriesToSelect:null===(a=this.controller)||void 0===a?void 0:a.limitFavoriteCategoriesToSelect,action:"choose"}})}
        </bbva-help-tooltip>
      </div>
    `}_tooltipLinkClick(t){t.preventDefault(),t.stopPropagation(),this.dispatchCustomEvent("rewards-promotions-tooltip-link-click",!0)}get _renderFavoriteNotPromotionsPanel(){var t;if(null!==(t=this.controller)&&void 0!==t&&t.shouldShowFavoriteCategoriesNotPromotionsPanel){var e,o,i,a,r;const t=(null===(e=this.controller)||void 0===e||null===(o=e.categories)||void 0===o?void 0:o.filter((t=>t.isFavourite)))||[];return null===(i=this.controller)||void 0===i?void 0:i.getBasicInfoPanel("rewards-promotions-favorite-not-promotions-info-panel-title",Zt,"rewards-promotions-favorite-not-promotions-info-panel-description","rewards-promotions-favorite-not-promotions-info-panel-link-text","rewards-promotions-show-modal","basic-info-panel",{mode:ps.MODES.favoriteCategories,data:{categories:null===(a=this.controller)||void 0===a?void 0:a.categories,storedCategories:t,storedCategoriesEdited:t,limitFavoriteCategoriesToSelect:null===(r=this.controller)||void 0===r?void 0:r.limitFavoriteCategoriesToSelect,action:"change"}})}return h}_renderCarouselPromotionsType(t,e){var o;const i=this._promotionsListType(t,null===(o=this.controller)||void 0===o?void 0:o.promotionsByType),a=this._generateItemsForPromotions(i),r=(null==a?void 0:a.length)>=2,s=this._hasViewMoreType(t)?this.t("rewards-promotions-feature-type-promotions-view-more"):"";return p`
      <div class="carousel-container" ambient="light100">
        <bbva-header-category
          text="${e}"
          option-link=${s}
          @header-category-link-click="${()=>this._clickGetMorePromotions({group:"TYPE",type:t,categoryKey:`${s.toLowerCase()} ${e.toLowerCase()}`})}"
        ></bbva-header-category>
        ${this._renderCarouselForPromotions(i,a,r,"rewards-promotions-card-sale",Cr,e)}
      </div>
    `}get _renderCarouselFavoritePromotions(){var t,e,o,i,a,r,s,n,l;if(null===(t=this.controller)||void 0===t||!t.shouldShowFavoriteCategoriesPromotionsCarousel)return h;const c=null===(e=Object.keys((null===(o=this.controller)||void 0===o?void 0:o.promotionsByCategory)||{}))||void 0===e?void 0:e[0],d=null===(i=this.controller)||void 0===i||null===(a=i.promotionsByCategory)||void 0===a||null===(r=a[c])||void 0===r||null===(s=r.data)||void 0===s||null===(n=s.slice)||void 0===n?void 0:n.call(s,0,null===(l=this.controller)||void 0===l?void 0:l._initialCarouselPromotionsNumber),m=this._generateItemsForPromotions(d),u=(null==m?void 0:m.length)>=2,b=this._hasViewMoreCategory(c)?this.t("rewards-promotions-feature-type-promotions-view-more"):"";return p`
      <div class="favorite-carousel carousel-container" ambient="light100">
        <bbva-header-category
          text="rewards-promotions-favorite-carousel-title"
          option-link=${b}
          @header-category-link-click="${()=>this._clickGetMorePromotions({group:"CATEGORY",type:c,categoryKey:`${b.toLowerCase()} ${this.t("rewards-promotions-favorite-carousel-title").toLowerCase()}`})}"
        ></bbva-header-category>
        <bbva-text
          class="description"
          .text=${this.t("rewards-promotions-favorite-carousel-description")}
          ellipsis
          size="S"
          lines="2"
          unset
        ></bbva-text>
        ${this._renderCarouselForPromotions(d,m,u,"rewards-promotions-card-sale",Cr,this.t("rewards-promotions-favorite-carousel-title"))}
        <div class="favorite-carousel-links">
          <bbva-link
            class="favorite-carousel-change-link"
            @click="${()=>this._clickChangeFavoritePromotionsCategories()}"
          >
            ${this.t("rewards-promotions-favorite-carousel-change-link-text")}
          </bbva-link>
          <bbva-link
            class="favorite-carousel-remove-link"
            @click="${()=>this._clickRemoveFavoritePromotionsCategories()}"
          >
            ${this.t("rewards-promotions-favorite-carousel-remove-link-text")}
          </bbva-link>
        </div>
      </div>
    `}get _renderCarouselPromotionsFeature(){var t,e,o;const i="HOT",a=this._promotionsListType(i,null===(t=this.controller)||void 0===t?void 0:t.promotionsByFeature),r=this._generateItemsForPromotionsFeature(a),s=(null==r?void 0:r.length)>=2,n=this._hasViewMoreFeature(i)?this.t("rewards-promotions-feature-type-promotions-view-more"):"";return p`
      ${null===(e=this.controller)||void 0===e||!e.showPromotionsByFeature||Ur(null===(o=this.controller)||void 0===o?void 0:o.promotionsByFeature)?h:p`
            <div class="carousel-container" ambient="light100">
              <bbva-header-category
                text=${this.t("rewards-promotions-feature-promotions-title")}
                option-link=${n}
                @header-category-link-click="${()=>this._clickGetMorePromotions({group:"FEATURE",type:i,categoryKey:`${n.toLowerCase()} ${this.t("rewards-promotions-feature-promotions-title").toLowerCase()}`})}"
              ></bbva-header-category>
              ${this._renderCarouselForPromotions(a,r,s,"rewards-promotions-card-article",kr,this.t("rewards-promotions-feature-promotions-title"),!0)}
            </div>
          `}
    `}get _renderAllPromotionsType(){var t,e;const o=[];return null!==(t=this.controller)&&void 0!==t&&t.showPromotionsByType?(null===(e=this.controller)||void 0===e||e.promotionsTypeId.forEach((t=>{var e,i;const a=null==t?void 0:t.id;null!==(e=this.controller)&&void 0!==e&&null!==(i=e.promotionsByType)&&void 0!==i&&i[a]&&o.push(this._renderCarouselPromotionsType(a,null==t?void 0:t.promotionTypeTitle))})),o):o}get _renderPromotionList(){var t;return this.controller.somePromotionGroup?h:null===(t=this.controller.promotions.slice(0,this.controller._initialPagePromotionsNumber))||void 0===t?void 0:t.map(((t,e)=>0===e?p`
                  ${this._renderCardArticlePromotion(t)}
                `:p`
                  ${this._renderCardSalePromotion(t)}
                `))}get _isLoadingPromotionsSection(){var t,e;return(null===(t=this.controller)||void 0===t?void 0:t.isLoadingPromotions)||(null===(e=this.controller)||void 0===e?void 0:e.isLoadingShopTerms)}_renderPromotions(){var t;const e=null!==(t=this.controller)&&void 0!==t&&t.showError?this._renderServiceErrorNotificationMessage():this._renderPromotionsInfo();return this._isLoadingPromotionsSection?this._renderPromotionsSkeleton():e}_renderPromotionsSkeleton(){return{[this.controller.somePromotionGroup]:this._renderPromotionsSkeletonCarousels(),[!this.controller.somePromotionGroup]:this._renderPromotionsSkeletonList()}.true}_renderPromotionsSkeletonCarousels(){var t,e,o,i,a,r;return p`
      <div class="skeleton" ambient="light">
        <div class="carousel">
          <div class="skeleton-animation"></div>
          ${null!==(t=this.controller)&&void 0!==t&&t.showPromotionsByFeature?p`
                ${this._renderPromotionsFeatureSkeleton()}
              `:h}
          ${null!==(e=this.controller)&&void 0!==e&&e.showPromotionsByCategory?p`
                ${this._renderPromotionsSkeletonItems(1)}
              `:h}
          ${null!==(o=this.controller)&&void 0!==o&&o.showPromotionsByType?p`
                ${this._renderPromotionsSkeletonItems((null===(i=this.controller)||void 0===i||null===(a=i.promotionsTypeId)||void 0===a?void 0:a.length)||3)}
              `:h}
        </div>
        ${null!==(r=this.controller)&&void 0!==r&&r.showShopAccess?p`
              ${this._renderShopSkeleton()}
            `:h}
      </div>
    `}_renderPromotionsFeatureSkeleton(){return p`
      <div class="carousel-header"></div>
      <div class="carousel-skeleton-container">
        <div class="feature-skeleton-item"></div>
        <div class="top-list feature-top-list"></div>
        <div class="feature-skeleton-item"></div>
      </div>
    `}_renderPromotionsSkeletonItems(t){const e=p`
      <div class="carousel-header"></div>
      <div class="carousel-skeleton-container">
        <div class="border-item border-left-item"></div>
        <div class="list-item"></div>
        <div class="border-item border-right-item"></div>
      </div>
    `;return Array(t).fill(e)}_renderPromotionsSkeletonList(){return p`
      <div class="skeleton" ambient="light">
        <div class="skeleton-animation"></div>
        <div class="top-list"></div>
        <div class="list-item"></div>
        <div class="list-item"></div>
        <div class="list-item"></div>
        <div class="list-item"></div>
        <div class="list-item"></div>
      </div>
    `}_renderShopSkeleton(){return p`
      <div class="shop-skeleton" ambient="light">
        <div class="basic-item"></div>
      </div>
    `}_shopBannerClicked(){this.dispatchCustomEvent("rewards-promotions-shop-link-click",!0)}_renderShopBanner(){return p`
      <bbva-divider class="shop-divider"></bbva-divider>
      <button class="shop" ambient="light100" @click=${()=>this._shopBannerClicked()}>
        <div class="image">
          <span>${te}</span>
        </div>
        <div>
          <bbva-core-heading level="6">
            <bbva-text
              unset
              class="heading link"
              size="M"
              variant="spotlight"
              text="${this.t("rewards-promotions-shop-title")}"
            ></bbva-text>
          </bbva-core-heading>
          <bbva-text
            unset
            size="S"
            text=${this.t("rewards-promotions-shop-description")}
          ></bbva-text>
        </div>
      </button>
    `}_renderShop(){var t;return p`
      ${null!==(t=this.controller)&&void 0!==t&&t.showShopAccess?p`
            ${this._renderShopBanner()}
          `:h}
    `}_renderServiceErrorNotificationMessage(){var t;return null!==(t=this.controller)&&void 0!==t&&t.showPromotionsByOneType?h:this.controller._getErrorTemplate(!0,!1,!0)}_renderPromotionsInfo(){const t=this.controller._userHasCards||this.controller.userNotRegistered||this.controller.enabledPromotionsWithoutProducts?this._promotionsInfoOrList:this._renderPromotionsNoCards();return this.controller.isLoadingPanelProcess?p``:t}_selectPromotionsTemplate(){return p`
      ${this._renderCarouselPromotionsFeature} ${this._renderFavoritePanel}
      ${this._renderFavoriteNotPromotionsPanel} ${this._renderCarouselFavoritePromotions}
      ${this._renderAllPromotionsType} ${this._renderPromotionList}
    `}get _isScrollFinished(){return this.controller.hasScroll&&this.controller.availableTooltip&&this.controller._finishScroll}get _promotionsInfoOrList(){return this.controller._noPromotionsGroup?this._renderNoPromotionsInfo():p`
          <div
            class="${rt({"promotion-list":!0,"has-scroll":this.controller.hasScroll,"finish-scroll":this._isScrollFinished})}"
          >
            ${this._renderSearchPromotions()} ${this._selectPromotionsTemplate()}
            ${this._renderShop()}
          </div>
        `}_renderSearchPromotions(){var t;return null!==(t=this.controller)&&void 0!==t&&t.showSearchPromotions?p`
          <button
            class="promotions-search"
            data-tag-name="bbva-form-input"
            @click="${()=>this._clickOpenSearch()}"
            aria-label="${this.t("rewards-promotions-search-label")}"
          >
            <rewards-promotions-fake-search-input
              tabindex="-1"
              label="${this.t("rewards-promotions-search-label")}"
            ></rewards-promotions-fake-search-input>
          </button>
        `:h}_clickOpenSearch(){var t,e,o,i,a,r,s,n;this.dispatchCustomEvent("rewards-promotions-check-location-permission-granted","location"),this.dispatchCustomEvent("rewards-promotions-show-modal",{mode:ps.MODES.search,data:{categories:null===(t=this.controller)||void 0===t?void 0:t.categories,locationDisabled:null===(e=this.controller)||void 0===e?void 0:e.locationDisabled,storedCategories:null===(o=this.controller)||void 0===o?void 0:o._storedCategories,searchName:null===(i=this.controller)||void 0===i?void 0:i._searchName,storedCategoriesEdited:null===(a=this.controller)||void 0===a?void 0:a._storedCategories,searchNameEdited:null===(r=this.controller)||void 0===r?void 0:r._searchName,showSearchByLocation:null===(s=this.controller)||void 0===s?void 0:s.showSearchByLocation,showSearchByPromotionType:null===(n=this.controller)||void 0===n?void 0:n.showSearchByPromotionType}})}_renderButtonMore(){var t;return!this.controller.somePromotionGroup&&this.controller._userHasCards&&(null===(t=this.controller.promotions)||void 0===t?void 0:t.length)>this.controller._initialPagePromotionsNumber&&!this.controller.isLoadingPromotions?p`
          <div class="center">
            <bbva-link
              class="show-more-promotion-link"
              @click="${()=>this._clickGetMorePromotions({group:"DEFAULT",type:"MAIN"})}"
            >
              ${this.t("rewards-promotions-link-get-more-promotions-text")}
            </bbva-link>
          </div>
        `:""}_clickPromotion(t){this.controller._promotionSelectedInfo=t,this.dispatchCustomEvent("rewards-promotions-on-promotion-selected",t)}render(){return p`
      ${this._renderPromotions()} ${this._renderButtonMore()}
    `}}class bs extends Xr{async initConfig(){this._scrollToItem(),this._observerOptions={threshold:.8},this._observer=new IntersectionObserver(this.manageOnScroll.bind(this),this._observerOptions),this.controller._moveScroll=!1}get _lastPageReached(){var t,e,o;return!(null!==(t=this.controller.paginationInfo)&&void 0!==t&&null!==(e=t.links)&&void 0!==e&&null!==(o=e.next)&&void 0!==o&&o.trim())}get _promotionsBottomTemplate(){var t;return null!==(t=this.controller.promotions)&&void 0!==t&&t.length&&this.controller.showError?this.controller.isLoadingPromotions?this._listSkeletonTemplate:this.controller._getErrorTemplate(!1,this.controller.somePromotionGroup):this._lastPageReached&&!this.controller.isLoadingPromotions?"":this._listSkeletonTemplate}clickRetry(){this._requestData()}resetPart(){this._observer=null}_clickPromotion(t){this.controller._moveScroll=!0,this.controller._promotionSelectedInfo=t,this.dispatchCustomEvent("rewards-promotions-on-promotion-selected",t)}manageOnScroll(t){var e,o,i;null===(e=t[0])||void 0===e||!e.isIntersecting||this.controller.isLoadingPromotions||this.controller.showError||this._isEmptySpecificPromotions||!this.controller.visiblePage||(this._requestData(),null===(o=this._observer)||void 0===o||o.unobserve(null===(i=t[0])||void 0===i?void 0:i.target))}_promotionIntersectionObserver(){var t,e,o;const i=null===(t=this.controller.scrollableParentElement())||void 0===t||null===(e=t.querySelector)||void 0===e||null===(o=e.call(t,".promotions-container"))||void 0===o?void 0:o.children,a=i[i.length-1];var r;a&&!this.controller.isLoadingPromotions&&(null===(r=this._observer)||void 0===r||r.observe(a))}static _simpleParamRegex(t){return new RegExp(`.*${t}=([^&$]+)`)}static _simpleComposeValue(t){return t}_requestData(){var t,e;const o=decodeURIComponent((null===(t=this.controller.paginationInfo)||void 0===t||null===(e=t.links)||void 0===e?void 0:e.next)||"");if(null!=o&&o.length){const t=[{id:"paginationKey",type:"simple"}].reduce(((t,e)=>{var i;const a={...t},r=null==bs||null===(i=bs[`_${e.type}ParamRegex`])||void 0===i?void 0:i.call(bs,e.id),s=null==o?void 0:o.match(r),n=null==s?void 0:s[1];var l;n&&(a[e.id]=null==bs||null===(l=bs[`_${e.type}ComposeValue`])||void 0===l?void 0:l.call(bs,n));return a}),{});this.controller._moveScroll=!0,this.dispatchCustomEvent("rewards-promotions-request-data",t)}}get _renderPromotions(){var t,e,o;return null!==(t=this.controller)&&void 0!==t&&null!==(e=t.promotions)&&void 0!==e&&e.length?null===(o=this.controller.promotions)||void 0===o?void 0:o.map((t=>p`
            ${this._renderCardSalePromotion(t)}
          `)):this._renderEmptyPromotions}get _searchName(){var t;return(null===(t=this.controller.promotionsSearchFilters)||void 0===t?void 0:t.searchName)||""}get _emptyFilters(){var t;return!(this._searchName||null!==(t=this._storedCategories)&&void 0!==t&&t.length)}get _searchNameParsed(){return this._searchName?{name:this._searchName,removable:!0,id:"search-name",group:"commerceInformation.name"}:null}get _storedCategories(){var t;return(null===(t=this.controller.promotionsSearchFilters)||void 0===t?void 0:t.storedCategories)||[]}get _hasLocationCategory(){var t;return!(null===(t=this._storedCategories)||void 0===t||!t.find((t=>"LOCATION"===(null==t?void 0:t.id))))}get _currentFilters(){return[].concat(this._searchNameParsed?this._searchNameParsed:[],this._storedCategories)}_removeFilter(t){var e,o,i;const a="search-name"===this._currentFilters[t].id,r=this._currentFilters.filter(((e,o)=>"search-name"!==e.id&&o!==t));this.controller.promotionsSearchFilters={...null===(e=this.controller)||void 0===e?void 0:e.promotionsSearchFilters,searchName:a?"":null===(o=this.controller)||void 0===o||null===(i=o.promotionsSearchFilters)||void 0===i?void 0:i.searchName,storedCategoriesEdited:[...r],storedCategories:r},this._emptyFilters?this.controller.navigateToPreviousPage():(this._sendRemoveFilter(),this._sendFilters())}_sendRemoveFilter(){this.dispatchCustomEvent("rewards-promotion-remove-filter",!0)}_sendFilters(){this.dispatchCustomEvent("rewards-promotion-modal-search",this.controller.promotionsSearchFilters)}_openModal(){this.dispatchCustomEvent("rewards-promotions-show-modal",{mode:"search",data:{...this.controller.promotionsSearchFilters,fromExternalEdited:!0}})}get _renderTopFilters(){return this._isSearchType?p`
        <div class="filter-stores">
          <bbva-form-filter
            adjust-filter-tag
            .filters="${this._currentFilters}"
            .editableLabel="${this.t("rewards-promotions-filter-editable-label")}"
            ambient="dark400"
            @form-filter-edit-click="${()=>this._openModal()}"
            @form-filter-close-click="${t=>this._removeFilter(t.detail)}"
          >
          </bbva-form-filter>
        </div>
      `:h}get _renderEmptyPromotions(){let t="",e=this.t("rewards-promotions-categories-empty-description");return this._isSearchType&&(t=this.t("rewards-promotions-search-empty-title"),e=this.t("rewards-promotions-search-empty-description")),p`
      <rewards-promotions-panel-info
        class="empty-state"
        heading-level-title="h2"
        .microillustration="${j}"
        .heading="${t}"
        text="${e}"
      >
      </rewards-promotions-panel-info>
    `}_classForPromotions(t){let e={};return t&&t.split(" ").forEach((t=>{e={...e,[t]:!this._enableClassPromo}})),e}_renderCardSalePromotion(t){var e,o,i;let a,r,s,n;const l=null==t||null===(e=t.images)||void 0===e?void 0:e.find((t=>"LIST"===(null==t?void 0:t.id))),c=this.controller.promotionCategoriesMap[null==t||null===(o=t.promotionType)||void 0===o?void 0:o.id]??(null===(i=this.controller.promotionCategoriesMap)||void 0===i?void 0:i.RATE);if(null==t?void 0:t.isCampaign)a=this.t("rewards-promotions-campaign-category-text"),r=yt(),n="",s="";else{var d,m,u,h,b,v,g,y,f,$;const e=null===(d=t.usageTypes.find((t=>"ONLINE"===(null==t?void 0:t.id))))||void 0===d?void 0:d.id,o=null===(m=t.usageTypes.find((t=>"PHYSICAL"===(null==t?void 0:t.id))))||void 0===m?void 0:m.id;let i="";const l=null==t||null===(u=t.stores)||void 0===u||null===(h=u[0])||void 0===h?void 0:h.distance;var w;if(o&&this._isSearchType&&this._hasLocationCategory&&null!=l&&l.lengthType)i=this.t("rewards-promotions-category-type-physical-distance",{units:Yr(null==l?void 0:l.length,null==l||null===(w=l.lengthType)||void 0===w?void 0:w.id,1)});const c=i?null===(b=this.controller)||void 0===b||null===(v=b.promotionIcons)||void 0===v||null===(g=v.DISTANCE)||void 0===g?void 0:g.icon:null===(y=this.controller)||void 0===y||null===(f=y.promotionIcons)||void 0===f||null===($=f[o])||void 0===$?void 0:$.icon;n=o?c:"",a=e?this.t(`rewards-promotions-category-type-${null==e?void 0:e.toLowerCase()}`):"",r=e?this.controller.promotionIcons[e].icon:"",s=o?i||this.t(`rewards-promotions-category-type-${null==o?void 0:o.toLowerCase()}`):""}const S={principalCategoryType:_(c),principalCategoryText:_(null==t?void 0:t.benefit),categoryIcon:r,categoryText:a,secondaryCategoryIcon:n,secondaryCategoryText:s};return p`
      <rewards-promotions-card-sale
        enable-interactivity
        class=${rt(this._classForPromotions(null==t?void 0:t.classForItem))}
        variant="promotion-compact"
        title=${_(Gr(t,this.t("rewards-promotions-promotions-show-detail-text")))}
        image=${_(null==l?void 0:l.url)}
        loading-img-type="lazy"
        description=${_(null==t?void 0:t.name)}
        bold-description
        ?is-campaign="${(null==t?void 0:t.isCampaign)||!1}"
        principal-category-type=${null==S?void 0:S.principalCategoryType}
        principal-category-text=${this.t(null==S?void 0:S.principalCategoryText)}
        category-icon=${null==S?void 0:S.categoryIcon}
        category-text=${null==S?void 0:S.categoryText}
        secondary-category-icon=${null==S?void 0:S.secondaryCategoryIcon}
        secondary-category-text=${null==S?void 0:S.secondaryCategoryText}
        @click="${()=>this._clickPromotion(t)}"
      >
        <span slot="footer">
          ${this.t("rewards-promotions-promotions-until-date-text",{formattedDate:jr(null==t?void 0:t.endDate,this.controller.formatDate)})}
        </span>
      </rewards-promotions-card-sale>
    `}_scrollToItem(){var t,e;const o=null===(t=this.controller.scrollableParentElement())||void 0===t||null===(e=t.children)||void 0===e?void 0:e[this.controller.scrollableTopItemIndex];if(o&&!this.controller._moveScroll&&!this.controller.isPromotionGroup){var i;const t=o.offsetTop-this.controller.scrollableParentElement().scrollTop;null===(i=this.controller.scrollableParentElement())||void 0===i||i.scrollBy({top:t,left:0,behavior:"smooth"})}var a;this.controller.isPromotionGroup&&(null===(a=this.controller.scrollableParentElement())||void 0===a||a.scrollTo(0,0))}get _isEmptyPromotions(){var t;return!(null!==(t=this.controller.promotions)&&void 0!==t&&t.length)}get _isEmptySpecificPromotions(){return this._isEmptyPromotions&&(this._isSearchType||this._isCategoryType)}get _isSearchType(){return"SEARCH"===this.controller.selectedPromotionsGroup}get _isCategoryType(){return"CATEGORY"===this.controller.selectedPromotionsGroup}_getTemplate(){var t;let e="";return null!==(t=this.controller)&&void 0!==t&&t.hasPanelError?e=this._panelErrorTemplate:!this._isEmptyPromotions||this._isEmptySpecificPromotions?(e=this._allPromotionsTemplate,this.controller.updateComplete.then((()=>this._promotionIntersectionObserver()))):e=this._listSkeletonTemplate,e}get _listSkeletonTemplate(){return Array.from(Array(this.controller._itemsForSkeleton)).map((()=>p`
          <div class="item-skeleton"></div>
        `))}get _renderFavoriteCategoriesToolbar(){var t;return p`
      ${this._isCategoryType?p`
            <div class="view-more-favorite-toolbar">
              <bbva-button-row
                ambient="dark"
                .options="${[{icon:ee(),label:this.t("rewards-promotions-favorite-view-more-edit-button-text"),id:"button-1"},{icon:Ht(),label:this.t("rewards-promotions-favorite-view-more-remove-button-text"),id:"button-2"}]}"
                @button-row-item-click="${null===(t=this.controller)||void 0===t?void 0:t._handleFavoriteCategoriesToolbarButtonClicked}"
                disabled-tabindex=""
              ></bbva-button-row>
            </div>
          `:h}
    `}get _panelErrorTemplate(){var t,e,o,i,a,r,s,n,l,c,d,m,u,h,b,v,g,y,f;const $=null!==(t=this.controller)&&void 0!==t&&t.assistancePhone?null===(e=this.controller)||void 0===e?void 0:e._clickCallBBVA:null===(o=this.controller)||void 0===o?void 0:o.navigateToPreviousPage;return p`
      <rewards-promotions-panel-info
        heading-level-title="h2"
        .microillustration="${ht}"
        heading="${null===(i=this.controller)||void 0===i||null===(a=i.panelErrorData)||void 0===a?void 0:a.heading}"
        text="${null===(r=this.controller)||void 0===r||null===(s=r.panelErrorData)||void 0===s?void 0:s.text}"
      >
      </rewards-promotions-panel-info>
      <rewards-promotions-panel-button
        button-variant="default"
        variant="fixed"
        ?show="${((null===(n=this.controller)||void 0===n||null===(l=n.panelErrorData)||void 0===l?void 0:l.buttonText)||(null===(c=this.controller)||void 0===c||null===(d=c.panelErrorData)||void 0===d?void 0:d.linkText))&&(null===(m=this.controller)||void 0===m?void 0:m.visiblePage)}"
        button-text="${_(null===(u=this.controller)||void 0===u||null===(h=u.panelErrorData)||void 0===h?void 0:h.buttonText)}"
        footer-link="${_(null===(b=this.controller)||void 0===b||null===(v=b.panelErrorData)||void 0===v?void 0:v.linkText)}"
        @panel-button-item-click="${null!==(g=this.controller)&&void 0!==g&&null!==(y=g.panelErrorData)&&void 0!==y&&y.isRetry?this._panelErrorRetry:$}"
        @rewards-promotions-panel-button-footer-link-click="${null===(f=this.controller)||void 0===f?void 0:f.navigateToPreviousPage}"
      >
      </rewards-promotions-panel-button>
    `}_panelErrorRetry(){this.dispatchCustomEvent("rewards-promotions-page-on-panel-retry")}get _allPromotionsTemplate(){return p`
      ${this._renderTopFilters} ${this._renderFavoriteCategoriesToolbar}
      <div
        class="${rt({"promotions-container":!0,"with-filters":this._isSearchType})}"
      >
        ${this._renderPromotions} ${this._promotionsBottomTemplate}
      </div>
    `}get _containerClass(){const t=this._isEmptyPromotions||this.controller.hasPanelError;return rt({"empty-container":t,"promotions-list-scroll":!0})}render(){return p`
      <bbva-transition-container
        class="promotions-list"
        header-text="${this.t(this.controller.headerTextKey)}"
        header-type="first-level-sequential"
        header-show-left-icon
        ?visible="${this.controller.visiblePage}"
        @header-main-icon-click=${this.controller._handleHeaderLeftClick}
        header-left-icon-label="${this.t("rewards-promotions-icon-exit")}"
        header-left-icon-aria-label="${this.t("rewards-promotions-icon-exit-accessibility-text")}"
        @visible-changed=${this.controller._changeVisible}
        .headerButtons="${_(this.controller.headerButtons)}"
      >
        <div slot="slot-content" class="intersect-container">
          <div class="${this._containerClass}">${this._getTemplate()}</div>
        </div>
      </bbva-transition-container>
    `}}class vs extends Xr{render(){var t,e;return p`
      <bbva-transition-container
        class="promotions-list"
        header-text="${this.t("rewards-promotions-view-more-stores-title")}"
        header-type="first-level-sequential"
        header-show-left-icon
        ?visible="${this.controller.visiblePage}"
        @header-main-icon-click=${this.controller._handleHeaderLeftClick}
        header-left-icon-label="${this.t("rewards-promotions-icon-exit")}"
        header-left-icon-aria-label="${this.t("rewards-promotions-icon-exit-accessibility-text")}"
        @visible-changed=${this.controller._changeVisible}
      >
        <div slot="slot-content">
          ${null===(t=this.controller)||void 0===t||null===(e=t.moreStores)||void 0===e?void 0:e.map(((t,e)=>{var o,i,a,r,s,n,l,c,d;return p`
              <div
                class="store"
                onclick="void(0)"
                @click="${()=>{var e;return null===(e=this.controller)||void 0===e?void 0:e.handleStoreClick(null==t?void 0:t.location)}}"
                @keyup="${()=>{}}"
              >
                <div class="store-information">
                  <bbva-link>${null==t?void 0:t.name}</bbva-link>
                  ${null!==(o=Object.keys(null===(i=this.controller)||void 0===i?void 0:i.location))&&void 0!==o&&o.length&&null!=t&&null!==(a=t.distance)&&void 0!==a&&a.length?p`
                        <bbva-text
                          data-selector="promotion-detail-store-description-distance"
                          text=${this.t("rewards-promotions-stores-distance",{units:Yr(null==t||null===(r=t.distance)||void 0===r?void 0:r.length,null==t||null===(s=t.distance)||void 0===s||null===(n=s.lengthType)||void 0===n?void 0:n.id,1)})}
                          size="S"
                          unset
                        ></bbva-text>
                      `:h}
                </div>
                <bbva-text
                  data-selector="promotion-detail-store-description-list"
                  text=${`${null==t||null===(l=t.location)||void 0===l?void 0:l.formattedAddress}, ${null==t||null===(c=t.location)||void 0===c?void 0:c.city}, ${null==t||null===(d=t.location)||void 0===d?void 0:d.state}`}
                  size="S"
                  unset
                ></bbva-text
                ><bbva-divider
                  ?hidden="${e===this.controller.moreStores.length-1}"
                ></bbva-divider>
              </div>
            `}))}
        </div>
      </bbva-transition-container>
    `}}var gs=t`
:host {
  display: block;
  box-sizing: border-box;
  min-height: 100%;
  background-color: var(--_rewards-promotion-background-color);
  --_rewards-promotion-background-color: var(--rewards-promotions-dark-mode-bg, var(--rewards-promotions-bg-color, var(--colorsSecondary100, ${i(W.secondary100)})));
  --_rewards-promotion-background-color-basic-list-promotions: var(--rewards-promotions-dark-mode-bg, var(--colorsPrimaryCoreLightened, ${i(W.primaryCoreLightened)}));
  --_rewards-promotion-container-background-color: var(--rewards-promotions-dark-mode-bg, var(--colorsPrimaryCoreDarkened, ${i(W.primaryCoreDarkened)}));
  --bbva-carousel-default-slide-bg: var(--colorsPrimaryCoreLightened, ${i(W.primaryCoreLightened)});
  --bbva-carousel-default-gradient-color: transparent;
  --_rewards-promotions-color-text: var(--rewards-promotions-dark-mode-text-color , var(--colorsSecondary600, ${i(W.secondary600)}));
  --rewards-promotions-page-promotions-extra-header: 7rem;
  --rewards-promotions-panel-button-box-shadow: var(--rewards-promotions-bg-color, var(--colorsPrimaryCoreLightened, ${i(W.primaryCoreLightened)}));
  --_rewards-promotions-skeleton-quote-color: var(--rewards-promotions-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsSecondary200, ${i(W.secondary200)})));
  --_rewards-promotions-skeleton-quote-bg: var(--rewards-promotions-dark-mode-skeleton-quote-bg, var(--skeleton-quote-bg, var(--colorsPrimaryCoreLightened, ${i(W.primaryCoreLightened)})));
  --_rewards-promotions-skeleton-animated-layer-bg: var(--rewards-promotions-dark-mode-skeleton-animated-layer-bg, var(--rewards-promotions-skeleton-animated-layer-bg, var(--colorsPrimaryCoreLightened, ${i(W.primaryCoreLightened)})));
  --_rewards-promotions-shop-active-bg: var(--rewards-promotions-shop-dark-mode-active-bg, var(--rewards-promotions-shop-active-bg, var(--colorsPrimaryCoreLightened, ${i(W.primaryCoreLightened)})));
  --_rewards-promotions-shop-heading-active-link-color: var(--rewards-promotions-shop-dark-mode-active-link, var(--rewards-promotions-shop-active-link, var(--colorsPrimaryCore, ${i(W.primaryCore)})));
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

.carousel-container {
  margin: 0 0 0.75rem;
}
.carousel-container:first-child {
  margin: 1rem 0;
}
.carousel-container [data-tag-name=bbva-header-category] {
  padding: var(--rewards-promotions-header-padding, 0 1rem);
}

.filter-stores {
  position: sticky;
  top: 0;
  flex-shrink: 0;
  min-height: 0;
  width: 100%;
  z-index: 1;
  height: 3.5rem;
  background-color: var(--rewards-promotions-dark-mode-bg, var(--promotions-stores-map-dark-mode-filter-stores-bg-color, var(--colorsPrimaryCoreDarkened, ${i(W.primaryCoreDarkened)})));
}

.skeleton-animation {
  position: absolute;
  overflow: hidden;
  pointer-events: none;
  background: var(--_rewards-promotions-skeleton-animated-layer-bg);
  background-repeat: no-repeat;
  contain: strict;
  width: 100%;
  height: 100%;
  min-height: 100vh;
  left: 0;
  top: var(--safe-area-inset-top, 0);
  right: 0;
  bottom: 0;
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
}

.store-information {
  display: flex;
  margin-top: 1rem;
  justify-content: space-between;
}
.store-information [data-tag-name=bbva-link] {
  font-size: var(--typographyTypeMedium, ${i(a.typeMedium)});
  margin-top: 0;
  margin-bottom: 0;
}

:host([mode=detail]), :host([mode=viewMoreStores]) {
  --bbva-transition-container-padding: 0;
  --bbva-transition-container-padding-bottom: 0;
  --bbva-transition-container-ios-header-bg-color: var(--colorsPrimaryCoreDarkened, ${i(W.primaryCoreDarkened)});
  --rewards-promotions-card-article-object-position: "50% 30%";
}
:host([mode=detail]) .promotion-info-panel, :host([mode=viewMoreStores]) .promotion-info-panel {
  padding: 0.5rem 0;
}
:host([mode=detail]) .participant-card-content, :host([mode=viewMoreStores]) .participant-card-content {
  display: flex;
  align-items: center;
  padding: 1rem 1rem 0.9375rem;
}
:host([mode=detail]) .participant-card-image, :host([mode=viewMoreStores]) .participant-card-image {
  margin-right: 0.5rem;
}
:host([mode=detail]) .skeleton, :host([mode=viewMoreStores]) .skeleton {
  min-height: 100vh;
  opacity: 0;
  background-color: var(--colorsPrimaryCoreLightened, ${i(W.primaryCoreLightened)});
}
:host([mode=detail]) .skeleton .basic-skeleton, :host([mode=viewMoreStores]) .skeleton .basic-skeleton {
  width: 100%;
  height: 15rem;
  margin-bottom: 1.75rem;
  pointer-events: none;
  transition: opacity 0.4s ease-in-out;
  background-repeat: no-repeat;
  background-image: linear-gradient(var(--_rewards-promotions-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_rewards-promotions-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_rewards-promotions-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_rewards-promotions-skeleton-quote-color) 50%);
  background-color: var(--_rewards-promotions-skeleton-quote-bg);
  background-size: 100% 144px, calc((52% * 2) + (16px/ 2)) 16px, calc((89% * 2) + (16px/ 2)) 16px, calc((73% * 2) + (16px/ 2)) 16px;
  background-position: 0 0, 16px 168px, 16px 200px, 16px 224px;
}
:host([mode=detail]) .skeleton .cards-skeleton, :host([mode=viewMoreStores]) .skeleton .cards-skeleton {
  width: 100%;
  height: 3.75rem;
  margin-top: 1rem;
  pointer-events: none;
  transition: opacity 0.4s ease-in-out;
  background-repeat: no-repeat;
  background-image: linear-gradient(var(--_rewards-promotions-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_rewards-promotions-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_rewards-promotions-skeleton-quote-color) 50%), linear-gradient(var(--_rewards-promotions-skeleton-quote-color) 100%, transparent 0);
  background-color: var(--_rewards-promotions-skeleton-quote-bg);
  background-size: 64px 40px, calc((35% * 2) + (16px/ 2)) 16px, calc((15% * 2) + (16px/ 2)) 16px, 100% 1px;
  background-position: 16px 0px, 98px 0px, 98px 24px, 100% 56px;
}
:host([mode=detail]) .skeleton .about-commerce-skeleton, :host([mode=viewMoreStores]) .skeleton .about-commerce-skeleton {
  margin-top: 2.25rem;
}
:host([mode=detail]) .skeleton .commerce-item-skeleton, :host([mode=viewMoreStores]) .skeleton .commerce-item-skeleton {
  width: 100%;
  height: 3.5rem;
  pointer-events: none;
  transition: opacity 0.4s ease-in-out;
  background-repeat: no-repeat;
  background-image: linear-gradient(var(--_rewards-promotions-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_rewards-promotions-skeleton-quote-color) 50%), linear-gradient(var(--_rewards-promotions-skeleton-quote-color) 100%, transparent 0);
  background-color: var(--_rewards-promotions-skeleton-quote-bg);
  background-size: 24px 24px, calc((80% * 2) + (16px/ 2)) 16px, 100% 1px;
  background-position: 16px 0px, 48px 4px, 100% 40px;
}
:host([mode=detail]) .skeleton .stores-skeleton, :host([mode=viewMoreStores]) .skeleton .stores-skeleton {
  margin-top: 1.5rem;
}
:host([mode=detail]) .skeleton .stores-item-skeleton, :host([mode=viewMoreStores]) .skeleton .stores-item-skeleton {
  width: 100%;
  height: 2.5rem;
  pointer-events: none;
  transition: opacity 0.4s ease-in-out;
  background-repeat: no-repeat;
  background-image: linear-gradient(-60deg, transparent 50%, var(--_rewards-promotions-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_rewards-promotions-skeleton-quote-color) 50%);
  background-color: var(--_rewards-promotions-skeleton-quote-bg);
  background-size: calc((27% * 2) + (16px/ 2)) 16px, calc((36% * 2) + (16px/ 2)) 16px;
  background-position: 16px 0px, 187px 0px;
}
:host([mode=detail]) [data-tag-name=rewards-promotions-card-article], :host([mode=viewMoreStores]) [data-tag-name=rewards-promotions-card-article] {
  pointer-events: none;
  box-shadow: none;
  --rewards-promotions-card-article-color: var(--colorsSecondary600, ${i(W.secondary600)});
  --rewards-promotions-card-article-title-color-pressed: var(--colorsSecondary600, ${i(W.secondary600)});
  --rewards-promotions-card-article-bg-color-pressed: var(--colorsPrimaryCoreLightened, ${i(W.primaryCoreLightened)});
  --rewards_promotions_card-article-bg-color: --_rewards-promotion-background-color;
}
:host([mode=detail]) [data-tag-name=bbva-header-category], :host([mode=viewMoreStores]) [data-tag-name=bbva-header-category] {
  padding: 0.5rem 1rem;
}
:host([mode=detail]) [data-tag-name=bbva-carousel-swipe], :host([mode=viewMoreStores]) [data-tag-name=bbva-carousel-swipe] {
  background-color: var(--colorsSecondary100, ${i(W.secondary100)});
}
:host([mode=detail]) [data-tag-name=bbva-text], :host([mode=viewMoreStores]) [data-tag-name=bbva-text] {
  margin: 0 1rem;
}
:host([mode=detail]) [data-tag-name=bbva-link], :host([mode=viewMoreStores]) [data-tag-name=bbva-link] {
  display: block;
  text-align: start;
  margin: 0.5rem 1rem;
  --bbva-link-color: var(--colorsPrimaryMedium, ${i(W.primaryMedium)});
}
:host([mode=detail]) .about-stores-link, :host([mode=viewMoreStores]) .about-stores-link {
  display: flex;
}
:host([mode=detail]) [data-selector=promotion-detail-about-stores-title], :host([mode=viewMoreStores]) [data-selector=promotion-detail-about-stores-title] {
  margin-top: 0.5rem;
}
:host([mode=detail]) [data-selector=promotion-detail-store-title], :host([mode=viewMoreStores]) [data-selector=promotion-detail-store-title] {
  margin-top: 1rem;
}
:host([mode=detail]) [data-selector=promotion-detail-extended-description-title], :host([mode=viewMoreStores]) [data-selector=promotion-detail-extended-description-title] {
  margin-top: 0.5rem;
}
:host([mode=detail]) [data-selector=promotion-detail-store-description], :host([mode=viewMoreStores]) [data-selector=promotion-detail-store-description] {
  margin-bottom: 0.5rem;
}
:host([mode=detail]) [data-selector=promotion-detail-store-description-list], :host([mode=viewMoreStores]) [data-selector=promotion-detail-store-description-list] {
  margin-bottom: 0.9375rem;
}
:host([mode=detail]) [data-selector=promotion-detail-exchange-coupon-button-wrapper], :host([mode=viewMoreStores]) [data-selector=promotion-detail-exchange-coupon-button-wrapper] {
  padding: 1rem 1.25rem;
  position: sticky;
  bottom: 0;
  background: var(--_rewards-promotion-background-color-basic-list-promotions);
}
:host([mode=detail]) [data-selector=promotion-detail-card-associated-stores-title], :host([mode=viewMoreStores]) [data-selector=promotion-detail-card-associated-stores-title] {
  margin: 1rem 0;
}
:host([mode=detail]) [data-tag-name=rewards-promotions-panel-button], :host([mode=viewMoreStores]) [data-tag-name=rewards-promotions-panel-button] {
  --bbva-link-color: var(--colorsPrimaryMedium, ${i(W.primaryMedium)});
}
:host([mode=detail]) .participant-card-name [data-tag-name=bbva-text], :host([mode=viewMoreStores]) .participant-card-name [data-tag-name=bbva-text] {
  margin: 0;
}

:host([mode=list]) {
  display: block;
  box-sizing: border-box;
  --rewards-promotions-card-article-object-position: "center center";
  --rewards-promotions-card-article-header-img-height: "45%";
  --_background-ios-header: var(--colorsPrimaryCoreDarkened, ${i(W.primaryCoreDarkened)});
  --rewards-promotions-card-article-object-position: "center center";
  --bbva-list-offer-illustration-container-bg-color: var(--colorsPrimarySubduedLight, ${i(W.primarySubduedLight)});
  --bbva-list-offer-header-content-font-size: var(--typographyTypeSmall, ${i(a.typeSmall)});
  --bbva-list-offer-header-content-line-height: var(--lineHeightTypeSmall, ${i(r.typeSmall)});
  --bbva-list-offer-link-font-size: var(--typographyTypeSmall, ${i(a.typeSmall)});
}
@supports (padding-top: constant(safe-area-inset-top)) {
  :host([mode=list]) {
    --bbva-rewards-promotions-safe-area-inset-top: constant(safe-area-inset-top);
  }
}
@supports (padding-top: env(safe-area-inset-top)) {
  :host([mode=list]) {
    --bbva-rewards-promotions-safe-area-inset-top: env(safe-area-inset-top);
  }
}
:host([mode=list]) .notification-error-message {
  background-color: var(--_rewards-promotion-background-color-basic-list-promotions);
  position: absolute;
  inset: 0;
  padding: 1.5rem 1rem;
  height: 100vh;
}
:host([mode=list]) [data-tag-name=bbva-carousel-default] {
  z-index: 0;
  padding-bottom: var(--rewards-promotions-carousel-padding, 0);
}
:host([mode=list]) [data-tag-name=bbva-divider].shop-divider {
  display: block;
  padding-top: 1rem;
}
:host([mode=list]) .shop {
  all: unset;
  position: relative;
  box-sizing: border-box;
  width: 100%;
  display: flex;
  gap: 0.5rem;
  padding: 1.5rem 1rem 1rem;
  cursor: pointer;
}
:host([mode=list]) .shop:active {
  background-color: var(--_rewards-promotions-shop-active-bg);
}
:host([mode=list]) .shop:active .heading {
  color: var(--_rewards-promotions-shop-heading-active-link-color);
}
:host([mode=list]) .shop .image {
  flex: none;
  width: 3rem;
  height: 3rem;
}
:host([mode=list]) .skeleton {
  min-height: 100vh;
  opacity: 0;
  background-color: var(--colorsSecondary100, ${i(W.secondary100)});
}
:host([mode=list]) .skeleton .top-list {
  width: 100%;
  height: 15rem;
  pointer-events: none;
  transition: opacity 0.4s ease-in-out;
  background-repeat: no-repeat;
  background-image: linear-gradient(var(--_rewards-promotions-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_rewards-promotions-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_rewards-promotions-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_rewards-promotions-skeleton-quote-color) 50%);
  background-color: var(--_rewards-promotions-skeleton-quote-bg);
  background-size: 100% 144px, calc((60% * 2) + (16px/ 2)) 16px, calc((85% * 2) + (16px/ 2)) 16px, calc((70% * 2) + (16px/ 2)) 16px;
  background-position: 0 0, 16px 160px, 16px 192px, 16px 216px;
}
:host([mode=list]) .skeleton .feature-skeleton-item {
  width: 2%;
  height: 15rem;
  background: linear-gradient(var(--_rewards-promotions-skeleton-quote-color) 60%, var(--_rewards-promotions-skeleton-quote-bg) 30%);
  margin: 16px 0;
}
:host([mode=list]) .skeleton .list-item {
  width: auto;
  height: 96px;
  pointer-events: none;
  transition: opacity 0.4s ease-in-out;
  background-repeat: no-repeat;
  margin: 1rem 1rem 1rem;
  background-image: linear-gradient(var(--_rewards-promotions-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_rewards-promotions-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_rewards-promotions-skeleton-quote-color) 50%);
  background-color: var(--_rewards-promotions-skeleton-quote-bg);
  background-size: 72px 96px, calc((48% * 2) + (16px/ 2)) 16px, calc((10% * 2) + (16px/ 2)) 16px;
  background-position: 0px 0px, 104px 16px, 104px 48px;
}
:host([mode=list]) .skeleton .shop-skeleton {
  margin: 2rem 1rem 1rem;
}
:host([mode=list]) .skeleton .shop-skeleton .basic-item {
  width: auto;
  height: 3rem;
  pointer-events: none;
  transition: opacity 0.4s ease-in-out;
  background-repeat: no-repeat;
  background-image: linear-gradient(var(--_rewards-promotions-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_rewards-promotions-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_rewards-promotions-skeleton-quote-color) 50%);
  background-color: transparent;
  background-size: 48px 48px, calc((65% * 2) + (16px/ 2)) 16px, calc((45% * 2) + (16px/ 2)) 16px;
  background-position: 0 0, 56px 4px, 56px 28px;
}
:host([mode=list]) .skeleton .carousel-skeleton-container {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
}
:host([mode=list]) .skeleton .carousel-skeleton-container .list-item {
  width: 90%;
  margin: 1rem 0.5rem 0.5rem;
}
:host([mode=list]) .skeleton .carousel-skeleton-container .feature-top-list {
  width: 90%;
  margin: 1rem 0 0.5rem;
}
:host([mode=list]) .skeleton .border-item {
  width: 2%;
  height: 6rem;
  margin-top: 1rem;
}
:host([mode=list]) .skeleton .border-left-item {
  background-color: var(--_rewards-promotions-skeleton-quote-bg);
}
:host([mode=list]) .skeleton .border-right-item {
  background-color: var(--_rewards-promotions-skeleton-quote-color);
}
:host([mode=list]) .skeleton .carousel {
  width: 100%;
  pointer-events: none;
  transition: opacity 0.4s ease-in-out;
  background-repeat: no-repeat;
}
:host([mode=list]) .skeleton .carousel .carousel-header {
  width: 100%;
  height: 2rem;
  background-repeat: no-repeat;
  background-image: linear-gradient(-60deg, transparent 50%, var(--_rewards-promotions-skeleton-quote-color) 50%), linear-gradient(-60deg, var(--_rewards-promotions-skeleton-quote-color) 50%, transparent 50%);
  background-color: var(--rewards-promotions-dark-mode-skeleton-quote-bg, var(--skeleton-quote-bg, transparent));
  background-size: calc((32% * 2) + (16px/ 2)) 16px, calc((20% * 2) + (16px/ 2)) 16px;
  background-position: 16px 16px, calc(100% - 16px) 16px;
}
:host([mode=list]) .promotion-list {
  --bbva-header-category-link-max-width: 60%;
}
:host([mode=list]) .promotion-list.has-scroll {
  overflow-y: scroll;
  height: calc(100vh - var(--rewards-promotions-page-promotions-extra-header));
}
:host([mode=list]) .promotion-list.has-scroll.finish-scroll {
  overflow-y: hidden;
}
:host([mode=list]) [ambient^=light],
:host([mode=list]) :host([ambient^=light]) {
  background-color: var(--_rewards-promotion-background-color);
}
:host([mode=list]) [ambient^=light] .promotion,
:host([mode=list]) :host([ambient^=light]) .promotion {
  display: flex;
  flex-direction: column;
}
:host([mode=list]) [ambient^=light] .promotion .promotion-list,
:host([mode=list]) [ambient^=light] .promotion .center,
:host([mode=list]) :host([ambient^=light]) .promotion .promotion-list,
:host([mode=list]) :host([ambient^=light]) .promotion .center {
  background-color: var(--_rewards-promotion-background-color);
}
:host([mode=list]) [ambient^=light] .promotion .promotion-list,
:host([mode=list]) :host([ambient^=light]) .promotion .promotion-list {
  min-height: 100%;
}
:host([mode=list]) [data-tag-name=bbva-link] {
  display: flex;
  align-items: center;
  margin-top: -0.5rem;
  margin-bottom: 1.5rem;
  --bbva-link-color: var(--colorsPrimaryMedium, ${i(W.primaryMedium)});
}
:host([mode=list]) [data-tag-name=bbva-notification-message] {
  padding: 2rem 1rem;
}
:host([mode=list]) [data-tag-name=rewards-promotions-panel-info] {
  --rewards-promotions-panel-info-microillustration-width: 5rem;
  --rewards-promotions-panel-info-microillustration-height: 5rem;
  background-color: var(--_rewards-promotion-background-color-basic-list-promotions);
  position: absolute;
  inset: 0;
}
:host([mode=list]) .basic-info-panel {
  background-color: var(--_rewards-promotion-background-color-basic-list-promotions);
  margin: 1rem 0 1rem 0;
}
:host([mode=list]) .basic-info-panel .content-panel {
  display: flex;
  justify-content: space-between;
  align-items: flex-start;
  text-align: left;
  padding-top: 1rem;
}
:host([mode=list]) .basic-info-panel .content-text {
  padding: 0 1rem 1.4375rem 1rem;
}
:host([mode=list]) .basic-info-panel .content-text .link {
  display: flex;
  align-items: center;
  margin: 0.5rem 0 0 0;
}
:host([mode=list]) .basic-info-panel .description-content {
  color: --_rewards-promotions-color-text;
  font-style: var(--fontFacePrimaryBookFontStyle, ${i(s.book.fontStyle)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${i(s.book.fontWeight)});
  font-size: var(--typographyTypeSmall, ${i(a.typeSmall)});
}
:host([mode=list]) .basic-info-panel .content-image {
  margin: 0 0 0 1rem;
}
:host([mode=list]) .basic-info-panel .content-image .microillustration {
  width: 3.1875rem;
}
:host([mode=list]) .favorite-carousel [data-tag-name=bbva-header-category] {
  padding: 0.5rem 1rem 0;
}
:host([mode=list]) .favorite-carousel .description {
  padding: 0.5rem 1rem 0;
}
:host([mode=list]) .favorite-carousel .favorite-carousel-links {
  padding: 0.75rem 0 1rem 0.5rem;
  display: flex;
}
:host([mode=list]) .favorite-carousel .favorite-carousel-links [data-tag-name=bbva-link] {
  margin: 0.5rem;
}
:host([mode=list]) .center {
  display: flex;
  justify-content: center;
}
:host([mode=list]) .promotions-search {
  all: unset;
  display: block;
  width: 100%;
  box-sizing: border-box;
  padding: 1rem;
  margin-bottom: 1rem;
  background-color: var(--_rewards-promotion-container-background-color);
}
:host([mode=list]) [data-tag-name=bbva-list-offer] {
  margin: 0.5rem 1rem;
}
:host([mode=list]) [data-tag-name=rewards-promotions-card-article] {
  margin: 1rem;
  box-shadow: var(--boxShadowType1, ${i(st.type1)});
}
:host([mode=list]) .show-more-promotion-link {
  margin-bottom: 0.5rem;
  padding: 0.5rem 1rem;
}

:host([mode=viewMore]) {
  background-color: var(--rewards-promotions-view-more-promotions-bg-color, var(--colorsSecondary100, ${i(W.secondary100)}));
  --bbva-transition-container-text-align: left;
  --bbva-transition-container-ios-header-bg-color: var(--colorsPrimaryCoreDarkened, ${i(W.primaryCoreDarkened)});
  --bbva-transition-container-content-bg-color: var(--colorsSecondary100, ${i(W.secondary100)});
  --_veil-opacity: 1;
  --bbva-transition-container-padding: 0;
  --bbva-transition-container-padding-bottom: 0;
  --bbva-transition-container-modal-content-overflow-y: hidden;
}
:host([mode=viewMore]) .view-more-favorite-toolbar {
  background-color: var(--_rewards-promotion-container-background-color);
  margin-bottom: 0.5rem;
}
:host([mode=viewMore]) .item-skeleton {
  height: 7.5rem;
  margin: 0 1rem 1rem;
  background-color: var(--colorsPrimaryCoreLightened, ${i(W.primaryCoreLightened)});
  pointer-events: none;
  transition: opacity 0.4s ease-in-out;
  background-repeat: no-repeat;
  background-image: linear-gradient(var(--_rewards-promotions-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_rewards-promotions-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_rewards-promotions-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_rewards-promotions-skeleton-quote-color) 50%);
  background-color: var(--_rewards-promotions-skeleton-quote-bg);
  background-size: 88px 120px, calc((55% * 2) + (16px/ 2)) 16px, calc((40% * 2) + (16px/ 2)) 16px, calc((25% * 2) + (16px/ 2)) 16px;
  background-position: 0 0, 96px 16px, 96px 42px, 96px 80px;
}
:host([mode=viewMore]) .promotions-list-scroll {
  display: flex;
  flex-direction: column;
  height: 100%;
}
:host([mode=viewMore]) .promotions-list-scroll.empty-container {
  background-color: var(--rewards-promotions-dark-mode-bg, var(--colorsPrimaryCoreLightened, ${i(W.primaryCoreLightened)}));
  position: fixed;
}
:host([mode=viewMore]) .promotions-container {
  padding-top: 0.5rem;
  overflow-y: auto;
}
:host([mode=viewMore]) .scrollable-top-item {
  scroll-margin-top: 4rem;
}
:host([mode=viewMore]) [data-tag-name=bbva-notification-message] {
  margin: 0 1rem 1rem;
  --bbva-notification-message-title-size: var(--typographyTypeSmall, ${i(a.typeSmall)});
  --bbva-notification-message-title-weight: var(--fontFacePrimaryLightFontWeight, ${i(s.light.fontWeight)});
}

:host([mode=list][show-promotions-by-one-type]) {
  position: relative;
}
:host([mode=list][show-promotions-by-one-type]) .notification-error-message {
  position: static;
  height: auto;
  background-color: var(--_rewards-promotion-background-color-basic-list-promotions);
  inset: 0;
  padding: 1.5rem 1rem;
}

:host([mode=list][is-loading-promotions]) .skeleton,
:host([mode=list][is-loading-shop-terms]) .skeleton {
  background-color: var(--_rewards-promotion-background-color);
  opacity: 1;
}

:host([mode=detail][is-loading-promotion-detail]) .skeleton {
  background-color: var(--_rewards-promotion-background-color-basic-list-promotions);
  opacity: 1;
}

:host([mode=list][show-promotions-by-one-type][is-loading-promotions]) {
  position: static;
}
:host([mode=list][show-promotions-by-one-type][is-loading-promotions]) .skeleton {
  min-height: auto;
  padding-bottom: 0.9375rem;
}
:host([mode=list][show-promotions-by-one-type][is-loading-promotions]) .carousel {
  position: relative;
}
:host([mode=list][show-promotions-by-one-type][is-loading-promotions]) .skeleton-animation {
  min-height: auto;
}

[data-tag-name=rewards-promotions-card-sale] {
  margin: 0 1rem 1rem;
  box-shadow: var(--boxShadowType1, ${i(st.type1)});
}

[data-tag-name=rewards-promotions-card-sale]:not(:active) {
  --bbva-link-color: var(--colorsPrimaryMedium, ${i(W.primaryMedium)});
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
`;class ys extends(K(Fr(Ke(l(e))))){static get MODES(){return{viewMore:"viewMore",detail:"detail",list:"list",viewMoreStores:"viewMoreStores"}}static get is(){return"rewards-promotions-page"}static get scopedElements(){const t=[go,wo,H,dt,ae,z,Q,Je,So,J,xo,Co,Cr,kr,us,hs,bs,vs,Mr,J,re,se,Sr,Ir,Fr,ct];return ys.scopedElementsFromClasses(t)}static get properties(){return{loadLazyContent:{type:Boolean,attribute:"load-lazy-content"},mode:{type:String,reflect:!0},resetPage:{type:Boolean,attribute:"reset-page"},isLoadingPromotions:{type:Boolean,reflect:!0,attribute:"is-loading-promotions"},locationDisabled:{type:Boolean,reflect:!0,attribute:"location-disabled"},location:{type:Object,attribute:"location"},cardsData:{type:Array,attribute:"cards-data"},promotions:{type:Array},_initialPagePromotionsNumber:{type:Number,state:!0},_initialCarouselPromotionsNumber:{type:Number,state:!0},promotionIcons:{type:Object},_promotionSelected:{type:Object,state:!0},promotionCategoriesMap:{type:Object,state:!0},formatDate:{type:String,attribute:"format-date"},visiblePage:{type:Boolean,attribute:"visible-page"},promotion:{type:Object},isLoadingPromotionDetail:{type:Boolean,reflect:!0,attribute:"is-loading-promotion-detail"},showCardsForPromotion:{type:Boolean,reflect:!0,attribute:"show-cards-for-promotion"},paginationInfo:{type:Object,attribute:"pagination-info"},lastRequestParams:{type:Object},_moveScroll:{type:Boolean,state:!0},language:{type:String},headerTextKey:{type:String,attribute:"header-text-key"},userNotRegistered:{type:Boolean,attribute:"user-not-registered"},hasPanelError:{type:Boolean,attribute:"has-panel-error"},panelErrorData:{type:Object},promotionSelectedInfo:{type:Object,attribute:"promotion-selected-info"},selectedPromotionsGroup:{type:String},activateCategories:{type:Boolean,attribute:"activate-categories"},isEmptyPromotions:{type:Boolean,attribute:"is-empty-promotions"},isEmptyPromotionsGroup:{type:Boolean,attribute:"is-empty-promotions-group"},somePromotionGroup:{type:Boolean,attribute:"some-promotion-group"},categories:{type:Array},categoriesError:{type:Boolean,attribute:"categories-error"},categoriesLoaded:{type:Boolean,attribute:"categories-loaded"},isPromotionGroup:{type:Boolean,attribute:"is-promotion-group"},_shouldShowAllCards:{type:Boolean,state:!0},scrollableTopItemIndex:{type:Number,attribute:"scrollable-top-item-index"},availableTooltip:{type:Boolean,attribute:"available-tooltip"},hasScroll:{type:Boolean,attribute:"has-scroll"},_finishScroll:{type:Boolean,state:!0},promotionsByType:{type:Object},promotionsByFeature:{type:Object},promotionsByCategory:{type:Object},promotionsSearchFilters:{type:Object},promotionsTypeId:{type:Array},showPromotionsByType:{type:Boolean,attribute:"show-promotions-by-type"},showPromotionsByFeature:{type:Boolean,attribute:"show-promotions-by-feature"},showPromotionsByCategory:{type:Boolean,attribute:"show-promotions-by-category"},showSearchPromotions:{type:Boolean,attribute:"show-search-promotions"},showSearchByLocation:{type:Boolean,attribute:"show-search-by-location"},showSearchByPromotionType:{type:Boolean,attribute:"show-search-by-promotion-type"},_storedCategories:{type:Array,state:!0},_searchName:{type:String,state:!0},showStoresForPromotion:{type:Boolean,attribute:"show-stores-for-promotion"},shouldShowFavoriteCategoriesPanel:{type:Boolean,attribute:"should-show-favorite-categories-panel"},shouldShowFavoriteCategoriesNotPromotionsPanel:{type:Boolean,attribute:"should-show-favorite-categories-not-promotions-panel"},shouldShowFavoriteCategoriesPromotionsCarousel:{type:Boolean,attribute:"should-show-favorite-categories-promotions-carousel"},showStoreInformation:{type:Boolean,attribute:"show-store-information"},moreStores:{type:Object},mobileServices:{type:Object,attribute:"mobile-services"},limitFavoriteCategoriesToSelect:{type:Number,attribute:"limit-favorite-categories-tab-select"},showPromotionsByOneType:{type:Boolean,attribute:"show-promotions-by-one-type"},enabledPromotionsWithoutProducts:{type:Boolean,attribute:"enabled-promotions-without-products"},showShopAccess:{type:Boolean,attribute:"show-shop-access"},isLoadingShopTerms:{type:Boolean,attribute:"is-loading-shop-terms"},shopBannerActive:{type:Boolean,attribute:"shop-banner-active"},headerButtons:{type:Array,attribute:"header-buttons"}}}constructor(){super(),this._shouldShowAllCards=!1,this.showCardsForPromotion=!1,this.promotions=[],this.headerButtons=[],this.isLoadingPromotions=!1,this.locationDisabled=!1,this.isEmptyPromotions=!1,this.isEmptyPromotionsGroup=!1,this.somePromotionGroup=!1,this.hasPanelError=!1,this.panelErrorData={},this.selectedPromotionsGroup="",this.isEmptyResults=!1,this._initialPagePromotionsNumber=6,this._initialCarouselPromotionsNumber=5,this.scrollableTopItemIndex=6,this._storedCategories=[],this._searchName="",this.paginationInfo={pageSize:20},this.lastRequestParams={},this.promotionCategoriesMap={LOYALTY_POINTS:"points",FIXED_RATE:"discount",CASHBACK:"discount",RATE:"discount",POST_PAYMENT:"debtWithdrawal"},this.formatDate="D MMM YYYY",this.language="es-ES",this.headerTextKey="rewards-promotions-promotions-view-more-title",this.visiblePage=!1,this.isLoadingPromotionDetail=!1,this.isLoadingShopTerms=!1,this.detailPart=new us(this),this.listPart=new hs(this),this.viewMorePart=new bs(this),this.viewMoreStoresPart=new vs(this),this._itemsForSkeleton=1,this._moveScroll=!1,this.currentPage=0,this._delayScrollToReset=300,this._enableClassPromo=!1,this.loadLazyContent=!1,this.userNotRegistered=!1,this.resetPage=!1,this.categoriesError=!1,this.categoriesLoaded=!1,this.promotionsByType={},this.promotionsByFeature={},this.promotionsByCategory={},this.promotionsSearchFilters={},this.showPromotionsByType=!1,this.availableTooltip=!1,this.hasScroll=!1,this._finishScroll=!1,this.showPromotionsByFeature=!1,this.showSearchPromotions=!1,this.showSearchByLocation=!1,this.showSearchByPromotionType=!1,this.showPromotionsByCategory=!1,this.shouldShowFavoriteCategoriesPanel=!1,this.shouldShowFavoriteCategoriesNotPromotionsPanel=!1,this.shouldShowFavoriteCategoriesPromotionsCarousel=!1,this.showStoreInformation=!1,this.mobileServices={},this.location={},this.showPromotionsByOneType=!1,this.enabledPromotionsWithoutProducts=!1,this.showShopAccess=!1,this.shopBannerActive=!1,this.promotionSelectedInfo={}}static get styles(){return[gs,yo.dark,vo.dark,Z.light,fo.light,_o.light,oe.dark,U.light,pt.light,ie.light,tt.light,$o.light,G.light,o("rewards-promotions-shared-styles")]}async updated(t){var e,o;(t.has("visiblePage")&&this.visiblePage&&await this._configPart(),t.has("visiblePage")&&!this.visiblePage&&await this._resetPart(),t.has("loadLazyContent")&&this.loadLazyContent&&this.requestContent(),t.has("resetPage")&&this.resetPage&&this._resetPageState(),(t.has("availableTooltip")||t.has("hasScroll"))&&this.availableTooltip&&this.hasScroll)&&(null==this||null===(e=this._part)||void 0===e||null===(o=e._performScrollTo)||void 0===o||o.call(e));super.updated(t)}requestContent(){this.dispatchCustomEvent("rewards-promotions-get-content")}_resetPageState(){this.promotions=[],this.isLoadingPromotionDetail=!1,this.promotions=[],this.promotion=void 0,this.loadLazyContent=!1,this.currentPage=0,this._moveScroll=!1,this.resetPage=!1,this.selectedPromotionsGroup="",this.categoryError=!1,this.dispatchCustomEvent("rewards-promotions-page-reseted"),this.activateCategories&&(this.categories=[],this.categoriesLoaded=!1)}get _userHasCards(){var t;return(null===(t=this.cardsData)||void 0===t?void 0:t.length)>0}get _promotionParticipantCards(){var t,e,o;const i=null===(t=this.promotion)||void 0===t||null===(e=t.cards)||void 0===e?void 0:e.map((t=>{var e;return null==t||null===(e=t.title)||void 0===e?void 0:e.id}));return null===(o=this.cardsData)||void 0===o?void 0:o.filter((t=>{var e;return null==i?void 0:i.includes(null==t||null===(e=t.product)||void 0===e?void 0:e.id)}))}scrollableParentElement(t=!1){return this._scrollableParentElement=this.shadowRoot.querySelector(t?".promotion-detail-scroll":".promotions-list-scroll"),this._scrollableParentElement}_handleHeaderLeftClick(t){null==t||t.stopPropagation(),this.navigateToPreviousPage()}navigateToPreviousPage(){this._sendVisibilityChange({detail:!1})}_changeVisible(t){null==t||t.stopPropagation(),this._sendVisibilityChange(t)}_sendVisibilityChange(t){const e=null==t?void 0:t.detail;e!==this.visible&&(this.visible=e,this.dispatchCustomEvent("rewards-promotions-page-status",{visible:e,mode:this.mode,viewType:"page"}))}get _noPromotionsGroup(){var t;if(this.somePromotionGroup){return Ur(this.promotionsByCategory)&&Ur(this.promotionsByType)&&Ur(this.promotionsByFeature)}return!(null!==(t=this.promotions)&&void 0!==t&&t.length)}handleStoreClick(t){var e,o,i,a;let r={longitude:null==t||null===(e=t.geolocation)||void 0===e?void 0:e.longitude,latitude:null==t||null===(o=t.geolocation)||void 0===o?void 0:o.latitude,name:"POI Name",zoom:1e3};const s=[r.latitude,r.longitude];null!==(i=this.mobileServices)&&void 0!==i&&i.isGms?r={uriString:`google.navigation:q=${s.join(",")}`}:null!==(a=this.mobileServices)&&void 0!==a&&a.isHmsOnly?r={uriString:`mapapp://navigation?daddr=${s.join(",")}`}:Object.keys(this.mobileServices).length||window.open(`https://www.google.com/maps/place/${function([t,e]){const o=(t,e)=>{const o=Math.floor(t),i=Math.floor(60*(t-o)),a=(60*(60*(t-o)-i)).toFixed(1),r=(t,e)=>o>=0?t:e,s=e?r("N","S"):r("E","W");return`${Math.abs(o)}°${i}'${a}"${s}`};return`${o(parseFloat(t),!0)}+${o(parseFloat(e),!1)}`}(s)}`,btoa(s.join())),this.dispatchCustomEvent("rewards-promotions-show-stores-map-route",r)}_handleFavoriteCategoriesToolbarButtonClicked(t){const e=null==t?void 0:t.detail;if(t.stopPropagation(),0===e){var o;const t=(null===(o=this.categories)||void 0===o?void 0:o.filter((t=>t.isFavourite)))||[];this.dispatchCustomEvent("rewards-promotions-show-modal",{mode:ps.MODES.favoriteCategories,data:{categories:this.categories,storedCategories:t,storedCategoriesEdited:t,limitFavoriteCategoriesToSelect:this.limitFavoriteCategoriesToSelect,action:"change"}})}else this.dispatchCustomEvent("rewards-promotions-show-modal",{mode:ps.MODES.remove,data:{isFromViewMore:!0}})}handleExchangeCouponClick(){this.dispatchCustomEvent("rewards-promotions-exchange-coupon")}_clickRetry(){var t,e;null!==(t=this._part)&&void 0!==t&&t.clickRetry?null===(e=this._part)||void 0===e||e.clickRetry():this.requestContent()}get _part(){const t={detail:this.detailPart,list:this.listPart,viewMore:this.viewMorePart,viewMoreStores:this.viewMoreStoresPart};return this.mode in t?t[this.mode]:null}async _configPart(){var t;null!==(t=this._part)&&void 0!==t&&t.initConfig&&this._part.initConfig()}async _resetPart(){var t;null!==(t=this._part)&&void 0!==t&&t.resetPart&&this._part.resetPart()}_getPromotionDetail(){this.dispatchCustomEvent("rewards-promotions-detail-get-promotion",this.promotionSelectedInfo)}get $template(){var t,e;return p`
      ${(null===(t=this._part)||void 0===t||null===(e=t.render)||void 0===e?void 0:e.call(t))||h}
    `}render(){return p`
      ${this.$template}
    `}}class fs extends Xr{async initConfig(){this.controller._getCampaignPromotions(),this.dispatchCustomEvent("rewards-promotions-campaign-detail-page-view")}_scrollToTop(){var t;null===(t=this.controller.scrollableParentElement())||void 0===t||t.scrollTo(0,0)}clickRetry(){var t;null===(t=this.controller)||void 0===t||t._getCampaignPromotions()}_renderPromotionContent(){return p`
      ${this._renderPanelProcess()}
      <bbva-header-category
        class="promotions-header"
        text="${this.t("rewards-promotions-promotions-detail-title-campaign-promotions")}"
        @header-category-link-click="${()=>this._showMoreCampaignPromotions()}"
        option-link=${!this._hasViewMorePromotions||this.controller.isLoadingCampaignPromotions||this.controller.showError?"":this.t("rewards-promotions-promotions-view-more-campaign-promotions")}
      ></bbva-header-category>
      ${this.controller.isLoadingCampaignPromotions?p`
            <div class="skeletons-container">
              <div class="skeleton-item">
                <div class="skeleton"></div>
              </div>
              <bbva-divider-default divider="small"> </bbva-divider-default>
              <div class="skeleton-item">
                <div class="skeleton"></div>
              </div>
              <bbva-divider-default divider="small"> </bbva-divider-default>
              <div class="skeleton-item">
                <div class="skeleton"></div>
              </div>
            </div>
          `:this._renderPromotions()}
    `}_renderPromotions(){return this.controller.showError?this._renderPromotionsServiceError():this._renderContent()}_renderContent(){return this.controller.promotions?p`
          ${this._promotions}
        `:h}_renderPanelProcess(){var t,e,o,i,a,r,s;const n=null===(t=this.controller.campaignSelectedInfo)||void 0===t||null===(e=t.images)||void 0===e?void 0:e.find((t=>"DETAIL"===(null==t?void 0:t.id))),l=null===(o=this.controller.campaignSelectedInfo)||void 0===o||null===(i=o.promotionType)||void 0===i?void 0:i.id,c=this.controller.promotionCategoriesMap[l||"RATE"];return p`
      <bbva-panel-container>
        <div class="promotion-information">
          <bbva-banner-image
            size="XL"
            image-src="${_(null==n?void 0:n.url)}"
            img-accessibility-text="${_(null==n?void 0:n.name)}"
          >
          </bbva-banner-image>
          <div class="promotion-info-content">
            <bbva-type-text
              unset
              size="3XL"
              font-weight="700"
              text="${_(Gr(this.controller.campaignSelectedInfo,this.t("rewards-promotions-promotions-detail-header1")))}"
            >
            </bbva-type-text>
            <bbva-badge-icon
              .icon="${at()}"
              .description="${null===(a=this.controller.campaignSelectedInfo)||void 0===a?void 0:a.benefit}"
              .category="${c}"
            >
            </bbva-badge-icon>
            <bbva-type-text
              class="promotion-description"
              unset
              size="S"
              text="${null===(r=this.controller.campaignSelectedInfo)||void 0===r?void 0:r.name}"
            >
            </bbva-type-text>
            <bbva-type-text
              font-style="italic"
              unset
              size="S"
              text="${this.t("rewards-promotions-promotions-until-date-text",{formattedDate:jr(null===(s=this.controller.campaignSelectedInfo)||void 0===s?void 0:s.endDate,this.controller.formatDate)})}"
            >
            </bbva-type-text>
          </div>
        </div>
      </bbva-panel-container>
    `}_renderPromotionsServiceError(){return this.controller._errorPromotionsCampaignTemplate}get _hasViewMorePromotions(){var t,e;return(null===(t=this.controller.promotions)||void 0===t?void 0:t.length)>(null===(e=this.controller)||void 0===e?void 0:e._initialPagePromotionsNumber)}_showMoreCampaignPromotions(){this.dispatchCustomEvent("rewards-promotion-campaign-detail-click-view-more-campaign-promotions")}get _promotions(){var t,e;const o=null===(t=this.controller)||void 0===t||null===(e=t.promotions)||void 0===e?void 0:e.slice(0,5);return p`
      ${null==o?void 0:o.map(((t,e)=>{var i,a,r;const s=null==t||null===(i=t.promotionType)||void 0===i?void 0:i.id,n=this.controller.promotionCategoriesMap[s||"RATE"];return p`
          <div
            role="link"
            class="promotion-link"
            onclick="void(0)"
            @click="${()=>{this.controller._clickPromotion(o[e])}}"
            @keyup="${()=>{}}"
          >
            <div class="container">
              <bbva-type-text
                unset
                text="${null==t||null===(a=t.commerceInformation)||void 0===a?void 0:a.name}"
                variant="spotlight"
                size="L"
              ></bbva-type-text
              ><bbva-type-icon icon=${ne()}></bbva-type-icon>
            </div>
            <bbva-type-text
              class="promotion-benefit"
              unset
              text="${(null==t?void 0:t.benefit)||this.t(null===(r=le[n])||void 0===r?void 0:r.locale)}"
              size="S"
            ></bbva-type-text>
            <bbva-divider-default ?hidden="${e===o.length-1}">
            </bbva-divider-default>
          </div>
        `}))}
    `}render(){return p`
      <bbva-transition-container
        @transitionend="${()=>this._onDetailTransitionEnd()}"
        header-text="${_(Gr(this.controller.campaignSelectedInfo,this.t("rewards-promotions-promotions-detail-header1")))}"
        header-type="first-level-sequential"
        header-show-left-icon=""
        header-left-icon-aria-label="${this.t("rewards-promotions-view-more-header-left-icon-aria-label")}"
        ?visible="${this.controller.visiblePage}"
        @visible-changed=${this.controller._changeVisible}
        @transition-container-close=${()=>this.controller._closePromotionsCampaign()}
      >
        <div slot="slot-content" class="promotion-detail">
          <div class="promotion-detail-scroll">${this._renderPromotionContent()}</div>
        </div>
      </bbva-transition-container>
    `}_onDetailTransitionEnd(){var t;null!==(t=this.controller)&&void 0!==t&&t.visiblePage&&this._scrollToTop()}}class _s extends Xr{async initConfig(){this._scrollToItem(),this._observerOptions={threshold:.8},this._observer=new IntersectionObserver(this.manageOnScroll.bind(this),this._observerOptions),this.dispatchCustomEvent("rewards-promotions-campaign-view-more-page-view")}get _lastPageReached(){var t,e,o;return!(null!==(t=this.controller.paginationInfo)&&void 0!==t&&null!==(e=t.links)&&void 0!==e&&null!==(o=e.next)&&void 0!==o&&o.trim())}get _promotionsBottomTemplate(){var t;return null!==(t=this.controller.promotions)&&void 0!==t&&t.length&&this.controller.showError?this.controller.isLoadingCampaignPromotionsPagination?this._listSkeletonTemplate:this.controller._errorPromotionsCampaignTemplate:this._lastPageReached&&!this.controller.isLoadingCampaignPromotionsPagination?"":this._listSkeletonTemplate}get _isEmptyPromotions(){var t;return!(null!==(t=this.controller.promotions)&&void 0!==t&&t.length)}get _containerClass(){const t=this._isEmptyPromotions||this.controller.hasPanelError;return rt({"empty-container":t,"campaign-promotions-list-scroll":!0})}clickRetry(){this._requestData()}resetPart(){this._observer=null}manageOnScroll(t){var e,o,i;null===(e=t[0])||void 0===e||!e.isIntersecting||this.controller.isLoadingCampaignPromotionsPagination||this.controller.showError||this._isEmptyPromotions||!this.controller.visiblePage||(this._requestData(),null===(o=this._observer)||void 0===o||o.unobserve(null===(i=t[0])||void 0===i?void 0:i.target))}_promotionIntersectionObserver(){var t,e,o;const i=null===(t=this.controller.scrollableParentElement())||void 0===t||null===(e=t.querySelector)||void 0===e||null===(o=e.call(t,".campaign-promotions-container"))||void 0===o?void 0:o.children,a=null==i?void 0:i[i.length-1];var r;a&&!this.controller.isLoadingCampaignPromotionsPagination&&(null===(r=this._observer)||void 0===r||r.observe(a))}static _simpleParamRegex(t){return new RegExp(`.*${t}=([^&$]+)`)}static _simpleComposeValue(t){return t}_requestData(){var t,e;const o=decodeURIComponent((null===(t=this.controller.paginationInfo)||void 0===t||null===(e=t.links)||void 0===e?void 0:e.next)||"");if(null!=o&&o.length){const t=[{id:"paginationKey",type:"simple"}].reduce(((t,e)=>{var i;const a={...t},r=null==_s||null===(i=_s[`_${e.type}ParamRegex`])||void 0===i?void 0:i.call(_s,e.id),s=null==o?void 0:o.match(r),n=null==s?void 0:s[1];var l;n&&(a[e.id]=null==_s||null===(l=_s[`_${e.type}ComposeValue`])||void 0===l?void 0:l.call(_s,n));return a}),{});this.dispatchCustomEvent("rewards-promotions-campaign-promotions-request-data",t)}}_clickPromotion(t){this.controller._moveScroll=!0,this.controller._promotionSelectedInfo=t,this.dispatchCustomEvent("rewards-promotions-select-promotion-from-campaign",t)}_renderPromotionLinks(t,e,o){var i,a,r;const s=null==t||null===(i=t.promotionType)||void 0===i?void 0:i.id,n=this.controller.promotionCategoriesMap[s||"RATE"];return p`
      <div
        role="link"
        class="promotion-link ${rt(this._classForPromotions(null==t?void 0:t.classForItem))}"
        onclick="void(0)"
        @click="${()=>{this._clickPromotion(t)}}"
        @keyup="${()=>{}}"
      >
        <div class="container">
          <bbva-type-text
            unset
            text="${null==t||null===(a=t.commerceInformation)||void 0===a?void 0:a.name}"
            variant="spotlight"
            size="L"
          ></bbva-type-text
          ><bbva-type-icon icon=${ne()}></bbva-type-icon>
        </div>
        <bbva-type-text
          class="promotion-benefit"
          unset
          text="${(null==t?void 0:t.benefit)||this.t(null===(r=le[n])||void 0===r?void 0:r.locale)}"
          size="S"
        ></bbva-type-text>
        <bbva-divider-default ?hidden="${e===o.length-1}"> </bbva-divider-default>
      </div>
    `}get _renderPromotions(){var t,e,o;return null!==(t=this.controller)&&void 0!==t&&null!==(e=t.promotions)&&void 0!==e&&e.length?null===(o=this.controller.promotions)||void 0===o?void 0:o.map(((t,e)=>p`
          ${this._renderPromotionLinks(t,e,this.controller.promotions)}
        `)):this._renderEmptyPromotions}_getTemplate(){let t="";return this._isEmptyPromotions?t=this._listSkeletonTemplate:(t=this._allPromotionsTemplate,this.controller.updateComplete.then((()=>this._promotionIntersectionObserver()))),t}get _listSkeletonTemplate(){return Array.from(Array(this.controller._itemsForSkeleton)).map((()=>p`
        <div class="skeletons-container">
          <bbva-divider-default divider="small"> </bbva-divider-default>
          <div class="skeleton-item">
            <div class="skeleton"></div>
          </div>
        </div>
      `))}get _allPromotionsTemplate(){return p`
      <div
        class="${rt({"campaign-promotions-container":!0})}"
      >
        ${this._renderPromotions}
      </div>

      ${this._promotionsBottomTemplate}
    `}_classForPromotions(t){let e={};return t&&t.split(" ").forEach((t=>{e={...e,[t]:!this._enableClassPromo}})),e}_scrollToItem(){var t;null===(t=this.controller.scrollableParentElement())||void 0===t||t.scrollTo(0,0)}render(){return p`
      <bbva-transition-container
        class="campaign-promotions-list"
        header-text="${this.t("rewards-promotions-view-more-campaign-promotions-title")}"
        header-type="first-level-sequential"
        header-show-left-icon=""
        header-left-icon-aria-label="${this.t("rewards-promotions-view-more-header-left-icon-aria-label")}"
        @visible-changed=${this.controller._changeVisible}
        ?visible="${this.controller.visiblePage}"
        @transition-container-close=${()=>this.controller._closePromotionsCampaign()}
      >
        <div slot="slot-content" class="promotions intersect-container">
          <div class="${this._containerClass}">
            ${this._getTemplate()}
          </div>
        </div>
      </bbva-transition-container>
    `}}var $s=t`
:host {
  display: block;
  box-sizing: border-box;
  min-height: 100%;
  background-color: var(--_rewards-promotions-detail-campaigns-bg);
  --bbva-transition-container-content-line-height: rem(1px);
  --bbva-transition-container--custom--primary-ambient--content-bg-color: var(--_rewards-promotions-detail-campaigns-bg);
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

:host([mode=campaignDetail]), :host([mode=viewMoreCampaignPromotions]) {
  --bbva-transition-container-padding: 0;
}
:host([mode=campaignDetail]) .skeletons-container, :host([mode=viewMoreCampaignPromotions]) .skeletons-container {
  position: relative;
  overflow: hidden;
  pointer-events: none;
  padding: 0 1rem;
}
:host([mode=campaignDetail]) .skeletons-container .skeleton-item, :host([mode=viewMoreCampaignPromotions]) .skeletons-container .skeleton-item {
  position: relative;
  height: 3.5rem;
  background-repeat: no-repeat;
  opacity: 1;
  width: 100%;
  background-image: linear-gradient(var(--_rewards-promotions-skeleton-detail-campaigns-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_rewards-promotions-skeleton-detail-campaigns-quote-color) 50%), linear-gradient(-60deg, var(--_rewards-promotions-skeleton-detail-campaigns-quote-color) 50%, transparent 50%);
  background-color: transparent;
  background-size: 24px 24px, calc((129px * 2) + (16px/ 2)) 16px, calc((32px * 2) + (16px/ 2)) 16px;
  background-position: 0 16px, 32px 20px, 100% 20px;
}
:host([mode=campaignDetail]) .skeletons-container .skeleton, :host([mode=viewMoreCampaignPromotions]) .skeletons-container .skeleton {
  contain: strict;
  position: absolute;
  left: 0;
  top: 0;
  right: 0;
  bottom: 0;
  height: 3.5rem;
  background: var(--_rewards-promotions-skeleton-detail-campaigns-animated-layer-bg);
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
}
:host([mode=campaignDetail]) .promotions, :host([mode=viewMoreCampaignPromotions]) .promotions {
  background-color: var(--_rewards-promotions-detail-campaigns-bg);
}
:host([mode=campaignDetail]) .promotion-information [data-tag-name=bbva-banner-image], :host([mode=viewMoreCampaignPromotions]) .promotion-information [data-tag-name=bbva-banner-image] {
  padding: 0;
}
:host([mode=campaignDetail]) .promotion-information .promotion-info-content, :host([mode=viewMoreCampaignPromotions]) .promotion-information .promotion-info-content {
  padding: 2rem 1rem 1.5rem;
}
:host([mode=campaignDetail]) .promotion-information .promotion-info-content > * + *, :host([mode=viewMoreCampaignPromotions]) .promotion-information .promotion-info-content > * + * {
  margin-top: 0.5rem;
}
:host([mode=campaignDetail]) .promotion-information .promotion-description, :host([mode=viewMoreCampaignPromotions]) .promotion-information .promotion-description {
  margin-top: 1rem;
}
:host([mode=campaignDetail]) .promotion-information [data-tag-name=bbva-badge-icon], :host([mode=viewMoreCampaignPromotions]) .promotion-information [data-tag-name=bbva-badge-icon] {
  --bbva-badge-icon--custom--primary-ambient--discount-icon-color: var(--_rewards-promotions-detail-campaigns-bbva-badge-icon-color);
}
:host([mode=campaignDetail]) .campaign-promotions-list-scroll.empty-container, :host([mode=viewMoreCampaignPromotions]) .campaign-promotions-list-scroll.empty-container {
  background-color: var(--_rewards-promotions-detail-campaigns-bg-alternative-color);
  position: fixed;
}
:host([mode=campaignDetail]) .promotions-header, :host([mode=viewMoreCampaignPromotions]) .promotions-header {
  padding: 0.5rem 1rem;
  white-space: nowrap;
}
:host([mode=campaignDetail]) .promotion-link, :host([mode=viewMoreCampaignPromotions]) .promotion-link {
  padding: 1rem 1rem 0;
  --bbva-type-icon--custom--primary-ambient--color: var(--_rewards-promotions-detail-campaigns-promorion-link);
}
:host([mode=campaignDetail]) .promotion-link .container, :host([mode=viewMoreCampaignPromotions]) .promotion-link .container {
  display: flex;
  justify-content: space-between;
  align-items: center;
}
:host([mode=campaignDetail]) .promotion-link .promotion-benefit, :host([mode=viewMoreCampaignPromotions]) .promotion-link .promotion-benefit {
  margin: 0.5rem 0 1rem;
}
:host([mode=campaignDetail]) .promotion-link [data-tag-name=bbva-divider-default], :host([mode=viewMoreCampaignPromotions]) .promotion-link [data-tag-name=bbva-divider-default] {
  display: block;
}
:host([mode=campaignDetail]) .promotion-link:active, :host([mode=viewMoreCampaignPromotions]) .promotion-link:active {
  --bbva-type-text--custom--primary-ambient-spotlight-color: var(--_rewards-promotions-detail-campaigns-promorion-link-active);
  background-color: var(--_rewards-promotions-detail-campaigns-bg-active-color);
}

:host([mode=campaignDetail][is-loading-promotions]) .skeleton, :host([mode=viewMoreCampaignPromotions][is-loading-promotions]) .skeleton {
  opacity: 1;
}

.notification-error-message {
  padding: 1.5rem 1rem;
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
`,ws=t`
:host {
  --_rewards-promotions-detail-campaigns-bg:
      var(--rewards-promotions--_ambient-promotions-detail-campaigns-bg,
          ${Re("colorPrimarySurfaceAmbientDefault",Oe)});
  --_rewards-promotions-skeleton-detail-campaigns-animated-layer-bg:
      var(--bbva-rewards-promotions-skeleton-detail-campaigns--_ambient--animated-layer-bg,
          ${Re("colorPrimarySurfaceAmbientDefault",Oe)});
  --_rewards-promotions-skeleton-detail-campaigns-quote-color:
      var(--bbva-rewards-promotions-skeleton-detail-campaigns--_ambient--quote-color,
          ${Re("colorPrimarySurfaceAmbientPreloading",Oe)});
  --_rewards-promotions-detail-campaigns-bg-active-color:
      var(--bbva-rewards-promotions-detail-campaigns--_ambient--bg-active-color,
          ${Re("colorPrimarySurfaceAmbientPressed",Oe)});
  --_rewards-promotions-detail-campaigns-promorion-link:
      var(--bbva-rewards-promotions-detail-campaigns--_ambient--promorion-link,
          ${Re("colorPrimaryLinkMainDefault",Oe)});
  --_rewards-promotions-detail-campaigns-promorion-link-active:
      var(--bbva-rewards-promotions-detail-campaigns--_ambient--promorion-link-active,
          ${Re("colorPrimaryLinkMainPressed",Oe)});
  --_rewards-promotions-detail-campaigns-bg-alternative-color:
      var(--bbva-rewards-promotions-detail-campaigns--_ambient--bg-alternative-color,
          ${Re("colorPrimarySurfaceAlternativeDefault",Oe)});
  --_rewards-promotions-detail-campaigns-bbva-badge-icon-color:
      var(--bbva-rewards-promotions-detail-campaigns--_ambient--bbva-badge-icon-color,
          ${Re("colorPrimaryCategoriesOthers",Oe)});
}
`;class Ss extends(K(Fr(Ke(l(e))))){static get MODES(){return{campaignDetail:"campaignDetail",viewMoreCampaignPromotions:"viewMoreCampaignPromotions"}}static get is(){return"rewards-promotions-new-design-page"}static get scopedElements(){const t=[eo,ko,Je,oo,io,fs,_s,ze,Ne,ao,Fr];return Ss.scopedElementsFromClasses(t)}static get properties(){return{mode:{type:String,reflect:!0},resetPage:{type:Boolean,attribute:"reset-page"},isLoadingCampaignPromotions:{type:Boolean,reflect:!0,attribute:"is-loading-campaign-promotions"},isLoadingCampaignPromotionsPagination:{type:Boolean,reflect:!0,attribute:"is-loading-campaign-promotions-pagination"},promotions:{type:Array},_initialPagePromotionsNumber:{type:Number,state:!0},formatDate:{type:String,attribute:"format-date"},visiblePage:{type:Boolean,attribute:"visible-page"},paginationInfo:{type:Object,attribute:"pagination-info"},lastRequestParams:{type:Object},campaignSelectedInfo:{type:Object},scrollableTopItemIndex:{type:Number,attribute:"scrollable-top-item-index"}}}constructor(){super(),this.promotions=[],this._initialPagePromotionsNumber=5,this.isLoadingCampaignPromotions=!1,this.isLoadingCampaignPromotionsPagination=!1,this.paginationInfo={pageSize:20},this.formatDate="D MMM YYYY",this.language="es-ES",this.lastRequestParams={},this.promotionCategoriesMap={LOYALTY_POINTS:"points",FIXED_RATE:"discount",CASHBACK:"discount",RATE:"discount",POST_PAYMENT:"debtWithdrawal"},this.visiblePage=!1,this.scrollableTopItemIndex=5,this._itemsForSkeleton=1,this.hasPanelError=!1,this.panelErrorData={},this.selectedPromotionsGroup="",this.resetPage=!1,this.hasScroll=!1,this.campaignDetailPart=new fs(this),this.viewMoreCampaignPromotionsPart=new _s(this),this.currentPage=0}static get styles(){return[$s,ws,Qe.primary,Po.primary,Ze.primary,to.primary,Le.primary,Ve.primary,o("rewards-promotions-shared-styles")]}async updated(t){t.has("visiblePage")&&this.visiblePage&&await this._configPart(),t.has("visiblePage")&&!this.visiblePage&&await this._resetPart(),t.has("resetPage")&&this.resetPage&&this._resetPageState(),super.updated(t)}requestContent(){this.dispatchCustomEvent("rewards-promotions-get-content")}_resetPageState(){this.promotions=[],this.isLoadingCampaignPromotions=!1,this.promotion=void 0,this.currentPage=0,this.resetPage=!1,this.dispatchCustomEvent("rewards-promotions-page-reseted")}scrollableParentElement(t=!1){return this._scrollableParentElement=this.shadowRoot.querySelector(t?".promotion-detail-scroll":".campaign-promotions-list-scroll"),this._scrollableParentElement}navigateToPreviousPage(){this._sendVisibilityChange({detail:!1})}_changeVisible(t){null==t||t.stopPropagation(),this._sendVisibilityChange(t)}_sendVisibilityChange(t){const e=null==t?void 0:t.detail;e!==this.visible&&(this.visible=e,this.dispatchCustomEvent("rewards-promotions-page-status",{visible:e,mode:this.mode,viewType:"page"}))}_clickRetry(){var t,e;null!==(t=this._part)&&void 0!==t&&t.clickRetry?null===(e=this._part)||void 0===e||e.clickRetry():this.requestContent()}get _part(){const t={campaignDetail:this.campaignDetailPart,viewMoreCampaignPromotions:this.viewMoreCampaignPromotionsPart};return this.mode in t?t[this.mode]:null}async _configPart(){var t;null!==(t=this._part)&&void 0!==t&&t.initConfig&&this._part.initConfig()}async _resetPart(){var t;null!==(t=this._part)&&void 0!==t&&t.resetPart&&this._part.resetPart()}_getCampaignPromotions(){this.dispatchCustomEvent("rewards-promotions-get-campaign-promotions",this.campaignSelectedInfo.campaign.id)}_clickPromotion(t){this.dispatchCustomEvent("rewards-promotions-select-promotion-from-campaign",t)}_closePromotionsCampaign(){this.dispatchCustomEvent("rewards-promotions-closed-campaign")}get $template(){var t,e;return p`
      ${(null===(t=this._part)||void 0===t||null===(e=t.render)||void 0===e?void 0:e.call(t))||h}
    `}render(){return p`
      ${this.$template}
    `}}var xs=t`
:host {
  display: block;
  box-sizing: border-box;
  min-height: 100%;
  background: var(--_rewards-promotions-new-design-modal-bg);
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

:host([mode=shopTermsAndConditions]),
:host([mode=newDesignFullError]) {
  --bbva-help-modal-padding: 0;
}

.microillustration-container {
  padding: 0 1rem 1rem 1rem;
}

.title {
  padding: 0 1rem 0.5rem 1rem;
}

.description {
  padding: 0 1rem 1.5rem 1rem;
}

.coupon-type-content {
  padding-top: 0.5rem;
}

.coupon-type-link {
  font-size: var(--typographyTypeLarge, ${i(a.typeLarge)});
  padding: 1rem 0 0;
}

.coupon-type-text {
  padding: 0.5rem 0;
}

.readTerms {
  border: none;
  width: 100%;
  display: flex;
  background: transparent;
  justify-content: space-between;
  padding: 1.5rem 1rem 1rem 1rem;
}
.readTerms:active {
  background: var(--_rewards-promotions-new-design-modal-active-bg);
}
.readTerms:active [data-tag-name=bbva-type-text] {
  --bbva-type-text--_ambient-spotlight-color: var(--_rewards-promotions-new-design-modal-active-link);
}

.checkbox {
  padding-bottom: 0.75rem;
}
`,Cs=t`
:host {
  --_rewards-promotions-new-design-modal-bg:
      var(--rewards-promotions--_ambient-promotions-new-design-modal-bg,
          ${Re("colorPrimaryAltSurfaceAmbientDefault",Oe)});
  --_rewards-promotions-new-design-modal-active-link:
      var(--rewards-promotions--_ambient-promotions-new-design-modal-active-link,
          ${Re("colorPrimaryLinkMainPressed",Oe)});
  --_rewards-promotions-new-design-modal-active-bg:
      var(--rewards-promotions--_ambient-promotions-new-design-modal-active-bg,
          ${Re("colorPrimaryAltSurfaceAmbientPressed",Oe)});
}
`;class Ps extends Xr{configs(){return{fullHeight:!0,headerType:"modal-three-level",titleIcon:"",titleText:"",headerText:this.t("rewards-promotions-shop-terms-and-conditions-modal-header-text"),buttonText:this.t("rewards-promotions-shop-terms-and-conditions-modal-button-text"),closeModalElements:["header-right-primary"],disabledButton:!0}}init(){this.controller.restoreShopTermsAndConditions(),this.dispatchCustomEvent("rewards-promotions-shop-accept-terms-modal-visible")}end(){this.dispatchCustomEvent("rewards-promotions-shop-accept-terms-modal-no-visible","dark-blue-bg")}_readTermsClick(){this.dispatchCustomEvent("rewards-promotions-experience-terms-and-condition-read-click"),this.controller.shopTermsUnderstood=!0}_handleClickCheck(){this.controller._isChecked=!this.controller._isChecked,this.controller.disabledButton=!this.controller._isChecked}_changeBadgeText(){return this.controller.shopTermsUnderstood?this.t("rewards-promotions-shop-terms-and-conditions-modal-read-info-text"):this.t("rewards-promotions-shop-terms-and-conditions-modal-no-read-info-text")}_changeBadgeType(){return this.controller.shopTermsUnderstood?"success":"default"}render(){var t;return p`
      <div class="col-content" slot="slot-content">
        ${this.controller.renderPanelInfoSection("info","rewards-promotions-shop-terms-and-conditions-modal-title-text","rewards-promotions-shop-terms-and-conditions-modal-description")}
        <div class="bullets">
          <bbva-list-bullet>
            ${this.t("rewards-promotions-shop-terms-and-conditions-modal-bullet-one")}
          </bbva-list-bullet>
          <bbva-list-bullet>
            ${this.t("rewards-promotions-shop-terms-and-conditions-modal-bullet-two")}
          </bbva-list-bullet>
        </div>
        <button @click="${()=>this._readTermsClick()}" class="readTerms">
          <bbva-type-text
            unset
            variant="spotlight"
            text="${this.t("rewards-promotions-shop-terms-and-conditions-modal-read-text")}"
            font-weight="300"
            size="M"
          ></bbva-type-text>
          <bbva-badge-default
            text=${this._changeBadgeText()}
            type=${this._changeBadgeType()}
          ></bbva-badge-default>
        </button>
        <div class="checkbox">
          <bbva-form-checkbox
            ?disabled="${!(null!==(t=this.controller)&&void 0!==t&&t.shopTermsUnderstood)}"
            value="item2"
            label="${this.t("rewards-promotions-shop-terms-and-conditions-modal-accept-description")}"
            ?checked=${this.controller._isChecked}
            @click=${()=>this._handleClickCheck()}
          ></bbva-form-checkbox>
        </div>
      </div>
    `}}class ks extends Xr{configs(){return{titleIcon:y(),modalType:"warning",closeModalElements:["header-right-primary","footer-button"],hideContentPaddingTop:!0}}init(){this.controller.buttonText=this.t("rewards-promotions-half-error-button-text")}}class Ts extends Xr{configs(){return{shouldTransition:!0,fullHeight:!0,headerType:"modal",closeModalElements:["footer-button","footer-link","header-right-primary"]}}get headingText(){var t,e;return null===(t=this.controller)||void 0===t||null===(e=t.data)||void 0===e?void 0:e.heading}get detailText(){var t,e;return null===(t=this.controller)||void 0===t||null===(e=t.data)||void 0===e?void 0:e.text}render(){return p`
      <div slot="slot-content">
        ${this.controller.renderPanelInfoSection("error",this.headingText,this.detailText)}
      </div>
    `}}class Es extends Xr{configs(){return{fullHeight:!0,headerType:"modal-three-level",titleIcon:B(),titleText:this.t("rewards-promotions-shop-detail-terms-and-conditions-modal-title-text"),headerText:this.t("rewards-promotions-shop-detail-terms-and-conditions-modal-header-text"),closeModalElements:["header-right-primary"]}}init(){this.dispatchCustomEvent("rewards-promotions-shop-view-detail-terms-modal-visible")}end(){this.dispatchCustomEvent("rewards-promotions-shop-view-detail-terms-modal-no-visible","dark-blue-bg")}render(){return p`
      <div class="col-content" slot="slot-content">
        <bbva-type-text
          inherit
          size="S"
          text="${this.t("rewards-promotions-shop-detail-terms-and-conditions-modal-body-text")}"
        >
        </bbva-type-text>
      </div>
    `}}class Is extends Xr{configs(){return{headerText:this.t("rewards-promotions-promotion-coupon-confirm-header-text"),titleText:this.t("rewards-promotions-promotion-coupon-confirm-title-text"),bodyText:this.t("rewards-promotions-promotion-coupon-confirm-body-text"),titleIcon:Ut(),buttonText:this.t("rewards-promotions-promotion-coupon-confirm-button-text"),linkText:this.t("rewards-promotions-promotion-coupon-confirm-link-text"),modalType:"caution",closeModalElements:["header-right-primary","footer-button","footer-link"]}}init(){this.controller.buttonText=this.t("rewards-promotions-promotion-coupon-confirm-button-text"),this.controller.linkText=this.t("rewards-promotions-promotion-coupon-confirm-link-text")}}class As extends Xr{configs(){return{headerText:this.t("rewards-promotions-promotion-coupon-confirm-header-text"),titleText:this.t("rewards-promotions-promotion-coupon-type-confirm-header-text"),closeModalElements:["header-right-primary"]}}_generateLink(t,{icon:e,linkText:o,text:i}){return p`
      <bbva-type-link
        class="coupon-type-link"
        icon=${(0,Rr[e])()}
        icon-size="24"
        text=${this.t(o)}
        @click="${()=>this.dispatchCustomEvent("rewards-promotions-coupon-redemption-option-link-click",t)}"
      ></bbva-type-link>
      <bbva-type-text
        class="coupon-type-text"
        tag="span"
        text="${this.t(i)}"
        size="M"
      ></bbva-type-text>
    `}render(){return p`
      <div slot="slot-title">
        <bbva-type-text
          unset
          font-weight="500"
          text="${this.t("rewards-promotions-promotion-coupon-type-confirm-header-text")}"
          size="S"
        ></bbva-type-text>
      </div>
      <div class="coupon-redemption-options-content" slot="slot-content">
        ${Object.entries(this.data).map((([t,e],o,i)=>p`
            ${this._generateLink(t,e)}
            ${o!==i.length-1?p`
                  <bbva-divider-default></bbva-divider-default>
                `:h}
          `))}
      </div>
    `}}class Ds extends(K(Fr(Ke(l(e))))){static get MODES(){return{shopTermsAndConditions:"shopTermsAndConditions",newDesignHalfModalError:"newDesignHalfModalError",newDesignFullError:"newDesignFullError",shopDetailTermsAndConditions:"shopDetailTermsAndConditions",promotionRedemptionExit:"promotionRedemptionExit",promotionRedemptionOptions:"promotionRedemptionOptions"}}static get is(){return"rewards-promotions-new-design-modal"}static get scopedElements(){const t=[Fr,Xe,Io,Ao,no,ze,lo,Ge,io];return Ds.scopedElementsFromClasses(t)}static get properties(){return{visibleModal:{type:Boolean,attribute:"visible-modal"},mode:{type:String,reflect:!0},data:{type:Object},shopTermsUnderstood:{type:Boolean,attribute:"shop-terms-understood"},disabledButton:{type:Boolean,attribute:"disabled-button"},_isChecked:{type:Boolean,state:!0},linkText:{type:String}}}constructor(){super(),this.visibleModal=!1,this.linkText="",this.modalType="modal",this.shopTermsAndConditions=new Ps(this),this.newDesignHalfModalError=new ks(this),this.newDesignFullError=new Ts(this),this.shopDetailTermsAndConditions=new Es(this),this.promotionRedemptionExit=new Is(this),this.promotionRedemptionOptions=new As(this),this.data={},this.shopTermsUnderstood=!1,this._isChecked=!1,this.disabledButton=!1}static get styles(){return[xs,Cs,Le.primaryAlt,ro.primaryAlt,To.primaryAlt,Eo.primaryAlt,so.primaryAlt,He.primaryAlt,Qe.primaryAlt,o("rewards-promotions-shared-styles")]}update(t){t.has("mode")&&(this._resetConfig(),this._configs()),super.update(t)}restoreShopTermsAndConditions(){this.shopTermsUnderstood=!1,this.disabledButton=!0,this._isChecked=!1}navigateToPreviousPage(){this.visibleModal=!1,this.closeModal()}closeModal(){var t,e;null!==(t=this.data)&&void 0!==t&&t.closeModal?null===(e=this.data)||void 0===e||e.closeModal():this.dispatchCustomEvent("rewards-promotions-modal-close-page")}_handleRewardsModalState(t){var e,o;const{target:i}=t;var a;if(this.visibleModal=i.visible,null!==(e=this._part)&&void 0!==e&&e.init&&this.visibleModal)null===(a=this._part)||void 0===a||a.init();else if(null!==(o=this._part)&&void 0!==o&&o.end&&!this.visibleModal){var r;null===(r=this._part)||void 0===r||r.end()}}_changeVisible(t){const e=null==t?void 0:t.detail;e!==this.visible&&(this.visible=e,this.dispatchCustomEvent("rewards-promotions-modal-status",{visible:e,mode:this.mode,viewType:"modal"}))}get _part(){const t={shopTermsAndConditions:this.shopTermsAndConditions,newDesignHalfModalError:this.newDesignHalfModalError,newDesignFullError:this.newDesignFullError,shopDetailTermsAndConditions:this.shopDetailTermsAndConditions,promotionRedemptionExit:this.promotionRedemptionExit,promotionRedemptionOptions:this.promotionRedemptionOptions};return this.mode in t?t[this.mode]:null}_configs(){var t,e;this._part&&Object.assign(this,null===(t=this._part)||void 0===t||null===(e=t.configs)||void 0===e?void 0:e.call(t))}_resetConfig(){Object.assign(this,{bodyText:null,buttonText:null,fullHeight:!1,headerText:null,headerType:null,titleText:null,titleIcon:"",disabledButton:!1,modalType:"modal"})}get _content(){var t,e;return(null===(t=this._part)||void 0===t||null===(e=t.render)||void 0===e?void 0:e.call(t))||h}renderPanelInfoSection(t,e,o){return p`
      <div class="experience-panel-info">
        <div class="microillustration-container">
          <bbva-clip-microillustration
            microillustration="${t}"
            size="M"
          ></bbva-clip-microillustration>
        </div>
        <div class="title">
          <bbva-type-text
            unset
            text="${this.t(e)}"
            font-weight="500"
            font-style="normal"
            size="XL"
          ></bbva-type-text>
        </div>
        <div class="description">
          <bbva-type-text
            unset
            text="${this.t(o)}"
            font-weight="350"
            size="M"
          ></bbva-type-text>
        </div>
      </div>
    `}render(){var t,e,o,i,a,r,s,n,l,c,d,m,u;return p`
      <bbva-help-modal
        id-modal=${this.mode}
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        ?full-height=${this.fullHeight}
        modal-type="${this.modalType??(null===(t=this.data)||void 0===t?void 0:t.modalType)}"
        title-text=${_(this.titleText??(null===(e=this.data)||void 0===e?void 0:e.titleText))}
        title-lines="0"
        .titleIcon="${this.titleIcon||(null===(o=this.data)||void 0===o?void 0:o.titleIcon)}"
        button-text="${_(this.buttonText??(null===(i=this.data)||void 0===i?void 0:i.buttonText))}"
        link-text="${this.t(_(this.linkText??(null===(a=this.data)||void 0===a?void 0:a.linkText)))}"
        header-text="${this.headerText??(null===(r=this.data)||void 0===r?void 0:r.headerText)}"
        body-text="${_(this.t(this.bodyText??(null===(s=this.data)||void 0===s?void 0:s.bodyText)))}"
        ?hide-content-padding-top="${this.hideContentPaddingTop??(null===(n=this.data)||void 0===n?void 0:n.hideContentPaddingTop)}"
        ?fixed-footer="${this.fixedFooter??(null===(l=this.data)||void 0===l?void 0:l.fixedFooter)}"
        ?visible=${this.visibleModal}
        ?disabled-button=${this.disabledButton}
        .closeModalElements="${this.closeModalElements||(null===(c=this.data)||void 0===c?void 0:c.closeModalElements)}"
        @visible-changed=${this._changeVisible}
        @modal-state-change="${this._handleRewardsModalState}"
        @help-modal-header-click="${null===(d=this.data)||void 0===d?void 0:d.headerClick}"
        @help-modal-veil-click="${null===(m=this.data)||void 0===m?void 0:m.veilClick}"
        @help-modal-footer-button-click="${null===(u=this.data)||void 0===u?void 0:u.footerButtonClick}"
      >
        ${this._content}
        <slot name="new-design-modal-slot" class="new-design-modal-slot"></slot>
      </bbva-help-modal>
    `}}const Ms=ut((t=>class e extends t{static get properties(){return{host:{type:String},cardsApiVersion:{type:String,attribute:"cards-api-version"},_cardsDm:{type:Object,attribute:"cards-dm",state:!0},promotionsApiVersion:{type:String,attribute:"promotions-api-version"},categoriesApiVersion:{type:String,attribute:"categories-api-version"},suggestionsApiVersion:{type:String,attribute:"suggestions-api-version"},promotionDetailApiVersion:{type:String,attribute:"promotion-detail-api-version"},customersApiVersion:{type:String,attribute:"customers-api-version"},shopSessionApiVersion:{type:String,attribute:"shop-session-api-version"},promotionsHistoricalSearch:{type:Array,state:!0},maxRequestAttempts:{type:Number,attribute:"max-request-attempts"},_servicesErrorCounter:{type:Object,state:!0},promotion:{type:Object},defaultGeoLocation:{type:Object},_fromRetry:{type:Boolean,state:!0},_fromFilter:{type:Boolean,state:!0},isLoadingPromotionDetail:{type:Boolean,attribute:"is-loading-promotion-detail"},_currentPageLoaded:{type:String,state:!0},paginationInfo:{type:Object,attribute:"pagination-info"},isLoadingPromotions:{type:Boolean,attribute:"is-loading-promotions"},promotions:{type:Array},_scrollableTopItemIndex:{type:Number,state:!0},_showSearchPanelError:{type:Boolean,state:!0},_reachedErrorPromotions:{type:Number,state:!0},_counterSuccessPromotions:{type:Number,state:!0},_counterErrorPromotions:{type:Number,state:!0},_promotionRedemptionExitModalVisible:{type:Boolean},_promotionRedemptionOptionsModalVisible:{type:Boolean},_limitCategoriesAccess:{type:Number,state:!0},_availableTooltip:{type:Boolean,state:!0},_hasScroll:{type:Boolean,state:!0},categories:{type:Array},allowedCards:{type:Array},allowedPhysicalSupport:{type:Array},promotionsTypeId:{type:Array},showPromotionsByType:{type:Boolean,attribute:"show-promotions-by-type"},showPromotionsByFeature:{type:Boolean,attribute:"show-promotions-by-feature"},showPromotionsByCategory:{type:Boolean,attribute:"show-promotions-by-category"},_lastRequestParams:{type:Object},promotionsByTypeData:{type:Object},promotionsByFeatureData:{type:Object},promotionsByCategoryData:{type:Object},promotionsBySearchData:{type:Object},promotionsByCampaignData:{type:Object,attribute:"promotions-by-campaignData"},campaignId:{type:String,attribute:"campaign-id"},_isSearchMode:{type:Boolean,state:!0},promotionsSearchFilters:{type:Object},showStoresForPromotion:{type:Boolean,attribute:"show-stores-for-promotion"},showCardsForPromotion:{type:Boolean,attribute:"show-cards-for-promotion"},enabledFilterPromotionsByProductId:{type:Boolean,attribute:"enabled-filter-promotions-by-product-id"},enabledSuggestionsForSearch:{type:Boolean,attribute:"enabled-suggestions-for-search"},_startViewMore:{type:Boolean,state:!0},_firstResultsReached:{type:Boolean,state:!0},_selectedPromotionData:{type:Object,state:!0},contracts:{type:Object},_location:{type:Object,state:!0},distanceLength:{type:Number,attribute:"distance-length"},_currentRequestURL:{type:String,state:!0},distanceType:{type:String,attribute:"distance-type"},suggestions:{type:Array},showNotifySuccess:{type:Boolean,attribute:"show-notify-success"},country:{type:String},paramArrayMode:{type:Number,attribute:"param-array-mode"},headers:{type:Object},parallelRequests:{type:Boolean,attribute:"parallel-requests"},_promotionsUserInfo:{type:Object,state:!0},preventPromotionsFlow:{type:Boolean,attribute:"prevent-promotions-flow"},enabledPromotionsWithoutProducts:{type:Boolean,attribute:"enabled-promotions-without-products"},filterPromotionsType:{type:String,attribute:"filter-promotions-type"},showShopAccess:{type:Boolean,attribute:"show-shop-access"},_createShopSessionError:{type:Boolean},_shopTermsAcepted:{type:Boolean,state:!0},customerId:{type:String,attribute:"customer-id"},filterTermId:{type:String,attribute:"filter-term-id"},isLoadingShopTerms:{type:Boolean,state:!0,attribute:"is-loading-shop-terms"},_shopLinkClicked:{type:Boolean,state:!0},couponTypes:{type:Object},_selectedCoupon:{type:String},hideBenefit:{type:Boolean,state:!1}}}constructor(){super(),this.requiredToken="tsec",this.maxRequestAttempts=3,this._servicesErrorCounter={getCards:0,getPromotions:0,getPromotion:0,getCategories:0,getCategoriesPatch:0,getCustomerTerm:0,getShopSession:0,postCustomerTerms:0,getPromotionCoupons:0},this._promotionRedemptionExitModalVisible=!1,this._promotionRedemptionOptionsModalVisible=!1,this._fromRetry=!1,this._fromFilter=!1,this._isSearchMode=!1,this.promotionsApiVersion=1,this.categoriesApiVersion=1,this.suggestionsApiVersion=1,this.promotionDetailApiVersion=0,this.customersApiVersion=1,this.cardsApiVersion=1,this.shopSessionApiVersion=1,this._scrollableTopItemIndex=6,this.categories=[],this.allowedCards=["CREDIT_CARD"],this.allowedPhysicalSupport=["NORMAL_PLASTIC","VIRTUAL"],this.showPromotionsByType=!1,this.showStoresForPromotion=!1,this.showCardsForPromotion=!1,this.showShopAccess=!1,this._lastRequestParams={},this.promotionsByTypeData={},this.promotionsByFeatureData={},this.promotionsByCategoryData={},this.promotionsBySearchData={},this.promotionsByCampaignData={},this.promotionsSearchFilters={},this.defaultGeoLocation={},this.promotionsTypeId=[],this.promotionsHistoricalSearch=[],this._startViewMore=!1,this._availableTooltip=!1,this._hasScroll=!1,this._reachedErrorPromotions=0,this._limitCategoriesAccess=3,this._currentRequestURL="",this._showSearchPanelError=!1,this._resetExtraPromotionCounter(),this._selectedPromotionData={},this.enabledFilterPromotionsByProductId=!1,this.distanceLength=20,this.distanceType="KILOMETERS",this.suggestions=[],this.showNotifySuccess=!1,this._firstResultsReached=!1,this.country="",this.paramArrayMode=1,this.pageSize=10,this.parallelRequests=!1,this._promotionsUserInfo={},this.preventPromotionsFlow=!1,this.enabledPromotionsWithoutProducts=!1,this._hasUnregisteredUserPromotionsError=!1,this.filterPromotionsType="",this._shopTermsAcepted=!1,this.isLoadingShopTerms=!1,this.customerId="",this.filterTermId="",this._shopLinkClicked=!1,this.isLoadingPromotions=!1,this._createShopSessionError=!1,this._selectedCoupon="",this.hideBenefit=!1,this.couponTypes={QR:{icon:"bbvaShop",linkText:"rewards-promotions-promotion-coupon-qr-type-confirm-link-text",text:"rewards-promotions-promotion-coupon-qr-type-confirm-text",isExternal:!0},CODE:{icon:"bbvaMobile",linkText:"rewards-promotions-promotion-coupon-code-type-confirm-link-text",text:"rewards-promotions-promotion-coupon-code-type-confirm-text",isExternal:!0}}}firstUpdated(){super.firstUpdated&&super.firstUpdated(),this._cardsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-cards-api-dm"]'),this.promotionsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-promotions-api-dm"]'),this.promotionDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-promotion-api-dm"]'),this.couponDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-promotion-coupons-api-dm"]'),this.activateCategories&&(this._categoriesDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-categories-api-dm"]')),this.enabledSuggestionsForSearch&&(this._suggestionsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-suggestions-api-dm"]')),this.showShopAccess&&(this._customerTermDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-customer-term-api-dm"]'),this._customerTermsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-customer-terms-api-dm"]'),this._shopSessionDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-shop-session-api-dm"]'))}get activateCategories(){return this.showPromotionsByCategory||this.showSearchPromotions}get _selectedPromotions(){var t,e,o;return null===(t=this._currentGroupData)||void 0===t||null===(e=t[this._selectedPromotionsGroup])||void 0===e?void 0:e[null===(o=this._selectedPromotionData)||void 0===o?void 0:o.type]}get _selectedPromotionsGroup(){var t;return null===(t=this._selectedPromotionData)||void 0===t?void 0:t.group}get _selectedPromotionsData(){var t;return null===(t=this._selectedPromotions)||void 0===t?void 0:t.data}get _currentPromotions(){return this._selectedPromotionsData||this.promotions}get _isPromotionGroup(){var t;return!(null===(t=this._selectedPromotionsData)||void 0===t||!t.length)}update(t){super.update(t),t.has("contracts")&&this.contracts&&this._getCardsFromFO(this.contracts)}_getCardsFromFO(t){var e,o;this._cardsData=null==t||null===(e=t.data)||void 0===e||null===(o=e.contracts)||void 0===o?void 0:o.filter((t=>{var e,o,i,a,r;return(null===(e=this.allowedCards)||void 0===e?void 0:e.includes(null==t||null===(o=t.subProductType)||void 0===o?void 0:o.id))&&(null===(i=this.allowedPhysicalSupport)||void 0===i?void 0:i.includes(null==t||null===(a=t.detail)||void 0===a||null===(r=a.physicalSupport)||void 0===r?void 0:r.id))}))}get _isEmptyPromotions(){var t;return this._isEmptyPromotionsGroup&&!(null!==(t=this.promotions)&&void 0!==t&&t.length)}get _isEmptyPromotionsGroup(){return!this._somePromotionGroup||["Type","Category","Feature"].reduce(((t,e)=>"Category"===e?t&&!this[`showPromotionsBy${e}`]:t&&(!this[`showPromotionsBy${e}`]||Ur(this[`promotionsBy${e}Data`]))),!0)}getContent(){var t,e;this.preventPromotionsFlow?this.isLoadingPromotions=!1:(this.cancelResponse=!1,this.isLoadingPromotions=!0,this.dispatchCustomEvent("rewards-promotions-check-location-permission-granted","location"),this.showShopAccess&&this.customerId.length&&this.filterTermId.length&&(this.isLoadingShopTerms=!0,this.getCustomerTerm()),this._cardsData||this.enabledPromotionsWithoutProducts?!this.activateCategories||null!==(t=this.categories)&&void 0!==t&&t.length?(this.enabledPromotionsWithoutProducts||(null===(e=this._cardsData)||void 0===e?void 0:e.length)>0)&&(this._isEmptyPromotions||this._errorCounter("getPromotions")>0)?(this._dispatchNotCardsEvent(),this._getInitialPromotions()):(this._dispatchNotCardsEvent(),this.isLoadingPromotions=!1):this.getCategories():this._cardsDm.getCards())}_dispatchNotCardsEvent(){var t;null!==(t=this._cardsData)&&void 0!==t&&t.length||this.dispatchCustomEvent("rewards-promotions-no-cards-notify")}acceptShopTerms(){this.showSpinner(),this._customerTermsDm.postCustomerTerms(this.customerId,[{termType:{id:this.filterTermId},status:{id:"ACCEPTED"}}])}getPromotionDetail(t){var e;this.isLoadingPromotionDetail=!0;const o={},i=(null===(e=this._cardsData)||void 0===e?void 0:e.map((t=>t.product.id)))||[];var a,r;(this.showCardsForPromotion&&(o.expand="customer-card-products"),this.enabledFilterPromotionsByProductId&&this.showCardsForPromotion&&(o["product.id"]=[...new Set(i)]),this.showStoresForPromotion)&&(o["location.geolocation.longitude"]=null!==(a=Object.keys(this._location))&&void 0!==a&&a.length?this._location.longitude:this.defaultGeoLocation.lng,o["location.geolocation.latitude"]=null!==(r=Object.keys(this._location))&&void 0!==r&&r.length?this._location.latitude:this.defaultGeoLocation.lat,o["distance.length"]=this.distanceLength,o["distance.lengthType.id"]=this.distanceType);this.promotionDm.getPromotion(t.id,o)}get _promotionsTotalCallSize(){let t=1;if(this._somePromotionGroup&&!this._startViewMore){var e;if(t=0,this.showPromotionsByType)t+=(null===(e=this.promotionsTypeId)||void 0===e?void 0:e.length)??0;this.showPromotionsByFeature&&(t+=1),this.shouldCallFavoritePromotions&&(t+=1)}return t}get _somePromotionGroup(){return this.showPromotionsByType||this.showPromotionsByFeature||this.showPromotionsByCategory}_resetAllCounterData(){this._reachedErrorPromotions=0,this._resetErrorCounters(),this._resetExtraPromotionCounter()}_resetExtraPromotionCounter(){this._counterErrorPromotions=0,this._counterSuccessPromotions=0}_getInitialPromotions(){if(this._startViewMore=!1,this._resetExtraPromotionCounter(),this._somePromotionGroup||this.getPromotions(this._getPromotionsParams("DEFAULT","MAIN")),this.showPromotionsByFeature&&this.getPromotions(this._getPromotionsParams(this._selectedPromotionData.group="FEATURE",this._selectedPromotionData.type="HOT")),this.parallelRequests){var t;if(this.showPromotionsByType)null===(t=this.promotionsTypeId)||void 0===t||t.forEach((t=>{const e=`${null==t?void 0:t.id}`;this.getPromotions(this._getPromotionsParams("TYPE",e))}));this.shouldCallFavoritePromotions&&this.getPromotions(this._getPromotionsParams("CATEGORY","MAIN"))}}_getPromotionsParams(t,e){var o,i;const a={SEARCH:{MAIN:{...this._promotionsSearchParams,...this._titleIdParam,...this._promotionsSourceIdParam}},CATEGORY:{MAIN:{"categories.id":[...this.favoriteCategoriesIds],...this._titleIdParam,...this._promotionsSourceIdParam}},FEATURE:{HOT:{"trending.id":["HOT"],...this._titleIdParam,...this._promotionsSourceIdParam}},CAMPAIGN:{MAIN:{"campaign.id":[this.campaignId],...this._titleIdParam,...this._promotionsSourceIdParam}},TYPE:{},DEFAULT:{MAIN:{...this._titleIdParam,...this._promotionsSourceIdParam}}};return null===(o=this.promotionsTypeId)||void 0===o||o.forEach((t=>{const e=null==t?void 0:t.id,o=null==t?void 0:t.categoriesId;a.TYPE[e]={"promotionType.id":[...t.id.split(",")],...o&&{"categories.id":[...t.categoriesId.split(",")]},...this._titleIdParam,...this._promotionsSourceIdParam}})),{...(null==a||null===(i=a[t])||void 0===i?void 0:i[e])||{},pageSize:this.pageSize}}get _promotionsSearchParams(){const t=[{name:"storedCategories",parseMethod:t=>{var e,o,i;let a=null==t||null===(e=t.reduce)||void 0===e?void 0:e.call(t,((t,e)=>{const o={...t};return"location"===e.group&&this._location?(o["location.geolocation.latitude"]=this._location.latitude,o["location.geolocation.longitude"]=this._location.longitude,o["distance.length"]=this.distanceLength,o["distance.lengthType.id"]=this.distanceType):(o.operators[e.group]||(o.operators[e.group]=[]),o.operators[e.group]=[...o.operators[e.group],e.id]),o}),{operators:{}});return a=null===(o=Object.keys((null===(i=a)||void 0===i?void 0:i.operators)||[]))||void 0===o?void 0:o.reduce(((t,e)=>{const o={...t};return o[e]=[...a.operators[e]],o}),{...a}),delete a.operators,a}},{name:"searchName",parseMethod:t=>t?{"commerceInformation.name":t}:{}}];return Object.keys(this.promotionsSearchFilters).reduce(((e,o)=>{var i,a;let r={...e};const s=t.find((t=>t.name===o)),n=null==s||null===(i=s.parseMethod)||void 0===i?void 0:i.call(s,null===(a=this.promotionsSearchFilters)||void 0===a?void 0:a[o]);return s&&n&&(r={...r,...n}),r}),{})}_resetScrollProps(){this._hasScroll=!1,this._availableTooltip=!1}_controlCategories(){const t=window.localStorage.getItem("rewards_promotions_categories_access"),e=parseInt(t??0,10)+1;e<=this._limitCategoriesAccess&&this.shouldShowFavoriteCategoriesPanel&&!this._firstResultsReached?(window.localStorage.setItem("rewards_promotions_categories_access",e),this._hasScroll=!0,this._availableTooltip=!0):this._resetScrollProps(),this._firstResultsReached=!0}get isCampaignPromotionsRequest(){return"campaign.id"in this._lastRequestParams&&!("paginationKey"in this._lastRequestParams)}get isCampaignPromotionsPaginationRequest(){return"campaign.id"in this._lastRequestParams&&"paginationKey"in this._lastRequestParams}_setLoadingStatus(){this.isLoadingCampaignPromotions=this.isCampaignPromotionsRequest,this.isLoadingCampaignPromotionsPagination=this.isCampaignPromotionsPaginationRequest,this.isLoadingPromotions=!this.isLoadingCampaignPromotions&&!this.isLoadingCampaignPromotionsPagination}getPromotions(t={}){this._lastRequestParams=t,this._currentPaginationInfo=this.paginationInfo,this.paginationInfo={},this._setLoadingStatus(),this.promotionsDm.getPromotions(t)}get _titleIdParam(){const t={};if(this.enabledFilterPromotionsByProductId){var e;const o=(null===(e=this._cardsData)||void 0===e?void 0:e.map((t=>t.product.id)))||[];t["product.id"]=[...new Set(o)]}return t}get _promotionsSourceIdParam(){return this.filterPromotionsType.length>0?{"promotionSource.id":this.filterPromotionsType}:{}}get _categoriesSourceIdParam(){return this.filterPromotionsType.length>0?{mapStoresSource:this.filterPromotionsType}:{}}static _getUniqueCategoryIds(t){var e;return null==t||null===(e=t.reduce)||void 0===e?void 0:e.call(t,((t,e)=>null!=e&&e.id?t.concat(null==e?void 0:e.id):t),[])}get getFavoriteCategories(){var t;return(null===(t=this.categories)||void 0===t?void 0:t.filter((t=>t.isFavourite)))||[]}get favoriteCategoriesIds(){return e._getUniqueCategoryIds(this.getFavoriteCategories)}get hasFavoriteCategories(){var t;return(null===(t=this.getFavoriteCategories)||void 0===t?void 0:t.length)>0}get shouldShowFavoriteCategoriesPanel(){return this.showPromotionsByCategory&&!this.hasFavoriteCategories}get shouldShowFavoriteCategoriesPromotionsCarousel(){return this.showPromotionsByCategory&&this.hasFavoriteCategories&&!Ur(this.promotionsByCategoryData)}get shouldShowFavoriteCategoriesNotPromotionsPanel(){return this.showPromotionsByCategory&&this.hasFavoriteCategories&&Ur(this.promotionsByCategoryData)}get shouldCallFavoritePromotions(){return this.showPromotionsByCategory&&this.hasFavoriteCategories}_sendServiceErrorCallBBVA(t){if(this._errorCounter(t)>=this.maxRequestAttempts){let e=t.replace("get","");e=e.charAt(0).toLowerCase()+e.slice(1),this.dispatchCustomEvent(`rewards-promotions-service-error-max-calls-${e}`)}}_handleRetriesError(t){this._incrementErrorsCounter(t),this._sendServiceErrorCallBBVA(t)}_incrementErrorsCounter(t){this._servicesErrorCounter[t]+=1}get _showErrorInitialPromotions(){return this._showErrorGetPromotions&&!this._isSearchMode&&!this._startViewMore}get _showErrorGetPromotions(){return this._errorCounter("getPromotions")>0||this.activateCategories&&this._errorCounter("getCategories")>0}get _promotionsErrorMaxAttempts(){return this._errorCounter("getPromotions")+this._errorCounter("getCategories")<this.maxRequestAttempts}get _showErrorGetPromotion(){return this._errorCounter("getPromotion")>0}get _promotionDetailErrorMaxAttemps(){return this._errorCounter("getPromotion")<this.maxRequestAttempts}_errorCounter(t){return t.toLowerCase().includes("getpromotions")?this._servicesErrorCounter[t]+this._servicesErrorCounter.getCards:this._servicesErrorCounter[t]}_getValidPromotionTypeId(t){var e,o;return null===(e=this.promotionsTypeId)||void 0===e||null===(o=e.find((e=>null==e?void 0:e.id.includes(t))))||void 0===o?void 0:o.id}get shopTermsAcepted(){return this._shopTermsAcepted}callGetShopSession(){this.showSpinner(),this._shopSessionDm.getShopSession()}getShopCustomerTerms(){this._errorCounter("getShopSession")>0?this.callGetShopSession():this._errorCounter("getCustomerTerm")>=0&&this.getCustomerTerm(!0)}getCustomerTerm(t=!1){var e;return t&&this.showSpinner(),this._forceShowErrorModal=t,null===(e=this._customerTermDm)||void 0===e?void 0:e.getCustomerTerm(this.customerId,this.filterTermId)}getPromotionCoupons(){this.showSpinner(),this.couponDm.getPromotionCoupons(this.promotionSelectedInfo.id)}_dispatchEmptyPromotions(){this._isEmptyPromotions?this.dispatchCustomEvent("rewards-promotions-not-promotions"):this.dispatchCustomEvent("rewards-promotions-promotions-list-load")}static _parseComplexId(t){return t||""}_setPromotions(t){var o,i,a,r,s,n;const l=t.map((t=>{let e=t;if(this.hideBenefit){const i=t.promotionType.id.replace(/_/g,"-").toLowerCase();var o;if(Nr.includes(t.promotionType.id)&&(e={...t,benefit:this.t(`rewards-promotions-promotion-description-${i}`,{amount:null==t?void 0:t.rateDiscount})}),zr.includes(t.promotionType.id))e={...t,benefit:this.t(`rewards-promotions-promotion-description-${i}`,{amount:null==t||null===(o=t.fixedDiscount)||void 0===o?void 0:o.amount})};Hr.includes(t.promotionType.id)&&(e={...t,benefit:this.t(`rewards-promotions-promotion-description-${i}`)})}return e}))||[],c=null==l?void 0:l[0],d=null==c||null===(o=c.promotionType)||void 0===o?void 0:o.id,m=null==c||null===(i=c.trending)||void 0===i?void 0:i.id,p=this._getValidPromotionTypeId(d),u=this._isSearchMode,h=this.parallelRequests?!!this._currentRequestURL.match(/promotionType.id/):"TYPE"===(null===(a=this._selectedPromotionData)||void 0===a?void 0:a.group),b=this.parallelRequests?!!this._currentRequestURL.match(/trending.id/):"FEATURE"===(null===(r=this._selectedPromotionData)||void 0===r?void 0:r.group),v=this.parallelRequests?!!this._currentRequestURL.match(/categories.id/):"CATEGORY"===(null===(s=this._selectedPromotionData)||void 0===s?void 0:s.group),g=this.parallelRequests?!!this._currentRequestURL.match(/campaign.id/):"CAMPAIGN"===(null===(n=this._selectedPromotionData)||void 0===n?void 0:n.group),y={[h]:{group:"TYPE",id:e._parseComplexId(p)},[b]:{group:"FEATURE",id:m},[v&&!h]:{group:"CATEGORY",id:"MAIN"},[u]:{group:"SEARCH",id:"MAIN"},[g]:{group:"CAMPAIGN",id:"MAIN"}},f=null==y?void 0:y.true,_=null==f?void 0:f.id;if((this._somePromotionGroup||g)&&_){var $,w;const t=`promotionsBy${Wr(f.group)}Data`;this[t]={...this[t],[_]:{id:_,data:[...(null===($=this[t])||void 0===$||null===(w=$[_])||void 0===w?void 0:w.data)||[],...l],paginationInfo:this.paginationInfo}}}this._somePromotionGroup&&g||(this.promotions=[...this.promotions,...l])}_promotionsServiceSuccess(t){null!=t&&t.length&&this.dispatchCustomEvent("rewards-promotions-rewards-landing-promotions-ambient-change","light100"),this._hasUnregisteredUserPromotionsError||(this._currentPaginationInfo={},this._counterSuccessPromotions+=1,this.paginationInfo=null!=t&&t.length&&this.paginationInfo?this.paginationInfo:{},this._setPromotions(t),this._finishedCallsAction((null==t?void 0:t.length)??0))}_onPagination(t){this.paginationInfo={...t}}get _isUserRegistered(){var t;return!(null!==(t=this.promotionsConfig)&&void 0!==t&&t.userNotRegisteredError)}_promotionsServiceError(){this.clearLoader(),this._isUserRegistered?(this._counterErrorPromotions+=1,this._handleRetriesError("getPromotions"),this._finishedCallsAction(),this.paginationInfo=this._currentPaginationInfo):(this._hasUnregisteredUserPromotionsError=!0,this.isLoadingPromotions=!1)}_resetErrorCounters(t=[]){this._servicesErrorCounter=function(t,e,o=[]){return Object.keys(t).reduce(((i,a)=>(i[a]=o.includes(a)?t[a]:e,i)),{})}(this._servicesErrorCounter,0,t)}_getPromotionsUserInfo(){var t,e,o;if(Object.keys(this.promotionsByFeatureData).length){var i,a,r;const t=null===(i=this.promotionsByFeatureData)||void 0===i||null===(a=i.HOT)||void 0===a||null===(r=a.data)||void 0===r?void 0:r.slice(0,5);for(let e=0;e<t.length;e+=1){var s,n;this._promotionsUserInfo[`internalCampaignLocation${e}`]=`points redeem-promociones especiales-superior-${e+1}-${t.length}`,this._promotionsUserInfo[`internalCampaignCampaignFormat${e}`]="carrusel",this._promotionsUserInfo[`internalCampaignCollectiveCode${e}`]="PY-",this._promotionsUserInfo[`internalCampaignCampaignName${e}`]=Kr(`-${null===(s=t[e].commerceInformation)||void 0===s?void 0:s.name}-${null===(n=t[e].promotionType)||void 0===n?void 0:n.id}`),this._promotionsUserInfo[`internalCampaignCampaignProduct${e}`]="",this._promotionsUserInfo[`internalCampaignCampaignProductCode${e}`]="",this._promotionsUserInfo[`internalCampaignCampaignQuantity${e}`]=`${t[e].benefit}`.normalize("NFD").replace(/[\u0300-\u036f]/g,"").toLowerCase()}}null!==(t=this.favoriteCategoriesIds)&&void 0!==t&&t.length&&(this._promotionsUserInfo.customFields=Kr(`categoria seleccionada:${null===(e=this.getFavoriteCategories)||void 0===e||null===(o=e.reduce)||void 0===o?void 0:o.call(e,((t,e)=>null!=e&&e.name?t.concat(null==e?void 0:e.name.toLowerCase()):t),[]).join(",")}`));this.dispatchPromotionUserInfo()}dispatchPromotionUserInfo(){var t;!this.isLoadingPromotions&&(null===(t=Object.keys(this._promotionsUserInfo))||void 0===t?void 0:t.length)>0&&this.dispatchCustomEvent("rewards-promotions-persist-promotions-user-info",this._promotionsUserInfo)}_finishedCallsAction(t){if(this._showSearchPanelError=!1,this._reachMaximumCalls){var e;if(this.isLoadingPromotions=!1,this.isLoadingCampaignPromotions=!1,this.isLoadingCampaignPromotionsPagination=!1,!this._counterErrorPromotions)if(this._reachedErrorPromotions=0,this._resetErrorCounters(["getPromotion","getCustomerTerm"]),this._startViewMore&&this._isSearchMode)null!==(e=this._lastRequestParams)&&void 0!==e&&e.paginationKey||this.dispatchCustomEvent("rewards-promotions-modal-search-result",this._parseSearchParams(t.toString(),this.promotionsSearchFilters));else this._isEmptyPromotions||this.isCampaignPromotionsRequest||this.isCampaignPromotionsPaginationRequest||this._getPromotionsUserInfo();const o=!!this._errorCounter("getPromotions");o&&(this._reachedErrorPromotions+=1),this._servicesErrorCounter.getPromotions=this._reachedErrorPromotions,this._resetExtraPromotionCounter(),this._controlCategories(),!this._startViewMore&&o&&this._resetPromotionsData(),this._isSearchMode&&o&&!Object.keys(this.promotionsBySearchData).length&&(this.promotionsBySearchData={},this._handleSearchError(),this._errorCounter("getPromotions")>=this.maxRequestAttempts&&this.dispatchCustomEvent("rewards-promotions-modal-search-error")),this._startViewMore||o||this._dispatchEmptyPromotions(),this._startViewMore&&this._isSearchMode&&!o&&(this._clickGetMorePromotions({group:"SEARCH",type:"MAIN"}),this._setHistoricalSearchStorage(),this.clearLoader()),this._finishPerformUpdate()}else if(!this.parallelRequests){({[1===this._counterSuccessPromotions&&this.shouldCallFavoritePromotions]:()=>{this.getPromotions(this._getPromotionsParams(this._selectedPromotionData.group="CATEGORY",this._selectedPromotionData.type="MAIN"))},[2===this._counterSuccessPromotions&&this.showPromotionsByType]:()=>{this.getPromotions(this._getPromotionsParams(this._selectedPromotionData.group="TYPE",this._selectedPromotionData.type="LOYALTY_POINTS"))},[3===this._counterSuccessPromotions&&this.showPromotionsByType]:()=>{this.getPromotions(this._getPromotionsParams(this._selectedPromotionData.group="TYPE",this._selectedPromotionData.type="RATE,FIXED,GIFT,CASHBACK,OTHER"))},[4===this._counterSuccessPromotions&&this.showPromotionsByType]:()=>{this.getPromotions(this._getPromotionsParams(this._selectedPromotionData.group="TYPE",this._selectedPromotionData.type="POST_PAYMENT"))}}).true()}}_parseSearchParams(t,e){var o;const i=[];return null==e||null===(o=e.storedCategories)||void 0===o||o.map((t=>i.push(t.id!==Lr[0].id?(null==t?void 0:t.name)??"":this.t("rewards-promotions-search-modal-location-no-distance-filter")))),{resultsNumber:t,categoriesSelected:Kr(i.join(",")),inputText:(null==e?void 0:e.searchName)??""}}_setHistoricalSearchStorage(){const t=[...this.promotionsHistoricalSearch];if(t.includes(this._promotionsSearchParams["commerceInformation.name"])){const e=t.indexOf(this._promotionsSearchParams["commerceInformation.name"]);t.splice(e,1)}t.push(this._promotionsSearchParams["commerceInformation.name"]),t.length>5&&t.shift(),this.promotionsHistoricalSearch=[...t.filter(Boolean)],this.dispatchCustomEvent("rewards-promotions-set-native-local-storage",{key:"promotions_historical_search",value:this.promotionsHistoricalSearch})}_finishPerformUpdate(){this._startViewMore=!0}_resetPromotionsData(){this.promotionsByTypeData={},this.promotionsByFeatureData={},this.promotionsByCategoryData={},this.promotionsBySearchData={},this.promotionsSearchFilters={},this.promotionsByCampaignData={}}get _reachMaximumCalls(){return this._promotionsTotalCallSize<=this._counterErrorPromotions+this._counterSuccessPromotions}launchInApp(t){this.dispatchCustomEvent("rewards-promotions-in-app-browser-launched",t)}_cardsServiceSuccess(t){var e,o;this.cancelResponse||(this._servicesErrorCounter.getCards=0,this._cardsData=null==t?void 0:t.filter((t=>{var e;return this.allowedCards.includes(null==t||null===(e=t.cardType)||void 0===e?void 0:e.id)})),(null===(e=this._cardsData)||void 0===e?void 0:e.length)>0?!this.activateCategories||null!==(o=this.categories)&&void 0!==o&&o.length?this._getInitialPromotions():this.getCategories():(this.isLoadingPromotions=!1,this.dispatchCustomEvent("rewards-promotions-no-cards-notify")))}_cardsServiceError(){this.cancelResponse||(this.isLoadingPromotions=!1,this._handleRetriesError("getCards"))}_promotionDetailServiceSuccess(t){let e=t;if(this.hideBenefit){const i=t.promotionType.id.replace(/_/g,"-").toLowerCase();var o;if(Nr.includes(t.promotionType.id)&&(e={...t,benefit:this.t(`rewards-promotions-promotion-description-${i}`,{amount:null==t?void 0:t.rateDiscount})}),zr.includes(t.promotionType.id))e={...t,benefit:this.t(`rewards-promotions-promotion-description-${i}`,{amount:null==t||null===(o=t.fixedDiscount)||void 0===o?void 0:o.amount})};Hr.includes(t.promotionType.id)&&(e={...t,benefit:this.t(`rewards-promotions-promotion-description-${i}`)})}(null==t?void 0:t.id)!==this.promotionSelectedInfo.id||this._closingPage||(this._servicesErrorCounter.getPromotion=0,this.isLoadingPromotionDetail=!1,this.promotion=e,this._campaignDetailVisible?this.dispatchCustomEvent("rewards-promotions-promotion-detail-page-view-from-campaign"):this.dispatchCustomEvent("rewards-promotions-promotion-detail-page-view"))}getCategories(){this._categoriesDm.getCategories(this._categoriesSourceIdParam)}_categoriesServiceSuccess(t){var e;this.cancelResponse||(this.categories=function(t,e="name"){return null==t?void 0:t.sort(((t,o)=>t[e]<o[e]?-1:t[e]>o[e]?1:0))}(null==t?void 0:t.detail)||[],null!==(e=this.categories)&&void 0!==e&&e.length?this._getInitialPromotions():this.isLoadingPromotions=!1)}categoriesServiceError(){this.cancelResponse||(this._requestCategoriesPatch?this._handleRetriesError("getCategoriesPatch"):(this._handleRetriesError("getCategories"),this.isLoadingPromotions=!1))}_promotionDetailServiceError(){this.closingPage||(this.isLoadingPromotionDetail=!1,this._incrementErrorsCounter("getPromotion"),this._sendServiceErrorCallBBVA("getPromotion"),this._servicesErrorCounter.getPromotion===this.maxRequestAttempts&&this.dispatchCustomEvent("rewards-promotions-promotion-detail-last-error"))}_promotionsRequestEnd(t){var e,o;this._currentRequestURL=(null===(e=t.detail)||void 0===e||null===(o=e.metadata)||void 0===o?void 0:o.url)||""}_getSuggestions(t){this._suggestionsDm.getSuggestions(t)}_promotionsSuggestionsSuccess(t){const e=t||[];this.suggestions=null==e?void 0:e.map((t=>null==t?void 0:t.term))}_promotionsSuggestionsError(){this._suggestionError=!0,this.suggestions=[]}_customersTermsError(){this.closeSpinner(),this._incrementErrorsCounter("getCustomerTerm"),this._shopTermsError=!0,this.isLoadingShopTerms=!1,this._shopTermsAcepted=!1,this._forceShowErrorModal&&(this._errorCounter("getCustomerTerm")>=this.maxRequestAttempts?this.setShopTermsErrorFullModal():this.setShopTermsErrorModal())}_customersTermsSuccess(t){var e;this.closeSpinner(),this._shopTermsError=!1,this.isLoadingShopTerms=!1,this._shopTermsAcepted="ACCEPTED"===(null==t||null===(e=t.status)||void 0===e?void 0:e.id)||!1,this._servicesErrorCounter.getCustomerTerm=0,this._shopLinkClicked&&this._shopTermsAcepted?(this.callGetShopSession(),this._shopLinkClicked=!1):this._shopLinkClicked&&!this._shopTermsAcepted&&(this._shopTermsAndConditionsModalVisible=!0,this._shopLinkClicked=!1)}_customersPostTermsError(){this.closeSpinner(),this._incrementErrorsCounter("postCustomerTerms"),this._errorCounter("postCustomerTerms")>=this.maxRequestAttempts?(this.setPostTermsErrorFullModal(),this._shopTermsAndConditionsModalVisible=!1):this.setShopTermsAcceptErrorModal()}_customersPostTermsSuccess(){this._shopTermsAcepted=!0,this._shopTermsAndConditionsModalVisible=!1,this.callGetShopSession()}_shopSessionSuccess(t){this._servicesErrorCounter.getShopSession=0,this._createShopSessionError=!1,this.closeSpinner(),this._shopTermsAcepted&&this.launchInApp({method:"GET",title:this.t("rewards-promotions-shop-terms-and-conditions-in-app-title"),url:null==t?void 0:t.url,headers:{authToken:null==t?void 0:t.authToken}})}_shopSessionError(){this._incrementErrorsCounter("getShopSession"),this.closeSpinner(),this._createShopSessionError=!0,this._errorCounter("getShopSession")>=this.maxRequestAttempts?this.setShopTermsErrorFullModal():this.setShopTermsErrorModal()}_couponSuccess(t){this.closeSpinner();const e=t.filter((t=>{var e;return Object.keys(this.couponTypes).includes(null==t||null===(e=t.couponType)||void 0===e?void 0:e.id)}));1===e.length?(this._selectedCoupon=e[0].couponType.id,this._promotionRedemptionExitModalVisible=!0):this._promotionRedemptionOptionsModalVisible=!0,this.coupons=e.reduce(((t,e)=>({...t,[e.couponType.id]:e})),{})}_couponServiceError(){this.closeSpinner(),this._incrementErrorsCounter("getPromotionCoupons"),this._errorCounter("getPromotionCoupons")>=this.maxRequestAttempts?this.setCouponsErrorFullModal():this.setCouponsErrorModal()}resetCouponsErrorCount(){this._servicesErrorCounter.getPromotionCoupons=0}resetTermsAndShopErrorCount(){this._servicesErrorCounter.getCustomerTerm=0,this._servicesErrorCounter.getShopSession=0,this._servicesErrorCounter.postCustomerTerms=0}patchCategories(t){var e;const o=this._requestRemoveCategories?this.getFavoriteCategories:t,i=[...(null==o?void 0:o.map((t=>({id:t.id,isFavourite:!this._requestRemoveCategories}))))||[]];this._requestCategoriesPatch=!0,null===(e=this._categoriesDm)||void 0===e||e.patchCategories(i)}categoriesUpdateSuccess(t){this._requestCategoriesPatch=!1,this.cancelResponse||(this.categories=this.categories.reduce(((e,o)=>{const i=[...e],a=!this._requestRemoveCategories&&(null==t?void 0:t.detail.some((t=>t.id===o.id)));return i.push({...o,isFavourite:a}),i}),[]))}categoriesUpdateError(){this._requestCategoriesPatch=!1,this._categoryUpdateMode=!1,this.clearLoader(),this.cancelResponse||this._handleRetriesError("getCategoriesPatch")}get _renderPromotionsApis(){return p`
          <bbva-global-promotions-api-dm
            .host="${this.host}"
            .version="${this.promotionsApiVersion}"
            .requiredToken="${this.requiredToken}"
            .country="${this.country}"
            .paramArrayMode="${this.paramArrayMode}"
            .headers="${this.headers}"
            .localCustomProperties="${this.localCustomProperties}"
            ?native="${this.native}"
            ?emitRequestEvents="${!0}"
            @http-request-end="${this._promotionsRequestEnd}"
            @promotions-api-dm-pagination="${t=>this._onPagination(t.detail)}"
            @promotions-api-dm-fetch="${t=>this._promotionsServiceSuccess(t.detail)}"
            @promotions-api-dm-fetch-error="${t=>this._promotionsServiceError(t.detail)}"
            @api-dm-error="${t=>this._promotionsServiceError(t.detail)}"
          ></bbva-global-promotions-api-dm>
          <bbva-global-promotion-api-dm
            .host="${this.host}"
            .version="${this.promotionDetailApiVersion}"
            .requiredToken="${this.requiredToken}"
            .country="${this.country}"
            .paramArrayMode="${this.paramArrayMode}"
            .headers="${this.headers}"
            .localCustomProperties="${this.localCustomProperties}"
            ?native="${this.native}"
            @promotion-api-dm-fetch="${t=>this._promotionDetailServiceSuccess(t.detail)}"
            @promotion-api-dm-fetch-error="${t=>this._promotionDetailServiceError(t.detail)}"
            @api-dm-error="${t=>this._promotionDetailServiceError(t.detail)}"
          ></bbva-global-promotion-api-dm>
          <bbva-global-cards-api-dm
            .host="${this.host}"
            .version="${this.cardsApiVersion}"
            .requiredToken="${this.requiredToken}"
            ?native="${this.native}"
            .cards=${this._cardsData??[]}
            .headers="${this.headers}"
            @cards-api-dm-fetch="${t=>this._cardsServiceSuccess(t.detail)}"
            @cards-api-dm-fetch-error="${t=>this._cardsServiceError(t.detail)}"
            @api-dm-error="${t=>this._cardsServiceError(t.detail)}"
          ></bbva-global-cards-api-dm>
          <bbva-global-promotion-coupons-api-dm
            id="promotionCouponsDm"
            .host="${this.host}"
            .localCustomProperties="${this.localCustomProperties}"
            .version="${this.cardsApiVersion}"
            .requiredToken="${this.requiredToken}"
            .country="${this.country}"
            ?native="${this.native}"
            @promotion-coupons-api-dm-fetch="${t=>this._couponSuccess(t.detail)}"
            @promotion-coupons-api-dm-fetch-error="${t=>this._couponServiceError(t.detail)}}"
            @api-dm-error="${t=>this._couponServiceError(t.detail)}"
          ></bbva-global-promotion-coupons-api-dm>
          ${this.activateCategories?p`
                <bbva-global-categories-api-dm
                  .host="${this.host}"
                  .version="${this.categoriesApiVersion}"
                  ?native="${this.native}"
                  .requiredToken="${this.requiredToken}"
                  .headers="${this.headers}"
                  @categories-api-dm-fetch="${this._categoriesServiceSuccess}"
                  @categories-api-dm-fetch-error="${this.categoriesServiceError}"
                  @categories-api-dm-update="${this.categoriesUpdateSuccess}"
                  @categories-api-dm-update-error="${this.categoriesUpdateError}"
                  @api-dm-error="${this.categoriesServiceError}"
                >
                </bbva-global-categories-api-dm>
              `:h}
          ${this.enabledSuggestionsForSearch?p`
                <bbva-global-suggestions-api-dm
                  id="suggestionsDm"
                  .host="${this.host}"
                  .version="${this.suggestionsApiVersion}"
                  ?native="${this.native}"
                  .headers="${this.headers}"
                  .requiredToken="${this.requiredToken}"
                  @suggestions-api-dm-fetch="${t=>this._promotionsSuggestionsSuccess(t.detail)}"
                  @suggestions-api-dm-fetch-error="${t=>this._promotionsSuggestionsError(t.detail)}"
                  @api-dm-error="${t=>this._promotionsSuggestionsError(t.detail)}"
                >
                </bbva-global-suggestions-api-dm>
              `:h}
          ${this.showShopAccess?p`
                <bbva-global-customer-term-api-dm
                  id="customersTermDm"
                  .host="${this.host}"
                  .version="${this.customersApiVersion}"
                  ?native="${this.native}"
                  .headers="${this.headers}"
                  .requiredToken="${this.requiredToken}"
                  @customer-term-api-dm-fetch="${t=>this._customersTermsSuccess(t.detail)}"
                  @customer-term-api-dm-fetch-error="${t=>this._customersTermsError(t.detail)}"
                  @api-dm-error="${t=>this._customersTermsError(t.detail)}"
                ></bbva-global-customer-term-api-dm>
                <bbva-global-customer-terms-api-dm
                  id="customersTermsDm"
                  .host="${this.host}"
                  .version="${this.customersApiVersion}"
                  ?native="${this.native}"
                  .headers="${this.headers}"
                  .requiredToken="${this.requiredToken}"
                  @customer-terms-api-dm-create="${()=>this._customersPostTermsSuccess()}"
                  @customer-terms-api-dm-create-error="${()=>this._customersPostTermsError()}"
                  @api-dm-error="${()=>this._customersPostTermsError()}"
                >
                </bbva-global-customer-terms-api-dm>
                <bbva-global-shop-session-api-dm
                  id="shopSessionDm"
                  .host="${this.host}"
                  .version="${this.shopSessionApiVersion}"
                  ?native="${this.native}"
                  .headers="${this.headers}"
                  .requiredToken="${this.requiredToken}"
                  @shop-session-api-dm-fetch="${t=>this._shopSessionSuccess(t.detail)}"
                  @shop-session-api-dm-fetch-error="${t=>this._shopSessionError(t.detail)}"
                  @api-dm-error="${t=>this._shopSessionError(t.detail)}"
                >
                </bbva-global-shop-session-api-dm>
              `:h}
        `}}));var Fs=t`
:host {
  --bbva-progress-content-z-index: 100;
  --bbva-z-index-notifications: 100;
  --bbva-header-main-position: static;
  box-sizing: border-box;
  position: absolute;
  top: var(--top-position);
  display: flex;
  flex-direction: column;
  width: 100%;
}

@supports (margin-top: env(safe-area-inset-top)) {
  :host {
    --safe-area-inset-top: env(safe-area-inset-top);
    margin-top: var(--safe-area-inset-top, 0);
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
`;class Bs extends(K(Fr(Ms(Ye(Ke(l(e))))))){static get is(){return"rewards-promotions"}static get scopedElements(){const t=[ce,Do,Mo,Fo,Bo,pr,hr,Ro,Zo,H,dt,ae,de,me,z,Je,ys,Ss,Ds,Cr,kr,es,Ir,ps,...Bs.configurationScopedElements()];return Bs.scopedElementsFromClasses(t)}static get properties(){return{loadStandaloneContent:{type:Boolean,attribute:"load-standalone-content"},_navigationStack:{type:Array,state:!0},pageName:{type:String,attribute:"page-name"},_promotionIcons:{type:Object,state:!0},_promotionTextKeys:{type:Object,state:!0},_panelErrorData:{type:Object,state:!0},_previousPageLoaded:{type:String,state:!0},_headerTextKey:{type:String,state:!0},_modalMode:{type:String,state:!0},_modalVisible:{type:Boolean,state:!0},_errorModalVisible:{type:Boolean,state:!0},_favoriteCategoriesModalVisible:{type:Boolean,state:!0},_removeModalVisible:{type:Boolean,state:!0},_exitModalVisible:{type:Boolean,state:!0},_halfErrorModalVisible:{type:Boolean,state:!0},_shopTermsAndConditionsModalVisible:{type:Boolean,state:!0},_newDesignHalfModalErrorModalVisible:{type:Boolean,state:!0},_newDesignFullErrorModalVisible:{type:Boolean,state:!0},_shopDetailTermsAndConditionsModalVisible:{type:Boolean,state:!0},promotionsConfig:{type:Object},_modalData:{type:Object,state:!0},_modalErrorData:{type:Object,state:!0},_modalHalfErrorData:{type:Object,state:!0},_modalExitData:{type:Object,state:!0},_modalFavoriteCategoriesData:{type:Object,state:!0},_modalRemoveData:{type:Object,state:!0},_resetPage:{type:Boolean,state:!0},_cardsData:{type:Array,state:!0},_closingPage:{type:Boolean,state:!0},_cancelResponse:{type:Boolean,state:!0},_locationEnabled:{type:Boolean,reflect:!0,attribute:"location-enabled"},_location:{type:Object,state:!0},_detailVisible:{type:Boolean,state:!0},_viewMoreVisible:{type:Boolean,state:!0},_viewMoreStoresVisible:{type:Boolean,state:!0},_campaignDetailVisible:{type:Boolean,state:!0},_viewMoreCampaignPromotionsVisible:{type:Boolean,state:!0},showSearchPromotions:{type:Boolean,attribute:"show-search-promotions"},showSearchByLocation:{type:Boolean,attribute:"show-search-by-location"},showSearchByPromotionType:{type:Boolean,attribute:"show-search-by-promotion-type"},showCardsForPromotion:{type:Boolean,reflect:!0,attribute:"show-cards-for-promotion"},detailDownloadConfig:{type:Object},showStoreInformation:{type:Boolean,attribute:"show-store-information"},showStoresForPromotion:{type:Boolean,attribute:"show-stores-for-promotion"},_moreStores:{type:Object,state:!0},mobileServices:{type:Object,attribute:"mobile-services"},limitFavoriteCategoriesToSelect:{type:Number,attribute:"limit-favorite-categories-tab-select"},locationPermissionState:{type:Object,attribute:"location-permission-state"},locationServiceState:{type:Object,attribute:"location-service-state"},fieldToSearch:{type:String,attribute:"field-to-search"},showPromotionsByOneType:{type:Boolean,attribute:"show-promotions-by-one-type"},_modalHalfExitData:{type:Object},_halfExitModalVisible:{type:Boolean},formatDate:{type:String,attribute:"format-date"},topPosition:{type:String,attribute:"top-position"}}}constructor(){super(),this.language="es-ES",this._modalData={},this._modalErrorData={},this._modalHalfErrorData={},this._modalExitData={},this._modalHalfExitData={},this._modalFavoriteCategoriesData={},this._modalRemoveData={},this._avoidReset=!1,this.loadStandaloneContent=!1,this._navigationStack=[],this._currentPageLoaded=ys.MODES.list,this._resetPage=!1,this._modalVisible=!1,this._shopTermsAndConditionsModalVisible=!1,this._newDesignHalfModalErrorModalVisible=!1,this._newDesignFullErrorModalVisible=!1,this._shopDetailTermsAndConditionsModalVisible=!1,this._exitModalVisible=!1,this._halfExitModalVisible=!1,this._favoriteCategoriesModalVisible=!1,this._removeModalVisible=!1,this._halfErrorModalVisible=!1,this._errorModalVisible=!1,this._detailVisible=!1,this._campaignDetailVisible=!1,this._viewMoreVisible=!1,this.isLoadingPromotions=!1,this.isLoadingCampaignPromotions=!1,this.promotionsConfig={},this.promotions=[],this._cancelResponse=!1,this.assistancePhone="",this._headerTextKey="rewards-promotions-promotions-view-more-title",this._closingPage=!1,this._panelErrorData={},this._categoryUpdateMode=!1,this._promotionIcons={ONLINE:{icon:gt(),category:"transportation"},PHYSICAL:{icon:yt(),category:"shopping"},DISTANCE:{icon:pe()}},this._promotionTextKeys={HOT:"rewards-promotions-category-type-specials","RATE,FIXED,GIFT,CASHBACK,OTHER":"rewards-promotions-category-type-discounts",LOYALTY_POINTS:"rewards-promotions-category-type-points",POST_PAYMENT:"rewards-promotions-category-type-months",SEARCH:"rewards-promotions-search-title",CATEGORY:"rewards-promotions-category-type-favorite",default:"rewards-promotions-promotions-view-more-title"},this.showPromotionsByCategory=!1,this.showSearchPromotions=!1,this.showSearchByLocation=!1,this.showSearchByPromotionType=!1,this.config={...this.config,loader:{spinnerMessageLabel:"rewards-promotions-loader-label"}},this.showCardsForPromotion=!1,this.showStoreInformation=!1,this.showStoresForPromotion=!1,this.mobileServices={},this.limitFavoriteCategoriesToSelect=3,this._removingFavoriteCategoriesFromViewMore=!1,this._requestRemoveCategories=!1,this.locationPermissionState={state:"permanently_denied"},this.locationServiceState={isLocationServiceEnabled:!1},this._locationEnabled=!1,this.fieldToSearch="commerceInformation.name",this._location={},this.showPromotionsByOneType=!1,this.formatDate="D MMM YYYY",this.topPosition="0px",this._viewMoreCampaignPromotionsVisible=!1}static get styles(){return[Fs,U.light,pt.light,G.light,ue.light,o("rewards-promotions-shared-styles")]}firstUpdated(){super.firstUpdated&&super.firstUpdated(),this.style.setProperty("--top-position",this.topPosition),Lr[0].data={units:Yr(this.distanceLength,this.distanceType,0,!1,"")},this.dispatchCustomEvent("rewards-promotions-get-native-local-storage",{key:"promotions_historical_search"}),window.addEventListener("click",(()=>{this._requestShowNotifySuccess(!1)})),this.promotionSelectedInfo&&this._onPromotionSelected(this.promotionSelectedInfo),this.loadStandaloneContent?this.getContent():this.isLoadingPromotions=!0}update(t){if(t.has("locationPermissionState")||t.has("locationServiceState")){this._locationEnabled=this._checkLocationEnabled();const t=this._modalData;t.locationDisabled=!this._locationEnabled,this._modalData={...t}}super.update(t)}_checkLocationEnabled(){var t,e;return"granted"===(null===(t=this.locationPermissionState)||void 0===t?void 0:t.state)&&(null===(e=this.locationServiceState)||void 0===e?void 0:e.isLocationServiceEnabled)}reset(){this._avoidReset||(this._currentPageLoaded=ys.MODES.list,this.promotionsConfig={},this._promotionsUserInfo={},this.promotions=[],this.paginationInfo={},this._isSearchMode=!1,this._startViewMore=!1,this._resetPage=!0,this._closingPage=!0,this._availableTooltip=!1,this._hasScroll=!1,this._firstResultsReached=!1,this._fromRetry=!1,this.promotionsDm.resetPromotions(),this.promotionDm.resetPromotion(),this._cardsDm.resetCards(),this.activateCategories&&(this._categoriesDm.resetCategories(),this.categories=[]),this._reachedErrorPromotions=0,this._removingFavoriteCategoriesFromViewMore=!1,this._requestRemoveCategories=!1,this._resetExtraPromotionCounter(),this._resetPromotionsData(),this._resetErrorCounters(),this.locationPermissionState={state:"permanently_denied"},this.locationServiceState={isLocationServiceEnabled:!1},this._locationEnabled=!1,this._categoryUpdateMode=!1)}getGeolocationSuccess(t){this._location=t,this._detailVisible?this.getPromotionDetail(this.promotionSelectedInfo):this.getPromotions(this._getPromotionsParams("SEARCH","MAIN"))}getGeolocationError(){this._detailVisible?this._promotionDetailServiceError():this._promotionsServiceError()}_resetPromotionsState(){this.loadStandaloneContent=!1,this._navigationStack=[],this._resetPage=!1,this._closingPage=!1,this._selectedPromotionData={}}avoidResetPage(){this._avoidReset=!0}allowResetPage(){this._avoidReset=!1}_searchWithFilters(t){var e;this.promotionsSearchFilters=t,this._isSearchMode=!0,this._startViewMore=!0,this.promotionsBySearchData={},this.showSpinner(),this.config.loader.spinnerMessageLabel="rewards-promotions-loader-label",null!==(e=this.promotionsSearchFilters.storedCategories.filter((t=>"LOCATION"===t.id)))&&void 0!==e&&e.length?this.dispatchCustomEvent("rewards-promotions-get-current-location"):this.getPromotions(this._getPromotionsParams("SEARCH","MAIN"))}rewardsHistoricalSearchFromStorageError(){this._hasToShowOnboarding=!0,this.dispatchCustomEvent("rewards-promotions-set-native-local-storage",{key:"promotions_historical_search",value:[]})}showSpinner(){this.showLoader("full",!0,!1),this.ambient="light"}closeSpinner(){this.clearLoader(),this.ambient="dark400"}_commitFavoriteCategories({storedCategoriesEdited:t,action:e}){this._storedCategoriesEdited=t;this.notificationToastMessage={choose:"rewards-promotions-notification-toast-choose-favorite-categories-success",change:"rewards-promotions-notification-toast-change-favorite-categories-success"}[e],this.config.loader.spinnerMessageLabel=this.t("rewards-promotions-spinner-save-favorite-categories-message"),this.showSpinner(),this.patchCategories(t)}_removeFavoriteCategories(t){this.notificationToastMessage="rewards-promotions-notification-toast-success",this.config.loader.spinnerMessageLabel=this.t("rewards-promotions-spinner-save-favorite-categories-message"),this._removingFavoriteCategoriesFromViewMore=null==t?void 0:t.isFromViewMore,this._requestRemoveCategories=!0,this.showSpinner(),this._hasScroll=!0,this.patchCategories()}_requestShowNotifySuccess(t){this._removingFavoriteCategoriesFromViewMore&&(this._removingFavoriteCategoriesFromViewMore=!1,this._viewMoreVisible=!1),this.showNotifySuccess=t}categoriesUpdateSuccess(t){this._resetScrollProps(),super.categoriesUpdateSuccess(t),!this.cancelResponse&&this._requestRemoveCategories&&(this.closeSpinner(),this._requestShowNotifySuccess(!0)),this.cancelResponse||this._requestRemoveCategories||(this.navigateBack({currentPage:this.pageName}),this._categoryUpdateMode=!0,this._resetPromotionsData(),this._getInitialPromotions()),this._requestRemoveCategories=!1}categoriesServiceError(){super.categoriesServiceError(),this.cancelResponse||this._requestCategoriesPatch&&(this._requestCategoriesPatch=!1,this._handleCategoriesPatchError())}categoriesUpdateError(){this._resetScrollProps(),super.categoriesUpdateError(),this.cancelResponse||this._handleCategoriesPatchError(),this._requestRemoveCategories=!1}_handleCategoriesPatchError(){if(this.closeSpinner(),this._servicesErrorCounter.getCategoriesPatch<this.maxRequestAttempts){const t={mode:ps.MODES.halfError,data:{titleText:this.t("rewards-promotions-change-favorites-half-error-title-text"),bodyText:this.t("rewards-promotions-change-favorites-half-error-body-text")}};this._openHalfErrorModal(t,!1)}else{const t={mode:ps.MODES.error,data:{headerText:this.t("rewards-promotions-change-favorites-error-modal-header-text"),heading:this.t("rewards-promotions-change-favorites-error-title-text"),text:this.t("rewards-promotions-change-favorites-error-body-text"),buttonText:this.assistancePhone?this.t("rewards-promotions-error-button-text-call"):this.t("rewards-promotions-error-button-text"),linkText:this.assistancePhone?this.t("rewards-promotions-error-button-text"):"",footerButtonClick:this.assistancePhone?()=>{this._clickCallBBVA()}:()=>{}}};this._openErrorModal(t),this.dispatchCustomEvent("rewards-promotions-favorite-categories-error-modal")}}_openHalfExitModal(t){const e={mode:ps.MODES.halfExit,data:{buttonText:this.t("rewards-promotions-half-exit-button-text"),linkText:this.t("rewards-promotions-half-exit-link-text"),bodyText:this.t("rewards-promotions-half-exit-body-text"),footerButtonClick:()=>{this._launchExternalURI(t)}}};this._halfExitModal(e)}_halfExitModal(t){null!=t&&t.data&&(this._modalHalfExitData={...null==t?void 0:t.data}),this._halfExitModalVisible=!0}_halfErrorRetryClicked(){this._retryPatchCategories=!0,this._halfErrorModalVisible=!1,this.showSpinner(),this.patchCategories(this._storedCategoriesEdited)}_shopTermsAndconditionsReadClicked(){this._shopDetailTermsAndConditionsModalVisible=!0}_finishPerformUpdate(){var t;this._categoryUpdateMode&&(this._categoryUpdateMode=!1,this._setViewMoreData({group:"CATEGORY",type:null===(t=Object.keys(this.promotionsByCategoryData||{}))||void 0===t?void 0:t[0]}),super._finishPerformUpdate(),this.closeSpinner(),this._requestShowNotifySuccess(!0))}_handleModeStatus(t){var e,o,i;const a=null==t||null===(e=t.detail)||void 0===e?void 0:e.mode,r=null==t||null===(o=t.detail)||void 0===o?void 0:o.viewType,s=null==t||null===(i=t.detail)||void 0===i?void 0:i.visible;"modal"===r?void 0===this[`_${a}ModalVisible`]?this._modalVisible=s:this[`_${a}ModalVisible`]=s:this[`_${a}Visible`]=s,s?this.navigateToPage(t):this._popStackElement()}navigateToPage(t){const[e]=t.composedPath();this._navigationStack.push(e)}navigateBack(t){var e,o;if(((null==t?void 0:t.currentPage)||(null==t||null===(e=t.value)||void 0===e||null===(o=e.cancelledNavigation)||void 0===o?void 0:o.currentPage))===this.pageName){const t=this._getLastElement();t&&"function"==typeof t.navigateToPreviousPage?t.navigateToPreviousPage():this.backStep()}}_popStackElement(){return this._navigationStack.pop()}_getLastElement(){var t;return(null===(t=this._navigationStack)||void 0===t?void 0:t.length)>0?this._navigationStack[this._navigationStack.length-1]:void 0}_onPromotionSelected(t){var e;(this._closingPage=!1,this._cancelResponse=!1,null!=t&&t.isCampaign)?(this.campaignId=(null==t||null===(e=t.campaign)||void 0===e?void 0:e.id)??(null==t?void 0:t.id),this.campaignSelectedInfo=t,this._previousSelectedPromotionData=this._selectedPromotionData,this._selectedPromotionData={group:"CAMPAIGN",type:"MAIN"},this._startViewMore=!0,this._campaignDetailVisible=!0,this._currentPageLoaded=Ss.MODES.detail):(this.promotionSelectedInfo=t,this._detailVisible=!0,this._currentPageLoaded=ys.MODES.detail)}_launchExternalURI(t){this.dispatchCustomEvent("rewards-promotions-launch-external-uri",{scheme:t})}_openPdfDocument(t){const e=null==t?void 0:t.trim(),o=this.t("rewards-promotions-pdf-document-title");this.dispatchCustomEvent("rewards-promotions-open-pdf-documents",{...this.detailDownloadConfig,value:e,title:o})}_setViewMoreData(t){var e,o,i,a,r,s,n;(this._closingPage=!1,this._cancelResponse=!1,this._selectedPromotionData=t,this._reachedErrorPromotions=0,this._resetExtraPromotionCounter(),this._servicesErrorCounter.getPromotions=0,this._headerTextKey="rewards-promotions-promotions-view-more-title",this._selectedPromotions)&&(this.paginationInfo=null===(e=this._selectedPromotions)||void 0===e?void 0:e.paginationInfo,this.currentPage=null===(o=this.paginationInfo)||void 0===o?void 0:o.page,this._headerTextKey=(null===(i=this._promotionTextKeys)||void 0===i?void 0:i[null===(a=this._selectedPromotionData)||void 0===a?void 0:a.group])||(null===(r=this._promotionTextKeys)||void 0===r?void 0:r[null===(s=this._selectedPromotionData)||void 0===s?void 0:s.type])||(null===(n=this._promotionTextKeys)||void 0===n?void 0:n.default))}_clickGetMorePromotions(t){this._setViewMoreData(t),this._startViewMore=!0,this._viewMoreVisible=!0,this._currentPageLoaded=ys.MODES.viewMore}_openGenericModal(t){this._modalMode=null==t?void 0:t.mode,null!=t&&t.data&&(this._modalData={...null==t?void 0:t.data,promotionsHistoricalSearch:this.promotionsHistoricalSearch}),"search"===(null==t?void 0:t.mode)&&(this._fromFilter=!1),this._modalVisible=!0}openModal(t){var e;if((null==t?void 0:t.mode)===ps.MODES.favoriteCategories)return this._openFavoriteCategoriesModal(t),"choose"===(null==t||null===(e=t.data)||void 0===e?void 0:e.action)&&this.dispatchCustomEvent("rewards-promotions-choose-categories-link-click"),void this.dispatchCustomEvent("rewards-promotions-open-favorite-categories-modal");(null==t?void 0:t.mode)!==ps.MODES.remove?this._openGenericModal(t):this._openRemoveModal(t)}_handleSearchError(){this.closeSpinner(),this._showSearchPanelError=!0,this._errorCounter("getPromotions")<this.maxRequestAttempts?this._panelErrorData={heading:this.t("rewards-promotions-search-error-title"+(this._fromFilter?"-alt":"")),text:this.t("rewards-promotions-search-error-text"+(this._fromFilter?"-alt":"")),buttonText:this.t("rewards-promotions-search-button-text-retry"),linkText:this.t("rewards-promotions-search-button-text-back"),isRetry:!0}:this._panelErrorData={heading:this.t("rewards-promotions-search-error-title"+(this._fromFilter?"-alt":"")),text:this.t("rewards-promotions-search-error-text-call"+(this._fromFilter?"-alt":"")),buttonText:this.assistancePhone?this.t("rewards-promotions-search-button-text-call-to-bank"):this.t("rewards-promotions-search-button-text-back"),linkText:this.assistancePhone?this.t("rewards-promotions-search-button-text-back"):"",isRetry:!1},this._startViewMore=!0,this._viewMoreVisible=!0,this._headerTextKey=this._promotionTextKeys.SEARCH,this._currentPageLoaded=ys.MODES.viewMore}_openRemoveModal(t){null!=t&&t.data&&(this._modalRemoveData={...null==t?void 0:t.data}),this._removeModalVisible=!0}_openFavoriteCategoriesModal(t){null!=t&&t.data&&(this._modalFavoriteCategoriesData={...null==t?void 0:t.data}),this._favoriteCategoriesModalVisible=!0}openExitModal(t){null!=t&&t.data&&(this._modalExitData={...null==t?void 0:t.data}),this._exitModalVisible=!0}_openHalfErrorModal(t){null!=t&&t.data&&(this._modalHalfErrorData={...null==t?void 0:t.data}),this._halfErrorModalVisible=!0}_openErrorModal(t){null!=t&&t.data&&(this._modalErrorData={...null==t?void 0:t.data}),this._errorModalVisible=!0}_tooltipLinkClick(){this._availableTooltip=!1}get _currentGroupData(){return{FEATURE:this.promotionsByFeatureData,TYPE:this.promotionsByTypeData,CATEGORY:this.promotionsByCategoryData,SEARCH:this.promotionsBySearchData,CAMPAIGN:this.promotionsByCampaignData}}_showMoreStores({stores:t}){this._moreStores=t,this._viewMoreStoresVisible=!0,this._currentPageLoaded=ys.MODES.viewMoreStores}_showMoreCampaignPromotions(){this._viewMoreCampaignPromotionsVisible=!0,this._currentPageLoaded=Ss.MODES.viewMoreCampaignPromotions}_lookForSuggestions(t){this.enabledSuggestionsForSearch&&this.updateComplete.then((()=>{this._modalData={...null==t?void 0:t.data},this._getSuggestions({term:null==t?void 0:t.termInputSearch,field:this.fieldToSearch})}))}_resetInputTermSearch(t){this._modalData={...null==t?void 0:t.data},this.suggestions=[]}_getPromotionDetail(t){this.isLoadingPromotionDetail=!0,this._locationEnabled?this.dispatchCustomEvent("rewards-promotions-get-current-location"):this.getPromotionDetail(t)}get _hasPanelError(){return this._showSearchPanelError&&this._isSearchMode}_isSearchModeReset(){this._viewMoreVisible||(this._isSearchMode=!1)}shopLinkClick(){this._shopTermsError?(this._shopLinkClicked=!0,this.setShopTermsErrorModal()):this.shopTermsAcepted?this.callGetShopSession():this._shopTermsAndConditionsModalVisible=!0}setShopTermsErrorModal(){const t={mode:Ds.MODES.newDesignHalfModalError,data:{titleText:this.t("rewards-promotions-shop-terms-and-conditions-modal-error-title-text"),bodyText:this.t("rewards-promotions-shop-terms-and-conditions-modal-half-error-body-text"),headerText:this.t("rewards-promotions-shop-terms-and-conditions-modal-error-header-text"),buttonText:this.t("rewards-promotions-shop-terms-and-conditions-modal-error-button-text"),fixedFooter:!1,footerButtonClick:()=>this.getShopCustomerTerms(),headerClick:()=>this.resetTermsAndShopErrorCount(),veilClick:()=>this.resetTermsAndShopErrorCount(),closeModal:()=>this.resetTermsAndShopErrorCount()}};this._modalHalfErrorData={...null==t?void 0:t.data},this._newDesignHalfModalErrorModalVisible=!0,this._isAcceptTermsModal=!1}setShopTermsAcceptErrorModal(){const t={mode:Ds.MODES.newDesignHalfModalError,data:{titleText:this.t("rewards-promotions-shop-terms-and-conditions-modal-error-accept-terms-title-text"),bodyText:this.t("rewards-promotions-shop-terms-and-conditions-modal-half-error-accept-terms-body-text"),headerText:this.t("rewards-promotions-shop-terms-and-conditions-modal-error-header-text"),buttonText:this.t("rewards-promotions-shop-terms-and-conditions-modal-error-button-text"),fixedFooter:!1,footerButtonClick:()=>this.acceptShopTerms(),headerClick:()=>this.resetTermsAndShopErrorCount(),veilClick:()=>this.resetTermsAndShopErrorCount(),closeModal:()=>this.resetTermsAndShopErrorCount()}};this._modalHalfErrorData={...null==t?void 0:t.data},this._newDesignHalfModalErrorModalVisible=!0,this._isAcceptTermsModal=!0}setShopTermsErrorFullModal(){const t={mode:Ds.MODES.newDesignFullError,data:{headerText:this.t("rewards-promotions-shop-terms-and-conditions-modal-error-header-text"),text:this.t("rewards-promotions-shop-terms-and-conditions-modal-full-error-body-text"),heading:this.t("rewards-promotions-shop-terms-and-conditions-modal-error-title-text"),buttonText:this.t("rewards-promotions-shop-terms-and-conditions-modal-error-accept-text"),fixedFooter:!0,footerButtonClick:()=>this.resetTermsAndShopErrorCount(),headerClick:()=>this.resetTermsAndShopErrorCount(),closeModal:()=>this.resetTermsAndShopErrorCount()}};this._modalFullErrorData={...null==t?void 0:t.data},this._newDesignFullErrorModalVisible=!0}setPostTermsErrorFullModal(){const t={mode:Ds.MODES.newDesignFullError,data:{headerText:this.t("rewards-promotions-shop-terms-and-conditions-modal-error-header-text"),heading:this.t("rewards-promotions-shop-terms-and-conditions-modal-error-accept-terms-title-text"),text:this.t("rewards-promotions-shop-terms-and-conditions-modal-full-error-accept-terms-body-text"),buttonText:this.t("rewards-promotions-shop-terms-and-conditions-modal-error-accept-text"),fixedFooter:!0,footerButtonClick:()=>this.resetTermsAndShopErrorCount(),headerClick:()=>this.resetTermsAndShopErrorCount(),closeModal:()=>this.resetTermsAndShopErrorCount()}};this._modalFullErrorData={...null==t?void 0:t.data},this._newDesignFullErrorModalVisible=!0}setCouponsErrorModal(){const t={mode:Ds.MODES.newDesignHalfModalError,data:{titleText:this.t("rewards-promotions-promotion-coupon-error-half-modal-title-text"),bodyText:this.t("rewards-promotions-promotion-coupon-error-half-modal-description-text"),headerText:this.t("rewards-promotions-promotion-coupon-error-half-modal-header-text"),buttonText:this.t("rewards-promotions-promotion-coupon-error-half-modal-button-text"),fixedFooter:!1,footerButtonClick:()=>{this.getPromotionCoupons()},headerClick:()=>this.resetCouponsErrorCount(),veilClick:()=>this.resetCouponsErrorCount(),closeModal:()=>this.resetCouponsErrorCount()}};this._modalHalfErrorData={...null==t?void 0:t.data},this._newDesignHalfModalErrorModalVisible=!0,this._isAcceptTermsModal=!1}setCouponsErrorFullModal(){const t={mode:Ds.MODES.newDesignFullError,data:{heading:this.t("rewards-promotions-promotion-coupon-error-modal-title-text"),text:this.t("rewards-promotions-promotion-coupon-error-modal-description-text"),headerText:this.t("rewards-promotions-promotion-coupon-error-modal-header-text"),buttonText:this.t("rewards-promotions-promotion-coupon-error-modal-button-text"),fixedFooter:!0,footerButtonClick:()=>this.resetCouponsCounterAndCallBBVA(),headerClick:()=>this.resetCouponsErrorCount(),closeModal:()=>this.resetCouponsErrorCount()}};this._modalFullErrorData={...null==t?void 0:t.data},this._newDesignFullErrorModalVisible=!0}resetCouponsCounterAndCallBBVA(){this.resetCouponsErrorCount(),this._clickCallBBVAWeb()}_renderPromotionsPages(){var t,e,o,i,a,r,s,n,l,c;return p`
      <rewards-promotions-page
        ambient="light"
        mode="${ys.MODES.list}"
        ?show-promotions-by-one-type="${this.showPromotionsByOneType}"
        ?enabled-promotions-without-products=${this.enabledPromotionsWithoutProducts}
        .cardsData=${this._cardsData}
        ?load-lazy-content=${null===(t=this.promotionsConfig)||void 0===t?void 0:t.loadLazyContent}
        ?user-not-registered=${null===(e=this.promotionsConfig)||void 0===e?void 0:e.userNotRegisteredError}
        ?reset-page=${this._resetPage}
        ?available-tooltip="${this._availableTooltip}"
        ?has-scroll="${this._hasScroll}"
        ?is-loading-promotions=${this.isLoadingPromotions}
        ?is-loading-shop-terms=${this.isLoadingShopTerms}
        ?show-shop-access=${this.showShopAccess}
        ?location-disabled=${!this._locationEnabled}
        ?show-error=${this._showErrorInitialPromotions}
        ?show-max-attemps-error=${this._promotionsErrorMaxAttempts}
        language="${this.language}"
        .promotions=${this.promotions}
        .promotionIcons=${this._promotionIcons}
        .assistancePhone=${this.assistancePhone}
        .categories="${this.categories}"
        .promotionsTypeId="${this.promotionsTypeId}"
        .promotionsByType=${this.promotionsByTypeData}
        .promotionsByFeature=${this.promotionsByFeatureData}
        .promotionsByCategory=${this.promotionsByCategoryData}
        .limitFavoriteCategoriesToSelect=${this.limitFavoriteCategoriesToSelect}
        .formatDate=${this.formatDate}
        ?show-promotions-by-type=${this.showPromotionsByType}
        ?show-promotions-by-feature=${this.showPromotionsByFeature}
        ?show-promotions-by-category=${this.showPromotionsByCategory}
        ?is-empty-promotions=${this._isEmptyPromotions}
        ?is-empty-promotions-group=${this._isEmptyPromotionsGroup}
        ?some-promotion-group=${this._somePromotionGroup}
        ?show-search-promotions=${this.showSearchPromotions}
        ?show-search-by-location=${this.showSearchByLocation}
        ?show-search-by-promotion-type=${this.showSearchByPromotionType}
        ?activate-categories="${this.activateCategories}"
        ?should-show-favorite-categories-panel=${this.shouldShowFavoriteCategoriesPanel}
        ?should-show-favorite-categories-not-promotions-panel=${this.shouldShowFavoriteCategoriesNotPromotionsPanel}
        ?should-show-favorite-categories-promotions-carousel=${this.shouldShowFavoriteCategoriesPromotionsCarousel}
        @rewards-promotions-show-modal="${t=>this.openModal(null==t?void 0:t.detail)}"
        @rewards-promotions-tooltip-link-click="${()=>this._tooltipLinkClick()}"
        @rewards-promotions-on-promotion-selected="${t=>this._onPromotionSelected(null==t?void 0:t.detail)}"
        @rewards-promotion-list-button-view-more-promotions="${t=>this._clickGetMorePromotions(null==t?void 0:t.detail)}"
        @rewards-promotions-page-reseted="${()=>this._resetPromotionsState()}"
        @rewards-promotions-get-content="${()=>this.getContent()}"
        @rewards-promotions-page-status="${this._handleModeStatus}"
        @rewards-promotions-shop-link-click="${()=>this.shopLinkClick()}"
        @navigation-go-forward="${t=>{t.stopPropagation()}}"
        @navigation-go-back="${t=>{t.stopPropagation()}}"
      >
      </rewards-promotions-page>
      <rewards-promotions-page
        ambient="light"
        mode="${ys.MODES.viewMore}"
        ?visible-page="${this._viewMoreVisible}"
        ?reset-page=${this._resetPage}
        .headerButtons="${null===(o=this.config)||void 0===o||null===(i=o.header)||void 0===i?void 0:i.buttons}"
        ?is-loading-promotions=${this.isLoadingPromotions}
        ?location-disabled=${!this._locationEnabled}
        .promotions=${this._currentPromotions}
        .promotionIcons=${this._promotionIcons}
        ?has-panel-error=${this._hasPanelError}
        .panelErrorData=${this._panelErrorData}
        .promotionsSearchFilters=${this.promotionsSearchFilters}
        header-text-key="${this._headerTextKey}"
        ?is-promotion-group=${this._isPromotionGroup}
        .selectedPromotionsGroup=${this._selectedPromotionsGroup}
        ?some-promotion-group=${this._somePromotionGroup}
        .paginationInfo=${this.paginationInfo}
        .lastRequestParams=${this._lastRequestParams}
        .scrollableTopItemIndex=${this._scrollableTopItemIndex}
        ?show-error=${this._showErrorGetPromotions}
        ?show-max-attemps-error=${this._promotionsErrorMaxAttempts}
        language="${this.language}"
        .assistancePhone=${this.assistancePhone}
        .categories="${this.categories}"
        .limitFavoriteCategoriesToSelect=${this.limitFavoriteCategoriesToSelect}
        .formatDate=${this.formatDate}
        @rewards-promotions-page-on-panel-retry=${()=>{this._fromRetry=!0,this._searchWithFilters(this.promotionsSearchFilters)}}
        @rewards-promotions-on-promotion-selected="${t=>this._onPromotionSelected(null==t?void 0:t.detail)}"
        @rewards-promotion-modal-search=${t=>this._searchWithFilters(t.detail)}
        @rewards-promotion-remove-filter=${()=>{this._fromFilter=!0}}
        @rewards-promotions-show-modal="${t=>this.openModal(null==t?void 0:t.detail)}"
        @rewards-promotions-request-data="${t=>{var e,o;this.getPromotions({...this._getPromotionsParams(null===(e=this._selectedPromotionData)||void 0===e?void 0:e.group,null===(o=this._selectedPromotionData)||void 0===o?void 0:o.type),...null==t?void 0:t.detail})}}"
        @rewards-promotions-page-status="${t=>{this._handleModeStatus(t),this._isSearchModeReset()}}"
        @navigation-go-forward="${t=>{t.stopPropagation()}}"
        @navigation-go-back="${t=>{t.stopPropagation()}}"
      >
      </rewards-promotions-page>
      <rewards-promotions-new-design-page
        ambient="primary"
        mode="${Ss.MODES.campaignDetail}"
        .formatDate=${this.formatDate}
        ?visible-page="${this._campaignDetailVisible}"
        ?reset-page=${this._resetPage}
        .promotions=${null===(a=this.promotionsByCampaignData)||void 0===a||null===(r=a.MAIN)||void 0===r?void 0:r.data}
        ?show-error=${this._showErrorGetPromotions&&!this._viewMoreCampaignPromotionsVisible}
        ?show-max-attemps-error=${this._promotionsErrorMaxAttempts}
        .campaignSelectedInfo="${this.campaignSelectedInfo}"
        ?is-loading-campaign-promotions="${this.isLoadingCampaignPromotions}"
        .assistancePhone=${this.assistancePhone}
        @rewards-promotions-get-campaign-promotions="${()=>{this.promotionsByCampaignData={},this.getPromotions(this._getPromotionsParams("CAMPAIGN","MAIN"))}}"
        @rewards-promotion-campaign-detail-click-view-more-campaign-promotions="${this._showMoreCampaignPromotions}"
        @rewards-promotions-select-promotion-from-campaign="${t=>this._onPromotionSelected(null==t?void 0:t.detail)}"
        @rewards-promotions-page-status="${this._handleModeStatus}"
        @navigation-go-forward="${t=>{t.stopPropagation()}}"
        @navigation-go-back="${t=>{this._selectedPromotionData=this._previousSelectedPromotionData,t.stopPropagation()}}"
        @rewards-promotions-closed-campaign=${()=>this._resetAllCounterData()}
      >
      </rewards-promotions-new-design-page>
      <rewards-promotions-new-design-page
        ambient="primary"
        mode="${Ss.MODES.viewMoreCampaignPromotions}"
        ?visible-page="${this._viewMoreCampaignPromotionsVisible}"
        .promotions=${null===(s=this.promotionsByCampaignData)||void 0===s||null===(n=s.MAIN)||void 0===n?void 0:n.data}
        ?is-loading-campaign-promotions-pagination="${this.isLoadingCampaignPromotionsPagination}"
        .paginationInfo=${this.paginationInfo}
        .lastRequestParams=${this._lastRequestParams}
        .scrollableTopItemIndex=${this._scrollableTopItemIndex}
        ?show-error=${this._showErrorGetPromotions}
        ?show-max-attemps-error=${this._promotionsErrorMaxAttempts}
        .assistancePhone=${this.assistancePhone}
        @rewards-promotions-select-promotion-from-campaign="${t=>this._onPromotionSelected(null==t?void 0:t.detail)}"
        @rewards-promotions-campaign-promotions-request-data="${t=>{this.getPromotions({...this._getPromotionsParams("CAMPAIGN","MAIN"),...null==t?void 0:t.detail})}}"
        @rewards-promotions-page-status="${this._handleModeStatus}"
        @navigation-go-forward="${t=>{t.stopPropagation()}}"
        @navigation-go-back="${t=>{t.stopPropagation()}}"
        @rewards-promotions-closed-campaign=${()=>this._resetAllCounterData()}
      >
      </rewards-promotions-new-design-page>
      <rewards-promotions-page
        ambient="light"
        mode="${ys.MODES.detail}"
        ?visible-page="${this._detailVisible}"
        .headerButtons="${null===(l=this.config)||void 0===l||null===(c=l.header)||void 0===c?void 0:c.buttons}"
        .location=${this._location}
        ?reset-page=${this._resetPage}
        ?location-disabled=${!this._locationEnabled}
        .promotion=${this.promotion}
        .promotionIcons=${this._promotionIcons}
        .cardsData=${this._cardsData}
        ?show-error=${this._showErrorGetPromotion}
        ?show-max-attemps-error=${this._promotionDetailErrorMaxAttemps}
        language="${this.language}"
        ?show-cards-for-promotion=${this.showCardsForPromotion}
        ?show-stores-for-promotion=${this.showStoresForPromotion}
        ?show-store-information=${this.showStoreInformation}
        .promotionSelectedInfo="${this.promotionSelectedInfo}"
        ?is-loading-promotion-detail="${this.isLoadingPromotionDetail}"
        .assistancePhone=${this.assistancePhone}
        .mobileServices=${this.mobileServices}
        .formatDate=${this.formatDate}
        @rewards-promotions-show-modal="${t=>this.openModal(null==t?void 0:t.detail)}"
        @rewards-promotions-exchange-coupon="${()=>this.getPromotionCoupons(this.promotionSelectedInfo.id)}"
        @rewards-promotions-navigate-terms-condition="${t=>this._openPdfDocument(t.detail)}"
        @rewards-promotions-navigate-terms-condition-in-app="${t=>this.launchInApp(null==t?void 0:t.detail)}"
        @rewards-promotions-navigate-terms-condition-store-web="${t=>this._openHalfExitModal(t.detail)}"
        @rewards-promotions-detail-get-promotion="${t=>this._getPromotionDetail(t.detail)}"
        @rewards-promotions-navigate-to-view-more-stores="${t=>this._showMoreStores(t.detail)}"
        @rewards-promotions-page-status="${this._handleModeStatus}"
        @navigation-go-forward="${t=>{t.stopPropagation()}}"
        @navigation-go-back="${t=>{t.stopPropagation()}}"
      >
      </rewards-promotions-page>
      <rewards-promotions-page
        ambient="light"
        mode="${ys.MODES.viewMoreStores}"
        ?visible-page="${this._viewMoreStoresVisible}"
        .location=${this._location}
        .moreStores="${this._moreStores}"
        .mobileServices=${this.mobileServices}
        @rewards-promotions-page-status="${this._handleModeStatus}"
        @navigation-go-forward="${t=>{t.stopPropagation()}}"
        @navigation-go-back="${t=>{t.stopPropagation()}}"
      >
      </rewards-promotions-page>
      <rewards-promotions-modal
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        ?visible-modal=${this._modalVisible}
        .mode="${this._modalMode}"
        .data=${this._modalData}
        @rewards-promotions-persist-modal-data=${t=>{this._modalData={...t.detail}}}
        @rewards-promotions-set-native-local-storage=${t=>{this.promotionsHistoricalSearch=[...t.detail.value]}}
        .suggestions=${this.suggestions}
        @rewards-promotion-modal-search=${t=>this._searchWithFilters(t.detail)}
        @rewards-promotions-modal-status="${this._handleModeStatus}"
        @rewards-promotions-get-suggestions=${t=>this._lookForSuggestions(t.detail)}
        @rewards-promotions-select-item=${t=>this._resetInputTermSearch(t.detail)}
        @rewards-promotions-check-input-term-search=${t=>{this._modalData={...t.detail}}}
      ></rewards-promotions-modal>
      <rewards-promotions-modal
        fixed-footer
        id="remove"
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        ?visible-modal=${this._removeModalVisible}
        mode="remove"
        .data=${this._modalRemoveData}
        @rewards-promotions-persist-data=${t=>{this._modalRemoveData={...t.detail}}}
        @rewards-promotions-modal-status="${this._handleModeStatus}"
        @rewards-promotion-modal-remove-favorite-categories=${t=>this._removeFavoriteCategories(null==t?void 0:t.detail)}
      ></rewards-promotions-modal>
      <rewards-promotions-modal
        id="favoriteCategories"
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        ?visible-modal=${this._favoriteCategoriesModalVisible}
        mode="favoriteCategories"
        .data=${this._modalFavoriteCategoriesData}
        @rewards-promotions-persist-data=${t=>{this._modalFavoriteCategoriesData={...t.detail}}}
        @rewards-promotions-show-exit-modal=${t=>this.openExitModal(t.detail)}
        @rewards-promotions-modal-status="${this._handleModeStatus}"
        @rewards-promotions-modal-close-page=${()=>{this._favoriteCategoriesModalVisible=!1}}
        @rewards-promotion-modal-commit-favorite-categories=${t=>this._commitFavoriteCategories(t.detail)}
      ></rewards-promotions-modal>
      <rewards-promotions-modal
        fixed-footer
        id="exit"
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        ?visible-modal=${this._exitModalVisible}
        mode="exit"
        .data=${this._modalExitData}
        @rewards-promotions-modal-status="${this._handleModeStatus}"
        @rewards-promotions-exit-modal-close-page=${()=>{this._favoriteCategoriesModalVisible=!1}}
      ></rewards-promotions-modal>
      <rewards-promotions-modal
        fixed-footer
        id="halfError"
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        ?visible-modal=${this._halfErrorModalVisible}
        mode="halfError"
        .data=${this._modalHalfErrorData}
        @rewards-promotions-half-error-retry-button=${()=>this._halfErrorRetryClicked()}
        @help-modal-footer-link-click=${()=>{this._favoriteCategoriesModalVisible=!1}}
        @rewards-promotions-modal-status="${this._handleModeStatus}"
      ></rewards-promotions-modal>
      <rewards-promotions-modal
        fixed-footer
        id="error"
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        ?visible-modal=${this._errorModalVisible}
        mode="error"
        .data=${this._modalErrorData}
        @rewards-promotions-modal-status="${this._handleModeStatus}"
      ></rewards-promotions-modal>
      <rewards-promotions-modal
        fixed-footer
        id="halfExit"
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        ?visible-modal=${this._halfExitModalVisible}
        mode="halfExit"
        .data=${this._modalHalfExitData}
        @rewards-promotions-modal-status="${this._handleModeStatus}"
      ></rewards-promotions-modal>
      <rewards-promotions-new-design-modal
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        ?visible-modal=${this._shopTermsAndConditionsModalVisible}
        mode="${Ds.MODES.shopTermsAndConditions}"
        @rewards-promotions-modal-status="${this._handleModeStatus}"
        @rewards-promotions-experience-terms-and-condition-read-click="${()=>this._shopTermsAndconditionsReadClicked()}"
        @help-modal-footer-button-click="${()=>this.acceptShopTerms()}"
      ></rewards-promotions-new-design-modal>
      <rewards-promotions-new-design-modal
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        ?visible-modal=${this._shopDetailTermsAndConditionsModalVisible}
        mode="${Ds.MODES.shopDetailTermsAndConditions}"
        @rewards-promotions-modal-status="${this._handleModeStatus}"
      ></rewards-promotions-new-design-modal>
      <rewards-promotions-new-design-modal
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        ?visible-modal=${this._newDesignHalfModalErrorModalVisible}
        mode="${Ds.MODES.newDesignHalfModalError}"
        .data=${this._modalHalfErrorData}
        @rewards-promotions-modal-status="${this._handleModeStatus}"
      ></rewards-promotions-new-design-modal>
      <rewards-promotions-new-design-modal
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        ?visible-modal=${this._newDesignFullErrorModalVisible}
        mode="${Ds.MODES.newDesignFullError}"
        .data=${this._modalFullErrorData}
        @rewards-promotions-modal-status="${this._handleModeStatus}"
      ></rewards-promotions-new-design-modal>
      <rewards-promotions-new-design-modal
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        ?visible-modal=${this._promotionRedemptionExitModalVisible}
        mode="${Ds.MODES.promotionRedemptionExit}"
        @rewards-promotions-modal-status="${this._handleModeStatus}"
        @help-modal-footer-button-click="${()=>{this.couponTypes[this._selectedCoupon].isExternal&&window.open(this.coupons[this._selectedCoupon].couponData),this._selectedCoupon=""}}"
      ></rewards-promotions-new-design-modal>
      <rewards-promotions-new-design-modal
        .data=${this.couponTypes}
        ?i-o-s-fixed-header=${this.iOSFixedHeader}
        ?visible-modal=${this._promotionRedemptionOptionsModalVisible}
        mode="${Ds.MODES.promotionRedemptionOptions}"
        @rewards-promotions-modal-status="${this._handleModeStatus}"
        @rewards-promotions-coupon-redemption-option-link-click="${t=>{this._selectedCoupon=t.detail,this._promotionRedemptionOptionsModalVisible=!1,this._promotionRedemptionExitModalVisible=!0}}"
      ></rewards-promotions-new-design-modal>
    `}render(){return p`
      ${super.render()} ${this.renderNotificationToast()} ${this._renderPromotionsPages()}
      ${this._renderPromotionsApis}
    `}}Ie("colors.cool100"),Ie("colors.primaryCoreLightened"),Ie("colors.primaryCoreLightened"),Ie("colors.cool90"),Ie("colors.cool50"),Ie("colors.cool100"),Ie("colors.primaryCoreLightened"),Ie("colors.cool60"),Ie("colors.primaryMedium"),Ie("colors.cool10"),Ie("colors.cool70"),Ie("colors.primaryCoreLightened"),Ie("colors.primaryCoreLightened"),Ie("colors.cool70"),Ie("colors.cool60"),Ie("colors.cool60"),Ie("colors.primaryMediumLight");var Rs=t`
  :host {
    --_sustainability-sustainable-appliance-simulator-bg-color: var(
      --sustainability-sustainable-appliance-simulator--_ambient--default-bg-color,
      var(
        --sustainability-sustainable-appliance-simulator--custom--primary-ambient--default-bg-color,
        ${Re("colorPrimarySurfaceAmbientDefault",Oe)}
      )
    );
    --_sustainability-sustainable-appliance-simulator-amount-info-bg-color: var(
      --sustainability-sustainable-appliance-simulator--_ambient--default-amount-info-bg-color,
      var(
        --sustainability-sustainable-appliance-simulator--custom--primary-ambient--default-amount-info-bg-color,
        ${Re("colorPrimaryAltSurfaceAmbientDefault",Oe)}
      )
    );
    --_sustainability-sustainable-appliance-simulator-offer-card-bg-color: var(
      --sustainability-sustainable-appliance-simulator--_ambient--default-offer-card-bg-color,
      var(
        --sustainability-sustainable-appliance-simulator--custom--primary-ambient--default-offer-card-bg-color,
        ${Re("colorSecondaryAltSurfaceAmbientDefault",Oe)}
      )
    );
    --_sustainability-sustainable-appliance-simulator-info-icon-color: var(
      --sustainability-sustainable-appliance-simulator--_ambient--default-info-icon-color,
      var(
        --sustainability-sustainable-appliance-simulator--custom--primary-ambient--default-info-icon-color,
        ${Re("colorPrimaryLinkMainDefault",Oe)}
      )
    );
    --_sustainability-sustainable-appliance-simulator-disabled-link-color: var(
      --sustainability-sustainable-appliance-simulator--_ambient--default-disabled-link-color,
      var(
        --sustainability-sustainable-appliance-simulator--custom--primary-ambient--default-disabled-link-color,
        ${Re("colorPrimaryText01Default",Oe)}
      )
    );
    --_sustainability-sustainable-appliance-simulator-skeleton-quote-color: var(
      --sustainability-sustainable-appliance-simulator--_ambient--default-skeleton-quote-color,
      var(
        --sustainability-sustainable-appliance-simulator--custom--primary-ambient--default-skeleton-quote-color,
        ${Re("colorPrimarySurfaceAmbientPreloading",Oe)}
      )
    );
  }
`,Os=t`
  :host {
    display: block;
    box-sizing: border-box;
    background-color: var(--_sustainability-sustainable-appliance-simulator-bg-color);
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

  [data-tag-name='bbva-help-modal'][fixed-footer] {
    --bbva-help-modal-footer-padding: 1.5rem 1rem 1rem;
  }

  [data-tag-name='bbva-type-text'] {
    --bbva-type-text--custom--primary-ambient-skeleton-quote-color: var(
      --_sustainability-sustainable-appliance-simulator-skeleton-quote-color
    );
  }

  .section-error-wrapper {
    position: relative;
    padding: 0 1rem 1.5rem;
  }
  .section-error-wrapper [data-tag-name='bbva-progress-content'] {
    position: absolute;
  }

  .header {
    padding: 1rem 1rem 0.5rem;
  }
  .header [data-tag-name='bbva-clip-microillustration'] {
    margin-bottom: 1rem;
  }

  .appliances-info {
    padding: 0 1rem;
    display: flex;
    gap: 0.25rem;
    align-items: flex-start;
    --bbva-type-icon--custom--primary-ambient--color: var(
      --_sustainability-sustainable-appliance-simulator-info-icon-color
    );
  }
  .appliances-info [data-tag-name='bbva-type-icon'] {
    flex: none;
  }

  .amounts-info-wrapper {
    padding: 1rem;
    display: flex;
    gap: 1rem;
  }

  .amount-info {
    padding: 1rem;
    background-color: var(--_sustainability-sustainable-appliance-simulator-amount-info-bg-color);
    flex: 1;
  }
  .amount-info [data-tag-name='bbva-type-text'] {
    margin-bottom: 0.5rem;
  }
  .amount-info [data-tag-name='bbva-type-amount'] {
    margin-bottom: 0.25rem;
  }
  .amount-info [data-tag-name='bbva-type-link'] {
    display: block;
  }

  .appliances-checklist [data-tag-name='bbva-type-text'].appliances-checklist__header {
    margin: 0 1rem 0.5rem;
    padding: 0;
  }
  .appliances-checklist [slot='left'] {
    padding: 0.5rem 1rem;
  }

  .savings {
    padding: 1.5rem 1rem;
  }
  .savings [data-tag-name='bbva-type-amount'] {
    margin-bottom: 1rem;
  }
  .savings [data-tag-name='bbva-type-link'] {
    display: flex;
    margin-bottom: 1.5rem;
    padding: 0;
    --bbva-type-link--custom--primary-ambient--skeleton-quote-color: var(
      --_sustainability-sustainable-appliance-simulator-skeleton-quote-color
    );
  }
  .savings--with-promotions {
    padding-bottom: 1rem;
  }

  .products-section {
    padding-bottom: 1.5rem;
  }
  .products-section [data-tag-name='bbva-header-category'] {
    padding: 0.5rem 1rem;
  }
  .products-section [data-tag-name='bbva-type-text'] {
    margin: 0 1rem 1rem;
  }
  .products-section--with-promotions {
    padding-bottom: 1rem;
  }

  .offer-card {
    padding: 1rem 1rem 0.5rem;
    margin: 0 1rem;
    background-color: var(--_sustainability-sustainable-appliance-simulator-offer-card-bg-color);
  }
  .offer-card [data-tag-name='bbva-type-text'] {
    margin: 0.5rem 0;
    --bbva-type-text--_ambient-skeleton-quote-color: transparent;
  }
  .offer-card img {
    height: 3.5rem;
  }

  #sustainability-sustainable-appliance-simulator-info-modal {
    --bbva-help-modal-footer-padding: 3rem 1rem 0;
  }
  #sustainability-sustainable-appliance-simulator-info-modal ul {
    list-style-type: none;
    margin: 0;
    padding: 1rem 0;
  }
  #sustainability-sustainable-appliance-simulator-info-modal [data-tag-name='bbva-list-bullet'] {
    padding: 0.25rem 0;
  }

  #sustainability-sustainable-appliance-simulator-calculation-explanation-modal {
    --bbva-help-modal-footer-padding: 3rem 1rem 0;
  }

  .sustainability-sustainable-appliance-simulator-customize-consumption-modal
    [data-tag-name='bbva-type-text'] {
    padding-bottom: 0.5rem;
  }
  .sustainability-sustainable-appliance-simulator-customize-consumption-modal
    [data-tag-name='bbva-type-text'].customize-modal-title {
    padding: 0.5rem 0 0;
  }
  .sustainability-sustainable-appliance-simulator-customize-consumption-modal
    [data-tag-name='bbva-form-input'] {
    padding: 1rem 0;
  }
  .sustainability-sustainable-appliance-simulator-customize-consumption-modal
    [data-tag-name='bbva-notification-message'] {
    margin: 1rem 0 2rem;
  }
  .sustainability-sustainable-appliance-simulator-customize-consumption-modal
    [data-tag-name='bbva-button-default'] {
    margin: 1rem 0;
  }
  .sustainability-sustainable-appliance-simulator-customize-consumption-modal
    [data-tag-name='bbva-type-text'].actions-title {
    padding: 1rem 0 1.5rem;
  }
  .sustainability-sustainable-appliance-simulator-customize-consumption-modal
    [data-tag-name='bbva-type-link'] {
    padding: 0.5rem 0;
  }
  .sustainability-sustainable-appliance-simulator-customize-consumption-modal
    .customize-actions-item {
    padding: 0.5rem 0;
  }
  .sustainability-sustainable-appliance-simulator-customize-consumption-modal
    [data-tag-name='bbva-type-link'][disabled] {
    opacity: 1;
    --bbva-type-link--custom--primary-ambient--with-icon-text-color: var(
      --_sustainability-sustainable-appliance-simulator-disabled-link-color
    );
    --bbva-type-link--custom--primary-ambient--with-icon-icon-color: var(
      --_sustainability-sustainable-appliance-simulator-disabled-link-color
    );
  }

  #promotions-container {
    position: relative;
  }

  [data-tag-name='rewards-promotions'] {
    height: min-content;
  }
`;class Ls extends(Ke(Ye(l(e)))){static get is(){return"sustainability-sustainable-appliance-simulator"}static get scopedElements(){const t=[oi,ii,ze,Ne,co,Ge,io,eo,ao,Xe,Io,zo,Ho,Ha,no,bi,Bs,mo,...Ls.configurationScopedElements()];return Ls.scopedElementsFromClasses(t)}static get properties(){return{sustainabilityApiVersion:{type:String,attribute:"sustainability-api-version"},offersApiVersion:{type:String,attribute:"offers-api-version"},simulatorData:{type:Object,attribute:"simulator-data"},products:{type:Array},loanType:{type:String,attribute:"loan-type"},loanId:{type:Array,attribute:"loan-id"},noPreApprovedLoanId:{type:String,attribute:"no-pre-approved-loan-id"},noPreApprovedLabel:{type:String,attribute:"no-pre-approved-label"},limitCreditCardIds:{type:Array,attribute:"limit-credit-card-ids"},creditCardIds:{type:Array,attribute:"credit-card-ids"},userName:{type:String,attribute:"user-name"},appliancesInfoModal:{type:Boolean,attribute:"appliances-info-modal"},calculationExplanationModal:{type:Boolean,attribute:"calculation-explanation-modal"},customizeConsumptionModal:{type:Boolean,attribute:"customize-consumption-modal"},features:{type:Object},toggles:{type:Object},localCurrency:{type:String,attribute:"local-currency"},externalSimulatorData:{type:Object,attribute:"external-simulator-data"},externalOffersData:{type:Object,attribute:"external-offers-data"},maxRequestAttempts:{type:Number,attribute:"max-request-attempts"},_customEnergyConsumption:{type:Number},_customEnergyInputValue:{type:Number},_requestErrors:{type:Object},_currentRequests:{type:Object},_internalFeature:{type:Object},_nonPreaprovedCall:{type:Boolean}}}constructor(){super(),this.sustainabilityApiVersion="1",this.offersApiVersion="1",this.simulatorData={},this.externalSimulatorData={},this.externalOffersData={},this.products=[],this.loanType="LOANS",this.loanId=["0NOM","0PPI","0060"],this.noPreApprovedLoanId="00CB",this.noPreApprovedLabel="sustainability-sustainable-appliance-simulator-no-preapproved-label",this.limitCreditCardIds=["0130","0ILC"],this.creditCardIds=["0296","0TDC"],this.userName="",this.appliancesInfoModal=!1,this.calculationExplanationModal=!1,this.customizeConsumptionModal=!1,this.features={appHasPayInApp:!0},this.toggles={},this.config={header:{variant:"first-level-sequential",showLeftIcon:!0,leftIconLabel:"sustainability-sustainable-appliance-simulator-header-back",leftIconAriaLabel:"sustainability-sustainable-appliance-simulator-header-back",buttons:[{id:"btn-menu",icon:Ae(),label:"sustainability-sustainable-appliance-simulator-header-menu",accessibilityText:"sustainability-sustainable-appliance-simulator-header-menu"}],text:"sustainability-sustainable-appliance-simulator-main-title",id:"main-header","@header-main-icon-click":this._manageHeaderMainClicks.bind(this)},loader:!0,notify:!1,fixedHeader:!0},this.localCurrency="",this.maxRequestAttempts=3,this._customEnergyConsumption=0,this._customEnergyInputValue=0,this._nonPreaprovedCall=!1,this._requestErrors={simulator:0,products:0},this._currentRequests={simulator:!1,products:!1},this._defaultToggles={products:!0,promotions:!0},this._internalFeature={rewardsPromotions:[]}}firstUpdated(t){super.firstUpdated(t),this._requestData()}static get styles(){return[Rs,Os,o("sustainability-sustainable-appliance-simulator-shared-styles"),Le.primary,Le.secondary,Ve.primary,po.primary,He.primary,He.secondary,Qe.primary,to.primary,Eo.primary,jo.primary,Go.primary,Na.primary,ro.primary,ro.secondary,pi.primary,uo.primary]}get _headers(){return this.headers||{"Accept-Language":this.language}}get _toggles(){return{...this._defaultToggles,...this.toggles}}get _hasFullError(){return this._requestErrors.simulator>0}get _electricityEnergyConsumption(){var t,e;return null===(t=this.simulatorData)||void 0===t||null===(e=t.energyConsumption)||void 0===e?void 0:e.find((t=>"ELECTRICITY"===t.consumptionType.id))}get _electricitySavings(){var t,e;return null===(t=this.simulatorData)||void 0===t||null===(e=t.savings)||void 0===e?void 0:e.find((t=>"ELECTRICITY"===t.savingType.id))}get _energyConsumption(){var t,e,o,i,a,r,s,n,l,c;return{amount:Math.round(this._customEnergyConsumption||(null!==(t=this._electricityEnergyConsumption)&&void 0!==t&&t.isEstimated?null===(e=this._electricityEnergyConsumption)||void 0===e||null===(o=e.averageEnergyConsumption)||void 0===o?void 0:o.amount:null===(i=this._electricityEnergyConsumption)||void 0===i||null===(a=i.expenseAmount)||void 0===a?void 0:a.amount)),currency:null!==(r=this._electricityEnergyConsumption)&&void 0!==r&&r.isEstimated?null===(s=this._electricityEnergyConsumption)||void 0===s||null===(n=s.averageEnergyConsumption)||void 0===n?void 0:n.currency:null===(l=this._electricityEnergyConsumption)||void 0===l||null===(c=l.expenseAmount)||void 0===c?void 0:c.currency}}get _energyConsumptionReduced(){return{amount:Math.round(this._energyConsumption.amount-this._totalEnergySavingAppliances),currency:this._energyConsumption.currency}}get _totalEnergySavingAppliances(){var t,e;return Math.round(null===(t=this.simulatorData)||void 0===t||null===(e=t.homeAppliances)||void 0===e?void 0:e.reduce(((t,e)=>e.checked?t+this._energyConsumption.amount*(e.consumptionPercentage/100)*(e.improvementRate/100):t),0))}get _saving(){var t;return{amount:Math.round(this._totalEnergySavingAppliances),currency:null===(t=this._energyConsumption)||void 0===t?void 0:t.currency}}get _selectedProductOffer(){var t,e,o;const i=null===(t=this.products)||void 0===t?void 0:t.find((t=>{var e,o,i,a,r;return((null===(e=this.loanId)||void 0===e?void 0:e.includes(null==t||null===(o=t.product)||void 0===o?void 0:o.id))||this.noPreApprovedLoanId===(null==t||null===(i=t.product)||void 0===i?void 0:i.id))&&(null==t||null===(a=t.product)||void 0===a||null===(r=a.productType)||void 0===r?void 0:r.id)===this.loanType})),a=null===(e=this.products)||void 0===e?void 0:e.find((t=>{var e;return this.limitCreditCardIds.includes(null===(e=t.product)||void 0===e?void 0:e.id)})),r=null===(o=this.products)||void 0===o?void 0:o.find((t=>{var e;return this.creditCardIds.includes(null===(e=t.product)||void 0===e?void 0:e.id)}));return[{condition:i,eventId:"loan",detail:i},{condition:!i&&a,eventId:"limit-credit-card",detail:a},{condition:!i&&!a&&r,eventId:"credit-card",detail:r}].find((t=>t.condition))}get homeSimulatorDmElement(){return this._homeSimulatorDmElement||(this._homeSimulatorDmElement=this.shadowRoot.querySelector("#home-simulator-api-dm")),this._homeSimulatorDmElement}get productsDmElement(){return this._productsDmElement||(this._productsDmElement=this.shadowRoot.querySelector("#products-api-dm")),this._productsDmElement}get rewardsPromotionsFeatureElement(){return this._rewardsPromotionsFeatureElement||(this._rewardsPromotionsFeatureElement=this.shadowRoot.querySelector('[data-tag-name="rewards-promotions"]')),this._rewardsPromotionsFeatureElement}get _homeSimulatorDmTemplate(){return p`
      <bbva-global-home-simulator-api-dm
        id="home-simulator-api-dm"
        .host="${this.host}"
        .headers="${this._headers}"
        .version="${this.sustainabilityApiVersion}"
        .requiredToken="${this.requiredToken}"
        .native="${this.native}"
        @home-simulator-api-dm-fetch="${t=>{var e,o;this._onSimulatorRequestSuccess(t),this._changeEventName(null===(e=this.simulatorData)||void 0===e||null===(o=e.energyConsumption[0])||void 0===o?void 0:o.isEstimated,"data-fetched")}}"
        @home-simulator-api-dm-fetch-error="${()=>{this._onRequestError("simulator")}}"
        @api-dm-error="${()=>{this._onRequestError("simulator")}}"
      >
      </bbva-global-home-simulator-api-dm>
    `}get _productsDmTemplate(){return p`
      <bbva-global-offers-api-dm
        id="products-api-dm"
        .host="${this.host}"
        .headers="${this._headers}"
        .version="${this.offersApiVersion}"
        .requiredToken="${this.requiredToken}"
        .native="${this.native}"
        @offers-api-dm-fetch="${this._onProductsRequestSuccess}"
        @offers-api-dm-fetch-error="${()=>{this._onRequestError("products")}}"
        @api-dm-error="${()=>{this._onRequestError("products")}}"
      >
      </bbva-global-offers-api-dm>
    `}get _headerTemplate(){var t,e,o;return p`
      <div class="header">
        <bbva-clip-microillustration
          microillustration="renewableenergy"
          size="M"
          ?loading="${!(null!==(t=this.simulatorData)&&void 0!==t&&t.homeAppliances)}"
        >
        </bbva-clip-microillustration>
        <bbva-type-text
          tag="span"
          .text="${this.userName?`${this.userName},`:""}"
          size="XL"
          font-weight="500"
          ?loading="${!(null!==(e=this.simulatorData)&&void 0!==e&&e.homeAppliances)}"
        >
        </bbva-type-text>
        <bbva-type-text
          tag="span"
          .text="${this.userName?this.t("sustainability-sustainable-appliance-simulator-header-text"):this.t("sustainability-sustainable-appliance-simulator-header-text-without-username")}"
          size="XL"
          font-weight="500"
          ?loading="${!(null!==(o=this.simulatorData)&&void 0!==o&&o.homeAppliances)}"
        >
        </bbva-type-text>
      </div>
    `}get _appliancesInfoTemplate(){var t,e;return p`
      <div class="appliances-info">
        <bbva-type-text
          .text="${this.t("sustainability-sustainable-appliance-simulator-info-text")}"
          size="S"
          tag="span"
          ?loading="${!(null!==(t=this.simulatorData)&&void 0!==t&&t.homeAppliances)}"
        >
        </bbva-type-text>
        <bbva-type-icon
          height="24"
          .icon="${B()}"
          ?loading="${!(null!==(e=this.simulatorData)&&void 0!==e&&e.homeAppliances)}"
          @click="${()=>{this.appliancesInfoModal=!0}}"
        >
        </bbva-type-icon>
      </div>
      ${this._appliancesInfoModalTemplate}
    `}get _appliancesInfoModalTemplate(){const t=[this.t("sustainability-sustainable-appliance-simulator-info-modal-bullet-1"),this.t("sustainability-sustainable-appliance-simulator-info-modal-bullet-2"),this.t("sustainability-sustainable-appliance-simulator-info-modal-bullet-3"),this.t("sustainability-sustainable-appliance-simulator-info-modal-bullet-4")];return p`
      <bbva-help-modal
        id="sustainability-sustainable-appliance-simulator-info-modal"
        full-height
        .titleIcon="${B()}"
        .headerCloseIconAriaLabel="${this.t("sustainability-sustainable-appliance-simulator-modal-icon-aria-label")}"
        .headerText="${this.t("sustainability-sustainable-appliance-simulator-info-modal-header")}"
        .titleText="${this.t("sustainability-sustainable-appliance-simulator-info-modal-title")}"
        title-lines="0"
        .buttonText="${this.t("sustainability-sustainable-appliance-simulator-info-modal-button")}"
        ?visible="${this.appliancesInfoModal}"
        @visible-changed="${({detail:t})=>{this.appliancesInfoModal=t}}"
      >
        <div slot="slot-content">
          <bbva-type-text
            .text="${this.t("sustainability-sustainable-appliance-simulator-info-modal-intro")}"
            size="S"
            tag="span"
          >
          </bbva-type-text>
          <ul>
            ${t.map((t=>p`
                <li>
                  <bbva-list-bullet>${t}</bbva-list-bullet>
                </li>
              `))}
          </ul>
          <bbva-type-text
            .text="${this.t("sustainability-sustainable-appliance-simulator-info-modal-closing-text")}"
            size="S"
            tag="span"
          >
          </bbva-type-text>
        </div>
      </bbva-help-modal>
    `}get _amountInformationTemplate(){return p`
      <div class="amounts-info-wrapper">
        ${this._energyConsumptionTemplate} ${this._reducedAmountTemplate}
      </div>
      ${this._customizeConsumptionTemplate}
    `}get _energyConsumptionTemplate(){var t,e,o,i,a;return p`
      <div class="amount-info">
        ${null!==(t=this.simulatorData)&&void 0!==t&&t.homeAppliances?p`
              <bbva-type-text
                font-weight="500"
                .text="${null!==(e=this._electricityEnergyConsumption)&&void 0!==e&&e.isEstimated?this.t("sustainability-sustainable-appliance-simulator-anual-estimated-text"):this.t("sustainability-sustainable-appliance-simulator-anual-text")}"
                size="S"
                tag="span"
              >
              </bbva-type-text>
              <bbva-type-amount
                variant="m"
                decimals-hidden
                .amount="${null===(o=this._energyConsumption)||void 0===o?void 0:o.amount}"
                .currencyCode="${null===(i=this._energyConsumption)||void 0===i?void 0:i.currency}"
                .localCurrency="${this.localCurrency}"
                .language="${this.language}"
              >
              </bbva-type-amount>
              <bbva-type-link
                size="2XS"
                @click="${()=>{var t;this._customEnergyInputValue=null===(t=this._energyConsumption)||void 0===t?void 0:t.amount,this.customizeConsumptionModal=!0}}"
                >${null!==(a=this._electricityEnergyConsumption)&&void 0!==a&&a.isEstimated?this.t("sustainability-sustainable-appliance-simulator-anual-estimated-link"):this.t("sustainability-sustainable-appliance-simulator-anual-link")}</bbva-type-link
              >
            `:p``}
      </div>
    `}get _customizeConsumptionTemplate(){var t,e,o,i,a,r,s,n,l;return p`
      <bbva-help-modal
        .id="${null!==(t=this._electricityEnergyConsumption)&&void 0!==t&&t.isEstimated?"sustainability-sustainable-appliance-simulator-customize-consumption-modal":"sustainability-sustainable-appliance-simulator-edit-consumption-modal"}"
        class="sustainability-sustainable-appliance-simulator-customize-consumption-modal"
        full-height
        title-lines="0"
        .headerCloseIconAriaLabel="${this.t("sustainability-sustainable-appliance-simulator-modal-icon-aria-label")}"
        .headerText="${null!==(e=this._electricityEnergyConsumption)&&void 0!==e&&e.isEstimated?this.t("sustainability-sustainable-appliance-simulator-customize-modal-header"):this.t("sustainability-sustainable-appliance-simulator-edit-modal-header")}"
        ?visible="${this.customizeConsumptionModal}"
        @visible-changed="${({detail:t})=>{this.customizeConsumptionModal=t}}"
      >
        <div slot="slot-content">
          ${null!==(o=this._electricityEnergyConsumption)&&void 0!==o&&o.isEstimated?p`
                <bbva-clip-microillustration microillustration="searchtickets" size="S">
                </bbva-clip-microillustration>
                <bbva-type-text
                  class="customize-modal-title"
                  .text="${this.t("sustainability-sustainable-appliance-simulator-customize-modal-title")}"
                  size="L"
                  tag="span"
                  font-weight="500"
                >
                </bbva-type-text>
                <bbva-type-text
                  .text="${this.t("sustainability-sustainable-appliance-simulator-customize-modal-description")}"
                  size="S"
                  tag="span"
                >
                </bbva-type-text>
              `:this._editFormTemplate}
          <bbva-notification-message
            variant="sustainability"
            book-title
            .messageTitle="${this.t("sustainability-sustainable-appliance-simulator-average-energy-consumption-description",{amount:De(null===(i=this._electricityEnergyConsumption)||void 0===i||null===(a=i.averageEnergyConsumption)||void 0===a?void 0:a.amount,{currencyCode:null===(r=this._electricityEnergyConsumption)||void 0===r||null===(s=r.averageEnergyConsumption)||void 0===s?void 0:s.currency,localCurrency:this.localCurrency,showCurrencyCode:!1,decimalsHidden:!0,language:this.language})})}"
          ></bbva-notification-message>
          ${null!==(n=this._electricityEnergyConsumption)&&void 0!==n&&n.isEstimated?this._editFormTemplate:p``}
          <bbva-button-default
            fullwidth
            ?disabled="${!this._customEnergyInputValue}"
            @click="${this._updateConsumptionAmount}"
          >
            ${this.t("sustainability-sustainable-appliance-simulator-edit-modal-button")}
          </bbva-button-default>
          ${null!==(l=this._electricityEnergyConsumption)&&void 0!==l&&l.isEstimated?this._customizeActionsTemplate:p``}
        </div>
      </bbva-help-modal>
    `}get _customizeActionsTemplate(){var t,e;return p`
      <bbva-type-text
        class="actions-title"
        .text="${this.t("sustainability-sustainable-appliance-simulator-customize-modal-actions-title")}"
        size="S"
        tag="span"
        font-weight="500"
      >
      </bbva-type-text>
      ${null!==(t=this.features)&&void 0!==t&&t.appHasPayInApp?p`
            <div class="customize-actions-item">
              <bbva-type-link
                ?disabled="${!(null!==(e=this.features)&&void 0!==e&&e.appHasPayInApp)}"
                .icon="${Me()}"
                size="S"
                @click="${()=>{this._navigateForwardExternal("pay-receipts")}}"
                >${this.t("sustainability-sustainable-appliance-simulator-customize-modal-actions-pay-receipts-link")}
              </bbva-type-link>
              <bbva-type-text
                .text="${this.t("sustainability-sustainable-appliance-simulator-customize-modal-actions-pay-receipts-description")}"
                size="S"
                tag="span"
              >
              </bbva-type-text>
            </div>
            <bbva-divider-default></bbva-divider-default>
          `:""}
      <div class="customize-actions-item">
        <bbva-type-link disabled .icon="${Fe()}" size="S"
          >${this.t("sustainability-sustainable-appliance-simulator-customize-modal-actions-domicile-receipts-link")}
        </bbva-type-link>
        <bbva-type-text
          .text="${this.t("sustainability-sustainable-appliance-simulator-customize-modal-actions-domicile-receipts-description")}"
          size="S"
          tag="span"
        >
        </bbva-type-text>
      </div>
    `}get _editFormTemplate(){var t;return p`
      <bbva-type-text
        .text="${this.t("sustainability-sustainable-appliance-simulator-edit-modal-edit-title")}"
        size="S"
        tag="span"
        font-weight="500"
      >
      </bbva-type-text>
      <bbva-type-text
        .text="${this.t("sustainability-sustainable-appliance-simulator-edit-modal-edit-description")}"
        size="S"
        tag="span"
      >
      </bbva-type-text>
      <bbva-form-input
        type="amount"
        required
        decimal-digits="0"
        .label="${this.t("sustainability-sustainable-appliance-simulator-edit-modal-edit-label")}"
        .currencyCode="${null===(t=this._energyConsumption)||void 0===t?void 0:t.currency}"
        .localCurrency="${this.localCurrency}"
        .language="${this.language}"
        .amount="${this._customEnergyInputValue}"
        @form-amount-input-change="${({detail:t})=>{this._customEnergyInputValue=t.value&&t.amount}}"
      >
      </bbva-form-input>
    `}_updateConsumptionAmount(){var t;this._customEnergyConsumption=this._customEnergyInputValue,this.customizeConsumptionModal=!1;const e=null!==(t=this._electricityEnergyConsumption)&&void 0!==t&&t.isEstimated?"sustainability-sustainable-appliance-simulator-amount-customize":"sustainability-sustainable-appliance-simulator-amount-edit";this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0}))}get _reducedAmountTemplate(){var t,e,o;return p`
      <div class="amount-info">
        ${null!==(t=this.simulatorData)&&void 0!==t&&t.homeAppliances?p`
              <bbva-type-text
                font-weight="500"
                .text="${this.t("sustainability-sustainable-appliance-simulator-reduced-text")}"
                size="S"
                tag="span"
              >
              </bbva-type-text>
              <bbva-type-amount
                variant="m"
                decimals-hidden
                .amount="${null===(e=this._energyConsumptionReduced)||void 0===e?void 0:e.amount}"
                .currencyCode="${null===(o=this._energyConsumptionReduced)||void 0===o?void 0:o.currency}"
                .localCurrency="${this.localCurrency}"
                .language="${this.language}"
              >
              </bbva-type-amount>
            `:p``}
      </div>
    `}get _appliancesChecklistTemplate(){var t,e,o,i,a;return p`
      <div class="appliances-checklist">
        <bbva-type-text
          class="appliances-checklist__header"
          tag="span"
          size="S"
          .text="${this.t("sustainability-sustainable-appliance-simulator-checklist-text")}"
          ?loading="${!(null!==(t=this.simulatorData)&&void 0!==t&&t.homeAppliances)}"
        ></bbva-type-text>
        <bbva-form-container
          @form-container-checkbox-change="${null!==(e=this.simulatorData)&&void 0!==e&&e.homeAppliances?this._onApplianceCheckboxChange:()=>{}}"
        >
          ${null!==(o=this.simulatorData)&&void 0!==o&&o.homeAppliances?null===(i=this.simulatorData)||void 0===i||null===(a=i.homeAppliances)||void 0===a?void 0:a.map(((t,e,o)=>{var i,a;return p`
                  <bbva-form-control-input
                    slot="_option"
                    divider-size="${e===o.length-1?"full":"fit"}"
                    alignment="right"
                    .name="${null===(i=t.applianceType)||void 0===i?void 0:i.id}"
                    value="appliance-${e}"
                    ?checked="${t.checked}"
                  >
                    <div slot="left">
                      <bbva-type-text
                        tag="span"
                        size="S"
                        font-weight="500"
                        .text="${this.t(`sustainability-sustainable-appliance-simulator-appliance-type-${null===(a=t.applianceType)||void 0===a?void 0:a.name}`)}"
                      ></bbva-type-text>
                      <bbva-type-text
                        tag="span"
                        size="S"
                        .text="${this.t(`sustainability-sustainable-appliance-simulator-impact-${t.impactType}`)}"
                      ></bbva-type-text>
                    </div>
                  </bbva-form-control-input>
                `})):Array.from(Array(4)).map((()=>p`
                  <bbva-form-control-input slot="_option" alignment="right" checked>
                    <div slot="left">
                      <bbva-type-text loading></bbva-type-text>
                      <bbva-type-text loading></bbva-type-text>
                    </div>
                  </bbva-form-control-input>
                `))}
        </bbva-form-container>
      </div>
    `}get _savingsTemplate(){var t,e,o,i,a,r,s,n,l;return p`
      <div
        class="savings ${this._toggles.promotions&&!this._toggles.products?"savings--with-promotions":""}"
      >
        <bbva-type-text
          tag="span"
          size="S"
          .text="${this.t("sustainability-sustainable-appliance-simulator-anual-savings-title")}"
          ?loading="${!(null!==(t=this.simulatorData)&&void 0!==t&&t.homeAppliances)}"
        ></bbva-type-text>
        <bbva-type-amount
          .variant="${null!==(e=this.simulatorData)&&void 0!==e&&e.homeAppliances?"3xl":"m"}"
          type="bold"
          decimals-hidden
          .amount="${null===(o=this._saving)||void 0===o?void 0:o.amount}"
          .currencyCode="${null===(i=this._saving)||void 0===i?void 0:i.currency}"
          .localCurrency="${this.localCurrency}"
          .language="${this.language}"
          ?loading="${!(null!==(a=this.simulatorData)&&void 0!==a&&a.homeAppliances)}"
        >
        </bbva-type-amount>
        <bbva-type-link
          size="S"
          .icon="${f()}"
          ?loading="${!(null!==(r=this.simulatorData)&&void 0!==r&&r.homeAppliances)}"
          @click="${()=>{this.calculationExplanationModal=!0}}"
          >${this.t("sustainability-sustainable-appliance-simulator-calculations-link")}</bbva-type-link
        >
        <bbva-notification-message
          variant="sustainability"
          .messageTitle="${null===(s=this._electricitySavings)||void 0===s||null===(n=s.environmentalImpact)||void 0===n?void 0:n.description}"
          book-title
          ?loading="${!(null!==(l=this.simulatorData)&&void 0!==l&&l.homeAppliances)}"
        ></bbva-notification-message>
      </div>
      ${this._calculationExplanationModalTemplate}
    `}get _calculationExplanationModalTemplate(){return p`
      <bbva-help-modal
        id="sustainability-sustainable-appliance-simulator-calculation-explanation-modal"
        full-height
        .titleIcon="${B()}"
        .headerCloseIconAriaLabel="${this.t("sustainability-sustainable-appliance-simulator-modal-icon-aria-label")}"
        .headerText="${this.t("sustainability-sustainable-appliance-simulator-calculation-explanation-modal-header")}"
        .titleText="${this.t("sustainability-sustainable-appliance-simulator-calculation-explanation-modal-title")}"
        title-lines="0"
        .buttonText="${this.t("sustainability-sustainable-appliance-simulator-calculation-explanation-modal-button")}"
        ?visible="${this.calculationExplanationModal}"
        @visible-changed="${({detail:t})=>{this.calculationExplanationModal=t}}"
      >
        <div slot="slot-content">
          <bbva-type-text
            .text="${this.t("sustainability-sustainable-appliance-simulator-calculation-explanation-modal-body")}"
            size="S"
            tag="span"
          >
          </bbva-type-text>
        </div>
      </bbva-help-modal>
    `}get _productOfferTemplate(){var t,e,o,i,a,r,s,n,l,c,d,m,u,h,b,v,g,y;const f=this._selectedProductOffer,_=null==f||null===(t=f.detail)||void 0===t||null===(e=t.description)||void 0===e||null===(o=e.trim())||void 0===o?void 0:o.replace(/\.$/,""),$=null==f||null===(i=f.detail)||void 0===i||null===(a=i.image)||void 0===a?void 0:a.url,w=`${_} ${(null==f||null===(r=f.detail)||void 0===r||null===(s=r.amounts)||void 0===s||null===(n=s[0])||void 0===n||null===(l=n.description)||void 0===l?void 0:l.toLowerCase())||""} ${null!=f&&null!==(c=f.detail)&&void 0!==c&&null!==(d=c.amounts)&&void 0!==d&&null!==(m=d[0])&&void 0!==m&&m.amount?De(null==f||null===(u=f.detail)||void 0===u||null===(h=u.amounts)||void 0===h||null===(b=h[0])||void 0===b?void 0:b.amount,{currencyCode:null==f||null===(v=f.detail)||void 0===v||null===(g=v.amounts)||void 0===g||null===(y=g[0])||void 0===y?void 0:y.currency,localCurrency:this.localCurrency,showCurrencyCode:!1,decimalsHidden:!0,language:this.language}):""}`.trim();return p`
      <div
        class="products-section ${this._toggles.promotions?"products-section--with-promotions":""}"
      >
        <bbva-header-category
          heading-level="2"
          .text="${this.t("sustainability-sustainable-appliance-simulator-products-title")}"
          ?loading="${this._currentRequests.products}"
        >
        </bbva-header-category>
        <bbva-type-text
          .text="${this.t("sustainability-sustainable-appliance-simulator-products-intro")}"
          size="S"
          tag="span"
          ?loading="${this._currentRequests.products}"
        >
        </bbva-type-text>
        <div class="offer-card" ambient="secondary">
          ${$?p`
                <img
                  src="${$}"
                  alt="${this.t("sustainability-sustainable-appliance-simulator-products-image-alt")}"
                />
              `:p`
                <bbva-clip-microillustration
                  microillustration="sustainableloan"
                  size="S"
                  ?loading="${this._currentRequests.products}"
                >
                </bbva-clip-microillustration>
              `}
          <bbva-type-text
            .text="${w}"
            size="S"
            tag="span"
            ?loading="${this._currentRequests.products}"
          >
          </bbva-type-text>
          <bbva-type-link
            size="S"
            ?loading="${this._currentRequests.products}"
            @click="${()=>{this._navigateForwardExternal(null==f?void 0:f.eventId,null==f?void 0:f.detail)}}"
            >${this.t("sustainability-sustainable-appliance-simulator-products-link")}
          </bbva-type-link>
        </div>
      </div>
    `}get _fullErrorTemplate(){const t=this._requestErrors.simulator<=this.maxRequestAttempts;return t||this._noRetryEventError(),p`
      <bbva-help-modal
        id="sustainability-sustainable-appliance-simulator-full-error-modal"
        full-height
        fixed-footer
        avoid-icon-close-modal
        title-lines="0"
        .closeModalElements="${[]}"
        .headerCloseIconAriaLabel="${this.t("sustainability-sustainable-appliance-simulator-modal-icon-aria-label")}"
        .headerText="${this.t("sustainability-sustainable-appliance-simulator-error-modal-header")}"
        .buttonText="${t?this.t("sustainability-sustainable-appliance-simulator-error-section-link"):this.t("sustainability-sustainable-appliance-simulator-error-modal-exit")}"
        visible
        @help-modal-header-click="${()=>{this.navigateBack()}}"
        @help-modal-footer-button-click="${t?()=>{this._requestData()}:()=>{this.navigateBack()}}"
      >
        <div slot="slot-content">
          <bbva-clip-microillustration microillustration="error" size="S">
          </bbva-clip-microillustration>
          <bbva-type-text
            text="${this.t("sustainability-sustainable-appliance-simulator-error-modal-title")}"
            size="L"
            tag="span"
            font-weight="500"
          >
          </bbva-type-text>
          <bbva-type-text
            .text="${t?this.t("sustainability-sustainable-appliance-simulator-error-section-text"):this.t("sustainability-sustainable-appliance-simulator-error-section-text-no-retries")}"
            size="S"
            tag="span"
          >
          </bbva-type-text>
        </div>
      </bbva-help-modal>
      <bbva-progress-content
        variant="transparent"
        ?visible="${Object.values(this._currentRequests).some((t=>t))}"
      >
      </bbva-progress-content>
    `}_sectionErrorTemplate(t){const e=this._requestErrors[t]<=this.maxRequestAttempts;return p`
      <div class="section-error-wrapper">
        <bbva-notification-message
          variant="error"
          book-title
          .messageTitle="${e?this.t("sustainability-sustainable-appliance-simulator-error-section-text"):this.t("sustainability-sustainable-appliance-simulator-error-section-text-no-retries")}"
          .linkTitle="${e?this.t("sustainability-sustainable-appliance-simulator-error-section-link"):""}"
          @notification-message-link-click="${()=>{this._requestData({[t]:!0})}}"
        ></bbva-notification-message>
        <bbva-progress-content
          variant="transparent"
          ?visible="${this._currentRequests[t]}"
        ></bbva-progress-content>
      </div>
    `}get _simulatorTemplate(){return p`
      ${this._homeSimulatorDmTemplate} ${this._headerTemplate} ${this._appliancesInfoTemplate}
      ${this._amountInformationTemplate} ${this._appliancesChecklistTemplate}
      ${this._savingsTemplate}
    `}get _productsTemplate(){var t;return p`
      ${this._requestErrors.products?this._sectionErrorTemplate("products"):p`
            ${this._productsDmTemplate}
            ${null!==(t=this._selectedProductOffer)&&void 0!==t&&t.detail||this._currentRequests.products?this._productOfferTemplate:p``}
          `}
    `}get _promotionsTemplate(){return p`
      <div id="promotions-container">
        <rewards-promotions
          .host="${this.host}"
          .native="${this.native}"
          .headers="${this._headers}"
          promotions-api-version="0"
          load-standalone-content
          .requiredToken="${this.requiredToken}"
          show-promotions-by-type
          show-cards-for-promotion
          parallel-requests
          .promotionsTypeId="${[{promotionTypeTitle:this.t("sustainability-sustainable-appliance-simulator-rewards-promotions-title"),id:"LOYALTY_POINTS",categoriesId:"SUSTAINABILITY"}]}"
          show-promotions-by-one-type
          .detailDownloadConfig="${{mimeType:"application/pdf",canShare:!0}}"
          id="rewards-promotions"
          @navigation-go-forward="${t=>{t.stopPropagation(),this._internalFeature.rewardsPromotions.push(t.detail)}}"
          @navigation-go-back="${t=>{t.stopPropagation(),this._internalFeature.rewardsPromotions.pop()}}"
          @rewards-promotion-list-button-view-more-promotions="${({detail:t})=>{this._changeEventName(t,"promotions-list-view")}}"
          @rewards-promotions-detail-get-promotion="${({detail:t})=>{this._changeEventName(t,"promotion-detail-view")}}"
        >
        </rewards-promotions>
      </div>
    `}_handleNavigation(){}_changeEventName(t,e){this.dispatchEvent(new CustomEvent(`${Ls.is}-${e}`,{detail:t,bubbles:!0,composed:!0}))}navigateBack(t=!0){const e=this._findOpenedModal(),o=this._getActiveInternalFeature();e?this[e]=!1:o?o.navigateBack():t&&this.dispatchEvent(new CustomEvent("navigation-go-back",{bubbles:!0,composed:!0,detail:!0}))}_findOpenedModal(){return Object.keys(Ls.properties).find((t=>t.endsWith("Modal")&&this[t]))}_getActiveInternalFeature(){return{rewardsPromotions:this.rewardsPromotionsFeatureElement}[Object.keys(this._internalFeature).find((t=>this._internalFeature[t].length))]}_onApplianceCheckboxChange({detail:t}){const{value:e,checked:o}=t,i=Number(e.split("-")[1]);this.simulatorData.homeAppliances[i].checked=o,this.simulatorData={...this.simulatorData},this.showLoader(),setTimeout((()=>this.clearLoader()),300)}_onSimulatorRequestSuccess({detail:t}){const e={HIGH:1,MEDIUM:2,LOW:3};this._requestErrors={...this._requestErrors,simulator:0},this._currentRequests={...this._currentRequests,simulator:!1},this.simulatorData={...t,homeAppliances:t.homeAppliances.sort(((t,o)=>e[t.impactType]-e[o.impactType])).map((t=>({...t,checked:!0})))}}_onProductsRequestSuccess({detail:t}){var e;this.products=t||[],this._requestErrors={...this._requestErrors,products:0},this._currentRequests={...this._currentRequests,products:!1},null!==(e=this.products)&&void 0!==e&&e.length||this._nonPreaprovedCall||(this._nonPreaprovedCall=!0,this.productsDmElement.getOffers({"label.id":this.t(this.noPreApprovedLabel)}))}_onRequestError(t){this._nonPreaprovedCall=!1,this._requestErrors={...this._requestErrors,[t]:this._requestErrors[t]+1},this._currentRequests={...this._currentRequests,[t]:!1}}_requestData(t){var e;this.externalSimulatorData&&0!==Object.keys(this.externalSimulatorData).length?this._onSimulatorRequestSuccess({detail:this.externalSimulatorData}):!this.homeSimulatorDmElement||t&&!t.simulator||(this._currentRequests={...this._currentRequests,simulator:!0},this.homeSimulatorDmElement.postHomeSimulator()),this.externalOffersData&&0!==Object.keys(this.externalOffersData).length?this._onProductsRequestSuccess({detail:this.externalOffersData}):null!==(e=this.products)&&void 0!==e&&e.length||!this.productsDmElement||t&&!t.products||(this._currentRequests={...this._currentRequests,products:!0},this._nonPreaprovedCall=!1,this.productsDmElement.getOffers())}_manageHeaderMainClicks(t){var e;const o=t.composedPath&&t.composedPath()||t.path,i={1:"sustainability-sustainable-appliance-simulator-menu-click"};if("main-header"===(null==o||null===(e=o[0])||void 0===e?void 0:e.id)){var a;const e=null==t||null===(a=t.detail)||void 0===a?void 0:a.index;0===e?this.navigateBack():this.dispatchEvent(new CustomEvent(i[e],{composed:!0,bubbles:!0}))}}_noRetryEventError(){this.dispatchEvent(new CustomEvent(`${Ls.is}-error-not-available-retry`,{composed:!0,bubbles:!0}))}_navigateForwardExternal(t,e){this.dispatchEvent(new CustomEvent(`sustainability-sustainable-appliance-simulator-${t}-external-navigate`,{detail:e,composed:!0,bubbles:!0}))}render(){return p`
      ${super.render()}
      <div ambient="primary">
        ${this._hasFullError?this._fullErrorTemplate:p`
              ${this._simulatorTemplate} ${this._toggles.products?this._productsTemplate:p``}
              ${this._toggles.promotions?this._promotionsTemplate:p``}
            `}
      </div>
    `}}customElements.define(Ls.is,Ls);
