import{z as e,an as t,L as a,ak as r,h as i,i as l,bF as o,aV as n}from"./952f98a9.js";import{R as s,S as b,u as c,D as m,z as f,a3 as d,v as p,H as g,G as v,a4 as h}from"./216055dc.js";var y=e`
:host {
  --_skeleton-default-bg-color: var(--bbva-skeleton-default--_ambient--bg-color, var(--bbva-skeleton-default--custom--primary-ambient--bg-color, var(--color-primary-surface-ambient-preloading,#ffffff)));
  --_skeleton-default-animated-bg-color: var(--bbva-skeleton-default--_ambient--animated-bg-color, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color, var(--color-primary-surface-ambient-default,#f4f4f4)));
  --_skeleton-default-bg-color-alt: var(--bbva-skeleton-default--_ambient--bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--bg-color-alt, var(--color-primary-surface-alternative-preloading,#e9e9e9)));
  --_skeleton-default-animated-bg-color-alt: var(--bbva-skeleton-default--_ambient--animated-bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color-alt, var(--color-primary-surface-alternative-default,#ffffff)));
}

:host {
  position: relative;
  display: block;
  width: 100%;
  height: 5.5rem;
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
  margin: 0 1rem;
}

.filters {
  display: flex;
  width: 100%;
  box-sizing: border-box;
  padding: 0.5rem 0 0.75rem 1rem;
  margin: 0;
  list-style: none;
  -webkit-overflow-scrolling: touch;
  overflow-x: auto;
  scrollbar-width: none;
}
.filters::-webkit-scrollbar {
  display: none;
}

.tag-clear-all {
  display: flex;
  min-width: fit-content;
  align-items: center;
  margin-right: 0.5rem;
}

.tag {
  display: flex;
  min-width: 3.5rem;
  max-width: fit-content;
  height: 2rem;
  flex: 1 0 fit-content;
  flex-direction: row;
  align-items: center;
  justify-content: center;
  padding: 0.5rem;
  border-radius: 0.0625rem;
  margin-left: 0.5rem;
  background-color: var(--_form-filter-tag-bg-color);
  gap: 0.5rem;
}
.tag [data-tag-name=bbva-type-link] {
  --bbva-type-link-with-icon-icon-color: var(--_form-filter-remove-filter-color);
}

.right-padding-fix:after {
  display: block;
  width: 1rem;
  content: "";
}

:host([hide-clear-label]) .filters [role=listitem]:nth-child(1) {
  display: none;
}
:host([hide-clear-label]) .filters [role=listitem]:nth-child(2) {
  margin-left: 0;
}

.remove-filter {
  padding: 0;
}

.gradient.left::before, .gradient.right::after {
  position: absolute;
  bottom: 0;
  left: 0;
  width: 1.875rem;
  height: 70%;
  background-image: linear-gradient(to right, var(--_form-filter-gradient-color) 0%, rgba(255, 255, 255, 0) 100%);
  content: "";
  pointer-events: none;
}
.gradient.right::after {
  right: 0;
  left: auto;
  transform: rotate(180deg);
}

:host([loading]) {
  overflow: hidden;
  width: 100%;
  height: 5.5rem;
  background-color: var(--_skeleton-default-bg-color);
  -webkit-mask-image: linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, black 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(black 100%, transparent 0), linear-gradient(black 100%, transparent 0), linear-gradient(black 100%, transparent 0);
  mask-image: linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, black 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(black 100%, transparent 0), linear-gradient(black 100%, transparent 0), linear-gradient(black 100%, transparent 0);
  -webkit-mask-position: 8px 10px, calc(100% - 16px) 10px, 8px 50px, 50px 42px, 132px 42px, 214px 42px;
  mask-position: 8px 10px, calc(100% - 16px) 10px, 8px 50px, 50px 42px, 132px 42px, 214px 42px;
  -webkit-mask-repeat: no-repeat;
  mask-repeat: no-repeat;
  -webkit-mask-size: calc((97px * 2) + (16px/ 2)) 16px, calc((52px * 2) + (16px/ 2)) 16px, calc((24px * 2) + (16px/ 2)) 16px, 75px 32px, 75px 32px, 75px 32px;
  mask-size: calc((97px * 2) + (16px/ 2)) 16px, calc((52px * 2) + (16px/ 2)) 16px, calc((24px * 2) + (16px/ 2)) 16px, 75px 32px, 75px 32px, 75px 32px;
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
`,u=e`
:host {
  --_form-filter-tag-bg-color: var(--bbva-form-filter--_ambient--tag-bg-color,
    var(--bbva-form-filter--custom--primary-ambient--tag-bg-color,
      ${s("colorPrimarySurfaceAlternativeDefault",b)}));
  --_form-filter-gradient-color: var(--bbva-form-filter--_ambient--gradient-color,
    var(--bbva-form-filter--custom--primary-ambient--gradient-color,
      ${s("colorPrimarySurfaceAmbientDefault",b)}));
  --_form-filter-remove-filter-color: var(--bbva-form-filter--_ambient--remove-filter-color,
    var(--bbva-form-filter--custom--primary-ambient--remove-filter-color,
      ${s("colorPrimaryText01Default",b)}));
}
`;const k=e`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-form-filter--_ambient--tag-bg-color: initial;
    --bbva-form-filter--_ambient--gradient-color: initial;
    --bbva-form-filter--_ambient--remove-filter-color: initial;
  }
`,x=e`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-form-filter--_ambient--tag-bg-color: var(
      --bbva-form-filter--custom--primary-alt-ambient--tag-bg-color,
      ${s("colorPrimaryAltSurfaceAlternativeDefault",b)}
    );

    --bbva-form-filter--_ambient--gradient-color: var(
      --bbva-form-filter--custom--primary-alt-ambient--gradient-color,
      ${s("colorPrimaryAltSurfaceAmbientDefault",b)}
    );

    --bbva-form-filter--_ambient--remove-filter-color: var(
      --bbva-form-filter--custom--primary-alt-ambient--remove-filter-color,
      ${s("colorPrimaryAltText01Default",b)}
    );
  }
`,_=e`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-form-filter--_ambient--tag-bg-color: var(
      --bbva-form-filter--custom--secondary-ambient--tag-bg-color,
      ${s("colorSecondarySurfaceAlternativeDefault",b)}
    );

    --bbva-form-filter--_ambient--gradient-color: var(
      --bbva-form-filter--custom--secondary-ambient--gradient-color,
      ${s("colorSecondarySurfaceAmbientDefault",b)}
    );

    --bbva-form-filter--_ambient--remove-filter-color: var(
      --bbva-form-filter--custom--secondary-ambient--remove-filter-color,
      ${s("colorSecondaryText01Default",b)}
    );
  }
`,S=e`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-form-filter--_ambient--tag-bg-color: var(
      --bbva-form-filter--custom--secondary-alt-ambient--tag-bg-color,
      ${s("colorSecondaryAltSurfaceAlternativeDefault",b)}
    );

    --bbva-form-filter--_ambient--gradient-color: var(
      --bbva-form-filter--custom--secondary-alt-ambient--gradient-color,
      ${s("colorSecondaryAltSurfaceAmbientDefault",b)}
    );

    --bbva-form-filter--_ambient--remove-filter-color: var(
      --bbva-form-filter--custom--secondary-alt-ambient--remove-filter-color,
      ${s("colorSecondaryAltText01Default",b)}
    );
  }
`;const $=c([Object.freeze({__proto__:null,primary:k,primaryAlt:x,secondary:_,secondaryAlt:S}),m,f,d]),w=Object.values($);class A extends(p(t(a))){static get is(){return"bbva-form-filter"}static get scopedElements(){return{"bbva-type-link":g,"bbva-type-text":v,"bbva-header-category":h}}static get properties(){return{filters:{type:Array},headerTitle:{type:String,attribute:"header-title"},editableLabel:{type:String,attribute:"editable-label"},accessibilityTextEditableLabel:{type:String,attribute:"accessibility-text-editable-label"},clearLabel:{type:String,attribute:"clear-label"},headingLevel:{type:Number,attribute:"heading-level"},iconSize:{type:Number,attribute:"icon-size"},hideClearLabel:{type:Boolean,attribute:"hide-clear-label",reflect:!0},_availableScroll:{type:String},_filters:{type:Object},loading:{type:Boolean,reflect:!0},linkHref:{type:String,attribute:"link-href"}}}constructor(){super(),this.filters=[],this.headerTitle="Activity",this.clearLabel="Clear all",this.editableLabel="bbva-form-filter-editable-label",this.headingLevel=2,this.iconSize=16,this.loading=!1,this.hideClearLabel=!1,this.accessibilityIconCloseLabel="bbva-form-filter-close-label"}firstUpdated(){super.firstUpdated&&super.firstUpdated(),this._filters=this.shadowRoot.querySelector('[data-id="filters"]'),this._onStepsScroll()}updated(e){super.updated&&super.updated(e),e.has("filters")&&(this._onStepsScroll(),this.requestUpdate())}static get styles(){return[y,r("bbva-form-filter-shared-styles"),u,w]}_clearClick(){this.dispatchEvent(new CustomEvent("form-filter-clear-click",{detail:!0,bubbles:!0,composed:!0}))}_closeClick(e){this.dispatchEvent(new CustomEvent("form-filter-close-click",{detail:e,bubbles:!0,composed:!0})),this._filters.focus()}get _scrollable(){return this._filters&&(this._filters.scrollHeight>this._filters.clientHeight||this._filters.scrollWidth>this._filters.clientWidth)}_onStepsScroll(){const{scrollLeft:e,scrollWidth:t,offsetWidth:a}=this._filters;this._availableScroll=0!==e?e+a>=t?"left":"left right":"right"}render(){return i`${this.loading?i``:i`
          <bbva-header-category
            variant="default"
            heading-Level="${this.headingLevel}"
            option-link="${this.t(this.editableLabel)}"
            link-accessibility-text="${l(this.accessibilityTextEditableLabel)}"
            text="${this.headerTitle}"
          >
          </bbva-header-category>

          <div
            role="list"
            class="filters"
            data-id="filters"
            @scroll="${this._onStepsScroll}"
            tabindex="${this._scrollable?"0":"-1"}"
          >
            <div role="listitem" class="tag-clear-all">
              <bbva-type-link
                id="clear-all-link"
                data-tag-name="bbva-type-link"
                size="S"
                @click="${this._clearClick}"
                href="${l(this.linkHref)}"
              >
                ${this.t(this.clearLabel)}
              </bbva-type-link>
            </div>
            ${this.filters.map(((e,t)=>i`
                  <div role="listitem" class="tag">
                    <bbva-type-text
                      text="${e.name}"
                      tag="span"
                      size="S"
                      ellipsis
                      id="filter-${t}"
                    ></bbva-type-text>
                    ${e.removable?i`<bbva-type-link
                          id="remove-filter-${t}"
                          class="remove-filter"
                          data-tag-name="bbva-type-link"
                          variant="icon secondary"
                          icon="${o()}"
                          aria-label="${this.t(this.accessibilityIconCloseLabel)}"
                          aria-describedby="filter-${t}"
                          icon-size="${this.iconSize}"
                          href="${l(this.linkHref)}"
                          @click="${()=>this._closeClick(t)}"
                        ></bbva-type-link>`:n}
                  </div>
                `))}
            ${this._scrollable?i` <div class="right-padding-fix"></div> `:n}
          </div>
          <div class="${this._scrollable?"gradient":""} ${this._availableScroll}"></div>
        `}`}}export{A as B,$ as b};
