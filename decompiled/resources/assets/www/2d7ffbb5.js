import{z as e,an as t,L as r,ak as o,h as s,ap as a,bx as i,i as l}from"./952f98a9.js";import{v as n,w as p,e as c,K as b,Q as m,G as d,R as g,S as v,u,D as y}from"./216055dc.js";import{aH as _}from"./7f3d7ca9.js";import"./c0a2f832.js";import"./cae0f1de.js";var f=e`:host {
  display: block;
  box-sizing: border-box;
}

.titlePadding {
  padding: 20px 0;
}

.stepsPadding {
  padding: 15px 0;
}

.messageMargin {
  margin: 15px 0 25px;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class h extends(n(t(p(r)))){static get is(){return"bbva-widget-product-detail-sustainable-loans"}static get scopedElements(){return{"bbva-help-modal":c,"bbva-clip-microillustration":b,"bbva-list-bullet":_,"bbva-notification-message":m,"bbva-type-text":d}}static get properties(){return{listInfo:{type:Array},tipsInfo:{type:Array},modalOpenMoreInfo:{type:Boolean}}}constructor(){super(),this.modalOpenMoreInfo=!1,this.listInfo=[this.t("modal_sustainable_loan_bullet_one_improve_rate"),this.t("modal_sustainable_loan_bullet_two_improve_rate")],this.tipsInfo=[this.t("modal_sustainable_loan_step_one_improve_rate"),this.t("modal_sustainable_loan_step_two_improve_rate"),this.t("modal_sustainable_loan_step_three_improve_rate"),this.t("modal_sustainable_loan_step_four_improve_rate")]}static get styles(){return[f,o("bbva-sustainable-loan-modal-shared-styles")]}openModal(){this.modalOpenMoreInfo=!this.modalOpenMoreInfo}_typeTextTitle(){return s`
      <bbva-type-text
        class="listInfo titlePadding"
        tag="span"
        text="${this.t("modal_sustainable_loan_title_improve_rate")}"
        size="2XL"
        font-weight="700"
      ></bbva-type-text>
    `}_typeTextSteps(){return s`<bbva-type-text
      class="listInfo stepsPadding"
      tag="span"
      text="${this.t("modal_sustainable_loan_steps_improve_rate")}"
      >
      </bbva-type-text>`}_bulletInfo(){return this.listInfo.map((e=>s`
        <bbva-list-bullet>${this.t(e)}</bbva-list-bullet>
      `))}_listBulletNumer(){return this.tipsInfo.map(((e,t)=>s`
        <bbva-list-bullet
        variant="subdued"
        ordered
        role="listitem"
        value="${t+1}"
        text="${this.t(e)}"
        ></bbva-list-bullet>
      `))}_notificationMessage(){return s`<bbva-notification-message
      class="messageMargin"
      size="M"
      variant="caution"
      >${this.t("modal_sustainable_loan_note_improve_rate")}
      </bbva-notification-message>`}static _microillustrationFiles(){return s`<bbva-clip-microillustration 
            microillustration="uploadfiles" size="M">
          </bbva-clip-microillustration>`}render(){return s`
      <bbva-help-modal
        fixed-footer
        ?full-height="${!0}"
        header-text="${this.t("modal_sustainable_loan_header_improve_rate")}"
        ?visible="${this.modalOpenMoreInfo}"
        ?hidden="${!this.modalOpenMoreInfo}"
        icon-right-secondary="bbvaClose()"
        @help-modal-close="${()=>{this.modalOpenMoreInfo=!this.modalOpenMoreInfo}}"
        @help-modal-header-right-secondary-click="${()=>{this.modalOpenMoreInfo=!this.modalOpenMoreInfo}}">
        <div slot="slot-content">
          ${h._microillustrationFiles()}
          ${this._typeTextTitle()}
          ${this._bulletInfo()}
          ${this._typeTextSteps()}      
          ${this._listBulletNumer()}      
          ${this._notificationMessage()}
        </div>
      </bbva-help-modal>`}}customElements.define(h.is,h);var x=e`
:host {
  --_skeleton-default-bg-color: var(--bbva-skeleton-default--_ambient--bg-color, var(--bbva-skeleton-default--custom--primary-ambient--bg-color, var(--color-primary-surface-ambient-preloading,#ffffff)));
  --_skeleton-default-animated-bg-color: var(--bbva-skeleton-default--_ambient--animated-bg-color, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color, var(--color-primary-surface-ambient-default,#f4f4f4)));
  --_skeleton-default-bg-color-alt: var(--bbva-skeleton-default--_ambient--bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--bg-color-alt, var(--color-primary-surface-alternative-preloading,#e9e9e9)));
  --_skeleton-default-animated-bg-color-alt: var(--bbva-skeleton-default--_ambient--animated-bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color-alt, var(--color-primary-surface-alternative-default,#ffffff)));
}

:host {
  position: relative;
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

.gradient.left::before, .gradient.right::after {
  position: absolute;
  top: 0;
  left: 0;
  width: 3.125rem;
  height: 100%;
  background-image: linear-gradient(to right, var(--_progress-step-gradient-color) 0%, rgba(255, 255, 255, 0) 100%);
  content: "";
  pointer-events: none;
}
.gradient.right::after {
  right: 0;
  left: auto;
  transform: rotate(180deg);
}

.steps {
  position: relative;
  display: flex;
  justify-content: space-between;
  padding: 0;
  margin: 0;
  gap: 0.5rem;
  list-style: none;
  overflow-x: auto;
  scrollbar-width: none;
}
.steps::-webkit-scrollbar {
  display: none;
}

.content {
  --_progress-step-color: var(--_progress-step-pending-color);
  --_progress-step-line-color: var(--_progress-step-pending-line-color);
  --_progress-step-text-color: var(--_progress-step-pending-text-color);
  position: relative;
  display: flex;
  width: calc(100% / var(--_items-in-view));
  flex: none;
  flex-direction: column;
  align-items: center;
  padding: 0;
  color: var(--_progress-step-text-color);
  text-align: center;
}
.content [data-tag-name=bbva-type-text] {
  color: var(--_progress-step-pending-text-color);
}
.content::before {
  position: absolute;
  top: 0.25rem;
  left: calc(50% + 8px);
  width: calc(100% - 8px);
  height: 0.0625rem;
  background: var(--_progress-step-line-color);
  content: "";
}
.content:last-of-type::before {
  display: none;
}

.completed {
  --_progress-step-color: var(--_progress-step-completed-color);
  --_progress-step-line-color: var(--_progress-step-completed-line-color);
  --_progress-step-text-color: var(--_progress-step-completed-text-color);
}
.completed [data-tag-name=bbva-type-text] {
  color: var(--_progress-step-completed-text-color);
}

.error {
  --_progress-step-color: var(--_progress-step-error-color);
  --_progress-step-text-color: var(--_progress-step-completed-text-color);
}
.error [data-tag-name=bbva-type-text] {
  color: var(--_progress-step-completed-text-color);
}

.circle {
  position: relative;
  width: 0.5rem;
  height: 0.5rem;
  box-sizing: content-box;
  border-radius: 50%;
  background-color: var(--_progress-step-color);
}

.title {
  display: grid;
  margin-top: 0.5rem;
}

.subtitle {
  display: grid;
}

:host([loading]) .circle {
  background-color: var(--_progress-step-skeleton-color);
}
:host([loading]) .content::before {
  background-color: var(--_progress-step-skeleton-color);
}
:host([loading]) .content:last-of-type::before {
  display: flex;
}
:host([loading]) .content:first-of-type::after {
  position: absolute;
  top: 0.25rem;
  right: calc(50% + 8px);
  width: 100%;
  height: 0.0625rem;
  background-color: var(--_progress-step-skeleton-color);
  content: "";
}
:host([loading]) .skeleton {
  width: 100%;
  height: 3.75rem;
  background-color: var(--_skeleton-default-bg-color);
  mask-image: linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%);
  mask-position: calc(50% + 15px) 12px, calc(50% + 36px) 36px;
  mask-repeat: no-repeat;
  mask-size: calc((30px * 2) + (16px/ 2)) 16px, calc((72px * 2) + (16px/ 2)) 16px;
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
:host([loading]) .skeleton::after {
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
`,$=e`
:host {
  --_progress-step-circle-border-color:
    var(--bbva-progress-step--_ambient--circle-border-color,
      var(--bbva-progress-step--custom--primary-ambient--circle-border-color,
        ${g("colorPrimarySurfaceAmbientDefault",v)}));
  --_progress-step-pending-color:
    var(--bbva-progress-step--_ambient--pending-color,
      var(--bbva-progress-step--custom--primary-ambient--pending-color,
        ${g("colorPrimaryProcessPending",v)}));
  --_progress-step-pending-line-color:
    var(--bbva-progress-step--_ambient--pending-line-color,
      var(--bbva-progress-step--custom--primary-ambient--pending-line-color,
        ${g("colorPrimaryFormatDivider",v)}));
  --_progress-step-pending-text-color:
    var(--bbva-progress-step--_ambient--pending-text-color,
      var(--bbva-progress-step--custom--primary-ambient--pending-text-color,
      ${g("colorPrimaryText02Default",v)}));
  --_progress-step-completed-color:
    var(--bbva-progress-step--_ambient--completed-color,
      var(--bbva-progress-step--custom--primary-ambient--completed-color,
        ${g("colorPrimaryProcessCompleted",v)}));
  --_progress-step-completed-line-color:
    var(--bbva-progress-step--_ambient--completed-line-color,
      var(--bbva-progress-step--custom--primary-ambient--completed-line-color,
        ${g("colorPrimaryProcessCompleted",v)}));
  --_progress-step-completed-text-color:
    var(--bbva-progress-step--_ambient--completed-text-color,
      var(--bbva-progress-step--custom--primary-ambient--completed-text-color,
        ${g("colorPrimaryText01Default",v)}));
  --_progress-step-error-color:
    var(--bbva-progress-step--_ambient--error-color,
      var(--bbva-progress-step--custom--primary-ambient--error-color,
        ${g("colorPrimaryProcessAlert",v)}));
  --_progress-step-gradient-color:
    var(--bbva-progress-step--_ambient--gradient-color,
      var(--bbva-progress-step--custom--primary-ambient--gradient-color,
        ${g("colorPrimarySurfaceAmbientDefault",v)}));
  --_progress-step-color:
  var(--bbva-progress-step--_ambient--color,
    var(--bbva-progress-step--custom--primary-ambient--color,
      ${g("colorPrimaryProcessPending",v)}));
  --_progress-step-skeleton-color:
    var(--bbva-progress-step--_ambient--skeleton-color,
      var(--bbva-progress-step--custom--primary-ambient--skeleton-color,
        ${g("colorPrimarySurfaceAmbientPreloading",v)}));
  --_progress-step-skeleton-animated-layer-bg-color:
    var(--bbva-progress-step--_ambient--skeleton-animated-layer-bg-color,
      var(--bbva-progress-step--custom--primary-ambient--skeleton-animated-layer-bg-color,
        ${g("colorPrimarySurfaceAmbientDefault",v)}));
}
`;const k=e`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-progress-step--_ambient--circle-border-color: initial;
    --bbva-progress-step--_ambient--color: initial;
    --bbva-progress-step--_ambient--pending-color: initial;
    --bbva-progress-step--_ambient--pending-line-color: initial;
    --bbva-progress-step--_ambient--pending-text-color: initial;
    --bbva-progress-step--_ambient--gradient-color: initial;
    --bbva-progress-step--_ambient--skeleton-color: initial;
    --bbva-progress-step--_ambient--completed-color: initial;
    --bbva-progress-step--_ambient--completed-line-color: initial;
    --bbva-progress-step--_ambient--completed-text-color: initial;
    --bbva-progress-step--_ambient--error-color: initial;
    --bbva-progress-step--_ambient--skeleton-animated-layer-bg-color: initial;
  }
`,P=e`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-progress-step--_ambient--circle-border-color: var(
      --bbva-progress-step--custom--primary-alt-ambient--circle-border-color,
      ${g("colorPrimaryAltSurfaceAmbientDefault",v)}
    );
    --bbva-progress-step--_ambient--color: var(
      --bbva-progress-step--custom--primary-alt-ambient--color,
      ${g("colorPrimaryAltProcessPending",v)}
    );
    --bbva-progress-step--_ambient--pending-color: var(
      --bbva-progress-step--custom--primary-alt-ambient--pending-color,
      ${g("colorPrimaryAltProcessPending",v)}
    );
    --bbva-progress-step--_ambient--pending-line-color: var(
      --bbva-progress-step--custom--primary-alt-ambient--pending-line-color,
      ${g("colorPrimaryAltFormatDivider",v)}
    );
    --bbva-progress-step--_ambient--pending-text-color: var(
      --bbva-progress-step--custom--primary-alt-ambient--pending-text-color,
      ${g("colorPrimaryAltText02Default",v)}
    );
    --bbva-progress-step--_ambient--gradient-color: var(
      --bbva-progress-step--custom--primary-alt-ambient--gradient-color,
      ${g("colorPrimaryAltSurfaceAmbientDefault",v)}
    );
    --bbva-progress-step--_ambient--skeleton-color: var(
      --bbva-progress-step--custom--primary-alt-ambient--skeleton-color,
      ${g("colorPrimaryAltSurfaceAmbientPreloading",v)}
    );
    --bbva-progress-step--_ambient--completed-color: var(
      --bbva-progress-step--custom--primary-alt-ambient--completed-color,
      ${g("colorPrimaryAltProcessCompleted",v)}
    );

    --bbva-progress-step--_ambient--completed-line-color: var(
      --bbva-progress-step--custom--primary-alt-ambient--completed-line-color,
      ${g("colorPrimaryAltProcessCompleted",v)}
    );
    --bbva-progress-step--_ambient--completed-text-color: var(
      --bbva-progress-step--custom--primary-alt-ambient--completed-text-color,
      ${g("colorPrimaryAltText01Default",v)}
    );
    --bbva-progress-step--_ambient--error-color: var(
      --bbva-progress-step--custom--primary-alt-ambient--error-color,
      ${g("colorPrimaryAltProcessAlert",v)}
    );
    --bbva-progress-step--_ambient--skeleton-animated-layer-bg-color: var(
      --bbva-progress-step--custom--primary-alt-ambient--skeleton-animated-layer-bg-color,
      ${g("colorPrimaryAltSurfaceAmbientDefault",v)}
    );
  }
`,S=e`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-progress-step--_ambient--circle-border-color: var(
      --bbva-progress-step--custom--secondary-ambient--circle-border-color,
      ${g("colorSecondarySurfaceAmbientDefault",v)}
    );
    --bbva-progress-step--_ambient--color: var(
      --bbva-progress-step--custom--secondary-ambient--color,
      ${g("colorSecondaryProcessPending",v)}
    );
    --bbva-progress-step--_ambient--pending-color: var(
      --bbva-progress-step--custom--secondary-ambient--pending-color,
      ${g("colorSecondaryProcessPending",v)}
    );
    --bbva-progress-step--_ambient--pending-line-color: var(
      --bbva-progress-step--custom--secondary-ambient--pending-line-color,
      ${g("colorSecondaryFormatDivider",v)}
    );
    --bbva-progress-step--_ambient--pending-text-color: var(
      --bbva-progress-step--custom--secondary-ambient--pending-text-color,
      ${g("colorSecondaryText02Default",v)}
    );
    --bbva-progress-step--_ambient--gradient-color: var(
      --bbva-progress-step--custom--secondary-ambient--gradient-color,
      ${g("colorSecondarySurfaceAmbientDefault",v)}
    );
    --bbva-progress-step--_ambient--skeleton-color: var(
      --bbva-progress-step--custom--secondary-ambient--skeleton-color,
      ${g("colorSecondarySurfaceAmbientPreloading",v)}
    );
    --bbva-progress-step--_ambient--completed-color: var(
      --bbva-progress-step--custom--secondary-ambient--completed-color,
      ${g("colorSecondaryProcessCompleted",v)}
    );

    --bbva-progress-step--_ambient--completed-line-color: var(
      --bbva-progress-step--custom--secondary-ambient--completed-line-color,
      ${g("colorSecondaryProcessCompleted",v)}
    );
    --bbva-progress-step--_ambient--completed-text-color: var(
      --bbva-progress-step--custom--secondary-ambient--completed-text-color,
      ${g("colorSecondaryText01Default",v)}
    );
    --bbva-progress-step--_ambient--error-color: var(
      --bbva-progress-step--custom--secondary-ambient--error-color,
      ${g("colorSecondaryProcessAlert",v)}
    );
    --bbva-progress-step--_ambient--skeleton-animated-layer-bg-color: var(
      --bbva-progress-step--custom--secondary-ambient--skeleton-animated-layer-bg-color,
      ${g("colorSecondarySurfaceAmbientDefault",v)}
    );
  }
`,A=e`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-progress-step--_ambient--circle-border-color: var(
      --bbva-progress-step--custom--secondary-alt-ambient--circle-border-color,
      ${g("colorSecondaryAltSurfaceAmbientDefault",v)}
    );
    --bbva-progress-step--_ambient--color: var(
      --bbva-progress-step--custom--secondary-alt-ambient--color,
      ${g("colorSecondaryAltProcessPending",v)}
    );
    --bbva-progress-step--_ambient--pending-color: var(
      --bbva-progress-step--custom--secondary-alt-ambient--pending-color,
      ${g("colorSecondaryAltProcessPending",v)}
    );
    --bbva-progress-step--_ambient--pending-line-color: var(
      --bbva-progress-step--custom--secondary-alt-ambient--pending-line-color,
      ${g("colorSecondaryAltFormatDivider",v)}
    );
    --bbva-progress-step--_ambient--pending-text-color: var(
      --bbva-progress-step--custom--secondary-alt-ambient--pending-text-color,
      ${g("colorSecondaryAltText02Default",v)}
    );
    --bbva-progress-step--_ambient--gradient-color: var(
      --bbva-progress-step--custom--secondary-alt-ambient--gradient-color,
      ${g("colorSecondaryAltSurfaceAmbientDefault",v)}
    );
    --bbva-progress-step--_ambient--skeleton-color: var(
      --bbva-progress-step--custom--secondary-alt-ambient--skeleton-color,
      ${g("colorSecondaryAltSurfaceAmbientPreloading",v)}
    );
    --bbva-progress-step--_ambient--completed-color: var(
      --bbva-progress-step--custom--secondary-alt-ambient--completed-color,
      ${g("colorSecondaryAltProcessCompleted",v)}
    );
    --bbva-progress-step--_ambient--completed-line-color: var(
      --bbva-progress-step--custom--secondary-alt-ambient--completed-line-color,
      ${g("colorSecondaryAltProcessCompleted",v)}
    );
    --bbva-progress-step--_ambient--completed-text-color: var(
      --bbva-progress-step--custom--secondary-alt-ambient--completed-text-color,
      ${g("colorSecondaryAltText01Default",v)}
    );
    --bbva-progress-step--_ambient--error-color: var(
      --bbva-progress-step--custom--secondary-alt-ambient--error-color,
      ${g("colorSecondaryAltProcessAlert",v)}
    );
    --bbva-progress-step--_ambient--skeleton-animated-layer-bg-color: var(
      --bbva-progress-step--custom--secondary-alt-ambient--skeleton-animated-layer-bg-color,
      ${g("colorSecondaryAltSurfaceAmbientDefault",v)}
    );
  }
`;const w=u([Object.freeze({__proto__:null,primary:k,primaryAlt:P,secondary:S,secondaryAlt:A}),y]),D=Object.values(w);class I extends(n(a(t(p(r))))){static get is(){return"bbva-progress-step"}static get scopedElements(){return{"bbva-type-text":d}}static get properties(){return{steps:{type:Array},stepsInView:{type:Number,attribute:"steps-in-view"},statusText:{type:Object,attribute:"status-text"},_availableScroll:{type:String},loading:{type:Boolean,reflect:!0}}}constructor(){super(),this.steps=[],this.stepsInView=3,this.statusText={completed:"bbva-progress-step-completed",pending:"bbva-progress-step-pending",error:"bbva-progress-step-error"},this.loading=!1}firstUpdated(e){super.firstUpdated(e),this._steps=this.shadowRoot.querySelector(".steps"),this._onStepsScroll()}get _scrollable(){return this.steps.length>this.stepsInView}static get styles(){return[i("ol:focus"),super.styles,x,$,D,o("bbva-progress-step-shared-styles")]}render(){return s`
      ${this.loading?s`
            <div class="steps" style="--_items-in-view: 3">
              <div class="content ">
                <span class="circle"> </span>
                <div class="skeleton"></div>
              </div>
              <div class="content ">
                <span class="circle"> </span>
                <div class="skeleton"></div>
              </div>
              <div class="content ">
                <span class="circle"> </span>
                <div class="skeleton"></div>
              </div>
            </div>
            <div class="gradient left right"></div>
          `:s` <div class="container">
            <ol
              class="steps"
              style="--_items-in-view: ${this.stepsInView}"
              @scroll="${this._onStepsScroll}"
              tabindex="${l(this._scrollable?"0":void 0)}"
            >
              ${this.steps.map((e=>s`
                    <li class="content ${e.status}">
                      <span class="circle">
                        <span class="sr-only">${this.t(this.statusText[e.status])}</span>
                      </span>
                      <bbva-type-text
                        class="title"
                        unset
                        alignment="center"
                        .text=${e.title}
                        size="S"
                        font-weight="500"
                        .ellipsis=${e.titleEllipsisLines&&e.titleEllipsisLines>0}
                        .lines=${e.titleEllipsisLines}
                      ></bbva-type-text>
                      <bbva-type-text
                        class="subtitle"
                        unset
                        alignment="center"
                        .text=${e.subtitle}
                        size="S"
                        .ellipsis=${e.subtitleEllipsisLines&&e.subtitleEllipsisLines>0}
                        .lines=${e.subtitleEllipsisLines}
                      ></bbva-type-text>
                    </li>
                  `))}
            </ol>
            <div class="${this._scrollable?"gradient":""} ${this._availableScroll}"></div>
          </div>`}
    `}_onStepsScroll(){const{scrollLeft:e,scrollWidth:t,offsetWidth:r}=this._steps;this._availableScroll=0!==e?e+r>=t?"left":"left right":"right"}}customElements.define(I.is,I);
