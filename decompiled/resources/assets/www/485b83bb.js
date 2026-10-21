import{z as t,an as e,L as i,ak as a,h as n,i as o,aV as s,bF as r,cv as l,ck as c,aD as m,aX as d,W as p,aY as h}from"./952f98a9.js";import{R as u,S as b,u as g,D as y,a1 as f,z as v,aC as _,O as x,v as k,w as $,G as P,a2 as D,H as w,aq as C,P as S,M as A,L as V,e as M,Q as F,a4 as T,I as E,a3 as B,x as z,E as I,K as L,N as H,V as N,f as R,aD as O,ah as j}from"./216055dc.js";import{B as q}from"./a54cd56b.js";import{B as X}from"./161ddab1.js";import"./7f3d7ca9.js";import{B as U,b as Y}from"./187e605b.js";import{B as W}from"./0bde5adf.js";import"./c0a2f832.js";import"./cae0f1de.js";var K=t`
:host {
  --_skeleton-default-bg-color: var(--bbva-skeleton-default--_ambient--bg-color, var(--bbva-skeleton-default--custom--primary-ambient--bg-color, var(--color-primary-surface-ambient-preloading,#ffffff)));
  --_skeleton-default-animated-bg-color: var(--bbva-skeleton-default--_ambient--animated-bg-color, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color, var(--color-primary-surface-ambient-default,#f4f4f4)));
  --_skeleton-default-bg-color-alt: var(--bbva-skeleton-default--_ambient--bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--bg-color-alt, var(--color-primary-surface-alternative-preloading,#e9e9e9)));
  --_skeleton-default-animated-bg-color-alt: var(--bbva-skeleton-default--_ambient--animated-bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color-alt, var(--color-primary-surface-alternative-default,#ffffff)));
}

:host {
  position: relative;
  display: flex;
  box-sizing: border-box;
  flex-direction: column;
  margin-top: 0.5rem;
  background-color: var(--_data-visualization-tooltip-bg-color);
  --_data-visualization-tooltip-panel-padding: var(--data-visualization-tooltip-panel-padding, 0.25rem 0.5rem 1rem 0.5rem);
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.arrow-wrapper {
  position: absolute;
  top: -0.5rem;
  right: 0;
  left: 0;
  width: 100%;
  height: 0.5rem;
}
.arrow-wrapper .arrow {
  position: absolute;
  top: 0;
  left: calc(var(--_data-visualization-tooltip-left-position) - 8px);
  display: block;
  width: 1rem;
  height: 0.5rem;
  background-color: var(--_data-visualization-tooltip-bg-color);
  clip-path: polygon(50% 0%, 0% 100%, 100% 100%);
}

.panel {
  display: flex;
  box-sizing: border-box;
  flex-direction: column;
  padding: var(--_data-visualization-tooltip-panel-padding);
}

.content-wrapper {
  position: relative;
  padding: 0 0.5rem;
}
.content-wrapper .label-content {
  display: flex;
  overflow: hidden;
}
.content-wrapper .label-content.no-description {
  flex: 1 1 0%;
}
.content-wrapper .label-wrapper {
  display: flex;
  overflow: hidden;
  flex: 1;
  justify-content: space-between;
  padding-top: 0.5rem;
}
.content-wrapper:first-child .label-wrapper {
  padding-top: 0;
}
.content-wrapper .label {
  overflow: hidden;
  align-self: center;
}
.content-wrapper .amount {
  display: block;
}
.content-wrapper .description {
  overflow: hidden;
  margin-left: auto;
}

[data-tag-name=bbva-type-amount] {
  align-self: center;
}

[data-tag-name=bbva-badge-variability] {
  align-self: end;
  padding-bottom: 0.25rem;
}

.icon-close {
  display: flex;
  align-self: flex-end;
}

.legend {
  display: flex;
  width: 1rem;
  height: 1.5rem;
  flex: none;
  align-items: center;
  margin-right: 0.5rem;
}
.legend-bar span {
  width: calc(1rem - 5px);
  height: 0.625rem;
  background-color: var(--_data-visualization-tooltip-bar-legend-color);
  transform: skewX(-26deg);
  transform-origin: left bottom;
}
.legend-oval span {
  width: 1rem;
  height: 1rem;
  border-radius: 50%;
  background-color: var(--_data-visualization-tooltip-bar-legend-color);
}

:host([arrow-positon=left]) .arrow-wrapper .arrow {
  left: 0;
  clip-path: polygon(0% 0%, 0% 100%, 50% 100%);
}

:host([arrow-positon=right]) .arrow-wrapper .arrow {
  right: 0;
  left: auto;
  clip-path: polygon(100% 0%, 50% 100%, 100% 100%);
}

:host([loading]) {
  height: 6.25rem;
}

.skeleton {
  position: absolute;
  right: 1%;
  left: 1%;
  height: 6.25rem;
  overflow-x: hidden;
  background-color: var(--_skeleton-default-bg-color-alt);
  -webkit-mask-image: linear-gradient(black 100%, transparent 0), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, black 50%, transparent 50%), linear-gradient(black 100%, transparent 0), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, black 50%, transparent 50%), linear-gradient(black 100%, transparent 0), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, black 50%, transparent 50%);
  mask-image: linear-gradient(black 100%, transparent 0), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, black 50%, transparent 50%), linear-gradient(black 100%, transparent 0), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, black 50%, transparent 50%), linear-gradient(black 100%, transparent 0), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, black 50%, transparent 50%);
  -webkit-mask-position: 16px 16px, 40px 16px, calc(100%  + -16px) 16px, 16px 43px, 40px 43px, calc(100%  + -16px) 43px, 16px 70px, 40px 70px, calc(100%  + -16px) 70px;
  mask-position: 16px 16px, 40px 16px, calc(100%  + -16px) 16px, 16px 43px, 40px 43px, calc(100%  + -16px) 43px, 16px 70px, 40px 70px, calc(100%  + -16px) 70px;
  -webkit-mask-repeat: no-repeat;
  mask-repeat: no-repeat;
  -webkit-mask-size: 15px 15px, calc((47% * 2) + (15px/ 2)) 15px, calc((20% * 2) + (15px/ 2)) 15px, 15px 15px, calc((47% * 2) + (15px/ 2)) 15px, calc((20% * 2) + (15px/ 2)) 15px, 15px 15px, calc((47% * 2) + ( 15px/ 2))  15px, calc((20% * 2) + (15px/ 2)) 15px;
  mask-size: 15px 15px, calc((47% * 2) + (15px/ 2)) 15px, calc((20% * 2) + (15px/ 2)) 15px, 15px 15px, calc((47% * 2) + (15px/ 2)) 15px, calc((20% * 2) + (15px/ 2)) 15px, 15px 15px, calc((47% * 2) + ( 15px/ 2))  15px, calc((20% * 2) + (15px/ 2)) 15px;
  pointer-events: none;
  /*
  &::after {
     display: block;
     width: 100%;
     height: 100%;
     animation: skeletonAnimation 1500ms ease-in 100ms infinite alternate-reverse;
     background-color: var(--_skeleton-default-animated-bg-color-alt);
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
.skeleton::after {
  display: block;
  width: 100%;
  height: 100%;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  background-color: var(--_skeleton-default-animated-bg-color-alt);
  background-image: linear-gradient(var(--_skeleton-default-bg-color-alt) 100%, transparent 0);
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
`,G=t`
:host {
  --_data-visualization-tooltip-bar-legend-color: var(--bbva-data-visualization-tooltip--_ambient--bar-legend-color, var(--data-visualization-tooltip--custom--primary-ambient--bar-legend-color, ${u("colorPrimaryCategoriesSustainability",b)}));
  --_data-visualization-tooltip-bg-color: var(--bbva-data-visualization-tooltip--_ambient--bg-color, var(--bbva-data-visualization-tooltip--custom--primary-ambient--bg-color, ${u("colorPrimarySurfaceAlternativeDefault",b)}));
}
`;const Q=t`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-data-visualization-tooltip--_ambient--bar-legend-color: initial;
    --bbva-data-visualization-tooltip--_ambient--bg-color: initial;
  }
`,J=t`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-data-visualization-tooltip--_ambient--bar-legend-color: var(
      --data-visualization-tooltip--custom--primary-alt-ambient--bar-legend-color,
      ${u("colorPrimaryAltCategoriesSustainability",b)}
    );
    --bbva-data-visualization-tooltip--_ambient--bg-color: var(
      --bbva-data-visualization-tooltip--custom--primary-alt-ambient--bg-color,
      ${u("colorPrimaryAltSurfaceAlternativeDefault",b)}
    );
  }
`,Z=t`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-data-visualization-tooltip--_ambient--bar-legend-color: var(
      --data-visualization-tooltip--custom--secondary-ambient--bar-legend-color,
      ${u("colorSecondaryCategoriesSustainability",b)}
    );
    --bbva-data-visualization-tooltip--_ambient--bg-color: var(
      --bbva-data-visualization-tooltip--custom--secondary-ambient--bg-color,
      ${u("colorSecondarySurfaceAlternativeDefault",b)}
    );
  }
`,tt=t`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-data-visualization-tooltip--_ambient--bar-legend-color: var(
      --data-visualization-tooltip--custom--secondary-alt-ambient--bar-legend-color,
      ${u("colorSecondaryAltCategoriesSustainability",b)}
    );
    --bbva-data-visualization-tooltip--_ambient--bg-color: var(
      --bbva-data-visualization-tooltip--custom--secondary-alt-ambient--bg-color,
      ${u("colorSecondaryAltSurfaceAlternativeDefault",b)}
    );
  }
`;const et=g([Object.freeze({__proto__:null,primary:Q,primaryAlt:J,secondary:Z,secondaryAlt:tt}),y,f,v,_,x,f]),it=Object.values(et);class at extends(k(e($(i)))){static get is(){return"bbva-data-visualization-tooltip"}static get scopedElements(){const t=[P,D,w,C,S];return at.scopedElementsFromClasses(t)}static get properties(){return{listLegendItems:{type:Array,attribute:"list-legend-items"},listSimpleItems:{type:Array,attribute:"list-simple-items"},arrowPosition:{type:String,attribute:"arrow-position",reflect:!0},arrowPositionValue:{type:Number,attribute:"arrow-position-value",reflect:!0},listLegendSize:{type:Number,attribute:"list-legend-size"},listSimpleSize:{type:Number,attribute:"list-simple-size"},iconClose:{type:Boolean,attribute:"icon-close"},iconCloseLabel:{type:String,attribute:"icon-close-label"},loading:{type:Boolean,reflect:!0}}}constructor(){super(),this.listLegendItems=[],this.listSimpleItems=[],this.arrowPosition="",this.listLegendSize=5,this.listSimpleSize=5,this.iconClose=!1,this.iconCloseLabel="bbva-data-visualization-tooltip-close",this.loading=!1}static get styles(){return[super.styles,K,G,it,a("bbva-data-visualization-tooltip-shared-styles")]}static _text(t,e,i,a,s,r){return n`
      <bbva-type-text
        class="${t}"
        ?ellipsis="${i}"
        lines="1"
        unset
        size="S"
        alignment="${e}"
        text="${o(a)}"
        font-weight="${s?500:""}"
        font-style="${r?"italic":""}"
      ></bbva-type-text>
    `}static _date(t,e,i){return n`
      <bbva-type-date
        class="${t}"
        date="${o(e)}"
        font-style="italic"
        locale="${o(i)}"
      ></bbva-type-date>
    `}static _amount(t,e){const{decimalsHidden:i,amount:a,amountSize:s,localCurrency:r,currencyCode:l,language:c}=e;return n`
      <bbva-type-amount
        ?decimals-hidden="${i}"
        class="${"legend"===t?"amount":""}"
        .variant="${s||"legend"===t?"S":"M"}"
        amount="${o(a)}"
        local-currency="${o(r)}"
        currency-code="${o(l)}"
        language="${o(c)}"
      >
      </bbva-type-amount>
    `}_listLegend(t){return n`
      <div
        class="content-wrapper"
        data-id="list-legend"
        aria-disabled="${o(this.disabled?"true":void 0)}"
      >
        <div class="label-wrapper">
          <span class="legend legend-${t.barLegendType||"bar"}">
            <span
              style=${o(t.barLegendColor&&`background-color:${t.barLegendColor}`)}
            ></span>
          </span>
          <div class="label-content ${!t.description&&"no-description"}">
            ${t.labelLink?n`
                  <bbva-type-link
                    ?ellipsis="${t.labelEllipsis}"
                    text="${t.label}"
                    @click="${()=>this._labelLinkClickHandler([t])}"
                  ></bbva-type-link>
                `:at._text("label","left",t.labelEllipsis,t.label,t.mediumLabel)}
          </div>
          ${t.description?at._text("description","right",t.descriptionEllipsis,t.description):s}
          ${t.amount?at._amount("legend",t):s}
        </div>
      </div>
    `}_labelLinkClickHandler(t){this.dispatchEvent(new CustomEvent("data-visualization-tooltip-title-link-click",{bubbles:!0,composed:!0,detail:t}))}_listSimple(t){return n`
      <div class="content-wrapper" data-id="list-simple">
        <div class="label-wrapper">
          <div class="label-content ${!t.description&&"no-description"}">
            ${t.label?at._text("label","left",t.labelEllipsis,t.label,t.mediumLabel):""}
            ${t.label&&Object.keys(t).some((t=>t.includes("badgeVariabilityLabel")))?n`<bbva-badge-variability
                  size="small"
                  color="${o(t.badgeVariabilityLabelColor)}"
                  status="${o(t.badgeVariabilityLabelStatus)}"
                ></bbva-badge-variability>`:""}
            ${t.labelLink?n`<bbva-type-link
                  text="${t.textLink}"
                  data-id="list-simple-${t.dataIdLink||"link"}"
                  @click="${()=>this._linkClickHandler([t])}"
                ></bbva-type-link>`:s}
          </div>
          ${!t.amount||t.description||t.date?"":at._amount("simple",t)}
          ${!t.description||t.amount||t.date?"":at._text("description","right",t.descriptionEllipsis,t.description,t.descriptionMedium,t.descriptionItalic)}
          ${!t.date||t.description||t.amount?"":at._date("date",t.date,t.locale)}
          ${(t.description||t.amount||t.date)&&Object.keys(t).some((t=>t.includes("badgeVariabilityDescription")))?n`<bbva-badge-variability
                size="small"
                color="${o(t.badgeVariabilityDescriptionColor)}"
                status="${o(t.badgeVariabilityDescriptionStatus)}"
              ></bbva-badge-variability>`:""}
        </div>
      </div>
    `}_linkClickHandler(t){this.dispatchEvent(new CustomEvent(`data-visualization-tooltip-${t.dataIdLink||"link"}-click`,{bubbles:!0,composed:!0,detail:t}))}connectedCallback(){super.connectedCallback&&super.connectedCallback()}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback()}updated(t){super.updated&&super.updated(t),this.arrowPositionValue>0&&this.arrowPositionValue<3?this.setAttribute("arrow-positon","left"):this.arrowPositionValue>97&&this.arrowPositionValue<=100&&this.setAttribute("arrow-positon","right"),this.arrowPositionValue&&this._arrowSelector.setAttribute("style",`left: ${this._arrowPositionStyle(this._arrowWidth)}`)}get _closeIcon(){return this.iconClose?n`
          <bbva-type-link
            class="data-test-close icon-close"
            variant="icon secondary"
            size="16"
            icon="${r()}"
            aria-label="${this.t(this.iconCloseLabel)}"
            @click="${this._iconClick}"
          >
          </bbva-type-link>
        `:s}get filteredListLegend(){return this.listLegendItems.slice(0,this.listLegendSize)}get filteredListSimple(){return this.listSimpleItems.slice(0,this.listSimpleSize)}get _arrowSelector(){return this.shadowRoot.querySelector(".arrow")}get _arrowWidth(){return this._arrowSelector.offsetWidth}_arrowPositionStyle(t){return this.arrowPositionValue>=3&&this.arrowPositionValue<=97&&`calc((${this.arrowPositionValue} * 1%) - ((${t} / 2) * 1px)`||""}_iconClick(){this.dispatchEvent(new CustomEvent("data-visualization-tooltip-icon-click",{detail:!0,bubbles:!0,composed:!0}))}render(){return n`
      <div class="arrow-wrapper">
        <span class="arrow"></span>
      </div>
      ${this.loading?n` <div class="skeleton"></div> `:n`
            ${this._closeIcon}
            <div class="panel">
              ${this.listLegendItems.length?n`
                    ${this.filteredListLegend.map((t=>n` ${this._listLegend(t)} `))}
                  `:""}
              ${this.listSimpleItems.length?n`
                    ${this.filteredListSimple.map((t=>n` ${this._listSimple(t)} `))}
                  `:""}
            </div>
          `}
    `}}var nt=t`
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

[data-tag-name=bbva-type-date] {
  margin-top: 0.5rem;
}
`;const{moment:ot}=window,st=(t,e)=>{const i={header:{id:e,variant:"first-level-sequential",showLeftIcon:!0,text:"",buttons:[{id:"btn-back",leftIcon:l(),leftIconLabel:"Back",leftIconAriaLabel:"Back",accessibilityText:"Back"},{id:"btn-menu",icon:c(),closeIconLabel:"Menu",closeIconAriaLabel:"Menu",accessibilityText:"Menu"}]},loader:!0,notify:!1,back:!0,fixedHeader:!0,className:"dark-blue-bg"};return i.header.text=t,i},rt=t=>{var e,i,a,n,o,s,r,l,c,m,d,p;return{capitalAmount:(null===(e=t.capitals.find((t=>"TOTAL"===t.id)))||void 0===e||null===(i=e.amount)||void 0===i||null===(a=i.amount)||void 0===a?void 0:a.toString())||"0",commissionsAmount:(null===(n=t.commissions.find((t=>"TOTAL"===t.id)))||void 0===n||null===(o=n.amount)||void 0===o||null===(s=o.amount)||void 0===s?void 0:s.toString())||"0",interestsAmount:(null===(r=t.interests.find((t=>"TOTAL"===t.id)))||void 0===r||null===(l=r.amount)||void 0===l||null===(c=l.amount)||void 0===c?void 0:c.toString())||"0",taxAmount:(null===(m=t.tax)||void 0===m||null===(d=m.totalAmount)||void 0===d||null===(p=d.amount)||void 0===p?void 0:p.toString())||"0"}},lt=t=>{var e,i,a,n,o,s;return{purchasesAmount:(null===(e=t.find((t=>"PURCHASES"===t.id)))||void 0===e||null===(i=e.amount)||void 0===i?void 0:i.amount)||0,promotionsAmount:(null===(a=t.find((t=>"PROMOTIONS"===t.id)))||void 0===a||null===(n=a.amount)||void 0===n?void 0:n.amount)||0,cashDisposalAmount:(null===(o=t.find((t=>"CASH_DISPOSAL"===t.id)))||void 0===o||null===(s=o.amount)||void 0===s?void 0:s.amount)||0}},ct=(t,e="DD MMMM YYYY")=>ot(t,ot.ISO_8601,!0).isValid()?ot(t).format(e):ot(t,"MM/DD/YYYY").format(e);function mt(t,e){let i;return function(...a){const n=this;clearTimeout(i),i=setTimeout((()=>t.apply(n,a)),e)}}const dt=t=>{const e={},i=new URL(t,"http://host.com"),a=new URLSearchParams(i.search);for(const[t,i]of a.entries())e[t]=i;return e},pt=(t,e)=>100*e/t;class ht extends(A(k(V(e(i))))){static get is(){return"payment-to-not-generate-interest-definition-amount"}static get scopedElements(){const t=[P,D,S,...ht.configurationScopedElements()];return ht.scopedElementsFromClasses(t)}static get styles(){return[nt,y.primary,f.primary,x.primary]}static get properties(){return{totalAmount:{type:Number,attribute:"total-amount"},fromPeriodDate:{type:String,attribute:"from-period-date"},toPeriodDate:{type:String,attribute:"to-period-date"},currency:{type:String}}}constructor(){super(),this.ambient="primary",this.totalAmount=0,this.fromPeriodDate="",this.toPeriodDate="",this.currency="",this.language=""}get _renderDefinitionAmount(){return n`
      <bbva-type-text
        inherit
        ambient="${this.ambient}"
        text="${this.t("card-information-minimum-payment-clarifications-debt-period-text")}"
      >
      </bbva-type-text>

      <bbva-type-amount
        variant="3xl"
        type="bold"
        amount="${this.totalAmount}"
        currency-code="${this.currency}"
        local-currency="${this.currency}"
        language="${this.language}"
        color="success"
        alignment="start"
        ambient="${this.ambient}"
      >
      </bbva-type-amount>

      <div>
        <bbva-type-date
          id="custom-options"
          class="range-dates"
          .dateRange="${[ct(this.fromPeriodDate,"MM/DD/YYYY"),ct(this.toPeriodDate,"MM/DD/YYYY")]}"
          font-weight="500"
          ambient="${this.ambient}"
          .options="${{day:"2-digit",month:"short",year:"numeric"}}"
        >
        </bbva-type-date>
      </div>
    `}render(){return n` <div class="align-elements">${this._renderDefinitionAmount}</div> `}}class ut extends(A(e(V(i)))){static get is(){return"card-information-minimum-payment-clarifications-info-modal"}static get scopedElements(){const t=[M,F];return ut.scopedElementsFromClasses(t)}static get properties(){return{modalConfig:{type:Object,attribute:"modal-config"},visible:{type:Boolean},headerText:{type:String,attribute:"header-text"},titleText:{type:String,attribute:"title-text"},bodyText:{type:String,attribute:"body-text"},hasNotification:{type:Boolean,attribute:"has-notification"},iosFixedHeader:{type:Boolean,attribute:"ios-fixed-header"},secondaryText:{type:String,attribute:"secondary-text"}}}constructor(){super(),this.visible=!1,this.modalConfig={},this.headerText="",this.bodyText="",this.iosFixedHeader=!1,this.secondaryText=""}get _renderNotification(){return n`
      <div class="content" slot="slot-content">
        <span class="text-content"
          >${this.t("card-information-minimum-payment-clarifications-notification-header-text")}</span
        >
        <bbva-notification-message style="margin-top: 16px;" ambient="${this.ambient}">
          ${this.t("card-information-minimum-payment-clarifications-notification-body-text")}
        </bbva-notification-message>
      </div>
    `}_onCloseModal(t){t.stopPropagation(),this._dispatchCustomEvent("card-information-minimum-payment-clarifications-card-information-minimum-payment-clarifications-info-modal-close")}get _renderModal(){return this.secondaryText?this._renderModalSecondary:this._renderModalBasic}get _renderModalSecondary(){var t;return n`
      <bbva-help-modal
        ?i-o-s-fixed-header="${this.iosFixedHeader}"
        header-text="${this.headerText}"
        title-icon="${m()}"
        title-text="${this.titleText?this.titleText:""}"
        ?visible=${this.visible}
        ?fixed-footer=${null===(t=this.modalConfig)||void 0===t?void 0:t.fixedFooter}
        @help-modal-close=${this._onCloseModal}
        @header-main-icon-click="${t=>t.stopPropagation()}"
      >
        <div class="col-content" slot="slot-content">
          <div class="col-content align-left">
            <span>${this.bodyText}</span>
          </div>
          <br />
          <div class="col-content align-left">
            <span>${this.secondaryText}</span>
          </div>
        </div>
      </bbva-help-modal>
    `}get _renderModalBasic(){var t;return n`
      <bbva-help-modal
        ?i-o-s-fixed-header="${this.iosFixedHeader}"
        header-text="${this.headerText}"
        title-icon="${m()}"
        title-text="${this.titleText?this.titleText:""}"
        body-text="${this.bodyText}"
        ?visible=${this.visible}
        ?fixed-footer=${null===(t=this.modalConfig)||void 0===t?void 0:t.fixedFooter}
        @help-modal-close=${this._onCloseModal}
        @header-main-icon-click="${t=>t.stopPropagation()}"
      >
        ${this.hasNotification?this._renderNotification:""}
      </bbva-help-modal>
    `}render(){return n` ${this._renderModal} `}}class bt extends(d(A(e(V(i))))){static get is(){return"card-information-minimum-payment-clarification-dashboard"}static get scopedElements(){const t=[T,X,at,E,F,ht,ut,...bt.configurationScopedElements()];return bt.scopedElementsFromClasses(t)}static get properties(){return{freePaymentsData:{type:Object,attribute:"free-payments-data"},barSectionData:{type:Array,attribute:"bar-section-data"},capitals:{type:Number},commissions:{type:Number},interests:{type:Number},tax:{type:Number},_modalVisible:{type:Boolean,state:!0},currency:{type:String},iosFixedHeader:{type:Boolean,attribute:"ios-fixed-header"}}}constructor(){super(),this.freePaymentsData={},this.barSectionData=[],this._detailPaymentList=[{reference:"capitals"},{reference:"commissions"},{reference:"interests"},{reference:"tax"}],this.capitals=0,this.commissions=0,this.interests=0,this.tax=0,this._modalVisible=!1,this.language="",this.currency="",this.iosFixedHeader=!1}static get styles(){return[B.primary,a("card-information-minimum-payment-clarifications-dashboard-styles")]}_formatList(t){const e={decimalsHidden:!1,language:this.language,localCurrency:this.currency,currencyCode:this.currency,labelLink:!0,dataIdLink:"list-link"};return{capitals:{detail:[{label:"card-information-minimum-payment-clarifications-capital-header-title",amount:this.capitals,barLegendColor:"#49A5E6",...e}],divider:!0},commissions:{detail:[{label:"card-information-minimum-payment-clarifications-commissions-header-title",amount:this.commissions,barLegendColor:"#2DCCCD",...e}],divider:!0},interests:{detail:[{label:"card-information-minimum-payment-clarifications-interest-header-title",amount:this.interests,barLegendColor:"#F8CD51",...e}],divider:!0},tax:{detail:[{label:"card-information-minimum-payment-clarifications-tax-header-title",amount:this.tax,barLegendColor:"#F35E61",...e}],divider:!1}}[t]}_openModal(){this._modalVisible=!0}get _renderInfoModal(){return n`
      <card-information-minimum-payment-clarifications-info-modal
        .iosFixedHeader="${this.iosFixedHeader}"
        header-text="${this.t("card-information-minimum-payment-clarifications-main-title")}"
        ?visible=${this._modalVisible}
        has-notification
        @card-information-minimum-payment-clarifications-card-information-minimum-payment-clarifications-info-modal-close=${()=>{this._modalVisible=!1}}
      >
      </card-information-minimum-payment-clarifications-info-modal>
    `}_redirectPage(t){this._dispatchCustomEvent("card-information-minimum-payment-clarification-dashboard-page-redirect",t.detail)}_renderMainContent(){var t,e;const i=ct(this.freePaymentsData.toPeriodDate,"D [de] MMMM"),a=p(null===(t=this.freePaymentsData.paymentWithoutInterest)||void 0===t?void 0:t.amount,{currencyCode:this.currency,localCurrency:this.currency,language:this.language}),o=`\n        ${this.t("card-information-minimum-payment-clarifications-notification-message-date")}\n        ${i}\n        ${this.t("card-information-minimum-payment-clarifications-notification-message-amount")}${a}\n        `;return n`
      <div>
        <bbva-header-category
          variant="default"
          text=${this.t("card-information-minimum-payment-clarifications-main-title")}
          has-help
          @header-category-help-click="${this._openModal}"
          ambient="${this.ambient}"
        >
        </bbva-header-category>

        <payment-to-not-generate-interest-definition-amount
          .fromPeriodDate="${this.freePaymentsData.fromPeriodDate}"
          .toPeriodDate="${this.freePaymentsData.toPeriodDate}"
          .totalAmount="${null===(e=this.freePaymentsData.paymentWithoutInterest)||void 0===e?void 0:e.amount}"
          .currency="${this.currency}"
          .language="${this.language}"
        >
        </payment-to-not-generate-interest-definition-amount>

        <bbva-data-visualization-bar
          bar-any-colors
          ambient="primary"
          .barValues=${this.barSectionData}
          accessibility-text="Up to six colors progress bar"
        >
        </bbva-data-visualization-bar>

        ${this._detailPaymentList.map((t=>{const{divider:e}=this._formatList(t.reference),i=this._formatList(t.reference).detail;return n`
            <bbva-data-visualization-tooltip
              id="${t.reference}"
              class="tooltip-separator"
              .listLegendItems=${i}
              list-simple-size="6"
              ambient="primary-alt"
              @data-visualization-tooltip-title-link-click=${t=>this._redirectPage(t)}
            >
            </bbva-data-visualization-tooltip>
            ${e?n`<bbva-divider-default
                  size="full"
                  class="my-custom-tooltip"
                ></bbva-divider-default>`:""}
          `}))}

        <div class="message-in">
          <bbva-notification-message
            message="card-information-minimum-payment-clarifications-notification-message-box"
            message-title=${o}
            ambient="${this.ambient}"
            book-title=""
          >
          </bbva-notification-message>
        </div>
      </div>
    `}render(){return n` ${this._renderMainContent()} ${this._renderInfoModal} `}}var gt=t`
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

.align-item {
  display: flex;
  align-items: center;
  justify-content: space-between;
  margin-top: 0.5rem;
}

[data-tag-name=bbva-header-category] {
  padding-bottom: 0.5rem;
}
`;class yt extends(A(k(V(e(i))))){static get is(){return"payment-to-not-generate-interest-list-breakdown"}static get scopedElements(){const t=[P,D,w,T,...yt.configurationScopedElements()];return yt.scopedElementsFromClasses(t)}static get styles(){return[y.primary,f.primary,v.primary,B.primary,gt]}static get properties(){return{breakDownTitle:{type:String,attribute:"break-down-title"},breakDownListCapital:{type:Array,attribute:"break-down-list-capital"}}}constructor(){super(),this.ambient="primary",this.breakDownTitle="",this.breakDownListCapital=[],this.language=""}get _renderBreakDownList(){return n` ${this.breakDownListCapital.map((t=>n`
        <div class="align-item">
          ${"text"===t.type?this._renderBreakDownText(t):""}
          ${"link"===t.type?this._renderBreakDownLink(t):""}
        </div>
      `))}`}_renderBreakDownText(t){return n`
      <bbva-type-text inherit ambient="${this.ambient}" text="${t.description}" size="S">
      </bbva-type-text>

      <bbva-type-amount
        ambient="${this.ambient}"
        variant="M"
        amount="${t.amount}"
        currency-code="${t.currency}"
        local-currency="${t.currency}"
        language="${this.language}">
      </bbva-type-amount>
    `}_renderBreakDownLink(t){return n`
      <bbva-type-link
        id="${t.id}"
        ambient="${this.ambient}"
        @click="${this._breakDownTypeLinkClick}"
      >
        ${this.t(t.description)}
      </bbva-type-link>

      <bbva-type-amount
        amount="${t.amount}"
        currency-code="${t.currency}"
        local-currency="${t.currency}"
        ambient="${this.ambient}"
        variant="Amount S"
      >
      </bbva-type-amount>
    `}_breakDownTypeLinkClick(t){this._dispatchCustomEvent("card-information-minimum-payment-clarifications-interest-breakdow-detail",[{label:t.target.id}])}render(){return n`
      <div class="align-item">
        <bbva-header-category
          class="divider-top"
          ambient="${this.ambient}"
          text="${this.breakDownTitle}"
        >
        </bbva-header-category>
      </div>
      ${this._renderBreakDownList}
    `}}var ft=t`
:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--_pay-to-not-generate-interest-bg-color);
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}

[data-tag-name=bbva-transition-container] {
  height: 100%;
}

[data-tag-name=bbva-header-category] {
  --_header-category-heading-color: var(
    --_card-informations-minimum-payment-clarifications-capital-header
  );
  padding-bottom: 0.5rem;
  padding-top: 0.5rem;
}

.container {
  margin-left: 1rem;
  margin-right: 1rem;
}

.align-item {
  display: flex;
  align-items: center;
  justify-content: space-between;
}

.align-list-default-header {
  margin-top: 1rem;
  display: flex;
  flex-direction: column;
  align-items: start;
}
`;class vt extends(A(k(V(e(i))))){static get is(){return"card-information-minimum-payment-clarification-capital"}static get scopedElements(){const t=[T,ut,ht,yt,...vt.configurationScopedElements()];return vt.scopedElementsFromClasses(t)}static get styles(){return[B.primary,ft]}static get properties(){return{ambient:{type:String},_modalVisible:{type:Boolean,state:!0},freePaymentsData:{type:Object},capitalAmount:{type:Number,attribute:"capital-amount"},currency:{type:String},language:{type:String},cardsApiVersion:{type:String,attribute:"cards-api-version"},iosFixedHeader:{type:Boolean,attribute:"ios-fixed-header"}}}constructor(){super(),this.ambient="primary",this.config=st("card-information-minimum-payment-clarifications-capital-header-title","capital-header"),this._modalVisible=!1,this.freePaymentsData={},this.capitalAmount=0,this.currency="",this.language="",this.cardsApiVersion="",this.iosFixedHeader=!1}get _creditValanceBar(){var t,e;return n`
      <bbva-header-category
        has-help
        @header-category-help-click="${this._openModal}"
        ambient="${this.ambient}"
        text="card-information-minimum-payment-clarifications-capital-debt-text"
      >
      </bbva-header-category>

      <payment-to-not-generate-interest-definition-amount
        .totalAmount="${this.capitalAmount}"
        .fromPeriodDate="${null===(t=this.freePaymentsData)||void 0===t?void 0:t.fromPeriodDate}"
        .toPeriodDate="${null===(e=this.freePaymentsData)||void 0===e?void 0:e.toPeriodDate}"
        .currency="${this.currency}"
        .language="${this.language}"
      >
      </payment-to-not-generate-interest-definition-amount>

      <payment-to-not-generate-interest-list-breakdown
        break-down-title="card-information-minimum-payment-clarifications-capital-breakdown-title"
        .breakDownListCapital="${(t=>{const e=t.find((t=>"PREVIOUS_BALANCE"===t.id)),i=t.find((t=>"PAYMENTS"===t.id)),a=t.find((t=>"PURCHASES"===t.id)),n=t.find((t=>"PROMOTIONS"===t.id)),o=t.find((t=>"CASH_DISPOSAL"===t.id));return[{description:"card-information-minimum-payment-clarifications-capital-breakdown-previous-month-debt",type:"text",amount:e.amount.amount,currency:e.amount.currency},{description:"card-information-minimum-payment-clarifications-capital-breakdown-payments-and-credits",type:"text",amount:i.amount.amount,currency:i.amount.currency},{id:a.id,description:"card-information-minimum-payment-clarifications-capital-breakdown-purchases-link",type:"link",amount:a.amount.amount,currency:a.amount.currency},{id:n.id,description:"card-information-minimum-payment-clarifications-capital-breakdown-promotions-link",type:"link",amount:n.amount.amount,currency:n.amount.currency},{id:o.id,description:"card-information-minimum-payment-clarifications-capital-breakdown-cash-disposal-link",type:"link",amount:o.amount.amount,currency:o.amount.currency}]})(this.freePaymentsData.capitals)}"
        .language="${this.language}"
        .cardsApiVersion="${this.cardsApiVersion}"
        @card-information-minimum-payment-clarifications-interest-breakdow-detail="${this._showBreakDownDetails}"
      >
      </payment-to-not-generate-interest-list-breakdown>
    `}_showBreakDownDetails(t){this._dispatchCustomEvent("card-information-minimum-payment-clarifications-show-transactions-detail",t.detail)}_openModal(){this._modalVisible=!0}get _renderPaymentClarificationsModal(){return n`
      <card-information-minimum-payment-clarifications-info-modal
        .iosFixedHeader="${this.iosFixedHeader}"
        header-text="${this.t("card-information-minimum-payment-clarifications-capital-header-text")}"
        body-text="${this.t("card-information-minimum-payment-clarifications-capital-body-text")}"
        ?visible=${this._modalVisible}
        @card-information-minimum-payment-clarifications-card-information-minimum-payment-clarifications-info-modal-close=${()=>{this._modalVisible=!1}}
      >
      </card-information-minimum-payment-clarifications-info-modal>
    `}render(){return n`
      ${super.render()}
      <div class="container">${this._creditValanceBar}</div>
      ${this._renderPaymentClarificationsModal}
    `}}var _t=t`
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

.container {
  margin-left: 1rem;
  margin-right: 1rem;
}

[data-tag-name=bbva-header-category] {
  --_header-category-heading-color: var(
    --_card-informations-minimum-payment-clarifications-interest-header
  );
  padding-bottom: 0.5rem;
  padding-top: 0.5rem;
}
`;class xt extends(A(k(V(e(i))))){static get is(){return"card-information-minimum-payment-clarification-interests"}static get scopedElements(){const t=[T,ut,ht,yt,...xt.configurationScopedElements()];return xt.scopedElementsFromClasses(t)}static get styles(){return[_t]}static get properties(){return{_modalVisible:{type:Boolean,state:!0},_breakDownListInfoVisible:{type:Boolean,state:!0},generalPaymentInfoInterest:{type:Object},totalAmountInterest:{type:Number,attribute:"total-amount-interest"},currency:{type:String},iosFixedHeader:{type:Boolean,attribute:"ios-fixed-header"}}}constructor(){super(),this.ambient="primary",this.config=st("card-information-minimum-payment-clarifications-interest-header-title","interests-header"),this._modalVisible=!1,this._breakDownListInfoVisible=!1,this.generalPaymentInfoInterest={},this.totalAmountInterest=0,this.language="",this.currency="",this.iosFixedHeader=!1}get _renderPaymentClarificationsModal(){return n`
      <card-information-minimum-payment-clarifications-info-modal
        .iosFixedHeader="${this.iosFixedHeader}"
        header-text="${this.t("card-information-minimum-payment-clarifications-interest-info-header-text")}"
        body-text="${this.t("card-information-minimum-payment-clarifications-interest-info-body-text")}"
        ?visible=${this._modalVisible}
        @card-information-minimum-payment-clarifications-card-information-minimum-payment-clarifications-info-modal-close=${()=>{this._modalVisible=!1}}
      >
      </card-information-minimum-payment-clarifications-info-modal>
    `}get _creditValanceBar(){return n`
      <bbva-header-category
        has-help
        @header-category-help-click="${this._openModal}"
        ambient="${this.ambient}"
        text="card-information-minimum-payment-clarifications-interest-debt-text"
      >
      </bbva-header-category>

      <payment-to-not-generate-interest-definition-amount
        .fromPeriodDate="${this.generalPaymentInfoInterest.fromPeriodDate}"
        .toPeriodDate="${this.generalPaymentInfoInterest.toPeriodDate}"
        .totalAmount="${this.totalAmountInterest}"
        .currency="${this.currency}"
        .language="${this.language}"
      >
      </payment-to-not-generate-interest-definition-amount>

      <payment-to-not-generate-interest-list-breakdown
        break-down-title="card-information-minimum-payment-clarifications-interest-breakdown-title"
        .breakDownListCapital="${(t=>{const e=t.find((t=>"PROMO_PERIOD"===t.id)),i=t.find((t=>"CASH_DISPOSAL"===t.id)),a=t.find((t=>"PURCHASES"===t.id)),n=t.find((t=>"EFFECTIVE_INTEREST_RATE"===t.id));return[{description:"card-information-minimum-payment-clarifications-interest-breakdown-promotions",type:"text",amount:e.amount.amount,currency:e.amount.currency},{description:"card-information-minimum-payment-clarifications-interest-breakdown-cash-disposal",type:"text",amount:i.amount.amount,currency:i.amount.currency},{description:"card-information-minimum-payment-clarifications-interest-breakdown-purchases",type:"text",amount:a.amount.amount,currency:a.amount.currency},{description:"card-information-minimum-payment-clarifications-interest-breakdown-effective-interest-rate",type:"text",amount:n.amount.amount,currency:n.amount.currency}]})(this.generalPaymentInfoInterest.interests)}"
        .currency="${this.currency}"
        @payment-to-not-generate-interest-breakdow-detail="${this._showBreakDownDetails}"
      >
      </payment-to-not-generate-interest-list-breakdown>
    `}_showBreakDownDetails(){this._breakDownListInfoVisible=!0}_onClickHeaderMainIconCapitalDetail(){this._breakDownListInfoVisible=!1}_openModal(){this._modalVisible=!0}render(){return n`
      ${super.render()}
      <div class="container">
        ${this._creditValanceBar} ${this._renderPaymentClarificationsModal}
      </div>
    `}}var kt=t`
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

  .container {
    margin-left: 1rem;
    margin-right: 1rem;
  }

  [data-tag-name='bbva-header-category'] {
    --_header-category-heading-color: var(
      --_card-informations-minimum-payment-clarifications-tax-header
    );
    padding-bottom: 0.5rem;
    padding-top: 0.5rem;
  }

  [data-tag-name='card-information-minimum-payment-clarifications-info-modal'] {
    padding: 1rem;
  }
`;class $t extends(A(k(V(e(i))))){static get is(){return"payment-to-not-generate-intesrest-interest-tax-detail"}static get scopedElements(){const t=[T,F,M,z,ut,ht,...$t.configurationScopedElements()];return $t.scopedElementsFromClasses(t)}static get properties(){return{_modalVisible:{type:Boolean,state:!0},generalPaymentInfoTax:{type:Object,attribute:"general-payment-info-tax"},currency:{type:String},iosFixedHeader:{type:Boolean,attribute:"ios-fixed-header"}}}constructor(){super(),this.ambient="primary",this._modalVisible=!1,this.config=st("card-information-minimum-payment-clarifications-tax-header-title","tax-header"),this.language="",this.currency="",this.iosFixedHeader=!1}static get styles(){return[kt]}get _creditValanceBar(){const{taxAmount:t}=rt(this.generalPaymentInfoTax);return n`
      <bbva-header-category
        has-help
        @header-category-help-click="${this._openModal}"
        ambient="${this.ambient}"
        text="card-information-minimum-payment-clarifications-tax-debt-text"
      >
      </bbva-header-category>

      <payment-to-not-generate-interest-definition-amount
        .fromPeriodDate="${this.generalPaymentInfoTax.fromPeriodDate}"
        .toPeriodDate="${this.generalPaymentInfoTax.toPeriodDate}"
        .totalAmount="${t}"
        .currency="${this.currency}"
        .language="${this.language}"
      >
      </payment-to-not-generate-interest-definition-amount>

      <bbva-notification-message
        message="card-information-minimum-payment-clarifications-tax-debt-message"
        message-title=""
        book-title=""
      ></bbva-notification-message>
    `}get _renderPaymentClarificationsModal(){return n`
      <card-information-minimum-payment-clarifications-info-modal
        .iosFixedHeader="${this.iosFixedHeader}"
        secondary-text="${this.t("card-information-minimum-payment-clarifications-tax-debt-body-text-secondary")}"
        header-text="${this.t("card-information-minimum-payment-clarifications-tax-header-title")}"
        title-text="${this.t("card-information-minimum-payment-clarifications-tax-debt-header-text")}"
        body-text="${this.t("card-information-minimum-payment-clarifications-tax-debt-body-text")}"
        ?visible=${this._modalVisible}
        @card-information-minimum-payment-clarifications-card-information-minimum-payment-clarifications-info-modal-close=${()=>{this._modalVisible=!1}}
      >
      </card-information-minimum-payment-clarifications-info-modal>
    `}_openModal(){this._modalVisible=!0}render(){return n`
      ${super.render()}
      <div class="container">
        ${this._creditValanceBar} ${this._renderPaymentClarificationsModal}
      </div>
    `}}var Pt=t`
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

.align-item {
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding-top: 1rem;
  padding-bottom: 1rem;
}

.align-item:active {
  background-color: var(--_payment-to-not-generate-interest-list-detail-date-item-active);
  margin-left: 0;
  margin-right: 0;
}
.align-item:active [data-tag-name=bbva-type-link] {
  margin-left: 1rem;
  color: var(--_payment-to-not-generate-interest-list-detail-date-item-link);
}
.align-item:active [data-tag-name=bbva-type-amount] {
  margin-right: 1rem;
}

[data-tag-name=bbva-header-category] {
  padding-top: 1rem;
  padding-bottom: 1rem;
}

.container {
  margin-left: 1rem;
  margin-right: 1rem;
}
`;class Dt extends(A(k(V(e(i))))){static get is(){return"payment-to-not-generate-interest-list-detail-date"}static get scopedElements(){const t=[T,D,w,E,...Dt.configurationScopedElements()];return Dt.scopedElementsFromClasses(t)}static get styles(){return[B.primary,f.primary,v.primary,I.primary,Pt]}static get properties(){return{typeDateOptions:{type:Object,attribute:"type-date-options"},freePaymentsInfoListDate:{type:Object,attribute:"free-payments-info-list-date"},movements:{type:Array},cardNumber:{type:String,attribute:"card-number"},simpleCode:{type:String,attribute:"simple-code"},firstData:{type:Boolean,attribute:"first-data"},cardsApiVersion:{type:String,attribute:"cards-api-version"}}}constructor(){super(),this.ambient="primary",this.typeDateOptions={day:"2-digit",month:"short",year:"numeric"},this.movements=[],this.cardNumber="",this.language="",this.simpleCode="",this.firstData=!1,this.cardsApiVersion=""}_renderListMovement(){const t=((t,e=!1)=>{let i=[];return i=e?t.slice(0,5):t,i.map((t=>({id:t.id,description:t.description,amount:t.amount.amount,currency:t.amount.currency,operationDate:t.operationDate})))})(this.movements,this.firstData),e=t.reduce(((t,e)=>{const i=e.operationDate;return t[i]||(t[i]=[]),t[i].push(e),t}),{});return n`
      ${Object.keys(e).map((t=>n`
          <div>
            <bbva-header-category
              class="container"
              variant="date"
              font-style-date="italic"
              font-weight-date="500"
              ambient="${this.ambient}"
              date="${t}"
              .options="${this.typeDateOptions}"
            >
            </bbva-header-category>
            ${e[t].map(((t,e,i)=>{return n`
                <div id="items-container" class="align-item container">
                  <bbva-type-link
                    id="${t.id}"
                    ambient="${this.ambient}"
                    @click="${()=>this._handleClick(t)}"
                  >
                    ${a=t.description,a.charAt(0).toUpperCase()+a.slice(1).toLowerCase()}
                  </bbva-type-link>

                  <bbva-type-amount
                    amount="${t.amount}"
                    currency-code="${t.currency}"
                    local-currency="${t.currency}"
                    language="${this.language}"
                    ambient="${this.ambient}"
                    variant="Amount S"
                  >
                  </bbva-type-amount>
                </div>
                <div class="container">
                  ${e<i.length-1?n`<bbva-divider-default></bbva-divider-default>`:""}
                </div>
              `;var a}))}
          </div>
        `))}
    `}_handleClick(t){this._dispatchCustomEvent("card-information-minimum-payment-clarifications-change-api-versions",this.cardsApiVersion),this._dispatchCustomEvent("card-information-minimum-payment-clarifications-card-transaction-detail",{productId:this.simpleCode,transactionId:t.id})}render(){return n` <div>${this._renderListMovement()}</div> `}}var wt=t`
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
  *::before,
  *::after {
    box-sizing: inherit;
  }

  .container {
    margin-left: 1rem;
    margin-right: 1rem;
  }

  [data-tag-name='bbva-header-category'] {
    --_header-category-heading-color: var(
      --_card-informations-minimum-payment-clarifications-commissions-header
    );
    padding-bottom: 0.5rem;
    padding-top: 0.5rem;
  }

  .loader {
    opacity: 1;
    height: 48px;
    margin: 2rem 1rem 1rem;
    background-color: var(--_skeleton-default-bg-color);
    -webkit-mask-image:
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, black 50%, transparent 50%),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, black 50%, transparent 50%);
    mask-image:
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, black 50%, transparent 50%),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, black 50%, transparent 50%);
    -webkit-mask-position:
      0 0,
      100% 0,
      0 30px,
      100% 30px;
    mask-position:
      0 0,
      100% 0,
      0 30px,
      100% 30px;
    -webkit-mask-repeat: no-repeat;
    mask-repeat: no-repeat;
    -webkit-mask-size:
      calc((169px * 2) + (16px / 2)) 16px,
      calc((103px * 2) + (16px / 2)) 16px,
      calc((72px * 2) + (16px / 2)) 16px,
      calc((65px * 2) + (16px / 2)) 16px;
    mask-size:
      calc((169px * 2) + (16px / 2)) 16px,
      calc((103px * 2) + (16px / 2)) 16px,
      calc((72px * 2) + (16px / 2)) 16px,
      calc((65px * 2) + (16px / 2)) 16px;
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
  .loader::after {
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

  .last-item-skeleton .loader {
    margin: 0 0 1rem;
  }
`;class Ct extends(d(A(e(V(i))))){static get is(){return"card-information-minimum-payment-clarification-commisions"}static get scopedElements(){const t=[T,ut,q,ht,Dt,U,...Ct.configurationScopedElements()];return Ct.scopedElementsFromClasses(t)}static get styles(){return[Y.primary,wt]}static get properties(){return{_modalVisible:{type:Boolean,state:!0},movementTypes:{type:Array,attribute:"movement-types"},movementType:{type:String,attribute:"movement-type"},country:{type:String},getFreePaymentsApiVersionTest:{type:String,attribute:"get-free-payments-api-version-test"},cardNumber:{type:String,attribute:"card-number"},_freePaymentsData:{type:Array,state:!0},_commissionsData:{type:Object,state:!0},_commissionsDataMovements:{type:Array,state:!0},_showFlowCommissions:{type:Boolean,state:!0},currency:{type:String},_firstTime:{type:Boolean,state:!0},scrollActivate:{type:Boolean,attribute:"scroll-activate"},_commissionsPaginationResponse:{type:Object,state:!0},_loadingMovementsPagination:{type:Boolean,state:!0},_firstView:{type:Number,state:!0},_showViewAllMovementsButton:{type:Boolean,state:!0},simpleCode:{type:String,attribute:"simple-code"},cardsApiVersion:{type:String,attribute:"cards-api-version"},iosFixedHeader:{type:Boolean,attribute:"ios-fixed-header"}}}constructor(){super(),this.ambient="primary",this._modalVisible=!1,this.config=st("card-information-minimum-payment-clarifications-commissions-header-title","commissions-header"),this.requiredToken="",this.country="",this.getFreePaymentsApiVersionTest="3",this.cardNumber="",this._freePaymentsData=[],this._commissionsData={},this._commissionsDataMovements=[],this._showFlowCommissions=!1,this.currency="",this._firstTime=!0,this.scrollActivate=!1,this._commissionsPaginationResponse={},this._loadingMovementsPagination=!1,this._firstView=5,this._showViewAllMovementsButton=!1,this.simpleCode="",this.cardsApiVersion="",this.iosFixedHeader=!1}firstUpdated(){this._getFreePayments()}updated(t){if(t.has("scrollActivate")&&this.scrollActivate){this._loadingMovementsPagination=!0;mt((()=>this._handleScrollMovementsCommissions()),100)()}t.has("_commissionsData")&&!this.scrollActivate&&(this._commissionsDataMovements=this._commissionsData),t.has("_commissionsData")&&0!==Object.keys(this._commissionsData).length&&this.scrollActivate&&this.updateComplete.then((()=>{var t,e,i,a;const n=null===(t=this._commissionsData)||void 0===t||null===(e=t.movementTypes[0])||void 0===e?void 0:e.details,o=null===(i=this._commissionsDataMovements)||void 0===i||null===(a=i.movementTypes[0])||void 0===a?void 0:a.details.concat(n);this._commissionsDataMovements.movementTypes[0].details=o,this._loadingMovementsPagination=!1,this._dispatchCustomEvent("card-information-minimum-payment-clarifications-commissions-pagination-complete")}))}_handleScrollMovementsCommissions(){if(this._checkMovemetsCommissionsNextPage()){const t=dt(this._commissionsPaginationResponse.links.next);this._getFreePaymentsPagination(t)}}_checkMovemetsCommissionsNextPage(){var t,e;if(0===Object.keys(this._commissionsPaginationResponse).length||!("next"in this._commissionsPaginationResponse.links))return this._loadingMovementsPagination=!1,!1;const i=this._commissionsPaginationResponse,a=(null==i||null===(t=i.links)||void 0===t?void 0:t.next)&&""!==(null==i||null===(e=i.links)||void 0===e?void 0:e.next),n=`&pageSize=${i.pageSize}`;if(a){if(i.links.next.includes("&pageSize=10")){var o,s;const t=null==i||null===(o=i.links)||void 0===o||null===(s=o.next)||void 0===s?void 0:s.replace("&pageSize=10",n);this._commissionsPaginationResponse.links.next=t}return!0}return!1}_getFreePaymentsPagination(t){const e={"card.number":t["card.number"],"movementTypes.id":t["movementTypes.id"],pageSize:t.pageSize,paginationKey:(10*t.paginationKey+1).toString()};this.shadowRoot.querySelector("#freePaymentsDmCommissions").getCardsFinancialStatementsInterestFreePayments(e)}reset(){this.fromPeriodDate="",this.toPeriodDate="",this.movementTypes=[]}_getFreePayments(){this.showLoader();this.shadowRoot.querySelector("#freePaymentsDmCommissions").getCardsFinancialStatementsInterestFreePayments({"card.number":this.cardNumber,"movementTypes.id":"COMMISSIONS"})}get _freePaymentsDmCommissions(){return n`
      <bbva-global-cards-financial-statements-interest-free-payments-api-dm
        id="freePaymentsDmCommissions"
        .host="${this.host}"
        .version="${this.getFreePaymentsApiVersionTest}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        .country="${this.country}"
        @cards-financial-statements-interest-free-payments-api-dm-fetch="${this._handleFreePaymentsCommisions}"
        @cards-financial-statements-interest-free-payments-api-dm-pagination=${this._handlePagination}
        @cards-financial-statements-interest-free-payments-api-dm-fetch-error="${this.handleFreePaymentsErrorCommissions}"
        @api-dm-error="${this.handleFreePaymentsErrorCommissions}"
      >
        >
      </bbva-global-cards-financial-statements-interest-free-payments-api-dm>
    `}_handleFreePaymentsCommisions({detail:t}){if(this._firstTime){const e=t[0];this._commissionsDataMovements=e,this._showFlowCommissions=!0,this.clearLoader()}else{const[e]=t;this._commissionsData=e}}_handlePagination({detail:t}){this._commissionsPaginationResponse=t,this._firstTime?t.totalElements>this._firstView&&(this._showViewAllMovementsButton=!0):this._showViewAllMovementsButton=!1}handleFreePaymentsErrorCommissions(){this._dispatchCustomEvent("card-information-minimum-payment-clarifications-capital-commissions-error")}_renderMainContent(){const{commissionsAmount:t}=rt(this._commissionsDataMovements);return n` <div class="my-custom-tooltip">
      <div class="container">
        <bbva-header-category
          has-help
          @header-category-help-click="${this._openModal}"
          ambient="${this.ambient}"
          text="card-information-minimum-payment-clarifications-commissions-debt-text"
        ></bbva-header-category>

        <payment-to-not-generate-interest-definition-amount
          .fromPeriodDate="${this._commissionsDataMovements.fromPeriodDate}"
          .toPeriodDate="${this._commissionsDataMovements.toPeriodDate}"
          .totalAmount="${t}"
          .currency="${this.currency}"
          .language="${this.language}"
        >
        </payment-to-not-generate-interest-definition-amount>
      </div>
      <payment-to-not-generate-interest-list-detail-date
        .firstData="${this._showViewAllMovementsButton}"
        .movements="${this._commissionsDataMovements.movementTypes[0].details}"
        .language="${this.language}"
        .simpleCode="${this.simpleCode}"
        .cardsApiVersion="${this.cardsApiVersion}"
      >
      </payment-to-not-generate-interest-list-detail-date>
    </div>`}_expandableSection(){return n`
      ${this._showViewAllMovementsButton?n`
            <bbva-expandable-panel
              text-unexpanded="card-information-minimum-payment-clarifications-view-all-panel"
              @expandable-panel-expand="${()=>this._handleExpandablePanel()}"
              ambient="${this.ambient}"
            >
            </bbva-expandable-panel>
          `:s}
      ${this._loadingMovementsPagination?n`
            <div class="last-item-skeleton container">
              <div class="loader"></div>
            </div>
          `:s}
    `}_handleExpandablePanel(){this._showViewAllMovementsButton=!1,this._firstTime=!1}_openModal(){this._modalVisible=!0}get _renderPaymentClarificationsModal(){return n`
      <card-information-minimum-payment-clarifications-info-modal
        secondary-text="${this.t("card-information-minimum-payment-clarifications-comissions-body-text-secondary")}"
        .iosFixedHeader="${this.iosFixedHeader}"
        header-text="${this.t("card-information-minimum-payment-clarifications-comissions-header-text")}"
        body-text="${this.t("card-information-minimum-payment-clarifications-comissions-body-text")}"
        ?visible=${this._modalVisible}
        @card-information-minimum-payment-clarifications-card-information-minimum-payment-clarifications-info-modal-close=${()=>{this._modalVisible=!1}}
      ></card-information-minimum-payment-clarifications-info-modal>
    `}render(){return n`
      ${super.render()} ${this._freePaymentsDmCommissions}
      <div class="modal-container">
        ${this._showFlowCommissions?this._renderMainContent():s}
        ${this._showFlowCommissions?this._expandableSection():s}
      </div>
      ${this._renderPaymentClarificationsModal}
    `}}var St=t`
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

.align-item {
  display: flex;
  align-items: center;
  justify-content: space-between;
  margin-top: 0.5rem;
}

[data-tag-name=bbva-clip-microillustration] {
  padding-top: 1rem;
  padding-bottom: 1rem;
}

[data-tag-name=bbva-type-text] {
  padding-bottom: 0.5rem;
}
`;class At extends(A(k(V(e(i))))){static get is(){return"payment-to-not-generate-interest-empty-pending-movements"}static get scopedElements(){const t=[T,ut,P,L,ht,...At.configurationScopedElements()];return At.scopedElementsFromClasses(t)}static get styles(){return[B.primary,y.primary,H.primary,St]}static get properties(){return{freePaymentsData:{type:Object,attribute:"free-payments-data"},_modalVisible:{type:Boolean},currency:{type:String},iosFixedHeader:{type:Boolean,attribute:"ios-fixed-header"}}}constructor(){super(),this._modalVisible=!1,this.currency="",this.language="",this.iosFixedHeader=!1,this.freePaymentsData={}}reset(){this.generalInfo={}}get _renderEmptyMovements(){var t;return n`
      <bbva-header-category
        variant="default"
        text=${this.t("card-information-minimum-payment-clarifications-main-title")}
        has-help
        @header-category-help-click="${this._openModal}"
        ambient="${this.ambient}"
      >
      </bbva-header-category>

      <payment-to-not-generate-interest-definition-amount
        .fromPeriodDate="${this.freePaymentsData.fromPeriodDate}"
        .toPeriodDate="${this.freePaymentsData.toPeriodDate}"
        .totalAmount="${null===(t=this.freePaymentsData.paymentWithoutInterest)||void 0===t?void 0:t.amount}"
        .currency="${this.currency}"
        .language="${this.language}"
      >
      </payment-to-not-generate-interest-definition-amount>

      <bbva-clip-microillustration microillustration="emptystateday" size="M">
      </bbva-clip-microillustration>
      <bbva-type-text
        inherit
        text="card-information-minimum-payment-clarifications-empty-payment"
        size="3XL"
        font-weight="500"
      >
      </bbva-type-text>
      <bbva-type-text
        inherit
        text="card-information-minimum-payment-clarifications-empty-payment-description"
        size="S"
      >
      </bbva-type-text>
    `}_openModal(){this._modalVisible=!0}get _renderInfoModal(){return n`
      <card-information-minimum-payment-clarifications-info-modal
        .iosFixedHeader="${this.iosFixedHeader}"
        header-text="${this.t("card-information-minimum-payment-clarifications-main-title")}"
        ?visible=${this._modalVisible}
        has-notification
        @card-information-minimum-payment-clarifications-card-information-minimum-payment-clarifications-info-modal-close=${()=>{this._modalVisible=!1}}
      >
      </card-information-minimum-payment-clarifications-info-modal>
    `}render(){return n` ${this._renderEmptyMovements} ${this._renderInfoModal} `}}class Vt extends(e(V(A(i)))){static get scopedElements(){const t=[M,R,L,P];return Vt.scopedElementsFromClasses(t)}static get styles(){return[N.primary,H.primary,y.primary]}static get properties(){return{visible:{type:Boolean}}}constructor(){super(),this.visible=!1,this.reset()}update(t){super.update(t)}reset(){this.visible=!1,this._resetConfig(),this._listeners()}cancelModal(){this._dispatchCustomEvent("card-information-minimum-payment-clarifications-modal-cancel"),this.closeModal()}closeModal(){this.visible=!1}_listeners(){this.addEventListener("header-main-icon-left-primary-click",(t=>{t.stopPropagation()}))}_closeButtonClick(t){t.stopPropagation(),this.cancelModal()}footerButtonClick(){this._dispatchCustomEvent("card-information-minimum-payment-clarifications-acept-error-button-click"),this.shouldTransition&&this.closeModal()}_resetConfig(){Object.assign(this,{bodyText:"",buttonText:"",fullHeight:!1,headerText:"",headerType:"",hideContentPaddingTop:!1,linkText:"",modalType:"info",titleIcon:"",titleText:"",shouldTransition:!1,contentTitle:"",contentMicroillustration:"",contentBody:"",stickyFooter:!1,fixedFooter:!1})}get _modalContent(){return n`
      ${this.contentMicroillustration?n`
            <bbva-clip-microillustration
              size="M"
              ambient="${this.ambient}"
              microillustration="${this.contentMicroillustration}"
            ></bbva-clip-microillustration>
          `:""}
      ${this.contentTitle?n`
            <bbva-type-text
              size="3XL"
              inherit
              font-weight="${h.fontWeight50}"
              ambient="${this.ambient}"
              class="modal-title"
              text="${this.contentTitle}"
            ></bbva-type-text>
          `:""}
      ${this.contentBody?n`
            <bbva-type-text
              size="S"
              inherit
              ambient="${this.ambient}"
              text="${this.contentBody}"
            ></bbva-type-text>
          `:""}
    `}render(){return n`
      ${super.render()}
      <bbva-help-modal
        ambient="${this.ambient}"
        modal-type=${this.modalType}
        header-type="${this.headerType}"
        title-icon="${this.titleIcon}"
        .titleText="${this.titleText}"
        .headerText="${this.headerText}"
        .bodyText="${this.fullHeight?"":this.bodyText}"
        button-text="${this.buttonText}"
        link-text="${this.linkText}"
        ?fixed-footer="${this.fixedFooter}"
        ?sticky-footer="${this.stickyFooter}"
        ?full-height="${this.fullHeight}"
        ?hide-content-padding-top="${this.hideContentPaddingTop}"
        ?visible="${this.visible}"
        @help-modal-footer-button-click="${this.footerButtonClick}"
        @help-modal-header-click="${this._closeButtonClick}"
        @help-modal-veil-click="${this.cancelModal}"
      >
        <div class="content" slot="slot-content">${this._modalContent}</div>
      </bbva-help-modal>
    `}}class Mt extends Vt{static get is(){return"card-information-minimum-payment-clarifications-error-modal"}constructor(){super(),this.configs()}configs(){Object.assign(this,{modalType:"warning",fixedFooter:!0,fullHeight:!0,contentMicroillustration:"error",stickyFooter:!0,contentTitle:this.t("card-information-minimum-payment-clarifications-operation-not-available-title"),headerText:this.t("card-information-minimum-payment-clarifications-main-title"),contentBody:this.t("card-information-minimum-payment-clarifications-operation-not-available-text"),buttonText:this.t("card-information-minimum-payment-clarifications-operation-not-available-button-text")})}footerButtonClick(){super.footerButtonClick()}cancelModal(){this.footerButtonClick(),super.cancelModal()}_changeVisible(t){t.detail&&this.dispatchEvent(new CustomEvent("card-information-minimum-payment-clarifications-error-visible-change",{bubbles:!0,composed:!0}))}}var Ft=t`
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

  .container {
    margin-left: 1rem;
    margin-right: 1rem;
  }

  .loader {
    opacity: 1;
    height: 48px;
    margin: 2rem 1rem 1rem;
    background-color: var(--_skeleton-default-bg-color);
    -webkit-mask-image:
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, black 50%, transparent 50%),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, black 50%, transparent 50%);
    mask-image:
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, black 50%, transparent 50%),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, black 50%, transparent 50%);
    -webkit-mask-position:
      0 0,
      100% 0,
      0 30px,
      100% 30px;
    mask-position:
      0 0,
      100% 0,
      0 30px,
      100% 30px;
    -webkit-mask-repeat: no-repeat;
    mask-repeat: no-repeat;
    -webkit-mask-size:
      calc((169px * 2) + (16px / 2)) 16px,
      calc((103px * 2) + (16px / 2)) 16px,
      calc((72px * 2) + (16px / 2)) 16px,
      calc((65px * 2) + (16px / 2)) 16px;
    mask-size:
      calc((169px * 2) + (16px / 2)) 16px,
      calc((103px * 2) + (16px / 2)) 16px,
      calc((72px * 2) + (16px / 2)) 16px,
      calc((65px * 2) + (16px / 2)) 16px;
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
  .loader::after {
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

  .last-item-skeleton .loader {
    margin: 0 0 1rem;
  }
`;class Tt extends(d(A(e(V(i))))){static get is(){return"card-information-minimum-payment-clarification-capital-purchases"}static get scopedElements(){const t=[U,Dt,ht,q,...Tt.configurationScopedElements()];return Tt.scopedElementsFromClasses(t)}static get styles(){return[Y.primary,Ft]}static get properties(){return{_showFlowPurchases:{type:Boolean,state:!0},country:{type:String},getFreePaymentsApiVersionTest:{type:String,attribute:"get-free-payments-api-version-test"},cardNumber:{type:String,attribute:"card-number"},_purchasesData:{type:Object,state:!0},_purchasesDataMovemnets:{type:Array,state:!0},currency:{type:String},language:{type:String},simpleCode:{type:String,attribute:"simple-code"},_loadingMovementsPagination:{type:Boolean,state:!0},_firstView:{type:Number,state:!0},_showViewAllMovementsButton:{type:Boolean,state:!0},_movementsPagination:{type:Boolean,state:!0},cardsApiVersion:{type:String,attribute:"cards-api-version"},_firstTime:{type:Boolean},scrollActivate:{type:Boolean,attribute:"scroll-activate"},_purchasesPaginationResponse:{type:Object,state:!0}}}constructor(){super(),this.purchaseInfo={},this.headerTitle="",this.ambient="primary",this.amount="",this.config=st("card-information-minimum-payment-clarifications-purchases-header-title","purchase-header"),this._showFlowPurchases=!1,this.host="",this.native=!1,this.requiredToken="",this.country="",this.getFreePaymentsApiVersionTest="3",this.cardNumber="",this._purchasesData={},this._purchasesDataMovemnets=[],this.currency="",this.language="",this.simpleCode="",this._loadingMovementsPagination=!1,this._firstView=5,this._showViewAllMovementsButton=!1,this._movementsPagination=!1,this.cardsApiVersion="",this._firstTime=!0,this.scrollActivate=!1,this._purchasesPaginationResponse={}}firstUpdated(){this._getFreePayments()}updated(t){if(t.has("scrollActivate")&&this.scrollActivate){this._loadingMovementsPagination=!0;mt((()=>this.handleScrollMovementsPurchases()),1e3)()}t.has("_purchasesData")&&!this.scrollActivate&&(this._purchasesDataMovemnets=this._purchasesData),t.has("_purchasesData")&&0!==Object.keys(this._purchasesData).length&&this.scrollActivate&&this.updateComplete.then((()=>{var t,e,i,a;const n=null===(t=this._purchasesData)||void 0===t||null===(e=t.movementTypes[0])||void 0===e?void 0:e.details,o=null===(i=this._purchasesDataMovemnets)||void 0===i||null===(a=i.movementTypes[0])||void 0===a?void 0:a.details.concat(n);this._purchasesDataMovemnets.movementTypes[0].details=o,this._loadingMovementsPagination=!1,this._dispatchCustomEvent("card-information-minimum-payment-clarifications-purchases-pagination-complete")}))}handleScrollMovementsPurchases(){if(this._checkMovemetsPurchasesNextPage()){const t=dt(this._purchasesPaginationResponse.links.next);this._getFreePaymentsPagination(t)}}_checkMovemetsPurchasesNextPage(){var t,e;if(0===Object.keys(this._purchasesPaginationResponse).length||!("next"in this._purchasesPaginationResponse.links))return this._loadingMovementsPagination=!1,!1;const i=this._purchasesPaginationResponse,a=(null==i||null===(t=i.links)||void 0===t?void 0:t.next)&&""!==(null==i||null===(e=i.links)||void 0===e?void 0:e.next),n=`&pageSize=${i.pageSize}`;if(a){if(i.links.next.includes("&pageSize=10")){var o,s;const t=null==i||null===(o=i.links)||void 0===o||null===(s=o.next)||void 0===s?void 0:s.replace("&pageSize=10",n);this._purchasesPaginationResponse.links.next=t}return!0}return!1}_getFreePayments(){this.showLoader();this.shadowRoot.querySelector("#freePaymentsDmPurchases").getCardsFinancialStatementsInterestFreePayments({"card.number":this.cardNumber,"movementTypes.id":"PURCHASES"})}get _freePaymentsDmPurchases(){return n`
      <bbva-global-cards-financial-statements-interest-free-payments-api-dm
        id="freePaymentsDmPurchases"
        .host="${this.host}"
        .version="${this.getFreePaymentsApiVersionTest}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        .country="${this.country}"
        @cards-financial-statements-interest-free-payments-api-dm-fetch="${this._handleFreePaymentsPurchases}"
        @cards-financial-statements-interest-free-payments-api-dm-pagination=${this._handlePaginationPurchases}
        @cards-financial-statements-interest-free-payments-api-dm-fetch-error="${this.handleFreePaymentsErrorPurchases}"
        @api-dm-error="${this.handleFreePaymentsErrorPurchases}"
      >
      </bbva-global-cards-financial-statements-interest-free-payments-api-dm>
    `}_handleFreePaymentsPurchases({detail:t}){if(this._firstTime){const e=t[0];this._purchasesDataMovemnets=e,this._showFlowPurchases=!0,this.clearLoader()}else{const[e]=t;this._purchasesData=e}}_handlePaginationPurchases({detail:t}){this._purchasesPaginationResponse=t,this._firstTime?t.totalElements>this._firstView&&(this._showViewAllMovementsButton=!0):this._showViewAllMovementsButton=!1}handleFreePaymentsErrorPurchases(){this._dispatchCustomEvent("card-information-minimum-payment-clarifications-capital-purchase-error")}_definitionAmount(){const{purchasesAmount:t}=lt(this._purchasesDataMovemnets.capitals);return n`
      <div class="container">
        <payment-to-not-generate-interest-definition-amount
          .fromPeriodDate=${this._purchasesDataMovemnets.fromPeriodDate}
          .toPeriodDate=${this._purchasesDataMovemnets.toPeriodDate}
          .totalAmount=${t}
          .currency=${this.currency}
          .language=${this.language}
        >
        </payment-to-not-generate-interest-definition-amount>
      </div>

      <payment-to-not-generate-interest-list-detail-date
        .firstData="${this._showViewAllMovementsButton}"
        .movements="${this._purchasesDataMovemnets.movementTypes[0].details}"
        .language="${this.language}"
        .simpleCode="${this.simpleCode}"
        .cardsApiVersion="${this.cardsApiVersion}"
      >
      </payment-to-not-generate-interest-list-detail-date>
    `}_expandableSection(){return n`
      ${this._showViewAllMovementsButton?n`
            <bbva-expandable-panel
              text-unexpanded="card-information-minimum-payment-clarifications-view-all-panel"
              @expandable-panel-expand="${()=>this._handleExpandablePanel()}"
            >
            </bbva-expandable-panel>
          `:s}
      ${this._loadingMovementsPagination?n`
            <div class="last-item-skeleton container">
              <div class="loader"></div>
            </div>
          `:s}
    `}_handleExpandablePanel(){this._showViewAllMovementsButton=!1,this._firstTime=!1}_getFreePaymentsPagination(t){const e={"card.number":t["card.number"],"movementTypes.id":t["movementTypes.id"],pageSize:t.pageSize,paginationKey:(10*t.paginationKey+1).toString()};this.shadowRoot.querySelector("#freePaymentsDmPurchases").getCardsFinancialStatementsInterestFreePayments(e)}reset(){this.rewardId="",this.purchaseHistory=[],this.visible=!1}render(){return n`
      ${super.render()} ${this._freePaymentsDmPurchases}
      <div class="modal-container">
        ${this._showFlowPurchases?this._definitionAmount():s}
        ${this._showFlowPurchases?this._expandableSection():s}
      </div>
    `}}var Et=t`
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

  .container {
    margin-left: 1rem;
    margin-right: 1rem;
  }

  .loader {
    opacity: 1;
    height: 48px;
    margin: 2rem 1rem 1rem;
    background-color: var(--_skeleton-default-bg-color);
    -webkit-mask-image:
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, black 50%, transparent 50%),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, black 50%, transparent 50%);
    mask-image:
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, black 50%, transparent 50%),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, black 50%, transparent 50%);
    -webkit-mask-position:
      0 0,
      100% 0,
      0 30px,
      100% 30px;
    mask-position:
      0 0,
      100% 0,
      0 30px,
      100% 30px;
    -webkit-mask-repeat: no-repeat;
    mask-repeat: no-repeat;
    -webkit-mask-size:
      calc((169px * 2) + (16px / 2)) 16px,
      calc((103px * 2) + (16px / 2)) 16px,
      calc((72px * 2) + (16px / 2)) 16px,
      calc((65px * 2) + (16px / 2)) 16px;
    mask-size:
      calc((169px * 2) + (16px / 2)) 16px,
      calc((103px * 2) + (16px / 2)) 16px,
      calc((72px * 2) + (16px / 2)) 16px,
      calc((65px * 2) + (16px / 2)) 16px;
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
  .loader::after {
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

  .last-item-skeleton .loader {
    margin: 0 0 1rem;
  }
`;class Bt extends(d(A(e(V(i))))){static get is(){return"card-information-minimum-payment-clarification-capital-promotions"}static get scopedElements(){const t=[Dt,ht,q,U,...Bt.configurationScopedElements()];return Bt.scopedElementsFromClasses(t)}static get styles(){return[Y.primary,Et]}static get properties(){return{_showFlowPromotions:{type:Boolean,state:!0},totalAmount:{type:Number,attribute:"total-amount"},fromPeriodDate:{type:String,attribute:"from-period-date"},toPeriodDate:{type:String,attribute:"to-period-date"},country:{type:String},getFreePaymentsApiVersionTest:{type:String,attribute:"get-free-payments-api-version-test"},cardNumber:{type:String,attribute:"card-number"},_promotionsData:{type:Object,state:!0},_promotionsDataMovements:{type:Array,state:!0},currency:{type:String,attribute:"currency"},cardsApiVersion:{type:String,attribute:"cards-api-version"},_firstTime:{type:Boolean,state:!0},scrollActivate:{type:Boolean,attribute:"scroll-activate"},_promotionsPaginationResponse:{type:Object,state:!0},_loadingMovementsPagination:{type:Boolean,state:!0},_firstView:{type:Number,state:!0},_showViewAllMovementsButton:{type:Boolean,state:!0},simpleCode:{type:String,attribute:"simple-code"}}}constructor(){super(),this.headerTitle="",this.ambient="primary",this.amount="",this.config=st("card-information-minimum-payment-clarifications-promotions-header-title","promotions-header"),this.totalAmount=0,this.fromPeriodDate="",this.toPeriodDate="",this._showFlowPromotions=!1,this.host="",this.native=!1,this.requiredToken="",this.country="",this.getFreePaymentsApiVersionTest="3",this.cardNumber="",this._promotionsData={},this._promotionsDataMovements=[],this.currency="",this.language="",this.cardsApiVersion="",this._firstTime=!0,this.scrollActivate=!1,this._promotionsPaginationResponse={},this._loadingMovementsPagination=!1,this._firstView=5,this._showViewAllMovementsButton=!1,this.simpleCode=""}firstUpdated(){this._getFreePayments()}updated(t){if(t.has("scrollActivate")&&this.scrollActivate){this._loadingMovementsPagination=!0;mt((()=>this._handleScrollMovementsPromotions()),100)()}t.has("_promotionsData")&&!this.scrollActivate&&(this._promotionsDataMovements=this._purchasesData),t.has("_promotionsData")&&0!==Object.keys(this._promotionsData).length&&this.scrollActivate&&this.updateComplete.then((()=>{var t,e,i,a;const n=null===(t=this._promotionsData)||void 0===t||null===(e=t.movementTypes[0])||void 0===e?void 0:e.details,o=null===(i=this._promotionsDataMovements)||void 0===i||null===(a=i.movementTypes[0])||void 0===a?void 0:a.details.concat(n);this._promotionsDataMovements.movementTypes[0].details=o,this._loadingMovementsPagination=!1,this._dispatchCustomEvent("card-information-minimum-payment-clarifications-capital-promotions-pagination-complete")}))}_handleScrollMovementsPromotions(){if(this._checkMovemetsPromotionsNextPage()){const t=dt(this._promotionsPaginationResponse.links.next);this._getFreePaymentsPagination(t)}}_checkMovemetsPromotionsNextPage(){var t,e;if(0===Object.keys(this._promotionsPaginationResponse).length||!("next"in this._promotionsPaginationResponse.links))return this._loadingMovementsPagination=!1,!1;const i=this._promotionsPaginationResponse,a=(null==i||null===(t=i.links)||void 0===t?void 0:t.next)&&""!==(null==i||null===(e=i.links)||void 0===e?void 0:e.next),n=`&pageSize=${i.pageSize}`;if(a){if(i.links.next.includes("&pageSize=10")){var o,s;const t=null==i||null===(o=i.links)||void 0===o||null===(s=o.next)||void 0===s?void 0:s.replace("&pageSize=10",n);this._promotionsPaginationResponse.links.next=t}return!0}return!1}_getFreePaymentsPagination(t){const e={"card.number":t["card.number"],"movementTypes.id":t["movementTypes.id"],pageSize:t.pageSize,paginationKey:(10*t.paginationKey+1).toString()};this.shadowRoot.querySelector("#freePaymentsDmPromotions").getCardsFinancialStatementsInterestFreePayments(e)}_getFreePayments(){this.showLoader();this.shadowRoot.querySelector("#freePaymentsDmPromotions").getCardsFinancialStatementsInterestFreePayments({"card.number":this.cardNumber,"movementTypes.id":"PROMOTIONS"})}get _freePaymentsDmPromotions(){return n`
      <bbva-global-cards-financial-statements-interest-free-payments-api-dm
        id="freePaymentsDmPromotions"
        .host="${this.host}"
        .version="${this.getFreePaymentsApiVersionTest}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        .country="${this.country}"
        @cards-financial-statements-interest-free-payments-api-dm-fetch="${this._handleFreePaymentsPromotions}"
        @cards-financial-statements-interest-free-payments-api-dm-pagination=${this._handlePaginationPromotions}
        @cards-financial-statements-interest-free-payments-api-dm-fetch-error="${this.handleFreePaymentsErrorPromotions}"
        @api-dm-error="${this.handleFreePaymentsErrorPromotions}"
      >
      </bbva-global-cards-financial-statements-interest-free-payments-api-dm>
    `}_handleFreePaymentsPromotions({detail:t}){if(this._firstTime){const e=t[0];this._promotionsDataMovements=e,this._showFlowPromotions=!0,this.clearLoader()}else{const[e]=t;this._promotionsData=e}}_handlePaginationPromotions({detail:t}){this._promotionsPaginationResponse=t,this._firstTime?t.totalElements>this._firstView&&(this._showViewAllMovementsButton=!0):this._showViewAllMovementsButton=!1}handleFreePaymentsErrorPromotions(){this._dispatchCustomEvent("card-information-minimum-payment-clarifications-capital-promotions-error")}get _mainSection(){const{promotionsAmount:t}=lt(this._promotionsDataMovements.capitals);return n`
      <div class="container">
        <payment-to-not-generate-interest-definition-amount
          .fromPeriodDate=${this._promotionsDataMovements.fromPeriodDate}
          .toPeriodDate=${this._promotionsDataMovements.toPeriodDate}
          .totalAmount=${t}
          .currency=${this.currency}
          .language=${this.language}
        >
        </payment-to-not-generate-interest-definition-amount>
      </div>

      <payment-to-not-generate-interest-list-detail-date
        .firstData="${this._showViewAllMovementsButton}"
        .movements="${this._promotionsDataMovements.movementTypes[0].details}"
        .language="${this.language}"
        .cardsApiVersion="${this.cardsApiVersion}"
        .simpleCode="${this.simpleCode}"
      >
      </payment-to-not-generate-interest-list-detail-date>
    `}_expandableSection(){return n`
      ${this._showViewAllMovementsButton?n`
            <bbva-expandable-panel
              text-unexpanded="card-information-minimum-payment-clarifications-view-all-panel"
              @expandable-panel-expand="${()=>this._handleExpandablePanel()}"
              ambient="${this.ambient}"
            >
            </bbva-expandable-panel>
          `:s}
      ${this._loadingMovementsPagination?n`
            <div class="last-item-skeleton container">
              <div class="loader"></div>
            </div>
          `:s}
    `}_handleExpandablePanel(){this._showViewAllMovementsButton=!1,this._firstTime=!1}reset(){this.rewardId="",this.purchaseHistory=[],this.visible=!1}render(){return n`
      ${super.render()} ${this._freePaymentsDmPromotions}
      <div class="modal-container">
        ${this._showFlowPromotions?this._mainSection:s}
        ${this._showFlowPromotions?this._expandableSection():s}
      </div>
    `}}var zt=t`
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

  .container {
    margin-left: 1rem;
    margin-right: 1rem;
  }

  .loader {
    opacity: 1;
    height: 48px;
    margin: 2rem 1rem 1rem;
    background-color: var(--_skeleton-default-bg-color);
    -webkit-mask-image:
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, black 50%, transparent 50%),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, black 50%, transparent 50%);
    mask-image:
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, black 50%, transparent 50%),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, black 50%, transparent 50%);
    -webkit-mask-position:
      0 0,
      100% 0,
      0 30px,
      100% 30px;
    mask-position:
      0 0,
      100% 0,
      0 30px,
      100% 30px;
    -webkit-mask-repeat: no-repeat;
    mask-repeat: no-repeat;
    -webkit-mask-size:
      calc((169px * 2) + (16px / 2)) 16px,
      calc((103px * 2) + (16px / 2)) 16px,
      calc((72px * 2) + (16px / 2)) 16px,
      calc((65px * 2) + (16px / 2)) 16px;
    mask-size:
      calc((169px * 2) + (16px / 2)) 16px,
      calc((103px * 2) + (16px / 2)) 16px,
      calc((72px * 2) + (16px / 2)) 16px,
      calc((65px * 2) + (16px / 2)) 16px;
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
  .loader::after {
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

  .last-item-skeleton .loader {
    margin: 0 0 1rem;
  }
`;class It extends(d(A(e(V(i))))){static get is(){return"card-information-minimum-payment-clarification-capital-disposal"}static get scopedElements(){const t=[Dt,ht,q,U,...It.configurationScopedElements()];return It.scopedElementsFromClasses(t)}static get styles(){return[Y.primary,zt]}static get properties(){return{ambient:{type:String},_showFlowDisposal:{type:Boolean,state:!0},totalAmount:{type:Number,attribute:"total-amount"},fromPeriodDate:{type:String,attribute:"from-period-date"},toPeriodDate:{type:String,attribute:"to-period-date"},country:{type:String},getFreePaymentsApiVersionTest:{type:String,attribute:"get-free-payments-api-version-test"},cardNumber:{type:String,attribute:"card-number"},_disposalData:{type:Object,state:!0},_disposalDataMovements:{type:Array,state:!0},currency:{type:String},language:{type:String},cardsApiVersion:{type:String,attribute:"cards-api-version"},_firstTime:{type:Boolean,state:!0},scrollActivate:{type:Boolean,attribute:"scroll-activate"},_disposalPaginationResponse:{type:Object,state:!0},_loadingMovementsPagination:{type:Boolean,state:!0},_firstView:{type:Number,state:!0},_showViewAllMovementsButton:{type:Boolean,state:!0},simpleCode:{type:String,attribute:"simple-code"}}}constructor(){super(),this.ambient="primary",this.amount="",this.config=st("card-information-minimum-payment-clarifications-disposal-header-title","disposal-header"),this.totalAmount=0,this.fromPeriodDate="",this.toPeriodDate="",this._showFlowDisposal=!1,this.host="",this.native=!1,this.requiredToken="",this.country="",this.getFreePaymentsApiVersionTest="3",this.cardNumber="",this._disposalData={},this._disposalDataMovements=[],this.currency="",this.language="",this.cardsApiVersion="",this._firstTime=!0,this.scrollActivate=!1,this._disposalPaginationResponse={},this._loadingMovementsPagination=!1,this._firstView=5,this._showViewAllMovementsButton=!1,this.simpleCode=""}firstUpdated(){this._getFreePayments()}updated(t){if(t.has("scrollActivate")&&this.scrollActivate){this._loadingMovementsPagination=!0;mt((()=>this._handleScrollMovementsDisposal()),100)()}t.has("_disposalData")&&!this.scrollActivate&&(this._disposalDataMovements=this._disposalData),t.has("_disposalData")&&0!==Object.keys(this._disposalData).length&&this.scrollActivate&&this.updateComplete.then((()=>{var t,e,i,a;const n=null===(t=this._disposalData)||void 0===t||null===(e=t.movementTypes[0])||void 0===e?void 0:e.details,o=null===(i=this._disposalDataMovements)||void 0===i||null===(a=i.movementTypes[0])||void 0===a?void 0:a.details.concat(n);this._disposalDataMovements.movementTypes[0].details=o,this._loadingMovementsPagination=!1,this._dispatchCustomEvent("card-information-minimum-payment-clarifications-capital-disposal-pagination-complete")}))}_handleScrollMovementsDisposal(){if(this._checkMovemetsDisposalNextPage()){const t=dt(this._disposalPaginationResponse.links.next);this._getFreePaymentsPagination(t)}}_checkMovemetsDisposalNextPage(){var t,e;if(0===Object.keys(this._disposalPaginationResponse).length||!("next"in this._disposalPaginationResponse.links))return this._loadingMovementsPagination=!1,!1;const i=this._disposalPaginationResponse,a=(null==i||null===(t=i.links)||void 0===t?void 0:t.next)&&""!==(null==i||null===(e=i.links)||void 0===e?void 0:e.next),n=`&pageSize=${i.pageSize}`;if(a){if(i.links.next.includes("&pageSize=10")){var o,s;const t=null==i||null===(o=i.links)||void 0===o||null===(s=o.next)||void 0===s?void 0:s.replace("&pageSize=10",n);this._disposalPaginationResponse.links.next=t}return!0}return!1}_getFreePaymentsPagination(t){const e={"card.number":t["card.number"],"movementTypes.id":t["movementTypes.id"],pageSize:t.pageSize,paginationKey:(10*t.paginationKey+1).toString()};this.shadowRoot.querySelector("#freePaymentsDmDisposal").getCardsFinancialStatementsInterestFreePayments(e)}_getFreePayments(){this.showLoader();this.shadowRoot.querySelector("#freePaymentsDmDisposal").getCardsFinancialStatementsInterestFreePayments({"card.number":this.cardNumber,"movementTypes.id":"DIPOSITIONS"})}get _freePaymentsDmDisposal(){return n`
      <bbva-global-cards-financial-statements-interest-free-payments-api-dm
        id="freePaymentsDmDisposal"
        .host="${this.host}"
        .version="${this.getFreePaymentsApiVersionTest}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        .country="${this.country}"
        @cards-financial-statements-interest-free-payments-api-dm-fetch="${this._handleFreePaymentsPromotions}"
        @cards-financial-statements-interest-free-payments-api-dm-pagination=${this._handlePaginationPromotions}
        @cards-financial-statements-interest-free-payments-api-dm-fetch-error="${this.handleFreePaymentsErrorPromotions}"
        @api-dm-error="${this.handleFreePaymentsErrorPromotions}"
      >
        >
      </bbva-global-cards-financial-statements-interest-free-payments-api-dm>
    `}_handleFreePaymentsPromotions({detail:t}){if(this._firstTime){const e=t[0];this._disposalDataMovements=e,this._showFlowDisposal=!0,this.clearLoader()}else{const[e]=t;this._disposalData=e}}_handlePaginationPromotions({detail:t}){this._disposalPaginationResponse=t,this._firstTime?t.totalElements>this._firstView&&(this._showViewAllMovementsButton=!0):this._showViewAllMovementsButton=!1}handleFreePaymentsErrorPromotions(){this._dispatchCustomEvent("card-information-minimum-payment-clarifications-capital-disposal-error")}get _mainSection(){const{cashDisposalAmount:t}=lt(this._disposalDataMovements.capitals);return n`
      <div class="container">
        <payment-to-not-generate-interest-definition-amount
          .fromPeriodDate=${this._disposalDataMovements.fromPeriodDate}
          .toPeriodDate=${this._disposalDataMovements.toPeriodDate}
          .totalAmount=${t}
          .currency=${this.currency}
          .language=${this.language}
        >
        </payment-to-not-generate-interest-definition-amount>
      </div>
      <payment-to-not-generate-interest-list-detail-date
        .firstData="${this._showViewAllMovementsButton}"
        .movements="${this._disposalDataMovements.movementTypes[0].details}"
        .language="${this.language}"
        .cardsApiVersion="${this.cardsApiVersion}"
        .simpleCode="${this.simpleCode}"
      >
      </payment-to-not-generate-interest-list-detail-date>
    `}_expandableSection(){return n`
      ${this._showViewAllMovementsButton?n`
            <bbva-expandable-panel
              text-unexpanded="card-information-minimum-payment-clarifications-view-all-panel"
              @expandable-panel-expand="${()=>this._handleExpandablePanel()}"
              ambient="${this.ambient}"
            >
            </bbva-expandable-panel>
          `:s}
      ${this._loadingMovementsPagination?n`
            <div class="last-item-skeleton container">
              <div class="loader"></div>
            </div>
          `:s}
    `}_handleExpandablePanel(){this._showViewAllMovementsButton=!1,this._firstTime=!1}render(){return n`
      ${super.render()} ${this._freePaymentsDmDisposal}
      <div class="modal-container">
        ${this._showFlowDisposal?this._mainSection:s}
        ${this._showFlowDisposal?this._expandableSection():s}
      </div>
    `}}var Lt=t`
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
    --_pay-to-not-generate-interest-bg-color: var(
      --pay-to-not-generate-interest-bg-color,
      ${u("colorPrimarySurfaceAmbientDefault",b)}
    );
    --_pay-to-not-generate-interest-text-color: var(
      --pay-to-not-generate-interest-text-color,
      ${u("colorPrimaryLocationsPinsTextSelected",b)}
    );
    --bbva-progress-content-z-index: calc(var(--_modal-z-index, 10) + 1);
    background-color: var(--_pay-to-not-generate-interest-bg-color);
    height: 100%;
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

  [data-tag-name='bbva-transition-container'] {
    --bbva-transition-container-padding: 0;
    --bbva-transition-container-padding-bottom: 0;
    --bbva-transition-container-safe-area-inset-top: 0;
    --bbva-transition-container-text-align: normal;
    --bbva-transition-container--custom--primary-ambient--content-bg-color: var(
      --_pay-to-not-generate-interest-bg-color
    );
    height: 100%;
  }

  [data-tag-name='bbva-data-visualization-bar'] {
    margin-top: 0.5rem;
    margin-bottom: 0.5rem;
  }

  [data-tag-name='bbva-header-category'] {
    --_header-category-heading-color: var(--_pay-to-not-generate-interest-text-color);
    padding-bottom: 0.5rem;
    padding-top: 0.5rem;
  }

  .dashboard-container {
    padding-left: 1rem;
    padding-right: 1rem;
  }

  .message-in {
    display: flex;
    flex-direction: column;
    align-items: start;
    margin-bottom: 1rem;
  }

  .range-dates {
    padding-top: 0.5rem;
  }

  .loader {
    opacity: 1;
    height: 48px;
    margin: 2rem 1rem 1rem;
    background-color: var(--_skeleton-default-bg-color);
    -webkit-mask-image:
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, black 50%, transparent 50%),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, black 50%, transparent 50%);
    mask-image:
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, black 50%, transparent 50%),
      linear-gradient(-60deg, transparent 50%, black 50%),
      linear-gradient(-60deg, black 50%, transparent 50%);
    -webkit-mask-position:
      0 0,
      100% 0,
      0 30px,
      100% 30px;
    mask-position:
      0 0,
      100% 0,
      0 30px,
      100% 30px;
    -webkit-mask-repeat: no-repeat;
    mask-repeat: no-repeat;
    -webkit-mask-size:
      calc((169px * 2) + (16px / 2)) 16px,
      calc((103px * 2) + (16px / 2)) 16px,
      calc((72px * 2) + (16px / 2)) 16px,
      calc((65px * 2) + (16px / 2)) 16px;
    mask-size:
      calc((169px * 2) + (16px / 2)) 16px,
      calc((103px * 2) + (16px / 2)) 16px,
      calc((72px * 2) + (16px / 2)) 16px,
      calc((65px * 2) + (16px / 2)) 16px;
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
  .loader::after {
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

  .last-item-skeleton .loader {
    margin: 0 0 1rem 0;
  }
`;class Ht extends(d(A(e(V(i))))){static get is(){return"card-information-minimum-payment-clarifications"}static get scopedElements(){const t=[Mt,ut,O,Tt,Bt,It,j,vt,xt,$t,Ct,At,q,bt,...Ht.configurationScopedElements()];return Ht.scopedElementsFromClasses(t)}static get properties(){return{internetLostConnection:{type:Boolean,attribute:"internet-lost-connection"},_capitalDetailVisible:{type:Boolean,state:!0},_commissionsDetailVisible:{type:Boolean,state:!0},_interestsDetailVisible:{type:Boolean,state:!0},_taxDetailVisible:{type:Boolean,state:!0},_purchasesDetailVisible:{type:Boolean,state:!0},_promotionsDetailVisible:{type:Boolean,state:!0},_cashDisposalDetailVisible:{type:Boolean,state:!0},_withoutPaymentsVisible:{type:Boolean,state:!0},_modalVisible:{type:Boolean,state:!0},_getPaymentsData:{type:Object,state:!0},cardNumber:{type:String,attribute:"card-number"},_showFlow:{type:Boolean,state:!0},_modalExitErrorVisible:{type:Boolean,state:!0},currency:{type:String},_simpleCode:{type:String,state:!0},cardsApiVersion:{type:String,attribute:"cards-api-version"},paymentData:{type:Object,attribute:"payment-data"},_purchasesActivateScroll:{type:Boolean,state:!0},_promotionsActivateScroll:{type:Boolean,state:!0},_disposalActivateScroll:{type:Boolean,state:!0},_commissionsActivateScroll:{type:Boolean,state:!0},porcentageValue:{type:Number,attribute:"porcentage-value"},notificationText:{type:String,attribute:"notification-text"},iosFixedHeader:{type:Boolean,attribute:"ios-fixed-header"}}}constructor(){super(),this.ambient="primary",this.requiredToken="tsec",this.language="",this.currency="",this.country="",this.internetLostConnection=!1,this._capitalDetailVisible=!1,this._commissionsDetailVisible=!1,this._interestsDetailVisible=!1,this._taxDetailVisible=!1,this._purchasesDetailVisible=!1,this._promotionsDetailVisible=!1,this._cashDisposalDetailVisible=!1,this._withoutPaymentsVisible=!1,this._getPaymentsData={},this._modalVisible=!1,this.config={header:{id:"dashboard-header",variant:"first-level-sequential",showLeftIcon:!0,text:"card-information-minimum-payment-clarifications-main-header-title",buttons:[{id:"btn-back",leftIcon:l(),leftIconLabel:"Back",leftIconAriaLabel:"Back",accessibilityText:"Back"},{id:"btn-menu",icon:c(),closeIconLabel:"Menu",closeIconAriaLabel:"Menu",accessibilityText:"Menu"}],"@header-main-icon-click":t=>this._handleHederMainIconClick(t)},loader:!0,notify:!1,back:!0,fixedHeader:!0,className:"dark-blue-bg"},this.freePaymentsApiVersion="",this.host="",this.cardNumber="",this._showFlow=!1,this._modalExitErrorVisible=!1,this._simpleCode="",this.cardsApiVersion="",this.paymentData={},this._purchasesActivateScroll=!1,this._promotionsActivateScroll=!1,this._disposalActivateScroll=!1,this._commissionsActivateScroll=!1,this.porcentageValue=0,this.notificationText="card-information-minimum-payment-clarifications-network-conection-lost",this.iosFixedHeader=!1}static get styles(){return[Lt,a("card-information-minimum-payment-clarifications-shared-styles")]}firstUpdated(){this.showLoader()}updated(t){t.has("_simpleCode")&&""===this._simpleCode&&this.firstUpdated(),t.has("iosFixedHeader")&&this.iosFixedHeader&&this._dispatchCustomEvent("card-information-minimum-payment-clarifications-scroll-hide","scrollAutoOverflow")}reset(){this._capitalDetailVisible=!1,this._commissionsDetailVisible=!1,this._interestsDetailVisible=!1,this._taxDetailVisible=!1,this._purchasesDetailVisible=!1,this._promotionsDetailVisible=!1,this._cashDisposalDetailVisible=!1,this._withoutPaymentsVisible=!1,this._getPaymentsData={},this._modalVisible=!1,this._showFlow=!1,this._modalExitErrorVisible=!1,this._simpleCode="",this.paymentData={},this._purchasesActivateScroll=!1,this._promotionsActivateScroll=!1,this._disposalActivateScroll=!1,this._commissionsActivateScroll=!1,this.porcentageValue=0,this.internetLostConnection=!1}onInternetDisconnection(){this.internetLostConnection=!0}_handleHederMainIconClick(t){0===t.detail.index?this._dispatchCustomEvent("card-information-minimum-payment-clarifications-navigation-ppngi-back",{productId:this.cardNumber}):2===t.detail.index&&this._dispatchCustomEvent("card-information-minimum-payment-clarifications-navigation-ppngi-menu")}init(t){this.cardNumber||(this.cardNumber=t.cardNumber),this._getFreePayments()}_getFreePayments(){this.shadowRoot.querySelector("#freePaymentsDm").getCardsFinancialStatementsInterestFreePayments({"card.number":this.cardNumber})}get _freePaymentsDm(){return n`
      <bbva-global-cards-financial-statements-interest-free-payments-api-dm
        id="freePaymentsDm"
        .host="${this.host}"
        .version="${this.freePaymentsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        .country="${this.country}"
        @cards-financial-statements-interest-free-payments-api-dm-fetch="${this._handleFreePayments}"
        @cards-financial-statements-interest-free-payments-api-dm-fetch-error="${this._handleFreePaymentsError}"
        @api-dm-error="${this._handleFreePaymentsError}"
      >
        >
      </bbva-global-cards-financial-statements-interest-free-payments-api-dm>
    `}_handleFreePayments({detail:t}){var e,i;t.forEach((t=>{this.paymentData=t})),this._getPaymentsData=this.paymentData,this.currency=this._getPaymentsData.paymentWithoutInterest.currency,this._simpleCode=null===(e=this.paymentData)||void 0===e||null===(i=e.card)||void 0===i?void 0:i.number,0===this._getPaymentsData.paymentWithoutInterest.amount&&(this._withoutPaymentsVisible=!0),this._showFlow=!0,this.clearLoader(),this._dispatchCustomEvent("card-information-minimum-payment-clarifications-list-data-loader")}_handleFreePaymentsError(){this._modalExitErrorVisible=!0,this.clearLoader()}get _renderInfoModal(){return n`
      <card-information-minimum-payment-clarifications-info-modal
        .iosFixedHeader="${this.iosFixedHeader}"
        header-text="${this.t("card-information-minimum-payment-clarifications-main-title")}"
        ?visible=${this._modalVisible}
        has-notification
        @card-information-minimum-payment-clarifications-card-information-minimum-payment-clarifications-info-modal-close=${()=>{this._modalVisible=!1}}
      >
      </card-information-minimum-payment-clarifications-info-modal>
    `}get _renderCapitalDetail(){const{capitalAmount:t}=rt(this._getPaymentsData);return n`
      <bbva-transition-container
        id="transition-container-capital"
        header-type="first-level-sequential"
        ?visible=${this._capitalDetailVisible}
        @header-main-icon-click="${t=>this._onClickHeaderMainIconClick(t,"capital")}"
      >
        <div slot="slot-content" class="container">
          <card-information-minimum-payment-clarification-capital
            .iosFixedHeader="${this.iosFixedHeader}"
            ?visible=${this._capitalDetailVisible}
            .freePaymentsData="${this._getPaymentsData}"
            .capitalAmount=${t}
            .language="${this.language}"
            .currency="${this.currency}"
            .simpleCode="${this._simpleCode}"
            .cardsApiVersion="${this.cardsApiVersion}"
            @card-information-minimum-payment-clarifications-show-transactions-detail=${t=>this._transitionPage(t)}
          >
          </card-information-minimum-payment-clarification-capital>
        </div>
      </bbva-transition-container>
    `}get _renderCommissionsDetail(){return n`
      <bbva-transition-container
        id="transition-container-commissions"
        header-type="first-level-sequential"
        ?visible=${this._commissionsDetailVisible}
        @transition-container-close=${()=>{this._commissionsDetailVisible=!1}}
        @transition-container-scroll="${this.handleScrollMovementsCommissions}"
      >
        <div slot="slot-content" class="container">
          <card-information-minimum-payment-clarification-commisions
            .iosFixedHeader="${this.iosFixedHeader}"
            ?visible=${this._commissionsDetailVisible}
            .cardsApiVersion="${this.cardsApiVersion}"
            .cardNumber="${this.cardNumber}"
            .simpleCode="${this._simpleCode}"
            .host="${this.host}"
            .version="${this.freePaymentsApiVersion}"
            ?native="${this.native}"
            .requiredToken="${this.requiredToken}"
            .country="${this.country}"
            .currency="${this.currency}"
            .language="${this.language}"
            .scrollActivate="${this._commissionsActivateScroll}"
            @card-information-minimum-payment-clarifications-capital-commissions-error=${this._handleFreePaymentsError}
            @card-information-minimum-payment-clarifications-commissions-pagination-complete="${()=>{this._commissionsActivateScroll=!1}}"
            @header-main-icon-click="${t=>this._onClickHeaderMainIconClick(t,"commissions")}"
          >
          </card-information-minimum-payment-clarification-commisions>
        </div>
      </bbva-transition-container>
    `}handleScrollMovementsCommissions(){var t;const{scrollTop:e,clientHeight:i}=this._movementsContainerCommissions.shadowRoot.querySelector(".modal-container");e+i>=((null===(t=this._movementsContainerCommissions)||void 0===t?void 0:t.clientHeight)??0)+140&&(this._commissionsActivateScroll=!0)}get _movementsContainerCommissions(){return this.shadowRoot.querySelector("#transition-container-commissions")}get _renderInterestsDetail(){const{interestsAmount:t}=rt(this._getPaymentsData);return n`
      <bbva-transition-container
        id="transition-container-interests"
        header-type="first-level-sequential"
        ?visible=${this._interestsDetailVisible}
        @transition-container-close=${()=>{this._interestsDetailVisible=!1}}
      >
        <div slot="slot-content" class="container">
          <card-information-minimum-payment-clarification-interests
            .iosFixedHeader="${this.iosFixedHeader}"
            ?visible=${this._interestsDetailVisible}
            .generalPaymentInfoInterest="${this._getPaymentsData}"
            .totalAmountInterest="${t}"
            .cardNumber="${this.cardNumber}"
            .host="${this.host}"
            .version="${this.freePaymentsApiVersion}"
            ?native="${this.native}"
            .requiredToken="${this.requiredToken}"
            .country="${this.country}"
            .language="${this.language}"
            .currency="${this.currency}"
            @header-main-icon-click="${t=>this._onClickHeaderMainIconClick(t,"interests")}"
          >
          </card-information-minimum-payment-clarification-interests>
        </div>
      </bbva-transition-container>
    `}get _renderTaxDetail(){return n`
      <bbva-transition-container
        id="transition-container-tax"
        header-type="first-level-sequential"
        ?visible=${this._taxDetailVisible}
        @transition-container-close=${()=>{this._taxDetailVisible=!1}}
      >
        <div slot="slot-content" class="container">
          <payment-to-not-generate-intesrest-interest-tax-detail
            .iosFixedHeader="${this.iosFixedHeader}"
            ?visible=${this._taxDetailVisible}
            .generalPaymentInfoTax="${this._getPaymentsData}"
            .cardNumber="${this.cardNumber}"
            .host="${this.host}"
            .version="${this.freePaymentsApiVersion}"
            ?native="${this.native}"
            .requiredToken="${this.requiredToken}"
            .country="${this.country}"
            .language="${this.language}"
            .currency="${this.currency}"
            @header-main-icon-click="${t=>this._onClickHeaderMainIconClick(t,"tax")}"
          >
          </payment-to-not-generate-intesrest-interest-tax-detail>
        </div>
      </bbva-transition-container>
    `}get _renderLostConnectionNotification(){return n`
      <bbva-notification-status text="${this.notificationText}" status="error">
      </bbva-notification-status>
    `}get _renderDashboard(){var t;const e=null===(t=this._getPaymentsData.paymentWithoutInterest)||void 0===t?void 0:t.amount,i=rt(this._getPaymentsData);return n`
      <div class="dashboard-container">
        <card-information-minimum-payment-clarification-dashboard
          .freePaymentsData="${this._getPaymentsData}"
          .barSectionData="${function(t,e){return[{id:1,currentValue:pt(t,e.capitalAmount),bgColor:"var(--bbva-white-medium-blue, #49A5E6)",accessibilityLabel:"Color one"},{id:2,currentValue:pt(t,e.commissionsAmount),bgColor:"var(--bbva-aqua, #2DCCCD)",accessibilityLabel:"Color two"},{id:3,currentValue:pt(t,e.interestsAmount),bgColor:"var(--bbva-yellow, #F8CD51)",accessibilityLabel:"Color three"},{id:4,currentValue:pt(t,e.taxAmount),bgColor:"var(--bbva-coral, #F35E61)",accessibilityLabel:"Color four"}]}(e,i)}"
          .capitals="${i.capitalAmount}"
          .commissions="${i.commissionsAmount}"
          .interests="${i.interestsAmount}"
          .tax="${i.taxAmount}"
          .language="${this.language}"
          .currency="${this.currency}"
          @card-information-minimum-payment-clarification-dashboard-page-redirect="${t=>this._transitionPage(t)}"
        >
        </card-information-minimum-payment-clarification-dashboard>
      </div>
    `}get _renderVisualContent(){return n`
      ${this.internetLostConnection?this._renderLostConnectionNotification:s}
      ${this._withoutPaymentsVisible?this._renderUserWithoutDebt:this._renderDashboard}
      ${this._capitalDetailVisible?this._renderCapitalDetail:s}
      ${this._commissionsDetailVisible?this._renderCommissionsDetail:s}
      ${this._interestsDetailVisible?this._renderInterestsDetail:s}
      ${this._taxDetailVisible?this._renderTaxDetail:s}
      ${this._purchasesDetailVisible?this._renderPurchases:s}
      ${this._promotionsDetailVisible?this._renderPromotions:s}
      ${this._cashDisposalDetailVisible?this._renderCashDisposal:s}
      ${this._renderInfoModal}
    `}get _renderPurchases(){return n`
      <bbva-transition-container
        id="transition-container-purchases"
        ?visible=${this._purchasesDetailVisible}
        @transition-container-scroll="${this.handleScrollMovementsPurchases}"
      >
        <div slot="slot-content" class="container">
          <card-information-minimum-payment-clarification-capital-purchases
            .iosFixedHeader="${this.iosFixedHeader}"
            id="purchaseContainer"
            .cardNumber="${this.cardNumber}"
            .simpleCode="${this._simpleCode}"
            .host="${this.host}"
            .version="${this.freePaymentsApiVersion}"
            ?native="${this.native}"
            .requiredToken="${this.requiredToken}"
            .country="${this.country}"
            .currency="${this.currency}"
            .language="${this.language}"
            .cardsApiVersion="${this.cardsApiVersion}"
            .scrollActivate="${this._purchasesActivateScroll}"
            @card-information-minimum-payment-clarifications-capital-purchase-error="${this._handleFreePaymentsError}"
            @card-information-minimum-payment-clarifications-purchases-pagination-complete="${()=>{this._purchasesActivateScroll=!1}}"
            @header-main-icon-click="${t=>this._onClickHeaderMainIconClick(t,"purchases")}"
          >
          </card-information-minimum-payment-clarification-capital-purchases>
        </div>
      </bbva-transition-container>
    `}handleScrollMovementsPurchases(){var t;const{scrollTop:e,clientHeight:i}=this._movementsContainerPurchases.shadowRoot.querySelector(".modal-container");e+i>=((null===(t=this._movementsContainerPurchases)||void 0===t?void 0:t.clientHeight)??0)+140&&(this._purchasesActivateScroll=!0)}get _movementsContainerPurchases(){return this.shadowRoot.querySelector("#transition-container-purchases")}get _renderPromotions(){return n`
      <bbva-transition-container
        id="transition-container-promotions"
        ?visible=${this._promotionsDetailVisible}
        @transition-container-scroll="${this.handleScrollMovementsPromotions}"
      >
        <div slot="slot-content" class="container">
          <card-information-minimum-payment-clarification-capital-promotions
            .iosFixedHeader="${this.iosFixedHeader}"
            .cardNumber="${this.cardNumber}"
            .simpleCode="${this._simpleCode}"
            .host="${this.host}"
            .version="${this.freePaymentsApiVersion}"
            ?native="${this.native}"
            .requiredToken="${this.requiredToken}"
            .country="${this.country}"
            .currency="${this.currency}"
            .language="${this.language}"
            .cardsApiVersion="${this.cardsApiVersion}"
            .scrollActivate="${this._promotionsActivateScroll}"
            card-information-minimum-payment-clarifications-capital-promotions-error="${this._handleFreePaymentsError}"
            @card-information-minimum-payment-clarifications-capital-promotions-pagination-complete="${()=>{this._promotionsActivateScroll=!1}}"
            @header-main-icon-click="${t=>this._onClickHeaderMainIconClick(t,"promotions")}"
          >
          </card-information-minimum-payment-clarification-capital-promotions>
        </div>
      </bbva-transition-container>
    `}handleScrollMovementsPromotions(){var t;const{scrollTop:e,clientHeight:i}=this._movementsContainerPromotions.shadowRoot.querySelector(".modal-container");e+i>=((null===(t=this._movementsContainerPromotions)||void 0===t?void 0:t.clientHeight)??0)+140&&(this._promotionsActivateScroll=!0)}get _movementsContainerPromotions(){return this.shadowRoot.querySelector("#transition-container-promotions")}get _renderCashDisposal(){return n`
      <bbva-transition-container
        id="transition-container-cash-disposal"
        ?visible=${this._cashDisposalDetailVisible}
        @transition-container-scroll="${this.handleScrollMovementsDisposal}"
      >
        <div slot="slot-content" class="container">
          <card-information-minimum-payment-clarification-capital-disposal
            .simpleCode="${this._simpleCode}"
            .cardNumber="${this.cardNumber}"
            .host="${this.host}"
            .version="${this.freePaymentsApiVersion}"
            ?native="${this.native}"
            .requiredToken="${this.requiredToken}"
            .country="${this.country}"
            .currency="${this.currency}"
            .language="${this.language}"
            .cardsApiVersion="${this.cardsApiVersion}"
            .scrollActivate="${this._disposalActivateScroll}"
            @card-information-minimum-payment-clarifications-capital-disposal-error="${this._handleFreePaymentsError}"
            @card-information-minimum-payment-clarifications-capital-disposal-pagination-complete="${()=>{this._disposalActivateScroll=!1}}"
            @header-main-icon-click="${t=>this._onClickHeaderMainIconClick(t,"disposal")}"
          >
          </card-information-minimum-payment-clarification-capital-disposal>
        </div>
      </bbva-transition-container>
    `}handleScrollMovementsDisposal(){var t;const{scrollTop:e,clientHeight:i}=this._movementsContainerDisposal.shadowRoot.querySelector(".modal-container");e+i>=((null===(t=this._movementsContainerDisposal)||void 0===t?void 0:t.clientHeight)??0)+140&&(this._disposalActivateScroll=!0)}get _movementsContainerDisposal(){return this.shadowRoot.querySelector("#transition-container-cash-disposal")}get _renderUserWithoutDebt(){return n`
      <div class="dashboard-container">
        <payment-to-not-generate-interest-empty-pending-movements
          .iosFixedHeader="${this.iosFixedHeader}"
          .freePaymentsData=${this._getPaymentsData}
        >
        </payment-to-not-generate-interest-empty-pending-movements>
      </div>
    `}_transitionPage({detail:t}){t.forEach((t=>{"card-information-minimum-payment-clarifications-capital-header-title"===t.label?(this._capitalDetailVisible=!0,this._dispatchCustomEvent("card-information-minimum-payment-clarifications-list-data-capital-loader")):"card-information-minimum-payment-clarifications-commissions-header-title"===t.label?(this._commissionsDetailVisible=!0,this._dispatchCustomEvent("card-information-minimum-payment-clarifications-list-data-commission-loader")):"card-information-minimum-payment-clarifications-interest-header-title"===t.label?(this._interestsDetailVisible=!0,this._dispatchCustomEvent("card-information-minimum-payment-clarifications-list-data-interest-loader")):"card-information-minimum-payment-clarifications-tax-header-title"===t.label?(this._taxDetailVisible=!0,this._dispatchCustomEvent("card-information-minimum-payment-clarifications-list-data-iva-loader")):"PURCHASES"===t.label?(this._purchasesDetailVisible=!0,this._dispatchCustomEvent("card-information-minimum-payment-clarifications-list-data-purchase-loader")):"PROMOTIONS"===t.label?(this._promotionsDetailVisible=!0,this._dispatchCustomEvent("card-information-minimum-payment-clarifications-list-data-promotions-loader")):(this._cashDisposalDetailVisible=!0,this._dispatchCustomEvent("card-information-minimum-payment-clarifications-list-data-disposed-loader"))}))}_onClickHeaderMainIconClick(t,e){2===t.detail.index?this._dispatchCustomEvent("card-information-minimum-payment-clarifications-navigation-ppngi-menu"):"purchases"===e?(this._purchasesDetailVisible=!1,this._capitalDetailVisible=!0):"promotions"===e?(this._promotionsDetailVisible=!1,this._capitalDetailVisible=!0):"disposal"===e?(this._cashDisposalDetailVisible=!1,this._capitalDetailVisible=!0):(this._capitalDetailVisible=!1,this._commissionsDetailVisible=!1,this._interestsDetailVisible=!1,this._taxDetailVisible=!1,this._purchasesDetailVisible=!1)}_handleModalExitErrorClick(){this._dispatchCustomEvent("card-information-minimum-payment-clarifications-error-modal-exit-click",{productId:this.cardNumber}),this._dispatchCustomEvent("card-information-minimum-payment-clarifications-detail-data-refresh"),this._dispatchCustomEvent("card-information-minimum-payment-clarifications-detail-data-refresh-reload"),this._modalExitErrorVisible=!1}get _renderPpngiErrormodal(){return n`
      <card-information-minimum-payment-clarifications-error-modal
        ambient="${this.ambient}"
        ?visible="${this._modalExitErrorVisible}"
        cardNumber="${this.cardNumber}"
        @card-information-minimum-payment-clarifications-acept-error-button-click="${this._handleModalExitErrorClick}"
      >
      </card-information-minimum-payment-clarifications-error-modal>
    `}render(){return n`
      ${super.render()} ${this._freePaymentsDm}
      ${this._showFlow?this._renderVisualContent:s} ${this._renderPpngiErrormodal}
    `}}customElements.define(Ht.is,Ht);class Nt extends(W(i)){static get is(){return"bbva-analyticmanager-card-information-minimum-payment-clarifications"}static get properties(){return{}}paymentClarificationDahsboard(){this._dispatch("analytics-clarifications-payments-dashboard")}paymentClarificationCapital(){this._dispatch("analytics-clarifications-payments-capital",{dashboardSelected:"capital"})}paymentClarificationPurchase(){this._dispatch("analytics-clarifications-payments-purchase",{dashboardSelected:"capital",capitalSelected:"compras"})}paymentClarificationPromotions(){this._dispatch("analytics-clarifications-payments-promotions",{dashboardSelected:"capital",capitalSelected:"promociones"})}paymentClarificationDisposed(){this._dispatch("analytics-clarifications-payments-disposed",{dashboardSelected:"capital",capitalSelected:"disposicion de efectivo"})}paymentClarificationCommissions(){this._dispatch("analytics-clarifications-payments-commission",{dashboardSelected:"comisiones"})}paymentClarificationInterest(){this._dispatch("analytics-clarifications-payments-interest",{dashboardSelected:"intereses"})}paymentClarificationIva(){this._dispatch("analytics-clarifications-payments-iva",{dashboardSelected:"iva"})}}customElements.define(Nt.is,Nt);
